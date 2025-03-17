package pk;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpk/e;", "", "", "itemNo", "itemName", "", "inFavourites", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C11724c {

    /* renamed from: a  reason: collision with root package name */
    private final String f100947a;

    /* renamed from: b  reason: collision with root package name */
    private final String f100948b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f100949c;

    public e(String str, String str2, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemName");
        this.f100947a = str;
        this.f100948b = str2;
        this.f100949c = z10;
    }

    public final boolean a() {
        return this.f100949c;
    }

    public final String b() {
        return this.f100948b;
    }

    public final String c() {
        return this.f100947a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f100947a, eVar.f100947a) && C17542s.e(this.f100948b, eVar.f100948b) && this.f100949c == eVar.f100949c;
    }

    public int hashCode() {
        return (((this.f100947a.hashCode() * 31) + this.f100948b.hashCode()) * 31) + Boolean.hashCode(this.f100949c);
    }

    public String toString() {
        String str = this.f100947a;
        String str2 = this.f100948b;
        boolean z10 = this.f100949c;
        return "Requested(itemNo=" + str + ", itemName=" + str2 + ", inFavourites=" + z10 + ")";
    }
}
