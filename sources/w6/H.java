package w6;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public class H extends PorterDuffColorFilter {
    public H(int i10) {
        super(i10, PorterDuff.Mode.SRC_ATOP);
    }
}
