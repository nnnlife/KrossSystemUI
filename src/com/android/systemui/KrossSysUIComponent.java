package com.android.systemui;

import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIModule;
import com.android.systemui.dagger.DefaultActivityBinder;
import com.android.systemui.dagger.DefaultBroadcastReceiverBinder;
import com.android.systemui.dagger.DefaultServiceBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.keyguard.dagger.KeyguardModule;
import com.android.systemui.recents.RecentsModule;
import com.android.systemui.statusbar.dagger.CentralSurfacesModule;
import com.android.systemui.statusbar.NotificationInsetsModule;
import com.android.systemui.statusbar.QsFrameTranslateModule;


import dagger.BindsInstance;
import dagger.Subcomponent;
import android.annotation.Nullable;

@SysUISingleton
@Subcomponent(modules = {
    DependencyProvider.class,
    SystemUIModule.class,
    DefaultActivityBinder.class,
    DefaultBroadcastReceiverBinder.class,
    DefaultServiceBinder.class,
    KrossSystemUICoreStartableModule.class,
    KeyguardModule.class,
    RecentsModule.class,
    CentralSurfacesModule.class,
    NotificationInsetsModule.class,
    QsFrameTranslateModule.class,
    KrossUIModule.class})
public interface KrossSysUIComponent extends SysUIComponent {
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder { 
        KrossSysUIComponent build();
    }   
}
