package vy;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sy.C15053a;
import sy.b;
import sy.e;
import uy.d;
import wy.l;
import xy.f;
import yy.q;
import zy.j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvy/g;", "Lvy/f;", "Luy/d;", "roomInternalNavigation", "Lxy/f;", "assistanceCardsSlotFactory", "Lzy/j;", "uniqueSellingPointsSlotFactory", "Lyy/q;", "productListingsSlotFactory", "<init>", "(Luy/d;Lxy/f;Lzy/j;Lyy/q;)V", "Lsy/d;", "T", "slotModel", "Lwy/l;", "a", "(Lsy/d;)Lwy/l;", "Luy/d;", "b", "Lxy/f;", "c", "Lzy/j;", "d", "Lyy/q;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f131573a;

    /* renamed from: b  reason: collision with root package name */
    private final f f131574b;

    /* renamed from: c  reason: collision with root package name */
    private final j f131575c;

    /* renamed from: d  reason: collision with root package name */
    private final q f131576d;

    public g(d dVar, f fVar, j jVar, q qVar) {
        C17542s.j(dVar, "roomInternalNavigation");
        C17542s.j(fVar, "assistanceCardsSlotFactory");
        C17542s.j(jVar, "uniqueSellingPointsSlotFactory");
        C17542s.j(qVar, "productListingsSlotFactory");
        this.f131573a = dVar;
        this.f131574b = fVar;
        this.f131575c = jVar;
        this.f131576d = qVar;
    }

    public <T extends sy.d> l a(T t10) {
        C17542s.j(t10, "slotModel");
        if (t10 instanceof C15053a) {
            return this.f131574b.c((C15053a) t10, this.f131573a);
        }
        if (t10 instanceof e) {
            return this.f131575c.a((e) t10, this.f131573a);
        }
        if (t10 instanceof b) {
            return this.f131576d.b((b) t10, this.f131573a);
        }
        return null;
    }
}
