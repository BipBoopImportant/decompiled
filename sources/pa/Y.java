package pa;

import fa.k;

public abstract class Y extends k implements C8642c {
    public Y() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I3(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x000c
            r4 = 2
            if (r3 == r4) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            r2.deactivate()
            goto L_0x002e
        L_0x000c:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0014
            r3 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IOnLocationChangeListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof pa.C8655p
            if (r1 == 0) goto L_0x0022
            r3 = r0
            pa.p r3 = (pa.C8655p) r3
            goto L_0x0028
        L_0x0022:
            pa.o r0 = new pa.o
            r0.<init>(r3)
            r3 = r0
        L_0x0028:
            fa.l.b(r4)
            r2.N(r3)
        L_0x002e:
            r5.writeNoException()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.Y.I3(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
