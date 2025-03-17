package y8;

import b9.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly8/a;", "", "", "timestamp", "Lb9/h;", "data", "<init>", "(JLb9/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Lb9/h;", "()Lb9/h;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y8.a  reason: case insensitive filesystem */
public final class C8992a {

    /* renamed from: a  reason: collision with root package name */
    private final long f57990a;

    /* renamed from: b  reason: collision with root package name */
    private final h f57991b;

    public C8992a(long j10, h hVar) {
        C17542s.j(hVar, "data");
        this.f57990a = j10;
        this.f57991b = hVar;
    }

    public final h a() {
        return this.f57991b;
    }

    public final long b() {
        return this.f57990a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8992a)) {
            return false;
        }
        C8992a aVar = (C8992a) obj;
        return this.f57990a == aVar.f57990a && C17542s.e(this.f57991b, aVar.f57991b);
    }

    public int hashCode() {
        return this.f57991b.hashCode() + (Long.hashCode(this.f57990a) * 31);
    }

    public String toString() {
        return "CrashWrapped(timestamp=" + this.f57990a + ", data=" + this.f57991b + ')';
    }
}
