package ia;

import fc.C9701b;
import fc.C9702c;
import fc.C9706g;

/* renamed from: ia.p  reason: case insensitive filesystem */
final class C8325p implements C9706g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f53753a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f53754b = false;

    /* renamed from: c  reason: collision with root package name */
    private C9702c f53755c;

    /* renamed from: d  reason: collision with root package name */
    private final C8297l f53756d;

    C8325p(C8297l lVar) {
        this.f53756d = lVar;
    }

    private final void c() {
        if (!this.f53753a) {
            this.f53753a = true;
            return;
        }
        throw new C9701b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final C9706g a(String str) {
        c();
        this.f53756d.h(this.f53755c, str, this.f53754b);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void b(C9702c cVar, boolean z10) {
        this.f53753a = false;
        this.f53755c = cVar;
        this.f53754b = z10;
    }

    public final C9706g g(boolean z10) {
        c();
        this.f53756d.i(this.f53755c, z10 ? 1 : 0, this.f53754b);
        return this;
    }
}
