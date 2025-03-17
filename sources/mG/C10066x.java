package mg;

import Ce.d;
import HJ.C15854t;
import TJ.C16532g;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lmg/x;", "LCe/d;", "Lup/d;", "userConsentRepository", "<init>", "(Lup/d;)V", "LTJ/g;", "", "a", "LTJ/g;", "()LTJ/g;", "isContentsquareEnabled", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mg.x  reason: case insensitive filesystem */
public final class C10066x implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<Boolean> f75412a;

    public C10066x(C12074d dVar) {
        C17542s.j(dVar, "userConsentRepository");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Init ContentsquareTrackerContractImpl", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C10066x.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        this.f75412a = dVar.c(C12071a.b.f103980e);
    }

    public C16532g<Boolean> a() {
        return this.f75412a;
    }
}
