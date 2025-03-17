package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, d2 = {"LwK/l8;", "T", "", "key", "", "label", "", "enabled", "caption", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "d", "Z", "()Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.l8  reason: case insensitive filesystem */
public final class C18398l8<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f151193a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151194b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f151195c;

    /* renamed from: d  reason: collision with root package name */
    private final String f151196d;

    public C18398l8(T t10, String str, boolean z10, String str2) {
        C17542s.j(str, "label");
        this.f151193a = t10;
        this.f151194b = str;
        this.f151195c = z10;
        this.f151196d = str2;
    }

    public final String a() {
        return this.f151196d;
    }

    public final boolean b() {
        return this.f151195c;
    }

    public final T c() {
        return this.f151193a;
    }

    public final String d() {
        return this.f151194b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18398l8)) {
            return false;
        }
        C18398l8 l8Var = (C18398l8) obj;
        return C17542s.e(this.f151193a, l8Var.f151193a) && C17542s.e(this.f151194b, l8Var.f151194b) && this.f151195c == l8Var.f151195c && C17542s.e(this.f151196d, l8Var.f151196d);
    }

    public int hashCode() {
        T t10 = this.f151193a;
        int i10 = 0;
        int hashCode = (((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f151194b.hashCode()) * 31) + Boolean.hashCode(this.f151195c)) * 31;
        String str = this.f151196d;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        T t10 = this.f151193a;
        String str = this.f151194b;
        boolean z10 = this.f151195c;
        String str2 = this.f151196d;
        return "RadioGroupItem(key=" + t10 + ", label=" + str + ", enabled=" + z10 + ", caption=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18398l8(Object obj, String str, boolean z10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? null : str2);
    }
}
