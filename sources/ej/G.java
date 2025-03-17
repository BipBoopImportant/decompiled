package Ej;

import Uj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.I;
import rz.O;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LEj/G;", "", "Lrz/I;", "product", "LUj/j;", "quantityPicker", "", "shouldExpandBottomSheet", "", "quantityToCollect", "Lrz/O;", "scanType", "<init>", "(Lrz/I;LUj/j;ZILrz/O;)V", "a", "(Lrz/I;LUj/j;ZILrz/O;)LEj/G;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrz/I;", "c", "()Lrz/I;", "b", "LUj/j;", "d", "()LUj/j;", "Z", "g", "()Z", "I", "e", "Lrz/O;", "f", "()Lrz/O;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final I f80674a;

    /* renamed from: b  reason: collision with root package name */
    private final j f80675b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f80676c;

    /* renamed from: d  reason: collision with root package name */
    private final int f80677d;

    /* renamed from: e  reason: collision with root package name */
    private final O f80678e;

    public G(I i10, j jVar, boolean z10, int i11, O o10) {
        C17542s.j(i10, "product");
        C17542s.j(jVar, "quantityPicker");
        C17542s.j(o10, "scanType");
        this.f80674a = i10;
        this.f80675b = jVar;
        this.f80676c = z10;
        this.f80677d = i11;
        this.f80678e = o10;
    }

    public static /* synthetic */ G b(G g10, I i10, j jVar, boolean z10, int i11, O o10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = g10.f80674a;
        }
        if ((i12 & 2) != 0) {
            jVar = g10.f80675b;
        }
        j jVar2 = jVar;
        if ((i12 & 4) != 0) {
            z10 = g10.f80676c;
        }
        boolean z11 = z10;
        if ((i12 & 8) != 0) {
            i11 = g10.f80677d;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            o10 = g10.f80678e;
        }
        return g10.a(i10, jVar2, z11, i13, o10);
    }

    public final G a(I i10, j jVar, boolean z10, int i11, O o10) {
        C17542s.j(i10, "product");
        C17542s.j(jVar, "quantityPicker");
        C17542s.j(o10, "scanType");
        return new G(i10, jVar, z10, i11, o10);
    }

    public final I c() {
        return this.f80674a;
    }

    public final j d() {
        return this.f80675b;
    }

    public final int e() {
        return this.f80677d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return C17542s.e(this.f80674a, g10.f80674a) && C17542s.e(this.f80675b, g10.f80675b) && this.f80676c == g10.f80676c && this.f80677d == g10.f80677d && this.f80678e == g10.f80678e;
    }

    public final O f() {
        return this.f80678e;
    }

    public final boolean g() {
        return this.f80676c;
    }

    public int hashCode() {
        return (((((((this.f80674a.hashCode() * 31) + this.f80675b.hashCode()) * 31) + Boolean.hashCode(this.f80676c)) * 31) + Integer.hashCode(this.f80677d)) * 31) + this.f80678e.hashCode();
    }

    public String toString() {
        I i10 = this.f80674a;
        j jVar = this.f80675b;
        boolean z10 = this.f80676c;
        int i11 = this.f80677d;
        O o10 = this.f80678e;
        return "ShowProductInfo(product=" + i10 + ", quantityPicker=" + jVar + ", shouldExpandBottomSheet=" + z10 + ", quantityToCollect=" + i11 + ", scanType=" + o10 + ")";
    }
}
