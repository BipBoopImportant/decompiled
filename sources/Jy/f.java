package Jy;

import By.C12674m;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import Jy.o;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.C10828d;
import XH.t;
import il.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LJy/f;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LJy/o$a$a;", "item", "LOp/d;", "b", "(LJy/o$a$a;)LOp/d;", "LJy/o$a$c;", "d", "(LJy/o$a$c;)LOp/d;", "LJy/o$a$e;", "c", "(LJy/o$a$e;)LOp/d;", "LJy/o$a;", "a", "(LJy/o$a;)LOp/d;", "LIl/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f111402a;

    public f(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f111402a = aVar;
    }

    private final C10828d b(o.a.C2708a aVar) {
        C10828d h10 = B0.h(aVar.g().g(), this.f111402a.s(), false, false, false, false, 28, (Object) null);
        return C10828d.b(h10, (String) null, (String) null, (C10828d.b) null, (C15987c) null, C10828d.h.b(h10.e(), (C10828d.i) null, (C13023e) null, (String) null, (String) null, (C13023e) null, (C10828d.l) null, (C10828d.c) null, C15985a.a().addAll(h10.e().j()).add(C13026h.c(g.f98371a.a(aVar.g().g().f()))), (String) null, 383, (Object) null), (C15987c) null, (C15987c) null, false, 239, (Object) null);
    }

    private final C10828d c(o.a.e eVar) {
        C10828d h10 = B0.h(eVar.g().g(), this.f111402a.s(), false, false, false, false, 28, (Object) null);
        return C10828d.b(h10, (String) null, (String) null, (C10828d.b) null, (C15987c) null, C10828d.h.b(h10.e(), (C10828d.i) null, (C13023e) null, (String) null, (String) null, (C13023e) null, (C10828d.l) null, (C10828d.c) null, C15985a.a().addAll(h10.e().j()).add(C13026h.a(C12674m.f108302r0)), (String) null, 383, (Object) null), (C15987c) null, (C15987c) null, false, 239, (Object) null);
    }

    private final C10828d d(o.a.c cVar) {
        return B0.h(cVar.g().g(), this.f111402a.s(), false, false, false, false, 28, (Object) null);
    }

    public final C10828d a(o.a aVar) {
        C17542s.j(aVar, "item");
        if (aVar instanceof o.a.c) {
            return d((o.a.c) aVar);
        }
        if (aVar instanceof o.a.e) {
            return c((o.a.e) aVar);
        }
        if (aVar instanceof o.a.C2708a) {
            return b((o.a.C2708a) aVar);
        }
        throw new t();
    }
}
