package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzhy;
import com.google.android.libraries.places.internal.zzhz;
import com.google.android.libraries.places.internal.zzia;
import com.google.android.libraries.places.internal.zzid;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

public final class Autocomplete {

    public static class IntentBuilder {
        private final zzhz zza;

        public IntentBuilder(zzia zzia) {
            this.zza = zzia.zzg();
        }

        @RecentlyNonNull
        public Intent build(@RecentlyNonNull Context context) {
            try {
                Intent intent = new Intent(context, AutocompleteActivity.class);
                zzhz zzhz = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(16843827, typedValue, true)) {
                    zzhz.zzi(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(16843828, typedValue2, true)) {
                    zzhz.zzj(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", this.zza.zzm());
                return intent;
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

        @RecentlyNonNull
        public IntentBuilder setCountries(@RecentlyNonNull List<String> list) {
            this.zza.zza(list);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setCountry(String str) {
            this.zza.zzn(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setHint(String str) {
            this.zza.zzb(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setInitialQuery(String str) {
            this.zza.zzc(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zzd(locationBias);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zze(locationRestriction);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zza.zzk(typeFilter);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setTypesFilter(@RecentlyNonNull List<String> list) {
            this.zza.zzl(list);
            return this;
        }

        public final IntentBuilder zza(zzhy zzhy) {
            this.zza.zzg(zzhy);
            return this;
        }

        public IntentBuilder(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode, @RecentlyNonNull List<Place.Field> list) {
            this.zza = zzia.zzn(autocompleteActivityMode, list, zzhy.INTENT);
        }
    }

    private Autocomplete() {
    }

    @RecentlyNonNull
    public static Place getPlaceFromIntent(@RecentlyNonNull Intent intent) {
        return zzid.zzb(intent);
    }

    @RecentlyNonNull
    public static Status getStatusFromIntent(@RecentlyNonNull Intent intent) {
        return zzid.zza(intent);
    }
}
