package P0;

import e5.C7786b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LP0/e;", "", "Le5/b;", "windowSizeClass", "LP0/d;", "windowPosture", "<init>", "(Le5/b;LP0/d;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Le5/b;", "()Le5/b;", "b", "LP0/d;", "getWindowPosture", "()LP0/d;", "adaptive_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final C7786b f11831a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11832b;

    public e(C7786b bVar, d dVar) {
        this.f11831a = bVar;
        this.f11832b = dVar;
    }

    public final C7786b a() {
        return this.f11831a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f11831a, eVar.f11831a) && C17542s.e(this.f11832b, eVar.f11832b);
    }

    public int hashCode() {
        return (this.f11831a.hashCode() * 31) + this.f11832b.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f11831a + ", windowPosture=" + this.f11832b + ')';
    }
}
