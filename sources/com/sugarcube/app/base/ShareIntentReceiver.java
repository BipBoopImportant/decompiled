package com.sugarcube.app.base;

import HJ.C15854t;
import JF.C13115w;
import OE.C13312d;
import OE.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.analytics.RoomSourceKt;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001b¨\u0006+"}, d2 = {"Lcom/sugarcube/app/base/ShareIntentReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "", "chosenApp", "Landroid/content/Context;", "context", "LXH/N;", "c", "(Ljava/lang/String;Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LOE/q;", "LOE/q;", "b", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "", "d", "I", "designId", "e", "Ljava/lang/String;", "designName", "f", "designUuid", "g", "roomUuid", "h", "roomId", "i", "roomName", "j", "roomSource", "k", "region", "l", "shareSource", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareIntentReceiver extends C13312d {

    /* renamed from: c  reason: collision with root package name */
    public q f122697c;

    /* renamed from: d  reason: collision with root package name */
    private int f122698d;

    /* renamed from: e  reason: collision with root package name */
    private String f122699e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f122700f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f122701g = "";

    /* renamed from: h  reason: collision with root package name */
    private int f122702h;

    /* renamed from: i  reason: collision with root package name */
    private String f122703i = "";

    /* renamed from: j  reason: collision with root package name */
    private String f122704j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f122705k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f122706l = "";

    private final void c(String str, Context context) {
        String str2 = str;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        String str3 = "Facebook";
        if (!C15854t.d0(lowerCase, "com.facebook.katana", false, 2, (Object) null) && !C15854t.d0(lowerCase, "com.facebook.lite", false, 2, (Object) null) && !C15854t.d0(lowerCase, "com.facebook.orc", false, 2, (Object) null) && !C15854t.d0(lowerCase, "com.facebook.mlite", false, 2, (Object) null)) {
            if (C15854t.d0(lowerCase, "com.twitter.android", false, 2, (Object) null)) {
                str3 = "Twitter";
            } else if (C15854t.d0(lowerCase, "com.pinterest", false, 2, (Object) null)) {
                str3 = "Pinterest";
            } else {
                str3 = "CopyLink";
                if (context != null) {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:user@domain.com"));
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
                    C17542s.i(queryIntentActivities, "queryIntentActivities(...)");
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        String str4 = resolveInfo.activityInfo.name;
                        C17542s.i(str4, "name");
                        if (C15854t.d0(str4, str2, false, 2, (Object) null)) {
                            str3 = "Email";
                        }
                    }
                }
            }
        }
        String str5 = str3;
        if (context != null) {
            int i10 = this.f122698d;
            String str6 = this.f122699e;
            UUID fromString = UUID.fromString(this.f122700f);
            C17542s.i(fromString, "fromString(...)");
            int i11 = this.f122702h;
            UUID fromString2 = UUID.fromString(this.f122701g);
            C17542s.i(fromString2, "fromString(...)");
            String str7 = this.f122703i;
            RoomSource roomSource = RoomSourceKt.toRoomSource(this.f122704j);
            String str8 = this.f122705k;
            C13115w.h(context, i10, str6, fromString, i11, fromString2, str7, roomSource, str8, str5, this.f122706l, b().b());
        }
    }

    public final q b() {
        q qVar = this.f122697c;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        Bundle extras6;
        Bundle extras7;
        Bundle extras8;
        Bundle extras9;
        super.onReceive(context, intent);
        String str = null;
        ComponentName componentName = intent != null ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT") : null;
        int i10 = 0;
        this.f122698d = (intent == null || (extras9 = intent.getExtras()) == null) ? 0 : extras9.getInt("SHARE_DESIGN_ID", 0);
        this.f122699e = String.valueOf((intent == null || (extras8 = intent.getExtras()) == null) ? null : extras8.getString("SHARE_DESIGN_NAME", ""));
        this.f122700f = String.valueOf((intent == null || (extras7 = intent.getExtras()) == null) ? null : extras7.getString("SHARE_DESIGN_UUID", ""));
        this.f122701g = String.valueOf((intent == null || (extras6 = intent.getExtras()) == null) ? null : extras6.getString("SHARE_ROOM_UUID", ""));
        if (!(intent == null || (extras5 = intent.getExtras()) == null)) {
            i10 = extras5.getInt("SHARE_ROOM_ID", 0);
        }
        this.f122702h = i10;
        this.f122703i = String.valueOf((intent == null || (extras4 = intent.getExtras()) == null) ? null : extras4.getString("SHARE_ROOM_NAME", ""));
        this.f122704j = String.valueOf((intent == null || (extras3 = intent.getExtras()) == null) ? null : extras3.getString("SHARE_ROOM_SOURCE", ""));
        this.f122705k = String.valueOf((intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("SHARE_REGION", ""));
        this.f122706l = String.valueOf((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("SHARE_SOURCE", ""));
        if (componentName != null) {
            str = componentName.getPackageName();
        }
        if (str != null) {
            c(str, context);
        }
    }
}
