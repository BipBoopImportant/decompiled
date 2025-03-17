package jC;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LjC/a;", "", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "<init>", "(ZZZZ)V", "a", "(ZZZZ)LjC/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "f", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jC.a  reason: case insensitive filesystem */
public final class C14614a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f127851a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f127852b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f127853c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f127854d;

    public C14614a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f127851a = z10;
        this.f127852b = z11;
        this.f127853c = z12;
        this.f127854d = z13;
    }

    public static /* synthetic */ C14614a b(C14614a aVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f127851a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f127852b;
        }
        if ((i10 & 4) != 0) {
            z12 = aVar.f127853c;
        }
        if ((i10 & 8) != 0) {
            z13 = aVar.f127854d;
        }
        return aVar.a(z10, z11, z12, z13);
    }

    public final C14614a a(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new C14614a(z10, z11, z12, z13);
    }

    public final boolean c() {
        return this.f127853c;
    }

    public final boolean d() {
        return this.f127852b;
    }

    public final boolean e() {
        return this.f127851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14614a)) {
            return false;
        }
        C14614a aVar = (C14614a) obj;
        return this.f127851a == aVar.f127851a && this.f127852b == aVar.f127852b && this.f127853c == aVar.f127853c && this.f127854d == aVar.f127854d;
    }

    public final boolean f() {
        return this.f127854d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f127851a) * 31) + Boolean.hashCode(this.f127852b)) * 31) + Boolean.hashCode(this.f127853c)) * 31) + Boolean.hashCode(this.f127854d);
    }

    public String toString() {
        boolean z10 = this.f127851a;
        boolean z11 = this.f127852b;
        boolean z12 = this.f127853c;
        boolean z13 = this.f127854d;
        return "DrawUnderConfig(drawUnderStatusBar=" + z10 + ", drawUnderNavigationBar=" + z11 + ", drawUnderDisplayCutout=" + z12 + ", handleImeInsets=" + z13 + ")";
    }
}
