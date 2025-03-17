package J7;

import C7.i;
import D7.b;
import I7.o;
import I7.p;
import I7.s;
import L7.E;
import X7.d;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class c implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37383a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37384a;

        public a(Context context) {
            this.f37384a = context;
        }

        public o<Uri, InputStream> d(s sVar) {
            return new c(this.f37384a);
        }

        public void teardown() {
        }
    }

    public c(Context context) {
        this.f37383a = context.getApplicationContext();
    }

    private boolean e(i iVar) {
        Long l10 = (Long) iVar.c(E.f38366d);
        return l10 != null && l10.longValue() == -1;
    }

    /* renamed from: c */
    public o.a<InputStream> b(Uri uri, int i10, int i11, i iVar) {
        if (!b.e(i10, i11) || !e(iVar)) {
            return null;
        }
        return new o.a<>(new d(uri), D7.c.g(this.f37383a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.d(uri);
    }
}
