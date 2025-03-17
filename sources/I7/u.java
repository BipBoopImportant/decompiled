package I7;

import C7.i;
import I7.o;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37067a;

    /* renamed from: b  reason: collision with root package name */
    private final o<Integer, DataT> f37068b;

    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37069a;

        a(Context context) {
            this.f37069a = context;
        }

        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new u(this.f37069a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    private static final class b implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37070a;

        b(Context context) {
            this.f37070a = context;
        }

        public o<Uri, InputStream> d(s sVar) {
            return new u(this.f37070a, sVar.d(Integer.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f37067a = context.getApplicationContext();
        this.f37068b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(Uri uri, int i10, int i11, i iVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f37068b.b(Integer.valueOf(parseInt), i10, i11, iVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private o.a<DataT> h(Uri uri, int i10, int i11, i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.f37067a.getResources().getIdentifier(str, pathSegments.get(0), this.f37067a.getPackageName());
        if (identifier != 0) {
            return this.f37068b.b(Integer.valueOf(identifier), i10, i11, iVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    /* renamed from: c */
    public o.a<DataT> b(Uri uri, int i10, int i11, i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, iVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, iVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f37067a.getPackageName().equals(uri.getAuthority());
    }
}
