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

public final class D5 implements C16532g<C7162y0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16532g f41966a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O0 f41967b;

    public static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16533h f41968a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ O0 f41969b;

        @f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$special$$inlined$map$4$2", f = "AnalyticsPipeline.kt", l = {223}, m = "emit")
        /* renamed from: a9.D5$a$a  reason: collision with other inner class name */
        public static final class C0738a extends d {

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f41970c;

            /* renamed from: d  reason: collision with root package name */
            public int f41971d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f41972e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0738a(a aVar, C17164e eVar) {
                super(eVar);
                this.f41972e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f41970c = obj;
                this.f41971d |= Integer.MIN_VALUE;
                return this.f41972e.emit((Object) null, this);
            }
        }

        public a(C16533h hVar, O0 o02) {
            this.f41968a = hVar;
            this.f41969b = o02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof a9.D5.a.C0738a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                a9.D5$a$a r0 = (a9.D5.a.C0738a) r0
                int r1 = r0.f41971d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f41971d = r1
                goto L_0x0018
            L_0x0013:
                a9.D5$a$a r0 = new a9.D5$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f41970c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f41971d
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r7)
                goto L_0x0054
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                XH.y.b(r7)
                TJ.h r7 = r5.f41968a
                com.contentsquare.android.sdk.y0$a r6 = (com.contentsquare.android.sdk.C7162y0.a) r6
                com.contentsquare.android.sdk.O0 r2 = r5.f41969b
                r2.getClass()
                com.contentsquare.android.sdk.y0 r6 = r6.a()     // Catch:{ all -> 0x0042 }
                goto L_0x004b
            L_0x0042:
                r6 = move-exception
                D8.c r2 = r2.f47073b
                java.lang.String r4 = "Pipeline processing of an action event builder failed!"
                r2.i(r6, r4)
                r6 = 0
            L_0x004b:
                r0.f41971d = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0054
                return r1
            L_0x0054:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.D5.a.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public D5(C16532g gVar, O0 o02) {
        this.f41966a = gVar;
        this.f41967b = o02;
    }

    public final Object collect(C16533h hVar, C17164e eVar) {
        Object collect = this.f41966a.collect(new a(hVar, this.f41967b), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
