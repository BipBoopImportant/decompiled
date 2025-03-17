package T1;

import XH.C16807N;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LT1/C;", "LT1/B;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "LT1/z;", "LXH/N;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;LnI/l;)V", "Landroid/view/inputmethod/InputContentInfo;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class C extends B {
    public C(InputConnection inputConnection, C17642l<? super C4856z, C16807N> lVar) {
        super(inputConnection, lVar);
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection c10 = c();
        if (c10 != null) {
            return c10.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
