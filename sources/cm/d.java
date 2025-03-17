package Cm;

import Am.a;
import Mm.g;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"LCm/d;", "LAm/a;", "LCm/b;", "benefitsRemoteSource", "LCm/e;", "benefitsLocalSource", "<init>", "(LCm/b;LCm/e;)V", "LTJ/g;", "LAm/a$a;", "c", "()LTJ/g;", "LMm/g;", "benefitId", "", "isFamilyMember", "LAm/a$b;", "b", "(LMm/g;ZLdI/e;)Ljava/lang/Object;", "LXH/N;", "a", "()V", "LCm/b;", "LCm/e;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements Am.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f79586a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f79587b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LAm/a$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.benefits.impl.data.BenefitsRepositoryImpl$getFamilyBenefits$1", f = "BenefitsRepositoryImpl.kt", l = {20, 22, 26, 29}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super a.C1458a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79588c;

        /* renamed from: d  reason: collision with root package name */
        Object f79589d;

        /* renamed from: e  reason: collision with root package name */
        Object f79590e;

        /* renamed from: f  reason: collision with root package name */
        Object f79591f;

        /* renamed from: g  reason: collision with root package name */
        int f79592g;

        /* renamed from: h  reason: collision with root package name */
        int f79593h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f79594i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f79595j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f79595j = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f79595j, eVar);
            aVar.f79594i = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super a.C1458a> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f79593h
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0055
                if (r1 == r5) goto L_0x0048
                if (r1 == r4) goto L_0x0036
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r9.f79591f
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                goto L_0x0025
            L_0x0019:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                java.lang.Object r0 = r9.f79591f
                Mm.d r0 = (Mm.d) r0
            L_0x0025:
                java.lang.Object r0 = r9.f79590e
                Cm.d r0 = (Cm.d) r0
                java.lang.Object r0 = r9.f79588c
                Mm.d r0 = (Mm.d) r0
                java.lang.Object r0 = r9.f79594i
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r10)
                goto L_0x00d5
            L_0x0036:
                java.lang.Object r1 = r9.f79588c
                Mm.d r1 = (Mm.d) r1
                java.lang.Object r4 = r9.f79594i
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r10)
                XH.x r10 = (XH.x) r10
                java.lang.Object r10 = r10.j()
                goto L_0x008e
            L_0x0048:
                java.lang.Object r1 = r9.f79588c
                Mm.d r1 = (Mm.d) r1
                java.lang.Object r5 = r9.f79594i
                TJ.h r5 = (TJ.C16533h) r5
                XH.y.b(r10)
                r10 = r5
                goto L_0x0078
            L_0x0055:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f79594i
                TJ.h r10 = (TJ.C16533h) r10
                Cm.d r1 = r9.f79595j
                Cm.e r1 = r1.f79587b
                Mm.d r1 = r1.a()
                Am.a$a$b r6 = new Am.a$a$b
                r6.<init>(r1)
                r9.f79594i = r10
                r9.f79588c = r1
                r9.f79593h = r5
                java.lang.Object r5 = r10.emit(r6, r9)
                if (r5 != r0) goto L_0x0078
                return r0
            L_0x0078:
                Cm.d r5 = r9.f79595j
                Cm.b r5 = r5.f79586a
                r9.f79594i = r10
                r9.f79588c = r1
                r9.f79593h = r4
                java.lang.Object r4 = r5.a(r9)
                if (r4 != r0) goto L_0x008b
                return r0
            L_0x008b:
                r8 = r4
                r4 = r10
                r10 = r8
            L_0x008e:
                Cm.d r5 = r9.f79595j
                java.lang.Throwable r6 = XH.x.e(r10)
                r7 = 0
                if (r6 != 0) goto L_0x00bb
                r2 = r10
                Mm.d r2 = (Mm.d) r2
                Cm.e r6 = r5.f79587b
                r6.b(r2)
                Am.a$a$c r6 = new Am.a$a$c
                r6.<init>(r2)
                r9.f79594i = r4
                r9.f79588c = r1
                r9.f79589d = r10
                r9.f79590e = r5
                r9.f79591f = r2
                r9.f79592g = r7
                r9.f79593h = r3
                java.lang.Object r10 = r4.emit(r6, r9)
                if (r10 != r0) goto L_0x00d5
                return r0
            L_0x00bb:
                Am.a$a$a r3 = new Am.a$a$a
                r3.<init>(r6, r1)
                r9.f79594i = r4
                r9.f79588c = r1
                r9.f79589d = r10
                r9.f79590e = r5
                r9.f79591f = r6
                r9.f79592g = r7
                r9.f79593h = r2
                java.lang.Object r10 = r4.emit(r3, r9)
                if (r10 != r0) goto L_0x00d5
                return r0
            L_0x00d5:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Cm.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.benefits.impl.data.BenefitsRepositoryImpl", f = "BenefitsRepositoryImpl.kt", l = {43}, m = "getStoreBenefit")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79596c;

        /* renamed from: d  reason: collision with root package name */
        Object f79597d;

        /* renamed from: e  reason: collision with root package name */
        Object f79598e;

        /* renamed from: f  reason: collision with root package name */
        boolean f79599f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f79600g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f79601h;

        /* renamed from: i  reason: collision with root package name */
        int f79602i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f79601h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79600g = obj;
            this.f79602i |= Integer.MIN_VALUE;
            return this.f79601h.b((g) null, false, this);
        }
    }

    public d(b bVar, e eVar) {
        C17542s.j(bVar, "benefitsRemoteSource");
        C17542s.j(eVar, "benefitsLocalSource");
        this.f79586a = bVar;
        this.f79587b = eVar;
    }

    public void a() {
        this.f79587b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(Mm.g r6, boolean r7, dI.C17164e<? super Am.a.b> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Cm.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Cm.d$b r0 = (Cm.d.b) r0
            int r1 = r0.f79602i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79602i = r1
            goto L_0x0018
        L_0x0013:
            Cm.d$b r0 = new Cm.d$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f79600g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79602i
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f79598e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f79597d
            Mm.g r6 = (Mm.g) r6
            java.lang.Object r6 = r0.f79596c
            Cm.d r6 = (Cm.d) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0059
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            Cm.b r1 = r5.f79586a
            r0.f79596c = r5
            r0.f79597d = r6
            r0.f79598e = r8
            r0.f79599f = r7
            r0.f79602i = r4
            java.lang.Object r6 = r1.b(r6, r7, r0)
            if (r6 != r2) goto L_0x0059
            return r2
        L_0x0059:
            java.lang.Throwable r7 = XH.x.e(r6)
            if (r7 != 0) goto L_0x0067
            Mm.a r6 = (Mm.a) r6
            Am.a$b$a r7 = new Am.a$b$a
            r7.<init>(r6)
            goto L_0x0069
        L_0x0067:
            Am.a$b$b r7 = Am.a.b.C1461b.f78978a
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Cm.d.b(Mm.g, boolean, dI.e):java.lang.Object");
    }

    public C16532g<a.C1458a> c() {
        return C16534i.H(new a(this, (C17164e<? super a>) null));
    }
}
