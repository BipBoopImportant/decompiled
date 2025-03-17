package com.sugarcube.app.base.network;

import androidx.lifecycle.F;
import com.sugarcube.core.network.api.NetworkAPIs;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u0006\u0010\u000bJ&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/network/NetworkClient;", "", "", "latestBaseURL", "()Ljava/lang/String;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "api", "()Lcom/sugarcube/core/network/api/NetworkAPIs;", "T", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "appPackageVersionCode", "", "outage", "Lcom/sugarcube/app/base/network/NetworkStatus;", "checkStatus", "(ILjava/lang/Boolean;LdI/e;)Ljava/lang/Object;", "Landroidx/lifecycle/F;", "getNetworkStatus", "()Landroidx/lifecycle/F;", "networkStatus", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkClient {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object checkStatus$default(NetworkClient networkClient, int i10, Boolean bool, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    bool = null;
                }
                return networkClient.checkStatus(i10, bool, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkStatus");
        }
    }

    NetworkAPIs api();

    <T> T api(Class<T> cls);

    Object checkStatus(int i10, Boolean bool, C17164e<? super NetworkStatus> eVar);

    F<NetworkStatus> getNetworkStatus();

    String latestBaseURL();
}
