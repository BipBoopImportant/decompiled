package CI;

import AI.C15435p;
import VI.C16664F;
import YH.C16877v;
import YH.g0;
import cJ.C17065b;
import cJ.C17067d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;

/* renamed from: CI.x  reason: case insensitive filesystem */
public final class C15517x {

    /* renamed from: a  reason: collision with root package name */
    public static final C15517x f133562a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f133563b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f133564c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f133565d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f133566e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f133567f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f133568g;

    /* renamed from: h  reason: collision with root package name */
    private static final Set<String> f133569h;

    static {
        C15517x xVar = new C15517x();
        f133562a = xVar;
        C16664F f10 = C16664F.f139318a;
        f133563b = g0.l(f10.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f133564c = g0.k(g0.k(g0.k(g0.k(g0.k(g0.k(xVar.b(), f10.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f10.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f10.e("Double", "isInfinite()Z", "isNaN()Z")), f10.e("Float", "isInfinite()Z", "isNaN()Z")), f10.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f10.e("CharSequence", "isEmpty()Z"));
        f133565d = f10.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f133566e = g0.k(g0.k(g0.k(g0.k(g0.k(g0.k(f10.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f10.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f10.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f10.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f10.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f133567f = g0.k(g0.k(f10.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> a10 = xVar.a();
        String[] b10 = f10.b("D");
        Set<T> k10 = g0.k(a10, f10.e("Float", (String[]) Arrays.copyOf(b10, b10.length)));
        String[] b11 = f10.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f133568g = g0.k(k10, f10.e("String", (String[]) Arrays.copyOf(b11, b11.length)));
        String[] b12 = f10.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f133569h = f10.e("Throwable", (String[]) Arrays.copyOf(b12, b12.length));
    }

    private C15517x() {
    }

    private final Set<String> a() {
        C16664F f10 = C16664F.f139318a;
        C17558e eVar = C17558e.BOOLEAN;
        C17558e eVar2 = C17558e.BYTE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17558e B10 : C16877v.q(eVar, eVar2, C17558e.DOUBLE, C17558e.FLOAT, eVar2, C17558e.INT, C17558e.LONG, C17558e.SHORT)) {
            String b10 = B10.B().f().b();
            C17542s.i(b10, "asString(...)");
            String[] b11 = f10.b("Ljava/lang/String;");
            C16877v.E(linkedHashSet, f10.e(b10, (String[]) Arrays.copyOf(b11, b11.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        C16664F f10 = C16664F.f139318a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17558e eVar : C16877v.q(C17558e.BOOLEAN, C17558e.CHAR)) {
            String b10 = eVar.B().f().b();
            C17542s.i(b10, "asString(...)");
            C16877v.E(linkedHashSet, f10.e(b10, eVar.n() + "Value()" + eVar.m()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f133565d;
    }

    public final Set<String> d() {
        return f133563b;
    }

    public final Set<String> e() {
        return f133568g;
    }

    public final Set<String> f() {
        return f133564c;
    }

    public final Set<String> g() {
        return f133567f;
    }

    public final Set<String> h() {
        return f133569h;
    }

    public final Set<String> i() {
        return f133566e;
    }

    public final boolean j(C17067d dVar) {
        C17542s.j(dVar, "fqName");
        return C17542s.e(dVar, C15435p.a.f133106i) || C15435p.e(dVar);
    }

    public final boolean k(C17067d dVar) {
        C17542s.j(dVar, "fqName");
        if (j(dVar)) {
            return true;
        }
        C17065b n10 = C15496c.f133492a.n(dVar);
        if (n10 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n10.a().a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
