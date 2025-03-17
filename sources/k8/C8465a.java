package k8;

import A8.b;
import E8.c;
import YH.C16877v;
import a9.C6784a2;
import a9.C6976y3;
import a9.D6;
import android.webkit.WebView;
import com.contentsquare.android.api.bridge.xpf.BridgeConfig;
import com.contentsquare.android.api.bridge.xpf.ExternalBridgeInterface;
import com.contentsquare.android.api.bridge.xpf.ExternalBridgeType;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.sdk.H;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;
import x8.C8957a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u0012J#\u0010&\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\u000fJ+\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0019¢\u0006\u0004\b.\u0010\u001bJ\u0015\u0010/\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\u000fJ\u0015\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u000fJ\u0017\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0019¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0019¢\u0006\u0004\b8\u0010\u001bJ\u0017\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u0012J\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u0010\u0012J\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010AR&\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0B8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bF\u0010\u0012\u001a\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010J¨\u0006N"}, d2 = {"Lk8/a;", "LE8/c$b;", "LA8/b;", "configuration", "LE8/c;", "preferencesStore", "<init>", "(LA8/b;LE8/c;)V", "Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "c", "()Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeInterface;", "externalBridge", "LXH/N;", "a", "(Lcom/contentsquare/android/api/bridge/xpf/ExternalBridgeInterface;)V", "i", "k", "()V", "v", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "projectConfig", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "j", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "", "e", "()Z", "f", "fromPreferenceStore", "d", "(Z)Z", "h", "s", "n", "isOptIn", "isTracking", "Lk8/c;", "g", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lk8/c;", "bridge", "u", "Lk8/d;", "type", "r", "(Lk8/d;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "l", "w", "y", "Lk8/b;", "capture", "x", "(Lk8/b;)V", "enable", "b", "(Z)V", "m", "LE8/b;", "key", "o", "(LE8/b;)V", "q", "p", "t", "LA8/b;", "LE8/c;", "", "Ljava/util/List;", "getRegisteredExternalBridges", "()Ljava/util/List;", "getRegisteredExternalBridges$annotations", "registeredExternalBridges", "Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "bridgeConfig", "Ljava/lang/Boolean;", "isSessionReplayEnabled", "isSessionReplayMaskingEnabled", "isCsInAppEnabled", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k8.a  reason: case insensitive filesystem */
public final class C8465a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f54352a;

    /* renamed from: b  reason: collision with root package name */
    private final c f54353b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ExternalBridgeInterface> f54354c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private BridgeConfig f54355d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f54356e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f54357f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f54358g;

    public C8465a(b bVar, c cVar) {
        C17542s.j(bVar, "configuration");
        C17542s.j(cVar, "preferencesStore");
        this.f54352a = bVar;
        this.f54353b = cVar;
        cVar.n(this);
        k();
    }

    private final void a(ExternalBridgeInterface externalBridgeInterface) {
        BridgeConfig c10 = c();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        externalBridgeInterface.updateBridgeConfig(aVar.b(BridgeConfig.Companion.serializer(), c10));
        boolean d10 = d(false);
        Boolean valueOf = Boolean.valueOf(d10);
        externalBridgeInterface.notifyCsInAppEnabled(d10);
        this.f54358g = valueOf;
    }

    private final BridgeConfig c() {
        BridgeConfig bridgeConfig = this.f54355d;
        if (bridgeConfig != null) {
            return bridgeConfig;
        }
        BridgeConfig i10 = i();
        this.f54355d = i10;
        return i10;
    }

    private final boolean d(boolean z10) {
        Boolean bool = this.f54358g;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!z10) {
                return booleanValue;
            }
        }
        return this.f54353b.b(E8.b.CLIENT_MODE_ACTIVATION_STATE, false);
    }

    private final boolean e() {
        ArrayList arrayList = C6976y3.f42972b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C8957a) {
                arrayList2.add(next);
            }
        }
        C8957a aVar = (C8957a) C16877v.y0(arrayList2);
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    private final boolean f() {
        ArrayList arrayList = C6976y3.f42972b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C8957a) {
                arrayList2.add(next);
            }
        }
        C8957a aVar = (C8957a) C16877v.y0(arrayList2);
        if (aVar != null) {
            return aVar.c();
        }
        return false;
    }

    private final c g(Boolean bool, Boolean bool2) {
        boolean z10;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = !this.f54353b.b(E8.b.IS_OPT_OUT, false) && !this.f54353b.b(E8.b.FORGET_ME, false);
        }
        return new c(z10, bool2 != null ? bool2.booleanValue() : this.f54353b.b(E8.b.TRACKING_ENABLE, false));
    }

    private final boolean h() {
        return this.f54353b.b(E8.b.SESSION_REPLAY_DEFAULT_MASKING, true);
    }

    private final BridgeConfig i() {
        JsonConfig.SessionReplay o10;
        JsonConfig.WebView s10;
        boolean e10 = e();
        boolean f10 = f();
        JsonConfig.ProjectConfiguration b10 = this.f54352a.b();
        List<JsonConfig.FeatureFlag> k10 = b10 != null ? b10.k() : null;
        if (k10 == null) {
            k10 = C16877v.n();
        }
        List<JsonConfig.FeatureFlag> list = k10;
        JsonConfig.ProjectConfiguration b11 = this.f54352a.b();
        String a10 = (b11 == null || (s10 = b11.s()) == null) ? null : s10.a();
        JsonConfig.ProjectConfiguration b12 = this.f54352a.b();
        return new BridgeConfig(f10, e10, a10, list, (b12 == null || (o10 = b12.o()) == null) ? null : o10.e());
    }

    private final JsonConfig.FeatureFlag j(JsonConfig.ProjectConfiguration projectConfiguration) {
        T t10;
        Iterator<T> it = projectConfiguration.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((JsonConfig.FeatureFlag) t10).c(), "webview_handle_data_assets")) {
                break;
            }
        }
        return (JsonConfig.FeatureFlag) t10;
    }

    private final void k() {
        JsonConfig.FeatureFlag j10;
        JsonConfig.ProjectConfiguration b10 = this.f54352a.b();
        if (b10 != null && (j10 = j(b10)) != null) {
            C6784a2.f42434a.getClass();
            C17542s.j(j10, "featureFlag");
            boolean a10 = D6.a(C8886a.f56874d.a(), j10.c());
            if (C6784a2.f42439f != a10) {
                C6784a2.f42439f = a10;
                for (Map.Entry<WebView, H> value : C6784a2.f42440g.entrySet()) {
                    ((H) value.getValue()).f46989g.f42119b = a10;
                }
                C6784a2.a();
            }
        }
    }

    private final void n() {
        boolean d10 = d(true);
        if (!C17542s.e(Boolean.valueOf(d10), this.f54358g)) {
            this.f54358g = Boolean.valueOf(d10);
            for (ExternalBridgeInterface notifyCsInAppEnabled : this.f54354c) {
                notifyCsInAppEnabled.notifyCsInAppEnabled(d10);
            }
        }
    }

    private final void r(d dVar, Boolean bool, Boolean bool2) {
        c g10 = g(bool, bool2);
        for (ExternalBridgeInterface notifySDKStateChanges : this.f54354c) {
            notifySDKStateChanges.notifySDKStateChanges(dVar, g10);
        }
    }

    private final void s() {
        boolean h10 = h();
        if (!C17542s.e(Boolean.valueOf(h10), this.f54357f)) {
            this.f54357f = Boolean.valueOf(h10);
            for (ExternalBridgeInterface notifySrMaskingHasChanged : this.f54354c) {
                notifySrMaskingHasChanged.notifySrMaskingHasChanged(h10);
            }
        }
    }

    private final void u(ExternalBridgeInterface externalBridgeInterface) {
        externalBridgeInterface.notifySDKStateChanges(d.START, g((Boolean) null, (Boolean) null));
    }

    private final void v() {
        BridgeConfig i10 = i();
        this.f54355d = i10;
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        String b10 = aVar.b(BridgeConfig.Companion.serializer(), i10);
        for (ExternalBridgeInterface updateBridgeConfig : this.f54354c) {
            updateBridgeConfig.updateBridgeConfig(b10);
        }
    }

    public final void b(boolean z10) {
        for (ExternalBridgeInterface notifySessionReplayEnabled : this.f54354c) {
            notifySessionReplayEnabled.notifySessionReplayEnabled(z10);
        }
        this.f54356e = Boolean.valueOf(z10);
        C6784a2.f42434a.getClass();
        ((D8.c) C6784a2.f42435b.getValue()).f("enableSessionReplay " + z10);
        for (H h10 : C6784a2.f42440g.values()) {
            if (!z10) {
                h10.f46989g.i();
            } else if (h10.b()) {
                h10.f46989g.f();
            }
        }
    }

    public final boolean l() {
        List<ExternalBridgeInterface> list = this.f54354c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ExternalBridgeInterface bridgeType : list) {
                if (bridgeType.getBridgeType() == ExternalBridgeType.FLUTTER) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m() {
        Boolean bool = this.f54356e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        if (bVar == E8.b.RAW_CONFIGURATION_AS_JSON) {
            v();
            k();
        }
        if (bVar == E8.b.CLIENT_MODE_ACTIVATION_STATE) {
            n();
        }
        if (bVar == E8.b.SESSION_REPLAY_DEFAULT_MASKING) {
            s();
        }
    }

    public final void p() {
        r(d.OPT_IN, Boolean.TRUE, (Boolean) null);
    }

    public final void q() {
        r(d.OPT_OUT, Boolean.FALSE, (Boolean) null);
    }

    public final void t() {
        r(d.START, (Boolean) null, (Boolean) null);
    }

    public final void w(ExternalBridgeInterface externalBridgeInterface) {
        C17542s.j(externalBridgeInterface, "externalBridge");
        if (!this.f54354c.contains(externalBridgeInterface)) {
            this.f54354c.add(externalBridgeInterface);
            a(externalBridgeInterface);
            u(externalBridgeInterface);
        }
    }

    public final void x(C8466b bVar) {
        for (ExternalBridgeInterface sessionReplayCapture : this.f54354c) {
            sessionReplayCapture.setSessionReplayCapture(bVar);
        }
    }

    public final void y(ExternalBridgeInterface externalBridgeInterface) {
        C17542s.j(externalBridgeInterface, "externalBridge");
        this.f54354c.remove(externalBridgeInterface);
    }
}
