package com.google.android.gms.auth.api.signin;

import B9.c;
import K9.C6620s;
import L9.a;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: n  reason: collision with root package name */
    public static final e f47907n = h.d();

    /* renamed from: a  reason: collision with root package name */
    final int f47908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47909b;

    /* renamed from: c  reason: collision with root package name */
    private final String f47910c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47911d;

    /* renamed from: e  reason: collision with root package name */
    private final String f47912e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f47913f;

    /* renamed from: g  reason: collision with root package name */
    private String f47914g;

    /* renamed from: h  reason: collision with root package name */
    private final long f47915h;

    /* renamed from: i  reason: collision with root package name */
    private final String f47916i;

    /* renamed from: j  reason: collision with root package name */
    final List f47917j;

    /* renamed from: k  reason: collision with root package name */
    private final String f47918k;

    /* renamed from: l  reason: collision with root package name */
    private final String f47919l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f47920m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f47908a = i10;
        this.f47909b = str;
        this.f47910c = str2;
        this.f47911d = str3;
        this.f47912e = str4;
        this.f47913f = uri;
        this.f47914g = str5;
        this.f47915h = j10;
        this.f47916i = str6;
        this.f47917j = list;
        this.f47918k = str7;
        this.f47919l = str8;
    }

    public static GoogleSignInAccount X0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), C6620s.f(str7), new ArrayList((Collection) C6620s.l(set)), str5, str6);
    }

    public static GoogleSignInAccount a1(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount X02 = X0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        X02.f47914g = str2;
        return X02;
    }

    public String B() {
        return this.f47911d;
    }

    public Uri E0() {
        return this.f47913f;
    }

    public String F() {
        return this.f47919l;
    }

    public String J() {
        return this.f47918k;
    }

    public Set<Scope> N0() {
        HashSet hashSet = new HashSet(this.f47917j);
        hashSet.addAll(this.f47920m);
        return hashSet;
    }

    public String S0() {
        return this.f47914g;
    }

    public String U() {
        return this.f47909b;
    }

    public final String W1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (U() != null) {
                jSONObject.put("id", U());
            }
            if (t0() != null) {
                jSONObject.put("tokenId", t0());
            }
            if (B() != null) {
                jSONObject.put("email", B());
            }
            if (x() != null) {
                jSONObject.put("displayName", x());
            }
            if (J() != null) {
                jSONObject.put("givenName", J());
            }
            if (F() != null) {
                jSONObject.put("familyName", F());
            }
            Uri E02 = E0();
            if (E02 != null) {
                jSONObject.put("photoUrl", E02.toString());
            }
            if (S0() != null) {
                jSONObject.put("serverAuthCode", S0());
            }
            jSONObject.put("expirationTime", this.f47915h);
            jSONObject.put("obfuscatedIdentifier", this.f47916i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f47917j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.f33274a);
            for (Scope x10 : scopeArr) {
                jSONArray.put(x10.x());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f47916i.equals(this.f47916i) && googleSignInAccount.N0().equals(N0());
    }

    public int hashCode() {
        return ((this.f47916i.hashCode() + 527) * 31) + N0().hashCode();
    }

    public final String o1() {
        return this.f47916i;
    }

    public Account t() {
        String str = this.f47911d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String t0() {
        return this.f47910c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.n(parcel, 1, this.f47908a);
        L9.c.u(parcel, 2, U(), false);
        L9.c.u(parcel, 3, t0(), false);
        L9.c.u(parcel, 4, B(), false);
        L9.c.u(parcel, 5, x(), false);
        L9.c.t(parcel, 6, E0(), i10, false);
        L9.c.u(parcel, 7, S0(), false);
        L9.c.r(parcel, 8, this.f47915h);
        L9.c.u(parcel, 9, this.f47916i, false);
        L9.c.y(parcel, 10, this.f47917j, false);
        L9.c.u(parcel, 11, J(), false);
        L9.c.u(parcel, 12, F(), false);
        L9.c.b(parcel, a10);
    }

    public String x() {
        return this.f47912e;
    }
}
