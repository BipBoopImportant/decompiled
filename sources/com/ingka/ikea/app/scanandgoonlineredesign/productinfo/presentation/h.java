package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import EB.C12832d;
import Ej.C10706a;
import Ej.F;
import Ej.G;
import FB.C12860a;
import HJ.C15854t;
import Hl.a;
import IC.C13026h;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sy.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tj.C10936a;
import Tj.C10939d;
import Tj.D;
import Tj.j;
import Tj.o;
import Uj.j;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.b;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.k;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.l;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hp.C11376b;
import hp.C11377c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import jj.C11420c;
import jj.C11421d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import lm.f;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15009b;
import rz.C15013f;
import rz.C15016i;
import rz.C15031y;
import rz.I;
import rz.O;
import rz.U;
import sp.C11879a;
import tI.C17978n;
import tz.C15100a;
import tz.C15101b;
import um.c;
import xj.C12314a;

@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B¹\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203H@¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002032\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001c\u0010;\u001a\u000203*\u00020\u00002\u0006\u00107\u001a\u00020:H@¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000203H\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000203H@¢\u0006\u0004\b?\u00105J\u0010\u0010@\u001a\u000203H@¢\u0006\u0004\b@\u00105J\u0018\u0010C\u001a\u0002032\u0006\u0010B\u001a\u00020AH@¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010K\u001a\u0002032\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010>J\u000f\u0010S\u001a\u000203H\u0002¢\u0006\u0004\bS\u0010>J\u0018\u0010U\u001a\u0002032\u0006\u0010T\u001a\u00020AH@¢\u0006\u0004\bU\u0010DJ \u0010X\u001a\u0002032\u0006\u0010T\u001a\u00020A2\u0006\u0010W\u001a\u00020VH@¢\u0006\u0004\bX\u0010YJ*\u0010^\u001a\u0002032\u0006\u0010T\u001a\u00020A2\u0006\u0010[\u001a\u00020Z2\b\b\u0002\u0010]\u001a\u00020\\H@¢\u0006\u0004\b^\u0010_J'\u0010a\u001a\u0002032\u0006\u0010T\u001a\u00020A2\u0006\u0010[\u001a\u00020Z2\u0006\u0010`\u001a\u00020VH\u0002¢\u0006\u0004\ba\u0010bJ\u001a\u0010c\u001a\u0002032\b\u0010B\u001a\u0004\u0018\u00010AH@¢\u0006\u0004\bc\u0010DJ\u001c\u0010d\u001a\u000203*\u00020\u00002\u0006\u0010B\u001a\u00020AH@¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u0002032\u0006\u0010f\u001a\u00020\\H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u0002032\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u000203H\u0002¢\u0006\u0004\bm\u0010>J\u0017\u0010o\u001a\u0002032\u0006\u0010n\u001a\u00020ZH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u0002032\u0006\u0010q\u001a\u00020ZH\u0002¢\u0006\u0004\br\u0010pJ\u0017\u0010s\u001a\u00020\\2\u0006\u0010T\u001a\u00020AH\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u000203H\u0002¢\u0006\u0004\bu\u0010>J\u0018\u0010x\u001a\u00020w2\u0006\u0010v\u001a\u00020HH@¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\\2\u0006\u0010T\u001a\u00020AH\u0002¢\u0006\u0004\bz\u0010tJ\u0017\u0010{\u001a\u00020\\2\u0006\u0010T\u001a\u00020AH\u0002¢\u0006\u0004\b{\u0010tJ(\u0010\u001a\u00020~2\u0006\u0010T\u001a\u00020A2\u0006\u0010|\u001a\u00020Z2\u0006\u0010}\u001a\u00020ZH\u0002¢\u0006\u0005\b\u0010\u0001J3\u0010\u0001\u001a\u0002032\u0006\u0010T\u001a\u00020A2\u0007\u0010\u0001\u001a\u00020\\2\u0006\u0010|\u001a\u00020Z2\u0006\u0010}\u001a\u00020ZH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020O2\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0001\u0010>J.\u0010\u0001\u001a\u0002032\u0006\u0010T\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010\u0001\u001a\u0002032\u0006\u0010T\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010`\u001a\u00020VH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020O2\u0006\u0010T\u001a\u00020A2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010`\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0001\u0010>J\u0015\u0010\u0001\u001a\u00020\\*\u00020AH\u0002¢\u0006\u0005\b\u0001\u0010tJ\u0012\u0010\u0001\u001a\u00020HH@¢\u0006\u0005\b\u0001\u00105J\u001b\u0010\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u0002032\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0001\u001a\u00020\\2\u0006\u0010T\u001a\u00020A¢\u0006\u0005\b\u0001\u0010tR\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010 \u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R!\u0010Ë\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010È\u00010Ç\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R \u0010Í\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010O0Ç\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Ê\u0001R!\u0010Ð\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Î\u00010Ç\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ê\u0001R\u001e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020H0Ç\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ê\u0001R\u001f\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R&\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ó\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ö\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001c\u0010ß\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Þ\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010æ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0017\u0010ì\u0001\u001a\u00020E8\u0002X\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0018\u0010ï\u0001\u001a\u00030â\u00018BX\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001R\u0017\u00107\u001a\u00030æ\u00018BX\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001¨\u0006ò\u0001"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h;", "Landroidx/lifecycle/f0;", "Lsp/a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/l;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/j;", "LTj/v;", "lookupProductUseCase", "LTj/G;", "updateProductQuantityUseCase", "LTj/a;", "addProductToCartUseCase", "LTj/j;", "collectProductUseCase", "LFB/a;", "localStoreSelectionRepository", "LHl/a;", "wifiConnector", "LTj/o;", "getQuantityForItemInCartUseCase", "LTj/d;", "addToFavouritesUseCase", "Ljj/d;", "scanFailureCounter", "Lum/c;", "subscribeBackInStockNotificationUseCase", "Llm/f;", "backInStockNotificationAnalytics", "LSy/a;", "scanAndGoAnalytics", "LXi/a;", "addProductToOnlineCartUseCase", "Lxj/a;", "productDetailsAnalytics", "LTj/q;", "getScannedObjectUseCase", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/c;", "buttonsUiStateMapper", "Landroidx/lifecycle/U;", "savedStateHandle", "Ltz/a;", "getProfileState", "LRy/a;", "scanAndGoSettingsRepo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/i;", "previousDestinationProvider", "Ltz/c;", "getScanTypeUseCase", "Ltz/b;", "getScanAndGoProductUseCase", "<init>", "(LTj/v;LTj/G;LTj/a;LTj/j;LFB/a;LHl/a;LTj/o;LTj/d;Ljj/d;Lum/c;Llm/f;LSy/a;LXi/a;Lxj/a;LTj/q;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/c;Landroidx/lifecycle/U;Ltz/a;LRy/a;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/i;Ltz/c;Ltz/b;)V", "LXH/N;", "B0", "(LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g$a;", "previousDestination", "C0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g$a;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g$b;", "D0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g$b;LdI/e;)Ljava/lang/Object;", "I0", "()V", "K0", "J0", "Lrz/I;", "scanAndGoProduct", "x0", "(Lrz/I;LdI/e;)Ljava/lang/Object;", "LQJ/N;", "u0", "()LQJ/N;", "", "itemNo", "itemType", "L0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lrz/b;", "apiError", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "M0", "(Lrz/b;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "S0", "O0", "product", "m0", "", "failure", "P0", "(Lrz/I;Ljava/lang/Throwable;LdI/e;)Ljava/lang/Object;", "", "qtyToCollect", "", "forceToCollect", "p0", "(Lrz/I;IZLdI/e;)Ljava/lang/Object;", "throwable", "R0", "(Lrz/I;ILjava/lang/Throwable;)V", "Q0", "l0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h;Lrz/I;LdI/e;)Ljava/lang/Object;", "addAvailableItemsToCart", "A0", "(Z)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "entryPoint", "W0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;)V", "X0", "quantity", "b1", "(I)V", "selectedValue", "a1", "E0", "(Lrz/I;)Z", "n0", "productId", "LTj/o$a;", "w0", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "G0", "H0", "quantityToCollect", "quantityInCart", "LUj/j;", "r0", "(Lrz/I;II)LUj/j;", "shouldExpandBottomSheet", "s0", "(Lrz/I;ZII)V", "LHl/a$a;", "connection", "o0", "(LHl/a$a;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "T0", "Llm/a$c;", "fulfilmentOption", "Lum/c$b;", "result", "V0", "(Lrz/I;Llm/a$c;Lum/c$b;)V", "U0", "(Lrz/I;Llm/a$c;Ljava/lang/Throwable;)V", "Lum/c$a;", "z0", "(Lrz/I;Llm/a$c;Lum/c$a;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "Z0", "F0", "y0", "action", "N0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/l;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/k;", "track", "Y0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/k;)V", "c1", "m", "LTj/v;", "n", "LTj/G;", "o", "LTj/a;", "p", "LTj/j;", "q", "LFB/a;", "r", "LHl/a;", "s", "LTj/o;", "t", "Ljj/d;", "u", "Lum/c;", "v", "Llm/f;", "w", "LSy/a;", "x", "LXi/a;", "y", "Lxj/a;", "z", "LTj/q;", "A", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/c;", "B", "Ltz/a;", "C", "LRy/a;", "D", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/i;", "E", "Ltz/c;", "F", "Ltz/b;", "LTJ/B;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/e;", "G", "LTJ/B;", "loading", "H", "navigateTo", "LEj/G;", "I", "showProductInfo", "J", "currentRoute", "LTJ/P;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "K", "LTJ/P;", "canAddToFavouritesFlow", "L", "getState", "()LTJ/P;", "state", "LQJ/F0;", "M", "LQJ/F0;", "delayedQuantityUpdate", "N", "quantityUpdate", "LEj/a;", "O", "LEj/a;", "_productInfo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g;", "P", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g;", "_previousDestination", "Q", "LQJ/N;", "productExceptionHandler", "v0", "()LEj/a;", "productInfo", "t0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends f0 implements C11879a<l, j> {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final c f91806A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final C15100a f91807B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final Ry.a f91808C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final i f91809D;

    /* renamed from: E  reason: collision with root package name */
    private final tz.c f91810E;

    /* renamed from: F  reason: collision with root package name */
    private final C15101b f91811F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C16505B<e> f91812G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final C16505B<f> f91813H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final C16505B<G> f91814I;

    /* renamed from: J  reason: collision with root package name */
    private final C16505B<String> f91815J;

    /* renamed from: K  reason: collision with root package name */
    private final C16519P<a> f91816K;

    /* renamed from: L  reason: collision with root package name */
    private final C16519P<j> f91817L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public F0 f91818M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public F0 f91819N;

    /* renamed from: O  reason: collision with root package name */
    private C10706a f91820O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public g f91821P;

    /* renamed from: Q  reason: collision with root package name */
    private final N f91822Q;

    /* renamed from: m  reason: collision with root package name */
    private final Tj.v f91823m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Tj.G f91824n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C10936a f91825o;

    /* renamed from: p  reason: collision with root package name */
    private final Tj.j f91826p;

    /* renamed from: q  reason: collision with root package name */
    private final C12860a f91827q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Hl.a f91828r;

    /* renamed from: s  reason: collision with root package name */
    private final Tj.o f91829s;

    /* renamed from: t  reason: collision with root package name */
    private final C11421d f91830t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final um.c f91831u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final lm.f f91832v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final Sy.a f91833w;

    /* renamed from: x  reason: collision with root package name */
    private final Xi.a f91834x;

    /* renamed from: y  reason: collision with root package name */
    private final C12314a f91835y;

    /* renamed from: z  reason: collision with root package name */
    private final Tj.q f91836z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$1", f = "ProductInfoPageFragmentViewModel.kt", l = {155}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91837c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f91838d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ U f91839e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, U u10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91838d = hVar;
            this.f91839e = u10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f91838d, this.f91839e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91837c;
            if (i10 == 0) {
                y.b(obj);
                h hVar = this.f91838d;
                hVar.f91821P = hVar.f91809D.a(this.f91839e);
                h hVar2 = this.f91838d;
                this.f91837c = 1;
                if (hVar2.B0(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f91838d.I0();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f91840a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f91841b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f91842c;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005d */
        static {
            /*
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                rz.y r2 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                rz.y r3 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                rz.y r4 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                rz.y r5 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                rz.y r6 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f91840a = r0
                rz.O[] r0 = rz.O.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.O r6 = rz.O.QR     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                rz.O r6 = rz.O.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x004d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                rz.O r2 = rz.O.BARCODE     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                rz.O r2 = rz.O.MANUAL_INPUT     // Catch:{ NoSuchFieldError -> 0x005d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r2] = r4     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                rz.O r2 = rz.O.AS_IS     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                f91841b = r0
                Hl.a$a[] r0 = Hl.a.C1585a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hl.a$a r2 = Hl.a.C1585a.WIFI     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                f91842c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {559, 551}, m = "addProductToOnlineCart")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91843c;

        /* renamed from: d  reason: collision with root package name */
        Object f91844d;

        /* renamed from: e  reason: collision with root package name */
        Object f91845e;

        /* renamed from: f  reason: collision with root package name */
        Object f91846f;

        /* renamed from: g  reason: collision with root package name */
        Object f91847g;

        /* renamed from: h  reason: collision with root package name */
        Object f91848h;

        /* renamed from: i  reason: collision with root package name */
        Object f91849i;

        /* renamed from: j  reason: collision with root package name */
        Object f91850j;

        /* renamed from: k  reason: collision with root package name */
        Object f91851k;

        /* renamed from: l  reason: collision with root package name */
        Object f91852l;

        /* renamed from: m  reason: collision with root package name */
        Object f91853m;

        /* renamed from: n  reason: collision with root package name */
        double f91854n;

        /* renamed from: o  reason: collision with root package name */
        int f91855o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f91856p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ h f91857q;

        /* renamed from: r  reason: collision with root package name */
        int f91858r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f91857q = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91856p = obj;
            this.f91858r |= Integer.MIN_VALUE;
            return this.f91857q.l0((h) null, (I) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {411, 412, 407, 423}, m = "addToCart")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91859c;

        /* renamed from: d  reason: collision with root package name */
        Object f91860d;

        /* renamed from: e  reason: collision with root package name */
        Object f91861e;

        /* renamed from: f  reason: collision with root package name */
        Object f91862f;

        /* renamed from: g  reason: collision with root package name */
        Object f91863g;

        /* renamed from: h  reason: collision with root package name */
        Object f91864h;

        /* renamed from: i  reason: collision with root package name */
        Object f91865i;

        /* renamed from: j  reason: collision with root package name */
        Object f91866j;

        /* renamed from: k  reason: collision with root package name */
        int f91867k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f91868l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f91869m;

        /* renamed from: n  reason: collision with root package name */
        int f91870n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f91869m = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91868l = obj;
            this.f91870n |= Integer.MIN_VALUE;
            return this.f91869m.m0((I) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {477, 478, 473}, m = "collect")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91871c;

        /* renamed from: d  reason: collision with root package name */
        Object f91872d;

        /* renamed from: e  reason: collision with root package name */
        Object f91873e;

        /* renamed from: f  reason: collision with root package name */
        Object f91874f;

        /* renamed from: g  reason: collision with root package name */
        Object f91875g;

        /* renamed from: h  reason: collision with root package name */
        Object f91876h;

        /* renamed from: i  reason: collision with root package name */
        Object f91877i;

        /* renamed from: j  reason: collision with root package name */
        int f91878j;

        /* renamed from: k  reason: collision with root package name */
        int f91879k;

        /* renamed from: l  reason: collision with root package name */
        int f91880l;

        /* renamed from: m  reason: collision with root package name */
        boolean f91881m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f91882n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ h f91883o;

        /* renamed from: p  reason: collision with root package name */
        int f91884p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f91883o = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91882n = obj;
            this.f91884p |= Integer.MIN_VALUE;
            return this.f91883o.p0((I) null, 0, false, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f91885a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, h hVar) {
            super(aVar);
            this.f91885a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            String str;
            String str2;
            char c10;
            char c11;
            boolean z10;
            String str3;
            Object value;
            boolean z11;
            String str4;
            Object value2;
            boolean z12;
            String str5;
            Object value3;
            String str6;
            Object value4;
            Throwable th3 = th2;
            char c12 = '$';
            String str7 = null;
            if ((th3 instanceof IllegalArgumentException) || (th3 instanceof C11376b)) {
                str = null;
                C16505B J10 = this.f91885a.f91813H;
                while (true) {
                    Object value5 = J10.getValue();
                    f fVar = (f) value5;
                    if (J10.e(value5, new f.g(false, 1, (DefaultConstructorMarker) null))) {
                        break;
                    }
                }
                h hVar = this.f91885a;
                qv.e eVar = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                Iterator it = qv.d.f102012a.a().iterator();
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar : arrayList) {
                    if (str9 == null) {
                        String a10 = C11818a.a((String) null, th3);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    } else {
                        str3 = str9;
                    }
                    if (str8 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str10 = str8;
                    bVar.a(eVar, str10, z10, th2, str3);
                    str9 = str3;
                    str8 = str10;
                    z10 = z10;
                }
            } else if (th3 instanceof C11377c) {
                if (((C11377c) th3).a() != C11377c.a.CANCELLED) {
                    a.C1585a a11 = this.f91885a.f91828r.a();
                    C16505B J11 = this.f91885a.f91813H;
                    do {
                        value4 = J11.getValue();
                        f fVar2 = (f) value4;
                    } while (!J11.e(value4, this.f91885a.o0(a11)));
                } else {
                    C16505B J12 = this.f91885a.f91813H;
                    do {
                        value3 = J12.getValue();
                        f fVar3 = (f) value3;
                    } while (!J12.e(value3, new f.g(false, 1, (DefaultConstructorMarker) null)));
                    h hVar2 = this.f91885a;
                    qv.e eVar2 = qv.e.WARN;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str11 = null;
                    String str12 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str11 == null) {
                            String a12 = C11818a.a(str7, th3);
                            if (a12 == null) {
                                break;
                            }
                            str11 = C11820c.a(a12);
                        }
                        String str13 = str11;
                        if (str12 == null) {
                            String name2 = hVar2.getClass().getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, c12, str7, 2, str7), '.', str7, 2, str7);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        } else {
                            str6 = str12;
                        }
                        bVar2.a(eVar2, str6, false, th2, str13);
                        str7 = str7;
                        str12 = str6;
                        hVar2 = hVar2;
                        str11 = str13;
                        eVar2 = eVar2;
                        c12 = '$';
                    }
                }
                str = str7;
            } else {
                str = null;
                if (th3 instanceof IllegalStateException) {
                    h hVar3 = this.f91885a;
                    qv.e eVar3 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    Iterator it2 = qv.d.f102012a.a().iterator();
                    while (true) {
                        z12 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next3 = it2.next();
                        if (((C11819b) next3).b(eVar3, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str14 = null;
                    String str15 = null;
                    for (C11819b bVar3 : arrayList3) {
                        if (str15 == null) {
                            String a13 = C11818a.a((String) null, th3);
                            if (a13 == null) {
                                break;
                            }
                            str5 = C11820c.a(a13);
                        } else {
                            str5 = str15;
                        }
                        if (str14 == null) {
                            String name3 = hVar3.getClass().getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                        }
                        String str16 = str14;
                        bVar3.a(eVar3, str16, z12, th2, str5);
                        str15 = str5;
                        str14 = str16;
                        z12 = z12;
                    }
                } else if (th3 instanceof C15009b) {
                    C16505B J13 = this.f91885a.f91813H;
                    do {
                        value2 = J13.getValue();
                        f fVar4 = (f) value2;
                    } while (!J13.e(value2, this.f91885a.M0((C15009b) th3)));
                } else {
                    C16505B J14 = this.f91885a.f91813H;
                    do {
                        value = J14.getValue();
                        f fVar5 = (f) value;
                    } while (!J14.e(value, new f.g(false, 1, (DefaultConstructorMarker) null)));
                    h hVar4 = this.f91885a;
                    qv.e eVar4 = qv.e.WARN;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    Iterator it3 = qv.d.f102012a.a().iterator();
                    while (true) {
                        z11 = false;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next4 = it3.next();
                        if (((C11819b) next4).b(eVar4, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str17 = null;
                    String str18 = null;
                    for (C11819b bVar4 : arrayList4) {
                        if (str18 == null) {
                            String a14 = C11818a.a((String) null, th3);
                            if (a14 == null) {
                                break;
                            }
                            str4 = C11820c.a(a14);
                        } else {
                            str4 = str18;
                        }
                        if (str17 == null) {
                            String name4 = hVar4.getClass().getName();
                            C17542s.g(name4);
                            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o15.length() != 0) {
                                name4 = C15854t.P0(o15, "Kt");
                            }
                            str17 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                        }
                        String str19 = str17;
                        bVar4.a(eVar4, str19, z11, th2, str4);
                        str18 = str4;
                        str17 = str19;
                        z11 = z11;
                    }
                }
            }
            C16505B I10 = this.f91885a.f91812G;
            while (true) {
                Object value6 = I10.getValue();
                e eVar5 = (e) value6;
                if (I10.e(value6, str)) {
                    break;
                }
            }
            h hVar5 = this.f91885a;
            qv.e eVar6 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList5 = new ArrayList<>();
            for (Object next5 : qv.d.f102012a.a()) {
                if (((C11819b) next5).b(eVar6, false)) {
                    arrayList5.add(next5);
                }
            }
            String str20 = str;
            String str21 = str20;
            for (C11819b bVar5 : arrayList5) {
                if (str21 == null) {
                    String a15 = C11818a.a(str, th3);
                    if (a15 != null) {
                        str2 = C11820c.a(a15);
                    } else {
                        return;
                    }
                } else {
                    str2 = str21;
                }
                if (str20 == null) {
                    String name5 = hVar5.getClass().getName();
                    C17542s.g(name5);
                    c10 = '$';
                    c11 = '.';
                    String o16 = C15854t.o1(C15854t.s1(name5, '$', str, 2, str), '.', str, 2, str);
                    if (o16.length() != 0) {
                        name5 = C15854t.P0(o16, "Kt");
                    }
                    str20 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name5;
                } else {
                    c10 = '$';
                    c11 = '.';
                }
                String str22 = str20;
                char c13 = c10;
                char c14 = c11;
                bVar5.a(eVar6, str22, false, th2, str2);
                str21 = str2;
                str20 = str22;
                str = null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {252}, m = "getQuantityAndCreateShowState")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91886c;

        /* renamed from: d  reason: collision with root package name */
        Object f91887d;

        /* renamed from: e  reason: collision with root package name */
        Object f91888e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f91889f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f91890g;

        /* renamed from: h  reason: collision with root package name */
        int f91891h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f91890g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91889f = obj;
            this.f91891h |= Integer.MIN_VALUE;
            return this.f91890g.x0((I) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {1029}, m = "getStoreId")
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$h  reason: collision with other inner class name */
    static final class C2027h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91892c;

        /* renamed from: d  reason: collision with root package name */
        Object f91893d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f91894e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f91895f;

        /* renamed from: g  reason: collision with root package name */
        int f91896g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2027h(h hVar, C17164e<? super C2027h> eVar) {
            super(eVar);
            this.f91895f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91894e = obj;
            this.f91896g |= Integer.MIN_VALUE;
            return this.f91895f.y0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$handleUnavailableProductPromptResult$1", f = "ProductInfoPageFragmentViewModel.kt", l = {598, 599, 593, 611, 615}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91897c;

        /* renamed from: d  reason: collision with root package name */
        Object f91898d;

        /* renamed from: e  reason: collision with root package name */
        Object f91899e;

        /* renamed from: f  reason: collision with root package name */
        Object f91900f;

        /* renamed from: g  reason: collision with root package name */
        Object f91901g;

        /* renamed from: h  reason: collision with root package name */
        Object f91902h;

        /* renamed from: i  reason: collision with root package name */
        int f91903i;

        /* renamed from: j  reason: collision with root package name */
        int f91904j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h f91905k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f91906l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar, boolean z10, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f91905k = hVar;
            this.f91906l = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f91905k, this.f91906l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0136 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0196  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r8 = r15
                java.lang.Object r9 = eI.C17187b.f()
                int r0 = r8.f91904j
                r1 = 5
                r10 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r11 = 0
                if (r0 == 0) goto L_0x00a7
                if (r0 == r4) goto L_0x0088
                if (r0 == r3) goto L_0x006a
                if (r0 == r2) goto L_0x0045
                if (r0 == r10) goto L_0x0030
                if (r0 != r1) goto L_0x0028
                java.lang.Object r0 = r8.f91898d
                rz.I r0 = (rz.I) r0
                java.lang.Object r0 = r8.f91897c
                rz.I r0 = (rz.I) r0
                XH.y.b(r16)
                r1 = r16
                goto L_0x01be
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0030:
                java.lang.Object r0 = r8.f91901g
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r8.f91900f
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r0
                java.lang.Object r0 = r8.f91899e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r0
                java.lang.Object r0 = r8.f91897c
                rz.I r0 = (rz.I) r0
                XH.y.b(r16)
                goto L_0x01cd
            L_0x0045:
                java.lang.Object r0 = r8.f91902h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f91901g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f91900f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f91899e
                rz.O r0 = (rz.O) r0
                java.lang.Object r0 = r8.f91898d
                Tj.a r0 = (Tj.C10936a) r0
                java.lang.Object r0 = r8.f91897c
                rz.I r0 = (rz.I) r0
                XH.y.b(r16)
                r1 = r16
                XH.x r1 = (XH.x) r1
                java.lang.Object r1 = r1.j()
                goto L_0x015e
            L_0x006a:
                java.lang.Object r0 = r8.f91901g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r8.f91900f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r8.f91899e
                rz.O r3 = (rz.O) r3
                java.lang.Object r4 = r8.f91898d
                Tj.a r4 = (Tj.C10936a) r4
                java.lang.Object r5 = r8.f91897c
                rz.I r5 = (rz.I) r5
                XH.y.b(r16)
                r6 = r0
                r12 = r5
                r0 = r16
            L_0x0085:
                r5 = r1
                goto L_0x013d
            L_0x0088:
                int r0 = r8.f91903i
                java.lang.Object r1 = r8.f91901g
                Sy.a$b r1 = (Sy.a.b) r1
                java.lang.Object r1 = r8.f91900f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r8.f91899e
                rz.O r4 = (rz.O) r4
                java.lang.Object r5 = r8.f91898d
                Tj.a r5 = (Tj.C10936a) r5
                java.lang.Object r6 = r8.f91897c
                rz.I r6 = (rz.I) r6
                XH.y.b(r16)
                r7 = r6
                r6 = r4
                r4 = r16
                goto L_0x011a
            L_0x00a7:
                XH.y.b(r16)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r0 = r8.f91905k
                TJ.B r0 = r0.f91814I
                java.lang.Object r0 = r0.getValue()
                Ej.G r0 = (Ej.G) r0
                r5 = 0
                if (r0 == 0) goto L_0x00be
                rz.I r0 = r0.c()
                goto L_0x00bf
            L_0x00be:
                r0 = r5
            L_0x00bf:
                if (r0 == 0) goto L_0x01d0
                boolean r6 = r8.f91906l
                if (r6 == 0) goto L_0x01ab
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = r8.f91905k
                TJ.B r6 = r1.f91812G
            L_0x00cb:
                java.lang.Object r1 = r6.getValue()
                r7 = r1
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r7 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r7
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$a r7 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.a.f91765a
                boolean r1 = r6.e(r1, r7)
                if (r1 == 0) goto L_0x00cb
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = r8.f91905k
                Tj.a r1 = r1.f91825o
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r6 = r8.f91905k
                Ej.a r6 = r6.v0()
                rz.O r6 = r6.h()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r7 = r8.f91905k
                Ej.a r7 = r7.v0()
                Sy.a$b r7 = r7.e()
                if (r7 == 0) goto L_0x00fa
                java.lang.String r5 = r7.j()
            L_0x00fa:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r12 = r8.f91905k
                tz.a r12 = r12.f91807B
                r8.f91897c = r0
                r8.f91898d = r1
                r8.f91899e = r6
                r8.f91900f = r5
                r8.f91901g = r7
                r8.f91903i = r11
                r8.f91904j = r4
                java.lang.Object r4 = r12.a(r15)
                if (r4 != r9) goto L_0x0115
                return r9
            L_0x0115:
                r7 = r0
                r0 = r11
                r14 = r5
                r5 = r1
                r1 = r14
            L_0x011a:
                rz.K r4 = (rz.K) r4
                java.lang.String r4 = r4.a()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r12 = r8.f91905k
                r8.f91897c = r7
                r8.f91898d = r5
                r8.f91899e = r6
                r8.f91900f = r1
                r8.f91901g = r4
                r8.f91903i = r0
                r8.f91904j = r3
                java.lang.Object r0 = r12.y0(r15)
                if (r0 != r9) goto L_0x0137
                return r9
            L_0x0137:
                r3 = r6
                r12 = r7
                r6 = r4
                r4 = r5
                goto L_0x0085
            L_0x013d:
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                r8.f91897c = r12
                r8.f91898d = r4
                r8.f91899e = r3
                r8.f91900f = r5
                r8.f91901g = r6
                r8.f91902h = r7
                r8.f91904j = r2
                r13 = 1
                r0 = r4
                r1 = r12
                r2 = r3
                r3 = r5
                r4 = r13
                r5 = r7
                r7 = r15
                java.lang.Object r1 = r0.a(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != r9) goto L_0x015d
                return r9
            L_0x015d:
                r0 = r12
            L_0x015e:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r8.f91905k
                java.lang.Throwable r3 = XH.x.e(r1)
                if (r3 != 0) goto L_0x0196
                XH.N r1 = (XH.C16807N) r1
                Sy.a r1 = r2.f91833w
                java.lang.String r3 = r0.c()
                rz.y r4 = r0.p()
                java.lang.String r4 = r4.b()
                r1.G(r3, r4)
                TJ.B r4 = r2.f91813H
            L_0x017f:
                java.lang.Object r1 = r4.getValue()
                r2 = r1
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r2
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$b r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$b
                rz.v r3 = r0.f()
                r2.<init>(r0, r3)
                boolean r1 = r4.e(r1, r2)
                if (r1 == 0) goto L_0x017f
                goto L_0x01cd
            L_0x0196:
                r8.f91897c = r0
                r8.f91898d = r1
                r8.f91899e = r2
                r8.f91900f = r2
                r8.f91901g = r3
                r8.f91903i = r11
                r8.f91904j = r10
                java.lang.Object r0 = r2.P0(r0, r3, r15)
                if (r0 != r9) goto L_0x01cd
                return r9
            L_0x01ab:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r8.f91905k
                java.lang.String r3 = r0.c()
                r8.f91897c = r0
                r8.f91898d = r0
                r8.f91904j = r1
                java.lang.Object r1 = r2.w0(r3, r15)
                if (r1 != r9) goto L_0x01be
                return r9
            L_0x01be:
                Tj.o$a r1 = (Tj.o.a) r1
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r8.f91905k
                int r3 = r1.b()
                int r1 = r1.a()
                r2.s0(r0, r11, r3, r1)
            L_0x01cd:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x01d0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {194}, m = "initShopAndGoCartProductInfo")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91907c;

        /* renamed from: d  reason: collision with root package name */
        Object f91908d;

        /* renamed from: e  reason: collision with root package name */
        Object f91909e;

        /* renamed from: f  reason: collision with root package name */
        Object f91910f;

        /* renamed from: g  reason: collision with root package name */
        Object f91911g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f91912h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f91913i;

        /* renamed from: j  reason: collision with root package name */
        int f91914j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f91913i = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91912h = obj;
            this.f91914j |= Integer.MIN_VALUE;
            return this.f91913i.D0((h) null, (g.b) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$loadProduct$1", f = "ProductInfoPageFragmentViewModel.kt", l = {210, 211}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91915c;

        /* renamed from: d  reason: collision with root package name */
        Object f91916d;

        /* renamed from: e  reason: collision with root package name */
        Object f91917e;

        /* renamed from: f  reason: collision with root package name */
        int f91918f;

        /* renamed from: g  reason: collision with root package name */
        int f91919g;

        /* renamed from: h  reason: collision with root package name */
        int f91920h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f91921i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f91921i = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f91921i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            e.C2024e eVar;
            Object value3;
            Object f10 = C17187b.f();
            int i10 = this.f91920h;
            if (i10 == 0) {
                y.b(obj);
                C16505B I10 = this.f91921i.f91812G;
                do {
                    value2 = I10.getValue();
                    e eVar2 = (e) value2;
                    eVar = e.C2024e.f91769a;
                } while (!I10.e(value2, eVar));
                g K10 = this.f91921i.t0();
                if (K10 instanceof g.a) {
                    h hVar = this.f91921i;
                    this.f91915c = K10;
                    this.f91916d = value2;
                    this.f91917e = eVar;
                    this.f91918f = 0;
                    this.f91919g = 0;
                    this.f91920h = 1;
                    if (hVar.K0(this) == f10) {
                        return f10;
                    }
                } else if (K10 instanceof g.b) {
                    h hVar2 = this.f91921i;
                    this.f91915c = K10;
                    this.f91916d = value2;
                    this.f91917e = eVar;
                    this.f91918f = 0;
                    this.f91919g = 0;
                    this.f91920h = 2;
                    if (hVar2.J0(this) == f10) {
                        return f10;
                    }
                } else if (C17542s.e(K10, g.c.f91805a)) {
                    C16505B J10 = this.f91921i.f91813H;
                    do {
                        value3 = J10.getValue();
                        f fVar = (f) value3;
                    } while (!J10.e(value3, new f.g(true)));
                } else {
                    throw new XH.t();
                }
            } else if (i10 == 1 || i10 == 2) {
                e eVar3 = (e) this.f91917e;
                g gVar = (g) this.f91915c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B I11 = this.f91921i.f91812G;
            do {
                value = I11.getValue();
                e eVar4 = (e) value;
            } while (!I11.e(value, null));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {239, 248}, m = "loadProductWithBarcode")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91922c;

        /* renamed from: d  reason: collision with root package name */
        Object f91923d;

        /* renamed from: e  reason: collision with root package name */
        Object f91924e;

        /* renamed from: f  reason: collision with root package name */
        Object f91925f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f91926g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f91927h;

        /* renamed from: i  reason: collision with root package name */
        int f91928i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f91927h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91926g = obj;
            this.f91928i |= Integer.MIN_VALUE;
            return this.f91927h.J0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {224, 222, 235}, m = "loadProductWithScannedObject")
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91929c;

        /* renamed from: d  reason: collision with root package name */
        Object f91930d;

        /* renamed from: e  reason: collision with root package name */
        Object f91931e;

        /* renamed from: f  reason: collision with root package name */
        Object f91932f;

        /* renamed from: g  reason: collision with root package name */
        Object f91933g;

        /* renamed from: h  reason: collision with root package name */
        Object f91934h;

        /* renamed from: i  reason: collision with root package name */
        Object f91935i;

        /* renamed from: j  reason: collision with root package name */
        Object f91936j;

        /* renamed from: k  reason: collision with root package name */
        Object f91937k;

        /* renamed from: l  reason: collision with root package name */
        Object f91938l;

        /* renamed from: m  reason: collision with root package name */
        Object f91939m;

        /* renamed from: n  reason: collision with root package name */
        int f91940n;

        /* renamed from: o  reason: collision with root package name */
        int f91941o;

        /* renamed from: p  reason: collision with root package name */
        boolean f91942p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f91943q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ h f91944r;

        /* renamed from: s  reason: collision with root package name */
        int f91945s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h hVar, C17164e<? super m> eVar) {
            super(eVar);
            this.f91944r = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91943q = obj;
            this.f91945s |= Integer.MIN_VALUE;
            return this.f91944r.K0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$onAction$1", f = "ProductInfoPageFragmentViewModel.kt", l = {273}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91946c;

        /* renamed from: d  reason: collision with root package name */
        int f91947d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f91948e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h hVar, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f91948e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f91948e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91947d;
            if (i10 == 0) {
                y.b(obj);
                h hVar = this.f91948e;
                G g10 = (G) hVar.f91814I.getValue();
                I c10 = g10 != null ? g10.c() : null;
                if (c10 != null) {
                    this.f91946c = c10;
                    this.f91947d = 1;
                    if (hVar.Q0(c10, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                I i11 = (I) this.f91946c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$onAddToCartClicked$1", f = "ProductInfoPageFragmentViewModel.kt", l = {394, 395, 396}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91949c;

        /* renamed from: d  reason: collision with root package name */
        Object f91950d;

        /* renamed from: e  reason: collision with root package name */
        Object f91951e;

        /* renamed from: f  reason: collision with root package name */
        int f91952f;

        /* renamed from: g  reason: collision with root package name */
        int f91953g;

        /* renamed from: h  reason: collision with root package name */
        int f91954h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f91955i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f91955i = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f91955i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f91954h
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x004a
                if (r1 == r4) goto L_0x0038
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r0 = r8.f91951e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r0
                java.lang.Object r0 = r8.f91949c
                rz.I r0 = (rz.I) r0
                XH.y.b(r9)
                goto L_0x00cc
            L_0x001e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0026:
                int r1 = r8.f91953g
                int r3 = r8.f91952f
                java.lang.Object r4 = r8.f91951e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r4 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r4
                java.lang.Object r5 = r8.f91950d
                java.lang.Object r6 = r8.f91949c
                QJ.F0 r6 = (QJ.F0) r6
                XH.y.b(r9)
                goto L_0x00a0
            L_0x0038:
                int r1 = r8.f91953g
                int r4 = r8.f91952f
                java.lang.Object r5 = r8.f91951e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r5 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r5
                java.lang.Object r6 = r8.f91950d
                java.lang.Object r7 = r8.f91949c
                QJ.F0 r7 = (QJ.F0) r7
                XH.y.b(r9)
                goto L_0x0082
            L_0x004a:
                XH.y.b(r9)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r8.f91955i
                TJ.B r9 = r9.f91812G
            L_0x0053:
                java.lang.Object r6 = r9.getValue()
                r1 = r6
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r1 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r1
                if (r1 != 0) goto L_0x005e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$a r1 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.a.f91765a
            L_0x005e:
                r5 = r1
                boolean r1 = r9.e(r6, r5)
                if (r1 == 0) goto L_0x0053
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r8.f91955i
                QJ.F0 r9 = r9.f91818M
                r1 = 0
                if (r9 == 0) goto L_0x0081
                r8.f91949c = r9
                r8.f91950d = r6
                r8.f91951e = r5
                r8.f91952f = r1
                r8.f91953g = r1
                r8.f91954h = r4
                java.lang.Object r9 = r9.j0(r8)
                if (r9 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r4 = r1
            L_0x0082:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r8.f91955i
                QJ.F0 r9 = r9.f91819N
                if (r9 == 0) goto L_0x00a3
                r8.f91949c = r9
                r8.f91950d = r6
                r8.f91951e = r5
                r8.f91952f = r4
                r8.f91953g = r1
                r8.f91954h = r3
                java.lang.Object r9 = r9.j0(r8)
                if (r9 != r0) goto L_0x009d
                return r0
            L_0x009d:
                r3 = r4
                r4 = r5
                r5 = r6
            L_0x00a0:
                r6 = r5
                r5 = r4
                r4 = r3
            L_0x00a3:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r8.f91955i
                TJ.B r3 = r9.f91814I
                java.lang.Object r3 = r3.getValue()
                Ej.G r3 = (Ej.G) r3
                if (r3 == 0) goto L_0x00b6
                rz.I r3 = r3.c()
                goto L_0x00b7
            L_0x00b6:
                r3 = 0
            L_0x00b7:
                if (r3 == 0) goto L_0x00cf
                r8.f91949c = r3
                r8.f91950d = r6
                r8.f91951e = r5
                r8.f91952f = r4
                r8.f91953g = r1
                r8.f91954h = r2
                java.lang.Object r9 = r9.m0(r3, r8)
                if (r9 != r0) goto L_0x00cc
                return r0
            L_0x00cc:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x00cf:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel", f = "ProductInfoPageFragmentViewModel.kt", l = {528}, m = "onAddToOnlineCartClicked")
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91956c;

        /* renamed from: d  reason: collision with root package name */
        Object f91957d;

        /* renamed from: e  reason: collision with root package name */
        Object f91958e;

        /* renamed from: f  reason: collision with root package name */
        Object f91959f;

        /* renamed from: g  reason: collision with root package name */
        Object f91960g;

        /* renamed from: h  reason: collision with root package name */
        Object f91961h;

        /* renamed from: i  reason: collision with root package name */
        int f91962i;

        /* renamed from: j  reason: collision with root package name */
        int f91963j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f91964k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f91965l;

        /* renamed from: m  reason: collision with root package name */
        int f91966m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h hVar, C17164e<? super p> eVar) {
            super(eVar);
            this.f91965l = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91964k = obj;
            this.f91966m |= Integer.MIN_VALUE;
            return this.f91965l.Q0((I) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$onConfirmQtyToCollect$1", f = "ProductInfoPageFragmentViewModel.kt", l = {380}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91967c;

        /* renamed from: d  reason: collision with root package name */
        int f91968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f91969e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f91969e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f91969e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91968d;
            if (i10 == 0) {
                y.b(obj);
                Object value = this.f91969e.f91814I.getValue();
                if (value != null) {
                    G g10 = (G) value;
                    h hVar = this.f91969e;
                    I c10 = g10.c();
                    int c11 = g10.c().m().c();
                    this.f91967c = g10;
                    this.f91968d = 1;
                    if (hVar.p0(c10, c11, true, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                G g11 = (G) this.f91967c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$onSubscribeToBackInStockNotification$1$1", f = "ProductInfoPageFragmentViewModel.kt", l = {888, 894, 900, 905}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91970c;

        /* renamed from: d  reason: collision with root package name */
        Object f91971d;

        /* renamed from: e  reason: collision with root package name */
        Object f91972e;

        /* renamed from: f  reason: collision with root package name */
        Object f91973f;

        /* renamed from: g  reason: collision with root package name */
        Object f91974g;

        /* renamed from: h  reason: collision with root package name */
        Object f91975h;

        /* renamed from: i  reason: collision with root package name */
        Object f91976i;

        /* renamed from: j  reason: collision with root package name */
        int f91977j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f91978k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f91979l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ I f91980m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(h hVar, I i10, C17164e<? super r> eVar) {
            super(2, eVar);
            this.f91979l = hVar;
            this.f91980m = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            r rVar = new r(this.f91979l, this.f91980m, eVar);
            rVar.f91978k = obj;
            return rVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((r) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0104 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0159 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x015a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0175  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r6 = r17
                java.lang.Object r7 = eI.C17187b.f()
                int r0 = r6.f91977j
                r1 = 4
                r2 = 3
                r3 = 1
                r4 = 2
                if (r0 == 0) goto L_0x008e
                if (r0 == r3) goto L_0x0084
                if (r0 == r4) goto L_0x0071
                if (r0 == r2) goto L_0x0047
                if (r0 != r1) goto L_0x003f
                java.lang.Object r0 = r6.f91976i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f91975h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f91973f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f91972e
                lm.f r0 = (lm.f) r0
                java.lang.Object r0 = r6.f91971d
                lm.a$c$a r0 = (lm.C11550a.c.C2255a) r0
                java.lang.Object r1 = r6.f91970c
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r6.f91978k
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r18)
                r1 = r18
                XH.x r1 = (XH.x) r1
                java.lang.Object r1 = r1.j()
                goto L_0x015b
            L_0x003f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0047:
                java.lang.Object r0 = r6.f91976i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r2 = r6.f91975h
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r6.f91973f
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.f91972e
                lm.f r4 = (lm.f) r4
                java.lang.Object r5 = r6.f91971d
                lm.a$c$a r5 = (lm.C11550a.c.C2255a) r5
                java.lang.Object r8 = r6.f91970c
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r6.f91978k
                QJ.Q r9 = (QJ.Q) r9
                XH.y.b(r18)
                r10 = r3
                r3 = r2
                r2 = r18
                r16 = r8
                r8 = r5
                r5 = r16
                goto L_0x010a
            L_0x0071:
                java.lang.Object r0 = r6.f91971d
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r0 = r6.f91970c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r3 = r6.f91978k
                QJ.Q r3 = (QJ.Q) r3
                XH.y.b(r18)
                r9 = r3
                r3 = r18
                goto L_0x00d2
            L_0x0084:
                java.lang.Object r0 = r6.f91978k
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r18)
                r5 = r18
                goto L_0x00aa
            L_0x008e:
                XH.y.b(r18)
                java.lang.Object r0 = r6.f91978k
                QJ.Q r0 = (QJ.Q) r0
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r5 = r6.f91979l
                Ry.a r5 = r5.f91808C
                TJ.g r5 = r5.b()
                r6.f91978k = r0
                r6.f91977j = r3
                java.lang.Object r5 = TJ.C16534i.D(r5, r6)
                if (r5 != r7) goto L_0x00aa
                return r7
            L_0x00aa:
                com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r5 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r5
                r8 = 0
                if (r5 == 0) goto L_0x00b4
                java.lang.String r5 = r5.n()
                goto L_0x00b5
            L_0x00b4:
                r5 = r8
            L_0x00b5:
                if (r5 == 0) goto L_0x017b
                int r9 = r5.length()
                if (r9 != 0) goto L_0x00bf
                goto L_0x017b
            L_0x00bf:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r3 = r6.f91979l
                r6.f91978k = r0
                r6.f91970c = r5
                r6.f91971d = r5
                r6.f91977j = r4
                java.lang.Object r3 = r3.y0(r6)
                if (r3 != r7) goto L_0x00d0
                return r7
            L_0x00d0:
                r9 = r0
                r0 = r5
            L_0x00d2:
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                lm.a$c$a r5 = new lm.a$c$a
                r5.<init>(r4, r0)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r8 = r6.f91979l
                lm.f r8 = r8.f91832v
                rz.I r10 = r6.f91980m
                com.ingka.ikea.app.base.ProductKey r10 = r10.l()
                java.lang.String r10 = r10.getProductNo()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r11 = r6.f91979l
                r6.f91978k = r9
                r6.f91970c = r0
                r6.f91971d = r5
                r6.f91972e = r8
                r6.f91973f = r10
                r6.f91974g = r3
                r6.f91975h = r0
                r6.f91976i = r4
                r6.f91977j = r2
                java.lang.Object r2 = r11.y0(r6)
                if (r2 != r7) goto L_0x0105
                return r7
            L_0x0105:
                r3 = r0
                r0 = r4
                r4 = r8
                r8 = r5
                r5 = r3
            L_0x010a:
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r12 = "shopgo_pip"
                r4.b(r10, r11, r8, r12)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r11 = r6.f91979l
                um.c r11 = r11.f91831u
                rz.I r12 = r6.f91980m
                com.ingka.ikea.core.model.product.ProductItem r12 = r12.k()
                com.ingka.ikea.core.model.product.ProductItem$ProductInfo r12 = r12.e()
                java.lang.String r12 = r12.i()
                rz.I r13 = r6.f91980m
                com.ingka.ikea.app.base.ProductKey r13 = r13.l()
                java.lang.String r13 = r13.getProductNo()
                rz.I r14 = r6.f91980m
                com.ingka.ikea.app.base.ProductKey r14 = r14.l()
                java.lang.String r14 = r14.getProductType()
                r6.f91978k = r9
                r6.f91970c = r5
                r6.f91971d = r8
                r6.f91972e = r4
                r6.f91973f = r10
                r6.f91974g = r2
                r6.f91975h = r3
                r6.f91976i = r0
                r6.f91977j = r1
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r8
                r5 = r17
                java.lang.Object r1 = r0.a(r1, r2, r3, r4, r5)
                if (r1 != r7) goto L_0x015a
                return r7
            L_0x015a:
                r0 = r8
            L_0x015b:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r6.f91979l
                rz.I r3 = r6.f91980m
                boolean r4 = XH.x.h(r1)
                if (r4 == 0) goto L_0x016b
                r4 = r1
                um.c$b r4 = (um.c.b) r4
                r2.V0(r3, r0, r4)
            L_0x016b:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r6.f91979l
                rz.I r3 = r6.f91980m
                java.lang.Throwable r1 = XH.x.e(r1)
                if (r1 == 0) goto L_0x0178
                r2.U0(r3, r0, r1)
            L_0x0178:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x017b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Required storeName is null or missing"
                r1.<init>(r2)
                qv.e r2 = qv.e.ERROR
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0195:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x01ad
                java.lang.Object r9 = r5.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x0195
                r7.add(r9)
                goto L_0x0195
            L_0x01ad:
                java.util.Iterator r5 = r7.iterator()
                r7 = r8
                r9 = r7
            L_0x01b3:
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto L_0x0227
                java.lang.Object r10 = r5.next()
                qv.b r10 = (qv.C11819b) r10
                if (r7 != 0) goto L_0x01cc
                java.lang.String r7 = qv.C11818a.a(r8, r1)
                if (r7 != 0) goto L_0x01c8
                goto L_0x0227
            L_0x01c8:
                java.lang.String r7 = qv.C11820c.a(r7)
            L_0x01cc:
                if (r9 != 0) goto L_0x021b
                java.lang.Class r9 = r0.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                r11 = 36
                java.lang.String r11 = HJ.C15854t.s1(r9, r11, r8, r4, r8)
                r12 = 46
                java.lang.String r11 = HJ.C15854t.o1(r11, r12, r8, r4, r8)
                int r12 = r11.length()
                if (r12 != 0) goto L_0x01ec
                goto L_0x01f2
            L_0x01ec:
                java.lang.String r9 = "Kt"
                java.lang.String r9 = HJ.C15854t.P0(r11, r9)
            L_0x01f2:
                java.lang.Thread r11 = java.lang.Thread.currentThread()
                java.lang.String r11 = r11.getName()
                java.lang.String r12 = "main"
                boolean r11 = HJ.C15854t.b0(r11, r12, r3)
                if (r11 == 0) goto L_0x0205
                java.lang.String r11 = "m"
                goto L_0x0207
            L_0x0205:
                java.lang.String r11 = "b"
            L_0x0207:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r11)
                java.lang.String r11 = "|"
                r12.append(r11)
                r12.append(r9)
                java.lang.String r9 = r12.toString()
            L_0x021b:
                r15 = r9
                r12 = 0
                r9 = r10
                r10 = r2
                r11 = r15
                r13 = r1
                r14 = r7
                r9.a(r10, r11, r12, r13, r14)
                r9 = r15
                goto L_0x01b3
            L_0x0227:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s implements C16532g<x<? extends I>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91981a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91982a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$special$$inlined$map$1$2", f = "ProductInfoPageFragmentViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$s$a$a  reason: collision with other inner class name */
            public static final class C2028a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91983c;

                /* renamed from: d  reason: collision with root package name */
                int f91984d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91985e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2028a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91985e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91983c = obj;
                    this.f91984d |= Integer.MIN_VALUE;
                    return this.f91985e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91982a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.s.a.C2028a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$s$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.s.a.C2028a) r0
                    int r1 = r0.f91984d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91984d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$s$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$s$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91983c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91984d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0063
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91982a
                    Ej.G r5 = (Ej.G) r5
                    if (r5 == 0) goto L_0x003f
                    rz.I r5 = r5.c()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    if (r5 != 0) goto L_0x0052
                    XH.x$a r5 = XH.x.f139812b
                    java.lang.NoSuchFieldException r5 = new java.lang.NoSuchFieldException
                    r5.<init>()
                    java.lang.Object r5 = XH.y.a(r5)
                    java.lang.Object r5 = XH.x.b(r5)
                    goto L_0x0056
                L_0x0052:
                    java.lang.Object r5 = XH.x.b(r5)
                L_0x0056:
                    XH.x r5 = XH.x.a(r5)
                    r0.f91984d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.s.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public s(C16532g gVar) {
            this.f91981a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91981a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91986a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91987a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$special$$inlined$map$2$2", f = "ProductInfoPageFragmentViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$t$a$a  reason: collision with other inner class name */
            public static final class C2029a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91988c;

                /* renamed from: d  reason: collision with root package name */
                int f91989d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91990e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2029a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91990e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91988c = obj;
                    this.f91989d |= Integer.MIN_VALUE;
                    return this.f91990e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91987a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.t.a.C2029a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$t$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.t.a.C2029a) r0
                    int r1 = r0.f91989d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91989d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$t$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$t$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91988c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91989d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91987a
                    XH.x r5 = (XH.x) r5
                    java.lang.Object r5 = r5.j()
                    java.lang.Throwable r2 = XH.x.e(r5)
                    if (r2 != 0) goto L_0x004e
                    Tj.f r5 = (Tj.C10941f) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a$a r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a$a
                    boolean r5 = r5.a()
                    r2.<init>(r5)
                    goto L_0x0050
                L_0x004e:
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a$b r2 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a.b.f91749a
                L_0x0050:
                    r0.f91989d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.t.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public t(C16532g gVar) {
            this.f91986a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91986a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LEj/G;", "showProductInfo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/e;", "loading", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "navigateTo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "canAddToFavourites", "", "currentRoute", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/j;", "<anonymous>", "(LEj/G;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/e;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;Ljava/lang/String;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/j;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$state$1", f = "ProductInfoPageFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.t<G, e, f, a, String, C17164e<? super j>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91991c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91992d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f91993e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f91994f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f91995g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f91996h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f91997i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(h hVar, C17164e<? super u> eVar) {
            super(6, eVar);
            this.f91997i = hVar;
        }

        /* renamed from: i */
        public final Object o(G g10, e eVar, f fVar, a aVar, String str, C17164e<? super j> eVar2) {
            u uVar = new u(this.f91997i, eVar2);
            uVar.f91992d = g10;
            uVar.f91993e = eVar;
            uVar.f91994f = fVar;
            uVar.f91995g = aVar;
            uVar.f91996h = str;
            return uVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91991c == 0) {
                y.b(obj);
                G g10 = (G) this.f91992d;
                e eVar = (e) this.f91993e;
                return new j(g10, eVar, (f) this.f91994f, (a) this.f91995g, this.f91997i.f91806A.a(eVar, g10), (String) this.f91996h);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$updateQuantity$1", f = "ProductInfoPageFragmentViewModel.kt", l = {694, 692, 703}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91998c;

        /* renamed from: d  reason: collision with root package name */
        Object f91999d;

        /* renamed from: e  reason: collision with root package name */
        Object f92000e;

        /* renamed from: f  reason: collision with root package name */
        Object f92001f;

        /* renamed from: g  reason: collision with root package name */
        Object f92002g;

        /* renamed from: h  reason: collision with root package name */
        Object f92003h;

        /* renamed from: i  reason: collision with root package name */
        Object f92004i;

        /* renamed from: j  reason: collision with root package name */
        Object f92005j;

        /* renamed from: k  reason: collision with root package name */
        int f92006k;

        /* renamed from: l  reason: collision with root package name */
        int f92007l;

        /* renamed from: m  reason: collision with root package name */
        int f92008m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h f92009n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f92010o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(h hVar, int i10, C17164e<? super v> eVar) {
            super(2, eVar);
            this.f92009n = hVar;
            this.f92010o = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new v(this.f92009n, this.f92010o, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((v) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0139 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x015c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f92008m
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x0063
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f92004i
                Tj.G r1 = (Tj.G) r1
                java.lang.Object r1 = r0.f92003h
                rz.O r1 = (rz.O) r1
                java.lang.Object r1 = r0.f92002g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f92001f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f92000e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f91999d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f91998c
                rz.I r1 = (rz.I) r1
                XH.y.b(r19)
                r2 = r19
                goto L_0x013b
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                java.lang.Object r2 = r0.f92005j
                java.lang.Object r4 = r0.f92004i
                Tj.G r4 = (Tj.G) r4
                java.lang.Object r6 = r0.f92003h
                rz.O r6 = (rz.O) r6
                java.lang.Object r7 = r0.f92002g
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r0.f92001f
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r0.f92000e
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r0.f91999d
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r0.f91998c
                TJ.B r11 = (TJ.C16505B) r11
                XH.y.b(r19)
                r5 = r19
                goto L_0x0113
            L_0x0063:
                java.lang.Object r2 = r0.f92001f
                Tj.G r2 = (Tj.G) r2
                java.lang.Object r6 = r0.f92000e
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r6
                java.lang.Object r6 = r0.f91998c
                TJ.B r6 = (TJ.C16505B) r6
                XH.y.b(r19)
                r8 = r2
                r2 = r19
                goto L_0x00ac
            L_0x0076:
                XH.y.b(r19)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = r0.f92009n
                TJ.B r6 = r2.f91812G
            L_0x007f:
                java.lang.Object r2 = r6.getValue()
                r7 = r2
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r7 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r7
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$d r7 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.d.f91768a
                boolean r8 = r6.e(r2, r7)
                if (r8 == 0) goto L_0x007f
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r8 = r0.f92009n
                Tj.G r8 = r8.f91824n
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r0.f92009n
                r0.f91998c = r6
                r0.f91999d = r2
                r0.f92000e = r7
                r0.f92001f = r8
                r2 = 0
                r0.f92006k = r2
                r0.f92007l = r2
                r0.f92008m = r5
                java.lang.Object r2 = r9.y0(r0)
                if (r2 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                r7 = r2
                java.lang.String r7 = (java.lang.String) r7
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r0.f92009n
                Ej.a r9 = r9.v0()
                java.lang.String r15 = r9.c()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r0.f92009n
                Ej.a r9 = r9.v0()
                java.lang.String r14 = r9.f()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r0.f92009n
                Ej.a r9 = r9.v0()
                java.lang.String r13 = r9.g()
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r9 = r0.f92009n
                Ej.a r9 = r9.v0()
                rz.O r12 = r9.h()
                Tj.G$a r11 = new Tj.G$a
                int r10 = r0.f92010o
                r9 = r11
                r16 = r10
                r10 = r7
                r5 = r11
                r11 = r15
                r19 = r12
                r12 = r14
                r17 = r13
                r3 = r14
                r14 = r19
                r4 = r15
                r15 = r16
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r0.f91998c = r6
                r0.f91999d = r7
                r0.f92000e = r4
                r0.f92001f = r3
                r6 = r17
                r0.f92002g = r6
                r9 = r19
                r0.f92003h = r9
                r0.f92004i = r8
                r0.f92005j = r2
                r10 = 2
                r0.f92008m = r10
                java.lang.Object r5 = r8.a(r5, r0)
                if (r5 != r1) goto L_0x010d
                return r1
            L_0x010d:
                r10 = r7
                r7 = r6
                r6 = r9
                r9 = r4
                r4 = r8
                r8 = r3
            L_0x0113:
                r3 = r5
                rz.I r3 = (rz.I) r3
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r5 = r0.f92009n
                Ej.a r11 = r5.v0()
                java.lang.String r11 = r11.c()
                r0.f91998c = r3
                r0.f91999d = r10
                r0.f92000e = r9
                r0.f92001f = r8
                r0.f92002g = r7
                r0.f92003h = r6
                r0.f92004i = r4
                r0.f92005j = r2
                r2 = 3
                r0.f92008m = r2
                java.lang.Object r2 = r5.w0(r11, r0)
                if (r2 != r1) goto L_0x013a
                return r1
            L_0x013a:
                r1 = r3
            L_0x013b:
                Tj.o$a r2 = (Tj.o.a) r2
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r3 = r0.f92009n
                int r4 = r2.b()
                int r2 = r2.a()
                r5 = 1
                r3.s0(r1, r5, r4, r2)
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = r0.f92009n
                TJ.B r3 = r1.f91812G
            L_0x0151:
                java.lang.Object r1 = r3.getValue()
                r2 = r1
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r2
                boolean r4 = r2 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.d
                if (r4 == 0) goto L_0x015d
                r2 = 0
            L_0x015d:
                boolean r1 = r3.e(r1, r2)
                if (r1 == 0) goto L_0x0151
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragmentViewModel$updateQuantityWithDelay$1", f = "ProductInfoPageFragmentViewModel.kt", l = {679}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f92011c;

        /* renamed from: d  reason: collision with root package name */
        Object f92012d;

        /* renamed from: e  reason: collision with root package name */
        Object f92013e;

        /* renamed from: f  reason: collision with root package name */
        Object f92014f;

        /* renamed from: g  reason: collision with root package name */
        Object f92015g;

        /* renamed from: h  reason: collision with root package name */
        Object f92016h;

        /* renamed from: i  reason: collision with root package name */
        Object f92017i;

        /* renamed from: j  reason: collision with root package name */
        boolean f92018j;

        /* renamed from: k  reason: collision with root package name */
        int f92019k;

        /* renamed from: l  reason: collision with root package name */
        int f92020l;

        /* renamed from: m  reason: collision with root package name */
        int f92021m;

        /* renamed from: n  reason: collision with root package name */
        int f92022n;

        /* renamed from: o  reason: collision with root package name */
        int f92023o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h f92024p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f92025q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(h hVar, int i10, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f92024p = hVar;
            this.f92025q = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new w(this.f92024p, this.f92025q, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            Object value;
            G g10;
            Object obj2;
            G g11;
            C16505B b10;
            Object obj3;
            Object f10 = C17187b.f();
            int i11 = this.f92023o;
            if (i11 == 0) {
                y.b(obj);
                G g12 = (G) this.f92024p.f91814I.getValue();
                I c10 = g12 != null ? g12.c() : null;
                if (c10 != null) {
                    rz.U m10 = c10.m();
                    U.a aVar = m10 instanceof U.a ? (U.a) m10 : null;
                    if (aVar == null) {
                        return C16807N.f139792a;
                    }
                    G g13 = (G) this.f92024p.f91814I.getValue();
                    Uj.j d10 = g13 != null ? g13.d() : null;
                    j.b bVar = d10 instanceof j.b ? (j.b) d10 : null;
                    if (bVar == null) {
                        return C16807N.f139792a;
                    }
                    boolean Z10 = this.f92024p.G0(c10);
                    int a10 = Z10 ? aVar.a() : aVar.b();
                    int m11 = C17978n.m(this.f92025q, aVar.d(), a10);
                    if (m11 != aVar.c()) {
                        C16505B I10 = this.f92024p.f91812G;
                        do {
                            value = I10.getValue();
                            e eVar = (e) value;
                        } while (!I10.e(value, e.d.f91768a));
                        C16505B S10 = this.f92024p.f91814I;
                        while (true) {
                            Object value2 = S10.getValue();
                            G g14 = (G) value2;
                            if (g14 != null) {
                                g10 = g14;
                                obj3 = value2;
                                b10 = S10;
                                obj2 = f10;
                                i10 = m11;
                                g11 = G.b(g10, (I) null, j.b.c(bVar, 0, 0, m11, false, 11, (Object) null), false, 0, (O) null, 29, (Object) null);
                            } else {
                                obj2 = f10;
                                g10 = g14;
                                obj3 = value2;
                                b10 = S10;
                                i10 = m11;
                                g11 = null;
                            }
                            if (b10.e(obj3, g11)) {
                                break;
                            }
                            m11 = i10;
                            S10 = b10;
                            f10 = obj2;
                        }
                        F0 G10 = this.f92024p.f91818M;
                        if (G10 != null) {
                            F0.a.a(G10, (CancellationException) null, 1, (Object) null);
                        }
                        this.f92011c = c10;
                        this.f92012d = aVar;
                        this.f92013e = bVar;
                        this.f92014f = G10;
                        this.f92015g = obj3;
                        this.f92016h = g10;
                        this.f92017i = g11;
                        this.f92018j = Z10;
                        this.f92019k = a10;
                        this.f92020l = i10;
                        this.f92021m = 0;
                        this.f92022n = 0;
                        this.f92023o = 1;
                        Object obj4 = obj2;
                        if (C16297b0.b(650, this) == obj4) {
                            return obj4;
                        }
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalArgumentException("Required value was null.");
            } else if (i11 == 1) {
                i10 = this.f92020l;
                G g15 = (G) this.f92017i;
                G g16 = (G) this.f92016h;
                F0 f02 = (F0) this.f92014f;
                j.b bVar2 = (j.b) this.f92013e;
                U.a aVar2 = (U.a) this.f92012d;
                I i12 = (I) this.f92011c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f92024p.a1(i10);
            this.f92024p.f91818M = null;
            return C16807N.f139792a;
        }
    }

    public h(Tj.v vVar, Tj.G g10, C10936a aVar, Tj.j jVar, C12860a aVar2, Hl.a aVar3, Tj.o oVar, C10939d dVar, C11421d dVar2, um.c cVar, lm.f fVar, Sy.a aVar4, Xi.a aVar5, C12314a aVar6, Tj.q qVar, c cVar2, androidx.lifecycle.U u10, C15100a aVar7, Ry.a aVar8, i iVar, tz.c cVar3, C15101b bVar) {
        Tj.v vVar2 = vVar;
        Tj.G g11 = g10;
        C10936a aVar9 = aVar;
        Tj.j jVar2 = jVar;
        C12860a aVar10 = aVar2;
        Hl.a aVar11 = aVar3;
        Tj.o oVar2 = oVar;
        C11421d dVar3 = dVar2;
        um.c cVar4 = cVar;
        lm.f fVar2 = fVar;
        Sy.a aVar12 = aVar4;
        Xi.a aVar13 = aVar5;
        C12314a aVar14 = aVar6;
        Tj.q qVar2 = qVar;
        c cVar5 = cVar2;
        C17542s.j(vVar2, "lookupProductUseCase");
        C17542s.j(g11, "updateProductQuantityUseCase");
        C17542s.j(aVar9, "addProductToCartUseCase");
        C17542s.j(jVar2, "collectProductUseCase");
        C17542s.j(aVar10, "localStoreSelectionRepository");
        C17542s.j(aVar11, "wifiConnector");
        C17542s.j(oVar2, "getQuantityForItemInCartUseCase");
        C17542s.j(dVar, "addToFavouritesUseCase");
        C17542s.j(dVar3, "scanFailureCounter");
        C17542s.j(cVar4, "subscribeBackInStockNotificationUseCase");
        C17542s.j(fVar2, "backInStockNotificationAnalytics");
        C17542s.j(aVar12, "scanAndGoAnalytics");
        C17542s.j(aVar13, "addProductToOnlineCartUseCase");
        C17542s.j(aVar14, "productDetailsAnalytics");
        C17542s.j(qVar2, "getScannedObjectUseCase");
        C17542s.j(cVar2, "buttonsUiStateMapper");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar7, "getProfileState");
        C17542s.j(aVar8, "scanAndGoSettingsRepo");
        C17542s.j(iVar, "previousDestinationProvider");
        C17542s.j(cVar3, "getScanTypeUseCase");
        C17542s.j(bVar, "getScanAndGoProductUseCase");
        this.f91823m = vVar2;
        this.f91824n = g11;
        this.f91825o = aVar9;
        this.f91826p = jVar2;
        this.f91827q = aVar10;
        this.f91828r = aVar11;
        this.f91829s = oVar2;
        this.f91830t = dVar3;
        this.f91831u = cVar4;
        this.f91832v = fVar2;
        this.f91833w = aVar12;
        this.f91834x = aVar13;
        this.f91835y = aVar14;
        this.f91836z = qVar2;
        this.f91806A = cVar2;
        this.f91807B = aVar7;
        this.f91808C = aVar8;
        this.f91809D = iVar;
        this.f91810E = cVar3;
        this.f91811F = bVar;
        C16505B<e> a10 = C16521S.a(null);
        this.f91812G = a10;
        C16505B<f> a11 = C16521S.a(null);
        this.f91813H = a11;
        C16505B<G> a12 = C16521S.a(null);
        this.f91814I = a12;
        C16505B<String> a13 = C16521S.a("");
        this.f91815J = a13;
        C16519P<a> c02 = C16534i.c0(new t(dVar.a(new s(a12))), g0.a(this), ip.f.a(), a.b.f91749a);
        this.f91816K = c02;
        this.f91817L = C16534i.c0(C16534i.k(a12, a10, a11, c02, a13, new u(this, (C17164e<? super u>) null)), g0.a(this), ip.f.a(), new j((G) null, (e) null, (f) null, (a) null, (b) null, (String) null, 63, (DefaultConstructorMarker) null));
        N u02 = u0();
        this.f91822Q = u02;
        F0 unused = C16314k.d(g0.a(this), u02, (T) null, new a(this, u10, (C17164e<? super a>) null), 2, (Object) null);
    }

    private final void A0(boolean z10) {
        F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new i(this, z10, (C17164e<? super i>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object B0(C17164e<? super C16807N> eVar) {
        g t02 = t0();
        if (t02 instanceof g.a) {
            C0((g.a) t02);
        } else if (t02 instanceof g.b) {
            Object D02 = D0(this, (g.b) t02, eVar);
            return D02 == C17187b.f() ? D02 : C16807N.f139792a;
        } else if (!C17542s.e(t02, g.c.f91805a)) {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    private final void C0(g.a aVar) {
        String value;
        Object a10 = this.f91836z.a(aVar.a(), aVar.b());
        y.b(a10);
        F f10 = (F) a10;
        this.f91820O = new C10706a(f10.a(), f10.d(), f10.f(), f10.e(), f10.c(), f10.b());
        C16505B<String> b10 = this.f91815J;
        do {
            value = b10.getValue();
            String str = value;
        } while (!b10.e(value, "scanandgo/productInfoPage?rawValue={rawValue}&format={format}"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D0(com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r11, com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g.b r12, dI.C17164e<? super XH.C16807N> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.j
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$j r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.j) r0
            int r1 = r0.f91914j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91914j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$j r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$j
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f91912h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91914j
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r11 = r0.f91911g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f91910f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f91909e
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g$b r12 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g.b) r12
            java.lang.Object r12 = r0.f91908d
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r12 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r12
            java.lang.Object r13 = r0.f91907c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r13 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r13
            XH.y.b(r1)
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r9
            goto L_0x0065
        L_0x0041:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0049:
            XH.y.b(r1)
            java.lang.String r1 = r12.a()
            tz.c r3 = r11.f91810E
            r0.f91907c = r10
            r0.f91908d = r11
            r0.f91909e = r12
            r0.f91910f = r13
            r0.f91911g = r1
            r0.f91914j = r4
            java.lang.Object r12 = r3.a(r1, r0)
            if (r12 != r2) goto L_0x0065
            return r2
        L_0x0065:
            rz.O r12 = (rz.O) r12
            if (r12 != 0) goto L_0x006b
            rz.O r12 = rz.O.MANUAL_INPUT
        L_0x006b:
            r3 = r12
            Ej.a r12 = new Ej.a
            r7 = 56
            r8 = 0
            java.lang.String r2 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.f91820O = r12
            TJ.B<java.lang.String> r11 = r11.f91815J
        L_0x007e:
            java.lang.Object r12 = r11.getValue()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = "scanandgo/productInfoPage?barcode={barcode}"
            boolean r12 = r11.e(r12, r13)
            if (r12 == 0) goto L_0x007e
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.D0(com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h, com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g$b, dI.e):java.lang.Object");
    }

    private final boolean E0(I i10) {
        int b10 = i10.m().b();
        return (b10 > 0 && b10 < i10.m().c()) || !C11420c.c(i10).isEmpty();
    }

    private final boolean F0(I i10) {
        C15016i d10 = i10.d();
        if (d10 instanceof C15016i.b) {
            return false;
        }
        if (d10 instanceof C15016i.a) {
            C15016i d11 = i10.d();
            C17542s.h(d11, "null cannot be cast to non-null type com.ingka.ikea.scanandgo.datalayer.model.ChildItemInfo.Available");
            C15016i.a aVar = (C15016i.a) d11;
            return !aVar.a().isEmpty() && !aVar.b().isEmpty();
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public final boolean G0(I i10) {
        int i11 = b.f91841b[v0().h().ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (!(i11 == 2 || i11 == 3)) {
            if (i11 == 4) {
                C15031y p10 = i10.p();
                if (!(p10 == C15031y.SELF_SERVE || p10 == C15031y.CASH_AND_CARRY)) {
                    return false;
                }
            } else if (i11 != 5) {
                throw new XH.t();
            }
        }
        return true;
    }

    private final boolean H0(I i10) {
        return i10.p() == C15031y.SELF_SERVE && v0().h() == O.QR;
    }

    /* access modifiers changed from: private */
    public final void I0() {
        F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new k(this, (C17164e<? super k>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object J0(dI.C17164e<? super XH.C16807N> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.l
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$l r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.l) r0
            int r1 = r0.f91928i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91928i = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$l r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$l
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f91926g
            java.lang.Object r12 = eI.C17187b.f()
            int r2 = r0.f91928i
            r13 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r3) goto L_0x0041
            if (r2 != r13) goto L_0x0039
            java.lang.Object r15 = r0.f91924e
            rz.I r15 = (rz.I) r15
            java.lang.Object r15 = r0.f91923d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f91922c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r15 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r15
            XH.y.b(r1)
            goto L_0x00ad
        L_0x0039:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0041:
            java.lang.Object r15 = r0.f91923d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r2 = r0.f91922c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r2
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x0096
        L_0x0053:
            XH.y.b(r1)
            tz.b r1 = r14.f91811F
            Ej.a r2 = r14.v0()
            java.lang.String r2 = r2.c()
            Ej.a r4 = r14.v0()
            rz.O r4 = r4.h()
            Ej.a r5 = r14.v0()
            java.lang.String r5 = r5.f()
            Ej.a r6 = r14.v0()
            java.lang.String r6 = r6.g()
            Ej.a r7 = r14.v0()
            Sy.a$b r7 = r7.e()
            r0.f91922c = r14
            r0.f91923d = r15
            r0.f91928i = r3
            r8 = 0
            r9 = 0
            r10 = 4
            r11 = 0
            r3 = r4
            r4 = r8
            r8 = r9
            r9 = r0
            java.lang.Object r1 = tz.C15101b.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r12) goto L_0x0095
            return r12
        L_0x0095:
            r2 = r14
        L_0x0096:
            XH.y.b(r1)
            r3 = r1
            rz.I r3 = (rz.I) r3
            r0.f91922c = r2
            r0.f91923d = r15
            r0.f91924e = r3
            r0.f91925f = r1
            r0.f91928i = r13
            java.lang.Object r15 = r2.x0(r3, r0)
            if (r15 != r12) goto L_0x00ad
            return r12
        L_0x00ad:
            XH.N r15 = XH.C16807N.f139792a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.J0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x017a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K0(dI.C17164e<? super XH.C16807N> r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.m
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$m r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.m) r2
            int r3 = r2.f91945s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91945s = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$m r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$m
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f91943q
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f91945s
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x00b5
            if (r5 == r8) goto L_0x00a3
            if (r5 == r7) goto L_0x0064
            if (r5 != r6) goto L_0x005c
            java.lang.Object r1 = r2.f91939m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91938l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91937k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91936j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91935i
            rz.O r1 = (rz.O) r1
            java.lang.Object r1 = r2.f91934h
            Sy.a$b r1 = (Sy.a.b) r1
            java.lang.Object r1 = r2.f91932f
            Tj.v r1 = (Tj.v) r1
            java.lang.Object r1 = r2.f91931e
            rz.I r1 = (rz.I) r1
            java.lang.Object r1 = r2.f91930d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f91929c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r1
            XH.y.b(r3)
            goto L_0x017b
        L_0x005c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0064:
            int r1 = r2.f91941o
            boolean r5 = r2.f91942p
            int r7 = r2.f91940n
            java.lang.Object r8 = r2.f91938l
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f91937k
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f91936j
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f91935i
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.f91934h
            rz.O r12 = (rz.O) r12
            java.lang.Object r13 = r2.f91933g
            Sy.a$b r13 = (Sy.a.b) r13
            java.lang.Object r14 = r2.f91932f
            java.lang.Object r15 = r2.f91931e
            Tj.v r15 = (Tj.v) r15
            java.lang.Object r6 = r2.f91930d
            dI.e r6 = (dI.C17164e) r6
            r29 = r1
            java.lang.Object r1 = r2.f91929c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r1
            XH.y.b(r3)
            r0 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r3
            r3 = r29
            goto L_0x0153
        L_0x00a3:
            java.lang.Object r1 = r2.f91931e
            Tj.v r1 = (Tj.v) r1
            java.lang.Object r5 = r2.f91930d
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r2.f91929c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r6
            XH.y.b(r3)
            r15 = r1
            r1 = r5
            goto L_0x00cc
        L_0x00b5:
            XH.y.b(r3)
            Tj.v r3 = r0.f91823m
            r2.f91929c = r0
            r2.f91930d = r1
            r2.f91931e = r3
            r2.f91945s = r8
            java.lang.Object r5 = r0.y0(r2)
            if (r5 != r4) goto L_0x00c9
            return r4
        L_0x00c9:
            r6 = r0
            r15 = r3
            r3 = r5
        L_0x00cc:
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            Ej.a r5 = r6.v0()
            java.lang.String r9 = r5.c()
            Ej.a r5 = r6.v0()
            java.lang.String r10 = r5.f()
            Ej.a r5 = r6.v0()
            java.lang.String r11 = r5.g()
            Ej.a r5 = r6.v0()
            rz.O r12 = r5.h()
            Ej.a r5 = r6.v0()
            Sy.a$b r13 = r5.e()
            Ej.a r5 = r6.v0()
            boolean r5 = r5.d()
            Tj.v$a r14 = new Tj.v$a
            r7 = 32
            r26 = 0
            r16 = r14
            r17 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r23 = 0
            r22 = r23
            r23 = r13
            r24 = r5
            r25 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.f91929c = r6
            r2.f91930d = r1
            r2.f91931e = r15
            r2.f91932f = r3
            r2.f91933g = r13
            r2.f91934h = r12
            r2.f91935i = r11
            r2.f91936j = r10
            r2.f91937k = r9
            r2.f91938l = r8
            r2.f91940n = r7
            r2.f91942p = r5
            r7 = 0
            r2.f91941o = r7
            r7 = 2
            r2.f91945s = r7
            java.lang.Object r7 = r15.a(r14, r2)
            if (r7 != r4) goto L_0x0143
            return r4
        L_0x0143:
            r14 = r13
            r0 = r15
            r15 = r3
            r13 = r12
            r3 = 0
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = 32
            r27 = r6
            r6 = r1
            r1 = r27
        L_0x0153:
            rz.I r7 = (rz.I) r7
            r2.f91929c = r1
            r2.f91930d = r6
            r2.f91931e = r7
            r2.f91932f = r0
            r2.f91933g = r15
            r2.f91934h = r14
            r2.f91935i = r13
            r2.f91936j = r12
            r2.f91937k = r11
            r2.f91938l = r10
            r2.f91939m = r9
            r2.f91940n = r8
            r2.f91942p = r5
            r2.f91941o = r3
            r0 = 3
            r2.f91945s = r0
            java.lang.Object r0 = r1.x0(r7, r2)
            if (r0 != r4) goto L_0x017b
            return r4
        L_0x017b:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.K0(dI.e):java.lang.Object");
    }

    private final void L0(String str, String str2) {
        this.f91820O = C10706a.b(v0(), str, str2, (O) null, (String) null, (a.b) null, false, 60, (Object) null);
        I0();
    }

    /* access modifiers changed from: private */
    public final f M0(C15009b bVar) {
        C15009b bVar2 = bVar;
        if (bVar2 instanceof C15009b.c.a) {
            return f.o.f91799a;
        }
        if (bVar2 instanceof C15009b.a.C3237a) {
            return new f.h(v0().c(), v0().h() == O.MANUAL_INPUT);
        }
        char c10 = '$';
        Class<h> cls = h.class;
        if (bVar2 instanceof C15009b.c) {
            IllegalStateException illegalStateException = new IllegalStateException(((C15009b.c) bVar2).getMessage());
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar3 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar3.a(eVar, str3, false, illegalStateException, str);
                str2 = str3;
                c10 = '$';
            }
            return new f.g(true);
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(bVar.getMessage());
        qv.e eVar2 = qv.e.WARN;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str4 = null;
        String str5 = null;
        for (C11819b bVar4 : arrayList2) {
            if (str4 == null) {
                String a11 = C11818a.a((String) null, illegalStateException2);
                if (a11 == null) {
                    break;
                }
                str4 = C11820c.a(a11);
            }
            if (str5 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar4.a(eVar2, str5, false, illegalStateException2, str4);
        }
        return new f.g(false, 1, (DefaultConstructorMarker) null);
    }

    private final void O0() {
        b.a a10;
        b b10 = getState().getValue().b();
        if (b10 == null || (a10 = b10.a()) == null || a10.a()) {
            F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new o(this, (C17164e<? super o>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Object P0(I i10, Throwable th2, C17164e<? super C16807N> eVar) {
        e value;
        f value2;
        f value3;
        f value4;
        C16505B<e> b10 = this.f91812G;
        do {
            value = b10.getValue();
            e eVar2 = value;
        } while (!b10.e(value, null));
        if (th2 instanceof C10936a.b) {
            C10936a.b bVar = (C10936a.b) th2;
            if (C17542s.e(bVar, C10936a.b.C1817a.f87449a)) {
                C16505B<f> b11 = this.f91813H;
                do {
                    value4 = b11.getValue();
                    f fVar = value4;
                } while (!b11.e(value4, new f.j(i10, f.l.a.ADD_TO_CART)));
            } else if (C17542s.e(bVar, C10936a.b.C1818b.f87450a)) {
                C16505B<f> b12 = this.f91813H;
                do {
                    value3 = b12.getValue();
                    f fVar2 = value3;
                } while (!b12.e(value3, new f.k(i10, f.l.a.ADD_TO_CART)));
            } else if (C17542s.e(bVar, C10936a.b.c.f87451a)) {
                this.f91833w.P(i10.c(), i10.p().b());
                Object q02 = q0(this, i10, i10.m().c(), false, eVar, 4, (Object) null);
                return q02 == C17187b.f() ? q02 : C16807N.f139792a;
            } else {
                throw new XH.t();
            }
        } else {
            C16505B<f> b13 = this.f91813H;
            do {
                value2 = b13.getValue();
                f fVar3 = value2;
            } while (!b13.e(value2, new f.g(false, 1, (DefaultConstructorMarker) null)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q0(rz.I r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.p
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$p r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.p) r0
            int r1 = r0.f91966m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91966m = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$p r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$p
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f91964k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91966m
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r5) goto L_0x003f
            java.lang.Object r11 = r0.f91961h
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r11 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r11
            java.lang.Object r11 = r0.f91959f
            rz.y r11 = (rz.C15031y) r11
            java.lang.Object r11 = r0.f91958e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f91957d
            rz.I r11 = (rz.I) r11
            java.lang.Object r11 = r0.f91956c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r11 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r11
            XH.y.b(r1)
            goto L_0x00d5
        L_0x003f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0047:
            XH.y.b(r1)
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r1 = r10.f91812G
            java.lang.Object r1 = r1.getValue()
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$b r3 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.b.f91766a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r1 == 0) goto L_0x005b
            XH.N r11 = XH.C16807N.f139792a
            return r11
        L_0x005b:
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r1 = r10.f91812G
        L_0x005d:
            java.lang.Object r3 = r1.getValue()
            r6 = r3
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r6
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$b r6 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.b.f91766a
            boolean r7 = r1.e(r3, r6)
            if (r7 == 0) goto L_0x005d
            r7 = 0
            if (r11 == 0) goto L_0x00c0
            rz.y r1 = r11.p()
            int[] r8 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.b.f91840a
            int r9 = r1.ordinal()
            r8 = r8[r9]
            if (r8 == r5) goto L_0x00a7
            r9 = 2
            if (r8 == r9) goto L_0x00a7
            r9 = 3
            if (r8 == r9) goto L_0x00a7
            r12 = 4
            if (r8 == r12) goto L_0x0090
            r11 = 5
            if (r8 != r11) goto L_0x008a
            goto L_0x00d4
        L_0x008a:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x0090:
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r9 = r10.f91813H
        L_0x0092:
            java.lang.Object r12 = r9.getValue()
            r0 = r12
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r0
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$k r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$k
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$l$a r1 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f.l.a.ADD_TO_CART
            r0.<init>(r11, r1)
            boolean r12 = r9.e(r12, r0)
            if (r12 == 0) goto L_0x0092
            goto L_0x00d4
        L_0x00a7:
            r0.f91956c = r10
            r0.f91957d = r11
            r0.f91958e = r12
            r0.f91959f = r1
            r0.f91960g = r3
            r0.f91961h = r6
            r0.f91962i = r8
            r0.f91963j = r7
            r0.f91966m = r5
            java.lang.Object r11 = r10.l0(r10, r11, r0)
            if (r11 != r2) goto L_0x00d4
            return r2
        L_0x00c0:
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r3 = r10.f91813H
        L_0x00c2:
            java.lang.Object r11 = r3.getValue()
            r12 = r11
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r12 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r12
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$g r12 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$g
            r12.<init>(r7, r5, r4)
            boolean r11 = r3.e(r11, r12)
            if (r11 == 0) goto L_0x00c2
        L_0x00d4:
            r11 = r10
        L_0x00d5:
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r11 = r11.f91812G
        L_0x00d7:
            java.lang.Object r12 = r11.getValue()
            r0 = r12
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r0
            boolean r12 = r11.e(r12, r4)
            if (r12 == 0) goto L_0x00d7
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.Q0(rz.I, dI.e):java.lang.Object");
    }

    private final void R0(I i10, int i11, Throwable th2) {
        Object obj;
        f value;
        if (!(th2 instanceof j.a)) {
            obj = new f.g(false, 1, (DefaultConstructorMarker) null);
        } else if (C17542s.e((j.a) th2, j.a.C1824a.f87586a)) {
            obj = new f.C2026f(i11, i10);
        } else {
            throw new XH.t();
        }
        C16505B<f> b10 = this.f91813H;
        do {
            value = b10.getValue();
            f fVar = value;
        } while (!b10.e(value, obj));
    }

    private final void S0() {
        F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new q(this, (C17164e<? super q>) null), 2, (Object) null);
    }

    private final void T0() {
        G value = this.f91814I.getValue();
        I c10 = value != null ? value.c() : null;
        if (c10 != null) {
            F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new r(this, c10, (C17164e<? super r>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void U0(I i10, C11550a.c cVar, Throwable th2) {
        f value;
        Object z02 = th2 instanceof c.a ? z0(i10, cVar, (c.a) th2) : new f.n(C13026h.a(Oo.b.f84398I0));
        C16505B<f> b10 = this.f91813H;
        do {
            value = b10.getValue();
            f fVar = value;
        } while (!b10.e(value, z02));
    }

    /* access modifiers changed from: private */
    public final void V0(I i10, C11550a.c cVar, c.b bVar) {
        Object obj;
        f value;
        if (C17542s.e(bVar, c.b.a.f103852a)) {
            obj = new f.c.a(i10, cVar);
        } else if (bVar instanceof c.b.C2468b) {
            lm.f fVar = this.f91832v;
            String productNo = i10.l().getProductNo();
            C12832d c10 = this.f91827q.c();
            String e10 = c10 != null ? c10.e() : null;
            if (e10 == null) {
                e10 = "";
            }
            f.a.a(fVar, productNo, e10, (String) null, 4, (Object) null);
            obj = new f.n(C13026h.a(((c.b.C2468b) bVar).a()));
        } else {
            throw new XH.t();
        }
        C16505B<f> b10 = this.f91813H;
        do {
            value = b10.getValue();
            f fVar2 = value;
        } while (!b10.e(value, obj));
    }

    private final void W0(f.l.a aVar) {
        f value;
        I c10;
        f value2;
        G value3 = this.f91814I.getValue();
        if (value3 == null || (c10 = value3.c()) == null) {
            C16505B<f> b10 = this.f91813H;
            do {
                value = b10.getValue();
                f fVar = value;
            } while (!b10.e(value, new f.g(false, 1, (DefaultConstructorMarker) null)));
            return;
        }
        C16505B<f> b11 = this.f91813H;
        do {
            value2 = b11.getValue();
            f fVar2 = value2;
        } while (!b11.e(value2, new f.k(c10, aVar)));
    }

    private final void X0() {
        f value;
        I c10;
        f value2;
        G value3 = this.f91814I.getValue();
        if (value3 == null || (c10 = value3.c()) == null) {
            C16505B<f> b10 = this.f91813H;
            do {
                value = b10.getValue();
                f fVar = value;
            } while (!b10.e(value, new f.g(false, 1, (DefaultConstructorMarker) null)));
            return;
        }
        rz.U m10 = c10.m();
        C16505B<f> b11 = this.f91813H;
        do {
            value2 = b11.getValue();
            f fVar2 = value2;
        } while (!b11.e(value2, new f.d(m10.c(), m10.b(), c10)));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [rz.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Z0() {
        /*
            r4 = this;
            TJ.B<Ej.G> r0 = r4.f91814I
            java.lang.Object r0 = r0.getValue()
            Ej.G r0 = (Ej.G) r0
            r1 = 0
            if (r0 == 0) goto L_0x0010
            rz.I r0 = r0.c()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0054
            rz.y r2 = r0.p()
            rz.y r3 = rz.C15031y.COMBINATION
            if (r2 != r3) goto L_0x0039
            rz.i r2 = r0.d()
            boolean r3 = r2 instanceof rz.C15016i.a
            if (r3 == 0) goto L_0x0026
            r1 = r2
            rz.i$a r1 = (rz.C15016i.a) r1
        L_0x0026:
            if (r1 == 0) goto L_0x0054
            java.util.List r1 = r1.b()
            if (r1 == 0) goto L_0x0054
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != r2) goto L_0x0054
            goto L_0x0043
        L_0x0039:
            rz.U r1 = r0.m()
            int r1 = r1.a()
            if (r1 > 0) goto L_0x0054
        L_0x0043:
            xj.a r1 = r4.f91835y
            com.ingka.ikea.app.base.ProductKey r2 = r0.l()
            rz.y r3 = r0.p()
            boolean r0 = r4.F0(r0)
            r1.b(r2, r3, r0)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.Z0():void");
    }

    /* access modifiers changed from: private */
    public final void a1(int i10) {
        this.f91819N = C16314k.d(g0.a(this), this.f91822Q, (T) null, new v(this, i10, (C17164e<? super v>) null), 2, (Object) null);
    }

    private final void b1(int i10) {
        this.f91818M = C16314k.d(g0.a(this), this.f91822Q, (T) null, new w(this, i10, (C17164e<? super w>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l0(com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r21, rz.I r22, dI.C17164e<? super XH.C16807N> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = r2 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.c
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$c r3 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.c) r3
            int r4 = r3.f91858r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f91858r = r4
        L_0x0018:
            r14 = r3
            goto L_0x0020
        L_0x001a:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$c r3 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$c
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r14.f91856p
            java.lang.Object r15 = eI.C17187b.f()
            int r4 = r14.f91858r
            r13 = 2
            r12 = 1
            if (r4 == 0) goto L_0x00b4
            if (r4 == r12) goto L_0x006e
            if (r4 != r13) goto L_0x0066
            java.lang.Object r1 = r14.f91852l
            com.ingka.ikea.analytics.Interaction$Component r1 = (com.ingka.ikea.analytics.Interaction$Component) r1
            java.lang.Object r1 = r14.f91851k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.f91850j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.f91849i
            rz.y r1 = (rz.C15031y) r1
            java.lang.Object r1 = r14.f91848h
            Xi.a r1 = (Xi.a) r1
            java.lang.Object r1 = r14.f91847g
            Ej.G r1 = (Ej.G) r1
            java.lang.Object r1 = r14.f91846f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r14.f91845e
            rz.I r1 = (rz.I) r1
            java.lang.Object r2 = r14.f91844d
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r2
            java.lang.Object r4 = r14.f91843c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r4 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r4
            XH.y.b(r3)
            XH.x r3 = (XH.x) r3
            java.lang.Object r3 = r3.j()
            r4 = r3
            r3 = r13
            r0 = 0
            goto L_0x0162
        L_0x0066:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006e:
            int r1 = r14.f91855o
            double r4 = r14.f91854n
            java.lang.Object r2 = r14.f91852l
            com.ingka.ikea.analytics.Interaction$Component r2 = (com.ingka.ikea.analytics.Interaction$Component) r2
            java.lang.Object r6 = r14.f91851k
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.f91850j
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r14.f91849i
            rz.y r8 = (rz.C15031y) r8
            java.lang.Object r9 = r14.f91848h
            Xi.a r9 = (Xi.a) r9
            java.lang.Object r10 = r14.f91847g
            Ej.G r10 = (Ej.G) r10
            java.lang.Object r11 = r14.f91846f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r13 = r14.f91845e
            rz.I r13 = (rz.I) r13
            java.lang.Object r12 = r14.f91844d
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r12 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r12
            r21 = r1
            java.lang.Object r1 = r14.f91843c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r1
            XH.y.b(r3)
            r0 = r2
            r2 = r13
            r13 = r3
            r3 = r1
            r1 = r12
            r12 = r10
            r10 = r21
            r17 = r7
            r7 = r6
            r6 = r17
            r18 = r4
            r5 = r8
            r4 = r9
            r8 = r18
            goto L_0x012e
        L_0x00b4:
            XH.y.b(r3)
            Xi.a r3 = r1.f91834x
            TJ.B<Ej.G> r4 = r1.f91814I
            java.lang.Object r4 = r4.getValue()
            r10 = r4
            Ej.G r10 = (Ej.G) r10
            if (r10 == 0) goto L_0x00cf
            rz.I r4 = r10.c()
            if (r4 == 0) goto L_0x00cf
            rz.y r4 = r4.p()
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            com.ingka.ikea.core.model.product.ProductItem r5 = r22.k()
            java.lang.String r5 = r5.f()
            com.ingka.ikea.core.model.product.ProductItem r6 = r22.k()
            java.lang.String r6 = r6.g()
            com.ingka.ikea.core.model.product.ProductItem r7 = r22.k()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r7 = r7.e()
            com.ingka.ikea.core.model.product.ProductItem$Price r7 = r7.g()
            com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag r7 = r7.e()
            double r7 = r7.c()
            com.ingka.ikea.analytics.Interaction$Component r9 = com.ingka.ikea.analytics.Interaction$Component.SHOP_AND_GO_ADD_TO_ONLINE_CART_BUTTON
            r14.f91843c = r0
            r14.f91844d = r1
            r11 = r22
            r14.f91845e = r11
            r14.f91846f = r2
            r14.f91847g = r10
            r14.f91848h = r3
            r14.f91849i = r4
            r14.f91850j = r5
            r14.f91851k = r6
            r14.f91852l = r9
            r14.f91854n = r7
            r12 = 1
            r14.f91855o = r12
            r14.f91858r = r12
            java.lang.Object r13 = r1.y0(r14)
            if (r13 != r15) goto L_0x011a
            return r15
        L_0x011a:
            r17 = r3
            r3 = r0
            r0 = r9
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r17
            r18 = r11
            r11 = r2
            r2 = r18
            r19 = r12
            r12 = r10
            r10 = r19
        L_0x012e:
            r16 = r13
            java.lang.String r16 = (java.lang.String) r16
            r14.f91843c = r3
            r14.f91844d = r1
            r14.f91845e = r2
            r14.f91846f = r11
            r14.f91847g = r12
            r14.f91848h = r4
            r14.f91849i = r5
            r14.f91850j = r6
            r14.f91851k = r7
            r14.f91852l = r0
            r14.f91853m = r13
            r14.f91854n = r8
            r14.f91855o = r10
            r3 = 2
            r14.f91858r = r3
            r12 = 0
            r13 = 0
            r11 = r0
            r0 = 1
            r0 = r13
            r13 = r16
            java.lang.Object r4 = r4.a(r5, r6, r7, r8, r10, r11, r12, r13, r14)
            if (r4 != r15) goto L_0x015d
            return r15
        L_0x015d:
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x0162:
            java.lang.Throwable r11 = XH.x.e(r4)
            if (r11 != 0) goto L_0x0196
            XH.N r4 = (XH.C16807N) r4
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r4 = r2.f91813H
        L_0x016c:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r2
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$n r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$n
            int r3 = Ez.f.f109677Q
            com.ingka.ikea.core.model.product.ProductItem r5 = r1.k()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r5 = r5.e()
            java.lang.String r5 = r5.i()
            java.util.List r5 = YH.C16877v.e(r5)
            IC.e r3 = IC.C13026h.f(r3, r5)
            r2.<init>(r3)
            boolean r0 = r4.e(r0, r2)
            if (r0 == 0) goto L_0x016c
            goto L_0x0268
        L_0x0196:
            boolean r4 = r11 instanceof Xi.a.C1906a.C1907a
            if (r4 == 0) goto L_0x01bc
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r4 = r2.f91813H
        L_0x019c:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r2
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$a r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$a
            com.ingka.ikea.core.model.product.ProductItem r3 = r1.k()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r3 = r3.e()
            java.lang.String r3 = r3.i()
            r2.<init>(r3)
            boolean r0 = r4.e(r0, r2)
            if (r0 == 0) goto L_0x019c
            goto L_0x0268
        L_0x01bc:
            qv.e r1 = qv.e.ERROR
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01cf:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r1, r8)
            if (r7 == 0) goto L_0x01cf
            r5.add(r6)
            goto L_0x01cf
        L_0x01e7:
            java.util.Iterator r4 = r5.iterator()
            r5 = r0
            r6 = r5
        L_0x01ed:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0268
            java.lang.Object r7 = r4.next()
            qv.b r7 = (qv.C11819b) r7
            if (r5 != 0) goto L_0x0207
            java.lang.String r5 = qv.C11818a.a(r0, r11)
            if (r5 != 0) goto L_0x0203
            goto L_0x0268
        L_0x0203:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0207:
            r12 = r5
            if (r6 != 0) goto L_0x025a
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r0, r3, r0)
            r8 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r8, r0, r3, r0)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x0228
            goto L_0x022e
        L_0x0228:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x022e:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "main"
            r13 = 1
            boolean r6 = HJ.C15854t.b0(r6, r8, r13)
            if (r6 == 0) goto L_0x0242
            java.lang.String r6 = "m"
            goto L_0x0244
        L_0x0242:
            java.lang.String r6 = "b"
        L_0x0244:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "|"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r14 = r5
            goto L_0x025c
        L_0x025a:
            r13 = 1
            r14 = r6
        L_0x025c:
            r8 = 0
            r5 = r7
            r6 = r1
            r7 = r14
            r9 = r11
            r10 = r12
            r5.a(r6, r7, r8, r9, r10)
            r5 = r12
            r6 = r14
            goto L_0x01ed
        L_0x0268:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.l0(com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h, rz.I, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m0(rz.I r24, dI.C17164e<? super XH.C16807N> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$d r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.d) r2
            int r3 = r2.f91870n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91870n = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$d r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f91868l
            java.lang.Object r13 = eI.C17187b.f()
            int r4 = r2.f91870n
            r14 = 0
            r15 = 0
            r12 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x00d2
            if (r4 == r7) goto L_0x00a9
            if (r4 == r6) goto L_0x0084
            if (r4 == r5) goto L_0x0059
            if (r4 != r12) goto L_0x0051
            java.lang.Object r1 = r2.f91865i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91864h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91863g
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r1 = r2.f91861e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f91860d
            rz.I r1 = (rz.I) r1
            java.lang.Object r1 = r2.f91859c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r1 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r1
            XH.y.b(r3)
            goto L_0x01e1
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0059:
            java.lang.Object r1 = r2.f91866j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.f91865i
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.f91864h
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f91863g
            rz.O r5 = (rz.O) r5
            java.lang.Object r5 = r2.f91862f
            Tj.a r5 = (Tj.C10936a) r5
            java.lang.Object r5 = r2.f91861e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r2.f91860d
            rz.I r6 = (rz.I) r6
            java.lang.Object r7 = r2.f91859c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r7 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r7
            XH.y.b(r3)
            XH.x r3 = (XH.x) r3
            java.lang.Object r3 = r3.j()
            goto L_0x0186
        L_0x0084:
            java.lang.Object r1 = r2.f91865i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.f91864h
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.f91863g
            rz.O r6 = (rz.O) r6
            java.lang.Object r7 = r2.f91862f
            Tj.a r7 = (Tj.C10936a) r7
            java.lang.Object r8 = r2.f91861e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r2.f91860d
            rz.I r9 = (rz.I) r9
            java.lang.Object r10 = r2.f91859c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r10 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r10
            XH.y.b(r3)
            r11 = r8
            r8 = r10
            r10 = r9
            r9 = r4
            goto L_0x0145
        L_0x00a9:
            int r1 = r2.f91867k
            java.lang.Object r4 = r2.f91865i
            Sy.a$b r4 = (Sy.a.b) r4
            java.lang.Object r4 = r2.f91864h
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f91863g
            rz.O r7 = (rz.O) r7
            java.lang.Object r8 = r2.f91862f
            Tj.a r8 = (Tj.C10936a) r8
            java.lang.Object r9 = r2.f91861e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r2.f91860d
            rz.I r10 = (rz.I) r10
            java.lang.Object r11 = r2.f91859c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r11 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r11
            XH.y.b(r3)
            r22 = r3
            r3 = r1
            r1 = r9
            r9 = r4
            r4 = r22
            goto L_0x0121
        L_0x00d2:
            XH.y.b(r3)
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r3 = r0.f91812G
        L_0x00d7:
            java.lang.Object r4 = r3.getValue()
            r8 = r4
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r8 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r8
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$a r8 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.a.f91765a
            boolean r4 = r3.e(r4, r8)
            if (r4 == 0) goto L_0x01e4
            Tj.a r8 = r0.f91825o
            Ej.a r3 = r23.v0()
            rz.O r3 = r3.h()
            Ej.a r4 = r23.v0()
            Sy.a$b r4 = r4.e()
            if (r4 == 0) goto L_0x00ff
            java.lang.String r9 = r4.j()
            goto L_0x0100
        L_0x00ff:
            r9 = r14
        L_0x0100:
            tz.a r10 = r0.f91807B
            r2.f91859c = r0
            r11 = r24
            r2.f91860d = r11
            r2.f91861e = r1
            r2.f91862f = r8
            r2.f91863g = r3
            r2.f91864h = r9
            r2.f91865i = r4
            r2.f91867k = r15
            r2.f91870n = r7
            java.lang.Object r4 = r10.a(r2)
            if (r4 != r13) goto L_0x011d
            return r13
        L_0x011d:
            r7 = r3
            r10 = r11
            r3 = r15
            r11 = r0
        L_0x0121:
            rz.K r4 = (rz.K) r4
            java.lang.String r4 = r4.a()
            r2.f91859c = r11
            r2.f91860d = r10
            r2.f91861e = r1
            r2.f91862f = r8
            r2.f91863g = r7
            r2.f91864h = r9
            r2.f91865i = r4
            r2.f91867k = r3
            r2.f91870n = r6
            java.lang.Object r3 = r11.y0(r2)
            if (r3 != r13) goto L_0x0140
            return r13
        L_0x0140:
            r6 = r7
            r7 = r8
            r8 = r11
            r11 = r1
            r1 = r4
        L_0x0145:
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r2.f91859c = r8
            r2.f91860d = r10
            r2.f91861e = r11
            r2.f91862f = r7
            r2.f91863g = r6
            r2.f91864h = r9
            r2.f91865i = r1
            r2.f91866j = r4
            r2.f91870n = r5
            r16 = 0
            r17 = 8
            r18 = 0
            r3 = r7
            r19 = r4
            r4 = r10
            r5 = r6
            r6 = r9
            r7 = r16
            r16 = r8
            r8 = r19
            r9 = r1
            r20 = r10
            r10 = r2
            r21 = r11
            r11 = r17
            r12 = r18
            java.lang.Object r3 = Tj.C10936a.C1816a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L_0x017d
            return r13
        L_0x017d:
            r4 = r1
            r7 = r16
            r1 = r19
            r6 = r20
            r5 = r21
        L_0x0186:
            java.lang.Throwable r8 = XH.x.e(r3)
            if (r8 != 0) goto L_0x01c7
            XH.N r3 = (XH.C16807N) r3
            Sy.a r1 = r7.f91833w
            java.lang.String r2 = r6.c()
            rz.y r3 = r6.p()
            java.lang.String r3 = r3.b()
            r1.G(r2, r3)
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r9 = r7.f91813H
        L_0x01a1:
            java.lang.Object r1 = r9.getValue()
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r2
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$b r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$b
            rz.v r3 = r6.f()
            r2.<init>(r6, r3)
            boolean r1 = r9.e(r1, r2)
            if (r1 == 0) goto L_0x01a1
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r1 = r7.f91812G
        L_0x01b9:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r3 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r3
            boolean r2 = r1.e(r2, r14)
            if (r2 == 0) goto L_0x01b9
            goto L_0x01e1
        L_0x01c7:
            r2.f91859c = r7
            r2.f91860d = r6
            r2.f91861e = r5
            r2.f91862f = r3
            r2.f91863g = r8
            r2.f91864h = r4
            r2.f91865i = r1
            r2.f91867k = r15
            r4 = 4
            r2.f91870n = r4
            java.lang.Object r1 = r7.P0(r6, r8, r2)
            if (r1 != r13) goto L_0x01e1
            return r13
        L_0x01e1:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x01e4:
            r11 = r24
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.m0(rz.I, dI.e):java.lang.Object");
    }

    private final void n0() {
        I c10;
        f value;
        G value2 = this.f91814I.getValue();
        if (value2 != null && (c10 = value2.c()) != null) {
            this.f91833w.q(Interaction$Component.SHOP_AND_GO_PIP_ADD_TO_WISHLIST, c10.l().getProductNo(), c10.l().getProductType(), D.a(c10.p()));
            C16505B<f> b10 = this.f91813H;
            do {
                value = b10.getValue();
                f fVar = value;
            } while (!b10.e(value, new f.m(c10.k().e().i(), c10.l().getProductNo())));
        }
    }

    /* access modifiers changed from: private */
    public final f o0(a.C1585a aVar) {
        return b.f91842c[aVar.ordinal()] == 1 ? f.q.f91801a : f.p.f91800a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0113 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p0(rz.I r17, int r18, boolean r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.e
            if (r2 == 0) goto L_0x0018
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$e r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.e) r2
            int r3 = r2.f91884p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f91884p = r3
        L_0x0016:
            r9 = r2
            goto L_0x001e
        L_0x0018:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$e r2 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$e
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r9.f91882n
            java.lang.Object r10 = eI.C17187b.f()
            int r3 = r9.f91884p
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00b1
            if (r3 == r6) goto L_0x008b
            if (r3 == r5) goto L_0x0062
            if (r3 != r4) goto L_0x005a
            int r1 = r9.f91878j
            java.lang.Object r3 = r9.f91877i
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r3 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r3
            java.lang.Object r3 = r9.f91876h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r9.f91875g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r9.f91874f
            Tj.j r3 = (Tj.j) r3
            java.lang.Object r3 = r9.f91873e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r9.f91872d
            rz.I r3 = (rz.I) r3
            java.lang.Object r4 = r9.f91871c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r4 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r4
            XH.y.b(r2)
            XH.x r2 = (XH.x) r2
            java.lang.Object r2 = r2.j()
            goto L_0x0141
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            int r1 = r9.f91879k
            boolean r3 = r9.f91881m
            int r5 = r9.f91878j
            java.lang.Object r6 = r9.f91877i
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r6
            java.lang.Object r7 = r9.f91875g
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.f91874f
            Tj.j r8 = (Tj.j) r8
            java.lang.Object r11 = r9.f91873e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r9.f91872d
            rz.I r12 = (rz.I) r12
            java.lang.Object r13 = r9.f91871c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r13 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r13
            XH.y.b(r2)
            r14 = r1
            r1 = r5
            r5 = r6
            r6 = r3
            r3 = r8
            r8 = r7
            goto L_0x011d
        L_0x008b:
            int r1 = r9.f91880l
            boolean r3 = r9.f91881m
            int r6 = r9.f91878j
            java.lang.Object r7 = r9.f91876h
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r7 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r7
            java.lang.Object r8 = r9.f91875g
            java.lang.Object r11 = r9.f91874f
            Tj.j r11 = (Tj.j) r11
            java.lang.Object r12 = r9.f91873e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r9.f91872d
            rz.I r13 = (rz.I) r13
            java.lang.Object r14 = r9.f91871c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r14 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r14
            XH.y.b(r2)
            r15 = r14
            r14 = r1
            r1 = r12
            r12 = r6
            r6 = r7
            r7 = r15
            goto L_0x00f1
        L_0x00b1:
            XH.y.b(r2)
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r2 = r0.f91812G
        L_0x00b6:
            java.lang.Object r8 = r2.getValue()
            r3 = r8
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r3 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r3
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e$c r3 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e.c.f91767a
            boolean r7 = r2.e(r8, r3)
            if (r7 == 0) goto L_0x0176
            Tj.j r11 = r0.f91826p
            tz.a r2 = r0.f91807B
            r9.f91871c = r0
            r7 = r17
            r9.f91872d = r7
            r9.f91873e = r1
            r9.f91874f = r11
            r9.f91875g = r8
            r9.f91876h = r3
            r12 = r18
            r9.f91878j = r12
            r13 = r19
            r9.f91881m = r13
            r14 = 0
            r9.f91879k = r14
            r9.f91880l = r14
            r9.f91884p = r6
            java.lang.Object r2 = r2.a(r9)
            if (r2 != r10) goto L_0x00ed
            return r10
        L_0x00ed:
            r6 = r3
            r3 = r13
            r13 = r7
            r7 = r0
        L_0x00f1:
            rz.K r2 = (rz.K) r2
            java.lang.String r2 = r2.a()
            r9.f91871c = r7
            r9.f91872d = r13
            r9.f91873e = r1
            r9.f91874f = r11
            r9.f91875g = r2
            r9.f91876h = r8
            r9.f91877i = r6
            r9.f91878j = r12
            r9.f91881m = r3
            r9.f91879k = r14
            r9.f91884p = r5
            java.lang.Object r5 = r7.y0(r9)
            if (r5 != r10) goto L_0x0114
            return r10
        L_0x0114:
            r8 = r2
            r2 = r5
            r5 = r6
            r6 = r3
            r3 = r11
            r11 = r1
            r1 = r12
            r12 = r13
            r13 = r7
        L_0x011d:
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r9.f91871c = r13
            r9.f91872d = r12
            r9.f91873e = r11
            r9.f91874f = r3
            r9.f91875g = r8
            r9.f91876h = r7
            r9.f91877i = r5
            r9.f91878j = r1
            r9.f91881m = r6
            r9.f91879k = r14
            r9.f91884p = r4
            r4 = r12
            r5 = r1
            java.lang.Object r2 = r3.a(r4, r5, r6, r7, r8, r9)
            if (r2 != r10) goto L_0x013f
            return r10
        L_0x013f:
            r3 = r12
            r4 = r13
        L_0x0141:
            java.lang.Throwable r5 = XH.x.e(r2)
            if (r5 != 0) goto L_0x015e
            XH.N r2 = (XH.C16807N) r2
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f> r2 = r4.f91813H
        L_0x014b:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f) r6
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$e r6 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$e
            r6.<init>(r3, r1)
            boolean r5 = r2.e(r5, r6)
            if (r5 == 0) goto L_0x014b
            goto L_0x0161
        L_0x015e:
            r4.R0(r3, r1, r5)
        L_0x0161:
            XH.N r1 = XH.C16807N.f139792a
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e> r3 = r4.f91812G
        L_0x0165:
            java.lang.Object r1 = r3.getValue()
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e r2 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e) r2
            r2 = 0
            boolean r1 = r3.e(r1, r2)
            if (r1 == 0) goto L_0x0165
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0176:
            r7 = r17
            r12 = r18
            r13 = r19
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.p0(rz.I, int, boolean, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object q0(h hVar, I i10, int i11, boolean z10, C17164e eVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return hVar.p0(i10, i11, z10, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if ((r8.c() + r7) <= r8.a()) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if ((r7.c() + r8) <= r7.a()) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Uj.j r0(rz.I r6, int r7, int r8) {
        /*
            r5 = this;
            rz.U r0 = r6.m()
            boolean r1 = r0 instanceof rz.U.b
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0075
            boolean r1 = r0 instanceof rz.U.c
            if (r1 == 0) goto L_0x000f
            goto L_0x0075
        L_0x000f:
            boolean r1 = r0 instanceof rz.U.a
            if (r1 == 0) goto L_0x006f
            boolean r1 = r5.G0(r6)
            if (r1 == 0) goto L_0x0023
            if (r7 <= 0) goto L_0x0023
            r1 = r0
            rz.U$a r1 = (rz.U.a) r1
            int r1 = r1.a()
            goto L_0x002a
        L_0x0023:
            r1 = r0
            rz.U$a r1 = (rz.U.a) r1
            int r1 = r1.b()
        L_0x002a:
            boolean r6 = r5.H0(r6)
            if (r6 == 0) goto L_0x0040
            r8 = r0
            rz.U$a r8 = (rz.U.a) r8
            int r4 = r8.c()
            int r4 = r4 + r7
            int r7 = r8.a()
            if (r4 > r7) goto L_0x004f
        L_0x003e:
            r2 = r3
            goto L_0x004f
        L_0x0040:
            r7 = r0
            rz.U$a r7 = (rz.U.a) r7
            int r4 = r7.c()
            int r4 = r4 + r8
            int r7 = r7.a()
            if (r4 > r7) goto L_0x004f
            goto L_0x003e
        L_0x004f:
            if (r6 == 0) goto L_0x005f
            if (r2 == 0) goto L_0x005f
            Uj.j$c r6 = new Uj.j$c
            rz.U$a r0 = (rz.U.a) r0
            int r7 = r0.c()
            r6.<init>(r7, r3)
            goto L_0x0086
        L_0x005f:
            Uj.j$b r6 = new Uj.j$b
            rz.U$a r0 = (rz.U.a) r0
            int r7 = r0.d()
            int r8 = r0.c()
            r6.<init>(r7, r1, r8, r2)
            goto L_0x0086
        L_0x006f:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0075:
            int r6 = r0.c()
            int r6 = r6 + r8
            int r7 = r0.b()
            if (r6 > r7) goto L_0x0081
            r2 = r3
        L_0x0081:
            Uj.j$a r6 = new Uj.j$a
            r6.<init>(r2)
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.r0(rz.I, int, int):Uj.j");
    }

    /* access modifiers changed from: private */
    public final void s0(I i10, boolean z10, int i11, int i12) {
        G value;
        f value2;
        C15013f c10;
        f value3;
        C16505B<G> b10 = this.f91814I;
        do {
            value = b10.getValue();
            G g10 = value;
        } while (!b10.e(value, new G(i10, r0(i10, i11, i12), z10, i11, v0().h())));
        if (E0(i10)) {
            C16505B<f> b11 = this.f91813H;
            do {
                value3 = b11.getValue();
                f fVar = value3;
            } while (!b11.e(value3, new f.i(C13026h.a(Ez.f.f109680T))));
        } else if (i10.h().c() instanceof C15013f.a) {
            C16505B<f> b12 = this.f91813H;
            do {
                value2 = b12.getValue();
                f fVar2 = value2;
                c10 = i10.h().c();
                C17542s.h(c10, "null cannot be cast to non-null type com.ingka.ikea.scanandgo.datalayer.model.AvailabilityWarning.Available");
            } while (!b12.e(value2, new f.i(C13026h.c(((C15013f.a) c10).a()))));
        }
    }

    /* access modifiers changed from: private */
    public final g t0() {
        g gVar = this.f91821P;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final N u0() {
        return new f(N.f137593c0, this);
    }

    /* access modifiers changed from: private */
    public final C10706a v0() {
        C10706a aVar = this.f91820O;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final Object w0(String str, C17164e<? super o.a> eVar) {
        return this.f91829s.a(str, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x0(rz.I r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$g r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.g) r0
            int r1 = r0.f91891h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91891h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$g r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f91889f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91891h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f91888e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f91887d
            rz.I r6 = (rz.I) r6
            java.lang.Object r7 = r0.f91886c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r7 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r7
            XH.y.b(r1)
            goto L_0x0054
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            java.lang.String r1 = r6.c()
            r0.f91886c = r5
            r0.f91887d = r6
            r0.f91888e = r7
            r0.f91891h = r4
            java.lang.Object r1 = r5.w0(r1, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            r7 = r5
        L_0x0054:
            Tj.o$a r1 = (Tj.o.a) r1
            jj.d r0 = r7.f91830t
            r0.a()
            int r0 = r1.b()
            int r1 = r1.a()
            r7.s0(r6, r4, r0, r1)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.x0(rz.I, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y0(dI.C17164e<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.C2027h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$h r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.C2027h) r0
            int r1 = r0.f91896g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91896g = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$h r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h$h
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f91894e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91896g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f91893d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f91892c
            com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h r6 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            FB.a r1 = r5.f91827q
            TJ.g r1 = r1.b()
            TJ.g r1 = TJ.C16534i.A(r1)
            r0.f91892c = r5
            r0.f91893d = r6
            r0.f91896g = r4
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            EB.d r1 = (EB.C12832d) r1
            java.lang.String r6 = r1.e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.h.y0(dI.e):java.lang.Object");
    }

    private final f z0(I i10, C11550a.c cVar, c.a aVar) {
        if (aVar instanceof c.a.b) {
            return f.c.C2025c.f91778a;
        }
        if (aVar instanceof c.a.C2467c) {
            return new f.c.b(i10, cVar);
        }
        if (aVar instanceof c.a.C2466a) {
            return new f.n(((c.a.C2466a) aVar).a());
        }
        throw new XH.t();
    }

    public void N0(l lVar) {
        b.a b10;
        C17542s.j(lVar, "action");
        if (C17542s.e(lVar, l.g.f92040a)) {
            T0();
        } else if (C17542s.e(lVar, l.e.f92038a)) {
            O0();
        } else if (C17542s.e(lVar, l.f.f92039a)) {
            S0();
        } else if (C17542s.e(lVar, l.b.f92034a)) {
            b b11 = getState().getValue().b();
            if (b11 == null || (b10 = b11.b()) == null || b10.a()) {
                F0 unused = C16314k.d(g0.a(this), this.f91822Q, (T) null, new n(this, (C17164e<? super n>) null), 2, (Object) null);
            }
        } else if (C17542s.e(lVar, l.h.f92041a)) {
            this.f91833w.M();
        } else if (C17542s.e(lVar, l.i.f92042a)) {
            I0();
        } else if (lVar instanceof l.d) {
            l.d dVar = (l.d) lVar;
            L0(dVar.a(), dVar.b());
        } else if (C17542s.e(lVar, l.c.f92035a)) {
            this.f91813H.setValue(null);
        } else if (lVar instanceof l.j) {
            W0(((l.j) lVar).a());
        } else if (lVar instanceof l.C2030l) {
            A0(((l.C2030l) lVar).a());
        } else if (C17542s.e(lVar, l.a.f92033a)) {
            n0();
        } else if (C17542s.e(lVar, l.k.f92044a)) {
            X0();
        } else if (lVar instanceof l.m) {
            a1(((l.m) lVar).a());
        } else if (lVar instanceof l.n) {
            b1(((l.n) lVar).a());
        } else {
            throw new XH.t();
        }
    }

    public final void Y0(k kVar) {
        C17542s.j(kVar, "track");
        if (C17542s.e(kVar, k.a.f92032a)) {
            Z0();
            return;
        }
        throw new XH.t();
    }

    public final boolean c1(I i10) {
        C17542s.j(i10, "product");
        return i10.p() == C15031y.CASH_AND_CARRY || G0(i10);
    }

    public C16519P<j> getState() {
        return this.f91817L;
    }
}
