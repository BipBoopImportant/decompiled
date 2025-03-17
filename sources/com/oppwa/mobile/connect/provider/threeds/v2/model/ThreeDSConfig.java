package com.oppwa.mobile.connect.provider.threeds.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.ParcelUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import rE.C15001f;

public class ThreeDSConfig implements Parcelable {
    public static final Parcelable.Creator<ThreeDSConfig> CREATOR = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final EnumSet<ChallengeUiType> f122135a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f122136b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f122137c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C15001f f122138d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final String f122139e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String[] f122140f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f122141g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String[] f122142h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String[] f122143i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final boolean f122144j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final boolean f122145k;

    class a implements Parcelable.Creator<ThreeDSConfig> {
        a() {
        }

        /* renamed from: a */
        public ThreeDSConfig createFromParcel(Parcel parcel) {
            return new ThreeDSConfig(parcel, (a) null);
        }

        /* renamed from: a */
        public ThreeDSConfig[] newArray(int i10) {
            return new ThreeDSConfig[i10];
        }
    }

    /* synthetic */ ThreeDSConfig(Parcel parcel, a aVar) {
        this(parcel);
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
        ThreeDSConfig threeDSConfig = (ThreeDSConfig) obj;
        return Objects.equals(this.f122135a, threeDSConfig.f122135a) && this.f122136b == threeDSConfig.f122136b && Objects.equals(this.f122137c, threeDSConfig.f122137c) && Objects.equals(this.f122138d, threeDSConfig.f122138d) && Objects.equals(this.f122139e, threeDSConfig.f122139e) && Arrays.equals(this.f122140f, threeDSConfig.f122140f) && Objects.equals(this.f122141g, threeDSConfig.f122141g) && Arrays.equals(this.f122142h, threeDSConfig.f122142h) && Arrays.equals(this.f122143i, threeDSConfig.f122143i) && this.f122144j == threeDSConfig.f122144j && this.f122145k == threeDSConfig.f122145k;
    }

    public String getAppSignature() {
        return this.f122141g;
    }

    public EnumSet<ChallengeUiType> getChallengeUiTypes() {
        return this.f122135a;
    }

    public String getClientConfigParam(String str) {
        return this.f122137c.get(str);
    }

    public Map<String, String> getClientConfigParams() {
        return this.f122137c;
    }

    public String[] getDeviceParameterBlacklist() {
        return this.f122140f;
    }

    public String getLocale() {
        return this.f122139e;
    }

    public String[] getMaliciousApps() {
        return this.f122143i;
    }

    public int getSdkMaxTimeout() {
        return this.f122136b;
    }

    public String[] getTrustedAppStores() {
        return this.f122142h;
    }

    public C15001f getUiCustomization() {
        return this.f122138d;
    }

    public int hashCode() {
        return (((((((((Objects.hash(new Object[]{this.f122135a, Integer.valueOf(this.f122136b), this.f122137c, this.f122138d, this.f122139e, this.f122141g}) * 31) + Arrays.hashCode(this.f122140f)) * 31) + Arrays.hashCode(this.f122142h)) * 31) + Arrays.hashCode(this.f122143i)) * 31) + (this.f122144j ? 1 : 0)) * 31) + (this.f122145k ? 1 : 0);
    }

    public boolean isBrowserDataRequired() {
        return this.f122145k;
    }

    public boolean isThreeDSRequestorAppUrlUsed() {
        return this.f122144j;
    }

    public String toString() {
        return "ThreeDSConfig {\n\tchallengeUiTypes=" + this.f122135a + "\n\tsdkMaxTimeout=" + this.f122136b + "\n\tclientConfigParams=" + this.f122137c + "\n\tuiCustomization=" + this.f122138d + "\n\tlocale=" + this.f122139e + "\n\tdeviceParameterBlacklist=" + Arrays.toString(this.f122140f) + "\n\tappSignature=" + this.f122141g + "\n\ttrustedAppStores=" + Arrays.toString(this.f122142h) + "\n\tmaliciousApps=" + Arrays.toString(this.f122143i) + "\n\tisThreeDSRequestorAppUrlUsed=" + this.f122144j + "\n\tisBrowserDataRequired=" + this.f122145k + "\n}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f122135a.size());
        Iterator<ChallengeUiType> it = this.f122135a.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), 0);
        }
        parcel.writeInt(this.f122136b);
        ParcelUtils.writeStringMap(parcel, this.f122137c);
        parcel.writeParcelable(this.f122138d, i10);
        parcel.writeString(this.f122139e);
        parcel.writeStringArray(this.f122140f);
        parcel.writeString(this.f122141g);
        parcel.writeStringArray(this.f122142h);
        parcel.writeStringArray(this.f122143i);
        parcel.writeByte(this.f122144j ? (byte) 1 : 0);
        parcel.writeByte(this.f122145k ? (byte) 1 : 0);
    }

    public ThreeDSConfig(Builder builder) {
        this.f122135a = builder.f122146a;
        this.f122136b = builder.f122147b;
        this.f122137c = builder.f122148c;
        this.f122138d = builder.f122149d;
        this.f122139e = builder.f122150e;
        this.f122140f = builder.f122151f;
        this.f122141g = builder.f122152g;
        this.f122142h = builder.f122153h;
        this.f122143i = builder.f122154i;
        this.f122144j = builder.f122155j;
        this.f122145k = builder.f122156k;
    }

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public EnumSet<ChallengeUiType> f122146a = EnumSet.allOf(ChallengeUiType.class);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f122147b = 5;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f122148c = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C15001f f122149d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f122150e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String[] f122151f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f122152g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String[] f122153h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public String[] f122154i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f122155j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f122156k;

        public Builder() {
        }

        public Builder addClientConfigParam(String str, String str2) {
            this.f122148c.put(str, str2);
            return this;
        }

        public ThreeDSConfig build() {
            return new ThreeDSConfig(this);
        }

        public Builder setAppSignature(String str) {
            this.f122152g = str;
            return this;
        }

        public Builder setBrowserDataRequired(boolean z10) {
            this.f122156k = z10;
            return this;
        }

        public Builder setChallengeUiTypes(EnumSet<ChallengeUiType> enumSet) {
            this.f122146a = enumSet;
            return this;
        }

        public Builder setDeviceParameterBlacklist(String[] strArr) {
            this.f122151f = strArr;
            return this;
        }

        public Builder setLocale(String str) {
            this.f122150e = str;
            return this;
        }

        public Builder setMaliciousApps(String[] strArr) {
            this.f122154i = strArr;
            return this;
        }

        public Builder setSdkMaxTimeout(int i10) {
            this.f122147b = i10;
            return this;
        }

        public Builder setThreeDSRequestorAppUrlUsed(boolean z10) {
            this.f122155j = z10;
            return this;
        }

        public Builder setTrustedAppStores(String[] strArr) {
            this.f122153h = strArr;
            return this;
        }

        public Builder setUiCustomization(C15001f fVar) {
            this.f122149d = fVar;
            return this;
        }

        public Builder(ThreeDSConfig threeDSConfig) {
            if (threeDSConfig != null) {
                this.f122146a = threeDSConfig.f122135a;
                this.f122147b = threeDSConfig.f122136b;
                this.f122148c = threeDSConfig.f122137c;
                this.f122149d = threeDSConfig.f122138d;
                this.f122150e = threeDSConfig.f122139e;
                this.f122151f = threeDSConfig.f122140f;
                this.f122152g = threeDSConfig.f122141g;
                this.f122153h = threeDSConfig.f122142h;
                this.f122154i = threeDSConfig.f122143i;
                this.f122155j = threeDSConfig.f122144j;
                this.f122156k = threeDSConfig.f122145k;
            }
        }
    }

    private ThreeDSConfig(Parcel parcel) {
        int readInt = parcel.readInt();
        Class<ChallengeUiType> cls = ChallengeUiType.class;
        this.f122135a = EnumSet.noneOf(cls);
        boolean z10 = false;
        if (readInt > 0) {
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f122135a.add((ChallengeUiType) parcel.readParcelable(cls.getClassLoader()));
            }
        }
        this.f122136b = parcel.readInt();
        this.f122137c = ParcelUtils.readStringMap(parcel);
        this.f122138d = (C15001f) parcel.readParcelable(C15001f.class.getClassLoader());
        this.f122139e = parcel.readString();
        this.f122140f = parcel.createStringArray();
        this.f122141g = parcel.readString();
        this.f122142h = parcel.createStringArray();
        this.f122143i = parcel.createStringArray();
        this.f122144j = parcel.readByte() != 0;
        this.f122145k = parcel.readByte() != 0 ? true : z10;
    }
}
