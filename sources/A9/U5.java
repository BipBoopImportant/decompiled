package a9;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import com.contentsquare.android.sdk.O0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.json.JSONObject;

public final class U5 implements C16532g<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16532g f42322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O0 f42323b;

    public static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16533h f42324a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ O0 f42325b;

        @f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$special$$inlined$map$6$2", f = "AnalyticsPipeline.kt", l = {223}, m = "emit")
        /* renamed from: a9.U5$a$a  reason: collision with other inner class name */
        public static final class C0741a extends d {

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f42326c;

            /* renamed from: d  reason: collision with root package name */
            public int f42327d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f42328e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0741a(a aVar, C17164e eVar) {
                super(eVar);
                this.f42328e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f42326c = obj;
                this.f42327d |= Integer.MIN_VALUE;
                return this.f42328e.emit((Object) null, this);
            }
        }

        public a(C16533h hVar, O0 o02) {
            this.f42324a = hVar;
            this.f42325b = o02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof a9.U5.a.C0741a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                a9.U5$a$a r0 = (a9.U5.a.C0741a) r0
                int r1 = r0.f42327d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f42327d = r1
                goto L_0x0018
            L_0x0013:
                a9.U5$a$a r0 = new a9.U5$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f42326c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f42327d
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r9)
                goto L_0x0071
            L_0x0029:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0031:
                XH.y.b(r9)
                TJ.h r9 = r7.f42324a
                com.contentsquare.android.sdk.y0 r8 = (com.contentsquare.android.sdk.C7162y0) r8
                com.contentsquare.android.sdk.O0 r2 = r7.f42325b
                r2.getClass()
                java.lang.String r4 = "Pushing event: [ "
                org.json.JSONObject r5 = a9.J.b(r8)     // Catch:{ all -> 0x005f }
                if (r5 == 0) goto L_0x0067
                r8.a()     // Catch:{ all -> 0x005f }
                D8.c r8 = r2.f47073b     // Catch:{ all -> 0x005f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
                r6.<init>(r4)     // Catch:{ all -> 0x005f }
                r6.append(r5)     // Catch:{ all -> 0x005f }
                java.lang.String r4 = " ] through the stream"
                r6.append(r4)     // Catch:{ all -> 0x005f }
                java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x005f }
                r8.f(r4)     // Catch:{ all -> 0x005f }
                goto L_0x0068
            L_0x005f:
                r8 = move-exception
                D8.c r2 = r2.f47073b
                java.lang.String r4 = "Pipeline processing of an action event builder failed!"
                r2.i(r8, r4)
            L_0x0067:
                r5 = 0
            L_0x0068:
                r0.f42327d = r3
                java.lang.Object r8 = r9.emit(r5, r0)
                if (r8 != r1) goto L_0x0071
                return r1
            L_0x0071:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.U5.a.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public U5(C16532g gVar, O0 o02) {
        this.f42322a = gVar;
        this.f42323b = o02;
    }

    public final Object collect(C16533h hVar, C17164e eVar) {
        Object collect = this.f42322a.collect(new a(hVar, this.f42323b), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
