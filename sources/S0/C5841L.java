package s0;

import androidx.compose.foundation.layout.C5082m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b \u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ls0/L;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "Ls0/p;", "flowLayoutData", "<init>", "(FZLandroidx/compose/foundation/layout/m;Ls0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "d", "()F", "g", "(F)V", "b", "Z", "()Z", "f", "(Z)V", "c", "Landroidx/compose/foundation/layout/m;", "()Landroidx/compose/foundation/layout/m;", "e", "(Landroidx/compose/foundation/layout/m;)V", "Ls0/p;", "()Ls0/p;", "setFlowLayoutData", "(Ls0/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.L  reason: case insensitive filesystem */
public final class C5841L {

    /* renamed from: a  reason: collision with root package name */
    private float f28723a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28724b;

    /* renamed from: c  reason: collision with root package name */
    private C5082m f28725c;

    public C5841L() {
        this(0.0f, false, (C5082m) null, (C5870p) null, 15, (DefaultConstructorMarker) null);
    }

    public final C5082m a() {
        return this.f28725c;
    }

    public final boolean b() {
        return this.f28724b;
    }

    public final C5870p c() {
        return null;
    }

    public final float d() {
        return this.f28723a;
    }

    public final void e(C5082m mVar) {
        this.f28725c = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5841L)) {
            return false;
        }
        C5841L l10 = (C5841L) obj;
        return Float.compare(this.f28723a, l10.f28723a) == 0 && this.f28724b == l10.f28724b && C17542s.e(this.f28725c, l10.f28725c) && C17542s.e((Object) null, (Object) null);
    }

    public final void f(boolean z10) {
        this.f28724b = z10;
    }

    public final void g(float f10) {
        this.f28723a = f10;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.f28723a) * 31) + Boolean.hashCode(this.f28724b)) * 31;
        C5082m mVar = this.f28725c;
        return (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f28723a + ", fill=" + this.f28724b + ", crossAxisAlignment=" + this.f28725c + ", flowLayoutData=" + null + ')';
    }

    public C5841L(float f10, boolean z10, C5082m mVar, C5870p pVar) {
        this.f28723a = f10;
        this.f28724b = z10;
        this.f28725c = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5841L(float f10, boolean z10, C5082m mVar, C5870p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : mVar, (i10 & 8) != 0 ? null : pVar);
    }
}
