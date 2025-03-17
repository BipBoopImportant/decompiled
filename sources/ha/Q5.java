package ha;

public final class Q5 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Long f52158a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C7995e6 f52159b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Boolean f52160c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Boolean f52161d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Boolean f52162e;

    public final Q5 a(Boolean bool) {
        this.f52161d = bool;
        return this;
    }

    public final Q5 b(Boolean bool) {
        this.f52162e = bool;
        return this;
    }

    public final Q5 c(Long l10) {
        this.f52158a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final Q5 d(C7995e6 e6Var) {
        this.f52159b = e6Var;
        return this;
    }

    public final Q5 e(Boolean bool) {
        this.f52160c = bool;
        return this;
    }

    public final S5 f() {
        return new S5(this, (R5) null);
    }
}
