package com.sugarcube.app.base.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.lifecycle.F;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u000f\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/network/NetworkLiveData;", "Landroidx/lifecycle/F;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LXH/N;", "onActive", "()V", "onInactive", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "com/sugarcube/app/base/network/NetworkLiveData$networkCallback$1", "networkCallback", "Lcom/sugarcube/app/base/network/NetworkLiveData$networkCallback$1;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkLiveData extends F<Boolean> {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final NetworkLiveData$networkCallback$1 networkCallback = new NetworkLiveData$networkCallback$1(this);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/network/NetworkLiveData$Companion;", "", "<init>", "()V", "getInstance", "Lcom/sugarcube/app/base/network/NetworkLiveData;", "context", "Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkLiveData getInstance(Context context) {
            C17542s.j(context, "context");
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "getApplicationContext(...)");
            return new NetworkLiveData(applicationContext);
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkLiveData(Context context2) {
        super(Boolean.FALSE);
        C17542s.j(context2, "context");
        this.context = context2;
        Object systemService = context2.getSystemService("connectivity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    public void onActive() {
        if (this.context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.networkCallback);
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }
}
