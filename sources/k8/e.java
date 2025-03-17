package k8;

import H2.a;
import a9.C6799c1;
import com.contentsquare.android.api.bridge.xpf.ExternalBridgeInterface;
import com.contentsquare.android.api.bridge.xpf.XpfInterface;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExternalBridgeInterface f54361a;

    public /* synthetic */ e(ExternalBridgeInterface externalBridgeInterface) {
        this.f54361a = externalBridgeInterface;
    }

    public final void accept(Object obj) {
        XpfInterface.registerExternalBridge$lambda$0(this.f54361a, (C6799c1) obj);
    }
}
