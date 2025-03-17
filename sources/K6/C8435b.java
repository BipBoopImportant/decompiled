package k6;

import QJ.F0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0001\u0003\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lk6/b;", "Lk6/r;", "LQJ/F0;", "job", "d", "(LQJ/F0;)LQJ/F0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQJ/F0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
/* renamed from: k6.b  reason: case insensitive filesystem */
public final class C8435b implements C8451r {

    /* renamed from: a  reason: collision with root package name */
    private final F0 f54150a;

    private /* synthetic */ C8435b(F0 f02) {
        this.f54150a = f02;
    }

    public static final /* synthetic */ C8435b c(F0 f02) {
        return new C8435b(f02);
    }

    public static F0 d(F0 f02) {
        return f02;
    }

    public static boolean e(F0 f02, Object obj) {
        return (obj instanceof C8435b) && C17542s.e(f02, ((C8435b) obj).h());
    }

    public static int f(F0 f02) {
        return f02.hashCode();
    }

    public static String g(F0 f02) {
        return "BaseRequestDelegate(job=" + f02 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f54150a, obj);
    }

    public final /* synthetic */ F0 h() {
        return this.f54150a;
    }

    public int hashCode() {
        return f(this.f54150a);
    }

    public String toString() {
        return g(this.f54150a);
    }
}
