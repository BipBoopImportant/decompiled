package jK;

import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.r;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LjK/W;", "Lkotlinx/serialization/KSerializer;", "", "LjK/O0;", "", "LjK/V;", "<init>", "()V", "w", "([I)I", "z", "([I)LjK/V;", "x", "()[I", "LiK/c;", "decoder", "index", "builder", "", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/V;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W extends O0<Integer, int[], V> implements KSerializer<int[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final W f144071c = new W();

    private W() {
        super(C17294a.H(r.f144386a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void v(C17395d dVar, int[] iArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.w(getDescriptor(), i11, iArr[i11]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int f(int[] iArr) {
        C17542s.j(iArr, "<this>");
        return iArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int[] s() {
        return new int[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, V v10, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(v10, "builder");
        v10.e(cVar.j(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public V l(int[] iArr) {
        C17542s.j(iArr, "<this>");
        return new V(iArr);
    }
}
