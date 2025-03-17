package X;

import C.C4417z;
import V.C4924i;
import V.C4927l;
import a0.i0;
import a0.k0;
import android.util.Size;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import b0.C5252b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q.C5759a;

public class f implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f14677c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<C4927l> f14678d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Size> f14679e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<C4417z> f14680f;

    /* renamed from: g  reason: collision with root package name */
    private final C5759a<i0, k0> f14681g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, C5031k0> f14682h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Map<C4417z, C4924i> f14683i = new HashMap();

    public f(C5029j0 j0Var, Collection<C4927l> collection, Collection<C4417z> collection2, Collection<Size> collection3, C5759a<i0, k0> aVar) {
        c(collection2);
        this.f14677c = j0Var;
        this.f14678d = new HashSet(collection);
        this.f14680f = new HashSet(collection2);
        this.f14679e = new HashSet(collection3);
        this.f14681g = aVar;
    }

    private static void c(Collection<C4417z> collection) {
        for (C4417z next : collection) {
            if (!next.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + next);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        r6 = r5.k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.camera.core.impl.C5031k0 d(V.C4927l.b r12) {
        /*
            r11 = this;
            java.util.Set<V.l> r0 = r11.f14678d
            boolean r0 = r0.contains(r12)
            H2.i.a(r0)
            androidx.camera.core.impl.j0 r0 = r11.f14677c
            int r1 = r12.e()
            androidx.camera.core.impl.k0 r0 = r0.b(r1)
            java.util.List r12 = r12.d()
            java.util.Iterator r12 = r12.iterator()
        L_0x001b:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r12.next()
            android.util.Size r1 = (android.util.Size) r1
            java.util.Set<android.util.Size> r2 = r11.f14679e
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x0030
            goto L_0x001b
        L_0x0030:
            java.util.TreeMap r2 = new java.util.TreeMap
            G.d r3 = new G.d
            r3.<init>()
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set<C.z> r4 = r11.f14680f
            java.util.Iterator r4 = r4.iterator()
        L_0x0045:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r4.next()
            C.z r5 = (C.C4417z) r5
            boolean r6 = i(r0, r5)
            if (r6 == 0) goto L_0x0058
            goto L_0x0045
        L_0x0058:
            V.i r5 = r11.f(r5)
            X.g r5 = r5.b(r1)
            if (r5 != 0) goto L_0x0063
            goto L_0x0045
        L_0x0063:
            androidx.camera.core.impl.k0$c r6 = r5.k()
            a0.i0 r7 = Z.c.f(r6)
            q.a<a0.i0, a0.k0> r8 = r11.f14681g
            java.lang.Object r7 = r8.apply(r7)
            a0.k0 r7 = (a0.k0) r7
            if (r7 == 0) goto L_0x0045
            int r8 = r1.getWidth()
            int r9 = r1.getHeight()
            boolean r8 = r7.e(r8, r9)
            if (r8 != 0) goto L_0x0084
            goto L_0x0045
        L_0x0084:
            android.util.Size r8 = new android.util.Size
            int r9 = r6.k()
            int r10 = r6.h()
            r8.<init>(r9, r10)
            r2.put(r8, r5)
            android.util.Range r5 = r7.g()
            androidx.camera.core.impl.k0$c r5 = b0.C5253c.a(r6, r1, r5)
            r3.add(r5)
            goto L_0x0045
        L_0x00a0:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x001b
            java.lang.Object r12 = N.d.a(r1, r2)
            androidx.camera.core.impl.k0 r12 = (androidx.camera.core.impl.C5031k0) r12
            java.util.Objects.requireNonNull(r12)
            androidx.camera.core.impl.k0 r12 = (androidx.camera.core.impl.C5031k0) r12
            int r0 = r12.a()
            int r1 = r12.e()
            java.util.List r12 = r12.f()
            androidx.camera.core.impl.k0$b r12 = androidx.camera.core.impl.C5031k0.b.h(r0, r1, r12, r3)
            return r12
        L_0x00c2:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.f.d(V.l$b):androidx.camera.core.impl.k0");
    }

    private C4927l.b e(int i10) {
        Iterator<C4927l> it = this.f14678d.iterator();
        while (it.hasNext()) {
            C4927l.b bVar = (C4927l.b) it.next();
            if (bVar.e() == i10) {
                return bVar;
            }
        }
        return null;
    }

    private C4924i f(C4417z zVar) {
        if (this.f14683i.containsKey(zVar)) {
            C4924i iVar = this.f14683i.get(zVar);
            Objects.requireNonNull(iVar);
            return iVar;
        }
        C4924i iVar2 = new C4924i(new e(this.f14677c, zVar));
        this.f14683i.put(zVar, iVar2);
        return iVar2;
    }

    private C5031k0 g(int i10) {
        if (this.f14682h.containsKey(Integer.valueOf(i10))) {
            return this.f14682h.get(Integer.valueOf(i10));
        }
        C5031k0 b10 = this.f14677c.b(i10);
        C4927l.b e10 = e(i10);
        if (e10 != null && !h(b10)) {
            b10 = j(b10, d(e10));
        }
        this.f14682h.put(Integer.valueOf(i10), b10);
        return b10;
    }

    private boolean h(C5031k0 k0Var) {
        if (k0Var == null) {
            return false;
        }
        for (C4417z i10 : this.f14680f) {
            if (!i(k0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean i(C5031k0 k0Var, C4417z zVar) {
        if (k0Var == null) {
            return false;
        }
        for (C5031k0.c f10 : k0Var.b()) {
            if (C5252b.f(f10, zVar)) {
                return true;
            }
        }
        return false;
    }

    private static C5031k0 j(C5031k0 k0Var, C5031k0 k0Var2) {
        if (k0Var == null && k0Var2 == null) {
            return null;
        }
        int a10 = k0Var != null ? k0Var.a() : k0Var2.a();
        int e10 = k0Var != null ? k0Var.e() : k0Var2.e();
        List<C5031k0.a> f10 = k0Var != null ? k0Var.f() : k0Var2.f();
        ArrayList arrayList = new ArrayList();
        if (k0Var != null) {
            arrayList.addAll(k0Var.b());
        }
        if (k0Var2 != null) {
            arrayList.addAll(k0Var2.b());
        }
        return C5031k0.b.h(a10, e10, f10, arrayList);
    }

    public boolean a(int i10) {
        return g(i10) != null;
    }

    public C5031k0 b(int i10) {
        return g(i10);
    }
}
