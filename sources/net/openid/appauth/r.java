package net.openid.appauth;

import AK.g;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class r {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Set<String> f145180i = new HashSet(Arrays.asList(new String[]{"token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"}));

    /* renamed from: a  reason: collision with root package name */
    public final q f145181a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145182b;

    /* renamed from: c  reason: collision with root package name */
    public final String f145183c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f145184d;

    /* renamed from: e  reason: collision with root package name */
    public final String f145185e;

    /* renamed from: f  reason: collision with root package name */
    public final String f145186f;

    /* renamed from: g  reason: collision with root package name */
    public final String f145187g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f145188h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private q f145189a;

        /* renamed from: b  reason: collision with root package name */
        private String f145190b;

        /* renamed from: c  reason: collision with root package name */
        private String f145191c;

        /* renamed from: d  reason: collision with root package name */
        private Long f145192d;

        /* renamed from: e  reason: collision with root package name */
        private String f145193e;

        /* renamed from: f  reason: collision with root package name */
        private String f145194f;

        /* renamed from: g  reason: collision with root package name */
        private String f145195g;

        /* renamed from: h  reason: collision with root package name */
        private Map<String, String> f145196h = Collections.emptyMap();

        public a(q qVar) {
            j(qVar);
        }

        public r a() {
            return new r(this.f145189a, this.f145190b, this.f145191c, this.f145192d, this.f145193e, this.f145194f, this.f145195g, this.f145196h);
        }

        public a b(JSONObject jSONObject) {
            n(o.d(jSONObject, "token_type"));
            c(o.e(jSONObject, "access_token"));
            d(o.c(jSONObject, "expires_at"));
            if (jSONObject.has("expires_in")) {
                e(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            i(o.e(jSONObject, "refresh_token"));
            h(o.e(jSONObject, "id_token"));
            k(o.e(jSONObject, "scope"));
            g(a.d(jSONObject, r.f145180i));
            return this;
        }

        public a c(String str) {
            this.f145191c = g.f(str, "access token cannot be empty if specified");
            return this;
        }

        public a d(Long l10) {
            this.f145192d = l10;
            return this;
        }

        public a e(Long l10) {
            return f(l10, p.f145158a);
        }

        /* access modifiers changed from: package-private */
        public a f(Long l10, k kVar) {
            if (l10 == null) {
                this.f145192d = null;
            } else {
                this.f145192d = Long.valueOf(kVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            }
            return this;
        }

        public a g(Map<String, String> map) {
            this.f145196h = a.b(map, r.f145180i);
            return this;
        }

        public a h(String str) {
            this.f145193e = g.f(str, "id token must not be empty if defined");
            return this;
        }

        public a i(String str) {
            this.f145194f = g.f(str, "refresh token must not be empty if defined");
            return this;
        }

        public a j(q qVar) {
            this.f145189a = (q) g.e(qVar, "request cannot be null");
            return this;
        }

        public a k(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f145195g = null;
            } else {
                m(str.split(" +"));
            }
            return this;
        }

        public a l(Iterable<String> iterable) {
            this.f145195g = b.a(iterable);
            return this;
        }

        public a m(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            l(Arrays.asList(strArr));
            return this;
        }

        public a n(String str) {
            this.f145190b = g.f(str, "token type must not be empty if defined");
            return this;
        }
    }

    r(q qVar, String str, String str2, Long l10, String str3, String str4, String str5, Map<String, String> map) {
        this.f145181a = qVar;
        this.f145182b = str;
        this.f145183c = str2;
        this.f145184d = l10;
        this.f145185e = str3;
        this.f145186f = str4;
        this.f145187g = str5;
        this.f145188h = map;
    }
}
