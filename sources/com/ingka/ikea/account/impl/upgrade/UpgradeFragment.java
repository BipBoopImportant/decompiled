package com.ingka.ikea.account.impl.upgrade;

import Ae.f;
import Ar.j;
import HJ.C15854t;
import I2.C0;
import I2.C4600b0;
import I2.L;
import MB.C13194a;
import TJ.C16532g;
import TJ.C16534i;
import Wd.C9347b;
import Wd.t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cD.C14029a;
import com.ingka.ikea.account.impl.dynamicfields.d;
import com.ingka.ikea.app.uicomponents.util.AccurateOffsetLinearLayoutManager;
import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import com.ingka.ikea.core.android.view.BackButton;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dD.C14339a;
import dI.C17164e;
import dl.C11199d;
import dl.C11208m;
import eI.C17187b;
import il.C11403c;
import il.C11404d;
import il.C11405e;
import il.f;
import ip.h;
import jC.C14615b;
import jC.C14617d;
import jC.q;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import me.C10038a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pg.C;
import pg.C10148b;
import pg.C10150d;
import pg.C10151e;
import pg.C10153g;
import pg.H;
import pg.k;
import pg.o;
import pg.r;
import qg.C10192b;
import qg.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sg.C10244a;
import sg.f;
import sg.g;
import sg.l;
import sg.m;
import tI.C17974j;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\tJ%\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\tJ#\u0010'\u001a\u00020\n*\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J+\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\tJ\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010\tJ5\u0010H\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u00142\u0014\u0010G\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020\n0FH\u0016¢\u0006\u0004\bH\u0010IJ-\u0010K\u001a\u00020\n2\u001c\u0010G\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\n0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u001fH\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020\u001fH\u0016¢\u0006\u0004\bR\u0010SJ=\u0010V\u001a\u00020\n2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\b\u0010U\u001a\u0004\u0018\u00010\u001f2\u0014\u0010G\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\n0FH\u0016¢\u0006\u0004\bV\u0010WJo\u0010c\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u00010\u001f2\u0006\u0010Y\u001a\u00020\u001f2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0Z2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020\u001f2\u0014\u0010G\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\n0FH\u0016¢\u0006\u0004\bc\u0010dR\"\u0010l\u001a\u00020e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0001\u001a\u00020}8\u0006@\u0006X.¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¤\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u0017\u0010¯\u0001\u001a\u00020\u001f8\u0002XD¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R!\u0010µ\u0001\u001a\u00030°\u00018BX\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001a\u0010À\u0001\u001a\u00030½\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010È\u0001\u001a\u00030Ä\u00018BX\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010²\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R1\u0010Ë\u0001\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001c\u0010Ï\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001f\u0010×\u0001\u001a\u00020:8\u0014XD¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0017\u0010Þ\u0001\u001a\u00020$8BX\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0017\u0010á\u0001\u001a\u00020\u001d8BX\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010ä\u0001\u001a\u00030Ø\u00018BX\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010æ\u0001\u001a\u00020:8VX\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010Ö\u0001¨\u0006ç\u0001"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/UpgradeFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "Lsg/g;", "Lsg/c;", "Lsg/b;", "Lsg/l;", "Lsg/m;", "Lsg/a;", "<init>", "()V", "LXH/N;", "R1", "S1", "Z1", "X1", "U1", "P1", "z1", "C1", "G1", "", "position", "", "", "items", "h1", "(ILjava/util/List;)I", "Landroid/graphics/Rect;", "rect", "", "radius", "", "messages", "d2", "(Landroid/graphics/Rect;FLjava/util/List;)V", "x1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "target", "offset", "e2", "(Landroidx/recyclerview/widget/LinearLayoutManager;IF)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "", "scrollTo", "a", "(IZ)V", "i0", "(I)V", "h0", "(I)I", "f0", "Ljava/util/Date;", "initialDate", "minAge", "Lkotlin/Function1;", "callback", "m", "(Ljava/util/Date;ILnI/l;)V", "Lkotlin/Function2;", "c", "(LnI/p;)V", "url", "j", "(Ljava/lang/String;)V", "title", "body", "n", "(Ljava/lang/String;Ljava/lang/String;)V", "values", "default", "l", "(Ljava/util/List;Ljava/lang/String;LnI/l;)V", "currentValue", "countryCode", "", "pickerData", "Lqg/b$a;", "pickerBounds", "Lqg/b$d;", "cursorFocusMode", "Lqg/b$b;", "pickerType", "componentValue", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lqg/b$a;Lqg/b$d;Lqg/b$b;Ljava/lang/String;LnI/l;)V", "LaA/a;", "R", "LaA/a;", "getSessionManager", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LcD/a;", "S", "LcD/a;", "p1", "()LcD/a;", "setEditProfileRepository", "(LcD/a;)V", "editProfileRepository", "LAe/e;", "T", "LAe/e;", "l1", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LEo/a;", "U", "LEo/a;", "o1", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LMB/a;", "X", "LMB/a;", "u1", "()LMB/a;", "setStorePickerNavigation$account_implementation_release", "(LMB/a;)V", "storePickerNavigation", "Lme/a;", "Y", "Lme/a;", "k1", "()Lme/a;", "setAddressPickerNavigation", "(Lme/a;)V", "addressPickerNavigation", "LdD/a;", "Z", "LdD/a;", "t1", "()LdD/a;", "setProfileAnalytics$account_implementation_release", "(LdD/a;)V", "profileAnalytics", "LIl/a;", "y0", "LIl/a;", "m1", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LAr/j;", "z0", "LAr/j;", "q1", "()LAr/j;", "setFeedback$account_implementation_release", "(LAr/j;)V", "feedback", "A0", "Ljava/lang/String;", "destId", "Lcom/ingka/ikea/account/impl/dynamicfields/d;", "B0", "LXH/o;", "w1", "()Lcom/ingka/ikea/account/impl/dynamicfields/d;", "viewModel", "C0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_listLayoutManager", "LLg/d;", "D0", "LLg/d;", "listAdapter", "Lcom/ingka/ikea/account/impl/upgrade/d;", "E0", "Lcom/ingka/ikea/account/impl/upgrade/d;", "headerViewModel", "F0", "Ljava/lang/Integer;", "lastPosition", "Ldl/d$a;", "G0", "r1", "()Ldl/d$a;", "finishButtonViewModel", "H0", "LnI/p;", "pendingPickerCallback", "Lil/c;", "I0", "Lil/c;", "keyboardAwayListener", "LSd/a;", "J0", "LSd/a;", "authNavigation", "K0", "v0", "()Z", "drawUnderStatusBar", "LVd/b;", "L0", "LVd/b;", "_binding", "s1", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "v1", "()F", "toolbarMargin", "n1", "()LVd/b;", "binding", "k0", "isKeyboardUp", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeFragment extends C9603e implements sg.g, sg.c, sg.b, l, m, C10244a {

    /* renamed from: A0  reason: collision with root package name */
    private final String f69851A0 = "profile/account/upgradeForm";

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f69852B0;

    /* renamed from: C0  reason: collision with root package name */
    private LinearLayoutManager f69853C0;
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public final Lg.d f69854D0;

    /* renamed from: E0  reason: collision with root package name */
    private C9602d f69855E0;

    /* renamed from: F0  reason: collision with root package name */
    private Integer f69856F0;

    /* renamed from: G0  reason: collision with root package name */
    private final C16824o f69857G0;
    /* access modifiers changed from: private */

    /* renamed from: H0  reason: collision with root package name */
    public p<? super String, ? super String, C16807N> f69858H0;

    /* renamed from: I0  reason: collision with root package name */
    private C11403c f69859I0;

    /* renamed from: J0  reason: collision with root package name */
    private Sd.a f69860J0;

    /* renamed from: K0  reason: collision with root package name */
    private final boolean f69861K0;

    /* renamed from: L0  reason: collision with root package name */
    private Vd.b f69862L0;

    /* renamed from: R  reason: collision with root package name */
    public C13909a f69863R;

    /* renamed from: S  reason: collision with root package name */
    public C14029a f69864S;

    /* renamed from: T  reason: collision with root package name */
    public Ae.e f69865T;

    /* renamed from: U  reason: collision with root package name */
    public Eo.a f69866U;

    /* renamed from: X  reason: collision with root package name */
    public C13194a f69867X;

    /* renamed from: Y  reason: collision with root package name */
    public C10038a f69868Y;

    /* renamed from: Z  reason: collision with root package name */
    public C14339a f69869Z;

    /* renamed from: y0  reason: collision with root package name */
    public Il.a f69870y0;

    /* renamed from: z0  reason: collision with root package name */
    public j f69871z0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.account.impl.upgrade.UpgradeFragment$observeNavigationResults$$inlined$consumeResult$1", f = "UpgradeFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.l implements p<C13194a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69872c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f69873d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f69874e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f69875f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UpgradeFragment f69876g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, UpgradeFragment upgradeFragment) {
            super(2, eVar);
            this.f69874e = lVar;
            this.f69875f = str;
            this.f69876g = upgradeFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f69874e, this.f69875f, eVar, this.f69876g);
            aVar.f69873d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C13194a.b bVar, C17164e<? super C16807N> eVar) {
            return ((a) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f69872c == 0) {
                y.b(obj);
                Object obj2 = this.f69873d;
                if (obj2 != null) {
                    C13194a.b bVar = (C13194a.b) obj2;
                    p f12 = this.f69876g.f69858H0;
                    if (f12 != null) {
                        if (bVar instanceof C13194a.b.C2743a) {
                            C13194a.b.C2743a aVar = (C13194a.b.C2743a) bVar;
                            f12.invoke(aVar.b(), aVar.c());
                        } else {
                            f12.invoke(null, null);
                        }
                    }
                    this.f69876g.f69858H0 = null;
                    this.f69874e.h().m(this.f69875f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f69877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UpgradeFragment f69878b;

        public b(View view, UpgradeFragment upgradeFragment) {
            this.f69877a = view;
            this.f69878b = upgradeFragment;
        }

        public final void run() {
            Lg.d.h(this.f69878b.f69854D0, this.f69878b.r1(), (Object) null, 2, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f69879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f69880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UpgradeFragment f69881c;

        public c(View view, List list, UpgradeFragment upgradeFragment) {
            this.f69879a = view;
            this.f69880b = list;
            this.f69881c = upgradeFragment;
        }

        public final void run() {
            for (C11404d notifyItemRangeChanged : this.f69880b) {
                int itemCount = this.f69881c.f69854D0.getItemCount();
                this.f69881c.f69854D0.notifyItemRangeChanged(0, itemCount, notifyItemRangeChanged);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f69882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UpgradeFragment f69883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f69884c;

        public d(View view, UpgradeFragment upgradeFragment, i iVar) {
            this.f69882a = view;
            this.f69883b = upgradeFragment;
            this.f69884c = iVar;
        }

        public final void run() {
            this.f69883b.f69854D0.g(this.f69884c, C11404d.VALIDATION_FAILED);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69885c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f69885c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69885c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69886c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f69886c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69886c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69887c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69887c = aVar;
            this.f69888d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69887c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69888d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public UpgradeFragment() {
        K k10 = new K(this);
        C9611m mVar = new C9611m(this);
        C16824o a10 = C16825p.a(s.NONE, new e(k10));
        this.f69852B0 = W.b(this, P.b(com.ingka.ikea.account.impl.dynamicfields.d.class), new f(a10), new g((C17631a) null, a10), mVar);
        Lg.d dVar = new Lg.d((Lg.a<?>[]) new Lg.a[]{new o(this), new C10153g(this, this), new k(this), new pg.j(this, this), new C11208m(), new C10151e(this, this), new C9601c(), new r(this, this), new pg.p(this), new C(this), new C10150d(), new C10148b(this, this, "upgrade_account"), new pg.m(), new H(this, this), new pg.l()});
        this.f69854D0 = dVar;
        this.f69857G0 = C16825p.b(new C9612n(this));
        this.f69861K0 = true;
    }

    /* access modifiers changed from: private */
    public static final C16807N A1(UpgradeFragment upgradeFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new G(upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B1(UpgradeFragment upgradeFragment, ip.d dVar, boolean z10) {
        C17542s.j(dVar, "$this$handle");
        if (z10) {
            Sd.a aVar = upgradeFragment.f69860J0;
            if (aVar == null) {
                C17542s.z("authNavigation");
                aVar = null;
            }
            aVar.o0();
        }
        return C16807N.f139792a;
    }

    private final void C1() {
        F<ip.d<String>> k02 = w1().k0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(k02, viewLifecycleOwner, new v(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N D1(UpgradeFragment upgradeFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new F(upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E1(UpgradeFragment upgradeFragment, ip.d dVar, String str) {
        C17542s.j(dVar, "$this$handle");
        Context context = upgradeFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        String string = upgradeFragment.getString(Sd.f.f63356A);
        C17542s.i(string, "getString(...)");
        String string2 = upgradeFragment.getString(Sd.f.f63386z, str);
        C17542s.i(string2, "getString(...)");
        j.a.k(upgradeFragment.q1(), context, string, string2, false, Oo.b.f84330B2, new H(upgradeFragment), (String) null, (C17631a) null, (C17631a) null, 448, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F1(UpgradeFragment upgradeFragment) {
        Sd.a aVar = upgradeFragment.f69860J0;
        if (aVar == null) {
            C17542s.z("authNavigation");
            aVar = null;
        }
        aVar.o0();
        return C16807N.f139792a;
    }

    private final void G1() {
        F<ip.d<String>> g02 = w1().g0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(g02, viewLifecycleOwner, new x(this));
        F<ip.d<Integer>> h02 = w1().h0();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(h02, viewLifecycleOwner2, new y(this));
        F<ip.d<String>> c02 = w1().c0();
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ip.j.a(c02, viewLifecycleOwner3, new z(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N H1(UpgradeFragment upgradeFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new C9610l(upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I1(UpgradeFragment upgradeFragment, ip.d dVar, String str) {
        C17542s.j(dVar, "$this$handle");
        Context context = upgradeFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        String string = upgradeFragment.getString(Sd.f.f63378r);
        C17542s.i(string, "getString(...)");
        j.a.k(upgradeFragment.q1(), context, string, str, false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J1(UpgradeFragment upgradeFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new D(upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K1(UpgradeFragment upgradeFragment, ip.d dVar, Integer num) {
        C17542s.j(dVar, "$this$handle");
        Context context = upgradeFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        if (num == null) {
            return C16807N.f139792a;
        }
        int intValue = num.intValue();
        String string = upgradeFragment.getString(Sd.f.f63378r);
        C17542s.i(string, "getString(...)");
        String string2 = upgradeFragment.getString(intValue);
        C17542s.i(string2, "getString(...)");
        j.a.k(upgradeFragment.q1(), context, string, string2, false, Oo.b.f84330B2, new J(upgradeFragment), (String) null, (C17631a) null, (C17631a) null, 448, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L1(UpgradeFragment upgradeFragment) {
        Sd.a aVar = upgradeFragment.f69860J0;
        if (aVar == null) {
            C17542s.z("authNavigation");
            aVar = null;
        }
        aVar.o0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M1(UpgradeFragment upgradeFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new E(upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N1(UpgradeFragment upgradeFragment, ip.d dVar, String str) {
        C17542s.j(dVar, "$this$handle");
        j q12 = upgradeFragment.q1();
        Context context = upgradeFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        String string = upgradeFragment.getString(Oo.b.f84370F2);
        C17542s.i(string, "getString(...)");
        j.a.k(q12, context, string, upgradeFragment.getString(Oo.b.f84340C2), false, 0, new I(upgradeFragment), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O1(UpgradeFragment upgradeFragment) {
        C5191t activity;
        C8951o f10 = rw.f.f(upgradeFragment, upgradeFragment.f69851A0, (C17642l) null, 2, (Object) null);
        if (!(f10 == null || f10.k0() || (activity = upgradeFragment.getActivity()) == null)) {
            activity.onBackPressed();
        }
        return C16807N.f139792a;
    }

    private final void P1() {
        F<Boolean> m02 = w1().m0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(m02, viewLifecycleOwner, new A(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N Q1(UpgradeFragment upgradeFragment, boolean z10) {
        Sd.a aVar = upgradeFragment.f69860J0;
        if (aVar == null) {
            C17542s.z("authNavigation");
            aVar = null;
        }
        aVar.c(!z10);
        return C16807N.f139792a;
    }

    private final void R1() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(this.f69851A0);
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("StorePickerFragment.Result.Key", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "StorePickerFragment.Result.Key", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void S1() {
        F<t> e02 = w1().e0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(e02, viewLifecycleOwner, new B(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N T1(UpgradeFragment upgradeFragment, t tVar) {
        C17542s.j(tVar, "fields");
        ArrayList arrayList = new ArrayList();
        if (!C17542s.e(tVar, com.ingka.ikea.account.impl.dynamicfields.d.f69514Q.c())) {
            C9602d dVar = upgradeFragment.f69855E0;
            if (dVar == null) {
                C17542s.z("headerViewModel");
                dVar = null;
            }
            arrayList.add(dVar);
            arrayList.addAll(tVar.c());
            arrayList.addAll(tVar.b());
            arrayList.add(upgradeFragment.r1());
        }
        Lg.d.q(upgradeFragment.f69854D0, arrayList, true, (C17642l) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    private final void U1() {
        F<Boolean> n02 = w1().n0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(n02, viewLifecycleOwner, new s(this));
        F<Boolean> l02 = w1().l0();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(l02, viewLifecycleOwner2, new t(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N V1(UpgradeFragment upgradeFragment, boolean z10) {
        Rect rect;
        float f10;
        if (z10) {
            View view = upgradeFragment.getView();
            if (view == null) {
                return C16807N.f139792a;
            }
            jp.g.b(view);
            RecyclerView.G e02 = upgradeFragment.n1().f64514c.e0(upgradeFragment.f69854D0.e().indexOf(upgradeFragment.r1()));
            View view2 = e02 != null ? e02.itemView : null;
            if (view2 != null) {
                rect = FullScreenProgressView.f92715q.a(view2);
                f10 = ((float) rect.height()) / 2.0f;
            } else {
                int measuredWidth = view.getMeasuredWidth() / 2;
                int measuredHeight = view.getMeasuredHeight();
                Rect rect2 = new Rect(measuredWidth, measuredHeight, measuredWidth, measuredHeight);
                f10 = Xo.e.a(24);
                rect = rect2;
            }
            upgradeFragment.d2(rect, f10, C16877v.q(upgradeFragment.getString(Oo.b.f84419K1), upgradeFragment.getString(Oo.b.f84547X), upgradeFragment.getString(Oo.b.f84757q3)));
        } else {
            upgradeFragment.x1();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(UpgradeFragment upgradeFragment, boolean z10) {
        HorizontalProgressView horizontalProgressView = upgradeFragment.n1().f64516e;
        C17542s.i(horizontalProgressView, "loadingBar");
        horizontalProgressView.setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    private final void X1() {
        F<Boolean> f02 = w1().f0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(f02, viewLifecycleOwner, new u(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N Y1(UpgradeFragment upgradeFragment, boolean z10) {
        upgradeFragment.r1().f().setValue(Boolean.valueOf(z10));
        RecyclerView recyclerView = upgradeFragment.n1().f64514c;
        C17542s.i(recyclerView, "list");
        L.a(recyclerView, new b(recyclerView, upgradeFragment));
        return C16807N.f139792a;
    }

    private final void Z1() {
        F<List<C11404d>> i02 = w1().i0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(i02, viewLifecycleOwner, new r(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(UpgradeFragment upgradeFragment, List list) {
        C17542s.j(list, "validations");
        if (list.contains(C11404d.VALIDATION_FAILED)) {
            upgradeFragment.t1().c("3");
        }
        RecyclerView recyclerView = upgradeFragment.n1().f64514c;
        C17542s.i(recyclerView, "list");
        L.a(recyclerView, new c(recyclerView, list, upgradeFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b2(UpgradeFragment upgradeFragment, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        RecyclerView recyclerView = upgradeFragment.n1().f64514c;
        C17542s.i(recyclerView, "list");
        qVar.e(recyclerView, C14617d.Padding);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c2(UpgradeFragment upgradeFragment) {
        C5191t activity;
        if (!androidx.navigation.fragment.a.a(upgradeFragment).k0() && (activity = upgradeFragment.getActivity()) != null) {
            activity.onBackPressed();
        }
        return C16807N.f139792a;
    }

    private final void d2(Rect rect, float f10, List<String> list) {
        Z().a().a(C14615b.e.f127859b);
        FullScreenProgressView fullScreenProgressView = n1().f64515d;
        fullScreenProgressView.setVisibility(0);
        fullScreenProgressView.setAlpha(1.0f);
        fullScreenProgressView.x(rect, f10, list);
    }

    private final void e2(LinearLayoutManager linearLayoutManager, int i10, float f10) {
        Context context = getContext();
        if (context != null) {
            linearLayoutManager.j2(new C11405e(context, i10, (int) f10));
        }
    }

    /* access modifiers changed from: private */
    public static final k0 f2(UpgradeFragment upgradeFragment) {
        C5191t requireActivity = upgradeFragment.requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        return requireActivity;
    }

    /* access modifiers changed from: private */
    public static final i0.c g2(UpgradeFragment upgradeFragment) {
        return d.a.b(com.ingka.ikea.account.impl.dynamicfields.d.f69514Q, upgradeFragment.m1(), new N(upgradeFragment.p1()), (C9347b) null, false, 4, (Object) null);
    }

    private final int h1(int i10, List<? extends Object> list) {
        int size = list.size() - 1;
        return (i10 >= size || !C16877v.g0(C16877v.a0(C16877v.e1(list, new C17974j(i10 + 1, size)), i.class))) ? 6 : 5;
    }

    /* access modifiers changed from: private */
    public static final C11199d.a i1(UpgradeFragment upgradeFragment) {
        Integer valueOf = Integer.valueOf(h.a(Xo.e.a(16)));
        Integer valueOf2 = Integer.valueOf(h.a(Xo.e.a(16)));
        String string = upgradeFragment.getString(Sd.f.f63357B);
        C17542s.i(string, "getString(...)");
        return new C11199d.a(valueOf, valueOf2, string, new q(upgradeFragment));
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(UpgradeFragment upgradeFragment, int i10) {
        upgradeFragment.f69854D0.notifyItemChanged(i10);
        com.ingka.ikea.account.impl.dynamicfields.d.y0(upgradeFragment.w1(), false, 1, (Object) null);
        return C16807N.f139792a;
    }

    private final Vd.b n1() {
        Vd.b bVar = this.f69862L0;
        C17542s.g(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    public final C11199d.a r1() {
        return (C11199d.a) this.f69857G0.getValue();
    }

    private final LinearLayoutManager s1() {
        LinearLayoutManager linearLayoutManager = this.f69853C0;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final float v1() {
        return getResources().getDimension(Sd.b.f63335a) + ((float) Z().a().getHeight());
    }

    private final com.ingka.ikea.account.impl.dynamicfields.d w1() {
        return (com.ingka.ikea.account.impl.dynamicfields.d) this.f69852B0.getValue();
    }

    private final void x1() {
        Z().a().a(C14615b.c.f127858b);
        FullScreenProgressView fullScreenProgressView = n1().f64515d;
        fullScreenProgressView.animate().alpha(0.0f).withEndAction(new w(fullScreenProgressView));
    }

    /* access modifiers changed from: private */
    public static final void y1(FullScreenProgressView fullScreenProgressView) {
        fullScreenProgressView.setVisibility(8);
    }

    private final void z1() {
        F<ip.d<Boolean>> j02 = w1().j0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(j02, viewLifecycleOwner, new C(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: qg.i} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r0.intValue() != r1) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, boolean r5) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.f69856F0
            r1 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.intValue()
            Lg.d r2 = r3.f69854D0
            java.util.List r2 = r2.e()
            java.lang.Object r0 = r2.get(r0)
            boolean r2 = r0 instanceof qg.i
            if (r2 == 0) goto L_0x001a
            r1 = r0
            qg.i r1 = (qg.i) r1
        L_0x001a:
            if (r1 != 0) goto L_0x001d
            goto L_0x0048
        L_0x001d:
            com.ingka.ikea.account.impl.dynamicfields.d r0 = r3.w1()
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L_0x0048
            Vd.b r0 = r3.n1()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f64514c
            java.lang.String r2 = "list"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            com.ingka.ikea.account.impl.upgrade.UpgradeFragment$d r2 = new com.ingka.ikea.account.impl.upgrade.UpgradeFragment$d
            r2.<init>(r0, r3, r1)
            I2.L.a(r0, r2)
            java.lang.Integer r0 = r3.f69856F0
            int r1 = r4 + -1
            if (r0 != 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = r4
        L_0x0049:
            Lg.d r0 = r3.f69854D0
            int r0 = r0.getItemCount()
            int r0 = r0 + -1
            r2 = 0
            int r0 = tI.C17978n.m(r1, r2, r0)
            if (r5 == 0) goto L_0x0063
            androidx.recyclerview.widget.LinearLayoutManager r5 = r3.s1()
            float r1 = r3.v1()
            r3.e2(r5, r0, r1)
        L_0x0063:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.f69856F0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.upgrade.UpgradeFragment.a(int, boolean):void");
    }

    public void c(p<? super String, ? super String, C16807N> pVar) {
        C17542s.j(pVar, "callback");
        this.f69858H0 = pVar;
        C8951o f10 = rw.f.f(this, this.f69851A0, (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a.C2742a.a(u1(), f10, StorageType.NO_STORAGE, (String) null, false, (String) null, (x4.C) null, 60, (Object) null);
        }
    }

    public void f(String str, String str2, Map<String, String> map, C10192b.a aVar, C10192b.d dVar, C10192b.C1401b bVar, String str3, C17642l<? super String, C16807N> lVar) {
        C17542s.j(str2, "countryCode");
        C17542s.j(map, "pickerData");
        C17542s.j(bVar, "pickerType");
        C17542s.j(str3, "componentValue");
        C17542s.j(lVar, "callback");
        sg.e eVar = sg.e.f76537a;
        C10038a k12 = k1();
        C5191t activity = getActivity();
        Lg.d dVar2 = this.f69854D0;
        t b02 = w1().b0();
        eVar.c(k12, activity, dVar2, b02 != null ? b02.a() : null, str, map, str2, aVar, dVar, bVar, str3, lVar);
    }

    public void f0() {
        com.ingka.ikea.account.impl.dynamicfields.d.y0(w1(), false, 1, (Object) null);
    }

    public int h0(int i10) {
        return h1(i10, this.f69854D0.e());
    }

    public void i0(int i10) {
        f.a aVar = sg.f.f76544x0;
        com.ingka.ikea.account.impl.dynamicfields.d w12 = w1();
        RecyclerView recyclerView = n1().f64514c;
        C17542s.i(recyclerView, "list");
        aVar.a(w12, recyclerView, this.f69854D0, i10);
    }

    public void j(String str) {
        C17542s.j(str, "url");
        o1().a(getContext(), str);
    }

    public boolean k0() {
        C0 G10;
        View view = getView();
        if (view == null || (G10 = C4600b0.G(view)) == null) {
            return false;
        }
        return G10.r(C0.l.c());
    }

    public final C10038a k1() {
        C10038a aVar = this.f69868Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("addressPickerNavigation");
        return null;
    }

    public void l(List<String> list, String str, C17642l<? super String, C16807N> lVar) {
        C17542s.j(list, "values");
        C17542s.j(lVar, "callback");
        sg.j jVar = sg.j.f76552a;
        Context context = getContext();
        if (context != null) {
            jVar.c(context, list, str, lVar);
        }
    }

    public final Ae.e l1() {
        Ae.e eVar = this.f69865T;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public void m(Date date, int i10, C17642l<? super Date, C16807N> lVar) {
        C17542s.j(date, "initialDate");
        C17542s.j(lVar, "callback");
        C5191t activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to show date picker, activity finishing");
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = UpgradeFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalArgumentException, str);
                str2 = str3;
            }
            return;
        }
        Wd.L l10 = Wd.L.f64653a;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        l10.d(parentFragmentManager, date, i10, lVar);
    }

    public final Il.a m1() {
        Il.a aVar = this.f69870y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public void n(String str, String str2) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        FullscreenDialogFragment.a.b(FullscreenDialogFragment.f94870N, str, (String) null, str2, 0, (FullscreenDialogFragment.b) null, 26, (Object) null).show(getParentFragmentManager(), "fullscreen_dialog");
    }

    public final Eo.a o1() {
        Eo.a aVar = this.f69866U;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public void onAttach(Context context) {
        C17542s.j(context, "context");
        super.onAttach(context);
        this.f69860J0 = (Sd.a) context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f69862L0 = Vd.b.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = n1().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            jp.g.b(view);
        }
        this.f69853C0 = null;
        this.f69862L0 = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        this.f69856F0 = null;
        C17542s.g(context);
        this.f69853C0 = new AccurateOffsetLinearLayoutManager(context);
        RecyclerView recyclerView = n1().f64514c;
        recyclerView.setAdapter(this.f69854D0);
        recyclerView.setLayoutManager(s1());
        recyclerView.j(new il.f(recyclerView.getResources().getDimensionPixelOffset(Sd.b.f63335a), true, (f.a) null, 0, 12, (DefaultConstructorMarker) null));
        C11403c cVar = new C11403c();
        recyclerView.n(cVar);
        this.f69859I0 = cVar;
        b(new o(this));
        f.a.a(l1(), Td.b.UPGRADE_BEGIN.b(), (Map) null, 2, (Object) null);
        String string = getString(Sd.f.f63360E);
        C17542s.i(string, "getString(...)");
        C9602d dVar = new C9602d(string);
        BackButton backButton = BackButton.CLOSE;
        dVar.i(backButton.getResId());
        dVar.h(backButton.getContentDescriptionId());
        dVar.g(new p(this));
        dVar.k((String) null);
        dVar.j((C17631a<C16807N>) null);
        this.f69855E0 = dVar;
        S1();
        Z1();
        X1();
        U1();
        P1();
        z1();
        G1();
        C1();
        R1();
    }

    public void p0(String str) {
        g.a.b(this, str);
    }

    public final C14029a p1() {
        C14029a aVar = this.f69864S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("editProfileRepository");
        return null;
    }

    public final j q1() {
        j jVar = this.f69871z0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C14339a t1() {
        C14339a aVar = this.f69869Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("profileAnalytics");
        return null;
    }

    public final C13194a u1() {
        C13194a aVar = this.f69867X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f69861K0;
    }
}
