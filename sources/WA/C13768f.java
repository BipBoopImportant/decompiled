package WA;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LWA/f;", "", "", "id", "name", "Ljava/time/Instant;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/time/Instant;", "()Ljava/time/Instant;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WA.f  reason: case insensitive filesystem */
public final class C13768f {

    /* renamed from: a  reason: collision with root package name */
    private final String f117479a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117480b;

    /* renamed from: c  reason: collision with root package name */
    private final Instant f117481c;

    public C13768f(String str, String str2, Instant instant) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(instant, "updatedAt");
        this.f117479a = str;
        this.f117480b = str2;
        this.f117481c = instant;
    }

    public final String a() {
        return this.f117479a;
    }

    public final String b() {
        return this.f117480b;
    }

    public final Instant c() {
        return this.f117481c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13768f)) {
            return false;
        }
        C13768f fVar = (C13768f) obj;
        return C17542s.e(this.f117479a, fVar.f117479a) && C17542s.e(this.f117480b, fVar.f117480b) && C17542s.e(this.f117481c, fVar.f117481c);
    }

    public int hashCode() {
        return (((this.f117479a.hashCode() * 31) + this.f117480b.hashCode()) * 31) + this.f117481c.hashCode();
    }

    public String toString() {
        String str = this.f117479a;
        String str2 = this.f117480b;
        Instant instant = this.f117481c;
        return "ShoppingListEntity(id=" + str + ", name=" + str2 + ", updatedAt=" + instant + ")";
    }
}
