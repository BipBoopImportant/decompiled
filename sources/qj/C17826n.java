package qJ;

import DI.C15538I;
import DI.C15543N;
import DI.C15544O;
import DI.C15545P;
import DI.C15558e;
import EI.C15644c;
import FI.C15685a;
import FI.C15686b;
import FI.C15687c;
import LI.C16016c;
import YH.C16877v;
import ZI.C17004a;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17065b;
import eJ.C17196g;
import iJ.C17373g;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import mJ.C17606a;
import sJ.C17942s;
import tJ.C17994n;
import uJ.t0;
import vJ.p;

/* renamed from: qJ.n  reason: case insensitive filesystem */
public final class C17826n {

    /* renamed from: a  reason: collision with root package name */
    private final C17994n f146568a;

    /* renamed from: b  reason: collision with root package name */
    private final C15538I f146569b;

    /* renamed from: c  reason: collision with root package name */
    private final C17827o f146570c;

    /* renamed from: d  reason: collision with root package name */
    private final C17822j f146571d;

    /* renamed from: e  reason: collision with root package name */
    private final C17817e<C15644c, C17373g<?>> f146572e;

    /* renamed from: f  reason: collision with root package name */
    private final C15545P f146573f;

    /* renamed from: g  reason: collision with root package name */
    private final C17789B f146574g;

    /* renamed from: h  reason: collision with root package name */
    private final C17835w f146575h;

    /* renamed from: i  reason: collision with root package name */
    private final C16016c f146576i;

    /* renamed from: j  reason: collision with root package name */
    private final C17836x f146577j;

    /* renamed from: k  reason: collision with root package name */
    private final Iterable<C15686b> f146578k;

    /* renamed from: l  reason: collision with root package name */
    private final C15543N f146579l;

    /* renamed from: m  reason: collision with root package name */
    private final C17825m f146580m;

    /* renamed from: n  reason: collision with root package name */
    private final C15685a f146581n;

    /* renamed from: o  reason: collision with root package name */
    private final C15687c f146582o;

    /* renamed from: p  reason: collision with root package name */
    private final C17196g f146583p;

    /* renamed from: q  reason: collision with root package name */
    private final p f146584q;

    /* renamed from: r  reason: collision with root package name */
    private final C17606a f146585r;

    /* renamed from: s  reason: collision with root package name */
    private final List<t0> f146586s;

    /* renamed from: t  reason: collision with root package name */
    private final C17834v f146587t;

    /* renamed from: u  reason: collision with root package name */
    private final C17824l f146588u;

    public C17826n(C17994n nVar, C15538I i10, C17827o oVar, C17822j jVar, C17817e<? extends C15644c, ? extends C17373g<?>> eVar, C15545P p10, C17789B b10, C17835w wVar, C16016c cVar, C17836x xVar, Iterable<? extends C15686b> iterable, C15543N n10, C17825m mVar, C15685a aVar, C15687c cVar2, C17196g gVar, p pVar, C17606a aVar2, List<? extends t0> list, C17834v vVar) {
        C17994n nVar2 = nVar;
        C15538I i11 = i10;
        C17827o oVar2 = oVar;
        C17822j jVar2 = jVar;
        C17817e<? extends C15644c, ? extends C17373g<?>> eVar2 = eVar;
        C15545P p11 = p10;
        C17789B b11 = b10;
        C17835w wVar2 = wVar;
        C16016c cVar3 = cVar;
        C17836x xVar2 = xVar;
        Iterable<? extends C15686b> iterable2 = iterable;
        C15543N n11 = n10;
        C17825m mVar2 = mVar;
        C15685a aVar3 = aVar;
        C17196g gVar2 = gVar;
        C17542s.j(nVar2, "storageManager");
        C17542s.j(i11, "moduleDescriptor");
        C17542s.j(oVar2, "configuration");
        C17542s.j(jVar2, "classDataFinder");
        C17542s.j(eVar2, "annotationAndConstantLoader");
        C17542s.j(p11, "packageFragmentProvider");
        C17542s.j(b11, "localClassifierTypeSettings");
        C17542s.j(wVar2, "errorReporter");
        C17542s.j(cVar3, "lookupTracker");
        C17542s.j(xVar2, "flexibleTypeDeserializer");
        C17542s.j(iterable2, "fictitiousClassDescriptorFactories");
        C17542s.j(n11, "notFoundClasses");
        C17542s.j(mVar2, "contractDeserializer");
        C17542s.j(aVar3, "additionalClassPartsProvider");
        C17542s.j(cVar2, "platformDependentDeclarationFilter");
        C17542s.j(gVar, "extensionRegistryLite");
        C17542s.j(pVar, "kotlinTypeChecker");
        C17542s.j(aVar2, "samConversionResolver");
        C17542s.j(list, "typeAttributeTranslators");
        C17542s.j(vVar, "enumEntriesDeserializationSupport");
        this.f146568a = nVar2;
        this.f146569b = i11;
        this.f146570c = oVar2;
        this.f146571d = jVar2;
        this.f146572e = eVar2;
        this.f146573f = p11;
        this.f146574g = b11;
        this.f146575h = wVar2;
        this.f146576i = cVar3;
        this.f146577j = xVar2;
        this.f146578k = iterable2;
        this.f146579l = n11;
        this.f146580m = mVar2;
        this.f146581n = aVar3;
        this.f146582o = cVar2;
        this.f146583p = gVar;
        this.f146584q = pVar;
        this.f146585r = aVar2;
        this.f146586s = list;
        this.f146587t = vVar;
        this.f146588u = new C17824l(this);
    }

    public final C17828p a(C15544O o10, c cVar, g gVar, h hVar, C17004a aVar, C17942s sVar) {
        C17542s.j(o10, "descriptor");
        c cVar2 = cVar;
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17542s.j(hVar, "versionRequirementTable");
        C17004a aVar2 = aVar;
        C17542s.j(aVar2, "metadataVersion");
        return new C17828p(this, cVar2, o10, gVar, hVar, aVar2, sVar, (C17810X) null, C16877v.n());
    }

    public final C15558e b(C17065b bVar) {
        C17542s.j(bVar, "classId");
        return C17824l.f(this.f146588u, bVar, (C17821i) null, 2, (Object) null);
    }

    public final C15685a c() {
        return this.f146581n;
    }

    public final C17817e<C15644c, C17373g<?>> d() {
        return this.f146572e;
    }

    public final C17822j e() {
        return this.f146571d;
    }

    public final C17824l f() {
        return this.f146588u;
    }

    public final C17827o g() {
        return this.f146570c;
    }

    public final C17825m h() {
        return this.f146580m;
    }

    public final C17834v i() {
        return this.f146587t;
    }

    public final C17835w j() {
        return this.f146575h;
    }

    public final C17196g k() {
        return this.f146583p;
    }

    public final Iterable<C15686b> l() {
        return this.f146578k;
    }

    public final C17836x m() {
        return this.f146577j;
    }

    public final p n() {
        return this.f146584q;
    }

    public final C17789B o() {
        return this.f146574g;
    }

    public final C16016c p() {
        return this.f146576i;
    }

    public final C15538I q() {
        return this.f146569b;
    }

    public final C15543N r() {
        return this.f146579l;
    }

    public final C15545P s() {
        return this.f146573f;
    }

    public final C15687c t() {
        return this.f146582o;
    }

    public final C17994n u() {
        return this.f146568a;
    }

    public final List<t0> v() {
        return this.f146586s;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C17826n(tJ.C17994n r24, DI.C15538I r25, qJ.C17827o r26, qJ.C17822j r27, qJ.C17817e r28, DI.C15545P r29, qJ.C17789B r30, qJ.C17835w r31, LI.C16016c r32, qJ.C17836x r33, java.lang.Iterable r34, DI.C15543N r35, qJ.C17825m r36, FI.C15685a r37, FI.C15687c r38, eJ.C17196g r39, vJ.p r40, mJ.C17606a r41, java.util.List r42, qJ.C17834v r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000b
            FI.a$a r1 = FI.C15685a.C3308a.f134401a
            r16 = r1
            goto L_0x000d
        L_0x000b:
            r16 = r37
        L_0x000d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0016
            FI.c$a r1 = FI.C15687c.a.f134402a
            r17 = r1
            goto L_0x0018
        L_0x0016:
            r17 = r38
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0026
            vJ.p$a r1 = vJ.p.f149068b
            vJ.q r1 = r1.a()
            r19 = r1
            goto L_0x0028
        L_0x0026:
            r19 = r40
        L_0x0028:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0036
            uJ.y r1 = uJ.C18144y.f147952a
            java.util.List r1 = YH.C16877v.e(r1)
            r21 = r1
            goto L_0x0038
        L_0x0036:
            r21 = r42
        L_0x0038:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0042
            qJ.v$a r0 = qJ.C17834v.a.f146609a
            r22 = r0
            goto L_0x0044
        L_0x0042:
            r22 = r43
        L_0x0044:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qJ.C17826n.<init>(tJ.n, DI.I, qJ.o, qJ.j, qJ.e, DI.P, qJ.B, qJ.w, LI.c, qJ.x, java.lang.Iterable, DI.N, qJ.m, FI.a, FI.c, eJ.g, vJ.p, mJ.a, java.util.List, qJ.v, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
