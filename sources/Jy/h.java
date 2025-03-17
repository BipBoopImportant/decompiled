package Jy;

import Il.a;
import Jy.o;
import Op.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LJy/h;", "", "LIl/a;", "appConfigApi", "LJy/c;", "fabDetailsUiMapper", "LJy/e;", "itemQuantityUiMapper", "LJy/f;", "productItemUiMapper", "LJy/d;", "itemLocationUiMapper", "<init>", "(LIl/a;LJy/c;LJy/e;LJy/f;LJy/d;)V", "LJy/o$a;", "cartItem", "LJy/i;", "a", "(LJy/o$a;)LJy/i;", "LIl/a;", "b", "LJy/c;", "c", "LJy/e;", "d", "LJy/f;", "e", "LJy/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f111407a;

    /* renamed from: b  reason: collision with root package name */
    private final c f111408b;

    /* renamed from: c  reason: collision with root package name */
    private final e f111409c;

    /* renamed from: d  reason: collision with root package name */
    private final f f111410d;

    /* renamed from: e  reason: collision with root package name */
    private final d f111411e;

    public h(a aVar, c cVar, e eVar, f fVar, d dVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(cVar, "fabDetailsUiMapper");
        C17542s.j(eVar, "itemQuantityUiMapper");
        C17542s.j(fVar, "productItemUiMapper");
        C17542s.j(dVar, "itemLocationUiMapper");
        this.f111407a = aVar;
        this.f111408b = cVar;
        this.f111409c = eVar;
        this.f111410d = fVar;
        this.f111411e = dVar;
    }

    public final i a(o.a aVar) {
        C17542s.j(aVar, "cartItem");
        return new i(aVar.g().a(), new a1(this.f111408b.c(aVar), this.f111410d.a(aVar), this.f111407a.s(), this.f111409c.a(aVar), true, true, this.f111407a.w()), this.f111411e.a(aVar, aVar.g().c()));
    }
}
