package F8;

import G8.e;
import XH.C16824o;
import XH.C16825p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0006*\u000215\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@BX\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001b\u00104\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b%\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010/¨\u0006:"}, d2 = {"LF8/d;", "", "Landroid/content/Context;", "context", "LF8/b;", "cellularHelper", "LG8/e;", "buildInstantiable", "<init>", "(Landroid/content/Context;LF8/b;LG8/e;)V", "Landroid/telephony/TelephonyDisplayInfo;", "telephonyDisplayInfo", "LXH/N;", "e", "(Landroid/telephony/TelephonyDisplayInfo;)V", "LF8/d$a;", "onCellularNetworkChanged", "i", "(LF8/d$a;)V", "Landroid/net/Network;", "network", "LF8/e;", "d", "(Landroid/net/Network;)LF8/e;", "a", "Landroid/content/Context;", "b", "LF8/b;", "c", "LG8/e;", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "telephonyManager", "LD8/c;", "f", "LD8/c;", "logger", "g", "LF8/d$a;", "callback", "", "<set-?>", "h", "Z", "()Z", "isListening", "F8/d$c$a", "LXH/o;", "()LF8/d$c$a;", "callbackStartingApi31", "F8/d$b", "j", "LF8/d$b;", "callbackForApi30", "isConnectedToWifi", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35508a;

    /* renamed from: b  reason: collision with root package name */
    private final b f35509b;

    /* renamed from: c  reason: collision with root package name */
    private final e f35510c;

    /* renamed from: d  reason: collision with root package name */
    private final ConnectivityManager f35511d;

    /* renamed from: e  reason: collision with root package name */
    private final TelephonyManager f35512e;

    /* renamed from: f  reason: collision with root package name */
    private final D8.c f35513f;

    /* renamed from: g  reason: collision with root package name */
    private a f35514g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f35515h;

    /* renamed from: i  reason: collision with root package name */
    private final C16824o f35516i;
    @SuppressLint({"MissingPermission"})

    /* renamed from: j  reason: collision with root package name */
    private final b f35517j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LF8/d$a;", "", "LF8/e;", "connectionType", "LXH/N;", "a", "(LF8/e;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(e eVar);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"F8/d$b", "Landroid/telephony/PhoneStateListener;", "Landroid/telephony/TelephonyDisplayInfo;", "telephonyDisplayInfo", "LXH/N;", "onDisplayInfoChanged", "(Landroid/telephony/TelephonyDisplayInfo;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends PhoneStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f35518a;

        public b(d dVar) {
            this.f35518a = dVar;
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            C17542s.j(telephonyDisplayInfo, "telephonyDisplayInfo");
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            this.f35518a.e(telephonyDisplayInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0003*\u0001\u0000\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"F8/d$c$a", "b", "()LF8/d$c$a;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17631a<a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f35519c;

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"F8/d$c$a", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$DisplayInfoListener;", "Landroid/telephony/TelephonyDisplayInfo;", "telephonyDisplayInfo", "LXH/N;", "onDisplayInfoChanged", "(Landroid/telephony/TelephonyDisplayInfo;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f35520a;

            public a(d dVar) {
                this.f35520a = dVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                C17542s.j(telephonyDisplayInfo, "telephonyDisplayInfo");
                this.f35520a.e(telephonyDisplayInfo);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f35519c = dVar;
        }

        /* renamed from: b */
        public final a invoke() {
            return new a(this.f35519c);
        }
    }

    public d(Context context, b bVar, e eVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "cellularHelper");
        C17542s.j(eVar, "buildInstantiable");
        this.f35508a = context;
        this.f35509b = bVar;
        this.f35510c = eVar;
        Object systemService = context.getSystemService("connectivity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f35511d = (ConnectivityManager) systemService;
        Object systemService2 = context.getSystemService("phone");
        C17542s.h(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService2;
        this.f35512e = telephonyManager;
        this.f35513f = new D8.c("CellularNetworkDetection");
        this.f35516i = C16825p.b(new c(this));
        b bVar2 = new b(this);
        this.f35517j = bVar2;
        if (bVar.d()) {
            try {
                if (eVar.e(31)) {
                    telephonyManager.registerTelephonyCallback(new c(), f());
                } else if (Build.VERSION.SDK_INT == 30) {
                    telephonyManager.listen(bVar2, ImageMetadata.SHADING_MODE);
                } else {
                    return;
                }
                this.f35515h = true;
            } catch (SecurityException e10) {
                this.f35515h = false;
                D8.c cVar = this.f35513f;
                cVar.i(e10, "We couldn't register on TelephonyManager on SDK " + Build.VERSION.SDK_INT);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b(Runnable runnable) {
        C17542s.j(runnable, "obj");
        runnable.run();
    }

    /* access modifiers changed from: private */
    public final void e(TelephonyDisplayInfo telephonyDisplayInfo) {
        if (!g()) {
            e b10 = this.f35509b.b(telephonyDisplayInfo);
            a aVar = this.f35514g;
            if (aVar != null) {
                aVar.a(b10);
            }
        }
    }

    private final c.a f() {
        return (c.a) this.f35516i.getValue();
    }

    private final boolean g() {
        ConnectivityManager connectivityManager = this.f35511d;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1);
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final e d(Network network) {
        int subtype;
        C17542s.j(network, "network");
        if (this.f35509b.d()) {
            int i10 = 0;
            try {
                if (this.f35510c.e(24)) {
                    subtype = this.f35512e.getDataNetworkType();
                } else {
                    NetworkInfo networkInfo = this.f35511d.getNetworkInfo(network);
                    if (networkInfo != null) {
                        subtype = networkInfo.getSubtype();
                    }
                    return this.f35509b.a(i10);
                }
                i10 = subtype;
            } catch (SecurityException e10) {
                this.f35513f.i(e10, "Failed to get connection type");
            }
            return this.f35509b.a(i10);
        }
        this.f35513f.l("Required permissions not granted for determining Cellular Network !");
        return e.CONNECTIVITY_ERROR;
    }

    public final boolean h() {
        return this.f35515h;
    }

    public final void i(a aVar) {
        C17542s.j(aVar, "onCellularNetworkChanged");
        this.f35514g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Context context, b bVar, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new b(context, (e) null, 2, (DefaultConstructorMarker) null) : bVar, (i10 & 4) != 0 ? new e() : eVar);
    }
}
