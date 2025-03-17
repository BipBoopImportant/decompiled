package aq;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11519a;
import kp.m;
import lp.C11559a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Laq/a;", "", "<init>", "()V", "g", "h", "a", "c", "d", "e", "f", "i", "b", "Laq/a$a;", "Laq/a$b;", "Laq/a$c;", "Laq/a$d;", "Laq/a$e;", "Laq/a$f;", "Laq/a$g;", "Laq/a$h;", "Laq/a$i;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aq.a  reason: case insensitive filesystem */
public abstract class C11079a {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Laq/a$a;", "Laq/a;", "", "title", "LKJ/c;", "Lkp/a;", "campaigns", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LKJ/c;", "()LKJ/c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$a  reason: collision with other inner class name */
    public static final class C1960a extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90391a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C11519a> f90392b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1960a(String str, C15987c<? extends C11519a> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            C17542s.j(cVar, "campaigns");
            this.f90391a = str;
            this.f90392b = cVar;
        }

        public final C15987c<C11519a> a() {
            return this.f90392b;
        }

        public final String b() {
            return this.f90391a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1960a)) {
                return false;
            }
            C1960a aVar = (C1960a) obj;
            return C17542s.e(this.f90391a, aVar.f90391a) && C17542s.e(this.f90392b, aVar.f90392b);
        }

        public int hashCode() {
            return (this.f90391a.hashCode() * 31) + this.f90392b.hashCode();
        }

        public String toString() {
            String str = this.f90391a;
            C15987c<C11519a> cVar = this.f90392b;
            return "Campaigns(title=" + str + ", campaigns=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laq/a$b;", "Laq/a;", "Lkp/m;", "visualMessage", "<init>", "(Lkp/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/m;", "()Lkp/m;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$b */
    public static final class b extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final m f90393a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(mVar, "visualMessage");
            this.f90393a = mVar;
        }

        public final m a() {
            return this.f90393a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f90393a, ((b) obj).f90393a);
        }

        public int hashCode() {
            return this.f90393a.hashCode();
        }

        public String toString() {
            m mVar = this.f90393a;
            return "DiscoverVisualMessage(visualMessage=" + mVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Laq/a$c;", "Laq/a;", "", "purpose", "title", "actionTitle", "LKJ/c;", "Laq/d;", "inspirations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "LKJ/c;", "()LKJ/c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$c */
    public static final class c extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90394a;

        /* renamed from: b  reason: collision with root package name */
        private final String f90395b;

        /* renamed from: c  reason: collision with root package name */
        private final String f90396c;

        /* renamed from: d  reason: collision with root package name */
        private final C15987c<d> f90397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, C15987c<d> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "purpose");
            C17542s.j(str2, "title");
            C17542s.j(str3, "actionTitle");
            C17542s.j(cVar, "inspirations");
            this.f90394a = str;
            this.f90395b = str2;
            this.f90396c = str3;
            this.f90397d = cVar;
        }

        public final String a() {
            return this.f90396c;
        }

        public final C15987c<d> b() {
            return this.f90397d;
        }

        public final String c() {
            return this.f90394a;
        }

        public final String d() {
            return this.f90395b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f90394a, cVar.f90394a) && C17542s.e(this.f90395b, cVar.f90395b) && C17542s.e(this.f90396c, cVar.f90396c) && C17542s.e(this.f90397d, cVar.f90397d);
        }

        public int hashCode() {
            return (((((this.f90394a.hashCode() * 31) + this.f90395b.hashCode()) * 31) + this.f90396c.hashCode()) * 31) + this.f90397d.hashCode();
        }

        public String toString() {
            String str = this.f90394a;
            String str2 = this.f90395b;
            String str3 = this.f90396c;
            C15987c<d> cVar = this.f90397d;
            return "InspirationRooms(purpose=" + str + ", title=" + str2 + ", actionTitle=" + str3 + ", inspirations=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laq/a$d;", "Laq/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$d */
    public static final class d extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90398a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -824499511;
        }

        public String toString() {
            return "Kreativ";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laq/a$e;", "Laq/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$e */
    public static final class e extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f90399a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1424074761;
        }

        public String toString() {
            return "LiveShopping";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laq/a$f;", "Laq/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$f */
    public static final class f extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90400a = new f();

        private f() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -2033036402;
        }

        public String toString() {
            return "RecommendationCarousel";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Laq/a$g;", "Laq/a;", "", "storyId", "purpose", "title", "actionTitle", "LKJ/c;", "Laq/e;", "cards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "LKJ/c;", "()LKJ/c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$g */
    public static final class g extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90401a;

        /* renamed from: b  reason: collision with root package name */
        private final String f90402b;

        /* renamed from: c  reason: collision with root package name */
        private final String f90403c;

        /* renamed from: d  reason: collision with root package name */
        private final String f90404d;

        /* renamed from: e  reason: collision with root package name */
        private final C15987c<e> f90405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3, String str4, C15987c<? extends e> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "storyId");
            C17542s.j(str2, "purpose");
            C17542s.j(str3, "title");
            C17542s.j(str4, "actionTitle");
            C17542s.j(cVar, "cards");
            this.f90401a = str;
            this.f90402b = str2;
            this.f90403c = str3;
            this.f90404d = str4;
            this.f90405e = cVar;
        }

        public final String a() {
            return this.f90404d;
        }

        public final C15987c<e> b() {
            return this.f90405e;
        }

        public final String c() {
            return this.f90402b;
        }

        public final String d() {
            return this.f90401a;
        }

        public final String e() {
            return this.f90403c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f90401a, gVar.f90401a) && C17542s.e(this.f90402b, gVar.f90402b) && C17542s.e(this.f90403c, gVar.f90403c) && C17542s.e(this.f90404d, gVar.f90404d) && C17542s.e(this.f90405e, gVar.f90405e);
        }

        public int hashCode() {
            return (((((((this.f90401a.hashCode() * 31) + this.f90402b.hashCode()) * 31) + this.f90403c.hashCode()) * 31) + this.f90404d.hashCode()) * 31) + this.f90405e.hashCode();
        }

        public String toString() {
            String str = this.f90401a;
            String str2 = this.f90402b;
            String str3 = this.f90403c;
            String str4 = this.f90404d;
            C15987c<e> cVar = this.f90405e;
            return "Story(storyId=" + str + ", purpose=" + str2 + ", title=" + str3 + ", actionTitle=" + str4 + ", cards=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Laq/a$h;", "Laq/a;", "", "title", "LKJ/c;", "Llp/a;", "stories", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LKJ/c;", "()LKJ/c;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$h */
    public static final class h extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90406a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C11559a> f90407b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, C15987c<C11559a> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "stories");
            this.f90406a = str;
            this.f90407b = cVar;
        }

        public final C15987c<C11559a> a() {
            return this.f90407b;
        }

        public final String b() {
            return this.f90406a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f90406a, hVar.f90406a) && C17542s.e(this.f90407b, hVar.f90407b);
        }

        public int hashCode() {
            String str = this.f90406a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f90407b.hashCode();
        }

        public String toString() {
            String str = this.f90406a;
            C15987c<C11559a> cVar = this.f90407b;
            return "StoryLiteList(title=" + str + ", stories=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Laq/a$i;", "Laq/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "title", "b", "url", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aq.a$i */
    public static final class i extends C11079a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90408a;

        /* renamed from: b  reason: collision with root package name */
        private final String f90409b;

        public final String a() {
            return this.f90408a;
        }

        public final String b() {
            return this.f90409b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C17542s.e(this.f90408a, iVar.f90408a) && C17542s.e(this.f90409b, iVar.f90409b);
        }

        public int hashCode() {
            return (this.f90408a.hashCode() * 31) + this.f90409b.hashCode();
        }

        public String toString() {
            String str = this.f90408a;
            String str2 = this.f90409b;
            return "WebViewHero(title=" + str + ", url=" + str2 + ")";
        }
    }

    public /* synthetic */ C11079a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C11079a() {
    }
}
