package JI;

import DI.x0;
import DI.y0;
import GJ.C15765h;
import GJ.C15768k;
import HI.C15817a;
import HI.C15818b;
import HI.C15819c;
import HJ.C15854t;
import TI.C16496D;
import TI.C16503g;
import TI.j;
import TI.w;
import YH.C16870n;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.U;
import nI.C17642l;

public final class q extends u implements j, C15957A, C16503g {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f135792a;

    /* synthetic */ class a extends C17540p implements C17642l<Member, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135793a = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(Member member) {
            C17542s.j(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class b extends C17540p implements C17642l<Constructor<?>, t> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f135794a = new b();

        b() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        /* renamed from: t */
        public final t invoke(Constructor<?> constructor) {
            C17542s.j(constructor, "p0");
            return new t(constructor);
        }
    }

    /* synthetic */ class c extends C17540p implements C17642l<Member, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135795a = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(Member member) {
            C17542s.j(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class d extends C17540p implements C17642l<Field, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f135796a = new d();

        d() {
            super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        /* renamed from: t */
        public final w invoke(Field field) {
            C17542s.j(field, "p0");
            return new w(field);
        }
    }

    /* synthetic */ class e extends C17540p implements C17642l<Method, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f135797a = new e();

        e() {
            super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        /* renamed from: t */
        public final z invoke(Method method) {
            C17542s.j(method, "p0");
            return new z(method);
        }
    }

    public q(Class<?> cls) {
        C17542s.j(cls, "klass");
        this.f135792a = cls;
    }

    /* access modifiers changed from: private */
    public static final boolean R(Class cls) {
        String simpleName = cls.getSimpleName();
        C17542s.i(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* access modifiers changed from: private */
    public static final C17069f S(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!C17069f.C(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C17069f.v(simpleName);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean T(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (qVar.x()) {
            C17542s.g(method);
            if (qVar.d0(method)) {
                return false;
            }
        }
        return true;
    }

    private final boolean d0(Method method) {
        String name = method.getName();
        if (C17542s.e(name, "values")) {
            Class[] parameterTypes = method.getParameterTypes();
            C17542s.i(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        } else if (C17542s.e(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else {
            return false;
        }
    }

    public C15765h<j> D() {
        Class[] c10 = C15961b.f135764a.c(this.f135792a);
        if (c10 != null) {
            ArrayList arrayList = new ArrayList(c10.length);
            for (Class sVar : c10) {
                arrayList.add(new s(sVar));
            }
            C15765h<j> h02 = C16877v.h0(arrayList);
            if (h02 != null) {
                return h02;
            }
        }
        return C15768k.j();
    }

    public boolean E() {
        return false;
    }

    public int J() {
        return this.f135792a.getModifiers();
    }

    public boolean L() {
        return this.f135792a.isInterface();
    }

    public C16496D M() {
        return null;
    }

    /* renamed from: X */
    public List<t> l() {
        Constructor[] declaredConstructors = this.f135792a.getDeclaredConstructors();
        C17542s.i(declaredConstructors, "getDeclaredConstructors(...)");
        return C15768k.a0(C15768k.S(C15768k.I(C16870n.U(declaredConstructors), a.f135793a), b.f135794a));
    }

    /* renamed from: Y */
    public Class<?> s() {
        return this.f135792a;
    }

    /* renamed from: Z */
    public List<w> z() {
        Field[] declaredFields = this.f135792a.getDeclaredFields();
        C17542s.i(declaredFields, "getDeclaredFields(...)");
        return C15768k.a0(C15768k.S(C15768k.I(C16870n.U(declaredFields), c.f135795a), d.f135796a));
    }

    public Collection<j> a() {
        Type type = Object.class;
        if (C17542s.e(this.f135792a, type)) {
            return C16877v.n();
        }
        U u10 = new U(2);
        Type genericSuperclass = this.f135792a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        u10.a(type);
        u10.b(this.f135792a.getGenericInterfaces());
        Iterable<Type> q10 = C16877v.q(u10.d(new Type[u10.c()]));
        ArrayList arrayList = new ArrayList(C16877v.y(q10, 10));
        for (Type sVar : q10) {
            arrayList.add(new s(sVar));
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public List<C17069f> B() {
        Class[] declaredClasses = this.f135792a.getDeclaredClasses();
        C17542s.i(declaredClasses, "getDeclaredClasses(...)");
        return C15768k.a0(C15768k.T(C15768k.I(C16870n.U(declaredClasses), n.f135789a), o.f135790a));
    }

    /* renamed from: b0 */
    public List<z> C() {
        Method[] declaredMethods = this.f135792a.getDeclaredMethods();
        C17542s.i(declaredMethods, "getDeclaredMethods(...)");
        return C15768k.a0(C15768k.S(C15768k.H(C16870n.U(declaredMethods), new p(this)), e.f135797a));
    }

    public boolean c() {
        Boolean f10 = C15961b.f135764a.f(this.f135792a);
        if (f10 != null) {
            return f10.booleanValue();
        }
        return false;
    }

    /* renamed from: c0 */
    public q h() {
        Class<?> declaringClass = this.f135792a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && C17542s.e(this.f135792a, ((q) obj).f135792a);
    }

    public C17066c f() {
        return C15965f.e(this.f135792a).a();
    }

    public boolean g() {
        return Modifier.isStatic(J());
    }

    public C17069f getName() {
        if (this.f135792a.isAnonymousClass()) {
            String name = this.f135792a.getName();
            C17542s.i(name, "getName(...)");
            C17069f v10 = C17069f.v(C15854t.p1(name, ".", (String) null, 2, (Object) null));
            C17542s.g(v10);
            return v10;
        }
        C17069f v11 = C17069f.v(this.f135792a.getSimpleName());
        C17542s.g(v11);
        return v11;
    }

    public List<F> getTypeParameters() {
        TypeVariable[] typeParameters = this.f135792a.getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable f10 : typeParameters) {
            arrayList.add(new F(f10));
        }
        return arrayList;
    }

    public y0 getVisibility() {
        int J10 = J();
        return Modifier.isPublic(J10) ? x0.h.f133878c : Modifier.isPrivate(J10) ? x0.e.f133875c : Modifier.isProtected(J10) ? Modifier.isStatic(J10) ? C15819c.f135271c : C15818b.f135270c : C15817a.f135269c;
    }

    public int hashCode() {
        return this.f135792a.hashCode();
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(J());
    }

    public boolean isFinal() {
        return Modifier.isFinal(J());
    }

    public Collection<w> m() {
        Object[] d10 = C15961b.f135764a.d(this.f135792a);
        if (d10 == null) {
            d10 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d10.length);
        for (Object d11 : d10) {
            arrayList.add(new D(d11));
        }
        return arrayList;
    }

    public boolean o() {
        return this.f135792a.isAnnotation();
    }

    public boolean q() {
        Boolean e10 = C15961b.f135764a.e(this.f135792a);
        if (e10 != null) {
            return e10.booleanValue();
        }
        return false;
    }

    public boolean r() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f135792a;
    }

    public boolean x() {
        return this.f135792a.isEnum();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = JI.k.b((r0 = r0.getDeclaredAnnotations()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<JI.C15966g> getAnnotations() {
        /*
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.s()
            if (r0 == 0) goto L_0x0012
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = JI.k.b(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r0 = YH.C16877v.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: JI.q.getAnnotations():java.util.List");
    }

    public C15966g v(C17066c cVar) {
        Annotation[] declaredAnnotations;
        C17542s.j(cVar, "fqName");
        AnnotatedElement s10 = s();
        if (s10 == null || (declaredAnnotations = s10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
