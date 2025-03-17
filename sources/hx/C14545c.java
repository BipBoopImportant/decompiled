package hx;

import YH.C16877v;
import ix.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0004\u0007\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lhx/c;", "", "", "Lix/c;", "c", "()Ljava/util/List;", "cards", "a", "b", "Lhx/c$a;", "Lhx/c$b;", "Lhx/c$c;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hx.c  reason: case insensitive filesystem */
public interface C14545c {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhx/c$a;", "Lhx/c;", "", "Lix/c;", "cards", "", "throwable", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hx.c$a */
    public static final class a implements C14545c {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f127512a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f127513b;

        public a(List<c> list, Throwable th2) {
            C17542s.j(list, "cards");
            C17542s.j(th2, "throwable");
            this.f127512a = list;
            this.f127513b = th2;
        }

        public final Throwable a() {
            return this.f127513b;
        }

        public List<c> c() {
            return this.f127512a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f127512a, aVar.f127512a) && C17542s.e(this.f127513b, aVar.f127513b);
        }

        public int hashCode() {
            return (this.f127512a.hashCode() * 31) + this.f127513b.hashCode();
        }

        public String toString() {
            List<c> list = this.f127512a;
            Throwable th2 = this.f127513b;
            return "Failure(cards=" + list + ", throwable=" + th2 + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhx/c$b;", "Lhx/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lix/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "cards", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hx.c$b */
    public static final class b implements C14545c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127514a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final List<c> f127515b = C16877v.n();

        private b() {
        }

        public List<c> c() {
            return f127515b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1938971591;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhx/c$c;", "Lhx/c;", "", "Lix/c;", "cards", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "prepaidcarddata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hx.c$c  reason: collision with other inner class name */
    public static final class C3141c implements C14545c {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f127516a;

        public C3141c(List<c> list) {
            C17542s.j(list, "cards");
            this.f127516a = list;
        }

        public List<c> c() {
            return this.f127516a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3141c) && C17542s.e(this.f127516a, ((C3141c) obj).f127516a);
        }

        public int hashCode() {
            return this.f127516a.hashCode();
        }

        public String toString() {
            List<c> list = this.f127516a;
            return "Success(cards=" + list + ")";
        }
    }

    List<c> c();
}
