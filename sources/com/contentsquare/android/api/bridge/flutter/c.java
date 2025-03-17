package com.contentsquare.android.api.bridge.flutter;

import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.C7131j;
import d9.F;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l8.C8541e;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/contentsquare/android/api/bridge/flutter/c;", "", "<init>", "()V", "LQJ/Q;", "scope", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "action", "a", "(LQJ/Q;LnI/l;)V", "", "Ld9/F;", "protoEvents", "Lcom/contentsquare/android/api/bridge/flutter/f;", "flutterSrEventListener", "b", "(Ljava/util/List;Lcom/contentsquare/android/api/bridge/flutter/f;)V", "LQJ/F0;", "LQJ/F0;", "debounceJob", "LQJ/Q;", "coroutineScope", "c", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f46677c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private F0 f46678a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f46679b = S.b();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/contentsquare/android/api/bridge/flutter/c$a;", "", "<init>", "()V", "", "INTERVAL_MILLI_SEC", "J", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.api.bridge.flutter.FlutterBridgeSrEventProcessor$debounceAction$1", f = "FlutterBridgeSrEventProcessor.kt", l = {35, 36}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f46680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f46681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f46681d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f46681d, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f46680c;
            if (i10 == 0) {
                y.b(obj);
                this.f46680c = 1;
                if (C16297b0.b(100, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C17642l<C17164e<? super C16807N>, Object> lVar = this.f46681d;
            this.f46680c = 2;
            if (lVar.invoke(this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.api.bridge.flutter.FlutterBridgeSrEventProcessor$processProtoEvents$1", f = "FlutterBridgeSrEventProcessor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.contentsquare.android.api.bridge.flutter.c$c  reason: collision with other inner class name */
    public static final class C0813c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f46682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f46683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0813c(f fVar, C17164e<? super C0813c> eVar) {
            super(1, eVar);
            this.f46683d = fVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0813c(this.f46683d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C0813c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f46682c == 0) {
                y.b(obj);
                this.f46683d.a();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void a(Q q10, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 f02 = this.f46678a;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f46678a = C16314k.d(q10, (C17168i) null, (T) null, new b(lVar, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void b(List<F> list, f fVar) {
        C17542s.j(list, "protoEvents");
        C17542s.j(fVar, "flutterSrEventListener");
        C7131j jVar = C7131j.f47442k;
        if (jVar != null && !list.isEmpty()) {
            for (F eVar : list) {
                C8541e eVar2 = new C8541e(eVar);
                C17542s.j(eVar2, "event");
                jVar.f47452f.a(eVar2);
            }
            FlutterInterface.setsIsFirstFlutterEventAdded(true);
            a(this.f46679b, new C0813c(fVar, (C17164e<? super C0813c>) null));
        }
    }
}
