package xI;

import DI.C15535F;
import DI.C15552X;
import DI.C15555b;
import DI.C15574u;
import DI.d0;
import DI.n0;
import DI.u0;
import OI.C16159a;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16870n;
import YH.C16877v;
import bI.C17035a;
import dI.C17164e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18054c;
import uI.C18063l;
import uI.C18068q;
import uI.C18069r;
import uI.C18072u;
import uJ.C18096U;
import uJ.I0;
import vI.C18188a;
import wI.C18218b;
import wI.c;
import xI.a1;
import yI.C18724h;
import yI.C18731o;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010\u001f\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&RD\u0010+\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n $*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010(j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`)0(j\b\u0012\u0004\u0012\u00020\n`)0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\"\u0010.\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010,0,0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010&R.\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ $*\n\u0012\u0004\u0012\u00020/\u0018\u00010\"0\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010&R2\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0006\u0012\u0002\b\u0003098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u0001098&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0\"8VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010M\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N0\"8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0014\u0010V\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0014\u0010W\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010DR\u0014\u0010Y\u001a\u0002058DX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010DR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"LxI/A;", "R", "LuI/c;", "LxI/X0;", "<init>", "()V", "", "", "Z", "()[Ljava/lang/Object;", "LuI/l;", "parameter", "", "e0", "(LuI/l;)I", "", "args", "V", "(Ljava/util/Map;)Ljava/lang/Object;", "LuI/q;", "type", "X", "(LuI/q;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "Y", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "LdI/e;", "continuationArgument", "W", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LxI/a1$a;", "", "", "kotlin.jvm.PlatformType", "a", "LxI/a1$a;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "_parameters", "LxI/U0;", "c", "_returnType", "LxI/W0;", "d", "_typeParameters", "e", "_absentArguments", "LXH/o;", "", "f", "LXH/o;", "parametersNeedMFVCFlattening", "LyI/h;", "a0", "()LyI/h;", "caller", "c0", "defaultCaller", "LxI/d0;", "b0", "()LxI/d0;", "container", "g0", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()LuI/q;", "returnType", "LuI/r;", "getTypeParameters", "typeParameters", "LuI/u;", "getVisibility", "()LuI/u;", "visibility", "isFinal", "isOpen", "isAbstract", "f0", "isAnnotationConstructor", "LDI/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.A  reason: case insensitive filesystem */
public abstract class C18599A<R> implements C18054c<R>, X0 {

    /* renamed from: a  reason: collision with root package name */
    private final a1.a<List<Annotation>> f152269a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<ArrayList<C18063l>> f152270b;

    /* renamed from: c  reason: collision with root package name */
    private final a1.a<U0> f152271c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.a<List<W0>> f152272d;

    /* renamed from: e  reason: collision with root package name */
    private final a1.a<Object[]> f152273e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o<Boolean> f152274f = C16825p.a(s.PUBLICATION, new C18664v(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.A$a */
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((C18063l) t10).getName(), ((C18063l) t11).getName());
        }
    }

    public C18599A() {
        a1.a<List<Annotation>> c10 = a1.c(new C18654q(this));
        C17542s.i(c10, "lazySoft(...)");
        this.f152269a = c10;
        a1.a<ArrayList<C18063l>> c11 = a1.c(new C18656r(this));
        C17542s.i(c11, "lazySoft(...)");
        this.f152270b = c11;
        a1.a<U0> c12 = a1.c(new C18658s(this));
        C17542s.i(c12, "lazySoft(...)");
        this.f152271c = c12;
        a1.a<List<W0>> c13 = a1.c(new C18660t(this));
        C17542s.i(c13, "lazySoft(...)");
        this.f152272d = c13;
        a1.a<Object[]> c14 = a1.c(new C18662u(this));
        C17542s.i(c14, "lazySoft(...)");
        this.f152273e = c14;
    }

    /* access modifiers changed from: private */
    public static final Object[] C(C18599A a10) {
        int i10;
        List<C18063l> parameters = a10.getParameters();
        int size = parameters.size() + (a10.isSuspend() ? 1 : 0);
        if (a10.f152274f.getValue().booleanValue()) {
            i10 = 0;
            for (C18063l lVar : parameters) {
                i10 += lVar.h() == C18063l.a.VALUE ? a10.e0(lVar) : 0;
            }
        } else {
            Iterable<C18063l> iterable = parameters;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i10 = 0;
                for (C18063l h10 : iterable) {
                    if (h10.h() == C18063l.a.VALUE && (i10 = i10 + 1) < 0) {
                        C16877v.w();
                    }
                }
            } else {
                i10 = 0;
            }
        }
        int i11 = (i10 + 31) / 32;
        Object[] objArr = new Object[(size + i11 + 1)];
        for (C18063l lVar2 : parameters) {
            if (lVar2.B() && !j1.l(lVar2.getType())) {
                objArr[lVar2.getIndex()] = j1.g(c.f(lVar2.getType()));
            } else if (lVar2.b()) {
                objArr[lVar2.getIndex()] = a10.X(lVar2.getType());
            }
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[size + i12] = 0;
        }
        return objArr;
    }

    /* access modifiers changed from: private */
    public static final List D(C18599A a10) {
        return j1.e(a10.d0());
    }

    /* access modifiers changed from: private */
    public static final ArrayList E(C18599A a10) {
        int i10;
        C15555b d02 = a10.d0();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (!a10.g0()) {
            d0 i12 = j1.i(d02);
            if (i12 != null) {
                arrayList.add(new C18671y0(a10, 0, C18063l.a.INSTANCE, new C18666w(i12)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            d0 O10 = d02.O();
            if (O10 != null) {
                arrayList.add(new C18671y0(a10, i10, C18063l.a.EXTENSION_RECEIVER, new C18668x(O10)));
                i10++;
            }
        } else {
            i10 = 0;
        }
        int size = d02.j().size();
        while (i11 < size) {
            arrayList.add(new C18671y0(a10, i10, C18063l.a.VALUE, new C18670y(d02, i11)));
            i11++;
            i10++;
        }
        if (a10.f0() && (d02 instanceof C16159a) && arrayList.size() > 1) {
            C16877v.C(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C15552X F(d0 d0Var) {
        return d0Var;
    }

    /* access modifiers changed from: private */
    public static final C15552X G(d0 d0Var) {
        return d0Var;
    }

    /* access modifiers changed from: private */
    public static final C15552X H(C15555b bVar, int i10) {
        u0 u0Var = bVar.j().get(i10);
        C17542s.i(u0Var, "get(...)");
        return u0Var;
    }

    /* access modifiers changed from: private */
    public static final U0 I(C18599A a10) {
        C18096U returnType = a10.d0().getReturnType();
        C17542s.g(returnType);
        return new U0(returnType, new C18672z(a10));
    }

    /* access modifiers changed from: private */
    public static final Type J(C18599A a10) {
        Type Y10 = a10.Y();
        return Y10 == null ? a10.a0().getReturnType() : Y10;
    }

    /* access modifiers changed from: private */
    public static final List K(C18599A a10) {
        List<n0> typeParameters = a10.d0().getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        Iterable<n0> iterable = typeParameters;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (n0 n0Var : iterable) {
            C17542s.g(n0Var);
            arrayList.add(new W0(a10, n0Var));
        }
        return arrayList;
    }

    private final R V(Map<C18063l, ? extends Object> map) {
        Object obj;
        Iterable<C18063l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C16877v.y(parameters, 10));
        for (C18063l lVar : parameters) {
            if (map.containsKey(lVar)) {
                obj = map.get(lVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + lVar + ')');
                }
            } else if (lVar.B()) {
                obj = null;
            } else if (lVar.b()) {
                obj = X(lVar.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
            }
            arrayList.add(obj);
        }
        C18724h<?> c02 = c0();
        if (c02 != null) {
            try {
                return c02.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new C18188a(e10);
            }
        } else {
            throw new Y0("This callable does not support a default call: " + d0());
        }
    }

    private final Object X(C18068q qVar) {
        Class<?> b10 = C17603a.b(C18218b.b(qVar));
        if (b10.isArray()) {
            Object newInstance = Array.newInstance(b10.getComponentType(), 0);
            C17542s.i(newInstance, "run(...)");
            return newInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + b10.getSimpleName() + ", because it is not an array type");
    }

    private final Type Y() {
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object K02 = C16877v.K0(a0().a());
        ParameterizedType parameterizedType = K02 instanceof ParameterizedType ? (ParameterizedType) K02 : null;
        if (!C17542s.e(parameterizedType != null ? parameterizedType.getRawType() : null, C17164e.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C17542s.i(actualTypeArguments, "getActualTypeArguments(...)");
        Object N02 = C16870n.N0(actualTypeArguments);
        WildcardType wildcardType = N02 instanceof WildcardType ? (WildcardType) N02 : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C16870n.f0(lowerBounds);
    }

    private final Object[] Z() {
        return (Object[]) this.f152273e.invoke().clone();
    }

    private final int e0(C18063l lVar) {
        if (!this.f152274f.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        } else if (!j1.k(lVar.getType())) {
            return 1;
        } else {
            C18068q type = lVar.getType();
            C17542s.h(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            List<Method> n10 = C18731o.n(I0.a(((U0) type).F()));
            C17542s.g(n10);
            return n10.size();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean h0(C18599A a10) {
        Iterable<C18063l> parameters = a10.getParameters();
        if ((parameters instanceof Collection) && ((Collection) parameters).isEmpty()) {
            return false;
        }
        for (C18063l type : parameters) {
            if (j1.k(type.getType())) {
                return true;
            }
        }
        return false;
    }

    public final R W(Map<C18063l, ? extends Object> map, C17164e<?> eVar) {
        C17542s.j(map, "args");
        List<C18063l> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return a0().call(isSuspend() ? new C17164e[]{eVar} : new C17164e[0]);
            } catch (IllegalAccessException e10) {
                throw new C18188a(e10);
            }
        } else {
            int size = parameters.size() + (isSuspend() ? 1 : 0);
            Object[] Z10 = Z();
            if (isSuspend()) {
                Z10[parameters.size()] = eVar;
            }
            boolean booleanValue = this.f152274f.getValue().booleanValue();
            int i10 = 0;
            for (C18063l next : parameters) {
                int e02 = booleanValue ? e0(next) : 1;
                if (map.containsKey(next)) {
                    Z10[next.getIndex()] = map.get(next);
                } else if (next.B()) {
                    if (booleanValue) {
                        int i11 = i10 + e02;
                        for (int i12 = i10; i12 < i11; i12++) {
                            int i13 = (i12 / 32) + size;
                            Object obj = Z10[i13];
                            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
                            Z10[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                        }
                    } else {
                        int i14 = (i10 / 32) + size;
                        Object obj2 = Z10[i14];
                        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                        Z10[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                    }
                    z10 = true;
                } else if (!next.b()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.h() == C18063l.a.VALUE) {
                    i10 += e02;
                }
            }
            if (!z10) {
                try {
                    C18724h<?> a02 = a0();
                    Object[] copyOf = Arrays.copyOf(Z10, size);
                    C17542s.i(copyOf, "copyOf(...)");
                    return a02.call(copyOf);
                } catch (IllegalAccessException e11) {
                    throw new C18188a(e11);
                }
            } else {
                C18724h<?> c02 = c0();
                if (c02 != null) {
                    try {
                        return c02.call(Z10);
                    } catch (IllegalAccessException e12) {
                        throw new C18188a(e12);
                    }
                } else {
                    throw new Y0("This callable does not support a default call: " + d0());
                }
            }
        }
    }

    public abstract C18724h<?> a0();

    public abstract C18629d0 b0();

    public abstract C18724h<?> c0();

    public R call(Object... objArr) {
        C17542s.j(objArr, "args");
        try {
            return a0().call(objArr);
        } catch (IllegalAccessException e10) {
            throw new C18188a(e10);
        }
    }

    public R callBy(Map<C18063l, ? extends Object> map) {
        C17542s.j(map, "args");
        return f0() ? V(map) : W(map, (C17164e<?>) null);
    }

    public abstract C15555b d0();

    /* access modifiers changed from: protected */
    public final boolean f0() {
        return C17542s.e(getName(), "<init>") && b0().l().isAnnotation();
    }

    public abstract boolean g0();

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f152269a.invoke();
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    public List<C18063l> getParameters() {
        ArrayList<C18063l> invoke = this.f152270b.invoke();
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    public C18068q getReturnType() {
        U0 invoke = this.f152271c.invoke();
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    public List<C18069r> getTypeParameters() {
        List<W0> invoke = this.f152272d.invoke();
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    public C18072u getVisibility() {
        C15574u visibility = d0().getVisibility();
        C17542s.i(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    public boolean isAbstract() {
        return d0().u() == C15535F.ABSTRACT;
    }

    public boolean isFinal() {
        return d0().u() == C15535F.FINAL;
    }

    public boolean isOpen() {
        return d0().u() == C15535F.OPEN;
    }
}
