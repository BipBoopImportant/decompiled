package I0;

import A0.a;
import A0.g;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"LI0/A0;", "", "LA0/a;", "small", "medium", "large", "<init>", "(LA0/a;LA0/a;LA0/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LA0/a;", "c", "()LA0/a;", "b", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class A0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f7128a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7129b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7130c;

    public A0() {
        this((a) null, (a) null, (a) null, 7, (DefaultConstructorMarker) null);
    }

    public final a a() {
        return this.f7130c;
    }

    public final a b() {
        return this.f7129b;
    }

    public final a c() {
        return this.f7128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return C17542s.e(this.f7128a, a02.f7128a) && C17542s.e(this.f7129b, a02.f7129b) && C17542s.e(this.f7130c, a02.f7130c);
    }

    public int hashCode() {
        return (((this.f7128a.hashCode() * 31) + this.f7129b.hashCode()) * 31) + this.f7130c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f7128a + ", medium=" + this.f7129b + ", large=" + this.f7130c + ')';
    }

    public A0(a aVar, a aVar2, a aVar3) {
        this.f7128a = aVar;
        this.f7129b = aVar2;
        this.f7130c = aVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(a aVar, a aVar2, a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g.e(h.B((float) 4)) : aVar, (i10 & 2) != 0 ? g.e(h.B((float) 4)) : aVar2, (i10 & 4) != 0 ? g.e(h.B((float) 0)) : aVar3);
    }
}
