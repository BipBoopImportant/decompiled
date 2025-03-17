package com.contentsquare.android.sdk;

import D8.c;
import F8.g;
import G8.d;
import a9.C6783a1;
import a9.C6785a3;
import a9.C6792b2;
import a9.C6806d0;
import a9.C6824f2;
import a9.C6842h4;
import a9.C6846i0;
import a9.C6852i6;
import a9.C6863k1;
import a9.C6868k6;
import a9.C6869l;
import a9.C6878m0;
import a9.C6880m2;
import a9.C6888n2;
import a9.C6894o0;
import a9.C6899o5;
import a9.C6900o6;
import a9.C6902p0;
import a9.C6916q6;
import a9.C6933t0;
import a9.C6941u0;
import a9.C6943u2;
import a9.C6954v5;
import a9.C6963w6;
import a9.C6965x0;
import a9.C6968x3;
import a9.C6971x6;
import a9.C6974y1;
import a9.C6978y5;
import a9.C6985z4;
import a9.E;
import a9.F2;
import a9.F5;
import a9.G0;
import a9.H1;
import a9.H6;
import a9.I5;
import a9.I6;
import a9.K;
import a9.K6;
import a9.N3;
import a9.N5;
import a9.P5;
import a9.V1;
import a9.r;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.O;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import java.util.List;
import k8.C8465a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u8.C8886a;

/* renamed from: com.contentsquare.android.sdk.j  reason: case insensitive filesystem */
public final class C7131j {

    /* renamed from: k  reason: collision with root package name */
    public static C7131j f47442k;

    /* renamed from: l  reason: collision with root package name */
    public static final C6785a3 f47443l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f47444m = new c("SessionReplay");

    /* renamed from: n  reason: collision with root package name */
    public static H2.a<String> f47445n;

    /* renamed from: o  reason: collision with root package name */
    public static E f47446o;

    /* renamed from: a  reason: collision with root package name */
    public final C6899o5 f47447a;

    /* renamed from: b  reason: collision with root package name */
    public final C6869l f47448b;

    /* renamed from: c  reason: collision with root package name */
    public final C6880m2 f47449c;

    /* renamed from: d  reason: collision with root package name */
    public final C6894o0 f47450d;

    /* renamed from: e  reason: collision with root package name */
    public final r f47451e;

    /* renamed from: f  reason: collision with root package name */
    public final V1 f47452f;

    /* renamed from: g  reason: collision with root package name */
    public final C6954v5 f47453g;

    /* renamed from: h  reason: collision with root package name */
    public final C6852i6 f47454h;

    /* renamed from: i  reason: collision with root package name */
    public final C6985z4 f47455i;

    /* renamed from: j  reason: collision with root package name */
    public final SessionReplayProcessor f47456j;

    /* renamed from: com.contentsquare.android.sdk.j$a */
    public static final class a {
        public static SessionReplayProcessor a(C6863k1 k1Var, C6806d0 d0Var, g gVar, Application application, C6916q6 q6Var, C6785a3 a3Var, C6783a1 a1Var, F2 f22, C6985z4 z4Var, E e10, List list, C8465a aVar, N5 n52) {
            C6806d0 d0Var2 = d0Var;
            g gVar2 = gVar;
            C6863k1 k1Var2 = k1Var;
            g gVar3 = gVar;
            C6916q6 q6Var2 = q6Var;
            C6785a3 a3Var2 = a3Var;
            C6783a1 a1Var2 = a1Var;
            List list2 = list;
            N5 n53 = n52;
            C8886a b10 = C8886a.f56874d.b(application);
            C6842h4 h4Var = new C6842h4(gVar2, d0Var2);
            C6902p0 p0Var = r8;
            C6902p0 p0Var2 = new C6902p0(d0Var2);
            C6878m0 m0Var = r8;
            C6878m0 m0Var2 = new C6878m0(d0Var2, b10.f());
            C5221y a10 = O.f22160i.a();
            C6842h4 h4Var2 = h4Var;
            Q0 q02 = r0;
            Q0 q03 = new Q0(b10.f(), b10.c(), gVar2, h4Var2);
            C6943u2 u2Var = r0;
            C6943u2 u2Var2 = new C6943u2(f22);
            C6974y1 y1Var = r0;
            C6974y1 y1Var2 = new C6974y1(b10.f());
            return new SessionReplayProcessor(application, e10, k1Var2, a3Var2, gVar3, q6Var2, a1Var2, a10, q02, u2Var, d0Var, list2, n53, m0Var, p0Var, y1Var, (Handler) null, (K) null, (I6) null, z4Var, (K6) null, (C6963w6) null, (C6888n2) null, (m1) null, (C6824f2) null, (C6868k6) null, aVar, (C6933t0) null, (I5) null, (C6978y5) null, (C6941u0) null, (C6846i0) null, (F5) null, (P5) null, (C6900o6) null, (C6971x6) null, (H6) null, (C6792b2) null, (N3) null, (C6968x3) null, (c) null, (G0) null, -67698688, 1023, (DefaultConstructorMarker) null);
        }

        public static void b() {
            try {
                C7131j jVar = C7131j.f47442k;
                if (jVar != null) {
                    jVar.f47456j.stopProcess();
                    C7131j.f47442k = null;
                    C7131j.f47444m.j("Session Replay stopped");
                }
            } catch (Exception e10) {
                H1.a(C7131j.f47444m, "Something went wrong. Session Replay couldn't be stopped.", e10);
            }
        }

        public static void c(Application application, C8886a aVar) {
            C17542s.j(application, "application");
            C17542s.j(aVar, "module");
            E e10 = new E(aVar.f(), aVar.c(), new d(application));
            C7131j jVar = C7131j.f47442k;
            new C6965x0(application, aVar.f(), new A(application, aVar.f(), e10));
            C7131j.f47446o = e10;
        }
    }

    static {
        E8.c f10;
        C8886a a10 = C8886a.f56874d.a();
        if (a10 == null || (f10 = a10.f()) == null) {
            throw new IllegalStateException("PreferencesStore should not be null!");
        }
        f47443l = new C6785a3(f10);
    }

    public C7131j(C6899o5 o5Var, C6869l lVar, C6880m2 m2Var, C6894o0 o0Var, r rVar, V1 v12, C6954v5 v5Var, C6852i6 i6Var, C6985z4 z4Var, SessionReplayProcessor sessionReplayProcessor) {
        C17542s.j(o5Var, "networkEventPublisher");
        C17542s.j(lVar, "jsErrorEventPublisher");
        C17542s.j(m2Var, "customErrorEventPublisher");
        C17542s.j(o0Var, "webViewEventPublisher");
        C17542s.j(rVar, "webViewAssetHashesPublisher");
        C17542s.j(v12, "flutterSrEventPublisher");
        C17542s.j(v5Var, "etrScreenEventPublisher");
        C17542s.j(i6Var, "etrSessionEventPublisher");
        C17542s.j(z4Var, "srQuickLink");
        C17542s.j(sessionReplayProcessor, "sessionReplayProcessor");
        this.f47447a = o5Var;
        this.f47448b = lVar;
        this.f47449c = m2Var;
        this.f47450d = o0Var;
        this.f47451e = rVar;
        this.f47452f = v12;
        this.f47453g = v5Var;
        this.f47454h = i6Var;
        this.f47455i = z4Var;
        this.f47456j = sessionReplayProcessor;
    }
}
