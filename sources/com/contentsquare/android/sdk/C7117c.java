package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import G8.d;
import XH.C16796C;
import XH.v;
import YH.X;
import a9.C6815e1;
import a9.C6838h0;
import a9.D6;
import a9.Q0;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.sdk.C7148r0;
import com.contentsquare.android.sdk.C7162y0;
import com.contentsquare.android.sdk.j1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import tI.C17978n;
import u8.C8886a;

/* renamed from: com.contentsquare.android.sdk.c  reason: case insensitive filesystem */
public final class C7117c implements C7121e, c.b {

    /* renamed from: a  reason: collision with root package name */
    public final Q0 f47314a;

    /* renamed from: b  reason: collision with root package name */
    public final O0 f47315b;

    /* renamed from: c  reason: collision with root package name */
    public final b f47316c;

    /* renamed from: d  reason: collision with root package name */
    public final d f47317d;

    /* renamed from: e  reason: collision with root package name */
    public final C6838h0 f47318e;

    /* renamed from: f  reason: collision with root package name */
    public final c f47319f;

    /* renamed from: g  reason: collision with root package name */
    public final W8.a f47320g;

    /* renamed from: h  reason: collision with root package name */
    public final D8.c f47321h;

    /* renamed from: i  reason: collision with root package name */
    public C7148r0.a f47322i;

    /* renamed from: j  reason: collision with root package name */
    public int f47323j;

    /* renamed from: k  reason: collision with root package name */
    public int f47324k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f47325l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f47326m;

    /* renamed from: com.contentsquare.android.sdk.c$a */
    public static final class a {
        public static final boolean a(C7162y0.a aVar) {
            return aVar.f47743a == 1;
        }

        public static final boolean b(C7162y0.a aVar) {
            return aVar.f47743a == 4;
        }

        public static boolean c(C7162y0.a aVar) {
            return aVar.f47743a == -2;
        }
    }

    public C7117c(Q0 q02, C6815e1 e1Var, O0 o02, b bVar, d dVar, C6838h0 h0Var, c cVar) {
        C17542s.j(q02, "sessionRestoreHelper");
        C17542s.j(e1Var, "userIdRestoreHelper");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(bVar, "configuration");
        C17542s.j(dVar, "buildInformation");
        C17542s.j(h0Var, "eventsStatusPrefsHelper");
        C17542s.j(cVar, "preferencesStore");
        W8.a aVar = W8.a.f40541a;
        C17542s.j(q02, "sessionRestoreHelper");
        C17542s.j(e1Var, "userIdRestoreHelper");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(bVar, "configuration");
        C17542s.j(dVar, "buildInformation");
        C17542s.j(h0Var, "eventsStatusPrefsHelper");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(aVar, "heapBridge");
        this.f47314a = q02;
        this.f47315b = o02;
        this.f47316c = bVar;
        this.f47317d = dVar;
        this.f47318e = h0Var;
        this.f47319f = cVar;
        this.f47320g = aVar;
        D8.c cVar2 = new D8.c("Session");
        this.f47321h = cVar2;
        this.f47323j = q02.f42223a.d(E8.b.SCREEN_NUMBER, 0);
        c cVar3 = q02.f42223a;
        E8.b bVar2 = E8.b.SESSION_ID;
        if (!cVar3.a(bVar2)) {
            q02.f42223a.j(bVar2, 1);
        }
        this.f47324k = q02.f42223a.d(bVar2, 1);
        this.f47326m = true;
        o02.f47079h = this;
        cVar.n(this);
        cVar2.j("Starting with user id: " + e1Var.a() + " session number: " + this.f47324k);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.contentsquare.android.sdk.C7162y0.a<?> a(com.contentsquare.android.sdk.C7162y0.a<?> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "actionEventBuilder"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            boolean r0 = com.contentsquare.android.sdk.C7117c.a.a(r9)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = com.contentsquare.android.sdk.C7117c.a.b(r9)
            if (r0 == 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            int r0 = r9.f47743a
            if (r0 != r1) goto L_0x001e
            r8.f47326m = r3
            goto L_0x001e
        L_0x001c:
            r8.f47326m = r2
        L_0x001e:
            boolean r0 = r8.f47325l
            if (r0 != 0) goto L_0x0028
            int r0 = r9.f47743a
            if (r0 != r1) goto L_0x0028
            r0 = r2
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            r8.f47325l = r3
            if (r0 == 0) goto L_0x009b
            W8.a r0 = W8.a.f40541a
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0093
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x0093
            boolean r1 = com.contentsquare.android.sdk.C7117c.a.c(r9)
            if (r1 != 0) goto L_0x0093
            boolean r1 = r9 instanceof com.contentsquare.android.sdk.C7148r0.a
            if (r1 == 0) goto L_0x0049
            r1 = r9
            com.contentsquare.android.sdk.r0$a r1 = (com.contentsquare.android.sdk.C7148r0.a) r1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0051
            boolean r1 = r1.f47609n
            if (r1 != r3) goto L_0x0051
            goto L_0x0093
        L_0x0051:
            v8.a$b r1 = r0.b()
            v8.a$b r0 = r0.a()
            if (r0 != 0) goto L_0x005c
            goto L_0x0093
        L_0x005c:
            if (r1 == 0) goto L_0x0066
            boolean r0 = kotlin.jvm.internal.C17542s.e(r1, r0)
            if (r0 != 0) goto L_0x0066
            r0 = r3
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 == 0) goto L_0x0097
            boolean r1 = com.contentsquare.android.sdk.C7117c.a.b(r9)
            if (r1 != 0) goto L_0x0097
            boolean r1 = com.contentsquare.android.sdk.C7117c.a.a(r9)
            if (r1 != 0) goto L_0x0097
            X8.b r1 = X8.b.i()
            if (r1 == 0) goto L_0x0097
            com.contentsquare.android.sdk.k r1 = r1.d()
            java.lang.String r4 = "it.eventsBuildersFactory"
            kotlin.jvm.internal.C17542s.i(r1, r4)
            r4 = -2
            com.contentsquare.android.sdk.y0$a r1 = com.contentsquare.android.sdk.C7133k.b(r1, r4)
            com.contentsquare.android.sdk.j1$a r1 = (com.contentsquare.android.sdk.j1.a) r1
            r1.f47462k = r2
            com.contentsquare.android.sdk.O0 r4 = r8.f47315b
            r4.a(r1)
            goto L_0x0097
        L_0x0093:
            boolean r0 = r8.e(r9)
        L_0x0097:
            if (r0 == 0) goto L_0x009b
            r0 = r3
            goto L_0x009c
        L_0x009b:
            r0 = r2
        L_0x009c:
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            u8.a$a r0 = u8.C8886a.f56874d
            u8.a r0 = r0.a()
            java.lang.String r1 = "unified_session_definition"
            boolean r0 = a9.D6.a(r0, r1)
            if (r0 == 0) goto L_0x00db
            boolean r0 = com.contentsquare.android.sdk.C7117c.a.b(r9)
            if (r0 != 0) goto L_0x00db
            boolean r0 = com.contentsquare.android.sdk.C7117c.a.a(r9)
            if (r0 != 0) goto L_0x00db
            boolean r0 = r8.f47326m
            if (r0 == 0) goto L_0x00c2
            goto L_0x00db
        L_0x00c2:
            com.contentsquare.android.sdk.r0$a r0 = r8.f47322i
            if (r0 != 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            com.contentsquare.android.sdk.O0 r1 = r8.f47315b
            r1.a(r9)
            long r4 = r9.f47751i
            r6 = 1
            long r4 = r4 - r6
            r0.f47751i = r4
            E8.c r9 = r8.f47319f
            E8.b r1 = E8.b.SCREEN_TIMESTAMP
            r9.k(r1, r4)
            r9 = r0
        L_0x00db:
            a9.Q0 r0 = r8.f47314a
            int r1 = r8.f47324k
            int r1 = r1 + r3
            r8.f47324k = r1
            E8.c r0 = r0.f42223a
            E8.b r3 = E8.b.SESSION_ID
            r0.j(r3, r1)
            r8.f47323j = r2
            a9.Q0 r0 = r8.f47314a
            E8.c r0 = r0.f42223a
            E8.b r1 = E8.b.SCREEN_NUMBER
            r0.j(r1, r2)
            E8.c r0 = r8.f47319f
            E8.b r1 = E8.b.FORGET_ME
            r0.h(r1, r2)
            D8.c r0 = r8.f47321h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Starting session number: "
            r1.<init>(r2)
            int r2 = r8.f47324k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.j(r1)
        L_0x0110:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7117c.a(com.contentsquare.android.sdk.y0$a):com.contentsquare.android.sdk.y0$a");
    }

    public final C7162y0.a<?> b(C7162y0.a<?> aVar) {
        C17542s.j(aVar, "actionEventBuilder");
        if (a.c(aVar)) {
            C7148r0.a aVar2 = this.f47322i;
            if (aVar2 == null || aVar2.f47609n) {
                return null;
            }
            this.f47321h.f("incrementScreenNumber");
            Q0 q02 = this.f47314a;
            int i10 = this.f47323j + 1;
            this.f47323j = i10;
            q02.f42223a.j(E8.b.SCREEN_NUMBER, i10);
            aVar2.f47750h = this.f47324k;
            aVar2.f47745c = this.f47323j;
            this.f47319f.k(E8.b.SCREEN_TIMESTAMP, aVar.f47751i);
            return aVar2;
        }
        if (a.b(aVar)) {
            this.f47322i = (C7148r0.a) aVar;
        }
        aVar.f47750h = this.f47324k;
        aVar.f47745c = this.f47323j;
        return aVar;
    }

    public final C7162y0.a<?> c(C7162y0.a<?> aVar) {
        C17542s.j(aVar, "actionEventBuilder");
        if (a.b(aVar)) {
            this.f47321h.f("incrementScreenNumber");
            Q0 q02 = this.f47314a;
            int i10 = this.f47323j + 1;
            this.f47323j = i10;
            q02.f42223a.j(E8.b.SCREEN_NUMBER, i10);
        }
        return aVar;
    }

    public final C7162y0 d(C7162y0 y0Var) {
        LinkedHashMap linkedHashMap;
        C17542s.j(y0Var, "actionEvent");
        if (y0Var instanceof C7148r0) {
            this.f47321h.f("Pushing screen view event: [ " + y0Var + " ] through Heap");
            W8.a aVar = this.f47320g;
            C7148r0 r0Var = (C7148r0) y0Var;
            String str = r0Var.f47603n;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            long j10 = y0Var.f47741j;
            C8537a[] aVarArr = r0Var.f47604o;
            if (aVarArr != null) {
                linkedHashMap = new LinkedHashMap(C17978n.e(X.e(aVarArr.length), 16));
                for (C8537a aVar2 : aVarArr) {
                    v a10 = C16796C.a(aVar2.c(), aVar2.d());
                    linkedHashMap.put(a10.c(), a10.d());
                }
            } else {
                linkedHashMap = null;
            }
            aVar.e(str2, j10, linkedHashMap == null ? X.j() : linkedHashMap, r0Var.f47605p);
        }
        return y0Var;
    }

    public final boolean e(C7162y0.a<?> aVar) {
        c cVar = this.f47318e.f42591a;
        E8.b bVar = E8.b.LAST_EVENT_TIMESTAMP;
        long e10 = cVar.e(bVar, 0);
        this.f47318e.f42591a.k(bVar, aVar.f47751i);
        JsonConfig.ProjectConfiguration b10 = this.f47316c.b();
        if (e10 == 0 || b10 == null) {
            return false;
        }
        if (!D6.a(C8886a.f56874d.a(), "unified_session_definition") && !a.a(aVar) && aVar.f47743a != 0 && !a.c(aVar)) {
            return false;
        }
        if (a.c(aVar)) {
            C17542s.h(aVar, "null cannot be cast to non-null type com.contentsquare.android.analytics.internal.model.data.HeapSessionStartEvent.HeapSessionStartEventBuilder");
            return ((j1.a) aVar).f47462k;
        }
        if (aVar.f47743a == 0) {
            c cVar2 = this.f47319f;
            E8.b bVar2 = E8.b.LAST_APP_VERSION_NUMBER;
            long e11 = cVar2.e(bVar2, -1);
            long e12 = this.f47317d.e();
            int i10 = (e11 > e12 ? 1 : (e11 == e12 ? 0 : -1));
            if (i10 != 0) {
                this.f47319f.k(bVar2, e12);
            }
            boolean z10 = i10 != 0;
            c cVar3 = this.f47319f;
            E8.b bVar3 = E8.b.LAST_SDK_VERSION_NUMBER;
            int d10 = cVar3.d(bVar3, -1);
            int h10 = this.f47317d.h();
            if (d10 != h10) {
                this.f47319f.j(bVar3, h10);
            }
            boolean z11 = d10 != h10;
            if (z10 || z11) {
                return true;
            }
        }
        return aVar.f47751i - e10 >= ((long) (this.f47319f.b(E8.b.DEVELOPER_SESSION_TIMEOUT_TO_0, false) ? 500 : b10.p()));
    }

    public final void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        E8.b bVar2 = E8.b.SESSION_ID;
        if (bVar == bVar2 && !this.f47319f.a(bVar2)) {
            Q0 q02 = this.f47314a;
            if (!q02.f42223a.a(bVar2)) {
                q02.f42223a.j(bVar2, 1);
            }
            this.f47324k = q02.f42223a.d(bVar2, 1);
            this.f47323j = this.f47314a.f42223a.d(E8.b.SCREEN_NUMBER, 0);
            D8.c cVar = this.f47321h;
            cVar.j("Starting session number: " + this.f47324k);
        }
    }
}
