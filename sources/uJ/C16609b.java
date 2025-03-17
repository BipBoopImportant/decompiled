package UJ;

import TJ.C16519P;
import UJ.C16611d;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010%¨\u0006'"}, d2 = {"LUJ/b;", "LUJ/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "j", "()LUJ/d;", "", "size", "", "k", "(I)[LUJ/d;", "i", "slot", "LXH/N;", "l", "(LUJ/d;)V", "value", "a", "[LUJ/d;", "n", "()[LUJ/d;", "slots", "b", "I", "m", "()I", "nCollectors", "c", "nextIndex", "LUJ/B;", "d", "LUJ/B;", "_subscriptionCount", "LTJ/P;", "()LTJ/P;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.b  reason: case insensitive filesystem */
public abstract class C16609b<S extends C16611d<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public S[] f139091a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f139092b;

    /* renamed from: c  reason: collision with root package name */
    private int f139093c;

    /* renamed from: d  reason: collision with root package name */
    private C16606B f139094d;

    public final C16519P<Integer> b() {
        C16606B b10;
        synchronized (this) {
            b10 = this.f139094d;
            if (b10 == null) {
                b10 = new C16606B(this.f139092b);
                this.f139094d = b10;
            }
        }
        return b10;
    }

    /* access modifiers changed from: protected */
    public final S i() {
        S s10;
        C16606B b10;
        synchronized (this) {
            try {
                S[] sArr = this.f139091a;
                if (sArr == null) {
                    sArr = k(2);
                    this.f139091a = sArr;
                } else if (this.f139092b >= sArr.length) {
                    S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    C17542s.i(copyOf, "copyOf(...)");
                    this.f139091a = (C16611d[]) copyOf;
                    sArr = (C16611d[]) copyOf;
                }
                int i10 = this.f139093c;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = j();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    C17542s.h(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.a(this));
                this.f139093c = i10;
                this.f139092b++;
                b10 = this.f139094d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 != null) {
            b10.a0(1);
        }
        return s10;
    }

    /* access modifiers changed from: protected */
    public abstract S j();

    /* access modifiers changed from: protected */
    public abstract S[] k(int i10);

    /* access modifiers changed from: protected */
    public final void l(S s10) {
        C16606B b10;
        int i10;
        C17164e[] b11;
        synchronized (this) {
            try {
                int i11 = this.f139092b - 1;
                this.f139092b = i11;
                b10 = this.f139094d;
                if (i11 == 0) {
                    this.f139093c = 0;
                }
                C17542s.h(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b11 = s10.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C17164e eVar : b11) {
            if (eVar != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(C16807N.f139792a));
            }
        }
        if (b10 != null) {
            b10.a0(-1);
        }
    }

    /* access modifiers changed from: protected */
    public final int m() {
        return this.f139092b;
    }

    /* access modifiers changed from: protected */
    public final S[] n() {
        return this.f139091a;
    }
}
