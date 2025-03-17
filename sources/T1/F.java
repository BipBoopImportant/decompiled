package T1;

import XH.C16807N;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LT1/F;", "LT1/C;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "LT1/z;", "LXH/N;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;LnI/l;)V", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class F extends C {
    public F(InputConnection inputConnection, C17642l<? super C4856z, C16807N> lVar) {
        super(inputConnection, lVar);
    }

    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection c10 = c();
        if (c10 != null) {
            c10.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
