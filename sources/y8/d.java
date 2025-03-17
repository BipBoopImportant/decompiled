package Y8;

import a9.C6871l1;
import a9.U4;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import java.util.List;

public final /* synthetic */ class d implements U4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionReplayProcessor f41039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f41040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6871l1 f41041c;

    public /* synthetic */ d(SessionReplayProcessor sessionReplayProcessor, List list, C6871l1 l1Var) {
        this.f41039a = sessionReplayProcessor;
        this.f41040b = list;
        this.f41041c = l1Var;
    }

    public final void run() {
        SessionReplayProcessor.flushCurrentEventBatchAsync$lambda$13(this.f41039a, this.f41040b, this.f41041c);
    }
}
