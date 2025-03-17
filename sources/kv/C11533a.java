package kv;

import KJ.C15987c;
import hv.C11387c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lkv/a;", "", "Lhv/c;", "highlightedShow", "LKJ/c;", "upcomingShows", "pastShows", "", "categories", "selectedCategories", "<init>", "(Lhv/c;LKJ/c;LKJ/c;LKJ/c;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhv/c;", "b", "()Lhv/c;", "LKJ/c;", "e", "()LKJ/c;", "c", "d", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kv.a  reason: case insensitive filesystem */
public final class C11533a {

    /* renamed from: a  reason: collision with root package name */
    private final C11387c f99179a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<C11387c> f99180b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<C11387c> f99181c;

    /* renamed from: d  reason: collision with root package name */
    private final C15987c<String> f99182d;

    /* renamed from: e  reason: collision with root package name */
    private final C15987c<String> f99183e;

    public C11533a(C11387c cVar, C15987c<C11387c> cVar2, C15987c<C11387c> cVar3, C15987c<String> cVar4, C15987c<String> cVar5) {
        C17542s.j(cVar, "highlightedShow");
        C17542s.j(cVar2, "upcomingShows");
        C17542s.j(cVar3, "pastShows");
        C17542s.j(cVar4, "categories");
        C17542s.j(cVar5, "selectedCategories");
        this.f99179a = cVar;
        this.f99180b = cVar2;
        this.f99181c = cVar3;
        this.f99182d = cVar4;
        this.f99183e = cVar5;
    }

    public final C15987c<String> a() {
        return this.f99182d;
    }

    public final C11387c b() {
        return this.f99179a;
    }

    public final C15987c<C11387c> c() {
        return this.f99181c;
    }

    public final C15987c<String> d() {
        return this.f99183e;
    }

    public final C15987c<C11387c> e() {
        return this.f99180b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11533a)) {
            return false;
        }
        C11533a aVar = (C11533a) obj;
        return C17542s.e(this.f99179a, aVar.f99179a) && C17542s.e(this.f99180b, aVar.f99180b) && C17542s.e(this.f99181c, aVar.f99181c) && C17542s.e(this.f99182d, aVar.f99182d) && C17542s.e(this.f99183e, aVar.f99183e);
    }

    public int hashCode() {
        return (((((((this.f99179a.hashCode() * 31) + this.f99180b.hashCode()) * 31) + this.f99181c.hashCode()) * 31) + this.f99182d.hashCode()) * 31) + this.f99183e.hashCode();
    }

    public String toString() {
        C11387c cVar = this.f99179a;
        C15987c<C11387c> cVar2 = this.f99180b;
        C15987c<C11387c> cVar3 = this.f99181c;
        C15987c<String> cVar4 = this.f99182d;
        C15987c<String> cVar5 = this.f99183e;
        return "LiveShoppingUiModel(highlightedShow=" + cVar + ", upcomingShows=" + cVar2 + ", pastShows=" + cVar3 + ", categories=" + cVar4 + ", selectedCategories=" + cVar5 + ")";
    }
}
