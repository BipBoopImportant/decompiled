package K5;

import N5.m;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LK5/f;", "LK5/d;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "b", "(Landroid/net/Uri;)Z", "LN5/m;", "options", "c", "(Landroid/net/Uri;LN5/m;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements d<Uri, Uri> {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.getAuthority();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "android.resource"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r3.getAuthority()
            if (r0 == 0) goto L_0x0028
            boolean r0 = HJ.C15854t.v0(r0)
            if (r0 == 0) goto L_0x0019
            goto L_0x0028
        L_0x0019:
            java.util.List r3 = r3.getPathSegments()
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r0 = 2
            if (r3 != r0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.f.b(android.net.Uri):boolean");
    }

    /* renamed from: c */
    public Uri a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            return Uri.parse("android.resource://" + authority + '/' + identifier);
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
