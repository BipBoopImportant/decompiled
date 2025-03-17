package QL;

import GK.C15774B;
import GK.C15802u;
import GK.C15803v;
import GK.C15805x;
import GK.C15806y;
import QL.s;
import VL.C16699a;
import VL.C16700b;
import VL.C16701c;
import VL.C16702d;
import VL.C16703e;
import VL.C16704f;
import VL.C16705g;
import VL.C16706h;
import VL.C16707i;
import VL.C16708j;
import VL.C16709k;
import VL.C16710l;
import VL.C16711m;
import VL.C16712n;
import VL.o;
import VL.p;
import VL.q;
import VL.r;
import VL.t;
import VL.u;
import VL.v;
import VL.x;
import VL.y;
import dI.C17164e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f137869a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f137870b;

    /* renamed from: c  reason: collision with root package name */
    private final C15803v f137871c;

    /* renamed from: d  reason: collision with root package name */
    final String f137872d;

    /* renamed from: e  reason: collision with root package name */
    private final String f137873e;

    /* renamed from: f  reason: collision with root package name */
    private final C15802u f137874f;

    /* renamed from: g  reason: collision with root package name */
    private final C15805x f137875g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f137876h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f137877i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f137878j;

    /* renamed from: k  reason: collision with root package name */
    private final s<?>[] f137879k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f137880l;

    static final class a {

        /* renamed from: y  reason: collision with root package name */
        private static final Pattern f137881y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z  reason: collision with root package name */
        private static final Pattern f137882z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        final y f137883a;

        /* renamed from: b  reason: collision with root package name */
        final Class<?> f137884b;

        /* renamed from: c  reason: collision with root package name */
        final Method f137885c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[] f137886d;

        /* renamed from: e  reason: collision with root package name */
        final Annotation[][] f137887e;

        /* renamed from: f  reason: collision with root package name */
        final Type[] f137888f;

        /* renamed from: g  reason: collision with root package name */
        boolean f137889g;

        /* renamed from: h  reason: collision with root package name */
        boolean f137890h;

        /* renamed from: i  reason: collision with root package name */
        boolean f137891i;

        /* renamed from: j  reason: collision with root package name */
        boolean f137892j;

        /* renamed from: k  reason: collision with root package name */
        boolean f137893k;

        /* renamed from: l  reason: collision with root package name */
        boolean f137894l;

        /* renamed from: m  reason: collision with root package name */
        boolean f137895m;

        /* renamed from: n  reason: collision with root package name */
        boolean f137896n;

        /* renamed from: o  reason: collision with root package name */
        String f137897o;

        /* renamed from: p  reason: collision with root package name */
        boolean f137898p;

        /* renamed from: q  reason: collision with root package name */
        boolean f137899q;

        /* renamed from: r  reason: collision with root package name */
        boolean f137900r;

        /* renamed from: s  reason: collision with root package name */
        String f137901s;

        /* renamed from: t  reason: collision with root package name */
        C15802u f137902t;

        /* renamed from: u  reason: collision with root package name */
        C15805x f137903u;

        /* renamed from: v  reason: collision with root package name */
        Set<String> f137904v;

        /* renamed from: w  reason: collision with root package name */
        s<?>[] f137905w;

        /* renamed from: x  reason: collision with root package name */
        boolean f137906x;

        a(y yVar, Class<?> cls, Method method) {
            this.f137883a = yVar;
            this.f137884b = cls;
            this.f137885c = method;
            this.f137886d = method.getAnnotations();
            this.f137888f = method.getGenericParameterTypes();
            this.f137887e = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private C15802u c(String[] strArr, boolean z10) {
            C15802u.a aVar = new C15802u.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C16357C.n(this.f137885c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f137903u = C15805x.e(trim);
                    } catch (IllegalArgumentException e10) {
                        throw C16357C.o(this.f137885c, e10, "Malformed content type: %s", trim);
                    }
                } else if (z10) {
                    aVar.e(substring, trim);
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f137897o;
            if (str3 == null) {
                this.f137897o = str;
                this.f137898p = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f137881y.matcher(substring).find()) {
                            throw C16357C.n(this.f137885c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f137901s = str2;
                    this.f137904v = h(str2);
                    return;
                }
                return;
            }
            throw C16357C.n(this.f137885c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof C16700b) {
                d("DELETE", ((C16700b) annotation).value(), false);
            } else if (annotation instanceof C16704f) {
                d("GET", ((C16704f) annotation).value(), false);
            } else if (annotation instanceof C16705g) {
                d("HEAD", ((C16705g) annotation).value(), false);
            } else if (annotation instanceof C16712n) {
                d("PATCH", ((C16712n) annotation).value(), true);
            } else if (annotation instanceof o) {
                d("POST", ((o) annotation).value(), true);
            } else if (annotation instanceof p) {
                d("PUT", ((p) annotation).value(), true);
            } else if (annotation instanceof C16711m) {
                d("OPTIONS", ((C16711m) annotation).value(), false);
            } else if (annotation instanceof C16706h) {
                C16706h hVar = (C16706h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof C16709k) {
                C16709k kVar = (C16709k) annotation;
                String[] value = kVar.value();
                if (value.length != 0) {
                    this.f137902t = c(value, kVar.allowUnsafeNonAsciiValues());
                    return;
                }
                throw C16357C.n(this.f137885c, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof C16710l) {
                if (!this.f137899q) {
                    this.f137900r = true;
                    return;
                }
                throw C16357C.n(this.f137885c, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof C16703e)) {
            } else {
                if (!this.f137900r) {
                    this.f137899q = true;
                    return;
                }
                throw C16357C.n(this.f137885c, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        private s<?> f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            s<?> sVar;
            if (annotationArr != null) {
                sVar = null;
                for (Annotation g10 : annotationArr) {
                    s<?> g11 = g(i10, type, annotationArr, g10);
                    if (g11 != null) {
                        if (sVar == null) {
                            sVar = g11;
                        } else {
                            throw C16357C.p(this.f137885c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
            if (z10) {
                try {
                    if (C16357C.h(type) == C17164e.class) {
                        this.f137906x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C16357C.p(this.f137885c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private s<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof y) {
                j(i10, type);
                if (this.f137896n) {
                    throw C16357C.p(this.f137885c, i10, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f137892j) {
                    throw C16357C.p(this.f137885c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f137893k) {
                    throw C16357C.p(this.f137885c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f137894l) {
                    throw C16357C.p(this.f137885c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f137895m) {
                    throw C16357C.p(this.f137885c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f137901s == null) {
                    this.f137896n = true;
                    if (type == C15803v.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new s.p(this.f137885c, i10);
                    }
                    throw C16357C.p(this.f137885c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C16357C.p(this.f137885c, i10, "@Url cannot be used with @%s URL", this.f137897o);
                }
            } else if (annotation instanceof VL.s) {
                j(i10, type);
                if (this.f137893k) {
                    throw C16357C.p(this.f137885c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f137894l) {
                    throw C16357C.p(this.f137885c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f137895m) {
                    throw C16357C.p(this.f137885c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f137896n) {
                    throw C16357C.p(this.f137885c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f137901s != null) {
                    this.f137892j = true;
                    VL.s sVar = (VL.s) annotation;
                    String value = sVar.value();
                    i(i10, value);
                    return new s.k(this.f137885c, i10, value, this.f137883a.i(type, annotationArr), sVar.encoded());
                } else {
                    throw C16357C.p(this.f137885c, i10, "@Path can only be used with relative url on @%s", this.f137897o);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof t) {
                    j(i10, type);
                    t tVar = (t) annotation;
                    String value2 = tVar.value();
                    boolean encoded = tVar.encoded();
                    Class<?> h10 = C16357C.h(type);
                    this.f137893k = true;
                    if (cls2.isAssignableFrom(h10)) {
                        if (type instanceof ParameterizedType) {
                            return new s.l(value2, this.f137883a.i(C16357C.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                        }
                        throw C16357C.p(this.f137885c, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h10.isArray()) {
                        return new s.l(value2, this.f137883a.i(type, annotationArr), encoded);
                    } else {
                        return new s.l(value2, this.f137883a.i(a(h10.getComponentType()), annotationArr), encoded).b();
                    }
                } else if (annotation instanceof v) {
                    j(i10, type);
                    boolean encoded2 = ((v) annotation).encoded();
                    Class<?> h11 = C16357C.h(type);
                    this.f137894l = true;
                    if (cls2.isAssignableFrom(h11)) {
                        if (type instanceof ParameterizedType) {
                            return new s.n(this.f137883a.i(C16357C.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                        }
                        throw C16357C.p(this.f137885c, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h11.isArray()) {
                        return new s.n(this.f137883a.i(type, annotationArr), encoded2);
                    } else {
                        return new s.n(this.f137883a.i(a(h11.getComponentType()), annotationArr), encoded2).b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof u) {
                        j(i10, type);
                        Class<?> h12 = C16357C.h(type);
                        this.f137895m = true;
                        if (cls3.isAssignableFrom(h12)) {
                            Type i11 = C16357C.i(type, h12, cls3);
                            if (i11 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i11;
                                Type g10 = C16357C.g(0, parameterizedType);
                                if (cls == g10) {
                                    return new s.m(this.f137885c, i10, this.f137883a.i(C16357C.g(1, parameterizedType), annotationArr), ((u) annotation).encoded());
                                }
                                throw C16357C.p(this.f137885c, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
                            }
                            throw C16357C.p(this.f137885c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C16357C.p(this.f137885c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C16707i) {
                        j(i10, type);
                        C16707i iVar = (C16707i) annotation;
                        String value3 = iVar.value();
                        Class<?> h13 = C16357C.h(type);
                        if (cls2.isAssignableFrom(h13)) {
                            if (type instanceof ParameterizedType) {
                                return new s.f(value3, this.f137883a.i(C16357C.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                            }
                            throw C16357C.p(this.f137885c, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h13.isArray()) {
                            return new s.f(value3, this.f137883a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                        } else {
                            return new s.f(value3, this.f137883a.i(a(h13.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                        }
                    } else if (annotation instanceof C16708j) {
                        if (type == C15802u.class) {
                            return new s.h(this.f137885c, i10);
                        }
                        j(i10, type);
                        Class<?> h14 = C16357C.h(type);
                        if (cls3.isAssignableFrom(h14)) {
                            Type i12 = C16357C.i(type, h14, cls3);
                            if (i12 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                                Type g11 = C16357C.g(0, parameterizedType2);
                                if (cls == g11) {
                                    return new s.g(this.f137885c, i10, this.f137883a.i(C16357C.g(1, parameterizedType2), annotationArr), ((C16708j) annotation).allowUnsafeNonAsciiValues());
                                }
                                throw C16357C.p(this.f137885c, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
                            }
                            throw C16357C.p(this.f137885c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C16357C.p(this.f137885c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                    } else if (annotation instanceof C16701c) {
                        j(i10, type);
                        if (this.f137899q) {
                            C16701c cVar = (C16701c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f137889g = true;
                            Class<?> h15 = C16357C.h(type);
                            if (cls2.isAssignableFrom(h15)) {
                                if (type instanceof ParameterizedType) {
                                    return new s.d(value4, this.f137883a.i(C16357C.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                                }
                                throw C16357C.p(this.f137885c, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h15.isArray()) {
                                return new s.d(value4, this.f137883a.i(type, annotationArr), encoded3);
                            } else {
                                return new s.d(value4, this.f137883a.i(a(h15.getComponentType()), annotationArr), encoded3).b();
                            }
                        } else {
                            throw C16357C.p(this.f137885c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C16702d) {
                        j(i10, type);
                        if (this.f137899q) {
                            Class<?> h16 = C16357C.h(type);
                            if (cls3.isAssignableFrom(h16)) {
                                Type i13 = C16357C.i(type, h16, cls3);
                                if (i13 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                                    Type g12 = C16357C.g(0, parameterizedType3);
                                    if (cls == g12) {
                                        h i14 = this.f137883a.i(C16357C.g(1, parameterizedType3), annotationArr);
                                        this.f137889g = true;
                                        return new s.e(this.f137885c, i10, i14, ((C16702d) annotation).encoded());
                                    }
                                    throw C16357C.p(this.f137885c, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
                                }
                                throw C16357C.p(this.f137885c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw C16357C.p(this.f137885c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw C16357C.p(this.f137885c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<C15806y.c> cls4 = C15806y.c.class;
                        if (annotation instanceof q) {
                            j(i10, type);
                            if (this.f137900r) {
                                q qVar = (q) annotation;
                                this.f137890h = true;
                                String value5 = qVar.value();
                                Class<?> h17 = C16357C.h(type);
                                if (!value5.isEmpty()) {
                                    C15802u q10 = C15802u.q("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                                    if (cls2.isAssignableFrom(h17)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g13 = C16357C.g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(C16357C.h(g13))) {
                                                return new s.i(this.f137885c, i10, q10, this.f137883a.g(g13, annotationArr, this.f137886d)).c();
                                            }
                                            throw C16357C.p(this.f137885c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw C16357C.p(this.f137885c, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h17.isArray()) {
                                        Class<?> a10 = a(h17.getComponentType());
                                        if (!cls4.isAssignableFrom(a10)) {
                                            return new s.i(this.f137885c, i10, q10, this.f137883a.g(a10, annotationArr, this.f137886d)).b();
                                        }
                                        throw C16357C.p(this.f137885c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h17)) {
                                        return new s.i(this.f137885c, i10, q10, this.f137883a.g(type, annotationArr, this.f137886d));
                                    } else {
                                        throw C16357C.p(this.f137885c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h17)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw C16357C.p(this.f137885c, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(C16357C.h(C16357C.g(0, (ParameterizedType) type)))) {
                                        return s.o.f137847a.c();
                                    } else {
                                        throw C16357C.p(this.f137885c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h17.isArray()) {
                                    if (cls4.isAssignableFrom(h17.getComponentType())) {
                                        return s.o.f137847a.b();
                                    }
                                    throw C16357C.p(this.f137885c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h17)) {
                                    return s.o.f137847a;
                                } else {
                                    throw C16357C.p(this.f137885c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw C16357C.p(this.f137885c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof r) {
                            j(i10, type);
                            if (this.f137900r) {
                                this.f137890h = true;
                                Class<?> h18 = C16357C.h(type);
                                if (cls3.isAssignableFrom(h18)) {
                                    Type i15 = C16357C.i(type, h18, cls3);
                                    if (i15 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                                        Type g14 = C16357C.g(0, parameterizedType4);
                                        if (cls == g14) {
                                            Type g15 = C16357C.g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(C16357C.h(g15))) {
                                                return new s.j(this.f137885c, i10, this.f137883a.g(g15, annotationArr, this.f137886d), ((r) annotation).encoding());
                                            }
                                            throw C16357C.p(this.f137885c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw C16357C.p(this.f137885c, i10, "@PartMap keys must be of type String: " + g14, new Object[0]);
                                    }
                                    throw C16357C.p(this.f137885c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw C16357C.p(this.f137885c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw C16357C.p(this.f137885c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof C16699a) {
                            j(i10, type);
                            if (this.f137899q || this.f137900r) {
                                throw C16357C.p(this.f137885c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f137891i) {
                                try {
                                    h g16 = this.f137883a.g(type, annotationArr, this.f137886d);
                                    this.f137891i = true;
                                    return new s.c(this.f137885c, i10, g16);
                                } catch (RuntimeException e10) {
                                    throw C16357C.q(this.f137885c, e10, i10, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw C16357C.p(this.f137885c, i10, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof x)) {
                            return null;
                        } else {
                            j(i10, type);
                            Class<?> h19 = C16357C.h(type);
                            int i16 = i10 - 1;
                            while (i16 >= 0) {
                                s<?> sVar2 = this.f137905w[i16];
                                if (!(sVar2 instanceof s.q) || !((s.q) sVar2).f137850a.equals(h19)) {
                                    i16--;
                                } else {
                                    throw C16357C.p(this.f137885c, i10, "@Tag type " + h19.getName() + " is duplicate of " + t.f137852b.a(this.f137885c, i16) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new s.q(h19);
                        }
                    }
                }
            }
        }

        static Set<String> h(String str) {
            Matcher matcher = f137881y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f137882z.matcher(str).matches()) {
                throw C16357C.p(this.f137885c, i10, "@Path parameter name must match %s. Found: %s", f137881y.pattern(), str);
            } else if (!this.f137904v.contains(str)) {
                throw C16357C.p(this.f137885c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f137901s, str);
            }
        }

        private void j(int i10, Type type) {
            if (C16357C.j(type)) {
                throw C16357C.p(this.f137885c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        public w b() {
            for (Annotation e10 : this.f137886d) {
                e(e10);
            }
            if (this.f137897o != null) {
                if (!this.f137898p) {
                    if (this.f137900r) {
                        throw C16357C.n(this.f137885c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f137899q) {
                        throw C16357C.n(this.f137885c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f137887e.length;
                this.f137905w = new s[length];
                int i10 = length - 1;
                int i11 = 0;
                while (i11 < length) {
                    this.f137905w[i11] = f(i11, this.f137888f[i11], this.f137887e[i11], i11 == i10);
                    i11++;
                }
                if (this.f137901s != null || this.f137896n) {
                    boolean z10 = this.f137899q;
                    if (!z10 && !this.f137900r && !this.f137898p && this.f137891i) {
                        throw C16357C.n(this.f137885c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z10 && !this.f137889g) {
                        throw C16357C.n(this.f137885c, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f137900r || this.f137890h) {
                        return new w(this);
                    } else {
                        throw C16357C.n(this.f137885c, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C16357C.n(this.f137885c, "Missing either @%s URL or @Url parameter.", this.f137897o);
                }
            } else {
                throw C16357C.n(this.f137885c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    w(a aVar) {
        this.f137869a = aVar.f137884b;
        this.f137870b = aVar.f137885c;
        this.f137871c = aVar.f137883a.f137912c;
        this.f137872d = aVar.f137897o;
        this.f137873e = aVar.f137901s;
        this.f137874f = aVar.f137902t;
        this.f137875g = aVar.f137903u;
        this.f137876h = aVar.f137898p;
        this.f137877i = aVar.f137899q;
        this.f137878j = aVar.f137900r;
        this.f137879k = aVar.f137905w;
        this.f137880l = aVar.f137906x;
    }

    static w b(y yVar, Class<?> cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    /* access modifiers changed from: package-private */
    public C15774B a(Object obj, Object[] objArr) {
        s<?>[] sVarArr = this.f137879k;
        int length = objArr.length;
        if (length == sVarArr.length) {
            v vVar = new v(this.f137872d, this.f137871c, this.f137873e, this.f137874f, this.f137875g, this.f137876h, this.f137877i, this.f137878j);
            if (this.f137880l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                sVarArr[i10].a(vVar, objArr[i10]);
            }
            return vVar.k().k(o.class, new o(this.f137869a, obj, this.f137870b, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
    }
}
