package nts;

/* renamed from: nts.Ҫ  reason: contains not printable characters */
public class C3609 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f490;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f491;

    public C3609() {
        this("", "");
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof String)) {
            return super.equals(obj);
        }
        String str = (String) obj;
        if (str.indexOf(":") <= 0) {
            return str.equals(this.f490);
        }
        return (this.f491 + ":" + str).equals(this.f491 + ":" + this.f490);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C3727.m1052("_KIJP\u001b\u000f\r\u000e\u0014", 0, 5, 34));
        if (!this.f491.equals(C3727.m1052("_KIJP\u001b\u000f\r\u000e\u0014", 5, 5, 99))) {
            stringBuffer.append(":" + this.f491);
        }
        stringBuffer.append("=\"" + this.f490 + "\"");
        return stringBuffer.toString();
    }

    public C3609(String str, String str2) {
        this.f490 = str;
        this.f491 = str2;
    }
}
