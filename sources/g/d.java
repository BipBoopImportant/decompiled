package G;

import android.util.Size;
import java.util.Comparator;

public final class d implements Comparator<Size> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6051a;

    public d() {
        this(false);
    }

    /* renamed from: a */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f6051a ? signum * -1 : signum;
    }

    public d(boolean z10) {
        this.f6051a = z10;
    }
}
