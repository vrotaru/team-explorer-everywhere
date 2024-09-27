// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.framework.help;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class ContextSensitiveHelp {

    public synchronized static void setHelp(final Control control, final String contextId) {
        try {
            final IWorkbench workbench = PlatformUI.getWorkbench();
            workbench.getHelpSystem().setHelp(control, contextId);

        } catch (final Throwable t) {
            // TODO: Complain I guess
        }
    }
    
}
