package z;

import C.C4391e0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f32325a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f32326b = ((ExtraSupportedOutputSizeQuirk) b.b(ExtraSupportedOutputSizeQuirk.class));

    /* renamed from: c  reason: collision with root package name */
    private final C6268e f32327c;

    public m(String str) {
        this.f32325a = str;
        this.f32327c = new C6268e(str);
    }

    private void a(List<Size> list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f32326b;
        if (extraSupportedOutputSizeQuirk != null) {
            Size[] f10 = extraSupportedOutputSizeQuirk.f(i10);
            if (f10.length > 0) {
                list.addAll(Arrays.asList(f10));
            }
        }
    }

    private void c(List<Size> list, int i10) {
        List<Size> a10 = this.f32327c.a(i10);
        if (!a10.isEmpty()) {
            list.removeAll(a10);
        }
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            C4391e0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
