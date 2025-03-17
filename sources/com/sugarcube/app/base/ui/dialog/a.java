package com.sugarcube.app.base.ui.dialog;

import JF.C13096c;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tF.C15076a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001d2\u00020\u0001:\u0002\r\u0013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/a;", "Landroid/app/Dialog;", "Landroid/app/Activity;", "activity", "Ljava/util/Locale;", "locale", "", "dialogGravity", "Lcom/sugarcube/app/base/ui/dialog/a$b;", "offset", "<init>", "(Landroid/app/Activity;Ljava/util/Locale;ILcom/sugarcube/app/base/ui/dialog/a$b;)V", "LXH/N;", "b", "()V", "", "millis", "c", "(J)V", "a", "I", "Lcom/sugarcube/app/base/ui/dialog/a$b;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "d", "Ljava/lang/Runnable;", "timeOutRunnable", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends Dialog {

    /* renamed from: e  reason: collision with root package name */
    public static final C3042a f124099e = new C3042a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f124100f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f124101a;

    /* renamed from: b  reason: collision with root package name */
    private final b f124102b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f124103c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f124104d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/a$a;", "", "<init>", "()V", "", "DURATION_BASE_MILLIS", "J", "", "DURATION_SHORT_MILLIS", "I", "DURATION_LONG_MILLIS", "DEFAULT_OFFSET", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.dialog.a$a  reason: collision with other inner class name */
    public static final class C3042a {
        public /* synthetic */ C3042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3042a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/a$b;", "", "", "horizontal", "vertical", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "setHorizontal", "(I)V", "b", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f124105a;

        /* renamed from: b  reason: collision with root package name */
        private final int f124106b;

        public b() {
            this(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public final int a() {
            return this.f124105a;
        }

        public final int b() {
            return this.f124106b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f124105a == bVar.f124105a && this.f124106b == bVar.f124106b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f124105a) * 31) + Integer.hashCode(this.f124106b);
        }

        public String toString() {
            int i10 = this.f124105a;
            int i11 = this.f124106b;
            return "Offset(horizontal=" + i10 + ", vertical=" + i11 + ")";
        }

        public b(int i10, int i11) {
            this.f124105a = i10;
            this.f124106b = i11;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? -1 : i11);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Activity activity, Locale locale, int i10, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, locale, i10, (i11 & 8) != 0 ? null : bVar);
    }

    private final void b() {
        WindowManager.LayoutParams attributes;
        b bVar;
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null && (bVar = this.f124102b) != null) {
            int i10 = attributes.gravity;
            int i11 = i10 & 7;
            int i12 = i10 & 112;
            Integer valueOf = Integer.valueOf(bVar.a());
            Integer num = null;
            if (valueOf.intValue() <= 0 || !(i11 == 3 || i11 == 5)) {
                valueOf = null;
            }
            if (valueOf != null) {
                attributes.x += valueOf.intValue() + 44;
            }
            Integer valueOf2 = Integer.valueOf(bVar.b());
            if (valueOf2.intValue() > 0 && (i12 == 48 || i12 == 80)) {
                num = valueOf2;
            }
            if (num != null) {
                attributes.y += num.intValue() + 44;
            }
        }
    }

    public static /* synthetic */ void d(a aVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1200;
            }
            aVar.c(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoDismissAfterDuration");
    }

    /* access modifiers changed from: private */
    public static final void e(a aVar) {
        aVar.dismiss();
    }

    public final void c(long j10) {
        Handler handler = this.f124103c;
        handler.removeCallbacks(this.f124104d);
        handler.postDelayed(this.f124104d, j10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, Locale locale, int i10, b bVar) {
        super(activity);
        C17542s.j(activity, "activity");
        C17542s.j(locale, "locale");
        this.f124101a = i10;
        this.f124102b = bVar;
        this.f124103c = new Handler(Looper.getMainLooper());
        this.f124104d = new C15076a(this);
        C13096c.b(activity, locale);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = i10;
            window.setAttributes(attributes);
        }
        b();
    }
}
