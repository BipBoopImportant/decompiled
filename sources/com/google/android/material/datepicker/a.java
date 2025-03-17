package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1165a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q f66585a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final q f66586b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f66587c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public q f66588d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f66589e;

    /* renamed from: f  reason: collision with root package name */
    private final int f66590f;

    /* renamed from: g  reason: collision with root package name */
    private final int f66591g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    class C1165a implements Parcelable.Creator<a> {
        C1165a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<q> cls = q.class;
            return new a((q) parcel.readParcelable(cls.getClassLoader()), (q) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (q) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (C1165a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public interface c extends Parcelable {
        boolean W0(long j10);
    }

    /* synthetic */ a(q qVar, q qVar2, c cVar, q qVar3, int i10, C1165a aVar) {
        this(qVar, qVar2, cVar, qVar3, i10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66585a.equals(aVar.f66585a) && this.f66586b.equals(aVar.f66586b) && H2.c.a(this.f66588d, aVar.f66588d) && this.f66589e == aVar.f66589e && this.f66587c.equals(aVar.f66587c);
    }

    /* access modifiers changed from: package-private */
    public q f(q qVar) {
        return qVar.compareTo(this.f66585a) < 0 ? this.f66585a : qVar.compareTo(this.f66586b) > 0 ? this.f66586b : qVar;
    }

    public c g() {
        return this.f66587c;
    }

    /* access modifiers changed from: package-private */
    public q h() {
        return this.f66586b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66585a, this.f66586b, this.f66588d, Integer.valueOf(this.f66589e), this.f66587c});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f66589e;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f66591g;
    }

    /* access modifiers changed from: package-private */
    public q k() {
        return this.f66588d;
    }

    /* access modifiers changed from: package-private */
    public q l() {
        return this.f66585a;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f66590f;
    }

    /* access modifiers changed from: package-private */
    public boolean n(long j10) {
        if (this.f66585a.v(1) <= j10) {
            q qVar = this.f66586b;
            if (j10 <= qVar.v(qVar.f66638e)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void o(q qVar) {
        this.f66588d = qVar;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f66585a, 0);
        parcel.writeParcelable(this.f66586b, 0);
        parcel.writeParcelable(this.f66588d, 0);
        parcel.writeParcelable(this.f66587c, 0);
        parcel.writeInt(this.f66589e);
    }

    private a(q qVar, q qVar2, c cVar, q qVar3, int i10) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f66585a = qVar;
        this.f66586b = qVar2;
        this.f66588d = qVar3;
        this.f66589e = i10;
        this.f66587c = cVar;
        if (qVar3 != null && qVar.compareTo(qVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (qVar3 != null && qVar3.compareTo(qVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i10 < 0 || i10 > y.m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f66591g = qVar.F(qVar2) + 1;
            this.f66590f = (qVar2.f66636c - qVar.f66636c) + 1;
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        static final long f66592f = y.a(q.b(1900, 0).f66639f);

        /* renamed from: g  reason: collision with root package name */
        static final long f66593g = y.a(q.b(2100, 11).f66639f);

        /* renamed from: a  reason: collision with root package name */
        private long f66594a = f66592f;

        /* renamed from: b  reason: collision with root package name */
        private long f66595b = f66593g;

        /* renamed from: c  reason: collision with root package name */
        private Long f66596c;

        /* renamed from: d  reason: collision with root package name */
        private int f66597d;

        /* renamed from: e  reason: collision with root package name */
        private c f66598e = l.a(Long.MIN_VALUE);

        public b() {
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f66598e);
            q j10 = q.j(this.f66594a);
            q j11 = q.j(this.f66595b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f66596c;
            return new a(j10, j11, cVar, l10 == null ? null : q.j(l10.longValue()), this.f66597d, (C1165a) null);
        }

        public b b(long j10) {
            this.f66595b = j10;
            return this;
        }

        public b c(long j10) {
            this.f66596c = Long.valueOf(j10);
            return this;
        }

        public b d(long j10) {
            this.f66594a = j10;
            return this;
        }

        public b e(c cVar) {
            Objects.requireNonNull(cVar, "validator cannot be null");
            this.f66598e = cVar;
            return this;
        }

        b(a aVar) {
            this.f66594a = aVar.f66585a.f66639f;
            this.f66595b = aVar.f66586b.f66639f;
            this.f66596c = Long.valueOf(aVar.f66588d.f66639f);
            this.f66597d = aVar.f66589e;
            this.f66598e = aVar.f66587c;
        }
    }
}
