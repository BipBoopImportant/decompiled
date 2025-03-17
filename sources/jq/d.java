package Jq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0001\u0001\u0007¨\u0006\b"}, d2 = {"LJq/d;", "T", "", "c", "d", "b", "a", "LJq/d$a;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d<T> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJq/d$a;", "T", "LJq/d;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements d<T> {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return C17542s.e(a.class, obj != null ? obj.getClass() : null);
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LJq/d$b;", "T", "", "", "throwable", "cache", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f82711a;

        /* renamed from: b  reason: collision with root package name */
        private final T f82712b;

        public b() {
            this((Throwable) null, (Object) null, 3, (DefaultConstructorMarker) null);
        }

        public final T a() {
            return this.f82712b;
        }

        public final Throwable b() {
            return this.f82711a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f82711a, bVar.f82711a) && C17542s.e(this.f82712b, bVar.f82712b);
        }

        public int hashCode() {
            Throwable th2 = this.f82711a;
            int i10 = 0;
            int hashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            T t10 = this.f82712b;
            if (t10 != null) {
                i10 = t10.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Throwable th2 = this.f82711a;
            T t10 = this.f82712b;
            return "Error(throwable=" + th2 + ", cache=" + t10 + ")";
        }

        public b(Throwable th2, T t10) {
            this.f82711a = th2;
            this.f82712b = t10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(Throwable th2, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2, (i10 & 2) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LJq/d$c;", "T", "", "cache", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements d {

        /* renamed from: a  reason: collision with root package name */
        private final T f82713a;

        public c() {
            this((Object) null, 1, (DefaultConstructorMarker) null);
        }

        public final T a() {
            return this.f82713a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f82713a, ((c) obj).f82713a);
        }

        public int hashCode() {
            T t10 = this.f82713a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            T t10 = this.f82713a;
            return "Loading(cache=" + t10 + ")";
        }

        public c(T t10) {
            this.f82713a = t10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LJq/d$d;", "T", "", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jq.d$d  reason: collision with other inner class name */
    public static final class C1628d<T> implements d {

        /* renamed from: a  reason: collision with root package name */
        private final T f82714a;

        public C1628d(T t10) {
            this.f82714a = t10;
        }

        public final T a() {
            return this.f82714a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1628d) && C17542s.e(this.f82714a, ((C1628d) obj).f82714a);
        }

        public int hashCode() {
            T t10 = this.f82714a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            T t10 = this.f82714a;
            return "Success(data=" + t10 + ")";
        }
    }
}
