package nd;

import od.C10104a;

/* renamed from: nd.e  reason: case insensitive filesystem */
final class C10086e extends C10088g {

    /* renamed from: c  reason: collision with root package name */
    private final short f75541c;

    /* renamed from: d  reason: collision with root package name */
    private final short f75542d;

    C10086e(C10088g gVar, int i10, int i11) {
        super(gVar);
        this.f75541c = (short) i10;
        this.f75542d = (short) i11;
    }

    /* access modifiers changed from: package-private */
    public void c(C10104a aVar, byte[] bArr) {
        aVar.c(this.f75541c, this.f75542d);
    }

    public String toString() {
        short s10 = this.f75541c;
        short s11 = this.f75542d;
        short s12 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return '<' + Integer.toBinaryString(s12 | (1 << this.f75542d)).substring(1) + '>';
    }
}
