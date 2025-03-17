package xI;

import DI.C15558e;
import DI.C15566m;
import DI.Z;
import DI.a0;
import DI.b0;
import DI.c0;
import EI.C15649h;
import GI.C15718L;
import GI.C15719M;
import MI.C16071o;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import aJ.C17030a;
import bJ.C17045d;
import bJ.C17050i;
import gJ.C17277h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17530f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import uI.C18059h;
import uI.C18060i;
import uI.C18064m;
import vI.C18189b;
import wI.C18217a;
import xI.C18652p;
import xI.a1;
import yI.C18724h;
import yI.C18731o;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 N*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004OPQRB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\t0\t048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0006\u0012\u0002\b\u00030E8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010K\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0014\u0010\u000f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006S"}, d2 = {"LxI/K0;", "V", "LxI/A;", "LuI/m;", "LxI/d0;", "container", "", "name", "signature", "LDI/a0;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(LxI/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(LxI/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "m0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "o0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "LxI/d0;", "b0", "()LxI/d0;", "h", "Ljava/lang/String;", "getName", "i", "s0", "j", "Ljava/lang/Object;", "LXH/o;", "Ljava/lang/reflect/Field;", "k", "LXH/o;", "_javaField", "LxI/a1$a;", "kotlin.jvm.PlatformType", "l", "LxI/a1$a;", "_descriptor", "n0", "()Ljava/lang/Object;", "g0", "()Z", "isBound", "r0", "()Ljava/lang/reflect/Field;", "javaField", "LxI/K0$c;", "q0", "()LxI/K0$c;", "getter", "LyI/h;", "a0", "()LyI/h;", "caller", "c0", "defaultCaller", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "m", "a", "c", "d", "b", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class K0<V> extends C18599A<V> implements C18064m<V> {

    /* renamed from: m  reason: collision with root package name */
    public static final b f152301m = new b((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final Object f152302n = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final C18629d0 f152303g;

    /* renamed from: h  reason: collision with root package name */
    private final String f152304h;

    /* renamed from: i  reason: collision with root package name */
    private final String f152305i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f152306j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o<Field> f152307k;

    /* renamed from: l  reason: collision with root package name */
    private final a1.a<a0> f152308l;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LxI/K0$a;", "PropertyType", "ReturnType", "LxI/A;", "LuI/m$a;", "LuI/h;", "<init>", "()V", "LxI/K0;", "j0", "()LxI/K0;", "property", "LxI/d0;", "b0", "()LxI/d0;", "container", "LyI/h;", "c0", "()LyI/h;", "defaultCaller", "", "g0", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "LDI/Z;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends C18599A<ReturnType> implements C18059h<ReturnType>, C18064m.a<PropertyType> {
        public C18629d0 b0() {
            return j0().b0();
        }

        public C18724h<?> c0() {
            return null;
        }

        public boolean g0() {
            return j0().g0();
        }

        public abstract Z i0();

        public boolean isExternal() {
            return i0().isExternal();
        }

        public boolean isInfix() {
            return i0().isInfix();
        }

        public boolean isInline() {
            return i0().isInline();
        }

        public boolean isOperator() {
            return i0().isOperator();
        }

        public boolean isSuspend() {
            return i0().isSuspend();
        }

        public abstract K0<PropertyType> j0();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxI/K0$b;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"LxI/K0$c;", "V", "LxI/K0$a;", "LuI/m$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LDI/b0;", "g", "LxI/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "LyI/h;", "h", "LXH/o;", "a0", "()LyI/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements C18064m.b<V> {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f152309i = {P.h(new G(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f152310g = a1.c(new L0(this));

        /* renamed from: h  reason: collision with root package name */
        private final C16824o f152311h = C16825p.a(s.PUBLICATION, new M0(this));

        /* access modifiers changed from: private */
        public static final C18724h m0(c cVar) {
            return P0.b(cVar, true);
        }

        /* access modifiers changed from: private */
        public static final b0 n0(c cVar) {
            b0 d10 = cVar.j0().d0().d();
            if (d10 != null) {
                return d10;
            }
            C15718L d11 = C17277h.d(cVar.j0().d0(), C15649h.f134231V.b());
            C17542s.i(d11, "createDefaultGetter(...)");
            return d11;
        }

        public C18724h<?> a0() {
            return (C18724h) this.f152311h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && C17542s.e(j0(), ((c) obj).j0());
        }

        public String getName() {
            return "<get-" + j0().getName() + '>';
        }

        public int hashCode() {
            return j0().hashCode();
        }

        /* renamed from: o0 */
        public b0 i0() {
            Object b10 = this.f152310g.b(this, f152309i[0]);
            C17542s.i(b10, "getValue(...)");
            return (b0) b10;
        }

        public String toString() {
            return "getter of " + j0();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"LxI/K0$d;", "V", "LxI/K0$a;", "LXH/N;", "LuI/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LDI/c0;", "g", "LxI/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "LyI/h;", "h", "LXH/o;", "a0", "()LyI/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d<V> extends a<V, C16807N> implements C18060i.a<V> {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f152312i = {P.h(new G(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f152313g = a1.c(new N0(this));

        /* renamed from: h  reason: collision with root package name */
        private final C16824o f152314h = C16825p.a(s.PUBLICATION, new O0(this));

        /* access modifiers changed from: private */
        public static final C18724h m0(d dVar) {
            return P0.b(dVar, false);
        }

        /* access modifiers changed from: private */
        public static final c0 n0(d dVar) {
            c0 g10 = dVar.j0().d0().g();
            if (g10 != null) {
                return g10;
            }
            a0 p02 = dVar.j0().d0();
            C15649h.a aVar = C15649h.f134231V;
            C15719M e10 = C17277h.e(p02, aVar.b(), aVar.b());
            C17542s.i(e10, "createDefaultSetter(...)");
            return e10;
        }

        public C18724h<?> a0() {
            return (C18724h) this.f152314h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && C17542s.e(j0(), ((d) obj).j0());
        }

        public String getName() {
            return "<set-" + j0().getName() + '>';
        }

        public int hashCode() {
            return j0().hashCode();
        }

        /* renamed from: o0 */
        public c0 i0() {
            Object b10 = this.f152313g.b(this, f152312i[0]);
            C17542s.i(b10, "getValue(...)");
            return (c0) b10;
        }

        public String toString() {
            return "setter of " + j0();
        }
    }

    private K0(C18629d0 d0Var, String str, String str2, a0 a0Var, Object obj) {
        this.f152303g = d0Var;
        this.f152304h = str;
        this.f152305i = str2;
        this.f152306j = obj;
        this.f152307k = C16825p.a(s.PUBLICATION, new I0(this));
        a1.a<a0> b10 = a1.b(a0Var, new J0(this));
        C17542s.i(b10, "lazySoft(...)");
        this.f152308l = b10;
    }

    /* access modifiers changed from: private */
    public static final a0 i0(K0 k02) {
        return k02.b0().J(k02.getName(), k02.f152305i);
    }

    /* access modifiers changed from: private */
    public static final Field j0(K0 k02) {
        Class<?> cls;
        C18652p f10 = f1.f152407a.f(k02.d0());
        if (f10 instanceof C18652p.c) {
            C18652p.c cVar = (C18652p.c) f10;
            a0 b10 = cVar.b();
            C17045d.a d10 = C17050i.d(C17050i.f141191a, cVar.e(), cVar.d(), cVar.g(), false, 8, (Object) null);
            if (d10 == null) {
                return null;
            }
            if (C16071o.e(b10) || C17050i.f(cVar.e())) {
                cls = k02.b0().l().getEnclosingClass();
            } else {
                C15566m b11 = b10.b();
                cls = b11 instanceof C15558e ? j1.q((C15558e) b11) : k02.b0().l();
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(d10.e());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        } else if (f10 instanceof C18652p.a) {
            return ((C18652p.a) f10).b();
        } else {
            if ((f10 instanceof C18652p.b) || (f10 instanceof C18652p.d)) {
                return null;
            }
            throw new t();
        }
    }

    public C18724h<?> a0() {
        return q0().a0();
    }

    public C18629d0 b0() {
        return this.f152303g;
    }

    public C18724h<?> c0() {
        return q0().c0();
    }

    public boolean equals(Object obj) {
        K0<?> d10 = j1.d(obj);
        return d10 != null && C17542s.e(b0(), d10.b0()) && C17542s.e(getName(), d10.getName()) && C17542s.e(this.f152305i, d10.f152305i) && C17542s.e(this.f152306j, d10.f152306j);
    }

    public boolean g0() {
        return this.f152306j != C17530f.NO_RECEIVER;
    }

    public String getName() {
        return this.f152304h;
    }

    public int hashCode() {
        return (((b0().hashCode() * 31) + getName().hashCode()) * 31) + this.f152305i.hashCode();
    }

    public boolean isSuspend() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final Member m0() {
        if (!d0().D()) {
            return null;
        }
        C18652p f10 = f1.f152407a.f(d0());
        if (f10 instanceof C18652p.c) {
            C18652p.c cVar = (C18652p.c) f10;
            if (cVar.f().z()) {
                C17030a.c u10 = cVar.f().u();
                if (!u10.u() || !u10.t()) {
                    return null;
                }
                return b0().I(cVar.d().getString(u10.s()), cVar.d().getString(u10.r()));
            }
        }
        return r0();
    }

    public final Object n0() {
        return C18731o.h(this.f152306j, d0());
    }

    /* access modifiers changed from: protected */
    public final Object o0(Member member, Object obj, Object obj2) {
        try {
            Object obj3 = f152302n;
            if ((obj == obj3 || obj2 == obj3) && d0().O() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object n02 = g0() ? n0() : obj;
            if (n02 == obj3) {
                n02 = null;
            }
            if (!g0()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(C18217a.a(this));
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(n02);
            }
            if (member instanceof Method) {
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke((Object) null, (Object[]) null);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    if (n02 == null) {
                        Class cls = ((Method) member).getParameterTypes()[0];
                        C17542s.i(cls, "get(...)");
                        n02 = j1.g(cls);
                    }
                    return method.invoke((Object) null, new Object[]{n02});
                } else if (length == 2) {
                    Method method2 = (Method) member;
                    if (obj == null) {
                        Class cls2 = ((Method) member).getParameterTypes()[1];
                        C17542s.i(cls2, "get(...)");
                        obj = j1.g(cls2);
                    }
                    return method2.invoke((Object) null, new Object[]{n02, obj});
                } else {
                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
        } catch (IllegalAccessException e10) {
            throw new C18189b(e10);
        }
    }

    /* renamed from: p0 */
    public a0 d0() {
        a0 invoke = this.f152308l.invoke();
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    public abstract c<V> q0();

    public final Field r0() {
        return this.f152307k.getValue();
    }

    public final String s0() {
        return this.f152305i;
    }

    public String toString() {
        return e1.f152401a.k(d0());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public K0(C18629d0 d0Var, String str, String str2, Object obj) {
        this(d0Var, str, str2, (a0) null, obj);
        C17542s.j(d0Var, "container");
        C17542s.j(str, "name");
        C17542s.j(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public K0(xI.C18629d0 r8, DI.a0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            cJ.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.C17542s.i(r3, r0)
            xI.f1 r0 = xI.f1.f152407a
            xI.p r0 = r0.f(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.C17530f.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.K0.<init>(xI.d0, DI.a0):void");
    }
}
