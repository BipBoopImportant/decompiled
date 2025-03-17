package qn;

import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pn.C11764d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqn/q;", "Lgp/b;", "Lpn/d;", "plpSettingsRepository", "<init>", "(Lpn/d;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lpn/d;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C11764d f101877a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f101878b = C11346e.PREFILLED_AVAILABILITY_ON_LOGIN;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PrefilledAvailabilityOnLoginTask", f = "PrefilledAvailabilityOnLoginTask.kt", l = {22}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101879c;

        /* renamed from: d  reason: collision with root package name */
        Object f101880d;

        /* renamed from: e  reason: collision with root package name */
        Object f101881e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101882f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f101883g;

        /* renamed from: h  reason: collision with root package name */
        int f101884h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f101883g = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101882f = obj;
            this.f101884h |= Integer.MIN_VALUE;
            return this.f101883g.b((Object) null, this);
        }
    }

    public q(C11764d dVar) {
        C17542s.j(dVar, "plpSettingsRepository");
        this.f101877a = dVar;
    }

    public C11346e a() {
        return this.f101878b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qn.q.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qn.q$a r0 = (qn.q.a) r0
            int r1 = r0.f101884h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101884h = r1
            goto L_0x0018
        L_0x0013:
            qn.q$a r0 = new qn.q$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f101882f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f101884h
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f101881e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f101879c
            qn.q r6 = (qn.q) r6
            XH.y.b(r1)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            pn.d r1 = r5.f101877a
            r0.f101879c = r5
            r0.f101880d = r6
            r0.f101881e = r7
            r0.f101884h = r4
            java.lang.Object r6 = r1.b(r4, r0)
            if (r6 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.q.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
