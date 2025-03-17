package ME;

import com.squareup.moshi.e;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import com.squareup.moshi.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Annotation> f112012a = Collections.emptySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Type[] f112013b = new Type[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f112014c = DefaultConstructorMarker.class;

    /* renamed from: d  reason: collision with root package name */
    private static final Class<? extends Annotation> f112015d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f112016e;

    public static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f112017a;

        public a(Type type) {
            this.f112017a = c.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && w.d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f112017a;
        }

        public int hashCode() {
            return this.f112017a.hashCode();
        }

        public String toString() {
            return c.u(this.f112017a) + "[]";
        }
    }

    public static final class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f112018a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f112019b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f112020c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || w.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f112018a = type == null ? null : c.a(type);
            this.f112019b = c.a(type2);
            this.f112020c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f112020c;
                if (i10 < typeArr2.length) {
                    typeArr2[i10].getClass();
                    c.b(this.f112020c[i10]);
                    Type[] typeArr3 = this.f112020c;
                    typeArr3[i10] = c.a(typeArr3[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && w.d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f112020c.clone();
        }

        public Type getOwnerType() {
            return this.f112018a;
        }

        public Type getRawType() {
            return this.f112019b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f112020c) ^ this.f112019b.hashCode()) ^ c.f(this.f112018a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f112020c.length + 1) * 30);
            sb2.append(c.u(this.f112019b));
            if (this.f112020c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(c.u(this.f112020c[0]));
            for (int i10 = 1; i10 < this.f112020c.length; i10++) {
                sb2.append(", ");
                sb2.append(c.u(this.f112020c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: ME.c$c  reason: collision with other inner class name */
    public static final class C2745c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f112021a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f112022b;

        public C2745c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                c.b(typeArr2[0]);
                Class<Object> cls = Object.class;
                if (typeArr[0] == cls) {
                    this.f112022b = c.a(typeArr2[0]);
                    this.f112021a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                typeArr[0].getClass();
                c.b(typeArr[0]);
                this.f112022b = null;
                this.f112021a = c.a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && w.d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f112022b;
            if (type == null) {
                return c.f112013b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f112021a};
        }

        public int hashCode() {
            Type type = this.f112022b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f112021a.hashCode() + 31);
        }

        public String toString() {
            if (this.f112022b != null) {
                return "? super " + c.u(this.f112022b);
            } else if (this.f112021a == Object.class) {
                return "?";
            } else {
                return "? extends " + c.u(this.f112021a);
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f112015d = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f112016e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType) || (type instanceof C2745c)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C2745c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2 = r7.getDeclaredConstructor(new java.lang.Class[]{r0});
        r5 = new java.lang.Object[]{r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2 = r7.getDeclaredConstructor((java.lang.Class[]) null);
        r5 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        throw s(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r6 + "'. Suspiciously, the type was not parameterized but the target class '" + r2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r6, r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[ExcHandler: InvocationTargetException (r5v6 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[ExcHandler: InstantiationException (r5v5 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[ExcHandler: IllegalAccessException (r5v4 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[ExcHandler: ClassNotFoundException (r5v3 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0033=Splitter:B:14:0x0033, B:24:0x0059=Splitter:B:24:0x0059} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.moshi.f<?> d(com.squareup.moshi.t r5, java.lang.reflect.Type r6, java.lang.Class<?> r7) {
        /*
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            java.lang.Class<com.squareup.moshi.g> r1 = com.squareup.moshi.g.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            com.squareup.moshi.g r1 = (com.squareup.moshi.g) r1
            r2 = 0
            if (r1 == 0) goto L_0x0112
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x0112
        L_0x0015:
            java.lang.String r1 = r7.getName()
            java.lang.String r1 = com.squareup.moshi.w.e(r1)
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x007c, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            r3 = 1
            java.lang.Class r7 = java.lang.Class.forName(r1, r3, r7)     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x007c, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            boolean r1 = r6 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Class<com.squareup.moshi.t> r4 = com.squareup.moshi.t.class
            if (r1 == 0) goto L_0x0059
            r1 = r6
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r0}     // Catch:{ NoSuchMethodException -> 0x0049, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x0049, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1}     // Catch:{ NoSuchMethodException -> 0x0049, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            goto L_0x006e
        L_0x0040:
            r5 = move-exception
            goto L_0x007e
        L_0x0042:
            r5 = move-exception
            goto L_0x0083
        L_0x0044:
            r5 = move-exception
            goto L_0x009a
        L_0x0046:
            r5 = move-exception
            goto L_0x00fb
        L_0x0049:
            java.lang.Class[] r5 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            goto L_0x006e
        L_0x0056:
            r5 = move-exception
            r2 = r7
            goto L_0x00b1
        L_0x0059:
            java.lang.Class[] r0 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0067, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.reflect.Constructor r0 = r7.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0067, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ NoSuchMethodException -> 0x0067, ClassNotFoundException -> 0x0046, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            r2 = r0
            goto L_0x006e
        L_0x0067:
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
        L_0x006e:
            r2.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            java.lang.Object r5 = r2.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            com.squareup.moshi.f r5 = (com.squareup.moshi.f) r5     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            com.squareup.moshi.f r5 = r5.nullSafe()     // Catch:{ ClassNotFoundException -> 0x0046, NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0044, InstantiationException -> 0x0042, InvocationTargetException -> 0x0040 }
            return r5
        L_0x007c:
            r5 = move-exception
            goto L_0x00b1
        L_0x007e:
            java.lang.RuntimeException r5 = s(r5)
            throw r5
        L_0x0083:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x009a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x00b1:
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r7 != 0) goto L_0x00e4
            java.lang.reflect.TypeVariable[] r7 = r2.getTypeParameters()
            int r7 = r7.length
            if (r7 == 0) goto L_0x00e4
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "'. Suspiciously, the type was not parameterized but the target class '"
            r0.append(r6)
            java.lang.String r6 = r2.getCanonicalName()
            r0.append(r6)
            java.lang.String r6 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x00e4:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x00fb:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L_0x0112:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ME.c.d(com.squareup.moshi.t, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.f");
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static int f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static int g(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f112015d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean i(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> j(AnnotatedElement annotatedElement) {
        return k(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f112012a;
    }

    public static String l(String str, e eVar) {
        if (eVar == null) {
            return str;
        }
        String name = eVar.name();
        return "\u0000".equals(name) ? str : name;
    }

    public static String m(String str, AnnotatedElement annotatedElement) {
        return l(str, (e) annotatedElement.getAnnotation(e.class));
    }

    public static h n(String str, String str2, k kVar) {
        String m10 = kVar.m();
        return new h(str2.equals(str) ? String.format("Required value '%s' missing at %s", new Object[]{str, m10}) : String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, m10}));
    }

    public static Type o(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = r(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = q(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.w.b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = q(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.w.b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = q(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            ME.c$b r8 = new ME.c$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.w.l(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = q(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.w.k(r8)
            return r8
        L_0x00bf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ME.c.q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c10 = c(typeVariable);
        if (c10 == null) {
            return typeVariable;
        }
        Type e10 = e(type, cls, c10);
        if (!(e10 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e10).getActualTypeArguments()[g(c10.getTypeParameters(), typeVariable)];
    }

    public static RuntimeException s(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    public static String t(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean v(Type type, Type type2) {
        return w.d(type, type2);
    }

    public static h w(String str, String str2, k kVar) {
        String m10 = kVar.m();
        return new h(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", new Object[]{str, m10}) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, m10}));
    }
}
