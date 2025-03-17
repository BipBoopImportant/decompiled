package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import j0.C5446b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u2.C6013b;

class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f21092a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f21093b;

    /* renamed from: c  reason: collision with root package name */
    private final o.e f21094c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f21095d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f21096e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f21097f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f21098g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f21099h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f21100i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    q(o.e eVar) {
        int i10;
        this.f21094c = eVar;
        Context context = eVar.f21052a;
        this.f21092a = context;
        Notification.Builder a10 = e.a(context, eVar.f21040K);
        this.f21093b = a10;
        Notification notification = eVar.f21048S;
        a10.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f21060i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f21056e).setContentText(eVar.f21057f).setContentInfo(eVar.f21062k).setContentIntent(eVar.f21058g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f21059h, (notification.flags & 128) != 0).setNumber(eVar.f21063l).setProgress(eVar.f21071t, eVar.f21072u, eVar.f21073v);
        IconCompat iconCompat = eVar.f21061j;
        c.b(a10, iconCompat == null ? null : iconCompat.p(context));
        a10.setSubText(eVar.f21068q).setUsesChronometer(eVar.f21066o).setPriority(eVar.f21064m);
        o.g gVar = eVar.f21067p;
        if (gVar instanceof o.f) {
            for (o.a b10 : ((o.f) gVar).h()) {
                b(b10);
            }
        } else {
            Iterator<o.a> it = eVar.f21053b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
        Bundle bundle = eVar.f21033D;
        if (bundle != null) {
            this.f21098g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f21095d = eVar.f21037H;
        this.f21096e = eVar.f21038I;
        this.f21093b.setShowWhen(eVar.f21065n);
        a.g(this.f21093b, eVar.f21077z);
        a.e(this.f21093b, eVar.f21074w);
        a.h(this.f21093b, eVar.f21076y);
        a.f(this.f21093b, eVar.f21075x);
        this.f21099h = eVar.f21045P;
        b.b(this.f21093b, eVar.f21032C);
        b.c(this.f21093b, eVar.f21034E);
        b.f(this.f21093b, eVar.f21035F);
        b.d(this.f21093b, eVar.f21036G);
        b.e(this.f21093b, notification.sound, notification.audioAttributes);
        List<String> e10 = i11 < 28 ? e(g(eVar.f21054c), eVar.f21051V) : eVar.f21051V;
        if (e10 != null && !e10.isEmpty()) {
            for (String a11 : e10) {
                b.a(this.f21093b, a11);
            }
        }
        this.f21100i = eVar.f21039J;
        if (eVar.f21055d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f21055d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), r.a(eVar.f21055d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f21098g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f21050U;
        if (obj != null) {
            c.c(this.f21093b, obj);
        }
        this.f21093b.setExtras(eVar.f21033D);
        d.e(this.f21093b, eVar.f21070s);
        RemoteViews remoteViews = eVar.f21037H;
        if (remoteViews != null) {
            d.c(this.f21093b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f21038I;
        if (remoteViews2 != null) {
            d.b(this.f21093b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f21039J;
        if (remoteViews3 != null) {
            d.d(this.f21093b, remoteViews3);
        }
        e.b(this.f21093b, eVar.f21041L);
        e.e(this.f21093b, eVar.f21069r);
        e.f(this.f21093b, eVar.f21042M);
        e.g(this.f21093b, eVar.f21044O);
        e.d(this.f21093b, eVar.f21045P);
        if (eVar.f21031B) {
            e.c(this.f21093b, eVar.f21030A);
        }
        if (!TextUtils.isEmpty(eVar.f21040K)) {
            this.f21093b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        if (i13 >= 28) {
            Iterator<w> it2 = eVar.f21054c.iterator();
            while (it2.hasNext()) {
                f.a(this.f21093b, it2.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f21093b, eVar.f21047R);
            g.b(this.f21093b, o.d.a((o.d) null));
            C6013b bVar = eVar.f21043N;
            if (bVar != null) {
                g.d(this.f21093b, bVar.c());
            }
        }
        if (i14 >= 31 && (i10 = eVar.f21046Q) != 0) {
            h.b(this.f21093b, i10);
        }
        if (eVar.f21049T) {
            if (this.f21094c.f21075x) {
                this.f21099h = 2;
            } else {
                this.f21099h = 1;
            }
            this.f21093b.setVibrate((long[]) null);
            this.f21093b.setSound((Uri) null);
            int i15 = notification.defaults & -4;
            notification.defaults = i15;
            this.f21093b.setDefaults(i15);
            if (TextUtils.isEmpty(this.f21094c.f21074w)) {
                a.e(this.f21093b, "silent");
            }
            e.d(this.f21093b, this.f21099h);
        }
    }

    private void b(o.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = c.a(d10 != null ? d10.o() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput c10 : y.b(aVar.e())) {
                a.c(a10, c10);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            g.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            h.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a10, bundle);
        a.a(this.f21093b, a.d(a10));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C5446b bVar = new C5446b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<w> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (w g10 : list) {
            arrayList.add(g10.g());
        }
        return arrayList;
    }

    public Notification.Builder a() {
        return this.f21093b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        o.g gVar = this.f21094c.f21067p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews e10 = gVar != null ? gVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null) {
            d11.contentView = e10;
        } else {
            RemoteViews remoteViews = this.f21094c.f21037H;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        if (!(gVar == null || (d10 = gVar.d(this)) == null)) {
            d11.bigContentView = d10;
        }
        if (!(gVar == null || (f10 = this.f21094c.f21067p.f(this)) == null)) {
            d11.headsUpContentView = f10;
        }
        if (!(gVar == null || (a10 = o.a(d11)) == null)) {
            gVar.a(a10);
        }
        return d11;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        return this.f21093b.build();
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f21092a;
    }
}
