package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f69166a = c();

    class a extends p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f69167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f69168c;

        a(Method method, Object obj) {
            this.f69167b = method;
            this.f69168c = obj;
        }

        public <T> T d(Class<T> cls) {
            p.b(cls);
            return this.f69167b.invoke(this.f69168c, new Object[]{cls});
        }
    }

    class b extends p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f69169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f69170c;

        b(Method method, int i10) {
            this.f69169b = method;
            this.f69170c = i10;
        }

        public <T> T d(Class<T> cls) {
            p.b(cls);
            return this.f69169b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f69170c)});
        }
    }

    class c extends p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f69171b;

        c(Method method) {
            this.f69171b = method;
        }

        public <T> T d(Class<T> cls) {
            p.b(cls);
            return this.f69171b.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    class d extends p {
        d() {
        }

        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String a10 = c.a(cls);
        if (a10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a10);
        }
    }

    private static p c() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T d(Class<T> cls);
}
