package com.oppwa.mobile.connect.payment.processor.affirm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class AffirmConfig implements Parcelable {
    public static final Parcelable.Creator<AffirmConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121887a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f121888b;

    class a implements Parcelable.Creator<AffirmConfig> {
        a() {
        }

        /* renamed from: a */
        public AffirmConfig createFromParcel(Parcel parcel) {
            return new AffirmConfig(parcel);
        }

        /* renamed from: a */
        public AffirmConfig[] newArray(int i10) {
            return new AffirmConfig[i10];
        }
    }

    public AffirmConfig(String str, boolean z10) {
        this.f121887a = str;
        this.f121888b = z10;
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
        AffirmConfig affirmConfig = (AffirmConfig) obj;
        return this.f121888b == affirmConfig.f121888b && Objects.equals(this.f121887a, affirmConfig.f121887a);
    }

    public String getPublicKey() {
        return this.f121887a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121887a, Boolean.valueOf(this.f121888b)});
    }

    public boolean isVcnEnabled() {
        return this.f121888b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121887a);
        parcel.writeByte(this.f121888b ? (byte) 1 : 0);
    }

    protected AffirmConfig(Parcel parcel) {
        this.f121887a = parcel.readString();
        this.f121888b = parcel.readByte() != 0;
    }
}
