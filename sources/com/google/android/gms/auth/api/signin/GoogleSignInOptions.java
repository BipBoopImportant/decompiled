package com.google.android.gms.auth.api.signin;

import B9.d;
import C9.b;
import K9.C6620s;
import L9.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions extends L9.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();

    /* renamed from: l  reason: collision with root package name */
    public static final GoogleSignInOptions f47921l;

    /* renamed from: m  reason: collision with root package name */
    public static final GoogleSignInOptions f47922m;

    /* renamed from: n  reason: collision with root package name */
    public static final Scope f47923n = new Scope("profile");

    /* renamed from: o  reason: collision with root package name */
    public static final Scope f47924o = new Scope("email");

    /* renamed from: p  reason: collision with root package name */
    public static final Scope f47925p = new Scope("openid");

    /* renamed from: q  reason: collision with root package name */
    public static final Scope f47926q;

    /* renamed from: r  reason: collision with root package name */
    public static final Scope f47927r = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: s  reason: collision with root package name */
    private static final Comparator f47928s = new d();

    /* renamed from: a  reason: collision with root package name */
    final int f47929a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f47930b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Account f47931c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f47932d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f47933e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47934f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f47935g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f47936h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f47937i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f47938j;

    /* renamed from: k  reason: collision with root package name */
    private Map f47939k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f47926q = scope;
        a aVar = new a();
        aVar.b();
        aVar.c();
        f47921l = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f47922m = aVar2.a();
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, d dVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    public static GoogleSignInOptions S0(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, optString2, str2, (Map) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    public static Map u3(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9.a aVar = (C9.a) it.next();
                hashMap.put(Integer.valueOf(aVar.x()), aVar);
            }
        }
        return hashMap;
    }

    public String B() {
        return this.f47938j;
    }

    public boolean E0() {
        return this.f47933e;
    }

    public ArrayList<Scope> F() {
        return new ArrayList<>(this.f47930b);
    }

    public String J() {
        return this.f47935g;
    }

    public boolean U() {
        return this.f47934f;
    }

    public final String W1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f47930b, f47928s);
            Iterator it = this.f47930b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).x());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f47931c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f47932d);
            jSONObject.put("forceCodeForRefreshToken", this.f47934f);
            jSONObject.put("serverAuthRequested", this.f47933e);
            if (!TextUtils.isEmpty(this.f47935g)) {
                jSONObject.put("serverClientId", this.f47935g);
            }
            if (!TextUtils.isEmpty(this.f47936h)) {
                jSONObject.put("hostedDomain", this.f47936h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.t()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f47937i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f47937i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f47930b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.F()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f47930b     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.F()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f47931c     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.t()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.t()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f47935g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.J()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f47935g     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.J()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f47934f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.U()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f47932d     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.t0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f47933e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.E0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f47938j     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.B()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f47930b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).x());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.f47931c);
        bVar.a(this.f47935g);
        bVar.c(this.f47934f);
        bVar.c(this.f47932d);
        bVar.c(this.f47933e);
        bVar.a(this.f47938j);
        return bVar.b();
    }

    public Account t() {
        return this.f47931c;
    }

    public boolean t0() {
        return this.f47932d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f47929a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.y(parcel, 2, F(), false);
        c.t(parcel, 3, t(), i10, false);
        c.c(parcel, 4, t0());
        c.c(parcel, 5, E0());
        c.c(parcel, 6, U());
        c.u(parcel, 7, J(), false);
        c.u(parcel, 8, this.f47936h, false);
        c.y(parcel, 9, x(), false);
        c.u(parcel, 10, B(), false);
        c.b(parcel, a10);
    }

    public ArrayList<C9.a> x() {
        return this.f47937i;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Set f47940a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private boolean f47941b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f47942c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f47943d;

        /* renamed from: e  reason: collision with root package name */
        private String f47944e;

        /* renamed from: f  reason: collision with root package name */
        private Account f47945f;

        /* renamed from: g  reason: collision with root package name */
        private String f47946g;

        /* renamed from: h  reason: collision with root package name */
        private Map f47947h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private String f47948i;

        public a() {
        }

        public GoogleSignInOptions a() {
            if (this.f47940a.contains(GoogleSignInOptions.f47927r)) {
                Set set = this.f47940a;
                Scope scope = GoogleSignInOptions.f47926q;
                if (set.contains(scope)) {
                    this.f47940a.remove(scope);
                }
            }
            if (this.f47943d && (this.f47945f == null || !this.f47940a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f47940a), this.f47945f, this.f47943d, this.f47941b, this.f47942c, this.f47944e, this.f47946g, this.f47947h, this.f47948i, (d) null);
        }

        public a b() {
            this.f47940a.add(GoogleSignInOptions.f47925p);
            return this;
        }

        public a c() {
            this.f47940a.add(GoogleSignInOptions.f47923n);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.f47940a.add(scope);
            this.f47940a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.f47948i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            C6620s.l(googleSignInOptions);
            this.f47940a = new HashSet(googleSignInOptions.f47930b);
            this.f47941b = googleSignInOptions.f47933e;
            this.f47942c = googleSignInOptions.f47934f;
            this.f47943d = googleSignInOptions.f47932d;
            this.f47944e = googleSignInOptions.f47935g;
            this.f47945f = googleSignInOptions.f47931c;
            this.f47946g = googleSignInOptions.f47936h;
            this.f47947h = GoogleSignInOptions.u3(googleSignInOptions.f47937i);
            this.f47948i = googleSignInOptions.f47938j;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, u3(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f47929a = i10;
        this.f47930b = arrayList;
        this.f47931c = account;
        this.f47932d = z10;
        this.f47933e = z11;
        this.f47934f = z12;
        this.f47935g = str;
        this.f47936h = str2;
        this.f47937i = new ArrayList(map.values());
        this.f47939k = map;
        this.f47938j = str3;
    }
}
