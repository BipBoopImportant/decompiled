package ha;

/* renamed from: ha.e1  reason: case insensitive filesystem */
public final class C7990e1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C8020h1 f52483a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Integer f52484b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public F5 f52485c;

    public final C7990e1 a(Integer num) {
        this.f52484b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C7990e1 b(F5 f52) {
        this.f52485c = f52;
        return this;
    }

    public final C7990e1 c(C8020h1 h1Var) {
        this.f52483a = h1Var;
        return this;
    }

    public final C8040j1 e() {
        return new C8040j1(this, (C8030i1) null);
    }
}
