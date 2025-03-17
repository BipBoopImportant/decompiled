package ia;

/* renamed from: ia.x3  reason: case insensitive filesystem */
public final class C8384x3 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Long f53992a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C8391y3 f53993b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8349s3 f53994c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Integer f53995d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Integer f53996e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Integer f53997f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Integer f53998g;

    public final C8384x3 b(Long l10) {
        this.f53992a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C8384x3 c(Integer num) {
        this.f53995d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C8384x3 d(C8349s3 s3Var) {
        this.f53994c = s3Var;
        return this;
    }

    public final C8384x3 e(Integer num) {
        this.f53997f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C8384x3 f(C8391y3 y3Var) {
        this.f53993b = y3Var;
        return this;
    }

    public final C8384x3 g(Integer num) {
        this.f53996e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C8384x3 h(Integer num) {
        this.f53998g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final A3 j() {
        return new A3(this, (C8397z3) null);
    }
}
