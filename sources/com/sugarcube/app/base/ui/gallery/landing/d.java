package com.sugarcube.app.base.ui.gallery.landing;

import DF.C12754C;
import OE.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import XH.y;
import YH.X;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.adjust.sdk.Constants;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.NetworkStatus;
import com.sugarcube.app.base.ui.gallery.landing.a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001[B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0016J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R.\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0014R\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010B\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010<0<038\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020<0C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010J\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010<0<038\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u00106R\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020<0C8\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010GR*\u0010Q\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0006\u0012\u0004\u0018\u00010O0N038\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u00106R-\u0010T\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0006\u0012\u0004\u0018\u00010O0N0C8\u0006¢\u0006\f\n\u0004\bR\u0010E\u001a\u0004\bS\u0010GR\"\u0010V\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010<0<038\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u00106R\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020<0C8\u0006¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010G¨\u0006\\"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/landing/d;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "LOE/q;", "sugarcube", "<init>", "(Landroidx/lifecycle/U;Lcom/sugarcube/app/base/network/NetworkClient;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/DeviceCompatibility;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;LOE/q;)V", "LDF/C;", "sharedViewModel", "LXH/N;", "W", "(LDF/C;)V", "S", "()V", "a0", "X", "V", "U", "T", "Y", "m", "Landroidx/lifecycle/U;", "n", "Lcom/sugarcube/app/base/network/NetworkClient;", "o", "Lcom/sugarcube/app/base/data/user/UserRepo;", "p", "Lcom/sugarcube/app/base/DeviceCompatibility;", "q", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "r", "LOE/q;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "s", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "value", "t", "LDF/C;", "getSharedViewModel", "()LDF/C;", "Z", "Landroidx/lifecycle/K;", "Lcom/sugarcube/app/base/ui/gallery/landing/a;", "u", "Landroidx/lifecycle/K;", "O", "()Landroidx/lifecycle/K;", "navigateTo", "", "", "", "v", "Ljava/util/Map;", "loadedParts", "kotlin.jvm.PlatformType", "w", "_loaded", "Landroidx/lifecycle/F;", "x", "Landroidx/lifecycle/F;", "N", "()Landroidx/lifecycle/F;", "loaded", "y", "_showLogin", "z", "P", "showLogin", "LXH/v;", "Landroid/net/Uri;", "A", "_videoUris", "B", "R", "videoUris", "C", "_showUnavailableDisclaimer", "D", "Q", "showUnavailableDisclaimer", "E", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {

    /* renamed from: E  reason: collision with root package name */
    public static final c f124459E = new c((DefaultConstructorMarker) null);

    /* renamed from: F  reason: collision with root package name */
    public static final int f124460F = 8;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public static final String f124461G = "GalleryLanding";
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public static final String f124462H = "deviceCompat";
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public static final String f124463I = "user";
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final K<v<Uri, Uri>> f124464A;

    /* renamed from: B  reason: collision with root package name */
    private final F<v<Uri, Uri>> f124465B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final K<Boolean> f124466C;

    /* renamed from: D  reason: collision with root package name */
    private final F<Boolean> f124467D;

    /* renamed from: m  reason: collision with root package name */
    private final U f124468m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final NetworkClient f124469n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final UserRepo f124470o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final DeviceCompatibility f124471p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final VideoAssetRepository f124472q;

    /* renamed from: r  reason: collision with root package name */
    private final q f124473r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Analytics f124474s;

    /* renamed from: t  reason: collision with root package name */
    private C12754C f124475t;

    /* renamed from: u  reason: collision with root package name */
    private final K<a> f124476u = new K<>();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final Map<String, Boolean> f124477v;

    /* renamed from: w  reason: collision with root package name */
    private final K<Boolean> f124478w;

    /* renamed from: x  reason: collision with root package name */
    private final F<Boolean> f124479x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final K<Boolean> f124480y;

    /* renamed from: z  reason: collision with root package name */
    private final F<Boolean> f124481z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$1", f = "GalleryLandingFragment.kt", l = {347}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124482c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f124483d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.landing.d$a$a  reason: collision with other inner class name */
        static final class C3059a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f124484a;

            C3059a(d dVar) {
                this.f124484a = dVar;
            }

            /* renamed from: c */
            public final Object emit(DeviceCompatibility.a aVar, C17164e<? super C16807N> eVar) {
                Log.d(d.f124461G, "compat " + aVar);
                K L10 = this.f124484a.f124464A;
                Uri uri = this.f124484a.f124472q.get(VideoAsset.LANDING_SHOWROOMS);
                Uri uri2 = null;
                if (!aVar.c()) {
                    uri = null;
                }
                Uri uri3 = this.f124484a.f124472q.get(VideoAsset.LANDING_ENTRY_POINT);
                if (aVar.b()) {
                    uri2 = uri3;
                }
                L10.setValue(new v(uri, uri2));
                this.f124484a.f124466C.setValue(kotlin.coroutines.jvm.internal.b.a(!aVar.d()));
                this.f124484a.f124477v.put(d.f124462H, kotlin.coroutines.jvm.internal.b.a(true));
                this.f124484a.S();
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f124483d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f124483d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124482c;
            if (i10 == 0) {
                y.b(obj);
                Log.d(d.f124461G, "compat collecting...");
                C16532g<DeviceCompatibility.a> supportedFeatures = this.f124483d.f124471p.getSupportedFeatures();
                C3059a aVar = new C3059a(this.f124483d);
                this.f124482c = 1;
                if (supportedFeatures.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$2", f = "GalleryLandingFragment.kt", l = {364}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124485c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f124486d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f124487a;

            a(d dVar) {
                this.f124487a = dVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f124487a.f124480y.setValue(kotlin.coroutines.jvm.internal.b.a(!z10));
                this.f124487a.f124477v.put(d.f124463I, kotlin.coroutines.jvm.internal.b.a(true));
                this.f124487a.S();
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124486d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124486d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124485c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f124486d.f124470o.isLoggedIn();
                a aVar = new a(this.f124486d);
                this.f124485c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/landing/d$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEVICE_COMPAT_LOADED", "USER_LOADED", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$onCaptureClicked$1", f = "GalleryLandingFragment.kt", l = {407}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.gallery.landing.d$d  reason: collision with other inner class name */
    static final class C3060d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f124489d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/sugarcube/app/base/DeviceCompatibility$a;", "it", "LXH/N;", "<anonymous>", "(Lcom/sugarcube/app/base/DeviceCompatibility$a;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$onCaptureClicked$1$1", f = "GalleryLandingFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.gallery.landing.d$d$a */
        static final class a extends l implements p<DeviceCompatibility.a, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124490c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f124491d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f124492e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f124492e = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f124492e, eVar);
                aVar.f124491d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(DeviceCompatibility.a aVar, C17164e<? super C16807N> eVar) {
                return ((a) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f124490c == 0) {
                    y.b(obj);
                    this.f124492e.O().setValue(new a.C3058a(((DeviceCompatibility.a) this.f124491d).b()));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3060d(d dVar, C17164e<? super C3060d> eVar) {
            super(2, eVar);
            this.f124489d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3060d(this.f124489d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3060d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124488c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<DeviceCompatibility.a> supportedFeatures = this.f124489d.f124471p.getSupportedFeatures();
                a aVar = new a(this.f124489d, (C17164e<? super a>) null);
                this.f124488c = 1;
                if (C16534i.j(supportedFeatures, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$onSharedViewModelAvailable$1", f = "GalleryLandingFragment.kt", l = {375}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124493c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12754C f124494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C12754C c10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f124494d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f124494d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124493c;
            if (i10 == 0) {
                y.b(obj);
                VideoAssetRepository V02 = this.f124494d.V0();
                this.f124493c = 1;
                if (V02.startAssetSync(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$onSharedViewModelAvailable$2", f = "GalleryLandingFragment.kt", l = {379}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f124496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12754C f124497e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12754C f124498a;

            a(C12754C c10) {
                this.f124498a = c10;
            }

            /* renamed from: c */
            public final Object emit(NetworkStatus networkStatus, C17164e<? super C16807N> eVar) {
                if (networkStatus.getOutage()) {
                    C12754C.N2(this.f124498a, false, 1, (Object) null);
                } else if (networkStatus.getNeedsUpdate()) {
                    C12754C.P2(this.f124498a, false, 1, (Object) null);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C12754C c10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f124496d = dVar;
            this.f124497e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f124496d, this.f124497e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124495c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<NetworkStatus> a10 = C5210m.a(this.f124496d.f124469n.getNetworkStatus());
                a aVar = new a(this.f124497e);
                this.f124495c = 1;
                if (a10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingViewModel$setUnavailableDisclaimerDisplayed$1", f = "GalleryLandingFragment.kt", l = {335}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f124500d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f124500d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f124500d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124499c;
            if (i10 == 0) {
                y.b(obj);
                DeviceCompatibility D10 = this.f124500d.f124471p;
                this.f124499c = 1;
                obj = D10.updateCompatibility(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeviceCompatibility.a aVar = (DeviceCompatibility.a) obj;
            this.f124500d.f124474s.galleryOpen(aVar.b() ? Constants.NORMAL : "designOnly", aVar.e());
            return C16807N.f139792a;
        }
    }

    public d(U u10, NetworkClient networkClient, UserRepo userRepo, DeviceCompatibility deviceCompatibility, VideoAssetRepository videoAssetRepository, q qVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(networkClient, "networkClient");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(videoAssetRepository, "assetRepository");
        C17542s.j(qVar, "sugarcube");
        this.f124468m = u10;
        this.f124469n = networkClient;
        this.f124470o = userRepo;
        this.f124471p = deviceCompatibility;
        this.f124472q = videoAssetRepository;
        this.f124473r = qVar;
        this.f124474s = qVar.b();
        String str = f124462H;
        Boolean bool = Boolean.FALSE;
        this.f124477v = X.p(C16796C.a(str, bool), C16796C.a(f124463I, bool));
        K<Boolean> k10 = new K<>(Boolean.TRUE);
        this.f124478w = k10;
        this.f124479x = k10;
        K<Boolean> k11 = new K<>(bool);
        this.f124480y = k11;
        this.f124481z = k11;
        K<v<Uri, Uri>> k12 = new K<>();
        this.f124464A = k12;
        this.f124465B = k12;
        K<Boolean> k13 = new K<>(bool);
        this.f124466C = k13;
        this.f124467D = k13;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void S() {
        String str = f124461G;
        Collection<Boolean> values = this.f124477v.values();
        Log.d(str, "maybeEmitLoaded " + values);
        K<Boolean> k10 = this.f124478w;
        Iterable values2 = this.f124477v.values();
        boolean z10 = true;
        if (!(values2 instanceof Collection) || !((Collection) values2).isEmpty()) {
            Iterator it = values2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        k10.setValue(Boolean.valueOf(z10));
    }

    private final void W(C12754C c10) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(c10, (C17164e<? super e>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(this, c10, (C17164e<? super f>) null), 3, (Object) null);
    }

    public final F<Boolean> N() {
        return this.f124479x;
    }

    public final K<a> O() {
        return this.f124476u;
    }

    public final F<Boolean> P() {
        return this.f124481z;
    }

    public final F<Boolean> Q() {
        return this.f124467D;
    }

    public final F<v<Uri, Uri>> R() {
        return this.f124465B;
    }

    public final void T() {
        this.f124474s.galleryKreativMarketingNewCapture();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3060d(this, (C17164e<? super C3060d>) null), 3, (Object) null);
    }

    public final void U() {
        this.f124474s.galleryKreativMarketingViewShowrooms();
        this.f124476u.setValue(a.b.f124454a);
    }

    public final void V() {
        this.f124474s.galleryKreativMarketingLogin();
        this.f124476u.setValue(a.c.f124455a);
    }

    public final void X() {
        this.f124474s.galleryKreativMarketingSignUp();
        this.f124476u.setValue(a.d.f124456a);
    }

    public final void Y() {
        this.f124473r.b().kreativEntryIntroView();
    }

    public final void Z(C12754C c10) {
        this.f124475t = c10;
        if (c10 != null) {
            W(c10);
        }
    }

    public final void a0() {
        this.f124466C.setValue(Boolean.FALSE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
    }
}
