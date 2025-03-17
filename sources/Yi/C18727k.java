package yI;

import YH.C16870n;
import YH.C16877v;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yI.C18724h;
import yI.C18725i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0011\u000fB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"LyI/k;", "LyI/h;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "instance", "", "args", "d", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "f", "()Ljava/lang/reflect/Method;", "member", "LyI/k$a;", "LyI/k$b;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yI.k  reason: case insensitive filesystem */
public abstract class C18727k implements C18724h<Method> {

    /* renamed from: a  reason: collision with root package name */
    private final Method f152737a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Type> f152738b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f152739c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyI/k$a;", "LyI/k;", "LyI/g;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.k$a */
    public static final class a extends C18727k implements C18723g {

        /* renamed from: d  reason: collision with root package name */
        private final Object f152740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, C16877v.n(), (DefaultConstructorMarker) null);
            C17542s.j(method, "unboxMethod");
            this.f152740d = obj;
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            e(objArr);
            return d(this.f152740d, objArr);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/k$b;", "LyI/k;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.k$b */
    public static final class b extends C18727k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, C16877v.e(method.getDeclaringClass()), (DefaultConstructorMarker) null);
            C17542s.j(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            e(objArr);
            Object obj = objArr[0];
            C18725i.d dVar = C18725i.f152722e;
            return d(obj, objArr.length <= 1 ? new Object[0] : C16870n.u(objArr, 1, objArr.length));
        }
    }

    public /* synthetic */ C18727k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    public final List<Type> a() {
        return this.f152738b;
    }

    public boolean c() {
        return C18724h.a.b(this);
    }

    /* access modifiers changed from: protected */
    public final Object d(Object obj, Object[] objArr) {
        C17542s.j(objArr, "args");
        return this.f152737a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public void e(Object[] objArr) {
        C18724h.a.a(this, objArr);
    }

    /* renamed from: f */
    public final Method b() {
        return null;
    }

    public final Type getReturnType() {
        return this.f152739c;
    }

    private C18727k(Method method, List<? extends Type> list) {
        this.f152737a = method;
        this.f152738b = list;
        Class<?> returnType = method.getReturnType();
        C17542s.i(returnType, "getReturnType(...)");
        this.f152739c = returnType;
    }
}
