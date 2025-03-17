package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"LwK/q7;", "", "Lp1/v0;", "backgroundColor", "LN1/Y;", "labelTextStyle", "identifierTextStyle", "<init>", "(JLN1/Y;LN1/Y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "LN1/Y;", "c", "()LN1/Y;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.q7  reason: case insensitive filesystem */
public final class C18457q7 {

    /* renamed from: a  reason: collision with root package name */
    private final long f151447a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f151448b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f151449c;

    public /* synthetic */ C18457q7(long j10, Y y10, Y y11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, y10, y11);
    }

    public final long a() {
        return this.f151447a;
    }

    public final Y b() {
        return this.f151449c;
    }

    public final Y c() {
        return this.f151448b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18457q7)) {
            return false;
        }
        C18457q7 q7Var = (C18457q7) obj;
        return C5747v0.q(this.f151447a, q7Var.f151447a) && C17542s.e(this.f151448b, q7Var.f151448b) && C17542s.e(this.f151449c, q7Var.f151449c);
    }

    public int hashCode() {
        return (((C5747v0.w(this.f151447a) * 31) + this.f151448b.hashCode()) * 31) + this.f151449c.hashCode();
    }

    public String toString() {
        String x10 = C5747v0.x(this.f151447a);
        Y y10 = this.f151448b;
        Y y11 = this.f151449c;
        return "ProductIdentifierStyle(backgroundColor=" + x10 + ", labelTextStyle=" + y10 + ", identifierTextStyle=" + y11 + ")";
    }

    private C18457q7(long j10, Y y10, Y y11) {
        C17542s.j(y10, "labelTextStyle");
        C17542s.j(y11, "identifierTextStyle");
        this.f151447a = j10;
        this.f151448b = y10;
        this.f151449c = y11;
    }
}
