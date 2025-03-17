package com.google.android.libraries.places.widget;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzia;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.internal.ui.zzh;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public class AutocompleteActivity extends AppCompatActivity implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    private int zza;
    private int zzb;
    private boolean zzc = false;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
    }

    private final void zzc(int i10, Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i10, intent);
            finish();
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

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        try {
            zzjp.zzk(Places.isInitialized(), "Places must be initialized.");
            boolean z10 = false;
            zzjp.zzk(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            zzia zzia = (zzia) getIntent().getParcelableExtra("places/AutocompleteOptions");
            if (zzia != null) {
                AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
                int ordinal = zzia.zzh().ordinal();
                if (ordinal == 0) {
                    this.zza = R.layout.places_autocomplete_impl_fragment_fullscreen;
                    this.zzb = R.style.PlacesAutocompleteFullscreen;
                } else if (ordinal == 1) {
                    this.zza = R.layout.places_autocomplete_impl_fragment_overlay;
                    this.zzb = R.style.PlacesAutocompleteOverlay;
                }
                getSupportFragmentManager().P1(new zzh(this.zza, this, zzia));
                setTheme(this.zzb);
                super.onCreate(bundle);
                AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().p0(R.id.places_autocomplete_content);
                if (autocompleteImplFragment != null) {
                    z10 = true;
                }
                zzjp.zzj(z10);
                autocompleteImplFragment.zzh(this);
                View findViewById = findViewById(16908290);
                findViewById.setOnTouchListener(new zza(this, autocompleteImplFragment, findViewById));
                findViewById.setOnClickListener(new zzb(this));
                if (zzia.zzj().isEmpty()) {
                    zzc(2, (Place) null, new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
                    return;
                }
                return;
            }
            throw null;
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

    public void onError(@RecentlyNonNull Status status) {
        zzc(true != status.t0() ? 2 : 0, (Place) null, status);
    }

    public void onPlaceSelected(@RecentlyNonNull Place place) {
        zzc(-1, place, Status.f47983f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        if (this.zzc) {
            zzc(0, (Place) null, new Status(16));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzc = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 == null || motionEvent.getY() <= ((float) view3.getBottom())) {
            return false;
        }
        this.zzc = true;
        view.performClick();
        return true;
    }
}
