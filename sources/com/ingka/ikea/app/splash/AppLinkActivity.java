package com.ingka.ikea.app.splash;

import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Qk.f;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.C16824o;
import XH.t;
import XH.y;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.j;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/app/splash/AppLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LQk/f;", "state", "LXH/N;", "F0", "(LQk/f;)V", "Landroid/net/Uri;", "uri", "z0", "(Landroid/net/Uri;)V", "y0", "A0", "Landroid/content/Intent;", "intent", "E0", "(Landroid/content/Intent;)V", "x0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "LQk/a;", "z", "LXH/o;", "B0", "()LQk/a;", "appLinkViewModel", "Lpw/a;", "A", "Lpw/a;", "C0", "()Lpw/a;", "setFirstEntryApi", "(Lpw/a;)V", "firstEntryApi", "Lpw/c;", "B", "Lpw/c;", "D0", "()Lpw/c;", "setWelcomeApi", "(Lpw/c;)V", "welcomeApi", "C", "a", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppLinkActivity extends Hilt_AppLinkActivity {

    /* renamed from: C  reason: collision with root package name */
    public static final a f92375C = new a((DefaultConstructorMarker) null);

    /* renamed from: D  reason: collision with root package name */
    public static final int f92376D = 8;

    /* renamed from: A  reason: collision with root package name */
    public pw.a f92377A;

    /* renamed from: B  reason: collision with root package name */
    public pw.c f92378B;

    /* renamed from: z  reason: collision with root package name */
    private final C16824o f92379z = new h0(P.b(Qk.a.class), new d(this), new c(this), new e((C17631a) null, this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/splash/AppLinkActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "", "PARAM_RESOLVED", "Ljava/lang/String;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, Uri uri) {
            C17542s.j(context, "context");
            C17542s.j(uri, "uri");
            Intent intent = new Intent(context, AppLinkActivity.class);
            intent.setData(uri);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.splash.AppLinkActivity$onCreate$1", f = "AppLinkActivity.kt", l = {41}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92380c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppLinkActivity f92381d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.splash.AppLinkActivity$onCreate$1$1", f = "AppLinkActivity.kt", l = {42}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92382c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AppLinkActivity f92383d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.splash.AppLinkActivity$b$a$a  reason: collision with other inner class name */
            static final class C2050a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ AppLinkActivity f92384a;

                C2050a(AppLinkActivity appLinkActivity) {
                    this.f92384a = appLinkActivity;
                }

                /* renamed from: c */
                public final Object emit(Qk.f fVar, C17164e<? super C16807N> eVar) {
                    this.f92384a.F0(fVar);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AppLinkActivity appLinkActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92383d = appLinkActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92383d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f92382c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<Qk.f> H10 = this.f92383d.B0().H();
                    C2050a aVar = new C2050a(this.f92383d);
                    this.f92382c = 1;
                    if (H10.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AppLinkActivity appLinkActivity, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f92381d = appLinkActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f92381d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92380c;
            if (i10 == 0) {
                y.b(obj);
                AppLinkActivity appLinkActivity = this.f92381d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(appLinkActivity, (C17164e<? super a>) null);
                this.f92380c = 1;
                if (androidx.lifecycle.Q.b(appLinkActivity, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f92385c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar) {
            super(0);
            this.f92385c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f92385c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f92386c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar) {
            super(0);
            this.f92386c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f92386c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92387c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f92388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, j jVar) {
            super(0);
            this.f92387c = aVar;
            this.f92388d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f92387c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f92388d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.splash.AppLinkActivity.e.invoke():l3.a");
        }
    }

    private final void A0(Uri uri) {
        Intent a10 = C0().a(this);
        a10.putExtra("isResolved", false);
        a10.setAction("android.intent.action.VIEW");
        a10.setData(uri);
        E0(a10);
    }

    /* access modifiers changed from: private */
    public final Qk.a B0() {
        return (Qk.a) this.f92379z.getValue();
    }

    private final void E0(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = AppLinkActivity.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
        finish();
    }

    /* access modifiers changed from: private */
    public final void F0(Qk.f fVar) {
        if (C17542s.e(fVar, f.e.f85951a)) {
            return;
        }
        if (fVar instanceof f.b) {
            z0(((f.b) fVar).a());
        } else if (fVar instanceof f.d) {
            y0(((f.d) fVar).a());
        } else if (fVar instanceof f.c) {
            x0(((f.c) fVar).a());
        } else if (fVar instanceof f.a) {
            A0(((f.a) fVar).a());
        } else if (fVar instanceof f.C1758f) {
            z0((Uri) null);
        } else {
            throw new t();
        }
    }

    private final void x0(Uri uri) {
        Intent intent;
        if (Build.VERSION.SDK_INT > 30) {
            intent = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(uri);
            intent.setSelector(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null)));
        } else {
            Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            makeMainSelectorActivity.setData(uri);
            intent = makeMainSelectorActivity;
        }
        C17542s.g(intent);
        E0(intent);
    }

    private final void y0(Uri uri) {
        Intent a10 = C0().a(this);
        a10.putExtra("isResolved", true);
        a10.setAction("android.intent.action.VIEW");
        a10.setData(uri);
        E0(a10);
    }

    private final void z0(Uri uri) {
        Intent a10 = D0().a(this);
        a10.putExtra("isResolved", true);
        a10.setAction("android.intent.action.VIEW");
        a10.setData(uri);
        E0(a10);
    }

    public final pw.a C0() {
        pw.a aVar = this.f92377A;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("firstEntryApi");
        return null;
    }

    public final pw.c D0() {
        pw.c cVar = this.f92378B;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("welcomeApi");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        Uri data = getIntent().getData();
        if (data != null) {
            B0().I(data);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data != null) {
            B0().I(data);
        } else {
            finish();
        }
    }
}
