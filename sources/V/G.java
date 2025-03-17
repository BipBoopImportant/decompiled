package V;

import C.C4417z;
import X.e;
import X.g;
import android.util.Size;
import androidx.camera.core.impl.C5027i0;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class G implements I {

    /* renamed from: b  reason: collision with root package name */
    private final C5029j0 f14329b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14330c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<C4417z, C4924i> f14331d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<C4417z, C4924i> f14332e = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: c0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: c0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: c0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    G(int r10, androidx.camera.core.impl.I r11, q.C5759a<a0.i0, a0.k0> r12) {
        /*
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f14331d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f14332e = r0
            r0 = 1
            if (r10 == 0) goto L_0x0019
            if (r10 != r0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = 0
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Not a supported video capabilities source: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            H2.i.b(r1, r2)
            androidx.camera.core.impl.j0 r1 = r11.p()
            androidx.camera.core.impl.R0 r2 = androidx.camera.video.internal.compat.quirk.a.c()
            c0.a r4 = new c0.a
            r4.<init>(r1, r2, r11, r12)
            if (r10 != r0) goto L_0x0055
            X.f r10 = new X.f
            java.util.List r5 = V.C4927l.b()
            C.z r0 = C.C4417z.f5465d
            java.util.Set r6 = java.util.Collections.singleton(r0)
            r0 = 34
            java.util.List r7 = r11.i(r0)
            r3 = r10
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = r10
        L_0x0055:
            c0.b r10 = new c0.b
            r10.<init>(r4, r2)
            boolean r0 = h(r11)
            if (r0 == 0) goto L_0x0066
            X.b r0 = new X.b
            r0.<init>(r10, r12)
            r10 = r0
        L_0x0066:
            c0.c r12 = new c0.c
            r12.<init>(r10, r11, r2)
            r9.f14329b = r12
            java.util.Set r10 = r11.b()
            java.util.Iterator r10 = r10.iterator()
        L_0x0075:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x009d
            java.lang.Object r12 = r10.next()
            C.z r12 = (C.C4417z) r12
            X.e r0 = new X.e
            androidx.camera.core.impl.j0 r1 = r9.f14329b
            r0.<init>(r1, r12)
            V.i r1 = new V.i
            r1.<init>(r0)
            java.util.List r0 = r1.f()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0075
            java.util.Map<C.z, V.i> r0 = r9.f14331d
            r0.put(r12, r1)
            goto L_0x0075
        L_0x009d:
            boolean r10 = r11.k()
            r9.f14330c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.G.<init>(int, androidx.camera.core.impl.I, q.a):void");
    }

    private C4924i e(C4417z zVar) {
        if (!C5027i0.c(zVar, g())) {
            return null;
        }
        return new C4924i(new e(this.f14329b, zVar));
    }

    private C4924i f(C4417z zVar) {
        if (zVar.e()) {
            return this.f14331d.get(zVar);
        }
        if (this.f14332e.containsKey(zVar)) {
            return this.f14332e.get(zVar);
        }
        C4924i e10 = e(zVar);
        this.f14332e.put(zVar, e10);
        return e10;
    }

    private static boolean h(I i10) {
        for (C4417z next : i10.b()) {
            Integer valueOf = Integer.valueOf(next.b());
            int a10 = next.a();
            if (valueOf.equals(3) && a10 == 10) {
                return true;
            }
        }
        return false;
    }

    public g a(C4927l lVar, C4417z zVar) {
        C4924i f10 = f(zVar);
        if (f10 == null) {
            return null;
        }
        return f10.e(lVar);
    }

    public List<C4927l> b(C4417z zVar) {
        C4924i f10 = f(zVar);
        return f10 == null ? new ArrayList() : f10.f();
    }

    public g c(Size size, C4417z zVar) {
        C4924i f10 = f(zVar);
        if (f10 == null) {
            return null;
        }
        return f10.b(size);
    }

    public C4927l d(Size size, C4417z zVar) {
        C4924i f10 = f(zVar);
        return f10 == null ? C4927l.f14465g : f10.c(size);
    }

    public Set<C4417z> g() {
        return this.f14331d.keySet();
    }
}
