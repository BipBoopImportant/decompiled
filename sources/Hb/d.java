package hb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import s.C5827f;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f73508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f73509b;

    /* renamed from: c  reason: collision with root package name */
    public final int f73510c;

    /* renamed from: d  reason: collision with root package name */
    public final int f73511d;

    /* renamed from: e  reason: collision with root package name */
    public final int f73512e;

    /* renamed from: f  reason: collision with root package name */
    public final int f73513f;

    /* renamed from: g  reason: collision with root package name */
    public final int f73514g;

    /* renamed from: h  reason: collision with root package name */
    public final int f73515h;

    /* renamed from: i  reason: collision with root package name */
    public final int f73516i;

    /* renamed from: j  reason: collision with root package name */
    public final String f73517j;

    /* renamed from: k  reason: collision with root package name */
    public final int f73518k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f73519l;

    /* renamed from: m  reason: collision with root package name */
    public final String f73520m;

    /* renamed from: n  reason: collision with root package name */
    public final C5827f f73521n;

    /* renamed from: o  reason: collision with root package name */
    public final int f73522o;

    /* renamed from: p  reason: collision with root package name */
    public final String f73523p;

    private d(Bundle bundle, Resources resources) {
        this.f73508a = bundle.getString("android.support.customtabs.trusted.DEFAULT_URL");
        int i10 = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR", 17170443);
        this.f73509b = i10;
        this.f73510c = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR_DARK", i10);
        int i11 = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR", 17170443);
        this.f73511d = i11;
        this.f73512e = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR_DARK", i11);
        this.f73513f = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR", 17170445);
        this.f73514g = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR_DARK", i11);
        this.f73515h = bundle.getInt("android.support.customtabs.trusted.SPLASH_IMAGE_DRAWABLE", 0);
        this.f73516i = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_BACKGROUND_COLOR", 17170443);
        this.f73517j = bundle.getString("android.support.customtabs.trusted.FILE_PROVIDER_AUTHORITY");
        this.f73518k = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_FADE_OUT_DURATION", 0);
        String str = null;
        if (bundle.containsKey("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")) {
            this.f73519l = Arrays.asList(resources.getStringArray(bundle.getInt("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")));
        } else {
            this.f73519l = null;
        }
        this.f73520m = bundle.getString("android.support.customtabs.trusted.FALLBACK_STRATEGY");
        this.f73521n = a(bundle);
        this.f73522o = b(bundle.getString("android.support.customtabs.trusted.SCREEN_ORIENTATION"));
        int i12 = bundle.getInt("android.support.customtabs.trusted.METADATA_SHARE_TARGET", 0);
        this.f73523p = i12 != 0 ? resources.getString(i12) : str;
    }

    private static C5827f a(Bundle bundle) {
        String string = bundle.getString("android.support.customtabs.trusted.DISPLAY_MODE");
        return "immersive".equals(string) ? new C5827f.b(false, 0) : "sticky-immersive".equals(string) ? new C5827f.b(true, 0) : new C5827f.a();
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1228021296:
                if (str.equals("portrait-primary")) {
                    c10 = 0;
                    break;
                }
                break;
            case -147105566:
                if (str.equals("landscape-secondary")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c10 = 2;
                    break;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1728911401:
                if (str.equals("natural")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1862465776:
                if (str.equals("landscape-primary")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2012187074:
                if (str.equals("portrait-secondary")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 7;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 3;
            case 7:
                return 2;
            default:
                return 0;
        }
    }

    public static d c(Context context) {
        Bundle bundle;
        Resources resources = context.getResources();
        try {
            bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new d(bundle, resources);
    }
}
