package com.squareup.moshi;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "a", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {
    public static final Class<?> a(Type type) {
        C17542s.j(type, "<this>");
        Class<?> g10 = w.g(type);
        C17542s.i(g10, "getRawType(this)");
        return g10;
    }
}
