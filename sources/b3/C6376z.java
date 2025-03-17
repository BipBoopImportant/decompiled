package B3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: B3.z  reason: case insensitive filesystem */
final class C6376z {

    /* renamed from: a  reason: collision with root package name */
    private final a f33117a;

    /* renamed from: b  reason: collision with root package name */
    private int f33118b;

    /* renamed from: c  reason: collision with root package name */
    private long f33119c;

    /* renamed from: d  reason: collision with root package name */
    private long f33120d;

    /* renamed from: e  reason: collision with root package name */
    private long f33121e;

    /* renamed from: f  reason: collision with root package name */
    private long f33122f;

    /* renamed from: B3.z$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f33123a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f33124b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f33125c;

        /* renamed from: d  reason: collision with root package name */
        private long f33126d;

        /* renamed from: e  reason: collision with root package name */
        private long f33127e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f33128f;

        /* renamed from: g  reason: collision with root package name */
        private long f33129g;

        public a(AudioTrack audioTrack) {
            this.f33123a = audioTrack;
        }

        public void a() {
            this.f33128f = true;
        }

        public long b() {
            return this.f33127e;
        }

        public long c() {
            return this.f33124b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f33123a.getTimestamp(this.f33124b);
            if (timestamp) {
                long j10 = this.f33124b.framePosition;
                long j11 = this.f33126d;
                if (j11 > j10) {
                    if (this.f33128f) {
                        this.f33129g += j11;
                        this.f33128f = false;
                    } else {
                        this.f33125c++;
                    }
                }
                this.f33126d = j10;
                this.f33127e = j10 + this.f33129g + (this.f33125c << 32);
            }
            return timestamp;
        }
    }

    public C6376z(AudioTrack audioTrack) {
        this.f33117a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f33118b = i10;
        if (i10 == 0) {
            this.f33121e = 0;
            this.f33122f = -1;
            this.f33119c = System.nanoTime() / 1000;
            this.f33120d = 10000;
        } else if (i10 == 1) {
            this.f33120d = 10000;
        } else if (i10 == 2 || i10 == 3) {
            this.f33120d = 10000000;
        } else if (i10 == 4) {
            this.f33120d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f33118b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f33117a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f33117a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1;
    }

    public long d() {
        a aVar = this.f33117a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f33118b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f33117a;
        if (aVar == null || j10 - this.f33121e < this.f33120d) {
            return false;
        }
        this.f33121e = j10;
        boolean d10 = aVar.d();
        int i10 = this.f33118b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (d10) {
                        h();
                    }
                } else if (!d10) {
                    h();
                }
            } else if (!d10) {
                h();
            } else if (this.f33117a.b() > this.f33122f) {
                i(2);
            }
        } else if (d10) {
            if (this.f33117a.c() < this.f33119c) {
                return false;
            }
            this.f33122f = this.f33117a.b();
            i(1);
        } else if (j10 - this.f33119c > 500000) {
            i(3);
        }
        return d10;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f33117a != null) {
            i(0);
        }
    }
}
