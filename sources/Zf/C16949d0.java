package ZF;

import android.content.DialogInterface;
import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;

/* renamed from: ZF.d0  reason: case insensitive filesystem */
public final /* synthetic */ class C16949d0 implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateFragment f140640a;

    public /* synthetic */ C16949d0(DecorateFragment decorateFragment) {
        this.f140640a = decorateFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DecorateFragment.S4(this.f140640a, dialogInterface);
    }
}
