package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import b5.C7061c;
import b5.o;
import b5.p;
import b5.q;
import org.slf4j.Marker;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f41448a = Uri.parse(Marker.ANY_MARKER);

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f41449b = Uri.parse("");

    public static PackageInfo a() {
        return C7061c.a();
    }

    private static q b() {
        return p.d();
    }

    public static boolean c() {
        if (o.f45441R.c()) {
            return b().getStatics().isMultiProcessEnabled();
        }
        throw o.a();
    }
}
