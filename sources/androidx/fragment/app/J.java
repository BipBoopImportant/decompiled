package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<String> f21884a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f21885b;

    /* renamed from: c  reason: collision with root package name */
    C5174b[] f21886c;

    /* renamed from: d  reason: collision with root package name */
    int f21887d;

    /* renamed from: e  reason: collision with root package name */
    String f21888e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f21889f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<C5175c> f21890g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<FragmentManager.n> f21891h;

    class a implements Parcelable.Creator<J> {
        a() {
        }

        /* renamed from: a */
        public J createFromParcel(Parcel parcel) {
            return new J(parcel);
        }

        /* renamed from: b */
        public J[] newArray(int i10) {
            return new J[i10];
        }
    }

    public J() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f21884a);
        parcel.writeStringList(this.f21885b);
        parcel.writeTypedArray(this.f21886c, i10);
        parcel.writeInt(this.f21887d);
        parcel.writeString(this.f21888e);
        parcel.writeStringList(this.f21889f);
        parcel.writeTypedList(this.f21890g);
        parcel.writeTypedList(this.f21891h);
    }

    public J(Parcel parcel) {
        this.f21884a = parcel.createStringArrayList();
        this.f21885b = parcel.createStringArrayList();
        this.f21886c = (C5174b[]) parcel.createTypedArray(C5174b.CREATOR);
        this.f21887d = parcel.readInt();
        this.f21888e = parcel.readString();
        this.f21889f = parcel.createStringArrayList();
        this.f21890g = parcel.createTypedArrayList(C5175c.CREATOR);
        this.f21891h = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
