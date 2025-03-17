package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.sugarcube.core.logger.DslKt;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class zzfk extends zzft {
    zzfk(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z10, zzho zzho) {
        super(findAutocompletePredictionsRequest, locale, str, false, zzho);
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        return "autocomplete/json";
    }

    public final Map zzf() {
        HashMap hashMap = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zzb();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzft.zzg(hashMap, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), (Object) null);
        if (!typesFilter.isEmpty()) {
            zzft.zzg(hashMap, "types", TextUtils.join(DslKt.INDICATOR_SEPARATOR, typesFilter), (Object) null);
        } else {
            zzft.zzg(hashMap, "types", typeFilter != null ? zzgn.zza(typeFilter) : null, (Object) null);
        }
        zzft.zzg(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), (Object) null);
        zzft.zzg(hashMap, "origin", zzgl.zzb(findAutocompletePredictionsRequest.getOrigin()), (Object) null);
        zzft.zzg(hashMap, "locationbias", zzgl.zzc(findAutocompletePredictionsRequest.getLocationBias()), (Object) null);
        zzft.zzg(hashMap, "locationrestriction", zzgl.zzd(findAutocompletePredictionsRequest.getLocationRestriction()), (Object) null);
        List<String> countries = findAutocompletePredictionsRequest.getCountries();
        StringBuilder sb2 = new StringBuilder();
        for (String next : countries) {
            String concat = TextUtils.isEmpty(next) ? null : "country:".concat(String.valueOf(next.toLowerCase(Locale.US)));
            if (concat != null) {
                if (sb2.length() != 0) {
                    sb2.append('|');
                }
                sb2.append(concat);
            }
        }
        zzft.zzg(hashMap, "components", sb2.length() == 0 ? null : sb2.toString(), (Object) null);
        return hashMap;
    }
}
