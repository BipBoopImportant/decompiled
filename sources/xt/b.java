package Xt;

import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"LXt/b;", "", "", "storeName", "LKJ/c;", "LXt/a;", "events", "", "shouldShowViewAllCard", "<init>", "(Ljava/lang/String;LKJ/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LKJ/c;", "()LKJ/c;", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f89286d = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f89287a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<a> f89288b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f89289c;

    public b() {
        this((String) null, (C15987c) null, false, 7, (DefaultConstructorMarker) null);
    }

    public final C15987c<a> a() {
        return this.f89288b;
    }

    public final boolean b() {
        return this.f89289c;
    }

    public final String c() {
        return this.f89287a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f89287a, bVar.f89287a) && C17542s.e(this.f89288b, bVar.f89288b) && this.f89289c == bVar.f89289c;
    }

    public int hashCode() {
        return (((this.f89287a.hashCode() * 31) + this.f89288b.hashCode()) * 31) + Boolean.hashCode(this.f89289c);
    }

    public String toString() {
        String str = this.f89287a;
        C15987c<a> cVar = this.f89288b;
        boolean z10 = this.f89289c;
        return "StoreEventsUiState(storeName=" + str + ", events=" + cVar + ", shouldShowViewAllCard=" + z10 + ")";
    }

    public b(String str, C15987c<a> cVar, boolean z10) {
        C17542s.j(str, "storeName");
        C17542s.j(cVar, "events");
        this.f89287a = str;
        this.f89288b = cVar;
        this.f89289c = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, C15987c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? C15985a.a() : cVar, (i10 & 4) != 0 ? false : z10);
    }
}
