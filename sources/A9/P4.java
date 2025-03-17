package a9;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import android.os.Debug;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

public final class P4 implements I1<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final Debug.MemoryInfo f42204a = new Debug.MemoryInfo();

    /* renamed from: b  reason: collision with root package name */
    public final C16532g<Float> f42205b = C16534i.H(new a(this, (C17164e<? super a>) null));

    @f(c = "com.contentsquare.android.internal.core.telemetry.performance.RamCollector$dataFlow$1", f = "RamCollector.kt", l = {30, 31}, m = "invokeSuspend")
    public static final class a extends l implements p<C16533h<? super Float>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42206c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42207d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ P4 f42208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(P4 p42, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f42208e = p42;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f42208e, eVar);
            aVar.f42207d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.f42208e, (C17164e) obj2);
            aVar.f42207d = (C16533h) obj;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0059 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f42206c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r6.f42207d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x002e
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                java.lang.Object r1 = r6.f42207d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0045
            L_0x0026:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f42207d
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
            L_0x002e:
                dI.i r7 = r6.getContext()
                boolean r7 = QJ.I0.p(r7)
                if (r7 == 0) goto L_0x005a
                r6.f42207d = r1
                r6.f42206c = r3
                r4 = 300(0x12c, double:1.48E-321)
                java.lang.Object r7 = QJ.C16297b0.b(r4, r6)
                if (r7 != r0) goto L_0x0045
                return r0
            L_0x0045:
                a9.P4 r7 = r6.f42208e
                float r7 = a9.P4.a(r7)
                java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.d(r7)
                r6.f42207d = r1
                r6.f42206c = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x002e
                return r0
            L_0x005a:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.P4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final float a(P4 p42) {
        Debug.getMemoryInfo(p42.f42204a);
        return (float) (p42.f42204a.getTotalPss() / 1000);
    }

    public final String getName() {
        return "total_memory";
    }

    public final C16532g<Float> a() {
        return this.f42205b;
    }
}
