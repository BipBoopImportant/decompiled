package nts;

/* renamed from: nts.ᓯ  reason: contains not printable characters */
public class C3896 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3801 f1798 = new C3801();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3774 f1799 = new C3774();

    /* renamed from: ഗ  reason: contains not printable characters */
    public C3718 f1800;

    /* renamed from: ภ  reason: contains not printable characters */
    public C4069 f1801;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4053 f1802 = new C4053();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3559 f1803 = new C3559();

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C3788 f1804 = new C3788();

    /* renamed from: ṧ  reason: contains not printable characters */
    public C3627 f1805;

    /* renamed from: ⱑ  reason: contains not printable characters */
    public C3559 f1806;

    public C3896() {
        this.f3542 = 48;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1987(byte[] bArr, int i10) {
        int r42 = this.f1804.m3270(bArr, this.f1803.m3270(bArr, this.f1802.m3270(bArr, this.f1798.m3270(bArr, this.f1799.m3270(bArr, i10)))));
        if (m3272(bArr, r42) && m3280(bArr, r42) == 48) {
            C3718 r02 = new C3718();
            this.f1800 = r02;
            r42 = r02.m3270(bArr, r42);
        }
        if (m3272(bArr, r42) && m3280(bArr, r42) == 1) {
            byte b10 = bArr[r42 + 2];
            r42 += 3;
        }
        if (m3272(bArr, r42) && m3280(bArr, r42) == 2) {
            C3559 r03 = new C3559();
            this.f1806 = r03;
            r42 = r03.m3270(bArr, r42);
        }
        if (m3272(bArr, r42) && m3280(bArr, r42) == 160) {
            C3627 r04 = new C3627();
            this.f1805 = r04;
            r42 = r04.m3270(bArr, r42);
        }
        if (m3272(bArr, r42) && m3280(bArr, r42) == 161) {
            C4069 r05 = new C4069();
            this.f1801 = r05;
            r42 = r05.m3270(bArr, r42);
        }
        return m3274(bArr, r42);
    }
}
