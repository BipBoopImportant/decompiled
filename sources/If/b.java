package IF;

import android.content.DialogInterface;
import com.sugarcube.app.base.ui.selection.ChooseRoomFragment;

public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChooseRoomFragment f110963a;

    public /* synthetic */ b(ChooseRoomFragment chooseRoomFragment) {
        this.f110963a = chooseRoomFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ChooseRoomFragment.B0(this.f110963a, dialogInterface);
    }
}
