package G3;

import kb.C9925E;
import kb.C9967v;
import q3.K;
import t3.N;
import t3.q;

public final class k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f35937d = new k0(new K[0]);

    /* renamed from: e  reason: collision with root package name */
    private static final String f35938e = N.A0(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f35939a;

    /* renamed from: b  reason: collision with root package name */
    private final C9967v<K> f35940b;

    /* renamed from: c  reason: collision with root package name */
    private int f35941c;

    public k0(K... kArr) {
        this.f35940b = C9967v.B(kArr);
        this.f35939a = kArr.length;
        f();
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f35940b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f35940b.size(); i12++) {
                if (this.f35940b.get(i10).equals(this.f35940b.get(i12))) {
                    q.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public K b(int i10) {
        return this.f35940b.get(i10);
    }

    public C9967v<Integer> c() {
        return C9967v.A(C9925E.h(this.f35940b, new j0()));
    }

    public int d(K k10) {
        int indexOf = this.f35940b.indexOf(k10);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f35939a == k0Var.f35939a && this.f35940b.equals(k0Var.f35940b);
    }

    public int hashCode() {
        if (this.f35941c == 0) {
            this.f35941c = this.f35940b.hashCode();
        }
        return this.f35941c;
    }
}
