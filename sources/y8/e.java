package Y8;

import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionReplayProcessor f41042a;

    public /* synthetic */ e(SessionReplayProcessor sessionReplayProcessor) {
        this.f41042a = sessionReplayProcessor;
    }

    public final void run() {
        SessionReplayProcessor.startSessionReplayInFlutterIfNeeded$lambda$14(this.f41042a);
    }
}
