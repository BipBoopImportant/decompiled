package com.contentsquare.android.sdk;

import E8.c;
import a9.C6783a1;
import a9.C6908p6;
import a9.C6913q3;
import a9.O0;
import a9.O1;
import a9.X3;
import android.app.Activity;
import com.contentsquare.android.sdk.C0;
import com.contentsquare.android.sdk.C7148r0;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;

public final class J0 implements C0.a {

    /* renamed from: a  reason: collision with root package name */
    public final O0 f47014a;

    /* renamed from: b  reason: collision with root package name */
    public final C6783a1 f47015b;

    /* renamed from: c  reason: collision with root package name */
    public final c f47016c;

    /* renamed from: d  reason: collision with root package name */
    public final F0 f47017d;

    /* renamed from: e  reason: collision with root package name */
    public C7148r0.a f47018e;

    public J0(O0 o02, O0 o03, C7133k kVar, C6908p6 p6Var, C6783a1 a1Var, c cVar) {
        C0 c02 = C0.f46933a;
        C17542s.j(o02, "pathGenerator");
        C17542s.j(o03, "analyticsPipeline");
        C17542s.j(c02, "screenViewEventsHandler");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(a1Var, "liveActivityProvider");
        C17542s.j(cVar, "preferencesStore");
        this.f47014a = o03;
        this.f47015b = a1Var;
        this.f47016c = cVar;
        D8.c cVar2 = new D8.c("ScreenView");
        C0.f46935c = this;
        this.f47017d = new F0(o02, p6Var, kVar, this, cVar2);
    }

    public final void a(ConcurrentLinkedQueue concurrentLinkedQueue) {
        C17542s.j(concurrentLinkedQueue, "queue");
        if (this.f47015b.f42433a.get() != null) {
            b(concurrentLinkedQueue);
        }
    }

    public final void b(ConcurrentLinkedQueue concurrentLinkedQueue) {
        C17542s.j(concurrentLinkedQueue, "queue");
        Activity activity = this.f47015b.f42433a.get();
        if (activity != null) {
            while (true) {
                C6913q3 q3Var = (C6913q3) concurrentLinkedQueue.poll();
                if (q3Var != null) {
                    C17542s.i(q3Var, "queue.poll() ?: break");
                    F0 f02 = this.f47017d;
                    String str = q3Var.f42809a;
                    C8537a[] aVarArr = q3Var.f42810b;
                    boolean z10 = q3Var.f42811c;
                    Long l10 = q3Var.f42812d;
                    f02.getClass();
                    C17542s.j(activity, "activity");
                    C17542s.j(str, "screenTitle");
                    C17542s.j(aVarArr, "customVars");
                    f02.c(activity, new X3(activity, str, f02.f42651a), new O1(activity, str, 2), str, aVarArr, z10, l10);
                } else {
                    return;
                }
            }
        }
    }
}
