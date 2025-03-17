package K9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: K9.p  reason: case insensitive filesystem */
public class C6618p extends a {
    public static final Parcelable.Creator<C6618p> CREATOR = new M();

    /* renamed from: a  reason: collision with root package name */
    private final int f37893a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37894b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37895c;

    /* renamed from: d  reason: collision with root package name */
    private final long f37896d;

    /* renamed from: e  reason: collision with root package name */
    private final long f37897e;

    /* renamed from: f  reason: collision with root package name */
    private final String f37898f;

    /* renamed from: g  reason: collision with root package name */
    private final String f37899g;

    /* renamed from: h  reason: collision with root package name */
    private final int f37900h;

    /* renamed from: i  reason: collision with root package name */
    private final int f37901i;

    @Deprecated
    public C6618p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f37893a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f37894b);
        c.n(parcel, 3, this.f37895c);
        c.r(parcel, 4, this.f37896d);
        c.r(parcel, 5, this.f37897e);
        c.u(parcel, 6, this.f37898f, false);
        c.u(parcel, 7, this.f37899g, false);
        c.n(parcel, 8, this.f37900h);
        c.n(parcel, 9, this.f37901i);
        c.b(parcel, a10);
    }

    public C6618p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f37893a = i10;
        this.f37894b = i11;
        this.f37895c = i12;
        this.f37896d = j10;
        this.f37897e = j11;
        this.f37898f = str;
        this.f37899g = str2;
        this.f37900h = i13;
        this.f37901i = i14;
    }
}
