// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.framework.action.keybinding;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class ActionKeyBindingSupportFactory {
    public static ActionKeyBindingSupport newInstance(final Shell shell) {
        final IWorkbench workbench = PlatformUI.getWorkbench();
        return new ModernActionKeyBindingSupport(workbench, shell);
    }

    public static ActionKeyBindingSupport newInstance(final IWorkbenchPart part) {
        final IWorkbench workbench = PlatformUI.getWorkbench();
        return new ModernActionKeyBindingSupport(workbench, part);
    }
}
