package com.google.android.libraries.places.widget.internal.ui;

import I2.C4600b0;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzde;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzia;
import com.google.android.libraries.places.internal.zzic;
import com.google.android.libraries.places.internal.zzid;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzio;
import com.google.android.libraries.places.internal.zzis;
import com.google.android.libraries.places.internal.zziu;
import com.google.android.libraries.places.internal.zzix;
import com.google.android.libraries.places.internal.zziy;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;
import u2.C6012a;

@SuppressLint({"ValidFragment"})
public final class AutocompleteImplFragment extends C5187o {
    private final PlacesClient zza;
    private final zzia zzb;
    private final zziy zzc;
    private final zzde zzd;
    /* access modifiers changed from: private */
    public zziu zze;
    private PlaceSelectionListener zzf;
    /* access modifiers changed from: private */
    public EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzr zzs;
    private final zzj zzt;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzix zzix = new zzix(this.zzb.zzf(), this.zzb.zzh(), this.zzb.zzm(), this.zzd);
            zziu zziu = (zziu) new i0((k0) this, (i0.c) new zzis(new zzio(this.zza, this.zzb, zzix.zzh()), zzix, this.zzc)).a(zziu.class);
            this.zze = zziu;
            zziu.zze(bundle);
            requireActivity().getOnBackPressedDispatcher().i(this, new zzf(this, true));
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final void onPause() {
        super.onPause();
        this.zze.zzi();
    }

    public final void onResume() {
        super.onResume();
        this.zze.zzh();
    }

    public final void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        try {
            this.zzg = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzi = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzj = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(R.id.places_autocomplete_progress);
            this.zzm = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzl((zzk) null));
            this.zzg.setHint(TextUtils.isEmpty(this.zzb.zzl()) ? zzid.zzc(requireContext(), R.string.places_autocomplete_search_hint) : this.zzb.zzl());
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = this.zzb.zzh().ordinal();
            if (ordinal == 0) {
                int zza2 = this.zzb.zza();
                int zzb2 = this.zzb.zzb();
                if (Color.alpha(zza2) < 255) {
                    zza2 = 0;
                }
                if (!(zza2 == 0 || zzb2 == 0)) {
                    int zza3 = zzie.zza(zza2, C6012a.c(requireContext(), R.color.places_text_white_alpha_87), C6012a.c(requireContext(), R.color.places_text_black_alpha_87));
                    int zza4 = zzie.zza(zza2, C6012a.c(requireContext(), R.color.places_text_white_alpha_26), C6012a.c(requireContext(), R.color.places_text_black_alpha_26));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(zza2);
                    Window window = requireActivity().getWindow();
                    if (zzie.zzc(zzb2, -1, -16777216)) {
                        window.setStatusBarColor(zzb2);
                        window.getDecorView().setSystemUiVisibility(8192);
                    } else {
                        window.setStatusBarColor(zzb2);
                    }
                    this.zzg.setTextColor(zza3);
                    this.zzg.setHintTextColor(zza4);
                    zzie.zzb((ImageView) this.zzi, zza3);
                    zzie.zzb((ImageView) this.zzj, zza3);
                }
            } else if (ordinal == 1) {
                int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    requireActivity().getWindow().addFlags(67108864);
                    C4600b0.F0(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
                }
            }
            this.zzi.setOnClickListener(new zzd(this));
            this.zzj.setOnClickListener(new zzc(this));
            this.zzr.setOnClickListener(new zza(this));
            this.zzs = new zzr(new zzb(this));
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzo(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.n(new zzg(this));
            this.zze.zza().observe(getViewLifecycleOwner(), new zze(this));
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(View view) {
        this.zze.zzj();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(View view) {
        try {
            this.zze.zzk();
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i10) {
        try {
            this.zze.zzf(autocompletePrediction, i10);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        try {
            this.zze.zzl(this.zzg.getText().toString());
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzic zzic) {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzic.zzf() - 1) {
                case 0:
                    if (TextUtils.isEmpty(this.zzb.zzm())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzm());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzs.submitList((List) null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 2:
                    this.zzl.setVisibility(0);
                    return;
                case 3:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 4:
                    this.zzs.submitList(zzic.zzd());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList((List) null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(R.string.places_autocomplete_no_results_for_query, zzic.zze()));
                    this.zzq.setVisibility(0);
                    return;
                case 6:
                    break;
                case 8:
                    AutocompletePrediction zzb2 = zzic.zzb();
                    zzjp.zzc(zzb2, "Prediction should not be null.");
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(zzb2.getPrimaryText((CharacterStyle) null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener = this.zzf;
                    Status zza2 = zzic.zza();
                    if (zza2 != null) {
                        placeSelectionListener.onError(zza2);
                        return;
                    }
                    throw null;
                default:
                    PlaceSelectionListener placeSelectionListener2 = this.zzf;
                    Place zzc2 = zzic.zzc();
                    if (zzc2 != null) {
                        placeSelectionListener2.onPlaceSelected(zzc2);
                        return;
                    }
                    throw null;
            }
            this.zzs.submitList((List) null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(R.string.places_search_error));
            this.zzq.setVisibility(0);
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

    public final void zzh(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }

    private AutocompleteImplFragment(int i10, PlacesClient placesClient, zzia zzia, zziy zziy, zzde zzde) {
        super(i10);
        this.zzt = new zzj(this, (zzi) null);
        this.zza = placesClient;
        this.zzb = zzia;
        this.zzc = zziy;
        this.zzd = zzde;
    }
}
