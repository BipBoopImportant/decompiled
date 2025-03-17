package GI;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: GI.C  reason: case insensitive filesystem */
public final class C15709C implements C15708B {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15712F> f134478a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C15712F> f134479b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C15712F> f134480c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<C15712F> f134481d;

    public C15709C(List<C15712F> list, Set<C15712F> set, List<C15712F> list2, Set<C15712F> set2) {
        C17542s.j(list, "allDependencies");
        C17542s.j(set, "modulesWhoseInternalsAreVisible");
        C17542s.j(list2, "directExpectedByDependencies");
        C17542s.j(set2, "allExpectedByDependencies");
        this.f134478a = list;
        this.f134479b = set;
        this.f134480c = list2;
        this.f134481d = set2;
    }

    public List<C15712F> a() {
        return this.f134478a;
    }

    public List<C15712F> b() {
        return this.f134480c;
    }

    public Set<C15712F> c() {
        return this.f134479b;
    }
}
