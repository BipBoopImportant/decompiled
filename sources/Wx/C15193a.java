package wx;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwx/a;", "", "", "text", "", "Lwx/c;", "values", "", "selected", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "getSelected", "()Z", "(Z)V", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wx.a  reason: case insensitive filesystem */
public final class C15193a {

    /* renamed from: a  reason: collision with root package name */
    private final String f131767a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f131768b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f131769c;

    public C15193a(String str, List<? extends c> list, boolean z10) {
        C17542s.j(str, "text");
        C17542s.j(list, "values");
        this.f131767a = str;
        this.f131768b = list;
        this.f131769c = z10;
    }

    public final String a() {
        return this.f131767a;
    }

    public final List<c> b() {
        return this.f131768b;
    }

    public final void c(boolean z10) {
        this.f131769c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15193a)) {
            return false;
        }
        C15193a aVar = (C15193a) obj;
        return C17542s.e(this.f131767a, aVar.f131767a) && C17542s.e(this.f131768b, aVar.f131768b) && this.f131769c == aVar.f131769c;
    }

    public int hashCode() {
        return (((this.f131767a.hashCode() * 31) + this.f131768b.hashCode()) * 31) + Boolean.hashCode(this.f131769c);
    }

    public String toString() {
        String str = this.f131767a;
        List<c> list = this.f131768b;
        boolean z10 = this.f131769c;
        return "FacetRepresentation(text=" + str + ", values=" + list + ", selected=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15193a(String str, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }
}
