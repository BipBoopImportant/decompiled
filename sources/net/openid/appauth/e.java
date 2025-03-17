package net.openid.appauth;

import AK.C15445b;
import AK.C15446c;
import AK.g;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import net.openid.appauth.g;
import net.openid.appauth.m;
import org.json.JSONObject;

class e {
    static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    static C15445b b(String str, String str2) {
        g.e(str, "jsonStr can not be null");
        JSONObject jSONObject = new JSONObject(str);
        if ("authorization".equals(str2)) {
            return f.c(jSONObject);
        }
        if ("end_session".equals(str2)) {
            return l.c(jSONObject);
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    static String c(C15445b bVar) {
        if (bVar instanceof f) {
            return "authorization";
        }
        if (bVar instanceof l) {
            return "end_session";
        }
        return null;
    }

    @SuppressLint({"VisibleForTests"})
    static C15446c d(C15445b bVar, Uri uri) {
        if (bVar instanceof f) {
            return new g.b((f) bVar).b(uri).a();
        }
        if (bVar instanceof l) {
            return new m.b((l) bVar).b(uri).a();
        }
        throw new IllegalArgumentException("Malformed request or uri");
    }
}
