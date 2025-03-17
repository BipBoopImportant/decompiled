package com.ingka.ikea.inbox.impl.fragment;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C5197z;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import g.C5314c;
import h.C5405c;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ws.g;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\t8\u0014XD¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\"\u0010$\u001a\u00020\t8\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002XD¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001dR\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010%0%0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a;", "result", "LXH/N;", "z0", "(Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a;)V", "", "A0", "()Z", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "u0", "(LU0/m;I)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Q", "Z", "t0", "drawUnderStatusBar", "R", "v0", "setTransparentSurface", "(Z)V", "transparentSurface", "", "S", "Ljava/lang/String;", "permission", "T", "shouldShowRationaleBeforeRequest", "Lg/c;", "kotlin.jvm.PlatformType", "U", "Lg/c;", "requestPermissionLauncher", "X", "a", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationPermissionDialog extends c {

    /* renamed from: X  reason: collision with root package name */
    public static final a f96038X = new a((DefaultConstructorMarker) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final int f96039Y = 8;

    /* renamed from: Q  reason: collision with root package name */
    private final boolean f96040Q = true;

    /* renamed from: R  reason: collision with root package name */
    private boolean f96041R = true;

    /* renamed from: S  reason: collision with root package name */
    private final String f96042S = "android.permission.POST_NOTIFICATIONS";

    /* renamed from: T  reason: collision with root package name */
    private boolean f96043T;

    /* renamed from: U  reason: collision with root package name */
    private final C5314c<String> f96044U;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "a", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "Granted", "FirstDeny", "SecondDeny", "Blocked", "Cancelled", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a  reason: collision with other inner class name */
        public enum C2128a {
            Granted("NotificationPermissionDialog-GRANTED"),
            FirstDeny("NotificationPermissionDialog-FIRST_DENY"),
            SecondDeny("NotificationPermissionDialog-SECOND_DENY"),
            Blocked("NotificationPermissionDialog-BLOCKED"),
            Cancelled("NotificationPermissionDialog-CANCELLED");
            
            public static final C2129a Companion = null;
            private final String value;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a$a;", "", "<init>", "()V", "", "value", "Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/inbox/impl/fragment/NotificationPermissionDialog$a$a;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a$a  reason: collision with other inner class name */
            public static final class C2129a {
                public /* synthetic */ C2129a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C2128a a(String str) {
                    C17542s.j(str, "value");
                    for (C2128a aVar : C2128a.b()) {
                        if (C17542s.e(aVar.j(), str)) {
                            return aVar;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                private C2129a() {
                }
            }

            static {
                C2128a[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new C2129a((DefaultConstructorMarker) null);
            }

            private C2128a(String str) {
                this.value = str;
            }

            public static C17220a<C2128a> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.value;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NotificationPermissionDialog() {
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new g(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f96044U = registerForActivityResult;
    }

    private final boolean A0() {
        return requireContext().checkSelfPermission(this.f96042S) == 0;
    }

    /* access modifiers changed from: private */
    public static final void B0(NotificationPermissionDialog notificationPermissionDialog, boolean z10) {
        notificationPermissionDialog.z0(z10 ? a.C2128a.Granted : notificationPermissionDialog.C0() ? a.C2128a.FirstDeny : notificationPermissionDialog.f96043T ? a.C2128a.SecondDeny : a.C2128a.Blocked);
    }

    private final boolean C0() {
        return requireActivity().shouldShowRequestPermissionRationale(this.f96042S);
    }

    private final void z0(a.C2128a aVar) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("dismissing permission request with result:" + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = NotificationPermissionDialog.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C5197z.c(this, "NotificationPermissionDialog-REQUEST_KEY", D2.d.b(C16796C.a("NotificationPermissionDialog-REQUEST_KEY", aVar.j())));
        rw.d.a(this, aVar.j(), "NotificationPermissionDialog-REQUEST_KEY");
        dismiss();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        z0(a.C2128a.Cancelled);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT < 33) {
            z0(a.C2128a.Granted);
        } else if (A0()) {
            z0(a.C2128a.Granted);
        } else {
            this.f96043T = C0();
            this.f96044U.a("android.permission.POST_NOTIFICATIONS");
        }
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96040Q;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-1981371368);
        if (C4895p.J()) {
            C4895p.S(-1981371368, i10, -1, "com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.DialogContent (NotificationPermissionDialog.kt:69)");
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96041R;
    }
}
