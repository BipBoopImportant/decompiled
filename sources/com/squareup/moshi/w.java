package com.squareup.moshi;

import ME.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public final class w {
    static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type) {
        return new c.a(type);
    }

    public static Type c(Type type, Class<?> cls) {
        Type h10 = h(type, cls, Collection.class);
        if (h10 instanceof WildcardType) {
            h10 = ((WildcardType) h10).getUpperBounds()[0];
        }
        return h10 instanceof ParameterizedType ? ((ParameterizedType) h10).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof c.b ? ((c.b) parameterizedType).f112020c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof c.b ? ((c.b) parameterizedType2).f112020c : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static String e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    static Type f(Type type) {
        Class<?> g10 = g(type);
        return c.p(type, g10, g10.getGenericSuperclass());
    }

    public static Class<?> g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return c.p(type, cls, c.e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static Type[] i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type h10 = h(type, cls, Map.class);
        if (h10 instanceof ParameterizedType) {
            return ((ParameterizedType) h10).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    public static ParameterizedType j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new c.b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static WildcardType k(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c.C2745c(typeArr, c.f112013b);
    }

    public static WildcardType l(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c.C2745c(new Type[]{Object.class}, typeArr);
    }
}
