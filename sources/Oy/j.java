package Oy;

import Bx.a;
import By.C12674m;
import Dy.F;
import EB.C12832d;
import FB.C12860a;
import FB.C12861b;
import HJ.C15854t;
import Hl.a;
import IC.C13026h;
import Iz.Y;
import Jy.j;
import Jy.o;
import Kz.a;
import My.a;
import My.b;
import My.f;
import Ny.i;
import Ny.k;
import Ny.m;
import Nz.c;
import Op.Z0;
import Py.a;
import QJ.C16310i;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sy.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet;
import com.ingka.ikea.scanandgo.cart.impl.dialog.a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hp.C11377c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.C17631a;
import nI.t;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15009b;
import rz.C15014g;
import rz.D;
import rz.J;
import rz.K;
import rz.W;
import rz.X;
import sp.C11879a;

@Metadata(d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010#\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001fH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u00104J\u0017\u00107\u001a\u00020\u001f2\u0006\u0010#\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J)\u0010?\u001a\u00020\u001f2\u0006\u0010:\u001a\u0002092\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u001f2\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001fH\u0002¢\u0006\u0004\bO\u00104J\u000f\u0010P\u001a\u00020\u001fH\u0002¢\u0006\u0004\bP\u00104J\u0017\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001fH\u0002¢\u0006\u0004\bU\u00104J\u000f\u0010V\u001a\u00020\u001fH\u0002¢\u0006\u0004\bV\u00104J\u0017\u0010Y\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u001d\u0010^\u001a\u00020\u001f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u001fH\u0002¢\u0006\u0004\b`\u00104J\u000f\u0010a\u001a\u00020\u001fH\u0002¢\u0006\u0004\ba\u00104J\u000f\u0010b\u001a\u00020\u001fH\u0002¢\u0006\u0004\bb\u00104J\u0017\u0010d\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020cH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020lH\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020\u001f2\u0006\u0010o\u001a\u0002092\u0006\u0010p\u001a\u00020AH\u0002¢\u0006\u0004\bq\u0010DJ\u0019\u0010t\u001a\u00020\u001f2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020AH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\u001f2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u001f2\u0006\u0010s\u001a\u00020}H\u0002¢\u0006\u0004\b~\u0010J\u001b\u0010\u0001\u001a\u00020\u001f2\u0007\u0010s\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020\u001f2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020AH\u0002¢\u0006\u0005\b\u0001\u0010xJ\u0011\u0010\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0001\u00104J\u0011\u0010\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0001\u00104J\u0011\u0010\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0001\u00104J\u0011\u0010\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0001\u00104J\u0011\u0010\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0001\u00104J\u001d\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\u001f2\u0006\u0010:\u001a\u0002092\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00020AH@¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010 \u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020AH\u0002¢\u0006\u0005\b \u0001\u0010xJ\u001a\u0010¡\u0001\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010\u0001\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0001\u001a\u0006\b²\u0001\u0010\u0001R1\u0010»\u0001\u001a\u00030³\u00018\u0000@\u0000X\u000e¢\u0006\u001f\n\u0006\b´\u0001\u0010µ\u0001\u0012\u0005\bº\u0001\u00104\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R1\u0010Â\u0001\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u000e¢\u0006\u001e\n\u0006\b¼\u0001\u0010½\u0001\u0012\u0005\bÁ\u0001\u00104\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0005\bÀ\u0001\u0010TR\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Å\u0001R!\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010É\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ï\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010É\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ì\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020A0É\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ì\u0001R%\u0010Ó\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010[0É\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ì\u0001R\u001f\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001f\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010×\u0001R\u001f\u0010Þ\u0001\u001a\n\u0012\u0005\u0012\u00030Ü\u00010Ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010×\u0001R\u001f\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010Ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bà\u0001\u0010×\u0001R\u0018\u0010å\u0001\u001a\u00030â\u00018\u0002X\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R&\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ô\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010×\u0001\u001a\u0006\bç\u0001\u0010è\u0001R\u0019\u0010ì\u0001\u001a\u0004\u0018\u0001098BX\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001¨\u0006í\u0001"}, d2 = {"LOy/j;", "Landroidx/lifecycle/f0;", "Lsp/a;", "LMy/a;", "LMy/j;", "Landroidx/lifecycle/U;", "savedStateHandle", "LRy/b;", "capabilities", "LHl/a;", "wifiConnector", "LSy/a;", "scanAndGoAnalytics", "LCy/b;", "scanAndGoCartAnalytics", "LNy/l;", "useCases", "LNy/e;", "cartFooterButtonOrchestrator", "LNy/d;", "cartContentOrchestrator", "LNy/i;", "errorsOrchestrator", "LNy/m;", "settingsOrchestrator", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Landroidx/lifecycle/U;LRy/b;LHl/a;LSy/a;LCy/b;LNy/l;LNy/e;LNy/d;LNy/i;LNy/m;LFB/a;)V", "", "throwable", "LXH/N;", "Q0", "(Ljava/lang/Throwable;)V", "LMy/a$c;", "event", "T0", "(LMy/a$c;)V", "LMy/a$c$f;", "action", "j0", "(LMy/a$c$f;)V", "LDy/F$a;", "v0", "(LDy/F$a;)V", "LDy/F$b;", "w0", "(LDy/F$b;)LXH/N;", "LMy/a$c$c$a;", "p0", "(LMy/a$c$c$a;)V", "q0", "()V", "o0", "LDy/F$d;", "E0", "(LDy/F$d;)V", "", "barcode", "A0", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "onSuccess", "X", "(Ljava/lang/String;LnI/a;)V", "", "isUnavailable", "H0", "(Ljava/lang/String;Z)V", "LDy/F$e;", "U0", "(LDy/F$e;)V", "LDy/F$c;", "g0", "(LDy/F$c;)V", "LJy/j$a;", "sortBy", "O0", "(LJy/j$a;)V", "u0", "i0", "LMy/b;", "checkoutButton", "l0", "(LMy/b;)V", "y0", "r0", "", "index", "L0", "(I)V", "", "Lrz/D;", "skippedCoupons", "M0", "(Ljava/util/List;)V", "N0", "D0", "F0", "LMy/a$b;", "S0", "(LMy/a$b;)V", "LMy/a$c$j;", "K0", "(LMy/a$c$j;)V", "LMy/a$c$i;", "C0", "(LMy/a$c$i;)V", "LMy/a$a;", "x0", "(LMy/a$a;)V", "timeSlotId", "isEarlyPayment", "R0", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/a;", "result", "k0", "(Lcom/ingka/ikea/scanandgo/cart/impl/dialog/a;)V", "acknowledgement", "m0", "(Z)V", "LBx/a$b;", "loginResult", "z0", "(LBx/a$b;)V", "LIz/Y$a;", "s0", "(LIz/Y$a;)V", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "t0", "(Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;)V", "LPy/a$a;", "checkoutResult", "shownAsCombinedCart", "n0", "(LPy/a$a;Z)V", "P0", "W0", "W", "V", "c0", "G0", "LHl/a$a;", "connection", "LMy/f;", "U", "(LHl/a$a;)LMy/f;", "e0", "()Z", "LSy/a$c;", "productAssortmentType", "J0", "(Ljava/lang/String;LSy/a$c;)V", "d0", "X0", "(LdI/e;)Ljava/lang/Object;", "Lrz/g;", "Z", "(Ljava/lang/String;)Lrz/g;", "fullCartCheckoutViaTsm", "f0", "h0", "(LMy/a;)V", "m", "LRy/b;", "n", "LHl/a;", "o", "LSy/a;", "p", "LCy/b;", "q", "LNy/l;", "r", "LNy/d;", "s", "LFB/a;", "t", "b0", "", "u", "J", "getSkippedProductsLastShown$cart_implementation_release", "()J", "setSkippedProductsLastShown$cart_implementation_release", "(J)V", "getSkippedProductsLastShown$cart_implementation_release$annotations", "skippedProductsLastShown", "v", "LMy/b;", "getCheckoutButtonClicked$cart_implementation_release", "()LMy/b;", "setCheckoutButtonClicked$cart_implementation_release", "getCheckoutButtonClicked$cart_implementation_release$annotations", "checkoutButtonClicked", "LQJ/F0;", "w", "LQJ/F0;", "syncJob", "x", "checkoutJob", "LTJ/B;", "Lrz/K;", "y", "LTJ/B;", "currentProfileState", "z", "navigateTo", "A", "loading", "B", "itemsUpdateQuantity", "LTJ/P;", "LMy/i;", "C", "LTJ/P;", "settingsState", "LMy/c;", "D", "cartContent", "LNy/i$a;", "E", "cartErrors", "LMy/d;", "F", "cartFooterButtonState", "LQJ/N;", "G", "LQJ/N;", "cartExceptionHandler", "H", "getState", "()LTJ/P;", "state", "a0", "()Ljava/lang/String;", "selectedStoreId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends f0 implements C11879a<My.a, My.j> {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final C16505B<Boolean> f113671A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final C16505B<List<C15014g>> f113672B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final C16519P<My.i> f113673C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C16519P<My.c> f113674D;

    /* renamed from: E  reason: collision with root package name */
    private final C16519P<i.a> f113675E;

    /* renamed from: F  reason: collision with root package name */
    private final C16519P<My.d> f113676F;

    /* renamed from: G  reason: collision with root package name */
    private final N f113677G;

    /* renamed from: H  reason: collision with root package name */
    private final C16519P<My.j> f113678H;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ry.b f113679m;

    /* renamed from: n  reason: collision with root package name */
    private final Hl.a f113680n;

    /* renamed from: o  reason: collision with root package name */
    private final Sy.a f113681o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Cy.b f113682p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Ny.l f113683q;

    /* renamed from: r  reason: collision with root package name */
    private final Ny.d f113684r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C12860a f113685s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f113686t;

    /* renamed from: u  reason: collision with root package name */
    private long f113687u;

    /* renamed from: v  reason: collision with root package name */
    private My.b f113688v;

    /* renamed from: w  reason: collision with root package name */
    private F0 f113689w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public F0 f113690x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public C16505B<K> f113691y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C16505B<My.f> f113692z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {174}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f113694d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f113694d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113693c;
            if (i10 == 0) {
                y.b(obj);
                Ny.q m10 = this.f113694d.f113683q.m();
                Q a10 = g0.a(this.f113694d);
                this.f113693c = 1;
                if (m10.c(a10, this) == f10) {
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
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f113695a;

        static {
            int[] iArr = new int[a.C1585a.values().length];
            try {
                iArr[a.C1585a.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f113695a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNy/i$a;", "errors", "LXH/N;", "<anonymous>", "(LNy/i$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$cartErrors$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<i.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113696c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f113698e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f113698e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f113698e, eVar);
            cVar.f113697d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(i.a aVar, C17164e<? super C16807N> eVar) {
            return ((c) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113696c == 0) {
                y.b(obj);
                i.a aVar = (i.a) this.f113697d;
                if (!aVar.b().isEmpty()) {
                    this.f113698e.M0(aVar.b());
                } else if (aVar.a()) {
                    this.f113698e.N0();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$checkout$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113699c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f113700d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f113700d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16807N n10;
            C17187b.f();
            if (this.f113699c == 0) {
                y.b(obj);
                try {
                    boolean a10 = this.f113700d.f113683q.d().a(a.C2729a.f111789a).a();
                    boolean a11 = this.f113700d.f113683q.k().a(c.b.f112749a).a();
                    boolean z10 = true;
                    if (!a10) {
                        if (!a11) {
                            if (this.f113700d.e0()) {
                                this.f113700d.f113692z.setValue(f.C13216b.f112117a);
                                n10 = C16807N.f139792a;
                                return n10;
                            }
                            this.f113700d.f113679m.j(false);
                            if (((My.i) this.f113700d.f113673C.getValue()).j()) {
                                Iterable a12 = ((My.c) this.f113700d.f113674D.getValue()).a();
                                if (!(a12 instanceof Collection) || !((Collection) a12).isEmpty()) {
                                    Iterator it = a12.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (J.b((C15014g) it.next())) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            z10 = false;
                            this.f113700d.f0(z10);
                            this.f113700d.f113690x = null;
                            this.f113700d.f113671A.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                            return C16807N.f139792a;
                        }
                    }
                    this.f113700d.f113692z.setValue(new f.c(a10, a11));
                    n10 = C16807N.f139792a;
                    return n10;
                } finally {
                    this.f113700d.f113690x = null;
                    this.f113700d.f113671A.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$checkoutOrPromptLogin$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {896, 897}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f113702d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f113702d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f113701c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                XH.y.b(r5)
                XH.x r5 = (XH.x) r5
                java.lang.Object r5 = r5.j()
                goto L_0x0051
            L_0x0018:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0020:
                XH.y.b(r5)
                goto L_0x0032
            L_0x0024:
                XH.y.b(r5)
                Oy.j r5 = r4.f113702d
                r4.f113701c = r3
                java.lang.Object r5 = r5.X0(r4)
                if (r5 != r0) goto L_0x0032
                return r0
            L_0x0032:
                Oy.j r5 = r4.f113702d
                Ny.l r5 = r5.f113683q
                Ny.r r5 = r5.n()
                Oy.j r1 = r4.f113702d
                TJ.B r1 = r1.f113691y
                java.lang.Object r1 = r1.getValue()
                rz.K r1 = (rz.K) r1
                r4.f113701c = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L_0x0051
                return r0
            L_0x0051:
                Oy.j r0 = r4.f113702d
                java.lang.Throwable r1 = XH.x.e(r5)
                if (r1 != 0) goto L_0x005f
                XH.N r5 = (XH.C16807N) r5
                r0.V()
                goto L_0x0075
            L_0x005f:
                boolean r5 = r1 instanceof Ny.r.a.C2780a
                if (r5 == 0) goto L_0x0075
                TJ.B r5 = r0.f113692z
                My.f$o r0 = new My.f$o
                Ny.r$a$a r1 = (Ny.r.a.C2780a) r1
                Bx.a$a r1 = r1.a()
                r0.<init>(r1)
                r5.setValue(r0)
            L_0x0075:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Oy.j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$collect$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {445}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113704d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f113705e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f113706f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar, String str, C17631a<C16807N> aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f113704d = jVar;
            this.f113705e = str;
            this.f113706f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f113704d, this.f113705e, this.f113706f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f113703c;
            if (i10 == 0) {
                y.b(obj);
                this.f113704d.f113671A.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Ny.g c10 = this.f113704d.f113683q.c();
                String str = this.f113705e;
                String a10 = ((My.i) this.f113704d.f113673C.getValue()).b().a();
                this.f113703c = 1;
                obj2 = c10.a(str, a10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C17631a<C16807N> aVar = this.f113706f;
            j jVar = this.f113704d;
            if (x.e(obj2) == null) {
                C16807N n10 = (C16807N) obj2;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                jVar.f113692z.setValue(new f.m(C13026h.a(Oo.b.f84843y3), C13026h.a(C12674m.f108290l0)));
            }
            this.f113704d.f113671A.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$handleStoreClosing$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {954}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113707c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(j jVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f113708d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f113708d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113707c;
            if (i10 == 0) {
                y.b(obj);
                Oz.b h10 = this.f113708d.f113683q.h();
                String J10 = this.f113708d.a0();
                this.f113707c = 1;
                if (h10.a(J10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f113708d.f113692z.setValue(f.z.f112159a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$onCoWorkerDiscountCheckboxClicked$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {385, 386}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.c.C2753c.C2754a f113711e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j jVar, a.c.C2753c.C2754a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f113710d = jVar;
            this.f113711e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f113710d, this.f113711e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f113709c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                XH.y.b(r5)
                XH.x r5 = (XH.x) r5
                java.lang.Object r5 = r5.j()
                goto L_0x0068
            L_0x0018:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0020:
                XH.y.b(r5)
                goto L_0x003f
            L_0x0024:
                XH.y.b(r5)
                Oy.j r5 = r4.f113710d
                TJ.B r5 = r5.f113671A
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                r5.setValue(r1)
                Oy.j r5 = r4.f113710d
                r4.f113709c = r3
                java.lang.Object r5 = r5.X0(r4)
                if (r5 != r0) goto L_0x003f
                return r0
            L_0x003f:
                Oy.j r5 = r4.f113710d
                Ny.l r5 = r5.f113683q
                Ny.a r5 = r5.a()
                Oy.j r1 = r4.f113710d
                TJ.B r1 = r1.f113691y
                java.lang.Object r1 = r1.getValue()
                rz.K r1 = (rz.K) r1
                java.lang.String r1 = r1.a()
                My.a$c$c$a r3 = r4.f113711e
                boolean r3 = r3.a()
                r4.f113709c = r2
                java.lang.Object r5 = r5.a(r1, r3, r4)
                if (r5 != r0) goto L_0x0068
                return r0
            L_0x0068:
                Oy.j r0 = r4.f113710d
                My.a$c$c$a r1 = r4.f113711e
                boolean r2 = XH.x.h(r5)
                if (r2 == 0) goto L_0x0086
                XH.N r5 = (XH.C16807N) r5
                TJ.B r5 = r0.f113692z
                boolean r0 = r1.a()
                if (r0 == 0) goto L_0x0081
                My.f$e$a r0 = My.f.e.a.f112122a
                goto L_0x0083
            L_0x0081:
                My.f$e$c r0 = My.f.e.c.f112124a
            L_0x0083:
                r5.setValue(r0)
            L_0x0086:
                Oy.j r5 = r4.f113710d
                TJ.B r5 = r5.f113671A
                r0 = 0
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r0)
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Oy.j.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$onCouponScannerResult$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {795, 796}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113712c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113713d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y.a f113714e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar, Y.a aVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f113713d = jVar;
            this.f113714e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f113713d, this.f113714e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113712c;
            if (i10 == 0) {
                y.b(obj);
                this.f113713d.f113671A.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                j jVar = this.f113713d;
                this.f113712c = 1;
                if (jVar.X0(this) == f10) {
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
            Ny.b b10 = this.f113713d.f113683q.b();
            String a10 = ((K) this.f113713d.f113691y.getValue()).a();
            String a11 = ((Y.a.b) this.f113714e).a();
            this.f113712c = 2;
            if (b10.a(a10, a11, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$onRemoveItem$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {468}, m = "invokeSuspend")
    /* renamed from: Oy.j$j  reason: collision with other inner class name */
    static final class C2792j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113715c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113716d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f113717e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f113718f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2792j(j jVar, String str, boolean z10, C17164e<? super C2792j> eVar) {
            super(2, eVar);
            this.f113716d = jVar;
            this.f113717e = str;
            this.f113718f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2792j(this.f113716d, this.f113717e, this.f113718f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2792j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113715c;
            if (i10 == 0) {
                y.b(obj);
                Ny.j f11 = this.f113716d.f113683q.f();
                String str = this.f113717e;
                boolean z10 = this.f113718f;
                String a10 = ((K) this.f113716d.f113691y.getValue()).a();
                this.f113715c = 1;
                if (f11.a(str, z10, a10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$onSkippedCouponsFound$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {591}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113719c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f113720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f113721e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f113722f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ W f113723g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar, String str, W w10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f113721e = jVar;
            this.f113722f = str;
            this.f113723g = w10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f113721e, this.f113722f, this.f113723g, eVar);
            kVar.f113720d = obj;
            return kVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f113719c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f113720d;
                Ny.k g10 = this.f113721e.f113683q.g();
                String str = this.f113722f;
                X a10 = this.f113723g.a();
                String a11 = ((K) this.f113721e.f113691y.getValue()).a();
                this.f113720d = q11;
                this.f113719c = 1;
                Object a12 = g10.a(str, a10, a11, this);
                if (a12 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = a12;
            } else if (i10 == 1) {
                q10 = (Q) this.f113720d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar = this.f113721e;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                jVar.f113692z.setValue(new f.h(((k.a.C2774a) obj2).a()));
            } else {
                qv.e eVar = qv.e.DEBUG;
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
                        String a13 = C11818a.a((String) null, e10);
                        if (a13 == null) {
                            break;
                        }
                        str2 = C11820c.a(a13);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, e10, str4);
                    str2 = str4;
                    str3 = str5;
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$onUpdateItemQuantity$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {490, 492}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f113724c;

        /* renamed from: d  reason: collision with root package name */
        int f113725d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f113726e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f113727f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ F.e f113728g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar, F.e eVar, C17164e<? super l> eVar2) {
            super(2, eVar2);
            this.f113727f = jVar;
            this.f113728g = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f113727f, this.f113728g, eVar);
            lVar.f113726e = obj;
            return lVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f113725d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0039
                if (r2 == r4) goto L_0x002d
                if (r2 != r3) goto L_0x0025
                java.lang.Object r1 = r0.f113724c
                rz.g r1 = (rz.C15014g) r1
                java.lang.Object r2 = r0.f113726e
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r20)
                r5 = r20
                XH.x r5 = (XH.x) r5
                java.lang.Object r5 = r5.j()
                goto L_0x00be
            L_0x0025:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002d:
                java.lang.Object r2 = r0.f113724c
                rz.g r2 = (rz.C15014g) r2
                java.lang.Object r5 = r0.f113726e
                QJ.Q r5 = (QJ.Q) r5
                XH.y.b(r20)
                goto L_0x0088
            L_0x0039:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f113726e
                QJ.Q r2 = (QJ.Q) r2
                Oy.j r5 = r0.f113727f
                Dy.F$e r6 = r0.f113728g
                java.lang.String r6 = r6.a()
                rz.g r5 = r5.Z(r6)
                Oy.j r6 = r0.f113727f
                TJ.B r6 = r6.f113671A
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                r6.setValue(r7)
                if (r5 == 0) goto L_0x0074
                Oy.j r6 = r0.f113727f
                TJ.B r6 = r6.f113672B
            L_0x0061:
                java.lang.Object r7 = r6.getValue()
                r8 = r7
                java.util.List r8 = (java.util.List) r8
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.List r8 = YH.C16877v.W0(r8, r5)
                boolean r7 = r6.e(r7, r8)
                if (r7 == 0) goto L_0x0061
            L_0x0074:
                r0.f113726e = r2
                r0.f113724c = r5
                r0.f113725d = r4
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = QJ.C16297b0.b(r6, r0)
                if (r6 != r1) goto L_0x0083
                return r1
            L_0x0083:
                r18 = r5
                r5 = r2
                r2 = r18
            L_0x0088:
                Oy.j r6 = r0.f113727f
                Ny.l r6 = r6.f113683q
                Ny.p r6 = r6.l()
                Dy.F$e r7 = r0.f113728g
                java.lang.String r7 = r7.a()
                Dy.F$e r8 = r0.f113728g
                int r8 = r8.b()
                Oy.j r9 = r0.f113727f
                TJ.B r9 = r9.f113691y
                java.lang.Object r9 = r9.getValue()
                rz.K r9 = (rz.K) r9
                java.lang.String r9 = r9.a()
                r0.f113726e = r5
                r0.f113724c = r2
                r0.f113725d = r3
                java.lang.Object r6 = r6.b(r7, r8, r9, r0)
                if (r6 != r1) goto L_0x00bb
                return r1
            L_0x00bb:
                r1 = r2
                r2 = r5
                r5 = r6
            L_0x00be:
                Oy.j r6 = r0.f113727f
                java.lang.Throwable r13 = XH.x.e(r5)
                if (r13 != 0) goto L_0x00cd
                XH.N r5 = (XH.C16807N) r5
                Oy.j.V0(r6, r1)
                goto L_0x017e
            L_0x00cd:
                qv.e r5 = qv.e.ERROR
                qv.d r7 = qv.d.f102012a
                java.util.List r7 = r7.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x00e0:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x00f8
                java.lang.Object r9 = r7.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r5, r11)
                if (r10 == 0) goto L_0x00e0
                r8.add(r9)
                goto L_0x00e0
            L_0x00f8:
                java.util.Iterator r14 = r8.iterator()
                r15 = 0
                r7 = r15
                r8 = r7
            L_0x00ff:
                boolean r9 = r14.hasNext()
                if (r9 == 0) goto L_0x017b
                java.lang.Object r9 = r14.next()
                qv.b r9 = (qv.C11819b) r9
                if (r7 != 0) goto L_0x0118
                java.lang.String r7 = qv.C11818a.a(r15, r13)
                if (r7 != 0) goto L_0x0114
                goto L_0x017b
            L_0x0114:
                java.lang.String r7 = qv.C11820c.a(r7)
            L_0x0118:
                r16 = r7
                if (r8 != 0) goto L_0x0169
                java.lang.Class r7 = r2.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r15, r3, r15)
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r15, r3, r15)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x013a
                goto L_0x0140
            L_0x013a:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)
            L_0x0140:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r4)
                if (r8 == 0) goto L_0x0153
                java.lang.String r8 = "m"
                goto L_0x0155
            L_0x0153:
                java.lang.String r8 = "b"
            L_0x0155:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r8 = "|"
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
            L_0x0169:
                r17 = r8
                r10 = 0
                r7 = r9
                r8 = r5
                r9 = r17
                r11 = r13
                r12 = r16
                r7.a(r8, r9, r10, r11, r12)
                r7 = r16
                r8 = r17
                goto L_0x00ff
            L_0x017b:
                Oy.j.V0(r6, r1)
            L_0x017e:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Oy.j.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNy/m$a$a;", "settings", "Lrz/K;", "profile", "LMy/i;", "<anonymous>", "(LNy/m$a$a;Lrz/K;)LMy/i;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$settingsState$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.q<m.a.C2775a, K, C17164e<? super My.i>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113729c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113730d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f113731e;

        m(C17164e<? super m> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(m.a.C2775a aVar, K k10, C17164e<? super My.i> eVar) {
            m mVar = new m(eVar);
            mVar.f113730d = aVar;
            mVar.f113731e = k10;
            return mVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113729c == 0) {
                y.b(obj);
                m.a.C2775a aVar = (m.a.C2775a) this.f113730d;
                return new My.i((K) this.f113731e, aVar.d(), aVar.f(), aVar.e(), aVar.i(), false, aVar.c(), aVar.b(), aVar.h(), aVar.g(), aVar.a(), 32, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oy/j$n", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f113732a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(N.a aVar, j jVar) {
            super(aVar);
            this.f113732a = jVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f113732a.Q0(th2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LMy/i;", "settings", "LMy/c;", "cartContent", "LNy/i$a;", "<unused var>", "LMy/d;", "cartFooterButton", "LMy/f;", "navigateTo", "LMy/j;", "<anonymous>", "(LMy/i;LMy/c;LNy/i$a;LMy/d;LMy/f;)LMy/j;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$state$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements t<My.i, My.c, i.a, My.d, My.f, C17164e<? super My.j>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113733c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113734d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f113735e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f113736f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f113737g;

        o(C17164e<? super o> eVar) {
            super(6, eVar);
        }

        /* renamed from: i */
        public final Object o(My.i iVar, My.c cVar, i.a aVar, My.d dVar, My.f fVar, C17164e<? super My.j> eVar) {
            o oVar = new o(eVar);
            oVar.f113734d = iVar;
            oVar.f113735e = cVar;
            oVar.f113736f = dVar;
            oVar.f113737g = fVar;
            return oVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113733c == 0) {
                y.b(obj);
                return new My.j((My.i) this.f113734d, (My.c) this.f113735e, (My.f) this.f113737g, (My.d) this.f113736f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$syncCart$1", f = "ScanAndGoCartFragmentViewModel.kt", l = {869, 871}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113738c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f113739d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f113739d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[Catch:{ all -> 0x0019 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A[SYNTHETIC, Splitter:B:24:0x0081] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f113738c
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 == r4) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                XH.y.b(r6)     // Catch:{ all -> 0x0019 }
                XH.x r6 = (XH.x) r6     // Catch:{ all -> 0x0019 }
                java.lang.Object r6 = r6.j()     // Catch:{ all -> 0x0019 }
                goto L_0x0066
            L_0x0019:
                r6 = move-exception
                goto L_0x00c4
            L_0x001c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0024:
                XH.y.b(r6)     // Catch:{ all -> 0x0019 }
                goto L_0x0043
            L_0x0028:
                XH.y.b(r6)
                Oy.j r6 = r5.f113739d
                TJ.B r6 = r6.f113671A
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r4)
                r6.setValue(r1)
                Oy.j r6 = r5.f113739d     // Catch:{ all -> 0x0019 }
                r5.f113738c = r4     // Catch:{ all -> 0x0019 }
                java.lang.Object r6 = r6.X0(r5)     // Catch:{ all -> 0x0019 }
                if (r6 != r0) goto L_0x0043
                return r0
            L_0x0043:
                Oy.j r6 = r5.f113739d     // Catch:{ all -> 0x0019 }
                Ny.l r6 = r6.f113683q     // Catch:{ all -> 0x0019 }
                Ny.n r6 = r6.i()     // Catch:{ all -> 0x0019 }
                Oy.j r1 = r5.f113739d     // Catch:{ all -> 0x0019 }
                TJ.B r1 = r1.f113691y     // Catch:{ all -> 0x0019 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0019 }
                rz.K r1 = (rz.K) r1     // Catch:{ all -> 0x0019 }
                java.lang.String r1 = r1.a()     // Catch:{ all -> 0x0019 }
                r5.f113738c = r2     // Catch:{ all -> 0x0019 }
                java.lang.Object r6 = r6.b(r1, r5)     // Catch:{ all -> 0x0019 }
                if (r6 != r0) goto L_0x0066
                return r0
            L_0x0066:
                Oy.j r0 = r5.f113739d     // Catch:{ all -> 0x0019 }
                java.lang.Throwable r6 = XH.x.e(r6)     // Catch:{ all -> 0x0019 }
                if (r6 == 0) goto L_0x0081
                r0.Q0(r6)     // Catch:{ all -> 0x0019 }
                XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0019 }
                Oy.j r0 = r5.f113739d
                TJ.B r0 = r0.f113671A
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                r0.setValue(r1)
                return r6
            L_0x0081:
                Oy.j r6 = r5.f113739d     // Catch:{ all -> 0x0019 }
                Cy.b r6 = r6.f113682p     // Catch:{ all -> 0x0019 }
                Oy.j r0 = r5.f113739d     // Catch:{ all -> 0x0019 }
                TJ.P r0 = r0.getState()     // Catch:{ all -> 0x0019 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0019 }
                My.j r0 = (My.j) r0     // Catch:{ all -> 0x0019 }
                My.c r0 = r0.a()     // Catch:{ all -> 0x0019 }
                java.util.List r0 = r0.a()     // Catch:{ all -> 0x0019 }
                Oy.j r1 = r5.f113739d     // Catch:{ all -> 0x0019 }
                FB.a r1 = r1.f113685s     // Catch:{ all -> 0x0019 }
                EB.d r1 = r1.c()     // Catch:{ all -> 0x0019 }
                if (r1 == 0) goto L_0x00ac
                java.lang.String r1 = r1.e()     // Catch:{ all -> 0x0019 }
                goto L_0x00ad
            L_0x00ac:
                r1 = 0
            L_0x00ad:
                if (r1 != 0) goto L_0x00b1
                java.lang.String r1 = ""
            L_0x00b1:
                r6.u(r0, r1)     // Catch:{ all -> 0x0019 }
                Oy.j r6 = r5.f113739d
                TJ.B r6 = r6.f113671A
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r3)
                r6.setValue(r0)
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x00c4:
                Oy.j r0 = r5.f113739d
                TJ.B r0 = r0.f113671A
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                r0.setValue(r1)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Oy.j.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel$syncCart$2", f = "ScanAndGoCartFragmentViewModel.kt", l = {890}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j jVar, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f113741d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f113741d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113740c;
            if (i10 == 0) {
                y.b(obj);
                Ny.o j10 = this.f113741d.f113683q.j();
                this.f113740c = 1;
                if (j10.a(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.ScanAndGoCartFragmentViewModel", f = "ScanAndGoCartFragmentViewModel.kt", l = {1009}, m = "trySyncValidProfileState")
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f113742c;

        /* renamed from: d  reason: collision with root package name */
        Object f113743d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f113744e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f113745f;

        /* renamed from: g  reason: collision with root package name */
        int f113746g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(j jVar, C17164e<? super r> eVar) {
            super(eVar);
            this.f113745f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113744e = obj;
            this.f113746g |= Integer.MIN_VALUE;
            return this.f113745f.X0(this);
        }
    }

    public j(U u10, Ry.b bVar, Hl.a aVar, Sy.a aVar2, Cy.b bVar2, Ny.l lVar, Ny.e eVar, Ny.d dVar, Ny.i iVar, Ny.m mVar, C12860a aVar3) {
        U u11 = u10;
        Ry.b bVar3 = bVar;
        Hl.a aVar4 = aVar;
        Sy.a aVar5 = aVar2;
        Cy.b bVar4 = bVar2;
        Ny.l lVar2 = lVar;
        Ny.e eVar2 = eVar;
        Ny.d dVar2 = dVar;
        C12860a aVar6 = aVar3;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(bVar3, "capabilities");
        C17542s.j(aVar4, "wifiConnector");
        C17542s.j(aVar5, "scanAndGoAnalytics");
        C17542s.j(bVar4, "scanAndGoCartAnalytics");
        C17542s.j(lVar2, "useCases");
        C17542s.j(eVar2, "cartFooterButtonOrchestrator");
        C17542s.j(dVar2, "cartContentOrchestrator");
        C17542s.j(iVar, "errorsOrchestrator");
        C17542s.j(mVar, "settingsOrchestrator");
        C17542s.j(aVar6, "localStoreSelectionRepository");
        this.f113679m = bVar3;
        this.f113680n = aVar4;
        this.f113681o = aVar5;
        this.f113682p = bVar4;
        this.f113683q = lVar2;
        this.f113684r = dVar2;
        this.f113685s = aVar6;
        Object f10 = u11.f("shownAsCombinedCart");
        if (f10 != null) {
            this.f113686t = ((Boolean) f10).booleanValue();
            this.f113691y = C16521S.a(K.c.f130759b);
            C16505B<My.f> a10 = C16521S.a(null);
            this.f113692z = a10;
            C16505B<Boolean> a11 = C16521S.a(Boolean.FALSE);
            this.f113671A = a11;
            C16505B<List<C15014g>> a12 = C16521S.a(C16877v.n());
            this.f113672B = a12;
            C16519P<My.i> c02 = C16534i.c0(C16534i.n(mVar.b(), this.f113691y, new m((C17164e<? super m>) null)), g0.a(this), ip.f.a(), new My.i((K) null, (String) null, false, false, false, false, false, false, false, false, (C11522d) null, 2047, (DefaultConstructorMarker) null));
            this.f113673C = c02;
            C16519P<My.c> c03 = C16534i.c0(dVar2.d(c02, a12), g0.a(this), ip.f.a(), new My.c((j.a) null, (My.e) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null));
            this.f113674D = c03;
            C16519P<i.a> c04 = C16534i.c0(C16534i.R(iVar.a(), new c(this, (C17164e<? super c>) null)), g0.a(this), ip.f.a(), new i.a((List) null, false, 3, (DefaultConstructorMarker) null));
            this.f113675E = c04;
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
            C16519P<My.d> a13 = eVar2.a(a11, g0.a(this), ip.f.a());
            this.f113676F = a13;
            this.f113677G = new n(N.f137593c0, this);
            this.f113678H = C16534i.c0(C16534i.k(c02, c03, c04, a13, a10, new o((C17164e<? super o>) null)), g0.a(this), ip.f.a(), new My.j((My.i) null, (My.c) null, (My.f) null, (My.d) null, 15, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void A0(String str) {
        this.f113681o.U();
        X(str, new i(this, str));
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(j jVar, String str) {
        C15014g Z10 = jVar.Z(str);
        if (Z10 != null) {
            jVar.f113692z.setValue(new f.s(Z10.g().e().i(), Z10.h().c()));
        }
        return C16807N.f139792a;
    }

    private final void C0(a.c.i iVar) {
        this.f113692z.setValue(new f.p(iVar.a()));
    }

    private final void D0() {
        this.f113692z.setValue(f.w.f112149a);
    }

    private final void E0(F.d dVar) {
        C15014g Z10 = Z(dVar.a());
        if (Z10 != null) {
            Z10.f().j();
            C16505B<My.f> b10 = this.f113692z;
            String a02 = a0();
            if (a02 == null) {
                a02 = "";
            }
            b10.setValue(new f.r(a02, Z10.j(), Z10, Z10.i()));
        }
    }

    private final void F0() {
        F0 f02 = this.f113690x;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        F0 f03 = this.f113689w;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        this.f113690x = null;
        this.f113689w = null;
        this.f113671A.setValue(Boolean.FALSE);
    }

    private final void G0() {
        Cy.b bVar = this.f113682p;
        String a02 = a0();
        if (a02 == null) {
            a02 = "";
        }
        bVar.p(a02, getState().getValue().a().a());
        W();
    }

    private final void H0(String str, boolean z10) {
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new C2792j(this, str, z10, (C17164e<? super C2792j>) null), 2, (Object) null);
    }

    static /* synthetic */ void I0(j jVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        jVar.H0(str, z10);
    }

    private final void J0(String str, a.c cVar) {
        this.f113681o.O(str, cVar);
        this.f113692z.setValue(new f.C2758f(str));
    }

    private final void K0(a.c.j jVar) {
        Object obj;
        C16505B<My.f> b10 = this.f113692z;
        o.b.a a10 = jVar.a();
        if (a10 instanceof o.b.a.C2709a) {
            obj = f.x.a.f112154e;
        } else if (C17542s.e(a10, o.b.a.C2710b.f111454a)) {
            Cy.b bVar = this.f113682p;
            String a02 = a0();
            if (a02 == null) {
                a02 = "";
            }
            bVar.k(a02);
            obj = f.x.b.f112155e;
        } else if (C17542s.e(a10, o.b.a.c.f111455a)) {
            obj = f.x.c.f112156e;
        } else if (C17542s.e(a10, o.b.a.d.f111456a)) {
            obj = f.x.e.f112157e;
        } else {
            throw new XH.t();
        }
        b10.setValue(obj);
    }

    private final void L0(int i10) {
        this.f113682p.r();
        if (i10 == 0) {
            this.f113692z.setValue(new f.q(Boolean.TRUE));
        } else if (i10 != 1) {
            IllegalStateException illegalStateException = new IllegalStateException("Unknown tab at position " + i10 + ".");
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = j.class.getName();
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
            this.f113692z.setValue(new f.q((Boolean) null));
        } else {
            this.f113692z.setValue(new f.u(true));
        }
    }

    /* access modifiers changed from: private */
    public final void M0(List<D> list) {
        Object obj;
        W b10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((D) obj).b() != null) {
                break;
            }
        }
        D d10 = (D) obj;
        if (d10 != null && (b10 = d10.b()) != null) {
            F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new k(this, d10.a(), b10, (C17164e<? super k>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void N0() {
        if (System.currentTimeMillis() - k.a() > this.f113687u) {
            C12832d c10 = this.f113685s.c();
            String e10 = c10 != null ? c10.e() : null;
            if (e10 == null) {
                e10 = "";
            }
            this.f113682p.n(e10);
            this.f113692z.setValue(f.y.f112158a);
            this.f113687u = System.currentTimeMillis();
        }
    }

    private final void O0(j.a aVar) {
        this.f113684r.n(aVar);
        Cy.b bVar = this.f113682p;
        String b10 = aVar.b();
        C12832d c10 = this.f113685s.c();
        String e10 = c10 != null ? c10.e() : null;
        if (e10 == null) {
            e10 = "";
        }
        bVar.s(b10, e10);
    }

    private final void P0(boolean z10) {
        if (!z10) {
            this.f113692z.setValue(f.n.f112136a);
        } else {
            W0();
        }
    }

    /* access modifiers changed from: private */
    public final void Q0(Throwable th2) {
        boolean z10;
        String str;
        char c10;
        char c11;
        Throwable th3 = th2;
        char c12 = '$';
        Class<j> cls = j.class;
        int i10 = 2;
        String str2 = null;
        if (th3 instanceof C11377c) {
            if (((C11377c) th3).a() != C11377c.a.CANCELLED) {
                this.f113692z.setValue(U(this.f113680n.a()));
            }
        } else if (!(th3 instanceof C15009b)) {
            this.f113692z.setValue(new f.m(C13026h.a(Oo.b.f84526U8), C13026h.a(C12674m.f108290l0)));
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
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a(str2, th3);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, str2, i10, str2), '.', str2, i10, str2);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, z10, th2, str5);
                str2 = str2;
                str4 = str6;
                str3 = str5;
                eVar = eVar;
                i10 = 2;
                z10 = false;
                c12 = '$';
            }
        } else if (((C15009b) th3) instanceof C15009b.c.a) {
            c0();
        } else {
            this.f113692z.setValue(new f.m(C13026h.a(Oo.b.f84526U8), C13026h.a(C12674m.f108290l0)));
        }
        String str7 = str2;
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str8 = str7;
        String str9 = str8;
        for (C11819b bVar2 : arrayList2) {
            if (str9 == null) {
                String a11 = C11818a.a(str7, th3);
                if (a11 == null) {
                    break;
                }
                str = C11820c.a(a11);
            } else {
                str = str9;
            }
            if (str8 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c10 = 2;
                c11 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', str7, 2, str7), '.', str7, 2, str7);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = 2;
                c11 = '$';
            }
            String str10 = str8;
            char c13 = c10;
            char c14 = c11;
            bVar2.a(eVar2, str10, false, th2, str);
            str8 = str10;
            str9 = str;
            str7 = null;
        }
        this.f113671A.setValue(Boolean.FALSE);
    }

    private final void R0(String str, boolean z10) {
        My.f value;
        C16505B<My.f> b10 = this.f113692z;
        do {
            value = b10.getValue();
            My.f fVar = value;
        } while (!b10.e(value, new f.d(str, z10)));
    }

    private final void S0(a.b bVar) {
        C12832d c10 = this.f113685s.c();
        String e10 = c10 != null ? c10.e() : null;
        if (e10 == null) {
            e10 = "";
        }
        if (bVar instanceof a.b.C2751b) {
            this.f113682p.i(e10, ((a.b.C2751b) bVar).a());
        } else if (bVar instanceof a.b.C2750a) {
            this.f113682p.v(this.f113686t);
        } else if (C17542s.e(bVar, a.b.c.f112075a)) {
            this.f113682p.j(e10);
        } else if (C17542s.e(bVar, a.b.d.f112076a)) {
            this.f113682p.l(e10);
        } else {
            throw new XH.t();
        }
    }

    private final void T0(a.c cVar) {
        if (cVar instanceof a.c.b) {
            o0();
        } else if (cVar instanceof a.c.m) {
            a.c.m mVar = (a.c.m) cVar;
            H0(mVar.a(), mVar.b());
        } else if (cVar instanceof a.c.o) {
            O0(((a.c.o) cVar).a());
        } else if (cVar instanceof a.c.e) {
            u0();
        } else if (C17542s.e(cVar, a.c.C2752a.f112077a)) {
            i0();
        } else if (cVar instanceof a.c.g) {
            l0(((a.c.g) cVar).a());
        } else if (C17542s.e(cVar, a.c.d.f112082a)) {
            r0();
        } else if (cVar instanceof a.c.n) {
            L0(((a.c.n) cVar).a());
        } else if (C17542s.e(cVar, a.c.k.f112090a)) {
            D0();
        } else if (cVar instanceof a.c.p) {
            W0();
        } else if (C17542s.e(cVar, a.c.l.f112091a)) {
            F0();
        } else if (cVar instanceof a.c.h) {
            a.c.h hVar = (a.c.h) cVar;
            J0(hVar.a(), hVar.b());
        } else if (cVar instanceof a.c.C2753c.C2754a) {
            p0((a.c.C2753c.C2754a) cVar);
        } else if (C17542s.e(cVar, a.c.C2753c.C2755c.f112081a)) {
            q0();
        } else if (cVar instanceof a.c.C2753c.b) {
            this.f113682p.h(((a.c.C2753c.b) cVar).a());
        } else if (cVar instanceof a.c.f) {
            j0((a.c.f) cVar);
        } else if (cVar instanceof a.c.j) {
            K0((a.c.j) cVar);
        } else if (cVar instanceof a.c.i) {
            C0((a.c.i) cVar);
        } else {
            throw new XH.t();
        }
    }

    private final My.f U(a.C1585a aVar) {
        return b.f113695a[aVar.ordinal()] == 1 ? f.B.f112115a : f.A.f112114a;
    }

    private final void U0(F.e eVar) {
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new l(this, eVar, (C17164e<? super l>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void V() {
        if (this.f113690x == null) {
            F0 c10 = C16310i.c(g0.a(this), this.f113677G, T.LAZY, new d(this, (C17164e<? super d>) null));
            this.f113690x = c10;
            if (c10 != null) {
                c10.start();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void V0(j jVar, C15014g gVar) {
        List<C15014g> value;
        jVar.f113671A.setValue(Boolean.FALSE);
        if (gVar != null) {
            C16505B<List<C15014g>> b10 = jVar.f113672B;
            do {
                value = b10.getValue();
            } while (!b10.e(value, C16877v.S0(value, gVar)));
        }
    }

    private final void W() {
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    private final void W0() {
        F0 f02 = this.f113689w;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f113689w = C16314k.d(g0.a(this), this.f113677G, (T) null, new p(this, (C17164e<? super p>) null), 2, (Object) null);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new q(this, (C17164e<? super q>) null), 3, (Object) null);
    }

    private final void X(String str, C17631a<C16807N> aVar) {
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new f(this, str, aVar, (C17164e<? super f>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X0(dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Oy.j.r
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Oy.j$r r0 = (Oy.j.r) r0
            int r1 = r0.f113746g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113746g = r1
            goto L_0x0018
        L_0x0013:
            Oy.j$r r0 = new Oy.j$r
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f113744e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f113746g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r14 = r0.f113743d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f113742c
            Oy.j r14 = (Oy.j) r14
            XH.y.b(r1)
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0039:
            XH.y.b(r1)
            Ny.l r1 = r13.f113683q
            tz.a r1 = r1.e()
            r0.f113742c = r13
            r0.f113743d = r14
            r0.f113746g = r4
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r2) goto L_0x004f
            return r2
        L_0x004f:
            r14 = r13
        L_0x0050:
            rz.K r1 = (rz.K) r1
            TJ.B<rz.K> r0 = r14.f113691y
            r0.setValue(r1)
            boolean r14 = r14.d0()
            if (r14 != 0) goto L_0x0116
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0070:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r2.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r0, r7)
            if (r6 == 0) goto L_0x0070
            r3.add(r5)
            goto L_0x0070
        L_0x0088:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r5 = r3
            r6 = r5
        L_0x008f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0116
            java.lang.Object r7 = r2.next()
            qv.b r7 = (qv.C11819b) r7
            r9 = 0
            if (r5 != 0) goto L_0x00ba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Failed to load profile for logged in user, "
            r5.append(r8)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r9)
            if (r5 != 0) goto L_0x00b6
            goto L_0x0116
        L_0x00b6:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00ba:
            r11 = r5
            if (r6 != 0) goto L_0x0109
            java.lang.Class<Oy.j> r5 = Oy.j.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r8 = 2
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r3, r8, r3)
            r10 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r10, r3, r8, r3)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00da
            goto L_0x00e0
        L_0x00da:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x00e0:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r8, r4)
            if (r6 == 0) goto L_0x00f3
            java.lang.String r6 = "m"
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r6 = "b"
        L_0x00f5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "|"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
        L_0x0109:
            r12 = r6
            r8 = 0
            r5 = r7
            r6 = r0
            r7 = r12
            r10 = r11
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            r6 = r12
            goto L_0x008f
        L_0x0116:
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Oy.j.X0(dI.e):java.lang.Object");
    }

    static /* synthetic */ void Y(j jVar, String str, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        jVar.X(str, aVar);
    }

    /* access modifiers changed from: private */
    public final C15014g Z(String str) {
        Object obj;
        Iterator it = this.f113674D.getValue().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C15014g) obj).a(), str)) {
                break;
            }
        }
        C15014g gVar = (C15014g) obj;
        if (gVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Item with barcode " + str + " not found in cart.");
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = j.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    public final String a0() {
        C12832d a10 = C12861b.a(this.f113685s);
        if (a10 != null) {
            return a10.e();
        }
        return null;
    }

    private final void c0() {
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new g(this, (C17164e<? super g>) null), 2, (Object) null);
    }

    private final boolean d0() {
        K value = this.f113691y.getValue();
        if ((value instanceof K.a.C3233a) || (value instanceof K.a.c) || (value instanceof K.b)) {
            return true;
        }
        if ((value instanceof K.c) || (value instanceof K.a.b)) {
            return false;
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public final boolean e0() {
        return getState().getValue().d().k() && !this.f113679m.d();
    }

    /* access modifiers changed from: private */
    public final void f0(boolean z10) {
        Object obj;
        C16505B<My.f> b10 = this.f113692z;
        My.b bVar = this.f113688v;
        if (C17542s.e(bVar, b.a.f112097a)) {
            obj = My.h.f112161a;
        } else if (C17542s.e(bVar, b.C2756b.f112098a)) {
            obj = z10 ? My.g.f112160a : f.C13215a.f112116a;
        } else if (bVar == null) {
            obj = f.C13215a.f112116a;
        } else {
            throw new XH.t();
        }
        this.f113688v = null;
        b10.setValue(obj);
    }

    private final void g0(F.c cVar) {
        My.f value;
        C16505B<My.f> b10 = this.f113692z;
        do {
            value = b10.getValue();
            My.f fVar = value;
        } while (!b10.e(value, new f.t(cVar.a())));
    }

    private final void i0() {
        this.f113681o.b(a.e.SHOP_GO_CART);
        this.f113692z.setValue(f.j.f112130a);
    }

    private final void j0(a.c.f fVar) {
        F a10 = fVar.a();
        if (a10 instanceof F.a) {
            v0((F.a) fVar.a());
        } else if (a10 instanceof F.b) {
            w0((F.b) fVar.a());
        } else if (a10 instanceof F.d) {
            E0((F.d) fVar.a());
        } else if (a10 instanceof F.e) {
            U0((F.e) fVar.a());
        } else if (a10 instanceof F.c) {
            g0((F.c) fVar.a());
        } else {
            throw new XH.t();
        }
    }

    private final void k0(com.ingka.ikea.scanandgo.cart.impl.dialog.a aVar) {
        if (aVar instanceof a.C2994a) {
            Y(this, ((a.C2994a) aVar).a(), (C17631a) null, 2, (Object) null);
        } else if (aVar instanceof a.b) {
            H0(((a.b) aVar).a(), false);
        } else if (aVar instanceof a.c) {
            this.f113692z.setValue(new f.C2758f(((a.c) aVar).a()));
        } else if (aVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Received illegal result from CartOverflowMenuBottomSheet");
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
                    String name = j.class.getName();
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
        } else {
            throw new XH.t();
        }
    }

    private final void l0(My.b bVar) {
        this.f113688v = bVar;
        if (C17542s.e(bVar, b.a.f112097a)) {
            G0();
        } else if (C17542s.e(bVar, b.C2756b.f112098a)) {
            y0();
        } else {
            throw new XH.t();
        }
    }

    private final void m0(boolean z10) {
        if (z10) {
            V();
        } else {
            this.f113671A.setValue(Boolean.FALSE);
        }
    }

    private final void n0(a.C2810a aVar, boolean z10) {
        if (aVar instanceof a.C2810a.C2811a) {
            this.f113692z.setValue(new f.m(C13026h.c(((a.C2810a.C2811a) aVar).a()), C13026h.a(Oo.b.f84734o2)));
        } else if (aVar instanceof a.C2810a.c) {
            if (!z10) {
                this.f113692z.setValue(f.n.f112136a);
            }
        } else if (!C17542s.e(aVar, a.C2810a.b.f114046a)) {
            throw new XH.t();
        }
    }

    private final void o0() {
        this.f113692z.setValue(null);
    }

    private final void p0(a.c.C2753c.C2754a aVar) {
        this.f113682p.e(aVar.a());
        F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new h(this, aVar, (C17164e<? super h>) null), 2, (Object) null);
    }

    private final void q0() {
        this.f113682p.f();
        this.f113692z.setValue(f.e.b.f112123a);
    }

    private final void r0() {
        this.f113682p.t();
        this.f113692z.setValue(f.g.f112126a);
    }

    private final void s0(Y.a aVar) {
        if (aVar instanceof Y.a.b) {
            F0 unused = C16314k.d(g0.a(this), this.f113677G, (T) null, new i(this, aVar, (C17164e<? super i>) null), 2, (Object) null);
            this.f113671A.setValue(Boolean.FALSE);
        } else if (!C17542s.e(aVar, Y.a.C2681a.f111000a)) {
            throw new XH.t();
        }
    }

    private final void t0(DeleteCouponBottomSheet.Companion.FragmentResult fragmentResult) {
        if (C17542s.e(fragmentResult, DeleteCouponBottomSheet.Companion.FragmentResult.a.f119865a)) {
            this.f113692z.setValue(f.j.f112130a);
        } else if (fragmentResult instanceof DeleteCouponBottomSheet.Companion.FragmentResult.b) {
            W0();
            this.f113692z.setValue(f.i.f112129a);
        } else if (!C17542s.e(fragmentResult, DeleteCouponBottomSheet.Companion.FragmentResult.c.f119869a)) {
            throw new XH.t();
        }
    }

    private final void u0() {
        if (getState().getValue().d().h()) {
            this.f113681o.j();
            this.f113692z.setValue(f.k.f112131a);
        }
    }

    private final void v0(F.a aVar) {
        this.f113692z.setValue(new f.l(aVar.a()));
    }

    private final C16807N w0(F.b bVar) {
        Z0.c.a b10 = bVar.b();
        if (C17542s.e(b10, Z0.c.a.g.f85058b)) {
            C15014g Z10 = Z(bVar.a());
            if (Z10 == null) {
                return null;
            }
            J0(bVar.a(), Z10.f());
            return C16807N.f139792a;
        } else if (C17542s.e(b10, Z0.c.a.C1719c.f85054b)) {
            if (Z(bVar.a()) == null) {
                return null;
            }
            I0(this, bVar.a(), false, 2, (Object) null);
            return C16807N.f139792a;
        } else if (!C17542s.e(b10, Z0.c.a.e.f85056b)) {
            return C16807N.f139792a;
        } else {
            A0(bVar.a());
            return C16807N.f139792a;
        }
    }

    private final void x0(a.C2748a aVar) {
        if (aVar instanceof a.C2748a.C2749a) {
            k0(((a.C2748a.C2749a) aVar).a());
        } else if (aVar instanceof a.C2748a.c) {
            m0(((a.C2748a.c) aVar).a());
        } else if (aVar instanceof a.C2748a.h) {
            z0(((a.C2748a.h) aVar).a());
        } else if (aVar instanceof a.C2748a.f) {
            s0(((a.C2748a.f) aVar).a());
        } else if (aVar instanceof a.C2748a.g) {
            t0(((a.C2748a.g) aVar).a());
        } else if (aVar instanceof a.C2748a.b) {
            a.C2748a.b bVar = (a.C2748a.b) aVar;
            n0(bVar.a(), bVar.b());
        } else if (aVar instanceof a.C2748a.i) {
            P0(((a.C2748a.i) aVar).a());
        } else if (C17542s.e(aVar, a.C2748a.d.f112065a)) {
            V();
        } else if (aVar instanceof a.C2748a.e) {
            this.f113682p.g();
        } else if (aVar instanceof a.C2748a.j) {
            a.C2748a.j jVar = (a.C2748a.j) aVar;
            R0(jVar.a(), jVar.b());
        } else {
            throw new XH.t();
        }
    }

    private final void y0() {
        if (!this.f113674D.getValue().a().isEmpty()) {
            W();
        } else if (this.f113685s.c() != null) {
            D0();
        } else {
            this.f113681o.C(Ae.l.CART_BUTTON);
            this.f113692z.setValue(f.w.f112149a);
        }
    }

    private final void z0(a.b bVar) {
        if (C17542s.e(bVar, a.b.C2587b.f108191a)) {
            V();
        } else if (C17542s.e(bVar, a.b.C2585a.f108190a) || C17542s.e(bVar, a.b.c.f108192a) || C17542s.e(bVar, a.b.d.f108193a)) {
            this.f113671A.setValue(Boolean.FALSE);
        } else {
            throw new XH.t();
        }
    }

    public final boolean b0() {
        return this.f113686t;
    }

    public C16519P<My.j> getState() {
        return this.f113678H;
    }

    public void h0(My.a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.c) {
            T0((a.c) aVar);
        } else if (aVar instanceof a.C2748a) {
            x0((a.C2748a) aVar);
        } else if (aVar instanceof a.b) {
            S0((a.b) aVar);
        } else {
            throw new XH.t();
        }
    }
}
