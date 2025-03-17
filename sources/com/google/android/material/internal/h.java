package com.google.android.material.internal;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Locale;

public class h {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return c() || e();
    }

    public static boolean c() {
        return a().equals("lge");
    }

    public static boolean d() {
        return a().equals("meizu");
    }

    public static boolean e() {
        return a().equals(Constants.REFERRER_API_SAMSUNG);
    }
}
