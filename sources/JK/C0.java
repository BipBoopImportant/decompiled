package jK;

import IJ.C15906b;
import JJ.C15969b;
import XH.C16797D;
import XH.C16798E;
import XH.C16799F;
import XH.C16800G;
import XH.C16801H;
import XH.C16802I;
import XH.C16804K;
import XH.C16805L;
import XH.C16807N;
import XH.C16820k;
import YH.X;
import fK.C17253f;
import fK.C17256i;
import fK.p;
import fK.q;
import gK.C17294a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17528d;
import kotlin.jvm.internal.C17529e;
import kotlin.jvm.internal.C17531g;
import kotlin.jvm.internal.C17535k;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17545v;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.r;
import kotlinx.serialization.KSerializer;
import mI.C17603a;
import uI.C18055d;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\t*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a%\u0010\u001c\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b \u0010\u001f\u001aQ\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\"\u0010\u001a\u001aM\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a)\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b*\u0010+\u001a+\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b,\u0010+\u001a\u001d\u0010.\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b.\u0010\u0005\u001a#\u00100\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060/H\u0000¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"", "T", "LuI/d;", "", "l", "(LuI/d;)Z", "Lkotlinx/serialization/KSerializer;", "b", "(LuI/d;)Lkotlinx/serialization/KSerializer;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "", "r", "(Ljava/util/ArrayList;LuI/d;)[Ljava/lang/Object;", "", "p", "(LuI/d;)Ljava/lang/Void;", "Ljava/lang/Class;", "q", "(Ljava/lang/Class;)Ljava/lang/Void;", "args", "d", "(LuI/d;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "f", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "m", "(Ljava/lang/Class;)Z", "n", "jClass", "k", "companion", "j", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "companionName", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/Class;)Lkotlinx/serialization/KSerializer;", "h", "rootClass", "o", "", "i", "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C0 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> b(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        return d(dVar, new KSerializer[0]);
    }

    public static final <T> KSerializer<T> c(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        C17542s.j(cls, "<this>");
        C17542s.j(kSerializerArr, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        KSerializer<T> k10 = k(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (k10 != null) {
            return k10;
        }
        KSerializer<T> h10 = h(cls);
        if (h10 != null) {
            return h10;
        }
        KSerializer<T> f10 = f(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (f10 != null) {
            return f10;
        }
        if (n(cls)) {
            return new C17256i(C17603a.e(cls));
        }
        return null;
    }

    public static final <T> KSerializer<T> d(C18055d<T> dVar, KSerializer<Object>... kSerializerArr) {
        C17542s.j(dVar, "<this>");
        C17542s.j(kSerializerArr, "args");
        return c(C17603a.b(dVar), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> KSerializer<T> e(Class<T> cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C17542s.i(canonicalName, "getCanonicalName(...)");
        C17542s.h(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new I(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r7 = r3.getField("INSTANCE");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> kotlinx.serialization.KSerializer<T> f(java.lang.Class<T> r7, kotlinx.serialization.KSerializer<java.lang.Object>... r8) {
        /*
            java.lang.Object r0 = g(r7)
            if (r0 == 0) goto L_0x0014
            int r1 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            kotlinx.serialization.KSerializer[] r8 = (kotlinx.serialization.KSerializer[]) r8
            kotlinx.serialization.KSerializer r8 = j(r0, r8)
            if (r8 == 0) goto L_0x0014
            return r8
        L_0x0014:
            r8 = 0
            java.lang.Class[] r7 = r7.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r0 = "getDeclaredClasses(...)"
            kotlin.jvm.internal.C17542s.i(r7, r0)     // Catch:{ NoSuchFieldException -> 0x0055 }
            int r0 = r7.length     // Catch:{ NoSuchFieldException -> 0x0055 }
            r1 = 0
            r3 = r8
            r2 = r1
        L_0x0022:
            if (r1 >= r0) goto L_0x003b
            r4 = r7[r1]     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r5 = r4.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r6 = "$serializer"
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r5 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x0036
        L_0x0034:
            r3 = r8
            goto L_0x003e
        L_0x0036:
            r2 = 1
            r3 = r4
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x003b:
            if (r2 != 0) goto L_0x003e
            goto L_0x0034
        L_0x003e:
            if (r3 == 0) goto L_0x004d
            java.lang.String r7 = "INSTANCE"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r7 == 0) goto L_0x004d
            java.lang.Object r7 = r7.get(r8)     // Catch:{ NoSuchFieldException -> 0x0055 }
            goto L_0x004e
        L_0x004d:
            r7 = r8
        L_0x004e:
            boolean r0 = r7 instanceof kotlinx.serialization.KSerializer     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7     // Catch:{ NoSuchFieldException -> 0x0055 }
            r8 = r7
        L_0x0055:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.C0.f(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    private static final <T> Object g(Class<T> cls) {
        Class cls2;
        Class[] declaredClasses = cls.getDeclaredClasses();
        C17542s.i(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(C17470o0.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        C17542s.i(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r4 == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> kotlinx.serialization.KSerializer<T> h(java.lang.Class<T> r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = HJ.C15854t.W(r0, r2, r3, r4, r1)
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = "kotlin."
            boolean r0 = HJ.C15854t.W(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L_0x001b
            goto L_0x00ae
        L_0x001b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L_0x0028:
            r7 = 1
            if (r4 >= r2) goto L_0x0056
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 == 0) goto L_0x0053
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 == 0) goto L_0x0053
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0051
        L_0x004f:
            r6 = r1
            goto L_0x0059
        L_0x0051:
            r5 = r7
            r6 = r8
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x004f
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            return r1
        L_0x005c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.C17542s.i(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L_0x006c:
            if (r3 >= r2) goto L_0x009d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x009a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.C17542s.i(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L_0x009a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x0098
        L_0x0096:
            r5 = r1
            goto L_0x00a0
        L_0x0098:
            r5 = r6
            r4 = r7
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x006c
        L_0x009d:
            if (r4 != 0) goto L_0x00a0
            goto L_0x0096
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto L_0x00ae
            r1 = r11
            kotlinx.serialization.KSerializer r1 = (kotlinx.serialization.KSerializer) r1
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.C0.h(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final Map<C18055d<?>, KSerializer<?>> i() {
        Map c10 = X.c();
        c10.put(P.b(String.class), C17294a.K(V.f144353a));
        c10.put(P.b(Character.TYPE), C17294a.E(C17531g.f144375a));
        c10.put(P.b(char[].class), C17294a.d());
        c10.put(P.b(Double.TYPE), C17294a.F(C17535k.f144384a));
        c10.put(P.b(double[].class), C17294a.e());
        c10.put(P.b(Float.TYPE), C17294a.G(C17536l.f144385a));
        c10.put(P.b(float[].class), C17294a.f());
        c10.put(P.b(Long.TYPE), C17294a.I(C17545v.f144387a));
        c10.put(P.b(long[].class), C17294a.i());
        c10.put(P.b(C16801H.class), C17294a.z(C16801H.f139781b));
        c10.put(P.b(Integer.TYPE), C17294a.H(r.f144386a));
        c10.put(P.b(int[].class), C17294a.g());
        c10.put(P.b(C16799F.class), C17294a.y(C16799F.f139776b));
        c10.put(P.b(Short.TYPE), C17294a.J(T.f144351a));
        c10.put(P.b(short[].class), C17294a.o());
        c10.put(P.b(C16804K.class), C17294a.A(C16804K.f139787b));
        c10.put(P.b(Byte.TYPE), C17294a.D(C17529e.f144373a));
        c10.put(P.b(byte[].class), C17294a.c());
        c10.put(P.b(C16797D.class), C17294a.x(C16797D.f139771b));
        c10.put(P.b(Boolean.TYPE), C17294a.C(C17528d.f144372a));
        c10.put(P.b(boolean[].class), C17294a.b());
        c10.put(P.b(C16807N.class), C17294a.B(C16807N.f139792a));
        c10.put(P.b(Void.class), C17294a.l());
        try {
            c10.put(P.b(C15906b.class), C17294a.v(C15906b.f135496b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c10.put(P.b(C16802I.class), C17294a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c10.put(P.b(C16800G.class), C17294a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c10.put(P.b(C16805L.class), C17294a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c10.put(P.b(C16798E.class), C17294a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c10.put(P.b(C15969b.class), C17294a.w(C15969b.f135806c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return X.b(c10);
    }

    private static final <T> KSerializer<T> j(Object obj, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e10.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e10;
        }
    }

    private static final <T> KSerializer<T> k(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object a10 = a(cls, "Companion");
        if (a10 == null) {
            return null;
        }
        return j(a10, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean l(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        return C17603a.b(dVar).isInterface();
    }

    private static final <T> boolean m(Class<T> cls) {
        return cls.getAnnotation(p.class) == null && cls.getAnnotation(C17253f.class) == null;
    }

    private static final <T> boolean n(Class<T> cls) {
        if (cls.getAnnotation(C17253f.class) != null) {
            return true;
        }
        p pVar = (p) cls.getAnnotation(p.class);
        return pVar != null && C17542s.e(P.b(pVar.with()), P.b(C17256i.class));
    }

    public static final boolean o(C18055d<Object> dVar) {
        C17542s.j(dVar, "rootClass");
        return C17603a.b(dVar).isArray();
    }

    public static final Void p(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        D0.f(dVar);
        throw new C16820k();
    }

    public static final Void q(Class<?> cls) {
        C17542s.j(cls, "<this>");
        throw new q(D0.e(C17603a.e(cls)));
    }

    public static final <T, E extends T> E[] r(ArrayList<E> arrayList, C18055d<T> dVar) {
        C17542s.j(arrayList, "<this>");
        C17542s.j(dVar, "eClass");
        Object newInstance = Array.newInstance(C17603a.b(dVar), arrayList.size());
        C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] array = arrayList.toArray((Object[]) newInstance);
        C17542s.i(array, "toArray(...)");
        return array;
    }
}
