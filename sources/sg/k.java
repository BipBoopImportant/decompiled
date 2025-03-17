package sg;

import HJ.C15854t;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "hideCursorOnEmailTextInput", "dynamicfields_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f76553a;

    static {
        boolean z10 = true;
        if (!C15854t.H(Build.MANUFACTURER, "Xiaomi", true) || Build.VERSION.SDK_INT != 29) {
            z10 = false;
        }
        f76553a = z10;
    }

    public static final boolean a() {
        return f76553a;
    }
}
