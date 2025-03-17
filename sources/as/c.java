package As;

import Bs.k;
import Bs.o;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LAs/c;", "Lgp/b;", "LBs/k;", "refreshInboxSources", "LBs/o;", "schedulePeriodicInboxSync", "<init>", "(LBs/k;LBs/o;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LBs/k;", "LBs/o;", "Lgp/e;", "c", "Lgp/e;", "()Lgp/e;", "taskId", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final k f79118a;

    /* renamed from: b  reason: collision with root package name */
    private final o f79119b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f79120c = C11346e.INBOX_ON_APP_READY;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.task.InboxOnAppReadyTask", f = "InboxOnAppReadyTask.kt", l = {24}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f79121c;

        /* renamed from: d  reason: collision with root package name */
        Object f79122d;

        /* renamed from: e  reason: collision with root package name */
        Object f79123e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f79124f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f79125g;

        /* renamed from: h  reason: collision with root package name */
        int f79126h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79125g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79124f = obj;
            this.f79126h |= Integer.MIN_VALUE;
            return this.f79125g.b((Object) null, this);
        }
    }

    public c(k kVar, o oVar) {
        C17542s.j(kVar, "refreshInboxSources");
        C17542s.j(oVar, "schedulePeriodicInboxSync");
        this.f79118a = kVar;
        this.f79119b = oVar;
    }

    public C11346e a() {
        return this.f79120c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r13, dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof As.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            As.c$a r0 = (As.c.a) r0
            int r1 = r0.f79126h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79126h = r1
            goto L_0x0018
        L_0x0013:
            As.c$a r0 = new As.c$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f79124f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79126h
            r4 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            java.lang.Object r13 = r0.f79123e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f79121c
            As.c r13 = (As.c) r13
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            r1.j()
            goto L_0x0053
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            XH.y.b(r1)
            Bs.k r1 = r12.f79118a
            r0.f79121c = r12
            r0.f79122d = r13
            r0.f79123e = r14
            r0.f79126h = r4
            java.lang.Object r13 = r1.a(r4, r0)
            if (r13 != r2) goto L_0x0052
            return r2
        L_0x0052:
            r13 = r12
        L_0x0053:
            Bs.o r5 = r13.f79119b
            r10 = 15
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            Bs.o.a.a(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: As.c.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
