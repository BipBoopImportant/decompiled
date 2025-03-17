package com.ingka.ikea.app.stockinfo.local;

import Wk.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/b;", "", "<init>", "()V", "a", "b", "c", "Lcom/ingka/ikea/app/stockinfo/local/b$a;", "Lcom/ingka/ikea/app/stockinfo/local/b$b;", "Lcom/ingka/ikea/app/stockinfo/local/b$c;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\u001e\u0010\u0011¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/b$a;", "Lcom/ingka/ikea/app/stockinfo/local/b;", "", "timestamp", "", "storeId", "itemNo", "itemType", "productLocation", "heading", "title", "description", "aisle", "bin", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "h", "c", "e", "d", "f", "g", "i", "j", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final long f92543a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92544b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92545c;

        /* renamed from: d  reason: collision with root package name */
        private final String f92546d;

        /* renamed from: e  reason: collision with root package name */
        private final String f92547e;

        /* renamed from: f  reason: collision with root package name */
        private final String f92548f;

        /* renamed from: g  reason: collision with root package name */
        private final String f92549g;

        /* renamed from: h  reason: collision with root package name */
        private final String f92550h;

        /* renamed from: i  reason: collision with root package name */
        private final String f92551i;

        /* renamed from: j  reason: collision with root package name */
        private final String f92552j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "storeId");
            C17542s.j(str2, "itemNo");
            C17542s.j(str3, "itemType");
            C17542s.j(str5, "heading");
            C17542s.j(str6, "title");
            C17542s.j(str7, "description");
            this.f92543a = j10;
            this.f92544b = str;
            this.f92545c = str2;
            this.f92546d = str3;
            this.f92547e = str4;
            this.f92548f = str5;
            this.f92549g = str6;
            this.f92550h = str7;
            this.f92551i = str8;
            this.f92552j = str9;
        }

        public final String a() {
            return this.f92551i;
        }

        public final String b() {
            return this.f92552j;
        }

        public final String c() {
            return this.f92550h;
        }

        public final String d() {
            return this.f92548f;
        }

        public final String e() {
            return this.f92545c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f92543a == aVar.f92543a && C17542s.e(this.f92544b, aVar.f92544b) && C17542s.e(this.f92545c, aVar.f92545c) && C17542s.e(this.f92546d, aVar.f92546d) && C17542s.e(this.f92547e, aVar.f92547e) && C17542s.e(this.f92548f, aVar.f92548f) && C17542s.e(this.f92549g, aVar.f92549g) && C17542s.e(this.f92550h, aVar.f92550h) && C17542s.e(this.f92551i, aVar.f92551i) && C17542s.e(this.f92552j, aVar.f92552j);
        }

        public final String f() {
            return this.f92546d;
        }

        public final String g() {
            return this.f92547e;
        }

        public final String h() {
            return this.f92544b;
        }

        public int hashCode() {
            int hashCode = ((((((Long.hashCode(this.f92543a) * 31) + this.f92544b.hashCode()) * 31) + this.f92545c.hashCode()) * 31) + this.f92546d.hashCode()) * 31;
            String str = this.f92547e;
            int i10 = 0;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f92548f.hashCode()) * 31) + this.f92549g.hashCode()) * 31) + this.f92550h.hashCode()) * 31;
            String str2 = this.f92551i;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f92552j;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode3 + i10;
        }

        public final String i() {
            return this.f92549g;
        }

        public String toString() {
            long j10 = this.f92543a;
            String str = this.f92544b;
            String str2 = this.f92545c;
            String str3 = this.f92546d;
            String str4 = this.f92547e;
            String str5 = this.f92548f;
            String str6 = this.f92549g;
            String str7 = this.f92550h;
            String str8 = this.f92551i;
            String str9 = this.f92552j;
            return "ChildStock(timestamp=" + j10 + ", storeId=" + str + ", itemNo=" + str2 + ", itemType=" + str3 + ", productLocation=" + str4 + ", heading=" + str5 + ", title=" + str6 + ", description=" + str7 + ", aisle=" + str8 + ", bin=" + str9 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/b$b;", "Lcom/ingka/ikea/app/stockinfo/local/b;", "<init>", "()V", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.stockinfo.local.b$b  reason: collision with other inner class name */
    public static final class C2056b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C2056b f92553a = new C2056b();

        private C2056b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/b$c;", "Lcom/ingka/ikea/app/stockinfo/local/b;", "LWk/f;", "stockAvailabilityEntity", "<init>", "(LWk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/f;", "()LWk/f;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final f f92554a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(fVar, "stockAvailabilityEntity");
            this.f92554a = fVar;
        }

        public final f a() {
            return this.f92554a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f92554a, ((c) obj).f92554a);
        }

        public int hashCode() {
            return this.f92554a.hashCode();
        }

        public String toString() {
            f fVar = this.f92554a;
            return "Stock(stockAvailabilityEntity=" + fVar + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
