package jK;

import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17529e;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LjK/k;", "Lkotlinx/serialization/KSerializer;", "", "LjK/O0;", "", "LjK/j;", "<init>", "()V", "", "w", "([B)I", "z", "([B)LjK/j;", "x", "()[B", "LiK/c;", "decoder", "index", "builder", "", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/j;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.k  reason: case insensitive filesystem */
public final class C17461k extends O0<Byte, byte[], C17459j> implements KSerializer<byte[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final C17461k f144123c = new C17461k();

    private C17461k() {
        super(C17294a.D(C17529e.f144373a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void v(C17395d dVar, byte[] bArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.p(getDescriptor(), i11, bArr[i11]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int f(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public byte[] s() {
        return new byte[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, C17459j jVar, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(jVar, "builder");
        jVar.e(cVar.C(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C17459j l(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        return new C17459j(bArr);
    }
}
