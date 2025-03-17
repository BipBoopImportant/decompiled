package J7;

import C7.i;
import D7.c;
import I7.o;
import I7.p;
import I7.s;
import X7.d;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class b implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37381a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37382a;

        public a(Context context) {
            this.f37382a = context;
        }

        public o<Uri, InputStream> d(s sVar) {
            return new b(this.f37382a);
        }

        public void teardown() {
        }
    }

    public b(Context context) {
        this.f37381a = context.getApplicationContext();
    }

    /* renamed from: c */
    public o.a<InputStream> b(Uri uri, int i10, int i11, i iVar) {
        if (D7.b.e(i10, i11)) {
            return new o.a<>(new d(uri), c.e(this.f37381a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return D7.b.b(uri);
    }
}
