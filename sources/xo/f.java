package Xo;

import G2.b;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Landroid/text/Spanned;", "a", "(Ljava/lang/String;)Landroid/text/Spanned;", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final Spanned a(String str) {
        if (str == null) {
            str = "";
        }
        Spanned a10 = b.a(str, 0);
        C17542s.i(a10, "fromHtml(...)");
        return a10;
    }
}
