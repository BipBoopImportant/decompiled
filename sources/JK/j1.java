package jK;

import XH.C16800G;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0010@RX\u000e¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LjK/j1;", "LjK/M0;", "LXH/G;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "LXH/F;", "c", "e", "f", "()[I", "a", "[I", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 extends M0<C16800G> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f144121a;

    /* renamed from: b  reason: collision with root package name */
    private int f144122b;

    public /* synthetic */ j1(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C16800G.b(f());
    }

    public void b(int i10) {
        if (C16800G.x(this.f144121a) < i10) {
            int[] iArr = this.f144121a;
            int[] copyOf = Arrays.copyOf(iArr, C17978n.e(i10, C16800G.x(iArr) * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144121a = C16800G.k(copyOf);
        }
    }

    public int d() {
        return this.f144122b;
    }

    public final void e(int i10) {
        M0.c(this, 0, 1, (Object) null);
        int[] iArr = this.f144121a;
        int d10 = d();
        this.f144122b = d10 + 1;
        C16800G.D(iArr, d10, i10);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f144121a, d());
        C17542s.i(copyOf, "copyOf(...)");
        return C16800G.k(copyOf);
    }

    private j1(int[] iArr) {
        C17542s.j(iArr, "bufferWithData");
        this.f144121a = iArr;
        this.f144122b = C16800G.x(iArr);
        b(10);
    }
}
