/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Lukas Harzentter - initial API and implementation
 *******************************************************************************/

package org.eclipse.winery.repository.rest.resources.apiData;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.winery.common.ids.definitions.DefinitionsChildId;
import org.eclipse.winery.repository.backend.RepositoryFactory;
import org.eclipse.winery.repository.rest.resources.AbstractComponentInstanceResourceWithNameDerivedFromAbstractFinal;

public class AvailableSuperclassesApiData {

	public List<NameAndQNameApiData> classes;

	public AvailableSuperclassesApiData(AbstractComponentInstanceResourceWithNameDerivedFromAbstractFinal res) {
		this.generateList(res.getId().getClass(), res.getId());
	}

	public AvailableSuperclassesApiData(Class<? extends DefinitionsChildId> clazz) {
		this.generateList(clazz, null);
	}

	private void generateList(Class<? extends DefinitionsChildId> clazz, DefinitionsChildId classToExclude) {
		SortedSet<? extends DefinitionsChildId> allDefinitionsChildIds = RepositoryFactory.getRepository().getAllDefinitionsChildIds(clazz);
		if (classToExclude != null) {
			allDefinitionsChildIds.remove(classToExclude);
		}
		this.classes = new ArrayList<>();
		for (DefinitionsChildId id : allDefinitionsChildIds) {
			NameAndQNameApiData q = new NameAndQNameApiData(id);
			this.classes.add(q);
		}
	}
}
