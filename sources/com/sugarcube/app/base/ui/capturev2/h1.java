package com.sugarcube.app.base.ui.capturev2;

import KF.C13147a;
import OE.C13309a;
import OE.C13310b;
import OE.C13313e;
import OE.n;
import OE.q;
import PE.C13339a;
import PE.C13341c;
import QJ.C16297b0;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.BatteryManager;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.g0;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.sugarcube.app.base.capture.CaptureSession;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.capturev2.S0;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.core.analytics.Event;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SessionMeta;
import dI.C17164e;
import dI.C17168i;
import eF.C14418i;
import eI.C17187b;
import hF.C14540b;
import hF.C14541c;
import hF.C14542d;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tF.C15083h;
import tF.C15091p;
import tI.C17978n;

@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001a2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aH@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H@¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010\u001cJ\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J!\u00105\u001a\u0002042\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020-¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020$2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001a¢\u0006\u0004\b?\u0010\u001cJ\u0019\u0010B\u001a\u00020\u001a2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ/\u0010I\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010E\u001a\u00020D2\u0010\b\u0002\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010F¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u001a¢\u0006\u0004\bK\u0010\u001cJ\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u001a¢\u0006\u0004\bP\u0010\u001cJ\r\u0010Q\u001a\u00020\u001a¢\u0006\u0004\bQ\u0010\u001cJ\r\u0010R\u001a\u00020\u001a¢\u0006\u0004\bR\u0010\u001cJ\u0015\u0010T\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u001b\u0010W\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001a0(¢\u0006\u0004\bW\u0010+J\r\u0010X\u001a\u00020\u001a¢\u0006\u0004\bX\u0010\u001cJ%\u0010\\\u001a\u00020\u001a2\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u001a0Yj\u0002`[¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020\u001a¢\u0006\u0004\b^\u0010\u001cJ\u0017\u0010a\u001a\u0004\u0018\u00010\u001a2\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u001d\u0010d\u001a\u00020\u001a2\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001a0(¢\u0006\u0004\bd\u0010+J\u0015\u0010f\u001a\u00020\u001a2\u0006\u0010e\u001a\u00020Z¢\u0006\u0004\bf\u0010gJ-\u0010p\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bp\u0010qJ8\u0010v\u001a\u0004\u0018\u00010j2\b\u0010s\u001a\u0004\u0018\u00010r2\u001a\u0010u\u001a\u0016\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020n\u0012\u0006\u0012\u0004\u0018\u00010j0tH@¢\u0006\u0004\bv\u0010wJ\u001d\u0010{\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u00020-¢\u0006\u0004\b{\u0010|J\u001d\u0010}\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u00020-¢\u0006\u0004\b}\u0010|J\r\u0010~\u001a\u00020\u001a¢\u0006\u0004\b~\u0010\u001cJ\r\u0010\u001a\u00020\u001a¢\u0006\u0004\b\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u001d\u0010\u0001\u001a\u00020\u001a2\b\u0010s\u001a\u0004\u0018\u00010rH@¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010\u001cJ'\u0010\u0001\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020-2\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020;¢\u0006\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010 \u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u00018\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R$\u0010µ\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010°\u00018\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R \u0010·\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0«\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010®\u0001R%\u0010º\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0°\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010²\u0001\u001a\u0006\b¹\u0001\u0010´\u0001R!\u0010½\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00010«\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010®\u0001R&\u0010À\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00010°\u00018\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010²\u0001\u001a\u0006\b¿\u0001\u0010´\u0001R \u0010Â\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001040«\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010®\u0001R%\u0010Å\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001040°\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010²\u0001\u001a\u0006\bÄ\u0001\u0010´\u0001R\u001f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Æ\u00010«\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010®\u0001R$\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030Æ\u00010°\u00018\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010²\u0001\u001a\u0006\bÊ\u0001\u0010´\u0001R\u001d\u0010Ï\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001d\u0010Ò\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ì\u0001\u001a\u0006\bÑ\u0001\u0010Î\u0001R\u001d\u0010Õ\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ì\u0001\u001a\u0006\bÔ\u0001\u0010Î\u0001R\u001d\u0010Ø\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010Ì\u0001\u001a\u0006\b×\u0001\u0010Î\u0001R\u001d\u0010Û\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ì\u0001\u001a\u0006\bÚ\u0001\u0010Î\u0001R\u001c\u0010ß\u0001\u001a\u0002018\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010¡\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010â\u0001\u001a\u0002018\u0006¢\u0006\u0010\n\u0006\bà\u0001\u0010¡\u0001\u001a\u0006\bá\u0001\u0010Þ\u0001R\u001c\u0010å\u0001\u001a\u0002018\u0006¢\u0006\u0010\n\u0006\bã\u0001\u0010¡\u0001\u001a\u0006\bä\u0001\u0010Þ\u0001R\u001b\u0010ç\u0001\u001a\u0002018\u0006¢\u0006\u000f\n\u0005\b\\\u0010¡\u0001\u001a\u0006\bæ\u0001\u0010Þ\u0001R\u0017\u0010è\u0001\u001a\u00030Æ\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bf\u0010Ì\u0001R\u001c\u0010ê\u0001\u001a\u00030Æ\u00018\u0006¢\u0006\u000f\n\u0005\bp\u0010Ì\u0001\u001a\u0006\bé\u0001\u0010Î\u0001R\u001e\u0010í\u0001\u001a\u00020l8\u0006XD¢\u0006\u000f\n\u0005\ba\u0010£\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010ð\u0001\u001a\u00030î\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010ï\u0001R\u001b\u0010ó\u0001\u001a\u0005\u0018\u00010ñ\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bQ\u0010ò\u0001R\u001f\u0010õ\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0(8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010ô\u0001R \u0010ö\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Æ\u00010«\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bv\u0010®\u0001R,\u0010ý\u0001\u001a\u00030÷\u00012\b\u0010ø\u0001\u001a\u00030÷\u00018F@BX\u000e¢\u0006\u0010\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R)\u0010\u0002\u001a\u00020S2\u0007\u0010ø\u0001\u001a\u00020S8F@BX\u000e¢\u0006\u000f\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0005\b\u0002\u0010UR\u0018\u0010\u0002\u001a\u00030Æ\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010Î\u0001R\u0014\u0010\u0002\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0014\u0010\u0002\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030Æ\u00018VX\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010Î\u0001R\u0015\u0010\u0002\u001a\u00030Æ\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010Î\u0001R\u0013\u0010:\u001a\u00020$8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0013\u0010%\u001a\u00020$8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0016\u0010\u0002\u001a\u0004\u0018\u00010-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0013\u0010z\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0014\u0010\u0002\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0014\u0010\u0002\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0015\u0010\u0002\u001a\u00030\u00028F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001e\u0010 \u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Æ\u00010°\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010´\u0001¨\u0006¡\u0002"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/h1;", "LeF/i;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "LPE/a;", "captureRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LKF/a;", "files", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "prefStorage", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "<init>", "(LOE/q;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;LOE/a;Lcom/sugarcube/app/base/data/AnalyticsManager;LPE/a;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LKF/a;LOE/e;Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "LXH/N;", "U1", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "T1", "(Ljava/lang/Exception;)V", "X1", "(LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "uuid", "Y1", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "negAnalytics", "i2", "(LnI/a;)V", "m2", "", "reason", "f2", "(Ljava/lang/String;)V", "", "idx", "ext", "Ljava/io/File;", "i1", "(ILjava/lang/String;)Ljava/io/File;", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "N0", "()Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "sessionUuid", "Landroid/content/Context;", "context", "P1", "(Ljava/util/UUID;Landroid/content/Context;)V", "v1", "LhF/b;", "stepEnum", "x1", "(LhF/b;)V", "LhF/d;", "action", "", "Lcom/sugarcube/core/analytics/Trackable;", "trackable", "q2", "(LhF/b;LhF/d;Ljava/util/List;)V", "C1", "LhF/c;", "state", "a2", "(LhF/c;)V", "A1", "K0", "M1", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "O1", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)V", "callback", "s2", "p2", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/ui/capturev2/a;", "Lcom/sugarcube/app/base/ui/capturev2/ImageResultCallback;", "F0", "(LnI/l;)V", "V1", "", "angles", "I0", "([F)LXH/N;", "listener", "b2", "acquiredImage", "G0", "(Lcom/sugarcube/app/base/ui/capturev2/a;)V", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "Landroid/graphics/Bitmap;", "image", "", "imageTimestamp", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "H0", "(Lcom/sugarcube/app/base/ui/capturev2/R0;Landroid/graphics/Bitmap;JLcom/sugarcube/app/base/ui/capturev2/W;)V", "Lcom/sugarcube/app/base/ui/capturev2/q;", "arSurface", "Lkotlin/Function2;", "createImage", "M0", "(Lcom/sugarcube/app/base/ui/capturev2/q;LnI/p;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "roomTitle", "I1", "(Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;)V", "J1", "D1", "u1", "w1", "J0", "F1", "E1", "t1", "L1", "(Lcom/sugarcube/app/base/ui/capturev2/q;LdI/e;)Ljava/lang/Object;", "B1", "N1", "G1", "msg", "", "t", "Q1", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "L0", "(Landroid/content/Context;)V", "C", "LOE/q;", "o1", "()LOE/q;", "D", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "T0", "()Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "E", "LOE/a;", "F", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "G", "LPE/a;", "H", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "I", "LKF/a;", "J", "LOE/e;", "K", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "L", "Lcom/sugarcube/app/base/data/SceneRepository;", "M", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Landroidx/lifecycle/K;", "LtF/h;", "N", "Landroidx/lifecycle/K;", "_showDialog", "Landroidx/lifecycle/F;", "O", "Landroidx/lifecycle/F;", "n1", "()Landroidx/lifecycle/F;", "showDialog", "P", "_finish", "Q", "a1", "finish", "", "R", "_navDirections", "S", "g1", "navDirections", "T", "_previewFile", "U", "k1", "previewFile", "", "X", "_wasSaved", "Y", "s1", "wasSaved", "Z", "getEnableUltrawide", "()Z", "enableUltrawide", "y0", "Z0", "enableShowPoints", "z0", "Y0", "enableShowPlanes", "A0", "getEnableImageFormatJPEG", "enableImageFormatJPEG", "B0", "getEnableVideoEncoder", "enableVideoEncoder", "C0", "getVideoEncoderFPS", "()I", "videoEncoderFPS", "D0", "getOwnVideoFramerateSkip", "ownVideoFramerateSkip", "E0", "getVideoEncoderBitrate", "videoEncoderBitrate", "c1", "jpegQuality", "forceLandscapeEnabled", "getSwapRGBEnabled", "swapRGBEnabled", "S0", "()J", "arInitTimeoutSec", "Lcom/sugarcube/app/base/ui/capturev2/S0;", "Lcom/sugarcube/app/base/ui/capturev2/S0;", "sessionData", "Lcom/sugarcube/app/base/ui/capturev2/d;", "Lcom/sugarcube/app/base/ui/capturev2/d;", "arControl", "LnI/a;", "poseListener", "_arInitDone", "Lcom/sugarcube/app/base/ui/capturev2/N;", "value", "f1", "()Lcom/sugarcube/app/base/ui/capturev2/N;", "Z1", "(Lcom/sugarcube/app/base/ui/capturev2/N;)V", "mode", "p1", "()Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "e2", "tutorialStep", "U0", "captureInterruptEnabled", "X0", "()Ljava/lang/String;", "country", "d1", "language", "isLandscape", "b1", "forceLandscape", "m1", "()Ljava/util/UUID;", "r1", "q1", "ultraWideCameraId", "l1", "W0", "captureType", "V0", "captureStrategy", "", "Lcom/sugarcube/app/base/ui/capturev2/X;", "h1", "()Ljava/util/List;", "panoDataList", "Lcom/sugarcube/app/base/ui/capturev2/L;", "e1", "()Lcom/sugarcube/app/base/ui/capturev2/L;", "metaBuilder", "R0", "arInitDone", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 extends C14418i {

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f123785A0;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f123786B0;

    /* renamed from: C  reason: collision with root package name */
    private final q f123787C;

    /* renamed from: C0  reason: collision with root package name */
    private final int f123788C0;

    /* renamed from: D  reason: collision with root package name */
    private final VideoAssetRepository f123789D;

    /* renamed from: D0  reason: collision with root package name */
    private final int f123790D0;

    /* renamed from: E  reason: collision with root package name */
    private final C13309a f123791E;

    /* renamed from: E0  reason: collision with root package name */
    private final int f123792E0;

    /* renamed from: F  reason: collision with root package name */
    private final AnalyticsManager f123793F;

    /* renamed from: F0  reason: collision with root package name */
    private final int f123794F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C13339a f123795G;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f123796G0;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final ConfigRepository f123797H;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f123798H0;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final C13147a f123799I;

    /* renamed from: I0  reason: collision with root package name */
    private final long f123800I0;

    /* renamed from: J  reason: collision with root package name */
    private final C13313e f123801J;
    /* access modifiers changed from: private */

    /* renamed from: J0  reason: collision with root package name */
    public S0 f123802J0;

    /* renamed from: K  reason: collision with root package name */
    private final PreferenceStorage f123803K;
    /* access modifiers changed from: private */

    /* renamed from: K0  reason: collision with root package name */
    public C14202d f123804K0;

    /* renamed from: L  reason: collision with root package name */
    private final SceneRepository f123805L;

    /* renamed from: L0  reason: collision with root package name */
    private C17631a<C16807N> f123806L0;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public final FirebaseInteractions f123807M;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public final K<Boolean> f123808M0;

    /* renamed from: N  reason: collision with root package name */
    private final K<C15083h> f123809N;

    /* renamed from: O  reason: collision with root package name */
    private final F<C15083h> f123810O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public final K<C16807N> f123811P;

    /* renamed from: Q  reason: collision with root package name */
    private final F<C16807N> f123812Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public final K<Object> f123813R;

    /* renamed from: S  reason: collision with root package name */
    private final F<Object> f123814S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public final K<File> f123815T;

    /* renamed from: U  reason: collision with root package name */
    private final F<File> f123816U;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public final K<Boolean> f123817X;

    /* renamed from: Y  reason: collision with root package name */
    private final F<Boolean> f123818Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f123819Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f123820y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f123821z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f123822a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f123823b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0057 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0067 */
        static {
            /*
                com.sugarcube.app.base.ui.capturev2.N[] r0 = com.sugarcube.app.base.ui.capturev2.N.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.sugarcube.app.base.ui.capturev2.N r2 = com.sugarcube.app.base.ui.capturev2.N.ArPano     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.sugarcube.app.base.ui.capturev2.N r3 = com.sugarcube.app.base.ui.capturev2.N.Scan     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.sugarcube.app.base.ui.capturev2.N r4 = com.sugarcube.app.base.ui.capturev2.N.Room     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                com.sugarcube.app.base.ui.capturev2.N r5 = com.sugarcube.app.base.ui.capturev2.N.CamPano     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.app.base.ui.capturev2.N r5 = com.sugarcube.app.base.ui.capturev2.N.PermissionDone     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r6 = 5
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.sugarcube.app.base.ui.capturev2.N r5 = com.sugarcube.app.base.ui.capturev2.N.PanoCheck     // Catch:{ NoSuchFieldError -> 0x003d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r6 = 6
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.sugarcube.app.base.ui.capturev2.N r5 = com.sugarcube.app.base.ui.capturev2.N.Results     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r6 = 7
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f123822a = r0
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum[] r0 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r5 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN_AGAIN     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                f123823b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$doSave$1", f = "SessionViewModel.kt", l = {744, 748}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123824c;

        /* renamed from: d  reason: collision with root package name */
        Object f123825d;

        /* renamed from: e  reason: collision with root package name */
        int f123826e;

        /* renamed from: f  reason: collision with root package name */
        int f123827f;

        /* renamed from: g  reason: collision with root package name */
        long f123828g;

        /* renamed from: h  reason: collision with root package name */
        long f123829h;

        /* renamed from: i  reason: collision with root package name */
        int f123830i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h1 f123831j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h1 h1Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f123831j = h1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f123831j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            long j10;
            Object f10 = C17187b.f();
            int i10 = this.f123830i;
            if (i10 == 0) {
                y.b(obj);
                h1.R1(this.f123831j, "save: start", (Throwable) null, 2, (Object) null);
                h1 h1Var = this.f123831j;
                j10 = System.currentTimeMillis();
                this.f123824c = h1Var;
                this.f123826e = 0;
                this.f123828g = j10;
                this.f123827f = 0;
                this.f123830i = 1;
                if (h1Var.X1(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                j10 = this.f123828g;
                h1 h1Var2 = (h1) this.f123824c;
                y.b(obj);
            } else if (i10 == 2) {
                h1 h1Var3 = (h1) this.f123825d;
                Long l10 = (Long) this.f123824c;
                try {
                    y.b(obj);
                    this.f123831j.f123817X.postValue(kotlin.coroutines.jvm.internal.b.a(true));
                } catch (Throwable th2) {
                    h1 h1Var4 = this.f123831j;
                    h1.R1(h1Var4, "save: error " + th2, (Throwable) null, 2, (Object) null);
                    this.f123831j.f123807M.recordException(th2);
                }
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Long f11 = kotlin.coroutines.jvm.internal.b.f(System.currentTimeMillis() - j10);
            h1 h1Var5 = this.f123831j;
            long longValue = f11.longValue();
            long max = Math.max(2000, ((long) 2000) - longValue);
            h1.R1(h1Var5, "save: done " + longValue + "ms (" + max + ")", (Throwable) null, 2, (Object) null);
            this.f123824c = f11;
            this.f123825d = h1Var5;
            this.f123828g = longValue;
            this.f123826e = 0;
            this.f123829h = max;
            this.f123830i = 2;
            if (C16297b0.b(max, this) == f10) {
                return f10;
            }
            this.f123831j.f123817X.postValue(kotlin.coroutines.jvm.internal.b.a(true));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel", f = "SessionViewModel.kt", l = {545, 547}, m = "getAlignmentImage")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f123832c;

        /* renamed from: d  reason: collision with root package name */
        Object f123833d;

        /* renamed from: e  reason: collision with root package name */
        Object f123834e;

        /* renamed from: f  reason: collision with root package name */
        Object f123835f;

        /* renamed from: g  reason: collision with root package name */
        Object f123836g;

        /* renamed from: h  reason: collision with root package name */
        Object f123837h;

        /* renamed from: i  reason: collision with root package name */
        Object f123838i;

        /* renamed from: j  reason: collision with root package name */
        Object f123839j;

        /* renamed from: k  reason: collision with root package name */
        Object f123840k;

        /* renamed from: l  reason: collision with root package name */
        Object f123841l;

        /* renamed from: m  reason: collision with root package name */
        Object f123842m;

        /* renamed from: n  reason: collision with root package name */
        Object f123843n;

        /* renamed from: o  reason: collision with root package name */
        int f123844o;

        /* renamed from: p  reason: collision with root package name */
        int f123845p;

        /* renamed from: q  reason: collision with root package name */
        int f123846q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f123847r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ h1 f123848s;

        /* renamed from: t  reason: collision with root package name */
        int f123849t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h1 h1Var, C17164e<? super c> eVar) {
            super(eVar);
            this.f123848s = h1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123847r = obj;
            this.f123849t |= Integer.MIN_VALUE;
            return this.f123848s.M0((C14228q) null, (p<? super Bitmap, ? super W, Bitmap>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$handleArPanoDone$1", f = "SessionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h1 f123851d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, h1.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((h1) this.receiver).T1(exc);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17642l<Exception, C16807N> {
            b(Object obj) {
                super(1, obj, h1.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((h1) this.receiver).T1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h1 h1Var, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f123851d = h1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f123851d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123850c == 0) {
                y.b(obj);
                Iterable<X> h12 = this.f123851d.h1();
                ArrayList arrayList = new ArrayList(C16877v.y(h12, 10));
                for (X d10 : h12) {
                    arrayList.add(d10.d());
                }
                List t02 = C16877v.t0(arrayList);
                Bitmap bitmap = null;
                if (t02.size() > 0) {
                    bitmap = C13341c.d(t02, 1000, (Integer) null, 2);
                }
                if (bitmap != null) {
                    h1 h1Var = this.f123851d;
                    C13341c.f(bitmap, new File(h1Var.f123799I.b(h1Var.r1()), "pano_preview.jpg"), h1Var.c1(), new a(h1Var));
                    File file = new File(h1Var.f123799I.b(h1Var.r1()), "mosaic.png");
                    C13341c.h(bitmap, file, new b(h1Var));
                    h1Var.f123815T.postValue(file);
                }
                this.f123851d.f123813R.postValue(Kreativ.Capture.V2.j.INSTANCE);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$handleCamPanoDone$1", f = "SessionViewModel.kt", l = {629}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123852c;

        /* renamed from: d  reason: collision with root package name */
        Object f123853d;

        /* renamed from: e  reason: collision with root package name */
        Object f123854e;

        /* renamed from: f  reason: collision with root package name */
        Object f123855f;

        /* renamed from: g  reason: collision with root package name */
        Object f123856g;

        /* renamed from: h  reason: collision with root package name */
        Object f123857h;

        /* renamed from: i  reason: collision with root package name */
        Object f123858i;

        /* renamed from: j  reason: collision with root package name */
        int f123859j;

        /* renamed from: k  reason: collision with root package name */
        int f123860k;

        /* renamed from: l  reason: collision with root package name */
        int f123861l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h1 f123862m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, h1.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((h1) this.receiver).T1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h1 h1Var, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f123862m = h1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f123862m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            h1 h1Var;
            File file;
            Bitmap bitmap;
            Object f10 = C17187b.f();
            int i10 = this.f123861l;
            if (i10 == 0) {
                y.b(obj);
                Iterable<X> h12 = this.f123862m.h1();
                ArrayList arrayList = new ArrayList(C16877v.y(h12, 10));
                for (X d10 : h12) {
                    arrayList.add(d10.d());
                }
                List t02 = C16877v.t0(arrayList);
                if (t02.size() > 0) {
                    bitmap = Bitmap.createScaledBitmap((Bitmap) t02.get(0), 1000, (int) (((float) 1000) / (((float) ((Bitmap) t02.get(0)).getWidth()) / ((float) ((Bitmap) t02.get(0)).getHeight()))), true);
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    h1 h1Var2 = this.f123862m;
                    File file2 = new File(h1Var2.f123799I.b(h1Var2.r1()), "mosaic.png");
                    C13341c.f(bitmap, file2, h1Var2.c1(), new a(h1Var2));
                    this.f123852c = t02;
                    this.f123853d = bitmap;
                    this.f123854e = bitmap;
                    this.f123855f = h1Var2;
                    this.f123856g = bitmap;
                    this.f123857h = file2;
                    this.f123858i = file2;
                    this.f123859j = 0;
                    this.f123860k = 0;
                    this.f123861l = 1;
                    if (C16297b0.b(100, this) == f10) {
                        return f10;
                    }
                    h1Var = h1Var2;
                    file = file2;
                }
                this.f123862m.f123813R.postValue(Kreativ.Capture.V2.j.INSTANCE);
                return C16807N.f139792a;
            } else if (i10 == 1) {
                file = (File) this.f123858i;
                File file3 = (File) this.f123857h;
                Bitmap bitmap2 = (Bitmap) this.f123856g;
                h1Var = (h1) this.f123855f;
                Bitmap bitmap3 = (Bitmap) this.f123854e;
                Bitmap bitmap4 = (Bitmap) this.f123853d;
                List list = (List) this.f123852c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h1Var.f123815T.postValue(file);
            this.f123862m.f123813R.postValue(Kreativ.Capture.V2.j.INSTANCE);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$handlePreviewContinue$1", f = "SessionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h1 f123864d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, h1.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((h1) this.receiver).T1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h1 h1Var, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f123864d = h1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f123864d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            R0 d10;
            List<V> c10;
            C17187b.f();
            if (this.f123863c == 0) {
                y.b(obj);
                Iterable<X> h12 = this.f123864d.h1();
                ArrayList arrayList = new ArrayList(C16877v.y(h12, 10));
                for (X d11 : h12) {
                    arrayList.add(d11.d());
                }
                h1 h1Var = this.f123864d;
                int i10 = 0;
                for (Object next : C16877v.t0(arrayList)) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C16877v.x();
                    }
                    C13341c.f((Bitmap) next, h1.j1(h1Var, i10, (String) null, 2, (Object) null), h1Var.c1(), new a(h1Var));
                    i10 = i11;
                }
                h1 h1Var2 = this.f123864d;
                for (X x10 : this.f123864d.h1()) {
                    C14196a c11 = x10.c();
                    if (!(c11 == null || (c10 = c11.c()) == null)) {
                        for (V a10 : c10) {
                            h1Var2.e1().a(a10);
                        }
                    }
                    v1 i12 = x10.i();
                    if (!(i12 == null || (d10 = i12.d()) == null)) {
                        h1Var2.e1().b(d10, x10.e());
                    }
                }
                this.f123864d.Z1(N.PanoCheck);
                K w02 = this.f123864d.f123811P;
                C16807N n10 = C16807N.f139792a;
                w02.postValue(n10);
                return n10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel", f = "SessionViewModel.kt", l = {695, 697, 697, 699}, m = "handleScanDone")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f123865c;

        /* renamed from: d  reason: collision with root package name */
        Object f123866d;

        /* renamed from: e  reason: collision with root package name */
        Object f123867e;

        /* renamed from: f  reason: collision with root package name */
        Object f123868f;

        /* renamed from: g  reason: collision with root package name */
        int f123869g;

        /* renamed from: h  reason: collision with root package name */
        int f123870h;

        /* renamed from: i  reason: collision with root package name */
        long f123871i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f123872j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h1 f123873k;

        /* renamed from: l  reason: collision with root package name */
        int f123874l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h1 h1Var, C17164e<? super g> eVar) {
            super(eVar);
            this.f123873k = h1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123872j = obj;
            this.f123874l |= Integer.MIN_VALUE;
            return this.f123873k.L1((C14228q) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$save$2", f = "SessionViewModel.kt", l = {759, 761}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h1 f123876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(h1 h1Var, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f123876d = h1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f123876d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f123875c
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L_0x001e
                if (r1 == r2) goto L_0x001a
                if (r1 != r3) goto L_0x0012
                XH.y.b(r5)
                goto L_0x0051
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                XH.y.b(r5)
                goto L_0x0036
            L_0x001e:
                XH.y.b(r5)
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                PE.a r5 = r5.f123795G
                com.sugarcube.app.base.ui.capturev2.h1 r1 = r4.f123876d
                com.sugarcube.app.base.ui.capturev2.S0 r1 = r1.f123802J0
                r4.f123875c = r2
                java.lang.Object r5 = r5.t(r1, r4)
                if (r5 != r0) goto L_0x0036
                return r0
            L_0x0036:
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                com.sugarcube.app.base.ui.capturev2.S0 r5 = r5.f123802J0
                boolean r5 = r5.getSaved()
                if (r5 == 0) goto L_0x0051
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                java.util.UUID r1 = r5.r1()
                r4.f123875c = r3
                java.lang.Object r5 = r5.Y1(r1, r4)
                if (r5 != r0) goto L_0x0051
                return r0
            L_0x0051:
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                com.sugarcube.app.base.ui.capturev2.S0 r5 = r5.f123802J0
                boolean r5 = r5.getHasError()
                if (r5 == 0) goto L_0x006c
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                java.lang.String r0 = "save: showCaptureErrorDialog"
                r1 = 0
                com.sugarcube.app.base.ui.capturev2.h1.R1(r5, r0, r1, r3, r1)
                com.sugarcube.app.base.ui.capturev2.h1 r5 = r4.f123876d
                java.lang.String r0 = ""
                r5.f2(r0)
            L_0x006c:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$setCapturePreferences$2", f = "SessionViewModel.kt", l = {777, 780, 781}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f123877c;

        /* renamed from: d  reason: collision with root package name */
        int f123878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h1 f123879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f123880f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h1 h1Var, UUID uuid, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f123879e = h1Var;
            this.f123880f = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f123879e, this.f123880f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f123878d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0023
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                XH.y.b(r7)
                goto L_0x0075
            L_0x0015:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001d:
                boolean r1 = r6.f123877c
                XH.y.b(r7)
                goto L_0x005c
            L_0x0023:
                XH.y.b(r7)
                goto L_0x003b
            L_0x0027:
                XH.y.b(r7)
                com.sugarcube.app.base.ui.capturev2.h1 r7 = r6.f123879e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f123797H
                com.sugarcube.app.base.data.feature.ConfigItems$CaptureFeedbackPromptWasPresented r1 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE
                r6.f123878d = r4
                java.lang.Object r7 = r7.get(r1, r6)
                if (r7 != r0) goto L_0x003b
                return r0
            L_0x003b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r1 = r7.booleanValue()
                if (r1 != 0) goto L_0x0075
                com.sugarcube.app.base.ui.capturev2.h1 r7 = r6.f123879e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f123797H
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r4 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                java.util.UUID r5 = r6.f123880f
                java.lang.String r5 = r5.toString()
                r6.f123877c = r1
                r6.f123878d = r3
                java.lang.Object r7 = r7.override(r4, r5, r6)
                if (r7 != r0) goto L_0x005c
                return r0
            L_0x005c:
                com.sugarcube.app.base.ui.capturev2.h1 r7 = r6.f123879e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f123797H
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureType r3 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureType.INSTANCE
                com.sugarcube.app.base.ui.capturev2.h1 r4 = r6.f123879e
                java.lang.String r4 = r4.V0()
                r6.f123877c = r1
                r6.f123878d = r2
                java.lang.Object r7 = r7.override(r3, r4, r6)
                if (r7 != r0) goto L_0x0075
                return r0
            L_0x0075:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$startPano$1", f = "SessionViewModel.kt", l = {478}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123881c;

        /* renamed from: d  reason: collision with root package name */
        Object f123882d;

        /* renamed from: e  reason: collision with root package name */
        Object f123883e;

        /* renamed from: f  reason: collision with root package name */
        int f123884f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f123885g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f123886h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f123887a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h1 f123888b;

            a(kotlin.jvm.internal.K k10, h1 h1Var) {
                this.f123887a = k10;
                this.f123888b = h1Var;
            }

            /* renamed from: c */
            public final Object emit(TrackingState trackingState, C17164e<? super C16807N> eVar) {
                if (trackingState == TrackingState.TRACKING) {
                    this.f123887a.f144344a = true;
                    this.f123888b.f123808M0.postValue(kotlin.coroutines.jvm.internal.b.a(true));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h1 h1Var, kotlin.jvm.internal.K k10, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f123885g = h1Var;
            this.f123886h = k10;
        }

        /* access modifiers changed from: private */
        public static final boolean j(X x10) {
            return true;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f123885g, this.f123886h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            F<TrackingState> i10;
            C16532g<TrackingState> a10;
            Object f10 = C17187b.f();
            int i11 = this.f123884f;
            if (i11 == 0) {
                y.b(obj);
                C16877v.L(this.f123885g.h1(), new i1());
                C14202d p02 = this.f123885g.f123804K0;
                if (!(p02 == null || (i10 = p02.i()) == null || (a10 = C5210m.a(i10)) == null)) {
                    a aVar = new a(this.f123886h, this.f123885g);
                    this.f123881c = p02;
                    this.f123882d = i10;
                    this.f123883e = a10;
                    this.f123884f = 1;
                    if (a10.collect(aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i11 == 1) {
                C16532g gVar = (C16532g) this.f123883e;
                F f11 = (F) this.f123882d;
                C14202d dVar = (C14202d) this.f123881c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$startPano$2", f = "SessionViewModel.kt", l = {486}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h1 f123890d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f123891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h1 h1Var, kotlin.jvm.internal.K k10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f123890d = h1Var;
            this.f123891e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f123890d, this.f123891e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123889c;
            if (i10 == 0) {
                y.b(obj);
                long millis = TimeUnit.SECONDS.toMillis(this.f123890d.S0());
                this.f123889c = 1;
                if (C16297b0.b(millis, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f123891e.f144344a) {
                this.f123890d.f123808M0.postValue(kotlin.coroutines.jvm.internal.b.a(false));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.SessionViewModel$waitForTracking$1", f = "SessionViewModel.kt", l = {465}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123892c;

        /* renamed from: d  reason: collision with root package name */
        Object f123893d;

        /* renamed from: e  reason: collision with root package name */
        Object f123894e;

        /* renamed from: f  reason: collision with root package name */
        int f123895f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f123896g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f123897h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f123898a;

            a(C17631a<C16807N> aVar) {
                this.f123898a = aVar;
            }

            /* renamed from: c */
            public final Object emit(TrackingState trackingState, C17164e<? super C16807N> eVar) {
                if (trackingState == TrackingState.TRACKING) {
                    this.f123898a.invoke();
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h1 h1Var, C17631a<C16807N> aVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f123896g = h1Var;
            this.f123897h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f123896g, this.f123897h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            F<TrackingState> i10;
            C16532g<TrackingState> a10;
            Object f10 = C17187b.f();
            int i11 = this.f123895f;
            if (i11 == 0) {
                y.b(obj);
                C14202d p02 = this.f123896g.f123804K0;
                if (!(p02 == null || (i10 = p02.i()) == null || (a10 = C5210m.a(i10)) == null)) {
                    a aVar = new a(this.f123897h);
                    this.f123892c = p02;
                    this.f123893d = i10;
                    this.f123894e = a10;
                    this.f123895f = 1;
                    if (a10.collect(aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i11 == 1) {
                C16532g gVar = (C16532g) this.f123894e;
                F f11 = (F) this.f123893d;
                C14202d dVar = (C14202d) this.f123892c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public h1(q qVar, VideoAssetRepository videoAssetRepository, C13309a aVar, AnalyticsManager analyticsManager, C13339a aVar2, ConfigRepository configRepository, C13147a aVar3, C13313e eVar, PreferenceStorage preferenceStorage, SceneRepository sceneRepository, FirebaseInteractions firebaseInteractions) {
        q qVar2 = qVar;
        VideoAssetRepository videoAssetRepository2 = videoAssetRepository;
        C13309a aVar4 = aVar;
        AnalyticsManager analyticsManager2 = analyticsManager;
        C13339a aVar5 = aVar2;
        ConfigRepository configRepository2 = configRepository;
        C13147a aVar6 = aVar3;
        C13313e eVar2 = eVar;
        PreferenceStorage preferenceStorage2 = preferenceStorage;
        SceneRepository sceneRepository2 = sceneRepository;
        FirebaseInteractions firebaseInteractions2 = firebaseInteractions;
        C17542s.j(qVar2, "sugarcube");
        C17542s.j(videoAssetRepository2, "assetRepository");
        C17542s.j(aVar4, "appEnvironment");
        C17542s.j(analyticsManager2, "analyticsManager");
        C17542s.j(aVar5, "captureRepository");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(aVar6, "files");
        C17542s.j(eVar2, "installationConfig");
        C17542s.j(preferenceStorage2, "prefStorage");
        C17542s.j(sceneRepository2, "sceneRepository");
        C17542s.j(firebaseInteractions2, "firebaseInteractions");
        this.f123787C = qVar2;
        this.f123789D = videoAssetRepository2;
        this.f123791E = aVar4;
        this.f123793F = analyticsManager2;
        this.f123795G = aVar5;
        this.f123797H = configRepository2;
        this.f123799I = aVar6;
        this.f123801J = eVar2;
        this.f123803K = preferenceStorage2;
        this.f123805L = sceneRepository2;
        this.f123807M = firebaseInteractions2;
        K<C15083h> k10 = new K<>();
        this.f123809N = k10;
        this.f123810O = k10;
        K<C16807N> k11 = new K<>();
        this.f123811P = k11;
        this.f123812Q = k11;
        K<Object> k12 = new K<>();
        this.f123813R = k12;
        this.f123814S = k12;
        K<File> k13 = new K<>();
        this.f123815T = k13;
        this.f123816U = k13;
        K<Boolean> k14 = new K<>();
        this.f123817X = k14;
        this.f123818Y = k14;
        boolean isEnabledBlocking = configRepository2.isEnabledBlocking(FeatureFlags.UltrawideEnabled.INSTANCE);
        this.f123819Z = isEnabledBlocking;
        this.f123820y0 = configRepository2.isEnabledBlocking(FeatureFlags.ShowPoints.INSTANCE);
        this.f123821z0 = configRepository2.isEnabledBlocking(FeatureFlags.ShowPlanes.INSTANCE);
        boolean isEnabledBlocking2 = configRepository2.isEnabledBlocking(FeatureFlags.ImageFormatJPEGEnabled.INSTANCE);
        this.f123785A0 = isEnabledBlocking2;
        boolean isEnabledBlocking3 = configRepository2.isEnabledBlocking(FeatureFlags.VideoEncoderEnabled.INSTANCE);
        this.f123786B0 = isEnabledBlocking3;
        int intValue = ((Integer) configRepository2.getBlocking(ConfigItems.VideoEncoderFPS.INSTANCE)).intValue();
        this.f123788C0 = intValue;
        boolean z10 = false;
        this.f123790D0 = intValue != 10 ? intValue != 15 ? 0 : 2 : 3;
        this.f123792E0 = C17978n.m(((Integer) configRepository2.getBlocking(ConfigItems.VideoEncoderBitrate.INSTANCE)).intValue(), 1000000, 8000000);
        this.f123794F0 = C17978n.m(((Integer) configRepository2.getBlocking(ConfigItems.JPEGPanoQuality.INSTANCE)).intValue(), 60, 100);
        if (configRepository2.isEnabledBlocking(FeatureFlags.ForceLandscapeEnabled.INSTANCE) && isEnabledBlocking) {
            z10 = true;
        }
        this.f123796G0 = z10;
        boolean isEnabledBlocking4 = configRepository2.isEnabledBlocking(FeatureFlags.SwapRgbEnabled.INSTANCE);
        this.f123798H0 = isEnabledBlocking4;
        this.f123800I0 = 6;
        S0.a aVar7 = S0.f123574C;
        Instant now = Instant.now();
        C17542s.i(now, "now(...)");
        SessionMeta c10 = aVar7.c(now, 0, qVar.getRegion(), isEnabledBlocking3, false, isEnabledBlocking4, isEnabledBlocking2, configRepository.getEnabledFeatures(), eVar);
        S0 s02 = r11;
        S0 s03 = new S0((UUID) null, (UUID) null, (Instant) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (RoomType) null, (String) null, (N) null, (List) null, 0, (TutorialStepEnum) null, false, false, (List) null, (w1) null, (L) null, c10, 33554431, (DefaultConstructorMarker) null);
        this.f123802J0 = s02;
        this.f123806L0 = new a1();
        this.f123808M0 = new K<>(null);
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(h1 h1Var, TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
        C17542s.j(trackingState, "trackingState");
        C17542s.j(trackingFailureReason, "trackingFailureReason");
        h1Var.X(trackingState, trackingFailureReason);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(h1 h1Var, boolean z10) {
        h1Var.S(z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(h1 h1Var) {
        h1Var.f123806L0.invoke();
        return C16807N.f139792a;
    }

    public static /* synthetic */ void R1(h1 h1Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        h1Var.Q1(str, th2);
    }

    /* access modifiers changed from: private */
    public static final C16807N S1() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void T1(Exception exc) {
        this.f123807M.recordException(exc);
    }

    private final boolean U0() {
        int i10 = a.f123822a[f1().ordinal()];
        boolean z10 = true;
        if (!(i10 == 1 || i10 == 2)) {
            z10 = false;
        }
        N f12 = f1();
        R1(this, "captureInterruptEnabled=" + z10 + " mode=" + f12, (Throwable) null, 2, (Object) null);
        return z10;
    }

    private final void U1() {
        this.f123804K0 = null;
        this.f123795G.v((CaptureSession) null);
    }

    /* access modifiers changed from: private */
    public static final boolean W1(X x10) {
        C17542s.j(x10, "it");
        return true;
    }

    /* access modifiers changed from: private */
    public final Object X1(C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.b(), new h(this, (C17164e<? super h>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object Y1(UUID uuid, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new i(this, uuid, (C17164e<? super i>) null), 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void Z1(N n10) {
        String name = this.f123802J0.c().name();
        String name2 = n10.name();
        R1(this, "mode changed [" + name + " -> " + name2 + "]", (Throwable) null, 2, (Object) null);
        this.f123802J0.r(n10);
    }

    public static /* synthetic */ void c2(h1 h1Var, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new T0
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:com.sugarcube.app.base.ui.capturev2.T0) =  call: com.sugarcube.app.base.ui.capturev2.T0.<init>():void type: CONSTRUCTOR in method: com.sugarcube.app.base.ui.capturev2.h1.c2(com.sugarcube.app.base.ui.capturev2.h1, nI.a, int, java.lang.Object):void, dex: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0009
                com.sugarcube.app.base.ui.capturev2.T0 r1 = new com.sugarcube.app.base.ui.capturev2.T0
                r1.<init>()
            L_0x0009:
                r0.b2(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.c2(com.sugarcube.app.base.ui.capturev2.h1, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N d2() {
            return C16807N.f139792a;
        }

        private final void e2(TutorialStepEnum tutorialStepEnum) {
            String name = this.f123802J0.e().name();
            String name2 = tutorialStepEnum.name();
            R1(this, "tutorialStep changed [" + name + " -> " + name2 + "]", (Throwable) null, 2, (Object) null);
            this.f123802J0.v(tutorialStepEnum);
        }

        /* access modifiers changed from: private */
        public final void f2(String str) {
            this.f123809N.postValue(new C15083h.c("exit_error", new C15091p(Integer.valueOf(n.f113498z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113492y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new W0(this, str), (C15091p) null, (C17631a) null, new X0(this), 96, (DefaultConstructorMarker) null));
        }

        /* access modifiers changed from: private */
        public static final C16807N g2(h1 h1Var, String str) {
            h1Var.Z1(N.Exit);
            K<C16807N> k10 = h1Var.f123811P;
            C16807N n10 = C16807N.f139792a;
            k10.postValue(n10);
            h1Var.f123787C.b().captureErrorDialogExit(h1Var.r1(), h1Var.l1(), h1Var.W0(), h1Var.V0(), str);
            return n10;
        }

        /* access modifiers changed from: private */
        public static final C16807N h2(h1 h1Var) {
            R1(h1Var, "showCaptureErrorDialog dismissAction", (Throwable) null, 2, (Object) null);
            return C16807N.f139792a;
        }

        private final void i2(C17631a<C16807N> aVar) {
            if (this.f123802J0.h()) {
                this.f123809N.postValue(new C15083h.c("exit_confirmation", new C15091p(Integer.valueOf(n.f113186D0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113180C0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113358f), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new g1(), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new U0(aVar, this), new V0(this)));
                return;
            }
            C17631a<C16807N> aVar2 = aVar;
            aVar.invoke();
            Z1(N.Exit);
            this.f123811P.postValue(C16807N.f139792a);
        }

        public static /* synthetic */ File j1(h1 h1Var, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                str = "jpg";
            }
            return h1Var.i1(i10, str);
        }

        /* access modifiers changed from: private */
        public static final C16807N j2() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k2(C17631a aVar, h1 h1Var) {
            aVar.invoke();
            h1Var.Z1(N.Exit);
            K<C16807N> k10 = h1Var.f123811P;
            C16807N n10 = C16807N.f139792a;
            k10.postValue(n10);
            return n10;
        }

        /* access modifiers changed from: private */
        public static final C16807N l2(h1 h1Var) {
            h1Var.f123809N.postValue(C15083h.a.f131169a);
            return C16807N.f139792a;
        }

        private final void m2() {
            this.f123809N.postValue(new C15083h.c("exit_interruption", new C15091p(Integer.valueOf(n.f113174B0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113168A0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new Y0(this), (C15091p) null, (C17631a) null, new Z0(this), 96, (DefaultConstructorMarker) null));
        }

        /* access modifiers changed from: private */
        public static final C16807N n2(h1 h1Var) {
            h1Var.Z1(N.Exit);
            K<C16807N> k10 = h1Var.f123811P;
            C16807N n10 = C16807N.f139792a;
            k10.postValue(n10);
            return n10;
        }

        /* access modifiers changed from: private */
        public static final C16807N o2(h1 h1Var) {
            h1Var.Z1(N.Exit);
            K<C16807N> k10 = h1Var.f123811P;
            C16807N n10 = C16807N.f139792a;
            k10.postValue(n10);
            return n10;
        }

        public static /* synthetic */ void r2(h1 h1Var, C14540b bVar, C14542d dVar, List list, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                list = null;
            }
            h1Var.q2(bVar, dVar, list);
        }

        public static /* synthetic */ void y1(h1 h1Var, C14540b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = null;
            }
            h1Var.x1(bVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N z1(C14540b bVar, h1 h1Var) {
            if (bVar != null) {
                r2(h1Var, bVar, C14542d.Exit, (List) null, 4, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void A1() {
            /*
                r2 = this;
                com.sugarcube.app.base.ui.capturev2.N r0 = r2.f1()
                int[] r1 = com.sugarcube.app.base.ui.capturev2.h1.a.f123822a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L_0x003a
                r1 = 2
                if (r0 == r1) goto L_0x0029
                r1 = 3
                if (r0 == r1) goto L_0x0026
                r1 = 4
                if (r0 == r1) goto L_0x003a
                com.sugarcube.app.base.ui.capturev2.N r0 = com.sugarcube.app.base.ui.capturev2.N.Exit
                r2.Z1(r0)
                androidx.lifecycle.K<XH.N> r0 = r2.f123811P
                XH.N r1 = XH.C16807N.f139792a
                r0.postValue(r1)
                r0 = 0
                goto L_0x004a
            L_0x0026:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$l r0 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.l.INSTANCE
                goto L_0x004a
            L_0x0029:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$o r0 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.o.INSTANCE
                boolean r1 = r2.P()
                if (r1 == 0) goto L_0x0034
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN
                goto L_0x0036
            L_0x0034:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN
            L_0x0036:
                r2.e2(r1)
                goto L_0x004a
            L_0x003a:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$o r0 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.o.INSTANCE
                boolean r1 = r2.P()
                if (r1 == 0) goto L_0x0045
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_GET_READY_1
                goto L_0x0047
            L_0x0045:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_1
            L_0x0047:
                r2.e2(r1)
            L_0x004a:
                if (r0 == 0) goto L_0x0051
                androidx.lifecycle.K<java.lang.Object> r1 = r2.f123813R
                r1.postValue(r0)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.A1():void");
        }

        public final void B1() {
            this.f123813R.postValue(Kreativ.Capture.V2.a.INSTANCE);
        }

        public final void C1() {
            if (U0()) {
                m2();
            }
        }

        public final void D1() {
            this.f123802J0.w(true);
            Z1(N.PermissionDone);
            this.f123813R.postValue(Kreativ.Capture.V2.n.INSTANCE);
        }

        public final void E1() {
            F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new f(this, (C17164e<? super f>) null), 2, (Object) null);
        }

        public final void F0(C17642l<? super C14196a, C16807N> lVar) {
            C17542s.j(lVar, "callback");
            C14202d dVar = this.f123804K0;
            if (dVar != null) {
                dVar.f(lVar);
            }
        }

        public final void F1() {
            e2(P() ? TutorialStepEnum.UW_GET_READY_1 : TutorialStepEnum.HY_GET_READY_1);
            this.f123813R.postValue(Kreativ.Capture.V2.o.INSTANCE);
        }

        public final void G0(C14196a aVar) {
            C17542s.j(aVar, "acquiredImage");
            h1().add(new X(aVar, (v1) null, 2, (DefaultConstructorMarker) null));
        }

        public final void G1() {
            U1();
            Z1(N.Exit);
            this.f123811P.postValue(C16807N.f139792a);
        }

        public final void H0(R0 r02, Bitmap bitmap, long j10, W w10) {
            C17542s.j(r02, "sensorData");
            C17542s.j(bitmap, "image");
            C17542s.j(w10, "intrinsics");
            h1().add(new X((C14196a) null, new v1(j10, bitmap, r02, w10), 1, (DefaultConstructorMarker) null));
        }

        public final C16807N I0(float[] fArr) {
            C17542s.j(fArr, "angles");
            C14202d dVar = this.f123804K0;
            if (dVar == null) {
                return null;
            }
            dVar.g(fArr);
            return C16807N.f139792a;
        }

        public final void I1(RoomType roomType, String str) {
            Object obj;
            C17542s.j(roomType, "roomType");
            C17542s.j(str, "roomTitle");
            if (roomType == RoomType.OTHER) {
                obj = Kreativ.Capture.V2.m.INSTANCE;
            } else {
                this.f123802J0.t(roomType);
                this.f123802J0.s(str);
                obj = Kreativ.Capture.V2.i.INSTANCE;
            }
            this.f123813R.postValue(obj);
        }

        public final void J0() {
            File file = new File(this.f123799I.b(r1()), "mosaic.png");
            if (file.exists()) {
                this.f123815T.postValue(file);
                return;
            }
            File file2 = new File(this.f123799I.e(r1()), "mosaic.png");
            if (file2.exists()) {
                this.f123815T.postValue(file2);
            }
        }

        public final void J1(RoomType roomType, String str) {
            C17542s.j(roomType, "roomType");
            C17542s.j(str, "roomTitle");
            this.f123802J0.t(roomType);
            this.f123802J0.s(str);
            this.f123813R.postValue(Kreativ.Capture.V2.i.INSTANCE);
        }

        public final void K0() {
            this.f123813R.setValue(null);
        }

        public final void L0(Context context) {
            C17542s.j(context, "context");
            C13310b.a(this.f123791E, new b(this, (C17164e<? super b>) null));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: dI.e<? super XH.N>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object L1(com.sugarcube.app.base.ui.capturev2.C14228q r12, dI.C17164e<? super XH.C16807N> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.sugarcube.app.base.ui.capturev2.h1.g
                if (r0 == 0) goto L_0x0013
                r0 = r13
                com.sugarcube.app.base.ui.capturev2.h1$g r0 = (com.sugarcube.app.base.ui.capturev2.h1.g) r0
                int r1 = r0.f123874l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f123874l = r1
                goto L_0x0018
            L_0x0013:
                com.sugarcube.app.base.ui.capturev2.h1$g r0 = new com.sugarcube.app.base.ui.capturev2.h1$g
                r0.<init>(r11, r13)
            L_0x0018:
                java.lang.Object r1 = r0.f123872j
                java.lang.Object r2 = eI.C17187b.f()
                int r3 = r0.f123874l
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L_0x006f
                if (r3 == r7) goto L_0x005e
                if (r3 == r6) goto L_0x0049
                if (r3 == r5) goto L_0x0049
                if (r3 != r4) goto L_0x0041
                long r12 = r0.f123871i
                java.lang.Object r2 = r0.f123867e
                dI.e r2 = (dI.C17164e) r2
                java.lang.Object r2 = r0.f123866d
                com.sugarcube.app.base.ui.capturev2.q r2 = (com.sugarcube.app.base.ui.capturev2.C14228q) r2
                java.lang.Object r0 = r0.f123865c
                com.sugarcube.app.base.ui.capturev2.h1 r0 = (com.sugarcube.app.base.ui.capturev2.h1) r0
                XH.y.b(r1)
                goto L_0x00e8
            L_0x0041:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0049:
                java.lang.Object r12 = r0.f123868f
                com.sugarcube.app.base.ui.capturev2.d r12 = (com.sugarcube.app.base.ui.capturev2.C14202d) r12
                java.lang.Object r12 = r0.f123867e
                dI.e r12 = (dI.C17164e) r12
                java.lang.Object r13 = r0.f123866d
                com.sugarcube.app.base.ui.capturev2.q r13 = (com.sugarcube.app.base.ui.capturev2.C14228q) r13
                java.lang.Object r3 = r0.f123865c
                com.sugarcube.app.base.ui.capturev2.h1 r3 = (com.sugarcube.app.base.ui.capturev2.h1) r3
                XH.y.b(r1)
                goto L_0x00c8
            L_0x005e:
                java.lang.Object r12 = r0.f123867e
                r13 = r12
                dI.e r13 = (dI.C17164e) r13
                java.lang.Object r12 = r0.f123866d
                com.sugarcube.app.base.ui.capturev2.q r12 = (com.sugarcube.app.base.ui.capturev2.C14228q) r12
                java.lang.Object r3 = r0.f123865c
                com.sugarcube.app.base.ui.capturev2.h1 r3 = (com.sugarcube.app.base.ui.capturev2.h1) r3
                XH.y.b(r1)
                goto L_0x0091
            L_0x006f:
                XH.y.b(r1)
                com.sugarcube.app.base.ui.capturev2.S0 r1 = r11.f123802J0
                boolean r1 = r1.k()
                if (r1 == 0) goto L_0x0114
                if (r12 == 0) goto L_0x007f
                r12.T()
            L_0x007f:
                r0.f123865c = r11
                r0.f123866d = r12
                r0.f123867e = r13
                r0.f123874l = r7
                r7 = 200(0xc8, double:9.9E-322)
                java.lang.Object r1 = QJ.C16297b0.b(r7, r0)
                if (r1 != r2) goto L_0x0090
                return r2
            L_0x0090:
                r3 = r11
            L_0x0091:
                if (r12 == 0) goto L_0x0096
                r12.S()
            L_0x0096:
                com.sugarcube.app.base.ui.capturev2.d r1 = r3.f123804K0
                if (r1 == 0) goto L_0x00af
                r0.f123865c = r3
                r0.f123866d = r12
                r0.f123867e = r13
                r0.f123868f = r1
                r0.f123874l = r6
                java.lang.Object r1 = r1.z(r12, r0)
                if (r1 != r2) goto L_0x00ab
                return r2
            L_0x00ab:
                r10 = r13
                r13 = r12
                r12 = r10
                goto L_0x00c8
            L_0x00af:
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                r8 = 2
                long r7 = r7.toMillis(r8)
                r0.f123865c = r3
                r0.f123866d = r12
                r0.f123867e = r13
                r0.f123868f = r1
                r0.f123874l = r5
                java.lang.Object r1 = QJ.C16297b0.b(r7, r0)
                if (r1 != r2) goto L_0x00ab
                return r2
            L_0x00c8:
                long r7 = java.lang.System.currentTimeMillis()
                PE.a r1 = r3.f123795G
                com.sugarcube.app.base.ui.capturev2.S0 r5 = r3.f123802J0
                r0.f123865c = r3
                r0.f123866d = r13
                r0.f123867e = r12
                r12 = 0
                r0.f123869g = r12
                r0.f123871i = r7
                r0.f123870h = r12
                r0.f123874l = r4
                java.lang.Object r12 = r1.u(r5, r0)
                if (r12 != r2) goto L_0x00e6
                return r2
            L_0x00e6:
                r0 = r3
                r12 = r7
            L_0x00e8:
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "saveFile ("
                r12.append(r13)
                r12.append(r1)
                java.lang.String r13 = "ms)"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r13 = 0
                R1(r0, r12, r13, r6, r13)
                com.sugarcube.app.base.ui.capturev2.N r12 = com.sugarcube.app.base.ui.capturev2.N.Results
                r0.Z1(r12)
                androidx.lifecycle.K<XH.N> r12 = r0.f123811P
                XH.N r13 = XH.C16807N.f139792a
                r12.postValue(r13)
                goto L_0x012e
            L_0x0114:
                com.sugarcube.app.base.ui.capturev2.S0 r12 = r11.f123802J0
                r12.u(r7)
                boolean r12 = r11.P()
                if (r12 == 0) goto L_0x0122
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r12 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN_AGAIN
                goto L_0x0124
            L_0x0122:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r12 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN_AGAIN
            L_0x0124:
                r11.e2(r12)
                androidx.lifecycle.K<java.lang.Object> r12 = r11.f123813R
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$o r13 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.o.INSTANCE
                r12.postValue(r13)
            L_0x012e:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.L1(com.sugarcube.app.base.ui.capturev2.q, dI.e):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object M0(com.sugarcube.app.base.ui.capturev2.C14228q r21, nI.p<? super android.graphics.Bitmap, ? super com.sugarcube.app.base.ui.capturev2.W, android.graphics.Bitmap> r22, dI.C17164e<? super android.graphics.Bitmap> r23) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r23
                boolean r3 = r2 instanceof com.sugarcube.app.base.ui.capturev2.h1.c
                if (r3 == 0) goto L_0x0019
                r3 = r2
                com.sugarcube.app.base.ui.capturev2.h1$c r3 = (com.sugarcube.app.base.ui.capturev2.h1.c) r3
                int r4 = r3.f123849t
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L_0x0019
                int r4 = r4 - r5
                r3.f123849t = r4
                goto L_0x001e
            L_0x0019:
                com.sugarcube.app.base.ui.capturev2.h1$c r3 = new com.sugarcube.app.base.ui.capturev2.h1$c
                r3.<init>(r0, r2)
            L_0x001e:
                java.lang.Object r4 = r3.f123847r
                java.lang.Object r5 = eI.C17187b.f()
                int r6 = r3.f123849t
                r7 = 2
                r8 = 1
                if (r6 == 0) goto L_0x00bf
                if (r6 == r8) goto L_0x0065
                if (r6 != r7) goto L_0x005d
                java.lang.Object r1 = r3.f123841l
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                java.lang.Object r2 = r3.f123840k
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                java.lang.Object r2 = r3.f123839j
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                java.lang.Object r2 = r3.f123838i
                com.sugarcube.app.base.ui.capturev2.X r2 = (com.sugarcube.app.base.ui.capturev2.X) r2
                java.lang.Object r5 = r3.f123837h
                com.sugarcube.app.base.ui.capturev2.X r5 = (com.sugarcube.app.base.ui.capturev2.X) r5
                java.lang.Object r5 = r3.f123836g
                com.sugarcube.app.base.ui.capturev2.X r5 = (com.sugarcube.app.base.ui.capturev2.X) r5
                java.lang.Object r5 = r3.f123835f
                dI.e r5 = (dI.C17164e) r5
                java.lang.Object r5 = r3.f123834e
                nI.p r5 = (nI.p) r5
                java.lang.Object r6 = r3.f123833d
                com.sugarcube.app.base.ui.capturev2.q r6 = (com.sugarcube.app.base.ui.capturev2.C14228q) r6
                java.lang.Object r3 = r3.f123832c
                com.sugarcube.app.base.ui.capturev2.h1 r3 = (com.sugarcube.app.base.ui.capturev2.h1) r3
                XH.y.b(r4)
                r8 = r1
                r1 = r5
                goto L_0x0177
            L_0x005d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0065:
                int r1 = r3.f123846q
                int r2 = r3.f123845p
                int r6 = r3.f123844o
                java.lang.Object r7 = r3.f123843n
                com.sugarcube.app.base.ui.capturev2.q r7 = (com.sugarcube.app.base.ui.capturev2.C14228q) r7
                java.lang.Object r9 = r3.f123842m
                com.sugarcube.app.base.ui.capturev2.q r9 = (com.sugarcube.app.base.ui.capturev2.C14228q) r9
                java.lang.Object r10 = r3.f123841l
                android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
                java.lang.Object r11 = r3.f123840k
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                java.lang.Object r12 = r3.f123839j
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
                java.lang.Object r13 = r3.f123838i
                com.sugarcube.app.base.ui.capturev2.X r13 = (com.sugarcube.app.base.ui.capturev2.X) r13
                java.lang.Object r14 = r3.f123837h
                com.sugarcube.app.base.ui.capturev2.X r14 = (com.sugarcube.app.base.ui.capturev2.X) r14
                java.lang.Object r15 = r3.f123836g
                com.sugarcube.app.base.ui.capturev2.X r15 = (com.sugarcube.app.base.ui.capturev2.X) r15
                java.lang.Object r8 = r3.f123835f
                dI.e r8 = (dI.C17164e) r8
                r21 = r1
                java.lang.Object r1 = r3.f123834e
                nI.p r1 = (nI.p) r1
                r22 = r1
                java.lang.Object r1 = r3.f123833d
                com.sugarcube.app.base.ui.capturev2.q r1 = (com.sugarcube.app.base.ui.capturev2.C14228q) r1
                r23 = r1
                java.lang.Object r1 = r3.f123832c
                com.sugarcube.app.base.ui.capturev2.h1 r1 = (com.sugarcube.app.base.ui.capturev2.h1) r1
                XH.y.b(r4)
                r4 = r22
                r16 = r12
                r17 = r13
                r0 = 1
                r12 = r5
                r13 = r10
                r5 = r15
                r10 = r3
                r3 = r9
                r15 = r11
                r9 = r2
                r11 = r6
                r6 = r8
                r8 = r21
                r2 = r23
                r19 = r7
                r7 = r1
                r1 = r19
                goto L_0x0138
            L_0x00bf:
                XH.y.b(r4)
                com.sugarcube.app.base.ui.capturev2.S0 r4 = r0.f123802J0
                com.sugarcube.app.base.ui.capturev2.X r4 = r4.a()
                r6 = 0
                if (r4 == 0) goto L_0x0185
                android.graphics.Bitmap r8 = r4.d()
                if (r8 == 0) goto L_0x0185
                r6 = 0
                if (r1 == 0) goto L_0x0148
                r7 = r0
                r10 = r3
                r0 = r4
                r15 = r0
                r17 = r5
                r9 = r6
                r11 = r9
                r12 = r8
                r13 = r12
                r14 = r13
                r3 = r1
                r5 = r15
                r8 = r11
                r4 = r22
                r6 = r2
                r2 = r3
            L_0x00e6:
                com.sugarcube.app.base.ui.capturev2.W r18 = r1.H()
                if (r18 != 0) goto L_0x0144
                r18 = r8
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r21 = r11
                r22 = r12
                r11 = 1
                long r11 = r8.toMillis(r11)
                r10.f123832c = r7
                r10.f123833d = r2
                r10.f123834e = r4
                r10.f123835f = r6
                r10.f123836g = r5
                r10.f123837h = r0
                r10.f123838i = r15
                r10.f123839j = r14
                r10.f123840k = r13
                r8 = r22
                r10.f123841l = r8
                r10.f123842m = r3
                r10.f123843n = r1
                r22 = r0
                r0 = r21
                r10.f123844o = r0
                r10.f123845p = r9
                r0 = r18
                r10.f123846q = r0
                r0 = 1
                r10.f123849t = r0
                java.lang.Object r11 = QJ.C16297b0.b(r11, r10)
                r12 = r17
                if (r11 != r12) goto L_0x012c
                return r12
            L_0x012c:
                r11 = r21
                r16 = r14
                r17 = r15
                r14 = r22
                r15 = r13
                r13 = r8
                r8 = r18
            L_0x0138:
                r0 = r14
                r14 = r16
                r19 = r17
                r17 = r12
                r12 = r13
                r13 = r15
                r15 = r19
                goto L_0x00e6
            L_0x0144:
                r8 = r12
                r0 = r20
                goto L_0x017a
            L_0x0148:
                r12 = r5
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r9 = 3
                long r9 = r0.toMillis(r9)
                r0 = r20
                r3.f123832c = r0
                r3.f123833d = r1
                r1 = r22
                r3.f123834e = r1
                r3.f123835f = r2
                r3.f123836g = r4
                r3.f123837h = r4
                r3.f123838i = r4
                r3.f123839j = r8
                r3.f123840k = r8
                r3.f123841l = r8
                r3.f123844o = r6
                r3.f123845p = r6
                r3.f123849t = r7
                java.lang.Object r2 = QJ.C16297b0.b(r9, r3)
                if (r2 != r12) goto L_0x0176
                return r12
            L_0x0176:
                r2 = r4
            L_0x0177:
                r4 = r1
                r15 = r2
                r12 = r8
            L_0x017a:
                com.sugarcube.app.base.ui.capturev2.W r1 = r15.e()
                java.lang.Object r1 = r4.invoke(r12, r1)
                r6 = r1
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            L_0x0185:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.M0(com.sugarcube.app.base.ui.capturev2.q, nI.p, dI.e):java.lang.Object");
        }

        public final void M1() {
            Object obj;
            if (f1() == N.Exit) {
                this.f123811P.postValue(C16807N.f139792a);
                return;
            }
            if (f1() == N.PermissionDone) {
                Z1(P() ? N.CamPano : N.ArPano);
            }
            if (f1() == N.PanoCheck) {
                Z1(N.Scan);
            }
            int i10 = a.f123822a[f1().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6) {
                obj = i10 != 7 ? Kreativ.Capture.V2.k.INSTANCE : Kreativ.Capture.V2.k.INSTANCE;
            } else if (P()) {
                String uuid = m1().toString();
                C17542s.i(uuid, "toString(...)");
                obj = new Kreativ.Capture.V2.Landscape(uuid);
            } else {
                String uuid2 = m1().toString();
                C17542s.i(uuid2, "toString(...)");
                obj = new Kreativ.Capture.V2.Portrait(uuid2);
            }
            this.f123813R.postValue(obj);
        }

        public final ArControl N0() {
            int i10 = a.f123822a[f1().ordinal()];
            boolean z10 = true;
            if (!(i10 == 1 || i10 == 2)) {
                z10 = false;
            }
            if (z10) {
                if (this.f123786B0) {
                    this.f123802J0.g().i(this.f123790D0);
                    this.f123802J0.g().h(this.f123792E0);
                }
                Q a10 = g0.a(this);
                S0 s02 = this.f123802J0;
                FirebaseInteractions firebaseInteractions = this.f123807M;
                String absolutePath = new File(this.f123799I.b(r1()), "rgb.mp4").getAbsolutePath();
                C17542s.i(absolutePath, "getAbsolutePath(...)");
                this.f123804K0 = new C14202d(a10, s02, firebaseInteractions, absolutePath, this.f123785A0, this.f123786B0, new c1(this), new d1(this), new e1(this));
            } else {
                this.f123804K0 = null;
            }
            C14202d dVar = this.f123804K0;
            R1(this, "getArControl useAr=" + z10 + " " + dVar, (Throwable) null, 2, (Object) null);
            return this.f123804K0;
        }

        public final void N1() {
            this.f123813R.postValue(Kreativ.Capture.V2.a.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            if (r0 != 4) goto L_0x005f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void O1(com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r6) {
            /*
                r5 = this;
                java.lang.String r0 = "stepEnum"
                kotlin.jvm.internal.C17542s.j(r6, r0)
                com.sugarcube.app.base.ui.capturev2.N r0 = r5.f1()
                int[] r1 = com.sugarcube.app.base.ui.capturev2.h1.a.f123822a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L_0x0034
                r2 = 0
                r3 = 4
                r4 = 2
                if (r0 == r4) goto L_0x001c
                if (r0 == r3) goto L_0x0034
                goto L_0x005f
            L_0x001c:
                int[] r0 = com.sugarcube.app.base.ui.capturev2.h1.a.f123823b
                int r6 = r6.ordinal()
                r6 = r0[r6]
                if (r6 == r1) goto L_0x0031
                if (r6 == r4) goto L_0x0031
                r0 = 3
                if (r6 == r0) goto L_0x002e
                if (r6 == r3) goto L_0x002e
                goto L_0x005f
            L_0x002e:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$e r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.e.INSTANCE
                goto L_0x005f
            L_0x0031:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$b r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.b.INSTANCE
                goto L_0x005f
            L_0x0034:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r6 = r5.p1()
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r0 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_1
                if (r6 != r0) goto L_0x0044
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r6 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_2
                r5.e2(r6)
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$o r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.o.INSTANCE
                goto L_0x005f
            L_0x0044:
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r6 = r5.p1()
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r0 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_GET_READY_1
                if (r6 != r0) goto L_0x0054
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r6 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_GET_READY_2
                r5.e2(r6)
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$o r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.o.INSTANCE
                goto L_0x005f
            L_0x0054:
                boolean r6 = r5.P()
                if (r6 == 0) goto L_0x005d
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$f r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.f.INSTANCE
                goto L_0x005f
            L_0x005d:
                com.sugarcube.app.base.navigation.Kreativ$Capture$V2$c r2 = com.sugarcube.app.base.navigation.Kreativ.Capture.V2.c.INSTANCE
            L_0x005f:
                if (r2 == 0) goto L_0x0066
                androidx.lifecycle.K<java.lang.Object> r6 = r5.f123813R
                r6.postValue(r2)
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.h1.O1(com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum):void");
        }

        public boolean P() {
            return this.f123802J0.j();
        }

        public final void P1(UUID uuid, Context context) {
            S0 s02;
            C17542s.j(uuid, "sessionUuid");
            C17542s.j(context, "context");
            int i10 = this.f123794F0;
            boolean z10 = this.f123786B0;
            int i11 = this.f123788C0;
            int i12 = this.f123790D0;
            int i13 = this.f123792E0;
            String str = null;
            R1(this, "load: jpegQuality=" + i10 + " enableVideoEncoder=" + z10 + " videoEncoderFPS=" + i11 + " (" + i12 + ") videoEncoderBitrate=" + i13, (Throwable) null, 2, (Object) null);
            CaptureSession n10 = this.f123795G.n();
            if (n10 == null || !C17542s.e(n10.getSessionUuid(), uuid) || !(n10 instanceof S0)) {
                Instant now = Instant.now();
                Object systemService = context.getSystemService("batterymanager");
                C17542s.h(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                int intProperty = ((BatteryManager) systemService).getIntProperty(4);
                if (this.f123819Z) {
                    str = this.f123795G.o();
                }
                String str2 = str;
                if (str2 != null) {
                    S0.a aVar = S0.f123574C;
                    C17542s.g(now);
                    s02 = aVar.b(uuid, now, str2, aVar.e(now, intProperty, this.f123787C.getRegion(), this.f123786B0, this.f123796G0, this.f123798H0, this.f123785A0, this.f123797H.getEnabledFeatures(), this.f123801J));
                } else {
                    S0.a aVar2 = S0.f123574C;
                    C17542s.g(now);
                    s02 = aVar2.a(uuid, now, aVar2.c(now, intProperty, this.f123787C.getRegion(), this.f123786B0, false, this.f123798H0, this.f123785A0, this.f123797H.getEnabledFeatures(), this.f123801J));
                }
                this.f123802J0 = s02;
                this.f123795G.v(s02);
                return;
            }
            this.f123802J0 = (S0) n10;
        }

        public final void Q1(String str, Throwable th2) {
            C17542s.j(str, "msg");
            this.f123795G.p(this.f123802J0.getUuid(), str, th2);
        }

        public final F<Boolean> R0() {
            return this.f123808M0;
        }

        public final long S0() {
            return this.f123800I0;
        }

        public final VideoAssetRepository T0() {
            return this.f123789D;
        }

        public final String V0() {
            return this.f123802J0.getCaptureStrategy();
        }

        public final void V1() {
            C14202d dVar = this.f123804K0;
            if (dVar != null) {
                dVar.u();
            }
            C16877v.L(h1(), new b1());
            this.f123795G.r(this.f123802J0);
        }

        public final String W0() {
            return this.f123802J0.getCaptureType();
        }

        public final String X0() {
            return this.f123787C.getCountry();
        }

        public final boolean Y0() {
            return this.f123821z0;
        }

        public final boolean Z0() {
            return this.f123820y0;
        }

        public final F<C16807N> a1() {
            return this.f123812Q;
        }

        public final void a2(C14541c cVar) {
            C17542s.j(cVar, "state");
            e1().f(cVar.name());
        }

        public final boolean b1() {
            return this.f123802J0.j();
        }

        public final void b2(C17631a<C16807N> aVar) {
            C17542s.j(aVar, "listener");
            this.f123806L0 = aVar;
        }

        public final int c1() {
            return this.f123794F0;
        }

        public final String d1() {
            return this.f123787C.getLanguage();
        }

        public final L e1() {
            return this.f123802J0.b();
        }

        public final N f1() {
            return this.f123802J0.c();
        }

        public final F<Object> g1() {
            return this.f123814S;
        }

        public final List<X> h1() {
            return this.f123802J0.d();
        }

        public final File i1(int i10, String str) {
            C17542s.j(str, "ext");
            return new File(this.f123799I.b(r1()), C13339a.f113989j.a(i10, str));
        }

        public final F<File> k1() {
            return this.f123816U;
        }

        public final String l1() {
            return this.f123802J0.getRoomTitle();
        }

        public final UUID m1() {
            return this.f123802J0.getSessionUuid();
        }

        public final F<C15083h> n1() {
            return this.f123810O;
        }

        public final q o1() {
            return this.f123787C;
        }

        public final TutorialStepEnum p1() {
            return this.f123802J0.e();
        }

        public final void p2() {
            kotlin.jvm.internal.K k10 = new kotlin.jvm.internal.K();
            this.f123808M0.postValue(null);
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new j(this, k10, (C17164e<? super j>) null), 3, (Object) null);
            F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new k(this, k10, (C17164e<? super k>) null), 3, (Object) null);
        }

        public final String q1() {
            return this.f123802J0.f();
        }

        public final void q2(C14540b bVar, C14542d dVar, List<? extends Trackable> list) {
            List list2;
            C17542s.j(bVar, "stepEnum");
            C17542s.j(dVar, "action");
            Event event = bVar.b().get(dVar);
            if (event != null) {
                if (list == null || (list2 = C16877v.w1(list)) == null) {
                    list2 = new ArrayList();
                }
                list2.add(this.f123802J0);
                this.f123793F.track(event, dVar.b(), (List<? extends Trackable>) list2);
            }
        }

        public final UUID r1() {
            return this.f123802J0.getUuid();
        }

        public final F<Boolean> s1() {
            return this.f123818Y;
        }

        public final void s2(C17631a<C16807N> aVar) {
            C17542s.j(aVar, "callback");
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new l(this, aVar, (C17164e<? super l>) null), 3, (Object) null);
        }

        public final void t1() {
            this.f123813R.postValue(Kreativ.Capture.V2.d.INSTANCE);
        }

        public final void u1() {
            F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
        }

        public final void v1() {
            y1(this, (C14540b) null, 1, (Object) null);
        }

        public final void w1() {
            F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
        }

        public final void x1(C14540b bVar) {
            i2(new f1(bVar, this));
        }
    }
