package com.ingka.ikea.checkout.impl.delivery;

import Ar.j;
import HJ.C15854t;
import XH.C16807N;
import XH.C16824o;
import am.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Q;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.ingka.ikea.checkout.impl.delivery.fragments.PickupPointDetailsFragment;
import com.ingka.ikea.checkout.impl.l0;
import com.ingka.ikea.checkout.impl.m0;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lg.C10024a;
import lo.s;
import lo.v;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/PickupPointDetailsActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "<init>", "()V", "LXH/N;", "I0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lam/e;", "H", "Lam/e;", "E0", "()Lam/e;", "setGoogleCompatibilityApi", "(Lam/e;)V", "googleCompatibilityApi", "LAr/j;", "I", "LAr/j;", "D0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "", "Llo/s;", "J", "Ljava/util/List;", "pickupPointHolder", "", "K", "Z", "pickupPointSelectionSupported", "Llo/v;", "L", "LXH/o;", "F0", "()Llo/v;", "pickupPointSelectedViewModel", "M", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickupPointDetailsActivity extends a {

    /* renamed from: M  reason: collision with root package name */
    public static final a f94449M = new a((DefaultConstructorMarker) null);

    /* renamed from: N  reason: collision with root package name */
    public static final int f94450N = 8;

    /* renamed from: H  reason: collision with root package name */
    public e f94451H;

    /* renamed from: I  reason: collision with root package name */
    public j f94452I;

    /* renamed from: J  reason: collision with root package name */
    private List<s> f94453J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f94454K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f94455L = new h0(P.b(v.class), new c(this), new b(this), new d((C17631a) null, this));

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/PickupPointDetailsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Llo/s;", "Lkotlin/collections/ArrayList;", "pickUpPointAddresses", "", "selectingSupported", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/util/ArrayList;Z)Landroid/content/Intent;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, ArrayList<s> arrayList, boolean z10) {
            C17542s.j(context, "context");
            C17542s.j(arrayList, "pickUpPointAddresses");
            Intent intent = new Intent(context, PickupPointDetailsActivity.class);
            intent.putExtra("pickup_point_holder_key", arrayList);
            intent.putExtra("pickup_point_selection_supported_key", z10);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94456c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.activity.j jVar) {
            super(0);
            this.f94456c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94456c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94457c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.activity.j jVar) {
            super(0);
            this.f94457c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94457c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94458c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94458c = aVar;
            this.f94459d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94458c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94459d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.delivery.PickupPointDetailsActivity.d.invoke():l3.a");
        }
    }

    private final v F0() {
        return (v) this.f94455L.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N G0(PickupPointDetailsActivity pickupPointDetailsActivity) {
        pickupPointDetailsActivity.finish();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(PickupPointDetailsActivity pickupPointDetailsActivity, s sVar) {
        C17542s.j(sVar, "it");
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Pup selected, set result and finish", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = pickupPointDetailsActivity.getClass().getName();
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
        Intent intent = new Intent();
        intent.putExtra("result_selected_id_key", sVar.e());
        C16807N n10 = C16807N.f139792a;
        pickupPointDetailsActivity.setResult(-1, intent);
        pickupPointDetailsActivity.finish();
        return C16807N.f139792a;
    }

    private final void I0() {
        Q s10 = getSupportFragmentManager().s();
        int i10 = l0.f94613e;
        PickupPointDetailsFragment.a aVar = PickupPointDetailsFragment.f94580T0;
        List<s> list = this.f94453J;
        if (list == null) {
            C17542s.z("pickupPointHolder");
            list = null;
        }
        s10.s(i10, aVar.e(list, this.f94454K));
        s10.j();
    }

    public final j D0() {
        j jVar = this.f94452I;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final e E0() {
        e eVar = this.f94451H;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("googleCompatibilityApi");
        return null;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C10024a.f75255g, C10024a.f75257i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Bundle extras;
        ArrayList parcelableArrayList;
        CharSequence charSequence;
        CharSequence charSequence2;
        Bundle extras2;
        overridePendingTransition(C10024a.f75258j, C10024a.f75256h);
        super.onCreate(bundle);
        setTitle(C11849b.f102208L1);
        setContentView(m0.f94624c);
        Intent intent = getIntent();
        char c10 = '$';
        Class<PickupPointDetailsActivity> cls = PickupPointDetailsActivity.class;
        if (intent == null || (extras = intent.getExtras()) == null || (parcelableArrayList = extras.getParcelableArrayList("pickup_point_holder_key")) == null) {
            CharSequence charSequence3 = "Kt";
            String str = DslKt.INDICATOR_BACKGROUND;
            String str2 = null;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A pickup point must be passed in the newIntent");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a(str2, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, str2, 2, str2), '.', str2, 2, str2);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, charSequence3);
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str2 = null;
                c10 = '$';
            }
            finish();
            return;
        }
        this.f94453J = parcelableArrayList;
        Intent intent2 = getIntent();
        this.f94454K = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? false : extras2.getBoolean("pickup_point_selection_supported_key");
        if (!E0().a()) {
            CharSequence charSequence4 = "Kt";
            CharSequence charSequence5 = DslKt.MAIN_THREAD_NAME;
            String str5 = DslKt.INDICATOR_BACKGROUND;
            boolean z10 = true;
            j.a.j(D0(), this, Oo.b.f84502S4, (Integer) null, false, 0, new b(this), (String) null, (C17631a) null, (C17631a) null, 476, (Object) null);
            IllegalStateException illegalStateException = new IllegalStateException("No google play services on this device");
            qv.e eVar2 = qv.e.WARN;
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
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() == 0) {
                        charSequence = charSequence4;
                    } else {
                        charSequence = charSequence4;
                        name2 = C15854t.P0(o13, charSequence);
                    }
                    charSequence2 = charSequence5;
                    str7 = (C15854t.b0(Thread.currentThread().getName(), charSequence2, z10) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    charSequence = charSequence4;
                    charSequence2 = charSequence5;
                }
                bVar2.a(eVar2, str7, false, illegalStateException, str6);
                charSequence5 = charSequence2;
                charSequence4 = charSequence;
                z10 = true;
            }
        } else {
            I0();
        }
        ip.j.a(F0().C(), this, new c(this));
    }
}
