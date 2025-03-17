package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.o;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.concurrent.atomic.AtomicInteger;
import u2.C6012a;

/* renamed from: com.google.firebase.messaging.c  reason: case insensitive filesystem */
public final class C9545c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f68402a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.c$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final o.e f68403a;

        /* renamed from: b  reason: collision with root package name */
        public final String f68404b;

        /* renamed from: c  reason: collision with root package name */
        public final int f68405c;

        a(o.e eVar, String str, int i10) {
            this.f68403a = eVar;
            this.f68404b = str;
            this.f68405c = i10;
        }
    }

    private static PendingIntent a(Context context, J j10, String str, PackageManager packageManager) {
        Intent f10 = f(str, j10, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(j10.y());
        if (q(j10)) {
            f10.putExtra("gcm.n.analytics_data", j10.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(CatalogRepository.FETCH_FLAG_SDB));
    }

    private static PendingIntent b(Context context, Context context2, J j10) {
        if (!q(j10)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(j10.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(CatalogRepository.FETCH_FLAG_SDB));
    }

    public static a d(Context context, Context context2, J j10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        o.e eVar = new o.e(context2, str);
        String n10 = j10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.j(n10);
        }
        String n11 = j10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.i(n11);
            eVar.x(new o.c().h(n11));
        }
        eVar.u(m(packageManager, resources, packageName, j10.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, j10, resources);
        if (n12 != null) {
            eVar.w(n12);
        }
        eVar.h(a(context, j10, packageName, packageManager));
        PendingIntent b10 = b(context, context2, j10);
        if (b10 != null) {
            eVar.l(b10);
        }
        Integer h10 = h(context2, j10.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.g(h10.intValue());
        }
        eVar.e(!j10.a("gcm.n.sticky"));
        eVar.p(j10.a("gcm.n.local_only"));
        String p10 = j10.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.y(p10);
        }
        Integer m10 = j10.m();
        if (m10 != null) {
            eVar.s(m10.intValue());
        }
        Integer r10 = j10.r();
        if (r10 != null) {
            eVar.A(r10.intValue());
        }
        Integer l10 = j10.l();
        if (l10 != null) {
            eVar.q(l10.intValue());
        }
        Long j11 = j10.j("gcm.n.event_time");
        if (j11 != null) {
            eVar.t(true);
            eVar.B(j11.longValue());
        }
        long[] q10 = j10.q();
        if (q10 != null) {
            eVar.z(q10);
        }
        int[] e10 = j10.e();
        if (e10 != null) {
            eVar.o(e10[0], e10[1], e10[2]);
        }
        eVar.k(i(j10));
        return new a(eVar, o(j10), 0);
    }

    static a e(Context context, J j10) {
        Bundle j11 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, j10, k(context, j10.k(), j11), j11);
    }

    private static Intent f(String str, J j10, PackageManager packageManager) {
        String p10 = j10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = j10.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f68402a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C6012a.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static int i(J j10) {
        boolean a10 = j10.a("gcm.n.default_sound");
        if (j10.a("gcm.n.default_vibrate_timings")) {
            a10 |= true;
        }
        return j10.a("gcm.n.default_light_settings") ? a10 | true ? 1 : 0 : a10 ? 1 : 0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", FeatureVariable.STRING_TYPE, context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, J j10, Resources resources) {
        String o10 = j10.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if ("default".equals(o10) || resources.getIdentifier(o10, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o10);
    }

    private static String o(J j10) {
        String p10 = j10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(J j10) {
        return j10.a("google.c.a.e");
    }
}
