package zs;

import Ps.b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LPs/b;", "inboxId", "", "c", "(LPs/b;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "id", "b", "(Landroid/net/Uri$Builder;LPs/b;)Landroid/net/Uri$Builder;", "Landroid/net/Uri;", "d", "(Landroid/net/Uri;)LPs/b;", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final Uri.Builder b(Uri.Builder builder, b bVar) {
        C17542s.j(builder, "<this>");
        C17542s.j(bVar, "id");
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("id_key", bVar.b()).appendQueryParameter("feature_key", bVar.a());
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    /* access modifiers changed from: private */
    public static final String c(b bVar) {
        Uri.Builder buildUpon = c.a(Uri.parse("https://www.ikea.com/ikeaapp/notification?id_key={id_key}&feature_key={feature_key}")).buildUpon();
        C17542s.i(buildUpon, "buildUpon(...)");
        String uri = b(buildUpon, bVar).build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public static final b d(Uri uri) {
        String queryParameter;
        C17542s.j(uri, "<this>");
        String queryParameter2 = uri.getQueryParameter("id_key");
        if (queryParameter2 == null || (queryParameter = uri.getQueryParameter("feature_key")) == null) {
            return null;
        }
        return new b(queryParameter2, queryParameter);
    }
}
