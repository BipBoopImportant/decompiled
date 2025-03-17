package Iq;

import IC.C13023e;
import com.ingka.ikea.core.model.Image;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LIq/a;", "LxB/a;", "", "getId", "()Ljava/lang/String;", "id", "LIC/e;", "getTitle", "()LIC/e;", "title", "l", "label", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "image", "m", "category", "c", "b", "d", "a", "LIq/a$b;", "LIq/a$c;", "LIq/a$d;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a extends C15201a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIq/a$a;", "", "a", "b", "LIq/a$a$a;", "LIq/a$a$b;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iq.a$a  reason: collision with other inner class name */
    public interface C1605a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIq/a$a$a;", "LIq/a$a;", "LIq/a;", "card", "<init>", "(LIq/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIq/a;", "()LIq/a;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iq.a$a$a  reason: collision with other inner class name */
        public static final class C1606a implements C1605a {

            /* renamed from: a  reason: collision with root package name */
            private final a f81944a;

            public C1606a(a aVar) {
                C17542s.j(aVar, "card");
                this.f81944a = aVar;
            }

            public final a a() {
                return this.f81944a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1606a) && C17542s.e(this.f81944a, ((C1606a) obj).f81944a);
            }

            public int hashCode() {
                return this.f81944a.hashCode();
            }

            public String toString() {
                a aVar = this.f81944a;
                return "CardClicked(card=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIq/a$a$b;", "LIq/a$a;", "LIq/a;", "card", "<init>", "(LIq/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIq/a;", "()LIq/a;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iq.a$a$b */
        public static final class b implements C1605a {

            /* renamed from: a  reason: collision with root package name */
            private final a f81945a;

            public b(a aVar) {
                C17542s.j(aVar, "card");
                this.f81945a = aVar;
            }

            public final a a() {
                return this.f81945a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f81945a, ((b) obj).f81945a);
            }

            public int hashCode() {
                return this.f81945a.hashCode();
            }

            public String toString() {
                a aVar = this.f81945a;
                return "UseRewardClicked(card=" + aVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010,\u001a\u00020)8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+¨\u0006-"}, d2 = {"LIq/a$b;", "LIq/a;", "", "id", "LIC/e;", "title", "label", "Lcom/ingka/ikea/core/model/Image;", "image", "category", "", "costInPoints", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "l", "d", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "e", "m", "f", "I", "g", "", "J", "()J", "stableId", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f81946a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f81947b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f81948c;

        /* renamed from: d  reason: collision with root package name */
        private final Image f81949d;

        /* renamed from: e  reason: collision with root package name */
        private final String f81950e;

        /* renamed from: f  reason: collision with root package name */
        private final int f81951f;

        /* renamed from: g  reason: collision with root package name */
        private final long f81952g;

        public b(String str, C13023e eVar, C13023e eVar2, Image image, String str2, int i10) {
            C17542s.j(str, "id");
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "label");
            C17542s.j(str2, "category");
            this.f81946a = str;
            this.f81947b = eVar;
            this.f81948c = eVar2;
            this.f81949d = image;
            this.f81950e = str2;
            this.f81951f = i10;
            String id2 = getId();
            U u10 = new U(3);
            u10.a(P.b(b.class));
            u10.a(id2);
            u10.b(new Object[0]);
            this.f81952g = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f81946a, bVar.f81946a) && C17542s.e(this.f81947b, bVar.f81947b) && C17542s.e(this.f81948c, bVar.f81948c) && C17542s.e(this.f81949d, bVar.f81949d) && C17542s.e(this.f81950e, bVar.f81950e) && this.f81951f == bVar.f81951f;
        }

        public long f() {
            return this.f81952g;
        }

        public final int g() {
            return this.f81951f;
        }

        public String getId() {
            return this.f81946a;
        }

        public C13023e getTitle() {
            return this.f81947b;
        }

        public int hashCode() {
            int hashCode = ((((this.f81946a.hashCode() * 31) + this.f81947b.hashCode()) * 31) + this.f81948c.hashCode()) * 31;
            Image image = this.f81949d;
            return ((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f81950e.hashCode()) * 31) + Integer.hashCode(this.f81951f);
        }

        public Image k() {
            return this.f81949d;
        }

        public C13023e l() {
            return this.f81948c;
        }

        public String m() {
            return this.f81950e;
        }

        public String toString() {
            String str = this.f81946a;
            C13023e eVar = this.f81947b;
            C13023e eVar2 = this.f81948c;
            Image image = this.f81949d;
            String str2 = this.f81950e;
            int i10 = this.f81951f;
            return "Available(id=" + str + ", title=" + eVar + ", label=" + eVar2 + ", image=" + image + ", category=" + str2 + ", costInPoints=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LIq/a$c;", "LIq/a;", "d", "c", "a", "b", "LIq/a$c$a;", "LIq/a$c$b;", "LIq/a$c$c;", "LIq/a$c$d;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends a {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u000fR\u001a\u0010,\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b&\u0010+¨\u0006-"}, d2 = {"LIq/a$c$a;", "LIq/a$c;", "", "", "id", "LIC/e;", "title", "label", "Lcom/ingka/ikea/core/model/Image;", "image", "category", "instoreDiscountCode", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "l", "d", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "e", "m", "f", "getInstoreDiscountCode", "", "g", "J", "()J", "stableId", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iq.a$c$a  reason: collision with other inner class name */
        public static final class C1607a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final String f81953a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f81954b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f81955c;

            /* renamed from: d  reason: collision with root package name */
            private final Image f81956d;

            /* renamed from: e  reason: collision with root package name */
            private final String f81957e;

            /* renamed from: f  reason: collision with root package name */
            private final String f81958f;

            /* renamed from: g  reason: collision with root package name */
            private final long f81959g;

            public C1607a(String str, C13023e eVar, C13023e eVar2, Image image, String str2, String str3) {
                C17542s.j(str, "id");
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "label");
                C17542s.j(str2, "category");
                C17542s.j(str3, "instoreDiscountCode");
                this.f81953a = str;
                this.f81954b = eVar;
                this.f81955c = eVar2;
                this.f81956d = image;
                this.f81957e = str2;
                this.f81958f = str3;
                String id2 = getId();
                U u10 = new U(3);
                u10.a(P.b(C1607a.class));
                u10.a(id2);
                u10.b(new Object[0]);
                this.f81959g = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1607a)) {
                    return false;
                }
                C1607a aVar = (C1607a) obj;
                return C17542s.e(this.f81953a, aVar.f81953a) && C17542s.e(this.f81954b, aVar.f81954b) && C17542s.e(this.f81955c, aVar.f81955c) && C17542s.e(this.f81956d, aVar.f81956d) && C17542s.e(this.f81957e, aVar.f81957e) && C17542s.e(this.f81958f, aVar.f81958f);
            }

            public long f() {
                return this.f81959g;
            }

            public String getId() {
                return this.f81953a;
            }

            public C13023e getTitle() {
                return this.f81954b;
            }

            public int hashCode() {
                int hashCode = ((((this.f81953a.hashCode() * 31) + this.f81954b.hashCode()) * 31) + this.f81955c.hashCode()) * 31;
                Image image = this.f81956d;
                return ((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f81957e.hashCode()) * 31) + this.f81958f.hashCode();
            }

            public Image k() {
                return this.f81956d;
            }

            public C13023e l() {
                return this.f81955c;
            }

            public String m() {
                return this.f81957e;
            }

            public String toString() {
                String str = this.f81953a;
                C13023e eVar = this.f81954b;
                C13023e eVar2 = this.f81955c;
                Image image = this.f81956d;
                String str2 = this.f81957e;
                String str3 = this.f81958f;
                return "Instore(id=" + str + ", title=" + eVar + ", label=" + eVar2 + ", image=" + image + ", category=" + str2 + ", instoreDiscountCode=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b \u0010\u0011R\u001a\u0010/\u001a\u00020+8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.¨\u00060"}, d2 = {"LIq/a$c$b;", "LIq/a$c;", "LIq/a$c$d;", "", "", "id", "LIC/e;", "title", "label", "Lcom/ingka/ikea/core/model/Image;", "image", "category", "instoreDiscountCode", "onlineDiscountCode", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "l", "d", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "e", "m", "f", "getInstoreDiscountCode", "g", "", "h", "J", "()J", "stableId", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements c, d {

            /* renamed from: a  reason: collision with root package name */
            private final String f81960a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f81961b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f81962c;

            /* renamed from: d  reason: collision with root package name */
            private final Image f81963d;

            /* renamed from: e  reason: collision with root package name */
            private final String f81964e;

            /* renamed from: f  reason: collision with root package name */
            private final String f81965f;

            /* renamed from: g  reason: collision with root package name */
            private final String f81966g;

            /* renamed from: h  reason: collision with root package name */
            private final long f81967h;

            public b(String str, C13023e eVar, C13023e eVar2, Image image, String str2, String str3, String str4) {
                C17542s.j(str, "id");
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "label");
                C17542s.j(str2, "category");
                C17542s.j(str3, "instoreDiscountCode");
                C17542s.j(str4, "onlineDiscountCode");
                this.f81960a = str;
                this.f81961b = eVar;
                this.f81962c = eVar2;
                this.f81963d = image;
                this.f81964e = str2;
                this.f81965f = str3;
                this.f81966g = str4;
                String id2 = getId();
                U u10 = new U(3);
                u10.a(P.b(b.class));
                u10.a(id2);
                u10.b(new Object[0]);
                this.f81967h = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public String c() {
                return this.f81966g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f81960a, bVar.f81960a) && C17542s.e(this.f81961b, bVar.f81961b) && C17542s.e(this.f81962c, bVar.f81962c) && C17542s.e(this.f81963d, bVar.f81963d) && C17542s.e(this.f81964e, bVar.f81964e) && C17542s.e(this.f81965f, bVar.f81965f) && C17542s.e(this.f81966g, bVar.f81966g);
            }

            public long f() {
                return this.f81967h;
            }

            public String getId() {
                return this.f81960a;
            }

            public C13023e getTitle() {
                return this.f81961b;
            }

            public int hashCode() {
                int hashCode = ((((this.f81960a.hashCode() * 31) + this.f81961b.hashCode()) * 31) + this.f81962c.hashCode()) * 31;
                Image image = this.f81963d;
                return ((((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f81964e.hashCode()) * 31) + this.f81965f.hashCode()) * 31) + this.f81966g.hashCode();
            }

            public Image k() {
                return this.f81963d;
            }

            public C13023e l() {
                return this.f81962c;
            }

            public String m() {
                return this.f81964e;
            }

            public String toString() {
                String str = this.f81960a;
                C13023e eVar = this.f81961b;
                C13023e eVar2 = this.f81962c;
                Image image = this.f81963d;
                String str2 = this.f81964e;
                String str3 = this.f81965f;
                String str4 = this.f81966g;
                return "Multi(id=" + str + ", title=" + eVar + ", label=" + eVar2 + ", image=" + image + ", category=" + str2 + ", instoreDiscountCode=" + str3 + ", onlineDiscountCode=" + str4 + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010,\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010+¨\u0006-"}, d2 = {"LIq/a$c$c;", "LIq/a$c;", "LIq/a$c$d;", "", "id", "LIC/e;", "title", "label", "Lcom/ingka/ikea/core/model/Image;", "image", "category", "onlineDiscountCode", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "l", "d", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "e", "m", "f", "", "g", "J", "()J", "stableId", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iq.a$c$c  reason: collision with other inner class name */
        public static final class C1608c implements c, d {

            /* renamed from: a  reason: collision with root package name */
            private final String f81968a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f81969b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f81970c;

            /* renamed from: d  reason: collision with root package name */
            private final Image f81971d;

            /* renamed from: e  reason: collision with root package name */
            private final String f81972e;

            /* renamed from: f  reason: collision with root package name */
            private final String f81973f;

            /* renamed from: g  reason: collision with root package name */
            private final long f81974g;

            public C1608c(String str, C13023e eVar, C13023e eVar2, Image image, String str2, String str3) {
                C17542s.j(str, "id");
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "label");
                C17542s.j(str2, "category");
                C17542s.j(str3, "onlineDiscountCode");
                this.f81968a = str;
                this.f81969b = eVar;
                this.f81970c = eVar2;
                this.f81971d = image;
                this.f81972e = str2;
                this.f81973f = str3;
                String id2 = getId();
                U u10 = new U(3);
                u10.a(P.b(C1608c.class));
                u10.a(id2);
                u10.b(new Object[0]);
                this.f81974g = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public String c() {
                return this.f81973f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1608c)) {
                    return false;
                }
                C1608c cVar = (C1608c) obj;
                return C17542s.e(this.f81968a, cVar.f81968a) && C17542s.e(this.f81969b, cVar.f81969b) && C17542s.e(this.f81970c, cVar.f81970c) && C17542s.e(this.f81971d, cVar.f81971d) && C17542s.e(this.f81972e, cVar.f81972e) && C17542s.e(this.f81973f, cVar.f81973f);
            }

            public long f() {
                return this.f81974g;
            }

            public String getId() {
                return this.f81968a;
            }

            public C13023e getTitle() {
                return this.f81969b;
            }

            public int hashCode() {
                int hashCode = ((((this.f81968a.hashCode() * 31) + this.f81969b.hashCode()) * 31) + this.f81970c.hashCode()) * 31;
                Image image = this.f81971d;
                return ((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f81972e.hashCode()) * 31) + this.f81973f.hashCode();
            }

            public Image k() {
                return this.f81971d;
            }

            public C13023e l() {
                return this.f81970c;
            }

            public String m() {
                return this.f81972e;
            }

            public String toString() {
                String str = this.f81968a;
                C13023e eVar = this.f81969b;
                C13023e eVar2 = this.f81970c;
                Image image = this.f81971d;
                String str2 = this.f81972e;
                String str3 = this.f81973f;
                return "Online(id=" + str + ", title=" + eVar + ", label=" + eVar2 + ", image=" + image + ", category=" + str2 + ", onlineDiscountCode=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LIq/a$c$d;", "LIq/a$c;", "", "c", "()Ljava/lang/String;", "onlineDiscountCode", "LIq/a$c$b;", "LIq/a$c$c;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface d extends c {
            String c();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010,\u001a\u00020)8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+¨\u0006-"}, d2 = {"LIq/a$d;", "LIq/a;", "", "id", "LIC/e;", "title", "label", "Lcom/ingka/ikea/core/model/Image;", "image", "category", "", "costInPoints", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "l", "d", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "e", "m", "f", "I", "g", "", "J", "()J", "stableId", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f81975a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f81976b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f81977c;

        /* renamed from: d  reason: collision with root package name */
        private final Image f81978d;

        /* renamed from: e  reason: collision with root package name */
        private final String f81979e;

        /* renamed from: f  reason: collision with root package name */
        private final int f81980f;

        /* renamed from: g  reason: collision with root package name */
        private final long f81981g;

        public d(String str, C13023e eVar, C13023e eVar2, Image image, String str2, int i10) {
            C17542s.j(str, "id");
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "label");
            C17542s.j(str2, "category");
            this.f81975a = str;
            this.f81976b = eVar;
            this.f81977c = eVar2;
            this.f81978d = image;
            this.f81979e = str2;
            this.f81980f = i10;
            String id2 = getId();
            U u10 = new U(3);
            u10.a(P.b(d.class));
            u10.a(id2);
            u10.b(new Object[0]);
            this.f81981g = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f81975a, dVar.f81975a) && C17542s.e(this.f81976b, dVar.f81976b) && C17542s.e(this.f81977c, dVar.f81977c) && C17542s.e(this.f81978d, dVar.f81978d) && C17542s.e(this.f81979e, dVar.f81979e) && this.f81980f == dVar.f81980f;
        }

        public long f() {
            return this.f81981g;
        }

        public final int g() {
            return this.f81980f;
        }

        public String getId() {
            return this.f81975a;
        }

        public C13023e getTitle() {
            return this.f81976b;
        }

        public int hashCode() {
            int hashCode = ((((this.f81975a.hashCode() * 31) + this.f81976b.hashCode()) * 31) + this.f81977c.hashCode()) * 31;
            Image image = this.f81978d;
            return ((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f81979e.hashCode()) * 31) + Integer.hashCode(this.f81980f);
        }

        public Image k() {
            return this.f81978d;
        }

        public C13023e l() {
            return this.f81977c;
        }

        public String m() {
            return this.f81979e;
        }

        public String toString() {
            String str = this.f81975a;
            C13023e eVar = this.f81976b;
            C13023e eVar2 = this.f81977c;
            Image image = this.f81978d;
            String str2 = this.f81979e;
            int i10 = this.f81980f;
            return "Unavailable(id=" + str + ", title=" + eVar + ", label=" + eVar2 + ", image=" + image + ", category=" + str2 + ", costInPoints=" + i10 + ")";
        }
    }

    String getId();

    C13023e getTitle();

    Image k();

    C13023e l();

    String m();
}
