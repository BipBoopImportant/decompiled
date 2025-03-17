package Hf;

import Gf.c;
import N1.C4669d;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nn.C11659e;
import uK.C18146a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8\u0006¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\""}, d2 = {"LHf/V;", "", "<init>", "()V", "LGf/c$f;", "b", "LGf/c$f;", "getProductSample", "()LGf/c$f;", "productSample", "", "LGf/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "searchResultListSample", "LGf/c$i;", "d", "LGf/c$i;", "getTipSample", "()LGf/c$i;", "tipSample", "LGf/c$e;", "e", "LGf/c$e;", "getPopularSearchesSample", "()LGf/c$e;", "popularSearchesSample", "f", "a", "popularSearchesResultListSample", "LGf/c$g;", "g", "recentSearchesResultListSample", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public static final V f60860a = new V();

    /* renamed from: b  reason: collision with root package name */
    private static final c.f f60861b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<c> f60862c;

    /* renamed from: d  reason: collision with root package name */
    private static final c.i f60863d;

    /* renamed from: e  reason: collision with root package name */
    private static final c.e f60864e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<c> f60865f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<c.g> f60866g = C16877v.e(new c.g(C16877v.q("billy", "BILLY collection", "All Them Witches", "Greenleaf", "Kadavar", "The Sword", "Uncle Acid & The Deadbeats", "Witchcraft")));

    /* renamed from: h  reason: collision with root package name */
    public static final int f60867h = 8;

    static {
        c.f fVar = new c.f(new C11659e("BILLY", "https://www.ikea.com/us/en/images/products/billy-bookcase-white__0625599_pe692385_s5.jpg", "00263850", "ART", "Bookcase 31 1/2x11x79 1/2"));
        f60861b = fVar;
        c.h hVar = new c.h("billy", new C4669d("billy", (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        c.j jVar = c.j.CATEGORY;
        f60862c = C16877v.q(hVar, new c.a("billy-collection", "BILLY collection", jVar), fVar);
        c.i iVar = new c.i("Tip! Try searching for <b>dining chair</b>");
        f60863d = iVar;
        c.e eVar = new c.e(C16877v.q(new c.d.b("billy", c.j.TEXT), new c.d.a("BILLY collection", jVar, "billy-collection", C18146a.f148166Nb)));
        f60864e = eVar;
        f60865f = C16877v.q(iVar, eVar);
    }

    private V() {
    }

    public final List<c> a() {
        return f60865f;
    }

    public final List<c.g> b() {
        return f60866g;
    }

    public final List<c> c() {
        return f60862c;
    }
}
