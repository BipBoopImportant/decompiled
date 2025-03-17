package dK;

import XH.C16814e;
import eK.C17216a;
import fK.p;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p(with = C17216a.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LdK/c;", "", "Ljava/time/Instant;", "value", "<init>", "(Ljava/time/Instant;)V", "", "b", "()J", "other", "", "a", "(LdK/c;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/Instant;", "getValue$kotlinx_datetime", "()Ljava/time/Instant;", "Companion", "kotlinx-datetime"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: dK.c  reason: case insensitive filesystem */
public final class C17174c implements Comparable<C17174c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C17174c f142973b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17174c f142974c;

    /* renamed from: d  reason: collision with root package name */
    private static final C17174c f142975d;

    /* renamed from: e  reason: collision with root package name */
    private static final C17174c f142976e;

    /* renamed from: a  reason: collision with root package name */
    private final Instant f142977a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LdK/c$a;", "", "<init>", "()V", "", "isoString", "a", "(Ljava/lang/String;)Ljava/lang/String;", "LdK/c;", "c", "()LdK/c;", "", "epochMilliseconds", "b", "(J)LdK/c;", "d", "(Ljava/lang/String;)LdK/c;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: dK.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.String a(java.lang.String r13) {
            /*
                r12 = this;
                r4 = 2
                r5 = 0
                r1 = 84
                r2 = 0
                r3 = 1
                r0 = r13
                int r0 = HJ.C15854t.r0(r0, r1, r2, r3, r4, r5)
                r1 = -1
                if (r0 != r1) goto L_0x000f
                return r13
            L_0x000f:
                int r2 = r13.length()
                int r2 = r2 + r1
                if (r2 < 0) goto L_0x002c
            L_0x0016:
                int r3 = r2 + -1
                char r4 = r13.charAt(r2)
                r5 = 43
                if (r4 == r5) goto L_0x002a
                r5 = 45
                if (r4 != r5) goto L_0x0025
                goto L_0x002a
            L_0x0025:
                if (r3 >= 0) goto L_0x0028
                goto L_0x002c
            L_0x0028:
                r2 = r3
                goto L_0x0016
            L_0x002a:
                r8 = r2
                goto L_0x002d
            L_0x002c:
                r8 = r1
            L_0x002d:
                if (r8 >= r0) goto L_0x0030
                return r13
            L_0x0030:
                r10 = 4
                r11 = 0
                r7 = 58
                r9 = 0
                r6 = r13
                int r0 = HJ.C15854t.r0(r6, r7, r8, r9, r10, r11)
                if (r0 == r1) goto L_0x003d
                goto L_0x004e
            L_0x003d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                java.lang.String r13 = ":00"
                r0.append(r13)
                java.lang.String r13 = r0.toString()
            L_0x004e:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: dK.C17174c.a.a(java.lang.String):java.lang.String");
        }

        public final C17174c b(long j10) {
            Instant ofEpochMilli = Instant.ofEpochMilli(j10);
            C17542s.i(ofEpochMilli, "ofEpochMilli(epochMilliseconds)");
            return new C17174c(ofEpochMilli);
        }

        @C16814e
        public final C17174c c() {
            Instant instant = Clock.systemUTC().instant();
            C17542s.i(instant, "systemUTC().instant()");
            return new C17174c(instant);
        }

        public final C17174c d(String str) {
            C17542s.j(str, "isoString");
            try {
                Instant instant = OffsetDateTime.parse(a(str)).toInstant();
                C17542s.i(instant, "parse(fixOffsetRepresent…n(isoString)).toInstant()");
                return new C17174c(instant);
            } catch (DateTimeParseException e10) {
                throw new C17173b(e10);
            }
        }

        public final KSerializer<C17174c> serializer() {
            return C17216a.f143133a;
        }

        private a() {
        }
    }

    static {
        Instant ofEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999);
        C17542s.i(ofEpochSecond, "ofEpochSecond(DISTANT_PAST_SECONDS, 999_999_999)");
        f142973b = new C17174c(ofEpochSecond);
        Instant ofEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0);
        C17542s.i(ofEpochSecond2, "ofEpochSecond(DISTANT_FUTURE_SECONDS, 0)");
        f142974c = new C17174c(ofEpochSecond2);
        Instant instant = Instant.MIN;
        C17542s.i(instant, "MIN");
        f142975d = new C17174c(instant);
        Instant instant2 = Instant.MAX;
        C17542s.i(instant2, "MAX");
        f142976e = new C17174c(instant2);
    }

    public C17174c(Instant instant) {
        C17542s.j(instant, "value");
        this.f142977a = instant;
    }

    /* renamed from: a */
    public int compareTo(C17174c cVar) {
        C17542s.j(cVar, "other");
        return this.f142977a.compareTo(cVar.f142977a);
    }

    public final long b() {
        try {
            return this.f142977a.toEpochMilli();
        } catch (ArithmeticException unused) {
            return this.f142977a.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C17174c) && C17542s.e(this.f142977a, ((C17174c) obj).f142977a));
    }

    public int hashCode() {
        return this.f142977a.hashCode();
    }

    public String toString() {
        String instant = this.f142977a.toString();
        C17542s.i(instant, "value.toString()");
        return instant;
    }
}
