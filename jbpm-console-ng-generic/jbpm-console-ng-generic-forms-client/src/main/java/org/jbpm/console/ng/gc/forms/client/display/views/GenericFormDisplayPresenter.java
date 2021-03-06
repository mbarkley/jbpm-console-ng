/*
 * Copyright 2014 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.console.ng.gc.forms.client.display.views;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.IsWidget;
import org.jboss.errai.common.client.api.Caller;
import org.jbpm.console.ng.ga.forms.display.view.FormDisplayerView;
import org.jbpm.console.ng.ga.forms.service.FormServiceEntryPoint;
import org.uberfire.mvp.Command;

/**
 * @author salaboy
 */
@ApplicationScoped
public class GenericFormDisplayPresenter {

    @Inject
    private GenericFormDisplayView view;

    @Inject
    private Caller<FormServiceEntryPoint> formServices;

  
    public interface GenericFormDisplayView extends IsWidget {

        FormDisplayerView getDisplayerView();

        void displayNotification(final String text);
    }

    @PostConstruct
    public void init() {
    }

    public void setup( final long currentTaskId,
                       final String currentProcessId,
                       final String currentDeploymentId,
                       final String opener,
                       final Command onClose ) {

        view.getDisplayerView().setOnCloseCommand(onClose);

       
    }


    public IsWidget getView() {
        return view;
    }

}