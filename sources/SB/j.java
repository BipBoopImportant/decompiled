package Sb;

import Tb.F;
import fc.C9700a;
import hc.C9771d;
import org.json.JSONObject;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final C9700a f63308a = new C9771d().j(a.f63259a).i();

    static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.C1109e h() {
        return F.e.d.C1109e.a().d(F.e.d.C1109e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
