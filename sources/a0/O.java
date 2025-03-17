package a0;

import a0.C4954E;
import android.media.MediaCodec;

public final /* synthetic */ class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4954E.e f15051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaCodec.CodecException f15052b;

    public /* synthetic */ O(C4954E.e eVar, MediaCodec.CodecException codecException) {
        this.f15051a = eVar;
        this.f15052b = codecException;
    }

    public final void run() {
        this.f15051a.k(this.f15052b);
    }
}
