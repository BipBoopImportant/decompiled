package E0;

import B0.B;
import H0.Q;
import T1.C4840i;
import XH.C16807N;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w1;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LE0/c;", "", "<init>", "()V", "LB0/B;", "legacyTextFieldState", "LH0/Q;", "textFieldSelectionManager", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "Lkotlin/Function1;", "LT1/i;", "LXH/N;", "editCommandConsumer", "b", "(LB0/B;LH0/Q;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/w1;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;LnI/l;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "d", "(LB0/B;LH0/Q;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.c  reason: case insensitive filesystem */
final class C4445c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4445c f5701a = new C4445c();

    private C4445c() {
    }

    /* access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(B b10, Q q10, HandwritingGesture handwritingGesture, w1 w1Var, Executor executor, IntConsumer intConsumer, C17642l<? super C4840i, C16807N> lVar) {
        int l10 = b10 != null ? i0.f5704a.l(b10, handwritingGesture, q10, w1Var, lVar) : 3;
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new C4444b(intConsumer, l10));
            } else {
                intConsumer.accept(l10);
            }
        }
    }

    public final boolean d(B b10, Q q10, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (b10 != null) {
            return i0.f5704a.D(b10, previewableHandwritingGesture, q10, cancellationSignal);
        }
        return false;
    }
}
