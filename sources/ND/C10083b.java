package nd;

import od.C10104a;

/* renamed from: nd.b  reason: case insensitive filesystem */
final class C10083b extends C10088g {

    /* renamed from: c  reason: collision with root package name */
    private final int f75531c;

    /* renamed from: d  reason: collision with root package name */
    private final int f75532d;

    C10083b(C10088g gVar, int i10, int i11) {
        super(gVar);
        this.f75531c = i10;
        this.f75532d = i11;
    }

    public void c(C10104a aVar, byte[] bArr) {
        int i10 = this.f75532d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0 || (i11 == 31 && i10 <= 62)) {
                aVar.c(31, 5);
                if (i10 > 62) {
                    aVar.c(i10 - 31, 16);
                } else if (i11 == 0) {
                    aVar.c(Math.min(i10, 31), 5);
                } else {
                    aVar.c(i10 - 31, 5);
                }
            }
            aVar.c(bArr[this.f75531c + i11], 8);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f75531c);
        sb2.append("::");
        sb2.append((this.f75531c + this.f75532d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
