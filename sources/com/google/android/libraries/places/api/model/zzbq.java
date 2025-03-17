package com.google.android.libraries.places.api.model;

import android.util.Log;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.internal.zzkj;
import com.google.android.libraries.places.internal.zzkk;
import com.google.android.libraries.places.internal.zzkt;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class zzbq {
    public static final /* synthetic */ int zza = 0;
    private static final zzkk zzb;
    private static final LocalTime zzc = LocalTime.newInstance(23, 59);

    static {
        zzkj zzkj = new zzkj();
        zzkj.zza(1, DayOfWeek.SUNDAY);
        zzkj.zza(2, DayOfWeek.MONDAY);
        zzkj.zza(3, DayOfWeek.TUESDAY);
        zzkj.zza(4, DayOfWeek.WEDNESDAY);
        zzkj.zza(5, DayOfWeek.THURSDAY);
        zzkj.zza(6, DayOfWeek.FRIDAY);
        zzkj.zza(7, DayOfWeek.SATURDAY);
        zzb = zzkj.zzb();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean zza(com.google.android.libraries.places.api.model.Place r14, long r15) {
        /*
            com.google.android.libraries.places.api.model.Place$BusinessStatus r0 = r14.getBusinessStatus()
            java.lang.Integer r1 = r14.getUtcOffsetMinutes()
            if (r0 == 0) goto L_0x0012
            com.google.android.libraries.places.api.model.Place$BusinessStatus r2 = com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL
            if (r0 != r2) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0012:
            r0 = 0
            if (r1 != 0) goto L_0x0016
            return r0
        L_0x0016:
            com.google.android.libraries.places.api.model.OpeningHours r2 = r14.getCurrentOpeningHours()
            int r3 = r1.intValue()
            if (r2 != 0) goto L_0x0022
            goto L_0x00c2
        L_0x0022:
            java.util.TimeZone r3 = zze(r3)
            if (r3 == 0) goto L_0x00c2
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r2.getPeriods()
            r4.<init>(r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00c2
            com.google.android.libraries.places.api.model.zzbp r5 = com.google.android.libraries.places.api.model.zzbp.zza     // Catch:{ NullPointerException -> 0x00c2 }
            java.util.Collections.sort(r4, r5)     // Catch:{ NullPointerException -> 0x00c2 }
            r5 = 0
            java.lang.Object r5 = r4.get(r5)     // Catch:{ NullPointerException -> 0x00c2 }
            com.google.android.libraries.places.api.model.Period r5 = (com.google.android.libraries.places.api.model.Period) r5     // Catch:{ NullPointerException -> 0x00c2 }
            com.google.android.libraries.places.api.model.TimeOfWeek r5 = r5.getOpen()     // Catch:{ NullPointerException -> 0x00c2 }
            if (r5 == 0) goto L_0x00c1
            com.google.android.libraries.places.api.model.LocalDate r5 = r5.getDate()     // Catch:{ NullPointerException -> 0x00c2 }
            boolean r6 = r4.isEmpty()     // Catch:{ NullPointerException -> 0x00c2 }
            if (r6 != 0) goto L_0x00bb
            int r6 = r4.size()     // Catch:{ NullPointerException -> 0x00c2 }
            int r6 = r6 + -1
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NullPointerException -> 0x00c2 }
            com.google.android.libraries.places.api.model.Period r4 = (com.google.android.libraries.places.api.model.Period) r4     // Catch:{ NullPointerException -> 0x00c2 }
            com.google.android.libraries.places.api.model.TimeOfWeek r4 = r4.getClose()     // Catch:{ NullPointerException -> 0x00c2 }
            if (r4 == 0) goto L_0x00ba
            com.google.android.libraries.places.api.model.LocalDate r4 = r4.getDate()     // Catch:{ NullPointerException -> 0x00c2 }
            if (r5 == 0) goto L_0x00c2
            if (r4 == 0) goto L_0x00c2
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)     // Catch:{ NullPointerException -> 0x00c2 }
            int r7 = r5.getYear()     // Catch:{ NullPointerException -> 0x00c2 }
            int r6 = r5.getMonth()     // Catch:{ NullPointerException -> 0x00c2 }
            int r8 = r6 + -1
            int r9 = r5.getDay()     // Catch:{ NullPointerException -> 0x00c2 }
            r10 = 0
            r11 = 0
            r6 = r3
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ NullPointerException -> 0x00c2 }
            long r12 = r3.getTimeInMillis()     // Catch:{ NullPointerException -> 0x00c2 }
            int r7 = r4.getYear()     // Catch:{ NullPointerException -> 0x00c2 }
            int r5 = r4.getMonth()     // Catch:{ NullPointerException -> 0x00c2 }
            int r8 = r5 + -1
            int r9 = r4.getDay()     // Catch:{ NullPointerException -> 0x00c2 }
            r10 = 23
            r11 = 59
            r6 = r3
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ NullPointerException -> 0x00c2 }
            long r3 = r3.getTimeInMillis()     // Catch:{ NullPointerException -> 0x00c2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r12)     // Catch:{ NullPointerException -> 0x00c2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ NullPointerException -> 0x00c2 }
            com.google.android.libraries.places.internal.zzkt r3 = com.google.android.libraries.places.internal.zzkt.zzb(r5, r3)     // Catch:{ NullPointerException -> 0x00c2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r15)     // Catch:{ NullPointerException -> 0x00c2 }
            boolean r3 = r3.zzd(r4)     // Catch:{ NullPointerException -> 0x00c2 }
            if (r3 == 0) goto L_0x00c2
            goto L_0x00c6
        L_0x00ba:
            throw r0     // Catch:{ NullPointerException -> 0x00c2 }
        L_0x00bb:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ NullPointerException -> 0x00c2 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x00c2 }
            throw r2     // Catch:{ NullPointerException -> 0x00c2 }
        L_0x00c1:
            throw r0     // Catch:{ NullPointerException -> 0x00c2 }
        L_0x00c2:
            com.google.android.libraries.places.api.model.OpeningHours r2 = r14.getOpeningHours()
        L_0x00c6:
            if (r2 != 0) goto L_0x00c9
            return r0
        L_0x00c9:
            java.util.List r2 = r2.getPeriods()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00d6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00d6:
            boolean r3 = zzf(r2)
            if (r3 == 0) goto L_0x00df
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00df:
            java.util.Iterator r3 = r2.iterator()
        L_0x00e3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fc
            java.lang.Object r4 = r3.next()
            com.google.android.libraries.places.api.model.Period r4 = (com.google.android.libraries.places.api.model.Period) r4
            com.google.android.libraries.places.api.model.TimeOfWeek r5 = r4.getOpen()
            if (r5 == 0) goto L_0x00fb
            com.google.android.libraries.places.api.model.TimeOfWeek r4 = r4.getClose()
            if (r4 != 0) goto L_0x00e3
        L_0x00fb:
            return r0
        L_0x00fc:
            int r1 = r1.intValue()
            java.util.TimeZone r1 = zze(r1)
            if (r1 != 0) goto L_0x0107
            return r0
        L_0x0107:
            java.util.Calendar r0 = java.util.Calendar.getInstance(r1)
            r3 = r15
            r0.setTimeInMillis(r3)
            com.google.android.libraries.places.internal.zzkk r1 = zzb
            r3 = 7
            int r3 = r0.get(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r3)
            com.google.android.libraries.places.api.model.DayOfWeek r1 = (com.google.android.libraries.places.api.model.DayOfWeek) r1
            r3 = 11
            int r3 = r0.get(r3)
            r4 = 12
            int r0 = r0.get(r4)
            com.google.android.libraries.places.api.model.LocalTime r0 = com.google.android.libraries.places.api.model.LocalTime.newInstance(r3, r0)
            java.util.Map r2 = zzd(r2)
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x013f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x013f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0143:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0158
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.places.internal.zzkt r2 = (com.google.android.libraries.places.internal.zzkt) r2
            boolean r2 = r2.zzd(r0)
            if (r2 == 0) goto L_0x0143
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0158:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzbq.zza(com.google.android.libraries.places.api.model.Place, long):java.lang.Boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean zzb(com.google.android.libraries.places.api.model.Place r5, long r6) {
        /*
            com.google.android.libraries.places.api.model.Place$BusinessStatus r0 = r5.getBusinessStatus()
            com.google.android.libraries.places.api.model.OpeningHours r1 = r5.getOpeningHours()
            java.lang.Integer r5 = r5.getUtcOffsetMinutes()
            if (r0 == 0) goto L_0x0016
            com.google.android.libraries.places.api.model.Place$BusinessStatus r2 = com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL
            if (r0 != r2) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0016:
            r0 = 0
            if (r1 == 0) goto L_0x00ae
            if (r5 != 0) goto L_0x001d
            goto L_0x00ae
        L_0x001d:
            java.util.List r1 = r1.getPeriods()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x002a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x002a:
            boolean r2 = zzf(r1)
            if (r2 == 0) goto L_0x0033
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L_0x0033:
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()
            com.google.android.libraries.places.api.model.Period r3 = (com.google.android.libraries.places.api.model.Period) r3
            com.google.android.libraries.places.api.model.TimeOfWeek r4 = r3.getOpen()
            if (r4 == 0) goto L_0x004f
            com.google.android.libraries.places.api.model.TimeOfWeek r3 = r3.getClose()
            if (r3 != 0) goto L_0x0037
        L_0x004f:
            return r0
        L_0x0050:
            int r5 = r5.intValue()
            java.util.TimeZone r5 = zze(r5)
            if (r5 != 0) goto L_0x005b
            return r0
        L_0x005b:
            java.util.Calendar r5 = java.util.Calendar.getInstance(r5)
            r5.setTimeInMillis(r6)
            com.google.android.libraries.places.internal.zzkk r6 = zzb
            r7 = 7
            int r7 = r5.get(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            com.google.android.libraries.places.api.model.DayOfWeek r6 = (com.google.android.libraries.places.api.model.DayOfWeek) r6
            r7 = 11
            int r7 = r5.get(r7)
            r0 = 12
            int r5 = r5.get(r0)
            com.google.android.libraries.places.api.model.LocalTime r5 = com.google.android.libraries.places.api.model.LocalTime.newInstance(r7, r5)
            java.util.Map r7 = zzd(r1)
            java.lang.Object r6 = r7.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x0092
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0092:
            java.util.Iterator r6 = r6.iterator()
        L_0x0096:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r6.next()
            com.google.android.libraries.places.internal.zzkt r7 = (com.google.android.libraries.places.internal.zzkt) r7
            boolean r7 = r7.zzd(r5)
            if (r7 == 0) goto L_0x0096
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L_0x00ab:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzbq.zzb(com.google.android.libraries.places.api.model.Place, long):java.lang.Boolean");
    }

    private static Object zzc(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    private static Map zzd(List list) {
        EnumMap enumMap = new EnumMap(DayOfWeek.class);
        if (list.isEmpty()) {
            return enumMap;
        }
        Period period = (Period) list.get(0);
        int i10 = 0;
        while (period != null) {
            TimeOfWeek open = period.getOpen();
            TimeOfWeek close = period.getClose();
            if (open == null || close == null) {
                i10++;
                if (i10 < list.size()) {
                    period = (Period) list.get(i10);
                }
            } else {
                DayOfWeek day = open.getDay();
                LocalTime time = open.getTime();
                if (open.getDay() != close.getDay()) {
                    LocalTime localTime = zzc;
                    List list2 = (List) zzc(enumMap, day, new ArrayList());
                    list2.add(zzkt.zzb(time, localTime));
                    enumMap.put(day, list2);
                    TimeOfWeek newInstance = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                    TimeOfWeek close2 = period.getClose();
                    Period.Builder builder = Period.builder();
                    builder.setOpen(newInstance);
                    builder.setClose(close2);
                    period = builder.build();
                } else {
                    LocalTime time2 = close.getTime();
                    List list3 = (List) zzc(enumMap, day, new ArrayList());
                    list3.add(zzkt.zzc(time, time2));
                    enumMap.put(day, list3);
                    i10++;
                    if (i10 < list.size()) {
                        period = (Period) list.get(i10);
                    }
                }
            }
            period = null;
        }
        return enumMap;
    }

    private static TimeZone zze(int i10) {
        String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis((long) i10));
        if (availableIDs != null && availableIDs.length > 0) {
            return TimeZone.getTimeZone(availableIDs[0]);
        }
        Log.w("Places", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", new Object[]{Integer.valueOf(i10)}));
        return null;
    }

    private static boolean zzf(List list) {
        if (list.size() != 1) {
            return false;
        }
        Period period = (Period) list.get(0);
        TimeOfWeek open = period.getOpen();
        return period.getClose() == null && open != null && open.getDay() == DayOfWeek.SUNDAY && open.getTime().getHours() == 0 && open.getTime().getMinutes() == 0;
    }
}
