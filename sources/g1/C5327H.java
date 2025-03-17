package g1;

import U0.C4875g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lg1/H;", "Lg1/G;", "<init>", "()V", "Lg1/g;", "reader", "LXH/N;", "s", "(I)V", "", "d", "(I)Z", "LU0/g;", "a", "LU0/g;", "readerKind", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.H  reason: case insensitive filesystem */
public abstract class C5327H implements C5326G {

    /* renamed from: a  reason: collision with root package name */
    private final C4875g f23348a = new C4875g(0);

    public final boolean d(int i10) {
        return (i10 & C5338g.a(this.f23348a.get())) != 0;
    }

    public final void s(int i10) {
        int a10;
        do {
            a10 = C5338g.a(this.f23348a.get());
            if ((a10 & i10) == 0) {
            } else {
                return;
            }
        } while (!this.f23348a.compareAndSet(a10, C5338g.a(a10 | i10)));
    }
}
