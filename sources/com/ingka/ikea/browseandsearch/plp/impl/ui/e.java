package com.ingka.ikea.browseandsearch.plp.impl.ui;

import An.o;
import Cn.t;
import D4.M;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import IC.C13026h;
import Kf.C9133b;
import Op.c1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.browseandsearch.plp.impl.ui.d;
import com.ingka.ikea.browseandsearch.plp.impl.ui.f;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;
import nI.s;
import on.C11686a;
import on.C11687b;
import pn.C11762b;
import pn.C11764d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10240a;
import sf.C10241b;
import sf.C10242c;
import un.C12068a;
import yn.e2;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001cH@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H@¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0015\u00100\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H@¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001c¢\u0006\u0004\b4\u0010\u001eJ\u0015\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u001c2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u0004\u0018\u00010&8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010XR\u0014\u0010`\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010XR\u0016\u0010b\u001a\u0004\u0018\u00010$8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010XR\u0016\u0010d\u001a\u0004\u0018\u00010$8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010XR\u0016\u0010f\u001a\u0004\u0018\u00010$8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010XR\u001a\u0010j\u001a\u00020&8\u0000X\u0004¢\u0006\f\n\u0004\bg\u0010\u001d\u001a\u0004\bh\u0010iR(\u0010q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0m\u0018\u00010l0k8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR+\u0010v\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0m\u0018\u00010l0r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bA\u0010uR \u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0w0k8\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010pR \u0010}\u001a\b\u0012\u0004\u0012\u00020&0k8\u0000X\u0004¢\u0006\f\n\u0004\bz\u0010p\u001a\u0004\b{\u0010|R\u001d\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010~0k8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010pR!\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010~0r8\u0006¢\u0006\r\n\u0005\b\u0001\u0010t\u001a\u0004\bZ\u0010u¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/e;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lpn/b;", "plpPaginationManager", "LFB/a;", "localStoreSelectionRepository", "Lsf/c;", "appUserDataRepository", "LjB/b;", "shoppingListRepository", "LKf/b;", "cartApi", "Lon/a;", "plpAnalytics", "LCn/t;", "plpUiMapper", "LDn/a;", "selectedRowSizeUseCase", "Lpn/d;", "plpSettingsRepository", "Lsf/b;", "appSessionUserDataRepository", "LCx/b;", "publisherTokenManager", "<init>", "(Landroidx/lifecycle/U;Lpn/b;LFB/a;Lsf/c;LjB/b;LKf/b;Lon/a;LCn/t;LDn/a;Lpn/d;Lsf/b;LCx/b;)V", "LXH/N;", "Z", "()V", "g0", "(LdI/e;)Ljava/lang/Object;", "Lun/a;", "V", "a0", "", "filter", "", "W", "(Ljava/lang/String;)Z", "itemNo", "productName", "T", "(Ljava/lang/String;Ljava/lang/String;)V", "f0", "LOp/c1;", "event", "d0", "(LOp/c1;)V", "U", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "e0", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/f;", "action", "b0", "(Lcom/ingka/ikea/browseandsearch/plp/impl/ui/f;)V", "Lyn/e2;", "plpScreenUiEvent", "c0", "(Lyn/e2;)V", "", "multiItemsPerRow", "h0", "(I)V", "m", "Lpn/b;", "n", "LFB/a;", "o", "Lsf/c;", "p", "LjB/b;", "q", "LKf/b;", "r", "Lon/a;", "s", "LCn/t;", "t", "LDn/a;", "u", "Lpn/d;", "v", "Lsf/b;", "w", "LCx/b;", "x", "Ljava/lang/String;", "argId", "y", "Ljava/lang/Boolean;", "useIdAsGroupParameter", "z", "argFallbackTitle", "A", "argType", "B", "argPreAppliedFilters", "C", "includedProductNos", "D", "prioritiser", "E", "Y", "()Z", "isSearch", "LTJ/B;", "LTJ/g;", "LD4/M;", "LAn/o;", "F", "LTJ/B;", "_uiState", "LTJ/P;", "G", "LTJ/P;", "()LTJ/P;", "uiState", "", "H", "itemNosAddingToCart", "I", "X", "()LTJ/B;", "isAvailabilityInlineMessageVisible", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/d;", "J", "_uiEvent", "K", "uiEvent", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final String f93553A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final String f93554B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final String f93555C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final String f93556D;

    /* renamed from: E  reason: collision with root package name */
    private final boolean f93557E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final C16505B<C16532g<M<o>>> f93558F;

    /* renamed from: G  reason: collision with root package name */
    private final C16519P<C16532g<M<o>>> f93559G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final C16505B<List<String>> f93560H;

    /* renamed from: I  reason: collision with root package name */
    private final C16505B<Boolean> f93561I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final C16505B<d> f93562J;

    /* renamed from: K  reason: collision with root package name */
    private final C16519P<d> f93563K;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11762b f93564m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C12860a f93565n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C10242c f93566o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C14613b f93567p;

    /* renamed from: q  reason: collision with root package name */
    private final C9133b f93568q;

    /* renamed from: r  reason: collision with root package name */
    private final C11686a f93569r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final t f93570s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final Dn.a f93571t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C11764d f93572u;

    /* renamed from: v  reason: collision with root package name */
    private final C10241b f93573v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final Cx.b f93574w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final String f93575x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final Boolean f93576y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final String f93577z;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/browseandsearch/plp/impl/ui/e$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f93578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f93579b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, e eVar, String str) {
            super(aVar);
            this.f93578a = eVar;
            this.f93579b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            e eVar = this.f93578a;
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Add to cart failed", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = eVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            this.f93578a.f93562J.setValue(new d.a(C13026h.b(Oo.b.f84467P, this.f93579b)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$addToCart$3", f = "PlpViewModel.kt", l = {281}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f93581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f93582e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f93583f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, String str, String str2, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f93581d = eVar;
            this.f93582e = str;
            this.f93583f = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f93581d, this.f93582e, this.f93583f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93580c;
            if (i10 == 0) {
                y.b(obj);
                e eVar = this.f93581d;
                String str = this.f93582e;
                String str2 = this.f93583f;
                this.f93580c = 1;
                if (eVar.U(str, str2, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel", f = "PlpViewModel.kt", l = {289}, m = "doAddToCart")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f93584c;

        /* renamed from: d  reason: collision with root package name */
        Object f93585d;

        /* renamed from: e  reason: collision with root package name */
        Object f93586e;

        /* renamed from: f  reason: collision with root package name */
        Object f93587f;

        /* renamed from: g  reason: collision with root package name */
        Object f93588g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f93589h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f93590i;

        /* renamed from: j  reason: collision with root package name */
        int f93591j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(eVar2);
            this.f93590i = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93589h = obj;
            this.f93591j |= Integer.MIN_VALUE;
            return this.f93590i.U((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel", f = "PlpViewModel.kt", l = {171, 174}, m = "getAvailabilityParams")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f93592c;

        /* renamed from: d  reason: collision with root package name */
        Object f93593d;

        /* renamed from: e  reason: collision with root package name */
        Object f93594e;

        /* renamed from: f  reason: collision with root package name */
        int f93595f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f93596g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f93597h;

        /* renamed from: i  reason: collision with root package name */
        int f93598i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, C17164e<? super d> eVar2) {
            super(eVar2);
            this.f93597h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93596g = obj;
            this.f93598i |= Integer.MIN_VALUE;
            return this.f93597h.V(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$loadData$1", f = "PlpViewModel.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.e$e  reason: collision with other inner class name */
    static final class C2083e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93599c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f93600d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<C12068a> f93601e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O<C12068a> f93602a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f93603b;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LD4/M;", "Lun/d;", "pagingData", "", "", "itemNosAddingToCart", "", "allProductNumbersInShoppingLists", "Lvn/g;", "selectedRow", "", "isAvailabilityInlineMessageVisible", "LAn/o;", "<anonymous>", "(LD4/M;Ljava/util/List;Ljava/util/Set;Lvn/g;Z)LD4/M;"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$loadData$1$1$1", f = "PlpViewModel.kt", l = {130}, m = "invokeSuspend")
            /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a  reason: collision with other inner class name */
            static final class C2084a extends l implements nI.t<M<un.d>, List<? extends String>, Set<? extends String>, vn.g, Boolean, C17164e<? super M<o>>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f93604c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f93605d;

                /* renamed from: e  reason: collision with root package name */
                /* synthetic */ Object f93606e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f93607f;

                /* renamed from: g  reason: collision with root package name */
                /* synthetic */ Object f93608g;

                /* renamed from: h  reason: collision with root package name */
                /* synthetic */ boolean f93609h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ e f93610i;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lun/d;", "pagingDataItem", "LAn/o;", "<anonymous>", "(Lun/d;)LAn/o;"}, k = 3, mv = {2, 1, 0})
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$loadData$1$1$1$1", f = "PlpViewModel.kt", l = {140, 142}, m = "invokeSuspend")
                /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a$a  reason: collision with other inner class name */
                static final class C2085a extends l implements p<un.d, C17164e<? super o>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    Object f93611c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f93612d;

                    /* renamed from: e  reason: collision with root package name */
                    int f93613e;

                    /* renamed from: f  reason: collision with root package name */
                    int f93614f;

                    /* renamed from: g  reason: collision with root package name */
                    /* synthetic */ Object f93615g;

                    /* renamed from: h  reason: collision with root package name */
                    final /* synthetic */ e f93616h;

                    /* renamed from: i  reason: collision with root package name */
                    final /* synthetic */ List<String> f93617i;

                    /* renamed from: j  reason: collision with root package name */
                    final /* synthetic */ boolean f93618j;

                    /* renamed from: k  reason: collision with root package name */
                    final /* synthetic */ Set<String> f93619k;

                    /* renamed from: l  reason: collision with root package name */
                    final /* synthetic */ vn.g f93620l;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2085a(e eVar, List<String> list, boolean z10, Set<String> set, vn.g gVar, C17164e<? super C2085a> eVar2) {
                        super(2, eVar2);
                        this.f93616h = eVar;
                        this.f93617i = list;
                        this.f93618j = z10;
                        this.f93619k = set;
                        this.f93620l = gVar;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        C2085a aVar = new C2085a(this.f93616h, this.f93617i, this.f93618j, this.f93619k, this.f93620l, eVar);
                        aVar.f93615g = obj;
                        return aVar;
                    }

                    /* renamed from: i */
                    public final Object invoke(un.d dVar, C17164e<? super o> eVar) {
                        return ((C2085a) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                        /*
                            r14 = this;
                            java.lang.Object r0 = eI.C17187b.f()
                            int r1 = r14.f93614f
                            r2 = 2
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L_0x0037
                            if (r1 == r4) goto L_0x002b
                            if (r1 != r2) goto L_0x0023
                            int r0 = r14.f93613e
                            java.lang.Object r1 = r14.f93612d
                            java.lang.Boolean r1 = (java.lang.Boolean) r1
                            java.lang.Object r1 = r14.f93611c
                            Cn.t r1 = (Cn.t) r1
                            java.lang.Object r2 = r14.f93615g
                            un.d r2 = (un.d) r2
                            XH.y.b(r15)
                            r5 = r1
                            r6 = r2
                            goto L_0x0086
                        L_0x0023:
                            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r15.<init>(r0)
                            throw r15
                        L_0x002b:
                            java.lang.Object r1 = r14.f93611c
                            Cn.t r1 = (Cn.t) r1
                            java.lang.Object r5 = r14.f93615g
                            un.d r5 = (un.d) r5
                            XH.y.b(r15)
                            goto L_0x005e
                        L_0x0037:
                            XH.y.b(r15)
                            java.lang.Object r15 = r14.f93615g
                            un.d r15 = (un.d) r15
                            com.ingka.ikea.browseandsearch.plp.impl.ui.e r1 = r14.f93616h
                            Cn.t r1 = r1.f93570s
                            com.ingka.ikea.browseandsearch.plp.impl.ui.e r5 = r14.f93616h
                            pn.d r5 = r5.f93572u
                            TJ.g r5 = r5.g()
                            r14.f93615g = r15
                            r14.f93611c = r1
                            r14.f93614f = r4
                            java.lang.Object r5 = TJ.C16534i.D(r5, r14)
                            if (r5 != r0) goto L_0x005b
                            return r0
                        L_0x005b:
                            r13 = r5
                            r5 = r15
                            r15 = r13
                        L_0x005e:
                            java.lang.Boolean r15 = (java.lang.Boolean) r15
                            if (r15 == 0) goto L_0x0067
                            boolean r6 = r15.booleanValue()
                            goto L_0x0068
                        L_0x0067:
                            r6 = r3
                        L_0x0068:
                            com.ingka.ikea.browseandsearch.plp.impl.ui.e r7 = r14.f93616h
                            pn.d r7 = r7.f93572u
                            TJ.g r7 = r7.f()
                            r14.f93615g = r5
                            r14.f93611c = r1
                            r14.f93612d = r15
                            r14.f93613e = r6
                            r14.f93614f = r2
                            java.lang.Object r15 = TJ.C16534i.D(r7, r14)
                            if (r15 != r0) goto L_0x0083
                            return r0
                        L_0x0083:
                            r0 = r6
                            r6 = r5
                            r5 = r1
                        L_0x0086:
                            java.lang.Boolean r15 = (java.lang.Boolean) r15
                            if (r15 == 0) goto L_0x0090
                            boolean r15 = r15.booleanValue()
                            r10 = r15
                            goto L_0x0091
                        L_0x0090:
                            r10 = r3
                        L_0x0091:
                            java.util.List<java.lang.String> r7 = r14.f93617i
                            boolean r8 = r14.f93618j
                            if (r0 == 0) goto L_0x0099
                            r9 = r4
                            goto L_0x009a
                        L_0x0099:
                            r9 = r3
                        L_0x009a:
                            java.util.Set<java.lang.String> r11 = r14.f93619k
                            vn.g r12 = r14.f93620l
                            An.o r15 = r5.a(r6, r7, r8, r9, r10, r11, r12)
                            return r15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a.C2084a.C2085a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2084a(e eVar, C17164e<? super C2084a> eVar2) {
                    super(6, eVar2);
                    this.f93610i = eVar;
                }

                public final Object i(M<un.d> m10, List<String> list, Set<String> set, vn.g gVar, boolean z10, C17164e<? super M<o>> eVar) {
                    C2084a aVar = new C2084a(this.f93610i, eVar);
                    aVar.f93605d = m10;
                    aVar.f93606e = list;
                    aVar.f93607f = set;
                    aVar.f93608g = gVar;
                    aVar.f93609h = z10;
                    return aVar.invokeSuspend(C16807N.f139792a);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: D4.M} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.List} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = eI.C17187b.f()
                        int r1 = r13.f93604c
                        r2 = 1
                        if (r1 == 0) goto L_0x002d
                        if (r1 != r2) goto L_0x0025
                        boolean r0 = r13.f93609h
                        java.lang.Object r1 = r13.f93608g
                        vn.g r1 = (vn.g) r1
                        java.lang.Object r2 = r13.f93607f
                        java.util.Set r2 = (java.util.Set) r2
                        java.lang.Object r3 = r13.f93606e
                        java.util.List r3 = (java.util.List) r3
                        java.lang.Object r4 = r13.f93605d
                        D4.M r4 = (D4.M) r4
                        XH.y.b(r14)
                        r9 = r0
                        r11 = r1
                        r10 = r2
                        r8 = r3
                        goto L_0x005d
                    L_0x0025:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L_0x002d:
                        XH.y.b(r14)
                        java.lang.Object r14 = r13.f93605d
                        r4 = r14
                        D4.M r4 = (D4.M) r4
                        java.lang.Object r14 = r13.f93606e
                        r3 = r14
                        java.util.List r3 = (java.util.List) r3
                        java.lang.Object r14 = r13.f93607f
                        java.util.Set r14 = (java.util.Set) r14
                        java.lang.Object r1 = r13.f93608g
                        vn.g r1 = (vn.g) r1
                        boolean r5 = r13.f93609h
                        com.ingka.ikea.browseandsearch.plp.impl.ui.e r6 = r13.f93610i
                        r13.f93605d = r4
                        r13.f93606e = r3
                        r13.f93607f = r14
                        r13.f93608g = r1
                        r13.f93609h = r5
                        r13.f93604c = r2
                        java.lang.Object r2 = r6.g0(r13)
                        if (r2 != r0) goto L_0x0059
                        return r0
                    L_0x0059:
                        r10 = r14
                        r11 = r1
                        r8 = r3
                        r9 = r5
                    L_0x005d:
                        com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a$a r14 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a$a
                        com.ingka.ikea.browseandsearch.plp.impl.ui.e r7 = r13.f93610i
                        r12 = 0
                        r6 = r14
                        r6.<init>(r7, r8, r9, r10, r11, r12)
                        D4.M r14 = D4.O.a(r4, r14)
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a.C2084a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    return i((M) obj, (List) obj2, (Set) obj3, (vn.g) obj4, ((Boolean) obj5).booleanValue(), (C17164e) obj6);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$loadData$1$1", f = "PlpViewModel.kt", l = {106}, m = "emit")
            /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f93621c;

                /* renamed from: d  reason: collision with root package name */
                Object f93622d;

                /* renamed from: e  reason: collision with root package name */
                Object f93623e;

                /* renamed from: f  reason: collision with root package name */
                Object f93624f;

                /* renamed from: g  reason: collision with root package name */
                /* synthetic */ Object f93625g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a<T> f93626h;

                /* renamed from: i  reason: collision with root package name */
                int f93627i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a<? super T> aVar, C17164e<? super b> eVar) {
                    super(eVar);
                    this.f93626h = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f93625g = obj;
                    this.f93627i |= Integer.MIN_VALUE;
                    return this.f93626h.emit((String) null, this);
                }
            }

            a(O<C12068a> o10, e eVar) {
                this.f93602a = o10;
                this.f93603b = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.String r19, dI.C17164e<? super XH.C16807N> r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a.b
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$b r2 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a.b) r2
                    int r3 = r2.f93627i
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f93627i = r3
                    goto L_0x001c
                L_0x0017:
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$b r2 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$b
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r3 = r2.f93625g
                    java.lang.Object r4 = eI.C17187b.f()
                    int r5 = r2.f93627i
                    r6 = 1
                    if (r5 == 0) goto L_0x0045
                    if (r5 != r6) goto L_0x003d
                    java.lang.Object r1 = r2.f93624f
                    kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                    java.lang.Object r4 = r2.f93623e
                    dI.e r4 = (dI.C17164e) r4
                    java.lang.Object r4 = r2.f93622d
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r2 = r2.f93621c
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a r2 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a) r2
                    XH.y.b(r3)
                    goto L_0x0065
                L_0x003d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0045:
                    XH.y.b(r3)
                    kotlin.jvm.internal.O<un.a> r3 = r0.f93602a
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r5 = r0.f93603b
                    r2.f93621c = r0
                    r7 = r19
                    r2.f93622d = r7
                    r2.f93623e = r1
                    r2.f93624f = r3
                    r2.f93627i = r6
                    java.lang.Object r1 = r5.V(r2)
                    if (r1 != r4) goto L_0x005f
                    return r4
                L_0x005f:
                    r2 = r0
                    r17 = r3
                    r3 = r1
                    r1 = r17
                L_0x0065:
                    r1.f144348a = r3
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r1 = r2.f93603b
                    TJ.B r1 = r1.f93558F
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    pn.b r4 = r3.f93564m
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r5 = r3.f93553A
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r6 = r3.f93575x
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.Boolean r3 = r3.f93576y
                    if (r3 == 0) goto L_0x008d
                    boolean r3 = r3.booleanValue()
                L_0x008b:
                    r7 = r3
                    goto L_0x008f
                L_0x008d:
                    r3 = 0
                    goto L_0x008b
                L_0x008f:
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r8 = r3.f93577z
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r10 = r3.f93554B
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r12 = r3.f93555C
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    java.lang.String r13 = r3.f93556D
                    kotlin.jvm.internal.O<un.a> r3 = r2.f93602a
                    T r3 = r3.f144348a
                    r14 = r3
                    un.a r14 = (un.C12068a) r14
                    r15 = 16
                    r16 = 0
                    r9 = 0
                    r11 = 2
                    TJ.g r3 = pn.C11762b.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r4 = r2.f93603b
                    QJ.Q r4 = androidx.lifecycle.g0.a(r4)
                    TJ.g r5 = D4.C6429c.a(r3, r4)
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    TJ.B r6 = r3.f93560H
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    jB.b r3 = r3.f93567p
                    TJ.g r7 = r3.f()
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    Dn.a r3 = r3.f93571t
                    TJ.g r8 = r3.invoke()
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = r2.f93603b
                    TJ.B r9 = r3.X()
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a r10 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$e$a$a
                    com.ingka.ikea.browseandsearch.plp.impl.ui.e r2 = r2.f93603b
                    r3 = 0
                    r10.<init>(r2, r3)
                    TJ.g r2 = TJ.C16534i.k(r5, r6, r7, r8, r9, r10)
                    r1.setValue(r2)
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.C2083e.a.emit(java.lang.String, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2083e(e eVar, O<C12068a> o10, C17164e<? super C2083e> eVar2) {
            super(2, eVar2);
            this.f93600d = eVar;
            this.f93601e = o10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2083e(this.f93600d, this.f93601e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2083e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93599c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<String> b10 = this.f93600d.f93574w.b();
                a aVar = new a(this.f93601e, this.f93600d);
                this.f93599c = 1;
                if (b10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LEB/d;", "storeSelection", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "", "showInStoreAvailability", "showHomeDelivery", "LXH/N;", "<anonymous>", "(LEB/d;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;ZZ)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$observeAvailability$1", f = "PlpViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements s<C12832d, UserPostalCodeAddress, Boolean, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93628c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f93629d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f93630e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f93631f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ boolean f93632g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f93633h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, C17164e<? super f> eVar2) {
            super(5, eVar2);
            this.f93633h = eVar;
        }

        public final Object i(C12832d dVar, UserPostalCodeAddress userPostalCodeAddress, boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
            f fVar = new f(this.f93633h, eVar);
            fVar.f93629d = dVar;
            fVar.f93630e = userPostalCodeAddress;
            fVar.f93631f = z10;
            fVar.f93632g = z11;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93628c == 0) {
                y.b(obj);
                C12832d dVar = (C12832d) this.f93629d;
                UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) this.f93630e;
                boolean z10 = this.f93631f;
                String str = null;
                C12068a.C2469a aVar = (!this.f93632g || userPostalCodeAddress == null) ? null : new C12068a.C2469a(userPostalCodeAddress.d(), userPostalCodeAddress.c());
                if (z10 && dVar != null) {
                    str = dVar.e();
                }
                this.f93633h.f93564m.e(new C12068a(aVar, str));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((C12832d) obj, (UserPostalCodeAddress) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$onAction$1", f = "PlpViewModel.kt", l = {347}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f93635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ vn.g f93636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, vn.g gVar, C17164e<? super g> eVar2) {
            super(2, eVar2);
            this.f93635d = eVar;
            this.f93636e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f93635d, this.f93636e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93634c;
            if (i10 == 0) {
                y.b(obj);
                Dn.a M10 = this.f93635d.f93571t;
                vn.g gVar = this.f93636e;
                this.f93634c = 1;
                if (M10.a(gVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel$treatPreAppliedFilters$1", f = "PlpViewModel.kt", l = {234, 240}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93637c;

        /* renamed from: d  reason: collision with root package name */
        int f93638d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f93639e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, C17164e<? super h> eVar2) {
            super(2, eVar2);
            this.f93639e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f93639e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            UserPostalCodeAddress l10;
            String d10;
            Object f10 = C17187b.f();
            int i10 = this.f93638d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f93639e.W(C11687b.d.c.f100629d.b()) && this.f93639e.f93565n.c() != null) {
                    C11764d I10 = this.f93639e.f93572u;
                    this.f93638d = 1;
                    if (I10.c(true, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) this.f93637c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f93639e.W(C11687b.d.C2348d.f100630d.b()) && (l10 = this.f93639e.f93566o.l()) != null && (d10 = l10.d()) != null && d10.length() > 0) {
                C11764d I11 = this.f93639e.f93572u;
                this.f93637c = l10;
                this.f93638d = 2;
                if (I11.d(true, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpViewModel", f = "PlpViewModel.kt", l = {156, 160, 161, 163}, m = "updateAvailabilityState")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f93640c;

        /* renamed from: d  reason: collision with root package name */
        Object f93641d;

        /* renamed from: e  reason: collision with root package name */
        Object f93642e;

        /* renamed from: f  reason: collision with root package name */
        Object f93643f;

        /* renamed from: g  reason: collision with root package name */
        int f93644g;

        /* renamed from: h  reason: collision with root package name */
        int f93645h;

        /* renamed from: i  reason: collision with root package name */
        int f93646i;

        /* renamed from: j  reason: collision with root package name */
        boolean f93647j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f93648k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ e f93649l;

        /* renamed from: m  reason: collision with root package name */
        int f93650m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, C17164e<? super i> eVar2) {
            super(eVar2);
            this.f93649l = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93648k = obj;
            this.f93650m |= Integer.MIN_VALUE;
            return this.f93649l.g0(this);
        }
    }

    public e(U u10, C11762b bVar, C12860a aVar, C10242c cVar, C14613b bVar2, C9133b bVar3, C11686a aVar2, t tVar, Dn.a aVar3, C11764d dVar, C10241b bVar4, Cx.b bVar5) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "plpPaginationManager");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(bVar2, "shoppingListRepository");
        C17542s.j(bVar3, "cartApi");
        C17542s.j(aVar2, "plpAnalytics");
        C17542s.j(tVar, "plpUiMapper");
        C17542s.j(aVar3, "selectedRowSizeUseCase");
        C17542s.j(dVar, "plpSettingsRepository");
        C17542s.j(bVar4, "appSessionUserDataRepository");
        C17542s.j(bVar5, "publisherTokenManager");
        this.f93564m = bVar;
        this.f93565n = aVar;
        this.f93566o = cVar;
        this.f93567p = bVar2;
        this.f93568q = bVar3;
        this.f93569r = aVar2;
        this.f93570s = tVar;
        this.f93571t = aVar3;
        this.f93572u = dVar;
        this.f93573v = bVar4;
        this.f93574w = bVar5;
        Object f10 = u10.f("id");
        if (f10 != null) {
            this.f93575x = (String) f10;
            this.f93576y = (Boolean) u10.f("useIdAsGroupParameter");
            Object f11 = u10.f("fallbackTitle");
            if (f11 != null) {
                this.f93577z = (String) f11;
                Object f12 = u10.f("type");
                if (f12 != null) {
                    String str = (String) f12;
                    this.f93553A = str;
                    this.f93554B = (String) u10.f("preAppliedFilters");
                    this.f93555C = (String) u10.f("includedProductNos");
                    this.f93556D = (String) u10.f("prioritiser");
                    this.f93557E = C17542s.e(str, C11687b.e.SEARCH_RESULTS.j());
                    C16505B<C16532g<M<o>>> a10 = C16521S.a(null);
                    this.f93558F = a10;
                    this.f93559G = C16534i.c(a10);
                    this.f93560H = C16521S.a(C16877v.n());
                    this.f93561I = C16521S.a(Boolean.FALSE);
                    C16505B<d> a11 = C16521S.a(null);
                    this.f93562J = a11;
                    this.f93563K = a11;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar6 : arrayList) {
                        if (str2 == null) {
                            String a12 = C11818a.a("Starting PLP with: id: " + this.f93575x + ", type: " + this.f93553A + ", fallbackTitle: " + this.f93577z, (Throwable) null);
                            if (a12 == null) {
                                break;
                            }
                            str2 = C11820c.a(a12);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = e.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar6.a(eVar, str5, false, (Throwable) null, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    f0();
                    a0();
                    Z();
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void T(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar : arrayList) {
            if (str5 == null) {
                String a10 = C11818a.a("Add to cart itemNo: " + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            String str7 = str5;
            if (str6 == null) {
                String name = e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str6;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
        }
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this, str4), (T) null, new b(this, str3, str4, (C17164e<? super b>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(dI.C17164e<? super un.C12068a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.ingka.ikea.browseandsearch.plp.impl.ui.e.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$d r0 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e.d) r0
            int r1 = r0.f93598i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f93598i = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$d r0 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$d
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f93596g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f93598i
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x004f
            if (r3 == r6) goto L_0x0043
            if (r3 != r5) goto L_0x003b
            int r9 = r0.f93595f
            java.lang.Object r2 = r0.f93594e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r2 = r0.f93593d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f93592c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r0 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r0
            XH.y.b(r1)
            goto L_0x0089
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0043:
            java.lang.Object r9 = r0.f93593d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f93592c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r3 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r3
            XH.y.b(r1)
            goto L_0x0066
        L_0x004f:
            XH.y.b(r1)
            pn.d r1 = r8.f93572u
            TJ.g r1 = r1.g()
            r0.f93592c = r8
            r0.f93593d = r9
            r0.f93598i = r6
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r3 = r8
        L_0x0066:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x006f
            boolean r6 = r1.booleanValue()
            goto L_0x0070
        L_0x006f:
            r6 = r4
        L_0x0070:
            pn.d r7 = r3.f93572u
            TJ.g r7 = r7.f()
            r0.f93592c = r3
            r0.f93593d = r9
            r0.f93594e = r1
            r0.f93595f = r6
            r0.f93598i = r5
            java.lang.Object r1 = TJ.C16534i.D(r7, r0)
            if (r1 != r2) goto L_0x0087
            return r2
        L_0x0087:
            r0 = r3
            r9 = r6
        L_0x0089:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0091
            boolean r4 = r1.booleanValue()
        L_0x0091:
            r1 = 0
            if (r9 == 0) goto L_0x00bb
            un.a$a r9 = new un.a$a
            sf.c r2 = r0.f93566o
            com.ingka.ikea.app.base.UserPostalCodeAddress r2 = r2.l()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = r2.d()
            if (r2 != 0) goto L_0x00a7
        L_0x00a6:
            r2 = r3
        L_0x00a7:
            sf.c r5 = r0.f93566o
            com.ingka.ikea.app.base.UserPostalCodeAddress r5 = r5.l()
            if (r5 == 0) goto L_0x00b7
            java.lang.String r5 = r5.c()
            if (r5 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r3 = r5
        L_0x00b7:
            r9.<init>(r2, r3)
            goto L_0x00bc
        L_0x00bb:
            r9 = r1
        L_0x00bc:
            if (r4 == 0) goto L_0x00ca
            FB.a r0 = r0.f93565n
            EB.d r0 = r0.c()
            if (r0 == 0) goto L_0x00ca
            java.lang.String r1 = r0.e()
        L_0x00ca:
            un.a r0 = new un.a
            r0.<init>(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.V(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final boolean W(String str) {
        String str2 = this.f93554B;
        return str2 != null && C15854t.d0(str2, str, false, 2, (Object) null);
    }

    private final void Z() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C2083e(this, new O(), (C17164e<? super C2083e>) null), 3, (Object) null);
    }

    private final void a0() {
        C16534i.M(C16534i.l(this.f93565n.b(), this.f93566o.d(), this.f93572u.f(), this.f93572u.g(), new f(this, (C17164e<? super f>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g0(dI.C17164e<? super XH.C16807N> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.ingka.ikea.browseandsearch.plp.impl.ui.e.i
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$i r2 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e.i) r2
            int r3 = r2.f93650m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f93650m = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$i r2 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$i
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f93648k
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f93650m
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x00a4
            if (r5 == r10) goto L_0x008a
            if (r5 == r8) goto L_0x006d
            if (r5 == r7) goto L_0x0050
            if (r5 != r6) goto L_0x0048
            java.lang.Object r1 = r2.f93643f
            pn.d r1 = (pn.C11764d) r1
            java.lang.Object r1 = r2.f93642e
            pn.d r1 = (pn.C11764d) r1
            java.lang.Object r1 = r2.f93641d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f93640c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r1 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r1
            XH.y.b(r3)
            goto L_0x0177
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            int r1 = r2.f93646i
            boolean r5 = r2.f93647j
            int r7 = r2.f93645h
            int r8 = r2.f93644g
            java.lang.Object r10 = r2.f93643f
            pn.d r10 = (pn.C11764d) r10
            java.lang.Object r11 = r2.f93642e
            pn.d r11 = (pn.C11764d) r11
            java.lang.Object r12 = r2.f93641d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f93640c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r13 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r13
            XH.y.b(r3)
            goto L_0x015a
        L_0x006d:
            int r1 = r2.f93646i
            boolean r5 = r2.f93647j
            int r8 = r2.f93645h
            int r11 = r2.f93644g
            java.lang.Object r12 = r2.f93643f
            pn.d r12 = (pn.C11764d) r12
            java.lang.Object r13 = r2.f93642e
            pn.d r13 = (pn.C11764d) r13
            java.lang.Object r14 = r2.f93641d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f93640c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r15 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r15
            XH.y.b(r3)
            goto L_0x0137
        L_0x008a:
            int r1 = r2.f93645h
            int r5 = r2.f93644g
            java.lang.Object r11 = r2.f93642e
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r11 = r2.f93641d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r2.f93640c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r12 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r12
            XH.y.b(r3)
            r16 = r5
            r5 = r1
            r1 = r11
            r11 = r16
            goto L_0x00f8
        L_0x00a4:
            XH.y.b(r3)
            FB.a r3 = r0.f93565n
            EB.d r3 = r3.c()
            r5 = 0
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = r3.getName()
            goto L_0x00b6
        L_0x00b5:
            r3 = r5
        L_0x00b6:
            java.lang.String r11 = ""
            if (r3 != 0) goto L_0x00bb
            r3 = r11
        L_0x00bb:
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00c3
            r3 = r10
            goto L_0x00c4
        L_0x00c3:
            r3 = r9
        L_0x00c4:
            sf.c r12 = r0.f93566o
            com.ingka.ikea.app.base.UserPostalCodeAddress r12 = r12.l()
            if (r12 == 0) goto L_0x00d0
            java.lang.String r5 = r12.d()
        L_0x00d0:
            if (r5 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r11 = r5
        L_0x00d4:
            int r5 = r11.length()
            if (r5 <= 0) goto L_0x00dc
            r5 = r10
            goto L_0x00dd
        L_0x00dc:
            r5 = r9
        L_0x00dd:
            pn.d r12 = r0.f93572u
            r2.f93640c = r0
            r2.f93641d = r1
            r2.f93642e = r11
            r2.f93644g = r3
            r2.f93645h = r5
            r2.f93650m = r10
            java.lang.Object r11 = r12.a(r2)
            if (r11 != r4) goto L_0x00f2
            return r4
        L_0x00f2:
            r12 = r0
            r16 = r11
            r11 = r3
            r3 = r16
        L_0x00f8:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0177
            TJ.B<java.lang.Boolean> r13 = r12.f93561I
            if (r11 != 0) goto L_0x0109
            if (r5 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r14 = r9
            goto L_0x010a
        L_0x0109:
            r14 = r10
        L_0x010a:
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)
            r13.setValue(r14)
            pn.d r13 = r12.f93572u
            if (r11 == 0) goto L_0x0117
            r14 = r10
            goto L_0x0118
        L_0x0117:
            r14 = r9
        L_0x0118:
            r2.f93640c = r12
            r2.f93641d = r1
            r2.f93642e = r13
            r2.f93643f = r13
            r2.f93644g = r11
            r2.f93645h = r5
            r2.f93647j = r3
            r2.f93646i = r9
            r2.f93650m = r8
            java.lang.Object r8 = r13.c(r14, r2)
            if (r8 != r4) goto L_0x0131
            return r4
        L_0x0131:
            r14 = r1
            r8 = r5
            r1 = r9
            r15 = r12
            r12 = r13
            r5 = r3
        L_0x0137:
            if (r8 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r10 = r9
        L_0x013b:
            r2.f93640c = r15
            r2.f93641d = r14
            r2.f93642e = r13
            r2.f93643f = r12
            r2.f93644g = r11
            r2.f93645h = r8
            r2.f93647j = r5
            r2.f93646i = r1
            r2.f93650m = r7
            java.lang.Object r3 = r12.d(r10, r2)
            if (r3 != r4) goto L_0x0154
            return r4
        L_0x0154:
            r7 = r8
            r8 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
        L_0x015a:
            if (r8 != 0) goto L_0x015e
            if (r7 == 0) goto L_0x0177
        L_0x015e:
            r2.f93640c = r13
            r2.f93641d = r12
            r2.f93642e = r11
            r2.f93643f = r10
            r2.f93644g = r8
            r2.f93645h = r7
            r2.f93647j = r5
            r2.f93646i = r1
            r2.f93650m = r6
            java.lang.Object r1 = r10.b(r9, r2)
            if (r1 != r4) goto L_0x0177
            return r4
        L_0x0177:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.g0(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(java.lang.String r10, java.lang.String r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.ingka.ikea.browseandsearch.plp.impl.ui.e.c
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$c r0 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e.c) r0
            int r1 = r0.f93591j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f93591j = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            com.ingka.ikea.browseandsearch.plp.impl.ui.e$c r0 = new com.ingka.ikea.browseandsearch.plp.impl.ui.e$c
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f93589h
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f93591j
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 != r2) goto L_0x0042
            java.lang.Object r10 = r5.f93588g
            TJ.B r10 = (TJ.C16505B) r10
            java.lang.Object r10 = r5.f93587f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r5.f93586e
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r5.f93585d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r5.f93584c
            com.ingka.ikea.browseandsearch.plp.impl.ui.e r12 = (com.ingka.ikea.browseandsearch.plp.impl.ui.e) r12
            XH.y.b(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0083
        L_0x0040:
            r11 = move-exception
            goto L_0x00ab
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            XH.y.b(r0)
            TJ.B<java.util.List<java.lang.String>> r0 = r9.f93560H
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = YH.C16877v.W0(r1, r10)
            r0.setValue(r1)
            Kf.b r1 = r9.f93568q     // Catch:{ all -> 0x00a9 }
            Kf.y r3 = new Kf.y     // Catch:{ all -> 0x00a9 }
            r3.<init>(r10, r2)     // Catch:{ all -> 0x00a9 }
            java.util.List r3 = YH.C16877v.e(r3)     // Catch:{ all -> 0x00a9 }
            com.ingka.ikea.analytics.Interaction$Component r4 = com.ingka.ikea.analytics.Interaction$Component.PRODUCT_LISTING     // Catch:{ all -> 0x00a9 }
            r5.f93584c = r9     // Catch:{ all -> 0x00a9 }
            r5.f93585d = r10     // Catch:{ all -> 0x00a9 }
            r5.f93586e = r11     // Catch:{ all -> 0x00a9 }
            r5.f93587f = r12     // Catch:{ all -> 0x00a9 }
            r5.f93588g = r0     // Catch:{ all -> 0x00a9 }
            r5.f93591j = r2     // Catch:{ all -> 0x00a9 }
            r12 = 0
            r6 = 4
            r7 = 0
            r2 = r3
            r3 = r4
            r4 = r12
            java.lang.Object r12 = Kf.C9133b.C1020b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
            if (r12 != r8) goto L_0x0082
            return r8
        L_0x0082:
            r12 = r9
        L_0x0083:
            TJ.B<com.ingka.ikea.browseandsearch.plp.impl.ui.d> r0 = r12.f93562J     // Catch:{ all -> 0x0040 }
            com.ingka.ikea.browseandsearch.plp.impl.ui.d$b r1 = new com.ingka.ikea.browseandsearch.plp.impl.ui.d$b     // Catch:{ all -> 0x0040 }
            int r2 = Oo.b.f84477Q     // Catch:{ all -> 0x0040 }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0040 }
            IC.e r11 = IC.C13026h.b(r2, r11)     // Catch:{ all -> 0x0040 }
            r1.<init>(r11)     // Catch:{ all -> 0x0040 }
            r0.setValue(r1)     // Catch:{ all -> 0x0040 }
            TJ.B<java.util.List<java.lang.String>> r11 = r12.f93560H
            java.lang.Object r12 = r11.getValue()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r10 = YH.C16877v.S0(r12, r10)
            r11.setValue(r10)
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00a9:
            r11 = move-exception
            r12 = r9
        L_0x00ab:
            TJ.B<java.util.List<java.lang.String>> r12 = r12.f93560H
            java.lang.Object r0 = r12.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r10 = YH.C16877v.S0(r0, r10)
            r12.setValue(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.e.U(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public final C16505B<Boolean> X() {
        return this.f93561I;
    }

    public final boolean Y() {
        return this.f93557E;
    }

    public final void b0(f fVar) {
        d value;
        vn.g gVar;
        C17542s.j(fVar, "action");
        if (fVar instanceof f.b) {
            f.b bVar = (f.b) fVar;
            this.f93569r.p(bVar.a(), bVar.b());
            this.f93564m.a(bVar.a(), bVar.b());
        } else if (fVar instanceof f.C2086f) {
            f.C2086f fVar2 = (f.C2086f) fVar;
            this.f93569r.k(fVar2.a());
            this.f93564m.c(fVar2.a());
        } else if (C17542s.e(fVar, f.d.f93655a)) {
            this.f93569r.l();
            this.f93564m.b();
        } else if (fVar instanceof f.c) {
            f.c cVar = (f.c) fVar;
            int a10 = cVar.a();
            if (a10 == 0) {
                gVar = vn.g.MULTI;
            } else if (a10 != 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid index: " + cVar.a());
                qv.e eVar = qv.e.ERROR;
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
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = e.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, illegalArgumentException, str3);
                    str = str3;
                    str2 = str4;
                }
                gVar = vn.g.MULTI;
            } else {
                gVar = vn.g.SINGLE;
            }
            this.f93569r.r(gVar);
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, gVar, (C17164e<? super g>) null), 3, (Object) null);
        } else if (C17542s.e(fVar, f.g.f93658a)) {
            this.f93573v.a(C10240a.ShowPlpSwipeImageNudge, false);
        } else if (C17542s.e(fVar, f.a.f93651a)) {
            this.f93561I.setValue(Boolean.FALSE);
        } else if (fVar instanceof f.h) {
            this.f93569r.d(((f.h) fVar).a());
        } else if (fVar instanceof f.e) {
            C16505B<d> b10 = this.f93562J;
            do {
                value = b10.getValue();
                d dVar = value;
            } while (!b10.e(value, new d.c(((f.e) fVar).a())));
        } else {
            throw new XH.t();
        }
    }

    public final void c0(e2 e2Var) {
        C17542s.j(e2Var, "plpScreenUiEvent");
        if (e2Var instanceof e2.a) {
            this.f93569r.n();
        } else if (e2Var instanceof e2.c) {
            this.f93569r.o(((e2.c) e2Var).a());
        } else if (e2Var instanceof e2.k) {
            e2.k kVar = (e2.k) e2Var;
            this.f93569r.f(this.f93575x, kVar.c(), kVar.a());
        } else if (e2Var instanceof e2.h) {
            e2.h hVar = (e2.h) e2Var;
            this.f93569r.q(hVar.b(), hVar.a(), this.f93553A);
        } else if (e2Var instanceof e2.d) {
            this.f93569r.b(((e2.d) e2Var).a());
        } else if (e2Var instanceof e2.b) {
            this.f93569r.c(((e2.b) e2Var).a().getId());
        } else if (e2Var instanceof e2.e) {
            e2.e eVar = (e2.e) e2Var;
            this.f93569r.m(eVar.a().b(), this.f93575x, eVar.b(), eVar.a().d());
        } else if (e2Var instanceof e2.f) {
            this.f93569r.g(((e2.f) e2Var).a(), this.f93575x);
        } else if (!(e2Var instanceof e2.j) && !(e2Var instanceof e2.i) && !(e2Var instanceof e2.g)) {
            throw new XH.t();
        }
    }

    public final void d0(c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (c1Var instanceof c1.a) {
            c1.a aVar = (c1.a) c1Var;
            T(aVar.b(), aVar.c());
        } else if (c1Var instanceof c1.e) {
            this.f93569r.i(((c1.e) c1Var).a(), Interaction$Component.PRODUCT_LISTING);
        } else if (c1Var instanceof c1.b) {
            this.f93569r.a();
        } else if (!(c1Var instanceof c1.c) && !(c1Var instanceof c1.d) && !(c1Var instanceof c1.f)) {
            throw new XH.t();
        }
    }

    public final void e0() {
        this.f93562J.setValue(null);
    }

    public final void f0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }

    public final void h0(int i10) {
    }

    public final C16519P<C16532g<M<o>>> m() {
        return this.f93559G;
    }

    public final C16519P<d> y() {
        return this.f93563K;
    }
}
