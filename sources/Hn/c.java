package Hn;

import HJ.C15854t;
import QL.x;
import com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel;
import com.ingka.ikea.app.caasremote.models.WrappedCartResponseRemoteModel;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010 \u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b \u0010!J2\u0010\"\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\"\u0010!J2\u0010#\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b#\u0010!J$\u0010$\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b$\u0010\u001cJ2\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b&\u0010!J,\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b*\u0010\u001cJ$\u0010+\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b+\u0010\u001cJ,\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b-\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"LHn/c;", "", "LIf/a;", "caasEndpoint", "Ltw/g;", "networkParameters", "<init>", "(LIf/a;Ltw/g;)V", "T", "LQL/x;", "LFn/d;", "s", "(LQL/x;)LFn/d;", "Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel;", "response", "", "logPrefix", "Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "r", "(LQL/x;Ljava/lang/String;)Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "LHn/d;", "config", "storeId", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "o", "(LHn/d;Ljava/lang/String;)Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "fetchCartConfig", "m", "(LHn/d;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "LFn/f;", "items", "c", "(Ljava/util/List;LHn/d;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "v", "k", "e", "codes", "t", "discountCode", "g", "(Ljava/lang/String;LHn/d;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "i", "guestUserId", "p", "LIf/a;", "b", "Ltw/g;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final If.a f81435a;

    /* renamed from: b  reason: collision with root package name */
    private final tw.g f81436b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81437a;

        static {
            int[] iArr = new int[com.ingka.ikea.app.caasremote.models.a.values().length];
            try {
                iArr[com.ingka.ikea.app.caasremote.models.a.INVALID_DISCOUNT_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f81437a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {307}, m = "addEmployeeConsentWithUserToken")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81438c;

        /* renamed from: d  reason: collision with root package name */
        Object f81439d;

        /* renamed from: e  reason: collision with root package name */
        Object f81440e;

        /* renamed from: f  reason: collision with root package name */
        Object f81441f;

        /* renamed from: g  reason: collision with root package name */
        Object f81442g;

        /* renamed from: h  reason: collision with root package name */
        Object f81443h;

        /* renamed from: i  reason: collision with root package name */
        Object f81444i;

        /* renamed from: j  reason: collision with root package name */
        Object f81445j;

        /* renamed from: k  reason: collision with root package name */
        Object f81446k;

        /* renamed from: l  reason: collision with root package name */
        Object f81447l;

        /* renamed from: m  reason: collision with root package name */
        Object f81448m;

        /* renamed from: n  reason: collision with root package name */
        Object f81449n;

        /* renamed from: o  reason: collision with root package name */
        Object f81450o;

        /* renamed from: p  reason: collision with root package name */
        Object f81451p;

        /* renamed from: q  reason: collision with root package name */
        Object f81452q;

        /* renamed from: r  reason: collision with root package name */
        Object f81453r;

        /* renamed from: s  reason: collision with root package name */
        int f81454s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f81455t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c f81456u;

        /* renamed from: v  reason: collision with root package name */
        int f81457v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f81456u = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81455t = obj;
            this.f81457v |= Integer.MIN_VALUE;
            return this.f81456u.a((d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {86}, m = "addItemsByUserToken")
    /* renamed from: Hn.c$c  reason: collision with other inner class name */
    static final class C1590c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81458c;

        /* renamed from: d  reason: collision with root package name */
        Object f81459d;

        /* renamed from: e  reason: collision with root package name */
        Object f81460e;

        /* renamed from: f  reason: collision with root package name */
        Object f81461f;

        /* renamed from: g  reason: collision with root package name */
        Object f81462g;

        /* renamed from: h  reason: collision with root package name */
        Object f81463h;

        /* renamed from: i  reason: collision with root package name */
        Object f81464i;

        /* renamed from: j  reason: collision with root package name */
        Object f81465j;

        /* renamed from: k  reason: collision with root package name */
        Object f81466k;

        /* renamed from: l  reason: collision with root package name */
        Object f81467l;

        /* renamed from: m  reason: collision with root package name */
        Object f81468m;

        /* renamed from: n  reason: collision with root package name */
        Object f81469n;

        /* renamed from: o  reason: collision with root package name */
        Object f81470o;

        /* renamed from: p  reason: collision with root package name */
        Object f81471p;

        /* renamed from: q  reason: collision with root package name */
        Object f81472q;

        /* renamed from: r  reason: collision with root package name */
        Object f81473r;

        /* renamed from: s  reason: collision with root package name */
        Object f81474s;

        /* renamed from: t  reason: collision with root package name */
        int f81475t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f81476u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f81477v;

        /* renamed from: w  reason: collision with root package name */
        int f81478w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1590c(c cVar, C17164e<? super C1590c> eVar) {
            super(eVar);
            this.f81477v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81476u = obj;
            this.f81478w |= Integer.MIN_VALUE;
            return this.f81477v.c((List<Fn.f>) null, (d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {199}, m = "deleteAllItemsCartByUserToken")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81479c;

        /* renamed from: d  reason: collision with root package name */
        Object f81480d;

        /* renamed from: e  reason: collision with root package name */
        Object f81481e;

        /* renamed from: f  reason: collision with root package name */
        Object f81482f;

        /* renamed from: g  reason: collision with root package name */
        Object f81483g;

        /* renamed from: h  reason: collision with root package name */
        Object f81484h;

        /* renamed from: i  reason: collision with root package name */
        Object f81485i;

        /* renamed from: j  reason: collision with root package name */
        Object f81486j;

        /* renamed from: k  reason: collision with root package name */
        Object f81487k;

        /* renamed from: l  reason: collision with root package name */
        Object f81488l;

        /* renamed from: m  reason: collision with root package name */
        Object f81489m;

        /* renamed from: n  reason: collision with root package name */
        Object f81490n;

        /* renamed from: o  reason: collision with root package name */
        Object f81491o;

        /* renamed from: p  reason: collision with root package name */
        boolean f81492p;

        /* renamed from: q  reason: collision with root package name */
        boolean f81493q;

        /* renamed from: r  reason: collision with root package name */
        boolean f81494r;

        /* renamed from: s  reason: collision with root package name */
        int f81495s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f81496t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c f81497u;

        /* renamed from: v  reason: collision with root package name */
        int f81498v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f81497u = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81496t = obj;
            this.f81498v |= Integer.MIN_VALUE;
            return this.f81497u.e((d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {274}, m = "deleteDiscountByToken")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81499c;

        /* renamed from: d  reason: collision with root package name */
        Object f81500d;

        /* renamed from: e  reason: collision with root package name */
        Object f81501e;

        /* renamed from: f  reason: collision with root package name */
        Object f81502f;

        /* renamed from: g  reason: collision with root package name */
        Object f81503g;

        /* renamed from: h  reason: collision with root package name */
        Object f81504h;

        /* renamed from: i  reason: collision with root package name */
        Object f81505i;

        /* renamed from: j  reason: collision with root package name */
        Object f81506j;

        /* renamed from: k  reason: collision with root package name */
        Object f81507k;

        /* renamed from: l  reason: collision with root package name */
        Object f81508l;

        /* renamed from: m  reason: collision with root package name */
        Object f81509m;

        /* renamed from: n  reason: collision with root package name */
        Object f81510n;

        /* renamed from: o  reason: collision with root package name */
        Object f81511o;

        /* renamed from: p  reason: collision with root package name */
        Object f81512p;

        /* renamed from: q  reason: collision with root package name */
        boolean f81513q;

        /* renamed from: r  reason: collision with root package name */
        boolean f81514r;

        /* renamed from: s  reason: collision with root package name */
        boolean f81515s;

        /* renamed from: t  reason: collision with root package name */
        int f81516t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f81517u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f81518v;

        /* renamed from: w  reason: collision with root package name */
        int f81519w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f81518v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81517u = obj;
            this.f81519w |= Integer.MIN_VALUE;
            return this.f81518v.g((String) null, (d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {339}, m = "deleteEmployeeConsentWithUserToken")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81520c;

        /* renamed from: d  reason: collision with root package name */
        Object f81521d;

        /* renamed from: e  reason: collision with root package name */
        Object f81522e;

        /* renamed from: f  reason: collision with root package name */
        Object f81523f;

        /* renamed from: g  reason: collision with root package name */
        Object f81524g;

        /* renamed from: h  reason: collision with root package name */
        Object f81525h;

        /* renamed from: i  reason: collision with root package name */
        Object f81526i;

        /* renamed from: j  reason: collision with root package name */
        Object f81527j;

        /* renamed from: k  reason: collision with root package name */
        Object f81528k;

        /* renamed from: l  reason: collision with root package name */
        Object f81529l;

        /* renamed from: m  reason: collision with root package name */
        Object f81530m;

        /* renamed from: n  reason: collision with root package name */
        Object f81531n;

        /* renamed from: o  reason: collision with root package name */
        Object f81532o;

        /* renamed from: p  reason: collision with root package name */
        boolean f81533p;

        /* renamed from: q  reason: collision with root package name */
        boolean f81534q;

        /* renamed from: r  reason: collision with root package name */
        boolean f81535r;

        /* renamed from: s  reason: collision with root package name */
        int f81536s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f81537t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c f81538u;

        /* renamed from: v  reason: collision with root package name */
        int f81539v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f81538u = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81537t = obj;
            this.f81539v |= Integer.MIN_VALUE;
            return this.f81538u.i((d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {166}, m = "deleteItemsByUserToken")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81540c;

        /* renamed from: d  reason: collision with root package name */
        Object f81541d;

        /* renamed from: e  reason: collision with root package name */
        Object f81542e;

        /* renamed from: f  reason: collision with root package name */
        Object f81543f;

        /* renamed from: g  reason: collision with root package name */
        Object f81544g;

        /* renamed from: h  reason: collision with root package name */
        Object f81545h;

        /* renamed from: i  reason: collision with root package name */
        Object f81546i;

        /* renamed from: j  reason: collision with root package name */
        Object f81547j;

        /* renamed from: k  reason: collision with root package name */
        Object f81548k;

        /* renamed from: l  reason: collision with root package name */
        Object f81549l;

        /* renamed from: m  reason: collision with root package name */
        Object f81550m;

        /* renamed from: n  reason: collision with root package name */
        Object f81551n;

        /* renamed from: o  reason: collision with root package name */
        Object f81552o;

        /* renamed from: p  reason: collision with root package name */
        Object f81553p;

        /* renamed from: q  reason: collision with root package name */
        Object f81554q;

        /* renamed from: r  reason: collision with root package name */
        boolean f81555r;

        /* renamed from: s  reason: collision with root package name */
        boolean f81556s;

        /* renamed from: t  reason: collision with root package name */
        boolean f81557t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f81558u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f81559v;

        /* renamed from: w  reason: collision with root package name */
        int f81560w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f81559v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81558u = obj;
            this.f81560w |= Integer.MIN_VALUE;
            return this.f81559v.k((List<String>) null, (d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {47}, m = "getCartByUserToken")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81561c;

        /* renamed from: d  reason: collision with root package name */
        Object f81562d;

        /* renamed from: e  reason: collision with root package name */
        Object f81563e;

        /* renamed from: f  reason: collision with root package name */
        Object f81564f;

        /* renamed from: g  reason: collision with root package name */
        Object f81565g;

        /* renamed from: h  reason: collision with root package name */
        Object f81566h;

        /* renamed from: i  reason: collision with root package name */
        Object f81567i;

        /* renamed from: j  reason: collision with root package name */
        Object f81568j;

        /* renamed from: k  reason: collision with root package name */
        Object f81569k;

        /* renamed from: l  reason: collision with root package name */
        Object f81570l;

        /* renamed from: m  reason: collision with root package name */
        Object f81571m;

        /* renamed from: n  reason: collision with root package name */
        Object f81572n;

        /* renamed from: o  reason: collision with root package name */
        Object f81573o;

        /* renamed from: p  reason: collision with root package name */
        boolean f81574p;

        /* renamed from: q  reason: collision with root package name */
        boolean f81575q;

        /* renamed from: r  reason: collision with root package name */
        boolean f81576r;

        /* renamed from: s  reason: collision with root package name */
        int f81577s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f81578t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c f81579u;

        /* renamed from: v  reason: collision with root package name */
        int f81580v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f81579u = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81578t = obj;
            this.f81580v |= Integer.MIN_VALUE;
            return this.f81579u.m((d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {372}, m = "mergeFromUserIdByUserToken")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81581c;

        /* renamed from: d  reason: collision with root package name */
        Object f81582d;

        /* renamed from: e  reason: collision with root package name */
        Object f81583e;

        /* renamed from: f  reason: collision with root package name */
        Object f81584f;

        /* renamed from: g  reason: collision with root package name */
        Object f81585g;

        /* renamed from: h  reason: collision with root package name */
        Object f81586h;

        /* renamed from: i  reason: collision with root package name */
        Object f81587i;

        /* renamed from: j  reason: collision with root package name */
        Object f81588j;

        /* renamed from: k  reason: collision with root package name */
        Object f81589k;

        /* renamed from: l  reason: collision with root package name */
        Object f81590l;

        /* renamed from: m  reason: collision with root package name */
        Object f81591m;

        /* renamed from: n  reason: collision with root package name */
        Object f81592n;

        /* renamed from: o  reason: collision with root package name */
        Object f81593o;

        /* renamed from: p  reason: collision with root package name */
        Object f81594p;

        /* renamed from: q  reason: collision with root package name */
        Object f81595q;

        /* renamed from: r  reason: collision with root package name */
        Object f81596r;

        /* renamed from: s  reason: collision with root package name */
        Object f81597s;

        /* renamed from: t  reason: collision with root package name */
        int f81598t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f81599u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f81600v;

        /* renamed from: w  reason: collision with root package name */
        int f81601w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f81600v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81599u = obj;
            this.f81601w |= Integer.MIN_VALUE;
            return this.f81600v.p((String) null, (d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {233}, m = "putDiscountByToken")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81602c;

        /* renamed from: d  reason: collision with root package name */
        Object f81603d;

        /* renamed from: e  reason: collision with root package name */
        Object f81604e;

        /* renamed from: f  reason: collision with root package name */
        Object f81605f;

        /* renamed from: g  reason: collision with root package name */
        Object f81606g;

        /* renamed from: h  reason: collision with root package name */
        Object f81607h;

        /* renamed from: i  reason: collision with root package name */
        Object f81608i;

        /* renamed from: j  reason: collision with root package name */
        Object f81609j;

        /* renamed from: k  reason: collision with root package name */
        Object f81610k;

        /* renamed from: l  reason: collision with root package name */
        Object f81611l;

        /* renamed from: m  reason: collision with root package name */
        Object f81612m;

        /* renamed from: n  reason: collision with root package name */
        Object f81613n;

        /* renamed from: o  reason: collision with root package name */
        Object f81614o;

        /* renamed from: p  reason: collision with root package name */
        Object f81615p;

        /* renamed from: q  reason: collision with root package name */
        Object f81616q;

        /* renamed from: r  reason: collision with root package name */
        Object f81617r;

        /* renamed from: s  reason: collision with root package name */
        Object f81618s;

        /* renamed from: t  reason: collision with root package name */
        int f81619t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f81620u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f81621v;

        /* renamed from: w  reason: collision with root package name */
        int f81622w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f81621v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81620u = obj;
            this.f81622w |= Integer.MIN_VALUE;
            return this.f81621v.t((List<String>) null, (d) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteSourceWrapper", f = "CaasRemoteSourceWrapper.kt", l = {126}, m = "updateItemByUserToken")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f81623c;

        /* renamed from: d  reason: collision with root package name */
        Object f81624d;

        /* renamed from: e  reason: collision with root package name */
        Object f81625e;

        /* renamed from: f  reason: collision with root package name */
        Object f81626f;

        /* renamed from: g  reason: collision with root package name */
        Object f81627g;

        /* renamed from: h  reason: collision with root package name */
        Object f81628h;

        /* renamed from: i  reason: collision with root package name */
        Object f81629i;

        /* renamed from: j  reason: collision with root package name */
        Object f81630j;

        /* renamed from: k  reason: collision with root package name */
        Object f81631k;

        /* renamed from: l  reason: collision with root package name */
        Object f81632l;

        /* renamed from: m  reason: collision with root package name */
        Object f81633m;

        /* renamed from: n  reason: collision with root package name */
        Object f81634n;

        /* renamed from: o  reason: collision with root package name */
        Object f81635o;

        /* renamed from: p  reason: collision with root package name */
        Object f81636p;

        /* renamed from: q  reason: collision with root package name */
        Object f81637q;

        /* renamed from: r  reason: collision with root package name */
        Object f81638r;

        /* renamed from: s  reason: collision with root package name */
        Object f81639s;

        /* renamed from: t  reason: collision with root package name */
        int f81640t;

        /* renamed from: u  reason: collision with root package name */
        int f81641u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f81642v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ c f81643w;

        /* renamed from: x  reason: collision with root package name */
        int f81644x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f81643w = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81642v = obj;
            this.f81644x |= Integer.MIN_VALUE;
            return this.f81643w.v((List<Fn.f>) null, (d) null, (String) null, this);
        }
    }

    public c(If.a aVar, tw.g gVar) {
        C17542s.j(aVar, "caasEndpoint");
        C17542s.j(gVar, "networkParameters");
        this.f81435a = aVar;
        this.f81436b = gVar;
    }

    public static /* synthetic */ Object b(c cVar, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return cVar.a(dVar, str, eVar);
    }

    public static /* synthetic */ Object d(c cVar, List list, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return cVar.c(list, dVar, str, eVar);
    }

    public static /* synthetic */ Object f(c cVar, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return cVar.e(dVar, str, eVar);
    }

    public static /* synthetic */ Object h(c cVar, String str, d dVar, String str2, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return cVar.g(str, dVar, str2, eVar);
    }

    public static /* synthetic */ Object j(c cVar, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return cVar.i(dVar, str, eVar);
    }

    public static /* synthetic */ Object l(c cVar, List list, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return cVar.k(list, dVar, str, eVar);
    }

    public static /* synthetic */ Object n(c cVar, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return cVar.m(dVar, str, eVar);
    }

    private final NullablePopulateCartRemoteModel o(d dVar, String str) {
        boolean b10 = dVar.b();
        return new NullablePopulateCartRemoteModel(Boolean.TRUE, (Boolean) null, Boolean.valueOf(dVar.a()), Boolean.valueOf(b10), Boolean.valueOf(dVar.c()), (Boolean) null, (String) null, (String) null, str);
    }

    public static /* synthetic */ Object q(c cVar, String str, d dVar, String str2, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return cVar.p(str, dVar, str2, eVar);
    }

    private final CartResponseRemoteModel r(x<WrappedCartResponseRemoteModel> xVar, String str) {
        String str2;
        String str3;
        char c10;
        String str4 = str;
        boolean e10 = xVar.e();
        String str5 = DslKt.INDICATOR_BACKGROUND;
        String str6 = DslKt.INDICATOR_MAIN;
        Class<c> cls = c.class;
        if (!e10) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar : arrayList) {
                if (str7 == null) {
                    String a10 = C11818a.a(str4 + " unsuccessful, code: " + xVar.b(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str7 = C11820c.a(a10);
                }
                String str9 = str7;
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str6 : str5) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str10 = str8;
                bVar.a(eVar, str10, false, (Throwable) null, str9);
                str8 = str10;
                str7 = str9;
            }
            throw new IOException(str4 + " failed");
        }
        WrappedCartResponseRemoteModel a11 = xVar.a();
        NullableCartResponseRemoteModel a12 = a11 != null ? a11.a() : null;
        if (a12 != null) {
            return new CartResponseRemoteModel(a12.b(), a12.c(), a12.d(), a12.e(), a12.f(), a12.g(), a12.h(), a12.i(), a12.j(), a12.k(), a12.l(), a12.m());
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str4 + ", body was null");
        qv.e eVar2 = qv.e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str11 = null;
        String str12 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str11 == null) {
                String a13 = C11818a.a((String) null, illegalArgumentException);
                if (a13 == null) {
                    break;
                }
                str11 = C11820c.a(a13);
            }
            if (str12 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                str3 = str5;
                c10 = '$';
                str2 = str6;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str2 : str3) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str3 = str5;
                str2 = str6;
                c10 = '$';
            }
            char c11 = c10;
            bVar2.a(eVar2, str12, false, illegalArgumentException, str11);
            str5 = str3;
            str6 = str2;
        }
        throw new IOException(str4 + ", no body in response");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        r14 = r14.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> Fn.d s(QL.x<T> r14) {
        /*
            r13 = this;
            int r0 = r14.b()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L_0x0102
            r0 = 1
            r1 = 0
            GK.E r14 = r14.d()     // Catch:{ Exception -> 0x002b }
            if (r14 == 0) goto L_0x00d5
            java.lang.String r14 = r14.l()     // Catch:{ Exception -> 0x002b }
            if (r14 == 0) goto L_0x00d5
            Yz.b r2 = Yz.b.f118278a     // Catch:{ Exception -> 0x002b }
            kK.c r2 = r2.b()     // Catch:{ Exception -> 0x002b }
            r2.a()     // Catch:{ Exception -> 0x002b }
            com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel$a r3 = com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel.Companion     // Catch:{ Exception -> 0x002b }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ Exception -> 0x002b }
            java.lang.Object r14 = r2.c(r3, r14)     // Catch:{ Exception -> 0x002b }
            goto L_0x00d6
        L_0x002b:
            r14 = move-exception
            qv.e r8 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            r9 = 0
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r8, r9)
            if (r5 == 0) goto L_0x003f
            r3.add(r4)
            goto L_0x003f
        L_0x0057:
            java.util.Iterator r10 = r3.iterator()
            r2 = r1
            r3 = r2
        L_0x005d:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00d5
            java.lang.Object r4 = r10.next()
            qv.b r4 = (qv.C11819b) r4
            if (r2 != 0) goto L_0x0079
            java.lang.String r2 = "Exception when parsing errorBody"
            java.lang.String r2 = qv.C11818a.a(r2, r14)
            if (r2 != 0) goto L_0x0075
            goto L_0x00d5
        L_0x0075:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0079:
            r11 = r2
            if (r3 != 0) goto L_0x00c8
            java.lang.Class<QL.x> r2 = QL.x.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r5 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r1, r5, r1)
            r6 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r6, r1, r5, r1)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x009f:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r5, r0)
            if (r3 == 0) goto L_0x00b2
            java.lang.String r3 = "m"
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r3 = "b"
        L_0x00b4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
        L_0x00c8:
            r12 = r3
            r2 = r4
            r3 = r8
            r4 = r12
            r5 = r9
            r6 = r14
            r7 = r11
            r2.a(r3, r4, r5, r6, r7)
            r2 = r11
            r3 = r12
            goto L_0x005d
        L_0x00d5:
            r14 = r1
        L_0x00d6:
            com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel) r14
            if (r14 == 0) goto L_0x00e7
            java.util.List r14 = r14.b()
            if (r14 == 0) goto L_0x00e7
            java.lang.Object r14 = YH.C16877v.y0(r14)
            com.ingka.ikea.app.caasremote.models.ApiErrorRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.ApiErrorRemoteModel) r14
            goto L_0x00e8
        L_0x00e7:
            r14 = r1
        L_0x00e8:
            if (r14 == 0) goto L_0x00ee
            com.ingka.ikea.app.caasremote.models.a r1 = r14.b()
        L_0x00ee:
            if (r1 != 0) goto L_0x00f2
            r14 = -1
            goto L_0x00fa
        L_0x00f2:
            int[] r14 = Hn.c.a.f81437a
            int r1 = r1.ordinal()
            r14 = r14[r1]
        L_0x00fa:
            if (r14 != r0) goto L_0x00ff
            Fn.d$b r14 = Fn.d.b.f80977a
            goto L_0x0104
        L_0x00ff:
            Fn.d$a r14 = Fn.d.a.f80976a
            goto L_0x0104
        L_0x0102:
            Fn.d$a r14 = Fn.d.a.f80976a
        L_0x0104:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.s(QL.x):Fn.d");
    }

    public static /* synthetic */ Object u(c cVar, List list, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return cVar.t(list, dVar, str, eVar);
    }

    public static /* synthetic */ Object w(c cVar, List list, d dVar, String str, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return cVar.v(list, dVar, str, eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(Hn.d r22, java.lang.String r23, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            boolean r4 = r3 instanceof Hn.c.b
            if (r4 == 0) goto L_0x001c
            r4 = r3
            Hn.c$b r4 = (Hn.c.b) r4
            int r5 = r4.f81457v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.f81457v = r5
        L_0x001a:
            r10 = r4
            goto L_0x0022
        L_0x001c:
            Hn.c$b r4 = new Hn.c$b
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r4 = r10.f81455t
            java.lang.Object r11 = eI.C17187b.f()
            int r5 = r10.f81457v
            java.lang.String r12 = "Add employee consent"
            r6 = 1
            if (r5 == 0) goto L_0x007c
            if (r5 != r6) goto L_0x0074
            java.lang.Object r1 = r10.f81452q
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r10.f81451p
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r10.f81450o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81449n
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r1
            java.lang.Object r1 = r10.f81448m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81447l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81446k
            com.ingka.ikea.app.caasremote.models.AddEmployeeConsentRequestRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.AddEmployeeConsentRequestRemoteModel) r1
            java.lang.Object r1 = r10.f81445j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81444i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81443h
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r10.f81442g
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r10.f81441f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r10.f81440e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f81439d
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r10.f81438c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r4)
            r16 = r12
            goto L_0x01ba
        L_0x0074:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007c:
            XH.y.b(r4)
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0092:
            boolean r8 = r5.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x00aa
            java.lang.Object r8 = r5.next()
            r13 = r8
            qv.b r13 = (qv.C11819b) r13
            boolean r9 = r13.b(r4, r9)
            if (r9 == 0) goto L_0x0092
            r7.add(r8)
            goto L_0x0092
        L_0x00aa:
            java.util.Iterator r5 = r7.iterator()
            r8 = 0
            r15 = r7
            r13 = r8
            r14 = r13
        L_0x00b2:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x0139
            java.lang.Object r19 = r5.next()
            r15 = r19
            qv.b r15 = (qv.C11819b) r15
            r9 = 0
            if (r13 != 0) goto L_0x00d1
            java.lang.String r13 = qv.C11818a.a(r12, r9)
            if (r13 != 0) goto L_0x00cd
            r15 = r19
            goto L_0x0139
        L_0x00cd:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x00d1:
            r20 = r13
            if (r14 != 0) goto L_0x0122
            java.lang.Class<Hn.c> r13 = Hn.c.class
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            r9 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r8, r9, r8)
            r6 = 46
            java.lang.String r6 = HJ.C15854t.o1(r14, r6, r8, r9, r8)
            int r9 = r6.length()
            if (r9 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r9 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r6, r9)
        L_0x00f8:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r9 = "main"
            r14 = 1
            boolean r6 = HJ.C15854t.b0(r6, r9, r14)
            if (r6 == 0) goto L_0x010c
            java.lang.String r6 = "m"
            goto L_0x010e
        L_0x010c:
            java.lang.String r6 = "b"
        L_0x010e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r6 = "|"
            r9.append(r6)
            r9.append(r13)
            java.lang.String r14 = r9.toString()
        L_0x0122:
            r6 = r14
            r16 = 0
            r13 = r15
            r14 = r4
            r15 = r6
            r9 = 0
            r17 = r9
            r18 = r20
            r13.a(r14, r15, r16, r17, r18)
            r14 = r6
            r15 = r19
            r13 = r20
            r6 = 1
            r9 = 0
            goto L_0x00b2
        L_0x0139:
            Hn.d$b r4 = Hn.d.b.f81647c
            boolean r4 = kotlin.jvm.internal.C17542s.e(r1, r4)
            if (r4 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x014c
            int r4 = r23.length()
            if (r4 != 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r4 = 0
            goto L_0x014d
        L_0x014c:
            r4 = 1
        L_0x014d:
            if (r4 != 0) goto L_0x0150
            goto L_0x0160
        L_0x0150:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0158:
            Hn.d$c r4 = Hn.d.c.f81653c
            boolean r4 = kotlin.jvm.internal.C17542s.e(r1, r4)
            if (r4 == 0) goto L_0x01c3
        L_0x0160:
            If.a r4 = r0.f81435a
            tw.g r6 = r0.f81436b
            java.lang.String r6 = r6.i()
            tw.g r8 = r0.f81436b
            java.lang.String r9 = r8.a()
            com.ingka.ikea.app.caasremote.models.h r8 = r22.e()
            java.lang.String r13 = r22.d()
            r16 = r12
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r12 = r21.o(r22, r23)
            r17 = r11
            com.ingka.ikea.app.caasremote.models.AddEmployeeConsentRequestRemoteModel r11 = new com.ingka.ikea.app.caasremote.models.AddEmployeeConsentRequestRemoteModel
            r11.<init>(r13, r12, r8)
            java.lang.String r8 = r22.f()
            r10.f81438c = r0
            r10.f81439d = r1
            r10.f81440e = r2
            r10.f81441f = r3
            r10.f81442g = r1
            r10.f81443h = r4
            r10.f81444i = r6
            r10.f81445j = r9
            r10.f81446k = r11
            r10.f81447l = r8
            r10.f81448m = r13
            r10.f81449n = r12
            r10.f81450o = r14
            r10.f81451p = r7
            r10.f81452q = r5
            r10.f81453r = r15
            r1 = 0
            r10.f81454s = r1
            r1 = 1
            r10.f81457v = r1
            r5 = r4
            r7 = r8
            r8 = r11
            java.lang.Object r4 = r5.c(r6, r7, r8, r9, r10)
            r1 = r17
            if (r4 != r1) goto L_0x01b9
            return r1
        L_0x01b9:
            r1 = r0
        L_0x01ba:
            QL.x r4 = (QL.x) r4
            r2 = r16
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r4, r2)
            return r1
        L_0x01c3:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.a(Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: Fn.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List<Fn.f> r21, Hn.d r22, java.lang.String r23, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            boolean r5 = r4 instanceof Hn.c.C1590c
            if (r5 == 0) goto L_0x001e
            r5 = r4
            Hn.c$c r5 = (Hn.c.C1590c) r5
            int r6 = r5.f81478w
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.f81478w = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            Hn.c$c r5 = new Hn.c$c
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r5 = r11.f81476u
            java.lang.Object r12 = eI.C17187b.f()
            int r6 = r11.f81478w
            r7 = 1
            if (r6 == 0) goto L_0x007e
            if (r6 != r7) goto L_0x0076
            java.lang.Object r1 = r11.f81473r
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f81472q
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r11.f81471p
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81470o
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r1
            java.lang.Object r1 = r11.f81469n
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r11.f81468m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81467l
            com.ingka.ikea.app.caasremote.models.AddItemsRequestRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.AddItemsRequestRemoteModel) r1
            java.lang.Object r1 = r11.f81466k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81465j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81464i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r11.f81463h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81462g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f81461f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81460e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81459d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f81458c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r5)
            goto L_0x01ea
        L_0x0076:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007e:
            XH.y.b(r5)
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r9 = r6.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x00ac
            java.lang.Object r9 = r6.next()
            r13 = r9
            qv.b r13 = (qv.C11819b) r13
            boolean r10 = r13.b(r5, r10)
            if (r10 == 0) goto L_0x0094
            r8.add(r9)
            goto L_0x0094
        L_0x00ac:
            java.util.Iterator r6 = r8.iterator()
            r9 = 0
            r13 = r9
            r14 = r13
        L_0x00b3:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x0137
            java.lang.Object r8 = r6.next()
            r15 = r8
            qv.b r15 = (qv.C11819b) r15
            r10 = 0
            if (r13 != 0) goto L_0x00d1
            java.lang.String r13 = "Add items to cart"
            java.lang.String r13 = qv.C11818a.a(r13, r10)
            if (r13 != 0) goto L_0x00cd
            goto L_0x0137
        L_0x00cd:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x00d1:
            r19 = r13
            if (r14 != 0) goto L_0x0122
            java.lang.Class<Hn.c> r13 = Hn.c.class
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            r10 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r10, r9)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r14, r7, r9, r10, r9)
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r10 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r7, r10)
        L_0x00f8:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = "main"
            r14 = 1
            boolean r7 = HJ.C15854t.b0(r7, r10, r14)
            if (r7 == 0) goto L_0x010c
            java.lang.String r7 = "m"
            goto L_0x010e
        L_0x010c:
            java.lang.String r7 = "b"
        L_0x010e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "|"
            r10.append(r7)
            r10.append(r13)
            java.lang.String r14 = r10.toString()
        L_0x0122:
            r7 = r14
            r16 = 0
            r13 = r15
            r14 = r5
            r15 = r7
            r10 = 0
            r17 = r10
            r18 = r19
            r13.a(r14, r15, r16, r17, r18)
            r14 = r7
            r13 = r19
            r7 = 1
            r10 = 0
            goto L_0x00b3
        L_0x0137:
            Hn.d$b r5 = Hn.d.b.f81647c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x0156
            if (r3 == 0) goto L_0x014a
            int r5 = r23.length()
            if (r5 != 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r14 = 0
            goto L_0x014b
        L_0x014a:
            r14 = 1
        L_0x014b:
            if (r14 != 0) goto L_0x014e
            goto L_0x015e
        L_0x014e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0156:
            Hn.d$c r5 = Hn.d.c.f81653c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x01f3
        L_0x015e:
            If.a r6 = r0.f81435a
            tw.g r5 = r0.f81436b
            java.lang.String r7 = r5.i()
            tw.g r5 = r0.f81436b
            java.lang.String r10 = r5.a()
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            r13 = 10
            int r13 = YH.C16877v.y(r5, r13)
            r9.<init>(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x017e:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x019c
            java.lang.Object r8 = r5.next()
            r13 = r8
            Fn.f r13 = (Fn.f) r13
            com.ingka.ikea.app.caasremote.models.ItemRequestRemoteModel r14 = new com.ingka.ikea.app.caasremote.models.ItemRequestRemoteModel
            java.lang.String r15 = r13.a()
            float r13 = r13.b()
            r14.<init>(r15, r13)
            r9.add(r14)
            goto L_0x017e
        L_0x019c:
            com.ingka.ikea.app.caasremote.models.h r13 = r22.e()
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r14 = r0.o(r2, r3)
            java.lang.String r15 = r22.d()
            r16 = r12
            com.ingka.ikea.app.caasremote.models.AddItemsRequestRemoteModel r12 = new com.ingka.ikea.app.caasremote.models.AddItemsRequestRemoteModel
            r12.<init>(r9, r15, r14, r13)
            r17 = r8
            java.lang.String r8 = r22.f()
            r11.f81458c = r0
            r11.f81459d = r1
            r11.f81460e = r2
            r11.f81461f = r3
            r11.f81462g = r4
            r11.f81463h = r2
            r11.f81464i = r6
            r11.f81465j = r7
            r11.f81466k = r10
            r11.f81467l = r12
            r11.f81468m = r8
            r11.f81469n = r13
            r11.f81470o = r14
            r11.f81471p = r15
            r11.f81472q = r9
            r11.f81473r = r5
            r1 = r17
            r11.f81474s = r1
            r1 = 0
            r11.f81475t = r1
            r1 = 1
            r11.f81478w = r1
            r9 = r12
            java.lang.Object r5 = r6.f(r7, r8, r9, r10, r11)
            r1 = r16
            if (r5 != r1) goto L_0x01e9
            return r1
        L_0x01e9:
            r1 = r0
        L_0x01ea:
            QL.x r5 = (QL.x) r5
            java.lang.String r2 = "Add items"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r5, r2)
            return r1
        L_0x01f3:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.c(java.util.List, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(Hn.d r26, java.lang.String r27, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r15 = r27
            r2 = r28
            boolean r3 = r2 instanceof Hn.c.d
            if (r3 == 0) goto L_0x001c
            r3 = r2
            Hn.c$d r3 = (Hn.c.d) r3
            int r4 = r3.f81498v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f81498v = r4
        L_0x001a:
            r12 = r3
            goto L_0x0022
        L_0x001c:
            Hn.c$d r3 = new Hn.c$d
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r12.f81496t
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r12.f81498v
            r5 = 1
            if (r4 == 0) goto L_0x006c
            if (r4 != r5) goto L_0x0064
            java.lang.Object r1 = r12.f81490n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r12.f81489m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81488l
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r12.f81487k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81486j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81485i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81484h
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r12.f81483g
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81482f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r12.f81481e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81480d
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81479c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r3)
            goto L_0x01eb
        L_0x0064:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006c:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0082:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x009a
            java.lang.Object r7 = r4.next()
            r10 = r7
            qv.b r10 = (qv.C11819b) r10
            boolean r8 = r10.b(r3, r8)
            if (r8 == 0) goto L_0x0082
            r6.add(r7)
            goto L_0x0082
        L_0x009a:
            java.util.Iterator r4 = r6.iterator()
            r7 = 0
            r10 = r7
            r11 = r10
        L_0x00a1:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0131
            java.lang.Object r6 = r4.next()
            r16 = r6
            qv.b r16 = (qv.C11819b) r16
            r13 = 0
            if (r10 != 0) goto L_0x00d2
            java.lang.String r10 = r26.d()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "Delete all items from cart in group: "
            r14.append(r8)
            r14.append(r10)
            java.lang.String r8 = r14.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r13)
            if (r8 != 0) goto L_0x00ce
            goto L_0x0131
        L_0x00ce:
            java.lang.String r10 = qv.C11820c.a(r8)
        L_0x00d2:
            if (r11 != 0) goto L_0x0120
            java.lang.Class<Hn.c> r8 = Hn.c.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r11 = 36
            r14 = 2
            java.lang.String r11 = HJ.C15854t.s1(r8, r11, r7, r14, r7)
            r13 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r13, r7, r14, r7)
            int r13 = r11.length()
            if (r13 != 0) goto L_0x00f1
            goto L_0x00f7
        L_0x00f1:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r11, r8)
        L_0x00f7:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r13 = "main"
            boolean r11 = HJ.C15854t.b0(r11, r13, r5)
            if (r11 == 0) goto L_0x010a
            java.lang.String r11 = "m"
            goto L_0x010c
        L_0x010a:
            java.lang.String r11 = "b"
        L_0x010c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = "|"
            r13.append(r11)
            r13.append(r8)
            java.lang.String r11 = r13.toString()
        L_0x0120:
            r19 = 0
            r17 = r3
            r18 = r11
            r8 = 0
            r20 = r8
            r21 = r10
            r16.a(r17, r18, r19, r20, r21)
            r8 = 0
            goto L_0x00a1
        L_0x0131:
            Hn.d$b r3 = Hn.d.b.f81647c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x0150
            if (r15 == 0) goto L_0x0144
            int r3 = r27.length()
            if (r3 != 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r3 = 0
            goto L_0x0145
        L_0x0144:
            r3 = r5
        L_0x0145:
            if (r3 != 0) goto L_0x0148
            goto L_0x0158
        L_0x0148:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0150:
            Hn.d$c r3 = Hn.d.c.f81653c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x01f4
        L_0x0158:
            If.a r3 = r0.f81435a
            tw.g r7 = r0.f81436b
            java.lang.String r8 = r7.i()
            tw.g r7 = r0.f81436b
            java.lang.String r14 = r7.a()
            boolean r7 = r26.b()
            boolean r11 = r26.c()
            boolean r13 = r26.a()
            java.lang.String r10 = r26.d()
            r17 = r9
            com.ingka.ikea.app.caasremote.models.h r9 = r26.e()
            r16 = r6
            java.lang.String r6 = r26.f()
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.b.a(r5)
            java.lang.Boolean r21 = kotlin.coroutines.jvm.internal.b.a(r13)
            java.lang.Boolean r23 = kotlin.coroutines.jvm.internal.b.a(r7)
            java.lang.Boolean r19 = kotlin.coroutines.jvm.internal.b.a(r11)
            r5 = r10
            r10 = r19
            r12.f81479c = r0
            r12.f81480d = r1
            r12.f81481e = r15
            r12.f81482f = r2
            r12.f81483g = r1
            r12.f81484h = r3
            r12.f81485i = r8
            r12.f81486j = r14
            r12.f81487k = r5
            r12.f81488l = r9
            r12.f81489m = r6
            r12.f81490n = r4
            r1 = r16
            r12.f81491o = r1
            r12.f81492p = r7
            r12.f81493q = r11
            r12.f81494r = r13
            r1 = 0
            r12.f81495s = r1
            r1 = 1
            r12.f81498v = r1
            r7 = 0
            r11 = 0
            r13 = 0
            r1 = 0
            r22 = r14
            r14 = r1
            r16 = 0
            r19 = 10512(0x2910, float:1.473E-41)
            r20 = 0
            r2 = r3
            r3 = r8
            r4 = r6
            r1 = r5
            r5 = r22
            r6 = r18
            r8 = r21
            r24 = r17
            r17 = r9
            r9 = r23
            r18 = r12
            r12 = r1
            r15 = r17
            r17 = r27
            java.lang.Object r3 = If.a.C1004a.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r24
            if (r3 != r1) goto L_0x01ea
            return r1
        L_0x01ea:
            r1 = r0
        L_0x01eb:
            QL.x r3 = (QL.x) r3
            java.lang.String r2 = "Delete all items"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r3, r2)
            return r1
        L_0x01f4:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.e(Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r25, Hn.d r26, java.lang.String r27, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r15 = r27
            r2 = r28
            boolean r3 = r2 instanceof Hn.c.e
            if (r3 == 0) goto L_0x001c
            r3 = r2
            Hn.c$e r3 = (Hn.c.e) r3
            int r4 = r3.f81519w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f81519w = r4
        L_0x001a:
            r13 = r3
            goto L_0x0022
        L_0x001c:
            Hn.c$e r3 = new Hn.c$e
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r13.f81517u
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r13.f81519w
            r5 = 1
            if (r4 == 0) goto L_0x0070
            if (r4 != r5) goto L_0x0068
            java.lang.Object r1 = r13.f81511o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r13.f81510n
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r13.f81509m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81508l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81507k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81506j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81505i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r13.f81504h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r13.f81503g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r13.f81502f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81501e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r13.f81500d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81499c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r3)
            goto L_0x01db
        L_0x0068:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0070:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x009e
            java.lang.Object r7 = r4.next()
            r9 = r7
            qv.b r9 = (qv.C11819b) r9
            boolean r8 = r9.b(r3, r8)
            if (r8 == 0) goto L_0x0086
            r6.add(r7)
            goto L_0x0086
        L_0x009e:
            java.util.Iterator r4 = r6.iterator()
            r7 = 0
            r9 = r7
            r11 = r9
        L_0x00a5:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0121
            java.lang.Object r6 = r4.next()
            r16 = r6
            qv.b r16 = (qv.C11819b) r16
            r12 = 0
            if (r9 != 0) goto L_0x00c3
            java.lang.String r9 = "Delete discount from cart"
            java.lang.String r9 = qv.C11818a.a(r9, r12)
            if (r9 != 0) goto L_0x00bf
            goto L_0x0121
        L_0x00bf:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x00c3:
            if (r11 != 0) goto L_0x0111
            java.lang.Class<Hn.c> r11 = Hn.c.class
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r14 = 36
            r8 = 2
            java.lang.String r14 = HJ.C15854t.s1(r11, r14, r7, r8, r7)
            r12 = 46
            java.lang.String r8 = HJ.C15854t.o1(r14, r12, r7, r8, r7)
            int r12 = r8.length()
            if (r12 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.String r11 = "Kt"
            java.lang.String r11 = HJ.C15854t.P0(r8, r11)
        L_0x00e8:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r12 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r12, r5)
            if (r8 == 0) goto L_0x00fb
            java.lang.String r8 = "m"
            goto L_0x00fd
        L_0x00fb:
            java.lang.String r8 = "b"
        L_0x00fd:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r8 = "|"
            r12.append(r8)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
        L_0x0111:
            r19 = 0
            r17 = r3
            r18 = r11
            r8 = 0
            r20 = r8
            r21 = r9
            r16.a(r17, r18, r19, r20, r21)
            r8 = 0
            goto L_0x00a5
        L_0x0121:
            Hn.d$b r3 = Hn.d.b.f81647c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x0140
            if (r15 == 0) goto L_0x0134
            int r3 = r27.length()
            if (r3 != 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r3 = 0
            goto L_0x0135
        L_0x0134:
            r3 = r5
        L_0x0135:
            if (r3 != 0) goto L_0x0138
            goto L_0x0148
        L_0x0138:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0140:
            Hn.d$c r3 = Hn.d.c.f81653c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x01e4
        L_0x0148:
            If.a r3 = r0.f81435a
            tw.g r7 = r0.f81436b
            java.lang.String r7 = r7.i()
            tw.g r8 = r0.f81436b
            java.lang.String r9 = r8.a()
            boolean r8 = r26.b()
            boolean r12 = r26.c()
            boolean r14 = r26.a()
            java.lang.String r11 = r26.d()
            r17 = r10
            java.lang.String r10 = r26.f()
            r16 = r6
            com.ingka.ikea.app.caasremote.models.h r6 = r26.e()
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.b.a(r5)
            java.lang.Boolean r21 = kotlin.coroutines.jvm.internal.b.a(r14)
            java.lang.Boolean r22 = kotlin.coroutines.jvm.internal.b.a(r8)
            java.lang.Boolean r19 = kotlin.coroutines.jvm.internal.b.a(r12)
            r5 = r11
            r11 = r19
            r13.f81499c = r0
            r0 = r25
            r13.f81500d = r0
            r13.f81501e = r1
            r13.f81502f = r15
            r13.f81503g = r2
            r13.f81504h = r1
            r13.f81505i = r3
            r13.f81506j = r7
            r13.f81507k = r9
            r13.f81508l = r5
            r13.f81509m = r10
            r13.f81510n = r6
            r13.f81511o = r4
            r1 = r16
            r13.f81512p = r1
            r13.f81513q = r8
            r13.f81514r = r12
            r13.f81515s = r14
            r1 = 0
            r13.f81516t = r1
            r1 = 1
            r13.f81519w = r1
            r8 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r19 = 10272(0x2820, float:1.4394E-41)
            r20 = 0
            r2 = r3
            r3 = r7
            r4 = r10
            r1 = r5
            r5 = r25
            r0 = r6
            r6 = r9
            r7 = r18
            r9 = r21
            r23 = r17
            r10 = r22
            r18 = r13
            r13 = r1
            r15 = r0
            r17 = r27
            java.lang.Object r3 = If.a.C1004a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r23
            if (r3 != r0) goto L_0x01d9
            return r0
        L_0x01d9:
            r1 = r24
        L_0x01db:
            QL.x r3 = (QL.x) r3
            java.lang.String r0 = "Delete discount"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r0 = r1.r(r3, r0)
            return r0
        L_0x01e4:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.g(java.lang.String, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(Hn.d r25, java.lang.String r26, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r14 = r26
            r2 = r27
            boolean r3 = r2 instanceof Hn.c.f
            if (r3 == 0) goto L_0x001c
            r3 = r2
            Hn.c$f r3 = (Hn.c.f) r3
            int r4 = r3.f81539v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f81539v = r4
        L_0x001a:
            r12 = r3
            goto L_0x0022
        L_0x001c:
            Hn.c$f r3 = new Hn.c$f
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r12.f81537t
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r12.f81539v
            java.lang.String r8 = "Delete employee consent"
            r5 = 1
            if (r4 == 0) goto L_0x0070
            if (r4 != r5) goto L_0x0068
            java.lang.Object r1 = r12.f81531n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r12.f81530m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81529l
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r12.f81528k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81527j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81526i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81525h
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r12.f81524g
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81523f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r12.f81522e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81521d
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81520c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r3)
            r2 = r1
            r1 = r8
            goto L_0x01e9
        L_0x0068:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0070:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r7 = r4.hasNext()
            r11 = 0
            if (r7 == 0) goto L_0x009e
            java.lang.Object r7 = r4.next()
            r10 = r7
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r3, r11)
            if (r10 == 0) goto L_0x0086
            r6.add(r7)
            goto L_0x0086
        L_0x009e:
            java.util.Iterator r4 = r6.iterator()
            r7 = 0
            r10 = r7
            r13 = r10
        L_0x00a5:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x0129
            java.lang.Object r6 = r4.next()
            r15 = r6
            qv.b r15 = (qv.C11819b) r15
            r11 = 0
            if (r10 != 0) goto L_0x00c1
            java.lang.String r10 = qv.C11818a.a(r8, r11)
            if (r10 != 0) goto L_0x00bd
            goto L_0x0129
        L_0x00bd:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x00c1:
            if (r13 != 0) goto L_0x0113
            java.lang.Class<Hn.c> r13 = Hn.c.class
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r11 = 36
            r5 = 2
            java.lang.String r11 = HJ.C15854t.s1(r13, r11, r7, r5, r7)
            r21 = r6
            r6 = 46
            java.lang.String r5 = HJ.C15854t.o1(r11, r6, r7, r5, r7)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.String r6 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r5, r6)
        L_0x00e8:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "main"
            r11 = 1
            boolean r5 = HJ.C15854t.b0(r5, r6, r11)
            if (r5 == 0) goto L_0x00fc
            java.lang.String r5 = "m"
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r5 = "b"
        L_0x00fe:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "|"
            r6.append(r5)
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            goto L_0x0115
        L_0x0113:
            r21 = r6
        L_0x0115:
            r18 = 0
            r16 = r3
            r17 = r13
            r5 = 0
            r19 = r5
            r20 = r10
            r15.a(r16, r17, r18, r19, r20)
            r6 = r21
            r5 = 1
            r11 = 0
            goto L_0x00a5
        L_0x0129:
            Hn.d$b r3 = Hn.d.b.f81647c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x0148
            if (r14 == 0) goto L_0x013c
            int r3 = r26.length()
            if (r3 != 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r3 = 0
            goto L_0x013d
        L_0x013c:
            r3 = 1
        L_0x013d:
            if (r3 != 0) goto L_0x0140
            goto L_0x0150
        L_0x0140:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0148:
            Hn.d$c r3 = Hn.d.c.f81653c
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x01f0
        L_0x0150:
            If.a r3 = r0.f81435a
            tw.g r5 = r0.f81436b
            java.lang.String r5 = r5.i()
            tw.g r7 = r0.f81436b
            java.lang.String r15 = r7.a()
            boolean r7 = r25.b()
            boolean r11 = r25.c()
            boolean r13 = r25.a()
            java.lang.String r10 = r25.f()
            r16 = r9
            com.ingka.ikea.app.caasremote.models.h r9 = r25.e()
            r17 = r8
            java.lang.String r8 = r25.d()
            r18 = 1
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.b.a(r18)
            java.lang.Boolean r21 = kotlin.coroutines.jvm.internal.b.a(r13)
            java.lang.Boolean r22 = kotlin.coroutines.jvm.internal.b.a(r7)
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.b.a(r11)
            r19 = r13
            r13 = r10
            r10 = r18
            r12.f81520c = r0
            r12.f81521d = r1
            r12.f81522e = r14
            r12.f81523f = r2
            r12.f81524g = r1
            r12.f81525h = r3
            r12.f81526i = r5
            r12.f81527j = r15
            r12.f81528k = r13
            r12.f81529l = r9
            r12.f81530m = r8
            r12.f81531n = r4
            r12.f81532o = r6
            r12.f81533p = r7
            r12.f81534q = r11
            r1 = r19
            r12.f81535r = r1
            r1 = 0
            r12.f81536s = r1
            r1 = 1
            r12.f81539v = r1
            r7 = 0
            r11 = 0
            r1 = 0
            r4 = r13
            r13 = r1
            r6 = r15
            r15 = r1
            r18 = 5392(0x1510, float:7.556E-42)
            r19 = 0
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r20
            r1 = r17
            r17 = r8
            r8 = r21
            r23 = r16
            r16 = r9
            r9 = r22
            r20 = r12
            r12 = r17
            r14 = r16
            r16 = r26
            r17 = r20
            java.lang.Object r3 = If.a.C1004a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r23
            if (r3 != r2) goto L_0x01e8
            return r2
        L_0x01e8:
            r2 = r0
        L_0x01e9:
            QL.x r3 = (QL.x) r3
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r2.r(r3, r1)
            return r1
        L_0x01f0:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.i(Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.util.List<java.lang.String> r34, Hn.d r35, java.lang.String r36, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r37) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            r14 = r36
            r3 = r37
            boolean r4 = r3 instanceof Hn.c.g
            if (r4 == 0) goto L_0x001e
            r4 = r3
            Hn.c$g r4 = (Hn.c.g) r4
            int r5 = r4.f81560w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f81560w = r5
        L_0x001c:
            r13 = r4
            goto L_0x0024
        L_0x001e:
            Hn.c$g r4 = new Hn.c$g
            r4.<init>(r0, r3)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r4 = r13.f81558u
            java.lang.Object r10 = eI.C17187b.f()
            int r5 = r13.f81560w
            r6 = 1
            if (r5 == 0) goto L_0x0076
            if (r5 != r6) goto L_0x006e
            java.lang.Object r1 = r13.f81553p
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r13.f81552o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81551n
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r13.f81550m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81549l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81548k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81547j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81546i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r13.f81545h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r13.f81544g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r13.f81543f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.f81542e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r13.f81541d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r13.f81540c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r4)
            goto L_0x020b
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0076:
            XH.y.b(r4)
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x008c:
            boolean r8 = r5.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x00a4
            java.lang.Object r8 = r5.next()
            r11 = r8
            qv.b r11 = (qv.C11819b) r11
            boolean r9 = r11.b(r4, r9)
            if (r9 == 0) goto L_0x008c
            r7.add(r8)
            goto L_0x008c
        L_0x00a4:
            java.util.Iterator r5 = r7.iterator()
            r8 = 0
            r11 = r8
            r12 = r11
        L_0x00ab:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x0131
            java.lang.Object r7 = r5.next()
            r15 = r7
            qv.b r15 = (qv.C11819b) r15
            r9 = 0
            if (r11 != 0) goto L_0x00c9
            java.lang.String r11 = "Delete items from cart"
            java.lang.String r11 = qv.C11818a.a(r11, r9)
            if (r11 != 0) goto L_0x00c5
            goto L_0x0131
        L_0x00c5:
            java.lang.String r11 = qv.C11820c.a(r11)
        L_0x00c9:
            if (r12 != 0) goto L_0x011b
            java.lang.Class<Hn.c> r12 = Hn.c.class
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r9 = 36
            r6 = 2
            java.lang.String r9 = HJ.C15854t.s1(r12, r9, r8, r6, r8)
            r22 = r7
            r7 = 46
            java.lang.String r6 = HJ.C15854t.o1(r9, r7, r8, r6, r8)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r7 = "Kt"
            java.lang.String r12 = HJ.C15854t.P0(r6, r7)
        L_0x00f0:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "main"
            r9 = 1
            boolean r6 = HJ.C15854t.b0(r6, r7, r9)
            if (r6 == 0) goto L_0x0104
            java.lang.String r6 = "m"
            goto L_0x0106
        L_0x0104:
            java.lang.String r6 = "b"
        L_0x0106:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "|"
            r7.append(r6)
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            goto L_0x011d
        L_0x011b:
            r22 = r7
        L_0x011d:
            r18 = 0
            r16 = r4
            r17 = r12
            r6 = 0
            r19 = r6
            r20 = r11
            r15.a(r16, r17, r18, r19, r20)
            r7 = r22
            r6 = 1
            r9 = 0
            goto L_0x00ab
        L_0x0131:
            Hn.d$b r4 = Hn.d.b.f81647c
            boolean r4 = kotlin.jvm.internal.C17542s.e(r2, r4)
            if (r4 == 0) goto L_0x0150
            if (r14 == 0) goto L_0x0144
            int r4 = r36.length()
            if (r4 != 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r9 = 0
            goto L_0x0145
        L_0x0144:
            r9 = 1
        L_0x0145:
            if (r9 != 0) goto L_0x0148
            goto L_0x0158
        L_0x0148:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0150:
            Hn.d$c r4 = Hn.d.c.f81653c
            boolean r4 = kotlin.jvm.internal.C17542s.e(r2, r4)
            if (r4 == 0) goto L_0x0214
        L_0x0158:
            If.a r4 = r0.f81435a
            tw.g r6 = r0.f81436b
            java.lang.String r6 = r6.i()
            tw.g r8 = r0.f81436b
            java.lang.String r9 = r8.a()
            r22 = r1
            java.lang.Iterable r22 = (java.lang.Iterable) r22
            r29 = 62
            r30 = 0
            java.lang.String r23 = ","
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            java.lang.String r15 = YH.C16877v.G0(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r8 = r35.b()
            boolean r12 = r35.c()
            boolean r11 = r35.a()
            r16 = r10
            java.lang.String r10 = r35.d()
            r17 = r7
            com.ingka.ikea.app.caasremote.models.h r7 = r35.e()
            r18 = r5
            java.lang.String r5 = r35.f()
            r19 = 1
            java.lang.Boolean r22 = kotlin.coroutines.jvm.internal.b.a(r19)
            java.lang.Boolean r19 = kotlin.coroutines.jvm.internal.b.a(r11)
            java.lang.Boolean r23 = kotlin.coroutines.jvm.internal.b.a(r8)
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.b.a(r12)
            r31 = r11
            r11 = r20
            r13.f81540c = r0
            r13.f81541d = r1
            r13.f81542e = r2
            r13.f81543f = r14
            r13.f81544g = r3
            r13.f81545h = r2
            r13.f81546i = r4
            r13.f81547j = r6
            r13.f81548k = r9
            r13.f81549l = r15
            r13.f81550m = r10
            r13.f81551n = r7
            r13.f81552o = r5
            r1 = r18
            r13.f81553p = r1
            r1 = r17
            r13.f81554q = r1
            r13.f81555r = r8
            r13.f81556s = r12
            r1 = r31
            r13.f81557t = r1
            r1 = 1
            r13.f81560w = r1
            r8 = 0
            r12 = 0
            r1 = 0
            r2 = r15
            r15 = r1
            r17 = 0
            r20 = 10512(0x2910, float:1.473E-41)
            r21 = 0
            r3 = r4
            r4 = r6
            r6 = r9
            r1 = r7
            r7 = r22
            r9 = r19
            r32 = r16
            r16 = r10
            r10 = r23
            r19 = r13
            r13 = r16
            r14 = r2
            r16 = r1
            r18 = r36
            java.lang.Object r4 = If.a.C1004a.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r32
            if (r4 != r1) goto L_0x020a
            return r1
        L_0x020a:
            r1 = r0
        L_0x020b:
            QL.x r4 = (QL.x) r4
            java.lang.String r2 = "Delete item"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r4, r2)
            return r1
        L_0x0214:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.k(java.util.List, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(Hn.d r37, java.lang.String r38, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r14 = r38
            r2 = r39
            boolean r3 = r2 instanceof Hn.c.h
            if (r3 == 0) goto L_0x001c
            r3 = r2
            Hn.c$h r3 = (Hn.c.h) r3
            int r4 = r3.f81580v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f81580v = r4
        L_0x001a:
            r12 = r3
            goto L_0x0022
        L_0x001c:
            Hn.c$h r3 = new Hn.c$h
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r12.f81578t
            java.lang.Object r9 = eI.C17187b.f()
            int r4 = r12.f81580v
            java.lang.String r8 = "|"
            java.lang.String r20 = "b"
            java.lang.String r21 = "m"
            java.lang.String r5 = "main"
            java.lang.String r15 = "Kt"
            r7 = 0
            r10 = 1
            r13 = 0
            if (r4 == 0) goto L_0x007e
            if (r4 != r10) goto L_0x0076
            java.lang.Object r1 = r12.f81572n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r12.f81571m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81570l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81569k
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r12.f81568j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81567i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81566h
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r12.f81565g
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81564f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r12.f81563e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r12.f81562d
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r12.f81561c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r3)
            r31 = r5
            r32 = r8
            r30 = r15
            goto L_0x0216
        L_0x0076:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007e:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0094:
            boolean r18 = r4.hasNext()
            if (r18 == 0) goto L_0x00ab
            java.lang.Object r6 = r4.next()
            r11 = r6
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r3, r7)
            if (r11 == 0) goto L_0x0094
            r10.add(r6)
            goto L_0x0094
        L_0x00ab:
            java.util.Iterator r4 = r10.iterator()
            r6 = r13
            r11 = r6
        L_0x00b1:
            boolean r22 = r4.hasNext()
            if (r22 == 0) goto L_0x0144
            java.lang.Object r10 = r4.next()
            r22 = r10
            qv.b r22 = (qv.C11819b) r22
            r7 = 0
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = "Fetching cart"
            java.lang.String r6 = qv.C11818a.a(r6, r7)
            if (r6 != 0) goto L_0x00d1
            r28 = r9
            r3 = r10
            r11 = 46
            goto L_0x0149
        L_0x00d1:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x00d5:
            if (r11 != 0) goto L_0x0127
            java.lang.Class<Hn.c> r11 = Hn.c.class
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r28 = r9
            r18 = r10
            r7 = 36
            r9 = 2
            java.lang.String r10 = HJ.C15854t.s1(r11, r7, r13, r9, r13)
            r19 = r11
            r11 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r11, r13, r9, r13)
            int r16 = r10.length()
            if (r16 != 0) goto L_0x00fc
            r10 = r19
            goto L_0x0100
        L_0x00fc:
            java.lang.String r10 = HJ.C15854t.P0(r10, r15)
        L_0x0100:
            java.lang.Thread r16 = java.lang.Thread.currentThread()
            java.lang.String r7 = r16.getName()
            r9 = 1
            boolean r7 = HJ.C15854t.b0(r7, r5, r9)
            if (r7 == 0) goto L_0x0112
            r7 = r21
            goto L_0x0114
        L_0x0112:
            r7 = r20
        L_0x0114:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            r9.append(r10)
            java.lang.String r7 = r9.toString()
            goto L_0x012e
        L_0x0127:
            r28 = r9
            r18 = r10
            r7 = r11
            r11 = 46
        L_0x012e:
            r25 = 0
            r23 = r3
            r24 = r7
            r9 = 0
            r26 = r9
            r27 = r6
            r22.a(r23, r24, r25, r26, r27)
            r11 = r7
            r10 = r18
            r9 = r28
            r7 = 0
            goto L_0x00b1
        L_0x0144:
            r28 = r9
            r11 = 46
            r3 = r10
        L_0x0149:
            Hn.d$b r6 = Hn.d.b.f81647c
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x0168
            if (r14 == 0) goto L_0x015c
            int r6 = r38.length()
            if (r6 != 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r6 = 0
            goto L_0x015d
        L_0x015c:
            r6 = 1
        L_0x015d:
            if (r6 != 0) goto L_0x0160
            goto L_0x0170
        L_0x0160:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0168:
            Hn.d$c r6 = Hn.d.c.f81653c
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x03e4
        L_0x0170:
            If.a r9 = r0.f81435a
            tw.g r6 = r0.f81436b
            java.lang.String r7 = r6.i()
            tw.g r6 = r0.f81436b
            java.lang.String r6 = r6.a()
            boolean r10 = r37.c()
            boolean r11 = r37.b()
            r22 = r15
            com.ingka.ikea.app.caasremote.models.h r15 = r37.e()
            boolean r13 = r37.a()
            r24 = r5
            java.lang.String r5 = r37.f()
            r25 = r8
            java.lang.String r8 = r37.d()
            java.lang.Boolean r26 = kotlin.coroutines.jvm.internal.b.a(r13)
            java.lang.Boolean r27 = kotlin.coroutines.jvm.internal.b.a(r11)
            java.lang.Boolean r29 = kotlin.coroutines.jvm.internal.b.a(r10)
            r17 = r13
            r13 = r10
            r10 = r29
            r12.f81561c = r0
            r12.f81562d = r1
            r12.f81563e = r14
            r12.f81564f = r2
            r12.f81565g = r1
            r12.f81566h = r9
            r12.f81567i = r7
            r12.f81568j = r6
            r12.f81569k = r15
            r12.f81570l = r5
            r12.f81571m = r8
            r12.f81572n = r4
            r12.f81573o = r3
            r12.f81574p = r13
            r12.f81575q = r11
            r1 = r17
            r12.f81576r = r1
            r1 = 0
            r12.f81577s = r1
            r4 = 1
            r12.f81580v = r4
            r2 = 0
            r16 = r6
            r3 = 2
            r6 = r2
            r13 = r1
            r17 = r7
            r1 = 36
            r7 = r2
            r11 = 0
            r2 = r1
            r1 = 46
            r18 = 0
            r1 = r13
            r13 = r18
            r30 = r22
            r22 = r15
            r15 = r18
            r18 = 5400(0x1518, float:7.567E-42)
            r19 = 0
            r2 = r9
            r9 = r3
            r3 = r17
            r4 = r5
            r31 = r24
            r5 = r16
            r16 = r8
            r32 = r25
            r8 = r26
            r1 = r28
            r9 = r27
            r17 = r12
            r12 = r16
            r14 = r22
            r16 = r38
            java.lang.Object r3 = If.a.C1004a.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L_0x0215
            return r1
        L_0x0215:
            r1 = r0
        L_0x0216:
            QL.x r3 = (QL.x) r3
            boolean r2 = r3.e()
            java.lang.String r4 = "Unable to fetch cart"
            if (r2 != 0) goto L_0x0300
            qv.e r2 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0233:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x024b
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r2, r9)
            if (r8 == 0) goto L_0x0233
            r6.add(r7)
            goto L_0x0233
        L_0x024b:
            java.util.Iterator r11 = r6.iterator()
            r5 = 0
            r13 = 0
        L_0x0251:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x02fa
            java.lang.Object r6 = r11.next()
            qv.b r6 = (qv.C11819b) r6
            r9 = 0
            if (r13 != 0) goto L_0x0280
            int r7 = r3.b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Fetch cart unsuccessful, code: "
            r8.append(r10)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r9)
            if (r7 == 0) goto L_0x02fa
            java.lang.String r7 = qv.C11820c.a(r7)
            r13 = r7
        L_0x0280:
            if (r5 != 0) goto L_0x02d6
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 0
            r12 = 36
            r14 = 2
            java.lang.String r8 = HJ.C15854t.s1(r5, r12, r7, r14, r7)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r7, r14, r7)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x02a4
            r10 = r30
            goto L_0x02aa
        L_0x02a4:
            r10 = r30
            java.lang.String r5 = HJ.C15854t.P0(r8, r10)
        L_0x02aa:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r8 = r31
            r15 = 1
            boolean r7 = HJ.C15854t.b0(r7, r8, r15)
            if (r7 == 0) goto L_0x02be
            r7 = r21
            goto L_0x02c0
        L_0x02be:
            r7 = r20
        L_0x02c0:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r7)
            r7 = r32
            r15.append(r7)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
        L_0x02d4:
            r15 = r5
            goto L_0x02e0
        L_0x02d6:
            r10 = r30
            r8 = r31
            r7 = r32
            r12 = 36
            r14 = 2
            goto L_0x02d4
        L_0x02e0:
            r16 = 0
            r5 = r6
            r6 = r2
            r33 = r7
            r7 = r15
            r34 = r8
            r8 = r16
            r35 = r10
            r10 = r13
            r5.a(r6, r7, r8, r9, r10)
            r5 = r15
            r32 = r33
            r31 = r34
            r30 = r35
            goto L_0x0251
        L_0x02fa:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r4)
            throw r1
        L_0x0300:
            r35 = r30
            r34 = r31
            r33 = r32
            r12 = 36
            r14 = 2
            java.lang.Object r2 = r3.a()
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r2 = (com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel) r2
            if (r2 != 0) goto L_0x03e3
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Fetch cart response body was null"
            r2.<init>(r3)
            qv.e r3 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x032b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0343
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r3, r9)
            if (r8 == 0) goto L_0x032b
            r6.add(r7)
            goto L_0x032b
        L_0x0343:
            java.util.Iterator r11 = r6.iterator()
            r5 = 0
            r13 = 0
        L_0x0349:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x03dd
            java.lang.Object r6 = r11.next()
            qv.b r6 = (qv.C11819b) r6
            r15 = 0
            if (r13 != 0) goto L_0x0363
            java.lang.String r7 = qv.C11818a.a(r15, r2)
            if (r7 == 0) goto L_0x03dd
            java.lang.String r7 = qv.C11820c.a(r7)
            r13 = r7
        L_0x0363:
            if (r5 != 0) goto L_0x03b6
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r7 = HJ.C15854t.s1(r5, r12, r15, r14, r15)
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r15, r14, r15)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0383
            r9 = r35
            goto L_0x0389
        L_0x0383:
            r9 = r35
            java.lang.String r5 = HJ.C15854t.P0(r7, r9)
        L_0x0389:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r8 = r34
            r12 = 1
            boolean r7 = HJ.C15854t.b0(r7, r8, r12)
            if (r7 == 0) goto L_0x039d
            r7 = r21
            goto L_0x039f
        L_0x039d:
            r7 = r20
        L_0x039f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r7 = r33
            r10.append(r7)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x03b3:
            r16 = r5
            goto L_0x03be
        L_0x03b6:
            r7 = r33
            r8 = r34
            r9 = r35
            r12 = 1
            goto L_0x03b3
        L_0x03be:
            r10 = 0
            r5 = r6
            r6 = r3
            r17 = r7
            r7 = r16
            r18 = r8
            r8 = r10
            r22 = r9
            r9 = r2
            r23 = 46
            r10 = r13
            r5.a(r6, r7, r8, r9, r10)
            r5 = r16
            r33 = r17
            r34 = r18
            r35 = r22
            r12 = 36
            goto L_0x0349
        L_0x03dd:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r4)
            throw r1
        L_0x03e3:
            return r2
        L_0x03e4:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.m(Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.lang.String r23, Hn.d r24, java.lang.String r25, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            boolean r5 = r4 instanceof Hn.c.i
            if (r5 == 0) goto L_0x001e
            r5 = r4
            Hn.c$i r5 = (Hn.c.i) r5
            int r6 = r5.f81601w
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.f81601w = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            Hn.c$i r5 = new Hn.c$i
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r5 = r11.f81599u
            java.lang.Object r12 = eI.C17187b.f()
            int r6 = r11.f81601w
            java.lang.String r13 = "Merge user cart"
            r7 = 1
            if (r6 == 0) goto L_0x0082
            if (r6 != r7) goto L_0x007a
            java.lang.Object r1 = r11.f81596r
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f81595q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r11.f81594p
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81593o
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r1
            java.lang.Object r1 = r11.f81592n
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81591m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81590l
            com.ingka.ikea.app.caasremote.models.MergeCartFromUserIdRequestRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.MergeCartFromUserIdRequestRemoteModel) r1
            java.lang.Object r1 = r11.f81589k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81588j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81587i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r11.f81586h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81585g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f81584f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81583e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81582d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81581c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r5)
            r16 = r13
            goto L_0x01cc
        L_0x007a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0082:
            XH.y.b(r5)
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0098:
            boolean r9 = r6.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x00b0
            java.lang.Object r9 = r6.next()
            r14 = r9
            qv.b r14 = (qv.C11819b) r14
            boolean r10 = r14.b(r5, r10)
            if (r10 == 0) goto L_0x0098
            r8.add(r9)
            goto L_0x0098
        L_0x00b0:
            java.util.Iterator r6 = r8.iterator()
            r9 = 0
            r16 = r8
            r14 = r9
            r15 = r14
        L_0x00b9:
            boolean r17 = r6.hasNext()
            if (r17 == 0) goto L_0x0142
            java.lang.Object r20 = r6.next()
            r16 = r20
            qv.b r16 = (qv.C11819b) r16
            r10 = 0
            if (r14 != 0) goto L_0x00d8
            java.lang.String r14 = qv.C11818a.a(r13, r10)
            if (r14 != 0) goto L_0x00d4
            r5 = r20
            goto L_0x0144
        L_0x00d4:
            java.lang.String r14 = qv.C11820c.a(r14)
        L_0x00d8:
            r21 = r14
            if (r15 != 0) goto L_0x0129
            java.lang.Class<Hn.c> r14 = Hn.c.class
            java.lang.String r14 = r14.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            r15 = 36
            r10 = 2
            java.lang.String r15 = HJ.C15854t.s1(r14, r15, r9, r10, r9)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r15, r7, r9, r10, r9)
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r10 = "Kt"
            java.lang.String r14 = HJ.C15854t.P0(r7, r10)
        L_0x00ff:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = "main"
            r15 = 1
            boolean r7 = HJ.C15854t.b0(r7, r10, r15)
            if (r7 == 0) goto L_0x0113
            java.lang.String r7 = "m"
            goto L_0x0115
        L_0x0113:
            java.lang.String r7 = "b"
        L_0x0115:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "|"
            r10.append(r7)
            r10.append(r14)
            java.lang.String r15 = r10.toString()
        L_0x0129:
            r7 = r15
            r17 = 0
            r14 = r16
            r15 = r5
            r16 = r7
            r10 = 0
            r18 = r10
            r19 = r21
            r14.a(r15, r16, r17, r18, r19)
            r15 = r7
            r16 = r20
            r14 = r21
            r7 = 1
            r10 = 0
            goto L_0x00b9
        L_0x0142:
            r5 = r16
        L_0x0144:
            Hn.d$b r7 = Hn.d.b.f81647c
            boolean r7 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r7 == 0) goto L_0x0163
            if (r3 == 0) goto L_0x0157
            int r7 = r25.length()
            if (r7 != 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r7 = 0
            goto L_0x0158
        L_0x0157:
            r7 = 1
        L_0x0158:
            if (r7 != 0) goto L_0x015b
            goto L_0x016b
        L_0x015b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0163:
            Hn.d$c r7 = Hn.d.c.f81653c
            boolean r7 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r7 == 0) goto L_0x01d5
        L_0x016b:
            If.a r7 = r0.f81435a
            tw.g r9 = r0.f81436b
            java.lang.String r9 = r9.i()
            tw.g r10 = r0.f81436b
            java.lang.String r10 = r10.a()
            com.ingka.ikea.app.caasremote.models.h r14 = r24.e()
            r16 = r13
            java.lang.String r13 = r24.d()
            r17 = r12
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r12 = r0.o(r2, r3)
            r18 = r5
            com.ingka.ikea.app.caasremote.models.MergeCartFromUserIdRequestRemoteModel r5 = new com.ingka.ikea.app.caasremote.models.MergeCartFromUserIdRequestRemoteModel
            r5.<init>(r1, r13, r12, r14)
            java.lang.String r14 = r24.f()
            r11.f81581c = r0
            r11.f81582d = r1
            r11.f81583e = r2
            r11.f81584f = r3
            r11.f81585g = r4
            r11.f81586h = r2
            r11.f81587i = r7
            r11.f81588j = r9
            r11.f81589k = r10
            r11.f81590l = r5
            r11.f81591m = r14
            r11.f81592n = r13
            r11.f81593o = r12
            r11.f81594p = r15
            r11.f81595q = r8
            r11.f81596r = r6
            r1 = r18
            r11.f81597s = r1
            r1 = 0
            r11.f81598t = r1
            r1 = 1
            r11.f81601w = r1
            r6 = r7
            r7 = r9
            r8 = r14
            r9 = r5
            java.lang.Object r5 = r6.d(r7, r8, r9, r10, r11)
            r1 = r17
            if (r5 != r1) goto L_0x01cb
            return r1
        L_0x01cb:
            r1 = r0
        L_0x01cc:
            QL.x r5 = (QL.x) r5
            r2 = r16
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r5, r2)
            return r1
        L_0x01d5:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.p(java.lang.String, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.util.List<java.lang.String> r22, Hn.d r23, java.lang.String r24, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            boolean r5 = r4 instanceof Hn.c.j
            if (r5 == 0) goto L_0x001e
            r5 = r4
            Hn.c$j r5 = (Hn.c.j) r5
            int r6 = r5.f81622w
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.f81622w = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            Hn.c$j r5 = new Hn.c$j
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r5 = r11.f81620u
            java.lang.Object r12 = eI.C17187b.f()
            int r6 = r11.f81622w
            r7 = 1
            if (r6 == 0) goto L_0x007e
            if (r6 != r7) goto L_0x0076
            java.lang.Object r1 = r11.f81617r
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f81616q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r11.f81615p
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81614o
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r1
            java.lang.Object r1 = r11.f81613n
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r11.f81612m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81611l
            com.ingka.ikea.app.caasremote.models.SetDiscountCodesRequestRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.SetDiscountCodesRequestRemoteModel) r1
            java.lang.Object r1 = r11.f81610k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81609j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81608i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r11.f81607h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81606g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f81605f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81604e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81603d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f81602c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r5)
            goto L_0x01c2
        L_0x0076:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007e:
            XH.y.b(r5)
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r9 = r6.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x00ac
            java.lang.Object r9 = r6.next()
            r13 = r9
            qv.b r13 = (qv.C11819b) r13
            boolean r10 = r13.b(r5, r10)
            if (r10 == 0) goto L_0x0094
            r8.add(r9)
            goto L_0x0094
        L_0x00ac:
            java.util.Iterator r6 = r8.iterator()
            r9 = 0
            r15 = r8
            r13 = r9
            r14 = r13
        L_0x00b4:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x013d
            java.lang.Object r19 = r6.next()
            r15 = r19
            qv.b r15 = (qv.C11819b) r15
            r10 = 0
            if (r13 != 0) goto L_0x00d5
            java.lang.String r13 = "Set discount to cart"
            java.lang.String r13 = qv.C11818a.a(r13, r10)
            if (r13 != 0) goto L_0x00d1
            r15 = r19
            goto L_0x013d
        L_0x00d1:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x00d5:
            r20 = r13
            if (r14 != 0) goto L_0x0126
            java.lang.Class<Hn.c> r13 = Hn.c.class
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            r10 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r10, r9)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r14, r7, r9, r10, r9)
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00f6
            goto L_0x00fc
        L_0x00f6:
            java.lang.String r10 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r7, r10)
        L_0x00fc:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = "main"
            r14 = 1
            boolean r7 = HJ.C15854t.b0(r7, r10, r14)
            if (r7 == 0) goto L_0x0110
            java.lang.String r7 = "m"
            goto L_0x0112
        L_0x0110:
            java.lang.String r7 = "b"
        L_0x0112:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "|"
            r10.append(r7)
            r10.append(r13)
            java.lang.String r14 = r10.toString()
        L_0x0126:
            r7 = r14
            r16 = 0
            r13 = r15
            r14 = r5
            r15 = r7
            r10 = 0
            r17 = r10
            r18 = r20
            r13.a(r14, r15, r16, r17, r18)
            r14 = r7
            r15 = r19
            r13 = r20
            r7 = 1
            r10 = 0
            goto L_0x00b4
        L_0x013d:
            Hn.d$b r5 = Hn.d.b.f81647c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x015c
            if (r3 == 0) goto L_0x0150
            int r5 = r24.length()
            if (r5 != 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r5 = 0
            goto L_0x0151
        L_0x0150:
            r5 = 1
        L_0x0151:
            if (r5 != 0) goto L_0x0154
            goto L_0x0164
        L_0x0154:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x015c:
            Hn.d$c r5 = Hn.d.c.f81653c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x01d6
        L_0x0164:
            If.a r5 = r0.f81435a
            tw.g r7 = r0.f81436b
            java.lang.String r7 = r7.i()
            tw.g r9 = r0.f81436b
            java.lang.String r10 = r9.a()
            java.lang.String r9 = r23.d()
            com.ingka.ikea.app.caasremote.models.h r13 = r23.e()
            r16 = r12
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r12 = r0.o(r2, r3)
            r17 = r15
            com.ingka.ikea.app.caasremote.models.SetDiscountCodesRequestRemoteModel r15 = new com.ingka.ikea.app.caasremote.models.SetDiscountCodesRequestRemoteModel
            r15.<init>(r1, r9, r12, r13)
            java.lang.String r9 = r23.f()
            r11.f81602c = r0
            r11.f81603d = r1
            r11.f81604e = r2
            r11.f81605f = r3
            r11.f81606g = r4
            r11.f81607h = r2
            r11.f81608i = r5
            r11.f81609j = r7
            r11.f81610k = r10
            r11.f81611l = r15
            r11.f81612m = r9
            r11.f81613n = r13
            r11.f81614o = r12
            r11.f81615p = r14
            r11.f81616q = r8
            r11.f81617r = r6
            r1 = r17
            r11.f81618s = r1
            r1 = 0
            r11.f81619t = r1
            r1 = 1
            r11.f81622w = r1
            r6 = r5
            r8 = r9
            r9 = r15
            java.lang.Object r5 = r6.b(r7, r8, r9, r10, r11)
            r1 = r16
            if (r5 != r1) goto L_0x01c1
            return r1
        L_0x01c1:
            r1 = r0
        L_0x01c2:
            QL.x r5 = (QL.x) r5
            boolean r2 = r5.e()
            if (r2 == 0) goto L_0x01d1
            java.lang.String r2 = "Put discount"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r5, r2)
            return r1
        L_0x01d1:
            Fn.d r1 = r1.s(r5)
            throw r1
        L_0x01d6:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.t(java.util.List, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.util.List<Fn.f> r20, Hn.d r21, java.lang.String r22, dI.C17164e<? super com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            boolean r5 = r4 instanceof Hn.c.k
            if (r5 == 0) goto L_0x001e
            r5 = r4
            Hn.c$k r5 = (Hn.c.k) r5
            int r6 = r5.f81644x
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.f81644x = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            Hn.c$k r5 = new Hn.c$k
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r5 = r11.f81642v
            java.lang.Object r12 = eI.C17187b.f()
            int r6 = r11.f81644x
            r7 = 1
            if (r6 == 0) goto L_0x0082
            if (r6 != r7) goto L_0x007a
            java.lang.Object r1 = r11.f81639s
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f81638r
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r11.f81637q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r11.f81636p
            com.ingka.ikea.app.caasremote.models.h r1 = (com.ingka.ikea.app.caasremote.models.h) r1
            java.lang.Object r1 = r11.f81635o
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f81634n
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81633m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81632l
            com.ingka.ikea.app.caasremote.models.UpdateItemsRequestRemoteModel r1 = (com.ingka.ikea.app.caasremote.models.UpdateItemsRequestRemoteModel) r1
            java.lang.Object r1 = r11.f81631k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81630j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81629i
            If.a r1 = (If.a) r1
            java.lang.Object r1 = r11.f81628h
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81627g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f81626f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f81625e
            Hn.d r1 = (Hn.d) r1
            java.lang.Object r1 = r11.f81624d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f81623c
            Hn.c r1 = (Hn.c) r1
            XH.y.b(r5)
            goto L_0x01f1
        L_0x007a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0082:
            XH.y.b(r5)
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0098:
            boolean r9 = r6.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x00b0
            java.lang.Object r9 = r6.next()
            r13 = r9
            qv.b r13 = (qv.C11819b) r13
            boolean r10 = r13.b(r5, r10)
            if (r10 == 0) goto L_0x0098
            r8.add(r9)
            goto L_0x0098
        L_0x00b0:
            java.util.Iterator r6 = r8.iterator()
            r8 = 0
            r9 = r8
            r13 = r9
        L_0x00b7:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x0134
            java.lang.Object r14 = r6.next()
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            if (r9 != 0) goto L_0x00d3
            java.lang.String r9 = "Update item in cart"
            java.lang.String r9 = qv.C11818a.a(r9, r15)
            if (r9 != 0) goto L_0x00cf
            goto L_0x0134
        L_0x00cf:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x00d3:
            if (r13 != 0) goto L_0x0122
            java.lang.Class<Hn.c> r13 = Hn.c.class
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r15 = 36
            r10 = 2
            java.lang.String r15 = HJ.C15854t.s1(r13, r15, r8, r10, r8)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r15, r7, r8, r10, r8)
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r10 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r7, r10)
        L_0x00f8:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = "main"
            r15 = 1
            boolean r7 = HJ.C15854t.b0(r7, r10, r15)
            if (r7 == 0) goto L_0x010c
            java.lang.String r7 = "m"
            goto L_0x010e
        L_0x010c:
            java.lang.String r7 = "b"
        L_0x010e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "|"
            r10.append(r7)
            r10.append(r13)
            java.lang.String r13 = r10.toString()
        L_0x0122:
            r7 = r13
            r10 = 0
            r13 = r14
            r14 = r5
            r17 = 0
            r15 = r7
            r16 = r10
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)
            r13 = r7
            r7 = 1
            r10 = 0
            goto L_0x00b7
        L_0x0134:
            Hn.d$b r5 = Hn.d.b.f81647c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x0153
            if (r3 == 0) goto L_0x0147
            int r5 = r22.length()
            if (r5 != 0) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r15 = 0
            goto L_0x0148
        L_0x0147:
            r15 = 1
        L_0x0148:
            if (r15 != 0) goto L_0x014b
            goto L_0x015b
        L_0x014b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Store id must be provided for instore cart"
            r1.<init>(r2)
            throw r1
        L_0x0153:
            Hn.d$c r5 = Hn.d.c.f81653c
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x01fa
        L_0x015b:
            If.a r6 = r0.f81435a
            tw.g r5 = r0.f81436b
            java.lang.String r7 = r5.i()
            tw.g r5 = r0.f81436b
            java.lang.String r10 = r5.a()
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r5 = r0.o(r2, r3)
            java.lang.String r8 = r21.d()
            r9 = r1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = YH.C16877v.y(r9, r14)
            r13.<init>(r14)
            java.util.Iterator r14 = r9.iterator()
        L_0x0183:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01a8
            java.lang.Object r15 = r14.next()
            Fn.f r15 = (Fn.f) r15
            r16 = r12
            com.ingka.ikea.app.caasremote.models.ItemRequestRemoteModel r12 = new com.ingka.ikea.app.caasremote.models.ItemRequestRemoteModel
            r17 = r14
            java.lang.String r14 = r15.a()
            float r15 = r15.b()
            r12.<init>(r14, r15)
            r13.add(r12)
            r12 = r16
            r14 = r17
            goto L_0x0183
        L_0x01a8:
            r16 = r12
            r17 = r14
            com.ingka.ikea.app.caasremote.models.h r12 = r21.e()
            com.ingka.ikea.app.caasremote.models.UpdateItemsRequestRemoteModel r14 = new com.ingka.ikea.app.caasremote.models.UpdateItemsRequestRemoteModel
            r14.<init>(r13, r8, r5, r12)
            java.lang.String r5 = r21.f()
            r11.f81623c = r0
            r11.f81624d = r1
            r11.f81625e = r2
            r11.f81626f = r3
            r11.f81627g = r4
            r11.f81628h = r2
            r11.f81629i = r6
            r11.f81630j = r7
            r11.f81631k = r10
            r11.f81632l = r14
            r11.f81633m = r5
            r11.f81634n = r8
            r11.f81635o = r13
            r11.f81636p = r12
            r11.f81637q = r9
            r11.f81638r = r13
            r1 = r17
            r11.f81639s = r1
            r1 = 0
            r11.f81640t = r1
            r11.f81641u = r1
            r1 = 1
            r11.f81644x = r1
            r8 = r5
            r9 = r14
            java.lang.Object r5 = r6.e(r7, r8, r9, r10, r11)
            r1 = r16
            if (r5 != r1) goto L_0x01f0
            return r1
        L_0x01f0:
            r1 = r0
        L_0x01f1:
            QL.x r5 = (QL.x) r5
            java.lang.String r2 = "Update item"
            com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel r1 = r1.r(r5, r2)
            return r1
        L_0x01fa:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.c.v(java.util.List, Hn.d, java.lang.String, dI.e):java.lang.Object");
    }
}
