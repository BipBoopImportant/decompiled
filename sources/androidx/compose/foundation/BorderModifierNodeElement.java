package androidx.compose.foundation;

import G1.V;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5600f;
import p1.C5728l0;
import p1.i1;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LG1/V;", "Ln0/f;", "Lc2/h;", "width", "Lp1/l0;", "brush", "Lp1/i1;", "shape", "<init>", "(FLp1/l0;Lp1/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Ln0/f;", "node", "LXH/N;", "f", "(Ln0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "F", "getWidth-D9Ej5fM", "()F", "e", "Lp1/l0;", "getBrush", "()Lp1/l0;", "Lp1/i1;", "getShape", "()Lp1/i1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BorderModifierNodeElement extends V<C5600f> {

    /* renamed from: d  reason: collision with root package name */
    private final float f17481d;

    /* renamed from: e  reason: collision with root package name */
    private final C5728l0 f17482e;

    /* renamed from: f  reason: collision with root package name */
    private final i1 f17483f;

    public /* synthetic */ BorderModifierNodeElement(float f10, C5728l0 l0Var, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, l0Var, i1Var);
    }

    /* renamed from: c */
    public C5600f a() {
        return new C5600f(this.f17481d, this.f17482e, this.f17483f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return h.D(this.f17481d, borderModifierNodeElement.f17481d) && C17542s.e(this.f17482e, borderModifierNodeElement.f17482e) && C17542s.e(this.f17483f, borderModifierNodeElement.f17483f);
    }

    /* renamed from: f */
    public void b(C5600f fVar) {
        fVar.Q2(this.f17481d);
        fVar.P2(this.f17482e);
        fVar.Z(this.f17483f);
    }

    public int hashCode() {
        return (((h.E(this.f17481d) * 31) + this.f17482e.hashCode()) * 31) + this.f17483f.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + h.F(this.f17481d) + ", brush=" + this.f17482e + ", shape=" + this.f17483f + ')';
    }

    private BorderModifierNodeElement(float f10, C5728l0 l0Var, i1 i1Var) {
        this.f17481d = f10;
        this.f17482e = l0Var;
        this.f17483f = i1Var;
    }
}
