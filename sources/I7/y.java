package I7;

import I7.o;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class y<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f37076b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a  reason: collision with root package name */
    private final c<Data> f37077a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f37078a;

        public a(ContentResolver contentResolver) {
            this.f37078a = contentResolver;
        }

        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f37078a, uri);
        }

        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public void teardown() {
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f37079a;

        public b(ContentResolver contentResolver) {
            this.f37079a = contentResolver;
        }

        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.f37079a, uri);
        }

        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public void teardown() {
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f37080a;

        public d(ContentResolver contentResolver) {
            this.f37080a = contentResolver;
        }

        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new n(this.f37080a, uri);
        }

        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }

        public void teardown() {
        }
    }

    public y(c<Data> cVar) {
        this.f37077a = cVar;
    }

    /* renamed from: c */
    public o.a<Data> b(Uri uri, int i10, int i11, C7.i iVar) {
        return new o.a<>(new X7.d(uri), this.f37077a.a(uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return f37076b.contains(uri.getScheme());
    }
}
