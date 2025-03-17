package Pp;

import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import Op.C10828d;
import Pp.d;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LPp/e;", "LPp/d;", "LPp/c;", "infoMapper", "LPp/a;", "disclaimerMapper", "<init>", "(LPp/c;LPp/a;)V", "LPp/d$a;", "itemToMap", "LOp/d;", "a", "(LPp/d$a;)LOp/d;", "LPp/c;", "b", "LPp/a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final c f85678a;

    /* renamed from: b  reason: collision with root package name */
    private final a f85679b;

    public e(c cVar, a aVar) {
        C17542s.j(cVar, "infoMapper");
        C17542s.j(aVar, "disclaimerMapper");
        this.f85678a = cVar;
        this.f85679b = aVar;
    }

    public C10828d a(d.a aVar) {
        d.a aVar2 = aVar;
        C17542s.j(aVar2, "itemToMap");
        d.a.C1733a a10 = aVar.a();
        C10828d.f fVar = a10 != null ? new C10828d.f(a10.a(), a10.b(), (Integer) null, 4, (DefaultConstructorMarker) null) : null;
        String j10 = aVar.j();
        String k10 = aVar.k();
        C15990f b10 = C15985a.b(new C10828d.m.b(new C10828d.C1720d(aVar.i().d(), (String) null)));
        C15987c<C10828d.g> a11 = this.f85679b.a(aVar2);
        List c10 = C16877v.c();
        if (fVar != null) {
            c10.add(fVar);
        }
        return new C10828d(j10, k10, (C10828d.b) null, b10, this.f85678a.c(aVar2), a11, C15985a.h(C16877v.a(c10)), aVar.p());
    }
}
