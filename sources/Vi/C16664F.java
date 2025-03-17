package VI;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: VI.F  reason: case insensitive filesystem */
public final class C16664F {

    /* renamed from: a  reason: collision with root package name */
    public static final C16664F f139318a = new C16664F();

    private C16664F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* access modifiers changed from: private */
    public static final CharSequence k(String str) {
        C17542s.j(str, "it");
        return f139318a.c(str);
    }

    public final String[] b(String... strArr) {
        C17542s.j(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> d(String str, String... strArr) {
        C17542s.j(str, "internalName");
        C17542s.j(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String str, String... strArr) {
        C17542s.j(str, "name");
        C17542s.j(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> f(String str, String... strArr) {
        C17542s.j(str, "name");
        C17542s.j(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        C17542s.j(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        C17542s.j(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        C17542s.j(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str, List<String> list, String str2) {
        C17542s.j(str, "name");
        C17542s.j(list, "parameters");
        C17542s.j(str2, "ret");
        return str + '(' + C16877v.G0(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C16663E.f139317a, 30, (Object) null) + ')' + c(str2);
    }

    public final String l(String str, String str2) {
        C17542s.j(str, "internalName");
        C17542s.j(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
