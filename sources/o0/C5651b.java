package o0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lo0/b;", "", "Lp1/v0;", "backgroundColor", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "b", "e", "c", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.b  reason: case insensitive filesystem */
public final class C5651b {

    /* renamed from: a  reason: collision with root package name */
    private final long f26616a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26617b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26618c;

    /* renamed from: d  reason: collision with root package name */
    private final long f26619d;

    /* renamed from: e  reason: collision with root package name */
    private final long f26620e;

    public /* synthetic */ C5651b(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f26616a;
    }

    public final long b() {
        return this.f26620e;
    }

    public final long c() {
        return this.f26619d;
    }

    public final long d() {
        return this.f26618c;
    }

    public final long e() {
        return this.f26617b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5651b)) {
            return false;
        }
        C5651b bVar = (C5651b) obj;
        return C5747v0.q(this.f26616a, bVar.f26616a) && C5747v0.q(this.f26617b, bVar.f26617b) && C5747v0.q(this.f26618c, bVar.f26618c) && C5747v0.q(this.f26619d, bVar.f26619d) && C5747v0.q(this.f26620e, bVar.f26620e);
    }

    public int hashCode() {
        return (((((((C5747v0.w(this.f26616a) * 31) + C5747v0.w(this.f26617b)) * 31) + C5747v0.w(this.f26618c)) * 31) + C5747v0.w(this.f26619d)) * 31) + C5747v0.w(this.f26620e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + C5747v0.x(this.f26616a) + ", textColor=" + C5747v0.x(this.f26617b) + ", iconColor=" + C5747v0.x(this.f26618c) + ", disabledTextColor=" + C5747v0.x(this.f26619d) + ", disabledIconColor=" + C5747v0.x(this.f26620e) + ')';
    }

    private C5651b(long j10, long j11, long j12, long j13, long j14) {
        this.f26616a = j10;
        this.f26617b = j11;
        this.f26618c = j12;
        this.f26619d = j13;
        this.f26620e = j14;
    }
}
