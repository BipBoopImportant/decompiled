package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.K;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzhy;
import com.google.android.libraries.places.internal.zzhz;
import com.google.android.libraries.places.internal.zzia;
import com.google.android.libraries.places.internal.zzid;
import com.google.android.libraries.places.internal.zzkh;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

public class AutocompleteSupportFragment extends C5187o {
    private final K zza = new K();
    private final K zzb = new K();
    private zzhz zzc = zzia.zzn(AutocompleteActivityMode.OVERLAY, zzkh.zzl(), zzhy.FRAGMENT);
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    static /* synthetic */ void zzd(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    private final void zze() {
        Intent build = new Autocomplete.IntentBuilder(this.zzc.zzm()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    private final void zzf(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.getValue()) ? 0 : 8);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Intent data was null.");
                    }
                } else if (i11 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else {
                    placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                }
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
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzia zzia = (zzia) bundle.getParcelable("options");
                if (zzia != null) {
                    if (this.zza.getValue() == null) {
                        this.zza.postValue(zzia.zzm());
                    }
                    if (this.zzb.getValue() == null) {
                        this.zzb.postValue(zzia.zzl());
                    }
                    this.zzc = zzia.zzg();
                }
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
    }

    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzm());
    }

    public void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        View findViewById = view.findViewById(R.id.places_autocomplete_search_button);
        View findViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        editText.setHint(zzid.zzc(requireContext(), R.string.places_autocomplete_search_hint));
        findViewById.setOnClickListener(new zze(this));
        editText.setOnClickListener(new zzf(this));
        findViewById2.setOnClickListener(new zzg(this));
        zzf(findViewById2);
        this.zza.observe(getViewLifecycleOwner(), new zzh(this, editText, findViewById2));
        this.zzb.observe(getViewLifecycleOwner(), new zzi(editText, findViewById));
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzf(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zza(list);
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzn(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                String string = getString(R.string.places_autocomplete_search_hint);
                this.zzc.zzb(string);
                this.zzb.postValue(string);
            } catch (Error e10) {
                e = e10;
                zzhk.zzb(e);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                zzhk.zzb(e);
                throw e;
            }
        } else {
            this.zzc.zzb(charSequence.toString());
            this.zzb.postValue(charSequence);
        }
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zzd(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zze(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzh(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        try {
            this.zzc.zzc(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.postValue(charSequence);
            return this;
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypesFilter(@RecentlyNonNull List<String> list) {
        this.zzc.zzl(list);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(View view) {
        zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzf(view);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zza(zzkh.zzk(strArr));
        return this;
    }
}
