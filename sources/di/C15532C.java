package DI;

import kotlin.jvm.internal.C17542s;

/* renamed from: DI.C  reason: case insensitive filesystem */
public final class C15532C {

    /* renamed from: a  reason: collision with root package name */
    private static final C15537H<C15533D> f133808a = new C15537H<>("InvalidModuleNotifier");

    public static final void a(C15538I i10) {
        C17542s.j(i10, "<this>");
        C15533D d10 = (C15533D) i10.l0(f133808a);
        if (d10 != null) {
            d10.a(i10);
            return;
        }
        throw new C15531B("Accessing invalid module descriptor " + i10);
    }
}
