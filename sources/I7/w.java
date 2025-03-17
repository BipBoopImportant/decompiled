package I7;

import C7.i;
import I7.o;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

public class w<Data> implements o<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final o<Uri, Data> f37072a;

    public static final class a implements p<String, AssetFileDescriptor> {
        public o<String, AssetFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        public o<String, ParcelFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    public static class c implements p<String, InputStream> {
        public o<String, InputStream> d(s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f37072a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public o.a<Data> b(String str, int i10, int i11, i iVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f37072a.a(e10)) {
            return null;
        }
        return this.f37072a.b(e10, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
