package a0;

import a0.C4954E;
import android.media.MediaCodec;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4954E.e f15047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaCodec.BufferInfo f15048b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MediaCodec f15049c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15050d;

    public /* synthetic */ N(C4954E.e eVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
        this.f15047a = eVar;
        this.f15048b = bufferInfo;
        this.f15049c = mediaCodec;
        this.f15050d = i10;
    }

    public final void run() {
        this.f15047a.m(this.f15048b, this.f15049c, this.f15050d);
    }
}
