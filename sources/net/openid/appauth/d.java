package net.openid.appauth;

import AK.g;
import android.content.Intent;
import android.net.Uri;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import j0.C5445a;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f144985a;

    /* renamed from: b  reason: collision with root package name */
    public final int f144986b;

    /* renamed from: c  reason: collision with root package name */
    public final String f144987c;

    /* renamed from: d  reason: collision with root package name */
    public final String f144988d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f144989e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f144990a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f144991b;

        /* renamed from: c  reason: collision with root package name */
        public static final d f144992c;

        /* renamed from: d  reason: collision with root package name */
        public static final d f144993d;

        /* renamed from: e  reason: collision with root package name */
        public static final d f144994e;

        /* renamed from: f  reason: collision with root package name */
        public static final d f144995f;

        /* renamed from: g  reason: collision with root package name */
        public static final d f144996g;

        /* renamed from: h  reason: collision with root package name */
        public static final d f144997h;

        /* renamed from: i  reason: collision with root package name */
        public static final d f144998i;

        /* renamed from: j  reason: collision with root package name */
        public static final d f144999j = d.m(9, "Response state param did not match request state");

        /* renamed from: k  reason: collision with root package name */
        private static final Map<String, d> f145000k;

        static {
            d b10 = d.e(1000, "invalid_request");
            f144990a = b10;
            d b11 = d.e(1001, "unauthorized_client");
            f144991b = b11;
            d b12 = d.e(CashAppPayProcessorActivity.RESULT_ERROR, "access_denied");
            f144992c = b12;
            d b13 = d.e(AffirmProcessorActivity.RESULT_CODE_ERROR, "unsupported_response_type");
            f144993d = b13;
            d b14 = d.e(1004, "invalid_scope");
            f144994e = b14;
            d b15 = d.e(1005, "server_error");
            f144995f = b15;
            d b16 = d.e(1006, "temporarily_unavailable");
            f144996g = b16;
            d b17 = d.e(1007, (String) null);
            f144997h = b17;
            d b18 = d.e(1008, (String) null);
            f144998i = b18;
            f145000k = d.f(b10, b11, b12, b13, b14, b15, b16, b17, b18);
        }

        public static d a(String str) {
            d dVar = f145000k.get(str);
            return dVar != null ? dVar : f144998i;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145001a = d.m(0, "Invalid discovery document");

        /* renamed from: b  reason: collision with root package name */
        public static final d f145002b = d.m(1, "User cancelled flow");

        /* renamed from: c  reason: collision with root package name */
        public static final d f145003c = d.m(2, "Flow cancelled programmatically");

        /* renamed from: d  reason: collision with root package name */
        public static final d f145004d = d.m(3, "Network error");

        /* renamed from: e  reason: collision with root package name */
        public static final d f145005e = d.m(4, "Server error");

        /* renamed from: f  reason: collision with root package name */
        public static final d f145006f = d.m(5, "JSON deserialization error");

        /* renamed from: g  reason: collision with root package name */
        public static final d f145007g = d.m(6, "Token response construction error");

        /* renamed from: h  reason: collision with root package name */
        public static final d f145008h = d.m(7, "Invalid registration response");

        /* renamed from: i  reason: collision with root package name */
        public static final d f145009i = d.m(8, "Unable to parse ID Token");

        /* renamed from: j  reason: collision with root package name */
        public static final d f145010j = d.m(9, "Invalid ID Token");
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145011a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f145012b;

        /* renamed from: c  reason: collision with root package name */
        public static final d f145013c;

        /* renamed from: d  reason: collision with root package name */
        public static final d f145014d;

        /* renamed from: e  reason: collision with root package name */
        public static final d f145015e;

        /* renamed from: f  reason: collision with root package name */
        public static final d f145016f;

        /* renamed from: g  reason: collision with root package name */
        public static final d f145017g;

        /* renamed from: h  reason: collision with root package name */
        public static final d f145018h;

        /* renamed from: i  reason: collision with root package name */
        private static final Map<String, d> f145019i;

        static {
            d d10 = d.q(2000, "invalid_request");
            f145011a = d10;
            d d11 = d.q(2001, "invalid_client");
            f145012b = d11;
            d d12 = d.q(2002, "invalid_grant");
            f145013c = d12;
            d d13 = d.q(2003, "unauthorized_client");
            f145014d = d13;
            d d14 = d.q(2004, "unsupported_grant_type");
            f145015e = d14;
            d d15 = d.q(2005, "invalid_scope");
            f145016f = d15;
            d d16 = d.q(2006, (String) null);
            f145017g = d16;
            d d17 = d.q(2007, (String) null);
            f145018h = d17;
            f145019i = d.f(d10, d11, d12, d13, d14, d15, d16, d17);
        }

        public static d a(String str) {
            d dVar = f145019i.get(str);
            return dVar != null ? dVar : f145018h;
        }
    }

    public d(int i10, int i11, String str, String str2, Uri uri, Throwable th2) {
        super(str2, th2);
        this.f144985a = i10;
        this.f144986b = i11;
        this.f144987c = str;
        this.f144988d = str2;
        this.f144989e = uri;
    }

    /* access modifiers changed from: private */
    public static d e(int i10, String str) {
        return new d(1, i10, str, (String) null, (Uri) null, (Throwable) null);
    }

    /* access modifiers changed from: private */
    public static Map<String, d> f(d... dVarArr) {
        C5445a aVar = new C5445a(dVarArr != null ? dVarArr.length : 0);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                String str = dVar.f144987c;
                if (str != null) {
                    aVar.put(str, dVar);
                }
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    public static d g(Intent intent) {
        g.d(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return h(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e10);
        }
    }

    public static d h(String str) {
        g.c(str, "jsonStr cannot be null or empty");
        return i(new JSONObject(str));
    }

    public static d i(JSONObject jSONObject) {
        g.e(jSONObject, "json cannot be null");
        return new d(jSONObject.getInt("type"), jSONObject.getInt("code"), o.e(jSONObject, UiComponentContainer.RESULT_ERROR), o.e(jSONObject, "errorDescription"), o.i(jSONObject, "errorUri"), (Throwable) null);
    }

    public static d j(Uri uri) {
        String queryParameter = uri.getQueryParameter(UiComponentContainer.RESULT_ERROR);
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        d a10 = a.a(queryParameter);
        int i10 = a10.f144985a;
        int i11 = a10.f144986b;
        if (queryParameter2 == null) {
            queryParameter2 = a10.f144988d;
        }
        return new d(i10, i11, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : a10.f144989e, (Throwable) null);
    }

    public static d k(d dVar, String str, String str2, Uri uri) {
        int i10 = dVar.f144985a;
        int i11 = dVar.f144986b;
        if (str == null) {
            str = dVar.f144987c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = dVar.f144988d;
        }
        String str4 = str2;
        if (uri == null) {
            uri = dVar.f144989e;
        }
        return new d(i10, i11, str3, str4, uri, (Throwable) null);
    }

    public static d l(d dVar, Throwable th2) {
        return new d(dVar.f144985a, dVar.f144986b, dVar.f144987c, dVar.f144988d, dVar.f144989e, th2);
    }

    /* access modifiers changed from: private */
    public static d m(int i10, String str) {
        return new d(0, i10, (String) null, str, (Uri) null, (Throwable) null);
    }

    /* access modifiers changed from: private */
    public static d q(int i10, String str) {
        return new d(2, i10, str, (String) null, (Uri) null, (Throwable) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f144985a == dVar.f144985a && this.f144986b == dVar.f144986b;
    }

    public int hashCode() {
        return ((this.f144985a + 31) * 31) + this.f144986b;
    }

    public Intent n() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", p());
        return intent;
    }

    public JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        o.k(jSONObject, "type", this.f144985a);
        o.k(jSONObject, "code", this.f144986b);
        o.p(jSONObject, UiComponentContainer.RESULT_ERROR, this.f144987c);
        o.p(jSONObject, "errorDescription", this.f144988d);
        o.n(jSONObject, "errorUri", this.f144989e);
        return jSONObject;
    }

    public String p() {
        return o().toString();
    }

    public String toString() {
        return "AuthorizationException: " + p();
    }
}
