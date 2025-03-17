package com.contentsquare.android.sdk;

import E8.b;
import a9.C6913q3;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f46933a = new C0();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentLinkedQueue f46934b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public static a f46935c;

    public interface a {
        void a(ConcurrentLinkedQueue concurrentLinkedQueue);
    }

    public static void a(C6913q3 q3Var) {
        C17542s.j(q3Var, "screenView");
        C8886a a10 = C8886a.f56874d.a();
        if (a10 != null && a10.f().b(b.TRACKING_ENABLE, false) && !a10.f().b(b.PAUSE_TRACKING, false)) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f46934b;
            concurrentLinkedQueue.add(q3Var);
            a aVar = f46935c;
            if (aVar != null) {
                aVar.a(concurrentLinkedQueue);
            }
        }
    }
}
