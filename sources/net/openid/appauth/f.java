package net.openid.appauth;

import AK.C15445b;
import AK.e;
import AK.g;
import DK.C15582b;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class f implements C15445b {

    /* renamed from: s  reason: collision with root package name */
    private static final Set<String> f145020s = a.a("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", "redirect_uri", "response_mode", "response_type", "scope", "state", "claims", "claims_locales");

    /* renamed from: a  reason: collision with root package name */
    public final i f145021a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145022b;

    /* renamed from: c  reason: collision with root package name */
    public final String f145023c;

    /* renamed from: d  reason: collision with root package name */
    public final String f145024d;

    /* renamed from: e  reason: collision with root package name */
    public final String f145025e;

    /* renamed from: f  reason: collision with root package name */
    public final String f145026f;

    /* renamed from: g  reason: collision with root package name */
    public final String f145027g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f145028h;

    /* renamed from: i  reason: collision with root package name */
    public final String f145029i;

    /* renamed from: j  reason: collision with root package name */
    public final String f145030j;

    /* renamed from: k  reason: collision with root package name */
    public final String f145031k;

    /* renamed from: l  reason: collision with root package name */
    public final String f145032l;

    /* renamed from: m  reason: collision with root package name */
    public final String f145033m;

    /* renamed from: n  reason: collision with root package name */
    public final String f145034n;

    /* renamed from: o  reason: collision with root package name */
    public final String f145035o;

    /* renamed from: p  reason: collision with root package name */
    public final JSONObject f145036p;

    /* renamed from: q  reason: collision with root package name */
    public final String f145037q;

    /* renamed from: r  reason: collision with root package name */
    public final Map<String, String> f145038r;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private i f145039a;

        /* renamed from: b  reason: collision with root package name */
        private String f145040b;

        /* renamed from: c  reason: collision with root package name */
        private String f145041c;

        /* renamed from: d  reason: collision with root package name */
        private String f145042d;

        /* renamed from: e  reason: collision with root package name */
        private String f145043e;

        /* renamed from: f  reason: collision with root package name */
        private String f145044f;

        /* renamed from: g  reason: collision with root package name */
        private String f145045g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f145046h;

        /* renamed from: i  reason: collision with root package name */
        private String f145047i;

        /* renamed from: j  reason: collision with root package name */
        private String f145048j;

        /* renamed from: k  reason: collision with root package name */
        private String f145049k;

        /* renamed from: l  reason: collision with root package name */
        private String f145050l;

        /* renamed from: m  reason: collision with root package name */
        private String f145051m;

        /* renamed from: n  reason: collision with root package name */
        private String f145052n;

        /* renamed from: o  reason: collision with root package name */
        private String f145053o;

        /* renamed from: p  reason: collision with root package name */
        private JSONObject f145054p;

        /* renamed from: q  reason: collision with root package name */
        private String f145055q;

        /* renamed from: r  reason: collision with root package name */
        private Map<String, String> f145056r = new HashMap();

        public b(i iVar, String str, String str2, Uri uri) {
            b(iVar);
            c(str);
            i(str2);
            h(uri);
            m(e.a());
            f(e.a());
            d(e.c());
        }

        public f a() {
            return new f(this.f145039a, this.f145040b, this.f145045g, this.f145046h, this.f145041c, this.f145042d, this.f145043e, this.f145044f, this.f145047i, this.f145048j, this.f145049k, this.f145050l, this.f145051m, this.f145052n, this.f145053o, this.f145054p, this.f145055q, Collections.unmodifiableMap(new HashMap(this.f145056r)));
        }

        public b b(i iVar) {
            this.f145039a = (i) g.e(iVar, "configuration cannot be null");
            return this;
        }

        public b c(String str) {
            this.f145040b = g.c(str, "client ID cannot be null or empty");
            return this;
        }

        public b d(String str) {
            if (str != null) {
                e.a(str);
                this.f145050l = str;
                this.f145051m = e.b(str);
                this.f145052n = e.e();
            } else {
                this.f145050l = null;
                this.f145051m = null;
                this.f145052n = null;
            }
            return this;
        }

        public b e(String str, String str2, String str3) {
            if (str != null) {
                e.a(str);
                g.c(str2, "code verifier challenge cannot be null or empty if verifier is set");
                g.c(str3, "code verifier challenge method cannot be null or empty if verifier is set");
            } else {
                boolean z10 = false;
                g.a(str2 == null, "code verifier challenge must be null if verifier is null");
                if (str3 == null) {
                    z10 = true;
                }
                g.a(z10, "code verifier challenge method must be null if verifier is null");
            }
            this.f145050l = str;
            this.f145051m = str2;
            this.f145052n = str3;
            return this;
        }

        public b f(String str) {
            this.f145049k = g.f(str, "nonce cannot be empty if defined");
            return this;
        }

        public b g(String str) {
            this.f145043e = g.f(str, "prompt must be null or non-empty");
            return this;
        }

        public b h(Uri uri) {
            this.f145046h = (Uri) g.e(uri, "redirect URI cannot be null or empty");
            return this;
        }

        public b i(String str) {
            this.f145045g = g.c(str, "expected response type cannot be null or empty");
            return this;
        }

        public b j(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f145047i = null;
            } else {
                l(str.split(" +"));
            }
            return this;
        }

        public b k(Iterable<String> iterable) {
            this.f145047i = b.a(iterable);
            return this;
        }

        public b l(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            k(Arrays.asList(strArr));
            return this;
        }

        public b m(String str) {
            this.f145048j = g.f(str, "state cannot be empty if defined");
            return this;
        }
    }

    public static f c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        g.e(jSONObject2, "json cannot be null");
        f fVar = r2;
        f fVar2 = new f(i.a(jSONObject2.getJSONObject("configuration")), o.d(jSONObject2, "clientId"), o.d(jSONObject2, "responseType"), o.h(jSONObject2, "redirectUri"), o.e(jSONObject2, "display"), o.e(jSONObject2, "login_hint"), o.e(jSONObject2, "prompt"), o.e(jSONObject2, "ui_locales"), o.e(jSONObject2, "scope"), o.e(jSONObject2, "state"), o.e(jSONObject2, "nonce"), o.e(jSONObject2, "codeVerifier"), o.e(jSONObject2, "codeVerifierChallenge"), o.e(jSONObject2, "codeVerifierChallengeMethod"), o.e(jSONObject2, "responseMode"), o.b(jSONObject2, "claims"), o.e(jSONObject2, "claimsLocales"), o.g(jSONObject2, "additionalParameters"));
        return fVar;
    }

    public Uri a() {
        Uri.Builder appendQueryParameter = this.f145021a.f145088a.buildUpon().appendQueryParameter("redirect_uri", this.f145028h.toString()).appendQueryParameter("client_id", this.f145022b).appendQueryParameter("response_type", this.f145027g);
        C15582b.a(appendQueryParameter, "display", this.f145023c);
        C15582b.a(appendQueryParameter, "login_hint", this.f145024d);
        C15582b.a(appendQueryParameter, "prompt", this.f145025e);
        C15582b.a(appendQueryParameter, "ui_locales", this.f145026f);
        C15582b.a(appendQueryParameter, "state", this.f145030j);
        C15582b.a(appendQueryParameter, "nonce", this.f145031k);
        C15582b.a(appendQueryParameter, "scope", this.f145029i);
        C15582b.a(appendQueryParameter, "response_mode", this.f145035o);
        if (this.f145032l != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f145033m).appendQueryParameter("code_challenge_method", this.f145034n);
        }
        C15582b.a(appendQueryParameter, "claims", this.f145036p);
        C15582b.a(appendQueryParameter, "claims_locales", this.f145037q);
        for (Map.Entry next : this.f145038r.entrySet()) {
            appendQueryParameter.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return appendQueryParameter.build();
    }

    public String b() {
        return d().toString();
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        o.m(jSONObject, "configuration", this.f145021a.b());
        o.l(jSONObject, "clientId", this.f145022b);
        o.l(jSONObject, "responseType", this.f145027g);
        o.l(jSONObject, "redirectUri", this.f145028h.toString());
        o.p(jSONObject, "display", this.f145023c);
        o.p(jSONObject, "login_hint", this.f145024d);
        o.p(jSONObject, "scope", this.f145029i);
        o.p(jSONObject, "prompt", this.f145025e);
        o.p(jSONObject, "ui_locales", this.f145026f);
        o.p(jSONObject, "state", this.f145030j);
        o.p(jSONObject, "nonce", this.f145031k);
        o.p(jSONObject, "codeVerifier", this.f145032l);
        o.p(jSONObject, "codeVerifierChallenge", this.f145033m);
        o.p(jSONObject, "codeVerifierChallengeMethod", this.f145034n);
        o.p(jSONObject, "responseMode", this.f145035o);
        o.q(jSONObject, "claims", this.f145036p);
        o.p(jSONObject, "claimsLocales", this.f145037q);
        o.m(jSONObject, "additionalParameters", o.j(this.f145038r));
        return jSONObject;
    }

    public String getState() {
        return this.f145030j;
    }

    private f(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map<String, String> map) {
        this.f145021a = iVar;
        this.f145022b = str;
        this.f145027g = str2;
        this.f145028h = uri;
        this.f145038r = map;
        this.f145023c = str3;
        this.f145024d = str4;
        this.f145025e = str5;
        this.f145026f = str6;
        this.f145029i = str7;
        this.f145030j = str8;
        this.f145031k = str9;
        this.f145032l = str10;
        this.f145033m = str11;
        this.f145034n = str12;
        this.f145035o = str13;
        this.f145036p = jSONObject;
        this.f145037q = str14;
    }
}
