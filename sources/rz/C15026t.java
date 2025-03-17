package rz;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrz/t;", "Ljava/io/Serializable;", "<init>", "()V", "c", "a", "b", "Lrz/t$a;", "Lrz/t$b;", "Lrz/t$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.t  reason: case insensitive filesystem */
public abstract class C15026t implements Serializable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lrz/t$a;", "Lrz/t;", "", "title", "aisle", "bin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.t$a */
    public static final class a extends C15026t {

        /* renamed from: a  reason: collision with root package name */
        private final String f130890a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130891b;

        /* renamed from: c  reason: collision with root package name */
        private final String f130892c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            C17542s.j(str2, "aisle");
            C17542s.j(str3, "bin");
            this.f130890a = str;
            this.f130891b = str2;
            this.f130892c = str3;
        }

        public final String a() {
            return this.f130891b;
        }

        public final String b() {
            return this.f130892c;
        }

        public final String c() {
            return this.f130890a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f130890a, aVar.f130890a) && C17542s.e(this.f130891b, aVar.f130891b) && C17542s.e(this.f130892c, aVar.f130892c);
        }

        public int hashCode() {
            return (((this.f130890a.hashCode() * 31) + this.f130891b.hashCode()) * 31) + this.f130892c.hashCode();
        }

        public String toString() {
            String str = this.f130890a;
            String str2 = this.f130891b;
            String str3 = this.f130892c;
            return "AisleAndBin(title=" + str + ", aisle=" + str2 + ", bin=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lrz/t$b;", "Lrz/t;", "", "title", "department", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.t$b */
    public static final class b extends C15026t {

        /* renamed from: a  reason: collision with root package name */
        private final String f130893a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130894b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            C17542s.j(str2, "department");
            this.f130893a = str;
            this.f130894b = str2;
        }

        public final String a() {
            return this.f130894b;
        }

        public final String b() {
            return this.f130893a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f130893a, bVar.f130893a) && C17542s.e(this.f130894b, bVar.f130894b);
        }

        public int hashCode() {
            return (this.f130893a.hashCode() * 31) + this.f130894b.hashCode();
        }

        public String toString() {
            String str = this.f130893a;
            String str2 = this.f130894b;
            return "Department(title=" + str + ", department=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/t$c;", "Lrz/t;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.t$c */
    public static final class c extends C15026t {

        /* renamed from: a  reason: collision with root package name */
        public static final c f130895a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C15026t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C15026t() {
    }
}
