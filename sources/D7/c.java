package D7;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f34564a;

    /* renamed from: b  reason: collision with root package name */
    private final e f34565b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f34566c;

    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f34567b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f34568a;

        a(ContentResolver contentResolver) {
            this.f34568a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f34568a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f34567b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f34569b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f34570a;

        b(ContentResolver contentResolver) {
            this.f34570a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f34570a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f34569b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    c(Uri uri, e eVar) {
        this.f34564a = uri;
        this.f34565b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d10 = this.f34565b.d(this.f34564a);
        int a10 = d10 != null ? this.f34565b.a(this.f34564a) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f34566c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    public C7.a d() {
        return C7.a.LOCAL;
    }

    public void f(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.f34566c = h10;
            aVar.e(h10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}
