package V;

import C.C4391e0;
import G.d;
import H2.i;
import V.C4927l;
import X.g;
import android.util.Size;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: V.i  reason: case insensitive filesystem */
public class C4924i {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C4927l, g> f14451a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final TreeMap<Size, C4927l> f14452b = new TreeMap<>(new d());

    /* renamed from: c  reason: collision with root package name */
    private final g f14453c;

    /* renamed from: d  reason: collision with root package name */
    private final g f14454d;

    public C4924i(C5029j0 j0Var) {
        for (C4927l next : C4927l.b()) {
            C5031k0 d10 = d(next, j0Var);
            if (d10 != null) {
                C4391e0.a("CapabilitiesByQuality", "profiles = " + d10);
                g g10 = g(d10);
                if (g10 == null) {
                    C4391e0.l("CapabilitiesByQuality", "EncoderProfiles of quality " + next + " has no video validated profiles.");
                } else {
                    C5031k0.c k10 = g10.k();
                    this.f14452b.put(new Size(k10.k(), k10.h()), next);
                    this.f14451a.put(next, g10);
                }
            }
        }
        if (this.f14451a.isEmpty()) {
            C4391e0.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f14454d = null;
            this.f14453c = null;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.f14451a.values());
        this.f14453c = (g) arrayDeque.peekFirst();
        this.f14454d = (g) arrayDeque.peekLast();
    }

    private static void a(C4927l lVar) {
        boolean a10 = C4927l.a(lVar);
        i.b(a10, "Unknown quality: " + lVar);
    }

    private C5031k0 d(C4927l lVar, C5029j0 j0Var) {
        i.j(lVar instanceof C4927l.b, "Currently only support ConstantQuality");
        return j0Var.b(((C4927l.b) lVar).e());
    }

    private g g(C5031k0 k0Var) {
        if (k0Var.b().isEmpty()) {
            return null;
        }
        return g.i(k0Var);
    }

    public g b(Size size) {
        C4927l c10 = c(size);
        C4391e0.a("CapabilitiesByQuality", "Using supported quality of " + c10 + " for size " + size);
        if (c10 == C4927l.f14465g) {
            return null;
        }
        g e10 = e(c10);
        if (e10 != null) {
            return e10;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public C4927l c(Size size) {
        C4927l lVar = (C4927l) N.d.a(size, this.f14452b);
        return lVar != null ? lVar : C4927l.f14465g;
    }

    public g e(C4927l lVar) {
        a(lVar);
        return lVar == C4927l.f14464f ? this.f14453c : lVar == C4927l.f14463e ? this.f14454d : this.f14451a.get(lVar);
    }

    public List<C4927l> f() {
        return new ArrayList(this.f14451a.keySet());
    }
}
