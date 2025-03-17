package Fb;

import K9.C6619q;
import K9.C6620s;
import K9.C6623v;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.p;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f60417a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60418b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60419c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60420d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60421e;

    /* renamed from: f  reason: collision with root package name */
    private final String f60422f;

    /* renamed from: g  reason: collision with root package name */
    private final String f60423g;

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C6620s.q(!p.a(str), "ApplicationId must be set.");
        this.f60418b = str;
        this.f60417a = str2;
        this.f60419c = str3;
        this.f60420d = str4;
        this.f60421e = str5;
        this.f60422f = str6;
        this.f60423g = str7;
    }

    public static n a(Context context) {
        C6623v vVar = new C6623v(context);
        String a10 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new n(a10, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.f60417a;
    }

    public String c() {
        return this.f60418b;
    }

    public String d() {
        return this.f60421e;
    }

    public String e() {
        return this.f60423g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C6619q.b(this.f60418b, nVar.f60418b) && C6619q.b(this.f60417a, nVar.f60417a) && C6619q.b(this.f60419c, nVar.f60419c) && C6619q.b(this.f60420d, nVar.f60420d) && C6619q.b(this.f60421e, nVar.f60421e) && C6619q.b(this.f60422f, nVar.f60422f) && C6619q.b(this.f60423g, nVar.f60423g);
    }

    public int hashCode() {
        return C6619q.c(this.f60418b, this.f60417a, this.f60419c, this.f60420d, this.f60421e, this.f60422f, this.f60423g);
    }

    public String toString() {
        return C6619q.d(this).a("applicationId", this.f60418b).a("apiKey", this.f60417a).a("databaseUrl", this.f60419c).a("gcmSenderId", this.f60421e).a("storageBucket", this.f60422f).a("projectId", this.f60423g).toString();
    }
}
