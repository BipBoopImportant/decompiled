package k8;

import H2.a;
import a9.C6799c1;
import com.contentsquare.android.api.bridge.xpf.ExternalBridgeInterface;
import com.contentsquare.android.api.bridge.xpf.XpfInterface;

public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExternalBridgeInterface f54362a;

    public /* synthetic */ f(ExternalBridgeInterface externalBridgeInterface) {
        this.f54362a = externalBridgeInterface;
    }

    public final void accept(Object obj) {
        XpfInterface.unregisterExternalBridge$lambda$1(this.f54362a, (C6799c1) obj);
    }
}
