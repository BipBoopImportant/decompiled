package D6;

import I6.b;
import I6.i;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f34474a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f34475b;

    public d(float[] fArr, int[] iArr) {
        this.f34474a = fArr;
        this.f34475b = iArr;
    }

    private int b(float f10) {
        int binarySearch = Arrays.binarySearch(this.f34474a, f10);
        if (binarySearch >= 0) {
            return this.f34475b[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        if (i10 == 0) {
            return this.f34475b[0];
        }
        int[] iArr = this.f34475b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f34474a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return b.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public d a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = b(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public int[] c() {
        return this.f34475b;
    }

    public float[] d() {
        return this.f34474a;
    }

    public int e() {
        return this.f34475b.length;
    }

    public void f(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.f34475b.length == dVar2.f34475b.length) {
            int i10 = 0;
            while (true) {
                iArr = dVar.f34475b;
                if (i10 >= iArr.length) {
                    break;
                }
                this.f34474a[i10] = i.i(dVar.f34474a[i10], dVar2.f34474a[i10], f10);
                this.f34475b[i10] = b.c(f10, dVar.f34475b[i10], dVar2.f34475b[i10]);
                i10++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f34474a;
                if (length < fArr.length) {
                    int[] iArr2 = dVar.f34475b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.f34475b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f34475b.length + " vs " + dVar2.f34475b.length + ")");
        }
    }
}
