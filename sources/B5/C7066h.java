package b5;

import android.content.Context;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: b5.h  reason: case insensitive filesystem */
public class C7066h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f45415a;

    public C7066h(Context context) {
        this.f45415a = context;
    }

    public static String a(String str) {
        String a10 = C7069k.a(str);
        return a10 == null ? "text/plain" : a10;
    }

    private static InputStream b(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static String d(String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    public InputStream c(String str) {
        String d10 = d(str);
        return b(d10, this.f45415a.getAssets().open(d10, 2));
    }
}
