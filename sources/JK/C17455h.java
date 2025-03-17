package jK;

import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17528d;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LjK/h;", "Lkotlinx/serialization/KSerializer;", "", "LjK/O0;", "", "LjK/g;", "<init>", "()V", "", "w", "([Z)I", "z", "([Z)LjK/g;", "x", "()[Z", "LiK/c;", "decoder", "index", "builder", "checkIndex", "LXH/N;", "y", "(LiK/c;ILjK/g;Z)V", "LiK/d;", "encoder", "content", "size", "A", "(LiK/d;[ZI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.h  reason: case insensitive filesystem */
public final class C17455h extends O0<Boolean, boolean[], C17453g> implements KSerializer<boolean[]> {

    /* renamed from: c  reason: collision with root package name */
    public static final C17455h f144108c = new C17455h();

    private C17455h() {
        super(C17294a.C(C17528d.f144372a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void v(C17395d dVar, boolean[] zArr, int i10) {
        C17542s.j(dVar, "encoder");
        C17542s.j(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11, zArr[i11]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int f(boolean[] zArr) {
        C17542s.j(zArr, "<this>");
        return zArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean[] s() {
        return new boolean[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void i(C17394c cVar, int i10, C17453g gVar, boolean z10) {
        C17542s.j(cVar, "decoder");
        C17542s.j(gVar, "builder");
        gVar.e(cVar.D(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C17453g l(boolean[] zArr) {
        C17542s.j(zArr, "<this>");
        return new C17453g(zArr);
    }
}
