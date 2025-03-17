package uq;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Luq/f;", "", "", "b", "()Ljava/lang/String;", "sessionId", "c", "marketCode", "a", "languageCode", "d", "partyUid", "Luq/f$a;", "e", "()Luq/f$a;", "dataConsent", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Luq/f$a;", "", "", "personalisationConsent", "analyticsConsent", "marketingConsent", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f104005a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f104006b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f104007c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f104005a = z10;
            this.f104006b = z11;
            this.f104007c = z12;
        }

        public final boolean a() {
            return this.f104006b;
        }

        public final boolean b() {
            return this.f104007c;
        }

        public final boolean c() {
            return this.f104005a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104005a == aVar.f104005a && this.f104006b == aVar.f104006b && this.f104007c == aVar.f104007c;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f104005a) * 31) + Boolean.hashCode(this.f104006b)) * 31) + Boolean.hashCode(this.f104007c);
        }

        public String toString() {
            boolean z10 = this.f104005a;
            boolean z11 = this.f104006b;
            boolean z12 = this.f104007c;
            return "DataConsent(personalisationConsent=" + z10 + ", analyticsConsent=" + z11 + ", marketingConsent=" + z12 + ")";
        }
    }

    String a();

    String b();

    String c();

    String d();

    a e();
}
