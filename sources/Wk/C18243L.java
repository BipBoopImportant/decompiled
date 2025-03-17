package wK;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import n0.C5602h;
import p1.C5747v0;
import s0.C5834E;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"LwK/L;", "", "Lp1/v0;", "backgroundColor", "contentColor", "Ln0/g;", "border", "Ls0/E;", "paddings", "<init>", "(JJLn0/g;Ls0/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "Ln0/g;", "()Ln0/g;", "d", "Ls0/E;", "()Ls0/E;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.L  reason: case insensitive filesystem */
public final class C18243L {

    /* renamed from: a  reason: collision with root package name */
    private final long f149754a;

    /* renamed from: b  reason: collision with root package name */
    private final long f149755b;

    /* renamed from: c  reason: collision with root package name */
    private final C5601g f149756c;

    /* renamed from: d  reason: collision with root package name */
    private final C5834E f149757d;

    public /* synthetic */ C18243L(long j10, long j11, C5601g gVar, C5834E e10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, gVar, e10);
    }

    public final long a() {
        return this.f149754a;
    }

    public final C5601g b() {
        return this.f149756c;
    }

    public final long c() {
        return this.f149755b;
    }

    public final C5834E d() {
        return this.f149757d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18243L)) {
            return false;
        }
        C18243L l10 = (C18243L) obj;
        return C5747v0.q(this.f149754a, l10.f149754a) && C5747v0.q(this.f149755b, l10.f149755b) && C17542s.e(this.f149756c, l10.f149756c) && C17542s.e(this.f149757d, l10.f149757d);
    }

    public int hashCode() {
        return (((((C5747v0.w(this.f149754a) * 31) + C5747v0.w(this.f149755b)) * 31) + this.f149756c.hashCode()) * 31) + this.f149757d.hashCode();
    }

    public String toString() {
        String x10 = C5747v0.x(this.f149754a);
        String x11 = C5747v0.x(this.f149755b);
        C5601g gVar = this.f149756c;
        C5834E e10 = this.f149757d;
        return "BadgeStyle(backgroundColor=" + x10 + ", contentColor=" + x11 + ", border=" + gVar + ", paddings=" + e10 + ")";
    }

    private C18243L(long j10, long j11, C5601g gVar, C5834E e10) {
        C17542s.j(gVar, "border");
        C17542s.j(e10, "paddings");
        this.f149754a = j10;
        this.f149755b = j11;
        this.f149756c = gVar;
        this.f149757d = e10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18243L(long j10, long j11, C5601g gVar, C5834E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, (i10 & 4) != 0 ? C5602h.a(h.B((float) 0), C5747v0.f27350b.h()) : gVar, e10, (DefaultConstructorMarker) null);
    }
}
