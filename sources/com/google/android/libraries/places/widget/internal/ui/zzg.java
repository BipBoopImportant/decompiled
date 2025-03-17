package com.google.android.libraries.places.widget.internal.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzhk;

final class zzg extends RecyclerView.v {
    final /* synthetic */ AutocompleteImplFragment zza;

    zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            try {
                this.zza.zze.zzg();
                this.zza.zzg.clearFocus();
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
    }
}
