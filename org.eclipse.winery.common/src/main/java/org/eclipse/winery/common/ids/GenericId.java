/*******************************************************************************
 * Copyright (c) 2013 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Oliver Kopp - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.common.ids;

import java.util.Objects;

import org.eclipse.winery.common.Util;

/**
 * Superclass for all IDs appearing in Winery. These are:
 * <ul>
 * <li>All IDs of elements directly nested in a Definitions element</li>
 * <li>Subelements of those</li>
 * </ul>
 *
 * We assume that DefinitionsChildId is always the root node of nested IDs
 *
 */
public abstract class GenericId implements Comparable<GenericId> {

	private final XmlId xmlId;


	protected GenericId(XmlId xmlId) {
		this.xmlId = Objects.requireNonNull(xmlId);
	}

	/**
	 * @return null if (this instanceof DefinitionsChildId). In that case, the
	 *         element is already the root element
	 */
	public abstract GenericId getParent();

	/**
	 * @return the XML id of this thing
	 */
	public XmlId getXmlId() {
		return this.xmlId;
	}

	@Override
	public String toString() {
		String idName = Util.getEverythingBetweenTheLastDotAndBeforeId(this.getClass());
		return idName + " / " + this.getXmlId().toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GenericId)) return false;

		GenericId genericId = (GenericId) o;

		return xmlId.equals(genericId.xmlId);
	}

	@Override
	public int hashCode() {
		return xmlId.hashCode();
	}
}
