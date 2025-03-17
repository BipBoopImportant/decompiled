package ic;

import fc.C9701b;
import fc.C9702c;
import fc.C9706g;

/* renamed from: ic.i  reason: case insensitive filesystem */
class C9841i implements C9706g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f74258a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f74259b = false;

    /* renamed from: c  reason: collision with root package name */
    private C9702c f74260c;

    /* renamed from: d  reason: collision with root package name */
    private final C9838f f74261d;

    C9841i(C9838f fVar) {
        this.f74261d = fVar;
    }

    private void b() {
        if (!this.f74258a) {
            this.f74258a = true;
            return;
        }
        throw new C9701b("Cannot encode a second value in the ValueEncoderContext");
    }

    public C9706g a(String str) {
        b();
        this.f74261d.i(this.f74260c, str, this.f74259b);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(C9702c cVar, boolean z10) {
        this.f74258a = false;
        this.f74260c = cVar;
        this.f74259b = z10;
    }

    public C9706g g(boolean z10) {
        b();
        this.f74261d.o(this.f74260c, z10, this.f74259b);
        return this;
    }
}
