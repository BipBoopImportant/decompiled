package U0;

import dI.C17168i;
import j0.D;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LU0/f;", "applier", "LU0/r;", "parent", "LU0/q;", "a", "(LU0/f;LU0/r;)LU0/q;", "LU0/V0;", "b", "(LU0/f;LU0/r;)LU0/V0;", "T", "", "", "LXH/N;", "g", "(Ljava/util/List;II)V", "Lj0/D;", "f", "(Lj0/D;II)V", "", "Ljava/lang/Object;", "PendingApplyNoModifications", "LU0/C;", "LU0/t;", "LU0/C;", "getCompositionImplServiceKey", "()LU0/C;", "CompositionImplServiceKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.u  reason: case insensitive filesystem */
public final class C4904u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14168a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final C<C4902t> f14169b = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"U0/u$a", "LU0/C;", "LU0/t;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.u$a */
    public static final class a implements C<C4902t> {
        a() {
        }
    }

    public static final C4897q a(C4872f<?> fVar, r rVar) {
        return new C4902t(rVar, fVar, (C17168i) null, 4, (DefaultConstructorMarker) null);
    }

    public static final V0 b(C4872f<?> fVar, r rVar) {
        return new C4902t(rVar, fVar, (C17168i) null, 4, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final void f(D d10, int i10, int i11) {
        int a10 = d10.a(i10);
        d10.o(i10, d10.a(i11));
        d10.o(i11, a10);
    }

    /* access modifiers changed from: private */
    public static final <T> void g(List<T> list, int i10, int i11) {
        T t10 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t10);
    }
}
