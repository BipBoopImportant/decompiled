package Ut;

import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LUt/a;", "", "", "storeName", "LKJ/c;", "LXt/a;", "events", "", "loading", "<init>", "(Ljava/lang/String;LKJ/c;Z)V", "a", "(Ljava/lang/String;LKJ/c;Z)LUt/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "LKJ/c;", "c", "()LKJ/c;", "Z", "d", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final int f88442d = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f88443a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<Xt.a> f88444b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f88445c;

    public a() {
        this((String) null, (C15987c) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ a b(a aVar, String str, C15987c<Xt.a> cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f88443a;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f88444b;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f88445c;
        }
        return aVar.a(str, cVar, z10);
    }

    public final a a(String str, C15987c<Xt.a> cVar, boolean z10) {
        C17542s.j(cVar, "events");
        return new a(str, cVar, z10);
    }

    public final C15987c<Xt.a> c() {
        return this.f88444b;
    }

    public final boolean d() {
        return this.f88445c;
    }

    public final String e() {
        return this.f88443a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f88443a, aVar.f88443a) && C17542s.e(this.f88444b, aVar.f88444b) && this.f88445c == aVar.f88445c;
    }

    public int hashCode() {
        String str = this.f88443a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f88444b.hashCode()) * 31) + Boolean.hashCode(this.f88445c);
    }

    public String toString() {
        String str = this.f88443a;
        C15987c<Xt.a> cVar = this.f88444b;
        boolean z10 = this.f88445c;
        return "State(storeName=" + str + ", events=" + cVar + ", loading=" + z10 + ")";
    }

    public a(String str, C15987c<Xt.a> cVar, boolean z10) {
        C17542s.j(cVar, "events");
        this.f88443a = str;
        this.f88444b = cVar;
        this.f88445c = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, C15987c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? C15985a.a() : cVar, (i10 & 4) != 0 ? false : z10);
    }
}
