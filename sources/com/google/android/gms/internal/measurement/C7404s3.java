package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.s3  reason: case insensitive filesystem */
public final /* synthetic */ class C7404s3 {
    public static <V> V a(C7396r3<V> r3Var) {
        long clearCallingIdentity;
        try {
            return r3Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = r3Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
    }
}
