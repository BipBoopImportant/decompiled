package wK;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5834E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/V5;", "", "Ls0/E;", "paddingValues", "Lc2/h;", "spacing", "<init>", "(Ls0/E;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls0/E;", "()Ls0/E;", "b", "F", "()F", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class V5 {

    /* renamed from: a  reason: collision with root package name */
    private final C5834E f150274a;

    /* renamed from: b  reason: collision with root package name */
    private final float f150275b;

    public /* synthetic */ V5(C5834E e10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, f10);
    }

    public final C5834E a() {
        return this.f150274a;
    }

    public final float b() {
        return this.f150275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5)) {
            return false;
        }
        V5 v52 = (V5) obj;
        return C17542s.e(this.f150274a, v52.f150274a) && h.D(this.f150275b, v52.f150275b);
    }

    public int hashCode() {
        return (this.f150274a.hashCode() * 31) + h.E(this.f150275b);
    }

    public String toString() {
        C5834E e10 = this.f150274a;
        String F10 = h.F(this.f150275b);
        return "ModalsActionFooterStyle(paddingValues=" + e10 + ", spacing=" + F10 + ")";
    }

    private V5(C5834E e10, float f10) {
        C17542s.j(e10, "paddingValues");
        this.f150274a = e10;
        this.f150275b = f10;
    }
}
