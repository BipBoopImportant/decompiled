package com.google.android.gms.common;

import D9.b;
import H9.C6535i;
import H9.O;
import H9.P;
import K9.C6620s;
import K9.F;
import K9.I;
import aa.C6991d;
import aa.e;
import aa.h;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.core.app.o;
import androidx.fragment.app.C5191t;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.l;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {C6991d.class, e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f47975d = b.f48047a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f47976e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final a f47977f = new a();

    /* renamed from: c  reason: collision with root package name */
    private String f47978c;

    public static a n() {
        return f47977f;
    }

    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    public final String e(int i10) {
        return super.e(i10);
    }

    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog l(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i10, I.b(activity, b(activity, i10, "d"), i11), onCancelListener, (DialogInterface.OnClickListener) null);
    }

    public PendingIntent m(Context context, ConnectionResult connectionResult) {
        return connectionResult.J() ? connectionResult.F() : c(context, connectionResult.x(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l10 = l(activity, i10, i11, onCancelListener);
        if (l10 == null) {
            return false;
        }
        t(activity, l10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i10) {
        u(context, i10, (String) null, d(context, i10, 0, "n"));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.DialogInterface$OnClickListener] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog q(android.content.Context r6, int r7, K9.I r8, android.content.DialogInterface.OnCancelListener r9, android.content.DialogInterface.OnClickListener r10) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 16843529(0x1010309, float:2.3695736E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r1.resourceId
            java.lang.String r1 = r2.getResourceEntryName(r1)
            java.lang.String r2 = "Theme.Dialog.Alert"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 5
            r0.<init>(r6, r1)
        L_0x002c:
            if (r0 != 0) goto L_0x0033
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
        L_0x0033:
            java.lang.String r1 = K9.F.c(r6, r7)
            r0.setMessage(r1)
            if (r9 == 0) goto L_0x003f
            r0.setOnCancelListener(r9)
        L_0x003f:
            java.lang.String r9 = K9.F.b(r6, r7)
            if (r9 == 0) goto L_0x004b
            if (r8 != 0) goto L_0x0048
            r8 = r10
        L_0x0048:
            r0.setPositiveButton(r9, r8)
        L_0x004b:
            java.lang.String r6 = K9.F.f(r6, r7)
            if (r6 == 0) goto L_0x0054
            r0.setTitle(r6)
        L_0x0054:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            java.lang.String r8 = "GoogleApiAvailability"
            android.util.Log.w(r8, r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.a.q(android.content.Context, int, K9.I, android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnClickListener):android.app.Dialog");
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(F.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final P s(Context context, O o10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        P p10 = new P(o10);
        h.q(context, p10, intentFilter);
        p10.a(context);
        if (i(context, "com.google.android.gms")) {
            return p10;
        }
        o10.a();
        p10.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C5191t) {
                SupportErrorDialogFragment.q(dialog, onCancelListener).show(((C5191t) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    public final void u(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            v(context);
        } else if (pendingIntent != null) {
            String e10 = F.e(context, i10);
            String d10 = F.d(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C6620s.l(context.getSystemService("notification"));
            o.e x10 = new o.e(context).p(true).e(true).j(e10).x(new o.c().h(d10));
            if (i.c(context)) {
                C6620s.p(l.b());
                x10.u(context.getApplicationInfo().icon).s(2);
                if (i.d(context)) {
                    x10.a(D9.a.f34601a, resources.getString(b.f34616o), pendingIntent);
                } else {
                    x10.h(pendingIntent);
                }
            } else {
                x10.u(17301642).y(resources.getString(b.f34609h)).B(System.currentTimeMillis()).h(pendingIntent).i(d10);
            }
            if (l.e()) {
                C6620s.p(l.e());
                synchronized (f47976e) {
                    str2 = this.f47978c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String string = context.getResources().getString(b.f34608g);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                x10.f(str2);
            }
            Notification b10 = x10.b();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                d.f48051b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, b10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void v(Context context) {
        new e(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    @ResultIgnorabilityUnspecified
    public final boolean w(Activity activity, C6535i iVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog q10 = q(activity, i10, I.c(iVar, b(activity, i10, "d"), 2), onCancelListener, (DialogInterface.OnClickListener) null);
        if (q10 == null) {
            return false;
        }
        t(activity, q10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent m10;
        if (S9.a.a(context) || (m10 = m(context, connectionResult)) == null) {
            return false;
        }
        u(context, connectionResult.x(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, m10, i10, true), aa.i.f42997a | 134217728));
        return true;
    }
}
