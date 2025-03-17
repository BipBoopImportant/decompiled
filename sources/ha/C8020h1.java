package ha;

import K9.C6619q;

/* renamed from: ha.h1  reason: case insensitive filesystem */
public final class C8020h1 {

    /* renamed from: a  reason: collision with root package name */
    private final C7995e6 f52553a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f52554b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f52555c;

    /* renamed from: d  reason: collision with root package name */
    private final M5 f52556d;

    /* renamed from: e  reason: collision with root package name */
    private final C7977c8 f52557e;

    /* renamed from: f  reason: collision with root package name */
    private final C8059l0 f52558f;

    /* renamed from: g  reason: collision with root package name */
    private final C8059l0 f52559g;

    /* synthetic */ C8020h1(C8000f1 f1Var, C8010g1 g1Var) {
        this.f52553a = f1Var.f52510a;
        this.f52555c = f1Var.f52511b;
        this.f52556d = null;
        this.f52557e = f1Var.f52512c;
        this.f52558f = f1Var.f52513d;
        this.f52559g = f1Var.f52514e;
    }

    @S0(zza = 6)
    public final C8059l0 a() {
        return this.f52558f;
    }

    @S0(zza = 7)
    public final C8059l0 b() {
        return this.f52559g;
    }

    @S0(zza = 1)
    public final C7995e6 c() {
        return this.f52553a;
    }

    @S0(zza = 5)
    public final C7977c8 d() {
        return this.f52557e;
    }

    @S0(zza = 3)
    public final Boolean e() {
        return this.f52555c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8020h1)) {
            return false;
        }
        C8020h1 h1Var = (C8020h1) obj;
        return C6619q.b(this.f52553a, h1Var.f52553a) && C6619q.b((Object) null, (Object) null) && C6619q.b(this.f52555c, h1Var.f52555c) && C6619q.b((Object) null, (Object) null) && C6619q.b(this.f52557e, h1Var.f52557e) && C6619q.b(this.f52558f, h1Var.f52558f) && C6619q.b(this.f52559g, h1Var.f52559g);
    }

    public final int hashCode() {
        return C6619q.c(this.f52553a, null, this.f52555c, null, this.f52557e, this.f52558f, this.f52559g);
    }
}
