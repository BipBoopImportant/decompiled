package X;

import C.C4391e0;
import Z.c;
import a0.i0;
import a0.k0;
import android.util.Rational;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import q.C5759a;

public class b implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f14671c;

    /* renamed from: d  reason: collision with root package name */
    private final C5759a<i0, k0> f14672d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, C5031k0> f14673e = new HashMap();

    public b(C5029j0 j0Var, C5759a<i0, k0> aVar) {
        this.f14671c = j0Var;
        this.f14672d = aVar;
    }

    private C5031k0 c(C5031k0 k0Var, int i10, int i11) {
        C5031k0.c cVar;
        if (k0Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(k0Var.b());
        Iterator<C5031k0.c> it = k0Var.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.g() == 0) {
                break;
            }
        }
        C5031k0.c k10 = k(g(cVar, i10, i11), this.f14672d);
        if (k10 != null) {
            arrayList.add(k10);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C5031k0.b.h(k0Var.a(), k0Var.e(), k0Var.f(), arrayList);
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static String e(int i10) {
        return C5031k0.d(i10);
    }

    private static int f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static C5031k0.c g(C5031k0.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int e10 = cVar.e();
        String i12 = cVar.i();
        int j10 = cVar.j();
        if (i10 != cVar.g()) {
            e10 = d(i10);
            i12 = e(e10);
            j10 = f(i10);
        }
        return C5031k0.c.a(e10, i12, j(cVar.c(), i11, cVar.b()), cVar.f(), cVar.k(), cVar.h(), j10, i11, cVar.d(), i10);
    }

    private C5031k0 h(int i10) {
        if (this.f14673e.containsKey(Integer.valueOf(i10))) {
            return this.f14673e.get(Integer.valueOf(i10));
        }
        if (!this.f14671c.a(i10)) {
            return null;
        }
        C5031k0 c10 = c(this.f14671c.b(i10), 1, 10);
        this.f14673e.put(Integer.valueOf(i10), c10);
        return c10;
    }

    private static C5031k0.c i(C5031k0.c cVar, int i10) {
        return C5031k0.c.a(cVar.e(), cVar.i(), i10, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private static int j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int doubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue());
        if (C4391e0.f("BackupHdrProfileEncoderProfilesProvider")) {
            C4391e0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(doubleValue)}));
        }
        return doubleValue;
    }

    static C5031k0.c k(C5031k0.c cVar, C5759a<i0, k0> aVar) {
        i0 f10;
        k0 apply;
        if (cVar == null || (apply = aVar.apply(f10)) == null || !apply.e(cVar.k(), cVar.h())) {
            return null;
        }
        int e10 = (f10 = c.f(cVar)).e();
        int intValue = apply.g().clamp(Integer.valueOf(e10)).intValue();
        return intValue == e10 ? cVar : i(cVar, intValue);
    }

    public boolean a(int i10) {
        return this.f14671c.a(i10) && h(i10) != null;
    }

    public C5031k0 b(int i10) {
        return h(i10);
    }
}
