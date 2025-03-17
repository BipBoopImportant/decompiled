package com.ingka.ikea.app;

import Ae.e;
import HJ.C15854t;
import XH.t;
import YH.C16877v;
import aA.C13909a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.killswitch.model.BlockApp;
import com.ingka.ikea.killswitch.model.BlockAppButton;
import com.ingka.ikea.killswitch.model.ButtonDetails;
import com.ingka.ikea.killswitch.model.ConfigAlert;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kg.C9978a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0015R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lcom/ingka/ikea/app/BlockingMessageActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "blockApp", "LXH/N;", "J0", "(Lcom/ingka/ikea/killswitch/model/BlockApp;)V", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "configAlert", "K0", "(Lcom/ingka/ikea/killswitch/model/ConfigAlert;)V", "", "secondaryButtonText", "L0", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "I0", "(Landroid/view/View;)V", "N0", "M0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "v", "onClick", "Lpw/a;", "H", "Lpw/a;", "H0", "()Lpw/a;", "setSplashActivityApi", "(Lpw/a;)V", "splashActivityApi", "Ltf/a;", "I", "Ltf/a;", "F0", "()Ltf/a;", "setKillswitchRepository", "(Ltf/a;)V", "killswitchRepository", "LaA/a;", "J", "LaA/a;", "G0", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LEo/a;", "K", "LEo/a;", "E0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LRd/a;", "L", "LRd/a;", "C0", "()LRd/a;", "setAcountNavigation", "(LRd/a;)V", "acountNavigation", "LAe/e;", "M", "LAe/e;", "D0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lkg/a;", "N", "Lkg/a;", "binding", "Lcom/ingka/ikea/app/BlockingMessageActivity$a;", "O", "Lcom/ingka/ikea/app/BlockingMessageActivity$a;", "currentMode", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "P", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "killSwitchConfig", "a", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockingMessageActivity extends e implements View.OnClickListener {

    /* renamed from: H  reason: collision with root package name */
    public pw.a f69934H;

    /* renamed from: I  reason: collision with root package name */
    public C10253a f69935I;

    /* renamed from: J  reason: collision with root package name */
    public C13909a f69936J;

    /* renamed from: K  reason: collision with root package name */
    public Eo.a f69937K;

    /* renamed from: L  reason: collision with root package name */
    public Rd.a f69938L;

    /* renamed from: M  reason: collision with root package name */
    public e f69939M;

    /* renamed from: N  reason: collision with root package name */
    private C9978a f69940N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public a f69941O;

    /* renamed from: P  reason: collision with root package name */
    private KillSwitchConfig f69942P;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/BlockingMessageActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIG_ALERT", "BLOCKING_MESSAGE", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        CONFIG_ALERT,
        BLOCKING_MESSAGE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69943a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f69944b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f69945c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f69946d;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0086 */
        static {
            /*
                com.ingka.ikea.killswitch.model.BlockAppButton$c[] r0 = com.ingka.ikea.killswitch.model.BlockAppButton.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.ingka.ikea.killswitch.model.BlockAppButton$c r2 = com.ingka.ikea.killswitch.model.BlockAppButton.c.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.ingka.ikea.killswitch.model.BlockAppButton$c r3 = com.ingka.ikea.killswitch.model.BlockAppButton.c.DOWNLOAD_NEW_APP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.ingka.ikea.killswitch.model.BlockAppButton$c r4 = com.ingka.ikea.killswitch.model.BlockAppButton.c.UPDATE_THE_APP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.killswitch.model.BlockAppButton$c r4 = com.ingka.ikea.killswitch.model.BlockAppButton.c.MAIN_ACTION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f69943a = r0
                com.ingka.ikea.killswitch.model.BlockAppButton$b[] r0 = com.ingka.ikea.killswitch.model.BlockAppButton.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.killswitch.model.BlockAppButton$b r4 = com.ingka.ikea.killswitch.model.BlockAppButton.b.NONE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.ingka.ikea.killswitch.model.BlockAppButton$b r4 = com.ingka.ikea.killswitch.model.BlockAppButton.b.CLOSE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.ingka.ikea.killswitch.model.BlockAppButton$b r4 = com.ingka.ikea.killswitch.model.BlockAppButton.b.CANCEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                f69944b = r0
                com.ingka.ikea.killswitch.model.BlockApp$BlockAppType[] r0 = com.ingka.ikea.killswitch.model.BlockApp.BlockAppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.killswitch.model.BlockApp$BlockAppType r4 = com.ingka.ikea.killswitch.model.BlockApp.BlockAppType.TEMPORARY_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                com.ingka.ikea.killswitch.model.BlockApp$BlockAppType r4 = com.ingka.ikea.killswitch.model.BlockApp.BlockAppType.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                com.ingka.ikea.killswitch.model.BlockApp$BlockAppType r4 = com.ingka.ikea.killswitch.model.BlockApp.BlockAppType.GENERIC     // Catch:{ NoSuchFieldError -> 0x006d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f69945c = r0
                com.ingka.ikea.killswitch.model.ConfigAlert$b[] r0 = com.ingka.ikea.killswitch.model.ConfigAlert.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.killswitch.model.ConfigAlert$b r4 = com.ingka.ikea.killswitch.model.ConfigAlert.b.PROMOTE_LOGIN     // Catch:{ NoSuchFieldError -> 0x007e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                com.ingka.ikea.killswitch.model.ConfigAlert$b r1 = com.ingka.ikea.killswitch.model.ConfigAlert.b.GENERIC     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                com.ingka.ikea.killswitch.model.ConfigAlert$b r1 = com.ingka.ikea.killswitch.model.ConfigAlert.b.APP_STORE     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                f69946d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.BlockingMessageActivity.b.<clinit>():void");
        }
    }

    private final void I0(View view) {
        KillSwitchConfig killSwitchConfig = this.f69942P;
        ConfigAlert a10 = killSwitchConfig != null ? killSwitchConfig.a() : null;
        if (a10 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Button clicked but config alert is null");
            qv.e eVar = qv.e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 != null) {
                        str = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = BlockingMessageActivity.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            return;
        }
        List<ButtonDetails> b10 = a10.b();
        if (b10 == null) {
            b10 = C16877v.n();
        }
        int i10 = b.f69946d[a10.c().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                String b11 = !b10.isEmpty() ? b10.get((view.getTag() instanceof BlockAppButton.c) ^ true ? 1 : 0).b() : "";
                if (b11 == null || b11.length() == 0) {
                    finish();
                } else {
                    E0().a(this, b11);
                }
            } else if (i10 != 3) {
                throw new t();
            } else if (!(view.getTag() instanceof BlockAppButton.c)) {
                finish();
            } else if (!b10.isEmpty()) {
                String a12 = b10.get(0).a();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(a12));
                startActivity(intent);
            }
        } else if (view.getTag() instanceof BlockAppButton.c) {
            e.c.b(D0(), Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
            C0().d(this);
            finish();
        } else {
            finish();
        }
    }

    private final void J0(BlockApp blockApp) {
        C9978a aVar = this.f69940N;
        C9978a aVar2 = null;
        if (aVar == null) {
            C17542s.z("binding");
            aVar = null;
        }
        aVar.f75072d.setText(blockApp.e());
        C9978a aVar3 = this.f69940N;
        if (aVar3 == null) {
            C17542s.z("binding");
            aVar3 = null;
        }
        aVar3.f75071c.setText(blockApp.d());
        List<BlockAppButton> c10 = blockApp.c();
        int i10 = b.f69945c[blockApp.b().ordinal()];
        if (i10 == 1) {
            C9978a aVar4 = this.f69940N;
            if (aVar4 == null) {
                C17542s.z("binding");
                aVar4 = null;
            }
            Button button = aVar4.f75070b;
            button.setOnClickListener((View.OnClickListener) null);
            C17542s.g(button);
            button.setVisibility(8);
            String c11 = !c10.isEmpty() ? c10.get(0).c() : getString(Oo.b.f84518U0);
            C9978a aVar5 = this.f69940N;
            if (aVar5 == null) {
                C17542s.z("binding");
            } else {
                aVar2 = aVar5;
            }
            Button button2 = aVar2.f75074f;
            C17542s.g(button2);
            button2.setVisibility(0);
            button2.setText(c11);
            C17542s.g(button2);
        } else if (i10 != 2 && i10 != 3) {
            throw new t();
        } else if (!c10.isEmpty()) {
            C9978a aVar6 = this.f69940N;
            if (aVar6 == null) {
                C17542s.z("binding");
                aVar6 = null;
            }
            Button button3 = aVar6.f75070b;
            C17542s.g(button3);
            button3.setVisibility(0);
            button3.setText(c10.get(0).c());
            String c12 = c10.size() == 2 ? c10.get(1).c() : getString(Oo.b.f84518U0);
            C9978a aVar7 = this.f69940N;
            if (aVar7 == null) {
                C17542s.z("binding");
            } else {
                aVar2 = aVar7;
            }
            Button button4 = aVar2.f75074f;
            C17542s.g(button4);
            button4.setVisibility(0);
            button4.setText(c12);
        }
    }

    private final void K0(ConfigAlert configAlert) {
        String str;
        List<ButtonDetails> b10 = configAlert.b();
        Collection collection = b10;
        String str2 = "";
        if (collection == null || collection.isEmpty() || (str = b10.get(0).c()) == null) {
            str = str2;
        }
        if (b10 != null && b10.size() > 1) {
            str2 = b10.get(1).c();
        }
        C9978a aVar = this.f69940N;
        C9978a aVar2 = null;
        if (aVar == null) {
            C17542s.z("binding");
            aVar = null;
        }
        aVar.f75072d.setText(configAlert.f());
        C9978a aVar3 = this.f69940N;
        if (aVar3 == null) {
            C17542s.z("binding");
            aVar3 = null;
        }
        aVar3.f75071c.setText(configAlert.e());
        int i10 = b.f69946d[configAlert.c().ordinal()];
        if (i10 == 1) {
            if (str.length() > 0 && !G0().isLoggedIn()) {
                C9978a aVar4 = this.f69940N;
                if (aVar4 == null) {
                    C17542s.z("binding");
                } else {
                    aVar2 = aVar4;
                }
                Button button = aVar2.f75070b;
                C17542s.g(button);
                button.setVisibility(0);
                button.setText(str);
            }
            L0(str2);
        } else if (i10 == 2 || i10 == 3) {
            if (str.length() > 0) {
                C9978a aVar5 = this.f69940N;
                if (aVar5 == null) {
                    C17542s.z("binding");
                } else {
                    aVar2 = aVar5;
                }
                Button button2 = aVar2.f75070b;
                C17542s.g(button2);
                button2.setVisibility(0);
                button2.setText(str);
            }
            L0(str2);
        } else {
            throw new t();
        }
        N0(configAlert);
    }

    private final void L0(String str) {
        if (str != null && str.length() != 0) {
            C9978a aVar = this.f69940N;
            if (aVar == null) {
                C17542s.z("binding");
                aVar = null;
            }
            Button button = aVar.f75074f;
            C17542s.g(button);
            button.setVisibility(0);
            button.setText(str);
        }
    }

    private final void M0() {
        startActivity(H0().a(this));
        finish();
    }

    private final void N0(ConfigAlert configAlert) {
        SharedPreferences.Editor edit = G4.b.a(getApplicationContext()).edit();
        edit.putLong("LAST_CONFIG_ALERT_TIME", configAlert.d());
        edit.apply();
    }

    public final Rd.a C0() {
        Rd.a aVar = this.f69938L;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("acountNavigation");
        return null;
    }

    public final e D0() {
        e eVar = this.f69939M;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Eo.a E0() {
        Eo.a aVar = this.f69937K;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final C10253a F0() {
        C10253a aVar = this.f69935I;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killswitchRepository");
        return null;
    }

    public final C13909a G0() {
        C13909a aVar = this.f69936J;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public final pw.a H0() {
        pw.a aVar = this.f69934H;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("splashActivityApi");
        return null;
    }

    public void onBackPressed() {
        if (this.f69941O != a.BLOCKING_MESSAGE) {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        String str;
        C17542s.j(view, "v");
        if (this.f69941O != a.BLOCKING_MESSAGE) {
            I0(view);
            return;
        }
        KillSwitchConfig killSwitchConfig = this.f69942P;
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<BlockingMessageActivity> cls = BlockingMessageActivity.class;
        if (killSwitchConfig == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Button clicked but config is null");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                }
                String str5 = str4;
                bVar.a(eVar, str5, false, illegalStateException, str3);
                str4 = str5;
                str2 = str;
            }
            return;
        }
        String str6 = str2;
        C17542s.g(killSwitchConfig);
        BlockApp b10 = killSwitchConfig.b();
        if (b10 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Reached onClickListener for BlockApp without having a BlockApp");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 != null) {
                        str7 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str8, false, illegalStateException2, str7);
            }
            return;
        }
        BlockApp.BlockAppType b11 = b10.b();
        if (view.getTag() instanceof BlockAppButton.c) {
            int i10 = b.f69943a[b11.getActionButtonType().ordinal()];
            if (i10 == 1) {
                IllegalStateException illegalStateException3 = new IllegalStateException(b11 + " button pressed without having one");
                qv.e eVar3 = qv.e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str9 = null;
                String str10 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str9 == null) {
                        String a12 = C11818a.a((String) null, illegalStateException3);
                        if (a12 == null) {
                            break;
                        }
                        str9 = C11820c.a(a12);
                    }
                    if (str10 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    String str11 = str10;
                    bVar3.a(eVar3, str11, false, illegalStateException3, str9);
                    str10 = str11;
                    View view2 = view;
                }
            } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                List<BlockAppButton> c10 = b10.c();
                if (!c10.isEmpty()) {
                    String a13 = c10.get(0).a();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(a13));
                    startActivity(intent);
                }
            } else {
                throw new t();
            }
        }
        if (view.getTag() instanceof BlockAppButton.b) {
            BlockAppButton.b cancelCloseButtonType = b11.getCancelCloseButtonType();
            qv.e eVar4 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str12 = null;
            String str13 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str12 == null) {
                    String a14 = C11818a.a("Blocking message negative button pressed, type: " + cancelCloseButtonType, (Throwable) null);
                    if (a14 == null) {
                        break;
                    }
                    str12 = C11820c.a(a14);
                }
                if (str13 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str13, false, (Throwable) null, str12);
            }
            int i11 = b.f69944b[cancelCloseButtonType.ordinal()];
            if (i11 == 1) {
                return;
            }
            if (i11 == 2) {
                finishAffinity();
            } else if (i11 == 3) {
                M0();
            } else {
                throw new t();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C9978a c10 = C9978a.c(getLayoutInflater());
        this.f69940N = c10;
        String str2 = null;
        if (c10 == null) {
            C17542s.z("binding");
            c10 = null;
        }
        setContentView((View) c10.getRoot());
        C9978a aVar = this.f69940N;
        if (aVar == null) {
            C17542s.z("binding");
            aVar = null;
        }
        Button button = aVar.f75070b;
        button.setOnClickListener(this);
        button.setTag(BlockAppButton.c.NONE);
        C9978a aVar2 = this.f69940N;
        if (aVar2 == null) {
            C17542s.z("binding");
            aVar2 = null;
        }
        Button button2 = aVar2.f75074f;
        button2.setOnClickListener(this);
        button2.setTag(BlockAppButton.b.NONE);
        KillSwitchConfig value = F0().I().getValue();
        this.f69942P = value;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<BlockingMessageActivity> cls = BlockingMessageActivity.class;
        if (value == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No kill switch available when launching block message activity");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str3;
                }
                String str6 = str5;
                bVar.a(eVar, str6, false, illegalArgumentException, str4);
                str5 = str6;
                eVar = eVar;
                str3 = str;
            }
            finish();
            return;
        }
        String str7 = str3;
        BlockApp b10 = value.b();
        ConfigAlert a11 = value.a();
        if (b10 != null) {
            this.f69941O = a.BLOCKING_MESSAGE;
            J0(b10);
        } else if (a11 != null) {
            this.f69941O = a.CONFIG_ALERT;
            K0(a11);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unknown mode for BlockingMessageActivity");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 == null) {
                        break;
                    }
                    str8 = C11820c.a(a12);
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str9, false, illegalStateException, str8);
            }
        }
        qv.e eVar3 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str10 = null;
        String str11 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str10 == null) {
                String a13 = C11818a.a("Current mode: " + this.f69941O, (Throwable) null);
                if (a13 != null) {
                    str10 = C11820c.a(a13);
                } else {
                    return;
                }
            }
            if (str11 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', str2, 2, str2), '.', str2, 2, str2);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name3;
            }
            bVar3.a(eVar3, str11, false, (Throwable) null, str10);
            str2 = null;
        }
    }
}
