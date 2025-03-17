package com.sugarcube.app.base.data.source.remote;

import QJ.C16310i;
import com.sugarcube.app.base.data.source.QuickFilterRemoteDataSource;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.QuickFilter;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/QuickFilterRemoteDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "<init>", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "getAllQuickFilters", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/network/NetworkClient;", "getNetworkClient", "()Lcom/sugarcube/app/base/network/NetworkClient;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "getNetworkAPIs", "()Lcom/sugarcube/core/network/api/NetworkAPIs;", "networkAPIs", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickFilterRemoteDataSourceImpl implements QuickFilterRemoteDataSource {
    public static final int $stable = 8;
    private final NetworkClient networkClient;

    public QuickFilterRemoteDataSourceImpl(NetworkClient networkClient2) {
        C17542s.j(networkClient2, "networkClient");
        this.networkClient = networkClient2;
    }

    /* access modifiers changed from: private */
    public final NetworkAPIs getNetworkAPIs() {
        return this.networkClient.api();
    }

    public Object getAllQuickFilters(C17164e<? super List<QuickFilter>> eVar) {
        return C16310i.g(eVar.getContext(), new QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2(this, (C17164e<? super QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2>) null), eVar);
    }

    public final NetworkClient getNetworkClient() {
        return this.networkClient;
    }
}
