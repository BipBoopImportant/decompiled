package ex;

import GB.e;
import GB.f;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lex/b;", "", "c", "b", "a", "Lex/b$a;", "Lex/b$b;", "Lex/b$c;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ex.b  reason: case insensitive filesystem */
public interface C14431b {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lex/b$a;", "Lex/b;", "Ljava/time/LocalDateTime;", "currentTime", "LGB/f;", "trend", "LGB/e;", "live", "Ljava/time/format/DateTimeFormatter;", "timeAxisFormatter", "<init>", "(Ljava/time/LocalDateTime;LGB/f;LGB/e;Ljava/time/format/DateTimeFormatter;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "b", "LGB/f;", "d", "()LGB/f;", "c", "LGB/e;", "()LGB/e;", "Ljava/time/format/DateTimeFormatter;", "()Ljava/time/format/DateTimeFormatter;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ex.b$a */
    public static final class a implements C14431b {

        /* renamed from: a  reason: collision with root package name */
        private final LocalDateTime f126775a;

        /* renamed from: b  reason: collision with root package name */
        private final f f126776b;

        /* renamed from: c  reason: collision with root package name */
        private final e f126777c;

        /* renamed from: d  reason: collision with root package name */
        private final DateTimeFormatter f126778d;

        public a(LocalDateTime localDateTime, f fVar, e eVar, DateTimeFormatter dateTimeFormatter) {
            C17542s.j(localDateTime, "currentTime");
            C17542s.j(fVar, "trend");
            C17542s.j(eVar, "live");
            C17542s.j(dateTimeFormatter, "timeAxisFormatter");
            this.f126775a = localDateTime;
            this.f126776b = fVar;
            this.f126777c = eVar;
            this.f126778d = dateTimeFormatter;
        }

        public final LocalDateTime a() {
            return this.f126775a;
        }

        public final e b() {
            return this.f126777c;
        }

        public final DateTimeFormatter c() {
            return this.f126778d;
        }

        public final f d() {
            return this.f126776b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f126775a, aVar.f126775a) && C17542s.e(this.f126776b, aVar.f126776b) && C17542s.e(this.f126777c, aVar.f126777c) && C17542s.e(this.f126778d, aVar.f126778d);
        }

        public int hashCode() {
            return (((((this.f126775a.hashCode() * 31) + this.f126776b.hashCode()) * 31) + this.f126777c.hashCode()) * 31) + this.f126778d.hashCode();
        }

        public String toString() {
            LocalDateTime localDateTime = this.f126775a;
            f fVar = this.f126776b;
            e eVar = this.f126777c;
            DateTimeFormatter dateTimeFormatter = this.f126778d;
            return "Content(currentTime=" + localDateTime + ", trend=" + fVar + ", live=" + eVar + ", timeAxisFormatter=" + dateTimeFormatter + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lex/b$b;", "Lex/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ex.b$b  reason: collision with other inner class name */
    public static final class C3102b implements C14431b {

        /* renamed from: a  reason: collision with root package name */
        public static final C3102b f126779a = new C3102b();

        private C3102b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3102b);
        }

        public int hashCode() {
            return 825354456;
        }

        public String toString() {
            return "Failure";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lex/b$c;", "Lex/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ex.b$c */
    public static final class c implements C14431b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f126780a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -2046388086;
        }

        public String toString() {
            return "Loading";
        }
    }
}
