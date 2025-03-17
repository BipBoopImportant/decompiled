package QL;

import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import QL.C16357C;
import dI.C17164e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class n<ResponseT, ReturnT> extends z<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    private final w f137763a;

    /* renamed from: b  reason: collision with root package name */
    private final C15786e.a f137764b;

    /* renamed from: c  reason: collision with root package name */
    private final h<C15777E, ResponseT> f137765c;

    static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        private final C16362e<ResponseT, ReturnT> f137766d;

        a(w wVar, C15786e.a aVar, h<C15777E, ResponseT> hVar, C16362e<ResponseT, ReturnT> eVar) {
            super(wVar, aVar, hVar);
            this.f137766d = eVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [QL.d, QL.d<ResponseT>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(QL.C16361d<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                QL.e<ResponseT, ReturnT> r2 = r0.f137766d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: QL.n.a.c(QL.d, java.lang.Object[]):java.lang.Object");
        }
    }

    static final class b<ResponseT> extends n<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final C16362e<ResponseT, C16361d<ResponseT>> f137767d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137768e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f137769f;

        b(w wVar, C15786e.a aVar, h<C15777E, ResponseT> hVar, C16362e<ResponseT, C16361d<ResponseT>> eVar, boolean z10, boolean z11) {
            super(wVar, aVar, hVar);
            this.f137767d = eVar;
            this.f137768e = z10;
            this.f137769f = z11;
        }

        /* access modifiers changed from: protected */
        public Object c(C16361d<ResponseT> dVar, Object[] objArr) {
            C16361d dVar2 = (C16361d) this.f137767d.b(dVar);
            C17164e eVar = objArr[objArr.length - 1];
            try {
                return this.f137769f ? p.d(dVar2, eVar) : this.f137768e ? p.b(dVar2, eVar) : p.a(dVar2, eVar);
            } catch (VirtualMachineError e10) {
                e = e10;
                throw e;
            } catch (ThreadDeath e11) {
                e = e11;
                throw e;
            } catch (LinkageError e12) {
                e = e12;
                throw e;
            } catch (Throwable th2) {
                return p.e(th2, eVar);
            }
        }
    }

    static final class c<ResponseT> extends n<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final C16362e<ResponseT, C16361d<ResponseT>> f137770d;

        c(w wVar, C15786e.a aVar, h<C15777E, ResponseT> hVar, C16362e<ResponseT, C16361d<ResponseT>> eVar) {
            super(wVar, aVar, hVar);
            this.f137770d = eVar;
        }

        /* access modifiers changed from: protected */
        public Object c(C16361d<ResponseT> dVar, Object[] objArr) {
            C16361d dVar2 = (C16361d) this.f137770d.b(dVar);
            C17164e eVar = objArr[objArr.length - 1];
            try {
                return p.c(dVar2, eVar);
            } catch (Exception e10) {
                return p.e(e10, eVar);
            }
        }
    }

    n(w wVar, C15786e.a aVar, h<C15777E, ResponseT> hVar) {
        this.f137763a = wVar;
        this.f137764b = aVar;
        this.f137765c = hVar;
    }

    private static <ResponseT, ReturnT> C16362e<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return yVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw C16357C.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> h<C15777E, ResponseT> e(y yVar, Method method, Type type) {
        try {
            return yVar.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw C16357C.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(y yVar, Method method, w wVar) {
        boolean z10;
        Type type;
        boolean z11;
        boolean z12;
        boolean z13 = wVar.f137880l;
        Annotation[] annotations = method.getAnnotations();
        Class<x> cls = x.class;
        if (z13) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = C16357C.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            Class<C16361d> cls2 = C16361d.class;
            if (C16357C.h(f10) == cls && (f10 instanceof ParameterizedType)) {
                f10 = C16357C.g(0, (ParameterizedType) f10);
                z11 = true;
                z12 = false;
            } else if (C16357C.h(f10) != cls2) {
                z12 = C16357C.m(f10);
                z11 = false;
            } else {
                throw C16357C.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", C16357C.g(0, (ParameterizedType) f10));
            }
            type = new C16357C.b((Type) null, cls2, f10);
            annotations = C16356B.a(annotations);
            z10 = z12;
        } else {
            type = method.getGenericReturnType();
            z11 = false;
            z10 = false;
        }
        C16362e d10 = d(yVar, method, type, annotations);
        Type a10 = d10.a();
        if (a10 == C15776D.class) {
            throw C16357C.n(method, "'" + C16357C.h(a10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a10 == cls) {
            throw C16357C.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!wVar.f137872d.equals("HEAD") || Void.class.equals(a10) || C16357C.m(a10)) {
            h e10 = e(yVar, method, a10);
            C15786e.a aVar = yVar.f137911b;
            return !z13 ? new a(wVar, aVar, e10, d10) : z11 ? new c(wVar, aVar, e10, d10) : new b(wVar, aVar, e10, d10, false, z10);
        } else {
            throw C16357C.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public final ReturnT a(Object obj, Object[] objArr) {
        return c(new q(this.f137763a, obj, objArr, this.f137764b, this.f137765c), objArr);
    }

    /* access modifiers changed from: protected */
    public abstract ReturnT c(C16361d<ResponseT> dVar, Object[] objArr);
}
