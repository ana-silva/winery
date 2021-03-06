/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.eclipse.winery.repository.rest.resources.entitytypes.artifacttypes;

import org.eclipse.winery.repository.rest.resources.AbstractResourceTest;

import org.junit.Test;

public class TemplatesOfOneArtifactTypeResourceTest extends AbstractResourceTest {

	@Test
	public void getTemplatesOfArtifactType() throws Exception {
		this.setRevisionTo("6aabc1c52ad74ab2692e7d59dbe22a263667e2c9");
		this.assertGet("artifacttypes/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttypes%252Ffruits/JAR/templates/",
			"entitytypes/artifacttypes/templates_of_jar_artifact_type.json");
	}
}
