package N7;

import C7.h;
import C7.i;
import C7.k;
import E7.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public class j implements k<Uri, Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public static final h<Resources.Theme> f39162b = h.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a  reason: collision with root package name */
    private final Context f39163a;

    public j(Context context) {
        this.f39163a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f39163a.getPackageName())) {
            return this.f39163a;
        }
        try {
            return this.f39163a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f39163a.getPackageName())) {
                return this.f39163a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public v<Drawable> a(Uri uri, int i10, int i11, i iVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d10 = d(uri, authority);
            int g10 = g(d10, uri);
            Resources.Theme theme = ((String) Y7.k.d(authority)).equals(this.f39163a.getPackageName()) ? (Resources.Theme) iVar.c(f39162b) : null;
            return i.f(theme == null ? f.b(this.f39163a, d10, g10) : f.a(this.f39163a, g10, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: h */
    public boolean b(Uri uri, i iVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
