package com.squareup.picasso;

import java.io.PrintWriter;

public class B {

    /* renamed from: a  reason: collision with root package name */
    public final int f122486a;

    /* renamed from: b  reason: collision with root package name */
    public final int f122487b;

    /* renamed from: c  reason: collision with root package name */
    public final long f122488c;

    /* renamed from: d  reason: collision with root package name */
    public final long f122489d;

    /* renamed from: e  reason: collision with root package name */
    public final long f122490e;

    /* renamed from: f  reason: collision with root package name */
    public final long f122491f;

    /* renamed from: g  reason: collision with root package name */
    public final long f122492g;

    /* renamed from: h  reason: collision with root package name */
    public final long f122493h;

    /* renamed from: i  reason: collision with root package name */
    public final long f122494i;

    /* renamed from: j  reason: collision with root package name */
    public final long f122495j;

    /* renamed from: k  reason: collision with root package name */
    public final int f122496k;

    /* renamed from: l  reason: collision with root package name */
    public final int f122497l;

    /* renamed from: m  reason: collision with root package name */
    public final int f122498m;

    /* renamed from: n  reason: collision with root package name */
    public final long f122499n;

    public B(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f122486a = i10;
        this.f122487b = i11;
        this.f122488c = j10;
        this.f122489d = j11;
        this.f122490e = j12;
        this.f122491f = j13;
        this.f122492g = j14;
        this.f122493h = j15;
        this.f122494i = j16;
        this.f122495j = j17;
        this.f122496k = i12;
        this.f122497l = i13;
        this.f122498m = i14;
        this.f122499n = j18;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f122486a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f122487b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f122487b) / ((float) this.f122486a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f122488c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f122489d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f122496k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f122490e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f122493h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f122497l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f122491f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f122498m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f122492g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f122494i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f122495j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f122486a + ", size=" + this.f122487b + ", cacheHits=" + this.f122488c + ", cacheMisses=" + this.f122489d + ", downloadCount=" + this.f122496k + ", totalDownloadSize=" + this.f122490e + ", averageDownloadSize=" + this.f122493h + ", totalOriginalBitmapSize=" + this.f122491f + ", totalTransformedBitmapSize=" + this.f122492g + ", averageOriginalBitmapSize=" + this.f122494i + ", averageTransformedBitmapSize=" + this.f122495j + ", originalBitmapCount=" + this.f122497l + ", transformedBitmapCount=" + this.f122498m + ", timeStamp=" + this.f122499n + '}';
    }
}
