package com.ingka.ikea.pushnotification.impl;

import Sx.a;
import Zx.c;
import com.google.firebase.messaging.S;
import com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker;
import eE.C14400d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/PushNotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/S;", "remoteMessage", "LXH/N;", "r", "(Lcom/google/firebase/messaging/S;)V", "", "token", "t", "(Ljava/lang/String;)V", "LeE/d;", "k", "LeE/d;", "A", "()LeE/d;", "setWorkScheduler", "(LeE/d;)V", "workScheduler", "LZx/c;", "l", "LZx/c;", "z", "()LZx/c;", "setPushNotificationRepository", "(LZx/c;)V", "pushNotificationRepository", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushNotificationService extends a {

    /* renamed from: k  reason: collision with root package name */
    public C14400d f119604k;

    /* renamed from: l  reason: collision with root package name */
    public c f119605l;

    public final C14400d A() {
        C14400d dVar = this.f119604k;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("workScheduler");
        return null;
    }

    public void r(S s10) {
        C17542s.j(s10, "remoteMessage");
        ProcessRemoteMessageWorker.f119624c.b(A(), s10);
    }

    public void t(String str) {
        C17542s.j(str, "token");
        z().c();
        super.t(str);
    }

    public final c z() {
        c cVar = this.f119605l;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("pushNotificationRepository");
        return null;
    }
}
