package Ny;

import Ry.f;
import Ry.g;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import rz.C15014g;
import rz.D;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNy/i;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LRy/g;", "couponsRepository", "<init>", "(LRy/f;LRy/g;)V", "LTJ/g;", "LNy/i$a;", "a", "()LTJ/g;", "LRy/f;", "b", "LRy/g;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final f f112574a;

    /* renamed from: b  reason: collision with root package name */
    private final g f112575b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LNy/i$a;", "", "", "Lrz/D;", "skippedCoupons", "", "hasSkippedProducts", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<D> f112576a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f112577b;

        public a() {
            this((List) null, false, 3, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f112577b;
        }

        public final List<D> b() {
            return this.f112576a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f112576a, aVar.f112576a) && this.f112577b == aVar.f112577b;
        }

        public int hashCode() {
            return (this.f112576a.hashCode() * 31) + Boolean.hashCode(this.f112577b);
        }

        public String toString() {
            List<D> list = this.f112576a;
            boolean z10 = this.f112577b;
            return "ErrorsToActOnContent(skippedCoupons=" + list + ", hasSkippedProducts=" + z10 + ")";
        }

        public a(List<D> list, boolean z10) {
            C17542s.j(list, "skippedCoupons");
            this.f112576a = list;
            this.f112577b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lrz/g;", "cartItems", "Lrz/D;", "coupons", "LNy/i$a;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)LNy/i$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.GetErrorsToActOnOrchestrator$asStateFlow$1", f = "GetErrorsToActOnOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<List<? extends C15014g>, List<? extends D>, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112578c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f112579d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f112580e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<C15014g> list, List<D> list2, C17164e<? super a> eVar) {
            b bVar = new b(eVar);
            bVar.f112579d = list;
            bVar.f112580e = list2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f112578c == 0) {
                y.b(obj);
                List list = (List) this.f112580e;
                Iterable iterable = (List) this.f112579d;
                boolean z10 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C15014g) it.next()).j()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (((D) next).b() != null) {
                        arrayList.add(next);
                    }
                }
                return new a(arrayList, z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(f fVar, g gVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(gVar, "couponsRepository");
        this.f112574a = fVar;
        this.f112575b = gVar;
    }

    public final C16532g<a> a() {
        return C16534i.n(this.f112574a.invoke().i(), this.f112575b.a(), new b((C17164e<? super b>) null));
    }
}
