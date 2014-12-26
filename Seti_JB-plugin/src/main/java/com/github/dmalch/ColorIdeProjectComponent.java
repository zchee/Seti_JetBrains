package com.github.dmalch;

import com.intellij.ide.projectView.ProjectView;
import com.intellij.ide.projectView.impl.AbstractProjectViewPane;
import com.intellij.ide.projectView.impl.ProjectViewPane;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.extensions.ExtensionPoint;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.extensions.ExtensionsArea;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class ColorIdeProjectComponent implements ProjectComponent {
    private Project project;

    public ColorIdeProjectComponent(Project project) {
        this.project = project;
    }

    @Override
    public void initComponent() {
    }

    @Override
    public void disposeComponent() {
    }

    @NotNull
    public String getComponentName() {
        return "ColorIdeProjectComponent";
    }

    @Override
    public void projectOpened() {
        replaceStandardProjectViewWithColored();
    }

    private void replaceStandardProjectViewWithColored() {
        final ExtensionsArea area = Extensions.getArea(project);
        final ExtensionPoint<AbstractProjectViewPane> extensionPoint = area.getExtensionPoint(AbstractProjectViewPane.EP_NAME);

        for (AbstractProjectViewPane extension : extensionPoint.getExtensions()) {
            if ((extension instanceof ProjectViewPane) && !(extension instanceof ColorIdeProjectViewPane)) {
                extensionPoint.unregisterExtension(extension);
            }
        }

        removeStandardProjectViewPaneIfExists();
    }

    private void removeStandardProjectViewPaneIfExists() {
        final AbstractProjectViewPane projectViewPane = ProjectView.getInstance(project).getProjectViewPaneById(ProjectViewPane.ID);
        if (projectViewPane != null) {
            ProjectView.getInstance(project).removeProjectPane(projectViewPane);
        }
    }

    @Override
    public void projectClosed() {
    }
}
