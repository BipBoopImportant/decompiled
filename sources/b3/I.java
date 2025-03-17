package B3;

import B3.C6375y;
import android.media.AudioTrack;
import android.os.Handler;

public final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f32861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6375y.d f32862b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f32863c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6375y.a f32864d;

    public /* synthetic */ I(AudioTrack audioTrack, C6375y.d dVar, Handler handler, C6375y.a aVar) {
        this.f32861a = audioTrack;
        this.f32862b = dVar;
        this.f32863c = handler;
        this.f32864d = aVar;
    }

    public final void run() {
        M.h0(this.f32861a, this.f32862b, this.f32863c, this.f32864d);
    }
}
