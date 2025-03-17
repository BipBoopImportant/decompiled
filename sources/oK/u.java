package oK;

import c2.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5669i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, d2 = {"LoK/u;", "", "LoK/j;", "region", "Lc2/p;", "bounds", "", "isVisible", "isBase", "<init>", "(LoK/j;Lc2/p;ZZ)V", "Lo1/i;", "(LoK/j;Lo1/i;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LoK/j;", "b", "()LoK/j;", "Lc2/p;", "()Lc2/p;", "c", "Z", "d", "()Z", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final C17717j f145430a;

    /* renamed from: b  reason: collision with root package name */
    private final p f145431b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f145432c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f145433d;

    private u(C17717j jVar, p pVar, boolean z10, boolean z11) {
        this.f145430a = jVar;
        this.f145431b = pVar;
        this.f145432c = z10;
        this.f145433d = z11;
    }

    public final p a() {
        return this.f145431b;
    }

    public final C17717j b() {
        return this.f145430a;
    }

    public final boolean c() {
        return this.f145433d;
    }

    public final boolean d() {
        return this.f145432c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return C17542s.e(this.f145430a, uVar.f145430a) && C17542s.e(this.f145431b, uVar.f145431b) && this.f145432c == uVar.f145432c && this.f145433d == uVar.f145433d;
    }

    public int hashCode() {
        return (((((this.f145430a.hashCode() * 31) + this.f145431b.hashCode()) * 31) + Boolean.hashCode(this.f145432c)) * 31) + Boolean.hashCode(this.f145433d);
    }

    public String toString() {
        C17717j jVar = this.f145430a;
        p pVar = this.f145431b;
        boolean z10 = this.f145432c;
        boolean z11 = this.f145433d;
        return "ViewportTile(region=" + jVar + ", bounds=" + pVar + ", isVisible=" + z10 + ", isBase=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(C17717j jVar, C5669i iVar, boolean z10, boolean z11) {
        this(jVar, C17709b.f(iVar), z10, z11);
        C17542s.j(jVar, "region");
        C17542s.j(iVar, "bounds");
    }
}
