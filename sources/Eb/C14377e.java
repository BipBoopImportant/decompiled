package eB;

import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import SA.C13560a;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import VA.C13737a;
import VA.C13741e;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import ZA.C13871a;
import aA.C13909a;
import aB.C13911a;
import aB.C13915e;
import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem;
import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import gB.C14503e;
import gB.C14505g;
import gB.C14507i;
import jB.C14613b;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Be\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J-\u0010*\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001cH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001c03H\u0016¢\u0006\u0004\b5\u00106J#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001c032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u00109J%\u0010<\u001a\b\u0012\u0004\u0012\u00020;032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001c032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u00109J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010@\u001a\u00020?H@¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020$2\u0006\u0010C\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010EJ7\u0010J\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\b\b\u0001\u0010L\u001a\u00020?H\u0016¢\u0006\u0004\bM\u0010NJ3\u0010P\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001d2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bR\u0010EJ\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020S032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bT\u00109J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020$0UH@¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020$H@¢\u0006\u0004\bX\u0010WJ \u0010Z\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020\u001aH@¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u001a2\u0006\u0010\\\u001a\u00020\u001aH@¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b_\u0010^J\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001f032\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b`\u00109J\u001b\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0a03H\u0016¢\u0006\u0004\bb\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010iR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010jR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010kR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010lR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010mR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010qR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010rR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020t0s8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010uR \u0010y\u001a\b\u0012\u0004\u0012\u00020t038\u0016X\u0004¢\u0006\f\n\u0004\b>\u0010w\u001a\u0004\bx\u00106R \u0010~\u001a\b\u0012\u0004\u0012\u00020\u001f0z8\u0016X\u0004¢\u0006\f\n\u0004\bR\u0010{\u001a\u0004\b|\u0010}R\u0018\u0010\u0001\u001a\u000208\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bM\u0010\u0001¨\u0006\u0001"}, d2 = {"LeB/e;", "LjB/b;", "LVA/a;", "shoppingListDao", "LVA/e;", "shoppingListItemDao", "LWk/d;", "stockRepository", "LaB/e;", "shoppingListSyncService", "LaB/a;", "shoppingListEndpoint", "LFB/a;", "localStoreSelectionRepository", "LQJ/M;", "ioDispatcher", "LQJ/Q;", "appScope", "LaA/a;", "sessionManager", "Lam/h;", "timeProvider", "LSA/a;", "shoppingListSharedAnalytics", "<init>", "(LVA/a;LVA/e;LWk/d;LaB/e;LaB/a;LFB/a;LQJ/M;LQJ/Q;LaA/a;Lam/h;LSA/a;)V", "", "listId", "", "LjB/b$b;", "items", "", "F", "(Ljava/lang/String;Ljava/util/List;)Z", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;", "entity", "LXH/N;", "E", "(Ljava/lang/String;Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;)V", "shoppingListId", "entities", "syncEvent", "K", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "LbB/f;", "lists", "I", "(Ljava/util/List;)V", "Ljava/time/Instant;", "D", "()Ljava/time/Instant;", "LTJ/g;", "LgB/k;", "g", "()LTJ/g;", "LgB/i;", "q", "(Ljava/lang/String;)LTJ/g;", "itemNo", "LgB/g;", "b", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "m", "", "limit", "t", "(ILdI/e;)Ljava/lang/Object;", "id", "s", "(Ljava/lang/String;)V", "LDe/a;", "component", "LAe/k;", "actionType", "j", "(Ljava/lang/String;Ljava/util/List;LDe/a;LAe/k;)Z", "quantity", "o", "(Ljava/lang/String;Ljava/lang/String;I)V", "item", "l", "(Ljava/lang/String;LjB/b$b;LDe/a;LAe/k;)V", "n", "LgB/e;", "e", "LXH/x;", "h", "(LdI/e;)Ljava/lang/Object;", "v", "newName", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "listName", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "d", "k", "", "f", "LVA/a;", "G", "()LVA/a;", "LVA/e;", "H", "()LVA/e;", "LWk/d;", "LaB/e;", "LaB/a;", "LFB/a;", "LQJ/M;", "LQJ/Q;", "i", "LaA/a;", "Lam/h;", "LSA/a;", "LTJ/A;", "LjB/b$a;", "LTJ/A;", "_addToListEvents", "LTJ/g;", "u", "addToListEvents", "LTJ/B;", "LTJ/B;", "J", "()LTJ/B;", "isFetchingLists", "LQJ/F0;", "LQJ/F0;", "fetchListJob", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eB.e  reason: case insensitive filesystem */
public final class C14377e implements C14613b {

    /* renamed from: a  reason: collision with root package name */
    private final C13737a f126378a;

    /* renamed from: b  reason: collision with root package name */
    private final C13741e f126379b;

    /* renamed from: c  reason: collision with root package name */
    private final Wk.d f126380c;

    /* renamed from: d  reason: collision with root package name */
    private final C13915e f126381d;

    /* renamed from: e  reason: collision with root package name */
    private final C13911a f126382e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C12860a f126383f;

    /* renamed from: g  reason: collision with root package name */
    private final M f126384g;

    /* renamed from: h  reason: collision with root package name */
    private final Q f126385h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C13909a f126386i;

    /* renamed from: j  reason: collision with root package name */
    private final am.h f126387j;

    /* renamed from: k  reason: collision with root package name */
    private final C13560a f126388k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C16504A<C14613b.a> f126389l;

    /* renamed from: m  reason: collision with root package name */
    private final C16532g<C14613b.a> f126390m;

    /* renamed from: n  reason: collision with root package name */
    private final C16505B<Boolean> f126391n = C16521S.a(Boolean.FALSE);

    /* renamed from: o  reason: collision with root package name */
    private F0 f126392o = J0.b((F0) null, 1, (Object) null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbB/f;", "it", "LXH/N;", "<anonymous>", "(LbB/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$2", f = "ShoppingListRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eB.e$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<bB.f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126393c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f126394d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14377e f126395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14377e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f126395e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f126395e, eVar);
            aVar.f126394d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(bB.f fVar, C17164e<? super C16807N> eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f126393c == 0) {
                y.b(obj);
                this.f126395e.I(C16877v.e((bB.f) this.f126394d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$clearShoppingList$1", f = "ShoppingListRepositoryImpl.kt", l = {313, 314, 315}, m = "invokeSuspend")
    /* renamed from: eB.e$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f126396c;

        /* renamed from: d  reason: collision with root package name */
        int f126397d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14377e f126398e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f126399f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14377e eVar, String str, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f126398e = eVar;
            this.f126399f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f126398e, this.f126399f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f126397d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r6.f126396c
                java.util.List r0 = (java.util.List) r0
                XH.y.b(r7)
                goto L_0x0075
            L_0x0019:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0021:
                java.lang.Object r1 = r6.f126396c
                java.util.List r1 = (java.util.List) r1
                XH.y.b(r7)
                r7 = r1
                goto L_0x005b
            L_0x002a:
                XH.y.b(r7)
                goto L_0x0046
            L_0x002e:
                XH.y.b(r7)
                eB.e r7 = r6.f126398e
                VA.e r7 = r7.H()
                java.lang.String r1 = r6.f126399f
                TJ.g r7 = r7.h(r1)
                r6.f126397d = r4
                java.lang.Object r7 = TJ.C16534i.B(r7, r6)
                if (r7 != r0) goto L_0x0046
                return r0
            L_0x0046:
                java.util.List r7 = (java.util.List) r7
                eB.e r1 = r6.f126398e
                VA.e r1 = r1.H()
                java.lang.String r4 = r6.f126399f
                r6.f126396c = r7
                r6.f126397d = r3
                java.lang.Object r1 = r1.j(r4, r6)
                if (r1 != r0) goto L_0x005b
                return r0
            L_0x005b:
                eB.e r1 = r6.f126398e
                VA.a r1 = r1.G()
                java.lang.String r3 = r6.f126399f
                eB.e r4 = r6.f126398e
                java.time.Instant r4 = r4.D()
                r6.f126396c = r7
                r6.f126397d = r2
                java.lang.Object r1 = r1.k(r3, r4, r6)
                if (r1 != r0) goto L_0x0074
                return r0
            L_0x0074:
                r0 = r7
            L_0x0075:
                eB.e r7 = r6.f126398e
                aA.a r7 = r7.f126386i
                boolean r7 = r7.isLoggedIn()
                if (r7 == 0) goto L_0x00bc
                eB.e r7 = r6.f126398e
                java.lang.String r1 = r6.f126399f
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = YH.C16877v.y(r0, r3)
                r2.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x0096:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00b7
                java.lang.Object r3 = r0.next()
                WA.h r3 = (WA.h) r3
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem r4 = new com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem
                java.lang.String r5 = r3.b()
                int r3 = r3.g()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r4.<init>(r5, r3)
                r2.add(r4)
                goto L_0x0096
            L_0x00b7:
                java.lang.String r0 = "event_remove"
                r7.K(r1, r2, r0)
            L_0x00bc:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl", f = "ShoppingListRepositoryImpl.kt", l = {429, 431}, m = "createShoppingList")
    /* renamed from: eB.e$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126400c;

        /* renamed from: d  reason: collision with root package name */
        Object f126401d;

        /* renamed from: e  reason: collision with root package name */
        Object f126402e;

        /* renamed from: f  reason: collision with root package name */
        Object f126403f;

        /* renamed from: g  reason: collision with root package name */
        Object f126404g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f126405h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14377e f126406i;

        /* renamed from: j  reason: collision with root package name */
        int f126407j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14377e eVar, C17164e<? super c> eVar2) {
            super(eVar2);
            this.f126406i = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126405h = obj;
            this.f126407j |= Integer.MIN_VALUE;
            return this.f126406i.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl", f = "ShoppingListRepositoryImpl.kt", l = {437, 438}, m = "deleteShoppingList")
    /* renamed from: eB.e$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126408c;

        /* renamed from: d  reason: collision with root package name */
        Object f126409d;

        /* renamed from: e  reason: collision with root package name */
        Object f126410e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126411f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14377e f126412g;

        /* renamed from: h  reason: collision with root package name */
        int f126413h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14377e eVar, C17164e<? super d> eVar2) {
            super(eVar2);
            this.f126412g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126411f = obj;
            this.f126413h |= Integer.MIN_VALUE;
            return this.f126412g.d((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$deleteShoppingListItem$1", f = "ShoppingListRepositoryImpl.kt", l = {277, 281}, m = "invokeSuspend")
    /* renamed from: eB.e$e  reason: collision with other inner class name */
    static final class C3091e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14377e f126415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShoppingBagRequestItem f126416e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f126417f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3091e(C14377e eVar, ShoppingBagRequestItem shoppingBagRequestItem, String str, C17164e<? super C3091e> eVar2) {
            super(2, eVar2);
            this.f126415d = eVar;
            this.f126416e = shoppingBagRequestItem;
            this.f126417f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3091e(this.f126415d, this.f126416e, this.f126417f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3091e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f126414c;
            if (i10 == 0) {
                y.b(obj);
                C13741e H10 = this.f126415d.H();
                String a10 = this.f126416e.a();
                if (a10 == null) {
                    a10 = "";
                }
                String str = this.f126417f;
                this.f126414c = 1;
                if (H10.v(a10, str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13737a G10 = this.f126415d.G();
            String str2 = this.f126417f;
            Instant x10 = this.f126415d.D();
            this.f126414c = 2;
            if (G10.k(str2, x10, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$doAddShoppingListItems$2", f = "ShoppingListRepositoryImpl.kt", l = {248, 249}, m = "invokeSuspend")
    /* renamed from: eB.e$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f126418c;

        /* renamed from: d  reason: collision with root package name */
        Object f126419d;

        /* renamed from: e  reason: collision with root package name */
        Object f126420e;

        /* renamed from: f  reason: collision with root package name */
        Object f126421f;

        /* renamed from: g  reason: collision with root package name */
        Object f126422g;

        /* renamed from: h  reason: collision with root package name */
        Object f126423h;

        /* renamed from: i  reason: collision with root package name */
        Object f126424i;

        /* renamed from: j  reason: collision with root package name */
        Object f126425j;

        /* renamed from: k  reason: collision with root package name */
        Object f126426k;

        /* renamed from: l  reason: collision with root package name */
        Object f126427l;

        /* renamed from: m  reason: collision with root package name */
        Object f126428m;

        /* renamed from: n  reason: collision with root package name */
        Object f126429n;

        /* renamed from: o  reason: collision with root package name */
        Object f126430o;

        /* renamed from: p  reason: collision with root package name */
        int f126431p;

        /* renamed from: q  reason: collision with root package name */
        int f126432q;

        /* renamed from: r  reason: collision with root package name */
        int f126433r;

        /* renamed from: s  reason: collision with root package name */
        int f126434s;

        /* renamed from: t  reason: collision with root package name */
        int f126435t;

        /* renamed from: u  reason: collision with root package name */
        int f126436u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ C14377e f126437v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ List<WA.h> f126438w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ String f126439x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ List<C14613b.C3151b> f126440y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14377e eVar, List<WA.h> list, String str, List<C14613b.C3151b> list2, C17164e<? super f> eVar2) {
            super(2, eVar2);
            this.f126437v = eVar;
            this.f126438w = list;
            this.f126439x = str;
            this.f126440y = list2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f126437v, this.f126438w, this.f126439x, this.f126440y, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Iterable iterable;
            Iterator it;
            Object obj2;
            int i10;
            Object obj3;
            String str2;
            Object f10 = C17187b.f();
            int i11 = this.f126436u;
            if (i11 == 0) {
                y.b(obj);
                List<WA.h> list = this.f126438w;
                e eVar = e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                String str3 = null;
                str = null;
                ArrayList arrayList2 = arrayList;
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = arrayList2;
                        break;
                    }
                    obj3 = it2.next();
                    C11819b bVar = (C11819b) obj3;
                    if (str3 == null) {
                        String a10 = C11818a.a("add multiple products, items: " + list, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    } else {
                        str2 = str3;
                    }
                    if (str == null) {
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
                    }
                    str = str;
                    bVar.a(eVar, str, false, (Throwable) null, str2);
                    str3 = str2;
                    arrayList2 = obj3;
                }
                C13741e H10 = this.f126437v.H();
                List<WA.h> list2 = this.f126438w;
                this.f126418c = "ShoppingLists";
                this.f126419d = list;
                this.f126420e = eVar;
                this.f126421f = str3;
                this.f126422g = str;
                this.f126423h = arrayList;
                this.f126424i = it2;
                this.f126425j = obj3;
                this.f126431p = 0;
                this.f126432q = 0;
                this.f126433r = 0;
                this.f126434s = 0;
                this.f126435t = 0;
                this.f126436u = 1;
                if (H10.w(list2, this) == f10) {
                    return f10;
                }
                i10 = 0;
                iterable = arrayList;
                it = it2;
                obj2 = obj3;
            } else if (i11 == 1) {
                i10 = this.f126435t;
                obj2 = this.f126425j;
                it = (Iterator) this.f126424i;
                iterable = (Iterable) this.f126423h;
                str = (String) this.f126422g;
                String str4 = (String) this.f126421f;
                e eVar2 = (e) this.f126420e;
                List list3 = (List) this.f126419d;
                String str5 = (String) this.f126418c;
                y.b(obj);
            } else if (i11 == 2) {
                String str6 = (String) this.f126430o;
                List list4 = (List) this.f126429n;
                List list5 = (List) this.f126428m;
                String str7 = (String) this.f126427l;
                C16504A a11 = (C16504A) this.f126426k;
                Iterator it3 = (Iterator) this.f126424i;
                Iterable iterable2 = (Iterable) this.f126423h;
                String str8 = (String) this.f126422g;
                Iterator it4 = (Iterator) this.f126421f;
                Collection collection = (Collection) this.f126420e;
                Iterable iterable3 = (Iterable) this.f126419d;
                Iterable iterable4 = (Iterable) this.f126418c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16504A B10 = this.f126437v.f126389l;
            String str9 = this.f126439x;
            Iterable iterable5 = this.f126440y;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable5, 10));
            Iterator it5 = iterable5.iterator();
            while (it5.hasNext()) {
                arrayList3.add(((C14613b.C3151b) it5.next()).a());
            }
            C14613b.a aVar = new C14613b.a(str9, arrayList3);
            this.f126418c = iterable5;
            this.f126419d = iterable5;
            this.f126420e = arrayList3;
            this.f126421f = it5;
            this.f126422g = str;
            this.f126423h = iterable;
            this.f126424i = it;
            this.f126425j = obj2;
            this.f126426k = B10;
            this.f126427l = str9;
            this.f126428m = arrayList3;
            this.f126429n = arrayList3;
            this.f126430o = str9;
            this.f126431p = 0;
            this.f126432q = 0;
            this.f126433r = i10;
            this.f126436u = 2;
            if (B10.emit(aVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl", f = "ShoppingListRepositoryImpl.kt", l = {383, 397, 399}, m = "fetchRemoteShoppingListsAndItems-IoAF18A")
    /* renamed from: eB.e$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        /* synthetic */ Object f126441A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ C14377e f126442B;

        /* renamed from: C  reason: collision with root package name */
        int f126443C;

        /* renamed from: c  reason: collision with root package name */
        Object f126444c;

        /* renamed from: d  reason: collision with root package name */
        Object f126445d;

        /* renamed from: e  reason: collision with root package name */
        Object f126446e;

        /* renamed from: f  reason: collision with root package name */
        Object f126447f;

        /* renamed from: g  reason: collision with root package name */
        Object f126448g;

        /* renamed from: h  reason: collision with root package name */
        Object f126449h;

        /* renamed from: i  reason: collision with root package name */
        Object f126450i;

        /* renamed from: j  reason: collision with root package name */
        Object f126451j;

        /* renamed from: k  reason: collision with root package name */
        Object f126452k;

        /* renamed from: l  reason: collision with root package name */
        Object f126453l;

        /* renamed from: m  reason: collision with root package name */
        Object f126454m;

        /* renamed from: n  reason: collision with root package name */
        Object f126455n;

        /* renamed from: o  reason: collision with root package name */
        Object f126456o;

        /* renamed from: p  reason: collision with root package name */
        Object f126457p;

        /* renamed from: q  reason: collision with root package name */
        Object f126458q;

        /* renamed from: r  reason: collision with root package name */
        Object f126459r;

        /* renamed from: s  reason: collision with root package name */
        Object f126460s;

        /* renamed from: t  reason: collision with root package name */
        int f126461t;

        /* renamed from: u  reason: collision with root package name */
        int f126462u;

        /* renamed from: v  reason: collision with root package name */
        int f126463v;

        /* renamed from: w  reason: collision with root package name */
        int f126464w;

        /* renamed from: x  reason: collision with root package name */
        int f126465x;

        /* renamed from: y  reason: collision with root package name */
        int f126466y;

        /* renamed from: z  reason: collision with root package name */
        int f126467z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14377e eVar, C17164e<? super g> eVar2) {
            super(eVar2);
            this.f126442B = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126441A = obj;
            this.f126443C |= Integer.MIN_VALUE;
            Object h10 = this.f126442B.h(this);
            return h10 == C17187b.f() ? h10 : x.a(h10);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$h */
    public static final class h implements C16532g<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126468a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126469a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getAllProductNumbersFromAllLists$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$h$a$a  reason: collision with other inner class name */
            public static final class C3092a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126470c;

                /* renamed from: d  reason: collision with root package name */
                int f126471d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126472e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3092a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126472e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126470c = obj;
                    this.f126471d |= Integer.MIN_VALUE;
                    return this.f126472e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126469a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14377e.h.a.C3092a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.e$h$a$a r0 = (eB.C14377e.h.a.C3092a) r0
                    int r1 = r0.f126471d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126471d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$h$a$a r0 = new eB.e$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126470c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126471d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126469a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Set r5 = YH.C16877v.y1(r5)
                    r0.f126471d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f126468a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126468a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl", f = "ShoppingListRepositoryImpl.kt", l = {145}, m = "getRandomShoppingListItemNos")
    /* renamed from: eB.e$i */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126473c;

        /* renamed from: d  reason: collision with root package name */
        Object f126474d;

        /* renamed from: e  reason: collision with root package name */
        int f126475e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126476f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14377e f126477g;

        /* renamed from: h  reason: collision with root package name */
        int f126478h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C14377e eVar, C17164e<? super i> eVar2) {
            super(eVar2);
            this.f126477g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126476f = obj;
            this.f126478h |= Integer.MIN_VALUE;
            return this.f126477g.t(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$j */
    public static final class j implements C16532g<C14503e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126479a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$j$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126480a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getShoppingList$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$j$a$a  reason: collision with other inner class name */
            public static final class C3093a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126481c;

                /* renamed from: d  reason: collision with root package name */
                int f126482d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126483e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3093a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126483e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126481c = obj;
                    this.f126482d |= Integer.MIN_VALUE;
                    return this.f126483e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126480a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14377e.j.a.C3093a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.e$j$a$a r0 = (eB.C14377e.j.a.C3093a) r0
                    int r1 = r0.f126482d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126482d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$j$a$a r0 = new eB.e$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126481c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126482d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126480a
                    WA.f r5 = (WA.C13768f) r5
                    gB.e r5 = ZA.C13871a.e(r5)
                    r0.f126482d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.j.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public j(C16532g gVar) {
            this.f126479a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126479a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$k */
    public static final class k implements C16532g<C14505g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126484a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$k$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126485a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getShoppingListItem$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$k$a$a  reason: collision with other inner class name */
            public static final class C3094a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126486c;

                /* renamed from: d  reason: collision with root package name */
                int f126487d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126488e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3094a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126488e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126486c = obj;
                    this.f126487d |= Integer.MIN_VALUE;
                    return this.f126488e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126485a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14377e.k.a.C3094a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.e$k$a$a r0 = (eB.C14377e.k.a.C3094a) r0
                    int r1 = r0.f126487d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126487d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$k$a$a r0 = new eB.e$k$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126486c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126487d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126485a
                    WA.h r5 = (WA.h) r5
                    gB.g r5 = ZA.C13871a.f(r5)
                    r0.f126487d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.k.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public k(C16532g gVar) {
            this.f126484a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126484a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$l */
    public static final class l implements C16532g<List<? extends C14505g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126489a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$l$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126490a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getShoppingListItemsFlow$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$l$a$a  reason: collision with other inner class name */
            public static final class C3095a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126491c;

                /* renamed from: d  reason: collision with root package name */
                int f126492d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126493e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3095a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126493e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126491c = obj;
                    this.f126492d |= Integer.MIN_VALUE;
                    return this.f126493e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126490a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof eB.C14377e.l.a.C3095a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    eB.e$l$a$a r0 = (eB.C14377e.l.a.C3095a) r0
                    int r1 = r0.f126492d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126492d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$l$a$a r0 = new eB.e$l$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f126491c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126492d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f126490a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    WA.h r4 = (WA.h) r4
                    gB.g r4 = ZA.C13871a.f(r4)
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    r0.f126492d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.l.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f126489a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126489a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$m */
    public static final class m implements C16532g<List<? extends C14507i>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126494a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$m$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126495a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getShoppingListItemsWithProductDetails$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$m$a$a  reason: collision with other inner class name */
            public static final class C3096a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126496c;

                /* renamed from: d  reason: collision with root package name */
                int f126497d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126498e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3096a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126498e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126496c = obj;
                    this.f126497d |= Integer.MIN_VALUE;
                    return this.f126498e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126495a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof eB.C14377e.m.a.C3096a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    eB.e$m$a$a r0 = (eB.C14377e.m.a.C3096a) r0
                    int r1 = r0.f126497d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126497d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$m$a$a r0 = new eB.e$m$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f126496c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126497d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f126495a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    WA.i r4 = (WA.i) r4
                    gB.i r4 = ZA.C13871a.g(r4)
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    r0.f126497d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar) {
            this.f126494a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126494a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$n */
    public static final class n implements C16532g<List<? extends gB.k>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126499a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$n$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126500a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$getShoppingListsWithItems$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$n$a$a  reason: collision with other inner class name */
            public static final class C3097a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126501c;

                /* renamed from: d  reason: collision with root package name */
                int f126502d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126503e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3097a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126503e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126501c = obj;
                    this.f126502d |= Integer.MIN_VALUE;
                    return this.f126503e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126500a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof eB.C14377e.n.a.C3097a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    eB.e$n$a$a r0 = (eB.C14377e.n.a.C3097a) r0
                    int r1 = r0.f126502d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126502d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$n$a$a r0 = new eB.e$n$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f126501c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126502d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f126500a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    WA.k r4 = (WA.k) r4
                    gB.k r4 = ZA.C13871a.h(r4)
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    r0.f126502d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.n.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public n(C16532g gVar) {
            this.f126499a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126499a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.e$o */
    public static final class o implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126504a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.e$o$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126505a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$itemExistsInAnyList$$inlined$map$1$2", f = "ShoppingListRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.e$o$a$a  reason: collision with other inner class name */
            public static final class C3098a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126506c;

                /* renamed from: d  reason: collision with root package name */
                int f126507d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126508e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3098a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126508e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126506c = obj;
                    this.f126507d |= Integer.MIN_VALUE;
                    return this.f126508e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126505a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14377e.o.a.C3098a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.e$o$a$a r0 = (eB.C14377e.o.a.C3098a) r0
                    int r1 = r0.f126507d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126507d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.e$o$a$a r0 = new eB.e$o$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126506c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126507d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004e
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126505a
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    if (r5 <= 0) goto L_0x0040
                    r5 = r3
                    goto L_0x0041
                L_0x0040:
                    r5 = 0
                L_0x0041:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f126507d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.o.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public o(C16532g gVar) {
            this.f126504a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126504a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl", f = "ShoppingListRepositoryImpl.kt", l = {424, 425}, m = "renameShoppingList")
    /* renamed from: eB.e$p */
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126509c;

        /* renamed from: d  reason: collision with root package name */
        Object f126510d;

        /* renamed from: e  reason: collision with root package name */
        Object f126511e;

        /* renamed from: f  reason: collision with root package name */
        Object f126512f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f126513g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14377e f126514h;

        /* renamed from: i  reason: collision with root package name */
        int f126515i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C14377e eVar, C17164e<? super p> eVar2) {
            super(eVar2);
            this.f126514h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126513g = obj;
            this.f126515i |= Integer.MIN_VALUE;
            return this.f126514h.c((String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListRepositoryImpl$updateShoppingListItemQuantity$1", f = "ShoppingListRepositoryImpl.kt", l = {195, 196}, m = "invokeSuspend")
    /* renamed from: eB.e$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f126516c;

        /* renamed from: d  reason: collision with root package name */
        Object f126517d;

        /* renamed from: e  reason: collision with root package name */
        Object f126518e;

        /* renamed from: f  reason: collision with root package name */
        Object f126519f;

        /* renamed from: g  reason: collision with root package name */
        Object f126520g;

        /* renamed from: h  reason: collision with root package name */
        Object f126521h;

        /* renamed from: i  reason: collision with root package name */
        Object f126522i;

        /* renamed from: j  reason: collision with root package name */
        Object f126523j;

        /* renamed from: k  reason: collision with root package name */
        int f126524k;

        /* renamed from: l  reason: collision with root package name */
        int f126525l;

        /* renamed from: m  reason: collision with root package name */
        int f126526m;

        /* renamed from: n  reason: collision with root package name */
        int f126527n;

        /* renamed from: o  reason: collision with root package name */
        int f126528o;

        /* renamed from: p  reason: collision with root package name */
        int f126529p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C14377e f126530q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ String f126531r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f126532s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f126533t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(C14377e eVar, String str, int i10, String str2, C17164e<? super q> eVar2) {
            super(2, eVar2);
            this.f126530q = eVar;
            this.f126531r = str;
            this.f126532s = i10;
            this.f126533t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f126530q, this.f126531r, this.f126532s, this.f126533t, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            e eVar;
            String str3;
            String str4;
            Iterable iterable;
            Iterator it;
            Object obj2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            Object f10 = C17187b.f();
            int i15 = this.f126529p;
            if (i15 == 0) {
                y.b(obj);
                str2 = this.f126531r;
                eVar = e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = arrayList;
                while (true) {
                    str = "ShoppingLists";
                    if (!it2.hasNext()) {
                        obj2 = arrayList2;
                        break;
                    }
                    Object next2 = it2.next();
                    C11819b bVar = (C11819b) next2;
                    if (str6 == null) {
                        String a10 = C11818a.a("update ShoppingListItemWithChildrenEntity, item: " + str2, (Throwable) null);
                        if (a10 == null) {
                            obj2 = next2;
                            break;
                        }
                        str6 = C11820c.a(a10);
                    }
                    String str7 = str6;
                    if (str5 == null) {
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str;
                    }
                    String str8 = str5;
                    bVar.a(eVar, str8, false, (Throwable) null, str7);
                    str5 = str8;
                    arrayList2 = next2;
                    str6 = str7;
                }
                C13741e H10 = this.f126530q.H();
                String str9 = this.f126531r;
                int i16 = this.f126532s;
                String str10 = this.f126533t;
                this.f126516c = str;
                this.f126517d = str2;
                this.f126518e = eVar;
                this.f126519f = str6;
                this.f126520g = str5;
                this.f126521h = arrayList;
                this.f126522i = it2;
                this.f126523j = obj2;
                this.f126524k = 0;
                this.f126525l = 0;
                this.f126526m = 0;
                this.f126527n = 0;
                this.f126528o = 0;
                this.f126529p = 1;
                if (H10.n(str9, i16, str10, this) == f10) {
                    return f10;
                }
                it = it2;
                iterable = arrayList;
                i14 = 0;
                i13 = 0;
                i10 = 0;
                str4 = str5;
                i12 = 0;
                str3 = str6;
                i11 = 0;
            } else if (i15 == 1) {
                i14 = this.f126528o;
                i13 = this.f126527n;
                i12 = this.f126526m;
                i11 = this.f126525l;
                i10 = this.f126524k;
                obj2 = this.f126523j;
                it = (Iterator) this.f126522i;
                iterable = (Iterable) this.f126521h;
                str4 = (String) this.f126520g;
                str3 = (String) this.f126519f;
                eVar = (e) this.f126518e;
                str2 = (String) this.f126517d;
                str = (String) this.f126516c;
                y.b(obj);
            } else if (i15 == 2) {
                Iterator it3 = (Iterator) this.f126522i;
                Iterable iterable2 = (Iterable) this.f126521h;
                String str11 = (String) this.f126520g;
                String str12 = (String) this.f126519f;
                e eVar2 = (e) this.f126518e;
                String str13 = (String) this.f126517d;
                String str14 = (String) this.f126516c;
                y.b(obj);
                this.f126530q.K(this.f126533t, C16877v.e(new ShoppingBagRequestItem(this.f126531r, String.valueOf(this.f126532s))), "event_update");
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13737a G10 = this.f126530q.G();
            Object obj3 = f10;
            String str15 = this.f126533t;
            Instant x10 = this.f126530q.D();
            this.f126516c = str;
            this.f126517d = str2;
            this.f126518e = eVar;
            this.f126519f = str3;
            this.f126520g = str4;
            this.f126521h = iterable;
            this.f126522i = it;
            this.f126523j = obj2;
            this.f126524k = i10;
            this.f126525l = i11;
            this.f126526m = i12;
            this.f126527n = i13;
            this.f126528o = i14;
            this.f126529p = 2;
            Object obj4 = obj3;
            if (G10.k(str15, x10, this) == obj4) {
                return obj4;
            }
            this.f126530q.K(this.f126533t, C16877v.e(new ShoppingBagRequestItem(this.f126531r, String.valueOf(this.f126532s))), "event_update");
            return C16807N.f139792a;
        }
    }

    public C14377e(C13737a aVar, C13741e eVar, Wk.d dVar, C13915e eVar2, C13911a aVar2, C12860a aVar3, M m10, Q q10, C13909a aVar4, am.h hVar, C13560a aVar5) {
        Boolean value;
        C17542s.j(aVar, "shoppingListDao");
        C17542s.j(eVar, "shoppingListItemDao");
        C17542s.j(dVar, "stockRepository");
        C17542s.j(eVar2, "shoppingListSyncService");
        C17542s.j(aVar2, "shoppingListEndpoint");
        C17542s.j(aVar3, "localStoreSelectionRepository");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(q10, "appScope");
        C17542s.j(aVar4, "sessionManager");
        C17542s.j(hVar, "timeProvider");
        C17542s.j(aVar5, "shoppingListSharedAnalytics");
        this.f126378a = aVar;
        this.f126379b = eVar;
        this.f126380c = dVar;
        this.f126381d = eVar2;
        this.f126382e = aVar2;
        this.f126383f = aVar3;
        this.f126384g = m10;
        this.f126385h = q10;
        this.f126386i = aVar4;
        this.f126387j = hVar;
        this.f126388k = aVar5;
        C16504A<C14613b.a> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f126389l = b10;
        this.f126390m = C16534i.b(b10);
        C16505B<Boolean> J10 = p();
        do {
            value = J10.getValue();
            value.booleanValue();
        } while (!J10.e(value, Boolean.FALSE));
        this.f126392o = C16534i.M(C16534i.R(this.f126381d.i(), new a(this, (C17164e<? super a>) null)), this.f126385h);
    }

    /* access modifiers changed from: private */
    public final Instant D() {
        Instant instant = this.f126387j.a().toInstant();
        C17542s.i(instant, "toInstant(...)");
        return instant;
    }

    private final void E(String str, ShoppingBagRequestItem shoppingBagRequestItem) {
        if (this.f126386i.isLoggedIn()) {
            K(str, C16877v.e(shoppingBagRequestItem), "event_remove");
            F0 unused = C16314k.d(this.f126385h, this.f126384g, (T) null, new C3091e(this, shoppingBagRequestItem, str, (C17164e<? super C3091e>) null), 2, (Object) null);
        }
    }

    private final boolean F(String str, List<C14613b.C3151b> list) {
        String str2 = str;
        if (!this.f126386i.isLoggedIn()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C14613b.C3151b bVar : list) {
            arrayList.add(C13871a.b(bVar, str2, D()));
            if (bVar.b() <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Trying to add/update an item " + bVar.a() + " in shopping list with quantity: " + bVar.b());
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList3.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                String str5 = null;
                for (C11819b bVar2 : arrayList3) {
                    if (str4 == null) {
                        String a10 = C11818a.a(str3, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str4 = C11820c.a(a10);
                    }
                    String str6 = str4;
                    if (str5 == null) {
                        String name = C14377e.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', str3, 2, str3), '.', str3, 2, str3);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str7 = str5;
                    bVar2.a(eVar, str7, false, illegalArgumentException, str6);
                    str4 = str6;
                    str5 = str7;
                    str3 = str3;
                }
            } else {
                arrayList2.add(new ShoppingBagRequestItem(bVar.a(), String.valueOf(bVar.b())));
            }
        }
        K(str2, arrayList2, "event_add");
        F0 unused = C16314k.d(this.f126385h, this.f126384g, (T) null, new f(this, arrayList, str, list, (C17164e<? super f>) null), 2, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public final void I(List<bB.f> list) {
        C12832d c10 = this.f126383f.c();
        String e10 = c10 != null ? c10.e() : null;
        if (e10 != null) {
            ArrayList arrayList = new ArrayList();
            for (bB.f b10 : list) {
                Iterable<bB.e> b11 = b10.b();
                ArrayList arrayList2 = new ArrayList(C16877v.y(b11, 10));
                for (bB.e c11 : b11) {
                    arrayList2.add(c11.c());
                }
                C16877v.E(arrayList, arrayList2);
            }
            List m02 = C16877v.m0(arrayList);
            if (!m02.isEmpty()) {
                this.f126380c.a(e10, m02);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void K(String str, List<ShoppingBagRequestItem> list, String str2) {
        String str3;
        String str4 = str2;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str5 = null;
        String str6 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str3 = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str5 == null) {
                String a10 = C11818a.a("startSynchronizeWithShoppingListService, products: " + list.size() + ", syncEvent: " + str4, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            String str7 = str5;
            if (str6 == null) {
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str3 = DslKt.INDICATOR_MAIN;
                }
                str6 = str3 + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
            }
            String str8 = str6;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
        }
        if (list.isEmpty()) {
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str9 == null) {
                    String a11 = C11818a.a("No items provided, unable to sync", (Throwable) null);
                    if (a11 != null) {
                        str9 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str10 == null) {
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
                }
                bVar2.a(eVar2, str10, false, (Throwable) null, str9);
            }
            return;
        }
        this.f126381d.r(new SyncEventModel(str, list, str4));
    }

    public final C13737a G() {
        return this.f126378a;
    }

    public final C13741e H() {
        return this.f126379b;
    }

    /* renamed from: J */
    public C16505B<Boolean> p() {
        return this.f126391n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: dI.e<? super java.lang.String>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r11, dI.C17164e<? super java.lang.String> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof eB.C14377e.c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            eB.e$c r0 = (eB.C14377e.c) r0
            int r1 = r0.f126407j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126407j = r1
            goto L_0x0018
        L_0x0013:
            eB.e$c r0 = new eB.e$c
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f126405h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126407j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r5) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r11 = r0.f126404g
            WA.f r11 = (WA.C13768f) r11
            java.lang.Object r11 = r0.f126403f
            bB.b r11 = (bB.b) r11
            java.lang.Object r12 = r0.f126402e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f126401d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f126400c
            eB.e r12 = (eB.C14377e) r12
            XH.y.b(r1)
            goto L_0x009d
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0048:
            java.lang.Object r11 = r0.f126402e
            r12 = r11
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r11 = r0.f126401d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.f126400c
            eB.e r3 = (eB.C14377e) r3
            XH.y.b(r1)
            r9 = r1
            r1 = r12
            r12 = r3
            r3 = r9
            goto L_0x0074
        L_0x005d:
            XH.y.b(r1)
            aB.a r1 = r10.f126382e
            r0.f126400c = r10
            r0.f126401d = r11
            r0.f126402e = r12
            r0.f126407j = r5
            java.lang.Object r1 = r1.a(r11, r0)
            if (r1 != r2) goto L_0x0071
            return r2
        L_0x0071:
            r3 = r1
            r1 = r12
            r12 = r10
        L_0x0074:
            bB.b r3 = (bB.b) r3
            WA.f r5 = new WA.f
            java.lang.String r6 = r3.a()
            java.lang.String r7 = r3.b()
            java.time.Instant r8 = r3.c()
            r5.<init>(r6, r7, r8)
            VA.a r6 = r12.f126378a
            r0.f126400c = r12
            r0.f126401d = r11
            r0.f126402e = r1
            r0.f126403f = r3
            r0.f126404g = r5
            r0.f126407j = r4
            java.lang.Object r11 = r6.f(r5, r0)
            if (r11 != r2) goto L_0x009c
            return r2
        L_0x009c:
            r11 = r3
        L_0x009d:
            SA.a r12 = r12.f126388k
            r12.b()
            java.lang.String r11 = r11.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.a(java.lang.String, dI.e):java.lang.Object");
    }

    public C16532g<C14505g> b(String str, String str2) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "itemNo");
        return new k(C16534i.A(this.f126379b.b(str, str2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r7, java.lang.String r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof eB.C14377e.p
            if (r0 == 0) goto L_0x0013
            r0 = r9
            eB.e$p r0 = (eB.C14377e.p) r0
            int r1 = r0.f126515i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126515i = r1
            goto L_0x0018
        L_0x0013:
            eB.e$p r0 = new eB.e$p
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f126513g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126515i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005a
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r7 = r0.f126512f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f126511e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f126510d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f126509c
            eB.e r7 = (eB.C14377e) r7
            XH.y.b(r1)
            goto L_0x0084
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.f126512f
            r9 = r7
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r7 = r0.f126511e
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.f126510d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.f126509c
            eB.e r3 = (eB.C14377e) r3
            XH.y.b(r1)
            goto L_0x0071
        L_0x005a:
            XH.y.b(r1)
            aB.a r1 = r6.f126382e
            r0.f126509c = r6
            r0.f126510d = r7
            r0.f126511e = r8
            r0.f126512f = r9
            r0.f126515i = r5
            java.lang.Object r1 = r1.c(r7, r8, r0)
            if (r1 != r2) goto L_0x0070
            return r2
        L_0x0070:
            r3 = r6
        L_0x0071:
            VA.a r1 = r3.f126378a
            r0.f126509c = r3
            r0.f126510d = r7
            r0.f126511e = r8
            r0.f126512f = r9
            r0.f126515i = r4
            java.lang.Object r7 = r1.i(r7, r8, r0)
            if (r7 != r2) goto L_0x0084
            return r2
        L_0x0084:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof eB.C14377e.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            eB.e$d r0 = (eB.C14377e.d) r0
            int r1 = r0.f126413h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126413h = r1
            goto L_0x0018
        L_0x0013:
            eB.e$d r0 = new eB.e$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f126411f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126413h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0054
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r7 = r0.f126410e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f126409d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f126408c
            eB.e r7 = (eB.C14377e) r7
            XH.y.b(r1)
            goto L_0x007c
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f126410e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f126409d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.f126408c
            eB.e r3 = (eB.C14377e) r3
            XH.y.b(r1)
            r1 = r8
            r8 = r7
            r7 = r3
            goto L_0x006b
        L_0x0054:
            XH.y.b(r1)
            aB.a r1 = r6.f126382e
            r0.f126408c = r6
            r0.f126409d = r7
            r0.f126410e = r8
            r0.f126413h = r5
            java.lang.Object r1 = r1.d(r7, r0)
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            r1 = r8
            r8 = r7
            r7 = r6
        L_0x006b:
            VA.a r3 = r7.f126378a
            r0.f126408c = r7
            r0.f126409d = r8
            r0.f126410e = r1
            r0.f126413h = r4
            java.lang.Object r8 = r3.j(r8, r0)
            if (r8 != r2) goto L_0x007c
            return r2
        L_0x007c:
            SA.a r7 = r7.f126388k
            r7.a()
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.d(java.lang.String, dI.e):java.lang.Object");
    }

    public C16532g<C14503e> e(String str) {
        C17542s.j(str, "listId");
        return new j(C16534i.A(this.f126378a.e(str)));
    }

    public C16532g<Set<String>> f() {
        return new h(this.f126379b.t());
    }

    public C16532g<List<gB.k>> g() {
        return new n(this.f126378a.l());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v22, resolved type: EB.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: eB.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: eB.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: eB.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v34, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r22v18, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0351, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03d7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03d8, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03dc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03dd, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03df, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03e4, code lost:
        r22 = r6;
        r19 = com.sugarcube.core.logger.DslKt.INDICATOR_BACKGROUND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009f, code lost:
        r22 = r6;
        r19 = com.sugarcube.core.logger.DslKt.INDICATOR_BACKGROUND;
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ae, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01af, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b1, code lost:
        r23 = r9;
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b8, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0085, B:41:0x016f] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03b3 A[Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0293 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9 A[ExcHandler: CancellationException (r0v31 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:41:0x016f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018b A[SYNTHETIC, Splitter:B:48:0x018b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01db A[Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020b A[Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02ff A[Catch:{ CancellationException -> 0x00a9, all -> 0x03af }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(dI.C17164e<? super XH.x<XH.C16807N>> r35) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            boolean r2 = r0 instanceof eB.C14377e.g
            if (r2 == 0) goto L_0x0017
            r2 = r0
            eB.e$g r2 = (eB.C14377e.g) r2
            int r3 = r2.f126443C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f126443C = r3
            goto L_0x001c
        L_0x0017:
            eB.e$g r2 = new eB.e$g
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f126441A
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f126443C
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            r11 = 3
            r12 = 2
            r13 = 1
            if (r5 == 0) goto L_0x0117
            if (r5 == r13) goto L_0x00f4
            if (r5 == r12) goto L_0x00b4
            if (r5 != r11) goto L_0x00ac
            int r0 = r2.f126463v
            int r5 = r2.f126462u
            int r14 = r2.f126461t
            java.lang.Object r11 = r2.f126460s
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r2.f126459r
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r2.f126458q
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r2.f126457p
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r2.f126456o
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f126455n
            VA.e r12 = (VA.C13741e) r12
            java.lang.Object r12 = r2.f126454m
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r2.f126453l
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r2.f126452k
            bB.f r12 = (bB.f) r12
            java.lang.Object r12 = r2.f126450i
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r10 = r2.f126449h
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r15 = r2.f126448g
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r13 = r2.f126447f
            eB.e r13 = (eB.C14377e) r13
            r35 = r0
            java.lang.Object r0 = r2.f126446e
            eB.e r0 = (eB.C14377e) r0
            r19 = r0
            java.lang.Object r0 = r2.f126445d
            dI.e r0 = (dI.C17164e) r0
            r20 = r0
            java.lang.Object r0 = r2.f126444c
            r21 = r0
            eB.e r21 = (eB.C14377e) r21
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x00a9, all -> 0x009e }
            r1 = r35
            r22 = r6
            r23 = r9
            r3 = r13
            r6 = r14
            r13 = r19
            r0 = r20
            r14 = 3
            r19 = r7
            r20 = r8
            r7 = r4
            r4 = r21
            goto L_0x03a4
        L_0x009e:
            r0 = move-exception
            r22 = r6
            r19 = r7
            r20 = r8
        L_0x00a5:
            r23 = r9
            goto L_0x03f4
        L_0x00a9:
            r0 = move-exception
            goto L_0x04e0
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x00b4:
            int r0 = r2.f126462u
            int r5 = r2.f126461t
            java.lang.Object r10 = r2.f126455n
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r2.f126454m
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r2.f126453l
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f126452k
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r2.f126451j
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r2.f126450i
            qv.e r11 = (qv.e) r11
            java.lang.Object r11 = r2.f126449h
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r2.f126448g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f126447f
            eB.e r12 = (eB.C14377e) r12
            java.lang.Object r13 = r2.f126446e
            eB.e r13 = (eB.C14377e) r13
            java.lang.Object r14 = r2.f126445d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f126444c
            r21 = r15
            eB.e r21 = (eB.C14377e) r21
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x00a9, all -> 0x009e }
            r19 = r7
            r20 = r8
            r7 = r4
            goto L_0x02e1
        L_0x00f4:
            int r0 = r2.f126462u
            int r5 = r2.f126461t
            java.lang.Object r10 = r2.f126447f
            eB.e r10 = (eB.C14377e) r10
            java.lang.Object r11 = r2.f126446e
            eB.e r11 = (eB.C14377e) r11
            java.lang.Object r12 = r2.f126445d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f126444c
            r21 = r13
            eB.e r21 = (eB.C14377e) r21
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x00a9, all -> 0x009e }
            r13 = r11
            r11 = r21
            r32 = r10
            r10 = r0
            r0 = r12
            r12 = r32
            goto L_0x016f
        L_0x0117:
            XH.y.b(r3)
            aA.a r3 = r1.f126386i
            boolean r3 = r3.isLoggedIn()
            if (r3 == 0) goto L_0x04e7
            TJ.B r3 = r34.p()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0134
            goto L_0x04e7
        L_0x0134:
            TJ.B r3 = r34.p()
        L_0x0138:
            java.lang.Object r5 = r3.getValue()
            r10 = r5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
            r10 = 1
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r10)
            boolean r5 = r3.e(r5, r11)
            if (r5 == 0) goto L_0x04e1
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            aB.a r3 = r1.f126382e     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126444c = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126445d = r0     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126446e = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126447f = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r5 = 0
            r2.f126461t = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126462u = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r2.f126463v = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            r5 = 1
            r2.f126443C = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            java.lang.Object r3 = r3.i(r2)     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e9 }
            if (r3 != r4) goto L_0x016a
            return r4
        L_0x016a:
            r11 = r1
            r12 = r11
            r13 = r12
            r5 = 0
            r10 = 0
        L_0x016f:
            java.util.List r3 = (java.util.List) r3     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e3 }
            r14 = r3
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e3 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x00a9, all -> 0x03e3 }
            r19 = r7
            r1 = 10
            int r7 = YH.C16877v.y(r14, r1)     // Catch:{ CancellationException -> 0x00a9, all -> 0x03dc }
            r15.<init>(r7)     // Catch:{ CancellationException -> 0x00a9, all -> 0x03dc }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ CancellationException -> 0x00a9, all -> 0x03dc }
        L_0x0185:
            boolean r7 = r1.hasNext()     // Catch:{ CancellationException -> 0x00a9, all -> 0x03dc }
            if (r7 == 0) goto L_0x01bb
            java.lang.Object r7 = r1.next()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01b7 }
            bB.f r7 = (bB.f) r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01b7 }
            WA.f r14 = new WA.f     // Catch:{ CancellationException -> 0x00a9, all -> 0x01b7 }
            r35 = r1
            java.lang.String r1 = r7.a()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01b7 }
            r20 = r8
            java.lang.String r8 = r7.c()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.time.Instant r7 = r7.d()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r14.<init>(r1, r8, r7)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r15.add(r14)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r1 = r35
            r8 = r20
            goto L_0x0185
        L_0x01ae:
            r0 = move-exception
        L_0x01af:
            r22 = r6
        L_0x01b1:
            r23 = r9
            r21 = r11
            goto L_0x03f4
        L_0x01b7:
            r0 = move-exception
            r20 = r8
            goto L_0x01af
        L_0x01bb:
            r20 = r8
            r12.I(r3)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.String r1 = "ShoppingLists"
            qv.e r7 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            qv.d r8 = qv.d.f102012a     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.util.List r8 = r8.a()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r14.<init>()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
        L_0x01d5:
            boolean r21 = r8.hasNext()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r21 == 0) goto L_0x01f9
            r27 = r4
            java.lang.Object r4 = r8.next()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r35 = r8
            r8 = r4
            qv.b r8 = (qv.C11819b) r8     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r28 = r10
            r10 = 0
            boolean r8 = r8.b(r7, r10)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r8 == 0) goto L_0x01f2
            r14.add(r4)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
        L_0x01f2:
            r8 = r35
            r4 = r27
            r10 = r28
            goto L_0x01d5
        L_0x01f9:
            r27 = r4
            r28 = r10
            java.util.Iterator r4 = r14.iterator()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r21 = r14
            r8 = 0
            r10 = 0
        L_0x0205:
            boolean r22 = r4.hasNext()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r22 == 0) goto L_0x0293
            java.lang.Object r29 = r4.next()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r21 = r29
            qv.b r21 = (qv.C11819b) r21     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r35 = r5
            if (r8 != 0) goto L_0x024f
            FB.a r22 = r12.f126383f     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            EB.d r22 = r22.c()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r22 == 0) goto L_0x022a
            java.lang.String r22 = r22.e()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r30 = r4
            r5 = r22
            goto L_0x022d
        L_0x022a:
            r30 = r4
            r5 = 0
        L_0x022d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r4.<init>()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r31 = r14
            java.lang.String r14 = "update lists after fetch, storeId: "
            r4.append(r14)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r4.append(r5)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.String r4 = r4.toString()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5 = 0
            java.lang.String r4 = qv.C11818a.a(r4, r5)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r4 != 0) goto L_0x024a
            r4 = r29
            goto L_0x029b
        L_0x024a:
            java.lang.String r8 = qv.C11820c.a(r4)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            goto L_0x0253
        L_0x024f:
            r30 = r4
            r31 = r14
        L_0x0253:
            if (r10 != 0) goto L_0x027b
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.String r4 = r4.getName()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r9, r5)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            if (r4 == 0) goto L_0x0267
            r4 = r20
            goto L_0x0269
        L_0x0267:
            r4 = r19
        L_0x0269:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5.<init>()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5.append(r4)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5.append(r6)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5.append(r1)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.String r10 = r5.toString()     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
        L_0x027b:
            r24 = 0
            r22 = r7
            r23 = r10
            r4 = 0
            r25 = r4
            r26 = r8
            r21.a(r22, r23, r24, r25, r26)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r5 = r35
            r21 = r29
            r4 = r30
            r14 = r31
            goto L_0x0205
        L_0x0293:
            r30 = r4
            r35 = r5
            r31 = r14
            r4 = r21
        L_0x029b:
            VA.a r5 = r12.f126378a     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126444c = r11     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126445d = r0     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126446e = r13     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126447f = r12     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126448g = r3     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126449h = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126450i = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126451j = r8     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126452k = r10     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126453l = r15     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r1 = r31
            r2.f126454m = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r1 = r30
            r2.f126455n = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126456o = r4     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r1 = r35
            r2.f126461t = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r4 = r28
            r2.f126462u = r4     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r7 = 0
            r2.f126463v = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126464w = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126465x = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126466y = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r2.f126467z = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r7 = 2
            r2.f126443C = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            java.lang.Object r5 = r5.m(r15, r2)     // Catch:{ CancellationException -> 0x00a9, all -> 0x01ae }
            r7 = r27
            if (r5 != r7) goto L_0x02da
            return r7
        L_0x02da:
            r14 = r0
            r5 = r1
            r0 = r4
            r21 = r11
            r10 = r15
            r11 = r3
        L_0x02e1:
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x03d7 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ CancellationException -> 0x00a9, all -> 0x03d7 }
            r15 = r11
            r4 = r21
            r11 = r10
            r10 = r1
            r1 = 0
            r32 = r5
            r5 = r0
            r0 = r14
            r14 = r32
            r33 = r12
            r12 = r3
            r3 = r33
        L_0x02f9:
            boolean r8 = r12.hasNext()     // Catch:{ CancellationException -> 0x00a9, all -> 0x03af }
            if (r8 == 0) goto L_0x03b3
            java.lang.Object r8 = r12.next()     // Catch:{ CancellationException -> 0x00a9, all -> 0x03af }
            r22 = r6
            r6 = r8
            bB.f r6 = (bB.f) r6     // Catch:{ CancellationException -> 0x00a9, all -> 0x03ab }
            r23 = r9
            VA.e r9 = r3.f126379b     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r27 = r7
            java.lang.String r7 = r6.a()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            java.util.List r21 = r6.b()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r24 = r1
            r1 = r21
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r21 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r18 = r11
            r25 = r14
            r14 = 10
            int r11 = YH.C16877v.y(r1, r14)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r5.<init>(r11)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
        L_0x0331:
            boolean r26 = r11.hasNext()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            if (r26 == 0) goto L_0x0356
            java.lang.Object r26 = r11.next()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r14 = r26
            bB.e r14 = (bB.e) r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r35 = r11
            java.lang.String r11 = r6.a()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            WA.i r11 = ZA.C13872b.q(r14, r11)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r5.add(r11)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r11 = r35
            r14 = 10
            goto L_0x0331
        L_0x0351:
            r0 = move-exception
        L_0x0352:
            r21 = r4
            goto L_0x03f4
        L_0x0356:
            r35 = r11
            r2.f126444c = r4     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126445d = r0     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126446e = r13     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126447f = r3     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126448g = r15     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126449h = r10     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126450i = r12     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126451j = r8     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126452k = r6     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126453l = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126454m = r7     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126455n = r9     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r6 = r18
            r2.f126456o = r6     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126457p = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126458q = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r1 = r35
            r2.f126459r = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126460s = r5     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r1 = r25
            r2.f126461t = r1     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r8 = r21
            r2.f126462u = r8     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r11 = r24
            r2.f126463v = r11     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r14 = 0
            r2.f126464w = r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126465x = r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.f126466y = r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r14 = 3
            r2.f126443C = r14     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            java.lang.Object r5 = r9.m(r7, r5, r2)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r7 = r27
            if (r5 != r7) goto L_0x039d
            return r7
        L_0x039d:
            r5 = r8
            r32 = r6
            r6 = r1
            r1 = r11
            r11 = r32
        L_0x03a4:
            r14 = r6
            r6 = r22
            r9 = r23
            goto L_0x02f9
        L_0x03ab:
            r0 = move-exception
        L_0x03ac:
            r23 = r9
            goto L_0x0352
        L_0x03af:
            r0 = move-exception
            r22 = r6
            goto L_0x03ac
        L_0x03b3:
            r22 = r6
            r23 = r9
            TJ.B r0 = r3.p()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
        L_0x03bb:
            java.lang.Object r1 = r0.getValue()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2.booleanValue()     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            if (r1 == 0) goto L_0x03bb
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x00a9, all -> 0x0351 }
            goto L_0x0400
        L_0x03d7:
            r0 = move-exception
            r22 = r6
            goto L_0x00a5
        L_0x03dc:
            r0 = move-exception
            r22 = r6
        L_0x03df:
            r20 = r8
            goto L_0x01b1
        L_0x03e3:
            r0 = move-exception
            r22 = r6
            r19 = r7
            goto L_0x03df
        L_0x03e9:
            r0 = move-exception
            r22 = r6
            r19 = r7
            r20 = r8
            r23 = r9
            r21 = r34
        L_0x03f4:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
            r4 = r21
        L_0x0400:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 == 0) goto L_0x04df
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0419:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0431
            java.lang.Object r6 = r3.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x0419
            r5.add(r6)
            goto L_0x0419
        L_0x0431:
            java.util.Iterator r3 = r5.iterator()
            r5 = 0
            r6 = 0
        L_0x0437:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x04c6
            java.lang.Object r7 = r3.next()
            qv.b r7 = (qv.C11819b) r7
            if (r5 != 0) goto L_0x0453
            java.lang.String r5 = "Problem getting shopping lists and items"
            java.lang.String r5 = qv.C11818a.a(r5, r1)
            if (r5 != 0) goto L_0x044f
            goto L_0x04c6
        L_0x044f:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0453:
            r11 = r5
            if (r6 != 0) goto L_0x04a9
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r12 = 2
            r13 = 0
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r13, r12, r13)
            r8 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r8, r13, r12, r13)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x0476
            goto L_0x047c
        L_0x0476:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x047c:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r15 = r23
            r14 = 1
            boolean r6 = HJ.C15854t.b0(r6, r15, r14)
            if (r6 == 0) goto L_0x0490
            r6 = r20
            goto L_0x0492
        L_0x0490:
            r6 = r19
        L_0x0492:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r10 = r22
            r8.append(r10)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
        L_0x04a6:
            r16 = r6
            goto L_0x04b1
        L_0x04a9:
            r10 = r22
            r15 = r23
            r12 = 2
            r13 = 0
            r14 = 1
            goto L_0x04a6
        L_0x04b1:
            r8 = 0
            r5 = r7
            r6 = r2
            r7 = r16
            r9 = r1
            r17 = r10
            r10 = r11
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            r23 = r15
            r6 = r16
            r22 = r17
            goto L_0x0437
        L_0x04c6:
            TJ.B r1 = r4.p()
        L_0x04ca:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r4 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r4)
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto L_0x04ca
        L_0x04df:
            return r0
        L_0x04e0:
            throw r0
        L_0x04e1:
            r19 = r7
            r1 = r34
            goto L_0x0138
        L_0x04e7:
            XH.x$a r0 = XH.x.f139812b
            XH.N r0 = XH.C16807N.f139792a
            java.lang.Object r0 = XH.x.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.h(dI.e):java.lang.Object");
    }

    public boolean j(String str, List<C14613b.C3151b> list, De.a aVar, Ae.k kVar) {
        C17542s.j(str, "listId");
        C17542s.j(list, "items");
        C17542s.j(aVar, "component");
        for (C14613b.C3151b bVar : list) {
            this.f126388k.c(bVar.a(), bVar.b(), aVar, kVar);
        }
        return F(str, list);
    }

    public C16532g<Boolean> k(String str) {
        C17542s.j(str, "itemNo");
        return new o(this.f126379b.u(str));
    }

    public void l(String str, C14613b.C3151b bVar, De.a aVar, Ae.k kVar) {
        C17542s.j(str, "listId");
        C17542s.j(bVar, "item");
        E(str, new ShoppingBagRequestItem(bVar.a(), String.valueOf(1)));
        if (aVar != null) {
            this.f126388k.e(bVar.a(), bVar.b(), aVar, kVar);
        }
    }

    public C16532g<List<C14505g>> m(String str) {
        C17542s.j(str, "listId");
        return new l(this.f126379b.h(str));
    }

    public void n(String str) {
        C17542s.j(str, "listId");
        F0 unused = C16314k.d(this.f126385h, this.f126384g, (T) null, new b(this, str, (C17164e<? super b>) null), 2, (Object) null);
    }

    public void o(String str, String str2, int i10) {
        int i11 = i10;
        C17542s.j(str, "listId");
        C17542s.j(str2, "itemNo");
        if (this.f126386i.isLoggedIn()) {
            if (i11 <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Trying to add/update an item in shopping list with quantity: " + i11);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 != null) {
                            str3 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str4 == null) {
                        String name = C14377e.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str4;
                    bVar.a(eVar, str5, false, illegalArgumentException, str3);
                    str4 = str5;
                }
                return;
            }
            F0 unused = C16314k.d(this.f126385h, this.f126384g, (T) null, new q(this, str2, i10, str, (C17164e<? super q>) null), 2, (Object) null);
        }
    }

    public C16532g<List<C14507i>> q(String str) {
        C17542s.j(str, "listId");
        return new m(this.f126379b.f(str));
    }

    public void s(String str) {
        C17542s.j(str, "id");
        this.f126381d.s(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[LOOP:0: B:16:0x005e->B:18:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object t(int r6, dI.C17164e<? super java.util.List<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eB.C14377e.i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            eB.e$i r0 = (eB.C14377e.i) r0
            int r1 = r0.f126478h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126478h = r1
            goto L_0x0018
        L_0x0013:
            eB.e$i r0 = new eB.e$i
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f126476f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126478h
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f126474d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126473c
            eB.e r6 = (eB.C14377e) r6
            XH.y.b(r1)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            VA.e r1 = r5.f126379b
            r0.f126473c = r5
            r0.f126474d = r7
            r0.f126475e = r6
            r0.f126478h = r4
            java.lang.Object r1 = r1.s(r6, r0)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L_0x005e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r7.next()
            WA.h r0 = (WA.h) r0
            java.lang.String r0 = r0.b()
            r6.add(r0)
            goto L_0x005e
        L_0x0072:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eB.C14377e.t(int, dI.e):java.lang.Object");
    }

    public C16532g<C14613b.a> u() {
        return this.f126390m;
    }

    public Object v(C17164e<? super C16807N> eVar) {
        Boolean value;
        e eVar2 = e.DEBUG;
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
                String a10 = C11818a.a("reset repository", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
            }
            String str4 = str2;
            bVar.a(eVar2, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C16505B<Boolean> J10 = p();
        do {
            value = J10.getValue();
            value.booleanValue();
        } while (!J10.e(value, kotlin.coroutines.jvm.internal.b.a(false)));
        F0.a.a(this.f126392o, (CancellationException) null, 1, (Object) null);
        this.f126381d.w();
        Object b10 = this.f126378a.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }
}
