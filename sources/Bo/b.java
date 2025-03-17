package Bo;

import Bo.a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Nn.S;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import Wn.b;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mD.C14788a;
import mD.C14789b;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rv.C11849b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001,B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0017\u0010*¨\u0006-"}, d2 = {"LBo/b;", "Landroidx/lifecycle/f0;", "LmD/a;", "createAddressUseCase", "LmD/b;", "editAddressUseCase", "LWn/b;", "checkoutAnalytics", "<init>", "(LmD/a;LmD/b;LWn/b;)V", "LNn/S;", "LBo/b$a;", "E", "(LNn/S;)LBo/b$a;", "upsertAddressData", "LXH/N;", "G", "(LNn/S;)V", "I", "()V", "F", "H", "J", "m", "LmD/a;", "n", "LmD/b;", "o", "LWn/b;", "LTJ/B;", "p", "LTJ/B;", "addressData", "", "q", "isSubmitting", "r", "dismiss", "LTJ/P;", "LBo/a;", "s", "LTJ/P;", "()LTJ/P;", "uiState", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C14788a f79337m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C14789b f79338n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Wn.b f79339o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<a> f79340p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<Boolean> f79341q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<Boolean> f79342r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<a> f79343s;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0006\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"LBo/b$a;", "", "<init>", "()V", "", "", "a", "()Ljava/util/List;", "addressDisplayTexts", "LIC/e;", "d", "()LIC/e;", "title", "b", "bodyText", "c", "buttonText", "LBo/b$a$a;", "LBo/b$a$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001a\u0010!\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006\""}, d2 = {"LBo/b$a$a;", "LBo/b$a;", "", "", "addressData", "", "addressDisplayTexts", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "b", "Ljava/util/List;", "()Ljava/util/List;", "LIC/e;", "c", "LIC/e;", "d", "()LIC/e;", "title", "bodyText", "buttonText", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bo.b$a$a  reason: collision with other inner class name */
        public static final class C1471a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, String> f79344a;

            /* renamed from: b  reason: collision with root package name */
            private final List<String> f79345b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f79346c = C13026h.a(C11849b.f102365x1);

            /* renamed from: d  reason: collision with root package name */
            private final C13023e f79347d = C13026h.a(C11849b.f102357v1);

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f79348e = C13026h.a(C11849b.f102361w1);

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1471a(Map<String, String> map, List<String> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(map, "addressData");
                C17542s.j(list, "addressDisplayTexts");
                this.f79344a = map;
                this.f79345b = list;
            }

            public List<String> a() {
                return this.f79345b;
            }

            public C13023e b() {
                return this.f79347d;
            }

            public C13023e c() {
                return this.f79348e;
            }

            public C13023e d() {
                return this.f79346c;
            }

            public Map<String, String> e() {
                return this.f79344a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1471a)) {
                    return false;
                }
                C1471a aVar = (C1471a) obj;
                return C17542s.e(this.f79344a, aVar.f79344a) && C17542s.e(this.f79345b, aVar.f79345b);
            }

            public int hashCode() {
                return (this.f79344a.hashCode() * 31) + this.f79345b.hashCode();
            }

            public String toString() {
                Map<String, String> map = this.f79344a;
                List<String> list = this.f79345b;
                return "Add(addressData=" + map + ", addressDisplayTexts=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b\u0018\u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006%"}, d2 = {"LBo/b$a$b;", "LBo/b$a;", "", "", "addressData", "", "addressDisplayTexts", "addressId", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "f", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "title", "bodyText", "buttonText", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bo.b$a$b  reason: collision with other inner class name */
        public static final class C1472b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, String> f79349a;

            /* renamed from: b  reason: collision with root package name */
            private final List<String> f79350b;

            /* renamed from: c  reason: collision with root package name */
            private final String f79351c;

            /* renamed from: d  reason: collision with root package name */
            private final C13023e f79352d = C13026h.a(C11849b.f102164A1);

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f79353e = C13026h.a(C11849b.f102369y1);

            /* renamed from: f  reason: collision with root package name */
            private final C13023e f79354f = C13026h.a(C11849b.f102373z1);

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1472b(Map<String, String> map, List<String> list, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(map, "addressData");
                C17542s.j(list, "addressDisplayTexts");
                C17542s.j(str, "addressId");
                this.f79349a = map;
                this.f79350b = list;
                this.f79351c = str;
            }

            public List<String> a() {
                return this.f79350b;
            }

            public C13023e b() {
                return this.f79353e;
            }

            public C13023e c() {
                return this.f79354f;
            }

            public C13023e d() {
                return this.f79352d;
            }

            public Map<String, String> e() {
                return this.f79349a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1472b)) {
                    return false;
                }
                C1472b bVar = (C1472b) obj;
                return C17542s.e(this.f79349a, bVar.f79349a) && C17542s.e(this.f79350b, bVar.f79350b) && C17542s.e(this.f79351c, bVar.f79351c);
            }

            public final String f() {
                return this.f79351c;
            }

            public int hashCode() {
                return (((this.f79349a.hashCode() * 31) + this.f79350b.hashCode()) * 31) + this.f79351c.hashCode();
            }

            public String toString() {
                Map<String, String> map = this.f79349a;
                List<String> list = this.f79350b;
                String str = this.f79351c;
                return "Update(addressData=" + map + ", addressDisplayTexts=" + list + ", addressId=" + str + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract List<String> a();

        public abstract C13023e b();

        public abstract C13023e c();

        public abstract C13023e d();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Bo/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bo.b$b  reason: collision with other inner class name */
    public static final class C1473b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79355a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1473b(N.a aVar, b bVar) {
            super(aVar);
            this.f79355a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            b bVar = this.f79355a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Unable to add/update address", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.userdetails.update.viewmodel.UpdateAddressViewModel$submit$3", f = "UpdateAddressViewModel.kt", l = {95, 99}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79356c;

        /* renamed from: d  reason: collision with root package name */
        Object f79357d;

        /* renamed from: e  reason: collision with root package name */
        Object f79358e;

        /* renamed from: f  reason: collision with root package name */
        int f79359f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f79360g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f79361h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f79361h = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f79361h, eVar);
            cVar.f79360g = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x018d A[EDGE_INSN: B:102:0x018d->B:66:0x018d ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7 A[Catch:{ all -> 0x0028 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[Catch:{ all -> 0x0028 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0197 A[Catch:{ all -> 0x0028 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x019a A[Catch:{ all -> 0x0028 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f79359f
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0049
                if (r2 == r5) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r0 = r1.f79358e
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r0 = r1.f79357d
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r0 = r1.f79356c
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r2 = r1.f79360g
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r19)     // Catch:{ all -> 0x0028 }
                r7 = r19
                goto L_0x00c8
            L_0x0028:
                r0 = move-exception
                goto L_0x01f4
            L_0x002b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0033:
                java.lang.Object r0 = r1.f79358e
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r0 = r1.f79357d
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r0 = r1.f79356c
                Bo.b$a r0 = (Bo.b.a) r0
                java.lang.Object r2 = r1.f79360g
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r19)     // Catch:{ all -> 0x0028 }
                r7 = r19
                goto L_0x0097
            L_0x0049:
                XH.y.b(r19)
                java.lang.Object r2 = r1.f79360g
                QJ.Q r2 = (QJ.Q) r2
                Bo.b r6 = r1.f79361h     // Catch:{ all -> 0x0028 }
                TJ.B r6 = r6.f79340p     // Catch:{ all -> 0x0028 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0028 }
                Bo.b$a r6 = (Bo.b.a) r6     // Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x01ec
                Bo.b r7 = r1.f79361h     // Catch:{ all -> 0x0028 }
                Wn.b r7 = r7.f79339o     // Catch:{ all -> 0x0028 }
                boolean r8 = r6 instanceof Bo.b.a.C1471a     // Catch:{ all -> 0x0028 }
                if (r8 == 0) goto L_0x006b
                Wn.b$b r8 = Wn.b.C1897b.ADD     // Catch:{ all -> 0x0028 }
                goto L_0x0071
            L_0x006b:
                boolean r8 = r6 instanceof Bo.b.a.C1472b     // Catch:{ all -> 0x0028 }
                if (r8 == 0) goto L_0x01e6
                Wn.b$b r8 = Wn.b.C1897b.UPDATE     // Catch:{ all -> 0x0028 }
            L_0x0071:
                r7.s(r8)     // Catch:{ all -> 0x0028 }
                boolean r7 = r6 instanceof Bo.b.a.C1471a     // Catch:{ all -> 0x0028 }
                if (r7 == 0) goto L_0x009e
                Bo.b r7 = r1.f79361h     // Catch:{ all -> 0x0028 }
                mD.a r7 = r7.f79337m     // Catch:{ all -> 0x0028 }
                r8 = r6
                Bo.b$a$a r8 = (Bo.b.a.C1471a) r8     // Catch:{ all -> 0x0028 }
                java.util.Map r8 = r8.e()     // Catch:{ all -> 0x0028 }
                r1.f79360g = r2     // Catch:{ all -> 0x0028 }
                r1.f79356c = r6     // Catch:{ all -> 0x0028 }
                r1.f79357d = r6     // Catch:{ all -> 0x0028 }
                r1.f79358e = r6     // Catch:{ all -> 0x0028 }
                r1.f79359f = r5     // Catch:{ all -> 0x0028 }
                java.lang.Object r7 = r7.a(r8, r1)     // Catch:{ all -> 0x0028 }
                if (r7 != r0) goto L_0x0096
                return r0
            L_0x0096:
                r0 = r6
            L_0x0097:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0028 }
                boolean r6 = r7.booleanValue()     // Catch:{ all -> 0x0028 }
                goto L_0x00ce
            L_0x009e:
                boolean r7 = r6 instanceof Bo.b.a.C1472b     // Catch:{ all -> 0x0028 }
                if (r7 == 0) goto L_0x01e0
                Bo.b r7 = r1.f79361h     // Catch:{ all -> 0x0028 }
                mD.b r7 = r7.f79338n     // Catch:{ all -> 0x0028 }
                r8 = r6
                Bo.b$a$b r8 = (Bo.b.a.C1472b) r8     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = r8.f()     // Catch:{ all -> 0x0028 }
                r9 = r6
                Bo.b$a$b r9 = (Bo.b.a.C1472b) r9     // Catch:{ all -> 0x0028 }
                java.util.Map r9 = r9.e()     // Catch:{ all -> 0x0028 }
                r1.f79360g = r2     // Catch:{ all -> 0x0028 }
                r1.f79356c = r6     // Catch:{ all -> 0x0028 }
                r1.f79357d = r6     // Catch:{ all -> 0x0028 }
                r1.f79358e = r6     // Catch:{ all -> 0x0028 }
                r1.f79359f = r3     // Catch:{ all -> 0x0028 }
                java.lang.Object r7 = r7.a(r8, r9, r1)     // Catch:{ all -> 0x0028 }
                if (r7 != r0) goto L_0x00c7
                return r0
            L_0x00c7:
                r0 = r6
            L_0x00c8:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0028 }
                boolean r6 = r7.booleanValue()     // Catch:{ all -> 0x0028 }
            L_0x00ce:
                qv.e r13 = qv.e.DEBUG     // Catch:{ all -> 0x0028 }
                qv.d r7 = qv.d.f102012a     // Catch:{ all -> 0x0028 }
                java.util.List r7 = r7.a()     // Catch:{ all -> 0x0028 }
                java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0028 }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
                r8.<init>()     // Catch:{ all -> 0x0028 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0028 }
            L_0x00e1:
                boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0028 }
                if (r9 == 0) goto L_0x00f8
                java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0028 }
                r10 = r9
                qv.b r10 = (qv.C11819b) r10     // Catch:{ all -> 0x0028 }
                boolean r10 = r10.b(r13, r4)     // Catch:{ all -> 0x0028 }
                if (r10 == 0) goto L_0x00e1
                r8.add(r9)     // Catch:{ all -> 0x0028 }
                goto L_0x00e1
            L_0x00f8:
                java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x0028 }
                r15 = 0
                r7 = r15
                r8 = r7
            L_0x00ff:
                boolean r9 = r14.hasNext()     // Catch:{ all -> 0x0028 }
                if (r9 == 0) goto L_0x018d
                java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0028 }
                qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x0028 }
                r11 = 0
                if (r7 != 0) goto L_0x012a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
                r7.<init>()     // Catch:{ all -> 0x0028 }
                java.lang.String r10 = "Address added/updated, success: "
                r7.append(r10)     // Catch:{ all -> 0x0028 }
                r7.append(r6)     // Catch:{ all -> 0x0028 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0028 }
                java.lang.String r7 = qv.C11818a.a(r7, r11)     // Catch:{ all -> 0x0028 }
                if (r7 != 0) goto L_0x0126
                goto L_0x018d
            L_0x0126:
                java.lang.String r7 = qv.C11820c.a(r7)     // Catch:{ all -> 0x0028 }
            L_0x012a:
                r16 = r7
                if (r8 != 0) goto L_0x017b
                java.lang.Class r7 = r2.getClass()     // Catch:{ all -> 0x0028 }
                java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0028 }
                kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ all -> 0x0028 }
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r15, r3, r15)     // Catch:{ all -> 0x0028 }
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r15, r3, r15)     // Catch:{ all -> 0x0028 }
                int r10 = r8.length()     // Catch:{ all -> 0x0028 }
                if (r10 != 0) goto L_0x014c
                goto L_0x0152
            L_0x014c:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)     // Catch:{ all -> 0x0028 }
            L_0x0152:
                java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0028 }
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r5)     // Catch:{ all -> 0x0028 }
                if (r8 == 0) goto L_0x0165
                java.lang.String r8 = "m"
                goto L_0x0167
            L_0x0165:
                java.lang.String r8 = "b"
            L_0x0167:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
                r10.<init>()     // Catch:{ all -> 0x0028 }
                r10.append(r8)     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = "|"
                r10.append(r8)     // Catch:{ all -> 0x0028 }
                r10.append(r7)     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0028 }
            L_0x017b:
                r17 = r8
                r10 = 0
                r7 = r9
                r8 = r13
                r9 = r17
                r12 = r16
                r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0028 }
                r7 = r16
                r8 = r17
                goto L_0x00ff
            L_0x018d:
                Bo.b r2 = r1.f79361h     // Catch:{ all -> 0x0028 }
                Wn.b r2 = r2.f79339o     // Catch:{ all -> 0x0028 }
                boolean r3 = r0 instanceof Bo.b.a.C1471a     // Catch:{ all -> 0x0028 }
                if (r3 == 0) goto L_0x019a
                Wn.b$b r0 = Wn.b.C1897b.ADD     // Catch:{ all -> 0x0028 }
                goto L_0x01a0
            L_0x019a:
                boolean r0 = r0 instanceof Bo.b.a.C1472b     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x01da
                Wn.b$b r0 = Wn.b.C1897b.UPDATE     // Catch:{ all -> 0x0028 }
            L_0x01a0:
                r2.B(r0, r6)     // Catch:{ all -> 0x0028 }
                Bo.b r0 = r1.f79361h
                TJ.B r0 = r0.f79341q
            L_0x01a9:
                java.lang.Object r2 = r0.getValue()
                r3 = r2
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.booleanValue()
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r4)
                boolean r2 = r0.e(r2, r3)
                if (r2 == 0) goto L_0x01a9
                Bo.b r0 = r1.f79361h
                TJ.B r2 = r0.f79342r
            L_0x01c3:
                java.lang.Object r0 = r2.getValue()
                r3 = r0
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.booleanValue()
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r5)
                boolean r0 = r2.e(r0, r3)
                if (r0 == 0) goto L_0x01c3
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x01da:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0028 }
                r0.<init>()     // Catch:{ all -> 0x0028 }
                throw r0     // Catch:{ all -> 0x0028 }
            L_0x01e0:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0028 }
                r0.<init>()     // Catch:{ all -> 0x0028 }
                throw r0     // Catch:{ all -> 0x0028 }
            L_0x01e6:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0028 }
                r0.<init>()     // Catch:{ all -> 0x0028 }
                throw r0     // Catch:{ all -> 0x0028 }
            L_0x01ec:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
                java.lang.String r2 = "No address type set, did you call initiate?"
                r0.<init>(r2)     // Catch:{ all -> 0x0028 }
                throw r0     // Catch:{ all -> 0x0028 }
            L_0x01f4:
                Bo.b r2 = r1.f79361h
                TJ.B r2 = r2.f79341q
            L_0x01fa:
                java.lang.Object r3 = r2.getValue()
                r6 = r3
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6.booleanValue()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
                boolean r3 = r2.e(r3, r6)
                if (r3 == 0) goto L_0x01fa
                Bo.b r2 = r1.f79361h
                TJ.B r2 = r2.f79342r
            L_0x0214:
                java.lang.Object r3 = r2.getValue()
                r4 = r3
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                r4.booleanValue()
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r5)
                boolean r3 = r2.e(r3, r4)
                if (r3 != 0) goto L_0x0229
                goto L_0x0214
            L_0x0229:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Bo.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LBo/b$a;", "addressData", "", "isSubmitting", "dismiss", "LBo/a;", "<anonymous>", "(LBo/b$a;ZZ)LBo/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.userdetails.update.viewmodel.UpdateAddressViewModel$uiState$1", f = "UpdateAddressViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements r<a, Boolean, Boolean, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79362c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f79363d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f79364e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f79365f;

        d(C17164e<? super d> eVar) {
            super(4, eVar);
        }

        public final Object i(a aVar, boolean z10, boolean z11, C17164e<? super a> eVar) {
            d dVar = new d(eVar);
            dVar.f79363d = aVar;
            dVar.f79364e = z10;
            dVar.f79365f = z11;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79362c == 0) {
                y.b(obj);
                a aVar = (a) this.f79363d;
                boolean z10 = this.f79364e;
                boolean z11 = this.f79365f;
                if (aVar == null) {
                    return a.b.f79336a;
                }
                C13023e d10 = aVar.d();
                C13023e b10 = aVar.b();
                C13023e c10 = aVar.c();
                Iterable<String> a10 = aVar.a();
                ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                for (String aVar2 : a10) {
                    arrayList.add(new a.C1469a.C1470a(aVar2, false));
                }
                return new a.C1469a(d10, b10, c10, arrayList, z10, z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((a) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    public b(C14788a aVar, C14789b bVar, Wn.b bVar2) {
        C17542s.j(aVar, "createAddressUseCase");
        C17542s.j(bVar, "editAddressUseCase");
        C17542s.j(bVar2, "checkoutAnalytics");
        this.f79337m = aVar;
        this.f79338n = bVar;
        this.f79339o = bVar2;
        C16505B<a> a10 = C16521S.a(null);
        this.f79340p = a10;
        Boolean bool = Boolean.FALSE;
        C16505B<Boolean> a11 = C16521S.a(bool);
        this.f79341q = a11;
        C16505B<Boolean> a12 = C16521S.a(bool);
        this.f79342r = a12;
        this.f79343s = C16534i.c0(C16534i.m(a10, a11, a12, new d((C17164e<? super d>) null)), g0.a(this), ip.f.a(), a.b.f79336a);
    }

    private final a E(S s10) {
        if (s10 instanceof S.a) {
            S.a aVar = (S.a) s10;
            return new a.C1471a(aVar.a(), aVar.b());
        } else if (s10 instanceof S.b) {
            S.b bVar = (S.b) s10;
            return new a.C1472b(bVar.b(), bVar.c(), bVar.a());
        } else {
            throw new t();
        }
    }

    public final void F() {
        Boolean value;
        C16505B<Boolean> b10 = this.f79342r;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    public final void G(S s10) {
        Boolean value;
        a value2;
        C17542s.j(s10, "upsertAddressData");
        C16505B<Boolean> b10 = this.f79342r;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
        C16505B<a> b11 = this.f79340p;
        do {
            value2 = b11.getValue();
            a aVar = value2;
        } while (!b11.e(value2, E(s10)));
    }

    public final void H() {
        Boolean value;
        C16505B<Boolean> b10 = this.f79342r;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
    }

    public final void I() {
        Boolean value;
        C16505B<Boolean> b10 = this.f79341q;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
        F0 unused = C16314k.d(g0.a(this), new C1473b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final void J() {
        b.C1897b bVar;
        a value = this.f79340p.getValue();
        if (value != null) {
            Wn.b bVar2 = this.f79339o;
            if (value instanceof a.C1471a) {
                bVar = b.C1897b.ADD;
            } else if (value instanceof a.C1472b) {
                bVar = b.C1897b.UPDATE;
            } else {
                throw new t();
            }
            bVar2.h(bVar);
        }
    }

    public final C16519P<a> m() {
        return this.f79343s;
    }
}
