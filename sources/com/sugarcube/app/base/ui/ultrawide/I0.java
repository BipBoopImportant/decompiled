package com.sugarcube.app.base.ui.ultrawide;

import KF.C13147a;
import KF.C13164r;
import NE.C13286b;
import OE.C13313e;
import OE.n;
import OE.q;
import PE.C13341c;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.v;
import XH.y;
import YE.C13868b;
import YH.C16870n;
import YH.C16877v;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.squareup.moshi.t;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.app.base.data.database.MediaType;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.model.AndroidQuality;
import com.sugarcube.app.base.data.model.Dimension;
import com.sugarcube.app.base.data.model.FloorDetection;
import com.sugarcube.app.base.data.model.PanoMeta;
import com.sugarcube.app.base.data.model.QualityMeta;
import com.sugarcube.app.base.data.model.QualityWarnings;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.upload.IUploaderV2;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import dI.C17168i;
import eF.C14418i;
import eI.C17187b;
import jI.C17416c;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tF.C15083h;
import tF.C15091p;
import tI.C17978n;

@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 t2\u00020\u0001:\u0002Â\u0002Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010&\u001a\u00020 2\n\u0010%\u001a\u00060#j\u0002`$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J&\u0010/\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010.0,2\u0006\u0010+\u001a\u00020(H@¢\u0006\u0004\b/\u00100J.\u00101\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010.0,2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020(H@¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020 H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00107\u001a\u00020 2\u0006\u00106\u001a\u000205H@¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020 2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020 09H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020 H\u0002¢\u0006\u0004\b=\u00104J\u0017\u0010?\u001a\u00020 2\u0006\u0010>\u001a\u00020.H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010D\u001a\u00020 2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020.¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020 2\u0006\u0010F\u001a\u00020.¢\u0006\u0004\bG\u0010@J\u0015\u0010J\u001a\u00020 2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020 2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020-¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020 ¢\u0006\u0004\bR\u00104J\r\u0010S\u001a\u00020 ¢\u0006\u0004\bS\u00104J\r\u0010T\u001a\u00020 ¢\u0006\u0004\bT\u00104JE\u0010^\u001a\u00020 2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010I\u001a\u00020H2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010\\\u001a\u00020[2\b\b\u0002\u0010]\u001a\u00020[¢\u0006\u0004\b^\u0010_J\r\u0010a\u001a\u00020`¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020c2\u0006\u0010V\u001a\u00020UH@¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020-¢\u0006\u0004\bf\u0010QJ\u001e\u0010g\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010.0,H@¢\u0006\u0004\bg\u0010hJ\u0018\u0010k\u001a\u00020 2\u0006\u0010j\u001a\u00020iH@¢\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\u00020 2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bm\u0010nJ\u0015\u0010o\u001a\u00020 2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bo\u0010nJ$\u0010p\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010j\u001a\u0004\u0018\u00010iH@¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020-2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020 09¢\u0006\u0004\br\u0010sJ\u001b\u0010t\u001a\u00020 2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020 09¢\u0006\u0004\bt\u0010<J\r\u0010u\u001a\u00020 ¢\u0006\u0004\bu\u00104J\u0015\u0010v\u001a\u00020 2\u0006\u0010>\u001a\u00020.¢\u0006\u0004\bv\u0010@J\r\u0010w\u001a\u00020 ¢\u0006\u0004\bw\u00104J\r\u0010x\u001a\u00020 ¢\u0006\u0004\bx\u00104J\r\u0010y\u001a\u00020 ¢\u0006\u0004\by\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\u00020-8\u0016XD¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010QR\u001f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R$\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010¡\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R!\u0010¨\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¦\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u0001R \u0010ª\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u0001R \u0010¬\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u0001R%\u0010¯\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010 0¡\u00018\u0006¢\u0006\u0010\n\u0006\b­\u0001\u0010¢\u0001\u001a\u0006\b®\u0001\u0010¤\u0001R(\u0010´\u0001\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010\u0001\u001a\u0005\b±\u0001\u0010Q\"\u0006\b²\u0001\u0010³\u0001R\u001b\u00106\u001a\u0002058\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R'\u0010¿\u0001\u001a\r º\u0001*\u0005\u0018\u00010¹\u00010¹\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R)\u0010B\u001a\u00020A2\u0007\u0010À\u0001\u001a\u00020A8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R)\u0010C\u001a\u00020.2\u0007\u0010À\u0001\u001a\u00020.8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u001e\u0010Ê\u0001\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u0010\n\u0006\bÈ\u0001\u0010Å\u0001\u001a\u0006\bÉ\u0001\u0010Ç\u0001R\u001f\u0010Í\u0001\u001a\u00020.8\u0006XD¢\u0006\u0010\n\u0006\bË\u0001\u0010Å\u0001\u001a\u0006\bÌ\u0001\u0010Ç\u0001R\u001f\u0010Ð\u0001\u001a\u00020.8\u0006XD¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Å\u0001\u001a\u0006\bÏ\u0001\u0010Ç\u0001R\u001f\u0010Ó\u0001\u001a\u00020.8\u0006XD¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Å\u0001\u001a\u0006\bÒ\u0001\u0010Ç\u0001R\u001c\u0010×\u0001\u001a\u00020[8\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001b\u0010Ú\u0001\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\bØ\u0001\u0010\u0001\u001a\u0005\bÙ\u0001\u0010QR\u001b\u0010Ý\u0001\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\bÛ\u0001\u0010\u0001\u001a\u0005\bÜ\u0001\u0010QR\u001b\u0010à\u0001\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\bÞ\u0001\u0010\u0001\u001a\u0005\bß\u0001\u0010QR\u001b\u0010ã\u0001\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\bá\u0001\u0010\u0001\u001a\u0005\bâ\u0001\u0010QR\u001b\u0010æ\u0001\u001a\u00020-8\u0006¢\u0006\u000f\n\u0006\bä\u0001\u0010\u0001\u001a\u0005\bå\u0001\u0010QR\u001c\u0010é\u0001\u001a\u00020[8\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010\u0001\u001a\u0006\bè\u0001\u0010Ö\u0001R\u001c\u0010ì\u0001\u001a\u00020[8\u0006¢\u0006\u0010\n\u0006\bê\u0001\u0010\u0001\u001a\u0006\bë\u0001\u0010Ö\u0001R\u0019\u0010î\u0001\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bí\u0001\u0010\u0001R\u0019\u0010ð\u0001\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bï\u0001\u0010\u0001R\u001b\u0010ô\u0001\u001a\u00020`8\u0006¢\u0006\u000f\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0005\bó\u0001\u0010bR\u001b\u0010÷\u0001\u001a\u00020`8\u0006¢\u0006\u000f\n\u0006\bõ\u0001\u0010ò\u0001\u001a\u0005\bö\u0001\u0010bR%\u0010ú\u0001\u001a\u000b º\u0001*\u0004\u0018\u00010.0.8\u0006¢\u0006\u0010\n\u0006\bø\u0001\u0010Å\u0001\u001a\u0006\bù\u0001\u0010Ç\u0001R(\u0010þ\u0001\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bû\u0001\u0010\u0001\u001a\u0005\bü\u0001\u0010Q\"\u0006\bý\u0001\u0010³\u0001R'\u0010\u0002\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b^\u0010\u0001\u001a\u0005\bÿ\u0001\u0010Q\"\u0006\b\u0002\u0010³\u0001R)\u0010\u0002\u001a\u00020Y2\u0007\u0010À\u0001\u001a\u00020Y8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b3\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R-\u0010\u0002\u001a\u0004\u0018\u00010U2\t\u0010À\u0001\u001a\u0004\u0018\u00010U8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b)\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R-\u0010\u0002\u001a\u0004\u0018\u00010U2\t\u0010À\u0001\u001a\u0004\u0018\u00010U8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b1\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R.\u0010\u0002\u001a\u0004\u0018\u00010U2\t\u0010À\u0001\u001a\u0004\u0018\u00010U8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\"\u0010\u0002\u001a\r º\u0001*\u0005\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u00030\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bó\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010\u0001R\u0019\u0010\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010\u0001R\u0019\u0010\u0002\u001a\u00030\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÌ\u0001\u0010~R \u0010\u0002\u001a\t\u0012\u0004\u0012\u00020[0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u00020W8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010\u0001R\u001b\u0010\u0002\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010\u0002R \u0010\u0002\u001a\t\u0012\u0004\u0012\u00020H0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0002R \u0010 \u0002\u001a\t\u0012\u0004\u0012\u00020U0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0002R \u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020W0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010\u0002R \u0010¢\u0002\u001a\t\u0012\u0004\u0012\u00020Y0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u0002R \u0010£\u0002\u001a\t\u0012\u0004\u0012\u00020[0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R \u0010¥\u0002\u001a\t\u0012\u0004\u0012\u00020[0\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010\u0002R*\u0010¨\u0002\u001a\u00020L2\u0007\u0010À\u0001\u001a\u00020L8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010¦\u0002\u001a\u0006\b¤\u0002\u0010§\u0002R\u001f\u0010©\u0002\u001a\t\u0012\u0004\u0012\u00020-0\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\ba\u0010\u0002R\u0019\u0010«\u0002\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bª\u0002\u0010\u0001R\u0019\u0010­\u0002\u001a\u00020W8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u0001R\u0019\u0010¯\u0002\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b®\u0002\u0010\u0001R!\u0010±\u0002\u001a\n\u0012\u0005\u0012\u00030°\u00020\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0002R!\u0010³\u0002\u001a\n\u0012\u0005\u0012\u00030²\u00020\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010\u0002R\u0018\u0010µ\u0002\u001a\u00030´\u00028\u0002XD¢\u0006\b\n\u0006\bö\u0001\u0010\u0001R\u001a\u0010¶\u0002\u001a\u00030´\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bß\u0001\u0010\u0001R\u001a\u0010·\u0002\u001a\u00030´\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0001R\u001a\u0010¸\u0002\u001a\u00030´\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010¹\u0002\u001a\u00030´\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u0001R#\u0010»\u0002\u001a\t\u0012\u0004\u0012\u00020-0¡\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010¢\u0001\u001a\u0006\bº\u0002\u0010¤\u0001R'\u0010¼\u0002\u001a\u0012\u0012\r\u0012\u000b º\u0001*\u0004\u0018\u00010-0-0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010\u0001R\"\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020-0¡\u00018\u0006¢\u0006\u000f\n\u0005\b!\u0010¢\u0001\u001a\u0006\bª\u0002\u0010¤\u0001R#\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030¾\u00020¡\u00018\u0006¢\u0006\u000f\n\u0005\br\u0010¢\u0001\u001a\u0006\b¬\u0002\u0010¤\u0001R\u001e\u0010À\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¦\u00010¡\u00018F¢\u0006\b\u001a\u0006\b®\u0002\u0010¤\u0001R\u001d\u0010Á\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0¡\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010¤\u0001¨\u0006Ã\u0002"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/I0;", "LeF/i;", "Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "LOE/q;", "sugarcube", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LKF/a;", "files", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "uploaderV2", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/SceneRepository;LOE/q;LOE/e;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LKF/a;LKF/r;Lcom/sugarcube/app/base/upload/IUploaderV2;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;Lcom/sugarcube/app/base/data/user/UserRepo;Landroidx/lifecycle/U;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "Lcom/google/ar/core/Session;", "session", "LXH/N;", "y1", "(Lcom/google/ar/core/Session;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "L1", "(Ljava/lang/Exception;)V", "Lcom/sugarcube/app/base/data/model/QualityMeta;", "T0", "()Lcom/sugarcube/app/base/data/model/QualityMeta;", "qualityMeta", "LXH/v;", "", "", "F1", "(Lcom/sugarcube/app/base/data/model/QualityMeta;LdI/e;)Ljava/lang/Object;", "U0", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/model/QualityMeta;LdI/e;)Ljava/lang/Object;", "S0", "()V", "Ljava/util/UUID;", "uuid", "Q1", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "negAnalytics", "b2", "(LnI/a;)V", "f2", "reason", "Y1", "(Ljava/lang/String;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "roomTitle", "V1", "(Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;)V", "state", "R1", "Lcom/sugarcube/app/base/ui/ultrawide/e;", "sensorData", "T1", "(Lcom/sugarcube/app/base/ui/ultrawide/e;)V", "Lcom/sugarcube/app/base/ui/ultrawide/a;", "intrinsics", "S1", "(Lcom/sugarcube/app/base/ui/ultrawide/a;)V", "D1", "()Z", "s2", "u2", "M1", "Landroid/graphics/Bitmap;", "bitmap", "", "timestamp", "", "rotation", "", "tracking", "targetIdx", "R0", "(Landroid/graphics/Bitmap;JLcom/sugarcube/app/base/ui/ultrawide/e;[FII)V", "Ljava/io/File;", "l1", "()Ljava/io/File;", "", "P1", "(Landroid/graphics/Bitmap;LdI/e;)Ljava/lang/Object;", "E1", "O1", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/ui/ultrawide/j;", "arSurface", "q2", "(Lcom/sugarcube/app/base/ui/ultrawide/j;LdI/e;)Ljava/lang/Object;", "t2", "(Lcom/sugarcube/app/base/ui/ultrawide/j;)V", "v2", "N1", "(Landroid/content/Context;Lcom/sugarcube/app/base/ui/ultrawide/j;LdI/e;)Ljava/lang/Object;", "z1", "(LnI/a;)Z", "A1", "C1", "B1", "J1", "U1", "i2", "C", "Lcom/sugarcube/app/base/data/SceneRepository;", "getSceneRepository", "()Lcom/sugarcube/app/base/data/SceneRepository;", "D", "LOE/q;", "u1", "()LOE/q;", "E", "LOE/e;", "F", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "G", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "H", "LKF/r;", "I", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "J", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "K", "Lcom/sugarcube/app/base/data/user/UserRepo;", "w1", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "L", "Landroidx/lifecycle/U;", "M", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "f1", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "N", "Z", "P", "isLandscape", "Landroidx/lifecycle/K;", "LtF/h;", "O", "Landroidx/lifecycle/K;", "_showDialog", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/F;", "t1", "()Landroidx/lifecycle/F;", "showDialog", "Landroid/net/Uri;", "Q", "_privacyPolicyUri", "R", "_arInitDone", "S", "_finish", "T", "e1", "finish", "U", "getWarnOnExit", "X1", "(Z)V", "warnOnExit", "X", "Ljava/util/UUID;", "x1", "()Ljava/util/UUID;", "Ljava/time/Instant;", "kotlin.jvm.PlatformType", "Y", "Ljava/time/Instant;", "b1", "()Ljava/time/Instant;", "creation", "value", "Lcom/sugarcube/core/network/models/RoomType;", "q1", "()Lcom/sugarcube/core/network/models/RoomType;", "y0", "Ljava/lang/String;", "p1", "()Ljava/lang/String;", "z0", "v1", "ultraWideCameraId", "A0", "a1", "captureType", "B0", "Z0", "captureStrategy", "C0", "Y0", "captureMode", "D0", "h1", "()I", "jpegQuality", "E0", "d1", "enableShowPoints", "F0", "c1", "enableShowPlanes", "G0", "s1", "showArInitStep", "H0", "g1", "floorDetectionEnabled", "I0", "getUseAnchors", "useAnchors", "J0", "getFloorTimeMinimum", "floorTimeMinimum", "K0", "getFloorTimeoutLimit", "floorTimeoutLimit", "L0", "floorAnchorCreated", "M0", "isAlignmentAnchorSet", "N0", "Ljava/io/File;", "X0", "captureDir", "O0", "r1", "saveDir", "P0", "getRecordingPath", "recordingPath", "Q0", "G1", "W1", "isStepDone", "getCaptureInterruptEnabled", "setCaptureInterruptEnabled", "captureInterruptEnabled", "[F", "getOriginMatrix", "()[F", "originMatrix", "Landroid/graphics/Bitmap;", "k1", "()Landroid/graphics/Bitmap;", "panoMosaic", "i1", "panoCenter", "V0", "alignmentBitmap", "Lcom/squareup/moshi/t;", "W0", "Lcom/squareup/moshi/t;", "moshi", "Lcom/sugarcube/app/base/ui/ultrawide/Z;", "Lcom/sugarcube/app/base/ui/ultrawide/Z;", "metaBuilder", "startingVideoFrameIndex", "stoppingVideoFrameIndex", "", "videoTimeSecs", "", "Ljava/util/List;", "droppedVideoFrames", "startingVideoTimeNS", "Lcom/sugarcube/app/base/ui/ultrawide/e;", "originSensorData", "panoSensorData", "panoImages", "panoImageTimestamps", "panoRotations", "panoTracking", "j1", "panoTargetIdx", "Lcom/sugarcube/app/base/ui/ultrawide/a;", "()Lcom/sugarcube/app/base/ui/ultrawide/a;", "panoIntrinsics", "panoUsedPNGFallback", "m1", "arInitActive", "n1", "arInitStartTimeMillis", "o1", "timeoutReached", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "", "principalPointThreshold", "panoPrincipalRatioX", "panoPrincipalRatioY", "principalRatioX", "principalRatioY", "I1", "isUserLoggedIn", "_privacyPolicyErrorState", "privacyPolicyErrorState", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "privacyPolicyState", "privacyPolicyUri", "arInitDone", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I0 extends C14418i {

    /* renamed from: A1  reason: collision with root package name */
    public static final a f125247A1 = new a((DefaultConstructorMarker) null);

    /* renamed from: B1  reason: collision with root package name */
    public static final int f125248B1 = 8;
    /* access modifiers changed from: private */

    /* renamed from: C1  reason: collision with root package name */
    public static final long f125249C1 = TimeUnit.SECONDS.toMillis(14);
    /* access modifiers changed from: private */

    /* renamed from: D1  reason: collision with root package name */
    public static final Dimension f125250D1 = new Dimension(640, 480);

    /* renamed from: A0  reason: collision with root package name */
    private final String f125251A0;

    /* renamed from: B0  reason: collision with root package name */
    private final String f125252B0;

    /* renamed from: C  reason: collision with root package name */
    private final SceneRepository f125253C;

    /* renamed from: C0  reason: collision with root package name */
    private final String f125254C0;

    /* renamed from: D  reason: collision with root package name */
    private final q f125255D;

    /* renamed from: D0  reason: collision with root package name */
    private final int f125256D0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C13313e f125257E;

    /* renamed from: E0  reason: collision with root package name */
    private final boolean f125258E0;

    /* renamed from: F  reason: collision with root package name */
    private final VideoAssetRepository f125259F;

    /* renamed from: F0  reason: collision with root package name */
    private final boolean f125260F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final ConfigRepository f125261G;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f125262G0;

    /* renamed from: H  reason: collision with root package name */
    private final C13164r f125263H;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f125264H0;

    /* renamed from: I  reason: collision with root package name */
    private final IUploaderV2 f125265I;

    /* renamed from: I0  reason: collision with root package name */
    private final boolean f125266I0;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final PrivacyPolicyConsentUseCase f125267J;

    /* renamed from: J0  reason: collision with root package name */
    private final int f125268J0;

    /* renamed from: K  reason: collision with root package name */
    private final UserRepo f125269K;

    /* renamed from: K0  reason: collision with root package name */
    private final int f125270K0;

    /* renamed from: L  reason: collision with root package name */
    private final U f125271L;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f125272L0;

    /* renamed from: M  reason: collision with root package name */
    private final FirebaseInteractions f125273M;

    /* renamed from: M0  reason: collision with root package name */
    private boolean f125274M0;

    /* renamed from: N  reason: collision with root package name */
    private final boolean f125275N = true;

    /* renamed from: N0  reason: collision with root package name */
    private final File f125276N0;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public final K<C15083h> f125277O;

    /* renamed from: O0  reason: collision with root package name */
    private final File f125278O0;

    /* renamed from: P  reason: collision with root package name */
    private final F<C15083h> f125279P;

    /* renamed from: P0  reason: collision with root package name */
    private final String f125280P0;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public final K<Uri> f125281Q;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f125282Q0;

    /* renamed from: R  reason: collision with root package name */
    private final K<Boolean> f125283R;

    /* renamed from: R0  reason: collision with root package name */
    private boolean f125284R0;

    /* renamed from: S  reason: collision with root package name */
    private final K<C16807N> f125285S;

    /* renamed from: S0  reason: collision with root package name */
    private float[] f125286S0;

    /* renamed from: T  reason: collision with root package name */
    private final F<C16807N> f125287T;

    /* renamed from: T0  reason: collision with root package name */
    private Bitmap f125288T0;

    /* renamed from: U  reason: collision with root package name */
    private boolean f125289U;

    /* renamed from: U0  reason: collision with root package name */
    private Bitmap f125290U0;
    /* access modifiers changed from: private */

    /* renamed from: V0  reason: collision with root package name */
    public Bitmap f125291V0;
    /* access modifiers changed from: private */

    /* renamed from: W0  reason: collision with root package name */
    public final t f125292W0;

    /* renamed from: X  reason: collision with root package name */
    private final UUID f125293X;
    /* access modifiers changed from: private */

    /* renamed from: X0  reason: collision with root package name */
    public Z f125294X0;

    /* renamed from: Y  reason: collision with root package name */
    private final Instant f125295Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0  reason: collision with root package name */
    public int f125296Y0;

    /* renamed from: Z  reason: collision with root package name */
    private RoomType f125297Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public int f125298Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public double f125299a1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public List<Integer> f125300b1;

    /* renamed from: c1  reason: collision with root package name */
    private long f125301c1;

    /* renamed from: d1  reason: collision with root package name */
    private C14294e f125302d1;

    /* renamed from: e1  reason: collision with root package name */
    private List<C14294e> f125303e1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public List<Bitmap> f125304f1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public List<Long> f125305g1;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public List<float[]> f125306h1;

    /* renamed from: i1  reason: collision with root package name */
    private List<Integer> f125307i1;
    /* access modifiers changed from: private */

    /* renamed from: j1  reason: collision with root package name */
    public List<Integer> f125308j1;

    /* renamed from: k1  reason: collision with root package name */
    private C14286a f125309k1;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public List<Boolean> f125310l1;

    /* renamed from: m1  reason: collision with root package name */
    private boolean f125311m1;

    /* renamed from: n1  reason: collision with root package name */
    private long f125312n1;

    /* renamed from: o1  reason: collision with root package name */
    private boolean f125313o1;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public List<com.sugarcube.app.base.data.database.Metadata> f125314p1;
    /* access modifiers changed from: private */

    /* renamed from: q1  reason: collision with root package name */
    public List<Media> f125315q1;

    /* renamed from: r1  reason: collision with root package name */
    private final float f125316r1;

    /* renamed from: s1  reason: collision with root package name */
    private float f125317s1;

    /* renamed from: t1  reason: collision with root package name */
    private float f125318t1;

    /* renamed from: u1  reason: collision with root package name */
    private float f125319u1;

    /* renamed from: v1  reason: collision with root package name */
    private float f125320v1;

    /* renamed from: w1  reason: collision with root package name */
    private final F<Boolean> f125321w1;
    /* access modifiers changed from: private */

    /* renamed from: x1  reason: collision with root package name */
    public final K<Boolean> f125322x1;

    /* renamed from: y0  reason: collision with root package name */
    private String f125323y0;

    /* renamed from: y1  reason: collision with root package name */
    private final F<Boolean> f125324y1;

    /* renamed from: z0  reason: collision with root package name */
    private final String f125325z0;

    /* renamed from: z1  reason: collision with root package name */
    private final F<PrivacyPolicyFeatureState> f125326z1;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/I0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "", "DEFAULT_ARINIT_DURATION_SECS", "J", "b", "()J", "Lcom/sugarcube/app/base/data/model/Dimension;", "DEFAULT_VIDEO_ENCODE_SIZE", "Lcom/sugarcube/app/base/data/model/Dimension;", "c", "()Lcom/sugarcube/app/base/data/model/Dimension;", "PANO_IMAGE_FN_FORMAT", "Ljava/lang/String;", "PANO_META_FN_FORMAT", "PANO_ALIGNMENT_FILE_NAME", "PIPELINE_TYPE_ULTRAWIDE", "CAPTURE_TYPE_ULTRAWIDE", "CAPTURE_STRATEGY_ULTRAWIDE", "SAVED_STATE_CAPTURE_UUID_KEY", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
            r6 = (java.lang.Float) (r6 = (android.util.Range) r12.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)).getLower();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(android.content.Context r15) {
            /*
                r14 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C17542s.j(r15, r0)
                java.lang.String r0 = "camera"
                java.lang.Object r15 = r15.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.hardware.camera2.CameraManager"
                kotlin.jvm.internal.C17542s.h(r15, r0)
                android.hardware.camera2.CameraManager r15 = (android.hardware.camera2.CameraManager) r15
                java.lang.String[] r0 = r15.getCameraIdList()
                java.lang.String r1 = "getCameraIdList(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.length
                r3 = 0
                r4 = r3
            L_0x0023:
                java.lang.String r5 = "findUltrawideCamera "
                if (r4 >= r2) goto L_0x006d
                r6 = r0[r4]
                android.hardware.camera2.CameraCharacteristics r7 = r15.getCameraCharacteristics(r6)     // Catch:{ all -> 0x0053 }
                android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ all -> 0x0053 }
                java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x0053 }
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0053 }
                if (r8 != 0) goto L_0x0038
                goto L_0x006a
            L_0x0038:
                int r8 = r8.intValue()     // Catch:{ all -> 0x0053 }
                r9 = 1
                if (r8 != r9) goto L_0x006a
                android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ all -> 0x0053 }
                java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0053 }
                int[] r7 = (int[]) r7     // Catch:{ all -> 0x0053 }
                if (r7 == 0) goto L_0x006a
                boolean r5 = YH.C16870n.Y(r7, r3)     // Catch:{ all -> 0x0053 }
                if (r5 != r9) goto L_0x006a
                r1.add(r6)
                goto L_0x006a
            L_0x0053:
                r6 = move-exception
                YE.b r7 = YE.C13868b.f118106a
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r5)
                r8.append(r6)
                java.lang.String r5 = r8.toString()
                YE.e r6 = YE.e.Capture
                r7.b(r5, r6)
            L_0x006a:
                int r4 = r4 + 1
                goto L_0x0023
            L_0x006d:
                java.util.Iterator r0 = r1.iterator()
                r1 = 0
                r2 = 0
            L_0x0073:
                boolean r3 = r0.hasNext()
                java.lang.String r4 = "Sugarcube"
                if (r3 == 0) goto L_0x010f
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                android.hardware.camera2.CameraCharacteristics r12 = r15.getCameraCharacteristics(r3)     // Catch:{ all -> 0x00a7 }
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a7 }
                r7 = 30
                r8 = 1065353216(0x3f800000, float:1.0)
                if (r6 < r7) goto L_0x00a9
                android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE     // Catch:{ all -> 0x00a7 }
                java.lang.Object r6 = r12.get(r6)     // Catch:{ all -> 0x00a7 }
                android.util.Range r6 = (android.util.Range) r6     // Catch:{ all -> 0x00a7 }
                if (r6 == 0) goto L_0x00a9
                java.lang.Comparable r6 = r6.getLower()     // Catch:{ all -> 0x00a7 }
                java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x00a7 }
                if (r6 == 0) goto L_0x00a9
                float r6 = r6.floatValue()     // Catch:{ all -> 0x00a7 }
                r9 = r6
                goto L_0x00aa
            L_0x00a7:
                r3 = move-exception
                goto L_0x00f7
            L_0x00a9:
                r9 = r8
            L_0x00aa:
                com.sugarcube.app.base.ui.ultrawide.a$a r6 = com.sugarcube.app.base.ui.ultrawide.C14286a.f125581f     // Catch:{ all -> 0x00a7 }
                kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ all -> 0x00a7 }
                r10 = 2
                r11 = 0
                r8 = 0
                r7 = r12
                com.sugarcube.app.base.ui.ultrawide.a r6 = com.sugarcube.app.base.ui.ultrawide.C14286a.C3073a.b(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a7 }
                float[] r6 = r6.a()     // Catch:{ all -> 0x00a7 }
                float r6 = YH.C16870n.I0(r6)     // Catch:{ all -> 0x00a7 }
                double r7 = (double) r6
                r9 = 4636033603912859648(0x4056800000000000, double:90.0)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 < 0) goto L_0x00f2
                int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x00f2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
                r1.<init>()     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = "ULTRAWIDE supported - "
                r1.append(r2)     // Catch:{ all -> 0x00ec }
                r1.append(r3)     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = " "
                r1.append(r2)     // Catch:{ all -> 0x00ec }
                r1.append(r6)     // Catch:{ all -> 0x00ec }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
                android.util.Log.d(r4, r1)     // Catch:{ all -> 0x00ec }
                r1 = r3
                r2 = r6
                goto L_0x00f2
            L_0x00ec:
                r1 = move-exception
                r2 = r6
                r13 = r3
                r3 = r1
                r1 = r13
                goto L_0x00f7
            L_0x00f2:
                kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ all -> 0x00a7 }
                goto L_0x0073
            L_0x00f7:
                YE.b r4 = YE.C13868b.f118106a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                YE.e r6 = YE.e.Capture
                r4.b(r3, r6)
                goto L_0x0073
            L_0x010f:
                if (r1 != 0) goto L_0x0116
                java.lang.String r15 = "ULTRAWIDE not supported"
                android.util.Log.d(r4, r15)
            L_0x0116:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.a.a(android.content.Context):java.lang.String");
        }

        public final long b() {
            return I0.f125249C1;
        }

        public final Dimension c() {
            return I0.f125250D1;
        }

        public final boolean d(Context context) {
            C17542s.j(context, "context");
            return a(context) != null;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$doSave$2", f = "UltrawideViewModel.kt", l = {972}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super v<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125327c;

        /* renamed from: d  reason: collision with root package name */
        Object f125328d;

        /* renamed from: e  reason: collision with root package name */
        Object f125329e;

        /* renamed from: f  reason: collision with root package name */
        Object f125330f;

        /* renamed from: g  reason: collision with root package name */
        Object f125331g;

        /* renamed from: h  reason: collision with root package name */
        Object f125332h;

        /* renamed from: i  reason: collision with root package name */
        Object f125333i;

        /* renamed from: j  reason: collision with root package name */
        Object f125334j;

        /* renamed from: k  reason: collision with root package name */
        int f125335k;

        /* renamed from: l  reason: collision with root package name */
        int f125336l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ I0 f125337m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Context f125338n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ QualityMeta f125339o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(I0 i02, Context context, QualityMeta qualityMeta, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f125337m = i02;
            this.f125338n = context;
            this.f125339o = qualityMeta;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125337m, this.f125338n, this.f125339o, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super v<Boolean, String>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x06a2  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x06d4  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x06db  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0529  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x05d9 A[LOOP:0: B:87:0x05d3->B:89:0x05d9, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0612  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r51) {
            /*
                r50 = this;
                r1 = r50
                r2 = 1
                java.lang.String r3 = "quality_meta.json"
                java.lang.String r4 = "capture_meta.json"
                java.lang.String r5 = "session_meta.json"
                java.lang.String r6 = "]"
                java.lang.String r7 = ")"
                java.lang.String r8 = "video_meta.json"
                java.lang.String r9 = "["
                java.lang.Object r10 = eI.C17187b.f()
                int r0 = r1.f125336l
                java.lang.String r11 = ") - "
                if (r0 == 0) goto L_0x004c
                if (r0 != r2) goto L_0x0044
                java.lang.Object r0 = r1.f125334j
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f125333i
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = (com.sugarcube.app.base.ui.ultrawide.I0) r0
                java.lang.Object r0 = r1.f125332h
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f125331g
                com.sugarcube.core.network.models.SessionMeta r0 = (com.sugarcube.core.network.models.SessionMeta) r0
                java.lang.Object r0 = r1.f125330f
                com.sugarcube.app.base.data.model.VideoMeta r0 = (com.sugarcube.app.base.data.model.VideoMeta) r0
                java.lang.Object r0 = r1.f125329e
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                java.lang.Object r0 = r1.f125328d
                kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
                java.lang.Object r2 = r1.f125327c
                kotlin.jvm.internal.K r2 = (kotlin.jvm.internal.K) r2
                XH.y.b(r51)
                r3 = r11
            L_0x0041:
                r4 = 0
                goto L_0x06cf
            L_0x0044:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x004c:
                XH.y.b(r51)
                kotlin.jvm.internal.K r13 = new kotlin.jvm.internal.K
                r13.<init>()
                r13.f144344a = r2
                kotlin.jvm.internal.O r14 = new kotlin.jvm.internal.O
                r14.<init>()
                java.lang.String r0 = "Save Failure "
                r14.f144348a = r0
                kotlin.jvm.internal.N r15 = new kotlin.jvm.internal.N
                r15.<init>()
                r16 = r3
                long r2 = java.lang.System.currentTimeMillis()
                r15.f144347a = r2
                YE.b r0 = YE.C13868b.f118106a
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m
                int r2 = r2.h1()
                com.sugarcube.app.base.ui.ultrawide.I0 r3 = r1.f125337m
                java.util.UUID r3 = r3.x1()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r17 = r10
                java.lang.String r10 = "save - start("
                r12.append(r10)
                r12.append(r2)
                r12.append(r11)
                r12.append(r3)
                java.lang.String r2 = r12.toString()
                YE.e r3 = YE.e.Capture
                r0.b(r2, r3)
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m
                java.util.List r2 = r2.f125315q1
                com.sugarcube.app.base.data.database.Media r10 = new com.sugarcube.app.base.data.database.Media
                java.io.File r12 = new java.io.File
                r24 = r11
                com.sugarcube.app.base.ui.ultrawide.I0 r11 = r1.f125337m
                java.io.File r11 = r11.r1()
                r25 = r4
                java.lang.String r4 = "rgb.mp4"
                r12.<init>(r11, r4)
                android.net.Uri r11 = android.net.Uri.fromFile(r12)
                java.lang.String r12 = "fromFile(...)"
                kotlin.jvm.internal.C17542s.i(r11, r12)
                com.sugarcube.app.base.data.database.MediaType r21 = com.sugarcube.app.base.data.database.MediaType.VIDEO
                com.sugarcube.app.base.ui.ultrawide.I0$a r26 = com.sugarcube.app.base.ui.ultrawide.I0.f125247A1
                com.sugarcube.app.base.data.model.Dimension r18 = r26.c()
                int r22 = r18.getWidth()
                com.sugarcube.app.base.data.model.Dimension r18 = r26.c()
                int r23 = r18.getHeight()
                java.lang.String r19 = "rgb.mp4"
                r18 = r10
                r20 = r11
                r18.<init>(r19, r20, r21, r22, r23)
                r2.add(r10)
                long r10 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m
                r51 = r4
                boolean r4 = r13.f144344a
                r18 = r5
                r19 = r6
                long r5 = r15.f144347a
                long r5 = r10 - r5
                java.util.UUID r2 = r2.x1()
                r20 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r21 = r14
                java.lang.String r14 = "save - rgb.mp4 ("
                r9.append(r14)
                r9.append(r4)
                java.lang.String r4 = ","
                r9.append(r4)
                r9.append(r5)
                java.lang.String r5 = "ms) - "
                r9.append(r5)
                r9.append(r2)
                java.lang.String r2 = r9.toString()
                r0.b(r2, r3)
                r15.f144347a = r10
                com.sugarcube.app.base.data.model.VideoMeta r2 = new com.sugarcube.app.base.data.model.VideoMeta
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                int r28 = r0.f125296Y0
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                int r29 = r0.f125298Z0
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                double r30 = r0.f125299a1
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.util.List r32 = r0.f125300b1
                com.sugarcube.app.base.data.model.Dimension r34 = r26.c()
                com.sugarcube.app.base.data.model.Dimension r35 = r26.c()
                r37 = 128(0x80, float:1.794E-43)
                r38 = 0
                r33 = 0
                r36 = 0
                r27 = r2
                r27.<init>(r28, r29, r30, r32, r33, r34, r35, r36, r37, r38)
                r3 = 0
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.ultrawide.I0 r6 = r1.f125337m     // Catch:{ IOException -> 0x01a0 }
                java.io.File r6 = r6.X0()     // Catch:{ IOException -> 0x01a0 }
                r0.<init>(r6, r8)     // Catch:{ IOException -> 0x01a0 }
                r6 = 0
                r9 = 1
                WK.L r0 = WK.z.g(r0, r3, r9, r6)     // Catch:{ IOException -> 0x01a0 }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x01a0 }
                com.squareup.moshi.q r6 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x01a0 }
                com.squareup.moshi.t r0 = r0.f125292W0     // Catch:{ all -> 0x01a2 }
                java.lang.Class<com.sugarcube.app.base.data.model.VideoMeta> r9 = com.sugarcube.app.base.data.model.VideoMeta.class
                com.squareup.moshi.f r0 = r0.c(r9)     // Catch:{ all -> 0x01a2 }
                r0.toJson((com.squareup.moshi.q) r6, r2)     // Catch:{ all -> 0x01a2 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01a2 }
                r9 = 0
                jI.C17416c.a(r6, r9)     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x01a0 }
                java.util.List r0 = r0.f125314p1     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.data.database.Metadata r6 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x01a0 }
                java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.ultrawide.I0 r10 = r1.f125337m     // Catch:{ IOException -> 0x01a0 }
                java.io.File r10 = r10.r1()     // Catch:{ IOException -> 0x01a0 }
                r9.<init>(r10, r8)     // Catch:{ IOException -> 0x01a0 }
                android.net.Uri r9 = android.net.Uri.fromFile(r9)     // Catch:{ IOException -> 0x01a0 }
                kotlin.jvm.internal.C17542s.i(r9, r12)     // Catch:{ IOException -> 0x01a0 }
                r6.<init>(r8, r9)     // Catch:{ IOException -> 0x01a0 }
                r0.add(r6)     // Catch:{ IOException -> 0x01a0 }
                r10 = r4
                r11 = r19
                r9 = r20
                r6 = r21
                goto L_0x01ef
            L_0x01a0:
                r0 = move-exception
                goto L_0x01ab
            L_0x01a2:
                r0 = move-exception
                r9 = r0
                throw r9     // Catch:{ all -> 0x01a5 }
            L_0x01a5:
                r0 = move-exception
                r10 = r0
                jI.C17416c.a(r6, r9)     // Catch:{ IOException -> 0x01a0 }
                throw r10     // Catch:{ IOException -> 0x01a0 }
            L_0x01ab:
                r0.printStackTrace()
                java.lang.String r0 = r0.getMessage()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "video_meta.json ("
                r6.append(r9)
                r6.append(r0)
                r6.append(r7)
                java.lang.String r0 = r6.toString()
                YE.b r6 = YE.C13868b.f118106a
                YE.e r9 = YE.e.Capture
                r6.b(r0, r9)
                r13.f144344a = r3
                r6 = r21
                T r9 = r6.f144348a
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r9 = r20
                r10.append(r9)
                r10.append(r0)
                r11 = r19
                r10.append(r11)
                java.lang.String r0 = r10.toString()
                r6.f144348a = r0
                r10 = r4
            L_0x01ef:
                long r3 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                YE.b r14 = YE.C13868b.f118106a
                r20 = r2
                boolean r2 = r13.f144344a
                r21 = r8
                r22 = r9
                long r8 = r15.f144347a
                long r8 = r3 - r8
                java.util.UUID r0 = r0.x1()
                r23 = r11
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r26 = r6
                java.lang.String r6 = "save - video_meta.json ("
                r11.append(r6)
                r11.append(r2)
                r11.append(r10)
                r11.append(r8)
                r11.append(r5)
                r11.append(r0)
                java.lang.String r0 = r11.toString()
                YE.e r2 = YE.e.Capture
                r14.b(r0, r2)
                r15.f144347a = r3
                com.sugarcube.core.network.models.SessionMeta$Companion r27 = com.sugarcube.core.network.models.SessionMeta.Companion
                android.content.Context r0 = r1.f125338n
                r28 = r0
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                OE.q r29 = r0.u1()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                OE.e r30 = r0.f125257E
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.time.Instant r0 = r0.b1()
                r31 = r0
                java.lang.String r2 = "<get-creation>(...)"
                kotlin.jvm.internal.C17542s.i(r0, r2)
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.lang.String r34 = r0.Y0()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.lang.String r35 = r0.Z0()
                r2 = 1
                java.lang.Integer r38 = kotlin.coroutines.jvm.internal.b.e(r2)
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                com.sugarcube.app.base.data.feature.ConfigRepository r0 = r0.f125261G
                java.util.List r42 = r0.getEnabledFeatures()
                r48 = 1015808(0xf8000, float:1.42345E-39)
                r49 = 0
                r32 = 1
                r33 = 0
                java.lang.String r36 = "ULTRAWIDE_LANDSCAPE"
                java.lang.String r37 = "WIDE_LANDSCAPE"
                java.lang.String r39 = "ULTRAWIDE"
                java.lang.String r40 = "LANDSCAPE"
                java.lang.String r41 = "LANDSCAPE"
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                com.sugarcube.core.network.models.SessionMeta r2 = com.sugarcube.app.base.data.model.SessionMetaKt.newInstance$default(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x02ee }
                com.sugarcube.app.base.ui.ultrawide.I0 r3 = r1.f125337m     // Catch:{ IOException -> 0x02ee }
                java.io.File r3 = r3.X0()     // Catch:{ IOException -> 0x02ee }
                r4 = r18
                r0.<init>(r3, r4)     // Catch:{ IOException -> 0x02e3 }
                r3 = 0
                r6 = 0
                r8 = 1
                WK.L r0 = WK.z.g(r0, r6, r8, r3)     // Catch:{ IOException -> 0x02e3 }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x02e3 }
                com.squareup.moshi.q r3 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x02e3 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x02e3 }
                com.squareup.moshi.t r0 = r0.f125292W0     // Catch:{ all -> 0x02e5 }
                java.lang.Class<com.sugarcube.core.network.models.SessionMeta> r6 = com.sugarcube.core.network.models.SessionMeta.class
                com.squareup.moshi.f r0 = r0.c(r6)     // Catch:{ all -> 0x02e5 }
                r0.toJson((com.squareup.moshi.q) r3, r2)     // Catch:{ all -> 0x02e5 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x02e5 }
                r6 = 0
                jI.C17416c.a(r3, r6)     // Catch:{ IOException -> 0x02e3 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x02e3 }
                java.util.List r0 = r0.f125314p1     // Catch:{ IOException -> 0x02e3 }
                com.sugarcube.app.base.data.database.Metadata r3 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x02e3 }
                java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x02e3 }
                com.sugarcube.app.base.ui.ultrawide.I0 r8 = r1.f125337m     // Catch:{ IOException -> 0x02e3 }
                java.io.File r8 = r8.r1()     // Catch:{ IOException -> 0x02e3 }
                r6.<init>(r8, r4)     // Catch:{ IOException -> 0x02e3 }
                android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ IOException -> 0x02e3 }
                kotlin.jvm.internal.C17542s.i(r6, r12)     // Catch:{ IOException -> 0x02e3 }
                r3.<init>(r4, r6)     // Catch:{ IOException -> 0x02e3 }
                r0.add(r3)     // Catch:{ IOException -> 0x02e3 }
                r8 = r15
                r6 = r22
                r9 = r23
                r3 = r26
                goto L_0x0336
            L_0x02e3:
                r0 = move-exception
                goto L_0x02f1
            L_0x02e5:
                r0 = move-exception
                r6 = r0
                throw r6     // Catch:{ all -> 0x02e8 }
            L_0x02e8:
                r0 = move-exception
                r8 = r0
                jI.C17416c.a(r3, r6)     // Catch:{ IOException -> 0x02e3 }
                throw r8     // Catch:{ IOException -> 0x02e3 }
            L_0x02ee:
                r0 = move-exception
                r4 = r18
            L_0x02f1:
                r0.printStackTrace()
                java.lang.String r0 = r0.getMessage()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "session_meta.json ("
                r3.append(r6)
                r3.append(r0)
                r3.append(r7)
                java.lang.String r0 = r3.toString()
                YE.b r3 = YE.C13868b.f118106a
                YE.e r6 = YE.e.Capture
                r3.b(r0, r6)
                r3 = 0
                r13.f144344a = r3
                r3 = r26
                T r6 = r3.f144348a
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r6 = r22
                r8.append(r6)
                r8.append(r0)
                r9 = r23
                r8.append(r9)
                java.lang.String r0 = r8.toString()
                r3.f144348a = r0
                r8 = r15
            L_0x0336:
                long r14 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                YE.b r11 = YE.C13868b.f118106a
                r18 = r2
                boolean r2 = r13.f144344a
                r26 = r3
                r22 = r4
                long r3 = r8.f144347a
                long r3 = r14 - r3
                java.util.UUID r0 = r0.x1()
                r23 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r27 = r6
                java.lang.String r6 = "save - session_meta.json ("
                r9.append(r6)
                r9.append(r2)
                r9.append(r10)
                r9.append(r3)
                r9.append(r5)
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                YE.e r2 = YE.e.Capture
                r11.b(r0, r2)
                r8.f144347a = r14
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x03b5 }
                com.sugarcube.app.base.ui.ultrawide.Z r0 = r0.f125294X0     // Catch:{ IOException -> 0x03b5 }
                java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x03b5 }
                com.sugarcube.app.base.ui.ultrawide.I0 r3 = r1.f125337m     // Catch:{ IOException -> 0x03b5 }
                java.io.File r3 = r3.X0()     // Catch:{ IOException -> 0x03b5 }
                r4 = r25
                r2.<init>(r3, r4)     // Catch:{ IOException -> 0x03b3 }
                r0.q(r2)     // Catch:{ IOException -> 0x03b3 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x03b3 }
                java.util.List r0 = r0.f125314p1     // Catch:{ IOException -> 0x03b3 }
                com.sugarcube.app.base.data.database.Metadata r2 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x03b3 }
                java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x03b3 }
                com.sugarcube.app.base.ui.ultrawide.I0 r6 = r1.f125337m     // Catch:{ IOException -> 0x03b3 }
                java.io.File r6 = r6.r1()     // Catch:{ IOException -> 0x03b3 }
                r3.<init>(r6, r4)     // Catch:{ IOException -> 0x03b3 }
                android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x03b3 }
                kotlin.jvm.internal.C17542s.i(r3, r12)     // Catch:{ IOException -> 0x03b3 }
                r2.<init>(r4, r3)     // Catch:{ IOException -> 0x03b3 }
                r0.add(r2)     // Catch:{ IOException -> 0x03b3 }
                r9 = r23
                r2 = r26
                r3 = r27
                goto L_0x03fc
            L_0x03b3:
                r0 = move-exception
                goto L_0x03b8
            L_0x03b5:
                r0 = move-exception
                r4 = r25
            L_0x03b8:
                r0.printStackTrace()
                java.lang.String r0 = r0.getMessage()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "capture_meta.json ("
                r2.append(r3)
                r2.append(r0)
                r2.append(r7)
                java.lang.String r0 = r2.toString()
                YE.b r2 = YE.C13868b.f118106a
                YE.e r3 = YE.e.Capture
                r2.b(r0, r3)
                r2 = 0
                r13.f144344a = r2
                r2 = r26
                T r3 = r2.f144348a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                r3 = r27
                r6.append(r3)
                r6.append(r0)
                r9 = r23
                r6.append(r9)
                java.lang.String r0 = r6.toString()
                r2.f144348a = r0
            L_0x03fc:
                long r14 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                YE.b r11 = YE.C13868b.f118106a
                boolean r6 = r13.f144344a
                r27 = r3
                r25 = r4
                long r3 = r8.f144347a
                long r3 = r14 - r3
                java.util.UUID r0 = r0.x1()
                r23 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r26 = r2
                java.lang.String r2 = "save - capture_meta.json ("
                r9.append(r2)
                r9.append(r6)
                r9.append(r10)
                r9.append(r3)
                r9.append(r5)
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                YE.e r2 = YE.e.Capture
                r11.b(r0, r2)
                r8.f144347a = r14
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m     // Catch:{ IOException -> 0x0492 }
                java.io.File r2 = r2.X0()     // Catch:{ IOException -> 0x0492 }
                r3 = r16
                r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0492 }
                r2 = 0
                r4 = 0
                r6 = 1
                WK.L r0 = WK.z.g(r0, r4, r6, r2)     // Catch:{ IOException -> 0x0492 }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x0492 }
                com.squareup.moshi.q r2 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.data.model.QualityMeta r4 = r1.f125339o     // Catch:{ IOException -> 0x0492 }
                com.squareup.moshi.t r0 = r0.f125292W0     // Catch:{ all -> 0x0494 }
                java.lang.Class<com.sugarcube.app.base.data.model.QualityMeta> r6 = com.sugarcube.app.base.data.model.QualityMeta.class
                com.squareup.moshi.f r0 = r0.c(r6)     // Catch:{ all -> 0x0494 }
                r0.toJson((com.squareup.moshi.q) r2, r4)     // Catch:{ all -> 0x0494 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0494 }
                r4 = 0
                jI.C17416c.a(r2, r4)     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m     // Catch:{ IOException -> 0x0492 }
                java.util.List r0 = r0.f125314p1     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.data.database.Metadata r2 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x0492 }
                java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0492 }
                com.sugarcube.app.base.ui.ultrawide.I0 r6 = r1.f125337m     // Catch:{ IOException -> 0x0492 }
                java.io.File r6 = r6.r1()     // Catch:{ IOException -> 0x0492 }
                r4.<init>(r6, r3)     // Catch:{ IOException -> 0x0492 }
                android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ IOException -> 0x0492 }
                kotlin.jvm.internal.C17542s.i(r4, r12)     // Catch:{ IOException -> 0x0492 }
                r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0492 }
                r0.add(r2)     // Catch:{ IOException -> 0x0492 }
                r2 = r26
                r3 = r27
                goto L_0x04e1
            L_0x0492:
                r0 = move-exception
                goto L_0x049d
            L_0x0494:
                r0 = move-exception
                r3 = r0
                throw r3     // Catch:{ all -> 0x0497 }
            L_0x0497:
                r0 = move-exception
                r4 = r0
                jI.C17416c.a(r2, r3)     // Catch:{ IOException -> 0x0492 }
                throw r4     // Catch:{ IOException -> 0x0492 }
            L_0x049d:
                r0.printStackTrace()
                java.lang.String r0 = r0.getMessage()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "quality_meta.json ("
                r2.append(r3)
                r2.append(r0)
                r2.append(r7)
                java.lang.String r0 = r2.toString()
                YE.b r2 = YE.C13868b.f118106a
                YE.e r3 = YE.e.Capture
                r2.b(r0, r3)
                r2 = 0
                r13.f144344a = r2
                r2 = r26
                T r3 = r2.f144348a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r3 = r27
                r4.append(r3)
                r4.append(r0)
                r6 = r23
                r4.append(r6)
                java.lang.String r0 = r4.toString()
                r2.f144348a = r0
            L_0x04e1:
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                YE.b r4 = YE.C13868b.f118106a
                boolean r9 = r13.f144344a
                long r11 = r8.f144347a
                long r11 = r6 - r11
                java.util.UUID r0 = r0.x1()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r14 = "save - quality_meta.json ("
                r15.append(r14)
                r15.append(r9)
                r15.append(r10)
                r15.append(r11)
                r15.append(r5)
                r15.append(r0)
                java.lang.String r0 = r15.toString()
                YE.e r9 = YE.e.Capture
                r4.b(r0, r9)
                r8.f144347a = r6
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.io.File r0 = r0.X0()
                com.sugarcube.app.base.ui.ultrawide.I0 r6 = r1.f125337m
                java.io.File r6 = r6.r1()
                boolean r0 = r0.renameTo(r6)
                if (r0 != 0) goto L_0x052c
                r6 = 0
                r13.f144344a = r6
            L_0x052c:
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                boolean r11 = r13.f144344a
                long r14 = r8.f144347a
                long r14 = r6 - r14
                java.util.UUID r0 = r0.x1()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r27 = r3
                java.lang.String r3 = "save - cache renamed("
                r12.append(r3)
                r12.append(r11)
                r12.append(r10)
                r12.append(r14)
                r3 = r24
                r12.append(r3)
                r12.append(r0)
                java.lang.String r0 = r12.toString()
                r4.b(r0, r9)
                r8.f144347a = r6
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                java.io.File r0 = r0.X0()
                jI.C17423j.r(r0)
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.I0 r0 = r1.f125337m
                boolean r11 = r13.f144344a
                long r14 = r8.f144347a
                long r14 = r6 - r14
                java.util.UUID r0 = r0.x1()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r26 = r2
                java.lang.String r2 = "save - cache deleted("
                r12.append(r2)
                r12.append(r11)
                r12.append(r10)
                r12.append(r14)
                r12.append(r5)
                r12.append(r0)
                java.lang.String r0 = r12.toString()
                r4.b(r0, r9)
                r8.f144347a = r6
                r6 = r51
                r5 = r21
                r4 = r22
                r2 = r25
                java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r2}
                java.util.Set r0 = YH.g0.f(r0)
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m
                kotlin.jvm.internal.V r4 = kotlin.jvm.internal.V.f144353a
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)
                java.lang.String r4 = "pano_0_meta.json"
                java.lang.String r4 = java.lang.String.format(r4, r5)
                java.lang.String r5 = "format(...)"
                kotlin.jvm.internal.C17542s.i(r4, r5)
                r0.add(r4)
                java.util.List r2 = r2.f125310l1
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
            L_0x05d3:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0604
                r6 = 1
                int r7 = r4 + 1
                java.lang.Object r6 = r2.next()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6.booleanValue()
                kotlin.jvm.internal.V r6 = kotlin.jvm.internal.V.f144353a
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.e(r4)
                java.lang.String r6 = "jpg"
                java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
                r6 = 2
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
                java.lang.String r6 = "colorPano_0_%01d.%s"
                java.lang.String r4 = java.lang.String.format(r6, r4)
                kotlin.jvm.internal.C17542s.i(r4, r5)
                r0.add(r4)
                r4 = r7
                goto L_0x05d3
            L_0x0604:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.sugarcube.app.base.ui.ultrawide.I0 r2 = r1.f125337m
                java.util.Iterator r4 = r0.iterator()
            L_0x060c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x069c
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.io.File r6 = new java.io.File
                java.io.File r7 = r2.r1()
                r6.<init>(r7, r5)
                boolean r7 = r6.exists()
                long r11 = r6.length()
                YE.b r6 = YE.C13868b.f118106a
                java.util.UUID r9 = r2.x1()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r14 = "check - "
                r15.append(r14)
                r15.append(r5)
                java.lang.String r14 = " ("
                r15.append(r14)
                r15.append(r7)
                r15.append(r10)
                r15.append(r11)
                r15.append(r3)
                r15.append(r9)
                java.lang.String r9 = r15.toString()
                YE.e r15 = YE.e.Capture
                r6.b(r9, r15)
                if (r7 == 0) goto L_0x0661
                r21 = 0
                int r6 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r6 != 0) goto L_0x0663
            L_0x0661:
                r6 = 0
                goto L_0x0668
            L_0x0663:
                r6 = r26
                r15 = r27
                goto L_0x0696
            L_0x0668:
                r13.f144344a = r6
                r9 = r14
                r6 = r26
                T r15 = r6.f144348a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r15)
                r15 = r27
                r14.append(r15)
                r14.append(r5)
                r14.append(r9)
                r14.append(r7)
                r14.append(r10)
                r14.append(r11)
                java.lang.String r5 = ")]"
                r14.append(r5)
                java.lang.String r5 = r14.toString()
                r6.f144348a = r5
            L_0x0696:
                r26 = r6
                r27 = r15
                goto L_0x060c
            L_0x069c:
                r6 = r26
                boolean r5 = r13.f144344a
                if (r5 == 0) goto L_0x06d4
                com.sugarcube.app.base.ui.ultrawide.I0 r5 = r1.f125337m
                java.util.UUID r7 = r5.x1()
                r1.f125327c = r13
                r1.f125328d = r6
                r1.f125329e = r8
                r8 = r20
                r1.f125330f = r8
                r8 = r18
                r1.f125331g = r8
                r1.f125332h = r0
                r1.f125333i = r2
                r1.f125334j = r4
                r2 = 0
                r1.f125335k = r2
                r2 = 1
                r1.f125336l = r2
                java.lang.Object r0 = r5.Q1(r7, r1)
                r2 = r17
                if (r0 != r2) goto L_0x06cb
                return r2
            L_0x06cb:
                r0 = r6
                r2 = r13
                goto L_0x0041
            L_0x06cf:
                r0.f144348a = r4
                r14 = r0
                r13 = r2
                goto L_0x06d5
            L_0x06d4:
                r14 = r6
            L_0x06d5:
                T r0 = r14.f144348a
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x06e2
                YE.b r2 = YE.C13868b.f118106a
                YE.e r4 = YE.e.Capture
                r2.b(r0, r4)
            L_0x06e2:
                YE.b r0 = YE.C13868b.f118106a
                boolean r2 = r13.f144344a
                com.sugarcube.app.base.ui.ultrawide.I0 r4 = r1.f125337m
                java.util.UUID r4 = r4.x1()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "save - done ("
                r5.append(r6)
                r5.append(r2)
                r5.append(r3)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                YE.e r3 = YE.e.Capture
                r0.b(r2, r3)
                XH.v r0 = new XH.v
                boolean r2 = r13.f144344a
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
                T r3 = r14.f144348a
                r0.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel", f = "UltrawideViewModel.kt", l = {632, 644, 669, 685}, m = "isQualityOk")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125340c;

        /* renamed from: d  reason: collision with root package name */
        Object f125341d;

        /* renamed from: e  reason: collision with root package name */
        Object f125342e;

        /* renamed from: f  reason: collision with root package name */
        Object f125343f;

        /* renamed from: g  reason: collision with root package name */
        int f125344g;

        /* renamed from: h  reason: collision with root package name */
        float f125345h;

        /* renamed from: i  reason: collision with root package name */
        long f125346i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f125347j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ I0 f125348k;

        /* renamed from: l  reason: collision with root package name */
        int f125349l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(I0 i02, C17164e<? super c> eVar) {
            super(eVar);
            this.f125348k = i02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125347j = obj;
            this.f125349l |= Integer.MIN_VALUE;
            return this.f125348k.F1((QualityMeta) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel", f = "UltrawideViewModel.kt", l = {697, 699, 703, 706, 719, 725}, m = "saveCapture")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125350c;

        /* renamed from: d  reason: collision with root package name */
        Object f125351d;

        /* renamed from: e  reason: collision with root package name */
        Object f125352e;

        /* renamed from: f  reason: collision with root package name */
        Object f125353f;

        /* renamed from: g  reason: collision with root package name */
        Object f125354g;

        /* renamed from: h  reason: collision with root package name */
        Object f125355h;

        /* renamed from: i  reason: collision with root package name */
        Object f125356i;

        /* renamed from: j  reason: collision with root package name */
        Object f125357j;

        /* renamed from: k  reason: collision with root package name */
        Object f125358k;

        /* renamed from: l  reason: collision with root package name */
        long f125359l;

        /* renamed from: m  reason: collision with root package name */
        long f125360m;

        /* renamed from: n  reason: collision with root package name */
        int f125361n;

        /* renamed from: o  reason: collision with root package name */
        int f125362o;

        /* renamed from: p  reason: collision with root package name */
        boolean f125363p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f125364q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ I0 f125365r;

        /* renamed from: s  reason: collision with root package name */
        int f125366s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(I0 i02, C17164e<? super d> eVar) {
            super(eVar);
            this.f125365r = i02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125364q = obj;
            this.f125366s |= Integer.MIN_VALUE;
            return this.f125365r.N1((Context) null, (C14304j) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$savePano$2", f = "UltrawideViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super v<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125368d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, I0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((I0) this.receiver).L1(exc);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17642l<Exception, C16807N> {
            b(Object obj) {
                super(1, obj, I0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((I0) this.receiver).L1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(I0 i02, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f125368d = i02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f125368d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super v<Boolean, String>> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            Throwable th2;
            C13868b bVar;
            File file;
            String str4;
            String str5;
            boolean f10;
            C17187b.f();
            if (this.f125367c == 0) {
                y.b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = r6;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = r7;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = r8;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = r9;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = r10;
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = r11;
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = r12;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = r13;
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = r14;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = r16;
                ArrayList arrayList20 = new ArrayList();
                PanoMeta panoMeta = r4;
                ArrayList arrayList21 = r16;
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = r17;
                ArrayList arrayList24 = new ArrayList();
                ArrayList arrayList25 = r18;
                ArrayList arrayList26 = new ArrayList();
                ArrayList arrayList27 = r19;
                ArrayList arrayList28 = new ArrayList();
                ArrayList arrayList29 = r20;
                ArrayList arrayList30 = new ArrayList();
                ArrayList arrayList31 = r21;
                ArrayList arrayList32 = new ArrayList();
                PanoMeta panoMeta2 = new PanoMeta(arrayList, arrayList3, arrayList5, arrayList7, arrayList9, arrayList11, arrayList13, arrayList15, arrayList17, arrayList19, arrayList21, arrayList23, arrayList25, arrayList27, arrayList29, arrayList31);
                C13868b.f118106a.b("savePano(" + this.f125368d.h1() + ") - " + this.f125368d.x1(), YE.e.Capture);
                String str6 = "]";
                if (this.f125368d.f125304f1.size() != 1) {
                    return new v(kotlin.coroutines.jvm.internal.b.a(false), "Pano Save Failure [panoImage count=" + this.f125368d.f125304f1.size() + str6);
                }
                I0 i02 = this.f125368d;
                int size = i02.f125304f1.size();
                ArrayList arrayList33 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList33.add(kotlin.coroutines.jvm.internal.b.a(false));
                }
                i02.f125310l1 = arrayList33;
                Iterator it = this.f125368d.f125304f1.iterator();
                int i11 = 0;
                while (true) {
                    str = str6;
                    if (it.hasNext()) {
                        Bitmap bitmap = (Bitmap) it.next();
                        Iterator it2 = it;
                        int i12 = i11 + 1;
                        File X02 = this.f125368d.X0();
                        V v10 = V.f144353a;
                        str4 = "Pano Save Failure [";
                        str5 = ")";
                        String format = String.format("colorPano_0_%01d.%s", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.e(i11), "jpg"}, 2));
                        C17542s.i(format, "format(...)");
                        file = new File(X02, format);
                        f10 = C13341c.f(bitmap, file, this.f125368d.h1(), new b(this.f125368d));
                        if (!f10 || !file.exists() || file.length() <= 0) {
                            boolean z10 = f10;
                            String str7 = AnyKt.SUGARCUBE_TAG;
                            String str8 = file.getName() + "(" + z10 + "," + file.exists() + "," + file.length() + str5;
                            Log.d(str7, str8);
                            C13868b.f118106a.b(str8, YE.e.Capture);
                        } else {
                            List w02 = this.f125368d.f125315q1;
                            String str9 = AnyKt.SUGARCUBE_TAG;
                            String name = file.getName();
                            C17542s.i(name, "getName(...)");
                            boolean z11 = f10;
                            Uri fromFile = Uri.fromFile(new File(this.f125368d.r1(), file.getName()));
                            C17542s.i(fromFile, "fromFile(...)");
                            w02.add(new Media(name, fromFile, MediaType.IMAGE, bitmap.getWidth(), bitmap.getHeight()));
                            I0 i03 = this.f125368d;
                            panoMeta.getPoseIndexes().add(kotlin.coroutines.jvm.internal.b.e(i11));
                            panoMeta.getShutterSpeeds().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getIso().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getEvOffsets().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getLensPosition().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getExposureBias().add(kotlin.coroutines.jvm.internal.b.e(0));
                            panoMeta.getWhiteBalanceGains().add(kotlin.coroutines.jvm.internal.b.e(0));
                            panoMeta.getMaxWhiteBalanceGain().add(new float[0]);
                            panoMeta.getGrayWorldWhiteBalanceGain().add(new float[0]);
                            panoMeta.getWhiteBalanceChromacity().add(new float[0]);
                            panoMeta.getWhiteBalanceTemperature().add(new float[0]);
                            panoMeta.getAperture().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getAmbientIntensity().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getAmbientColorTemperature().add(kotlin.coroutines.jvm.internal.b.d(0.0f));
                            panoMeta.getAnchorPose().add(i03.f125306h1.get(i11));
                            panoMeta.getStates().add(i03.f125308j1.get(i11) + "," + i03.f125305g1.get(i11));
                            long currentTimeMillis2 = System.currentTimeMillis();
                            I0 i04 = this.f125368d;
                            String str10 = "save - " + file.getName() + " (" + z11 + "," + (currentTimeMillis2 - currentTimeMillis) + "ms) - " + i04.x1();
                            Log.d(str9, str10);
                            C13868b.f118106a.b(str10, YE.e.Capture);
                            currentTimeMillis = currentTimeMillis2;
                            str6 = str;
                            it = it2;
                            i11 = i12;
                        }
                    } else {
                        String str11 = AnyKt.SUGARCUBE_TAG;
                        String str12 = "Pano Save Failure [";
                        String str13 = ")";
                        String str14 = "ms) - ";
                        String str15 = str;
                        try {
                            str2 = str12;
                            str3 = str15;
                            try {
                                com.squareup.moshi.q q10 = com.squareup.moshi.q.q(WK.y.c(z.g(new File(this.f125368d.X0(), "pano_0_meta.json"), false, 1, (Object) null)));
                                try {
                                    this.f125368d.f125292W0.c(PanoMeta.class).toJson(q10, panoMeta);
                                    C16807N n10 = C16807N.f139792a;
                                    C17416c.a(q10, (Throwable) null);
                                    List y02 = this.f125368d.f125314p1;
                                    Uri fromFile2 = Uri.fromFile(new File(this.f125368d.r1(), "pano_0_meta.json"));
                                    C17542s.i(fromFile2, "fromFile(...)");
                                    y02.add(new com.sugarcube.app.base.data.database.Metadata("pano_0_meta.json", fromFile2));
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    String str16 = "save - " + "pano_0_meta.json" + " (true," + (currentTimeMillis3 - currentTimeMillis) + str14 + this.f125368d.x1();
                                    Log.d(str11, str16);
                                    C13868b bVar2 = C13868b.f118106a;
                                    YE.e eVar = YE.e.Capture;
                                    bVar2.b(str16, eVar);
                                    this.f125368d.S0();
                                    Bitmap k12 = this.f125368d.k1();
                                    if (k12 != null) {
                                        I0 i05 = this.f125368d;
                                        File file2 = new File(i05.X0(), "mosaic.png");
                                        boolean h10 = C13341c.h(k12, file2, new a(i05));
                                        if (h10) {
                                            List w03 = i05.f125315q1;
                                            String name2 = file2.getName();
                                            C17542s.i(name2, "getName(...)");
                                            bVar = bVar2;
                                            Uri fromFile3 = Uri.fromFile(new File(i05.r1(), file2.getName()));
                                            C17542s.i(fromFile3, "fromFile(...)");
                                            w03.add(new Media(name2, fromFile3, MediaType.MOSAIC, k12.getWidth(), k12.getHeight()));
                                        } else {
                                            bVar = bVar2;
                                        }
                                        long currentTimeMillis4 = System.currentTimeMillis();
                                        String str17 = "save - mosaic(" + h10 + "," + (currentTimeMillis4 - currentTimeMillis3) + str14 + i05.x1();
                                        Log.d(str11, str17);
                                        bVar.b(str17, eVar);
                                        kotlin.coroutines.jvm.internal.b.f(currentTimeMillis4);
                                    }
                                    return new v(kotlin.coroutines.jvm.internal.b.a(true), null);
                                } catch (Throwable th3) {
                                    Throwable th4 = th3;
                                    C17416c.a(q10, th2);
                                    throw th4;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                e.printStackTrace();
                                String str18 = "pano_0_meta.json" + " (" + e.getMessage() + str13;
                                Log.d(str11, str18);
                                C13868b.f118106a.b(str18, YE.e.Capture);
                                return new v(kotlin.coroutines.jvm.internal.b.a(false), str2 + str18 + str3);
                            }
                        } catch (IOException e11) {
                            e = e11;
                            str2 = str12;
                            str3 = str15;
                            e.printStackTrace();
                            String str182 = "pano_0_meta.json" + " (" + e.getMessage() + str13;
                            Log.d(str11, str182);
                            C13868b.f118106a.b(str182, YE.e.Capture);
                            return new v(kotlin.coroutines.jvm.internal.b.a(false), str2 + str182 + str3);
                        }
                    }
                }
                boolean z102 = f10;
                String str72 = AnyKt.SUGARCUBE_TAG;
                String str82 = file.getName() + "(" + z102 + "," + file.exists() + "," + file.length() + str5;
                Log.d(str72, str82);
                C13868b.f118106a.b(str82, YE.e.Capture);
                return new v(kotlin.coroutines.jvm.internal.b.a(false), str4 + str82 + str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$setAlignmentBitmap$2", f = "UltrawideViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Object>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125370d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bitmap f125371e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, I0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((I0) this.receiver).L1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(I0 i02, Bitmap bitmap, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f125370d = i02;
            this.f125371e = bitmap;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f125370d, this.f125371e, eVar);
        }

        public final Object invoke(Q q10, C17164e<Object> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125369c == 0) {
                y.b(obj);
                this.f125370d.f125291V0 = this.f125371e;
                try {
                    return kotlin.coroutines.jvm.internal.b.a(C13341c.f(this.f125371e, new File(this.f125370d.X0(), "pano_alignment.jpg"), this.f125370d.h1(), new a(this.f125370d)));
                } catch (Exception unused) {
                    return C16807N.f139792a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$setCapturePreferences$2", f = "UltrawideViewModel.kt", l = {1003, 1006, 1007}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f125372c;

        /* renamed from: d  reason: collision with root package name */
        int f125373d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ I0 f125374e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f125375f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(I0 i02, UUID uuid, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f125374e = i02;
            this.f125375f = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f125374e, this.f125375f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f125373d
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
                boolean r1 = r6.f125372c
                XH.y.b(r7)
                goto L_0x005c
            L_0x0023:
                XH.y.b(r7)
                goto L_0x003b
            L_0x0027:
                XH.y.b(r7)
                com.sugarcube.app.base.ui.ultrawide.I0 r7 = r6.f125374e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f125261G
                com.sugarcube.app.base.data.feature.ConfigItems$CaptureFeedbackPromptWasPresented r1 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE
                r6.f125373d = r4
                java.lang.Object r7 = r7.get(r1, r6)
                if (r7 != r0) goto L_0x003b
                return r0
            L_0x003b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r1 = r7.booleanValue()
                if (r1 != 0) goto L_0x0075
                com.sugarcube.app.base.ui.ultrawide.I0 r7 = r6.f125374e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f125261G
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r4 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                java.util.UUID r5 = r6.f125375f
                java.lang.String r5 = r5.toString()
                r6.f125372c = r1
                r6.f125373d = r3
                java.lang.Object r7 = r7.override(r4, r5, r6)
                if (r7 != r0) goto L_0x005c
                return r0
            L_0x005c:
                com.sugarcube.app.base.ui.ultrawide.I0 r7 = r6.f125374e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f125261G
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureType r3 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureType.INSTANCE
                com.sugarcube.app.base.ui.ultrawide.I0 r4 = r6.f125374e
                java.lang.String r4 = r4.Z0()
                r6.f125372c = r1
                r6.f125373d = r2
                java.lang.Object r7 = r7.override(r3, r4, r6)
                if (r7 != r0) goto L_0x0075
                return r0
            L_0x0075:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$showPrivacyDisclaimerDialog$1$1", f = "UltrawideViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(I0 i02, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f125377d = i02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f125377d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125376c == 0) {
                y.b(obj);
                this.f125377d.f125267J.captureLinkClicked();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$showPrivacyDisclaimerDialog$2$1", f = "UltrawideViewModel.kt", l = {1215}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f125379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ I0 f125380e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4899r0<Boolean> r0Var, I0 i02, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f125379d = r0Var;
            this.f125380e = i02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f125379d, this.f125380e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125378c;
            if (i10 == 0) {
                y.b(obj);
                this.f125379d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                PrivacyPolicyConsentUseCase F02 = this.f125380e.f125267J;
                this.f125378c = 1;
                obj = F02.capturePositiveAction(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f125379d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            if (booleanValue) {
                this.f125380e.f125277O.postValue(C15083h.a.f131169a);
            } else {
                this.f125380e.f125322x1.postValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$showPrivacyDisclaimerDialog$3$1", f = "UltrawideViewModel.kt", l = {1229}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(I0 i02, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f125382d = i02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f125382d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125381c;
            if (i10 == 0) {
                y.b(obj);
                PrivacyPolicyConsentUseCase F02 = this.f125382d.f125267J;
                this.f125381c = 1;
                if (F02.captureNegativeAction(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f125382d.f125277O.postValue(C15083h.a.f131169a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$showPrivacyDisclaimerDialog$5$1", f = "UltrawideViewModel.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125384d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f125385e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(I0 i02, boolean z10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f125384d = i02;
            this.f125385e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f125384d, this.f125385e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125383c == 0) {
                y.b(obj);
                this.f125384d.f125267J.captureUpdateCheckBoxState(this.f125385e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel$showPrivacyDisclaimerDialog$6$1", f = "UltrawideViewModel.kt", l = {}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125386c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I0 f125387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(I0 i02, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f125387d = i02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f125387d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125386c == 0) {
                y.b(obj);
                this.f125387d.f125267J.captureLinkClicked();
                this.f125387d.f125281Q.setValue(this.f125387d.f125267J.generatePrivacyPolicyLink());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideViewModel", f = "UltrawideViewModel.kt", l = {528}, m = "startAR")
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125388c;

        /* renamed from: d  reason: collision with root package name */
        Object f125389d;

        /* renamed from: e  reason: collision with root package name */
        Object f125390e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f125391f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ I0 f125392g;

        /* renamed from: h  reason: collision with root package name */
        int f125393h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(I0 i02, C17164e<? super m> eVar) {
            super(eVar);
            this.f125392g = i02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125391f = obj;
            this.f125393h |= Integer.MIN_VALUE;
            return this.f125392g.q2((C14304j) null, this);
        }
    }

    public I0(Context context, SceneRepository sceneRepository, q qVar, C13313e eVar, VideoAssetRepository videoAssetRepository, ConfigRepository configRepository, C13147a aVar, C13164r rVar, IUploaderV2 iUploaderV2, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase, UserRepo userRepo, U u10, FirebaseInteractions firebaseInteractions) {
        C17542s.j(context, "context");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(videoAssetRepository, "assetRepository");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(aVar, "files");
        C17542s.j(rVar, "uploadVersion");
        C17542s.j(iUploaderV2, "uploaderV2");
        C17542s.j(privacyPolicyConsentUseCase, "privacyPolicyConsentUseCase");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(firebaseInteractions, "firebaseInteractions");
        this.f125253C = sceneRepository;
        this.f125255D = qVar;
        this.f125257E = eVar;
        this.f125259F = videoAssetRepository;
        this.f125261G = configRepository;
        this.f125263H = rVar;
        this.f125265I = iUploaderV2;
        this.f125267J = privacyPolicyConsentUseCase;
        this.f125269K = userRepo;
        this.f125271L = u10;
        this.f125273M = firebaseInteractions;
        boolean z10 = true;
        K<C15083h> k10 = new K<>();
        this.f125277O = k10;
        this.f125279P = k10;
        this.f125281Q = new K<>();
        this.f125283R = new K<>(null);
        K<C16807N> k11 = new K<>();
        this.f125285S = k11;
        this.f125287T = k11;
        UUID uuid = (UUID) u10.f("captureUuid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            u10.m("captureUuid", uuid);
            C17542s.i(uuid, "also(...)");
        }
        this.f125293X = uuid;
        this.f125295Y = Instant.now();
        RoomType roomType = RoomType.UNKNOWN;
        this.f125297Z = roomType;
        this.f125323y0 = roomType.getApiKey();
        this.f125325z0 = f125247A1.a(context);
        this.f125251A0 = "ULTRAWIDE_LANDSCAPE";
        this.f125252B0 = "CAMPANO_ARSCAN_ARSTEP_ARSCAN";
        this.f125254C0 = "CAMPANO";
        this.f125256D0 = C17978n.m(((Integer) configRepository.getBlocking(ConfigItems.JPEGPanoQuality.INSTANCE)).intValue(), 60, 100);
        this.f125258E0 = configRepository.isEnabledBlocking(FeatureFlags.ShowPoints.INSTANCE);
        this.f125260F0 = configRepository.isEnabledBlocking(FeatureFlags.ShowPlanes.INSTANCE);
        boolean isEnabledBlocking = configRepository.isEnabledBlocking(FeatureFlags.CaptureArInitStepFlag.INSTANCE);
        this.f125262G0 = isEnabledBlocking;
        boolean z11 = isEnabledBlocking || configRepository.isEnabledBlocking(FeatureFlags.CaptureArInitFlag.INSTANCE);
        this.f125264H0 = z11;
        if (!z11 && !configRepository.isEnabledBlocking(FeatureFlags.CaptureUseAnchorsFlag.INSTANCE)) {
            z10 = false;
        }
        this.f125266I0 = z10;
        this.f125268J0 = ((Integer) configRepository.getBlocking(ConfigItems.CaptureFloorMinimum.INSTANCE)).intValue();
        this.f125270K0 = ((Integer) configRepository.getBlocking(ConfigItems.CaptureFloorTimeoutLimit.INSTANCE)).intValue();
        File b10 = aVar.b(uuid);
        this.f125276N0 = b10;
        this.f125278O0 = aVar.e(uuid);
        this.f125280P0 = new File(b10, "rgb.mp4").getAbsolutePath();
        this.f125286S0 = new float[16];
        t d10 = new t.b().c(new C13286b()).d();
        this.f125292W0 = d10;
        C17542s.i(d10, "moshi");
        this.f125294X0 = new Z(firebaseInteractions, d10, z10, z11);
        this.f125300b1 = new ArrayList();
        this.f125301c1 = System.nanoTime();
        this.f125303e1 = new ArrayList();
        this.f125304f1 = new ArrayList();
        this.f125305g1 = new ArrayList();
        this.f125306h1 = new ArrayList();
        this.f125307i1 = new ArrayList();
        this.f125308j1 = new ArrayList();
        this.f125309k1 = new C14286a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);
        ArrayList arrayList = new ArrayList(5);
        for (int i10 = 0; i10 < 5; i10++) {
            arrayList.add(Boolean.FALSE);
        }
        this.f125310l1 = arrayList;
        this.f125314p1 = new ArrayList();
        this.f125315q1 = new ArrayList();
        this.f125316r1 = 0.05f;
        this.f125321w1 = C5210m.c(this.f125269K.isLoggedIn(), g0.a(this).getCoroutineContext(), 0, 2, (Object) null);
        K<Boolean> k12 = new K<>(Boolean.FALSE);
        this.f125322x1 = k12;
        this.f125324y1 = k12;
        this.f125326z1 = C5210m.c(this.f125267J.getPrivacyPolicyState(), (C17168i) null, 0, 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F1(com.sugarcube.app.base.data.model.QualityMeta r37, dI.C17164e<? super XH.v<java.lang.Boolean, java.lang.String>> r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r38
            boolean r2 = r1 instanceof com.sugarcube.app.base.ui.ultrawide.I0.c
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.ui.ultrawide.I0$c r2 = (com.sugarcube.app.base.ui.ultrawide.I0.c) r2
            int r3 = r2.f125349l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f125349l = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.ui.ultrawide.I0$c r2 = new com.sugarcube.app.base.ui.ultrawide.I0$c
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f125347j
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f125349l
            java.lang.String r6 = ")]"
            java.lang.String r7 = ">"
            r8 = 4
            r9 = 3
            r10 = 2
            r12 = 1
            if (r5 == 0) goto L_0x00a9
            if (r5 == r12) goto L_0x008c
            if (r5 == r10) goto L_0x0073
            if (r5 == r9) goto L_0x005a
            if (r5 != r8) goto L_0x0052
            long r4 = r2.f125346i
            int r1 = r2.f125344g
            java.lang.Object r8 = r2.f125343f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f125342e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r2.f125341d
            com.sugarcube.app.base.data.model.QualityMeta r9 = (com.sugarcube.app.base.data.model.QualityMeta) r9
            java.lang.Object r2 = r2.f125340c
            com.sugarcube.app.base.ui.ultrawide.I0 r2 = (com.sugarcube.app.base.ui.ultrawide.I0) r2
            XH.y.b(r3)
            r9 = r6
            r17 = r7
            goto L_0x026e
        L_0x0052:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005a:
            float r1 = r2.f125345h
            int r5 = r2.f125344g
            java.lang.Object r9 = r2.f125343f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f125342e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r13 = r2.f125341d
            com.sugarcube.app.base.data.model.QualityMeta r13 = (com.sugarcube.app.base.data.model.QualityMeta) r13
            java.lang.Object r14 = r2.f125340c
            com.sugarcube.app.base.ui.ultrawide.I0 r14 = (com.sugarcube.app.base.ui.ultrawide.I0) r14
            XH.y.b(r3)
            goto L_0x01e9
        L_0x0073:
            float r1 = r2.f125345h
            int r5 = r2.f125344g
            java.lang.Object r10 = r2.f125343f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r13 = r2.f125342e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f125341d
            com.sugarcube.app.base.data.model.QualityMeta r14 = (com.sugarcube.app.base.data.model.QualityMeta) r14
            java.lang.Object r15 = r2.f125340c
            com.sugarcube.app.base.ui.ultrawide.I0 r15 = (com.sugarcube.app.base.ui.ultrawide.I0) r15
            XH.y.b(r3)
            goto L_0x0125
        L_0x008c:
            int r1 = r2.f125344g
            java.lang.Object r5 = r2.f125343f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r2.f125342e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f125341d
            com.sugarcube.app.base.data.model.QualityMeta r14 = (com.sugarcube.app.base.data.model.QualityMeta) r14
            java.lang.Object r15 = r2.f125340c
            com.sugarcube.app.base.ui.ultrawide.I0 r15 = (com.sugarcube.app.base.ui.ultrawide.I0) r15
            XH.y.b(r3)
            r35 = r5
            r5 = r1
            r1 = r13
            r13 = r14
            r14 = r35
            goto L_0x00c9
        L_0x00a9:
            XH.y.b(r3)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r0.f125261G
            com.sugarcube.app.base.data.feature.ConfigItems$CaptureQualityBadFramesThreshold r5 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureQualityBadFramesThreshold.INSTANCE
            r2.f125340c = r0
            r13 = r37
            r2.f125341d = r13
            r2.f125342e = r1
            java.lang.String r14 = "Save Failure "
            r2.f125343f = r14
            r2.f125344g = r12
            r2.f125349l = r12
            java.lang.Object r3 = r3.get(r5, r2)
            if (r3 != r4) goto L_0x00c7
            return r4
        L_0x00c7:
            r15 = r0
            r5 = r12
        L_0x00c9:
            java.lang.Number r3 = (java.lang.Number) r3
            double r11 = r3.doubleValue()
            float r3 = (float) r11
            com.sugarcube.app.base.data.model.QualityWarnings r11 = r13.getWarnings()
            float r11 = r11.getBadFrames()
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x015d
            OE.q r11 = r15.f125255D
            com.sugarcube.app.base.data.analytics.Analytics r16 = r11.b()
            java.util.UUID r11 = r15.f125293X
            java.lang.String r12 = r15.f125323y0
            com.sugarcube.app.base.capture.a$a r8 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r9 = r15.f125251A0
            com.sugarcube.app.base.capture.a r8 = r8.a(r9)
            java.lang.String r19 = r8.b()
            java.lang.String r8 = r15.f125252B0
            com.sugarcube.app.base.data.model.QualityWarnings r9 = r13.getWarnings()
            float r21 = r9.getBadFrames()
            r17 = r11
            r18 = r12
            r20 = r8
            r22 = r3
            r16.captureWarningBadFrames(r17, r18, r19, r20, r21, r22)
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r15.f125261G
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureQualityBadFramesFlag r9 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureQualityBadFramesFlag.INSTANCE
            r2.f125340c = r15
            r2.f125341d = r13
            r2.f125342e = r1
            r2.f125343f = r14
            r2.f125344g = r5
            r2.f125345h = r3
            r2.f125349l = r10
            java.lang.Object r8 = r8.get(r9, r2)
            if (r8 != r4) goto L_0x0120
            return r4
        L_0x0120:
            r10 = r14
            r14 = r13
            r13 = r1
            r1 = r3
            r3 = r8
        L_0x0125:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0158
            com.sugarcube.app.base.data.model.QualityWarnings r3 = r14.getWarnings()
            float r3 = r3.getBadFrames()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r8 = "[BadFrames("
            r5.append(r8)
            r5.append(r3)
            r5.append(r7)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r9 = r3
            r10 = r13
            r13 = r14
            r14 = r15
            r5 = 0
            goto L_0x0161
        L_0x0158:
            r9 = r10
            r10 = r13
            r13 = r14
        L_0x015b:
            r14 = r15
            goto L_0x0161
        L_0x015d:
            r10 = r1
            r1 = r3
            r9 = r14
            goto L_0x015b
        L_0x0161:
            com.sugarcube.app.base.data.model.QualityWarnings r3 = r13.getWarnings()
            float r3 = r3.getPrincipalPoint()
            float r8 = r14.f125316r1
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01aa
            OE.q r3 = r14.f125255D
            com.sugarcube.app.base.data.analytics.Analytics r24 = r3.b()
            java.util.UUID r3 = r14.f125293X
            java.lang.String r8 = r14.f125323y0
            com.sugarcube.app.base.capture.a$a r11 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r12 = r14.f125251A0
            com.sugarcube.app.base.capture.a r11 = r11.a(r12)
            java.lang.String r27 = r11.b()
            java.lang.String r11 = r14.f125252B0
            com.sugarcube.app.base.data.model.AndroidQuality r12 = r13.getAndroid()
            float r29 = r12.getPrincipalPointRatioX()
            com.sugarcube.app.base.data.model.AndroidQuality r12 = r13.getAndroid()
            float r30 = r12.getPrincipalPointRatioY()
            float r12 = r14.f125316r1
            r33 = 128(0x80, float:1.794E-43)
            r34 = 0
            r32 = 0
            r25 = r3
            r26 = r8
            r28 = r11
            r31 = r12
            com.sugarcube.app.base.data.analytics.Analytics.captureWarningPrincipalPoint$default(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x01aa:
            com.sugarcube.app.base.data.model.AndroidQuality r3 = r13.getAndroid()
            int r3 = r3.getPointsTotal()
            if (r3 != 0) goto L_0x0206
            OE.q r3 = r14.f125255D
            com.sugarcube.app.base.data.analytics.Analytics r3 = r3.b()
            java.util.UUID r8 = r14.f125293X
            java.lang.String r11 = r14.f125323y0
            com.sugarcube.app.base.capture.a$a r12 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r15 = r14.f125251A0
            com.sugarcube.app.base.capture.a r12 = r12.a(r15)
            java.lang.String r12 = r12.b()
            java.lang.String r15 = r14.f125252B0
            r3.captureWarningNoPoints(r8, r11, r12, r15)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r14.f125261G
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureFailNoPoints r8 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureFailNoPoints.INSTANCE
            r2.f125340c = r14
            r2.f125341d = r13
            r2.f125342e = r10
            r2.f125343f = r9
            r2.f125344g = r5
            r2.f125345h = r1
            r11 = 3
            r2.f125349l = r11
            java.lang.Object r3 = r3.get(r8, r2)
            if (r3 != r4) goto L_0x01e9
            return r4
        L_0x01e9:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0206
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r5 = "[NoPoints]"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r8 = r3
            r3 = r1
            r1 = 0
            goto L_0x0209
        L_0x0206:
            r3 = r1
            r1 = r5
            r8 = r9
        L_0x0209:
            com.sugarcube.app.base.data.feature.ConfigRepository r5 = r14.f125261G
            com.sugarcube.app.base.data.feature.ConfigItems$CaptureVideoLengthMax r9 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureVideoLengthMax.INSTANCE
            java.lang.Object r5 = r5.getBlocking(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            long r11 = r5.longValue()
            r9 = r6
            double r5 = r14.f125299a1
            r16 = r3
            r15 = r4
            double r3 = (double) r11
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x029a
            OE.q r3 = r14.f125255D
            com.sugarcube.app.base.data.analytics.Analytics r23 = r3.b()
            java.util.UUID r3 = r14.f125293X
            java.lang.String r4 = r14.f125323y0
            com.sugarcube.app.base.capture.a$a r5 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r6 = r14.f125251A0
            com.sugarcube.app.base.capture.a r5 = r5.a(r6)
            java.lang.String r26 = r5.b()
            java.lang.String r5 = r14.f125252B0
            r17 = r7
            double r6 = r14.f125299a1
            float r6 = (float) r6
            float r7 = (float) r11
            r24 = r3
            r25 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r23.captureWarningVideoLength(r24, r25, r26, r27, r28, r29)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r14.f125261G
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureVideoLengthFlag r4 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureVideoLengthFlag.INSTANCE
            r2.f125340c = r14
            r2.f125341d = r13
            r2.f125342e = r10
            r2.f125343f = r8
            r2.f125344g = r1
            r5 = r16
            r2.f125345h = r5
            r2.f125346i = r11
            r5 = 4
            r2.f125349l = r5
            java.lang.Object r3 = r3.get(r4, r2)
            r2 = r15
            if (r3 != r2) goto L_0x026c
            return r2
        L_0x026c:
            r4 = r11
            r2 = r14
        L_0x026e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x029a
            double r1 = r2.f125299a1
            float r1 = (float) r1
            float r2 = (float) r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = "[VideoLength("
            r3.append(r4)
            r3.append(r1)
            r1 = r17
            r3.append(r1)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            r1 = 0
        L_0x029a:
            if (r1 == 0) goto L_0x029d
            r8 = 0
        L_0x029d:
            XH.v r2 = new XH.v
            if (r1 == 0) goto L_0x02a3
            r11 = 1
            goto L_0x02a4
        L_0x02a3:
            r11 = 0
        L_0x02a4:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r11)
            r2.<init>(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.F1(com.sugarcube.app.base.data.model.QualityMeta, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void L1(Exception exc) {
        this.f125273M.recordException(exc);
    }

    /* access modifiers changed from: private */
    public final Object Q1(UUID uuid, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new g(this, uuid, (C17164e<? super g>) null), 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void S0() {
        int i10 = 0;
        for (C14294e eVar : this.f125303e1) {
            int i11 = i10 + 1;
            Z.d(this.f125294X0, this.f125306h1.size() > i10 ? this.f125306h1.get(i10) : null, this.f125309k1.h(), eVar.d(), eVar, this.f125307i1.get(i10).intValue(), (float[]) null, 32, (Object) null);
            i10 = i11;
        }
    }

    private final QualityMeta T0() {
        Z z10 = this.f125294X0;
        float[] q12 = C16877v.q1(C16870n.P0(new float[]{z10.j()[2], z10.j()[5]}));
        Dimension dimension = f125250D1;
        int[] s12 = C16877v.s1(C16870n.Q0(new int[]{dimension.getWidth() / 2, dimension.getHeight() / 2}));
        float f10 = q12[1];
        int i10 = s12[1];
        this.f125319u1 = Math.abs((f10 - ((float) i10)) / ((float) i10));
        float f11 = q12[0];
        int i11 = s12[0];
        this.f125320v1 = Math.abs((f11 - ((float) i11)) / ((float) i11));
        int f12 = z10.f();
        String arrays = Arrays.toString(z10.m());
        C17542s.i(arrays, "toString(...)");
        int i12 = z10.i();
        int l10 = z10.l();
        String arrays2 = Arrays.toString(q12);
        C17542s.i(arrays2, "toString(...)");
        String arrays3 = Arrays.toString(s12);
        C17542s.i(arrays3, "toString(...)");
        String str = "\n            stats - " + f12 + " frames\n            " + arrays + "\n            framesWithNoPoints - " + i12 + " (" + l10 + ")\n            principalPoint - " + arrays2 + "\n            center - " + arrays3 + "\n            principalRatioX - " + this.f125319u1 + "\n            principalRatioY - " + this.f125320v1 + "\n        ";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        int T02 = C16870n.T0(z10.m());
        float f13 = 0.0f;
        float[] fArr = {T02 > 0 ? ((float) z10.m()[0]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[1]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[2]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[3]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[4]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[5]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.m()[6]) / ((float) T02) : 0.0f};
        AndroidQuality androidQuality = new AndroidQuality(fArr, (int[]) z10.m().clone(), Integer.valueOf(z10.f()), z10.h(), z10.i(), z10.k(), z10.l(), this.f125319u1, this.f125320v1, (int[]) null, 0, 0, 0, this.f125317s1, this.f125318t1, z10.n(), z10.v(), this.f125264H0, z10.w(), 0.0f, 0.0f, 0.0f, 0, 0, 16260608, (DefaultConstructorMarker) null);
        float f14 = T02 > 0 ? ((float) (T02 - z10.m()[1])) / ((float) T02) : 0.0f;
        float f15 = fArr[3];
        float f16 = fArr[5];
        float max = Math.max(this.f125319u1, this.f125320v1);
        if (T02 > 0) {
            f13 = ((float) z10.h()) / ((float) T02);
        }
        return new QualityMeta(new QualityWarnings(f14, f15, f16, max, f13), androidQuality, this.f125264H0 ? new FloorDetection(this.f125270K0, z10.g(), z10.w(), z10.v()) : null);
    }

    private final Object U0(Context context, QualityMeta qualityMeta, C17164e<? super v<Boolean, String>> eVar) {
        return C16310i.g(C16311i0.b(), new b(this, context, qualityMeta, (C17164e<? super b>) null), eVar);
    }

    private final void Y1(String str) {
        this.f125277O.postValue(new C15083h.c("exit_error", new C15091p(Integer.valueOf(n.f113498z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113492y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new D0(this), (C15091p) null, (C17631a) null, new E0(this, str), 96, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N Z1(I0 i02) {
        K<C16807N> k10 = i02.f125285S;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        i02.f125284R0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(I0 i02, String str) {
        K<C16807N> k10 = i02.f125285S;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        i02.f125284R0 = false;
        i02.f125255D.b().captureErrorDialogExit(i02.f125293X, i02.f125323y0, com.sugarcube.app.base.capture.a.Companion.a(i02.f125251A0).b(), i02.f125252B0, str);
        return n10;
    }

    private final void b2(C17631a<C16807N> aVar) {
        if (this.f125289U) {
            this.f125277O.postValue(new C15083h.c("exit_confirmation", new C15091p(Integer.valueOf(n.f113186D0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113180C0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113358f), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new A0(), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new B0(aVar, this), new C0(this)));
            return;
        }
        C17631a<C16807N> aVar2 = aVar;
        aVar.invoke();
        this.f125285S.postValue(C16807N.f139792a);
    }

    /* access modifiers changed from: private */
    public static final C16807N c2() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(C17631a aVar, I0 i02) {
        aVar.invoke();
        K<C16807N> k10 = i02.f125285S;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        i02.f125284R0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(I0 i02) {
        i02.f125277O.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    private final void f2() {
        this.f125277O.postValue(new C15083h.c("exit_interruption", new C15091p(Integer.valueOf(n.f113174B0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113168A0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new t0(this), (C15091p) null, (C17631a) null, new z0(this), 96, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N g2(I0 i02) {
        K<C16807N> k10 = i02.f125285S;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        i02.f125284R0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N h2(I0 i02) {
        K<C16807N> k10 = i02.f125285S;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        i02.f125284R0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N j2(I0 i02) {
        i02.f125281Q.setValue(i02.f125267J.generatePrivacyPolicyLink());
        F0 unused = C16314k.d(g0.a(i02), (C17168i) null, (T) null, new h(i02, (C17164e<? super h>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(I0 i02, C4899r0 r0Var) {
        F0 unused = C16314k.d(g0.a(i02), (C17168i) null, (T) null, new i(r0Var, i02, (C17164e<? super i>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(I0 i02) {
        F0 unused = C16314k.d(g0.a(i02), (C17168i) null, (T) null, new j(i02, (C17164e<? super j>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(I0 i02) {
        i02.f125277O.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(I0 i02, boolean z10) {
        F0 unused = C16314k.d(g0.a(i02), (C17168i) null, (T) null, new k(i02, z10, (C17164e<? super k>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(I0 i02) {
        F0 unused = C16314k.d(g0.a(i02), (C17168i) null, (T) null, new l(i02, (C17164e<? super l>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p2() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int r2(I0 i02, Session session, Frame frame, C14294e eVar) {
        C17542s.j(session, "session");
        C17542s.j(frame, "frame");
        C17542s.j(eVar, "sensorData");
        if (i02.f125311m1) {
            i02.y1(session);
        }
        return Z.c(i02.f125294X0, session, frame, eVar, (float[]) null, 8, (Object) null);
    }

    private final void y1(Session session) {
        long currentTimeMillis = System.currentTimeMillis() - this.f125312n1;
        if (!this.f125272L0 && currentTimeMillis > ((long) this.f125268J0) * 1000) {
            if (this.f125294X0.w()) {
                this.f125272L0 = true;
                this.f125311m1 = false;
                this.f125283R.postValue(Boolean.TRUE);
                Log.d(AnyKt.SUGARCUBE_TAG, "floor anchor created");
                C13868b.f118106a.b("floor anchor created", YE.e.Capture);
            } else if (!this.f125313o1 && currentTimeMillis > ((long) this.f125270K0) * 1000) {
                this.f125313o1 = true;
                this.f125283R.postValue(Boolean.FALSE);
                Log.d(AnyKt.SUGARCUBE_TAG, "floor timeout reached");
                C13868b.f118106a.b("floor timeout reached", YE.e.Capture);
            }
        }
    }

    public final void A1(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "negAnalytics");
        b2(aVar);
    }

    public final void B1(String str) {
        C17542s.j(str, "reason");
        this.f125255D.b().captureErrorDialogShow(this.f125293X, this.f125323y0, com.sugarcube.app.base.capture.a.Companion.a(this.f125251A0).b(), this.f125252B0, str);
        Y1(str);
    }

    public final void C1() {
        if (this.f125284R0) {
            this.f125255D.b().captureWarningForcedInterruption(this.f125293X, this.f125323y0, com.sugarcube.app.base.capture.a.Companion.a(this.f125251A0).b(), this.f125252B0);
            f2();
        }
    }

    public final boolean D1() {
        return !this.f125274M0 && this.f125264H0;
    }

    public final boolean E1() {
        float[] q12 = C16877v.q1(C16870n.P0(new float[]{this.f125309k1.d(), this.f125309k1.e()}));
        Bitmap bitmap = this.f125290U0;
        int width = (bitmap != null ? bitmap.getWidth() : 0) / 2;
        Bitmap bitmap2 = this.f125290U0;
        int[] s12 = C16877v.s1(C16870n.Q0(new int[]{width, (bitmap2 != null ? bitmap2.getHeight() : 0) / 2}));
        float f10 = q12[1];
        int i10 = s12[1];
        this.f125317s1 = Math.abs((f10 - ((float) i10)) / ((float) i10));
        float f11 = q12[0];
        int i11 = s12[0];
        this.f125318t1 = Math.abs((f11 - ((float) i11)) / ((float) i11));
        String arrays = Arrays.toString(q12);
        C17542s.i(arrays, "toString(...)");
        String arrays2 = Arrays.toString(s12);
        C17542s.i(arrays2, "toString(...)");
        String str = "\n                panoPrincipalPoint - " + arrays + "\n                panoCenter - " + arrays2 + "\n                panoPrincipalRatioX - " + this.f125317s1 + "\n                panoPrincipalRatioY - " + this.f125318t1 + "\n            ";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        float f12 = this.f125317s1;
        float f13 = this.f125316r1;
        if (f12 > f13 || this.f125318t1 > f13) {
            this.f125255D.b().captureWarningPrincipalPoint(this.f125293X, this.f125323y0, com.sugarcube.app.base.capture.a.Companion.a(this.f125251A0).b(), this.f125252B0, this.f125317s1, this.f125318t1, this.f125316r1, true);
        }
        return true;
    }

    public final boolean G1() {
        return this.f125282Q0;
    }

    public final F<Boolean> I1() {
        return this.f125321w1;
    }

    public final void J1() {
        this.f125281Q.setValue(null);
    }

    public final void M1() {
        if (!this.f125274M0) {
            this.f125274M0 = true;
            this.f125294X0.o();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e8, code lost:
        if (r3 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ea, code lost:
        r8.t2(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ed, code lost:
        r4 = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
        r15.f125350c = r8;
        r15.f125351d = r7;
        r15.f125352e = r3;
        r15.f125353f = r1;
        r15.f125366s = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0102, code lost:
        if (QJ.C16297b0.b(r4, r15) != r14) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0104, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0105, code lost:
        r4 = r7;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0107, code lost:
        r7 = java.lang.System.currentTimeMillis();
        r2 = r5.T0();
        r15.f125350c = r5;
        r15.f125351d = r4;
        r15.f125352e = r3;
        r15.f125353f = r1;
        r15.f125354g = r2;
        r15.f125359l = r7;
        r15.f125366s = 3;
        r9 = r5.F1(r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0122, code lost:
        if (r9 != r14) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0124, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0125, code lost:
        r25 = r5;
        r5 = r1;
        r1 = r2;
        r2 = r9;
        r9 = r25;
        r26 = r7;
        r7 = r3;
        r8 = r4;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0132, code lost:
        r10 = (XH.v) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013f, code lost:
        if (((java.lang.Boolean) r10.c()).booleanValue() == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0141, code lost:
        if (r8 == null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0143, code lost:
        r15.f125350c = r9;
        r15.f125351d = r8;
        r15.f125352e = r7;
        r15.f125353f = r5;
        r15.f125354g = r1;
        r15.f125355h = r2;
        r15.f125356i = r10;
        r15.f125357j = r8;
        r15.f125358k = r8;
        r15.f125359l = r3;
        r15.f125361n = 0;
        r15.f125362o = 0;
        r15.f125366s = 4;
        r2 = r9.U0(r8, r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (r2 != r14) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0164, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0165, code lost:
        r10 = (XH.v) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0168, code lost:
        if (r10 != null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016b, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        r10 = new XH.v(kotlin.coroutines.jvm.internal.b.a(false), "Save Failure [activity=null]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0179, code lost:
        r12 = java.lang.System.currentTimeMillis() - r3;
        r11 = ((java.lang.Boolean) r10.c()).booleanValue();
        r9 = r10.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0190, code lost:
        if (r11 == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019a, code lost:
        if (r2.f125263H.b() == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019c, code lost:
        r6 = r2.f125265I;
        r16 = r14;
        r29 = r2.f125293X;
        r30 = r2.f125297Z;
        r31 = r2.f125323y0;
        r14 = r2.f125295Y;
        kotlin.jvm.internal.C17542s.i(r14, "creation");
        r17 = YH.C16877v.t1(r2.f125315q1);
        r18 = YH.C16877v.t1(r2.f125314p1);
        r19 = r2.f125251A0;
        r0 = r2.f125252B0;
        r15.f125350c = r2;
        r15.f125351d = r8;
        r15.f125352e = r7;
        r15.f125353f = r5;
        r15.f125354g = r1;
        r15.f125355h = r10;
        r15.f125356i = r9;
        r15.f125357j = r14;
        r15.f125359l = r3;
        r15.f125360m = r12;
        r15.f125363p = r11;
        r15.f125366s = 5;
        r14 = r9;
        r1 = r11;
        r20 = r12;
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ff, code lost:
        if (r6.addUpload(r29, r30, r31, r14, r17, r18, true, r19, r0, r15) != r13) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0201, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0202, code lost:
        r6 = r2;
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0204, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0206, code lost:
        r14 = r3;
        r10 = r5;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x020b, code lost:
        r20 = r12;
        r13 = r14;
        r14 = r9;
        r12 = r11;
        r6 = r2.f125253C;
        r9 = r2.f125293X;
        r11 = r2.f125297Z;
        r16 = r13;
        r17 = r2.f125323y0;
        r13 = r2.f125295Y;
        kotlin.jvm.internal.C17542s.i(r13, "creation");
        r29 = YH.C16877v.t1(r2.f125315q1);
        r30 = YH.C16877v.t1(r2.f125314p1);
        r18 = r2.f125251A0;
        r0 = r2.f125252B0;
        r15.f125350c = r2;
        r15.f125351d = r8;
        r15.f125352e = r7;
        r15.f125353f = r5;
        r15.f125354g = r1;
        r15.f125355h = r10;
        r15.f125356i = r14;
        r15.f125357j = r13;
        r15.f125359l = r3;
        r15.f125360m = r20;
        r15.f125363p = r12;
        r15.f125366s = 6;
        r17 = r12;
        r12 = r0;
        r0 = r16;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0274, code lost:
        if (r6.addCapture(r9, r11, r17, r13, r29, r30, true, r18, r12, "ULTRAWIDE", false, r15) != r0) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0276, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0277, code lost:
        r5 = r1;
        r6 = r2;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x027c, code lost:
        r1 = r9;
        r17 = r11;
        r20 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0281, code lost:
        if (r1 != null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0283, code lost:
        r9 = "none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0286, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0287, code lost:
        r2.B1(r9);
        r10 = r1;
        r1 = r17;
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x028f, code lost:
        r3 = r2.f125255D.b();
        r4 = r2.f125293X;
        r5 = r2.f125323y0;
        r6 = com.sugarcube.app.base.capture.a.Companion.a(r2.f125251A0).b();
        r7 = r2.f125252B0;
        r3.captureResult(r4, r5, r6, r7, 0, r1, r10, r14 + "ms", r2.f125266I0, kotlin.coroutines.jvm.internal.b.a(r2.f125294X0.v()), r2.f125264H0, kotlin.coroutines.jvm.internal.b.a(r2.f125294X0.w()));
        android.util.Log.d(com.sugarcube.core.logger.AnyKt.SUGARCUBE_TAG, "Capture save - result=" + r1 + " " + r14 + "ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0308, code lost:
        return kotlin.coroutines.jvm.internal.b.a(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N1(android.content.Context r29, com.sugarcube.app.base.ui.ultrawide.C14304j r30, dI.C17164e<? super java.lang.Boolean> r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r31
            boolean r2 = r1 instanceof com.sugarcube.app.base.ui.ultrawide.I0.d
            if (r2 == 0) goto L_0x0018
            r2 = r1
            com.sugarcube.app.base.ui.ultrawide.I0$d r2 = (com.sugarcube.app.base.ui.ultrawide.I0.d) r2
            int r3 = r2.f125366s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f125366s = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.ui.ultrawide.I0$d r2 = new com.sugarcube.app.base.ui.ultrawide.I0$d
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.f125364q
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.f125366s
            r4 = 1
            r6 = 0
            switch(r3) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00b3;
                case 2: goto L_0x009f;
                case 3: goto L_0x0084;
                case 4: goto L_0x005d;
                case 5: goto L_0x0034;
                case 6: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0034:
            boolean r1 = r15.f125363p
            long r3 = r15.f125360m
            java.lang.Object r5 = r15.f125357j
            java.time.Instant r5 = (java.time.Instant) r5
            java.lang.Object r5 = r15.f125356i
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r15.f125355h
            XH.v r6 = (XH.v) r6
            java.lang.Object r6 = r15.f125354g
            com.sugarcube.app.base.data.model.QualityMeta r6 = (com.sugarcube.app.base.data.model.QualityMeta) r6
            java.lang.Object r6 = r15.f125353f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r15.f125352e
            com.sugarcube.app.base.ui.ultrawide.j r6 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r6
            java.lang.Object r6 = r15.f125351d
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r6 = r15.f125350c
            com.sugarcube.app.base.ui.ultrawide.I0 r6 = (com.sugarcube.app.base.ui.ultrawide.I0) r6
            XH.y.b(r2)
            goto L_0x0206
        L_0x005d:
            long r3 = r15.f125359l
            java.lang.Object r1 = r15.f125358k
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r1 = r15.f125357j
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r1 = r15.f125356i
            XH.v r1 = (XH.v) r1
            java.lang.Object r1 = r15.f125354g
            com.sugarcube.app.base.data.model.QualityMeta r1 = (com.sugarcube.app.base.data.model.QualityMeta) r1
            java.lang.Object r5 = r15.f125353f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r7 = r15.f125352e
            com.sugarcube.app.base.ui.ultrawide.j r7 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r7
            java.lang.Object r8 = r15.f125351d
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r15.f125350c
            com.sugarcube.app.base.ui.ultrawide.I0 r9 = (com.sugarcube.app.base.ui.ultrawide.I0) r9
            XH.y.b(r2)
            goto L_0x0165
        L_0x0084:
            long r3 = r15.f125359l
            java.lang.Object r1 = r15.f125354g
            com.sugarcube.app.base.data.model.QualityMeta r1 = (com.sugarcube.app.base.data.model.QualityMeta) r1
            java.lang.Object r5 = r15.f125353f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r7 = r15.f125352e
            com.sugarcube.app.base.ui.ultrawide.j r7 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r7
            java.lang.Object r8 = r15.f125351d
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r15.f125350c
            com.sugarcube.app.base.ui.ultrawide.I0 r9 = (com.sugarcube.app.base.ui.ultrawide.I0) r9
            XH.y.b(r2)
            goto L_0x0132
        L_0x009f:
            java.lang.Object r1 = r15.f125353f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r15.f125352e
            com.sugarcube.app.base.ui.ultrawide.j r3 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r3
            java.lang.Object r4 = r15.f125351d
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r15.f125350c
            com.sugarcube.app.base.ui.ultrawide.I0 r5 = (com.sugarcube.app.base.ui.ultrawide.I0) r5
            XH.y.b(r2)
            goto L_0x0107
        L_0x00b3:
            java.lang.Object r1 = r15.f125353f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r15.f125352e
            com.sugarcube.app.base.ui.ultrawide.j r3 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r3
            java.lang.Object r7 = r15.f125351d
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r15.f125350c
            com.sugarcube.app.base.ui.ultrawide.I0 r8 = (com.sugarcube.app.base.ui.ultrawide.I0) r8
            XH.y.b(r2)
            goto L_0x00e8
        L_0x00c7:
            XH.y.b(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r2.toMillis(r4)
            r15.f125350c = r0
            r7 = r29
            r15.f125351d = r7
            r8 = r30
            r15.f125352e = r8
            r15.f125353f = r1
            r9 = 1
            r15.f125366s = r9
            java.lang.Object r2 = QJ.C16297b0.b(r2, r15)
            if (r2 != r14) goto L_0x00e6
            return r14
        L_0x00e6:
            r3 = r8
            r8 = r0
        L_0x00e8:
            if (r3 == 0) goto L_0x00ed
            r8.t2(r3)
        L_0x00ed:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r2.toMillis(r4)
            r15.f125350c = r8
            r15.f125351d = r7
            r15.f125352e = r3
            r15.f125353f = r1
            r2 = 2
            r15.f125366s = r2
            java.lang.Object r2 = QJ.C16297b0.b(r4, r15)
            if (r2 != r14) goto L_0x0105
            return r14
        L_0x0105:
            r4 = r7
            r5 = r8
        L_0x0107:
            long r7 = java.lang.System.currentTimeMillis()
            com.sugarcube.app.base.data.model.QualityMeta r2 = r5.T0()
            r15.f125350c = r5
            r15.f125351d = r4
            r15.f125352e = r3
            r15.f125353f = r1
            r15.f125354g = r2
            r15.f125359l = r7
            r9 = 3
            r15.f125366s = r9
            java.lang.Object r9 = r5.F1(r2, r15)
            if (r9 != r14) goto L_0x0125
            return r14
        L_0x0125:
            r25 = r5
            r5 = r1
            r1 = r2
            r2 = r9
            r9 = r25
            r26 = r7
            r7 = r3
            r8 = r4
            r3 = r26
        L_0x0132:
            r10 = r2
            XH.v r10 = (XH.v) r10
            java.lang.Object r11 = r10.c()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x016b
            if (r8 == 0) goto L_0x016d
            r15.f125350c = r9
            r15.f125351d = r8
            r15.f125352e = r7
            r15.f125353f = r5
            r15.f125354g = r1
            r15.f125355h = r2
            r15.f125356i = r10
            r15.f125357j = r8
            r15.f125358k = r8
            r15.f125359l = r3
            r15.f125361n = r6
            r15.f125362o = r6
            r2 = 4
            r15.f125366s = r2
            java.lang.Object r2 = r9.U0(r8, r1, r15)
            if (r2 != r14) goto L_0x0165
            return r14
        L_0x0165:
            r10 = r2
            XH.v r10 = (XH.v) r10
            if (r10 != 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r2 = r9
            goto L_0x0179
        L_0x016d:
            XH.v r10 = new XH.v
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r6)
            java.lang.String r6 = "Save Failure [activity=null]"
            r10.<init>(r2, r6)
            goto L_0x016b
        L_0x0179:
            long r11 = java.lang.System.currentTimeMillis()
            long r12 = r11 - r3
            java.lang.Object r6 = r10.c()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r11 = r6.booleanValue()
            java.lang.Object r6 = r10.d()
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            if (r11 == 0) goto L_0x027c
            KF.r r6 = r2.f125263H
            boolean r6 = r6.b()
            java.lang.String r0 = "creation"
            if (r6 == 0) goto L_0x020b
            com.sugarcube.app.base.upload.IUploaderV2 r6 = r2.f125265I
            r16 = r14
            java.util.UUID r14 = r2.f125293X
            r29 = r14
            com.sugarcube.core.network.models.RoomType r14 = r2.f125297Z
            r30 = r14
            java.lang.String r14 = r2.f125323y0
            r31 = r14
            java.time.Instant r14 = r2.f125295Y
            kotlin.jvm.internal.C17542s.i(r14, r0)
            java.util.List<com.sugarcube.app.base.data.database.Media> r0 = r2.f125315q1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.t1(r0)
            r17 = r0
            java.util.List<com.sugarcube.app.base.data.database.Metadata> r0 = r2.f125314p1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.t1(r0)
            r18 = r0
            java.lang.String r0 = r2.f125251A0
            r19 = r0
            java.lang.String r0 = r2.f125252B0
            r15.f125350c = r2
            r15.f125351d = r8
            r15.f125352e = r7
            r15.f125353f = r5
            r15.f125354g = r1
            r15.f125355h = r10
            r15.f125356i = r9
            r15.f125357j = r14
            r15.f125359l = r3
            r15.f125360m = r12
            r15.f125363p = r11
            r1 = 5
            r15.f125366s = r1
            r10 = 1
            r3 = r6
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r14
            r8 = r17
            r14 = r9
            r9 = r18
            r1 = r11
            r11 = r19
            r20 = r12
            r12 = r0
            r13 = r15
            java.lang.Object r0 = r3.addUpload(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r13 = r16
            if (r0 != r13) goto L_0x0202
            return r13
        L_0x0202:
            r6 = r2
            r5 = r14
        L_0x0204:
            r3 = r20
        L_0x0206:
            r14 = r3
            r10 = r5
            r2 = r6
            goto L_0x028f
        L_0x020b:
            r20 = r12
            r13 = r14
            r14 = r9
            r12 = r11
            com.sugarcube.app.base.data.SceneRepository r6 = r2.f125253C
            java.util.UUID r9 = r2.f125293X
            com.sugarcube.core.network.models.RoomType r11 = r2.f125297Z
            r16 = r13
            java.lang.String r13 = r2.f125323y0
            r17 = r13
            java.time.Instant r13 = r2.f125295Y
            kotlin.jvm.internal.C17542s.i(r13, r0)
            java.util.List<com.sugarcube.app.base.data.database.Media> r0 = r2.f125315q1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.t1(r0)
            r29 = r0
            java.util.List<com.sugarcube.app.base.data.database.Metadata> r0 = r2.f125314p1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.t1(r0)
            r30 = r0
            java.lang.String r0 = r2.f125251A0
            r18 = r0
            java.lang.String r0 = r2.f125252B0
            r15.f125350c = r2
            r15.f125351d = r8
            r15.f125352e = r7
            r15.f125353f = r5
            r15.f125354g = r1
            r15.f125355h = r10
            r15.f125356i = r14
            r15.f125357j = r13
            r15.f125359l = r3
            r7 = r20
            r15.f125360m = r7
            r15.f125363p = r12
            r1 = 6
            r15.f125366s = r1
            r10 = 1
            java.lang.String r1 = "ULTRAWIDE"
            r19 = 0
            r3 = r6
            r4 = r9
            r5 = r11
            r6 = r17
            r7 = r13
            r8 = r29
            r9 = r30
            r11 = r18
            r17 = r12
            r12 = r0
            r0 = r16
            r13 = r1
            r1 = r14
            r14 = r19
            java.lang.Object r3 = r3.addCapture(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r3 != r0) goto L_0x0277
            return r0
        L_0x0277:
            r5 = r1
            r6 = r2
            r1 = r17
            goto L_0x0204
        L_0x027c:
            r1 = r9
            r17 = r11
            r20 = r12
            if (r1 != 0) goto L_0x0286
            java.lang.String r9 = "none"
            goto L_0x0287
        L_0x0286:
            r9 = r1
        L_0x0287:
            r2.B1(r9)
            r10 = r1
            r1 = r17
            r14 = r20
        L_0x028f:
            OE.q r0 = r2.f125255D
            com.sugarcube.app.base.data.analytics.Analytics r3 = r0.b()
            java.util.UUID r4 = r2.f125293X
            java.lang.String r5 = r2.f125323y0
            com.sugarcube.app.base.capture.a$a r0 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r6 = r2.f125251A0
            com.sugarcube.app.base.capture.a r0 = r0.a(r6)
            java.lang.String r6 = r0.b()
            java.lang.String r7 = r2.f125252B0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r13 = "ms"
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            boolean r12 = r2.f125266I0
            com.sugarcube.app.base.ui.ultrawide.Z r0 = r2.f125294X0
            boolean r0 = r0.v()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            boolean r9 = r2.f125264H0
            com.sugarcube.app.base.ui.ultrawide.Z r2 = r2.f125294X0
            boolean r2 = r2.w()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
            r8 = 0
            r16 = r9
            r9 = r1
            r22 = r13
            r13 = r0
            r23 = r14
            r14 = r16
            r15 = r2
            r3.captureResult(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Capture save - result="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " "
            r0.append(r2)
            r3 = r23
            r0.append(r3)
            r2 = r22
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Sugarcube"
            android.util.Log.d(r2, r0)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.N1(android.content.Context, com.sugarcube.app.base.ui.ultrawide.j, dI.e):java.lang.Object");
    }

    public final Object O1(C17164e<? super v<Boolean, String>> eVar) {
        return C16310i.g(C16311i0.b(), new e(this, (C17164e<? super e>) null), eVar);
    }

    public boolean P() {
        return this.f125275N;
    }

    public final Object P1(Bitmap bitmap, C17164e<Object> eVar) {
        return C16310i.g(C16311i0.b(), new f(this, bitmap, (C17164e<? super f>) null), eVar);
    }

    public final synchronized void R0(Bitmap bitmap, long j10, C14294e eVar, float[] fArr, int i10, int i11) {
        Bitmap bitmap2 = bitmap;
        C14294e eVar2 = eVar;
        float[] fArr2 = fArr;
        synchronized (this) {
            try {
                C17542s.j(bitmap, "bitmap");
                C17542s.j(eVar2, "sensorData");
                long currentTimeMillis = System.currentTimeMillis();
                Log.d(AnyKt.SUGARCUBE_TAG, "addPano[" + this.f125303e1.size() + "," + this.f125305g1.size() + "," + this.f125304f1.size() + "," + this.f125307i1.size() + "," + this.f125308j1.size() + "]");
                this.f125303e1.add(eVar2);
                this.f125305g1.add(Long.valueOf(j10));
                this.f125304f1.add(bitmap);
                if (fArr2 != null) {
                    this.f125306h1.add(fArr2);
                }
                this.f125307i1.add(Integer.valueOf(i10));
                this.f125308j1.add(Integer.valueOf(i11));
                float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
                this.f125288T0 = Bitmap.createScaledBitmap(bitmap, 1000, (int) (((float) 1000) / width), true);
                long currentTimeMillis2 = System.currentTimeMillis();
                int width2 = bitmap.getWidth();
                int height = bitmap.getHeight();
                Bitmap bitmap3 = this.f125288T0;
                Integer num = null;
                Integer valueOf = bitmap3 != null ? Integer.valueOf(bitmap3.getWidth()) : null;
                Bitmap bitmap4 = this.f125288T0;
                if (bitmap4 != null) {
                    num = Integer.valueOf(bitmap4.getHeight());
                }
                String str = "scaled pano (" + width + ") [" + width2 + "x" + height + "] to [" + valueOf + "x" + num + "] " + (currentTimeMillis2 - currentTimeMillis) + "ms";
                Log.d(AnyKt.SUGARCUBE_TAG, str);
                C13868b.f118106a.b(str, YE.e.Capture);
                this.f125290U0 = bitmap2;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final void R1(String str) {
        C17542s.j(str, "state");
        this.f125294X0.t(str);
    }

    public final void S1(C14286a aVar) {
        C17542s.j(aVar, "intrinsics");
        this.f125309k1 = aVar;
    }

    public final void T1(C14294e eVar) {
        C17542s.j(eVar, "sensorData");
        this.f125302d1 = eVar;
        this.f125286S0 = eVar.c();
        this.f125303e1 = new ArrayList();
        this.f125304f1 = new ArrayList();
        this.f125305g1 = new ArrayList();
        this.f125306h1 = new ArrayList();
        this.f125307i1 = new ArrayList();
        this.f125308j1 = new ArrayList();
        this.f125314p1 = new ArrayList();
        this.f125315q1 = new ArrayList();
    }

    public final void U1() {
        this.f125322x1.postValue(Boolean.FALSE);
    }

    public final Bitmap V0() {
        return this.f125291V0;
    }

    public final void V1(RoomType roomType, String str) {
        C17542s.j(roomType, "roomType");
        C17542s.j(str, "roomTitle");
        this.f125297Z = roomType;
        this.f125323y0 = str;
    }

    public final F<Boolean> W0() {
        return this.f125283R;
    }

    public final void W1(boolean z10) {
        this.f125282Q0 = z10;
    }

    public final File X0() {
        return this.f125276N0;
    }

    public final void X1(boolean z10) {
        this.f125289U = z10;
    }

    public final String Y0() {
        return this.f125254C0;
    }

    public final String Z0() {
        return this.f125252B0;
    }

    public final String a1() {
        return this.f125251A0;
    }

    public final Instant b1() {
        return this.f125295Y;
    }

    public final boolean c1() {
        return this.f125260F0;
    }

    public final boolean d1() {
        return this.f125258E0;
    }

    public final F<C16807N> e1() {
        return this.f125287T;
    }

    public final FirebaseInteractions f1() {
        return this.f125273M;
    }

    public final boolean g1() {
        return this.f125264H0;
    }

    public final int h1() {
        return this.f125256D0;
    }

    public final Bitmap i1() {
        return this.f125290U0;
    }

    public final void i2() {
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        C4899r0 r0Var = j10;
        K<C15083h> k10 = this.f125277O;
        C15091p pVar = r7;
        C15091p pVar2 = new C15091p(Integer.valueOf(n.f113325a1), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar3 = r13;
        C15091p pVar4 = new C15091p(Integer.valueOf(n.f113318Z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar5 = r22;
        C15091p pVar6 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar7 = r11;
        C15091p pVar8 = new C15091p(Integer.valueOf(n.f113337c), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar9 = r22;
        C15091p pVar10 = new C15091p(Integer.valueOf(n.f113197F), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar11 = r28;
        C15091p pVar12 = new C15091p(Integer.valueOf(n.f113306X0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar13 = r22;
        C15091p pVar14 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        F0 f02 = r5;
        F0 f03 = new F0(this);
        G0 g02 = r5;
        G0 g03 = new G0(this, j10);
        H0 h02 = r1;
        H0 h03 = new H0(this);
        u0 u0Var = r1;
        u0 u0Var2 = new u0(this);
        v0 v0Var = r1;
        v0 v0Var2 = new v0(this);
        w0 w0Var = r1;
        w0 w0Var2 = new w0(this);
        x0 x0Var = r1;
        x0 x0Var2 = new x0();
        k10.postValue(new C15083h.b("privacy_disclaimer", pVar, pVar3, pVar5, f02, pVar7, g02, pVar9, h02, u0Var, pVar11, pVar13, false, v0Var, w0Var, x0Var, r0Var, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (DefaultConstructorMarker) null));
    }

    public final C14286a j1() {
        return this.f125309k1;
    }

    public final Bitmap k1() {
        return this.f125288T0;
    }

    public final File l1() {
        return new File(this.f125276N0, "pano_preview.jpg");
    }

    public final F<Boolean> m1() {
        return this.f125324y1;
    }

    public final F<PrivacyPolicyFeatureState> n1() {
        return this.f125326z1;
    }

    public final F<Uri> o1() {
        return this.f125281Q;
    }

    public final String p1() {
        return this.f125323y0;
    }

    public final RoomType q1() {
        return this.f125297Z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q2(com.sugarcube.app.base.ui.ultrawide.C14304j r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.ui.ultrawide.I0.m
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.ui.ultrawide.I0$m r0 = (com.sugarcube.app.base.ui.ultrawide.I0.m) r0
            int r1 = r0.f125393h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125393h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.ui.ultrawide.I0$m r0 = new com.sugarcube.app.base.ui.ultrawide.I0$m
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f125391f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125393h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f125390e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f125389d
            com.sugarcube.app.base.ui.ultrawide.j r6 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r6
            java.lang.Object r6 = r0.f125388c
            com.sugarcube.app.base.ui.ultrawide.I0 r6 = (com.sugarcube.app.base.ui.ultrawide.I0) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            java.lang.String r1 = r5.f125280P0
            com.sugarcube.app.base.ui.ultrawide.y0 r3 = new com.sugarcube.app.base.ui.ultrawide.y0
            r3.<init>(r5)
            r0.f125388c = r5
            r0.f125389d = r6
            r0.f125390e = r7
            r0.f125393h = r4
            java.lang.Object r6 = r6.P(r1, r3, r0)
            if (r6 != r2) goto L_0x0056
            return r2
        L_0x0056:
            r6 = r5
        L_0x0057:
            com.sugarcube.app.base.ui.ultrawide.Z r7 = r6.f125294X0
            int r7 = r7.f()
            r6.f125296Y0 = r7
            long r0 = java.lang.System.nanoTime()
            r6.f125301c1 = r0
            r6.f125284R0 = r4
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.I0.q2(com.sugarcube.app.base.ui.ultrawide.j, dI.e):java.lang.Object");
    }

    public final File r1() {
        return this.f125278O0;
    }

    public final boolean s1() {
        return this.f125262G0;
    }

    public final void s2() {
        Log.d(AnyKt.SUGARCUBE_TAG, "start ArInit");
        C13868b.f118106a.b("start ArInit", YE.e.Capture);
        this.f125274M0 = false;
        this.f125294X0.p();
        this.f125272L0 = false;
        this.f125312n1 = System.currentTimeMillis();
        this.f125313o1 = false;
        this.f125311m1 = true;
        this.f125283R.postValue(null);
    }

    public final F<C15083h> t1() {
        return this.f125279P;
    }

    public final void t2(C14304j jVar) {
        C17542s.j(jVar, "arSurface");
        jVar.Q();
        this.f125284R0 = false;
    }

    public final q u1() {
        return this.f125255D;
    }

    public final void u2() {
        boolean z10 = this.f125311m1;
        Log.d(AnyKt.SUGARCUBE_TAG, "stop ArInit (" + z10 + ")");
        C13868b bVar = C13868b.f118106a;
        boolean z11 = this.f125311m1;
        bVar.b("stop ArInit (" + z11 + ")", YE.e.Capture);
        this.f125311m1 = false;
        this.f125283R.postValue(null);
    }

    public final String v1() {
        return this.f125325z0;
    }

    public final void v2(C14304j jVar) {
        C17542s.j(jVar, "arSurface");
        jVar.R();
        this.f125298Z0 = this.f125294X0.f() - 1;
        this.f125299a1 = ((double) (System.nanoTime() - this.f125301c1)) / 1.0E9d;
    }

    public final UserRepo w1() {
        return this.f125269K;
    }

    public final UUID x1() {
        return this.f125293X;
    }

    public final boolean z1(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "negAnalytics");
        b2(aVar);
        return true;
    }
}
