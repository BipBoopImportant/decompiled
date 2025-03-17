package sa;

import com.google.android.gms.internal.measurement.C7254b0;

/* renamed from: sa.g  reason: case insensitive filesystem */
public abstract class C8754g extends C7254b0 implements C8755h {
    public C8754g() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v24, types: [sa.m] */
    /* JADX WARNING: type inference failed for: r10v32, types: [sa.i] */
    /* JADX WARNING: type inference failed for: r10v37 */
    /* JADX WARNING: type inference failed for: r10v38 */
    /* JADX WARNING: type inference failed for: r10v39 */
    /* JADX WARNING: type inference failed for: r10v40 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I3(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 0
            switch(r7) {
                case 1: goto L_0x02a3;
                case 2: goto L_0x0289;
                case 3: goto L_0x0004;
                case 4: goto L_0x0277;
                case 5: goto L_0x025d;
                case 6: goto L_0x024b;
                case 7: goto L_0x0231;
                case 8: goto L_0x0004;
                case 9: goto L_0x0216;
                case 10: goto L_0x01fa;
                case 11: goto L_0x01e3;
                case 12: goto L_0x01c8;
                case 13: goto L_0x01b5;
                case 14: goto L_0x0192;
                case 15: goto L_0x0173;
                case 16: goto L_0x0154;
                case 17: goto L_0x0139;
                case 18: goto L_0x0126;
                case 19: goto L_0x010b;
                case 20: goto L_0x00f8;
                case 21: goto L_0x00e1;
                case 22: goto L_0x0004;
                case 23: goto L_0x0004;
                case 24: goto L_0x00c2;
                case 25: goto L_0x00af;
                case 26: goto L_0x009c;
                case 27: goto L_0x0089;
                case 28: goto L_0x0004;
                case 29: goto L_0x0055;
                case 30: goto L_0x003a;
                case 31: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r7 = 0
            return r7
        L_0x0006:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.IBinder r1 = r8.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            goto L_0x002f
        L_0x001d:
            java.lang.String r10 = "com.google.android.gms.measurement.internal.ITriggerUrisCallback"
            android.os.IInterface r10 = r1.queryLocalInterface(r10)
            boolean r2 = r10 instanceof sa.C8756i
            if (r2 == 0) goto L_0x002a
            sa.i r10 = (sa.C8756i) r10
            goto L_0x002f
        L_0x002a:
            sa.j r10 = new sa.j
            r10.<init>(r1)
        L_0x002f:
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.O0(r7, r0, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x003a:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.e> r10 = com.google.android.gms.measurement.internal.C7583e.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            com.google.android.gms.measurement.internal.e r10 = (com.google.android.gms.measurement.internal.C7583e) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.t3(r7, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0055:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            android.os.Parcelable$Creator<sa.k0> r0 = sa.k0.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r0)
            sa.k0 r0 = (sa.k0) r0
            android.os.IBinder r1 = r8.readStrongBinder()
            if (r1 != 0) goto L_0x006c
            goto L_0x007e
        L_0x006c:
            java.lang.String r10 = "com.google.android.gms.measurement.internal.IUploadBatchesCallback"
            android.os.IInterface r10 = r1.queryLocalInterface(r10)
            boolean r2 = r10 instanceof sa.C8760m
            if (r2 == 0) goto L_0x0079
            sa.m r10 = (sa.C8760m) r10
            goto L_0x007e
        L_0x0079:
            sa.n r10 = new sa.n
            r10.<init>(r1)
        L_0x007e:
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.H3(r7, r0, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0089:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.J1(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x009c:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.B3(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x00af:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.X2(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x00c2:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.r0(r7, r10)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x00e1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            sa.c r7 = r6.h2(r7)
            r9.writeNoException()
            com.google.android.gms.internal.measurement.C7245a0.g(r9, r7)
            goto L_0x02bc
        L_0x00f8:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.h3(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x010b:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r10 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            com.google.android.gms.measurement.internal.E5 r10 = (com.google.android.gms.measurement.internal.E5) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.H1(r7, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0126:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.U1(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0139:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.t0(r7, r10, r0)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x0154:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r0 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r0)
            com.google.android.gms.measurement.internal.E5 r0 = (com.google.android.gms.measurement.internal.E5) r0
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.J(r7, r10, r0)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x0173:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r1 = com.google.android.gms.internal.measurement.C7245a0.h(r8)
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.P(r7, r10, r0, r1)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x0192:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = com.google.android.gms.internal.measurement.C7245a0.h(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r1 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r1)
            com.google.android.gms.measurement.internal.E5 r1 = (com.google.android.gms.measurement.internal.E5) r1
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.n3(r7, r10, r0, r1)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x01b5:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.g> r7 = com.google.android.gms.measurement.internal.C7597g.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.g r7 = (com.google.android.gms.measurement.internal.C7597g) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.i2(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x01c8:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.g> r7 = com.google.android.gms.measurement.internal.C7597g.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.g r7 = (com.google.android.gms.measurement.internal.C7597g) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r10 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            com.google.android.gms.measurement.internal.E5 r10 = (com.google.android.gms.measurement.internal.E5) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.p1(r7, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x01e3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.lang.String r7 = r6.u2(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x02bc
        L_0x01fa:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r0 = r6
            r0.q0(r1, r3, r4, r5)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0216:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.J> r7 = com.google.android.gms.measurement.internal.J.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.J r7 = (com.google.android.gms.measurement.internal.J) r7
            java.lang.String r10 = r8.readString()
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            byte[] r7 = r6.J2(r7, r10)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x02bc
        L_0x0231:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            boolean r10 = com.google.android.gms.internal.measurement.C7245a0.h(r8)
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            java.util.List r7 = r6.g0(r7, r10)
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x02bc
        L_0x024b:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.Q2(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x025d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.J> r7 = com.google.android.gms.measurement.internal.J.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.J r7 = (com.google.android.gms.measurement.internal.J) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.B0(r7, r10, r0)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0277:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r7 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.E5 r7 = (com.google.android.gms.measurement.internal.E5) r7
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.T1(r7)
            r9.writeNoException()
            goto L_0x02bc
        L_0x0289:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.P5> r7 = com.google.android.gms.measurement.internal.P5.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.P5 r7 = (com.google.android.gms.measurement.internal.P5) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r10 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            com.google.android.gms.measurement.internal.E5 r10 = (com.google.android.gms.measurement.internal.E5) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.v3(r7, r10)
            r9.writeNoException()
            goto L_0x02bc
        L_0x02a3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.J> r7 = com.google.android.gms.measurement.internal.J.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r7)
            com.google.android.gms.measurement.internal.J r7 = (com.google.android.gms.measurement.internal.J) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.E5> r10 = com.google.android.gms.measurement.internal.E5.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.C7245a0.a(r8, r10)
            com.google.android.gms.measurement.internal.E5 r10 = (com.google.android.gms.measurement.internal.E5) r10
            com.google.android.gms.internal.measurement.C7245a0.f(r8)
            r6.K2(r7, r10)
            r9.writeNoException()
        L_0x02bc:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.C8754g.I3(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
