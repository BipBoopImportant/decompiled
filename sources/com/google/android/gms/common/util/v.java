package com.google.android.gms.common.util;

import android.os.StrictMode;

public final class v {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (l.i()) {
            StrictMode.setVmPolicy(u.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
