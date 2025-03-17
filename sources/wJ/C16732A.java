package WJ;

import QJ.T0;
import WJ.C16732A;
import com.google.ar.core.ImageMetadata;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0004¨\u0006\""}, d2 = {"LWJ/A;", "S", "LWJ/b;", "LQJ/T0;", "", "id", "prev", "", "pointers", "<init>", "(JLWJ/A;I)V", "", "u", "()Z", "p", "index", "", "cause", "LdI/i;", "context", "LXH/N;", "s", "(ILjava/lang/Throwable;LdI/i;)V", "t", "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.A  reason: case insensitive filesystem */
public abstract class C16732A<S extends C16732A<S>> extends C16741b<S> implements T0 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f139523d = AtomicIntegerFieldUpdater.newUpdater(C16732A.class, "cleanedAndPointers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final long f139524c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public C16732A(long j10, S s10, int i10) {
        super(s10);
        this.f139524c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    public boolean k() {
        return f139523d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f139523d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, C17168i iVar);

    public final void t() {
        if (f139523d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater q10 = f139523d;
        do {
            i10 = q10.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!q10.compareAndSet(this, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i10));
        return true;
    }
}
