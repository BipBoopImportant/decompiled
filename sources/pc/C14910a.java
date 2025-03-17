package pC;

import YH.C16877v;
import YH.X;
import gp.C11343b;
import gp.C11346e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"LpC/a;", "", "<init>", "()V", "", "Lgp/b;", "tasks", "LXH/N;", "b", "(Ljava/util/Set;)V", "Lgp/e;", "taskId", "a", "(Lgp/e;)Lgp/b;", "", "Ljava/util/Map;", "taskMap", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pC.a  reason: case insensitive filesystem */
public final class C14910a {

    /* renamed from: a  reason: collision with root package name */
    private Map<C11346e, ? extends C11343b> f130259a = new LinkedHashMap();

    public final C11343b a(C11346e eVar) {
        C17542s.j(eVar, "taskId");
        return (C11343b) this.f130259a.get(eVar);
    }

    public final void b(Set<? extends C11343b> set) {
        C17542s.j(set, "tasks");
        Iterable iterable = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((C11343b) next).a(), next);
        }
        this.f130259a = linkedHashMap;
    }
}
