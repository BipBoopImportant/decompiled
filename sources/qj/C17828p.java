package qJ;

import DI.C15566m;
import XI.s;
import ZI.C17004a;
import ZI.c;
import ZI.g;
import ZI.h;
import ZI.i;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import sJ.C17942s;
import tJ.C17994n;

/* renamed from: qJ.p  reason: case insensitive filesystem */
public final class C17828p {

    /* renamed from: a  reason: collision with root package name */
    private final C17826n f146590a;

    /* renamed from: b  reason: collision with root package name */
    private final c f146591b;

    /* renamed from: c  reason: collision with root package name */
    private final C15566m f146592c;

    /* renamed from: d  reason: collision with root package name */
    private final g f146593d;

    /* renamed from: e  reason: collision with root package name */
    private final h f146594e;

    /* renamed from: f  reason: collision with root package name */
    private final C17004a f146595f;

    /* renamed from: g  reason: collision with root package name */
    private final C17942s f146596g;

    /* renamed from: h  reason: collision with root package name */
    private final C17810X f146597h;

    /* renamed from: i  reason: collision with root package name */
    private final C17798K f146598i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0052, code lost:
        r2 = r8.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17828p(qJ.C17826n r2, ZI.c r3, DI.C15566m r4, ZI.g r5, ZI.h r6, ZI.C17004a r7, sJ.C17942s r8, qJ.C17810X r9, java.util.List<XI.s> r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "typeParameters"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r1.<init>()
            r1.f146590a = r2
            r1.f146591b = r3
            r1.f146592c = r4
            r1.f146593d = r5
            r1.f146594e = r6
            r1.f146595f = r7
            r1.f146596g = r8
            qJ.X r0 = new qJ.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Deserializer for \""
            r2.append(r3)
            cJ.f r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L_0x005b
            java.lang.String r2 = r8.a()
            if (r2 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = r2
            goto L_0x005e
        L_0x005b:
            java.lang.String r2 = "[container not found]"
            goto L_0x0059
        L_0x005e:
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f146597h = r0
            qJ.K r2 = new qJ.K
            r2.<init>(r1)
            r1.f146598i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qJ.C17828p.<init>(qJ.n, ZI.c, DI.m, ZI.g, ZI.h, ZI.a, sJ.s, qJ.X, java.util.List):void");
    }

    public static /* synthetic */ C17828p b(C17828p pVar, C15566m mVar, List list, c cVar, g gVar, h hVar, C17004a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = pVar.f146591b;
        }
        c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = pVar.f146593d;
        }
        g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = pVar.f146594e;
        }
        h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            aVar = pVar.f146595f;
        }
        return pVar.a(mVar, list, cVar2, gVar2, hVar2, aVar);
    }

    public final C17828p a(C15566m mVar, List<s> list, c cVar, g gVar, h hVar, C17004a aVar) {
        C15566m mVar2 = mVar;
        C17542s.j(mVar, "descriptor");
        List<s> list2 = list;
        C17542s.j(list, "typeParameterProtos");
        c cVar2 = cVar;
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        h hVar2 = hVar;
        C17542s.j(hVar2, "versionRequirementTable");
        C17542s.j(aVar, "metadataVersion");
        C17826n nVar = this.f146590a;
        if (!i.b(aVar)) {
            hVar2 = this.f146594e;
        }
        return new C17828p(nVar, cVar, mVar, gVar, hVar2, aVar, this.f146596g, this.f146597h, list);
    }

    public final C17826n c() {
        return this.f146590a;
    }

    public final C17942s d() {
        return this.f146596g;
    }

    public final C15566m e() {
        return this.f146592c;
    }

    public final C17798K f() {
        return this.f146598i;
    }

    public final c g() {
        return this.f146591b;
    }

    public final C17994n h() {
        return this.f146590a.u();
    }

    public final C17810X i() {
        return this.f146597h;
    }

    public final g j() {
        return this.f146593d;
    }

    public final h k() {
        return this.f146594e;
    }
}
