package a0;

import android.util.Range;

public interface k0 extends Y {
    boolean a();

    Range<Integer> b(int i10);

    int c();

    boolean d(int i10, int i11);

    boolean e(int i10, int i11) {
        return d(i10, i11) || (a() && d(i11, i10));
    }

    int f();

    Range<Integer> g();

    Range<Integer> h(int i10);

    Range<Integer> i();

    Range<Integer> j();
}
