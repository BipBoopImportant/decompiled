package JI;

import JI.E;
import TI.n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C17542s;

public final class w extends y implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Field f135803a;

    public w(Field field) {
        C17542s.j(field, "member");
        this.f135803a = field;
    }

    public boolean K() {
        return S().isEnumConstant();
    }

    public boolean P() {
        return false;
    }

    /* renamed from: U */
    public Field S() {
        return this.f135803a;
    }

    /* renamed from: V */
    public E getType() {
        E.a aVar = E.f135751a;
        Type genericType = S().getGenericType();
        C17542s.i(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
