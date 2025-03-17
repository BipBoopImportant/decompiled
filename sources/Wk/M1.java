package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import s0.C5834E;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"LwK/M1;", "", "Lp1/v0;", "backgroundColor", "LN1/Y;", "textStyle", "Ls0/E;", "paddingValues", "<init>", "(JLN1/Y;Ls0/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "LN1/Y;", "c", "()LN1/Y;", "Ls0/E;", "()Ls0/E;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f149817a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f149818b;

    /* renamed from: c  reason: collision with root package name */
    private final C5834E f149819c;

    public /* synthetic */ M1(long j10, Y y10, C5834E e10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, y10, e10);
    }

    public final long a() {
        return this.f149817a;
    }

    public final C5834E b() {
        return this.f149819c;
    }

    public final Y c() {
        return this.f149818b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M1)) {
            return false;
        }
        M1 m12 = (M1) obj;
        return C5747v0.q(this.f149817a, m12.f149817a) && C17542s.e(this.f149818b, m12.f149818b) && C17542s.e(this.f149819c, m12.f149819c);
    }

    public int hashCode() {
        return (((C5747v0.w(this.f149817a) * 31) + this.f149818b.hashCode()) * 31) + this.f149819c.hashCode();
    }

    public String toString() {
        String x10 = C5747v0.x(this.f149817a);
        Y y10 = this.f149818b;
        C5834E e10 = this.f149819c;
        return "CommercialMessageStyle(backgroundColor=" + x10 + ", textStyle=" + y10 + ", paddingValues=" + e10 + ")";
    }

    private M1(long j10, Y y10, C5834E e10) {
        C17542s.j(y10, "textStyle");
        C17542s.j(e10, "paddingValues");
        this.f149817a = j10;
        this.f149818b = y10;
        this.f149819c = e10;
    }
}
