package H0;

import A1.B;
import A1.C4349p;
import androidx.compose.ui.platform.w1;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LH0/d;", "", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/platform/w1;)V", "LA1/p;", "event", "LXH/N;", "d", "(LA1/p;)V", "LA1/B;", "prevClick", "newClick", "", "c", "(LA1/B;LA1/B;)Z", "b", "a", "Landroidx/compose/ui/platform/w1;", "", "I", "()I", "setClicks", "(I)V", "clicks", "LA1/B;", "getPrevClick", "()LA1/B;", "setPrevClick", "(LA1/B;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.d  reason: case insensitive filesystem */
final class C4526d {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f6934a;

    /* renamed from: b  reason: collision with root package name */
    private int f6935b;

    /* renamed from: c  reason: collision with root package name */
    private B f6936c;

    public C4526d(w1 w1Var) {
        this.f6934a = w1Var;
    }

    public final int a() {
        return this.f6935b;
    }

    public final boolean b(B b10, B b11) {
        return y.f(this.f6934a, b10, b11);
    }

    public final boolean c(B b10, B b11) {
        return b11.o() - b10.o() < this.f6934a.a();
    }

    public final void d(C4349p pVar) {
        B b10 = this.f6936c;
        B b11 = pVar.c().get(0);
        if (b10 == null || !c(b10, b11) || !b(b10, b11)) {
            this.f6935b = 1;
        } else {
            this.f6935b++;
        }
        this.f6936c = b11;
    }
}
