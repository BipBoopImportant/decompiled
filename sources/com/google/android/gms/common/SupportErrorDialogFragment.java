package com.google.android.gms.common;

import K9.C6620s;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: D  reason: collision with root package name */
    private Dialog f47972D;

    /* renamed from: E  reason: collision with root package name */
    private DialogInterface.OnCancelListener f47973E;

    /* renamed from: F  reason: collision with root package name */
    private Dialog f47974F;

    public static SupportErrorDialogFragment q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C6620s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f47972D = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f47973E = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f47973E;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f47972D;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f47974F == null) {
            this.f47974F = new AlertDialog.Builder((Context) C6620s.l(getContext())).create();
        }
        return this.f47974F;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
