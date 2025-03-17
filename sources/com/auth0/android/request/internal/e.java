package com.auth0.android.request.internal;

import XH.C16807N;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\u00020\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u000b\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/auth0/android/request/internal/e;", "Lcom/auth0/android/request/internal/k;", "defaultThreadSwitcher", "<init>", "(Lcom/auth0/android/request/internal/k;)V", "Ljava/lang/Runnable;", "runnable", "LXH/N;", "b", "(Ljava/lang/Runnable;)V", "a", "Lcom/auth0/android/request/internal/k;", "getDelegateThreadSwitcher$auth0_release", "()Lcom/auth0/android/request/internal/k;", "setDelegateThreadSwitcher$auth0_release", "getDelegateThreadSwitcher$auth0_release$annotations", "()V", "delegateThreadSwitcher", "c", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f46448c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static volatile e f46449d;

    /* renamed from: a  reason: collision with root package name */
    private final k f46450a;

    /* renamed from: b  reason: collision with root package name */
    private k f46451b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/auth0/android/request/internal/e$a;", "", "<init>", "()V", "Lcom/auth0/android/request/internal/e;", "a", "()Lcom/auth0/android/request/internal/e;", "INSTANCE", "Lcom/auth0/android/request/internal/e;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (e.f46449d != null) {
                e c10 = e.f46449d;
                C17542s.g(c10);
                return c10;
            }
            synchronized (this) {
                try {
                    if (e.f46449d == null) {
                        e.f46449d = new e(new f((Executor) null, 1, (DefaultConstructorMarker) null));
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e c11 = e.f46449d;
            C17542s.g(c11);
            return c11;
        }

        private a() {
        }
    }

    public e(k kVar) {
        C17542s.j(kVar, "defaultThreadSwitcher");
        this.f46450a = kVar;
        this.f46451b = kVar;
    }

    public void a(Runnable runnable) {
        C17542s.j(runnable, "runnable");
        this.f46451b.a(runnable);
    }

    public void b(Runnable runnable) {
        C17542s.j(runnable, "runnable");
        this.f46451b.b(runnable);
    }
}
