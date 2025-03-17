package nts;

/* renamed from: nts.ບ  reason: contains not printable characters */
public class C3759 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3559 f1184 = new C3559();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1185 = new C3753();

    /* renamed from: ഗ  reason: contains not printable characters */
    public C3559 f1186 = new C3559();

    /* renamed from: ภ  reason: contains not printable characters */
    public C3559 f1187 = new C3559();

    /* renamed from: ᐽ  reason: contains not printable characters */
    public C3854 f1188 = new C3854();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3559 f1189 = new C3559();

    /* renamed from: ᚪ  reason: contains not printable characters */
    public boolean f1190 = false;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3559 f1191 = new C3559();

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C3559 f1192 = new C3559();

    /* renamed from: ṧ  reason: contains not printable characters */
    public C3559 f1193 = new C3559();

    /* renamed from: ⱑ  reason: contains not printable characters */
    public C3559 f1194 = new C3559();

    public C3759() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1204(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1185;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1184.m154(r02);
        this.f1189.m154(r02);
        this.f1191.m154(r02);
        this.f1192.m154(r02);
        this.f1186.m154(r02);
        this.f1194.m154(r02);
        this.f1193.m154(r02);
        this.f1187.m154(r02);
        C3854 r13 = this.f1188;
        if (r13.f3537) {
            r13.f3542 = 160;
            r13.m1790(r02);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1205(byte[] bArr, int i10) {
        int r52 = this.f1185.m3270(bArr, i10);
        if (!this.f1185.f3546) {
            return r52;
        }
        int r53 = this.f1184.m3270(bArr, r52);
        if (!this.f1184.f3546) {
            return r53;
        }
        int r54 = this.f1189.m3270(bArr, r53);
        if (!this.f1189.f3546) {
            return r54;
        }
        int r55 = this.f1191.m3270(bArr, r54);
        if (!this.f1191.f3546) {
            return r55;
        }
        int r56 = this.f1192.m3270(bArr, r55);
        if (!this.f1192.f3546) {
            return r56;
        }
        int r57 = this.f1186.m3270(bArr, r56);
        if (!this.f1186.f3546) {
            return r57;
        }
        int r58 = this.f1194.m3270(bArr, r57);
        if (!this.f1194.f3546) {
            return r58;
        }
        int r59 = this.f1193.m3270(bArr, r58);
        if (!this.f1193.f3546) {
            return r59;
        }
        int r510 = this.f1187.m3270(bArr, r59);
        if (!this.f1187.f3546) {
            return r510;
        }
        if (!this.f1190) {
            if (r510 >= bArr.length) {
                return m3274(bArr, r510);
            }
            if ((bArr[r510] & 255) == 48) {
                this.f1188.f3537 = true;
            }
            this.f1190 = true;
        }
        C3854 r02 = this.f1188;
        if (r02.f3537) {
            r510 = r02.m3270(bArr, r510);
        }
        return m3274(bArr, r510);
    }
}
