package androidx.compose.foundation.text.modifiers;

import G0.g;
import G1.V;
import N1.A;
import N1.C4669d;
import N1.P;
import N1.Y;
import S1.C4820m;
import XH.C16807N;
import Y1.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;
import p1.C5753y0;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00102R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00106R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00104R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LG1/V;", "Landroidx/compose/foundation/text/modifiers/a;", "LN1/d;", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LN1/d$c;", "LN1/A;", "placeholders", "Lo1/i;", "onPlaceholderLayout", "LG0/g;", "selectionController", "Lp1/y0;", "color", "<init>", "(LN1/d;LN1/Y;LS1/m$b;LnI/l;IZIILjava/util/List;LnI/l;LG0/g;Lp1/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/text/modifiers/a;", "node", "f", "(Landroidx/compose/foundation/text/modifiers/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "LN1/d;", "e", "LN1/Y;", "LS1/m$b;", "g", "LnI/l;", "h", "I", "i", "Z", "j", "k", "l", "Ljava/util/List;", "m", "n", "LG0/g;", "o", "Lp1/y0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableTextAnnotatedStringElement extends V<a> {

    /* renamed from: d  reason: collision with root package name */
    private final C4669d f18512d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f18513e;

    /* renamed from: f  reason: collision with root package name */
    private final C4820m.b f18514f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<P, C16807N> f18515g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18516h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f18517i;

    /* renamed from: j  reason: collision with root package name */
    private final int f18518j;

    /* renamed from: k  reason: collision with root package name */
    private final int f18519k;

    /* renamed from: l  reason: collision with root package name */
    private final List<C4669d.c<A>> f18520l;

    /* renamed from: m  reason: collision with root package name */
    private final C17642l<List<C5669i>, C16807N> f18521m;

    /* renamed from: n  reason: collision with root package name */
    private final g f18522n;

    /* renamed from: o  reason: collision with root package name */
    private final C5753y0 f18523o;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C4669d dVar, Y y10, C4820m.b bVar, C17642l lVar, int i10, boolean z10, int i11, int i12, List list, C17642l lVar2, g gVar, C5753y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, y0Var);
    }

    /* renamed from: c */
    public a a() {
        return new a(this.f18512d, this.f18513e, this.f18514f, this.f18515g, this.f18516h, this.f18517i, this.f18518j, this.f18519k, this.f18520l, this.f18521m, this.f18522n, this.f18523o, (C17642l) null, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return C17542s.e(this.f18523o, selectableTextAnnotatedStringElement.f18523o) && C17542s.e(this.f18512d, selectableTextAnnotatedStringElement.f18512d) && C17542s.e(this.f18513e, selectableTextAnnotatedStringElement.f18513e) && C17542s.e(this.f18520l, selectableTextAnnotatedStringElement.f18520l) && C17542s.e(this.f18514f, selectableTextAnnotatedStringElement.f18514f) && this.f18515g == selectableTextAnnotatedStringElement.f18515g && t.e(this.f18516h, selectableTextAnnotatedStringElement.f18516h) && this.f18517i == selectableTextAnnotatedStringElement.f18517i && this.f18518j == selectableTextAnnotatedStringElement.f18518j && this.f18519k == selectableTextAnnotatedStringElement.f18519k && this.f18521m == selectableTextAnnotatedStringElement.f18521m && C17542s.e(this.f18522n, selectableTextAnnotatedStringElement.f18522n);
    }

    /* renamed from: f */
    public void b(a aVar) {
        aVar.I2(this.f18512d, this.f18513e, this.f18520l, this.f18519k, this.f18518j, this.f18517i, this.f18514f, this.f18516h, this.f18515g, this.f18521m, this.f18522n, this.f18523o);
    }

    public int hashCode() {
        int hashCode = ((((this.f18512d.hashCode() * 31) + this.f18513e.hashCode()) * 31) + this.f18514f.hashCode()) * 31;
        C17642l<P, C16807N> lVar = this.f18515g;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + t.f(this.f18516h)) * 31) + Boolean.hashCode(this.f18517i)) * 31) + this.f18518j) * 31) + this.f18519k) * 31;
        List<C4669d.c<A>> list = this.f18520l;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        C17642l<List<C5669i>, C16807N> lVar2 = this.f18521m;
        int hashCode4 = (hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        g gVar = this.f18522n;
        int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C5753y0 y0Var = this.f18523o;
        if (y0Var != null) {
            i10 = y0Var.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + this.f18512d + ", style=" + this.f18513e + ", fontFamilyResolver=" + this.f18514f + ", onTextLayout=" + this.f18515g + ", overflow=" + t.g(this.f18516h) + ", softWrap=" + this.f18517i + ", maxLines=" + this.f18518j + ", minLines=" + this.f18519k + ", placeholders=" + this.f18520l + ", onPlaceholderLayout=" + this.f18521m + ", selectionController=" + this.f18522n + ", color=" + this.f18523o + ')';
    }

    private SelectableTextAnnotatedStringElement(C4669d dVar, Y y10, C4820m.b bVar, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, List<C4669d.c<A>> list, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C5753y0 y0Var) {
        this.f18512d = dVar;
        this.f18513e = y10;
        this.f18514f = bVar;
        this.f18515g = lVar;
        this.f18516h = i10;
        this.f18517i = z10;
        this.f18518j = i11;
        this.f18519k = i12;
        this.f18520l = list;
        this.f18521m = lVar2;
        this.f18522n = gVar;
        this.f18523o = y0Var;
    }
}
