package nts;

import java.net.UnknownHostException;

/* renamed from: nts.Ԕ  reason: contains not printable characters */
public class C3625 extends RuntimeException {

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f605;

    public C3625(Throwable th2, int i10, String str) {
        super(str, th2);
        this.f605 = i10;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static String m589(Throwable th2) {
        if (th2 instanceof C3625) {
            return ((C3625) th2).getMessage();
        }
        return C3727.m1052("_ecgaxbEmptD~daunrww>2<~U\\ZLE\u000bOWVHT\u001b\u0000", 23, 14, 52) + m592(th2);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static int m590(Throwable th2) {
        if (th2 instanceof C3625) {
            return ((C3625) th2).f605;
        }
        return 700;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m591(Throwable th2) {
        if (th2 instanceof C3625) {
            return ((C3625) th2).f605;
        }
        return 700;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static String m592(Throwable th2) {
        if (!(th2 instanceof UnknownHostException)) {
            return th2.getMessage();
        }
        return C3727.m1052("_ecgaxbEmptD~daunrww>2<~U\\ZLE\u000bOWVHT\u001b\u0000", 0, 23, 29) + th2.getMessage();
    }

    public C3625(int i10, String str) {
        this((Throwable) null, i10, str);
    }

    public C3625(String str) {
        this(0, str);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m593() {
        return this.f605;
    }

    public C3625(Throwable th2, String str) {
        this(th2, m591(th2), str);
    }
}
