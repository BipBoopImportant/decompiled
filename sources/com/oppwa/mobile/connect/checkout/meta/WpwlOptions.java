package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.ParcelUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class WpwlOptions implements Parcelable {
    public static final Parcelable.Creator<WpwlOptions> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f121455a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f121456b;

    class a implements Parcelable.Creator<WpwlOptions> {
        a() {
        }

        /* renamed from: a */
        public WpwlOptions createFromParcel(Parcel parcel) {
            return new WpwlOptions(parcel);
        }

        /* renamed from: a */
        public WpwlOptions[] newArray(int i10) {
            return new WpwlOptions[i10];
        }
    }

    public WpwlOptions() {
        this.f121455a = new HashMap();
        this.f121456b = new HashMap();
    }

    private void a(List<String> list) {
        for (Map.Entry next : this.f121456b.entrySet()) {
            list.add(String.format("%s: %s", new Object[]{next.getKey(), next.getValue()}));
        }
    }

    private void b(List<String> list) {
        for (Map.Entry next : this.f121455a.entrySet()) {
            if (next.getValue().getClass().isArray()) {
                list.add(a((String) next.getKey(), next.getValue()));
            } else if (next.getValue() instanceof String) {
                list.add(c((String) next.getKey(), next.getValue()));
            } else {
                list.add(b((String) next.getKey(), next.getValue()));
            }
        }
    }

    private String c(String str, Object obj) {
        return String.format("%s: \"%s\"", new Object[]{str, obj});
    }

    public WpwlOptions addJSFunction(String str, String str2) {
        this.f121456b.put(str, str2);
        return this;
    }

    public WpwlOptions addValue(String str, Object obj) {
        this.f121455a.put(str, obj);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WpwlOptions wpwlOptions = (WpwlOptions) obj;
        if (!Objects.equals(this.f121456b, wpwlOptions.f121456b) || !Objects.equals(this.f121455a.keySet(), wpwlOptions.f121455a.keySet())) {
            return false;
        }
        for (Map.Entry next : this.f121455a.entrySet()) {
            if (next.getValue().getClass().isArray()) {
                if (!Arrays.equals((Object[]) next.getValue(), (Object[]) wpwlOptions.f121455a.get(next.getKey()))) {
                    return false;
                }
            } else if (!Objects.equals(next.getValue(), wpwlOptions.f121455a.get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public String getJSFunction(String str) {
        return this.f121456b.get(str);
    }

    public Object getValue(String str) {
        return this.f121455a.get(str);
    }

    public String getWpwlConfigurations() {
        ArrayList arrayList = new ArrayList();
        try {
            b(arrayList);
            a((List<String>) arrayList);
            return String.format("{ \n%s\n }", new Object[]{TextUtils.join(",\n", arrayList)});
        } catch (Exception e10) {
            Logger.error("WpwlOptions", "Error while processing WPWL config", e10);
            return "{}";
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121455a, this.f121456b});
    }

    public String toString() {
        return getWpwlConfigurations();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeMap(this.f121455a);
        ParcelUtils.writeStringMap(parcel, this.f121456b);
    }

    private String a(String str, Object obj) {
        return String.format("%s: %s", new Object[]{str, a((Object[]) obj)});
    }

    protected WpwlOptions(Parcel parcel) {
        HashMap hashMap = new HashMap();
        this.f121455a = hashMap;
        parcel.readMap(hashMap, getClass().getClassLoader());
        Map<String, String> readStringMap = ParcelUtils.readStringMap(parcel);
        this.f121456b = readStringMap == null ? new HashMap<>() : readStringMap;
    }

    private String a(Object[] objArr) {
        String join = TextUtils.join("\",\"", objArr);
        if (!join.isEmpty()) {
            return String.format("[\"%s\"]", new Object[]{join});
        }
        return "[]";
    }

    private String b(String str, Object obj) {
        return String.format("%s: %s", new Object[]{str, obj});
    }
}
