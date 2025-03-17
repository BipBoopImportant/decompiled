package fg;

import Ln.h;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfg/c;", "Lgp/b;", "LLn/h;", "cartRepository", "<init>", "(LLn/h;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LLn/h;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fg.c  reason: case insensitive filesystem */
public final class C9715c implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final h f73000a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f73001b = C11346e.CART_FETCH;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.impl.task.CartFetchTask", f = "CartFetchTask.kt", l = {22}, m = "execute")
    /* renamed from: fg.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f73002c;

        /* renamed from: d  reason: collision with root package name */
        Object f73003d;

        /* renamed from: e  reason: collision with root package name */
        Object f73004e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f73005f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9715c f73006g;

        /* renamed from: h  reason: collision with root package name */
        int f73007h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9715c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f73006g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73005f = obj;
            this.f73007h |= Integer.MIN_VALUE;
            return this.f73006g.b((Object) null, this);
        }
    }

    public C9715c(h hVar) {
        C17542s.j(hVar, "cartRepository");
        this.f73000a = hVar;
    }

    public C11346e a() {
        return this.f73001b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r14, dI.C17164e<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof fg.C9715c.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            fg.c$a r0 = (fg.C9715c.a) r0
            int r1 = r0.f73007h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73007h = r1
            goto L_0x0018
        L_0x0013:
            fg.c$a r0 = new fg.c$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f73005f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f73007h
            r4 = 1
            if (r3 == 0) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r14 = r0.f73004e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f73002c
            fg.c r14 = (fg.C9715c) r14
            XH.y.b(r1)     // Catch:{ Exception -> 0x0032 }
            goto L_0x00fc
        L_0x0032:
            r15 = move-exception
            goto L_0x0052
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            XH.y.b(r1)
            Ln.h r1 = r13.f73000a     // Catch:{ Exception -> 0x0050 }
            r0.f73002c = r13     // Catch:{ Exception -> 0x0050 }
            r0.f73003d = r14     // Catch:{ Exception -> 0x0050 }
            r0.f73004e = r15     // Catch:{ Exception -> 0x0050 }
            r0.f73007h = r4     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r14 = r1.h(r0)     // Catch:{ Exception -> 0x0050 }
            if (r14 != r2) goto L_0x00fc
            return r2
        L_0x0050:
            r15 = move-exception
            r14 = r13
        L_0x0052:
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0065:
            boolean r3 = r1.hasNext()
            r11 = 0
            if (r3 == 0) goto L_0x007d
            java.lang.Object r3 = r1.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r0, r11)
            if (r5 == 0) goto L_0x0065
            r2.add(r3)
            goto L_0x0065
        L_0x007d:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x0084:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            if (r3 != 0) goto L_0x009f
            java.lang.String r3 = "Unable to fetch cart"
            java.lang.String r3 = qv.C11818a.a(r3, r15)
            if (r3 != 0) goto L_0x009b
            goto L_0x00fb
        L_0x009b:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x009f:
            if (r5 != 0) goto L_0x00ef
            java.lang.Class r5 = r14.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00c6:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x00d9
            java.lang.String r7 = "m"
            goto L_0x00db
        L_0x00d9:
            java.lang.String r7 = "b"
        L_0x00db:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x00ef:
            r12 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r12
            r9 = r15
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r12
            goto L_0x0084
        L_0x00fb:
            r4 = r11
        L_0x00fc:
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.C9715c.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
