package com.google.android.libraries.places.widget;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzhy;
import com.google.android.libraries.places.internal.zzid;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzkh;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

@Deprecated
public class AutocompleteFragment extends Fragment {
    private View zza;
    private View zzb;
    private EditText zzc;
    private LocationBias zzd;
    private LocationRestriction zze;
    private String zzf;
    private TypeFilter zzg;
    private zzkh zzh;
    private PlaceSelectionListener zzi;

    private final void zzb() {
        this.zzb.setVisibility(true != this.zzc.getText().toString().isEmpty() ? 0 : 8);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        try {
            getView().setEnabled(true);
            if (i10 == 30421) {
                if (this.zzi == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (i11 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i11 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                    i11 = 2;
                }
                i10 = 30421;
            }
            super.onActivityResult(i10, i11, intent);
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
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(R.layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = inflate.findViewById(R.id.places_autocomplete_search_button);
            this.zzb = inflate.findViewById(R.id.places_autocomplete_clear_button);
            this.zzc = (EditText) inflate.findViewById(R.id.places_autocomplete_search_input);
            this.zzc.setHint(zzid.zzc(layoutInflater.getContext(), R.string.places_autocomplete_search_hint));
            zzc zzc2 = new zzc(this);
            this.zza.setOnClickListener(zzc2);
            this.zzc.setOnClickListener(zzc2);
            this.zzb.setOnClickListener(new zzd(this));
            zzb();
            inflate.setEnabled(false);
            return inflate;
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public void onDestroyView() {
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public void setCountry(String str) {
        this.zzf = str;
    }

    public void setHint(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                charSequence = getString(R.string.places_autocomplete_search_hint);
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
        this.zzc.setHint(charSequence);
        this.zza.setContentDescription(charSequence);
    }

    public void setLocationBias(LocationBias locationBias) {
        this.zzd = locationBias;
    }

    public void setLocationRestriction(LocationRestriction locationRestriction) {
        this.zze = locationRestriction;
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public void setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        try {
            zzjp.zzc(list, "Place Fields must not be null.");
            this.zzh = zzkh.zzj(list);
            getView().setEnabled(true);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public void setText(CharSequence charSequence) {
        try {
            this.zzc.setText(charSequence);
            zzb();
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public void setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        if (!getView().isEnabled()) {
            zzjp.zzc(this.zzh, "Place Fields must be set.");
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Autocomplete activity cannot be launched until fragment is enabled.");
                return;
            }
            return;
        }
        Autocomplete.IntentBuilder intentBuilder = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, this.zzh);
        intentBuilder.setInitialQuery(this.zzc.getText().toString());
        intentBuilder.setHint(this.zzc.getHint().toString());
        intentBuilder.setCountry(this.zzf);
        intentBuilder.setLocationBias(this.zzd);
        intentBuilder.setLocationRestriction(this.zze);
        intentBuilder.setTypeFilter(this.zzg);
        intentBuilder.zza(zzhy.FRAGMENT);
        Intent build = intentBuilder.build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(build, 30421);
    }
}
