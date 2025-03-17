package QL;

import GK.C15775C;
import GK.C15802u;
import GK.C15806y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

abstract class s<T> {

    class a extends s<Iterable<T>> {
        a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, Iterable<T> iterable) {
            if (iterable != null) {
                for (T a10 : iterable) {
                    s.this.a(vVar, a10);
                }
            }
        }
    }

    class b extends s<Object> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    s.this.a(vVar, Array.get(obj, i10));
                }
            }
        }
    }

    static final class c<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137806a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137807b;

        /* renamed from: c  reason: collision with root package name */
        private final h<T, C15775C> f137808c;

        c(Method method, int i10, h<T, C15775C> hVar) {
            this.f137806a = method;
            this.f137807b = i10;
            this.f137808c = hVar;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            if (t10 != null) {
                try {
                    vVar.l(this.f137808c.a(t10));
                } catch (IOException e10) {
                    Method method = this.f137806a;
                    int i10 = this.f137807b;
                    throw C16357C.q(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw C16357C.p(this.f137806a, this.f137807b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class d<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f137809a;

        /* renamed from: b  reason: collision with root package name */
        private final h<T, String> f137810b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f137811c;

        d(String str, h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f137809a = str;
            this.f137810b = hVar;
            this.f137811c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f137810b.a(t10)) != null) {
                vVar.a(this.f137809a, a10, this.f137811c);
            }
        }
    }

    static final class e<T> extends s<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137812a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137813b;

        /* renamed from: c  reason: collision with root package name */
        private final h<T, String> f137814c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f137815d;

        e(Method method, int i10, h<T, String> hVar, boolean z10) {
            this.f137812a = method;
            this.f137813b = i10;
            this.f137814c = hVar;
            this.f137815d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a10 = this.f137814c.a(value);
                            if (a10 != null) {
                                vVar.a(str, a10, this.f137815d);
                            } else {
                                Method method = this.f137812a;
                                int i10 = this.f137813b;
                                throw C16357C.p(method, i10, "Field map value '" + value + "' converted to null by " + this.f137814c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f137812a;
                            int i11 = this.f137813b;
                            throw C16357C.p(method2, i11, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C16357C.p(this.f137812a, this.f137813b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C16357C.p(this.f137812a, this.f137813b, "Field map was null.", new Object[0]);
        }
    }

    static final class f<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f137816a;

        /* renamed from: b  reason: collision with root package name */
        private final h<T, String> f137817b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f137818c;

        f(String str, h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f137816a = str;
            this.f137817b = hVar;
            this.f137818c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f137817b.a(t10)) != null) {
                vVar.b(this.f137816a, a10, this.f137818c);
            }
        }
    }

    static final class g<T> extends s<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137819a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137820b;

        /* renamed from: c  reason: collision with root package name */
        private final h<T, String> f137821c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f137822d;

        g(Method method, int i10, h<T, String> hVar, boolean z10) {
            this.f137819a = method;
            this.f137820b = i10;
            this.f137821c = hVar;
            this.f137822d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            vVar.b(str, this.f137821c.a(value), this.f137822d);
                        } else {
                            Method method = this.f137819a;
                            int i10 = this.f137820b;
                            throw C16357C.p(method, i10, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C16357C.p(this.f137819a, this.f137820b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C16357C.p(this.f137819a, this.f137820b, "Header map was null.", new Object[0]);
        }
    }

    static final class h extends s<C15802u> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137823a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137824b;

        h(Method method, int i10) {
            this.f137823a = method;
            this.f137824b = i10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, C15802u uVar) {
            if (uVar != null) {
                vVar.c(uVar);
                return;
            }
            throw C16357C.p(this.f137823a, this.f137824b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class i<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137825a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137826b;

        /* renamed from: c  reason: collision with root package name */
        private final C15802u f137827c;

        /* renamed from: d  reason: collision with root package name */
        private final h<T, C15775C> f137828d;

        i(Method method, int i10, C15802u uVar, h<T, C15775C> hVar) {
            this.f137825a = method;
            this.f137826b = i10;
            this.f137827c = uVar;
            this.f137828d = hVar;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            if (t10 != null) {
                try {
                    vVar.d(this.f137827c, this.f137828d.a(t10));
                } catch (IOException e10) {
                    Method method = this.f137825a;
                    int i10 = this.f137826b;
                    throw C16357C.p(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    static final class j<T> extends s<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137829a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137830b;

        /* renamed from: c  reason: collision with root package name */
        private final h<T, C15775C> f137831c;

        /* renamed from: d  reason: collision with root package name */
        private final String f137832d;

        j(Method method, int i10, h<T, C15775C> hVar, String str) {
            this.f137829a = method;
            this.f137830b = i10;
            this.f137831c = hVar;
            this.f137832d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            vVar.d(C15802u.q("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f137832d), this.f137831c.a(value));
                        } else {
                            Method method = this.f137829a;
                            int i10 = this.f137830b;
                            throw C16357C.p(method, i10, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C16357C.p(this.f137829a, this.f137830b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C16357C.p(this.f137829a, this.f137830b, "Part map was null.", new Object[0]);
        }
    }

    static final class k<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137833a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137834b;

        /* renamed from: c  reason: collision with root package name */
        private final String f137835c;

        /* renamed from: d  reason: collision with root package name */
        private final h<T, String> f137836d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137837e;

        k(Method method, int i10, String str, h<T, String> hVar, boolean z10) {
            this.f137833a = method;
            this.f137834b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f137835c = str;
            this.f137836d = hVar;
            this.f137837e = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            if (t10 != null) {
                vVar.f(this.f137835c, this.f137836d.a(t10), this.f137837e);
                return;
            }
            Method method = this.f137833a;
            int i10 = this.f137834b;
            throw C16357C.p(method, i10, "Path parameter \"" + this.f137835c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f137838a;

        /* renamed from: b  reason: collision with root package name */
        private final h<T, String> f137839b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f137840c;

        l(String str, h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f137838a = str;
            this.f137839b = hVar;
            this.f137840c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f137839b.a(t10)) != null) {
                vVar.g(this.f137838a, a10, this.f137840c);
            }
        }
    }

    static final class m<T> extends s<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137841a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137842b;

        /* renamed from: c  reason: collision with root package name */
        private final h<T, String> f137843c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f137844d;

        m(Method method, int i10, h<T, String> hVar, boolean z10) {
            this.f137841a = method;
            this.f137842b = i10;
            this.f137843c = hVar;
            this.f137844d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a10 = this.f137843c.a(value);
                            if (a10 != null) {
                                vVar.g(str, a10, this.f137844d);
                            } else {
                                Method method = this.f137841a;
                                int i10 = this.f137842b;
                                throw C16357C.p(method, i10, "Query map value '" + value + "' converted to null by " + this.f137843c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f137841a;
                            int i11 = this.f137842b;
                            throw C16357C.p(method2, i11, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C16357C.p(this.f137841a, this.f137842b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C16357C.p(this.f137841a, this.f137842b, "Query map was null", new Object[0]);
        }
    }

    static final class n<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h<T, String> f137845a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f137846b;

        n(h<T, String> hVar, boolean z10) {
            this.f137845a = hVar;
            this.f137846b = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            if (t10 != null) {
                vVar.g(this.f137845a.a(t10), (String) null, this.f137846b);
            }
        }
    }

    static final class o extends s<C15806y.c> {

        /* renamed from: a  reason: collision with root package name */
        static final o f137847a = new o();

        private o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(v vVar, C15806y.c cVar) {
            if (cVar != null) {
                vVar.e(cVar);
            }
        }
    }

    static final class p extends s<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f137848a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137849b;

        p(Method method, int i10) {
            this.f137848a = method;
            this.f137849b = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, Object obj) {
            if (obj != null) {
                vVar.m(obj);
                return;
            }
            throw C16357C.p(this.f137848a, this.f137849b, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class q<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        final Class<T> f137850a;

        q(Class<T> cls) {
            this.f137850a = cls;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, T t10) {
            vVar.h(this.f137850a, t10);
        }
    }

    s() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(v vVar, T t10);

    /* access modifiers changed from: package-private */
    public final s<Object> b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final s<Iterable<T>> c() {
        return new a();
    }
}
