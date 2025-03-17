package Wa;

import O2.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j0.b0;

/* renamed from: Wa.a  reason: case insensitive filesystem */
public class C9345a extends a {
    public static final Parcelable.Creator<C9345a> CREATOR = new C1131a();

    /* renamed from: c  reason: collision with root package name */
    public final b0<String, Bundle> f64614c;

    /* renamed from: Wa.a$a  reason: collision with other inner class name */
    class C1131a implements Parcelable.ClassLoaderCreator<C9345a> {
        C1131a() {
        }

        /* renamed from: a */
        public C9345a createFromParcel(Parcel parcel) {
            return new C9345a(parcel, (ClassLoader) null, (C1131a) null);
        }

        /* renamed from: b */
        public C9345a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C9345a(parcel, classLoader, (C1131a) null);
        }

        /* renamed from: c */
        public C9345a[] newArray(int i10) {
            return new C9345a[i10];
        }
    }

    /* synthetic */ C9345a(Parcel parcel, ClassLoader classLoader, C1131a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f64614c + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f64614c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f64614c.h(i11);
            bundleArr[i11] = this.f64614c.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C9345a(Parcelable parcelable) {
        super(parcelable);
        this.f64614c = new b0<>();
    }

    private C9345a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f64614c = new b0<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f64614c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
