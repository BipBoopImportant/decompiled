package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

abstract class b<T> {

    class a extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f122329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f122330b;

        a(Constructor constructor, Class cls) {
            this.f122329a = constructor;
            this.f122330b = cls;
        }

        public T b() {
            return this.f122329a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f122330b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$b  reason: collision with other inner class name */
    class C3018b extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f122331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f122332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f122333c;

        C3018b(Method method, Object obj, Class cls) {
            this.f122331a = method;
            this.f122332b = obj;
            this.f122333c = cls;
        }

        public T b() {
            return this.f122331a.invoke(this.f122332b, new Object[]{this.f122333c});
        }

        public String toString() {
            return this.f122333c.getName();
        }
    }

    class c extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f122334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f122335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f122336c;

        c(Method method, Class cls, int i10) {
            this.f122334a = method;
            this.f122335b = cls;
            this.f122336c = i10;
        }

        public T b() {
            return this.f122334a.invoke((Object) null, new Object[]{this.f122335b, Integer.valueOf(this.f122336c)});
        }

        public String toString() {
            return this.f122335b.getName();
        }
    }

    class d extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f122337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f122338b;

        d(Method method, Class cls) {
            this.f122337a = method;
            this.f122338b = cls;
        }

        public T b() {
            return this.f122337a.invoke((Object) null, new Object[]{this.f122338b, Object.class});
        }

        public String toString() {
            return this.f122338b.getName();
        }
    }

    b() {
    }

    public static <T> b<T> a(Class<?> cls) {
        Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
        Class<Class> cls3 = Class.class;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls4.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C3018b(cls4.getMethod("allocateInstance", new Class[]{cls3}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e10) {
                    throw ME.c.s(e10);
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls3, cls3});
                        declaredMethod3.setAccessible(true);
                        return new d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T b();
}
