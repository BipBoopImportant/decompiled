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

public final class O5 implements C16532g<C7162y0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16532g f42181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O0 f42182b;

    public static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16533h f42183a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ O0 f42184b;

        @f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$special$$inlined$map$5$2", f = "AnalyticsPipeline.kt", l = {223}, m = "emit")
        /* renamed from: a9.O5$a$a  reason: collision with other inner class name */
        public static final class C0739a extends d {

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f42185c;

            /* renamed from: d  reason: collision with root package name */
            public int f42186d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f42187e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0739a(a aVar, C17164e eVar) {
                super(eVar);
                this.f42187e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f42185c = obj;
                this.f42186d |= Integer.MIN_VALUE;
                return this.f42187e.emit((Object) null, this);
            }
        }

        public a(C16533h hVar, O0 o02) {
            this.f42183a = hVar;
            this.f42184b = o02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof a9.O5.a.C0739a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                a9.O5$a$a r0 = (a9.O5.a.C0739a) r0
                int r1 = r0.f42186d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f42186d = r1
                goto L_0x0018
            L_0x0013:
                a9.O5$a$a r0 = new a9.O5$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f42185c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f42186d
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r7)
                goto L_0x0058
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                XH.y.b(r7)
                TJ.h r7 = r5.f42183a
                com.contentsquare.android.sdk.y0 r6 = (com.contentsquare.android.sdk.C7162y0) r6
                com.contentsquare.android.sdk.O0 r2 = r5.f42184b
                r2.getClass()
                com.contentsquare.android.sdk.e r4 = r2.f47079h     // Catch:{ all -> 0x0046 }
                if (r4 == 0) goto L_0x004e
                com.contentsquare.android.sdk.y0 r6 = r4.d(r6)     // Catch:{ all -> 0x0046 }
                goto L_0x004f
            L_0x0046:
                r6 = move-exception
                D8.c r2 = r2.f47073b
                java.lang.String r4 = "Pipeline processing of an action event builder failed!"
                r2.i(r6, r4)
            L_0x004e:
                r6 = 0
            L_0x004f:
                r0.f42186d = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0058
                return r1
            L_0x0058:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.O5.a.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public O5(C16532g gVar, O0 o02) {
        this.f42181a = gVar;
        this.f42182b = o02;
    }

    public final Object collect(C16533h hVar, C17164e eVar) {
        Object collect = this.f42181a.collect(new a(hVar, this.f42182b), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
