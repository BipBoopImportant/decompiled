package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import jb.l;

public final class A0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Boolean> f48529a = new C7457z0();

    public static SharedPreferences a(Context context, String str, int i10, C7401s0 s0Var) {
        C7425v0 v0Var = C7335k0.a().d(str, s0Var, C7386q0.zzc).equals("") ? new C7425v0() : null;
        if (v0Var != null) {
            return v0Var;
        }
        ThreadLocal<Boolean> threadLocal = f48529a;
        l.d(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f48529a.set(Boolean.TRUE);
            throw th2;
        }
    }
}
