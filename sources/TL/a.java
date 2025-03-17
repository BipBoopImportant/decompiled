package Tl;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/net/Uri;", "", "a", "(Landroid/net/Uri;)Z", "linkit_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final boolean a(Uri uri) {
        C17542s.j(uri, "<this>");
        String host = uri.getHost();
        if (host != null) {
            return host.equals("applink.ikea.com");
        }
        return false;
    }
}
