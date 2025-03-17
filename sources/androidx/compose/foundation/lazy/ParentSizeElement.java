package androidx.compose.foundation.lazy;

import G1.V;
import U0.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "LG1/V;", "Landroidx/compose/foundation/lazy/b;", "", "fraction", "LU0/A1;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLU0/A1;LU0/A1;Ljava/lang/String;)V", "c", "()Landroidx/compose/foundation/lazy/b;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/lazy/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "F", "getFraction", "()F", "e", "LU0/A1;", "getWidthState", "()LU0/A1;", "getHeightState", "g", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ParentSizeElement extends V<b> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18246d;

    /* renamed from: e  reason: collision with root package name */
    private final A1<Integer> f18247e;

    /* renamed from: f  reason: collision with root package name */
    private final A1<Integer> f18248f;

    /* renamed from: g  reason: collision with root package name */
    private final String f18249g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentSizeElement(float f10, A1 a12, A1 a13, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : a12, (i10 & 4) != 0 ? null : a13, str);
    }

    /* renamed from: c */
    public b a() {
        return new b(this.f18246d, this.f18247e, this.f18248f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f18246d == parentSizeElement.f18246d && C17542s.e(this.f18247e, parentSizeElement.f18247e) && C17542s.e(this.f18248f, parentSizeElement.f18248f);
    }

    /* renamed from: f */
    public void b(b bVar) {
        bVar.C2(this.f18246d);
        bVar.E2(this.f18247e);
        bVar.D2(this.f18248f);
    }

    public int hashCode() {
        A1<Integer> a12 = this.f18247e;
        int i10 = 0;
        int hashCode = (a12 != null ? a12.hashCode() : 0) * 31;
        A1<Integer> a13 = this.f18248f;
        if (a13 != null) {
            i10 = a13.hashCode();
        }
        return ((hashCode + i10) * 31) + Float.hashCode(this.f18246d);
    }

    public ParentSizeElement(float f10, A1<Integer> a12, A1<Integer> a13, String str) {
        this.f18246d = f10;
        this.f18247e = a12;
        this.f18248f = a13;
        this.f18249g = str;
    }
}
