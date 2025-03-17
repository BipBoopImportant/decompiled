package uJ;

import DI.C15538I;
import DI.C15544O;
import DI.C15561h;
import DI.C15566m;
import gJ.C17278i;
import kotlin.jvm.internal.C17542s;
import wJ.C18230l;

/* renamed from: uJ.w  reason: case insensitive filesystem */
public abstract class C18142w implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private int f147937a;

    private final boolean h(C15561h hVar) {
        return !C18230l.m(hVar) && !C17278i.E(hVar);
    }

    public abstract C15561h e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0) || obj.hashCode() != hashCode()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (y0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C15561h e10 = e();
        C15561h e11 = y0Var.e();
        if (e11 != null && h(e10) && h(e11)) {
            return i(e11);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean g(C15561h hVar, C15561h hVar2) {
        C17542s.j(hVar, "first");
        C17542s.j(hVar2, "second");
        if (!C17542s.e(hVar.getName(), hVar2.getName())) {
            return false;
        }
        C15566m b10 = hVar.b();
        C15566m b11 = hVar2.b();
        while (b10 != null && b11 != null) {
            if (b10 instanceof C15538I) {
                return b11 instanceof C15538I;
            }
            if (b11 instanceof C15538I) {
                return false;
            }
            if (b10 instanceof C15544O) {
                return (b11 instanceof C15544O) && C17542s.e(((C15544O) b10).f(), ((C15544O) b11).f());
            }
            if ((b11 instanceof C15544O) || !C17542s.e(b10.getName(), b11.getName())) {
                return false;
            }
            b10 = b10.b();
            b11 = b11.b();
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f147937a;
        if (i10 != 0) {
            return i10;
        }
        C15561h e10 = e();
        int hashCode = h(e10) ? C17278i.m(e10).hashCode() : System.identityHashCode(this);
        this.f147937a = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public abstract boolean i(C15561h hVar);
}
