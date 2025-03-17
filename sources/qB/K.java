package Qb;

import Nb.g;
import Qb.L;
import Rb.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nc.e;
import xa.C8974o;

public class K implements L {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f62934g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f62935h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final M f62936a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f62937b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62938c;

    /* renamed from: d  reason: collision with root package name */
    private final e f62939d;

    /* renamed from: e  reason: collision with root package name */
    private final F f62940e;

    /* renamed from: f  reason: collision with root package name */
    private L.a f62941f;

    public K(Context context, String str, e eVar, F f10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f62937b = context;
            this.f62938c = str;
            this.f62939d = eVar;
            this.f62940e = f10;
            this.f62936a = new M();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        g f10 = g.f();
        f10.i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f62934g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    private String m(String str) {
        return str.replaceAll(f62935h, "");
    }

    private boolean n() {
        L.a aVar = this.f62941f;
        return aVar == null || (aVar.e() == null && this.f62940e.d());
    }

    public synchronized L.a a() {
        if (!n()) {
            return this.f62941f;
        }
        g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q10 = C9251i.q(this.f62937b);
        String string = q10.getString("firebase.installation.id", (String) null);
        g f10 = g.f();
        f10.i("Cached Firebase Installation ID: " + string);
        if (this.f62940e.d()) {
            J d10 = d(false);
            g f11 = g.f();
            f11.i("Fetched Firebase Installation ID: " + d10.b());
            if (d10.b() == null) {
                d10 = new J(string == null ? c() : string, (String) null);
            }
            if (Objects.equals(d10.b(), string)) {
                this.f62941f = L.a.a(l(q10), d10);
            } else {
                this.f62941f = L.a.a(b(d10.b(), q10), d10);
            }
        } else if (k(string)) {
            this.f62941f = L.a.b(l(q10));
        } else {
            this.f62941f = L.a.b(b(c(), q10));
        }
        g f12 = g.f();
        f12.i("Install IDs: " + this.f62941f);
        return this.f62941f;
    }

    public J d(boolean z10) {
        String str;
        f.e();
        String str2 = null;
        if (z10) {
            try {
                str = ((com.google.firebase.installations.g) C8974o.b(this.f62939d.a(false), 10000, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                g.f().l("Error getting Firebase authentication token.", e10);
            }
            str2 = (String) C8974o.b(this.f62939d.getId(), 10000, TimeUnit.MILLISECONDS);
            return new J(str2, str);
        }
        str = null;
        try {
            str2 = (String) C8974o.b(this.f62939d.getId(), 10000, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            g.f().l("Error getting Firebase installation id.", e11);
        }
        return new J(str2, str);
    }

    public String f() {
        return this.f62938c;
    }

    public String g() {
        return this.f62936a.a(this.f62937b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m(Build.MANUFACTURER), m(Build.MODEL)});
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
