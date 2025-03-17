package androidx.coordinatorlayout.widget;

import H2.f;
import H2.g;
import j0.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<ArrayList<T>> f20938a = new g(10);

    /* renamed from: b  reason: collision with root package name */
    private final b0<T, ArrayList<T>> f20939b = new b0<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f20940c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f20941d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t10)) {
            if (!hashSet.contains(t10)) {
                hashSet.add(t10);
                ArrayList arrayList2 = this.f20939b.get(t10);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(t10);
                arrayList.add(t10);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b10 = this.f20938a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f20938a.a(arrayList);
    }

    public void a(T t10, T t11) {
        if (!this.f20939b.containsKey(t10) || !this.f20939b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f20939b.get(t10);
        if (arrayList == null) {
            arrayList = f();
            this.f20939b.put(t10, arrayList);
        }
        arrayList.add(t11);
    }

    public void b(T t10) {
        if (!this.f20939b.containsKey(t10)) {
            this.f20939b.put(t10, null);
        }
    }

    public void c() {
        int size = this.f20939b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f20939b.m(i10);
            if (m10 != null) {
                k(m10);
            }
        }
        this.f20939b.clear();
    }

    public boolean d(T t10) {
        return this.f20939b.containsKey(t10);
    }

    public List g(T t10) {
        return this.f20939b.get(t10);
    }

    public List<T> h(T t10) {
        int size = this.f20939b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f20939b.m(i10);
            if (m10 != null && m10.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f20939b.h(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f20940c.clear();
        this.f20941d.clear();
        int size = this.f20939b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f20939b.h(i10), this.f20940c, this.f20941d);
        }
        return this.f20940c;
    }

    public boolean j(T t10) {
        int size = this.f20939b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f20939b.m(i10);
            if (m10 != null && m10.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
