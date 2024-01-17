package com.android.systemui;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {GlobalModule.class})
public interface KrossGlobalRootComponent extends GlobalRootComponent {
    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        KrossGlobalRootComponent build();
    }

    @Override
    KrossSysUIComponent.Builder getSysUIComponent();
}

