package od;

import java.util.Arrays;

/* renamed from: od.a  reason: case insensitive filesystem */
public final class C10104a implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f75678c = new int[0];

    /* renamed from: a  reason: collision with root package name */
    private int[] f75679a;

    /* renamed from: b  reason: collision with root package name */
    private int f75680b;

    public C10104a() {
        this.f75680b = 0;
        this.f75679a = f75678c;
    }

    private void e(int i10) {
        if (i10 > this.f75679a.length * 32) {
            int[] l10 = l((int) Math.ceil((double) (((float) i10) / 0.75f)));
            int[] iArr = this.f75679a;
            System.arraycopy(iArr, 0, l10, 0, iArr.length);
            this.f75679a = l10;
        }
    }

    private static int[] l(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void a(boolean z10) {
        e(this.f75680b + 1);
        if (z10) {
            int[] iArr = this.f75679a;
            int i10 = this.f75680b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f75680b++;
    }

    public void b(C10104a aVar) {
        int i10 = aVar.f75680b;
        e(this.f75680b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.f(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f75680b;
        e(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f75679a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f75680b = i12;
    }

    /* renamed from: d */
    public C10104a clone() {
        return new C10104a((int[]) this.f75679a.clone(), this.f75680b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10104a)) {
            return false;
        }
        C10104a aVar = (C10104a) obj;
        return this.f75680b == aVar.f75680b && Arrays.equals(this.f75679a, aVar.f75679a);
    }

    public boolean f(int i10) {
        return ((1 << (i10 & 31)) & this.f75679a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f75680b * 31) + Arrays.hashCode(this.f75679a);
    }

    public int j() {
        return this.f75680b;
    }

    public int k() {
        return (this.f75680b + 7) / 8;
    }

    public void m(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (f(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void n(C10104a aVar) {
        if (this.f75680b == aVar.f75680b) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f75679a;
                if (i10 < iArr.length) {
                    iArr[i10] = iArr[i10] ^ aVar.f75679a[i10];
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        int i10 = this.f75680b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f75680b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(f(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    C10104a(int[] iArr, int i10) {
        this.f75679a = iArr;
        this.f75680b = i10;
    }
}
