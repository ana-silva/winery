/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package org.eclipse.winery.repository.rest.resources.entitytypes.policytypes;


import org.eclipse.winery.repository.rest.resources.AbstractResourceTest;

import org.junit.Test;

public class TemplatesOfOnePolicyTypeResourceTest extends AbstractResourceTest {
	
	@Test
	public void getTemplatesOfPolicyType() throws Exception{
		this.setRevisionTo("88e5ccd6c35aeffdebc19c8dda9cd76f432538f8");
		this.assertGet("policytypes/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fpolicytypes%252Ffruits/european/templates/","entitytypes/policytypes/templates_of_european_policytype.json");
	}
}
