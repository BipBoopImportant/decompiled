package net.openid.appauth;

import AK.g;
import android.net.Uri;
import net.openid.appauth.j;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f145088a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f145089b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f145090c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f145091d;

    /* renamed from: e  reason: collision with root package name */
    public final j f145092e;

    public i(Uri uri, Uri uri2) {
        this(uri, uri2, (Uri) null);
    }

    public static i a(JSONObject jSONObject) {
        g.e(jSONObject, "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new i(new j(jSONObject.optJSONObject("discoveryDoc")));
            } catch (j.a e10) {
                throw new JSONException("Missing required field in discovery doc: " + e10.a());
            }
        } else {
            g.a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            g.a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new i(o.h(jSONObject, "authorizationEndpoint"), o.h(jSONObject, "tokenEndpoint"), o.i(jSONObject, "registrationEndpoint"), o.i(jSONObject, "endSessionEndpoint"));
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.l(jSONObject, "authorizationEndpoint", this.f145088a.toString());
        o.l(jSONObject, "tokenEndpoint", this.f145089b.toString());
        Uri uri = this.f145091d;
        if (uri != null) {
            o.l(jSONObject, "registrationEndpoint", uri.toString());
        }
        Uri uri2 = this.f145090c;
        if (uri2 != null) {
            o.l(jSONObject, "endSessionEndpoint", uri2.toString());
        }
        j jVar = this.f145092e;
        if (jVar != null) {
            o.m(jSONObject, "discoveryDoc", jVar.f145130a);
        }
        return jSONObject;
    }

    public i(Uri uri, Uri uri2, Uri uri3) {
        this(uri, uri2, uri3, (Uri) null);
    }

    public i(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        this.f145088a = (Uri) g.d(uri);
        this.f145089b = (Uri) g.d(uri2);
        this.f145091d = uri3;
        this.f145090c = uri4;
        this.f145092e = null;
    }

    public i(j jVar) {
        g.e(jVar, "docJson cannot be null");
        this.f145092e = jVar;
        this.f145088a = jVar.c();
        this.f145089b = jVar.g();
        this.f145091d = jVar.f();
        this.f145090c = jVar.d();
    }
}
