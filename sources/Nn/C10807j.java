package Nn;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"LNn/j;", "", "", "checkoutId", "LNn/C;", "paymentHolder", "LNn/H;", "pspSession", "", "LNn/g;", "itemDetails", "<init>", "(Ljava/lang/String;LNn/C;LNn/H;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LNn/C;", "c", "()LNn/C;", "LNn/H;", "d", "()LNn/H;", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.j  reason: case insensitive filesystem */
public final class C10807j {

    /* renamed from: a  reason: collision with root package name */
    private final String f84089a;

    /* renamed from: b  reason: collision with root package name */
    private final C f84090b;

    /* renamed from: c  reason: collision with root package name */
    private final H f84091c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10804g> f84092d;

    public C10807j(String str, C c10, H h10, List<C10804g> list) {
        this.f84089a = str;
        this.f84090b = c10;
        this.f84091c = h10;
        this.f84092d = list;
    }

    public final String a() {
        return this.f84089a;
    }

    public final List<C10804g> b() {
        return this.f84092d;
    }

    public final C c() {
        return this.f84090b;
    }

    public final H d() {
        return this.f84091c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10807j)) {
            return false;
        }
        C10807j jVar = (C10807j) obj;
        return C17542s.e(this.f84089a, jVar.f84089a) && C17542s.e(this.f84090b, jVar.f84090b) && C17542s.e(this.f84091c, jVar.f84091c) && C17542s.e(this.f84092d, jVar.f84092d);
    }

    public int hashCode() {
        String str = this.f84089a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C c10 = this.f84090b;
        int hashCode2 = (hashCode + (c10 == null ? 0 : c10.hashCode())) * 31;
        H h10 = this.f84091c;
        int hashCode3 = (hashCode2 + (h10 == null ? 0 : h10.hashCode())) * 31;
        List<C10804g> list = this.f84092d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f84089a;
        C c10 = this.f84090b;
        H h10 = this.f84091c;
        List<C10804g> list = this.f84092d;
        return "CheckoutState(checkoutId=" + str + ", paymentHolder=" + c10 + ", pspSession=" + h10 + ", itemDetails=" + list + ")";
    }
}
