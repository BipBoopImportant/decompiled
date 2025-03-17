package com.google.android.gms.internal.measurement;

import T9.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

public interface Q0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(V0 v02);

    void getAppInstanceId(V0 v02);

    void getCachedAppInstanceId(V0 v02);

    void getConditionalUserProperties(String str, String str2, V0 v02);

    void getCurrentScreenClass(V0 v02);

    void getCurrentScreenName(V0 v02);

    void getGmpAppId(V0 v02);

    void getMaxUserProperties(String str, V0 v02);

    void getSessionId(V0 v02);

    void getTestFlag(V0 v02, int i10);

    void getUserProperties(String str, String str2, boolean z10, V0 v02);

    void initForTests(Map map);

    void initialize(b bVar, C7282e1 e1Var, long j10);

    void isDataCollectionEnabled(V0 v02);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, V0 v02, long j10);

    void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(C7309h1 h1Var, Bundle bundle, long j10);

    void onActivityDestroyed(b bVar, long j10);

    void onActivityDestroyedByScionActivityInfo(C7309h1 h1Var, long j10);

    void onActivityPaused(b bVar, long j10);

    void onActivityPausedByScionActivityInfo(C7309h1 h1Var, long j10);

    void onActivityResumed(b bVar, long j10);

    void onActivityResumedByScionActivityInfo(C7309h1 h1Var, long j10);

    void onActivitySaveInstanceState(b bVar, V0 v02, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(C7309h1 h1Var, V0 v02, long j10);

    void onActivityStarted(b bVar, long j10);

    void onActivityStartedByScionActivityInfo(C7309h1 h1Var, long j10);

    void onActivityStopped(b bVar, long j10);

    void onActivityStoppedByScionActivityInfo(C7309h1 h1Var, long j10);

    void performAction(Bundle bundle, V0 v02, long j10);

    void registerOnMeasurementEventListener(C7255b1 b1Var);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(W0 w02);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(b bVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(C7309h1 h1Var, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C7255b1 b1Var);

    void setInstanceIdProvider(C7264c1 c1Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, b bVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(C7255b1 b1Var);
}
