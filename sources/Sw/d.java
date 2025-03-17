package sw;

import A4.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.I;
import x4.J;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsw/d;", "Lx4/I;", "LA4/b$b;", "LA4/b;", "dialogNavigator", "<init>", "(LA4/b;)V", "Lx4/J;", "provider", "(Lx4/J;)V", "l", "()LA4/b$b;", "c", "LA4/b;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@I.b("dialogComposable")
public final class d extends I<b.C0502b> {

    /* renamed from: c  reason: collision with root package name */
    private final b f29100c;

    public d(b bVar) {
        C17542s.j(bVar, "dialogNavigator");
        this.f29100c = bVar;
    }

    /* renamed from: l */
    public b.C0502b a() {
        return new b.C0502b(this.f29100c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(J j10) {
        this((b) j10.d(b.class));
        C17542s.j(j10, "provider");
    }
}
