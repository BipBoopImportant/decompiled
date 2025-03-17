package fk;

import BA.C12609a;
import CA.C12682a;
import FA.C12859a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Op.B0;
import Op.a1;
import Op.b1;
import QA.C13352d;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.sharedlist.impl.navigation.SharedListRoutes$SharedList;
import com.ingka.ikea.core.model.product.ProductItem;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fk.C11270b;
import fk.c;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sp.C11879a;
import x4.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 [2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\\B[\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH@¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020 2\u0006\u0010+\u001a\u00020\u001bH@¢\u0006\u0004\b,\u0010*J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010%J\u0017\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040R8\u0016X\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lfk/d;", "Landroidx/lifecycle/f0;", "Lsp/a;", "Lfk/b;", "Lfk/c;", "Landroidx/lifecycle/U;", "savedStateHandle", "LQA/d;", "shoppingListNavigation", "LBx/a;", "loginPromotionNavigation", "LBA/a;", "shareRepository", "LAx/c;", "productRemoteDataSource", "LjB/b;", "shoppingListRepository", "LCA/a;", "shareAnalytics", "LIl/d;", "marketConfigRepository", "LaA/a;", "sessionManager", "LQJ/M;", "defaultDispatcher", "<init>", "(Landroidx/lifecycle/U;LQA/d;LBx/a;LBA/a;LAx/c;LjB/b;LCA/a;LIl/d;LaA/a;LQJ/M;)V", "", "defaultName", "LXH/N;", "h", "(Ljava/lang/String;)V", "LFA/a;", "sharedList", "i", "(LFA/a;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "N", "()V", "M", "(Ljava/lang/String;LFA/a;LdI/e;)Ljava/lang/Object;", "listName", "L", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "listId", "P", "O", "(LFA/a;LdI/e;)Ljava/lang/Object;", "S", "T", "action", "U", "(Lfk/b;)V", "m", "LQA/d;", "R", "()LQA/d;", "n", "LBx/a;", "Q", "()LBx/a;", "o", "LBA/a;", "p", "LAx/c;", "q", "LjB/b;", "r", "LCA/a;", "s", "LIl/d;", "t", "LaA/a;", "u", "LQJ/M;", "Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList;", "v", "Lcom/ingka/ikea/app/sharedlist/impl/navigation/SharedListRoutes$SharedList;", "route", "LTJ/B;", "w", "LTJ/B;", "_state", "LTJ/P;", "x", "LTJ/P;", "getState", "()LTJ/P;", "state", "y", "LFA/a;", "sharedListHolder", "z", "a", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 implements C11879a<C11270b, c> {

    /* renamed from: A  reason: collision with root package name */
    public static final int f97289A = 8;

    /* renamed from: z  reason: collision with root package name */
    public static final a f97290z = new a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private final C13352d f97291m;

    /* renamed from: n  reason: collision with root package name */
    private final Bx.a f97292n;

    /* renamed from: o  reason: collision with root package name */
    private final C12609a f97293o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Ax.c f97294p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C14613b f97295q;

    /* renamed from: r  reason: collision with root package name */
    private final C12682a f97296r;

    /* renamed from: s  reason: collision with root package name */
    private final Il.d f97297s;

    /* renamed from: t  reason: collision with root package name */
    private final C13909a f97298t;

    /* renamed from: u  reason: collision with root package name */
    private final M f97299u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final SharedListRoutes$SharedList f97300v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16505B<c> f97301w;

    /* renamed from: x  reason: collision with root package name */
    private final C16519P<c> f97302x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public C12859a f97303y;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfk/d$a;", "", "<init>", "()V", "", "ACCEPT_LIST_DELAY_IN_MILLIS", "J", "", "MAX_NUMBER_RETRIES_CREATE_LIST_DUPLICATED_NAME", "I", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoggedIn", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel$acceptList$2", f = "SharedListViewModel.kt", l = {94}, m = "invokeSuspend")
    static final class b extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97304c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f97305d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f97306e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f97307f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f97306e = dVar;
            this.f97307f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f97306e, this.f97307f, eVar);
            bVar.f97305d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f97304c;
            if (i10 == 0) {
                y.b(obj);
                boolean z10 = this.f97305d;
                if (z10) {
                    d dVar = this.f97306e;
                    C12859a G10 = dVar.f97303y;
                    if (G10 != null) {
                        String str = this.f97307f;
                        this.f97305d = z10;
                        this.f97304c = 1;
                        if (dVar.i(G10, str, this) == f10) {
                            return f10;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    C16505B I10 = this.f97306e.f97301w;
                    do {
                        value = I10.getValue();
                    } while (!I10.e(value, c.b((c) value, false, (C13023e) null, (List) null, false, false, c.a.C2163a.f97285a, 31, (Object) null)));
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel$acceptList$3", f = "SharedListViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<C16533h<? super Boolean>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97308c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f97309d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f97310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f97311f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f97311f = dVar;
        }

        public final Object invoke(C16533h<? super Boolean> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f97311f, eVar);
            cVar.f97309d = hVar;
            cVar.f97310e = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f97308c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f97309d;
                Throwable th2 = (Throwable) this.f97310e;
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
                        String a10 = C11818a.a("Could not add items to a new list", th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, th2, str3);
                    str = str3;
                    str2 = str4;
                }
                C16505B I10 = this.f97311f.f97301w;
                do {
                    value = I10.getValue();
                } while (!I10.e(value, c.b((c) value, false, (C13023e) null, (List) null, false, false, c.a.b.f97286a, 31, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel", f = "SharedListViewModel.kt", l = {120}, m = "acceptListInternal")
    /* renamed from: fk.d$d  reason: collision with other inner class name */
    static final class C2165d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f97312c;

        /* renamed from: d  reason: collision with root package name */
        Object f97313d;

        /* renamed from: e  reason: collision with root package name */
        Object f97314e;

        /* renamed from: f  reason: collision with root package name */
        Object f97315f;

        /* renamed from: g  reason: collision with root package name */
        Object f97316g;

        /* renamed from: h  reason: collision with root package name */
        Object f97317h;

        /* renamed from: i  reason: collision with root package name */
        Object f97318i;

        /* renamed from: j  reason: collision with root package name */
        Object f97319j;

        /* renamed from: k  reason: collision with root package name */
        Object f97320k;

        /* renamed from: l  reason: collision with root package name */
        Object f97321l;

        /* renamed from: m  reason: collision with root package name */
        Object f97322m;

        /* renamed from: n  reason: collision with root package name */
        Object f97323n;

        /* renamed from: o  reason: collision with root package name */
        int f97324o;

        /* renamed from: p  reason: collision with root package name */
        int f97325p;

        /* renamed from: q  reason: collision with root package name */
        int f97326q;

        /* renamed from: r  reason: collision with root package name */
        int f97327r;

        /* renamed from: s  reason: collision with root package name */
        int f97328s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f97329t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ d f97330u;

        /* renamed from: v  reason: collision with root package name */
        int f97331v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2165d(d dVar, C17164e<? super C2165d> eVar) {
            super(eVar);
            this.f97330u = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97329t = obj;
            this.f97331v |= Integer.MIN_VALUE;
            return this.f97330u.i((C12859a) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel", f = "SharedListViewModel.kt", l = {197}, m = "createList")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f97332c;

        /* renamed from: d  reason: collision with root package name */
        Object f97333d;

        /* renamed from: e  reason: collision with root package name */
        Object f97334e;

        /* renamed from: f  reason: collision with root package name */
        Object f97335f;

        /* renamed from: g  reason: collision with root package name */
        Object f97336g;

        /* renamed from: h  reason: collision with root package name */
        Object f97337h;

        /* renamed from: i  reason: collision with root package name */
        Object f97338i;

        /* renamed from: j  reason: collision with root package name */
        int f97339j;

        /* renamed from: k  reason: collision with root package name */
        int f97340k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f97341l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f97342m;

        /* renamed from: n  reason: collision with root package name */
        int f97343n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f97342m = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97341l = obj;
            this.f97343n |= Integer.MIN_VALUE;
            return this.f97342m.L((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel$createListAndAddItems$2", f = "SharedListViewModel.kt", l = {167, 187}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f97344c;

        /* renamed from: d  reason: collision with root package name */
        Object f97345d;

        /* renamed from: e  reason: collision with root package name */
        Object f97346e;

        /* renamed from: f  reason: collision with root package name */
        Object f97347f;

        /* renamed from: g  reason: collision with root package name */
        Object f97348g;

        /* renamed from: h  reason: collision with root package name */
        Object f97349h;

        /* renamed from: i  reason: collision with root package name */
        Object f97350i;

        /* renamed from: j  reason: collision with root package name */
        Object f97351j;

        /* renamed from: k  reason: collision with root package name */
        Object f97352k;

        /* renamed from: l  reason: collision with root package name */
        Object f97353l;

        /* renamed from: m  reason: collision with root package name */
        Object f97354m;

        /* renamed from: n  reason: collision with root package name */
        int f97355n;

        /* renamed from: o  reason: collision with root package name */
        int f97356o;

        /* renamed from: p  reason: collision with root package name */
        int f97357p;

        /* renamed from: q  reason: collision with root package name */
        int f97358q;

        /* renamed from: r  reason: collision with root package name */
        int f97359r;

        /* renamed from: s  reason: collision with root package name */
        int f97360s;

        /* renamed from: t  reason: collision with root package name */
        private /* synthetic */ Object f97361t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ d f97362u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ C12859a f97363v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ String f97364w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C12859a aVar, String str, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f97362u = dVar;
            this.f97363v = aVar;
            this.f97364w = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f97362u, this.f97363v, this.f97364w, eVar);
            fVar.f97361t = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: QJ.Q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: fk.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: QJ.Q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: qv.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: fk.d} */
        /* JADX WARNING: type inference failed for: r10v12, types: [java.util.Collection, java.lang.Iterable, java.util.ArrayList] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0261 A[RETURN] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                r28 = this;
                r0 = r28
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f97360s
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r10 = 1
                r11 = 0
                r12 = 2
                if (r2 == 0) goto L_0x0070
                if (r2 == r10) goto L_0x0054
                if (r2 != r12) goto L_0x004c
                java.lang.Object r1 = r0.f97353l
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f97352k
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f97351j
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f97350i
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f97349h
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f97348g
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f97347f
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f97346e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f97345d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r0.f97344c
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r0.f97361t
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r29)
                goto L_0x03bc
            L_0x004c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0054:
                java.lang.Object r2 = r0.f97346e
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r0.f97345d
                FA.a r2 = (FA.C12859a) r2
                java.lang.Object r2 = r0.f97344c
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r14 = r0.f97361t
                QJ.Q r14 = (QJ.Q) r14
                XH.y.b(r29)
                r8 = r2
                r24 = r4
                r25 = r5
                r2 = r29
                goto L_0x0262
            L_0x0070:
                XH.y.b(r29)
                java.lang.Object r2 = r0.f97361t
                r14 = r2
                QJ.Q r14 = (QJ.Q) r14
                fk.d r2 = r0.f97362u
                qv.e r15 = qv.e.DEBUG
                qv.d r16 = qv.d.f102012a
                java.util.List r16 = r16.a()
                java.lang.Iterable r16 = (java.lang.Iterable) r16
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r16 = r16.iterator()
            L_0x008d:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x00a4
                java.lang.Object r8 = r16.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r11)
                if (r9 == 0) goto L_0x008d
                r10.add(r8)
                goto L_0x008d
            L_0x00a4:
                java.util.Iterator r8 = r10.iterator()
                r9 = 0
                r16 = 0
            L_0x00ab:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x00d5
                java.lang.Object r17 = r8.next()
                qv.b r17 = (qv.C11819b) r17
                r11 = 0
                if (r9 != 0) goto L_0x00e0
                FA.a r9 = r2.f97303y
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "createListAndAddItems, list: "
                r12.append(r13)
                r12.append(r9)
                java.lang.String r9 = r12.toString()
                java.lang.String r9 = qv.C11818a.a(r9, r11)
                if (r9 != 0) goto L_0x00dc
            L_0x00d5:
                r23 = r2
                r24 = r4
                r4 = r15
                goto L_0x0153
            L_0x00dc:
                java.lang.String r9 = qv.C11820c.a(r9)
            L_0x00e0:
                if (r16 != 0) goto L_0x0132
                java.lang.Class r12 = r14.getClass()
                java.lang.String r12 = r12.getName()
                kotlin.jvm.internal.C17542s.g(r12)
                r23 = r2
                r24 = r4
                r2 = 0
                r11 = 2
                r13 = 36
                java.lang.String r4 = HJ.C15854t.s1(r12, r13, r2, r11, r2)
                r13 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r13, r2, r11, r2)
                int r2 = r4.length()
                if (r2 != 0) goto L_0x0106
                goto L_0x010a
            L_0x0106:
                java.lang.String r12 = HJ.C15854t.P0(r4, r7)
            L_0x010a:
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r4 = 1
                boolean r2 = HJ.C15854t.b0(r2, r6, r4)
                if (r2 == 0) goto L_0x011b
                r2 = r5
                goto L_0x011d
            L_0x011b:
                r2 = r24
            L_0x011d:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r3)
                r4.append(r12)
                java.lang.String r16 = r4.toString()
            L_0x012f:
                r2 = r16
                goto L_0x0137
            L_0x0132:
                r23 = r2
                r24 = r4
                goto L_0x012f
            L_0x0137:
                r18 = 0
                r4 = r15
                r15 = r17
                r16 = r4
                r17 = r2
                r11 = 0
                r19 = r11
                r20 = r9
                r15.a(r16, r17, r18, r19, r20)
                r16 = r2
                r15 = r4
                r2 = r23
                r4 = r24
                r11 = 0
                r12 = 2
                goto L_0x00ab
            L_0x0153:
                fk.d r2 = r0.f97362u
                FA.a r2 = r2.f97303y
                if (r2 == 0) goto L_0x016a
                java.lang.String r8 = r2.b()
                if (r8 != 0) goto L_0x0162
                goto L_0x016b
            L_0x0162:
                r15 = r4
                r25 = r5
                r5 = r8
                r4 = r23
                goto L_0x0248
            L_0x016a:
                r8 = 0
            L_0x016b:
                java.lang.String r4 = r0.f97364w
                qv.e r9 = qv.e.WARN
                qv.d r10 = qv.d.f102012a
                java.util.List r10 = r10.a()
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r10 = r10.iterator()
            L_0x0180:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x0198
                java.lang.Object r12 = r10.next()
                r13 = r12
                qv.b r13 = (qv.C11819b) r13
                r15 = 0
                boolean r13 = r13.b(r9, r15)
                if (r13 == 0) goto L_0x0180
                r11.add(r12)
                goto L_0x0180
            L_0x0198:
                java.util.Iterator r10 = r11.iterator()
                r11 = 0
                r12 = 0
            L_0x019e:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x01c5
                java.lang.Object r13 = r10.next()
                r15 = r13
                qv.b r15 = (qv.C11819b) r15
                if (r12 != 0) goto L_0x01d1
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "listName is null, will default to "
                r12.append(r13)
                r12.append(r4)
                java.lang.String r12 = r12.toString()
                r13 = 0
                java.lang.String r12 = qv.C11818a.a(r12, r13)
                if (r12 != 0) goto L_0x01cd
            L_0x01c5:
                r23 = r4
                r25 = r5
                r26 = r8
                goto L_0x0241
            L_0x01cd:
                java.lang.String r12 = qv.C11820c.a(r12)
            L_0x01d1:
                if (r11 != 0) goto L_0x0225
                java.lang.Class r11 = r14.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                r23 = r4
                r25 = r5
                r26 = r8
                r4 = 2
                r5 = 0
                r13 = 36
                java.lang.String r8 = HJ.C15854t.s1(r11, r13, r5, r4, r5)
                r13 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r13, r5, r4, r5)
                int r4 = r8.length()
                if (r4 != 0) goto L_0x01f9
                goto L_0x01fd
            L_0x01f9:
                java.lang.String r11 = HJ.C15854t.P0(r8, r7)
            L_0x01fd:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r5 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r5)
                if (r4 == 0) goto L_0x020f
                r4 = r25
                goto L_0x0211
            L_0x020f:
                r4 = r24
            L_0x0211:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                r5.append(r3)
                r5.append(r11)
                java.lang.String r4 = r5.toString()
                r11 = r4
                goto L_0x022b
            L_0x0225:
                r23 = r4
                r25 = r5
                r26 = r8
            L_0x022b:
                r18 = 0
                r16 = r9
                r17 = r11
                r4 = 0
                r19 = r4
                r20 = r12
                r15.a(r16, r17, r18, r19, r20)
                r4 = r23
                r5 = r25
                r8 = r26
                goto L_0x019e
            L_0x0241:
                r10 = r14
                r15 = r10
                r4 = r23
                r8 = r4
                r5 = r26
            L_0x0248:
                fk.d r9 = r0.f97362u
                r0.f97361t = r14
                r0.f97344c = r8
                r0.f97345d = r2
                r0.f97346e = r5
                r0.f97347f = r4
                r0.f97348g = r15
                r0.f97349h = r10
                r2 = 1
                r0.f97360s = r2
                java.lang.Object r2 = r9.L(r8, r0)
                if (r2 != r1) goto L_0x0262
                return r1
            L_0x0262:
                java.lang.String r2 = (java.lang.String) r2
                FA.a r4 = r0.f97363v
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r9 = 10
                int r9 = YH.C16877v.y(r4, r9)
                r5.<init>(r9)
                java.util.Iterator r4 = r4.iterator()
            L_0x027b:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0298
                java.lang.Object r9 = r4.next()
                FA.a$a r9 = (FA.C12859a.C2618a) r9
                jB.b$b r10 = new jB.b$b
                java.lang.String r11 = r9.a()
                int r9 = r9.c()
                r10.<init>(r11, r9)
                r5.add(r10)
                goto L_0x027b
            L_0x0298:
                fk.d r4 = r0.f97362u
                jB.b r4 = r4.f97295q
                com.ingka.ikea.analytics.Interaction$Component r9 = com.ingka.ikea.analytics.Interaction$Component.SHARED_LIST
                Ae.k r10 = Ae.k.BUTTON
                r4.j(r2, r5, r9, r10)
                fk.d r4 = r0.f97362u
                jB.b r4 = r4.f97295q
                r4.s(r2)
                qv.e r4 = qv.e.DEBUG
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x02c1:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x02d9
                java.lang.Object r11 = r9.next()
                r12 = r11
                qv.b r12 = (qv.C11819b) r12
                r13 = 0
                boolean r12 = r12.b(r4, r13)
                if (r12 == 0) goto L_0x02c1
                r10.add(r11)
                goto L_0x02c1
            L_0x02d9:
                java.util.Iterator r9 = r10.iterator()
                r13 = r10
                r11 = 0
                r12 = 0
            L_0x02e0:
                boolean r15 = r9.hasNext()
                if (r15 == 0) goto L_0x0382
                java.lang.Object r13 = r9.next()
                r15 = r13
                qv.b r15 = (qv.C11819b) r15
                r29 = r13
                r13 = 0
                r23 = r1
                if (r11 != 0) goto L_0x0309
                java.lang.String r1 = "Delaying a short while..."
                java.lang.String r1 = qv.C11818a.a(r1, r13)
                if (r1 != 0) goto L_0x0304
                r13 = r29
            L_0x02fe:
                r21 = r9
                r22 = r10
                goto L_0x0386
            L_0x0304:
                java.lang.String r1 = qv.C11820c.a(r1)
                r11 = r1
            L_0x0309:
                if (r12 != 0) goto L_0x0363
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getName()
                kotlin.jvm.internal.C17542s.g(r1)
                r21 = r9
                r22 = r10
                r9 = 0
                r12 = 36
                r13 = 2
                java.lang.String r10 = HJ.C15854t.s1(r1, r12, r9, r13, r9)
                r16 = r1
                r1 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r1, r9, r13, r9)
                int r13 = r10.length()
                if (r13 != 0) goto L_0x0333
                r10 = r16
                goto L_0x0337
            L_0x0333:
                java.lang.String r10 = HJ.C15854t.P0(r10, r7)
            L_0x0337:
                java.lang.Thread r13 = java.lang.Thread.currentThread()
                java.lang.String r13 = r13.getName()
                r1 = 1
                boolean r13 = HJ.C15854t.b0(r13, r6, r1)
                if (r13 == 0) goto L_0x0349
                r13 = r25
                goto L_0x034b
            L_0x0349:
                r13 = r24
            L_0x034b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r13)
                r1.append(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                r27 = r12
                r12 = r1
                r1 = r27
                goto L_0x036a
            L_0x0363:
                r21 = r9
                r22 = r10
                r1 = 36
                r9 = 0
            L_0x036a:
                r18 = 0
                r16 = r4
                r17 = r12
                r10 = 0
                r19 = r10
                r20 = r11
                r15.a(r16, r17, r18, r19, r20)
                r13 = r29
                r9 = r21
                r10 = r22
                r1 = r23
                goto L_0x02e0
            L_0x0382:
                r23 = r1
                goto L_0x02fe
            L_0x0386:
                r0.f97361t = r14
                r0.f97344c = r8
                r0.f97345d = r2
                r0.f97346e = r5
                r0.f97347f = r14
                r0.f97348g = r14
                r0.f97349h = r4
                r0.f97350i = r11
                r0.f97351j = r12
                r1 = r22
                r0.f97352k = r1
                r1 = r21
                r0.f97353l = r1
                r0.f97354m = r13
                r1 = 0
                r0.f97355n = r1
                r0.f97356o = r1
                r0.f97357p = r1
                r0.f97358q = r1
                r0.f97359r = r1
                r1 = 2
                r0.f97360s = r1
                r3 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r1 = QJ.C16297b0.b(r3, r0)
                r3 = r23
                if (r1 != r3) goto L_0x03bb
                return r3
            L_0x03bb:
                r1 = r2
            L_0x03bc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fk.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"fk/d$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f97365a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(N.a aVar, d dVar) {
            super(aVar);
            this.f97365a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            d dVar = this.f97365a;
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
                    String a10 = C11818a.a("Unable to fetch shared list data or the products", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = dVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f97365a.S();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel$fetch$3", f = "SharedListViewModel.kt", l = {144, 153}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f97366c;

        /* renamed from: d  reason: collision with root package name */
        Object f97367d;

        /* renamed from: e  reason: collision with root package name */
        Object f97368e;

        /* renamed from: f  reason: collision with root package name */
        Object f97369f;

        /* renamed from: g  reason: collision with root package name */
        Object f97370g;

        /* renamed from: h  reason: collision with root package name */
        Object f97371h;

        /* renamed from: i  reason: collision with root package name */
        Object f97372i;

        /* renamed from: j  reason: collision with root package name */
        Object f97373j;

        /* renamed from: k  reason: collision with root package name */
        Object f97374k;

        /* renamed from: l  reason: collision with root package name */
        Object f97375l;

        /* renamed from: m  reason: collision with root package name */
        Object f97376m;

        /* renamed from: n  reason: collision with root package name */
        Object f97377n;

        /* renamed from: o  reason: collision with root package name */
        int f97378o;

        /* renamed from: p  reason: collision with root package name */
        int f97379p;

        /* renamed from: q  reason: collision with root package name */
        int f97380q;

        /* renamed from: r  reason: collision with root package name */
        int f97381r;

        /* renamed from: s  reason: collision with root package name */
        int f97382s;

        /* renamed from: t  reason: collision with root package name */
        int f97383t;

        /* renamed from: u  reason: collision with root package name */
        private /* synthetic */ Object f97384u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ d f97385v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f97385v = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f97385v, eVar);
            hVar.f97384u = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            d dVar;
            boolean z10;
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f97383t;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f97384u;
                dVar = this.f97385v;
                String a10 = dVar.f97300v.a();
                this.f97384u = q10;
                this.f97366c = dVar;
                this.f97383t = 1;
                obj2 = dVar.P(a10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                dVar = (d) this.f97366c;
                q10 = (Q) this.f97384u;
                y.b(obj);
                obj2 = obj;
            } else if (i10 == 2) {
                d dVar2 = (d) this.f97376m;
                Iterator it = (Iterator) this.f97374k;
                Iterable iterable = (Iterable) this.f97373j;
                String str2 = (String) this.f97372i;
                String str3 = (String) this.f97371h;
                qv.e eVar = (qv.e) this.f97370g;
                Q q11 = (Q) this.f97369f;
                Collection collection = (Collection) this.f97368e;
                List list = (List) this.f97367d;
                C12859a aVar = (C12859a) this.f97366c;
                Q q12 = (Q) this.f97384u;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar.f97303y = (C12859a) obj2;
            C12859a G10 = this.f97385v.f97303y;
            List<C12859a.C2618a> a11 = G10 != null ? G10.a() : null;
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            Object obj3 = arrayList;
            String str4 = null;
            String str5 = null;
            while (it2.hasNext()) {
                obj3 = it2.next();
                C11819b bVar = (C11819b) obj3;
                if (str4 == null) {
                    String a12 = C11818a.a("Fetch product information, number of items: " + (a11 != null ? kotlin.coroutines.jvm.internal.b.e(a11.size()) : null), (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str4 = C11820c.a(a12);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = q10.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    z10 = true;
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    z10 = true;
                    str = str5;
                }
                bVar.a(eVar2, str, false, (Throwable) null, str6);
                str5 = str;
                eVar2 = eVar2;
                str4 = str6;
                it2 = it2;
                arrayList = arrayList;
                boolean z11 = z10;
                f10 = f10;
            }
            Object obj4 = f10;
            Iterator it3 = it2;
            ArrayList arrayList2 = arrayList;
            qv.e eVar3 = eVar2;
            Object obj5 = obj3;
            Collection collection2 = a11;
            if (collection2 == null || collection2.isEmpty()) {
                this.f97385v.S();
                return C16807N.f139792a;
            }
            d dVar3 = this.f97385v;
            this.f97384u = q10;
            this.f97366c = G10;
            this.f97367d = a11;
            this.f97368e = collection2;
            this.f97369f = q10;
            this.f97370g = eVar3;
            this.f97371h = str4;
            this.f97372i = str5;
            this.f97373j = arrayList2;
            this.f97374k = it3;
            this.f97375l = obj5;
            this.f97376m = dVar;
            this.f97377n = obj2;
            this.f97378o = 0;
            this.f97379p = 0;
            this.f97380q = 0;
            this.f97381r = 0;
            this.f97382s = 0;
            this.f97383t = 2;
            Object obj6 = obj4;
            if (dVar3.O(G10, this) == obj6) {
                return obj6;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel", f = "SharedListViewModel.kt", l = {221, 223}, m = "fetchProducts")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f97386c;

        /* renamed from: d  reason: collision with root package name */
        Object f97387d;

        /* renamed from: e  reason: collision with root package name */
        Object f97388e;

        /* renamed from: f  reason: collision with root package name */
        Object f97389f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f97390g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f97391h;

        /* renamed from: i  reason: collision with root package name */
        int f97392i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f97391h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97390g = obj;
            this.f97392i |= Integer.MIN_VALUE;
            return this.f97391h.O((C12859a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LOp/a1;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel$fetchProducts$products$1", f = "SharedListViewModel.kt", l = {224}, m = "invokeSuspend")
    static final class j extends l implements p<Q, C17164e<? super List<? extends a1>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f97393c;

        /* renamed from: d  reason: collision with root package name */
        Object f97394d;

        /* renamed from: e  reason: collision with root package name */
        Object f97395e;

        /* renamed from: f  reason: collision with root package name */
        Object f97396f;

        /* renamed from: g  reason: collision with root package name */
        Object f97397g;

        /* renamed from: h  reason: collision with root package name */
        Object f97398h;

        /* renamed from: i  reason: collision with root package name */
        int f97399i;

        /* renamed from: j  reason: collision with root package name */
        int f97400j;

        /* renamed from: k  reason: collision with root package name */
        int f97401k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f97402l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f97403m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C12859a f97404n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Rl.e f97405o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar, C12859a aVar, Rl.e eVar, C17164e<? super j> eVar2) {
            super(2, eVar2);
            this.f97403m = dVar;
            this.f97404n = aVar;
            this.f97405o = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f97403m, this.f97404n, this.f97405o, eVar);
            jVar.f97402l = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super List<a1>> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f97401k;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f97402l;
                Ax.c E10 = this.f97403m.f97294p;
                Iterable a10 = this.f97404n.a();
                ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                Iterator it = a10.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12859a.C2618a) it.next()).a());
                }
                this.f97402l = q11;
                this.f97393c = a10;
                this.f97394d = a10;
                this.f97395e = arrayList;
                this.f97396f = it;
                this.f97397g = E10;
                this.f97398h = arrayList;
                this.f97399i = 0;
                this.f97400j = 0;
                this.f97401k = 1;
                obj2 = E10.e(arrayList, this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                List list = (List) this.f97398h;
                Ax.c cVar = (Ax.c) this.f97397g;
                Iterator it2 = (Iterator) this.f97396f;
                Collection collection = (Collection) this.f97395e;
                Iterable iterable = (Iterable) this.f97394d;
                Iterable iterable2 = (Iterable) this.f97393c;
                q10 = (Q) this.f97402l;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) obj2;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a11 = C11818a.a("Products fetched: " + list2, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = q10.getClass().getName();
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
            Iterable<ProductItem> iterable3 = list2;
            C12859a aVar = this.f97404n;
            Rl.e eVar2 = this.f97405o;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable3, 10));
            for (ProductItem productItem : iterable3) {
                Iterator it3 = aVar.a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (C17542s.e(((C12859a.C2618a) obj3).a(), productItem.f())) {
                        break;
                    }
                }
                C12859a.C2618a aVar2 = (C12859a.C2618a) obj3;
                arrayList3.add(new a1((a1.a) null, B0.h(productItem, eVar2.c(), false, false, false, false, 28, (Object) null), eVar2.c(), new b1.c(C13026h.b(Oo.b.f84585a7, kotlin.coroutines.jvm.internal.b.e(aVar2 != null ? aVar2.c() : 1))), false, false, eVar2.g()));
            }
            return arrayList3;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.SharedListViewModel", f = "SharedListViewModel.kt", l = {215}, m = "fetchSharedList")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f97406c;

        /* renamed from: d  reason: collision with root package name */
        Object f97407d;

        /* renamed from: e  reason: collision with root package name */
        Object f97408e;

        /* renamed from: f  reason: collision with root package name */
        Object f97409f;

        /* renamed from: g  reason: collision with root package name */
        Object f97410g;

        /* renamed from: h  reason: collision with root package name */
        Object f97411h;

        /* renamed from: i  reason: collision with root package name */
        Object f97412i;

        /* renamed from: j  reason: collision with root package name */
        Object f97413j;

        /* renamed from: k  reason: collision with root package name */
        Object f97414k;

        /* renamed from: l  reason: collision with root package name */
        Object f97415l;

        /* renamed from: m  reason: collision with root package name */
        Object f97416m;

        /* renamed from: n  reason: collision with root package name */
        int f97417n;

        /* renamed from: o  reason: collision with root package name */
        int f97418o;

        /* renamed from: p  reason: collision with root package name */
        int f97419p;

        /* renamed from: q  reason: collision with root package name */
        int f97420q;

        /* renamed from: r  reason: collision with root package name */
        int f97421r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f97422s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ d f97423t;

        /* renamed from: u  reason: collision with root package name */
        int f97424u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f97423t = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97422s = obj;
            this.f97424u |= Integer.MIN_VALUE;
            return this.f97423t.P((String) null, this);
        }
    }

    public d(U u10, C13352d dVar, Bx.a aVar, C12609a aVar2, Ax.c cVar, C14613b bVar, C12682a aVar3, Il.d dVar2, C13909a aVar4, M m10) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(dVar, "shoppingListNavigation");
        C17542s.j(aVar, "loginPromotionNavigation");
        C17542s.j(aVar2, "shareRepository");
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar3, "shareAnalytics");
        C17542s.j(dVar2, "marketConfigRepository");
        C17542s.j(aVar4, "sessionManager");
        C17542s.j(m10, "defaultDispatcher");
        this.f97291m = dVar;
        this.f97292n = aVar;
        this.f97293o = aVar2;
        this.f97294p = cVar;
        this.f97295q = bVar;
        this.f97296r = aVar3;
        this.f97297s = dVar2;
        this.f97298t = aVar4;
        this.f97299u = m10;
        this.f97300v = (SharedListRoutes$SharedList) O.a(u10, P.b(SharedListRoutes$SharedList.class), X.j());
        C16505B<c> a10 = C16521S.a(new c(true, (C13023e) null, (List) null, false, false, (c.a) null, 62, (DefaultConstructorMarker) null));
        this.f97301w = a10;
        this.f97302x = C16534i.c(a10);
        N();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: kotlin.jvm.internal.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlin.jvm.internal.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: dI.e<? super java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: fk.d} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054 A[ExcHandler: CancellationException (r0v17 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC, Splitter:B:19:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(java.lang.String r22, dI.C17164e<? super java.lang.String> r23) {
        /*
            r21 = this;
            r0 = r23
            r1 = 1
            boolean r2 = r0 instanceof fk.d.e
            if (r2 == 0) goto L_0x0018
            r2 = r0
            fk.d$e r2 = (fk.d.e) r2
            int r3 = r2.f97343n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f97343n = r3
            r3 = r21
            goto L_0x001f
        L_0x0018:
            fk.d$e r2 = new fk.d$e
            r3 = r21
            r2.<init>(r3, r0)
        L_0x001f:
            java.lang.Object r4 = r2.f97341l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r2.f97343n
            r7 = 0
            if (r6 == 0) goto L_0x005f
            if (r6 != r1) goto L_0x0057
            java.lang.Object r0 = r2.f97338i
            fk.d r0 = (fk.d) r0
            java.lang.Object r0 = r2.f97337h
            fk.d r0 = (fk.d) r0
            java.lang.Object r0 = r2.f97336g
            r6 = r0
            kotlin.jvm.internal.M r6 = (kotlin.jvm.internal.M) r6
            java.lang.Object r0 = r2.f97335f
            r8 = r0
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r0 = r2.f97334e
            r9 = r0
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r0 = r2.f97333d
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r2.f97332c
            r11 = r0
            fk.d r11 = (fk.d) r11
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0054, all -> 0x0051 }
            goto L_0x00a5
        L_0x0051:
            r0 = move-exception
            goto L_0x00b7
        L_0x0054:
            r0 = move-exception
            goto L_0x01b4
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005f:
            XH.y.b(r4)
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            r6 = r22
            r4.f144348a = r6
            kotlin.jvm.internal.M r8 = new kotlin.jvm.internal.M
            r8.<init>()
            r8.f144346a = r1
            r11 = r3
            r9 = r4
            r4 = r2
            r2 = r0
        L_0x0076:
            int r0 = r8.f144346a
            r10 = 10
            if (r0 > r10) goto L_0x01b5
            XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            jB.b r0 = r11.f97295q     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            T r10 = r9.f144348a     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97332c = r11     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97333d = r6     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97334e = r2     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97335f = r9     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97336g = r8     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97337h = r11     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97338i = r11     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97339j = r7     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97340k = r7     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            r4.f97343n = r1     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            java.lang.Object r0 = r0.a(r10, r4)     // Catch:{ CancellationException -> 0x0054, all -> 0x00b1 }
            if (r0 != r5) goto L_0x009f
            return r5
        L_0x009f:
            r10 = r6
            r6 = r8
            r8 = r9
            r9 = r2
            r2 = r4
            r4 = r0
        L_0x00a5:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ CancellationException -> 0x0054, all -> 0x0051 }
            java.lang.Object r0 = XH.x.b(r4)     // Catch:{ CancellationException -> 0x0054, all -> 0x0051 }
        L_0x00ab:
            r4 = r2
            r2 = r9
            r9 = r8
            r8 = r6
            r6 = r10
            goto L_0x00c2
        L_0x00b1:
            r0 = move-exception
            r10 = r6
            r6 = r8
            r8 = r9
            r9 = r2
            r2 = r4
        L_0x00b7:
            XH.x$a r4 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
            goto L_0x00ab
        L_0x00c2:
            boolean r10 = XH.x.h(r0)
            if (r10 == 0) goto L_0x00cb
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x00cb:
            java.lang.Throwable r0 = XH.x.e(r0)
            if (r0 == 0) goto L_0x01b1
            qv.e r10 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00e4:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00fb
            java.lang.Object r14 = r12.next()
            r15 = r14
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r10, r7)
            if (r15 == 0) goto L_0x00e4
            r13.add(r14)
            goto L_0x00e4
        L_0x00fb:
            java.util.Iterator r18 = r13.iterator()
            r15 = 0
            r12 = r15
            r13 = r12
        L_0x0102:
            boolean r14 = r18.hasNext()
            if (r14 == 0) goto L_0x0189
            java.lang.Object r14 = r18.next()
            qv.b r14 = (qv.C11819b) r14
            if (r12 != 0) goto L_0x011e
            java.lang.String r12 = "Unable to create list"
            java.lang.String r12 = qv.C11818a.a(r12, r0)
            if (r12 != 0) goto L_0x011a
            goto L_0x0189
        L_0x011a:
            java.lang.String r12 = qv.C11820c.a(r12)
        L_0x011e:
            r19 = r12
            if (r13 != 0) goto L_0x0171
            java.lang.Class r12 = r11.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r13 = 36
            r7 = 2
            java.lang.String r13 = HJ.C15854t.s1(r12, r13, r15, r7, r15)
            r1 = 46
            java.lang.String r1 = HJ.C15854t.o1(r13, r1, r15, r7, r15)
            int r7 = r1.length()
            if (r7 != 0) goto L_0x0141
            goto L_0x0147
        L_0x0141:
            java.lang.String r7 = "Kt"
            java.lang.String r12 = HJ.C15854t.P0(r1, r7)
        L_0x0147:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r7 = "main"
            r13 = 1
            boolean r1 = HJ.C15854t.b0(r1, r7, r13)
            if (r1 == 0) goto L_0x015b
            java.lang.String r1 = "m"
            goto L_0x015d
        L_0x015b:
            java.lang.String r1 = "b"
        L_0x015d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = "|"
            r7.append(r1)
            r7.append(r12)
            java.lang.String r13 = r7.toString()
        L_0x0171:
            r1 = r13
            r7 = 0
            r12 = r14
            r13 = r10
            r14 = r1
            r20 = r15
            r15 = r7
            r16 = r0
            r17 = r19
            r12.a(r13, r14, r15, r16, r17)
            r13 = r1
            r12 = r19
            r15 = r20
            r1 = 1
            r7 = 0
            goto L_0x0102
        L_0x0189:
            boolean r1 = r0 instanceof gB.j.d
            if (r1 == 0) goto L_0x01b0
            int r0 = r8.f144346a
            r1 = 1
            int r7 = r0 + 1
            r8.f144346a = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r10 = " ("
            r7.append(r10)
            r7.append(r0)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r9.f144348a = r0
            goto L_0x01b1
        L_0x01b0:
            throw r0
        L_0x01b1:
            r7 = 0
            goto L_0x0076
        L_0x01b4:
            throw r0
        L_0x01b5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Unable to create unique list name"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.d.L(java.lang.String, dI.e):java.lang.Object");
    }

    private final Object M(String str, C12859a aVar, C17164e<? super String> eVar) {
        return C16310i.g(this.f97299u, new f(this, aVar, str, (C17164e<? super f>) null), eVar);
    }

    private final void N() {
        c value;
        C16505B<c> b10 = this.f97301w;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, true, (C13023e) null, (List) null, false, false, (c.a) null, 46, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new g(N.f137593c0, this), (T) null, new h(this, (C17164e<? super h>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(FA.C12859a r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof fk.d.i
            if (r2 == 0) goto L_0x0017
            r2 = r1
            fk.d$i r2 = (fk.d.i) r2
            int r3 = r2.f97392i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f97392i = r3
            goto L_0x001c
        L_0x0017:
            fk.d$i r2 = new fk.d$i
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f97390g
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f97392i
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0058
            if (r5 == r7) goto L_0x0048
            if (r5 != r6) goto L_0x0040
            java.lang.Object r1 = r2.f97389f
            Rl.e r1 = (Rl.e) r1
            java.lang.Object r1 = r2.f97388e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f97387d
            FA.a r1 = (FA.C12859a) r1
            java.lang.Object r2 = r2.f97386c
            fk.d r2 = (fk.d) r2
            XH.y.b(r3)
            goto L_0x0094
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            java.lang.Object r1 = r2.f97388e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f97387d
            FA.a r5 = (FA.C12859a) r5
            java.lang.Object r8 = r2.f97386c
            fk.d r8 = (fk.d) r8
            XH.y.b(r3)
            goto L_0x0077
        L_0x0058:
            XH.y.b(r3)
            Il.d r3 = r0.f97297s
            TJ.g r3 = r3.d()
            TJ.g r3 = TJ.C16534i.A(r3)
            r2.f97386c = r0
            r5 = r18
            r2.f97387d = r5
            r2.f97388e = r1
            r2.f97392i = r7
            java.lang.Object r3 = TJ.C16534i.B(r3, r2)
            if (r3 != r4) goto L_0x0076
            return r4
        L_0x0076:
            r8 = r0
        L_0x0077:
            Rl.e r3 = (Rl.e) r3
            QJ.M r9 = r8.f97299u
            fk.d$j r10 = new fk.d$j
            r11 = 0
            r10.<init>(r8, r5, r3, r11)
            r2.f97386c = r8
            r2.f97387d = r5
            r2.f97388e = r1
            r2.f97389f = r3
            r2.f97392i = r6
            java.lang.Object r3 = QJ.C16310i.g(r9, r10, r2)
            if (r3 != r4) goto L_0x0092
            return r4
        L_0x0092:
            r1 = r5
            r2 = r8
        L_0x0094:
            java.util.List r3 = (java.util.List) r3
            TJ.B<fk.c> r2 = r2.f97301w
        L_0x0098:
            java.lang.Object r4 = r2.getValue()
            r8 = r4
            fk.c r8 = (fk.c) r8
            int r5 = dk.C11195a.f96881a
            java.lang.String r6 = r1.b()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            IC.e r10 = IC.C13026h.b(r5, r6)
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r12 = r5 ^ 1
            r15 = 48
            r16 = 0
            r9 = 0
            r13 = 0
            r14 = 0
            r11 = r3
            fk.c r5 = fk.c.b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = r2.e(r4, r5)
            if (r4 == 0) goto L_0x0098
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.d.O(FA.a, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(java.lang.String r28, dI.C17164e<? super FA.C12859a> r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            boolean r3 = r2 instanceof fk.d.k
            if (r3 == 0) goto L_0x0019
            r3 = r2
            fk.d$k r3 = (fk.d.k) r3
            int r4 = r3.f97424u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f97424u = r4
            goto L_0x001e
        L_0x0019:
            fk.d$k r3 = new fk.d$k
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f97422s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f97424u
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r15 = 1
            r12 = 0
            if (r6 == 0) goto L_0x0075
            if (r6 != r15) goto L_0x006d
            java.lang.Object r1 = r3.f97415l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f97414k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f97413j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f97412i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f97411h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f97410g
            fk.d r1 = (fk.d) r1
            java.lang.Object r1 = r3.f97409f
            fk.d r1 = (fk.d) r1
            java.lang.Object r1 = r3.f97408e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f97407d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f97406c
            fk.d r1 = (fk.d) r1
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r2 = r4.j()
            r24 = r8
            r25 = r9
            goto L_0x0175
        L_0x006d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0075:
            XH.y.b(r4)
            qv.e r4 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x008b:
            boolean r17 = r6.hasNext()
            if (r17 == 0) goto L_0x00a2
            java.lang.Object r13 = r6.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r4, r12)
            if (r14 == 0) goto L_0x008b
            r15.add(r13)
            goto L_0x008b
        L_0x00a2:
            java.util.Iterator r6 = r15.iterator()
            r17 = r15
            r13 = 0
            r14 = 0
        L_0x00aa:
            boolean r18 = r6.hasNext()
            if (r18 == 0) goto L_0x013d
            java.lang.Object r23 = r6.next()
            r17 = r23
            qv.b r17 = (qv.C11819b) r17
            r12 = 0
            r24 = r8
            if (r13 != 0) goto L_0x00d1
            java.lang.String r8 = "fetch shared list"
            java.lang.String r8 = qv.C11818a.a(r8, r12)
            if (r8 != 0) goto L_0x00cd
            r26 = r5
            r25 = r9
            r5 = r23
            goto L_0x0145
        L_0x00cd:
            java.lang.String r13 = qv.C11820c.a(r8)
        L_0x00d1:
            if (r14 != 0) goto L_0x0120
            java.lang.Class<fk.d> r8 = fk.d.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r26 = r5
            r25 = r9
            r9 = 0
            r12 = 2
            r14 = 36
            java.lang.String r5 = HJ.C15854t.s1(r8, r14, r9, r12, r9)
            r14 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r14, r9, r12, r9)
            int r9 = r5.length()
            if (r9 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            java.lang.String r8 = HJ.C15854t.P0(r5, r11)
        L_0x00f9:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r9 = 1
            boolean r5 = HJ.C15854t.b0(r5, r10, r9)
            if (r5 == 0) goto L_0x010b
            r5 = r25
            goto L_0x010d
        L_0x010b:
            r5 = r24
        L_0x010d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r14 = r9.toString()
            goto L_0x0124
        L_0x0120:
            r26 = r5
            r25 = r9
        L_0x0124:
            r20 = 0
            r18 = r4
            r19 = r14
            r5 = 0
            r21 = r5
            r22 = r13
            r17.a(r18, r19, r20, r21, r22)
            r17 = r23
            r8 = r24
            r9 = r25
            r5 = r26
            r12 = 0
            goto L_0x00aa
        L_0x013d:
            r26 = r5
            r24 = r8
            r25 = r9
            r5 = r17
        L_0x0145:
            BA.a r8 = r0.f97293o
            r3.f97406c = r0
            r3.f97407d = r1
            r3.f97408e = r2
            r3.f97409f = r0
            r3.f97410g = r0
            r3.f97411h = r4
            r3.f97412i = r13
            r3.f97413j = r14
            r3.f97414k = r15
            r3.f97415l = r6
            r3.f97416m = r5
            r2 = 0
            r3.f97417n = r2
            r3.f97418o = r2
            r3.f97419p = r2
            r3.f97420q = r2
            r3.f97421r = r2
            r2 = 1
            r3.f97424u = r2
            java.lang.Object r2 = r8.c(r1, r3)
            r1 = r26
            if (r2 != r1) goto L_0x0174
            return r1
        L_0x0174:
            r1 = r0
        L_0x0175:
            XH.y.b(r2)
            r3 = r2
            FA.a r3 = (FA.C12859a) r3
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x018e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01a6
            java.lang.Object r8 = r5.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            r12 = 0
            boolean r9 = r9.b(r4, r12)
            if (r9 == 0) goto L_0x018e
            r6.add(r8)
            goto L_0x018e
        L_0x01a6:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r9 = 0
        L_0x01ac:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0237
            java.lang.Object r8 = r5.next()
            r17 = r8
            qv.b r17 = (qv.C11819b) r17
            r8 = 0
            if (r9 != 0) goto L_0x01d9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "List fetched: "
            r9.append(r12)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r8)
            if (r9 != 0) goto L_0x01d5
            goto L_0x0237
        L_0x01d5:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x01d9:
            if (r6 != 0) goto L_0x0226
            java.lang.Class r6 = r1.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r12 = 36
            r13 = 2
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r6, r12, r14, r13, r14)
            r12 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r12, r14, r13, r14)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x01fb
            goto L_0x01ff
        L_0x01fb:
            java.lang.String r6 = HJ.C15854t.P0(r15, r11)
        L_0x01ff:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r12 = 1
            boolean r15 = HJ.C15854t.b0(r15, r10, r12)
            if (r15 == 0) goto L_0x0211
            r15 = r25
            goto L_0x0213
        L_0x0211:
            r15 = r24
        L_0x0213:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r7)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            goto L_0x0228
        L_0x0226:
            r13 = 2
            r14 = 0
        L_0x0228:
            r20 = 0
            r18 = r4
            r19 = r6
            r21 = r8
            r22 = r9
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x01ac
        L_0x0237:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.d.P(java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void S() {
        c value;
        C16505B<c> b10 = this.f97301w;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, false, (C13023e) null, (List) null, false, true, (c.a) null, 46, (Object) null)));
    }

    private final void T() {
        c value;
        C16505B<c> b10 = this.f97301w;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, false, (C13023e) null, (List) null, false, false, (c.a) null, 31, (Object) null)));
    }

    private final void h(String str) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("acceptList", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C16534i.M(C16534i.g(C16534i.R(C16534i.e0(this.f97298t.n(), 1), new b(this, str, (C17164e<? super b>) null)), new c(this, (C17164e<? super c>) null)), g0.a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(FA.C12859a r22, java.lang.String r23, dI.C17164e<? super XH.C16807N> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            boolean r4 = r3 instanceof fk.d.C2165d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            fk.d$d r4 = (fk.d.C2165d) r4
            int r5 = r4.f97331v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f97331v = r5
            goto L_0x0020
        L_0x001b:
            fk.d$d r4 = new fk.d$d
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f97329t
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f97331v
            r8 = 1
            if (r7 == 0) goto L_0x0067
            if (r7 != r8) goto L_0x005f
            java.lang.Object r1 = r4.f97322m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r4.f97321l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r4.f97320k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f97319j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f97318i
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r4.f97317h
            fk.d r1 = (fk.d) r1
            java.lang.Object r1 = r4.f97316g
            fk.d r1 = (fk.d) r1
            java.lang.Object r1 = r4.f97315f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f97314e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f97313d
            FA.a r1 = (FA.C12859a) r1
            java.lang.Object r1 = r4.f97312c
            fk.d r1 = (fk.d) r1
            XH.y.b(r5)
            r8 = r1
            goto L_0x0178
        L_0x005f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0067:
            XH.y.b(r5)
            TJ.B<fk.c> r5 = r0.f97301w
        L_0x006c:
            java.lang.Object r7 = r5.getValue()
            r9 = r7
            fk.c r9 = (fk.c) r9
            fk.c$a$c r15 = fk.c.a.C2164c.f97287a
            r16 = 31
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            fk.c r9 = fk.c.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r7 = r5.e(r7, r9)
            if (r7 == 0) goto L_0x006c
            qv.e r5 = qv.e.DEBUG
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x009b:
            boolean r9 = r7.hasNext()
            r14 = 0
            if (r9 == 0) goto L_0x00b3
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r5, r14)
            if (r10 == 0) goto L_0x009b
            r15.add(r9)
            goto L_0x009b
        L_0x00b3:
            java.util.Iterator r7 = r15.iterator()
            r13 = 0
            r9 = r13
            r10 = r9
            r11 = r15
        L_0x00bb:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x014a
            java.lang.Object r16 = r7.next()
            r11 = r16
            qv.b r11 = (qv.C11819b) r11
            r12 = 0
            if (r9 != 0) goto L_0x00dd
            java.lang.String r14 = "Fetch products for shopping list"
            java.lang.String r14 = qv.C11818a.a(r14, r12)
            if (r14 != 0) goto L_0x00d9
            r11 = r16
            r8 = 0
            goto L_0x014b
        L_0x00d9:
            java.lang.String r9 = qv.C11820c.a(r14)
        L_0x00dd:
            r18 = r9
            if (r10 != 0) goto L_0x012d
            java.lang.Class<fk.d> r9 = fk.d.class
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 36
            r14 = 2
            java.lang.String r10 = HJ.C15854t.s1(r9, r10, r13, r14, r13)
            r12 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r12, r13, r14, r13)
            int r12 = r10.length()
            if (r12 != 0) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r10, r9)
        L_0x0104:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "main"
            boolean r10 = HJ.C15854t.b0(r10, r12, r8)
            if (r10 == 0) goto L_0x0117
            java.lang.String r10 = "m"
            goto L_0x0119
        L_0x0117:
            java.lang.String r10 = "b"
        L_0x0119:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "|"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r10 = r12.toString()
        L_0x012d:
            r20 = r10
            r12 = 0
            r9 = r11
            r10 = r5
            r11 = r20
            r14 = 0
            r19 = r13
            r13 = r14
            r8 = 0
            r14 = r18
            r9.a(r10, r11, r12, r13, r14)
            r14 = r8
            r11 = r16
            r9 = r18
            r13 = r19
            r10 = r20
            r8 = 1
            goto L_0x00bb
        L_0x014a:
            r8 = r14
        L_0x014b:
            r4.f97312c = r0
            r4.f97313d = r1
            r4.f97314e = r2
            r4.f97315f = r3
            r4.f97316g = r0
            r4.f97317h = r0
            r4.f97318i = r5
            r4.f97319j = r9
            r4.f97320k = r10
            r4.f97321l = r15
            r4.f97322m = r7
            r4.f97323n = r11
            r4.f97324o = r8
            r4.f97325p = r8
            r4.f97326q = r8
            r4.f97327r = r8
            r4.f97328s = r8
            r7 = 1
            r4.f97331v = r7
            java.lang.Object r5 = r0.M(r2, r1, r4)
            if (r5 != r6) goto L_0x0177
            return r6
        L_0x0177:
            r8 = r0
        L_0x0178:
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            TJ.B<fk.c> r10 = r8.f97301w
        L_0x017d:
            java.lang.Object r1 = r10.getValue()
            r11 = r1
            fk.c r11 = (fk.c) r11
            fk.c$a$d r2 = new fk.c$a$d
            r2.<init>(r9)
            r18 = 31
            r19 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r2
            fk.c r2 = fk.c.b(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r10.e(r1, r2)
            if (r1 == 0) goto L_0x017d
            CA.a r1 = r8.f97296r
            r1.a()
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.d.i(FA.a, java.lang.String, dI.e):java.lang.Object");
    }

    public final Bx.a Q() {
        return this.f97292n;
    }

    public final C13352d R() {
        return this.f97291m;
    }

    public void U(C11270b bVar) {
        C17542s.j(bVar, "action");
        if (bVar instanceof C11270b.a) {
            h(((C11270b.a) bVar).a());
        } else if (C17542s.e(bVar, C11270b.c.f97278a)) {
            N();
        } else if (C17542s.e(bVar, C11270b.C2162b.f97277a)) {
            T();
        } else {
            throw new t();
        }
    }

    public C16519P<c> getState() {
        return this.f97302x;
    }
}
