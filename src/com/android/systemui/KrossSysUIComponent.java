package com.android.systemui;

import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIModule;

import dagger.BindsInstance;
import dagger.Subcomponent;
import android.annotation.Nullable;

@SysUISingleton
@Subcomponent(modules = {
    DependencyProvider.class,
    SystemUIModule.class
})
public interface KrossSysUIComponent extends SysUIComponent {
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder { 
        KrossSysUIComponent build();
    }   
}
