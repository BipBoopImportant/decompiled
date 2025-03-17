package C;

import H2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final List<C4397h0> f5180a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C4397h0> f5181b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C4397h0> f5182c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5183d;

    B(a aVar) {
        this.f5180a = Collections.unmodifiableList(aVar.f5184a);
        this.f5181b = Collections.unmodifiableList(aVar.f5185b);
        this.f5182c = Collections.unmodifiableList(aVar.f5186c);
        this.f5183d = aVar.f5187d;
    }

    public long a() {
        return this.f5183d;
    }

    public List<C4397h0> b() {
        return this.f5181b;
    }

    public List<C4397h0> c() {
        return this.f5180a;
    }

    public List<C4397h0> d() {
        return this.f5182c;
    }

    public boolean e() {
        return this.f5183d > 0;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<C4397h0> f5184a;

        /* renamed from: b  reason: collision with root package name */
        final List<C4397h0> f5185b;

        /* renamed from: c  reason: collision with root package name */
        final List<C4397h0> f5186c;

        /* renamed from: d  reason: collision with root package name */
        long f5187d;

        public a(C4397h0 h0Var, int i10) {
            this.f5184a = new ArrayList();
            this.f5185b = new ArrayList();
            this.f5186c = new ArrayList();
            this.f5187d = 5000;
            a(h0Var, i10);
        }

        public a a(C4397h0 h0Var, int i10) {
            boolean z10 = false;
            i.b(h0Var != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            i.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f5184a.add(h0Var);
            }
            if ((i10 & 2) != 0) {
                this.f5185b.add(h0Var);
            }
            if ((i10 & 4) != 0) {
                this.f5186c.add(h0Var);
            }
            return this;
        }

        public B b() {
            return new B(this);
        }

        public a c(int i10) {
            if ((i10 & 1) != 0) {
                this.f5184a.clear();
            }
            if ((i10 & 2) != 0) {
                this.f5185b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f5186c.clear();
            }
            return this;
        }

        public a(B b10) {
            ArrayList arrayList = new ArrayList();
            this.f5184a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f5185b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f5186c = arrayList3;
            this.f5187d = 5000;
            arrayList.addAll(b10.c());
            arrayList2.addAll(b10.b());
            arrayList3.addAll(b10.d());
            this.f5187d = b10.a();
        }
    }
}
