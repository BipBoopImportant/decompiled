package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C18525w3;
import wK.C18537x3;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"LSC/M0;", "", "LSC/L0;", "first", "second", "<init>", "(LSC/L0;LSC/L0;)V", "LwK/x3;", "a", "()LwK/x3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LSC/L0;", "getFirst", "()LSC/L0;", "b", "getSecond", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f115836c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final L0 f115837a;

    /* renamed from: b  reason: collision with root package name */
    private final L0 f115838b;

    public M0(L0 l02, L0 l03) {
        C17542s.j(l02, "first");
        this.f115837a = l02;
        this.f115838b = l03;
    }

    public final C18537x3 a() {
        C18525w3 a10 = this.f115837a.a();
        L0 l02 = this.f115838b;
        return new C18537x3(a10, l02 != null ? l02.a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        return C17542s.e(this.f115837a, m02.f115837a) && C17542s.e(this.f115838b, m02.f115838b);
    }

    public int hashCode() {
        int hashCode = this.f115837a.hashCode() * 31;
        L0 l02 = this.f115838b;
        return hashCode + (l02 == null ? 0 : l02.hashCode());
    }

    public String toString() {
        L0 l02 = this.f115837a;
        L0 l03 = this.f115838b;
        return "SkapaInlineMessageActions(first=" + l02 + ", second=" + l03 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M0(L0 l02, L0 l03, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l02, (i10 & 2) != 0 ? null : l03);
    }
}
