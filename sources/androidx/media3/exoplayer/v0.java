package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import q3.C5807s;

public interface v0 {

    public interface a {
        void a(u0 u0Var);
    }

    @SuppressLint({"WrongConstant"})
    static int B(int i10) {
        return i10 & 3584;
    }

    @SuppressLint({"WrongConstant"})
    static int G(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    @SuppressLint({"WrongConstant"})
    static int I(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int S(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int o(int i10) {
        return i10 & 384;
    }

    static boolean p(int i10, boolean z10) {
        int S10 = S(i10);
        return S10 == 4 || (z10 && S10 == 3);
    }

    static int r(int i10, int i11, int i12, int i13, int i14) {
        return G(i10, i11, i12, i13, i14, 0);
    }

    static int s(int i10, int i11, int i12, int i13) {
        return G(i10, i11, i12, 0, 128, i13);
    }

    @SuppressLint({"WrongConstant"})
    static int t(int i10) {
        return i10 & 32;
    }

    @SuppressLint({"WrongConstant"})
    static int u(int i10) {
        return i10 & 24;
    }

    static int v(int i10) {
        return s(i10, 0, 0, 0);
    }

    void K(a aVar) {
    }

    int O();

    int b(C5807s sVar);

    String getName();

    int i();

    void l() {
    }
}
