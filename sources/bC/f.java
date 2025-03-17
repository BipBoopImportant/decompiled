package Bc;

import android.util.SparseIntArray;

public class f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f58892a;

        /* renamed from: b  reason: collision with root package name */
        int f58893b;

        /* renamed from: c  reason: collision with root package name */
        int f58894c;

        public a(int i10, int i11, int i12) {
            this.f58892a = i10;
            this.f58893b = i11;
            this.f58894c = i12;
        }

        public a a(a aVar) {
            return new a(this.f58892a - aVar.d(), this.f58893b - aVar.c(), this.f58894c - aVar.b());
        }

        public int b() {
            return this.f58894c;
        }

        public int c() {
            return this.f58893b;
        }

        public int d() {
            return this.f58892a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i11 = 0;
            i10 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            i10 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i10 += valueAt;
                }
                if (keyAt > 16) {
                    i11 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i11, i10);
    }
}
