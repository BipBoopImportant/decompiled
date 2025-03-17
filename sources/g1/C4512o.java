package G1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"LG1/o;", "", "", "extraAssertions", "<init>", "(Z)V", "LG1/G;", "node", "affectsLookahead", "e", "(LG1/G;Z)Z", "d", "(LG1/G;)Z", "LXH/N;", "c", "(LG1/G;Z)V", "i", "f", "()Z", "g", "(Z)Z", "h", "LG1/n;", "a", "LG1/n;", "lookaheadSet", "b", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.o  reason: case insensitive filesystem */
public final class C4512o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4511n f6558a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4511n f6559b;

    public C4512o(boolean z10) {
        this.f6558a = new C4511n(z10);
        this.f6559b = new C4511n(z10);
    }

    public final void c(G g10, boolean z10) {
        if (z10) {
            this.f6558a.a(g10);
            this.f6559b.a(g10);
        } else if (!this.f6558a.b(g10)) {
            this.f6559b.a(g10);
        }
    }

    public final boolean d(G g10) {
        return this.f6558a.b(g10) || this.f6559b.b(g10);
    }

    public final boolean e(G g10, boolean z10) {
        boolean b10 = this.f6558a.b(g10);
        return z10 ? b10 : b10 || this.f6559b.b(g10);
    }

    public final boolean f() {
        return this.f6559b.d() && this.f6558a.d();
    }

    public final boolean g(boolean z10) {
        return (z10 ? this.f6558a : this.f6559b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(G g10) {
        return this.f6559b.f(g10) || this.f6558a.f(g10);
    }
}
