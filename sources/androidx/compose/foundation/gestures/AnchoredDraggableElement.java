package androidx.compose.foundation.gestures;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.T;
import p0.C5685c;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BK\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "LG1/V;", "Landroidx/compose/foundation/gestures/b;", "Lp0/c;", "state", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "startDragImmediately", "Ln0/T;", "overscrollEffect", "<init>", "(Lp0/c;Lp0/v;ZLjava/lang/Boolean;Lr0/m;ZLn0/T;)V", "c", "()Landroidx/compose/foundation/gestures/b;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/gestures/b;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lp0/c;", "e", "Lp0/v;", "Z", "g", "Ljava/lang/Boolean;", "h", "Lr0/m;", "i", "j", "Ln0/T;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AnchoredDraggableElement<T> extends V<b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private final C5685c<T> f17641d;

    /* renamed from: e  reason: collision with root package name */
    private final v f17642e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17643f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f17644g;

    /* renamed from: h  reason: collision with root package name */
    private final m f17645h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17646i;

    /* renamed from: j  reason: collision with root package name */
    private final T f17647j;

    public AnchoredDraggableElement(C5685c<T> cVar, v vVar, boolean z10, Boolean bool, m mVar, boolean z11, T t10) {
        this.f17641d = cVar;
        this.f17642e = vVar;
        this.f17643f = z10;
        this.f17644g = bool;
        this.f17645h = mVar;
        this.f17646i = z11;
        this.f17647j = t10;
    }

    /* renamed from: c */
    public b<T> a() {
        return new b(this.f17641d, this.f17642e, this.f17643f, this.f17644g, this.f17645h, this.f17647j, this.f17646i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return C17542s.e(this.f17641d, anchoredDraggableElement.f17641d) && this.f17642e == anchoredDraggableElement.f17642e && this.f17643f == anchoredDraggableElement.f17643f && C17542s.e(this.f17644g, anchoredDraggableElement.f17644g) && C17542s.e(this.f17645h, anchoredDraggableElement.f17645h) && this.f17646i == anchoredDraggableElement.f17646i && C17542s.e(this.f17647j, anchoredDraggableElement.f17647j);
    }

    /* renamed from: f */
    public void b(b<T> bVar) {
        bVar.t3(this.f17641d, this.f17642e, this.f17643f, this.f17644g, this.f17645h, this.f17647j, this.f17646i);
    }

    public int hashCode() {
        int hashCode = ((((this.f17641d.hashCode() * 31) + this.f17642e.hashCode()) * 31) + Boolean.hashCode(this.f17643f)) * 31;
        Boolean bool = this.f17644g;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        m mVar = this.f17645h;
        int hashCode3 = (((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17646i)) * 31;
        T t10 = this.f17647j;
        if (t10 != null) {
            i10 = t10.hashCode();
        }
        return hashCode3 + i10;
    }
}
