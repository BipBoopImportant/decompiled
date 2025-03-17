package Lz;

import FB.C12860a;
import Ry.b;
import Ry.f;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"LLz/c;", "Lgp/b;", "LRy/b;", "scanAndGoCapability", "LFB/a;", "localStoreSelectionRepository", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LRy/b;LFB/a;LRy/f;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LRy/b;", "LFB/a;", "c", "LRy/f;", "Lgp/e;", "d", "Lgp/e;", "()Lgp/e;", "taskId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final b f111967a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f111968b;

    /* renamed from: c  reason: collision with root package name */
    private final f f111969c;

    /* renamed from: d  reason: collision with root package name */
    private final C11346e f111970d = C11346e.SCAN_AND_GO_USER_LOGOUT;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.task.ScanAndGoUserLogoutTask", f = "ScanAndGoUserLogoutTask.kt", l = {33}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111971c;

        /* renamed from: d  reason: collision with root package name */
        Object f111972d;

        /* renamed from: e  reason: collision with root package name */
        Object f111973e;

        /* renamed from: f  reason: collision with root package name */
        Object f111974f;

        /* renamed from: g  reason: collision with root package name */
        Object f111975g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f111976h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f111977i;

        /* renamed from: j  reason: collision with root package name */
        int f111978j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111977i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111976h = obj;
            this.f111978j |= Integer.MIN_VALUE;
            return this.f111977i.b((Object) null, this);
        }
    }

    public c(b bVar, C12860a aVar, f fVar) {
        C17542s.j(bVar, "scanAndGoCapability");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f111967a = bVar;
        this.f111968b = aVar;
        this.f111969c = fVar;
    }

    public C11346e a() {
        return this.f111970d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r14, dI.C17164e<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Lz.c.a
            if (r0 == 0) goto L_0x0014
            r0 = r15
            Lz.c$a r0 = (Lz.c.a) r0
            int r1 = r0.f111978j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f111978j = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            Lz.c$a r0 = new Lz.c$a
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f111976h
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f111978j
            r8 = 0
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 != r9) goto L_0x0043
            java.lang.Object r14 = r6.f111975g
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Object r14 = r6.f111974f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r6.f111973e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r6.f111971c
            Lz.c r14 = (Lz.c) r14
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r15 = r0.j()
            goto L_0x0096
        L_0x0043:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x004b:
            XH.y.b(r0)
            Ry.b r0 = r13.f111967a
            java.lang.String r1 = ""
            r0.g(r1)
            FB.a r0 = r13.f111968b
            EB.d r0 = r0.c()
            if (r0 == 0) goto L_0x006d
            boolean r1 = r0.f()
            if (r1 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r0 = r10
        L_0x0065:
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r0.e()
            r2 = r0
            goto L_0x006e
        L_0x006d:
            r2 = r10
        L_0x006e:
            if (r2 == 0) goto L_0x014d
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0078
            goto L_0x014d
        L_0x0078:
            Ry.f r0 = r13.f111969c
            Ry.e r1 = r0.invoke()
            r6.f111971c = r13
            r6.f111972d = r14
            r6.f111973e = r15
            r6.f111974f = r2
            r6.f111975g = r2
            r6.f111978j = r9
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            java.lang.Object r15 = r1.q(r2, r3, r4, r5, r6)
            if (r15 != r7) goto L_0x0095
            return r7
        L_0x0095:
            r14 = r13
        L_0x0096:
            java.lang.Throwable r6 = XH.x.e(r15)
            if (r6 == 0) goto L_0x0144
            qv.e r7 = qv.e.WARN
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00af:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c6
            java.lang.Object r2 = r0.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            boolean r3 = r3.b(r7, r8)
            if (r3 == 0) goto L_0x00af
            r1.add(r2)
            goto L_0x00af
        L_0x00c6:
            java.util.Iterator r8 = r1.iterator()
            r0 = r10
            r1 = r0
        L_0x00cc:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r8.next()
            qv.b r2 = (qv.C11819b) r2
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = qv.C11818a.a(r10, r6)
            if (r0 != 0) goto L_0x00e2
            goto L_0x0144
        L_0x00e2:
            java.lang.String r0 = qv.C11820c.a(r0)
        L_0x00e6:
            r11 = r0
            if (r1 != 0) goto L_0x0137
            java.lang.Class r0 = r14.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r1 = 36
            r3 = 2
            java.lang.String r1 = HJ.C15854t.s1(r0, r1, r10, r3, r10)
            r4 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r4, r10, r3, r10)
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0108
            goto L_0x010e
        L_0x0108:
            java.lang.String r0 = "Kt"
            java.lang.String r0 = HJ.C15854t.P0(r1, r0)
        L_0x010e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "main"
            boolean r1 = HJ.C15854t.b0(r1, r3, r9)
            if (r1 == 0) goto L_0x0121
            java.lang.String r1 = "m"
            goto L_0x0123
        L_0x0121:
            java.lang.String r1 = "b"
        L_0x0123:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "|"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
        L_0x0137:
            r12 = r1
            r3 = 0
            r0 = r2
            r1 = r7
            r2 = r12
            r4 = r6
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r12
            goto L_0x00cc
        L_0x0144:
            boolean r14 = XH.x.h(r15)
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)
            return r14
        L_0x014d:
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Lz.c.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
