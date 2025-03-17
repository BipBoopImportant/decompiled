package Y8;

import a9.M1;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionReplayProcessor f41030a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M1 f41031b;

    public /* synthetic */ b(SessionReplayProcessor sessionReplayProcessor, M1 m12) {
        this.f41030a = sessionReplayProcessor;
        this.f41031b = m12;
    }

    public final void run() {
        SessionReplayProcessor.storeAndSendSrEvents$lambda$10(this.f41030a, this.f41031b);
    }
}
