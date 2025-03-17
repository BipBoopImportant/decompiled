package QL;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f137771a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f137772b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f137773c;

    /* renamed from: d  reason: collision with root package name */
    private final List<?> f137774d;

    o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f137771a = cls;
        this.f137772b = obj;
        this.f137773c = method;
        this.f137774d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f137773c;
    }

    public Class<?> b() {
        return this.f137771a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f137771a.getName(), this.f137773c.getName(), this.f137774d});
    }
}
