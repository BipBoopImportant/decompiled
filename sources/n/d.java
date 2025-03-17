package N;

import android.util.Size;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.Map;
import java.util.TreeMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f9157a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f9158b = new Size(320, 240);

    /* renamed from: c  reason: collision with root package name */
    public static final Size f9159c = new Size(640, 480);

    /* renamed from: d  reason: collision with root package name */
    public static final Size f9160d = new Size(720, 480);

    /* renamed from: e  reason: collision with root package name */
    public static final Size f9161e = new Size(SceneLayout.kCurrent3DVersion, 720);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f9162f = new Size(1920, 1080);

    /* renamed from: g  reason: collision with root package name */
    public static final Size f9163g = new Size(1920, 1440);

    public static <T> T a(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public static int b(int i10, int i11) {
        return i10 * i11;
    }

    public static int c(Size size) {
        return b(size.getWidth(), size.getHeight());
    }

    public static boolean d(Size size, Size size2) {
        return c(size) < c(size2);
    }
}
