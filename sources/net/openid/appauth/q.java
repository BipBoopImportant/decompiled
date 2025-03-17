package net.openid.appauth;

import AK.e;
import AK.g;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class q {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Set<String> f145159k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope"})));

    /* renamed from: a  reason: collision with root package name */
    public final i f145160a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145161b;

    /* renamed from: c  reason: collision with root package name */
    public final String f145162c;

    /* renamed from: d  reason: collision with root package name */
    public final String f145163d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f145164e;

    /* renamed from: f  reason: collision with root package name */
    public final String f145165f;

    /* renamed from: g  reason: collision with root package name */
    public final String f145166g;

    /* renamed from: h  reason: collision with root package name */
    public final String f145167h;

    /* renamed from: i  reason: collision with root package name */
    public final String f145168i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, String> f145169j;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private i f145170a;

        /* renamed from: b  reason: collision with root package name */
        private String f145171b;

        /* renamed from: c  reason: collision with root package name */
        private String f145172c;

        /* renamed from: d  reason: collision with root package name */
        private String f145173d;

        /* renamed from: e  reason: collision with root package name */
        private Uri f145174e;

        /* renamed from: f  reason: collision with root package name */
        private String f145175f;

        /* renamed from: g  reason: collision with root package name */
        private String f145176g;

        /* renamed from: h  reason: collision with root package name */
        private String f145177h;

        /* renamed from: i  reason: collision with root package name */
        private String f145178i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f145179j = new LinkedHashMap();

        public b(i iVar, String str) {
            g(iVar);
            e(str);
        }

        private String b() {
            String str = this.f145173d;
            if (str != null) {
                return str;
            }
            if (this.f145176g != null) {
                return "authorization_code";
            }
            if (this.f145177h != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        public q a() {
            String b10 = b();
            if ("authorization_code".equals(b10)) {
                g.e(this.f145176g, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(b10)) {
                g.e(this.f145177h, "refresh token must be specified for grant_type = refresh_token");
            }
            if (!b10.equals("authorization_code") || this.f145174e != null) {
                return new q(this.f145170a, this.f145171b, this.f145172c, b10, this.f145174e, this.f145175f, this.f145176g, this.f145177h, this.f145178i, Collections.unmodifiableMap(this.f145179j));
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }

        public b c(Map<String, String> map) {
            this.f145179j = a.b(map, q.f145159k);
            return this;
        }

        public b d(String str) {
            g.f(str, "authorization code must not be empty");
            this.f145176g = str;
            return this;
        }

        public b e(String str) {
            this.f145171b = g.c(str, "clientId cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (str != null) {
                e.a(str);
            }
            this.f145178i = str;
            return this;
        }

        public b g(i iVar) {
            this.f145170a = (i) g.d(iVar);
            return this;
        }

        public b h(Uri uri) {
            if (uri != null) {
                g.e(uri.getScheme(), "redirectUri must have a scheme");
            }
            this.f145174e = uri;
            return this;
        }
    }

    private void c(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", this.f145163d);
        c(hashMap, "redirect_uri", this.f145164e);
        c(hashMap, "code", this.f145165f);
        c(hashMap, "refresh_token", this.f145167h);
        c(hashMap, "code_verifier", this.f145168i);
        c(hashMap, "scope", this.f145166g);
        for (Map.Entry next : this.f145169j.entrySet()) {
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        return hashMap;
    }

    private q(i iVar, String str, String str2, String str3, Uri uri, String str4, String str5, String str6, String str7, Map<String, String> map) {
        this.f145160a = iVar;
        this.f145162c = str;
        this.f145161b = str2;
        this.f145163d = str3;
        this.f145164e = uri;
        this.f145166g = str4;
        this.f145165f = str5;
        this.f145167h = str6;
        this.f145168i = str7;
        this.f145169j = map;
    }
}
