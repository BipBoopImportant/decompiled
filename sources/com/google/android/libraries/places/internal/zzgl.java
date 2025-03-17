package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.sugarcube.core.logger.DslKt;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

public final class zzgl {
    private static final zzkk zza;

    static {
        zzkj zzkj = new zzkj();
        zzkj.zza(zzdr.NONE, "NONE");
        zzkj.zza(zzdr.PSK, "WPA_PSK");
        zzkj.zza(zzdr.EAP, "WPA_EAP");
        zzkj.zza(zzdr.OTHER, "SECURED_NONE");
        zza = zzkj.zzb();
    }

    public static String zza(Location location) {
        if (location == null) {
            return null;
        }
        return zzf(location.getLatitude(), location.getLongitude());
    }

    public static String zzb(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzf(latLng.f49500a, latLng.f49501b);
    }

    public static String zzc(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zzd(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    public static String zze(zzkh zzkh, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int size = zzkh.size();
        int i11 = 0;
        while (i11 < size) {
            zzds zzds = (zzds) zzkh.get(i11);
            int length = sb2.length();
            zzkj zzkj = new zzkj();
            zzkj.zza("mac", zzds.zzd());
            zzkj.zza("strength_dbm", Integer.valueOf(zzds.zzb()));
            zzkj.zza("wifi_auth_type", zza.get(zzds.zzc()));
            zzkj.zza("is_connected", Boolean.valueOf(zzds.zze()));
            zzkj.zza("frequency_mhz", Integer.valueOf(zzds.zza()));
            zzkk zzb = zzkj.zzb();
            zzjk zzb2 = zzjk.zzb(",");
            Iterator it = zzb.entrySet().iterator();
            StringBuilder sb3 = new StringBuilder();
            try {
                zzji.zza(sb3, it, zzb2, "=");
                String sb4 = sb3.toString();
                int length2 = sb2.length();
                String concat = (length > 0 ? DslKt.INDICATOR_SEPARATOR : "").concat(sb4);
                if (length2 + concat.length() > 4000) {
                    break;
                }
                sb2.append(concat);
                i11++;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
        return sb2.toString();
    }

    private static String zzf(double d10, double d11) {
        return String.format(Locale.US, "%.15f,%.15f", new Object[]{Double.valueOf(d10), Double.valueOf(d11)});
    }

    private static String zzg(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d10 = southwest.f49500a;
        double d11 = southwest.f49501b;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", new Object[]{Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(northeast.f49500a), Double.valueOf(northeast.f49501b)});
    }
}
