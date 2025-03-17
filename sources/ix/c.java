package ix;

import com.ingka.ikea.core.model.Image;
import com.optimizely.ab.config.FeatureVariable;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001:\u0004\u0012\u001f!#BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b!\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, d2 = {"Lix/c;", "", "", "id", "prepaidCardNumber", "redemptionCode", "qrData", "Lix/c$c;", "state", "expiry", "Lix/c$d;", "type", "Lix/c$a;", "amount", "Lix/c$b;", "images", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lix/c$c;Ljava/lang/String;Lix/c$d;Lix/c$a;Lix/c$b;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lix/c$c;Ljava/lang/String;Lix/c$d;Lix/c$a;Lix/c$b;)Lix/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "g", "c", "i", "d", "h", "Lix/c$c;", "j", "()Lix/c$c;", "f", "Lix/c$d;", "k", "()Lix/c$d;", "Lix/c$a;", "()Lix/c$a;", "Lix/c$b;", "()Lix/c$b;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f127766a;

    /* renamed from: b  reason: collision with root package name */
    private final String f127767b;

    /* renamed from: c  reason: collision with root package name */
    private final String f127768c;

    /* renamed from: d  reason: collision with root package name */
    private final String f127769d;

    /* renamed from: e  reason: collision with root package name */
    private final C3149c f127770e;

    /* renamed from: f  reason: collision with root package name */
    private final String f127771f;

    /* renamed from: g  reason: collision with root package name */
    private final d f127772g;

    /* renamed from: h  reason: collision with root package name */
    private final a f127773h;

    /* renamed from: i  reason: collision with root package name */
    private final b f127774i;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lix/c$a;", "", "", "currentWithCurrency", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f127775a;

        public a(String str) {
            C17542s.j(str, "currentWithCurrency");
            this.f127775a = str;
        }

        public final String a() {
            return this.f127775a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f127775a, ((a) obj).f127775a);
        }

        public int hashCode() {
            return this.f127775a.hashCode();
        }

        public String toString() {
            String str = this.f127775a;
            return "Amount(currentWithCurrency=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lix/c$b;", "", "Lcom/ingka/ikea/core/model/Image;", "portrait", "landscape", "<init>", "(Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Image;", "b", "()Lcom/ingka/ikea/core/model/Image;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Image f127776a;

        /* renamed from: b  reason: collision with root package name */
        private final Image f127777b;

        public b(Image image, Image image2) {
            C17542s.j(image, "portrait");
            C17542s.j(image2, "landscape");
            this.f127776a = image;
            this.f127777b = image2;
        }

        public final Image a() {
            return this.f127777b;
        }

        public final Image b() {
            return this.f127776a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f127776a, bVar.f127776a) && C17542s.e(this.f127777b, bVar.f127777b);
        }

        public int hashCode() {
            return (this.f127776a.hashCode() * 31) + this.f127777b.hashCode();
        }

        public String toString() {
            Image image = this.f127776a;
            Image image2 = this.f127777b;
            return "Images(portrait=" + image + ", landscape=" + image2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lix/c$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "Active", "Expired", "Other", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ix.c$c  reason: collision with other inner class name */
    public enum C3149c {
        Active("ACTIVE"),
        Expired("EXPIRED"),
        Other("");
        
        public static final a Companion = null;
        /* access modifiers changed from: private */
        public final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lix/c$c$a;", "", "<init>", "()V", "", "string", "Lix/c$c;", "a", "(Ljava/lang/String;)Lix/c$c;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ix.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C3149c a(String str) {
                T t10;
                C17542s.j(str, FeatureVariable.STRING_TYPE);
                Iterator<T> it = C3149c.j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((C3149c) t10).value, str)) {
                        break;
                    }
                }
                C3149c cVar = (C3149c) t10;
                return cVar == null ? C3149c.Other : cVar;
            }

            private a() {
            }
        }

        static {
            C3149c[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private C3149c(String str) {
            this.value = str;
        }

        public static C17220a<C3149c> j() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lix/c$d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "GiftCard", "RefundCard", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        GiftCard("GIFT_CARD"),
        RefundCard("REFUND_CARD");
        
        public static final a Companion = null;
        /* access modifiers changed from: private */
        public final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lix/c$d$a;", "", "<init>", "()V", "", "string", "Lix/c$d;", "a", "(Ljava/lang/String;)Lix/c$d;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                C17542s.j(str, FeatureVariable.STRING_TYPE);
                for (d dVar : d.j()) {
                    if (C17542s.e(dVar.value, str)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            private a() {
            }
        }

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private d(String str) {
            this.value = str;
        }

        public static C17220a<d> j() {
            return $ENTRIES;
        }
    }

    public c(String str, String str2, String str3, String str4, C3149c cVar, String str5, d dVar, a aVar, b bVar) {
        C17542s.j(str, "id");
        C17542s.j(str2, "prepaidCardNumber");
        C17542s.j(str3, "redemptionCode");
        C17542s.j(str4, "qrData");
        C17542s.j(cVar, "state");
        C17542s.j(str5, "expiry");
        C17542s.j(dVar, "type");
        C17542s.j(aVar, "amount");
        C17542s.j(bVar, "images");
        this.f127766a = str;
        this.f127767b = str2;
        this.f127768c = str3;
        this.f127769d = str4;
        this.f127770e = cVar;
        this.f127771f = str5;
        this.f127772g = dVar;
        this.f127773h = aVar;
        this.f127774i = bVar;
    }

    public static /* synthetic */ c b(c cVar, String str, String str2, String str3, String str4, C3149c cVar2, String str5, d dVar, a aVar, b bVar, int i10, Object obj) {
        c cVar3 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar3.f127766a : str, (i11 & 2) != 0 ? cVar3.f127767b : str2, (i11 & 4) != 0 ? cVar3.f127768c : str3, (i11 & 8) != 0 ? cVar3.f127769d : str4, (i11 & 16) != 0 ? cVar3.f127770e : cVar2, (i11 & 32) != 0 ? cVar3.f127771f : str5, (i11 & 64) != 0 ? cVar3.f127772g : dVar, (i11 & 128) != 0 ? cVar3.f127773h : aVar, (i11 & 256) != 0 ? cVar3.f127774i : bVar);
    }

    public final c a(String str, String str2, String str3, String str4, C3149c cVar, String str5, d dVar, a aVar, b bVar) {
        C17542s.j(str, "id");
        C17542s.j(str2, "prepaidCardNumber");
        C17542s.j(str3, "redemptionCode");
        C17542s.j(str4, "qrData");
        C3149c cVar2 = cVar;
        C17542s.j(cVar2, "state");
        String str6 = str5;
        C17542s.j(str6, "expiry");
        d dVar2 = dVar;
        C17542s.j(dVar2, "type");
        a aVar2 = aVar;
        C17542s.j(aVar2, "amount");
        b bVar2 = bVar;
        C17542s.j(bVar2, "images");
        return new c(str, str2, str3, str4, cVar2, str6, dVar2, aVar2, bVar2);
    }

    public final a c() {
        return this.f127773h;
    }

    public final String d() {
        return this.f127771f;
    }

    public final String e() {
        return this.f127766a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f127766a, cVar.f127766a) && C17542s.e(this.f127767b, cVar.f127767b) && C17542s.e(this.f127768c, cVar.f127768c) && C17542s.e(this.f127769d, cVar.f127769d) && this.f127770e == cVar.f127770e && C17542s.e(this.f127771f, cVar.f127771f) && this.f127772g == cVar.f127772g && C17542s.e(this.f127773h, cVar.f127773h) && C17542s.e(this.f127774i, cVar.f127774i);
    }

    public final b f() {
        return this.f127774i;
    }

    public final String g() {
        return this.f127767b;
    }

    public final String h() {
        return this.f127769d;
    }

    public int hashCode() {
        return (((((((((((((((this.f127766a.hashCode() * 31) + this.f127767b.hashCode()) * 31) + this.f127768c.hashCode()) * 31) + this.f127769d.hashCode()) * 31) + this.f127770e.hashCode()) * 31) + this.f127771f.hashCode()) * 31) + this.f127772g.hashCode()) * 31) + this.f127773h.hashCode()) * 31) + this.f127774i.hashCode();
    }

    public final String i() {
        return this.f127768c;
    }

    public final C3149c j() {
        return this.f127770e;
    }

    public final d k() {
        return this.f127772g;
    }

    public String toString() {
        String str = this.f127766a;
        String str2 = this.f127767b;
        String str3 = this.f127768c;
        String str4 = this.f127769d;
        C3149c cVar = this.f127770e;
        String str5 = this.f127771f;
        d dVar = this.f127772g;
        a aVar = this.f127773h;
        b bVar = this.f127774i;
        return "PrepaidCard(id=" + str + ", prepaidCardNumber=" + str2 + ", redemptionCode=" + str3 + ", qrData=" + str4 + ", state=" + cVar + ", expiry=" + str5 + ", type=" + dVar + ", amount=" + aVar + ", images=" + bVar + ")";
    }
}
