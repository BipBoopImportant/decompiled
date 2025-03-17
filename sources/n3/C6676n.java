package N3;

import t3.B;

/* renamed from: N3.n  reason: case insensitive filesystem */
public final class C6676n {

    /* renamed from: a  reason: collision with root package name */
    public final int f38917a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38918b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38919c;

    private C6676n(int i10, int i11, String str) {
        this.f38917a = i10;
        this.f38918b = i11;
        this.f38919c = str;
    }

    public static C6676n a(B b10) {
        String str;
        b10.X(2);
        int H10 = b10.H();
        int i10 = H10 >> 1;
        int H11 = ((b10.H() >> 3) & 31) | ((H10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (H11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(H11);
        return new C6676n(i10, H11, sb2.toString());
    }
}
