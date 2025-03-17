package I7;

import C7.i;
import I7.o;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

public final class l implements o<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37026a;

    public static final class a implements p<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37027a;

        public a(Context context) {
            this.f37027a = context;
        }

        public o<Uri, File> d(s sVar) {
            return new l(this.f37027a);
        }

        public void teardown() {
        }
    }

    private static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f37028c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f37029a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f37030b;

        b(Context context, Uri uri) {
            this.f37029a = context;
            this.f37030b = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super File> aVar) {
            Cursor query = this.f37029a.getContentResolver().query(this.f37030b, f37028c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f37030b));
                return;
            }
            aVar.e(new File(str));
        }
    }

    public l(Context context) {
        this.f37026a = context;
    }

    /* renamed from: c */
    public o.a<File> b(Uri uri, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(uri), new b(this.f37026a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return D7.b.c(uri);
    }
}
