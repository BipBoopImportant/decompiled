package Zl;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/UriMatcher;", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/content/UriMatcher;Landroid/net/Uri;)Z", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final boolean a(UriMatcher uriMatcher, Uri uri) {
        C17542s.j(uriMatcher, "<this>");
        C17542s.j(uri, "uri");
        return uriMatcher.match(uri) != -1;
    }
}
