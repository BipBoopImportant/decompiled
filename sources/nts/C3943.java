package nts;

import java.util.Vector;

/* renamed from: nts.ᙚ  reason: contains not printable characters */
public class C3943 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3948 f2251 = new C3948();

    /* renamed from: ગ  reason: contains not printable characters */
    public Vector f2252 = new Vector();

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f2253;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3948 f2254 = new C3948();

    /* renamed from: ⶊ  reason: contains not printable characters */
    public C3948 f2255 = new C3948();

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C3948 f2256 = new C3948();

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m2109(int i10, String str) {
        if (this.f2254.f2269.length() > 0) {
            Vector vector = new Vector();
            for (int i11 = 0; i11 < this.f2252.size(); i11++) {
                if (i10 == ((C3751) this.f2252.get(i11)).f1143) {
                    vector.add(Integer.valueOf(i11));
                }
            }
            if (vector.size() > 1 && !C3823.m1590(str)) {
                for (int size = vector.size() - 1; size >= 0 && vector.size() > 1; size--) {
                    C3948 r32 = ((C3751) this.f2252.get(((Integer) vector.get(size)).intValue())).f1140;
                    String str2 = str == null ? "" : str;
                    String stringBuffer = r32.f2269.toString();
                    String str3 = C3823.f1540;
                    if (!stringBuffer.equalsIgnoreCase(str2)) {
                        vector.removeElementAt(size);
                    }
                }
            }
            if (vector.size() > 0) {
                C3751 r72 = (C3751) this.f2252.get(((Integer) vector.get(0)).intValue());
                this.f2251.m2167(r72.f1145.f1673.m1923(), r72.f1145.f1673.f1728);
                this.f2255.m2161(r72.f1140);
                this.f2256.m2143();
                for (int i12 = 0; i12 < r72.f1141; i12++) {
                    if (i12 != 0) {
                        this.f2256.m2158("/");
                    }
                    this.f2256.m2158(r72.f1144.m612(i12));
                }
                return true;
            }
        }
        return false;
    }
}
