package com.ingka.ikea.app.scanandgoonlineredesign.cancelorder;

import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7042k;
import androidx.work.H;
import eE.C14397a;
import eE.C14400d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/cancelorder/a;", "LYi/a;", "LeE/d;", "workScheduler", "<init>", "(LeE/d;)V", "", "salesOrderId", "LXH/N;", "a", "(I)V", "LeE/d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Yi.a {

    /* renamed from: a  reason: collision with root package name */
    private final C14400d f91206a;

    public a(C14400d dVar) {
        C17542s.j(dVar, "workScheduler");
        this.f91206a = dVar;
    }

    public void a(int i10) {
        C14400d.a.a(this.f91206a, P.b(ScanAndGoCancelOrderWorker.class), new C14397a("ScanAndGoCancelOrderWorker", (C7032a) null, 0, (C7036e) null, 0, ScanAndGoCancelOrderWorker.f91195c.a(i10), (H) null, 94, (DefaultConstructorMarker) null), (C7042k) null, 4, (Object) null);
    }
}
