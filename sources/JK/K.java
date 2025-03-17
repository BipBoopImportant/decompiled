package jK;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LjK/K;", "LjK/M0;", "", "bufferWithData", "<init>", "([F)V", "", "requiredCapacity", "LXH/N;", "b", "(I)V", "", "c", "e", "(F)V", "f", "()[F", "a", "[F", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class K extends M0<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private float[] f144047a;

    /* renamed from: b  reason: collision with root package name */
    private int f144048b;

    public K(float[] fArr) {
        C17542s.j(fArr, "bufferWithData");
        this.f144047a = fArr;
        this.f144048b = fArr.length;
        b(10);
    }

    public void b(int i10) {
        float[] fArr = this.f144047a;
        if (fArr.length < i10) {
            float[] copyOf = Arrays.copyOf(fArr, C17978n.e(i10, fArr.length * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144047a = copyOf;
        }
    }

    public int d() {
        return this.f144048b;
    }

    public final void e(float f10) {
        M0.c(this, 0, 1, (Object) null);
        float[] fArr = this.f144047a;
        int d10 = d();
        this.f144048b = d10 + 1;
        fArr[d10] = f10;
    }

    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f144047a, d());
        C17542s.i(copyOf, "copyOf(...)");
        return copyOf;
    }
}
