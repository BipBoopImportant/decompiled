package Tj;

import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15007A;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LTj/h;", "", "", "familyCardId", "timeSlotId", "", "partialCheckoutOnlyFullServe", "LXH/x;", "Lrz/A;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tj.h  reason: case insensitive filesystem */
public interface C10943h {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LTj/h$a;", "", "<init>", "()V", "b", "c", "a", "LTj/h$a$a;", "LTj/h$a$b;", "LTj/h$a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tj.h$a */
    public static abstract class a extends Throwable {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LTj/h$a$a;", "LTj/h$a;", "", "parsedMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getParsedMessage", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.h$a$a  reason: collision with other inner class name */
        public static final class C1821a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f87535a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1821a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "parsedMessage");
                this.f87535a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1821a) && C17542s.e(this.f87535a, ((C1821a) obj).f87535a);
            }

            public int hashCode() {
                return this.f87535a.hashCode();
            }

            public String toString() {
                String str = this.f87535a;
                return "GenericError(parsedMessage=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LTj/h$a$b;", "LTj/h$a;", "<init>", "()V", "b", "a", "LTj/h$a$b$a;", "LTj/h$a$b$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.h$a$b */
        public static abstract class b extends a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/h$a$b$a;", "LTj/h$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Tj.h$a$b$a  reason: collision with other inner class name */
            public static final class C1822a extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final C1822a f87536a = new C1822a();

                private C1822a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1822a);
                }

                public int hashCode() {
                    return 2104121735;
                }

                public String toString() {
                    return "BadWifi";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/h$a$b$b;", "LTj/h$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Tj.h$a$b$b  reason: collision with other inner class name */
            public static final class C1823b extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final C1823b f87537a = new C1823b();

                private C1823b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1823b);
                }

                public int hashCode() {
                    return 489375494;
                }

                public String toString() {
                    return "SuggestWifi";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/h$a$c;", "LTj/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.h$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f87538a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -804489684;
            }

            public String toString() {
                return "StoreClosed";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    Object a(String str, String str2, boolean z10, C17164e<? super x<C15007A>> eVar);
}
