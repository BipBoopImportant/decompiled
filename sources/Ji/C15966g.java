package JI;

import JI.C15967h;
import TI.C16497a;
import TI.C16498b;
import cJ.C17065b;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;

/* renamed from: JI.g  reason: case insensitive filesystem */
public final class C15966g extends u implements C16497a {

    /* renamed from: a  reason: collision with root package name */
    private final Annotation f135780a;

    public C15966g(Annotation annotation) {
        C17542s.j(annotation, "annotation");
        this.f135780a = annotation;
    }

    public boolean H() {
        return false;
    }

    public final Annotation R() {
        return this.f135780a;
    }

    /* renamed from: S */
    public q u() {
        return new q(C17603a.b(C17603a.a(this.f135780a)));
    }

    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15966g) && this.f135780a == ((C15966g) obj).f135780a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f135780a);
    }

    public Collection<C16498b> i() {
        Method[] declaredMethods = C17603a.b(C17603a.a(this.f135780a)).getDeclaredMethods();
        C17542s.i(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            C15967h.a aVar = C15967h.f135781b;
            Object invoke = method.invoke(this.f135780a, (Object[]) null);
            C17542s.i(invoke, "invoke(...)");
            arrayList.add(aVar.a(invoke, C17069f.v(method.getName())));
        }
        return arrayList;
    }

    public C17065b k() {
        return C15965f.e(C17603a.b(C17603a.a(this.f135780a)));
    }

    public String toString() {
        return C15966g.class.getName() + ": " + this.f135780a;
    }
}
