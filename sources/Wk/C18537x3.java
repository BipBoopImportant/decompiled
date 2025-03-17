package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LwK/x3;", "", "LwK/w3;", "first", "second", "<init>", "(LwK/w3;LwK/w3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/w3;", "()LwK/w3;", "b", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.x3  reason: case insensitive filesystem */
public final class C18537x3 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f151909c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C18525w3 f151910a;

    /* renamed from: b  reason: collision with root package name */
    private final C18525w3 f151911b;

    public C18537x3(C18525w3 w3Var, C18525w3 w3Var2) {
        C17542s.j(w3Var, "first");
        this.f151910a = w3Var;
        this.f151911b = w3Var2;
    }

    public final C18525w3 a() {
        return this.f151910a;
    }

    public final C18525w3 b() {
        return this.f151911b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18537x3)) {
            return false;
        }
        C18537x3 x3Var = (C18537x3) obj;
        return C17542s.e(this.f151910a, x3Var.f151910a) && C17542s.e(this.f151911b, x3Var.f151911b);
    }

    public int hashCode() {
        int hashCode = this.f151910a.hashCode() * 31;
        C18525w3 w3Var = this.f151911b;
        return hashCode + (w3Var == null ? 0 : w3Var.hashCode());
    }

    public String toString() {
        C18525w3 w3Var = this.f151910a;
        C18525w3 w3Var2 = this.f151911b;
        return "InlineMessageActions(first=" + w3Var + ", second=" + w3Var2 + ")";
    }
}
