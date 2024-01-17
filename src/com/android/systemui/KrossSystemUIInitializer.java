package com.android.systemui;

import android.content.Context;
import android.os.SystemProperties;

import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.WMComponent;


public class KrossSystemUIInitializer extends SystemUIInitializer {
    public KrossSystemUIInitializer(Context context) {
        super(context);
    }

    @Override
    public GlobalRootComponent.Builder getGlobalRootComponentBuilder() {
        return DaggerKrossGlobalRootComponent.builder();
    }
}