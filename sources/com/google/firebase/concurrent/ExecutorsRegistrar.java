package com.google.firebase.concurrent;

import Kb.C9128c;
import Kb.E;
import Kb.w;
import Lb.a;
import Lb.b;
import Lb.c;
import Lb.d;
import Lb.e;
import Lb.f;
import Lb.g;
import Lb.h;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final w<ScheduledExecutorService> f68173a = new w<>(new a());

    /* renamed from: b  reason: collision with root package name */
    static final w<ScheduledExecutorService> f68174b = new w<>(new b());

    /* renamed from: c  reason: collision with root package name */
    static final w<ScheduledExecutorService> f68175c = new w<>(new c());

    /* renamed from: d  reason: collision with root package name */
    static final w<ScheduledExecutorService> f68176d = new w<>(new d());

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, (StrictMode.ThreadPolicy) null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f68176d.get());
    }

    public List<C9128c<?>> getComponents() {
        Class<Jb.a> cls = Jb.a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        Class<Jb.b> cls5 = Jb.b.class;
        Class<Jb.c> cls6 = Jb.c.class;
        return Arrays.asList(new C9128c[]{C9128c.d(E.a(cls, cls2), E.a(cls, cls3), E.a(cls, cls4)).f(new e()).d(), C9128c.d(E.a(cls5, cls2), E.a(cls5, cls3), E.a(cls5, cls4)).f(new f()).d(), C9128c.d(E.a(cls6, cls2), E.a(cls6, cls3), E.a(cls6, cls4)).f(new g()).d(), C9128c.c(E.a(Jb.d.class, cls4)).f(new h()).d()});
    }
}
