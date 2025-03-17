package B6;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f33238a;

    /* renamed from: b  reason: collision with root package name */
    public final float f33239b;

    /* renamed from: c  reason: collision with root package name */
    public final float f33240c;

    public h(String str, float f10, float f11) {
        this.f33238a = str;
        this.f33240c = f11;
        this.f33239b = f10;
    }

    public boolean a(String str) {
        if (this.f33238a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f33238a.endsWith("\r")) {
            String str2 = this.f33238a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
