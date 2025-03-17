package com.oppwa.mobile.connect.provider.threeds.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.EnumSet;
import java.util.Iterator;

public enum ChallengeUiType implements Parcelable {
    TEXT(1),
    SINGLE_SELECT(2),
    MULTI_SELECT(4),
    OOB(8),
    HTML(16);
    
    public static final Parcelable.Creator<ChallengeUiType> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f122134a;

    class a implements Parcelable.Creator<ChallengeUiType> {
        a() {
        }

        /* renamed from: a */
        public ChallengeUiType createFromParcel(Parcel parcel) {
            return ChallengeUiType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public ChallengeUiType[] newArray(int i10) {
            return new ChallengeUiType[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    private ChallengeUiType(int i10) {
        this.f122134a = i10;
    }

    public static int toInt(EnumSet<ChallengeUiType> enumSet) {
        Iterator<ChallengeUiType> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().f122134a;
        }
        return i10;
    }

    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.f122134a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
