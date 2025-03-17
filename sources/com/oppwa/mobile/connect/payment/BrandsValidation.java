package com.oppwa.mobile.connect.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.oppwa.mobile.connect.provider.parser.BrandsValidationResponseParser;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONException;
import org.json.JSONObject;

public class BrandsValidation implements Parcelable {
    public static final Parcelable.Creator<BrandsValidation> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final String f121696f = "com.oppwa.mobile.connect.payment.BrandsValidation";

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f121697a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, BrandInfo> f121698b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f121699c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Pattern> f121700d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Pattern> f121701e;

    public static class Filter {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, BrandInfo> f121702a;

        public Filter(Map<String, BrandInfo> map) {
            this.f121702a = map;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ BrandInfo a(BrandInfo brandInfo) {
            return brandInfo;
        }

        public Map<String, BrandInfo> filter(String[] strArr) {
            Stream of2 = Stream.of(strArr);
            Map<String, BrandInfo> map = this.f121702a;
            Objects.requireNonNull(map);
            return (Map) of2.map(new j(map)).filter(new k()).collect(Collectors.toMap(new l(), new m(), new n(), new o()));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ BrandInfo a(BrandInfo brandInfo, BrandInfo brandInfo2) {
            throw new IllegalStateException("Unexpected merge conflict");
        }
    }

    class a implements Parcelable.Creator<BrandsValidation> {
        a() {
        }

        /* renamed from: a */
        public BrandsValidation createFromParcel(Parcel parcel) {
            return new BrandsValidation(parcel);
        }

        /* renamed from: a */
        public BrandsValidation[] newArray(int i10) {
            return new BrandsValidation[i10];
        }
    }

    public BrandsValidation(Map<String, BrandInfo> map) {
        this.f121697a = new LinkedHashSet();
        new LinkedHashMap();
        this.f121698b = map;
        a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Pattern a(String str, Map map) {
        return (Pattern) map.get(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Pattern b(String str, Map map) {
        return (Pattern) map.get(str);
    }

    @Deprecated
    public static BrandsValidation createFromJson(JSONObject jSONObject, String[] strArr) {
        try {
            return new BrandsValidation(new Filter((Map) new BrandsValidationResponseParser().parse(jSONObject.toString())).filter(strArr));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new JSONException(e10.getMessage());
        }
    }

    public int describeContents() {
        return 0;
    }

    public Set<String> detectCardBrandsByRegex(String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f121697a) {
            Pattern c10 = c(next);
            if (c10 != null && c10.matcher(str).find()) {
                arrayList.add(next);
            }
        }
        return new LinkedHashSet(a((List<String>) arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f121698b, ((BrandsValidation) obj).f121698b);
    }

    public String[] filterOutUnconfiguredBrands(String[] strArr) {
        List asList = Arrays.asList(strArr);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f121697a) {
            if (asList.contains(next)) {
                arrayList.add(next);
            }
        }
        return (String[]) a((List<String>) arrayList).toArray(new String[0]);
    }

    public List<String> getBrandDetectionPriority() {
        if (this.f121699c != null) {
            return new ArrayList(this.f121699c);
        }
        return null;
    }

    public Map<String, BrandInfo> getBrandInfoMap() {
        return this.f121698b;
    }

    public CardBrandInfo getCardBrandInfo(String str) {
        return (CardBrandInfo) Optional.ofNullable(b(str)).map(new h()).orElse(new CardBrandInfo());
    }

    public Pattern getCardValidationPattern(String str) {
        return (Pattern) Optional.ofNullable(this.f121701e).map(new i(str)).orElse((Object) null);
    }

    public List<String> getDetectedCardBrands(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String next : this.f121697a) {
            Pattern c10 = c(next);
            if (c10 == null) {
                arrayList2.add(next);
            } else if (c10.matcher(str).find()) {
                arrayList.add(next);
            }
        }
        if (str2.equalsIgnoreCase("CARD")) {
            arrayList.addAll(arrayList2);
        }
        return a((List<String>) arrayList);
    }

    public Bundle getLabels() {
        Bundle bundle = new Bundle();
        for (String next : this.f121698b.keySet()) {
            Optional.ofNullable(this.f121698b.get(next)).ifPresent(new e(bundle, next));
        }
        return bundle;
    }

    public int hashCode() {
        return Objects.hashCode(this.f121698b);
    }

    public boolean isCardBrand(String str) {
        if (str.equalsIgnoreCase("CARD")) {
            return true;
        }
        return ((Boolean) Optional.ofNullable(b(str)).map(new f()).orElse(Boolean.FALSE)).booleanValue();
    }

    public void setBrandDetectionPriority(List<String> list) {
        if (list != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f121699c = linkedHashSet;
            linkedHashSet.addAll(list);
            this.f121699c.addAll(this.f121697a);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f121698b.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (Map.Entry next : this.f121698b.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeParcelable((Parcelable) next.getValue(), 0);
            }
        }
    }

    private BrandInfo b(String str) {
        return this.f121698b.get(str);
    }

    private Pattern c(String str) {
        return (Pattern) Optional.ofNullable(this.f121700d).map(new g(str)).orElse((Object) null);
    }

    private List<String> a(List<String> list) {
        Set<String> set = this.f121699c;
        if (set == null || set.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : this.f121699c) {
            if (list.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    protected BrandsValidation(Parcel parcel) {
        this.f121697a = new LinkedHashSet();
        this.f121698b = new LinkedHashMap();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f121698b = new LinkedHashMap();
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f121698b.put(parcel.readString(), (BrandInfo) parcel.readParcelable(BrandInfo.class.getClassLoader()));
            }
            a();
        }
    }

    private void a() {
        this.f121700d = new LinkedHashMap();
        this.f121701e = new LinkedHashMap();
        for (String next : this.f121698b.keySet()) {
            BrandInfo brandInfo = this.f121698b.get(next);
            if (!(brandInfo == null || !brandInfo.isCardBrand() || brandInfo.getCardBrandInfo() == null)) {
                this.f121697a.add(next);
                String detection = brandInfo.getCardBrandInfo().getDetection();
                if (detection != null && !detection.isEmpty()) {
                    this.f121700d.put(next, a(detection));
                }
                String validation = brandInfo.getCardBrandInfo().getValidation();
                if (!validation.isEmpty()) {
                    this.f121701e.put(next, a(validation));
                }
            }
        }
    }

    private Pattern a(String str) {
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException e10) {
            String str2 = f121696f;
            Log.w(str2, "Invalid regex '" + str + "' was ignored. " + e10.getDescription());
            return null;
        }
    }
}
