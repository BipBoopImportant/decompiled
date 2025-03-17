package com.google.android.gms.internal.measurement;

import T9.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class S0 extends Y implements Q0 {
    S0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeLong(j10);
        K3(23, I32);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.d(I32, bundle);
        K3(9, I32);
    }

    public final void clearMeasurementEnabled(long j10) {
        Parcel I32 = I3();
        I32.writeLong(j10);
        K3(43, I32);
    }

    public final void endAdUnitExposure(String str, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeLong(j10);
        K3(24, I32);
    }

    public final void generateEventId(V0 v02) {
        Parcel I32 = I3();
        C7245a0.c(I32, v02);
        K3(22, I32);
    }

    public final void getCachedAppInstanceId(V0 v02) {
        Parcel I32 = I3();
        C7245a0.c(I32, v02);
        K3(19, I32);
    }

    public final void getConditionalUserProperties(String str, String str2, V0 v02) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.c(I32, v02);
        K3(10, I32);
    }

    public final void getCurrentScreenClass(V0 v02) {
        Parcel I32 = I3();
        C7245a0.c(I32, v02);
        K3(17, I32);
    }

    public final void getCurrentScreenName(V0 v02) {
        Parcel I32 = I3();
        C7245a0.c(I32, v02);
        K3(16, I32);
    }

    public final void getGmpAppId(V0 v02) {
        Parcel I32 = I3();
        C7245a0.c(I32, v02);
        K3(21, I32);
    }

    public final void getMaxUserProperties(String str, V0 v02) {
        Parcel I32 = I3();
        I32.writeString(str);
        C7245a0.c(I32, v02);
        K3(6, I32);
    }

    public final void getUserProperties(String str, String str2, boolean z10, V0 v02) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.e(I32, z10);
        C7245a0.c(I32, v02);
        K3(5, I32);
    }

    public final void initialize(b bVar, C7282e1 e1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.c(I32, bVar);
        C7245a0.d(I32, e1Var);
        I32.writeLong(j10);
        K3(1, I32);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.d(I32, bundle);
        C7245a0.e(I32, z10);
        C7245a0.e(I32, z11);
        I32.writeLong(j10);
        K3(2, I32);
    }

    public final void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3) {
        Parcel I32 = I3();
        I32.writeInt(i10);
        I32.writeString(str);
        C7245a0.c(I32, bVar);
        C7245a0.c(I32, bVar2);
        C7245a0.c(I32, bVar3);
        K3(33, I32);
    }

    public final void onActivityCreatedByScionActivityInfo(C7309h1 h1Var, Bundle bundle, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        C7245a0.d(I32, bundle);
        I32.writeLong(j10);
        K3(53, I32);
    }

    public final void onActivityDestroyedByScionActivityInfo(C7309h1 h1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeLong(j10);
        K3(54, I32);
    }

    public final void onActivityPausedByScionActivityInfo(C7309h1 h1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeLong(j10);
        K3(55, I32);
    }

    public final void onActivityResumedByScionActivityInfo(C7309h1 h1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeLong(j10);
        K3(56, I32);
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(C7309h1 h1Var, V0 v02, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        C7245a0.c(I32, v02);
        I32.writeLong(j10);
        K3(57, I32);
    }

    public final void onActivityStartedByScionActivityInfo(C7309h1 h1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeLong(j10);
        K3(51, I32);
    }

    public final void onActivityStoppedByScionActivityInfo(C7309h1 h1Var, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeLong(j10);
        K3(52, I32);
    }

    public final void registerOnMeasurementEventListener(C7255b1 b1Var) {
        Parcel I32 = I3();
        C7245a0.c(I32, b1Var);
        K3(35, I32);
    }

    public final void retrieveAndUploadBatches(W0 w02) {
        Parcel I32 = I3();
        C7245a0.c(I32, w02);
        K3(58, I32);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        I32.writeLong(j10);
        K3(8, I32);
    }

    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        I32.writeLong(j10);
        K3(45, I32);
    }

    public final void setCurrentScreenByScionActivityInfo(C7309h1 h1Var, String str, String str2, long j10) {
        Parcel I32 = I3();
        C7245a0.d(I32, h1Var);
        I32.writeString(str);
        I32.writeString(str2);
        I32.writeLong(j10);
        K3(50, I32);
    }

    public final void setDataCollectionEnabled(boolean z10) {
        Parcel I32 = I3();
        C7245a0.e(I32, z10);
        K3(39, I32);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        K3(42, I32);
    }

    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel I32 = I3();
        C7245a0.e(I32, z10);
        I32.writeLong(j10);
        K3(11, I32);
    }

    public final void setUserId(String str, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeLong(j10);
        K3(7, I32);
    }

    public final void setUserProperty(String str, String str2, b bVar, boolean z10, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.c(I32, bVar);
        C7245a0.e(I32, z10);
        I32.writeLong(j10);
        K3(4, I32);
    }
}
