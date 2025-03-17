package EH;

import JH.v;
import JH.w;
import YH.C16877v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJH/w;", "parameters", "LEH/A;", "d", "(LJH/w;)LEH/A;", "LJH/v;", "LEH/B;", "e", "(LJH/v;)LEH/B;", "LXH/N;", "b", "(LJH/w;LJH/w;)V", "c", "(LJH/w;LJH/v;)V", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.T  reason: case insensitive filesystem */
public final class C15614T {
    private static final void b(w wVar, w wVar2) {
        for (String str : wVar2.names()) {
            List<String> c10 = wVar2.c(str);
            if (c10 == null) {
                c10 = C16877v.n();
            }
            String k10 = C15617b.k(str, 0, 0, false, (Charset) null, 15, (Object) null);
            Iterable<String> iterable = c10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (String k11 : iterable) {
                arrayList.add(C15617b.k(k11, 0, 0, true, (Charset) null, 11, (Object) null));
            }
            wVar.e(k10, arrayList);
        }
    }

    /* access modifiers changed from: private */
    public static final void c(w wVar, v vVar) {
        for (String str : vVar.names()) {
            List<String> c10 = vVar.c(str);
            if (c10 == null) {
                c10 = C16877v.n();
            }
            String m10 = C15617b.m(str, false, 1, (Object) null);
            Iterable<String> iterable = c10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (String n10 : iterable) {
                arrayList.add(C15617b.n(n10));
            }
            wVar.e(m10, arrayList);
        }
    }

    public static final C15596A d(w wVar) {
        C17542s.j(wVar, "parameters");
        C15597B b10 = C15600E.b(0, 1, (Object) null);
        b(b10, wVar);
        return b10.g();
    }

    public static final C15597B e(v vVar) {
        C17542s.j(vVar, "parameters");
        C15597B b10 = C15600E.b(0, 1, (Object) null);
        c(b10, vVar);
        return b10;
    }
}
