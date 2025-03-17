package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: D  reason: collision with root package name */
    private boolean f66158D;

    private class b extends BottomSheetBehavior.g {
        private b() {
        }

        public void b(View view, float f10) {
        }

        public void c(View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialogFragment.this.m0();
            }
        }
    }

    /* access modifiers changed from: private */
    public void m0() {
        if (this.f66158D) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void n0(BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f66158D = z10;
        if (bottomSheetBehavior.v0() == 5) {
            m0();
            return;
        }
        if (getDialog() instanceof a) {
            ((a) getDialog()).q();
        }
        bottomSheetBehavior.c0(new b());
        bottomSheetBehavior.X0(5);
    }

    private boolean o0(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof a)) {
            return false;
        }
        a aVar = (a) dialog;
        BottomSheetBehavior<FrameLayout> o10 = aVar.o();
        if (!o10.B0() || !aVar.p()) {
            return false;
        }
        n0(o10, z10);
        return true;
    }

    public void dismiss() {
        if (!o0(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!o0(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new a(getContext(), getTheme());
    }
}
