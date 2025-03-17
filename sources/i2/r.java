package I2;

import H2.c;
import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import x2.d;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final DisplayCutout f8726a;

    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f8726a = displayCutout;
    }

    static r f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f8726a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f8726a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f8726a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f8726a);
        }
        return 0;
    }

    public d e() {
        return Build.VERSION.SDK_INT >= 30 ? d.e(b.a(this.f8726a)) : d.f31835e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return c.a(this.f8726a, ((r) obj).f8726a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f8726a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f8726a + "}";
    }
}
