package com.sugarcube.decorate.v2.internal.manager.engine;

import A1.B;
import HJ.C15854t;
import OE.C13313e;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import QJ.T;
import RF.C13549b;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import com.sugarcube.app.base.data.analytics.MethodType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.MultiviewThumbnail;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.decorate.DesignItemInfo;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v2.internal.DecorateEngineController;
import com.sugarcube.decorate.v2.internal.manager.DecorationScope;
import com.sugarcube.decorate.v2.internal.manager.model.ModelManager;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import com.sugarcube.decorate_engine.DecorateEngine;
import com.sugarcube.decorate_engine.EraserCounts;
import com.sugarcube.decorate_engine.EraserPickId;
import com.sugarcube.decorate_engine.EraserPickOp;
import com.sugarcube.decorate_engine.FlyCamOrbitParams;
import com.sugarcube.decorate_engine.LayoutThumbnailSpec;
import com.sugarcube.decorate_engine.Metric;
import com.sugarcube.decorate_engine.ModelInstanceDetails;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.SceneLayout;
import com.sugarcube.decorate_engine.SceneLayoutFormat;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hG.C17318v;
import iG.C17346c;
import iG.C17347d;
import iG.C17348e;
import iG.C17350g;
import iG.C17351h;
import iG.C17352i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kG.C17495a;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mG.C17596a;
import mG.C17597b;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import tI.C17978n;

@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u0001:\u0006à\u0001ä\u0001³\u0002BW\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J6\u0010)\u001a\u00020\u00172\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"j\u0004\u0018\u0001`%2\b\u0010(\u001a\u0004\u0018\u00010'H@¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J6\u00106\u001a\u0002022\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020#2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u000204H@¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u0004\u0018\u0001022\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J!\u0010@\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u0001022\u0006\u0010?\u001a\u000204H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u000202H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00172\u0006\u0010>\u001a\u0002022\u0006\u0010?\u001a\u000204H\u0002¢\u0006\u0004\bE\u0010AJ\u000f\u0010F\u001a\u00020\u0017H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00172\u0006\u0010>\u001a\u000202H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010M\u001a\u00020\u00172\u0006\u0010J\u001a\u00020:2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ!\u0010R\u001a\u00020\u00172\u0006\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u000204H\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010V\u001a\u00020\u00172\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010GJ\u000f\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bY\u0010GJ\u0017\u0010[\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020:H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00172\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00172\u0006\u0010_\u001a\u00020OH\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00172\u0006\u0010b\u001a\u00020:2\u0006\u0010_\u001a\u00020OH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010GJ\u0010\u0010f\u001a\u00020\u0017H@¢\u0006\u0004\bf\u0010gJD\u0010l\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010h\u001a\u0002042\b\b\u0002\u0010i\u001a\u0002042\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j2\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0004\bl\u0010mJD\u0010o\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010n\u001a\u0004\u0018\u0001022\b\b\u0002\u0010i\u001a\u0002042\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j2\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0004\bo\u0010pJF\u0010r\u001a\u0002022\u0006\u0010,\u001a\u00020+2\b\u0010q\u001a\u0004\u0018\u0001022\b\u0010n\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u0002042\u0006\u0010i\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0004\br\u0010sJ>\u0010t\u001a\u0002022\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0004\bt\u0010uJ\u001a\u0010v\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u000102H@¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bx\u0010\\J\u000f\u0010y\u001a\u00020\u0017H\u0002¢\u0006\u0004\by\u0010GJ\u001b\u0010z\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bz\u0010{J\u001b\u0010|\u001a\u0004\u0018\u00010O2\b\u0010>\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u001a\u00020~H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u001e2\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J4\u0010\u0001\u001a\u00020\u00172 \u0010\u0001\u001a\u001b\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00170\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u00010\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0015H@¢\u0006\u0005\b\u0001\u0010\u0019J0\u0010\u0001\u001a \u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u0002020\u0001j\u000f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000202`\u0001H@¢\u0006\u0005\b\u0001\u0010gJ\u0011\u0010\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0001\u0010GJ\u0011\u0010\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0001\u0010GJ\u0019\u0010\u0001\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0005\b\u0001\u0010\\J\u0019\u0010\u0001\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0005\b\u0001\u0010\\J\u0019\u0010\u0001\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0005\b\u0001\u0010\\J!\u0010\u0001\u001a\u00020\u00172\u0006\u0010J\u001a\u00020:2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0005\b\u0001\u0010NJ\u0019\u0010\u0001\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020:H\u0016¢\u0006\u0005\b\u0001\u0010\\J!\u0010\u0001\u001a\u00020\u00172\u0006\u0010b\u001a\u00020:2\u0006\u0010_\u001a\u00020OH\u0016¢\u0006\u0005\b\u0001\u0010dJ\u0019\u0010\u0001\u001a\u00020\u00172\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0005\b\u0001\u0010aJ\u0013\u0010¡\u0001\u001a\u00030 \u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010£\u0001\u001a\u000204H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0011\u0010¥\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b¥\u0001\u0010GJ\u0011\u0010¦\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b¦\u0001\u0010GJ\u0011\u0010§\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b§\u0001\u0010GJ\u0011\u0010¨\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b¨\u0001\u0010GJ&\u0010ª\u0001\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+2\t\u0010©\u0001\u001a\u0004\u0018\u00010TH@¢\u0006\u0006\bª\u0001\u0010«\u0001J$\u0010¯\u0001\u001a\u00020\u00172\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030­\u00010¬\u0001H@¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001a\u0010±\u0001\u001a\u00020\u00172\u0006\u0010>\u001a\u000202H@¢\u0006\u0005\b±\u0001\u0010wJ\u0012\u0010²\u0001\u001a\u00020\u0017H@¢\u0006\u0005\b²\u0001\u0010gJ'\u0010µ\u0001\u001a\u00030´\u00012\b\u0010,\u001a\u0004\u0018\u00010+2\u0007\u0010³\u0001\u001a\u000204H@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0012\u0010·\u0001\u001a\u00020\u0017H@¢\u0006\u0005\b·\u0001\u0010gJ\u001c\u0010¸\u0001\u001a\u00020\u00172\b\u0010U\u001a\u0004\u0018\u00010TH@¢\u0006\u0005\b¸\u0001\u0010WJ\u0019\u0010¹\u0001\u001a\u00020\u00172\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0005\b¹\u0001\u0010aJ\u0011\u0010º\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\bº\u0001\u0010GJ\u0011\u0010»\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b»\u0001\u0010GJ\u0011\u0010¼\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b¼\u0001\u0010GJ\u0011\u0010½\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b½\u0001\u0010GJ\u0013\u0010¿\u0001\u001a\u00030¾\u0001H\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0015\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010À\u0001J\u001e\u0010Ã\u0001\u001a\u00020\u00172\n\u0010Â\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0011\u0010Å\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\bÅ\u0001\u0010GJ\u001f\u0010È\u0001\u001a\u0004\u0018\u00010-2\b\u0010Ç\u0001\u001a\u00030Æ\u0001H@¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001c\u0010Ë\u0001\u001a\u00020\u00172\u0007\u0010Ê\u0001\u001a\u000204H@¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001b\u0010Î\u0001\u001a\u00020\u00172\t\b\u0002\u0010Í\u0001\u001a\u000204¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J#\u0010Ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ð\u00010¬\u00012\u0007\u0010\u0001\u001a\u00020\u0015H@¢\u0006\u0005\bÑ\u0001\u0010\u0019J\u001c\u0010Ò\u0001\u001a\f\u0012\u0005\u0012\u00030Ð\u0001\u0018\u00010¬\u0001H@¢\u0006\u0005\bÒ\u0001\u0010gJ&\u0010Ò\u0001\u001a\f\u0012\u0005\u0012\u00030Ð\u0001\u0018\u00010¬\u00012\u0007\u0010Ó\u0001\u001a\u000204H@¢\u0006\u0006\bÒ\u0001\u0010Ì\u0001J\u001e\u0010Ö\u0001\u001a\u00020\u00172\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ô\u0001H\u0016¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0014\u0010Ø\u0001\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001e\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\bè\u0001\u0010ç\u0001R\u001b\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010ï\u0001\u001a\u00030 \u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R)\u0010ó\u0001\u001a\u0002042\u0007\u0010ð\u0001\u001a\u0002048\u0002@BX\u000e¢\u0006\u000f\n\u0005\bñ\u0001\u0010E\"\u0006\bò\u0001\u0010Ï\u0001R)\u0010÷\u0001\u001a\u0002042\u0007\u0010ô\u0001\u001a\u0002048\u0002@BX\u000e¢\u0006\u000f\n\u0005\bõ\u0001\u0010E\"\u0006\bö\u0001\u0010Ï\u0001R\u001a\u0010û\u0001\u001a\u00030ø\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010þ\u0001\u001a\u00030¾\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001a\u0010\u0002\u001a\u00030¾\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010ý\u0001R0\u0010\u0002\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0002\u001a\u0005\u0018\u00010¾\u00018\u0002@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010ý\u0001\"\u0006\b\u0002\u0010Ä\u0001R\u001b\u0010\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010ë\u0001R,\u0010\u0002\u001a\u00030\u00012\b\u0010\u0002\u001a\u00030\u00018\u0002@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R-\u0010\u0002\u001a\u0004\u0018\u00010~2\t\u0010\u0002\u001a\u0004\u0018\u00010~8\u0002@BX\u000e¢\u0006\u000f\n\u0005\bt\u0010\u0002\"\u0006\b\u0002\u0010\u0001R8\u0010\u0002\u001a\t\u0012\u0004\u0012\u0002020¬\u00012\u000e\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u0002020¬\u00018\u0002@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001e\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bo\u0010\u0002R-\u0010\u0002\u001a\u0004\u0018\u00010B2\t\u0010ð\u0001\u001a\u0004\u0018\u00010B8\u0002@BX\u000e¢\u0006\u000f\n\u0005\br\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0002R1\u0010¡\u0002\u001a\u0002042\u0007\u0010ð\u0001\u001a\u0002048\u0006@FX\u000e¢\u0006\u0017\n\u0005\b \u0002\u0010E\u001a\u0006\b¡\u0002\u0010¤\u0001\"\u0006\b¢\u0002\u0010Ï\u0001R\u001e\u0010¥\u0002\u001a\t\u0012\u0004\u0012\u0002040£\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010¤\u0002R\u001d\u0010¦\u0002\u001a\t\u0012\u0004\u0012\u0002040£\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bV\u0010¤\u0002R\u0017\u0010©\u0002\u001a\u00030§\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bF\u0010¨\u0002R)\u0010°\u0002\u001a\u00030ª\u00028\u0006@\u0006X.¢\u0006\u0017\n\u0005\bY\u0010«\u0002\u001a\u0006\b¬\u0002\u0010­\u0002\"\u0006\b®\u0002\u0010¯\u0002R\u0018\u0010²\u0002\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bH\u0010±\u0002¨\u0006´\u0002"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "Landroid/content/Context;", "context", "LOE/e;", "installationConfig", "LhG/v;", "decorateAnalytics", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "engineController", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "modelManager", "LQJ/Q;", "decorateScope", "backgroundScope", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "touchManager", "<init>", "(Landroid/content/Context;LOE/e;LhG/v;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;LQJ/Q;LQJ/Q;Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;)V", "LkG/c;", "sceneLoadingMetadata", "LXH/N;", "P", "(LkG/c;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "error", "O", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;)V", "", "gestureMessage", "L", "(Ljava/lang/String;)V", "", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "instanceInfoMap", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "l0", "(Ljava/util/Map;Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "Lcom/sugarcube/decorate_engine/SceneLayout;", "D", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Lcom/sugarcube/decorate_engine/SceneLayout;", "catalogItem", "instanceId", "LRF/k;", "swapWith", "", "isPlaceholder", "j0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;LRF/k;ZLdI/e;)Ljava/lang/Object;", "n0", "(LkG/c;)V", "Lo1/g;", "offset", "U", "(J)LRF/k;", "instance", "isForSwap", "i0", "(LRF/k;Z)V", "LmG/b;", "I", "(LRF/k;)LmG/b;", "Z", "A", "()V", "C", "(LRF/k;)V", "downPosition", "LA1/B;", "change", "N", "(JLA1/B;)V", "", "rotation", "isAbsYaw", "S", "(FZ)V", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "smartaPlacement", "z", "(Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "M", "B", "pan", "p0", "(J)V", "q0", "(LA1/B;)V", "zoom", "r0", "(F)V", "centroid", "s0", "(JF)V", "g0", "R", "(LdI/e;)Ljava/lang/Object;", "shouldReplace", "shouldAutoSelect", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "modelTransform", "w", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZZLcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "swapOutInstance", "u", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;ZLcom/sugarcube/decorate_engine/ModelScreenTransform;Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "placeholderInstance", "v", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;LRF/k;ZZLcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "s", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/decorate_engine/ObjectInstanceId;LRF/k;ZLcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "Q", "(LRF/k;LdI/e;)Ljava/lang/Object;", "h0", "o0", "F", "(LRF/k;)Lo1/g;", "G", "(LRF/k;)Ljava/lang/Float;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "gestureMetadata", "m0", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/a;)V", "LiG/h;", "gesture", "H", "(LiG/h;)Ljava/lang/String;", "Lkotlin/Function1;", "LdI/e;", "", "block", "K", "(LnI/l;)V", "metadata", "f0", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getModelMap", "clearAllInstances", "cleanUp", "processTapEvent-k-4lQ0M", "processTapEvent", "processDoubleTapEvent-k-4lQ0M", "processDoubleTapEvent", "processLongPressEvent-k-4lQ0M", "processLongPressEvent", "processDragEvent-3MmeM6k", "processDragEvent", "processPanEvent-k-4lQ0M", "processPanEvent", "processZoomEvent-3MmeM6k", "processZoomEvent", "processRotateEvent", "LRF/b;", "getEngineDebugInfo", "()LRF/b;", "toggleMagicEraser", "()Z", "enableMagicEraser", "disableMagicEraser", "eraseAllErasableItems", "restoreAllErasableItems", "placement", "placeItemInDesign", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/core/network/models/SmartaPlacement;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/decorate/DesignItemInfo;", "items", "placeAllItemsInDesign", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "selectInstance", "removeSelectedItemFromDesign", "isIncompatible", "LiG/j;", "swapSelectedItemWith", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLdI/e;)Ljava/lang/Object;", "restorePreviouslySelectedVariant", "duplicateSelectedItem", "rotateSelectedItemBy", "mirrorSelectedItem", "flipSelectedItem", "focusOnSelectedItem", "unFocusSelectedItem", "LRF/j;", "getInitialViewport", "()LRF/j;", "getCurrentViewport", "viewport", "setViewport", "(LRF/j;)V", "restorePreviousViewport", "LkG/a;", "sceneType", "saveSceneLayout", "(LkG/a;LdI/e;)Ljava/lang/Object;", "isSavedCompositionGLTF", "saveCleanUp", "(ZLdI/e;)Ljava/lang/Object;", "emitToFlow", "y", "(Z)V", "LmG/a;", "getMultiviewInformation", "updateMultiviewInformation", "useSideViews", "", "color", "setHelaWallColor", "(Ljava/lang/Integer;)V", "getHelaWallColor", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "LhG/v;", "c", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "d", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "getEngineController", "()Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "e", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "f", "LQJ/Q;", "g", "h", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "J", "()Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "i", "LRF/b;", "engineDebugInfo", "new", "j", "X", "isDirty", "enabled", "k", "b0", "isMagicEraserEnabled", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "l", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "sceneLayoutFormat", "m", "LRF/j;", "initialViewport", "n", "previousViewport", "value", "o", "W", "activeViewport", "p", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "dragStartTransform", "q", "lockCentroid", "r", "LiG/h;", "V", "(LiG/h;)V", "activeProcessedGesture", "Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "d0", "processedGestureMetadata", "t", "Ljava/util/List;", "c0", "(Ljava/util/List;)V", "modelList", "", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$e;", "modelDownloadRequests", "LmG/b;", "e0", "(LmG/b;)V", "selectedInstance", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "incompatibleVariantSwap", "x", "isFocused", "Y", "LQJ/x;", "LQJ/x;", "metadataLoaded", "engineIsDrawing", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;", "E", "()Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;", "a0", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;)V", "listener", "Ljava/lang/String;", "startGestureValue", "EventsListener", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EngineManagerImpl implements EngineManager {

    /* renamed from: D  reason: collision with root package name */
    public static final d f142313D = new d((DefaultConstructorMarker) null);

    /* renamed from: E  reason: collision with root package name */
    public static final int f142314E = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final IDecorateEngine f142315A;

    /* renamed from: B  reason: collision with root package name */
    public EventsListener f142316B;

    /* renamed from: C  reason: collision with root package name */
    private String f142317C;

    /* renamed from: a  reason: collision with root package name */
    private final Context f142318a;

    /* renamed from: b  reason: collision with root package name */
    private final C17318v f142319b;

    /* renamed from: c  reason: collision with root package name */
    private final ConfigRepository f142320c;

    /* renamed from: d  reason: collision with root package name */
    private final DecorateEngineController f142321d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ModelManager f142322e;

    /* renamed from: f  reason: collision with root package name */
    private final Q f142323f;

    /* renamed from: g  reason: collision with root package name */
    private final Q f142324g;

    /* renamed from: h  reason: collision with root package name */
    private final TouchManager f142325h;

    /* renamed from: i  reason: collision with root package name */
    private C13549b f142326i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f142327j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f142328k;

    /* renamed from: l  reason: collision with root package name */
    private SceneLayoutFormat f142329l = SceneLayoutFormat.Legacy2D;

    /* renamed from: m  reason: collision with root package name */
    private RF.j f142330m;

    /* renamed from: n  reason: collision with root package name */
    private RF.j f142331n;

    /* renamed from: o  reason: collision with root package name */
    private RF.j f142332o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public ModelScreenTransform f142333p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f142334q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C17351h f142335r;

    /* renamed from: s  reason: collision with root package name */
    private a f142336s;

    /* renamed from: t  reason: collision with root package name */
    private List<RF.k> f142337t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final List<e> f142338u;

    /* renamed from: v  reason: collision with root package name */
    private C17597b f142339v;

    /* renamed from: w  reason: collision with root package name */
    private CachedCatalogItem f142340w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f142341x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C16339x<Boolean> f142342y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C16339x<Boolean> f142343z;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$EventsListener;", "", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "error", "LXH/N;", "onEngineError", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;)V", "", "isDirty", "onDesignDirtyChanged", "(Z)V", "LmG/b;", "selectedInstanceInfo", "onSelectedInstanceChanged", "(LmG/b;)V", "", "LRF/k;", "models", "onModelListUpdated", "(Ljava/util/List;)V", "isFocused", "onFocusedChanged", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "region", "onPanZoomRegionUpdated", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "Lcom/sugarcube/decorate/v2/internal/manager/engine/a;", "metadata", "onProcessedGesture", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/a;)V", "enabled", "Lcom/sugarcube/decorate_engine/EraserCounts;", "eraserCounts", "onMagicEraserChanged", "(ZLcom/sugarcube/decorate_engine/EraserCounts;)V", "", "viewCount", "onMultiviewInformationChanged", "(I)V", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "transform", "onTransformApplied", "(Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface EventsListener {
        void onDesignDirtyChanged(boolean z10);

        void onEngineError(DecorateEngineController.a aVar);

        void onFocusedChanged(boolean z10);

        void onMagicEraserChanged(boolean z10, EraserCounts eraserCounts);

        void onModelListUpdated(List<RF.k> list);

        void onMultiviewInformationChanged(int i10);

        void onPanZoomRegionUpdated(PanZoomRegion panZoomRegion);

        void onProcessedGesture(a aVar);

        void onSelectedInstanceChanged(C17597b bVar);

        void onTransformApplied(ModelScreenTransform modelScreenTransform);
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$a", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$EngineErrorListener;", "Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;", "engineError", "LXH/N;", "onError", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController$a;)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements DecorateEngineController.EngineErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142344a;

        a(EngineManagerImpl engineManagerImpl) {
            this.f142344a = engineManagerImpl;
        }

        public void onError(DecorateEngineController.a aVar) {
            C17542s.j(aVar, "engineError");
            this.f142344a.O(aVar);
        }

        public void onMetric(Metric metric) {
            C17542s.j(metric, "metric");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$3", f = "EngineManagerImpl.kt", l = {193}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142345c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f142346d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142347e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f142348a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EngineManagerImpl f142349b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C3472a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f142350a;

                /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        com.sugarcube.decorate_engine.DecorateEngine$RunState[] r0 = com.sugarcube.decorate_engine.DecorateEngine.RunState.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Running     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.New     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Error     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.SettingUp     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.SetUp     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.TearingDown     // Catch:{ NoSuchFieldError -> 0x003d }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                        r2 = 6
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                    L_0x003d:
                        com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.TornDown     // Catch:{ NoSuchFieldError -> 0x0046 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                        r2 = 7
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                    L_0x0046:
                        f142350a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a.C3472a.<clinit>():void");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$3$1", f = "EngineManagerImpl.kt", l = {198}, m = "emit")
            /* renamed from: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a$b  reason: collision with other inner class name */
            static final class C3473b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f142351c;

                /* renamed from: d  reason: collision with root package name */
                Object f142352d;

                /* renamed from: e  reason: collision with root package name */
                Object f142353e;

                /* renamed from: f  reason: collision with root package name */
                Object f142354f;

                /* renamed from: g  reason: collision with root package name */
                Object f142355g;

                /* renamed from: h  reason: collision with root package name */
                Object f142356h;

                /* renamed from: i  reason: collision with root package name */
                Object f142357i;

                /* renamed from: j  reason: collision with root package name */
                Object f142358j;

                /* renamed from: k  reason: collision with root package name */
                Object f142359k;

                /* renamed from: l  reason: collision with root package name */
                Object f142360l;

                /* renamed from: m  reason: collision with root package name */
                Object f142361m;

                /* renamed from: n  reason: collision with root package name */
                int f142362n;

                /* renamed from: o  reason: collision with root package name */
                int f142363o;

                /* renamed from: p  reason: collision with root package name */
                int f142364p;

                /* renamed from: q  reason: collision with root package name */
                int f142365q;

                /* renamed from: r  reason: collision with root package name */
                int f142366r;

                /* renamed from: s  reason: collision with root package name */
                int f142367s;

                /* renamed from: t  reason: collision with root package name */
                /* synthetic */ Object f142368t;

                /* renamed from: u  reason: collision with root package name */
                final /* synthetic */ a<T> f142369u;

                /* renamed from: v  reason: collision with root package name */
                int f142370v;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3473b(a<? super T> aVar, C17164e<? super C3473b> eVar) {
                    super(eVar);
                    this.f142369u = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f142368t = obj;
                    this.f142370v |= Integer.MIN_VALUE;
                    return this.f142369u.emit((XH.v<? extends DecorateEngine.RunState, ? extends DecorateEngine.DrawState>) null, this);
                }
            }

            a(Q q10, EngineManagerImpl engineManagerImpl) {
                this.f142348a = q10;
                this.f142349b = engineManagerImpl;
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(XH.v<? extends com.sugarcube.decorate_engine.DecorateEngine.RunState, ? extends com.sugarcube.decorate_engine.DecorateEngine.DrawState> r19, dI.C17164e<? super XH.C16807N> r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a.C3473b
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a$b r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a.C3473b) r2
                    int r3 = r2.f142370v
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f142370v = r3
                    goto L_0x001c
                L_0x0017:
                    com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a$b r2 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a$b
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r3 = r2.f142368t
                    java.lang.Object r4 = eI.C17187b.f()
                    int r5 = r2.f142370v
                    r6 = 1
                    if (r5 == 0) goto L_0x0064
                    if (r5 != r6) goto L_0x005c
                    java.lang.Object r1 = r2.f142361m
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r2.f142360l
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r2.f142359k
                    com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
                    java.lang.Object r1 = r2.f142358j
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r2.f142357i
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r2.f142356h
                    com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = (com.sugarcube.decorate_engine.DecorateEngine.RunState) r1
                    java.lang.Object r1 = r2.f142355g
                    com.sugarcube.decorate_engine.DecorateEngine$DrawState r1 = (com.sugarcube.decorate_engine.DecorateEngine.DrawState) r1
                    java.lang.Object r1 = r2.f142354f
                    com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = (com.sugarcube.decorate_engine.DecorateEngine.RunState) r1
                    java.lang.Object r1 = r2.f142353e
                    dI.e r1 = (dI.C17164e) r1
                    java.lang.Object r1 = r2.f142352d
                    XH.v r1 = (XH.v) r1
                    java.lang.Object r1 = r2.f142351c
                    com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$b$a r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a) r1
                    XH.y.b(r3)
                    r2 = r1
                    r1 = r6
                    goto L_0x0225
                L_0x005c:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0064:
                    XH.y.b(r3)
                    java.lang.Object r3 = r19.a()
                    com.sugarcube.decorate_engine.DecorateEngine$RunState r3 = (com.sugarcube.decorate_engine.DecorateEngine.RunState) r3
                    java.lang.Object r5 = r19.b()
                    com.sugarcube.decorate_engine.DecorateEngine$DrawState r5 = (com.sugarcube.decorate_engine.DecorateEngine.DrawState) r5
                    int[] r7 = com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a.C3472a.f142350a
                    int r8 = r3.ordinal()
                    r7 = r7[r8]
                    switch(r7) {
                        case 1: goto L_0x0084;
                        case 2: goto L_0x0232;
                        case 3: goto L_0x0232;
                        case 4: goto L_0x0232;
                        case 5: goto L_0x0232;
                        case 6: goto L_0x0232;
                        case 7: goto L_0x0232;
                        default: goto L_0x007e;
                    }
                L_0x007e:
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                L_0x0084:
                    com.sugarcube.decorate_engine.DecorateEngine$DrawState r8 = com.sugarcube.decorate_engine.DecorateEngine.DrawState.Drawing
                    if (r5 != r8) goto L_0x0232
                    QJ.Q r8 = r0.f142348a
                    com.sugarcube.core.logger.Priority r9 = com.sugarcube.core.logger.Priority.DEBUG
                    int[] r10 = iG.C17344a.f143476a
                    int r11 = r9.ordinal()
                    r10 = r10[r11]
                    java.lang.String r11 = " "
                    java.lang.String r12 = "Kt"
                    r15 = 2
                    java.lang.String r13 = "Engine is drawing!"
                    java.lang.String r14 = ""
                    if (r10 == r6) goto L_0x01af
                    if (r10 == r15) goto L_0x0170
                    r6 = 3
                    if (r10 == r6) goto L_0x0130
                    r6 = 4
                    if (r10 == r6) goto L_0x00f0
                    r6 = 5
                    if (r10 != r6) goto L_0x00ea
                    java.lang.Class r6 = r8.getClass()
                    java.lang.String r6 = r6.getName()
                    kotlin.jvm.internal.C17542s.g(r6)
                    r17 = r4
                    r4 = 0
                    r10 = 36
                    java.lang.String r10 = HJ.C15854t.s1(r6, r10, r4, r15, r4)
                    r16 = r6
                    r6 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r10, r6, r4, r15, r4)
                    int r6 = r4.length()
                    if (r6 != 0) goto L_0x00cf
                    r6 = r16
                    goto L_0x00d3
                L_0x00cf:
                    java.lang.String r6 = HJ.C15854t.P0(r4, r12)
                L_0x00d3:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r13)
                    r4.append(r11)
                    r4.append(r14)
                    java.lang.String r4 = r4.toString()
                    android.util.Log.e(r6, r4)
                    goto L_0x01ed
                L_0x00ea:
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                L_0x00f0:
                    r17 = r4
                    java.lang.Class r4 = r8.getClass()
                    java.lang.String r4 = r4.getName()
                    kotlin.jvm.internal.C17542s.g(r4)
                    r6 = 36
                    r10 = 0
                    java.lang.String r6 = HJ.C15854t.s1(r4, r6, r10, r15, r10)
                    r16 = r4
                    r4 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r6, r4, r10, r15, r10)
                    int r6 = r4.length()
                    if (r6 != 0) goto L_0x0115
                    r4 = r16
                    goto L_0x0119
                L_0x0115:
                    java.lang.String r4 = HJ.C15854t.P0(r4, r12)
                L_0x0119:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r13)
                    r6.append(r11)
                    r6.append(r14)
                    java.lang.String r6 = r6.toString()
                    android.util.Log.w(r4, r6)
                    goto L_0x01ed
                L_0x0130:
                    r17 = r4
                    java.lang.Class r4 = r8.getClass()
                    java.lang.String r4 = r4.getName()
                    kotlin.jvm.internal.C17542s.g(r4)
                    r6 = 36
                    r10 = 0
                    java.lang.String r6 = HJ.C15854t.s1(r4, r6, r10, r15, r10)
                    r16 = r4
                    r4 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r6, r4, r10, r15, r10)
                    int r6 = r4.length()
                    if (r6 != 0) goto L_0x0155
                    r4 = r16
                    goto L_0x0159
                L_0x0155:
                    java.lang.String r4 = HJ.C15854t.P0(r4, r12)
                L_0x0159:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r13)
                    r6.append(r11)
                    r6.append(r14)
                    java.lang.String r6 = r6.toString()
                    android.util.Log.i(r4, r6)
                    goto L_0x01ed
                L_0x0170:
                    r17 = r4
                    java.lang.Class r4 = r8.getClass()
                    java.lang.String r4 = r4.getName()
                    kotlin.jvm.internal.C17542s.g(r4)
                    r6 = 36
                    r10 = 0
                    java.lang.String r6 = HJ.C15854t.s1(r4, r6, r10, r15, r10)
                    r16 = r4
                    r4 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r6, r4, r10, r15, r10)
                    int r6 = r4.length()
                    if (r6 != 0) goto L_0x0195
                    r4 = r16
                    goto L_0x0199
                L_0x0195:
                    java.lang.String r4 = HJ.C15854t.P0(r4, r12)
                L_0x0199:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r13)
                    r6.append(r11)
                    r6.append(r14)
                    java.lang.String r6 = r6.toString()
                    android.util.Log.d(r4, r6)
                    goto L_0x01ed
                L_0x01af:
                    r17 = r4
                    java.lang.Class r4 = r8.getClass()
                    java.lang.String r4 = r4.getName()
                    kotlin.jvm.internal.C17542s.g(r4)
                    r6 = 36
                    r10 = 0
                    java.lang.String r6 = HJ.C15854t.s1(r4, r6, r10, r15, r10)
                    r16 = r4
                    r4 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r6, r4, r10, r15, r10)
                    int r6 = r4.length()
                    if (r6 != 0) goto L_0x01d4
                    r4 = r16
                    goto L_0x01d8
                L_0x01d4:
                    java.lang.String r4 = HJ.C15854t.P0(r4, r12)
                L_0x01d8:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r13)
                    r6.append(r11)
                    r6.append(r14)
                    java.lang.String r6 = r6.toString()
                    android.util.Log.v(r4, r6)
                L_0x01ed:
                    com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r4 = r0.f142349b
                    QJ.x r4 = r4.f142342y
                    r2.f142351c = r0
                    r6 = r19
                    r2.f142352d = r6
                    r2.f142353e = r1
                    r2.f142354f = r3
                    r2.f142355g = r5
                    r2.f142356h = r3
                    r2.f142357i = r8
                    r2.f142358j = r8
                    r2.f142359k = r9
                    r2.f142360l = r13
                    r2.f142361m = r14
                    r2.f142362n = r7
                    r1 = 0
                    r2.f142363o = r1
                    r2.f142364p = r1
                    r2.f142365q = r1
                    r2.f142366r = r1
                    r2.f142367s = r1
                    r1 = 1
                    r2.f142370v = r1
                    java.lang.Object r2 = r4.f(r2)
                    r3 = r17
                    if (r2 != r3) goto L_0x0224
                    return r3
                L_0x0224:
                    r2 = r0
                L_0x0225:
                    com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r2 = r2.f142349b
                    QJ.x r2 = r2.f142343z
                    java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                    r2.J(r1)
                L_0x0232:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.b.a.emit(XH.v, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EngineManagerImpl engineManagerImpl, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f142347e = engineManagerImpl;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f142347e, eVar);
            bVar.f142346d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142345c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f142346d;
                C16519P<XH.v<DecorateEngine.RunState, DecorateEngine.DrawState>> f11 = this.f142347e.getEngineController().f();
                a aVar = new a(q10, this.f142347e);
                this.f142346d = q10;
                this.f142345c = 1;
                if (f11.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Q q11 = (Q) this.f142346d;
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$4", f = "EngineManagerImpl.kt", l = {215, 216}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142371c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142372d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EngineManagerImpl f142373a;

            a(EngineManagerImpl engineManagerImpl) {
                this.f142373a = engineManagerImpl;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                if (!z10) {
                    this.f142373a.f142334q = C5667g.f26701b.b();
                    EngineManagerImpl engineManagerImpl = this.f142373a;
                    engineManagerImpl.d0(a.f142540c.a(engineManagerImpl.f142335r));
                    this.f142373a.V(C17351h.UNSPECIFIED);
                    this.f142373a.f142333p = null;
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EngineManagerImpl engineManagerImpl, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f142372d = engineManagerImpl;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f142372d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142371c;
            if (i10 == 0) {
                y.b(obj);
                C16339x g10 = this.f142372d.f142343z;
                this.f142371c = 1;
                if (g10.f(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16532g<Boolean> isTransformingFlow = this.f142372d.J().isTransformingFlow();
            a aVar = new a(this.f142372d);
            this.f142371c = 2;
            if (isTransformingFlow.collect(aVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$d;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SHOW_GESTURE_INTERACTION_LOGS", "Z", "", "ORBIT_TRANSFORMATION_SENSITIVITY", "F", "ZOOM_SENSITIVITY", "ZOOM_MIN_VALUE", "ZOOM_MAX_VALUE", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR9\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl$e;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LRF/k;", "placeholder", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "downloadBlock", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;LnI/q;)V", "a", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "()LRF/k;", "c", "()LnI/q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "getItem", "LRF/k;", "getPlaceholder", "LnI/q;", "getDownloadBlock", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f142374a;

        /* renamed from: b  reason: collision with root package name */
        private final RF.k f142375b;

        /* renamed from: c  reason: collision with root package name */
        private final nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> f142376c;

        public e(CachedCatalogItem cachedCatalogItem, RF.k kVar, nI.q<? super CachedCatalogItem, ? super RF.k, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
            C17542s.j(cachedCatalogItem, "item");
            C17542s.j(kVar, "placeholder");
            C17542s.j(qVar, "downloadBlock");
            this.f142374a = cachedCatalogItem;
            this.f142375b = kVar;
            this.f142376c = qVar;
        }

        public final CachedCatalogItem a() {
            return this.f142374a;
        }

        public final RF.k b() {
            return this.f142375b;
        }

        public final nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> c() {
            return this.f142376c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f142374a, eVar.f142374a) && C17542s.e(this.f142375b, eVar.f142375b) && C17542s.e(this.f142376c, eVar.f142376c);
        }

        public int hashCode() {
            return (((this.f142374a.hashCode() * 31) + this.f142375b.hashCode()) * 31) + this.f142376c.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f142374a;
            RF.k kVar = this.f142375b;
            nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> qVar = this.f142376c;
            return "DownloadRequest(item=" + cachedCatalogItem + ", placeholder=" + kVar + ", downloadBlock=" + qVar + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f142377a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f142378b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                kG.a[] r0 = kG.C17495a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kG.a r2 = kG.C17495a.Smarta     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                kG.a r3 = kG.C17495a.MultiviewDrawer     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kG.a r3 = kG.C17495a.Hela     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f142377a = r0
                iG.h[] r0 = iG.C17351h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iG.h r3 = iG.C17351h.MOVE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                iG.h r1 = iG.C17351h.ROTATE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f142378b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.f.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {1054}, m = "addInstance")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142379c;

        /* renamed from: d  reason: collision with root package name */
        Object f142380d;

        /* renamed from: e  reason: collision with root package name */
        Object f142381e;

        /* renamed from: f  reason: collision with root package name */
        Object f142382f;

        /* renamed from: g  reason: collision with root package name */
        Object f142383g;

        /* renamed from: h  reason: collision with root package name */
        Object f142384h;

        /* renamed from: i  reason: collision with root package name */
        Object f142385i;

        /* renamed from: j  reason: collision with root package name */
        boolean f142386j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f142387k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142388l;

        /* renamed from: m  reason: collision with root package name */
        int f142389m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(EngineManagerImpl engineManagerImpl, C17164e<? super g> eVar) {
            super(eVar);
            this.f142388l = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142387k = obj;
            this.f142389m |= Integer.MIN_VALUE;
            return this.f142388l.s((CachedCatalogItem) null, (ObjectInstanceId) null, (RF.k) null, false, (SmartaPlacement) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {958, 974}, m = "addItemToDesign")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142390c;

        /* renamed from: d  reason: collision with root package name */
        Object f142391d;

        /* renamed from: e  reason: collision with root package name */
        Object f142392e;

        /* renamed from: f  reason: collision with root package name */
        Object f142393f;

        /* renamed from: g  reason: collision with root package name */
        Object f142394g;

        /* renamed from: h  reason: collision with root package name */
        Object f142395h;

        /* renamed from: i  reason: collision with root package name */
        boolean f142396i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f142397j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142398k;

        /* renamed from: l  reason: collision with root package name */
        int f142399l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(EngineManagerImpl engineManagerImpl, C17164e<? super h> eVar) {
            super(eVar);
            this.f142398k = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142397j = obj;
            this.f142399l |= Integer.MIN_VALUE;
            return this.f142398k.u((CachedCatalogItem) null, (RF.k) null, false, (ModelScreenTransform) null, (SmartaPlacement) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$addItemToDesign$3", f = "EngineManagerImpl.kt", l = {1011}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> f142401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f142402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RF.k f142403f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(nI.q<? super CachedCatalogItem, ? super RF.k, ? super C17164e<? super C16807N>, ? extends Object> qVar, CachedCatalogItem cachedCatalogItem, RF.k kVar, C17164e<? super i> eVar) {
            super(1, eVar);
            this.f142401d = qVar;
            this.f142402e = cachedCatalogItem;
            this.f142403f = kVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new i(this.f142401d, this.f142402e, this.f142403f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((i) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142400c;
            if (i10 == 0) {
                y.b(obj);
                nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> qVar = this.f142401d;
                CachedCatalogItem cachedCatalogItem = this.f142402e;
                RF.k kVar = this.f142403f;
                this.f142400c = 1;
                if (qVar.invoke(cachedCatalogItem, kVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "downloadedItem", "LRF/k;", "swapWith", "LXH/N;", "<anonymous>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LRF/k;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$addItemToDesign$downloadLambda$1", f = "EngineManagerImpl.kt", l = {994, 995}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f142404c;

        /* renamed from: d  reason: collision with root package name */
        int f142405d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142406e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f142407f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RF.k f142408g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RF.k f142409h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f142410i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ SmartaPlacement f142411j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ O<e> f142412k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(EngineManagerImpl engineManagerImpl, CachedCatalogItem cachedCatalogItem, RF.k kVar, RF.k kVar2, boolean z10, SmartaPlacement smartaPlacement, O<e> o10, C17164e<? super j> eVar) {
            super(3, eVar);
            this.f142406e = engineManagerImpl;
            this.f142407f = cachedCatalogItem;
            this.f142408g = kVar;
            this.f142409h = kVar2;
            this.f142410i = z10;
            this.f142411j = smartaPlacement;
            this.f142412k = o10;
        }

        /* renamed from: i */
        public final Object invoke(CachedCatalogItem cachedCatalogItem, RF.k kVar, C17164e<? super C16807N> eVar) {
            return new j(this.f142406e, this.f142407f, this.f142408g, this.f142409h, this.f142410i, this.f142411j, this.f142412k, eVar).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[Catch:{ Exception -> 0x0016 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0065 A[Catch:{ Exception -> 0x0016 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f142405d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                java.lang.Object r0 = r12.f142404c
                com.sugarcube.app.base.data.database.CachedCatalogItem r0 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r0
                XH.y.b(r13)     // Catch:{ Exception -> 0x0016 }
                goto L_0x0052
            L_0x0016:
                r13 = move-exception
                goto L_0x006c
            L_0x0018:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0020:
                XH.y.b(r13)     // Catch:{ Exception -> 0x0016 }
                goto L_0x0038
            L_0x0024:
                XH.y.b(r13)
                com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r13 = r12.f142406e     // Catch:{ Exception -> 0x0016 }
                com.sugarcube.decorate.v2.internal.manager.model.ModelManager r13 = r13.f142322e     // Catch:{ Exception -> 0x0016 }
                com.sugarcube.app.base.data.database.CachedCatalogItem r1 = r12.f142407f     // Catch:{ Exception -> 0x0016 }
                r12.f142405d = r3     // Catch:{ Exception -> 0x0016 }
                java.lang.Object r13 = r13.fetchCatalogItemModel(r1, r12)     // Catch:{ Exception -> 0x0016 }
                if (r13 != r0) goto L_0x0038
                return r0
            L_0x0038:
                r5 = r13
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5     // Catch:{ Exception -> 0x0016 }
                com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r4 = r12.f142406e     // Catch:{ Exception -> 0x0016 }
                RF.k r6 = r12.f142408g     // Catch:{ Exception -> 0x0016 }
                RF.k r7 = r12.f142409h     // Catch:{ Exception -> 0x0016 }
                boolean r9 = r12.f142410i     // Catch:{ Exception -> 0x0016 }
                com.sugarcube.core.network.models.SmartaPlacement r10 = r12.f142411j     // Catch:{ Exception -> 0x0016 }
                r12.f142404c = r5     // Catch:{ Exception -> 0x0016 }
                r12.f142405d = r2     // Catch:{ Exception -> 0x0016 }
                r8 = 0
                r11 = r12
                java.lang.Object r13 = r4.v(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0016 }
                if (r13 != r0) goto L_0x0052
                return r0
            L_0x0052:
                com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r13 = r12.f142406e     // Catch:{ Exception -> 0x0016 }
                java.util.List r13 = r13.f142338u     // Catch:{ Exception -> 0x0016 }
                kotlin.jvm.internal.O<com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e> r0 = r12.f142412k     // Catch:{ Exception -> 0x0016 }
                T r0 = r0.f144348a     // Catch:{ Exception -> 0x0016 }
                if (r0 != 0) goto L_0x0065
                java.lang.String r0 = "downloadRequest"
                kotlin.jvm.internal.C17542s.z(r0)     // Catch:{ Exception -> 0x0016 }
                r0 = 0
                goto L_0x0067
            L_0x0065:
                com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.e) r0     // Catch:{ Exception -> 0x0016 }
            L_0x0067:
                r13.remove(r0)     // Catch:{ Exception -> 0x0016 }
                goto L_0x010b
            L_0x006c:
                com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.ERROR
                java.lang.String r1 = r13.getMessage()
                java.lang.String r4 = ""
                if (r1 != 0) goto L_0x0077
                r1 = r4
            L_0x0077:
                java.lang.String r13 = XH.C16816g.b(r13)
                if (r13 != 0) goto L_0x007e
                goto L_0x007f
            L_0x007e:
                r4 = r13
            L_0x007f:
                int[] r13 = iG.C17345b.f143477a
                int r0 = r0.ordinal()
                r13 = r13[r0]
                java.lang.String r0 = " "
                java.lang.String r5 = "Sugarcube"
                if (r13 == r3) goto L_0x00f6
                if (r13 == r2) goto L_0x00e0
                r2 = 3
                if (r13 == r2) goto L_0x00ca
                r2 = 4
                if (r13 == r2) goto L_0x00b4
                r2 = 5
                if (r13 != r2) goto L_0x00ae
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r1)
                r13.append(r0)
                r13.append(r4)
                java.lang.String r13 = r13.toString()
                android.util.Log.e(r5, r13)
                goto L_0x010b
            L_0x00ae:
                XH.t r13 = new XH.t
                r13.<init>()
                throw r13
            L_0x00b4:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r1)
                r13.append(r0)
                r13.append(r4)
                java.lang.String r13 = r13.toString()
                android.util.Log.w(r5, r13)
                goto L_0x010b
            L_0x00ca:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r1)
                r13.append(r0)
                r13.append(r4)
                java.lang.String r13 = r13.toString()
                android.util.Log.i(r5, r13)
                goto L_0x010b
            L_0x00e0:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r1)
                r13.append(r0)
                r13.append(r4)
                java.lang.String r13 = r13.toString()
                android.util.Log.d(r5, r13)
                goto L_0x010b
            L_0x00f6:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r1)
                r13.append(r0)
                r13.append(r4)
                java.lang.String r13 = r13.toString()
                android.util.Log.v(r5, r13)
            L_0x010b:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {1025}, m = "addModelForItem")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142413c;

        /* renamed from: d  reason: collision with root package name */
        Object f142414d;

        /* renamed from: e  reason: collision with root package name */
        Object f142415e;

        /* renamed from: f  reason: collision with root package name */
        Object f142416f;

        /* renamed from: g  reason: collision with root package name */
        Object f142417g;

        /* renamed from: h  reason: collision with root package name */
        Object f142418h;

        /* renamed from: i  reason: collision with root package name */
        Object f142419i;

        /* renamed from: j  reason: collision with root package name */
        Object f142420j;

        /* renamed from: k  reason: collision with root package name */
        boolean f142421k;

        /* renamed from: l  reason: collision with root package name */
        boolean f142422l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f142423m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142424n;

        /* renamed from: o  reason: collision with root package name */
        int f142425o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(EngineManagerImpl engineManagerImpl, C17164e<? super k> eVar) {
            super(eVar);
            this.f142424n = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142423m = obj;
            this.f142425o |= Integer.MIN_VALUE;
            return this.f142424n.v((CachedCatalogItem) null, (RF.k) null, (RF.k) null, false, false, (SmartaPlacement) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {814}, m = "duplicateInstance")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142426c;

        /* renamed from: d  reason: collision with root package name */
        Object f142427d;

        /* renamed from: e  reason: collision with root package name */
        Object f142428e;

        /* renamed from: f  reason: collision with root package name */
        Object f142429f;

        /* renamed from: g  reason: collision with root package name */
        Object f142430g;

        /* renamed from: h  reason: collision with root package name */
        Object f142431h;

        /* renamed from: i  reason: collision with root package name */
        Object f142432i;

        /* renamed from: j  reason: collision with root package name */
        int f142433j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f142434k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142435l;

        /* renamed from: m  reason: collision with root package name */
        int f142436m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(EngineManagerImpl engineManagerImpl, C17164e<? super l> eVar) {
            super(eVar);
            this.f142435l = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142434k = obj;
            this.f142436m |= Integer.MIN_VALUE;
            return this.f142435l.z((SmartaPlacement) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$launch$1", f = "EngineManagerImpl.kt", l = {1198}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142437c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f142438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f142438d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f142438d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142437c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f142438d;
                this.f142437c = 1;
                if (lVar.invoke(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {452}, m = "placeAllItemsInDesign")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142439c;

        /* renamed from: d  reason: collision with root package name */
        Object f142440d;

        /* renamed from: e  reason: collision with root package name */
        Object f142441e;

        /* renamed from: f  reason: collision with root package name */
        Object f142442f;

        /* renamed from: g  reason: collision with root package name */
        Object f142443g;

        /* renamed from: h  reason: collision with root package name */
        Object f142444h;

        /* renamed from: i  reason: collision with root package name */
        Object f142445i;

        /* renamed from: j  reason: collision with root package name */
        Object f142446j;

        /* renamed from: k  reason: collision with root package name */
        Object f142447k;

        /* renamed from: l  reason: collision with root package name */
        int f142448l;

        /* renamed from: m  reason: collision with root package name */
        int f142449m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f142450n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142451o;

        /* renamed from: p  reason: collision with root package name */
        int f142452p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(EngineManagerImpl engineManagerImpl, C17164e<? super n> eVar) {
            super(eVar);
            this.f142451o = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142450n = obj;
            this.f142452p |= Integer.MIN_VALUE;
            return this.f142451o.placeAllItemsInDesign((List<DesignItemInfo>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {281, 281}, m = "processSceneLoadingMetadata")
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142453c;

        /* renamed from: d  reason: collision with root package name */
        Object f142454d;

        /* renamed from: e  reason: collision with root package name */
        Object f142455e;

        /* renamed from: f  reason: collision with root package name */
        Object f142456f;

        /* renamed from: g  reason: collision with root package name */
        Object f142457g;

        /* renamed from: h  reason: collision with root package name */
        Object f142458h;

        /* renamed from: i  reason: collision with root package name */
        Object f142459i;

        /* renamed from: j  reason: collision with root package name */
        int f142460j;

        /* renamed from: k  reason: collision with root package name */
        int f142461k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f142462l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142463m;

        /* renamed from: n  reason: collision with root package name */
        int f142464n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(EngineManagerImpl engineManagerImpl, C17164e<? super o> eVar) {
            super(eVar);
            this.f142463m = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142462l = obj;
            this.f142464n |= Integer.MIN_VALUE;
            return this.f142463m.P((C17497c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {924}, m = "restoreIncompatibleVariantSwap")
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142465c;

        /* renamed from: d  reason: collision with root package name */
        Object f142466d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f142467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142468f;

        /* renamed from: g  reason: collision with root package name */
        int f142469g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(EngineManagerImpl engineManagerImpl, C17164e<? super p> eVar) {
            super(eVar);
            this.f142468f = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142467e = obj;
            this.f142469g |= Integer.MIN_VALUE;
            return this.f142468f.R(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$selectByHitTest$1$1", f = "EngineManagerImpl.kt", l = {660}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142470c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> f142471d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f142472e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RF.k f142473f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(nI.q<? super CachedCatalogItem, ? super RF.k, ? super C17164e<? super C16807N>, ? extends Object> qVar, CachedCatalogItem cachedCatalogItem, RF.k kVar, C17164e<? super q> eVar) {
            super(1, eVar);
            this.f142471d = qVar;
            this.f142472e = cachedCatalogItem;
            this.f142473f = kVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new q(this.f142471d, this.f142472e, this.f142473f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((q) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f142470c;
            if (i10 == 0) {
                y.b(obj);
                nI.q<CachedCatalogItem, RF.k, C17164e<? super C16807N>, Object> qVar = this.f142471d;
                CachedCatalogItem cachedCatalogItem = this.f142472e;
                RF.k kVar = this.f142473f;
                this.f142470c = 1;
                if (qVar.invoke(cachedCatalogItem, kVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$setInstanceSelected$1", f = "EngineManagerImpl.kt", l = {}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f142474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142475d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RF.k f142476e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(EngineManagerImpl engineManagerImpl, RF.k kVar, C17164e<? super r> eVar) {
            super(1, eVar);
            this.f142475d = engineManagerImpl;
            this.f142476e = kVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new r(this.f142475d, this.f142476e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((r) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f142474c == 0) {
                y.b(obj);
                this.f142475d.f142315A.setModelInstanceSelected(ObjectInstanceId.Companion.getKAll(), false);
                this.f142475d.f142315A.setModelInstanceSelected(this.f142476e.f(), true);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {232, 233, 234, 235, 236, 237, 241, 258, 266}, m = "start")
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142477c;

        /* renamed from: d  reason: collision with root package name */
        Object f142478d;

        /* renamed from: e  reason: collision with root package name */
        Object f142479e;

        /* renamed from: f  reason: collision with root package name */
        Object f142480f;

        /* renamed from: g  reason: collision with root package name */
        Object f142481g;

        /* renamed from: h  reason: collision with root package name */
        Object f142482h;

        /* renamed from: i  reason: collision with root package name */
        Object f142483i;

        /* renamed from: j  reason: collision with root package name */
        boolean f142484j;

        /* renamed from: k  reason: collision with root package name */
        boolean f142485k;

        /* renamed from: l  reason: collision with root package name */
        boolean f142486l;

        /* renamed from: m  reason: collision with root package name */
        boolean f142487m;

        /* renamed from: n  reason: collision with root package name */
        boolean f142488n;

        /* renamed from: o  reason: collision with root package name */
        boolean f142489o;

        /* renamed from: p  reason: collision with root package name */
        int f142490p;

        /* renamed from: q  reason: collision with root package name */
        int f142491q;

        /* renamed from: r  reason: collision with root package name */
        int f142492r;

        /* renamed from: s  reason: collision with root package name */
        int f142493s;

        /* renamed from: t  reason: collision with root package name */
        int f142494t;

        /* renamed from: u  reason: collision with root package name */
        int f142495u;

        /* renamed from: v  reason: collision with root package name */
        int f142496v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f142497w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142498x;

        /* renamed from: y  reason: collision with root package name */
        int f142499y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(EngineManagerImpl engineManagerImpl, C17164e<? super s> eVar) {
            super(eVar);
            this.f142498x = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142497w = obj;
            this.f142499y |= Integer.MIN_VALUE;
            return this.f142498x.f0((C17497c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {487}, m = "swapSelectedItemWith")
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142500c;

        /* renamed from: d  reason: collision with root package name */
        Object f142501d;

        /* renamed from: e  reason: collision with root package name */
        Object f142502e;

        /* renamed from: f  reason: collision with root package name */
        Object f142503f;

        /* renamed from: g  reason: collision with root package name */
        Object f142504g;

        /* renamed from: h  reason: collision with root package name */
        boolean f142505h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f142506i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142507j;

        /* renamed from: k  reason: collision with root package name */
        int f142508k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(EngineManagerImpl engineManagerImpl, C17164e<? super t> eVar) {
            super(eVar);
            this.f142507j = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142506i = obj;
            this.f142508k |= Integer.MIN_VALUE;
            return this.f142507j.swapSelectedItemWith((CachedCatalogItem) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {590}, m = "trackInstancesInScene")
    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142509c;

        /* renamed from: d  reason: collision with root package name */
        Object f142510d;

        /* renamed from: e  reason: collision with root package name */
        Object f142511e;

        /* renamed from: f  reason: collision with root package name */
        Object f142512f;

        /* renamed from: g  reason: collision with root package name */
        Object f142513g;

        /* renamed from: h  reason: collision with root package name */
        Object f142514h;

        /* renamed from: i  reason: collision with root package name */
        Object f142515i;

        /* renamed from: j  reason: collision with root package name */
        Object f142516j;

        /* renamed from: k  reason: collision with root package name */
        Object f142517k;

        /* renamed from: l  reason: collision with root package name */
        Object f142518l;

        /* renamed from: m  reason: collision with root package name */
        Object f142519m;

        /* renamed from: n  reason: collision with root package name */
        Object f142520n;

        /* renamed from: o  reason: collision with root package name */
        Object f142521o;

        /* renamed from: p  reason: collision with root package name */
        Object f142522p;

        /* renamed from: q  reason: collision with root package name */
        int f142523q;

        /* renamed from: r  reason: collision with root package name */
        int f142524r;

        /* renamed from: s  reason: collision with root package name */
        int f142525s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f142526t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142527u;

        /* renamed from: v  reason: collision with root package name */
        int f142528v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(EngineManagerImpl engineManagerImpl, C17164e<? super u> eVar) {
            super(eVar);
            this.f142527u = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142526t = obj;
            this.f142528v |= Integer.MIN_VALUE;
            return this.f142527u.l0((Map<ObjectInstanceId, ModelInstanceDetails>) null, (CachedCompiledComposition) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {1174}, m = "updateMultiviewInformation")
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142529c;

        /* renamed from: d  reason: collision with root package name */
        Object f142530d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f142531e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142532f;

        /* renamed from: g  reason: collision with root package name */
        int f142533g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(EngineManagerImpl engineManagerImpl, C17164e<? super v> eVar) {
            super(eVar);
            this.f142532f = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142531e = obj;
            this.f142533g |= Integer.MIN_VALUE;
            return this.f142532f.updateMultiviewInformation(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl", f = "EngineManagerImpl.kt", l = {1186}, m = "updateMultiviewInformation")
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f142534c;

        /* renamed from: d  reason: collision with root package name */
        Object f142535d;

        /* renamed from: e  reason: collision with root package name */
        boolean f142536e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142537f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ EngineManagerImpl f142538g;

        /* renamed from: h  reason: collision with root package name */
        int f142539h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(EngineManagerImpl engineManagerImpl, C17164e<? super w> eVar) {
            super(eVar);
            this.f142538g = engineManagerImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142537f = obj;
            this.f142539h |= Integer.MIN_VALUE;
            return this.f142538g.updateMultiviewInformation(false, this);
        }
    }

    public EngineManagerImpl(Context context, C13313e eVar, C17318v vVar, ConfigRepository configRepository, DecorateEngineController decorateEngineController, ModelManager modelManager, @DecorationScope Q q10, @DecorationScope Q q11, TouchManager touchManager) {
        Context context2 = context;
        C17318v vVar2 = vVar;
        ConfigRepository configRepository2 = configRepository;
        DecorateEngineController decorateEngineController2 = decorateEngineController;
        ModelManager modelManager2 = modelManager;
        Q q12 = q10;
        Q q13 = q11;
        TouchManager touchManager2 = touchManager;
        C17542s.j(context2, "context");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(vVar2, "decorateAnalytics");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(decorateEngineController2, "engineController");
        C17542s.j(modelManager2, "modelManager");
        C17542s.j(q12, "decorateScope");
        C17542s.j(q13, "backgroundScope");
        C17542s.j(touchManager2, "touchManager");
        this.f142318a = context2;
        this.f142319b = vVar2;
        this.f142320c = configRepository2;
        this.f142321d = decorateEngineController2;
        this.f142322e = modelManager2;
        this.f142323f = q12;
        this.f142324g = q13;
        this.f142325h = touchManager2;
        this.f142326i = new C13549b((Integer) null, (Integer) null, false, (Boolean) null, (Boolean) null, eVar.i(), 27, (DefaultConstructorMarker) null);
        RF.j jVar = RF.j.FRONT;
        this.f142330m = jVar;
        this.f142331n = jVar;
        this.f142334q = C5667g.f26701b.b();
        this.f142335r = C17351h.UNSPECIFIED;
        this.f142337t = new ArrayList();
        this.f142338u = new ArrayList();
        this.f142342y = C16343z.b((F0) null, 1, (Object) null);
        this.f142343z = C16343z.b((F0) null, 1, (Object) null);
        this.f142315A = getEngineController().e();
        touchManager2.registerTouchInteractions(this);
        Priority priority = Priority.DEBUG;
        String str = "Initializing Decorate Engine Manager " + this;
        str = str == null ? "" : str;
        int i10 = C17347d.f143479a[priority.ordinal()];
        Class<EngineManagerImpl> cls = EngineManagerImpl.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            Log.v(o12.length() != 0 ? C15854t.P0(o12, "Kt") : name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            Log.d(o13.length() != 0 ? C15854t.P0(o13, "Kt") : name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            Log.i(o14.length() != 0 ? C15854t.P0(o14, "Kt") : name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            Log.w(o15.length() != 0 ? C15854t.P0(o15, "Kt") : name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            Log.e(o16.length() != 0 ? C15854t.P0(o16, "Kt") : name5, str + " " + "");
        } else {
            throw new XH.t();
        }
        getEngineController().i(new a(this));
        Q q14 = q11;
        F0 unused = C16314k.d(q14, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(q14, (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
        this.f142317C = "";
    }

    private final void A() {
        restorePreviousViewport();
        Y(false);
    }

    private final void B() {
        C17597b bVar = this.f142339v;
        if (bVar != null) {
            ModelScreenTransform modelScreenTransform = this.f142315A.getModelScreenTransform(bVar.e().f());
            IDecorateEngine iDecorateEngine = this.f142315A;
            ObjectInstanceId f10 = bVar.e().f();
            ModelScreenTransform modelScreenTransform2 = new ModelScreenTransform();
            modelScreenTransform2.isModelRolled90 = Boolean.valueOf(!C17542s.e(modelScreenTransform.isModelRolled90, Boolean.TRUE));
            C16807N n10 = C16807N.f139792a;
            iDecorateEngine.moveModelInstance(f10, modelScreenTransform2);
            X(true);
            return;
        }
        Log.w("EngineManagerImpl", "flipInstance(...) failed because there is no selected instance");
    }

    private final void C(RF.k kVar) {
        Z(kVar, false);
        if (!this.f142341x) {
            ObjectInstanceId instanceParent = this.f142315A.getInstanceParent(kVar.f());
            if (!instanceParent.isModel()) {
                instanceParent = kVar.f();
            }
            FlyCamOrbitParams flyCamOrbitParams = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
            flyCamOrbitParams.elevationNorm = kVar.e();
            flyCamOrbitParams.radiusNorm = 0.2f;
            this.f142315A.flyCamToPointOfInterest(instanceParent, flyCamOrbitParams);
            Y(true);
        }
    }

    private final SceneLayout D(CachedCatalogItem cachedCatalogItem) {
        RF.o oVar = new RF.o((String) null, 1, (DefaultConstructorMarker) null);
        RF.o.k(oVar, cachedCatalogItem, ObjectInstanceId.Companion.getKNone(), (ModelScreenTransform) null, 4, (Object) null);
        return oVar.o();
    }

    private final C5667g F(RF.k kVar) {
        if (kVar == null) {
            return null;
        }
        ModelScreenTransform modelScreenTransform = this.f142315A.getModelScreenTransform(kVar.f());
        return C5667g.d(C5668h.a(modelScreenTransform.screenX, modelScreenTransform.screenY));
    }

    private final Float G(RF.k kVar) {
        if (kVar != null) {
            return Float.valueOf(this.f142315A.getModelScreenTransform(kVar.f()).getYawDegrees());
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Float] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String H(iG.C17351h r5) {
        /*
            r4 = this;
            int[] r0 = com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.f.f142378b
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L_0x0030
            r0 = 2
            if (r5 == r0) goto L_0x0012
            java.lang.String r5 = ""
            goto L_0x0075
        L_0x0012:
            mG.b r5 = r4.f142339v
            if (r5 == 0) goto L_0x001a
            RF.k r1 = r5.e()
        L_0x001a:
            java.lang.Float r5 = r4.G(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rotation: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L_0x0075
        L_0x0030:
            mG.b r5 = r4.f142339v
            if (r5 == 0) goto L_0x0039
            RF.k r5 = r5.e()
            goto L_0x003a
        L_0x0039:
            r5 = r1
        L_0x003a:
            o1.g r5 = r4.F(r5)
            if (r5 == 0) goto L_0x004d
            long r2 = r5.v()
            float r0 = o1.C5667g.m(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r5 == 0) goto L_0x005c
            long r1 = r5.v()
            float r5 = o1.C5667g.n(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L_0x005c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "position.x: "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ", position.y: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.H(iG.h):java.lang.String");
    }

    private final C17597b I(RF.k kVar) {
        boolean z10 = !this.f142315A.getInstanceParent(kVar.f()).isWall();
        ModelScreenTransform modelScreenTransform = this.f142315A.getModelScreenTransform(kVar.f());
        if (!modelScreenTransform.isValid()) {
            modelScreenTransform = null;
        }
        return new C17597b(kVar.d().getId(), kVar, z10, modelScreenTransform != null ? modelScreenTransform.getYawDegrees() : 0.0f);
    }

    private final void K(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(this.f142323f, (C17168i) null, (T) null, new m(lVar, (C17164e<? super m>) null), 3, (Object) null);
    }

    private final void L(String str) {
        Log.d("EngineManagerImpl", str);
    }

    private final void M() {
        C17597b bVar = this.f142339v;
        if (bVar != null) {
            ModelScreenTransform modelScreenTransform = this.f142315A.getModelScreenTransform(bVar.e().f());
            IDecorateEngine iDecorateEngine = this.f142315A;
            ObjectInstanceId f10 = bVar.e().f();
            ModelScreenTransform modelScreenTransform2 = new ModelScreenTransform();
            modelScreenTransform2.isModelMirrored = Boolean.valueOf(!C17542s.e(modelScreenTransform.isModelMirrored, Boolean.TRUE));
            C16807N n10 = C16807N.f139792a;
            iDecorateEngine.moveModelInstance(f10, modelScreenTransform2);
            X(true);
            return;
        }
        Log.w("EngineManagerImpl", "mirrorInstance(...) failed because there is no selected instance");
    }

    private final void N(long j10, B b10) {
        C17597b bVar = this.f142339v;
        if (bVar != null) {
            if (this.f142333p == null) {
                this.f142333p = this.f142315A.getModelScreenTransform(bVar.e().f());
            }
            ModelScreenTransform modelScreenTransform = this.f142333p;
            if (modelScreenTransform != null) {
                long h10 = b10.h();
                this.f142315A.moveModelInstance(bVar.e().f(), new ModelScreenTransform(modelScreenTransform.screenX + (C5667g.m(h10) - C5667g.m(j10)), modelScreenTransform.screenY + (C5667g.n(h10) - C5667g.n(j10)), true, true));
                e0(I(bVar.e()));
                V(C17351h.MOVE_INSTANCE);
                X(true);
                return;
            }
            return;
        }
        Log.w("EngineManagerImpl", "moveInstance(...) failed because there is no selected instance");
    }

    /* access modifiers changed from: private */
    public final void O(DecorateEngineController.a aVar) {
        E().onEngineError(aVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(kG.C17497c r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.o
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$o r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.o) r2
            int r3 = r2.f142464n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f142464n = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$o r2 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$o
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f142462l
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f142464n
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0083
            if (r5 == r8) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r1 = r2.f142459i
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = (com.sugarcube.app.base.data.feature.ConfigRepository) r1
            java.lang.Object r1 = r2.f142458h
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = (com.sugarcube.app.base.data.feature.ConfigRepository) r1
            java.lang.Object r1 = r2.f142457g
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            java.lang.Object r4 = r2.f142456f
            com.sugarcube.app.base.data.database.Scene r4 = (com.sugarcube.app.base.data.database.Scene) r4
            java.lang.Object r4 = r2.f142455e
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r2.f142454d
            kG.c r4 = (kG.C17497c) r4
            java.lang.Object r2 = r2.f142453c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r2
            XH.y.b(r3)
            goto L_0x00e7
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0056:
            int r1 = r2.f142461k
            int r5 = r2.f142460j
            java.lang.Object r9 = r2.f142459i
            com.sugarcube.app.base.data.feature.ConfigRepository r9 = (com.sugarcube.app.base.data.feature.ConfigRepository) r9
            java.lang.Object r10 = r2.f142458h
            com.sugarcube.app.base.data.feature.ConfigRepository r10 = (com.sugarcube.app.base.data.feature.ConfigRepository) r10
            java.lang.Object r11 = r2.f142457g
            com.sugarcube.app.base.data.database.Scene r11 = (com.sugarcube.app.base.data.database.Scene) r11
            java.lang.Object r12 = r2.f142456f
            com.sugarcube.app.base.data.database.Scene r12 = (com.sugarcube.app.base.data.database.Scene) r12
            java.lang.Object r13 = r2.f142455e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f142454d
            kG.c r14 = (kG.C17497c) r14
            java.lang.Object r15 = r2.f142453c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r15 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r15
            XH.y.b(r3)
            r16 = r3
            r3 = r1
            r1 = r11
            r11 = r10
            r10 = r9
            r9 = r5
            r5 = r16
            goto L_0x00c1
        L_0x0083:
            XH.y.b(r3)
            r17.n0(r18)
            com.sugarcube.app.base.data.database.Scene r12 = r18.g()
            boolean r3 = r12.isHela()
            if (r3 == 0) goto L_0x0097
            RF.j r3 = RF.j.DOLLHOUSE_1
            r0.f142330m = r3
        L_0x0097:
            com.sugarcube.app.base.data.feature.ConfigRepository r9 = r0.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFScenes r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFScenes.INSTANCE
            r2.f142453c = r0
            r5 = r18
            r2.f142454d = r5
            r2.f142455e = r1
            r2.f142456f = r12
            r2.f142457g = r12
            r2.f142458h = r9
            r2.f142459i = r9
            r2.f142460j = r7
            r2.f142461k = r7
            r2.f142464n = r8
            java.lang.Object r3 = r9.get(r3, r2)
            if (r3 != r4) goto L_0x00b8
            return r4
        L_0x00b8:
            r15 = r0
            r13 = r1
            r14 = r5
            r10 = r9
            r11 = r10
            r1 = r12
            r5 = r3
            r3 = r7
            r9 = r3
        L_0x00c1:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00f2
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFCompositions r5 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFCompositions.INSTANCE
            r2.f142453c = r15
            r2.f142454d = r14
            r2.f142455e = r13
            r2.f142456f = r12
            r2.f142457g = r1
            r2.f142458h = r11
            r2.f142459i = r10
            r2.f142460j = r9
            r2.f142461k = r3
            r2.f142464n = r6
            java.lang.Object r3 = r10.get(r5, r2)
            if (r3 != r4) goto L_0x00e6
            return r4
        L_0x00e6:
            r2 = r15
        L_0x00e7:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00f1
            r7 = r8
            goto L_0x00f3
        L_0x00f1:
            r15 = r2
        L_0x00f2:
            r2 = r15
        L_0x00f3:
            boolean r1 = r1.getHasGltf()
            if (r1 == 0) goto L_0x00fe
            if (r7 == 0) goto L_0x00fe
            com.sugarcube.decorate_engine.SceneLayoutFormat r1 = com.sugarcube.decorate_engine.SceneLayoutFormat.Minimal3D
            goto L_0x0100
        L_0x00fe:
            com.sugarcube.decorate_engine.SceneLayoutFormat r1 = com.sugarcube.decorate_engine.SceneLayoutFormat.Legacy2D
        L_0x0100:
            r2.f142329l = r1
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.P(kG.c, dI.e):java.lang.Object");
    }

    private final Object Q(RF.k kVar, C17164e<? super C16807N> eVar) {
        if (kVar == null) {
            return C16807N.f139792a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f142337t) {
            if (!C17542s.e((RF.k) next, kVar)) {
                arrayList.add(next);
            }
        }
        c0(arrayList);
        this.f142315A.removeModelInstance(kVar.f());
        X(true);
        e0((C17597b) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.p
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$p r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.p) r0
            int r1 = r0.f142469g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f142469g = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$p r0 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$p
            r0.<init>(r11, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r7.f142467e
            java.lang.Object r10 = eI.C17187b.f()
            int r1 = r7.f142469g
            r2 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r12 = r7.f142466d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r7.f142465c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r12 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r12
            XH.y.b(r0)
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003b:
            XH.y.b(r0)
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r11.f142340w
            r7.f142465c = r11
            r7.f142466d = r12
            r7.f142469g = r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            r1 = r11
            r2 = r0
            java.lang.Object r12 = x(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r10) goto L_0x0056
            return r10
        L_0x0056:
            r12 = r11
        L_0x0057:
            r0 = 0
            r12.f142340w = r0
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.R(dI.e):java.lang.Object");
    }

    private final void S(float f10, boolean z10) {
        C17597b bVar = this.f142339v;
        if (bVar != null) {
            this.f142315A.moveModelInstance(bVar.e().f(), new ModelScreenTransform(f10, z10, false));
            e0(I(bVar.e()));
            V(C17351h.ROTATE_INSTANCE);
            X(true);
            E().onTransformApplied(this.f142315A.getModelScreenTransform(bVar.e().f()));
            return;
        }
        Log.w("EngineManagerImpl", "rotateInstance(...) failed because there is no selected instance");
    }

    static /* synthetic */ void T(EngineManagerImpl engineManagerImpl, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        engineManagerImpl.S(f10, z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: RF.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: RF.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: RF.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: RF.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final RF.k U(long r7) {
        /*
            r6 = this;
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r6.f142315A
            float r1 = o1.C5667g.m(r7)
            float r2 = o1.C5667g.n(r7)
            r4 = 4
            r5 = 0
            r3 = 0
            com.sugarcube.decorate_engine.ObjectInstanceId r7 = com.sugarcube.decorate.internal.shared.IDecorateEngine.a.a(r0, r1, r2, r3, r4, r5)
            java.util.List<com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e> r8 = r6.f142338u
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0019:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r8.next()
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.e) r0
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r0.a()
            RF.k r3 = r0.b()
            nI.q r0 = r0.c()
            com.sugarcube.decorate_engine.ObjectInstanceId r4 = r3.f()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 == 0) goto L_0x0019
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$q r7 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$q
            r7.<init>(r0, r2, r3, r1)
            r6.K(r7)
            return r1
        L_0x0045:
            java.util.List<RF.k> r8 = r6.f142337t
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r8.next()
            r2 = r0
            RF.k r2 = (RF.k) r2
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.f()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r2 == 0) goto L_0x004d
            r1 = r0
        L_0x0065:
            RF.k r1 = (RF.k) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.U(long):RF.k");
    }

    /* access modifiers changed from: private */
    public final void V(C17351h hVar) {
        if (this.f142335r != hVar) {
            this.f142335r = hVar;
            if (hVar != C17351h.UNSPECIFIED) {
                d0(a.f142540c.b(hVar));
            }
        }
    }

    private final void W(RF.j jVar) {
        RF.j jVar2 = this.f142332o;
        this.f142332o = jVar;
        this.f142315A.flyCamToFixedView(jVar != null ? jVar.b() : RF.j.FRONT.b());
        if (jVar2 != jVar) {
            E().onMultiviewInformationChanged(this.f142315A.getFixedViewCount());
        }
    }

    private final void X(boolean z10) {
        boolean z11 = this.f142327j;
        this.f142327j = z10;
        if (z11 != z10) {
            E().onDesignDirtyChanged(z10);
        }
    }

    private final void Z(RF.k kVar, boolean z10) {
        e0(I(kVar));
        disableMagicEraser();
        K(new r(this, kVar, (C17164e<? super r>) null));
    }

    private final void b0(boolean z10) {
        boolean z11 = this.f142328k;
        this.f142328k = z10;
        if (z11 != z10) {
            E().onMagicEraserChanged(z10, this.f142315A.getEngineEraserCounts());
        }
    }

    private final void c0(List<RF.k> list) {
        List<RF.k> list2 = this.f142337t;
        this.f142337t = list;
        if (!C17542s.e(list2, list)) {
            E().onModelListUpdated(this.f142337t);
        }
    }

    /* access modifiers changed from: private */
    public final void d0(a aVar) {
        if (aVar != null) {
            this.f142336s = aVar;
            E().onProcessedGesture(aVar);
            m0(aVar);
        }
    }

    private final void e0(C17597b bVar) {
        C17597b bVar2 = this.f142339v;
        this.f142339v = bVar;
        if (!C17542s.e(bVar2 != null ? bVar2.e() : null, bVar != null ? bVar.e() : null)) {
            Priority priority = Priority.DEBUG;
            String str = "setting selected intance " + bVar;
            if (str == null) {
                str = "";
            }
            int i10 = C17348e.f143480a[priority.ordinal()];
            Class<EngineManagerImpl> cls = EngineManagerImpl.class;
            if (i10 == 1) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                Log.v(name, str + " " + "");
            } else if (i10 == 2) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                Log.d(name2, str + " " + "");
            } else if (i10 == 3) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                Log.i(name3, str + " " + "");
            } else if (i10 == 4) {
                String name4 = cls.getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                Log.w(name4, str + " " + "");
            } else if (i10 == 5) {
                String name5 = cls.getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                Log.e(name5, str + " " + "");
            } else {
                throw new XH.t();
            }
            E().onSelectedInstanceChanged(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g0() {
        /*
            r1 = this;
            mG.b r0 = r1.f142339v
            if (r0 == 0) goto L_0x000f
            RF.k r0 = r0.e()
            if (r0 == 0) goto L_0x000f
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r0.d()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r1.f142340w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.g0():void");
    }

    private final void h0(long j10) {
        IDecorateEngine iDecorateEngine = this.f142315A;
        iDecorateEngine.execEraserOp(EraserPickOp.Toggle, iDecorateEngine.eraserPick(C5667g.m(j10), C5667g.n(j10)));
        X(true);
        o0();
    }

    private final void i0(RF.k kVar, boolean z10) {
        RF.k e10;
        Priority priority = Priority.DEBUG;
        String str = "setSelection: instance = " + kVar;
        if (str == null) {
            str = "";
        }
        int i10 = C17350g.f143482a[priority.ordinal()];
        Class<EngineManagerImpl> cls = EngineManagerImpl.class;
        ObjectInstanceId objectInstanceId = null;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new XH.t();
        }
        if (kVar != null) {
            ObjectInstanceId f10 = kVar.f();
            C17597b bVar = this.f142339v;
            if (!(bVar == null || (e10 = bVar.e()) == null)) {
                objectInstanceId = e10.f();
            }
            if (!C17542s.e(f10, objectInstanceId) || z10) {
                Z(kVar, z10);
                return;
            }
        }
        y(true);
    }

    private final Object j0(CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, RF.k kVar, boolean z10, C17164e<? super RF.k> eVar) {
        RF.k kVar2 = new RF.k(objectInstanceId, cachedCatalogItem);
        if (kVar != null) {
            Iterator<RF.k> it = this.f142337t.iterator();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (C17542s.e(kVar.f(), it.next().f())) {
                    break;
                } else {
                    i11++;
                }
            }
            Integer e10 = kotlin.coroutines.jvm.internal.b.e(i11);
            if (e10.intValue() <= -1) {
                e10 = null;
            }
            if (e10 != null) {
                int intValue = e10.intValue();
                Iterable iterable = this.f142337t;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (Object next : iterable) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        C16877v.x();
                    }
                    RF.k kVar3 = (RF.k) next;
                    if (i10 == intValue) {
                        kVar3 = kVar2;
                    }
                    arrayList.add(kVar3);
                    i10 = i12;
                }
                c0(C16877v.n());
                c0(arrayList);
            }
        } else if (!z10) {
            List<RF.k> list = this.f142337t;
            Iterable iterable2 = list;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C17542s.e(((RF.k) it2.next()).f(), objectInstanceId)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            c0(C16877v.W0(list, kVar2));
        }
        return kVar2;
    }

    static /* synthetic */ Object k0(EngineManagerImpl engineManagerImpl, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, RF.k kVar, boolean z10, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        RF.k kVar2 = kVar;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return engineManagerImpl.j0(cachedCatalogItem, objectInstanceId, kVar2, z10, eVar);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0149 A[SYNTHETIC] */
    public final java.lang.Object l0(java.util.Map<com.sugarcube.decorate_engine.ObjectInstanceId, com.sugarcube.decorate_engine.ModelInstanceDetails> r28, com.sugarcube.app.base.data.database.CachedCompiledComposition r29, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r27 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.u
            if (r3 == 0) goto L_0x001b
            r3 = r2
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$u r3 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.u) r3
            int r4 = r3.f142528v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.f142528v = r4
            r4 = r27
            goto L_0x0022
        L_0x001b:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$u r3 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$u
            r4 = r27
            r3.<init>(r4, r2)
        L_0x0022:
            java.lang.Object r5 = r3.f142526t
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r3.f142528v
            r8 = 1
            if (r7 == 0) goto L_0x0078
            if (r7 != r8) goto L_0x0070
            int r0 = r3.f142523q
            java.lang.Object r1 = r3.f142522p
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r2 = r3.f142521o
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r3.f142520n
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r3.f142519m
            com.sugarcube.decorate_engine.ModelInstanceDetails r2 = (com.sugarcube.decorate_engine.ModelInstanceDetails) r2
            java.lang.Object r7 = r3.f142518l
            com.sugarcube.decorate_engine.ObjectInstanceId r7 = (com.sugarcube.decorate_engine.ObjectInstanceId) r7
            java.lang.Object r10 = r3.f142517k
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r3.f142516j
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r3.f142515i
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r3.f142514h
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r3.f142513g
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r13 = r3.f142512f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r3.f142511e
            com.sugarcube.app.base.data.database.CachedCompiledComposition r14 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r14
            java.lang.Object r15 = r3.f142510d
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r8 = r3.f142509c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r8 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r8
            XH.y.b(r5)
            r5 = r15
            r15 = 1
            goto L_0x0111
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0078:
            XH.y.b(r5)
            if (r0 == 0) goto L_0x014c
            if (r1 != 0) goto L_0x0081
            goto L_0x014c
        L_0x0081:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r7 = r28.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r8 = r4
            r12 = r5
            r10 = r7
            r5 = 0
            r7 = r3
            r3 = r2
            r2 = r1
            r1 = r0
        L_0x0096:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0149
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r13 = r11.getKey()
            com.sugarcube.decorate_engine.ObjectInstanceId r13 = (com.sugarcube.decorate_engine.ObjectInstanceId) r13
            java.lang.Object r14 = r11.getValue()
            com.sugarcube.decorate_engine.ModelInstanceDetails r14 = (com.sugarcube.decorate_engine.ModelInstanceDetails) r14
            java.util.Map r15 = r2.getCachedCatalogItems()
            int r16 = r14.getProductId()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r16)
            java.lang.Object r9 = r15.get(r9)
            com.sugarcube.app.base.data.database.CachedCatalogItem r9 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r9
            if (r9 == 0) goto L_0x0146
            r7.f142509c = r8
            r7.f142510d = r0
            r7.f142511e = r2
            r7.f142512f = r3
            r7.f142513g = r12
            r7.f142514h = r1
            r7.f142515i = r10
            r7.f142516j = r11
            r7.f142517k = r11
            r7.f142518l = r13
            r7.f142519m = r14
            r7.f142520n = r9
            r7.f142521o = r9
            r7.f142522p = r9
            r7.f142523q = r5
            r11 = 0
            r7.f142524r = r11
            r7.f142525s = r11
            r15 = 1
            r7.f142528v = r15
            r19 = 0
            r20 = 0
            r22 = 12
            r23 = 0
            r16 = r8
            r17 = r9
            r18 = r13
            r21 = r7
            java.lang.Object r11 = k0(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r11 != r6) goto L_0x00ff
            return r6
        L_0x00ff:
            r11 = r1
            r1 = r9
            r24 = r5
            r5 = r0
            r0 = r24
            r25 = r14
            r14 = r2
            r2 = r25
            r26 = r13
            r13 = r3
            r3 = r7
            r7 = r26
        L_0x0111:
            boolean r9 = r1.isCombinableRoot()
            if (r9 == 0) goto L_0x013b
            int r9 = r2.getProductId()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r9)
            java.lang.Object r9 = r12.get(r9)
            com.sugarcube.decorate_engine.SceneLayout r9 = (com.sugarcube.decorate_engine.SceneLayout) r9
            if (r9 != 0) goto L_0x0136
            com.sugarcube.decorate_engine.SceneLayout r9 = r8.D(r1)
            int r1 = r2.getProductId()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.e(r1)
            r12.put(r1, r9)
        L_0x0136:
            com.sugarcube.decorate.internal.shared.IDecorateEngine r1 = r8.f142315A
            r1.addCompoundModelInstance(r9, r7)
        L_0x013b:
            r7 = r3
            r1 = r11
            r3 = r13
            r2 = r14
            r24 = r5
            r5 = r0
            r0 = r24
            goto L_0x0096
        L_0x0146:
            r15 = 1
            goto L_0x0096
        L_0x0149:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x014c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                trackInstancesInScene(...) failed because there is nothing to track (instanceInfoMap="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", \n                cachedCompiledComposition="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "\n                "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = HJ.C15854t.m(r0)
            java.lang.String r1 = "EngineManagerImpl"
            android.util.Log.w(r1, r0)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.l0(java.util.Map, com.sugarcube.app.base.data.database.CachedCompiledComposition, dI.e):java.lang.Object");
    }

    private final void m0(a aVar) {
        C17351h a10 = aVar.a();
        if (aVar.b() != C17352i.ENDED) {
            this.f142317C = H(a10);
            return;
        }
        String H10 = H(a10);
        int i10 = f.f142378b[a10.ordinal()];
        if (i10 == 1) {
            this.f142319b.E(this.f142317C, H10);
        } else if (i10 == 2) {
            this.f142319b.b0(this.f142317C, H10);
        }
    }

    private final void n0(C17497c cVar) {
        this.f142326i = C13549b.b(this.f142326i, Integer.valueOf(cVar.g().getSceneId()), Integer.valueOf(cVar.c().getComposition().getCompositionId()), cVar.g().getHasGltf(), Boolean.valueOf(cVar.c().getCompiledComposition().getHasGltfComposition()), (Boolean) null, (String) null, 48, (Object) null);
    }

    private final void o0() {
        if (!this.f142341x) {
            E().onMagicEraserChanged(this.f142328k, this.f142315A.getEngineEraserCounts());
        }
    }

    private final void p0(long j10) {
        if (this.f142341x) {
            FlyCamOrbitParams flyCamOrbitParams = this.f142315A.getFlyCamOrbitParams();
            flyCamOrbitParams.elevationNorm += C5667g.n(j10) * 0.001f;
            flyCamOrbitParams.rotationNorm += C5667g.m(j10) * -0.001f;
            this.f142315A.setFlyCamOrbitParams(flyCamOrbitParams);
            V(C17351h.PAN_ORBIT);
        }
    }

    private final void q0(B b10) {
        PanZoomRegion panZoomRegion = this.f142315A.getPanZoomRegion();
        if (!panZoomRegion.isUnzoomed()) {
            long h10 = b10.h();
            long k10 = b10.k();
            panZoomRegion.movePixelCenter(C5667g.m(k10) - C5667g.m(h10), C5667g.n(k10) - C5667g.n(h10));
            this.f142315A.setPanZoomRegion(panZoomRegion);
            E().onPanZoomRegionUpdated(panZoomRegion);
            V(C17351h.PAN_REGION);
        }
    }

    private final void r0(float f10) {
        int i10 = 1;
        boolean z10 = f10 > 1.0f;
        FlyCamOrbitParams flyCamOrbitParams = this.f142315A.getFlyCamOrbitParams();
        if (z10) {
            i10 = -1;
        }
        flyCamOrbitParams.radiusNorm += ((float) i10) * 0.04f;
        this.f142315A.setFlyCamOrbitParams(flyCamOrbitParams);
        V(C17351h.ZOOM_ORBIT);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(com.sugarcube.app.base.data.database.CachedCatalogItem r10, com.sugarcube.decorate_engine.ObjectInstanceId r11, RF.k r12, boolean r13, com.sugarcube.core.network.models.SmartaPlacement r14, dI.C17164e<? super RF.k> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.g
            if (r0 == 0) goto L_0x0014
            r0 = r15
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$g r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.g) r0
            int r1 = r0.f142389m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f142389m = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$g r0 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$g
            r0.<init>(r9, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f142387k
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f142389m
            r8 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 != r8) goto L_0x0047
            java.lang.Object r10 = r6.f142385i
            com.sugarcube.decorate_engine.ObjectInstanceId r10 = (com.sugarcube.decorate_engine.ObjectInstanceId) r10
            java.lang.Object r10 = r6.f142384h
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r6.f142383g
            com.sugarcube.core.network.models.SmartaPlacement r10 = (com.sugarcube.core.network.models.SmartaPlacement) r10
            java.lang.Object r10 = r6.f142382f
            RF.k r10 = (RF.k) r10
            java.lang.Object r10 = r6.f142381e
            com.sugarcube.decorate_engine.ObjectInstanceId r10 = (com.sugarcube.decorate_engine.ObjectInstanceId) r10
            java.lang.Object r10 = r6.f142380d
            com.sugarcube.app.base.data.database.CachedCatalogItem r10 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r10
            java.lang.Object r10 = r6.f142379c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r10 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r10
            XH.y.b(r0)
            goto L_0x007f
        L_0x0047:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004f:
            XH.y.b(r0)
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r9.f142315A
            com.sugarcube.decorate_engine.ModelScreenTransform r4 = new com.sugarcube.decorate_engine.ModelScreenTransform
            r4.<init>()
            r1 = r10
            r2 = r13
            r3 = r11
            r5 = r14
            com.sugarcube.decorate_engine.ObjectInstanceId r3 = r0.addModelInstance(r1, r2, r3, r4, r5)
            r6.f142379c = r9
            r6.f142380d = r10
            r6.f142381e = r11
            r6.f142382f = r12
            r6.f142383g = r14
            r6.f142384h = r15
            r6.f142385i = r3
            r6.f142386j = r13
            r6.f142389m = r8
            r5 = 0
            r1 = r9
            r2 = r10
            r4 = r12
            java.lang.Object r0 = r1.j0(r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x007e
            return r7
        L_0x007e:
            r10 = r9
        L_0x007f:
            RF.k r0 = (RF.k) r0
            r10.X(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.s(com.sugarcube.app.base.data.database.CachedCatalogItem, com.sugarcube.decorate_engine.ObjectInstanceId, RF.k, boolean, com.sugarcube.core.network.models.SmartaPlacement, dI.e):java.lang.Object");
    }

    private final void s0(long j10, float f10) {
        if (C5667g.j(this.f142334q, C5667g.f26701b.b())) {
            this.f142334q = j10;
        }
        PanZoomRegion panZoomRegion = this.f142315A.getPanZoomRegion();
        MotionEvent.PointerCoords d10 = sF.g.d(this.f142334q);
        if (panZoomRegion.isUnzoomed()) {
            panZoomRegion.setPixelCenterCoords(d10);
            panZoomRegion.zoom = 1.0f;
        } else {
            MotionEvent.PointerCoords pixelCenterCoords = panZoomRegion.getPixelCenterCoords();
            panZoomRegion.movePixelCenter(-(pixelCenterCoords.x - d10.x), -(pixelCenterCoords.y - d10.y));
        }
        panZoomRegion.zoom = C17978n.l(panZoomRegion.zoom * f10, 1.0f, 2.0f);
        this.f142315A.setPanZoomRegion(panZoomRegion);
        E().onPanZoomRegionUpdated(panZoomRegion);
        V(C17351h.ZOOM_REGION);
    }

    static /* synthetic */ Object t(EngineManagerImpl engineManagerImpl, CachedCatalogItem cachedCatalogItem, ObjectInstanceId objectInstanceId, RF.k kVar, boolean z10, SmartaPlacement smartaPlacement, C17164e eVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return engineManagerImpl.s(cachedCatalogItem, objectInstanceId, kVar, z10, smartaPlacement, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(com.sugarcube.app.base.data.database.CachedCatalogItem r25, RF.k r26, boolean r27, com.sugarcube.decorate_engine.ModelScreenTransform r28, com.sugarcube.core.network.models.SmartaPlacement r29, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r0 = r30
            boolean r1 = r0 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.h
            if (r1 == 0) goto L_0x0022
            r1 = r0
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$h r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.h) r1
            int r2 = r1.f142399l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0022
            int r2 = r2 - r3
            r1.f142399l = r2
        L_0x0020:
            r7 = r1
            goto L_0x0028
        L_0x0022:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$h r1 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$h
            r1.<init>(r8, r0)
            goto L_0x0020
        L_0x0028:
            java.lang.Object r1 = r7.f142397j
            java.lang.Object r14 = eI.C17187b.f()
            int r2 = r7.f142399l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0084
            if (r2 == r4) goto L_0x0067
            if (r2 != r3) goto L_0x005f
            boolean r0 = r7.f142396i
            java.lang.Object r2 = r7.f142395h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r7.f142394g
            com.sugarcube.core.network.models.SmartaPlacement r2 = (com.sugarcube.core.network.models.SmartaPlacement) r2
            java.lang.Object r3 = r7.f142393f
            com.sugarcube.decorate_engine.ModelScreenTransform r3 = (com.sugarcube.decorate_engine.ModelScreenTransform) r3
            java.lang.Object r4 = r7.f142392e
            RF.k r4 = (RF.k) r4
            java.lang.Object r5 = r7.f142391d
            com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
            java.lang.Object r6 = r7.f142390c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r6 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r6
            XH.y.b(r1)
            r20 = r0
            r21 = r2
            r12 = r3
            r19 = r4
            r9 = r5
            goto L_0x00e9
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            java.lang.Object r0 = r7.f142395h
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r7.f142394g
            com.sugarcube.core.network.models.SmartaPlacement r0 = (com.sugarcube.core.network.models.SmartaPlacement) r0
            java.lang.Object r0 = r7.f142393f
            com.sugarcube.decorate_engine.ModelScreenTransform r0 = (com.sugarcube.decorate_engine.ModelScreenTransform) r0
            java.lang.Object r2 = r7.f142392e
            RF.k r2 = (RF.k) r2
            java.lang.Object r2 = r7.f142391d
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r2 = r7.f142390c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r2
            XH.y.b(r1)
            r12 = r0
            goto L_0x00b1
        L_0x0084:
            XH.y.b(r1)
            boolean r1 = r25.isModelCached()
            if (r1 == 0) goto L_0x00bf
            r7.f142390c = r8
            r7.f142391d = r9
            r7.f142392e = r10
            r7.f142393f = r12
            r7.f142394g = r13
            r7.f142395h = r0
            r7.f142396i = r11
            r7.f142399l = r4
            r2 = 0
            r4 = 0
            r0 = r24
            r1 = r25
            r3 = r26
            r5 = r27
            r6 = r29
            java.lang.Object r1 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r14) goto L_0x00b0
            return r14
        L_0x00b0:
            r2 = r8
        L_0x00b1:
            RF.k r1 = (RF.k) r1
            if (r12 == 0) goto L_0x0120
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r2.f142315A
            com.sugarcube.decorate_engine.ObjectInstanceId r1 = r1.f()
            r0.moveModelInstance(r1, r12)
            goto L_0x0120
        L_0x00bf:
            r7.f142390c = r8
            r7.f142391d = r9
            r7.f142392e = r10
            r7.f142393f = r12
            r7.f142394g = r13
            r7.f142395h = r0
            r7.f142396i = r11
            r7.f142399l = r3
            r2 = 0
            r4 = 1
            r0 = r24
            r1 = r25
            r3 = r26
            r5 = r27
            r6 = r29
            java.lang.Object r1 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r14) goto L_0x00e2
            return r14
        L_0x00e2:
            r6 = r8
            r19 = r10
            r20 = r11
            r21 = r13
        L_0x00e9:
            RF.k r1 = (RF.k) r1
            if (r12 == 0) goto L_0x00f6
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r6.f142315A
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r1.f()
            r0.moveModelInstance(r2, r12)
        L_0x00f6:
            kotlin.jvm.internal.O r0 = new kotlin.jvm.internal.O
            r0.<init>()
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$j r2 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$j
            r23 = 0
            r15 = r2
            r16 = r6
            r17 = r9
            r18 = r1
            r22 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e r3 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e
            r3.<init>(r9, r1, r2)
            r0.f144348a = r3
            java.util.List<com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$e> r0 = r6.f142338u
            r0.add(r3)
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$i r0 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$i
            r3 = 0
            r0.<init>(r2, r9, r1, r3)
            r6.K(r0)
        L_0x0120:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.u(com.sugarcube.app.base.data.database.CachedCatalogItem, RF.k, boolean, com.sugarcube.decorate_engine.ModelScreenTransform, com.sugarcube.core.network.models.SmartaPlacement, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(com.sugarcube.app.base.data.database.CachedCatalogItem r14, RF.k r15, RF.k r16, boolean r17, boolean r18, com.sugarcube.core.network.models.SmartaPlacement r19, dI.C17164e<? super RF.k> r20) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r20
            boolean r1 = r0 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.k
            if (r1 == 0) goto L_0x0019
            r1 = r0
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$k r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.k) r1
            int r2 = r1.f142425o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.f142425o = r2
        L_0x0017:
            r6 = r1
            goto L_0x001f
        L_0x0019:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$k r1 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$k
            r1.<init>(r13, r0)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r1 = r6.f142423m
            java.lang.Object r9 = eI.C17187b.f()
            int r2 = r6.f142425o
            r10 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 != r10) goto L_0x0057
            boolean r0 = r6.f142422l
            boolean r2 = r6.f142421k
            java.lang.Object r3 = r6.f142420j
            RF.k r3 = (RF.k) r3
            java.lang.Object r3 = r6.f142419i
            com.sugarcube.decorate_engine.ObjectInstanceId r3 = (com.sugarcube.decorate_engine.ObjectInstanceId) r3
            java.lang.Object r3 = r6.f142418h
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r6.f142417g
            com.sugarcube.core.network.models.SmartaPlacement r3 = (com.sugarcube.core.network.models.SmartaPlacement) r3
            java.lang.Object r3 = r6.f142416f
            RF.k r3 = (RF.k) r3
            java.lang.Object r4 = r6.f142415e
            RF.k r4 = (RF.k) r4
            java.lang.Object r4 = r6.f142414d
            com.sugarcube.app.base.data.database.CachedCatalogItem r4 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r4
            java.lang.Object r4 = r6.f142413c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r4 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r4
            XH.y.b(r1)
            r12 = r0
            r11 = r2
            r8 = r3
            goto L_0x00a1
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005f:
            XH.y.b(r1)
            if (r8 != 0) goto L_0x0066
            r1 = r15
            goto L_0x0067
        L_0x0066:
            r1 = r8
        L_0x0067:
            if (r1 == 0) goto L_0x006f
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r1.f()
            if (r2 != 0) goto L_0x0075
        L_0x006f:
            com.sugarcube.decorate_engine.ObjectInstanceId$Companion r2 = com.sugarcube.decorate_engine.ObjectInstanceId.Companion
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.getKNone()
        L_0x0075:
            r6.f142413c = r7
            r3 = r14
            r6.f142414d = r3
            r4 = r15
            r6.f142415e = r4
            r6.f142416f = r8
            r5 = r19
            r6.f142417g = r5
            r6.f142418h = r0
            r6.f142419i = r2
            r6.f142420j = r1
            r11 = r17
            r6.f142421k = r11
            r12 = r18
            r6.f142422l = r12
            r6.f142425o = r10
            r0 = r13
            r1 = r14
            r3 = r16
            r4 = r17
            java.lang.Object r1 = r0.s(r1, r2, r3, r4, r5, r6)
            if (r1 != r9) goto L_0x00a0
            return r9
        L_0x00a0:
            r4 = r7
        L_0x00a1:
            RF.k r1 = (RF.k) r1
            if (r12 == 0) goto L_0x00ae
            if (r11 != 0) goto L_0x00ae
            if (r8 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r10 = 0
        L_0x00ab:
            r4.i0(r1, r10)
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.v(com.sugarcube.app.base.data.database.CachedCatalogItem, RF.k, RF.k, boolean, boolean, com.sugarcube.core.network.models.SmartaPlacement, dI.e):java.lang.Object");
    }

    private final Object w(CachedCatalogItem cachedCatalogItem, boolean z10, boolean z11, ModelScreenTransform modelScreenTransform, SmartaPlacement smartaPlacement, C17164e<? super C16807N> eVar) {
        if (cachedCatalogItem == null) {
            return C16807N.f139792a;
        }
        RF.k kVar = null;
        C17597b bVar = z10 ? this.f142339v : null;
        if (bVar != null) {
            kVar = bVar.e();
        }
        Object u10 = u(cachedCatalogItem, kVar, z11, modelScreenTransform, smartaPlacement, eVar);
        return u10 == C17187b.f() ? u10 : C16807N.f139792a;
    }

    static /* synthetic */ Object x(EngineManagerImpl engineManagerImpl, CachedCatalogItem cachedCatalogItem, boolean z10, boolean z11, ModelScreenTransform modelScreenTransform, SmartaPlacement smartaPlacement, C17164e eVar, int i10, Object obj) {
        return engineManagerImpl.w(cachedCatalogItem, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11, (i10 & 8) != 0 ? null : modelScreenTransform, smartaPlacement, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(com.sugarcube.core.network.models.SmartaPlacement r29, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r28 = this;
            r9 = r28
            r0 = r30
            boolean r1 = r0 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.l
            if (r1 == 0) goto L_0x0018
            r1 = r0
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$l r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.l) r1
            int r2 = r1.f142436m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f142436m = r2
        L_0x0016:
            r6 = r1
            goto L_0x001e
        L_0x0018:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$l r1 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$l
            r1.<init>(r9, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r6.f142434k
            java.lang.Object r10 = eI.C17187b.f()
            int r2 = r6.f142436m
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 != r12) goto L_0x004c
            java.lang.Object r0 = r6.f142432i
            com.sugarcube.decorate_engine.ObjectInstanceId r0 = (com.sugarcube.decorate_engine.ObjectInstanceId) r0
            java.lang.Object r0 = r6.f142431h
            mG.b r0 = (mG.C17597b) r0
            java.lang.Object r0 = r6.f142430g
            mG.b r0 = (mG.C17597b) r0
            java.lang.Object r0 = r6.f142429f
            mG.b r0 = (mG.C17597b) r0
            java.lang.Object r0 = r6.f142428e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r6.f142427d
            com.sugarcube.core.network.models.SmartaPlacement r0 = (com.sugarcube.core.network.models.SmartaPlacement) r0
            java.lang.Object r0 = r6.f142426c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r0
            XH.y.b(r1)
            goto L_0x00b5
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            XH.y.b(r1)
            mG.b r1 = r9.f142339v
            if (r1 == 0) goto L_0x00be
            com.sugarcube.decorate.internal.shared.IDecorateEngine r2 = r9.f142315A
            com.sugarcube.decorate_engine.CloneModelInstanceInfo r3 = new com.sugarcube.decorate_engine.CloneModelInstanceInfo
            RF.k r4 = r1.e()
            com.sugarcube.decorate_engine.ObjectInstanceId r21 = r4.f()
            r26 = 1983(0x7bf, float:2.779E-42)
            r27 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.cloneModelInstance(r3)
            RF.k r3 = r1.e()
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = r3.d()
            r6.f142426c = r9
            r5 = r29
            r6.f142427d = r5
            r6.f142428e = r0
            r6.f142429f = r1
            r6.f142430g = r1
            r6.f142431h = r1
            r6.f142432i = r2
            r6.f142433j = r11
            r6.f142436m = r12
            r4 = 0
            r7 = 0
            r8 = 8
            r13 = 0
            r0 = r28
            r1 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r13
            java.lang.Object r1 = t(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r10) goto L_0x00b4
            return r10
        L_0x00b4:
            r0 = r9
        L_0x00b5:
            RF.k r1 = (RF.k) r1
            r0.i0(r1, r11)
            r0.X(r12)
            goto L_0x00c9
        L_0x00be:
            java.lang.String r0 = "EngineManagerImpl"
            java.lang.String r1 = "duplicateInstance(...) failed because there is no selected instance"
            int r0 = android.util.Log.w(r0, r1)
            kotlin.coroutines.jvm.internal.b.e(r0)
        L_0x00c9:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.z(com.sugarcube.core.network.models.SmartaPlacement, dI.e):java.lang.Object");
    }

    public final EventsListener E() {
        EventsListener eventsListener = this.f142316B;
        if (eventsListener != null) {
            return eventsListener;
        }
        C17542s.z("listener");
        return null;
    }

    public final TouchManager J() {
        return this.f142325h;
    }

    public final void Y(boolean z10) {
        boolean z11 = this.f142341x;
        this.f142341x = z10;
        if (z11 != z10) {
            E().onFocusedChanged(z10);
        }
    }

    public final void a0(EventsListener eventsListener) {
        C17542s.j(eventsListener, "<set-?>");
        this.f142316B = eventsListener;
    }

    public void cleanUp() {
        getEngineController().k();
        this.f142340w = null;
        W((RF.j) null);
    }

    public void clearAllInstances() {
    }

    public void disableMagicEraser() {
        if (this.f142328k) {
            b0(false);
            this.f142315A.execEraserOp(EraserPickOp.HighlightOff, EraserPickId.Companion.getKAll());
        }
    }

    public Object duplicateSelectedItem(SmartaPlacement smartaPlacement, C17164e<? super C16807N> eVar) {
        Object z10 = z(smartaPlacement, eVar);
        return z10 == C17187b.f() ? z10 : C16807N.f139792a;
    }

    public void enableMagicEraser() {
        if (!this.f142328k) {
            b0(true);
            this.f142315A.execEraserOp(EraserPickOp.HighlightOn, EraserPickId.Companion.getKAll());
        }
    }

    public void eraseAllErasableItems() {
        if (this.f142328k) {
            this.f142315A.execEraserOp(EraserPickOp.Erase, EraserPickId.Companion.getKAll());
            o0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0192, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
        r6 = r9.f142320c;
        r11 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewModelLoader.INSTANCE;
        r2.f142477c = r9;
        r2.f142478d = r5;
        r2.f142479e = r1;
        r2.f142484j = r3;
        r2.f142499y = 2;
        r6 = r6.get(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01aa, code lost:
        if (r6 != r4) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01ac, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01ad, code lost:
        r32 = r5;
        r5 = r1;
        r1 = r3;
        r3 = r6;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01b4, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
        r11 = r9.f142320c;
        r12 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSceneLoader.INSTANCE;
        r2.f142477c = r9;
        r2.f142478d = r6;
        r2.f142479e = r5;
        r2.f142484j = r1;
        r2.f142485k = r3;
        r2.f142499y = 3;
        r11 = r11.get(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ce, code lost:
        if (r11 != r4) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01d0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01d1, code lost:
        r12 = r9;
        r9 = r5;
        r5 = r3;
        r3 = r11;
        r11 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01d7, code lost:
        r1 = ((java.lang.Boolean) r3).booleanValue();
        r3 = r12.f142320c;
        r13 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewCompositionLoader.INSTANCE;
        r2.f142477c = r12;
        r2.f142478d = r11;
        r2.f142479e = r9;
        r2.f142484j = r6;
        r2.f142485k = r5;
        r2.f142486l = r1;
        r2.f142499y = 4;
        r3 = r3.get(r13, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01f3, code lost:
        if (r3 != r4) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01f6, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
        r13 = r12.f142320c;
        r14 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewMultiViewTonemap.INSTANCE;
        r2.f142477c = r12;
        r2.f142478d = r11;
        r2.f142479e = r9;
        r2.f142484j = r6;
        r2.f142485k = r5;
        r2.f142486l = r1;
        r2.f142487m = r3;
        r2.f142499y = 5;
        r13 = r13.get(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0215, code lost:
        if (r13 != r4) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0217, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0218, code lost:
        r14 = r12;
        r12 = r9;
        r9 = r5;
        r5 = r3;
        r3 = r13;
        r13 = r11;
        r11 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0220, code lost:
        r1 = ((java.lang.Boolean) r3).booleanValue();
        r3 = r14.f142320c;
        r15 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSingleViewTonemap.INSTANCE;
        r2.f142477c = r14;
        r2.f142478d = r13;
        r2.f142479e = r12;
        r2.f142484j = r11;
        r2.f142485k = r9;
        r2.f142486l = r6;
        r2.f142487m = r5;
        r2.f142488n = r1;
        r2.f142499y = 6;
        r3 = r3.get(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0241, code lost:
        if (r3 != r4) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0243, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0244, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
        r2.f142477c = r14;
        r2.f142478d = r13;
        r2.f142479e = r12;
        r2.f142484j = r11;
        r2.f142485k = r9;
        r2.f142486l = r6;
        r2.f142487m = r5;
        r2.f142488n = r1;
        r2.f142489o = r3;
        r2.f142499y = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0263, code lost:
        if (r14.P(r13, r2) != r4) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0265, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0266, code lost:
        r15 = r6;
        r32 = r5;
        r5 = r1;
        r1 = r14;
        r14 = r12;
        r12 = r3;
        r3 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x026f, code lost:
        r6 = r1.getInitialViewport().b();
        r7 = com.sugarcube.core.logger.Priority.DEBUG;
        r8 = iG.C17349f.f143481a[r7.ordinal()];
        r29 = r4;
        r20 = com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.class;
        r4 = "Starting decorate engine";
        r30 = r7;
        r7 = "";
        r31 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0292, code lost:
        if (r8 == 1) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0295, code lost:
        if (r8 == 2) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0298, code lost:
        if (r8 == 3) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x029b, code lost:
        if (r8 == 4) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x029e, code lost:
        if (r8 != 5) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02a0, code lost:
        r8 = r20.getName();
        kotlin.jvm.internal.C17542s.g(r8);
        r17 = r2;
        r18 = r6;
        r35 = r8;
        r2 = HJ.C15854t.o1(HJ.C15854t.s1(r8, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02bf, code lost:
        if (r2.length() != 0) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02c1, code lost:
        r8 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02c4, code lost:
        r8 = HJ.C15854t.P0(r2, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02c8, code lost:
        android.util.Log.e(r8, r4 + " " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02e4, code lost:
        throw new XH.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02e5, code lost:
        r17 = r2;
        r18 = r6;
        r2 = r20.getName();
        kotlin.jvm.internal.C17542s.g(r2);
        r35 = r2;
        r2 = HJ.C15854t.o1(HJ.C15854t.s1(r2, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0304, code lost:
        if (r2.length() != 0) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0306, code lost:
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0309, code lost:
        r2 = HJ.C15854t.P0(r2, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x030d, code lost:
        android.util.Log.w(r2, r4 + " " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0324, code lost:
        r17 = r2;
        r18 = r6;
        r2 = r20.getName();
        kotlin.jvm.internal.C17542s.g(r2);
        r35 = r2;
        r2 = HJ.C15854t.o1(HJ.C15854t.s1(r2, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0343, code lost:
        if (r2.length() != 0) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0345, code lost:
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0348, code lost:
        r2 = HJ.C15854t.P0(r2, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x034c, code lost:
        android.util.Log.i(r2, r4 + " " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0363, code lost:
        r17 = r2;
        r18 = r6;
        r2 = r20.getName();
        kotlin.jvm.internal.C17542s.g(r2);
        r35 = r2;
        r2 = HJ.C15854t.o1(HJ.C15854t.s1(r2, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0382, code lost:
        if (r2.length() != 0) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0384, code lost:
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0387, code lost:
        r2 = HJ.C15854t.P0(r2, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x038b, code lost:
        android.util.Log.d(r2, r4 + " " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03a1, code lost:
        r17 = r2;
        r18 = r6;
        r2 = r20.getName();
        kotlin.jvm.internal.C17542s.g(r2);
        r35 = r2;
        r2 = HJ.C15854t.o1(HJ.C15854t.s1(r2, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03c0, code lost:
        if (r2.length() != 0) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03c2, code lost:
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03c5, code lost:
        r2 = HJ.C15854t.P0(r2, "Kt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03c9, code lost:
        android.util.Log.v(r2, r4 + " " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03de, code lost:
        r10 = r1.f142318a.getColor(com.sugarcube.common.R.color.decorate_background);
        r1.getEngineController().j(r10, r13, r11, r9, r15, r3, r5, r12, r18);
        r0 = r1.f142315A.getInstanceInfo();
        r2 = r13.c();
        r6 = r17;
        r6.f142477c = r1;
        r6.f142478d = r13;
        r14 = r31;
        r6.f142479e = r14;
        r6.f142480f = r1;
        r8 = r30;
        r6.f142481g = r8;
        r6.f142482h = r4;
        r6.f142483i = r7;
        r6.f142484j = r11;
        r6.f142485k = r9;
        r6.f142486l = r15;
        r6.f142487m = r3;
        r6.f142488n = r5;
        r6.f142489o = r12;
        r34 = r3;
        r6.f142490p = r18;
        r6.f142491q = r10;
        r6.f142492r = 0;
        r6.f142493s = 0;
        r6.f142494t = 0;
        r6.f142495u = 0;
        r6.f142496v = 0;
        r6.f142499y = 8;
        r0 = r1.l0(r0, r2, r6);
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0446, code lost:
        if (r0 != r2) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0448, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0449, code lost:
        r0 = r1;
        r29 = r2;
        r22 = r10;
        r3 = r18;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r10 = r34;
        r32 = r9;
        r9 = r5;
        r5 = r12;
        r12 = r15;
        r15 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0463, code lost:
        r1.f142342y.J(kotlin.coroutines.jvm.internal.b.a(true));
        r2 = r1.f142343z;
        r6.f142477c = r1;
        r6.f142478d = r13;
        r6.f142479e = r14;
        r6.f142480f = r0;
        r6.f142481g = r8;
        r6.f142482h = r4;
        r6.f142483i = r7;
        r6.f142484j = r11;
        r6.f142485k = r15;
        r6.f142486l = r12;
        r6.f142487m = r10;
        r6.f142488n = r9;
        r6.f142489o = r5;
        r6.f142490p = r3;
        r6.f142491q = r22;
        r6.f142492r = r21;
        r6.f142493s = r20;
        r6.f142494t = r19;
        r6.f142495u = r18;
        r6.f142496v = r17;
        r6.f142499y = 9;
        r0 = r2.f(r6);
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x04b2, code lost:
        if (r0 != r2) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04b4, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x04b5, code lost:
        r1.o0();
        r1.W(RF.j.Companion.a(r1.f142315A.getLastFixedView()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x04c9, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f0(kG.C17497c r34, dI.C17164e<? super XH.C16807N> r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.s
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$s r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.s) r2
            int r3 = r2.f142499y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f142499y = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$s r2 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$s
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f142497w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f142499y
            r7 = 4
            r8 = 3
            r10 = 2
            switch(r5) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0166;
                case 2: goto L_0x0154;
                case 3: goto L_0x013a;
                case 4: goto L_0x0123;
                case 5: goto L_0x0103;
                case 6: goto L_0x00e8;
                case 7: goto L_0x00c1;
                case 8: goto L_0x0053;
                case 9: goto L_0x0032;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0032:
            java.lang.Object r1 = r2.f142483i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f142482h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f142481g
            com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
            java.lang.Object r1 = r2.f142480f
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r1
            java.lang.Object r1 = r2.f142479e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f142478d
            kG.c r1 = (kG.C17497c) r1
            java.lang.Object r1 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r1
            XH.y.b(r3)
            goto L_0x04b5
        L_0x0053:
            int r1 = r2.f142496v
            int r5 = r2.f142495u
            int r6 = r2.f142494t
            int r7 = r2.f142493s
            int r8 = r2.f142492r
            int r10 = r2.f142491q
            int r11 = r2.f142490p
            boolean r12 = r2.f142489o
            boolean r13 = r2.f142488n
            boolean r14 = r2.f142487m
            boolean r15 = r2.f142486l
            boolean r9 = r2.f142485k
            r34 = r1
            boolean r1 = r2.f142484j
            r35 = r1
            java.lang.Object r1 = r2.f142483i
            java.lang.String r1 = (java.lang.String) r1
            r17 = r1
            java.lang.Object r1 = r2.f142482h
            java.lang.String r1 = (java.lang.String) r1
            r18 = r1
            java.lang.Object r1 = r2.f142481g
            com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
            r19 = r1
            java.lang.Object r1 = r2.f142480f
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r1
            r20 = r1
            java.lang.Object r1 = r2.f142479e
            dI.e r1 = (dI.C17164e) r1
            r21 = r1
            java.lang.Object r1 = r2.f142478d
            kG.c r1 = (kG.C17497c) r1
            r22 = r1
            java.lang.Object r1 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r1
            XH.y.b(r3)
            r29 = r4
            r3 = r11
            r4 = r18
            r0 = r20
            r11 = r35
            r18 = r5
            r20 = r7
            r5 = r12
            r12 = r15
            r7 = r17
            r17 = r34
            r15 = r9
            r9 = r13
            r13 = r22
            r22 = r10
            r10 = r14
            r14 = r21
            r21 = r8
            r8 = r19
            r19 = r6
            r6 = r2
            goto L_0x0463
        L_0x00c1:
            boolean r1 = r2.f142489o
            boolean r5 = r2.f142488n
            boolean r9 = r2.f142487m
            boolean r11 = r2.f142486l
            boolean r12 = r2.f142485k
            boolean r13 = r2.f142484j
            java.lang.Object r14 = r2.f142479e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f142478d
            kG.c r15 = (kG.C17497c) r15
            java.lang.Object r6 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r6 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r6
            XH.y.b(r3)
            r3 = r9
            r9 = r12
            r12 = r1
            r1 = r6
            r32 = r15
            r15 = r11
            r11 = r13
            r13 = r32
            goto L_0x026f
        L_0x00e8:
            boolean r1 = r2.f142488n
            boolean r5 = r2.f142487m
            boolean r6 = r2.f142486l
            boolean r9 = r2.f142485k
            boolean r11 = r2.f142484j
            java.lang.Object r12 = r2.f142479e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f142478d
            kG.c r13 = (kG.C17497c) r13
            java.lang.Object r14 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r14 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r14
            XH.y.b(r3)
            goto L_0x0244
        L_0x0103:
            boolean r1 = r2.f142487m
            boolean r5 = r2.f142486l
            boolean r6 = r2.f142485k
            boolean r9 = r2.f142484j
            java.lang.Object r11 = r2.f142479e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r2.f142478d
            kG.c r12 = (kG.C17497c) r12
            java.lang.Object r13 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r13 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r13
            XH.y.b(r3)
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r9
            r9 = r6
            r6 = r5
            r5 = r1
            goto L_0x0220
        L_0x0123:
            boolean r1 = r2.f142486l
            boolean r5 = r2.f142485k
            boolean r6 = r2.f142484j
            java.lang.Object r9 = r2.f142479e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r11 = r2.f142478d
            kG.c r11 = (kG.C17497c) r11
            java.lang.Object r12 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r12 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r12
            XH.y.b(r3)
            goto L_0x01f6
        L_0x013a:
            boolean r1 = r2.f142485k
            boolean r5 = r2.f142484j
            java.lang.Object r6 = r2.f142479e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r9 = r2.f142478d
            kG.c r9 = (kG.C17497c) r9
            java.lang.Object r11 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r11 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r11
            XH.y.b(r3)
            r12 = r11
            r11 = r9
            r9 = r6
            r6 = r5
            r5 = r1
            goto L_0x01d7
        L_0x0154:
            boolean r1 = r2.f142484j
            java.lang.Object r5 = r2.f142479e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r2.f142478d
            kG.c r6 = (kG.C17497c) r6
            java.lang.Object r9 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r9 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r9
            XH.y.b(r3)
            goto L_0x01b4
        L_0x0166:
            java.lang.Object r1 = r2.f142479e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f142478d
            kG.c r5 = (kG.C17497c) r5
            java.lang.Object r6 = r2.f142477c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r6 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r6
            XH.y.b(r3)
            r9 = r6
            goto L_0x0192
        L_0x0177:
            XH.y.b(r3)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r0.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableDynamicQuality r5 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableDynamicQuality.INSTANCE
            r2.f142477c = r0
            r6 = r34
            r2.f142478d = r6
            r2.f142479e = r1
            r9 = 1
            r2.f142499y = r9
            java.lang.Object r3 = r3.get(r5, r2)
            if (r3 != r4) goto L_0x0190
            return r4
        L_0x0190:
            r9 = r0
            r5 = r6
        L_0x0192:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.sugarcube.app.base.data.feature.ConfigRepository r6 = r9.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewModelLoader r11 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewModelLoader.INSTANCE
            r2.f142477c = r9
            r2.f142478d = r5
            r2.f142479e = r1
            r2.f142484j = r3
            r2.f142499y = r10
            java.lang.Object r6 = r6.get(r11, r2)
            if (r6 != r4) goto L_0x01ad
            return r4
        L_0x01ad:
            r32 = r5
            r5 = r1
            r1 = r3
            r3 = r6
            r6 = r32
        L_0x01b4:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.sugarcube.app.base.data.feature.ConfigRepository r11 = r9.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewSceneLoader r12 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSceneLoader.INSTANCE
            r2.f142477c = r9
            r2.f142478d = r6
            r2.f142479e = r5
            r2.f142484j = r1
            r2.f142485k = r3
            r2.f142499y = r8
            java.lang.Object r11 = r11.get(r12, r2)
            if (r11 != r4) goto L_0x01d1
            return r4
        L_0x01d1:
            r12 = r9
            r9 = r5
            r5 = r3
            r3 = r11
            r11 = r6
            r6 = r1
        L_0x01d7:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r12.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewCompositionLoader r13 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewCompositionLoader.INSTANCE
            r2.f142477c = r12
            r2.f142478d = r11
            r2.f142479e = r9
            r2.f142484j = r6
            r2.f142485k = r5
            r2.f142486l = r1
            r2.f142499y = r7
            java.lang.Object r3 = r3.get(r13, r2)
            if (r3 != r4) goto L_0x01f6
            return r4
        L_0x01f6:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.sugarcube.app.base.data.feature.ConfigRepository r13 = r12.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewMultiViewTonemap r14 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewMultiViewTonemap.INSTANCE
            r2.f142477c = r12
            r2.f142478d = r11
            r2.f142479e = r9
            r2.f142484j = r6
            r2.f142485k = r5
            r2.f142486l = r1
            r2.f142487m = r3
            r15 = 5
            r2.f142499y = r15
            java.lang.Object r13 = r13.get(r14, r2)
            if (r13 != r4) goto L_0x0218
            return r4
        L_0x0218:
            r14 = r12
            r12 = r9
            r9 = r5
            r5 = r3
            r3 = r13
            r13 = r11
            r11 = r6
            r6 = r1
        L_0x0220:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r14.f142320c
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableNewSingleViewTonemap r15 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableNewSingleViewTonemap.INSTANCE
            r2.f142477c = r14
            r2.f142478d = r13
            r2.f142479e = r12
            r2.f142484j = r11
            r2.f142485k = r9
            r2.f142486l = r6
            r2.f142487m = r5
            r2.f142488n = r1
            r7 = 6
            r2.f142499y = r7
            java.lang.Object r3 = r3.get(r15, r2)
            if (r3 != r4) goto L_0x0244
            return r4
        L_0x0244:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.f142477c = r14
            r2.f142478d = r13
            r2.f142479e = r12
            r2.f142484j = r11
            r2.f142485k = r9
            r2.f142486l = r6
            r2.f142487m = r5
            r2.f142488n = r1
            r2.f142489o = r3
            r7 = 7
            r2.f142499y = r7
            java.lang.Object r7 = r14.P(r13, r2)
            if (r7 != r4) goto L_0x0266
            return r4
        L_0x0266:
            r15 = r6
            r32 = r5
            r5 = r1
            r1 = r14
            r14 = r12
            r12 = r3
            r3 = r32
        L_0x026f:
            RF.j r6 = r1.getInitialViewport()
            int r6 = r6.b()
            com.sugarcube.core.logger.Priority r7 = com.sugarcube.core.logger.Priority.DEBUG
            int[] r19 = iG.C17349f.f143481a
            int r20 = r7.ordinal()
            r8 = r19[r20]
            java.lang.String r10 = " "
            java.lang.String r0 = "Kt"
            r29 = r4
            java.lang.Class<com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl> r20 = com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.class
            java.lang.String r4 = "Starting decorate engine"
            r30 = r7
            java.lang.String r7 = ""
            r31 = r14
            r14 = 1
            if (r8 == r14) goto L_0x03a1
            r14 = 2
            if (r8 == r14) goto L_0x0363
            r14 = 3
            if (r8 == r14) goto L_0x0324
            r14 = 4
            if (r8 == r14) goto L_0x02e5
            r14 = 5
            if (r8 != r14) goto L_0x02df
            java.lang.String r8 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r17 = r2
            r18 = r6
            r2 = 36
            r6 = 0
            r14 = 2
            java.lang.String r2 = HJ.C15854t.s1(r8, r2, r6, r14, r6)
            r35 = r8
            r8 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r8, r6, r14, r6)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x02c4
            r8 = r35
            goto L_0x02c8
        L_0x02c4:
            java.lang.String r8 = HJ.C15854t.P0(r2, r0)
        L_0x02c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r8, r0)
            goto L_0x03de
        L_0x02df:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x02e5:
            r17 = r2
            r18 = r6
            java.lang.String r2 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r6 = 2
            r8 = 36
            r14 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r14, r6, r14)
            r35 = r2
            r2 = 46
            java.lang.String r2 = HJ.C15854t.o1(r8, r2, r14, r6, r14)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0309
            r2 = r35
            goto L_0x030d
        L_0x0309:
            java.lang.String r2 = HJ.C15854t.P0(r2, r0)
        L_0x030d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            goto L_0x03de
        L_0x0324:
            r17 = r2
            r18 = r6
            java.lang.String r2 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r6 = 2
            r8 = 36
            r14 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r14, r6, r14)
            r35 = r2
            r2 = 46
            java.lang.String r2 = HJ.C15854t.o1(r8, r2, r14, r6, r14)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0348
            r2 = r35
            goto L_0x034c
        L_0x0348:
            java.lang.String r2 = HJ.C15854t.P0(r2, r0)
        L_0x034c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r2, r0)
            goto L_0x03de
        L_0x0363:
            r17 = r2
            r18 = r6
            java.lang.String r2 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r6 = 2
            r8 = 36
            r14 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r14, r6, r14)
            r35 = r2
            r2 = 46
            java.lang.String r2 = HJ.C15854t.o1(r8, r2, r14, r6, r14)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0387
            r2 = r35
            goto L_0x038b
        L_0x0387:
            java.lang.String r2 = HJ.C15854t.P0(r2, r0)
        L_0x038b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
            goto L_0x03de
        L_0x03a1:
            r17 = r2
            r18 = r6
            java.lang.String r2 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r6 = 2
            r8 = 36
            r14 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r14, r6, r14)
            r35 = r2
            r2 = 46
            java.lang.String r2 = HJ.C15854t.o1(r8, r2, r14, r6, r14)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x03c5
            r2 = r35
            goto L_0x03c9
        L_0x03c5:
            java.lang.String r2 = HJ.C15854t.P0(r2, r0)
        L_0x03c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L_0x03de:
            android.content.Context r0 = r1.f142318a
            int r2 = com.sugarcube.common.R.color.decorate_background
            int r10 = r0.getColor(r2)
            com.sugarcube.decorate.v2.internal.DecorateEngineController r19 = r1.getEngineController()
            r20 = r10
            r21 = r13
            r22 = r11
            r23 = r9
            r24 = r15
            r25 = r3
            r26 = r5
            r27 = r12
            r28 = r18
            r19.j(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r1.f142315A
            java.util.Map r0 = r0.getInstanceInfo()
            com.sugarcube.app.base.data.database.CachedCompiledComposition r2 = r13.c()
            r6 = r17
            r6.f142477c = r1
            r6.f142478d = r13
            r14 = r31
            r6.f142479e = r14
            r6.f142480f = r1
            r8 = r30
            r6.f142481g = r8
            r6.f142482h = r4
            r6.f142483i = r7
            r6.f142484j = r11
            r6.f142485k = r9
            r6.f142486l = r15
            r6.f142487m = r3
            r6.f142488n = r5
            r6.f142489o = r12
            r34 = r3
            r3 = r18
            r6.f142490p = r3
            r6.f142491q = r10
            r3 = 0
            r6.f142492r = r3
            r6.f142493s = r3
            r6.f142494t = r3
            r6.f142495u = r3
            r6.f142496v = r3
            r3 = 8
            r6.f142499y = r3
            java.lang.Object r0 = r1.l0(r0, r2, r6)
            r2 = r29
            if (r0 != r2) goto L_0x0449
            return r2
        L_0x0449:
            r0 = r1
            r29 = r2
            r22 = r10
            r3 = r18
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = r34
            r32 = r9
            r9 = r5
            r5 = r12
            r12 = r15
            r15 = r32
        L_0x0463:
            QJ.x<java.lang.Boolean> r2 = r1.f142342y
            r23 = r3
            r16 = 1
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r16)
            r2.J(r3)
            QJ.x<java.lang.Boolean> r2 = r1.f142343z
            r6.f142477c = r1
            r6.f142478d = r13
            r6.f142479e = r14
            r6.f142480f = r0
            r6.f142481g = r8
            r6.f142482h = r4
            r6.f142483i = r7
            r6.f142484j = r11
            r6.f142485k = r15
            r6.f142486l = r12
            r6.f142487m = r10
            r6.f142488n = r9
            r6.f142489o = r5
            r11 = r23
            r6.f142490p = r11
            r10 = r22
            r6.f142491q = r10
            r8 = r21
            r6.f142492r = r8
            r7 = r20
            r6.f142493s = r7
            r0 = r19
            r6.f142494t = r0
            r5 = r18
            r6.f142495u = r5
            r0 = r17
            r6.f142496v = r0
            r0 = 9
            r6.f142499y = r0
            java.lang.Object r0 = r2.f(r6)
            r2 = r29
            if (r0 != r2) goto L_0x04b5
            return r2
        L_0x04b5:
            r1.o0()
            RF.j$a r0 = RF.j.Companion
            com.sugarcube.decorate.internal.shared.IDecorateEngine r2 = r1.f142315A
            int r2 = r2.getLastFixedView()
            RF.j r0 = r0.a(r2)
            r1.W(r0)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.f0(kG.c, dI.e):java.lang.Object");
    }

    public void flipSelectedItem() {
        B();
    }

    public void focusOnSelectedItem() {
        RF.k e10;
        C17597b bVar = this.f142339v;
        if (bVar != null && (e10 = bVar.e()) != null) {
            C(e10);
        }
    }

    public RF.j getCurrentViewport() {
        return this.f142332o;
    }

    public DecorateEngineController getEngineController() {
        return this.f142321d;
    }

    public C13549b getEngineDebugInfo() {
        return this.f142326i;
    }

    public String getHelaWallColor() {
        return this.f142315A.getHelaWallColor();
    }

    public RF.j getInitialViewport() {
        return this.f142330m;
    }

    public Object getModelMap(C17164e<? super HashMap<ObjectInstanceId, RF.k>> eVar) {
        HashMap hashMap = new HashMap(32);
        for (RF.k kVar : this.f142337t) {
            hashMap.put(kVar.f(), kVar);
        }
        return hashMap;
    }

    public Object getMultiviewInformation(C17497c cVar, C17164e<? super List<C17596a>> eVar) {
        int fixedViewCount = this.f142315A.getFixedViewCount();
        ArrayList arrayList = new ArrayList(fixedViewCount);
        for (int i10 = 0; i10 < fixedViewCount; i10++) {
            MultiviewThumbnail multiviewThumbnail = (MultiviewThumbnail) C16877v.z0(cVar.g().getViewports(), i10);
            Uri uri = null;
            String thumbnailUrl = multiviewThumbnail != null ? multiviewThumbnail.getThumbnailUrl() : null;
            Manifest manifest = cVar.g().getManifest();
            if (manifest != null) {
                uri = manifest.getPano();
            }
            String valueOf = String.valueOf(uri);
            RF.j a10 = RF.j.Companion.a(i10);
            if (thumbnailUrl == null) {
                thumbnailUrl = valueOf;
            }
            arrayList.add(new C17596a(a10, thumbnailUrl));
        }
        return arrayList;
    }

    public void mirrorSelectedItem() {
        M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object placeAllItemsInDesign(java.util.List<com.sugarcube.decorate.DesignItemInfo> r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r18 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.n
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$n r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.n) r1
            int r2 = r1.f142452p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f142452p = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$n r1 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$n
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f142450n
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f142452p
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0061
            if (r5 != r7) goto L_0x0059
            int r0 = r1.f142448l
            java.lang.Object r5 = r1.f142447k
            com.sugarcube.decorate_engine.ModelScreenTransform r5 = (com.sugarcube.decorate_engine.ModelScreenTransform) r5
            java.lang.Object r5 = r1.f142446j
            com.sugarcube.decorate.TempModelInstanceInfo r5 = (com.sugarcube.decorate.TempModelInstanceInfo) r5
            java.lang.Object r5 = r1.f142445i
            com.sugarcube.decorate.DesignItemInfo r5 = (com.sugarcube.decorate.DesignItemInfo) r5
            java.lang.Object r5 = r1.f142443g
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r8 = r1.f142442f
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r9 = r1.f142441e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r1.f142440d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.f142439c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r11 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r11
            XH.y.b(r3)
            r3 = r0
            r15 = r5
            r14 = r8
            r0 = r10
            r13 = r11
            r5 = r1
            r1 = r9
            goto L_0x0074
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            XH.y.b(r3)
            r3 = r19
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r5 = r3.iterator()
            r13 = r2
            r14 = r3
            r15 = r5
            r3 = r6
            r5 = r1
            r1 = r0
            r0 = r19
        L_0x0074:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x00c5
            java.lang.Object r8 = r15.next()
            r9 = r8
            com.sugarcube.decorate.DesignItemInfo r9 = (com.sugarcube.decorate.DesignItemInfo) r9
            com.sugarcube.decorate.TempModelInstanceInfo r10 = r9.a()
            com.sugarcube.decorate_engine.ModelScreenTransform r12 = r9.b()
            com.sugarcube.core.network.models.CatalogItem r11 = r10.a()
            com.sugarcube.app.base.data.database.CachedCatalogItem r11 = RF.q.a(r11)
            r5.f142439c = r13
            r5.f142440d = r0
            r5.f142441e = r1
            r5.f142442f = r14
            r5.f142443g = r15
            r5.f142444h = r8
            r5.f142445i = r9
            r5.f142446j = r10
            r5.f142447k = r12
            r5.f142448l = r3
            r5.f142449m = r6
            r5.f142452p = r7
            r10 = 0
            r16 = 0
            r17 = 0
            r8 = r13
            r9 = r11
            r11 = r16
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r5
            java.lang.Object r8 = r8.w(r9, r10, r11, r12, r13, r14)
            if (r8 != r4) goto L_0x00c0
            return r4
        L_0x00c0:
            r13 = r16
            r14 = r17
            goto L_0x0074
        L_0x00c5:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.placeAllItemsInDesign(java.util.List, dI.e):java.lang.Object");
    }

    public Object placeItemInDesign(CachedCatalogItem cachedCatalogItem, SmartaPlacement smartaPlacement, C17164e<? super C16807N> eVar) {
        this.f142340w = null;
        Object x10 = x(this, cachedCatalogItem, false, false, (ModelScreenTransform) null, smartaPlacement, eVar, 12, (Object) null);
        return x10 == C17187b.f() ? x10 : C16807N.f139792a;
    }

    /* renamed from: processDoubleTapEvent-k-4lQ0M  reason: not valid java name */
    public void m53processDoubleTapEventk4lQ0M(long j10) {
        L("onGesture => DOUBLE_TAP");
        RF.k U10 = U(j10);
        if (U10 != null && !this.f142328k) {
            if (!this.f142341x) {
                C(U10);
                this.f142319b.X(MethodType.DoubleTap);
                return;
            }
            C(U10);
        }
    }

    /* renamed from: processDragEvent-3MmeM6k  reason: not valid java name */
    public void m54processDragEvent3MmeM6k(long j10, B b10) {
        C17542s.j(b10, "change");
        L("onGesture => DRAG");
        if (this.f142339v != null) {
            N(j10, b10);
        } else {
            q0(b10);
        }
    }

    /* renamed from: processLongPressEvent-k-4lQ0M  reason: not valid java name */
    public void m55processLongPressEventk4lQ0M(long j10) {
        L("onGesture => LONG_PRESS");
        d0(a.f142540c.a(C17351h.LONG_PRESS));
    }

    /* renamed from: processPanEvent-k-4lQ0M  reason: not valid java name */
    public void m56processPanEventk4lQ0M(long j10) {
        L("onGesture => PAN");
        p0(j10);
    }

    public void processRotateEvent(float f10) {
        L("onGesture => ROTATE");
        T(this, f10, false, 2, (Object) null);
    }

    /* renamed from: processTapEvent-k-4lQ0M  reason: not valid java name */
    public void m57processTapEventk4lQ0M(long j10) {
        L("onGesture => TAP");
        if (this.f142328k) {
            h0(j10);
        } else {
            i0(U(j10), false);
        }
        d0(a.f142540c.a(C17351h.TAP));
    }

    /* renamed from: processZoomEvent-3MmeM6k  reason: not valid java name */
    public void m58processZoomEvent3MmeM6k(long j10, float f10) {
        L("onGesture => ZOOM");
        if (this.f142341x) {
            r0(f10);
        } else {
            s0(j10, f10);
        }
    }

    public Object removeSelectedItemFromDesign(C17164e<? super C16807N> eVar) {
        C17597b bVar = this.f142339v;
        Object Q10 = Q(bVar != null ? bVar.e() : null, eVar);
        return Q10 == C17187b.f() ? Q10 : C16807N.f139792a;
    }

    public void restoreAllErasableItems() {
        if (this.f142328k) {
            this.f142315A.execEraserOp(EraserPickOp.Restore, EraserPickId.Companion.getKAll());
            o0();
        }
    }

    public void restorePreviousViewport() {
        W(this.f142331n);
    }

    public Object restorePreviouslySelectedVariant(C17164e<? super C16807N> eVar) {
        Object R10 = R(eVar);
        return R10 == C17187b.f() ? R10 : C16807N.f139792a;
    }

    public void rotateSelectedItemBy(float f10) {
        S(f10, true);
    }

    public Object saveCleanUp(boolean z10, C17164e<? super C16807N> eVar) {
        this.f142326i = C13549b.b(this.f142326i, (Integer) null, (Integer) null, false, (Boolean) null, kotlin.coroutines.jvm.internal.b.a(z10), (String) null, 47, (Object) null);
        X(false);
        return C16807N.f139792a;
    }

    public Object saveSceneLayout(C17495a aVar, C17164e<? super SceneLayout> eVar) {
        int i10 = f.f142377a[aVar.ordinal()];
        return this.f142315A.saveSceneLayout(this.f142329l, i10 != 1 ? i10 != 2 ? i10 != 3 ? LayoutThumbnailSpec.Companion.fromViewIndex(getInitialViewport().b()) : LayoutThumbnailSpec.LastViewBestThumbnail : LayoutThumbnailSpec.AllSmallThumbnails : LayoutThumbnailSpec.NoThumbnails);
    }

    public Object selectInstance(RF.k kVar, C17164e<? super C16807N> eVar) {
        Object obj;
        Iterator it = this.f142337t.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(kVar, (RF.k) obj)) {
                break;
            }
        }
        RF.k kVar2 = (RF.k) obj;
        if (kVar2 != null) {
            i0(kVar2, false);
        }
        return C16807N.f139792a;
    }

    public void setHelaWallColor(Integer num) {
        this.f142315A.setHelaWallColor(num);
        X(true);
    }

    public void setViewport(RF.j jVar) {
        if (this.f142341x) {
            A();
        }
        W(jVar);
        if (jVar != null) {
            this.f142331n = jVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object swapSelectedItemWith(com.sugarcube.app.base.data.database.CachedCatalogItem r15, boolean r16, dI.C17164e<? super iG.C17353j> r17) {
        /*
            r14 = this;
            r9 = r14
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.t
            if (r2 == 0) goto L_0x0019
            r2 = r1
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$t r2 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.t) r2
            int r3 = r2.f142508k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f142508k = r3
        L_0x0017:
            r6 = r2
            goto L_0x001f
        L_0x0019:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$t r2 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$t
            r2.<init>(r14, r1)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r2 = r6.f142506i
            java.lang.Object r10 = eI.C17187b.f()
            int r3 = r6.f142508k
            r4 = 1
            r11 = 0
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r0 = r6.f142504g
            o1.g r0 = (o1.C5667g) r0
            java.lang.Object r1 = r6.f142503f
            RF.k r1 = (RF.k) r1
            java.lang.Object r1 = r6.f142502e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r6.f142501d
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r1 = r6.f142500c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r1 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r1
            XH.y.b(r2)
            goto L_0x008c
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            XH.y.b(r2)
            if (r0 == 0) goto L_0x0056
            r14.g0()
            goto L_0x0058
        L_0x0056:
            r9.f142340w = r11
        L_0x0058:
            mG.b r2 = r9.f142339v
            if (r2 == 0) goto L_0x0061
            RF.k r2 = r2.e()
            goto L_0x0062
        L_0x0061:
            r2 = r11
        L_0x0062:
            o1.g r12 = r14.F(r2)
            r6.f142500c = r9
            r3 = r15
            r6.f142501d = r3
            r6.f142502e = r1
            r6.f142503f = r2
            r6.f142504g = r12
            r6.f142505h = r0
            r6.f142508k = r4
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 14
            r13 = 0
            r0 = r14
            r1 = r15
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r13
            java.lang.Object r0 = x(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L_0x008a
            return r10
        L_0x008a:
            r1 = r9
            r0 = r12
        L_0x008c:
            mG.b r2 = r1.f142339v
            if (r2 == 0) goto L_0x0095
            RF.k r2 = r2.e()
            goto L_0x0096
        L_0x0095:
            r2 = r11
        L_0x0096:
            o1.g r1 = r1.F(r2)
            iG.j r2 = new iG.j
            r2.<init>(r0, r1, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.swapSelectedItemWith(com.sugarcube.app.base.data.database.CachedCatalogItem, boolean, dI.e):java.lang.Object");
    }

    public boolean toggleMagicEraser() {
        if (this.f142328k) {
            disableMagicEraser();
        } else {
            enableMagicEraser();
        }
        return this.f142328k;
    }

    public void unFocusSelectedItem() {
        A();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateMultiviewInformation(dI.C17164e<? super java.util.List<mG.C17596a>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.v
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$v r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.v) r0
            int r1 = r0.f142533g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142533g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$v r0 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$v
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f142531e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142533g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r8 = r0.f142530d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f142529c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r8 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r8
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            XH.y.b(r1)
            kG.a r1 = kG.C17495a.MultiviewDrawer
            r0.f142529c = r7
            r0.f142530d = r8
            r0.f142533g = r4
            java.lang.Object r1 = r7.saveSceneLayout(r1, r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            com.sugarcube.decorate_engine.SceneLayout r1 = (com.sugarcube.decorate_engine.SceneLayout) r1
            if (r1 == 0) goto L_0x0099
            java.util.List r8 = r1.getThumbnails()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L_0x0065:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r8.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L_0x0076
            YH.C16877v.x()
        L_0x0076:
            java.lang.String r2 = (java.lang.String) r2
            mG.a r4 = new mG.a
            RF.j$a r5 = RF.j.Companion
            RF.j r1 = r5.a(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "file://"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r1, r2)
            r0.add(r4)
            r1 = r3
            goto L_0x0065
        L_0x0099:
            r0 = 0
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.updateMultiviewInformation(dI.e):java.lang.Object");
    }

    public final void y(boolean z10) {
        if (z10) {
            int i10 = C17346c.f143478a[Priority.DEBUG.ordinal()];
            Class<EngineManagerImpl> cls = EngineManagerImpl.class;
            if (i10 == 1) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                Log.v(name, "Clear selection" + " " + "");
            } else if (i10 == 2) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                Log.d(name2, "Clear selection" + " " + "");
            } else if (i10 == 3) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                Log.i(name3, "Clear selection" + " " + "");
            } else if (i10 == 4) {
                String name4 = cls.getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                Log.w(name4, "Clear selection" + " " + "");
            } else if (i10 == 5) {
                String name5 = cls.getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                Log.e(name5, "Clear selection" + " " + "");
            } else {
                throw new XH.t();
            }
            e0((C17597b) null);
        }
        this.f142315A.setModelInstanceSelected(ObjectInstanceId.Companion.getKAll(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateMultiviewInformation(boolean r6, dI.C17164e<? super java.util.List<mG.C17596a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.w
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$w r0 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.w) r0
            int r1 = r0.f142539h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142539h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$w r0 = new com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl$w
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f142537f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142539h
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            boolean r6 = r0.f142536e
            java.lang.Object r7 = r0.f142535d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f142534c
            com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl r7 = (com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl) r7
            XH.y.b(r1)
            goto L_0x004d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            XH.y.b(r1)
            r0.f142534c = r5
            r0.f142535d = r7
            r0.f142536e = r6
            r0.f142539h = r4
            java.lang.Object r1 = r5.updateMultiviewInformation(r0)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0053
            r6 = 0
            return r6
        L_0x0053:
            if (r6 == 0) goto L_0x008a
            RF.j r6 = RF.j.TOP
            RF.j r7 = RF.j.DOLLHOUSE_1
            RF.j r0 = RF.j.DOLLHOUSE_2
            RF.j[] r6 = new RF.j[]{r6, r7, r0}
            java.util.Set r6 = YH.g0.h(r6)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x006e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            r2 = r1
            mG.a r2 = (mG.C17596a) r2
            RF.j r2 = r2.a()
            boolean r2 = r6.contains(r2)
            if (r2 != 0) goto L_0x006e
            r7.add(r1)
            goto L_0x006e
        L_0x0089:
            r1 = r7
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl.updateMultiviewInformation(boolean, dI.e):java.lang.Object");
    }
}
