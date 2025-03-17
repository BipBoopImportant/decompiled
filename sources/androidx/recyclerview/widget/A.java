package androidx.recyclerview.widget;

import H2.f;
import H2.g;
import androidx.recyclerview.widget.RecyclerView;
import j0.C5468y;
import j0.b0;

class A {

    /* renamed from: a  reason: collision with root package name */
    final b0<RecyclerView.G, a> f43622a = new b0<>();

    /* renamed from: b  reason: collision with root package name */
    final C5468y<RecyclerView.G> f43623b = new C5468y<>();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        static f<a> f43624d = new g(20);

        /* renamed from: a  reason: collision with root package name */
        int f43625a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.n.c f43626b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.n.c f43627c;

        private a() {
        }

        static void a() {
            do {
            } while (f43624d.b() != null);
        }

        static a b() {
            a b10 = f43624d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f43625a = 0;
            aVar.f43626b = null;
            aVar.f43627c = null;
            f43624d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void b(RecyclerView.G g10);

        void c(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);
    }

    A() {
    }

    private RecyclerView.n.c l(RecyclerView.G g10, int i10) {
        a m10;
        RecyclerView.n.c cVar;
        int d10 = this.f43622a.d(g10);
        if (d10 >= 0 && (m10 = this.f43622a.m(d10)) != null) {
            int i11 = m10.f43625a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                m10.f43625a = i12;
                if (i10 == 4) {
                    cVar = m10.f43626b;
                } else if (i10 == 8) {
                    cVar = m10.f43627c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f43622a.k(d10);
                    a.c(m10);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVar = this.f43622a.get(g10);
        if (aVar == null) {
            aVar = a.b();
            this.f43622a.put(g10, aVar);
        }
        aVar.f43625a |= 2;
        aVar.f43626b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.G g10) {
        a aVar = this.f43622a.get(g10);
        if (aVar == null) {
            aVar = a.b();
            this.f43622a.put(g10, aVar);
        }
        aVar.f43625a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.G g10) {
        this.f43623b.k(j10, g10);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVar = this.f43622a.get(g10);
        if (aVar == null) {
            aVar = a.b();
            this.f43622a.put(g10, aVar);
        }
        aVar.f43627c = cVar;
        aVar.f43625a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVar = this.f43622a.get(g10);
        if (aVar == null) {
            aVar = a.b();
            this.f43622a.put(g10, aVar);
        }
        aVar.f43626b = cVar;
        aVar.f43625a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f43622a.clear();
        this.f43623b.a();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.G g(long j10) {
        return this.f43623b.d(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.G g10) {
        a aVar = this.f43622a.get(g10);
        return (aVar == null || (aVar.f43625a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.G g10) {
        a aVar = this.f43622a.get(g10);
        return (aVar == null || (aVar.f43625a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.G g10) {
        p(g10);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.n.c m(RecyclerView.G g10) {
        return l(g10, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.n.c n(RecyclerView.G g10) {
        return l(g10, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f43622a.size() - 1; size >= 0; size--) {
            RecyclerView.G h10 = this.f43622a.h(size);
            a k10 = this.f43622a.k(size);
            int i10 = k10.f43625a;
            if ((i10 & 3) == 3) {
                bVar.b(h10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.c cVar = k10.f43626b;
                if (cVar == null) {
                    bVar.b(h10);
                } else {
                    bVar.c(h10, cVar, k10.f43627c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(h10, k10.f43626b, k10.f43627c);
            } else if ((i10 & 12) == 12) {
                bVar.d(h10, k10.f43626b, k10.f43627c);
            } else if ((i10 & 4) != 0) {
                bVar.c(h10, k10.f43626b, (RecyclerView.n.c) null);
            } else if ((i10 & 8) != 0) {
                bVar.a(h10, k10.f43626b, k10.f43627c);
            }
            a.c(k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.G g10) {
        a aVar = this.f43622a.get(g10);
        if (aVar != null) {
            aVar.f43625a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.G g10) {
        int o10 = this.f43623b.o() - 1;
        while (true) {
            if (o10 < 0) {
                break;
            } else if (g10 == this.f43623b.p(o10)) {
                this.f43623b.n(o10);
                break;
            } else {
                o10--;
            }
        }
        a remove = this.f43622a.remove(g10);
        if (remove != null) {
            a.c(remove);
        }
    }
}
