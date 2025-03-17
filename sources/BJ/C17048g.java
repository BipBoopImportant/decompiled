package bJ;

import HJ.C15854t;
import XH.t;
import YH.C16877v;
import YH.Q;
import YH.X;
import ZI.c;
import aJ.C17030a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

/* renamed from: bJ.g  reason: case insensitive filesystem */
public class C17048g implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f141183d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f141184e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f141185f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Integer> f141186g;

    /* renamed from: a  reason: collision with root package name */
    private final String[] f141187a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f141188b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C17030a.e.c> f141189c;

    /* renamed from: bJ.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: bJ.g$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f141190a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aJ.a$e$c$c[] r0 = aJ.C17030a.e.c.C3456c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aJ.a$e$c$c r1 = aJ.C17030a.e.c.C3456c.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aJ.a$e$c$c r1 = aJ.C17030a.e.c.C3456c.INTERNAL_TO_CLASS_ID     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aJ.a$e$c$c r1 = aJ.C17030a.e.c.C3456c.DESC_TO_CLASS_ID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f141190a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bJ.C17048g.b.<clinit>():void");
        }
    }

    static {
        String G02 = C16877v.G0(C16877v.q('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        f141184e = G02;
        List<String> q10 = C16877v.q(G02 + "/Any", G02 + "/Nothing", G02 + "/Unit", G02 + "/Throwable", G02 + "/Number", G02 + "/Byte", G02 + "/Double", G02 + "/Float", G02 + "/Int", G02 + "/Long", G02 + "/Short", G02 + "/Boolean", G02 + "/Char", G02 + "/CharSequence", G02 + "/String", G02 + "/Comparable", G02 + "/Enum", G02 + "/Array", G02 + "/ByteArray", G02 + "/DoubleArray", G02 + "/FloatArray", G02 + "/IntArray", G02 + "/LongArray", G02 + "/ShortArray", G02 + "/BooleanArray", G02 + "/CharArray", G02 + "/Cloneable", G02 + "/Annotation", G02 + "/collections/Iterable", G02 + "/collections/MutableIterable", G02 + "/collections/Collection", G02 + "/collections/MutableCollection", G02 + "/collections/List", G02 + "/collections/MutableList", G02 + "/collections/Set", G02 + "/collections/MutableSet", G02 + "/collections/Map", G02 + "/collections/MutableMap", G02 + "/collections/Map.Entry", G02 + "/collections/MutableMap.MutableEntry", G02 + "/collections/Iterator", G02 + "/collections/MutableIterator", G02 + "/collections/ListIterator", G02 + "/collections/MutableListIterator");
        f141185f = q10;
        Iterable<Q> B12 = C16877v.B1(q10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(B12, 10)), 16));
        for (Q q11 : B12) {
            linkedHashMap.put((String) q11.d(), Integer.valueOf(q11.c()));
        }
        f141186g = linkedHashMap;
    }

    public C17048g(String[] strArr, Set<Integer> set, List<C17030a.e.c> list) {
        C17542s.j(strArr, "strings");
        C17542s.j(set, "localNameIndices");
        C17542s.j(list, "records");
        this.f141187a = strArr;
        this.f141188b = set;
        this.f141189c = list;
    }

    public boolean a(int i10) {
        return this.f141188b.contains(Integer.valueOf(i10));
    }

    public String b(int i10) {
        return getString(i10);
    }

    public String getString(int i10) {
        String str;
        C17030a.e.c cVar = this.f141189c.get(i10);
        if (cVar.K()) {
            str = cVar.D();
        } else {
            if (cVar.I()) {
                List<String> list = f141185f;
                int size = list.size();
                int z10 = cVar.z();
                if (z10 >= 0 && z10 < size) {
                    str = list.get(cVar.z());
                }
            }
            str = this.f141187a[i10];
        }
        if (cVar.F() >= 2) {
            List<Integer> G10 = cVar.G();
            C17542s.g(G10);
            Integer num = G10.get(0);
            Integer num2 = G10.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                C17542s.g(str);
                C17542s.g(num);
                int intValue = num.intValue();
                C17542s.g(num2);
                str = str.substring(intValue, num2.intValue());
                C17542s.i(str, "substring(...)");
            }
        }
        String str2 = str;
        if (cVar.B() >= 2) {
            List<Integer> C10 = cVar.C();
            C17542s.g(C10);
            C17542s.g(str2);
            str2 = C15854t.P(str2, (char) C10.get(0).intValue(), (char) C10.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C17030a.e.c.C3456c y10 = cVar.y();
        if (y10 == null) {
            y10 = C17030a.e.c.C3456c.NONE;
        }
        int i11 = b.f141190a[y10.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                C17542s.g(str3);
                str3 = C15854t.P(str3, '$', '.', false, 4, (Object) null);
            } else if (i11 == 3) {
                if (str3.length() >= 2) {
                    C17542s.g(str3);
                    str3 = str3.substring(1, str3.length() - 1);
                    C17542s.i(str3, "substring(...)");
                }
                String str4 = str3;
                C17542s.g(str4);
                str3 = C15854t.P(str4, '$', '.', false, 4, (Object) null);
            } else {
                throw new t();
            }
        }
        C17542s.g(str3);
        return str3;
    }
}
