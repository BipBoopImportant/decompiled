package com.ingka.ikea.app.addresspicker;

import HJ.C15854t;
import Oe.l;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.v;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ingka.ikea.app.uicomponents.view.ClearableEditText;
import com.sugarcube.core.logger.DslKt;
import ip.j;
import java.util.ArrayList;
import java.util.List;
import jp.C11441c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import me.C10038a;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0003J\u0015\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010F\u001a\u0004\u0018\u00010B8BX\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u0002058BX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\n¨\u0006N"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/AddressPickerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "S0", "O0", "M0", "LLg/d;", "E0", "()LLg/d;", "", "address", "K0", "(Ljava/lang/String;)V", "LOe/a;", "addressAndPlaceId", "L0", "(LOe/a;)V", "Landroid/app/Activity;", "activity", "Landroid/widget/EditText;", "editText", "W0", "(Landroid/app/Activity;Landroid/widget/EditText;)V", "", "result", "D0", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onDestroyView", "Lme/a$c;", "selectAddressListener", "R0", "(Lme/a$c;)V", "P", "Lme/a$c;", "onSelectAddressListener", "LQe/d;", "Q", "LQe/d;", "_addressPickerBinding", "R", "LLg/d;", "_delegateAdapter", "LOe/h;", "S", "LXH/o;", "J0", "()LOe/h;", "viewModel", "Lme/a$b;", "T", "I0", "()Lme/a$b;", "focusMode", "G0", "()LQe/d;", "addressPickerBinding", "H0", "delegateAdapter", "U", "a", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddressPickerFragment extends Hilt_AddressPickerFragment {

    /* renamed from: U  reason: collision with root package name */
    public static final a f69962U = new a((DefaultConstructorMarker) null);

    /* renamed from: P  reason: collision with root package name */
    private C10038a.c f69963P;

    /* renamed from: Q  reason: collision with root package name */
    private Qe.d f69964Q;

    /* renamed from: R  reason: collision with root package name */
    private Lg.d f69965R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f69966S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f69967T = C16825p.b(new Ge.a(this));

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/AddressPickerFragment$a;", "", "<init>", "()V", "", "countryCode", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "currentAddress", "", "locationRestriction", "enableAddStreetNumber", "Lme/a$b;", "cursorSelection", "componentValue", "Lcom/ingka/ikea/app/addresspicker/AddressPickerFragment;", "a", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;ZZLme/a$b;Ljava/lang/String;)Lcom/ingka/ikea/app/addresspicker/AddressPickerFragment;", "TAG", "Ljava/lang/String;", "COUNTRY_CODE_KEY", "LAT_LNG_BOUNDS_KEY", "CURRENT_ADDRESS_KEY", "LOCATION_RESTRICTION_KEY", "CURSOR_FOCUS_KEY", "ENABLE_ADD_STREET_NUMBER_KEY", "COMPONENT_VALUE", "", "SHOW_KEYBOARD_MS_DELAY", "J", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddressPickerFragment a(String str, LatLngBounds latLngBounds, String str2, boolean z10, boolean z11, C10038a.b bVar, String str3) {
            C17542s.j(str, "countryCode");
            C17542s.j(str3, "componentValue");
            AddressPickerFragment addressPickerFragment = new AddressPickerFragment();
            v a10 = C16796C.a("country_code_key", str);
            v a11 = C16796C.a("lat_lng_bounds_key", latLngBounds);
            v a12 = C16796C.a("current_address_key", str2);
            v a13 = C16796C.a("location_restriction_key", Boolean.valueOf(z10));
            v a14 = C16796C.a("cursor_focus_key", bVar);
            v a15 = C16796C.a("enable_add_street_number_key", Boolean.valueOf(z11));
            addressPickerFragment.setArguments(D2.d.b(a10, a11, a12, a13, a14, a15, C16796C.a("component_value", str3)));
            return addressPickerFragment;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69968a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                me.a$b[] r0 = me.C10038a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                me.a$b r1 = me.C10038a.b.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                me.a$b r1 = me.C10038a.b.END     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f69968a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.addresspicker.AddressPickerFragment.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<Oe.a, C16807N> {
        c(Object obj) {
            super(1, obj, AddressPickerFragment.class, "handleAddressClicked", "handleAddressClicked(Lcom/ingka/ikea/app/addresspicker/addresslookup/viewmodels/AddressAndPlaceId;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Oe.a) obj);
            return C16807N.f139792a;
        }

        public final void t(Oe.a aVar) {
            C17542s.j(aVar, "p0");
            ((AddressPickerFragment) this.receiver).L0(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17642l<String, C16807N> {
        d(Object obj) {
            super(1, obj, AddressPickerFragment.class, "handleAddStreetNumberClicked", "handleAddStreetNumberClicked(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((AddressPickerFragment) this.receiver).K0(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69969c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f69969c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69969c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69970c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f69970c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69970c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69971c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f69971c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69971c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69972c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69972c = aVar;
            this.f69973d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69972c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69973d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69974c = oVar;
            this.f69975d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69975d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69974c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AddressPickerFragment() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f69966S = W.b(this, P.b(Oe.h.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    private final void D0(int i10) {
        if (i10 > 0) {
            G0().f63085b.announceForAccessibility(getResources().getQuantityString(Oo.a.f84307b, i10, new Object[]{Integer.valueOf(i10)}));
        }
    }

    private final Lg.d E0() {
        Bundle arguments = getArguments();
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new Je.c((arguments != null ? arguments.getBoolean("enable_add_street_number_key") : false) && I0() != null, new d(this), new c(this))});
    }

    /* access modifiers changed from: private */
    public static final C10038a.b F0(AddressPickerFragment addressPickerFragment) {
        Bundle arguments = addressPickerFragment.getArguments();
        Object serializable = arguments != null ? arguments.getSerializable("cursor_focus_key") : null;
        if (serializable instanceof C10038a.b) {
            return (C10038a.b) serializable;
        }
        return null;
    }

    private final Qe.d G0() {
        Qe.d dVar = this.f69964Q;
        C17542s.g(dVar);
        return dVar;
    }

    private final Lg.d H0() {
        Lg.d dVar = this.f69965R;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final C10038a.b I0() {
        return (C10038a.b) this.f69967T.getValue();
    }

    private final Oe.h J0() {
        return (Oe.h) this.f69966S.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K0(java.lang.String r6) {
        /*
            r5 = this;
            me.a$b r0 = r5.I0()
            r1 = -1
            if (r0 != 0) goto L_0x0009
            r0 = r1
            goto L_0x0011
        L_0x0009:
            int[] r2 = com.ingka.ikea.app.addresspicker.AddressPickerFragment.b.f69968a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L_0x0011:
            java.lang.String r2 = " "
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0032
            if (r0 == r4) goto L_0x0022
            if (r0 != r3) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0022:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L_0x0041
        L_0x0032:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
        L_0x0041:
            me.a$b r0 = r5.I0()
            if (r0 != 0) goto L_0x0049
            r0 = r1
            goto L_0x0051
        L_0x0049:
            int[] r2 = com.ingka.ikea.app.addresspicker.AddressPickerFragment.b.f69968a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L_0x0051:
            if (r0 == r1) goto L_0x0060
            if (r0 == r4) goto L_0x005e
            if (r0 != r3) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x005e:
            r0 = 0
            goto L_0x0064
        L_0x0060:
            int r0 = r6.length()
        L_0x0064:
            Qe.d r1 = r5.G0()
            com.ingka.ikea.app.uicomponents.view.ClearableEditText r1 = r1.f63085b
            r1.setText(r6)
            r1.setSelection(r0)
            r1.requestFocus()
            kotlin.jvm.internal.C17542s.g(r1)
            jp.g.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.addresspicker.AddressPickerFragment.K0(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void L0(Oe.a aVar) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Address selected: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = AddressPickerFragment.class.getName();
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
        J0().F(aVar);
    }

    private final void M0() {
        F<l> G10 = J0().G();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(G10, viewLifecycleOwner, new Ge.f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(AddressPickerFragment addressPickerFragment, l lVar) {
        C17542s.j(lVar, "it");
        if (lVar.b() != null) {
            C10038a.c cVar = addressPickerFragment.f69963P;
            if (cVar != null) {
                cVar.b(lVar.a(), lVar.b());
            }
        } else {
            C10038a.c cVar2 = addressPickerFragment.f69963P;
            if (cVar2 != null) {
                cVar2.c(lVar.a());
            }
        }
        addressPickerFragment.dismiss();
        return C16807N.f139792a;
    }

    private final void O0() {
        F<List<Je.d>> H10 = J0().H();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(H10, viewLifecycleOwner, new Ge.g(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(AddressPickerFragment addressPickerFragment, List list) {
        C17542s.j(list, "it");
        Lg.d.q(addressPickerFragment.H0(), list, false, (C17642l) null, 6, (Object) null);
        addressPickerFragment.D0(list.size());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q0(AddressPickerFragment addressPickerFragment, C5191t tVar) {
        ClearableEditText clearableEditText = addressPickerFragment.G0().f63085b;
        C17542s.i(clearableEditText, "addressEditText");
        addressPickerFragment.W0(tVar, clearableEditText);
    }

    private final void S0() {
        String str;
        int i10;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("current_address_key")) == null) {
            str = "";
        }
        this.f69965R = E0();
        G0().f63087d.setOnClickListener(new Ge.c(this));
        RecyclerView recyclerView = G0().f63086c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(H0());
        ClearableEditText clearableEditText = G0().f63085b;
        C17542s.g(clearableEditText);
        C11441c.a(clearableEditText, new Ge.d(this));
        clearableEditText.setText(str);
        C10038a.b I02 = I0();
        int i11 = I02 == null ? -1 : b.f69968a[I02.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                i10 = 0;
                clearableEditText.setSelection(i10);
                clearableEditText.setOnEditorActionListener(new Ge.e(this, clearableEditText));
            } else if (i11 != 2) {
                throw new t();
            }
        }
        i10 = str.length();
        clearableEditText.setSelection(i10);
        clearableEditText.setOnEditorActionListener(new Ge.e(this, clearableEditText));
    }

    /* access modifiers changed from: private */
    public static final void T0(AddressPickerFragment addressPickerFragment, View view) {
        addressPickerFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(AddressPickerFragment addressPickerFragment, String str) {
        C17542s.j(str, "text");
        addressPickerFragment.J0().J(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean V0(AddressPickerFragment addressPickerFragment, ClearableEditText clearableEditText, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        C10038a.c cVar = addressPickerFragment.f69963P;
        if (cVar != null) {
            cVar.c(clearableEditText.getEditableText().toString());
        }
        addressPickerFragment.dismiss();
        return true;
    }

    private final void W0(Activity activity, EditText editText) {
        Object systemService = activity.getSystemService("input_method");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        editText.requestFocus();
        ((InputMethodManager) systemService).showSoftInput(editText, 0);
    }

    public final void R0(C10038a.c cVar) {
        C17542s.j(cVar, "selectAddressListener");
        this.f69963P = cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C17542s.j(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        this.f69964Q = Qe.d.c(layoutInflater);
        ConstraintLayout b10 = G0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f69964Q = null;
        this.f69965R = null;
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        C5191t activity = getActivity();
        if (activity != null) {
            G0().f63085b.postDelayed(new Ge.b(this, activity), 50);
        }
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        LatLngBounds latLngBounds = arguments != null ? (LatLngBounds) arguments.getParcelable("lat_lng_bounds_key") : null;
        Bundle arguments2 = getArguments();
        boolean z10 = arguments2 != null ? arguments2.getBoolean("location_restriction_key") : false;
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("country_code_key") : null;
        if (string != null) {
            Bundle arguments4 = getArguments();
            String string2 = arguments4 != null ? arguments4.getString("component_value") : null;
            if (string2 != null) {
                J0().I(latLngBounds, z10, string, string2);
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a("Launch Autocomplete with bounds: " + latLngBounds, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = AddressPickerFragment.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, true, (Throwable) null, str);
                }
                S0();
                O0();
                M0();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
