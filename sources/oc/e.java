package Oc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0015\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"LOc/e;", "", "", "sessionEnabled", "", "sessionSamplingRate", "", "sessionRestartTimeout", "cacheDuration", "", "cacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f62089a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f62090b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f62091c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f62092d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f62093e;

    public e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f62089a = bool;
        this.f62090b = d10;
        this.f62091c = num;
        this.f62092d = num2;
        this.f62093e = l10;
    }

    public final Integer a() {
        return this.f62092d;
    }

    public final Long b() {
        return this.f62093e;
    }

    public final Boolean c() {
        return this.f62089a;
    }

    public final Integer d() {
        return this.f62091c;
    }

    public final Double e() {
        return this.f62090b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f62089a, eVar.f62089a) && C17542s.e(this.f62090b, eVar.f62090b) && C17542s.e(this.f62091c, eVar.f62091c) && C17542s.e(this.f62092d, eVar.f62092d) && C17542s.e(this.f62093e, eVar.f62093e);
    }

    public int hashCode() {
        Boolean bool = this.f62089a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f62090b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f62091c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f62092d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f62093e;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f62089a + ", sessionSamplingRate=" + this.f62090b + ", sessionRestartTimeout=" + this.f62091c + ", cacheDuration=" + this.f62092d + ", cacheUpdatedTime=" + this.f62093e + ')';
    }
}
