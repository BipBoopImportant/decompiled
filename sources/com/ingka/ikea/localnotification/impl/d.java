package com.ingka.ikea.localnotification.impl;

import HJ.C15854t;
import V7.c;
import XH.C16807N;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.app.n;
import androidx.core.app.o;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;
import com.bumptech.glide.b;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import pv.C11781a;
import pv.C11783c;
import pv.C11784d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/localnotification/impl/d;", "Lpv/a;", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/localnotification/impl/b;", "notificationChannelMapper", "<init>", "(Landroid/content/Context;Lcom/ingka/ikea/localnotification/impl/b;)V", "", "notificationId", "purpose", "Lpv/c;", "source", "Landroid/app/PendingIntent;", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lpv/c;)Landroid/app/PendingIntent;", "contentIntent", "Lpv/d;", "messageData", "", "visibility", "LXH/N;", "b", "(Landroid/app/PendingIntent;Lpv/d;I)V", "", "a", "()Z", "Landroid/content/Context;", "Lcom/ingka/ikea/localnotification/impl/b;", "localnotification-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11781a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f96537a;

    /* renamed from: b  reason: collision with root package name */
    private final b f96538b;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"com/ingka/ikea/localnotification/impl/d$a", "LV7/c;", "Landroid/graphics/Bitmap;", "resource", "LW7/d;", "transition", "LXH/N;", "a", "(Landroid/graphics/Bitmap;LW7/d;)V", "Landroid/graphics/drawable/Drawable;", "placeholder", "f", "(Landroid/graphics/drawable/Drawable;)V", "errorDrawable", "m", "localnotification-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o.e f96539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s f96540e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f96541f;

        a(o.e eVar, s sVar, int i10) {
            this.f96539d = eVar;
            this.f96540e = sVar;
            this.f96541f = i10;
        }

        /* renamed from: a */
        public void j(Bitmap bitmap, W7.d<? super Bitmap> dVar) {
            C17542s.j(bitmap, "resource");
            Notification b10 = this.f96539d.n(bitmap).b();
            C17542s.i(b10, "build(...)");
            this.f96540e.j(this.f96541f, b10);
        }

        public void f(Drawable drawable) {
        }

        public void m(Drawable drawable) {
            this.f96540e.j(this.f96541f, this.f96539d.b());
            super.m(drawable);
        }
    }

    public d(Context context, b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "notificationChannelMapper");
        this.f96537a = context;
        this.f96538b = bVar;
    }

    private final PendingIntent c(Context context, String str, String str2, C11783c cVar) {
        Intent intent = new Intent(context, LocalNotificationReceiver.class);
        intent.putExtra("com.ingka.ikea.notificationId", str);
        intent.putExtra("com.ingka.ikea.purpose", str2);
        intent.putExtra("com.ingka.ikea.source", cVar.b());
        return PendingIntent.getBroadcast(context.getApplicationContext(), str.hashCode(), intent, 67108864);
    }

    public boolean a() {
        return Build.VERSION.SDK_INT < 33 || this.f96537a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
    }

    @SuppressLint({"MissingPermission"})
    public void b(PendingIntent pendingIntent, C11784d dVar, int i10) {
        C17542s.j(dVar, "messageData");
        if (!a()) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Notification permission missing.", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            return;
        }
        String a11 = dVar.c().a();
        o.e A10 = new o.e(this.f96537a, a11).j(dVar.g()).i(dVar.a()).y(dVar.a()).v(IconCompat.d(this.f96537a, C10027d.f75283n)).x(new o.c().h(dVar.a())).e(true).r(true).k(2).l(c(this.f96537a, dVar.d(), dVar.e(), dVar.f())).A(i10);
        C17542s.i(A10, "setVisibility(...)");
        A10.h(pendingIntent);
        s g10 = s.g(this.f96537a);
        C17542s.i(g10, "from(...)");
        n a12 = new n.c(a11, dVar.c().b()).b(this.f96537a.getString(this.f96538b.a(dVar.c()))).a();
        C17542s.i(a12, "build(...)");
        g10.e(a12);
        int hashCode = dVar.d().hashCode();
        String b10 = dVar.b();
        if (b10 == null || ((a) b.t(this.f96537a).d().M0(b10).F0(new a(A10, g10, hashCode))) == null) {
            g10.j(hashCode, A10.b());
            C16807N n10 = C16807N.f139792a;
        }
    }
}
