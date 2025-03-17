package com.contentsquare.android.sdk;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import QJ.Q;
import QJ.s1;
import XH.C16807N;
import XH.x;
import XH.y;
import a9.C6856j2;
import android.graphics.Rect;
import com.contentsquare.android.sdk.C7134k0;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import nI.t;
import w8.b;
import w8.e;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.VerticalComposeLazyUseCase$capture$2", f = "VerticalComposeLazyUseCase.kt", l = {29, 51}, m = "invokeSuspend")
public final class V extends l implements p<Q, C17164e<? super x<? extends C16807N>>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public C6856j2 f47174c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f47175d;

    /* renamed from: e  reason: collision with root package name */
    public int f47176e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f47177f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C6856j2 f47178g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f47179h;

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.VerticalComposeLazyUseCase$capture$2$1$1", f = "VerticalComposeLazyUseCase.kt", l = {30, 41, 48}, m = "invokeSuspend")
    public static final class a extends l implements t<Integer, Integer, List<? extends e>, Rect, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f47180c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ int f47181d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ int f47182e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47183f;

        /* renamed from: g  reason: collision with root package name */
        public /* synthetic */ Rect f47184g;

        /* renamed from: h  reason: collision with root package name */
        public /* synthetic */ boolean f47185h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ long f47186i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f47187j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f47188k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ C6856j2 f47189l;

        /* renamed from: com.contentsquare.android.sdk.V$a$a  reason: collision with other inner class name */
        public static final class C0817a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ C6856j2 f47190c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0817a(C6856j2 j2Var) {
                super(0);
                this.f47190c = j2Var;
            }

            public final Object invoke() {
                this.f47190c.f42617a.f47532a.a(C7134k0.d.f47477a);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, String str, b bVar, C6856j2 j2Var, C17164e<? super a> eVar) {
            super(6, eVar);
            this.f47186i = j10;
            this.f47187j = str;
            this.f47188k = bVar;
            this.f47189l = j2Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00c2 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f47180c
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 == r6) goto L_0x002a
                if (r2 == r5) goto L_0x0021
                if (r2 != r4) goto L_0x0019
                XH.y.b(r21)
                goto L_0x00c3
            L_0x0019:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0021:
                java.lang.Object r2 = r0.f47183f
                com.contentsquare.android.sdk.w0$a r2 = (com.contentsquare.android.sdk.C7158w0.a) r2
                XH.y.b(r21)
                goto L_0x00a2
            L_0x002a:
                boolean r2 = r0.f47185h
                int r6 = r0.f47182e
                int r7 = r0.f47181d
                android.graphics.Rect r8 = r0.f47184g
                java.lang.Object r9 = r0.f47183f
                java.util.List r9 = (java.util.List) r9
                XH.y.b(r21)
                r19 = r2
                r15 = r6
                r14 = r7
                r18 = r8
                r17 = r9
                goto L_0x006f
            L_0x0042:
                XH.y.b(r21)
                int r7 = r0.f47181d
                int r2 = r0.f47182e
                java.lang.Object r8 = r0.f47183f
                r9 = r8
                java.util.List r9 = (java.util.List) r9
                android.graphics.Rect r8 = r0.f47184g
                boolean r10 = r0.f47185h
                long r11 = r0.f47186i
                r0.f47183f = r9
                r0.f47184g = r8
                r0.f47181d = r7
                r0.f47182e = r2
                r0.f47185h = r10
                r0.f47180c = r6
                java.lang.Object r6 = QJ.C16297b0.c(r11, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                r15 = r2
                r14 = r7
                r18 = r8
                r17 = r9
                r19 = r10
            L_0x006f:
                com.contentsquare.android.sdk.w0$a r2 = new com.contentsquare.android.sdk.w0$a
                java.lang.String r12 = r0.f47187j
                w8.b r13 = r0.f47188k
                android.graphics.Rect r6 = r13.c()
                android.graphics.RectF r7 = new android.graphics.RectF
                r7.<init>(r6)
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                r7.roundOut(r6)
                r11 = r2
                r16 = r6
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
                a9.j2 r6 = r0.f47189l
                a9.O3 r7 = r6.f42618b
                com.contentsquare.android.sdk.V$a$a r8 = new com.contentsquare.android.sdk.V$a$a
                r8.<init>(r6)
                r0.f47183f = r2
                r0.f47184g = r3
                r0.f47180c = r5
                java.lang.Object r5 = r7.a(r8, r0)
                if (r5 != r1) goto L_0x00a2
                return r1
            L_0x00a2:
                a9.j2 r5 = r0.f47189l
                com.contentsquare.android.sdk.P r5 = r5.f42617a
                int r6 = r2.f47677d
                int r7 = r2.f47676c
                TJ.B<com.contentsquare.android.sdk.k0> r5 = r5.f47532a
                com.contentsquare.android.sdk.k0$e r8 = new com.contentsquare.android.sdk.k0$e
                r8.<init>(r6, r7)
                r5.a(r8)
                a9.j2 r5 = r0.f47189l
                com.contentsquare.android.sdk.P r5 = r5.f42617a
                r0.f47183f = r3
                r0.f47180c = r4
                java.lang.Object r2 = r5.b(r2, r0)
                if (r2 != r1) goto L_0x00c3
                return r1
            L_0x00c3:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.V.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            a aVar = new a(this.f47186i, this.f47187j, this.f47188k, this.f47189l, (C17164e) obj6);
            aVar.f47181d = intValue;
            aVar.f47182e = intValue2;
            aVar.f47183f = (List) obj3;
            aVar.f47184g = (Rect) obj4;
            aVar.f47185h = booleanValue;
            return aVar.invokeSuspend(C16807N.f139792a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public V(C6856j2 j2Var, b bVar, C17164e<? super V> eVar) {
        super(2, eVar);
        this.f47178g = j2Var;
        this.f47179h = bVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        V v10 = new V(this.f47178g, this.f47179h, eVar);
        v10.f47177f = obj;
        return v10;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        C6856j2 j2Var;
        Throwable th2;
        Object f10 = C17187b.f();
        int i10 = this.f47176e;
        if (i10 == 0) {
            y.b(obj);
            Q q10 = (Q) this.f47177f;
            C6856j2 j2Var2 = this.f47178g;
            b bVar = this.f47179h;
            x.a aVar = x.f139812b;
            C15906b.a aVar2 = C15906b.f135496b;
            long s10 = C15908d.s(j2Var2.f42619c.d(E8.b.CLIENT_MODE_LONG_SNAPSHOT_SCROLL_DELAY_MILLISECONDS, 0), C15909e.MILLISECONDS);
            String uuid = UUID.randomUUID().toString();
            C17542s.i(uuid, "randomUUID().toString()");
            a aVar3 = new a(s10, uuid, bVar, j2Var2, (C17164e<? super a>) null);
            this.f47176e = 1;
            if (bVar.b(aVar3, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Throwable th3) {
                x.a aVar4 = x.f139812b;
                obj2 = x.b(y.a(th3));
            }
        } else if (i10 == 2) {
            th2 = this.f47175d;
            j2Var = this.f47174c;
            obj3 = this.f47177f;
            y.b(obj);
            j2Var.f42617a.d(th2);
            obj2 = obj3;
            return x.a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = x.b(C16807N.f139792a);
        j2Var = this.f47178g;
        Throwable e10 = x.e(obj2);
        if (e10 != null) {
            this.f47177f = obj2;
            this.f47174c = j2Var;
            this.f47175d = e10;
            this.f47176e = 2;
            if (s1.a(this) == f10) {
                return f10;
            }
            obj3 = obj2;
            th2 = e10;
            j2Var.f42617a.d(th2);
            obj2 = obj3;
        }
        return x.a(obj2);
    }
}
