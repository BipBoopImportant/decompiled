package com.contentsquare.android.api.bridge.xpf;

import k8.C8466b;
import k8.c;
import k8.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\nJ\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeInterface;", "", "", "bridgeConfig", "LXH/N;", "updateBridgeConfig", "(Ljava/lang/String;)V", "", "enable", "notifySessionReplayEnabled", "(Z)V", "enabled", "notifyCsInAppEnabled", "Lk8/d;", "type", "Lk8/c;", "state", "notifySDKStateChanges", "(Lk8/d;Lk8/c;)V", "notifySrMaskingHasChanged", "Lk8/b;", "capture", "setSessionReplayCapture", "(Lk8/b;)V", "Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeType;", "getBridgeType", "()Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeType;", "bridgeType", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExternalBridgeInterface {
    ExternalBridgeType getBridgeType();

    void notifyCsInAppEnabled(boolean z10);

    void notifySDKStateChanges(d dVar, c cVar);

    void notifySessionReplayEnabled(boolean z10);

    void notifySrMaskingHasChanged(boolean z10);

    void setSessionReplayCapture(C8466b bVar);

    void updateBridgeConfig(String str);
}
