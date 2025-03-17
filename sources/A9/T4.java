package a9;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import com.contentsquare.android.sdk.C7162y0;
import com.contentsquare.android.sdk.O0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

public final class T4 implements C16532g<C7162y0.a<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16532g f42305a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O0 f42306b;

    public static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16533h f42307a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ O0 f42308b;

        @f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$special$$inlined$filter$1$2", f = "AnalyticsPipeline.kt", l = {223}, m = "emit")
        /* renamed from: a9.T4$a$a  reason: collision with other inner class name */
        public static final class C0740a extends d {

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f42309c;

            /* renamed from: d  reason: collision with root package name */
            public int f42310d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f42311e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0740a(a aVar, C17164e eVar) {
                super(eVar);
                this.f42311e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f42309c = obj;
                this.f42310d |= Integer.MIN_VALUE;
                return this.f42311e.emit((Object) null, this);
            }
        }

        public a(C16533h hVar, O0 o02) {
            this.f42307a = hVar;
            this.f42308b = o02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof a9.T4.a.C0740a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                a9.T4$a$a r0 = (a9.T4.a.C0740a) r0
                int r1 = r0.f42310d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f42310d = r1
                goto L_0x0018
            L_0x0013:
                a9.T4$a$a r0 = new a9.T4$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f42309c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f42310d
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r9)
                goto L_0x0064
            L_0x0029:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0031:
                XH.y.b(r9)
                TJ.h r9 = r7.f42307a
                r2 = r8
                com.contentsquare.android.sdk.y0$a r2 = (com.contentsquare.android.sdk.C7162y0.a) r2
                com.contentsquare.android.sdk.O0 r4 = r7.f42308b
                r4.getClass()
                java.lang.String r5 = "builder"
                kotlin.jvm.internal.C17542s.j(r2, r5)
                a9.N6 r5 = r4.f47072a
                com.contentsquare.android.sdk.t1 r5 = (com.contentsquare.android.sdk.t1) r5
                boolean r5 = r5.f47638f
                r6 = 0
                if (r5 == 0) goto L_0x0059
                int r2 = r2.f47743a
                if (r2 == 0) goto L_0x0052
                r2 = r3
                goto L_0x0056
            L_0x0052:
                boolean r2 = r4.f47080i
                r4.f47080i = r6
            L_0x0056:
                if (r2 == 0) goto L_0x0059
                r6 = r3
            L_0x0059:
                if (r6 == 0) goto L_0x0064
                r0.f42310d = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L_0x0064
                return r1
            L_0x0064:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.T4.a.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public T4(C16532g gVar, O0 o02) {
        this.f42305a = gVar;
        this.f42306b = o02;
    }

    public final Object collect(C16533h hVar, C17164e eVar) {
        Object collect = this.f42305a.collect(new a(hVar, this.f42306b), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
