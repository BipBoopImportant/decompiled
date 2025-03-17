package QL;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private static Constructor<MethodHandles.Lookup> f137759a;

    @IgnoreJRERequirement
    static Object a(Method method, Class<?> cls, Object obj, Object[] objArr) {
        Constructor<MethodHandles.Lookup> constructor = f137759a;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            constructor.setAccessible(true);
            f137759a = constructor;
        }
        return constructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
