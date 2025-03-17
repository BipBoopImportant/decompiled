package Y8;

import a9.C6871l1;
import a9.U4;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import java.util.List;

public final /* synthetic */ class a implements U4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionReplayProcessor f41026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f41027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f41028c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6871l1 f41029d;

    public /* synthetic */ a(SessionReplayProcessor sessionReplayProcessor, long j10, List list, C6871l1 l1Var) {
        this.f41026a = sessionReplayProcessor;
        this.f41027b = j10;
        this.f41028c = list;
        this.f41029d = l1Var;
    }

    public final void run() {
        SessionReplayProcessor.onPreScreenNumberChange$lambda$6(this.f41026a, this.f41027b, this.f41028c, this.f41029d);
    }
}
