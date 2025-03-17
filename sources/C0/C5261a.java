package c0;

import H2.i;
import a0.i0;
import a0.k0;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.R0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.C5759a;

/* renamed from: c0.a  reason: case insensitive filesystem */
public class C5261a implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f22964c;

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, C5031k0> f22965d;

    public C5261a(C5029j0 j0Var, R0 r02, I i10, C5759a<i0, k0> aVar) {
        this.f22964c = j0Var;
        List<ExtraSupportedQualityQuirk> c10 = r02.c(ExtraSupportedQualityQuirk.class);
        if (!c10.isEmpty()) {
            i.i(c10.size() != 1 ? false : true);
            Map<Integer, C5031k0> f10 = c10.get(0).f(i10, j0Var, aVar);
            if (f10 != null) {
                this.f22965d = new HashMap(f10);
            }
        }
    }

    private C5031k0 c(int i10) {
        Map<Integer, C5031k0> map = this.f22965d;
        return (map == null || !map.containsKey(Integer.valueOf(i10))) ? this.f22964c.b(i10) : this.f22965d.get(Integer.valueOf(i10));
    }

    public boolean a(int i10) {
        return c(i10) != null;
    }

    public C5031k0 b(int i10) {
        return c(i10);
    }
}
