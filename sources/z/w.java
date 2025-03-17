package z;

import G.d;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import java.util.ArrayList;
import java.util.Comparator;

public class w {

    /* renamed from: b  reason: collision with root package name */
    private static final Size f32342b = new Size(320, 240);

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<Size> f32343c = new d();

    /* renamed from: a  reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f32344a = ((RepeatingStreamConstraintForVideoRecordingQuirk) b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class));

    public Size[] a(Size[] sizeArr) {
        if (this.f32344a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.f()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f32343c.compare(size, f32342b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
