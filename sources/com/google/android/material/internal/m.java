package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public class m extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    class a implements Parcelable.ClassLoaderCreator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new m(parcel, classLoader);
        }

        /* renamed from: c */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = keyAt(i11);
            parcelableArr[i11] = (Parcelable) valueAt(i11);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }

    public m(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(iArr[i10], readParcelableArray[i10]);
        }
    }
}
