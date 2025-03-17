package ha;

public final class J5 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public K5 f51980a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Integer f51981b;

    public final J5 a(K5 k52) {
        this.f51980a = k52;
        return this;
    }

    public final J5 b(Integer num) {
        this.f51981b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final M5 d() {
        return new M5(this, (L5) null);
    }
}
