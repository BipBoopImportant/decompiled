package qv;

import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0016@RX\u000e¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqv/d;", "", "<init>", "()V", "", "Lqv/b;", "channelsToInstall", "LXH/N;", "b", "([Lqv/b;)V", "", "value", "Ljava/util/List;", "a", "()Ljava/util/List;", "channels", "logger-implementation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f102012a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static volatile List<? extends C11819b> f102013b = C16877v.n();

    private d() {
    }

    public List<C11819b> a() {
        return f102013b;
    }

    public void b(C11819b... bVarArr) {
        C17542s.j(bVarArr, "channelsToInstall");
        synchronized (a()) {
            if (f102012a.a().isEmpty()) {
                f102013b = C16870n.c1(bVarArr);
                C16807N n10 = C16807N.f139792a;
            } else {
                throw new IllegalStateException("install(...) has already been call");
            }
        }
    }
}
