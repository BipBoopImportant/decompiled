package com.sugarcube.app.base.network;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/sugarcube/app/base/network/NetworkLiveData$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "LXH/N;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkLiveData$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ NetworkLiveData this$0;

    NetworkLiveData$networkCallback$1(NetworkLiveData networkLiveData) {
        this.this$0 = networkLiveData;
    }

    public void onAvailable(Network network) {
        C17542s.j(network, "network");
        super.onAvailable(network);
        this.this$0.postValue(Boolean.TRUE);
    }

    public void onLost(Network network) {
        C17542s.j(network, "network");
        super.onLost(network);
        this.this$0.postValue(Boolean.FALSE);
    }
}
