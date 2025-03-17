package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.SpecialDay;
import com.google.android.libraries.places.internal.zzgj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class zzgg {
    private static final zzkk zza;
    private static final zzkk zzb;
    private static final zzkk zzc;

    static {
        zzkj zzkj = new zzkj();
        zzkj.zza("OPERATIONAL", Place.BusinessStatus.OPERATIONAL);
        zzkj.zza("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY);
        zzkj.zza("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY);
        zza = zzkj.zzb();
        zzkj zzkj2 = new zzkj();
        zzkj2.zza(PlaceTypes.ACCOUNTING, Place.Type.ACCOUNTING);
        zzkj2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        zzkj2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        zzkj2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3);
        zzkj2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4, Place.Type.ADMINISTRATIVE_AREA_LEVEL_4);
        zzkj2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5, Place.Type.ADMINISTRATIVE_AREA_LEVEL_5);
        zzkj2.zza(PlaceTypes.AIRPORT, Place.Type.AIRPORT);
        zzkj2.zza(PlaceTypes.AMUSEMENT_PARK, Place.Type.AMUSEMENT_PARK);
        zzkj2.zza(PlaceTypes.AQUARIUM, Place.Type.AQUARIUM);
        zzkj2.zza(PlaceTypes.ARCHIPELAGO, Place.Type.ARCHIPELAGO);
        zzkj2.zza(PlaceTypes.ART_GALLERY, Place.Type.ART_GALLERY);
        zzkj2.zza(PlaceTypes.ATM, Place.Type.ATM);
        zzkj2.zza(PlaceTypes.BAKERY, Place.Type.BAKERY);
        zzkj2.zza(PlaceTypes.BANK, Place.Type.BANK);
        zzkj2.zza(PlaceTypes.BAR, Place.Type.BAR);
        zzkj2.zza(PlaceTypes.BEAUTY_SALON, Place.Type.BEAUTY_SALON);
        zzkj2.zza(PlaceTypes.BICYCLE_STORE, Place.Type.BICYCLE_STORE);
        zzkj2.zza(PlaceTypes.BOOK_STORE, Place.Type.BOOK_STORE);
        zzkj2.zza(PlaceTypes.BOWLING_ALLEY, Place.Type.BOWLING_ALLEY);
        zzkj2.zza(PlaceTypes.BUS_STATION, Place.Type.BUS_STATION);
        zzkj2.zza(PlaceTypes.CAFE, Place.Type.CAFE);
        zzkj2.zza(PlaceTypes.CAMPGROUND, Place.Type.CAMPGROUND);
        zzkj2.zza(PlaceTypes.CAR_DEALER, Place.Type.CAR_DEALER);
        zzkj2.zza(PlaceTypes.CAR_RENTAL, Place.Type.CAR_RENTAL);
        zzkj2.zza(PlaceTypes.CAR_REPAIR, Place.Type.CAR_REPAIR);
        zzkj2.zza(PlaceTypes.CAR_WASH, Place.Type.CAR_WASH);
        zzkj2.zza(PlaceTypes.CASINO, Place.Type.CASINO);
        zzkj2.zza(PlaceTypes.CEMETERY, Place.Type.CEMETERY);
        zzkj2.zza(PlaceTypes.CHURCH, Place.Type.CHURCH);
        zzkj2.zza(PlaceTypes.CITY_HALL, Place.Type.CITY_HALL);
        zzkj2.zza(PlaceTypes.CLOTHING_STORE, Place.Type.CLOTHING_STORE);
        zzkj2.zza(PlaceTypes.COLLOQUIAL_AREA, Place.Type.COLLOQUIAL_AREA);
        zzkj2.zza(PlaceTypes.CONTINENT, Place.Type.CONTINENT);
        zzkj2.zza(PlaceTypes.CONVENIENCE_STORE, Place.Type.CONVENIENCE_STORE);
        zzkj2.zza(PlaceTypes.COUNTRY, Place.Type.COUNTRY);
        zzkj2.zza(PlaceTypes.COURTHOUSE, Place.Type.COURTHOUSE);
        zzkj2.zza(PlaceTypes.DENTIST, Place.Type.DENTIST);
        zzkj2.zza(PlaceTypes.DEPARTMENT_STORE, Place.Type.DEPARTMENT_STORE);
        zzkj2.zza(PlaceTypes.DOCTOR, Place.Type.DOCTOR);
        zzkj2.zza(PlaceTypes.DRUGSTORE, Place.Type.DRUGSTORE);
        zzkj2.zza(PlaceTypes.ELECTRICIAN, Place.Type.ELECTRICIAN);
        zzkj2.zza(PlaceTypes.ELECTRONICS_STORE, Place.Type.ELECTRONICS_STORE);
        zzkj2.zza(PlaceTypes.EMBASSY, Place.Type.EMBASSY);
        zzkj2.zza(PlaceTypes.ESTABLISHMENT, Place.Type.ESTABLISHMENT);
        zzkj2.zza(PlaceTypes.FINANCE, Place.Type.FINANCE);
        zzkj2.zza(PlaceTypes.FIRE_STATION, Place.Type.FIRE_STATION);
        zzkj2.zza(PlaceTypes.FLOOR, Place.Type.FLOOR);
        zzkj2.zza(PlaceTypes.FLORIST, Place.Type.FLORIST);
        zzkj2.zza(PlaceTypes.FOOD, Place.Type.FOOD);
        zzkj2.zza(PlaceTypes.FUNERAL_HOME, Place.Type.FUNERAL_HOME);
        zzkj2.zza(PlaceTypes.FURNITURE_STORE, Place.Type.FURNITURE_STORE);
        zzkj2.zza(PlaceTypes.GAS_STATION, Place.Type.GAS_STATION);
        zzkj2.zza(PlaceTypes.GENERAL_CONTRACTOR, Place.Type.GENERAL_CONTRACTOR);
        zzkj2.zza(PlaceTypes.GEOCODE, Place.Type.GEOCODE);
        zzkj2.zza("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET);
        zzkj2.zza(PlaceTypes.GYM, Place.Type.GYM);
        zzkj2.zza(PlaceTypes.HAIR_CARE, Place.Type.HAIR_CARE);
        zzkj2.zza(PlaceTypes.HARDWARE_STORE, Place.Type.HARDWARE_STORE);
        zzkj2.zza(PlaceTypes.HEALTH, Place.Type.HEALTH);
        zzkj2.zza(PlaceTypes.HINDU_TEMPLE, Place.Type.HINDU_TEMPLE);
        zzkj2.zza(PlaceTypes.HOME_GOODS_STORE, Place.Type.HOME_GOODS_STORE);
        zzkj2.zza(PlaceTypes.HOSPITAL, Place.Type.HOSPITAL);
        zzkj2.zza(PlaceTypes.INSURANCE_AGENCY, Place.Type.INSURANCE_AGENCY);
        zzkj2.zza(PlaceTypes.INTERSECTION, Place.Type.INTERSECTION);
        zzkj2.zza(PlaceTypes.JEWELRY_STORE, Place.Type.JEWELRY_STORE);
        zzkj2.zza(PlaceTypes.LAUNDRY, Place.Type.LAUNDRY);
        zzkj2.zza(PlaceTypes.LAWYER, Place.Type.LAWYER);
        zzkj2.zza(PlaceTypes.LIBRARY, Place.Type.LIBRARY);
        zzkj2.zza(PlaceTypes.LIGHT_RAIL_STATION, Place.Type.LIGHT_RAIL_STATION);
        zzkj2.zza(PlaceTypes.LIQUOR_STORE, Place.Type.LIQUOR_STORE);
        zzkj2.zza(PlaceTypes.LOCAL_GOVERNMENT_OFFICE, Place.Type.LOCAL_GOVERNMENT_OFFICE);
        zzkj2.zza(PlaceTypes.LOCALITY, Place.Type.LOCALITY);
        zzkj2.zza(PlaceTypes.LOCKSMITH, Place.Type.LOCKSMITH);
        zzkj2.zza(PlaceTypes.LODGING, Place.Type.LODGING);
        zzkj2.zza(PlaceTypes.MEAL_DELIVERY, Place.Type.MEAL_DELIVERY);
        zzkj2.zza(PlaceTypes.MEAL_TAKEAWAY, Place.Type.MEAL_TAKEAWAY);
        zzkj2.zza(PlaceTypes.MOSQUE, Place.Type.MOSQUE);
        zzkj2.zza(PlaceTypes.MOVIE_RENTAL, Place.Type.MOVIE_RENTAL);
        zzkj2.zza(PlaceTypes.MOVIE_THEATER, Place.Type.MOVIE_THEATER);
        zzkj2.zza(PlaceTypes.MOVING_COMPANY, Place.Type.MOVING_COMPANY);
        zzkj2.zza(PlaceTypes.MUSEUM, Place.Type.MUSEUM);
        zzkj2.zza(PlaceTypes.NATURAL_FEATURE, Place.Type.NATURAL_FEATURE);
        zzkj2.zza(PlaceTypes.NEIGHBORHOOD, Place.Type.NEIGHBORHOOD);
        zzkj2.zza(PlaceTypes.NIGHT_CLUB, Place.Type.NIGHT_CLUB);
        zzkj2.zza(PlaceTypes.PAINTER, Place.Type.PAINTER);
        zzkj2.zza(PlaceTypes.PARK, Place.Type.PARK);
        zzkj2.zza(PlaceTypes.PARKING, Place.Type.PARKING);
        zzkj2.zza(PlaceTypes.PET_STORE, Place.Type.PET_STORE);
        zzkj2.zza(PlaceTypes.PHARMACY, Place.Type.PHARMACY);
        zzkj2.zza(PlaceTypes.PHYSIOTHERAPIST, Place.Type.PHYSIOTHERAPIST);
        zzkj2.zza(PlaceTypes.PLACE_OF_WORSHIP, Place.Type.PLACE_OF_WORSHIP);
        zzkj2.zza(PlaceTypes.PLUMBER, Place.Type.PLUMBER);
        zzkj2.zza(PlaceTypes.PLUS_CODE, Place.Type.PLUS_CODE);
        zzkj2.zza(PlaceTypes.POINT_OF_INTEREST, Place.Type.POINT_OF_INTEREST);
        zzkj2.zza(PlaceTypes.POLICE, Place.Type.POLICE);
        zzkj2.zza(PlaceTypes.POLITICAL, Place.Type.POLITICAL);
        zzkj2.zza(PlaceTypes.POST_BOX, Place.Type.POST_BOX);
        zzkj2.zza(PlaceTypes.POST_OFFICE, Place.Type.POST_OFFICE);
        zzkj2.zza(PlaceTypes.POSTAL_CODE_PREFIX, Place.Type.POSTAL_CODE_PREFIX);
        zzkj2.zza(PlaceTypes.POSTAL_CODE_SUFFIX, Place.Type.POSTAL_CODE_SUFFIX);
        zzkj2.zza(PlaceTypes.POSTAL_CODE, Place.Type.POSTAL_CODE);
        zzkj2.zza(PlaceTypes.POSTAL_TOWN, Place.Type.POSTAL_TOWN);
        zzkj2.zza(PlaceTypes.PREMISE, Place.Type.PREMISE);
        zzkj2.zza(PlaceTypes.PRIMARY_SCHOOL, Place.Type.PRIMARY_SCHOOL);
        zzkj2.zza(PlaceTypes.REAL_ESTATE_AGENCY, Place.Type.REAL_ESTATE_AGENCY);
        zzkj2.zza(PlaceTypes.RESTAURANT, Place.Type.RESTAURANT);
        zzkj2.zza(PlaceTypes.ROOFING_CONTRACTOR, Place.Type.ROOFING_CONTRACTOR);
        zzkj2.zza(PlaceTypes.ROOM, Place.Type.ROOM);
        zzkj2.zza(PlaceTypes.ROUTE, Place.Type.ROUTE);
        zzkj2.zza(PlaceTypes.RV_PARK, Place.Type.RV_PARK);
        zzkj2.zza(PlaceTypes.SCHOOL, Place.Type.SCHOOL);
        zzkj2.zza(PlaceTypes.SECONDARY_SCHOOL, Place.Type.SECONDARY_SCHOOL);
        zzkj2.zza(PlaceTypes.SHOE_STORE, Place.Type.SHOE_STORE);
        zzkj2.zza(PlaceTypes.SHOPPING_MALL, Place.Type.SHOPPING_MALL);
        zzkj2.zza(PlaceTypes.SPA, Place.Type.SPA);
        zzkj2.zza(PlaceTypes.STADIUM, Place.Type.STADIUM);
        zzkj2.zza(PlaceTypes.STORAGE, Place.Type.STORAGE);
        zzkj2.zza(PlaceTypes.STORE, Place.Type.STORE);
        zzkj2.zza(PlaceTypes.STREET_ADDRESS, Place.Type.STREET_ADDRESS);
        zzkj2.zza(PlaceTypes.STREET_NUMBER, Place.Type.STREET_NUMBER);
        zzkj2.zza(PlaceTypes.SUBLOCALITY_LEVEL_1, Place.Type.SUBLOCALITY_LEVEL_1);
        zzkj2.zza(PlaceTypes.SUBLOCALITY_LEVEL_2, Place.Type.SUBLOCALITY_LEVEL_2);
        zzkj2.zza(PlaceTypes.SUBLOCALITY_LEVEL_3, Place.Type.SUBLOCALITY_LEVEL_3);
        zzkj2.zza(PlaceTypes.SUBLOCALITY_LEVEL_4, Place.Type.SUBLOCALITY_LEVEL_4);
        zzkj2.zza(PlaceTypes.SUBLOCALITY_LEVEL_5, Place.Type.SUBLOCALITY_LEVEL_5);
        zzkj2.zza(PlaceTypes.SUBLOCALITY, Place.Type.SUBLOCALITY);
        zzkj2.zza(PlaceTypes.SUBPREMISE, Place.Type.SUBPREMISE);
        zzkj2.zza(PlaceTypes.SUBWAY_STATION, Place.Type.SUBWAY_STATION);
        zzkj2.zza(PlaceTypes.SUPERMARKET, Place.Type.SUPERMARKET);
        zzkj2.zza(PlaceTypes.SYNAGOGUE, Place.Type.SYNAGOGUE);
        zzkj2.zza(PlaceTypes.TAXI_STAND, Place.Type.TAXI_STAND);
        zzkj2.zza(PlaceTypes.TOURIST_ATTRACTION, Place.Type.TOURIST_ATTRACTION);
        zzkj2.zza(PlaceTypes.TOWN_SQUARE, Place.Type.TOWN_SQUARE);
        zzkj2.zza(PlaceTypes.TRAIN_STATION, Place.Type.TRAIN_STATION);
        zzkj2.zza(PlaceTypes.TRANSIT_STATION, Place.Type.TRANSIT_STATION);
        zzkj2.zza(PlaceTypes.TRAVEL_AGENCY, Place.Type.TRAVEL_AGENCY);
        zzkj2.zza(PlaceTypes.UNIVERSITY, Place.Type.UNIVERSITY);
        zzkj2.zza(PlaceTypes.VETERINARY_CARE, Place.Type.VETERINARY_CARE);
        zzkj2.zza(PlaceTypes.ZOO, Place.Type.ZOO);
        zzb = zzkj2.zzb();
        zzkj zzkj3 = new zzkj();
        zzkj3.zza("ACCESS", OpeningHours.HoursType.ACCESS);
        zzkj3.zza("BREAKFAST", OpeningHours.HoursType.BREAKFAST);
        zzkj3.zza("BRUNCH", OpeningHours.HoursType.BRUNCH);
        zzkj3.zza("DELIVERY", OpeningHours.HoursType.DELIVERY);
        zzkj3.zza("DINNER", OpeningHours.HoursType.DINNER);
        zzkj3.zza("DRIVE_THROUGH", OpeningHours.HoursType.DRIVE_THROUGH);
        zzkj3.zza("HAPPY_HOUR", OpeningHours.HoursType.HAPPY_HOUR);
        zzkj3.zza("KITCHEN", OpeningHours.HoursType.KITCHEN);
        zzkj3.zza("LUNCH", OpeningHours.HoursType.LUNCH);
        zzkj3.zza("ONLINE_SERVICE_HOURS", OpeningHours.HoursType.ONLINE_SERVICE_HOURS);
        zzkj3.zza("PICKUP", OpeningHours.HoursType.PICKUP);
        zzkj3.zza("SENIOR_HOURS", OpeningHours.HoursType.SENIOR_HOURS);
        zzkj3.zza("TAKEOUT", OpeningHours.HoursType.TAKEOUT);
        zzc = zzkj3.zzb();
    }

    zzgg() {
    }

    static LocalDate zza(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LocalDate.newInstance(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", new Object[]{str}), e10);
        }
    }

    static Place.BooleanPlaceAttributeValue zzb(Boolean bool) {
        return bool == null ? Place.BooleanPlaceAttributeValue.UNKNOWN : bool.booleanValue() ? Place.BooleanPlaceAttributeValue.TRUE : Place.BooleanPlaceAttributeValue.FALSE;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:2|3|(1:5)(1:6)|7|8|9|10|11|12|14|15|16|26|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ NumberFormatException -> 0x0089, NullPointerException -> 0x004b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.libraries.places.api.model.TimeOfWeek zzc(com.google.android.libraries.places.internal.zzgj.zzd.zzc r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x009a
            java.lang.Integer r1 = r7.zzb()     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r2 = "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing."
            com.google.android.libraries.places.internal.zzjp.zzc(r1, r2)     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r2 = r7.zzd()     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r3 = "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing."
            com.google.android.libraries.places.internal.zzjp.zzc(r2, r3)     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r3 = "Unable to convert %s to LocalTime, must be of format \"hhmm\"."
            java.lang.Object[] r4 = new java.lang.Object[]{r2}     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ NullPointerException -> 0x004b }
            int r4 = r2.length()     // Catch:{ NullPointerException -> 0x004b }
            r5 = 0
            r6 = 4
            if (r4 != r6) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = r5
        L_0x002a:
            com.google.android.libraries.places.internal.zzjp.zze(r4, r3)     // Catch:{ NullPointerException -> 0x004b }
            r4 = 2
            java.lang.String r5 = r2.substring(r5, r4)     // Catch:{ NumberFormatException -> 0x0089 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0089 }
            java.lang.String r2 = r2.substring(r4, r6)     // Catch:{ NumberFormatException -> 0x0089 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0089 }
            com.google.android.libraries.places.api.model.LocalTime r2 = com.google.android.libraries.places.api.model.LocalTime.newInstance(r5, r2)     // Catch:{ NumberFormatException -> 0x0089 }
            java.lang.String r3 = r7.zzc()     // Catch:{ IllegalArgumentException -> 0x004d }
            com.google.android.libraries.places.api.model.LocalDate r0 = zza(r3)     // Catch:{ IllegalArgumentException -> 0x004d }
            goto L_0x004d
        L_0x004b:
            r7 = move-exception
            goto L_0x0090
        L_0x004d:
            int r1 = r1.intValue()     // Catch:{ NullPointerException -> 0x004b }
            switch(r1) {
                case 0: goto L_0x006e;
                case 1: goto L_0x006b;
                case 2: goto L_0x0068;
                case 3: goto L_0x0065;
                case 4: goto L_0x0062;
                case 5: goto L_0x005f;
                case 6: goto L_0x005c;
                default: goto L_0x0054;
            }     // Catch:{ NullPointerException -> 0x004b }
        L_0x0054:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ NullPointerException -> 0x004b }
            java.lang.String r0 = "pabloDayOfWeek can only be an integer between 0 and 6"
            r7.<init>(r0)     // Catch:{ NullPointerException -> 0x004b }
            throw r7     // Catch:{ NullPointerException -> 0x004b }
        L_0x005c:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.SATURDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x005f:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.FRIDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x0062:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.THURSDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x0065:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.WEDNESDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x0068:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.TUESDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x006b:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.MONDAY     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x0070
        L_0x006e:
            com.google.android.libraries.places.api.model.DayOfWeek r1 = com.google.android.libraries.places.api.model.DayOfWeek.SUNDAY     // Catch:{ NullPointerException -> 0x004b }
        L_0x0070:
            com.google.android.libraries.places.api.model.TimeOfWeek$Builder r1 = com.google.android.libraries.places.api.model.TimeOfWeek.builder(r1, r2)     // Catch:{ NullPointerException -> 0x004b }
            r1.setDate(r0)     // Catch:{ NullPointerException -> 0x004b }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ NullPointerException -> 0x004b }
            java.lang.Boolean r7 = r7.zza()     // Catch:{ NullPointerException -> 0x004b }
            boolean r7 = r0.equals(r7)     // Catch:{ NullPointerException -> 0x004b }
            r1.setTruncated(r7)     // Catch:{ NullPointerException -> 0x004b }
            com.google.android.libraries.places.api.model.TimeOfWeek r0 = r1.build()     // Catch:{ NullPointerException -> 0x004b }
            goto L_0x009a
        L_0x0089:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NullPointerException -> 0x004b }
            r0.<init>(r3, r7)     // Catch:{ NullPointerException -> 0x004b }
            throw r0     // Catch:{ NullPointerException -> 0x004b }
        L_0x0090:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.getMessage()
            r0.<init>(r1, r7)
            throw r0
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzgg.zzc(com.google.android.libraries.places.internal.zzgj$zzd$zzc):com.google.android.libraries.places.api.model.TimeOfWeek");
    }

    static List zzd(List list) {
        return list != null ? list : new ArrayList();
    }

    static List zze(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        zzlf zzp = ((zzkh) list).listIterator(0);
        while (zzp.hasNext()) {
            String str = (String) zzp.next();
            zzkk zzkk = zzb;
            if (zzkk.containsKey(str)) {
                arrayList.add((Place.Type) zzkk.get(str));
            } else {
                z10 = true;
            }
        }
        if (z10) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0210  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.android.libraries.places.api.model.Place zzf(com.google.android.libraries.places.internal.zzgj r11, java.util.List r12) {
        /*
            com.google.android.libraries.places.api.model.Place$Builder r0 = com.google.android.libraries.places.api.model.Place.builder()
            r0.setAttributions(r12)
            if (r11 == 0) goto L_0x02ba
            com.google.android.libraries.places.internal.zzkh r12 = r11.zzf()
            r1 = 0
            r2 = 0
            if (r12 != 0) goto L_0x0013
            r12 = r2
            goto L_0x0068
        L_0x0013:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.libraries.places.internal.zzlf r12 = r12.listIterator(r1)
        L_0x001c:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r12.next()
            com.google.android.libraries.places.internal.zzgj$zza r4 = (com.google.android.libraries.places.internal.zzgj.zza) r4
            if (r4 != 0) goto L_0x002c
            r4 = r2
            goto L_0x0047
        L_0x002c:
            java.lang.String r5 = r4.zzb()     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
            if (r5 == 0) goto L_0x0050
            com.google.android.libraries.places.internal.zzkh r6 = r4.zza()     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
            if (r6 == 0) goto L_0x004f
            com.google.android.libraries.places.api.model.AddressComponent$Builder r5 = com.google.android.libraries.places.api.model.AddressComponent.builder(r5, r6)     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
            java.lang.String r4 = r4.zzc()     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
            r5.setShortName(r4)     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
            com.google.android.libraries.places.api.model.AddressComponent r4 = r5.build()     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
        L_0x0047:
            zzj(r3, r4)
            goto L_0x001c
        L_0x004b:
            r11 = move-exception
            goto L_0x0051
        L_0x004d:
            r11 = move-exception
            goto L_0x0051
        L_0x004f:
            throw r2     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
        L_0x0050:
            throw r2     // Catch:{ IllegalStateException -> 0x004d, NullPointerException -> 0x004b }
        L_0x0051:
            java.lang.String r11 = r11.getMessage()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r12 = "AddressComponent not properly defined (%s)."
            java.lang.String r11 = java.lang.String.format(r12, r11)
            com.google.android.gms.common.api.b r11 = zzg(r11)
            throw r11
        L_0x0064:
            com.google.android.libraries.places.api.model.AddressComponents r12 = com.google.android.libraries.places.api.model.AddressComponents.newInstance(r3)
        L_0x0068:
            com.google.android.libraries.places.internal.zzgj$zzc r3 = r11.zzb()
            if (r3 == 0) goto L_0x0099
            com.google.android.libraries.places.internal.zzgj$zzc$zza r4 = r3.zza()
            com.google.android.gms.maps.model.LatLng r4 = zzh(r4)
            com.google.android.libraries.places.internal.zzgj$zzc$zzb r3 = r3.zzb()
            if (r3 != 0) goto L_0x007e
        L_0x007c:
            r6 = r2
            goto L_0x009b
        L_0x007e:
            com.google.android.libraries.places.internal.zzgj$zzc$zza r5 = r3.zzb()
            com.google.android.gms.maps.model.LatLng r5 = zzh(r5)
            com.google.android.libraries.places.internal.zzgj$zzc$zza r3 = r3.zza()
            com.google.android.gms.maps.model.LatLng r3 = zzh(r3)
            if (r5 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x0093
            goto L_0x007c
        L_0x0093:
            com.google.android.gms.maps.model.LatLngBounds r6 = new com.google.android.gms.maps.model.LatLngBounds
            r6.<init>(r5, r3)
            goto L_0x009b
        L_0x0099:
            r4 = r2
            r6 = r4
        L_0x009b:
            java.lang.String r3 = r11.zzG()
            if (r3 == 0) goto L_0x00a6
            android.net.Uri r3 = android.net.Uri.parse(r3)
            goto L_0x00a7
        L_0x00a6:
            r3 = r2
        L_0x00a7:
            java.lang.String r5 = r11.zzC()
            if (r5 == 0) goto L_0x00b4
            java.lang.String r7 = ".png"
            java.lang.String r5 = r5.concat(r7)
            goto L_0x00b5
        L_0x00b4:
            r5 = r2
        L_0x00b5:
            java.lang.String r7 = r11.zzB()
            if (r7 == 0) goto L_0x00c4
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            goto L_0x00c5
        L_0x00c4:
            r7 = r2
        L_0x00c5:
            java.lang.String r8 = r11.zzA()
            r0.setAddress(r8)
            r0.setAddressComponents(r12)
            java.lang.String r12 = r11.zzz()
            com.google.android.libraries.places.internal.zzkk r8 = zza
            java.lang.Object r12 = r8.getOrDefault(r12, r2)
            com.google.android.libraries.places.api.model.Place$BusinessStatus r12 = (com.google.android.libraries.places.api.model.Place.BusinessStatus) r12
            r0.setBusinessStatus(r12)
            java.lang.Boolean r12 = r11.zzj()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setCurbsidePickup(r12)
            com.google.android.libraries.places.internal.zzgj$zzd r12 = r11.zzc()
            com.google.android.libraries.places.api.model.OpeningHours r12 = zzi(r12)
            r0.setCurrentOpeningHours(r12)
            java.lang.Boolean r12 = r11.zzk()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setDelivery(r12)
            java.lang.Boolean r12 = r11.zzl()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setDineIn(r12)
            com.google.android.libraries.places.internal.zzgj$zzb r12 = r11.zza()
            if (r12 != 0) goto L_0x0112
            r12 = r2
            goto L_0x0116
        L_0x0112:
            java.lang.String r12 = r12.zzb()
        L_0x0116:
            r0.setEditorialSummary(r12)
            com.google.android.libraries.places.internal.zzgj$zzb r12 = r11.zza()
            if (r12 != 0) goto L_0x0121
            r12 = r2
            goto L_0x0125
        L_0x0121:
            java.lang.String r12 = r12.zza()
        L_0x0125:
            r0.setEditorialSummaryLanguageCode(r12)
            r0.setIconBackgroundColor(r7)
            r0.setIconUrl(r5)
            java.lang.String r12 = r11.zzF()
            r0.setId(r12)
            r0.setLatLng(r4)
            java.lang.String r12 = r11.zzE()
            r0.setName(r12)
            com.google.android.libraries.places.internal.zzgj$zzd r12 = r11.zzd()
            com.google.android.libraries.places.api.model.OpeningHours r12 = zzi(r12)
            r0.setOpeningHours(r12)
            java.lang.String r12 = r11.zzD()
            r0.setPhoneNumber(r12)
            com.google.android.libraries.places.internal.zzkh r12 = r11.zzg()
            if (r12 == 0) goto L_0x01cc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.libraries.places.internal.zzlf r12 = r12.listIterator(r1)
        L_0x0160:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x01cd
            java.lang.Object r5 = r12.next()
            com.google.android.libraries.places.internal.zzgj$zze r5 = (com.google.android.libraries.places.internal.zzgj.zze) r5
            if (r5 != 0) goto L_0x0170
            r5 = r2
            goto L_0x01c1
        L_0x0170:
            java.lang.String r7 = r5.zzd()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x01c5
            java.lang.Integer r8 = r5.zzb()
            java.lang.Integer r9 = r5.zzc()
            com.google.android.libraries.places.api.model.PhotoMetadata$Builder r7 = com.google.android.libraries.places.api.model.PhotoMetadata.builder(r7)
            com.google.android.libraries.places.internal.zzkh r5 = r5.zza()
            if (r5 == 0) goto L_0x01a2
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L_0x0193
            goto L_0x01a2
        L_0x0193:
            java.lang.String r10 = ", "
            com.google.android.libraries.places.internal.zzjk r10 = com.google.android.libraries.places.internal.zzjk.zzb(r10)
            com.google.android.libraries.places.internal.zzjk r10 = r10.zzc()
            java.lang.String r5 = r10.zze(r5)
            goto L_0x01a4
        L_0x01a2:
            java.lang.String r5 = ""
        L_0x01a4:
            r7.setAttributions(r5)
            if (r8 != 0) goto L_0x01ab
            r5 = r1
            goto L_0x01af
        L_0x01ab:
            int r5 = r8.intValue()
        L_0x01af:
            r7.setHeight(r5)
            if (r9 != 0) goto L_0x01b6
            r5 = r1
            goto L_0x01ba
        L_0x01b6:
            int r5 = r9.intValue()
        L_0x01ba:
            r7.setWidth(r5)
            com.google.android.libraries.places.api.model.PhotoMetadata r5 = r7.build()
        L_0x01c1:
            zzj(r4, r5)
            goto L_0x0160
        L_0x01c5:
            java.lang.String r11 = "Photo reference not provided for a PhotoMetadata result."
            com.google.android.gms.common.api.b r11 = zzg(r11)
            throw r11
        L_0x01cc:
            r4 = r2
        L_0x01cd:
            r0.setPhotoMetadatas(r4)
            com.google.android.libraries.places.internal.zzgj$zzf r12 = r11.zze()
            if (r12 != 0) goto L_0x01d8
            r12 = r2
            goto L_0x01ee
        L_0x01d8:
            com.google.android.libraries.places.api.model.PlusCode$Builder r4 = com.google.android.libraries.places.api.model.PlusCode.builder()
            java.lang.String r5 = r12.zza()
            r4.setCompoundCode(r5)
            java.lang.String r12 = r12.zzb()
            r4.setGlobalCode(r12)
            com.google.android.libraries.places.api.model.PlusCode r12 = r4.build()
        L_0x01ee:
            r0.setPlusCode(r12)
            java.lang.Integer r12 = r11.zzw()
            r0.setPriceLevel(r12)
            java.lang.Double r12 = r11.zzv()
            r0.setRating(r12)
            java.lang.Boolean r12 = r11.zzm()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setReservable(r12)
            com.google.android.libraries.places.internal.zzkh r12 = r11.zzh()
            if (r12 == 0) goto L_0x0235
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.libraries.places.internal.zzlf r12 = r12.listIterator(r1)
        L_0x0219:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x022d
            java.lang.Object r1 = r12.next()
            com.google.android.libraries.places.internal.zzgj$zzd r1 = (com.google.android.libraries.places.internal.zzgj.zzd) r1
            com.google.android.libraries.places.api.model.OpeningHours r1 = zzi(r1)
            zzj(r4, r1)
            goto L_0x0219
        L_0x022d:
            boolean r12 = r4.isEmpty()
            if (r12 == 0) goto L_0x0234
            goto L_0x0235
        L_0x0234:
            r2 = r4
        L_0x0235:
            r0.setSecondaryOpeningHours(r2)
            java.lang.Boolean r12 = r11.zzn()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesBeer(r12)
            java.lang.Boolean r12 = r11.zzo()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesBreakfast(r12)
            java.lang.Boolean r12 = r11.zzo()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesBrunch(r12)
            java.lang.Boolean r12 = r11.zzp()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesDinner(r12)
            java.lang.Boolean r12 = r11.zzq()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesLunch(r12)
            java.lang.Boolean r12 = r11.zzr()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesVegetarianFood(r12)
            java.lang.Boolean r12 = r11.zzs()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setServesWine(r12)
            java.lang.Boolean r12 = r11.zzt()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r12 = zzb(r12)
            r0.setTakeout(r12)
            com.google.android.libraries.places.internal.zzkh r12 = r11.zzi()
            java.util.List r12 = zze(r12)
            r0.setTypes(r12)
            java.lang.Integer r12 = r11.zzx()
            r0.setUserRatingsTotal(r12)
            java.lang.Integer r12 = r11.zzy()
            r0.setUtcOffsetMinutes(r12)
            r0.setViewport(r6)
            r0.setWebsiteUri(r3)
            java.lang.Boolean r11 = r11.zzu()
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r11 = zzb(r11)
            r0.setWheelchairAccessibleEntrance(r11)
        L_0x02ba:
            com.google.android.libraries.places.api.model.Place r11 = r0.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzgg.zzf(com.google.android.libraries.places.internal.zzgj, java.util.List):com.google.android.libraries.places.api.model.Place");
    }

    private static b zzg(String str) {
        return new b(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static LatLng zzh(zzgj.zzc.zza zza2) {
        if (zza2 == null) {
            return null;
        }
        Double zza3 = zza2.zza();
        Double zzb2 = zza2.zzb();
        if (zza3 == null || zzb2 == null) {
            return null;
        }
        return new LatLng(zza3.doubleValue(), zzb2.doubleValue());
    }

    private static OpeningHours zzi(zzgj.zzd zzd) {
        ArrayList arrayList;
        SpecialDay specialDay;
        Period period;
        if (zzd == null) {
            return null;
        }
        OpeningHours.Builder builder = OpeningHours.builder();
        zzkh zza2 = zzd.zza();
        if (zza2 != null) {
            arrayList = new ArrayList();
            zzlf zzp = zza2.listIterator(0);
            while (zzp.hasNext()) {
                zzgj.zzd.zza zza3 = (zzgj.zzd.zza) zzp.next();
                if (zza3 != null) {
                    Period.Builder builder2 = Period.builder();
                    builder2.setOpen(zzc(zza3.zzb()));
                    builder2.setClose(zzc(zza3.zza()));
                    period = builder2.build();
                } else {
                    period = null;
                }
                zzj(arrayList, period);
            }
        } else {
            arrayList = null;
        }
        builder.setPeriods(zzd(arrayList));
        builder.setWeekdayText(zzd(zzd.zzc()));
        builder.setHoursType((OpeningHours.HoursType) zzc.getOrDefault(zzd.zzd(), (Object) null));
        zzkh zzb2 = zzd.zzb();
        ArrayList arrayList2 = new ArrayList();
        if (zzb2 != null) {
            zzlf zzp2 = zzb2.listIterator(0);
            while (zzp2.hasNext()) {
                zzgj.zzd.zzb zzb3 = (zzgj.zzd.zzb) zzp2.next();
                if (zzb3 != null) {
                    try {
                        LocalDate zza4 = zza(zzb3.zzb());
                        if (zza4 != null) {
                            SpecialDay.Builder builder3 = SpecialDay.builder(zza4);
                            builder3.setExceptional(Boolean.TRUE.equals(zzb3.zza()));
                            specialDay = builder3.build();
                            zzj(arrayList2, specialDay);
                        } else {
                            throw null;
                        }
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                }
                specialDay = null;
                zzj(arrayList2, specialDay);
            }
        }
        builder.setSpecialDays(arrayList2);
        return builder.build();
    }

    private static boolean zzj(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }
}
