package qn;

import D4.P;
import HJ.C15854t;
import KJ.C15987c;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import QJ.b1;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.C16877v;
import aq.C11079a;
import aq.C11080b;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11520b;
import mp.C11588a;
import nI.C17631a;
import nI.p;
import on.C11686a;
import pn.C11763c;
import qn.k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tI.C17978n;
import un.C12068a;
import un.d;
import un.e;
import vn.C12196a;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B©\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H@¢\u0006\u0004\b#\u0010$J>\u0010,\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+0*2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H@¢\u0006\u0004\b,\u0010-JA\u00102\u001a\u0004\u0018\u00010\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0007¢\u0006\u0004\b2\u00103J#\u00106\u001a\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000304H\u0016¢\u0006\u0004\b6\u00107J*\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H@¢\u0006\u0004\b8\u0010$J,\u00109\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+0*2\u0006\u0010%\u001a\u00020\u0002H@¢\u0006\u0004\b9\u0010:J!\u0010=\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u0004\u0018\u00010\u0003*\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bD\u0010>J!\u0010F\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\u0006\u0010E\u001a\u00020&H\u0002¢\u0006\u0004\bF\u0010>J!\u0010I\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ#\u0010M\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ#\u0010Q\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;2\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020T0*2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\bU\u0010VJ \u0010Y\u001a\u00020<2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\fH@¢\u0006\u0004\bY\u0010ZJ)\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0+0+2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0+H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010gR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010gR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010gR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010gR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bp\u0010gR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010mR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010,R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010jR\u0016\u0010w\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010,R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010jR\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010jR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010y¨\u0006{"}, d2 = {"Lqn/l;", "LD4/P;", "Lqn/k$a;", "Lun/d;", "Lpn/c;", "plpRepository", "LTp/b;", "discoverRepository", "LMg/b;", "localHistoryRepository", "LQJ/M;", "dispatcher", "", "type", "id", "", "useIdAsGroupParameter", "fallbackTitle", "Lkotlin/Function0;", "sortByFilter", "filters", "includedItemNos", "prioritiser", "Lun/a;", "availabilityParams", "", "pageSize", "Lon/a;", "plpAnalytics", "enableCompleteKitchen", "<init>", "(Lpn/c;LTp/b;LMg/b;LQJ/M;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LnI/a;LnI/a;Ljava/lang/String;Ljava/lang/String;LnI/a;ILon/a;Z)V", "LD4/P$a;", "params", "LD4/P$b;", "f", "(LD4/P$a;LdI/e;)Ljava/lang/Object;", "key", "Lun/b;", "plpDetails", "Laq/b;", "discoveries", "LXH/v;", "", "I", "(Lqn/k$a;Lun/b;Laq/b;LdI/e;)Ljava/lang/Object;", "pageToken", "total", "isApiUsingTokens", "pagingDisabled", "C", "(LD4/P$a;Ljava/lang/String;IZZ)Lqn/k$a;", "LD4/Q;", "state", "F", "(LD4/Q;)Lqn/k$a;", "G", "E", "(Lqn/k$a;LdI/e;)Ljava/lang/Object;", "", "LXH/N;", "u", "(Ljava/util/List;Lun/b;)V", "v", "(Ljava/util/List;Laq/b;)V", "Laq/a;", "H", "(Laq/a;)Lun/d;", "z", "result", "w", "Lkp/b;", "campaigns", "t", "(Ljava/util/List;Lkp/b;)V", "Lvn/d;", "header", "x", "(Ljava/util/List;Lvn/d;)V", "Lvn/e;", "inspirationFeed", "y", "(Ljava/util/List;Lvn/e;)V", "Lun/e;", "Lun/c;", "D", "(Lqn/k$a;)LXH/v;", "hasResults", "phrase", "A", "(ZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "Lmp/a;", "list", "B", "(Ljava/util/List;)Ljava/util/List;", "b", "Lpn/c;", "c", "LTp/b;", "d", "LMg/b;", "e", "LQJ/M;", "Ljava/lang/String;", "g", "h", "Z", "i", "j", "LnI/a;", "k", "l", "m", "n", "o", "p", "Lon/a;", "q", "r", "totalNumberOfProducts", "s", "Ljava/util/List;", "injectables", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends P<k.a, un.d> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11763c f101767b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Tp.b f101768c;

    /* renamed from: d  reason: collision with root package name */
    private final Mg.b f101769d;

    /* renamed from: e  reason: collision with root package name */
    private final M f101770e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f101771f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f101772g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final boolean f101773h;

    /* renamed from: i  reason: collision with root package name */
    private final String f101774i;

    /* renamed from: j  reason: collision with root package name */
    private final C17631a<String> f101775j;

    /* renamed from: k  reason: collision with root package name */
    private final C17631a<String> f101776k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final String f101777l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final String f101778m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C17631a<C12068a> f101779n;

    /* renamed from: o  reason: collision with root package name */
    private final int f101780o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11686a f101781p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f101782q;

    /* renamed from: r  reason: collision with root package name */
    private int f101783r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f101784s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f101785t;

    /* renamed from: u  reason: collision with root package name */
    private final List<un.d> f101786u;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "Lun/d;", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource$getPlpItems$2", f = "PlpPagingSource.kt", l = {141, 150, 157, 177}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super v<? extends String, ? extends List<? extends un.d>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101787c;

        /* renamed from: d  reason: collision with root package name */
        Object f101788d;

        /* renamed from: e  reason: collision with root package name */
        Object f101789e;

        /* renamed from: f  reason: collision with root package name */
        Object f101790f;

        /* renamed from: g  reason: collision with root package name */
        Object f101791g;

        /* renamed from: h  reason: collision with root package name */
        Object f101792h;

        /* renamed from: i  reason: collision with root package name */
        Object f101793i;

        /* renamed from: j  reason: collision with root package name */
        Object f101794j;

        /* renamed from: k  reason: collision with root package name */
        int f101795k;

        /* renamed from: l  reason: collision with root package name */
        int f101796l;

        /* renamed from: m  reason: collision with root package name */
        int f101797m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f101798n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f101799o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ l f101800p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ k.a f101801q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ e f101802r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ un.c f101803s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Laq/b;", "<anonymous>", "(LQJ/Q;)Laq/b;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource$getPlpItems$2$discoveriesDeferred$1", f = "PlpPagingSource.kt", l = {119}, m = "invokeSuspend")
        /* renamed from: qn.l$a$a  reason: collision with other inner class name */
        static final class C2417a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C11080b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f101804c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ l f101805d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2417a(l lVar, C17164e<? super C2417a> eVar) {
                super(2, eVar);
                this.f101805d = lVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2417a(this.f101805d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C11080b> eVar) {
                return ((C2417a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f101804c;
                if (i10 == 0) {
                    y.b(obj);
                    Tp.b j10 = this.f101805d.f101768c;
                    String o10 = this.f101805d.f101778m;
                    this.f101804c = 1;
                    obj = j10.b(o10, this);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lun/b;", "<anonymous>", "(LQJ/Q;)Lun/b;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource$getPlpItems$2$plpDetailsDeferred$1", f = "PlpPagingSource.kt", l = {126}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super un.b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f101806c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ l f101807d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e f101808e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ un.c f101809f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(l lVar, e eVar, un.c cVar, C17164e<? super b> eVar2) {
                super(2, eVar2);
                this.f101807d = lVar;
                this.f101808e = eVar;
                this.f101809f = cVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f101807d, this.f101808e, this.f101809f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super un.b> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f101806c;
                if (i10 == 0) {
                    y.b(obj);
                    C11763c n10 = this.f101807d.f101767b;
                    String k10 = this.f101807d.f101772g;
                    String p10 = this.f101807d.f101771f;
                    String l10 = this.f101807d.f101777l;
                    boolean q10 = this.f101807d.f101773h;
                    boolean e10 = C17542s.e(this.f101807d.f101771f, "user-recommendations");
                    this.f101806c = 1;
                    Object a10 = C11763c.a.a(n10, k10, p10, false, this.f101808e, this.f101809f, (C12068a) this.f101807d.f101779n.invoke(), l10, q10, e10, this, 4, (Object) null);
                    return a10 == f10 ? f10 : a10;
                } else if (i10 == 1) {
                    y.b(obj);
                    return obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, l lVar, k.a aVar, e eVar, un.c cVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f101799o = z10;
            this.f101800p = lVar;
            this.f101801q = aVar;
            this.f101802r = eVar;
            this.f101803s = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f101799o, this.f101800p, this.f101801q, this.f101802r, this.f101803s, eVar);
            aVar.f101798n = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super v<String, ? extends List<? extends un.d>>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: aq.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: aq.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: aq.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: aq.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: QJ.Y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: QJ.Y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: un.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: QJ.Y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: QJ.Y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: vn.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: vn.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: vn.d} */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b2, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
            r28 = r4;
            r29 = r5;
            r30 = r10;
            r4 = r17;
            r11 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02af, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b0, code lost:
            r18 = r9;
            r20 = r12;
            r12 = r5;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0078, B:84:0x0275] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x03bf  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0428 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0096 A[ExcHandler: CancellationException (r0v58 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0078] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0255 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x02c6  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x02d3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                r33 = this;
                r1 = r33
                java.lang.Object r2 = eI.C17187b.f()
                int r0 = r1.f101797m
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                java.lang.String r10 = "Failed to get prioritiser discoveries"
                r11 = 4
                r12 = 3
                r13 = 1
                r14 = 2
                r15 = 0
                r8 = 0
                if (r0 == 0) goto L_0x00e0
                if (r0 == r13) goto L_0x00bd
                if (r0 == r14) goto L_0x0099
                if (r0 == r12) goto L_0x004b
                if (r0 != r11) goto L_0x0043
                java.lang.Object r0 = r1.f101791g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f101790f
                un.b r0 = (un.b) r0
                java.lang.Object r0 = r1.f101789e
                aq.b r0 = (aq.C11080b) r0
                java.lang.Object r0 = r1.f101788d
                QJ.Y r0 = (QJ.Y) r0
                java.lang.Object r0 = r1.f101787c
                QJ.Y r0 = (QJ.Y) r0
                java.lang.Object r0 = r1.f101798n
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r34)
                r0 = r34
                goto L_0x0429
            L_0x0043:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x004b:
                java.lang.Object r0 = r1.f101794j
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f101793i
                qn.l r0 = (qn.l) r0
                java.lang.Object r0 = r1.f101792h
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f101791g
                r12 = r0
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r0 = r1.f101790f
                r17 = r0
                un.b r17 = (un.b) r17
                java.lang.Object r0 = r1.f101789e
                aq.b r0 = (aq.C11080b) r0
                java.lang.Object r0 = r1.f101788d
                r18 = r0
                QJ.Y r18 = (QJ.Y) r18
                java.lang.Object r0 = r1.f101787c
                r19 = r0
                QJ.Y r19 = (QJ.Y) r19
                java.lang.Object r0 = r1.f101798n
                r20 = r0
                QJ.Q r20 = (QJ.Q) r20
                XH.y.b(r34)     // Catch:{ CancellationException -> 0x0096, all -> 0x0089 }
                r0 = r34
                r28 = r4
                r29 = r5
                r30 = r10
                r4 = r17
                r11 = r19
                goto L_0x02a1
            L_0x0089:
                r0 = move-exception
                r28 = r4
                r29 = r5
                r30 = r10
                r4 = r17
                r11 = r19
                goto L_0x02b5
            L_0x0096:
                r0 = move-exception
                goto L_0x03b2
            L_0x0099:
                java.lang.Object r0 = r1.f101789e
                aq.b r0 = (aq.C11080b) r0
                java.lang.Object r11 = r1.f101788d
                QJ.Y r11 = (QJ.Y) r11
                java.lang.Object r12 = r1.f101787c
                QJ.Y r12 = (QJ.Y) r12
                java.lang.Object r9 = r1.f101798n
                QJ.Q r9 = (QJ.Q) r9
                XH.y.b(r34)
                r13 = r0
                r28 = r4
                r29 = r5
                r30 = r10
                r0 = r34
                r32 = r12
                r12 = r9
                r9 = r11
                r11 = r32
                goto L_0x0256
            L_0x00bd:
                java.lang.Object r0 = r1.f101790f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f101789e
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f101788d
                r9 = r0
                QJ.Y r9 = (QJ.Y) r9
                java.lang.Object r0 = r1.f101787c
                r11 = r0
                QJ.Y r11 = (QJ.Y) r11
                java.lang.Object r0 = r1.f101798n
                r12 = r0
                QJ.Q r12 = (QJ.Q) r12
                XH.y.b(r34)     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r0 = r34
                goto L_0x0145
            L_0x00da:
                r0 = move-exception
                goto L_0x014e
            L_0x00dd:
                r0 = move-exception
                goto L_0x042a
            L_0x00e0:
                XH.y.b(r34)
                java.lang.Object r0 = r1.f101798n
                r12 = r0
                QJ.Q r12 = (QJ.Q) r12
                boolean r0 = r1.f101799o
                if (r0 == 0) goto L_0x010d
                qn.l r0 = r1.f101800p
                java.lang.String r0 = r0.f101778m
                if (r0 == 0) goto L_0x010d
                qn.l$a$a r0 = new qn.l$a$a
                qn.l r9 = r1.f101800p
                r0.<init>(r9, r8)
                r24 = 3
                r25 = 0
                r21 = 0
                r22 = 0
                r20 = r12
                r23 = r0
                QJ.Y r0 = QJ.C16314k.b(r20, r21, r22, r23, r24, r25)
                r11 = r0
                goto L_0x010e
            L_0x010d:
                r11 = r8
            L_0x010e:
                qn.l$a$b r0 = new qn.l$a$b
                qn.l r9 = r1.f101800p
                un.e r14 = r1.f101802r
                un.c r13 = r1.f101803s
                r0.<init>(r9, r14, r13, r8)
                r24 = 3
                r25 = 0
                r21 = 0
                r22 = 0
                r20 = r12
                r23 = r0
                QJ.Y r9 = QJ.C16314k.b(r20, r21, r22, r23, r24, r25)
                XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                if (r11 == 0) goto L_0x0148
                r1.f101798n = r12     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101787c = r11     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101788d = r9     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101789e = r12     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101790f = r12     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101795k = r15     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r1.f101796l = r15     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                r13 = 1
                r1.f101797m = r13     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                java.lang.Object r0 = r11.f(r1)     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                if (r0 != r2) goto L_0x0145
                return r2
            L_0x0145:
                aq.b r0 = (aq.C11080b) r0     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                goto L_0x0149
            L_0x0148:
                r0 = r8
            L_0x0149:
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x00dd, all -> 0x00da }
                goto L_0x0158
            L_0x014e:
                XH.x$a r13 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0158:
                java.lang.Throwable r13 = XH.x.e(r0)
                if (r13 != 0) goto L_0x016d
                r13 = r0
                aq.b r13 = (aq.C11080b) r13
                r31 = r2
                r28 = r4
                r29 = r5
                r30 = r10
                r2 = r13
                r10 = r0
                goto L_0x0239
            L_0x016d:
                qv.e r14 = qv.e.WARN
                qv.d r20 = qv.d.f102012a
                java.util.List r20 = r20.a()
                java.lang.Iterable r20 = (java.lang.Iterable) r20
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r20 = r20.iterator()
            L_0x0180:
                boolean r21 = r20.hasNext()
                if (r21 == 0) goto L_0x019f
                r28 = r4
                java.lang.Object r4 = r20.next()
                r29 = r5
                r5 = r4
                qv.b r5 = (qv.C11819b) r5
                boolean r5 = r5.b(r14, r15)
                if (r5 == 0) goto L_0x019a
                r8.add(r4)
            L_0x019a:
                r4 = r28
                r5 = r29
                goto L_0x0180
            L_0x019f:
                r28 = r4
                r29 = r5
                java.util.Iterator r4 = r8.iterator()
                r5 = 0
                r8 = 0
            L_0x01a9:
                boolean r20 = r4.hasNext()
                if (r20 == 0) goto L_0x01bd
                java.lang.Object r20 = r4.next()
                qv.b r20 = (qv.C11819b) r20
                if (r5 != 0) goto L_0x01c7
                java.lang.String r5 = qv.C11818a.a(r10, r13)
                if (r5 != 0) goto L_0x01c3
            L_0x01bd:
                r31 = r2
                r30 = r10
                goto L_0x0236
            L_0x01c3:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x01c7:
                if (r8 != 0) goto L_0x021a
                java.lang.Class r8 = r12.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r31 = r2
                r34 = r4
                r30 = r10
                r4 = 2
                r10 = 0
                r15 = 36
                java.lang.String r2 = HJ.C15854t.s1(r8, r15, r10, r4, r10)
                r15 = 46
                java.lang.String r2 = HJ.C15854t.o1(r2, r15, r10, r4, r10)
                int r4 = r2.length()
                if (r4 != 0) goto L_0x01ef
                goto L_0x01f3
            L_0x01ef:
                java.lang.String r8 = HJ.C15854t.P0(r2, r7)
            L_0x01f3:
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r4 = 1
                boolean r2 = HJ.C15854t.b0(r2, r6, r4)
                if (r2 == 0) goto L_0x0205
                r2 = r29
                goto L_0x0207
            L_0x0205:
                r2 = r28
            L_0x0207:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r3)
                r4.append(r8)
                java.lang.String r8 = r4.toString()
                goto L_0x0220
            L_0x021a:
                r31 = r2
                r34 = r4
                r30 = r10
            L_0x0220:
                r23 = 0
                r21 = r14
                r22 = r8
                r24 = r13
                r25 = r5
                r20.a(r21, r22, r23, r24, r25)
                r4 = r34
                r10 = r30
                r2 = r31
                r15 = 0
                goto L_0x01a9
            L_0x0236:
                r2 = r13
                r10 = 0
                r13 = 0
            L_0x0239:
                r1.f101798n = r12
                r1.f101787c = r11
                r1.f101788d = r9
                r1.f101789e = r13
                r1.f101790f = r0
                r1.f101791g = r2
                r1.f101792h = r10
                r2 = 0
                r1.f101795k = r2
                r2 = 2
                r1.f101797m = r2
                java.lang.Object r0 = r9.f(r1)
                r2 = r31
                if (r0 != r2) goto L_0x0256
                return r2
            L_0x0256:
                r4 = r0
                un.b r4 = (un.b) r4
                vn.d r0 = r4.d()
                if (r0 == 0) goto L_0x0264
                java.lang.String r5 = r0.f()
                goto L_0x0265
            L_0x0264:
                r5 = 0
            L_0x0265:
                boolean r8 = r1.f101799o
                if (r8 == 0) goto L_0x03b3
                qn.l r8 = r1.f101800p
                java.lang.String r8 = r8.f101778m
                if (r8 != 0) goto L_0x03b3
                if (r5 == 0) goto L_0x03b3
                qn.l r0 = r1.f101800p
                XH.x$a r8 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                Tp.b r8 = r0.f101768c     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101798n = r12     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101787c = r11     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101788d = r9     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101789e = r13     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101790f = r4     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101791g = r5     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101792h = r12     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101793i = r0     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101794j = r12     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r10 = 0
                r1.f101795k = r10     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r1.f101796l = r10     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                r10 = 3
                r1.f101797m = r10     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                java.lang.Object r0 = r8.b(r5, r1)     // Catch:{ CancellationException -> 0x0096, all -> 0x02af }
                if (r0 != r2) goto L_0x029c
                return r2
            L_0x029c:
                r18 = r9
                r20 = r12
                r12 = r5
            L_0x02a1:
                aq.b r0 = (aq.C11080b) r0     // Catch:{ CancellationException -> 0x0096, all -> 0x02ad }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0096, all -> 0x02ad }
            L_0x02a7:
                r5 = r12
                r9 = r18
                r12 = r20
                goto L_0x02c0
            L_0x02ad:
                r0 = move-exception
                goto L_0x02b5
            L_0x02af:
                r0 = move-exception
                r18 = r9
                r20 = r12
                r12 = r5
            L_0x02b5:
                XH.x$a r5 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
                goto L_0x02a7
            L_0x02c0:
                java.lang.Throwable r8 = XH.x.e(r0)
                if (r8 != 0) goto L_0x02d3
                r8 = r0
                aq.b r8 = (aq.C11080b) r8
                r34 = r0
                r18 = r4
                r19 = r5
                r26 = r9
                goto L_0x03a8
            L_0x02d3:
                qv.e r10 = qv.e.WARN
                qv.d r13 = qv.d.f102012a
                java.util.List r13 = r13.a()
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r13 = r13.iterator()
            L_0x02e6:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x0306
                java.lang.Object r15 = r13.next()
                r34 = r0
                r0 = r15
                qv.b r0 = (qv.C11819b) r0
                r18 = r4
                r4 = 0
                boolean r0 = r0.b(r10, r4)
                if (r0 == 0) goto L_0x0301
                r14.add(r15)
            L_0x0301:
                r0 = r34
                r4 = r18
                goto L_0x02e6
            L_0x0306:
                r34 = r0
                r18 = r4
                java.util.Iterator r0 = r14.iterator()
                r4 = 0
                r13 = 0
            L_0x0310:
                boolean r14 = r0.hasNext()
                if (r14 == 0) goto L_0x0328
                java.lang.Object r14 = r0.next()
                r20 = r14
                qv.b r20 = (qv.C11819b) r20
                r14 = r30
                if (r4 != 0) goto L_0x0333
                java.lang.String r4 = qv.C11818a.a(r14, r8)
                if (r4 != 0) goto L_0x032f
            L_0x0328:
                r19 = r5
                r26 = r9
                r9 = 0
                goto L_0x03a7
            L_0x032f:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x0333:
                if (r13 != 0) goto L_0x0387
                java.lang.Class r13 = r12.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                r27 = r0
                r19 = r5
                r26 = r9
                r5 = 2
                r9 = 0
                r15 = 36
                java.lang.String r0 = HJ.C15854t.s1(r13, r15, r9, r5, r9)
                r15 = 46
                java.lang.String r0 = HJ.C15854t.o1(r0, r15, r9, r5, r9)
                int r16 = r0.length()
                if (r16 != 0) goto L_0x035b
                goto L_0x035f
            L_0x035b:
                java.lang.String r13 = HJ.C15854t.P0(r0, r7)
            L_0x035f:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r0 = r0.getName()
                r5 = 1
                boolean r0 = HJ.C15854t.b0(r0, r6, r5)
                if (r0 == 0) goto L_0x0371
                r0 = r29
                goto L_0x0373
            L_0x0371:
                r0 = r28
            L_0x0373:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r5.append(r3)
                r5.append(r13)
                java.lang.String r0 = r5.toString()
                r13 = r0
                goto L_0x0390
            L_0x0387:
                r27 = r0
                r19 = r5
                r26 = r9
                r9 = 0
                r15 = 46
            L_0x0390:
                r23 = 0
                r21 = r10
                r22 = r13
                r24 = r8
                r25 = r4
                r20.a(r21, r22, r23, r24, r25)
                r30 = r14
                r5 = r19
                r9 = r26
                r0 = r27
                goto L_0x0310
            L_0x03a7:
                r8 = r9
            L_0x03a8:
                r0 = r34
                r13 = r8
                r4 = r18
                r5 = r19
                r9 = r26
                goto L_0x03b3
            L_0x03b2:
                throw r0
            L_0x03b3:
                java.util.List r3 = r4.h()
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L_0x03fe
                qn.l r0 = r1.f101800p
                on.a r0 = r0.f101781p
                qn.l r3 = r1.f101800p
                java.lang.String r3 = r3.f101772g
                java.util.List r6 = r4.h()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = YH.C16877v.y(r6, r8)
                r7.<init>(r8)
                java.util.Iterator r8 = r6.iterator()
            L_0x03e0:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x03f4
                java.lang.Object r10 = r8.next()
                com.ingka.ikea.core.model.product.ProductItem r10 = (com.ingka.ikea.core.model.product.ProductItem) r10
                java.lang.String r10 = r10.f()
                r7.add(r10)
                goto L_0x03e0
            L_0x03f4:
                qn.l r8 = r1.f101800p
                java.lang.String r8 = r8.f101771f
                r0.e(r3, r7, r8)
                r0 = r6
            L_0x03fe:
                qn.l r3 = r1.f101800p
                java.lang.String r6 = r3.f101771f
                java.lang.String r7 = "user-recommendations"
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
                r3.f101785t = r6
                qn.l r3 = r1.f101800p
                qn.k$a r6 = r1.f101801q
                r1.f101798n = r12
                r1.f101787c = r11
                r1.f101788d = r9
                r1.f101789e = r13
                r1.f101790f = r4
                r1.f101791g = r5
                r1.f101792h = r0
                r5 = 4
                r1.f101797m = r5
                java.lang.Object r0 = r3.I(r6, r4, r13, r1)
                if (r0 != r2) goto L_0x0429
                return r2
            L_0x0429:
                return r0
            L_0x042a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qn.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LD4/P$b;", "Lqn/k$a;", "Lun/d;", "<anonymous>", "(LQJ/Q;)LD4/P$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource$load$2", f = "PlpPagingSource.kt", l = {81}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super P.b<k.a, un.d>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101810c;

        /* renamed from: d  reason: collision with root package name */
        Object f101811d;

        /* renamed from: e  reason: collision with root package name */
        Object f101812e;

        /* renamed from: f  reason: collision with root package name */
        Object f101813f;

        /* renamed from: g  reason: collision with root package name */
        int f101814g;

        /* renamed from: h  reason: collision with root package name */
        int f101815h;

        /* renamed from: i  reason: collision with root package name */
        int f101816i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f101817j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ l f101818k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ P.a<k.a> f101819l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, P.a<k.a> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f101818k = lVar;
            this.f101819l = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f101818k, this.f101819l, eVar);
            bVar.f101817j = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super P.b<k.a, un.d>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
            r13 = r0;
            r0 = r15;
            r15 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            throw r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            r15 = move-exception;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0020, B:11:0x003c] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0026 A[ExcHandler: CancellationException (r15v15 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f101816i
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 != r3) goto L_0x0029
                java.lang.Object r0 = r14.f101813f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f101812e
                D4.P$a r0 = (D4.P.a) r0
                java.lang.Object r0 = r14.f101811d
                qn.l r0 = (qn.l) r0
                java.lang.Object r0 = r14.f101810c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f101817j
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x0057
            L_0x0024:
                r15 = move-exception
                goto L_0x0062
            L_0x0026:
                r15 = move-exception
                goto L_0x0127
            L_0x0029:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0031:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f101817j
                QJ.Q r15 = (QJ.Q) r15
                qn.l r1 = r14.f101818k
                D4.P$a<qn.k$a> r4 = r14.f101819l
                XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101817j = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101810c = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101811d = r1     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101812e = r4     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101813f = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101814g = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101815h = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f101816i = r3     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                java.lang.Object r1 = r1.G(r4, r14)     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                if (r1 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r0 = r15
                r15 = r1
            L_0x0057:
                D4.P$b r15 = (D4.P.b) r15     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                java.lang.Object r15 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x006c
            L_0x005e:
                r0 = move-exception
                r13 = r0
                r0 = r15
                r15 = r13
            L_0x0062:
                XH.x$a r1 = XH.x.f139812b
                java.lang.Object r15 = XH.y.a(r15)
                java.lang.Object r15 = XH.x.b(r15)
            L_0x006c:
                java.lang.Throwable r1 = XH.x.e(r15)
                if (r1 != 0) goto L_0x0076
                D4.P$b r15 = (D4.P.b) r15
                goto L_0x0126
            L_0x0076:
                qv.e r15 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0089:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x00a0
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r15, r2)
                if (r7 == 0) goto L_0x0089
                r5.add(r6)
                goto L_0x0089
            L_0x00a0:
                java.util.Iterator r2 = r5.iterator()
                r10 = 0
                r4 = r10
                r5 = r4
            L_0x00a7:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r2.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x00c3
                java.lang.String r4 = "Error loading PLP page"
                java.lang.String r4 = qv.C11818a.a(r4, r1)
                if (r4 != 0) goto L_0x00bf
                goto L_0x0121
            L_0x00bf:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00c3:
                r11 = r4
                if (r5 != 0) goto L_0x0114
                java.lang.Class r4 = r0.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r10, r7, r10)
                r8 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r8, r10, r7, r10)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00e5
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00eb:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00fe
                java.lang.String r5 = "m"
                goto L_0x0100
            L_0x00fe:
                java.lang.String r5 = "b"
            L_0x0100:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x0114:
                r12 = r5
                r7 = 0
                r4 = r6
                r5 = r15
                r6 = r12
                r8 = r1
                r9 = r11
                r4.a(r5, r6, r7, r8, r9)
                r4 = r11
                r5 = r12
                goto L_0x00a7
            L_0x0121:
                D4.P$b$a r15 = new D4.P$b$a
                r15.<init>(r1)
            L_0x0126:
                return r15
            L_0x0127:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: qn.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource", f = "PlpPagingSource.kt", l = {96}, m = "loadPage")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f101820c;

        /* renamed from: d  reason: collision with root package name */
        Object f101821d;

        /* renamed from: e  reason: collision with root package name */
        Object f101822e;

        /* renamed from: f  reason: collision with root package name */
        Object f101823f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f101824g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f101825h;

        /* renamed from: i  reason: collision with root package name */
        int f101826i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f101825h = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101824g = obj;
            this.f101826i |= Integer.MIN_VALUE;
            return this.f101825h.G((P.a<k.a>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpPagingSource", f = "PlpPagingSource.kt", l = {208}, m = "mapResult$datalayer_implementation_release")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f101827c;

        /* renamed from: d  reason: collision with root package name */
        Object f101828d;

        /* renamed from: e  reason: collision with root package name */
        Object f101829e;

        /* renamed from: f  reason: collision with root package name */
        Object f101830f;

        /* renamed from: g  reason: collision with root package name */
        Object f101831g;

        /* renamed from: h  reason: collision with root package name */
        Object f101832h;

        /* renamed from: i  reason: collision with root package name */
        Object f101833i;

        /* renamed from: j  reason: collision with root package name */
        Object f101834j;

        /* renamed from: k  reason: collision with root package name */
        int f101835k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f101836l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f101837m;

        /* renamed from: n  reason: collision with root package name */
        int f101838n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f101837m = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101836l = obj;
            this.f101838n |= Integer.MIN_VALUE;
            return this.f101837m.I((k.a) null, (un.b) null, (C11080b) null, this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(pn.C11763c r21, Tp.b r22, Mg.b r23, QJ.M r24, java.lang.String r25, java.lang.String r26, boolean r27, java.lang.String r28, nI.C17631a r29, nI.C17631a r30, java.lang.String r31, java.lang.String r32, nI.C17631a r33, int r34, on.C11686a r35, boolean r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r14 = r2
            goto L_0x000b
        L_0x0009:
            r14 = r31
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r32
        L_0x0013:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001c
            r0 = 24
            r17 = r0
            goto L_0x001e
        L_0x001c:
            r17 = r34
        L_0x001e:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r16 = r33
            r18 = r35
            r19 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.l.<init>(pn.c, Tp.b, Mg.b, QJ.M, java.lang.String, java.lang.String, boolean, java.lang.String, nI.a, nI.a, java.lang.String, java.lang.String, nI.a, int, on.a, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final Object A(boolean z10, String str, C17164e<? super C16807N> eVar) {
        if (!m.a(this.f101771f)) {
            return C16807N.f139792a;
        }
        if (z10) {
            Object d10 = this.f101769d.d(str, eVar);
            return d10 == C17187b.f() ? d10 : C16807N.f139792a;
        }
        Object h10 = this.f101769d.h(str, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    private final List<List<C11588a>> B(List<C11588a> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < list.size()) {
            int i11 = (i10 % 3 == 0 ? 2 : 1) + i10;
            arrayList.add(list.subList(i10, C17978n.i(i11, list.size())));
            i10 = i11;
        }
        return arrayList;
    }

    private final v<e, un.c> D(k.a aVar) {
        String str = this.f101771f;
        e eVar = C17542s.e(str, "search") ? new e((Integer) null, (Integer) null, aVar.d(), Integer.valueOf(this.f101780o), 3, (DefaultConstructorMarker) null) : C17542s.e(str, "user-recommendations") ? new e(0, 48, (String) null, (Integer) null, 12, (DefaultConstructorMarker) null) : new e(aVar.e(), aVar.c(), (String) null, (Integer) null, 12, (DefaultConstructorMarker) null);
        String invoke = this.f101775j.invoke();
        String str2 = null;
        if (invoke != null) {
            if (invoke.length() == 0) {
                invoke = null;
            }
            str2 = invoke;
        }
        return new v<>(eVar, new un.c(str2, this.f101776k.invoke()));
    }

    private final Object E(k.a aVar, C17164e<? super v<String, ? extends List<? extends un.d>>> eVar) {
        v<e, un.c> D10 = D(aVar);
        return b1.c(new a(aVar.f() == 0, this, aVar, D10.a(), D10.b(), (C17164e<? super a>) null), eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(D4.P.a<qn.k.a> r10, dI.C17164e<? super D4.P.b<qn.k.a, un.d>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof qn.l.c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            qn.l$c r0 = (qn.l.c) r0
            int r1 = r0.f101826i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101826i = r1
            goto L_0x0018
        L_0x0013:
            qn.l$c r0 = new qn.l$c
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f101824g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f101826i
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r10 = r0.f101823f
            qn.k$a r10 = (qn.k.a) r10
            java.lang.Object r10 = r0.f101822e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f101821d
            D4.P$a r10 = (D4.P.a) r10
            java.lang.Object r11 = r0.f101820c
            qn.l r11 = (qn.l) r11
            XH.y.b(r1)
            r4 = r10
            r3 = r11
            goto L_0x0061
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0043:
            XH.y.b(r1)
            java.lang.Object r1 = r10.a()
            if (r1 == 0) goto L_0x0081
            qn.k$a r1 = (qn.k.a) r1
            r0.f101820c = r9
            r0.f101821d = r10
            r0.f101822e = r11
            r0.f101823f = r1
            r0.f101826i = r4
            java.lang.Object r1 = r9.E(r1, r0)
            if (r1 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r3 = r9
            r4 = r10
        L_0x0061:
            XH.v r1 = (XH.v) r1
            java.lang.Object r10 = r1.a()
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r1.b()
            java.util.List r10 = (java.util.List) r10
            D4.P$b$b r11 = new D4.P$b$b
            int r6 = r3.f101783r
            boolean r7 = r3.f101784s
            boolean r8 = r3.f101785t
            qn.k$a r0 = r3.C(r4, r5, r6, r7, r8)
            r1 = 0
            r11.<init>(r10, r1, r0)
            return r11
        L_0x0081:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.l.G(D4.P$a, dI.e):java.lang.Object");
    }

    private final un.d H(C11079a aVar) {
        if ((aVar instanceof C11079a.C1960a) || (aVar instanceof C11079a.c) || C17542s.e(aVar, C11079a.d.f90398a) || C17542s.e(aVar, C11079a.e.f90399a) || C17542s.e(aVar, C11079a.f.f90400a) || (aVar instanceof C11079a.g)) {
            return null;
        }
        if (aVar instanceof C11079a.b) {
            return new d.q(((C11079a.b) aVar).a());
        }
        if (aVar instanceof C11079a.h) {
            C11079a.h hVar = (C11079a.h) aVar;
            return new d.n(hVar.b(), hVar.a());
        } else if (!(aVar instanceof C11079a.i)) {
            throw new t();
        } else if (!this.f101782q) {
            return null;
        } else {
            C11079a.i iVar = (C11079a.i) aVar;
            return new d.r(iVar.a(), iVar.b());
        }
    }

    private final void t(List<un.d> list, C11520b bVar) {
        if (!bVar.a().isEmpty()) {
            list.add(new d.b(bVar.b(), bVar.a()));
        }
    }

    private final void u(List<un.d> list, un.b bVar) {
        List<C12196a> j10 = bVar.j();
        if (j10 != null) {
            list.add(new d.c(j10));
        }
    }

    private final void v(List<un.d> list, C11080b bVar) {
        Collection collection;
        C15987c<C11079a> a10;
        if (bVar == null || (a10 = bVar.a()) == null) {
            collection = C16877v.n();
        } else {
            collection = new ArrayList();
            for (C11079a H10 : a10) {
                un.d H11 = H(H10);
                if (H11 != null) {
                    collection.add(H11);
                }
            }
        }
        list.addAll(collection);
    }

    private final void w(List<un.d> list, un.b bVar) {
        vn.f g10 = bVar.g();
        if (g10 == null) {
            return;
        }
        if (!bVar.c().isEmpty() || !g10.a().isEmpty()) {
            list.add(new d.g(bVar.c(), g10.a(), g10.b()));
        }
    }

    private final void x(List<un.d> list, vn.d dVar) {
        if (dVar != null) {
            list.add(new d.h(dVar));
        } else if (this.f101783r <= 0) {
            list.add(new d.f(this.f101772g, m.a(this.f101771f)));
        } else if (m.a(this.f101771f)) {
            String str = this.f101772g;
            list.add(new d.h(new vn.d(str, "\"" + str + "\"", (Image) null, (String) null, (String) null, (Link) null, (String) null, (String) null, 252, (DefaultConstructorMarker) null)));
        } else if (this.f101774i.length() > 0) {
            list.add(new d.h(new vn.d(this.f101772g, this.f101774i, (Image) null, (String) null, (String) null, (Link) null, (String) null, (String) null, 252, (DefaultConstructorMarker) null)));
        } else {
            list.add(d.e.f103877a);
        }
    }

    private final void y(List<un.d> list, vn.e eVar) {
        if (eVar != null) {
            List<List<C11588a>> B10 = B(eVar.a());
            List list2 = (List) C16877v.w0(B10);
            if (list2.size() == 1) {
                list.add(new d.j(eVar.b(), (C11588a) C16877v.w0(list2)));
            } else {
                list.add(new d.i(eVar.b(), list2));
            }
            for (List list3 : B10.subList(1, B10.size())) {
                if (list3.size() == 1) {
                    list.add(new d.j((String) null, (C11588a) C16877v.w0(list3)));
                } else {
                    list.add(new d.i((String) null, list3));
                }
            }
        }
    }

    private final void z(List<un.d> list, un.b bVar) {
        KeyBenefits f10 = bVar.f();
        if (f10 != null) {
            list.add(new d.k(f10.c(), f10.b()));
        }
    }

    public final k.a C(P.a<k.a> aVar, String str, int i10, boolean z10, boolean z11) {
        String str2;
        char c10;
        Class<l> cls;
        String str3 = str;
        C17542s.j(aVar, "params");
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str2 = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = l.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str4 == null) {
                String a10 = C11818a.a("Get next page key", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str2 = DslKt.INDICATOR_MAIN;
                }
                str5 = str2 + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str7 = str5;
            bVar.a(eVar, str7, false, (Throwable) null, str6);
            str5 = str7;
            str4 = str6;
        }
        k.a a11 = aVar.a();
        if (a11 != null) {
            k.a aVar2 = a11;
            Integer e10 = aVar2.e();
            int i11 = 0;
            int intValue = e10 != null ? e10.intValue() : 0;
            Integer c11 = aVar2.c();
            if (c11 != null) {
                i11 = c11.intValue();
            }
            if (!z10) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str8 == null) {
                        String a12 = C11818a.a("Paging key, start: " + intValue + ", end: " + i11 + ", totalCount: " + aVar2.f(), (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str8 = C11820c.a(a12);
                    }
                    if (str9 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str9, false, (Throwable) null, str8);
                }
                if (i11 >= i10 - 1 || z11) {
                    qv.e eVar3 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    for (Object next3 : qv.d.f102012a.a()) {
                        if (((C11819b) next3).b(eVar3, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str10 = null;
                    String str11 = null;
                    for (C11819b bVar3 : arrayList3) {
                        if (str10 == null) {
                            String a13 = C11818a.a("Paging end reached", (Throwable) null);
                            if (a13 == null) {
                                break;
                            }
                            str10 = C11820c.a(a13);
                        }
                        if (str11 == null) {
                            String name3 = cls.getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                        }
                        bVar3.a(eVar3, str11, false, (Throwable) null, str10);
                    }
                    return null;
                }
                qv.e eVar4 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList4 = new ArrayList<>();
                for (Object next4 : qv.d.f102012a.a()) {
                    if (((C11819b) next4).b(eVar4, false)) {
                        arrayList4.add(next4);
                    }
                }
                String str12 = null;
                String str13 = null;
                for (C11819b bVar4 : arrayList4) {
                    if (str12 == null) {
                        String a14 = C11818a.a("Return start end next key", (Throwable) null);
                        if (a14 == null) {
                            break;
                        }
                        str12 = C11820c.a(a14);
                    }
                    if (str13 == null) {
                        String name4 = cls.getName();
                        C17542s.g(name4);
                        String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o15.length() != 0) {
                            name4 = C15854t.P0(o15, "Kt");
                        }
                        str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name4;
                    }
                    bVar4.a(eVar4, str13, false, (Throwable) null, str12);
                }
                return k.a.b(aVar2, (String) null, Integer.valueOf(i11), Integer.valueOf(i11 + aVar.b()), i10, 1, (Object) null);
            } else if (str3 == null) {
                return null;
            } else {
                qv.e eVar5 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList5 = new ArrayList<>();
                for (Object next5 : qv.d.f102012a.a()) {
                    if (((C11819b) next5).b(eVar5, false)) {
                        arrayList5.add(next5);
                    }
                }
                String str14 = null;
                String str15 = null;
                for (C11819b bVar5 : arrayList5) {
                    if (str14 == null) {
                        String a15 = C11818a.a("We received a pageToken to use for next page: " + str3, (Throwable) null);
                        if (a15 == null) {
                            break;
                        }
                        str14 = C11820c.a(a15);
                    }
                    if (str15 == null) {
                        String name5 = cls.getName();
                        C17542s.g(name5);
                        String o16 = C15854t.o1(C15854t.s1(name5, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o16.length() != 0) {
                            name5 = C15854t.P0(o16, "Kt");
                        }
                        str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name5;
                    }
                    bVar5.a(eVar5, str15, false, (Throwable) null, str14);
                    c10 = '$';
                }
                return k.a.b(aVar2, str, (Integer) null, (Integer) null, i10, 6, (Object) null);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* renamed from: F */
    public k.a d(D4.Q<k.a, un.d> q10) {
        k.a a10;
        C17542s.j(q10, "state");
        qv.e eVar = qv.e.DEBUG;
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
                String a11 = C11818a.a("Get refresh key", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str = C11820c.a(a11);
            }
            String str3 = str;
            if (str2 == null) {
                String name = l.class.getName();
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
        Integer c10 = q10.c();
        if (c10 == null) {
            return new k.a((String) null, 0, 24, 0, 1, (DefaultConstructorMarker) null);
        }
        int intValue = c10.intValue();
        P.b.C0534b<k.a, un.d> b10 = q10.b(intValue);
        k.a p10 = b10 != null ? b10.p() : null;
        P.b.C0534b<k.a, un.d> b11 = q10.b(intValue);
        k.a m10 = b11 != null ? b11.m() : null;
        if (p10 == null) {
            p10 = m10;
        }
        return (p10 == null || (a10 = p10.a((String) null, 0, 24, 0)) == null) ? new k.a((String) null, 0, 24, 0, 1, (DefaultConstructorMarker) null) : a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0158 A[LOOP:0: B:59:0x0152->B:61:0x0158, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I(qn.k.a r10, un.b r11, aq.C11080b r12, dI.C17164e<? super XH.v<java.lang.String, ? extends java.util.List<? extends un.d>>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof qn.l.d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            qn.l$d r0 = (qn.l.d) r0
            int r1 = r0.f101838n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101838n = r1
            goto L_0x0018
        L_0x0013:
            qn.l$d r0 = new qn.l$d
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f101836l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f101838n
            r4 = 1
            if (r3 == 0) goto L_0x0054
            if (r3 != r4) goto L_0x004c
            java.lang.Object r10 = r0.f101834j
            kp.l r10 = (kp.l) r10
            java.lang.Object r10 = r0.f101833i
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f101832h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.f101831g
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f101830f
            aq.b r12 = (aq.C11080b) r12
            java.lang.Object r13 = r0.f101829e
            un.b r13 = (un.b) r13
            java.lang.Object r2 = r0.f101828d
            qn.k$a r2 = (qn.k.a) r2
            java.lang.Object r0 = r0.f101827c
            qn.l r0 = (qn.l) r0
            XH.y.b(r1)
            r1 = r11
            r11 = r13
            goto L_0x00e9
        L_0x004c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0054:
            XH.y.b(r1)
            java.util.List r1 = YH.C16877v.c()
            int r3 = r10.f()
            if (r3 != 0) goto L_0x013c
            vn.f r3 = r11.g()
            r5 = 0
            if (r3 == 0) goto L_0x006d
            int r3 = r3.b()
            goto L_0x006e
        L_0x006d:
            r3 = r5
        L_0x006e:
            r9.f101783r = r3
            java.lang.String r3 = r11.l()
            if (r3 == 0) goto L_0x0078
            r3 = r4
            goto L_0x0079
        L_0x0078:
            r3 = r5
        L_0x0079:
            r9.f101784s = r3
            vn.d r3 = r11.d()
            r9.x(r1, r3)
            int r3 = r9.f101783r
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = r9.f101771f
            boolean r3 = qn.m.a(r3)
            if (r3 == 0) goto L_0x0097
            kp.b r3 = r11.a()
            if (r3 == 0) goto L_0x0097
            r9.t(r1, r3)
        L_0x0097:
            java.util.List r3 = r11.b()
            if (r3 == 0) goto L_0x00a9
            un.d$d r6 = new un.d$d
            r6.<init>(r3)
            boolean r3 = r1.add(r6)
            kotlin.coroutines.jvm.internal.b.a(r3)
        L_0x00a9:
            kp.l r3 = r11.k()
            if (r3 == 0) goto L_0x00bb
            un.d$o r6 = new un.d$o
            r6.<init>(r3)
            boolean r6 = r1.add(r6)
            kotlin.coroutines.jvm.internal.b.a(r6)
        L_0x00bb:
            boolean r6 = r9.f101773h
            if (r6 != 0) goto L_0x00ed
            java.util.List r6 = r11.h()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.String r7 = r9.f101772g
            r0.f101827c = r9
            r0.f101828d = r10
            r0.f101829e = r11
            r0.f101830f = r12
            r0.f101831g = r13
            r0.f101832h = r1
            r0.f101833i = r1
            r0.f101834j = r3
            r0.f101835k = r5
            r0.f101838n = r4
            java.lang.Object r10 = r9.A(r6, r7, r0)
            if (r10 != r2) goto L_0x00e7
            return r2
        L_0x00e7:
            r0 = r9
            r10 = r1
        L_0x00e9:
            r8 = r1
            r1 = r10
            r10 = r8
            goto L_0x00ef
        L_0x00ed:
            r0 = r9
            r10 = r1
        L_0x00ef:
            r0.u(r1, r11)
            if (r12 == 0) goto L_0x0106
            KJ.c r13 = r12.b()
            if (r13 == 0) goto L_0x0106
            un.d$m r2 = new un.d$m
            r2.<init>(r13)
            boolean r13 = r1.add(r2)
            kotlin.coroutines.jvm.internal.b.a(r13)
        L_0x0106:
            r0.v(r1, r12)
            r0.z(r1, r11)
            r0.w(r1, r11)
            boolean r12 = r11.i()
            if (r12 == 0) goto L_0x011a
            un.d$a r12 = un.d.a.f103872a
            r1.add(r12)
        L_0x011a:
            int r12 = r0.f101783r
            if (r12 <= 0) goto L_0x0134
            vn.f r12 = r11.g()
            if (r12 == 0) goto L_0x0134
            un.d$p r13 = new un.d$p
            int r12 = r12.b()
            r13.<init>(r12)
            boolean r12 = r1.add(r13)
            kotlin.coroutines.jvm.internal.b.a(r12)
        L_0x0134:
            vn.e r12 = r11.e()
            r0.y(r1, r12)
            goto L_0x013d
        L_0x013c:
            r10 = r1
        L_0x013d:
            java.util.List r12 = r11.h()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r12, r0)
            r13.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0152:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r12.next()
            com.ingka.ikea.core.model.product.ProductItem r0 = (com.ingka.ikea.core.model.product.ProductItem) r0
            un.d$l r2 = new un.d$l
            r2.<init>(r0)
            r13.add(r2)
            goto L_0x0152
        L_0x0167:
            r1.addAll(r13)
            java.util.List r10 = YH.C16877v.a(r10)
            XH.v r12 = new XH.v
            java.lang.String r11 = r11.l()
            r12.<init>(r11, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.l.I(qn.k$a, un.b, aq.b, dI.e):java.lang.Object");
    }

    public Object f(P.a<k.a> aVar, C17164e<? super P.b<k.a, un.d>> eVar) {
        return C16310i.g(this.f101770e, new b(this, aVar, (C17164e<? super b>) null), eVar);
    }

    public l(C11763c cVar, Tp.b bVar, Mg.b bVar2, M m10, String str, String str2, boolean z10, String str3, C17631a<String> aVar, C17631a<String> aVar2, String str4, String str5, C17631a<C12068a> aVar3, int i10, C11686a aVar4, boolean z11) {
        Mg.b bVar3 = bVar2;
        M m11 = m10;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        C17631a<String> aVar5 = aVar;
        C17631a<String> aVar6 = aVar2;
        C17631a<C12068a> aVar7 = aVar3;
        C11686a aVar8 = aVar4;
        C17542s.j(cVar, "plpRepository");
        C17542s.j(bVar, "discoverRepository");
        C17542s.j(bVar3, "localHistoryRepository");
        C17542s.j(m11, "dispatcher");
        C17542s.j(str6, "type");
        C17542s.j(str7, "id");
        C17542s.j(str8, "fallbackTitle");
        C17542s.j(aVar5, "sortByFilter");
        C17542s.j(aVar6, "filters");
        C17542s.j(aVar7, "availabilityParams");
        C17542s.j(aVar8, "plpAnalytics");
        this.f101767b = cVar;
        this.f101768c = bVar;
        this.f101769d = bVar3;
        this.f101770e = m11;
        this.f101771f = str6;
        this.f101772g = str7;
        this.f101773h = z10;
        this.f101774i = str8;
        this.f101775j = aVar5;
        this.f101776k = aVar6;
        this.f101777l = str4;
        this.f101778m = str5;
        this.f101779n = aVar7;
        this.f101780o = i10;
        this.f101781p = aVar8;
        this.f101782q = z11;
        this.f101786u = new ArrayList();
    }
}
