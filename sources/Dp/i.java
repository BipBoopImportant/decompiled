package Dp;

import Cp.d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LDp/i;", "LCp/d;", "LSl/b;", "getMarketLinksUseCase", "<init>", "(LSl/b;)V", "", "LCp/c;", "b", "(LdI/e;)Ljava/lang/Object;", "", "a", "LSl/b;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Sl.b f80118a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.dataethics.impl.EthicsRepository", f = "EthicsRepository.kt", l = {28}, m = "getCardList")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80119c;

        /* renamed from: d  reason: collision with root package name */
        Object f80120d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80121e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f80122f;

        /* renamed from: g  reason: collision with root package name */
        int f80123g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f80122f = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80121e = obj;
            this.f80123g |= Integer.MIN_VALUE;
            return this.f80122f.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.dataethics.impl.EthicsRepository", f = "EthicsRepository.kt", l = {79}, m = "getPrivacyPolicyLink")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80124c;

        /* renamed from: d  reason: collision with root package name */
        Object f80125d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80126e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f80127f;

        /* renamed from: g  reason: collision with root package name */
        int f80128g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f80127f = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80126e = obj;
            this.f80128g |= Integer.MIN_VALUE;
            return this.f80127f.a(this);
        }
    }

    public i(Sl.b bVar) {
        C17542s.j(bVar, "getMarketLinksUseCase");
        this.f80118a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.String> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof Dp.i.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Dp.i$b r0 = (Dp.i.b) r0
            int r1 = r0.f80128g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80128g = r1
            goto L_0x0018
        L_0x0013:
            Dp.i$b r0 = new Dp.i$b
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f80126e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80128g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r15 = r0.f80125d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f80124c
            Dp.i r15 = (Dp.i) r15
            XH.y.b(r1)
            goto L_0x004e
        L_0x0031:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0039:
            XH.y.b(r1)
            Sl.b r1 = r14.f80118a
            Sl.g r3 = Sl.g.PrivacyPolicy
            r0.f80124c = r14
            r0.f80125d = r15
            r0.f80128g = r4
            java.lang.Object r1 = Sl.c.a(r1, r3, r0)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            r15 = r14
        L_0x004e:
            Sl.h r1 = (Sl.h) r1
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = r1.c()
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            java.lang.String r0 = ""
        L_0x005b:
            boolean r1 = HJ.C15854t.v0(r0)
            if (r1 == 0) goto L_0x0112
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Missing privacy policy link for data ethics cards."
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x007b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r3.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x007b
            r5.add(r6)
            goto L_0x007b
        L_0x0093:
            java.util.Iterator r3 = r5.iterator()
            r11 = 0
            r5 = r11
            r6 = r5
        L_0x009a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0112
            java.lang.Object r7 = r3.next()
            qv.b r7 = (qv.C11819b) r7
            if (r5 != 0) goto L_0x00b4
            java.lang.String r5 = qv.C11818a.a(r11, r1)
            if (r5 != 0) goto L_0x00b0
            goto L_0x0112
        L_0x00b0:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00b4:
            r12 = r5
            if (r6 != 0) goto L_0x0105
            java.lang.Class r5 = r15.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r8 = 2
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r11, r8, r11)
            r9 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r9, r11, r8, r11)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00d6
            goto L_0x00dc
        L_0x00d6:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x00dc:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r8, r4)
            if (r6 == 0) goto L_0x00ef
            java.lang.String r6 = "m"
            goto L_0x00f1
        L_0x00ef:
            java.lang.String r6 = "b"
        L_0x00f1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "|"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
        L_0x0105:
            r13 = r6
            r8 = 0
            r5 = r7
            r6 = r2
            r7 = r13
            r9 = r1
            r10 = r12
            r5.a(r6, r7, r8, r9, r10)
            r5 = r12
            r6 = r13
            goto L_0x009a
        L_0x0112:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Dp.i.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super java.util.List<Cp.c>> r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof Dp.i.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Dp.i$a r2 = (Dp.i.a) r2
            int r3 = r2.f80123g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f80123g = r3
            goto L_0x001c
        L_0x0017:
            Dp.i$a r2 = new Dp.i$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f80121e
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f80123g
            r6 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            java.lang.Object r1 = r2.f80120d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f80119c
            Dp.i r1 = (Dp.i) r1
            XH.y.b(r3)
            goto L_0x004d
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            XH.y.b(r3)
            r2.f80119c = r0
            r2.f80120d = r1
            r2.f80123g = r6
            java.lang.Object r3 = r0.a(r2)
            if (r3 != r4) goto L_0x004d
            return r4
        L_0x004d:
            java.lang.String r3 = (java.lang.String) r3
            Cp.c r1 = new Cp.c
            int r5 = lg.C10027d.f75279j
            int r6 = Oo.b.f84573Z5
            int r7 = Oo.b.f84473P5
            com.ingka.ikea.dataethics.EthicsDialogData r8 = new com.ingka.ikea.dataethics.EthicsDialogData
            int r2 = lg.C10027d.f75279j
            int r4 = Oo.b.f84573Z5
            int r9 = Oo.b.f84473P5
            r8.<init>(r2, r4, r9, r3)
            r10 = 16
            r11 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            Cp.c r2 = new Cp.c
            int r13 = lg.C10027d.f75271b
            int r14 = Oo.b.f84694k6
            int r15 = Oo.b.f84584a6
            com.ingka.ikea.dataethics.EthicsDialogData r4 = new com.ingka.ikea.dataethics.EthicsDialogData
            int r5 = lg.C10027d.f75271b
            int r6 = Oo.b.f84694k6
            int r7 = Oo.b.f84584a6
            r4.<init>(r5, r6, r7, r3)
            r18 = 16
            r19 = 0
            r17 = 0
            r12 = r2
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            Cp.c r4 = new Cp.c
            int r6 = lg.C10027d.f75272c
            int r7 = Oo.b.f84782s6
            int r8 = Oo.b.f84771r6
            com.ingka.ikea.dataethics.EthicsDialogData r9 = new com.ingka.ikea.dataethics.EthicsDialogData
            int r5 = lg.C10027d.f75272c
            int r10 = Oo.b.f84782s6
            int r11 = Oo.b.f84771r6
            r9.<init>(r5, r10, r11, r3)
            r11 = 16
            r12 = 0
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            Cp.c r5 = new Cp.c
            int r14 = lg.C10027d.f75274e
            int r15 = Oo.b.f84846y6
            int r16 = Oo.b.f84836x6
            com.ingka.ikea.dataethics.EthicsDialogData r6 = new com.ingka.ikea.dataethics.EthicsDialogData
            int r7 = lg.C10027d.f75274e
            int r8 = Oo.b.f84846y6
            int r9 = Oo.b.f84836x6
            r6.<init>(r7, r8, r9, r3)
            r19 = 16
            r20 = 0
            r18 = 0
            r13 = r5
            r17 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            Cp.c[] r1 = new Cp.c[]{r1, r2, r4, r5}
            java.util.List r1 = YH.C16877v.q(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Dp.i.b(dI.e):java.lang.Object");
    }
}
