package Cm;

import Em.d;
import Mm.g;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LCm/c;", "LCm/b;", "LDm/a;", "benefitsEndPoint", "LEm/d;", "familyBenefitsToLocalMapper", "LEm/b;", "benefitToLocalMapper", "<init>", "(LDm/a;LEm/d;LEm/b;)V", "LXH/x;", "LMm/d;", "a", "(LdI/e;)Ljava/lang/Object;", "LMm/g;", "benefitId", "", "isFamilyMember", "LMm/a;", "b", "(LMm/g;ZLdI/e;)Ljava/lang/Object;", "LDm/a;", "LEm/d;", "c", "LEm/b;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Dm.a f79561a;

    /* renamed from: b  reason: collision with root package name */
    private final d f79562b;

    /* renamed from: c  reason: collision with root package name */
    private final Em.b f79563c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.benefits.impl.data.BenefitsRemoteSourceImpl", f = "BenefitsRemoteSource.kt", l = {39}, m = "getFamilyBenefits-IoAF18A")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79564c;

        /* renamed from: d  reason: collision with root package name */
        Object f79565d;

        /* renamed from: e  reason: collision with root package name */
        Object f79566e;

        /* renamed from: f  reason: collision with root package name */
        Object f79567f;

        /* renamed from: g  reason: collision with root package name */
        Object f79568g;

        /* renamed from: h  reason: collision with root package name */
        int f79569h;

        /* renamed from: i  reason: collision with root package name */
        int f79570i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f79571j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f79572k;

        /* renamed from: l  reason: collision with root package name */
        int f79573l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79572k = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79571j = obj;
            this.f79573l |= Integer.MIN_VALUE;
            Object a10 = this.f79572k.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.benefits.impl.data.BenefitsRemoteSourceImpl", f = "BenefitsRemoteSource.kt", l = {48}, m = "getStoreBenefits-0E7RQCE")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79574c;

        /* renamed from: d  reason: collision with root package name */
        Object f79575d;

        /* renamed from: e  reason: collision with root package name */
        Object f79576e;

        /* renamed from: f  reason: collision with root package name */
        Object f79577f;

        /* renamed from: g  reason: collision with root package name */
        Object f79578g;

        /* renamed from: h  reason: collision with root package name */
        Object f79579h;

        /* renamed from: i  reason: collision with root package name */
        boolean f79580i;

        /* renamed from: j  reason: collision with root package name */
        int f79581j;

        /* renamed from: k  reason: collision with root package name */
        int f79582k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f79583l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f79584m;

        /* renamed from: n  reason: collision with root package name */
        int f79585n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f79584m = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79583l = obj;
            this.f79585n |= Integer.MIN_VALUE;
            Object b10 = this.f79584m.b((g) null, false, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public c(Dm.a aVar, d dVar, Em.b bVar) {
        C17542s.j(aVar, "benefitsEndPoint");
        C17542s.j(dVar, "familyBenefitsToLocalMapper");
        C17542s.j(bVar, "benefitToLocalMapper");
        this.f79561a = aVar;
        this.f79562b = dVar;
        this.f79563c = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.x<Mm.d>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Cm.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Cm.c$a r0 = (Cm.c.a) r0
            int r1 = r0.f79573l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79573l = r1
            goto L_0x0018
        L_0x0013:
            Cm.c$a r0 = new Cm.c$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f79571j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79573l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r7 = r0.f79568g
            Em.d r7 = (Em.d) r7
            java.lang.Object r2 = r0.f79567f
            Cm.c r2 = (Cm.c) r2
            java.lang.Object r2 = r0.f79566e
            Cm.c r2 = (Cm.c) r2
            java.lang.Object r2 = r0.f79565d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f79564c
            Cm.c r0 = (Cm.c) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x006d
        L_0x003d:
            r7 = move-exception
            goto L_0x0078
        L_0x003f:
            r7 = move-exception
            goto L_0x0083
        L_0x0041:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            Em.d r1 = r6.f79562b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            Dm.a r3 = r6.f79561a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79564c = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79565d = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79566e = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79567f = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79568g = r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f79569h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79570i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f79573l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r7 = r3.b(r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r7 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x006d:
            com.ingka.ikea.benefits.impl.data.models.remote.BenefitsRemote r1 = (com.ingka.ikea.benefits.impl.data.models.remote.BenefitsRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            Mm.d r7 = r7.a(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r7 = XH.x.b(r7)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0082
        L_0x0078:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x0082:
            return r7
        L_0x0083:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Cm.c.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(Mm.g r10, boolean r11, dI.C17164e<? super XH.x<Mm.a>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof Cm.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            Cm.c$b r0 = (Cm.c.b) r0
            int r1 = r0.f79585n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79585n = r1
            goto L_0x0018
        L_0x0013:
            Cm.c$b r0 = new Cm.c$b
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f79583l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79585n
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r10 = r0.f79579h
            Em.b r10 = (Em.b) r10
            java.lang.Object r11 = r0.f79578g
            Cm.c r11 = (Cm.c) r11
            java.lang.Object r11 = r0.f79577f
            Cm.c r11 = (Cm.c) r11
            java.lang.Object r11 = r0.f79576e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f79575d
            Mm.g r11 = (Mm.g) r11
            java.lang.Object r11 = r0.f79574c
            Cm.c r11 = (Cm.c) r11
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x007d
        L_0x0041:
            r10 = move-exception
            goto L_0x0088
        L_0x0043:
            r10 = move-exception
            goto L_0x0093
        L_0x0045:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004d:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            Em.b r1 = r9.f79563c     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            Dm.a r3 = r9.f79561a     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.String r5 = r10.b()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r6 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r11)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79574c = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79575d = r10     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79576e = r12     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79577f = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79578g = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79579h = r1     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79580i = r11     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79581j = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79582k = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f79585n = r4     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r10 = r3.a(r5, r7, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r10 != r2) goto L_0x007a
            return r2
        L_0x007a:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x007d:
            com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote r1 = (com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote) r1     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            Mm.a r10 = r10.a(r1)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r10 = XH.x.b(r10)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x0092
        L_0x0088:
            XH.x$a r11 = XH.x.f139812b
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
        L_0x0092:
            return r10
        L_0x0093:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Cm.c.b(Mm.g, boolean, dI.e):java.lang.Object");
    }
}
