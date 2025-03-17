package ha;

public final class D5 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Long f51845a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Long f51846b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Long f51847c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Long f51848d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Long f51849e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Long f51850f;

    public final D5 a(Long l10) {
        this.f51847c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 b(Long l10) {
        this.f51848d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 c(Long l10) {
        this.f51845a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 d(Long l10) {
        this.f51849e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 e(Long l10) {
        this.f51846b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 f(Long l10) {
        this.f51850f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final F5 g() {
        return new F5(this, (E5) null);
    }
}
