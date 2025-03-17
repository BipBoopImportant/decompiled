package l6;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll6/d;", "Ll6/j;", "Ll6/h;", "size", "<init>", "(Ll6/h;)V", "b", "(LdI/e;)Ljava/lang/Object;", "d", "Ll6/h;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements j {

    /* renamed from: d  reason: collision with root package name */
    private final h f54762d;

    public d(h hVar) {
        this.f54762d = hVar;
    }

    public Object b(C17164e<? super h> eVar) {
        return this.f54762d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C17542s.e(this.f54762d, ((d) obj).f54762d);
    }

    public int hashCode() {
        return this.f54762d.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f54762d + ')';
    }
}
