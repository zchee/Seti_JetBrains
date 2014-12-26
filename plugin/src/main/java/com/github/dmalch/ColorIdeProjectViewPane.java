package com.github.dmalch;

import com.intellij.ide.projectView.impl.ProjectViewPane;
import com.intellij.ide.projectView.impl.ProjectViewTree;
import com.intellij.openapi.editor.colors.ColorKey;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class ColorIdeProjectViewPane extends ProjectViewPane {

    public static final String COLOR_IDE_PROJECT_VIEW_PANE = "ColorIdeProjectViewPane";

    public ColorIdeProjectViewPane(Project project) {
        super(project);
    }

    @NotNull
    @Override
    public String getId() {
        return COLOR_IDE_PROJECT_VIEW_PANE;
    }

    @Override
    protected ProjectViewTree createTree(final DefaultTreeModel treeModel) {
        final ProjectViewTree tree = super.createTree(treeModel);

        return (ProjectViewTree) colorizeTree(tree);
    }

    public static JTree colorizeTree(final JTree tree) {
        final EditorColorsScheme globalScheme = EditorColorsManager.getInstance().getGlobalScheme();

        tree.setBackground(globalScheme.getColor(ColorKey.find("NOTIFICATION_BACKGROUND")));
        tree.setForeground(globalScheme.getDefaultForeground());
        return tree;
    }
}
