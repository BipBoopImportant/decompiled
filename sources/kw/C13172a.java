package Kw;

import Dw.b;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LKw/a;", "Lgp/b;", "LDw/b;", "repository", "<init>", "(LDw/b;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LDw/b;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kw.a  reason: case insensitive filesystem */
public final class C13172a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final b f111754a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f111755b = C11346e.CLEAN_OUT_ONGOING_ORDERS;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.ongoinginstoreordersrepository.impl.task.CleanOutOngoingOrdersTask", f = "CleanOutOngoingOrdersTask.kt", l = {24}, m = "execute")
    /* renamed from: Kw.a$a  reason: collision with other inner class name */
    static final class C2727a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111756c;

        /* renamed from: d  reason: collision with root package name */
        Object f111757d;

        /* renamed from: e  reason: collision with root package name */
        Object f111758e;

        /* renamed from: f  reason: collision with root package name */
        Object f111759f;

        /* renamed from: g  reason: collision with root package name */
        Object f111760g;

        /* renamed from: h  reason: collision with root package name */
        int f111761h;

        /* renamed from: i  reason: collision with root package name */
        int f111762i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f111763j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13172a f111764k;

        /* renamed from: l  reason: collision with root package name */
        int f111765l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2727a(C13172a aVar, C17164e<? super C2727a> eVar) {
            super(eVar);
            this.f111764k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111763j = obj;
            this.f111765l |= Integer.MIN_VALUE;
            return this.f111764k.b((Object) null, this);
        }
    }

    public C13172a(b bVar) {
        C17542s.j(bVar, "repository");
        this.f111754a = bVar;
    }

    public C11346e a() {
        return this.f111755b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r15 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012e, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0036, B:17:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[ExcHandler: CancellationException (r14v9 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r14, dI.C17164e<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Kw.C13172a.C2727a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Kw.a$a r0 = (Kw.C13172a.C2727a) r0
            int r1 = r0.f111765l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111765l = r1
            goto L_0x0018
        L_0x0013:
            Kw.a$a r0 = new Kw.a$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f111763j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111765l
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r5) goto L_0x003f
            java.lang.Object r14 = r0.f111760g
            Kw.a r14 = (Kw.C13172a) r14
            java.lang.Object r14 = r0.f111759f
            Kw.a r14 = (Kw.C13172a) r14
            java.lang.Object r14 = r0.f111758e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f111756c
            Kw.a r14 = (Kw.C13172a) r14
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            goto L_0x0066
        L_0x003a:
            r15 = move-exception
            goto L_0x006f
        L_0x003c:
            r14 = move-exception
            goto L_0x012e
        L_0x003f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0047:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            Dw.b r1 = r13.f111754a     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111756c = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111757d = r14     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111758e = r15     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111759f = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111760g = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111761h = r4     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111762i = r4     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            r0.f111765l = r5     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            java.lang.Object r14 = r1.e(r0)     // Catch:{ CancellationException -> 0x003c, all -> 0x006d }
            if (r14 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r14 = r13
        L_0x0066:
            XH.N r15 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            java.lang.Object r15 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            goto L_0x0079
        L_0x006d:
            r15 = move-exception
            r14 = r13
        L_0x006f:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r15 = XH.y.a(r15)
            java.lang.Object r15 = XH.x.b(r15)
        L_0x0079:
            java.lang.Throwable r0 = XH.x.e(r15)
            if (r0 == 0) goto L_0x0125
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0092:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r6 = r2.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r1, r4)
            if (r7 == 0) goto L_0x0092
            r3.add(r6)
            goto L_0x0092
        L_0x00a9:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r4 = r3
            r6 = r4
        L_0x00b0:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0125
            java.lang.Object r7 = r2.next()
            qv.b r7 = (qv.C11819b) r7
            if (r4 != 0) goto L_0x00c9
            java.lang.String r4 = qv.C11818a.a(r3, r0)
            if (r4 != 0) goto L_0x00c5
            goto L_0x0125
        L_0x00c5:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00c9:
            if (r6 != 0) goto L_0x0119
            java.lang.Class r6 = r14.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            r9 = 2
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r3, r9, r3)
            r10 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r10, r3, r9, r3)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x00f0:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r5)
            if (r8 == 0) goto L_0x0103
            java.lang.String r8 = "m"
            goto L_0x0105
        L_0x0103:
            java.lang.String r8 = "b"
        L_0x0105:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0119:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r1
            r8 = r12
            r10 = r0
            r11 = r4
            r6.a(r7, r8, r9, r10, r11)
            r6 = r12
            goto L_0x00b0
        L_0x0125:
            boolean r14 = XH.x.h(r15)
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)
            return r14
        L_0x012e:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Kw.C13172a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
