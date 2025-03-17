package bJ;

import HJ.C15854t;
import YH.C16877v;
import gI.C17269c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: bJ.b  reason: case insensitive filesystem */
public final class C17043b {

    /* renamed from: a  reason: collision with root package name */
    public static final C17043b f141166a = new C17043b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f141167b = C16877v.G0(C16877v.q('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f141168c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List q10 = C16877v.q("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int c10 = C17269c.c(0, q10.size() - 1, 2);
        if (c10 >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f141167b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) q10.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), q10.get(i11));
                linkedHashMap.put(str + '/' + ((String) q10.get(i10)) + "Array", '[' + ((String) q10.get(i11)));
                if (i10 == c10) {
                    break;
                }
                i10 += 2;
            }
        }
        linkedHashMap.put(f141167b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C16877v.q("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C16877v.q("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f141167b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : C16877v.q("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f141167b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f141168c = linkedHashMap;
    }

    private C17043b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f141167b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        C17542s.j(str, "classId");
        String str2 = f141168c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C15854t.P(str, '.', '$', false, 4, (Object) null) + ';';
    }
}
