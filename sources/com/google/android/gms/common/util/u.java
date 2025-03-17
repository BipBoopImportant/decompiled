package com.google.android.gms.common.util;

import android.os.StrictMode;

final class u {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
