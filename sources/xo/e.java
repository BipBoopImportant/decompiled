package Xo;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"", "", "a", "(I)F", "dpToPx", "b", "pxToDp", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final float a(int i10) {
        return ((float) i10) * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float b(int i10) {
        return ((float) i10) / (((float) Resources.getSystem().getDisplayMetrics().densityDpi) / ((float) 160));
    }
}
