package V5;

import T5.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u0019"}, d2 = {"LV5/c;", "", "model", "LU5/c;", "modelEqualityDelegate", "LT5/r;", "imageLoader", "<init>", "(Ljava/lang/Object;LU5/c;LT5/r;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "LU5/c;", "c", "()LU5/c;", "LT5/r;", "()LT5/r;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f40436a;

    /* renamed from: b  reason: collision with root package name */
    private final U5.c f40437b;

    /* renamed from: c  reason: collision with root package name */
    private final r f40438c;

    public c(Object obj, U5.c cVar, r rVar) {
        this.f40436a = obj;
        this.f40437b = cVar;
        this.f40438c = rVar;
    }

    public final r a() {
        return this.f40438c;
    }

    public final Object b() {
        return this.f40436a;
    }

    public final U5.c c() {
        return this.f40437b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return C17542s.e(this.f40437b, cVar.f40437b) && this.f40437b.c(this.f40436a, cVar.f40436a) && C17542s.e(this.f40438c, cVar.f40438c);
        }
    }

    public int hashCode() {
        return (((this.f40437b.hashCode() * 31) + this.f40437b.b(this.f40436a)) * 31) + this.f40438c.hashCode();
    }
}
