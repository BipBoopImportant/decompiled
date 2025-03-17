package EH;

import HJ.C15854t;
import JH.z;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u001a\u001a\u00020\u0019*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010 \u001a\u00020\u0019*\u00060\u001cj\u0002`\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b \u0010!\"\u0015\u0010$\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "urlString", "LEH/Q;", "d", "(Ljava/lang/String;)LEH/Q;", "LEH/G;", "builder", "c", "(LEH/G;)LEH/Q;", "b", "(Ljava/lang/String;)LEH/G;", "url", "a", "(LEH/Q;)LEH/G;", "h", "(LEH/G;LEH/G;)LEH/G;", "i", "(LEH/G;LEH/Q;)LEH/G;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "LEH/B;", "encodedQueryParameters", "", "trailingQuery", "LXH/N;", "e", "(Ljava/lang/Appendable;Ljava/lang/String;LEH/B;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "f", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "g", "(LEH/Q;)Ljava/lang/String;", "hostWithPort", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.O  reason: case insensitive filesystem */
public final class C15610O {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/v;", "", "it", "", "a", "(LXH/v;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.O$a */
    static final class a extends C17544u implements C17642l<v<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f133947c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(v<String, String> vVar) {
            C17542s.j(vVar, "it");
            String c10 = vVar.c();
            if (vVar.d() == null) {
                return c10;
            }
            String valueOf = String.valueOf(vVar.d());
            return c10 + '=' + valueOf;
        }
    }

    public static final C15602G a(C15612Q q10) {
        C17542s.j(q10, "url");
        return i(new C15602G((C15608M) null, (String) null, 0, (String) null, (String) null, (List) null, (C15596A) null, (String) null, false, 511, (DefaultConstructorMarker) null), q10);
    }

    public static final C15602G b(String str) {
        C17542s.j(str, "urlString");
        return C15607L.j(new C15602G((C15608M) null, (String) null, 0, (String) null, (String) null, (List) null, (C15596A) null, (String) null, false, 511, (DefaultConstructorMarker) null), str);
    }

    public static final C15612Q c(C15602G g10) {
        C17542s.j(g10, "builder");
        return h(new C15602G((C15608M) null, (String) null, 0, (String) null, (String) null, (List) null, (C15596A) null, (String) null, false, 511, (DefaultConstructorMarker) null), g10).b();
    }

    public static final C15612Q d(String str) {
        C17542s.j(str, "urlString");
        return b(str).b();
    }

    public static final void e(Appendable appendable, String str, C15597B b10, boolean z10) {
        List list;
        C17542s.j(appendable, "<this>");
        C17542s.j(str, "encodedPath");
        C17542s.j(b10, "encodedQueryParameters");
        if (!C15854t.v0(str) && !C15854t.W(str, "/", false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (!b10.isEmpty() || z10) {
            appendable.append("?");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : b10.a()) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = C16877v.e(C16796C.a(str2, null));
            } else {
                Iterable<String> iterable = list2;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                for (String a10 : iterable) {
                    arrayList2.add(C16796C.a(str2, a10));
                }
                list = arrayList2;
            }
            C16877v.E(arrayList, list);
        }
        C16877v.E0(arrayList, appendable, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f133947c, 60, (Object) null);
    }

    public static final void f(StringBuilder sb2, String str, String str2) {
        C17542s.j(sb2, "<this>");
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
    }

    public static final String g(C15612Q q10) {
        C17542s.j(q10, "<this>");
        return q10.g() + ':' + q10.j();
    }

    public static final C15602G h(C15602G g10, C15602G g11) {
        C17542s.j(g10, "<this>");
        C17542s.j(g11, "url");
        g10.y(g11.o());
        g10.w(g11.j());
        g10.x(g11.n());
        g10.u(g11.g());
        g10.v(g11.h());
        g10.t(g11.f());
        C15597B b10 = C15600E.b(0, 1, (Object) null);
        z.c(b10, g11.e());
        g10.s(b10);
        g10.r(g11.d());
        g10.z(g11.p());
        return g10;
    }

    public static final C15602G i(C15602G g10, C15612Q q10) {
        C17542s.j(g10, "<this>");
        C17542s.j(q10, "url");
        g10.y(q10.k());
        g10.w(q10.g());
        g10.x(q10.j());
        C15604I.i(g10, q10.d());
        g10.v(q10.f());
        g10.t(q10.c());
        C15597B b10 = C15600E.b(0, 1, (Object) null);
        b10.d(C15601F.d(q10.e(), 0, 0, false, 6, (Object) null));
        g10.s(b10);
        g10.r(q10.b());
        g10.z(q10.m());
        return g10;
    }
}
