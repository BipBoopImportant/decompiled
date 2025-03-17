package U0;

import XH.C16824o;
import XH.C16825p;
import android.os.Looper;
import android.util.Log;
import g1.C5352u;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000Z\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"!\u0010 \u001a\u00020\u001a8FX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\u0016\u0010\"*\f\b\u0000\u0010%\"\u00020$2\u00020$¨\u0006&"}, d2 = {"T", "value", "LU0/o1;", "policy", "Lg1/u;", "d", "(Ljava/lang/Object;LU0/o1;)Lg1/u;", "", "LU0/o0;", "b", "(I)LU0/o0;", "", "LU0/p0;", "c", "(J)LU0/p0;", "", "LU0/n0;", "a", "(F)LU0/n0;", "", "message", "", "e", "LXH/N;", "f", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "LU0/h0;", "LXH/o;", "getDefaultMonotonicFrameClock", "()LU0/h0;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "J", "()J", "MainThreadId", "", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.b  reason: case insensitive filesystem */
public final class C4860b {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f13906a = C16825p.b(a.f13908c);

    /* renamed from: b  reason: collision with root package name */
    private static final long f13907b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/h0;", "b", "()LU0/h0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.b$a */
    static final class a extends C17544u implements C17631a<C4879h0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f13908c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C4879h0 invoke() {
            return Looper.getMainLooper() != null ? G.f13747a : Z0.f13897a;
        }
    }

    static {
        long j10;
        try {
            j10 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j10 = -1;
        }
        f13907b = j10;
    }

    public static final C4892n0 a(float f10) {
        return new C4907v0(f10);
    }

    public static final C4894o0 b(int i10) {
        return new C4909w0(i10);
    }

    public static final C4896p0 c(long j10) {
        return new C4911x0(j10);
    }

    public static final <T> C5352u<T> d(T t10, o1<T> o1Var) {
        return new C4913y0(t10, o1Var);
    }

    public static final long e() {
        return f13907b;
    }

    public static final void f(String str, Throwable th2) {
        Log.e("ComposeInternal", str, th2);
    }
}
