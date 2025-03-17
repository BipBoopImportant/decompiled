package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.zzbj;
import com.google.android.libraries.places.api.model.zzbk;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzez;
import java.util.ArrayList;
import java.util.List;

public final class zzfm {
    zzfm() {
    }

    public static final FindAutocompletePredictionsResponse zza(zzfl zzfl) {
        int zza = zzgk.zza(zzfl.status);
        if (!PlacesStatusCodes.isError(zza)) {
            ArrayList arrayList = new ArrayList();
            zzez[] zzezArr = zzfl.predictions;
            if (zzezArr != null) {
                for (zzez zzez : zzezArr) {
                    if (zzez == null || TextUtils.isEmpty(zzez.zzf())) {
                        throw new b(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                    }
                    AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzez.zzf());
                    builder.setDistanceMeters(zzez.zzd());
                    builder.setPlaceTypes(zzgg.zzd(zzgg.zze(zzez.zzc())));
                    builder.setFullText(zzju.zzb(zzez.zze()));
                    builder.zza(zzb(zzez.zzb()));
                    zzez.zza zza2 = zzez.zza();
                    if (zza2 != null) {
                        builder.setPrimaryText(zzju.zzb(zza2.zzc()));
                        builder.zzc(zzb(zza2.zza()));
                        builder.setSecondaryText(zzju.zzb(zza2.zzd()));
                        builder.zzd(zzb(zza2.zzb()));
                    }
                    arrayList.add(builder.build());
                }
            }
            return FindAutocompletePredictionsResponse.newInstance(arrayList);
        }
        throw new b(new Status(zza, zzgk.zzb(zzfl.status, zzfl.errorMessage)));
    }

    private static List zzb(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzlf zzp = ((zzkh) list).listIterator(0);
        while (zzp.hasNext()) {
            zzez.zzb zzb = (zzez.zzb) zzp.next();
            Status status = new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (zzb != null) {
                Integer num = zzb.offset;
                Integer num2 = zzb.length;
                if (num == null || num2 == null) {
                    throw new b(status);
                }
                zzbj zzc = zzbk.zzc();
                zzc.zzb(num.intValue());
                zzc.zza(num2.intValue());
                arrayList.add(zzc.zzc());
            } else {
                throw new b(status);
            }
        }
        return arrayList;
    }
}
