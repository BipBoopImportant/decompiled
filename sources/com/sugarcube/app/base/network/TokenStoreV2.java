package com.sugarcube.app.base.network;

import TJ.C16519P;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/network/TokenStoreV2;", "", "", "isTokenValid", "(LdI/e;)Ljava/lang/Object;", "", "getToken", "LTJ/P;", "getTokenFlow", "()LTJ/P;", "", "code", "LXH/N;", "handleFailure", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TokenStoreV2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static C16519P<String> getTokenFlow(TokenStoreV2 tokenStoreV2) {
            throw new IllegalStateException("Function getTokenFlow should be implemented.");
        }
    }

    Object getToken(C17164e<? super String> eVar);

    C16519P<String> getTokenFlow();

    void handleFailure(int i10);

    Object isTokenValid(C17164e<? super Boolean> eVar);
}
