package Yb;

import Nb.g;
import Qb.C9267z;
import Rb.f;
import Vb.a;
import Vb.b;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final String f64896a;

    /* renamed from: b  reason: collision with root package name */
    private final b f64897b;

    /* renamed from: c  reason: collision with root package name */
    private final g f64898c;

    public c(String str, b bVar) {
        this(str, bVar, g.f());
    }

    private a b(a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f64925a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C9267z.q());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f64926b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f64927c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f64928d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f64929e.a().c());
        return aVar;
    }

    private void c(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            g gVar = this.f64898c;
            gVar.l("Failed to parse settings JSON from " + this.f64896a, e10);
            g gVar2 = this.f64898c;
            gVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", kVar.f64932h);
        hashMap.put("display_version", kVar.f64931g);
        hashMap.put("source", Integer.toString(kVar.f64933i));
        String str = kVar.f64930f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject a(k kVar, boolean z10) {
        f.d();
        if (z10) {
            try {
                Map<String, String> f10 = f(kVar);
                a b10 = b(d(f10), kVar);
                g gVar = this.f64898c;
                gVar.b("Requesting settings from " + this.f64896a);
                g gVar2 = this.f64898c;
                gVar2.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f64898c.e("Settings request failed.", e10);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    public a d(Map<String, String> map) {
        a a10 = this.f64897b.a(this.f64896a, map);
        return a10.d("User-Agent", "Crashlytics Android SDK/" + C9267z.q()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    public JSONObject g(Vb.c cVar) {
        int b10 = cVar.b();
        g gVar = this.f64898c;
        gVar.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        g gVar2 = this.f64898c;
        gVar2.d("Settings request failed; (status: " + b10 + ") from " + this.f64896a);
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, b bVar, g gVar) {
        if (str != null) {
            this.f64898c = gVar;
            this.f64897b = bVar;
            this.f64896a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
