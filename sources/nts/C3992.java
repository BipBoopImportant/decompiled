package nts;

import java.util.Vector;

/* renamed from: nts.ᤂ  reason: contains not printable characters */
public class C3992 extends C4138 {

    /* renamed from: Е  reason: contains not printable characters */
    public Vector f2634 = new Vector();

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f2635 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f2636 = null;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public C3892 f2637;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f2638 = 0;

    public C3992(C3892 r22) {
        this.f2637 = r22;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m2442() {
        C3844 r02 = new C3844();
        int i10 = this.f2638;
        if (i10 > 0) {
            r02.m1745((byte) i10);
            this.f3715 |= 8;
        }
        r02.m1759(this.f2635);
        r02.m1752(this.f2636);
        int i11 = this.f2638;
        if (i11 > 0) {
            r02.m1752(new byte[i11]);
        }
        this.f3713 = 5;
        this.f3716 = r02.m1755();
        return super.m3419();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2441(byte[] bArr) {
        super.m3418(bArr);
        C3844 r42 = new C3844(this.f3716);
        int i10 = this.f3714;
        if ((this.f3715 & 8) == 8) {
            byte r12 = r42.m1761() & 255;
            this.f2638 = r12;
            i10 = (i10 - 1) - r12;
        }
        this.f2635 = r42.m1733();
        byte[] r43 = r42.m1732(i10 - 4);
        this.f2636 = r43;
        this.f2634 = C4155.m3466(r43, 0, r43.length - this.f2638, this.f2637);
    }
}
