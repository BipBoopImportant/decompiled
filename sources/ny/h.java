package Ny;

import FB.C12860a;
import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LNy/h;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LFB/a;)V", "", "couponCode", "familyCardId", "LXH/x;", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final f f112560a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f112561b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.DeleteCouponUseCase", f = "DeleteCouponUseCase.kt", l = {22, 25}, m = "delete-0E7RQCE")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112562c;

        /* renamed from: d  reason: collision with root package name */
        Object f112563d;

        /* renamed from: e  reason: collision with root package name */
        Object f112564e;

        /* renamed from: f  reason: collision with root package name */
        Object f112565f;

        /* renamed from: g  reason: collision with root package name */
        Object f112566g;

        /* renamed from: h  reason: collision with root package name */
        Object f112567h;

        /* renamed from: i  reason: collision with root package name */
        Object f112568i;

        /* renamed from: j  reason: collision with root package name */
        int f112569j;

        /* renamed from: k  reason: collision with root package name */
        int f112570k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f112571l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f112572m;

        /* renamed from: n  reason: collision with root package name */
        int f112573n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112572m = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112571l = obj;
            this.f112573n |= Integer.MIN_VALUE;
            Object a10 = this.f112572m.a((String) null, (String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public h(f fVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112560a = fVar;
        this.f112561b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[Catch:{ CancellationException -> 0x0051, all -> 0x004e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, dI.C17164e<? super XH.x<XH.C16807N>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof Ny.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Ny.h$a r0 = (Ny.h.a) r0
            int r1 = r0.f112573n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112573n = r1
            goto L_0x0018
        L_0x0013:
            Ny.h$a r0 = new Ny.h$a
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f112571l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112573n
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0085
            if (r3 == r5) goto L_0x005c
            if (r3 != r4) goto L_0x0054
            java.lang.Object r13 = r0.f112568i
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f112567h
            Ny.h r13 = (Ny.h) r13
            java.lang.Object r13 = r0.f112566g
            Ny.h r13 = (Ny.h) r13
            java.lang.Object r13 = r0.f112565f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f112564e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f112563d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f112562c
            Ny.h r13 = (Ny.h) r13
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            XH.x r1 = (XH.x) r1     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r1.j()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            goto L_0x00db
        L_0x004e:
            r13 = move-exception
            goto L_0x00e2
        L_0x0051:
            r13 = move-exception
            goto L_0x00ed
        L_0x0054:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x005c:
            int r13 = r0.f112570k
            int r14 = r0.f112569j
            java.lang.Object r15 = r0.f112567h
            Ny.h r15 = (Ny.h) r15
            java.lang.Object r3 = r0.f112566g
            Ny.h r3 = (Ny.h) r3
            java.lang.Object r5 = r0.f112565f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r0.f112564e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f112563d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f112562c
            Ny.h r8 = (Ny.h) r8
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r10 = r3
            r3 = r13
            r13 = r7
            r7 = r10
            r11 = r15
            r15 = r14
            r14 = r6
            r6 = r1
            r1 = r11
            goto L_0x00b4
        L_0x0085:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            FB.a r1 = r12.f112561b     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            TJ.g r1 = r1.b()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            TJ.g r1 = TJ.C16534i.A(r1)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112562c = r12     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112563d = r13     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112564e = r14     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112565f = r15     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112566g = r12     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112567h = r12     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r3 = 0
            r0.f112569j = r3     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112570k = r3     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112573n = r5     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            if (r1 != r2) goto L_0x00ae
            return r2
        L_0x00ae:
            r7 = r12
            r8 = r7
            r5 = r15
            r6 = r1
            r15 = r3
            r1 = r8
        L_0x00b4:
            EB.d r6 = (EB.C12832d) r6     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            java.lang.String r6 = r6.e()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            Ry.f r9 = r1.f112560a     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            Ry.e r9 = r9.invoke()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112562c = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112563d = r13     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112564e = r14     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112565f = r5     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112566g = r7     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112567h = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112568i = r6     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112569j = r15     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112570k = r3     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            r0.f112573n = r4     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            java.lang.Object r13 = r9.p(r6, r14, r13, r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            if (r13 != r2) goto L_0x00db
            return r2
        L_0x00db:
            XH.N r13 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            java.lang.Object r13 = XH.x.b(r13)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            goto L_0x00ec
        L_0x00e2:
            XH.x$a r14 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x00ec:
            return r13
        L_0x00ed:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.h.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
