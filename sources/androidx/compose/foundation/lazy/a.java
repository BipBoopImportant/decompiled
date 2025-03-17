package androidx.compose.foundation.lazy;

import U0.A1;
import U0.C4877g1;
import U0.C4894o0;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.d;
import c2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.N;
import t0.C5938c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJC\u0010\u0015\u001a\u00020\n*\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/a;", "Lt0/c;", "<init>", "()V", "", "width", "height", "LXH/N;", "f", "(II)V", "Landroidx/compose/ui/d;", "", "fraction", "d", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "c", "Lm0/N;", "fadeInSpec", "Lc2/n;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/d;Lm0/N;Lm0/N;Lm0/N;)Landroidx/compose/ui/d;", "LU0/o0;", "LU0/o0;", "maxWidthState", "b", "maxHeightState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements C5938c {

    /* renamed from: a  reason: collision with root package name */
    private C4894o0 f18250a = C4877g1.a(Integer.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    private C4894o0 f18251b = C4877g1.a(Integer.MAX_VALUE);

    public d a(d dVar, N<Float> n10, N<n> n11, N<Float> n12) {
        return (n10 == null && n11 == null && n12 == null) ? dVar : dVar.s(new LazyLayoutAnimateItemElement(n10, n11, n12));
    }

    public d c(d dVar, float f10) {
        return dVar.s(new ParentSizeElement(f10, (A1) null, this.f18251b, "fillParentMaxHeight", 2, (DefaultConstructorMarker) null));
    }

    public d d(d dVar, float f10) {
        return dVar.s(new ParentSizeElement(f10, this.f18250a, (A1) null, "fillParentMaxWidth", 4, (DefaultConstructorMarker) null));
    }

    public final void f(int i10, int i11) {
        this.f18250a.g(i10);
        this.f18251b.g(i11);
    }
}
