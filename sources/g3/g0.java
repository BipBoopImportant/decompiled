package G3;

import android.util.SparseArray;
import t3.C5950a;
import t3.C5957h;

final class g0<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f35922a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f35923b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final C5957h<V> f35924c;

    public g0(C5957h<V> hVar) {
        this.f35924c = hVar;
        this.f35922a = -1;
    }

    public void a(int i10, V v10) {
        boolean z10 = false;
        if (this.f35922a == -1) {
            C5950a.g(this.f35923b.size() == 0);
            this.f35922a = 0;
        }
        if (this.f35923b.size() > 0) {
            SparseArray<V> sparseArray = this.f35923b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            C5950a.a(z10);
            if (keyAt == i10) {
                C5957h<V> hVar = this.f35924c;
                SparseArray<V> sparseArray2 = this.f35923b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f35923b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f35923b.size(); i10++) {
            this.f35924c.accept(this.f35923b.valueAt(i10));
        }
        this.f35922a = -1;
        this.f35923b.clear();
    }

    public void c(int i10) {
        int size = this.f35923b.size() - 1;
        while (size >= 0 && i10 < this.f35923b.keyAt(size)) {
            this.f35924c.accept(this.f35923b.valueAt(size));
            this.f35923b.removeAt(size);
            size--;
        }
        this.f35922a = this.f35923b.size() > 0 ? Math.min(this.f35922a, this.f35923b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f35923b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f35923b.keyAt(i12)) {
                this.f35924c.accept(this.f35923b.valueAt(i11));
                this.f35923b.removeAt(i11);
                int i13 = this.f35922a;
                if (i13 > 0) {
                    this.f35922a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public V e(int i10) {
        if (this.f35922a == -1) {
            this.f35922a = 0;
        }
        while (true) {
            int i11 = this.f35922a;
            if (i11 > 0 && i10 < this.f35923b.keyAt(i11)) {
                this.f35922a--;
            }
        }
        while (this.f35922a < this.f35923b.size() - 1 && i10 >= this.f35923b.keyAt(this.f35922a + 1)) {
            this.f35922a++;
        }
        return this.f35923b.valueAt(this.f35922a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f35923b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f35923b.size() == 0;
    }
}
