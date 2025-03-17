package jK;

import XH.C16797D;
import XH.C16798E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LjK/h1;", "Lkotlinx/serialization/KSerializer;", "LXH/E;", "LjK/O0;", "LXH/D;", "LjK/g1;", "<init>", "()V", "", "w", "([B)I", "z", "([B)LjK/g1;", "x", "()[B", "LiK/c;", "decoder", "index", "builder", "", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/g1;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 extends O0<C16797D, C16798E, g1> implements KSerializer<C16798E> {

    /* renamed from: c  reason: collision with root package name */
    public static final h1 f144110c = new h1();

    private h1() {
        super(C17294a.x(C16797D.f139771b));
    }

    /* access modifiers changed from: protected */
    public void A(C17395d dVar, byte[] bArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.e(getDescriptor(), i11).g(C16798E.t(bArr, i11));
        }
    }

    public /* bridge */ /* synthetic */ int f(Object obj) {
        return w(((C16798E) obj).F());
    }

    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return z(((C16798E) obj).F());
    }

    public /* bridge */ /* synthetic */ Object s() {
        return C16798E.b(x());
    }

    public /* bridge */ /* synthetic */ void v(C17395d dVar, Object obj, int i10) {
        A(dVar, ((C16798E) obj).F(), i10);
    }

    /* access modifiers changed from: protected */
    public int w(byte[] bArr) {
        C17542s.j(bArr, "$this$collectionSize");
        return C16798E.x(bArr);
    }

    /* access modifiers changed from: protected */
    public byte[] x() {
        return C16798E.i(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, g1 g1Var, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(g1Var, "builder");
        g1Var.e(C16797D.b(cVar.s(getDescriptor(), i10).I()));
    }

    /* access modifiers changed from: protected */
    public g1 z(byte[] bArr) {
        C17542s.j(bArr, "$this$toBuilder");
        return new g1(bArr, (DefaultConstructorMarker) null);
    }
}
