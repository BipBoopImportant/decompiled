package com.contentsquare.android.internal.features.initialize;

import D8.c;
import D8.d;
import a9.C6783a1;
import a9.C6946u5;
import a9.Z;
import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public class ContentsquareModule {

    /* renamed from: a  reason: collision with root package name */
    public static c f46834a = new c("ContentsquareModule");

    /* renamed from: b  reason: collision with root package name */
    public static ContentsquareModule f46835b;
    private static C6946u5 sCaptureTouchEvent;
    private static C6783a1 sLiveActivityProvider;
    private static d sLoggerLevelChooser;
    private static Z sSessionReplayProperties;

    public ContentsquareModule(Context context) {
        C8886a g10 = C8886a.g(context);
        C17542s.j(context, "context");
        C6783a1 a1Var = C6783a1.f42432b;
        if (a1Var == null) {
            Context applicationContext = context.getApplicationContext();
            C17542s.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            a1Var = new C6783a1((Application) applicationContext);
            C6783a1.f42432b = a1Var;
        }
        sLiveActivityProvider = a1Var;
        sCaptureTouchEvent = new C6946u5();
        sLoggerLevelChooser = new d(new d.a(), g10.f(), context);
        sSessionReplayProperties = new Z(g10.c(), g10.f());
    }

    public static ContentsquareModule b() {
        return f46835b;
    }

    public static ContentsquareModule c(Context context) {
        if (f46835b == null) {
            f46835b = new ContentsquareModule(context);
            f46834a.f("ContentsquareModule singleton is now initialized.");
        }
        return f46835b;
    }

    public C6946u5 a() {
        return sCaptureTouchEvent;
    }

    public C6783a1 d() {
        return sLiveActivityProvider;
    }

    public Z e() {
        return sSessionReplayProperties;
    }
}
