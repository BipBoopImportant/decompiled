package TL;

import GK.C15775C;
import GK.C15777E;
import QL.h;
import QL.y;
import com.squareup.moshi.f;
import com.squareup.moshi.j;
import com.squareup.moshi.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: TL.a  reason: case insensitive filesystem */
public final class C16557a extends h.a {

    /* renamed from: a  reason: collision with root package name */
    private final t f138920a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f138921b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f138922c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f138923d;

    private C16557a(t tVar, boolean z10, boolean z11, boolean z12) {
        this.f138920a = tVar;
        this.f138921b = z10;
        this.f138922c = z11;
        this.f138923d = z12;
    }

    public static C16557a f() {
        return g(new t.b().d());
    }

    public static C16557a g(t tVar) {
        if (tVar != null) {
            return new C16557a(tVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private static Set<? extends Annotation> h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        f<T> e10 = this.f138920a.e(type, h(annotationArr));
        if (this.f138921b) {
            e10 = e10.lenient();
        }
        if (this.f138922c) {
            e10 = e10.failOnUnknown();
        }
        if (this.f138923d) {
            e10 = e10.serializeNulls();
        }
        return new C16558b(e10);
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        f<T> e10 = this.f138920a.e(type, h(annotationArr));
        if (this.f138921b) {
            e10 = e10.lenient();
        }
        if (this.f138922c) {
            e10 = e10.failOnUnknown();
        }
        if (this.f138923d) {
            e10 = e10.serializeNulls();
        }
        return new C16559c(e10);
    }
}
