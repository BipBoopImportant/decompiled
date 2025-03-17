package androidx.recyclerview.widget;

import H2.f;
import H2.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a  reason: case insensitive filesystem */
final class C7003a implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private f<b> f43930a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f43931b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f43932c;

    /* renamed from: d  reason: collision with root package name */
    final C0751a f43933d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f43934e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f43935f;

    /* renamed from: g  reason: collision with root package name */
    final s f43936g;

    /* renamed from: h  reason: collision with root package name */
    private int f43937h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0751a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.G f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f43938a;

        /* renamed from: b  reason: collision with root package name */
        int f43939b;

        /* renamed from: c  reason: collision with root package name */
        Object f43940c;

        /* renamed from: d  reason: collision with root package name */
        int f43941d;

        b(int i10, int i11, int i12, Object obj) {
            this.f43938a = i10;
            this.f43939b = i11;
            this.f43941d = i12;
            this.f43940c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f43938a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f43938a;
            if (i10 != bVar.f43938a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f43941d - this.f43939b) == 1 && this.f43941d == bVar.f43939b && this.f43939b == bVar.f43941d) {
                return true;
            }
            if (this.f43941d != bVar.f43941d || this.f43939b != bVar.f43939b) {
                return false;
            }
            Object obj2 = this.f43940c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f43940c)) {
                    return false;
                }
            } else if (bVar.f43940c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f43938a * 31) + this.f43939b) * 31) + this.f43941d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f43939b + "c:" + this.f43941d + ",p:" + this.f43940c + "]";
        }
    }

    C7003a(C0751a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f43939b;
        int i11 = bVar.f43941d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f43933d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f43941d) {
            b(bVar);
            bVar = a(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f43939b;
        int i11 = bVar.f43941d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f43933d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f43940c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f43940c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f43941d) {
            Object obj = bVar.f43940c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f43932c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f43932c.get(i11);
            int i12 = bVar.f43938a;
            if (i12 == 8) {
                if (n(bVar.f43941d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f43939b;
                int i14 = bVar.f43941d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f43938a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z10 = z(bVar.f43939b, i11);
        int i12 = bVar.f43939b;
        int i13 = bVar.f43938a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f43941d; i15++) {
            int z11 = z(bVar.f43939b + (i10 * i15), bVar.f43938a);
            int i16 = bVar.f43938a;
            if (i16 == 2 ? z11 != z10 : !(i16 == 4 && z11 == z10 + 1)) {
                b a10 = a(i16, z10, i14, bVar.f43940c);
                l(a10, i12);
                b(a10);
                if (bVar.f43938a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                z10 = z11;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f43940c;
        b(bVar);
        if (i14 > 0) {
            b a11 = a(bVar.f43938a, z10, i14, obj);
            l(a11, i12);
            b(a11);
        }
    }

    private void v(b bVar) {
        this.f43932c.add(bVar);
        int i10 = bVar.f43938a;
        if (i10 == 1) {
            this.f43933d.g(bVar.f43939b, bVar.f43941d);
        } else if (i10 == 2) {
            this.f43933d.d(bVar.f43939b, bVar.f43941d);
        } else if (i10 == 4) {
            this.f43933d.e(bVar.f43939b, bVar.f43941d, bVar.f43940c);
        } else if (i10 == 8) {
            this.f43933d.a(bVar.f43939b, bVar.f43941d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f43932c.size() - 1; size >= 0; size--) {
            b bVar = this.f43932c.get(size);
            int i14 = bVar.f43938a;
            if (i14 == 8) {
                int i15 = bVar.f43939b;
                int i16 = bVar.f43941d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f43939b = i15 + 1;
                            bVar.f43941d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f43939b = i15 - 1;
                            bVar.f43941d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f43941d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f43941d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f43939b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f43939b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f43939b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f43941d;
                    } else if (i14 == 2) {
                        i10 += bVar.f43941d;
                    }
                } else if (i11 == 1) {
                    bVar.f43939b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f43939b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f43932c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f43932c.get(size2);
            if (bVar2.f43938a == 8) {
                int i18 = bVar2.f43941d;
                if (i18 == bVar2.f43939b || i18 < 0) {
                    this.f43932c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f43941d <= 0) {
                this.f43932c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public b a(int i10, int i11, int i12, Object obj) {
        b b10 = this.f43930a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f43938a = i10;
        b10.f43939b = i11;
        b10.f43941d = i12;
        b10.f43940c = obj;
        return b10;
    }

    public void b(b bVar) {
        if (!this.f43935f) {
            bVar.f43940c = null;
            this.f43930a.a(bVar);
        }
    }

    public int e(int i10) {
        int size = this.f43931b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f43931b.get(i11);
            int i12 = bVar.f43938a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f43939b;
                    if (i13 <= i10) {
                        int i14 = bVar.f43941d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f43939b;
                    if (i15 == i10) {
                        i10 = bVar.f43941d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f43941d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f43939b <= i10) {
                i10 += bVar.f43941d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f43932c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43933d.c(this.f43932c.get(i10));
        }
        x(this.f43932c);
        this.f43937h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f43931b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f43931b.get(i10);
            int i11 = bVar.f43938a;
            if (i11 == 1) {
                this.f43933d.c(bVar);
                this.f43933d.g(bVar.f43939b, bVar.f43941d);
            } else if (i11 == 2) {
                this.f43933d.c(bVar);
                this.f43933d.h(bVar.f43939b, bVar.f43941d);
            } else if (i11 == 4) {
                this.f43933d.c(bVar);
                this.f43933d.e(bVar.f43939b, bVar.f43941d, bVar.f43940c);
            } else if (i11 == 8) {
                this.f43933d.c(bVar);
                this.f43933d.a(bVar.f43939b, bVar.f43941d);
            }
            Runnable runnable = this.f43934e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f43931b);
        this.f43937h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f43933d.b(bVar);
        int i11 = bVar.f43938a;
        if (i11 == 2) {
            this.f43933d.h(i10, bVar.f43941d);
        } else if (i11 == 4) {
            this.f43933d.e(i10, bVar.f43941d, bVar.f43940c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f43932c.size();
        while (i11 < size) {
            b bVar = this.f43932c.get(i11);
            int i12 = bVar.f43938a;
            if (i12 == 8) {
                int i13 = bVar.f43939b;
                if (i13 == i10) {
                    i10 = bVar.f43941d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f43941d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f43939b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f43941d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f43941d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f43937h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f43931b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f43932c.isEmpty() && !this.f43931b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f43931b.add(a(4, i10, i11, obj));
        this.f43937h |= 4;
        return this.f43931b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f43931b.add(a(1, i10, i11, (Object) null));
        this.f43937h |= 1;
        return this.f43931b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f43931b.add(a(8, i10, i11, (Object) null));
            this.f43937h |= 8;
            return this.f43931b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f43931b.add(a(2, i10, i11, (Object) null));
        this.f43937h |= 2;
        return this.f43931b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f43936g.b(this.f43931b);
        int size = this.f43931b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f43931b.get(i10);
            int i11 = bVar.f43938a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f43934e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f43931b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.f43931b);
        x(this.f43932c);
        this.f43937h = 0;
    }

    C7003a(C0751a aVar, boolean z10) {
        this.f43930a = new g(30);
        this.f43931b = new ArrayList<>();
        this.f43932c = new ArrayList<>();
        this.f43937h = 0;
        this.f43933d = aVar;
        this.f43935f = z10;
        this.f43936g = new s(this);
    }
}
