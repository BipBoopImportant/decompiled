package Ei;

import Ai.I1;
import Hx.c;
import IC.C13023e;
import KJ.C15987c;
import QJ.Q;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import eI.C17187b;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003#$%B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"LEi/J;", "Landroidx/lifecycle/f0;", "LAi/I1;", "Landroidx/lifecycle/U;", "savedStateHandle", "LGx/a;", "purchaseHistoryRepository", "<init>", "(Landroidx/lifecycle/U;LGx/a;)V", "LXH/N;", "C", "()V", "x", "m", "LGx/a;", "getPurchaseHistoryRepository", "()LGx/a;", "", "n", "Ljava/lang/String;", "orderId", "LTJ/B;", "LEi/J$a;", "o", "LTJ/B;", "error", "LTJ/P;", "LEi/J$c;", "p", "LTJ/P;", "_invoicesState", "q", "w", "()LTJ/P;", "invoicesState", "c", "b", "a", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.J  reason: case insensitive filesystem */
public final class C10675J extends f0 implements I1 {

    /* renamed from: m  reason: collision with root package name */
    private final Gx.a f80405m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final String f80406n;

    /* renamed from: o  reason: collision with root package name */
    private final C16505B<a> f80407o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<c> f80408p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<c> f80409q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"LEi/J$a;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ABLE_TO_DECODE_INVOICE", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.J$a */
    public enum a {
        NOT_ABLE_TO_DECODE_INVOICE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LEi/J$b;", "", "LHx/c$d$d;", "invoice", "", "fileName", "<init>", "(LHx/c$d$d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/c$d$d;", "b", "()LHx/c$d$d;", "Ljava/lang/String;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.J$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c.d.C2666d f80410a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80411b;

        public b(c.d.C2666d dVar, String str) {
            C17542s.j(dVar, "invoice");
            C17542s.j(str, "fileName");
            this.f80410a = dVar;
            this.f80411b = str;
        }

        public final String a() {
            return this.f80411b;
        }

        public final c.d.C2666d b() {
            return this.f80410a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f80410a, bVar.f80410a) && C17542s.e(this.f80411b, bVar.f80411b);
        }

        public int hashCode() {
            return (this.f80410a.hashCode() * 31) + this.f80411b.hashCode();
        }

        public String toString() {
            c.d.C2666d dVar = this.f80410a;
            String str = this.f80411b;
            return "InvoiceEntry(invoice=" + dVar + ", fileName=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEi/J$c;", "", "<init>", "()V", "b", "a", "LEi/J$c$a;", "LEi/J$c$b;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.J$c */
    public static abstract class c {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LEi/J$c$a;", "LEi/J$c;", "LKJ/c;", "LEi/J$b;", "invoices", "LIC/e;", "error", "<init>", "(LKJ/c;LIC/e;)V", "a", "(LKJ/c;LIC/e;)LEi/J$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "d", "()LKJ/c;", "b", "LIC/e;", "c", "()LIC/e;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.J$c$a */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final C15987c<b> f80412a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f80413b;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(C15987c cVar, C13023e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(cVar, (i10 & 2) != 0 ? null : eVar);
            }

            public static /* synthetic */ a b(a aVar, C15987c<b> cVar, C13023e eVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = aVar.f80412a;
                }
                if ((i10 & 2) != 0) {
                    eVar = aVar.f80413b;
                }
                return aVar.a(cVar, eVar);
            }

            public final a a(C15987c<b> cVar, C13023e eVar) {
                C17542s.j(cVar, "invoices");
                return new a(cVar, eVar);
            }

            public final C13023e c() {
                return this.f80413b;
            }

            public final C15987c<b> d() {
                return this.f80412a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f80412a, aVar.f80412a) && C17542s.e(this.f80413b, aVar.f80413b);
            }

            public int hashCode() {
                int hashCode = this.f80412a.hashCode() * 31;
                C13023e eVar = this.f80413b;
                return hashCode + (eVar == null ? 0 : eVar.hashCode());
            }

            public String toString() {
                C15987c<b> cVar = this.f80412a;
                C13023e eVar = this.f80413b;
                return "Content(invoices=" + cVar + ", error=" + eVar + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C15987c<b> cVar, C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "invoices");
                this.f80412a = cVar;
                this.f80413b = eVar;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/J$c$b;", "LEi/J$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.J$c$b */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f80414a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2011479782;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LEi/J$c;", "invoiceState", "LEi/J$a;", "error", "<anonymous>", "(LEi/J$c;LEi/J$a;)LEi/J$c;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ShowInvoicesViewModelImpl$invoicesState$1", f = "ShowInvoicesViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.J$d */
    static final class d extends l implements q<c, a, C17164e<? super c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80415c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80416d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80417e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.J$d$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f80418a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.NOT_ABLE_TO_DECODE_INVOICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f80418a = iArr;
            }
        }

        d(C17164e<? super d> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(c cVar, a aVar, C17164e<? super c> eVar) {
            d dVar = new d(eVar);
            dVar.f80416d = cVar;
            dVar.f80417e = aVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C13023e.d dVar;
            C17187b.f();
            if (this.f80415c == 0) {
                y.b(obj);
                c cVar = (c) this.f80416d;
                a aVar = (a) this.f80417e;
                if (cVar instanceof c.b) {
                    return cVar;
                }
                if (cVar instanceof c.a) {
                    c.a aVar2 = (c.a) cVar;
                    int i10 = aVar == null ? -1 : a.f80418a[aVar.ordinal()];
                    if (i10 == -1) {
                        dVar = null;
                    } else if (i10 == 1) {
                        dVar = new C13023e.d(Oo.b.f84843y3, (List) null, 2, (DefaultConstructorMarker) null);
                    } else {
                        throw new t();
                    }
                    return c.a.b(aVar2, (C15987c) null, dVar, 1, (Object) null);
                }
                throw new t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.J$e */
    public static final class e implements C16532g<c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80419a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10675J f80420b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.J$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80421a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10675J f80422b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ShowInvoicesViewModelImpl$special$$inlined$map$1$2", f = "ShowInvoicesViewModelImpl.kt", l = {50}, m = "emit")
            /* renamed from: Ei.J$e$a$a  reason: collision with other inner class name */
            public static final class C1519a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80423c;

                /* renamed from: d  reason: collision with root package name */
                int f80424d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f80425e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1519a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80425e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80423c = obj;
                    this.f80424d |= Integer.MIN_VALUE;
                    return this.f80425e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C10675J j10) {
                this.f80421a = hVar;
                this.f80422b = j10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof Ei.C10675J.e.a.C1519a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    Ei.J$e$a$a r0 = (Ei.C10675J.e.a.C1519a) r0
                    int r1 = r0.f80424d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f80424d = r1
                    goto L_0x0018
                L_0x0013:
                    Ei.J$e$a$a r0 = new Ei.J$e$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f80423c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f80424d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r12)
                    goto L_0x00d6
                L_0x002a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0032:
                    XH.y.b(r12)
                    TJ.h r12 = r10.f80421a
                    Hx.c r11 = (Hx.c) r11
                    r2 = 0
                    if (r11 == 0) goto L_0x0041
                    java.util.List r11 = r11.c()
                    goto L_0x0042
                L_0x0041:
                    r11 = r2
                L_0x0042:
                    if (r11 == 0) goto L_0x0068
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r11 = r11.iterator()
                L_0x004f:
                    boolean r5 = r11.hasNext()
                    if (r5 == 0) goto L_0x0061
                    java.lang.Object r5 = r11.next()
                    boolean r6 = r5 instanceof Hx.c.d.f
                    if (r6 == 0) goto L_0x004f
                    r4.add(r5)
                    goto L_0x004f
                L_0x0061:
                    java.lang.Object r11 = YH.C16877v.y0(r4)
                    Hx.c$d$f r11 = (Hx.c.d.f) r11
                    goto L_0x0069
                L_0x0068:
                    r11 = r2
                L_0x0069:
                    if (r11 == 0) goto L_0x0071
                    java.util.List r11 = r11.b()
                    if (r11 != 0) goto L_0x0075
                L_0x0071:
                    java.util.List r11 = YH.C16877v.n()
                L_0x0075:
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r11, r5)
                    r4.<init>(r5)
                    java.util.Iterator r11 = r11.iterator()
                    r5 = 0
                L_0x0087:
                    boolean r6 = r11.hasNext()
                    if (r6 == 0) goto L_0x00c3
                    java.lang.Object r6 = r11.next()
                    int r7 = r5 + 1
                    if (r5 >= 0) goto L_0x0098
                    YH.C16877v.x()
                L_0x0098:
                    Hx.c$d$d r6 = (Hx.c.d.C2666d) r6
                    Ei.J$b r5 = new Ei.J$b
                    Ei.J r8 = r10.f80422b
                    java.lang.String r8 = r8.f80406n
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    r9.append(r8)
                    java.lang.String r8 = "_"
                    r9.append(r8)
                    r9.append(r7)
                    java.lang.String r8 = ".pdf"
                    r9.append(r8)
                    java.lang.String r8 = r9.toString()
                    r5.<init>(r6, r8)
                    r4.add(r5)
                    r5 = r7
                    goto L_0x0087
                L_0x00c3:
                    KJ.c r11 = KJ.C15985a.h(r4)
                    Ei.J$c$a r4 = new Ei.J$c$a
                    r5 = 2
                    r4.<init>(r11, r2, r5, r2)
                    r0.f80424d = r3
                    java.lang.Object r11 = r12.emit(r4, r0)
                    if (r11 != r1) goto L_0x00d6
                    return r1
                L_0x00d6:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: Ei.C10675J.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, C10675J j10) {
            this.f80419a = gVar;
            this.f80420b = j10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80419a.collect(new a(hVar, this.f80420b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C10675J(U u10, Gx.a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "purchaseHistoryRepository");
        this.f80405m = aVar;
        Object f10 = u10.f("orderId");
        if (f10 != null) {
            String str = (String) f10;
            this.f80406n = str;
            C16505B<a> a10 = C16521S.a(null);
            this.f80407o = a10;
            C16532g A10 = C16534i.A(new e(aVar.j(str), this));
            Q a11 = g0.a(this);
            C16515L a12 = ip.f.a();
            c.b bVar = c.b.f80414a;
            C16519P<c> c02 = C16534i.c0(A10, a11, a12, bVar);
            this.f80408p = c02;
            this.f80409q = C16534i.c0(C16534i.n(c02, a10, new d((C17164e<? super d>) null)), g0.a(this), ip.f.a(), bVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void C() {
        this.f80407o.setValue(a.NOT_ABLE_TO_DECODE_INVOICE);
    }

    public C16519P<c> w() {
        return this.f80409q;
    }

    public void x() {
        this.f80407o.setValue(null);
    }
}
