package v0;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import m0.C5550k;
import m0.C5554m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv0/f;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Lm0/k;", "", "Lm0/m;", "previousAnimation", "<init>", "(ILm0/k;)V", "a", "I", "()I", "b", "Lm0/k;", "()Lm0/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.f  reason: case insensitive filesystem */
final class C6140f extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    private final int f30861a;

    /* renamed from: b  reason: collision with root package name */
    private final C5550k<Float, C5554m> f30862b;

    public C6140f(int i10, C5550k<Float, C5554m> kVar) {
        this.f30861a = i10;
        this.f30862b = kVar;
    }

    public final int a() {
        return this.f30861a;
    }

    public final C5550k<Float, C5554m> b() {
        return this.f30862b;
    }
}
