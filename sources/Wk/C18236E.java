package wK;

import N1.Y;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LwK/E;", "", "LwK/Q1;", "colors", "Lc2/h;", "size", "LN1/Y;", "textStyle", "<init>", "(LwK/Q1;FLN1/Y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/Q1;", "()LwK/Q1;", "b", "F", "()F", "c", "LN1/Y;", "()LN1/Y;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.E  reason: case insensitive filesystem */
final class C18236E {

    /* renamed from: a  reason: collision with root package name */
    private final Q1 f149438a;

    /* renamed from: b  reason: collision with root package name */
    private final float f149439b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f149440c;

    public /* synthetic */ C18236E(Q1 q12, float f10, Y y10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q12, f10, y10);
    }

    public final Q1 a() {
        return this.f149438a;
    }

    public final float b() {
        return this.f149439b;
    }

    public final Y c() {
        return this.f149440c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18236E)) {
            return false;
        }
        C18236E e10 = (C18236E) obj;
        return C17542s.e(this.f149438a, e10.f149438a) && h.D(this.f149439b, e10.f149439b) && C17542s.e(this.f149440c, e10.f149440c);
    }

    public int hashCode() {
        return (((this.f149438a.hashCode() * 31) + h.E(this.f149439b)) * 31) + this.f149440c.hashCode();
    }

    public String toString() {
        Q1 q12 = this.f149438a;
        String F10 = h.F(this.f149439b);
        Y y10 = this.f149440c;
        return "AvatarStyling(colors=" + q12 + ", size=" + F10 + ", textStyle=" + y10 + ")";
    }

    private C18236E(Q1 q12, float f10, Y y10) {
        C17542s.j(q12, "colors");
        C17542s.j(y10, "textStyle");
        this.f149438a = q12;
        this.f149439b = f10;
        this.f149440c = y10;
    }
}
