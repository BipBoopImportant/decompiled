package gB;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LgB/e;", "", "", "id", "name", "Ljava/time/Instant;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/time/Instant;", "()Ljava/time/Instant;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.e  reason: case insensitive filesystem */
public final class C14503e {

    /* renamed from: a  reason: collision with root package name */
    private final String f127272a;

    /* renamed from: b  reason: collision with root package name */
    private final String f127273b;

    /* renamed from: c  reason: collision with root package name */
    private final Instant f127274c;

    public C14503e(String str, String str2, Instant instant) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(instant, "updatedAt");
        this.f127272a = str;
        this.f127273b = str2;
        this.f127274c = instant;
    }

    public final String a() {
        return this.f127272a;
    }

    public final String b() {
        return this.f127273b;
    }

    public final Instant c() {
        return this.f127274c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14503e)) {
            return false;
        }
        C14503e eVar = (C14503e) obj;
        return C17542s.e(this.f127272a, eVar.f127272a) && C17542s.e(this.f127273b, eVar.f127273b) && C17542s.e(this.f127274c, eVar.f127274c);
    }

    public int hashCode() {
        return (((this.f127272a.hashCode() * 31) + this.f127273b.hashCode()) * 31) + this.f127274c.hashCode();
    }

    public String toString() {
        String str = this.f127272a;
        String str2 = this.f127273b;
        Instant instant = this.f127274c;
        return "ShoppingList(id=" + str + ", name=" + str2 + ", updatedAt=" + instant + ")";
    }
}
