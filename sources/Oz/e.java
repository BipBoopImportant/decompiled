package Oz;

import Ae.l;
import EB.C12829a;
import EB.C12832d;
import FB.C12860a;
import FB.C12861b;
import Oz.d;
import Ry.b;
import Sy.a;
import XH.t;
import XH.x;
import XH.y;
import ej.C11244b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LOz/e;", "LOz/d;", "Lej/b;", "scanAndGoCleanUp", "LRy/b;", "capability", "LFB/a;", "localStoreSelectionRepository", "LSy/a;", "analytics", "<init>", "(Lej/b;LRy/b;LFB/a;LSy/a;)V", "LEB/d;", "storeSelection", "LAe/l;", "entryPoint", "LXH/N;", "b", "(LEB/d;LAe/l;)V", "LXH/x;", "LOz/d$a;", "a", "(LEB/d;LAe/l;)Ljava/lang/Object;", "Lej/b;", "LRy/b;", "c", "LFB/a;", "d", "LSy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C11244b f113806a;

    /* renamed from: b  reason: collision with root package name */
    private final b f113807b;

    /* renamed from: c  reason: collision with root package name */
    private final C12860a f113808c;

    /* renamed from: d  reason: collision with root package name */
    private final a f113809d;

    public e(C11244b bVar, b bVar2, C12860a aVar, a aVar2) {
        C17542s.j(bVar, "scanAndGoCleanUp");
        C17542s.j(bVar2, "capability");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "analytics");
        this.f113806a = bVar;
        this.f113807b = bVar2;
        this.f113808c = aVar;
        this.f113809d = aVar2;
    }

    private final void b(C12832d dVar, l lVar) {
        this.f113808c.a(C12832d.b(dVar, (String) null, (String) null, (String) null, true, (C12829a) null, 23, (Object) null));
        this.f113809d.C(lVar);
    }

    public Object a(C12832d dVar, l lVar) {
        Object obj;
        C17542s.j(dVar, "storeSelection");
        C17542s.j(lVar, "entryPoint");
        if (dVar.e().length() == 0) {
            x.a aVar = x.f139812b;
            return x.b(y.a(new IllegalArgumentException("Store id mustn't be empty")));
        }
        C12832d a10 = C12861b.a(this.f113808c);
        String e10 = a10 != null ? a10.e() : null;
        if (e10 == null) {
            e10 = "";
        }
        Object aVar2 = C17542s.e(e10, dVar.e()) ? d.a.b.f113804a : e10.length() == 0 ? d.a.c.f113805a : new d.a.C2795a(e10);
        if (aVar2 instanceof d.a.C2795a) {
            this.f113806a.a(((d.a.C2795a) aVar2).a());
            this.f113807b.f();
            b(dVar, lVar);
            obj = x.b(aVar2);
        } else if (C17542s.e(aVar2, d.a.b.f113804a)) {
            obj = x.b(aVar2);
        } else if (C17542s.e(aVar2, d.a.c.f113805a)) {
            b(dVar, lVar);
            obj = x.b(aVar2);
        } else {
            throw new t();
        }
        this.f113806a.b(dVar.e());
        return obj;
    }
}
