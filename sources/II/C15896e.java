package II;

import kotlin.jvm.internal.C17542s;

/* renamed from: II.e  reason: case insensitive filesystem */
public final class C15896e {
    public static final Class<?> a(ClassLoader classLoader, String str) {
        C17542s.j(classLoader, "<this>");
        C17542s.j(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
