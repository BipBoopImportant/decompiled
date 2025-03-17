package Ad;

import Bd.a;
import Bd.b;
import Jd.i;
import XH.C16807N;
import YH.C16877v;
import jL.C17492a;
import jL.d;
import jL.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import mL.C17617a;
import mL.C17620d;
import nI.C17631a;
import oL.C17722a;
import pL.C17770a;
import qL.C17844a;
import qL.C17846c;
import rL.C17882c;
import sL.C17952a;
import tL.C18036b;
import zd.C10490b;
import zd.f;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LoL/a;", "a", "LoL/a;", "f", "()LoL/a;", "libraryModule", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final C17722a f58679a = C18036b.b(false, new c(), 1, (Object) null);

    public static final C17722a f() {
        return f58679a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17722a aVar) {
        C17542s.j(aVar, "$this$module");
        d dVar = new d();
        C17882c.a aVar2 = C17882c.f146880e;
        C17846c a10 = aVar2.a();
        d dVar2 = d.Singleton;
        C17620d dVar3 = new C17620d(new C17492a(a10, P.b(C10490b.class), (C17844a) null, dVar, dVar2, C16877v.n()));
        aVar.f(dVar3);
        if (aVar.e()) {
            aVar.g(dVar3);
        }
        new e(aVar, dVar3);
        e eVar = new e();
        C17620d dVar4 = new C17620d(new C17492a(aVar2.a(), P.b(a.class), (C17844a) null, eVar, dVar2, C16877v.n()));
        aVar.f(dVar4);
        if (aVar.e()) {
            aVar.g(dVar4);
        }
        new e(aVar, dVar4);
        f fVar = new f();
        C17846c a11 = aVar2.a();
        d dVar5 = d.Factory;
        C17617a aVar3 = new C17617a(new C17492a(a11, P.b(Jd.a.class), (C17844a) null, fVar, dVar5, C16877v.n()));
        aVar.f(aVar3);
        new e(aVar, aVar3);
        g gVar = new g();
        C17617a aVar4 = new C17617a(new C17492a(aVar2.a(), P.b(i.class), (C17844a) null, gVar, dVar5, C16877v.n()));
        aVar.f(aVar4);
        new e(aVar, aVar4);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C10490b h(C17952a aVar, C17770a aVar2) {
        C17542s.j(aVar, "$this$single");
        C17542s.j(aVar2, "it");
        return f.f78115a.d();
    }

    /* access modifiers changed from: private */
    public static final a i(C17952a aVar, C17770a aVar2) {
        C17542s.j(aVar, "$this$single");
        C17542s.j(aVar2, "it");
        return new b((C10490b) aVar.b(P.b(C10490b.class), (C17844a) null, (C17631a<? extends C17770a>) null));
    }

    /* access modifiers changed from: private */
    public static final Jd.a j(C17952a aVar, C17770a aVar2) {
        C17542s.j(aVar, "$this$viewModel");
        C17542s.j(aVar2, "it");
        return new Jd.a((a) aVar.b(P.b(a.class), (C17844a) null, (C17631a<? extends C17770a>) null));
    }

    /* access modifiers changed from: private */
    public static final i k(C17952a aVar, C17770a aVar2) {
        C17542s.j(aVar, "$this$viewModel");
        C17542s.j(aVar2, "it");
        return new i();
    }
}
