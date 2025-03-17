package nF;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LnF/b;", "", "<init>", "()V", "a", "b", "LnF/b$a;", "LnF/b$b;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nF.b  reason: case insensitive filesystem */
public abstract class C14851b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f129813a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LnF/b$a;", "LnF/b;", "LnF/d;", "media", "<init>", "(LnF/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LnF/d;", "a", "()LnF/d;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nF.b$a */
    public static final class a extends C14851b {

        /* renamed from: b  reason: collision with root package name */
        private final C14853d f129814b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C14853d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "media");
            this.f129814b = dVar;
        }

        public final C14853d a() {
            return this.f129814b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f129814b, ((a) obj).f129814b);
        }

        public int hashCode() {
            return this.f129814b.hashCode();
        }

        public String toString() {
            C14853d dVar = this.f129814b;
            return "Banner(media=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LnF/b$b;", "LnF/b;", "", "label", "title", "", "LnF/a;", "carouselItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nF.b$b  reason: collision with other inner class name */
    public static final class C3193b extends C14851b {

        /* renamed from: b  reason: collision with root package name */
        private final String f129815b;

        /* renamed from: c  reason: collision with root package name */
        private final String f129816c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C14850a> f129817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3193b(String str, String str2, List<C14850a> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "carouselItems");
            this.f129815b = str;
            this.f129816c = str2;
            this.f129817d = list;
        }

        public final List<C14850a> a() {
            return this.f129817d;
        }

        public final String b() {
            return this.f129815b;
        }

        public final String c() {
            return this.f129816c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3193b)) {
                return false;
            }
            C3193b bVar = (C3193b) obj;
            return C17542s.e(this.f129815b, bVar.f129815b) && C17542s.e(this.f129816c, bVar.f129816c) && C17542s.e(this.f129817d, bVar.f129817d);
        }

        public int hashCode() {
            String str = this.f129815b;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f129816c;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode + i10) * 31) + this.f129817d.hashCode();
        }

        public String toString() {
            String str = this.f129815b;
            String str2 = this.f129816c;
            List<C14850a> list = this.f129817d;
            return "Carousel(label=" + str + ", title=" + str2 + ", carouselItems=" + list + ")";
        }
    }

    public /* synthetic */ C14851b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14851b() {
    }
}
