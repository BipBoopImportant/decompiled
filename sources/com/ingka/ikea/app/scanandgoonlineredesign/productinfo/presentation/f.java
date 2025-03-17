package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import IC.C13023e;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import rz.C15028v;
import rz.I;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u000f\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "<init>", "()V", "p", "q", "g", "h", "o", "d", "f", "m", "n", "b", "e", "i", "l", "j", "k", "a", "c", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$d;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$e;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$f;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$g;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$h;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$i;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$m;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$n;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$o;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$p;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$q;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "productName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        private final String f91771a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "productName");
            this.f91771a = str;
        }

        public final String a() {
            return this.f91771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f91771a, ((a) obj).f91771a);
        }

        public int hashCode() {
            return this.f91771a.hashCode();
        }

        public String toString() {
            String str = this.f91771a;
            return "AddToOnlineCartFailed(productName=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "Lrz/I;", "product", "Lrz/v;", "extras", "<init>", "(Lrz/I;Lrz/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "b", "()Lrz/I;", "Lrz/v;", "()Lrz/v;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        private final I f91772a;

        /* renamed from: b  reason: collision with root package name */
        private final C15028v f91773b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(I i10, C15028v vVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i10, "product");
            C17542s.j(vVar, "extras");
            this.f91772a = i10;
            this.f91773b = vVar;
        }

        public final C15028v a() {
            return this.f91773b;
        }

        public final I b() {
            return this.f91772a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f91772a, bVar.f91772a) && C17542s.e(this.f91773b, bVar.f91773b);
        }

        public int hashCode() {
            return (this.f91772a.hashCode() * 31) + this.f91773b.hashCode();
        }

        public String toString() {
            I i10 = this.f91772a;
            C15028v vVar = this.f91773b;
            return "Added(product=" + i10 + ", extras=" + vVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "<init>", "()V", "c", "b", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c extends f {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "Lrz/I;", "product", "Llm/a$c;", "fulfilmentOption", "<init>", "(Lrz/I;Llm/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "b", "()Lrz/I;", "Llm/a$c;", "()Llm/a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final I f91774a;

            /* renamed from: b  reason: collision with root package name */
            private final C11550a.c f91775b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(I i10, C11550a.c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(i10, "product");
                C17542s.j(cVar, "fulfilmentOption");
                this.f91774a = i10;
                this.f91775b = cVar;
            }

            public final C11550a.c a() {
                return this.f91775b;
            }

            public final I b() {
                return this.f91774a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f91774a, aVar.f91774a) && C17542s.e(this.f91775b, aVar.f91775b);
            }

            public int hashCode() {
                return (this.f91774a.hashCode() * 31) + this.f91775b.hashCode();
            }

            public String toString() {
                I i10 = this.f91774a;
                C11550a.c cVar = this.f91775b;
                return "ShowExplanationBottomSheet(product=" + i10 + ", fulfilmentOption=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "Lrz/I;", "product", "Llm/a$c;", "fulfilmentOption", "<init>", "(Lrz/I;Llm/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "b", "()Lrz/I;", "Llm/a$c;", "()Llm/a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final I f91776a;

            /* renamed from: b  reason: collision with root package name */
            private final C11550a.c f91777b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(I i10, C11550a.c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(i10, "product");
                C17542s.j(cVar, "fulfilmentOption");
                this.f91776a = i10;
                this.f91777b = cVar;
            }

            public final C11550a.c a() {
                return this.f91777b;
            }

            public final I b() {
                return this.f91776a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f91776a, bVar.f91776a) && C17542s.e(this.f91777b, bVar.f91777b);
            }

            public int hashCode() {
                return (this.f91776a.hashCode() * 31) + this.f91777b.hashCode();
            }

            public String toString() {
                I i10 = this.f91776a;
                C11550a.c cVar = this.f91777b;
                return "ShowLegacyEmailNotification(product=" + i10 + ", fulfilmentOption=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$c$c  reason: collision with other inner class name */
        public static final class C2025c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C2025c f91778a = new C2025c();

            private C2025c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2025c);
            }

            public int hashCode() {
                return -877573981;
            }

            public String toString() {
                return "ShowLoginSignupPromotionBottomSheet";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$d;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "selected", "maxAvailable", "Lrz/I;", "product", "<init>", "(IILrz/I;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lrz/I;", "getProduct", "()Lrz/I;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        private final int f91779a;

        /* renamed from: b  reason: collision with root package name */
        private final int f91780b;

        /* renamed from: c  reason: collision with root package name */
        private final I f91781c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i10, int i11, I i12) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i12, "product");
            this.f91779a = i10;
            this.f91780b = i11;
            this.f91781c = i12;
        }

        public final int a() {
            return this.f91780b;
        }

        public final int b() {
            return this.f91779a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f91779a == dVar.f91779a && this.f91780b == dVar.f91780b && C17542s.e(this.f91781c, dVar.f91781c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f91779a) * 31) + Integer.hashCode(this.f91780b)) * 31) + this.f91781c.hashCode();
        }

        public String toString() {
            int i10 = this.f91779a;
            int i11 = this.f91780b;
            I i12 = this.f91781c;
            return "ChangeQuantity(selected=" + i10 + ", maxAvailable=" + i11 + ", product=" + i12 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$e;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "Lrz/I;", "product", "", "quantity", "<init>", "(Lrz/I;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "()Lrz/I;", "b", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        private final I f91782a;

        /* renamed from: b  reason: collision with root package name */
        private final int f91783b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(I i10, int i11) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i10, "product");
            this.f91782a = i10;
            this.f91783b = i11;
        }

        public final I a() {
            return this.f91782a;
        }

        public final int b() {
            return this.f91783b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f91782a, eVar.f91782a) && this.f91783b == eVar.f91783b;
        }

        public int hashCode() {
            return (this.f91782a.hashCode() * 31) + Integer.hashCode(this.f91783b);
        }

        public String toString() {
            I i10 = this.f91782a;
            int i11 = this.f91783b;
            return "Collected(product=" + i10 + ", quantity=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$f;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "expectedQuantity", "Lrz/I;", "product", "<init>", "(ILrz/I;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lrz/I;", "()Lrz/I;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$f  reason: collision with other inner class name */
    public static final class C2026f extends f {

        /* renamed from: a  reason: collision with root package name */
        private final int f91784a;

        /* renamed from: b  reason: collision with root package name */
        private final I f91785b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2026f(int i10, I i11) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i11, "product");
            this.f91784a = i10;
            this.f91785b = i11;
        }

        public final int a() {
            return this.f91784a;
        }

        public final I b() {
            return this.f91785b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2026f)) {
                return false;
            }
            C2026f fVar = (C2026f) obj;
            return this.f91784a == fVar.f91784a && C17542s.e(this.f91785b, fVar.f91785b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f91784a) * 31) + this.f91785b.hashCode();
        }

        public String toString() {
            int i10 = this.f91784a;
            I i11 = this.f91785b;
            return "ConfirmQuantity(expectedQuantity=" + i10 + ", product=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$g;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "closeOnDismiss", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends f {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f91786a;

        public g() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f91786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f91786a == ((g) obj).f91786a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91786a);
        }

        public String toString() {
            boolean z10 = this.f91786a;
            return "GenericError(closeOnDismiss=" + z10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        public g(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f91786a = z10;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$h;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "itemNo", "", "manualInput", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends f {

        /* renamed from: a  reason: collision with root package name */
        private final String f91787a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f91788b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            this.f91787a = str;
            this.f91788b = z10;
        }

        public final String a() {
            return this.f91787a;
        }

        public final boolean b() {
            return this.f91788b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f91787a, hVar.f91787a) && this.f91788b == hVar.f91788b;
        }

        public int hashCode() {
            return (this.f91787a.hashCode() * 31) + Boolean.hashCode(this.f91788b);
        }

        public String toString() {
            String str = this.f91787a;
            boolean z10 = this.f91788b;
            return "NotFound(itemNo=" + str + ", manualInput=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$i;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f91789b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f91790a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C13023e eVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "message");
            this.f91790a = eVar;
        }

        public final C13023e a() {
            return this.f91790a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f91790a, ((i) obj).f91790a);
        }

        public int hashCode() {
            return this.f91790a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f91790a;
            return "PromptAvailabilityWarning(message=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$j;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l;", "Lrz/I;", "product", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "entryPoint", "<init>", "(Lrz/I;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "b", "()Lrz/I;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends l {

        /* renamed from: a  reason: collision with root package name */
        private final I f91791a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f91792b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(I i10, l.a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i10, "product");
            C17542s.j(aVar, "entryPoint");
            this.f91791a = i10;
            this.f91792b = aVar;
        }

        public l.a a() {
            return this.f91792b;
        }

        public I b() {
            return this.f91791a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C17542s.e(this.f91791a, jVar.f91791a) && this.f91792b == jVar.f91792b;
        }

        public int hashCode() {
            return (this.f91791a.hashCode() * 31) + this.f91792b.hashCode();
        }

        public String toString() {
            I i10 = this.f91791a;
            l.a aVar = this.f91792b;
            return "PromptMaxQuantityReachedCombination(product=" + i10 + ", entryPoint=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$k;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l;", "Lrz/I;", "product", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "entryPoint", "<init>", "(Lrz/I;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/I;", "b", "()Lrz/I;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends l {

        /* renamed from: a  reason: collision with root package name */
        private final I f91793a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f91794b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(I i10, l.a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(i10, "product");
            C17542s.j(aVar, "entryPoint");
            this.f91793a = i10;
            this.f91794b = aVar;
        }

        public l.a a() {
            return this.f91794b;
        }

        public I b() {
            return this.f91793a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C17542s.e(this.f91793a, kVar.f91793a) && this.f91794b == kVar.f91794b;
        }

        public int hashCode() {
            return (this.f91793a.hashCode() * 31) + this.f91794b.hashCode();
        }

        public String toString() {
            I i10 = this.f91793a;
            l.a aVar = this.f91794b;
            return "PromptOutOfStockCombination(product=" + i10 + ", entryPoint=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "<init>", "()V", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$j;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$k;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class l extends f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_TO_CART", "UNAVAILABLE_IN_STORE", "AVAILABILITY_NOTICE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            ADD_TO_CART,
            UNAVAILABLE_IN_STORE,
            AVAILABILITY_NOTICE;

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
            }

            public static C17220a<a> b() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private l() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$m;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "", "productName", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m extends f {

        /* renamed from: a  reason: collision with root package name */
        private final String f91795a;

        /* renamed from: b  reason: collision with root package name */
        private final String f91796b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "productName");
            C17542s.j(str2, "itemNo");
            this.f91795a = str;
            this.f91796b = str2;
        }

        public final String a() {
            return this.f91796b;
        }

        public final String b() {
            return this.f91795a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return C17542s.e(this.f91795a, mVar.f91795a) && C17542s.e(this.f91796b, mVar.f91796b);
        }

        public int hashCode() {
            return (this.f91795a.hashCode() * 31) + this.f91796b.hashCode();
        }

        public String toString() {
            String str = this.f91795a;
            String str2 = this.f91796b;
            return "ShowAddToFavourites(productName=" + str + ", itemNo=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$n;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f91797b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f91798a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C13023e eVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "message");
            this.f91798a = eVar;
        }

        public final C13023e a() {
            return this.f91798a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && C17542s.e(this.f91798a, ((n) obj).f91798a);
        }

        public int hashCode() {
            return this.f91798a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f91798a;
            return "ShowFeedbackSnackBar(message=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$o;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final o f91799a = new o();

        private o() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public int hashCode() {
            return -965638452;
        }

        public String toString() {
            return "StoreClosed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$p;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final p f91800a = new p();

        private p() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public int hashCode() {
            return -197599784;
        }

        public String toString() {
            return "SuggestWifi";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$q;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final q f91801a = new q();

        private q() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public int hashCode() {
            return -828557549;
        }

        public String toString() {
            return "UnstableConnection";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
