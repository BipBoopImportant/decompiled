package uk;

import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Luk/B1;", "", "", "itemNo", "productName", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103434a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103435b;

    /* renamed from: c  reason: collision with root package name */
    private final Interaction$Component f103436c;

    public B1(String str, String str2, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productName");
        C17542s.j(interaction$Component, "component");
        this.f103434a = str;
        this.f103435b = str2;
        this.f103436c = interaction$Component;
    }

    public final Interaction$Component a() {
        return this.f103436c;
    }

    public final String b() {
        return this.f103434a;
    }

    public final String c() {
        return this.f103435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b12 = (B1) obj;
        return C17542s.e(this.f103434a, b12.f103434a) && C17542s.e(this.f103435b, b12.f103435b) && this.f103436c == b12.f103436c;
    }

    public int hashCode() {
        return (((this.f103434a.hashCode() * 31) + this.f103435b.hashCode()) * 31) + this.f103436c.hashCode();
    }

    public String toString() {
        String str = this.f103434a;
        String str2 = this.f103435b;
        Interaction$Component interaction$Component = this.f103436c;
        return "FavouriteData(itemNo=" + str + ", productName=" + str2 + ", component=" + interaction$Component + ")";
    }
}
