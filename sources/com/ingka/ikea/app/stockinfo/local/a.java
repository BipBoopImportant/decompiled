package com.ingka.ikea.app.stockinfo.local;

import YH.C16877v;
import com.ingka.ikea.app.stockinfo.local.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/a;", "", "Lcom/ingka/ikea/app/stockinfo/local/b;", "productStock", "", "Lcom/ingka/ikea/app/stockinfo/local/b$a;", "childStock", "<init>", "(Lcom/ingka/ikea/app/stockinfo/local/b;Ljava/util/List;)V", "", "c", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/local/b;", "b", "()Lcom/ingka/ikea/app/stockinfo/local/b;", "Ljava/util/List;", "()Ljava/util/List;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f92541a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b.a> f92542b;

    public a() {
        this((b) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public final List<b.a> a() {
        return this.f92542b;
    }

    public final b b() {
        return this.f92541a;
    }

    public final boolean c() {
        return this.f92541a instanceof b.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f92541a, aVar.f92541a) && C17542s.e(this.f92542b, aVar.f92542b);
    }

    public int hashCode() {
        b bVar = this.f92541a;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f92542b.hashCode();
    }

    public String toString() {
        b bVar = this.f92541a;
        List<b.a> list = this.f92542b;
        return "StockHolder(productStock=" + bVar + ", childStock=" + list + ")";
    }

    public a(b bVar, List<b.a> list) {
        C17542s.j(list, "childStock");
        this.f92541a = bVar;
        this.f92542b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? C16877v.n() : list);
    }
}
