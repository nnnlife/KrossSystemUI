
package com.android.systemui;

import android.content.Context;
import com.android.systemui.SystemUIInitializer;
import com.android.systemui.SystemUIAppComponentFactoryBase;


public class KrossSystemUIAppComponentFactory extends SystemUIAppComponentFactoryBase {
    @Override
    protected SystemUIInitializer createSystemUIInitializer(Context context) {
        return new KrossSystemUIInitializer(context);
    }
}