package wK;

import N1.Y;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import s0.C5834E;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001f\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, d2 = {"LwK/E0;", "", "LN1/Y;", "title", "label", "content", "Lp1/v0;", "backgroundColor", "Ls0/E;", "contentPadding", "Lc2/h;", "buttonSpacing", "<init>", "(LN1/Y;LN1/Y;LN1/Y;JLs0/E;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/Y;", "f", "()LN1/Y;", "b", "e", "c", "d", "J", "()J", "Ls0/E;", "()Ls0/E;", "F", "()F", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class E0 {

    /* renamed from: a  reason: collision with root package name */
    private final Y f149441a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f149442b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f149443c;

    /* renamed from: d  reason: collision with root package name */
    private final long f149444d;

    /* renamed from: e  reason: collision with root package name */
    private final C5834E f149445e;

    /* renamed from: f  reason: collision with root package name */
    private final float f149446f;

    public /* synthetic */ E0(Y y10, Y y11, Y y12, long j10, C5834E e10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y10, y11, y12, j10, e10, f10);
    }

    public final long a() {
        return this.f149444d;
    }

    public final float b() {
        return this.f149446f;
    }

    public final Y c() {
        return this.f149443c;
    }

    public final C5834E d() {
        return this.f149445e;
    }

    public final Y e() {
        return this.f149442b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return C17542s.e(this.f149441a, e02.f149441a) && C17542s.e(this.f149442b, e02.f149442b) && C17542s.e(this.f149443c, e02.f149443c) && C5747v0.q(this.f149444d, e02.f149444d) && C17542s.e(this.f149445e, e02.f149445e) && h.D(this.f149446f, e02.f149446f);
    }

    public final Y f() {
        return this.f149441a;
    }

    public int hashCode() {
        return (((((((((this.f149441a.hashCode() * 31) + this.f149442b.hashCode()) * 31) + this.f149443c.hashCode()) * 31) + C5747v0.w(this.f149444d)) * 31) + this.f149445e.hashCode()) * 31) + h.E(this.f149446f);
    }

    public String toString() {
        Y y10 = this.f149441a;
        Y y11 = this.f149442b;
        Y y12 = this.f149443c;
        String x10 = C5747v0.x(this.f149444d);
        C5834E e10 = this.f149445e;
        String F10 = h.F(this.f149446f);
        return "CardStyle(title=" + y10 + ", label=" + y11 + ", content=" + y12 + ", backgroundColor=" + x10 + ", contentPadding=" + e10 + ", buttonSpacing=" + F10 + ")";
    }

    private E0(Y y10, Y y11, Y y12, long j10, C5834E e10, float f10) {
        C17542s.j(y10, "title");
        C17542s.j(y11, "label");
        C17542s.j(y12, "content");
        C17542s.j(e10, "contentPadding");
        this.f149441a = y10;
        this.f149442b = y11;
        this.f149443c = y12;
        this.f149444d = j10;
        this.f149445e = e10;
        this.f149446f = f10;
    }
}
