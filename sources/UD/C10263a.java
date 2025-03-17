package ud;

import java.lang.reflect.Array;

/* renamed from: ud.a  reason: case insensitive filesystem */
public final class C10263a {

    /* renamed from: a  reason: collision with root package name */
    private final C10264b[] f76985a;

    /* renamed from: b  reason: collision with root package name */
    private int f76986b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76987c;

    /* renamed from: d  reason: collision with root package name */
    private final int f76988d;

    C10263a(int i10, int i11) {
        C10264b[] bVarArr = new C10264b[i10];
        this.f76985a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f76985a[i12] = new C10264b(((i11 + 4) * 17) + 1);
        }
        this.f76988d = i11 * 17;
        this.f76987c = i10;
        this.f76986b = -1;
    }

    /* access modifiers changed from: package-private */
    public C10264b a() {
        return this.f76985a[this.f76986b];
    }

    public byte[][] b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = this.f76988d * i10;
        iArr[0] = this.f76987c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i12 = this.f76987c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f76985a[i13 / i11].b(i10);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f76986b++;
    }
}
