package G8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0014"}, d2 = {"LG8/p;", "T", "", "<init>", "()V", "LG8/j;", "instanceCreator", "a", "(LG8/j;)Ljava/lang/Object;", "item", "LXH/N;", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "LG8/r;", "LG8/r;", "recyclerIn", "recyclerOut", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r<T> f36282a = new r<>();

    /* renamed from: b  reason: collision with root package name */
    private final r<T> f36283b = new r<>();

    public final synchronized T a(j<T> jVar) {
        T a10;
        try {
            C17542s.j(jVar, "instanceCreator");
            q<T> a11 = this.f36283b.a();
            a10 = a11.a();
            if (a10 == null) {
                a10 = jVar.a();
                a11.c(a10);
            }
            this.f36282a.b(a11);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return a10;
    }

    public final synchronized void b(T t10) {
        q<T> a10 = this.f36282a.a();
        a10.c(t10);
        this.f36283b.b(a10);
    }

    public String toString() {
        return "Recycler{in=" + this.f36282a + ", out=" + this.f36283b + '}';
    }
}
