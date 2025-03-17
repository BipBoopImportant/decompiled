package com.google.android.libraries.places.api.model;

import java.util.Comparator;

public final /* synthetic */ class zzbp implements Comparator {
    public static final /* synthetic */ zzbp zza = new zzbp();

    private /* synthetic */ zzbp() {
    }

    public final int compare(Object obj, Object obj2) {
        int i10 = zzbq.zza;
        TimeOfWeek open = ((Period) obj).getOpen();
        open.getClass();
        TimeOfWeek open2 = ((Period) obj2).getOpen();
        open2.getClass();
        LocalDate date = open.getDate();
        date.getClass();
        LocalDate date2 = open2.getDate();
        date2.getClass();
        return date.compareTo(date2);
    }
}
