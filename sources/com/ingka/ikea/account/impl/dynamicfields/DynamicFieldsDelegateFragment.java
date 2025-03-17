package com.ingka.ikea.account.impl.dynamicfields;

import Ar.j;
import HJ.C15854t;
import I2.C0;
import I2.C4600b0;
import Lg.d;
import MB.C13194a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16534i;
import Wd.C9347b;
import Wd.C9348c;
import Wd.C9349d;
import Wd.C9350e;
import Wd.C9351f;
import Wd.C9352g;
import Wd.C9353h;
import Wd.C9354i;
import Wd.C9355j;
import Wd.C9356k;
import Wd.C9357l;
import Wd.C9358m;
import Wd.L;
import Wd.M;
import Wd.n;
import Wd.o;
import Wd.q;
import Wd.t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C5187o;
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
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dl.C11207l;
import dl.C11209n;
import dl.C11212q;
import eI.C17187b;
import el.C11248a;
import il.C11404d;
import il.C11405e;
import il.f;
import ip.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
import qg.C10192b;
import qg.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sg.C10244a;
import sg.g;
import sg.l;
import sg.m;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u000b*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\nJ\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\nJ\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\nJ5\u0010G\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u001b2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020\u000b0EH\u0016¢\u0006\u0004\bG\u0010HJ-\u0010K\u001a\u00020\u000b2\u001c\u0010F\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020\u000b0IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020JH\u0016¢\u0006\u0004\bR\u0010SJ=\u0010W\u001a\u00020\u000b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020J0T2\b\u0010V\u001a\u0004\u0018\u00010J2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020\u000b0EH\u0016¢\u0006\u0004\bW\u0010XJo\u0010d\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010J2\u0006\u0010Z\u001a\u00020J2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020J0[2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020J2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020\u000b0EH\u0016¢\u0006\u0004\bd\u0010eR\"\u0010k\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010f8\u0016X\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0001\u001a\u00020|8\u0006@\u0006X.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0017\n\u0005\b-\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\u00020\u00168\u0014XD¢\u0006\u000f\n\u0005\b#\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T8\u0014X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010¢\u0001\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u00010T8\u0014X\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010\u0001\u001a\u0006\b¡\u0001\u0010\u0001R!\u0010¨\u0001\u001a\u00030£\u00018DX\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R1\u0010«\u0001\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020\u000b\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010­\u0001R\u0017\u0010±\u0001\u001a\u00020J8&X¦\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0017\u0010»\u0001\u001a\u00020J8&X¦\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010°\u0001R\u0017\u0010½\u0001\u001a\u00020\u00168&X¦\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010\u0001R\u0016\u0010c\u001a\u00020J8&X¦\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010°\u0001R\u0017\u0010À\u0001\u001a\u00020\u00168VX\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0001¨\u0006Á\u0001"}, d2 = {"Lcom/ingka/ikea/account/impl/dynamicfields/DynamicFieldsDelegateFragment;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateFragment;", "", "Lsg/g;", "Lsg/c;", "Lsg/b;", "Lsg/l;", "Lsg/m;", "Lsg/a;", "<init>", "()V", "LXH/N;", "H1", "S1", "K1", "I1", "N1", "z1", "P1", "F1", "LWd/t;", "fields", "", "enabledStateChanged", "V1", "(LWd/t;Z)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "target", "", "offset", "U1", "(Landroidx/recyclerview/widget/LinearLayoutManager;IF)V", "N0", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroidx/recyclerview/widget/RecyclerView;", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "position", "scrollTo", "a", "(IZ)V", "i0", "(I)V", "h0", "(I)I", "f0", "Ljava/util/Date;", "initialDate", "minAge", "Lkotlin/Function1;", "callback", "m", "(Ljava/util/Date;ILnI/l;)V", "Lkotlin/Function2;", "", "c", "(LnI/p;)V", "url", "j", "(Ljava/lang/String;)V", "title", "body", "n", "(Ljava/lang/String;Ljava/lang/String;)V", "", "values", "default", "l", "(Ljava/util/List;Ljava/lang/String;LnI/l;)V", "currentValue", "countryCode", "", "pickerData", "Lqg/b$a;", "pickerBounds", "Lqg/b$d;", "cursorFocusMode", "Lqg/b$b;", "pickerType", "componentValue", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lqg/b$a;Lqg/b$d;Lqg/b$b;Ljava/lang/String;LnI/l;)V", "Lkotlin/Function0;", "z0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LMB/a;", "A0", "LMB/a;", "w1", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "Lme/a;", "B0", "Lme/a;", "m1", "()Lme/a;", "setAddressPickerNavigation", "(Lme/a;)V", "addressPickerNavigation", "LAr/j;", "C0", "LAr/j;", "t1", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LEo/a;", "D0", "LEo/a;", "q1", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LIl/a;", "LIl/a;", "o1", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "F0", "Landroid/view/MenuItem;", "saveItem", "Z", "v1", "()Z", "showSaveInOptionsMenu", "H0", "Ljava/util/List;", "l1", "()Ljava/util/List;", "additionalFields", "LLg/a;", "I0", "k1", "additionalDelegates", "Lcom/ingka/ikea/account/impl/dynamicfields/d;", "J0", "LXH/o;", "y1", "()Lcom/ingka/ikea/account/impl/dynamicfields/d;", "viewModel", "K0", "LnI/p;", "pendingPickerCallback", "L0", "Ljava/lang/Integer;", "lastPosition", "r1", "()Ljava/lang/String;", "destId", "LWd/b;", "n1", "()LWd/b;", "analyticsDelegate", "LWd/M;", "u1", "()LWd/M;", "repositoryConnection", "s1", "errorDialogTitle", "x1", "validateFieldsOnCreation", "p1", "k0", "isKeyboardUp", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DynamicFieldsDelegateFragment extends Hilt_DynamicFieldsDelegateFragment implements sg.g, sg.c, sg.b, l, m, C10244a {

    /* renamed from: A0  reason: collision with root package name */
    public C13194a f69477A0;

    /* renamed from: B0  reason: collision with root package name */
    public C10038a f69478B0;

    /* renamed from: C0  reason: collision with root package name */
    public j f69479C0;

    /* renamed from: D0  reason: collision with root package name */
    public Eo.a f69480D0;

    /* renamed from: E0  reason: collision with root package name */
    public Il.a f69481E0;

    /* renamed from: F0  reason: collision with root package name */
    private MenuItem f69482F0;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f69483G0 = true;

    /* renamed from: H0  reason: collision with root package name */
    private final List<Object> f69484H0 = C16877v.n();

    /* renamed from: I0  reason: collision with root package name */
    private final List<Lg.a<?>> f69485I0 = C16877v.n();

    /* renamed from: J0  reason: collision with root package name */
    private final C16824o f69486J0;
    /* access modifiers changed from: private */

    /* renamed from: K0  reason: collision with root package name */
    public p<? super String, ? super String, C16807N> f69487K0;

    /* renamed from: L0  reason: collision with root package name */
    private Integer f69488L0;

    /* renamed from: z0  reason: collision with root package name */
    private final C17631a<C16807N> f69489z0 = new q(this);

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment$observeNavigationResult$$inlined$consumeResult$1", f = "DynamicFieldsDelegateFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.l implements p<C13194a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69490c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f69491d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f69492e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f69493f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DynamicFieldsDelegateFragment f69494g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment) {
            super(2, eVar);
            this.f69492e = lVar;
            this.f69493f = str;
            this.f69494g = dynamicFieldsDelegateFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f69492e, this.f69493f, eVar, this.f69494g);
            aVar.f69491d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C13194a.b bVar, C17164e<? super C16807N> eVar) {
            return ((a) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f69490c == 0) {
                y.b(obj);
                Object obj2 = this.f69491d;
                if (obj2 != null) {
                    C13194a.b bVar = (C13194a.b) obj2;
                    p g12 = this.f69494g.f69487K0;
                    if (g12 != null) {
                        if (bVar instanceof C13194a.b.C2743a) {
                            C13194a.b.C2743a aVar = (C13194a.b.C2743a) bVar;
                            g12.invoke(aVar.b(), aVar.c());
                        } else {
                            g12.invoke(null, null);
                        }
                    }
                    this.f69494g.f69487K0 = null;
                    this.f69492e.h().m(this.f69493f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f69495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DynamicFieldsDelegateFragment f69496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f69497c;

        public b(View view, DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, i iVar) {
            this.f69495a = view;
            this.f69496b = dynamicFieldsDelegateFragment;
            this.f69497c = iVar;
        }

        public final void run() {
            this.f69496b.I0().g(this.f69497c, C11404d.VALIDATION_FAILED);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69498c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f69498c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69498c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69499c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f69499c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69499c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69500c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f69500c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69500c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69501c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69501c = aVar;
            this.f69502d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69501c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69502d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment$updateListContent$1", f = "DynamicFieldsDelegateFragment.kt", l = {350}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69503c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DynamicFieldsDelegateFragment f69504d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f69505e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f69506f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, t tVar, boolean z10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f69504d = dynamicFieldsDelegateFragment;
            this.f69505e = tVar;
            this.f69506f = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(boolean z10, d.a aVar) {
            aVar.f(new b(z10));
            aVar.h(new c(aVar, z10));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final boolean n(boolean z10, Object obj, Object obj2) {
            return (!(obj instanceof i) || !(obj2 instanceof i)) ? C17542s.e(obj, obj2) : !z10 || C17542s.e(obj, obj2);
        }

        /* access modifiers changed from: private */
        public static final d.a q(d.a aVar, boolean z10, Object obj, Object obj2) {
            if (!(obj instanceof i) || !(obj2 instanceof i) || !z10) {
                return null;
            }
            return aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f69504d, this.f69505e, this.f69506f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f69503c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f69504d.M0().F0()) {
                    RecyclerView h12 = this.f69504d.M0();
                    this.f69503c = 1;
                    if (jp.g.a(h12, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t tVar = this.f69505e;
            DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment = this.f69504d;
            List c10 = C16877v.c();
            c10.addAll(tVar.c());
            c10.addAll(tVar.b());
            c10.addAll(dynamicFieldsDelegateFragment.l1());
            this.f69504d.I0().p(C16877v.a(c10), true, new a(this.f69506f));
            return C16807N.f139792a;
        }
    }

    public DynamicFieldsDelegateFragment() {
        C9349d dVar = new C9349d(this);
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f69486J0 = W.b(this, P.b(d.class), new e(a10), new f((C17631a) null, a10), dVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N A1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new C9352g(dynamicFieldsDelegateFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar, String str) {
        C17542s.j(dVar, "$this$handle");
        j t12 = dynamicFieldsDelegateFragment.t1();
        Context context = dynamicFieldsDelegateFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        j.a.k(t12, context, dynamicFieldsDelegateFragment.s1(), str, false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new C9351f(dynamicFieldsDelegateFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar, String str) {
        C17542s.j(dVar, "$this$handle");
        j t12 = dynamicFieldsDelegateFragment.t1();
        Context context = dynamicFieldsDelegateFragment.getContext();
        if (context == null) {
            return C16807N.f139792a;
        }
        String string = dynamicFieldsDelegateFragment.getString(Oo.b.f84370F2);
        C17542s.i(string, "getString(...)");
        j.a.k(t12, context, string, dynamicFieldsDelegateFragment.getString(Oo.b.f84340C2), false, 0, new C9353h(dynamicFieldsDelegateFragment), (String) null, (C17631a) null, (C17631a) null, 472, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment) {
        C5191t activity;
        C8951o f10 = rw.f.f(dynamicFieldsDelegateFragment, dynamicFieldsDelegateFragment.r1(), (C17642l) null, 2, (Object) null);
        if ((f10 == null || !f10.k0()) && (activity = dynamicFieldsDelegateFragment.getActivity()) != null) {
            activity.finish();
        }
        return C16807N.f139792a;
    }

    private final void F1() {
        F<Boolean> m02 = y1().m0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(m02, viewLifecycleOwner, new C9348c(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N G1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, boolean z10) {
        t value = dynamicFieldsDelegateFragment.y1().e0().getValue();
        if (value != null) {
            dynamicFieldsDelegateFragment.V1(value, true);
        }
        return C16807N.f139792a;
    }

    private final void H1() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(r1());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("StorePickerFragment.Result.Key", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "StorePickerFragment.Result.Key", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    private final void I1() {
        F<t> e02 = y1().e0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(e02, viewLifecycleOwner, new Wd.p(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N J1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, t tVar) {
        C17542s.j(tVar, "fields");
        W1(dynamicFieldsDelegateFragment, tVar, false, 2, (Object) null);
        return C16807N.f139792a;
    }

    private final void K1() {
        F<Boolean> n02 = y1().n0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(n02, viewLifecycleOwner, new n(this));
        F<Boolean> l02 = y1().l0();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(l02, viewLifecycleOwner2, new o(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N L1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, boolean z10) {
        dynamicFieldsDelegateFragment.K0().setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, boolean z10) {
        dynamicFieldsDelegateFragment.K0().setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    private final void N1() {
        F<Boolean> f02 = y1().f0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(f02, viewLifecycleOwner, new C9354i(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N O1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, boolean z10) {
        MenuItem menuItem = dynamicFieldsDelegateFragment.f69482F0;
        if (menuItem != null) {
            menuItem.setEnabled(z10);
        }
        t value = dynamicFieldsDelegateFragment.y1().e0().getValue();
        if (value != null) {
            W1(dynamicFieldsDelegateFragment, value, false, 2, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void P1() {
        F<ip.d<Boolean>> j02 = y1().j0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(j02, viewLifecycleOwner, new C9358m(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N Q1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar) {
        C17542s.j(dVar, "event");
        dVar.a(new C9350e(dynamicFieldsDelegateFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, ip.d dVar, boolean z10) {
        C8951o f10;
        C5191t activity;
        C17542s.j(dVar, "$this$handle");
        if (z10 && (((f10 = rw.f.f(dynamicFieldsDelegateFragment, dynamicFieldsDelegateFragment.r1(), (C17642l) null, 2, (Object) null)) == null || !f10.k0()) && (activity = dynamicFieldsDelegateFragment.getActivity()) != null)) {
            activity.finish();
        }
        return C16807N.f139792a;
    }

    private final void S1() {
        F<List<C11404d>> i02 = y1().i0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(i02, viewLifecycleOwner, new C9357l(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N T1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, List list) {
        C17542s.j(list, "validations");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int itemCount = dynamicFieldsDelegateFragment.I0().getItemCount();
            dynamicFieldsDelegateFragment.I0().notifyItemRangeChanged(0, itemCount, (C11404d) it.next());
        }
        return C16807N.f139792a;
    }

    private final void U1(LinearLayoutManager linearLayoutManager, int i10, float f10) {
        Context context = getContext();
        if (context != null) {
            linearLayoutManager.j2(new C11405e(context, i10, (int) f10));
        }
    }

    private final void V1(t tVar, boolean z10) {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new g(this, tVar, z10, (C17164e<? super g>) null), 3, (Object) null);
    }

    static /* synthetic */ void W1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment, t tVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dynamicFieldsDelegateFragment.V1(tVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateListContent");
    }

    /* access modifiers changed from: private */
    public static final i0.c X1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment) {
        return d.f69514Q.a(dynamicFieldsDelegateFragment.o1(), dynamicFieldsDelegateFragment.u1(), dynamicFieldsDelegateFragment.n1(), dynamicFieldsDelegateFragment.x1());
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(DynamicFieldsDelegateFragment dynamicFieldsDelegateFragment) {
        dynamicFieldsDelegateFragment.H1();
        return C16807N.f139792a;
    }

    private final void z1() {
        F<ip.d<String>> g02 = y1().g0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(g02, viewLifecycleOwner, new C9355j(this));
        F<ip.d<String>> c02 = y1().c0();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(c02, viewLifecycleOwner2, new C9356k(this));
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new il.f(getResources().getDimensionPixelOffset(Sd.b.f63335a), false, (f.a) null, 0, 14, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((List<? extends Lg.a<?>>) C16877v.V0(C16877v.q(new pg.o(this), new C10153g(this, this), new k(this), new pg.j(this, this), new C10151e(this, this), new C11248a(), new pg.r(this, this), new pg.p(this), new C(this), new C11207l(Sd.d.f63353e), new C10150d(), new C10148b(this, this, p1()), new pg.m(), new H(this, this), new pg.l(), new C11212q(), new C11209n()), k1()));
    }

    /* access modifiers changed from: protected */
    public void N0() {
        C5191t activity;
        if (!androidx.navigation.fragment.a.a(this).k0() && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: qg.i} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r0.intValue() != r1) goto L_0x0043;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, boolean r5) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.f69488L0
            r1 = 0
            if (r0 == 0) goto L_0x001c
            int r0 = r0.intValue()
            Lg.d r2 = r3.I0()
            java.util.List r2 = r2.e()
            java.lang.Object r0 = r2.get(r0)
            boolean r2 = r0 instanceof qg.i
            if (r2 == 0) goto L_0x001c
            r1 = r0
            qg.i r1 = (qg.i) r1
        L_0x001c:
            if (r1 != 0) goto L_0x001f
            goto L_0x0043
        L_0x001f:
            com.ingka.ikea.account.impl.dynamicfields.d r0 = r3.y1()
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L_0x0043
            androidx.recyclerview.widget.RecyclerView r0 = r3.M0()
            com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment$b r2 = new com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment$b
            r2.<init>(r0, r3, r1)
            I2.L.a(r0, r2)
            java.lang.Integer r0 = r3.f69488L0
            int r1 = r4 + -1
            if (r0 != 0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r4
        L_0x0044:
            Lg.d r0 = r3.I0()
            int r0 = r0.getItemCount()
            int r0 = r0 + -1
            r2 = 0
            int r0 = tI.C17978n.m(r1, r2, r0)
            if (r5 == 0) goto L_0x0062
            androidx.recyclerview.widget.LinearLayoutManager r5 = r3.J0()
            r1 = 24
            float r1 = Xo.e.a(r1)
            r3.U1(r5, r0, r1)
        L_0x0062:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.f69488L0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment.a(int, boolean):void");
    }

    public void c(p<? super String, ? super String, C16807N> pVar) {
        C17542s.j(pVar, "callback");
        this.f69487K0 = pVar;
        C8951o f10 = rw.f.f(this, r1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a.C2742a.a(w1(), f10, StorageType.NO_STORAGE, (String) null, false, (String) null, (x4.C) null, 60, (Object) null);
        }
    }

    public void f(String str, String str2, Map<String, String> map, C10192b.a aVar, C10192b.d dVar, C10192b.C1401b bVar, String str3, C17642l<? super String, C16807N> lVar) {
        C17542s.j(str2, "countryCode");
        C17542s.j(map, "pickerData");
        C17542s.j(bVar, "pickerType");
        C17542s.j(str3, "componentValue");
        C17542s.j(lVar, "callback");
        sg.e eVar = sg.e.f76537a;
        C10038a m12 = m1();
        C5191t activity = getActivity();
        Lg.d I02 = I0();
        t b02 = y1().b0();
        eVar.c(m12, activity, I02, b02 != null ? b02.a() : null, str, map, str2, aVar, dVar, bVar, str3, lVar);
    }

    public void f0() {
        d.y0(y1(), false, 1, (Object) null);
    }

    public int h0(int i10) {
        return i10 == I0().getItemCount() + -1 ? 6 : 5;
    }

    public void i0(int i10) {
        sg.f.f76544x0.a(y1(), M0(), I0(), i10);
    }

    public void j(String str) {
        C17542s.j(str, "url");
        q1().a(getContext(), str);
    }

    public boolean k0() {
        C0 G10;
        View view = getView();
        if (view == null || (G10 = C4600b0.G(view)) == null) {
            return false;
        }
        return G10.r(C0.l.c());
    }

    /* access modifiers changed from: protected */
    public List<Lg.a<?>> k1() {
        return this.f69485I0;
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

    /* access modifiers changed from: protected */
    public List<Object> l1() {
        return this.f69484H0;
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
                    String name = getClass().getName();
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
        L l10 = L.f64653a;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        l10.d(parentFragmentManager, date, i10, lVar);
    }

    public final C10038a m1() {
        C10038a aVar = this.f69478B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("addressPickerNavigation");
        return null;
    }

    public void n(String str, String str2) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        FullscreenDialogFragment.a.b(FullscreenDialogFragment.f94870N, str, (String) null, str2, 0, (FullscreenDialogFragment.b) null, 26, (Object) null).show(getParentFragmentManager(), "fullscreen_dialog");
    }

    public abstract C9347b n1();

    public final Il.a o1() {
        Il.a aVar = this.f69481E0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C17542s.j(menu, "menu");
        C17542s.j(menuInflater, "inflater");
        if (v1()) {
            MenuItem add = menu.add(0, 1234, 0, Oo.b.f84385G7);
            add.setShowAsAction(2);
            add.setEnabled(C17542s.e(y1().f0().getValue(), Boolean.TRUE));
            this.f69482F0 = add;
        }
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            jp.g.b(view);
        }
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (menuItem.getItemId() != 1234) {
            return super.onOptionsItemSelected(menuItem);
        }
        View view = getView();
        if (view != null) {
            jp.g.b(view);
        }
        d.y0(y1(), false, 1, (Object) null);
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView M02 = M0();
        M02.setPadding(M02.getPaddingLeft(), h.a(Xo.e.a(24)), M02.getPaddingRight(), h.a(Xo.e.a(24)));
        M02.setClipToPadding(false);
        M02.setDescendantFocusability(131072);
        M02.setFocusableInTouchMode(true);
        I1();
        N1();
        S1();
        K1();
        z1();
        F1();
        H1();
        P1();
    }

    public void p0(String str) {
        g.a.b(this, str);
    }

    public abstract String p1();

    public final Eo.a q1() {
        Eo.a aVar = this.f69480D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public abstract String r1();

    public abstract String s1();

    public final j t1() {
        j jVar = this.f69479C0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public abstract M u1();

    /* access modifiers changed from: protected */
    public boolean v1() {
        return this.f69483G0;
    }

    public final C13194a w1() {
        C13194a aVar = this.f69477A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    public abstract boolean x1();

    /* access modifiers changed from: protected */
    public final d y1() {
        return (d) this.f69486J0.getValue();
    }
}
