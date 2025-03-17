package com.google.android.play.core.install;

final class a extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    private final int f67659a;

    /* renamed from: b  reason: collision with root package name */
    private final long f67660b;

    /* renamed from: c  reason: collision with root package name */
    private final long f67661c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67662d;

    /* renamed from: e  reason: collision with root package name */
    private final String f67663e;

    a(int i10, long j10, long j11, int i11, String str) {
        this.f67659a = i10;
        this.f67660b = j10;
        this.f67661c = j11;
        this.f67662d = i11;
        if (str != null) {
            this.f67663e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long a() {
        return this.f67660b;
    }

    public final int b() {
        return this.f67662d;
    }

    public final int c() {
        return this.f67659a;
    }

    public final String d() {
        return this.f67663e;
    }

    public final long e() {
        return this.f67661c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f67659a == installState.c() && this.f67660b == installState.a() && this.f67661c == installState.e() && this.f67662d == installState.b() && this.f67663e.equals(installState.d());
        }
    }

    public final int hashCode() {
        long j10 = this.f67660b;
        long j11 = this.f67661c;
        return ((((((((this.f67659a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f67662d) * 1000003) ^ this.f67663e.hashCode();
    }

    public final String toString() {
        int i10 = this.f67659a;
        long j10 = this.f67660b;
        long j11 = this.f67661c;
        int i11 = this.f67662d;
        String str = this.f67663e;
        return "InstallState{installStatus=" + i10 + ", bytesDownloaded=" + j10 + ", totalBytesToDownload=" + j11 + ", installErrorCode=" + i11 + ", packageName=" + str + "}";
    }
}
