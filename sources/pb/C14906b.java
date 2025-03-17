package pB;

import HJ.C15854t;
import KJ.C15987c;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.shoppinglist.listpicker.impl.navigation.ListPickerRoutes$ListSelector;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gB.C14500b;
import gB.C14505g;
import gB.k;
import jB.C14613b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import oB.C14868a;
import pB.C14905a;
import qB.C14934a;
import qB.C14935b;
import qB.C14936c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import sB.C15035a;
import sp.C11879a;
import x4.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b \u0010!J5\u0010'\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040C8\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"LpB/b;", "Landroidx/lifecycle/f0;", "Lsp/a;", "LqB/a;", "LqB/b;", "Landroidx/lifecycle/U;", "savedStateHandle", "LoB/a;", "argumentMapper", "LQJ/M;", "defaultDispatcher", "LjB/b;", "shoppingListRepository", "LpB/a;", "getShoppingListAndLoggedInUseCase", "<init>", "(Landroidx/lifecycle/U;LoB/a;LQJ/M;LjB/b;LpB/a;)V", "LpB/a$c;", "state", "LXH/N;", "H", "(LpB/a$c;LdI/e;)Ljava/lang/Object;", "LqB/c;", "shoppingListPickerModel", "K", "(LqB/c;)V", "", "newListName", "E", "(Ljava/lang/String;)V", "", "LjB/b$b;", "F", "()Ljava/util/List;", "items", "listId", "listName", "", "hasItem", "J", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "LgB/k;", "lists", "G", "(Ljava/util/List;)Ljava/util/List;", "action", "I", "(LqB/a;)V", "m", "LQJ/M;", "n", "LjB/b;", "Lcom/ingka/ikea/shoppinglist/listpicker/impl/navigation/ListPickerRoutes$ListSelector;", "o", "Lcom/ingka/ikea/shoppinglist/listpicker/impl/navigation/ListPickerRoutes$ListSelector;", "route", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "p", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "q", "Ljava/lang/String;", "requestKey", "LTJ/B;", "r", "LTJ/B;", "_state", "LTJ/P;", "s", "LTJ/P;", "getState", "()LTJ/P;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pB.b  reason: case insensitive filesystem */
public final class C14906b extends f0 implements C11879a<C14934a, C14935b> {

    /* renamed from: m  reason: collision with root package name */
    private final M f130208m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C14613b f130209n;

    /* renamed from: o  reason: collision with root package name */
    private final ListPickerRoutes$ListSelector f130210o;

    /* renamed from: p  reason: collision with root package name */
    private final ListPickerNavigation.Operation f130211p;

    /* renamed from: q  reason: collision with root package name */
    private final String f130212q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<C14935b> f130213r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<C14935b> f130214s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.ListPickerViewModel$createShoppingList$2", f = "ListPickerViewModel.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: pB.b$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f130215c;

        /* renamed from: d  reason: collision with root package name */
        Object f130216d;

        /* renamed from: e  reason: collision with root package name */
        Object f130217e;

        /* renamed from: f  reason: collision with root package name */
        Object f130218f;

        /* renamed from: g  reason: collision with root package name */
        Object f130219g;

        /* renamed from: h  reason: collision with root package name */
        Object f130220h;

        /* renamed from: i  reason: collision with root package name */
        Object f130221i;

        /* renamed from: j  reason: collision with root package name */
        Object f130222j;

        /* renamed from: k  reason: collision with root package name */
        Object f130223k;

        /* renamed from: l  reason: collision with root package name */
        Object f130224l;

        /* renamed from: m  reason: collision with root package name */
        int f130225m;

        /* renamed from: n  reason: collision with root package name */
        int f130226n;

        /* renamed from: o  reason: collision with root package name */
        int f130227o;

        /* renamed from: p  reason: collision with root package name */
        int f130228p;

        /* renamed from: q  reason: collision with root package name */
        int f130229q;

        /* renamed from: r  reason: collision with root package name */
        int f130230r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f130231s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C14906b f130232t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f130233u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14906b bVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130232t = bVar;
            this.f130233u = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f130232t, this.f130233u, eVar);
            aVar.f130231s = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0161, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0262, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0042, B:41:0x0129] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0050 A[ExcHandler: CancellationException (r0v11 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x0042] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r1 = r22
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f130230r
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x005b
                if (r2 != r11) goto L_0x0053
                java.lang.Object r0 = r1.f130223k
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f130222j
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f130221i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f130220h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f130219g
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r1.f130218f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f130217e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f130216d
                pB.b r0 = (pB.C14906b) r0
                java.lang.Object r0 = r1.f130215c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f130231s
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r23)     // Catch:{ CancellationException -> 0x0050, all -> 0x004b }
                r21 = r4
                r4 = r23
                goto L_0x015a
            L_0x004b:
                r0 = move-exception
                r21 = r4
                goto L_0x0162
            L_0x0050:
                r0 = move-exception
                goto L_0x0262
            L_0x0053:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x005b:
                XH.y.b(r23)
                java.lang.Object r2 = r1.f130231s
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0075:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x008c
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0075
                r11.add(r8)
                goto L_0x0075
            L_0x008c:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0094:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0120
                java.lang.Object r20 = r8.next()
                r16 = r20
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00b8
                java.lang.String r10 = "Creating list"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00b4
                r21 = r4
                r10 = r15
                r4 = r20
                goto L_0x0125
            L_0x00b4:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00b8:
                if (r14 != 0) goto L_0x0106
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r21 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00db
                goto L_0x00df
            L_0x00db:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00df:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00f0
                r4 = r5
                goto L_0x00f2
            L_0x00f0:
                r4 = r21
            L_0x00f2:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x0104:
                r4 = r14
                goto L_0x0109
            L_0x0106:
                r21 = r4
                goto L_0x0104
            L_0x0109:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r20
                r4 = r21
                r12 = 0
                goto L_0x0094
            L_0x0120:
                r21 = r4
                r10 = r15
                r4 = r16
            L_0x0125:
                pB.b r12 = r1.f130232t
                java.lang.String r15 = r1.f130233u
                XH.x$a r16 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                jB.b r13 = r12.f130209n     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130231s = r2     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130215c = r2     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130216d = r12     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130217e = r15     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130218f = r2     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130219g = r10     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130220h = r9     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130221i = r14     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130222j = r11     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130223k = r8     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130224l = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r4 = 0
                r1.f130225m = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130226n = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130227o = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130228p = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r1.f130229q = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                r4 = 1
                r1.f130230r = r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                java.lang.Object r4 = r13.a(r15, r1)     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                if (r4 != r0) goto L_0x015a
                return r0
            L_0x015a:
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                java.lang.Object r0 = XH.x.b(r4)     // Catch:{ CancellationException -> 0x0050, all -> 0x0161 }
                goto L_0x016c
            L_0x0161:
                r0 = move-exception
            L_0x0162:
                XH.x$a r4 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x016c:
                pB.b r4 = r1.f130232t
                java.lang.String r8 = r1.f130233u
                java.lang.Throwable r15 = XH.x.e(r0)
                if (r15 != 0) goto L_0x0182
                java.lang.String r0 = (java.lang.String) r0
                java.util.List r2 = r4.F()
                r3 = 0
                r4.J(r2, r0, r8, r3)
                goto L_0x025f
            L_0x0182:
                qv.e r0 = qv.e.WARN
                qv.d r8 = qv.d.f102012a
                java.util.List r8 = r8.a()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x0195:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x01ad
                java.lang.Object r10 = r8.next()
                r11 = r10
                qv.b r11 = (qv.C11819b) r11
                r12 = 0
                boolean r11 = r11.b(r0, r12)
                if (r11 == 0) goto L_0x0195
                r9.add(r10)
                goto L_0x0195
            L_0x01ad:
                java.util.Iterator r8 = r9.iterator()
                r9 = 0
                r10 = 0
            L_0x01b3:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x023d
                java.lang.Object r11 = r8.next()
                qv.b r11 = (qv.C11819b) r11
                if (r9 != 0) goto L_0x01cf
                java.lang.String r9 = "Unable to create list"
                java.lang.String r9 = qv.C11818a.a(r9, r15)
                if (r9 != 0) goto L_0x01cb
                goto L_0x023d
            L_0x01cb:
                java.lang.String r9 = qv.C11820c.a(r9)
            L_0x01cf:
                r17 = r9
                if (r10 != 0) goto L_0x021e
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                r12 = 0
                r13 = 2
                r14 = 36
                java.lang.String r10 = HJ.C15854t.s1(r9, r14, r12, r13, r12)
                r1 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r1, r12, r13, r12)
                int r16 = r10.length()
                if (r16 != 0) goto L_0x01f3
                goto L_0x01f7
            L_0x01f3:
                java.lang.String r9 = HJ.C15854t.P0(r10, r7)
            L_0x01f7:
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r1 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r1)
                if (r10 == 0) goto L_0x0208
                r10 = r5
                goto L_0x020a
            L_0x0208:
                r10 = r21
            L_0x020a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r3)
                r1.append(r9)
                java.lang.String r10 = r1.toString()
            L_0x021c:
                r1 = r10
                goto L_0x0223
            L_0x021e:
                r12 = 0
                r13 = 2
                r14 = 36
                goto L_0x021c
            L_0x0223:
                r16 = 0
                r9 = r11
                r10 = r0
                r11 = r1
                r18 = r12
                r12 = r16
                r16 = r13
                r13 = r15
                r19 = r14
                r14 = r17
                r9.a(r10, r11, r12, r13, r14)
                r10 = r1
                r9 = r17
                r1 = r22
                goto L_0x01b3
            L_0x023d:
                TJ.B r0 = r4.f130213r
            L_0x0241:
                java.lang.Object r1 = r0.getValue()
                r2 = r1
                qB.b r2 = (qB.C14935b) r2
                qB.b$a$b r5 = new qB.b$a$b
                r5.<init>(r15)
                r9 = 27
                r10 = 0
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                qB.b r2 = qB.C14935b.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r1 = r0.e(r1, r2)
                if (r1 == 0) goto L_0x0241
            L_0x025f:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0262:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pB.C14906b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.ListPickerViewModel", f = "ListPickerViewModel.kt", l = {72}, m = "mapShoppingListToUiState")
    /* renamed from: pB.b$b  reason: collision with other inner class name */
    static final class C3215b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f130234c;

        /* renamed from: d  reason: collision with root package name */
        Object f130235d;

        /* renamed from: e  reason: collision with root package name */
        Object f130236e;

        /* renamed from: f  reason: collision with root package name */
        Object f130237f;

        /* renamed from: g  reason: collision with root package name */
        Object f130238g;

        /* renamed from: h  reason: collision with root package name */
        Object f130239h;

        /* renamed from: i  reason: collision with root package name */
        Object f130240i;

        /* renamed from: j  reason: collision with root package name */
        int f130241j;

        /* renamed from: k  reason: collision with root package name */
        int f130242k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f130243l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C14906b f130244m;

        /* renamed from: n  reason: collision with root package name */
        int f130245n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3215b(C14906b bVar, C17164e<? super C3215b> eVar) {
            super(eVar);
            this.f130244m = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130243l = obj;
            this.f130245n |= Integer.MIN_VALUE;
            return this.f130244m.H((C14905a.c) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LqB/c;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.ListPickerViewModel$mapShoppingListToUiState$2$1", f = "ListPickerViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pB.b$c */
    static final class c extends l implements p<Q, C17164e<? super List<? extends C14936c>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14906b f130247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14905a.c f130248e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14906b bVar, C14905a.c cVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f130247d = bVar;
            this.f130248e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f130247d, this.f130248e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<C14936c>> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f130246c == 0) {
                y.b(obj);
                return this.f130247d.G(this.f130248e.b());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.b$d */
    public static final class d implements C16532g<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f130249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14906b f130250b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.b$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f130251a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14906b f130252b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.ListPickerViewModel$special$$inlined$map$1$2", f = "ListPickerViewModel.kt", l = {51, 50}, m = "emit")
            /* renamed from: pB.b$d$a$a  reason: collision with other inner class name */
            public static final class C3216a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f130253c;

                /* renamed from: d  reason: collision with root package name */
                int f130254d;

                /* renamed from: e  reason: collision with root package name */
                Object f130255e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f130256f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3216a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f130256f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f130253c = obj;
                    this.f130254d |= Integer.MIN_VALUE;
                    return this.f130256f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C14906b bVar) {
                this.f130251a = hVar;
                this.f130252b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof pB.C14906b.d.a.C3216a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    pB.b$d$a$a r0 = (pB.C14906b.d.a.C3216a) r0
                    int r1 = r0.f130254d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f130254d = r1
                    goto L_0x0018
                L_0x0013:
                    pB.b$d$a$a r0 = new pB.b$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f130253c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f130254d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r7)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f130255e
                    TJ.h r6 = (TJ.C16533h) r6
                    XH.y.b(r7)
                    goto L_0x0051
                L_0x003c:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f130251a
                    pB.a$c r6 = (pB.C14905a.c) r6
                    pB.b r2 = r5.f130252b
                    r0.f130255e = r7
                    r0.f130254d = r4
                    java.lang.Object r6 = r2.H(r6, r0)
                    if (r6 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r6 = r7
                L_0x0051:
                    XH.N r7 = XH.C16807N.f139792a
                    r2 = 0
                    r0.f130255e = r2
                    r0.f130254d = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: pB.C14906b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, C14906b bVar) {
            this.f130249a = gVar;
            this.f130250b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f130249a.collect(new a(hVar, this.f130250b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C14906b(U u10, C14868a aVar, M m10, C14613b bVar, C14905a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "argumentMapper");
        C17542s.j(m10, "defaultDispatcher");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar2, "getShoppingListAndLoggedInUseCase");
        this.f130208m = m10;
        this.f130209n = bVar;
        ListPickerRoutes$ListSelector listPickerRoutes$ListSelector = (ListPickerRoutes$ListSelector) O.a(u10, P.b(ListPickerRoutes$ListSelector.class), X.j());
        this.f130210o = listPickerRoutes$ListSelector;
        this.f130211p = aVar.c(listPickerRoutes$ListSelector.a());
        this.f130212q = listPickerRoutes$ListSelector.b();
        C16505B<C14935b> a10 = C16521S.a(new C14935b((C15987c) null, (Boolean) null, (C14935b.a) null, (C14935b.c) null, false, (C14935b.C3223b) null, 63, (DefaultConstructorMarker) null));
        this.f130213r = a10;
        this.f130214s = a10;
        C16534i.M(new d(aVar2.e(), this), g0.a(this));
    }

    private final void E(String str) {
        C14935b value;
        C14935b bVar;
        C16505B<C14935b> b10 = this.f130213r;
        do {
            value = b10.getValue();
            bVar = value;
        } while (!b10.e(value, C14935b.b(bVar, (C15987c) null, (Boolean) null, (C14935b.a) null, (C14935b.c) null, false, new C14935b.C3223b.a(bVar.d().isEmpty()), 27, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, str, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final List<C14613b.C3151b> F() {
        ListPickerNavigation.Operation operation = this.f130211p;
        if (operation instanceof ListPickerNavigation.Operation.AddOrRemove) {
            return C16877v.e(new C14613b.C3151b(((ListPickerNavigation.Operation.AddOrRemove) operation).b(), ((ListPickerNavigation.Operation.AddOrRemove) this.f130211p).d()));
        }
        if (operation instanceof ListPickerNavigation.Operation.AddAll) {
            Iterable<ListPickerNavigation.Operation.AddAll.ProductData> c10 = ((ListPickerNavigation.Operation.AddAll) operation).c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (ListPickerNavigation.Operation.AddAll.ProductData productData : c10) {
                arrayList.add(new C14613b.C3151b(productData.a(), productData.b()));
            }
            return arrayList;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final List<C14936c> G(List<k> list) {
        Object obj;
        C14500b f10;
        Iterable<k> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (k kVar : iterable) {
            ListPickerNavigation.Operation operation = this.f130211p;
            boolean z10 = false;
            if (operation instanceof ListPickerNavigation.Operation.AddOrRemove) {
                Iterable c10 = kVar.c();
                if (!(c10 instanceof Collection) || !((Collection) c10).isEmpty()) {
                    Iterator it = c10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C17542s.e(((C14505g) it.next()).b(), ((ListPickerNavigation.Operation.AddOrRemove) this.f130211p).b())) {
                                z10 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else if (!(operation instanceof ListPickerNavigation.Operation.AddAll)) {
                throw new t();
            }
            String a10 = kVar.d().a();
            String b10 = kVar.d().b();
            Iterator it2 = kVar.c().iterator();
            String str = null;
            if (!it2.hasNext()) {
                obj = null;
            } else {
                obj = it2.next();
                if (it2.hasNext()) {
                    Instant i10 = ((C14505g) obj).i();
                    do {
                        Object next = it2.next();
                        Instant i11 = ((C14505g) next).i();
                        if (i10.compareTo(i11) < 0) {
                            obj = next;
                            i10 = i11;
                        }
                    } while (it2.hasNext());
                }
            }
            C14505g gVar = (C14505g) obj;
            if (!(gVar == null || (f10 = gVar.f()) == null)) {
                str = f10.a();
            }
            arrayList.add(new C14936c(a10, b10, str, z10));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(pB.C14905a.c r23, dI.C17164e<? super XH.C16807N> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof pB.C14906b.C3215b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            pB.b$b r2 = (pB.C14906b.C3215b) r2
            int r3 = r2.f130245n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f130245n = r3
            goto L_0x001c
        L_0x0017:
            pB.b$b r2 = new pB.b$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f130243l
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f130245n
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x005f
            if (r5 != r8) goto L_0x0057
            int r1 = r2.f130241j
            java.lang.Object r5 = r2.f130240i
            qB.b r5 = (qB.C14935b) r5
            java.lang.Object r9 = r2.f130239h
            java.lang.Object r10 = r2.f130238g
            TJ.B r10 = (TJ.C16505B) r10
            java.lang.Object r11 = r2.f130237f
            qB.b$a$a r11 = (qB.C14935b.a.C3221a) r11
            java.lang.Object r12 = r2.f130236e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f130235d
            pB.a$c r13 = (pB.C14905a.c) r13
            java.lang.Object r14 = r2.f130234c
            pB.b r14 = (pB.C14906b) r14
            XH.y.b(r3)
            r18 = r2
            r15 = r9
            r19 = r11
            r2 = r12
            r20 = r14
            r9 = r5
            r14 = r10
            r5 = r1
            r1 = r13
            goto L_0x00ad
        L_0x0057:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005f:
            XH.y.b(r3)
            boolean r3 = r23.a()
            if (r3 == 0) goto L_0x006e
            qB.b$a$a r3 = new qB.b$a$a
            r3.<init>(r8)
            goto L_0x006f
        L_0x006e:
            r3 = r7
        L_0x006f:
            TJ.B<qB.b> r5 = r0.f130213r
            r14 = r0
            r11 = r3
            r10 = r5
            r3 = r6
            r5 = r2
            r2 = r1
            r1 = r23
        L_0x0079:
            java.lang.Object r9 = r10.getValue()
            r12 = r9
            qB.b r12 = (qB.C14935b) r12
            QJ.M r13 = r14.f130208m
            pB.b$c r15 = new pB.b$c
            r15.<init>(r14, r1, r7)
            r5.f130234c = r14
            r5.f130235d = r1
            r5.f130236e = r2
            r5.f130237f = r11
            r5.f130238g = r10
            r5.f130239h = r9
            r5.f130240i = r12
            r5.f130241j = r3
            r5.f130242k = r6
            r5.f130245n = r8
            java.lang.Object r13 = QJ.C16310i.g(r13, r15, r5)
            if (r13 != r4) goto L_0x00a2
            return r4
        L_0x00a2:
            r18 = r5
            r15 = r9
            r19 = r11
            r9 = r12
            r20 = r14
            r5 = r3
            r14 = r10
            r3 = r13
        L_0x00ad:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            KJ.c r10 = KJ.C15985a.h(r3)
            boolean r3 = r1.c()
            boolean r11 = r1.d()
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r11)
            r16 = 40
            r17 = 0
            r13 = 0
            r21 = 0
            r12 = r19
            r6 = r14
            r14 = r3
            r3 = r15
            r15 = r21
            qB.b r9 = qB.C14935b.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = r6.e(r3, r9)
            if (r3 == 0) goto L_0x00da
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x00da:
            r3 = r5
            r10 = r6
            r5 = r18
            r11 = r19
            r14 = r20
            r6 = 0
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: pB.C14906b.H(pB.a$c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void J(List<C14613b.C3151b> list, String str, String str2, boolean z10) {
        C14935b value;
        String str3 = str;
        if (z10) {
            if (list.size() > 1) {
                IllegalStateException illegalStateException = new IllegalStateException("Removing more that one item not supported");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList) {
                    if (str4 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str4 = C11820c.a(a10);
                    }
                    if (str5 == null) {
                        String name = C14906b.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str5;
                    bVar.a(eVar, str6, false, illegalStateException, str4);
                    str5 = str6;
                }
            }
            this.f130209n.l(str3, (C14613b.C3151b) C16877v.w0(list), this.f130211p.a().c(), this.f130211p.a().b());
        } else {
            this.f130209n.j(str3, list, this.f130211p.a().c(), this.f130211p.a().b());
            Bg.a.f58907a.d(Bg.d.ADD_FAVORITE);
        }
        C16505B<C14935b> b10 = this.f130213r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C14935b.b(value, (C15987c) null, (Boolean) null, (C14935b.a) null, new C14935b.c(this.f130212q, this.f130211p, str, str2, z10 ? C15035a.C3239a.REMOVE : C15035a.C3239a.ADD), false, (C14935b.C3223b) null, 3, (Object) null)));
    }

    private final void K(C14936c cVar) {
        J(F(), cVar.c(), cVar.d(), cVar.a());
    }

    public void I(C14934a aVar) {
        C14935b value;
        C14935b value2;
        C17542s.j(aVar, "action");
        if (aVar instanceof C14934a.c) {
            E(((C14934a.c) aVar).a());
        } else if (aVar instanceof C14934a.d) {
            K(((C14934a.d) aVar).a());
        } else if (C17542s.e(aVar, C14934a.b.f130377a)) {
            C16505B<C14935b> b10 = this.f130213r;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, C14935b.b(value2, (C15987c) null, (Boolean) null, (C14935b.a) null, (C14935b.c) null, false, (C14935b.C3223b) null, 59, (Object) null)));
        } else if (C17542s.e(aVar, C14934a.C3220a.f130376a)) {
            C16505B<C14935b> b11 = this.f130213r;
            do {
                value = b11.getValue();
            } while (!b11.e(value, C14935b.b(value, (C15987c) null, (Boolean) null, new C14935b.a.C3221a(false), (C14935b.c) null, false, (C14935b.C3223b) null, 59, (Object) null)));
        } else {
            throw new t();
        }
    }

    public C16519P<C14935b> getState() {
        return this.f130214s;
    }
}
