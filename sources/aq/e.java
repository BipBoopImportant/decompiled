package aq;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Laq/e;", "", "<init>", "()V", "b", "c", "a", "Laq/e$a;", "Laq/e$b;", "Laq/e$c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laq/e$a;", "Laq/e;", "Lcom/ingka/ikea/core/model/Image;", "productImage", "<init>", "(Lcom/ingka/ikea/core/model/Image;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final Image f90418a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Image image) {
            super((DefaultConstructorMarker) null);
            C17542s.j(image, "productImage");
            this.f90418a = image;
        }

        public final Image a() {
            return this.f90418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f90418a, ((a) obj).f90418a);
        }

        public int hashCode() {
            return this.f90418a.hashCode();
        }

        public String toString() {
            Image image = this.f90418a;
            return "Product(productImage=" + image + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laq/e$b;", "Laq/e;", "Lcom/ingka/ikea/core/model/Media;", "media", "<init>", "(Lcom/ingka/ikea/core/model/Media;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Media;", "()Lcom/ingka/ikea/core/model/Media;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final Media f90419a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Media media) {
            super((DefaultConstructorMarker) null);
            C17542s.j(media, "media");
            this.f90419a = media;
        }

        public final Media a() {
            return this.f90419a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f90419a, ((b) obj).f90419a);
        }

        public int hashCode() {
            return this.f90419a.hashCode();
        }

        public String toString() {
            Media media = this.f90419a;
            return "StoryMedia(media=" + media + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Laq/e$c;", "Laq/e;", "", "teaserDescription", "Laq/c;", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Laq/c;Laq/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Laq/c;", "c", "()Laq/c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        private final String f90420a;

        /* renamed from: b  reason: collision with root package name */
        private final c f90421b;

        /* renamed from: c  reason: collision with root package name */
        private final c f90422c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, c cVar, c cVar2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "teaserDescription");
            C17542s.j(cVar, "textColor");
            C17542s.j(cVar2, "backgroundColor");
            this.f90420a = str;
            this.f90421b = cVar;
            this.f90422c = cVar2;
        }

        public final c a() {
            return this.f90422c;
        }

        public final String b() {
            return this.f90420a;
        }

        public final c c() {
            return this.f90421b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f90420a, cVar.f90420a) && C17542s.e(this.f90421b, cVar.f90421b) && C17542s.e(this.f90422c, cVar.f90422c);
        }

        public int hashCode() {
            return (((this.f90420a.hashCode() * 31) + this.f90421b.hashCode()) * 31) + this.f90422c.hashCode();
        }

        public String toString() {
            String str = this.f90420a;
            c cVar = this.f90421b;
            c cVar2 = this.f90422c;
            return "Teaser(teaserDescription=" + str + ", textColor=" + cVar + ", backgroundColor=" + cVar2 + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
