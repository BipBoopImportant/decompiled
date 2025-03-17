package Jm;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJm/g;", "Landroid/net/Uri;", "a", "(Ljava/lang/String;)Landroid/net/Uri;", "benefits-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final Uri a(String str) {
        C17542s.j(str, "$this$toUri");
        Uri parse = Uri.parse(str);
        C17542s.i(parse, "parse(...)");
        return parse;
    }
}
