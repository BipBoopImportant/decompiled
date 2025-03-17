package a9;

import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.core.telemetry.processing.TelemetryManager$terminateTelemetryService$1", f = "TelemetryManager.kt", l = {232}, m = "invokeSuspend")
public final class H4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public Iterator f42038c;

    /* renamed from: d  reason: collision with root package name */
    public int f42039d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6858j4 f42040e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H4(C6858j4 j4Var, C17164e<? super H4> eVar) {
        super(2, eVar);
        this.f42040e = j4Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new H4(this.f42040e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new H4(this.f42040e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ Exception -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r3.f42039d
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.util.Iterator r1 = r3.f42038c
            XH.y.b(r4)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0026
        L_0x0011:
            r4 = move-exception
            goto L_0x003d
        L_0x0013:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x001b:
            XH.y.b(r4)
            a9.j4 r4 = r3.f42040e     // Catch:{ Exception -> 0x0011 }
            java.util.ArrayList r4 = r4.f42629j     // Catch:{ Exception -> 0x0011 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ Exception -> 0x0011 }
        L_0x0026:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x0011 }
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x0011 }
            a9.j3 r4 = (a9.C6857j3) r4     // Catch:{ Exception -> 0x0011 }
            r3.f42038c = r1     // Catch:{ Exception -> 0x0011 }
            r3.f42039d = r2     // Catch:{ Exception -> 0x0011 }
            java.lang.Object r4 = r4.a(r3)     // Catch:{ Exception -> 0x0011 }
            if (r4 != r0) goto L_0x0026
            return r0
        L_0x003d:
            a9.j4 r0 = r3.f42040e
            D8.c r0 = r0.f42628i
            java.lang.String r1 = "Failed to stop agent when terminate Telemetry service"
            a9.H1.a(r0, r1, r4)
        L_0x0046:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.H4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
