package QJ;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"LQJ/n0;", "LQJ/A0;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "c", "()Z", "LQJ/Q0;", "()LQJ/Q0;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.n0  reason: case insensitive filesystem */
final class C16321n0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f137655a;

    public C16321n0(boolean z10) {
        this.f137655a = z10;
    }

    public Q0 a() {
        return null;
    }

    public boolean c() {
        return this.f137655a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
