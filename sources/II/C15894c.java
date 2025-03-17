package II;

import AI.C15432m;
import AI.C15435p;
import CI.C15496c;
import JI.C15965f;
import VI.C16692x;
import YH.C16870n;
import cJ.C17065b;
import cJ.C17069f;
import cJ.C17071h;
import iJ.C17372f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;
import mI.C17603a;

/* renamed from: II.c  reason: case insensitive filesystem */
final class C15894c {

    /* renamed from: a  reason: collision with root package name */
    public static final C15894c f135481a = new C15894c();

    private C15894c() {
    }

    private final C17372f a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            C17065b e10 = C15965f.e(cls);
            C17065b m10 = C15496c.f133492a.m(e10.a());
            if (m10 != null) {
                e10 = m10;
            }
            return new C17372f(e10, i10);
        } else if (C17542s.e(cls, Void.TYPE)) {
            return new C17372f(C17065b.f141241d.c(C15435p.a.f133100f.m()), i10);
        } else {
            C15432m v10 = C17558e.j(cls.getName()).v();
            C17542s.i(v10, "getPrimitiveType(...)");
            return i10 > 0 ? new C17372f(C17065b.f141241d.c(v10.n()), i10 - 1) : new C17372f(C17065b.f141241d.c(v10.B()), i10);
        }
    }

    private final void c(Class<?> cls, C16692x.d dVar) {
        Iterator a10 = C17527c.a(cls.getDeclaredConstructors());
        while (a10.hasNext()) {
            Constructor constructor = (Constructor) a10.next();
            C17069f fVar = C17071h.f141271j;
            C15904m mVar = C15904m.f135495a;
            C17542s.g(constructor);
            C16692x.e a11 = dVar.a(fVar, mVar.a(constructor));
            if (a11 != null) {
                Iterator a12 = C17527c.a(constructor.getDeclaredAnnotations());
                while (a12.hasNext()) {
                    Annotation annotation = (Annotation) a12.next();
                    C17542s.g(annotation);
                    f(a11, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C17542s.g(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator a13 = C17527c.a(parameterAnnotations[i10]);
                        while (a13.hasNext()) {
                            Annotation annotation2 = (Annotation) a13.next();
                            Class b10 = C17603a.b(C17603a.a(annotation2));
                            C17065b e10 = C15965f.e(b10);
                            C17542s.g(annotation2);
                            C16692x.a b11 = a11.b(i10 + length, e10, new C15893b(annotation2));
                            if (b11 != null) {
                                f135481a.h(b11, annotation2, b10);
                            }
                        }
                    }
                }
                a11.a();
            }
        }
    }

    private final void d(Class<?> cls, C16692x.d dVar) {
        Iterator a10 = C17527c.a(cls.getDeclaredFields());
        while (a10.hasNext()) {
            Field field = (Field) a10.next();
            C17069f v10 = C17069f.v(field.getName());
            C17542s.i(v10, "identifier(...)");
            C15904m mVar = C15904m.f135495a;
            C17542s.g(field);
            C16692x.c b10 = dVar.b(v10, mVar.b(field), (Object) null);
            if (b10 != null) {
                Iterator a11 = C17527c.a(field.getDeclaredAnnotations());
                while (a11.hasNext()) {
                    Annotation annotation = (Annotation) a11.next();
                    C17542s.g(annotation);
                    f(b10, annotation);
                }
                b10.a();
            }
        }
    }

    private final void e(Class<?> cls, C16692x.d dVar) {
        Iterator a10 = C17527c.a(cls.getDeclaredMethods());
        while (a10.hasNext()) {
            Method method = (Method) a10.next();
            C17069f v10 = C17069f.v(method.getName());
            C17542s.i(v10, "identifier(...)");
            C15904m mVar = C15904m.f135495a;
            C17542s.g(method);
            C16692x.e a11 = dVar.a(v10, mVar.c(method));
            if (a11 != null) {
                Iterator a12 = C17527c.a(method.getDeclaredAnnotations());
                while (a12.hasNext()) {
                    Annotation annotation = (Annotation) a12.next();
                    C17542s.g(annotation);
                    f(a11, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C17542s.i(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator a13 = C17527c.a(annotationArr[i10]);
                    while (a13.hasNext()) {
                        Annotation annotation2 = (Annotation) a13.next();
                        Class b10 = C17603a.b(C17603a.a(annotation2));
                        C17065b e10 = C15965f.e(b10);
                        C17542s.g(annotation2);
                        C16692x.a b11 = a11.b(i10, e10, new C15893b(annotation2));
                        if (b11 != null) {
                            f135481a.h(b11, annotation2, b10);
                        }
                    }
                }
                a11.a();
            }
        }
    }

    private final void f(C16692x.c cVar, Annotation annotation) {
        Class b10 = C17603a.b(C17603a.a(annotation));
        C16692x.a c10 = cVar.c(C15965f.e(b10), new C15893b(annotation));
        if (c10 != null) {
            f135481a.h(c10, annotation, b10);
        }
    }

    private final void g(C16692x.a aVar, C17069f fVar, Object obj) {
        Class<?> cls = obj.getClass();
        Class<Class> cls2 = Class.class;
        if (C17542s.e(cls, cls2)) {
            C17542s.h(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.d(fVar, a((Class) obj));
        } else if (C15900i.f135488a.contains(cls)) {
            aVar.b(fVar, obj);
        } else if (C15965f.l(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C17542s.g(cls);
            C17065b e10 = C15965f.e(cls);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C17069f v10 = C17069f.v(((Enum) obj).name());
            C17542s.i(v10, "identifier(...)");
            aVar.c(fVar, e10, v10);
        } else {
            Class<Annotation> cls3 = Annotation.class;
            if (cls3.isAssignableFrom(cls)) {
                Class[] interfaces = cls.getInterfaces();
                C17542s.i(interfaces, "getInterfaces(...)");
                Class cls4 = (Class) C16870n.N0(interfaces);
                C17542s.g(cls4);
                C16692x.a f10 = aVar.f(fVar, C15965f.e(cls4));
                if (f10 != null) {
                    C17542s.h(obj, "null cannot be cast to non-null type kotlin.Annotation");
                    h(f10, (Annotation) obj, cls4);
                }
            } else if (cls.isArray()) {
                C16692x.b e11 = aVar.e(fVar);
                if (e11 != null) {
                    Class<?> componentType = cls.getComponentType();
                    int i10 = 0;
                    if (componentType.isEnum()) {
                        C17542s.g(componentType);
                        C17065b e12 = C15965f.e(componentType);
                        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr = (Object[]) obj;
                        int length = objArr.length;
                        while (i10 < length) {
                            Object obj2 = objArr[i10];
                            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                            C17069f v11 = C17069f.v(((Enum) obj2).name());
                            C17542s.i(v11, "identifier(...)");
                            e11.d(e12, v11);
                            i10++;
                        }
                    } else if (C17542s.e(componentType, cls2)) {
                        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr2 = (Object[]) obj;
                        int length2 = objArr2.length;
                        while (i10 < length2) {
                            Object obj3 = objArr2[i10];
                            C17542s.h(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                            e11.c(a((Class) obj3));
                            i10++;
                        }
                    } else if (cls3.isAssignableFrom(componentType)) {
                        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr3 = (Object[]) obj;
                        int length3 = objArr3.length;
                        while (i10 < length3) {
                            Object obj4 = objArr3[i10];
                            C17542s.g(componentType);
                            C16692x.a b10 = e11.b(C15965f.e(componentType));
                            if (b10 != null) {
                                C17542s.h(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                                h(b10, (Annotation) obj4, componentType);
                            }
                            i10++;
                        }
                    } else {
                        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr4 = (Object[]) obj;
                        int length4 = objArr4.length;
                        while (i10 < length4) {
                            e11.e(objArr4[i10]);
                            i10++;
                        }
                    }
                    e11.a();
                }
            } else {
                throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
            }
        }
    }

    private final void h(C16692x.a aVar, Annotation annotation, Class<?> cls) {
        Iterator a10 = C17527c.a(cls.getDeclaredMethods());
        while (a10.hasNext()) {
            Method method = (Method) a10.next();
            try {
                Object invoke = method.invoke(annotation, (Object[]) null);
                C17542s.g(invoke);
                C17069f v10 = C17069f.v(method.getName());
                C17542s.i(v10, "identifier(...)");
                g(aVar, v10, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class<?> cls, C16692x.c cVar) {
        C17542s.j(cls, "klass");
        C17542s.j(cVar, "visitor");
        Iterator a10 = C17527c.a(cls.getDeclaredAnnotations());
        while (a10.hasNext()) {
            Annotation annotation = (Annotation) a10.next();
            C17542s.g(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(Class<?> cls, C16692x.d dVar) {
        C17542s.j(cls, "klass");
        C17542s.j(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
