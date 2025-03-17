package xI;

import DI.C15555b;
import DI.C15565l;
import DI.C15573t;
import DI.C15574u;
import DI.C15579z;
import DI.a0;
import HJ.C15846l;
import HJ.C15850p;
import HJ.C15854t;
import II.C15896e;
import II.C15902k;
import JI.C15965f;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import cJ.C17069f;
import fI.C17221b;
import fJ.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17532h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.p;
import uI.C18064m;
import xI.a1;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMNKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J)\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040'2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bC\u0010BR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, d2 = {"LxI/d0;", "Lkotlin/jvm/internal/h;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "T", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "X", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "W", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "LXH/N;", "C", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "LxI/d0$c;", "U", "(Ljava/lang/String;Z)LxI/d0$c;", "", "begin", "end", "V", "(Ljava/lang/String;II)Ljava/lang/Class;", "LcJ/f;", "", "LDI/a0;", "S", "(LcJ/f;)Ljava/util/Collection;", "LDI/z;", "O", "index", "P", "(I)LDI/a0;", "LnJ/k;", "scope", "LxI/d0$d;", "belonginess", "LxI/A;", "Q", "(LnJ/k;LxI/d0$d;)Ljava/util/Collection;", "signature", "J", "(Ljava/lang/String;Ljava/lang/String;)LDI/a0;", "G", "(Ljava/lang/String;Ljava/lang/String;)LDI/z;", "I", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "F", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "D", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "E", "R", "()Ljava/lang/Class;", "methodOwner", "LDI/l;", "N", "()Ljava/util/Collection;", "constructorDescriptors", "a", "b", "d", "c", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.d0  reason: case insensitive filesystem */
public abstract class C18629d0 implements C17532h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f152390a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f152391b = DefaultConstructorMarker.class;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C15850p f152392c = new C15850p("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LxI/d0$a;", "", "<init>", "()V", "LHJ/p;", "LOCAL_PROPERTY_SIGNATURE", "LHJ/p;", "a", "()LHJ/p;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15850p a() {
            return C18629d0.f152392c;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LxI/d0$b;", "", "<init>", "(LxI/d0;)V", "LII/k;", "a", "LxI/a1$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.d0$b */
    public abstract class b {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f152393c = {P.h(new G(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* renamed from: a  reason: collision with root package name */
        private final a1.a f152394a;

        public b() {
            this.f152394a = a1.c(new C18631e0(C18629d0.this));
        }

        /* access modifiers changed from: private */
        public static final C15902k c(C18629d0 d0Var) {
            return Z0.a(d0Var.l());
        }

        public final C15902k b() {
            Object b10 = this.f152394a.b(this, f152393c[0]);
            C17542s.i(b10, "getValue(...)");
            return (C15902k) b10;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LxI/d0$c;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.d0$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final List<Class<?>> f152396a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f152397b;

        public c(List<? extends Class<?>> list, Class<?> cls) {
            C17542s.j(list, "parameters");
            this.f152396a = list;
            this.f152397b = cls;
        }

        public final List<Class<?>> a() {
            return this.f152396a;
        }

        public final Class<?> b() {
            return this.f152397b;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LxI/d0$d;", "", "<init>", "(Ljava/lang/String;I)V", "LDI/b;", "member", "", "b", "(LDI/b;)Z", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.d0$d */
    protected enum d {
        DECLARED,
        INHERITED;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        public final boolean b(C15555b bVar) {
            C17542s.j(bVar, "member");
            return bVar.h().a() == (this == DECLARED);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"xI/d0$e", "LxI/j;", "LDI/l;", "descriptor", "LXH/N;", "data", "LxI/A;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;LXH/N;)LxI/A;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.d0$e */
    public static final class e extends C18640j {
        e(C18629d0 d0Var) {
            super(d0Var);
        }

        /* renamed from: r */
        public C18599A<?> c(C15565l lVar, C16807N n10) {
            C17542s.j(lVar, "descriptor");
            C17542s.j(n10, "data");
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    private final void C(List<Class<?>> list, List<? extends Class<?>> list2, boolean z10) {
        if (C17542s.e(C16877v.K0(list2), f152391b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            C17542s.i(cls, "TYPE");
            list.add(cls);
        }
        Class cls2 = z10 ? f152391b : Object.class;
        C17542s.g(cls2);
        list.add(cls2);
    }

    /* access modifiers changed from: private */
    public static final CharSequence H(C15579z zVar) {
        C17542s.j(zVar, "descriptor");
        return n.f143183k.M(zVar) + " | " + f1.f152407a.g(zVar).a();
    }

    /* access modifiers changed from: private */
    public static final int K(C15574u uVar, C15574u uVar2) {
        Integer d10 = C15573t.d(uVar, uVar2);
        if (d10 != null) {
            return d10.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int L(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence M(a0 a0Var) {
        C17542s.j(a0Var, "descriptor");
        return n.f143183k.M(a0Var) + " | " + f1.f152407a.f(a0Var).a();
    }

    private final Method T(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z10) {
        Method T10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method X10 = X(cls, str, clsArr, cls2);
        if (X10 != null) {
            return X10;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (T10 = T(superclass, str, clsArr, cls2, z10)) != null) {
            return T10;
        }
        Iterator a10 = C17527c.a(cls.getInterfaces());
        while (a10.hasNext()) {
            Class<?> cls3 = (Class) a10.next();
            C17542s.g(cls3);
            Method T11 = T(cls3, str, clsArr, cls2, z10);
            if (T11 != null) {
                return T11;
            }
            if (z10) {
                ClassLoader j10 = C15965f.j(cls3);
                Class<?> a11 = C15896e.a(j10, cls3.getName() + "$DefaultImpls");
                if (a11 != null) {
                    clsArr[0] = cls3;
                    Method X11 = X(a11, str, clsArr, cls2);
                    if (X11 != null) {
                        return X11;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c U(String str, boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (true) {
            Class<?> cls = null;
            if (str.charAt(i11) != ')') {
                int i12 = i11;
                while (str.charAt(i12) == '[') {
                    i12++;
                }
                char charAt = str.charAt(i12);
                if (C15854t.c0("VZCBSIFJD", charAt, false, 2, (Object) null)) {
                    i10 = i12 + 1;
                } else if (charAt == 'L') {
                    i10 = C15854t.r0(str, ';', i11, false, 4, (Object) null) + 1;
                } else {
                    throw new Y0("Unknown type prefix in the method signature: " + str);
                }
                arrayList.add(V(str, i11, i10));
                i11 = i10;
            } else {
                if (z10) {
                    cls = V(str, i11 + 1, str.length());
                }
                return new c(arrayList, cls);
            }
        }
    }

    private final Class<?> V(String str, int i10, int i11) {
        char charAt = str.charAt(i10);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader j10 = C15965f.j(l());
            String substring = str.substring(i10 + 1, i11 - 1);
            C17542s.i(substring, "substring(...)");
            Class<?> loadClass = j10.loadClass(C15854t.P(substring, '/', '.', false, 4, (Object) null));
            C17542s.i(loadClass, "loadClass(...)");
            return loadClass;
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                C17542s.i(cls, "TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return j1.f(V(str, i10 + 1, i11));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new Y0("Unknown type prefix in the method signature: " + str);
                }
            }
        }
    }

    private final Constructor<?> W(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method X(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C17542s.e(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C17542s.i(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (C17542s.e(method.getName(), str) && C17542s.e(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Constructor<?> D(String str) {
        C17542s.j(str, "desc");
        return W(l(), U(str, false).a());
    }

    public final Constructor<?> E(String str) {
        C17542s.j(str, "desc");
        Class<?> l10 = l();
        ArrayList arrayList = new ArrayList();
        C(arrayList, U(str, false).a(), true);
        C16807N n10 = C16807N.f139792a;
        return W(l10, arrayList);
    }

    public final Method F(String str, String str2, boolean z10) {
        C17542s.j(str, "name");
        C17542s.j(str2, "desc");
        if (C17542s.e(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(l());
        }
        c U10 = U(str2, true);
        C(arrayList, U10.a(), false);
        Class<?> R10 = R();
        Class<?> b10 = U10.b();
        C17542s.g(b10);
        return T(R10, str + "$default", (Class[]) arrayList.toArray(new Class[0]), b10, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x002a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final DI.C15579z G(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "<init>"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r14, r0)
            if (r0 == 0) goto L_0x00c2
            java.util.Collection r0 = r13.N()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.t1(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r1.next()
            r4 = r3
            DI.l r4 = (DI.C15565l) r4
            boolean r5 = r4.d0()
            if (r5 == 0) goto L_0x00ad
            DI.i r5 = r4.b()
            java.lang.String r6 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            boolean r5 = gJ.C17280k.d(r5)
            if (r5 == 0) goto L_0x00ad
            xI.f1 r5 = xI.f1.f152407a
            xI.n r5 = r5.g(r4)
            java.lang.String r5 = r5.a()
            java.lang.String r7 = "constructor-impl"
            r8 = 0
            r9 = 2
            r10 = 0
            boolean r7 = HJ.C15854t.W(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L_0x008a
            java.lang.String r7 = ")V"
            boolean r7 = HJ.C15854t.G(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L_0x008a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "V"
            java.lang.String r5 = HJ.C15854t.P0(r5, r8)
            r7.append(r5)
            DI.i r4 = r4.b()
            kotlin.jvm.internal.C17542s.i(r4, r6)
            java.lang.String r4 = yI.C18731o.u(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x00b7
        L_0x008a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Invalid signature of "
            r14.append(r15)
            r14.append(r4)
            java.lang.String r15 = ": "
            r14.append(r15)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        L_0x00ad:
            xI.f1 r5 = xI.f1.f152407a
            xI.n r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
        L_0x00b7:
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r15)
            if (r4 == 0) goto L_0x002a
            r2.add(r3)
            goto L_0x002a
        L_0x00c2:
            cJ.f r0 = cJ.C17069f.v(r14)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.util.Collection r0 = r13.O(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r1.next()
            r4 = r3
            DI.z r4 = (DI.C15579z) r4
            xI.f1 r5 = xI.f1.f152407a
            xI.n r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r15)
            if (r4 == 0) goto L_0x00db
            r2.add(r3)
            goto L_0x00db
        L_0x00fc:
            int r1 = r2.size()
            r3 = 1
            if (r1 == r3) goto L_0x015e
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            xI.c0 r10 = xI.C18627c0.f152387a
            r11 = 30
            r12 = 0
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = YH.C16877v.G0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            xI.Y0 r1 = new xI.Y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Function '"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = "' (JVM signature: "
            r2.append(r14)
            r2.append(r15)
            java.lang.String r14 = ") not resolved in "
            r2.append(r14)
            r2.append(r13)
            r14 = 58
            r2.append(r14)
            int r14 = r0.length()
            if (r14 != 0) goto L_0x0142
            java.lang.String r14 = " no members found"
            goto L_0x0153
        L_0x0142:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 10
            r14.append(r15)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
        L_0x0153:
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x015e:
            java.lang.Object r14 = YH.C16877v.b1(r2)
            DI.z r14 = (DI.C15579z) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.C18629d0.G(java.lang.String, java.lang.String):DI.z");
    }

    public final Method I(String str, String str2) {
        Method T10;
        C17542s.j(str, "name");
        C17542s.j(str2, "desc");
        if (C17542s.e(str, "<init>")) {
            return null;
        }
        c U10 = U(str2, true);
        Class[] clsArr = (Class[]) U10.a().toArray(new Class[0]);
        Class<?> b10 = U10.b();
        C17542s.g(b10);
        Method T11 = T(R(), str, clsArr, b10, false);
        if (T11 != null) {
            return T11;
        }
        if (!R().isInterface() || (T10 = T(Object.class, str, clsArr, b10, false)) == null) {
            return null;
        }
        return T10;
    }

    public final a0 J(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C17542s.j(str4, "name");
        C17542s.j(str5, "signature");
        C15846l h10 = f152392c.h(str5);
        if (h10 != null) {
            String str6 = h10.a().a().b().get(1);
            a0 P10 = P(Integer.parseInt(str6));
            if (P10 != null) {
                return P10;
            }
            throw new Y0("Local property #" + str6 + " not found in " + l());
        }
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        ArrayList arrayList = new ArrayList();
        for (Object next : S(v10)) {
            if (C17542s.e(f1.f152407a.f((a0) next).a(), str5)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + str4 + "' (JVM signature: " + str5 + ") not resolved in " + this);
        } else if (arrayList.size() == 1) {
            return (a0) C16877v.b1(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                C15574u visibility = ((a0) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = X.i(linkedHashMap, new C18623a0(Z.f152379a)).values();
            C17542s.i(values, "<get-values>(...)");
            List list = (List) C16877v.H0(values);
            if (list.size() == 1) {
                C17542s.g(list);
                return (a0) C16877v.w0(list);
            }
            C17069f v11 = C17069f.v(str);
            C17542s.i(v11, "identifier(...)");
            String G02 = C16877v.G0(S(v11), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C18625b0.f152385a, 30, (Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Property '");
            sb2.append(str4);
            sb2.append("' (JVM signature: ");
            sb2.append(str5);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(':');
            if (G02.length() == 0) {
                str3 = " no members found";
            } else {
                str3 = 10 + G02;
            }
            sb2.append(str3);
            throw new Y0(sb2.toString());
        }
    }

    public abstract Collection<C15565l> N();

    public abstract Collection<C15579z> O(C17069f fVar);

    public abstract a0 P(int i10);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<xI.C18599A<?>> Q(nJ.C17656k r8, xI.C18629d0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            xI.d0$e r0 = new xI.d0$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = nJ.C17659n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0020:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r8.next()
            DI.m r3 = (DI.C15566m) r3
            boolean r4 = r3 instanceof DI.C15555b
            if (r4 == 0) goto L_0x004e
            r4 = r3
            DI.b r4 = (DI.C15555b) r4
            DI.u r5 = r4.getVisibility()
            DI.u r6 = DI.C15573t.f133856h
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 != 0) goto L_0x004e
            boolean r4 = r9.b(r4)
            if (r4 == 0) goto L_0x004e
            XH.N r4 = XH.C16807N.f139792a
            java.lang.Object r3 = r3.a0(r0, r4)
            xI.A r3 = (xI.C18599A) r3
            goto L_0x004f
        L_0x004e:
            r3 = r2
        L_0x004f:
            if (r3 == 0) goto L_0x0020
            r1.add(r3)
            goto L_0x0020
        L_0x0055:
            java.util.List r8 = YH.C16877v.t1(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.C18629d0.Q(nJ.k, xI.d0$d):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    public Class<?> R() {
        Class<?> k10 = C15965f.k(l());
        return k10 == null ? l() : k10;
    }

    public abstract Collection<a0> S(C17069f fVar);
}
