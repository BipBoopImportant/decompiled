package FF;

import com.sugarcube.app.base.ui.gallery.showrooms.VizState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"LFF/d;", "Lcom/sugarcube/app/base/ui/gallery/showrooms/VizState;", "", "visible", "expanded", "<init>", "(ZZ)V", "isVisible", "()Z", "a", "(ZZ)LFF/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisible", "b", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.d  reason: case insensitive filesystem */
public final class C12887d implements VizState {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f109862a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f109863b;

    public C12887d() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C12887d b(C12887d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dVar.f109862a;
        }
        if ((i10 & 2) != 0) {
            z11 = dVar.f109863b;
        }
        return dVar.a(z10, z11);
    }

    public final C12887d a(boolean z10, boolean z11) {
        return new C12887d(z10, z11);
    }

    public final boolean c() {
        return this.f109863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12887d)) {
            return false;
        }
        C12887d dVar = (C12887d) obj;
        return this.f109862a == dVar.f109862a && this.f109863b == dVar.f109863b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f109862a) * 31) + Boolean.hashCode(this.f109863b);
    }

    public boolean isVisible() {
        return this.f109862a;
    }

    public String toString() {
        boolean z10 = this.f109862a;
        boolean z11 = this.f109863b;
        return "ExpandCollapseState(visible=" + z10 + ", expanded=" + z11 + ")";
    }

    public C12887d(boolean z10, boolean z11) {
        this.f109862a = z10;
        this.f109863b = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12887d(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }
}
