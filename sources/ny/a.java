package Ny;

import FB.C12860a;
import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LNy/a;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LFB/a;)V", "", "familyCardId", "", "isCoWorkerDiscountApplied", "LXH/x;", "LXH/N;", "a", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final f f112484a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f112485b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.ApplyCoWorkerDiscountUseCase", f = "ApplyCoWorkerDiscountUseCase.kt", l = {24, 27}, m = "invoke-0E7RQCE")
    /* renamed from: Ny.a$a  reason: collision with other inner class name */
    static final class C2767a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112486c;

        /* renamed from: d  reason: collision with root package name */
        Object f112487d;

        /* renamed from: e  reason: collision with root package name */
        Object f112488e;

        /* renamed from: f  reason: collision with root package name */
        Object f112489f;

        /* renamed from: g  reason: collision with root package name */
        Object f112490g;

        /* renamed from: h  reason: collision with root package name */
        Object f112491h;

        /* renamed from: i  reason: collision with root package name */
        boolean f112492i;

        /* renamed from: j  reason: collision with root package name */
        int f112493j;

        /* renamed from: k  reason: collision with root package name */
        int f112494k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f112495l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f112496m;

        /* renamed from: n  reason: collision with root package name */
        int f112497n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2767a(a aVar, C17164e<? super C2767a> eVar) {
            super(eVar);
            this.f112496m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112495l = obj;
            this.f112497n |= Integer.MIN_VALUE;
            Object a10 = this.f112496m.a((String) null, false, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public a(f fVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112484a = fVar;
        this.f112485b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf A[Catch:{ CancellationException -> 0x004f, all -> 0x004c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6 A[Catch:{ CancellationException -> 0x004f, all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd A[Catch:{ CancellationException -> 0x004f, all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r12, boolean r13, dI.C17164e<? super XH.x<XH.C16807N>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof Ny.a.C2767a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Ny.a$a r0 = (Ny.a.C2767a) r0
            int r1 = r0.f112497n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112497n = r1
            goto L_0x0018
        L_0x0013:
            Ny.a$a r0 = new Ny.a$a
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f112495l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112497n
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x007c
            if (r3 == r6) goto L_0x005a
            if (r3 != r4) goto L_0x0052
            java.lang.Object r12 = r0.f112491h
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f112490g
            Ny.a r12 = (Ny.a) r12
            java.lang.Object r12 = r0.f112489f
            Ny.a r12 = (Ny.a) r12
            java.lang.Object r12 = r0.f112488e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f112487d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f112486c
            Ny.a r12 = (Ny.a) r12
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            XH.x r1 = (XH.x) r1     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            java.lang.Object r12 = r1.j()     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            goto L_0x00d0
        L_0x004c:
            r12 = move-exception
            goto L_0x00de
        L_0x004f:
            r12 = move-exception
            goto L_0x00e9
        L_0x0052:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x005a:
            int r5 = r0.f112494k
            int r12 = r0.f112493j
            boolean r13 = r0.f112492i
            java.lang.Object r14 = r0.f112490g
            Ny.a r14 = (Ny.a) r14
            java.lang.Object r3 = r0.f112489f
            Ny.a r3 = (Ny.a) r3
            java.lang.Object r6 = r0.f112488e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.f112487d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f112486c
            Ny.a r8 = (Ny.a) r8
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r10 = r5
            r5 = r12
            r12 = r7
            r7 = r10
            goto L_0x00a9
        L_0x007c:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            FB.a r1 = r11.f112485b     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            TJ.g r1 = r1.b()     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            TJ.g r1 = TJ.C16534i.A(r1)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112486c = r11     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112487d = r12     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112488e = r14     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112489f = r11     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112490g = r11     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112492i = r13     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112493j = r5     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112494k = r5     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112497n = r6     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            if (r1 != r2) goto L_0x00a4
            return r2
        L_0x00a4:
            r3 = r11
            r8 = r3
            r6 = r14
            r7 = r5
            r14 = r8
        L_0x00a9:
            EB.d r1 = (EB.C12832d) r1     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            java.lang.String r1 = r1.e()     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            Ry.f r9 = r14.f112484a     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            Ry.e r9 = r9.invoke()     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112486c = r8     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112487d = r12     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112488e = r6     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112489f = r3     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112490g = r14     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112491h = r1     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112492i = r13     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112493j = r5     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112494k = r7     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            r0.f112497n = r4     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            java.lang.Object r12 = r9.o(r1, r12, r13, r0)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            if (r12 != r2) goto L_0x00d0
            return r2
        L_0x00d0:
            java.lang.Throwable r12 = XH.x.e(r12)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            if (r12 != 0) goto L_0x00dd
            XH.N r12 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            java.lang.Object r12 = XH.x.b(r12)     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
            goto L_0x00e8
        L_0x00dd:
            throw r12     // Catch:{ CancellationException -> 0x004f, all -> 0x004c }
        L_0x00de:
            XH.x$a r13 = XH.x.f139812b
            java.lang.Object r12 = XH.y.a(r12)
            java.lang.Object r12 = XH.x.b(r12)
        L_0x00e8:
            return r12
        L_0x00e9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.a.a(java.lang.String, boolean, dI.e):java.lang.Object");
    }
}
