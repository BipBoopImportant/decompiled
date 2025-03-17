package ud;

/* renamed from: ud.b  reason: case insensitive filesystem */
final class C10264b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f76989a;

    /* renamed from: b  reason: collision with root package name */
    private int f76990b = 0;

    C10264b(int i10) {
        this.f76989a = new byte[i10];
    }

    private void c(int i10, boolean z10) {
        this.f76989a[i10] = z10 ? (byte) 1 : 0;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f76990b;
            this.f76990b = i12 + 1;
            c(i12, z10);
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] b(int i10) {
        int length = this.f76989a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f76989a[i11 / i10];
        }
        return bArr;
    }
}
