package ha;

import java.util.Set;

/* renamed from: ha.o0  reason: case insensitive filesystem */
public abstract class C8089o0 extends C8009g0 implements Set {

    /* renamed from: b  reason: collision with root package name */
    private transient C8059l0 f52684b;

    C8089o0() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return H0.b(this, obj);
    }

    public final int hashCode() {
        return H0.a(this);
    }

    public final C8059l0 p() {
        C8059l0 l0Var = this.f52684b;
        if (l0Var != null) {
            return l0Var;
        }
        C8059l0 q10 = q();
        this.f52684b = q10;
        return q10;
    }

    /* access modifiers changed from: package-private */
    public C8059l0 q() {
        Object[] array = toArray();
        int i10 = C8059l0.f52628c;
        return C8059l0.q(array, array.length);
    }
}
