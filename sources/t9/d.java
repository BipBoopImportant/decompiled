package T9;

import K9.C6620s;
import T9.b;
import android.os.IBinder;
import java.lang.reflect.Field;

public final class d<T> extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f40133a;

    private d(Object obj) {
        this.f40133a = obj;
    }

    public static <T> T K3(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f40133a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            C6620s.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static <T> b L3(T t10) {
        return new d(t10);
    }
}
