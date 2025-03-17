package ea;

import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class O extends a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a  reason: collision with root package name */
    private final int f50925a;

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f50926b;

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f50927c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f50928d;

    /* renamed from: e  reason: collision with root package name */
    private final String f50929e;

    O(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f50925a = i10;
        this.f50926b = iBinder;
        this.f50927c = iBinder2;
        this.f50928d = pendingIntent;
        this.f50929e = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ea.O B(ea.t0 r7) {
        /*
            ea.O r6 = new ea.O
            r4 = 0
            r5 = 0
            r1 = 4
            r2 = 0
            r0 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.O.B(ea.t0):ea.O");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ea.O x(android.os.IInterface r7, na.B r8, java.lang.String r9) {
        /*
            ea.O r6 = new ea.O
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 2
            r4 = 0
            r0 = r6
            r3 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.O.x(android.os.IInterface, na.B, java.lang.String):ea.O");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f50925a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.m(parcel, 2, this.f50926b, false);
        c.m(parcel, 3, this.f50927c, false);
        c.t(parcel, 4, this.f50928d, i10, false);
        c.u(parcel, 6, this.f50929e, false);
        c.b(parcel, a10);
    }
}
