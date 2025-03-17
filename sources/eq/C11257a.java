package eq;

import HJ.C15854t;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri;", "a", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "b", "(Landroid/net/Uri;)Z", "dynamiclink_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: eq.a  reason: case insensitive filesystem */
public final class C11257a {
    public static final Uri a(Uri uri) {
        C17542s.j(uri, "<this>");
        if (!C17542s.e(uri.getAuthority(), "ikea.com")) {
            return uri;
        }
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        return Uri.parse(C15854t.Q(uri2, "ikea.com", "www.ikea.com", false, 4, (Object) null));
    }

    public static final boolean b(Uri uri) {
        C17542s.j(uri, "<this>");
        String host = uri.getHost();
        if (host != null) {
            return host.equals("ingka.page.link");
        }
        return false;
    }
}
