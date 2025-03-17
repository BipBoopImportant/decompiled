package com.sugarcube.app.base.ui.gallery;

import AF.C12600u;
import AF.C12603x;
import C4.j;
import DF.C12754C;
import DF.C12787d;
import JF.Z;
import NF.C13291e;
import OE.n;
import QE.C13448z;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.common.R;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import iF.C14579t;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import x4.v;
import xF.C15250m;
import xF.C15252n;
import xF.C15254o;
import xF.C15255p;
import xF.C15256q;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u001f\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010[\u001a\u0004\u0018\u00010X8BX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryHomeContentFragment;", "Lcom/sugarcube/app/base/ui/BaseFragment;", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;", "<init>", "()V", "Lcom/sugarcube/app/base/ui/gallery/GalleryMainBottomSheet$a;", "selectedOption", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "interactionsListener", "LXH/N;", "R0", "(Lcom/sugarcube/app/base/ui/gallery/GalleryMainBottomSheet$a;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;)V", "N0", "W0", "", "shouldShowPage", "V0", "(Z)V", "Landroid/net/Uri;", "uri", "U0", "(Landroid/net/Uri;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "itemViewType", "LDF/d;", "scene", "onShowMoreButtonClicked", "(ILDF/d;)V", "LQE/z;", "O", "LQE/z;", "binding", "LDF/C;", "P", "LXH/o;", "M0", "()LDF/C;", "viewModel", "Lcom/sugarcube/app/base/ui/gallery/b;", "Q", "J0", "()Lcom/sugarcube/app/base/ui/gallery/b;", "interactions", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter;", "R", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter;", "contentAdapter", "LAF/u;", "S", "LAF/u;", "designsContentAdapter", "Lcom/sugarcube/app/base/DeviceCompatibility;", "T", "Lcom/sugarcube/app/base/DeviceCompatibility;", "I0", "()Lcom/sugarcube/app/base/DeviceCompatibility;", "setDeviceCompatibility", "(Lcom/sugarcube/app/base/DeviceCompatibility;)V", "deviceCompatibility", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "U", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebaseInteractions", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "setFirebaseInteractions", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "firebaseInteractions", "Lcom/sugarcube/app/base/data/user/UserRepo;", "X", "Lcom/sugarcube/app/base/data/user/UserRepo;", "L0", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "setUserRepo", "(Lcom/sugarcube/app/base/data/user/UserRepo;)V", "userRepo", "Lcom/sugarcube/app/base/ui/gallery/h;", "K0", "()Lcom/sugarcube/app/base/ui/gallery/h;", "tabType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryHomeContentFragment extends f implements GalleryHomeContentAdapter.OnBottomSheetInteractionsListener {
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public C13448z f124183O;

    /* renamed from: P  reason: collision with root package name */
    private final C16824o f124184P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f124185Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public GalleryHomeContentAdapter f124186R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public C12600u f124187S;

    /* renamed from: T  reason: collision with root package name */
    public DeviceCompatibility f124188T;

    /* renamed from: U  reason: collision with root package name */
    public FirebaseInteractions f124189U;

    /* renamed from: X  reason: collision with root package name */
    public UserRepo f124190X;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124191a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet$a[] r0 = com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet$a r1 = com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet.a.DELETE_SCENE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet$a r1 = com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet.a.DESIGN_SCENE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f124191a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment$observeViewModel$1", f = "GalleryHomeContentFragment.kt", l = {170}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124192c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentFragment f124193d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GalleryHomeContentFragment f124194a;

            a(GalleryHomeContentFragment galleryHomeContentFragment) {
                this.f124194a = galleryHomeContentFragment;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f124194a.V0(z10);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GalleryHomeContentFragment galleryHomeContentFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124193d = galleryHomeContentFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124193d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124192c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Boolean> F12 = this.f124193d.M0().F1();
                a aVar = new a(this.f124193d);
                this.f124192c = 1;
                if (F12.collect(aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentFragment f124195a;

        c(GalleryHomeContentFragment galleryHomeContentFragment) {
            this.f124195a = galleryHomeContentFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.util.List<? extends java.lang.Object> r12) {
            /*
                r11 = this;
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r0 = r11.f124195a
                com.sugarcube.app.base.ui.gallery.h r0 = r0.K0()
                com.sugarcube.app.base.ui.gallery.h$c r1 = com.sugarcube.app.base.ui.gallery.h.c.f124419e
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x0034
                kotlin.jvm.internal.C17542s.g(r12)
                r0 = r12
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0034
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r0 = r11.f124195a
                DF.C r0 = r0.M0()
                androidx.lifecycle.F r0 = r0.R1()
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r4)
                if (r0 == 0) goto L_0x0034
                r8 = r3
                goto L_0x0035
            L_0x0034:
                r8 = r2
            L_0x0035:
                DF.c r0 = new DF.c
                DF.H r5 = new DF.H
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r4 = r11.f124195a
                com.sugarcube.app.base.ui.gallery.h r4 = r4.K0()
                r5.<init>(r4)
                kotlin.jvm.internal.C17542s.g(r12)
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r4 = r11.f124195a
                DF.C r4 = r4.M0()
                boolean r4 = r4.c2()
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r4 = r11.f124195a
                DF.C r4 = r4.M0()
                androidx.lifecycle.F r4 = r4.R1()
                java.lang.Object r4 = r4.getValue()
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r9 = kotlin.jvm.internal.C17542s.e(r4, r6)
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r4 = r11.f124195a
                DF.C r4 = r4.M0()
                androidx.lifecycle.F r4 = r4.k1()
                java.lang.Object r4 = r4.getValue()
                boolean r10 = kotlin.jvm.internal.C17542s.e(r4, r6)
                r4 = r0
                r6 = r12
                r4.<init>(r5, r6, r7, r8, r9, r10)
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r12 = r11.f124195a
                QE.z r12 = r12.f124183O
                if (r12 == 0) goto L_0x008d
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = r12.f114756c
                if (r12 == 0) goto L_0x008d
                r12.setRefreshing(r2)
            L_0x008d:
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r12 = r11.f124195a
                com.sugarcube.app.base.ui.gallery.h r12 = r12.K0()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r12, r1)
                if (r1 != 0) goto L_0x00c3
                com.sugarcube.app.base.ui.gallery.h$d r1 = com.sugarcube.app.base.ui.gallery.h.d.f124420e
                boolean r1 = kotlin.jvm.internal.C17542s.e(r12, r1)
                if (r1 == 0) goto L_0x00a2
                goto L_0x00c3
            L_0x00a2:
                com.sugarcube.app.base.ui.gallery.h$b r1 = com.sugarcube.app.base.ui.gallery.h.b.f124418e
                boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r1)
                if (r12 == 0) goto L_0x00ce
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r12 = r11.f124195a
                AF.u r12 = r12.f124187S
                if (r12 == 0) goto L_0x00ce
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r1 = r11.f124195a
                DF.C r1 = r1.M0()
                boolean r1 = r1.c2()
                if (r1 != r3) goto L_0x00bf
                r2 = r3
            L_0x00bf:
                r12.f(r0, r2)
                goto L_0x00ce
            L_0x00c3:
                com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment r12 = r11.f124195a
                com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter r12 = r12.f124186R
                if (r12 == 0) goto L_0x00ce
                r12.f(r0)
            L_0x00ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment.c.a(java.util.List):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment$onViewCreated$lambda$6$$inlined$consumeResult$1", f = "GalleryHomeContentFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends l implements p<GalleryMainBottomSheet.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124196c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f124197d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f124198e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f124199f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentFragment f124200g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C8948l lVar, String str, C17164e eVar, GalleryHomeContentFragment galleryHomeContentFragment) {
            super(2, eVar);
            this.f124198e = lVar;
            this.f124199f = str;
            this.f124200g = galleryHomeContentFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f124198e, this.f124199f, eVar, this.f124200g);
            dVar.f124197d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(GalleryMainBottomSheet.a aVar, C17164e<? super C16807N> eVar) {
            return ((d) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124196c == 0) {
                y.b(obj);
                Object obj2 = this.f124197d;
                if (obj2 != null) {
                    GalleryHomeContentFragment galleryHomeContentFragment = this.f124200g;
                    galleryHomeContentFragment.R0((GalleryMainBottomSheet.a) obj2, galleryHomeContentFragment.J0());
                    this.f124198e.h().m(this.f124199f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124201a;

        e(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124201a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124201a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124201a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentFragment f124202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f124203b;

        f(GalleryHomeContentFragment galleryHomeContentFragment, boolean z10) {
            this.f124202a = galleryHomeContentFragment;
            this.f124203b = z10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1638016019, i10, -1, "com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment.setupCaptureNotSupportedScreen.<anonymous> (GalleryHomeContentFragment.kt:241)");
                }
                int i11 = R.drawable.sc_device_slash;
                String string = this.f124202a.getString(n.f113212H2);
                C17542s.i(string, "getString(...)");
                String string2 = this.f124202a.getString(n.f113214H4);
                C17542s.i(string2, "getString(...)");
                String string3 = this.f124202a.getString(n.f113426o4);
                C17542s.i(string3, "getString(...)");
                C14579t.b((androidx.compose.ui.d) null, i11, string, string2, string3, this.f124203b, mVar, 0, 1);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124204a;

        public g(C5187o oVar) {
            this.f124204a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124204a);
            int g10 = j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124205a;

        public h(C5187o oVar) {
            this.f124205a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124205a);
            int g10 = j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    public GalleryHomeContentFragment() {
        C16824o b10 = C16825p.b(new g(this));
        this.f124184P = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
        C16824o b11 = C16825p.b(new h(this));
        this.f124185Q = W.b(this, P.b(b.class), new C14045g(b11), new C14043e(b11), new C14044f(this, b11));
    }

    /* access modifiers changed from: private */
    public final b J0() {
        return (b) this.f124185Q.getValue();
    }

    /* access modifiers changed from: private */
    public final h K0() {
        String string = requireArguments().getString("tab");
        if (string != null) {
            return h.f124414d.a(string);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final C12754C M0() {
        return (C12754C) this.f124184P.getValue();
    }

    private final void N0() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        h K02 = K0();
        (C17542s.e(K02, h.c.f124419e) ? M0().r1() : C17542s.e(K02, h.d.f124420e) ? M0().I1() : C17542s.e(K02, h.b.f124418e) ? M0().c1() : new K()).observe(getViewLifecycleOwner(), new e(new c(this)));
        e0.a(M0().m1()).observe(getViewLifecycleOwner(), new e(new C15252n(this)));
        e0.a(M0().l1()).observe(getViewLifecycleOwner(), new e(new C15254o(this)));
        e0.a(M0().n1()).observe(getViewLifecycleOwner(), new e(new C15255p(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(GalleryHomeContentFragment galleryHomeContentFragment, PrivacyPolicyFeatureState privacyPolicyFeatureState) {
        galleryHomeContentFragment.M0().j2();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(GalleryHomeContentFragment galleryHomeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeContentFragment.W0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(GalleryHomeContentFragment galleryHomeContentFragment, Uri uri) {
        if (uri != null) {
            galleryHomeContentFragment.U0(uri);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void R0(GalleryMainBottomSheet.a aVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        Scene u12;
        int i10 = a.f124191a[aVar.ordinal()];
        if (i10 == 1) {
            Scene u13 = M0().u1();
            if (u13 != null) {
                M0().m3(true, C16877v.e(u13.getSceneUuid().toString()));
                M0().n2();
            }
        } else if (i10 == 2 && (u12 = M0().u1()) != null) {
            GalleryHomeContentAdapter.OnInteractionsListener.a.a(onInteractionsListener, new Design(u12.getName(), u12.getSceneUuid(), u12.getSceneId(), C17542s.e(K0(), h.d.f124420e), (UUID) null, 16, (DefaultConstructorMarker) null), (String) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(GalleryHomeContentFragment galleryHomeContentFragment, C12787d dVar, C5191t tVar, C12603x xVar) {
        C17542s.j(tVar, "activity");
        C17542s.j(xVar, "itemType");
        galleryHomeContentFragment.M0().A2(dVar.e());
        galleryHomeContentFragment.M0().H2(xVar);
        C8951o.f0(androidx.navigation.fragment.a.a(galleryHomeContentFragment), Kreativ.Gallery.a.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void T0(GalleryHomeContentFragment galleryHomeContentFragment) {
        galleryHomeContentFragment.M0().onPullRefresh();
    }

    private final void U0(Uri uri) {
        if (getActivity() != null) {
            try {
                Intent data = new Intent("android.intent.action.VIEW").setData(uri);
                C17542s.i(data, "setData(...)");
                startActivity(data);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                M0().g2();
                throw th2;
            }
            M0().g2();
        }
    }

    /* access modifiers changed from: private */
    public final void V0(boolean z10) {
        ComposeView composeView;
        C13448z zVar = this.f124183O;
        if (zVar != null && (composeView = zVar.f114758e) != null) {
            composeView.setContent(c1.c.c(-1638016019, true, new f(this, z10)));
        }
    }

    private final void W0() {
        ConstraintLayout b10;
        C13448z zVar = this.f124183O;
        if (zVar != null && (b10 = zVar.getRoot()) != null) {
            String string = getResources().getString(n.f113336b5);
            C17542s.i(string, "getString(...)");
            Snackbar q02 = Snackbar.q0(b10, string, -1);
            C17542s.i(q02, "make(...)");
            M0().K2();
            View K10 = q02.K();
            C17542s.i(K10, "getView(...)");
            K10.setBackgroundColor(-16777216);
            q02.b0();
        }
    }

    public final DeviceCompatibility I0() {
        DeviceCompatibility deviceCompatibility = this.f124188T;
        if (deviceCompatibility != null) {
            return deviceCompatibility;
        }
        C17542s.z("deviceCompatibility");
        return null;
    }

    public final UserRepo L0() {
        UserRepo userRepo = this.f124190X;
        if (userRepo != null) {
            return userRepo;
        }
        C17542s.z("userRepo");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13448z c10 = C13448z.c(layoutInflater, viewGroup, false);
        this.f124183O = c10;
        if (c10 != null) {
            return c10.getRoot();
        }
        return null;
    }

    public void onResume() {
        super.onResume();
        N0();
    }

    public void onShowMoreButtonClicked(int i10, C12787d dVar) {
        C17542s.j(dVar, "scene");
        C13291e.c(getActivity(), C12603x.Companion.a(i10), new C15256q(this, dVar));
    }

    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C13448z zVar = this.f124183O;
        if (zVar != null) {
            GalleryHomeContentAdapter galleryHomeContentAdapter = new GalleryHomeContentAdapter(getContext(), J0(), this, q0(), L0(), m0(), I0());
            galleryHomeContentAdapter.setStateRestorationPolicy(RecyclerView.h.a.PREVENT);
            this.f124186R = galleryHomeContentAdapter;
            C5191t requireActivity = requireActivity();
            C17542s.g(requireActivity);
            this.f124187S = new C12600u(requireActivity, M0(), J0());
            RecyclerView recyclerView = zVar.f114757d;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(C17542s.e(K0(), h.b.f124418e) ? this.f124187S : this.f124186R);
            C17542s.g(recyclerView);
            Z.d(recyclerView);
            zVar.f114756c.setOnRefreshListener(new C15250m(this));
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            int g10 = j.g(Kreativ.Gallery.Home.Companion.serializer());
            Class<Kreativ.Gallery.Home> cls = Kreativ.Gallery.Home.class;
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    C16532g R10 = C16534i.R(C5208k.a(lVar.h().i(GalleryMainBottomSheet.a.REQUEST_KEY, null), lVar.getLifecycle(), r.b.RESUMED), new d(lVar, GalleryMainBottomSheet.a.REQUEST_KEY, (C17164e) null, this));
                    C5221y viewLifecycleOwner = getViewLifecycleOwner();
                    C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C16534i.M(R10, C5222z.a(viewLifecycleOwner));
                    return;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }
}
