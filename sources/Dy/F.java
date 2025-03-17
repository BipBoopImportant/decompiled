package Dy;

import Op.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LDy/F;", "", "b", "a", "d", "e", "c", "LDy/F$a;", "LDy/F$b;", "LDy/F$c;", "LDy/F$d;", "LDy/F$e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface F {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"LDy/F$a;", "LDy/F;", "", "barcode", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcode", "b", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        private final String f109122a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109123b;

        public a(String str, String str2) {
            C17542s.j(str, "barcode");
            C17542s.j(str2, "itemNo");
            this.f109122a = str;
            this.f109123b = str2;
        }

        public final String a() {
            return this.f109123b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f109122a, aVar.f109122a) && C17542s.e(this.f109123b, aVar.f109123b);
        }

        public int hashCode() {
            return (this.f109122a.hashCode() * 31) + this.f109123b.hashCode();
        }

        public String toString() {
            String str = this.f109122a;
            String str2 = this.f109123b;
            return "EnergyLabelClicked(barcode=" + str + ", itemNo=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, d2 = {"LDy/F$b;", "LDy/F;", "", "barcode", "LOp/Z0$c$a;", "type", "itemNo", "itemType", "productName", "<init>", "(Ljava/lang/String;LOp/Z0$c$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LOp/Z0$c$a;", "()LOp/Z0$c$a;", "c", "getItemNo", "d", "getItemType", "e", "getProductName", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements F {

        /* renamed from: f  reason: collision with root package name */
        public static final int f109124f = Z0.c.a.f85051a;

        /* renamed from: a  reason: collision with root package name */
        private final String f109125a;

        /* renamed from: b  reason: collision with root package name */
        private final Z0.c.a f109126b;

        /* renamed from: c  reason: collision with root package name */
        private final String f109127c;

        /* renamed from: d  reason: collision with root package name */
        private final String f109128d;

        /* renamed from: e  reason: collision with root package name */
        private final String f109129e;

        public b(String str, Z0.c.a aVar, String str2, String str3, String str4) {
            C17542s.j(str, "barcode");
            C17542s.j(aVar, "type");
            C17542s.j(str2, "itemNo");
            C17542s.j(str3, "itemType");
            C17542s.j(str4, "productName");
            this.f109125a = str;
            this.f109126b = aVar;
            this.f109127c = str2;
            this.f109128d = str3;
            this.f109129e = str4;
        }

        public final String a() {
            return this.f109125a;
        }

        public final Z0.c.a b() {
            return this.f109126b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f109125a, bVar.f109125a) && C17542s.e(this.f109126b, bVar.f109126b) && C17542s.e(this.f109127c, bVar.f109127c) && C17542s.e(this.f109128d, bVar.f109128d) && C17542s.e(this.f109129e, bVar.f109129e);
        }

        public int hashCode() {
            return (((((((this.f109125a.hashCode() * 31) + this.f109126b.hashCode()) * 31) + this.f109127c.hashCode()) * 31) + this.f109128d.hashCode()) * 31) + this.f109129e.hashCode();
        }

        public String toString() {
            String str = this.f109125a;
            Z0.c.a aVar = this.f109126b;
            String str2 = this.f109127c;
            String str3 = this.f109128d;
            String str4 = this.f109129e;
            return "FabClicked(barcode=" + str + ", type=" + aVar + ", itemNo=" + str2 + ", itemType=" + str3 + ", productName=" + str4 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LDy/F$c;", "LDy/F;", "", "barcode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements F {

        /* renamed from: a  reason: collision with root package name */
        private final String f109130a;

        public c(String str) {
            C17542s.j(str, "barcode");
            this.f109130a = str;
        }

        public final String a() {
            return this.f109130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f109130a, ((c) obj).f109130a);
        }

        public int hashCode() {
            return this.f109130a.hashCode();
        }

        public String toString() {
            String str = this.f109130a;
            return "OnItemClicked(barcode=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"LDy/F$d;", "LDy/F;", "", "barcode", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getItemNo", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements F {

        /* renamed from: a  reason: collision with root package name */
        private final String f109131a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109132b;

        public d(String str, String str2) {
            C17542s.j(str, "barcode");
            C17542s.j(str2, "itemNo");
            this.f109131a = str;
            this.f109132b = str2;
        }

        public final String a() {
            return this.f109131a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f109131a, dVar.f109131a) && C17542s.e(this.f109132b, dVar.f109132b);
        }

        public int hashCode() {
            return (this.f109131a.hashCode() * 31) + this.f109132b.hashCode();
        }

        public String toString() {
            String str = this.f109131a;
            String str2 = this.f109132b;
            return "OptionsMenuClicked(barcode=" + str + ", itemNo=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\f¨\u0006\u0018"}, d2 = {"LDy/F$e;", "LDy/F;", "", "barcode", "itemNo", "", "newQuantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getItemNo", "c", "I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements F {

        /* renamed from: a  reason: collision with root package name */
        private final String f109133a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109134b;

        /* renamed from: c  reason: collision with root package name */
        private final int f109135c;

        public e(String str, String str2, int i10) {
            C17542s.j(str, "barcode");
            C17542s.j(str2, "itemNo");
            this.f109133a = str;
            this.f109134b = str2;
            this.f109135c = i10;
        }

        public final String a() {
            return this.f109133a;
        }

        public final int b() {
            return this.f109135c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f109133a, eVar.f109133a) && C17542s.e(this.f109134b, eVar.f109134b) && this.f109135c == eVar.f109135c;
        }

        public int hashCode() {
            return (((this.f109133a.hashCode() * 31) + this.f109134b.hashCode()) * 31) + Integer.hashCode(this.f109135c);
        }

        public String toString() {
            String str = this.f109133a;
            String str2 = this.f109134b;
            int i10 = this.f109135c;
            return "QuantityChanged(barcode=" + str + ", itemNo=" + str2 + ", newQuantity=" + i10 + ")";
        }
    }
}
