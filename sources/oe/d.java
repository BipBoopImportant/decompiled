package Oe;

import Ae.e;
import HJ.C15854t;
import Le.b;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import dl.r;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10038a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001XB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\u0004\u0018\u00010'8FX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010/R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u0011018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u0011068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\f018\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\f068\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020B068\u0006¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010:R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010DR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020I068\u0006¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010:R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010DR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\f068\u0006¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bR\u0010:R\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"LOe/d;", "Landroidx/lifecycle/f0;", "LLe/b;", "addressLookupWrapper", "LAe/e;", "analytics", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(LLe/b;LAe/e;Landroidx/lifecycle/U;)V", "", "searchString", "", "isAutoCompleteSearch", "LXH/N;", "K", "(Ljava/lang/String;Z)V", "", "LJe/b;", "addresses", "V", "(Ljava/util/List;)V", "L", "(Ljava/lang/String;)V", "M", "postalCodeAddress", "N", "(LJe/b;)V", "m", "LLe/b;", "n", "LAe/e;", "Lme/a$a;", "o", "Lme/a$a;", "config", "p", "Ljava/lang/String;", "componentValue", "Lme/a$a$b;", "q", "LXH/o;", "Q", "()Lme/a$a$b;", "cursorFocus", "r", "O", "()Z", "addStreetNumberEnabled", "Landroidx/lifecycle/K;", "", "s", "Landroidx/lifecycle/K;", "_sections", "Landroidx/lifecycle/F;", "t", "Landroidx/lifecycle/F;", "U", "()Landroidx/lifecycle/F;", "sections", "u", "_loading", "v", "S", "loading", "Lip/b;", "LOe/d$a;", "w", "Lip/b;", "_searchResultError", "x", "T", "searchResultError", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "y", "_addressSelected", "z", "P", "addressSelected", "A", "_error", "B", "R", "error", "LQJ/F0;", "C", "LQJ/F0;", "job", "a", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final C11410b<Boolean> f62161A;

    /* renamed from: B  reason: collision with root package name */
    private final F<Boolean> f62162B;

    /* renamed from: C  reason: collision with root package name */
    private F0 f62163C;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Le.b f62164m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Ae.e f62165n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C10038a.C1374a f62166o;

    /* renamed from: p  reason: collision with root package name */
    private final String f62167p;

    /* renamed from: q  reason: collision with root package name */
    private final C16824o f62168q;

    /* renamed from: r  reason: collision with root package name */
    private final C16824o f62169r;

    /* renamed from: s  reason: collision with root package name */
    private final K<List<Object>> f62170s;

    /* renamed from: t  reason: collision with root package name */
    private final F<List<Object>> f62171t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final K<Boolean> f62172u;

    /* renamed from: v  reason: collision with root package name */
    private final F<Boolean> f62173v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C11410b<a> f62174w;

    /* renamed from: x  reason: collision with root package name */
    private final F<a> f62175x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C11410b<PostalCodeAddress> f62176y;

    /* renamed from: z  reason: collision with root package name */
    private final F<PostalCodeAddress> f62177z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LOe/d$a;", "", "<init>", "()V", "b", "a", "LOe/d$a$a;", "LOe/d$a$b;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe/d$a$a;", "LOe/d$a;", "<init>", "()V", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oe.d$a$a  reason: collision with other inner class name */
        public static final class C1055a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1055a f62178a = new C1055a();

            private C1055a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe/d$a$b;", "LOe/d$a;", "<init>", "()V", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f62179a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oe/d$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f62180a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, d dVar) {
            super(aVar);
            this.f62180a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            d dVar = this.f62180a;
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
                    String a10 = C11818a.a("Unable to fetch addresses", th2);
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
            this.f62180a.f62172u.postValue(Boolean.FALSE);
            this.f62180a.f62161A.d(Boolean.TRUE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.viewmodels.AddressLookupPickerViewModel$doFetchAddresses$2", f = "AddressLookupPickerViewModel.kt", l = {158, 162}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f62181c;

        /* renamed from: d  reason: collision with root package name */
        Object f62182d;

        /* renamed from: e  reason: collision with root package name */
        Object f62183e;

        /* renamed from: f  reason: collision with root package name */
        Object f62184f;

        /* renamed from: g  reason: collision with root package name */
        Object f62185g;

        /* renamed from: h  reason: collision with root package name */
        Object f62186h;

        /* renamed from: i  reason: collision with root package name */
        Object f62187i;

        /* renamed from: j  reason: collision with root package name */
        Object f62188j;

        /* renamed from: k  reason: collision with root package name */
        int f62189k;

        /* renamed from: l  reason: collision with root package name */
        int f62190l;

        /* renamed from: m  reason: collision with root package name */
        int f62191m;

        /* renamed from: n  reason: collision with root package name */
        int f62192n;

        /* renamed from: o  reason: collision with root package name */
        int f62193o;

        /* renamed from: p  reason: collision with root package name */
        int f62194p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f62195q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f62196r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ d f62197s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f62198t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, d dVar, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f62196r = z10;
            this.f62197s = dVar;
            this.f62198t = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f62196r, this.f62197s, this.f62198t, eVar);
            cVar.f62195q = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f62194p
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0048
                if (r2 == r4) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r1 = r0.f62187i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f62186h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f62185g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f62184f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f62183e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f62182d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f62181c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f62195q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r20)
                r2 = r20
                goto L_0x015b
            L_0x0038:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0040:
                java.lang.Object r2 = r0.f62195q
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r20)
                goto L_0x0060
            L_0x0048:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f62195q
                QJ.Q r2 = (QJ.Q) r2
                boolean r6 = r0.f62196r
                if (r6 == 0) goto L_0x0060
                r0.f62195q = r2
                r0.f62194p = r4
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = QJ.C16297b0.b(r6, r0)
                if (r6 != r1) goto L_0x0060
                return r1
            L_0x0060:
                qv.e r12 = qv.e.DEBUG
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x0073:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x008a
                java.lang.Object r7 = r6.next()
                r8 = r7
                qv.b r8 = (qv.C11819b) r8
                boolean r8 = r8.b(r12, r5)
                if (r8 == 0) goto L_0x0073
                r13.add(r7)
                goto L_0x0073
            L_0x008a:
                java.util.Iterator r14 = r13.iterator()
                r15 = 0
                r8 = r13
                r6 = r15
                r7 = r6
            L_0x0092:
                boolean r9 = r14.hasNext()
                if (r9 == 0) goto L_0x0117
                java.lang.Object r16 = r14.next()
                r8 = r16
                qv.b r8 = (qv.C11819b) r8
                r10 = 0
                if (r6 != 0) goto L_0x00b2
                java.lang.String r9 = "Search for address"
                java.lang.String r9 = qv.C11818a.a(r9, r10)
                if (r9 != 0) goto L_0x00ae
                r8 = r16
                goto L_0x0117
            L_0x00ae:
                java.lang.String r6 = qv.C11820c.a(r9)
            L_0x00b2:
                r17 = r6
                if (r7 != 0) goto L_0x0103
                java.lang.Class r6 = r2.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r15, r3, r15)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r15, r3, r15)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x00d4
                goto L_0x00da
            L_0x00d4:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
            L_0x00da:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r4)
                if (r7 == 0) goto L_0x00ed
                java.lang.String r7 = "m"
                goto L_0x00ef
            L_0x00ed:
                java.lang.String r7 = "b"
            L_0x00ef:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x0103:
                r18 = r7
                r9 = 0
                r6 = r8
                r7 = r12
                r8 = r18
                r11 = r17
                r6.a(r7, r8, r9, r10, r11)
                r8 = r16
                r6 = r17
                r7 = r18
                goto L_0x0092
            L_0x0117:
                Oe.d r9 = r0.f62197s
                androidx.lifecycle.K r9 = r9.f62172u
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
                r9.postValue(r4)
                Oe.d r4 = r0.f62197s
                Le.b r4 = r4.f62164m
                java.lang.String r9 = r0.f62198t
                Oe.d r10 = r0.f62197s
                me.a$a r10 = r10.f62166o
                java.lang.String r10 = r10.c()
                r0.f62195q = r2
                r0.f62181c = r2
                r0.f62182d = r2
                r0.f62183e = r12
                r0.f62184f = r6
                r0.f62185g = r7
                r0.f62186h = r13
                r0.f62187i = r14
                r0.f62188j = r8
                r0.f62189k = r5
                r0.f62190l = r5
                r0.f62191m = r5
                r0.f62192n = r5
                r0.f62193o = r5
                r0.f62194p = r3
                java.lang.Object r2 = r4.a(r9, r10, r0)
                if (r2 != r1) goto L_0x015b
                return r1
            L_0x015b:
                java.util.List r2 = (java.util.List) r2
                Oe.d r1 = r0.f62197s
                r1.V(r2)
                Oe.d r1 = r0.f62197s
                androidx.lifecycle.K r1 = r1.f62172u
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r5)
                r1.postValue(r3)
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L_0x0188
                java.lang.String r1 = r0.f62198t
                boolean r1 = HJ.C15854t.v0(r1)
                if (r1 != 0) goto L_0x0188
                Oe.d r1 = r0.f62197s
                ip.b r1 = r1.f62174w
                Oe.d$a$b r2 = Oe.d.a.b.f62179a
                r1.d(r2)
            L_0x0188:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Oe.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oe/d$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oe.d$d  reason: collision with other inner class name */
    public static final class C1056d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f62199a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1056d(N.a aVar, d dVar) {
            super(aVar);
            this.f62199a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            d dVar = this.f62199a;
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
                    String a10 = C11818a.a("Unable to fetch postal code", th2);
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
            this.f62199a.f62172u.setValue(Boolean.FALSE);
            if (th2 instanceof Le.e) {
                this.f62199a.f62174w.e(a.C1055a.f62178a);
            } else {
                this.f62199a.f62161A.setValue(Boolean.TRUE);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.viewmodels.AddressLookupPickerViewModel$fetchPostalCodeAddress$3", f = "AddressLookupPickerViewModel.kt", l = {124}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f62200c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f62201d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Je.b f62202e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, Je.b bVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f62201d = dVar;
            this.f62202e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f62201d, this.f62202e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f62200c;
            if (i10 == 0) {
                y.b(obj);
                this.f62201d.f62172u.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Le.b j10 = this.f62201d.f62164m;
                Je.b bVar = this.f62202e;
                String e10 = this.f62201d.f62166o.e();
                this.f62200c = 1;
                obj = j10.b(bVar, e10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f62201d.f62176y.e((PostalCodeAddress) obj);
            this.f62201d.f62172u.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            C10038a.C1374a C10 = this.f62201d.f62166o;
            if (!(C10 instanceof C10038a.C1374a.C1375a)) {
                if (C10 instanceof C10038a.C1374a.c) {
                    e.c.b(this.f62201d.f62165n, Interaction$Component.GOOGLE_PLACES_ADDRESS_LOOKUP, (String) null, (Map) null, (e.b) null, 14, (Object) null);
                } else {
                    throw new t();
                }
            }
            return C16807N.f139792a;
        }
    }

    public d(Le.b bVar, Ae.e eVar, U u10) {
        boolean z10;
        C17542s.j(bVar, "addressLookupWrapper");
        C17542s.j(eVar, "analytics");
        C17542s.j(u10, "savedStateHandle");
        this.f62164m = bVar;
        this.f62165n = eVar;
        Object f10 = u10.f("config_key");
        if (f10 != null) {
            C10038a.C1374a aVar = (C10038a.C1374a) f10;
            this.f62166o = aVar;
            Object f11 = u10.f("component_value_key");
            if (f11 != null) {
                String str = (String) f11;
                this.f62167p = str;
                this.f62168q = C16825p.b(new b(this));
                this.f62169r = C16825p.b(new c(this));
                K<List<Object>> k10 = new K<>();
                this.f62170s = k10;
                this.f62171t = k10;
                K<Boolean> k11 = new K<>();
                this.f62172u = k11;
                this.f62173v = k11;
                C11410b<a> bVar2 = new C11410b<>();
                this.f62174w = bVar2;
                this.f62175x = bVar2;
                C11410b<PostalCodeAddress> bVar3 = new C11410b<>();
                this.f62176y = bVar3;
                this.f62177z = bVar3;
                C11410b<Boolean> bVar4 = new C11410b<>();
                this.f62161A = bVar4;
                this.f62162B = bVar4;
                if (aVar instanceof C10038a.C1374a.C1375a) {
                    z10 = false;
                } else if (aVar instanceof C10038a.C1374a.c) {
                    z10 = true;
                } else {
                    throw new t();
                }
                bVar.c(new b.a(z10), str);
                V(C16877v.n());
                if (aVar instanceof C10038a.C1374a.C1375a) {
                    return;
                }
                if (aVar instanceof C10038a.C1374a.c) {
                    eVar.o((Map<String, ? extends Object>) null, Interaction$Component.GOOGLE_PLACES_ADDRESS_LOOKUP);
                    return;
                }
                throw new t();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final boolean I(d dVar) {
        return dVar.f62166o.a();
    }

    /* access modifiers changed from: private */
    public static final C10038a.C1374a.b J(d dVar) {
        return dVar.f62166o.d();
    }

    private final void K(String str, boolean z10) {
        F0 f02 = this.f62163C;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f62163C = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(z10, this, str, (C17164e<? super c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void V(List<? extends Je.b> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r.a(Oo.b.f84744p1, (String) null, (Integer) null, (Integer) null, r.c.BodyMedium, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2030, (DefaultConstructorMarker) null));
        arrayList.addAll(list);
        this.f62170s.postValue(arrayList);
    }

    public final void L(String str) {
        C17542s.j(str, "searchString");
        K(str, false);
    }

    public final void M(String str) {
        C17542s.j(str, "searchString");
        if (this.f62166o.b()) {
            K(str, true);
        }
    }

    public final void N(Je.b bVar) {
        Je.b bVar2 = bVar;
        C17542s.j(bVar2, "postalCodeAddress");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar3 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Fetch postal code for address", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar3.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 unused = C16314k.d(g0.a(this), new C1056d(N.f137593c0, this), (T) null, new e(this, bVar2, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final boolean O() {
        return ((Boolean) this.f62169r.getValue()).booleanValue();
    }

    public final F<PostalCodeAddress> P() {
        return this.f62177z;
    }

    public final C10038a.C1374a.b Q() {
        return (C10038a.C1374a.b) this.f62168q.getValue();
    }

    public final F<Boolean> R() {
        return this.f62162B;
    }

    public final F<Boolean> S() {
        return this.f62173v;
    }

    public final F<a> T() {
        return this.f62175x;
    }

    public final F<List<Object>> U() {
        return this.f62171t;
    }
}
