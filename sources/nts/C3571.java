package nts;

/* renamed from: nts.υ  reason: contains not printable characters */
public class C3571 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final /* synthetic */ int f156 = 0;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f157;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public String f158;

    /* renamed from: ખ  reason: contains not printable characters */
    public String f159;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public boolean f160;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public String f161;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f162;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String f163;

    public C3571() {
        this("", "", "", "", "", false, true);
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return this.f158.equals(obj);
        }
        if (!(obj instanceof C3571)) {
            return super.equals(obj);
        }
        C3571 r32 = (C3571) obj;
        return this.f158.equals(r32.f158) && this.f162.equals(r32.f162) && this.f159.equals(r32.f159);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.f158 + "=" + this.f161;
    }

    public C3571(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        this.f158 = str;
        this.f161 = str2;
        this.f163 = str3;
        this.f162 = str4;
        this.f159 = str5;
        this.f157 = z10;
        this.f160 = z11;
    }
}
