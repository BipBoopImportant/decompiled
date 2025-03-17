package r6;

import QJ.C16320n;
import XH.C16807N;
import XH.x;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/r;", "LXH/N;", "a", "(Landroidx/lifecycle/r;LdI/e;)Ljava/lang/Object;", "Landroidx/lifecycle/x;", "observer", "b", "(Landroidx/lifecycle/r;Landroidx/lifecycle/x;)V", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {42}, m = "awaitStarted")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f55706c;

        /* renamed from: d  reason: collision with root package name */
        Object f55707d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f55708e;

        /* renamed from: f  reason: collision with root package name */
        int f55709f;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f55708e = obj;
            this.f55709f |= Integer.MIN_VALUE;
            return q.a((r) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"r6/q$b", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onStart", "(Landroidx/lifecycle/y;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f55710a;

        b(C16320n<? super C16807N> nVar) {
            this.f55710a = nVar;
        }

        public void onStart(C5221y yVar) {
            C16320n<C16807N> nVar = this.f55710a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.lifecycle.r r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            boolean r0 = r7 instanceof r6.q.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            r6.q$a r0 = (r6.q.a) r0
            int r1 = r0.f55709f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55709f = r1
            goto L_0x0018
        L_0x0013:
            r6.q$a r0 = new r6.q$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f55708e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f55709f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f55707d
            kotlin.jvm.internal.O r6 = (kotlin.jvm.internal.O) r6
            java.lang.Object r0 = r0.f55706c
            androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
            XH.y.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x008c
        L_0x0031:
            r7 = move-exception
            goto L_0x0098
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            XH.y.b(r7)
            androidx.lifecycle.r$b r7 = r6.d()
            androidx.lifecycle.r$b r2 = androidx.lifecycle.r.b.STARTED
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L_0x004d
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x004d:
            kotlin.jvm.internal.O r7 = new kotlin.jvm.internal.O
            r7.<init>()
            r0.f55706c = r6     // Catch:{ all -> 0x0081 }
            r0.f55707d = r7     // Catch:{ all -> 0x0081 }
            r0.f55709f = r3     // Catch:{ all -> 0x0081 }
            QJ.p r2 = new QJ.p     // Catch:{ all -> 0x0081 }
            dI.e r4 = eI.C17187b.c(r0)     // Catch:{ all -> 0x0081 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0081 }
            r2.C()     // Catch:{ all -> 0x0081 }
            r6.q$b r3 = new r6.q$b     // Catch:{ all -> 0x0081 }
            r3.<init>(r2)     // Catch:{ all -> 0x0081 }
            r7.f144348a = r3     // Catch:{ all -> 0x0081 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x0081 }
            androidx.lifecycle.x r3 = (androidx.lifecycle.C5220x) r3     // Catch:{ all -> 0x0081 }
            r6.c(r3)     // Catch:{ all -> 0x0081 }
            java.lang.Object r2 = r2.w()     // Catch:{ all -> 0x0081 }
            java.lang.Object r3 = eI.C17187b.f()     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x0087
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L_0x0098
        L_0x0087:
            if (r2 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r0 = r6
            r6 = r7
        L_0x008c:
            T r6 = r6.f144348a
            androidx.lifecycle.x r6 = (androidx.lifecycle.C5220x) r6
            if (r6 == 0) goto L_0x0095
            r0.g(r6)
        L_0x0095:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0098:
            T r6 = r6.f144348a
            androidx.lifecycle.x r6 = (androidx.lifecycle.C5220x) r6
            if (r6 == 0) goto L_0x00a1
            r0.g(r6)
        L_0x00a1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.q.a(androidx.lifecycle.r, dI.e):java.lang.Object");
    }

    public static final void b(r rVar, C5220x xVar) {
        rVar.g(xVar);
        rVar.c(xVar);
    }
}
