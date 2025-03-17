package com.google.android.libraries.places.widget.internal.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.zzhk;
import u2.C6012a;

final class zzl implements View.OnFocusChangeListener {
    private zzl() {
    }

    public final void onFocusChange(View view, boolean z10) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) C6012a.j(view.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                if (z10) {
                    inputMethodManager.showSoftInput(view, 1);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }

    /* synthetic */ zzl(zzk zzk) {
    }
}
