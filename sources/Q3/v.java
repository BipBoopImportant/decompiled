package q3;

import t3.N;

public class v {

    /* renamed from: c  reason: collision with root package name */
    private static final String f28307c = N.A0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f28308d = N.A0(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f28309a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28310b;

    public v(String str, String str2) {
        this.f28309a = N.S0(str);
        this.f28310b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return N.d(this.f28309a, vVar.f28309a) && N.d(this.f28310b, vVar.f28310b);
    }

    public int hashCode() {
        int hashCode = this.f28310b.hashCode() * 31;
        String str = this.f28309a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
