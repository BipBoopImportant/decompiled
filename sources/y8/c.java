package Y8;

import a9.C6825f3;
import a9.C6871l1;
import a9.U4;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import java.util.List;
import z8.C9036b;

public final /* synthetic */ class c implements U4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6825f3 f41032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SessionReplayProcessor f41033b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C9036b f41034c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f41035d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6871l1 f41036e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f41037f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f41038g;

    public /* synthetic */ c(C6825f3 f3Var, SessionReplayProcessor sessionReplayProcessor, C9036b bVar, long j10, C6871l1 l1Var, List list, boolean z10) {
        this.f41032a = f3Var;
        this.f41033b = sessionReplayProcessor;
        this.f41034c = bVar;
        this.f41035d = j10;
        this.f41036e = l1Var;
        this.f41037f = list;
        this.f41038g = z10;
    }

    public final void run() {
        SessionReplayProcessor.switchToWorkerThread$lambda$7(this.f41032a, this.f41033b, this.f41034c, this.f41035d, this.f41036e, this.f41037f, this.f41038g);
    }
}
