package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import java.util.Locale;

public final class zzid {
    public static Status zza(Intent intent) {
        try {
            zzjp.zzc(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            zzjp.zzc(status, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public static Place zzb(Intent intent) {
        try {
            zzjp.zzc(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            zzjp.zzc(place, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public static String zzc(Context context, int i10) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Locale zzb = Places.isInitialized() ? Places.zzc().zzb() : locale;
        if (zzb.equals(locale)) {
            return context.getResources().getString(i10);
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(zzb);
        return context.createConfigurationContext(configuration).getResources().getString(i10);
    }
}
