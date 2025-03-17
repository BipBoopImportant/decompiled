package ha;

import fc.C9701b;
import fc.C9702c;
import fc.C9706g;

final class Y0 implements C9706g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f52370a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52371b = false;

    /* renamed from: c  reason: collision with root package name */
    private C9702c f52372c;

    /* renamed from: d  reason: collision with root package name */
    private final U0 f52373d;

    Y0(U0 u02) {
        this.f52373d = u02;
    }

    private final void c() {
        if (!this.f52370a) {
            this.f52370a = true;
            return;
        }
        throw new C9701b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final C9706g a(String str) {
        c();
        this.f52373d.h(this.f52372c, str, this.f52371b);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void b(C9702c cVar, boolean z10) {
        this.f52370a = false;
        this.f52372c = cVar;
        this.f52371b = z10;
    }

    public final C9706g g(boolean z10) {
        c();
        this.f52373d.i(this.f52372c, z10 ? 1 : 0, this.f52371b);
        return this;
    }
}
