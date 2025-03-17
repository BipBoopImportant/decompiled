package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzbq;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import xa.C8970k;
import xa.C8971l;
import xa.C8972m;

public final /* synthetic */ class zzes implements C8970k {
    public final /* synthetic */ Place zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ C8972m zzc;

    public /* synthetic */ zzes(Place place, long j10, C8972m mVar) {
        this.zza = place;
        this.zzb = j10;
        this.zzc = mVar;
    }

    public final C8971l then(Object obj) {
        Place place = this.zza;
        long j10 = this.zzb;
        C8972m mVar = this.zzc;
        Place place2 = ((FetchPlaceResponse) obj).getPlace();
        Place.BusinessStatus businessStatus = place2.getBusinessStatus();
        OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
        OpeningHours openingHours = place2.getOpeningHours();
        Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
        if (place != null) {
            if (utcOffsetMinutes == null) {
                utcOffsetMinutes = place.getUtcOffsetMinutes();
            }
            if (businessStatus == null) {
                businessStatus = place.getBusinessStatus();
            }
            if (currentOpeningHours == null) {
                currentOpeningHours = place.getCurrentOpeningHours();
            }
            if (openingHours == null) {
                openingHours = place.getOpeningHours();
            }
        }
        Place.Builder builder = Place.builder();
        builder.setBusinessStatus(businessStatus);
        builder.setCurrentOpeningHours(currentOpeningHours);
        builder.setOpeningHours(openingHours);
        builder.setUtcOffsetMinutes(utcOffsetMinutes);
        mVar.c(IsOpenResponse.newInstance(zzbq.zza(builder.build(), j10)));
        return mVar.a();
    }
}
