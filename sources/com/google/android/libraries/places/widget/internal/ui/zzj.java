package com.google.android.libraries.places.widget.internal.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.zzhk;

final class zzj implements TextWatcher {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* synthetic */ zzj(AutocompleteImplFragment autocompleteImplFragment, zzi zzi) {
        this.zza = autocompleteImplFragment;
    }

    public final void afterTextChanged(Editable editable) {
        try {
            this.zza.zze.zzm(editable.toString());
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
