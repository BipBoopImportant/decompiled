package com.google.android.libraries.places.widget.internal.ui;

import android.content.Context;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5195x;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzde;
import com.google.android.libraries.places.internal.zzdh;
import com.google.android.libraries.places.internal.zzhh;
import com.google.android.libraries.places.internal.zzhi;
import com.google.android.libraries.places.internal.zzhm;
import com.google.android.libraries.places.internal.zzia;
import com.google.android.libraries.places.internal.zziy;
import com.google.android.libraries.places.internal.zziz;

public final class zzh extends C5195x {
    private final int zza;
    private final PlacesClient zzb;
    private final zzia zzc;
    private final zziy zzd;
    private final zzde zze = new zzdh();

    public zzh(int i10, Context context, zzia zzia) {
        this.zza = i10;
        Context applicationContext = context.getApplicationContext();
        zzhh zzd2 = zzhi.zzd(applicationContext);
        zzd2.zzd(2);
        zzhi zze2 = zzd2.zze();
        zzhm zzhm = new zzhm(applicationContext);
        this.zzb = Places.zza(applicationContext, zze2);
        this.zzc = zzia;
        this.zzd = new zziz(zzhm, zze2);
    }

    public final C5187o instantiate(ClassLoader classLoader, String str) {
        return C5195x.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze) : super.instantiate(classLoader, str);
    }
}
