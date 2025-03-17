package gz;

import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15031y;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b \b\b\u0018\u00002\u00020\u0001:\u0004!\u0016)\"B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015Jx\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b)\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b0\u00108R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b9\u0010/¨\u0006:"}, d2 = {"Lgz/c;", "", "", "barcode", "", "timeStamp", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productLite", "", "inclTax", "exclTax", "", "collected", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "quantityPicker", "Lrz/y;", "type", "Lgz/a;", "itemLocation", "isSkipped", "<init>", "(Ljava/lang/String;JLcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;DDZLcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;Lrz/y;Lgz/a;Z)V", "a", "(Ljava/lang/String;JLcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;DDZLcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;Lrz/y;Lgz/a;Z)Lgz/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "J", "j", "()J", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "h", "()Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "d", "D", "f", "()D", "e", "Z", "()Z", "g", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "i", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "Lrz/y;", "k", "()Lrz/y;", "Lgz/a;", "()Lgz/a;", "l", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f127387a;

    /* renamed from: b  reason: collision with root package name */
    private final long f127388b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductLiteRemote f127389c;

    /* renamed from: d  reason: collision with root package name */
    private final double f127390d;

    /* renamed from: e  reason: collision with root package name */
    private final double f127391e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f127392f;

    /* renamed from: g  reason: collision with root package name */
    private final QuantityPickerDataModel f127393g;

    /* renamed from: h  reason: collision with root package name */
    private final C15031y f127394h;

    /* renamed from: i  reason: collision with root package name */
    private final C14523a f127395i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f127396j;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgz/c$a;", "", "", "barcode", "", "selected", "max", "", "collected", "<init>", "(Ljava/lang/String;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "d", "c", "Z", "()Z", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f127397a;

        /* renamed from: b  reason: collision with root package name */
        private final int f127398b;

        /* renamed from: c  reason: collision with root package name */
        private final int f127399c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f127400d;

        public a(String str, int i10, int i11, boolean z10) {
            C17542s.j(str, "barcode");
            this.f127397a = str;
            this.f127398b = i10;
            this.f127399c = i11;
            this.f127400d = z10;
        }

        public final String a() {
            return this.f127397a;
        }

        public final boolean b() {
            return this.f127400d;
        }

        public final int c() {
            return this.f127399c;
        }

        public final int d() {
            return this.f127398b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f127397a, aVar.f127397a) && this.f127398b == aVar.f127398b && this.f127399c == aVar.f127399c && this.f127400d == aVar.f127400d;
        }

        public int hashCode() {
            return (((((this.f127397a.hashCode() * 31) + Integer.hashCode(this.f127398b)) * 31) + Integer.hashCode(this.f127399c)) * 31) + Boolean.hashCode(this.f127400d);
        }

        public String toString() {
            String str = this.f127397a;
            int i10 = this.f127398b;
            int i11 = this.f127399c;
            boolean z10 = this.f127400d;
            return "QuantityAndCollectedUpdater(barcode=" + str + ", selected=" + i10 + ", max=" + i11 + ", collected=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001d"}, d2 = {"Lgz/c$b;", "", "", "barcode", "", "inclTax", "exclTax", "", "selected", "max", "<init>", "(Ljava/lang/String;DDII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "c", "()D", "d", "I", "e", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f127401a;

        /* renamed from: b  reason: collision with root package name */
        private final double f127402b;

        /* renamed from: c  reason: collision with root package name */
        private final double f127403c;

        /* renamed from: d  reason: collision with root package name */
        private final int f127404d;

        /* renamed from: e  reason: collision with root package name */
        private final int f127405e;

        public b(String str, double d10, double d11, int i10, int i11) {
            C17542s.j(str, "barcode");
            this.f127401a = str;
            this.f127402b = d10;
            this.f127403c = d11;
            this.f127404d = i10;
            this.f127405e = i11;
        }

        public final String a() {
            return this.f127401a;
        }

        public final double b() {
            return this.f127403c;
        }

        public final double c() {
            return this.f127402b;
        }

        public final int d() {
            return this.f127405e;
        }

        public final int e() {
            return this.f127404d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f127401a, bVar.f127401a) && Double.compare(this.f127402b, bVar.f127402b) == 0 && Double.compare(this.f127403c, bVar.f127403c) == 0 && this.f127404d == bVar.f127404d && this.f127405e == bVar.f127405e;
        }

        public int hashCode() {
            return (((((((this.f127401a.hashCode() * 31) + Double.hashCode(this.f127402b)) * 31) + Double.hashCode(this.f127403c)) * 31) + Integer.hashCode(this.f127404d)) * 31) + Integer.hashCode(this.f127405e);
        }

        public String toString() {
            String str = this.f127401a;
            double d10 = this.f127402b;
            double d11 = this.f127403c;
            int i10 = this.f127404d;
            int i11 = this.f127405e;
            return "QuantityAndPriceUpdater(barcode=" + str + ", inclTax=" + d10 + ", exclTax=" + d11 + ", selected=" + i10 + ", max=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Lgz/c$c;", "", "", "barcode", "", "selected", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gz.c$c  reason: collision with other inner class name */
    public static final class C3133c {

        /* renamed from: a  reason: collision with root package name */
        private final String f127406a;

        /* renamed from: b  reason: collision with root package name */
        private final int f127407b;

        public C3133c(String str, int i10) {
            C17542s.j(str, "barcode");
            this.f127406a = str;
            this.f127407b = i10;
        }

        public final String a() {
            return this.f127406a;
        }

        public final int b() {
            return this.f127407b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3133c)) {
                return false;
            }
            C3133c cVar = (C3133c) obj;
            return C17542s.e(this.f127406a, cVar.f127406a) && this.f127407b == cVar.f127407b;
        }

        public int hashCode() {
            return (this.f127406a.hashCode() * 31) + Integer.hashCode(this.f127407b);
        }

        public String toString() {
            String str = this.f127406a;
            int i10 = this.f127407b;
            return "QuantityUpdater(barcode=" + str + ", selected=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgz/c$d;", "", "", "barcode", "", "isSkipped", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f127408a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f127409b;

        public d(String str, boolean z10) {
            C17542s.j(str, "barcode");
            this.f127408a = str;
            this.f127409b = z10;
        }

        public final String a() {
            return this.f127408a;
        }

        public final boolean b() {
            return this.f127409b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f127408a, dVar.f127408a) && this.f127409b == dVar.f127409b;
        }

        public int hashCode() {
            return (this.f127408a.hashCode() * 31) + Boolean.hashCode(this.f127409b);
        }

        public String toString() {
            String str = this.f127408a;
            boolean z10 = this.f127409b;
            return "SkippedUpdater(barcode=" + str + ", isSkipped=" + z10 + ")";
        }
    }

    public c(String str, long j10, ProductLiteRemote productLiteRemote, double d10, double d11, boolean z10, QuantityPickerDataModel quantityPickerDataModel, C15031y yVar, C14523a aVar, boolean z11) {
        C17542s.j(str, "barcode");
        C17542s.j(yVar, "type");
        C17542s.j(aVar, "itemLocation");
        this.f127387a = str;
        this.f127388b = j10;
        this.f127389c = productLiteRemote;
        this.f127390d = d10;
        this.f127391e = d11;
        this.f127392f = z10;
        this.f127393g = quantityPickerDataModel;
        this.f127394h = yVar;
        this.f127395i = aVar;
        this.f127396j = z11;
    }

    public static /* synthetic */ c b(c cVar, String str, long j10, ProductLiteRemote productLiteRemote, double d10, double d11, boolean z10, QuantityPickerDataModel quantityPickerDataModel, C15031y yVar, C14523a aVar, boolean z11, int i10, Object obj) {
        c cVar2 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar2.f127387a : str, (i11 & 2) != 0 ? cVar2.f127388b : j10, (i11 & 4) != 0 ? cVar2.f127389c : productLiteRemote, (i11 & 8) != 0 ? cVar2.f127390d : d10, (i11 & 16) != 0 ? cVar2.f127391e : d11, (i11 & 32) != 0 ? cVar2.f127392f : z10, (i11 & 64) != 0 ? cVar2.f127393g : quantityPickerDataModel, (i11 & 128) != 0 ? cVar2.f127394h : yVar, (i11 & 256) != 0 ? cVar2.f127395i : aVar, (i11 & 512) != 0 ? cVar2.f127396j : z11);
    }

    public final c a(String str, long j10, ProductLiteRemote productLiteRemote, double d10, double d11, boolean z10, QuantityPickerDataModel quantityPickerDataModel, C15031y yVar, C14523a aVar, boolean z11) {
        String str2 = str;
        C17542s.j(str2, "barcode");
        C15031y yVar2 = yVar;
        C17542s.j(yVar2, "type");
        C14523a aVar2 = aVar;
        C17542s.j(aVar2, "itemLocation");
        return new c(str2, j10, productLiteRemote, d10, d11, z10, quantityPickerDataModel, yVar2, aVar2, z11);
    }

    public final String c() {
        return this.f127387a;
    }

    public final boolean d() {
        return this.f127392f;
    }

    public final double e() {
        return this.f127391e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f127387a, cVar.f127387a) && this.f127388b == cVar.f127388b && C17542s.e(this.f127389c, cVar.f127389c) && Double.compare(this.f127390d, cVar.f127390d) == 0 && Double.compare(this.f127391e, cVar.f127391e) == 0 && this.f127392f == cVar.f127392f && C17542s.e(this.f127393g, cVar.f127393g) && this.f127394h == cVar.f127394h && C17542s.e(this.f127395i, cVar.f127395i) && this.f127396j == cVar.f127396j;
    }

    public final double f() {
        return this.f127390d;
    }

    public final C14523a g() {
        return this.f127395i;
    }

    public final ProductLiteRemote h() {
        return this.f127389c;
    }

    public int hashCode() {
        int hashCode = ((this.f127387a.hashCode() * 31) + Long.hashCode(this.f127388b)) * 31;
        ProductLiteRemote productLiteRemote = this.f127389c;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (productLiteRemote == null ? 0 : productLiteRemote.hashCode())) * 31) + Double.hashCode(this.f127390d)) * 31) + Double.hashCode(this.f127391e)) * 31) + Boolean.hashCode(this.f127392f)) * 31;
        QuantityPickerDataModel quantityPickerDataModel = this.f127393g;
        if (quantityPickerDataModel != null) {
            i10 = quantityPickerDataModel.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + this.f127394h.hashCode()) * 31) + this.f127395i.hashCode()) * 31) + Boolean.hashCode(this.f127396j);
    }

    public final QuantityPickerDataModel i() {
        return this.f127393g;
    }

    public final long j() {
        return this.f127388b;
    }

    public final C15031y k() {
        return this.f127394h;
    }

    public final boolean l() {
        return this.f127396j;
    }

    public String toString() {
        String str = this.f127387a;
        long j10 = this.f127388b;
        ProductLiteRemote productLiteRemote = this.f127389c;
        double d10 = this.f127390d;
        double d11 = this.f127391e;
        boolean z10 = this.f127392f;
        QuantityPickerDataModel quantityPickerDataModel = this.f127393g;
        C15031y yVar = this.f127394h;
        C14523a aVar = this.f127395i;
        boolean z11 = this.f127396j;
        return "ScanAndGoCartItemDatabaseModel(barcode=" + str + ", timeStamp=" + j10 + ", productLite=" + productLiteRemote + ", inclTax=" + d10 + ", exclTax=" + d11 + ", collected=" + z10 + ", quantityPicker=" + quantityPickerDataModel + ", type=" + yVar + ", itemLocation=" + aVar + ", isSkipped=" + z11 + ")";
    }
}
