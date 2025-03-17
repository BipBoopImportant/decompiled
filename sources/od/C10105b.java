package od;

import java.util.Arrays;

/* renamed from: od.b  reason: case insensitive filesystem */
public final class C10105b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int f75681a;

    /* renamed from: b  reason: collision with root package name */
    private int f75682b;

    /* renamed from: c  reason: collision with root package name */
    private int f75683c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f75684d;

    public C10105b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f75682b * (this.f75681a + 1));
        for (int i10 = 0; i10 < this.f75682b; i10++) {
            for (int i11 = 0; i11 < this.f75681a; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.f75684d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f75684d[i10] = 0;
        }
    }

    /* renamed from: c */
    public C10105b clone() {
        return new C10105b(this.f75681a, this.f75682b, this.f75683c, (int[]) this.f75684d.clone());
    }

    public boolean d(int i10, int i11) {
        return ((this.f75684d[(i11 * this.f75683c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int e() {
        return this.f75682b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10105b)) {
            return false;
        }
        C10105b bVar = (C10105b) obj;
        return this.f75681a == bVar.f75681a && this.f75682b == bVar.f75682b && this.f75683c == bVar.f75683c && Arrays.equals(this.f75684d, bVar.f75684d);
    }

    public int f() {
        return this.f75681a;
    }

    public int hashCode() {
        int i10 = this.f75681a;
        return (((((((i10 * 31) + i10) * 31) + this.f75682b) * 31) + this.f75683c) * 31) + Arrays.hashCode(this.f75684d);
    }

    public void j(int i10, int i11) {
        int i12 = (i11 * this.f75683c) + (i10 / 32);
        int[] iArr = this.f75684d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void k(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f75682b || i14 > this.f75681a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f75683c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f75684d;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public String l(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return l("X ", "  ");
    }

    public C10105b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f75681a = i10;
        this.f75682b = i11;
        int i12 = (i10 + 31) / 32;
        this.f75683c = i12;
        this.f75684d = new int[(i12 * i11)];
    }

    private C10105b(int i10, int i11, int i12, int[] iArr) {
        this.f75681a = i10;
        this.f75682b = i11;
        this.f75683c = i12;
        this.f75684d = iArr;
    }
}
