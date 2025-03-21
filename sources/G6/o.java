package G6;

import D6.d;
import H6.c;
import I6.b;
import I6.i;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class o implements N<d> {

    /* renamed from: a  reason: collision with root package name */
    private int f36206a;

    public o(int i10) {
        this.f36206a = i10;
    }

    private d b(d dVar, List<Float> list) {
        int i10 = this.f36206a * 4;
        if (list.size() <= i10) {
            return dVar;
        }
        float[] d10 = dVar.d();
        int[] c10 = dVar.c();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] e10 = e(dVar.d(), fArr);
        int length = e10.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = e10[i12];
            int binarySearch = Arrays.binarySearch(d10, f10);
            int binarySearch2 = Arrays.binarySearch(fArr, f10);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i12] = c(f10, fArr2[binarySearch2], d10, c10);
            } else {
                iArr[i12] = d(f10, c10[binarySearch], fArr, fArr2);
            }
        }
        return new d(e10, iArr);
    }

    private int d(float f10, int i10, float[] fArr, float[] fArr2) {
        float i11;
        if (fArr2.length < 2 || f10 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        for (int i12 = 1; i12 < fArr.length; i12++) {
            float f11 = fArr[i12];
            int i13 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            if (i13 >= 0 || i12 == fArr.length - 1) {
                if (i13 <= 0) {
                    i11 = fArr2[i12];
                } else {
                    int i14 = i12 - 1;
                    float f12 = fArr[i14];
                    i11 = i.i(fArr2[i14], fArr2[i12], (f10 - f12) / (f11 - f12));
                }
                return Color.argb((int) (i11 * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = Float.NaN;
            float f11 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            if (i12 < fArr2.length) {
                f10 = fArr2[i12];
            }
            if (Float.isNaN(f10) || f11 < f10) {
                fArr3[i13] = f11;
                i11++;
            } else if (Float.isNaN(f11) || f10 < f11) {
                fArr3[i13] = f10;
                i12++;
            } else {
                fArr3[i13] = f11;
                i11++;
                i12++;
                i10++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }

    /* access modifiers changed from: package-private */
    public int c(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f10 == fArr[0]) {
            return iArr[0];
        }
        int i10 = 1;
        while (i10 < fArr.length) {
            float f12 = fArr[i10];
            if (f12 < f10 && i10 != fArr.length - 1) {
                i10++;
            } else if (i10 == fArr.length - 1 && f10 >= f12) {
                return Color.argb((int) (f11 * 255.0f), Color.red(iArr[i10]), Color.green(iArr[i10]), Color.blue(iArr[i10]));
            } else {
                int i11 = i10 - 1;
                float f13 = fArr[i11];
                float f14 = (f10 - f13) / (f12 - f13);
                int i12 = iArr[i10];
                int i13 = iArr[i11];
                return Color.argb((int) (f11 * 255.0f), b.c(f14, Color.red(i13), Color.red(i12)), b.c(f14, Color.green(i13), Color.green(i12)), b.c(f14, Color.blue(i13), Color.blue(i12)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* renamed from: f */
    public d a(c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = cVar.i() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.d();
        }
        while (cVar.hasNext()) {
            arrayList.add(Float.valueOf((float) cVar.d2()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f36206a = 2;
        }
        if (z10) {
            cVar.f();
        }
        if (this.f36206a == -1) {
            this.f36206a = arrayList.size() / 4;
        }
        int i10 = this.f36206a;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f36206a * 4; i13++) {
            int i14 = i13 / 4;
            double floatValue = (double) ((Float) arrayList.get(i13)).floatValue();
            int i15 = i13 % 4;
            if (i15 == 0) {
                if (i14 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i14 - 1] >= f11) {
                        fArr[i14] = f11 + 0.01f;
                    }
                }
                fArr[i14] = (float) floatValue;
            } else if (i15 == 1) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i15 == 2) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i15 == 3) {
                iArr[i14] = Color.argb(255, i11, i12, (int) (floatValue * 255.0d));
            }
        }
        return b(new d(fArr, iArr), arrayList);
    }
}
