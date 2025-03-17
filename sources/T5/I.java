package T5;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri;", "LT5/G;", "b", "(Landroid/net/Uri;)LT5/G;", "a", "(LT5/G;)Landroid/net/Uri;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I {
    public static final Uri a(G g10) {
        return Uri.parse(g10.toString());
    }

    public static final G b(Uri uri) {
        return H.j(uri.toString(), (String) null, 1, (Object) null);
    }
}
