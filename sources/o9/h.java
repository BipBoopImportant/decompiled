package O9;

import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public class h extends L9.a {
    public static final Parcelable.Creator<h> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    private final int f39307a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39308b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f39309c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f39310d;

    /* renamed from: e  reason: collision with root package name */
    private final int f39311e;

    /* renamed from: f  reason: collision with root package name */
    private final a f39312f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f39313a;

        /* renamed from: b  reason: collision with root package name */
        private final long f39314b;

        a(long j10, long j11) {
            C6620s.o(j11);
            this.f39313a = j10;
            this.f39314b = j11;
        }
    }

    public h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f39307a = i10;
        this.f39308b = i11;
        this.f39309c = l10;
        this.f39310d = l11;
        this.f39311e = i12;
        this.f39312f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int B() {
        return this.f39308b;
    }

    public int F() {
        return this.f39307a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, F());
        c.n(parcel, 2, B());
        c.s(parcel, 3, this.f39309c, false);
        c.s(parcel, 4, this.f39310d, false);
        c.n(parcel, 5, x());
        c.b(parcel, a10);
    }

    public int x() {
        return this.f39311e;
    }
}
