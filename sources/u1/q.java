package u1;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import p1.C5712d0;
import p1.C5714e0;
import p1.C5747v0;
import p1.C5749w0;
import p1.W0;
import p1.k1;
import p1.l1;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lp1/v0;", "other", "", "e", "(JJ)Z", "Lp1/w0;", "f", "(Lp1/w0;)Z", "", "Lu1/h;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "EmptyPath", "Lp1/k1;", "b", "I", "()I", "DefaultStrokeLineCap", "Lp1/l1;", "c", "DefaultStrokeLineJoin", "Lp1/d0;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Lp1/W0;", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C6010h> f30027a = C16877v.n();

    /* renamed from: b  reason: collision with root package name */
    private static final int f30028b = k1.f27320b.a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f30029c = l1.f27327b.b();

    /* renamed from: d  reason: collision with root package name */
    private static final int f30030d = C5712d0.f27280a.z();

    /* renamed from: e  reason: collision with root package name */
    private static final long f30031e = C5747v0.f27350b.h();

    /* renamed from: f  reason: collision with root package name */
    private static final int f30032f = W0.f27257b.b();

    public static final int a() {
        return f30032f;
    }

    public static final int b() {
        return f30028b;
    }

    public static final int c() {
        return f30029c;
    }

    public static final List<C6010h> d() {
        return f30027a;
    }

    public static final boolean e(long j10, long j11) {
        return C5747v0.v(j10) == C5747v0.v(j11) && C5747v0.u(j10) == C5747v0.u(j11) && C5747v0.s(j10) == C5747v0.s(j11);
    }

    public static final boolean f(C5749w0 w0Var) {
        if (w0Var instanceof C5714e0) {
            C5714e0 e0Var = (C5714e0) w0Var;
            int b10 = e0Var.b();
            C5712d0.a aVar = C5712d0.f27280a;
            if (C5712d0.E(b10, aVar.z()) || C5712d0.E(e0Var.b(), aVar.B())) {
                return true;
            }
        } else if (w0Var == null) {
            return true;
        }
        return false;
    }
}
