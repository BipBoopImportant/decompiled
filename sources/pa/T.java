package pa;

import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import fa.a;
import fa.l;
import fa.n;
import fa.o;

public final class T extends a implements U {
    T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final void R1(b bVar, int i10) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        J32.writeInt(i10);
        K3(10, J32);
    }

    public final void c3(b bVar, int i10) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        J32.writeInt(19000000);
        K3(6, J32);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pa.C8643d d1(T9.b r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.J3()
            fa.l.d(r0, r3)
            fa.l.c(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.I3(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof pa.C8643d
            if (r1 == 0) goto L_0x0025
            r4 = r0
            pa.d r4 = (pa.C8643d) r4
            goto L_0x002b
        L_0x0025:
            pa.Z r0 = new pa.Z
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.T.d1(T9.b, com.google.android.gms.maps.GoogleMapOptions):pa.d");
    }

    public final o f() {
        Parcel I32 = I3(5, J3());
        o J32 = n.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pa.C8640a h() {
        /*
            r4 = this;
            r0 = 4
            android.os.Parcel r1 = r4.J3()
            android.os.Parcel r0 = r4.I3(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof pa.C8640a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            pa.a r1 = (pa.C8640a) r1
            goto L_0x0025
        L_0x001f:
            pa.E r2 = new pa.E
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.T.h():pa.a");
    }

    public final void u3(b bVar) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        K3(11, J32);
    }

    public final int zzd() {
        Parcel I32 = I3(9, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }
}
