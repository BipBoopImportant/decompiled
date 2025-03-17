package com.oppwa.mobile.connect.provider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.oppwa.mobile.connect.provider.d  reason: case insensitive filesystem */
class C14154d {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    @android.annotation.SuppressLint({"DiscouragedApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 >= r1) goto L_0x0020
            java.lang.String r0 = "window"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L_0x0031
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.heightPixels
            goto L_0x0032
        L_0x0020:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r1 = r8.getDisplay()
            if (r1 == 0) goto L_0x0031
            r1.getRealMetrics(r0)
            int r0 = r0.heightPixels
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r3 = "status_bar_height"
            java.lang.String r4 = "dimen"
            java.lang.String r5 = "android"
            int r1 = r1.getIdentifier(r3, r4, r5)
            if (r1 <= 0) goto L_0x004b
            android.content.res.Resources r3 = r8.getResources()
            int r1 = r3.getDimensionPixelSize(r1)
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            android.content.res.Resources$Theme r3 = r8.getTheme()
            r6 = 16843499(0x10102eb, float:2.3695652E-38)
            int[] r6 = new int[]{r6}
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r6)
            r6 = 0
            float r6 = r3.getDimension(r2, r6)
            int r6 = (int) r6
            r3.recycle()
            android.content.res.Resources r3 = r8.getResources()
            java.lang.String r7 = "navigation_bar_height"
            int r3 = r3.getIdentifier(r7, r4, r5)
            if (r3 <= 0) goto L_0x0078
            android.content.res.Resources r8 = r8.getResources()
            int r2 = r8.getDimensionPixelSize(r3)
        L_0x0078:
            int r0 = r0 - r1
            int r0 = r0 - r6
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x0082
            java.lang.String r8 = java.lang.Integer.toString(r0)
            return r8
        L_0x0082:
            java.lang.String r8 = "0"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.provider.C14154d.a(android.content.Context):java.lang.String");
    }

    static String b() {
        return "false";
    }

    static String c() {
        return "true";
    }

    static String d() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language)) {
            language = "en";
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        return language + "-" + country;
    }

    static String e() {
        return "32";
    }

    static String b(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "0";
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return Integer.toString(displayMetrics.widthPixels);
        }
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        Display a10 = context.getDisplay();
        if (a10 == null) {
            return "0";
        }
        a10.getRealMetrics(displayMetrics2);
        return Integer.toString(displayMetrics2.widthPixels);
    }

    static String c(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }

    static String a() {
        return "5";
    }

    static String a(TimeZone timeZone) {
        return Integer.toString(-((timeZone.getOffset(new Date().getTime()) / 1000) / 60));
    }

    static void a(Context context, PaymentParams paymentParams) {
        paymentParams.addParam("customer.browser.language", d());
        paymentParams.addParam("customer.browser.javaEnabled", b());
        paymentParams.addParam("customer.browser.javascriptEnabled", c());
        paymentParams.addParam("customer.browser.userAgent", c(context));
        paymentParams.addParam("customer.browser.screenHeight", a(context));
        paymentParams.addParam("customer.browser.screenWidth", b(context));
        paymentParams.addParam("customer.browser.screenColorDepth", e());
        paymentParams.addParam("customer.browser.challengeWindow", a());
        paymentParams.addParam("customer.browser.timezone", a(TimeZone.getDefault()));
    }
}
