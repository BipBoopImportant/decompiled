package sJ;

import DI.C15544O;
import DI.C15561h;
import DI.C15566m;
import FI.C15686b;
import KI.C15984a;
import LI.C16015b;
import LI.d;
import YH.C16877v;
import YH.g0;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17649d;

/* renamed from: sJ.M  reason: case insensitive filesystem */
public class C17917M extends C17946w {

    /* renamed from: g  reason: collision with root package name */
    private final C15544O f147021g;

    /* renamed from: h  reason: collision with root package name */
    private final String f147022h;

    /* renamed from: i  reason: collision with root package name */
    private final C17066c f147023i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17917M(DI.C15544O r17, XI.l r18, ZI.c r19, ZI.C17004a r20, sJ.C17942s r21, qJ.C17826n r22, java.lang.String r23, nI.C17631a<? extends java.util.Collection<cJ.C17069f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.C17542s.j(r5, r0)
            ZI.g r10 = new ZI.g
            XI.t r0 = r18.Q()
            java.lang.String r7 = "getTypeTable(...)"
            kotlin.jvm.internal.C17542s.i(r0, r7)
            r10.<init>(r0)
            ZI.h$a r0 = ZI.h.f140844b
            XI.w r7 = r18.R()
            java.lang.String r8 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.C17542s.i(r7, r8)
            ZI.h r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            qJ.p r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.J()
            java.lang.String r0 = "getFunctionList(...)"
            kotlin.jvm.internal.C17542s.i(r3, r0)
            java.util.List r4 = r18.M()
            java.lang.String r0 = "getPropertyList(...)"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            java.util.List r7 = r18.P()
            java.lang.String r0 = "getTypeAliasList(...)"
            kotlin.jvm.internal.C17542s.i(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f147021g = r14
            r6.f147022h = r15
            cJ.c r0 = r17.f()
            r6.f147023i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sJ.C17917M.<init>(DI.O, XI.l, ZI.c, ZI.a, sJ.s, qJ.n, java.lang.String, nI.a):void");
    }

    /* renamed from: B */
    public List<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        Collection<C15566m> m10 = m(dVar, lVar, d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C15686b> l10 = s().c().l();
        ArrayList arrayList = new ArrayList();
        for (C15686b c10 : l10) {
            C16877v.E(arrayList, c10.c(this.f147023i));
        }
        return C16877v.V0(m10, arrayList);
    }

    public void C(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15984a.b(s().c().p(), bVar, this.f147021g, fVar);
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C(fVar, bVar);
        return super.e(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    public void j(Collection<C15566m> collection, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(collection, "result");
        C17542s.j(lVar, "nameFilter");
    }

    /* access modifiers changed from: protected */
    public C17065b p(C17069f fVar) {
        C17542s.j(fVar, "name");
        return new C17065b(this.f147023i, fVar);
    }

    public String toString() {
        return this.f147022h;
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> v() {
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> w() {
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> x() {
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public boolean z(C17069f fVar) {
        C17542s.j(fVar, "name");
        if (!super.z(fVar)) {
            Iterable<C15686b> l10 = s().c().l();
            if (!(l10 instanceof Collection) || !((Collection) l10).isEmpty()) {
                for (C15686b a10 : l10) {
                    if (a10.a(this.f147023i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
