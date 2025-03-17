package nn;

import com.ingka.ikea.core.model.Link;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001f\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lnn/h;", "", "", "", "autocomplete", "Lnn/d;", "productCategories", "rooms", "Lnn/e;", "products", "bottomAutoComplete", "Lcom/ingka/ikea/core/model/Link;", "links", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "d", "c", "f", "e", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nn.h  reason: case insensitive filesystem */
public final class C11662h {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f99955a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11658d> f99956b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C11658d> f99957c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C11659e> f99958d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f99959e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Link> f99960f;

    public C11662h(List<String> list, List<C11658d> list2, List<C11658d> list3, List<C11659e> list4, List<String> list5, List<? extends Link> list6) {
        C17542s.j(list, "autocomplete");
        C17542s.j(list5, "bottomAutoComplete");
        C17542s.j(list6, "links");
        this.f99955a = list;
        this.f99956b = list2;
        this.f99957c = list3;
        this.f99958d = list4;
        this.f99959e = list5;
        this.f99960f = list6;
    }

    public final List<String> a() {
        return this.f99955a;
    }

    public final List<String> b() {
        return this.f99959e;
    }

    public final List<Link> c() {
        return this.f99960f;
    }

    public final List<C11658d> d() {
        return this.f99956b;
    }

    public final List<C11659e> e() {
        return this.f99958d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11662h)) {
            return false;
        }
        C11662h hVar = (C11662h) obj;
        return C17542s.e(this.f99955a, hVar.f99955a) && C17542s.e(this.f99956b, hVar.f99956b) && C17542s.e(this.f99957c, hVar.f99957c) && C17542s.e(this.f99958d, hVar.f99958d) && C17542s.e(this.f99959e, hVar.f99959e) && C17542s.e(this.f99960f, hVar.f99960f);
    }

    public final List<C11658d> f() {
        return this.f99957c;
    }

    public int hashCode() {
        int hashCode = this.f99955a.hashCode() * 31;
        List<C11658d> list = this.f99956b;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<C11658d> list2 = this.f99957c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<C11659e> list3 = this.f99958d;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((((hashCode3 + i10) * 31) + this.f99959e.hashCode()) * 31) + this.f99960f.hashCode();
    }

    public String toString() {
        List<String> list = this.f99955a;
        List<C11658d> list2 = this.f99956b;
        List<C11658d> list3 = this.f99957c;
        List<C11659e> list4 = this.f99958d;
        List<String> list5 = this.f99959e;
        List<Link> list6 = this.f99960f;
        return "SearchSuggestions(autocomplete=" + list + ", productCategories=" + list2 + ", rooms=" + list3 + ", products=" + list4 + ", bottomAutoComplete=" + list5 + ", links=" + list6 + ")";
    }
}
