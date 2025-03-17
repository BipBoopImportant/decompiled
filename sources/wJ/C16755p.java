package WJ;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0013j\b\u0012\u0004\u0012\u00028\u0000`\u00140\u00018\u0002X\u0004¨\u0006\u0016"}, d2 = {"LWJ/p;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "LXH/N;", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "LWJ/q;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.p  reason: case insensitive filesystem */
public class C16755p<E> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139570a = AtomicReferenceFieldUpdater.newUpdater(C16755p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C16755p(boolean z10) {
        this._cur$volatile = new C16756q(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater d10 = f139570a;
        while (true) {
            C16756q qVar = (C16756q) d10.get(this);
            int a10 = qVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f139570a, this, qVar, qVar.l());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater d10 = f139570a;
        while (true) {
            C16756q qVar = (C16756q) d10.get(this);
            if (!qVar.d()) {
                b.a(f139570a, this, qVar, qVar.l());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((C16756q) f139570a.get(this)).g();
    }

    public final E e() {
        AtomicReferenceFieldUpdater d10 = f139570a;
        while (true) {
            C16756q qVar = (C16756q) d10.get(this);
            E m10 = qVar.m();
            if (m10 != C16756q.f139574h) {
                return m10;
            }
            b.a(f139570a, this, qVar, qVar.l());
        }
    }
}
