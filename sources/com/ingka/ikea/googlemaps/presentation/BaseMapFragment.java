package com.ingka.ikea.googlemaps.presentation;

import HJ.C15854t;
import Ma.C9140b;
import Tr.C10945a;
import Tr.C10946b;
import Tr.C10947c;
import Tr.C10948d;
import Tr.C10949e;
import Tr.C10950f;
import Tr.C10951g;
import Tr.C10952h;
import Tr.C10953i;
import Tr.C10954j;
import Tr.C10955k;
import XH.C16807N;
import YH.C16877v;
import am.d;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import com.google.android.gms.common.api.l;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ingka.ikea.appconfig.model.LocationLatLngBounds;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.sugarcube.core.logger.DslKt;
import g.C5314c;
import h.C5405c;
import ip.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import na.C8594c;
import na.f;
import na.g;
import na.h;
import na.m;
import oa.C8617a;
import oa.C8618b;
import oa.C8619c;
import qa.b;
import qa.c;
import qa.h;
import qa.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import w2.C6214h;
import xa.C8971l;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010\u001fJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\u0018H\u0004¢\u0006\u0004\b9\u0010:J#\u0010>\u001a\u00020=*\u0002062\u0006\u0010\f\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0018H\u0004¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u0018H\u0004¢\u0006\u0004\bA\u0010\u001bJ'\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020BH\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0004¢\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u0004H\u0004¢\u0006\u0004\bH\u0010\u0003R\u001a\u0010M\u001a\u00020\u00188\u0014XD¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u0004\u0018\u00010f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u00107\u001a\u0004\u0018\u0001068\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010v\u001a\u00020\u00188\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bJ\u0010J\u001a\u0004\bt\u0010L\"\u0004\bu\u0010\u001bR\u0018\u0010y\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010xR\u001a\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0|8\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010JR\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u0012\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010B0B0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/googlemaps/presentation/BaseMapFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "LXH/N;", "l1", "", "id", "Lqa/b;", "r1", "(I)Lqa/b;", "Landroid/location/Location;", "location", "P0", "(Landroid/location/Location;)V", "q1", "Lcom/google/android/gms/location/LocationRequest;", "U0", "()Lcom/google/android/gms/location/LocationRequest;", "o1", "Landroid/app/Activity;", "activity", "c1", "(Landroid/app/Activity;)V", "", "requestPermission", "Q0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onPause", "onDestroy", "onLowMemory", "outState", "onSaveInstanceState", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Loa/c;", "googleMap", "setDefaultLocation", "j1", "(Loa/c;Z)V", "Lcom/google/android/gms/maps/model/LatLng;", "isSelected", "Lqa/h;", "O0", "(Loa/c;Lcom/google/android/gms/maps/model/LatLng;Z)Lqa/h;", "animate", "s1", "", "latLngString", "poiName", "p1", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V", "k1", "V0", "R", "Z", "v0", "()Z", "drawUnderStatusBar", "LEo/a;", "S", "LEo/a;", "X0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LIl/a;", "T", "LIl/a;", "W0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "Lam/d;", "U", "Lam/d;", "Y0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "Lcom/google/android/gms/maps/MapView;", "X", "Lcom/google/android/gms/maps/MapView;", "getMapView", "()Lcom/google/android/gms/maps/MapView;", "i1", "(Lcom/google/android/gms/maps/MapView;)V", "mapView", "Y", "Loa/c;", "Z0", "()Loa/c;", "h1", "(Loa/c;)V", "a1", "setUserLocationAllowed", "isUserLocationAllowed", "y0", "Lqa/h;", "poiMarker", "z0", "userMarker", "Landroidx/lifecycle/K;", "A0", "Landroidx/lifecycle/K;", "userLocation", "B0", "requestLocationsEnabled", "Lna/c;", "C0", "Lna/c;", "fusedLocationClient", "Lna/f;", "D0", "Lna/f;", "locationCallback", "Lg/c;", "kotlin.jvm.PlatformType", "E0", "Lg/c;", "requestPermissionLauncher", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMapFragment extends Hilt_BaseMapFragment {
    /* access modifiers changed from: private */

    /* renamed from: A0  reason: collision with root package name */
    public final K<Location> f95973A0 = new K<>();

    /* renamed from: B0  reason: collision with root package name */
    private boolean f95974B0;

    /* renamed from: C0  reason: collision with root package name */
    private C8594c f95975C0;

    /* renamed from: D0  reason: collision with root package name */
    private f f95976D0;

    /* renamed from: E0  reason: collision with root package name */
    private final C5314c<String> f95977E0;

    /* renamed from: R  reason: collision with root package name */
    private final boolean f95978R = true;

    /* renamed from: S  reason: collision with root package name */
    public Eo.a f95979S;

    /* renamed from: T  reason: collision with root package name */
    public Il.a f95980T;

    /* renamed from: U  reason: collision with root package name */
    public d f95981U;

    /* renamed from: X  reason: collision with root package name */
    private MapView f95982X;

    /* renamed from: Y  reason: collision with root package name */
    private C8619c f95983Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f95984Z;

    /* renamed from: y0  reason: collision with root package name */
    private h f95985y0;

    /* renamed from: z0  reason: collision with root package name */
    private h f95986z0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/googlemaps/presentation/BaseMapFragment$a", "Lna/f;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "LXH/N;", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseMapFragment f95987a;

        a(BaseMapFragment baseMapFragment) {
            this.f95987a = baseMapFragment;
        }

        public void b(LocationResult locationResult) {
            C17542s.j(locationResult, "locationResult");
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("onLocationResult, available: " + locationResult, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            Location x10 = locationResult.x();
            if (x10 != null) {
                this.f95987a.f95973A0.postValue(x10);
            }
        }
    }

    public BaseMapFragment() {
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new C10946b(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f95977E0 = registerForActivityResult;
    }

    private final void P0(Location location) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        h hVar = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Add user marker", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.f95986z0 == null) {
            i iVar = new i();
            iVar.v3(latLng);
            b r12 = r1(Rr.a.f87006c);
            if (r12 != null) {
                iVar.z2(r12);
            }
            C8619c cVar = this.f95983Y;
            if (cVar != null) {
                hVar = cVar.a(iVar);
            }
            this.f95986z0 = hVar;
        }
        h hVar2 = this.f95986z0;
        if (hVar2 != null) {
            hVar2.k(latLng);
            hVar2.p(true);
        }
    }

    private final void Q0(boolean z10) {
        C5191t activity = getActivity();
        Context context = getContext();
        boolean z11 = false;
        if (context != null && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            z11 = true;
        }
        if (!z11) {
            if (!z10) {
                return;
            }
            if (shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                l1();
                return;
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("checkLocationSettings, requesting permission", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            this.f95977E0.a("android.permission.ACCESS_FINE_LOCATION");
        } else if (z11 && activity != null) {
            c1(activity);
            h.a a11 = new h.a().a(U0());
            C17542s.i(a11, "addLocationRequest(...)");
            m c10 = g.c(activity);
            C17542s.i(c10, "getSettingsClient(...)");
            C8971l<na.i> d10 = c10.d(a11.b());
            C17542s.i(d10, "checkLocationSettings(...)");
            d10.g(new C10948d(new C10947c(this))).e(new C10949e(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(BaseMapFragment baseMapFragment, na.i iVar) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("location settings sufficient", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = baseMapFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        baseMapFragment.o1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void S0(C17642l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void T0(BaseMapFragment baseMapFragment, Exception exc) {
        String str;
        int i10;
        Exception exc2 = exc;
        C17542s.j(exc2, "exception");
        e eVar = e.INFO;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Location settings not satisfied", exc2);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = baseMapFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, exc, str4);
            str3 = str5;
            str2 = str4;
        }
        if (exc2 instanceof l) {
            try {
                if (baseMapFragment.getActivity() != null) {
                    baseMapFragment.startIntentSenderForResult(((l) exc2).c().getIntentSender(), 6382, (Intent) null, 0, 0, 0, (Bundle) null);
                }
            } catch (IntentSender.SendIntentException e10) {
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a("Error starting resolution handling", e10);
                        if (a11 != null) {
                            str6 = C11820c.a(a11);
                        } else {
                            return;
                        }
                    }
                    if (str7 == null) {
                        String name2 = baseMapFragment.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, e10, str6);
                    i10 = 2;
                }
            }
        }
    }

    private final LocationRequest U0() {
        LocationRequest x10 = LocationRequest.x();
        C17542s.i(x10, "create(...)");
        x10.c2(C10955k.f87853a);
        x10.y2(1);
        x10.z2(100);
        return x10;
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(BaseMapFragment baseMapFragment, Location location) {
        C17542s.j(location, "it");
        boolean z10 = baseMapFragment.f95986z0 != null;
        baseMapFragment.P0(location);
        if (!z10) {
            t1(baseMapFragment, false, 1, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void c1(Activity activity) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Request last known location", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C8594c a11 = g.a(activity);
        C17542s.i(a11, "getFusedLocationProviderClient(...)");
        a11.f().g(new C10953i(new C10952h(this))).e(new C10954j(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(BaseMapFragment baseMapFragment, Location location) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Fused location callback: " + location, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = baseMapFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (location != null) {
            baseMapFragment.f95973A0.postValue(location);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e1(C17642l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void f1(BaseMapFragment baseMapFragment, Exception exc) {
        C17542s.j(exc, "it");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Unable to get last location result", exc);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = baseMapFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, exc, str3);
            str = str3;
            str2 = str4;
        }
    }

    /* access modifiers changed from: private */
    public static final void g1(BaseMapFragment baseMapFragment, Boolean bool) {
        C17542s.j(bool, "isGranted");
        if (bool.booleanValue()) {
            baseMapFragment.o1();
        }
    }

    private final void l1() {
        Context context = getContext();
        if (context != null) {
            C9140b bVar = new C9140b(context);
            bVar.setTitle(getString(Oo.b.f84802u4));
            bVar.f(getString(Oo.b.f84791t4));
            bVar.setPositiveButton(Oo.b.f84478Q0, new C10950f(this));
            bVar.g(getString(Oo.b.f84488R0), new C10951g());
            bVar.u(true);
            bVar.p();
        }
    }

    /* access modifiers changed from: private */
    public static final void m1(BaseMapFragment baseMapFragment, DialogInterface dialogInterface, int i10) {
        baseMapFragment.startActivity(baseMapFragment.Y0().c());
    }

    /* access modifiers changed from: private */
    public static final void n1(DialogInterface dialogInterface, int i10) {
    }

    private final void o1() {
        Context context = getContext();
        boolean z10 = false;
        if (context != null && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            z10 = true;
        }
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        f fVar = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("startLocationUpdates, hasPermission: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (z10) {
            this.f95974B0 = true;
            C8594c cVar = this.f95975C0;
            if (cVar == null) {
                C17542s.z("fusedLocationClient");
                cVar = null;
            }
            LocationRequest U02 = U0();
            f fVar2 = this.f95976D0;
            if (fVar2 == null) {
                C17542s.z("locationCallback");
            } else {
                fVar = fVar2;
            }
            cVar.b(U02, fVar, Looper.getMainLooper());
        }
    }

    private final void q1() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        f fVar = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("stopLocationUpdates", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C8594c cVar = this.f95975C0;
        if (cVar == null) {
            C17542s.z("fusedLocationClient");
            cVar = null;
        }
        f fVar2 = this.f95976D0;
        if (fVar2 == null) {
            C17542s.z("locationCallback");
        } else {
            fVar = fVar2;
        }
        cVar.c(fVar);
    }

    private final b r1(int i10) {
        Drawable e10 = C6214h.e(getResources(), i10, (Resources.Theme) null);
        if (e10 == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(e10.getIntrinsicWidth(), e10.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        e10.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        e10.draw(canvas);
        return c.a(createBitmap);
    }

    public static /* synthetic */ void t1(BaseMapFragment baseMapFragment, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            baseMapFragment.s1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomInOnMarkers");
    }

    /* access modifiers changed from: protected */
    public final qa.h O0(C8619c cVar, LatLng latLng, boolean z10) {
        C17542s.j(cVar, "<this>");
        C17542s.j(latLng, "location");
        i iVar = new i();
        iVar.v3(latLng);
        b r12 = r1(z10 ? Rr.a.f87005b : Rr.a.f87004a);
        if (r12 != null) {
            iVar.z2(r12);
        }
        qa.h a10 = cVar.a(iVar);
        if (a10 != null) {
            if (z10) {
                this.f95985y0 = a10;
            }
            return a10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: protected */
    public final void V0() {
        Location value = this.f95973A0.getValue();
        if (value != null) {
            LatLng latLng = new LatLng(value.getLatitude(), value.getLongitude());
            C8619c cVar = this.f95983Y;
            if (cVar != null) {
                cVar.b(C8618b.b(latLng));
                return;
            }
            return;
        }
        Q0(true);
    }

    public final Il.a W0() {
        Il.a aVar = this.f95980T;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final Eo.a X0() {
        Eo.a aVar = this.f95979S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final d Y0() {
        d dVar = this.f95981U;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    /* access modifiers changed from: protected */
    public final C8619c Z0() {
        return this.f95983Y;
    }

    /* access modifiers changed from: protected */
    public final boolean a1() {
        return this.f95984Z;
    }

    /* access modifiers changed from: protected */
    public final void h1(C8619c cVar) {
        this.f95983Y = cVar;
    }

    /* access modifiers changed from: protected */
    public final void i1(MapView mapView) {
        this.f95982X = mapView;
    }

    /* access modifiers changed from: protected */
    public final void j1(C8619c cVar, boolean z10) {
        Integer d10;
        LocationLatLngBounds c10;
        C8619c cVar2 = cVar;
        C17542s.j(cVar2, "googleMap");
        char c11 = '.';
        char c12 = '$';
        int i10 = 2;
        try {
            if (!cVar2.p(qa.g.x(requireContext(), Rr.b.f87007a))) {
                e eVar = e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                String str = null;
                String str2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11819b bVar = (C11819b) it.next();
                    if (str == null) {
                        String a10 = C11818a.a("Map could not be styled", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), c11, (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    c11 = '.';
                }
            } else {
                e eVar2 = e.DEBUG;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                String str3 = null;
                String str4 = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C11819b bVar2 = (C11819b) it2.next();
                    if (str3 == null) {
                        String a11 = C11818a.a("Map will be styled", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str3 = C11820c.a(a11);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name2 = getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    String str6 = str4;
                    bVar2.a(eVar2, str6, false, (Throwable) null, str5);
                    str3 = str5;
                    str4 = str6;
                }
            }
        } catch (Resources.NotFoundException unused) {
            IllegalStateException illegalStateException = new IllegalStateException("Map style not found, continue without styling");
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str7 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 == null) {
                        break;
                    }
                    str7 = C11820c.a(a12);
                }
                if (str8 == null) {
                    String name3 = getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str8, false, illegalStateException, str7);
                c12 = '$';
            }
        }
        cVar2.o(2);
        cVar2.r(18.0f);
        LatLng latLng = new LatLng(0.0d, 0.0d);
        MapServiceData r10 = W0().r();
        if (!(r10 == null || (c10 = r10.c()) == null)) {
            e eVar4 = e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str9 == null) {
                    String a13 = C11818a.a("Set latLngBounds: " + c10, (Throwable) null);
                    if (a13 == null) {
                        break;
                    }
                    str9 = C11820c.a(a13);
                }
                if (str10 == null) {
                    String name4 = getClass().getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str10, false, (Throwable) null, str9);
                i10 = 2;
            }
            LatLngBounds latLngBounds = new LatLngBounds(new LatLng(c10.b().a(), c10.b().b()), new LatLng(c10.a().a(), c10.a().b()));
            cVar2.m(latLngBounds);
            latLng = latLngBounds.x();
        }
        MapServiceData r11 = W0().r();
        if (!(r11 == null || (d10 = r11.d()) == null)) {
            cVar2.s((float) d10.intValue());
        }
        if (z10) {
            cVar2.h(C8618b.d(latLng, 14.0f));
        } else {
            cVar2.h(C8618b.e(14.0f));
        }
    }

    /* access modifiers changed from: protected */
    public final void k1() {
        Location value = this.f95973A0.getValue();
        if (value != null) {
            P0(value);
        }
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("onActivityResult, requestCode: " + i10 + ", resultCode: " + i11, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (i10 == 6382 && i11 == -1) {
            o1();
        }
    }

    public void onAttach(Context context) {
        qa.h hVar;
        C17542s.j(context, "context");
        super.onAttach(context);
        MapServiceData r10 = W0().r();
        boolean z10 = false;
        boolean z11 = (r10 != null ? r10.c() : null) == null;
        this.f95984Z = z11;
        if (!z11 && (hVar = this.f95986z0) != null) {
            hVar.p(false);
        }
        if (context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            z10 = true;
        }
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("onAttach, isUserLocationAllowed: " + a1() + ", hasLocationPermission: " + z10, (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95976D0 = new a(this);
        this.f95975C0 = g.a(requireActivity());
        Q0(false);
    }

    public void onDestroy() {
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.c();
        }
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.d();
        }
    }

    public void onPause() {
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.e();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.f();
        }
        if (this.f95974B0) {
            o1();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.g(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.h();
        }
    }

    public void onStop() {
        super.onStop();
        MapView mapView = this.f95982X;
        if (mapView != null) {
            mapView.i();
        }
        q1();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        K<Location> k10 = this.f95973A0;
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(k10, viewLifecycleOwner, new C10945a(this));
    }

    /* access modifiers changed from: protected */
    public final void p1(String str, Context context, String str2) {
        C17542s.j(str, "latLngString");
        C17542s.j(context, "context");
        C17542s.j(str2, "poiName");
        Iterable<String> X02 = C15854t.X0(str, new char[]{','}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(X02, 10));
        for (String z12 : X02) {
            arrayList.add(C15854t.z1(z12).toString());
        }
        MapServiceData r10 = W0().r();
        String a10 = r10 != null ? r10.a((String) arrayList.get(0), (String) arrayList.get(1), str2) : null;
        if (a10 == null || C15854t.v0(a10)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=" + str)));
            } catch (ActivityNotFoundException unused) {
                X0().a(context, "http://maps.google.com/maps?daddr=" + str);
            }
        } else {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, true)) {
                    arrayList2.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("navigation url: " + a10, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str4;
                bVar.a(eVar, str5, true, (Throwable) null, str3);
                str4 = str5;
            }
            X0().a(context, a10);
        }
    }

    /* access modifiers changed from: protected */
    public final void s1(boolean z10) {
        qa.h hVar;
        MapView mapView;
        String str;
        Object obj;
        boolean z11 = z10;
        C8619c cVar = this.f95983Y;
        if (cVar != null && (hVar = this.f95985y0) != null && (mapView = this.f95982X) != null) {
            qa.h hVar2 = this.f95986z0;
            if (!this.f95984Z || hVar2 == null || !hVar2.c()) {
                C8617a b10 = C8618b.b(hVar.a());
                C17542s.i(b10, "newLatLng(...)");
                C10955k.c(cVar, b10, z11);
                return;
            }
            LatLngBounds a10 = new LatLngBounds.a().b(hVar.a()).b(hVar2.a()).a();
            C17542s.i(a10, "build(...)");
            int width = mapView.getWidth();
            int height = mapView.getHeight();
            int min = (int) (((double) Math.min(width, height)) * 0.15d);
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str2 = null;
            String str3 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = DslKt.INDICATOR_BACKGROUND;
                if (!hasNext) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str2 == null) {
                    String a11 = C11818a.a("Zooming to bounds:" + a10 + ", width:" + width + ", height:" + height + ", padding:" + min, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    obj = null;
                    String str5 = name;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    String P02 = o12.length() == 0 ? str5 : C15854t.P0(o12, "Kt");
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str = DslKt.INDICATOR_MAIN;
                    }
                    str3 = str + DslKt.INDICATOR_SEPARATOR + P02;
                } else {
                    obj = null;
                }
                String str6 = str3;
                Object obj2 = obj;
                bVar.a(eVar, str6, false, (Throwable) null, str4);
                str3 = str6;
                str2 = str4;
            }
            String str7 = null;
            try {
                C8617a c10 = C8618b.c(a10, width, height, min);
                C17542s.i(c10, "newLatLngBounds(...)");
                C10955k.c(cVar, c10, z11);
            } catch (com.google.android.gms.common.api.b unused) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("width: " + width + " height: " + height + " padding: " + min);
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str9 == null) {
                        String a12 = C11818a.a(str7, illegalArgumentException);
                        if (a12 != null) {
                            str9 = C11820c.a(a12);
                        } else {
                            return;
                        }
                    }
                    if (str8 == null) {
                        String name2 = getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', str7, 2, str7), '.', str7, 2, str7);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str8, false, illegalArgumentException, str9);
                    str7 = null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f95978R;
    }
}
