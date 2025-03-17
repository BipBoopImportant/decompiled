package net.openid.appauth;

import AK.C15446c;
import DK.C15582b;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends C15446c {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f145057j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"token_type", "state", "code", "access_token", "expires_in", "id_token", "scope"})));

    /* renamed from: a  reason: collision with root package name */
    public final f f145058a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145059b;

    /* renamed from: c  reason: collision with root package name */
    public final String f145060c;

    /* renamed from: d  reason: collision with root package name */
    public final String f145061d;

    /* renamed from: e  reason: collision with root package name */
    public final String f145062e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f145063f;

    /* renamed from: g  reason: collision with root package name */
    public final String f145064g;

    /* renamed from: h  reason: collision with root package name */
    public final String f145065h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f145066i;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private f f145067a;

        /* renamed from: b  reason: collision with root package name */
        private String f145068b;

        /* renamed from: c  reason: collision with root package name */
        private String f145069c;

        /* renamed from: d  reason: collision with root package name */
        private String f145070d;

        /* renamed from: e  reason: collision with root package name */
        private String f145071e;

        /* renamed from: f  reason: collision with root package name */
        private Long f145072f;

        /* renamed from: g  reason: collision with root package name */
        private String f145073g;

        /* renamed from: h  reason: collision with root package name */
        private String f145074h;

        /* renamed from: i  reason: collision with root package name */
        private Map<String, String> f145075i = new LinkedHashMap();

        public b(f fVar) {
            this.f145067a = (f) AK.g.e(fVar, "authorization request cannot be null");
        }

        public g a() {
            return new g(this.f145067a, this.f145068b, this.f145069c, this.f145070d, this.f145071e, this.f145072f, this.f145073g, this.f145074h, Collections.unmodifiableMap(this.f145075i));
        }

        public b b(Uri uri) {
            return c(uri, p.f145158a);
        }

        /* access modifiers changed from: package-private */
        public b c(Uri uri, k kVar) {
            l(uri.getQueryParameter("state"));
            m(uri.getQueryParameter("token_type"));
            g(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            e(C15582b.d(uri, "expires_in"), kVar);
            h(uri.getQueryParameter("id_token"));
            i(uri.getQueryParameter("scope"));
            f(a.c(uri, g.f145057j));
            return this;
        }

        public b d(String str) {
            AK.g.f(str, "accessToken must not be empty");
            this.f145071e = str;
            return this;
        }

        public b e(Long l10, k kVar) {
            if (l10 == null) {
                this.f145072f = null;
            } else {
                this.f145072f = Long.valueOf(kVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            }
            return this;
        }

        public b f(Map<String, String> map) {
            this.f145075i = a.b(map, g.f145057j);
            return this;
        }

        public b g(String str) {
            AK.g.f(str, "authorizationCode must not be empty");
            this.f145070d = str;
            return this;
        }

        public b h(String str) {
            AK.g.f(str, "idToken cannot be empty");
            this.f145073g = str;
            return this;
        }

        public b i(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f145074h = null;
            } else {
                k(str.split(" +"));
            }
            return this;
        }

        public b j(Iterable<String> iterable) {
            this.f145074h = b.a(iterable);
            return this;
        }

        public b k(String... strArr) {
            if (strArr == null) {
                this.f145074h = null;
            } else {
                j(Arrays.asList(strArr));
            }
            return this;
        }

        public b l(String str) {
            AK.g.f(str, "state must not be empty");
            this.f145068b = str;
            return this;
        }

        public b m(String str) {
            AK.g.f(str, "tokenType must not be empty");
            this.f145069c = str;
            return this;
        }
    }

    public static g f(Intent intent) {
        AK.g.e(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return g(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    public static g g(String str) {
        return h(new JSONObject(str));
    }

    public static g h(JSONObject jSONObject) {
        if (jSONObject.has("request")) {
            return new g(f.c(jSONObject.getJSONObject("request")), o.e(jSONObject, "state"), o.e(jSONObject, "token_type"), o.e(jSONObject, "code"), o.e(jSONObject, "access_token"), o.c(jSONObject, "expires_at"), o.e(jSONObject, "id_token"), o.e(jSONObject, "scope"), o.g(jSONObject, "additional_parameters"));
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    public String a() {
        return this.f145059b;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.m(jSONObject, "request", this.f145058a.d());
        o.p(jSONObject, "state", this.f145059b);
        o.p(jSONObject, "token_type", this.f145060c);
        o.p(jSONObject, "code", this.f145061d);
        o.p(jSONObject, "access_token", this.f145062e);
        o.o(jSONObject, "expires_at", this.f145063f);
        o.p(jSONObject, "id_token", this.f145064g);
        o.p(jSONObject, "scope", this.f145065h);
        o.m(jSONObject, "additional_parameters", o.j(this.f145066i));
        return jSONObject;
    }

    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", c());
        return intent;
    }

    private g(f fVar, String str, String str2, String str3, String str4, Long l10, String str5, String str6, Map<String, String> map) {
        this.f145058a = fVar;
        this.f145059b = str;
        this.f145060c = str2;
        this.f145061d = str3;
        this.f145062e = str4;
        this.f145063f = l10;
        this.f145064g = str5;
        this.f145065h = str6;
        this.f145066i = map;
    }
}
