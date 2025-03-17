package ig;

import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import Ln.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Wk.b;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import ig.C9845a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import tf.C10253a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00160\u00152\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010/\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u00060"}, d2 = {"Lig/b;", "Lig/a;", "LLn/h;", "cartRepository", "LFB/a;", "localStoreSelectionRepository", "LWk/b;", "availabilityRepository", "Ltf/a;", "killSwitchRepository", "Lsf/c;", "appUserDataRepository", "<init>", "(LLn/h;LFB/a;LWk/b;Ltf/a;Lsf/c;)V", "", "LLn/d;", "items", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LEB/d;", "store", "LTJ/g;", "Lip/l;", "Lig/a$a;", "", "g", "(Ljava/util/List;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;LEB/d;LdI/e;)Ljava/lang/Object;", "", "h", "(Lip/l;)Ljava/lang/String;", "invoke", "()LTJ/g;", "a", "LWk/b;", "b", "Ltf/a;", "c", "LTJ/g;", "cartItemsFlow", "d", "postalCodeAddressFlow", "e", "selectedStoreFlow", "Lig/b$a;", "f", "availabilityInput", "Lig/a$a;", "currentAvailability", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ig.b  reason: case insensitive filesystem */
public final class C9846b implements C9845a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f74303a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C10253a f74304b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<List<Ln.d>> f74305c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<UserPostalCodeAddress> f74306d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<C12832d> f74307e;

    /* renamed from: f  reason: collision with root package name */
    private final C16532g<a> f74308f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C9845a.C1326a f74309g;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lig/b$a;", "", "", "LLn/d;", "items", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LEB/d;", "store", "<init>", "(Ljava/util/List;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;LEB/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "c", "LEB/d;", "()LEB/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<Ln.d> f74310a;

        /* renamed from: b  reason: collision with root package name */
        private final UserPostalCodeAddress f74311b;

        /* renamed from: c  reason: collision with root package name */
        private final C12832d f74312c;

        public a(List<Ln.d> list, UserPostalCodeAddress userPostalCodeAddress, C12832d dVar) {
            this.f74310a = list;
            this.f74311b = userPostalCodeAddress;
            this.f74312c = dVar;
        }

        public final List<Ln.d> a() {
            return this.f74310a;
        }

        public final UserPostalCodeAddress b() {
            return this.f74311b;
        }

        public final C12832d c() {
            return this.f74312c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74310a, aVar.f74310a) && C17542s.e(this.f74311b, aVar.f74311b) && C17542s.e(this.f74312c, aVar.f74312c);
        }

        public int hashCode() {
            List<Ln.d> list = this.f74310a;
            int i10 = 0;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            UserPostalCodeAddress userPostalCodeAddress = this.f74311b;
            int hashCode2 = (hashCode + (userPostalCodeAddress == null ? 0 : userPostalCodeAddress.hashCode())) * 31;
            C12832d dVar = this.f74312c;
            if (dVar != null) {
                i10 = dVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            List<Ln.d> list = this.f74310a;
            UserPostalCodeAddress userPostalCodeAddress = this.f74311b;
            C12832d dVar = this.f74312c;
            return "AvailabilityInput(items=" + list + ", postalCodeAddress=" + userPostalCodeAddress + ", store=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LEB/d;", "store", "", "LLn/d;", "items", "Lig/b$a;", "<anonymous>", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;LEB/d;Ljava/util/List;)Lig/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$availabilityInput$1", f = "GetCartItemAvailabilityUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ig.b$b  reason: collision with other inner class name */
    static final class C1327b extends l implements r<UserPostalCodeAddress, C12832d, List<? extends Ln.d>, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74313c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74314d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74315e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f74316f;

        C1327b(C17164e<? super C1327b> eVar) {
            super(4, eVar);
        }

        /* renamed from: i */
        public final Object l(UserPostalCodeAddress userPostalCodeAddress, C12832d dVar, List<Ln.d> list, C17164e<? super a> eVar) {
            C1327b bVar = new C1327b(eVar);
            bVar.f74314d = userPostalCodeAddress;
            bVar.f74315e = dVar;
            bVar.f74316f = list;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74313c == 0) {
                y.b(obj);
                return new a((List) this.f74316f, (UserPostalCodeAddress) this.f74314d, (C12832d) this.f74315e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lip/l;", "Lig/a$a;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$getAvailability$2", f = "GetCartItemAvailabilityUseCase.kt", l = {94, 101, 106, 110, 120, 136, 141}, m = "invokeSuspend")
    /* renamed from: ig.b$c */
    static final class c extends l implements p<C16533h<? super ip.l<C9845a.C1326a, Throwable>>, C17164e<? super C16807N>, Object> {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ List<Ln.d> f74317A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ UserPostalCodeAddress f74318B;

        /* renamed from: C  reason: collision with root package name */
        final /* synthetic */ C9846b f74319C;

        /* renamed from: D  reason: collision with root package name */
        final /* synthetic */ C12832d f74320D;

        /* renamed from: c  reason: collision with root package name */
        Object f74321c;

        /* renamed from: d  reason: collision with root package name */
        Object f74322d;

        /* renamed from: e  reason: collision with root package name */
        Object f74323e;

        /* renamed from: f  reason: collision with root package name */
        Object f74324f;

        /* renamed from: g  reason: collision with root package name */
        Object f74325g;

        /* renamed from: h  reason: collision with root package name */
        Object f74326h;

        /* renamed from: i  reason: collision with root package name */
        Object f74327i;

        /* renamed from: j  reason: collision with root package name */
        Object f74328j;

        /* renamed from: k  reason: collision with root package name */
        Object f74329k;

        /* renamed from: l  reason: collision with root package name */
        Object f74330l;

        /* renamed from: m  reason: collision with root package name */
        Object f74331m;

        /* renamed from: n  reason: collision with root package name */
        Object f74332n;

        /* renamed from: o  reason: collision with root package name */
        Object f74333o;

        /* renamed from: p  reason: collision with root package name */
        Object f74334p;

        /* renamed from: q  reason: collision with root package name */
        Object f74335q;

        /* renamed from: r  reason: collision with root package name */
        Object f74336r;

        /* renamed from: s  reason: collision with root package name */
        int f74337s;

        /* renamed from: t  reason: collision with root package name */
        int f74338t;

        /* renamed from: u  reason: collision with root package name */
        int f74339u;

        /* renamed from: v  reason: collision with root package name */
        int f74340v;

        /* renamed from: w  reason: collision with root package name */
        int f74341w;

        /* renamed from: x  reason: collision with root package name */
        int f74342x;

        /* renamed from: y  reason: collision with root package name */
        int f74343y;

        /* renamed from: z  reason: collision with root package name */
        private /* synthetic */ Object f74344z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List<Ln.d> list, UserPostalCodeAddress userPostalCodeAddress, C9846b bVar, C12832d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f74317A = list;
            this.f74318B = userPostalCodeAddress;
            this.f74319C = bVar;
            this.f74320D = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f74317A, this.f74318B, this.f74319C, this.f74320D, eVar);
            cVar.f74344z = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super ip.l<C9845a.C1326a, Throwable>> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0318, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0319, code lost:
            r10 = r2;
            r16 = r6;
            r11 = r15;
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x031f, code lost:
            r3 = XH.x.f139812b;
            r0 = XH.x.b(XH.y.a(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0329, code lost:
            r3 = r7.f74317A;
            r4 = r7.f74318B;
            r5 = r7.f74320D;
            r6 = r7.f74319C;
            r10 = XH.x.e(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0335, code lost:
            if (r10 != null) goto L_0x046e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0337, code lost:
            r10 = (java.util.List) r0;
            r11 = qv.e.DEBUG;
            r15 = new java.util.ArrayList();
            r16 = qv.d.f102012a.a().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0351, code lost:
            if (r16.hasNext() != false) goto L_0x0353;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0353, code lost:
            r24 = r8;
            r8 = r16.next();
            r32 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0362, code lost:
            if (((qv.C11819b) r8).b(r11, r14) != false) goto L_0x0364;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0364, code lost:
            r15.add(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
            r0 = r32;
            r8 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x036c, code lost:
            r32 = r0;
            r24 = r8;
            r0 = r15.iterator();
            r16 = r15;
            r8 = null;
            r14 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x037c, code lost:
            if (r0.hasNext() != false) goto L_0x037e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x037e, code lost:
            r26 = r0.next();
            r16 = r26;
            r27 = r0;
            r28 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x038b, code lost:
            if (r8 == null) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x038d, code lost:
            r15 = qv.C11818a.a("Availability fetched", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0393, code lost:
            if (r15 == null) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0395, code lost:
            r29 = r1;
            r30 = r2;
            r0 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00bd, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x039d, code lost:
            r8 = qv.C11820c.a(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x03a1, code lost:
            if (r14 == null) goto L_0x03a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a3, code lost:
            r14 = r2.getClass().getName();
            kotlin.jvm.internal.C17542s.g(r14);
            r29 = r1;
            r30 = r2;
            r0 = HJ.C15854t.o1(HJ.C15854t.s1(r14, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c4, code lost:
            if (r0.length() != 0) goto L_0x03c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x03c7, code lost:
            r14 = HJ.C15854t.P0(r0, "Kt");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x03d8, code lost:
            if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME, true) != false) goto L_0x03da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x03da, code lost:
            r0 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x03dd, code lost:
            r0 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x03df, code lost:
            r14 = r0 + com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR + r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00be, code lost:
            r14 = false;
            r25 = r10;
            r23 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x03f3, code lost:
            r29 = r1;
            r30 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x03f8, code lost:
            r16.a(r11, r14, false, (java.lang.Throwable) null, r8);
            r16 = r26;
            r0 = r27;
            r15 = r28;
            r1 = r29;
            r2 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0412, code lost:
            r27 = r0;
            r29 = r1;
            r30 = r2;
            r28 = r15;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x041c, code lost:
            r1 = new ig.C9845a.C1326a(r3, r10, r4, r5);
            ig.C9846b.f(r6, r1);
            r2 = new ip.l.c(r1);
            r15 = r30;
            r7.f74344z = r15;
            r7.f74321c = r29;
            r7.f74322d = r32;
            r7.f74323e = r3;
            r7.f74324f = r4;
            r7.f74325g = r5;
            r7.f74326h = r6;
            r7.f74327i = r6;
            r7.f74328j = r10;
            r7.f74329k = r1;
            r7.f74330l = r15;
            r7.f74331m = r11;
            r7.f74332n = r8;
            r7.f74333o = r14;
            r7.f74334p = r28;
            r7.f74335q = r27;
            r7.f74336r = r0;
            r7.f74337s = 0;
            r7.f74338t = 0;
            r7.f74339u = 0;
            r7.f74340v = 0;
            r7.f74341w = 0;
            r7.f74342x = 0;
            r7.f74343y = 6;
            r0 = r15.emit(r2, r7);
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x046b, code lost:
            if (r0 == r2) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x046d, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x046e, code lost:
            r15 = r2;
            r2 = r8;
            r8 = r1;
            r11 = qv.e.WARN;
            r1 = new java.util.ArrayList();
            r14 = qv.d.f102012a.a().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0489, code lost:
            if (r14.hasNext() != false) goto L_0x048b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x048b, code lost:
            r24 = r2;
            r2 = r14.next();
            r32 = r14;
            r26 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c7, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x049d, code lost:
            if (((qv.C11819b) r2).b(r11, false) != false) goto L_0x049f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x049f, code lost:
            r1.add(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x04a2, code lost:
            r14 = r32;
            r2 = r24;
            r5 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a9, code lost:
            r24 = r2;
            r26 = r5;
            r2 = r1.iterator();
            r16 = r1;
            r5 = null;
            r14 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x04b9, code lost:
            if (r2.hasNext() != false) goto L_0x04bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x04bb, code lost:
            r27 = r2.next();
            r16 = r27;
            r32 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x04c5, code lost:
            if (r5 == null) goto L_0x04c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c7, code lost:
            r2 = qv.C11818a.a("Unable to fetch availability", r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x04cd, code lost:
            if (r2 == null) goto L_0x04cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x04cf, code lost:
            r28 = r1;
            r30 = r3;
            r29 = r4;
            r1 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x04da, code lost:
            r5 = qv.C11820c.a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x04df, code lost:
            if (r14 == null) goto L_0x04e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x04e1, code lost:
            r2 = r15.getClass().getName();
            kotlin.jvm.internal.C17542s.g(r2);
            r28 = r1;
            r30 = r3;
            r29 = r4;
            r3 = HJ.C15854t.o1(HJ.C15854t.s1(r2, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0504, code lost:
            if (r3.length() != 0) goto L_0x0507;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0507, code lost:
            r2 = HJ.C15854t.P0(r3, "Kt");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0518, code lost:
            if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME, true) != false) goto L_0x051a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x051a, code lost:
            r1 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d5, code lost:
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x051d, code lost:
            r1 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x051f, code lost:
            r14 = r1 + com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR + r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0533, code lost:
            r28 = r1;
            r30 = r3;
            r29 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0539, code lost:
            r16.a(r11, r14, false, r10, r5);
            r2 = r32;
            r16 = r27;
            r1 = r28;
            r4 = r29;
            r3 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0552, code lost:
            r28 = r1;
            r32 = r2;
            r30 = r3;
            r29 = r4;
            r1 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x055e, code lost:
            ig.C9846b.f(r6, (ig.C9845a.C1326a) null);
            r2 = new ip.l.a(r10);
            r7.f74344z = r15;
            r7.f74321c = r8;
            r7.f74322d = r0;
            r7.f74323e = r30;
            r7.f74324f = r29;
            r7.f74325g = r26;
            r7.f74326h = r6;
            r7.f74327i = r6;
            r7.f74328j = r10;
            r7.f74329k = r15;
            r7.f74330l = r15;
            r7.f74331m = r11;
            r7.f74332n = r5;
            r7.f74333o = r14;
            r7.f74334p = r28;
            r7.f74335q = r32;
            r7.f74336r = r1;
            r7.f74337s = 0;
            r7.f74338t = 0;
            r7.f74339u = 0;
            r7.f74340v = 0;
            r7.f74341w = 0;
            r7.f74342x = 0;
            r7.f74343y = 7;
            r1 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x05a8, code lost:
            if (r15.emit(r2, r7) == r1) goto L_0x05aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x05aa, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x05ad, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x05ae, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0689, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x076a, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x017a, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0194, code lost:
            r0 = r7.f74317A;
            r2 = new java.util.ArrayList(YH.C16877v.y(r0, 10));
            r0 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01ab, code lost:
            if (r0.hasNext() == false) goto L_0x01bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ad, code lost:
            r2.add(((Ln.d) r0.next()).j());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01bb, code lost:
            r0 = qv.e.DEBUG;
            r14 = new java.util.ArrayList();
            r1 = qv.d.f102012a.a().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d2, code lost:
            if (r1.hasNext() == false) goto L_0x01e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d4, code lost:
            r3 = r1.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01df, code lost:
            if (((qv.C11819b) r3).b(r0, false) == false) goto L_0x01e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e1, code lost:
            r14.add(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e6, code lost:
            r1 = r14.iterator();
            r17 = r14;
            r3 = null;
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f2, code lost:
            if (r1.hasNext() == false) goto L_0x0295;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f4, code lost:
            r24 = r1.next();
            r17 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x01fc, code lost:
            if (r3 != null) goto L_0x0229;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01fe, code lost:
            r15 = r2.size();
            r4 = new java.lang.StringBuilder();
            r25 = r10;
            r4.append("Fetch availability, number of items: ");
            r4.append(r15);
            r4 = qv.C11818a.a(r4.toString(), (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x021a, code lost:
            if (r4 != null) goto L_0x0224;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x021c, code lost:
            r23 = r11;
            r0 = r24;
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0224, code lost:
            r3 = qv.C11820c.a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0229, code lost:
            r25 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x022b, code lost:
            if (r5 != null) goto L_0x027a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x022d, code lost:
            r4 = r6.getClass().getName();
            kotlin.jvm.internal.C17542s.g(r4);
            r23 = r11;
            r11 = HJ.C15854t.o1(HJ.C15854t.s1(r4, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x024c, code lost:
            if (r11.length() != 0) goto L_0x024f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x024f, code lost:
            r4 = HJ.C15854t.P0(r11, "Kt");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0260, code lost:
            if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME, true) == false) goto L_0x0265;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0262, code lost:
            r5 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0265, code lost:
            r5 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0267, code lost:
            r5 = r5 + com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR + r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x027a, code lost:
            r23 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0060, code lost:
            r0 = (ig.C9846b) r7.f74327i;
            r0 = (ig.C9846b) r7.f74326h;
            r0 = (EB.C12832d) r7.f74325g;
            r0 = (com.ingka.ikea.app.base.UserPostalCodeAddress) r7.f74324f;
            r0 = (java.util.List) r7.f74323e;
            r0 = (java.util.List) r7.f74321c;
            r0 = (TJ.C16533h) r7.f74344z;
            XH.y.b(r32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x027e, code lost:
            r17.a(r0, r5, false, (java.lang.Throwable) null, r3);
            r11 = r23;
            r17 = r24;
            r10 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0295, code lost:
            r25 = r10;
            r23 = r11;
            r15 = null;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x029d, code lost:
            r4 = r7.f74319C;
            r10 = r7.f74318B;
            r11 = r7.f74320D;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r17 = XH.x.f139812b;
            r17 = ig.C9846b.b(r4);
            r18 = r10.d();
            r19 = r10.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b1, code lost:
            if (r11 == null) goto L_0x02c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r20 = r11.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x02b8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x02b9, code lost:
            r1 = r2;
            r2 = r6;
            r11 = r15;
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x02c0, code lost:
            r20 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            r7.f74344z = r6;
            r7.f74321c = r2;
            r7.f74322d = r6;
            r7.f74323e = r4;
            r7.f74324f = r10;
            r7.f74325g = r11;
            r7.f74326h = r6;
            r7.f74327i = r3;
            r7.f74328j = r5;
            r7.f74329k = r14;
            r7.f74330l = r1;
            r7.f74331m = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            r7.f74337s = 0;
            r7.f74338t = 0;
            r7.f74339u = 0;
            r7.f74340v = 0;
            r7.f74341w = 0;
            r7.f74343y = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e8, code lost:
            r10 = r2;
            r11 = r15;
            r14 = false;
            r16 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            r0 = r17.b(r2, r18, r19, r20, r31);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02fc, code lost:
            if (r0 != r8) goto L_0x02ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x02fe, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x02ff, code lost:
            r1 = r10;
            r2 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r0 = XH.x.b((java.util.List) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0309, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x030b, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x030c, code lost:
            r1 = r10;
            r2 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0310, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0311, code lost:
            r10 = r2;
            r14 = false;
            r16 = r6;
            r11 = r15;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x00af, B:81:0x02c2] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0337  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x046e  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00c7 A[ExcHandler: CancellationException (r0v105 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:81:0x02c2] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0686 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x0767 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                r31 = this;
                r7 = r31
                java.lang.Object r8 = eI.C17187b.f()
                int r0 = r7.f74343y
                java.lang.String r9 = "|"
                java.lang.String r10 = "b"
                java.lang.String r11 = "m"
                java.lang.String r12 = "main"
                java.lang.String r13 = "Kt"
                r4 = 0
                r3 = 0
                switch(r0) {
                    case 0: goto L_0x012f;
                    case 1: goto L_0x010a;
                    case 2: goto L_0x00e5;
                    case 3: goto L_0x00d8;
                    case 4: goto L_0x00ca;
                    case 5: goto L_0x0081;
                    case 6: goto L_0x0040;
                    case 7: goto L_0x001f;
                    default: goto L_0x0017;
                }
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r7.f74335q
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r7.f74334p
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r7.f74333o
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74332n
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74331m
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r7.f74330l
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74329k
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74328j
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                goto L_0x0060
            L_0x0040:
                java.lang.Object r0 = r7.f74335q
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r7.f74334p
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r7.f74333o
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74332n
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74331m
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r7.f74330l
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74329k
                ig.a$a r0 = (ig.C9845a.C1326a) r0
                java.lang.Object r0 = r7.f74328j
                java.util.List r0 = (java.util.List) r0
            L_0x0060:
                java.lang.Object r0 = r7.f74327i
                ig.b r0 = (ig.C9846b) r0
                java.lang.Object r0 = r7.f74326h
                ig.b r0 = (ig.C9846b) r0
                java.lang.Object r0 = r7.f74325g
                EB.d r0 = (EB.C12832d) r0
                java.lang.Object r0 = r7.f74324f
                com.ingka.ikea.app.base.UserPostalCodeAddress r0 = (com.ingka.ikea.app.base.UserPostalCodeAddress) r0
                java.lang.Object r0 = r7.f74323e
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r7.f74321c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r32)
                goto L_0x05ab
            L_0x0081:
                java.lang.Object r0 = r7.f74330l
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r7.f74329k
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r7.f74328j
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74327i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74326h
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74325g
                EB.d r0 = (EB.C12832d) r0
                java.lang.Object r0 = r7.f74324f
                com.ingka.ikea.app.base.UserPostalCodeAddress r0 = (com.ingka.ikea.app.base.UserPostalCodeAddress) r0
                java.lang.Object r0 = r7.f74323e
                ig.b r0 = (ig.C9846b) r0
                java.lang.Object r0 = r7.f74322d
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74321c
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r0 = r7.f74344z
                r2 = r0
                TJ.h r2 = (TJ.C16533h) r2
                XH.y.b(r32)     // Catch:{ CancellationException -> 0x00c7, all -> 0x00bd }
                r0 = r32
                r14 = r4
                r25 = r10
                r23 = r11
                r15 = 2
                r11 = r3
                goto L_0x0302
            L_0x00bd:
                r0 = move-exception
                r14 = r4
                r25 = r10
                r23 = r11
                r15 = 2
                r11 = r3
                goto L_0x031f
            L_0x00c7:
                r0 = move-exception
                goto L_0x05ae
            L_0x00ca:
                java.lang.Object r0 = r7.f74321c
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r32)
            L_0x00d5:
                r6 = r0
                goto L_0x0194
            L_0x00d8:
                java.lang.Object r0 = r7.f74321c
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r32)
                goto L_0x0178
            L_0x00e5:
                java.lang.Object r0 = r7.f74327i
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r7.f74326h
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r7.f74325g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74324f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74323e
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r7.f74322d
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74321c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r32)
                goto L_0x0687
            L_0x010a:
                java.lang.Object r0 = r7.f74327i
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r7.f74326h
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r7.f74325g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74324f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.f74323e
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r7.f74322d
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74321c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r32)
                goto L_0x0768
            L_0x012f:
                XH.y.b(r32)
                java.lang.Object r0 = r7.f74344z
                TJ.h r0 = (TJ.C16533h) r0
                java.util.List<Ln.d> r1 = r7.f74317A
                java.util.Collection r1 = (java.util.Collection) r1
                if (r1 == 0) goto L_0x0142
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L_0x0149
            L_0x0142:
                r1 = r8
                r25 = r10
                r23 = r11
                goto L_0x068a
            L_0x0149:
                com.ingka.ikea.app.base.UserPostalCodeAddress r2 = r7.f74318B
                if (r2 == 0) goto L_0x0157
                java.lang.String r2 = r2.d()
                int r2 = r2.length()
                if (r2 != 0) goto L_0x015e
            L_0x0157:
                r1 = r8
                r25 = r10
                r23 = r11
                goto L_0x05af
            L_0x015e:
                ig.b r2 = r7.f74319C
                tf.a r2 = r2.f74304b
                boolean r2 = r2.v()
                if (r2 != 0) goto L_0x017b
                r7.f74344z = r0
                r7.f74321c = r1
                r1 = 3
                r7.f74343y = r1
                java.lang.Object r0 = r0.emit(r3, r7)
                if (r0 != r8) goto L_0x0178
                return r8
            L_0x0178:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x017b:
                ip.l$b r2 = new ip.l$b
                ig.b r6 = r7.f74319C
                ig.a$a r6 = r6.f74309g
                r2.<init>(r6)
                r7.f74344z = r0
                r7.f74321c = r1
                r1 = 4
                r7.f74343y = r1
                java.lang.Object r1 = r0.emit(r2, r7)
                if (r1 != r8) goto L_0x00d5
                return r8
            L_0x0194:
                java.util.List<Ln.d> r0 = r7.f74317A
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r1 = 10
                int r1 = YH.C16877v.y(r0, r1)
                r2.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x01a7:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01bb
                java.lang.Object r1 = r0.next()
                Ln.d r1 = (Ln.d) r1
                java.lang.String r1 = r1.j()
                r2.add(r1)
                goto L_0x01a7
            L_0x01bb:
                qv.e r0 = qv.e.DEBUG
                qv.d r1 = qv.d.f102012a
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x01ce:
                boolean r17 = r1.hasNext()
                if (r17 == 0) goto L_0x01e6
                java.lang.Object r3 = r1.next()
                r5 = r3
                qv.b r5 = (qv.C11819b) r5
                boolean r5 = r5.b(r0, r4)
                if (r5 == 0) goto L_0x01e4
                r14.add(r3)
            L_0x01e4:
                r3 = 0
                goto L_0x01ce
            L_0x01e6:
                java.util.Iterator r1 = r14.iterator()
                r17 = r14
                r3 = 0
                r5 = 0
            L_0x01ee:
                boolean r18 = r1.hasNext()
                if (r18 == 0) goto L_0x0295
                java.lang.Object r24 = r1.next()
                r17 = r24
                qv.b r17 = (qv.C11819b) r17
                if (r3 != 0) goto L_0x0229
                int r15 = r2.size()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r25 = r10
                java.lang.String r10 = "Fetch availability, number of items: "
                r4.append(r10)
                r4.append(r15)
                java.lang.String r4 = r4.toString()
                r10 = 0
                java.lang.String r4 = qv.C11818a.a(r4, r10)
                if (r4 != 0) goto L_0x0224
                r23 = r11
                r0 = r24
                r11 = 1
                r15 = 0
                goto L_0x029d
            L_0x0224:
                java.lang.String r3 = qv.C11820c.a(r4)
                goto L_0x022b
            L_0x0229:
                r25 = r10
            L_0x022b:
                if (r5 != 0) goto L_0x027a
                java.lang.Class r4 = r6.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r23 = r11
                r5 = 36
                r10 = 2
                r15 = 0
                java.lang.String r11 = HJ.C15854t.s1(r4, r5, r15, r10, r15)
                r5 = 46
                java.lang.String r11 = HJ.C15854t.o1(r11, r5, r15, r10, r15)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x024f
                goto L_0x0253
            L_0x024f:
                java.lang.String r4 = HJ.C15854t.P0(r11, r13)
            L_0x0253:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                r11 = 1
                boolean r5 = HJ.C15854t.b0(r5, r12, r11)
                if (r5 == 0) goto L_0x0265
                r5 = r23
                goto L_0x0267
            L_0x0265:
                r5 = r25
            L_0x0267:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r5)
                r10.append(r9)
                r10.append(r4)
                java.lang.String r5 = r10.toString()
                goto L_0x027e
            L_0x027a:
                r23 = r11
                r11 = 1
                r15 = 0
            L_0x027e:
                r20 = 0
                r18 = r0
                r19 = r5
                r4 = 0
                r21 = r4
                r22 = r3
                r17.a(r18, r19, r20, r21, r22)
                r11 = r23
                r17 = r24
                r10 = r25
                r4 = 0
                goto L_0x01ee
            L_0x0295:
                r25 = r10
                r23 = r11
                r11 = 1
                r15 = 0
                r0 = r17
            L_0x029d:
                ig.b r4 = r7.f74319C
                com.ingka.ikea.app.base.UserPostalCodeAddress r10 = r7.f74318B
                EB.d r11 = r7.f74320D
                XH.x$a r17 = XH.x.f139812b     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                Wk.b r17 = r4.f74303a     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                java.lang.String r18 = r10.d()     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                java.lang.String r19 = r10.c()     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                if (r11 == 0) goto L_0x02c0
                java.lang.String r20 = r11.e()     // Catch:{ CancellationException -> 0x00c7, all -> 0x02b8 }
                goto L_0x02c2
            L_0x02b8:
                r0 = move-exception
                r1 = r2
                r2 = r6
                r11 = r15
                r14 = 0
                r15 = 2
                goto L_0x031f
            L_0x02c0:
                r20 = r15
            L_0x02c2:
                r7.f74344z = r6     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74321c = r2     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74322d = r6     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74323e = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74324f = r10     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74325g = r11     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74326h = r6     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74327i = r3     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74328j = r5     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74329k = r14     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74330l = r1     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r7.f74331m = r0     // Catch:{ CancellationException -> 0x00c7, all -> 0x0318 }
                r4 = 0
                r7.f74337s = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r7.f74338t = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r7.f74339u = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r7.f74340v = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r7.f74341w = r4     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r0 = 5
                r7.f74343y = r0     // Catch:{ CancellationException -> 0x00c7, all -> 0x0310 }
                r1 = r17
                r10 = r2
                r11 = r15
                r3 = r18
                r14 = r4
                r4 = r19
                r15 = 2
                r5 = r20
                r16 = r6
                r6 = r31
                java.lang.Object r0 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ CancellationException -> 0x00c7, all -> 0x030b }
                if (r0 != r8) goto L_0x02ff
                return r8
            L_0x02ff:
                r1 = r10
                r2 = r16
            L_0x0302:
                java.util.List r0 = (java.util.List) r0     // Catch:{ CancellationException -> 0x00c7, all -> 0x0309 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x00c7, all -> 0x0309 }
                goto L_0x0329
            L_0x0309:
                r0 = move-exception
                goto L_0x031f
            L_0x030b:
                r0 = move-exception
            L_0x030c:
                r1 = r10
                r2 = r16
                goto L_0x031f
            L_0x0310:
                r0 = move-exception
                r10 = r2
                r14 = r4
                r16 = r6
                r11 = r15
            L_0x0316:
                r15 = 2
                goto L_0x030c
            L_0x0318:
                r0 = move-exception
                r10 = r2
                r16 = r6
                r11 = r15
                r14 = 0
                goto L_0x0316
            L_0x031f:
                XH.x$a r3 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0329:
                java.util.List<Ln.d> r3 = r7.f74317A
                com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r7.f74318B
                EB.d r5 = r7.f74320D
                ig.b r6 = r7.f74319C
                java.lang.Throwable r10 = XH.x.e(r0)
                if (r10 != 0) goto L_0x046e
                r10 = r0
                java.util.List r10 = (java.util.List) r10
                qv.e r11 = qv.e.DEBUG
                qv.d r16 = qv.d.f102012a
                java.util.List r16 = r16.a()
                java.lang.Iterable r16 = (java.lang.Iterable) r16
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Iterator r16 = r16.iterator()
            L_0x034d:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x036c
                r24 = r8
                java.lang.Object r8 = r16.next()
                r32 = r0
                r0 = r8
                qv.b r0 = (qv.C11819b) r0
                boolean r0 = r0.b(r11, r14)
                if (r0 == 0) goto L_0x0367
                r15.add(r8)
            L_0x0367:
                r0 = r32
                r8 = r24
                goto L_0x034d
            L_0x036c:
                r32 = r0
                r24 = r8
                java.util.Iterator r0 = r15.iterator()
                r16 = r15
                r8 = 0
                r14 = 0
            L_0x0378:
                boolean r17 = r0.hasNext()
                if (r17 == 0) goto L_0x0412
                java.lang.Object r26 = r0.next()
                r16 = r26
                qv.b r16 = (qv.C11819b) r16
                r27 = r0
                r0 = 0
                r28 = r15
                if (r8 != 0) goto L_0x03a1
                java.lang.String r15 = "Availability fetched"
                java.lang.String r15 = qv.C11818a.a(r15, r0)
                if (r15 != 0) goto L_0x039d
                r29 = r1
                r30 = r2
                r0 = r26
                goto L_0x041c
            L_0x039d:
                java.lang.String r8 = qv.C11820c.a(r15)
            L_0x03a1:
                if (r14 != 0) goto L_0x03f3
                java.lang.Class r14 = r2.getClass()
                java.lang.String r14 = r14.getName()
                kotlin.jvm.internal.C17542s.g(r14)
                r29 = r1
                r30 = r2
                r1 = 2
                r2 = 0
                r15 = 36
                java.lang.String r0 = HJ.C15854t.s1(r14, r15, r2, r1, r2)
                r15 = 46
                java.lang.String r0 = HJ.C15854t.o1(r0, r15, r2, r1, r2)
                int r1 = r0.length()
                if (r1 != 0) goto L_0x03c7
                goto L_0x03cb
            L_0x03c7:
                java.lang.String r14 = HJ.C15854t.P0(r0, r13)
            L_0x03cb:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r0 = r0.getName()
                r1 = 1
                boolean r0 = HJ.C15854t.b0(r0, r12, r1)
                if (r0 == 0) goto L_0x03dd
                r0 = r23
                goto L_0x03df
            L_0x03dd:
                r0 = r25
            L_0x03df:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r9)
                r2.append(r14)
                java.lang.String r0 = r2.toString()
                r14 = r0
                goto L_0x03f8
            L_0x03f3:
                r29 = r1
                r30 = r2
                r1 = 1
            L_0x03f8:
                r19 = 0
                r17 = r11
                r18 = r14
                r0 = 0
                r20 = r0
                r21 = r8
                r16.a(r17, r18, r19, r20, r21)
                r16 = r26
                r0 = r27
                r15 = r28
                r1 = r29
                r2 = r30
                goto L_0x0378
            L_0x0412:
                r27 = r0
                r29 = r1
                r30 = r2
                r28 = r15
                r0 = r16
            L_0x041c:
                ig.a$a r1 = new ig.a$a
                r1.<init>(r3, r10, r4, r5)
                r6.f74309g = r1
                ip.l$c r2 = new ip.l$c
                r2.<init>(r1)
                r15 = r30
                r7.f74344z = r15
                r9 = r29
                r7.f74321c = r9
                r9 = r32
                r7.f74322d = r9
                r7.f74323e = r3
                r7.f74324f = r4
                r7.f74325g = r5
                r7.f74326h = r6
                r7.f74327i = r6
                r7.f74328j = r10
                r7.f74329k = r1
                r7.f74330l = r15
                r7.f74331m = r11
                r7.f74332n = r8
                r7.f74333o = r14
                r1 = r28
                r7.f74334p = r1
                r1 = r27
                r7.f74335q = r1
                r7.f74336r = r0
                r1 = 0
                r7.f74337s = r1
                r7.f74338t = r1
                r7.f74339u = r1
                r7.f74340v = r1
                r7.f74341w = r1
                r7.f74342x = r1
                r0 = 6
                r7.f74343y = r0
                java.lang.Object r0 = r15.emit(r2, r7)
                r2 = r24
                if (r0 != r2) goto L_0x05ab
                return r2
            L_0x046e:
                r15 = r2
                r2 = r8
                r8 = r1
                r1 = 1
                qv.e r11 = qv.e.WARN
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0485:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x04a9
                r24 = r2
                java.lang.Object r2 = r14.next()
                r32 = r14
                r14 = r2
                qv.b r14 = (qv.C11819b) r14
                r26 = r5
                r5 = 0
                boolean r14 = r14.b(r11, r5)
                if (r14 == 0) goto L_0x04a2
                r1.add(r2)
            L_0x04a2:
                r14 = r32
                r2 = r24
                r5 = r26
                goto L_0x0485
            L_0x04a9:
                r24 = r2
                r26 = r5
                java.util.Iterator r2 = r1.iterator()
                r16 = r1
                r5 = 0
                r14 = 0
            L_0x04b5:
                boolean r17 = r2.hasNext()
                if (r17 == 0) goto L_0x0552
                java.lang.Object r27 = r2.next()
                r16 = r27
                qv.b r16 = (qv.C11819b) r16
                r32 = r2
                if (r5 != 0) goto L_0x04df
                java.lang.String r2 = "Unable to fetch availability"
                java.lang.String r2 = qv.C11818a.a(r2, r10)
                if (r2 != 0) goto L_0x04da
                r28 = r1
                r30 = r3
                r29 = r4
                r1 = r27
            L_0x04d7:
                r2 = 0
                goto L_0x055e
            L_0x04da:
                java.lang.String r2 = qv.C11820c.a(r2)
                r5 = r2
            L_0x04df:
                if (r14 != 0) goto L_0x0533
                java.lang.Class r2 = r15.getClass()
                java.lang.String r2 = r2.getName()
                kotlin.jvm.internal.C17542s.g(r2)
                r28 = r1
                r30 = r3
                r29 = r4
                r1 = 2
                r4 = 0
                r14 = 36
                java.lang.String r3 = HJ.C15854t.s1(r2, r14, r4, r1, r4)
                r14 = 46
                java.lang.String r3 = HJ.C15854t.o1(r3, r14, r4, r1, r4)
                int r1 = r3.length()
                if (r1 != 0) goto L_0x0507
                goto L_0x050b
            L_0x0507:
                java.lang.String r2 = HJ.C15854t.P0(r3, r13)
            L_0x050b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                r3 = 1
                boolean r1 = HJ.C15854t.b0(r1, r12, r3)
                if (r1 == 0) goto L_0x051d
                r1 = r23
                goto L_0x051f
            L_0x051d:
                r1 = r25
            L_0x051f:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r9)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                r14 = r1
                goto L_0x0539
            L_0x0533:
                r28 = r1
                r30 = r3
                r29 = r4
            L_0x0539:
                r19 = 0
                r17 = r11
                r18 = r14
                r20 = r10
                r21 = r5
                r16.a(r17, r18, r19, r20, r21)
                r2 = r32
                r16 = r27
                r1 = r28
                r4 = r29
                r3 = r30
                goto L_0x04b5
            L_0x0552:
                r28 = r1
                r32 = r2
                r30 = r3
                r29 = r4
                r1 = r16
                goto L_0x04d7
            L_0x055e:
                r6.f74309g = r2
                ip.l$a r2 = new ip.l$a
                r2.<init>(r10)
                r7.f74344z = r15
                r7.f74321c = r8
                r7.f74322d = r0
                r0 = r30
                r7.f74323e = r0
                r0 = r29
                r7.f74324f = r0
                r0 = r26
                r7.f74325g = r0
                r7.f74326h = r6
                r7.f74327i = r6
                r7.f74328j = r10
                r7.f74329k = r15
                r7.f74330l = r15
                r7.f74331m = r11
                r7.f74332n = r5
                r7.f74333o = r14
                r0 = r28
                r7.f74334p = r0
                r0 = r32
                r7.f74335q = r0
                r7.f74336r = r1
                r1 = 0
                r7.f74337s = r1
                r7.f74338t = r1
                r7.f74339u = r1
                r7.f74340v = r1
                r7.f74341w = r1
                r7.f74342x = r1
                r0 = 7
                r7.f74343y = r0
                java.lang.Object r0 = r15.emit(r2, r7)
                r1 = r24
                if (r0 != r1) goto L_0x05ab
                return r1
            L_0x05ab:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x05ae:
                throw r0
            L_0x05af:
                qv.e r2 = qv.e.DEBUG
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x05c2:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x05da
                java.lang.Object r5 = r3.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                boolean r6 = r6.b(r2, r8)
                if (r6 == 0) goto L_0x05c2
                r4.add(r5)
                goto L_0x05c2
            L_0x05da:
                java.util.Iterator r3 = r4.iterator()
                r8 = r4
                r5 = 0
                r6 = 0
            L_0x05e1:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x065f
                java.lang.Object r8 = r3.next()
                r14 = r8
                qv.b r14 = (qv.C11819b) r14
                r10 = 0
                if (r5 != 0) goto L_0x05fe
                java.lang.String r11 = "No postal code, don't fetch availability"
                java.lang.String r11 = qv.C11818a.a(r11, r10)
                if (r11 != 0) goto L_0x05fa
                goto L_0x065f
            L_0x05fa:
                java.lang.String r5 = qv.C11820c.a(r11)
            L_0x05fe:
                if (r6 != 0) goto L_0x064d
                java.lang.Class r6 = r0.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r20 = r8
                r10 = 0
                r11 = 36
                r15 = 2
                java.lang.String r8 = HJ.C15854t.s1(r6, r11, r10, r15, r10)
                r11 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r11, r10, r15, r10)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x0622
                goto L_0x0626
            L_0x0622:
                java.lang.String r6 = HJ.C15854t.P0(r8, r13)
            L_0x0626:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                r10 = 1
                boolean r8 = HJ.C15854t.b0(r8, r12, r10)
                if (r8 == 0) goto L_0x0638
                r8 = r23
                goto L_0x063a
            L_0x0638:
                r8 = r25
            L_0x063a:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                r10.append(r9)
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                goto L_0x064f
            L_0x064d:
                r20 = r8
            L_0x064f:
                r17 = 0
                r15 = r2
                r16 = r6
                r8 = 0
                r18 = r8
                r19 = r5
                r14.a(r15, r16, r17, r18, r19)
                r8 = r20
                goto L_0x05e1
            L_0x065f:
                r7.f74344z = r0
                r7.f74321c = r0
                r7.f74322d = r0
                r7.f74323e = r2
                r7.f74324f = r5
                r7.f74325g = r6
                r7.f74326h = r4
                r7.f74327i = r3
                r7.f74328j = r8
                r2 = 0
                r7.f74337s = r2
                r7.f74338t = r2
                r7.f74339u = r2
                r7.f74340v = r2
                r7.f74341w = r2
                r2 = 2
                r7.f74343y = r2
                r2 = 0
                java.lang.Object r0 = r0.emit(r2, r7)
                if (r0 != r1) goto L_0x0687
                return r1
            L_0x0687:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x068a:
                qv.e r2 = qv.e.DEBUG
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x069d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x06b5
                java.lang.Object r5 = r3.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                boolean r6 = r6.b(r2, r8)
                if (r6 == 0) goto L_0x069d
                r4.add(r5)
                goto L_0x069d
            L_0x06b5:
                java.util.Iterator r3 = r4.iterator()
                r8 = r4
                r5 = 0
                r6 = 0
            L_0x06bc:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x0740
                java.lang.Object r8 = r3.next()
                r14 = r8
                qv.b r14 = (qv.C11819b) r14
                r10 = 0
                if (r5 != 0) goto L_0x06da
                java.lang.String r11 = "No items, don't fetch availability"
                java.lang.String r11 = qv.C11818a.a(r11, r10)
                if (r11 != 0) goto L_0x06d6
                goto L_0x0740
            L_0x06d6:
                java.lang.String r5 = qv.C11820c.a(r11)
            L_0x06da:
                if (r6 != 0) goto L_0x0729
                java.lang.Class r6 = r0.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r20 = r8
                r10 = 0
                r11 = 36
                r15 = 2
                java.lang.String r8 = HJ.C15854t.s1(r6, r11, r10, r15, r10)
                r11 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r11, r10, r15, r10)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x06fe
                goto L_0x0702
            L_0x06fe:
                java.lang.String r6 = HJ.C15854t.P0(r8, r13)
            L_0x0702:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                r10 = 1
                boolean r8 = HJ.C15854t.b0(r8, r12, r10)
                if (r8 == 0) goto L_0x0714
                r8 = r23
                goto L_0x0716
            L_0x0714:
                r8 = r25
            L_0x0716:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                r10.append(r9)
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                goto L_0x072e
            L_0x0729:
                r20 = r8
                r11 = 46
                r15 = 2
            L_0x072e:
                r17 = 0
                r10 = r15
                r15 = r2
                r16 = r6
                r8 = 0
                r18 = r8
                r19 = r5
                r14.a(r15, r16, r17, r18, r19)
                r8 = r20
                goto L_0x06bc
            L_0x0740:
                r7.f74344z = r0
                r7.f74321c = r0
                r7.f74322d = r0
                r7.f74323e = r2
                r7.f74324f = r5
                r7.f74325g = r6
                r7.f74326h = r4
                r7.f74327i = r3
                r7.f74328j = r8
                r2 = 0
                r7.f74337s = r2
                r7.f74338t = r2
                r7.f74339u = r2
                r7.f74340v = r2
                r7.f74341w = r2
                r2 = 1
                r7.f74343y = r2
                r2 = 0
                java.lang.Object r0 = r0.emit(r2, r7)
                if (r0 != r1) goto L_0x0768
                return r1
            L_0x0768:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ig.C9846b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetCartItemAvailabilityUseCase.kt", l = {190, 189}, m = "invokeSuspend")
    /* renamed from: ig.b$d */
    public static final class d extends l implements q<C16533h<? super ip.l<C9845a.C1326a, Throwable>>, a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74345c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74346d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74347e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C9846b f74348f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, C9846b bVar) {
            super(3, eVar);
            this.f74348f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super ip.l<C9845a.C1326a, Throwable>> hVar, a aVar, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f74348f);
            dVar.f74346d = hVar;
            dVar.f74347e = aVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f74345c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r8)
                goto L_0x0055
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                java.lang.Object r1 = r7.f74346d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r8)
                goto L_0x0047
            L_0x0022:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f74346d
                r1 = r8
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r8 = r7.f74347e
                ig.b$a r8 = (ig.C9846b.a) r8
                ig.b r4 = r7.f74348f
                java.util.List r5 = r8.a()
                com.ingka.ikea.app.base.UserPostalCodeAddress r6 = r8.b()
                EB.d r8 = r8.c()
                r7.f74346d = r1
                r7.f74345c = r3
                java.lang.Object r8 = r4.g(r5, r6, r8, r7)
                if (r8 != r0) goto L_0x0047
                return r0
            L_0x0047:
                TJ.g r8 = (TJ.C16532g) r8
                r3 = 0
                r7.f74346d = r3
                r7.f74345c = r2
                java.lang.Object r8 = TJ.C16534i.x(r1, r8, r7)
                if (r8 != r0) goto L_0x0055
                return r0
            L_0x0055:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ig.C9846b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lip/l;", "Lig/a$a;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$invoke$2", f = "GetCartItemAvailabilityUseCase.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: ig.b$e */
    static final class e extends l implements p<C16533h<? super ip.l<C9845a.C1326a, Throwable>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74349c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74350d;

        e(C17164e<? super e> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f74350d = obj;
            return eVar2;
        }

        public final Object invoke(C16533h<? super ip.l<C9845a.C1326a, Throwable>> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74349c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74350d;
                this.f74350d = hVar;
                this.f74349c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74350d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lip/l;", "Lig/a$a;", "", "it", "LXH/N;", "<anonymous>", "(Lip/l;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$invoke$3", f = "GetCartItemAvailabilityUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ig.b$f */
    static final class f extends l implements p<ip.l<C9845a.C1326a, Throwable>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74351c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9846b f74353e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C9846b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f74353e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f74353e, eVar);
            fVar.f74352d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(ip.l<C9845a.C1326a, Throwable> lVar, C17164e<? super C16807N> eVar) {
            return ((f) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74351c == 0) {
                y.b(obj);
                ip.l lVar = (ip.l) this.f74352d;
                C9846b bVar = this.f74353e;
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a("Item availability updated: " + bVar.h(lVar), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
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
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.b$g */
    public static final class g implements C16532g<List<? extends Ln.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74354a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.b$g$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74355a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartItemAvailabilityUseCaseImpl$special$$inlined$map$1$2", f = "GetCartItemAvailabilityUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.b$g$a$a  reason: collision with other inner class name */
            public static final class C1328a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74356c;

                /* renamed from: d  reason: collision with root package name */
                int f74357d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74358e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1328a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74358e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74356c = obj;
                    this.f74357d |= Integer.MIN_VALUE;
                    return this.f74358e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74355a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.C9846b.g.a.C1328a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.b$g$a$a r0 = (ig.C9846b.g.a.C1328a) r0
                    int r1 = r0.f74357d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74357d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.b$g$a$a r0 = new ig.b$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74356c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74357d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f74355a
                    Ln.g r5 = (Ln.g) r5
                    if (r5 == 0) goto L_0x003f
                    java.util.List r5 = r5.d()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f74357d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.C9846b.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar) {
            this.f74354a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74354a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C9846b(h hVar, C12860a aVar, b bVar, C10253a aVar2, C10242c cVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(bVar, "availabilityRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(cVar, "appUserDataRepository");
        this.f74303a = bVar;
        this.f74304b = aVar2;
        g gVar = new g(hVar.m());
        this.f74305c = gVar;
        C16532g<UserPostalCodeAddress> s10 = C16534i.s(cVar.d());
        this.f74306d = s10;
        C16532g<C12832d> s11 = C16534i.s(aVar.b());
        this.f74307e = s11;
        this.f74308f = C16534i.m(s10, s11, gVar, new C1327b((C17164e<? super C1327b>) null));
    }

    /* access modifiers changed from: private */
    public final Object g(List<Ln.d> list, UserPostalCodeAddress userPostalCodeAddress, C12832d dVar, C17164e<? super C16532g<? extends ip.l<C9845a.C1326a, Throwable>>> eVar) {
        return C16534i.H(new c(list, userPostalCodeAddress, this, dVar, (C17164e<? super c>) null));
    }

    /* access modifiers changed from: private */
    public final String h(ip.l<C9845a.C1326a, Throwable> lVar) {
        if (lVar != null) {
            return P.b(lVar.getClass()).f();
        }
        return null;
    }

    public C16532g<ip.l<C9845a.C1326a, Throwable>> invoke() {
        return C16534i.s(C16534i.R(C16534i.S(C16534i.g0(this.f74308f, new d((C17164e) null, this)), new e((C17164e<? super e>) null)), new f(this, (C17164e<? super f>) null)));
    }
}
