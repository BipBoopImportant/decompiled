package com.ingka.ikea.app.addresspicker.addresslookup;

import Ar.j;
import HJ.C15854t;
import He.h;
import He.i;
import He.k;
import He.l;
import Oe.d;
import QJ.F0;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.textfield.TextInputEditText;
import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.sugarcube.core.logger.DslKt;
import dl.C11212q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jp.C11441c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import me.C10038a;
import me.b;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0003R6\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u000bR\u0014\u0010X\u001a\u00020:8BX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/AddressLookupPickerDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Lme/b;", "result", "LXH/N;", "f1", "(Lme/b;)V", "LLg/d;", "H0", "()LLg/d;", "", "address", "X0", "(Ljava/lang/String;)V", "b1", "Landroid/view/View;", "view", "text", "N0", "(Landroid/view/View;Ljava/lang/String;)V", "O0", "S0", "V0", "Lme/a$d;", "postalCodeAddress", "Y0", "(Lme/a$d;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "Lkotlin/Function1;", "P", "LnI/l;", "getAddressSetListener", "()LnI/l;", "a1", "(LnI/l;)V", "getAddressSetListener$annotations", "addressSetListener", "Q", "LLg/d;", "_listAdapter", "LQe/c;", "R", "LQe/c;", "_binding", "LQJ/F0;", "S", "LQJ/F0;", "notifySearchDelegateJob", "", "T", "Z", "hasSetResultValue", "LAr/j;", "U", "LAr/j;", "K0", "()LAr/j;", "setFeedback$addresspicker_implementation_release", "(LAr/j;)V", "feedback", "LOe/d;", "X", "LXH/o;", "M0", "()LOe/d;", "viewModel", "L0", "listAdapter", "G0", "()LQe/c;", "binding", "Y", "a", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddressLookupPickerDialog extends Hilt_AddressLookupPickerDialog {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f69979Y = new a((DefaultConstructorMarker) null);

    /* renamed from: P  reason: collision with root package name */
    private C17642l<? super C10038a.d, C16807N> f69980P;

    /* renamed from: Q  reason: collision with root package name */
    private Lg.d f69981Q;

    /* renamed from: R  reason: collision with root package name */
    private Qe.c f69982R;

    /* renamed from: S  reason: collision with root package name */
    private F0 f69983S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f69984T;

    /* renamed from: U  reason: collision with root package name */
    public j f69985U;

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f69986X;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/AddressLookupPickerDialog$a;", "", "<init>", "()V", "Lme/a$a;", "addressLookupConfig", "", "componentValue", "requestValue", "Lcom/ingka/ikea/app/addresspicker/addresslookup/AddressLookupPickerDialog;", "a", "(Lme/a$a;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/app/addresspicker/addresslookup/AddressLookupPickerDialog;", "TAG", "Ljava/lang/String;", "CONFIG", "COMPONENT_VALUE", "REQUEST_VALUE_KEY", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddressLookupPickerDialog a(C10038a.C1374a aVar, String str, String str2) {
            C17542s.j(aVar, "addressLookupConfig");
            C17542s.j(str, "componentValue");
            AddressLookupPickerDialog addressLookupPickerDialog = new AddressLookupPickerDialog();
            addressLookupPickerDialog.setArguments(D2.d.b(C16796C.a("config_key", aVar), C16796C.a("request_value_key", str2), C16796C.a("component_value_key", str)));
            return addressLookupPickerDialog;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69987a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                me.a$a$b[] r0 = me.C10038a.C1374a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                me.a$a$b r1 = me.C10038a.C1374a.b.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                me.a$a$b r1 = me.C10038a.C1374a.b.END     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f69987a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69988c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f69988c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69988c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69989c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f69989c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69989c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69990c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f69990c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69990c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69991c = aVar;
            this.f69992d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69991c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69992d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69993c = oVar;
            this.f69994d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69994d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69993c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AddressLookupPickerDialog() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f69986X = W.b(this, P.b(Oe.d.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final Qe.c G0() {
        Qe.c cVar = this.f69982R;
        C17542s.g(cVar);
        return cVar;
    }

    private final Lg.d H0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new Je.a(M0().O() && M0().Q() != null, new He.b(this), new He.c(this)), new C11212q()});
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(AddressLookupPickerDialog addressLookupPickerDialog, String str) {
        C17542s.j(str, PlaceTypes.ADDRESS);
        addressLookupPickerDialog.X0(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(AddressLookupPickerDialog addressLookupPickerDialog, Je.b bVar) {
        C17542s.j(bVar, "postalCodeAddress");
        addressLookupPickerDialog.M0().N(bVar);
        return C16807N.f139792a;
    }

    private final Lg.d L0() {
        Lg.d dVar = this.f69981Q;
        C17542s.g(dVar);
        return dVar;
    }

    private final Oe.d M0() {
        return (Oe.d) this.f69986X.getValue();
    }

    private final void N0(View view, String str) {
        G0().f63080c.setError((CharSequence) null);
        jp.g.b(view);
        M0().L(str);
    }

    private final void O0() {
        F<List<Object>> U10 = M0().U();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(U10, viewLifecycleOwner, new h(this));
        F<d.a> T10 = M0().T();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(T10, viewLifecycleOwner2, new i(this));
        F<PostalCodeAddress> P10 = M0().P();
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ip.j.a(P10, viewLifecycleOwner3, new He.j(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(AddressLookupPickerDialog addressLookupPickerDialog, List list) {
        C17542s.j(list, "it");
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
                String a10 = C11818a.a("Updated sections: " + list, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = addressLookupPickerDialog.getClass().getName();
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
        Lg.d.q(addressLookupPickerDialog.L0(), list, true, (C17642l) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(AddressLookupPickerDialog addressLookupPickerDialog, d.a aVar) {
        C17542s.j(aVar, "it");
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
                String a10 = C11818a.a("No search results found", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = addressLookupPickerDialog.getClass().getName();
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
        if (aVar instanceof d.a.b) {
            addressLookupPickerDialog.G0().f63080c.setError(addressLookupPickerDialog.getString(Oo.b.f84733o1));
        } else if (aVar instanceof d.a.C1055a) {
            addressLookupPickerDialog.G0().f63080c.setError(addressLookupPickerDialog.getString(Oo.b.f84323A5));
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(AddressLookupPickerDialog addressLookupPickerDialog, PostalCodeAddress postalCodeAddress) {
        C17542s.j(postalCodeAddress, "it");
        addressLookupPickerDialog.Y0(new C10038a.d(postalCodeAddress.getPostalCode(), postalCodeAddress.getAddressName(), postalCodeAddress.getSubAddressName(), postalCodeAddress.getAdditionalValues()));
        return C16807N.f139792a;
    }

    private final void S0() {
        F<Boolean> R10 = M0().R();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(R10, viewLifecycleOwner, new k(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(AddressLookupPickerDialog addressLookupPickerDialog, boolean z10) {
        j.a.j(addressLookupPickerDialog.K0(), addressLookupPickerDialog.getContext(), Oo.b.f84536V8, Integer.valueOf(Oo.b.f84812v3), false, 0, new He.a(addressLookupPickerDialog), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(AddressLookupPickerDialog addressLookupPickerDialog) {
        addressLookupPickerDialog.dismiss();
        return C16807N.f139792a;
    }

    private final void V0() {
        F<Boolean> S10 = M0().S();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(S10, viewLifecycleOwner, new l(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(AddressLookupPickerDialog addressLookupPickerDialog, boolean z10) {
        HorizontalProgressView horizontalProgressView = addressLookupPickerDialog.G0().f63081d;
        C17542s.i(horizontalProgressView, "progressBar");
        horizontalProgressView.setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void X0(java.lang.String r6) {
        /*
            r5 = this;
            Oe.d r0 = r5.M0()
            me.a$a$b r0 = r0.Q()
            r1 = -1
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x0015
        L_0x000d:
            int[] r2 = com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog.b.f69987a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L_0x0015:
            java.lang.String r2 = " "
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0036
            if (r0 == r4) goto L_0x0026
            if (r0 != r3) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L_0x0045
        L_0x0036:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
        L_0x0045:
            Oe.d r0 = r5.M0()
            me.a$a$b r0 = r0.Q()
            if (r0 != 0) goto L_0x0051
            r0 = r1
            goto L_0x0059
        L_0x0051:
            int[] r2 = com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog.b.f69987a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L_0x0059:
            if (r0 == r1) goto L_0x0068
            if (r0 == r4) goto L_0x0066
            if (r0 != r3) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0066:
            r0 = 0
            goto L_0x006c
        L_0x0068:
            int r0 = r6.length()
        L_0x006c:
            Qe.c r1 = r5.G0()
            com.google.android.material.textfield.TextInputEditText r1 = r1.f63079b
            r1.setText(r6)
            r1.setSelection(r0)
            r1.requestFocus()
            kotlin.jvm.internal.C17542s.g(r1)
            jp.g.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog.X0(java.lang.String):void");
    }

    private final void Y0(C10038a.d dVar) {
        C17642l<? super C10038a.d, C16807N> lVar = this.f69980P;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
        Bundle arguments = getArguments();
        f1(new b.C1380b(dVar, arguments != null ? arguments.getString("request_value_key") : null));
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z0(AddressLookupPickerDialog addressLookupPickerDialog, View view) {
        addressLookupPickerDialog.dismiss();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void b1() {
        G0().f63080c.setError((CharSequence) null);
        TextInputEditText textInputEditText = G0().f63079b;
        C17542s.g(textInputEditText);
        C11441c.a(textInputEditText, new He.e(this));
        textInputEditText.setOnEditorActionListener(new He.f(this));
        textInputEditText.setOnTouchListener(new He.g(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(AddressLookupPickerDialog addressLookupPickerDialog, String str) {
        C17542s.j(str, "text");
        addressLookupPickerDialog.G0().f63080c.setError((CharSequence) null);
        addressLookupPickerDialog.M0().M(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean d1(AddressLookupPickerDialog addressLookupPickerDialog, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        C17542s.g(textView);
        addressLookupPickerDialog.N0(textView, textView.getText().toString());
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean e1(AddressLookupPickerDialog addressLookupPickerDialog, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            il.g gVar = il.g.f98371a;
            C17542s.g(motionEvent);
            TextInputEditText textInputEditText = addressLookupPickerDialog.G0().f63079b;
            C17542s.i(textInputEditText, "postalCodeEditText");
            if (gVar.b(motionEvent, textInputEditText)) {
                C17542s.g(view);
                addressLookupPickerDialog.N0(view, String.valueOf(addressLookupPickerDialog.G0().f63079b.getText()));
                return true;
            }
        }
        return false;
    }

    private final void f1(me.b bVar) {
        if (!this.f69984T) {
            C5197z.c(this, "AddressLookupPicker_RequestKey", D2.d.b(C16796C.a("AddressLookupPicker_BundleKey", bVar)));
            this.f69984T = true;
        }
    }

    public final j K0() {
        j jVar = this.f69985U;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final void a1(C17642l<? super C10038a.d, C16807N> lVar) {
        this.f69980P = lVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f69982R = Qe.c.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = G0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        F0 f02 = this.f69983S;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f69981Q = null;
        this.f69982R = null;
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        f1(b.a.f75354a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(Uo.a.f88327h);
        toolbar.setTitle((CharSequence) getString(Oo.b.f84755q1));
        toolbar.setNavigationIcon(C6012a.e(toolbar.getContext(), C18146a.f148142M2));
        toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
        toolbar.setNavigationOnClickListener(new He.d(this));
        this.f69981Q = H0();
        RecyclerView recyclerView = G0().f63082e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(L0());
        b1();
        V0();
        S0();
        O0();
    }
}
