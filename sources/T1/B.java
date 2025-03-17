package T1;

import XH.C16807N;
import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LT1/B;", "LT1/A;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "LT1/z;", "LXH/N;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;LnI/l;)V", "", "p0", "p1", "", "deleteSurroundingTextInCodePoints", "(II)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "b", "(Landroid/view/inputmethod/InputConnection;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class B extends A {
    public B(InputConnection inputConnection, C17642l<? super C4856z, C16807N> lVar) {
        super(inputConnection, lVar);
    }

    /* access modifiers changed from: protected */
    public final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    public final Handler getHandler() {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.getHandler();
        }
        return null;
    }
}
