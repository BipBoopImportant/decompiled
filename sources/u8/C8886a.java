package u8;

import A8.b;
import E8.c;
import F8.g;
import F8.i;
import G8.a;
import G8.d;
import G8.e;
import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lu8/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LA8/b;", "<set-?>", "a", "LA8/b;", "c", "()LA8/b;", "configuration", "LE8/c;", "b", "LE8/c;", "f", "()LE8/c;", "preferencesStore", "LF8/g;", "LF8/g;", "d", "()LF8/g;", "deviceInfo", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u8.a  reason: case insensitive filesystem */
public final class C8886a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0914a f56874d = new C0914a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static C8886a f56875e;

    /* renamed from: a  reason: collision with root package name */
    private b f56876a;

    /* renamed from: b  reason: collision with root package name */
    private c f56877b;

    /* renamed from: c  reason: collision with root package name */
    private g f56878c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR4\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@GX\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lu8/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lu8/a;", "b", "(Landroid/content/Context;)Lu8/a;", "<set-?>", "instance", "Lu8/a;", "a", "()Lu8/a;", "c", "(Lu8/a;)V", "getInstance$annotations", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u8.a$a  reason: collision with other inner class name */
    public static final class C0914a {
        private C0914a() {
        }

        public final C8886a a() {
            return C8886a.f56875e;
        }

        public final synchronized C8886a b(Context context) {
            C8886a a10;
            try {
                C17542s.j(context, "context");
                if (a() == null) {
                    c(new C8886a(context, (DefaultConstructorMarker) null));
                }
                a10 = a();
                C17542s.g(a10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return a10;
        }

        public final void c(C8886a aVar) {
            C8886a.f56875e = aVar;
        }

        public /* synthetic */ C0914a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C8886a(Context context) {
        this.f56877b = new c(context);
        C17542s.h(context, "null cannot be cast to non-null type android.app.Application");
        this.f56878c = new g((Application) context, new DisplayMetrics(), (d) null, (i) null, (a) null, (e) null, 60, (DefaultConstructorMarker) null);
        this.f56876a = new b(this.f56877b, (a) null, 2, (DefaultConstructorMarker) null);
    }

    public static final C8886a e() {
        return f56874d.a();
    }

    public static final synchronized C8886a g(Context context) {
        C8886a b10;
        synchronized (C8886a.class) {
            b10 = f56874d.b(context);
        }
        return b10;
    }

    public final b c() {
        return this.f56876a;
    }

    public final g d() {
        return this.f56878c;
    }

    public final c f() {
        return this.f56877b;
    }

    public /* synthetic */ C8886a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
