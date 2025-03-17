package androidx.compose.foundation.layout;

import E1.C4468a;
import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b#\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LG1/V;", "Landroidx/compose/foundation/layout/b;", "LE1/a;", "alignmentLine", "Lc2/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(LE1/a;FFLnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/b;", "node", "f", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LE1/a;", "getAlignmentLine", "()LE1/a;", "e", "F", "getBefore-D9Ej5fM", "()F", "getAfter-D9Ej5fM", "g", "LnI/l;", "getInspectorInfo", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends V<C5071b> {

    /* renamed from: d  reason: collision with root package name */
    private final C4468a f17903d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17904e;

    /* renamed from: f  reason: collision with root package name */
    private final float f17905f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f17906g;

    public /* synthetic */ AlignmentLineOffsetDpElement(C4468a aVar, float f10, float f11, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11, lVar);
    }

    /* renamed from: c */
    public C5071b a() {
        return new C5071b(this.f17903d, this.f17904e, this.f17905f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return C17542s.e(this.f17903d, alignmentLineOffsetDpElement.f17903d) && h.D(this.f17904e, alignmentLineOffsetDpElement.f17904e) && h.D(this.f17905f, alignmentLineOffsetDpElement.f17905f);
    }

    /* renamed from: f */
    public void b(C5071b bVar) {
        bVar.D2(this.f17903d);
        bVar.E2(this.f17904e);
        bVar.C2(this.f17905f);
    }

    public int hashCode() {
        return (((this.f17903d.hashCode() * 31) + h.E(this.f17904e)) * 31) + h.E(this.f17905f);
    }

    private AlignmentLineOffsetDpElement(C4468a aVar, float f10, float f11, C17642l<? super C5137v0, C16807N> lVar) {
        this.f17903d = aVar;
        this.f17904e = f10;
        this.f17905f = f11;
        this.f17906g = lVar;
        if ((f10 < 0.0f && !h.D(f10, h.f23031b.c())) || (f11 < 0.0f && !h.D(f11, h.f23031b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
