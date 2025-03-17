package com.contentsquare.android.sdk;

import A8.a;
import D8.c;
import X8.b;
import Z8.a;
import a9.P;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C5221y;
import b8.i;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.l0  reason: case insensitive filesystem */
public final class C7136l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f47493a = new c("SingletonProvider");

    public static void a(Context context, C5221y yVar, a aVar) {
        if (X8.c.c() == null) {
            Application application = (Application) context.getApplicationContext();
            if (X8.c.c() == null) {
                synchronized (i.class) {
                    try {
                        if (X8.c.c() == null) {
                            b j10 = b.j(application);
                            c cVar = f47493a;
                            cVar.f("Initializing the Runtime...");
                            X8.c d10 = X8.c.d(application);
                            cVar.k("Contentsquare SDK 4.36.0 starting in app: " + application.getPackageName());
                            t1 l10 = j10.l();
                            l10.f47637e = d10.e();
                            l10.a();
                            d10.a().g(aVar);
                            P.a();
                            cVar.f("CsRuntimeModule SDK singleton is now initialized.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C17542s.j(application, "application");
            C17542s.j(yVar, "lifecycleOwner");
            new Z8.b(new a.C0729a(application), yVar);
        }
    }
}
