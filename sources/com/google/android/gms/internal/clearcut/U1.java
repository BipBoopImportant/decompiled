package com.google.android.gms.internal.clearcut;

public final class U1 implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final V1 f48262e = new V1();

    /* renamed from: a  reason: collision with root package name */
    private boolean f48263a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f48264b;

    /* renamed from: c  reason: collision with root package name */
    private V1[] f48265c;

    /* renamed from: d  reason: collision with root package name */
    private int f48266d;

    U1() {
        this(10);
    }

    public final boolean a() {
        return this.f48266d == 0;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f48266d;
    }

    /* access modifiers changed from: package-private */
    public final V1 c(int i10) {
        return this.f48265c[i10];
    }

    public final /* synthetic */ Object clone() {
        int i10 = this.f48266d;
        U1 u12 = new U1(i10);
        System.arraycopy(this.f48264b, 0, u12.f48264b, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            V1 v12 = this.f48265c[i11];
            if (v12 != null) {
                u12.f48265c[i11] = (V1) v12.clone();
            }
        }
        u12.f48266d = i10;
        return u12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return false;
        }
        U1 u12 = (U1) obj;
        int i10 = this.f48266d;
        if (i10 != u12.f48266d) {
            return false;
        }
        int[] iArr = this.f48264b;
        int[] iArr2 = u12.f48264b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                V1[] v1Arr = this.f48265c;
                V1[] v1Arr2 = u12.f48265c;
                int i12 = this.f48266d;
                int i13 = 0;
                while (i13 < i12) {
                    if (v1Arr[i13].equals(v1Arr2[i13])) {
                        i13++;
                    }
                }
                return true;
            } else if (iArr[i11] != iArr2[i11]) {
                break;
            } else {
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17;
        for (int i11 = 0; i11 < this.f48266d; i11++) {
            i10 = (((i10 * 31) + this.f48264b[i11]) * 31) + this.f48265c[i11].hashCode();
        }
        return i10;
    }

    private U1(int i10) {
        this.f48263a = false;
        int i11 = i10 << 2;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f48264b = new int[i14];
        this.f48265c = new V1[i14];
        this.f48266d = 0;
    }
}
