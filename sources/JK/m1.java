package jK;

import XH.C16802I;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LjK/m1;", "LjK/M0;", "LXH/I;", "bufferWithData", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "LXH/H;", "c", "e", "(J)V", "f", "()[J", "a", "[J", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m1 extends M0<C16802I> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f144139a;

    /* renamed from: b  reason: collision with root package name */
    private int f144140b;

    public /* synthetic */ m1(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C16802I.b(f());
    }

    public void b(int i10) {
        if (C16802I.x(this.f144139a) < i10) {
            long[] jArr = this.f144139a;
            long[] copyOf = Arrays.copyOf(jArr, C17978n.e(i10, C16802I.x(jArr) * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144139a = C16802I.k(copyOf);
        }
    }

    public int d() {
        return this.f144140b;
    }

    public final void e(long j10) {
        M0.c(this, 0, 1, (Object) null);
        long[] jArr = this.f144139a;
        int d10 = d();
        this.f144140b = d10 + 1;
        C16802I.D(jArr, d10, j10);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f144139a, d());
        C17542s.i(copyOf, "copyOf(...)");
        return C16802I.k(copyOf);
    }

    private m1(long[] jArr) {
        C17542s.j(jArr, "bufferWithData");
        this.f144139a = jArr;
        this.f144140b = C16802I.x(jArr);
        b(10);
    }
}
