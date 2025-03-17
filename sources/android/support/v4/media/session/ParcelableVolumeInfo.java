package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f15221a;

    /* renamed from: b  reason: collision with root package name */
    public int f15222b;

    /* renamed from: c  reason: collision with root package name */
    public int f15223c;

    /* renamed from: d  reason: collision with root package name */
    public int f15224d;

    /* renamed from: e  reason: collision with root package name */
    public int f15225e;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f15221a = parcel.readInt();
        this.f15223c = parcel.readInt();
        this.f15224d = parcel.readInt();
        this.f15225e = parcel.readInt();
        this.f15222b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15221a);
        parcel.writeInt(this.f15223c);
        parcel.writeInt(this.f15224d);
        parcel.writeInt(this.f15225e);
        parcel.writeInt(this.f15222b);
    }
}
