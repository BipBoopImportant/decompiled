package k4;

import N3.J;
import N3.O;
import N3.r;
import android.util.SparseArray;
import k4.s;

public final class t implements r {

    /* renamed from: a  reason: collision with root package name */
    private final r f54131a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f54132b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<v> f54133c = new SparseArray<>();

    public t(r rVar, s.a aVar) {
        this.f54131a = rVar;
        this.f54132b = aVar;
    }

    public void n(J j10) {
        this.f54131a.n(j10);
    }

    public void r() {
        this.f54131a.r();
    }

    public O t(int i10, int i11) {
        if (i11 != 3) {
            return this.f54131a.t(i10, i11);
        }
        v vVar = this.f54133c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f54131a.t(i10, i11), this.f54132b);
        this.f54133c.put(i10, vVar2);
        return vVar2;
    }
}
