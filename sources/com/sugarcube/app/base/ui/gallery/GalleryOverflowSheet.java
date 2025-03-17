package com.sugarcube.app.base.ui.gallery;

import DF.C12754C;
import HJ.C15854t;
import JF.C13084F;
import JF.C13085G;
import JF.C13091M;
import JF.C13113u;
import JF.C13115w;
import JF.T;
import JF.Z;
import NF.C13291e;
import OE.C13320l;
import QE.C13422C;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import TJ.C16519P;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import VE.C13760b;
import XH.C16796C;
import XH.C16807N;
import XH.C16816g;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import YH.X;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import cF.C14040b;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import cF.C14046h;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.model.PendingComposition;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.gallery.d;
import com.sugarcube.app.base.ui.gallery.i;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import com.sugarcube.core.network.models.PlacedFurniture;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import p1.C5747v0;
import uI.C18059h;
import x4.C;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import xF.C15227a0;
import xF.C15229b0;
import xF.C15231c0;
import xF.C15233d0;
import xF.C15235e0;
import xF.C15237f0;
import xF.C15239g0;
import xF.C15241h0;
import xF.C15243i0;
import xF.C15245j0;
import xF.C15247k0;
import xF.C15249l0;
import xF.C15251m0;
import xF.C15253n0;
import xF.J0;
import xF.o0;
import xF.p0;
import xF.q0;
import xF.r0;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\nJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#JD\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\b\b\u0000\u0010%*\u00020$2\"\u0010)\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'\u0012\u0006\u0012\u0004\u0018\u00010$0&H@¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\nJ\u0017\u0010-\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\nJ\u0017\u0010.\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\nJ\u0017\u0010/\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\nJ\u000f\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\u0004J\u0018\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H@¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u0004J\u0017\u00107\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00182\b\b\u0002\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010\u0004J\u0017\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ:\u0010S\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0001¢\u0006\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010^\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0002¢\u0006\f\n\u0004\bn\u0010[\u001a\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0001\u001a\u00020z8\u0000@\u0000X.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001¨\u0006\u0001²\u0006\r\u0010\u0001\u001a\u00020\u00118\nX\u0002"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryOverflowSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "A1", "Lcom/sugarcube/core/network/models/Composition;", "composition", "V1", "(Lcom/sugarcube/core/network/models/Composition;)V", "L1", "J1", "Lcom/sugarcube/app/base/ui/gallery/i;", "action", "v1", "(Lcom/sugarcube/app/base/ui/gallery/i;)V", "", "isDismissible", "H1", "(Z)V", "X1", "(Lcom/sugarcube/core/network/models/Composition;)Lcom/sugarcube/core/network/models/Composition;", "k1", "", "r1", "()Ljava/lang/String;", "Lcom/sugarcube/core/network/models/AuthType;", "pendingAction", "w1", "(Lcom/sugarcube/core/network/models/AuthType;)V", "E1", "l1", "errorMessage", "Q1", "(Ljava/lang/String;)V", "", "T", "Lkotlin/Function1;", "LdI/e;", "Lcom/sugarcube/app/base/data/Result;", "func", "o1", "(LnI/l;LdI/e;)Ljava/lang/Object;", "O1", "g1", "j1", "m1", "y1", "x1", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "d1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "c1", "e1", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", "message", "attachToDialog", "T1", "(Ljava/lang/String;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LQE/C;", "K", "LQE/C;", "binding", "LDF/C;", "L", "LXH/o;", "u1", "()LDF/C;", "viewModel", "LxF/J0;", "M", "s1", "()LxF/J0;", "overflowSheetViewModel", "N", "Lcom/sugarcube/core/network/models/Composition;", "Landroid/app/Dialog;", "O", "Landroid/app/Dialog;", "errorAlertDialog", "P", "Z", "shouldAutoSaveOnAuth", "Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$OverflowSheet;", "Q", "q1", "()Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$OverflowSheet;", "args", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "R", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "p1", "()Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "setAccountInteractions$base_release", "(Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "accountInteractions", "Lcom/sugarcube/app/base/data/user/UserRepo;", "S", "Lcom/sugarcube/app/base/data/user/UserRepo;", "t1", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "setUserRepo$base_release", "(Lcom/sugarcube/app/base/data/user/UserRepo;)V", "userRepo", "isDeleting", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryOverflowSheet extends Hilt_GalleryOverflowSheet implements SystemUiDelegate {

    /* renamed from: J  reason: collision with root package name */
    private final /* synthetic */ T f124251J = new T();

    /* renamed from: K  reason: collision with root package name */
    private C13422C f124252K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f124253L;

    /* renamed from: M  reason: collision with root package name */
    private final C16824o f124254M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public Composition f124255N;

    /* renamed from: O  reason: collision with root package name */
    private Dialog f124256O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public boolean f124257P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f124258Q;

    /* renamed from: R  reason: collision with root package name */
    public AccountInteractions f124259R;

    /* renamed from: S  reason: collision with root package name */
    public UserRepo f124260S;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124261a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.sugarcube.core.network.models.AuthType[] r0 = com.sugarcube.core.network.models.AuthType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.core.network.models.AuthType r1 = com.sugarcube.core.network.models.AuthType.LOGIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.core.network.models.AuthType r1 = com.sugarcube.core.network.models.AuthType.SIGNUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f124261a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$addAllItemsToCart$1", f = "GalleryOverflowSheet.kt", l = {670}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124263d = galleryOverflowSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124263d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124262c;
            String str = "Unknown Error";
            if (i10 == 0) {
                y.b(obj);
                C12754C U02 = this.f124263d.u1();
                this.f124262c = 1;
                obj = U02.u0(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    GalleryOverflowSheet galleryOverflowSheet = this.f124263d;
                    String message = th2.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    GalleryOverflowSheet.U1(galleryOverflowSheet, str, false, 2, (Object) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                String string = this.f124263d.getResources().getString(OE.n.f113499z1);
                C17542s.i(string, "getString(...)");
                GalleryOverflowSheet.U1(this.f124263d, string, false, 2, (Object) null);
            } else {
                GalleryOverflowSheet.U1(this.f124263d, str, false, 2, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$addItemToCart$2", f = "GalleryOverflowSheet.kt", l = {648}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124265d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f124266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16339x<Boolean> f124267f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GalleryOverflowSheet galleryOverflowSheet, CachedCatalogItem cachedCatalogItem, C16339x<Boolean> xVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f124265d = galleryOverflowSheet;
            this.f124266e = cachedCatalogItem;
            this.f124267f = xVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f124265d, this.f124266e, this.f124267f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
            if (r5 == null) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f124264c
                java.lang.String r2 = "Unknown Error"
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x001e
                if (r1 != r5) goto L_0x0016
                XH.y.b(r9)     // Catch:{ all -> 0x0014 }
                goto L_0x0032
            L_0x0014:
                r9 = move-exception
                goto L_0x007f
            L_0x0016:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001e:
                XH.y.b(r9)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r9 = r8.f124265d     // Catch:{ all -> 0x0014 }
                DF.C r9 = r9.u1()     // Catch:{ all -> 0x0014 }
                com.sugarcube.app.base.data.database.CachedCatalogItem r1 = r8.f124266e     // Catch:{ all -> 0x0014 }
                r8.f124264c = r5     // Catch:{ all -> 0x0014 }
                java.lang.Object r9 = r9.v0(r1, r8)     // Catch:{ all -> 0x0014 }
                if (r9 != r0) goto L_0x0032
                return r0
            L_0x0032:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0014 }
                boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0014 }
                if (r9 == 0) goto L_0x0070
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r0 = r8.f124265d     // Catch:{ all -> 0x0014 }
                android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0014 }
                int r1 = OE.n.f113169A1     // Catch:{ all -> 0x0014 }
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = r8.f124266e     // Catch:{ all -> 0x0014 }
                com.sugarcube.core.network.models.CatalogItem r5 = r5.getCatalogItem()     // Catch:{ all -> 0x0014 }
                java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0014 }
                if (r5 == 0) goto L_0x005b
                java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ all -> 0x0014 }
                java.lang.String r5 = r5.toUpperCase(r7)     // Catch:{ all -> 0x0014 }
                java.lang.String r7 = "toUpperCase(...)"
                kotlin.jvm.internal.C17542s.i(r5, r7)     // Catch:{ all -> 0x0014 }
                if (r5 != 0) goto L_0x005d
            L_0x005b:
                java.lang.String r5 = "Item"
            L_0x005d:
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x0014 }
                java.lang.String r0 = r0.getString(r1, r5)     // Catch:{ all -> 0x0014 }
                java.lang.String r1 = "getString(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0014 }
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r1 = r8.f124265d     // Catch:{ all -> 0x0014 }
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.U1(r1, r0, r6, r4, r3)     // Catch:{ all -> 0x0014 }
                goto L_0x0075
            L_0x0070:
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r0 = r8.f124265d     // Catch:{ all -> 0x0014 }
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.U1(r0, r2, r6, r4, r3)     // Catch:{ all -> 0x0014 }
            L_0x0075:
                QJ.x<java.lang.Boolean> r0 = r8.f124267f     // Catch:{ all -> 0x0014 }
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)     // Catch:{ all -> 0x0014 }
                r0.J(r9)     // Catch:{ all -> 0x0014 }
                goto L_0x008c
            L_0x007f:
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r0 = r8.f124265d
                java.lang.String r9 = r9.getMessage()
                if (r9 != 0) goto L_0x0088
                goto L_0x0089
            L_0x0088:
                r2 = r9
            L_0x0089:
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.U1(r0, r2, r6, r4, r3)
            L_0x008c:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$deleteDesign$1", f = "GalleryOverflowSheet.kt", l = {579, 580, 589}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124268c;

        /* renamed from: d  reason: collision with root package name */
        Object f124269d;

        /* renamed from: e  reason: collision with root package name */
        Object f124270e;

        /* renamed from: f  reason: collision with root package name */
        int f124271f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124272g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Composition f124273h;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$deleteDesign$1$result$1", f = "GalleryOverflowSheet.kt", l = {580}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends Boolean>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124274c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ GalleryOverflowSheet f124275d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Composition f124276e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(GalleryOverflowSheet galleryOverflowSheet, Composition composition, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f124275d = galleryOverflowSheet;
                this.f124276e = composition;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f124275d, this.f124276e, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super Result<Boolean>> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124274c;
                if (i10 == 0) {
                    y.b(obj);
                    C12754C U02 = this.f124275d.u1();
                    UUID compositionUuid = this.f124276e.getCompositionUuid();
                    this.f124274c = 1;
                    obj = U02.G0(compositionUuid, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GalleryOverflowSheet galleryOverflowSheet, Composition composition, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f124272g = galleryOverflowSheet;
            this.f124273h = composition;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f124272g, this.f124273h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f124271f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r4) goto L_0x002d
                if (r1 == r3) goto L_0x0029
                if (r1 != r2) goto L_0x0021
                java.lang.Object r0 = r6.f124270e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f124269d
                com.sugarcube.app.base.data.Result r0 = (com.sugarcube.app.base.data.Result) r0
                java.lang.Object r0 = r6.f124268c
                com.sugarcube.app.base.data.Result r0 = (com.sugarcube.app.base.data.Result) r0
                XH.y.b(r7)
                goto L_0x0090
            L_0x0021:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0029:
                XH.y.b(r7)
                goto L_0x0056
            L_0x002d:
                XH.y.b(r7)
                goto L_0x0043
            L_0x0031:
                XH.y.b(r7)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r7 = r6.f124272g
                xF.J0 r7 = r7.s1()
                r6.f124271f = r4
                java.lang.Object r7 = r7.H(r4, r6)
                if (r7 != r0) goto L_0x0043
                return r0
            L_0x0043:
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r7 = r6.f124272g
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$d$a r1 = new com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$d$a
                com.sugarcube.core.network.models.Composition r4 = r6.f124273h
                r5 = 0
                r1.<init>(r7, r4, r5)
                r6.f124271f = r3
                java.lang.Object r7 = r7.o1(r1, r6)
                if (r7 != r0) goto L_0x0056
                return r0
            L_0x0056:
                com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
                boolean r1 = r7 instanceof com.sugarcube.app.base.data.Result.Success
                if (r1 == 0) goto L_0x0062
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r7 = r6.f124272g
                r7.dismiss()
                goto L_0x0090
            L_0x0062:
                boolean r1 = r7 instanceof com.sugarcube.app.base.data.Result.Error
                if (r1 == 0) goto L_0x0093
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r1 = r6.f124272g
                android.content.res.Resources r3 = r1.getResources()
                int r4 = OE.n.f113273R3
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "getString(...)"
                kotlin.jvm.internal.C17542s.i(r3, r4)
                r1.Q1(r3)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r1 = r6.f124272g
                xF.J0 r1 = r1.s1()
                r6.f124268c = r7
                r6.f124269d = r7
                r6.f124270e = r3
                r6.f124271f = r2
                r7 = 0
                java.lang.Object r7 = r1.H(r7, r6)
                if (r7 != r0) goto L_0x0090
                return r0
            L_0x0090:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x0093:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$duplicateDesign$1", f = "GalleryOverflowSheet.kt", l = {484}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Composition f124279e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$duplicateDesign$1$result$1", f = "GalleryOverflowSheet.kt", l = {484}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends Composition>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124280c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ GalleryOverflowSheet f124281d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Composition f124282e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(GalleryOverflowSheet galleryOverflowSheet, Composition composition, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f124281d = galleryOverflowSheet;
                this.f124282e = composition;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f124281d, this.f124282e, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super Result<Composition>> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124280c;
                if (i10 == 0) {
                    y.b(obj);
                    C12754C U02 = this.f124281d.u1();
                    Composition composition = this.f124282e;
                    this.f124280c = 1;
                    obj = U02.B0(composition, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GalleryOverflowSheet galleryOverflowSheet, Composition composition, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f124278d = galleryOverflowSheet;
            this.f124279e = composition;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f124278d, this.f124279e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124277c;
            if (i10 == 0) {
                y.b(obj);
                GalleryOverflowSheet galleryOverflowSheet = this.f124278d;
                a aVar = new a(galleryOverflowSheet, this.f124279e, (C17164e<? super a>) null);
                this.f124277c = 1;
                obj = galleryOverflowSheet.o1(aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                GalleryOverflowSheet galleryOverflowSheet2 = this.f124278d;
                String string = galleryOverflowSheet2.getString(OE.n.f113370g4);
                C17542s.i(string, "getString(...)");
                galleryOverflowSheet2.T1(string, false);
            } else if (result instanceof Result.Error) {
                GalleryOverflowSheet galleryOverflowSheet3 = this.f124278d;
                String string2 = galleryOverflowSheet3.getResources().getString(OE.n.f113267Q3);
                C17542s.i(string2, "getString(...)");
                galleryOverflowSheet3.Q1(string2);
            } else {
                throw new XH.t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet", f = "GalleryOverflowSheet.kt", l = {522}, m = "executeSuspendFunction")
    static final class f<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f124283c;

        /* renamed from: d  reason: collision with root package name */
        Object f124284d;

        /* renamed from: e  reason: collision with root package name */
        Object f124285e;

        /* renamed from: f  reason: collision with root package name */
        Object f124286f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f124287g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124288h;

        /* renamed from: i  reason: collision with root package name */
        int f124289i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super f> eVar) {
            super(eVar);
            this.f124288h = galleryOverflowSheet;
        }

        public final Object invokeSuspend(Object obj) {
            this.f124287g = obj;
            this.f124289i |= Integer.MIN_VALUE;
            return this.f124288h.o1((C17642l) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$onDismiss$1", f = "GalleryOverflowSheet.kt", l = {241}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f124291d = galleryOverflowSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f124291d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124290c;
            if (i10 == 0) {
                y.b(obj);
                this.f124291d.u1().h2();
                C12754C U02 = this.f124291d.u1();
                List n10 = C16877v.n();
                this.f124290c = 1;
                if (U02.O0(n10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$onResume$1", f = "GalleryOverflowSheet.kt", l = {226}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124292c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124293d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoggedIn", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$onResume$1$1", f = "GalleryOverflowSheet.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124294c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f124295d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ GalleryOverflowSheet f124296e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f124296e = galleryOverflowSheet;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f124296e, eVar);
                aVar.f124295d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
                return ((a) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f124294c == 0) {
                    y.b(obj);
                    if (this.f124295d) {
                        this.f124296e.u1().G2(false);
                    } else {
                        this.f124296e.u1().G2(false);
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f124293d = galleryOverflowSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f124293d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124292c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f124293d.t1().isLoggedIn();
                a aVar = new a(this.f124293d, (C17164e<? super a>) null);
                this.f124292c = 1;
                if (C16534i.j(isLoggedIn, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoggedIn", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$ready$3", f = "GalleryOverflowSheet.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124297c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f124298d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124299e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f124299e = galleryOverflowSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f124299e, eVar);
            iVar.f124298d = ((Boolean) obj).booleanValue();
            return iVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((i) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124297c == 0) {
                y.b(obj);
                if (this.f124298d && this.f124299e.f124257P) {
                    this.f124299e.f124257P = false;
                    this.f124299e.E1();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$saveDesign$1", f = "GalleryOverflowSheet.kt", l = {458}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124300c;

        /* renamed from: d  reason: collision with root package name */
        int f124301d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124302e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$saveDesign$1$result$1", f = "GalleryOverflowSheet.kt", l = {458}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends Composition>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124303c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ GalleryOverflowSheet f124304d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f124304d = galleryOverflowSheet;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f124304d, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super Result<Composition>> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124303c;
                if (i10 == 0) {
                    y.b(obj);
                    C12754C U02 = this.f124304d.u1();
                    this.f124303c = 1;
                    obj = U02.r2(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GalleryOverflowSheet galleryOverflowSheet, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f124302e = galleryOverflowSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f124302e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f124301d;
            if (i10 == 0) {
                y.b(obj);
                Composition Q02 = this.f124302e.f124255N;
                if (Q02 != null) {
                    GalleryOverflowSheet galleryOverflowSheet = this.f124302e;
                    galleryOverflowSheet.f124255N = Composition.copy$default(Q02, 0, galleryOverflowSheet.r1(), (Uri) null, (Uri) null, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, (CompositionSavedProperties) null, (Map) null, (Uri) null, 262141, (Object) null);
                }
                GalleryOverflowSheet galleryOverflowSheet2 = this.f124302e;
                a aVar = new a(galleryOverflowSheet2, (C17164e<? super a>) null);
                this.f124300c = Q02;
                this.f124301d = 1;
                obj2 = galleryOverflowSheet2.o1(aVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Composition composition = (Composition) this.f124300c;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj2;
            if (!(result instanceof Result.Success)) {
                if (result instanceof Result.Error) {
                    GalleryOverflowSheet galleryOverflowSheet3 = this.f124302e;
                    String string = galleryOverflowSheet3.getResources().getString(OE.n.f113279S3);
                    C17542s.i(string, "getString(...)");
                    galleryOverflowSheet3.Q1(string);
                } else {
                    throw new XH.t();
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124305a;

        k(GalleryOverflowSheet galleryOverflowSheet) {
            this.f124305a = galleryOverflowSheet;
        }

        private static final boolean c(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N e(GalleryOverflowSheet galleryOverflowSheet, i iVar) {
            C17542s.j(iVar, "action");
            galleryOverflowSheet.v1(iVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r8, int r9) {
            /*
                r7 = this;
                r0 = r9 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r8.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r8.L()
                goto L_0x00b6
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.setupCompositionActions.<anonymous>.<anonymous> (GalleryOverflowSheet.kt:346)"
                r2 = 1415483656(0x545e9108, float:3.82366384E12)
                U0.C4895p.S(r2, r9, r0, r1)
            L_0x0020:
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r9 = r7.f124305a
                DF.C r9 = r9.u1()
                boolean r9 = r9.U1()
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r0 = r7.f124305a
                DF.C r0 = r0.u1()
                boolean r0 = r0.a2()
                r1 = 1
                r2 = r0 ^ 1
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r0 = r7.f124305a
                xF.J0 r0 = r0.s1()
                TJ.P r0 = r0.G()
                r3 = 0
                r4 = 0
                U0.A1 r0 = U0.p1.b(r0, r3, r8, r4, r1)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r1 = r7.f124305a
                DF.C r1 = r1.u1()
                androidx.lifecycle.F r1 = r1.Y1()
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r4 = 48
                U0.A1 r1 = d1.b.b(r1, r3, r8, r4)
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r3 = r1.booleanValue()
                r1 = 320333291(0x1317e5eb, float:1.9172238E-27)
                r8.W(r1)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r1 = r7.f124305a
                boolean r1 = r8.F(r1)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r4 = r7.f124305a
                java.lang.Object r5 = r8.D()
                if (r1 != 0) goto L_0x007f
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x0087
            L_0x007f:
                com.sugarcube.app.base.ui.gallery.c r5 = new com.sugarcube.app.base.ui.gallery.c
                r5.<init>(r4)
                r8.u(r5)
            L_0x0087:
                r4 = r5
                nI.l r4 = (nI.C17642l) r4
                r8.P()
                boolean r5 = c(r0)
                r6 = 0
                r0 = r9
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r8
                com.sugarcube.app.base.ui.gallery.d.v(r0, r1, r2, r3, r4, r5, r6)
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r8 = r7.f124305a
                r0 = r9 ^ 1
                r8.H1(r0)
                if (r9 != 0) goto L_0x00ad
                com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r8 = r7.f124305a
                DF.C r8 = r8.u1()
                r8.y0()
            L_0x00ad:
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x00b6
                U0.C4895p.R()
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.k.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"com/sugarcube/app/base/ui/gallery/GalleryOverflowSheet$l", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f124306a;

        public l(EditText editText) {
            this.f124306a = editText;
        }

        public void afterTextChanged(Editable editable) {
            C17542s.g(this.f124306a);
            EditText editText = this.f124306a;
            editText.addTextChangedListener(new m(editText));
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f124307a;

        public m(EditText editText) {
            this.f124307a = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence == null || C15854t.v0(charSequence)) {
                this.f124307a.setHint(OE.n.f113453s3);
            } else {
                this.f124307a.setHint("");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$shareDesign$1$1$1", f = "GalleryOverflowSheet.kt", l = {543}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124308c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f124310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f124311f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12754C f124312g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Composition f124313h;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$shareDesign$1$1$1$result$1", f = "GalleryOverflowSheet.kt", l = {543}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends Composition>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124314c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12754C f124315d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Composition f124316e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C12754C c10, Composition composition, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f124315d = c10;
                this.f124316e = composition;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f124315d, this.f124316e, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super Result<Composition>> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124314c;
                if (i10 == 0) {
                    y.b(obj);
                    C12754C c10 = this.f124315d;
                    UUID compositionUuid = this.f124316e.getCompositionUuid();
                    this.f124314c = 1;
                    obj = c10.S2(compositionUuid, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GalleryOverflowSheet galleryOverflowSheet, Context context, String str, C12754C c10, Composition composition, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f124309d = galleryOverflowSheet;
            this.f124310e = context;
            this.f124311f = str;
            this.f124312g = c10;
            this.f124313h = composition;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f124309d, this.f124310e, this.f124311f, this.f124312g, this.f124313h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124308c;
            if (i10 == 0) {
                y.b(obj);
                GalleryOverflowSheet galleryOverflowSheet = this.f124309d;
                a aVar = new a(this.f124312g, this.f124313h, (C17164e<? super a>) null);
                this.f124308c = 1;
                obj = galleryOverflowSheet.o1(aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                Composition composition = (Composition) ((Result.Success) result).getData();
                C13115w.g(this.f124310e, this.f124311f, composition, this.f124309d.u1().L1(composition.getSceneUuid()), (C13091M) null, this.f124309d.u1().M1(), 8, (Object) null);
            } else if (result instanceof Result.Error) {
                GalleryOverflowSheet galleryOverflowSheet2 = this.f124309d;
                String string = galleryOverflowSheet2.getResources().getString(OE.n.f113285T3);
                C17542s.i(string, "getString(...)");
                galleryOverflowSheet2.Q1(string);
            } else {
                throw new XH.t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124317a;

        public o(C5187o oVar) {
            this.f124317a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124317a);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124318c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C5187o oVar) {
            super(0);
            this.f124318c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f124318c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124319c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(C17631a aVar) {
            super(0);
            this.f124319c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f124319c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class r extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f124320c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C16824o oVar) {
            super(0);
            this.f124320c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f124320c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class s extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(C17631a aVar, C16824o oVar) {
            super(0);
            this.f124321c = aVar;
            this.f124322d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f124321c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f124322d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class t extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124323c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f124323c = oVar;
            this.f124324d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f124324d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f124323c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Composition f124325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124326b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
            a(Object obj) {
                super(0, obj, GalleryOverflowSheet.class, "addAllItemsToCart", "addAllItemsToCart()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((GalleryOverflowSheet) this.receiver).c1();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements nI.p<CachedCatalogItem, C17164e<? super Boolean>, Object> {
            b(Object obj) {
                super(2, obj, GalleryOverflowSheet.class, "addItemToCart", "addItemToCart(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            /* renamed from: t */
            public final Object invoke(CachedCatalogItem cachedCatalogItem, C17164e<? super Boolean> eVar) {
                return ((GalleryOverflowSheet) this.receiver).d1(cachedCatalogItem, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17642l<CachedCatalogItem, Boolean> {
            c(Object obj) {
                super(1, obj, GalleryOverflowSheet.class, "addItemToFav", "addItemToFav(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke(CachedCatalogItem cachedCatalogItem) {
                C17542s.j(cachedCatalogItem, "p0");
                return Boolean.valueOf(((GalleryOverflowSheet) this.receiver).e1(cachedCatalogItem));
            }
        }

        u(Composition composition, GalleryOverflowSheet galleryOverflowSheet) {
            this.f124325a = composition;
            this.f124326b = galleryOverflowSheet;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-153928448, i10, -1, "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.updateComposition.<anonymous>.<anonymous> (GalleryOverflowSheet.kt:258)");
                }
                Composition composition = this.f124325a;
                GalleryOverflowSheet galleryOverflowSheet = this.f124326b;
                mVar.W(2112717349);
                boolean F10 = mVar.F(galleryOverflowSheet);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(galleryOverflowSheet);
                    mVar.u(D10);
                }
                mVar.P();
                C17631a aVar = (C17631a) ((C18059h) D10);
                GalleryOverflowSheet galleryOverflowSheet2 = this.f124326b;
                mVar.W(2112719169);
                boolean F11 = mVar.F(galleryOverflowSheet2);
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(galleryOverflowSheet2);
                    mVar.u(D11);
                }
                mVar.P();
                nI.p pVar = (nI.p) ((C18059h) D11);
                GalleryOverflowSheet galleryOverflowSheet3 = this.f124326b;
                mVar.W(2112720832);
                boolean F12 = mVar.F(galleryOverflowSheet3);
                Object D12 = mVar.D();
                if (F12 || D12 == C4889m.f14007a.a()) {
                    D12 = new c(galleryOverflowSheet3);
                    mVar.u(D12);
                }
                mVar.P();
                d.D(composition, aVar, pVar, (C17642l) ((C18059h) D12), this.f124326b.u1(), mVar, 0);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$updateComposition$2$3$1", f = "GalleryOverflowSheet.kt", l = {294}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryOverflowSheet f124328d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<PlacedFurniture> f124329e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(GalleryOverflowSheet galleryOverflowSheet, List<PlacedFurniture> list, C17164e<? super v> eVar) {
            super(2, eVar);
            this.f124328d = galleryOverflowSheet;
            this.f124329e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new v(this.f124328d, this.f124329e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((v) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124327c;
            if (i10 == 0) {
                y.b(obj);
                C12754C U02 = this.f124328d.u1();
                List<PlacedFurniture> list = this.f124329e;
                this.f124327c = 1;
                if (U02.O0(list, this) == f10) {
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

    public GalleryOverflowSheet() {
        C16824o b10 = C16825p.b(new o(this));
        this.f124253L = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
        C16824o a10 = C16825p.a(XH.s.NONE, new q(new p(this)));
        this.f124254M = W.b(this, P.b(J0.class), new r(a10), new s((C17631a) null, a10), new t(this, a10));
        this.f124258Q = C16825p.b(new C15243i0(this));
    }

    private final void A1() {
        BouncingBallView bouncingBallView;
        C13422C c10;
        NestedScrollView b10;
        Dialog dialog = getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        if (!(aVar == null || (c10 = this.f124252K) == null || (b10 = c10.getRoot()) == null)) {
            b10.post(new C15245j0(aVar, b10));
        }
        C13422C c11 = this.f124252K;
        if (!(c11 == null || (bouncingBallView = c11.f114331f) == null)) {
            bouncingBallView.c();
        }
        u1().Y0().observe(getViewLifecycleOwner(), new d.b(new C15247k0(this)));
        C16534i.M(C16534i.R(t1().isLoggedIn(), new i(this, (C17164e<? super i>) null)), C5222z.a(this));
        e0.a(u1().h1()).observe(getViewLifecycleOwner(), new d.b(new C15249l0(this)));
        L1();
        J1();
    }

    /* access modifiers changed from: private */
    public static final void B1(com.google.android.material.bottomsheet.a aVar, NestedScrollView nestedScrollView) {
        C13084F.i(aVar, nestedScrollView.getHeight());
    }

    /* access modifiers changed from: private */
    public static final C16807N C1(GalleryOverflowSheet galleryOverflowSheet, List list) {
        Composition t12 = galleryOverflowSheet.u1().t1();
        if (t12 != null) {
            galleryOverflowSheet.V1(t12);
        } else {
            t12 = null;
        }
        galleryOverflowSheet.f124255N = t12;
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D1(GalleryOverflowSheet galleryOverflowSheet, PendingComposition pendingComposition) {
        if (pendingComposition != null && !pendingComposition.getPendingActionHandled()) {
            galleryOverflowSheet.w1(pendingComposition.getPendingAction());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void E1() {
        if (t1().isLoggedIn().getValue().booleanValue()) {
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new j(this, (C17164e<? super j>) null), 3, (Object) null);
            return;
        }
        C5191t activity = getActivity();
        if (activity != null) {
            C13084F.l(activity, OE.n.f113268Q4, OE.n.f113178B4, new XH.v(getResources().getString(OE.n.f113311Y), new q0(this)), new XH.v(getResources().getString(OE.n.f113191E), new C15227a0(this)), true);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F1(GalleryOverflowSheet galleryOverflowSheet) {
        galleryOverflowSheet.y1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G1(GalleryOverflowSheet galleryOverflowSheet) {
        galleryOverflowSheet.x1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void H1(boolean z10) {
        ImageView imageView;
        NestedScrollView b10;
        Dialog dialog = getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        if (aVar != null) {
            aVar.o().K0(z10);
            setCancelable(z10);
            C13422C c10 = this.f124252K;
            if (!(c10 == null || (b10 = c10.getRoot()) == null)) {
                b10.post(new C15239g0(aVar, b10));
            }
        }
        C13422C c11 = this.f124252K;
        if (c11 != null && (imageView = c11.f114330e) != null) {
            imageView.setVisibility(z10 ? 0 : 4);
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(com.google.android.material.bottomsheet.a aVar, NestedScrollView nestedScrollView) {
        C13084F.i(aVar, nestedScrollView.getHeight());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void J1() {
        ComposeView composeView;
        C13422C c10 = this.f124252K;
        if (c10 != null) {
            c10.f114328c.setOnTouchListener(new p0(c10));
        }
        C13422C c11 = this.f124252K;
        if (c11 != null && (composeView = c11.f114327b) != null) {
            C13113u.h(composeView, (C5747v0) null, c1.c.c(1415483656, true, new k(this)), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean K1(C13422C c10, View view, MotionEvent motionEvent) {
        EditText editText = c10.f114329d.f114563f;
        if (!editText.hasFocus()) {
            return false;
        }
        editText.clearFocus();
        C17542s.g(editText);
        Z.s(editText);
        return true;
    }

    private final void L1() {
        QE.e0 e0Var;
        C13422C c10 = this.f124252K;
        if (c10 != null && (e0Var = c10.f114329d) != null) {
            EditText editText = e0Var.f114563f;
            C17542s.g(editText);
            editText.addTextChangedListener(new l(editText));
            editText.setOnKeyListener(new C15253n0(editText));
            editText.setOnFocusChangeListener(new o0(this));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean M1(EditText editText, View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 66) {
            return false;
        }
        editText.clearFocus();
        C17542s.g(editText);
        Z.s(editText);
        return true;
    }

    /* access modifiers changed from: private */
    public static final void N1(GalleryOverflowSheet galleryOverflowSheet, View view, boolean z10) {
        if (!z10) {
            Log.d(AnyKt.SUGARCUBE_TAG, "title lost focus");
            Composition composition = galleryOverflowSheet.f124255N;
            if (composition != null) {
                galleryOverflowSheet.f124255N = galleryOverflowSheet.X1(composition);
            }
        }
    }

    private final void O1(Composition composition) {
        C12754C u12 = u1();
        C13291e.c(getContext(), u12.w1(), new C15241h0(this, u12, composition));
    }

    /* access modifiers changed from: private */
    public static final F0 P1(GalleryOverflowSheet galleryOverflowSheet, C12754C c10, Composition composition, Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "title");
        return C16314k.d(C5222z.a(galleryOverflowSheet), (C17168i) null, (QJ.T) null, new n(galleryOverflowSheet, context, str, c10, composition, (C17164e<? super n>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void Q1(String str) {
        C5191t activity;
        Dialog dialog = this.f124256O;
        if ((dialog == null || !dialog.isShowing()) && (activity = getActivity()) != null) {
            activity.runOnUiThread(new C15229b0(this, str));
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(GalleryOverflowSheet galleryOverflowSheet, String str) {
        androidx.appcompat.app.c cVar;
        BouncingBallView bouncingBallView;
        C5191t activity = galleryOverflowSheet.getActivity();
        if (activity != null) {
            String string = galleryOverflowSheet.getString(OE.n.f113227K);
            C17542s.i(string, "getString(...)");
            cVar = C13084F.n(activity, "", str, C16796C.a(string, new C15231c0(galleryOverflowSheet)), false, 8, (Object) null);
        } else {
            cVar = null;
        }
        galleryOverflowSheet.f124256O = cVar;
        if (cVar != null) {
            cVar.show();
        }
        C13422C c10 = galleryOverflowSheet.f124252K;
        if (c10 != null && (bouncingBallView = c10.f114331f) != null) {
            bouncingBallView.c();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N S1(GalleryOverflowSheet galleryOverflowSheet) {
        Dialog dialog = galleryOverflowSheet.f124256O;
        if (dialog != null) {
            dialog.dismiss();
        }
        galleryOverflowSheet.f124256O = null;
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void T1(String str, boolean z10) {
        Dialog dialog;
        Window window;
        View view = null;
        if (!z10 || (dialog = getDialog()) == null || !dialog.isShowing()) {
            C5191t activity = getActivity();
            if (activity != null) {
                view = activity.findViewById(16908290);
            }
        } else {
            Dialog dialog2 = getDialog();
            if (!(dialog2 == null || (window = dialog2.getWindow()) == null)) {
                view = window.getDecorView();
            }
        }
        if (view != null) {
            Snackbar.q0(view, str, -1).b0();
        }
    }

    static /* synthetic */ void U1(GalleryOverflowSheet galleryOverflowSheet, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        galleryOverflowSheet.T1(str, z10);
    }

    private final void V1(Composition composition) {
        UUID compositionUuid = composition.getCompositionUuid();
        String name = composition.getName();
        Log.d(AnyKt.SUGARCUBE_TAG, "update composition " + compositionUuid + " '" + name + "'");
        C13291e.c(getActivity(), this.f124252K, new C15251m0(composition, this));
    }

    /* access modifiers changed from: private */
    public static final F0 W1(Composition composition, GalleryOverflowSheet galleryOverflowSheet, C5191t tVar, C13422C c10) {
        C17542s.j(tVar, "activity");
        C17542s.j(c10, "binding");
        ComposeView composeView = c10.f114332g;
        C17542s.i(composeView, "itemsListView");
        C13113u.h(composeView, (C5747v0) null, c1.c.c(-153928448, true, new u(composition, galleryOverflowSheet)), 1, (Object) null);
        QE.e0 e0Var = c10.f114329d;
        EditText editText = e0Var.f114563f;
        if (!editText.hasFocus()) {
            editText.setHint(OE.n.f113453s3);
            String displayName = composition.getDisplayName();
            if (displayName != null) {
                editText.setHint("");
            } else {
                displayName = null;
            }
            editText.setText(displayName);
        }
        TextView textView = e0Var.f114562e;
        Resources resources = galleryOverflowSheet.getResources();
        int i10 = C13320l.f113163c;
        List<PlacedFurniture> placedFurnitureSet = composition.getPlacedFurnitureSet();
        int i11 = 0;
        int size = placedFurnitureSet != null ? placedFurnitureSet.size() : 0;
        List<PlacedFurniture> placedFurnitureSet2 = composition.getPlacedFurnitureSet();
        if (placedFurnitureSet2 != null) {
            i11 = placedFurnitureSet2.size();
        }
        textView.setText(resources.getQuantityString(i10, size, new Object[]{Integer.valueOf(i11)}));
        e0Var.f114560c.setText(C13085G.a(composition.getCreatedAt(), galleryOverflowSheet.u1().M1().getLocale()));
        galleryOverflowSheet.u1().M1().c().l(composition.getThumbnailUrl()).d(e0Var.f114561d);
        List<PlacedFurniture> placedFurnitureSet3 = composition.getPlacedFurnitureSet();
        if (placedFurnitureSet3 != null) {
            return C16314k.d(C5222z.a(galleryOverflowSheet), (C17168i) null, (QJ.T) null, new v(galleryOverflowSheet, placedFurnitureSet3, (C17164e<? super v>) null), 3, (Object) null);
        }
        return null;
    }

    private final Composition X1(Composition composition) {
        if (this.f124252K == null) {
            return null;
        }
        String r12 = r1();
        if (u1().U1()) {
            String str = AnyKt.SUGARCUBE_TAG;
            Composition.copy$default(composition, 0, r12, (Uri) null, (Uri) null, (Integer) null, (UUID) null, (List) null, (Instant) null, (Instant) null, false, (Uri) null, false, 0, (UUID) null, (String) null, (CompositionSavedProperties) null, (Map) null, (Uri) null, 262141, (Object) null);
            Log.d(str, "set pending composition title to '" + r12 + "'");
        } else {
            String str2 = "'";
            String str3 = AnyKt.SUGARCUBE_TAG;
            String name = composition.getName();
            if (name == null) {
                name = "";
            }
            if (!C17542s.e(name, r12)) {
                u1().N0(composition.getCompositionUuid(), r12);
                Log.d(str3, "set composition title to '" + r12 + str2);
            }
        }
        return composition;
    }

    /* access modifiers changed from: private */
    public final void c1() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (QJ.T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object d1(CachedCatalogItem cachedCatalogItem, C17164e<? super Boolean> eVar) {
        C16339x b10 = C16343z.b((F0) null, 1, (Object) null);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (QJ.T) null, new c(this, cachedCatalogItem, b10, (C17164e<? super c>) null), 3, (Object) null);
        return b10.f(eVar);
    }

    /* access modifiers changed from: private */
    public final boolean e1(CachedCatalogItem cachedCatalogItem) {
        return u1().w0(androidx.navigation.fragment.a.a(this), cachedCatalogItem);
    }

    /* access modifiers changed from: private */
    public static final Kreativ.Gallery.OverflowSheet f1(GalleryOverflowSheet galleryOverflowSheet) {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(galleryOverflowSheet);
        int g10 = C4.j.g(Kreativ.Gallery.OverflowSheet.Companion.serializer());
        Class<Kreativ.Gallery.OverflowSheet> cls = Kreativ.Gallery.OverflowSheet.class;
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
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (Kreativ.Gallery.OverflowSheet) C4.h.a(Kreativ.Gallery.OverflowSheet.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    private final void g1(Composition composition) {
        C5191t activity = getActivity();
        if (activity != null) {
            C13084F.l(activity, OE.n.f113349d4, OE.n.f113342c4, new XH.v(getResources().getString(OE.n.f113365g), new C15233d0(this, composition)), new XH.v(getResources().getString(OE.n.f113351e), new C15235e0()), true);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(GalleryOverflowSheet galleryOverflowSheet, Composition composition) {
        galleryOverflowSheet.j1(composition);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i1() {
        return C16807N.f139792a;
    }

    private final void j1(Composition composition) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new d(this, composition, (C17164e<? super d>) null), 3, (Object) null);
    }

    private final void k1() {
        u1().J0();
        dismiss();
    }

    private final void l1(Composition composition) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new e(this, composition, (C17164e<? super e>) null), 3, (Object) null);
    }

    private final void m1(Composition composition) {
        u1();
        if (u1().a2()) {
            C5191t activity = getActivity();
            if (activity != null) {
                String string = getString(OE.n.f113391j4, C13760b.f117438d.d(u1().M1().getCountry(), u1().M1().getLanguage()));
                C17542s.i(string, "getString(...)");
                String string2 = getString(OE.n.f113380i0);
                C17542s.i(string2, "getString(...)");
                C13084F.n(activity, "", string, C16796C.a(string2, new C15237f0()), false, 8, (Object) null);
                return;
            }
            return;
        }
        dismiss();
        if (u1().T0()) {
            u1().p1().k();
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            String uuid = composition.getSceneUuid().toString();
            C17542s.i(uuid, "toString(...)");
            C14040b.b(a10, uuid, composition.getCompositionUuid().toString(), composition.getSceneId(), false, (String) null, (C) null, 56, (Object) null);
            return;
        }
        C8951o.f0(androidx.navigation.fragment.a.a(this), Kreativ.a.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N n1() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object o1(nI.C17642l<? super dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends T>>, ? extends java.lang.Object> r6, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends T>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$f r0 = (com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.f) r0
            int r1 = r0.f124289i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f124289i = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$f r0 = new com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet$f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f124287g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f124289i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f124286f
            QE.C r6 = (QE.C13422C) r6
            java.lang.Object r6 = r0.f124285e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f124284d
            nI.l r6 = (nI.C17642l) r6
            java.lang.Object r6 = r0.f124283c
            com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet r6 = (com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet) r6
            XH.y.b(r1)
            goto L_0x0068
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            android.app.Dialog r1 = r5.f124256O
            if (r1 == 0) goto L_0x004b
            r1.dismiss()
        L_0x004b:
            QE.C r1 = r5.f124252K
            if (r1 == 0) goto L_0x0056
            com.sugarcube.app.base.ui.utils.BouncingBallView r3 = r1.f114331f
            if (r3 == 0) goto L_0x0056
            r3.b()
        L_0x0056:
            r0.f124283c = r5
            r0.f124284d = r6
            r0.f124285e = r7
            r0.f124286f = r1
            r0.f124289i = r4
            java.lang.Object r1 = r6.invoke(r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r6 = r5
        L_0x0068:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            QE.C r7 = r6.f124252K
            if (r7 == 0) goto L_0x0075
            com.sugarcube.app.base.ui.utils.BouncingBallView r7 = r7.f114331f
            if (r7 == 0) goto L_0x0075
            r7.c()
        L_0x0075:
            boolean r7 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r7 == 0) goto L_0x007d
            r6.dismiss()
            goto L_0x0081
        L_0x007d:
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r6 == 0) goto L_0x0082
        L_0x0081:
            return r1
        L_0x0082:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet.o1(nI.l, dI.e):java.lang.Object");
    }

    private final Kreativ.Gallery.OverflowSheet q1() {
        return (Kreativ.Gallery.OverflowSheet) this.f124258Q.getValue();
    }

    /* access modifiers changed from: private */
    public final String r1() {
        String str;
        QE.e0 e0Var;
        EditText editText;
        Editable text;
        C13422C c10 = this.f124252K;
        if (c10 == null || (e0Var = c10.f114329d) == null || (editText = e0Var.f114563f) == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() != 0) {
            return str;
        }
        String string = getResources().getString(OE.n.f113453s3);
        C17542s.i(string, "getString(...)");
        return string;
    }

    /* access modifiers changed from: private */
    public final J0 s1() {
        return (J0) this.f124254M.getValue();
    }

    /* access modifiers changed from: private */
    public final C12754C u1() {
        return (C12754C) this.f124253L.getValue();
    }

    /* access modifiers changed from: private */
    public final void v1(i iVar) {
        if (C17542s.e(iVar, i.b.f124422a)) {
            k1();
        } else if (C17542s.e(iVar, i.e.f124425a)) {
            E1();
        } else if (C17542s.e(iVar, i.c.f124423a)) {
            Composition composition = this.f124255N;
            if (composition != null) {
                l1(composition);
            }
        } else if (C17542s.e(iVar, i.f.f124426a)) {
            Composition composition2 = this.f124255N;
            if (composition2 != null) {
                O1(composition2);
            }
        } else if (C17542s.e(iVar, i.a.f124421a)) {
            Composition composition3 = this.f124255N;
            if (composition3 != null) {
                g1(composition3);
            }
        } else if (C17542s.e(iVar, i.d.f124424a)) {
            Composition composition4 = this.f124255N;
            if (composition4 != null) {
                m1(composition4);
            }
        } else {
            throw new XH.t();
        }
    }

    private final void w1(AuthType authType) {
        u1().J2();
        int i10 = a.f124261a[authType.ordinal()];
        if (i10 == 1) {
            x1();
        } else if (i10 == 2) {
            y1();
        }
    }

    private final void x1() {
        u1().G2(true);
        this.f124257P = true;
        C5191t activity = getActivity();
        if (activity != null) {
            p1().navigateLogin(activity);
        }
    }

    private final void y1() {
        u1().G2(true);
        this.f124257P = true;
        C5191t activity = getActivity();
        if (activity != null) {
            p1().navigateSignup(activity);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z1(GalleryOverflowSheet galleryOverflowSheet, Composition composition) {
        galleryOverflowSheet.f124255N = composition;
        if (composition != null) {
            galleryOverflowSheet.u1().A2(composition.getSceneUuid());
            galleryOverflowSheet.u1().z2(composition.getCompositionUuid());
        }
        Composition composition2 = galleryOverflowSheet.f124255N;
        if (composition2 != null) {
            galleryOverflowSheet.V1(composition2);
        }
        galleryOverflowSheet.A1();
        return C16807N.f139792a;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124251J.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BouncingBallView bouncingBallView;
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, 1, 12, (Object) null);
        this.f124252K = C13422C.c(layoutInflater, viewGroup, false);
        u1().U1();
        u1().S1();
        u1().y0();
        UUID e10 = C14046h.e(q1().a());
        C13422C c10 = this.f124252K;
        if (!(c10 == null || (bouncingBallView = c10.f114331f) == null)) {
            bouncingBallView.b();
        }
        Composition t12 = u1().t1();
        this.f124255N = t12;
        if (t12 != null || e10 == null) {
            u1().j2();
            Composition t13 = u1().t1();
            this.f124255N = t13;
            if (t13 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Composition is null, exiting GalleryOverflowSheet.");
                Priority priority = Priority.ERROR;
                String message = illegalStateException.getMessage();
                String str = "";
                if (message == null) {
                    message = str;
                }
                String b10 = C16816g.b(illegalStateException);
                if (b10 != null) {
                    str = b10;
                }
                int i10 = r0.f132024a[priority.ordinal()];
                if (i10 == 1) {
                    Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
                } else if (i10 == 2) {
                    Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
                } else if (i10 == 3) {
                    Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
                } else if (i10 == 4) {
                    Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
                } else if (i10 == 5) {
                    Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
                } else {
                    throw new XH.t();
                }
                androidx.navigation.fragment.a.a(this).k0();
            }
            A1();
        } else {
            s1().D();
            s1().F().observe(this, new d.b(new xF.Z(this)));
        }
        C13422C c11 = this.f124252K;
        if (c11 != null) {
            return c11.getRoot();
        }
        return null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        QE.e0 e0Var;
        EditText editText;
        Editable text;
        C17542s.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
        Composition composition = this.f124255N;
        if (composition != null) {
            this.f124255N = X1(composition);
        }
        C13422C c10 = this.f124252K;
        if (!(c10 == null || (e0Var = c10.f114329d) == null || (editText = e0Var.f114563f) == null || (text = editText.getText()) == null)) {
            text.clear();
        }
        Dialog dialog = this.f124256O;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void onResume() {
        super.onResume();
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }

    public final AccountInteractions p1() {
        AccountInteractions accountInteractions = this.f124259R;
        if (accountInteractions != null) {
            return accountInteractions;
        }
        C17542s.z("accountInteractions");
        return null;
    }

    public final UserRepo t1() {
        UserRepo userRepo = this.f124260S;
        if (userRepo != null) {
            return userRepo;
        }
        C17542s.z("userRepo");
        return null;
    }
}
