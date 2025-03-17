package Pu;

import Dw.e;
import HJ.C15854t;
import Pu.g;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Ru.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sp.C11879a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001.B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030'8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"LPu/b;", "Lsp/a;", "Lcom/ingka/ikea/instorepurchasestatus/impl/presentation/ui/a;", "LPu/g;", "Landroidx/lifecycle/f0;", "LRu/a;", "loadOngoingInStoreOrder", "LOu/a;", "uiStateMapper", "LIl/d;", "marketConfigRepository", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(LRu/a;LOu/a;LIl/d;Landroidx/lifecycle/U;)V", "LXH/N;", "F", "()V", "action", "G", "(Lcom/ingka/ikea/instorepurchasestatus/impl/presentation/ui/a;)V", "m", "LRu/a;", "n", "LOu/a;", "", "o", "LXH/o;", "E", "()Ljava/lang/String;", "salesOrderId", "LTJ/B;", "LPu/b$a$a;", "p", "LTJ/B;", "uiError", "LPu/b$a$b;", "q", "viewModelState", "LTJ/P;", "r", "LTJ/P;", "getState", "()LTJ/P;", "state", "s", "a", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 implements C11879a<com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.a, g> {

    /* renamed from: s  reason: collision with root package name */
    public static final a f85799s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f85800t = 8;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ru.a f85801m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Ou.a f85802n;

    /* renamed from: o  reason: collision with root package name */
    private final C16824o f85803o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<a.C1744a> f85804p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<a.C1746b> f85805q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<g> f85806r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LPu/b$a;", "", "<init>", "()V", "b", "a", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LPu/b$a$a;", "", "<init>", "()V", "a", "LPu/b$a$a$a;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pu.b$a$a  reason: collision with other inner class name */
        public static abstract class C1744a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPu/b$a$a$a;", "LPu/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pu.b$a$a$a  reason: collision with other inner class name */
            public static final class C1745a extends C1744a {

                /* renamed from: a  reason: collision with root package name */
                public static final C1745a f85807a = new C1745a();

                private C1745a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1745a);
                }

                public int hashCode() {
                    return 205792058;
                }

                public String toString() {
                    return "LoadOrderFailed";
                }
            }

            public /* synthetic */ C1744a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1744a() {
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LPu/b$a$b;", "", "", "orderId", "headerImageUrl", "LPu/b$a$b$a;", "orderInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;LPu/b$a$b$a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;LPu/b$a$b$a;)LPu/b$a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "LPu/b$a$b$a;", "e", "()LPu/b$a$b$a;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pu.b$a$b  reason: collision with other inner class name */
        public static final class C1746b {

            /* renamed from: a  reason: collision with root package name */
            private final String f85808a;

            /* renamed from: b  reason: collision with root package name */
            private final String f85809b;

            /* renamed from: c  reason: collision with root package name */
            private final C1747a f85810c;

            public C1746b() {
                this((String) null, (String) null, (C1747a) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ C1746b b(C1746b bVar, String str, String str2, C1747a aVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f85808a;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f85809b;
                }
                if ((i10 & 4) != 0) {
                    aVar = bVar.f85810c;
                }
                return bVar.a(str, str2, aVar);
            }

            public final C1746b a(String str, String str2, C1747a aVar) {
                return new C1746b(str, str2, aVar);
            }

            public final String c() {
                return this.f85809b;
            }

            public final String d() {
                return this.f85808a;
            }

            public final C1747a e() {
                return this.f85810c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1746b)) {
                    return false;
                }
                C1746b bVar = (C1746b) obj;
                return C17542s.e(this.f85808a, bVar.f85808a) && C17542s.e(this.f85809b, bVar.f85809b) && C17542s.e(this.f85810c, bVar.f85810c);
            }

            public int hashCode() {
                String str = this.f85808a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f85809b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                C1747a aVar = this.f85810c;
                if (aVar != null) {
                    i10 = aVar.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                String str = this.f85808a;
                String str2 = this.f85809b;
                C1747a aVar = this.f85810c;
                return "UiState(orderId=" + str + ", headerImageUrl=" + str2 + ", orderInfo=" + aVar + ")";
            }

            public C1746b(String str, String str2, C1747a aVar) {
                this.f85808a = str;
                this.f85809b = str2;
                this.f85810c = aVar;
            }

            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u0019BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"LPu/b$a$b$a;", "", "LDw/c;", "pickupStatus", "LDw/e$a;", "collectionTime", "LPu/b$a$b$a$a;", "serviceDeskInfo", "", "totalPrice", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productsInOrder", "<init>", "(LDw/c;LDw/e$a;LPu/b$a$b$a$a;Ljava/lang/Double;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDw/c;", "b", "()LDw/c;", "LDw/e$a;", "()LDw/e$a;", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "Ljava/util/List;", "()Ljava/util/List;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pu.b$a$b$a  reason: collision with other inner class name */
            public static final class C1747a {

                /* renamed from: a  reason: collision with root package name */
                private final Dw.c f85811a;

                /* renamed from: b  reason: collision with root package name */
                private final e.a f85812b;

                /* renamed from: c  reason: collision with root package name */
                private final Double f85813c;

                /* renamed from: d  reason: collision with root package name */
                private final List<ProductItem> f85814d;

                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPu/b$a$b$a$a;", "", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Pu.b$a$b$a$a  reason: collision with other inner class name */
                public static final class C1748a {
                }

                public C1747a(Dw.c cVar, e.a aVar, C1748a aVar2, Double d10, List<ProductItem> list) {
                    C17542s.j(cVar, "pickupStatus");
                    C17542s.j(list, "productsInOrder");
                    this.f85811a = cVar;
                    this.f85812b = aVar;
                    this.f85813c = d10;
                    this.f85814d = list;
                }

                public final e.a a() {
                    return this.f85812b;
                }

                public final Dw.c b() {
                    return this.f85811a;
                }

                public final List<ProductItem> c() {
                    return this.f85814d;
                }

                public final Double d() {
                    return this.f85813c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1747a)) {
                        return false;
                    }
                    C1747a aVar = (C1747a) obj;
                    return this.f85811a == aVar.f85811a && C17542s.e(this.f85812b, aVar.f85812b) && C17542s.e((Object) null, (Object) null) && C17542s.e(this.f85813c, aVar.f85813c) && C17542s.e(this.f85814d, aVar.f85814d);
                }

                public int hashCode() {
                    int hashCode = this.f85811a.hashCode() * 31;
                    e.a aVar = this.f85812b;
                    int i10 = 0;
                    int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 961;
                    Double d10 = this.f85813c;
                    if (d10 != null) {
                        i10 = d10.hashCode();
                    }
                    return ((hashCode2 + i10) * 31) + this.f85814d.hashCode();
                }

                public String toString() {
                    Dw.c cVar = this.f85811a;
                    e.a aVar = this.f85812b;
                    Double d10 = this.f85813c;
                    List<ProductItem> list = this.f85814d;
                    return "OrderInfo(pickupStatus=" + cVar + ", collectionTime=" + aVar + ", serviceDeskInfo=" + null + ", totalPrice=" + d10 + ", productsInOrder=" + list + ")";
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1747a(Dw.c cVar, e.a aVar, C1748a aVar2, Double d10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? Dw.c.UNKNOWN : cVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : d10, list);
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C1746b(String str, String str2, C1747a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : aVar);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Pu/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pu.b$b  reason: collision with other inner class name */
    public static final class C1749b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85815a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1749b(N.a aVar, b bVar) {
            super(aVar);
            this.f85815a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            b bVar = this.f85815a;
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
                    String a10 = C11818a.a("Couldn't get orderId from saveStateHandle", th2);
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
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f85815a.f85804p.setValue(a.C1744a.C1745a.f85807a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.InStorePurchaseFragmentViewModel$loadOrder$2", f = "InStorePurchaseFragmentViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85816c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f85817d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f85818e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f85818e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f85818e, eVar);
            cVar.f85817d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f85816c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f85817d;
                this.f85818e.f85804p.setValue(null);
                Ru.a i11 = this.f85818e.f85801m;
                String j10 = this.f85818e.E();
                this.f85817d = q11;
                this.f85816c = 1;
                Object a10 = i11.a(j10, this);
                if (a10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = a10;
            } else if (i10 == 1) {
                q10 = (Q) this.f85817d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f85818e;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                a.C1805a aVar = (a.C1805a) obj2;
                C16505B D10 = bVar.f85805q;
                do {
                    value = D10.getValue();
                } while (!D10.e(value, a.C1746b.b((a.C1746b) value, aVar.a(), (String) null, new a.C1746b.C1747a(aVar.b(), aVar.d(), (a.C1746b.C1747a.C1748a) null, aVar.e(), aVar.c(), 4, (DefaultConstructorMarker) null), 2, (Object) null)));
            } else {
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
                        String a11 = C11818a.a("Failed to load OnGoing instore order", e10);
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
                    bVar2.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                bVar.f85804p.setValue(a.C1744a.C1745a.f85807a);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LPu/b$a$a;", "error", "LPu/b$a$b;", "state", "LRl/e;", "marketConfig", "LPu/g;", "<anonymous>", "(LPu/b$a$a;LPu/b$a$b;LRl/e;)LPu/g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.InStorePurchaseFragmentViewModel$state$1", f = "InStorePurchaseFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements r<a.C1744a, a.C1746b, Rl.e, C17164e<? super g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85819c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f85820d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85821e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f85822f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f85823g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(4, eVar);
            this.f85823g = bVar;
        }

        /* renamed from: i */
        public final Object l(a.C1744a aVar, a.C1746b bVar, Rl.e eVar, C17164e<? super g> eVar2) {
            d dVar = new d(this.f85823g, eVar2);
            dVar.f85820d = aVar;
            dVar.f85821e = bVar;
            dVar.f85822f = eVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            r4 = Pu.b.C(r3.f85823g).a(r0, (r4 = r1.c()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                eI.C17187b.f()
                int r0 = r3.f85819c
                if (r0 != 0) goto L_0x004e
                XH.y.b(r4)
                java.lang.Object r4 = r3.f85820d
                Pu.b$a$a r4 = (Pu.b.a.C1744a) r4
                java.lang.Object r0 = r3.f85821e
                Pu.b$a$b r0 = (Pu.b.a.C1746b) r0
                java.lang.Object r1 = r3.f85822f
                Rl.e r1 = (Rl.e) r1
                Pu.b$a$a$a r2 = Pu.b.a.C1744a.C1745a.f85807a
                boolean r2 = kotlin.jvm.internal.C17542s.e(r4, r2)
                if (r2 == 0) goto L_0x0028
                Pu.g$a r4 = new Pu.g$a
                java.lang.String r0 = r0.c()
                r4.<init>(r0)
                goto L_0x0047
            L_0x0028:
                if (r4 != 0) goto L_0x0048
                if (r1 == 0) goto L_0x003e
                kp.d r4 = r1.c()
                if (r4 == 0) goto L_0x003e
                Pu.b r1 = r3.f85823g
                Ou.a r1 = r1.f85802n
                Pu.g r4 = r1.a(r0, r4)
                if (r4 != 0) goto L_0x0047
            L_0x003e:
                Pu.g$a r4 = new Pu.g$a
                java.lang.String r0 = r0.c()
                r4.<init>(r0)
            L_0x0047:
                return r4
            L_0x0048:
                XH.t r4 = new XH.t
                r4.<init>()
                throw r4
            L_0x004e:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Pu.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Ru.a aVar, Ou.a aVar2, Il.d dVar, U u10) {
        C17542s.j(aVar, "loadOngoingInStoreOrder");
        C17542s.j(aVar2, "uiStateMapper");
        C17542s.j(dVar, "marketConfigRepository");
        C17542s.j(u10, "savedStateHandle");
        this.f85801m = aVar;
        this.f85802n = aVar2;
        this.f85803o = C16825p.b(new a(u10));
        C16505B<a.C1744a> a10 = C16521S.a(null);
        this.f85804p = a10;
        C16505B<a.C1746b> a11 = C16521S.a(new a.C1746b((String) null, "https://shop.static.ingka.ikea.com/skanna/scanandgo-onboarding-skip-lines.png", (a.C1746b.C1747a) null, 5, (DefaultConstructorMarker) null));
        this.f85805q = a11;
        F();
        this.f85806r = C16534i.c0(C16534i.m(a10, a11, dVar.d(), new d(this, (C17164e<? super d>) null)), g0.a(this), ip.f.a(), new g.b((String) null, 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final String E() {
        return (String) this.f85803o.getValue();
    }

    private final void F() {
        F0 unused = C16314k.d(g0.a(this), new C1749b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String H(U u10) {
        Object f10 = u10.f("orderId");
        if (f10 != null) {
            return (String) f10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void G(com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C2139a) {
            F();
            return;
        }
        throw new t();
    }

    public C16519P<g> getState() {
        return this.f85806r;
    }
}
