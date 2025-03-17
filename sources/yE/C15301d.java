package yE;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yE.d  reason: case insensitive filesystem */
public class C15301d {

    /* renamed from: e  reason: collision with root package name */
    public static String f132213e = "https://cdn.optimizely.com";

    /* renamed from: f  reason: collision with root package name */
    public static String f132214f = "/json/%s.json";

    /* renamed from: g  reason: collision with root package name */
    public static String f132215g = "/datafiles/%s.json";

    /* renamed from: h  reason: collision with root package name */
    public static String f132216h = "::::";

    /* renamed from: a  reason: collision with root package name */
    private final String f132217a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132218b;

    /* renamed from: c  reason: collision with root package name */
    private final String f132219c;

    /* renamed from: d  reason: collision with root package name */
    private final String f132220d;

    public C15301d(String str, String str2, String str3) {
        this.f132217a = str;
        this.f132218b = str2;
        this.f132219c = str3;
        if (str2 != null) {
            this.f132220d = String.format(str3 + f132215g, new Object[]{str2});
            return;
        }
        this.f132220d = String.format(str3 + f132214f, new Object[]{str});
    }

    public static C15301d a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C15301d(jSONObject.has("projectId") ? jSONObject.getString("projectId") : null, jSONObject.has("sdkKey") ? jSONObject.getString("sdkKey") : null);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String b() {
        String str = this.f132218b;
        return str != null ? str : this.f132217a;
    }

    public String c() {
        return this.f132220d;
    }

    public String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("projectId", this.f132217a);
            jSONObject.put("sdkKey", this.f132218b);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15301d)) {
            return false;
        }
        C15301d dVar = (C15301d) obj;
        String str2 = this.f132217a;
        if (str2 != null) {
            String str3 = dVar.f132217a;
            if (str3 != null) {
                return str2.equals(str3);
            }
            if (str2 == str3) {
                return true;
            }
        } else if (dVar.f132217a == null && (str = this.f132218b) != null) {
            String str4 = dVar.f132218b;
            if (str4 != null) {
                return str.equals(str4);
            }
            if (str == str4) {
                return true;
            }
        } else if (dVar.f132218b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f132217a;
        int i10 = 0;
        int hashCode = 527 + (str == null ? 0 : str.hashCode());
        String str2 = this.f132218b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f132217a;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = "null";
        sb2.append(str2);
        sb2.append(f132216h);
        String str3 = this.f132218b;
        if (str3 != null) {
            str2 = str3;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public C15301d(String str, String str2) {
        this(str, str2, f132213e);
    }
}
