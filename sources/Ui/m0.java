package UI;

import CI.C15496c;
import DI.C15555b;
import DI.C15561h;
import DI.C15572s;
import DI.d0;
import DI.n0;
import DI.u0;
import EI.C15642a;
import EI.C15649h;
import MI.C16059c;
import PI.C16193c;
import PI.C16201k;
import QI.C16267j;
import QI.C16271n;
import TI.C16497a;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import uJ.C18096U;
import uJ.C18111e0;
import uJ.M0;
import uJ.P0;
import zJ.C18755d;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final C16586g f139051a;

    public m0(C16586g gVar) {
        C17542s.j(gVar, "typeEnhancement");
        this.f139051a = gVar;
    }

    private final boolean f(C18096U u10) {
        return M0.c(u10, l0.f139049a);
    }

    /* access modifiers changed from: private */
    public static final Boolean g(P0 p02) {
        C15561h e10 = p02.N0().e();
        if (e10 == null) {
            return Boolean.FALSE;
        }
        C17069f name = e10.getName();
        C15496c cVar = C15496c.f133492a;
        return Boolean.valueOf(C17542s.e(name, cVar.h().f()) && C17542s.e(C17506e.k(e10), cVar.h()));
    }

    private final C18096U h(C15555b bVar, C15642a aVar, boolean z10, C16201k kVar, C16059c cVar, r0 r0Var, boolean z11, C17642l<? super C15555b, ? extends C18096U> lVar) {
        C17642l<? super C15555b, ? extends C18096U> lVar2 = lVar;
        o0 o0Var = new o0(aVar, z10, kVar, cVar, false, 16, (DefaultConstructorMarker) null);
        C15555b bVar2 = bVar;
        C18096U u10 = (C18096U) lVar2.invoke(bVar);
        Collection<? extends C15555b> e10 = bVar.e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        Iterable<C15555b> iterable = e10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15555b bVar3 : iterable) {
            C17542s.g(bVar3);
            arrayList.add((C18096U) lVar2.invoke(bVar3));
        }
        return i(o0Var, u10, arrayList, r0Var, z11);
    }

    private final C18096U i(o0 o0Var, C18096U u10, List<? extends C18096U> list, r0 r0Var, boolean z10) {
        return this.f139051a.a(u10, o0Var.d(u10, list, r0Var, z10), o0Var.z());
    }

    static /* synthetic */ C18096U j(m0 m0Var, C15555b bVar, C15642a aVar, boolean z10, C16201k kVar, C16059c cVar, r0 r0Var, boolean z11, C17642l lVar, int i10, Object obj) {
        return m0Var.h(bVar, aVar, z10, kVar, cVar, r0Var, (i10 & 32) != 0 ? false : z11, lVar);
    }

    static /* synthetic */ C18096U k(m0 m0Var, o0 o0Var, C18096U u10, List list, r0 r0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            r0Var = null;
        }
        r0 r0Var2 = r0Var;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return m0Var.i(o0Var, u10, list, r0Var2, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends DI.C15555b> D l(D r22, PI.C16201k r23) {
        /*
            r21 = this;
            r11 = r21
            r12 = r22
            boolean r0 = r12 instanceof OI.C16159a
            if (r0 != 0) goto L_0x0009
            return r12
        L_0x0009:
            DI.b$a r0 = r22.h()
            DI.b$a r1 = DI.C15555b.a.FAKE_OVERRIDE
            r13 = 1
            if (r0 != r1) goto L_0x0021
            DI.b r0 = r22.a()
            java.util.Collection r0 = r0.e()
            int r0 = r0.size()
            if (r0 != r13) goto L_0x0021
            return r12
        L_0x0021:
            EI.h r0 = r21.u(r22, r23)
            r7 = r23
            PI.k r8 = PI.C16193c.k(r7, r0)
            boolean r0 = r12 instanceof OI.C16164f
            if (r0 == 0) goto L_0x0047
            r0 = r12
            GI.K r0 = (GI.C15717K) r0
            GI.L r1 = r0.d()
            if (r1 == 0) goto L_0x0047
            boolean r1 = r1.H()
            if (r1 != 0) goto L_0x0047
            GI.L r0 = r0.d()
            kotlin.jvm.internal.C17542s.g(r0)
            r9 = r0
            goto L_0x0048
        L_0x0047:
            r9 = r12
        L_0x0048:
            DI.d0 r0 = r22.O()
            r14 = 0
            if (r0 == 0) goto L_0x0074
            boolean r0 = r9 instanceof DI.C15579z
            if (r0 == 0) goto L_0x0057
            r0 = r9
            DI.z r0 = (DI.C15579z) r0
            goto L_0x0058
        L_0x0057:
            r0 = r14
        L_0x0058:
            if (r0 == 0) goto L_0x0064
            DI.a$a<DI.u0> r1 = OI.C16163e.f136911G
            java.lang.Object r0 = r0.T(r1)
            DI.u0 r0 = (DI.u0) r0
            r2 = r0
            goto L_0x0065
        L_0x0064:
            r2 = r14
        L_0x0065:
            r5 = 0
            UI.h0 r6 = UI.h0.f139042a
            r4 = 0
            r0 = r21
            r1 = r22
            r3 = r8
            uJ.U r0 = r0.t(r1, r2, r3, r4, r5, r6)
            r15 = r0
            goto L_0x0075
        L_0x0074:
            r15 = r14
        L_0x0075:
            boolean r0 = r12 instanceof OI.C16163e
            if (r0 == 0) goto L_0x007d
            r0 = r12
            OI.e r0 = (OI.C16163e) r0
            goto L_0x007e
        L_0x007d:
            r0 = r14
        L_0x007e:
            r10 = 0
            if (r0 == 0) goto L_0x00d3
            VI.F r1 = VI.C16664F.f139318a
            DI.m r2 = r0.b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C17542s.h(r2, r3)
            DI.e r2 = (DI.C15558e) r2
            r3 = 3
            java.lang.String r0 = VI.C16661C.c(r0, r10, r10, r3, r14)
            java.lang.String r0 = VI.C16660B.a(r1, r2, r0)
            if (r0 == 0) goto L_0x00d3
            java.util.Map r1 = UI.f0.K0()
            java.lang.Object r0 = r1.get(r0)
            UI.g0 r0 = (UI.g0) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L_0x00bb
            java.lang.String r2 = "2."
            r3 = 2
            boolean r1 = HJ.C15854t.W(r1, r2, r10, r3, r14)
            if (r1 != r13) goto L_0x00bb
            goto L_0x00c3
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.lang.String r1 = r0.a()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            UI.g0 r0 = r0.d()
            goto L_0x00d0
        L_0x00cf:
            r0 = r14
        L_0x00d0:
            r16 = r0
            goto L_0x00d5
        L_0x00d3:
            r16 = r14
        L_0x00d5:
            if (r16 == 0) goto L_0x00e8
            java.util.List r0 = r16.b()
            r0.size()
            r0 = r12
            OI.e r0 = (OI.C16163e) r0
            java.util.List r0 = r0.j()
            r0.size()
        L_0x00e8:
            PI.d r0 = r23.a()
            MI.D r0 = r0.i()
            boolean r0 = MI.V.c(r0)
            if (r0 != 0) goto L_0x0104
            PI.d r0 = r8.a()
            PI.e r0 = r0.q()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x010c
        L_0x0104:
            boolean r0 = MI.V.b(r22)
            if (r0 == 0) goto L_0x010c
            r7 = r13
            goto L_0x010d
        L_0x010c:
            r7 = r10
        L_0x010d:
            java.util.List r0 = r9.j()
            java.lang.String r6 = "getValueParameters(...)"
            kotlin.jvm.internal.C17542s.i(r0, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r4 = 10
            int r1 = YH.C16877v.y(r0, r4)
            r5.<init>(r1)
            java.util.Iterator r17 = r0.iterator()
        L_0x0127:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r17.next()
            r2 = r0
            DI.u0 r2 = (DI.u0) r2
            if (r16 == 0) goto L_0x0149
            java.util.List r0 = r16.b()
            if (r0 == 0) goto L_0x0149
            int r1 = r2.getIndex()
            java.lang.Object r0 = YH.C16877v.z0(r0, r1)
            UI.r0 r0 = (UI.r0) r0
            r18 = r0
            goto L_0x014b
        L_0x0149:
            r18 = r14
        L_0x014b:
            UI.i0 r3 = new UI.i0
            r3.<init>(r2)
            r0 = r21
            r1 = r22
            r19 = r3
            r3 = r8
            r14 = r4
            r4 = r18
            r14 = r5
            r5 = r7
            r20 = r6
            r6 = r19
            uJ.U r0 = r0.t(r1, r2, r3, r4, r5, r6)
            r14.add(r0)
            r5 = r14
            r6 = r20
            r4 = 10
            r14 = 0
            goto L_0x0127
        L_0x016e:
            r14 = r5
            r20 = r6
            boolean r0 = r12 instanceof DI.a0
            if (r0 == 0) goto L_0x0179
            r0 = r12
            DI.a0 r0 = (DI.a0) r0
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            if (r0 == 0) goto L_0x0186
            boolean r0 = QI.C16261d.a(r0)
            if (r0 != r13) goto L_0x0186
            MI.c r0 = MI.C16059c.FIELD
        L_0x0184:
            r5 = r0
            goto L_0x0189
        L_0x0186:
            MI.c r0 = MI.C16059c.METHOD_RETURN_TYPE
            goto L_0x0184
        L_0x0189:
            if (r16 == 0) goto L_0x0191
            UI.r0 r0 = r16.c()
            r6 = r0
            goto L_0x0192
        L_0x0191:
            r6 = 0
        L_0x0192:
            UI.j0 r16 = UI.j0.f139045a
            r17 = 32
            r19 = 0
            r3 = 1
            r7 = 0
            r0 = r21
            r1 = r22
            r2 = r9
            r4 = r8
            r8 = r16
            r9 = r17
            r16 = r10
            r10 = r19
            uJ.U r0 = j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            uJ.U r1 = r22.getReturnType()
            kotlin.jvm.internal.C17542s.g(r1)
            boolean r1 = r11.f(r1)
            java.lang.String r2 = "getType(...)"
            if (r1 != 0) goto L_0x020f
            DI.d0 r1 = r22.O()
            if (r1 == 0) goto L_0x01cc
            uJ.U r1 = r1.getType()
            if (r1 == 0) goto L_0x01cc
            boolean r10 = r11.f(r1)
            goto L_0x01ce
        L_0x01cc:
            r10 = r16
        L_0x01ce:
            if (r10 != 0) goto L_0x020f
            java.util.List r1 = r22.j()
            r3 = r20
            kotlin.jvm.internal.C17542s.i(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x01eb
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01eb
        L_0x01e8:
            r10 = r16
            goto L_0x0209
        L_0x01eb:
            java.util.Iterator r1 = r1.iterator()
        L_0x01ef:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01e8
            java.lang.Object r3 = r1.next()
            DI.u0 r3 = (DI.u0) r3
            uJ.U r3 = r3.getType()
            kotlin.jvm.internal.C17542s.i(r3, r2)
            boolean r3 = r11.f(r3)
            if (r3 == 0) goto L_0x01ef
            r10 = r13
        L_0x0209:
            if (r10 == 0) goto L_0x020c
            goto L_0x020f
        L_0x020c:
            r10 = r16
            goto L_0x0210
        L_0x020f:
            r10 = r13
        L_0x0210:
            if (r10 == 0) goto L_0x0220
            DI.a$a r1 = jJ.C17435d.a()
            MI.n r3 = new MI.n
            r3.<init>(r12)
            XH.v r1 = XH.C16796C.a(r1, r3)
            goto L_0x0221
        L_0x0220:
            r1 = 0
        L_0x0221:
            if (r15 != 0) goto L_0x024c
            if (r0 != 0) goto L_0x024c
            boolean r3 = r14.isEmpty()
            if (r3 == 0) goto L_0x022e
        L_0x022b:
            r13 = r16
            goto L_0x0246
        L_0x022e:
            java.util.Iterator r3 = r14.iterator()
        L_0x0232:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x022b
            java.lang.Object r4 = r3.next()
            uJ.U r4 = (uJ.C18096U) r4
            if (r4 == 0) goto L_0x0242
            r10 = r13
            goto L_0x0244
        L_0x0242:
            r10 = r16
        L_0x0244:
            if (r10 == 0) goto L_0x0232
        L_0x0246:
            if (r13 != 0) goto L_0x024c
            if (r1 == 0) goto L_0x024b
            goto L_0x024c
        L_0x024b:
            return r12
        L_0x024c:
            r3 = r12
            OI.a r3 = (OI.C16159a) r3
            if (r15 != 0) goto L_0x025e
            DI.d0 r4 = r22.O()
            if (r4 == 0) goto L_0x025d
            uJ.U r4 = r4.getType()
            r15 = r4
            goto L_0x025e
        L_0x025d:
            r15 = 0
        L_0x025e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r14, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r14.iterator()
            r10 = r16
        L_0x026f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x029a
            java.lang.Object r6 = r5.next()
            int r7 = r10 + 1
            if (r10 >= 0) goto L_0x0280
            YH.C16877v.x()
        L_0x0280:
            uJ.U r6 = (uJ.C18096U) r6
            if (r6 != 0) goto L_0x0295
            java.util.List r6 = r22.j()
            java.lang.Object r6 = r6.get(r10)
            DI.u0 r6 = (DI.u0) r6
            uJ.U r6 = r6.getType()
            kotlin.jvm.internal.C17542s.i(r6, r2)
        L_0x0295:
            r4.add(r6)
            r10 = r7
            goto L_0x026f
        L_0x029a:
            if (r0 != 0) goto L_0x02a3
            uJ.U r0 = r22.getReturnType()
            kotlin.jvm.internal.C17542s.g(r0)
        L_0x02a3:
            OI.a r0 = r3.n0(r15, r4, r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: UI.m0.l(DI.b, PI.k):DI.b");
    }

    /* access modifiers changed from: private */
    public static final C18096U m(C15555b bVar) {
        C17542s.j(bVar, "it");
        C18096U returnType = bVar.getReturnType();
        C17542s.g(returnType);
        return returnType;
    }

    /* access modifiers changed from: private */
    public static final C18096U n(C15555b bVar) {
        C17542s.j(bVar, "it");
        d0 O10 = bVar.O();
        C17542s.g(O10);
        C18096U type = O10.getType();
        C17542s.i(type, "getType(...)");
        return type;
    }

    /* access modifiers changed from: private */
    public static final C18096U o(u0 u0Var, C15555b bVar) {
        C17542s.j(bVar, "it");
        C18096U type = bVar.j().get(u0Var.getIndex()).getType();
        C17542s.i(type, "getType(...)");
        return type;
    }

    /* access modifiers changed from: private */
    public static final boolean s(P0 p02) {
        C17542s.j(p02, "it");
        return p02 instanceof C18111e0;
    }

    private final C18096U t(C15555b bVar, u0 u0Var, C16201k kVar, r0 r0Var, boolean z10, C17642l<? super C15555b, ? extends C18096U> lVar) {
        C16201k kVar2;
        C16201k kVar3;
        if (u0Var != null) {
            kVar3 = kVar;
            C16201k k10 = C16193c.k(kVar, u0Var.getAnnotations());
            if (k10 != null) {
                kVar2 = k10;
                return h(bVar, u0Var, false, kVar2, C16059c.VALUE_PARAMETER, r0Var, z10, lVar);
            }
        } else {
            kVar3 = kVar;
        }
        kVar2 = kVar3;
        return h(bVar, u0Var, false, kVar2, C16059c.VALUE_PARAMETER, r0Var, z10, lVar);
    }

    private final <D extends C15555b> C15649h u(D d10, C16201k kVar) {
        C15561h a10 = C15572s.a(d10);
        if (a10 == null) {
            return d10.getAnnotations();
        }
        List<C16497a> list = null;
        C16271n nVar = a10 instanceof C16271n ? (C16271n) a10 : null;
        if (nVar != null) {
            list = nVar.T0();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            return d10.getAnnotations();
        }
        Iterable<C16497a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16497a jVar : iterable) {
            arrayList.add(new C16267j(kVar, jVar, true));
        }
        return C15649h.f134231V.a(C16877v.T0(d10.getAnnotations(), arrayList));
    }

    public final <D extends C15555b> Collection<D> p(C16201k kVar, Collection<? extends D> collection) {
        C17542s.j(kVar, "c");
        C17542s.j(collection, "platformSignatures");
        Iterable<C15555b> iterable = collection;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15555b l10 : iterable) {
            arrayList.add(l(l10, kVar));
        }
        return arrayList;
    }

    public final C18096U q(C18096U u10, C16201k kVar) {
        C17542s.j(u10, "type");
        C17542s.j(kVar, "context");
        C18096U k10 = k(this, new o0((C15642a) null, false, kVar, C16059c.TYPE_USE, true), u10, C16877v.n(), (r0) null, false, 12, (Object) null);
        return k10 == null ? u10 : k10;
    }

    public final List<C18096U> r(n0 n0Var, List<? extends C18096U> list, C16201k kVar) {
        C17542s.j(n0Var, "typeParameter");
        C17542s.j(list, "bounds");
        C17542s.j(kVar, "context");
        Iterable<C18096U> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C18096U u10 : iterable) {
            if (!C18755d.e(u10, k0.f139046a)) {
                C18096U u11 = u10;
                C18096U k10 = k(this, new o0(n0Var, false, kVar, C16059c.TYPE_PARAMETER_BOUNDS, false, 16, (DefaultConstructorMarker) null), u11, C16877v.n(), (r0) null, false, 12, (Object) null);
                if (k10 != null) {
                    u10 = k10;
                }
            }
            arrayList.add(u10);
        }
        return arrayList;
    }
}
