package DL;

import android.content.Context;
import android.content.pm.PackageInfo;
import org.maplibre.android.MapLibre;
import org.maplibre.android.c;

/* renamed from: DL.a  reason: case insensitive filesystem */
public class C15583a {
    public static String a() {
        return b(MapLibre.getApplicationContext());
    }

    private static String b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return String.format("%s/%s (%s)", new Object[]{context.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception e10) {
            c.d(e10);
            return "";
        }
    }
}
