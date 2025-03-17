package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.bankaccount.IdealPaymentParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.h  reason: case insensitive filesystem */
class C14072h {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f121245a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f121246b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f121247c;

    static {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(Locale.getISOCountries()));
        ArrayList arrayList2 = new ArrayList();
        for (String locale : arrayList) {
            arrayList2.add(new Locale("", locale));
        }
        f121245a = a(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f121246b = linkedHashMap;
        linkedHashMap.put("AL", "Alabama");
        linkedHashMap.put("AK", "Alaska");
        linkedHashMap.put("AZ", "Arizona");
        linkedHashMap.put("AR", "Arkansas");
        linkedHashMap.put("CA", "California");
        linkedHashMap.put("CO", "Colorado");
        linkedHashMap.put("CT", "Connecticut");
        linkedHashMap.put("DE", "Delaware");
        linkedHashMap.put("DC", "District Of Columbia");
        linkedHashMap.put("FL", "Florida");
        linkedHashMap.put("GA", "Georgia");
        linkedHashMap.put("HI", "Hawaii");
        linkedHashMap.put("ID", "Idaho");
        linkedHashMap.put("IL", "Illinois");
        linkedHashMap.put("IN", "Indiana");
        linkedHashMap.put("IA", "Iowa");
        linkedHashMap.put("KS", "Kansas");
        linkedHashMap.put("KY", "Kentucky");
        linkedHashMap.put("LA", "Louisiana");
        linkedHashMap.put("ME", "Maine");
        linkedHashMap.put("MD", "Maryland");
        linkedHashMap.put("MA", "Massachusetts");
        linkedHashMap.put("MI", "Michigan");
        linkedHashMap.put("MN", "Minnesota");
        linkedHashMap.put("MS", "Mississippi");
        linkedHashMap.put("MO", "Missouri");
        linkedHashMap.put("MT", "Montana");
        linkedHashMap.put("NE", "Nebraska");
        linkedHashMap.put("NV", "Nevada");
        linkedHashMap.put("NH", "New Hampshire");
        linkedHashMap.put("NJ", "New Jersey");
        linkedHashMap.put("NM", "New Mexico");
        linkedHashMap.put("NY", "New York");
        linkedHashMap.put("NC", "North Carolina");
        linkedHashMap.put("ND", "North Dakota");
        linkedHashMap.put("OH", "Ohio");
        linkedHashMap.put("OK", "Oklahoma");
        linkedHashMap.put("OR", "Oregon");
        linkedHashMap.put("PA", "Pennsylvania");
        linkedHashMap.put("RI", "Rhode Island");
        linkedHashMap.put("SC", "South Carolina");
        linkedHashMap.put("SD", "South Dakota");
        linkedHashMap.put("TN", "Tennessee");
        linkedHashMap.put("TX", "Texas");
        linkedHashMap.put("UT", "Utah");
        linkedHashMap.put("VT", "Vermont");
        linkedHashMap.put("VA", "Virginia");
        linkedHashMap.put("WA", "Washington");
        linkedHashMap.put("WV", "West Virginia");
        linkedHashMap.put("WI", "Wisconsin");
        linkedHashMap.put("WY", "Wyoming");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f121247c = linkedHashMap2;
        linkedHashMap2.put("AB", "Alberta");
        linkedHashMap2.put("BC", "British Columbia");
        linkedHashMap2.put("MB", "Manitoba");
        linkedHashMap2.put("NB", "New Brunswick");
        linkedHashMap2.put(IdealPaymentParams.DEFAULT_COUNTRY, "Newfoundland and Labrador");
        linkedHashMap2.put("NS", "Nova Scotia");
        linkedHashMap2.put("ON", "Ontario");
        linkedHashMap2.put("PE", "Prince Edward Island");
        linkedHashMap2.put("QC", "Quebec");
        linkedHashMap2.put("SK", "Saskatchewan");
        linkedHashMap2.put("NT", "Northwest Territories");
        linkedHashMap2.put("NU", "Nunavut");
        linkedHashMap2.put("YT", "Yukon");
    }

    private static Map<String, String> a(List<Locale> list) {
        Collections.sort(list, new x2());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Locale next : list) {
            linkedHashMap.put(next.getCountry(), next.getDisplayCountry());
        }
        return linkedHashMap;
    }

    static Map<String, String> c() {
        return f121246b;
    }

    static Map<String, String> b() {
        return f121245a;
    }

    static Map<String, String> a() {
        return f121247c;
    }
}
