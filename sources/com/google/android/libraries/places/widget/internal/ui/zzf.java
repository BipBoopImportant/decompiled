package com.google.android.libraries.places.widget.internal.ui;

import androidx.activity.v;

final class zzf extends v {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z10) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    public final void handleOnBackPressed() {
        this.zza.zze.zzj();
    }
}
