package com.ingka.ikea.core.android.activities;

import HJ.C15854t;
import XH.C16807N;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import com.ingka.ikea.navigation.interop.IkeaComposableNavHostFragment;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.b;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import x4.C;
import x4.C8951o;
import x4.x;
import x4.y;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b'\u0018\u0000 Q2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\nJ\u001f\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0015¢\u0006\u0004\b#\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0014X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R(\u00108\u001a\b\u0012\u0004\u0012\u000201008\u0016@\u0016X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010E\u001a\u0004\u0018\u00010@8\u0016X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010&R\u0014\u0010I\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010.R\u0014\u0010K\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010.R\u0014\u0010\u001a\u001a\u00020\u00198DX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/ingka/ikea/core/android/activities/NavigationHostActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "<init>", "()V", "LXH/N;", "N0", "B0", "Landroid/os/Bundle;", "outState", "Q0", "(Landroid/os/Bundle;)V", "savedInstanceState", "P0", "G0", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "onCreate", "onDestroy", "onStart", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStop", "onSaveInstanceState", "onRestoreInstanceState", "Lx4/o;", "navController", "Lx4/x;", "navGraph", "O0", "(Lx4/o;Lx4/x;)Lx4/x;", "Landroid/net/Uri;", "uri", "Lx4/C;", "navOptions", "L0", "(Landroid/net/Uri;Lx4/C;)V", "H", "Landroid/os/Bundle;", "J0", "()Landroid/os/Bundle;", "startDestinationArgs", "", "I", "Ljava/lang/String;", "E0", "()Ljava/lang/String;", "graphRootRoute", "", "Low/b;", "J", "Ljava/util/Set;", "D0", "()Ljava/util/Set;", "setDestinationBuilders", "(Ljava/util/Set;)V", "destinationBuilders", "Lcom/ingka/ikea/navigation/interop/IkeaComposableNavHostFragment;", "K", "Lcom/ingka/ikea/navigation/interop/IkeaComposableNavHostFragment;", "_navHostFragment", "L", "Lx4/o;", "_navController", "Lx4/o$c;", "M", "Lx4/o$c;", "H0", "()Lx4/o$c;", "onDestinationChangedListener", "N", "restoreOnCreateBundle", "K0", "startRoute", "I0", "path", "F0", "()Lx4/o;", "C0", "()Landroid/net/Uri;", "contentUri", "O", "a", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NavigationHostActivity extends Hilt_NavigationHostActivity {

    /* renamed from: O  reason: collision with root package name */
    public static final a f94830O = new a((DefaultConstructorMarker) null);

    /* renamed from: P  reason: collision with root package name */
    public static final int f94831P = 8;

    /* renamed from: H  reason: collision with root package name */
    private final Bundle f94832H;

    /* renamed from: I  reason: collision with root package name */
    private final String f94833I;

    /* renamed from: J  reason: collision with root package name */
    public Set<b> f94834J;

    /* renamed from: K  reason: collision with root package name */
    private IkeaComposableNavHostFragment f94835K;

    /* renamed from: L  reason: collision with root package name */
    private C8951o f94836L;

    /* renamed from: M  reason: collision with root package name */
    private final C8951o.c f94837M;

    /* renamed from: N  reason: collision with root package name */
    private Bundle f94838N;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/android/activities/NavigationHostActivity$a;", "", "<init>", "()V", "", "pathToAppend", "a", "(Ljava/lang/String;)Ljava/lang/String;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            C17542s.j(str, "pathToAppend");
            return "ikea://navigation/" + str;
        }

        private a() {
        }
    }

    private final void B0() {
        Uri C02 = C0();
        if (C02 == null) {
            return;
        }
        if (F0().L().D(C02)) {
            Intent intent = getIntent();
            if (intent != null) {
                intent.setData((Uri) null);
            }
            M0(this, C02, (C) null, 2, (Object) null);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not navigate to contentUri: " + C02);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
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
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getBundle(getClass().getSimpleName());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle G0(android.os.Bundle r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0010
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            android.os.Bundle r2 = r1.f94838N
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.android.activities.NavigationHostActivity.G0(android.os.Bundle):android.os.Bundle");
    }

    public static /* synthetic */ void M0(NavigationHostActivity navigationHostActivity, Uri uri, C c10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                c10 = null;
            }
            navigationHostActivity.L0(uri, c10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToContentUri");
    }

    private final void N0() {
        B0();
    }

    private final void P0(Bundle bundle) {
        Bundle bundle2;
        if (this.f94836L != null) {
            Bundle G02 = G0(bundle);
            if (G02 != null) {
                F0().z0(G02);
            }
            bundle2 = null;
        } else {
            bundle2 = G0(bundle);
        }
        this.f94838N = bundle2;
    }

    private final void Q0(Bundle bundle) {
        Bundle bundle2;
        C8951o oVar = this.f94836L;
        if (oVar == null || (bundle2 = oVar.B0()) == null) {
            bundle2 = this.f94838N;
        }
        if (bundle2 != null) {
            String simpleName = getClass().getSimpleName();
            Bundle bundle3 = new Bundle();
            bundle3.putAll(bundle2);
            C16807N n10 = C16807N.f139792a;
            bundle.putBundle(simpleName, bundle3);
        }
    }

    public final Uri C0() {
        Uri uri;
        String queryParameter;
        Bundle extras;
        Intent intent;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null || (intent = (Intent) extras.getParcelable("android-support-nav:controller:deepLinkIntent")) == null || (uri = intent.getData()) == null) {
            Intent intent3 = getIntent();
            uri = intent3 != null ? intent3.getData() : null;
        }
        if (!(uri == null || (queryParameter = uri.getQueryParameter("contentUri")) == null)) {
            Uri parse = Uri.parse(Uri.decode(queryParameter));
            String a10 = f94830O.a(c.b(I0()));
            String uri2 = uri.toString();
            C17542s.i(uri2, "toString(...)");
            if (C15854t.d0(uri2, a10, false, 2, (Object) null)) {
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    extras2.clear();
                }
                return parse;
            }
        }
        return null;
    }

    public Set<b> D0() {
        Set<b> set = this.f94834J;
        if (set != null) {
            return set;
        }
        C17542s.z("destinationBuilders");
        return null;
    }

    /* access modifiers changed from: protected */
    public String E0() {
        return this.f94833I;
    }

    /* access modifiers changed from: protected */
    public final C8951o F0() {
        C8951o oVar = this.f94836L;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public C8951o.c H0() {
        return this.f94837M;
    }

    public abstract String I0();

    public Bundle J0() {
        return this.f94832H;
    }

    public abstract String K0();

    /* access modifiers changed from: protected */
    public void L0(Uri uri, C c10) {
        C17542s.j(uri, "uri");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Navigating to contentUri: " + C0(), (Throwable) null);
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
        F0().Y(uri, c10);
    }

    public x O0(C8951o oVar, x xVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(xVar, "navGraph");
        return xVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Uo.b.f88330b);
        P0(bundle);
        C5187o p02 = getSupportFragmentManager().p0(Uo.a.f88326g);
        C17542s.h(p02, "null cannot be cast to non-null type com.ingka.ikea.navigation.interop.IkeaComposableNavHostFragment");
        IkeaComposableNavHostFragment ikeaComposableNavHostFragment = (IkeaComposableNavHostFragment) p02;
        this.f94835K = ikeaComposableNavHostFragment;
        if (this.f94836L == null) {
            this.f94836L = ikeaComposableNavHostFragment != null ? ikeaComposableNavHostFragment.o0() : null;
            P0(bundle);
            y yVar = new y(F0().O(), K0(), E0());
            for (b bVar : D0()) {
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Adding destinations for destination provider: " + bVar.getClass().getSimpleName(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = y.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                bVar.a(yVar);
            }
            x j10 = yVar.c();
            Bundle J02 = J0();
            Intent intent = getIntent();
            setIntent(new Intent());
            F0().F0(O0(F0(), j10), J02);
            setIntent(intent);
        }
        if (bundle == null) {
            N0();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f94838N = null;
        this.f94835K = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
        B0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        C17542s.j(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        P0(bundle);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Q0(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C8951o.c H02 = H0();
        if (H02 != null) {
            F0().r(H02);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C8951o.c H02 = H0();
        if (H02 != null) {
            F0().y0(H02);
        }
        super.onStop();
    }
}
