package hA;

import aA.C13909a;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LhA/a;", "Lgp/b;", "LaA/a;", "sessionManager", "<init>", "(LaA/a;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LaA/a;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hA.a  reason: case insensitive filesystem */
public final class C14525a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f127424a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f127425b = C11346e.LOG_OUT_ON_MARKET_CHANGE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.task.LogOutOnMarketChangeTask", f = "LogOutOnMarketChangeTask.kt", l = {24}, m = "execute")
    /* renamed from: hA.a$a  reason: collision with other inner class name */
    static final class C3134a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f127426c;

        /* renamed from: d  reason: collision with root package name */
        Object f127427d;

        /* renamed from: e  reason: collision with root package name */
        Object f127428e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f127429f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14525a f127430g;

        /* renamed from: h  reason: collision with root package name */
        int f127431h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3134a(C14525a aVar, C17164e<? super C3134a> eVar) {
            super(eVar);
            this.f127430g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127429f = obj;
            this.f127431h |= Integer.MIN_VALUE;
            return this.f127430g.b((Object) null, this);
        }
    }

    public C14525a(C13909a aVar) {
        C17542s.j(aVar, "sessionManager");
        this.f127424a = aVar;
    }

    public C11346e a() {
        return this.f127425b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r10, dI.C17164e<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof hA.C14525a.C3134a
            if (r0 == 0) goto L_0x0014
            r0 = r11
            hA.a$a r0 = (hA.C14525a.C3134a) r0
            int r1 = r0.f127431h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f127431h = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            hA.a$a r0 = new hA.a$a
            r0.<init>(r9, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.f127429f
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.f127431h
            r8 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r8) goto L_0x0033
            java.lang.Object r10 = r4.f127428e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r4.f127426c
            hA.a r10 = (hA.C14525a) r10
            XH.y.b(r0)
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            XH.y.b(r0)
            boolean r0 = r10 instanceof Il.e
            if (r0 == 0) goto L_0x0057
            aA.a r1 = r9.f127424a
            r4.f127426c = r9
            r4.f127427d = r10
            r4.f127428e = r11
            r4.f127431h = r8
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r10 = aA.C13909a.C2951a.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L_0x0057
            return r7
        L_0x0057:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hA.C14525a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
