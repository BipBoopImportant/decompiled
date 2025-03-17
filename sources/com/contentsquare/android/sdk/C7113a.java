package com.contentsquare.android.sdk;

import D8.c;
import E8.b;
import H2.a;
import a9.C6781a;
import a9.C6799c1;
import a9.C6976y3;
import a9.H1;
import a9.U6;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.O;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.sdk.C7131j;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u8.C8886a;

/* renamed from: com.contentsquare.android.sdk.a  reason: case insensitive filesystem */
public final class C7113a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f47274a = new c((String) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f47275b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f47276c;

    public static void a() {
        if (f47275b && f47276c) {
            synchronized (U6.f42329a) {
                while (true) {
                    try {
                        LinkedBlockingQueue linkedBlockingQueue = U6.f42332d;
                        if (!linkedBlockingQueue.isEmpty()) {
                            a aVar = (a) linkedBlockingQueue.remove();
                            C17542s.i(aVar, "consumer");
                            X8.c c10 = X8.c.c();
                            if (c10 != null) {
                                C6799c1 f10 = c10.f();
                                C17542s.i(f10, "runtimeModule.runTime");
                                U6.b(aVar, f10);
                            } else {
                                U6.f42333e.k("Contentsquare SDK: Unable to call the public API, make sure you are not opted out of the Contentsquare tracker and SDK was correctly initialized.");
                            }
                        } else {
                            U6.f42330b = true;
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public static final void b(Context context) {
        C17542s.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                C8886a b10 = C8886a.f56874d.b(applicationContext);
                U8.a aVar = U8.a.f40370a;
                aVar.k((Application) applicationContext);
                c cVar = C7136l0.f47493a;
                if (X8.c.c() != null) {
                    f47274a.j("Contentsquare SDK is already initialized.");
                    a();
                    return;
                }
                aVar.m("sdk_initialize");
                ContentsquareModule.c(applicationContext);
                b10.f().h(b.FORGET_ME, false);
                b10.f().h(b.PAUSE_TRACKING, false);
                C7131j jVar = C7131j.f47442k;
                C7131j.a.c((Application) applicationContext, b10);
                C7136l0.a(applicationContext, O.f22160i.a(), new C6781a());
                C6976y3.b(applicationContext);
                aVar.n("sdk_initialize");
                if (!f47275b) {
                    f47275b = true;
                    a();
                }
            } catch (Exception e10) {
                c cVar2 = f47274a;
                cVar2.j("Something went wrong, Contentsquare SDK couldn't be initialized. " + e10);
                H1.a(cVar2, "Failed to initialize Contentsquare SDK.", e10);
            }
        } else {
            f47274a.j("Could not initialize Contentsquare SDK because application context is null.");
        }
    }

    public static final void c() {
        if (!f47276c) {
            f47276c = true;
            a();
        }
    }
}
