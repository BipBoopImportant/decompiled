package Uj;

import HJ.C15854t;
import Hj.C10720a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import Tj.H;
import Tj.r;
import Tj.t;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gj.j;
import gj.k;
import hl.C11367a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15014g;
import rz.O;
import sj.C11854e;
import uK.C18146a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0005cdefgBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010-\u001a\u00020\u00162\u0006\u0010!\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010\u001aJ\u0017\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u0010\u001aJ\u0017\u00107\u001a\u00020'2\u0006\u0010!\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020'2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010\u001aJ\u000f\u0010>\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010\u001aJ\u001f\u0010B\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0018\u0010E\u001a\u00020\u00162\u0006\u0010!\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020T0X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000S8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010VR\u001f\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000X8\u0006¢\u0006\f\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010\\¨\u0006h"}, d2 = {"LUj/f;", "Landroidx/lifecycle/f0;", "LTj/t;", "loadProductFromCartUseCase", "Lsj/e;", "vibrationFeedback", "LTj/r;", "handleScanFailureUseCase", "LSy/a;", "scanAndGoAnalytics", "LTj/H;", "validateProductForCollectUseCase", "Lgj/k;", "scannerProductResultMapper", "LRy/a;", "settingsRepo", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(LTj/t;Lsj/e;LTj/r;LSy/a;LTj/H;Lgj/k;LRy/a;Landroidx/lifecycle/U;)V", "", "articleNumber", "LXH/N;", "T", "(Ljava/lang/String;)V", "E", "()V", "", "hasPermission", "U", "(Z)V", "F", "LUj/f$d$j;", "action", "", "V", "(LUj/f$d$j;)Ljava/lang/Object;", "Lgj/j;", "scannerProductResult", "LQJ/F0;", "W", "(Lgj/j;)LQJ/F0;", "on", "Q", "LUj/f$d$h;", "M", "(LUj/f$d$h;)V", "R", "", "throwable", "N", "(Ljava/lang/Throwable;)V", "L", "I", "LUj/f$d$c;", "H", "(LUj/f$d$c;)LQJ/F0;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "P", "(Lcom/ingka/ikea/analytics/Interaction$Component;)LQJ/F0;", "J", "O", "productTitle", "", "quantity", "K", "(Ljava/lang/String;I)V", "LUj/f$d;", "S", "(LUj/f$d;)V", "m", "LTj/t;", "n", "Lsj/e;", "o", "LTj/r;", "p", "LSy/a;", "q", "LTj/H;", "r", "Lgj/k;", "LTJ/B;", "LUj/f$f;", "s", "LTJ/B;", "_state", "LTJ/P;", "t", "LTJ/P;", "getState", "()LTJ/P;", "state", "u", "_scannerError", "v", "G", "scannerError", "d", "f", "c", "e", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final t f88022m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11854e f88023n;

    /* renamed from: o  reason: collision with root package name */
    private final r f88024o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Sy.a f88025p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final H f88026q;

    /* renamed from: r  reason: collision with root package name */
    private final k f88027r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<C1845f> f88028s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<C1845f> f88029t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<Throwable> f88030u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<Throwable> f88031v;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CollectProductScannerViewModel$1", f = "CollectProductScannerViewModel.kt", l = {69}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88032c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f88033d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f88034e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f88035f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f88034e = fVar;
            this.f88035f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f88034e, this.f88035f, eVar);
            aVar.f88033d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f88032c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f88033d;
                t h10 = this.f88034e.f88022m;
                String str = this.f88035f;
                this.f88033d = q11;
                this.f88032c = 1;
                Object r42 = h10.m9invokegIAlus(str, this);
                if (r42 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = r42;
            } else if (i10 == 1) {
                q10 = (Q) this.f88033d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = this.f88034e;
            if (x.e(obj2) == null) {
                C15014g gVar = (C15014g) obj2;
                C16505B D10 = fVar.f88028s;
                do {
                    value2 = D10.getValue();
                } while (!D10.e(value2, C1845f.b((C1845f) value2, gVar, (String) null, (e) null, false, false, false, (c) null, (b) null, 254, (Object) null)));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Opened CTA scanner for a product that doesn't exist in cart");
                qv.e eVar = qv.e.ERROR;
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
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, illegalStateException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                C16505B D11 = fVar.f88028s;
                do {
                    value = D11.getValue();
                } while (!D11.e(value, C1845f.b((C1845f) value, (C15014g) null, (String) null, e.b.C1844f.f88075d, false, false, false, (c) null, (b) null, 251, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LUj/f$b;", "", "<init>", "()V", "c", "b", "a", "LUj/f$b$a;", "LUj/f$b$b;", "LUj/f$b$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$b$a;", "LUj/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88036a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -216853132;
            }

            public String toString() {
                return "HelpDialog";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LUj/f$b$b;", "LUj/f$b;", "", "productTitle", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.f$b$b  reason: collision with other inner class name */
        public static final class C1839b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f88037a;

            /* renamed from: b  reason: collision with root package name */
            private final int f88038b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1839b(String str, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "productTitle");
                this.f88037a = str;
                this.f88038b = i10;
            }

            public final String a() {
                return this.f88037a;
            }

            public final int b() {
                return this.f88038b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1839b)) {
                    return false;
                }
                C1839b bVar = (C1839b) obj;
                return C17542s.e(this.f88037a, bVar.f88037a) && this.f88038b == bVar.f88038b;
            }

            public int hashCode() {
                return (this.f88037a.hashCode() * 31) + Integer.hashCode(this.f88038b);
            }

            public String toString() {
                String str = this.f88037a;
                int i10 = this.f88038b;
                return "ProductCollected(productTitle=" + str + ", quantity=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/f$b$c;", "LUj/f$b;", "Lgj/j;", "productResult", "<init>", "(Lgj/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/j;", "()Lgj/j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final gj.j f88039a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(gj.j jVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(jVar, "productResult");
                this.f88039a = jVar;
            }

            public final gj.j a() {
                return this.f88039a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f88039a, ((c) obj).f88039a);
            }

            public int hashCode() {
                return this.f88039a.hashCode();
            }

            public String toString() {
                gj.j jVar = this.f88039a;
                return "ProductDetails(productResult=" + jVar + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUj/f$c;", "", "<init>", "()V", "a", "b", "LUj/f$c$a;", "LUj/f$c$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/f$c$a;", "LUj/f$c;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f88040a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "permission");
                this.f88040a = str;
            }

            public final String a() {
                return this.f88040a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f88040a, ((a) obj).f88040a);
            }

            public int hashCode() {
                return this.f88040a.hashCode();
            }

            public String toString() {
                String str = this.f88040a;
                return "PermissionRequired(permission=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LUj/f$c$b;", "LUj/f$c;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPermission", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f88041a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "permission");
                this.f88041a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f88041a, ((b) obj).f88041a);
            }

            public int hashCode() {
                return this.f88041a.hashCode();
            }

            public String toString() {
                String str = this.f88041a;
                return "RequestPermissionRationale(permission=" + str + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"LUj/f$d;", "", "<init>", "()V", "o", "j", "k", "h", "p", "n", "e", "c", "m", "d", "i", "g", "b", "a", "f", "l", "LUj/f$d$a;", "LUj/f$d$b;", "LUj/f$d$c;", "LUj/f$d$d;", "LUj/f$d$e;", "LUj/f$d$f;", "LUj/f$d$g;", "LUj/f$d$h;", "LUj/f$d$i;", "LUj/f$d$j;", "LUj/f$d$k;", "LUj/f$d$l;", "LUj/f$d$m;", "LUj/f$d$n;", "LUj/f$d$o;", "LUj/f$d$p;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$a;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88042a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1476152138;
            }

            public String toString() {
                return "OnClearPermissionsIssue";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$b;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f88043a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -570297870;
            }

            public String toString() {
                return "OnClearShowManualEntryPrompt";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUj/f$d$c;", "LUj/f$d;", "<init>", "()V", "a", "b", "LUj/f$d$c$a;", "LUj/f$d$c$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class c extends d {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$c$a;", "LUj/f$d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final a f88044a = new a();

                private a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return 59753167;
                }

                public String toString() {
                    return "PrimaryAction";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$c$b;", "LUj/f$d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final b f88045a = new b();

                private b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return -805165311;
                }

                public String toString() {
                    return "SecondaryAction";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/f$d$d;", "LUj/f$d;", "", "articleNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.f$d$d  reason: collision with other inner class name */
        public static final class C1840d extends d {

            /* renamed from: a  reason: collision with root package name */
            private final String f88046a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1840d(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "articleNumber");
                this.f88046a = str;
            }

            public final String a() {
                return this.f88046a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1840d) && C17542s.e(this.f88046a, ((C1840d) obj).f88046a);
            }

            public int hashCode() {
                return this.f88046a.hashCode();
            }

            public String toString() {
                String str = this.f88046a;
                return "OnManualInputEntered(articleNumber=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$e;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final e f88047a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1049609153;
            }

            public String toString() {
                return "OnMissScanSnackBarDismissed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$f;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.f$d$f  reason: collision with other inner class name */
        public static final class C1841f extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final C1841f f88048a = new C1841f();

            private C1841f() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1841f);
            }

            public int hashCode() {
                return -917590344;
            }

            public String toString() {
                return "OnNavigateTo";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LUj/f$d$g;", "LUj/f$d;", "", "productName", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g extends d {

            /* renamed from: a  reason: collision with root package name */
            private final String f88049a;

            /* renamed from: b  reason: collision with root package name */
            private final int f88050b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(String str, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "productName");
                this.f88049a = str;
                this.f88050b = i10;
            }

            public final String a() {
                return this.f88049a;
            }

            public final int b() {
                return this.f88050b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return C17542s.e(this.f88049a, gVar.f88049a) && this.f88050b == gVar.f88050b;
            }

            public int hashCode() {
                return (this.f88049a.hashCode() * 31) + Integer.hashCode(this.f88050b);
            }

            public String toString() {
                String str = this.f88049a;
                int i10 = this.f88050b;
                return "OnProductCollected(productName=" + str + ", quantity=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LUj/f$d$h;", "LUj/f$d;", "", "itemNo", "", "isManualEntry", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h extends d {

            /* renamed from: a  reason: collision with root package name */
            private final String f88051a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f88052b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public h(String str, boolean z10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "itemNo");
                this.f88051a = str;
                this.f88052b = z10;
            }

            public final String a() {
                return this.f88051a;
            }

            public final boolean b() {
                return this.f88052b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return C17542s.e(this.f88051a, hVar.f88051a) && this.f88052b == hVar.f88052b;
            }

            public int hashCode() {
                return (this.f88051a.hashCode() * 31) + Boolean.hashCode(this.f88052b);
            }

            public String toString() {
                String str = this.f88051a;
                boolean z10 = this.f88052b;
                return "OnProductNotFound(itemNo=" + str + ", isManualEntry=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/f$d$i;", "LUj/f$d;", "", "hasPermission", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i extends d {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f88053a;

            public i(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f88053a = z10;
            }

            public final boolean a() {
                return this.f88053a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f88053a == ((i) obj).f88053a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f88053a);
            }

            public String toString() {
                boolean z10 = this.f88053a;
                return "OnRequestPermissionResult(hasPermission=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LUj/f$d$j;", "LUj/f$d;", "", "format", "", "rawValue", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class j extends d {

            /* renamed from: a  reason: collision with root package name */
            private final int f88054a;

            /* renamed from: b  reason: collision with root package name */
            private final String f88055b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public j(int i10, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "rawValue");
                this.f88054a = i10;
                this.f88055b = str;
            }

            public final int a() {
                return this.f88054a;
            }

            public final String b() {
                return this.f88055b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f88054a == jVar.f88054a && C17542s.e(this.f88055b, jVar.f88055b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f88054a) * 31) + this.f88055b.hashCode();
            }

            public String toString() {
                int i10 = this.f88054a;
                String str = this.f88055b;
                return "OnScanned(format=" + i10 + ", rawValue=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/f$d$k;", "LUj/f$d;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class k extends d {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f88056a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public k(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                this.f88056a = th2;
            }

            public final Throwable a() {
                return this.f88056a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && C17542s.e(this.f88056a, ((k) obj).f88056a);
            }

            public int hashCode() {
                return this.f88056a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f88056a;
                return "OnScannerDetectorException(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$l;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class l extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final l f88057a = new l();

            private l() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -1422510059;
            }

            public String toString() {
                return "OnShowHelpDialogClicked";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/f$d$m;", "LUj/f$d;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class m extends d {

            /* renamed from: a  reason: collision with root package name */
            private final Interaction$Component f88058a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public m(Interaction$Component interaction$Component) {
                super((DefaultConstructorMarker) null);
                C17542s.j(interaction$Component, "component");
                this.f88058a = interaction$Component;
            }

            public final Interaction$Component a() {
                return this.f88058a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.f88058a == ((m) obj).f88058a;
            }

            public int hashCode() {
                return this.f88058a.hashCode();
            }

            public String toString() {
                Interaction$Component interaction$Component = this.f88058a;
                return "OnShowManualEntryPrompt(component=" + interaction$Component + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LUj/f$d$n;", "LUj/f$d;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class n extends d {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f88059a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public n(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                this.f88059a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && C17542s.e(this.f88059a, ((n) obj).f88059a);
            }

            public int hashCode() {
                return this.f88059a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f88059a;
                return "OnShowMissScanSnackBar(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/f$d$o;", "LUj/f$d;", "", "on", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class o extends d {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f88060a;

            public o(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f88060a = z10;
            }

            public final boolean a() {
                return this.f88060a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && this.f88060a == ((o) obj).f88060a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f88060a);
            }

            public String toString() {
                boolean z10 = this.f88060a;
                return "OnToggleCamera(on=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$d$p;", "LUj/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class p extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final p f88061a = new p();

            private p() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public int hashCode() {
                return 1486763401;
            }

            public String toString() {
                return "OnUiErrorShown";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUj/f$e;", "", "<init>", "()V", "a", "b", "LUj/f$e$a;", "LUj/f$e$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$e$a;", "LUj/f$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends e {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88062a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -479194903;
            }

            public String toString() {
                return "NONE";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0010\n\u0011\u0012\f\u0013\u0005\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\u0001\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"LUj/f$e$b;", "LUj/f$e;", "<init>", "()V", "", "a", "I", "()I", "icon", "Lhl/a;", "b", "Lhl/a;", "c", "()Lhl/a;", "title", "message", "f", "h", "d", "e", "g", "LUj/f$e$b$a;", "LUj/f$e$b$b;", "LUj/f$e$b$c;", "LUj/f$e$b$d;", "LUj/f$e$b$e;", "LUj/f$e$b$f;", "LUj/f$e$b$g;", "LUj/f$e$b$h;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class b extends e {

            /* renamed from: a  reason: collision with root package name */
            private final int f88063a;

            /* renamed from: b  reason: collision with root package name */
            private final C11367a f88064b;

            /* renamed from: c  reason: collision with root package name */
            private final C11367a f88065c;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$e$b$a;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final a f88066d = new a();

                private a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return 733389118;
                }

                public String toString() {
                    return "ConsecutiveScanError";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$e$b$b;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Uj.f$e$b$b  reason: collision with other inner class name */
            public static final class C1842b extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final C1842b f88067d = new C1842b();

                private C1842b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1842b);
                }

                public int hashCode() {
                    return -113372242;
                }

                public String toString() {
                    return "GenericError";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/f$e$b$c;", "LUj/f$e$b;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c extends b {

                /* renamed from: d  reason: collision with root package name */
                private final String f88068d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "itemNo");
                    this.f88068d = str;
                }

                public final String d() {
                    return this.f88068d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && C17542s.e(this.f88068d, ((c) obj).f88068d);
                }

                public int hashCode() {
                    return this.f88068d.hashCode();
                }

                public String toString() {
                    String str = this.f88068d;
                    return "ManualEntryNotFound(itemNo=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LUj/f$e$b$d;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "I", "a", "icon", "Lhl/a;", "f", "Lhl/a;", "c", "()Lhl/a;", "title", "g", "b", "message", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final d f88069d = new d();

                /* renamed from: e  reason: collision with root package name */
                private static final int f88070e = C18146a.f148220R5;

                /* renamed from: f  reason: collision with root package name */
                private static final C11367a f88071f;

                /* renamed from: g  reason: collision with root package name */
                private static final C11367a f88072g;

                /* renamed from: h  reason: collision with root package name */
                public static final int f88073h = 8;

                static {
                    C11367a.C2200a aVar = C11367a.f98081a;
                    f88071f = aVar.a(Ez.f.f109727u);
                    f88072g = aVar.a(Ez.f.f109725t);
                }

                private d() {
                    super((DefaultConstructorMarker) null);
                }

                public int a() {
                    return f88070e;
                }

                public C11367a b() {
                    return f88072g;
                }

                public C11367a c() {
                    return f88071f;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1362228349;
                }

                public String toString() {
                    return "ProductAlreadyCollected";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$e$b$e;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Uj.f$e$b$e  reason: collision with other inner class name */
            public static final class C1843e extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final C1843e f88074d = new C1843e();

                private C1843e() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1843e);
                }

                public int hashCode() {
                    return 228624417;
                }

                public String toString() {
                    return "ProductNotFound";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/f$e$b$f;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Uj.f$e$b$f  reason: collision with other inner class name */
            public static final class C1844f extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final C1844f f88075d = new C1844f();

                private C1844f() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1844f);
                }

                public int hashCode() {
                    return -1419115226;
                }

                public String toString() {
                    return "ProductNotInCart";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LUj/f$e$b$g;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "I", "a", "icon", "Lhl/a;", "f", "Lhl/a;", "c", "()Lhl/a;", "title", "g", "b", "message", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class g extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final g f88076d = new g();

                /* renamed from: e  reason: collision with root package name */
                private static final int f88077e = C18146a.f148220R5;

                /* renamed from: f  reason: collision with root package name */
                private static final C11367a f88078f;

                /* renamed from: g  reason: collision with root package name */
                private static final C11367a f88079g;

                /* renamed from: h  reason: collision with root package name */
                public static final int f88080h = 8;

                static {
                    C11367a.C2200a aVar = C11367a.f98081a;
                    f88078f = aVar.a(Ez.f.f109737z);
                    f88079g = aVar.a(Ez.f.f109735y);
                }

                private g() {
                    super((DefaultConstructorMarker) null);
                }

                public int a() {
                    return f88077e;
                }

                public C11367a b() {
                    return f88079g;
                }

                public C11367a c() {
                    return f88078f;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public int hashCode() {
                    return 931482598;
                }

                public String toString() {
                    return "WrongBarcodeTypeScanned";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LUj/f$e$b$h;", "LUj/f$e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "I", "a", "icon", "Lhl/a;", "f", "Lhl/a;", "c", "()Lhl/a;", "title", "g", "b", "message", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class h extends b {

                /* renamed from: d  reason: collision with root package name */
                public static final h f88081d = new h();

                /* renamed from: e  reason: collision with root package name */
                private static final int f88082e = C18146a.f148610qa;

                /* renamed from: f  reason: collision with root package name */
                private static final C11367a f88083f;

                /* renamed from: g  reason: collision with root package name */
                private static final C11367a f88084g;

                /* renamed from: h  reason: collision with root package name */
                public static final int f88085h = 8;

                static {
                    C11367a.C2200a aVar = C11367a.f98081a;
                    f88083f = aVar.a(Ez.f.f109733x);
                    f88084g = aVar.a(Ez.f.f109731w);
                }

                private h() {
                    super((DefaultConstructorMarker) null);
                }

                public int a() {
                    return f88082e;
                }

                public C11367a b() {
                    return f88084g;
                }

                public C11367a c() {
                    return f88083f;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof h);
                }

                public int hashCode() {
                    return -419442383;
                }

                public String toString() {
                    return "WrongProductScanned";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public int a() {
                return this.f88063a;
            }

            public C11367a b() {
                return this.f88065c;
            }

            public C11367a c() {
                return this.f88064b;
            }

            private b() {
                super((DefaultConstructorMarker) null);
                this.f88063a = C18146a.f148718xd;
                this.f88065c = C11367a.f98081a.a(Oo.b.f84843y3);
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\"\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b*\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, d2 = {"LUj/f$f;", "", "Lrz/g;", "productInCart", "", "storeName", "LUj/f$e;", "error", "", "cameraShouldBeOn", "showMissScanSnackBar", "showManualEntryPrompt", "LUj/f$c;", "permissionAction", "LUj/f$b;", "navigateTo", "<init>", "(Lrz/g;Ljava/lang/String;LUj/f$e;ZZZLUj/f$c;LUj/f$b;)V", "a", "(Lrz/g;Ljava/lang/String;LUj/f$e;ZZZLUj/f$c;LUj/f$b;)LUj/f$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrz/g;", "g", "()Lrz/g;", "b", "Ljava/lang/String;", "j", "c", "LUj/f$e;", "d", "()LUj/f$e;", "Z", "()Z", "e", "i", "f", "h", "LUj/f$c;", "()LUj/f$c;", "LUj/f$b;", "()LUj/f$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.f$f  reason: collision with other inner class name */
    public static final class C1845f {

        /* renamed from: a  reason: collision with root package name */
        private final C15014g f88086a;

        /* renamed from: b  reason: collision with root package name */
        private final String f88087b;

        /* renamed from: c  reason: collision with root package name */
        private final e f88088c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f88089d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f88090e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f88091f;

        /* renamed from: g  reason: collision with root package name */
        private final c f88092g;

        /* renamed from: h  reason: collision with root package name */
        private final b f88093h;

        public C1845f() {
            this((C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ C1845f b(C1845f fVar, C15014g gVar, String str, e eVar, boolean z10, boolean z11, boolean z12, c cVar, b bVar, int i10, Object obj) {
            C1845f fVar2 = fVar;
            int i11 = i10;
            return fVar.a((i11 & 1) != 0 ? fVar2.f88086a : gVar, (i11 & 2) != 0 ? fVar2.f88087b : str, (i11 & 4) != 0 ? fVar2.f88088c : eVar, (i11 & 8) != 0 ? fVar2.f88089d : z10, (i11 & 16) != 0 ? fVar2.f88090e : z11, (i11 & 32) != 0 ? fVar2.f88091f : z12, (i11 & 64) != 0 ? fVar2.f88092g : cVar, (i11 & 128) != 0 ? fVar2.f88093h : bVar);
        }

        public final C1845f a(C15014g gVar, String str, e eVar, boolean z10, boolean z11, boolean z12, c cVar, b bVar) {
            C17542s.j(eVar, UiComponentContainer.RESULT_ERROR);
            return new C1845f(gVar, str, eVar, z10, z11, z12, cVar, bVar);
        }

        public final boolean c() {
            return this.f88089d;
        }

        public final e d() {
            return this.f88088c;
        }

        public final b e() {
            return this.f88093h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1845f)) {
                return false;
            }
            C1845f fVar = (C1845f) obj;
            return C17542s.e(this.f88086a, fVar.f88086a) && C17542s.e(this.f88087b, fVar.f88087b) && C17542s.e(this.f88088c, fVar.f88088c) && this.f88089d == fVar.f88089d && this.f88090e == fVar.f88090e && this.f88091f == fVar.f88091f && C17542s.e(this.f88092g, fVar.f88092g) && C17542s.e(this.f88093h, fVar.f88093h);
        }

        public final c f() {
            return this.f88092g;
        }

        public final C15014g g() {
            return this.f88086a;
        }

        public final boolean h() {
            return this.f88091f;
        }

        public int hashCode() {
            C15014g gVar = this.f88086a;
            int i10 = 0;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            String str = this.f88087b;
            int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88088c.hashCode()) * 31) + Boolean.hashCode(this.f88089d)) * 31) + Boolean.hashCode(this.f88090e)) * 31) + Boolean.hashCode(this.f88091f)) * 31;
            c cVar = this.f88092g;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.f88093h;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return hashCode3 + i10;
        }

        public final boolean i() {
            return this.f88090e;
        }

        public final String j() {
            return this.f88087b;
        }

        public String toString() {
            C15014g gVar = this.f88086a;
            String str = this.f88087b;
            e eVar = this.f88088c;
            boolean z10 = this.f88089d;
            boolean z11 = this.f88090e;
            boolean z12 = this.f88091f;
            c cVar = this.f88092g;
            b bVar = this.f88093h;
            return "UiState(productInCart=" + gVar + ", storeName=" + str + ", error=" + eVar + ", cameraShouldBeOn=" + z10 + ", showMissScanSnackBar=" + z11 + ", showManualEntryPrompt=" + z12 + ", permissionAction=" + cVar + ", navigateTo=" + bVar + ")";
        }

        public C1845f(C15014g gVar, String str, e eVar, boolean z10, boolean z11, boolean z12, c cVar, b bVar) {
            C17542s.j(eVar, UiComponentContainer.RESULT_ERROR);
            this.f88086a = gVar;
            this.f88087b = str;
            this.f88088c = eVar;
            this.f88089d = z10;
            this.f88090e = z11;
            this.f88091f = z12;
            this.f88092g = cVar;
            this.f88093h = bVar;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C1845f(rz.C15014g r10, java.lang.String r11, Uj.f.e r12, boolean r13, boolean r14, boolean r15, Uj.f.c r16, Uj.f.b r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r10
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r11
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                Uj.f$e$a r4 = Uj.f.e.a.f88062a
                goto L_0x0019
            L_0x0018:
                r4 = r12
            L_0x0019:
                r5 = r0 & 8
                r6 = 0
                if (r5 == 0) goto L_0x0020
                r5 = r6
                goto L_0x0021
            L_0x0020:
                r5 = r13
            L_0x0021:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0027
                r7 = r6
                goto L_0x0028
            L_0x0027:
                r7 = r14
            L_0x0028:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r6 = r15
            L_0x002e:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0034
                r8 = r2
                goto L_0x0036
            L_0x0034:
                r8 = r16
            L_0x0036:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r2 = r17
            L_0x003d:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r7
                r16 = r6
                r17 = r8
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.f.C1845f.<init>(rz.g, java.lang.String, Uj.f$e, boolean, boolean, boolean, Uj.f$c, Uj.f$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CollectProductScannerViewModel$handleConsecutiveScanFailure$1", f = "CollectProductScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88094c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.c f88095d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f88096e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d.c cVar, f fVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f88095d = cVar;
            this.f88096e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f88095d, this.f88096e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            C17187b.f();
            if (this.f88094c == 0) {
                y.b(obj);
                d.c cVar = this.f88095d;
                if (C17542s.e(cVar, d.c.a.f88044a)) {
                    this.f88096e.f88025p.e(Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_PROMPT);
                    C16505B D10 = this.f88096e.f88028s;
                    do {
                        value = D10.getValue();
                    } while (!D10.e(value, C1845f.b((C1845f) value, (C15014g) null, (String) null, (e) null, false, false, true, (c) null, (b) null, 215, (Object) null)));
                    C16505B C10 = this.f88096e.f88030u;
                    do {
                        value2 = C10.getValue();
                        Throwable th2 = (Throwable) value2;
                    } while (!C10.e(value2, null));
                } else if (C17542s.e(cVar, d.c.b.f88045a)) {
                    this.f88096e.f88025p.p();
                } else {
                    throw new XH.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CollectProductScannerViewModel$handleShowManualEntryPrompt$1", f = "CollectProductScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88097c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f88098d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Interaction$Component f88099e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, Interaction$Component interaction$Component, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f88098d = fVar;
            this.f88099e = interaction$Component;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f88098d, this.f88099e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f88097c == 0) {
                y.b(obj);
                this.f88098d.f88025p.e(this.f88099e);
                C16505B D10 = this.f88098d.f88028s;
                do {
                    value = D10.getValue();
                } while (!D10.e(value, C1845f.b((C1845f) value, (C15014g) null, (String) null, (e) null, false, false, true, (c) null, (b) null, 215, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUj/f$f;", "uiState", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "settings", "<anonymous>", "(LUj/f$f;Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;)LUj/f$f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CollectProductScannerViewModel$state$1", f = "CollectProductScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class i extends l implements q<C1845f, ScanAndGoSettings, C17164e<? super C1845f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88100c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f88101d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f88102e;

        i(C17164e<? super i> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C1845f fVar, ScanAndGoSettings scanAndGoSettings, C17164e<? super C1845f> eVar) {
            i iVar = new i(eVar);
            iVar.f88101d = fVar;
            iVar.f88102e = scanAndGoSettings;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C17187b.f();
            if (this.f88100c == 0) {
                y.b(obj);
                C1845f fVar = (C1845f) this.f88101d;
                ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) this.f88102e;
                if (scanAndGoSettings == null || (str = scanAndGoSettings.n()) == null) {
                    str = "";
                }
                return C1845f.b(fVar, (C15014g) null, str, (e) null, false, false, false, (c) null, (b) null, 253, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CollectProductScannerViewModel$validateProduct$1", f = "CollectProductScannerViewModel.kt", l = {181}, m = "invokeSuspend")
    static final class j extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88103c;

        /* renamed from: d  reason: collision with root package name */
        Object f88104d;

        /* renamed from: e  reason: collision with root package name */
        Object f88105e;

        /* renamed from: f  reason: collision with root package name */
        int f88106f;

        /* renamed from: g  reason: collision with root package name */
        int f88107g;

        /* renamed from: h  reason: collision with root package name */
        int f88108h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f88109i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f88110j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ gj.j f88111k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar, gj.j jVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f88110j = fVar;
            this.f88111k = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f88110j, this.f88111k, eVar);
            jVar.f88109i = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            e eVar;
            Object value;
            Object value2;
            Object value3;
            C1845f b10;
            Object value4;
            Object f10 = C17187b.f();
            int i10 = this.f88108h;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f88109i;
                this.f88110j.f88025p.c(this.f88111k.h(), this.f88111k.d());
                this.f88110j.f88023n.a(C11854e.a.f102378a.b());
                C16505B D10 = this.f88110j.f88028s;
                do {
                    value3 = D10.getValue();
                    b10 = C1845f.b((C1845f) value3, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 247, (Object) null);
                } while (!D10.e(value3, b10));
                C15014g g10 = ((C1845f) this.f88110j.f88028s.getValue()).g();
                if (g10 == null) {
                    C16505B D11 = this.f88110j.f88028s;
                    do {
                        value4 = D11.getValue();
                    } while (!D11.e(value4, C1845f.b((C1845f) value4, (C15014g) null, (String) null, e.b.C1842b.f88067d, false, false, false, (c) null, (b) null, 251, (Object) null)));
                    return C16807N.f139792a;
                }
                H j10 = this.f88110j.f88026q;
                gj.j jVar = this.f88111k;
                this.f88109i = q11;
                this.f88103c = g10;
                this.f88104d = value3;
                this.f88105e = b10;
                this.f88106f = 0;
                this.f88107g = 0;
                this.f88108h = 1;
                Object a10 = j10.a(jVar, g10, this);
                if (a10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = a10;
            } else if (i10 == 1) {
                C1845f fVar = (C1845f) this.f88105e;
                C15014g gVar = (C15014g) this.f88103c;
                q10 = (Q) this.f88109i;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar2 = this.f88110j;
            gj.j jVar2 = this.f88111k;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                gj.j jVar3 = (gj.j) obj2;
                C16505B D12 = fVar2.f88028s;
                do {
                    value2 = D12.getValue();
                } while (!D12.e(value2, C1845f.b((C1845f) value2, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, new b.c(jVar3), 127, (Object) null)));
            } else {
                if (e10 instanceof H.a) {
                    H.a aVar = (H.a) e10;
                    if (C17542s.e(aVar, H.a.C1815a.f87435a)) {
                        eVar = e.b.d.f88069d;
                    } else if (C17542s.e(aVar, H.a.b.f87436a) || C17542s.e(aVar, H.a.d.f87438a)) {
                        fVar2.f88025p.z(jVar2.h(), jVar2.d());
                        eVar = e.b.h.f88081d;
                    } else if (C17542s.e(aVar, H.a.c.f87437a)) {
                        eVar = e.b.g.f88076d;
                    } else {
                        throw new XH.t();
                    }
                } else {
                    qv.e eVar2 = qv.e.ERROR;
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
                            String a11 = C11818a.a((String) null, e10);
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
                        bVar.a(eVar2, str4, false, e10, str3);
                        str = str3;
                        str2 = str4;
                    }
                    eVar = e.a.f88062a;
                }
                C16505B D13 = fVar2.f88028s;
                do {
                    value = D13.getValue();
                } while (!D13.e(value, C1845f.b((C1845f) value, (C15014g) null, (String) null, eVar, eVar instanceof e.a, false, false, (c) null, (b) null, 243, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    public f(t tVar, C11854e eVar, r rVar, Sy.a aVar, H h10, k kVar, Ry.a aVar2, U u10) {
        t tVar2 = tVar;
        C11854e eVar2 = eVar;
        r rVar2 = rVar;
        Sy.a aVar3 = aVar;
        H h11 = h10;
        k kVar2 = kVar;
        U u11 = u10;
        C17542s.j(tVar2, "loadProductFromCartUseCase");
        C17542s.j(eVar2, "vibrationFeedback");
        C17542s.j(rVar2, "handleScanFailureUseCase");
        C17542s.j(aVar3, "scanAndGoAnalytics");
        C17542s.j(h11, "validateProductForCollectUseCase");
        C17542s.j(kVar2, "scannerProductResultMapper");
        C17542s.j(aVar2, "settingsRepo");
        C17542s.j(u11, "savedStateHandle");
        this.f88022m = tVar2;
        this.f88023n = eVar2;
        this.f88024o = rVar2;
        this.f88025p = aVar3;
        this.f88026q = h11;
        this.f88027r = kVar2;
        C16505B<C1845f> a10 = C16521S.a(new C1845f((C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 255, (DefaultConstructorMarker) null));
        this.f88028s = a10;
        this.f88029t = C16534i.c0(C16534i.n(a10, aVar2.b(), new i((C17164e<? super i>) null)), g0.a(this), ip.f.a(), new C1845f((C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 255, (DefaultConstructorMarker) null));
        C16505B<Throwable> a11 = C16521S.a(null);
        this.f88030u = a11;
        this.f88031v = a11;
        Object f10 = u11.f("barcode");
        if (f10 != null) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (String) f10, (C17164e<? super a>) null), 3, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void E() {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 183, (Object) null)));
    }

    private final void F() {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 223, (Object) null)));
    }

    private final F0 H(d.c cVar) {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(cVar, this, (C17164e<? super g>) null), 3, (Object) null);
    }

    private final void I() {
        Throwable value;
        C1845f value2;
        C16505B<Throwable> b10 = this.f88030u;
        do {
            value = b10.getValue();
            Throwable th2 = value;
        } while (!b10.e(value, null));
        C16505B<C1845f> b11 = this.f88028s;
        do {
            value2 = b11.getValue();
        } while (!b11.e(value2, C1845f.b(value2, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 239, (Object) null)));
    }

    private final void J() {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, (b) null, 127, (Object) null)));
    }

    private final void K(String str, int i10) {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, new b.C1839b(str, i10), 127, (Object) null)));
    }

    private final void L() {
        C1845f value;
        this.f88023n.a(C11854e.a.f102378a.b());
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, true, false, (c) null, (b) null, 231, (Object) null)));
    }

    private final void M(d.h hVar) {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, hVar.b() ? new e.b.c(hVar.a()) : e.b.C1843e.f88074d, false, false, false, (c) null, (b) null, 251, (Object) null)));
    }

    private final void N(Throwable th2) {
        Throwable value;
        C1845f value2;
        C1845f value3;
        C1845f value4;
        Object a10 = this.f88024o.a(th2);
        Throwable e10 = x.e(a10);
        if (e10 == null) {
            r.b bVar = (r.b) a10;
            if (C17542s.e(bVar, r.b.d.f87679a)) {
                L();
            } else if (C17542s.e(bVar, r.b.a.f87676a)) {
                C16505B<C1845f> b10 = this.f88028s;
                do {
                    value4 = b10.getValue();
                } while (!b10.e(value4, C1845f.b(value4, (C15014g) null, (String) null, e.b.a.f88066d, false, false, false, (c) null, (b) null, 227, (Object) null)));
            } else if (bVar instanceof r.b.C1828b) {
                C16505B<C1845f> b11 = this.f88028s;
                do {
                    value3 = b11.getValue();
                } while (!b11.e(value3, C1845f.b(value3, (C15014g) null, (String) null, (e) null, false, false, false, new c.a(((r.b.C1828b) bVar).a()), (b) null, 191, (Object) null)));
            } else if (bVar instanceof r.b.c) {
                C16505B<C1845f> b12 = this.f88028s;
                do {
                    value2 = b12.getValue();
                } while (!b12.e(value2, C1845f.b(value2, (C15014g) null, (String) null, (e) null, false, false, false, new c.b(((r.b.c) bVar).a()), (b) null, 191, (Object) null)));
            } else {
                throw new XH.t();
            }
        } else if (e10 instanceof r.a) {
            C16505B<Throwable> b13 = this.f88030u;
            do {
                value = b13.getValue();
                Throwable th3 = value;
            } while (!b13.e(value, th2));
        } else {
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
                    String a11 = C11818a.a((String) null, e10);
                    if (a11 != null) {
                        str = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    private final void O() {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, false, false, false, (c) null, b.a.f88036a, 119, (Object) null)));
    }

    private final F0 P(Interaction$Component interaction$Component) {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, interaction$Component, (C17164e<? super h>) null), 3, (Object) null);
    }

    private final void Q(boolean z10) {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, z10, false, false, (c) null, (b) null, 247, (Object) null)));
    }

    private final void R() {
        C1845f value;
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, e.a.f88062a, false, false, false, (c) null, (b) null, 251, (Object) null)));
    }

    private final void T(String str) {
        F();
        W(new j.b(str, (String) null, (O) null, 6, (DefaultConstructorMarker) null));
    }

    private final void U(boolean z10) {
        C1845f value;
        if (!z10) {
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
                    String a10 = C11818a.a("Camera permission missing", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = f.class.getName();
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
        }
        C16505B<C1845f> b10 = this.f88028s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C1845f.b(value, (C15014g) null, (String) null, (e) null, z10, false, false, (c) null, (b) null, 247, (Object) null)));
    }

    private final Object V(d.j jVar) {
        k.a a10 = this.f88027r.a(jVar.a(), jVar.b());
        if (a10 instanceof k.a.C2185a) {
            N(new C10720a(jVar.b(), ((k.a.C2185a) a10).a()));
            return C16807N.f139792a;
        } else if (a10 instanceof k.a.c) {
            return W(((k.a.c) a10).a());
        } else {
            if (C17542s.e(a10, k.a.b.f97613a)) {
                return C16807N.f139792a;
            }
            throw new XH.t();
        }
    }

    private final F0 W(gj.j jVar) {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new j(this, jVar, (C17164e<? super j>) null), 3, (Object) null);
    }

    public final C16519P<Throwable> G() {
        return this.f88031v;
    }

    public final void S(d dVar) {
        C17542s.j(dVar, "action");
        if (dVar instanceof d.j) {
            V((d.j) dVar);
        } else if (dVar instanceof d.o) {
            Q(((d.o) dVar).a());
        } else if (dVar instanceof d.h) {
            M((d.h) dVar);
        } else if (C17542s.e(dVar, d.p.f88061a)) {
            R();
        } else if (dVar instanceof d.k) {
            N(((d.k) dVar).a());
        } else if (dVar instanceof d.n) {
            L();
        } else if (C17542s.e(dVar, d.e.f88047a)) {
            I();
        } else if (dVar instanceof d.c) {
            H((d.c) dVar);
        } else if (dVar instanceof d.m) {
            P(((d.m) dVar).a());
        } else if (dVar instanceof d.C1840d) {
            T(((d.C1840d) dVar).a());
        } else if (dVar instanceof d.g) {
            d.g gVar = (d.g) dVar;
            K(gVar.a(), gVar.b());
        } else if (C17542s.e(dVar, d.b.f88043a)) {
            F();
        } else if (dVar instanceof d.i) {
            U(((d.i) dVar).a());
        } else if (C17542s.e(dVar, d.a.f88042a)) {
            E();
        } else if (C17542s.e(dVar, d.C1841f.f88048a)) {
            J();
        } else if (C17542s.e(dVar, d.l.f88057a)) {
            O();
        } else {
            throw new XH.t();
        }
    }

    public final C16519P<C1845f> getState() {
        return this.f88029t;
    }
}
