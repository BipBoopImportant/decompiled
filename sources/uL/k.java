package UL;

import GK.C15775C;
import GK.C15777E;
import QL.h;
import QL.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class k extends h.a {
    private k() {
    }

    public static k f() {
        return new k();
    }

    public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C16642a.f139261a;
        }
        return null;
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == String.class) {
            return j.f139271a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C16643b.f139263a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C16644c.f139264a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C16645d.f139265a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C16646e.f139266a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.f139267a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.f139268a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.f139269a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.f139270a;
        }
        return null;
    }
}
