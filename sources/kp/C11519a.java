package kp;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lkp/a;", "LxB/a;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "h", "title", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "image", "g", "body", "a", "b", "Lkp/a$a;", "Lkp/a$b;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kp.a  reason: case insensitive filesystem */
public abstract class C11519a implements C15201a {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lkp/a$a;", "Lkp/a;", "", "id", "title", "Lcom/ingka/ikea/core/model/Image;", "image", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "h", "c", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "d", "g", "", "e", "J", "f", "()J", "stableId", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kp.a$a  reason: collision with other inner class name */
    public static final class C2243a extends C11519a {

        /* renamed from: a  reason: collision with root package name */
        private final String f99021a;

        /* renamed from: b  reason: collision with root package name */
        private final String f99022b;

        /* renamed from: c  reason: collision with root package name */
        private final Image f99023c;

        /* renamed from: d  reason: collision with root package name */
        private final String f99024d;

        /* renamed from: e  reason: collision with root package name */
        private final long f99025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2243a(String str, String str2, Image image, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            C17542s.j(image, "image");
            this.f99021a = str;
            this.f99022b = str2;
            this.f99023c = image;
            this.f99024d = str3;
            String id2 = getId();
            U u10 = new U(3);
            u10.a(P.b(C2243a.class));
            u10.a(id2);
            u10.b(new Object[0]);
            this.f99025e = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2243a)) {
                return false;
            }
            C2243a aVar = (C2243a) obj;
            return C17542s.e(this.f99021a, aVar.f99021a) && C17542s.e(this.f99022b, aVar.f99022b) && C17542s.e(this.f99023c, aVar.f99023c) && C17542s.e(this.f99024d, aVar.f99024d);
        }

        public long f() {
            return this.f99025e;
        }

        public String g() {
            return this.f99024d;
        }

        public String getId() {
            return this.f99021a;
        }

        public String h() {
            return this.f99022b;
        }

        public int hashCode() {
            int hashCode = ((((this.f99021a.hashCode() * 31) + this.f99022b.hashCode()) * 31) + this.f99023c.hashCode()) * 31;
            String str = this.f99024d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public Image k() {
            return this.f99023c;
        }

        public String toString() {
            String str = this.f99021a;
            String str2 = this.f99022b;
            Image image = this.f99023c;
            String str3 = this.f99024d;
            return "CommunicationPost(id=" + str + ", title=" + str2 + ", image=" + image + ", body=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006*"}, d2 = {"Lkp/a$b;", "Lkp/a;", "", "id", "title", "Lcom/ingka/ikea/core/model/Image;", "image", "body", "Lcom/ingka/ikea/core/model/Link;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Lcom/ingka/ikea/core/model/Link;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "h", "c", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "d", "g", "e", "Lcom/ingka/ikea/core/model/Link;", "i", "()Lcom/ingka/ikea/core/model/Link;", "", "f", "J", "()J", "stableId", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kp.a$b */
    public static final class b extends C11519a {

        /* renamed from: a  reason: collision with root package name */
        private final String f99026a;

        /* renamed from: b  reason: collision with root package name */
        private final String f99027b;

        /* renamed from: c  reason: collision with root package name */
        private final Image f99028c;

        /* renamed from: d  reason: collision with root package name */
        private final String f99029d;

        /* renamed from: e  reason: collision with root package name */
        private final Link f99030e;

        /* renamed from: f  reason: collision with root package name */
        private final long f99031f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Image image, String str3, Link link) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            C17542s.j(image, "image");
            C17542s.j(link, "link");
            this.f99026a = str;
            this.f99027b = str2;
            this.f99028c = image;
            this.f99029d = str3;
            this.f99030e = link;
            String id2 = getId();
            U u10 = new U(3);
            u10.a(P.b(b.class));
            u10.a(id2);
            u10.b(new Object[0]);
            this.f99031f = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f99026a, bVar.f99026a) && C17542s.e(this.f99027b, bVar.f99027b) && C17542s.e(this.f99028c, bVar.f99028c) && C17542s.e(this.f99029d, bVar.f99029d) && C17542s.e(this.f99030e, bVar.f99030e);
        }

        public long f() {
            return this.f99031f;
        }

        public String g() {
            return this.f99029d;
        }

        public String getId() {
            return this.f99026a;
        }

        public String h() {
            return this.f99027b;
        }

        public int hashCode() {
            int hashCode = ((((this.f99026a.hashCode() * 31) + this.f99027b.hashCode()) * 31) + this.f99028c.hashCode()) * 31;
            String str = this.f99029d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f99030e.hashCode();
        }

        public final Link i() {
            return this.f99030e;
        }

        public Image k() {
            return this.f99028c;
        }

        public String toString() {
            String str = this.f99026a;
            String str2 = this.f99027b;
            Image image = this.f99028c;
            String str3 = this.f99029d;
            Link link = this.f99030e;
            return "ContentPromotion(id=" + str + ", title=" + str2 + ", image=" + image + ", body=" + str3 + ", link=" + link + ")";
        }
    }

    public /* synthetic */ C11519a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String g();

    public abstract String getId();

    public abstract String h();

    public abstract Image k();

    private C11519a() {
    }
}
