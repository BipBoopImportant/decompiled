package EH;

import HJ.C15854t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u001a)\u0010\u0005\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u0019\u0010\u0010\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0007*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\"(\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "LEH/G;", "out", "d", "(LEH/G;Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "encodedUser", "host", "LXH/N;", "c", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "encodedPath", "b", "", "h", "(Ljava/util/List;)Ljava/lang/String;", "g", "(LEH/G;)Ljava/lang/String;", "encodedUserAndPassword", "e", "authority", "value", "f", "i", "(LEH/G;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.I  reason: case insensitive filesystem */
public final class C15604I {
    private static final void b(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        if (!C15854t.e1(str2, '/', false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void c(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    /* access modifiers changed from: private */
    public static final <A extends Appendable> A d(C15602G g10, A a10) {
        a10.append(g10.o().d());
        String d10 = g10.o().d();
        if (C17542s.e(d10, "file")) {
            b(a10, g10.j(), f(g10));
            return a10;
        } else if (C17542s.e(d10, "mailto")) {
            c(a10, g(g10), g10.j());
            return a10;
        } else {
            a10.append("://");
            a10.append(e(g10));
            C15610O.e(a10, f(g10), g10.e(), g10.p());
            if (g10.d().length() > 0) {
                a10.append('#');
                a10.append(g10.d());
            }
            return a10;
        }
    }

    public static final String e(C15602G g10) {
        C17542s.j(g10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g(g10));
        sb2.append(g10.j());
        if (!(g10.n() == 0 || g10.n() == g10.o().c())) {
            sb2.append(":");
            sb2.append(String.valueOf(g10.n()));
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String f(C15602G g10) {
        C17542s.j(g10, "<this>");
        return h(g10.g());
    }

    public static final String g(C15602G g10) {
        C17542s.j(g10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        C15610O.f(sb2, g10.h(), g10.f());
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final String h(List<String> list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) C16877v.w0(list)).length() == 0 ? "/" : (String) C16877v.w0(list) : C16877v.G0(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public static final void i(C15602G g10, String str) {
        List<String> list;
        C17542s.j(g10, "<this>");
        C17542s.j(str, "value");
        if (C15854t.v0(str)) {
            list = C16877v.n();
        } else if (C17542s.e(str, "/")) {
            list = C15607L.d();
        } else {
            list = C16877v.w1(C15854t.X0(str, new char[]{'/'}, false, 0, 6, (Object) null));
        }
        g10.u(list);
    }
}
