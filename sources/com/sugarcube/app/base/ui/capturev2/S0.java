package com.sugarcube.app.base.ui.capturev2;

import NE.C13286b;
import OE.C13313e;
import PE.C13339a;
import WK.y;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16870n;
import YH.X;
import android.os.Build;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.sugarcube.app.base.capture.CaptureSession;
import com.sugarcube.app.base.data.model.AndroidQuality;
import com.sugarcube.app.base.data.model.FloorDetection;
import com.sugarcube.app.base.data.model.PanoMeta;
import com.sugarcube.app.base.data.model.QualityMeta;
import com.sugarcube.app.base.data.model.QualityWarnings;
import com.sugarcube.app.base.data.model.VideoMeta;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.app.base.ui.hybrid.E0;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SessionMeta;
import hF.C14539a;
import jI.C17416c;
import java.io.File;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bU\b\b\u0018\u0000 £\u00012\u00020\u0001:\u0001IB£\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J'\u00107\u001a\u0002062\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u0002062\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u0002062\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b;\u00108J\u001f\u0010<\u001a\u0002062\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b<\u0010:J\u0017\u0010=\u001a\u0002062\u0006\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b=\u0010>J'\u0010?\u001a\u0002062\u0006\u00103\u001a\u00020/2\u0006\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b?\u00108J\u0017\u0010@\u001a\u0002062\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bB\u0010CJ+\u0010G\u001a\u001e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\t0Dj\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\t`FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u0004\u0018\u00010#¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010Q\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010OHÖ\u0003¢\u0006\u0004\bQ\u0010RR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\bI\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010LR\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\bb\u0010a\u001a\u0004\bc\u0010LR\u001a\u0010\f\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010LR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bf\u0010a\u001a\u0004\bg\u0010LR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b1\u0010a\u001a\u0004\bh\u0010LR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bi\u0010LR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b=\u0010a\u001a\u0004\bn\u0010LR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u0010a\u001a\u0004\bo\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b9\u0010a\u001a\u0004\bp\u0010LR\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b?\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010\u0017\u001a\u00020\t8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b<\u0010a\u001a\u0004\bv\u0010L\"\u0004\bw\u0010xR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010y\u001a\u0004\bX\u0010z\"\u0004\b{\u0010|R*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b{\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R&\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\bw\u0010\u0001\u001a\u0005\b\u0001\u0010N\"\u0006\b\u0001\u0010\u0001R&\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\bt\u0010\u0001\u001a\u0005\b`\u0010\u0001\"\u0006\b\u0001\u0010\u0001R%\u0010 \u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010]\u001a\u0004\bj\u0010_\"\u0006\b\u0001\u0010\u0001R%\u0010!\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010]\u001a\u0004\bf\u0010_\"\u0006\b\u0001\u0010\u0001R+\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010}\u001a\u0004\b\\\u0010\"\u0006\b\u0001\u0010\u0001R\u001a\u0010&\u001a\u00020%8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bd\u0010\u0001R\u001a\u0010(\u001a\u00020'8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bV\u0010\u0001R\u001b\u0010*\u001a\u00020)8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010]R\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010]R)\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u00078V@VX\u000e¢\u0006\u000f\u001a\u0005\b\u0001\u0010_\"\u0006\b\u0001\u0010\u0001R)\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u00078V@VX\u000e¢\u0006\u000f\u001a\u0005\b \u0001\u0010_\"\u0006\b¡\u0001\u0010\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/S0;", "Lcom/sugarcube/app/base/capture/CaptureSession;", "Ljava/util/UUID;", "sessionUuid", "uuid", "Ljava/time/Instant;", "creation", "", "isLandscape", "", "ultraWideCameraId", "captureType", "captureStrategy", "captureMode", "panoConfiguration", "scanConfiguration", "", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "roomTitle", "Lcom/sugarcube/app/base/ui/capturev2/N;", "mode", "", "LhF/a;", "steps", "stepIndex", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "tutorialStep", "isStepDone", "warnOnExit", "", "Lcom/sugarcube/app/base/ui/capturev2/X;", "panoDataList", "Lcom/sugarcube/app/base/ui/capturev2/w1;", "videoData", "Lcom/sugarcube/app/base/ui/capturev2/L;", "metaBuilder", "Lcom/sugarcube/core/network/models/SessionMeta;", "sessionMeta", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Lcom/sugarcube/app/base/ui/capturev2/N;Ljava/util/List;ILcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;ZZLjava/util/List;Lcom/sugarcube/app/base/ui/capturev2/w1;Lcom/sugarcube/app/base/ui/capturev2/L;Lcom/sugarcube/core/network/models/SessionMeta;)V", "LPE/a;", "captureRepository", "Ljava/io/File;", "sourceDir", "i", "(LPE/a;Ljava/io/File;)Z", "destDir", "Lcom/squareup/moshi/t;", "moshi", "LXH/N;", "m", "(Ljava/io/File;Lcom/squareup/moshi/t;LPE/a;)V", "n", "(Ljava/io/File;Lcom/squareup/moshi/t;)V", "q", "p", "l", "(Ljava/io/File;)V", "o", "saveFiles", "(LPE/a;)V", "hasRequiredFiles", "(LPE/a;)Z", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "getValues", "()Ljava/util/HashMap;", "a", "()Lcom/sugarcube/app/base/ui/capturev2/X;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getSessionUuid", "()Ljava/util/UUID;", "b", "getUuid", "c", "Ljava/time/Instant;", "getCreation", "()Ljava/time/Instant;", "d", "Z", "j", "()Z", "e", "Ljava/lang/String;", "f", "getCaptureType", "g", "getCaptureStrategy", "h", "getCaptureMode", "getPanoConfiguration", "getScanConfiguration", "k", "Ljava/lang/Integer;", "getPrimaryImageCount", "()Ljava/lang/Integer;", "getPrimaryImageLens", "getPrimaryImageOrientation", "getScanOrientation", "Lcom/sugarcube/core/network/models/RoomType;", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "t", "(Lcom/sugarcube/core/network/models/RoomType;)V", "getRoomTitle", "s", "(Ljava/lang/String;)V", "Lcom/sugarcube/app/base/ui/capturev2/N;", "()Lcom/sugarcube/app/base/ui/capturev2/N;", "r", "(Lcom/sugarcube/app/base/ui/capturev2/N;)V", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "I", "getStepIndex", "setStepIndex", "(I)V", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "()Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "v", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;)V", "u", "(Z)V", "w", "setPanoDataList", "x", "Lcom/sugarcube/app/base/ui/capturev2/w1;", "()Lcom/sugarcube/app/base/ui/capturev2/w1;", "y", "Lcom/sugarcube/app/base/ui/capturev2/L;", "()Lcom/sugarcube/app/base/ui/capturev2/L;", "z", "Lcom/sugarcube/core/network/models/SessionMeta;", "getSessionMeta", "()Lcom/sugarcube/core/network/models/SessionMeta;", "A", "wasSaved", "B", "wasError", "value", "getSaved", "setSaved", "saved", "getHasError", "setHasError", "hasError", "C", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S0 implements CaptureSession {

    /* renamed from: C  reason: collision with root package name */
    public static final a f123574C = new a((DefaultConstructorMarker) null);

    /* renamed from: D  reason: collision with root package name */
    public static final int f123575D = 8;

    /* renamed from: A  reason: collision with root package name */
    private boolean f123576A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f123577B;

    /* renamed from: a  reason: collision with root package name */
    private final UUID f123578a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f123579b;

    /* renamed from: c  reason: collision with root package name */
    private final Instant f123580c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f123581d;

    /* renamed from: e  reason: collision with root package name */
    private final String f123582e;

    /* renamed from: f  reason: collision with root package name */
    private final String f123583f;

    /* renamed from: g  reason: collision with root package name */
    private final String f123584g;

    /* renamed from: h  reason: collision with root package name */
    private final String f123585h;

    /* renamed from: i  reason: collision with root package name */
    private final String f123586i;

    /* renamed from: j  reason: collision with root package name */
    private final String f123587j;

    /* renamed from: k  reason: collision with root package name */
    private final Integer f123588k;

    /* renamed from: l  reason: collision with root package name */
    private final String f123589l;

    /* renamed from: m  reason: collision with root package name */
    private final String f123590m;

    /* renamed from: n  reason: collision with root package name */
    private final String f123591n;

    /* renamed from: o  reason: collision with root package name */
    private RoomType f123592o;

    /* renamed from: p  reason: collision with root package name */
    private String f123593p;

    /* renamed from: q  reason: collision with root package name */
    private N f123594q;

    /* renamed from: r  reason: collision with root package name */
    private List<? extends C14539a> f123595r;

    /* renamed from: s  reason: collision with root package name */
    private int f123596s;

    /* renamed from: t  reason: collision with root package name */
    private TutorialStepEnum f123597t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f123598u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f123599v;

    /* renamed from: w  reason: collision with root package name */
    private List<X> f123600w;

    /* renamed from: x  reason: collision with root package name */
    private final w1 f123601x;

    /* renamed from: y  reason: collision with root package name */
    private final L f123602y;

    /* renamed from: z  reason: collision with root package name */
    private final SessionMeta f123603z;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J[\u0010'\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J[\u0010)\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/S0$a;", "", "<init>", "()V", "Ljava/time/Instant;", "creation", "", "captureStrategy", "captureMode", "panoConfiguration", "scanConfiguration", "", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "LOE/e;", "installationConfig", "batteryLevel", "region", "", "ownVideo", "forceLandscape", "swapRgb", "imageFormatJPEG", "", "optimizelyFlags", "Lcom/sugarcube/core/network/models/SessionMeta;", "d", "(Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LOE/e;ILjava/lang/String;ZZZZLjava/util/List;)Lcom/sugarcube/core/network/models/SessionMeta;", "Ljava/util/UUID;", "sessionUuid", "sessionMeta", "Lcom/sugarcube/app/base/ui/capturev2/S0;", "a", "(Ljava/util/UUID;Ljava/time/Instant;Lcom/sugarcube/core/network/models/SessionMeta;)Lcom/sugarcube/app/base/ui/capturev2/S0;", "ultraWideCameraId", "b", "(Ljava/util/UUID;Ljava/time/Instant;Ljava/lang/String;Lcom/sugarcube/core/network/models/SessionMeta;)Lcom/sugarcube/app/base/ui/capturev2/S0;", "c", "(Ljava/time/Instant;ILjava/lang/String;ZZZZLjava/util/List;LOE/e;)Lcom/sugarcube/core/network/models/SessionMeta;", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SessionMeta d(Instant instant, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, C13313e eVar, int i10, String str8, boolean z10, boolean z11, boolean z12, boolean z13, List<String> list) {
            int i11 = i10;
            String a10 = eVar.a();
            String b10 = eVar.b();
            String h10 = eVar.h();
            String k10 = eVar.k();
            String l10 = eVar.l();
            String str9 = l10;
            C17542s.i(l10, "<get-releaseVersion>(...)");
            String str10 = Build.MODEL;
            String str11 = str10;
            C17542s.i(str10, "MODEL");
            String format = DateTimeFormatter.ISO_INSTANT.format(instant);
            String str12 = format;
            C17542s.i(format, "format(...)");
            return new SessionMeta(SessionMeta.DATE_FORMAT_VERSION_CAPTURE_V2, "android", a10, b10, h10, k10, str9, str11, str12, str, str2, false, 0, 0, 0, 0, i11, str3, str4, num, str5, str6, str7, Build.MANUFACTURER, str8, Boolean.TRUE, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), list);
        }

        public final S0 a(UUID uuid, Instant instant, SessionMeta sessionMeta) {
            C17542s.j(uuid, "sessionUuid");
            C17542s.j(instant, "creation");
            C17542s.j(sessionMeta, "sessionMeta");
            return new S0(uuid, (UUID) null, instant, false, (String) null, "HYBRID", sessionMeta.getCaptureStrategy(), (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (RoomType) null, (String) null, (N) null, C14539a.f127497a.a(), 0, TutorialStepEnum.HY_GET_READY_1, false, false, (List) null, (w1) null, (L) null, sessionMeta, 32898962, (DefaultConstructorMarker) null);
        }

        public final S0 b(UUID uuid, Instant instant, String str, SessionMeta sessionMeta) {
            C17542s.j(uuid, "sessionUuid");
            C17542s.j(instant, "creation");
            C17542s.j(sessionMeta, "sessionMeta");
            return new S0(uuid, (UUID) null, instant, true, str, "ULTRAWIDE_LANDSCAPE", sessionMeta.getCaptureStrategy(), "CAMPANO", sessionMeta.getPanoConfiguration(), sessionMeta.getScanConfiguration(), sessionMeta.getPrimaryImageCount(), sessionMeta.getPrimaryImageLens(), sessionMeta.getPrimaryImageOrientation(), sessionMeta.getScanOrientation(), (RoomType) null, (String) null, (N) null, C14539a.f127497a.b(), 0, TutorialStepEnum.UW_GET_READY_1, false, false, (List) null, (w1) null, (L) null, sessionMeta, 32882690, (DefaultConstructorMarker) null);
        }

        public final SessionMeta c(Instant instant, int i10, String str, boolean z10, boolean z11, boolean z12, boolean z13, List<String> list, C13313e eVar) {
            C13313e eVar2 = eVar;
            C17542s.j(instant, "creation");
            C17542s.j(str, "region");
            C17542s.j(list, "optimizelyFlags");
            C17542s.j(eVar, "installationConfig");
            return d(instant, "ARPANO_ARSCAN_ARSTEP_ARSCAN", "ARPANO", (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, eVar2, i10, str, z10, z11, z12, z13, list);
        }

        public final SessionMeta e(Instant instant, int i10, String str, boolean z10, boolean z11, boolean z12, boolean z13, List<String> list, C13313e eVar) {
            C13313e eVar2 = eVar;
            C17542s.j(instant, "creation");
            C17542s.j(str, "region");
            C17542s.j(list, "optimizelyFlags");
            C17542s.j(eVar, "installationConfig");
            return d(instant, "CAMPANO_ARSCAN_ARSTEP_ARSCAN", "CAMPANO", "ULTRAWIDE_LANDSCAPE", "WIDE_LANDSCAPE", 1, "ULTRAWIDE", "LANDSCAPE", "LANDSCAPE", eVar2, i10, str, z10, z11, z12, z13, list);
        }

        private a() {
        }
    }

    public S0(UUID uuid, UUID uuid2, Instant instant, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, RoomType roomType, String str10, N n10, List<? extends C14539a> list, int i10, TutorialStepEnum tutorialStepEnum, boolean z11, boolean z12, List<X> list2, w1 w1Var, L l10, SessionMeta sessionMeta) {
        UUID uuid3 = uuid;
        UUID uuid4 = uuid2;
        Instant instant2 = instant;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        RoomType roomType2 = roomType;
        String str14 = str10;
        N n11 = n10;
        List<? extends C14539a> list3 = list;
        TutorialStepEnum tutorialStepEnum2 = tutorialStepEnum;
        List<X> list4 = list2;
        w1 w1Var2 = w1Var;
        L l11 = l10;
        SessionMeta sessionMeta2 = sessionMeta;
        C17542s.j(uuid3, "sessionUuid");
        C17542s.j(uuid4, "uuid");
        C17542s.j(instant2, "creation");
        C17542s.j(str11, "captureType");
        C17542s.j(str12, "captureStrategy");
        C17542s.j(str13, "captureMode");
        C17542s.j(roomType2, "roomType");
        C17542s.j(str14, "roomTitle");
        C17542s.j(n11, "mode");
        C17542s.j(list3, "steps");
        C17542s.j(tutorialStepEnum2, "tutorialStep");
        C17542s.j(list4, "panoDataList");
        C17542s.j(w1Var2, "videoData");
        C17542s.j(l11, "metaBuilder");
        C17542s.j(sessionMeta2, "sessionMeta");
        this.f123578a = uuid3;
        this.f123579b = uuid4;
        this.f123580c = instant2;
        this.f123581d = z10;
        this.f123582e = str;
        this.f123583f = str11;
        this.f123584g = str12;
        this.f123585h = str13;
        this.f123586i = str5;
        this.f123587j = str6;
        this.f123588k = num;
        this.f123589l = str7;
        this.f123590m = str8;
        this.f123591n = str9;
        this.f123592o = roomType2;
        this.f123593p = str14;
        this.f123594q = n11;
        this.f123595r = list3;
        this.f123596s = i10;
        this.f123597t = tutorialStepEnum2;
        this.f123598u = z11;
        this.f123599v = z12;
        this.f123600w = list4;
        this.f123601x = w1Var2;
        this.f123602y = l11;
        this.f123603z = sessionMeta2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean i(PE.C13339a r19, java.io.File r20) {
        /*
            r18 = this;
            java.io.File[] r0 = r20.listFiles()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0030
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            int r4 = r0.length
            r5 = r2
        L_0x0010:
            if (r5 >= r4) goto L_0x002a
            r6 = r0[r5]
            long r7 = r6.length()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0023
            java.lang.String r6 = r6.getName()
            goto L_0x0024
        L_0x0023:
            r6 = r1
        L_0x0024:
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x0010
        L_0x002a:
            java.util.List r0 = YH.C16877v.t0(r3)
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            java.util.List r0 = YH.C16877v.n()
        L_0x0034:
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0041:
            boolean r10 = r3.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x0099
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            int r12 = r10.hashCode()
            switch(r12) {
                case -1746615096: goto L_0x0083;
                case -461771400: goto L_0x0078;
                case 928447597: goto L_0x006d;
                case 1136990800: goto L_0x0061;
                case 1588375701: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x008b
        L_0x0056:
            java.lang.String r12 = "pano_0_meta.json"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x005f
            goto L_0x008b
        L_0x005f:
            r7 = r11
            goto L_0x0041
        L_0x0061:
            java.lang.String r11 = "rgb.mp4"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x006a
            goto L_0x008b
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0041
        L_0x006d:
            java.lang.String r12 = "video_meta.json"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x0076
            goto L_0x008b
        L_0x0076:
            r9 = r11
            goto L_0x0041
        L_0x0078:
            java.lang.String r12 = "capture_meta.json"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            r6 = r11
            goto L_0x0041
        L_0x0083:
            java.lang.String r12 = "session_meta.json"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x0097
        L_0x008b:
            java.lang.String r11 = "colorPano_0_"
            r12 = 2
            boolean r10 = HJ.C15854t.W(r10, r11, r2, r12, r1)
            if (r10 == 0) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0097:
            r8 = r11
            goto L_0x0041
        L_0x0099:
            r10 = r18
            boolean r1 = r10.f123581d
            if (r1 == 0) goto L_0x00a1
            r1 = r11
            goto L_0x00a2
        L_0x00a1:
            r1 = 5
        L_0x00a2:
            java.util.UUID r13 = r18.getUuid()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "hasRequiredFiles pano="
            r3.append(r12)
            r3.append(r4)
            java.lang.String r12 = "/"
            r3.append(r12)
            r3.append(r1)
            java.lang.String r12 = " video="
            r3.append(r12)
            r3.append(r5)
            java.lang.String r12 = "/1 c="
            r3.append(r12)
            r3.append(r6)
            java.lang.String r12 = " p="
            r3.append(r12)
            r3.append(r7)
            java.lang.String r12 = " s="
            r3.append(r12)
            r3.append(r8)
            java.lang.String r12 = " v="
            r3.append(r12)
            r3.append(r9)
            java.lang.String r14 = r3.toString()
            r16 = 4
            r17 = 0
            r15 = 0
            r12 = r19
            PE.C13339a.q(r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x00fe
            if (r7 == 0) goto L_0x00fe
            if (r8 == 0) goto L_0x00fe
            if (r9 == 0) goto L_0x00fe
            if (r5 != r11) goto L_0x00fe
            if (r4 != r1) goto L_0x00fe
            r2 = r11
        L_0x00fe:
            if (r2 != 0) goto L_0x011d
            java.util.UUID r4 = r18.getUuid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hasRequiredFiles failed "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r19
            PE.C13339a.q(r3, r4, r5, r6, r7, r8)
        L_0x011d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.S0.i(PE.a, java.io.File):boolean");
    }

    private final void l(File file) {
        this.f123602y.e(new File(file, "capture_meta.json"));
    }

    private final void m(File file, t tVar, C13339a aVar) {
        n(file, tVar);
        q(file, tVar, aVar);
        p(file, tVar);
        l(file);
        o(file, tVar, aVar);
    }

    private final void n(File file, t tVar) {
        Throwable th2;
        ArrayList arrayList = r3;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = r4;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = r5;
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = r6;
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = r7;
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = r8;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = r9;
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = r10;
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = r11;
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = r12;
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = r13;
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = r14;
        ArrayList arrayList24 = new ArrayList();
        ArrayList arrayList25 = r15;
        ArrayList arrayList26 = new ArrayList();
        ArrayList arrayList27 = r16;
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = r17;
        ArrayList arrayList30 = new ArrayList();
        ArrayList arrayList31 = r18;
        ArrayList arrayList32 = new ArrayList();
        PanoMeta panoMeta = new PanoMeta(arrayList, arrayList3, arrayList5, arrayList7, arrayList9, arrayList11, arrayList13, arrayList15, arrayList17, arrayList19, arrayList21, arrayList23, arrayList25, arrayList27, arrayList29, arrayList31);
        int i10 = 0;
        for (X x10 : this.f123600w) {
            panoMeta.getPoseIndexes().add(Integer.valueOf(x10.g() + i10));
            panoMeta.getShutterSpeeds().add(Float.valueOf(0.0f));
            panoMeta.getIso().add(Float.valueOf(0.0f));
            panoMeta.getEvOffsets().add(Float.valueOf(0.0f));
            panoMeta.getLensPosition().add(Float.valueOf(0.0f));
            panoMeta.getExposureBias().add(0);
            panoMeta.getWhiteBalanceGains().add(0);
            panoMeta.getMaxWhiteBalanceGain().add(new float[0]);
            panoMeta.getGrayWorldWhiteBalanceGain().add(new float[0]);
            panoMeta.getWhiteBalanceChromacity().add(new float[0]);
            panoMeta.getWhiteBalanceTemperature().add(new float[0]);
            panoMeta.getAperture().add(Float.valueOf(0.0f));
            panoMeta.getAmbientIntensity().add(Float.valueOf(0.0f));
            panoMeta.getAmbientColorTemperature().add(Float.valueOf(0.0f));
            panoMeta.getAnchorPose().add(new float[0]);
            panoMeta.getStates().add(x10.h());
            i10 += x10.f();
        }
        q q10 = q.q(y.c(z.g(new File(file, "pano_0_meta.json"), false, 1, (Object) null)));
        try {
            tVar.c(PanoMeta.class).toJson(q10, panoMeta);
            C16807N n10 = C16807N.f139792a;
            C17416c.a(q10, (Throwable) null);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C17416c.a(q10, th2);
            throw th4;
        }
    }

    private final void o(File file, t tVar, C13339a aVar) {
        long j10;
        float f10;
        Throwable th2;
        long j11;
        File file2 = file;
        try {
            j10 = new File(file2, "rgb.mp4").length();
        } catch (Throwable unused) {
            j10 = 0;
        }
        long j12 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                j11 = new File(file2, C13339a.C2807a.b(C13339a.f113989j, i10, (String) null, 2, (Object) null)).length();
            } catch (Throwable unused2) {
                j11 = 0;
            }
            j12 += j11;
        }
        L l10 = this.f123602y;
        int[] h10 = l10.d().h();
        int T02 = C16870n.T0(h10);
        int length = h10.length;
        float[] fArr = new float[length];
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            if (i11 >= length) {
                break;
            }
            if (T02 > 0) {
                f10 = ((float) h10[i11]) / ((float) T02);
            }
            fArr[i11] = f10;
            i11++;
        }
        int c10 = l10.c();
        float f11 = (float) 1000000;
        float[] fArr2 = fArr;
        int i12 = T02;
        AndroidQuality androidQuality = new AndroidQuality(fArr2, h10, Integer.valueOf(c10), 0, l10.d().c(), (float[]) null, l10.d().g(), 0.0f, 0.0f, (int[]) null, 0, 0, 0, 0.0f, 0.0f, false, false, false, false, (((float) l10.d().f()) / ((float) l10.c())) / f11, (((float) l10.d().e()) / ((float) l10.c())) / f11, (((float) l10.d().d()) / ((float) l10.c())) / f11, j12, j10, 524200, (DefaultConstructorMarker) null);
        if (i12 > 0) {
            f10 = ((float) (i12 - h10[1])) / ((float) i12);
        }
        QualityMeta qualityMeta = new QualityMeta(new QualityWarnings(f10, fArr2[3], fArr2[5], 0.0f, 0.0f, 24, (DefaultConstructorMarker) null), androidQuality, (FloorDetection) null, 4, (DefaultConstructorMarker) null);
        C13339a.q(aVar, getUuid(), "saveQualityMeta " + qualityMeta, (Throwable) null, 4, (Object) null);
        q q10 = q.q(y.c(z.g(new File(file2, "quality_meta.json"), false, 1, (Object) null)));
        try {
            tVar.c(QualityMeta.class).toJson(q10, qualityMeta);
            C16807N n10 = C16807N.f139792a;
            C17416c.a(q10, (Throwable) null);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C17416c.a(q10, th2);
            throw th4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        jI.C17416c.a(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p(java.io.File r4, com.squareup.moshi.t r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "session_meta.json"
            r0.<init>(r4, r1)
            r4 = 0
            r1 = 1
            r2 = 0
            WK.L r4 = WK.z.g(r0, r4, r1, r2)
            WK.f r4 = WK.y.c(r4)
            com.squareup.moshi.q r4 = com.squareup.moshi.q.q(r4)
            java.lang.Class<com.sugarcube.core.network.models.SessionMeta> r0 = com.sugarcube.core.network.models.SessionMeta.class
            com.squareup.moshi.f r5 = r5.c(r0)     // Catch:{ all -> 0x0027 }
            com.sugarcube.core.network.models.SessionMeta r0 = r3.f123603z     // Catch:{ all -> 0x0027 }
            r5.toJson((com.squareup.moshi.q) r4, r0)     // Catch:{ all -> 0x0027 }
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x0027 }
            jI.C17416c.a(r4, r2)
            return
        L_0x0027:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            jI.C17416c.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.S0.p(java.io.File, com.squareup.moshi.t):void");
    }

    private final void q(File file, t tVar, C13339a aVar) {
        Throwable th2;
        int e10 = this.f123601x.e();
        int f10 = this.f123601x.f();
        double g10 = this.f123601x.g();
        List<Integer> b10 = this.f123601x.b();
        int c10 = this.f123601x.c();
        E0.a aVar2 = E0.f124534B1;
        VideoMeta videoMeta = new VideoMeta(e10, f10, g10, b10, c10, aVar2.b(), aVar2.b(), this.f123601x.d());
        UUID uuid = getUuid();
        C13339a.q(aVar, uuid, "saveVideoMeta " + videoMeta, (Throwable) null, 4, (Object) null);
        q q10 = q.q(y.c(z.g(new File(file, "video_meta.json"), false, 1, (Object) null)));
        try {
            tVar.c(VideoMeta.class).toJson(q10, videoMeta);
            C16807N n10 = C16807N.f139792a;
            C17416c.a(q10, (Throwable) null);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C17416c.a(q10, th2);
            throw th4;
        }
    }

    public final X a() {
        if (this.f123600w.size() <= 0) {
            return null;
        }
        List<X> list = this.f123600w;
        return list.get(list.size() / 2);
    }

    public final L b() {
        return this.f123602y;
    }

    public final N c() {
        return this.f123594q;
    }

    public final List<X> d() {
        return this.f123600w;
    }

    public final TutorialStepEnum e() {
        return this.f123597t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return C17542s.e(this.f123578a, s02.f123578a) && C17542s.e(this.f123579b, s02.f123579b) && C17542s.e(this.f123580c, s02.f123580c) && this.f123581d == s02.f123581d && C17542s.e(this.f123582e, s02.f123582e) && C17542s.e(this.f123583f, s02.f123583f) && C17542s.e(this.f123584g, s02.f123584g) && C17542s.e(this.f123585h, s02.f123585h) && C17542s.e(this.f123586i, s02.f123586i) && C17542s.e(this.f123587j, s02.f123587j) && C17542s.e(this.f123588k, s02.f123588k) && C17542s.e(this.f123589l, s02.f123589l) && C17542s.e(this.f123590m, s02.f123590m) && C17542s.e(this.f123591n, s02.f123591n) && this.f123592o == s02.f123592o && C17542s.e(this.f123593p, s02.f123593p) && this.f123594q == s02.f123594q && C17542s.e(this.f123595r, s02.f123595r) && this.f123596s == s02.f123596s && this.f123597t == s02.f123597t && this.f123598u == s02.f123598u && this.f123599v == s02.f123599v && C17542s.e(this.f123600w, s02.f123600w) && C17542s.e(this.f123601x, s02.f123601x) && C17542s.e(this.f123602y, s02.f123602y) && C17542s.e(this.f123603z, s02.f123603z);
    }

    public final String f() {
        return this.f123582e;
    }

    public final w1 g() {
        return this.f123601x;
    }

    public String getCaptureStrategy() {
        return this.f123584g;
    }

    public String getCaptureType() {
        return this.f123583f;
    }

    public Instant getCreation() {
        return this.f123580c;
    }

    public boolean getHasError() {
        return this.f123577B;
    }

    public String getRoomTitle() {
        return this.f123593p;
    }

    public RoomType getRoomType() {
        return this.f123592o;
    }

    public boolean getSaved() {
        return this.f123576A;
    }

    public UUID getSessionUuid() {
        return this.f123578a;
    }

    public UUID getUuid() {
        return this.f123579b;
    }

    public HashMap<TrackingKey, String> getValues() {
        v a10 = C16796C.a(TrackingKey.SessionId, getSessionUuid().toString());
        v a11 = C16796C.a(TrackingKey.CaptureId, getUuid().toString());
        v a12 = C16796C.a(TrackingKey.CaptureType, com.sugarcube.app.base.capture.a.Companion.a(getCaptureType()).b());
        v a13 = C16796C.a(TrackingKey.CaptureStrategy, getCaptureStrategy());
        v a14 = C16796C.a(TrackingKey.RoomName, getRoomTitle());
        TrackingKey trackingKey = TrackingKey.RoomType;
        String upperCase = getRoomType().getApiKey().toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "toUpperCase(...)");
        return X.l(a10, a11, a12, a13, a14, C16796C.a(trackingKey, upperCase), C16796C.a(TrackingKey.CaptureV2, "true"), C16796C.a(TrackingKey.OwnVideo, String.valueOf(this.f123603z.getOwnVideo())), C16796C.a(TrackingKey.ForceLandscape, String.valueOf(this.f123603z.getForceLandscape())), C16796C.a(TrackingKey.SwapRgb, String.valueOf(this.f123603z.getSwapRgb())), C16796C.a(TrackingKey.Saved, String.valueOf(getSaved())));
    }

    public final boolean h() {
        return this.f123599v;
    }

    public boolean hasRequiredFiles(C13339a aVar) {
        C17542s.j(aVar, "captureRepository");
        return i(aVar, aVar.m(getUuid()));
    }

    public int hashCode() {
        int hashCode = ((((((this.f123578a.hashCode() * 31) + this.f123579b.hashCode()) * 31) + this.f123580c.hashCode()) * 31) + Boolean.hashCode(this.f123581d)) * 31;
        String str = this.f123582e;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f123583f.hashCode()) * 31) + this.f123584g.hashCode()) * 31) + this.f123585h.hashCode()) * 31;
        String str2 = this.f123586i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123587j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f123588k;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f123589l;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f123590m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f123591n;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return ((((((((((((((((((((((((hashCode7 + i10) * 31) + this.f123592o.hashCode()) * 31) + this.f123593p.hashCode()) * 31) + this.f123594q.hashCode()) * 31) + this.f123595r.hashCode()) * 31) + Integer.hashCode(this.f123596s)) * 31) + this.f123597t.hashCode()) * 31) + Boolean.hashCode(this.f123598u)) * 31) + Boolean.hashCode(this.f123599v)) * 31) + this.f123600w.hashCode()) * 31) + this.f123601x.hashCode()) * 31) + this.f123602y.hashCode()) * 31) + this.f123603z.hashCode();
    }

    public final boolean j() {
        return this.f123581d;
    }

    public final boolean k() {
        return this.f123598u;
    }

    public final void r(N n10) {
        C17542s.j(n10, "<set-?>");
        this.f123594q = n10;
    }

    public void s(String str) {
        C17542s.j(str, "<set-?>");
        this.f123593p = str;
    }

    public void saveFiles(C13339a aVar) {
        C17542s.j(aVar, "captureRepository");
        File l10 = aVar.l(getUuid());
        File m10 = aVar.m(getUuid());
        t d10 = new t.b().c(new C13286b()).d();
        File[] listFiles = m10.listFiles();
        int length = listFiles != null ? listFiles.length : 0;
        boolean hasRequiredFiles = hasRequiredFiles(aVar);
        UUID uuid = getUuid();
        C13339a.q(aVar, uuid, "saveFiles: saveMetas begin (" + length + "," + hasRequiredFiles + ")", (Throwable) null, 4, (Object) null);
        if (length == 0 || !hasRequiredFiles) {
            UUID uuid2 = getUuid();
            M d11 = this.f123602y.d();
            C13339a.q(aVar, uuid2, "saveFiles: metaStats=" + d11, (Throwable) null, 4, (Object) null);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                C17542s.g(d10);
                m(l10, d10, aVar);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                UUID uuid3 = getUuid();
                C13339a.q(aVar, uuid3, "saveFiles: saveMetas (" + currentTimeMillis2 + "ms)", (Throwable) null, 4, (Object) null);
                boolean renameTo = l10.renameTo(m10);
                UUID uuid4 = getUuid();
                C13339a.q(aVar, uuid4, "saveFiles: renameTo (" + renameTo + ")", (Throwable) null, 4, (Object) null);
            } catch (Throwable th2) {
                aVar.p(getUuid(), "save: sessionData save error", th2);
            }
        }
        C13339a.q(aVar, getUuid(), "saveFiles: saveMetas end", (Throwable) null, 4, (Object) null);
    }

    public void setHasError(boolean z10) {
        this.f123577B = z10;
    }

    public void setSaved(boolean z10) {
        this.f123576A = z10;
    }

    public void t(RoomType roomType) {
        C17542s.j(roomType, "<set-?>");
        this.f123592o = roomType;
    }

    public String toString() {
        UUID uuid = this.f123578a;
        UUID uuid2 = this.f123579b;
        Instant instant = this.f123580c;
        boolean z10 = this.f123581d;
        String str = this.f123582e;
        String str2 = this.f123583f;
        String str3 = this.f123584g;
        String str4 = this.f123585h;
        String str5 = this.f123586i;
        String str6 = this.f123587j;
        Integer num = this.f123588k;
        String str7 = this.f123589l;
        String str8 = this.f123590m;
        String str9 = this.f123591n;
        RoomType roomType = this.f123592o;
        String str10 = this.f123593p;
        N n10 = this.f123594q;
        List<? extends C14539a> list = this.f123595r;
        int i10 = this.f123596s;
        TutorialStepEnum tutorialStepEnum = this.f123597t;
        boolean z11 = this.f123598u;
        boolean z12 = this.f123599v;
        List<X> list2 = this.f123600w;
        w1 w1Var = this.f123601x;
        L l10 = this.f123602y;
        SessionMeta sessionMeta = this.f123603z;
        return "SessionData(sessionUuid=" + uuid + ", uuid=" + uuid2 + ", creation=" + instant + ", isLandscape=" + z10 + ", ultraWideCameraId=" + str + ", captureType=" + str2 + ", captureStrategy=" + str3 + ", captureMode=" + str4 + ", panoConfiguration=" + str5 + ", scanConfiguration=" + str6 + ", primaryImageCount=" + num + ", primaryImageLens=" + str7 + ", primaryImageOrientation=" + str8 + ", scanOrientation=" + str9 + ", roomType=" + roomType + ", roomTitle=" + str10 + ", mode=" + n10 + ", steps=" + list + ", stepIndex=" + i10 + ", tutorialStep=" + tutorialStepEnum + ", isStepDone=" + z11 + ", warnOnExit=" + z12 + ", panoDataList=" + list2 + ", videoData=" + w1Var + ", metaBuilder=" + l10 + ", sessionMeta=" + sessionMeta + ")";
    }

    public final void u(boolean z10) {
        this.f123598u = z10;
    }

    public final void v(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "<set-?>");
        this.f123597t = tutorialStepEnum;
    }

    public final void w(boolean z10) {
        this.f123599v = z10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ S0(java.util.UUID r40, java.util.UUID r41, java.time.Instant r42, boolean r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.Integer r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, com.sugarcube.core.network.models.RoomType r54, java.lang.String r55, com.sugarcube.app.base.ui.capturev2.N r56, java.util.List r57, int r58, com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r59, boolean r60, boolean r61, java.util.List r62, com.sugarcube.app.base.ui.capturev2.w1 r63, com.sugarcube.app.base.ui.capturev2.L r64, com.sugarcube.core.network.models.SessionMeta r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            r39 = this;
            r0 = r66
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r3 = r1
            goto L_0x000e
        L_0x000c:
            r3 = r40
        L_0x000e:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0018
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r4 = r1
            goto L_0x001a
        L_0x0018:
            r4 = r41
        L_0x001a:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0024
            java.time.Instant r1 = java.time.Instant.now()
            r5 = r1
            goto L_0x0026
        L_0x0024:
            r5 = r42
        L_0x0026:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x002c
            r6 = 0
            goto L_0x002e
        L_0x002c:
            r6 = r43
        L_0x002e:
            r1 = r0 & 16
            r7 = 0
            if (r1 == 0) goto L_0x0035
            r1 = r7
            goto L_0x0037
        L_0x0035:
            r1 = r44
        L_0x0037:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003e
            java.lang.String r8 = "HYBRID"
            goto L_0x0040
        L_0x003e:
            r8 = r45
        L_0x0040:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0047
            java.lang.String r9 = "CAMPANO_ARSCAN_ARSTEP_ARSCAN"
            goto L_0x0049
        L_0x0047:
            r9 = r46
        L_0x0049:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0050
            java.lang.String r10 = "ARPANO"
            goto L_0x0052
        L_0x0050:
            r10 = r47
        L_0x0052:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0058
            r11 = r7
            goto L_0x005a
        L_0x0058:
            r11 = r48
        L_0x005a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0060
            r12 = r7
            goto L_0x0062
        L_0x0060:
            r12 = r49
        L_0x0062:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0068
            r13 = r7
            goto L_0x006a
        L_0x0068:
            r13 = r50
        L_0x006a:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0070
            r14 = r7
            goto L_0x0072
        L_0x0070:
            r14 = r51
        L_0x0072:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0078
            r15 = r7
            goto L_0x007a
        L_0x0078:
            r15 = r52
        L_0x007a:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0081
            r16 = r7
            goto L_0x0083
        L_0x0081:
            r16 = r53
        L_0x0083:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x008c
            com.sugarcube.core.network.models.RoomType r2 = com.sugarcube.core.network.models.RoomType.UNKNOWN
            r17 = r2
            goto L_0x008e
        L_0x008c:
            r17 = r54
        L_0x008e:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r17.getApiKey()
            r18 = r2
            goto L_0x009d
        L_0x009b:
            r18 = r55
        L_0x009d:
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00a7
            com.sugarcube.app.base.ui.capturev2.N r2 = com.sugarcube.app.base.ui.capturev2.N.Room
            r19 = r2
            goto L_0x00a9
        L_0x00a7:
            r19 = r56
        L_0x00a9:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b7
            hF.a$c r2 = hF.C14539a.f127497a
            java.util.List r2 = r2.a()
            r20 = r2
            goto L_0x00b9
        L_0x00b7:
            r20 = r57
        L_0x00b9:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c1
            r21 = 0
            goto L_0x00c3
        L_0x00c1:
            r21 = r58
        L_0x00c3:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00cd
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r2 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_GET_READY_1
            r22 = r2
            goto L_0x00cf
        L_0x00cd:
            r22 = r59
        L_0x00cf:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d7
            r23 = 0
            goto L_0x00d9
        L_0x00d7:
            r23 = r60
        L_0x00d9:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00e1
            r24 = 0
            goto L_0x00e3
        L_0x00e1:
            r24 = r61
        L_0x00e3:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00f0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r25 = r2
            goto L_0x00f2
        L_0x00f0:
            r25 = r62
        L_0x00f2:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0129
            com.sugarcube.app.base.ui.capturev2.w1 r2 = new com.sugarcube.app.base.ui.capturev2.w1
            r7 = 255(0xff, float:3.57E-43)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r40 = r2
            r41 = r27
            r42 = r28
            r43 = r29
            r45 = r31
            r47 = r33
            r48 = r34
            r49 = r35
            r50 = r36
            r51 = r7
            r52 = r26
            r40.<init>(r41, r42, r43, r45, r47, r48, r49, r50, r51, r52)
            r26 = r2
            goto L_0x012b
        L_0x0129:
            r26 = r63
        L_0x012b:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0171
            com.sugarcube.app.base.ui.capturev2.L r0 = new com.sugarcube.app.base.ui.capturev2.L
            r2 = 4095(0xfff, float:5.738E-42)
            r7 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = r0
            r41 = r27
            r42 = r28
            r43 = r29
            r44 = r30
            r45 = r31
            r46 = r32
            r47 = r33
            r48 = r34
            r49 = r35
            r50 = r36
            r51 = r37
            r52 = r38
            r53 = r2
            r54 = r7
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r27 = r0
            goto L_0x0173
        L_0x0171:
            r27 = r64
        L_0x0173:
            r2 = r39
            r7 = r1
            r28 = r65
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.S0.<init>(java.util.UUID, java.util.UUID, java.time.Instant, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.sugarcube.core.network.models.RoomType, java.lang.String, com.sugarcube.app.base.ui.capturev2.N, java.util.List, int, com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum, boolean, boolean, java.util.List, com.sugarcube.app.base.ui.capturev2.w1, com.sugarcube.app.base.ui.capturev2.L, com.sugarcube.core.network.models.SessionMeta, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
