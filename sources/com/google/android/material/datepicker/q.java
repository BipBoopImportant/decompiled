package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class q implements Comparable<q>, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f66634a;

    /* renamed from: b  reason: collision with root package name */
    final int f66635b;

    /* renamed from: c  reason: collision with root package name */
    final int f66636c;

    /* renamed from: d  reason: collision with root package name */
    final int f66637d;

    /* renamed from: e  reason: collision with root package name */
    final int f66638e;

    /* renamed from: f  reason: collision with root package name */
    final long f66639f;

    /* renamed from: g  reason: collision with root package name */
    private String f66640g;

    class a implements Parcelable.Creator<q> {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return q.b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    private q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar e10 = y.e(calendar);
        this.f66634a = e10;
        this.f66635b = e10.get(2);
        this.f66636c = e10.get(1);
        this.f66637d = e10.getMaximum(7);
        this.f66638e = e10.getActualMaximum(5);
        this.f66639f = e10.getTimeInMillis();
    }

    static q b(int i10, int i11) {
        Calendar m10 = y.m();
        m10.set(1, i10);
        m10.set(2, i11);
        return new q(m10);
    }

    static q j(long j10) {
        Calendar m10 = y.m();
        m10.setTimeInMillis(j10);
        return new q(m10);
    }

    static q m() {
        return new q(y.k());
    }

    /* access modifiers changed from: package-private */
    public int B(long j10) {
        Calendar e10 = y.e(this.f66634a);
        e10.setTimeInMillis(j10);
        return e10.get(5);
    }

    /* access modifiers changed from: package-private */
    public String C() {
        if (this.f66640g == null) {
            this.f66640g = j.j(this.f66634a.getTimeInMillis());
        }
        return this.f66640g;
    }

    /* access modifiers changed from: package-private */
    public long D() {
        return this.f66634a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public q E(int i10) {
        Calendar e10 = y.e(this.f66634a);
        e10.add(2, i10);
        return new q(e10);
    }

    /* access modifiers changed from: package-private */
    public int F(q qVar) {
        if (this.f66634a instanceof GregorianCalendar) {
            return ((qVar.f66636c - this.f66636c) * 12) + (qVar.f66635b - this.f66635b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: a */
    public int compareTo(q qVar) {
        return this.f66634a.compareTo(qVar.f66634a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f66635b == qVar.f66635b && this.f66636c == qVar.f66636c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f66635b), Integer.valueOf(this.f66636c)});
    }

    /* access modifiers changed from: package-private */
    public int n(int i10) {
        int i11 = this.f66634a.get(7);
        if (i10 <= 0) {
            i10 = this.f66634a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f66637d : i12;
    }

    /* access modifiers changed from: package-private */
    public long v(int i10) {
        Calendar e10 = y.e(this.f66634a);
        e10.set(5, i10);
        return e10.getTimeInMillis();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f66636c);
        parcel.writeInt(this.f66635b);
    }
}
