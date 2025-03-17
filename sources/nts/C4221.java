package nts;

/* renamed from: nts.ㄤ  reason: contains not printable characters */
public class C4221 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f4168;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public String f4169;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f4170;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String f4171;

    public C4221(String str, String str2, String str3, String str4) {
        this.f4168 = str;
        this.f4170 = str2;
        this.f4171 = str3;
        this.f4169 = str4;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(":") <= 0) {
                return str.equals(this.f4168);
            }
            return str.equals(this.f4171 + ":" + this.f4168);
        } else if (!(obj instanceof C4221)) {
            return super.equals(obj);
        } else {
            C4221 r42 = (C4221) obj;
            return this.f4170.equals(r42.f4170) && this.f4168.equals(r42.f4168);
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f4171.length() > 0) {
            stringBuffer.append(this.f4171 + ":");
        }
        char c10 = this.f4169.indexOf("\"") > 0 ? '\'' : '\"';
        stringBuffer.append(this.f4168 + "=" + c10 + this.f4169 + c10);
        return stringBuffer.toString();
    }

    public C4221() {
        this.f4168 = "";
        this.f4170 = "";
        this.f4171 = "";
        this.f4169 = "";
    }
}
