package com.google.firebase.messaging;

import K4.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.l;
import java.util.concurrent.Executor;
import xa.C8971l;
import xa.C8974o;

/* renamed from: com.google.firebase.messaging.m  reason: case insensitive filesystem */
public class C9555m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f68465c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static n0 f68466d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f68467a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f68468b = new m();

    public C9555m(Context context) {
        this.f68467a = context;
    }

    private static C8971l<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        n0 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.d(intent).h(new m(), new C9554l());
        }
        if (X.b().e(context)) {
            i0.f(context, f10, intent);
        } else {
            f10.d(intent);
        }
        return C8974o.f(-1);
    }

    private static n0 f(Context context, String str) {
        n0 n0Var;
        synchronized (f68465c) {
            try {
                if (f68466d == null) {
                    f68466d = new n0(context, str);
                }
                n0Var = f68466d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n0Var;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer g(C8971l lVar) {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer i(C8971l lVar) {
        return 403;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8971l j(Context context, Intent intent, boolean z10, C8971l lVar) {
        return (!l.e() || ((Integer) lVar.m()).intValue() != 402) ? lVar : e(context, intent, z10).h(new m(), new C9553k());
    }

    public C8971l<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f68467a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public C8971l<Integer> l(Context context, Intent intent) {
        boolean z10 = false;
        boolean z11 = l.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        return (!z11 || z10) ? C8974o.c(this.f68468b, new C9551i(context, intent)).j(this.f68468b, new C9552j(context, intent, z10)) : e(context, intent, z10);
    }
}
