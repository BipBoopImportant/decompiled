package fg;

import Ln.h;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfg/d;", "Lgp/b;", "LLn/h;", "cartRepository", "<init>", "(LLn/h;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LLn/h;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fg.d  reason: case insensitive filesystem */
public final class C9716d implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final h f73008a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f73009b = C11346e.CART_LOGIN;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.impl.task.CartLoginTask", f = "CartLoginTask.kt", l = {30}, m = "execute")
    /* renamed from: fg.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f73010c;

        /* renamed from: d  reason: collision with root package name */
        Object f73011d;

        /* renamed from: e  reason: collision with root package name */
        Object f73012e;

        /* renamed from: f  reason: collision with root package name */
        Object f73013f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f73014g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C9716d f73015h;

        /* renamed from: i  reason: collision with root package name */
        int f73016i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9716d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f73015h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73014g = obj;
            this.f73016i |= Integer.MIN_VALUE;
            return this.f73015h.b((Object) null, this);
        }
    }

    public C9716d(h hVar) {
        C17542s.j(hVar, "cartRepository");
        this.f73008a = hVar;
    }

    public C11346e a() {
        return this.f73009b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r20, dI.C17164e<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof fg.C9716d.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            fg.d$a r3 = (fg.C9716d.a) r3
            int r4 = r3.f73016i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f73016i = r4
            goto L_0x001e
        L_0x0019:
            fg.d$a r3 = new fg.d$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f73014g
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f73016i
            r7 = 1
            if (r6 == 0) goto L_0x0044
            if (r6 != r7) goto L_0x003c
            java.lang.Object r1 = r3.f73013f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f73012e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f73010c
            fg.d r1 = (fg.C9716d) r1
            XH.y.b(r4)
            goto L_0x0128
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            XH.y.b(r4)
            boolean r4 = r1 instanceof java.lang.String
            r6 = 0
            if (r4 == 0) goto L_0x0050
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0051
        L_0x0050:
            r4 = r6
        L_0x0051:
            if (r4 != 0) goto L_0x0115
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Guest token is not a String when logging in: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r14.<init>(r8)
            qv.e r15 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x007c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0094
            java.lang.Object r10 = r8.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            r12 = 0
            boolean r11 = r11.b(r15, r12)
            if (r11 == 0) goto L_0x007c
            r9.add(r10)
            goto L_0x007c
        L_0x0094:
            java.util.Iterator r16 = r9.iterator()
            r8 = r6
            r9 = r8
        L_0x009a:
            boolean r10 = r16.hasNext()
            if (r10 == 0) goto L_0x0115
            java.lang.Object r10 = r16.next()
            qv.b r10 = (qv.C11819b) r10
            if (r8 != 0) goto L_0x00b3
            java.lang.String r8 = qv.C11818a.a(r6, r14)
            if (r8 != 0) goto L_0x00af
            goto L_0x0115
        L_0x00af:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x00b3:
            r17 = r8
            if (r9 != 0) goto L_0x0103
            java.lang.Class<fg.d> r8 = fg.C9716d.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r9 = 36
            r11 = 2
            java.lang.String r9 = HJ.C15854t.s1(r8, r9, r6, r11, r6)
            r12 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r12, r6, r11, r6)
            int r11 = r9.length()
            if (r11 != 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r9, r8)
        L_0x00da:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r11 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r11, r7)
            if (r9 == 0) goto L_0x00ed
            java.lang.String r9 = "m"
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r9 = "b"
        L_0x00ef:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = "|"
            r11.append(r9)
            r11.append(r8)
            java.lang.String r9 = r11.toString()
        L_0x0103:
            r18 = r9
            r11 = 0
            r8 = r10
            r9 = r15
            r10 = r18
            r12 = r14
            r13 = r17
            r8.a(r9, r10, r11, r12, r13)
            r8 = r17
            r9 = r18
            goto L_0x009a
        L_0x0115:
            Ln.h r6 = r0.f73008a
            r3.f73010c = r0
            r3.f73011d = r1
            r3.f73012e = r2
            r3.f73013f = r4
            r3.f73016i = r7
            java.lang.Object r1 = r6.i(r7, r4, r3)
            if (r1 != r5) goto L_0x0128
            return r5
        L_0x0128:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.C9716d.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
