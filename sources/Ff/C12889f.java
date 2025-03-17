package FF;

import com.sugarcube.app.base.ui.gallery.showrooms.VizState;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LFF/f;", "Lcom/sugarcube/app/base/ui/gallery/showrooms/VizState;", "", "visibleIfSectionCollapsed", "sectionIsExpanded", "itemIncludedInFilter", "<init>", "(ZZLjava/lang/Boolean;)V", "isVisible", "()Z", "a", "(ZZLjava/lang/Boolean;)LFF/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisibleIfSectionCollapsed", "b", "getSectionIsExpanded", "c", "Ljava/lang/Boolean;", "getItemIncludedInFilter", "()Ljava/lang/Boolean;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.f  reason: case insensitive filesystem */
public final class C12889f implements VizState {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f109890a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f109891b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f109892c;

    public C12889f(boolean z10, boolean z11, Boolean bool) {
        this.f109890a = z10;
        this.f109891b = z11;
        this.f109892c = bool;
    }

    public static /* synthetic */ C12889f b(C12889f fVar, boolean z10, boolean z11, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f109890a;
        }
        if ((i10 & 2) != 0) {
            z11 = fVar.f109891b;
        }
        if ((i10 & 4) != 0) {
            bool = fVar.f109892c;
        }
        return fVar.a(z10, z11, bool);
    }

    public final C12889f a(boolean z10, boolean z11, Boolean bool) {
        return new C12889f(z10, z11, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12889f)) {
            return false;
        }
        C12889f fVar = (C12889f) obj;
        return this.f109890a == fVar.f109890a && this.f109891b == fVar.f109891b && C17542s.e(this.f109892c, fVar.f109892c);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f109890a) * 31) + Boolean.hashCode(this.f109891b)) * 31;
        Boolean bool = this.f109892c;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public boolean isVisible() {
        Boolean bool = this.f109892c;
        return bool == null ? this.f109891b || this.f109890a : bool.booleanValue();
    }

    public String toString() {
        boolean z10 = this.f109890a;
        boolean z11 = this.f109891b;
        Boolean bool = this.f109892c;
        return "RoomCardVizState(visibleIfSectionCollapsed=" + z10 + ", sectionIsExpanded=" + z11 + ", itemIncludedInFilter=" + bool + ")";
    }
}
