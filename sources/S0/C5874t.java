package s0;

import F1.d;
import F1.j;
import F1.k;
import F1.l;
import U0.C4899r0;
import U0.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038B@BX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Ls0/t;", "LF1/d;", "LF1/j;", "Ls0/T;", "<init>", "()V", "modifierLocalInsets", "a", "(Ls0/T;)Ls0/T;", "LF1/k;", "scope", "LXH/N;", "q", "(LF1/k;)V", "<set-?>", "d", "LU0/r0;", "b", "()Ls0/T;", "f", "(Ls0/T;)V", "consumedInsets", "LF1/l;", "getKey", "()LF1/l;", "key", "c", "value", "Ls0/F;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.t  reason: case insensitive filesystem */
abstract class C5874t implements d, j<C5848T> {

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f28839d;

    public /* synthetic */ C5874t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final C5848T b() {
        return (C5848T) this.f28839d.getValue();
    }

    private final void f(C5848T t10) {
        this.f28839d.setValue(t10);
    }

    public abstract C5848T a(C5848T t10);

    /* renamed from: c */
    public C5848T getValue() {
        return b();
    }

    public l<C5848T> getKey() {
        return C5851W.b();
    }

    public void q(k kVar) {
        f(a((C5848T) kVar.c(C5851W.b())));
    }

    private C5874t() {
        this.f28839d = u1.e(C5850V.a(0, 0, 0, 0), (o1) null, 2, (Object) null);
    }
}
