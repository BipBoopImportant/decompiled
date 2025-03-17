package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LG1/V;", "Landroidx/compose/foundation/layout/K;", "Lc2/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(FFFFZLnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/K;", "node", "f", "(Landroidx/compose/foundation/layout/K;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "e", "g", "h", "Z", "i", "LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeElement extends V<K> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18033d;

    /* renamed from: e  reason: collision with root package name */
    private final float f18034e;

    /* renamed from: f  reason: collision with root package name */
    private final float f18035f;

    /* renamed from: g  reason: collision with root package name */
    private final float f18036g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f18037h;

    /* renamed from: i  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f18038i;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    /* renamed from: c */
    public K a() {
        return new K(this.f18033d, this.f18034e, this.f18035f, this.f18036g, this.f18037h, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return h.D(this.f18033d, sizeElement.f18033d) && h.D(this.f18034e, sizeElement.f18034e) && h.D(this.f18035f, sizeElement.f18035f) && h.D(this.f18036g, sizeElement.f18036g) && this.f18037h == sizeElement.f18037h;
    }

    /* renamed from: f */
    public void b(K k10) {
        k10.H2(this.f18033d);
        k10.G2(this.f18034e);
        k10.F2(this.f18035f);
        k10.E2(this.f18036g);
        k10.D2(this.f18037h);
    }

    public int hashCode() {
        return (((((((h.E(this.f18033d) * 31) + h.E(this.f18034e)) * 31) + h.E(this.f18035f)) * 31) + h.E(this.f18036g)) * 31) + Boolean.hashCode(this.f18037h);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.f23031b.c() : f10, (i10 & 2) != 0 ? h.f23031b.c() : f11, (i10 & 4) != 0 ? h.f23031b.c() : f12, (i10 & 8) != 0 ? h.f23031b.c() : f13, z10, lVar, (DefaultConstructorMarker) null);
    }

    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, C17642l<? super C5137v0, C16807N> lVar) {
        this.f18033d = f10;
        this.f18034e = f11;
        this.f18035f = f12;
        this.f18036g = f13;
        this.f18037h = z10;
        this.f18038i = lVar;
    }
}
