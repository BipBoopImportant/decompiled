package K1;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import android.os.CancellationSignal;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQJ/Q;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "", "block", "LQJ/F0;", "c", "(LQJ/Q;Landroid/os/CancellationSignal;LnI/p;)LQJ/F0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CancellationSignal f8896c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f8896c = cancellationSignal;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f8896c.cancel();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final F0 c(Q q10, CancellationSignal cancellationSignal, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        F0 d10 = C16314k.d(q10, (C17168i) null, (T) null, pVar, 3, (Object) null);
        d10.s(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new e(d10));
        return d10;
    }

    /* access modifiers changed from: private */
    public static final void d(F0 f02) {
        F0.a.a(f02, (CancellationException) null, 1, (Object) null);
    }
}
