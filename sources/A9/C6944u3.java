package a9;

import android.app.Dialog;
import android.content.DialogInterface;
import com.contentsquare.android.sdk.c1;

/* renamed from: a9.u3  reason: case insensitive filesystem */
public final /* synthetic */ class C6944u3 implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c1 f42883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Dialog f42884b;

    public /* synthetic */ C6944u3(c1 c1Var, Dialog dialog) {
        this.f42883a = c1Var;
        this.f42884b = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        c1.g(this.f42883a, this.f42884b, dialogInterface);
    }
}
