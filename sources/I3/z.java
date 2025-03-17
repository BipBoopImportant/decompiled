package I3;

import G3.C6479C;
import G3.k0;
import android.util.Pair;
import androidx.media3.exoplayer.v0;
import java.util.Arrays;
import q3.J;
import q3.K;
import t3.N;
import z3.H;

public abstract class z extends C {

    /* renamed from: c  reason: collision with root package name */
    private a f36845c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f36846a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f36847b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f36848c;

        /* renamed from: d  reason: collision with root package name */
        private final k0[] f36849d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f36850e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f36851f;

        /* renamed from: g  reason: collision with root package name */
        private final k0 f36852g;

        a(String[] strArr, int[] iArr, k0[] k0VarArr, int[] iArr2, int[][][] iArr3, k0 k0Var) {
            this.f36847b = strArr;
            this.f36848c = iArr;
            this.f36849d = k0VarArr;
            this.f36851f = iArr3;
            this.f36850e = iArr2;
            this.f36852g = k0Var;
            this.f36846a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f36849d[i10].b(i11).f27943a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f36849d[i10].b(i11).a(iArr[i12]).f28244o;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !N.d(str, str2);
                }
                i13 = Math.min(i13, v0.u(this.f36851f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f36850e[i10]) : i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f36851f[i10][i11][i12];
        }

        public int d() {
            return this.f36846a;
        }

        public int e(int i10) {
            return this.f36848c[i10];
        }

        public k0 f(int i10) {
            return this.f36849d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return v0.S(c(i10, i11, i12));
        }

        public k0 h() {
            return this.f36852g;
        }
    }

    private static int n(v0[] v0VarArr, K k10, int[] iArr, boolean z10) {
        int length = v0VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < v0VarArr.length; i11++) {
            v0 v0Var = v0VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < k10.f27943a; i13++) {
                i12 = Math.max(i12, v0.S(v0Var.b(k10.a(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] o(v0 v0Var, K k10) {
        int[] iArr = new int[k10.f27943a];
        for (int i10 = 0; i10 < k10.f27943a; i10++) {
            iArr[i10] = v0Var.b(k10.a(i10));
        }
        return iArr;
    }

    private static int[] p(v0[] v0VarArr) {
        int length = v0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = v0VarArr[i10].O();
        }
        return iArr;
    }

    public final void i(Object obj) {
        this.f36845c = (a) obj;
    }

    public final D k(v0[] v0VarArr, k0 k0Var, C6479C.b bVar, J j10) {
        v0[] v0VarArr2 = v0VarArr;
        k0 k0Var2 = k0Var;
        int[] iArr = new int[(v0VarArr2.length + 1)];
        int length = v0VarArr2.length + 1;
        K[][] kArr = new K[length][];
        int[][][] iArr2 = new int[(v0VarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = k0Var2.f35939a;
            kArr[i10] = new K[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] p10 = p(v0VarArr);
        for (int i12 = 0; i12 < k0Var2.f35939a; i12++) {
            K b10 = k0Var2.b(i12);
            int n10 = n(v0VarArr, b10, iArr, b10.f27945c == 5);
            int[] o10 = n10 == v0VarArr2.length ? new int[b10.f27943a] : o(v0VarArr2[n10], b10);
            int i13 = iArr[n10];
            kArr[n10][i13] = b10;
            iArr2[n10][i13] = o10;
            iArr[n10] = i13 + 1;
        }
        k0[] k0VarArr = new k0[v0VarArr2.length];
        String[] strArr = new String[v0VarArr2.length];
        int[] iArr3 = new int[v0VarArr2.length];
        for (int i14 = 0; i14 < v0VarArr2.length; i14++) {
            int i15 = iArr[i14];
            k0VarArr[i14] = new k0((K[]) N.U0(kArr[i14], i15));
            iArr2[i14] = (int[][]) N.U0(iArr2[i14], i15);
            strArr[i14] = v0VarArr2[i14].getName();
            iArr3[i14] = v0VarArr2[i14].i();
        }
        a aVar = new a(strArr, iArr3, k0VarArr, p10, iArr2, new k0((K[]) N.U0(kArr[v0VarArr2.length], iArr[v0VarArr2.length])));
        Pair<H[], x[]> q10 = q(aVar, iArr2, p10, bVar, j10);
        return new D((H[]) q10.first, (x[]) q10.second, B.a(aVar, (C6552A[]) q10.second), aVar);
    }

    /* access modifiers changed from: protected */
    public abstract Pair<H[], x[]> q(a aVar, int[][][] iArr, int[] iArr2, C6479C.b bVar, J j10);
}
