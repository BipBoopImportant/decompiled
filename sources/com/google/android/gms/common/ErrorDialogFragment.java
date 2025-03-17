package com.google.android.gms.common;

import K9.C6620s;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f47968a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnCancelListener f47969b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f47970c;

    public static ErrorDialogFragment a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) C6620s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f47968a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f47969b = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f47969b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f47968a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f47970c == null) {
            this.f47970c = new AlertDialog.Builder((Context) C6620s.l(getActivity())).create();
        }
        return this.f47970c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
