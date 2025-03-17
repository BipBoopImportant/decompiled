package V;

import android.graphics.Rect;
import android.util.Size;
import java.util.Comparator;

public final /* synthetic */ class T implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f14351a;

    public /* synthetic */ T(Rect rect) {
        this.f14351a = rect;
    }

    public final int compare(Object obj, Object obj2) {
        return W.I0(this.f14351a, (Size) obj, (Size) obj2);
    }
}
