package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C7245a0;
import com.google.android.gms.internal.measurement.Y;
import java.util.ArrayList;
import java.util.List;
import sa.C8750c;
import sa.C8755h;
import sa.C8756i;
import sa.C8760m;
import sa.k0;

/* renamed from: com.google.android.gms.measurement.internal.a2  reason: case insensitive filesystem */
public final class C7558a2 extends Y implements C8755h {
    C7558a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void B0(J j10, String str, String str2) {
        Parcel I32 = I3();
        C7245a0.d(I32, j10);
        I32.writeString(str);
        I32.writeString(str2);
        K3(5, I32);
    }

    public final void B3(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(26, I32);
    }

    public final void H1(Bundle bundle, E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        C7245a0.d(I32, e52);
        K3(19, I32);
    }

    public final void H3(E5 e52, k0 k0Var, C8760m mVar) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        C7245a0.d(I32, k0Var);
        C7245a0.c(I32, mVar);
        K3(29, I32);
    }

    public final List<C7597g> J(String str, String str2, E5 e52) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.d(I32, e52);
        Parcel J32 = J3(16, I32);
        ArrayList<C7597g> createTypedArrayList = J32.createTypedArrayList(C7597g.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final void J1(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(27, I32);
    }

    public final byte[] J2(J j10, String str) {
        Parcel I32 = I3();
        C7245a0.d(I32, j10);
        I32.writeString(str);
        Parcel J32 = J3(9, I32);
        byte[] createByteArray = J32.createByteArray();
        J32.recycle();
        return createByteArray;
    }

    public final void K2(J j10, E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, j10);
        C7245a0.d(I32, e52);
        K3(1, I32);
    }

    public final void O0(E5 e52, Bundle bundle, C8756i iVar) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        C7245a0.d(I32, bundle);
        C7245a0.c(I32, iVar);
        K3(31, I32);
    }

    public final List<P5> P(String str, String str2, String str3, boolean z10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        I32.writeString(str3);
        C7245a0.e(I32, z10);
        Parcel J32 = J3(15, I32);
        ArrayList<P5> createTypedArrayList = J32.createTypedArrayList(P5.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final void Q2(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(6, I32);
    }

    public final void T1(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(4, I32);
    }

    public final void U1(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(18, I32);
    }

    public final void X2(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(25, I32);
    }

    public final C8750c h2(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        Parcel J32 = J3(21, I32);
        C8750c cVar = (C8750c) C7245a0.a(J32, C8750c.CREATOR);
        J32.recycle();
        return cVar;
    }

    public final void h3(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        K3(20, I32);
    }

    public final void i2(C7597g gVar) {
        Parcel I32 = I3();
        C7245a0.d(I32, gVar);
        K3(13, I32);
    }

    public final List<P5> n3(String str, String str2, boolean z10, E5 e52) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.e(I32, z10);
        C7245a0.d(I32, e52);
        Parcel J32 = J3(14, I32);
        ArrayList<P5> createTypedArrayList = J32.createTypedArrayList(P5.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final void p1(C7597g gVar, E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, gVar);
        C7245a0.d(I32, e52);
        K3(12, I32);
    }

    public final void q0(long j10, String str, String str2, String str3) {
        Parcel I32 = I3();
        I32.writeLong(j10);
        I32.writeString(str);
        I32.writeString(str2);
        I32.writeString(str3);
        K3(10, I32);
    }

    public final List<C7645m5> r0(E5 e52, Bundle bundle) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        C7245a0.d(I32, bundle);
        Parcel J32 = J3(24, I32);
        ArrayList<C7645m5> createTypedArrayList = J32.createTypedArrayList(C7645m5.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final List<C7597g> t0(String str, String str2, String str3) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        I32.writeString(str3);
        Parcel J32 = J3(17, I32);
        ArrayList<C7597g> createTypedArrayList = J32.createTypedArrayList(C7597g.CREATOR);
        J32.recycle();
        return createTypedArrayList;
    }

    public final void t3(E5 e52, C7583e eVar) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        C7245a0.d(I32, eVar);
        K3(30, I32);
    }

    public final String u2(E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, e52);
        Parcel J32 = J3(11, I32);
        String readString = J32.readString();
        J32.recycle();
        return readString;
    }

    public final void v3(P5 p52, E5 e52) {
        Parcel I32 = I3();
        C7245a0.d(I32, p52);
        C7245a0.d(I32, e52);
        K3(2, I32);
    }
}
