package ha;

import K9.C6619q;

public final class M5 {

    /* renamed from: a  reason: collision with root package name */
    private final K5 f52044a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f52045b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f52046c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f52047d = null;

    /* synthetic */ M5(J5 j52, L5 l52) {
        this.f52044a = j52.f51980a;
        this.f52045b = j52.f51981b;
    }

    @S0(zza = 1)
    public final K5 a() {
        return this.f52044a;
    }

    @S0(zza = 2)
    public final Integer b() {
        return this.f52045b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M5)) {
            return false;
        }
        M5 m52 = (M5) obj;
        return C6619q.b(this.f52044a, m52.f52044a) && C6619q.b(this.f52045b, m52.f52045b) && C6619q.b((Object) null, (Object) null) && C6619q.b((Object) null, (Object) null);
    }

    public final int hashCode() {
        return C6619q.c(this.f52044a, this.f52045b, null, null);
    }
}
