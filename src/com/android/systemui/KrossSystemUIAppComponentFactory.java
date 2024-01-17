
package com.android.systemui;

import android.content.Context;


public class KrossSystemUIAppComponentFactory extends SystemUIAppComponentFactoryBase {
    @Override
    protected SystemUIInitializer createSystemUIInitializer(Context context) {
        return new KrossSystemUIInitializer(context);
    }
}