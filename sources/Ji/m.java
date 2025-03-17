package JI;

import JI.E;
import TI.C16497a;
import TI.C16502f;
import YH.C16877v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;

public final class m extends E implements C16502f {

    /* renamed from: b  reason: collision with root package name */
    private final Type f135785b;

    /* renamed from: c  reason: collision with root package name */
    private final E f135786c;

    /* renamed from: d  reason: collision with root package name */
    private final Collection<C16497a> f135787d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f135788e;

    public m(Type type) {
        E e10;
        C17542s.j(type, "reflectType");
        this.f135785b = type;
        Type R10 = R();
        if (R10 instanceof GenericArrayType) {
            E.a aVar = E.f135751a;
            Type genericComponentType = ((GenericArrayType) R10).getGenericComponentType();
            C17542s.i(genericComponentType, "getGenericComponentType(...)");
            e10 = aVar.a(genericComponentType);
        } else {
            if (R10 instanceof Class) {
                Class cls = (Class) R10;
                if (cls.isArray()) {
                    E.a aVar2 = E.f135751a;
                    Class<?> componentType = cls.getComponentType();
                    C17542s.i(componentType, "getComponentType(...)");
                    e10 = aVar2.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + R().getClass() + "): " + R());
        }
        this.f135786c = e10;
        this.f135787d = C16877v.n();
    }

    public boolean E() {
        return this.f135788e;
    }

    /* access modifiers changed from: protected */
    public Type R() {
        return this.f135785b;
    }

    /* renamed from: S */
    public E n() {
        return this.f135786c;
    }

    public Collection<C16497a> getAnnotations() {
        return this.f135787d;
    }
}
