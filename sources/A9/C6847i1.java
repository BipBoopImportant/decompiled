package a9;

import C8.a;
import C8.d;
import D8.c;
import G8.v;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.contentsquare.android.internal.core.logmonitor.processing.LogMessage;
import dI.C17164e;
import eI.C17187b;
import jK.C17451f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kK.C17514c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.core.logmonitor.processing.LogProcessor$sendLogs$1", f = "LogProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: a9.i1  reason: case insensitive filesystem */
public final class C6847i1 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6887n1 f42606c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6847i1(C6887n1 n1Var, C17164e<? super C6847i1> eVar) {
        super(2, eVar);
        this.f42606c = n1Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6847i1(this.f42606c, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6847i1(this.f42606c, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C17187b.f();
        y.b(obj);
        C6950v1 v1Var = this.f42606c.f42726b;
        v1Var.getClass();
        try {
            List<String> q10 = v1Var.f42895b.q(v1Var.f42898e);
            ArrayList arrayList2 = new ArrayList(C16877v.y(q10, 10));
            for (String c10 : q10) {
                C17514c.a aVar = C17514c.f144280d;
                aVar.a();
                arrayList2.add((LogMessage) aVar.c(LogMessage.Companion.serializer(), c10));
            }
            arrayList = arrayList2;
        } catch (Throwable th2) {
            c cVar = v1Var.f42896c;
            cVar.h("Failed to read log file at path: " + v1Var.f42898e + " | error message: " + th2.getMessage());
            arrayList = C16877v.n();
        }
        if (!arrayList.isEmpty()) {
            c cVar2 = this.f42606c.f42728d;
            cVar2.f("Sending " + arrayList.size() + " log events");
            String b10 = v.b("release");
            C17514c.a aVar2 = C17514c.f144280d;
            aVar2.a();
            d g10 = a.g(this.f42606c.f42725a, b10, aVar2.b(new C17451f(LogMessage.Companion.serializer()), arrayList), (Map) null, 4, (Object) null);
            if (g10.p()) {
                this.f42606c.f42728d.f("Log events successfully sent.");
                this.f42606c.f42726b.a();
                this.f42606c.f42729e.set(0);
            } else {
                c cVar3 = this.f42606c.f42728d;
                cVar3.h("Could not send the logs. HTTP status:" + g10.f() + " response:" + g10.d());
            }
        }
        return C16807N.f139792a;
    }
}
