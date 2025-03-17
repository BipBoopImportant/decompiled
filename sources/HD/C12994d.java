package HD;

import GD.C12928a;
import GD.C12929b;
import GD.C12930c;
import GD.C12931d;
import GD.k;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import Qq.g;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LHD/d;", "LHD/c;", "<init>", "()V", "LQq/g$b;", "reward", "LGD/k$c$a$a;", "e", "(LQq/g$b;)LGD/k$c$a$a;", "LGD/b;", "c", "(LQq/g$b;)LGD/b;", "LGD/d;", "d", "(LQq/g$b;)LGD/d;", "LKJ/c;", "LGD/c;", "b", "(LQq/g$b;)LKJ/c;", "LGD/k$c;", "a", "(LQq/g$b;)LGD/k$c;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HD.d  reason: case insensitive filesystem */
public final class C12994d implements C12993c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110681a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C12931d f110682b = new C12931d(C13026h.a(b.f84540W2), C13026h.a(b.f84510T2));

    /* renamed from: c  reason: collision with root package name */
    private static final C12931d f110683c = new C12931d(C13026h.a(b.f84530V2), C13026h.a(b.f84510T2));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHD/d$a;", "", "<init>", "()V", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HD.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C15987c<C12930c> b(g.b bVar) {
        g.b bVar2 = bVar;
        List c10 = C16877v.c();
        if (bVar2 instanceof g.b.d) {
            c10.add(new C12930c(C13026h.a(b.f84500S2), ((g.b.d) bVar2).d(), (String) null, true, 4, (DefaultConstructorMarker) null));
        }
        if (bVar2 instanceof g.b.e) {
            c10.add(new C12930c(C13026h.a(b.f84500S2), ((g.b.e) bVar2).c(), (String) null, true, 4, (DefaultConstructorMarker) null));
        }
        c10.add(new C12930c(C13026h.a(b.f84430L2), bVar.e().a(), (String) null, false, 12, (DefaultConstructorMarker) null));
        c10.add(new C12930c(C13026h.c(bVar.a().c()), bVar.a().a(), (String) null, false, 12, (DefaultConstructorMarker) null));
        return C15985a.l(C16877v.a(c10));
    }

    private final C12929b c(g.b bVar) {
        C13023e eVar;
        if ((bVar instanceof g.b.a) || (bVar instanceof g.b.C1770b)) {
            eVar = C13026h.a(b.f84520U2);
        } else if (bVar instanceof g.b.c) {
            eVar = C13026h.a(b.f84550X2);
        } else {
            throw new t();
        }
        return new C12929b(eVar, C13026h.c(bVar.getTitle()), C13026h.c(bVar.e().a()));
    }

    private final C12931d d(g.b bVar) {
        if (bVar instanceof g.b.a) {
            return null;
        }
        if (bVar instanceof g.b.c) {
            return f110682b;
        }
        if (bVar instanceof g.b.C1770b) {
            return f110683c;
        }
        throw new t();
    }

    private final k.c.a.C2652a e(g.b bVar) {
        return bVar instanceof g.b.d ? new k.c.a.C2652a.C2653a(((g.b.d) bVar).d()) : k.c.a.C2652a.b.f110441a;
    }

    public k.c a(g.b bVar) {
        C17542s.j(bVar, "reward");
        return new k.c.a(bVar.getId(), c(bVar), new C12928a(bVar.k(), (Image) null, 2, (DefaultConstructorMarker) null), e(bVar), b(bVar), d(bVar));
    }
}
