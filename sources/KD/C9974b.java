package kd;

/* renamed from: kd.b  reason: case insensitive filesystem */
public final class C9974b extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f75059a = 1;

    public final String getMessage() {
        String str = this.f75059a != 1 ? "Unknown error" : "Package not available";
        StringBuilder sb2 = new StringBuilder(str.length() + 17);
        sb2.append("LoaderException{");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
