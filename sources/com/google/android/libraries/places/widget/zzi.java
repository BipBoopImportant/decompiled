package com.google.android.libraries.places.widget;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.L;

public final /* synthetic */ class zzi implements L {
    public final /* synthetic */ EditText zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzi(EditText editText, View view) {
        this.zza = editText;
        this.zzb = view;
    }

    public final void onChanged(Object obj) {
        AutocompleteSupportFragment.zzd(this.zza, this.zzb, (CharSequence) obj);
    }
}
