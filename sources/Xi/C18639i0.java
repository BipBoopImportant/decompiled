package xI;

import DI.C15555b;
import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.C15579z;
import DI.d0;
import DI.u0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16870n;
import YH.C16877v;
import gJ.C17280k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17530f;
import kotlin.jvm.internal.C17538n;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import lJ.C17555b;
import uI.C18059h;
import uI.C18063l;
import uI.C18064m;
import uJ.C18096U;
import xI.C18644l;
import xI.C18648n;
import xI.a1;
import yI.C18717a;
import yI.C18724h;
import yI.C18725i;
import yI.C18726j;
import yI.C18730n;
import yI.C18731o;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010!J5\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0%2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\u0006\u0012\u0002\b\u00030\u001c8VX\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R!\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8VX\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0014\u0010K\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010-R\u0014\u0010L\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010GR\u0014\u0010M\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010GR\u0014\u0010N\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0014\u0010O\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0014\u0010P\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010G¨\u0006Q"}, d2 = {"LxI/i0;", "LxI/A;", "", "LuI/h;", "Lkotlin/jvm/internal/n;", "LxI/l;", "LxI/d0;", "container", "", "name", "signature", "LDI/z;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "u0", "(LDI/z;)LDI/z;", "Ljava/lang/reflect/Method;", "member", "", "v0", "(Ljava/lang/reflect/Method;)Z", "isCallByToValueClassMangledMethod", "LyI/h;", "p0", "(Ljava/lang/reflect/Method;Z)LyI/h;", "LyI/i$h;", "o0", "(Ljava/lang/reflect/Method;)LyI/i$h;", "n0", "Ljava/lang/reflect/Constructor;", "isDefault", "LyI/i;", "m0", "(Ljava/lang/reflect/Constructor;LDI/z;Z)LyI/i;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "LxI/d0;", "b0", "()LxI/d0;", "h", "Ljava/lang/String;", "i", "Ljava/lang/Object;", "j", "LxI/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "k", "LXH/o;", "a0", "()LyI/h;", "caller", "l", "c0", "defaultCaller", "s0", "()Ljava/lang/Object;", "g0", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.i0  reason: case insensitive filesystem */
public final class C18639i0 extends C18599A<Object> implements C17538n<Object>, C18059h<Object>, C18644l {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f152420m = {P.h(new G(C18639i0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* renamed from: g  reason: collision with root package name */
    private final C18629d0 f152421g;

    /* renamed from: h  reason: collision with root package name */
    private final String f152422h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f152423i;

    /* renamed from: j  reason: collision with root package name */
    private final a1.a f152424j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f152425k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f152426l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C18639i0(C18629d0 d0Var, String str, String str2, C15579z zVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, str, str2, zVar, (i10 & 16) != 0 ? C17530f.NO_RECEIVER : obj);
    }

    /* access modifiers changed from: private */
    public static final C18724h l0(C18639i0 i0Var) {
        Object obj;
        C18724h hVar;
        C18648n g10 = f1.f152407a.g(i0Var.d0());
        if (g10 instanceof C18648n.d) {
            if (i0Var.f0()) {
                Class<?> l10 = i0Var.b0().l();
                Iterable<C18063l> parameters = i0Var.getParameters();
                ArrayList arrayList = new ArrayList(C16877v.y(parameters, 10));
                for (C18063l name : parameters) {
                    String name2 = name.getName();
                    C17542s.g(name2);
                    arrayList.add(name2);
                }
                return new C18717a(l10, arrayList, C18717a.C4328a.POSITIONAL_CALL, C18717a.b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            obj = i0Var.b0().D(((C18648n.d) g10).b());
        } else if (g10 instanceof C18648n.e) {
            C15579z t02 = i0Var.d0();
            C15566m b10 = t02.b();
            C17542s.i(b10, "getContainingDeclaration(...)");
            if (!C17280k.d(b10) || !(t02 instanceof C15565l) || !((C15565l) t02).d0()) {
                C18648n.e eVar = (C18648n.e) g10;
                obj = i0Var.b0().I(eVar.c(), eVar.b());
            } else {
                C15579z t03 = i0Var.d0();
                C18629d0 b02 = i0Var.b0();
                String b11 = ((C18648n.e) g10).b();
                List<u0> j10 = i0Var.d0().j();
                C17542s.i(j10, "getValueParameters(...)");
                return new C18730n.b(t03, b02, b11, j10);
            }
        } else if (g10 instanceof C18648n.c) {
            obj = ((C18648n.c) g10).b();
            C17542s.h(obj, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else if (g10 instanceof C18648n.b) {
            obj = ((C18648n.b) g10).d();
            C17542s.h(obj, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else if (g10 instanceof C18648n.a) {
            List<Method> d10 = ((C18648n.a) g10).d();
            Class<?> l11 = i0Var.b0().l();
            Iterable<Method> iterable = d10;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (Method name3 : iterable) {
                arrayList2.add(name3.getName());
            }
            return new C18717a(l11, arrayList2, C18717a.C4328a.POSITIONAL_CALL, C18717a.b.JAVA, d10);
        } else {
            throw new t();
        }
        if (obj instanceof Constructor) {
            hVar = i0Var.m0((Constructor) obj, i0Var.d0(), false);
        } else if (obj instanceof Method) {
            Method method = (Method) obj;
            hVar = !Modifier.isStatic(method.getModifiers()) ? i0Var.n0(method) : i0Var.d0().getAnnotations().v(j1.j()) != null ? i0Var.o0(method) : i0Var.p0(method, false);
        } else {
            throw new Y0("Could not compute caller for function: " + i0Var.d0() + " (member = " + obj + ')');
        }
        return C18731o.j(hVar, i0Var.d0(), false, 2, (Object) null);
    }

    private final C18725i<Constructor<?>> m0(Constructor<?> constructor, C15579z zVar, boolean z10) {
        return (z10 || !C17555b.f(zVar)) ? g0() ? new C18725i.c(constructor, s0()) : new C18725i.e(constructor) : g0() ? new C18725i.a(constructor, s0()) : new C18725i.b(constructor);
    }

    private final C18725i.h n0(Method method) {
        return g0() ? new C18725i.h.a(method, s0()) : new C18725i.h.e(method);
    }

    private final C18725i.h o0(Method method) {
        return g0() ? new C18725i.h.b(method) : new C18725i.h.f(method);
    }

    private final C18724h<?> p0(Method method, boolean z10) {
        if (!g0()) {
            return new C18725i.h.g(method);
        }
        return new C18725i.h.c(method, z10, v0(method) ? this.f152423i : s0());
    }

    /* access modifiers changed from: private */
    public static final C18724h q0(C18639i0 i0Var) {
        Object obj;
        C18724h hVar;
        f1 f1Var = f1.f152407a;
        C18648n g10 = f1Var.g(i0Var.d0());
        if (g10 instanceof C18648n.e) {
            C15579z t02 = i0Var.d0();
            C15566m b10 = t02.b();
            C17542s.i(b10, "getContainingDeclaration(...)");
            if (!C17280k.d(b10) || !(t02 instanceof C15565l) || !((C15565l) t02).d0()) {
                C15579z u02 = i0Var.u0(i0Var.d0());
                if (u02 != null) {
                    C18648n g11 = f1Var.g(u02);
                    C17542s.h(g11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                    C18648n.e eVar = (C18648n.e) g11;
                    obj = i0Var.b0().F(eVar.c(), eVar.b(), true);
                } else {
                    C18629d0 b02 = i0Var.b0();
                    C18648n.e eVar2 = (C18648n.e) g10;
                    String c10 = eVar2.c();
                    String b11 = eVar2.b();
                    Member b12 = i0Var.a0().b();
                    C17542s.g(b12);
                    obj = b02.F(c10, b11, !Modifier.isStatic(b12.getModifiers()));
                }
            } else {
                throw new Y0(i0Var.d0().b() + " cannot have default arguments");
            }
        } else if (g10 instanceof C18648n.d) {
            if (i0Var.f0()) {
                Class<?> l10 = i0Var.b0().l();
                Iterable<C18063l> parameters = i0Var.getParameters();
                ArrayList arrayList = new ArrayList(C16877v.y(parameters, 10));
                for (C18063l name : parameters) {
                    String name2 = name.getName();
                    C17542s.g(name2);
                    arrayList.add(name2);
                }
                return new C18717a(l10, arrayList, C18717a.C4328a.CALL_BY_NAME, C18717a.b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            obj = i0Var.b0().E(((C18648n.d) g10).b());
        } else if (g10 instanceof C18648n.a) {
            List<Method> d10 = ((C18648n.a) g10).d();
            Class<?> l11 = i0Var.b0().l();
            Iterable<Method> iterable = d10;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (Method name3 : iterable) {
                arrayList2.add(name3.getName());
            }
            return new C18717a(l11, arrayList2, C18717a.C4328a.CALL_BY_NAME, C18717a.b.JAVA, d10);
        } else {
            obj = null;
        }
        if (obj instanceof Constructor) {
            hVar = i0Var.m0((Constructor) obj, i0Var.d0(), true);
        } else if (obj instanceof Method) {
            if (i0Var.d0().getAnnotations().v(j1.j()) != null) {
                C15566m b13 = i0Var.d0().b();
                C17542s.h(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((C15558e) b13).b0()) {
                    hVar = i0Var.o0((Method) obj);
                }
            }
            hVar = i0Var.p0((Method) obj, i0Var.a0().c());
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return C18731o.i(hVar, i0Var.d0(), true);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C15579z r0(C18639i0 i0Var, String str) {
        return i0Var.b0().G(str, i0Var.f152422h);
    }

    private final Object s0() {
        return C18731o.h(this.f152423i, d0());
    }

    private final C15579z u0(C15579z zVar) {
        C15555b bVar;
        List<u0> j10 = zVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        Iterable<u0> iterable = j10;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (u0 B02 : iterable) {
                if (B02.B0()) {
                    return null;
                }
            }
        }
        C15566m b10 = zVar.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        if (!C17280k.g(b10)) {
            return null;
        }
        Member b11 = a0().b();
        C17542s.g(b11);
        if (!Modifier.isStatic(b11.getModifiers())) {
            return null;
        }
        Iterator<C15555b> it = C17506e.z(zVar, false).iterator();
        loop1:
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            List<u0> j11 = bVar.j();
            C17542s.i(j11, "getValueParameters(...)");
            Iterable<u0> iterable2 = j11;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (u0 B03 : iterable2) {
                    if (B03.B0()) {
                        break loop1;
                    }
                }
                continue;
            }
        }
        if (bVar instanceof C15579z) {
            return (C15579z) bVar;
        }
        return null;
    }

    private final boolean v0(Method method) {
        C18096U type;
        d0 L10 = d0().L();
        if (!(L10 == null || (type = L10.getType()) == null || !C17280k.c(type))) {
            Class[] parameterTypes = method.getParameterTypes();
            C17542s.i(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) C16870n.h0(parameterTypes);
            return cls != null && cls.isInterface();
        }
    }

    public C18724h<?> a0() {
        return (C18724h) this.f152425k.getValue();
    }

    public C18629d0 b0() {
        return this.f152421g;
    }

    public C18724h<?> c0() {
        return (C18724h) this.f152426l.getValue();
    }

    public boolean equals(Object obj) {
        C18639i0 c10 = j1.c(obj);
        return c10 != null && C17542s.e(b0(), c10.b0()) && C17542s.e(getName(), c10.getName()) && C17542s.e(this.f152422h, c10.f152422h) && C17542s.e(this.f152423i, c10.f152423i);
    }

    public boolean g0() {
        return this.f152423i != C17530f.NO_RECEIVER;
    }

    public int getArity() {
        return C18726j.a(a0());
    }

    public String getName() {
        String b10 = d0().getName().b();
        C17542s.i(b10, "asString(...)");
        return b10;
    }

    public int hashCode() {
        return (((b0().hashCode() * 31) + getName().hashCode()) * 31) + this.f152422h.hashCode();
    }

    public Object invoke() {
        return C18644l.a.a(this);
    }

    public boolean isExternal() {
        return d0().isExternal();
    }

    public boolean isInfix() {
        return d0().isInfix();
    }

    public boolean isInline() {
        return d0().isInline();
    }

    public boolean isOperator() {
        return d0().isOperator();
    }

    public boolean isSuspend() {
        return d0().isSuspend();
    }

    public Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return C18644l.a.e(this, obj, obj2, obj3, obj4);
    }

    public Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return C18644l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: t0 */
    public C15579z d0() {
        Object b10 = this.f152424j.b(this, f152420m[0]);
        C17542s.i(b10, "getValue(...)");
        return (C15579z) b10;
    }

    public String toString() {
        return e1.f152401a.f(d0());
    }

    public Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return C18644l.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return C18644l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    public Object invoke(Object obj) {
        return C18644l.a.b(this, obj);
    }

    private C18639i0(C18629d0 d0Var, String str, String str2, C15579z zVar, Object obj) {
        this.f152421g = d0Var;
        this.f152422h = str2;
        this.f152423i = obj;
        this.f152424j = a1.b(zVar, new C18633f0(this, str));
        s sVar = s.PUBLICATION;
        this.f152425k = C16825p.a(sVar, new C18635g0(this));
        this.f152426l = C16825p.a(sVar, new C18637h0(this));
    }

    public Object invoke(Object obj, Object obj2) {
        return C18644l.a.c(this, obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return C18644l.a.d(this, obj, obj2, obj3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18639i0(C18629d0 d0Var, String str, String str2, Object obj) {
        this(d0Var, str, str2, (C15579z) null, obj);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18639i0(xI.C18629d0 r10, DI.C15579z r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            cJ.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.C17542s.i(r3, r0)
            xI.f1 r0 = xI.f1.f152407a
            xI.n r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.C18639i0.<init>(xI.d0, DI.z):void");
    }
}
