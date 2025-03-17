package jK;

import XH.C16798E;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LjK/g1;", "LjK/M0;", "LXH/E;", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "LXH/D;", "c", "e", "(B)V", "f", "()[B", "a", "[B", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 extends M0<C16798E> {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f144106a;

    /* renamed from: b  reason: collision with root package name */
    private int f144107b;

    public /* synthetic */ g1(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C16798E.b(f());
    }

    public void b(int i10) {
        if (C16798E.x(this.f144106a) < i10) {
            byte[] bArr = this.f144106a;
            byte[] copyOf = Arrays.copyOf(bArr, C17978n.e(i10, C16798E.x(bArr) * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144106a = C16798E.k(copyOf);
        }
    }

    public int d() {
        return this.f144107b;
    }

    public final void e(byte b10) {
        M0.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f144106a;
        int d10 = d();
        this.f144107b = d10 + 1;
        C16798E.D(bArr, d10, b10);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f144106a, d());
        C17542s.i(copyOf, "copyOf(...)");
        return C16798E.k(copyOf);
    }

    private g1(byte[] bArr) {
        C17542s.j(bArr, "bufferWithData");
        this.f144106a = bArr;
        this.f144107b = C16798E.x(bArr);
        b(10);
    }
}
