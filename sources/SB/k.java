package Sb;

import Nb.g;
import Tb.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f63309a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final int f63310b;

    public k(int i10) {
        this.f63310b = i10;
    }

    public List<F.e.d.C1109e> a() {
        List<j> b10 = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10.size(); i10++) {
            arrayList.add(b10.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f63309a));
    }

    public synchronized boolean c(List<j> list) {
        this.f63309a.clear();
        if (list.size() > this.f63310b) {
            g f10 = g.f();
            f10.k("Ignored " + 0 + " entries when adding rollout assignments. Maximum allowable: " + this.f63310b);
            return this.f63309a.addAll(list.subList(0, this.f63310b));
        }
        return this.f63309a.addAll(list);
    }
}
