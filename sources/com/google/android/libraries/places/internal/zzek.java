package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.k;
import com.android.volley.o;
import com.android.volley.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;
import xa.C8960a;
import xa.C8971l;
import xa.C8972m;

public final class zzek {
    private final o zza;

    zzek(o oVar) {
        this.zza = oVar;
    }

    static /* synthetic */ void zza(C8972m mVar, u uVar) {
        b bVar;
        try {
            k kVar = uVar.f46283a;
            if (kVar != null) {
                int i10 = kVar.f46225a;
                if (i10 == 400) {
                    bVar = new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i10 == 403) {
                    bVar = new b(new Status((int) PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                }
                mVar.d(bVar);
            }
            bVar = zzdy.zza(uVar);
            mVar.d(bVar);
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

    static /* synthetic */ void zzc(zzfb zzfb, C8972m mVar, Bitmap bitmap) {
        try {
            zzfb.zzb(bitmap);
            mVar.e(zzfb.zza());
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final C8971l zzb(zzem zzem, zzfb zzfb) {
        String zzc = zzem.zzc();
        Map zzd = zzem.zzd();
        C8960a zza2 = zzem.zza();
        C8972m mVar = zza2 != null ? new C8972m(zza2) : new C8972m();
        zzej zzej = new zzej(this, zzc, new zzeg(zzfb, mVar), 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new zzeh(mVar), zzd);
        if (zza2 != null) {
            zza2.b(new zzei(zzej));
        }
        this.zza.a(zzej);
        return mVar.a();
    }
}
