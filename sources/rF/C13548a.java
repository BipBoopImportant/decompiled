package RF;

import com.sugarcube.app.base.decorate.DecorateCompatibilityProvider;
import com.sugarcube.decorate_engine.DecorateEngine;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRF/a;", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "<init>", "()V", "", "isSupported", "()Z", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RF.a  reason: case insensitive filesystem */
public final class C13548a implements DecorateCompatibilityProvider {
    public boolean isSupported() {
        return DecorateEngine.Companion.isDeviceSupported();
    }
}
