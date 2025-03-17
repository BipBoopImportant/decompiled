package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"LSC/i2;", "T", "", "key", "", "label", "", "enabled", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Ljava/lang/String;", "c", "Z", "()Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.i2  reason: case insensitive filesystem */
public final class C13598i2<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f116299d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final T f116300a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116301b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f116302c;

    public C13598i2(T t10, String str, boolean z10) {
        C17542s.j(str, "label");
        this.f116300a = t10;
        this.f116301b = str;
        this.f116302c = z10;
    }

    public final boolean a() {
        return this.f116302c;
    }

    public final T b() {
        return this.f116300a;
    }

    public final String c() {
        return this.f116301b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13598i2)) {
            return false;
        }
        C13598i2 i2Var = (C13598i2) obj;
        return C17542s.e(this.f116300a, i2Var.f116300a) && C17542s.e(this.f116301b, i2Var.f116301b) && this.f116302c == i2Var.f116302c;
    }

    public int hashCode() {
        T t10 = this.f116300a;
        return ((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f116301b.hashCode()) * 31) + Boolean.hashCode(this.f116302c);
    }

    public String toString() {
        T t10 = this.f116300a;
        String str = this.f116301b;
        boolean z10 = this.f116302c;
        return "SkapaRadioGroupItem(key=" + t10 + ", label=" + str + ", enabled=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13598i2(Object obj, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i10 & 4) != 0 ? true : z10);
    }
}
