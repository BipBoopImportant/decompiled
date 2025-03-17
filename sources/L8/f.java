package L8;

import G8.g;
import GJ.C15768k;
import HJ.C15844j;
import HJ.C15846l;
import HJ.C15850p;
import HJ.C15854t;
import YH.C16877v;
import bI.C17035a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"LL8/f;", "", "<init>", "()V", "", "pattern", "url", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "param", "a", "(Ljava/lang/String;)Ljava/lang/String;", "patterns", "c", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "LHJ/p;", "LHJ/p;", "TEMPLATE_MATCHER", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f38460a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final C15850p f38461b = new C15850p("/:\\w*");

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHJ/l;", "match", "", "a", "(LHJ/l;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<C15846l, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f38462c = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C15846l lVar) {
            C17542s.j(lVar, "match");
            return lVar.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((String) t11).length()), Integer.valueOf(((String) t10).length()));
        }
    }

    private f() {
    }

    private final String a(String str) {
        StringBuilder sb2 = new StringBuilder("CS_ANONYMIZED_");
        String E12 = C15854t.E1(str, 2);
        Locale locale = Locale.getDefault();
        C17542s.i(locale, "getDefault()");
        String upperCase = E12.toUpperCase(locale);
        C17542s.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    private final List<String> b(String str) {
        List<String> a02 = C15768k.a0(C15768k.S(C15850p.f(f38461b, str, 0, 2, (Object) null), a.f38462c));
        ArrayList arrayList = new ArrayList(C16877v.y(a02, 10));
        for (String a10 : a02) {
            arrayList.add(f38460a.a(a10));
        }
        return g.l(arrayList);
    }

    private final String d(String str, String str2) {
        List<String> b10 = b(str);
        C15850p pVar = new C15850p(f38461b.j(str, "/([^/?]+)"));
        int i10 = 0;
        C15846l d10 = C15850p.d(pVar, str2, 0, 2, (Object) null);
        if (d10 == null) {
            return null;
        }
        for (Object next : g.l(C16877v.n0(d10.getGroups(), 1))) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C15844j jVar = (C15844j) next;
            String str3 = (String) C16877v.z0(b10, i10);
            if (!(str3 == null || jVar == null)) {
                str2 = C15854t.S0(str2, jVar.a().p(), jVar.a().q() + 1, str3).toString();
            }
            i10 = i11;
        }
        return str2;
    }

    public final String c(String str, List<String> list) {
        C17542s.j(str, "url");
        C17542s.j(list, "patterns");
        for (T d10 : C16877v.g1(list, new b())) {
            String d11 = f38460a.d(d10, str);
            if (d11 != null) {
                return d11;
            }
        }
        return str;
    }
}
