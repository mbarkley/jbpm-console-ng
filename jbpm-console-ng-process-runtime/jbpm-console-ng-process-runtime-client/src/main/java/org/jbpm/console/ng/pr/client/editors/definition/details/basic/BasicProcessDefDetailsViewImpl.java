/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.console.ng.pr.client.editors.definition.details.basic;

import javax.enterprise.context.Dependent;

import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.jbpm.console.ng.pr.client.editors.definition.details.BaseProcessDefDetailsViewImpl;
import org.jbpm.console.ng.pr.client.i18n.Constants;

import com.google.gwt.core.client.GWT;

@Dependent
@Templated(value = "BasicProcessDefDetailsViewImpl.html")
public class BasicProcessDefDetailsViewImpl extends BaseProcessDefDetailsViewImpl implements
        BasicProcessDefDetailsPresenter.BasicProcessDefDetailsView {

    private Constants constants = GWT.create( Constants.class );

    @Override
    public void init() {
        processIdLabel.setText( constants.Process_Definition_Id() );
        processNameLabel.setText( constants.Process_Definition_Name() );
        deploymentIdLabel.setText( constants.Deployment_Name() );
    }

}
