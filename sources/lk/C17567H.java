package lK;

import YH.C16877v;
import YH.X;
import com.optimizely.ab.config.FeatureVariable;
import fK.q;
import hK.l;
import hK.m;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kK.C17514c;
import kK.F;
import kK.t;
import kK.y;
import kK.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lK.C17588t;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a-\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\",\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "LkK/c;", "json", "", "", "", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;)Ljava/util/Map;", "descriptor", "e", "(LkK/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", "index", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;I)Ljava/lang/String;", "LkK/z;", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;)LkK/z;", "name", "l", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;Ljava/lang/String;)I", "", "d", "(LkK/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "i", "suffix", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;Ljava/lang/String;Ljava/lang/String;)I", "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;)Z", "LlK/t$a;", "a", "LlK/t$a;", "g", "()LlK/t$a;", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.H  reason: case insensitive filesystem */
public final class C17567H {

    /* renamed from: a  reason: collision with root package name */
    private static final C17588t.a<Map<String, Integer>> f144423a = new C17588t.a<>();

    /* renamed from: b  reason: collision with root package name */
    private static final C17588t.a<String[]> f144424b = new C17588t.a<>();

    private static final Map<String, Integer> b(SerialDescriptor serialDescriptor, C17514c cVar) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d10 = d(cVar, serialDescriptor);
        n(serialDescriptor, cVar);
        int d11 = serialDescriptor.d();
        for (int i10 = 0; i10 < d11; i10++) {
            ArrayList arrayList = new ArrayList();
            for (Object next : serialDescriptor.f(i10)) {
                if (next instanceof y) {
                    arrayList.add(next);
                }
            }
            y yVar = (y) C16877v.d1(arrayList);
            if (!(yVar == null || (names = yVar.names()) == null)) {
                for (String str2 : names) {
                    if (d10) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        C17542s.i(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, serialDescriptor, str2, i10);
                }
            }
            if (d10) {
                str = serialDescriptor.e(i10).toLowerCase(Locale.ROOT);
                C17542s.i(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, serialDescriptor, str, i10);
            }
        }
        return linkedHashMap.isEmpty() ? X.j() : linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void c(java.util.Map<java.lang.String, java.lang.Integer> r4, kotlinx.serialization.descriptors.SerialDescriptor r5, java.lang.String r6, int r7) {
        /*
            hK.l r0 = r5.h()
            hK.l$b r1 = hK.l.b.f143469a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "enum value"
            goto L_0x0011
        L_0x000f:
            java.lang.String r0 = "property"
        L_0x0011:
            boolean r1 = r4.containsKey(r6)
            if (r1 != 0) goto L_0x001f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.put(r6, r5)
            return
        L_0x001f:
            lK.B r1 = new lK.B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The suggested name '"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "' for "
            r2.append(r3)
            r2.append(r0)
            r3 = 32
            r2.append(r3)
            java.lang.String r7 = r5.e(r7)
            r2.append(r7)
            java.lang.String r7 = " is already one of the names for "
            r2.append(r7)
            r2.append(r0)
            r2.append(r3)
            java.lang.Object r4 = YH.X.k(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r4 = r5.e(r4)
            r2.append(r4)
            java.lang.String r4 = " in "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.C17567H.c(java.util.Map, kotlinx.serialization.descriptors.SerialDescriptor, java.lang.String, int):void");
    }

    private static final boolean d(C17514c cVar, SerialDescriptor serialDescriptor) {
        return cVar.g().h() && C17542s.e(serialDescriptor.h(), l.b.f143469a);
    }

    public static final Map<String, Integer> e(C17514c cVar, SerialDescriptor serialDescriptor) {
        C17542s.j(cVar, "<this>");
        C17542s.j(serialDescriptor, "descriptor");
        return (Map) F.a(cVar).b(serialDescriptor, f144423a, new C17566G(serialDescriptor, cVar));
    }

    /* access modifiers changed from: private */
    public static final Map f(SerialDescriptor serialDescriptor, C17514c cVar) {
        return b(serialDescriptor, cVar);
    }

    public static final C17588t.a<Map<String, Integer>> g() {
        return f144423a;
    }

    public static final String h(SerialDescriptor serialDescriptor, C17514c cVar, int i10) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        n(serialDescriptor, cVar);
        return serialDescriptor.e(i10);
    }

    public static final int i(SerialDescriptor serialDescriptor, C17514c cVar, String str) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(str, "name");
        if (d(cVar, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            return l(serialDescriptor, cVar, lowerCase);
        }
        n(serialDescriptor, cVar);
        int c10 = serialDescriptor.c(str);
        return (c10 == -3 && cVar.g().o()) ? l(serialDescriptor, cVar, str) : c10;
    }

    public static final int j(SerialDescriptor serialDescriptor, C17514c cVar, String str, String str2) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(str, "name");
        C17542s.j(str2, "suffix");
        int i10 = i(serialDescriptor, cVar, str);
        if (i10 != -3) {
            return i10;
        }
        throw new q(serialDescriptor.i() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int k(SerialDescriptor serialDescriptor, C17514c cVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(serialDescriptor, cVar, str, str2);
    }

    private static final int l(SerialDescriptor serialDescriptor, C17514c cVar, String str) {
        Integer num = e(cVar, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(SerialDescriptor serialDescriptor, C17514c cVar) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        if (!cVar.g().k()) {
            Iterable<Annotation> annotations = serialDescriptor.getAnnotations();
            if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof t) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final z n(SerialDescriptor serialDescriptor, C17514c cVar) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        if (!C17542s.e(serialDescriptor.h(), m.a.f143470a)) {
            return null;
        }
        cVar.g().l();
        return null;
    }
}
