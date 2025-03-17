package net.openid.appauth;

import AK.C15445b;
import AK.g;
import DK.C15582b;
import android.net.Uri;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class l implements C15445b {

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f145132g = a.a("id_token_hint", "post_logout_redirect_uri", "state", "ui_locales");

    /* renamed from: a  reason: collision with root package name */
    public final i f145133a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145134b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f145135c;

    /* renamed from: d  reason: collision with root package name */
    public final String f145136d;

    /* renamed from: e  reason: collision with root package name */
    public final String f145137e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f145138f;

    private l(i iVar, String str, Uri uri, String str2, String str3, Map<String, String> map) {
        this.f145133a = iVar;
        this.f145134b = str;
        this.f145135c = uri;
        this.f145136d = str2;
        this.f145137e = str3;
        this.f145138f = map;
    }

    public static l c(JSONObject jSONObject) {
        g.e(jSONObject, "json cannot be null");
        return new l(i.a(jSONObject.getJSONObject("configuration")), o.e(jSONObject, "id_token_hint"), o.i(jSONObject, "post_logout_redirect_uri"), o.e(jSONObject, "state"), o.e(jSONObject, "ui_locales"), o.g(jSONObject, "additionalParameters"));
    }

    public Uri a() {
        Uri.Builder buildUpon = this.f145133a.f145090c.buildUpon();
        C15582b.a(buildUpon, "id_token_hint", this.f145134b);
        C15582b.a(buildUpon, "state", this.f145136d);
        C15582b.a(buildUpon, "ui_locales", this.f145137e);
        Uri uri = this.f145135c;
        if (uri != null) {
            buildUpon.appendQueryParameter("post_logout_redirect_uri", uri.toString());
        }
        for (Map.Entry next : this.f145138f.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build();
    }

    public String b() {
        return d().toString();
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        o.m(jSONObject, "configuration", this.f145133a.b());
        o.p(jSONObject, "id_token_hint", this.f145134b);
        o.n(jSONObject, "post_logout_redirect_uri", this.f145135c);
        o.p(jSONObject, "state", this.f145136d);
        o.p(jSONObject, "ui_locales", this.f145137e);
        o.m(jSONObject, "additionalParameters", o.j(this.f145138f));
        return jSONObject;
    }

    public String getState() {
        return this.f145136d;
    }
}
