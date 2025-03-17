package JF;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/net/Uri;", "", "value", "a", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.s  reason: case insensitive filesystem */
public final class C13111s {
    public static final Uri a(Uri uri, String str) {
        C17542s.j(uri, "<this>");
        C17542s.j(str, "value");
        Uri build = uri.buildUpon().appendQueryParameter("f", str).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public static /* synthetic */ Uri b(Uri uri, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "xs";
        }
        return a(uri, str);
    }
}
