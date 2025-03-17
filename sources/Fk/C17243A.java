package fK;

import XH.C16795B;
import XH.C16820k;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import gK.C17294a;
import jK.C0;
import jK.Q0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import mI.C17603a;
import mK.C17611d;
import mK.C17613f;
import uI.C18055d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0011*\u00020\u0003*\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "d", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "LmK/d;", "e", "(LmK/d;Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "h", "", "failOnMissingTypeArgSerializer", "f", "(LmK/d;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "i", "(LmK/d;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "jClass", "", "typeArgumentsSerializers", "c", "(LmK/d;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(LmK/d;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* renamed from: fK.A  reason: case insensitive filesystem */
final /* synthetic */ class C17243A {
    private static final KSerializer<Object> a(C17611d dVar, GenericArrayType genericArrayType, boolean z10) {
        KSerializer<Object> kSerializer;
        C18055d dVar2;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            C17542s.i(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) C16870n.f0(upperBounds);
        }
        C17542s.g(genericComponentType);
        if (z10) {
            kSerializer = z.c(dVar, genericComponentType);
        } else {
            kSerializer = z.f(dVar, genericComponentType);
            if (kSerializer == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            C17542s.h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVar2 = C17603a.e((Class) rawType);
        } else if (genericComponentType instanceof C18055d) {
            dVar2 = (C18055d) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + P.b(genericComponentType.getClass()));
        }
        C17542s.h(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<E[]> a10 = C17294a.a(dVar2, kSerializer);
        C17542s.h(a10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a10;
    }

    private static final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C17542s.i(rawType, "getRawType(...)");
            return b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C17542s.i(upperBounds, "getUpperBounds(...)");
            Object f02 = C16870n.f0(upperBounds);
            C17542s.i(f02, "first(...)");
            return b((Type) f02);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C17542s.i(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + P.b(type.getClass()));
        }
    }

    private static final <T> KSerializer<T> c(C17611d dVar, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> c10 = C0.c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (c10 != null) {
            return c10;
        }
        C18055d<T> e10 = C17603a.e(cls);
        KSerializer<T> b10 = Q0.b(e10);
        if (b10 != null) {
            return b10;
        }
        KSerializer<T> b11 = dVar.b(e10, list);
        if (b11 != null) {
            return b11;
        }
        if (cls.isInterface()) {
            return new C17256i(C17603a.e(cls));
        }
        return null;
    }

    public static final KSerializer<Object> d(Type type) {
        C17542s.j(type, "type");
        return z.c(C17613f.a(), type);
    }

    public static final KSerializer<Object> e(C17611d dVar, Type type) {
        C17542s.j(dVar, "<this>");
        C17542s.j(type, "type");
        KSerializer<Object> f10 = f(dVar, type, true);
        if (f10 != null) {
            return f10;
        }
        C0.q(b(type));
        throw new C16820k();
    }

    private static final KSerializer<Object> f(C17611d dVar, Type type, boolean z10) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return a(dVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return i(dVar, (Class) type, z10);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            C17542s.h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C17542s.g(actualTypeArguments);
            if (z10) {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    C17542s.g(type2);
                    arrayList.add(z.c(dVar, type2));
                }
            } else {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    C17542s.g(type3);
                    KSerializer<Object> f10 = z.f(dVar, type3);
                    if (f10 == null) {
                        return null;
                    }
                    arrayList.add(f10);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer<Object> n10 = C17294a.n((KSerializer) arrayList.get(0));
                C17542s.h(n10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return n10;
            } else if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                KSerializer<Object> h10 = C17294a.h((KSerializer) arrayList.get(0));
                C17542s.h(h10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return h10;
            } else if (Map.class.isAssignableFrom(cls)) {
                KSerializer<Object> k10 = C17294a.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C17542s.h(k10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return k10;
            } else if (Map.Entry.class.isAssignableFrom(cls)) {
                KSerializer<Object> j10 = C17294a.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C17542s.h(j10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return j10;
            } else if (v.class.isAssignableFrom(cls)) {
                KSerializer<Object> m10 = C17294a.m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C17542s.h(m10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m10;
            } else if (C16795B.class.isAssignableFrom(cls)) {
                KSerializer<Object> p10 = C17294a.p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                C17542s.h(p10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return p10;
            } else {
                ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
                for (KSerializer kSerializer : arrayList) {
                    C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(kSerializer);
                }
                return c(dVar, cls, arrayList2);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C17542s.i(upperBounds, "getUpperBounds(...)");
            Object f02 = C16870n.f0(upperBounds);
            C17542s.i(f02, "first(...)");
            return g(dVar, (Type) f02, false, 2, (Object) null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + P.b(type.getClass()));
        }
    }

    static /* synthetic */ KSerializer g(C17611d dVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return f(dVar, type, z10);
    }

    public static final KSerializer<Object> h(C17611d dVar, Type type) {
        C17542s.j(dVar, "<this>");
        C17542s.j(type, "type");
        return f(dVar, type, false);
    }

    private static final KSerializer<Object> i(C17611d dVar, Class<?> cls, boolean z10) {
        KSerializer<Object> kSerializer;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            C17542s.h(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(dVar, cls, C16877v.n());
        }
        Class<?> componentType = cls.getComponentType();
        C17542s.i(componentType, "getComponentType(...)");
        if (z10) {
            kSerializer = z.c(dVar, componentType);
        } else {
            kSerializer = z.f(dVar, componentType);
            if (kSerializer == null) {
                return null;
            }
        }
        C18055d<?> e10 = C17603a.e(componentType);
        C17542s.h(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<E[]> a10 = C17294a.a(e10, kSerializer);
        C17542s.h(a10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a10;
    }
}
