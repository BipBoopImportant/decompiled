package jK;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LjK/g;", "LjK/M0;", "", "bufferWithData", "<init>", "([Z)V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "", "c", "e", "(Z)V", "f", "()[Z", "a", "[Z", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.g  reason: case insensitive filesystem */
public final class C17453g extends M0<boolean[]> {

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f144102a;

    /* renamed from: b  reason: collision with root package name */
    private int f144103b;

    public C17453g(boolean[] zArr) {
        C17542s.j(zArr, "bufferWithData");
        this.f144102a = zArr;
        this.f144103b = zArr.length;
        b(10);
    }

    public void b(int i10) {
        boolean[] zArr = this.f144102a;
        if (zArr.length < i10) {
            boolean[] copyOf = Arrays.copyOf(zArr, C17978n.e(i10, zArr.length * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144102a = copyOf;
        }
    }

    public int d() {
        return this.f144103b;
    }

    public final void e(boolean z10) {
        M0.c(this, 0, 1, (Object) null);
        boolean[] zArr = this.f144102a;
        int d10 = d();
        this.f144103b = d10 + 1;
        zArr[d10] = z10;
    }

    /* renamed from: f */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f144102a, d());
        C17542s.i(copyOf, "copyOf(...)");
        return copyOf;
    }
}
