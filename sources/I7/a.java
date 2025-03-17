package I7;

import C7.i;
import I7.o;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;

public class a<Data> implements o<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    private static final int f36977c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f36978a;

    /* renamed from: b  reason: collision with root package name */
    private final C0582a<Data> f36979b;

    /* renamed from: I7.a$a  reason: collision with other inner class name */
    public interface C0582a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements p<Uri, AssetFileDescriptor>, C0582a<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f36980a;

        public b(AssetManager assetManager) {
            this.f36980a = assetManager;
        }

        public d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.f36980a, this);
        }

        public void teardown() {
        }
    }

    public static class c implements p<Uri, InputStream>, C0582a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f36981a;

        public c(AssetManager assetManager) {
            this.f36981a = assetManager;
        }

        public d<InputStream> a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        public o<Uri, InputStream> d(s sVar) {
            return new a(this.f36981a, this);
        }

        public void teardown() {
        }
    }

    public a(AssetManager assetManager, C0582a<Data> aVar) {
        this.f36978a = assetManager;
        this.f36979b = aVar;
    }

    /* renamed from: c */
    public o.a<Data> b(Uri uri, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(uri), this.f36979b.a(this.f36978a, uri.toString().substring(f36977c)));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
