package QJ;

import WJ.C16747h;
import WJ.C16748i;
import WJ.C16750k;
import WJ.C16751l;
import XH.C16814e;
import dI.C17160a;
import dI.C17161b;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"LQJ/M;", "LdI/a;", "LdI/f;", "<init>", "()V", "LdI/i;", "context", "", "I0", "(LdI/i;)Z", "", "parallelism", "", "name", "N0", "(ILjava/lang/String;)LQJ/M;", "K0", "(I)LQJ/M;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "T", "LdI/e;", "continuation", "f0", "(LdI/e;)LdI/e;", "t", "(LdI/e;)V", "toString", "()Ljava/lang/String;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class M extends C17160a implements C17165f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137585a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LQJ/M$a;", "LdI/b;", "LdI/f;", "LQJ/M;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17161b<C17165f, M> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final M d(C17168i.b bVar) {
            if (bVar instanceof M) {
                return (M) bVar;
            }
            return null;
        }

        private a() {
            super(C17165f.f142966s0, new L());
        }
    }

    public M() {
        super(C17165f.f142966s0);
    }

    public static /* synthetic */ M O0(M m10, int i10, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return m10.N0(i10, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    public abstract void E0(C17168i iVar, Runnable runnable);

    public void F0(C17168i iVar, Runnable runnable) {
        C16748i.c(this, iVar, runnable);
    }

    public boolean I0(C17168i iVar) {
        return true;
    }

    @C16814e
    public /* synthetic */ M K0(int i10) {
        return N0(i10, (String) null);
    }

    public M N0(int i10, String str) {
        C16751l.a(i10);
        return new C16750k(this, i10, str);
    }

    public final <T> C17164e<T> f0(C17164e<? super T> eVar) {
        return new C16747h(this, eVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C17165f.a.a(this, cVar);
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17165f.a.b(this, cVar);
    }

    public final void t(C17164e<?> eVar) {
        C17542s.h(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C16747h) eVar).r();
    }

    public String toString() {
        return V.a(this) + '@' + V.b(this);
    }
}
