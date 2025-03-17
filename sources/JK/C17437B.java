package jK;

import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17535k;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LjK/B;", "Lkotlinx/serialization/KSerializer;", "", "LjK/O0;", "", "LjK/A;", "<init>", "()V", "", "w", "([D)I", "z", "([D)LjK/A;", "x", "()[D", "LiK/c;", "decoder", "index", "builder", "", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/A;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[DI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.B  reason: case insensitive filesystem */
public final class C17437B extends O0<Double, double[], C17436A> implements KSerializer<double[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final C17437B f144009c = new C17437B();

    private C17437B() {
        super(C17294a.F(C17535k.f144384a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void v(C17395d dVar, double[] dArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.E(getDescriptor(), i11, dArr[i11]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int f(double[] dArr) {
        C17542s.j(dArr, "<this>");
        return dArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public double[] s() {
        return new double[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, C17436A a10, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(a10, "builder");
        a10.e(cVar.H(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C17436A l(double[] dArr) {
        C17542s.j(dArr, "<this>");
        return new C17436A(dArr);
    }
}
