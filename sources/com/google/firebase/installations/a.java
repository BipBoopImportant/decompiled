package com.google.firebase.installations;

import com.google.firebase.installations.g;

final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f68264a;

    /* renamed from: b  reason: collision with root package name */
    private final long f68265b;

    /* renamed from: c  reason: collision with root package name */
    private final long f68266c;

    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f68267a;

        /* renamed from: b  reason: collision with root package name */
        private Long f68268b;

        /* renamed from: c  reason: collision with root package name */
        private Long f68269c;

        b() {
        }

        public g a() {
            String str = "";
            if (this.f68267a == null) {
                str = str + " token";
            }
            if (this.f68268b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f68269c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f68267a, this.f68268b.longValue(), this.f68269c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.a b(String str) {
            if (str != null) {
                this.f68267a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public g.a c(long j10) {
            this.f68269c = Long.valueOf(j10);
            return this;
        }

        public g.a d(long j10) {
            this.f68268b = Long.valueOf(j10);
            return this;
        }
    }

    public String b() {
        return this.f68264a;
    }

    public long c() {
        return this.f68266c;
    }

    public long d() {
        return this.f68265b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f68264a.equals(gVar.b()) && this.f68265b == gVar.d() && this.f68266c == gVar.c();
    }

    public int hashCode() {
        long j10 = this.f68265b;
        long j11 = this.f68266c;
        return ((((this.f68264a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f68264a + ", tokenExpirationTimestamp=" + this.f68265b + ", tokenCreationTimestamp=" + this.f68266c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f68264a = str;
        this.f68265b = j10;
        this.f68266c = j11;
    }
}
