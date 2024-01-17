package com.android.systemui.wmshell;


import com.android.systemui.dagger.WMComponent;
import com.android.wm.shell.dagger.WMSingleton;

import dagger.Subcomponent;


@WMSingleton
@Subcomponent(modules = {KrossWMShellModule.class})
public interface KrossWMComponent extends WMComponent {
    @Subcomponent.Builder
    interface Builder extends WMComponent.Builder {
        KrossWMComponent build();
    }
}
