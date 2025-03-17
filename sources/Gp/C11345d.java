package gp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgp/d;", "", "", "Lgp/e;", "taskIds", "Lgp/a;", "executionMode", "<init>", "(Ljava/util/List;Lgp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lgp/a;", "()Lgp/a;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gp.d  reason: case insensitive filesystem */
public final class C11345d {

    /* renamed from: a  reason: collision with root package name */
    private final List<C11346e> f97926a;

    /* renamed from: b  reason: collision with root package name */
    private final C11342a f97927b;

    public C11345d(List<? extends C11346e> list, C11342a aVar) {
        C17542s.j(list, "taskIds");
        C17542s.j(aVar, "executionMode");
        this.f97926a = list;
        this.f97927b = aVar;
    }

    public final C11342a a() {
        return this.f97927b;
    }

    public final List<C11346e> b() {
        return this.f97926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11345d)) {
            return false;
        }
        C11345d dVar = (C11345d) obj;
        return C17542s.e(this.f97926a, dVar.f97926a) && this.f97927b == dVar.f97927b;
    }

    public int hashCode() {
        return (this.f97926a.hashCode() * 31) + this.f97927b.hashCode();
    }

    public String toString() {
        List<C11346e> list = this.f97926a;
        C11342a aVar = this.f97927b;
        return "TaskGroup(taskIds=" + list + ", executionMode=" + aVar + ")";
    }
}
