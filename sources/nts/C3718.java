package nts;

/* renamed from: nts.ఛ  reason: contains not printable characters */
public class C3718 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3774 f963;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3774 f964 = new C3774();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3774 f965;

    public C3718() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1011(C3796 r42) {
        C3796 r02 = new C3796();
        C3774 r12 = this.f964;
        r02.m1334(r12.f1252, r12.f3542);
        C3774 r13 = this.f963;
        if (r13 != null) {
            r13.f3542 = 128;
            r02.m1334(r13.f1252, 128);
        }
        C3774 r14 = this.f965;
        if (r14 != null) {
            r14.f3542 = 129;
            r02.m1334(r14.f1252, 129);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1012(byte[] bArr, int i10) {
        if (m3272(bArr, i10) && (bArr[i10] & 255) == 2) {
            i10 = this.f964.m3270(bArr, i10);
        }
        if (m3272(bArr, i10) && m3280(bArr, i10) == 128) {
            C3774 r02 = new C3774();
            this.f963 = r02;
            r02.f3542 = 128;
            i10 = r02.m3270(bArr, i10);
        }
        if (m3272(bArr, i10) && m3280(bArr, i10) == 129) {
            C3774 r03 = new C3774();
            this.f965 = r03;
            r03.f3542 = 129;
            i10 = r03.m3270(bArr, i10);
        }
        return m3274(bArr, i10);
    }
}
