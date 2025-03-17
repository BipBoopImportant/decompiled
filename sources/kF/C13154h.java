package KF;

import GK.C15774B;
import GK.C15776D;
import GK.C15804w;
import LF.C13187c;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.external.config.a;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKF/h;", "LGK/w;", "Lcom/sugarcube/app/base/external/config/a;", "config", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepo", "LLF/c;", "log", "<init>", "(Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LLF/c;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "Lcom/sugarcube/app/base/external/config/a;", "b", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "c", "LLF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.h  reason: case insensitive filesystem */
public final class C13154h implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final a f111730a;

    /* renamed from: b  reason: collision with root package name */
    private final ConfigRepository f111731b;

    /* renamed from: c  reason: collision with root package name */
    private final C13187c f111732c;

    public C13154h(a aVar, ConfigRepository configRepository, C13187c cVar) {
        C17542s.j(aVar, "config");
        C17542s.j(configRepository, "configRepo");
        C17542s.j(cVar, "log");
        this.f111730a = aVar;
        this.f111731b = configRepository;
        this.f111732c = cVar;
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        C15774B t10 = aVar.t();
        if (this.f111730a.getDebug()) {
            if (this.f111731b.isEnabledBlocking(FeatureFlags.UploadsV2Offline.INSTANCE)) {
                C13187c.e(this.f111732c, "dbg offline", (C13187c.a) null, (Throwable) null, 6, (Object) null);
                throw new UnknownHostException("Offline simulated");
            } else if (this.f111731b.isEnabledBlocking(FeatureFlags.UploadsV2InjectDelays.INSTANCE)) {
                long longValue = ((Integer) this.f111731b.getBlocking(ConfigItems.UploadsV2CallDelayMs.INSTANCE)).longValue();
                C13187c cVar = this.f111732c;
                C13187c.h(cVar, "dbg delaying call " + longValue, (Throwable) null, 2, (Object) null);
                Thread.sleep(longValue);
            }
        }
        return aVar.b(t10);
    }
}
