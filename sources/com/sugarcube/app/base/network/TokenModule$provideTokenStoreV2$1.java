package com.sugarcube.app.base.network;

import TJ.C16519P;
import com.sugarcube.app.base.network.TokenStoreV2;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/sugarcube/app/base/network/TokenModule$provideTokenStoreV2$1", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "", "isTokenValid", "(LdI/e;)Ljava/lang/Object;", "", "getToken", "", "code", "LXH/N;", "handleFailure", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TokenModule$provideTokenStoreV2$1 implements TokenStoreV2 {
    final /* synthetic */ ITokenStore $iTokenStoreV1;

    TokenModule$provideTokenStoreV2$1(ITokenStore iTokenStore) {
        this.$iTokenStoreV1 = iTokenStore;
    }

    public Object getToken(C17164e<? super String> eVar) {
        return this.$iTokenStoreV1.getToken();
    }

    public C16519P<String> getTokenFlow() {
        return TokenStoreV2.DefaultImpls.getTokenFlow(this);
    }

    public void handleFailure(int i10) {
        this.$iTokenStoreV1.handleFailure(i10);
    }

    public Object isTokenValid(C17164e<? super Boolean> eVar) {
        return b.a(this.$iTokenStoreV1.isTokenValid());
    }
}
