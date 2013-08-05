/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.ht.client.editors.taskdetailsmulti;


import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import java.util.Set;
import org.drools.core.command.runtime.GetKnowledgeBaseCommand;
import org.jbpm.console.ng.ht.client.i18n.Constants;
import org.uberfire.client.annotations.WorkbenchMenu;
import org.uberfire.lifecycle.OnOpen;
import org.uberfire.lifecycle.OnStartup;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;
import org.uberfire.client.mvp.AbstractWorkbenchScreenActivity;
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ActivityManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.UberView;
import org.uberfire.mvp.Command;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.DefaultPlaceRequest;
import org.uberfire.security.Identity;
import org.uberfire.workbench.model.menu.MenuFactory;
import org.uberfire.workbench.model.menu.Menus;

@Dependent
@WorkbenchScreen(identifier = "Task Details Multi")
public class TaskDetailsMultiPresenter {

    private Constants constants = GWT.create( Constants.class );

    @Inject
    private ActivityManager activityManager;
    
    @Inject
    private PlaceManager placeManager;
    
    private long selectedTaskId = 0;

    public interface TaskDetailsMultiView extends UberView<TaskDetailsMultiPresenter> {
        void displayNotification( String text );

        Label getTaskIdText();

        Label getTaskNameText();
        
        HTMLPanel getContent();
    }

    @Inject
    Identity identity;
    
    @Inject
    public TaskDetailsMultiView view;

    private Menus menus;

    private PlaceRequest place;

    public TaskDetailsMultiPresenter() {
        makeMenuBar();
    }

    
    @WorkbenchPartView
    public UberView<TaskDetailsMultiPresenter> getView() {
        return view;
    }
    
    @OnStartup
    public void onStartup( final PlaceRequest place ) {
        this.place = place;
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return constants.Details();
    }


    @OnOpen
    public void onOpen() {
        selectedTaskId = Long.parseLong( place.getParameter( "taskId", "0" ).toString() );
        view.getTaskIdText().setText( String.valueOf( selectedTaskId ) );
        
    }
    
    @WorkbenchMenu
    public Menus getMenus() {
        return menus;
    }
    
    private void makeMenuBar() {
        menus = MenuFactory
                .newTopLevelMenu( constants.Work())
                .respondsWith( new Command() {
                    @Override
                    public void execute() {
                        String placeToGo = "Task Comments";
                        
                        DefaultPlaceRequest defaultPlaceRequest = new DefaultPlaceRequest(placeToGo);
                        //Set Parameters here: 
                        defaultPlaceRequest.addParameter("taskId", String.valueOf(selectedTaskId));
                        
                        Set<Activity> activities = activityManager.getActivities(defaultPlaceRequest);
                        AbstractWorkbenchScreenActivity activity = ((AbstractWorkbenchScreenActivity)activities.iterator().next());
                        IsWidget widget = activity.getWidget();
                        view.getContent().add(widget);
                       
                    }
                } )
                .endMenu()
                .newTopLevelMenu( constants.Details())
                .respondsWith( new Command() {
                    @Override
                    public void execute() {
                        String placeToGo = "Task Comments";
                        
                        DefaultPlaceRequest defaultPlaceRequest = new DefaultPlaceRequest(placeToGo);
                        //Set Parameters here: 
                        defaultPlaceRequest.addParameter("taskId", String.valueOf(selectedTaskId));
                        
                        Set<Activity> activities = activityManager.getActivities(defaultPlaceRequest);
                        AbstractWorkbenchScreenActivity activity = ((AbstractWorkbenchScreenActivity)activities.iterator().next());
                        IsWidget widget = activity.getWidget();
                        view.getContent().add(widget);
                       
                    }
                } )
                .endMenu()
                .newTopLevelMenu( constants.Assignments())
                .respondsWith( new Command() {
                    @Override
                    public void execute() {
                        String placeToGo = "Task Comments";
                        
                        DefaultPlaceRequest defaultPlaceRequest = new DefaultPlaceRequest(placeToGo);
                        //Set Parameters here: 
                        defaultPlaceRequest.addParameter("taskId", String.valueOf(selectedTaskId));
                        
                        Set<Activity> activities = activityManager.getActivities(defaultPlaceRequest);
                        AbstractWorkbenchScreenActivity activity = ((AbstractWorkbenchScreenActivity)activities.iterator().next());
                        IsWidget widget = activity.getWidget();
                        view.getContent().add(widget);
                       
                    }
                } )
                .endMenu()
                .newTopLevelMenu( constants.Comments())
                .respondsWith( new Command() {
                    @Override
                    public void execute() {
                        String placeToGo = "Task Comments";
                        
                        DefaultPlaceRequest defaultPlaceRequest = new DefaultPlaceRequest(placeToGo);
                        //Set Parameters here: 
                        defaultPlaceRequest.addParameter("taskId", String.valueOf(selectedTaskId));
                        
                        Set<Activity> activities = activityManager.getActivities(defaultPlaceRequest);
                        AbstractWorkbenchScreenActivity activity = ((AbstractWorkbenchScreenActivity)activities.iterator().next());
                        IsWidget widget = activity.getWidget();
                        view.getContent().add(widget);
                       
                    }
                } )
                .endMenu()
                .build();

    }
    

   
}