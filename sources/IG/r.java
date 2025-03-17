package ig;

import EB.C12832d;
import HJ.C15854t;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Un.a;
import Ur.a;
import XH.C16807N;
import XH.t;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import hg.C9794c;
import hg.q;
import ig.C9845a;
import ip.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14762d;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10243d;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u000216B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00170\u00132\u001a\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00170\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00132\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u0011H@¢\u0006\u0004\b!\u0010\"J^\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010*2\u0006\u0010-\u001a\u00020,H@¢\u0006\u0004\b.\u0010/JB\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00132\u001a\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00170\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lig/r;", "Lig/q;", "LUr/a;", "googlePayUseCase", "LVn/a;", "createCheckoutSelectDeliveryUseCase", "Ltf/a;", "killSwitchRepository", "LlD/d;", "getProfileUseCase", "LLn/h;", "cartRepository", "<init>", "(LUr/a;LVn/a;Ltf/a;LlD/d;LLn/h;)V", "", "isEnabled", "LTJ/B;", "Lsf/d;", "deliveryType", "LTJ/g;", "LUr/a$b;", "h", "(ZLTJ/B;)LTJ/g;", "Lip/l;", "Lig/a$a;", "", "availabilityFlow", "googlePayState", "i", "(LTJ/g;LUr/a$b;)LTJ/g;", "availability", "preferredDeliveryOption", "Lig/r$c;", "j", "(Lip/l;Lsf/d;LdI/e;)Ljava/lang/Object;", "", "LLn/d;", "cartItems", "", "zipCode", "stateCode", "deliveryCountryCode", "", "additionalValues", "LUn/a;", "preferredDelivery", "k", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LUn/a;LdI/e;)Ljava/lang/Object;", "Lhg/q$d$a;", "a", "(LTJ/g;LTJ/B;)LTJ/g;", "LUr/a;", "b", "LVn/a;", "c", "LlD/d;", "d", "LLn/h;", "e", "Z", "previousEnabledState", "f", "LTJ/g;", "enabledFlow", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Ur.a f74527a;

    /* renamed from: b  reason: collision with root package name */
    private final Vn.a f74528b;

    /* renamed from: c  reason: collision with root package name */
    private final C14762d f74529c;

    /* renamed from: d  reason: collision with root package name */
    private final Ln.h f74530d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f74531e;

    /* renamed from: f  reason: collision with root package name */
    private final C16532g<Boolean> f74532f;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lig/r$a;", "", "Lip/l;", "Lig/a$a;", "", "availability", "Lsf/d;", "deliveryType", "<init>", "(Lip/l;Lsf/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lip/l;", "()Lip/l;", "b", "Lsf/d;", "()Lsf/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ip.l<C9845a.C1326a, Throwable> f74533a;

        /* renamed from: b  reason: collision with root package name */
        private final C10243d f74534b;

        public a(ip.l<C9845a.C1326a, Throwable> lVar, C10243d dVar) {
            C17542s.j(dVar, "deliveryType");
            this.f74533a = lVar;
            this.f74534b = dVar;
        }

        public final ip.l<C9845a.C1326a, Throwable> a() {
            return this.f74533a;
        }

        public final C10243d b() {
            return this.f74534b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74533a, aVar.f74533a) && this.f74534b == aVar.f74534b;
        }

        public int hashCode() {
            ip.l<C9845a.C1326a, Throwable> lVar = this.f74533a;
            return ((lVar == null ? 0 : lVar.hashCode()) * 31) + this.f74534b.hashCode();
        }

        public String toString() {
            ip.l<C9845a.C1326a, Throwable> lVar = this.f74533a;
            C10243d dVar = this.f74534b;
            return "AvailabilityAndDelivery(availability=" + lVar + ", deliveryType=" + dVar + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f74535a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f74536b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        static {
            /*
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                sf.d r2 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                sf.d r3 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f74535a = r0
                Ln.f$b[] r0 = Ln.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ln.f$b r3 = Ln.f.b.METER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Ln.f$b r1 = Ln.f.b.PIECE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f74536b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ig.r.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lig/r$c;", "", "<init>", "()V", "d", "c", "a", "b", "f", "e", "Lig/r$c$a;", "Lig/r$c$b;", "Lig/r$c$c;", "Lig/r$c$d;", "Lig/r$c$e;", "Lig/r$c$f;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/r$c$a;", "Lig/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f74537a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 321334617;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/r$c$b;", "Lig/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f74538a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1299404927;
            }

            public String toString() {
                return "ItemsUnavailable";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/r$c$c;", "Lig/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.r$c$c  reason: collision with other inner class name */
        public static final class C1338c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1338c f74539a = new C1338c();

            private C1338c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1338c);
            }

            public int hashCode() {
                return 1380559949;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/r$c$d;", "Lig/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f74540a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 361321640;
            }

            public String toString() {
                return "Pending";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lig/r$c$e;", "Lig/r$c;", "", "checkoutId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f74541a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "checkoutId");
                this.f74541a = str;
            }

            public final String a() {
                return this.f74541a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f74541a, ((e) obj).f74541a);
            }

            public int hashCode() {
                return this.f74541a.hashCode();
            }

            public String toString() {
                String str = this.f74541a;
                return "Success(checkoutId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/r$c$f;", "Lig/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final f f74542a = new f();

            private f() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1746973409;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<a.C1858a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74543a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74544a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$checkEnabledAndGetGooglePayState$$inlined$map$1$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.r$d$a$a  reason: collision with other inner class name */
            public static final class C1339a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74545c;

                /* renamed from: d  reason: collision with root package name */
                int f74546d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74547e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1339a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74547e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74545c = obj;
                    this.f74546d |= Integer.MIN_VALUE;
                    return this.f74547e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74544a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.r.d.a.C1339a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.r$d$a$a r0 = (ig.r.d.a.C1339a) r0
                    int r1 = r0.f74546d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74546d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.r$d$a$a r0 = new ig.r$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74545c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74546d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f74544a
                    sf.d r5 = (sf.C10243d) r5
                    int[] r2 = ig.r.b.f74535a
                    int r5 = r5.ordinal()
                    r5 = r2[r5]
                    if (r5 == r3) goto L_0x004e
                    r2 = 2
                    if (r5 != r2) goto L_0x0048
                    Ur.a$a r5 = Ur.a.C1858a.COLLECT
                    goto L_0x0050
                L_0x0048:
                    XH.t r5 = new XH.t
                    r5.<init>()
                    throw r5
                L_0x004e:
                    Ur.a$a r5 = Ur.a.C1858a.HOME
                L_0x0050:
                    r0.f74546d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.r.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f74543a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74543a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetGooglePayButtonUiStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super a.b>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74548c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74549d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74550e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r f74551f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16505B f74552g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17164e eVar, r rVar, C16505B b10) {
            super(3, eVar);
            this.f74551f = rVar;
            this.f74552g = b10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super a.b> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(eVar, this.f74551f, this.f74552g);
            eVar2.f74549d = hVar;
            eVar2.f74550e = bool;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74548c;
            if (i10 == 0) {
                y.b(obj);
                C16532g b10 = this.f74551f.h(((Boolean) this.f74550e).booleanValue(), this.f74552g);
                this.f74548c = 1;
                if (C16534i.x((C16533h) this.f74549d, b10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$$inlined$flatMapLatest$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super ip.l<C9845a.C1326a, Throwable>>, a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74553c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74554d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74555e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r f74556f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16532g f74557g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17164e eVar, r rVar, C16532g gVar) {
            super(3, eVar);
            this.f74556f = rVar;
            this.f74557g = gVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super ip.l<C9845a.C1326a, Throwable>> hVar, a.b bVar, C17164e<? super C16807N> eVar) {
            f fVar = new f(eVar, this.f74556f, this.f74557g);
            fVar.f74554d = hVar;
            fVar.f74555e = bVar;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74553c;
            if (i10 == 0) {
                y.b(obj);
                C16532g c10 = this.f74556f.i(this.f74557g, (a.b) this.f74555e);
                this.f74553c = 1;
                if (C16534i.x((C16533h) this.f74554d, c10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$$inlined$flatMapLatest$3", f = "GetGooglePayButtonUiStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super a>, ip.l<C9845a.C1326a, Throwable>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74558c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74559d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74560e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16505B f74561f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17164e eVar, C16505B b10) {
            super(3, eVar);
            this.f74561f = b10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super a> hVar, ip.l<C9845a.C1326a, Throwable> lVar, C17164e<? super C16807N> eVar) {
            g gVar = new g(eVar, this.f74561f);
            gVar.f74559d = hVar;
            gVar.f74560e = lVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74558c;
            if (i10 == 0) {
                y.b(obj);
                l lVar = new l(this.f74561f, (ip.l) this.f74560e);
                this.f74558c = 1;
                if (C16534i.x((C16533h) this.f74559d, lVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$$inlined$flatMapLatest$4", f = "GetGooglePayButtonUiStateUseCase.kt", l = {190, 189}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super c>, a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74562c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74563d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74564e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r f74565f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17164e eVar, r rVar) {
            super(3, eVar);
            this.f74565f = rVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super c> hVar, a aVar, C17164e<? super C16807N> eVar) {
            h hVar2 = new h(eVar, this.f74565f);
            hVar2.f74563d = hVar;
            hVar2.f74564e = aVar;
            return hVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f74562c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r7)
                goto L_0x0051
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f74563d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0043
            L_0x0022:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f74563d
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r7 = r6.f74564e
                ig.r$a r7 = (ig.r.a) r7
                ig.r r4 = r6.f74565f
                ip.l r5 = r7.a()
                sf.d r7 = r7.b()
                r6.f74563d = r1
                r6.f74562c = r3
                java.lang.Object r7 = r4.j(r5, r7, r6)
                if (r7 != r0) goto L_0x0043
                return r0
            L_0x0043:
                TJ.g r7 = (TJ.C16532g) r7
                r3 = 0
                r6.f74563d = r3
                r6.f74562c = r2
                java.lang.Object r7 = TJ.C16534i.x(r1, r7, r6)
                if (r7 != r0) goto L_0x0051
                return r0
            L_0x0051:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ig.r.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C16532g<q.d.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f74567b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74568a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f74569b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$$inlined$map$1$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.r$i$a$a  reason: collision with other inner class name */
            public static final class C1340a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74570c;

                /* renamed from: d  reason: collision with root package name */
                int f74571d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74572e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1340a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74572e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74570c = obj;
                    this.f74571d |= Integer.MIN_VALUE;
                    return this.f74572e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, r rVar) {
                this.f74568a = hVar;
                this.f74569b = rVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: hg.E$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: hg.E$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: hg.E$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: hg.E$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: hg.E$b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: hg.E$c} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: hg.E$a} */
            /* JADX WARNING: type inference failed for: r6v1, types: [hg.q$d$a] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r10, dI.C17164e r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof ig.r.i.a.C1340a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    ig.r$i$a$a r0 = (ig.r.i.a.C1340a) r0
                    int r1 = r0.f74571d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74571d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.r$i$a$a r0 = new ig.r$i$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f74570c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74571d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r11)
                    goto L_0x00cf
                L_0x002a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0032:
                    XH.y.b(r11)
                    TJ.h r11 = r9.f74568a
                    ig.r$c r10 = (ig.r.c) r10
                    r2 = 0
                    if (r10 == 0) goto L_0x00c6
                    boolean r4 = r10 instanceof ig.r.c.e
                    if (r4 != 0) goto L_0x0075
                    boolean r5 = r10 instanceof ig.r.c.C1338c
                    if (r5 == 0) goto L_0x0045
                    goto L_0x0075
                L_0x0045:
                    ig.r$c$d r5 = ig.r.c.d.f74540a
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r10, r5)
                    if (r5 == 0) goto L_0x0054
                    ig.r r5 = r9.f74569b
                    boolean r5 = r5.f74531e
                    goto L_0x0076
                L_0x0054:
                    ig.r$c$b r5 = ig.r.c.b.f74538a
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r10, r5)
                    if (r5 != 0) goto L_0x0073
                    ig.r$c$a r5 = ig.r.c.a.f74537a
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r10, r5)
                    if (r5 != 0) goto L_0x0073
                    ig.r$c$f r5 = ig.r.c.f.f74542a
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r10, r5)
                    if (r5 == 0) goto L_0x006d
                    goto L_0x0073
                L_0x006d:
                    XH.t r10 = new XH.t
                    r10.<init>()
                    throw r10
                L_0x0073:
                    r5 = 0
                    goto L_0x0076
                L_0x0075:
                    r5 = r3
                L_0x0076:
                    ig.r r6 = r9.f74569b
                    r6.f74531e = r5
                    hg.q$d$a r6 = new hg.q$d$a
                    boolean r7 = r10 instanceof ig.r.c.C1338c
                    ig.r$c$a r8 = ig.r.c.a.f74537a
                    boolean r8 = kotlin.jvm.internal.C17542s.e(r10, r8)
                    if (r8 == 0) goto L_0x008a
                    hg.E$a r2 = hg.E.a.f73595a
                    goto L_0x00c2
                L_0x008a:
                    ig.r$c$c r8 = ig.r.c.C1338c.f74539a
                    boolean r8 = kotlin.jvm.internal.C17542s.e(r10, r8)
                    if (r8 != 0) goto L_0x00c0
                    ig.r$c$d r8 = ig.r.c.d.f74540a
                    boolean r8 = kotlin.jvm.internal.C17542s.e(r10, r8)
                    if (r8 == 0) goto L_0x009b
                    goto L_0x00c0
                L_0x009b:
                    if (r4 == 0) goto L_0x00a9
                    hg.E$c r2 = new hg.E$c
                    ig.r$c$e r10 = (ig.r.c.e) r10
                    java.lang.String r10 = r10.a()
                    r2.<init>(r10)
                    goto L_0x00c2
                L_0x00a9:
                    ig.r$c$b r4 = ig.r.c.b.f74538a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r10, r4)
                    if (r4 != 0) goto L_0x00c2
                    ig.r$c$f r4 = ig.r.c.f.f74542a
                    boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r4)
                    if (r10 == 0) goto L_0x00ba
                    goto L_0x00c2
                L_0x00ba:
                    XH.t r10 = new XH.t
                    r10.<init>()
                    throw r10
                L_0x00c0:
                    hg.E$b r2 = hg.E.b.f73596a
                L_0x00c2:
                    r6.<init>(r5, r7, r2)
                    r2 = r6
                L_0x00c6:
                    r0.f74571d = r3
                    java.lang.Object r10 = r11.emit(r2, r0)
                    if (r10 != r1) goto L_0x00cf
                    return r1
                L_0x00cf:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.r.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar, r rVar) {
            this.f74566a = gVar;
            this.f74567b = rVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74566a.collect(new a(hVar, this.f74567b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LUr/a$b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {71}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super a.b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74573c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74574d;

        j(C17164e<? super j> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(eVar);
            jVar.f74574d = obj;
            return jVar;
        }

        public final Object invoke(C16533h<? super a.b> hVar, C17164e<? super C16807N> eVar) {
            return ((j) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74573c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74574d;
                this.f74574d = hVar;
                this.f74573c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74574d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lhg/q$d$a;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$7", f = "GetGooglePayButtonUiStateUseCase.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super q.d.a>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74575c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74576d;

        k(C17164e<? super k> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super q.d.a> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            k kVar = new k(eVar);
            kVar.f74576d = hVar;
            return kVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74575c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74576d;
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected error");
                qv.e eVar = qv.e.ERROR;
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
                        String a10 = C11818a.a((String) null, illegalStateException);
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
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ip.l f74578b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74579a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ip.l f74580b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$invoke$lambda$4$$inlined$map$1$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.r$l$a$a  reason: collision with other inner class name */
            public static final class C1341a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74581c;

                /* renamed from: d  reason: collision with root package name */
                int f74582d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74583e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1341a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74583e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74581c = obj;
                    this.f74582d |= Integer.MIN_VALUE;
                    return this.f74583e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, ip.l lVar) {
                this.f74579a = hVar;
                this.f74580b = lVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ig.r.l.a.C1341a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ig.r$l$a$a r0 = (ig.r.l.a.C1341a) r0
                    int r1 = r0.f74582d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74582d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.r$l$a$a r0 = new ig.r$l$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74581c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74582d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f74579a
                    sf.d r6 = (sf.C10243d) r6
                    ig.r$a r2 = new ig.r$a
                    ip.l r4 = r5.f74580b
                    r2.<init>(r4, r6)
                    r0.f74582d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.r.l.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar, ip.l lVar) {
            this.f74577a = gVar;
            this.f74578b = lVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74577a.collect(new a(hVar, this.f74578b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f74585b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74586a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f74587b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$performCreateCheckout$$inlined$map$1$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.r$m$a$a  reason: collision with other inner class name */
            public static final class C1342a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74588c;

                /* renamed from: d  reason: collision with root package name */
                int f74589d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74590e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1342a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74590e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74588c = obj;
                    this.f74589d |= Integer.MIN_VALUE;
                    return this.f74590e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, r rVar) {
                this.f74586a = hVar;
                this.f74587b = rVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r19, dI.C17164e r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof ig.r.m.a.C1342a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    ig.r$m$a$a r2 = (ig.r.m.a.C1342a) r2
                    int r3 = r2.f74589d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f74589d = r3
                    goto L_0x001c
                L_0x0017:
                    ig.r$m$a$a r2 = new ig.r$m$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f74588c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f74589d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x0130
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f74586a
                    r4 = r19
                    Vn.a$a r4 = (Vn.a.C1877a) r4
                    ig.r r6 = r0.f74587b
                    qv.e r13 = qv.e.DEBUG
                    qv.d r7 = qv.d.f102012a
                    java.util.List r7 = r7.a()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x0054:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L_0x006c
                    java.lang.Object r9 = r7.next()
                    r10 = r9
                    qv.b r10 = (qv.C11819b) r10
                    r11 = 0
                    boolean r10 = r10.b(r13, r11)
                    if (r10 == 0) goto L_0x0054
                    r8.add(r9)
                    goto L_0x0054
                L_0x006c:
                    java.util.Iterator r14 = r8.iterator()
                    r15 = 0
                    r7 = r15
                    r8 = r7
                L_0x0073:
                    boolean r9 = r14.hasNext()
                    if (r9 == 0) goto L_0x0102
                    java.lang.Object r9 = r14.next()
                    qv.b r9 = (qv.C11819b) r9
                    r11 = 0
                    if (r7 != 0) goto L_0x009e
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r10 = "Create checkout result: "
                    r7.append(r10)
                    r7.append(r4)
                    java.lang.String r7 = r7.toString()
                    java.lang.String r7 = qv.C11818a.a(r7, r11)
                    if (r7 != 0) goto L_0x009a
                    goto L_0x0102
                L_0x009a:
                    java.lang.String r7 = qv.C11820c.a(r7)
                L_0x009e:
                    r16 = r7
                    if (r8 != 0) goto L_0x00f0
                    java.lang.Class r7 = r6.getClass()
                    java.lang.String r7 = r7.getName()
                    kotlin.jvm.internal.C17542s.g(r7)
                    r8 = 36
                    r10 = 2
                    java.lang.String r8 = HJ.C15854t.s1(r7, r8, r15, r10, r15)
                    r12 = 46
                    java.lang.String r8 = HJ.C15854t.o1(r8, r12, r15, r10, r15)
                    int r10 = r8.length()
                    if (r10 != 0) goto L_0x00c1
                    goto L_0x00c7
                L_0x00c1:
                    java.lang.String r7 = "Kt"
                    java.lang.String r7 = HJ.C15854t.P0(r8, r7)
                L_0x00c7:
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    java.lang.String r8 = r8.getName()
                    java.lang.String r10 = "main"
                    boolean r8 = HJ.C15854t.b0(r8, r10, r5)
                    if (r8 == 0) goto L_0x00da
                    java.lang.String r8 = "m"
                    goto L_0x00dc
                L_0x00da:
                    java.lang.String r8 = "b"
                L_0x00dc:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r8)
                    java.lang.String r8 = "|"
                    r10.append(r8)
                    r10.append(r7)
                    java.lang.String r8 = r10.toString()
                L_0x00f0:
                    r17 = r8
                    r10 = 0
                    r7 = r9
                    r8 = r13
                    r9 = r17
                    r12 = r16
                    r7.a(r8, r9, r10, r11, r12)
                    r7 = r16
                    r8 = r17
                    goto L_0x0073
                L_0x0102:
                    boolean r6 = r4 instanceof Vn.a.C1877a.c
                    if (r6 == 0) goto L_0x0112
                    ig.r$c$e r6 = new ig.r$c$e
                    Vn.a$a$c r4 = (Vn.a.C1877a.c) r4
                    java.lang.String r4 = r4.a()
                    r6.<init>(r4)
                    goto L_0x0127
                L_0x0112:
                    Vn.a$a$a r6 = Vn.a.C1877a.C1878a.f88717a
                    boolean r6 = kotlin.jvm.internal.C17542s.e(r4, r6)
                    if (r6 == 0) goto L_0x011d
                    ig.r$c$a r6 = ig.r.c.a.f74537a
                    goto L_0x0127
                L_0x011d:
                    Vn.a$a$b r6 = Vn.a.C1877a.b.f88718a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
                    if (r4 == 0) goto L_0x0133
                    ig.r$c$c r6 = ig.r.c.C1338c.f74539a
                L_0x0127:
                    r2.f74589d = r5
                    java.lang.Object r1 = r1.emit(r6, r2)
                    if (r1 != r3) goto L_0x0130
                    return r3
                L_0x0130:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                L_0x0133:
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.r.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar, r rVar) {
            this.f74584a = gVar;
            this.f74585b = rVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74584a.collect(new a(hVar, this.f74585b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl", f = "GetGooglePayButtonUiStateUseCase.kt", l = {241}, m = "performCreateCheckout")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f74591c;

        /* renamed from: d  reason: collision with root package name */
        Object f74592d;

        /* renamed from: e  reason: collision with root package name */
        Object f74593e;

        /* renamed from: f  reason: collision with root package name */
        Object f74594f;

        /* renamed from: g  reason: collision with root package name */
        Object f74595g;

        /* renamed from: h  reason: collision with root package name */
        Object f74596h;

        /* renamed from: i  reason: collision with root package name */
        Object f74597i;

        /* renamed from: j  reason: collision with root package name */
        Object f74598j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f74599k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ r f74600l;

        /* renamed from: m  reason: collision with root package name */
        int f74601m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(r rVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f74600l = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f74599k = obj;
            this.f74601m |= Integer.MIN_VALUE;
            return this.f74600l.k((List<Ln.d>) null, (String) null, (String) null, (String) null, (Map<String, String>) null, (Un.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74602a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74603a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetGooglePayButtonUiStateUseCaseImpl$special$$inlined$map$1$2", f = "GetGooglePayButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.r$o$a$a  reason: collision with other inner class name */
            public static final class C1343a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74604c;

                /* renamed from: d  reason: collision with root package name */
                int f74605d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74606e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1343a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74606e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74604c = obj;
                    this.f74605d |= Integer.MIN_VALUE;
                    return this.f74606e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74603a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ig.r.o.a.C1343a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ig.r$o$a$a r0 = (ig.r.o.a.C1343a) r0
                    int r1 = r0.f74605d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74605d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.r$o$a$a r0 = new ig.r$o$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74604c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74605d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0061
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f74603a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r6 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r6
                    if (r6 == 0) goto L_0x003f
                    boolean r2 = r6.z()
                    goto L_0x0040
                L_0x003f:
                    r2 = r3
                L_0x0040:
                    r4 = 0
                    if (r6 == 0) goto L_0x004e
                    java.lang.Boolean r6 = r6.p()
                    if (r6 == 0) goto L_0x004e
                    boolean r6 = r6.booleanValue()
                    goto L_0x004f
                L_0x004e:
                    r6 = r4
                L_0x004f:
                    if (r2 == 0) goto L_0x0054
                    if (r6 == 0) goto L_0x0054
                    r4 = r3
                L_0x0054:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r0.f74605d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0061
                    return r1
                L_0x0061:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.r.o.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public o(C16532g gVar) {
            this.f74602a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74602a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public r(Ur.a aVar, Vn.a aVar2, C10253a aVar3, C14762d dVar, Ln.h hVar) {
        C17542s.j(aVar, "googlePayUseCase");
        C17542s.j(aVar2, "createCheckoutSelectDeliveryUseCase");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(dVar, "getProfileUseCase");
        C17542s.j(hVar, "cartRepository");
        this.f74527a = aVar;
        this.f74528b = aVar2;
        this.f74529c = dVar;
        this.f74530d = hVar;
        this.f74532f = new o(aVar3.I());
    }

    /* access modifiers changed from: private */
    public final C16532g<a.b> h(boolean z10, C16505B<C10243d> b10) {
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
                String a10 = C11818a.a("Google pay cart enabled: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = r.class.getName();
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
        return z10 ? this.f74527a.a(C16521S.a(Boolean.TRUE), new d(b10)) : C16521S.a(null);
    }

    /* access modifiers changed from: private */
    public final C16532g<ip.l<C9845a.C1326a, Throwable>> i(C16532g<? extends ip.l<C9845a.C1326a, Throwable>> gVar, a.b bVar) {
        String str;
        Class<r> cls;
        int i10;
        a.b bVar2 = bVar;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = r.class;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar3 = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Google pay state: " + bVar2, (Throwable) null);
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
            bVar3.a(eVar, str5, true, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (bVar2 instanceof a.b.C1860a) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("Google pay available, check item availability", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar4.a(eVar2, str7, false, (Throwable) null, str6);
                i10 = 2;
            }
            return gVar;
        } else if (C17542s.e(bVar2, a.b.c.f88441a) || C17542s.e(bVar2, a.b.C1863b.f88440a) || bVar2 == null) {
            return C16521S.a(null);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final Object j(ip.l<C9845a.C1326a, Throwable> lVar, C10243d dVar, C17164e<? super C16532g<? extends c>> eVar) {
        boolean z10;
        a.C1852a aVar;
        String str;
        ip.l<C9845a.C1326a, Throwable> lVar2 = lVar;
        boolean z11 = lVar2 instanceof l.c;
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<r> cls = r.class;
        String str3 = null;
        if (z11) {
            l.c cVar = (l.c) lVar2;
            Iterable b10 = ((C9845a.C1326a) cVar.a()).b();
            if (!(b10 instanceof Collection) || !((Collection) b10).isEmpty()) {
                Iterator it = b10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Ln.d dVar2 = (Ln.d) it.next();
                    if (C9794c.q(lVar2, true, dVar, dVar2.j(), dVar2.l())) {
                        z10 = false;
                        break;
                    }
                }
            }
            C10243d dVar3 = dVar;
            z10 = true;
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("Item availability, allItemsAvailable: " + z10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                }
                bVar.a(eVar2, str5, false, (Throwable) null, str4);
                str2 = str;
            }
            if (!z10) {
                return C16521S.a(c.b.f74538a);
            }
            List<Ln.d> b11 = ((C9845a.C1326a) cVar.a()).b();
            String d10 = ((C9845a.C1326a) cVar.a()).c().d();
            String c10 = ((C9845a.C1326a) cVar.a()).c().c();
            Map<String, String> b12 = ((C9845a.C1326a) cVar.a()).c().b();
            int i10 = b.f74535a[dVar.ordinal()];
            if (i10 == 1) {
                aVar = new a.b(true);
            } else if (i10 == 2) {
                C12832d d11 = ((C9845a.C1326a) cVar.a()).d();
                if (d11 != null) {
                    str3 = d11.e();
                }
                aVar = new a.C1852a(true, str3);
            } else {
                throw new t();
            }
            Object k10 = k(b11, d10, (String) null, c10, b12, aVar, eVar);
            return k10 == C17187b.f() ? k10 : (C16532g) k10;
        }
        String str6 = str2;
        if (lVar2 instanceof l.b) {
            return C16521S.a(c.d.f74540a);
        }
        if (lVar2 instanceof l.a) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a("Item availability error, disable express checkout button", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar3, str8, false, (Throwable) null, str7);
            }
            return C16521S.a(c.f.f74542a);
        } else if (lVar2 == null) {
            return C16521S.a(null);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.util.List<Ln.d> r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.Map<java.lang.String, java.lang.String> r29, Un.a r30, dI.C17164e<? super TJ.C16532g<? extends ig.r.c>> r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r31
            boolean r2 = r1 instanceof ig.r.n
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ig.r$n r2 = (ig.r.n) r2
            int r3 = r2.f74601m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f74601m = r3
            goto L_0x001c
        L_0x0017:
            ig.r$n r2 = new ig.r$n
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f74599k
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f74601m
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x005e
            if (r5 != r7) goto L_0x0056
            java.lang.Object r1 = r2.f74598j
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f74597i
            Un.a r1 = (Un.a) r1
            java.lang.Object r4 = r2.f74596h
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r2.f74595g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r2.f74594f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f74593e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f74592d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r2.f74591c
            ig.r r2 = (ig.r) r2
            XH.y.b(r3)
            r13 = r1
            r12 = r4
            r23 = r10
            r10 = r9
            r9 = r23
            goto L_0x008e
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            XH.y.b(r3)
            lD.d r3 = r0.f74529c
            r2.f74591c = r0
            r5 = r25
            r2.f74592d = r5
            r9 = r26
            r2.f74593e = r9
            r10 = r27
            r2.f74594f = r10
            r11 = r28
            r2.f74595g = r11
            r12 = r29
            r2.f74596h = r12
            r13 = r30
            r2.f74597i = r13
            r2.f74598j = r1
            r2.f74601m = r7
            java.lang.Object r3 = lD.C14762d.a.a(r3, r6, r2, r7, r8)
            if (r3 != r4) goto L_0x0088
            return r4
        L_0x0088:
            r2 = r0
            r23 = r11
            r11 = r5
            r5 = r23
        L_0x008e:
            kD.h r3 = (kD.h) r3
            if (r3 == 0) goto L_0x0097
            java.lang.String r1 = r3.c()
            goto L_0x0098
        L_0x0097:
            r1 = r8
        L_0x0098:
            Ln.h r3 = r2.f74530d
            TJ.P r3 = r3.m()
            java.lang.Object r3 = r3.getValue()
            Ln.g r3 = (Ln.g) r3
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r14 = 10
            int r14 = YH.C16877v.y(r11, r14)
            r4.<init>(r14)
            java.util.Iterator r11 = r11.iterator()
        L_0x00b5:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0128
            java.lang.Object r14 = r11.next()
            Ln.d r14 = (Ln.d) r14
            Nn.d$a r8 = new Nn.d$a
            java.lang.String r6 = r14.j()
            int r15 = r14.l()
            Ln.f r16 = r14.i()
            Ln.f$b r16 = r16.j()
            int[] r17 = ig.r.b.f74536b
            int r16 = r16.ordinal()
            r0 = r17[r16]
            if (r0 == r7) goto L_0x00e9
            r7 = 2
            if (r0 != r7) goto L_0x00e3
            java.lang.String r0 = "PIECE"
            goto L_0x00eb
        L_0x00e3:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00e9:
            java.lang.String r0 = "METER"
        L_0x00eb:
            Nn.d$a$b r7 = new Nn.d$a$b
            Ln.f r17 = r14.i()
            r26 = r11
            java.lang.String r11 = r17.i()
            Ln.f r17 = r14.i()
            r31 = r13
            java.lang.String r13 = r17.h()
            Ln.f r17 = r14.i()
            r29 = r12
            java.lang.String r12 = r17.g()
            Ln.f r14 = r14.i()
            java.lang.String r14 = r14.e()
            r7.<init>(r11, r13, r12, r14)
            r8.<init>(r6, r15, r0, r7)
            r4.add(r8)
            r0 = r24
            r11 = r26
            r12 = r29
            r13 = r31
            r6 = 0
            r7 = 1
            r8 = 0
            goto L_0x00b5
        L_0x0128:
            r29 = r12
            r31 = r13
            if (r3 == 0) goto L_0x0139
            Ln.c r0 = r3.a()
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = r0.a()
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r3 == 0) goto L_0x0147
            Ln.a r3 = r3.b()
            if (r3 == 0) goto L_0x0147
            boolean r3 = r3.a()
            goto L_0x0148
        L_0x0147:
            r3 = 0
        L_0x0148:
            Nn.d r6 = new Nn.d
            r6.<init>(r4, r0, r1, r3)
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0160:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0178
            java.lang.Object r4 = r1.next()
            r7 = r4
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r0, r8)
            if (r7 == 0) goto L_0x0160
            r3.add(r4)
            goto L_0x0160
        L_0x0178:
            java.util.Iterator r1 = r3.iterator()
            r3 = 0
            r4 = 0
        L_0x017e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01fe
            java.lang.Object r7 = r1.next()
            r17 = r7
            qv.b r17 = (qv.C11819b) r17
            r7 = 0
            if (r3 != 0) goto L_0x019c
            java.lang.String r3 = "Create checkout"
            java.lang.String r3 = qv.C11818a.a(r3, r7)
            if (r3 != 0) goto L_0x0198
            goto L_0x01fe
        L_0x0198:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x019c:
            if (r4 != 0) goto L_0x01ed
            java.lang.Class<ig.r> r4 = ig.r.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r8 = 36
            r11 = 0
            r12 = 2
            java.lang.String r8 = HJ.C15854t.s1(r4, r8, r11, r12, r11)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r11, r12, r11)
            int r13 = r8.length()
            if (r13 != 0) goto L_0x01bc
            goto L_0x01c2
        L_0x01bc:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r8, r4)
        L_0x01c2:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r13 = "main"
            r14 = 1
            boolean r8 = HJ.C15854t.b0(r8, r13, r14)
            if (r8 == 0) goto L_0x01d6
            java.lang.String r8 = "m"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r8 = "b"
        L_0x01d8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r8 = "|"
            r13.append(r8)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            goto L_0x01f0
        L_0x01ed:
            r11 = 0
            r12 = 2
            r14 = 1
        L_0x01f0:
            r20 = 0
            r18 = r0
            r19 = r4
            r21 = r7
            r22 = r3
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x017e
        L_0x01fe:
            Vn.a r0 = r2.f74528b
            r25 = r0
            r26 = r9
            r27 = r10
            r28 = r5
            r30 = r6
            TJ.g r0 = r25.a(r26, r27, r28, r29, r30, r31)
            ig.r$m r1 = new ig.r$m
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.r.k(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.Map, Un.a, dI.e):java.lang.Object");
    }

    public C16532g<q.d.a> a(C16532g<? extends ip.l<C9845a.C1326a, Throwable>> gVar, C16505B<C10243d> b10) {
        C17542s.j(gVar, "availabilityFlow");
        C17542s.j(b10, "deliveryType");
        return C16534i.s(C16534i.g(new i(C16534i.g0(C16534i.g0(C16534i.g0(C16534i.S(C16534i.g0(this.f74532f, new e((C17164e) null, this, b10)), new j((C17164e<? super j>) null)), new f((C17164e) null, this, gVar)), new g((C17164e) null, b10)), new h((C17164e) null, this)), this), new k((C17164e<? super k>) null)));
    }
}
