package com.ingka.ikea.zipselector.impl.ui;

import Ae.e;
import Ar.j;
import Ea.C9072f;
import HJ.C15854t;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import Xo.f;
import YH.C16877v;
import YH.X;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.zipselector.impl.network.StateLookupApiError;
import com.sugarcube.core.logger.DslKt;
import dl.C11202g;
import dl.C11203h;
import g.C5314c;
import gE.C14514a;
import gE.C14515b;
import h.C5405c;
import hE.C14538d;
import il.g;
import jE.C14628a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import jp.C11441c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import lE.C14764a;
import lg.C10026c;
import mE.C14790a;
import mE.C14791b;
import mE.C14792c;
import mE.h;
import mE.i;
import mE.k;
import mE.l;
import mE.m;
import mE.n;
import mE.o;
import mE.p;
import mE.q;
import mE.r;
import mE.t;
import nE.C14847a;
import nE.C14848b;
import nI.C17631a;
import nI.C17642l;
import na.C8594c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tK.C18010a;
import u2.C6012a;
import xa.C8967h;
import xa.C8971l;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0013*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b1\u0010\u000bJ+\u00109\u001a\u0002082\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010\u0004J\u0017\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CR\"\u0010K\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010c\u001a\u00020\\8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010h\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010n\u001a\u00020i8BX\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0001\u001a\u0004\u0018\u000108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010|R\u0018\u0010\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010|R'\u0010\u0001\u001a\u0012\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\f0\f0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020s8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020w8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/ui/ManualPostalCodeBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "", "<init>", "()V", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "savedPostalCodeAddress", "LXH/N;", "G1", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)V", "", "preFilledText", "B1", "(Ljava/lang/String;)V", "x1", "f1", "q1", "", "askForLocationPermission", "Y0", "(Z)V", "Landroid/content/Context;", "S0", "(Landroid/content/Context;)Z", "R0", "v1", "Lxa/h;", "Landroid/location/Location;", "a1", "()Lxa/h;", "", "Landroid/location/Address;", "addressList", "e1", "(Ljava/util/List;)V", "E1", "", "postCode", "H1", "(Ljava/lang/CharSequence;)Z", "postalCodeAddress", "u1", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)V", "LgE/b;", "result", "F1", "(LgE/b;)V", "z1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "LAe/e;", "O", "LAe/e;", "T0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LgE/a;", "P", "LgE/a;", "d1", "()LgE/a;", "setZipSelectorAnalytics$zipselector_implementation_release", "(LgE/a;)V", "zipSelectorAnalytics", "LIl/a;", "Q", "LIl/a;", "U0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LAr/j;", "R", "LAr/j;", "X0", "()LAr/j;", "setFeedback$zipselector_implementation_release", "(LAr/j;)V", "feedback", "S", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "LnE/b;", "T", "LXH/o;", "c1", "()LnE/b;", "postalCodeViewModel", "Lna/c;", "U", "Lna/c;", "fusedLocationClient", "LjE/a;", "X", "LjE/a;", "_binding", "LLg/d;", "Y", "LLg/d;", "_delegateAdapter", "Landroid/animation/ObjectAnimator;", "Z", "Landroid/animation/ObjectAnimator;", "gpsDrawableAnimator", "Ljava/util/regex/Pattern;", "y0", "Ljava/util/regex/Pattern;", "postalCodePattern", "z0", "gettingPostalCode", "A0", "hasSetResultValue", "Lg/c;", "kotlin.jvm.PlatformType", "B0", "Lg/c;", "requestPermissionLauncher", "V0", "()LjE/a;", "binding", "W0", "()LLg/d;", "delegateAdapter", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ManualPostalCodeBottomSheet extends Hilt_ManualPostalCodeBottomSheet {

    /* renamed from: A0  reason: collision with root package name */
    private boolean f120758A0;

    /* renamed from: B0  reason: collision with root package name */
    private final C5314c<String> f120759B0;

    /* renamed from: O  reason: collision with root package name */
    public Ae.e f120760O;

    /* renamed from: P  reason: collision with root package name */
    public C14514a f120761P;

    /* renamed from: Q  reason: collision with root package name */
    public Il.a f120762Q;

    /* renamed from: R  reason: collision with root package name */
    public j f120763R;

    /* renamed from: S  reason: collision with root package name */
    private final String f120764S = "manualPostalCodeInput?allowSamePostalCode={allowSamePostalCode}&interactionValue={interactionValue}";

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f120765T;

    /* renamed from: U  reason: collision with root package name */
    private C8594c f120766U;

    /* renamed from: X  reason: collision with root package name */
    private C14628a f120767X;

    /* renamed from: Y  reason: collision with root package name */
    private Lg.d f120768Y;

    /* renamed from: Z  reason: collision with root package name */
    private ObjectAnimator f120769Z;

    /* renamed from: y0  reason: collision with root package name */
    private Pattern f120770y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f120771z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120772c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f120772c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120772c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120773c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f120773c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120773c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120774c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f120774c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120774c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120775c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120775c = aVar;
            this.f120776d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120775c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120776d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120777c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120777c = oVar;
            this.f120778d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120778d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120777c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ManualPostalCodeBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f120765T = W.b(this, P.b(C14848b.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new m(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f120759B0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final void A1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, PostalCodePickerConfig.AmbiguousArea ambiguousArea, CompoundButton compoundButton, boolean z10) {
        if (z10) {
            manualPostalCodeBottomSheet.V0().f127903h.setText(f.a(ambiguousArea.c()));
            manualPostalCodeBottomSheet.c1().Y(ambiguousArea);
            if (!ambiguousArea.d()) {
                e.c.c(manualPostalCodeBottomSheet.T0(), Ae.j.ACTION_VIEWED.b(), X.f(C16796C.a("component_value", ambiguousArea.b())), Interaction$Component.POSTAL_CODE_DISCLAIMER, (e.b) null, 8, (Object) null);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void B1(String str) {
        TextInputEditText textInputEditText = V0().f127902g;
        textInputEditText.setOnTouchListener(new n(this));
        textInputEditText.setText(str);
        C17542s.g(textInputEditText);
        C11441c.a(textInputEditText, new o(this));
    }

    /* access modifiers changed from: private */
    public static final boolean C1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            g gVar = g.f98371a;
            C17542s.g(motionEvent);
            TextInputEditText textInputEditText = manualPostalCodeBottomSheet.V0().f127902g;
            C17542s.i(textInputEditText, "postalCodeEditText");
            if (gVar.b(motionEvent, textInputEditText)) {
                if (String.valueOf(manualPostalCodeBottomSheet.V0().f127902g.getText()).length() == 0) {
                    manualPostalCodeBottomSheet.Y0(true);
                    manualPostalCodeBottomSheet.d1().b();
                } else {
                    manualPostalCodeBottomSheet.V0().f127902g.setText((CharSequence) null);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N D1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, String str) {
        C17542s.j(str, "it");
        manualPostalCodeBottomSheet.c1().i0(str);
        return C16807N.f139792a;
    }

    private final void E1() {
        ObjectAnimator objectAnimator = this.f120769Z;
        if (objectAnimator != null) {
            objectAnimator.end();
            objectAnimator.cancel();
            objectAnimator.setCurrentPlayTime(0);
            objectAnimator.removeAllListeners();
            objectAnimator.removeAllUpdateListeners();
        }
    }

    private final void F1(C14515b bVar) {
        if (!this.f120758A0) {
            rw.d.a(this, bVar, "ManualPostalCodeBottomSheetRequestKey");
            this.f120758A0 = true;
        }
    }

    private final void G1(PostalCodePickerConfig postalCodePickerConfig, UserPostalCodeAddress userPostalCodeAddress) {
        c1().h0(postalCodePickerConfig);
        this.f120770y0 = postalCodePickerConfig.g();
        z1(postalCodePickerConfig, userPostalCodeAddress);
        V0().f127901f.setVisibility(postalCodePickerConfig.m() ? 0 : 8);
    }

    private final boolean H1(CharSequence charSequence) {
        Pattern pattern = this.f120770y0;
        if (pattern == null) {
            return true;
        }
        return pattern.matcher(charSequence).matches();
    }

    private final void R0() {
        this.f120771z0 = false;
        E1();
        C14848b c12 = c1();
        String string = getString(C14538d.f127495b);
        C17542s.i(string, "getString(...)");
        c12.a0(string);
    }

    private final boolean S0(Context context) {
        return C6012a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private final C14628a V0() {
        C14628a aVar = this.f120767X;
        C17542s.g(aVar);
        return aVar;
    }

    private final Lg.d W0() {
        Lg.d dVar = this.f120768Y;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @SuppressLint({"MissingPermission"})
    private final void Y0(boolean z10) {
        String str;
        char c10;
        Class<ManualPostalCodeBottomSheet> cls;
        C8971l<Location> g10;
        boolean z11 = z10;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        C8594c cVar = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = ManualPostalCodeBottomSheet.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("getLastKnownPostalCode, permission: " + z11, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
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
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (!this.f120771z0) {
            c1().a0("");
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            if (S0(requireContext)) {
                Drawable[] compoundDrawables = V0().f127902g.getCompoundDrawables();
                C17542s.i(compoundDrawables, "getCompoundDrawables(...)");
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(compoundDrawables[2], new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{0})});
                ofPropertyValuesHolder.setDuration(1000);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setRepeatCount(-1);
                if (!ofPropertyValuesHolder.isRunning()) {
                    ofPropertyValuesHolder.start();
                }
                this.f120769Z = ofPropertyValuesHolder;
                this.f120771z0 = true;
                C8594c cVar2 = this.f120766U;
                if (cVar2 == null) {
                    C17542s.z("fusedLocationClient");
                } else {
                    cVar = cVar2;
                }
                C8971l<Location> f10 = cVar.f();
                if (f10 != null && (g10 = f10.g(a1())) != null) {
                    g10.e(new i(this));
                }
            } else if (z11) {
                qv.e eVar2 = qv.e.DEBUG;
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
                        String a11 = C11818a.a("No location permission, ask for permission", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                    c10 = '$';
                }
                v1();
            } else {
                C14848b c12 = c1();
                String string = getString(C14538d.f127495b);
                C17542s.i(string, "getString(...)");
                c12.a0(string);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void Z0(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, Exception exc) {
        C17542s.j(exc, "it");
        manualPostalCodeBottomSheet.R0();
    }

    private final C8967h<Location> a1() {
        return new k(this);
    }

    /* access modifiers changed from: private */
    public static final void b1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, Location location) {
        if (location != null) {
            manualPostalCodeBottomSheet.c1().K(location, new Geocoder(manualPostalCodeBottomSheet.requireContext()));
        } else {
            manualPostalCodeBottomSheet.R0();
        }
    }

    private final C14848b c1() {
        return (C14848b) this.f120765T.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.location.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.location.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.location.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.location.Address} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e1(java.util.List<? extends android.location.Address> r12) {
        /*
            r11 = this;
            r11.E1()
            r0 = 0
            r11.f120771z0 = r0
            boolean r1 = r12.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            qv.e r12 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r3 = r0.hasNext()
            r9 = 0
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r12, r9)
            if (r4 == 0) goto L_0x0020
            r1.add(r3)
            goto L_0x0020
        L_0x0038:
            java.util.Iterator r0 = r1.iterator()
            r1 = r2
            r3 = r1
        L_0x003e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00b4
            java.lang.Object r4 = r0.next()
            qv.b r4 = (qv.C11819b) r4
            r7 = 0
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "AddressList is empty"
            java.lang.String r1 = qv.C11818a.a(r1, r7)
            if (r1 != 0) goto L_0x0056
            goto L_0x00b4
        L_0x0056:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x005a:
            if (r3 != 0) goto L_0x00a9
            java.lang.Class<com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet> r3 = com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 36
            r6 = 2
            java.lang.String r5 = HJ.C15854t.s1(r3, r5, r2, r6, r2)
            r8 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r8, r2, r6, r2)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r5, r3)
        L_0x007f:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "main"
            r8 = 1
            boolean r5 = HJ.C15854t.b0(r5, r6, r8)
            if (r5 == 0) goto L_0x0093
            java.lang.String r5 = "m"
            goto L_0x0095
        L_0x0093:
            java.lang.String r5 = "b"
        L_0x0095:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "|"
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L_0x00a9:
            r10 = r3
            r3 = r4
            r4 = r12
            r5 = r10
            r6 = r9
            r8 = r1
            r3.a(r4, r5, r6, r7, r8)
            r3 = r10
            goto L_0x003e
        L_0x00b4:
            nE.b r12 = r11.c1()
            int r0 = hE.C14538d.f127495b
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r12.a0(r0)
            return
        L_0x00c7:
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00ce:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r1.next()
            r4 = r3
            android.location.Address r4 = (android.location.Address) r4
            java.lang.String r5 = r4.getPostalCode()
            if (r5 == 0) goto L_0x00ce
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00e8
            goto L_0x00ce
        L_0x00e8:
            java.lang.String r4 = r4.getPostalCode()
            java.lang.String r5 = "getPostalCode(...)"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            boolean r4 = r11.H1(r4)
            if (r4 == 0) goto L_0x00ce
            r2 = r3
        L_0x00f8:
            android.location.Address r2 = (android.location.Address) r2
            if (r2 == 0) goto L_0x0115
            java.lang.String r1 = r2.getPostalCode()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0107
            goto L_0x0115
        L_0x0107:
            jE.a r12 = r11.V0()
            com.google.android.material.textfield.TextInputEditText r12 = r12.f127902g
            java.lang.String r0 = r2.getPostalCode()
            r12.setText(r0)
            goto L_0x0128
        L_0x0115:
            jE.a r1 = r11.V0()
            com.google.android.material.textfield.TextInputEditText r1 = r1.f127902g
            java.lang.Object r12 = r12.get(r0)
            android.location.Address r12 = (android.location.Address) r12
            java.lang.String r12 = r12.getPostalCode()
            r1.setText(r12)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.zipselector.impl.ui.ManualPostalCodeBottomSheet.e1(java.util.List):void");
    }

    private final void f1() {
        C14848b c12 = c1();
        F<UserPostalCodeAddress> U10 = c12.U();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(U10, viewLifecycleOwner, new r(this));
        F<Boolean> M10 = c12.M();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(M10, viewLifecycleOwner2, new mE.s(c12, this));
        F<StateLookupApiError> P10 = c12.P();
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ip.j.a(P10, viewLifecycleOwner3, new t(c12, this));
        F<C14847a> R10 = c12.R();
        C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        ip.j.a(R10, viewLifecycleOwner4, new C14791b(this));
        F<String> Q10 = c12.Q();
        C5221y viewLifecycleOwner5 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        ip.j.a(Q10, viewLifecycleOwner5, new C14792c(this));
        F<String> S10 = c12.S();
        C5221y viewLifecycleOwner6 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        ip.j.a(S10, viewLifecycleOwner6, new mE.d(this));
        F<Integer> T10 = c12.T();
        C5221y viewLifecycleOwner7 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        ip.j.a(T10, viewLifecycleOwner7, new mE.e(this));
        F<Integer> N10 = c12.N();
        C5221y viewLifecycleOwner8 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        ip.j.a(N10, viewLifecycleOwner8, new mE.f(this));
        F<Boolean> L10 = c12.L();
        C5221y viewLifecycleOwner9 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        ip.j.a(L10, viewLifecycleOwner9, new mE.g(this));
        c12.O().observe(getViewLifecycleOwner(), new a(new h(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, UserPostalCodeAddress userPostalCodeAddress) {
        C17542s.j(userPostalCodeAddress, "it");
        manualPostalCodeBottomSheet.u1(userPostalCodeAddress);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(C14848b bVar, ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, boolean z10) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Loading state: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = bVar.getClass().getName();
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
        if (z10) {
            manualPostalCodeBottomSheet.V0().f127905j.o();
        } else {
            LoadingMaterialButton.q(manualPostalCodeBottomSheet.V0().f127905j, false, 1, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(C14848b bVar, ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, StateLookupApiError stateLookupApiError) {
        String string;
        C17542s.j(stateLookupApiError, "it");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Error: " + stateLookupApiError, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = bVar.getClass().getName();
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
        if (stateLookupApiError instanceof StateLookupApiError.a) {
            string = ((StateLookupApiError.a) stateLookupApiError).a();
        } else if (C17542s.e(stateLookupApiError, StateLookupApiError.b.f120747a)) {
            string = manualPostalCodeBottomSheet.getString(Oo.b.f84812v3);
            C17542s.g(string);
        } else {
            throw new XH.t();
        }
        String str5 = string;
        j X02 = manualPostalCodeBottomSheet.X0();
        Context context = manualPostalCodeBottomSheet.getContext();
        String string2 = manualPostalCodeBottomSheet.getString(Oo.b.f84843y3);
        C17542s.i(string2, "getString(...)");
        j.a.k(X02, context, string2, str5, false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, C14847a aVar) {
        C17542s.j(aVar, "result");
        if (C17542s.e(aVar, C14847a.C3191a.f129751a)) {
            manualPostalCodeBottomSheet.R0();
        } else if (aVar instanceof C14847a.b) {
            manualPostalCodeBottomSheet.e1(((C14847a.b) aVar).a());
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, String str) {
        C17542s.j(str, "it");
        manualPostalCodeBottomSheet.V0().f127904i.setError(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, String str) {
        C17542s.j(str, "it");
        manualPostalCodeBottomSheet.V0().f127904i.setHelperText(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, int i10) {
        manualPostalCodeBottomSheet.V0().f127902g.setInputType(i10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, int i10) {
        manualPostalCodeBottomSheet.V0().f127905j.setText(manualPostalCodeBottomSheet.getString(i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, boolean z10) {
        manualPostalCodeBottomSheet.V0().f127905j.setEnabled(z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, Integer num) {
        manualPostalCodeBottomSheet.V0().f127902g.setCompoundDrawablesWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        return C16807N.f139792a;
    }

    private final void q1() {
        F<List<C14764a>> W10 = c1().W();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(W10, viewLifecycleOwner, new mE.j(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N r1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, List list) {
        C17542s.j(list, "sections");
        Iterable<C14764a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C14764a aVar : iterable) {
            arrayList.add(new C11203h.a(aVar.a(), aVar.b(), aVar.c()));
        }
        Lg.d.q(manualPostalCodeBottomSheet.W0(), C16877v.e(new C11203h(arrayList, (String) null)), true, (C17642l) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void s1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, View view) {
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
                String a10 = C11818a.a("Change postal code", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = manualPostalCodeBottomSheet.getClass().getName();
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
        C14848b c12 = manualPostalCodeBottomSheet.c1();
        String string = manualPostalCodeBottomSheet.getString(C14538d.f127496c);
        C17542s.i(string, "getString(...)");
        c12.H(string);
    }

    /* access modifiers changed from: private */
    public static final void t1(DialogInterface dialogInterface) {
        C17542s.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View findViewById = aVar.findViewById(C9072f.f59488f);
        if (findViewById != null) {
            aVar.o().X0(3);
            findViewById.getParent().getParent().requestLayout();
        }
    }

    private final void u1(UserPostalCodeAddress userPostalCodeAddress) {
        Bundle arguments = getArguments();
        F1(new C14515b.C3121b(userPostalCodeAddress, arguments != null ? arguments.getString("interactionValue") : null));
        dismiss();
    }

    private final void v1() {
        this.f120759B0.a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* access modifiers changed from: private */
    public static final void w1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, Boolean bool) {
        C17542s.j(bool, "isGranted");
        if (bool.booleanValue()) {
            manualPostalCodeBottomSheet.Y0(false);
        }
    }

    private final void x1() {
        this.f120768Y = new Lg.d((Lg.a<?>[]) new Lg.a[]{new C11202g(new p(this))});
        RecyclerView recyclerView = V0().f127901f;
        recyclerView.setAdapter(W0());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    /* access modifiers changed from: private */
    public static final C16807N y1(ManualPostalCodeBottomSheet manualPostalCodeBottomSheet, C11203h.a aVar) {
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
                String a10 = C11818a.a("Selected state: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = manualPostalCodeBottomSheet.getClass().getName();
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
        manualPostalCodeBottomSheet.c1().j0(new C14764a(aVar.a(), aVar.b(), true));
        return C16807N.f139792a;
    }

    private final void z1(PostalCodePickerConfig postalCodePickerConfig, UserPostalCodeAddress userPostalCodeAddress) {
        List<PostalCodePickerConfig.AmbiguousArea> c10 = postalCodePickerConfig != null ? postalCodePickerConfig.c() : null;
        Collection collection = c10;
        if (collection == null || collection.isEmpty()) {
            V0().f127897b.setVisibility(8);
            c1().Z(false);
            return;
        }
        V0().f127897b.removeAllViews();
        RadioButton radioButton = null;
        for (PostalCodePickerConfig.AmbiguousArea ambiguousArea : c10) {
            RadioButton radioButton2 = new RadioButton(requireContext());
            radioButton2.setText(ambiguousArea.b());
            radioButton2.setTextAppearance(lg.f.f75291c);
            radioButton2.setTextColor(C6012a.c(requireContext(), C18010a.f147426j));
            radioButton2.setMinHeight(requireContext().getResources().getDimensionPixelSize(C10026c.f75267a));
            radioButton2.setOnCheckedChangeListener(new q(this, ambiguousArea));
            V0().f127897b.addView(radioButton2);
            if (C17542s.e(userPostalCodeAddress != null ? userPostalCodeAddress.c() : null, ambiguousArea.a()) || radioButton == null) {
                radioButton = radioButton2;
            }
        }
        V0().f127897b.setVisibility(0);
        if (radioButton != null) {
            radioButton.setChecked(true);
        }
    }

    public final Ae.e T0() {
        Ae.e eVar = this.f120760O;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Il.a U0() {
        Il.a aVar = this.f120762Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final j X0() {
        j jVar = this.f120763R;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C14514a d1() {
        C14514a aVar = this.f120761P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("zipSelectorAnalytics");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        boolean z10 = false;
        this.f120767X = C14628a.c(layoutInflater, viewGroup, false);
        UserPostalCodeAddress V10 = c1().V();
        this.f120766U = na.g.b(layoutInflater.getContext());
        B1(V10 != null ? V10.d() : null);
        x1();
        f1();
        q1();
        V0().f127905j.setOnClickListener(new l(this));
        TextInputLayout textInputLayout = V0().f127904i;
        CharSequence value = c1().S().getValue();
        if (value == null || value.length() == 0) {
            z10 = true;
        }
        textInputLayout.setHelperTextEnabled(!z10);
        G1(U0().v(), V10);
        NestedScrollView b10 = V0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f120767X = null;
        this.f120768Y = null;
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        F1(C14515b.a.f127306a);
    }

    public void onStop() {
        E1();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new C14790a());
        }
    }
}
