/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Armin Hüneburg - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.repository;

/**
 * Class for handling information of Git repositories.
 */
public class GitInfo {
	/**
	 * The URL of the git repository
	 */
	public final String URL;
	/**
	 * The branch or tag that should be pulled from the repository
	 */
	public final String BRANCH;

	/**
	 * Constructs a new pair of values.
	 * @param url The URL of the git repository
	 * @param branch The branch or tag that should be pulled from the repository
	 */
	public GitInfo(String url, String branch) {
		this.URL = url;
		this.BRANCH = branch;
	}
}
