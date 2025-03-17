package com.google.android.libraries.places.widget.internal.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.q;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzhk;
import java.util.List;

public final class zzr extends q {
    private int zza;
    private boolean zzb = true;
    private final zzb zzc;

    public zzr(zzb zzb2) {
        super(new zzq((zzp) null));
        this.zzc = zzb2;
    }

    public final void submitList(List list) {
        try {
            int i10 = 0;
            this.zzb = this.zza == 0 && list != null && !list.isEmpty();
            if (list != null) {
                i10 = list.size();
            }
            this.zza = i10;
            super.submitList(list);
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

    /* renamed from: zza */
    public final zzt onCreateViewHolder(ViewGroup viewGroup, int i10) {
        try {
            return new zzt(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    /* renamed from: zzb */
    public final void onBindViewHolder(zzt zzt, int i10) {
        try {
            zzt.zza((AutocompletePrediction) getItem(i10), this.zzb);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }
}
