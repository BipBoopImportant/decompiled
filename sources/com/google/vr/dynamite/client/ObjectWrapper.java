package com.google.vr.dynamite.client;

import android.os.IBinder;
import java.lang.reflect.Field;
import kd.C9973a;

@UsedByReflection
public final class ObjectWrapper<T> extends C9973a {
    @UsedByReflection
    private final T wrappedObject;

    private ObjectWrapper(Object obj) {
        this.wrappedObject = obj;
    }

    public static IObjectWrapper I3(Object obj) {
        return new ObjectWrapper(obj);
    }

    @UsedByReflection
    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        Field field = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Field field2 = declaredFields[i10];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i10++;
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw new IllegalArgumentException("remoteBinder is the wrong class.");
            } catch (NullPointerException e10) {
                throw new IllegalArgumentException("Binder object is null.", e10);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e12);
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
