package hg;

import IC.C13023e;
import IC.C13026h;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.t;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet;
import com.ingka.ikea.app.cart.UnavailableItemMenuType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rv.C11849b;
import uK.C18146a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0017"}, d2 = {"Lhg/d;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/U;)V", "Lhg/d$a;", "C", "()Lhg/d$a;", "Lcom/ingka/ikea/app/cart/UnavailableItemMenuType;", "m", "Lcom/ingka/ikea/app/cart/UnavailableItemMenuType;", "menuType", "LTJ/B;", "n", "LTJ/B;", "_uiState", "LTJ/P;", "o", "LTJ/P;", "()LTJ/P;", "uiState", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.d  reason: case insensitive filesystem */
public final class C9795d extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final UnavailableItemMenuType f73637m;

    /* renamed from: n  reason: collision with root package name */
    private final C16505B<a> f73638n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<a> f73639o;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.d$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73647a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.app.cart.UnavailableItemMenuType[] r0 = com.ingka.ikea.app.cart.UnavailableItemMenuType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.cart.UnavailableItemMenuType r1 = com.ingka.ikea.app.cart.UnavailableItemMenuType.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.cart.UnavailableItemMenuType r1 = com.ingka.ikea.app.cart.UnavailableItemMenuType.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73647a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C9795d.b.<clinit>():void");
        }
    }

    public C9795d(U u10) {
        C17542s.j(u10, "savedStateHandle");
        Object f10 = u10.f("menuType");
        if (f10 != null) {
            this.f73637m = UnavailableItemMenuType.valueOf((String) f10);
            C16505B<a> a10 = C16521S.a(C());
            this.f73638n = a10;
            this.f73639o = C16534i.c(a10);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final a C() {
        List c10 = C16877v.c();
        c10.add(new a.C1287a(C13026h.a(Oo.b.f84361E3), C18146a.f148220R5, UnavailabilityItemActionsBottomSheet.b.OPEN_PRODUCT));
        int i10 = b.f73647a[this.f73637m.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                c10.add(new a.C1287a(C13026h.a(Oo.b.f84678j1), C18146a.f148378bc, UnavailabilityItemActionsBottomSheet.b.CHANGE_STORE));
            } else {
                throw new t();
            }
        }
        c10.add(new a.C1287a(C13026h.a(Oo.b.f84432L4), C18146a.f148740z5, UnavailabilityItemActionsBottomSheet.b.MOVE_TO_SHOPPING_LIST));
        return new a((C13023e) null, (C13023e) null, C16877v.a(c10), 3, (DefaultConstructorMarker) null);
    }

    public final C16519P<a> m() {
        return this.f73639o;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhg/d$a;", "", "LIC/e;", "title", "subtitle", "", "Lhg/d$a$a;", "actions", "<init>", "(LIC/e;LIC/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f73640a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f73641b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C1287a> f73642c;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhg/d$a$a;", "", "LIC/e;", "title", "", "itemIcon", "Lcom/ingka/ikea/app/cart/UnavailabilityItemActionsBottomSheet$b;", "type", "<init>", "(LIC/e;ILcom/ingka/ikea/app/cart/UnavailabilityItemActionsBottomSheet$b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "I", "c", "Lcom/ingka/ikea/app/cart/UnavailabilityItemActionsBottomSheet$b;", "()Lcom/ingka/ikea/app/cart/UnavailabilityItemActionsBottomSheet$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.d$a$a  reason: collision with other inner class name */
        public static final class C1287a {

            /* renamed from: d  reason: collision with root package name */
            public static final int f73643d = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f73644a;

            /* renamed from: b  reason: collision with root package name */
            private final int f73645b;

            /* renamed from: c  reason: collision with root package name */
            private final UnavailabilityItemActionsBottomSheet.b f73646c;

            public C1287a(C13023e eVar, int i10, UnavailabilityItemActionsBottomSheet.b bVar) {
                C17542s.j(eVar, "title");
                C17542s.j(bVar, "type");
                this.f73644a = eVar;
                this.f73645b = i10;
                this.f73646c = bVar;
            }

            public final int a() {
                return this.f73645b;
            }

            public final C13023e b() {
                return this.f73644a;
            }

            public final UnavailabilityItemActionsBottomSheet.b c() {
                return this.f73646c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1287a)) {
                    return false;
                }
                C1287a aVar = (C1287a) obj;
                return C17542s.e(this.f73644a, aVar.f73644a) && this.f73645b == aVar.f73645b && this.f73646c == aVar.f73646c;
            }

            public int hashCode() {
                return (((this.f73644a.hashCode() * 31) + Integer.hashCode(this.f73645b)) * 31) + this.f73646c.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f73644a;
                int i10 = this.f73645b;
                UnavailabilityItemActionsBottomSheet.b bVar = this.f73646c;
                return "Action(title=" + eVar + ", itemIcon=" + i10 + ", type=" + bVar + ")";
            }
        }

        public a(C13023e eVar, C13023e eVar2, List<C1287a> list) {
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "subtitle");
            C17542s.j(list, "actions");
            this.f73640a = eVar;
            this.f73641b = eVar2;
            this.f73642c = list;
        }

        public final List<C1287a> a() {
            return this.f73642c;
        }

        public final C13023e b() {
            return this.f73641b;
        }

        public final C13023e c() {
            return this.f73640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f73640a, aVar.f73640a) && C17542s.e(this.f73641b, aVar.f73641b) && C17542s.e(this.f73642c, aVar.f73642c);
        }

        public int hashCode() {
            return (((this.f73640a.hashCode() * 31) + this.f73641b.hashCode()) * 31) + this.f73642c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f73640a;
            C13023e eVar2 = this.f73641b;
            List<C1287a> list = this.f73642c;
            return "UiState(title=" + eVar + ", subtitle=" + eVar2 + ", actions=" + list + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C13023e eVar, C13023e eVar2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C13026h.a(C11849b.f102303i) : eVar, (i10 & 2) != 0 ? C13026h.a(C11849b.f102299h) : eVar2, list);
        }
    }
}
