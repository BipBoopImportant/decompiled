package T1;

import XH.C16807N;
import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "LT1/z;", "LXH/N;", "onConnectionClosed", "a", "(Landroid/view/inputmethod/InputConnection;LnI/l;)LT1/z;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class G {
    public static final C4856z a(InputConnection inputConnection, C17642l<? super C4856z, C16807N> lVar) {
        return Build.VERSION.SDK_INT >= 34 ? new F(inputConnection, lVar) : new C(inputConnection, lVar);
    }
}
