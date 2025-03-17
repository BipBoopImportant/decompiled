package a9;

import D8.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final int f42212a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42214c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42215d;

    /* renamed from: e  reason: collision with root package name */
    public final float f42216e;

    /* renamed from: f  reason: collision with root package name */
    public String f42217f;

    /* renamed from: g  reason: collision with root package name */
    public String f42218g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42219h;

    /* renamed from: i  reason: collision with root package name */
    public float f42220i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f42221j;

    /* renamed from: k  reason: collision with root package name */
    public final c f42222k;

    public Q(int i10, int i11, int i12, int i13, float f10, String str, String str2, boolean z10, float f11, int i14) {
        i10 = (i14 & 1) != 0 ? 0 : i10;
        i11 = (i14 & 2) != 0 ? 0 : i11;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        f10 = (i14 & 16) != 0 ? 0.0f : f10;
        str = (i14 & 32) != 0 ? null : str;
        str2 = (i14 & 64) != 0 ? null : str2;
        z10 = (i14 & 128) != 0 ? false : z10;
        f11 = (i14 & 256) != 0 ? 0.0f : f11;
        this.f42212a = i10;
        this.f42213b = i11;
        this.f42214c = i12;
        this.f42215d = i13;
        this.f42216e = f10;
        this.f42217f = str;
        this.f42218g = str2;
        this.f42219h = z10;
        this.f42220i = f11;
        this.f42221j = null;
        this.f42222k = new c("JsonStyleView");
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", this.f42213b);
            jSONObject.put("width", this.f42212a);
            jSONObject.put("x", this.f42214c);
            jSONObject.put("y", this.f42215d);
            jSONObject.put("z", (double) this.f42216e);
            jSONObject.putOpt("bmp", this.f42217f);
            String str = this.f42218g;
            if (str != null) {
                jSONObject.put("bg", str);
                jSONObject.put("alpha", (double) this.f42220i);
            }
            jSONObject.put("visibility", this.f42219h);
            Boolean bool = this.f42221j;
            if (bool == null) {
                return jSONObject;
            }
            jSONObject.put("interactionEnabled", bool);
            return jSONObject;
        } catch (JSONException e10) {
            c cVar = this.f42222k;
            H1.a(cVar, "Failed to build style object " + e10.getMessage(), e10);
            return new JSONObject();
        }
    }
}
