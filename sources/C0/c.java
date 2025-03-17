package C0;

import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "isStylusHandwritingSupported", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f5490a = (Build.VERSION.SDK_INT >= 34);

    public static final boolean a() {
        return f5490a;
    }
}
