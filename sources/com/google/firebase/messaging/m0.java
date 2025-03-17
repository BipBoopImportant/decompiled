package com.google.firebase.messaging;

import java.util.concurrent.ScheduledFuture;
import xa.C8965f;
import xa.C8971l;

public final /* synthetic */ class m0 implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f68469a;

    public /* synthetic */ m0(ScheduledFuture scheduledFuture) {
        this.f68469a = scheduledFuture;
    }

    public final void onComplete(C8971l lVar) {
        this.f68469a.cancel(false);
    }
}
