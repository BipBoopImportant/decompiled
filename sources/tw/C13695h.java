package Tw;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import KJ.C15985a;
import KJ.C15987c;
import Mw.C13211a;
import Mw.C13213c;
import Nn.C10798a;
import Nn.C10804g;
import Nn.C10805h;
import Nn.C10807j;
import Nn.C10809l;
import Nn.D;
import Nn.F;
import Nn.t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qw.C13472e0;
import Qw.C13473f;
import Qw.N0;
import Rg.a;
import Rw.C13555c;
import Rw.C13557e;
import Rw.C13559g;
import Rw.i;
import Rw.k;
import Sw.C13669a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tw.C13688a;
import Tw.C13693f;
import Tw.C13710m;
import Wg.d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.os.Bundle;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import qx.C14956a;
import rv.C11849b;

@Metadata(d1 = {"\u0000ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\nì\u0001í\u0001î\u0001ï\u0001ð\u0001BY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u001d2\u0006\u00101\u001a\u000204¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u0010'J\u0017\u00109\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001b¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010AJ!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190J2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020!¢\u0006\u0004\bN\u0010OJ5\u0010S\u001a\b\u0012\u0004\u0012\u00020R0 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010 H\u0001¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001dH\u0016¢\u0006\u0004\bU\u0010'J\u000f\u0010V\u001a\u00020\u001dH\u0016¢\u0006\u0004\bV\u0010'J\u0017\u0010Y\u001a\u00020\u001d2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u001d2\b\b\u0003\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u001d¢\u0006\u0004\b_\u0010'J\r\u0010`\u001a\u00020\u001d¢\u0006\u0004\b`\u0010'J\u001d\u0010a\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\ba\u0010FJ\u0017\u0010d\u001a\u00020\u001d2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u001d2\u0006\u0010f\u001a\u00020\u0019H\u0002¢\u0006\u0004\bg\u0010:J\u001f\u0010k\u001a\u00020j2\u0006\u0010h\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020BH\u0002¢\u0006\u0004\bk\u0010lJ!\u0010o\u001a\u00020n2\b\u0010m\u001a\u0004\u0018\u00010b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bq\u0010:J.\u0010t\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001a\u001a\u00020\u0019H@¢\u0006\u0004\bt\u0010uJ?\u0010y\u001a\u00020R*\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010v\u001a\u00020\u00192\f\u0010x\u001a\b\u0012\u0004\u0012\u00020w0 2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010 H\u0002¢\u0006\u0004\by\u0010zJ+\u0010|\u001a\u0004\u0018\u00010{*\b\u0012\u0004\u0012\u00020!0 2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010 H\u0002¢\u0006\u0004\b|\u0010}J\u0018\u0010\u001a\u00020\u001d2\u0006\u0010~\u001a\u00020nH\u0002¢\u0006\u0005\b\u0010\u0001J\"\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020!0 *\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00030\u0001*\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\bV\u0010\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0007\n\u0005\bH\u0010\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0001R\u0018\u0010\u0001\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0001R\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R!\u0010<\u001a\t\u0012\u0004\u0012\u00020;0\u00018\u0006¢\u0006\u000f\n\u0005\b9\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010¡\u0001\u001a\u00020\u001b8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010|\u001a\u0006\b\u0001\u0010 \u0001R\u001f\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¥\u0001R\u001e\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010¥\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¥\u0001R\u001d\u0010­\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190¢\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b*\u0010¥\u0001R \u0010±\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010r0®\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R*\u0010s\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R\u001f\u0010#\u001a\u00020\u00198FX\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R!\u0010¾\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¼\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\b½\u0001\u0010°\u0001R!\u0010À\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¥\u0001R!\u0010Â\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¥\u0001R!\u0010Ä\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010°\u0001R!\u0010Æ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010°\u0001R!\u0010É\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ç\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010¥\u0001R\u001f\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bË\u0001\u0010°\u0001R0\u0010Ó\u0001\u001a\u0005\u0018\u00010Í\u00012\n\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u00018\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010Ö\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ô\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010°\u0001R\u001f\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010°\u0001R\u001f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010°\u0001R!\u0010ß\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ý\u00010®\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010°\u0001R'\u0010å\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010à\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\b\u0001\u0010ä\u0001R\u0019\u0010ç\u0001\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010²\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010|R\u0014\u0010ê\u0001\u001a\u0002048F¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0013\u0010\u001a\u001a\u00020\u00198F¢\u0006\b\u001a\u0006\bë\u0001\u0010»\u0001¨\u0006ñ\u0001"}, d2 = {"LTw/h;", "Landroidx/lifecycle/f0;", "LQw/N0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LIl/a;", "appConfigApi", "LNn/x;", "checkoutRepository", "LMw/a;", "paymentAnalytics", "LMw/c;", "paymentDevAnalytics", "LRw/i;", "getShopperReturnUrlUseCase", "LRw/g;", "getPaymentPriceUseCase", "LRw/e;", "getPaymentConfigUseCase", "LRw/c;", "getGooglePayExpressSettingsUseCase", "LWg/d;", "uiErrorHandler", "<init>", "(Landroidx/lifecycle/U;LIl/a;LNn/x;LMw/a;LMw/c;LRw/i;LRw/g;LRw/e;LRw/c;LWg/d;)V", "", "checkoutId", "", "isSwishInstalled", "LXH/N;", "p0", "(Ljava/lang/String;Z)V", "", "LNn/D;", "paymentOptions", "shopperResultUrl", "X", "(Ljava/util/List;Ljava/lang/String;)V", "v0", "()V", "LNn/l;", "completePayment", "B", "(LNn/l;)V", "Landroid/os/Bundle;", "bundle", "x0", "(Ljava/lang/String;Landroid/os/Bundle;)V", "LNn/j;", "state", "w0", "(LNn/j;)V", "LTw/n;", "F0", "(LTw/n;)V", "s", "giftCardId", "v", "(Ljava/lang/String;)V", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;", "result", "m0", "(Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;)V", "showLoading", "B0", "(Z)V", "", "c0", "()D", "q", "(Ljava/util/List;)V", "expanded", "p", "supportedPaymentOptions", "", "b0", "(Ljava/util/List;)Ljava/util/Set;", "paymentOptionHolder", "a0", "(LNn/D;)Ljava/lang/String;", "Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "paymentTermsAndConditions", "LTw/f$b;", "W", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "t", "o", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "paymentError", "s0", "(Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "", "description", "C0", "(I)V", "A0", "T", "u0", "", "throwable", "o0", "(Ljava/lang/Throwable;)V", "paymentBrandName", "V", "hasGiftCard", "leftToPayAmount", "LTw/f$c$a;", "h0", "(ZD)LTw/f$c$a;", "error", "LNn/F;", "f0", "(Ljava/lang/Throwable;LNn/l;)LNn/F;", "E0", "LNn/H;", "pspSession", "t0", "(LNn/H;Ljava/util/List;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "title", "LNn/A;", "participatingBanks", "r0", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)LTw/f$b;", "LQw/e0$c;", "Z", "(Ljava/util/List;Ljava/util/List;)LQw/e0$c;", "transaction", "n0", "(LNn/F;)V", "Y", "(Ljava/util/List;)Ljava/util/List;", "LNn/t;", "LTw/f$a;", "U", "(LNn/t;)LTw/f$a;", "LRg/a;", "g0", "()LRg/a;", "m", "Landroidx/lifecycle/U;", "n", "LIl/a;", "LNn/x;", "LMw/a;", "LMw/c;", "r", "LRw/c;", "LWg/d;", "LTw/n;", "_transactionState", "Lip/b;", "u", "Lip/b;", "_result", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/F;", "j0", "()Landroidx/lifecycle/F;", "w", "q0", "()Z", "isExpressGooglePay", "LTJ/B;", "LTw/a;", "x", "LTJ/B;", "action", "y", "isRestoringState", "z", "showProgress", "A", "paymentSummaryExpanded", "checkoutIdFlow", "LTJ/g;", "C", "LTJ/g;", "pspSessionFlow", "D", "LNn/H;", "i0", "()LNn/H;", "y0", "(LNn/H;)V", "E", "LXH/o;", "k0", "()Ljava/lang/String;", "LRC/m;", "F", "checkoutPriceData", "G", "expressActivityPaymentError", "H", "expressPaymentInitializeError", "I", "expressPspSessionError", "J", "expressPaymentError", "LTw/h$e;", "K", "recoverablePaymentError", "LRw/k;", "L", "paymentConfig", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "value", "M", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "d0", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderNameValidation", "LNn/C;", "N", "paymentHolder", "LTw/h$c;", "O", "paymentSummary", "LTw/h$b;", "P", "loadingState", "LTw/h$d;", "Q", "uiContent", "LTJ/P;", "LTw/f;", "R", "LTJ/P;", "()LTJ/P;", "uiState", "S", "amountLeftToPay", "l0", "()LTw/n;", "transactionState", "e0", "c", "b", "d", "e", "a", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tw.h  reason: case insensitive filesystem */
public final class C13695h extends f0 implements N0 {

    /* renamed from: U  reason: collision with root package name */
    public static final C13696a f116817U = new C13696a((DefaultConstructorMarker) null);

    /* renamed from: X  reason: collision with root package name */
    public static final int f116818X = 8;

    /* renamed from: A  reason: collision with root package name */
    private final C16505B<Boolean> f116819A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final C16505B<String> f116820B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final C16532g<Nn.H> f116821C;

    /* renamed from: D  reason: collision with root package name */
    private Nn.H f116822D;

    /* renamed from: E  reason: collision with root package name */
    private final C16824o f116823E;

    /* renamed from: F  reason: collision with root package name */
    private final C16532g<RC.m> f116824F;

    /* renamed from: G  reason: collision with root package name */
    private final C16505B<Nn.t> f116825G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final C16505B<Nn.t> f116826H;

    /* renamed from: I  reason: collision with root package name */
    private final C16532g<Nn.t> f116827I;

    /* renamed from: J  reason: collision with root package name */
    private final C16532g<C13693f.a> f116828J;

    /* renamed from: K  reason: collision with root package name */
    private final C16505B<C13700e> f116829K;

    /* renamed from: L  reason: collision with root package name */
    private final C16532g<k> f116830L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public MComConfig.b f116831M;

    /* renamed from: N  reason: collision with root package name */
    private final C16532g<Nn.C> f116832N;

    /* renamed from: O  reason: collision with root package name */
    private final C16532g<C13698c> f116833O;

    /* renamed from: P  reason: collision with root package name */
    private final C16532g<C13697b> f116834P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16532g<C13699d> f116835Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16519P<C13693f> f116836R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public double f116837S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f116838T;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final U f116839m;

    /* renamed from: n  reason: collision with root package name */
    private final a f116840n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Nn.x f116841o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C13211a f116842p;

    /* renamed from: q  reason: collision with root package name */
    private final C13213c f116843q;

    /* renamed from: r  reason: collision with root package name */
    private final C13555c f116844r;

    /* renamed from: s  reason: collision with root package name */
    private final d f116845s;

    /* renamed from: t  reason: collision with root package name */
    private C13711n f116846t = C13711n.NEW;

    /* renamed from: u  reason: collision with root package name */
    private final C11410b<CheckoutActivityResult> f116847u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.F<CheckoutActivityResult> f116848v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f116849w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C16505B<C13688a> f116850x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C16505B<Boolean> f116851y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C16505B<Boolean> f116852z;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$A", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$A */
    public static final class A extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116853a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public A(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116853a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116853a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Unable to restore checkout and payment step", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$restoreCheckout$3", f = "PaymentViewModelImpl.kt", l = {611}, m = "invokeSuspend")
    /* renamed from: Tw.h$B */
    static final class B extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116854c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116855d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10807j f116856e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        B(C13695h hVar, C10807j jVar, C17164e<? super B> eVar) {
            super(2, eVar);
            this.f116855d = hVar;
            this.f116856e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new B(this.f116855d, this.f116856e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((B) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f116854c;
            if (i10 == 0) {
                XH.y.b(obj);
                Nn.x E10 = this.f116855d.f116841o;
                C10807j jVar = this.f116856e;
                this.f116854c = 1;
                if (E10.u(jVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    C16505B P10 = this.f116855d.f116851y;
                    do {
                        value2 = P10.getValue();
                        ((Boolean) value2).booleanValue();
                    } while (!P10.e(value2, b.a(false)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B P11 = this.f116855d.f116851y;
            do {
                value = P11.getValue();
                ((Boolean) value).booleanValue();
            } while (!P11.e(value, b.a(false)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$special$$inlined$flatMapLatest$1", f = "PaymentViewModelImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Tw.h$C */
    public static final class C extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Nn.H>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116857c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116858d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116859e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13695h f116860f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C(C17164e eVar, C13695h hVar) {
            super(3, eVar);
            this.f116860f = hVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Nn.H> hVar, String str, C17164e<? super C16807N> eVar) {
            C c10 = new C(eVar, this.f116860f);
            c10.f116858d = hVar;
            c10.f116859e = str;
            return c10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116857c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Nn.H> f11 = this.f116860f.f116841o.f((String) this.f116859e);
                this.f116857c = 1;
                if (C16534i.x((C16533h) this.f116858d, f11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$special$$inlined$flatMapLatest$2", f = "PaymentViewModelImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Tw.h$D */
    public static final class D extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super RC.m>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116861c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116862d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116863e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13559g f116864f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public D(C17164e eVar, C13559g gVar) {
            super(3, eVar);
            this.f116864f = gVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super RC.m> hVar, String str, C17164e<? super C16807N> eVar) {
            D d10 = new D(eVar, this.f116864f);
            d10.f116862d = hVar;
            d10.f116863e = str;
            return d10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116861c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<RC.m> a10 = this.f116864f.a((String) this.f116863e);
                this.f116861c = 1;
                if (C16534i.x((C16533h) this.f116862d, a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$special$$inlined$flatMapLatest$3", f = "PaymentViewModelImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Tw.h$E */
    public static final class E extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Nn.t>, Nn.H, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116865c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116866d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116867e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13695h f116868f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public E(C17164e eVar, C13695h hVar) {
            super(3, eVar);
            this.f116868f = hVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Nn.t> hVar, Nn.H h10, C17164e<? super C16807N> eVar) {
            E e10 = new E(eVar, this.f116868f);
            e10.f116866d = hVar;
            e10.f116867e = h10;
            return e10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g gVar;
            String f10;
            Object f11 = C17187b.f();
            int i10 = this.f116865c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16533h hVar = (C16533h) this.f116866d;
                Nn.H h10 = (Nn.H) this.f116867e;
                if (h10 == null || (f10 = h10.f()) == null || (gVar = this.f116868f.f116841o.l(f10)) == null) {
                    gVar = C16521S.a(null);
                }
                this.f116865c = 1;
                if (C16534i.x(hVar, gVar, this) == f11) {
                    return f11;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$special$$inlined$flatMapLatest$4", f = "PaymentViewModelImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Tw.h$F */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Nn.C>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116869c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116870d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116871e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13695h f116872f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public F(C17164e eVar, C13695h hVar) {
            super(3, eVar);
            this.f116872f = hVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Nn.C> hVar, String str, C17164e<? super C16807N> eVar) {
            F f10 = new F(eVar, this.f116872f);
            f10.f116870d = hVar;
            f10.f116871e = str;
            return f10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116869c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Nn.C> p10 = this.f116872f.f116841o.p((String) this.f116871e);
                this.f116869c = 1;
                if (C16534i.x((C16533h) this.f116870d, p10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$G */
    public static final class G implements C16532g<C13693f.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f116873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13695h f116874b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tw.h$G$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f116875a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13695h f116876b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$special$$inlined$map$1$2", f = "PaymentViewModelImpl.kt", l = {50}, m = "emit")
            /* renamed from: Tw.h$G$a$a  reason: collision with other inner class name */
            public static final class C2871a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f116877c;

                /* renamed from: d  reason: collision with root package name */
                int f116878d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f116879e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2871a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f116879e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f116877c = obj;
                    this.f116878d |= Integer.MIN_VALUE;
                    return this.f116879e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C13695h hVar2) {
                this.f116875a = hVar;
                this.f116876b = hVar2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Tw.C13695h.G.a.C2871a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Tw.h$G$a$a r0 = (Tw.C13695h.G.a.C2871a) r0
                    int r1 = r0.f116878d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f116878d = r1
                    goto L_0x0018
                L_0x0013:
                    Tw.h$G$a$a r0 = new Tw.h$G$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f116877c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f116878d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f116875a
                    Nn.t r5 = (Nn.t) r5
                    if (r5 == 0) goto L_0x0041
                    Tw.h r2 = r4.f116876b
                    Tw.f$a r5 = r2.U(r5)
                    goto L_0x0042
                L_0x0041:
                    r5 = 0
                L_0x0042:
                    r0.f116878d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Tw.C13695h.G.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public G(C16532g gVar, C13695h hVar) {
            this.f116873a = gVar;
            this.f116874b = hVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f116873a.collect(new a(hVar, this.f116874b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$H", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$H */
    public static final class H extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116880a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public H(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116880a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C13695h hVar = this.f116880a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Unable to start express google pay", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B F10 = this.f116880a.f116826H;
            do {
                value = F10.getValue();
                Nn.t tVar = (Nn.t) value;
            } while (!F10.e(value, t.a.f84151a));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$startExpressGooglePay$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {963, 970}, m = "invokeSuspend")
    /* renamed from: Tw.h$I */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f116884f;

        /* renamed from: g  reason: collision with root package name */
        Object f116885g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public I(C13695h hVar, C17164e eVar, C13695h hVar2, String str) {
            super(2, eVar);
            this.f116882d = hVar;
            this.f116883e = hVar2;
            this.f116884f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new I(this.f116882d, eVar, this.f116883e, this.f116884f);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((I) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Nn.C c10;
            Object f10 = C17187b.f();
            int i10 = this.f116881c;
            if (i10 == 0) {
                XH.y.b(obj);
                c10 = this.f116883e.f116841o.i(this.f116884f);
                if (c10 != null) {
                    C16532g K10 = this.f116883e.f116821C;
                    this.f116885g = c10;
                    this.f116881c = 1;
                    obj = C16534i.B(K10, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                c10 = (Nn.C) this.f116885g;
                XH.y.b(obj);
            } else if (i10 == 2) {
                try {
                    XH.y.b(obj);
                    this.f116882d.f116852z.setValue(b.a(false));
                    return C16807N.f139792a;
                } catch (Throwable th2) {
                    this.f116882d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj != null) {
                this.f116883e.f116837S = c10.c();
                this.f116883e.f116839m.m("EXPRESS_FLOW_INVOKED_KEY", b.a(true));
                C13695h hVar = this.f116883e;
                List<Nn.D> f11 = c10.f();
                String str = this.f116884f;
                this.f116885g = null;
                this.f116881c = 2;
                if (hVar.t0((Nn.H) obj, f11, str, this) == f10) {
                    return f10;
                }
                this.f116882d.f116852z.setValue(b.a(false));
                return C16807N.f139792a;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LNn/C;", "paymentHolder", "LRC/m;", "priceSummary", "LTw/h$c;", "paymentConfigState", "LTw/h$d;", "<anonymous>", "(LNn/C;LRC/m;LTw/h$c;)LTw/h$d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$uiContent$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$J */
    static final class J extends kotlin.coroutines.jvm.internal.l implements nI.r<Nn.C, RC.m, C13698c, C17164e<? super C13699d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116886c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116887d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116888e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f116889f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13695h f116890g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        J(C13695h hVar, C17164e<? super J> eVar) {
            super(4, eVar);
            this.f116890g = hVar;
        }

        /* renamed from: i */
        public final Object l(Nn.C c10, RC.m mVar, C13698c cVar, C17164e<? super C13699d> eVar) {
            J j10 = new J(this.f116890g, eVar);
            j10.f116887d = c10;
            j10.f116888e = mVar;
            j10.f116889f = cVar;
            return j10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116886c == 0) {
                XH.y.b(obj);
                Nn.C c10 = (Nn.C) this.f116887d;
                RC.m mVar = (RC.m) this.f116888e;
                C13698c cVar = (C13698c) this.f116889f;
                C13693f.c cVar2 = null;
                if (c10 == null) {
                    return null;
                }
                C13695h hVar = this.f116890g;
                boolean z10 = false;
                boolean z11 = c10.c() == 0.0d;
                hVar.f116837S = c10.c();
                List<C13693f.b> W10 = hVar.W(hVar.Y(c10.f()), cVar.a());
                if (mVar != null) {
                    if (mVar.a() != null) {
                        z10 = true;
                    }
                    cVar2 = new C13693f.c(hVar.h0(z10, hVar.f116837S), mVar, cVar.b());
                }
                return new C13699d(W10, cVar2, z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LTw/h$b;", "loadingState", "LTw/h$d;", "uiContent", "LTw/f$a;", "expressError", "LTw/h$e;", "paymentError", "LTw/a;", "action", "LTw/f;", "<anonymous>", "(LTw/h$b;LTw/h$d;LTw/f$a;LTw/h$e;LTw/a;)LTw/f;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$uiState$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$K */
    static final class K extends kotlin.coroutines.jvm.internal.l implements nI.t<C13697b, C13699d, C13693f.a, C13700e, C13688a, C17164e<? super C13693f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116891c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116892d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116893e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f116894f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f116895g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f116896h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13695h f116897i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        K(C13695h hVar, C17164e<? super K> eVar) {
            super(6, eVar);
            this.f116897i = hVar;
        }

        /* renamed from: i */
        public final Object o(C13697b bVar, C13699d dVar, C13693f.a aVar, C13700e eVar, C13688a aVar2, C17164e<? super C13693f> eVar2) {
            K k10 = new K(this.f116897i, eVar2);
            k10.f116892d = bVar;
            k10.f116893e = dVar;
            k10.f116894f = aVar;
            k10.f116895g = eVar;
            k10.f116896h = aVar2;
            return k10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C13693f fVar;
            Object value;
            C13693f fVar2;
            C17187b.f();
            if (this.f116891c == 0) {
                XH.y.b(obj);
                C13697b bVar = (C13697b) this.f116892d;
                C13699d dVar = (C13699d) this.f116893e;
                C13693f.a aVar = (C13693f.a) this.f116894f;
                C13700e eVar = (C13700e) this.f116895g;
                C13688a aVar2 = (C13688a) this.f116896h;
                if (aVar != null) {
                    fVar2 = new C13693f(true, false, (List) null, (C13693f.c) null, (C13693f.d) null, new C13693f.a(aVar.c(), (C13023e) null, aVar.a(), 2, (DefaultConstructorMarker) null), (C13688a) null, 94, (DefaultConstructorMarker) null);
                } else if (bVar.a()) {
                    fVar2 = new C13693f(true, false, (List) null, (C13693f.c) null, (C13693f.d) null, (C13693f.a) null, (C13688a) null, 126, (DefaultConstructorMarker) null);
                } else {
                    boolean z10 = false;
                    C13693f.d dVar2 = null;
                    if (dVar == null) {
                        C13695h hVar = this.f116897i;
                        e eVar2 = e.WARN;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar2, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar2 : arrayList) {
                            if (str == null) {
                                String a10 = C11818a.a("No payment holder available", (Throwable) null);
                                if (a10 == null) {
                                    break;
                                }
                                str = C11820c.a(a10);
                            }
                            if (str2 == null) {
                                String name = hVar.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str3 = str2;
                            bVar2.a(eVar2, str3, false, (Throwable) null, str);
                            str2 = str3;
                        }
                        C16505B k10 = this.f116897i.f116850x;
                        do {
                            value = k10.getValue();
                            C13688a aVar3 = (C13688a) value;
                        } while (!k10.e(value, new C13688a.b((C13023e) null, (List) null, 3, (DefaultConstructorMarker) null)));
                        fVar2 = new C13693f(true, false, (List) null, (C13693f.c) null, (C13693f.d) null, (C13693f.a) null, (C13688a) null, 126, (DefaultConstructorMarker) null);
                    } else {
                        boolean b10 = bVar.b();
                        List<C13693f.b> a11 = dVar.a();
                        C13693f.c b11 = dVar.b();
                        if (dVar.c() && !bVar.b()) {
                            z10 = true;
                        }
                        if (eVar != null) {
                            dVar2 = new C13693f.d(eVar.b(), eVar.a());
                        }
                        fVar = new C13693f(b10, z10, a11, b11, dVar2, (C13693f.a) null, (C13688a) null, 96, (DefaultConstructorMarker) null);
                        return C13693f.b(fVar, false, false, (List) null, (C13693f.c) null, (C13693f.d) null, (C13693f.a) null, aVar2, 63, (Object) null);
                    }
                }
                fVar = fVar2;
                return C13693f.b(fVar, false, false, (List) null, (C13693f.c) null, (C13693f.d) null, (C13693f.a) null, aVar2, 63, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTw/h$a;", "", "<init>", "()V", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$a  reason: case insensitive filesystem */
    public static final class C13696a {
        public /* synthetic */ C13696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13696a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"LTw/h$b;", "", "", "restoringState", "showProgress", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$b  reason: case insensitive filesystem */
    private static final class C13697b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f116898a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f116899b;

        public C13697b(boolean z10, boolean z11) {
            this.f116898a = z10;
            this.f116899b = z11;
        }

        public final boolean a() {
            return this.f116898a;
        }

        public final boolean b() {
            return this.f116899b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13697b)) {
                return false;
            }
            C13697b bVar = (C13697b) obj;
            return this.f116898a == bVar.f116898a && this.f116899b == bVar.f116899b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f116898a) * 31) + Boolean.hashCode(this.f116899b);
        }

        public String toString() {
            boolean z10 = this.f116898a;
            boolean z11 = this.f116899b;
            return "LoadingState(restoringState=" + z10 + ", showProgress=" + z11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LTw/h$c;", "", "", "priceSummaryDefaultExpanded", "", "Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "paymentTermsAndConditions", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$c  reason: case insensitive filesystem */
    private static final class C13698c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f116900a;

        /* renamed from: b  reason: collision with root package name */
        private final List<MComConfig.g> f116901b;

        public C13698c(boolean z10, List<MComConfig.g> list) {
            this.f116900a = z10;
            this.f116901b = list;
        }

        public final List<MComConfig.g> a() {
            return this.f116901b;
        }

        public final boolean b() {
            return this.f116900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13698c)) {
                return false;
            }
            C13698c cVar = (C13698c) obj;
            return this.f116900a == cVar.f116900a && C17542s.e(this.f116901b, cVar.f116901b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f116900a) * 31;
            List<MComConfig.g> list = this.f116901b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            boolean z10 = this.f116900a;
            List<MComConfig.g> list = this.f116901b;
            return "PaymentConfigState(priceSummaryDefaultExpanded=" + z10 + ", paymentTermsAndConditions=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LTw/h$d;", "", "", "LTw/f$b;", "paymentOptions", "LTw/f$c;", "priceSummary", "", "showCompletePurchase", "<init>", "(Ljava/util/List;LTw/f$c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LTw/f$c;", "()LTw/f$c;", "c", "Z", "()Z", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$d  reason: case insensitive filesystem */
    private static final class C13699d {

        /* renamed from: a  reason: collision with root package name */
        private final List<C13693f.b> f116902a;

        /* renamed from: b  reason: collision with root package name */
        private final C13693f.c f116903b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f116904c;

        public C13699d() {
            this((List) null, (C13693f.c) null, false, 7, (DefaultConstructorMarker) null);
        }

        public final List<C13693f.b> a() {
            return this.f116902a;
        }

        public final C13693f.c b() {
            return this.f116903b;
        }

        public final boolean c() {
            return this.f116904c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13699d)) {
                return false;
            }
            C13699d dVar = (C13699d) obj;
            return C17542s.e(this.f116902a, dVar.f116902a) && C17542s.e(this.f116903b, dVar.f116903b) && this.f116904c == dVar.f116904c;
        }

        public int hashCode() {
            int hashCode = this.f116902a.hashCode() * 31;
            C13693f.c cVar = this.f116903b;
            return ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f116904c);
        }

        public String toString() {
            List<C13693f.b> list = this.f116902a;
            C13693f.c cVar = this.f116903b;
            boolean z10 = this.f116904c;
            return "PaymentContentUiState(paymentOptions=" + list + ", priceSummary=" + cVar + ", showCompletePurchase=" + z10 + ")";
        }

        public C13699d(List<C13693f.b> list, C13693f.c cVar, boolean z10) {
            C17542s.j(list, "paymentOptions");
            this.f116902a = list;
            this.f116903b = cVar;
            this.f116904c = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13699d(List list, C13693f.c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LTw/h$e;", "", "LIC/e;", "title", "description", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$e  reason: case insensitive filesystem */
    public static final class C13700e {

        /* renamed from: c  reason: collision with root package name */
        public static final int f116905c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f116906a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f116907b;

        public C13700e(C13023e eVar, C13023e eVar2) {
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "description");
            this.f116906a = eVar;
            this.f116907b = eVar2;
        }

        public final C13023e a() {
            return this.f116907b;
        }

        public final C13023e b() {
            return this.f116906a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13700e)) {
                return false;
            }
            C13700e eVar = (C13700e) obj;
            return C17542s.e(this.f116906a, eVar.f116906a) && C17542s.e(this.f116907b, eVar.f116907b);
        }

        public int hashCode() {
            return (this.f116906a.hashCode() * 31) + this.f116907b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f116906a;
            C13023e eVar2 = this.f116907b;
            return "RecoverableError(title=" + eVar + ", description=" + eVar2 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$f  reason: case insensitive filesystem */
    public /* synthetic */ class C13701f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116908a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f116909b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f116910c;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0097 */
        static {
            /*
                Nn.h$d$a[] r0 = Nn.C10805h.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Nn.h$d$a r2 = Nn.C10805h.d.a.FATAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Nn.h$d$a r3 = Nn.C10805h.d.a.IGNORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Nn.h$d$a r4 = Nn.C10805h.d.a.REFRESH_PAYMENT_OPTIONS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                Nn.h$d$a r5 = Nn.C10805h.d.a.PAYMENT_RESULT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                Nn.h$d$a r6 = Nn.C10805h.d.a.DECLINE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                Nn.h$d$a r7 = Nn.C10805h.d.a.PENDING_SHOPPER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f116908a = r0
                Nn.E[] r0 = Nn.E.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.E r7 = Nn.E.SWISH     // Catch:{ NoSuchFieldError -> 0x004e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                Nn.E r7 = Nn.E.ACI     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                Nn.E r7 = Nn.E.WORLDLINE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r7] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                Nn.E r7 = Nn.E.ALFABANK     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f116909b = r0
                com.oppwa.mobile.connect.exception.ErrorCode[] r0 = com.oppwa.mobile.connect.exception.ErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.oppwa.mobile.connect.exception.ErrorCode r7 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_THREEDS2_FAILED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                com.oppwa.mobile.connect.exception.ErrorCode r1 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_KLARNA_INLINE     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                com.oppwa.mobile.connect.exception.ErrorCode r1 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_GOOGLEPAY     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                com.oppwa.mobile.connect.exception.ErrorCode r1 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_TRANSACTION_ABORTED     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                com.oppwa.mobile.connect.exception.ErrorCode r1 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_CONNECTION_MALFORMED_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.oppwa.mobile.connect.exception.ErrorCode r1 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_BANCONTACT_LINK     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                f116910c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tw.C13695h.C13701f.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$g  reason: case insensitive filesystem */
    public static final class C13702g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10809l f116912b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13702g(N.a aVar, C13695h hVar, C10809l lVar) {
            super(aVar);
            this.f116911a = hVar;
            this.f116912b = lVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116911a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Something went wrong in complete payment", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116911a.o0(th2);
            this.f116911a.f116842p.c(this.f116911a.f0(th2, this.f116912b), this.f116911a.g0());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$completePayment$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {960}, m = "invokeSuspend")
    /* renamed from: Tw.h$h  reason: collision with other inner class name */
    public static final class C2872h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116915e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10809l f116916f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2872h(C13695h hVar, C17164e eVar, C13695h hVar2, C10809l lVar) {
            super(2, eVar);
            this.f116914d = hVar;
            this.f116915e = hVar2;
            this.f116916f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2872h(this.f116914d, eVar, this.f116915e, this.f116916f);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2872h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116913c;
            if (i10 == 0) {
                XH.y.b(obj);
                C10809l lVar = this.f116916f;
                this.f116913c = 1;
                obj = this.f116915e.f116841o.n((String) this.f116915e.f116820B.getValue(), lVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    this.f116914d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Nn.F f11 = (Nn.F) obj;
            C13695h hVar = this.f116915e;
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Complete payment success", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
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
            this.f116915e.n0(f11);
            this.f116914d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$i", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$i  reason: case insensitive filesystem */
    public static final class C13703i extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116917a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13703i(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116917a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116917a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Something went wrong in create Online transfer session", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116917a.A0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$createOnlineTransferSession$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {960}, m = "invokeSuspend")
    /* renamed from: Tw.h$j  reason: case insensitive filesystem */
    public static final class C13704j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116918c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116920e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f116921f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13704j(C13695h hVar, C17164e eVar, C13695h hVar2, String str) {
            super(2, eVar);
            this.f116919d = hVar;
            this.f116920e = hVar2;
            this.f116921f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C13704j(this.f116919d, eVar, this.f116920e, this.f116921f);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C13704j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            char c10;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f116918c;
            if (i10 == 0) {
                XH.y.b(obj);
                String str2 = this.f116921f;
                this.f116918c = 1;
                obj2 = this.f116920e.f116841o.c((String) this.f116920e.f116820B.getValue(), str2, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                    obj2 = obj;
                } catch (Throwable th2) {
                    this.f116919d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Nn.H h10 = (Nn.H) obj2;
            C13695h hVar = this.f116920e;
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str3 = null;
            String str4 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = DslKt.INDICATOR_BACKGROUND;
                c10 = '$';
                if (!hasNext) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str3 == null) {
                    String a10 = C11818a.a("Create online transfer session successful", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str = DslKt.INDICATOR_MAIN;
                    }
                    str4 = str + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str4 = str6;
                str3 = str5;
            }
            int i11 = C13701f.f116909b[h10.e().ordinal()];
            if (i11 != 1) {
                if (!(i11 == 2 || i11 == 3)) {
                    if (i11 != 4) {
                        throw new XH.t();
                    }
                }
                C13695h hVar2 = this.f116920e;
                IllegalStateException illegalStateException = new IllegalStateException("PSP shouldn't be received here " + h10.e());
                e eVar2 = e.ERROR;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                String str7 = null;
                String str8 = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C11819b bVar2 = (C11819b) it2.next();
                    if (str7 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str8 == null) {
                        String name2 = hVar2.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str8, false, illegalStateException, str7);
                    c10 = '$';
                }
                this.f116920e.A0();
            } else {
                C16505B k10 = this.f116920e.f116850x;
                do {
                    value = k10.getValue();
                    C13688a aVar = (C13688a) value;
                } while (!k10.e(value, new C13688a.e(new C13710m.c(h10.f()))));
            }
            this.f116919d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$k  reason: case insensitive filesystem */
    public static final class C13705k<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((C13693f.b) t11).i()), Integer.valueOf(((C13693f.b) t10).i()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$l */
    public static final class l<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((D.g) t11).d()), Integer.valueOf(((D.g) t10).d()));
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$m", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$m */
    public static final class m extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116922a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116922a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116922a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Something went wrong in create PSP session", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116922a.o0(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$createPspSession$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {961, 1011}, m = "invokeSuspend")
    /* renamed from: Tw.h$n */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116924d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116925e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f116926f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f116927g;

        /* renamed from: h  reason: collision with root package name */
        Object f116928h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C13695h hVar, C17164e eVar, C13695h hVar2, String str, List list) {
            super(2, eVar);
            this.f116924d = hVar;
            this.f116925e = hVar2;
            this.f116926f = str;
            this.f116927g = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f116924d, eVar, this.f116925e, this.f116926f, this.f116927g);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f116923c;
            boolean z10 = true;
            if (i10 == 0) {
                XH.y.b(obj);
                str = (String) this.f116925e.f116820B.getValue();
                Nn.x E10 = this.f116925e.f116841o;
                String str2 = this.f116926f;
                this.f116928h = str;
                this.f116923c = 1;
                obj2 = E10.a(str, str2, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                str = (String) this.f116928h;
                XH.y.b(obj);
                obj2 = obj;
            } else if (i10 == 2) {
                try {
                    XH.y.b(obj);
                    this.f116924d.f116852z.setValue(b.a(false));
                    return C16807N.f139792a;
                } catch (Throwable th2) {
                    this.f116924d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Nn.H h10 = (Nn.H) obj2;
            C13695h hVar = this.f116925e;
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("PSP session created successful", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', str3, 2, str3), '.', str3, 2, str3);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, z10) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, (Throwable) null, str6);
                str3 = str3;
                str4 = str6;
                str5 = str7;
                z10 = true;
            }
            String str8 = str3;
            C13695h hVar2 = this.f116925e;
            List list = this.f116927g;
            this.f116928h = str8;
            this.f116923c = 2;
            if (hVar2.t0(h10, list, str, this) == f10) {
                return f10;
            }
            this.f116924d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$o", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$o */
    public static final class o extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116929a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116929a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116929a;
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Something went wrong when deleting gift card.", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116929a.o0(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$deleteGiftCard$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {1006}, m = "invokeSuspend")
    /* renamed from: Tw.h$p */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116930c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116931d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116932e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f116933f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C13695h hVar, C17164e eVar, C13695h hVar2, String str) {
            super(2, eVar);
            this.f116931d = hVar;
            this.f116932e = hVar2;
            this.f116933f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f116931d, eVar, this.f116932e, this.f116933f);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C13695h hVar;
            char c10;
            C13695h hVar2;
            Object f10 = C17187b.f();
            int i10 = this.f116930c;
            if (i10 == 0) {
                XH.y.b(obj);
                C13695h hVar3 = this.f116932e;
                e eVar = e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                String str = null;
                String str2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11819b bVar = (C11819b) it.next();
                    if (str == null) {
                        String a10 = C11818a.a("Delete gift card", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = hVar3.getClass().getName();
                        C17542s.g(name);
                        hVar2 = hVar3;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        hVar2 = hVar3;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    eVar = eVar;
                    hVar3 = hVar2;
                }
                Nn.x E10 = this.f116932e.f116841o;
                Object value = this.f116932e.f116820B.getValue();
                if (value != null) {
                    String str3 = this.f116933f;
                    this.f116930c = 1;
                    if (E10.g((String) value, str3, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    this.f116931d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13695h hVar4 = this.f116932e;
            e eVar2 = e.DEBUG;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            String str4 = null;
            String str5 = null;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C11819b bVar2 = (C11819b) it2.next();
                if (str4 == null) {
                    String a11 = C11818a.a("Gift card deleted. UI will be updated from LiveData", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    String name2 = hVar4.getClass().getName();
                    C17542s.g(name2);
                    c10 = '$';
                    hVar = hVar4;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    hVar = hVar4;
                    c10 = '$';
                }
                char c11 = c10;
                bVar2.a(eVar2, str5, false, (Throwable) null, str4);
                hVar4 = hVar;
            }
            this.f116931d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNn/t;", "expressPaymentInitializeError", "expressPspSessionError", "expressActivityPaymentError", "<anonymous>", "(LNn/t;LNn/t;LNn/t;)LNn/t;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$expressPaymentError$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.r<Nn.t, Nn.t, Nn.t, C17164e<? super Nn.t>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116934c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116935d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116936e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f116937f;

        q(C17164e<? super q> eVar) {
            super(4, eVar);
        }

        /* renamed from: i */
        public final Object l(Nn.t tVar, Nn.t tVar2, Nn.t tVar3, C17164e<? super Nn.t> eVar) {
            q qVar = new q(eVar);
            qVar.f116935d = tVar;
            qVar.f116936e = tVar2;
            qVar.f116937f = tVar3;
            return qVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116934c == 0) {
                XH.y.b(obj);
                Nn.t tVar = (Nn.t) this.f116935d;
                Nn.t tVar2 = (Nn.t) this.f116936e;
                return tVar == null ? tVar2 == null ? (Nn.t) this.f116937f : tVar2 : tVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isRestoringState", "showProgress", "LTw/h$b;", "<anonymous>", "(ZZ)LTw/h$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$loadingState$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$r */
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.q<Boolean, Boolean, C17164e<? super C13697b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116938c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f116939d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f116940e;

        r(C17164e<? super r> eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super C13697b> eVar) {
            r rVar = new r(eVar);
            rVar.f116939d = z10;
            rVar.f116940e = z11;
            return rVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116938c == 0) {
                XH.y.b(obj);
                return new C13697b(this.f116939d, this.f116940e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl", f = "PaymentViewModelImpl.kt", l = {884}, m = "onNewPspSession")
    /* renamed from: Tw.h$s */
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f116941c;

        /* renamed from: d  reason: collision with root package name */
        Object f116942d;

        /* renamed from: e  reason: collision with root package name */
        Object f116943e;

        /* renamed from: f  reason: collision with root package name */
        Object f116944f;

        /* renamed from: g  reason: collision with root package name */
        Object f116945g;

        /* renamed from: h  reason: collision with root package name */
        Object f116946h;

        /* renamed from: i  reason: collision with root package name */
        int f116947i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f116948j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13695h f116949k;

        /* renamed from: l  reason: collision with root package name */
        int f116950l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(C13695h hVar, C17164e<? super s> eVar) {
            super(eVar);
            this.f116949k = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116948j = obj;
            this.f116950l |= Integer.MIN_VALUE;
            return this.f116949k.t0((Nn.H) null, (List<? extends Nn.D>) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRw/k;", "it", "LXH/N;", "<anonymous>", "(LRw/k;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$paymentConfig$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$t */
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<k, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116951c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116952d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(C13695h hVar, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f116953e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            t tVar = new t(this.f116953e, eVar);
            tVar.f116952d = obj;
            return tVar;
        }

        /* renamed from: i */
        public final Object invoke(k kVar, C17164e<? super C16807N> eVar) {
            return ((t) create(kVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116951c == 0) {
                XH.y.b(obj);
                k kVar = (k) this.f116952d;
                this.f116953e.f116831M = kVar.a();
                this.f116953e.p(kVar.c());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LRw/k;", "paymentConfig", "", "paymentSummaryExpanded", "LTw/h$c;", "<anonymous>", "(LRw/k;Z)LTw/h$c;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$paymentSummary$1", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$u */
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.q<k, Boolean, C17164e<? super C13698c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116954c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116955d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f116956e;

        u(C17164e<? super u> eVar) {
            super(3, eVar);
        }

        public final Object i(k kVar, boolean z10, C17164e<? super C13698c> eVar) {
            u uVar = new u(eVar);
            uVar.f116955d = kVar;
            uVar.f116956e = z10;
            return uVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((k) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116954c == 0) {
                XH.y.b(obj);
                return new C13698c(this.f116956e, ((k) this.f116955d).b());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$v", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$v */
    public static final class v extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116957a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116957a = hVar;
        }

        /* JADX WARNING: type inference failed for: r13v8, types: [Nn.F] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleException(dI.C17168i r13, java.lang.Throwable r14) {
            /*
                r12 = this;
                boolean r13 = r14 instanceof Nn.C10805h.d
                if (r13 == 0) goto L_0x000c
                r13 = r14
                Nn.h$d r13 = (Nn.C10805h.d) r13
                Nn.F r13 = r13.b()
                goto L_0x001b
            L_0x000c:
                Nn.F$b r13 = new Nn.F$b
                r7 = 0
                r9 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r0 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            L_0x001b:
                Tw.h r0 = r12.f116957a
                Mw.a r0 = r0.f116842p
                Tw.h r1 = r12.f116957a
                Rg.a r1 = r1.g0()
                r0.c(r13, r1)
                Tw.h r13 = r12.f116957a
                qv.e r6 = qv.e.WARN
                qv.d r0 = qv.d.f102012a
                java.util.List r0 = r0.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x003f:
                boolean r2 = r0.hasNext()
                r7 = 0
                if (r2 == 0) goto L_0x0057
                java.lang.Object r2 = r0.next()
                r3 = r2
                qv.b r3 = (qv.C11819b) r3
                boolean r3 = r3.b(r6, r7)
                if (r3 == 0) goto L_0x003f
                r1.add(r2)
                goto L_0x003f
            L_0x0057:
                java.util.Iterator r8 = r1.iterator()
                r9 = 0
                r0 = r9
                r1 = r0
            L_0x005e:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x00d9
                java.lang.Object r2 = r8.next()
                qv.b r2 = (qv.C11819b) r2
                if (r0 != 0) goto L_0x007a
                java.lang.String r0 = "Something went wrong in put payment status to paid"
                java.lang.String r0 = qv.C11818a.a(r0, r14)
                if (r0 != 0) goto L_0x0076
                goto L_0x00d9
            L_0x0076:
                java.lang.String r0 = qv.C11820c.a(r0)
            L_0x007a:
                r10 = r0
                if (r1 != 0) goto L_0x00cc
                java.lang.Class r0 = r13.getClass()
                java.lang.String r0 = r0.getName()
                kotlin.jvm.internal.C17542s.g(r0)
                r1 = 36
                r3 = 2
                java.lang.String r1 = HJ.C15854t.s1(r0, r1, r9, r3, r9)
                r4 = 46
                java.lang.String r1 = HJ.C15854t.o1(r1, r4, r9, r3, r9)
                int r3 = r1.length()
                if (r3 != 0) goto L_0x009c
                goto L_0x00a2
            L_0x009c:
                java.lang.String r0 = "Kt"
                java.lang.String r0 = HJ.C15854t.P0(r1, r0)
            L_0x00a2:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                java.lang.String r3 = "main"
                r4 = 1
                boolean r1 = HJ.C15854t.b0(r1, r3, r4)
                if (r1 == 0) goto L_0x00b6
                java.lang.String r1 = "m"
                goto L_0x00b8
            L_0x00b6:
                java.lang.String r1 = "b"
            L_0x00b8:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = "|"
                r3.append(r1)
                r3.append(r0)
                java.lang.String r1 = r3.toString()
            L_0x00cc:
                r11 = r1
                r0 = r2
                r1 = r6
                r2 = r11
                r3 = r7
                r4 = r14
                r5 = r10
                r0.a(r1, r2, r3, r4, r5)
                r0 = r10
                r1 = r11
                goto L_0x005e
            L_0x00d9:
                Tw.h r13 = r12.f116957a
                r13.o0(r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tw.C13695h.v.handleException(dI.i, java.lang.Throwable):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$processPayment$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {960}, m = "invokeSuspend")
    /* renamed from: Tw.h$w */
    public static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116958c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116959d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116960e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(C13695h hVar, C17164e eVar, C13695h hVar2) {
            super(2, eVar);
            this.f116959d = hVar;
            this.f116960e = hVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new w(this.f116959d, eVar, this.f116960e);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116958c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f116958c = 1;
                obj = this.f116960e.f116841o.C((String) this.f116960e.f116820B.getValue(), this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    this.f116959d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Nn.F f11 = (Nn.F) obj;
            C13695h hVar = this.f116960e;
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Process payment completed, transaction: " + f11, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
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
            this.f116960e.n0(f11);
            this.f116959d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNn/H;", "it", "LXH/N;", "<anonymous>", "(LNn/H;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$pspSessionFlow$2", f = "PaymentViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.h$x */
    static final class x extends kotlin.coroutines.jvm.internal.l implements nI.p<Nn.H, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116961c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116962d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116963e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(C13695h hVar, C17164e<? super x> eVar) {
            super(2, eVar);
            this.f116963e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            x xVar = new x(this.f116963e, eVar);
            xVar.f116962d = obj;
            return xVar;
        }

        /* renamed from: i */
        public final Object invoke(Nn.H h10, C17164e<? super C16807N> eVar) {
            return ((x) create(h10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116961c == 0) {
                XH.y.b(obj);
                this.f116963e.y0((Nn.H) this.f116962d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/h$y", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.h$y */
    public static final class y extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f116964a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(N.a aVar, C13695h hVar) {
            super(aVar);
            this.f116964a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13695h hVar = this.f116964a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Something went wrong when refreshing payment context", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116964a.o0(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.PaymentViewModelImpl$refreshPaymentOptions$$inlined$launchWithProgress$1", f = "PaymentViewModelImpl.kt", l = {960}, m = "invokeSuspend")
    /* renamed from: Tw.h$z */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116965c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13695h f116966d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13695h f116967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(C13695h hVar, C17164e eVar, C13695h hVar2) {
            super(2, eVar);
            this.f116966d = hVar;
            this.f116967e = hVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new z(this.f116966d, eVar, this.f116967e);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116965c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f116965c = 1;
                if (this.f116967e.f116841o.w((String) this.f116967e.f116820B.getValue(), this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    this.f116966d.f116852z.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13695h hVar = this.f116967e;
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Payment context refreshed. Show payment options again.", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
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
            this.f116966d.f116852z.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    public C13695h(U u10, a aVar, Nn.x xVar, C13211a aVar2, C13213c cVar, i iVar, C13559g gVar, C13557e eVar, C13555c cVar2, d dVar) {
        a aVar3 = aVar;
        Nn.x xVar2 = xVar;
        C13211a aVar4 = aVar2;
        C13213c cVar3 = cVar;
        i iVar2 = iVar;
        C13559g gVar2 = gVar;
        C13555c cVar4 = cVar2;
        d dVar2 = dVar;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar3, "appConfigApi");
        C17542s.j(xVar2, "checkoutRepository");
        C17542s.j(aVar4, "paymentAnalytics");
        C17542s.j(cVar3, "paymentDevAnalytics");
        C17542s.j(iVar2, "getShopperReturnUrlUseCase");
        C17542s.j(gVar2, "getPaymentPriceUseCase");
        C17542s.j(eVar, "getPaymentConfigUseCase");
        C17542s.j(cVar4, "getGooglePayExpressSettingsUseCase");
        C17542s.j(dVar2, "uiErrorHandler");
        this.f116839m = u10;
        this.f116840n = aVar3;
        this.f116841o = xVar2;
        this.f116842p = aVar4;
        this.f116843q = cVar3;
        this.f116844r = cVar4;
        this.f116845s = dVar2;
        C11410b<CheckoutActivityResult> bVar = new C11410b<>();
        this.f116847u = bVar;
        this.f116848v = bVar;
        Boolean bool = (Boolean) u10.f("EXPRESS_GOOGLE_PAY");
        this.f116849w = bool != null ? bool.booleanValue() : false;
        C16505B<C13688a> a10 = C16521S.a(C13688a.c.f116761a);
        this.f116850x = a10;
        Boolean bool2 = Boolean.FALSE;
        C16505B<Boolean> a11 = C16521S.a(bool2);
        this.f116851y = a11;
        C16505B<Boolean> a12 = C16521S.a(bool2);
        this.f116852z = a12;
        C16505B<Boolean> a13 = C16521S.a(bool2);
        this.f116819A = a13;
        C16505B<String> a14 = C16521S.a("");
        this.f116820B = a14;
        C16532g<Nn.H> R10 = C16534i.R(C16534i.g0(a14, new C((C17164e) null, this)), new x(this, (C17164e<? super x>) null));
        this.f116821C = R10;
        this.f116823E = C16825p.b(new C13694g(iVar2));
        C16532g<RC.m> g02 = C16534i.g0(a14, new D((C17164e) null, gVar2));
        this.f116824F = g02;
        C16505B<Nn.t> a15 = C16521S.a(null);
        this.f116825G = a15;
        C16505B<Nn.t> a16 = C16521S.a(null);
        this.f116826H = a16;
        C16532g<Nn.t> g03 = C16534i.g0(R10, new E((C17164e) null, this));
        this.f116827I = g03;
        G g10 = new G(C16534i.m(a16, g03, a15, new q((C17164e<? super q>) null)), this);
        this.f116828J = g10;
        C16505B<C13700e> a17 = C16521S.a(null);
        this.f116829K = a17;
        C16532g<k> R11 = C16534i.R(eVar.invoke(), new t(this, (C17164e<? super t>) null));
        this.f116830L = R11;
        C16532g<Nn.C> g04 = C16534i.g0(a14, new F((C17164e) null, this));
        this.f116832N = g04;
        C16532g<C13698c> n10 = C16534i.n(R11, a13, new u((C17164e<? super u>) null));
        this.f116833O = n10;
        C16532g<C13697b> n11 = C16534i.n(a11, a12, new r((C17164e<? super r>) null));
        this.f116834P = n11;
        C16532g<C13699d> m10 = C16534i.m(g04, g02, n10, new J(this, (C17164e<? super J>) null));
        this.f116835Q = m10;
        this.f116836R = C16534i.c0(C16534i.k(n11, m10, g10, a17, a10, new K(this, (C17164e<? super K>) null)), g0.a(this), ip.f.a(), new C13693f(true, false, (List) null, (C13693f.c) null, (C13693f.d) null, (C13693f.a) null, (C13688a) null, 126, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ void D0(C13695h hVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = C11849b.f102309j1;
        }
        hVar.C0(i10);
    }

    private final void E0(String str) {
        Object f10 = this.f116839m.f("EXPRESS_FLOW_INVOKED_KEY");
        Boolean bool = Boolean.TRUE;
        if (C17542s.e(f10, bool)) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Express flow already invoked once, do not invoke it again", (Throwable) null);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str3 == null) {
                    String name = C13695h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str3;
                bVar.a(eVar, str4, false, (Throwable) null, str2);
                str3 = str4;
            }
            return;
        }
        this.f116842p.b(C16877v.e("google_pay_express"));
        H h10 = new H(N.f137593c0, this);
        this.f116852z.setValue(bool);
        F0 unused = C16314k.d(g0.a(this), h10, (T) null, new I(this, (C17164e) null, this, str), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final C13693f.a U(Nn.t tVar) {
        return new C13693f.a((C13023e) null, (C13023e) null, C13669a.c(tVar), 3, (DefaultConstructorMarker) null);
    }

    private final void V(String str) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Create online transfer session", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = C13695h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C13703i iVar = new C13703i(N.f137593c0, this);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), iVar, (T) null, new C13704j(this, (C17164e) null, this, str), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final List<Nn.D> Y(List<? extends Nn.D> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Nn.D d10 = (Nn.D) next;
            if (!C17542s.e(d10.c(), "SWISH") || (C17542s.e(d10.c(), "SWISH") && this.f116838T)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final C13472e0.c Z(List<? extends Nn.D> list, List<MComConfig.g> list2) {
        Object obj;
        if (list2 == null) {
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MComConfig.g gVar = (MComConfig.g) obj;
            Iterable<Nn.D> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Nn.D c10 : iterable) {
                arrayList.add(c10.c());
            }
            if (arrayList.contains(gVar.b())) {
                break;
            }
        }
        MComConfig.g gVar2 = (MComConfig.g) obj;
        if (gVar2 != null) {
            return new C13472e0.c(gVar2.c(), gVar2.a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Nn.F f0(Throwable th2, C10809l lVar) {
        if (th2 instanceof C10805h.d) {
            C10805h.d dVar = (C10805h.d) th2;
            if (dVar.b() != null) {
                Nn.F b10 = dVar.b();
                C17542s.g(b10);
                return b10;
            }
        }
        if (lVar instanceof C10809l.b) {
            C10809l.b bVar = (C10809l.b) lVar;
            return new F.e(bVar.a(), bVar.b(), false, (String) null, (String) null, (String) null, bVar.c());
        } else if (lVar instanceof C10809l.a) {
            return new F.b((String) null, (String) null, false, (String) null, (String) null, (String) null, 0.0d, (String) null);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final Rg.a g0() {
        return this.f116849w ? a.C1085a.b.f63200a : a.b.f63202a;
    }

    /* access modifiers changed from: private */
    public final C13693f.c.a h0(boolean z10, double d10) {
        return new C13693f.c.a(z10 ? new C13023e.d(Oo.b.f84443M5, (List) null, 2, (DefaultConstructorMarker) null) : new C13023e.d(Oo.b.f84433L5, (List) null, 2, (DefaultConstructorMarker) null), new C13023e.b(C14956a.f130484a.b(d10, this.f116840n.s())));
    }

    /* access modifiers changed from: private */
    public final void n0(Nn.F f10) {
        this.f116850x.setValue(C13688a.d.f116762a);
        this.f116842p.c(f10, g0());
    }

    /* access modifiers changed from: private */
    public final void o0(Throwable th2) {
        String str;
        char c10;
        Class<C13695h> cls;
        int i10;
        e eVar = e.DEBUG;
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
            cls = C13695h.class;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("handlePaymentErrorResponse", (Throwable) null);
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
        C10805h a11 = C13706i.c(th2);
        if (a11 instanceof C10805h.d) {
            C10805h.d dVar = (C10805h.d) a11;
            this.f116843q.b(dVar);
            switch (C13701f.f116908a[dVar.a().ordinal()]) {
                case 1:
                    B0(false);
                    A0();
                    C16807N n10 = C16807N.f139792a;
                    return;
                case 2:
                    e eVar2 = e.DEBUG;
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
                            String a12 = C11818a.a("Show payment options again as is", (Throwable) null);
                            if (a12 == null) {
                                B0(false);
                                C16807N n11 = C16807N.f139792a;
                                return;
                            }
                            str6 = C11820c.a(a12);
                        }
                        if (str7 == null) {
                            String name2 = cls.getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                        i10 = 2;
                    }
                    B0(false);
                    C16807N n112 = C16807N.f139792a;
                    return;
                case 3:
                    B0(false);
                    D0(this, 0, 1, (Object) null);
                    C16807N n12 = C16807N.f139792a;
                    return;
                case 4:
                    e eVar3 = e.WARN;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    for (Object next3 : qv.d.f102012a.a()) {
                        if (((C11819b) next3).b(eVar3, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str8 = null;
                    String str9 = null;
                    for (C11819b bVar3 : arrayList3) {
                        if (str8 == null) {
                            String a13 = C11818a.a("Timeout during payment. Show an error", (Throwable) null);
                            if (a13 == null) {
                                C0(C11849b.f102313k1);
                                C16807N n13 = C16807N.f139792a;
                                return;
                            }
                            str8 = C11820c.a(a13);
                        }
                        if (str9 == null) {
                            String name3 = cls.getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                        }
                        bVar3.a(eVar3, str9, false, (Throwable) null, str8);
                    }
                    C0(C11849b.f102313k1);
                    C16807N n132 = C16807N.f139792a;
                    return;
                case 5:
                    e eVar4 = e.DEBUG;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    for (Object next4 : qv.d.f102012a.a()) {
                        if (((C11819b) next4).b(eVar4, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str10 = null;
                    String str11 = null;
                    for (C11819b bVar4 : arrayList4) {
                        if (str10 == null) {
                            String a14 = C11818a.a("Payment status declined", (Throwable) null);
                            if (a14 == null) {
                                D0(this, 0, 1, (Object) null);
                                C16807N n14 = C16807N.f139792a;
                                return;
                            }
                            str10 = C11820c.a(a14);
                        }
                        if (str11 == null) {
                            String name4 = cls.getName();
                            C17542s.g(name4);
                            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o15.length() != 0) {
                                name4 = C15854t.P0(o15, "Kt");
                            }
                            str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name4;
                        }
                        bVar4.a(eVar4, str11, false, (Throwable) null, str10);
                    }
                    D0(this, 0, 1, (Object) null);
                    C16807N n142 = C16807N.f139792a;
                    return;
                case 6:
                    e eVar5 = e.DEBUG;
                    ArrayList<C11819b> arrayList5 = new ArrayList<>();
                    for (Object next5 : qv.d.f102012a.a()) {
                        if (((C11819b) next5).b(eVar5, false)) {
                            arrayList5.add(next5);
                        }
                    }
                    String str12 = null;
                    String str13 = null;
                    for (C11819b bVar5 : arrayList5) {
                        if (str12 == null) {
                            String a15 = C11818a.a("Payment status is pending shopper, abort for now.", (Throwable) null);
                            if (a15 == null) {
                                A0();
                                C16807N n15 = C16807N.f139792a;
                                return;
                            }
                            str12 = C11820c.a(a15);
                        }
                        if (str13 == null) {
                            String name5 = cls.getName();
                            C17542s.g(name5);
                            String o16 = C15854t.o1(C15854t.s1(name5, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o16.length() != 0) {
                                name5 = C15854t.P0(o16, "Kt");
                            }
                            str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name5;
                        }
                        bVar5.a(eVar5, str13, false, (Throwable) null, str12);
                        c10 = '$';
                    }
                    A0();
                    C16807N n152 = C16807N.f139792a;
                    return;
                default:
                    throw new XH.t();
            }
        } else if (C17542s.e(a11, C10805h.a.f84069a) || (a11 instanceof C10805h.b) || C17542s.e(a11, C10805h.c.f84071a) || C17542s.e(a11, C10805h.e.f84074a)) {
            A0();
        } else {
            throw new XH.t();
        }
    }

    private final C13693f.b r0(List<? extends Nn.D> list, String str, List<Nn.A> list2, List<MComConfig.g> list3) {
        Iterable<Nn.D> iterable = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            C13472e0.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            C10798a a10 = ((Nn.D) it.next()).a();
            if (a10 != null) {
                aVar = new C13472e0.a(a10.b(), new C13473f(a10.c(), a10.a()));
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        C15987c h10 = C15985a.h(iterable);
        C15987c h11 = C15985a.h(list2);
        ArrayList arrayList2 = new ArrayList();
        for (Nn.D b10 : iterable) {
            C16877v.E(arrayList2, C13706i.b(b10));
        }
        C13472e0 e0Var = new C13472e0(str, arrayList2, Z(list, list3), !list2.isEmpty() ? new C13023e.d(C11849b.f102193H2, (List) null, 2, (DefaultConstructorMarker) null) : null, C15985a.h(arrayList));
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            int d10 = ((Nn.D) it2.next()).d();
            while (it2.hasNext()) {
                int d11 = ((Nn.D) it2.next()).d();
                if (d10 < d11) {
                    d10 = d11;
                }
            }
            return new C13693f.b(d10, h10, h11, e0Var);
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t0(Nn.H r27, java.util.List<? extends Nn.D> r28, java.lang.String r29, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = r30
            boolean r4 = r3 instanceof Tw.C13695h.s
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Tw.h$s r4 = (Tw.C13695h.s) r4
            int r5 = r4.f116950l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f116950l = r5
            goto L_0x0020
        L_0x001b:
            Tw.h$s r4 = new Tw.h$s
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f116948j
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f116950l
            java.lang.String r8 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            r13 = 1
            r14 = 2
            if (r7 == 0) goto L_0x005d
            if (r7 != r13) goto L_0x0055
            java.lang.Object r1 = r4.f116946h
            Nn.E r1 = (Nn.E) r1
            java.lang.Object r1 = r4.f116945g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f116944f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f116943e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r4.f116942d
            Nn.H r1 = (Nn.H) r1
            java.lang.Object r2 = r4.f116941c
            Tw.h r2 = (Tw.C13695h) r2
            XH.y.b(r5)
            r3 = r1
            goto L_0x00a1
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            XH.y.b(r5)
            Nn.E r5 = r27.e()
            int[] r7 = Tw.C13695h.C13701f.f116909b
            int r19 = r5.ordinal()
            r7 = r7[r19]
            java.lang.Class<Tw.h> r19 = Tw.C13695h.class
            if (r7 == r13) goto L_0x0316
            if (r7 == r14) goto L_0x0168
            r14 = 3
            if (r7 == r14) goto L_0x007f
            r14 = 4
            if (r7 != r14) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x007f:
            Nn.x r14 = r0.f116841o
            java.lang.String r15 = r27.f()
            r4.f116941c = r0
            r13 = r27
            r4.f116942d = r13
            r4.f116943e = r1
            r4.f116944f = r2
            r4.f116945g = r3
            r4.f116946h = r5
            r4.f116947i = r7
            r1 = 1
            r4.f116950l = r1
            java.lang.Object r1 = r14.z(r15, r4)
            if (r1 != r6) goto L_0x009f
            return r6
        L_0x009f:
            r2 = r0
            r3 = r13
        L_0x00a1:
            qv.e r1 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r13 = 0
            boolean r7 = r7.b(r1, r13)
            if (r7 == 0) goto L_0x00b4
            r5.add(r6)
            goto L_0x00b4
        L_0x00cc:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r6 = 0
        L_0x00d2:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0149
            java.lang.Object r7 = r4.next()
            r20 = r7
            qv.b r20 = (qv.C11819b) r20
            r7 = 0
            if (r5 != 0) goto L_0x00f0
            java.lang.String r5 = "submitExternalPayment successful"
            java.lang.String r5 = qv.C11818a.a(r5, r7)
            if (r5 != 0) goto L_0x00ec
            goto L_0x0149
        L_0x00ec:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00f0:
            if (r6 != 0) goto L_0x013a
            java.lang.Class r6 = r2.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r13 = 36
            r14 = 2
            r15 = 0
            java.lang.String r7 = HJ.C15854t.s1(r6, r13, r15, r14, r15)
            r13 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r13, r15, r14, r15)
            int r13 = r7.length()
            if (r13 != 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            java.lang.String r6 = HJ.C15854t.P0(r7, r12)
        L_0x0116:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r13 = 1
            boolean r7 = HJ.C15854t.b0(r7, r11, r13)
            if (r7 == 0) goto L_0x0127
            r7 = r10
            goto L_0x0128
        L_0x0127:
            r7 = r9
        L_0x0128:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r8)
            r13.append(r6)
            java.lang.String r6 = r13.toString()
        L_0x013a:
            r23 = 0
            r21 = r1
            r22 = r6
            r7 = 0
            r24 = r7
            r25 = r5
            r20.a(r21, r22, r23, r24, r25)
            goto L_0x00d2
        L_0x0149:
            TJ.B<Tw.a> r4 = r2.f116850x
        L_0x014b:
            java.lang.Object r1 = r4.getValue()
            r2 = r1
            Tw.a r2 = (Tw.C13688a) r2
            Tw.a$e r2 = new Tw.a$e
            Tw.m$b r5 = new Tw.m$b
            java.lang.String r6 = r3.a()
            r5.<init>(r6)
            r2.<init>(r5)
            boolean r1 = r4.e(r1, r2)
            if (r1 == 0) goto L_0x014b
            goto L_0x03c5
        L_0x0168:
            r13 = r27
            java.lang.String r3 = r27.c()
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0180
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0180
            goto L_0x02ef
        L_0x0180:
            java.util.Iterator r4 = r4.iterator()
        L_0x0184:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ef
            java.lang.Object r5 = r4.next()
            Nn.D r5 = (Nn.D) r5
            boolean r5 = r5 instanceof Nn.D.c
            if (r5 == 0) goto L_0x0184
            if (r3 != 0) goto L_0x0243
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "gatewayMerchantId is null for Google Pay"
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01b0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01c8
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r2, r7)
            if (r6 == 0) goto L_0x01b0
            r4.add(r5)
            goto L_0x01b0
        L_0x01c8:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = 0
        L_0x01ce:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x023d
            java.lang.Object r6 = r3.next()
            r20 = r6
            qv.b r20 = (qv.C11819b) r20
            r6 = 0
            if (r4 != 0) goto L_0x01ea
            java.lang.String r4 = qv.C11818a.a(r6, r1)
            if (r4 != 0) goto L_0x01e6
            goto L_0x023d
        L_0x01e6:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x01ea:
            if (r5 != 0) goto L_0x022f
            java.lang.String r5 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r13 = 2
            java.lang.String r14 = HJ.C15854t.s1(r5, r7, r6, r13, r6)
            r7 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r7, r6, r13, r6)
            int r6 = r14.length()
            if (r6 != 0) goto L_0x0207
            goto L_0x020b
        L_0x0207:
            java.lang.String r5 = HJ.C15854t.P0(r14, r12)
        L_0x020b:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r7 = 1
            boolean r6 = HJ.C15854t.b0(r6, r11, r7)
            if (r6 == 0) goto L_0x021c
            r6 = r10
            goto L_0x021d
        L_0x021c:
            r6 = r9
        L_0x021d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x022f:
            r23 = 0
            r21 = r2
            r22 = r5
            r24 = r1
            r25 = r4
            r20.a(r21, r22, r23, r24, r25)
            goto L_0x01ce
        L_0x023d:
            r26.A0()
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0243:
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0256:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x026e
            java.lang.Object r7 = r5.next()
            r13 = r7
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            boolean r13 = r13.b(r4, r14)
            if (r13 == 0) goto L_0x0256
            r6.add(r7)
            goto L_0x0256
        L_0x026e:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r15 = 0
        L_0x0274:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02ef
            java.lang.Object r7 = r5.next()
            r20 = r7
            qv.b r20 = (qv.C11819b) r20
            r7 = 0
            if (r6 != 0) goto L_0x0292
            java.lang.String r6 = "GatewayMerchantId found for Google Pay"
            java.lang.String r6 = qv.C11818a.a(r6, r7)
            if (r6 != 0) goto L_0x028e
            goto L_0x02ef
        L_0x028e:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x0292:
            if (r15 != 0) goto L_0x02dc
            java.lang.String r13 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r30 = r5
            r7 = 0
            r14 = 36
            r15 = 2
            java.lang.String r5 = HJ.C15854t.s1(r13, r14, r7, r15, r7)
            r14 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r14, r7, r15, r7)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x02b2
            goto L_0x02b6
        L_0x02b2:
            java.lang.String r13 = HJ.C15854t.P0(r5, r12)
        L_0x02b6:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r7 = 1
            boolean r5 = HJ.C15854t.b0(r5, r11, r7)
            if (r5 == 0) goto L_0x02c7
            r5 = r10
            goto L_0x02c8
        L_0x02c7:
            r5 = r9
        L_0x02c8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r8)
            r7.append(r13)
            java.lang.String r5 = r7.toString()
            r15 = r5
            goto L_0x02de
        L_0x02dc:
            r30 = r5
        L_0x02de:
            r23 = 0
            r21 = r4
            r22 = r15
            r5 = 0
            r24 = r5
            r25 = r6
            r20.a(r21, r22, r23, r24, r25)
            r5 = r30
            goto L_0x0274
        L_0x02ef:
            TJ.B<Tw.a> r4 = r0.f116850x
        L_0x02f1:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            Tw.a r6 = (Tw.C13688a) r6
            boolean r6 = r0.f116849w
            if (r6 == 0) goto L_0x0303
            Rw.c r6 = r0.f116844r
            Ow.a$a$a r15 = r6.a(r2)
            goto L_0x0304
        L_0x0303:
            r15 = 0
        L_0x0304:
            Tw.a$e r6 = new Tw.a$e
            Tw.m$a r7 = new Tw.m$a
            r7.<init>(r1, r3, r15)
            r6.<init>(r7)
            boolean r5 = r4.e(r5, r6)
            if (r5 == 0) goto L_0x02f1
            goto L_0x03c5
        L_0x0316:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Swish shouldn't be received here"
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0330:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0348
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r2, r7)
            if (r6 == 0) goto L_0x0330
            r4.add(r5)
            goto L_0x0330
        L_0x0348:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r15 = 0
        L_0x034e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03c2
            java.lang.Object r5 = r3.next()
            r13 = r5
            qv.b r13 = (qv.C11819b) r13
            r5 = 0
            if (r15 != 0) goto L_0x036a
            java.lang.String r6 = qv.C11818a.a(r5, r1)
            if (r6 != 0) goto L_0x0365
            goto L_0x03c2
        L_0x0365:
            java.lang.String r6 = qv.C11820c.a(r6)
            goto L_0x036b
        L_0x036a:
            r6 = r15
        L_0x036b:
            if (r4 != 0) goto L_0x03b1
            java.lang.String r4 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 36
            r15 = 2
            java.lang.String r14 = HJ.C15854t.s1(r4, r7, r5, r15, r5)
            r7 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r7, r5, r15, r5)
            int r16 = r14.length()
            if (r16 != 0) goto L_0x0388
            goto L_0x038c
        L_0x0388:
            java.lang.String r4 = HJ.C15854t.P0(r14, r12)
        L_0x038c:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r5 = 1
            boolean r14 = HJ.C15854t.b0(r14, r11, r5)
            if (r14 == 0) goto L_0x039d
            r14 = r10
            goto L_0x039e
        L_0x039d:
            r14 = r9
        L_0x039e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            r5.append(r8)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x03b4
        L_0x03b1:
            r7 = 46
            r15 = 2
        L_0x03b4:
            r16 = 0
            r14 = r2
            r5 = r15
            r15 = r4
            r17 = r1
            r18 = r6
            r13.a(r14, r15, r16, r17, r18)
            r15 = r6
            goto L_0x034e
        L_0x03c2:
            r26.A0()
        L_0x03c5:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Tw.C13695h.t0(Nn.H, java.util.List, java.lang.String, dI.e):java.lang.Object");
    }

    private final void u0(List<? extends Nn.D> list) {
        String str;
        List<? extends Nn.D> list2 = list;
        Nn.D d10 = (Nn.D) C16877v.w0(list);
        if ((d10 instanceof D.h) || (d10 instanceof D.g) || (d10 instanceof D.c)) {
            X(list2, k0());
            return;
        }
        boolean z10 = d10 instanceof D.d;
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<C13695h> cls = C13695h.class;
        if (z10) {
            if (list.size() > 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid payment group: " + list2);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
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
                    bVar.a(eVar, str4, false, illegalArgumentException, str3);
                    str2 = str;
                }
            }
            V(((D.d) d10).c());
            return;
        }
        String str5 = str2;
        if (d10 instanceof D.b) {
            return;
        }
        if (d10 instanceof D.e) {
            if (list.size() > 1) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid payment group: " + list2);
                e eVar2 = e.ERROR;
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
                        String a11 = C11818a.a((String) null, illegalArgumentException2);
                        if (a11 == null) {
                            break;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, illegalArgumentException2, str6);
                }
            }
            D.e eVar3 = (D.e) d10;
            B(new C10809l.b(eVar3.c(), eVar3.b(), c0()));
            return;
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public static final String z0(i iVar) {
        return iVar.invoke();
    }

    public final void A0() {
        C13688a value;
        C16505B<C13688a> b10 = this.f116850x;
        do {
            value = b10.getValue();
            C13688a aVar = value;
        } while (!b10.e(value, new C13688a.b((C13023e) null, (List) null, 3, (DefaultConstructorMarker) null)));
    }

    public void B(C10809l lVar) {
        C17542s.j(lVar, "completePayment");
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("Complete the payment", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C13695h.class.getName();
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
        C13702g gVar = new C13702g(N.f137593c0, this, lVar);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), gVar, (T) null, new C2872h(this, (C17164e) null, this, lVar), 2, (Object) null);
    }

    public final void B0(boolean z10) {
        this.f116852z.setValue(Boolean.valueOf(z10));
    }

    public final void C0(int i10) {
        C13700e value;
        C16505B<C13700e> b10 = this.f116829K;
        do {
            value = b10.getValue();
            C13700e eVar = value;
        } while (!b10.e(value, new C13700e(C13026h.a(C11849b.f102305i1), C13026h.a(i10))));
    }

    public final void F0(C13711n nVar) {
        C17542s.j(nVar, "state");
        this.f116846t = nVar;
    }

    public final void T() {
        this.f116841o.k();
    }

    public final List<C13693f.b> W(List<? extends Nn.D> list, List<MComConfig.g> list2) {
        Collection collection;
        Collection collection2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof D.g) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                D.g gVar = (D.g) next2;
                D.f k10 = gVar.k();
                if (k10 == null) {
                    k10 = new D.f(UUID.randomUUID().hashCode(), gVar.b());
                }
                Object obj = linkedHashMap.get(k10);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(k10, obj);
                }
                ((List) obj).add(next2);
            }
            collection = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                List<D.g> g12 = C16877v.g1((Iterable) entry.getValue(), new l());
                ArrayList arrayList2 = new ArrayList();
                for (D.g i10 : g12) {
                    C16877v.E(arrayList2, i10.i());
                }
                collection.add(r0(g12, ((D.f) entry.getKey()).b(), arrayList2, list2));
            }
        } else {
            collection = C16877v.n();
        }
        if (list != null) {
            ArrayList<Nn.D> arrayList3 = new ArrayList<>();
            for (Object next3 : list) {
                if (!(((Nn.D) next3) instanceof D.g)) {
                    arrayList3.add(next3);
                }
            }
            collection2 = new ArrayList(C16877v.y(arrayList3, 10));
            for (Nn.D d10 : arrayList3) {
                collection2.add(r0(C16877v.e(d10), d10.b(), C16877v.n(), list2));
            }
        } else {
            collection2 = C16877v.n();
        }
        List c10 = C16877v.c();
        c10.addAll(collection);
        c10.addAll(collection2);
        return C16877v.g1(C16877v.a(c10), new C13705k());
    }

    public final void X(List<? extends Nn.D> list, String str) {
        C17542s.j(list, "paymentOptions");
        C17542s.j(str, "shopperResultUrl");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Create PSP session", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = C13695h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        m mVar = new m(N.f137593c0, this);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), mVar, (T) null, new n(this, (C17164e) null, this, str, list), 2, (Object) null);
    }

    public final String a0(Nn.D d10) {
        C17542s.j(d10, "paymentOptionHolder");
        if ((d10 instanceof D.h) || (d10 instanceof D.c) || (d10 instanceof D.g)) {
            return d10.c();
        }
        if ((d10 instanceof D.b) || (d10 instanceof D.e) || (d10 instanceof D.d)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected option: " + d10);
            e eVar = e.ERROR;
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
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C13695h.class.getName();
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
            return d10.c();
        }
        throw new XH.t();
    }

    public final Set<String> b0(List<? extends Nn.D> list) {
        C17542s.j(list, "supportedPaymentOptions");
        Iterable<Nn.D> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Nn.D a02 : iterable) {
            arrayList.add(a0(a02));
        }
        return C16877v.y1(arrayList);
    }

    public final double c0() {
        return this.f116837S;
    }

    public final MComConfig.b d0() {
        return this.f116831M;
    }

    public final String e0() {
        String value = this.f116820B.getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Nn.H i0() {
        return this.f116822D;
    }

    public final androidx.lifecycle.F<CheckoutActivityResult> j0() {
        return this.f116848v;
    }

    public final String k0() {
        return (String) this.f116823E.getValue();
    }

    public final C13711n l0() {
        return this.f116846t;
    }

    public C16519P<C13693f> m() {
        return this.f116836R;
    }

    public final void m0(CheckoutActivityResult checkoutActivityResult) {
        Iterator it;
        Iterator it2;
        Iterator it3;
        CheckoutActivityResult checkoutActivityResult2 = checkoutActivityResult;
        C17542s.j(checkoutActivityResult2, "result");
        Class<C13695h> cls = C13695h.class;
        if (checkoutActivityResult.isCanceled()) {
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it4 = arrayList.iterator();
            String str = null;
            String str2 = null;
            while (it4.hasNext()) {
                C11819b bVar = (C11819b) it4.next();
                if (str == null) {
                    String a10 = C11818a.a("Payment result, cancelled", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    it3 = it4;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    it3 = it4;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
                it4 = it3;
            }
            B0(false);
        } else if (checkoutActivityResult.isErrored()) {
            e eVar2 = e.DEBUG;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it5 = arrayList2.iterator();
            String str3 = null;
            String str4 = null;
            while (it5.hasNext()) {
                C11819b bVar2 = (C11819b) it5.next();
                if (str3 == null) {
                    String a11 = C11818a.a("Payment result, error", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    it2 = it5;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    it2 = it5;
                }
                bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                it5 = it2;
            }
            B0(false);
        } else {
            e eVar3 = e.DEBUG;
            ArrayList arrayList3 = new ArrayList();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            Iterator it6 = arrayList3.iterator();
            String str5 = null;
            String str6 = null;
            while (it6.hasNext()) {
                C11819b bVar3 = (C11819b) it6.next();
                if (str5 == null) {
                    String a12 = C11818a.a("Payment result, success", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str5 = C11820c.a(a12);
                }
                if (str6 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    it = it6;
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    it = it6;
                }
                bVar3.a(eVar3, str6, false, (Throwable) null, str5);
                it6 = it;
            }
        }
        this.f116847u.e(checkoutActivityResult2);
    }

    public void o() {
        C13700e value;
        C16505B<C13700e> b10 = this.f116829K;
        do {
            value = b10.getValue();
            C13700e eVar = value;
        } while (!b10.e(value, null));
    }

    public void p(boolean z10) {
        Boolean value;
        C16505B<Boolean> b10 = this.f116819A;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.valueOf(z10)));
    }

    public final void p0(String str, boolean z10) {
        String value;
        C17542s.j(str, "checkoutId");
        C16505B<String> b10 = this.f116820B;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
        this.f116838T = z10;
        if (this.f116849w) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Start Express Google Pay flow", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = C13695h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            E0(str);
        }
    }

    public void q(List<? extends Nn.D> list) {
        C13688a value;
        C17542s.j(list, "paymentOptions");
        if (((Nn.D) C16877v.w0(list)) instanceof D.b) {
            C16505B<C13688a> b10 = this.f116850x;
            do {
                value = b10.getValue();
                C13688a aVar = value;
            } while (!b10.e(value, C13688a.C2867a.f116758a));
        } else {
            u0(list);
        }
        C13211a aVar2 = this.f116842p;
        Iterable<Nn.D> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Nn.D c10 : iterable) {
            arrayList.add(c10.c());
        }
        aVar2.b(arrayList);
    }

    public final boolean q0() {
        return this.f116849w;
    }

    public void s() {
        this.f116846t = C13711n.NEW;
        y yVar = new y(N.f137593c0, this);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), yVar, (T) null, new z(this, (C17164e) null, this), 2, (Object) null);
    }

    public final void s0(PaymentError paymentError) {
        Class<C13695h> cls;
        String str;
        C13213c.b bVar;
        String str2;
        Integer num;
        String str3;
        Nn.t value;
        Boolean value2;
        C13213c.b bVar2;
        String errorMessage;
        String str4;
        Iterator it;
        ErrorCode errorCode = paymentError != null ? paymentError.getErrorCode() : null;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        String str5 = null;
        String str6 = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            cls = C13695h.class;
            str = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar3 = (C11819b) it2.next();
            if (str5 == null) {
                String errorMessage2 = paymentError != null ? paymentError.getErrorMessage() : null;
                boolean q02 = q0();
                StringBuilder sb2 = new StringBuilder();
                it = it2;
                sb2.append("Payment error code: ");
                sb2.append(errorCode);
                sb2.append(", message: ");
                sb2.append(errorMessage2);
                sb2.append(", isExpressGooglePay: ");
                sb2.append(q02);
                String a10 = C11818a.a(sb2.toString(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            } else {
                it = it2;
            }
            String str7 = str5;
            if (str6 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str6 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str6;
            bVar3.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
            it2 = it;
        }
        switch (errorCode == null ? -1 : C13701f.f116910c[errorCode.ordinal()]) {
            case 1:
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str9 = null;
                String str10 = null;
                for (C11819b bVar4 : arrayList2) {
                    if (str10 == null) {
                        String a11 = C11818a.a("3ds failed: " + paymentError.getErrorMessage(), (Throwable) null);
                        if (a11 == null) {
                            bVar = C13213c.b.THREEDS_ERROR;
                            str2 = paymentError.getErrorMessage();
                            num = null;
                            break;
                        } else {
                            str10 = C11820c.a(a11);
                        }
                    }
                    if (str9 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar4.a(eVar2, str9, false, (Throwable) null, str10);
                }
                bVar = C13213c.b.THREEDS_ERROR;
                str2 = paymentError.getErrorMessage();
                num = null;
            case 2:
                bVar2 = C13213c.b.KLARNA_ERROR;
                errorMessage = paymentError.getErrorMessage();
                break;
            case 3:
                bVar2 = C13213c.b.GOOGLE_PAY_ERROR;
                errorMessage = paymentError.getErrorMessage();
                break;
            case 4:
                bVar2 = C13213c.b.TRANSACTION_ABORTED;
                errorMessage = paymentError.getErrorMessage();
                break;
            case 5:
                bVar2 = C13213c.b.PAYMENT_PROVIDER_CONNECTION_MALFORMED_RESPONSE;
                errorMessage = paymentError.getErrorMessage();
                break;
            case 6:
                C13213c.b bVar5 = C13213c.b.ERROR_CODE_BANCONTACT_LINK;
                str2 = paymentError.getErrorMessage();
                num = Integer.valueOf(C11849b.f102301h1);
                bVar = bVar5;
                break;
            default:
                if (paymentError != null) {
                    errorMessage = "Payment error, code: " + errorCode + ", info: " + paymentError.getErrorInfo() + ", message: " + paymentError.getErrorMessage();
                    e eVar3 = e.WARN;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    for (Object next3 : qv.d.f102012a.a()) {
                        if (((C11819b) next3).b(eVar3, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str11 = null;
                    String str12 = null;
                    for (C11819b bVar6 : arrayList3) {
                        if (str11 == null) {
                            String a12 = C11818a.a(errorMessage, (Throwable) null);
                            if (a12 == null) {
                                bVar2 = C13213c.b.OTHER;
                                break;
                            } else {
                                str11 = C11820c.a(a12);
                            }
                        }
                        String str13 = str11;
                        if (str12 == null) {
                            String name3 = paymentError.getClass().getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                        } else {
                            str4 = str12;
                        }
                        bVar6.a(eVar3, str4, false, (Throwable) null, str13);
                        str11 = str13;
                        str12 = str4;
                    }
                    bVar2 = C13213c.b.OTHER;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Payment error, no error returned");
                    e eVar4 = e.ERROR;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    for (Object next4 : qv.d.f102012a.a()) {
                        if (((C11819b) next4).b(eVar4, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str14 = null;
                    String str15 = null;
                    for (C11819b bVar7 : arrayList4) {
                        if (str15 == null) {
                            String a13 = C11818a.a((String) null, illegalStateException);
                            if (a13 == null) {
                                bVar2 = C13213c.b.UNKNOWN;
                                errorMessage = "No error returned";
                                break;
                            } else {
                                str15 = C11820c.a(a13);
                            }
                        }
                        if (str14 == null) {
                            String name4 = cls.getName();
                            C17542s.g(name4);
                            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o15.length() != 0) {
                                name4 = C15854t.P0(o15, "Kt");
                            }
                            str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name4;
                        }
                        bVar7.a(eVar4, str14, false, illegalStateException, str15);
                    }
                    bVar2 = C13213c.b.UNKNOWN;
                    errorMessage = "No error returned";
                }
        }
        bVar = bVar2;
        str2 = errorMessage;
        num = null;
        if (!this.f116849w) {
            C16505B<Boolean> b10 = this.f116852z;
            do {
                value2 = b10.getValue();
                value2.booleanValue();
            } while (!b10.e(value2, Boolean.FALSE));
            C0(num != null ? num.intValue() : C11849b.f102309j1);
        } else {
            C16505B<Nn.t> b11 = this.f116825G;
            do {
                value = b11.getValue();
                Nn.t tVar = value;
            } while (!b11.e(value, t.a.f84151a));
        }
        C13213c cVar = this.f116843q;
        C13213c.C2746c cVar2 = C13213c.C2746c.ERROR;
        Nn.H h10 = this.f116822D;
        if (h10 == null || (str3 = h10.f()) == null) {
            str3 = "";
        }
        cVar.a(cVar2, str3, bVar, str2);
    }

    public void t() {
        C13688a value;
        C16505B<C13688a> b10 = this.f116850x;
        do {
            value = b10.getValue();
            C13688a aVar = value;
        } while (!b10.e(value, C13688a.c.f116761a));
    }

    public void v(String str) {
        C17542s.j(str, "giftCardId");
        o oVar = new o(N.f137593c0, this);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), oVar, (T) null, new p(this, (C17164e) null, this, str), 2, (Object) null);
    }

    public final void v0() {
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("Process payment", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C13695h.class.getName();
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
        v vVar = new v(N.f137593c0, this);
        this.f116852z.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), vVar, (T) null, new w(this, (C17164e) null, this), 2, (Object) null);
    }

    public final void w0(C10807j jVar) {
        Boolean value;
        C17542s.j(jVar, "state");
        C16505B<Boolean> b10 = this.f116851y;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
        F0 unused = C16314k.d(g0.a(this), new A(N.f137593c0, this), (T) null, new B(this, jVar, (C17164e<? super B>) null), 2, (Object) null);
    }

    public final void x0(String str, Bundle bundle) {
        C17542s.j(str, "checkoutId");
        C17542s.j(bundle, "bundle");
        C10807j x10 = this.f116841o.x(str);
        bundle.putString("CHECKOUT_ID_KEY", x10.a());
        bundle.putParcelable("PAYMENT_HOLDER_KEY", x10.c());
        bundle.putParcelable("PSP_SESSION_KEY", x10.d());
        List<C10804g> b10 = x10.b();
        bundle.putParcelableArrayList("CHECKOUT_ITEMS_KEY", b10 != null ? new ArrayList(b10) : null);
    }

    public final void y0(Nn.H h10) {
        this.f116822D = h10;
    }
}
