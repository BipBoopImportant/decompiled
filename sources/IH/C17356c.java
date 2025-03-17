package iH;

import WH.C16729a;
import android.app.Activity;
import androidx.lifecycle.X;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import cH.C17062a;
import eH.C17184f;
import hH.C17327f;
import java.io.Closeable;
import java.util.Map;
import l3.a;
import nI.C17642l;

/* renamed from: iH.c  reason: case insensitive filesystem */
public final class C17356c implements i0.c {

    /* renamed from: e  reason: collision with root package name */
    public static final a.b<C17642l<Object, f0>> f143487e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f143488a;

    /* renamed from: b  reason: collision with root package name */
    private final i0.c f143489b;

    /* renamed from: c  reason: collision with root package name */
    private final i0.c f143490c;

    /* renamed from: iH.c$a */
    class a implements a.b<C17642l<Object, f0>> {
        a() {
        }
    }

    /* renamed from: iH.c$b */
    class b implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17327f f143491a;

        b(C17327f fVar) {
            this.f143491a = fVar;
        }

        private <T extends f0> T a(C17184f fVar, Class<T> cls, l3.a aVar) {
            Class cls2 = d.class;
            C16729a aVar2 = ((d) C17062a.a(fVar, cls2)).a().get(cls);
            C17642l lVar = (C17642l) aVar.a(C17356c.f143487e);
            Object obj = ((d) C17062a.a(fVar, cls2)).b().get(cls);
            if (obj == null) {
                if (lVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                } else if (aVar2 != null) {
                    return (f0) aVar2.get();
                } else {
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
            } else if (aVar2 != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            } else if (lVar != null) {
                return (f0) lVar.invoke(obj);
            } else {
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
        }

        public <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17359f fVar = new C17359f();
            T a10 = a(this.f143491a.a(X.b(aVar)).b(fVar).g(), cls, aVar);
            a10.addCloseable((Closeable) new C17357d(fVar));
            return a10;
        }
    }

    /* renamed from: iH.c$c  reason: collision with other inner class name */
    interface C3502c {
        Map<Class<?>, Boolean> c();

        C17327f s();
    }

    /* renamed from: iH.c$d */
    public interface d {
        Map<Class<?>, C16729a<f0>> a();

        Map<Class<?>, Object> b();
    }

    public C17356c(Map<Class<?>, Boolean> map, i0.c cVar, C17327f fVar) {
        this.f143488a = map;
        this.f143489b = cVar;
        this.f143490c = new b(fVar);
    }

    public static i0.c a(Activity activity, i0.c cVar) {
        C3502c cVar2 = (C3502c) C17062a.a(activity, C3502c.class);
        return new C17356c(cVar2.c(), cVar, cVar2.s());
    }

    public <T extends f0> T create(Class<T> cls, l3.a aVar) {
        if (this.f143488a.containsKey(cls)) {
            return this.f143490c.create(cls, aVar);
        }
        return this.f143489b.create(cls, aVar);
    }

    public <T extends f0> T create(Class<T> cls) {
        if (this.f143488a.containsKey(cls)) {
            return this.f143490c.create(cls);
        }
        return this.f143489b.create(cls);
    }
}
