package Zc;

import K9.C6612j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.util.l;
import java.util.Locale;

/* renamed from: Zc.c  reason: case insensitive filesystem */
public class C9394c {

    /* renamed from: a  reason: collision with root package name */
    private static final C6612j f65088a = new C6612j("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            f65088a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (l.c()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
