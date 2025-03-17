package tm;

import IC.C13023e;
import XH.x;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import lm.b;
import um.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fHB¢\u0006\u0004\b\u001b\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ltm/b;", "Lum/c;", "LaA/a;", "sessionManager", "Llm/a;", "backInStock", "<init>", "(LaA/a;Llm/a;)V", "", "productTitle", "itemNo", "itemType", "Llm/a$c;", "fulfilmentOption", "LXH/x;", "Lum/c$b;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llm/a$c;LdI/e;)Ljava/lang/Object;", "", "throwable", "Lum/c$a$a;", "d", "(Ljava/lang/String;Llm/a$c;Ljava/lang/Throwable;)Lum/c$a$a;", "", "e", "()Z", "c", "a", "LaA/a;", "b", "Llm/a;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tm.b  reason: case insensitive filesystem */
public final class C11925b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f102950a;

    /* renamed from: b  reason: collision with root package name */
    private final C11550a f102951b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.backinstock.notification.usecase.SubscribeBackInStockNotificationUseCaseImpl", f = "SubscribeBackInStockNotificationUseCaseImpl.kt", l = {44}, m = "invoke-yxL6bBk")
    /* renamed from: tm.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f102952c;

        /* renamed from: d  reason: collision with root package name */
        Object f102953d;

        /* renamed from: e  reason: collision with root package name */
        Object f102954e;

        /* renamed from: f  reason: collision with root package name */
        Object f102955f;

        /* renamed from: g  reason: collision with root package name */
        Object f102956g;

        /* renamed from: h  reason: collision with root package name */
        Object f102957h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f102958i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11925b f102959j;

        /* renamed from: k  reason: collision with root package name */
        int f102960k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11925b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f102959j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f102958i = obj;
            this.f102960k |= Integer.MIN_VALUE;
            Object a10 = this.f102959j.a((String) null, (String) null, (String) null, (C11550a.c) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.backinstock.notification.usecase.SubscribeBackInStockNotificationUseCaseImpl", f = "SubscribeBackInStockNotificationUseCaseImpl.kt", l = {60}, m = "subscribeToNotification-yxL6bBk")
    /* renamed from: tm.b$b  reason: collision with other inner class name */
    static final class C2451b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f102961c;

        /* renamed from: d  reason: collision with root package name */
        Object f102962d;

        /* renamed from: e  reason: collision with root package name */
        Object f102963e;

        /* renamed from: f  reason: collision with root package name */
        Object f102964f;

        /* renamed from: g  reason: collision with root package name */
        Object f102965g;

        /* renamed from: h  reason: collision with root package name */
        Object f102966h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f102967i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11925b f102968j;

        /* renamed from: k  reason: collision with root package name */
        int f102969k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2451b(C11925b bVar, C17164e<? super C2451b> eVar) {
            super(eVar);
            this.f102968j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f102967i = obj;
            this.f102969k |= Integer.MIN_VALUE;
            Object b10 = this.f102968j.f((String) null, (String) null, (String) null, (C11550a.c) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public C11925b(C13909a aVar, C11550a aVar2) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "backInStock");
        this.f102950a = aVar;
        this.f102951b = aVar2;
    }

    private final boolean c() {
        return this.f102951b.b();
    }

    private final c.a.C2466a d(String str, C11550a.c cVar, Throwable th2) {
        if (!C17542s.e(th2, b.e.f99219a) && !C17542s.e(th2, b.d.f99218a) && !C17542s.e(th2, b.c.f99217a) && !C17542s.e(th2, b.C2260b.f99216a)) {
            return new c.a.C2466a(new C13023e.d(Oo.b.f84398I0, (List) null, 2, (DefaultConstructorMarker) null));
        }
        C11550a aVar = this.f102951b;
        C17542s.h(th2, "null cannot be cast to non-null type com.ingka.ikea.backinstock.BackInStockException");
        return new c.a.C2466a(aVar.a((b) th2, cVar, str));
    }

    private final boolean e() {
        return this.f102951b.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: lm.a$c} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0040, B:18:0x0053] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[ExcHandler: CancellationException (r11v7 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r11, java.lang.String r12, java.lang.String r13, lm.C11550a.c r14, dI.C17164e<? super XH.x<? extends um.c.b>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof tm.C11925b.C2451b
            if (r0 == 0) goto L_0x0014
            r0 = r15
            tm.b$b r0 = (tm.C11925b.C2451b) r0
            int r1 = r0.f102969k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f102969k = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            tm.b$b r0 = new tm.b$b
            r0.<init>(r10, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f102967i
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r6.f102969k
            r2 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 != r2) goto L_0x0048
            java.lang.Object r11 = r6.f102966h
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r6.f102965g
            r14 = r11
            lm.a$c r14 = (lm.C11550a.c) r14
            java.lang.Object r11 = r6.f102964f
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r6.f102963e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r6.f102962d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r6.f102961c
            tm.b r12 = (tm.C11925b) r12
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            goto L_0x0071
        L_0x0044:
            r13 = move-exception
            goto L_0x0085
        L_0x0046:
            r11 = move-exception
            goto L_0x0094
        L_0x0048:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0050:
            XH.y.b(r0)
            lm.a r1 = r10.f102951b     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102961c = r10     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102962d = r11     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102963e = r12     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102964f = r13     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102965g = r14     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102966h = r15     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r6.f102969k = r2     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            r3 = 0
            r7 = 2
            r8 = 0
            r2 = r14
            r4 = r12
            r5 = r13
            java.lang.Object r0 = lm.C11550a.b.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0083 }
            if (r0 != r9) goto L_0x0070
            return r9
        L_0x0070:
            r12 = r10
        L_0x0071:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            int r13 = r0.intValue()     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            XH.x$a r15 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            um.c$b$b r15 = new um.c$b$b     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            r15.<init>(r13)     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            java.lang.Object r11 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x0046, Exception -> 0x0044 }
            return r11
        L_0x0083:
            r13 = move-exception
            r12 = r10
        L_0x0085:
            um.c$a$a r11 = r12.d(r11, r14, r13)
            XH.x$a r12 = XH.x.f139812b
            java.lang.Object r11 = XH.y.a(r11)
            java.lang.Object r11 = XH.x.b(r11)
            return r11
        L_0x0094:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.C11925b.f(java.lang.String, java.lang.String, java.lang.String, lm.a$c, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r9, java.lang.String r10, java.lang.String r11, lm.C11550a.c r12, dI.C17164e<? super XH.x<? extends um.c.b>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof tm.C11925b.a
            if (r0 == 0) goto L_0x0014
            r0 = r13
            tm.b$a r0 = (tm.C11925b.a) r0
            int r1 = r0.f102960k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f102960k = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            tm.b$a r0 = new tm.b$a
            r0.<init>(r8, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f102958i
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f102960k
            r2 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 != r2) goto L_0x004a
            java.lang.Object r9 = r6.f102957h
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r6.f102956g
            lm.a$c r9 = (lm.C11550a.c) r9
            java.lang.Object r9 = r6.f102955f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f102954e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f102953d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f102952c
            tm.b r9 = (tm.C11925b) r9
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r9 = r0.j()
            goto L_0x00c2
        L_0x004a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0052:
            XH.y.b(r0)
            aA.a r0 = r8.f102950a
            boolean r0 = r0.isLoggedIn()
            if (r0 != 0) goto L_0x006a
            XH.x$a r9 = XH.x.f139812b
            um.c$a$b r9 = um.c.a.b.f103850a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x00a7
        L_0x006a:
            boolean r0 = r8.c()
            if (r0 != 0) goto L_0x007d
            XH.x$a r9 = XH.x.f139812b
            um.c$a$c r9 = um.c.a.C2467c.f103851a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x00a7
        L_0x007d:
            java.lang.String r0 = r12.a()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0099
            XH.x$a r9 = XH.x.f139812b
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Trying to register for back in stock without a store set."
            r9.<init>(r10)
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x00a7
        L_0x0099:
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x00a8
            XH.x$a r9 = XH.x.f139812b
            um.c$b$a r9 = um.c.b.a.f103852a
            java.lang.Object r9 = XH.x.b(r9)
        L_0x00a7:
            return r9
        L_0x00a8:
            r6.f102952c = r8
            r6.f102953d = r9
            r6.f102954e = r10
            r6.f102955f = r11
            r6.f102956g = r12
            r6.f102957h = r13
            r6.f102960k = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r9 = r1.f(r2, r3, r4, r5, r6)
            if (r9 != r7) goto L_0x00c2
            return r7
        L_0x00c2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.C11925b.a(java.lang.String, java.lang.String, java.lang.String, lm.a$c, dI.e):java.lang.Object");
    }
}
