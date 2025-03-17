package com.ingka.ikea.onlinepayment.impl.presentation;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.content.BroadcastReceiver;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/BroadcastReceiver;", "LQJ/Q;", "coroutineScope", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "block", "b", "(Landroid/content/BroadcastReceiver;LQJ/Q;LnI/l;)V", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiverKt$goAsync$1", f = "AciBroadcastReceiver.kt", l = {251}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f119320d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f119321e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, BroadcastReceiver.PendingResult pendingResult, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f119320d = lVar;
            this.f119321e = pendingResult;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f119320d, this.f119321e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f119319c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f119320d;
                this.f119319c = 1;
                if (lVar.invoke(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f119321e.finish();
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f119321e.finish();
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void b(BroadcastReceiver broadcastReceiver, Q q10, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(lVar, broadcastReceiver.goAsync(), (C17164e<? super a>) null), 3, (Object) null);
    }
}
