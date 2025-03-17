package dj;

import Sy.a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.C15007A;
import sz.C15054a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldj/a;", "", "Lsz/a;", "checkoutRepository", "LSy/a;", "scanAndGoAnalytics", "<init>", "(Lsz/a;LSy/a;)V", "", "storeId", "orderId", "", "timeStamp", "LKj/a;", "currentCheckoutState", "Lrz/A;", "checkout", "Lrz/C;", "a", "(Ljava/lang/String;Ljava/lang/String;JLKj/a;Lrz/A;LdI/e;)Ljava/lang/Object;", "Lsz/a;", "b", "LSy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dj.a  reason: case insensitive filesystem */
public final class C11193a {

    /* renamed from: a  reason: collision with root package name */
    private final C15054a f96841a;

    /* renamed from: b  reason: collision with root package name */
    private final a f96842b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.checkout.usecase.CheckoutStatusUseCase", f = "CheckoutStatusUseCase.kt", l = {26}, m = "invoke")
    /* renamed from: dj.a$a  reason: collision with other inner class name */
    static final class C2146a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96843c;

        /* renamed from: d  reason: collision with root package name */
        Object f96844d;

        /* renamed from: e  reason: collision with root package name */
        Object f96845e;

        /* renamed from: f  reason: collision with root package name */
        Object f96846f;

        /* renamed from: g  reason: collision with root package name */
        Object f96847g;

        /* renamed from: h  reason: collision with root package name */
        Object f96848h;

        /* renamed from: i  reason: collision with root package name */
        long f96849i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f96850j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C11193a f96851k;

        /* renamed from: l  reason: collision with root package name */
        int f96852l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2146a(C11193a aVar, C17164e<? super C2146a> eVar) {
            super(eVar);
            this.f96851k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96850j = obj;
            this.f96852l |= Integer.MIN_VALUE;
            return this.f96851k.a((String) null, (String) null, 0, (Kj.a) null, (C15007A) null, this);
        }
    }

    public C11193a(C15054a aVar, a aVar2) {
        C17542s.j(aVar, "checkoutRepository");
        C17542s.j(aVar2, "scanAndGoAnalytics");
        this.f96841a = aVar;
        this.f96842b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r14, java.lang.String r15, long r16, Kj.a r18, rz.C15007A r19, dI.C17164e<? super rz.C> r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r20
            boolean r2 = r1 instanceof dj.C11193a.C2146a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            dj.a$a r2 = (dj.C11193a.C2146a) r2
            int r3 = r2.f96852l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f96852l = r3
        L_0x0015:
            r8 = r2
            goto L_0x001d
        L_0x0017:
            dj.a$a r2 = new dj.a$a
            r2.<init>(r13, r1)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r2 = r8.f96850j
            java.lang.Object r9 = eI.C17187b.f()
            int r3 = r8.f96852l
            r10 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 != r10) goto L_0x0048
            java.lang.Object r1 = r8.f96848h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r8.f96847g
            rz.A r1 = (rz.C15007A) r1
            java.lang.Object r3 = r8.f96846f
            Kj.a r3 = (Kj.a) r3
            java.lang.Object r4 = r8.f96845e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r8.f96844d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r8.f96843c
            dj.a r4 = (dj.C11193a) r4
            XH.y.b(r2)
            r12 = r1
            r11 = r3
            goto L_0x0076
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            XH.y.b(r2)
            sz.a r3 = r0.f96841a
            r8.f96843c = r0
            r2 = r14
            r8.f96844d = r2
            r5 = r15
            r8.f96845e = r5
            r11 = r18
            r8.f96846f = r11
            r12 = r19
            r8.f96847g = r12
            r8.f96848h = r1
            r6 = r16
            r8.f96849i = r6
            r8.f96852l = r10
            r4 = r14
            java.lang.Object r2 = r3.b(r4, r5, r6, r8)
            if (r2 != r9) goto L_0x0075
            return r9
        L_0x0075:
            r4 = r0
        L_0x0076:
            rz.C r2 = (rz.C) r2
            boolean r1 = r2 instanceof rz.C.b
            if (r1 == 0) goto L_0x008d
            Sy.a r1 = r4.f96842b
            java.lang.String r3 = r2.toString()
            r4 = r2
            rz.C$b r4 = (rz.C.b) r4
            java.lang.String r4 = r4.a()
            r1.t(r3, r4)
            goto L_0x00be
        L_0x008d:
            boolean r1 = r2 instanceof rz.C.c
            r3 = 0
            if (r1 == 0) goto L_0x00a0
            Sy.a r1 = r4.f96842b
            rz.B r4 = r12.f()
            if (r4 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r10 = r3
        L_0x009c:
            r1.F(r10)
            goto L_0x00be
        L_0x00a0:
            boolean r1 = r2 instanceof rz.C.d
            if (r1 == 0) goto L_0x00b6
            boolean r1 = r11 instanceof Kj.a.d
            if (r1 != 0) goto L_0x00be
            Sy.a r1 = r4.f96842b
            rz.B r4 = r12.f()
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r10 = r3
        L_0x00b2:
            r1.f(r10)
            goto L_0x00be
        L_0x00b6:
            rz.C$e r1 = rz.C.e.f130717a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r2, r1)
            if (r1 == 0) goto L_0x00bf
        L_0x00be:
            return r2
        L_0x00bf:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C11193a.a(java.lang.String, java.lang.String, long, Kj.a, rz.A, dI.e):java.lang.Object");
    }
}
