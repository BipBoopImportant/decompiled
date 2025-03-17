package com.google.android.gms.internal.measurement;

import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.p0  reason: case insensitive filesystem */
final class C7378p0 implements C7362n0 {
    C7378p0() {
    }

    public final /* synthetic */ String a(String str, C7401s0 s0Var) {
        return d(str, s0Var, C7386q0.RAW_FILE_IO_TYPE);
    }

    public final /* synthetic */ String b(File file, String str, C7401s0 s0Var) {
        return a(new File(file, str).getPath(), s0Var);
    }

    public final /* synthetic */ String c(File file, String str) {
        return b(file, str, C7401s0.f49060a);
    }

    public final /* synthetic */ String d(String str, C7401s0 s0Var, C7386q0 q0Var) {
        return C7353m0.a(this, str, s0Var, q0Var);
    }

    public final String e(String str, C7401s0 s0Var, C7386q0 q0Var) {
        return str;
    }

    public final /* synthetic */ String zza(String str) {
        return a(str, C7401s0.f49060a);
    }
}
