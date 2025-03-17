package Md;

import IC.C13023e;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LMd/b;", "LxB/a;", "", "discountApplied", "LIC/e;", "title", "description", "<init>", "(ZLIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "g", "", "d", "J", "f", "()J", "stableId", "coworker-discount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15201a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f61882e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f61883a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f61884b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f61885c;

    /* renamed from: d  reason: collision with root package name */
    private final long f61886d = ((long) Objects.hash(new Object[]{P.b(b.class)}));

    public b(boolean z10, C13023e eVar, C13023e eVar2) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "description");
        this.f61883a = z10;
        this.f61884b = eVar;
        this.f61885c = eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f61883a == bVar.f61883a && C17542s.e(this.f61884b, bVar.f61884b) && C17542s.e(this.f61885c, bVar.f61885c);
    }

    public long f() {
        return this.f61886d;
    }

    public final C13023e g() {
        return this.f61885c;
    }

    public final C13023e getTitle() {
        return this.f61884b;
    }

    public final boolean h() {
        return this.f61883a;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f61883a) * 31) + this.f61884b.hashCode()) * 31) + this.f61885c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f61883a;
        C13023e eVar = this.f61884b;
        C13023e eVar2 = this.f61885c;
        return "CoWorkerDiscountDelegateModel(discountApplied=" + z10 + ", title=" + eVar + ", description=" + eVar2 + ")";
    }
}
