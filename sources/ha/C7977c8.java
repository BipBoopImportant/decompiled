package ha;

import K9.C6619q;

/* renamed from: ha.c8  reason: case insensitive filesystem */
public final class C7977c8 {

    /* renamed from: a  reason: collision with root package name */
    private final C8059l0 f52466a;

    /* synthetic */ C7977c8(C7957a8 a8Var, C7967b8 b8Var) {
        this.f52466a = a8Var.f52423a;
    }

    @S0(zza = 1)
    public final C8059l0 a() {
        return this.f52466a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7977c8)) {
            return false;
        }
        return C6619q.b(this.f52466a, ((C7977c8) obj).f52466a);
    }

    public final int hashCode() {
        return C6619q.c(this.f52466a);
    }
}
