package com.sugarcube.app.base.network;

import TJ.C16519P;
import com.sugarcube.app.base.network.TokenStoreV2;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/network/ITokenStoreV2;", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "", "isTokenValid", "(LdI/e;)Ljava/lang/Object;", "", "getToken", "", "code", "LXH/N;", "handleFailure", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ITokenStoreV2 extends TokenStoreV2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static C16519P<String> getTokenFlow(ITokenStoreV2 iTokenStoreV2) {
            return TokenStoreV2.DefaultImpls.getTokenFlow(iTokenStoreV2);
        }
    }

    Object getToken(C17164e<? super String> eVar);

    void handleFailure(int i10);

    Object isTokenValid(C17164e<? super Boolean> eVar);
}
