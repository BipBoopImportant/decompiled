package wK;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5834E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LwK/u3;", "", "Ls0/E;", "paddingValues", "Lc2/h;", "xOffset", "<init>", "(Ls0/E;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Ls0/E;", "b", "()F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls0/E;", "getPaddingValues", "F", "getXOffset-D9Ej5fM", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.u3  reason: case insensitive filesystem */
final class C18501u3 {

    /* renamed from: a  reason: collision with root package name */
    private final C5834E f151674a;

    /* renamed from: b  reason: collision with root package name */
    private final float f151675b;

    public /* synthetic */ C18501u3(C5834E e10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, f10);
    }

    public final C5834E a() {
        return this.f151674a;
    }

    public final float b() {
        return this.f151675b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18501u3)) {
            return false;
        }
        C18501u3 u3Var = (C18501u3) obj;
        return C17542s.e(this.f151674a, u3Var.f151674a) && h.D(this.f151675b, u3Var.f151675b);
    }

    public int hashCode() {
        return (this.f151674a.hashCode() * 31) + h.E(this.f151675b);
    }

    public String toString() {
        C5834E e10 = this.f151674a;
        String F10 = h.F(this.f151675b);
        return "IconValues(paddingValues=" + e10 + ", xOffset=" + F10 + ")";
    }

    private C18501u3(C5834E e10, float f10) {
        C17542s.j(e10, "paddingValues");
        this.f151674a = e10;
        this.f151675b = f10;
    }
}
