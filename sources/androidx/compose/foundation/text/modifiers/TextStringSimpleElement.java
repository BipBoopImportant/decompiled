package androidx.compose.foundation.text.modifiers;

import G0.k;
import G1.V;
import N1.Y;
import S1.C4820m;
import Y1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5753y0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LG1/V;", "LG0/k;", "", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lp1/y0;", "color", "<init>", "(Ljava/lang/String;LN1/Y;LS1/m$b;IZIILp1/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()LG0/k;", "node", "LXH/N;", "f", "(LG0/k;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "Ljava/lang/String;", "e", "LN1/Y;", "LS1/m$b;", "g", "I", "h", "Z", "i", "j", "k", "Lp1/y0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextStringSimpleElement extends V<k> {

    /* renamed from: d  reason: collision with root package name */
    private final String f18537d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f18538e;

    /* renamed from: f  reason: collision with root package name */
    private final C4820m.b f18539f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18540g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f18541h;

    /* renamed from: i  reason: collision with root package name */
    private final int f18542i;

    /* renamed from: j  reason: collision with root package name */
    private final int f18543j;

    /* renamed from: k  reason: collision with root package name */
    private final C5753y0 f18544k;

    public /* synthetic */ TextStringSimpleElement(String str, Y y10, C4820m.b bVar, int i10, boolean z10, int i11, int i12, C5753y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y10, bVar, i10, z10, i11, i12, y0Var);
    }

    /* renamed from: c */
    public k a() {
        return new k(this.f18537d, this.f18538e, this.f18539f, this.f18540g, this.f18541h, this.f18542i, this.f18543j, this.f18544k, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return C17542s.e(this.f18544k, textStringSimpleElement.f18544k) && C17542s.e(this.f18537d, textStringSimpleElement.f18537d) && C17542s.e(this.f18538e, textStringSimpleElement.f18538e) && C17542s.e(this.f18539f, textStringSimpleElement.f18539f) && t.e(this.f18540g, textStringSimpleElement.f18540g) && this.f18541h == textStringSimpleElement.f18541h && this.f18542i == textStringSimpleElement.f18542i && this.f18543j == textStringSimpleElement.f18543j;
    }

    /* renamed from: f */
    public void b(k kVar) {
        kVar.K2(kVar.P2(this.f18544k, this.f18538e), kVar.R2(this.f18537d), kVar.Q2(this.f18538e, this.f18543j, this.f18542i, this.f18541h, this.f18539f, this.f18540g));
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f18537d.hashCode() * 31) + this.f18538e.hashCode()) * 31) + this.f18539f.hashCode()) * 31) + t.f(this.f18540g)) * 31) + Boolean.hashCode(this.f18541h)) * 31) + this.f18542i) * 31) + this.f18543j) * 31;
        C5753y0 y0Var = this.f18544k;
        return hashCode + (y0Var != null ? y0Var.hashCode() : 0);
    }

    private TextStringSimpleElement(String str, Y y10, C4820m.b bVar, int i10, boolean z10, int i11, int i12, C5753y0 y0Var) {
        this.f18537d = str;
        this.f18538e = y10;
        this.f18539f = bVar;
        this.f18540g = i10;
        this.f18541h = z10;
        this.f18542i = i11;
        this.f18543j = i12;
        this.f18544k = y0Var;
    }
}
