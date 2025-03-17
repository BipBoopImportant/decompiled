package com.sugarcube.decorate.v2.internal.ui.catalog.domain;

import KJ.C15987c;
import com.sugarcube.app.base.data.Result;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;
import rG.C17847a;
import rG.C17848b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\rJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H¦@¢\u0006\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "", "", "", "itemIds", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "execute", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LrG/b;", "items", "", "addItemsToCart", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CartUseCase {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "", "LKJ/c;", "LrG/a;", "items", "LlF/a;", "total", "<init>", "(LKJ/c;LlF/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "b", "LlF/a;", "()LlF/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<C17847a> f142543a;

        /* renamed from: b  reason: collision with root package name */
        private final C14768a f142544b;

        public a(C15987c<C17847a> cVar, C14768a aVar) {
            C17542s.j(cVar, "items");
            C17542s.j(aVar, "total");
            this.f142543a = cVar;
            this.f142544b = aVar;
        }

        public final C15987c<C17847a> a() {
            return this.f142543a;
        }

        public final C14768a b() {
            return this.f142544b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f142543a, aVar.f142543a) && C17542s.e(this.f142544b, aVar.f142544b);
        }

        public int hashCode() {
            return (this.f142543a.hashCode() * 31) + this.f142544b.hashCode();
        }

        public String toString() {
            C15987c<C17847a> cVar = this.f142543a;
            C14768a aVar = this.f142544b;
            return "CartItems(items=" + cVar + ", total=" + aVar + ")";
        }
    }

    Object addItemsToCart(List<C17848b> list, C17164e<? super Result<Boolean>> eVar);

    Object execute(List<Integer> list, C17164e<? super Result<a>> eVar);
}
