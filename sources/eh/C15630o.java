package EH;

import HJ.C15854t;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.v;
import YH.C16877v;
import bI.C17035a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00160\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a=\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u0015j\b\u0012\u0004\u0012\u00020\u001a`\u00160\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "header", "", "LEH/h;", "b", "(Ljava/lang/String;)Ljava/util/List;", "text", "c", "", "parametersOnly", "d", "(Ljava/lang/String;Z)Ljava/util/List;", "T", "LXH/o;", "k", "(LXH/o;)Ljava/util/List;", "", "start", "end", "j", "(Ljava/lang/String;II)Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "items", "e", "(Ljava/lang/String;ILXH/o;Z)I", "LEH/i;", "parameters", "f", "(Ljava/lang/String;ILXH/o;)I", "value", "LXH/v;", "h", "(Ljava/lang/String;I)LXH/v;", "i", "a", "(Ljava/lang/String;I)Z", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.o  reason: case insensitive filesystem */
public final class C15630o {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.o$a */
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Double.valueOf(((C15623h) t11).c()), Double.valueOf(((C15623h) t10).c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/ArrayList;", "LEH/h;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.o$b */
    static final class b extends C17544u implements C17631a<ArrayList<C15623h>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f134037c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final ArrayList<C15623h> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/ArrayList;", "LEH/i;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.o$c */
    static final class c extends C17544u implements C17631a<ArrayList<C15624i>> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f134038c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final ArrayList<C15624i> invoke() {
            return new ArrayList<>();
        }
    }

    private static final boolean a(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';';
    }

    public static final List<C15623h> b(String str) {
        return C16877v.g1(c(str), new a());
    }

    public static final List<C15623h> c(String str) {
        return d(str, false);
    }

    public static final List<C15623h> d(String str, boolean z10) {
        if (str == null) {
            return C16877v.n();
        }
        C16824o a10 = C16825p.a(s.NONE, b.f134037c);
        int i10 = 0;
        while (i10 <= C15854t.m0(str)) {
            i10 = e(str, i10, a10, z10);
        }
        return k(a10);
    }

    private static final int e(String str, int i10, C16824o<? extends ArrayList<C15623h>> oVar, boolean z10) {
        C16824o a10 = C16825p.a(s.NONE, c.f134038c);
        Integer valueOf = z10 ? Integer.valueOf(i10) : null;
        int i11 = i10;
        while (i11 <= C15854t.m0(str)) {
            char charAt = str.charAt(i11);
            if (charAt == ',') {
                ((ArrayList) oVar.getValue()).add(new C15623h(j(str, i10, valueOf != null ? valueOf.intValue() : i11), k(a10)));
                return i11 + 1;
            } else if (charAt == ';') {
                if (valueOf == null) {
                    valueOf = Integer.valueOf(i11);
                }
                i11 = f(str, i11 + 1, a10);
            } else {
                i11 = z10 ? f(str, i11, a10) : i11 + 1;
            }
        }
        ((ArrayList) oVar.getValue()).add(new C15623h(j(str, i10, valueOf != null ? valueOf.intValue() : i11), k(a10)));
        return i11;
    }

    private static final int f(String str, int i10, C16824o<? extends ArrayList<C15624i>> oVar) {
        int i11 = i10;
        while (i11 <= C15854t.m0(str)) {
            char charAt = str.charAt(i11);
            if (charAt == '=') {
                v<Integer, String> h10 = h(str, i11 + 1);
                int intValue = h10.a().intValue();
                g(oVar, str, i10, i11, h10.b());
                return intValue;
            } else if (charAt == ';' || charAt == ',') {
                g(oVar, str, i10, i11, "");
                return i11;
            } else {
                i11++;
            }
        }
        g(oVar, str, i10, i11, "");
        return i11;
    }

    private static final void g(C16824o<? extends ArrayList<C15624i>> oVar, String str, int i10, int i11, String str2) {
        String j10 = j(str, i10, i11);
        if (j10.length() != 0) {
            ((ArrayList) oVar.getValue()).add(new C15624i(j10, str2));
        }
    }

    private static final v<Integer, String> h(String str, int i10) {
        if (str.length() == i10) {
            return C16796C.a(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return i(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= C15854t.m0(str)) {
            char charAt = str.charAt(i11);
            if (charAt == ';' || charAt == ',') {
                return C16796C.a(Integer.valueOf(i11), j(str, i10, i11));
            }
            i11++;
        }
        return C16796C.a(Integer.valueOf(i11), j(str, i10, i11));
    }

    private static final v<Integer, String> i(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= C15854t.m0(str)) {
            char charAt = str.charAt(i10);
            if (charAt == '\"' && a(str, i10)) {
                Integer valueOf = Integer.valueOf(i10 + 1);
                String sb3 = sb2.toString();
                C17542s.i(sb3, "builder.toString()");
                return C16796C.a(valueOf, sb3);
            } else if (charAt != '\\' || i10 >= C15854t.m0(str) - 2) {
                sb2.append(charAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer valueOf2 = Integer.valueOf(i10);
        String sb4 = sb2.toString();
        C17542s.i(sb4, "builder.toString()");
        return C16796C.a(valueOf2, '\"' + sb4);
    }

    private static final String j(String str, int i10, int i11) {
        String substring = str.substring(i10, i11);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C15854t.z1(substring).toString();
    }

    private static final <T> List<T> k(C16824o<? extends List<? extends T>> oVar) {
        return oVar.isInitialized() ? (List) oVar.getValue() : C16877v.n();
    }
}
