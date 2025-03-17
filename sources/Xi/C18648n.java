package xI;

import JI.C15965f;
import YH.C16870n;
import YH.C16877v;
import bI.C17035a;
import bJ.C17045d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LxI/n;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "e", "d", "c", "b", "LxI/n$a;", "LxI/n$b;", "LxI/n$c;", "LxI/n$d;", "LxI/n$e;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.n  reason: case insensitive filesystem */
public abstract class C18648n {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LxI/n$a;", "LxI/n;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.n$a */
    public static final class a extends C18648n {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f152441a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Method> f152442b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xI.n$a$a  reason: collision with other inner class name */
        public static final class C4325a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e(((Method) t10).getName(), ((Method) t11).getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cls, "jClass");
            this.f152441a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C17542s.i(declaredMethods, "getDeclaredMethods(...)");
            this.f152442b = C16870n.S0(declaredMethods, new C4325a());
        }

        /* access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            C17542s.i(returnType, "getReturnType(...)");
            return C15965f.f(returnType);
        }

        public String a() {
            return C16877v.G0(this.f152442b, "", "<init>(", ")V", 0, (CharSequence) null, C18646m.f152438a, 24, (Object) null);
        }

        public final List<Method> d() {
            return this.f152442b;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LxI/n$b;", "LxI/n;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "d", "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.n$b */
    public static final class b extends C18648n {

        /* renamed from: a  reason: collision with root package name */
        private final Constructor<?> f152443a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super((DefaultConstructorMarker) null);
            C17542s.j(constructor, "constructor");
            this.f152443a = constructor;
        }

        /* access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            C17542s.g(cls);
            return C15965f.f(cls);
        }

        public String a() {
            Class[] parameterTypes = this.f152443a.getParameterTypes();
            C17542s.i(parameterTypes, "getParameterTypes(...)");
            return C16870n.C0(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C18650o.f152450a, 24, (Object) null);
        }

        public final Constructor<?> d() {
            return this.f152443a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LxI/n$c;", "LxI/n;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.n$c */
    public static final class c extends C18648n {

        /* renamed from: a  reason: collision with root package name */
        private final Method f152444a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super((DefaultConstructorMarker) null);
            C17542s.j(method, "method");
            this.f152444a = method;
        }

        public String a() {
            return h1.d(this.f152444a);
        }

        public final Method b() {
            return this.f152444a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"LxI/n$d;", "LxI/n;", "LbJ/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "LbJ/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.n$d */
    public static final class d extends C18648n {

        /* renamed from: a  reason: collision with root package name */
        private final C17045d.b f152445a;

        /* renamed from: b  reason: collision with root package name */
        private final String f152446b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17045d.b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "signature");
            this.f152445a = bVar;
            this.f152446b = bVar.a();
        }

        public String a() {
            return this.f152446b;
        }

        public final String b() {
            return this.f152445a.d();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"LxI/n$e;", "LxI/n;", "LbJ/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "LbJ/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.n$e */
    public static final class e extends C18648n {

        /* renamed from: a  reason: collision with root package name */
        private final C17045d.b f152447a;

        /* renamed from: b  reason: collision with root package name */
        private final String f152448b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17045d.b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "signature");
            this.f152447a = bVar;
            this.f152448b = bVar.a();
        }

        public String a() {
            return this.f152448b;
        }

        public final String b() {
            return this.f152447a.d();
        }

        public final String c() {
            return this.f152447a.e();
        }
    }

    public /* synthetic */ C18648n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private C18648n() {
    }
}
