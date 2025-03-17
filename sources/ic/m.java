package Ic;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final long f61023a;

    /* renamed from: b  reason: collision with root package name */
    private final long f61024b;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f61025a = 60;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f61026b = com.google.firebase.remoteconfig.internal.m.f68769j;

        public m c() {
            return new m(this);
        }

        public b d(long j10) {
            if (j10 >= 0) {
                this.f61025a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j10)}));
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f61026b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private m(b bVar) {
        this.f61023a = bVar.f61025a;
        this.f61024b = bVar.f61026b;
    }
}
