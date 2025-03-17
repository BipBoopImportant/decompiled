package RB;

import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import XH.C16807N;
import cD.C14029a;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kD.l;
import kD.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"LRB/l;", "", "LcD/a;", "editProfileRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LcD/a;LFB/a;)V", "LEB/d;", "selection", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "b", "(LEB/d;LnI/l;)V", "a", "LcD/a;", "LFB/a;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.l  reason: case insensitive filesystem */
public final class C13515l {

    /* renamed from: a  reason: collision with root package name */
    private final C14029a f115304a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f115305b;

    public C13515l(C14029a aVar, C12860a aVar2) {
        C17542s.j(aVar, "editProfileRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f115304a = aVar;
        this.f115305b = aVar2;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13515l lVar, C12832d dVar, C17642l lVar2, l lVar3) {
        C17542s.j(lVar3, "state");
        if (!C17542s.e(lVar3, m.f128647a)) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to update profile store", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = lVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
        } else if (lVar.f115305b.c() == null) {
            lVar.f115305b.a(dVar);
        }
        lVar2.invoke(lVar3);
        return C16807N.f139792a;
    }

    public final void b(C12832d dVar, C17642l<? super l, C16807N> lVar) {
        C17542s.j(dVar, "selection");
        C17542s.j(lVar, "stateListener");
        this.f115304a.a(dVar.e(), new C13514k(this, dVar, lVar));
    }
}
