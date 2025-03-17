package xo;

import HJ.C15854t;
import IC.C13026h;
import Nn.C10802e;
import Nn.S;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import il.C11404d;
import ip.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import sg.f;
import tI.C17978n;
import xo.C12324d;
import xo.j;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010%J\u001d\u0010(\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010%J+\u00101\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\b\u0012\u0004\u0012\u0002030\u000b¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010AR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0C8\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010GR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010AR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0C8\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010GR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u000b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010AR#\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u000b0C8\u0006¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010GR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010AR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001b0C8\u0006¢\u0006\f\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010GR\"\u0010_\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010AR%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110>0C8\u0006¢\u0006\f\n\u0004\b`\u0010E\u001a\u0004\ba\u0010GR\"\u0010d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010AR%\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0>0C8\u0006¢\u0006\f\n\u0004\be\u0010E\u001a\u0004\bf\u0010GR\"\u0010i\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010AR%\u0010l\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0>0C8\u0006¢\u0006\f\n\u0004\bj\u0010E\u001a\u0004\bk\u0010GR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010AR\u0016\u0010p\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010\u0019R \u0010u\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020r0q8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR(\u0010{\u001a\u0004\u0018\u00010!2\b\u0010v\u001a\u0004\u0018\u00010!8\u0006@BX\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001a\u0010\u001a\b\u0012\u0004\u0012\u00020*0|8\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R \u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b$\u0010\u0001R\u001d\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0001R\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020!0C8\u0006¢\u0006\r\n\u0004\b6\u0010E\u001a\u0005\b\u0001\u0010G¨\u0006\u0001"}, d2 = {"Lxo/i;", "Lsg/f;", "Landroidx/lifecycle/f0;", "LIl/a;", "appConfigApi", "Lxo/c;", "repository", "LWn/b;", "checkoutAnalytics", "<init>", "(LIl/a;Lxo/c;LWn/b;)V", "", "Lqg/i;", "activeFields", "LXH/N;", "e0", "(Ljava/util/List;)V", "", "error", "Y", "(Ljava/lang/Throwable;)V", "LNn/e$b;", "X", "(LNn/e$b;)V", "LNn/e$b$c;", "Z", "(LNn/e$b$c;)V", "", "f0", "(Ljava/util/List;)Z", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "model", "overrideCurrentValues", "Lxo/b;", "c0", "(Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;Z)Lxo/b;", "L", "()V", "M", "field", "g", "(Lqg/i;)Z", "", "checkoutId", "i0", "(Ljava/lang/String;)V", "g0", "", "additionalUserDetailsValues", "h0", "(Ljava/lang/String;Ljava/util/Map;)V", "", "P", "()Ljava/util/List;", "N", "m", "LIl/a;", "n", "Lxo/c;", "o", "LWn/b;", "Landroidx/lifecycle/K;", "Lip/d;", "Lxo/d;", "p", "Landroidx/lifecycle/K;", "_wasSubmitSuccessful", "Landroidx/lifecycle/F;", "q", "Landroidx/lifecycle/F;", "W", "()Landroidx/lifecycle/F;", "wasSubmitSuccessful", "r", "_submitButtonEnabled", "s", "U", "submitButtonEnabled", "t", "_isSubmittingForm", "u", "b0", "isSubmittingForm", "Lil/d;", "v", "_validation", "w", "V", "validation", "x", "_isInteractionEnabled", "y", "a0", "isInteractionEnabled", "z", "_showFatalError", "A", "R", "showFatalError", "B", "_showRecoverableError", "C", "T", "showRecoverableError", "D", "_showInputErrorSnackbar", "E", "S", "showInputErrorSnackbar", "F", "hasVisibilityChanged", "G", "forceExpandCollapsibleFields", "", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "H", "Ljava/util/Map;", "attributesCache", "value", "I", "Lxo/b;", "O", "()Lxo/b;", "cache", "LTJ/A;", "J", "LTJ/A;", "checkoutIdFlow", "LTJ/g;", "K", "LTJ/g;", "configuration", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "currentShippingBillingDynamicModel", "Landroidx/lifecycle/I;", "Landroidx/lifecycle/I;", "_sections", "Q", "sections", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends f0 implements f {

    /* renamed from: A  reason: collision with root package name */
    private final F<d<Throwable>> f106120A;

    /* renamed from: B  reason: collision with root package name */
    private final K<d<Boolean>> f106121B;

    /* renamed from: C  reason: collision with root package name */
    private final F<d<Boolean>> f106122C;

    /* renamed from: D  reason: collision with root package name */
    private final K<d<Boolean>> f106123D;

    /* renamed from: E  reason: collision with root package name */
    private final F<d<Boolean>> f106124E;

    /* renamed from: F  reason: collision with root package name */
    private final K<Boolean> f106125F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public boolean f106126G;

    /* renamed from: H  reason: collision with root package name */
    private final Map<String, FieldAttributes> f106127H = new LinkedHashMap();

    /* renamed from: I  reason: collision with root package name */
    private C12322b f106128I;

    /* renamed from: J  reason: collision with root package name */
    private final C16504A<String> f106129J;

    /* renamed from: K  reason: collision with root package name */
    private final C16532g<ShippingBillingDynamicModel> f106130K;

    /* renamed from: L  reason: collision with root package name */
    private ShippingBillingDynamicModel f106131L;

    /* renamed from: M  reason: collision with root package name */
    private final I<C12322b> f106132M;

    /* renamed from: N  reason: collision with root package name */
    private final F<C12322b> f106133N;

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f106134m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C12323c f106135n;

    /* renamed from: o  reason: collision with root package name */
    private final Wn.b f106136o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final K<d<C12324d>> f106137p;

    /* renamed from: q  reason: collision with root package name */
    private final F<d<C12324d>> f106138q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final K<Boolean> f106139r;

    /* renamed from: s  reason: collision with root package name */
    private final F<Boolean> f106140s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final K<Boolean> f106141t;

    /* renamed from: u  reason: collision with root package name */
    private final F<Boolean> f106142u;

    /* renamed from: v  reason: collision with root package name */
    private final K<List<C11404d>> f106143v;

    /* renamed from: w  reason: collision with root package name */
    private final F<List<C11404d>> f106144w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final K<Boolean> f106145x;

    /* renamed from: y  reason: collision with root package name */
    private final F<Boolean> f106146y;

    /* renamed from: z  reason: collision with root package name */
    private final K<d<Throwable>> f106147z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.userdetails.UserDetailsDynamicFieldsViewModel$special$$inlined$flatMapLatest$1", f = "UserDetailsDynamicFieldsViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super ShippingBillingDynamicModel>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106148c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f106149d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f106150e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f106151f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, i iVar) {
            super(3, eVar);
            this.f106151f = iVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super ShippingBillingDynamicModel> hVar, String str, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f106151f);
            aVar.f106149d = hVar;
            aVar.f106150e = str;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f106148c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<ShippingBillingDynamicModel> b10 = this.f106151f.f106135n.b((String) this.f106150e);
                this.f106148c = 1;
                if (C16534i.x((C16533h) this.f106149d, b10, this) == f10) {
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"xo/i$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f106152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f106153b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, i iVar, List list) {
            super(aVar);
            this.f106152a = iVar;
            this.f106153b = list;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            i iVar2 = this.f106152a;
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Error submit user details", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = iVar2.getClass().getName();
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
            this.f106152a.e0(this.f106153b);
            this.f106152a.Y(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.userdetails.UserDetailsDynamicFieldsViewModel$trySubmit$3", f = "UserDetailsDynamicFieldsViewModel.kt", l = {182}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f106154c;

        /* renamed from: d  reason: collision with root package name */
        Object f106155d;

        /* renamed from: e  reason: collision with root package name */
        Object f106156e;

        /* renamed from: f  reason: collision with root package name */
        Object f106157f;

        /* renamed from: g  reason: collision with root package name */
        Object f106158g;

        /* renamed from: h  reason: collision with root package name */
        Object f106159h;

        /* renamed from: i  reason: collision with root package name */
        Object f106160i;

        /* renamed from: j  reason: collision with root package name */
        Object f106161j;

        /* renamed from: k  reason: collision with root package name */
        Object f106162k;

        /* renamed from: l  reason: collision with root package name */
        int f106163l;

        /* renamed from: m  reason: collision with root package name */
        int f106164m;

        /* renamed from: n  reason: collision with root package name */
        int f106165n;

        /* renamed from: o  reason: collision with root package name */
        int f106166o;

        /* renamed from: p  reason: collision with root package name */
        int f106167p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ List<qg.i<?>> f106168q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ i f106169r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f106170s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f106171t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List<? extends qg.i<?>> list, i iVar, String str, Map<String, String> map, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f106168q = list;
            this.f106169r = iVar;
            this.f106170s = str;
            this.f106171t = map;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f106168q, this.f106169r, this.f106170s, this.f106171t, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f106167p;
            if (i10 == 0) {
                y.b(obj);
                for (qg.i q10 : this.f106168q) {
                    q10.q(false);
                }
                this.f106169r.f106145x.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                this.f106169r.f106139r.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<qg.i<?>> list = this.f106168q;
                Iterable iterable = list;
                int e10 = C17978n.e(X.e(C16877v.y(iterable, 10)), 16);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e10);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    qg.i iVar = (qg.i) it.next();
                    String g10 = iVar.g();
                    Object j10 = iVar.j();
                    C17542s.g(j10);
                    v a10 = C16796C.a(g10, j10);
                    linkedHashMap2.put(a10.c(), a10.d());
                }
                linkedHashMap.putAll(X.z(linkedHashMap2));
                this.f106169r.f106141t.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                C12323c E10 = this.f106169r.f106135n;
                String str = this.f106170s;
                Map<String, String> map = this.f106171t;
                this.f106154c = linkedHashMap;
                this.f106155d = linkedHashMap;
                this.f106156e = list;
                this.f106157f = linkedHashMap;
                this.f106158g = iterable;
                this.f106159h = linkedHashMap;
                this.f106160i = iterable;
                this.f106161j = linkedHashMap2;
                this.f106162k = it;
                this.f106163l = 0;
                this.f106164m = 0;
                this.f106165n = e10;
                this.f106166o = 0;
                this.f106167p = 1;
                obj = E10.a(str, linkedHashMap, map, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Iterator it2 = (Iterator) this.f106162k;
                Map map2 = (Map) this.f106161j;
                Iterable iterable2 = (Iterable) this.f106160i;
                Map map3 = (Map) this.f106159h;
                Iterable iterable3 = (Iterable) this.f106158g;
                Map map4 = (Map) this.f106157f;
                List list2 = (List) this.f106156e;
                Map map5 = (Map) this.f106155d;
                Map map6 = (Map) this.f106154c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f106169r.e0(this.f106168q);
            this.f106169r.f106137p.setValue(new d(new C12324d.b((S) obj)));
            return C16807N.f139792a;
        }
    }

    public i(Il.a aVar, C12323c cVar, Wn.b bVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(cVar, "repository");
        C17542s.j(bVar, "checkoutAnalytics");
        this.f106134m = aVar;
        this.f106135n = cVar;
        this.f106136o = bVar;
        K<d<C12324d>> k10 = new K<>();
        this.f106137p = k10;
        this.f106138q = k10;
        K<Boolean> k11 = new K<>();
        k11.setValue(Boolean.FALSE);
        this.f106139r = k11;
        this.f106140s = k11;
        K<Boolean> k12 = new K<>();
        this.f106141t = k12;
        this.f106142u = k12;
        K<List<C11404d>> k13 = new K<>();
        this.f106143v = k13;
        this.f106144w = k13;
        K<Boolean> k14 = new K<>();
        k14.setValue(Boolean.TRUE);
        this.f106145x = k14;
        this.f106146y = k14;
        K<d<Throwable>> k15 = new K<>();
        this.f106147z = k15;
        this.f106120A = k15;
        K<d<Boolean>> k16 = new K<>();
        this.f106121B = k16;
        this.f106122C = k16;
        K<d<Boolean>> k17 = new K<>();
        this.f106123D = k17;
        this.f106124E = k17;
        K<Boolean> k18 = new K<>();
        this.f106125F = k18;
        C16504A<String> b10 = C16511H.b(1, 0, (C16428d) null, 6, (Object) null);
        this.f106129J = b10;
        C16532g<ShippingBillingDynamicModel> g02 = C16534i.g0(b10, new a((C17164e) null, this));
        this.f106130K = g02;
        I<C12322b> i10 = new I<>();
        i10.b(C5210m.c(g02, (C17168i) null, 0, 3, (Object) null), new j.a(new C12326f(i10, this)));
        i10.b(k18, new j.a(new C12327g(i10, this)));
        this.f106132M = i10;
        this.f106133N = i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(I i10, i iVar, Boolean bool) {
        i10.setValue(iVar.c0(iVar.f106131L, false));
        return C16807N.f139792a;
    }

    private final void L() {
        List<qg.i<?>> list;
        C12325e eVar = C12325e.f106111a;
        C12322b bVar = this.f106128I;
        if (bVar == null || (list = bVar.a()) == null) {
            list = C16877v.n();
        }
        boolean e10 = eVar.e(list);
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("evaluate, visibilityChanged: " + e10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar2, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (e10) {
            this.f106125F.setValue(Boolean.FALSE);
        }
        M();
    }

    private final void M() {
        boolean z10;
        C12322b bVar = this.f106128I;
        if (bVar != null) {
            Iterable b10 = bVar.b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            Iterator it = b10.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(Boolean.valueOf(((qg.i) it.next()).t(true, false)));
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z10 = true;
            if (!C17542s.e(Boolean.valueOf(z10), this.f106139r.getValue())) {
                this.f106139r.setValue(Boolean.valueOf(z10));
            }
        }
    }

    private final void X(C10802e.b bVar) {
        if (C17542s.e(bVar, C10802e.b.C1701b.f84042a)) {
            this.f106121B.setValue(new d(Boolean.TRUE));
        } else if (bVar instanceof C10802e.b.c) {
            Z((C10802e.b.c) bVar);
        } else if (bVar instanceof C10802e.b.a) {
            this.f106147z.setValue(new d(bVar));
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void Y(Throwable th2) {
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("Error putting shipping billing address", th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i.class.getName();
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
        this.f106137p.setValue(new d(C12324d.a.f106109a));
        if (th2 instanceof C10802e) {
            C10802e eVar2 = (C10802e) th2;
            if (C17542s.e(eVar2, C10802e.d.f84046a)) {
                this.f106147z.setValue(new d(th2));
            } else if (eVar2 instanceof C10802e.b) {
                X((C10802e.b) th2);
            } else if (eVar2 instanceof C10802e.c) {
                this.f106147z.setValue(new d(th2));
            } else if ((eVar2 instanceof C10802e.a) || (eVar2 instanceof C10802e.C1702e)) {
                this.f106121B.setValue(new d(Boolean.TRUE));
            } else {
                throw new t();
            }
        } else {
            this.f106121B.setValue(new d(Boolean.TRUE));
        }
    }

    private final void Z(C10802e.b.c cVar) {
        qg.i iVar;
        List<qg.i<?>> b10;
        Object obj;
        boolean z10 = false;
        for (String str : cVar.a()) {
            C12322b bVar = this.f106128I;
            if (bVar == null || (b10 = bVar.b()) == null) {
                iVar = null;
            } else {
                Iterator it = b10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((qg.i) obj).g(), str)) {
                        break;
                    }
                }
                iVar = (qg.i) obj;
            }
            if (iVar != null) {
                if (!C17542s.e(iVar.o(), Boolean.FALSE)) {
                    iVar.b(String.valueOf(iVar.j()), C13026h.a(Oo.b.f84464O6));
                    z10 = true;
                }
                this.f106136o.z(iVar.e(), iVar.j(), false);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Error for unknown field: " + str);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = i.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar2.a(eVar, str5, false, illegalStateException, str4);
                    str2 = str4;
                    str3 = str5;
                }
            }
        }
        if (z10) {
            this.f106143v.setValue(C16877v.e(C11404d.VALIDATION_FAILED));
        }
        this.f106123D.setValue(new d(Boolean.TRUE));
    }

    private final C12322b c0(ShippingBillingDynamicModel shippingBillingDynamicModel, boolean z10) {
        C12325e eVar = C12325e.f106111a;
        C12322b bVar = this.f106128I;
        Map<String, FieldAttributes> map = this.f106127H;
        String country = this.f106134m.A().getCountry();
        C17542s.i(country, "getCountry(...)");
        C12322b d10 = eVar.d(shippingBillingDynamicModel, bVar, map, z10, country, new h(this));
        this.f106128I = d10;
        M();
        return d10;
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(i iVar, Object obj) {
        C17542s.j(obj, "it");
        iVar.L();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void e0(List<? extends qg.i<?>> list) {
        this.f106145x.setValue(Boolean.TRUE);
        this.f106141t.setValue(Boolean.FALSE);
        for (qg.i q10 : list) {
            q10.q(true);
        }
        M();
    }

    private final boolean f0(List<? extends qg.i<?>> list) {
        boolean z10;
        Iterable<qg.i> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (qg.i c10 : iterable) {
            arrayList.add(Boolean.valueOf(c10.c()));
        }
        boolean z11 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (qg.i u10 : iterable) {
            arrayList2.add(Boolean.valueOf(qg.i.u(u10, false, false, 1, (Object) null)));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        K<List<C11404d>> k10 = this.f106143v;
        ArrayList arrayList3 = new ArrayList();
        if (z10) {
            arrayList3.add(C11404d.VALUE_CHANGED);
        }
        if (!z11) {
            arrayList3.add(C11404d.VALIDATION_FAILED);
        }
        k10.setValue(arrayList3);
        return z11;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(I i10, i iVar, ShippingBillingDynamicModel shippingBillingDynamicModel) {
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("New checkout holder, check user details sections", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        iVar.f106126G = false;
        iVar.f106131L = shippingBillingDynamicModel;
        i10.setValue(iVar.c0(shippingBillingDynamicModel, true));
        return C16807N.f139792a;
    }

    public final void N() {
        this.f106126G = true;
    }

    public final C12322b O() {
        return this.f106128I;
    }

    public final List<Object> P() {
        String str;
        char c10;
        Class<i> cls;
        boolean z10;
        List list;
        boolean z11;
        List<qg.i<?>> c11;
        List<qg.i<?>> e10;
        List<qg.i<?>> d10;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        yo.e eVar2 = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = i.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Get collapsed models, force expand: " + this.f106126G, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (this.f106126G) {
            return C16877v.n();
        }
        C12322b bVar2 = this.f106128I;
        if (bVar2 != null) {
            z10 = false;
            list = C16877v.A(C16877v.q(bVar2.d(), bVar2.e(), bVar2.c()));
        } else {
            z10 = false;
            list = null;
        }
        if (list != null) {
            Iterable<qg.i> iterable = list;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (qg.i t10 : iterable) {
                arrayList2.add(Boolean.valueOf(t10.t(true, true)));
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z11 = true;
        } else {
            z11 = z10;
        }
        e eVar3 = e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar3, false)) {
                arrayList3.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str6 == null) {
                String a11 = C11818a.a("Get collapsed models, valid field data: " + z11, (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str6 = C11820c.a(a11);
            }
            if (str7 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar3.a(eVar3, str7, false, (Throwable) null, str6);
            c10 = '$';
        }
        if (!z11) {
            return C16877v.n();
        }
        C12322b bVar4 = this.f106128I;
        yo.e a12 = (bVar4 == null || (d10 = bVar4.d()) == null) ? null : j.a(d10);
        C12322b bVar5 = this.f106128I;
        yo.e a13 = (bVar5 == null || (e10 = bVar5.e()) == null) ? null : j.a(e10);
        C12322b bVar6 = this.f106128I;
        if (!(bVar6 == null || (c11 = bVar6.c()) == null)) {
            eVar2 = j.a(c11);
        }
        if (a12 == null) {
            return C16877v.n();
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(a12);
        if (a13 != null) {
            arrayList4.add(new el.b("COLLAPSED_DIVIDER_SECONDARY_KEY", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
            arrayList4.add(a13);
        }
        if (eVar2 == null) {
            return arrayList4;
        }
        arrayList4.add(new el.b("COLLAPSED_DIVIDER_CONTACT_KEY", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
        arrayList4.add(eVar2);
        return arrayList4;
    }

    public final F<C12322b> Q() {
        return this.f106133N;
    }

    public final F<d<Throwable>> R() {
        return this.f106120A;
    }

    public final F<d<Boolean>> S() {
        return this.f106124E;
    }

    public final F<d<Boolean>> T() {
        return this.f106122C;
    }

    public final F<Boolean> U() {
        return this.f106140s;
    }

    public final F<List<C11404d>> V() {
        return this.f106144w;
    }

    public final F<d<C12324d>> W() {
        return this.f106138q;
    }

    public final F<Boolean> a0() {
        return this.f106146y;
    }

    public final F<Boolean> b0() {
        return this.f106142u;
    }

    public boolean g(qg.i<?> iVar) {
        if (iVar != null) {
            return qg.i.u(iVar, false, false, 3, (Object) null);
        }
        return true;
    }

    public final void g0() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        List<qg.i<?>> list = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Run validation", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i.class.getName();
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
        C12322b bVar2 = this.f106128I;
        if (bVar2 != null) {
            list = bVar2.b();
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            f0(list);
        }
    }

    public final void h0(String str, Map<String, String> map) {
        C17542s.j(str, "checkoutId");
        C12322b bVar = this.f106128I;
        if (bVar != null) {
            List<qg.i<?>> b10 = bVar.b();
            if (!b10.isEmpty()) {
                if (!f0(b10)) {
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a("trySubmit, fields are not valid do not submit", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        if (str3 == null) {
                            String name = i.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str3;
                        bVar2.a(eVar, str4, false, (Throwable) null, str2);
                        str3 = str4;
                    }
                    this.f106137p.setValue(new d(C12324d.a.f106109a));
                    return;
                }
                F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this, b10), (T) null, new c(b10, this, str, map, (C17164e<? super c>) null), 2, (Object) null);
            }
        }
    }

    public final void i0(String str) {
        C17542s.j(str, "checkoutId");
        this.f106129J.a(str);
    }
}
