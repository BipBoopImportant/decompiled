package JF;

import HJ.C15854t;
import OE.n;
import OE.q;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import VE.C13760b;
import XH.C16807N;
import XH.y;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.sugarcube.app.base.ShareIntentReceiver;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.EventType;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014\u001ai\u0010 \u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#\u001a!\u0010%\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&\u001a+\u0010(\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00012\b\b\u0002\u0010'\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroid/content/Context;", "", "sceneName", "Lcom/sugarcube/core/network/models/Composition;", "composition", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "roomSource", "LJF/M;", "shareType", "LOE/q;", "sugarcube", "LXH/N;", "f", "(Landroid/content/Context;Ljava/lang/String;Lcom/sugarcube/core/network/models/Composition;Lcom/sugarcube/app/base/data/analytics/RoomSource;LJF/M;LOE/q;)V", "Landroid/content/ClipboardManager;", "clipboardManager", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "shareSource", "a", "(Landroid/content/Context;Landroid/content/ClipboardManager;Lcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/core/network/models/Composition;Lcom/sugarcube/app/base/data/analytics/RoomSource;Ljava/lang/String;LOE/q;)V", "", "designId", "designName", "Ljava/util/UUID;", "designUuid", "roomId", "roomUuid", "roomName", "region", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "h", "(Landroid/content/Context;ILjava/lang/String;Ljava/util/UUID;ILjava/util/UUID;Ljava/lang/String;Lcom/sugarcube/app/base/data/analytics/RoomSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/app/base/data/analytics/Analytics;)V", "b", "(Landroid/content/Context;LOE/q;Lcom/sugarcube/core/network/models/Composition;)V", "sceneUuid", "d", "(Landroid/content/Context;LOE/q;Ljava/util/UUID;)V", "compositionUuid", "c", "(Landroid/content/Context;LOE/q;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.w  reason: case insensitive filesystem */
public final class C13115w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.utils.CompositionHelperKt$createSharingCompositionIntent$1", f = "CompositionHelper.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: JF.w$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PendingIntent f111349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f111350e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Composition f111351f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f111352g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroid/net/Uri;", "<anonymous>", "(LQJ/Q;)Landroid/net/Uri;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.utils.CompositionHelperKt$createSharingCompositionIntent$1$imgBitmapUri$1", f = "CompositionHelper.kt", l = {}, m = "invokeSuspend")
        /* renamed from: JF.w$a$a  reason: collision with other inner class name */
        static final class C2702a extends l implements p<Q, C17164e<? super Uri>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f111353c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Composition f111354d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f111355e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2702a(Composition composition, Context context, C17164e<? super C2702a> eVar) {
                super(2, eVar);
                this.f111354d = composition;
                this.f111355e = context;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2702a(this.f111354d, this.f111355e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super Uri> eVar) {
                return ((C2702a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                jI.C17416c.a(r0, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
                throw r2;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    eI.C17187b.f()
                    int r0 = r5.f111353c
                    if (r0 != 0) goto L_0x0073
                    XH.y.b(r6)
                    r6 = 0
                    java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0072 }
                    com.sugarcube.core.network.models.Composition r1 = r5.f111354d     // Catch:{ IOException -> 0x0072 }
                    android.net.Uri r1 = r1.getThumbnailUrl()     // Catch:{ IOException -> 0x0072 }
                    java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0072 }
                    r0.<init>(r1)     // Catch:{ IOException -> 0x0072 }
                    java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0072 }
                    java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ IOException -> 0x0072 }
                    java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ IOException -> 0x0072 }
                    boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0072 }
                    if (r1 == 0) goto L_0x002b
                    java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0072 }
                    goto L_0x002c
                L_0x002b:
                    r0 = r6
                L_0x002c:
                    if (r0 == 0) goto L_0x0072
                    r1 = 1
                    r0.setDoInput(r1)     // Catch:{ IOException -> 0x0072 }
                    r0.connect()     // Catch:{ IOException -> 0x0072 }
                    java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0072 }
                    if (r0 == 0) goto L_0x0072
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ all -> 0x006b }
                    jI.C17416c.a(r0, r6)     // Catch:{ IOException -> 0x0072 }
                    if (r1 == 0) goto L_0x0072
                    android.content.Context r0 = r5.f111355e     // Catch:{ IOException -> 0x0072 }
                    r2 = 100000(0x186a0, float:1.4013E-40)
                    rI.c r2 = rI.C17854d.a(r2)     // Catch:{ IOException -> 0x0072 }
                    android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ IOException -> 0x0072 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0072 }
                    r3.<init>()     // Catch:{ IOException -> 0x0072 }
                    java.lang.String r4 = "IMG:"
                    r3.append(r4)     // Catch:{ IOException -> 0x0072 }
                    r3.append(r2)     // Catch:{ IOException -> 0x0072 }
                    java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0072 }
                    java.lang.String r0 = android.provider.MediaStore.Images.Media.insertImage(r0, r1, r2, r6)     // Catch:{ IOException -> 0x0072 }
                    android.net.Uri r6 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x0072 }
                    goto L_0x0072
                L_0x006b:
                    r1 = move-exception
                    throw r1     // Catch:{ all -> 0x006d }
                L_0x006d:
                    r2 = move-exception
                    jI.C17416c.a(r0, r1)     // Catch:{ IOException -> 0x0072 }
                    throw r2     // Catch:{ IOException -> 0x0072 }
                L_0x0072:
                    return r6
                L_0x0073:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: JF.C13115w.a.C2702a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PendingIntent pendingIntent, Context context, Composition composition, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f111349d = pendingIntent;
            this.f111350e = context;
            this.f111351f = composition;
            this.f111352g = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f111349d, this.f111350e, this.f111351f, this.f111352g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111348c;
            if (i10 == 0) {
                y.b(obj);
                M b10 = C16311i0.b();
                C2702a aVar = new C2702a(this.f111351f, this.f111350e, (C17164e<? super C2702a>) null);
                this.f111348c = 1;
                obj = C16310i.g(b10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent = new Intent();
            Context context = this.f111350e;
            String str = this.f111352g;
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TITLE", context.getString(n.f113226J4));
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(n.f113232K4));
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.putExtra("android.intent.extra.STREAM", (Uri) obj);
            intent.setType("image/png");
            intent.addFlags(1);
            this.f111350e.startActivity(Intent.createChooser(intent, (CharSequence) null, this.f111349d.getIntentSender()));
            return C16807N.f139792a;
        }
    }

    public static final void a(Context context, ClipboardManager clipboardManager, Scene scene, Composition composition, RoomSource roomSource, String str, q qVar) {
        ClipData primaryClip;
        Context context2 = context;
        C17542s.j(context, "<this>");
        C17542s.j(roomSource, "roomSource");
        C17542s.j(str, "shareSource");
        C17542s.j(qVar, "sugarcube");
        if (clipboardManager != null && composition != null && scene != null && Build.VERSION.SDK_INT >= 29 && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String valueOf = String.valueOf(composition.getShareUrl());
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            String lowerCase = String.valueOf(itemAt != null ? itemAt.getText() : null).toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            if (C15854t.d0(lowerCase, valueOf, false, 2, (Object) null)) {
                int compositionId = composition.getCompositionId();
                String displayName = composition.getDisplayName();
                if (displayName == null) {
                    displayName = context.getString(n.f113453s3);
                    C17542s.i(displayName, "getString(...)");
                }
                h(context, compositionId, displayName, composition.getCompositionUuid(), composition.getSceneId(), composition.getSceneUuid(), scene.getName(), roomSource, qVar.getRegion(), "CopyLink", str, qVar.b());
                clipboardManager.clearPrimaryClip();
            }
        }
    }

    public static final void b(Context context, q qVar, Composition composition) {
        C17542s.j(context, "<this>");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(composition, "composition");
        String uuid = composition.getSceneUuid().toString();
        C17542s.i(uuid, "toString(...)");
        String uuid2 = composition.getCompositionUuid().toString();
        C17542s.i(uuid2, "toString(...)");
        c(context, qVar, uuid, uuid2);
    }

    public static final void c(Context context, q qVar, String str, String str2) {
        C17542s.j(context, "<this>");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(str, "sceneUuid");
        C17542s.j(str2, "compositionUuid");
        String f10 = C13760b.f117438d.f(qVar.getCountry(), qVar.getLanguage(), str, str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", n.f113462t5);
        intent.putExtra("android.intent.extra.TEXT", f10);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public static final void d(Context context, q qVar, UUID uuid) {
        C17542s.j(context, "<this>");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(uuid, "sceneUuid");
        String uuid2 = uuid.toString();
        C17542s.i(uuid2, "toString(...)");
        e(context, qVar, uuid2, (String) null, 4, (Object) null);
    }

    public static /* synthetic */ void e(Context context, q qVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "-1";
        }
        c(context, qVar, str, str2);
    }

    public static final void f(Context context, String str, Composition composition, RoomSource roomSource, C13091M m10, q qVar) {
        C17542s.j(context, "<this>");
        C17542s.j(str, "sceneName");
        C17542s.j(composition, "composition");
        C17542s.j(roomSource, "roomSource");
        C17542s.j(m10, "shareType");
        C17542s.j(qVar, "sugarcube");
        String valueOf = String.valueOf(composition.getShareUrl());
        Intent intent = new Intent(context, ShareIntentReceiver.class);
        String displayName = composition.getDisplayName();
        if (displayName == null) {
            displayName = context.getString(n.f113453s3);
            C17542s.i(displayName, "getString(...)");
        }
        intent.putExtra("SHARE_DESIGN_NAME", displayName);
        intent.putExtra("SHARE_DESIGN_ID", composition.getCompositionId());
        intent.putExtra("SHARE_DESIGN_UUID", composition.getCompositionUuid().toString());
        intent.putExtra("SHARE_ROOM_UUID", composition.getSceneUuid().toString());
        intent.putExtra("SHARE_ROOM_ID", composition.getSceneId());
        intent.putExtra("SHARE_ROOM_NAME", str);
        intent.putExtra("SHARE_ROOM_SOURCE", roomSource.getKey());
        intent.putExtra("SHARE_REGION", qVar.getRegion());
        intent.putExtra("SHARE_SOURCE", m10.name());
        F0 unused = C16314k.d(S.a(C16311i0.c()), (C17168i) null, (T) null, new a(Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(context, 0, intent, 167772160) : PendingIntent.getBroadcast(context, 0, intent, 134217728), context, composition, valueOf, (C17164e<? super a>) null), 3, (Object) null);
    }

    public static /* synthetic */ void g(Context context, String str, Composition composition, RoomSource roomSource, C13091M m10, q qVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            m10 = C13091M.GALLERY;
        }
        f(context, str, composition, roomSource, m10, qVar);
    }

    public static final void h(Context context, int i10, String str, UUID uuid, int i11, UUID uuid2, String str2, RoomSource roomSource, String str3, String str4, String str5, Analytics analytics) {
        Context context2 = context;
        C17542s.j(context, "<this>");
        C17542s.j(str, "designName");
        C17542s.j(uuid, "designUuid");
        UUID uuid3 = uuid2;
        C17542s.j(uuid3, "roomUuid");
        String str6 = str2;
        C17542s.j(str6, "roomName");
        RoomSource roomSource2 = roomSource;
        C17542s.j(roomSource2, "roomSource");
        String str7 = str3;
        C17542s.j(str7, "region");
        String str8 = str4;
        C17542s.j(str8, "shareType");
        C17542s.j(str5, "shareSource");
        Analytics analytics2 = analytics;
        C17542s.j(analytics2, "analytics");
        analytics2.shareDesign(EventType.GalleryDesignSheetShareDesign, str6, uuid3, i11, i10, str, str7, roomSource2, uuid, str8);
    }
}
