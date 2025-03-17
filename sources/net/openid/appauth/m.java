package net.openid.appauth;

import AK.C15446c;
import AK.g;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;

public class m extends C15446c {

    /* renamed from: a  reason: collision with root package name */
    public final l f145139a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145140b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private l f145141a;

        /* renamed from: b  reason: collision with root package name */
        private String f145142b;

        public b(l lVar) {
            c(lVar);
        }

        public m a() {
            return new m(this.f145141a, this.f145142b);
        }

        /* access modifiers changed from: package-private */
        public b b(Uri uri) {
            d(uri.getQueryParameter("state"));
            return this;
        }

        public b c(l lVar) {
            this.f145141a = (l) g.e(lVar, "request cannot be null");
            return this;
        }

        public b d(String str) {
            this.f145142b = g.f(str, "state must not be empty");
            return this;
        }
    }

    public String a() {
        return this.f145140b;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.m(jSONObject, "request", this.f145139a.d());
        o.p(jSONObject, "state", this.f145140b);
        return jSONObject;
    }

    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.EndSessionResponse", c());
        return intent;
    }

    private m(l lVar, String str) {
        this.f145139a = lVar;
        this.f145140b = str;
    }
}
