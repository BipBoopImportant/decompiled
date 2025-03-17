package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.e1;
import java.util.ArrayList;
import java.util.List;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraCroppingQuirk f32339a;

    public t() {
        this((ExtraCroppingQuirk) b.b(ExtraCroppingQuirk.class));
    }

    public List<Size> a(e1.b bVar, List<Size> list) {
        Size f10;
        ExtraCroppingQuirk extraCroppingQuirk = this.f32339a;
        if (extraCroppingQuirk == null || (f10 = extraCroppingQuirk.f(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(f10);
        for (Size next : list) {
            if (!next.equals(f10)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f32339a = extraCroppingQuirk;
    }
}
