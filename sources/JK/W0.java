package jK;

import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.T;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LjK/W0;", "Lkotlinx/serialization/KSerializer;", "", "LjK/O0;", "", "LjK/V0;", "<init>", "()V", "", "w", "([S)I", "z", "([S)LjK/V0;", "x", "()[S", "LiK/c;", "decoder", "index", "builder", "", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/V0;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[SI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W0 extends O0<Short, short[], V0> implements KSerializer<short[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final W0 f144072c = new W0();

    private W0() {
        super(C17294a.J(T.f144351a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void v(C17395d dVar, short[] sArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.D(getDescriptor(), i11, sArr[i11]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int f(short[] sArr) {
        C17542s.j(sArr, "<this>");
        return sArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public short[] s() {
        return new short[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, V0 v02, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(v02, "builder");
        v02.e(cVar.G(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public V0 l(short[] sArr) {
        C17542s.j(sArr, "<this>");
        return new V0(sArr);
    }
}
