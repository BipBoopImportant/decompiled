package a0;

import android.media.MediaFormat;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4966j f15056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaFormat f15057b;

    public /* synthetic */ S(C4966j jVar, MediaFormat mediaFormat) {
        this.f15056a = jVar;
        this.f15057b = mediaFormat;
    }

    public final void run() {
        this.f15056a.f(new V(this.f15057b));
    }
}
