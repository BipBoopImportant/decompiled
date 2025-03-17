package Hj;

import Gj.h;
import QJ.M;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import android.content.Context;
import androidx.lifecycle.C5215s;
import gj.C11295f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import za.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"LHj/u;", "LHj/w;", "Lza/a;", "Landroidx/lifecycle/s;", "coroutineScope", "Lgj/f;", "detectorProcessor", "LHj/y;", "scannerFilterProcessorFactory", "LGj/h;", "scannerPermissionHandler", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "<init>", "(Landroidx/lifecycle/s;Lgj/f;LHj/y;LGj/h;Landroid/content/Context;LQJ/M;)V", "p", "Landroid/content/Context;", "q", "LQJ/M;", "LTJ/A;", "r", "LTJ/A;", "()LTJ/A;", "result", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends w<a> {

    /* renamed from: p  reason: collision with root package name */
    private final Context f81300p;

    /* renamed from: q  reason: collision with root package name */
    private final M f81301q;

    /* renamed from: r  reason: collision with root package name */
    private final C16504A<a> f81302r = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(C5215s sVar, C11295f fVar, y yVar, h hVar, Context context, M m10) {
        super(sVar, fVar, yVar, hVar, context, m10);
        C17542s.j(sVar, "coroutineScope");
        C17542s.j(fVar, "detectorProcessor");
        C17542s.j(yVar, "scannerFilterProcessorFactory");
        C17542s.j(hVar, "scannerPermissionHandler");
        C17542s.j(context, "context");
        C17542s.j(m10, "dispatcher");
        this.f81300p = context;
        this.f81301q = m10;
        fVar.c(q());
    }

    public C16504A<a> q() {
        return this.f81302r;
    }
}
