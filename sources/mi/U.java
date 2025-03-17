package MI;

import VI.C16664F;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import YH.g0;
import cJ.C17069f;
import fI.C17221b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17558e;
import tI.C17978n;

public class U {

    /* renamed from: a  reason: collision with root package name */
    public static final a f136347a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final List<a.C3351a> f136348b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f136349c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f136350d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<a.C3351a, c> f136351e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, c> f136352f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Set<C17069f> f136353g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Set<String> f136354h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final a.C3351a f136355i;

    /* renamed from: j  reason: collision with root package name */
    private static final Map<a.C3351a, C17069f> f136356j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, C17069f> f136357k;

    /* renamed from: l  reason: collision with root package name */
    private static final Set<String> f136358l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Set<C17069f> f136359m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Map<C17069f, C17069f> f136360n;

    public static final class a {

        /* renamed from: MI.U$a$a  reason: collision with other inner class name */
        public static final class C3351a {

            /* renamed from: a  reason: collision with root package name */
            private final String f136361a;

            /* renamed from: b  reason: collision with root package name */
            private final C17069f f136362b;

            /* renamed from: c  reason: collision with root package name */
            private final String f136363c;

            /* renamed from: d  reason: collision with root package name */
            private final String f136364d;

            /* renamed from: e  reason: collision with root package name */
            private final String f136365e;

            public C3351a(String str, C17069f fVar, String str2, String str3) {
                C17542s.j(str, "classInternalName");
                C17542s.j(fVar, "name");
                C17542s.j(str2, "parameters");
                C17542s.j(str3, "returnType");
                this.f136361a = str;
                this.f136362b = fVar;
                this.f136363c = str2;
                this.f136364d = str3;
                C16664F f10 = C16664F.f139318a;
                this.f136365e = f10.l(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C3351a b(C3351a aVar, String str, C17069f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f136361a;
                }
                if ((i10 & 2) != 0) {
                    fVar = aVar.f136362b;
                }
                if ((i10 & 4) != 0) {
                    str2 = aVar.f136363c;
                }
                if ((i10 & 8) != 0) {
                    str3 = aVar.f136364d;
                }
                return aVar.a(str, fVar, str2, str3);
            }

            public final C3351a a(String str, C17069f fVar, String str2, String str3) {
                C17542s.j(str, "classInternalName");
                C17542s.j(fVar, "name");
                C17542s.j(str2, "parameters");
                C17542s.j(str3, "returnType");
                return new C3351a(str, fVar, str2, str3);
            }

            public final C17069f c() {
                return this.f136362b;
            }

            public final String d() {
                return this.f136365e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3351a)) {
                    return false;
                }
                C3351a aVar = (C3351a) obj;
                return C17542s.e(this.f136361a, aVar.f136361a) && C17542s.e(this.f136362b, aVar.f136362b) && C17542s.e(this.f136363c, aVar.f136363c) && C17542s.e(this.f136364d, aVar.f136364d);
            }

            public int hashCode() {
                return (((((this.f136361a.hashCode() * 31) + this.f136362b.hashCode()) * 31) + this.f136363c.hashCode()) * 31) + this.f136364d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f136361a + ", name=" + this.f136362b + ", parameters=" + this.f136363c + ", returnType=" + this.f136364d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C3351a m(String str, String str2, String str3, String str4) {
            C17069f v10 = C17069f.v(str2);
            C17542s.i(v10, "identifier(...)");
            return new C3351a(str, v10, str3, str4);
        }

        public final C17069f b(C17069f fVar) {
            C17542s.j(fVar, "name");
            return f().get(fVar);
        }

        public final List<String> c() {
            return U.f136349c;
        }

        public final Set<C17069f> d() {
            return U.f136353g;
        }

        public final Set<String> e() {
            return U.f136354h;
        }

        public final Map<C17069f, C17069f> f() {
            return U.f136360n;
        }

        public final Set<C17069f> g() {
            return U.f136359m;
        }

        public final C3351a h() {
            return U.f136355i;
        }

        public final Map<String, c> i() {
            return U.f136352f;
        }

        public final Map<String, C17069f> j() {
            return U.f136357k;
        }

        public final boolean k(C17069f fVar) {
            C17542s.j(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String str) {
            C17542s.j(str, "builtinSignature");
            return c().contains(str) ? b.ONE_COLLECTION_PARAMETER : ((c) X.k(i(), str)) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        private a() {
        }
    }

    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str, boolean z10) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z10;
        }
    }

    public enum c {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        
        private final Object defaultValue;

        static final class a extends c {
            a(String str, int i10) {
                super(str, i10, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Iterable<String> h10 = g0.h("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C16877v.y(h10, 10));
        for (String a10 : h10) {
            a aVar = f136347a;
            String m10 = C17558e.BOOLEAN.m();
            C17542s.i(m10, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", a10, "Ljava/util/Collection;", m10));
        }
        f136348b = arrayList;
        Iterable<a.C3351a> iterable = arrayList;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (a.C3351a d10 : iterable) {
            arrayList2.add(d10.d());
        }
        f136349c = arrayList2;
        Iterable<a.C3351a> iterable2 = f136348b;
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable2, 10));
        for (a.C3351a c10 : iterable2) {
            arrayList3.add(c10.c().b());
        }
        f136350d = arrayList3;
        C16664F f10 = C16664F.f139318a;
        a aVar2 = f136347a;
        String i10 = f10.i("Collection");
        C17558e eVar = C17558e.BOOLEAN;
        String m11 = eVar.m();
        C17542s.i(m11, "getDesc(...)");
        a.C3351a a11 = aVar2.m(i10, "contains", "Ljava/lang/Object;", m11);
        c cVar = c.FALSE;
        v a12 = C16796C.a(a11, cVar);
        String i11 = f10.i("Collection");
        String m12 = eVar.m();
        C17542s.i(m12, "getDesc(...)");
        v a13 = C16796C.a(aVar2.m(i11, "remove", "Ljava/lang/Object;", m12), cVar);
        String i12 = f10.i("Map");
        String m13 = eVar.m();
        C17542s.i(m13, "getDesc(...)");
        v a14 = C16796C.a(aVar2.m(i12, "containsKey", "Ljava/lang/Object;", m13), cVar);
        String i13 = f10.i("Map");
        String m14 = eVar.m();
        C17542s.i(m14, "getDesc(...)");
        v a15 = C16796C.a(aVar2.m(i13, "containsValue", "Ljava/lang/Object;", m14), cVar);
        String i14 = f10.i("Map");
        String m15 = eVar.m();
        C17542s.i(m15, "getDesc(...)");
        v a16 = C16796C.a(aVar2.m(i14, "remove", "Ljava/lang/Object;Ljava/lang/Object;", m15), cVar);
        v a17 = C16796C.a(aVar2.m(f10.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C3351a a18 = aVar2.m(f10.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        v a19 = C16796C.a(a18, cVar2);
        v a20 = C16796C.a(aVar2.m(f10.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String i15 = f10.i("List");
        C17558e eVar2 = C17558e.INT;
        String m16 = eVar2.m();
        C17542s.i(m16, "getDesc(...)");
        String str = "get";
        a.C3351a a21 = aVar2.m(i15, "indexOf", "Ljava/lang/Object;", m16);
        c cVar3 = c.INDEX;
        v a22 = C16796C.a(a21, cVar3);
        String i16 = f10.i("List");
        String m17 = eVar2.m();
        C17542s.i(m17, "getDesc(...)");
        Map<a.C3351a, c> m18 = X.m(a12, a13, a14, a15, a16, a17, a19, a20, a22, C16796C.a(aVar2.m(i16, "lastIndexOf", "Ljava/lang/Object;", m17), cVar3));
        f136351e = m18;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(m18.size()));
        for (Map.Entry entry : m18.entrySet()) {
            linkedHashMap.put(((a.C3351a) entry.getKey()).d(), entry.getValue());
        }
        f136352f = linkedHashMap;
        Iterable<a.C3351a> k10 = g0.k(f136351e.keySet(), f136348b);
        ArrayList arrayList4 = new ArrayList(C16877v.y(k10, 10));
        for (a.C3351a c11 : k10) {
            arrayList4.add(c11.c());
        }
        f136353g = C16877v.y1(arrayList4);
        ArrayList arrayList5 = new ArrayList(C16877v.y(k10, 10));
        for (a.C3351a d11 : k10) {
            arrayList5.add(d11.d());
        }
        f136354h = C16877v.y1(arrayList5);
        a aVar3 = f136347a;
        C17558e eVar3 = C17558e.INT;
        String m19 = eVar3.m();
        C17542s.i(m19, "getDesc(...)");
        a.C3351a a23 = aVar3.m("java/util/List", "removeAt", m19, "Ljava/lang/Object;");
        f136355i = a23;
        C16664F f11 = C16664F.f139318a;
        String h11 = f11.h("Number");
        String m20 = C17558e.BYTE.m();
        C17542s.i(m20, "getDesc(...)");
        v a24 = C16796C.a(aVar3.m(h11, "toByte", "", m20), C17069f.v("byteValue"));
        String h12 = f11.h("Number");
        String m21 = C17558e.SHORT.m();
        C17542s.i(m21, "getDesc(...)");
        v a25 = C16796C.a(aVar3.m(h12, "toShort", "", m21), C17069f.v("shortValue"));
        String h13 = f11.h("Number");
        String m22 = eVar3.m();
        C17542s.i(m22, "getDesc(...)");
        v a26 = C16796C.a(aVar3.m(h13, "toInt", "", m22), C17069f.v("intValue"));
        String h14 = f11.h("Number");
        String m23 = C17558e.LONG.m();
        C17542s.i(m23, "getDesc(...)");
        v a27 = C16796C.a(aVar3.m(h14, "toLong", "", m23), C17069f.v("longValue"));
        String h15 = f11.h("Number");
        String m24 = C17558e.FLOAT.m();
        C17542s.i(m24, "getDesc(...)");
        v a28 = C16796C.a(aVar3.m(h15, "toFloat", "", m24), C17069f.v("floatValue"));
        String h16 = f11.h("Number");
        String m25 = C17558e.DOUBLE.m();
        C17542s.i(m25, "getDesc(...)");
        v a29 = C16796C.a(aVar3.m(h16, "toDouble", "", m25), C17069f.v("doubleValue"));
        v a30 = C16796C.a(a23, C17069f.v("remove"));
        String h17 = f11.h("CharSequence");
        String m26 = eVar3.m();
        C17542s.i(m26, "getDesc(...)");
        String m27 = C17558e.CHAR.m();
        C17542s.i(m27, "getDesc(...)");
        Map<a.C3351a, C17069f> m28 = X.m(a24, a25, a26, a27, a28, a29, a30, C16796C.a(aVar3.m(h17, str, m26, m27), C17069f.v("charAt")));
        f136356j = m28;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(X.e(m28.size()));
        for (Map.Entry entry2 : m28.entrySet()) {
            linkedHashMap2.put(((a.C3351a) entry2.getKey()).d(), entry2.getValue());
        }
        f136357k = linkedHashMap2;
        Map<a.C3351a, C17069f> map = f136356j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry next : map.entrySet()) {
            linkedHashSet.add(a.C3351a.b((a.C3351a) next.getKey(), (String) null, (C17069f) next.getValue(), (String) null, (String) null, 13, (Object) null).d());
        }
        f136358l = linkedHashSet;
        HashSet hashSet = new HashSet();
        for (a.C3351a c12 : f136356j.keySet()) {
            hashSet.add(c12.c());
        }
        f136359m = hashSet;
        Iterable<Map.Entry> entrySet = f136356j.entrySet();
        ArrayList<v> arrayList6 = new ArrayList<>(C16877v.y(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList6.add(new v(((a.C3351a) entry3.getKey()).c(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList6, 10)), 16));
        for (v vVar : arrayList6) {
            linkedHashMap3.put((C17069f) vVar.d(), (C17069f) vVar.c());
        }
        f136360n = linkedHashMap3;
    }
}
