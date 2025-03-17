package QL;

import GK.C15775C;
import GK.C15777E;
import GK.C15786e;
import GK.C15803v;
import GK.z;
import QL.C16359b;
import QL.C16362e;
import QL.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Method, Object> f137910a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final C15786e.a f137911b;

    /* renamed from: c  reason: collision with root package name */
    final C15803v f137912c;

    /* renamed from: d  reason: collision with root package name */
    final List<h.a> f137913d;

    /* renamed from: e  reason: collision with root package name */
    final int f137914e;

    /* renamed from: f  reason: collision with root package name */
    final List<C16362e.a> f137915f;

    /* renamed from: g  reason: collision with root package name */
    final int f137916g;

    /* renamed from: h  reason: collision with root package name */
    final Executor f137917h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f137918i;

    class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f137919a = new Object[0];

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f137920b;

        a(Class cls) {
            this.f137920b = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f137919a;
            }
            u uVar = t.f137852b;
            return uVar.c(method) ? uVar.b(method, this.f137920b, obj, objArr) : y.this.c(this.f137920b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C15786e.a f137922a;

        /* renamed from: b  reason: collision with root package name */
        private C15803v f137923b;

        /* renamed from: c  reason: collision with root package name */
        private final List<h.a> f137924c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List<C16362e.a> f137925d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private Executor f137926e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f137927f;

        public b a(C16362e.a aVar) {
            List<C16362e.a> list = this.f137925d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f137924c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(C15803v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List<String> n10 = vVar.n();
            if ("".equals(n10.get(n10.size() - 1))) {
                this.f137923b = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public b d(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return c(C15803v.h(str));
        }

        public y e() {
            if (this.f137923b != null) {
                C15786e.a aVar = this.f137922a;
                if (aVar == null) {
                    aVar = new z();
                }
                C15786e.a aVar2 = aVar;
                Executor executor = this.f137926e;
                if (executor == null) {
                    executor = t.f137851a;
                }
                Executor executor2 = executor;
                C16360c cVar = t.f137853c;
                ArrayList arrayList = new ArrayList(this.f137925d);
                List<? extends C16362e.a> a10 = cVar.a(executor2);
                arrayList.addAll(a10);
                List<? extends h.a> b10 = cVar.b();
                int size = b10.size();
                ArrayList arrayList2 = new ArrayList(this.f137924c.size() + 1 + size);
                arrayList2.add(new C16359b());
                arrayList2.addAll(this.f137924c);
                arrayList2.addAll(b10);
                return new y(aVar2, this.f137923b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a10.size(), executor2, this.f137927f);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(C15786e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f137922a = aVar;
            return this;
        }

        public b g(z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return f(zVar);
        }
    }

    y(C15786e.a aVar, C15803v vVar, List<h.a> list, int i10, List<C16362e.a> list2, int i11, Executor executor, boolean z10) {
        this.f137911b = aVar;
        this.f137912c = vVar;
        this.f137913d = list;
        this.f137914e = i10;
        this.f137915f = list2;
        this.f137916g = i11;
        this.f137917h = executor;
        this.f137918i = z10;
    }

    private void j(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f137918i) {
                u uVar = t.f137852b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!uVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                        c(cls, method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public C16362e<?, ?> a(Type type, Annotation[] annotationArr) {
        return d((C16362e.a) null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* access modifiers changed from: package-private */
    public z<?> c(Class<?> cls, Method method) {
        while (true) {
            Object obj = this.f137910a.get(method);
            if (obj instanceof z) {
                return (z) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f137910a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            z<?> b10 = z.b(this, cls, method);
                            this.f137910a.put(method, b10);
                            return b10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f137910a.get(method);
                    if (obj3 != null) {
                        z<?> zVar = (z) obj3;
                        return zVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public C16362e<?, ?> d(C16362e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f137915f.indexOf(aVar) + 1;
        int size = this.f137915f.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            C16362e<?, ?> a10 = this.f137915f.get(i10).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f137915f.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f137915f.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f137915f.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, C15775C> e(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f137913d.indexOf(aVar) + 1;
        int size = this.f137913d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            h<?, C15775C> c10 = this.f137913d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (c10 != null) {
                return c10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f137913d.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f137913d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f137913d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<C15777E, T> f(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f137913d.indexOf(aVar) + 1;
        int size = this.f137913d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            h<C15777E, ?> d10 = this.f137913d.get(i10).d(type, annotationArr, this);
            if (d10 != null) {
                return d10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f137913d.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f137913d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f137913d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, C15775C> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e((h.a) null, type, annotationArr, annotationArr2);
    }

    public <T> h<C15777E, T> h(Type type, Annotation[] annotationArr) {
        return f((h.a) null, type, annotationArr);
    }

    public <T> h<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f137913d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h<?, String> e10 = this.f137913d.get(i10).e(type, annotationArr, this);
            if (e10 != null) {
                return e10;
            }
        }
        return C16359b.d.f137735a;
    }
}
