package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1181a();

    /* renamed from: a  reason: collision with root package name */
    private final String f68605a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f68606b;

    /* renamed from: com.google.firebase.perf.metrics.a$a  reason: collision with other inner class name */
    class C1181a implements Parcelable.Creator<a> {
        C1181a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C1181a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C1181a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f68606b.get();
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f68605a;
    }

    public void c(long j10) {
        this.f68606b.addAndGet(j10);
    }

    /* access modifiers changed from: package-private */
    public void d(long j10) {
        this.f68606b.set(j10);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f68605a);
        parcel.writeLong(this.f68606b.get());
    }

    public a(String str) {
        this.f68605a = str;
        this.f68606b = new AtomicLong(0);
    }

    private a(Parcel parcel) {
        this.f68605a = parcel.readString();
        this.f68606b = new AtomicLong(parcel.readLong());
    }
}
