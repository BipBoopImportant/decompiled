package xI;

import DI.C15552X;
import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.d0;
import DI.u0;
import YH.C16870n;
import YH.C16877v;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import mI.C17605c;
import nI.C17631a;
import nI.C17642l;
import tI.C17974j;
import uI.C18063l;
import uI.C18064m;
import uI.C18068q;
import uJ.C18096U;
import xI.a1;
import yI.C18724h;
import yI.C18730n;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0014\u00107\u001a\u0002048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b \u00109¨\u0006<"}, d2 = {"LxI/y0;", "LuI/l;", "LxI/A;", "callable", "", "index", "LuI/l$a;", "kind", "Lkotlin/Function0;", "LDI/X;", "computeDescriptor", "<init>", "(LxI/A;ILuI/l$a;LnI/a;)V", "", "Ljava/lang/reflect/Type;", "types", "x", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LxI/A;", "y", "()LxI/A;", "b", "I", "getIndex", "c", "LuI/l$a;", "h", "()LuI/l$a;", "d", "LxI/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "LuI/q;", "getType", "()LuI/q;", "type", "B", "()Z", "isOptional", "isVararg", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.y0  reason: case insensitive filesystem */
public final class C18671y0 implements C18063l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f152494f;

    /* renamed from: a  reason: collision with root package name */
    private final C18599A<?> f152495a;

    /* renamed from: b  reason: collision with root package name */
    private final int f152496b;

    /* renamed from: c  reason: collision with root package name */
    private final C18063l.a f152497c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.a f152498d;

    /* renamed from: e  reason: collision with root package name */
    private final a1.a f152499e = a1.c(new C18667w0(this));

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LxI/y0$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "b", "I", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.y0$a */
    private static final class a implements Type {

        /* renamed from: a  reason: collision with root package name */
        private final Type[] f152500a;

        /* renamed from: b  reason: collision with root package name */
        private final int f152501b;

        public a(Type[] typeArr) {
            C17542s.j(typeArr, "types");
            this.f152500a = typeArr;
            this.f152501b = Arrays.hashCode(typeArr);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f152500a, ((a) obj).f152500a);
        }

        public String getTypeName() {
            return C16870n.C0(this.f152500a, ", ", "[", "]", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
        }

        public int hashCode() {
            return this.f152501b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    static {
        Class<C18671y0> cls = C18671y0.class;
        f152494f = new C18064m[]{P.h(new G(cls, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), P.h(new G(cls, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    }

    public C18671y0(C18599A<?> a10, int i10, C18063l.a aVar, C17631a<? extends C15552X> aVar2) {
        C17542s.j(a10, "callable");
        C17542s.j(aVar, "kind");
        C17542s.j(aVar2, "computeDescriptor");
        this.f152495a = a10;
        this.f152496b = i10;
        this.f152497c = aVar;
        this.f152498d = a1.c(aVar2);
    }

    /* access modifiers changed from: private */
    public static final Type l(C18671y0 y0Var) {
        List<T> list;
        C15552X z10 = y0Var.z();
        if (!(z10 instanceof d0) || !C17542s.e(j1.i(y0Var.f152495a.d0()), z10) || y0Var.f152495a.d0().h() != C15555b.a.FAKE_OVERRIDE) {
            C18724h<?> a02 = y0Var.f152495a.a0();
            if (a02 instanceof C18730n) {
                if (y0Var.f152495a.g0()) {
                    C18730n nVar = (C18730n) a02;
                    C17974j f10 = nVar.f(y0Var.getIndex() + 1);
                    int q10 = nVar.f(0).q() + 1;
                    list = C16877v.e1(nVar.a(), new C17974j(f10.p() - q10, f10.q() - q10));
                } else {
                    C18730n nVar2 = (C18730n) a02;
                    list = C16877v.e1(nVar2.a(), nVar2.f(y0Var.getIndex()));
                }
                Type[] typeArr = (Type[]) list.toArray(new Type[0]);
                return y0Var.x((Type[]) Arrays.copyOf(typeArr, typeArr.length));
            } else if (!(a02 instanceof C18730n.b)) {
                return a02.a().get(y0Var.getIndex());
            } else {
                Class[] clsArr = (Class[]) ((C18730n.b) a02).e().get(y0Var.getIndex()).toArray(new Class[0]);
                return y0Var.x((Type[]) Arrays.copyOf(clsArr, clsArr.length));
            }
        } else {
            C15566m b10 = y0Var.f152495a.d0().b();
            C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> q11 = j1.q((C15558e) b10);
            if (q11 != null) {
                return q11;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + z10);
        }
    }

    /* access modifiers changed from: private */
    public static final List w(C18671y0 y0Var) {
        return j1.e(y0Var.z());
    }

    private final Type x(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) C16870n.N0(typeArr);
        }
        throw new C17605c("Expected at least 1 type for compound type");
    }

    private final C15552X z() {
        Object b10 = this.f152498d.b(this, f152494f[0]);
        C17542s.i(b10, "getValue(...)");
        return (C15552X) b10;
    }

    public boolean B() {
        C15552X z10 = z();
        u0 u0Var = z10 instanceof u0 ? (u0) z10 : null;
        if (u0Var != null) {
            return C17506e.f(u0Var);
        }
        return false;
    }

    public boolean b() {
        C15552X z10 = z();
        return (z10 instanceof u0) && ((u0) z10).w0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18671y0) {
            C18671y0 y0Var = (C18671y0) obj;
            return C17542s.e(this.f152495a, y0Var.f152495a) && getIndex() == y0Var.getIndex();
        }
    }

    public List<Annotation> getAnnotations() {
        Object b10 = this.f152499e.b(this, f152494f[1]);
        C17542s.i(b10, "getValue(...)");
        return (List) b10;
    }

    public int getIndex() {
        return this.f152496b;
    }

    public String getName() {
        C15552X z10 = z();
        u0 u0Var = z10 instanceof u0 ? (u0) z10 : null;
        if (u0Var == null || u0Var.b().i0()) {
            return null;
        }
        C17069f name = u0Var.getName();
        C17542s.i(name, "getName(...)");
        if (name.B()) {
            return null;
        }
        return name.b();
    }

    public C18068q getType() {
        C18096U type = z().getType();
        C17542s.i(type, "getType(...)");
        return new U0(type, new C18669x0(this));
    }

    public C18063l.a h() {
        return this.f152497c;
    }

    public int hashCode() {
        return (this.f152495a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public String toString() {
        return e1.f152401a.j(this);
    }

    public final C18599A<?> y() {
        return this.f152495a;
    }
}
