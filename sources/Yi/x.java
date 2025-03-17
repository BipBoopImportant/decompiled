package yi;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri$Builder;", "", "key", "value", "b", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    /* access modifiers changed from: private */
    public static final Uri.Builder b(Uri.Builder builder, String str, String str2) {
        if (str2 != null) {
            builder.appendQueryParameter(str, str2);
        }
        return builder;
    }
}
