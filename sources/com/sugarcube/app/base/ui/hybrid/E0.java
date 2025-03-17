package com.sugarcube.app.base.ui.hybrid;

import KF.C13147a;
import KF.C13164r;
import NE.C13286b;
import OE.C13313e;
import OE.n;
import OE.q;
import PE.C13341c;
import QJ.C16297b0;
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
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
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
import com.sugarcube.app.base.data.asset.VideoAsset;
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

@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0002Þ\u0002Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u001c2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J&\u0010+\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*0(2\u0006\u0010'\u001a\u00020$H@¢\u0006\u0004\b+\u0010,J.\u0010/\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*0(2\u0006\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020$H@¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010\u001eJ\u0018\u00104\u001a\u00020\u001c2\u0006\u00103\u001a\u000202H@¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c06H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010\u001eJ\u0017\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020*H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bA\u0010BJ\u001d\u0010F\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020*¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020*¢\u0006\u0004\bI\u0010=J\u0015\u0010L\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020N¢\u0006\u0004\bS\u0010QJ\r\u0010T\u001a\u00020\u001c¢\u0006\u0004\bT\u0010\u001eJ\r\u0010U\u001a\u00020N¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020N¢\u0006\u0004\bW\u0010VJ\r\u0010Y\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\r\u0010\\\u001a\u00020[¢\u0006\u0004\b\\\u0010]J1\u0010c\u001a\u00020\u001c2\"\u0010b\u001a\u001e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020X0^j\u0002`a¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u001c¢\u0006\u0004\be\u0010\u001eJ\r\u0010f\u001a\u00020\u001c¢\u0006\u0004\bf\u0010\u001eJ\r\u0010g\u001a\u00020\u001c¢\u0006\u0004\bg\u0010\u001eJ\u0017\u0010j\u001a\u00020\u001c2\b\u0010i\u001a\u0004\u0018\u00010h¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u001c¢\u0006\u0004\bl\u0010\u001eJO\u0010u\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020m2\u0006\u0010p\u001a\u00020o2\u0006\u0010K\u001a\u00020J2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010r\u001a\u00020X2\b\b\u0002\u0010s\u001a\u00020[2\b\b\u0002\u0010t\u001a\u00020X¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020)¢\u0006\u0004\bw\u0010xJ\u001e\u0010y\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*0(H@¢\u0006\u0004\by\u0010zJ\u0018\u0010}\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{H@¢\u0006\u0004\b}\u0010~J\u0016\u0010\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{¢\u0006\u0005\b\u0010\u0001JF\u0010\u0001\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{2,\u0010b\u001a(\u0012\u0005\u0012\u00030\u0001\u0012\u0005\u0012\u00030\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010^j\u0005\u0018\u0001`\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020{¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u001c\u0010\u0001\u001a\u00020)2\b\u0010|\u001a\u0004\u0018\u00010{H@¢\u0006\u0005\b\u0001\u0010~J\u001e\u0010\u0001\u001a\u00020)2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c06¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c06¢\u0006\u0005\b\u0001\u00109J\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u0017\u0010\u0001\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020*¢\u0006\u0005\b\u0001\u0010=J\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010­\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010°\u00018\u0002X\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R$\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010µ\u00018\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R'\u0010½\u0001\u001a\u0012\u0012\r\u0012\u000b »\u0001*\u0004\u0018\u00010)0)0°\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010³\u0001R#\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020)0µ\u00018\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010·\u0001\u001a\u0006\b¿\u0001\u0010¹\u0001R\u001f\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010µ\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010·\u0001R \u0010Å\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010@0°\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010³\u0001R \u0010Ç\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0°\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010³\u0001R \u0010É\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0°\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010³\u0001R%\u0010Ì\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0µ\u00018\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010·\u0001\u001a\u0006\bË\u0001\u0010¹\u0001R\u001b\u00103\u001a\u0002028\u0006¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R'\u0010Ö\u0001\u001a\r »\u0001*\u0005\u0018\u00010Ñ\u00010Ñ\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R)\u0010D\u001a\u00020C2\u0007\u0010×\u0001\u001a\u00020C8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R)\u0010E\u001a\u00020*2\u0007\u0010×\u0001\u001a\u00020*8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001b\u0010á\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\bà\u0001\u0010Ò\u0001\u001a\u0005\bá\u0001\u0010xR\u001f\u0010ä\u0001\u001a\u00020*8\u0006XD¢\u0006\u0010\n\u0006\bâ\u0001\u0010Ý\u0001\u001a\u0006\bã\u0001\u0010ß\u0001R\u001c\u0010ç\u0001\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\bå\u0001\u0010Ý\u0001\u001a\u0006\bæ\u0001\u0010ß\u0001R\u001c\u0010ê\u0001\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\bè\u0001\u0010Ý\u0001\u001a\u0006\bé\u0001\u0010ß\u0001R\u001b\u0010í\u0001\u001a\u00020X8\u0006¢\u0006\u000f\n\u0006\bë\u0001\u0010¤\u0001\u001a\u0005\bì\u0001\u0010ZR\u001b\u0010ð\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\bî\u0001\u0010Ò\u0001\u001a\u0005\bï\u0001\u0010xR\u001b\u0010ó\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\bñ\u0001\u0010Ò\u0001\u001a\u0005\bò\u0001\u0010xR\u001b\u0010ö\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\bô\u0001\u0010Ò\u0001\u001a\u0005\bõ\u0001\u0010xR\u001b\u0010ù\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\b÷\u0001\u0010Ò\u0001\u001a\u0005\bø\u0001\u0010xR\u001b\u0010ü\u0001\u001a\u00020)8\u0006¢\u0006\u000f\n\u0006\bú\u0001\u0010Ò\u0001\u001a\u0005\bû\u0001\u0010xR\u001b\u0010ÿ\u0001\u001a\u00020X8\u0006¢\u0006\u000f\n\u0006\bý\u0001\u0010¤\u0001\u001a\u0005\bþ\u0001\u0010ZR\u001b\u0010\u0002\u001a\u00020X8\u0006¢\u0006\u000f\n\u0006\b\u0002\u0010¤\u0001\u001a\u0005\b\u0002\u0010ZR\u001d\u0010\u0002\u001a\u00030\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001d\u0010\u0002\u001a\u00030\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R%\u0010\u0002\u001a\u000b »\u0001*\u0004\u0018\u00010*0*8\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010Ý\u0001\u001a\u0006\b\u0002\u0010ß\u0001R(\u0010\u0002\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0002\u0010Ò\u0001\u001a\u0005\b\u0002\u0010x\"\u0006\b\u0002\u0010\u0002R(\u0010\u0002\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0002\u0010Ò\u0001\u001a\u0005\b\u0002\u0010x\"\u0006\b\u0002\u0010\u0002R)\u0010\u0002\u001a\u00020N2\u0007\u0010×\u0001\u001a\u00020N8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0002\u0010\u0002\u001a\u0005\b\u0002\u0010VR.\u0010 \u0002\u001a\u0004\u0018\u00010m2\t\u0010×\u0001\u001a\u0004\u0018\u00010m8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R.\u0010£\u0002\u001a\u0004\u0018\u00010m2\t\u0010×\u0001\u001a\u0004\u0018\u00010m8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u0002\u001a\u0006\b¢\u0002\u0010\u0002R\"\u0010§\u0002\u001a\r »\u0001*\u0005\u0018\u00010¤\u00020¤\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010ª\u0002\u001a\u00030¨\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bu\u0010©\u0002RH\u0010°\u0002\u001a\"\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020X\u0018\u00010^j\u0004\u0018\u0001`a8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b«\u0002\u0010¬\u0002\u001a\u0006\b­\u0002\u0010®\u0002\"\u0005\b¯\u0002\u0010dR'\u0010³\u0002\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b1\u0010Ò\u0001\u001a\u0005\b±\u0002\u0010x\"\u0006\b²\u0002\u0010\u0002R\u0018\u0010´\u0002\u001a\u00020X8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b%\u0010¤\u0001R\u0018\u0010µ\u0002\u001a\u00020X8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bS\u0010¤\u0001R\u0019\u0010·\u0002\u001a\u00030¶\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0001R \u0010»\u0002\u001a\t\u0012\u0004\u0012\u00020X0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0019\u0010¼\u0002\u001a\u00020o8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010¦\u0001R\u001b\u0010¾\u0002\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010½\u0002R \u0010¿\u0002\u001a\t\u0012\u0004\u0012\u00020J0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bã\u0001\u0010º\u0002R \u0010À\u0002\u001a\t\u0012\u0004\u0012\u00020m0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010º\u0002R \u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020o0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bò\u0001\u0010º\u0002R \u0010Â\u0002\u001a\t\u0012\u0004\u0012\u00020N0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bï\u0001\u0010º\u0002R \u0010Ã\u0002\u001a\t\u0012\u0004\u0012\u00020X0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bË\u0001\u0010º\u0002R \u0010Ä\u0002\u001a\t\u0012\u0004\u0012\u00020[0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010º\u0002R \u0010Å\u0002\u001a\t\u0012\u0004\u0012\u00020X0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bé\u0001\u0010º\u0002R\u0019\u0010Æ\u0002\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bì\u0001\u0010\u0002R \u0010Ç\u0002\u001a\t\u0012\u0004\u0012\u00020)0¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010º\u0002R\u0019\u0010È\u0002\u001a\u00020)8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010Ò\u0001R\u0019\u0010É\u0002\u001a\u00020o8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010¦\u0001R\u0019\u0010Ê\u0002\u001a\u00020)8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010Ò\u0001R\u0019\u0010Ì\u0002\u001a\u00020)8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bË\u0002\u0010Ò\u0001R!\u0010Î\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010º\u0002R!\u0010Ð\u0002\u001a\n\u0012\u0005\u0012\u00030Ï\u00020¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010º\u0002R\u0017\u0010Ñ\u0002\u001a\u00020[8\u0002XD¢\u0006\b\n\u0006\b\u0002\u0010\u0001R\u0019\u0010Ò\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010\u0001R\u0019\u0010Ó\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0001R\u0019\u0010Ô\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010Õ\u0002\u001a\u00020[8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0001R\u001b\u0010×\u0002\u001a\u00020N8\u0006¢\u0006\u000f\n\u0006\bÏ\u0001\u0010\u0002\u001a\u0005\bÖ\u0002\u0010VR\u001a\u0010Ù\u0002\u001a\u00020N8\u0006¢\u0006\u000e\n\u0005\bA\u0010\u0002\u001a\u0005\bØ\u0002\u0010VR\u001a\u0010Û\u0002\u001a\u00020N8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0002\u001a\u0005\bÚ\u0002\u0010VR\u001d\u0010Ü\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010@0µ\u00018F¢\u0006\b\u001a\u0006\bË\u0002\u0010¹\u0001R\u001d\u0010Ý\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0µ\u00018F¢\u0006\b\u001a\u0006\b¹\u0002\u0010¹\u0001¨\u0006ß\u0002"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/E0;", "LeF/i;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "LOE/q;", "sugarcube", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LKF/a;", "files", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "uploaderV2", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "<init>", "(Landroidx/lifecycle/U;Lcom/sugarcube/app/base/data/SceneRepository;LOE/q;LOE/e;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LKF/a;LKF/r;Lcom/sugarcube/app/base/upload/IUploaderV2;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "LXH/N;", "A1", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "P1", "(Ljava/lang/Exception;)V", "Lcom/sugarcube/app/base/data/model/QualityMeta;", "Y0", "()Lcom/sugarcube/app/base/data/model/QualityMeta;", "qualityMeta", "LXH/v;", "", "", "G1", "(Lcom/sugarcube/app/base/data/model/QualityMeta;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "a1", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/model/QualityMeta;LdI/e;)Ljava/lang/Object;", "X0", "Ljava/util/UUID;", "uuid", "V1", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "negAnalytics", "g2", "(LnI/a;)V", "k2", "reason", "d2", "(Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "Landroid/net/Uri;", "z1", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "roomTitle", "b2", "(Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;)V", "state", "X1", "Lcom/sugarcube/app/base/ui/hybrid/K0;", "sensorData", "Z1", "(Lcom/sugarcube/app/base/ui/hybrid/K0;)V", "", "intrinsics", "Y1", "([F)V", "angles", "Z0", "S1", "M1", "()[F", "L1", "", "N1", "()I", "", "J1", "()F", "Lkotlin/Function3;", "Lcom/google/ar/core/Session;", "Lcom/google/ar/core/Frame;", "Lcom/sugarcube/app/base/ui/hybrid/OnFrameUpdateListener;", "listener", "x2", "(LnI/q;)V", "F2", "z2", "G2", "Lcom/sugarcube/app/base/ui/hybrid/o;", "arSurface", "B2", "(Lcom/sugarcube/app/base/ui/hybrid/o;)V", "H2", "Landroid/graphics/Bitmap;", "bitmap", "", "timestamp", "rotation", "tracking", "pixelIntensity", "targetIdx", "V0", "(Landroid/graphics/Bitmap;JLcom/sugarcube/app/base/ui/hybrid/K0;[FIFI)V", "F1", "()Z", "U1", "(LdI/e;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "v2", "(Landroid/app/Activity;LdI/e;)Ljava/lang/Object;", "E2", "(Landroid/app/Activity;)V", "Lcom/sugarcube/app/base/ui/hybrid/M0;", "Landroid/media/Image;", "Landroid/hardware/camera2/TotalCaptureResult;", "Lcom/sugarcube/app/base/ui/hybrid/OnImageReadyListener;", "W1", "(Landroid/app/Activity;LnI/q;)V", "D2", "I2", "Q1", "R1", "T1", "B1", "(LnI/a;)Z", "C1", "E1", "D1", "O1", "a2", "n2", "C", "Landroidx/lifecycle/U;", "D", "Lcom/sugarcube/app/base/data/SceneRepository;", "getSceneRepository", "()Lcom/sugarcube/app/base/data/SceneRepository;", "E", "LOE/q;", "w1", "()LOE/q;", "F", "LOE/e;", "G", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "H", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "I", "LKF/r;", "J", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "K", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "L", "Lcom/sugarcube/app/base/data/user/UserRepo;", "x1", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "M", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Landroidx/lifecycle/K;", "LtF/h;", "N", "Landroidx/lifecycle/K;", "_showDialog", "Landroidx/lifecycle/F;", "O", "Landroidx/lifecycle/F;", "v1", "()Landroidx/lifecycle/F;", "showDialog", "kotlin.jvm.PlatformType", "P", "_privacyPolicyErrorState", "Q", "p1", "privacyPolicyErrorState", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "R", "privacyPolicyState", "S", "_privacyPolicyUri", "T", "_arInitDone", "U", "_finish", "X", "i1", "finish", "Y", "Ljava/util/UUID;", "y1", "()Ljava/util/UUID;", "Ljava/time/Instant;", "Z", "Ljava/time/Instant;", "f1", "()Ljava/time/Instant;", "creation", "value", "y0", "Lcom/sugarcube/core/network/models/RoomType;", "s1", "()Lcom/sugarcube/core/network/models/RoomType;", "z0", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "A0", "isCamPanoMode", "B0", "e1", "captureType", "C0", "d1", "captureStrategy", "D0", "k1", "hybridMode", "E0", "l1", "jpegQuality", "F0", "h1", "enableShowPoints", "G0", "g1", "enableShowPlanes", "H0", "u1", "showArInitStep", "I0", "getFloorDetectionEnabled", "floorDetectionEnabled", "J0", "getUseAnchors", "useAnchors", "K0", "getFloorTimeMinimum", "floorTimeMinimum", "L0", "j1", "floorTimeoutLimit", "Ljava/io/File;", "M0", "Ljava/io/File;", "c1", "()Ljava/io/File;", "captureDir", "N0", "t1", "saveDir", "O0", "getRecordingPath", "recordingPath", "P0", "I1", "c2", "(Z)V", "isStepDone", "Q0", "getCaptureInterruptEnabled", "setCaptureInterruptEnabled", "captureInterruptEnabled", "R0", "[F", "m1", "originMatrix", "S0", "Landroid/graphics/Bitmap;", "o1", "()Landroid/graphics/Bitmap;", "panoMosaic", "T0", "n1", "panoCenter", "Lcom/squareup/moshi/t;", "U0", "Lcom/squareup/moshi/t;", "moshi", "Lcom/sugarcube/app/base/ui/hybrid/Z;", "Lcom/sugarcube/app/base/ui/hybrid/Z;", "metaBuilder", "W0", "LnI/q;", "getOnFrameUpdateListener", "()LnI/q;", "setOnFrameUpdateListener", "onFrameUpdateListener", "getSaveFrameEnabled", "setSaveFrameEnabled", "saveFrameEnabled", "startingVideoFrameIndex", "stoppingVideoFrameIndex", "", "videoTimeSecs", "", "b1", "Ljava/util/List;", "droppedVideoFrames", "startingVideoTimeNS", "Lcom/sugarcube/app/base/ui/hybrid/K0;", "originSensorData", "panoSensorData", "panoImages", "panoImageTimestamps", "panoRotations", "panoTracking", "panoPixelIntensity", "panoTargetIdx", "panoIntrinsics", "panoUsedPNGFallback", "arInitActive", "arInitStartTimeMillis", "timeoutReached", "q1", "floorAnchorCreated", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "principalPointThreshold", "panoPrincipalRatioX", "panoPrincipalRatioY", "principalRatioX", "principalRatioY", "getRotationTransform", "rotationTransform", "getMTyz", "mTyz", "getMTz90", "mTz90", "privacyPolicyUri", "arInitDone", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E0 extends C14418i {

    /* renamed from: B1  reason: collision with root package name */
    public static final a f124534B1 = new a((DefaultConstructorMarker) null);

    /* renamed from: C1  reason: collision with root package name */
    public static final int f124535C1 = 8;
    /* access modifiers changed from: private */

    /* renamed from: D1  reason: collision with root package name */
    public static final long f124536D1 = TimeUnit.SECONDS.toMillis(14);
    /* access modifiers changed from: private */

    /* renamed from: E1  reason: collision with root package name */
    public static final Dimension f124537E1 = new Dimension(640, 480);

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f124538A0;

    /* renamed from: A1  reason: collision with root package name */
    private final float[] f124539A1;

    /* renamed from: B0  reason: collision with root package name */
    private final String f124540B0;

    /* renamed from: C  reason: collision with root package name */
    private final U f124541C;

    /* renamed from: C0  reason: collision with root package name */
    private final String f124542C0;

    /* renamed from: D  reason: collision with root package name */
    private final SceneRepository f124543D;

    /* renamed from: D0  reason: collision with root package name */
    private final String f124544D0;

    /* renamed from: E  reason: collision with root package name */
    private final q f124545E;

    /* renamed from: E0  reason: collision with root package name */
    private final int f124546E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final C13313e f124547F;

    /* renamed from: F0  reason: collision with root package name */
    private final boolean f124548F0;

    /* renamed from: G  reason: collision with root package name */
    private final VideoAssetRepository f124549G;

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f124550G0;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final ConfigRepository f124551H;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f124552H0;

    /* renamed from: I  reason: collision with root package name */
    private final C13164r f124553I;

    /* renamed from: I0  reason: collision with root package name */
    private final boolean f124554I0;

    /* renamed from: J  reason: collision with root package name */
    private final IUploaderV2 f124555J;

    /* renamed from: J0  reason: collision with root package name */
    private final boolean f124556J0;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final PrivacyPolicyConsentUseCase f124557K;

    /* renamed from: K0  reason: collision with root package name */
    private final int f124558K0;

    /* renamed from: L  reason: collision with root package name */
    private final UserRepo f124559L;

    /* renamed from: L0  reason: collision with root package name */
    private final int f124560L0;

    /* renamed from: M  reason: collision with root package name */
    private final FirebaseInteractions f124561M;

    /* renamed from: M0  reason: collision with root package name */
    private final File f124562M0;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public final K<C15083h> f124563N;

    /* renamed from: N0  reason: collision with root package name */
    private final File f124564N0;

    /* renamed from: O  reason: collision with root package name */
    private final F<C15083h> f124565O;

    /* renamed from: O0  reason: collision with root package name */
    private final String f124566O0;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public final K<Boolean> f124567P;

    /* renamed from: P0  reason: collision with root package name */
    private boolean f124568P0;

    /* renamed from: Q  reason: collision with root package name */
    private final F<Boolean> f124569Q;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f124570Q0;

    /* renamed from: R  reason: collision with root package name */
    private final F<PrivacyPolicyFeatureState> f124571R;

    /* renamed from: R0  reason: collision with root package name */
    private float[] f124572R0;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public final K<Uri> f124573S = new K<>();

    /* renamed from: S0  reason: collision with root package name */
    private Bitmap f124574S0;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public final K<Boolean> f124575T = new K<>(null);

    /* renamed from: T0  reason: collision with root package name */
    private Bitmap f124576T0;

    /* renamed from: U  reason: collision with root package name */
    private final K<C16807N> f124577U;
    /* access modifiers changed from: private */

    /* renamed from: U0  reason: collision with root package name */
    public final t f124578U0;
    /* access modifiers changed from: private */

    /* renamed from: V0  reason: collision with root package name */
    public Z f124579V0;

    /* renamed from: W0  reason: collision with root package name */
    private nI.q<? super Session, ? super Frame, ? super K0, Integer> f124580W0;

    /* renamed from: X  reason: collision with root package name */
    private final F<C16807N> f124581X;

    /* renamed from: X0  reason: collision with root package name */
    private boolean f124582X0;

    /* renamed from: Y  reason: collision with root package name */
    private final UUID f124583Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0  reason: collision with root package name */
    public int f124584Y0;

    /* renamed from: Z  reason: collision with root package name */
    private final Instant f124585Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public int f124586Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public double f124587a1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public List<Integer> f124588b1;

    /* renamed from: c1  reason: collision with root package name */
    private long f124589c1;

    /* renamed from: d1  reason: collision with root package name */
    private K0 f124590d1;

    /* renamed from: e1  reason: collision with root package name */
    private List<K0> f124591e1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public List<Bitmap> f124592f1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public List<Long> f124593g1;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public List<float[]> f124594h1;

    /* renamed from: i1  reason: collision with root package name */
    private List<Integer> f124595i1;

    /* renamed from: j1  reason: collision with root package name */
    private List<Float> f124596j1;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public List<Integer> f124597k1;

    /* renamed from: l1  reason: collision with root package name */
    private float[] f124598l1;
    /* access modifiers changed from: private */

    /* renamed from: m1  reason: collision with root package name */
    public List<Boolean> f124599m1;

    /* renamed from: n1  reason: collision with root package name */
    private boolean f124600n1;

    /* renamed from: o1  reason: collision with root package name */
    private long f124601o1;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public boolean f124602p1;

    /* renamed from: q1  reason: collision with root package name */
    private boolean f124603q1;
    /* access modifiers changed from: private */

    /* renamed from: r1  reason: collision with root package name */
    public List<com.sugarcube.app.base.data.database.Metadata> f124604r1;
    /* access modifiers changed from: private */

    /* renamed from: s1  reason: collision with root package name */
    public List<Media> f124605s1;

    /* renamed from: t1  reason: collision with root package name */
    private final float f124606t1;

    /* renamed from: u1  reason: collision with root package name */
    private float f124607u1;

    /* renamed from: v1  reason: collision with root package name */
    private float f124608v1;

    /* renamed from: w1  reason: collision with root package name */
    private float f124609w1;

    /* renamed from: x1  reason: collision with root package name */
    private float f124610x1;

    /* renamed from: y0  reason: collision with root package name */
    private RoomType f124611y0;

    /* renamed from: y1  reason: collision with root package name */
    private final float[] f124612y1;

    /* renamed from: z0  reason: collision with root package name */
    private String f124613z0;

    /* renamed from: z1  reason: collision with root package name */
    private final float[] f124614z1;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/E0$a;", "", "<init>", "()V", "", "DEFAULT_ARINIT_DURATION_SECS", "J", "a", "()J", "Lcom/sugarcube/app/base/data/model/Dimension;", "DEFAULT_VIDEO_ENCODE_SIZE", "Lcom/sugarcube/app/base/data/model/Dimension;", "b", "()Lcom/sugarcube/app/base/data/model/Dimension;", "", "PANO_IMAGE_PNG_EXT", "Ljava/lang/String;", "PANO_IMAGE_HEIF_EXT", "PANO_IMAGE_JPEG_EXT", "PANO_IMAGE_WEBP_EXT", "PANO_IMAGE_FN_FORMAT", "CAPTURE_TYPE_HYBRID", "CAPTURE_STRATEGY_HYBRID", "CAPTURE_STRATEGY_HYBRID_CAMPANO", "SAVED_STATE_CAPTURE_UUID_KEY", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return E0.f124536D1;
        }

        public final Dimension b() {
            return E0.f124537E1;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$doSave$2", f = "HybridViewModel.kt", l = {1052}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super v<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124615c;

        /* renamed from: d  reason: collision with root package name */
        Object f124616d;

        /* renamed from: e  reason: collision with root package name */
        Object f124617e;

        /* renamed from: f  reason: collision with root package name */
        Object f124618f;

        /* renamed from: g  reason: collision with root package name */
        Object f124619g;

        /* renamed from: h  reason: collision with root package name */
        Object f124620h;

        /* renamed from: i  reason: collision with root package name */
        Object f124621i;

        /* renamed from: j  reason: collision with root package name */
        Object f124622j;

        /* renamed from: k  reason: collision with root package name */
        int f124623k;

        /* renamed from: l  reason: collision with root package name */
        int f124624l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ E0 f124625m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Context f124626n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ QualityMeta f124627o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E0 e02, Context context, QualityMeta qualityMeta, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124625m = e02;
            this.f124626n = context;
            this.f124627o = qualityMeta;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124625m, this.f124626n, this.f124627o, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super v<Boolean, String>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0671  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x06a3  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x06aa  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0526  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x05b2 A[LOOP:0: B:87:0x05af->B:89:0x05b2, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x05e2  */
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
                int r0 = r1.f124624l
                java.lang.String r11 = ") - "
                if (r0 == 0) goto L_0x004c
                if (r0 != r2) goto L_0x0044
                java.lang.Object r0 = r1.f124622j
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f124621i
                com.sugarcube.app.base.ui.hybrid.E0 r0 = (com.sugarcube.app.base.ui.hybrid.E0) r0
                java.lang.Object r0 = r1.f124620h
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f124619g
                com.sugarcube.core.network.models.SessionMeta r0 = (com.sugarcube.core.network.models.SessionMeta) r0
                java.lang.Object r0 = r1.f124618f
                com.sugarcube.app.base.data.model.VideoMeta r0 = (com.sugarcube.app.base.data.model.VideoMeta) r0
                java.lang.Object r0 = r1.f124617e
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                java.lang.Object r0 = r1.f124616d
                kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
                java.lang.Object r2 = r1.f124615c
                kotlin.jvm.internal.K r2 = (kotlin.jvm.internal.K) r2
                XH.y.b(r51)
                r3 = r11
            L_0x0041:
                r4 = 0
                goto L_0x069e
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
                com.sugarcube.app.base.ui.hybrid.E0 r2 = r1.f124625m
                int r2 = r2.l1()
                com.sugarcube.app.base.ui.hybrid.E0 r3 = r1.f124625m
                java.util.UUID r3 = r3.y1()
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
                com.sugarcube.app.base.ui.hybrid.E0 r2 = r1.f124625m
                java.util.List r2 = r2.f124605s1
                com.sugarcube.app.base.data.database.Media r10 = new com.sugarcube.app.base.data.database.Media
                java.io.File r12 = new java.io.File
                r24 = r11
                com.sugarcube.app.base.ui.hybrid.E0 r11 = r1.f124625m
                java.io.File r11 = r11.t1()
                r25 = r4
                java.lang.String r4 = "rgb.mp4"
                r12.<init>(r11, r4)
                android.net.Uri r11 = android.net.Uri.fromFile(r12)
                java.lang.String r12 = "fromFile(...)"
                kotlin.jvm.internal.C17542s.i(r11, r12)
                com.sugarcube.app.base.data.database.MediaType r21 = com.sugarcube.app.base.data.database.MediaType.VIDEO
                com.sugarcube.app.base.ui.hybrid.E0$a r26 = com.sugarcube.app.base.ui.hybrid.E0.f124534B1
                com.sugarcube.app.base.data.model.Dimension r18 = r26.b()
                int r22 = r18.getWidth()
                com.sugarcube.app.base.data.model.Dimension r18 = r26.b()
                int r23 = r18.getHeight()
                java.lang.String r19 = "rgb.mp4"
                r18 = r10
                r20 = r11
                r18.<init>(r19, r20, r21, r22, r23)
                r2.add(r10)
                long r10 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r2 = r1.f124625m
                r51 = r4
                boolean r4 = r13.f144344a
                r18 = r5
                r19 = r6
                long r5 = r15.f144347a
                long r5 = r10 - r5
                java.util.UUID r2 = r2.y1()
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
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                int r28 = r0.f124584Y0
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                int r29 = r0.f124586Z0
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                double r30 = r0.f124587a1
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.util.List r32 = r0.f124588b1
                com.sugarcube.app.base.data.model.Dimension r34 = r26.b()
                com.sugarcube.app.base.data.model.Dimension r35 = r26.b()
                r37 = 128(0x80, float:1.794E-43)
                r38 = 0
                r33 = 0
                r36 = 0
                r27 = r2
                r27.<init>(r28, r29, r30, r32, r33, r34, r35, r36, r37, r38)
                r3 = 0
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.hybrid.E0 r6 = r1.f124625m     // Catch:{ IOException -> 0x01a0 }
                java.io.File r6 = r6.c1()     // Catch:{ IOException -> 0x01a0 }
                r0.<init>(r6, r8)     // Catch:{ IOException -> 0x01a0 }
                r6 = 0
                r9 = 1
                WK.L r0 = WK.z.g(r0, r3, r9, r6)     // Catch:{ IOException -> 0x01a0 }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x01a0 }
                com.squareup.moshi.q r6 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x01a0 }
                com.squareup.moshi.t r0 = r0.f124578U0     // Catch:{ all -> 0x01a2 }
                java.lang.Class<com.sugarcube.app.base.data.model.VideoMeta> r9 = com.sugarcube.app.base.data.model.VideoMeta.class
                com.squareup.moshi.f r0 = r0.c(r9)     // Catch:{ all -> 0x01a2 }
                r0.toJson((com.squareup.moshi.q) r6, r2)     // Catch:{ all -> 0x01a2 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01a2 }
                r9 = 0
                jI.C17416c.a(r6, r9)     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x01a0 }
                java.util.List r0 = r0.f124604r1     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.data.database.Metadata r6 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x01a0 }
                java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x01a0 }
                com.sugarcube.app.base.ui.hybrid.E0 r10 = r1.f124625m     // Catch:{ IOException -> 0x01a0 }
                java.io.File r10 = r10.t1()     // Catch:{ IOException -> 0x01a0 }
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
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                YE.b r14 = YE.C13868b.f118106a
                r20 = r2
                boolean r2 = r13.f144344a
                r21 = r8
                r22 = r9
                long r8 = r15.f144347a
                long r8 = r3 - r8
                java.util.UUID r0 = r0.y1()
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
                android.content.Context r0 = r1.f124626n
                r28 = r0
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                OE.q r29 = r0.w1()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                OE.e r30 = r0.f124547F
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.time.Instant r0 = r0.f1()
                r31 = r0
                java.lang.String r2 = "<get-creation>(...)"
                kotlin.jvm.internal.C17542s.i(r0, r2)
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.lang.String r34 = r0.k1()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.lang.String r35 = r0.d1()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                com.sugarcube.app.base.data.feature.ConfigRepository r0 = r0.f124551H
                java.util.List r42 = r0.getEnabledFeatures()
                r48 = 1031936(0xfbf00, float:1.44605E-39)
                r49 = 0
                r32 = 1
                r33 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                com.sugarcube.core.network.models.SessionMeta r2 = com.sugarcube.app.base.data.model.SessionMetaKt.newInstance$default(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x02eb }
                com.sugarcube.app.base.ui.hybrid.E0 r3 = r1.f124625m     // Catch:{ IOException -> 0x02eb }
                java.io.File r3 = r3.c1()     // Catch:{ IOException -> 0x02eb }
                r4 = r18
                r0.<init>(r3, r4)     // Catch:{ IOException -> 0x02e0 }
                r3 = 0
                r6 = 0
                r8 = 1
                WK.L r0 = WK.z.g(r0, r6, r8, r3)     // Catch:{ IOException -> 0x02e0 }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x02e0 }
                com.squareup.moshi.q r3 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x02e0 }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x02e0 }
                com.squareup.moshi.t r0 = r0.f124578U0     // Catch:{ all -> 0x02e2 }
                java.lang.Class<com.sugarcube.core.network.models.SessionMeta> r6 = com.sugarcube.core.network.models.SessionMeta.class
                com.squareup.moshi.f r0 = r0.c(r6)     // Catch:{ all -> 0x02e2 }
                r0.toJson((com.squareup.moshi.q) r3, r2)     // Catch:{ all -> 0x02e2 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x02e2 }
                r6 = 0
                jI.C17416c.a(r3, r6)     // Catch:{ IOException -> 0x02e0 }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x02e0 }
                java.util.List r0 = r0.f124604r1     // Catch:{ IOException -> 0x02e0 }
                com.sugarcube.app.base.data.database.Metadata r3 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x02e0 }
                java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x02e0 }
                com.sugarcube.app.base.ui.hybrid.E0 r8 = r1.f124625m     // Catch:{ IOException -> 0x02e0 }
                java.io.File r8 = r8.t1()     // Catch:{ IOException -> 0x02e0 }
                r6.<init>(r8, r4)     // Catch:{ IOException -> 0x02e0 }
                android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ IOException -> 0x02e0 }
                kotlin.jvm.internal.C17542s.i(r6, r12)     // Catch:{ IOException -> 0x02e0 }
                r3.<init>(r4, r6)     // Catch:{ IOException -> 0x02e0 }
                r0.add(r3)     // Catch:{ IOException -> 0x02e0 }
                r8 = r15
                r6 = r22
                r9 = r23
                r3 = r26
                goto L_0x0333
            L_0x02e0:
                r0 = move-exception
                goto L_0x02ee
            L_0x02e2:
                r0 = move-exception
                r6 = r0
                throw r6     // Catch:{ all -> 0x02e5 }
            L_0x02e5:
                r0 = move-exception
                r8 = r0
                jI.C17416c.a(r3, r6)     // Catch:{ IOException -> 0x02e0 }
                throw r8     // Catch:{ IOException -> 0x02e0 }
            L_0x02eb:
                r0 = move-exception
                r4 = r18
            L_0x02ee:
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
            L_0x0333:
                long r14 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                YE.b r11 = YE.C13868b.f118106a
                r18 = r2
                boolean r2 = r13.f144344a
                r26 = r3
                r22 = r4
                long r3 = r8.f144347a
                long r3 = r14 - r3
                java.util.UUID r0 = r0.y1()
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
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x03b2 }
                com.sugarcube.app.base.ui.hybrid.Z r0 = r0.f124579V0     // Catch:{ IOException -> 0x03b2 }
                java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x03b2 }
                com.sugarcube.app.base.ui.hybrid.E0 r3 = r1.f124625m     // Catch:{ IOException -> 0x03b2 }
                java.io.File r3 = r3.c1()     // Catch:{ IOException -> 0x03b2 }
                r4 = r25
                r2.<init>(r3, r4)     // Catch:{ IOException -> 0x03b0 }
                r0.A(r2)     // Catch:{ IOException -> 0x03b0 }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x03b0 }
                java.util.List r0 = r0.f124604r1     // Catch:{ IOException -> 0x03b0 }
                com.sugarcube.app.base.data.database.Metadata r2 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x03b0 }
                java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x03b0 }
                com.sugarcube.app.base.ui.hybrid.E0 r6 = r1.f124625m     // Catch:{ IOException -> 0x03b0 }
                java.io.File r6 = r6.t1()     // Catch:{ IOException -> 0x03b0 }
                r3.<init>(r6, r4)     // Catch:{ IOException -> 0x03b0 }
                android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x03b0 }
                kotlin.jvm.internal.C17542s.i(r3, r12)     // Catch:{ IOException -> 0x03b0 }
                r2.<init>(r4, r3)     // Catch:{ IOException -> 0x03b0 }
                r0.add(r2)     // Catch:{ IOException -> 0x03b0 }
                r9 = r23
                r2 = r26
                r3 = r27
                goto L_0x03f9
            L_0x03b0:
                r0 = move-exception
                goto L_0x03b5
            L_0x03b2:
                r0 = move-exception
                r4 = r25
            L_0x03b5:
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
            L_0x03f9:
                long r14 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                YE.b r11 = YE.C13868b.f118106a
                boolean r6 = r13.f144344a
                r27 = r3
                r25 = r4
                long r3 = r8.f144347a
                long r3 = r14 - r3
                java.util.UUID r0 = r0.y1()
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
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.ui.hybrid.E0 r2 = r1.f124625m     // Catch:{ IOException -> 0x048f }
                java.io.File r2 = r2.c1()     // Catch:{ IOException -> 0x048f }
                r3 = r16
                r0.<init>(r2, r3)     // Catch:{ IOException -> 0x048f }
                r2 = 0
                r4 = 0
                r6 = 1
                WK.L r0 = WK.z.g(r0, r4, r6, r2)     // Catch:{ IOException -> 0x048f }
                WK.f r0 = WK.y.c(r0)     // Catch:{ IOException -> 0x048f }
                com.squareup.moshi.q r2 = com.squareup.moshi.q.q(r0)     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.data.model.QualityMeta r4 = r1.f124627o     // Catch:{ IOException -> 0x048f }
                com.squareup.moshi.t r0 = r0.f124578U0     // Catch:{ all -> 0x0491 }
                java.lang.Class<com.sugarcube.app.base.data.model.QualityMeta> r6 = com.sugarcube.app.base.data.model.QualityMeta.class
                com.squareup.moshi.f r0 = r0.c(r6)     // Catch:{ all -> 0x0491 }
                r0.toJson((com.squareup.moshi.q) r2, r4)     // Catch:{ all -> 0x0491 }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0491 }
                r4 = 0
                jI.C17416c.a(r2, r4)     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m     // Catch:{ IOException -> 0x048f }
                java.util.List r0 = r0.f124604r1     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.data.database.Metadata r2 = new com.sugarcube.app.base.data.database.Metadata     // Catch:{ IOException -> 0x048f }
                java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x048f }
                com.sugarcube.app.base.ui.hybrid.E0 r6 = r1.f124625m     // Catch:{ IOException -> 0x048f }
                java.io.File r6 = r6.t1()     // Catch:{ IOException -> 0x048f }
                r4.<init>(r6, r3)     // Catch:{ IOException -> 0x048f }
                android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ IOException -> 0x048f }
                kotlin.jvm.internal.C17542s.i(r4, r12)     // Catch:{ IOException -> 0x048f }
                r2.<init>(r3, r4)     // Catch:{ IOException -> 0x048f }
                r0.add(r2)     // Catch:{ IOException -> 0x048f }
                r2 = r26
                r3 = r27
                goto L_0x04de
            L_0x048f:
                r0 = move-exception
                goto L_0x049a
            L_0x0491:
                r0 = move-exception
                r3 = r0
                throw r3     // Catch:{ all -> 0x0494 }
            L_0x0494:
                r0 = move-exception
                r4 = r0
                jI.C17416c.a(r2, r3)     // Catch:{ IOException -> 0x048f }
                throw r4     // Catch:{ IOException -> 0x048f }
            L_0x049a:
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
            L_0x04de:
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                YE.b r4 = YE.C13868b.f118106a
                boolean r9 = r13.f144344a
                long r11 = r8.f144347a
                long r11 = r6 - r11
                java.util.UUID r0 = r0.y1()
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
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.io.File r0 = r0.c1()
                com.sugarcube.app.base.ui.hybrid.E0 r6 = r1.f124625m
                java.io.File r6 = r6.t1()
                boolean r0 = r0.renameTo(r6)
                if (r0 != 0) goto L_0x0529
                r6 = 0
                r13.f144344a = r6
            L_0x0529:
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                boolean r11 = r13.f144344a
                long r14 = r8.f144347a
                long r14 = r6 - r14
                java.util.UUID r0 = r0.y1()
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
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                java.io.File r0 = r0.c1()
                jI.C17423j.r(r0)
                long r6 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.hybrid.E0 r0 = r1.f124625m
                boolean r11 = r13.f144344a
                long r14 = r8.f144347a
                long r14 = r6 - r14
                java.util.UUID r0 = r0.y1()
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
                java.lang.String r0 = "pano_0_meta.json"
                r6 = r51
                r5 = r21
                r4 = r22
                r2 = r25
                java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r2, r0}
                java.util.Set r0 = YH.g0.f(r0)
                r14 = 0
            L_0x05af:
                r2 = 5
                if (r14 >= r2) goto L_0x05d4
                kotlin.jvm.internal.V r2 = kotlin.jvm.internal.V.f144353a
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.e(r14)
                java.lang.String r4 = "jpg"
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
                r4 = 2
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
                java.lang.String r4 = "colorPano_0_%01d.%s"
                java.lang.String r2 = java.lang.String.format(r4, r2)
                java.lang.String r4 = "format(...)"
                kotlin.jvm.internal.C17542s.i(r2, r4)
                r0.add(r2)
                r2 = 1
                int r14 = r14 + r2
                goto L_0x05af
            L_0x05d4:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.sugarcube.app.base.ui.hybrid.E0 r2 = r1.f124625m
                java.util.Iterator r4 = r0.iterator()
            L_0x05dc:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x066b
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.io.File r6 = new java.io.File
                java.io.File r7 = r2.t1()
                r6.<init>(r7, r5)
                boolean r7 = r6.exists()
                long r11 = r6.length()
                YE.b r6 = YE.C13868b.f118106a
                java.util.UUID r9 = r2.y1()
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "check - "
                r14.append(r15)
                r14.append(r5)
                java.lang.String r15 = " ("
                r14.append(r15)
                r14.append(r7)
                r14.append(r10)
                r14.append(r11)
                r14.append(r3)
                r14.append(r9)
                java.lang.String r9 = r14.toString()
                YE.e r14 = YE.e.Capture
                r6.b(r9, r14)
                if (r7 == 0) goto L_0x0631
                r21 = 0
                int r6 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r6 != 0) goto L_0x0633
            L_0x0631:
                r6 = 0
                goto L_0x0638
            L_0x0633:
                r6 = r26
                r9 = r27
                goto L_0x0665
            L_0x0638:
                r13.f144344a = r6
                r6 = r26
                T r9 = r6.f144348a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r9 = r27
                r14.append(r9)
                r14.append(r5)
                r14.append(r15)
                r14.append(r7)
                r14.append(r10)
                r14.append(r11)
                java.lang.String r5 = ")]"
                r14.append(r5)
                java.lang.String r5 = r14.toString()
                r6.f144348a = r5
            L_0x0665:
                r26 = r6
                r27 = r9
                goto L_0x05dc
            L_0x066b:
                r6 = r26
                boolean r5 = r13.f144344a
                if (r5 == 0) goto L_0x06a3
                com.sugarcube.app.base.ui.hybrid.E0 r5 = r1.f124625m
                java.util.UUID r7 = r5.y1()
                r1.f124615c = r13
                r1.f124616d = r6
                r1.f124617e = r8
                r8 = r20
                r1.f124618f = r8
                r8 = r18
                r1.f124619g = r8
                r1.f124620h = r0
                r1.f124621i = r2
                r1.f124622j = r4
                r2 = 0
                r1.f124623k = r2
                r2 = 1
                r1.f124624l = r2
                java.lang.Object r0 = r5.V1(r7, r1)
                r2 = r17
                if (r0 != r2) goto L_0x069a
                return r2
            L_0x069a:
                r0 = r6
                r2 = r13
                goto L_0x0041
            L_0x069e:
                r0.f144348a = r4
                r14 = r0
                r13 = r2
                goto L_0x06a4
            L_0x06a3:
                r14 = r6
            L_0x06a4:
                T r0 = r14.f144348a
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x06b1
                YE.b r2 = YE.C13868b.f118106a
                YE.e r4 = YE.e.Capture
                r2.b(r0, r4)
            L_0x06b1:
                YE.b r0 = YE.C13868b.f118106a
                boolean r2 = r13.f144344a
                com.sugarcube.app.base.ui.hybrid.E0 r4 = r1.f124625m
                java.util.UUID r4 = r4.y1()
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
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.E0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel", f = "HybridViewModel.kt", l = {719, 731, 756, 772}, m = "isQualityOk")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f124628c;

        /* renamed from: d  reason: collision with root package name */
        Object f124629d;

        /* renamed from: e  reason: collision with root package name */
        Object f124630e;

        /* renamed from: f  reason: collision with root package name */
        Object f124631f;

        /* renamed from: g  reason: collision with root package name */
        int f124632g;

        /* renamed from: h  reason: collision with root package name */
        float f124633h;

        /* renamed from: i  reason: collision with root package name */
        long f124634i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f124635j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ E0 f124636k;

        /* renamed from: l  reason: collision with root package name */
        int f124637l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(E0 e02, C17164e<? super c> eVar) {
            super(eVar);
            this.f124636k = e02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f124635j = obj;
            this.f124637l |= Integer.MIN_VALUE;
            return this.f124636k.G1((QualityMeta) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel", f = "HybridViewModel.kt", l = {784, 786, 790, 793, 807, 813}, m = "saveCapture")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f124638c;

        /* renamed from: d  reason: collision with root package name */
        Object f124639d;

        /* renamed from: e  reason: collision with root package name */
        Object f124640e;

        /* renamed from: f  reason: collision with root package name */
        Object f124641f;

        /* renamed from: g  reason: collision with root package name */
        Object f124642g;

        /* renamed from: h  reason: collision with root package name */
        Object f124643h;

        /* renamed from: i  reason: collision with root package name */
        Object f124644i;

        /* renamed from: j  reason: collision with root package name */
        Object f124645j;

        /* renamed from: k  reason: collision with root package name */
        long f124646k;

        /* renamed from: l  reason: collision with root package name */
        long f124647l;

        /* renamed from: m  reason: collision with root package name */
        int f124648m;

        /* renamed from: n  reason: collision with root package name */
        int f124649n;

        /* renamed from: o  reason: collision with root package name */
        boolean f124650o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f124651p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ E0 f124652q;

        /* renamed from: r  reason: collision with root package name */
        int f124653r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(E0 e02, C17164e<? super d> eVar) {
            super(eVar);
            this.f124652q = e02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f124651p = obj;
            this.f124653r |= Integer.MIN_VALUE;
            return this.f124652q.T1((Activity) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$savePano$2", f = "HybridViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super v<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124655d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<Exception, C16807N> {
            a(Object obj) {
                super(1, obj, E0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((E0) this.receiver).P1(exc);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17642l<Exception, C16807N> {
            b(Object obj) {
                super(1, obj, E0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((E0) this.receiver).P1(exc);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17642l<Exception, C16807N> {
            c(Object obj) {
                super(1, obj, E0.class, "recordException", "recordException(Ljava/lang/Exception;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((Exception) obj);
                return C16807N.f139792a;
            }

            public final void t(Exception exc) {
                C17542s.j(exc, "p0");
                ((E0) this.receiver).P1(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(E0 e02, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f124655d = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f124655d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super v<Boolean, String>> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Throwable th2;
            C17187b.f();
            if (this.f124654c == 0) {
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
                C13868b.f118106a.b("savePanos(" + this.f124655d.l1() + ") - " + this.f124655d.y1(), YE.e.Capture);
                String str2 = "]";
                if (this.f124655d.f124592f1.size() != 5) {
                    return new v(kotlin.coroutines.jvm.internal.b.a(false), "Pano Save Failure [panoImage count=" + this.f124655d.f124592f1.size() + str2);
                }
                E0 e02 = this.f124655d;
                ArrayList arrayList33 = new ArrayList(5);
                for (int i10 = 0; i10 < 5; i10++) {
                    arrayList33.add(kotlin.coroutines.jvm.internal.b.a(false));
                }
                e02.f124599m1 = arrayList33;
                Iterator it = this.f124655d.f124592f1.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Bitmap bitmap = (Bitmap) it.next();
                    Iterator it2 = it;
                    int i12 = i11 + 1;
                    File c12 = this.f124655d.c1();
                    V v10 = V.f144353a;
                    String str3 = str2;
                    String str4 = "Pano Save Failure [";
                    String format = String.format("colorPano_0_%01d.%s", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.e(i11), "jpg"}, 2));
                    C17542s.i(format, "format(...)");
                    File file = new File(c12, format);
                    boolean f10 = C13341c.f(bitmap, file, this.f124655d.l1(), new c(this.f124655d));
                    if (!f10 || !file.exists() || file.length() <= 0) {
                        String str5 = file.getName() + "(" + f10 + "," + file.exists() + "," + file.length() + ")";
                        C13868b.f118106a.b(str5, YE.e.Capture);
                        return new v(kotlin.coroutines.jvm.internal.b.a(false), str4 + str5 + str3);
                    }
                    List z02 = this.f124655d.f124605s1;
                    String name = file.getName();
                    C17542s.i(name, "getName(...)");
                    Uri fromFile = Uri.fromFile(new File(this.f124655d.t1(), file.getName()));
                    C17542s.i(fromFile, "fromFile(...)");
                    z02.add(new Media(name, fromFile, MediaType.IMAGE, bitmap.getWidth(), bitmap.getHeight()));
                    E0 e03 = this.f124655d;
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
                    panoMeta.getAnchorPose().add(e03.f124594h1.get(i11));
                    panoMeta.getStates().add(e03.f124597k1.get(i11) + "," + e03.f124593g1.get(i11));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    E0 e04 = this.f124655d;
                    C13868b.f118106a.b("save - " + file.getName() + " (true," + (currentTimeMillis2 - currentTimeMillis) + "ms) - " + e04.y1(), YE.e.Capture);
                    currentTimeMillis = currentTimeMillis2;
                    it = it2;
                    i11 = i12;
                    str2 = str3;
                }
                String str6 = "Pano Save Failure [";
                String str7 = "ms) - ";
                try {
                    str = str2;
                    try {
                        com.squareup.moshi.q q10 = com.squareup.moshi.q.q(WK.y.c(z.g(new File(this.f124655d.c1(), "pano_0_meta.json"), false, 1, (Object) null)));
                        try {
                            this.f124655d.f124578U0.c(PanoMeta.class).toJson(q10, panoMeta);
                            C16807N n10 = C16807N.f139792a;
                            C17416c.a(q10, (Throwable) null);
                            List B02 = this.f124655d.f124604r1;
                            Uri fromFile2 = Uri.fromFile(new File(this.f124655d.t1(), "pano_0_meta.json"));
                            C17542s.i(fromFile2, "fromFile(...)");
                            B02.add(new com.sugarcube.app.base.data.database.Metadata("pano_0_meta.json", fromFile2));
                            long currentTimeMillis3 = System.currentTimeMillis();
                            E0 e05 = this.f124655d;
                            C13868b bVar = C13868b.f118106a;
                            String str8 = "save - " + "pano_0_meta.json" + " (true," + (currentTimeMillis3 - currentTimeMillis) + str7 + e05.y1();
                            YE.e eVar = YE.e.Capture;
                            bVar.b(str8, eVar);
                            this.f124655d.X0();
                            Bitmap o12 = this.f124655d.o1();
                            if (o12 != null) {
                                E0 e06 = this.f124655d;
                                C13341c.g(o12, new File(e06.c1(), "pano_preview.jpg"), 0, new a(e06), 2, (Object) null);
                                File file2 = new File(e06.c1(), "mosaic.png");
                                boolean h10 = C13341c.h(o12, file2, new b(e06));
                                if (h10) {
                                    List z03 = e06.f124605s1;
                                    String name2 = file2.getName();
                                    C17542s.i(name2, "getName(...)");
                                    Uri fromFile3 = Uri.fromFile(new File(e06.t1(), file2.getName()));
                                    C17542s.i(fromFile3, "fromFile(...)");
                                    z03.add(new Media(name2, fromFile3, MediaType.MOSAIC, o12.getWidth(), o12.getHeight()));
                                }
                                long currentTimeMillis4 = System.currentTimeMillis();
                                bVar.b("save - mosaic(" + h10 + "," + (currentTimeMillis4 - currentTimeMillis3) + str7 + e06.y1(), eVar);
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
                        String str9 = "pano_0_meta.json" + " (" + e.getMessage() + ")";
                        C13868b.f118106a.b(str9, YE.e.Capture);
                        return new v(kotlin.coroutines.jvm.internal.b.a(false), str6 + str9 + str);
                    }
                } catch (IOException e11) {
                    e = e11;
                    str = str2;
                    e.printStackTrace();
                    String str92 = "pano_0_meta.json" + " (" + e.getMessage() + ")";
                    C13868b.f118106a.b(str92, YE.e.Capture);
                    return new v(kotlin.coroutines.jvm.internal.b.a(false), str6 + str92 + str);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$setCapturePreferences$2", f = "HybridViewModel.kt", l = {1164, 1167, 1168}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f124656c;

        /* renamed from: d  reason: collision with root package name */
        int f124657d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ E0 f124658e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f124659f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(E0 e02, UUID uuid, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f124658e = e02;
            this.f124659f = uuid;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f124658e, this.f124659f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f124657d
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
                boolean r1 = r6.f124656c
                XH.y.b(r7)
                goto L_0x005c
            L_0x0023:
                XH.y.b(r7)
                goto L_0x003b
            L_0x0027:
                XH.y.b(r7)
                com.sugarcube.app.base.ui.hybrid.E0 r7 = r6.f124658e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f124551H
                com.sugarcube.app.base.data.feature.ConfigItems$CaptureFeedbackPromptWasPresented r1 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureFeedbackPromptWasPresented.INSTANCE
                r6.f124657d = r4
                java.lang.Object r7 = r7.get(r1, r6)
                if (r7 != r0) goto L_0x003b
                return r0
            L_0x003b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r1 = r7.booleanValue()
                if (r1 != 0) goto L_0x0075
                com.sugarcube.app.base.ui.hybrid.E0 r7 = r6.f124658e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f124551H
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureId r4 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureId.INSTANCE
                java.util.UUID r5 = r6.f124659f
                java.lang.String r5 = r5.toString()
                r6.f124656c = r1
                r6.f124657d = r3
                java.lang.Object r7 = r7.override(r4, r5, r6)
                if (r7 != r0) goto L_0x005c
                return r0
            L_0x005c:
                com.sugarcube.app.base.ui.hybrid.E0 r7 = r6.f124658e
                com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f124551H
                com.sugarcube.app.base.data.feature.ConfigItems$FeedbackCaptureType r3 = com.sugarcube.app.base.data.feature.ConfigItems.FeedbackCaptureType.INSTANCE
                com.sugarcube.app.base.ui.hybrid.E0 r4 = r6.f124658e
                java.lang.String r4 = r4.e1()
                r6.f124656c = r1
                r6.f124657d = r2
                java.lang.Object r7 = r7.override(r3, r4, r6)
                if (r7 != r0) goto L_0x0075
                return r0
            L_0x0075:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.E0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$showPrivacyDisclaimerDialog$1$1", f = "HybridViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(E0 e02, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f124661d = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f124661d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124660c == 0) {
                y.b(obj);
                this.f124661d.f124557K.captureLinkClicked();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$showPrivacyDisclaimerDialog$2$1", f = "HybridViewModel.kt", l = {1273}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f124663d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ E0 f124664e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C4899r0<Boolean> r0Var, E0 e02, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f124663d = r0Var;
            this.f124664e = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f124663d, this.f124664e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124662c;
            if (i10 == 0) {
                y.b(obj);
                this.f124663d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                PrivacyPolicyConsentUseCase H02 = this.f124664e.f124557K;
                this.f124662c = 1;
                obj = H02.capturePositiveAction(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f124663d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            if (booleanValue) {
                this.f124664e.f124563N.postValue(C15083h.a.f131169a);
            } else {
                this.f124664e.f124567P.postValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$showPrivacyDisclaimerDialog$3$1", f = "HybridViewModel.kt", l = {1287}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124665c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(E0 e02, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f124666d = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f124666d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124665c;
            if (i10 == 0) {
                y.b(obj);
                PrivacyPolicyConsentUseCase H02 = this.f124666d.f124557K;
                this.f124665c = 1;
                if (H02.captureNegativeAction(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f124666d.f124563N.postValue(C15083h.a.f131169a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$showPrivacyDisclaimerDialog$5$1", f = "HybridViewModel.kt", l = {}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124668d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f124669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(E0 e02, boolean z10, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f124668d = e02;
            this.f124669e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f124668d, this.f124669e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124667c == 0) {
                y.b(obj);
                this.f124668d.f124557K.captureUpdateCheckBoxState(this.f124669e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$showPrivacyDisclaimerDialog$6$1", f = "HybridViewModel.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124670c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(E0 e02, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f124671d = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f124671d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124670c == 0) {
                y.b(obj);
                this.f124671d.f124557K.captureLinkClicked();
                this.f124671d.f124573S.setValue(this.f124671d.f124557K.generatePrivacyPolicyLink());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel", f = "HybridViewModel.kt", l = {574}, m = "startAR")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f124672c;

        /* renamed from: d  reason: collision with root package name */
        Object f124673d;

        /* renamed from: e  reason: collision with root package name */
        Object f124674e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f124675f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ E0 f124676g;

        /* renamed from: h  reason: collision with root package name */
        int f124677h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(E0 e02, C17164e<? super l> eVar) {
            super(eVar);
            this.f124676g = e02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f124675f = obj;
            this.f124677h |= Integer.MIN_VALUE;
            return this.f124676g.v2((Activity) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridViewModel$startPano$1", f = "HybridViewModel.kt", l = {325}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124678c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f124679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(E0 e02, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f124679d = e02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f124679d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124678c;
            if (i10 == 0) {
                y.b(obj);
                long millis = TimeUnit.SECONDS.toMillis((long) this.f124679d.j1());
                this.f124678c = 1;
                if (C16297b0.b(millis, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.d(AnyKt.SUGARCUBE_TAG, "points timeout reached");
            C13868b.f118106a.b("points timeout reached", YE.e.Capture);
            if (!this.f124679d.f124602p1) {
                this.f124679d.f124602p1 = true;
                this.f124679d.f124575T.postValue(kotlin.coroutines.jvm.internal.b.a(false));
            }
            return C16807N.f139792a;
        }
    }

    public E0(U u10, SceneRepository sceneRepository, q qVar, C13313e eVar, VideoAssetRepository videoAssetRepository, ConfigRepository configRepository, C13147a aVar, C13164r rVar, IUploaderV2 iUploaderV2, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase, UserRepo userRepo, FirebaseInteractions firebaseInteractions) {
        U u11 = u10;
        SceneRepository sceneRepository2 = sceneRepository;
        q qVar2 = qVar;
        C13313e eVar2 = eVar;
        VideoAssetRepository videoAssetRepository2 = videoAssetRepository;
        ConfigRepository configRepository2 = configRepository;
        C13147a aVar2 = aVar;
        C13164r rVar2 = rVar;
        IUploaderV2 iUploaderV22 = iUploaderV2;
        PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase2 = privacyPolicyConsentUseCase;
        UserRepo userRepo2 = userRepo;
        FirebaseInteractions firebaseInteractions2 = firebaseInteractions;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(sceneRepository2, "sceneRepository");
        C17542s.j(qVar2, "sugarcube");
        C17542s.j(eVar2, "installationConfig");
        C17542s.j(videoAssetRepository2, "assetRepository");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(aVar2, "files");
        C17542s.j(rVar2, "uploadVersion");
        C17542s.j(iUploaderV22, "uploaderV2");
        C17542s.j(privacyPolicyConsentUseCase2, "privacyPolicyConsentUseCase");
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(firebaseInteractions2, "firebaseInteractions");
        this.f124541C = u11;
        this.f124543D = sceneRepository2;
        this.f124545E = qVar2;
        this.f124547F = eVar2;
        this.f124549G = videoAssetRepository2;
        this.f124551H = configRepository2;
        this.f124553I = rVar2;
        this.f124555J = iUploaderV22;
        this.f124557K = privacyPolicyConsentUseCase2;
        this.f124559L = userRepo2;
        this.f124561M = firebaseInteractions2;
        K<C15083h> k10 = new K<>();
        this.f124563N = k10;
        this.f124565O = k10;
        K<Boolean> k11 = new K<>(Boolean.FALSE);
        this.f124567P = k11;
        this.f124569Q = k11;
        this.f124571R = C5210m.c(privacyPolicyConsentUseCase.getPrivacyPolicyState(), (C17168i) null, 0, 3, (Object) null);
        K<C16807N> k12 = new K<>();
        this.f124577U = k12;
        this.f124581X = k12;
        UUID uuid = (UUID) u11.f("captureUuid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            u11.m("captureUuid", uuid);
            C17542s.i(uuid, "also(...)");
        }
        this.f124583Y = uuid;
        this.f124585Z = Instant.now();
        RoomType roomType = RoomType.UNKNOWN;
        this.f124611y0 = roomType;
        this.f124613z0 = roomType.getApiKey();
        boolean isEnabledBlocking = configRepository2.isEnabledBlocking(FeatureFlags.HybridCampanoMode.INSTANCE);
        this.f124538A0 = isEnabledBlocking;
        this.f124540B0 = "HYBRID";
        this.f124542C0 = isEnabledBlocking ? "CAMPANO_ARSCAN_ARSTEP_ARSCAN" : "ARPANO_ARSCAN_ARSTEP_ARSCAN";
        this.f124544D0 = isEnabledBlocking ? "CAMPANO" : "ARPANO";
        this.f124546E0 = C17978n.m(((Integer) configRepository2.getBlocking(ConfigItems.JPEGPanoQuality.INSTANCE)).intValue(), 60, 100);
        this.f124548F0 = configRepository2.isEnabledBlocking(FeatureFlags.ShowPoints.INSTANCE);
        this.f124550G0 = configRepository2.isEnabledBlocking(FeatureFlags.ShowPlanes.INSTANCE);
        boolean isEnabledBlocking2 = configRepository2.isEnabledBlocking(FeatureFlags.CaptureArInitStepFlag.INSTANCE);
        this.f124552H0 = isEnabledBlocking2;
        boolean z10 = isEnabledBlocking2 || configRepository2.isEnabledBlocking(FeatureFlags.CaptureArInitFlag.INSTANCE);
        this.f124554I0 = z10;
        boolean z11 = z10 || configRepository2.isEnabledBlocking(FeatureFlags.CaptureUseAnchorsFlag.INSTANCE);
        this.f124556J0 = z11;
        this.f124558K0 = ((Integer) configRepository2.getBlocking(ConfigItems.CaptureFloorMinimum.INSTANCE)).intValue();
        this.f124560L0 = ((Integer) configRepository2.getBlocking(ConfigItems.CaptureFloorTimeoutLimit.INSTANCE)).intValue();
        File b10 = aVar2.b(uuid);
        this.f124562M0 = b10;
        this.f124564N0 = aVar2.e(uuid);
        this.f124566O0 = new File(b10, "rgb.mp4").getAbsolutePath();
        this.f124572R0 = new float[16];
        t d10 = new t.b().c(new C13286b()).d();
        this.f124578U0 = d10;
        C17542s.i(d10, "moshi");
        this.f124579V0 = new Z(firebaseInteractions2, d10, z11, z10);
        this.f124588b1 = new ArrayList();
        this.f124589c1 = System.nanoTime();
        this.f124591e1 = new ArrayList();
        this.f124592f1 = new ArrayList();
        this.f124593g1 = new ArrayList();
        this.f124594h1 = new ArrayList();
        this.f124595i1 = new ArrayList();
        this.f124596j1 = new ArrayList();
        this.f124597k1 = new ArrayList();
        this.f124598l1 = new float[9];
        ArrayList arrayList = new ArrayList(5);
        for (int i10 = 0; i10 < 5; i10++) {
            arrayList.add(Boolean.FALSE);
        }
        this.f124599m1 = arrayList;
        this.f124604r1 = new ArrayList();
        this.f124605s1 = new ArrayList();
        this.f124606t1 = 0.05f;
        String str = "capture-started " + this.f124583Y + " (" + this.f124540B0 + "," + this.f124542C0 + "," + this.f124544D0 + ")";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        this.f124612y1 = C14248a0.c(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        this.f124614z1 = C14248a0.c(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f124539A1 = C14248a0.c(new float[]{0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    private final void A1() {
        long currentTimeMillis = System.currentTimeMillis() - this.f124601o1;
        if (!this.f124603q1 && currentTimeMillis > ((long) this.f124558K0) * 1000) {
            if (this.f124579V0.G()) {
                this.f124603q1 = true;
                this.f124600n1 = false;
                this.f124575T.postValue(Boolean.TRUE);
                Log.d(AnyKt.SUGARCUBE_TAG, "floor anchor created");
                C13868b.f118106a.b("floor anchor created", YE.e.Capture);
            } else if (!this.f124602p1 && currentTimeMillis > ((long) this.f124560L0) * 1000) {
                this.f124602p1 = true;
                this.f124575T.postValue(Boolean.FALSE);
                Log.d(AnyKt.SUGARCUBE_TAG, "floor timeout reached");
                C13868b.f118106a.b("floor timeout reached", YE.e.Capture);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int A2(E0 e02, Session session, Frame frame, K0 k02) {
        C17542s.j(session, "session");
        C17542s.j(frame, "<unused var>");
        C17542s.j(k02, "<unused var>");
        return e02.f124579V0.e(session);
    }

    /* access modifiers changed from: private */
    public static final int C2(E0 e02, C14275o oVar, Session session, Frame frame, K0 k02) {
        C17542s.j(session, "session");
        C17542s.j(frame, "frame");
        C17542s.j(k02, "sensorData");
        int x10 = e02.f124579V0.x(session, frame, oVar != null ? oVar.C() : 1.0f);
        if (!e02.f124554I0 && !e02.f124602p1 && e02.f124579V0.s() > 0) {
            e02.f124602p1 = true;
            Log.d(AnyKt.SUGARCUBE_TAG, "found cloud points");
            C13868b.f118106a.b("found cloud points", YE.e.Capture);
            e02.f124575T.postValue(Boolean.TRUE);
        }
        return x10;
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
    public final java.lang.Object G1(com.sugarcube.app.base.data.model.QualityMeta r37, dI.C17164e<? super XH.v<java.lang.Boolean, java.lang.String>> r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r38
            boolean r2 = r1 instanceof com.sugarcube.app.base.ui.hybrid.E0.c
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.ui.hybrid.E0$c r2 = (com.sugarcube.app.base.ui.hybrid.E0.c) r2
            int r3 = r2.f124637l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f124637l = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.ui.hybrid.E0$c r2 = new com.sugarcube.app.base.ui.hybrid.E0$c
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f124635j
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f124637l
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
            long r4 = r2.f124634i
            int r1 = r2.f124632g
            java.lang.Object r8 = r2.f124631f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f124630e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r2.f124629d
            com.sugarcube.app.base.data.model.QualityMeta r9 = (com.sugarcube.app.base.data.model.QualityMeta) r9
            java.lang.Object r2 = r2.f124628c
            com.sugarcube.app.base.ui.hybrid.E0 r2 = (com.sugarcube.app.base.ui.hybrid.E0) r2
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
            float r1 = r2.f124633h
            int r5 = r2.f124632g
            java.lang.Object r9 = r2.f124631f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f124630e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r13 = r2.f124629d
            com.sugarcube.app.base.data.model.QualityMeta r13 = (com.sugarcube.app.base.data.model.QualityMeta) r13
            java.lang.Object r14 = r2.f124628c
            com.sugarcube.app.base.ui.hybrid.E0 r14 = (com.sugarcube.app.base.ui.hybrid.E0) r14
            XH.y.b(r3)
            goto L_0x01e9
        L_0x0073:
            float r1 = r2.f124633h
            int r5 = r2.f124632g
            java.lang.Object r10 = r2.f124631f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r13 = r2.f124630e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f124629d
            com.sugarcube.app.base.data.model.QualityMeta r14 = (com.sugarcube.app.base.data.model.QualityMeta) r14
            java.lang.Object r15 = r2.f124628c
            com.sugarcube.app.base.ui.hybrid.E0 r15 = (com.sugarcube.app.base.ui.hybrid.E0) r15
            XH.y.b(r3)
            goto L_0x0125
        L_0x008c:
            int r1 = r2.f124632g
            java.lang.Object r5 = r2.f124631f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r2.f124630e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f124629d
            com.sugarcube.app.base.data.model.QualityMeta r14 = (com.sugarcube.app.base.data.model.QualityMeta) r14
            java.lang.Object r15 = r2.f124628c
            com.sugarcube.app.base.ui.hybrid.E0 r15 = (com.sugarcube.app.base.ui.hybrid.E0) r15
            XH.y.b(r3)
            r35 = r5
            r5 = r1
            r1 = r13
            r13 = r14
            r14 = r35
            goto L_0x00c9
        L_0x00a9:
            XH.y.b(r3)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r0.f124551H
            com.sugarcube.app.base.data.feature.ConfigItems$CaptureQualityBadFramesThreshold r5 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureQualityBadFramesThreshold.INSTANCE
            r2.f124628c = r0
            r13 = r37
            r2.f124629d = r13
            r2.f124630e = r1
            java.lang.String r14 = "Save Failure "
            r2.f124631f = r14
            r2.f124632g = r12
            r2.f124637l = r12
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
            OE.q r11 = r15.f124545E
            com.sugarcube.app.base.data.analytics.Analytics r16 = r11.b()
            java.util.UUID r11 = r15.f124583Y
            java.lang.String r12 = r15.f124613z0
            com.sugarcube.app.base.capture.a$a r8 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r9 = r15.f124540B0
            com.sugarcube.app.base.capture.a r8 = r8.a(r9)
            java.lang.String r19 = r8.b()
            java.lang.String r8 = r15.f124542C0
            com.sugarcube.app.base.data.model.QualityWarnings r9 = r13.getWarnings()
            float r21 = r9.getBadFrames()
            r17 = r11
            r18 = r12
            r20 = r8
            r22 = r3
            r16.captureWarningBadFrames(r17, r18, r19, r20, r21, r22)
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r15.f124551H
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureQualityBadFramesFlag r9 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureQualityBadFramesFlag.INSTANCE
            r2.f124628c = r15
            r2.f124629d = r13
            r2.f124630e = r1
            r2.f124631f = r14
            r2.f124632g = r5
            r2.f124633h = r3
            r2.f124637l = r10
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
            float r8 = r14.f124606t1
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01aa
            OE.q r3 = r14.f124545E
            com.sugarcube.app.base.data.analytics.Analytics r24 = r3.b()
            java.util.UUID r3 = r14.f124583Y
            java.lang.String r8 = r14.f124613z0
            com.sugarcube.app.base.capture.a$a r11 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r12 = r14.f124540B0
            com.sugarcube.app.base.capture.a r11 = r11.a(r12)
            java.lang.String r27 = r11.b()
            java.lang.String r11 = r14.f124542C0
            com.sugarcube.app.base.data.model.AndroidQuality r12 = r13.getAndroid()
            float r29 = r12.getPrincipalPointRatioX()
            com.sugarcube.app.base.data.model.AndroidQuality r12 = r13.getAndroid()
            float r30 = r12.getPrincipalPointRatioY()
            float r12 = r14.f124606t1
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
            OE.q r3 = r14.f124545E
            com.sugarcube.app.base.data.analytics.Analytics r3 = r3.b()
            java.util.UUID r8 = r14.f124583Y
            java.lang.String r11 = r14.f124613z0
            com.sugarcube.app.base.capture.a$a r12 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r15 = r14.f124540B0
            com.sugarcube.app.base.capture.a r12 = r12.a(r15)
            java.lang.String r12 = r12.b()
            java.lang.String r15 = r14.f124542C0
            r3.captureWarningNoPoints(r8, r11, r12, r15)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r14.f124551H
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureFailNoPoints r8 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureFailNoPoints.INSTANCE
            r2.f124628c = r14
            r2.f124629d = r13
            r2.f124630e = r10
            r2.f124631f = r9
            r2.f124632g = r5
            r2.f124633h = r1
            r11 = 3
            r2.f124637l = r11
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
            com.sugarcube.app.base.data.feature.ConfigRepository r5 = r14.f124551H
            com.sugarcube.app.base.data.feature.ConfigItems$CaptureVideoLengthMax r9 = com.sugarcube.app.base.data.feature.ConfigItems.CaptureVideoLengthMax.INSTANCE
            java.lang.Object r5 = r5.getBlocking(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            long r11 = r5.longValue()
            r9 = r6
            double r5 = r14.f124587a1
            r16 = r3
            r15 = r4
            double r3 = (double) r11
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x029a
            OE.q r3 = r14.f124545E
            com.sugarcube.app.base.data.analytics.Analytics r23 = r3.b()
            java.util.UUID r3 = r14.f124583Y
            java.lang.String r4 = r14.f124613z0
            com.sugarcube.app.base.capture.a$a r5 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r6 = r14.f124540B0
            com.sugarcube.app.base.capture.a r5 = r5.a(r6)
            java.lang.String r26 = r5.b()
            java.lang.String r5 = r14.f124542C0
            r17 = r7
            double r6 = r14.f124587a1
            float r6 = (float) r6
            float r7 = (float) r11
            r24 = r3
            r25 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r23.captureWarningVideoLength(r24, r25, r26, r27, r28, r29)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r14.f124551H
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureVideoLengthFlag r4 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureVideoLengthFlag.INSTANCE
            r2.f124628c = r14
            r2.f124629d = r13
            r2.f124630e = r10
            r2.f124631f = r8
            r2.f124632g = r1
            r5 = r16
            r2.f124633h = r5
            r2.f124634i = r11
            r5 = 4
            r2.f124637l = r5
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
            double r1 = r2.f124587a1
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
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.E0.G1(com.sugarcube.app.base.data.model.QualityMeta, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void P1(Exception exc) {
        this.f124561M.recordException(exc);
    }

    /* access modifiers changed from: private */
    public final Object V1(UUID uuid, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), C16311i0.b(), (T) null, new f(this, uuid, (C17164e<? super f>) null), 2, (Object) null);
        return C16807N.f139792a;
    }

    public static /* synthetic */ void W0(E0 e02, Bitmap bitmap, long j10, K0 k02, float[] fArr, int i10, float f10, int i11, int i12, Object obj) {
        e02.V0(bitmap, j10, k02, (i12 & 8) != 0 ? null : fArr, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0.0f : f10, (i12 & 64) != 0 ? -1 : i11);
    }

    /* access modifiers changed from: private */
    public final void X0() {
        int i10 = 0;
        for (K0 k02 : this.f124591e1) {
            int i11 = i10 + 1;
            Z.d(this.f124579V0, this.f124594h1.size() > i10 ? this.f124594h1.get(i10) : null, this.f124598l1, k02.d(), k02, this.f124595i1.get(i10).intValue(), this.f124596j1.get(i10).floatValue(), (float[]) null, 64, (Object) null);
            i10 = i11;
        }
    }

    private final QualityMeta Y0() {
        Z z10 = this.f124579V0;
        float[] q12 = C16877v.q1(C16870n.P0(new float[]{z10.l()[2], z10.l()[5]}));
        Dimension dimension = f124537E1;
        int[] s12 = C16877v.s1(C16870n.Q0(new int[]{dimension.getWidth() / 2, dimension.getHeight() / 2}));
        float f10 = q12[0];
        int i10 = s12[0];
        this.f124609w1 = Math.abs((f10 - ((float) i10)) / ((float) i10));
        float f11 = q12[1];
        int i11 = s12[1];
        this.f124610x1 = Math.abs((f11 - ((float) i11)) / ((float) i11));
        int h10 = z10.h();
        String arrays = Arrays.toString(z10.v());
        C17542s.i(arrays, "toString(...)");
        int k10 = z10.k();
        int u10 = z10.u();
        int q10 = z10.q();
        String arrays2 = Arrays.toString(z10.t());
        C17542s.i(arrays2, "toString(...)");
        int r10 = z10.r();
        int s10 = z10.s();
        String arrays3 = Arrays.toString(q12);
        C17542s.i(arrays3, "toString(...)");
        String arrays4 = Arrays.toString(s12);
        C17542s.i(arrays4, "toString(...)");
        String str = "\n            stats - " + h10 + " frames\n            " + arrays + "\n            framesWithNoPoints - " + k10 + " (" + u10 + ")\n            pano stats - " + q10 + " frames\n            " + arrays2 + "\n            panoFramesWithNoPoints - " + r10 + " (" + s10 + ")\n            principalPoint - " + arrays3 + "\n            center - " + arrays4 + "\n            principalRatioX - " + this.f124609w1 + "\n            principalRatioY - " + this.f124610x1 + "\n        ";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        int T02 = C16870n.T0(z10.v());
        float f12 = 0.0f;
        float[] fArr = {T02 > 0 ? ((float) z10.v()[0]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[1]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[2]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[3]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[4]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[5]) / ((float) T02) : 0.0f, T02 > 0 ? ((float) z10.v()[6]) / ((float) T02) : 0.0f};
        AndroidQuality androidQuality = new AndroidQuality(fArr, (int[]) z10.v().clone(), Integer.valueOf(z10.h()), z10.j(), z10.k(), z10.p(), z10.u(), this.f124609w1, this.f124610x1, (int[]) z10.t().clone(), z10.q(), z10.r(), z10.s(), this.f124607u1, this.f124608v1, z10.w(), z10.F(), this.f124554I0, z10.G(), 0.0f, 0.0f, 0.0f, 0, 0, 16252928, (DefaultConstructorMarker) null);
        float f13 = T02 > 0 ? ((float) (T02 - z10.v()[1])) / ((float) T02) : 0.0f;
        float f14 = fArr[3];
        float f15 = fArr[5];
        float max = Math.max(this.f124609w1, this.f124610x1);
        if (T02 > 0) {
            f12 = ((float) z10.j()) / ((float) T02);
        }
        return new QualityMeta(new QualityWarnings(f13, f14, f15, max, f12), androidQuality, this.f124554I0 ? new FloorDetection(this.f124560L0, z10.i(), z10.G(), z10.F()) : null);
    }

    private final Object a1(Context context, QualityMeta qualityMeta, C17164e<? super v<Boolean, String>> eVar) {
        return C16310i.g(C16311i0.b(), new b(this, context, qualityMeta, (C17164e<? super b>) null), eVar);
    }

    private final void d2(String str) {
        this.f124563N.postValue(new C15083h.c("exit_error", new C15091p(Integer.valueOf(n.f113498z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113492y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new z0(this), (C15091p) null, (C17631a) null, new A0(this, str), 96, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(E0 e02) {
        K<C16807N> k10 = e02.f124577U;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        e02.f124570Q0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N f2(E0 e02, String str) {
        K<C16807N> k10 = e02.f124577U;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        e02.f124570Q0 = false;
        e02.f124545E.b().captureErrorDialogExit(e02.f124583Y, e02.f124613z0, com.sugarcube.app.base.capture.a.Companion.a(e02.f124540B0).b(), e02.f124542C0, str);
        return n10;
    }

    private final void g2(C17631a<C16807N> aVar) {
        this.f124563N.postValue(new C15083h.c("exit_confirmation", new C15091p(Integer.valueOf(n.f113186D0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113180C0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113358f), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new w0(), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new x0(aVar, this), new y0(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N h2() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i2(C17631a aVar, E0 e02) {
        aVar.invoke();
        K<C16807N> k10 = e02.f124577U;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        e02.f124570Q0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N j2(E0 e02) {
        e02.f124563N.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    private final void k2() {
        this.f124563N.postValue(new C15083h.c("exit_interruption", new C15091p(Integer.valueOf(n.f113174B0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113168A0), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C15091p(Integer.valueOf(n.f113449s), (List) null, (String) null, 6, (DefaultConstructorMarker) null), new C14272m0(this), (C15091p) null, (C17631a) null, new v0(this), 96, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(E0 e02) {
        K<C16807N> k10 = e02.f124577U;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        e02.f124570Q0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(E0 e02) {
        K<C16807N> k10 = e02.f124577U;
        C16807N n10 = C16807N.f139792a;
        k10.postValue(n10);
        e02.f124570Q0 = false;
        return n10;
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(E0 e02) {
        e02.f124573S.setValue(e02.f124557K.generatePrivacyPolicyLink());
        F0 unused = C16314k.d(g0.a(e02), (C17168i) null, (T) null, new g(e02, (C17164e<? super g>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p2(E0 e02, C4899r0 r0Var) {
        F0 unused = C16314k.d(g0.a(e02), (C17168i) null, (T) null, new h(r0Var, e02, (C17164e<? super h>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(E0 e02) {
        F0 unused = C16314k.d(g0.a(e02), (C17168i) null, (T) null, new i(e02, (C17164e<? super i>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(E0 e02) {
        e02.f124563N.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s2(E0 e02, boolean z10) {
        F0 unused = C16314k.d(g0.a(e02), (C17168i) null, (T) null, new j(e02, z10, (C17164e<? super j>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t2(E0 e02) {
        F0 unused = C16314k.d(g0.a(e02), (C17168i) null, (T) null, new k(e02, (C17164e<? super k>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u2() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int w2(E0 e02, Session session, Frame frame, K0 k02) {
        C17542s.j(session, "session");
        C17542s.j(frame, "frame");
        C17542s.j(k02, "sensorData");
        nI.q<? super Session, ? super Frame, ? super K0, Integer> qVar = e02.f124580W0;
        if (qVar != null) {
            qVar.invoke(session, frame, k02).intValue();
        }
        if (e02.f124582X0) {
            return Z.c(e02.f124579V0, session, frame, k02, (float[]) null, 8, (Object) null);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int y2(E0 e02, nI.q qVar, Session session, Frame frame, K0 k02) {
        C17542s.j(session, "session");
        C17542s.j(frame, "frame");
        C17542s.j(k02, "sensorData");
        if (e02.f124600n1) {
            e02.A1();
        }
        if (qVar != null) {
            Integer num = (Integer) qVar.invoke(session, frame, k02);
        }
        return e02.f124579V0.h();
    }

    public final boolean B1(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "negAnalytics");
        g2(aVar);
        return true;
    }

    public final void B2(C14275o oVar) {
        Log.d(AnyKt.SUGARCUBE_TAG, "start Pano");
        C13868b.f118106a.b("start Pano", YE.e.Capture);
        C0 c02 = new C0(this, oVar);
        if (this.f124554I0) {
            x2(c02);
            return;
        }
        this.f124602p1 = false;
        this.f124580W0 = c02;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new m(this, (C17164e<? super m>) null), 3, (Object) null);
    }

    public final void C1(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "negAnalytics");
        g2(aVar);
    }

    public final void D1(String str) {
        C17542s.j(str, "reason");
        this.f124545E.b().captureErrorDialogShow(this.f124583Y, this.f124613z0, com.sugarcube.app.base.capture.a.Companion.a(this.f124540B0).b(), this.f124542C0, str);
        d2(str);
    }

    public final void D2(Activity activity) {
        C17542s.j(activity, "activity");
        if (activity instanceof HybridActivity) {
            this.f124582X0 = true;
            C14275o H02 = ((HybridActivity) activity).H0();
            int h10 = this.f124579V0.h();
            Log.d(AnyKt.SUGARCUBE_TAG, "startRecording count=" + h10);
            String str = this.f124566O0;
            C17542s.i(str, "recordingPath");
            H02.S(str);
            Q1();
        }
    }

    public final void E1() {
        if (this.f124570Q0) {
            this.f124545E.b().captureWarningForcedInterruption(this.f124583Y, this.f124613z0, com.sugarcube.app.base.capture.a.Companion.a(this.f124540B0).b(), this.f124542C0);
            k2();
        }
    }

    public final void E2(Activity activity) {
        C17542s.j(activity, "activity");
        if (activity instanceof HybridActivity) {
            ((HybridActivity) activity).H0().T();
        }
        this.f124570Q0 = false;
    }

    public final boolean F1() {
        float[] fArr = this.f124598l1;
        float[] q12 = C16877v.q1(C16870n.P0(new float[]{fArr[2], fArr[5]}));
        Bitmap bitmap = this.f124576T0;
        int width = (bitmap != null ? bitmap.getWidth() : 0) / 2;
        Bitmap bitmap2 = this.f124576T0;
        int[] s12 = C16877v.s1(C16870n.Q0(new int[]{width, (bitmap2 != null ? bitmap2.getHeight() : 0) / 2}));
        float f10 = q12[0];
        int i10 = s12[0];
        this.f124607u1 = Math.abs((f10 - ((float) i10)) / ((float) i10));
        float f11 = q12[1];
        int i11 = s12[1];
        this.f124608v1 = Math.abs((f11 - ((float) i11)) / ((float) i11));
        Z z10 = this.f124579V0;
        int q10 = z10.q();
        String arrays = Arrays.toString(z10.t());
        C17542s.i(arrays, "toString(...)");
        int r10 = z10.r();
        int s10 = z10.s();
        String arrays2 = Arrays.toString(q12);
        C17542s.i(arrays2, "toString(...)");
        String arrays3 = Arrays.toString(s12);
        C17542s.i(arrays3, "toString(...)");
        String str = "\n                pano stats - " + q10 + " frames\n                " + arrays + "\n                panoFramesWithNoPoints - " + r10 + " (" + s10 + ")\n                panoPrincipalPoint - " + arrays2 + "\n                panoCenter - " + arrays3 + "\n                panoPrincipalRatioX - " + this.f124607u1 + "\n                panoPrincipalRatioY - " + this.f124608v1 + "\n            ";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        float f12 = this.f124607u1;
        float f13 = this.f124606t1;
        if (f12 > f13 || this.f124608v1 > f13) {
            this.f124545E.b().captureWarningPrincipalPoint(this.f124583Y, this.f124613z0, com.sugarcube.app.base.capture.a.Companion.a(this.f124540B0).b(), this.f124542C0, this.f124607u1, this.f124608v1, this.f124606t1, true);
        }
        return true;
    }

    public final void F2() {
        boolean z10 = this.f124600n1;
        Log.d(AnyKt.SUGARCUBE_TAG, "stop ArInit (" + z10 + ")");
        C13868b bVar = C13868b.f118106a;
        boolean z11 = this.f124600n1;
        bVar.b("stop ArInit (" + z11 + ")", YE.e.Capture);
        this.f124580W0 = null;
        this.f124600n1 = false;
        this.f124575T.postValue(null);
    }

    public final void G2() {
        F2();
    }

    public final void H2() {
        Log.d(AnyKt.SUGARCUBE_TAG, "stop Pano");
        C13868b.f118106a.b("stop Pano", YE.e.Capture);
        if (this.f124554I0) {
            F2();
        } else {
            this.f124580W0 = null;
        }
    }

    public final boolean I1() {
        return this.f124568P0;
    }

    public final void I2(Activity activity) {
        C17542s.j(activity, "activity");
        if (activity instanceof HybridActivity) {
            ((HybridActivity) activity).H0().U();
            R1();
        }
    }

    public final float J1() {
        return this.f124579V0.m();
    }

    public final float[] L1() {
        return (float[]) this.f124579V0.l().clone();
    }

    public final float[] M1() {
        return (float[]) this.f124579V0.n().clone();
    }

    public final int N1() {
        return this.f124579V0.o();
    }

    public final void O1() {
        this.f124573S.setValue(null);
    }

    public final void Q1() {
        this.f124584Y0 = this.f124579V0.h();
        this.f124589c1 = System.nanoTime();
    }

    public final void R1() {
        this.f124586Z0 = this.f124579V0.h() - 1;
        this.f124587a1 = ((double) (System.nanoTime() - this.f124589c1)) / 1.0E9d;
    }

    public final void S1() {
        this.f124579V0.y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        if (r3 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r7.E2(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        r4 = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
        r15.f124638c = r7;
        r15.f124639d = r3;
        r15.f124640e = r1;
        r15.f124653r = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e8, code lost:
        if (QJ.C16297b0.b(r4, r15) != r14) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ec, code lost:
        r7 = java.lang.System.currentTimeMillis();
        r2 = r4.Y0();
        r15.f124638c = r4;
        r15.f124639d = r3;
        r15.f124640e = r1;
        r15.f124641f = r2;
        r15.f124646k = r7;
        r15.f124653r = 3;
        r5 = r4.G1(r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0105, code lost:
        if (r5 != r14) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0108, code lost:
        r27 = r5;
        r5 = r1;
        r1 = r2;
        r2 = r27;
        r28 = r7;
        r7 = r3;
        r8 = r4;
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0114, code lost:
        r9 = (XH.v) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0121, code lost:
        if (((java.lang.Boolean) r9.c()).booleanValue() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        if (r7 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0125, code lost:
        r15.f124638c = r8;
        r15.f124639d = r7;
        r15.f124640e = r5;
        r15.f124641f = r1;
        r15.f124642g = r2;
        r15.f124643h = r9;
        r15.f124644i = r7;
        r15.f124645j = r7;
        r15.f124646k = r3;
        r15.f124648m = 0;
        r15.f124649n = 0;
        r15.f124653r = 4;
        r2 = r8.a1(r7, r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (r2 != r14) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0144, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0145, code lost:
        r9 = (XH.v) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0148, code lost:
        if (r9 != null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014b, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014d, code lost:
        r9 = new XH.v(kotlin.coroutines.jvm.internal.b.a(false), "Save Failure [activity=null]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0159, code lost:
        r12 = java.lang.System.currentTimeMillis() - r3;
        r11 = ((java.lang.Boolean) r9.c()).booleanValue();
        r10 = r9.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0170, code lost:
        if (r11 == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x017a, code lost:
        if (r2.f124553I.b() == false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017c, code lost:
        r6 = r2.f124555J;
        r0 = r2.f124583Y;
        r16 = r14;
        r31 = r2.f124611y0;
        r32 = r2.f124613z0;
        r14 = r2.f124585Z;
        kotlin.jvm.internal.C17542s.i(r14, "creation");
        r17 = YH.C16877v.t1(r2.f124605s1);
        r18 = YH.C16877v.t1(r2.f124604r1);
        r19 = r2.f124540B0;
        r8 = r2.f124542C0;
        r15.f124638c = r2;
        r15.f124639d = r7;
        r15.f124640e = r5;
        r15.f124641f = r1;
        r15.f124642g = r9;
        r15.f124643h = r10;
        r15.f124644i = r14;
        r15.f124646k = r3;
        r15.f124647l = r12;
        r15.f124650o = r11;
        r15.f124653r = 5;
        r20 = r10;
        r1 = r11;
        r21 = r12;
        r0 = r6.addUpload(r0, r31, r32, r14, r17, r18, true, r19, r8, r15);
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01dc, code lost:
        if (r0 != r14) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01de, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01df, code lost:
        r6 = r2;
        r5 = r20;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e4, code lost:
        r14 = r3;
        r10 = r5;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e9, code lost:
        r20 = r10;
        r0 = r11;
        r21 = r12;
        r6 = r2.f124543D;
        r10 = r2.f124583Y;
        r11 = r2.f124611y0;
        r12 = r2.f124613z0;
        r13 = r2.f124585Z;
        kotlin.jvm.internal.C17542s.i(r13, "creation");
        r8 = YH.C16877v.t1(r2.f124605s1);
        r16 = r14;
        r31 = YH.C16877v.t1(r2.f124604r1);
        r17 = r2.f124540B0;
        r18 = r2.f124542C0;
        r14 = r2.f124553I.b();
        r15.f124638c = r2;
        r15.f124639d = r7;
        r15.f124640e = r5;
        r15.f124641f = r1;
        r15.f124642g = r9;
        r1 = r20;
        r15.f124643h = r1;
        r15.f124644i = r13;
        r15.f124646k = r3;
        r15.f124647l = r21;
        r15.f124650o = r0;
        r15.f124653r = 6;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0253, code lost:
        if (r6.addCapture(r10, r11, r12, r13, r8, r31, true, r17, r18, (java.lang.String) null, r14, r15) != r4) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0255, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0256, code lost:
        r5 = r1;
        r6 = r2;
        r3 = r21;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x025c, code lost:
        r1 = r10;
        r0 = r11;
        r21 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0260, code lost:
        if (r1 != null) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0262, code lost:
        r10 = "none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0265, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0266, code lost:
        r2.D1(r10);
        r10 = r1;
        r14 = r21;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x026d, code lost:
        r3 = r2.f124545E.b();
        r4 = r2.f124583Y;
        r5 = r2.f124613z0;
        r6 = com.sugarcube.app.base.capture.a.Companion.a(r2.f124540B0).b();
        r7 = r2.f124542C0;
        r3.captureResult(r4, r5, r6, r7, 0, r1, r10, r14 + "ms", r2.f124556J0, kotlin.coroutines.jvm.internal.b.a(r2.f124579V0.F()), r2.f124554I0, kotlin.coroutines.jvm.internal.b.a(r2.f124579V0.G()));
        android.util.Log.d(com.sugarcube.core.logger.AnyKt.SUGARCUBE_TAG, "Capture save - result=" + r1 + " " + r14 + "ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02e6, code lost:
        return kotlin.coroutines.jvm.internal.b.a(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T1(android.app.Activity r31, dI.C17164e<? super java.lang.Boolean> r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            boolean r2 = r1 instanceof com.sugarcube.app.base.ui.hybrid.E0.d
            if (r2 == 0) goto L_0x0018
            r2 = r1
            com.sugarcube.app.base.ui.hybrid.E0$d r2 = (com.sugarcube.app.base.ui.hybrid.E0.d) r2
            int r3 = r2.f124653r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f124653r = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.ui.hybrid.E0$d r2 = new com.sugarcube.app.base.ui.hybrid.E0$d
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.f124651p
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.f124653r
            r4 = 1
            r6 = 0
            switch(r3) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00a3;
                case 2: goto L_0x0093;
                case 3: goto L_0x007c;
                case 4: goto L_0x0059;
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
            boolean r1 = r15.f124650o
            long r3 = r15.f124647l
            java.lang.Object r5 = r15.f124644i
            java.time.Instant r5 = (java.time.Instant) r5
            java.lang.Object r5 = r15.f124643h
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r15.f124642g
            XH.v r6 = (XH.v) r6
            java.lang.Object r6 = r15.f124641f
            com.sugarcube.app.base.data.model.QualityMeta r6 = (com.sugarcube.app.base.data.model.QualityMeta) r6
            java.lang.Object r6 = r15.f124640e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r15.f124639d
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r6 = r15.f124638c
            com.sugarcube.app.base.ui.hybrid.E0 r6 = (com.sugarcube.app.base.ui.hybrid.E0) r6
            XH.y.b(r2)
            goto L_0x01e4
        L_0x0059:
            long r3 = r15.f124646k
            java.lang.Object r1 = r15.f124645j
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = r15.f124644i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = r15.f124643h
            XH.v r1 = (XH.v) r1
            java.lang.Object r1 = r15.f124641f
            com.sugarcube.app.base.data.model.QualityMeta r1 = (com.sugarcube.app.base.data.model.QualityMeta) r1
            java.lang.Object r5 = r15.f124640e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r7 = r15.f124639d
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r8 = r15.f124638c
            com.sugarcube.app.base.ui.hybrid.E0 r8 = (com.sugarcube.app.base.ui.hybrid.E0) r8
            XH.y.b(r2)
            goto L_0x0145
        L_0x007c:
            long r3 = r15.f124646k
            java.lang.Object r1 = r15.f124641f
            com.sugarcube.app.base.data.model.QualityMeta r1 = (com.sugarcube.app.base.data.model.QualityMeta) r1
            java.lang.Object r5 = r15.f124640e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r7 = r15.f124639d
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r8 = r15.f124638c
            com.sugarcube.app.base.ui.hybrid.E0 r8 = (com.sugarcube.app.base.ui.hybrid.E0) r8
            XH.y.b(r2)
            goto L_0x0114
        L_0x0093:
            java.lang.Object r1 = r15.f124640e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r15.f124639d
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r15.f124638c
            com.sugarcube.app.base.ui.hybrid.E0 r4 = (com.sugarcube.app.base.ui.hybrid.E0) r4
            XH.y.b(r2)
            goto L_0x00ec
        L_0x00a3:
            java.lang.Object r1 = r15.f124640e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r15.f124639d
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r7 = r15.f124638c
            com.sugarcube.app.base.ui.hybrid.E0 r7 = (com.sugarcube.app.base.ui.hybrid.E0) r7
            XH.y.b(r2)
            goto L_0x00d0
        L_0x00b3:
            XH.y.b(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r2.toMillis(r4)
            r15.f124638c = r0
            r7 = r31
            r15.f124639d = r7
            r15.f124640e = r1
            r8 = 1
            r15.f124653r = r8
            java.lang.Object r2 = QJ.C16297b0.b(r2, r15)
            if (r2 != r14) goto L_0x00ce
            return r14
        L_0x00ce:
            r3 = r7
            r7 = r0
        L_0x00d0:
            if (r3 == 0) goto L_0x00d5
            r7.E2(r3)
        L_0x00d5:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r2.toMillis(r4)
            r15.f124638c = r7
            r15.f124639d = r3
            r15.f124640e = r1
            r2 = 2
            r15.f124653r = r2
            java.lang.Object r2 = QJ.C16297b0.b(r4, r15)
            if (r2 != r14) goto L_0x00eb
            return r14
        L_0x00eb:
            r4 = r7
        L_0x00ec:
            long r7 = java.lang.System.currentTimeMillis()
            com.sugarcube.app.base.data.model.QualityMeta r2 = r4.Y0()
            r15.f124638c = r4
            r15.f124639d = r3
            r15.f124640e = r1
            r15.f124641f = r2
            r15.f124646k = r7
            r5 = 3
            r15.f124653r = r5
            java.lang.Object r5 = r4.G1(r2, r15)
            if (r5 != r14) goto L_0x0108
            return r14
        L_0x0108:
            r27 = r5
            r5 = r1
            r1 = r2
            r2 = r27
            r28 = r7
            r7 = r3
            r8 = r4
            r3 = r28
        L_0x0114:
            r9 = r2
            XH.v r9 = (XH.v) r9
            java.lang.Object r10 = r9.c()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x014b
            if (r7 == 0) goto L_0x014d
            r15.f124638c = r8
            r15.f124639d = r7
            r15.f124640e = r5
            r15.f124641f = r1
            r15.f124642g = r2
            r15.f124643h = r9
            r15.f124644i = r7
            r15.f124645j = r7
            r15.f124646k = r3
            r15.f124648m = r6
            r15.f124649n = r6
            r2 = 4
            r15.f124653r = r2
            java.lang.Object r2 = r8.a1(r7, r1, r15)
            if (r2 != r14) goto L_0x0145
            return r14
        L_0x0145:
            r9 = r2
            XH.v r9 = (XH.v) r9
            if (r9 != 0) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r2 = r8
            goto L_0x0159
        L_0x014d:
            XH.v r9 = new XH.v
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r6)
            java.lang.String r6 = "Save Failure [activity=null]"
            r9.<init>(r2, r6)
            goto L_0x014b
        L_0x0159:
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r10 - r3
            java.lang.Object r6 = r9.c()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r11 = r6.booleanValue()
            java.lang.Object r6 = r9.d()
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            if (r11 == 0) goto L_0x025c
            KF.r r6 = r2.f124553I
            boolean r6 = r6.b()
            java.lang.String r8 = "creation"
            if (r6 == 0) goto L_0x01e9
            com.sugarcube.app.base.upload.IUploaderV2 r6 = r2.f124555J
            java.util.UUID r0 = r2.f124583Y
            r16 = r14
            com.sugarcube.core.network.models.RoomType r14 = r2.f124611y0
            r31 = r14
            java.lang.String r14 = r2.f124613z0
            r32 = r14
            java.time.Instant r14 = r2.f124585Z
            kotlin.jvm.internal.C17542s.i(r14, r8)
            java.util.List<com.sugarcube.app.base.data.database.Media> r8 = r2.f124605s1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = YH.C16877v.t1(r8)
            r17 = r8
            java.util.List<com.sugarcube.app.base.data.database.Metadata> r8 = r2.f124604r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r18 = YH.C16877v.t1(r8)
            java.lang.String r8 = r2.f124540B0
            r19 = r8
            java.lang.String r8 = r2.f124542C0
            r15.f124638c = r2
            r15.f124639d = r7
            r15.f124640e = r5
            r15.f124641f = r1
            r15.f124642g = r9
            r15.f124643h = r10
            r15.f124644i = r14
            r15.f124646k = r3
            r15.f124647l = r12
            r15.f124650o = r11
            r1 = 5
            r15.f124653r = r1
            r1 = 1
            r3 = r6
            r4 = r0
            r5 = r31
            r6 = r32
            r7 = r14
            r14 = r8
            r0 = r19
            r8 = r17
            r9 = r18
            r20 = r10
            r10 = r1
            r1 = r11
            r11 = r0
            r21 = r12
            r12 = r14
            r13 = r15
            java.lang.Object r0 = r3.addUpload(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14 = r16
            if (r0 != r14) goto L_0x01df
            return r14
        L_0x01df:
            r6 = r2
            r5 = r20
            r3 = r21
        L_0x01e4:
            r14 = r3
            r10 = r5
            r2 = r6
            goto L_0x026d
        L_0x01e9:
            r20 = r10
            r0 = r11
            r21 = r12
            com.sugarcube.app.base.data.SceneRepository r6 = r2.f124543D
            java.util.UUID r10 = r2.f124583Y
            com.sugarcube.core.network.models.RoomType r11 = r2.f124611y0
            java.lang.String r12 = r2.f124613z0
            java.time.Instant r13 = r2.f124585Z
            kotlin.jvm.internal.C17542s.i(r13, r8)
            java.util.List<com.sugarcube.app.base.data.database.Media> r8 = r2.f124605s1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = YH.C16877v.t1(r8)
            r16 = r14
            java.util.List<com.sugarcube.app.base.data.database.Metadata> r14 = r2.f124604r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = YH.C16877v.t1(r14)
            r31 = r14
            java.lang.String r14 = r2.f124540B0
            r17 = r14
            java.lang.String r14 = r2.f124542C0
            r18 = r14
            KF.r r14 = r2.f124553I
            boolean r14 = r14.b()
            r15.f124638c = r2
            r15.f124639d = r7
            r15.f124640e = r5
            r15.f124641f = r1
            r15.f124642g = r9
            r1 = r20
            r15.f124643h = r1
            r15.f124644i = r13
            r15.f124646k = r3
            r4 = r21
            r15.f124647l = r4
            r15.f124650o = r0
            r3 = 6
            r15.f124653r = r3
            r19 = 1
            r20 = 0
            r3 = r6
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r31
            r10 = r19
            r11 = r17
            r12 = r18
            r13 = r20
            r23 = r16
            java.lang.Object r3 = r3.addCapture(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r23
            if (r3 != r4) goto L_0x0256
            return r4
        L_0x0256:
            r5 = r1
            r6 = r2
            r3 = r21
            r1 = r0
            goto L_0x01e4
        L_0x025c:
            r1 = r10
            r0 = r11
            r21 = r12
            if (r1 != 0) goto L_0x0265
            java.lang.String r10 = "none"
            goto L_0x0266
        L_0x0265:
            r10 = r1
        L_0x0266:
            r2.D1(r10)
            r10 = r1
            r14 = r21
            r1 = r0
        L_0x026d:
            OE.q r0 = r2.f124545E
            com.sugarcube.app.base.data.analytics.Analytics r3 = r0.b()
            java.util.UUID r4 = r2.f124583Y
            java.lang.String r5 = r2.f124613z0
            com.sugarcube.app.base.capture.a$a r0 = com.sugarcube.app.base.capture.a.Companion
            java.lang.String r6 = r2.f124540B0
            com.sugarcube.app.base.capture.a r0 = r0.a(r6)
            java.lang.String r6 = r0.b()
            java.lang.String r7 = r2.f124542C0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r13 = "ms"
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            boolean r12 = r2.f124556J0
            com.sugarcube.app.base.ui.hybrid.Z r0 = r2.f124579V0
            boolean r0 = r0.F()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            boolean r9 = r2.f124554I0
            com.sugarcube.app.base.ui.hybrid.Z r2 = r2.f124579V0
            boolean r2 = r2.G()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
            r8 = 0
            r16 = r9
            r9 = r1
            r24 = r13
            r13 = r0
            r25 = r14
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
            r3 = r25
            r0.append(r3)
            r2 = r24
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Sugarcube"
            android.util.Log.d(r2, r0)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.E0.T1(android.app.Activity, dI.e):java.lang.Object");
    }

    public final Object U1(C17164e<? super v<Boolean, String>> eVar) {
        return C16310i.g(C16311i0.b(), new e(this, (C17164e<? super e>) null), eVar);
    }

    public final synchronized void V0(Bitmap bitmap, long j10, K0 k02, float[] fArr, int i10, float f10, int i11) {
        Bitmap bitmap2 = bitmap;
        K0 k03 = k02;
        float[] fArr2 = fArr;
        synchronized (this) {
            try {
                C17542s.j(bitmap, "bitmap");
                C17542s.j(k03, "sensorData");
                int size = this.f124591e1.size();
                int size2 = this.f124593g1.size();
                int size3 = this.f124592f1.size();
                int size4 = this.f124595i1.size();
                int size5 = this.f124596j1.size();
                int size6 = this.f124597k1.size();
                Log.d(AnyKt.SUGARCUBE_TAG, "addPano[" + size + "," + size2 + "," + size3 + "," + size4 + "," + size5 + "," + size6 + "]");
                this.f124591e1.add(k03);
                this.f124593g1.add(Long.valueOf(j10));
                this.f124592f1.add(bitmap);
                if (fArr2 != null) {
                    this.f124594h1.add(fArr2);
                }
                this.f124595i1.add(Integer.valueOf(i10));
                this.f124596j1.add(Float.valueOf(f10));
                this.f124597k1.add(Integer.valueOf(i11));
                if (this.f124592f1.size() == 5) {
                    this.f124574S0 = C13341c.d(this.f124592f1, 1000, (Integer) null, 2);
                    List<Bitmap> list = this.f124592f1;
                    this.f124576T0 = list.get(list.size() / 2);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final void W1(Activity activity, nI.q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N> qVar) {
        C17542s.j(activity, "activity");
        if (activity instanceof HybridActivity) {
            ((HybridActivity) activity).H0().J(qVar);
        }
    }

    public final void X1(String str) {
        C17542s.j(str, "state");
        this.f124579V0.D(str);
    }

    public final void Y1(float[] fArr) {
        C17542s.j(fArr, "intrinsics");
        this.f124598l1 = fArr;
    }

    public final void Z0(float[] fArr) {
        C17542s.j(fArr, "angles");
        this.f124579V0.f(fArr);
    }

    public final void Z1(K0 k02) {
        C17542s.j(k02, "sensorData");
        this.f124590d1 = k02;
        this.f124572R0 = k02.c();
        this.f124591e1 = new ArrayList();
        this.f124592f1 = new ArrayList();
        this.f124593g1 = new ArrayList();
        this.f124594h1 = new ArrayList();
        this.f124595i1 = new ArrayList();
        this.f124596j1 = new ArrayList();
        this.f124597k1 = new ArrayList();
        this.f124604r1 = new ArrayList();
        this.f124605s1 = new ArrayList();
    }

    public final void a2() {
        this.f124567P.postValue(Boolean.FALSE);
    }

    public final F<Boolean> b1() {
        return this.f124575T;
    }

    public final void b2(RoomType roomType, String str) {
        C17542s.j(roomType, "roomType");
        C17542s.j(str, "roomTitle");
        this.f124611y0 = roomType;
        this.f124613z0 = str;
    }

    public final File c1() {
        return this.f124562M0;
    }

    public final void c2(boolean z10) {
        this.f124568P0 = z10;
    }

    public final String d1() {
        return this.f124542C0;
    }

    public final String e1() {
        return this.f124540B0;
    }

    public final Instant f1() {
        return this.f124585Z;
    }

    public final boolean g1() {
        return this.f124550G0;
    }

    public final boolean h1() {
        return this.f124548F0;
    }

    public final F<C16807N> i1() {
        return this.f124581X;
    }

    public final int j1() {
        return this.f124560L0;
    }

    public final String k1() {
        return this.f124544D0;
    }

    public final int l1() {
        return this.f124546E0;
    }

    public final float[] m1() {
        return this.f124572R0;
    }

    public final Bitmap n1() {
        return this.f124576T0;
    }

    public final void n2() {
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        C4899r0 r0Var = j10;
        K<C15083h> k10 = this.f124563N;
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
        D0 d02 = r5;
        D0 d03 = new D0(this);
        C14274n0 n0Var = r5;
        C14274n0 n0Var2 = new C14274n0(this, j10);
        o0 o0Var = r1;
        o0 o0Var2 = new o0(this);
        p0 p0Var = r1;
        p0 p0Var2 = new p0(this);
        q0 q0Var = r1;
        q0 q0Var2 = new q0(this);
        r0 r0Var2 = r1;
        r0 r0Var3 = new r0(this);
        s0 s0Var = r1;
        s0 s0Var2 = new s0();
        k10.postValue(new C15083h.b("privacy_disclaimer", pVar, pVar3, pVar5, d02, pVar7, n0Var, pVar9, o0Var, p0Var, pVar11, pVar13, false, q0Var, r0Var2, s0Var, r0Var, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (DefaultConstructorMarker) null));
    }

    public final Bitmap o1() {
        return this.f124574S0;
    }

    public final F<Boolean> p1() {
        return this.f124569Q;
    }

    public final F<Uri> q1() {
        return this.f124573S;
    }

    public final String r1() {
        return this.f124613z0;
    }

    public final RoomType s1() {
        return this.f124611y0;
    }

    public final File t1() {
        return this.f124564N0;
    }

    public final boolean u1() {
        return this.f124552H0;
    }

    public final F<C15083h> v1() {
        return this.f124565O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v2(android.app.Activity r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.ui.hybrid.E0.l
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.ui.hybrid.E0$l r0 = (com.sugarcube.app.base.ui.hybrid.E0.l) r0
            int r1 = r0.f124677h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f124677h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.ui.hybrid.E0$l r0 = new com.sugarcube.app.base.ui.hybrid.E0$l
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f124675f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f124677h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f124674e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f124673d
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r6 = r0.f124672c
            com.sugarcube.app.base.ui.hybrid.E0 r6 = (com.sugarcube.app.base.ui.hybrid.E0) r6
            XH.y.b(r1)
            goto L_0x0060
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            boolean r1 = r6 instanceof com.sugarcube.app.base.ui.hybrid.HybridActivity
            if (r1 == 0) goto L_0x005f
            r1 = r6
            com.sugarcube.app.base.ui.hybrid.HybridActivity r1 = (com.sugarcube.app.base.ui.hybrid.HybridActivity) r1
            com.sugarcube.app.base.ui.hybrid.o r1 = r1.H0()
            com.sugarcube.app.base.ui.hybrid.t0 r3 = new com.sugarcube.app.base.ui.hybrid.t0
            r3.<init>(r5)
            r0.f124672c = r5
            r0.f124673d = r6
            r0.f124674e = r7
            r0.f124677h = r4
            java.lang.Object r6 = r1.R(r3, r0)
            if (r6 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r6 = r5
        L_0x0060:
            r6.f124570Q0 = r4
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.E0.v2(android.app.Activity, dI.e):java.lang.Object");
    }

    public final q w1() {
        return this.f124545E;
    }

    public final UserRepo x1() {
        return this.f124559L;
    }

    public final void x2(nI.q<? super Session, ? super Frame, ? super K0, Integer> qVar) {
        C17542s.j(qVar, "listener");
        Log.d(AnyKt.SUGARCUBE_TAG, "start ArInit");
        C13868b.f118106a.b("start ArInit", YE.e.Capture);
        this.f124579V0.z();
        this.f124603q1 = false;
        this.f124601o1 = System.currentTimeMillis();
        this.f124602p1 = false;
        this.f124600n1 = true;
        this.f124575T.postValue(null);
        this.f124580W0 = new u0(this, qVar);
    }

    public final UUID y1() {
        return this.f124583Y;
    }

    public final Uri z1(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        return this.f124549G.get(videoAsset);
    }

    public final void z2() {
        x2(new B0(this));
    }
}
