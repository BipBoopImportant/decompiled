package com.sugarcube.app.base.network;

import GK.C15776D;
import GK.C15804w;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/network/AuthInterceptor;", "LGK/w;", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "tokenStore", "hostAppInterceptor", "<init>", "(Lcom/sugarcube/app/base/network/TokenStoreV2;LGK/w;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "LGK/w;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthInterceptor implements C15804w {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final C15804w hostAppInterceptor;
    /* access modifiers changed from: private */
    public final TokenStoreV2 tokenStore;

    public AuthInterceptor(TokenStoreV2 tokenStoreV2, C15804w wVar) {
        C17542s.j(tokenStoreV2, "tokenStore");
        C17542s.j(wVar, "hostAppInterceptor");
        this.tokenStore = tokenStoreV2;
        this.hostAppInterceptor = wVar;
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        NetworkClientKt.assertNotMainThread();
        return (C15776D) C16312j.b((C17168i) null, new AuthInterceptor$intercept$1(this, aVar, (C17164e<? super AuthInterceptor$intercept$1>) null), 1, (Object) null);
    }
}
