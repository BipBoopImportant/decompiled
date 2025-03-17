package Kg;

import KJ.C15987c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.m;
import lp.C11559a;
import mp.C11588a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LKg/a;", "", "<init>", "()V", "a", "f", "e", "c", "b", "d", "LKg/a$a;", "LKg/a$b;", "LKg/a$c;", "LKg/a$d;", "LKg/a$e;", "LKg/a$f;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKg/a$a;", "LKg/a;", "", "Lzr/d;", "inspirationFilters", "currentSelectedInspirationFilter", "<init>", "(Ljava/util/List;Lzr/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lzr/d;", "getCurrentSelectedInspirationFilter", "()Lzr/d;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kg.a$a  reason: collision with other inner class name */
    public static final class C1021a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final List<zr.d> f61529a;

        /* renamed from: b  reason: collision with root package name */
        private final zr.d f61530b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1021a(List<zr.d> list, zr.d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "inspirationFilters");
            C17542s.j(dVar, "currentSelectedInspirationFilter");
            this.f61529a = list;
            this.f61530b = dVar;
        }

        public final List<zr.d> a() {
            return this.f61529a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1021a)) {
                return false;
            }
            C1021a aVar = (C1021a) obj;
            return C17542s.e(this.f61529a, aVar.f61529a) && C17542s.e(this.f61530b, aVar.f61530b);
        }

        public int hashCode() {
            return (this.f61529a.hashCode() * 31) + this.f61530b.hashCode();
        }

        public String toString() {
            List<zr.d> list = this.f61529a;
            zr.d dVar = this.f61530b;
            return "Filters(inspirationFilters=" + list + ", currentSelectedInspirationFilter=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LKg/a$b;", "LKg/a;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f61531a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            this.f61531a = str;
        }

        public final String a() {
            return this.f61531a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f61531a, ((b) obj).f61531a);
        }

        public int hashCode() {
            return this.f61531a.hashCode();
        }

        public String toString() {
            String str = this.f61531a;
            return "Header(title=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LKg/a$c;", "LKg/a;", "Lmp/a;", "feedItem", "<init>", "(Lmp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmp/a;", "()Lmp/a;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C11588a f61532a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C11588a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "feedItem");
            this.f61532a = aVar;
        }

        public final C11588a a() {
            return this.f61532a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f61532a, ((c) obj).f61532a);
        }

        public int hashCode() {
            return this.f61532a.hashCode();
        }

        public String toString() {
            C11588a aVar = this.f61532a;
            return "ImageSection(feedItem=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LKg/a$d;", "LKg/a;", "LKJ/c;", "", "publisherDiagnostics", "<init>", "(LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<String> f61533a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C15987c<String> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "publisherDiagnostics");
            this.f61533a = cVar;
        }

        public final C15987c<String> a() {
            return this.f61533a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f61533a, ((d) obj).f61533a);
        }

        public int hashCode() {
            return this.f61533a.hashCode();
        }

        public String toString() {
            C15987c<String> cVar = this.f61533a;
            return "PublisherDiagnostics(publisherDiagnostics=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"LKg/a$e;", "LKg/a;", "", "title", "LKJ/c;", "Llp/a;", "stories", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LKJ/c;", "()LKJ/c;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f61534a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C11559a> f61535b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, C15987c<C11559a> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "stories");
            this.f61534a = str;
            this.f61535b = cVar;
        }

        public final C15987c<C11559a> a() {
            return this.f61535b;
        }

        public final String b() {
            return this.f61534a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f61534a, eVar.f61534a) && C17542s.e(this.f61535b, eVar.f61535b);
        }

        public int hashCode() {
            String str = this.f61534a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f61535b.hashCode();
        }

        public String toString() {
            String str = this.f61534a;
            C15987c<C11559a> cVar = this.f61535b;
            return "StoryCarouselSection(title=" + str + ", stories=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LKg/a$f;", "LKg/a;", "Lkp/m;", "visualMessage", "<init>", "(Lkp/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/m;", "()Lkp/m;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        private final m f61536a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(m mVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(mVar, "visualMessage");
            this.f61536a = mVar;
        }

        public final m a() {
            return this.f61536a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f61536a, ((f) obj).f61536a);
        }

        public int hashCode() {
            return this.f61536a.hashCode();
        }

        public String toString() {
            m mVar = this.f61536a;
            return "VisualMessageSection(visualMessage=" + mVar + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
