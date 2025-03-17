package WJ;

import WJ.P;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR$\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b8F@BX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010'\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010(\u001a\u00020\u00048\u0002X\u0004¨\u0006)"}, d2 = {"LWJ/O;", "LWJ/P;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "LXH/N;", "m", "(I)V", "l", "", "g", "()[LWJ/P;", "j", "n", "(II)V", "f", "()LWJ/P;", "node", "", "h", "(LWJ/P;)Z", "b", "index", "(I)LWJ/P;", "a", "(LWJ/P;)V", "[LWJ/P;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class O<T extends P & Comparable<? super T>> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f139538b = AtomicIntegerFieldUpdater.newUpdater(O.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    private T[] f139539a;

    private final T[] g() {
        T[] tArr = this.f139539a;
        if (tArr == null) {
            T[] tArr2 = new P[4];
            this.f139539a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            C17542s.i(copyOf, "copyOf(...)");
            T[] tArr3 = (P[]) copyOf;
            this.f139539a = tArr3;
            return tArr3;
        }
    }

    private final void k(int i10) {
        f139538b.set(this, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto L_0x000b
            return
        L_0x000b:
            T[] r2 = r5.f139539a
            kotlin.jvm.internal.C17542s.g(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L_0x002b
            r3 = r2[r0]
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.C17542s.g(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r1 = r2[r6]
            kotlin.jvm.internal.C17542s.g(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.C17542s.g(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L_0x003f
            return
        L_0x003f:
            r5.n(r6, r0)
            r6 = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: WJ.O.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f139539a;
            C17542s.g(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C17542s.g(t10);
            T t11 = tArr[i10];
            C17542s.g(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                n(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    private final void n(int i10, int i11) {
        T[] tArr = this.f139539a;
        C17542s.g(tArr);
        T t10 = tArr[i11];
        C17542s.g(t10);
        T t11 = tArr[i10];
        C17542s.g(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.a(this);
        P[] g10 = g();
        int c10 = c();
        k(c10 + 1);
        g10[c10] = t10;
        t10.setIndex(c10);
        m(c10);
    }

    public final T b() {
        T[] tArr = this.f139539a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f139538b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final T f() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean h(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.m() == null) {
                z10 = false;
            } else {
                i(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T i(int i10) {
        T[] tArr = this.f139539a;
        C17542s.g(tArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                C17542s.g(t10);
                T t11 = tArr[i11];
                C17542s.g(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    n(i10, i11);
                    m(i11);
                }
            }
            l(i10);
        }
        T t12 = tArr[c()];
        C17542s.g(t12);
        t12.a((O<?>) null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T j() {
        T i10;
        synchronized (this) {
            i10 = c() > 0 ? i(0) : null;
        }
        return i10;
    }
}
