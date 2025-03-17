package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import t2.C5944b;
import t2.C5945c;
import t2.C5946d;
import t2.C5948f;
import u2.C6012a;
import u2.C6013b;

public class o {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f21002a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f21003b;

        /* renamed from: c  reason: collision with root package name */
        private final y[] f21004c;

        /* renamed from: d  reason: collision with root package name */
        private final y[] f21005d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f21006e;

        /* renamed from: f  reason: collision with root package name */
        boolean f21007f;

        /* renamed from: g  reason: collision with root package name */
        private final int f21008g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f21009h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f21010i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f21011j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f21012k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f21013l;

        /* renamed from: androidx.core.app.o$a$a  reason: collision with other inner class name */
        public static final class C0327a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f21014a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f21015b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f21016c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f21017d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f21018e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<y> f21019f;

            /* renamed from: g  reason: collision with root package name */
            private int f21020g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f21021h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f21022i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f21023j;

            public C0327a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (y[]) null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f21022i && this.f21016c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.o.a a() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.b()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.y> r3 = r0.f21019f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.y r4 = (androidx.core.app.y) r4
                    boolean r5 = r4.j()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.y[] r3 = new androidx.core.app.y[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.y[] r1 = (androidx.core.app.y[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004f
                L_0x004d:
                    r10 = r4
                    goto L_0x005d
                L_0x004f:
                    int r1 = r2.size()
                    androidx.core.app.y[] r1 = new androidx.core.app.y[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.y[] r4 = (androidx.core.app.y[]) r4
                    goto L_0x004d
                L_0x005d:
                    androidx.core.app.o$a r1 = new androidx.core.app.o$a
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f21014a
                    java.lang.CharSequence r7 = r0.f21015b
                    android.app.PendingIntent r8 = r0.f21016c
                    android.os.Bundle r9 = r0.f21018e
                    boolean r12 = r0.f21017d
                    int r13 = r0.f21020g
                    boolean r14 = r0.f21021h
                    boolean r15 = r0.f21022i
                    boolean r2 = r0.f21023j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.o.a.C0327a.a():androidx.core.app.o$a");
            }

            private C0327a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, y[] yVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                ArrayList<y> arrayList;
                this.f21017d = true;
                this.f21021h = true;
                this.f21014a = iconCompat;
                this.f21015b = e.d(charSequence);
                this.f21016c = pendingIntent;
                this.f21018e = bundle;
                if (yVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(yVarArr));
                }
                this.f21019f = arrayList;
                this.f21017d = z10;
                this.f21020g = i10;
                this.f21021h = z11;
                this.f21022i = z12;
                this.f21023j = z13;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.e((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f21012k;
        }

        public boolean b() {
            return this.f21006e;
        }

        public Bundle c() {
            return this.f21002a;
        }

        public IconCompat d() {
            int i10;
            if (this.f21003b == null && (i10 = this.f21010i) != 0) {
                this.f21003b = IconCompat.e((Resources) null, "", i10);
            }
            return this.f21003b;
        }

        public y[] e() {
            return this.f21004c;
        }

        public int f() {
            return this.f21008g;
        }

        public boolean g() {
            return this.f21007f;
        }

        public CharSequence h() {
            return this.f21011j;
        }

        public boolean i() {
            return this.f21013l;
        }

        public boolean j() {
            return this.f21009h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (y[]) null, (y[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, y[] yVarArr, y[] yVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f21007f = true;
            this.f21003b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f21010i = iconCompat.g();
            }
            this.f21011j = e.d(charSequence);
            this.f21012k = pendingIntent;
            this.f21002a = bundle == null ? new Bundle() : bundle;
            this.f21004c = yVarArr;
            this.f21005d = yVarArr2;
            this.f21006e = z10;
            this.f21008g = i10;
            this.f21007f = z11;
            this.f21009h = z12;
            this.f21013l = z13;
        }
    }

    public static class b extends g {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f21024e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f21025f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f21026g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f21027h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f21028i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.o$b$b  reason: collision with other inner class name */
        private static class C0328b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(m mVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.a()).setBigContentTitle(this.f21089b);
            IconCompat iconCompat = this.f21024e;
            Context context = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0328b.a(bigContentTitle, this.f21024e.p(mVar instanceof q ? ((q) mVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f21024e.f());
                }
            }
            if (this.f21026g) {
                if (this.f21025f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (mVar instanceof q) {
                        context = ((q) mVar).f();
                    }
                    a.a(bigContentTitle, this.f21025f.p(context));
                }
            }
            if (this.f21091d) {
                bigContentTitle.setSummaryText(this.f21090c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0328b.c(bigContentTitle, this.f21028i);
                C0328b.b(bigContentTitle, this.f21027h);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f21025f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f21026g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f21024e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }
    }

    public static class c extends g {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f21029e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(m mVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(mVar.a()).setBigContentTitle(this.f21089b).bigText(this.f21029e);
            if (this.f21091d) {
                bigText.setSummaryText(this.f21090c);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f21029e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends g {

        /* renamed from: e  reason: collision with root package name */
        private int f21078e;

        /* renamed from: f  reason: collision with root package name */
        private w f21079f;

        /* renamed from: g  reason: collision with root package name */
        private PendingIntent f21080g;

        /* renamed from: h  reason: collision with root package name */
        private PendingIntent f21081h;

        /* renamed from: i  reason: collision with root package name */
        private PendingIntent f21082i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f21083j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f21084k;

        /* renamed from: l  reason: collision with root package name */
        private Integer f21085l;

        /* renamed from: m  reason: collision with root package name */
        private IconCompat f21086m;

        /* renamed from: n  reason: collision with root package name */
        private CharSequence f21087n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i10 = this.f21078e;
            if (i10 == 1) {
                return this.f21088a.f21052a.getResources().getString(C5948f.f29388e);
            }
            if (i10 == 2) {
                return this.f21088a.f21052a.getResources().getString(C5948f.f29389f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f21088a.f21052a.getResources().getString(C5948f.f29390g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C6012a.c(this.f21088a.f21052a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f21088a.f21052a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a a10 = new a.C0327a(IconCompat.d(this.f21088a.f21052a, i10), spannableStringBuilder, pendingIntent).a();
            a10.c().putBoolean("key_action_priority", true);
            return a10;
        }

        private a l() {
            int i10 = C5946d.f29337b;
            int i11 = C5946d.f29336a;
            PendingIntent pendingIntent = this.f21080g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f21083j;
            return k(z10 ? i10 : i11, z10 ? C5948f.f29385b : C5948f.f29384a, this.f21084k, C5944b.f29332a, pendingIntent);
        }

        private a m() {
            int i10 = C5946d.f29338c;
            PendingIntent pendingIntent = this.f21081h;
            if (pendingIntent == null) {
                return k(i10, C5948f.f29387d, this.f21085l, C5944b.f29333b, this.f21082i);
            }
            return k(i10, C5948f.f29386c, this.f21085l, C5944b.f29333b, pendingIntent);
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f21078e);
            bundle.putBoolean("android.callIsVideo", this.f21083j);
            w wVar = this.f21079f;
            if (wVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(wVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", wVar.i());
                }
            }
            IconCompat iconCompat = this.f21086m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.p(this.f21088a.f21052a)));
            }
            bundle.putCharSequence("android.verificationText", this.f21087n);
            bundle.putParcelable("android.answerIntent", this.f21080g);
            bundle.putParcelable("android.declineIntent", this.f21081h);
            bundle.putParcelable("android.hangUpIntent", this.f21082i);
            Integer num = this.f21084k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f21085l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public void b(m mVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.CallStyle callStyle = null;
            if (i10 >= 31) {
                int i11 = this.f21078e;
                if (i11 == 1) {
                    callStyle = d.a(this.f21079f.h(), this.f21081h, this.f21080g);
                } else if (i11 == 2) {
                    callStyle = d.b(this.f21079f.h(), this.f21082i);
                } else if (i11 == 3) {
                    callStyle = d.c(this.f21079f.h(), this.f21082i, this.f21080g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f21078e));
                }
                if (callStyle != null) {
                    callStyle.setBuilder(mVar.a());
                    Integer num = this.f21084k;
                    if (num != null) {
                        d.d(callStyle, num.intValue());
                    }
                    Integer num2 = this.f21085l;
                    if (num2 != null) {
                        d.e(callStyle, num2.intValue());
                    }
                    d.h(callStyle, this.f21087n);
                    IconCompat iconCompat = this.f21086m;
                    if (iconCompat != null) {
                        d.g(callStyle, iconCompat.p(this.f21088a.f21052a));
                    }
                    d.f(callStyle, this.f21083j);
                    return;
                }
                return;
            }
            Notification.Builder a10 = mVar.a();
            w wVar = this.f21079f;
            a10.setContentTitle(wVar != null ? wVar.c() : null);
            Bundle bundle = this.f21088a.f21033D;
            if (bundle != null && bundle.containsKey("android.text")) {
                callStyle = this.f21088a.f21033D.getCharSequence("android.text");
            }
            if (callStyle == null) {
                callStyle = i();
            }
            a10.setContentText(callStyle);
            w wVar2 = this.f21079f;
            if (wVar2 != null) {
                if (wVar2.a() != null) {
                    b.b(a10, this.f21079f.a().p(this.f21088a.f21052a));
                }
                if (i10 >= 28) {
                    c.a(a10, this.f21079f.h());
                } else {
                    a.a(a10, this.f21079f.d());
                }
            }
            a.b(a10, "call");
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a m10 = m();
            a l10 = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m10);
            ArrayList<a> arrayList2 = this.f21088a.f21053b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a next : arrayList2) {
                    if (next.j()) {
                        arrayList.add(next);
                    } else if (!j(next) && i10 > 1) {
                        arrayList.add(next);
                        i10--;
                    }
                    if (l10 != null && i10 == 1) {
                        arrayList.add(l10);
                        i10--;
                    }
                }
            }
            if (l10 != null && i10 >= 1) {
                arrayList.add(l10);
            }
            return arrayList;
        }
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        protected e f21088a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f21089b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f21090c;

        /* renamed from: d  reason: collision with root package name */
        boolean f21091d = false;

        public void a(Bundle bundle) {
            if (this.f21091d) {
                bundle.putCharSequence("android.summaryText", this.f21090c);
            }
            CharSequence charSequence = this.f21089b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(m mVar);

        /* access modifiers changed from: protected */
        public abstract String c();

        public RemoteViews d(m mVar) {
            return null;
        }

        public RemoteViews e(m mVar) {
            return null;
        }

        public RemoteViews f(m mVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f21088a != eVar) {
                this.f21088a = eVar;
                if (eVar != null) {
                    eVar.x(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5945c.f29335b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C5945c.f29334a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
    }

    public static class e {

        /* renamed from: A  reason: collision with root package name */
        boolean f21030A;

        /* renamed from: B  reason: collision with root package name */
        boolean f21031B;

        /* renamed from: C  reason: collision with root package name */
        String f21032C;

        /* renamed from: D  reason: collision with root package name */
        Bundle f21033D;

        /* renamed from: E  reason: collision with root package name */
        int f21034E;

        /* renamed from: F  reason: collision with root package name */
        int f21035F;

        /* renamed from: G  reason: collision with root package name */
        Notification f21036G;

        /* renamed from: H  reason: collision with root package name */
        RemoteViews f21037H;

        /* renamed from: I  reason: collision with root package name */
        RemoteViews f21038I;

        /* renamed from: J  reason: collision with root package name */
        RemoteViews f21039J;

        /* renamed from: K  reason: collision with root package name */
        String f21040K;

        /* renamed from: L  reason: collision with root package name */
        int f21041L;

        /* renamed from: M  reason: collision with root package name */
        String f21042M;

        /* renamed from: N  reason: collision with root package name */
        C6013b f21043N;

        /* renamed from: O  reason: collision with root package name */
        long f21044O;

        /* renamed from: P  reason: collision with root package name */
        int f21045P;

        /* renamed from: Q  reason: collision with root package name */
        int f21046Q;

        /* renamed from: R  reason: collision with root package name */
        boolean f21047R;

        /* renamed from: S  reason: collision with root package name */
        Notification f21048S;

        /* renamed from: T  reason: collision with root package name */
        boolean f21049T;

        /* renamed from: U  reason: collision with root package name */
        Object f21050U;
        @Deprecated

        /* renamed from: V  reason: collision with root package name */
        public ArrayList<String> f21051V;

        /* renamed from: a  reason: collision with root package name */
        public Context f21052a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f21053b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<w> f21054c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f21055d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f21056e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f21057f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f21058g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f21059h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f21060i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f21061j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f21062k;

        /* renamed from: l  reason: collision with root package name */
        int f21063l;

        /* renamed from: m  reason: collision with root package name */
        int f21064m;

        /* renamed from: n  reason: collision with root package name */
        boolean f21065n;

        /* renamed from: o  reason: collision with root package name */
        boolean f21066o;

        /* renamed from: p  reason: collision with root package name */
        g f21067p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f21068q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f21069r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f21070s;

        /* renamed from: t  reason: collision with root package name */
        int f21071t;

        /* renamed from: u  reason: collision with root package name */
        int f21072u;

        /* renamed from: v  reason: collision with root package name */
        boolean f21073v;

        /* renamed from: w  reason: collision with root package name */
        String f21074w;

        /* renamed from: x  reason: collision with root package name */
        boolean f21075x;

        /* renamed from: y  reason: collision with root package name */
        String f21076y;

        /* renamed from: z  reason: collision with root package name */
        boolean f21077z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f21053b = new ArrayList<>();
            this.f21054c = new ArrayList<>();
            this.f21055d = new ArrayList<>();
            this.f21065n = true;
            this.f21077z = false;
            this.f21034E = 0;
            this.f21035F = 0;
            this.f21041L = 0;
            this.f21045P = 0;
            this.f21046Q = 0;
            Notification notification = new Notification();
            this.f21048S = notification;
            this.f21052a = context;
            this.f21040K = str;
            notification.when = System.currentTimeMillis();
            this.f21048S.audioStreamType = -1;
            this.f21064m = 0;
            this.f21051V = new ArrayList<>();
            this.f21047R = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f21048S;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.f21048S;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(int i10) {
            this.f21035F = i10;
            return this;
        }

        public e B(long j10) {
            this.f21048S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f21053b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new q(this).c();
        }

        public Bundle c() {
            if (this.f21033D == null) {
                this.f21033D = new Bundle();
            }
            return this.f21033D;
        }

        public e e(boolean z10) {
            m(16, z10);
            return this;
        }

        public e f(String str) {
            this.f21040K = str;
            return this;
        }

        public e g(int i10) {
            this.f21034E = i10;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.f21058g = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f21057f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f21056e = d(charSequence);
            return this;
        }

        public e k(int i10) {
            Notification notification = this.f21048S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f21048S.deleteIntent = pendingIntent;
            return this;
        }

        public e n(Bitmap bitmap) {
            this.f21061j = bitmap == null ? null : IconCompat.c(o.b(this.f21052a, bitmap));
            return this;
        }

        public e o(int i10, int i11, int i12) {
            Notification notification = this.f21048S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e p(boolean z10) {
            this.f21077z = z10;
            return this;
        }

        public e q(int i10) {
            this.f21063l = i10;
            return this;
        }

        public e r(boolean z10) {
            m(8, z10);
            return this;
        }

        public e s(int i10) {
            this.f21064m = i10;
            return this;
        }

        public e t(boolean z10) {
            this.f21065n = z10;
            return this;
        }

        public e u(int i10) {
            this.f21048S.icon = i10;
            return this;
        }

        public e v(IconCompat iconCompat) {
            this.f21050U = iconCompat.p(this.f21052a);
            return this;
        }

        public e w(Uri uri) {
            Notification notification = this.f21048S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d10 = a.d(a.c(a.b(), 4), 5);
            this.f21048S.audioAttributes = a.a(d10);
            return this;
        }

        public e x(g gVar) {
            if (this.f21067p != gVar) {
                this.f21067p = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        public e y(CharSequence charSequence) {
            this.f21048S.tickerText = d(charSequence);
            return this;
        }

        public e z(long[] jArr) {
            this.f21048S.vibrate = jArr;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }
    }
}
