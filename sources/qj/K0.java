package QJ;

import WJ.C16754o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LQJ/K0;", "LWJ/o;", "LQJ/k0;", "LQJ/A0;", "<init>", "()V", "LXH/N;", "b", "", "toString", "()Ljava/lang/String;", "", "cause", "x", "(Ljava/lang/Throwable;)V", "LQJ/L0;", "d", "LQJ/L0;", "v", "()LQJ/L0;", "y", "(LQJ/L0;)V", "job", "", "w", "()Z", "onCancelling", "c", "isActive", "LQJ/Q0;", "a", "()LQJ/Q0;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class K0 extends C16754o implements C16315k0, A0 {

    /* renamed from: d  reason: collision with root package name */
    public L0 f137568d;

    public Q0 a() {
        return null;
    }

    public void b() {
        v().P0(this);
    }

    public boolean c() {
        return true;
    }

    public String toString() {
        return V.a(this) + '@' + V.b(this) + "[job@" + V.b(v()) + ']';
    }

    public final L0 v() {
        L0 l02 = this.f137568d;
        if (l02 != null) {
            return l02;
        }
        C17542s.z("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(Throwable th2);

    public final void y(L0 l02) {
        this.f137568d = l02;
    }
}
