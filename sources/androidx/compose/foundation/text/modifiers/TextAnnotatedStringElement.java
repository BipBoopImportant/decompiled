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
import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;
import p1.C5753y0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u00101R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00105R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00103R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u00103\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LG1/V;", "Landroidx/compose/foundation/text/modifiers/b;", "LN1/d;", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LN1/d$c;", "LN1/A;", "placeholders", "Lo1/i;", "onPlaceholderLayout", "LG0/g;", "selectionController", "Lp1/y0;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LN1/d;LN1/Y;LS1/m$b;LnI/l;IZIILjava/util/List;LnI/l;LG0/g;Lp1/y0;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "f", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "LN1/d;", "e", "LN1/Y;", "LS1/m$b;", "g", "LnI/l;", "h", "I", "i", "Z", "j", "k", "l", "Ljava/util/List;", "m", "n", "LG0/g;", "o", "Lp1/y0;", "p", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextAnnotatedStringElement extends V<b> {

    /* renamed from: d  reason: collision with root package name */
    private final C4669d f18524d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f18525e;

    /* renamed from: f  reason: collision with root package name */
    private final C4820m.b f18526f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<P, C16807N> f18527g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18528h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f18529i;

    /* renamed from: j  reason: collision with root package name */
    private final int f18530j;

    /* renamed from: k  reason: collision with root package name */
    private final int f18531k;

    /* renamed from: l  reason: collision with root package name */
    private final List<C4669d.c<A>> f18532l;

    /* renamed from: m  reason: collision with root package name */
    private final C17642l<List<C5669i>, C16807N> f18533m;

    /* renamed from: n  reason: collision with root package name */
    private final g f18534n;

    /* renamed from: o  reason: collision with root package name */
    private final C5753y0 f18535o;

    /* renamed from: p  reason: collision with root package name */
    private final C17642l<b.a, C16807N> f18536p;

    public /* synthetic */ TextAnnotatedStringElement(C4669d dVar, Y y10, C4820m.b bVar, C17642l lVar, int i10, boolean z10, int i11, int i12, List list, C17642l lVar2, g gVar, C5753y0 y0Var, C17642l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, y0Var, lVar3);
    }

    /* renamed from: c */
    public b a() {
        return new b(this.f18524d, this.f18525e, this.f18526f, this.f18527g, this.f18528h, this.f18529i, this.f18530j, this.f18531k, this.f18532l, this.f18533m, this.f18534n, this.f18535o, this.f18536p, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return C17542s.e(this.f18535o, textAnnotatedStringElement.f18535o) && C17542s.e(this.f18524d, textAnnotatedStringElement.f18524d) && C17542s.e(this.f18525e, textAnnotatedStringElement.f18525e) && C17542s.e(this.f18532l, textAnnotatedStringElement.f18532l) && C17542s.e(this.f18526f, textAnnotatedStringElement.f18526f) && this.f18527g == textAnnotatedStringElement.f18527g && this.f18536p == textAnnotatedStringElement.f18536p && t.e(this.f18528h, textAnnotatedStringElement.f18528h) && this.f18529i == textAnnotatedStringElement.f18529i && this.f18530j == textAnnotatedStringElement.f18530j && this.f18531k == textAnnotatedStringElement.f18531k && this.f18533m == textAnnotatedStringElement.f18533m && C17542s.e(this.f18534n, textAnnotatedStringElement.f18534n);
    }

    /* renamed from: f */
    public void b(b bVar) {
        bVar.J2(bVar.W2(this.f18535o, this.f18525e), bVar.Y2(this.f18524d), bVar.X2(this.f18525e, this.f18532l, this.f18531k, this.f18530j, this.f18529i, this.f18526f, this.f18528h), bVar.V2(this.f18527g, this.f18533m, this.f18534n, this.f18536p));
    }

    public int hashCode() {
        int hashCode = ((((this.f18524d.hashCode() * 31) + this.f18525e.hashCode()) * 31) + this.f18526f.hashCode()) * 31;
        C17642l<P, C16807N> lVar = this.f18527g;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + t.f(this.f18528h)) * 31) + Boolean.hashCode(this.f18529i)) * 31) + this.f18530j) * 31) + this.f18531k) * 31;
        List<C4669d.c<A>> list = this.f18532l;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        C17642l<List<C5669i>, C16807N> lVar2 = this.f18533m;
        int hashCode4 = (hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        g gVar = this.f18534n;
        int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C5753y0 y0Var = this.f18535o;
        int hashCode6 = (hashCode5 + (y0Var != null ? y0Var.hashCode() : 0)) * 31;
        C17642l<b.a, C16807N> lVar3 = this.f18536p;
        if (lVar3 != null) {
            i10 = lVar3.hashCode();
        }
        return hashCode6 + i10;
    }

    private TextAnnotatedStringElement(C4669d dVar, Y y10, C4820m.b bVar, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, List<C4669d.c<A>> list, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C5753y0 y0Var, C17642l<? super b.a, C16807N> lVar3) {
        this.f18524d = dVar;
        this.f18525e = y10;
        this.f18526f = bVar;
        this.f18527g = lVar;
        this.f18528h = i10;
        this.f18529i = z10;
        this.f18530j = i11;
        this.f18531k = i12;
        this.f18532l = list;
        this.f18533m = lVar2;
        this.f18534n = gVar;
        this.f18535o = y0Var;
        this.f18536p = lVar3;
    }
}
