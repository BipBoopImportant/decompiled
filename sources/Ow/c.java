package ow;

import HJ.C15854t;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "a", "(Landroid/net/Uri;)Landroid/net/Uri;", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final Uri a(Uri uri) {
        C17542s.j(uri, "<this>");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        Uri parse = Uri.parse(b(uri2));
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    public static final String b(String str) {
        C17542s.j(str, "<this>");
        return C15854t.t1(str, "?", (String) null, 2, (Object) null);
    }
}
