package Qb;

import Nb.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: Qb.a  reason: case insensitive filesystem */
public class C9243a {

    /* renamed from: a  reason: collision with root package name */
    public final String f62950a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62951b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C9248f> f62952c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62953d;

    /* renamed from: e  reason: collision with root package name */
    public final String f62954e;

    /* renamed from: f  reason: collision with root package name */
    public final String f62955f;

    /* renamed from: g  reason: collision with root package name */
    public final String f62956g;

    /* renamed from: h  reason: collision with root package name */
    public final f f62957h;

    public C9243a(String str, String str2, List<C9248f> list, String str3, String str4, String str5, String str6, f fVar) {
        this.f62950a = str;
        this.f62951b = str2;
        this.f62952c = list;
        this.f62953d = str3;
        this.f62954e = str4;
        this.f62955f = str5;
        this.f62956g = str6;
        this.f62957h = fVar;
    }

    public static C9243a a(Context context, K k10, String str, String str2, List<C9248f> list, f fVar) {
        String packageName = context.getPackageName();
        String g10 = k10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b10 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C9243a(str, str2, list, g10, packageName, b10, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
