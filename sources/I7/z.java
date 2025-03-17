package I7;

import C7.i;
import I7.o;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class z<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f37081b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", Constants.SCHEME})));

    /* renamed from: a  reason: collision with root package name */
    private final o<h, Data> f37082a;

    public static class a implements p<Uri, InputStream> {
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public z(o<h, Data> oVar) {
        this.f37082a = oVar;
    }

    /* renamed from: c */
    public o.a<Data> b(Uri uri, int i10, int i11, i iVar) {
        return this.f37082a.b(new h(uri.toString()), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return f37081b.contains(uri.getScheme());
    }
}
