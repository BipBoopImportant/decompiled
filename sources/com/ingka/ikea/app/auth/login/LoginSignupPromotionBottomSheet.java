package com.ingka.ikea.app.auth.login;

import Ae.e;
import Bx.a;
import HJ.C15854t;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16814e;
import XH.t;
import XH.y;
import aA.C13909a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.C5197z;
import androidx.lifecycle.r;
import com.google.android.material.button.MaterialButton;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 O2\u00020\u0001:\u0002PQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u0003J-\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0003R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020D8BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "promotionModeSetting", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Lkotlin/Function0;", "LXH/N;", "onLoginClick", "onMaybeLaterClick", "Landroid/view/View;", "M0", "(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;LnI/a;LnI/a;)Landroid/view/View;", "onCloseClick", "Q0", "(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;LnI/a;LnI/a;)Landroid/view/View;", "I0", "promotionMode", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "R0", "(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "LBx/a$b;", "result", "T0", "(LBx/a$b;)V", "S0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "LaA/a;", "O", "LaA/a;", "H0", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LRd/a;", "P", "LRd/a;", "E0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LAe/e;", "Q", "LAe/e;", "F0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LYe/a;", "R", "LYe/a;", "_binding", "", "S", "Z", "hasSetResultValue", "G0", "()LYe/a;", "binding", "T", "a", "b", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginSignupPromotionBottomSheet extends Hilt_LoginSignupPromotionBottomSheet {

    /* renamed from: T  reason: collision with root package name */
    public static final a f70074T = new a((DefaultConstructorMarker) null);

    /* renamed from: U  reason: collision with root package name */
    public static final int f70075U = 8;

    /* renamed from: O  reason: collision with root package name */
    public C13909a f70076O;

    /* renamed from: P  reason: collision with root package name */
    public Rd.a f70077P;

    /* renamed from: Q  reason: collision with root package name */
    public Ae.e f70078Q;

    /* renamed from: R  reason: collision with root package name */
    private Ye.a f70079R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f70080S;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$a;", "", "<init>", "()V", "LBx/a$a;", "promotionMode", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;", "a", "(LBx/a$a;)Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C16814e
        public final LoginSignupPromotionBottomSheet a(a.C2584a aVar) {
            C17542s.j(aVar, "promotionMode");
            LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet = new LoginSignupPromotionBottomSheet();
            loginSignupPromotionBottomSheet.setArguments(D2.d.b(C16796C.a("promotion_mode_key", aVar)));
            return loginSignupPromotionBottomSheet;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00162\u00020\u0001:\u0006\b\u000b\u0014\u000e\f\rB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "", "", "headerText", "messageText", "joinButtonText", "<init>", "(III)V", "a", "I", "()I", "b", "e", "c", "d", "maybeLaterText", "", "Z", "()Z", "layoutStartAligned", "f", "showLogin", "g", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$a;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$b;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$d;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$e;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$f;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: g  reason: collision with root package name */
        public static final c f70081g = new c((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final int f70082a;

        /* renamed from: b  reason: collision with root package name */
        private final int f70083b;

        /* renamed from: c  reason: collision with root package name */
        private final int f70084c;

        /* renamed from: d  reason: collision with root package name */
        private final int f70085d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f70086e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f70087f;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$a;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final a f70088h = new a();

            private a() {
                super(Oo.b.f84834x4, Oo.b.f84844y4, Oo.b.f84376F8, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 471271765;
            }

            public String toString() {
                return "BackInStockNotifications";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$b;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b$b  reason: collision with other inner class name */
        public static final class C1208b extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final C1208b f70089h = new C1208b();

            private C1208b() {
                super(We.c.f64736r, We.c.f64738t, We.c.f64737s, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1208b);
            }

            public int hashCode() {
                return 451930871;
            }

            public String toString() {
                return "Cart";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$c;", "", "<init>", "()V", "LBx/a$a;", "promotionMode", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "a", "(LBx/a$a;)Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f70090a;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        Bx.a$a[] r0 = Bx.a.C2584a.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        Bx.a$a r1 = Bx.a.C2584a.BACK_IN_STOCK_NOTIFICATIONS     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        Bx.a$a r1 = Bx.a.C2584a.CART     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        Bx.a$a r1 = Bx.a.C2584a.SHOPPING_LIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        Bx.a$a r1 = Bx.a.C2584a.SCAN_AND_GO     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        Bx.a$a r1 = Bx.a.C2584a.SCAN_AND_GO_UPGRADE_TO_FAMILY     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f70090a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.b.c.a.<clinit>():void");
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(a.C2584a aVar) {
                C17542s.j(aVar, "promotionMode");
                int i10 = a.f70090a[aVar.ordinal()];
                if (i10 == 1) {
                    return a.f70088h;
                }
                if (i10 == 2) {
                    return C1208b.f70089h;
                }
                if (i10 == 3) {
                    return f.f70098h;
                }
                if (i10 == 4) {
                    return d.f70091h;
                }
                if (i10 == 5) {
                    return e.f70094h;
                }
                throw new t();
            }

            private c() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$d;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Z", "c", "()Z", "layoutStartAligned", "j", "I", "d", "maybeLaterText", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final d f70091h = new d();

            /* renamed from: i  reason: collision with root package name */
            private static final boolean f70092i = false;

            /* renamed from: j  reason: collision with root package name */
            private static final int f70093j = Oo.b.f84379G1;

            private d() {
                super(Oo.b.f84460O2, Oo.b.f84450N2, Oo.b.f84376F8, (DefaultConstructorMarker) null);
            }

            public boolean c() {
                return f70092i;
            }

            public int d() {
                return f70093j;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -533129429;
            }

            public String toString() {
                return "ScanAndGo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001a\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$e;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Z", "c", "()Z", "layoutStartAligned", "j", "I", "d", "maybeLaterText", "k", "f", "showLogin", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final e f70094h = new e();

            /* renamed from: i  reason: collision with root package name */
            private static final boolean f70095i = false;

            /* renamed from: j  reason: collision with root package name */
            private static final int f70096j = Oo.b.f84379G1;

            /* renamed from: k  reason: collision with root package name */
            private static final boolean f70097k = false;

            private e() {
                super(Oo.b.f84460O2, Oo.b.f84450N2, We.c.f64737s, (DefaultConstructorMarker) null);
            }

            public boolean c() {
                return f70095i;
            }

            public int d() {
                return f70096j;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public boolean f() {
                return f70097k;
            }

            public int hashCode() {
                return 1758950736;
            }

            public String toString() {
                return "ScanAndGoUpgradeToFamily";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b$f;", "Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final f f70098h = new f();

            private f() {
                super(Oo.b.f84769r4, Oo.b.f84758q4, Oo.b.f84376F8, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -1655649539;
            }

            public String toString() {
                return "ShoppingList";
            }
        }

        public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, i12);
        }

        public final int a() {
            return this.f70082a;
        }

        public final int b() {
            return this.f70084c;
        }

        public boolean c() {
            return this.f70086e;
        }

        public int d() {
            return this.f70085d;
        }

        public final int e() {
            return this.f70083b;
        }

        public boolean f() {
            return this.f70087f;
        }

        private b(int i10, int i11, int i12) {
            this.f70082a = i10;
            this.f70083b = i11;
            this.f70084c = i12;
            this.f70085d = Oo.b.f84382G4;
            this.f70086e = true;
            this.f70087f = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$onCreateView$1", f = "LoginSignupPromotionBottomSheet.kt", l = {109}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f70099c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LoginSignupPromotionBottomSheet f70100d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$onCreateView$1$1", f = "LoginSignupPromotionBottomSheet.kt", l = {110}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f70101c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ LoginSignupPromotionBottomSheet f70102d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$c$a$a  reason: collision with other inner class name */
            static final class C1209a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ LoginSignupPromotionBottomSheet f70103a;

                C1209a(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet) {
                    this.f70103a = loginSignupPromotionBottomSheet;
                }

                public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                    if (z10) {
                        this.f70103a.I0();
                    }
                    return C16807N.f139792a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                    return c(((Boolean) obj).booleanValue(), eVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f70102d = loginSignupPromotionBottomSheet;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f70102d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f70101c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<Boolean> n10 = this.f70102d.H0().n();
                    C1209a aVar = new C1209a(this.f70102d);
                    this.f70101c = 1;
                    if (n10.collect(aVar, this) == f10) {
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
        c(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f70100d = loginSignupPromotionBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f70100d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f70099c;
            if (i10 == 0) {
                y.b(obj);
                LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet = this.f70100d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(loginSignupPromotionBottomSheet, (C17164e<? super a>) null);
                this.f70099c = 1;
                if (androidx.lifecycle.Q.b(loginSignupPromotionBottomSheet, bVar, aVar, this) == f10) {
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
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d() {
            super(0, C17542s.a.class, "openLogin", "onCreateView$openLogin(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            LoginSignupPromotionBottomSheet.L0(LoginSignupPromotionBottomSheet.this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e() {
            super(0, C17542s.a.class, "closePrompt", "onCreateView$closePrompt(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            LoginSignupPromotionBottomSheet.K0(LoginSignupPromotionBottomSheet.this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f() {
            super(0, C17542s.a.class, "openLogin", "onCreateView$openLogin(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            LoginSignupPromotionBottomSheet.L0(LoginSignupPromotionBottomSheet.this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements C17631a<C16807N> {
        g() {
            super(0, C17542s.a.class, "closePrompt", "onCreateView$closePrompt(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            LoginSignupPromotionBottomSheet.K0(LoginSignupPromotionBottomSheet.this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f70108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f70109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f70110c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f70111a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f70112b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f70113c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f70114d;

            a(b bVar, int i10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
                this.f70111a = bVar;
                this.f70112b = i10;
                this.f70113c = aVar;
                this.f70114d = aVar2;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1605228847, i10, -1, "com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.renderNewPromotionUi.<anonymous>.<anonymous>.<anonymous> (LoginSignupPromotionBottomSheet.kt:206)");
                    }
                    a.h(this.f70111a, this.f70112b, this.f70113c, this.f70114d, (androidx.compose.ui.d) null, mVar, 0, 16);
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

        h(b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f70108a = bVar;
            this.f70109b = aVar;
            this.f70110c = aVar2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-179570709, i10, -1, "com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.renderNewPromotionUi.<anonymous>.<anonymous> (LoginSignupPromotionBottomSheet.kt:202)");
                }
                Activity a10 = Xo.c.a((Context) mVar.Q(AndroidCompositionLocals_androidKt.g()));
                if (a10 != null) {
                    TC.e.e(true, c1.c.e(-1605228847, true, new a(this.f70108a, T0.a.a(a10, mVar, 0).a(), this.f70109b, this.f70110c), mVar, 54), mVar, 54, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    private final Ye.a G0() {
        Ye.a aVar = this.f70079R;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void I0() {
        T0(a.b.c.f108192a);
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J0(DialogInterface dialogInterface) {
        C17542s.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        aVar.o().X0(3);
        aVar.o().W0(true);
    }

    /* access modifiers changed from: private */
    public static final void K0(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet) {
        loginSignupPromotionBottomSheet.T0(a.b.C2587b.f108191a);
        loginSignupPromotionBottomSheet.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L0(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet) {
        C5191t activity = loginSignupPromotionBottomSheet.getActivity();
        if (activity != null) {
            e.c.b(loginSignupPromotionBottomSheet.F0(), Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
            loginSignupPromotionBottomSheet.E0().d(activity);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Activity was null trying to launch login");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = LoginSignupPromotionBottomSheet.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
    }

    private final View M0(b bVar, LayoutInflater layoutInflater, ViewGroup viewGroup, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        this.f70079R = Ye.a.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayout = G0().f64973c;
        C17542s.i(constraintLayout, "constraintRoot");
        R0(bVar, constraintLayout);
        MaterialButton materialButton = G0().f64976f;
        if (bVar.f()) {
            materialButton.setOnClickListener(new ef.e(aVar));
        } else {
            materialButton.setVisibility(4);
        }
        MaterialButton materialButton2 = G0().f64975e;
        materialButton2.setText(getString(bVar.b()));
        materialButton2.setOnClickListener(new ef.f(this));
        TextView textView = G0().f64977g;
        textView.setText(getString(bVar.d()));
        textView.setOnClickListener(new ef.g(aVar2));
        C17542s.g(textView);
        jp.e.c(textView, true);
        G0().f64974d.setText(getString(bVar.a()));
        G0().f64978h.setText(getString(bVar.e()));
        ConstraintLayout b10 = G0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    /* access modifiers changed from: private */
    public static final void N0(C17631a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void O0(LoginSignupPromotionBottomSheet loginSignupPromotionBottomSheet, View view) {
        loginSignupPromotionBottomSheet.S0();
    }

    /* access modifiers changed from: private */
    public static final void P0(C17631a aVar, View view) {
        aVar.invoke();
    }

    private final View Q0(b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(c1.c.c(-179570709, true, new h(bVar, aVar2, aVar)));
        return composeView;
    }

    private final void R0(b bVar, ConstraintLayout constraintLayout) {
        if (!bVar.c()) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(constraintLayout);
            cVar.v(We.a.f64702r, 1.0f);
            cVar.c(constraintLayout);
        }
    }

    private final void S0() {
        C5191t activity = getActivity();
        if (activity != null) {
            e.c.b(F0(), Interaction$Component.SIGN_UP_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
            E0().e(activity);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Activity was null trying to launch signup");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = LoginSignupPromotionBottomSheet.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
    }

    private final void T0(a.b bVar) {
        if (!this.f70080S) {
            if (rw.a.b(this)) {
                rw.d.b(androidx.navigation.fragment.a.a(this), "login_signup_promotion_signup", bVar);
            }
            C5197z.c(this, "login_signup_promotion_signup", D2.d.b(C16796C.a("selectedPromotion", bVar)));
            this.f70080S = true;
        }
    }

    public final Rd.a E0() {
        Rd.a aVar = this.f70077P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final Ae.e F0() {
        Ae.e eVar = this.f70078Q;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final C13909a H0() {
        C13909a aVar = this.f70076O;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.i(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setOnShowListener(new ef.d());
        return onCreateDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r13 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r13 = r13.getString("promotion_mode");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            java.lang.String r13 = "inflater"
            kotlin.jvm.internal.C17542s.j(r11, r13)
            android.os.Bundle r13 = r10.getArguments()
            r0 = 0
            if (r13 == 0) goto L_0x001b
            java.lang.String r1 = "promotion_mode_key"
            java.io.Serializable r13 = r13.getSerializable(r1)
            boolean r1 = r13 instanceof Bx.a.C2584a
            if (r1 != 0) goto L_0x0017
            r13 = r0
        L_0x0017:
            Bx.a$a r13 = (Bx.a.C2584a) r13
            if (r13 != 0) goto L_0x002f
        L_0x001b:
            android.os.Bundle r13 = r10.getArguments()
            if (r13 == 0) goto L_0x002e
            java.lang.String r1 = "promotion_mode"
            java.lang.String r13 = r13.getString(r1)
            if (r13 == 0) goto L_0x002e
            Bx.a$a r13 = Bx.a.C2584a.valueOf(r13)
            goto L_0x002f
        L_0x002e:
            r13 = r0
        L_0x002f:
            if (r13 != 0) goto L_0x00e4
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "No arguments when starting the Fragment."
            r11.<init>(r12)
            qv.e r12 = qv.e.ERROR
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x004b:
            boolean r2 = r13.hasNext()
            r7 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r13.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            boolean r3 = r3.b(r12, r7)
            if (r3 == 0) goto L_0x004b
            r1.add(r2)
            goto L_0x004b
        L_0x0063:
            java.util.Iterator r13 = r1.iterator()
            r1 = r0
            r2 = r1
        L_0x0069:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00e0
            java.lang.Object r3 = r13.next()
            qv.b r3 = (qv.C11819b) r3
            if (r1 != 0) goto L_0x0083
            java.lang.String r1 = qv.C11818a.a(r0, r11)
            if (r1 != 0) goto L_0x007f
            goto L_0x00e0
        L_0x007f:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x0083:
            r8 = r1
            if (r2 != 0) goto L_0x00d3
            java.lang.Class<com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet> r1 = com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            r4 = 2
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r0, r4, r0)
            r5 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r0, r4, r0)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x00a9:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "main"
            r5 = 1
            boolean r2 = HJ.C15854t.b0(r2, r4, r5)
            if (r2 == 0) goto L_0x00bd
            java.lang.String r2 = "m"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r2 = "b"
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "|"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
        L_0x00d3:
            r9 = r2
            r1 = r3
            r2 = r12
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r1.a(r2, r3, r4, r5, r6)
            r1 = r8
            r2 = r9
            goto L_0x0069
        L_0x00e0:
            r10.dismiss()
            return r0
        L_0x00e4:
            Bx.a$a r1 = Bx.a.C2584a.SCAN_AND_GO_UPGRADE_TO_FAMILY
            if (r13 == r1) goto L_0x0101
            androidx.lifecycle.y r1 = r10.getViewLifecycleOwner()
            java.lang.String r2 = "getViewLifecycleOwner(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            androidx.lifecycle.s r3 = androidx.lifecycle.C5222z.a(r1)
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$c r6 = new com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$c
            r6.<init>(r10, r0)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            QJ.F0 unused = QJ.C16314k.d(r3, r4, r5, r6, r7, r8)
        L_0x0101:
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b$c r0 = com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.b.f70081g
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b r2 = r0.a(r13)
            Bx.a$a r0 = Bx.a.C2584a.SHOPPING_LIST
            if (r13 != r0) goto L_0x011a
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$d r11 = new com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$d
            r11.<init>()
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$e r12 = new com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$e
            r12.<init>()
            android.view.View r11 = r10.Q0(r2, r11, r12)
            goto L_0x012b
        L_0x011a:
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$f r5 = new com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$f
            r5.<init>()
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$g r6 = new com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$g
            r6.<init>()
            r1 = r10
            r3 = r11
            r4 = r12
            android.view.View r11 = r1.M0(r2, r3, r4, r5, r6)
        L_0x012b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f70080S = false;
        this.f70079R = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        T0(a.b.C2585a.f108190a);
        super.onDismiss(dialogInterface);
    }

    public void onResume() {
        super.onResume();
        F0().e(getActivity(), "LoginSignupPromotionBottomSheet");
    }
}
