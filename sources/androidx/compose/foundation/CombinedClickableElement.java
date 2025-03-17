package androidx.compose.foundation;

import G1.V;
import L1.i;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010+\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "LG1/V;", "Landroidx/compose/foundation/f;", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "<init>", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;Ljava/lang/String;LnI/a;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/f;", "node", "f", "(Landroidx/compose/foundation/f;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lr0/m;", "e", "Ln0/I;", "Z", "g", "Ljava/lang/String;", "h", "LL1/i;", "i", "LnI/a;", "j", "k", "l", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CombinedClickableElement extends V<f> {

    /* renamed from: d  reason: collision with root package name */
    private final m f17490d;

    /* renamed from: e  reason: collision with root package name */
    private final C5586I f17491e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17492f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17493g;

    /* renamed from: h  reason: collision with root package name */
    private final i f17494h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f17495i;

    /* renamed from: j  reason: collision with root package name */
    private final String f17496j;

    /* renamed from: k  reason: collision with root package name */
    private final C17631a<C16807N> f17497k;

    /* renamed from: l  reason: collision with root package name */
    private final C17631a<C16807N> f17498l;

    public /* synthetic */ CombinedClickableElement(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a aVar, String str2, C17631a aVar2, C17631a aVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, i10, z10, str, iVar, aVar, str2, aVar2, aVar3);
    }

    /* renamed from: c */
    public f a() {
        return new f(this.f17495i, this.f17496j, this.f17497k, this.f17498l, this.f17490d, this.f17491e, this.f17492f, this.f17493g, this.f17494h, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return C17542s.e(this.f17490d, combinedClickableElement.f17490d) && C17542s.e(this.f17491e, combinedClickableElement.f17491e) && this.f17492f == combinedClickableElement.f17492f && C17542s.e(this.f17493g, combinedClickableElement.f17493g) && C17542s.e(this.f17494h, combinedClickableElement.f17494h) && this.f17495i == combinedClickableElement.f17495i && C17542s.e(this.f17496j, combinedClickableElement.f17496j) && this.f17497k == combinedClickableElement.f17497k && this.f17498l == combinedClickableElement.f17498l;
    }

    /* renamed from: f */
    public void b(f fVar) {
        fVar.d3(this.f17495i, this.f17496j, this.f17497k, this.f17498l, this.f17490d, this.f17491e, this.f17492f, this.f17493g, this.f17494h);
    }

    public int hashCode() {
        m mVar = this.f17490d;
        int i10 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        C5586I i11 = this.f17491e;
        int hashCode2 = (((hashCode + (i11 != null ? i11.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17492f)) * 31;
        String str = this.f17493g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        i iVar = this.f17494h;
        int l10 = (((hashCode3 + (iVar != null ? i.l(iVar.n()) : 0)) * 31) + this.f17495i.hashCode()) * 31;
        String str2 = this.f17496j;
        int hashCode4 = (l10 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C17631a<C16807N> aVar = this.f17497k;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C17631a<C16807N> aVar2 = this.f17498l;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return hashCode5 + i10;
    }

    private CombinedClickableElement(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a<C16807N> aVar, String str2, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
        this.f17490d = mVar;
        this.f17491e = i10;
        this.f17492f = z10;
        this.f17493g = str;
        this.f17494h = iVar;
        this.f17495i = aVar;
        this.f17496j = str2;
        this.f17497k = aVar2;
        this.f17498l = aVar3;
    }
}
