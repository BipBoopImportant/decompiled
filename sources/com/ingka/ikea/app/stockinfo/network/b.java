package com.ingka.ikea.app.stockinfo.network;

import Wk.e;
import com.ingka.ikea.app.stockinfo.network.ClassUnitKey;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/b;", "", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/stockinfo/network/b$a;", "Lcom/ingka/ikea/app/stockinfo/network/b$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/b$a;", "Lcom/ingka/ikea/app/stockinfo/network/b;", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/stockinfo/network/b$a$a;", "Lcom/ingka/ikea/app/stockinfo/network/b$a$b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/b$a$a;", "Lcom/ingka/ikea/app/stockinfo/network/b$a;", "LWk/e$b$a;", "productAvailability", "<init>", "(LWk/e$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/e$b$a;", "()LWk/e$b$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.stockinfo.network.b$a$a  reason: collision with other inner class name */
        public static final class C2060a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e.b.a f92666a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2060a(e.b.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "productAvailability");
                this.f92666a = aVar;
            }

            public e.b.a a() {
                return this.f92666a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2060a) && C17542s.e(this.f92666a, ((C2060a) obj).f92666a);
            }

            public int hashCode() {
                return this.f92666a.hashCode();
            }

            public String toString() {
                e.b.a aVar = this.f92666a;
                return "RetailUnit(productAvailability=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/b$a$b;", "Lcom/ingka/ikea/app/stockinfo/network/b$a;", "", "storeId", "LWk/e$b$a;", "productAvailability", "<init>", "(Ljava/lang/String;LWk/e$b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LWk/e$b$a;", "()LWk/e$b$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.stockinfo.network.b$a$b  reason: collision with other inner class name */
        public static final class C2061b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f92667a;

            /* renamed from: b  reason: collision with root package name */
            private final e.b.a f92668b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2061b(String str, e.b.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "storeId");
                C17542s.j(aVar, "productAvailability");
                this.f92667a = str;
                this.f92668b = aVar;
            }

            public e.b.a a() {
                return this.f92668b;
            }

            public final String b() {
                return this.f92667a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2061b)) {
                    return false;
                }
                C2061b bVar = (C2061b) obj;
                return C17542s.e(this.f92667a, bVar.f92667a) && C17542s.e(this.f92668b, bVar.f92668b);
            }

            public int hashCode() {
                return (this.f92667a.hashCode() * 31) + this.f92668b.hashCode();
            }

            public String toString() {
                String str = this.f92667a;
                e.b.a aVar = this.f92668b;
                return "Store(storeId=" + str + ", productAvailability=" + aVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/b$b;", "Lcom/ingka/ikea/app/stockinfo/network/b;", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "classUnitType", "LWk/a;", "error", "", "identifier", "<init>", "(Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;LWk/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "getClassUnitType", "()Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "b", "LWk/a;", "()LWk/a;", "c", "Ljava/lang/String;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.stockinfo.network.b$b  reason: collision with other inner class name */
    public static final class C2062b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ClassUnitKey.a f92669a;

        /* renamed from: b  reason: collision with root package name */
        private final Wk.a f92670b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92671c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2062b(ClassUnitKey.a aVar, Wk.a aVar2, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar2, UiComponentContainer.RESULT_ERROR);
            this.f92669a = aVar;
            this.f92670b = aVar2;
            this.f92671c = str;
        }

        public final Wk.a a() {
            return this.f92670b;
        }

        public final String b() {
            return this.f92671c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2062b)) {
                return false;
            }
            C2062b bVar = (C2062b) obj;
            return this.f92669a == bVar.f92669a && C17542s.e(this.f92670b, bVar.f92670b) && C17542s.e(this.f92671c, bVar.f92671c);
        }

        public int hashCode() {
            ClassUnitKey.a aVar = this.f92669a;
            int i10 = 0;
            int hashCode = (((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f92670b.hashCode()) * 31;
            String str = this.f92671c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            ClassUnitKey.a aVar = this.f92669a;
            Wk.a aVar2 = this.f92670b;
            String str = this.f92671c;
            return "Error(classUnitType=" + aVar + ", error=" + aVar2 + ", identifier=" + str + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
