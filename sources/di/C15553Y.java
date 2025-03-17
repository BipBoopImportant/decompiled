package DI;

import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.E0;

/* renamed from: DI.Y  reason: case insensitive filesystem */
public final class C15553Y {

    /* renamed from: a  reason: collision with root package name */
    private final C15562i f133826a;

    /* renamed from: b  reason: collision with root package name */
    private final List<E0> f133827b;

    /* renamed from: c  reason: collision with root package name */
    private final C15553Y f133828c;

    public C15553Y(C15562i iVar, List<? extends E0> list, C15553Y y10) {
        C17542s.j(iVar, "classifierDescriptor");
        C17542s.j(list, "arguments");
        this.f133826a = iVar;
        this.f133827b = list;
        this.f133828c = y10;
    }

    public final List<E0> a() {
        return this.f133827b;
    }

    public final C15562i b() {
        return this.f133826a;
    }

    public final C15553Y c() {
        return this.f133828c;
    }
}
