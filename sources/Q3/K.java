package q3;

import java.util.Arrays;
import t3.C5950a;
import t3.N;
import t3.q;

public final class K {

    /* renamed from: f  reason: collision with root package name */
    private static final String f27941f = N.A0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f27942g = N.A0(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f27943a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27944b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27945c;

    /* renamed from: d  reason: collision with root package name */
    private final C5807s[] f27946d;

    /* renamed from: e  reason: collision with root package name */
    private int f27947e;

    public K(C5807s... sVarArr) {
        this("", sVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        q.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String d10 = d(this.f27946d[0].f28233d);
        int e10 = e(this.f27946d[0].f28235f);
        int i10 = 1;
        while (true) {
            C5807s[] sVarArr = this.f27946d;
            if (i10 >= sVarArr.length) {
                return;
            }
            if (!d10.equals(d(sVarArr[i10].f28233d))) {
                C5807s[] sVarArr2 = this.f27946d;
                c("languages", sVarArr2[0].f28233d, sVarArr2[i10].f28233d, i10);
                return;
            } else if (e10 != e(this.f27946d[i10].f28235f)) {
                c("role flags", Integer.toBinaryString(this.f27946d[0].f28235f), Integer.toBinaryString(this.f27946d[i10].f28235f), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public C5807s a(int i10) {
        return this.f27946d[i10];
    }

    public int b(C5807s sVar) {
        int i10 = 0;
        while (true) {
            C5807s[] sVarArr = this.f27946d;
            if (i10 >= sVarArr.length) {
                return -1;
            }
            if (sVar == sVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        return this.f27944b.equals(k10.f27944b) && Arrays.equals(this.f27946d, k10.f27946d);
    }

    public int hashCode() {
        if (this.f27947e == 0) {
            this.f27947e = ((527 + this.f27944b.hashCode()) * 31) + Arrays.hashCode(this.f27946d);
        }
        return this.f27947e;
    }

    public K(String str, C5807s... sVarArr) {
        C5950a.a(sVarArr.length > 0);
        this.f27944b = str;
        this.f27946d = sVarArr;
        this.f27943a = sVarArr.length;
        int k10 = A.k(sVarArr[0].f28244o);
        this.f27945c = k10 == -1 ? A.k(sVarArr[0].f28243n) : k10;
        f();
    }
}
