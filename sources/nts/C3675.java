package nts;

/* renamed from: nts.ࢧ  reason: contains not printable characters */
public class C3675 extends Exception {

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f805;

    public C3675(C3625 r32) {
        super(r32.getMessage(), m796(r32));
        this.f805 = r32.m593();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static Throwable m796(Throwable th2) {
        while (th2 != null && (th2 instanceof C3625)) {
            th2 = th2.getCause();
        }
        return th2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m797() {
        return this.f805;
    }
}
