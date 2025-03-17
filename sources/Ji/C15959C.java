package JI;

import AI.C15432m;
import TI.C16497a;
import TI.v;
import YH.C16877v;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;

/* renamed from: JI.C  reason: case insensitive filesystem */
public final class C15959C extends E implements v {

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f135747b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<C16497a> f135748c = C16877v.n();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f135749d;

    public C15959C(Class<?> cls) {
        C17542s.j(cls, "reflectType");
        this.f135747b = cls;
    }

    public boolean E() {
        return this.f135749d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public Class<?> R() {
        return this.f135747b;
    }

    public Collection<C16497a> getAnnotations() {
        return this.f135748c;
    }

    public C15432m getType() {
        if (C17542s.e(R(), Void.TYPE)) {
            return null;
        }
        return C17558e.j(R().getName()).v();
    }
}
