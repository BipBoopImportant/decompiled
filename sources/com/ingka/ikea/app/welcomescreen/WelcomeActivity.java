package com.ingka.ikea.app.welcomescreen;

import Ae.e;
import Ae.p;
import Gl.b;
import HJ.C15854t;
import Iz.C13044j;
import Ma.C9140b;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.google.android.gms.security.ProviderInstaller;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.inappfeedback.AppFeedbackFlowActivity;
import com.ingka.ikea.app.s;
import com.ingka.ikea.killswitch.model.BlockApp;
import com.ingka.ikea.killswitch.model.ConfigAlert;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import com.ingka.ikea.navigation.interop.IkeaComposableNavHostFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import gp.C11343b;
import jC.C14614a;
import jC.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.C9979b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import oC.C14874c;
import pu.C11777a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;
import up.C12074d;
import x4.C8951o;
import x4.v;
import x4.x;
import yz.C15324a;

@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u00012\u00020\u0002:\u0002\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0019\u0010\u001b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\nH\u0015¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J!\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b)\u0010\tJ\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0001\u001a\u00020}8\u0006@\u0006X.¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¤\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030­\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010¼\u0001\u001a\u00030µ\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010Ä\u0001\u001a\u00030½\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010Ì\u0001\u001a\u00030Å\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u001a\u0010Ð\u0001\u001a\u00030Í\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R!\u0010Ö\u0001\u001a\u00030Ñ\u00018BX\u0002¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001f\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ø\u00010×\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R%\u0010à\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020*0Ý\u00010Ü\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001e\u0010æ\u0001\u001a\u00020*8\u0014XD¢\u0006\u000f\n\u0006\bå\u0001\u0010®\u0001\u001a\u0005\b¾\u0001\u0010,R\u001e\u0010è\u0001\u001a\u00020*8\u0014XD¢\u0006\u000f\n\u0006\bç\u0001\u0010®\u0001\u001a\u0005\b¶\u0001\u0010,R\u001e\u0010ë\u0001\u001a\u00020*8\u0014XD¢\u0006\u000f\n\u0006\bé\u0001\u0010®\u0001\u001a\u0005\bê\u0001\u0010,R\u001e\u0010í\u0001\u001a\u00020*8\u0014XD¢\u0006\u000f\n\u0006\bì\u0001\u0010®\u0001\u001a\u0005\bÆ\u0001\u0010,R*\u0010õ\u0001\u001a\u00030î\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R1\u0010þ\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ö\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R!\u0010\u0002\u001a\u00030ÿ\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010Ó\u0001\u001a\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R#\u0010\u0002\u001a\u0005\u0018\u00010\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010Ó\u0001\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0002\u001a\u00030\u00028\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/welcomescreen/WelcomeActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "Lcom/google/android/gms/security/ProviderInstaller$a;", "<init>", "()V", "Landroid/content/Intent;", "intent", "LXH/N;", "t1", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "C1", "(Landroid/os/Bundle;)V", "y1", "Lx4/o;", "navController", "s1", "(Lx4/o;)V", "B1", "A1", "x1", "u1", "w1", "v1", "P0", "z1", "onCreate", "outState", "onSaveInstanceState", "onResume", "onPause", "onStart", "onStop", "onDestroy", "d0", "", "errorCode", "recoveryIntent", "m0", "(ILandroid/content/Intent;)V", "onNewIntent", "", "onSupportNavigateUp", "()Z", "Lpw/b;", "H", "Lpw/b;", "W0", "()Lpw/b;", "setBlockMessageApi", "(Lpw/b;)V", "blockMessageApi", "Ltf/a;", "I", "Ltf/a;", "d1", "()Ltf/a;", "setKillSwitchRepository", "(Ltf/a;)V", "killSwitchRepository", "LaA/a;", "J", "LaA/a;", "n1", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LRd/a;", "K", "LRd/a;", "T0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "Lpw/a;", "L", "Lpw/a;", "c1", "()Lpw/a;", "setFirstEntryApi", "(Lpw/a;)V", "firstEntryApi", "LEo/a;", "M", "LEo/a;", "Z0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "Liw/a;", "N", "Liw/a;", "e1", "()Liw/a;", "setMainActivityMessageIntegration", "(Liw/a;)V", "mainActivityMessageIntegration", "LAe/e;", "O", "LAe/e;", "U0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LNd/c;", "P", "LNd/c;", "S0", "()LNd/c;", "setAbTesting", "(LNd/c;)V", "abTesting", "LGz/a;", "Q", "LGz/a;", "k1", "()LGz/a;", "setScanAndGoPurchaseFeedbackIntegration", "(LGz/a;)V", "scanAndGoPurchaseFeedbackIntegration", "LIz/j;", "R", "LIz/j;", "j1", "()LIz/j;", "setPostPurchaseFeedbackNavigation", "(LIz/j;)V", "postPurchaseFeedbackNavigation", "LAr/j;", "S", "LAr/j;", "getFeedback", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LSe/m;", "T", "LSe/m;", "l1", "()LSe/m;", "setScreenTrackerDestinationListener$IKEA_release", "(LSe/m;)V", "screenTrackerDestinationListener", "LGl/j;", "U", "LGl/j;", "Y0", "()LGl/j;", "setBottomNavigationViewVisibilityHandler", "(LGl/j;)V", "bottomNavigationViewVisibilityHandler", "Lup/d;", "X", "Lup/d;", "p1", "()Lup/d;", "setUserConsentRepository", "(Lup/d;)V", "userConsentRepository", "Lpu/a;", "Y", "Lpu/a;", "b1", "()Lpu/a;", "setEnableStoreModeWhenNearbyStoreIntegration", "(Lpu/a;)V", "enableStoreModeWhenNearbyStoreIntegration", "LoC/c;", "Z", "LoC/c;", "o1", "()LoC/c;", "setTaskSchedulerEvents$IKEA_release", "(LoC/c;)V", "taskSchedulerEvents", "Lpw/d;", "y0", "Lpw/d;", "q1", "()Lpw/d;", "setWelcomeActivityNavGraphProvider$IKEA_release", "(Lpw/d;)V", "welcomeActivityNavGraphProvider", "LQp/b;", "z0", "LQp/b;", "a1", "()LQp/b;", "setDetectScreenshotTracker$IKEA_release", "(LQp/b;)V", "detectScreenshotTracker", "Low/g;", "A0", "Low/g;", "m1", "()Low/g;", "setScrollableDestinationIntegration$IKEA_release", "(Low/g;)V", "scrollableDestinationIntegration", "Lkg/b;", "B0", "Lkg/b;", "activityBinding", "Ljw/l;", "C0", "LXH/o;", "f1", "()Ljw/l;", "messageViewModel", "Lg/c;", "Lcom/ingka/ikea/app/inappfeedback/AppFeedbackFlowActivity$b;", "D0", "Lg/c;", "appFeedBackLauncher", "Landroidx/lifecycle/L;", "Lip/d;", "E0", "Landroidx/lifecycle/L;", "showAppRatingObserver", "LMa/b;", "F0", "LMa/b;", "logoutDialog", "G0", "drawUnderStatusBar", "H0", "drawUnderNavigationBar", "I0", "x0", "drawUnderDisplayCutout", "J0", "handleImeInsets", "Lhh/d;", "K0", "Lhh/d;", "V0", "()Lhh/d;", "setAppDestinationBuilder", "(Lhh/d;)V", "appDestinationBuilder", "", "Low/f;", "L0", "Ljava/util/Set;", "i1", "()Ljava/util/Set;", "setNavigationTabItems", "(Ljava/util/Set;)V", "navigationTabItems", "LGl/d;", "M0", "X0", "()LGl/d;", "bottomNavigationViewModel", "LAe/p;", "N0", "LAe/p;", "updateRoot", "Lcom/ingka/ikea/navigation/interop/IkeaComposableNavHostFragment;", "O0", "r1", "()Lcom/ingka/ikea/navigation/interop/IkeaComposableNavHostFragment;", "_navHostFragment", "Lx4/o;", "_navController", "h1", "navHostFragment", "g1", "()Lx4/o;", "Q0", "a", "LGl/c;", "uiState", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeActivity extends Hilt_WelcomeActivity implements ProviderInstaller.a {

    /* renamed from: Q0  reason: collision with root package name */
    private static final a f92765Q0 = new a((DefaultConstructorMarker) null);

    /* renamed from: R0  reason: collision with root package name */
    public static final int f92766R0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    public ow.g f92767A0;
    /* access modifiers changed from: private */

    /* renamed from: B0  reason: collision with root package name */
    public C9979b f92768B0;

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f92769C0 = new h0(P.b(jw.l.class), new j(this), new i(this), new k((C17631a) null, this));

    /* renamed from: D0  reason: collision with root package name */
    private final C5314c<AppFeedbackFlowActivity.b> f92770D0;

    /* renamed from: E0  reason: collision with root package name */
    private final L<ip.d<Boolean>> f92771E0;

    /* renamed from: F0  reason: collision with root package name */
    private C9140b f92772F0;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f92773G0;

    /* renamed from: H  reason: collision with root package name */
    public pw.b f92774H;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f92775H0;

    /* renamed from: I  reason: collision with root package name */
    public C10253a f92776I;

    /* renamed from: I0  reason: collision with root package name */
    private final boolean f92777I0;

    /* renamed from: J  reason: collision with root package name */
    public C13909a f92778J;

    /* renamed from: J0  reason: collision with root package name */
    private final boolean f92779J0;

    /* renamed from: K  reason: collision with root package name */
    public Rd.a f92780K;

    /* renamed from: K0  reason: collision with root package name */
    public hh.d f92781K0;

    /* renamed from: L  reason: collision with root package name */
    public pw.a f92782L;

    /* renamed from: L0  reason: collision with root package name */
    public Set<ow.f> f92783L0;

    /* renamed from: M  reason: collision with root package name */
    public Eo.a f92784M;

    /* renamed from: M0  reason: collision with root package name */
    private final C16824o f92785M0;

    /* renamed from: N  reason: collision with root package name */
    public iw.a f92786N;

    /* renamed from: N0  reason: collision with root package name */
    private p f92787N0;

    /* renamed from: O  reason: collision with root package name */
    public Ae.e f92788O;

    /* renamed from: O0  reason: collision with root package name */
    private final C16824o f92789O0;

    /* renamed from: P  reason: collision with root package name */
    public Nd.c f92790P;

    /* renamed from: P0  reason: collision with root package name */
    private C8951o f92791P0;

    /* renamed from: Q  reason: collision with root package name */
    public Gz.a f92792Q;

    /* renamed from: R  reason: collision with root package name */
    public C13044j f92793R;

    /* renamed from: S  reason: collision with root package name */
    public Ar.j f92794S;

    /* renamed from: T  reason: collision with root package name */
    public Se.m f92795T;

    /* renamed from: U  reason: collision with root package name */
    public Gl.j f92796U;

    /* renamed from: X  reason: collision with root package name */
    public C12074d f92797X;

    /* renamed from: Y  reason: collision with root package name */
    public C11777a f92798Y;

    /* renamed from: Z  reason: collision with root package name */
    public C14874c f92799Z;

    /* renamed from: y0  reason: collision with root package name */
    public pw.d f92800y0;

    /* renamed from: z0  reason: collision with root package name */
    public Qp.b f92801z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/welcomescreen/WelcomeActivity$a;", "", "<init>", "()V", "", "START_TAB_OVERRIDE_KEY", "Ljava/lang/String;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$handleBottomNavBarVisibility$1", f = "WelcomeActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92802c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f92803d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WelcomeActivity welcomeActivity, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f92804e = welcomeActivity;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(q qVar) {
            qVar.g(new m());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C14614a s(C14614a aVar) {
            return C14614a.b(aVar, false, false, false, false, 13, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final C16807N t(q qVar) {
            qVar.g(new l());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C14614a v(C14614a aVar) {
            return C14614a.b(aVar, false, true, false, false, 13, (Object) null);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f92804e, eVar);
            bVar.f92803d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92802c == 0) {
                y.b(obj);
                boolean z10 = this.f92803d;
                C9979b K02 = this.f92804e.f92768B0;
                if (K02 == null) {
                    C17542s.z("activityBinding");
                    K02 = null;
                }
                ComposeView composeView = K02.f75076b;
                C17542s.i(composeView, "bottomNavigation");
                composeView.setVisibility(z10 ? 0 : 8);
                if (z10) {
                    this.f92804e.b(new j());
                } else {
                    this.f92804e.b(new k());
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object n(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$handleScanAndGoPostPurchaseFeedback$1", f = "WelcomeActivity.kt", l = {523}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92805c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92806d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$handleScanAndGoPostPurchaseFeedback$1$1", f = "WelcomeActivity.kt", l = {525}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92807c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92808d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.welcomescreen.WelcomeActivity$c$a$a  reason: collision with other inner class name */
            static final class C2064a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ WelcomeActivity f92809a;

                C2064a(WelcomeActivity welcomeActivity) {
                    this.f92809a = welcomeActivity;
                }

                /* renamed from: c */
                public final Object emit(C15324a aVar, C17164e<? super C16807N> eVar) {
                    if (!C17542s.e(aVar, C15324a.C3270a.f132353a)) {
                        if (aVar instanceof C15324a.b) {
                            C13044j j12 = this.f92809a.j1();
                            WelcomeActivity welcomeActivity = this.f92809a;
                            FragmentManager supportFragmentManager = welcomeActivity.getSupportFragmentManager();
                            C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
                            j12.a(welcomeActivity, supportFragmentManager, this.f92809a, ((C15324a.b) aVar).a());
                        } else {
                            throw new t();
                        }
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(WelcomeActivity welcomeActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92808d = welcomeActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92808d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f92807c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<C15324a> a10 = this.f92808d.k1().a();
                    C2064a aVar = new C2064a(this.f92808d);
                    this.f92807c = 1;
                    if (a10.collect(aVar, this) == f10) {
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
        c(WelcomeActivity welcomeActivity, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f92806d = welcomeActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f92806d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92805c;
            if (i10 == 0) {
                y.b(obj);
                WelcomeActivity welcomeActivity = this.f92806d;
                r.b bVar = r.b.RESUMED;
                a aVar = new a(welcomeActivity, (C17164e<? super a>) null);
                this.f92805c = 1;
                if (androidx.lifecycle.Q.b(welcomeActivity, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$initializeScreenshotTracking$1", f = "WelcomeActivity.kt", l = {548}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92810c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92811d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(WelcomeActivity welcomeActivity, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f92811d = welcomeActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f92811d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92810c;
            if (i10 == 0) {
                y.b(obj);
                Qp.b a12 = this.f92811d.a1();
                C8951o M02 = this.f92811d.g1();
                this.f92810c = 1;
                if (a12.a(M02, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$observeData$1", f = "WelcomeActivity.kt", l = {491}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92813d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$observeData$1$1", f = "WelcomeActivity.kt", l = {492}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92814c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92815d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.welcomescreen.WelcomeActivity$e$a$a  reason: collision with other inner class name */
            static final class C2065a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ WelcomeActivity f92816a;

                C2065a(WelcomeActivity welcomeActivity) {
                    this.f92816a = welcomeActivity;
                }

                public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                    this.f92816a.P0();
                    return C16807N.f139792a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                    return c(((Boolean) obj).booleanValue(), eVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(WelcomeActivity welcomeActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92815d = welcomeActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92815d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f92814c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<Boolean> k10 = this.f92815d.n1().k();
                    C2065a aVar = new C2065a(this.f92815d);
                    this.f92814c = 1;
                    if (k10.collect(aVar, this) == f10) {
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
        e(WelcomeActivity welcomeActivity, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f92813d = welcomeActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f92813d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92812c;
            if (i10 == 0) {
                y.b(obj);
                WelcomeActivity welcomeActivity = this.f92813d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(welcomeActivity, (C17164e<? super a>) null);
                this.f92812c = 1;
                if (androidx.lifecycle.Q.b(welcomeActivity, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$observeData$2", f = "WelcomeActivity.kt", l = {499}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92818d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$observeData$2$1", f = "WelcomeActivity.kt", l = {500}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92819c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f92820d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92821e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.welcomescreen.WelcomeActivity$f$a$a  reason: collision with other inner class name */
            static final class C2066a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ WelcomeActivity f92822a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Q f92823b;

                C2066a(WelcomeActivity welcomeActivity, Q q10) {
                    this.f92822a = welcomeActivity;
                    this.f92823b = q10;
                }

                /* renamed from: c */
                public final Object emit(KillSwitchConfig killSwitchConfig, C17164e<? super C16807N> eVar) {
                    ConfigAlert configAlert = null;
                    if (this.f92822a.d1().H()) {
                        El.a aVar = El.a.f80720a;
                        WelcomeActivity welcomeActivity = this.f92822a;
                        pw.b W02 = welcomeActivity.W0();
                        BlockApp b10 = killSwitchConfig != null ? killSwitchConfig.b() : null;
                        if (killSwitchConfig != null) {
                            configAlert = killSwitchConfig.a();
                        }
                        aVar.a(welcomeActivity, W02, b10, configAlert, this.f92822a.p1().d());
                    } else {
                        Q q10 = this.f92823b;
                        qv.e eVar2 = qv.e.WARN;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar2, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar : arrayList) {
                            if (str == null) {
                                String a10 = C11818a.a("isConfigFetchedFromSettings: false", (Throwable) null);
                                if (a10 == null) {
                                    break;
                                }
                                str = C11820c.a(a10);
                            }
                            String str3 = str;
                            if (str2 == null) {
                                String name = q10.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str4 = str2;
                            bVar.a(eVar2, str4, false, (Throwable) null, str3);
                            str = str3;
                            str2 = str4;
                        }
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(WelcomeActivity welcomeActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92821e = welcomeActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f92821e, eVar);
                aVar.f92820d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f92819c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f92820d;
                    C16519P<KillSwitchConfig> I10 = this.f92821e.d1().I();
                    C2066a aVar = new C2066a(this.f92821e, q10);
                    this.f92820d = q10;
                    this.f92819c = 1;
                    if (I10.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Q q11 = (Q) this.f92820d;
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(WelcomeActivity welcomeActivity, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f92818d = welcomeActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f92818d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92817c;
            if (i10 == 0) {
                y.b(obj);
                WelcomeActivity welcomeActivity = this.f92818d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(welcomeActivity, (C17164e<? super a>) null);
                this.f92817c = 1;
                if (androidx.lifecycle.Q.b(welcomeActivity, bVar, aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92824a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$setupBottomNavigationView$1$1$1", f = "WelcomeActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92825c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ View f92826d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92827e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ A1<Gl.c> f92828f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.welcomescreen.WelcomeActivity$g$a$a  reason: collision with other inner class name */
            static final class C2067a implements C17642l<ow.f, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ WelcomeActivity f92829a;

                C2067a(WelcomeActivity welcomeActivity) {
                    this.f92829a = welcomeActivity;
                }

                public final void a(ow.f fVar) {
                    C17542s.j(fVar, "tab");
                    this.f92829a.X0().h(new b.a(fVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((ow.f) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, WelcomeActivity welcomeActivity, A1<Gl.c> a12, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92826d = view;
                this.f92827e = welcomeActivity;
                this.f92828f = a12;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92826d, this.f92827e, this.f92828f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f92825c == 0) {
                    y.b(obj);
                    a.b(this.f92826d, this.f92827e.g1(), C16877v.y1(g.c(this.f92828f).e()), new C2067a(this.f92827e));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements C17642l<ow.f, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92830a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A1<Gl.c> f92831b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
                a(Object obj) {
                    super(0, obj, WelcomeActivity.class, "scrollToTop", "scrollToTop()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((WelcomeActivity) this.receiver).A1();
                }
            }

            b(WelcomeActivity welcomeActivity, A1<Gl.c> a12) {
                this.f92830a = welcomeActivity;
                this.f92831b = a12;
            }

            public final void a(ow.f fVar) {
                C17542s.j(fVar, "tab");
                if (g.c(this.f92831b).g(fVar)) {
                    a.g(this.f92830a.g1(), g.c(this.f92831b).c(), g.c(this.f92831b).f(), this.f92830a.m1(), new a(this.f92830a));
                } else {
                    a.h(this.f92830a.g1(), fVar);
                }
                this.f92830a.X0().h(new b.a(fVar));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ow.f) obj);
                return C16807N.f139792a;
            }
        }

        g(WelcomeActivity welcomeActivity) {
            this.f92824a = welcomeActivity;
        }

        /* access modifiers changed from: private */
        public static final Gl.c c(A1<Gl.c> a12) {
            return a12.getValue();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r14, int r15) {
            /*
                r13 = this;
                r0 = r15 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r14.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r14.L()
                goto L_0x00cf
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.welcomescreen.WelcomeActivity.setupBottomNavigationView.<anonymous> (WelcomeActivity.kt:430)"
                r2 = 1315208397(0x4e647ccd, float:9.5834605E8)
                U0.C4895p.S(r2, r15, r0, r1)
            L_0x0020:
                com.ingka.ikea.app.welcomescreen.WelcomeActivity r15 = r13.f92824a
                Gl.d r15 = r15.X0()
                TJ.P r0 = r15.m()
                r5 = 0
                r6 = 7
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = r14
                U0.A1 r15 = j3.a.c(r0, r1, r2, r3, r4, r5, r6)
                U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
                java.lang.Object r0 = r14.Q(r0)
                android.view.View r0 = (android.view.View) r0
                XH.N r1 = XH.C16807N.f139792a
                r2 = -193511110(0xfffffffff477413a, float:-7.835817E31)
                r14.W(r2)
                boolean r2 = r14.F(r0)
                com.ingka.ikea.app.welcomescreen.WelcomeActivity r3 = r13.f92824a
                boolean r3 = r14.F(r3)
                r2 = r2 | r3
                boolean r3 = r14.V(r15)
                r2 = r2 | r3
                com.ingka.ikea.app.welcomescreen.WelcomeActivity r3 = r13.f92824a
                java.lang.Object r4 = r14.D()
                r5 = 0
                if (r2 != 0) goto L_0x0067
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x006f
            L_0x0067:
                com.ingka.ikea.app.welcomescreen.WelcomeActivity$g$a r4 = new com.ingka.ikea.app.welcomescreen.WelcomeActivity$g$a
                r4.<init>(r0, r3, r15, r5)
                r14.u(r4)
            L_0x006f:
                nI.p r4 = (nI.p) r4
                r14.P()
                r0 = 6
                U0.P.g(r1, r4, r14, r0)
                Gl.c r0 = c(r15)
                KJ.c r6 = r0.e()
                Gl.c r0 = c(r15)
                int r7 = r0.d()
                androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                r1 = 0
                r2 = 1
                androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r0, r1, r2, r5)
                r0 = -193493253(0xfffffffff47786fb, float:-7.844452E31)
                r14.W(r0)
                boolean r0 = r14.V(r15)
                com.ingka.ikea.app.welcomescreen.WelcomeActivity r1 = r13.f92824a
                boolean r1 = r14.F(r1)
                r0 = r0 | r1
                com.ingka.ikea.app.welcomescreen.WelcomeActivity r1 = r13.f92824a
                java.lang.Object r2 = r14.D()
                if (r0 != 0) goto L_0x00b1
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x00b9
            L_0x00b1:
                com.ingka.ikea.app.welcomescreen.WelcomeActivity$g$b r2 = new com.ingka.ikea.app.welcomescreen.WelcomeActivity$g$b
                r2.<init>(r1, r15)
                r14.u(r2)
            L_0x00b9:
                r9 = r2
                nI.l r9 = (nI.C17642l) r9
                r14.P()
                r11 = 384(0x180, float:5.38E-43)
                r12 = 0
                r10 = r14
                en.C11253d.c(r6, r7, r8, r9, r10, r11, r12)
                boolean r14 = U0.C4895p.J()
                if (r14 == 0) goto L_0x00cf
                U0.C4895p.R()
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.welcomescreen.WelcomeActivity.g.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.WelcomeActivity$setupNavigation$1", f = "WelcomeActivity.kt", l = {361}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92832c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f92833d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WelcomeActivity f92834e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements C17642l<ow.f, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f92835a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ WelcomeActivity f92836b;

            a(Q q10, WelcomeActivity welcomeActivity) {
                this.f92835a = q10;
                this.f92836b = welcomeActivity;
            }

            public final void a(ow.f fVar) {
                if (fVar != null) {
                    Q q10 = this.f92835a;
                    WelcomeActivity welcomeActivity = this.f92836b;
                    p.a aVar = p.Companion;
                    p a10 = n.c(aVar, fVar.a());
                    Object c10 = fVar.c();
                    if (c10 != null) {
                        a10 = n.d(aVar, P.b(c10.getClass()));
                    }
                    qv.e eVar = qv.e.DEBUG;
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
                            String a11 = C11818a.a("Tab changed to " + a10 + ". Updating analytics root property.", (Throwable) null);
                            if (a11 == null) {
                                break;
                            }
                            str = C11820c.a(a11);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = q10.getClass().getName();
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
                    welcomeActivity.U0().p(a10);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ow.f) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(WelcomeActivity welcomeActivity, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f92834e = welcomeActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f92834e, eVar);
            hVar.f92833d = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92832c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f92833d;
                C8951o M02 = this.f92834e.g1();
                Set<ow.f> i12 = this.f92834e.i1();
                a aVar = new a(q10, this.f92834e);
                this.f92833d = q10;
                this.f92832c = 1;
                if (a.a(M02, i12, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f92833d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92837c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(androidx.activity.j jVar) {
            super(0);
            this.f92837c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f92837c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92838c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(androidx.activity.j jVar) {
            super(0);
            this.f92838c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f92838c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92839c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f92839c = aVar;
            this.f92840d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f92839c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f92840d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.welcomescreen.WelcomeActivity.k.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92841c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(androidx.activity.j jVar) {
            super(0);
            this.f92841c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f92841c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92842c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(androidx.activity.j jVar) {
            super(0);
            this.f92842c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f92842c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f92844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f92843c = aVar;
            this.f92844d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f92843c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f92844d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.welcomescreen.WelcomeActivity.n.invoke():l3.a");
        }
    }

    public WelcomeActivity() {
        C17542s.h(this, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        this.f92770D0 = registerForActivityResult(new AppFeedbackFlowActivity.a.C1233a(), new c());
        this.f92771E0 = new d(this);
        this.f92773G0 = true;
        this.f92775H0 = true;
        this.f92777I0 = true;
        this.f92779J0 = true;
        this.f92785M0 = new h0(P.b(Gl.d.class), new m(this), new l(this), new n((C17631a) null, this));
        this.f92789O0 = C16825p.b(new e(this));
    }

    /* access modifiers changed from: private */
    public final void A1() {
        m1().a();
        List<C5187o> G02 = h1().getChildFragmentManager().G0();
        C17542s.i(G02, "getFragments(...)");
        C5187o oVar = (C5187o) C16877v.K0(G02);
        com.ingka.ikea.core.android.fragments.j jVar = oVar instanceof com.ingka.ikea.core.android.fragments.j ? (com.ingka.ikea.core.android.fragments.j) oVar : null;
        if (jVar != null) {
            if (!jVar.Y()) {
                jVar.l0();
            } else {
                jVar.d0();
            }
            C16807N n10 = C16807N.f139792a;
        }
    }

    private final void B1() {
        C9979b bVar = this.f92768B0;
        if (bVar == null) {
            C17542s.z("activityBinding");
            bVar = null;
        }
        ComposeView composeView = bVar.f75076b;
        C17542s.i(composeView, "bottomNavigation");
        TC.e.l(composeView, false, c1.c.c(1315208397, true, new g(this)), 1, (Object) null);
    }

    private final void C1(Bundle bundle) {
        Intent intent = getIntent();
        setIntent(new Intent());
        this.f92791P0 = h1().o0();
        x4.y yVar = new x4.y(g1().O(), "browse", (String) null);
        V0().a(yVar);
        x j10 = yVar.c();
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
        s1(g1());
        g1().r(new f(this));
        g1().F0(j10, getIntent().getExtras());
        q1().a(g1().L());
        if (bundle != null) {
            g1().z0(bundle);
        }
        B1();
        setIntent(intent);
    }

    /* access modifiers changed from: private */
    public static final void D1(WelcomeActivity welcomeActivity, C8951o oVar, v vVar, Bundle bundle) {
        C17542s.j(oVar, "navController");
        C17542s.j(vVar, "destination");
        welcomeActivity.l1().a(oVar, vVar, welcomeActivity, bundle);
    }

    /* access modifiers changed from: private */
    public static final void E1(WelcomeActivity welcomeActivity, ip.d dVar) {
        C17542s.j(dVar, "showRatingEvent");
        dVar.a(new i(welcomeActivity));
    }

    /* access modifiers changed from: private */
    public static final C16807N F1(WelcomeActivity welcomeActivity, ip.d dVar, boolean z10) {
        C17542s.j(dVar, "$this$handle");
        welcomeActivity.f92770D0.a(AppFeedbackFlowActivity.b.AUTOMATIC);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final IkeaComposableNavHostFragment I0(WelcomeActivity welcomeActivity) {
        return (IkeaComposableNavHostFragment) welcomeActivity.getSupportFragmentManager().p0(s.f72312h);
    }

    /* access modifiers changed from: private */
    public static final void O0(boolean z10) {
    }

    /* access modifiers changed from: private */
    public final void P0() {
        if (this.f92772F0 == null) {
            C9140b bVar = new C9140b(this);
            bVar.setTitle(getString(Oo.b.f84598b9));
            bVar.f(getString(Oo.b.f84587a9));
            bVar.l(getString(Oo.b.f84447N), new g(this));
            bVar.g(getString(Oo.b.f84518U0), (DialogInterface.OnClickListener) null);
            bVar.D(new h(this));
            bVar.p();
            this.f92772F0 = bVar;
        }
    }

    /* access modifiers changed from: private */
    public static final void Q0(WelcomeActivity welcomeActivity, DialogInterface dialogInterface, int i10) {
        e.c.b(welcomeActivity.U0(), Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        welcomeActivity.T0().d(welcomeActivity);
    }

    /* access modifiers changed from: private */
    public static final void R0(WelcomeActivity welcomeActivity, DialogInterface dialogInterface) {
        welcomeActivity.f92772F0 = null;
    }

    /* access modifiers changed from: private */
    public final Gl.d X0() {
        return (Gl.d) this.f92785M0.getValue();
    }

    private final jw.l f1() {
        return (jw.l) this.f92769C0.getValue();
    }

    /* access modifiers changed from: private */
    public final C8951o g1() {
        C8951o oVar = this.f92791P0;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final IkeaComposableNavHostFragment h1() {
        IkeaComposableNavHostFragment r12 = r1();
        if (r12 != null) {
            return r12;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final IkeaComposableNavHostFragment r1() {
        return (IkeaComposableNavHostFragment) this.f92789O0.getValue();
    }

    private final void s1(C8951o oVar) {
        C16534i.M(C16534i.R(Y0().g(oVar), new b(this, (C17164e<? super b>) null)), C5222z.a(this));
    }

    private final void t1(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.toString();
            C17542s.i(uri, "toString(...)");
            if (uri.length() <= 0) {
                return;
            }
            if (g1().L().D(data)) {
                rw.g.d(data, "deeplink received, navigating to");
                g1().Y(data, a.e(g1()));
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Deeplink not supported: " + data);
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = WelcomeActivity.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    private final void u1() {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    private final void v1() {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
    }

    private final void w1() {
        b1().a(this);
    }

    private final void x1() {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    private final void y1() {
        Bundle extras = getIntent().getExtras();
        p pVar = null;
        Object serializable = extras != null ? extras.getSerializable("updateRoot") : null;
        if (serializable instanceof p) {
            pVar = (p) serializable;
        }
        if (pVar == null) {
            pVar = p.DEEPLINK;
        }
        this.f92787N0 = pVar;
        if (pVar != null) {
            U0().p(pVar);
        }
    }

    private final void z1() {
        if (getIntent().getData() != null) {
            y1();
        }
        Intent intent = getIntent();
        C17542s.i(intent, "getIntent(...)");
        t1(intent);
        S0().e("retention", 1);
    }

    /* access modifiers changed from: protected */
    public boolean A0() {
        return this.f92779J0;
    }

    public final Nd.c S0() {
        Nd.c cVar = this.f92790P;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("abTesting");
        return null;
    }

    public final Rd.a T0() {
        Rd.a aVar = this.f92780K;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final Ae.e U0() {
        Ae.e eVar = this.f92788O;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final hh.d V0() {
        hh.d dVar = this.f92781K0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("appDestinationBuilder");
        return null;
    }

    public final pw.b W0() {
        pw.b bVar = this.f92774H;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("blockMessageApi");
        return null;
    }

    public final Gl.j Y0() {
        Gl.j jVar = this.f92796U;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("bottomNavigationViewVisibilityHandler");
        return null;
    }

    public final Eo.a Z0() {
        Eo.a aVar = this.f92784M;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final Qp.b a1() {
        Qp.b bVar = this.f92801z0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("detectScreenshotTracker");
        return null;
    }

    public final C11777a b1() {
        C11777a aVar = this.f92798Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enableStoreModeWhenNearbyStoreIntegration");
        return null;
    }

    public final pw.a c1() {
        pw.a aVar = this.f92782L;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("firstEntryApi");
        return null;
    }

    public void d0() {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Provider is up-to-date, app can make secure network calls.", (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = WelcomeActivity.class.getName();
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
    }

    public final C10253a d1() {
        C10253a aVar = this.f92776I;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killSwitchRepository");
        return null;
    }

    public final iw.a e1() {
        iw.a aVar = this.f92786N;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("mainActivityMessageIntegration");
        return null;
    }

    public final Set<ow.f> i1() {
        Set<ow.f> set = this.f92783L0;
        if (set != null) {
            return set;
        }
        C17542s.z("navigationTabItems");
        return null;
    }

    public final C13044j j1() {
        C13044j jVar = this.f92793R;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("postPurchaseFeedbackNavigation");
        return null;
    }

    public final Gz.a k1() {
        Gz.a aVar = this.f92792Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("scanAndGoPurchaseFeedbackIntegration");
        return null;
    }

    public final Se.m l1() {
        Se.m mVar = this.f92795T;
        if (mVar != null) {
            return mVar;
        }
        C17542s.z("screenTrackerDestinationListener");
        return null;
    }

    public void m0(int i10, Intent intent) {
        String str;
        char c10;
        Class<WelcomeActivity> cls;
        int i11;
        int i12 = i10;
        qv.e eVar = qv.e.WARN;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = WelcomeActivity.class;
            i11 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Provider update failed with code: " + i12, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        com.google.android.gms.common.a n10 = com.google.android.gms.common.a.n();
        C17542s.i(n10, "getInstance(...)");
        if (n10.j(i12)) {
            com.google.android.gms.common.a.n().p(this, i12);
            return;
        }
        qv.e eVar2 = qv.e.WARN;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str6 == null) {
                String a11 = C11818a.a("Update Security Provider, Google Play Services not available.", (Throwable) null);
                if (a11 != null) {
                    str6 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str7 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, i11, (Object) null), '.', (String) null, i11, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str7, false, (Throwable) null, str6);
            i11 = 2;
            c10 = '$';
        }
    }

    public final ow.g m1() {
        ow.g gVar = this.f92767A0;
        if (gVar != null) {
            return gVar;
        }
        C17542s.z("scrollableDestinationIntegration");
        return null;
    }

    public final C13909a n1() {
        C13909a aVar = this.f92778J;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public final C14874c o1() {
        C14874c cVar = this.f92799Z;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("taskSchedulerEvents");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        char c10;
        Class<WelcomeActivity> cls;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        C9979b bVar = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = WelcomeActivity.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar2 = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("onCreate, savedInstanceState: " + bundle2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar2.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C9979b c11 = C9979b.c(getLayoutInflater());
        this.f92768B0 = c11;
        if (c11 == null) {
            C17542s.z("activityBinding");
            c11 = null;
        }
        setContentView((View) c11.getRoot());
        if ((!v0().h()) || (!p1().d())) {
            IllegalStateException illegalStateException = new IllegalStateException(C15854t.o("Onboarding not complete! \n                |appConfig = " + v0().h() + " \n                |hasConsent = " + p1().d() + " \n                    ", (String) null, 1, (Object) null));
            qv.e eVar2 = qv.e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar3 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar3.a(eVar2, str7, false, illegalStateException, str6);
                c10 = '$';
            }
            Intent a12 = c1().a(this);
            a12.setFlags(268468224);
            startActivity(a12);
            finishAndRemoveTask();
            return;
        }
        if (bundle2 == null) {
            C14874c.a.a(o1(), C11343b.a.APP_READY, (Object) null, 2, (Object) null);
        }
        C1(bundle);
        ProviderInstaller.b(this, this);
        x1();
        iw.a e12 = e1();
        C9979b bVar4 = this.f92768B0;
        if (bVar4 == null) {
            C17542s.z("activityBinding");
        } else {
            bVar = bVar4;
        }
        ComposeView composeView = bVar.f75077c;
        C17542s.i(composeView, "messageView");
        e12.a(this, g1(), composeView, f1());
        if (bundle2 == null) {
            z1();
        }
        u1();
        w1();
        v1();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f92772F0 = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            rw.g.d(data, "onNewIntent, data");
            y1();
        } else {
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("onNewIntent, no data", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = WelcomeActivity.class.getName();
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
        }
        t1(intent);
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        Bg.a.f58907a.a().removeObserver(this.f92771E0);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Bg.a.f58907a.a().observe(this, this.f92771E0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onSaveInstanceState(Bundle bundle) {
        Bundle B02;
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C8951o oVar = this.f92791P0;
        if (oVar != null && (B02 = oVar.B0()) != null) {
            bundle.putAll(B02);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Z0().d(this);
        d1().t();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        Z0().c(this);
        super.onStop();
    }

    public boolean onSupportNavigateUp() {
        C8951o oVar = this.f92791P0;
        if (oVar != null) {
            return oVar.i0();
        }
        return false;
    }

    public final C12074d p1() {
        C12074d dVar = this.f92797X;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("userConsentRepository");
        return null;
    }

    public final pw.d q1() {
        pw.d dVar = this.f92800y0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("welcomeActivityNavGraphProvider");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean x0() {
        return this.f92777I0;
    }

    /* access modifiers changed from: protected */
    public boolean y0() {
        return this.f92775H0;
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f92773G0;
    }
}
