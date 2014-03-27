<%--
/*******************************************************************************
 * Copyright (c) 2012-2013 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v10.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    Oliver Kopp - initial API and implementation and/or initial documentation
 *    Yves Schubert - switch to bootstrap 3
 *******************************************************************************/
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:colorpickerloading color="${it.borderColor}" elementId="bordercolor" url="bordercolor">
</t:colorpickerloading>

<script>
<%-- Required for multiple upload dialogs
	see https://github.com/blueimp/jQuery-File-Upload/wiki/Options --%>
$(document).bind('drop dragover', function (e) {
	e.preventDefault();
});

<%-- colorPicker --%>
jQuery(document).ready(function($) {
	$('#bordercolor').ColorPicker({
		onChange : function() {
			putColor('bordercolor');
		}
	});
});
</script>

<ul class="nav nav-tabs" id="myTab">
	<li class="active"><a href="#icons">Icons</a></li>
	<li><a href="#color">Color</a></li>
</ul>

<div class="tab-content">

	<div class="tab-pane active" id="icons">
		<br />
		<t:imageUpload
			label="Icon (16x16) used in palette"
			URL="visualappearance/16x16"
			id="upSmall"
			width="16px"
			resize="16"
			accept="image/*"/>

		<t:imageUpload
			label="Icon (50x50) used in the node template shapes"
			URL="visualappearance/50x50"
			id="upBig"
			width="50px"
			resize="50"
			accept="image/*"/>
	</div>

	<div class="tab-pane" id="color">
		<br />
		<form>
			<fieldset>
				<div class="form-group">
					<label for="bordercolorDiv">Border Color</label>
					<div id="bordercolorDiv" style="width:100%">
						<div id="bordercolor" class="colorpickerdiv" style="background-color: ${it.borderColor}"></div>
					</div>
				</div>
			</fieldset>
		</form>
	</div>

</div>

<script>
$('#myTab a').click(function (e) {
	e.preventDefault();
	$(this).tab('show');
});
</script>
