package nts;

/* renamed from: nts.ظ  reason: contains not printable characters */
public class C3640 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3626 f627 = new C3626((C3626) null, (C3626) null, (C3626) null);

    public C3640() {
        m627();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m627() {
        for (int i10 = 0; i10 < C3958.f2345.size(); i10++) {
            byte[] bArr = (byte[]) C3958.f2345.get(i10);
            char charValue = ((Character) C3958.f2347.get(i10)).charValue();
            C3626 r42 = this.f627;
            for (byte b10 : bArr) {
                if (b10 != 1) {
                    if (r42.f607 == null) {
                        r42.f607 = new C3626(r42, (C3626) null, (C3626) null);
                    }
                    r42 = r42.f607;
                } else {
                    if (r42.f606 == null) {
                        r42.f606 = new C3626(r42, (C3626) null, (C3626) null);
                    }
                    r42 = r42.f606;
                }
            }
            r42.f608 = charValue;
        }
    }
}
