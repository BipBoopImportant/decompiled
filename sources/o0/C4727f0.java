package O0;

import androidx.compose.ui.window.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LO0/f0;", "", "Landroidx/compose/ui/window/r;", "securePolicy", "", "shouldDismissOnBackPress", "<init>", "(Landroidx/compose/ui/window/r;Z)V", "(Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/window/r;", "()Landroidx/compose/ui/window/r;", "b", "Z", "()Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.f0  reason: case insensitive filesystem */
public final class C4727f0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f10772a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10773b;

    public C4727f0() {
        this((r) null, false, 3, (DefaultConstructorMarker) null);
    }

    public final r a() {
        return this.f10772a;
    }

    public final boolean b() {
        return this.f10773b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4727f0) && this.f10772a == ((C4727f0) obj).f10772a;
    }

    public int hashCode() {
        return (this.f10772a.hashCode() * 31) + Boolean.hashCode(this.f10773b);
    }

    public C4727f0(r rVar, boolean z10) {
        this.f10772a = rVar;
        this.f10773b = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4727f0(r rVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? r.Inherit : rVar, (i10 & 2) != 0 ? true : z10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4727f0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public C4727f0(boolean z10) {
        this(r.Inherit, z10);
    }
}
