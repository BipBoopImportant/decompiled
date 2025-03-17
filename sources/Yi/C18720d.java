package yI;

import XH.C16824o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: yI.d  reason: case insensitive filesystem */
class C18720d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Class f152716a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f152717b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f152718c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f152719d;

    /* renamed from: e  reason: collision with root package name */
    private final List f152720e;

    public C18720d(Class cls, Map map, C16824o oVar, C16824o oVar2, List list) {
        this.f152716a = cls;
        this.f152717b = map;
        this.f152718c = oVar;
        this.f152719d = oVar2;
        this.f152720e = list;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        return C18722f.o(this.f152716a, this.f152717b, this.f152718c, this.f152719d, this.f152720e, obj, method, objArr);
    }
}
