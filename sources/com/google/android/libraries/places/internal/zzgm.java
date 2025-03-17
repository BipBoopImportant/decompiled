package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzgm {
    private static final zzkk zza;

    static {
        zzkj zzkj = new zzkj();
        zzkj.zza(Place.Field.ADDRESS, "formatted_address");
        zzkj.zza(Place.Field.ADDRESS_COMPONENTS, "address_components");
        zzkj.zza(Place.Field.BUSINESS_STATUS, "business_status");
        zzkj.zza(Place.Field.CURBSIDE_PICKUP, "curbside_pickup");
        zzkj.zza(Place.Field.CURRENT_OPENING_HOURS, "current_opening_hours");
        zzkj.zza(Place.Field.DELIVERY, "delivery");
        zzkj.zza(Place.Field.DINE_IN, "dine_in");
        zzkj.zza(Place.Field.EDITORIAL_SUMMARY, "editorial_summary");
        zzkj.zza(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color");
        zzkj.zza(Place.Field.ICON_URL, "icon_mask_base_uri");
        zzkj.zza(Place.Field.ID, "place_id");
        zzkj.zza(Place.Field.LAT_LNG, "geometry/location");
        zzkj.zza(Place.Field.NAME, "name");
        zzkj.zza(Place.Field.OPENING_HOURS, "opening_hours");
        zzkj.zza(Place.Field.PHONE_NUMBER, "international_phone_number");
        zzkj.zza(Place.Field.PHOTO_METADATAS, "photos");
        zzkj.zza(Place.Field.PLUS_CODE, PlaceTypes.PLUS_CODE);
        zzkj.zza(Place.Field.PRICE_LEVEL, "price_level");
        zzkj.zza(Place.Field.RATING, "rating");
        zzkj.zza(Place.Field.RESERVABLE, "reservable");
        zzkj.zza(Place.Field.SECONDARY_OPENING_HOURS, "secondary_opening_hours");
        zzkj.zza(Place.Field.SERVES_BEER, "serves_beer");
        zzkj.zza(Place.Field.SERVES_BREAKFAST, "serves_breakfast");
        zzkj.zza(Place.Field.SERVES_BRUNCH, "serves_brunch");
        zzkj.zza(Place.Field.SERVES_DINNER, "serves_dinner");
        zzkj.zza(Place.Field.SERVES_LUNCH, "serves_lunch");
        zzkj.zza(Place.Field.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food");
        zzkj.zza(Place.Field.SERVES_WINE, "serves_wine");
        zzkj.zza(Place.Field.TAKEOUT, "takeout");
        zzkj.zza(Place.Field.TYPES, "types");
        zzkj.zza(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total");
        zzkj.zza(Place.Field.UTC_OFFSET, "utc_offset");
        zzkj.zza(Place.Field.VIEWPORT, "geometry/viewport");
        zzkj.zza(Place.Field.WEBSITE_URI, "website");
        zzkj.zza(Place.Field.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance");
        zza = zzkj.zzb();
    }

    public static String zza(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static List zzb(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
