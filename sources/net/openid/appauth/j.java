package net.openid.appauth;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.openid.appauth.o;
import org.json.JSONObject;

public class j {

    /* renamed from: A  reason: collision with root package name */
    static final o.e f145093A = j("claim_types_supported", Collections.singletonList(Constants.NORMAL));

    /* renamed from: B  reason: collision with root package name */
    static final o.e f145094B = i("claims_supported");

    /* renamed from: C  reason: collision with root package name */
    static final o.f f145095C = k("service_documentation");

    /* renamed from: D  reason: collision with root package name */
    static final o.e f145096D = i("claims_locales_supported");

    /* renamed from: E  reason: collision with root package name */
    static final o.e f145097E = i("ui_locales_supported");

    /* renamed from: F  reason: collision with root package name */
    static final o.a f145098F = a("claims_parameter_supported", false);

    /* renamed from: G  reason: collision with root package name */
    static final o.a f145099G = a("request_parameter_supported", false);

    /* renamed from: H  reason: collision with root package name */
    static final o.a f145100H = a("request_uri_parameter_supported", true);

    /* renamed from: I  reason: collision with root package name */
    static final o.a f145101I = a("require_request_uri_registration", false);

    /* renamed from: J  reason: collision with root package name */
    static final o.f f145102J = k("op_policy_uri");

    /* renamed from: K  reason: collision with root package name */
    static final o.f f145103K = k("op_tos_uri");

    /* renamed from: L  reason: collision with root package name */
    private static final List<String> f145104L;

    /* renamed from: b  reason: collision with root package name */
    static final o.d f145105b;

    /* renamed from: c  reason: collision with root package name */
    static final o.f f145106c;

    /* renamed from: d  reason: collision with root package name */
    static final o.f f145107d = k("token_endpoint");

    /* renamed from: e  reason: collision with root package name */
    static final o.f f145108e = k("end_session_endpoint");

    /* renamed from: f  reason: collision with root package name */
    static final o.f f145109f = k("userinfo_endpoint");

    /* renamed from: g  reason: collision with root package name */
    static final o.f f145110g;

    /* renamed from: h  reason: collision with root package name */
    static final o.f f145111h = k("registration_endpoint");

    /* renamed from: i  reason: collision with root package name */
    static final o.e f145112i = i("scopes_supported");

    /* renamed from: j  reason: collision with root package name */
    static final o.e f145113j;

    /* renamed from: k  reason: collision with root package name */
    static final o.e f145114k = i("response_modes_supported");

    /* renamed from: l  reason: collision with root package name */
    static final o.e f145115l = j("grant_types_supported", Arrays.asList(new String[]{"authorization_code", "implicit"}));

    /* renamed from: m  reason: collision with root package name */
    static final o.e f145116m = i("acr_values_supported");

    /* renamed from: n  reason: collision with root package name */
    static final o.e f145117n;

    /* renamed from: o  reason: collision with root package name */
    static final o.e f145118o;

    /* renamed from: p  reason: collision with root package name */
    static final o.e f145119p = i("id_token_encryption_enc_values_supported");

    /* renamed from: q  reason: collision with root package name */
    static final o.e f145120q = i("id_token_encryption_enc_values_supported");

    /* renamed from: r  reason: collision with root package name */
    static final o.e f145121r = i("userinfo_signing_alg_values_supported");

    /* renamed from: s  reason: collision with root package name */
    static final o.e f145122s = i("userinfo_encryption_alg_values_supported");

    /* renamed from: t  reason: collision with root package name */
    static final o.e f145123t = i("userinfo_encryption_enc_values_supported");

    /* renamed from: u  reason: collision with root package name */
    static final o.e f145124u = i("request_object_signing_alg_values_supported");

    /* renamed from: v  reason: collision with root package name */
    static final o.e f145125v = i("request_object_encryption_alg_values_supported");

    /* renamed from: w  reason: collision with root package name */
    static final o.e f145126w = i("request_object_encryption_enc_values_supported");

    /* renamed from: x  reason: collision with root package name */
    static final o.e f145127x = j("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));

    /* renamed from: y  reason: collision with root package name */
    static final o.e f145128y = i("token_endpoint_auth_signing_alg_values_supported");

    /* renamed from: z  reason: collision with root package name */
    static final o.e f145129z = i("display_values_supported");

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f145130a;

    public static class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private String f145131a;

        public a(String str) {
            super("Missing mandatory configuration field: " + str);
            this.f145131a = str;
        }

        public String a() {
            return this.f145131a;
        }
    }

    static {
        o.d h10 = h("issuer");
        f145105b = h10;
        o.f k10 = k("authorization_endpoint");
        f145106c = k10;
        o.f k11 = k("jwks_uri");
        f145110g = k11;
        o.e i10 = i("response_types_supported");
        f145113j = i10;
        o.e i11 = i("subject_types_supported");
        f145117n = i11;
        o.e i12 = i("id_token_signing_alg_values_supported");
        f145118o = i12;
        f145104L = Arrays.asList(new String[]{h10.f145154a, k10.f145154a, k11.f145154a, i10.f145156a, i11.f145156a, i12.f145156a});
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(org.json.JSONObject r3) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = AK.g.d(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r2.f145130a = r3
            java.util.List<java.lang.String> r3 = f145104L
            java.util.Iterator r3 = r3.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = r2.f145130a
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L_0x002e
            org.json.JSONObject r1 = r2.f145130a
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x002e
            goto L_0x0011
        L_0x002e:
            net.openid.appauth.j$a r3 = new net.openid.appauth.j$a
            r3.<init>(r0)
            throw r3
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.j.<init>(org.json.JSONObject):void");
    }

    private static o.a a(String str, boolean z10) {
        return new o.a(str, z10);
    }

    private <T> T b(o.b<T> bVar) {
        return o.a(this.f145130a, bVar);
    }

    private static o.d h(String str) {
        return new o.d(str);
    }

    private static o.e i(String str) {
        return new o.e(str);
    }

    private static o.e j(String str, List<String> list) {
        return new o.e(str, list);
    }

    private static o.f k(String str) {
        return new o.f(str);
    }

    public Uri c() {
        return (Uri) b(f145106c);
    }

    public Uri d() {
        return (Uri) b(f145108e);
    }

    public String e() {
        return (String) b(f145105b);
    }

    public Uri f() {
        return (Uri) b(f145111h);
    }

    public Uri g() {
        return (Uri) b(f145107d);
    }
}
