package androidx.core.app;

import H2.i;
import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

public class n {

    /* renamed from: a  reason: collision with root package name */
    final String f20987a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f20988b;

    /* renamed from: c  reason: collision with root package name */
    int f20989c;

    /* renamed from: d  reason: collision with root package name */
    String f20990d;

    /* renamed from: e  reason: collision with root package name */
    String f20991e;

    /* renamed from: f  reason: collision with root package name */
    boolean f20992f = true;

    /* renamed from: g  reason: collision with root package name */
    Uri f20993g = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* renamed from: h  reason: collision with root package name */
    AudioAttributes f20994h;

    /* renamed from: i  reason: collision with root package name */
    boolean f20995i;

    /* renamed from: j  reason: collision with root package name */
    int f20996j = 0;

    /* renamed from: k  reason: collision with root package name */
    boolean f20997k;

    /* renamed from: l  reason: collision with root package name */
    long[] f20998l;

    /* renamed from: m  reason: collision with root package name */
    String f20999m;

    /* renamed from: n  reason: collision with root package name */
    String f21000n;

    static class a {
        static NotificationChannel a(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        static void b(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        static void c(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        static void d(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void e(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void f(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        static void g(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        static void h(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void i(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }
    }

    static class b {
        static void a(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final n f21001a;

        public c(String str, int i10) {
            this.f21001a = new n(str, i10);
        }

        public n a() {
            return this.f21001a;
        }

        public c b(CharSequence charSequence) {
            this.f21001a.f20988b = charSequence;
            return this;
        }
    }

    n(String str, int i10) {
        this.f20987a = (String) i.g(str);
        this.f20989c = i10;
        this.f20994h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public String a() {
        return this.f20987a;
    }

    /* access modifiers changed from: package-private */
    public NotificationChannel b() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        NotificationChannel a10 = a.a(this.f20987a, this.f20988b, this.f20989c);
        a.d(a10, this.f20990d);
        a.e(a10, this.f20991e);
        a.g(a10, this.f20992f);
        a.h(a10, this.f20993g, this.f20994h);
        a.b(a10, this.f20995i);
        a.f(a10, this.f20996j);
        a.i(a10, this.f20998l);
        a.c(a10, this.f20997k);
        if (!(i10 < 30 || (str = this.f20999m) == null || (str2 = this.f21000n) == null)) {
            b.a(a10, str, str2);
        }
        return a10;
    }
}
