package com.sugarcube.app.base.ui.gallery;

import DF.C12754C;
import Ga.C9092a;
import JF.C13084F;
import JF.C13089K;
import JF.T;
import NF.C13291e;
import OE.C13317i;
import OE.C13319k;
import OE.C13320l;
import OE.n;
import QE.C13427d;
import QE.C13447y;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import S1.C4820m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import UE.C13733a;
import VE.C13760b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YE.C13868b;
import aF.C13959W;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.v;
import androidx.activity.w;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.e0;
import androidx.lifecycle.r;
import androidx.viewpager2.widget.ViewPager2;
import cF.C14039a;
import cF.C14040b;
import cF.C14042d;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.KreativLocation;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.app.base.ui.gallery.a;
import com.sugarcube.app.base.ui.gallery.b;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import dF.C14344b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import n0.C5607m;
import nI.C17631a;
import nI.p;
import tF.C15078c;
import tF.C15083h;
import tK.Z;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.D;
import x4.E;
import x4.I;
import x4.L;
import xF.C15218A;
import xF.C15219B;
import xF.C15220C;
import xF.C15221D;
import xF.C15222E;
import xF.C15223F;
import xF.C15224G;
import xF.C15225H;
import xF.C15228b;
import xF.C15257s;
import xF.C15258t;
import xF.C15259u;
import xF.C15260v;
import xF.C15261w;
import xF.C15264z;
import xF.J;
import xF.K;
import xF.M;
import xF.N;
import zF.C15340a;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b%\u0010\"J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0004J\u0019\u0010-\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0004J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\u0004J-\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010\u0004J:\u0010I\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010gR\"\u0010q\u001a\u00020k8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bg\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0001\u001a\u00020z8\u0000@\u0000X.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryHomeFragment;", "Lcom/sugarcube/app/base/ui/BaseFragment;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "", "showLoading", "LXH/N;", "h1", "(Z)V", "", "count", "a2", "(Ljava/lang/Integer;)V", "B1", "Lcom/sugarcube/app/base/data/model/Design;", "design", "", "furniture", "y1", "(Lcom/sugarcube/app/base/data/model/Design;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "E1", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "Ljava/util/UUID;", "uuid", "F1", "(Ljava/util/UUID;)V", "G1", "u1", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "x1", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "X1", "H1", "w1", "type", "v1", "(Ljava/lang/String;)V", "C1", "D1", "r1", "showCamera", "k1", "i1", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "feedbackType", "Y1", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;)V", "g1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "decorFitsSystemWindows", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LQE/y;", "P", "LQE/y;", "binding", "LDF/C;", "Q", "LXH/o;", "q1", "()LDF/C;", "viewModel", "Lcom/sugarcube/app/base/ui/gallery/b;", "R", "p1", "()Lcom/sugarcube/app/base/ui/gallery/b;", "interactions", "Landroidx/viewpager2/widget/ViewPager2;", "S", "Landroidx/viewpager2/widget/ViewPager2;", "pager", "Lcom/google/android/material/tabs/TabLayout;", "T", "Lcom/google/android/material/tabs/TabLayout;", "tabs", "LzF/a;", "U", "LzF/a;", "adapter", "X", "Z", "hasSuccessfullyShownCaptureFeedback", "Y", "hasSuccessfullyShownDesignFeedback", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "n1", "()Lcom/sugarcube/app/base/data/analytics/Analytics;", "setAnalytics$base_release", "(Lcom/sugarcube/app/base/data/analytics/Analytics;)V", "analytics", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "y0", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "m1", "()Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "setAccountInteractions$base_release", "(Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "accountInteractions", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "z0", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository$base_release", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository$base_release", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "LUE/a;", "A0", "LUE/a;", "getDeeplinks$base_release", "()LUE/a;", "setDeeplinks$base_release", "(LUE/a;)V", "deeplinks", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "B0", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "o1", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "setFirebaseInteractions", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "firebaseInteractions", "Lg/c;", "C0", "Lg/c;", "requestPermissionLauncher", "D0", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryHomeFragment extends g implements SystemUiDelegate {

    /* renamed from: D0  reason: collision with root package name */
    public static final a f124206D0 = new a((DefaultConstructorMarker) null);

    /* renamed from: E0  reason: collision with root package name */
    public static final int f124207E0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    public C13733a f124208A0;

    /* renamed from: B0  reason: collision with root package name */
    public FirebaseInteractions f124209B0;

    /* renamed from: C0  reason: collision with root package name */
    private C5314c<String> f124210C0;

    /* renamed from: O  reason: collision with root package name */
    private final /* synthetic */ T f124211O = new T();

    /* renamed from: P  reason: collision with root package name */
    private C13447y f124212P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f124213Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f124214R;

    /* renamed from: S  reason: collision with root package name */
    private ViewPager2 f124215S;

    /* renamed from: T  reason: collision with root package name */
    private TabLayout f124216T;

    /* renamed from: U  reason: collision with root package name */
    private C15340a f124217U;

    /* renamed from: X  reason: collision with root package name */
    private boolean f124218X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f124219Y;

    /* renamed from: Z  reason: collision with root package name */
    public Analytics f124220Z;

    /* renamed from: y0  reason: collision with root package name */
    public AccountInteractions f124221y0;

    /* renamed from: z0  reason: collision with root package name */
    public ConfigRepository f124222z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryHomeFragment$a;", "", "<init>", "()V", "", "PRESENTING_FEEDBACK_DELAY_MILLIS", "J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124223a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f124224b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b[] r0 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r2 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r3 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_DESIGN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f124223a = r0
                JF.L[] r0 = JF.C13090L.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                JF.L r3 = JF.C13090L.PERMISSION_GRANTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                JF.L r1 = JF.C13090L.CAN_ASK_PERMISSION     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                JF.L r1 = JF.C13090L.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f124224b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f124225a;

        c(boolean z10) {
            this.f124225a = z10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1023012651, i10, -1, "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.configureLoading.<anonymous> (GalleryHomeFragment.kt:338)");
                }
                if (this.f124225a) {
                    Z.g(C5607m.a(mVar, 0), (C4820m) null, C15228b.f131984a.a(), mVar, 384, 2);
                }
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

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/sugarcube/app/base/ui/gallery/GalleryHomeFragment$d", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "transientBottomBar", "", "event", "LXH/N;", "d", "(Lcom/google/android/material/snackbar/Snackbar;I)V", "sb", "c", "(Lcom/google/android/material/snackbar/Snackbar;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends Snackbar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124226a;

        d(GalleryHomeFragment galleryHomeFragment) {
            this.f124226a = galleryHomeFragment;
        }

        /* renamed from: c */
        public void b(Snackbar snackbar) {
            this.f124226a.q1().i3();
        }

        @SuppressLint({"SwitchIntDef"})
        /* renamed from: d */
        public void a(Snackbar snackbar, int i10) {
            if (i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f124226a.q1().Q1();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment$navigateToScan$1", f = "GalleryHomeFragment.kt", l = {535}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124227c;

        e(C17164e<? super e> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124227c;
            if (i10 == 0) {
                y.b(obj);
                this.f124227c = 1;
                if (C16297b0.b(200, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b(h.c.f124419e);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment$onNewDesignClicked$1$1", f = "GalleryHomeFragment.kt", l = {400}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124229d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Design f124230e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f124231f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GalleryHomeFragment galleryHomeFragment, Design design, String str, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f124229d = galleryHomeFragment;
            this.f124230e = design;
            this.f124231f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f124229d, this.f124230e, this.f124231f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124228c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Boolean> B12 = this.f124229d.q1().B1();
                this.f124228c = 1;
                obj = C16534i.B(B12, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (this.f124230e.isShowroom() || !booleanValue) {
                C8951o a10 = androidx.navigation.fragment.a.a(this.f124229d);
                String uuid = this.f124230e.getUuid().toString();
                C17542s.i(uuid, "toString(...)");
                C14040b.b(a10, uuid, String.valueOf(this.f124230e.getCompositionUUID()), this.f124230e.getRoomId(), true, this.f124231f, (C) null, 32, (Object) null);
            } else {
                C14042d.b(androidx.navigation.fragment.a.a(this.f124229d), this.f124230e.getUuid(), this.f124230e.getName(), 0, this.f124231f, C13959W.f118791a.b().a(), 4, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124232a;

        g(GalleryHomeFragment galleryHomeFragment) {
            this.f124232a = galleryHomeFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(122640828, i10, -1, "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.onViewCreated.<anonymous>.<anonymous> (GalleryHomeFragment.kt:286)");
                }
                C15078c.b(this.f124232a.q1().C1(), mVar, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment$onViewCreated$18", f = "GalleryHomeFragment.kt", l = {315}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124233c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124234d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryHomeFragment$onViewCreated$18$1", f = "GalleryHomeFragment.kt", l = {316}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124235c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ GalleryHomeFragment f124236d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.app.base.ui.gallery.GalleryHomeFragment$h$a$a  reason: collision with other inner class name */
            static final class C3050a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ GalleryHomeFragment f124237a;

                C3050a(GalleryHomeFragment galleryHomeFragment) {
                    this.f124237a = galleryHomeFragment;
                }

                /* renamed from: c */
                public final Object emit(b.a aVar, C17164e<? super C16807N> eVar) {
                    if (C17542s.e(aVar, b.a.C3053a.f124356a)) {
                        this.f124237a.u1();
                    } else if (aVar instanceof b.a.C3054b) {
                        this.f124237a.v1(((b.a.C3054b) aVar).a());
                    } else if (aVar instanceof b.a.c) {
                        this.f124237a.w1(((b.a.c) aVar).a());
                    } else if (aVar instanceof b.a.d) {
                        this.f124237a.x1(((b.a.d) aVar).a());
                    } else if (aVar instanceof b.a.e) {
                        b.a.e eVar2 = (b.a.e) aVar;
                        this.f124237a.y1(eVar2.a(), eVar2.b());
                    } else if (C17542s.e(aVar, b.a.f.f124362a)) {
                        this.f124237a.B1();
                    } else if (C17542s.e(aVar, b.a.g.f124363a)) {
                        this.f124237a.C1();
                    } else if (C17542s.e(aVar, b.a.h.f124364a)) {
                        this.f124237a.D1();
                    } else if (aVar instanceof b.a.i) {
                        this.f124237a.E1(((b.a.i) aVar).a());
                    } else if (aVar instanceof b.a.j) {
                        this.f124237a.F1(((b.a.j) aVar).a());
                    } else if (aVar instanceof b.a.k) {
                        this.f124237a.G1(((b.a.k) aVar).a());
                    } else if (aVar instanceof b.a.l) {
                        this.f124237a.H1(((b.a.l) aVar).a());
                    } else if (aVar instanceof b.a.m) {
                        this.f124237a.X1(((b.a.m) aVar).a());
                    } else {
                        throw new t();
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(GalleryHomeFragment galleryHomeFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f124236d = galleryHomeFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f124236d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124235c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<b.a> C10 = this.f124236d.p1().C();
                    C3050a aVar = new C3050a(this.f124236d);
                    this.f124235c = 1;
                    if (C10.collect(aVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GalleryHomeFragment galleryHomeFragment, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f124234d = galleryHomeFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f124234d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124233c;
            if (i10 == 0) {
                y.b(obj);
                GalleryHomeFragment galleryHomeFragment = this.f124234d;
                r.b bVar = r.b.RESUMED;
                a aVar = new a(galleryHomeFragment, (C17164e<? super a>) null);
                this.f124233c = 1;
                if (androidx.lifecycle.Q.b(galleryHomeFragment, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/gallery/GalleryHomeFragment$i", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$e;", "tab", "LXH/N;", "a", "(Lcom/google/android/material/tabs/TabLayout$e;)V", "b", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124238a;

        i(GalleryHomeFragment galleryHomeFragment) {
            this.f124238a = galleryHomeFragment;
        }

        public void a(TabLayout.e eVar) {
            h hVar = null;
            Object k10 = eVar != null ? eVar.k() : null;
            if (k10 instanceof h) {
                hVar = (h) k10;
            }
            if (hVar != null) {
                this.f124238a.q1().D2(hVar);
            }
        }

        public void b(TabLayout.e eVar) {
        }

        public void c(TabLayout.e eVar) {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/sugarcube/app/base/ui/gallery/GalleryHomeFragment$j", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124239b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GalleryHomeFragment galleryHomeFragment) {
            super(false);
            this.f124239b = galleryHomeFragment;
        }

        public void handleOnBackPressed() {
            this.f124239b.q1().M0();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/app/base/ui/gallery/GalleryHomeFragment$k", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "smileRating", "", "feedback", "LXH/N;", "onFeedbackEntered", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;Ljava/lang/String;)V", "onFeedbackDismissed", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements FeedbackBottomSheet.OnFeedbackEnteredListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet.b f124240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GalleryHomeFragment f124241b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f124242a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b[] r0 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r1 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r1 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_DESIGN     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f124242a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.k.a.<clinit>():void");
            }
        }

        k(FeedbackBottomSheet.b bVar, GalleryHomeFragment galleryHomeFragment) {
            this.f124240a = bVar;
            this.f124241b = galleryHomeFragment;
        }

        public void onFeedbackDismissed() {
            int i10 = a.f124242a[this.f124240a.ordinal()];
            if (i10 == 1) {
                this.f124241b.q1().K0();
            } else if (i10 == 2) {
                this.f124241b.q1().L0();
            } else {
                throw new t();
            }
        }

        public void onFeedbackEntered(FeedbackSmileRatingBar.a aVar, String str) {
            C17542s.j(aVar, "smileRating");
            int i10 = a.f124242a[this.f124240a.ordinal()];
            if (i10 == 1) {
                this.f124241b.q1().B2(aVar, str);
            } else if (i10 == 2) {
                this.f124241b.q1().C2(aVar, str);
            } else {
                throw new t();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class l implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124243a;

        public l(C5187o oVar) {
            this.f124243a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124243a);
            int g10 = C4.j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
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
    public static final class m implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124244a;

        public m(C5187o oVar) {
            this.f124244a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124244a);
            int g10 = C4.j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
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

    public GalleryHomeFragment() {
        C16824o b10 = C16825p.b(new l(this));
        this.f124213Q = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
        C16824o b11 = C16825p.b(new m(this));
        this.f124214R = W.b(this, P.b(b.class), new C14045g(b11), new C14043e(b11), new C14044f(this, b11));
    }

    /* access modifiers changed from: private */
    public static final C16807N A1(L l10) {
        C17542s.j(l10, "$this$popUpTo");
        l10.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void B1() {
        r1();
        q0().b().galleryScanMarketingNewCapture(KreativLocation.Card);
    }

    /* access modifiers changed from: private */
    public final void C1() {
        q1().f2();
    }

    /* access modifiers changed from: private */
    public final void D1() {
        q1().onPullRefresh();
    }

    /* access modifiers changed from: private */
    public final void E1(Scene scene) {
        q1().q2(scene);
    }

    /* access modifiers changed from: private */
    public final void F1(UUID uuid) {
        C8951o.f0(androidx.navigation.fragment.a.a(this), new Kreativ.Gallery.Detail(uuid.toString()), (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void G1(UUID uuid) {
        q1().A2(uuid);
    }

    /* access modifiers changed from: private */
    public final void H1(h hVar) {
        C5191t activity = getActivity();
        if (activity != null) {
            m1().navigateSignup(activity);
        }
        if (C17542s.e(hVar, h.d.f124420e)) {
            n1().galleryShowroomsSignup();
        } else if (C17542s.e(hVar, h.c.f124419e)) {
            n1().galleryScanMarketingSignUp();
        } else {
            C16807N n10 = C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r9 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N I1(com.sugarcube.app.base.ui.gallery.GalleryHomeFragment r9, DF.C12754C.C12761h r10) {
        /*
            java.util.List r0 = r10.d()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "adapter"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0012
            r9.h1(r2)
            goto L_0x0021
        L_0x0012:
            zF.a r0 = r9.f124217U
            if (r0 != 0) goto L_0x001a
            kotlin.jvm.internal.C17542s.z(r1)
            r0 = r3
        L_0x001a:
            java.util.List r4 = r10.d()
            r0.z(r4)
        L_0x0021:
            com.sugarcube.app.base.ui.gallery.h r0 = r10.c()
            if (r0 == 0) goto L_0x018c
            zF.a r4 = r9.f124217U
            if (r4 != 0) goto L_0x002f
            kotlin.jvm.internal.C17542s.z(r1)
            r4 = r3
        L_0x002f:
            int r0 = r4.y(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r4 = -1
            if (r1 <= r4) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r3
        L_0x0040:
            if (r0 == 0) goto L_0x0054
            int r0 = r0.intValue()
            androidx.viewpager2.widget.ViewPager2 r9 = r9.f124215S
            if (r9 == 0) goto L_0x0051
            r1 = 0
            r9.j(r0, r1)
            XH.N r9 = XH.C16807N.f139792a
            goto L_0x0052
        L_0x0051:
            r9 = r3
        L_0x0052:
            if (r9 != 0) goto L_0x018c
        L_0x0054:
            com.sugarcube.core.logger.Priority r9 = com.sugarcube.core.logger.Priority.DEBUG
            com.sugarcube.app.base.ui.gallery.h r10 = r10.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TabSelection: setting page for tab: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " position: not found"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x0075
            r10 = r0
        L_0x0075:
            int[] r1 = xF.O.f131974a
            int r9 = r9.ordinal()
            r9 = r1[r9]
            java.lang.String r1 = " "
            java.lang.String r4 = "Kt"
            r5 = 46
            r6 = 36
            java.lang.Class<com.sugarcube.app.base.ui.gallery.GalleryHomeFragment> r7 = com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.class
            r8 = 2
            if (r9 == r2) goto L_0x015d
            if (r9 == r8) goto L_0x012d
            r2 = 3
            if (r9 == r2) goto L_0x00fd
            r2 = 4
            if (r9 == r2) goto L_0x00cc
            r2 = 5
            if (r9 != r2) goto L_0x00c6
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r2 = HJ.C15854t.s1(r9, r6, r3, r8, r3)
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r3, r8, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x00ab
            goto L_0x00af
        L_0x00ab:
            java.lang.String r9 = HJ.C15854t.P0(r2, r4)
        L_0x00af:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            android.util.Log.e(r9, r10)
            goto L_0x018c
        L_0x00c6:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        L_0x00cc:
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r2 = HJ.C15854t.s1(r9, r6, r3, r8, r3)
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r3, r8, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            java.lang.String r9 = HJ.C15854t.P0(r2, r4)
        L_0x00e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r9, r10)
            goto L_0x018c
        L_0x00fd:
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r2 = HJ.C15854t.s1(r9, r6, r3, r8, r3)
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r3, r8, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            java.lang.String r9 = HJ.C15854t.P0(r2, r4)
        L_0x0117:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            android.util.Log.i(r9, r10)
            goto L_0x018c
        L_0x012d:
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r2 = HJ.C15854t.s1(r9, r6, r3, r8, r3)
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r3, r8, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0143
            goto L_0x0147
        L_0x0143:
            java.lang.String r9 = HJ.C15854t.P0(r2, r4)
        L_0x0147:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            android.util.Log.d(r9, r10)
            goto L_0x018c
        L_0x015d:
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r2 = HJ.C15854t.s1(r9, r6, r3, r8, r3)
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r3, r8, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0173
            goto L_0x0177
        L_0x0173:
            java.lang.String r9 = HJ.C15854t.P0(r2, r4)
        L_0x0177:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
            android.util.Log.v(r9, r10)
        L_0x018c:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.I1(com.sugarcube.app.base.ui.gallery.GalleryHomeFragment, DF.C$h):XH.N");
    }

    /* access modifiers changed from: private */
    public static final C16807N J1(GalleryHomeFragment galleryHomeFragment, Integer num) {
        galleryHomeFragment.a2(num);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue() && !galleryHomeFragment.f124218X) {
            galleryHomeFragment.f124218X = true;
            galleryHomeFragment.Y1(FeedbackBottomSheet.b.FEEDBACK_CAPTURE);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue() && !galleryHomeFragment.f124219Y) {
            galleryHomeFragment.f124219Y = true;
            galleryHomeFragment.Y1(FeedbackBottomSheet.b.FEEDBACK_DESIGN);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeFragment.q1().O2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryHomeFragment);
            Kreativ.e eVar = Kreativ.e.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, eVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeFragment.q1().M2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryHomeFragment);
            Kreativ.d dVar = Kreativ.d.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, dVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeFragment.q1().L2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryHomeFragment);
            Kreativ.a aVar = Kreativ.a.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, aVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        C17542s.g(bool);
        galleryHomeFragment.k1(bool.booleanValue());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeFragment.g1();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R1(j jVar, C15083h hVar) {
        jVar.setEnabled(hVar != null && !C17542s.e(hVar, C15083h.a.f131169a));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (C17542s.e(bool, Boolean.TRUE)) {
            galleryHomeFragment.q1().z0();
            galleryHomeFragment.i1();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T1(GalleryHomeFragment galleryHomeFragment, TabLayout tabLayout, ViewPager2 viewPager2) {
        C17542s.j(tabLayout, "tabs");
        C17542s.j(viewPager2, "pager");
        new com.google.android.material.tabs.d(tabLayout, viewPager2, true, true, new C15222E(galleryHomeFragment)).a();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void U1(GalleryHomeFragment galleryHomeFragment, TabLayout.e eVar, int i10) {
        C17542s.j(eVar, "tab");
        C15340a aVar = galleryHomeFragment.f124217U;
        if (aVar == null) {
            C17542s.z("adapter");
            aVar = null;
        }
        h x10 = aVar.x(i10);
        eVar.v(galleryHomeFragment.getResources().getString(x10.c()));
        eVar.u(x10);
        galleryHomeFragment.a2(galleryHomeFragment.q1().q1().getValue());
    }

    /* access modifiers changed from: private */
    public static final C16807N V1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryHomeFragment.q1().d2();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(GalleryHomeFragment galleryHomeFragment, Boolean bool) {
        C17542s.g(bool);
        galleryHomeFragment.h1(bool.booleanValue());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void X1(h hVar) {
        if (C17542s.e(hVar, h.c.f124419e)) {
            q0().b().galleryScanMarketingHelp();
        } else if (C17542s.e(hVar, h.d.f124420e)) {
            q0().b().galleryShowroomsHelp();
        } else {
            C16807N n10 = C16807N.f139792a;
        }
        String h10 = C13760b.f117438d.h(q1().U0().getCountry(), q1().U0().getLanguage());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(h10));
        startActivity(intent);
    }

    private final void Y1(FeedbackBottomSheet.b bVar) {
        ConstraintLayout b10;
        C13447y yVar = this.f124212P;
        if (yVar != null && (b10 = yVar.getRoot()) != null) {
            b10.postDelayed(new C15218A(this, bVar), 5000);
        }
    }

    /* access modifiers changed from: private */
    public static final void Z1(GalleryHomeFragment galleryHomeFragment, FeedbackBottomSheet.b bVar) {
        if (galleryHomeFragment.isAdded()) {
            C5191t activity = galleryHomeFragment.getActivity();
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                C13084F.t(appCompatActivity, new k(bVar, galleryHomeFragment), bVar);
                return;
            }
            return;
        }
        int i10 = b.f124223a[bVar.ordinal()];
        if (i10 == 1) {
            galleryHomeFragment.f124218X = false;
        } else if (i10 == 2) {
            galleryHomeFragment.f124219Y = false;
        } else {
            throw new t();
        }
    }

    private final void a2(Integer num) {
        C15340a aVar = this.f124217U;
        TabLayout.e eVar = null;
        if (aVar == null) {
            C17542s.z("adapter");
            aVar = null;
        }
        int indexOf = aVar.w().indexOf(h.c.f124419e);
        TabLayout tabLayout = this.f124216T;
        if (tabLayout != null) {
            eVar = tabLayout.B(indexOf);
        }
        if (eVar == null) {
            return;
        }
        if (num == null || num.intValue() == 0) {
            C9092a e10 = eVar.e();
            if (e10 != null) {
                e10.N(false);
                return;
            }
            return;
        }
        C9092a h10 = eVar.h();
        h10.M(num.intValue());
        h10.N(true);
        C17542s.g(h10);
    }

    private final void g1() {
        if (Build.VERSION.SDK_INT >= 33) {
            C5191t activity = getActivity();
            if (activity != null) {
                int i10 = b.f124224b[C13089K.d(activity, "android.permission.POST_NOTIFICATIONS").ordinal()];
                Class<GalleryHomeFragment> cls = GalleryHomeFragment.class;
                if (i10 != 1) {
                    C5314c<String> cVar = null;
                    if (i10 == 2) {
                        C13868b bVar = C13868b.f118106a;
                        String canonicalName = cls.getCanonicalName();
                        bVar.b(canonicalName + ": notifications permission rationale", YE.e.Capture);
                        C13089K.j(activity, (C17631a) null, 1, (Object) null);
                        q1().I2();
                    } else if (i10 == 3) {
                        C13868b bVar2 = C13868b.f118106a;
                        String canonicalName2 = cls.getCanonicalName();
                        bVar2.b(canonicalName2 + ": notification permission denied", YE.e.Capture);
                        C5314c<String> cVar2 = this.f124210C0;
                        if (cVar2 == null) {
                            C17542s.z("requestPermissionLauncher");
                        } else {
                            cVar = cVar2;
                        }
                        cVar.a("android.permission.POST_NOTIFICATIONS");
                    } else {
                        throw new t();
                    }
                } else {
                    C13868b bVar3 = C13868b.f118106a;
                    String canonicalName3 = cls.getCanonicalName();
                    bVar3.b(canonicalName3 + ": notification permission granted", YE.e.Capture);
                    C14344b.f126192a.a(activity);
                }
            }
        } else {
            C5191t activity2 = getActivity();
            if (activity2 != null) {
                C14344b.f126192a.a(activity2);
            }
        }
    }

    private final void h1(boolean z10) {
        ComposeView composeView;
        C13447y yVar = this.f124212P;
        if (yVar != null && (composeView = yVar.f114753f) != null) {
            composeView.setContent(c1.c.c(1023012651, true, new c(z10)));
        }
    }

    private final void i1() {
        View view;
        ConstraintLayout b10;
        C13447y yVar = this.f124212P;
        if (yVar == null || (b10 = yVar.getRoot()) == null || (view = b10.getRootView()) == null) {
            view = getView();
        }
        if (view != null) {
            Log.d(AnyKt.SUGARCUBE_TAG, "show snack for " + view);
            try {
                Snackbar q02 = Snackbar.q0(view, getResources().getQuantityString(C13320l.f113165e, 1, new Object[]{1}), -1);
                C17542s.i(q02, "make(...)");
                q02.s0(n.f113373h0, new C15220C(this));
                q02.u(new d(this));
                q02.b0();
            } catch (IllegalArgumentException e10) {
                Log.d(AnyKt.SUGARCUBE_TAG, "show snackbar exception " + e10);
                C13868b bVar = C13868b.f118106a;
                StackTraceElement[] stackTrace = e10.getStackTrace();
                bVar.b("Delete snackbar couldn't be shown: " + stackTrace, YE.e.UI);
                o1().recordException(new IllegalStateException("Delete scene snackbar couldn't be shown.", e10));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j1(GalleryHomeFragment galleryHomeFragment, View view) {
        galleryHomeFragment.q1().o2();
    }

    private final void k1(boolean z10) {
        C13427d dVar;
        MaterialToolbar materialToolbar;
        C13447y yVar = this.f124212P;
        if (yVar != null && (dVar = yVar.f114749b) != null && (materialToolbar = dVar.f114550c) != null) {
            materialToolbar.getMenu().clear();
            if (z10) {
                materialToolbar.x(C13319k.f113160a);
                materialToolbar.setOnMenuItemClickListener(new C15264z(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final boolean l1(GalleryHomeFragment galleryHomeFragment, MenuItem menuItem) {
        if (menuItem.getItemId() != C13317i.f113018g2) {
            return false;
        }
        galleryHomeFragment.q0().b().galleryScanMarketingNewCapture(KreativLocation.QuickAction);
        galleryHomeFragment.r1();
        return true;
    }

    /* access modifiers changed from: private */
    public final b p1() {
        return (b) this.f124214R.getValue();
    }

    /* access modifiers changed from: private */
    public final C12754C q1() {
        return (C12754C) this.f124213Q.getValue();
    }

    private final void r1() {
        C14039a.a(androidx.navigation.fragment.a.a(this), new C.a().b(R.anim.sc_slide_in_right).c(R.anim.sc_slide_out_left).e(R.anim.sc_slide_in_left).f(R.anim.sc_slide_out_right).a());
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new e((C17164e<? super e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void s1(MaterialToolbar materialToolbar, View view) {
        C8951o a10 = x4.P.a(materialToolbar);
        int g10 = C4.j.g(Kreativ.Gallery.INSTANCE.serializer());
        if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
            a10.m0(g10, true, false);
            return;
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Gallery.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    /* access modifiers changed from: private */
    public static final void t1(GalleryHomeFragment galleryHomeFragment, boolean z10) {
        if (z10) {
            galleryHomeFragment.q1().M1().b().captureNotificationsPermissionAllow();
            C13868b bVar = C13868b.f118106a;
            bVar.b(galleryHomeFragment + " - notifications permission granted", YE.e.Capture);
            C5191t activity = galleryHomeFragment.getActivity();
            if (activity != null) {
                C14344b.f126192a.a(activity);
                return;
            }
            return;
        }
        galleryHomeFragment.q1().M1().b().captureNotificationsPermissionDontAllow();
        C13868b bVar2 = C13868b.f118106a;
        bVar2.b(galleryHomeFragment + " - notifications permission denied", YE.e.Capture);
    }

    /* access modifiers changed from: private */
    public final void u1() {
        String d10 = C13760b.f117438d.d(q1().U0().getCountry(), q1().U0().getLanguage());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", n.f113462t5);
        intent.putExtra("android.intent.extra.TEXT", d10);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, (CharSequence) null));
        q1().M1().b().galleryRoomListDesktopLink();
    }

    /* access modifiers changed from: private */
    public final void v1(String str) {
        q0().b().galleryShowroomsNavShortcut(str);
    }

    /* access modifiers changed from: private */
    public final void w1(h hVar) {
        C5191t activity = getActivity();
        if (activity != null) {
            m1().navigateLogin(activity);
        }
        if (C17542s.e(hVar, h.d.f124420e)) {
            n1().galleryShowroomsLogin();
        } else if (C17542s.e(hVar, h.c.f124419e)) {
            n1().galleryScanMarketingLogin();
        } else {
            C16807N n10 = C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void x1(h hVar) {
        if (C17542s.e(hVar, h.c.f124419e)) {
            q0().b().galleryScanMarketingHelp();
        } else if (C17542s.e(hVar, h.d.f124420e)) {
            q0().b().galleryShowroomsHelp();
        } else {
            C16807N n10 = C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void y1(Design design, String str) {
        if (design.isShowroom()) {
            q1().M1().b().showroomsNewDesign(design.getName(), design.getUuid(), design.getRoomId());
        } else {
            q1().M1().b().galleryRoomListNewDesign(design.getName(), design.getUuid(), design.getRoomId());
        }
        if (C17542s.e(q1().W1().getValue(), Boolean.TRUE)) {
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new f(this, design, str, (C17164e<? super f>) null), 3, (Object) null);
        } else {
            C8951o.f0(androidx.navigation.fragment.a.a(this), Kreativ.a.INSTANCE, E.a(new C15219B()), (I.a) null, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z1(D d10) {
        C17542s.j(d10, "$this$navOptions");
        d10.d(P.b(Kreativ.class), new C15223F());
        return C16807N.f139792a;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124211O.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public final AccountInteractions m1() {
        AccountInteractions accountInteractions = this.f124221y0;
        if (accountInteractions != null) {
            return accountInteractions;
        }
        C17542s.z("accountInteractions");
        return null;
    }

    public final Analytics n1() {
        Analytics analytics = this.f124220Z;
        if (analytics != null) {
            return analytics;
        }
        C17542s.z("analytics");
        return null;
    }

    public final FirebaseInteractions o1() {
        FirebaseInteractions firebaseInteractions = this.f124209B0;
        if (firebaseInteractions != null) {
            return firebaseInteractions;
        }
        C17542s.z("firebaseInteractions");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r9 = r9.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            java.lang.String r9 = "inflater"
            kotlin.jvm.internal.C17542s.j(r7, r9)
            android.os.Bundle r9 = r6.getArguments()
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L_0x001e
            java.util.Set r9 = r9.keySet()
            if (r9 == 0) goto L_0x001e
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r9 = r9.toArray(r2)
            java.lang.String[] r9 = (java.lang.String[]) r9
            goto L_0x001f
        L_0x001e:
            r9 = r1
        L_0x001f:
            java.lang.String r9 = java.util.Arrays.toString(r9)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r9, r2)
            android.os.Bundle r2 = r6.getArguments()
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.toString()
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            android.net.Uri r3 = cF.C14041c.b(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\n                GalleryHomeFragment.arguments\n                "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = "\n                "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = "\n                deeplink="
            r4.append(r9)
            r4.append(r3)
            java.lang.String r9 = "\n            "
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            java.lang.String r2 = "Sugarcube"
            android.util.Log.d(r2, r9)
            DF.C r9 = r6.q1()
            r9.l2()
            QE.y r7 = QE.C13447y.c(r7, r8, r0)
            r6.f124212P = r7
            if (r7 == 0) goto L_0x0087
            QE.d r7 = r7.f114749b
            if (r7 == 0) goto L_0x0087
            com.google.android.material.appbar.MaterialToolbar r7 = r7.f114550c
            if (r7 == 0) goto L_0x0087
            int r8 = OE.n.f113476v5
            r7.setTitle((int) r8)
            xF.x r8 = new xF.x
            r8.<init>(r7)
            r7.setNavigationOnClickListener(r8)
        L_0x0087:
            h.c r7 = new h.c
            r7.<init>()
            xF.y r8 = new xF.y
            r8.<init>(r6)
            g.c r7 = r6.registerForActivityResult(r7, r8)
            r6.f124210C0 = r7
            QE.y r7 = r6.f124212P
            if (r7 == 0) goto L_0x009f
            androidx.constraintlayout.widget.ConstraintLayout r1 = r7.getRoot()
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryHomeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onPause() {
        super.onPause();
        q1().l3();
    }

    public void onResume() {
        super.onResume();
        q1().j3();
        q1().p2();
        if (a.a() != null) {
            q1().N1().setValue(C12754C.C12761h.b(q1().N1().getValue(), a.a(), (List) null, 2, (Object) null));
            a.b((h) null);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        TabLayout tabLayout;
        w onBackPressedDispatcher;
        ComposeView composeView;
        C17542s.j(view, "view");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, -1, 12, (Object) null);
        C15340a aVar = new C15340a(this, (List) null, 2, (DefaultConstructorMarker) null);
        this.f124217U = aVar;
        C13447y yVar = this.f124212P;
        if (yVar == null || (viewPager2 = yVar.f114751d) == null) {
            viewPager2 = null;
        } else {
            viewPager2.setAdapter(aVar);
            viewPager2.setUserInputEnabled(false);
        }
        this.f124215S = viewPager2;
        C13447y yVar2 = this.f124212P;
        if (yVar2 == null || (tabLayout = yVar2.f114752e) == null) {
            tabLayout = null;
        } else {
            tabLayout.h(new i(this));
        }
        this.f124216T = tabLayout;
        C13291e.c(tabLayout, this.f124215S, new C15257s(this));
        e0.a(q1().V1()).observe(getViewLifecycleOwner(), new a.C3052a(new J(this)));
        q1().z1().observe(getViewLifecycleOwner(), new a.C3052a(new K(this)));
        C5210m.c(q1().N1(), (C17168i) null, 0, 3, (Object) null).observe(getViewLifecycleOwner(), new a.C3052a(new xF.L(this)));
        q1().q1().observe(getViewLifecycleOwner(), new a.C3052a(new M(this)));
        q1().i1().observe(getViewLifecycleOwner(), new a.C3052a(new N(this)));
        q1().j1().observe(getViewLifecycleOwner(), new a.C3052a(new C15258t(this)));
        e0.a(q1().G1()).observe(getViewLifecycleOwner(), new a.C3052a(new C15259u(this)));
        e0.a(q1().E1()).observe(getViewLifecycleOwner(), new a.C3052a(new C15260v(this)));
        e0.a(q1().A1()).observe(getViewLifecycleOwner(), new a.C3052a(new C15261w(this)));
        e0.a(q1().R1()).observe(getViewLifecycleOwner(), new a.C3052a(new C15221D(this)));
        e0.a(q1().D1()).observe(getViewLifecycleOwner(), new a.C3052a(new C15224G(this)));
        C13447y yVar3 = this.f124212P;
        if (!(yVar3 == null || (composeView = yVar3.f114750c) == null)) {
            composeView.setViewCompositionStrategy(s1.b.f19575b);
            composeView.setContent(c1.c.c(122640828, true, new g(this)));
        }
        j jVar = new j(this);
        q1().C1().observe(getViewLifecycleOwner(), new a.C3052a(new C15225H(jVar)));
        q1().a1().observe(getViewLifecycleOwner(), new a.C3052a(new xF.I(this)));
        C5191t activity = getActivity();
        if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
            C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.i(viewLifecycleOwner2, jVar);
        }
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner3), (C17168i) null, (QJ.T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }
}
