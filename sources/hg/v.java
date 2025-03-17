package hg;

import Ae.e;
import Ae.k;
import BA.C12609a;
import CA.C12683b;
import EB.C12832d;
import FA.C12859a;
import FB.C12860a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import JC.C13068a;
import KJ.C15985a;
import Kf.C9133b;
import Kf.x;
import Lf.b;
import Ln.d;
import Ln.e;
import Ln.g;
import Ln.h;
import Mn.c;
import Nd.c;
import O0.J0;
import OC.C13302d;
import Of.C9155a;
import Of.C9227y;
import Of.C9230z;
import Op.C10828d;
import Op.C10850o;
import Op.a1;
import Op.b1;
import QJ.F0;
import QJ.N;
import RC.m;
import SC.H0;
import SC.L2;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tf.t;
import UJ.C16619l;
import Vf.a;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cD.C14031c;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.inappfeedback.e;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import dg.C9625a;
import dg.C9626b;
import eI.C17187b;
import fI.C17221b;
import hg.E;
import hg.J;
import hg.K;
import hg.n;
import hg.q;
import hg.r;
import hk.g;
import ig.C9845a;
import ig.C9847c;
import ig.C9849e;
import ig.C9851g;
import ig.o;
import ig.s;
import ig.u;
import ip.C11410b;
import ip.l;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;
import sB.C15035a;
import sf.C10242c;
import sf.C10243d;
import tf.C10253a;
import uK.C18146a;

@Metadata(d1 = {"\u0000¦\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 ·\u00012\u00020\u0001:\u0012ù\u0002ú\u0002û\u0002ü\u0002ý\u0002þ\u0002ÿ\u0002\u0003\u0003Bù\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0019\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@H\u0003¢\u0006\u0004\bC\u0010DJ-\u0010J\u001a\u00020B2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bJ\u0010KJ'\u0010Q\u001a\u00020B2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020L2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ<\u0010Y\u001a\u00020B2\u0006\u0010N\u001a\u00020L2\u0006\u0010S\u001a\u00020L2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010W\u001a\u00020V2\b\u0010X\u001a\u0004\u0018\u00010LH@¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020B2\u0006\u0010[\u001a\u00020EH\u0003¢\u0006\u0004\b\\\u0010]J\u001b\u0010a\u001a\u0004\u0018\u00010`2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\ba\u0010bJ\u0019\u0010c\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bc\u0010DJW\u0010p\u001a\b\u0012\u0004\u0012\u00020o0d2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d2\b\u0010g\u001a\u0004\u0018\u00010L2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020L0h2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020k0j2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bp\u0010qJ=\u0010u\u001a\u00020t*\u00020r2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020L0h2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020k0j2\u0006\u0010s\u001a\u00020EH\u0002¢\u0006\u0004\bu\u0010vJ\u0013\u0010y\u001a\u00020x*\u00020wH\u0002¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020BH\u0002¢\u0006\u0004\b{\u0010|J\u0018\u0010\u001a\u00020B2\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0005\b\u0010\u0001J*\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020EH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J.\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\r\u0010f\u001a\t\u0012\u0005\u0012\u00030\u00010dH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020B¢\u0006\u0005\b\u0001\u0010|J\u001a\u0010\u0001\u001a\u0004\u0018\u00010e2\u0006\u0010N\u001a\u00020L¢\u0006\u0006\b\u0001\u0010\u0001J3\u0010\u0001\u001a\u00020B2\u0006\u0010N\u001a\u00020L2\u0006\u0010S\u001a\u00020L2\u0006\u0010W\u001a\u00020V2\t\u0010\u0001\u001a\u0004\u0018\u00010L¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010\u0001\u001a\u00020B2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0006\u0010S\u001a\u00020L¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020B¢\u0006\u0005\b\u0001\u0010|J\u0019\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020L¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020L¢\u0006\u0006\b\u0001\u0010\u0001J1\u0010\u0001\u001a\u00020B2\u0006\u0010N\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0006\u0010W\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020L¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00012\b\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001a\u0010§\u0001\u001a\u00020B2\b\u0010¦\u0001\u001a\u00030¥\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001a\u0010ª\u0001\u001a\u00020B2\b\u0010©\u0001\u001a\u00030¥\u0001¢\u0006\u0006\bª\u0001\u0010¨\u0001J\u0019\u0010¬\u0001\u001a\u00020B2\u0007\u0010«\u0001\u001a\u00020m¢\u0006\u0006\b¬\u0001\u0010­\u0001J\u0013\u0010¯\u0001\u001a\u0005\u0018\u00010®\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0018\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010d¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0010\u0010³\u0001\u001a\u00020E¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0018\u0010¶\u0001\u001a\u00020B2\u0007\u0010µ\u0001\u001a\u00020E¢\u0006\u0005\b¶\u0001\u0010]J\u000f\u0010·\u0001\u001a\u00020B¢\u0006\u0005\b·\u0001\u0010|J\u000f\u0010¸\u0001\u001a\u00020B¢\u0006\u0005\b¸\u0001\u0010|J\u000f\u0010¹\u0001\u001a\u00020B¢\u0006\u0005\b¹\u0001\u0010|J\u0018\u0010»\u0001\u001a\u00020B2\u0007\u0010º\u0001\u001a\u00020E¢\u0006\u0005\b»\u0001\u0010]J0\u0010¿\u0001\u001a\u00020B2\b\u0010¼\u0001\u001a\u00030\u00012\t\u0010½\u0001\u001a\u0004\u0018\u00010L2\t\u0010!\u001a\u0005\u0018\u00010¾\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J3\u0010Á\u0001\u001a\u00020B2\b\u0010¼\u0001\u001a\u00030\u00012\t\u0010½\u0001\u001a\u0004\u0018\u00010L2\t\u0010!\u001a\u0005\u0018\u00010¾\u0001H@¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u000f\u0010Ã\u0001\u001a\u00020B¢\u0006\u0005\bÃ\u0001\u0010|J\u001a\u0010Æ\u0001\u001a\u00020B2\b\u0010Å\u0001\u001a\u00030Ä\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u000f\u0010È\u0001\u001a\u00020B¢\u0006\u0005\bÈ\u0001\u0010|J4\u0010Ï\u0001\u001a\u00020B2\b\u0010Ê\u0001\u001a\u00030É\u00012\n\b\u0002\u0010Ì\u0001\u001a\u00030Ë\u00012\f\b\u0002\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u0001¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001JD\u0010Ø\u0001\u001a\u00020B2\b\u0010Ñ\u0001\u001a\u00030É\u00012\b\u0010Ò\u0001\u001a\u00030É\u00012\b\u0010Ô\u0001\u001a\u00030Ó\u00012\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ó\u00012\b\u0010×\u0001\u001a\u00030Ö\u0001¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u000f\u0010Ú\u0001\u001a\u00020B¢\u0006\u0005\bÚ\u0001\u0010|J\u0019\u0010Ü\u0001\u001a\u00020B2\u0007\u0010Û\u0001\u001a\u00020L¢\u0006\u0006\bÜ\u0001\u0010\u0001J\u0019\u0010Ý\u0001\u001a\u00020B2\u0007\u0010Û\u0001\u001a\u00020L¢\u0006\u0006\bÝ\u0001\u0010\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0016\u00109\u001a\u0002088\u0002X\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R&\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\bö\u0001\u0010\u0002R \u0010\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R \u0010\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R \u0010\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R#\u0010i\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0h0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R$\u0010\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0d0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R)\u0010l\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020k0j0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b \u0002\u0010\u0002R)\u0010I\u001a\u00020E2\u0007\u0010¡\u0002\u001a\u00020E8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010´\u0001R\u0019\u0010¦\u0002\u001a\u00020E8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010£\u0002R-\u0010H\u001a\u0004\u0018\u00010G2\t\u0010¡\u0002\u001a\u0004\u0018\u00010G8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002R\u0019\u0010¬\u0002\u001a\u00020E8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b«\u0002\u0010£\u0002R \u0010®\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010@0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b­\u0002\u0010\u0002R!\u0010°\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010 \u00010\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010\u0002R!\u0010³\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010±\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b²\u0002\u0010\u0002R!\u0010¶\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010´\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010\u0002R$\u0010·\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0d0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b£\u0002\u0010\u0002R\u001c\u0010º\u0002\u001a\u0005\u0018\u00010¸\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010¹\u0002R \u0010¼\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\ba\u0010\u0002R\u001e\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020O0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0002R \u0010¾\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010`0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u0002R \u0010¿\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010L0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0002R \u0010Á\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010À\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bp\u0010\u0002R!\u0010Ä\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Â\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010\u0002R!\u0010Æ\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Å\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u0002R\u001f\u0010È\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b©\u0002\u0010\u0002R#\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020m0\u00028\u0006¢\u0006\u0010\n\u0006\bÉ\u0002\u0010\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002R!\u0010Ñ\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Î\u00020Í\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u001f\u0010Ó\u0002\u001a\n\u0012\u0005\u0012\u00030Ò\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010\u0002R.\u0010Ö\u0002\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030Õ\u0002\u0012\u0004\u0012\u00020}\u0018\u00010Ô\u00020Í\u00028\u0002X\u0004¢\u0006\b\n\u0006\b±\u0001\u0010Ð\u0002R\u001e\u0010Ø\u0002\u001a\n\u0012\u0005\u0012\u00030×\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0002R\u001e\u0010Ú\u0002\u001a\t\u0012\u0004\u0012\u00020E0\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010\u0002R!\u0010Û\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010\u00028\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u0002R\u001c\u0010Þ\u0002\u001a\u0005\u0018\u00010Ü\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Ý\u0002R!\u0010à\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ß\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0002R\u001f\u0010â\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0002R\u001f\u0010ä\u0002\u001a\n\u0012\u0005\u0012\u00030ã\u00020Í\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010Ð\u0002R\u001f\u0010æ\u0002\u001a\n\u0012\u0005\u0012\u00030å\u00020Í\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ð\u0002R\u001e\u0010è\u0002\u001a\n\u0012\u0005\u0012\u00030ç\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0002R!\u0010í\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ê\u00020é\u00028\u0002X\u0004¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R$\u0010ï\u0002\u001a\n\u0012\u0005\u0012\u00030î\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0002\u001a\u0006\bÃ\u0002\u0010\u0002R%\u0010ò\u0002\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0005\u0012\u00030¸\u00020ð\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010ñ\u0002R(\u0010ó\u0002\u001a\u00020E8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b¶\u0001\u0010£\u0002\u001a\u0006\bÏ\u0002\u0010´\u0001\"\u0005\bë\u0002\u0010]R$\u0010ø\u0002\u001a\n\u0012\u0005\u0012\u00030õ\u00020ô\u00028\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010ö\u0002\u001a\u0006\bÉ\u0002\u0010÷\u0002¨\u0006\u0003"}, d2 = {"Lhg/v;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LKf/b;", "cartApi", "LLn/h;", "cartRepository", "LjB/b;", "shoppingListRepository", "LcD/c;", "profileRepository", "LBA/a;", "shareRepository", "LIl/a;", "appConfig", "Ltf/a;", "killSwitchRepository", "LaA/a;", "sessionManager", "LLf/b;", "cartAnalytics", "Lsf/c;", "appUserDataRepository", "LYf/a;", "cartItemHolderMapper", "Lig/s;", "getMComConfigUseCase", "LFB/a;", "localStoreSelectionRepository", "Lhg/a;", "cartAvailabilityHandler", "LAe/e;", "analytics", "LKf/x;", "cartInteractor", "Lig/o;", "getFamilyPromotionBannerUseCase", "LVf/a;", "getAssemblyServicesUseCase", "LAy/b;", "scanAndGoCartIntegration", "Lhg/o;", "cartSettings", "Lig/c;", "getCartPriceUiStateUseCase", "Lig/g;", "getCheckoutButtonUiStateUseCase", "Lig/q;", "getGooglePayButtonUiStateUseCase", "Lig/a;", "getCartItemAvailabilityUseCase", "Lig/e;", "getCartUpsellUseCase", "Lig/k;", "getEmptyCartUiStateUseCase", "LNd/c;", "abTesting", "Ldg/b;", "getFamilyRewardsUseCase", "Lig/u;", "getRemoteSalesUiStateUseCase", "<init>", "(Landroidx/lifecycle/U;LKf/b;LLn/h;LjB/b;LcD/c;LBA/a;LIl/a;Ltf/a;LaA/a;LLf/b;Lsf/c;LYf/a;Lig/s;LFB/a;Lhg/a;LAe/e;LKf/x;Lig/o;LVf/a;LAy/b;Lhg/o;Lig/c;Lig/g;Lig/q;Lig/a;Lig/e;Lig/k;LNd/c;Ldg/b;Lig/u;)V", "LLn/g;", "cartHolder", "LXH/N;", "b1", "(LLn/g;)V", "", "showMaterialsInCartConfig", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "employeeDiscountConfig", "showTotalExclTaxInCartAndCheckout", "c1", "(Ljava/lang/Boolean;Lcom/ingka/ikea/mcomsettings/MComConfig$e;Ljava/lang/Boolean;)V", "", "listId", "itemNo", "", "quantity", "n0", "(Ljava/lang/String;Ljava/lang/String;I)V", "successSnackBarText", "Lhg/L;", "undoShoppingListMoveAction", "LAe/k;", "actionType", "analyticsComponentValue", "u0", "(Ljava/lang/String;Ljava/lang/String;Lhg/L;LAe/k;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "showLoadingScreen", "e1", "(Z)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "abortCheckoutSurveyConfig", "Lhg/q$e;", "z0", "(Lcom/ingka/ikea/mcomsettings/MComConfig$f;)Lhg/q$e;", "T0", "", "LLn/d;", "cartItems", "postalCode", "", "itemsInShoppingList", "", "Lhg/v$i;", "itemNosUpdatingQuantity", "Lsf/d;", "preferredDelivery", "Lhg/n;", "D0", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Lsf/d;)Ljava/util/List;", "Lhg/h;", "limitedAvailability", "Lhg/n$b;", "k0", "(Lhg/h;Ljava/util/Set;Ljava/util/Map;Z)Lhg/n$b;", "LVf/a$a;", "Lhg/q$a;", "l0", "(LVf/a$a;)Lhg/q$a;", "q0", "()V", "", "throwable", "L0", "(Ljava/lang/Throwable;)V", "Lhg/q$d$a;", "googlePayButton", "buttonClicked", "w0", "(Lhg/q$d$a;Z)Lhg/q$d$a;", "Lhg/q$b$b$a;", "remoteSalesUiState", "LKf/y;", "Lhg/q$c$a$a;", "A0", "(Lhg/q$b$b$a;Ljava/util/List;)Lhg/q$c$a$a;", "Lhg/v$a;", "action", "P0", "(Lhg/v$a;)V", "x0", "C0", "(Ljava/lang/String;)LLn/d;", "componentValue", "m0", "(Ljava/lang/String;Ljava/lang/String;LAe/k;Ljava/lang/String;)V", "O0", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "h0", "listName", "Q0", "(Ljava/lang/String;)V", "V0", "deleteItemSuccessText", "f1", "(Ljava/lang/String;ILAe/k;Ljava/lang/String;)V", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LMn/c;", "F0", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)LMn/c;", "", "time", "o0", "(J)V", "currentTimeMillis", "g0", "option", "R0", "(Lsf/d;)V", "LQf/a;", "B0", "()LQf/a;", "K0", "()Ljava/util/List;", "N0", "()Z", "isChecked", "X0", "Z0", "Y0", "a1", "checked", "d1", "item", "productName", "Lhg/v$b;", "e0", "(LKf/y;Ljava/lang/String;Lhg/v$b;)V", "t0", "(LKf/y;Ljava/lang/String;Lhg/v$b;LdI/e;)Ljava/lang/Object;", "S0", "LOf/z$a;", "event", "W0", "(LOf/z$a;)V", "j0", "LIC/e;", "snackBarText", "LO0/J0;", "duration", "Lhg/K$b$a;", "snackbarAction", "r0", "(LIC/e;LO0/J0;Lhg/K$b$a;)V", "header", "body", "Lhg/K$a$a;", "primaryAction", "secondaryAction", "Landroidx/compose/ui/window/h;", "dialogProperties", "p0", "(LIC/e;LIC/e;Lhg/K$a$a;Lhg/K$a$a;Landroidx/compose/ui/window/h;)V", "y0", "rewardCode", "f0", "i0", "m", "Landroidx/lifecycle/U;", "n", "LKf/b;", "o", "LLn/h;", "p", "LjB/b;", "q", "LcD/c;", "r", "LBA/a;", "s", "LIl/a;", "t", "Ltf/a;", "u", "LaA/a;", "v", "LLf/b;", "w", "Lsf/c;", "x", "LYf/a;", "y", "Lhg/a;", "z", "LAe/e;", "A", "LKf/x;", "B", "Lhg/o;", "C", "LNd/c;", "D", "Ldg/b;", "LTJ/B;", "Lhg/r;", "E", "LTJ/B;", "_uiEvent", "LTJ/P;", "F", "LTJ/P;", "()LTJ/P;", "uiEvent", "G", "showProgress", "H", "isShowLoadingScreen", "I", "availabilityLoading", "Lhg/K;", "J", "message", "Lhg/q$f;", "K", "navigation", "Lhg/v$g;", "L", "loading", "LTJ/g;", "M", "LTJ/g;", "N", "itemNosAddingToCart", "O", "value", "P", "Z", "getShowTotalExclTaxInCartAndCheckout", "Q", "showMaterialsInCart", "R", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "G0", "()Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "S", "employeeDiscountAgreedTerms", "T", "cartDataFlow", "U", "postalCodeFlow", "LEB/d;", "X", "selectedStoreFlow", "Lhg/q$b;", "Y", "bottomSheetState", "cartItemsFlow", "LQJ/F0;", "LQJ/F0;", "fetchCartJob", "Lig/s$a;", "configFlow", "surveyStateTrigger", "surveyUiState", "updatingFamilyRewardWithCodeState", "LOf/y;", "familyRewardFlow", "LTf/t;", "E0", "discountUiState", "LOC/d;", "availablePaymentOptionsUiState", "Lhg/v$e;", "cartServicesUiState", "H0", "J0", "()LTJ/B;", "preferredDeliveryFlow", "LTJ/F;", "Lhg/q$g;", "I0", "LTJ/F;", "upsellUiState", "Lhg/v$d;", "promotionUiState", "Lip/l;", "Lig/a$a;", "availabilityFlow", "Lhg/v$c;", "cartProductUiData", "M0", "googlePayClickedState", "googlePayButtonState", "Lhg/E;", "Lhg/E;", "checkoutState", "Lhg/q$d;", "checkoutButtonState", "Lhg/v$h;", "navigationUiState", "Lhg/q$c$b;", "emptyState", "Lhg/q$c$a;", "cartContent", "Lhg/q$c;", "cartContentUiState", "LTJ/A;", "LsB/a;", "U0", "LTJ/A;", "shoppingListModifiedFlow", "Lhg/q;", "cartState", "", "Ljava/util/Map;", "quantityUpdateJobs", "pendingFetchCart", "Lip/b;", "LOf/a;", "Lip/b;", "()Lip/b;", "openDeliveryOptionPicker", "g", "a", "b", "i", "d", "c", "e", "h", "f", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends f0 {

    /* renamed from: Z0  reason: collision with root package name */
    public static final C9809f f73830Z0 = new C9809f((DefaultConstructorMarker) null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f73831a1 = 8;

    /* renamed from: b1  reason: collision with root package name */
    private static final long f73832b1 = TimeUnit.DAYS.toMillis(2);

    /* renamed from: A  reason: collision with root package name */
    private final x f73833A;

    /* renamed from: A0  reason: collision with root package name */
    private final C16505B<Integer> f73834A0;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final o f73835B;

    /* renamed from: B0  reason: collision with root package name */
    private final C16532g<q.e> f73836B0;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final c f73837C;
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public final C16505B<String> f73838C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C9626b f73839D;

    /* renamed from: D0  reason: collision with root package name */
    private final C16532g<C9227y> f73840D0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C16505B<r> f73841E;

    /* renamed from: E0  reason: collision with root package name */
    private final C16532g<t> f73842E0;

    /* renamed from: F  reason: collision with root package name */
    private final C16519P<r> f73843F;

    /* renamed from: F0  reason: collision with root package name */
    private final C16532g<C13302d> f73844F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C16505B<Boolean> f73845G;

    /* renamed from: G0  reason: collision with root package name */
    private final C16532g<C9808e> f73846G0;

    /* renamed from: H  reason: collision with root package name */
    private final C16505B<Boolean> f73847H;

    /* renamed from: H0  reason: collision with root package name */
    private final C16505B<C10243d> f73848H0;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final C16505B<Boolean> f73849I;

    /* renamed from: I0  reason: collision with root package name */
    private final C16509F<q.g> f73850I0;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final C16505B<K> f73851J;

    /* renamed from: J0  reason: collision with root package name */
    private final C16532g<C9807d> f73852J0;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final C16505B<q.f> f73853K;

    /* renamed from: K0  reason: collision with root package name */
    private final C16509F<l<C9845a.C1326a, Throwable>> f73854K0;

    /* renamed from: L  reason: collision with root package name */
    private final C16519P<C9810g> f73855L;

    /* renamed from: L0  reason: collision with root package name */
    private final C16532g<C9806c> f73856L0;

    /* renamed from: M  reason: collision with root package name */
    private final C16532g<Set<String>> f73857M;

    /* renamed from: M0  reason: collision with root package name */
    private final C16505B<Boolean> f73858M0;

    /* renamed from: N  reason: collision with root package name */
    private final C16505B<List<String>> f73859N;

    /* renamed from: N0  reason: collision with root package name */
    private final C16532g<q.d.a> f73860N0;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public final C16505B<Map<String, C9812i>> f73861O;
    /* access modifiers changed from: private */

    /* renamed from: O0  reason: collision with root package name */
    public E f73862O0;

    /* renamed from: P  reason: collision with root package name */
    private boolean f73863P;

    /* renamed from: P0  reason: collision with root package name */
    private final C16532g<q.d> f73864P0;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f73865Q;

    /* renamed from: Q0  reason: collision with root package name */
    private final C16532g<C9811h> f73866Q0;

    /* renamed from: R  reason: collision with root package name */
    private MComConfig.e f73867R;
    /* access modifiers changed from: private */

    /* renamed from: R0  reason: collision with root package name */
    public final C16509F<q.c.b> f73868R0;

    /* renamed from: S  reason: collision with root package name */
    private boolean f73869S;
    /* access modifiers changed from: private */

    /* renamed from: S0  reason: collision with root package name */
    public final C16509F<q.c.a> f73870S0;

    /* renamed from: T  reason: collision with root package name */
    private final C16532g<g> f73871T;

    /* renamed from: T0  reason: collision with root package name */
    private final C16532g<q.c> f73872T0;

    /* renamed from: U  reason: collision with root package name */
    private final C16532g<UserPostalCodeAddress> f73873U;
    /* access modifiers changed from: private */

    /* renamed from: U0  reason: collision with root package name */
    public final C16504A<C15035a> f73874U0;

    /* renamed from: V0  reason: collision with root package name */
    private final C16519P<q> f73875V0;

    /* renamed from: W0  reason: collision with root package name */
    private final Map<String, F0> f73876W0;

    /* renamed from: X  reason: collision with root package name */
    private final C16519P<C12832d> f73877X;

    /* renamed from: X0  reason: collision with root package name */
    private boolean f73878X0;

    /* renamed from: Y  reason: collision with root package name */
    private final C16505B<q.b> f73879Y;

    /* renamed from: Y0  reason: collision with root package name */
    private final C11410b<C9155a> f73880Y0;

    /* renamed from: Z  reason: collision with root package name */
    private final C16505B<List<d>> f73881Z = C16521S.a(C16877v.n());

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.U f73882m;

    /* renamed from: n  reason: collision with root package name */
    private final C9133b f73883n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final h f73884o;

    /* renamed from: p  reason: collision with root package name */
    private final C14613b f73885p;

    /* renamed from: q  reason: collision with root package name */
    private final C14031c f73886q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C12609a f73887r;

    /* renamed from: s  reason: collision with root package name */
    private final a f73888s;

    /* renamed from: t  reason: collision with root package name */
    private final C10253a f73889t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C13909a f73890u;

    /* renamed from: v  reason: collision with root package name */
    private final b f73891v;

    /* renamed from: w  reason: collision with root package name */
    private final C10242c f73892w;

    /* renamed from: x  reason: collision with root package name */
    private final Yf.a f73893x;

    /* renamed from: y  reason: collision with root package name */
    private final C9792a f73894y;

    /* renamed from: y0  reason: collision with root package name */
    private F0 f73895y0;

    /* renamed from: z  reason: collision with root package name */
    private final e f73896z;

    /* renamed from: z0  reason: collision with root package name */
    private final C16532g<s.a> f73897z0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LLn/g;", "cart", "Lig/s$a;", "config", "LOf/y;", "familyReward", "LTf/t;", "<anonymous>", "(LLn/g;Lig/s$a;LOf/y;)LTf/t;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$discountUiState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class A extends kotlin.coroutines.jvm.internal.l implements r<g, s.a, C9227y, C17164e<? super t>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73898c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73899d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73900e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f73901f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f73902g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(v vVar, C17164e<? super A> eVar) {
            super(4, eVar);
            this.f73902g = vVar;
        }

        /* renamed from: i */
        public final Object l(g gVar, s.a aVar, C9227y yVar, C17164e<? super t> eVar) {
            A a10 = new A(this.f73902g, eVar);
            a10.f73899d = gVar;
            a10.f73900e = aVar;
            a10.f73901f = yVar;
            return a10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            t tVar;
            Ln.c a10;
            Ln.c a11;
            Ln.c a12;
            C17187b.f();
            if (this.f73898c == 0) {
                y.b(obj);
                g gVar = (g) this.f73899d;
                s.a aVar = (s.a) this.f73900e;
                C9227y yVar = (C9227y) this.f73901f;
                boolean c10 = aVar != null ? aVar.c() : false;
                String a13 = (gVar == null || (a12 = gVar.a()) == null) ? null : a12.a();
                String b10 = (gVar == null || (a11 = gVar.a()) == null) ? null : a11.b();
                boolean c11 = (gVar == null || (a10 = gVar.a()) == null) ? false : a10.c();
                boolean z10 = yVar != null && (yVar.b() || yVar.a() != null);
                if (!c10) {
                    return null;
                }
                if (z10) {
                    tVar = new t(new C13023e.d(Oo.b.f84601c1, (List) null, 2, (DefaultConstructorMarker) null), (C13023e) null, false, false);
                } else if (a13 != null) {
                    if (b10 != null) {
                        a13 = b10;
                    }
                    return new t(new C13023e.d(C11849b.f102331p, (List) null, 2, (DefaultConstructorMarker) null), C13026h.c(a13), !this.f73902g.f73890u.i() && c11, false, 8, (DefaultConstructorMarker) null);
                } else {
                    tVar = new t(new C13023e.d(Oo.b.f84601c1, (List) null, 2, (DefaultConstructorMarker) null), (C13023e) null, false, false, 8, (DefaultConstructorMarker) null);
                }
                return tVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel", f = "CartViewModel.kt", l = {1351, 1355}, m = "doAddToCart")
    static final class B extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f73903c;

        /* renamed from: d  reason: collision with root package name */
        Object f73904d;

        /* renamed from: e  reason: collision with root package name */
        Object f73905e;

        /* renamed from: f  reason: collision with root package name */
        Object f73906f;

        /* renamed from: g  reason: collision with root package name */
        Object f73907g;

        /* renamed from: h  reason: collision with root package name */
        Object f73908h;

        /* renamed from: i  reason: collision with root package name */
        Object f73909i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f73910j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ v f73911k;

        /* renamed from: l  reason: collision with root package name */
        int f73912l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        B(v vVar, C17164e<? super B> eVar) {
            super(eVar);
            this.f73911k = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73910j = obj;
            this.f73912l |= Integer.MIN_VALUE;
            return this.f73911k.t0((Kf.y) null, (String) null, (C9805b) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel", f = "CartViewModel.kt", l = {821}, m = "doDeleteCartItem")
    static final class C extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f73913c;

        /* renamed from: d  reason: collision with root package name */
        Object f73914d;

        /* renamed from: e  reason: collision with root package name */
        Object f73915e;

        /* renamed from: f  reason: collision with root package name */
        Object f73916f;

        /* renamed from: g  reason: collision with root package name */
        Object f73917g;

        /* renamed from: h  reason: collision with root package name */
        Object f73918h;

        /* renamed from: i  reason: collision with root package name */
        Object f73919i;

        /* renamed from: j  reason: collision with root package name */
        Object f73920j;

        /* renamed from: k  reason: collision with root package name */
        int f73921k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f73922l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v f73923m;

        /* renamed from: n  reason: collision with root package name */
        int f73924n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(v vVar, C17164e<? super C> eVar) {
            super(eVar);
            this.f73923m = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73922l = obj;
            this.f73924n |= Integer.MIN_VALUE;
            return this.f73923m.u0((String) null, (String) null, (L) null, (k) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldg/a;", "familyRewardState", "", "updatingFamilyRewardWithCode", "LOf/y;", "<anonymous>", "(Ldg/a;Ljava/lang/String;)LOf/y;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$familyRewardFlow$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class D extends kotlin.coroutines.jvm.internal.l implements nI.q<C9625a, String, C17164e<? super C9227y>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73925c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73926d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73927e;

        D(C17164e<? super D> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C9625a aVar, String str, C17164e<? super C9227y> eVar) {
            D d10 = new D(eVar);
            d10.f73926d = aVar;
            d10.f73927e = str;
            return d10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73925c == 0) {
                y.b(obj);
                C9625a aVar = (C9625a) this.f73926d;
                String str = (String) this.f73927e;
                if (aVar instanceof C9625a.C1240a) {
                    return Yf.b.d((C9625a.C1240a) aVar, str);
                }
                if (C17542s.e(aVar, C9625a.b.f72416a)) {
                    return new C9227y(C15985a.a(), (Ln.c) null, (String) null, false, true);
                }
                if (C17542s.e(aVar, C9625a.c.f72417a) || C17542s.e(aVar, C9625a.d.f72418a) || C17542s.e(aVar, C9625a.e.f72419a) || C17542s.e(aVar, C9625a.f.f72420a)) {
                    return null;
                }
                throw new XH.t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$E", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class E extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f73928a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public E(N.a aVar, v vVar) {
            super(aVar);
            this.f73928a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f73928a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to fetch cart", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f73928a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$fetchCart$3", f = "CartViewModel.kt", l = {661}, m = "invokeSuspend")
    static final class F extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73929c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        F(v vVar, C17164e<? super F> eVar) {
            super(2, eVar);
            this.f73930d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new F(this.f73930d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((F) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73929c;
            if (i10 == 0) {
                y.b(obj);
                h L10 = this.f73930d.f73884o;
                this.f73929c = 1;
                obj = L10.h(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f73930d.e1(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g gVar = (g) obj;
            this.f73930d.e1(false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$fetchFamilyRewards$1", f = "CartViewModel.kt", l = {1516}, m = "invokeSuspend")
    static final class G extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        G(v vVar, C17164e<? super G> eVar) {
            super(2, eVar);
            this.f73932d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new G(this.f73932d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((G) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73931c;
            if (i10 == 0) {
                y.b(obj);
                C9626b O10 = this.f73932d.f73839D;
                this.f73931c = 1;
                if (O10.a(this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg/q$d$a;", "googlePayButton", "", "clicked", "<anonymous>", "(Lhg/q$d$a;Z)Lhg/q$d$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$googlePayButtonState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class H extends kotlin.coroutines.jvm.internal.l implements nI.q<q.d.a, Boolean, C17164e<? super q.d.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73933c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73934d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f73935e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f73936f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H(v vVar, C17164e<? super H> eVar) {
            super(3, eVar);
            this.f73936f = vVar;
        }

        public final Object i(q.d.a aVar, boolean z10, C17164e<? super q.d.a> eVar) {
            H h10 = new H(this.f73936f, eVar);
            h10.f73934d = aVar;
            h10.f73935e = z10;
            return h10.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((q.d.a) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73933c == 0) {
                y.b(obj);
                boolean z10 = this.f73935e;
                return this.f73936f.w0((q.d.a) this.f73934d, z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isFullScreenLoading", "showProgress", "isUpdatingCart", "availabilityLoading", "Lhg/v$g;", "<anonymous>", "(ZZZZ)Lhg/v$g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$loading$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class I extends kotlin.coroutines.jvm.internal.l implements nI.s<Boolean, Boolean, Boolean, Boolean, C17164e<? super C9810g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73937c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73938d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73939e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f73940f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f73941g;

        I(C17164e<? super I> eVar) {
            super(5, eVar);
        }

        public final Object i(Boolean bool, Boolean bool2, boolean z10, Boolean bool3, C17164e<? super C9810g> eVar) {
            I i10 = new I(eVar);
            i10.f73938d = bool;
            i10.f73939e = bool2;
            i10.f73940f = z10;
            i10.f73941g = bool3;
            return i10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73937c == 0) {
                y.b(obj);
                boolean z10 = this.f73940f;
                return C9810g.Companion.a((Boolean) this.f73938d, (Boolean) this.f73939e, kotlin.coroutines.jvm.internal.b.a(z10), (Boolean) this.f73941g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((Boolean) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), (Boolean) obj4, (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$J", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class J extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f73942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f73943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73944c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f73945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public J(N.a aVar, v vVar, String str, String str2, int i10) {
            super(aVar);
            this.f73942a = vVar;
            this.f73943b = str;
            this.f73944c = str2;
            this.f73945d = i10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f73942a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Failed to delete item from cart, remove item from list", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f73942a.n0(this.f73943b, this.f73944c, this.f73945d);
            this.f73942a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$moveItemToList$2", f = "CartViewModel.kt", l = {733}, m = "invokeSuspend")
    static final class K extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73946c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73947d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f73948e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73949f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f73950g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        K(v vVar, String str, String str2, String str3, C17164e<? super K> eVar) {
            super(2, eVar);
            this.f73947d = vVar;
            this.f73948e = str;
            this.f73949f = str2;
            this.f73950g = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new K(this.f73947d, this.f73948e, this.f73949f, this.f73950g, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((K) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73946c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = this.f73947d;
                String str = this.f73948e;
                String str2 = this.f73949f;
                L l10 = new L(this.f73950g, this.f73948e);
                k kVar = k.OVERFLOW;
                this.f73946c = 1;
                if (vVar.u0(str, str2, l10, kVar, "cart_unavailable_item", this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg/q$b;", "bottomSheet", "Lhg/q$f;", "navigation", "Lhg/v$h;", "<anonymous>", "(Lhg/q$b;Lhg/q$f;)Lhg/v$h;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$navigationUiState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class L extends kotlin.coroutines.jvm.internal.l implements nI.q<q.b, q.f, C17164e<? super C9811h>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73951c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73952d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73953e;

        L(C17164e<? super L> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(q.b bVar, q.f fVar, C17164e<? super C9811h> eVar) {
            L l10 = new L(eVar);
            l10.f73952d = bVar;
            l10.f73953e = fVar;
            return l10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73951c == 0) {
                y.b(obj);
                return new C9811h((q.b) this.f73952d, (q.f) this.f73953e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$onAction$2", f = "CartViewModel.kt", l = {625}, m = "invokeSuspend")
    static final class M extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73955d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9804a f73956e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        M(v vVar, C9804a aVar, C17164e<? super M> eVar) {
            super(2, eVar);
            this.f73955d = vVar;
            this.f73956e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new M(this.f73955d, this.f73956e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((M) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73954c;
            if (i10 == 0) {
                y.b(obj);
                C16504A U10 = this.f73955d.f73874U0;
                C15035a a10 = ((C9804a.c.C1312c) this.f73956e).a();
                this.f73954c = 1;
                if (U10.emit(a10, this) == f10) {
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
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$onAction$3", f = "CartViewModel.kt", l = {631}, m = "invokeSuspend")
    static final class N extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        N(v vVar, C17164e<? super N> eVar) {
            super(2, eVar);
            this.f73958d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new N(this.f73958d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((N) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73957c;
            if (i10 == 0) {
                y.b(obj);
                C16504A U10 = this.f73958d.f73874U0;
                this.f73957c = 1;
                if (U10.emit(null, this) == f10) {
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$O", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class O extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f73959a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public O(N.a aVar, v vVar) {
            super(aVar);
            this.f73959a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f73959a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to clear cart", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f73959a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$onItemsMovedToList$3", f = "CartViewModel.kt", l = {792}, m = "invokeSuspend")
    static final class P extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73960c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f73961d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f73962e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        P(v vVar, String str, C17164e<? super P> eVar) {
            super(2, eVar);
            this.f73961d = vVar;
            this.f73962e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new P(this.f73961d, this.f73962e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((P) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73960c;
            if (i10 == 0) {
                y.b(obj);
                h L10 = this.f73961d.f73884o;
                this.f73960c = 1;
                if (L10.c(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.s0(this.f73961d, C13026h.b(C11849b.f102266a, this.f73962e), (J0) null, (K.b.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$Q", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Q extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f73963a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Q(N.a aVar, v vVar) {
            super(aVar);
            this.f73963a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            v vVar = this.f73963a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to share list", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            C16505B Q10 = this.f73963a.f73851J;
            do {
                value = Q10.getValue();
                K k10 = (K) value;
            } while (!Q10.e(value, new K.b(C13026h.a(Oo.b.f84812v3), J0.Long, (K.b.a) null, 4, (DefaultConstructorMarker) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$shareCart$3", f = "CartViewModel.kt", l = {900}, m = "invokeSuspend")
    static final class R extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f73964c;

        /* renamed from: d  reason: collision with root package name */
        Object f73965d;

        /* renamed from: e  reason: collision with root package name */
        Object f73966e;

        /* renamed from: f  reason: collision with root package name */
        Object f73967f;

        /* renamed from: g  reason: collision with root package name */
        Object f73968g;

        /* renamed from: h  reason: collision with root package name */
        Object f73969h;

        /* renamed from: i  reason: collision with root package name */
        int f73970i;

        /* renamed from: j  reason: collision with root package name */
        int f73971j;

        /* renamed from: k  reason: collision with root package name */
        int f73972k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ v f73973l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f73974m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        R(v vVar, String str, C17164e<? super R> eVar) {
            super(2, eVar);
            this.f73973l = vVar;
            this.f73974m = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new R(this.f73973l, this.f73974m, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((R) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            List<d> list;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f73972k;
            if (i10 == 0) {
                y.b(obj);
                g value3 = this.f73973l.f73884o.m().getValue();
                if (value3 == null || (list = value3.d()) == null) {
                    list = C16877v.n();
                }
                Iterable iterable = list;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    arrayList.add(new C12859a.C2618a(dVar.j(), dVar.k(), dVar.l()));
                }
                C12609a T10 = this.f73973l.f73887r;
                String str = this.f73974m;
                C12683b bVar = C12683b.CART;
                this.f73964c = list;
                this.f73965d = arrayList;
                this.f73966e = iterable;
                this.f73967f = iterable;
                this.f73968g = arrayList;
                this.f73969h = it;
                this.f73970i = 0;
                this.f73971j = 0;
                this.f73972k = 1;
                obj2 = T10.b(str, arrayList, bVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Iterator it2 = (Iterator) this.f73969h;
                Collection collection = (Collection) this.f73968g;
                Iterable iterable2 = (Iterable) this.f73967f;
                Iterable iterable3 = (Iterable) this.f73966e;
                List list2 = (List) this.f73965d;
                List list3 = (List) this.f73964c;
                try {
                    y.b(obj);
                    obj2 = ((XH.x) obj).j();
                } catch (Throwable th2) {
                    C16505B V10 = this.f73973l.f73845G;
                    do {
                        value2 = V10.getValue();
                        Boolean bool = (Boolean) value2;
                    } while (!V10.e(value2, kotlin.coroutines.jvm.internal.b.a(false)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.b(obj2);
            this.f73973l.f73853K.setValue(new q.f.a.C1304a(new g.b((String) obj2, this.f73974m, true)));
            C16505B V11 = this.f73973l.f73845G;
            do {
                value = V11.getValue();
                Boolean bool2 = (Boolean) value;
            } while (!V11.e(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class S implements C16532g<C9807d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f73975a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f73976c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f73976c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f73976c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$combine$1$3", f = "CartViewModel.kt", l = {238}, m = "invokeSuspend")
        public static final class b extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C9807d>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f73977c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f73978d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f73979e;

            public b(C17164e eVar) {
                super(3, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super C9807d> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar);
                bVar.f73978d = hVar;
                bVar.f73979e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
                r4 = r6.b();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f73977c
                    r3 = 1
                    if (r2 == 0) goto L_0x001a
                    if (r2 != r3) goto L_0x0012
                    XH.y.b(r18)
                    goto L_0x00c5
                L_0x0012:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x001a:
                    XH.y.b(r18)
                    java.lang.Object r2 = r0.f73978d
                    TJ.h r2 = (TJ.C16533h) r2
                    java.lang.Object r4 = r0.f73979e
                    java.lang.Object[] r4 = (java.lang.Object[]) r4
                    r5 = 0
                    r6 = r4[r5]
                    r7 = r4[r3]
                    r8 = 2
                    r8 = r4[r8]
                    r9 = 3
                    r9 = r4[r9]
                    r10 = 4
                    r10 = r4[r10]
                    r11 = 5
                    r4 = r4[r11]
                    r13 = r4
                    Of.y r13 = (Of.C9227y) r13
                    ig.s$a r10 = (ig.s.a) r10
                    r15 = r9
                    Tf.t r15 = (Tf.t) r15
                    r14 = r8
                    hg.q$g r14 = (hg.q.g) r14
                    r12 = r7
                    ag.k r12 = (ag.k) r12
                    Ln.g r6 = (Ln.g) r6
                    if (r6 == 0) goto L_0x0053
                    Ln.a r4 = r6.b()
                    if (r4 == 0) goto L_0x0053
                    boolean r4 = r4.b()
                    goto L_0x0054
                L_0x0053:
                    r4 = r5
                L_0x0054:
                    if (r10 == 0) goto L_0x0061
                    com.ingka.ikea.mcomsettings.MComConfig$e r7 = r10.d()
                    if (r7 == 0) goto L_0x0061
                    boolean r7 = r7.b()
                    goto L_0x0062
                L_0x0061:
                    r7 = r5
                L_0x0062:
                    if (r7 == 0) goto L_0x0068
                    if (r4 == 0) goto L_0x0068
                    r4 = r3
                    goto L_0x0069
                L_0x0068:
                    r4 = r5
                L_0x0069:
                    if (r4 == 0) goto L_0x00b4
                    Md.b r4 = new Md.b
                    if (r6 == 0) goto L_0x0079
                    Ln.a r6 = r6.b()
                    if (r6 == 0) goto L_0x0079
                    boolean r5 = r6.a()
                L_0x0079:
                    java.lang.String r6 = ""
                    if (r10 == 0) goto L_0x008f
                    com.ingka.ikea.mcomsettings.MComConfig$e r7 = r10.d()
                    if (r7 == 0) goto L_0x008f
                    com.ingka.ikea.mcomsettings.MComConfig$e$a r7 = r7.a()
                    if (r7 == 0) goto L_0x008f
                    java.lang.String r7 = r7.b()
                    if (r7 != 0) goto L_0x0090
                L_0x008f:
                    r7 = r6
                L_0x0090:
                    IC.e r7 = IC.C13026h.c(r7)
                    if (r10 == 0) goto L_0x00aa
                    com.ingka.ikea.mcomsettings.MComConfig$e r8 = r10.d()
                    if (r8 == 0) goto L_0x00aa
                    com.ingka.ikea.mcomsettings.MComConfig$e$a r8 = r8.a()
                    if (r8 == 0) goto L_0x00aa
                    java.lang.String r8 = r8.a()
                    if (r8 != 0) goto L_0x00a9
                    goto L_0x00aa
                L_0x00a9:
                    r6 = r8
                L_0x00aa:
                    IC.e r6 = IC.C13026h.c(r6)
                    r4.<init>(r5, r7, r6)
                L_0x00b1:
                    r16 = r4
                    goto L_0x00b6
                L_0x00b4:
                    r4 = 0
                    goto L_0x00b1
                L_0x00b6:
                    hg.v$d r4 = new hg.v$d
                    r11 = r4
                    r11.<init>(r12, r13, r14, r15, r16)
                    r0.f73977c = r3
                    java.lang.Object r2 = r2.emit(r4, r0)
                    if (r2 != r1) goto L_0x00c5
                    return r1
                L_0x00c5:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.v.S.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public S(C16532g[] gVarArr) {
            this.f73975a = gVarArr;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f73975a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new b((C17164e) null), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class T implements C16532g<C9806c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f73980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f73981b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f73982c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f73982c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f73982c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$combine$2$3", f = "CartViewModel.kt", l = {238}, m = "invokeSuspend")
        public static final class b extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C9806c>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f73983c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f73984d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f73985e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v f73986f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, v vVar) {
                super(3, eVar);
                this.f73986f = vVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super C9806c> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f73986f);
                bVar.f73984d = hVar;
                bVar.f73985e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object value;
                List<d> n10;
                Object f10 = C17187b.f();
                int i10 = this.f73983c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f73984d;
                    Object[] objArr = (Object[]) this.f73985e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    String str = (String) objArr[6];
                    C10243d dVar = (C10243d) obj7;
                    Set set = (Set) obj6;
                    Map map = (Map) obj5;
                    m mVar = (m) obj4;
                    l lVar = (l) obj3;
                    Ln.g gVar = (Ln.g) obj2;
                    C16505B I10 = this.f73986f.f73849I;
                    do {
                        value = I10.getValue();
                        Boolean bool = (Boolean) value;
                    } while (!I10.e(value, kotlin.coroutines.jvm.internal.b.a(lVar instanceof l.b)));
                    if (gVar == null || (n10 = gVar.d()) == null) {
                        n10 = C16877v.n();
                    }
                    C9806c cVar = new C9806c(gVar, mVar, this.f73986f.D0(n10, str, set, map, dVar));
                    this.f73983c = 1;
                    if (hVar.emit(cVar, this) == f10) {
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

        public T(C16532g[] gVarArr, v vVar) {
            this.f73980a = gVarArr;
            this.f73981b = vVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f73980a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new b((C17164e) null, this.f73981b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class U implements C16532g<q.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f73987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f73988b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f73989c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f73989c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f73989c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$combine$3$3", f = "CartViewModel.kt", l = {238}, m = "invokeSuspend")
        public static final class b extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super q.c.a>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f73990c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f73991d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f73992e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v f73993f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, v vVar) {
                super(3, eVar);
                this.f73993f = vVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super q.c.a> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f73993f);
                bVar.f73991d = hVar;
                bVar.f73992e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                List list;
                List<d> d10;
                Object f10 = C17187b.f();
                int i10 = this.f73990c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f73991d;
                    Object[] objArr = (Object[]) this.f73992e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    q.b.C1292b.a aVar = (q.b.C1292b.a) objArr[6];
                    q.d dVar = (q.d) obj7;
                    C9808e eVar = (C9808e) obj6;
                    C9807d dVar2 = (C9807d) obj5;
                    UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) obj4;
                    C9810g gVar = (C9810g) obj3;
                    C9806c cVar = (C9806c) obj2;
                    Ln.g value = this.f73993f.f73884o.m().getValue();
                    if (value == null || (d10 = value.d()) == null) {
                        list = null;
                    } else {
                        Iterable<d> iterable = d10;
                        list = new ArrayList(C16877v.y(iterable, 10));
                        for (d dVar3 : iterable) {
                            list.add(new Kf.y(dVar3.j(), dVar3.l()));
                        }
                    }
                    if (list == null) {
                        list = C16877v.n();
                    }
                    q.c.a.C1296a H10 = this.f73993f.A0(aVar, C15985a.h(list));
                    Qf.a B02 = this.f73993f.B0();
                    List<n> b10 = cVar.b();
                    m a10 = cVar.a();
                    q.g e10 = dVar2.e();
                    ag.k c10 = dVar2.c();
                    C9227y d11 = dVar2.d();
                    C13302d c11 = eVar.c();
                    q.a b11 = eVar.b();
                    t b12 = dVar2.b();
                    Md.b a11 = dVar2.a();
                    q.c.a aVar2 = new q.c.a(H10, gVar, this.f73993f.f73890u.isLoggedIn(), userPostalCodeAddress, B02, b10, a10, c10, eVar.a(), e10, b12, a11, c11, b11, dVar, d11);
                    this.f73990c = 1;
                    if (hVar.emit(aVar2, this) == f10) {
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

        public U(C16532g[] gVarArr, v vVar) {
            this.f73987a = gVarArr;
            this.f73988b = vVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f73987a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new b((C17164e) null, this.f73988b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$flatMapLatest$1", f = "CartViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class V extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super q.c>, Ln.g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73994c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f73995d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73996e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f73997f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public V(C17164e eVar, v vVar) {
            super(3, eVar);
            this.f73997f = vVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super q.c> hVar, Ln.g gVar, C17164e<? super C16807N> eVar) {
            V v10 = new V(eVar, this.f73997f);
            v10.f73995d = hVar;
            v10.f73996e = gVar;
            return v10.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73994c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f73995d;
                Ln.g gVar = (Ln.g) this.f73996e;
                Collection d10 = gVar != null ? gVar.d() : null;
                C16509F N10 = (d10 == null || d10.isEmpty()) ? this.f73997f.f73868R0 : this.f73997f.f73870S0;
                this.f73994c = 1;
                if (C16534i.x(hVar, N10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class W implements C16532g<C13302d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f73998a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f73999a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$map$1$2", f = "CartViewModel.kt", l = {50}, m = "emit")
            /* renamed from: hg.v$W$a$a  reason: collision with other inner class name */
            public static final class C1306a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74000c;

                /* renamed from: d  reason: collision with root package name */
                int f74001d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74002e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1306a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74002e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74000c = obj;
                    this.f74001d |= Integer.MIN_VALUE;
                    return this.f74002e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f73999a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r13, dI.C17164e r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof hg.v.W.a.C1306a
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    hg.v$W$a$a r0 = (hg.v.W.a.C1306a) r0
                    int r1 = r0.f74001d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74001d = r1
                    goto L_0x0018
                L_0x0013:
                    hg.v$W$a$a r0 = new hg.v$W$a$a
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.f74000c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74001d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r14)
                    goto L_0x009e
                L_0x002a:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0032:
                    XH.y.b(r14)
                    TJ.h r14 = r12.f73999a
                    ig.s$a r13 = (ig.s.a) r13
                    r2 = 0
                    if (r13 == 0) goto L_0x0070
                    java.util.List r13 = r13.b()
                    if (r13 == 0) goto L_0x0070
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r13, r5)
                    r4.<init>(r5)
                    java.util.Iterator r13 = r13.iterator()
                L_0x0053:
                    boolean r5 = r13.hasNext()
                    if (r5 == 0) goto L_0x0071
                    java.lang.Object r5 = r13.next()
                    com.ingka.ikea.mcomsettings.MComConfig$a r5 = (com.ingka.ikea.mcomsettings.MComConfig.a) r5
                    OC.d$a r6 = new OC.d$a
                    java.lang.String r7 = r5.b()
                    java.lang.String r5 = r5.a()
                    r6.<init>(r7, r5)
                    r4.add(r6)
                    goto L_0x0053
                L_0x0070:
                    r4 = r2
                L_0x0071:
                    if (r4 == 0) goto L_0x007c
                    boolean r13 = r4.isEmpty()
                    if (r13 == 0) goto L_0x007a
                    goto L_0x007c
                L_0x007a:
                    r13 = 0
                    goto L_0x007d
                L_0x007c:
                    r13 = r3
                L_0x007d:
                    if (r13 != 0) goto L_0x0081
                    r9 = r4
                    goto L_0x0082
                L_0x0081:
                    r9 = r2
                L_0x0082:
                    if (r9 == 0) goto L_0x0095
                    int r13 = rv.C11849b.f102166B
                    IC.e r8 = IC.C13026h.a(r13)
                    OC.d r2 = new OC.d
                    r10 = 2
                    r11 = 0
                    java.lang.String r6 = "AVAILABLE_PAYMENT_OPTIONS_ID"
                    r7 = 0
                    r5 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                L_0x0095:
                    r0.f74001d = r3
                    java.lang.Object r13 = r14.emit(r2, r0)
                    if (r13 != r1) goto L_0x009e
                    return r1
                L_0x009e:
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.v.W.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public W(C16532g gVar) {
            this.f73998a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f73998a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class X implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74003a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74004a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$special$$inlined$map$2$2", f = "CartViewModel.kt", l = {50}, m = "emit")
            /* renamed from: hg.v$X$a$a  reason: collision with other inner class name */
            public static final class C1307a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74005c;

                /* renamed from: d  reason: collision with root package name */
                int f74006d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74007e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1307a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74007e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74005c = obj;
                    this.f74006d |= Integer.MIN_VALUE;
                    return this.f74007e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74004a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hg.v.X.a.C1307a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    hg.v$X$a$a r0 = (hg.v.X.a.C1307a) r0
                    int r1 = r0.f74006d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74006d = r1
                    goto L_0x0018
                L_0x0013:
                    hg.v$X$a$a r0 = new hg.v$X$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74005c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74006d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f74004a
                    com.ingka.ikea.app.base.UserPostalCodeAddress r5 = (com.ingka.ikea.app.base.UserPostalCodeAddress) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.d()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f74006d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.v.X.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public X(C16532g gVar) {
            this.f74003a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74003a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "Lig/s$a;", "config", "Lhg/q$e;", "<anonymous>", "(ILig/s$a;)Lhg/q$e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$surveyUiState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    static final class Y extends kotlin.coroutines.jvm.internal.l implements nI.q<Integer, s.a, C17164e<? super q.e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74008c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74009d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f74010e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Y(v vVar, C17164e<? super Y> eVar) {
            super(3, eVar);
            this.f74010e = vVar;
        }

        public final Object i(int i10, s.a aVar, C17164e<? super q.e> eVar) {
            Y y10 = new Y(this.f74010e, eVar);
            y10.f74009d = aVar;
            return y10.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Number) obj).intValue(), (s.a) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74008c == 0) {
                y.b(obj);
                s.a aVar = (s.a) this.f74009d;
                return this.f74010e.z0(aVar != null ? aVar.a() : null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$Z", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Z extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74011a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Z(N.a aVar, v vVar) {
            super(aVar);
            this.f74011a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74011a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Error updating employee discount agreed terms", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f74011a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lhg/v$a;", "", "<init>", "()V", "a", "b", "c", "Lhg/v$a$a;", "Lhg/v$a$b;", "Lhg/v$a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$a  reason: case insensitive filesystem */
    public static abstract class C9804a {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhg/v$a$a;", "Lhg/v$a;", "<init>", "()V", "b", "a", "Lhg/v$a$a$a;", "Lhg/v$a$a$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.v$a$a  reason: collision with other inner class name */
        public static abstract class C1308a extends C9804a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$a$a;", "Lhg/v$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$a$a  reason: collision with other inner class name */
            public static final class C1309a extends C1308a {

                /* renamed from: a  reason: collision with root package name */
                public static final C1309a f74012a = new C1309a();

                private C1309a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1309a);
                }

                public int hashCode() {
                    return 1304856026;
                }

                public String toString() {
                    return "ChangePostalCode";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$a$b;", "Lhg/v$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$a$b */
            public static final class b extends C1308a {

                /* renamed from: a  reason: collision with root package name */
                public static final b f74013a = new b();

                private b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 1997024317;
                }

                public String toString() {
                    return "InvalidPostalCode";
                }
            }

            public /* synthetic */ C1308a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1308a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lhg/v$a$b;", "Lhg/v$a;", "<init>", "()V", "a", "Lhg/v$a$b$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.v$a$b */
        public static abstract class b extends C9804a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$b$a;", "Lhg/v$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$b$a  reason: collision with other inner class name */
            public static final class C1310a extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final C1310a f74014a = new C1310a();

                private C1310a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1310a);
                }

                public int hashCode() {
                    return 727206942;
                }

                public String toString() {
                    return "NavigationHandled";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lhg/v$a$c;", "Lhg/v$a;", "<init>", "()V", "b", "a", "e", "f", "c", "d", "Lhg/v$a$c$a;", "Lhg/v$a$c$b;", "Lhg/v$a$c$c;", "Lhg/v$a$c$d;", "Lhg/v$a$c$e;", "Lhg/v$a$c$f;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.v$a$c */
        public static abstract class c extends C9804a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$c$a;", "Lhg/v$a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$a  reason: collision with other inner class name */
            public static final class C1311a extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final C1311a f74015a = new C1311a();

                private C1311a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1311a);
                }

                public int hashCode() {
                    return 906761746;
                }

                public String toString() {
                    return "BottomSheetDismissed";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$c$b;", "Lhg/v$a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$b */
            public static final class b extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final b f74016a = new b();

                private b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 1253650147;
                }

                public String toString() {
                    return "GooglePayButtonClicked";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/v$a$c$c;", "Lhg/v$a$c;", "LsB/a;", "adjustListItemAction", "<init>", "(LsB/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LsB/a;", "()LsB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$c  reason: collision with other inner class name */
            public static final class C1312c extends c {

                /* renamed from: a  reason: collision with root package name */
                private final C15035a f74017a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1312c(C15035a aVar) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(aVar, "adjustListItemAction");
                    this.f74017a = aVar;
                }

                public final C15035a a() {
                    return this.f74017a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1312c) && C17542s.e(this.f74017a, ((C1312c) obj).f74017a);
                }

                public int hashCode() {
                    return this.f74017a.hashCode();
                }

                public String toString() {
                    C15035a aVar = this.f74017a;
                    return "ShoppingListModified(adjustListItemAction=" + aVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg/v$a$c$d;", "Lhg/v$a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$d */
            public static final class d extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final d f74018a = new d();

                private d() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1647258604;
                }

                public String toString() {
                    return "ShoppingListModifiedConsumed";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhg/v$a$c$e;", "Lhg/v$a$c;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$e */
            public static final class e extends c {

                /* renamed from: a  reason: collision with root package name */
                private final String f74019a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public e(String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "itemNo");
                    this.f74019a = str;
                }

                public final String a() {
                    return this.f74019a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && C17542s.e(this.f74019a, ((e) obj).f74019a);
                }

                public int hashCode() {
                    return this.f74019a.hashCode();
                }

                public String toString() {
                    String str = this.f74019a;
                    return "ShowMaterialsSheet(itemNo=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/v$a$c$f;", "Lhg/v$a$c;", "Lhg/q$b$b$a;", "uiState", "<init>", "(Lhg/q$b$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg/q$b$b$a;", "()Lhg/q$b$b$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.v$a$c$f */
            public static final class f extends c {

                /* renamed from: a  reason: collision with root package name */
                private final q.b.C1292b.a f74020a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public f(q.b.C1292b.a aVar) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(aVar, "uiState");
                    this.f74020a = aVar;
                }

                public final q.b.C1292b.a a() {
                    return this.f74020a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && C17542s.e(this.f74020a, ((f) obj).f74020a);
                }

                public int hashCode() {
                    return this.f74020a.hashCode();
                }

                public String toString() {
                    q.b.C1292b.a aVar = this.f74020a;
                    return "ShowRemoteSales(uiState=" + aVar + ")";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C9804a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9804a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$updateEmployeeDiscountAgreedTerms$2", f = "CartViewModel.kt", l = {1285, 1289}, m = "invokeSuspend")
    static final class a0 extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74021c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f74022d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f74023e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a0(boolean z10, v vVar, C17164e<? super a0> eVar) {
            super(2, eVar);
            this.f74022d = z10;
            this.f74023e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a0(this.f74022d, this.f74023e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((a0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C13023e a10;
            Object f10 = C17187b.f();
            int i10 = this.f74021c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f74022d) {
                    h L10 = this.f74023e.f73884o;
                    this.f74021c = 1;
                    if (L10.d(this) == f10) {
                        return f10;
                    }
                } else {
                    h L11 = this.f74023e.f73884o;
                    this.f74021c = 2;
                    if (L11.e(this) == f10) {
                        return f10;
                    }
                    a10 = C13026h.a(Oo.b.f84590b1);
                    v.s0(this.f74023e, a10, (J0) null, (K.b.a) null, 6, (Object) null);
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                a10 = C13026h.a(Oo.b.f84590b1);
                v.s0(this.f74023e, a10, (J0) null, (K.b.a) null, 6, (Object) null);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a10 = C13026h.a(C13068a.f111204a);
            v.s0(this.f74023e, a10, (J0) null, (K.b.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lhg/v$b;", "", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "<init>", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "b", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$b  reason: case insensitive filesystem */
    public static final class C9805b {

        /* renamed from: a  reason: collision with root package name */
        private final Interaction$Component f74024a;

        /* renamed from: b  reason: collision with root package name */
        private final String f74025b;

        public C9805b(Interaction$Component interaction$Component, String str) {
            C17542s.j(interaction$Component, "component");
            this.f74024a = interaction$Component;
            this.f74025b = str;
        }

        public final Interaction$Component a() {
            return this.f74024a;
        }

        public final String b() {
            return this.f74025b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9805b)) {
                return false;
            }
            C9805b bVar = (C9805b) obj;
            return this.f74024a == bVar.f74024a && C17542s.e(this.f74025b, bVar.f74025b);
        }

        public int hashCode() {
            int hashCode = this.f74024a.hashCode() * 31;
            String str = this.f74025b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Interaction$Component interaction$Component = this.f74024a;
            String str = this.f74025b;
            return "AddToCartAnalytics(component=" + interaction$Component + ", componentValue=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$b0", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b0 extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74026a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b0(N.a aVar, v vVar) {
            super(aVar);
            this.f74026a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74026a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to update item", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f74026a.L0(th2);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lhg/v$c;", "", "LLn/g;", "cart", "LRC/m;", "cartPriceUi", "", "Lhg/n;", "cartProductUiState", "<init>", "(LLn/g;LRC/m;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/g;", "getCart", "()LLn/g;", "b", "LRC/m;", "()LRC/m;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$c  reason: case insensitive filesystem */
    private static final class C9806c {

        /* renamed from: a  reason: collision with root package name */
        private final Ln.g f74027a;

        /* renamed from: b  reason: collision with root package name */
        private final m f74028b;

        /* renamed from: c  reason: collision with root package name */
        private final List<n> f74029c;

        public C9806c(Ln.g gVar, m mVar, List<? extends n> list) {
            C17542s.j(list, "cartProductUiState");
            this.f74027a = gVar;
            this.f74028b = mVar;
            this.f74029c = list;
        }

        public final m a() {
            return this.f74028b;
        }

        public final List<n> b() {
            return this.f74029c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9806c)) {
                return false;
            }
            C9806c cVar = (C9806c) obj;
            return C17542s.e(this.f74027a, cVar.f74027a) && C17542s.e(this.f74028b, cVar.f74028b) && C17542s.e(this.f74029c, cVar.f74029c);
        }

        public int hashCode() {
            Ln.g gVar = this.f74027a;
            int i10 = 0;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            m mVar = this.f74028b;
            if (mVar != null) {
                i10 = mVar.hashCode();
            }
            return ((hashCode + i10) * 31) + this.f74029c.hashCode();
        }

        public String toString() {
            Ln.g gVar = this.f74027a;
            m mVar = this.f74028b;
            List<n> list = this.f74029c;
            return "CartDataUiState(cart=" + gVar + ", cartPriceUi=" + mVar + ", cartProductUiState=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$updateQuantity$2", f = "CartViewModel.kt", l = {942, 952, 960}, m = "invokeSuspend")
    static final class c0 extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f74030c;

        /* renamed from: d  reason: collision with root package name */
        Object f74031d;

        /* renamed from: e  reason: collision with root package name */
        Object f74032e;

        /* renamed from: f  reason: collision with root package name */
        Object f74033f;

        /* renamed from: g  reason: collision with root package name */
        Object f74034g;

        /* renamed from: h  reason: collision with root package name */
        Object f74035h;

        /* renamed from: i  reason: collision with root package name */
        Object f74036i;

        /* renamed from: j  reason: collision with root package name */
        Object f74037j;

        /* renamed from: k  reason: collision with root package name */
        Object f74038k;

        /* renamed from: l  reason: collision with root package name */
        int f74039l;

        /* renamed from: m  reason: collision with root package name */
        int f74040m;

        /* renamed from: n  reason: collision with root package name */
        int f74041n;

        /* renamed from: o  reason: collision with root package name */
        int f74042o;

        /* renamed from: p  reason: collision with root package name */
        int f74043p;

        /* renamed from: q  reason: collision with root package name */
        int f74044q;

        /* renamed from: r  reason: collision with root package name */
        int f74045r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f74046s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ v f74047t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f74048u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f74049v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ String f74050w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ k f74051x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c0(v vVar, int i10, String str, String str2, k kVar, C17164e<? super c0> eVar) {
            super(2, eVar);
            this.f74047t = vVar;
            this.f74048u = i10;
            this.f74049v = str;
            this.f74050w = str2;
            this.f74051x = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c0 c0Var = new c0(this.f74047t, this.f74048u, this.f74049v, this.f74050w, this.f74051x, eVar);
            c0Var.f74046s = obj;
            return c0Var;
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((c0) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x036d A[Catch:{ all -> 0x004b }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x03e4 A[EDGE_INSN: B:153:0x03e4->B:120:0x03e4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x034f A[Catch:{ all -> 0x004b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                r33 = this;
                r8 = r33
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f74045r
                r2 = 3
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 2
                r13 = 0
                if (r1 == 0) goto L_0x0093
                if (r1 == r11) goto L_0x007b
                if (r1 == r12) goto L_0x0056
                if (r1 != r2) goto L_0x004e
                java.lang.Object r0 = r8.f74037j
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r8.f74036i
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r8.f74035h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f74034g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f74033f
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r8.f74032e
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r8.f74031d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f74030c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r8.f74046s
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r34)     // Catch:{ all -> 0x004b }
                r22 = r4
                r23 = r5
                goto L_0x0336
            L_0x004b:
                r0 = move-exception
                goto L_0x0412
            L_0x004e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0056:
                java.lang.Object r0 = r8.f74036i
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r8.f74035h
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r8.f74034g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f74033f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.f74032e
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r8.f74031d
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r8.f74030c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r8.f74046s
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r34)     // Catch:{ all -> 0x004b }
                goto L_0x03e4
            L_0x007b:
                java.lang.Object r1 = r8.f74034g
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r1 = r8.f74033f
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r1 = r8.f74031d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r8.f74030c
                TJ.B r1 = (TJ.C16505B) r1
                java.lang.Object r1 = r8.f74046s
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r34)     // Catch:{ all -> 0x004b }
                goto L_0x00e9
            L_0x0093:
                XH.y.b(r34)
                java.lang.Object r1 = r8.f74046s
                QJ.Q r1 = (QJ.Q) r1
                hg.v r15 = r8.f74047t     // Catch:{ all -> 0x004b }
                TJ.B r15 = r15.f73861O     // Catch:{ all -> 0x004b }
                java.lang.String r2 = r8.f74049v     // Catch:{ all -> 0x004b }
                int r9 = r8.f74048u     // Catch:{ all -> 0x004b }
            L_0x00a4:
                java.lang.Object r10 = r15.getValue()     // Catch:{ all -> 0x004b }
                r12 = r10
                java.util.Map r12 = (java.util.Map) r12     // Catch:{ all -> 0x004b }
                hg.v$i r14 = new hg.v$i     // Catch:{ all -> 0x004b }
                r14.<init>(r9, r13)     // Catch:{ all -> 0x004b }
                XH.v r14 = XH.C16796C.a(r2, r14)     // Catch:{ all -> 0x004b }
                java.util.Map r14 = YH.X.r(r12, r14)     // Catch:{ all -> 0x004b }
                boolean r19 = r15.e(r10, r14)     // Catch:{ all -> 0x004b }
                if (r19 == 0) goto L_0x0406
                hg.v r11 = r8.f74047t     // Catch:{ all -> 0x004b }
                hg.o r11 = r11.f73835B     // Catch:{ all -> 0x004b }
                r34 = r14
                long r13 = r11.a()     // Catch:{ all -> 0x004b }
                r8.f74046s = r1     // Catch:{ all -> 0x004b }
                r8.f74030c = r15     // Catch:{ all -> 0x004b }
                r8.f74031d = r2     // Catch:{ all -> 0x004b }
                r8.f74032e = r10     // Catch:{ all -> 0x004b }
                r8.f74033f = r12     // Catch:{ all -> 0x004b }
                r2 = r34
                r8.f74034g = r2     // Catch:{ all -> 0x004b }
                r8.f74039l = r9     // Catch:{ all -> 0x004b }
                r2 = 0
                r8.f74040m = r2     // Catch:{ all -> 0x004b }
                r8.f74041n = r2     // Catch:{ all -> 0x004b }
                r2 = 1
                r8.f74045r = r2     // Catch:{ all -> 0x004b }
                java.lang.Object r2 = QJ.C16297b0.b(r13, r8)     // Catch:{ all -> 0x004b }
                if (r2 != r0) goto L_0x00e9
                return r0
            L_0x00e9:
                hg.v r2 = r8.f74047t     // Catch:{ all -> 0x004b }
                TJ.B r2 = r2.f73861O     // Catch:{ all -> 0x004b }
                java.lang.String r9 = r8.f74049v     // Catch:{ all -> 0x004b }
                int r10 = r8.f74048u     // Catch:{ all -> 0x004b }
            L_0x00f3:
                java.lang.Object r11 = r2.getValue()     // Catch:{ all -> 0x004b }
                r12 = r11
                java.util.Map r12 = (java.util.Map) r12     // Catch:{ all -> 0x004b }
                hg.v$i r13 = new hg.v$i     // Catch:{ all -> 0x004b }
                r14 = 1
                r13.<init>(r10, r14)     // Catch:{ all -> 0x004b }
                XH.v r13 = XH.C16796C.a(r9, r13)     // Catch:{ all -> 0x004b }
                java.util.Map r12 = YH.X.r(r12, r13)     // Catch:{ all -> 0x004b }
                boolean r11 = r2.e(r11, r12)     // Catch:{ all -> 0x004b }
                if (r11 == 0) goto L_0x0400
                java.lang.String r2 = r8.f74049v     // Catch:{ all -> 0x004b }
                int r9 = r8.f74048u     // Catch:{ all -> 0x004b }
                qv.e r15 = qv.e.DEBUG     // Catch:{ all -> 0x004b }
                qv.d r10 = qv.d.f102012a     // Catch:{ all -> 0x004b }
                java.util.List r10 = r10.a()     // Catch:{ all -> 0x004b }
                java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ all -> 0x004b }
                java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x004b }
                r14.<init>()     // Catch:{ all -> 0x004b }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x004b }
            L_0x0125:
                boolean r11 = r10.hasNext()     // Catch:{ all -> 0x004b }
                if (r11 == 0) goto L_0x013d
                java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x004b }
                r12 = r11
                qv.b r12 = (qv.C11819b) r12     // Catch:{ all -> 0x004b }
                r13 = 0
                boolean r12 = r12.b(r15, r13)     // Catch:{ all -> 0x004b }
                if (r12 == 0) goto L_0x0125
                r14.add(r11)     // Catch:{ all -> 0x004b }
                goto L_0x0125
            L_0x013d:
                java.util.Iterator r13 = r14.iterator()     // Catch:{ all -> 0x004b }
                r12 = r14
                r10 = 0
                r11 = 0
            L_0x0144:
                boolean r20 = r13.hasNext()     // Catch:{ all -> 0x004b }
                if (r20 == 0) goto L_0x0207
                java.lang.Object r20 = r13.next()     // Catch:{ all -> 0x004b }
                r12 = r20
                qv.b r12 = (qv.C11819b) r12     // Catch:{ all -> 0x004b }
                r34 = r13
                if (r10 != 0) goto L_0x0188
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
                r13.<init>()     // Catch:{ all -> 0x004b }
                r22 = r4
                java.lang.String r4 = "Update item: "
                r13.append(r4)     // Catch:{ all -> 0x004b }
                r13.append(r2)     // Catch:{ all -> 0x004b }
                java.lang.String r4 = ", quantity: "
                r13.append(r4)     // Catch:{ all -> 0x004b }
                r13.append(r9)     // Catch:{ all -> 0x004b }
                java.lang.String r4 = r13.toString()     // Catch:{ all -> 0x004b }
                r13 = 0
                java.lang.String r4 = qv.C11818a.a(r4, r13)     // Catch:{ all -> 0x004b }
                if (r4 != 0) goto L_0x0183
                r26 = r34
                r23 = r5
                r25 = r14
                r5 = r15
                r12 = r20
                goto L_0x0210
            L_0x0183:
                java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ all -> 0x004b }
                goto L_0x018c
            L_0x0188:
                r22 = r4
                r13 = 0
                r4 = r10
            L_0x018c:
                if (r11 != 0) goto L_0x01dd
                java.lang.Class r10 = r1.getClass()     // Catch:{ all -> 0x004b }
                java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x004b }
                kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ all -> 0x004b }
                r23 = r5
                r24 = r14
                r5 = 0
                r11 = 36
                r13 = 2
                java.lang.String r14 = HJ.C15854t.s1(r10, r11, r5, r13, r5)     // Catch:{ all -> 0x004b }
                r11 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r11, r5, r13, r5)     // Catch:{ all -> 0x004b }
                int r5 = r14.length()     // Catch:{ all -> 0x004b }
                if (r5 != 0) goto L_0x01b2
                goto L_0x01b6
            L_0x01b2:
                java.lang.String r10 = HJ.C15854t.P0(r14, r7)     // Catch:{ all -> 0x004b }
            L_0x01b6:
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004b }
                java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x004b }
                r11 = 1
                boolean r5 = HJ.C15854t.b0(r5, r6, r11)     // Catch:{ all -> 0x004b }
                if (r5 == 0) goto L_0x01c8
                r5 = r23
                goto L_0x01ca
            L_0x01c8:
                r5 = r22
            L_0x01ca:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
                r11.<init>()     // Catch:{ all -> 0x004b }
                r11.append(r5)     // Catch:{ all -> 0x004b }
                r11.append(r3)     // Catch:{ all -> 0x004b }
                r11.append(r10)     // Catch:{ all -> 0x004b }
                java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x004b }
                goto L_0x01e2
            L_0x01dd:
                r23 = r5
                r24 = r14
                r5 = r11
            L_0x01e2:
                r13 = 0
                r10 = r12
                r11 = r15
                r12 = r5
                r14 = r34
                r21 = 0
                r26 = r14
                r25 = r24
                r14 = r21
                r34 = r5
                r5 = r15
                r15 = r4
                r10.a(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x004b }
                r11 = r34
                r10 = r4
                r15 = r5
                r12 = r20
                r4 = r22
                r5 = r23
                r14 = r25
                r13 = r26
                goto L_0x0144
            L_0x0207:
                r22 = r4
                r23 = r5
                r26 = r13
                r25 = r14
                r5 = r15
            L_0x0210:
                int r4 = r8.f74048u     // Catch:{ all -> 0x004b }
                if (r4 != 0) goto L_0x02f7
                qv.e r2 = qv.e.DEBUG     // Catch:{ all -> 0x004b }
                qv.d r4 = qv.d.f102012a     // Catch:{ all -> 0x004b }
                java.util.List r4 = r4.a()     // Catch:{ all -> 0x004b }
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x004b }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x004b }
                r5.<init>()     // Catch:{ all -> 0x004b }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x004b }
            L_0x0227:
                boolean r9 = r4.hasNext()     // Catch:{ all -> 0x004b }
                if (r9 == 0) goto L_0x023f
                java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x004b }
                r10 = r9
                qv.b r10 = (qv.C11819b) r10     // Catch:{ all -> 0x004b }
                r11 = 0
                boolean r10 = r10.b(r2, r11)     // Catch:{ all -> 0x004b }
                if (r10 == 0) goto L_0x0227
                r5.add(r9)     // Catch:{ all -> 0x004b }
                goto L_0x0227
            L_0x023f:
                java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x004b }
                r11 = r5
                r9 = 0
                r10 = 0
            L_0x0246:
                boolean r12 = r4.hasNext()     // Catch:{ all -> 0x004b }
                if (r12 == 0) goto L_0x02bf
                java.lang.Object r11 = r4.next()     // Catch:{ all -> 0x004b }
                r27 = r11
                qv.b r27 = (qv.C11819b) r27     // Catch:{ all -> 0x004b }
                r12 = 0
                if (r10 != 0) goto L_0x0264
                java.lang.String r13 = "Quantity is 0, delete item"
                java.lang.String r13 = qv.C11818a.a(r13, r12)     // Catch:{ all -> 0x004b }
                if (r13 != 0) goto L_0x0260
                goto L_0x02bf
            L_0x0260:
                java.lang.String r10 = qv.C11820c.a(r13)     // Catch:{ all -> 0x004b }
            L_0x0264:
                if (r9 != 0) goto L_0x02b0
                java.lang.Class r9 = r1.getClass()     // Catch:{ all -> 0x004b }
                java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x004b }
                kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ all -> 0x004b }
                r13 = 36
                r14 = 2
                r15 = 0
                java.lang.String r12 = HJ.C15854t.s1(r9, r13, r15, r14, r15)     // Catch:{ all -> 0x004b }
                r13 = 46
                java.lang.String r12 = HJ.C15854t.o1(r12, r13, r15, r14, r15)     // Catch:{ all -> 0x004b }
                int r13 = r12.length()     // Catch:{ all -> 0x004b }
                if (r13 != 0) goto L_0x0286
                goto L_0x028a
            L_0x0286:
                java.lang.String r9 = HJ.C15854t.P0(r12, r7)     // Catch:{ all -> 0x004b }
            L_0x028a:
                java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004b }
                java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x004b }
                r13 = 1
                boolean r12 = HJ.C15854t.b0(r12, r6, r13)     // Catch:{ all -> 0x004b }
                if (r12 == 0) goto L_0x029c
                r12 = r23
                goto L_0x029e
            L_0x029c:
                r12 = r22
            L_0x029e:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
                r13.<init>()     // Catch:{ all -> 0x004b }
                r13.append(r12)     // Catch:{ all -> 0x004b }
                r13.append(r3)     // Catch:{ all -> 0x004b }
                r13.append(r9)     // Catch:{ all -> 0x004b }
                java.lang.String r9 = r13.toString()     // Catch:{ all -> 0x004b }
            L_0x02b0:
                r30 = 0
                r28 = r2
                r29 = r9
                r12 = 0
                r31 = r12
                r32 = r10
                r27.a(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x004b }
                goto L_0x0246
            L_0x02bf:
                hg.v r3 = r8.f74047t     // Catch:{ all -> 0x004b }
                java.lang.String r6 = r8.f74049v     // Catch:{ all -> 0x004b }
                java.lang.String r7 = r8.f74050w     // Catch:{ all -> 0x004b }
                Ae.k r12 = r8.f74051x     // Catch:{ all -> 0x004b }
                r8.f74046s = r1     // Catch:{ all -> 0x004b }
                r8.f74030c = r1     // Catch:{ all -> 0x004b }
                r8.f74031d = r1     // Catch:{ all -> 0x004b }
                r8.f74032e = r2     // Catch:{ all -> 0x004b }
                r8.f74033f = r10     // Catch:{ all -> 0x004b }
                r8.f74034g = r9     // Catch:{ all -> 0x004b }
                r8.f74035h = r5     // Catch:{ all -> 0x004b }
                r8.f74036i = r4     // Catch:{ all -> 0x004b }
                r8.f74037j = r11     // Catch:{ all -> 0x004b }
                r1 = 0
                r8.f74039l = r1     // Catch:{ all -> 0x004b }
                r8.f74040m = r1     // Catch:{ all -> 0x004b }
                r8.f74041n = r1     // Catch:{ all -> 0x004b }
                r8.f74042o = r1     // Catch:{ all -> 0x004b }
                r8.f74043p = r1     // Catch:{ all -> 0x004b }
                r1 = 2
                r8.f74045r = r1     // Catch:{ all -> 0x004b }
                r4 = 0
                r9 = 0
                r1 = r3
                r2 = r6
                r3 = r7
                r5 = r12
                r6 = r9
                r7 = r33
                java.lang.Object r1 = r1.u0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
                if (r1 != r0) goto L_0x03e4
                return r0
            L_0x02f7:
                hg.v r4 = r8.f74047t     // Catch:{ all -> 0x004b }
                Ln.h r4 = r4.f73884o     // Catch:{ all -> 0x004b }
                Kf.y r13 = new Kf.y     // Catch:{ all -> 0x004b }
                java.lang.String r14 = r8.f74049v     // Catch:{ all -> 0x004b }
                int r15 = r8.f74048u     // Catch:{ all -> 0x004b }
                r13.<init>(r14, r15)     // Catch:{ all -> 0x004b }
                r8.f74046s = r1     // Catch:{ all -> 0x004b }
                r8.f74030c = r1     // Catch:{ all -> 0x004b }
                r8.f74031d = r2     // Catch:{ all -> 0x004b }
                r8.f74032e = r1     // Catch:{ all -> 0x004b }
                r8.f74033f = r5     // Catch:{ all -> 0x004b }
                r8.f74034g = r10     // Catch:{ all -> 0x004b }
                r8.f74035h = r11     // Catch:{ all -> 0x004b }
                r2 = r25
                r8.f74036i = r2     // Catch:{ all -> 0x004b }
                r2 = r26
                r8.f74037j = r2     // Catch:{ all -> 0x004b }
                r8.f74038k = r12     // Catch:{ all -> 0x004b }
                r2 = 0
                r8.f74039l = r2     // Catch:{ all -> 0x004b }
                r8.f74040m = r9     // Catch:{ all -> 0x004b }
                r8.f74041n = r2     // Catch:{ all -> 0x004b }
                r8.f74042o = r2     // Catch:{ all -> 0x004b }
                r8.f74043p = r2     // Catch:{ all -> 0x004b }
                r8.f74044q = r2     // Catch:{ all -> 0x004b }
                r5 = 3
                r8.f74045r = r5     // Catch:{ all -> 0x004b }
                java.lang.Object r2 = r4.n(r13, r8)     // Catch:{ all -> 0x004b }
                if (r2 != r0) goto L_0x0335
                return r0
            L_0x0335:
                r0 = r1
            L_0x0336:
                qv.e r1 = qv.e.DEBUG     // Catch:{ all -> 0x004b }
                qv.d r2 = qv.d.f102012a     // Catch:{ all -> 0x004b }
                java.util.List r2 = r2.a()     // Catch:{ all -> 0x004b }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x004b }
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x004b }
                r4.<init>()     // Catch:{ all -> 0x004b }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x004b }
            L_0x0349:
                boolean r5 = r2.hasNext()     // Catch:{ all -> 0x004b }
                if (r5 == 0) goto L_0x0361
                java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x004b }
                r9 = r5
                qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x004b }
                r11 = 0
                boolean r9 = r9.b(r1, r11)     // Catch:{ all -> 0x004b }
                if (r9 == 0) goto L_0x0349
                r4.add(r5)     // Catch:{ all -> 0x004b }
                goto L_0x0349
            L_0x0361:
                java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x004b }
                r4 = 0
                r5 = 0
            L_0x0367:
                boolean r9 = r2.hasNext()     // Catch:{ all -> 0x004b }
                if (r9 == 0) goto L_0x03e4
                java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x004b }
                qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x004b }
                r13 = 0
                if (r5 != 0) goto L_0x0383
                java.lang.String r5 = "Update item successful"
                java.lang.String r5 = qv.C11818a.a(r5, r13)     // Catch:{ all -> 0x004b }
                if (r5 != 0) goto L_0x037f
                goto L_0x03e4
            L_0x037f:
                java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ all -> 0x004b }
            L_0x0383:
                if (r4 != 0) goto L_0x03d0
                java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x004b }
                java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x004b }
                kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x004b }
                r12 = 0
                r14 = 2
                r15 = 36
                java.lang.String r10 = HJ.C15854t.s1(r4, r15, r12, r14, r12)     // Catch:{ all -> 0x004b }
                r11 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r11, r12, r14, r12)     // Catch:{ all -> 0x004b }
                int r16 = r10.length()     // Catch:{ all -> 0x004b }
                if (r16 != 0) goto L_0x03a5
                goto L_0x03a9
            L_0x03a5:
                java.lang.String r4 = HJ.C15854t.P0(r10, r7)     // Catch:{ all -> 0x004b }
            L_0x03a9:
                java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004b }
                java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x004b }
                r15 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r15)     // Catch:{ all -> 0x004b }
                if (r10 == 0) goto L_0x03bb
                r10 = r23
                goto L_0x03bd
            L_0x03bb:
                r10 = r22
            L_0x03bd:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
                r11.<init>()     // Catch:{ all -> 0x004b }
                r11.append(r10)     // Catch:{ all -> 0x004b }
                r11.append(r3)     // Catch:{ all -> 0x004b }
                r11.append(r4)     // Catch:{ all -> 0x004b }
                java.lang.String r4 = r11.toString()     // Catch:{ all -> 0x004b }
                goto L_0x03d3
            L_0x03d0:
                r12 = 0
                r14 = 2
                r15 = 1
            L_0x03d3:
                r16 = 0
                r10 = r1
                r17 = 46
                r11 = r4
                r18 = r12
                r12 = r16
                r16 = r14
                r14 = r5
                r9.a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x004b }
                goto L_0x0367
            L_0x03e4:
                hg.v r0 = r8.f74047t
                TJ.B r0 = r0.f73861O
                java.lang.String r1 = r8.f74049v
            L_0x03ec:
                java.lang.Object r2 = r0.getValue()
                r3 = r2
                java.util.Map r3 = (java.util.Map) r3
                java.util.Map r3 = YH.X.o(r3, r1)
                boolean r2 = r0.e(r2, r3)
                if (r2 == 0) goto L_0x03ec
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0400:
                r23 = r5
                r17 = 46
                goto L_0x00f3
            L_0x0406:
                r22 = r4
                r23 = r5
                r10 = r15
                r17 = 46
                r15 = r11
                r12 = 2
                r15 = r10
                goto L_0x00a4
            L_0x0412:
                hg.v r1 = r8.f74047t
                TJ.B r1 = r1.f73861O
                java.lang.String r2 = r8.f74049v
            L_0x041a:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                java.util.Map r4 = (java.util.Map) r4
                java.util.Map r4 = YH.X.o(r4, r2)
                boolean r3 = r1.e(r3, r4)
                if (r3 != 0) goto L_0x042c
                goto L_0x041a
            L_0x042c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.v.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001c\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lhg/v$d;", "", "Lag/k;", "familyPromotionBannerUiState", "LOf/y;", "familyRewardsState", "Lhg/q$g;", "upsellUiState", "LTf/t;", "discountUiState", "LMd/b;", "coWorkerDiscountUiState", "<init>", "(Lag/k;LOf/y;Lhg/q$g;LTf/t;LMd/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lag/k;", "c", "()Lag/k;", "b", "LOf/y;", "d", "()LOf/y;", "Lhg/q$g;", "e", "()Lhg/q$g;", "LTf/t;", "()LTf/t;", "LMd/b;", "()LMd/b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$d  reason: case insensitive filesystem */
    private static final class C9807d {

        /* renamed from: a  reason: collision with root package name */
        private final ag.k f74052a;

        /* renamed from: b  reason: collision with root package name */
        private final C9227y f74053b;

        /* renamed from: c  reason: collision with root package name */
        private final q.g f74054c;

        /* renamed from: d  reason: collision with root package name */
        private final t f74055d;

        /* renamed from: e  reason: collision with root package name */
        private final Md.b f74056e;

        public C9807d(ag.k kVar, C9227y yVar, q.g gVar, t tVar, Md.b bVar) {
            this.f74052a = kVar;
            this.f74053b = yVar;
            this.f74054c = gVar;
            this.f74055d = tVar;
            this.f74056e = bVar;
        }

        public final Md.b a() {
            return this.f74056e;
        }

        public final t b() {
            return this.f74055d;
        }

        public final ag.k c() {
            return this.f74052a;
        }

        public final C9227y d() {
            return this.f74053b;
        }

        public final q.g e() {
            return this.f74054c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9807d)) {
                return false;
            }
            C9807d dVar = (C9807d) obj;
            return C17542s.e(this.f74052a, dVar.f74052a) && C17542s.e(this.f74053b, dVar.f74053b) && C17542s.e(this.f74054c, dVar.f74054c) && C17542s.e(this.f74055d, dVar.f74055d) && C17542s.e(this.f74056e, dVar.f74056e);
        }

        public int hashCode() {
            ag.k kVar = this.f74052a;
            int i10 = 0;
            int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            C9227y yVar = this.f74053b;
            int hashCode2 = (hashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
            q.g gVar = this.f74054c;
            int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            t tVar = this.f74055d;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Md.b bVar = this.f74056e;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return hashCode4 + i10;
        }

        public String toString() {
            ag.k kVar = this.f74052a;
            C9227y yVar = this.f74053b;
            q.g gVar = this.f74054c;
            t tVar = this.f74055d;
            Md.b bVar = this.f74056e;
            return "CartPromotionUiState(familyPromotionBannerUiState=" + kVar + ", familyRewardsState=" + yVar + ", upsellUiState=" + gVar + ", discountUiState=" + tVar + ", coWorkerDiscountUiState=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhg/v$e;", "", "LOC/d;", "availablePaymentOptionsUiState", "Lhg/q$a;", "assemblyServicesUiState", "Lhg/q$e;", "abortCheckoutSurveyUiState", "<init>", "(LOC/d;Lhg/q$a;Lhg/q$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOC/d;", "c", "()LOC/d;", "b", "Lhg/q$a;", "()Lhg/q$a;", "Lhg/q$e;", "()Lhg/q$e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$e  reason: case insensitive filesystem */
    private static final class C9808e {

        /* renamed from: a  reason: collision with root package name */
        private final C13302d f74057a;

        /* renamed from: b  reason: collision with root package name */
        private final q.a f74058b;

        /* renamed from: c  reason: collision with root package name */
        private final q.e f74059c;

        public C9808e(C13302d dVar, q.a aVar, q.e eVar) {
            this.f74057a = dVar;
            this.f74058b = aVar;
            this.f74059c = eVar;
        }

        public final q.e a() {
            return this.f74059c;
        }

        public final q.a b() {
            return this.f74058b;
        }

        public final C13302d c() {
            return this.f74057a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9808e)) {
                return false;
            }
            C9808e eVar = (C9808e) obj;
            return C17542s.e(this.f74057a, eVar.f74057a) && C17542s.e(this.f74058b, eVar.f74058b) && C17542s.e(this.f74059c, eVar.f74059c);
        }

        public int hashCode() {
            C13302d dVar = this.f74057a;
            int i10 = 0;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            q.a aVar = this.f74058b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            q.e eVar = this.f74059c;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            C13302d dVar = this.f74057a;
            q.a aVar = this.f74058b;
            q.e eVar = this.f74059c;
            return "CartServicesUiState(availablePaymentOptionsUiState=" + dVar + ", assemblyServicesUiState=" + aVar + ", abortCheckoutSurveyUiState=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhg/v$f;", "", "<init>", "()V", "", "YOU_MAY_ALSO_LIKE_ENTRY_ID", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$f  reason: case insensitive filesystem */
    public static final class C9809f {
        public /* synthetic */ C9809f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9809f() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lhg/v$g;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "FULL", "PROGRESS", "NONE", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$g  reason: case insensitive filesystem */
    public enum C9810g {
        FULL,
        PROGRESS,
        NONE;
        
        public static final a Companion = null;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhg/v$g$a;", "", "<init>", "()V", "", "isFullScreenLoading", "isProgressLoading", "isUpdatingCart", "availabilityLoading", "Lhg/v$g;", "a", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lhg/v$g;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.v$g$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C9810g a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
                Boolean bool5 = Boolean.TRUE;
                return C17542s.e(bool, bool5) ? C9810g.FULL : (C17542s.e(bool2, bool5) || C17542s.e(bool3, bool5) || C17542s.e(bool4, bool5)) ? C9810g.PROGRESS : C9810g.NONE;
            }

            private a() {
            }
        }

        static {
            C9810g[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhg/v$h;", "", "Lhg/q$b;", "bottomSheet", "Lhg/q$f;", "navigation", "<init>", "(Lhg/q$b;Lhg/q$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg/q$b;", "()Lhg/q$b;", "b", "Lhg/q$f;", "()Lhg/q$f;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$h  reason: case insensitive filesystem */
    private static final class C9811h {

        /* renamed from: a  reason: collision with root package name */
        private final q.b f74060a;

        /* renamed from: b  reason: collision with root package name */
        private final q.f f74061b;

        public C9811h(q.b bVar, q.f fVar) {
            this.f74060a = bVar;
            this.f74061b = fVar;
        }

        public final q.b a() {
            return this.f74060a;
        }

        public final q.f b() {
            return this.f74061b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9811h)) {
                return false;
            }
            C9811h hVar = (C9811h) obj;
            return C17542s.e(this.f74060a, hVar.f74060a) && C17542s.e(this.f74061b, hVar.f74061b);
        }

        public int hashCode() {
            q.b bVar = this.f74060a;
            int i10 = 0;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            q.f fVar = this.f74061b;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            q.b bVar = this.f74060a;
            q.f fVar = this.f74061b;
            return "NavigationUiState(bottomSheet=" + bVar + ", navigation=" + fVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhg/v$i;", "", "", "quantity", "", "isUpdating", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$i  reason: case insensitive filesystem */
    private static final class C9812i {

        /* renamed from: a  reason: collision with root package name */
        private final int f74062a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f74063b;

        public C9812i(int i10, boolean z10) {
            this.f74062a = i10;
            this.f74063b = z10;
        }

        public final int a() {
            return this.f74062a;
        }

        public final boolean b() {
            return this.f74063b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9812i)) {
                return false;
            }
            C9812i iVar = (C9812i) obj;
            return this.f74062a == iVar.f74062a && this.f74063b == iVar.f74063b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f74062a) * 31) + Boolean.hashCode(this.f74063b);
        }

        public String toString() {
            int i10 = this.f74062a;
            boolean z10 = this.f74063b;
            return "QuantityState(quantity=" + i10 + ", isUpdating=" + z10 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$j  reason: case insensitive filesystem */
    public /* synthetic */ class C9813j {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f74064a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f74065b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f74066c;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        static {
            /*
                Ln.f$b[] r0 = Ln.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Ln.f$b r2 = Ln.f.b.METER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Ln.f$b r3 = Ln.f.b.PIECE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f74064a = r0
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sf.d r3 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                sf.d r3 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f74065b = r0
                hg.J$a[] r0 = hg.J.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hg.J$a r3 = hg.J.a.LIMITED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                hg.J$a r1 = hg.J.a.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                hg.J$a r1 = hg.J.a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                hg.J$a r1 = hg.J.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                hg.J$a r1 = hg.J.a.NOT_ENABLED     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f74066c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.v.C9813j.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$k", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$k  reason: case insensitive filesystem */
    public static final class C9814k extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f74068b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9814k(N.a aVar, v vVar, String str) {
            super(aVar);
            this.f74067a = vVar;
            this.f74068b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74067a;
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
                    String a10 = C11818a.a("Add to cart failed", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f74067a.f73841E.setValue(new r.a(this.f74068b, th2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$addToCart$3", f = "CartViewModel.kt", l = {1323}, m = "invokeSuspend")
    /* renamed from: hg.v$l  reason: case insensitive filesystem */
    static final class C9815l extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f74070d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Kf.y f74071e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f74072f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9805b f74073g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9815l(v vVar, Kf.y yVar, String str, C9805b bVar, C17164e<? super C9815l> eVar) {
            super(2, eVar);
            this.f74070d = vVar;
            this.f74071e = yVar;
            this.f74072f = str;
            this.f74073g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C9815l(this.f74070d, this.f74071e, this.f74072f, this.f74073g, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C9815l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74069c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = this.f74070d;
                Kf.y yVar = this.f74071e;
                String str = this.f74072f;
                C9805b bVar = this.f74073g;
                this.f74069c = 1;
                if (vVar.t0(yVar, str, bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9805b bVar2 = this.f74073g;
            if (C17542s.e(bVar2 != null ? bVar2.b() : null, "everyday_essentials")) {
                c.a.a(this.f74070d.f73837C, "cart_upsell_add_to_cart", (Map) null, (Map) null, 6, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$m", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$m  reason: case insensitive filesystem */
    public static final class C9816m extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74074a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9816m(N.a aVar, v vVar) {
            super(aVar);
            this.f74074a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74074a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to apply family reward code", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$applyFamilyRewardCode$3", f = "CartViewModel.kt", l = {1528}, m = "invokeSuspend")
    /* renamed from: hg.v$n  reason: case insensitive filesystem */
    static final class C9817n extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f74076d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f74077e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9817n(v vVar, String str, C17164e<? super C9817n> eVar) {
            super(2, eVar);
            this.f74076d = vVar;
            this.f74077e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C9817n(this.f74076d, this.f74077e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C9817n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f74075c;
            if (i10 == 0) {
                y.b(obj);
                h L10 = this.f74076d.f73884o;
                String str = this.f74077e;
                this.f74075c = 1;
                if (L10.f(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B W10 = this.f74076d.f73838C0;
                    do {
                        value2 = W10.getValue();
                        String str2 = (String) value2;
                    } while (!W10.e(value2, null));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B W11 = this.f74076d.f73838C0;
            do {
                value = W11.getValue();
                String str3 = (String) value;
            } while (!W11.e(value, null));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLn/g;", "it", "LXH/N;", "<anonymous>", "(LLn/g;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$cartDataFlow$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.v$o  reason: case insensitive filesystem */
    static final class C9818o extends kotlin.coroutines.jvm.internal.l implements p<Ln.g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74078c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74079d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f74080e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9818o(v vVar, C17164e<? super C9818o> eVar) {
            super(2, eVar);
            this.f74080e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C9818o oVar = new C9818o(this.f74080e, eVar);
            oVar.f74079d = obj;
            return oVar;
        }

        /* renamed from: i */
        public final Object invoke(Ln.g gVar, C17164e<? super C16807N> eVar) {
            return ((C9818o) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74078c == 0) {
                y.b(obj);
                Ln.g gVar = (Ln.g) this.f74079d;
                this.f74080e.b1(gVar);
                this.f74080e.T0(gVar);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LOC/d;", "availablePaymentOptionsUiState", "LVf/a$a;", "assemblyServicesUiState", "Lhg/q$e;", "survey", "LEB/d;", "<unused var>", "Lhg/v$e;", "<anonymous>", "(LOC/d;LVf/a$a;Lhg/q$e;LEB/d;)Lhg/v$e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$cartServicesUiState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.v$p  reason: case insensitive filesystem */
    static final class C9819p extends kotlin.coroutines.jvm.internal.l implements nI.s<C13302d, a.C1122a, q.e, C12832d, C17164e<? super C9808e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74081c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74082d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74083e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f74084f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f74085g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9819p(v vVar, C17164e<? super C9819p> eVar) {
            super(5, eVar);
            this.f74085g = vVar;
        }

        /* renamed from: i */
        public final Object z(C13302d dVar, a.C1122a aVar, q.e eVar, C12832d dVar2, C17164e<? super C9808e> eVar2) {
            C9819p pVar = new C9819p(this.f74085g, eVar2);
            pVar.f74082d = dVar;
            pVar.f74083e = aVar;
            pVar.f74084f = eVar;
            return pVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74081c == 0) {
                y.b(obj);
                C13302d dVar = (C13302d) this.f74082d;
                a.C1122a aVar = (a.C1122a) this.f74083e;
                return new C9808e(dVar, aVar != null ? this.f74085g.l0(aVar) : null, (q.e) this.f74084f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LsB/a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$cartState$1", f = "CartViewModel.kt", l = {534}, m = "invokeSuspend")
    /* renamed from: hg.v$q  reason: case insensitive filesystem */
    static final class C9820q extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super C15035a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74086c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74087d;

        C9820q(C17164e<? super C9820q> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C9820q qVar = new C9820q(eVar);
            qVar.f74087d = obj;
            return qVar;
        }

        public final Object invoke(C16533h<? super C15035a> hVar, C17164e<? super C16807N> eVar) {
            return ((C9820q) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74086c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74087d;
                this.f74087d = hVar;
                this.f74086c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74087d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lhg/q$c;", "content", "Lhg/K;", "message", "Lhg/v$h;", "navigate", "LsB/a;", "listModified", "Lhg/q;", "<anonymous>", "(Lhg/q$c;Lhg/K;Lhg/v$h;LsB/a;)Lhg/q;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$cartState$2", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.v$r  reason: case insensitive filesystem */
    static final class C9821r extends kotlin.coroutines.jvm.internal.l implements nI.s<q.c, K, C9811h, C15035a, C17164e<? super q>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74088c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74089d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74090e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f74091f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f74092g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Ay.b f74093h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9821r(Ay.b bVar, C17164e<? super C9821r> eVar) {
            super(5, eVar);
            this.f74093h = bVar;
        }

        /* renamed from: i */
        public final Object z(q.c cVar, K k10, C9811h hVar, C15035a aVar, C17164e<? super q> eVar) {
            C9821r rVar = new C9821r(this.f74093h, eVar);
            rVar.f74089d = cVar;
            rVar.f74090e = k10;
            rVar.f74091f = hVar;
            rVar.f74092g = aVar;
            return rVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74088c == 0) {
                y.b(obj);
                C9811h hVar = (C9811h) this.f74091f;
                return new q(this.f74093h.a(), (q.c) this.f74089d, (K) this.f74090e, hVar.b(), hVar.a(), (C15035a) this.f74092g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg/q$d;", "checkoutButton", "Lhg/q$d$a;", "googlePayButton", "<anonymous>", "(Lhg/q$d;Lhg/q$d$a;)Lhg/q$d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$checkoutButtonState$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.v$s  reason: case insensitive filesystem */
    static final class C9822s extends kotlin.coroutines.jvm.internal.l implements nI.q<q.d, q.d.a, C17164e<? super q.d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74094c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74095d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74096e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f74097f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9822s(v vVar, C17164e<? super C9822s> eVar) {
            super(3, eVar);
            this.f74097f = vVar;
        }

        /* renamed from: i */
        public final Object invoke(q.d dVar, q.d.a aVar, C17164e<? super q.d> eVar) {
            C9822s sVar = new C9822s(this.f74097f, eVar);
            sVar.f74095d = dVar;
            sVar.f74096e = aVar;
            return sVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74094c == 0) {
                y.b(obj);
                q.d dVar = (q.d) this.f74095d;
                q.d.a aVar = (q.d.a) this.f74096e;
                this.f74097f.f73862O0 = aVar != null ? aVar.c() : null;
                if (dVar != null) {
                    return q.d.b(dVar, false, aVar, 1, (Object) null);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$t", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$t  reason: case insensitive filesystem */
    public static final class C9823t extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74098a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9823t(N.a aVar, v vVar) {
            super(aVar);
            this.f74098a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74098a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to clear cart", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f74098a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$clearCart$3", f = "CartViewModel.kt", l = {773}, m = "invokeSuspend")
    /* renamed from: hg.v$u  reason: case insensitive filesystem */
    static final class C9824u extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74099c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f74100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9824u(v vVar, C17164e<? super C9824u> eVar) {
            super(2, eVar);
            this.f74100d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C9824u(this.f74100d, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C9824u) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74099c;
            if (i10 == 0) {
                y.b(obj);
                h L10 = this.f74100d.f73884o;
                this.f74099c = 1;
                if (L10.c(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.s0(this.f74100d, C13026h.a(C11849b.f102271b), (J0) null, (K.b.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$v", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$v  reason: collision with other inner class name */
    public static final class C1313v extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74101a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1313v(N.a aVar, v vVar) {
            super(aVar);
            this.f74101a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74101a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to clear family reward code", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$clearFamilyRewardCode$3", f = "CartViewModel.kt", l = {1543}, m = "invokeSuspend")
    /* renamed from: hg.v$w  reason: case insensitive filesystem */
    static final class C9825w extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74102c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f74103d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f74104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9825w(v vVar, String str, C17164e<? super C9825w> eVar) {
            super(2, eVar);
            this.f74103d = vVar;
            this.f74104e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C9825w(this.f74103d, this.f74104e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C9825w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f74102c;
            if (i10 == 0) {
                y.b(obj);
                h L10 = this.f74103d.f73884o;
                String str = this.f74104e;
                this.f74102c = 1;
                if (L10.b(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B W10 = this.f74103d.f73838C0;
                    do {
                        value2 = W10.getValue();
                        String str2 = (String) value2;
                    } while (!W10.e(value2, null));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B W11 = this.f74103d.f73838C0;
            do {
                value = W11.getValue();
                String str3 = (String) value;
            } while (!W11.e(value, null));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lig/s$a;", "config", "LXH/N;", "<anonymous>", "(Lig/s$a;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$configFlow$1", f = "CartViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.v$x  reason: case insensitive filesystem */
    static final class C9826x extends kotlin.coroutines.jvm.internal.l implements p<s.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74105c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74106d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f74107e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9826x(v vVar, C17164e<? super C9826x> eVar) {
            super(2, eVar);
            this.f74107e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C9826x xVar = new C9826x(this.f74107e, eVar);
            xVar.f74106d = obj;
            return xVar;
        }

        /* renamed from: i */
        public final Object invoke(s.a aVar, C17164e<? super C16807N> eVar) {
            return ((C9826x) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74105c == 0) {
                y.b(obj);
                s.a aVar = (s.a) this.f74106d;
                if (aVar != null) {
                    this.f74107e.c1(kotlin.coroutines.jvm.internal.b.a(aVar.e()), aVar.d(), kotlin.coroutines.jvm.internal.b.a(aVar.f()));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/v$y", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.v$y  reason: case insensitive filesystem */
    public static final class C9827y extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f74108a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9827y(N.a aVar, v vVar) {
            super(aVar);
            this.f74108a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            v vVar = this.f74108a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to delete cart item", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = vVar.getClass().getName();
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
            this.f74108a.q0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartViewModel$deleteItem$2", f = "CartViewModel.kt", l = {700}, m = "invokeSuspend")
    /* renamed from: hg.v$z  reason: case insensitive filesystem */
    static final class C9828z extends kotlin.coroutines.jvm.internal.l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74109c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f74110d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f74111e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f74112f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f74113g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f74114h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9828z(v vVar, String str, String str2, k kVar, String str3, C17164e<? super C9828z> eVar) {
            super(2, eVar);
            this.f74110d = vVar;
            this.f74111e = str;
            this.f74112f = str2;
            this.f74113g = kVar;
            this.f74114h = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C9828z(this.f74110d, this.f74111e, this.f74112f, this.f74113g, this.f74114h, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C9828z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74109c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = this.f74110d;
                String str = this.f74111e;
                String str2 = this.f74112f;
                k kVar = this.f74113g;
                String str3 = this.f74114h;
                this.f74109c = 1;
                if (vVar.u0(str, str2, (L) null, kVar, str3, this) == f10) {
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

    public v(androidx.lifecycle.U u10, C9133b bVar, h hVar, C14613b bVar2, C14031c cVar, C12609a aVar, Il.a aVar2, C10253a aVar3, C13909a aVar4, b bVar3, C10242c cVar2, Yf.a aVar5, s sVar, C12860a aVar6, C9792a aVar7, e eVar, x xVar, o oVar, Vf.a aVar8, Ay.b bVar4, o oVar2, C9847c cVar3, C9851g gVar, ig.q qVar, C9845a aVar9, C9849e eVar2, ig.k kVar, c cVar4, C9626b bVar5, u uVar) {
        androidx.lifecycle.U u11 = u10;
        C9133b bVar6 = bVar;
        h hVar2 = hVar;
        C14613b bVar7 = bVar2;
        C14031c cVar5 = cVar;
        C12609a aVar10 = aVar;
        Il.a aVar11 = aVar2;
        C10253a aVar12 = aVar3;
        C13909a aVar13 = aVar4;
        b bVar8 = bVar3;
        C10242c cVar6 = cVar2;
        C9792a aVar14 = aVar7;
        e eVar3 = eVar;
        x xVar2 = xVar;
        Ay.b bVar9 = bVar4;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(bVar6, "cartApi");
        C17542s.j(hVar2, "cartRepository");
        C17542s.j(bVar7, "shoppingListRepository");
        C17542s.j(cVar5, "profileRepository");
        C17542s.j(aVar10, "shareRepository");
        C17542s.j(aVar11, "appConfig");
        C17542s.j(aVar12, "killSwitchRepository");
        C17542s.j(aVar13, "sessionManager");
        C17542s.j(bVar8, "cartAnalytics");
        C17542s.j(cVar6, "appUserDataRepository");
        C17542s.j(aVar5, "cartItemHolderMapper");
        C17542s.j(sVar, "getMComConfigUseCase");
        C17542s.j(aVar6, "localStoreSelectionRepository");
        C17542s.j(aVar14, "cartAvailabilityHandler");
        C17542s.j(eVar3, "analytics");
        C17542s.j(xVar2, "cartInteractor");
        C17542s.j(oVar, "getFamilyPromotionBannerUseCase");
        C17542s.j(aVar8, "getAssemblyServicesUseCase");
        C17542s.j(bVar4, "scanAndGoCartIntegration");
        C17542s.j(oVar2, "cartSettings");
        C17542s.j(cVar3, "getCartPriceUiStateUseCase");
        C17542s.j(gVar, "getCheckoutButtonUiStateUseCase");
        C17542s.j(qVar, "getGooglePayButtonUiStateUseCase");
        C17542s.j(aVar9, "getCartItemAvailabilityUseCase");
        C17542s.j(eVar2, "getCartUpsellUseCase");
        C17542s.j(kVar, "getEmptyCartUiStateUseCase");
        C17542s.j(cVar4, "abTesting");
        C17542s.j(bVar5, "getFamilyRewardsUseCase");
        C17542s.j(uVar, "getRemoteSalesUiStateUseCase");
        Ay.b bVar10 = bVar4;
        this.f73882m = u11;
        this.f73883n = bVar6;
        this.f73884o = hVar2;
        this.f73885p = bVar7;
        this.f73886q = cVar5;
        this.f73887r = aVar10;
        this.f73888s = aVar11;
        this.f73889t = aVar12;
        this.f73890u = aVar13;
        this.f73891v = bVar8;
        this.f73892w = cVar6;
        this.f73893x = aVar5;
        this.f73894y = aVar14;
        this.f73896z = eVar3;
        this.f73833A = xVar2;
        this.f73835B = oVar2;
        this.f73837C = cVar4;
        this.f73839D = bVar5;
        C16505B<r> a10 = C16521S.a(null);
        this.f73841E = a10;
        this.f73843F = a10;
        C16505B<Boolean> a11 = C16521S.a(null);
        this.f73845G = a11;
        C16505B<Boolean> a12 = C16521S.a(null);
        this.f73847H = a12;
        C16505B<Boolean> a13 = C16521S.a(null);
        this.f73849I = a13;
        C16505B<K> a14 = C16521S.a(null);
        this.f73851J = a14;
        C16505B<q.f> a15 = C16521S.a(null);
        this.f73853K = a15;
        C16519P<C9810g> c02 = C16534i.c0(C16534i.l(a12, a11, hVar.k(), a13, new I((C17164e<? super I>) null)), g0.a(this), ip.f.a(), null);
        this.f73855L = c02;
        C16532g<Set<String>> f10 = bVar2.f();
        this.f73857M = f10;
        C16505B<List<String>> a16 = C16521S.a(C16877v.n());
        this.f73859N = a16;
        C16505B<Map<String, C9812i>> a17 = C16521S.a(YH.X.j());
        this.f73861O = a17;
        C16532g<Ln.g> R10 = C16534i.R(hVar.m(), new C9818o(this, (C17164e<? super C9818o>) null));
        this.f73871T = R10;
        C16532g<UserPostalCodeAddress> s10 = C16534i.s(cVar2.d());
        this.f73873U = s10;
        C16519P<C12832d> c03 = C16534i.c0(C16534i.s(aVar6.b()), g0.a(this), ip.f.a(), null);
        this.f73877X = c03;
        C16505B<q.b> a18 = C16521S.a(null);
        this.f73879Y = a18;
        C16532g<s.a> R11 = C16534i.R(sVar.invoke(), new C9826x(this, (C17164e<? super C9826x>) null));
        this.f73897z0 = R11;
        C16505B<Integer> a19 = C16521S.a(0);
        this.f73834A0 = a19;
        C16505B<K> b10 = a14;
        C16532g<q.e> n10 = C16534i.n(a19, R11, new Y(this, (C17164e<? super Y>) null));
        this.f73836B0 = n10;
        C16505B<String> a20 = C16521S.a(null);
        this.f73838C0 = a20;
        C16519P<C9810g> p10 = c02;
        C16509F<R> Z10 = C16534i.Z(C16534i.n(bVar5.invoke(), a20, new D((C17164e<? super D>) null)), g0.a(this), ip.f.a(), 1);
        this.f73840D0 = Z10;
        C16532g<t> m10 = C16534i.m(R10, R11, Z10, new A(this, (C17164e<? super A>) null));
        this.f73842E0 = m10;
        W w10 = new W(R11);
        this.f73844F0 = w10;
        C16532g<C9808e> l10 = C16534i.l(w10, aVar8.invoke(), n10, c03, new C9819p(this, (C17164e<? super C9819p>) null));
        this.f73846G0 = l10;
        C16505B<C10243d> a21 = C16521S.a(aVar7.f());
        this.f73848H0 = a21;
        C16532g<C9808e> gVar2 = l10;
        C16509F<q.g> Z11 = C16534i.Z(eVar2.a(a16), g0.a(this), ip.f.a(), 1);
        this.f73850I0 = Z11;
        C16505B<List<String>> b11 = a16;
        S s11 = new S(new C16532g[]{R10, oVar.invoke(), Z11, m10, R11, Z10});
        this.f73852J0 = s11;
        C16509F<l<C9845a.C1326a, Throwable>> Z12 = C16534i.Z(aVar9.invoke(), g0.a(this), ip.f.a(), 1);
        this.f73854K0 = Z12;
        T t10 = new T(new C16532g[]{R10, aVar14.c(Z12), cVar3.invoke(), a17, f10, a21, new X(s10)}, this);
        this.f73856L0 = t10;
        C16505B<Boolean> a22 = C16521S.a(Boolean.FALSE);
        this.f73858M0 = a22;
        C16532g<q.d.a> n11 = C16534i.n(qVar.a(Z12, a21), a22, new H(this, (C17164e<? super H>) null));
        this.f73860N0 = n11;
        C16532g<q.d> n12 = C16534i.n(gVar.invoke(), n11, new C9822s(this, (C17164e<? super C9822s>) null));
        this.f73864P0 = n12;
        C16532g<C9811h> n13 = C16534i.n(a18, a15, new L((C17164e<? super L>) null));
        this.f73866Q0 = n13;
        this.f73868R0 = C16534i.Z(kVar.a(Z11, b11), g0.a(this), ip.f.a(), 1);
        this.f73870S0 = C16534i.Z(new U(new C16532g[]{t10, p10, s10, s11, gVar2, n12, uVar.invoke()}, this), g0.a(this), ip.f.a(), 1);
        C16532g<q.c> g02 = C16534i.g0(R10, new V((C17164e) null, this));
        this.f73872T0 = g02;
        C16504A<C15035a> b12 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f73874U0 = b12;
        this.f73875V0 = C16534i.c0(C16534i.l(g02, b10, n13, C16534i.T(b12, new C9820q((C17164e<? super C9820q>) null)), new C9821r(bVar4, (C17164e<? super C9821r>) null)), g0.a(this), ip.f.a(), new q(bVar4.a(), new q.c.a(A0((q.b.C1292b.a) null, C16877v.n()), (C9810g) null, false, cVar2.l(), (Qf.a) null, C16877v.n(), (m) null, (ag.k) null, (q.e) null, (q.g) null, (t) null, (Md.b) null, (C13302d) null, (q.a) null, (q.d) null, (C9227y) null, 65408, (DefaultConstructorMarker) null), (K) null, (q.f) null, (q.b) null, (C15035a) null, 56, (DefaultConstructorMarker) null));
        this.f73876W0 = new LinkedHashMap();
        e1(aVar4.isLoggedIn() || aVar4.c());
        x0();
        this.f73880Y0 = new C11410b<>();
    }

    /* access modifiers changed from: private */
    public final q.c.a.C1296a A0(q.b.C1292b.a aVar, List<Kf.y> list) {
        boolean J10 = this.f73889t.J();
        List c10 = C16877v.c();
        if (aVar != null) {
            c10.add(new q.c.a.C1296a.C1297a.C1298a(aVar.d(), new C9230z.l.d(aVar)));
        } else if (!J10) {
            c10.add(q.c.a.C1296a.C1297a.b.f73775a);
        }
        List a10 = C16877v.a(c10);
        List c11 = C16877v.c();
        if (aVar != null && !J10) {
            c11.add(q.c.a.C1296a.b.d.f73791a);
        }
        c11.add(q.c.a.C1296a.b.C1301c.f73787a);
        c11.add(new q.c.a.C1296a.b.C1300b(new C9230z.l.b(list)));
        c11.add(q.c.a.C1296a.b.C1299a.f73780a);
        return new q.c.a.C1296a(C15985a.h(a10), C15985a.h(C16877v.a(c11)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        if (r20 == sf.C10243d.CLICK_AND_COLLECT) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<hg.n> D0(java.util.List<Ln.d> r16, java.lang.String r17, java.util.Set<java.lang.String> r18, java.util.Map<java.lang.String, hg.v.C9812i> r19, sf.C10243d r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            r2 = r19
            hg.a r3 = r0.f73894y
            r4 = r16
            java.util.Map r3 = r3.a(r4)
            java.util.List r4 = YH.C16877v.c()
            java.util.List r5 = YH.C16877v.c()
            hg.J$a r6 = hg.J.a.AVAILABLE
            java.lang.Object r6 = r3.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0024
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r6)
        L_0x0024:
            hg.J$a r6 = hg.J.a.LIMITED
            java.lang.Object r6 = r3.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0033
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r6)
        L_0x0033:
            java.util.List r5 = YH.C16877v.a(r5)
            hg.J$a r6 = hg.J.a.UNAVAILABLE
            java.lang.Object r6 = r3.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = 10
            if (r7 == 0) goto L_0x00a5
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x004d
            goto L_0x00a5
        L_0x004d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = YH.C16877v.y(r6, r8)
            r9.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
        L_0x005c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x009d
            java.lang.Object r10 = r6.next()
            hg.h r10 = (hg.C9799h) r10
            hg.n$c$a r11 = new hg.n$c$a
            Ln.d r12 = r10.b()
            java.lang.String r12 = r12.j()
            Ln.d r13 = r10.b()
            Ln.f r13 = r13.i()
            java.lang.String r13 = r13.i()
            Ln.d r14 = r10.b()
            Ln.f r14 = r14.i()
            java.lang.String r14 = r14.e()
            hg.J r10 = r10.a()
            int r10 = r10.a()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r12, r13, r14, r10)
            r9.add(r11)
            goto L_0x005c
        L_0x009d:
            hg.n$c r6 = new hg.n$c
            r6.<init>(r9)
            r4.add(r6)
        L_0x00a5:
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r9 = 0
            r10 = 2
            r11 = 1
            if (r6 != 0) goto L_0x011c
            if (r7 == 0) goto L_0x00bd
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r7 = r20
            goto L_0x00c3
        L_0x00bd:
            sf.d r6 = sf.C10243d.CLICK_AND_COLLECT
            r7 = r20
            if (r7 != r6) goto L_0x00e7
        L_0x00c3:
            int[] r6 = hg.v.C9813j.f74065b
            int r7 = r20.ordinal()
            r6 = r6[r7]
            if (r6 == r11) goto L_0x00dd
            if (r6 != r10) goto L_0x00d7
            Of.x$a r6 = new Of.x$a
            r7 = r17
            r6.<init>(r7)
            goto L_0x00df
        L_0x00d7:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x00dd:
            Of.x$b r6 = Of.C9224x.b.f62671a
        L_0x00df:
            hg.n$a r7 = new hg.n$a
            r7.<init>(r6)
            r4.add(r7)
        L_0x00e7:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = YH.C16877v.y(r5, r8)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x00f6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0119
            java.lang.Object r7 = r5.next()
            hg.h r7 = (hg.C9799h) r7
            hg.J r12 = r7.a()
            hg.J$a r12 = r12.b()
            hg.J$a r13 = hg.J.a.LIMITED
            if (r12 != r13) goto L_0x0110
            r12 = r11
            goto L_0x0111
        L_0x0110:
            r12 = r9
        L_0x0111:
            hg.n$b r7 = r15.k0(r7, r1, r2, r12)
            r6.add(r7)
            goto L_0x00f6
        L_0x0119:
            r4.addAll(r6)
        L_0x011c:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0129:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0163
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            hg.J$a r7 = (hg.J.a) r7
            int[] r12 = hg.v.C9813j.f74066c
            int r7 = r7.ordinal()
            r7 = r12[r7]
            if (r7 == r11) goto L_0x0129
            if (r7 == r10) goto L_0x0129
            r12 = 3
            if (r7 == r12) goto L_0x0129
            r12 = 4
            if (r7 == r12) goto L_0x0157
            r12 = 5
            if (r7 != r12) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0157:
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r5.put(r7, r6)
            goto L_0x0129
        L_0x0163:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0170:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0186
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            YH.C16877v.E(r3, r6)
            goto L_0x0170
        L_0x0186:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r3, r8)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x0193:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01a7
            java.lang.Object r6 = r3.next()
            hg.h r6 = (hg.C9799h) r6
            hg.n$b r6 = r15.k0(r6, r1, r2, r9)
            r5.add(r6)
            goto L_0x0193
        L_0x01a7:
            r4.addAll(r5)
            java.util.List r1 = YH.C16877v.a(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.D0(java.util.List, java.lang.String, java.util.Set, java.util.Map, sf.d):java.util.List");
    }

    /* access modifiers changed from: private */
    public final void L0(Throwable th2) {
        C9133b.a c10 = this.f73883n.c(th2, (String) null);
        if (c10 instanceof C9133b.a.C1018a) {
            C9133b.a.C1018a aVar = (C9133b.a.C1018a) c10;
            p0(aVar.c(), aVar.a(), new K.a.C1285a(C13026h.a(aVar.b()), new u(this)), (K.a.C1285a) null, new androidx.compose.ui.window.h(true, true, false, 4, (DefaultConstructorMarker) null));
        } else if (c10 instanceof C9133b.a.C1019b) {
            s0(this, ((C9133b.a.C1019b) c10).a(), J0.Long, (K.b.a) null, 4, (Object) null);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(v vVar) {
        vVar.j0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = (r0 = (r0 = r0.b()).c()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T0(Ln.g r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0034
            Ln.e r0 = r5.c()
            if (r0 == 0) goto L_0x001f
            Ln.e$a r0 = r0.b()
            if (r0 == 0) goto L_0x001f
            Ln.e$b r0 = r0.c()
            if (r0 == 0) goto L_0x001f
            java.lang.Double r0 = r0.b()
            if (r0 == 0) goto L_0x001f
            double r0 = r0.doubleValue()
            goto L_0x0021
        L_0x001f:
            r0 = 0
        L_0x0021:
            Lf.b r2 = r4.f73891v
            java.util.List r5 = r5.d()
            Il.a r3 = r4.f73888s
            kp.d r3 = r3.s()
            java.lang.String r3 = r3.b()
            r2.b(r5, r0, r3)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.T0(Ln.g):void");
    }

    /* access modifiers changed from: private */
    public final void b1(Ln.g gVar) {
        List<d> value;
        List<d> list;
        boolean z10 = false;
        if (gVar != null) {
            e1(false);
        }
        C16505B<List<d>> b10 = this.f73881Z;
        do {
            value = b10.getValue();
            List list2 = value;
            if (gVar == null || (list = gVar.d()) == null) {
                list = C16877v.n();
            }
        } while (!b10.e(value, list));
        if (gVar != null && gVar.b().a()) {
            z10 = true;
        }
        this.f73869S = z10;
    }

    /* access modifiers changed from: private */
    public final void c1(Boolean bool, MComConfig.e eVar, Boolean bool2) {
        this.f73867R = eVar;
        boolean z10 = false;
        this.f73865Q = bool != null ? bool.booleanValue() : false;
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        }
        this.f73863P = z10;
    }

    /* access modifiers changed from: private */
    public final void e1(boolean z10) {
        Boolean value;
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
                String a10 = C11818a.a("updateLoadingScreenStatus: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = v.class.getName();
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
        C16505B<Boolean> b10 = this.f73847H;
        do {
            value = b10.getValue();
            Boolean bool = value;
        } while (!b10.e(value, Boolean.valueOf(z10)));
    }

    private final n.b k0(C9799h hVar, Set<String> set, Map<String, C9812i> map, boolean z10) {
        Map<String, C9812i> map2 = map;
        C9812i iVar = map2.get(hVar.b().j());
        int a10 = iVar != null ? iVar.a() : hVar.b().l();
        C9812i iVar2 = map2.get(hVar.b().j());
        boolean b10 = iVar2 != null ? iVar2.b() : false;
        C10828d b11 = this.f73893x.b(d.b(hVar.b(), (String) null, (String) null, a10, (d.a) null, false, 0.0d, 0.0d, (Double) null, (Double) null, (Double) null, (String) null, (Ln.f) null, (Integer) null, 8187, (Object) null), this.f73865Q, z10);
        List c10 = C16877v.c();
        c10.add(new C10850o.b("YOU_MAY_ALSO_LIKE_ENTRY_ID", C18146a.f148643sd, C13026h.a(Oo.b.f84394H6), (H0) null, 1, (C10850o.d) null, 40, (DefaultConstructorMarker) null));
        c10.add(C10850o.c.f85245a);
        c10.add(new C10850o.e(set.contains(hVar.b().j())));
        return new n.b(new a1(new a1.a(C15985a.h(C16877v.a(c10))), b11, this.f73888s.s(), new b1.b(a10, !b10, 0, hVar.b().m(), 4, (DefaultConstructorMarker) null), false, true, this.f73888s.w()));
    }

    /* access modifiers changed from: private */
    public final q.a l0(a.C1122a aVar) {
        if (aVar instanceof a.C1122a.C1123a) {
            return new q.a((C13023e) null, new q.a.b(C13026h.b(Oo.b.f84666i0, ((a.C1122a.C1123a) aVar).c()), L2.Available), q.a.C1291a.SHOW_DETAILS, "available", 1, (DefaultConstructorMarker) null);
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public final void n0(String str, String str2, int i10) {
        this.f73885p.l(str, new C14613b.C3151b(str2, i10), (De.a) null, (k) null);
    }

    /* access modifiers changed from: private */
    public final void q0() {
        s0(this, C13026h.a(Oo.b.f84321A3), J0.Long, (K.b.a) null, 4, (Object) null);
    }

    public static /* synthetic */ void s0(v vVar, C13023e eVar, J0 j02, K.b.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j02 = J0.Short;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        vVar.r0(eVar, j02, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: Ln.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: Ae.k} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u0(java.lang.String r21, java.lang.String r22, hg.L r23, Ae.k r24, java.lang.String r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r26
            boolean r3 = r2 instanceof hg.v.C
            if (r3 == 0) goto L_0x0019
            r3 = r2
            hg.v$C r3 = (hg.v.C) r3
            int r4 = r3.f73924n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f73924n = r4
            goto L_0x001e
        L_0x0019:
            hg.v$C r3 = new hg.v$C
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f73922l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f73924n
            r7 = 1
            if (r6 == 0) goto L_0x006a
            if (r6 != r7) goto L_0x0062
            int r2 = r3.f73921k
            java.lang.Object r0 = r3.f73920j
            r5 = r0
            Ln.d r5 = (Ln.d) r5
            java.lang.Object r0 = r3.f73919i
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.f73918h
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r3.f73917g
            r7 = r0
            Ae.k r7 = (Ae.k) r7
            java.lang.Object r0 = r3.f73916f
            hg.L r0 = (hg.L) r0
            java.lang.Object r8 = r3.f73915e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.f73914d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r3.f73913c
            hg.v r3 = (hg.v) r3
            XH.y.b(r4)     // Catch:{ all -> 0x005c }
            r10 = r0
            r13 = r2
            r19 = r6
            r17 = r7
            r0 = r8
            goto L_0x0167
        L_0x005c:
            r0 = move-exception
            r4 = r2
            r10 = r6
            r8 = r7
            goto L_0x01b2
        L_0x0062:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006a:
            XH.y.b(r4)
            Ln.d r4 = r20.C0(r21)
            if (r4 != 0) goto L_0x0133
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to find item to delete: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            qv.e r0 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x009c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r8 = 0
            boolean r6 = r6.b(r0, r8)
            if (r6 == 0) goto L_0x009c
            r4.add(r5)
            goto L_0x009c
        L_0x00b4:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x00bb:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0132
            java.lang.Object r8 = r3.next()
            qv.b r8 = (qv.C11819b) r8
            if (r5 != 0) goto L_0x00d3
            java.lang.String r5 = qv.C11818a.a(r4, r2)
            if (r5 == 0) goto L_0x0132
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00d3:
            if (r6 != 0) goto L_0x0121
            java.lang.Class<hg.v> r6 = hg.v.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r9 = 36
            r10 = 2
            java.lang.String r9 = HJ.C15854t.s1(r6, r9, r4, r10, r4)
            r11 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r11, r4, r10, r4)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r9, r6)
        L_0x00f8:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r10, r7)
            if (r9 == 0) goto L_0x010b
            java.lang.String r9 = "m"
            goto L_0x010d
        L_0x010b:
            java.lang.String r9 = "b"
        L_0x010d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "|"
            r10.append(r9)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
        L_0x0121:
            r9 = 0
            r21 = r8
            r22 = r0
            r23 = r6
            r24 = r9
            r25 = r2
            r26 = r5
            r21.a(r22, r23, r24, r25, r26)
            goto L_0x00bb
        L_0x0132:
            throw r2
        L_0x0133:
            int r6 = r4.l()
            Ln.h r8 = r1.f73884o     // Catch:{ all -> 0x01ae }
            java.lang.String r9 = r4.j()     // Catch:{ all -> 0x01ae }
            r3.f73913c = r1     // Catch:{ all -> 0x01ae }
            r3.f73914d = r0     // Catch:{ all -> 0x01ae }
            r0 = r22
            r3.f73915e = r0     // Catch:{ all -> 0x01ae }
            r10 = r23
            r3.f73916f = r10     // Catch:{ all -> 0x01ae }
            r11 = r24
            r3.f73917g = r11     // Catch:{ all -> 0x01aa }
            r12 = r25
            r3.f73918h = r12     // Catch:{ all -> 0x01a3 }
            r3.f73919i = r2     // Catch:{ all -> 0x01a3 }
            r3.f73920j = r4     // Catch:{ all -> 0x01a3 }
            r3.f73921k = r6     // Catch:{ all -> 0x01a3 }
            r3.f73924n = r7     // Catch:{ all -> 0x01a3 }
            java.lang.Object r2 = r8.g(r9, r3)     // Catch:{ all -> 0x01a3 }
            if (r2 != r5) goto L_0x0160
            return r5
        L_0x0160:
            r3 = r1
            r5 = r4
            r13 = r6
            r17 = r11
            r19 = r12
        L_0x0167:
            IC.e r0 = IC.C13026h.c(r0)     // Catch:{ all -> 0x019c }
            hg.K$b$a r2 = new hg.K$b$a     // Catch:{ all -> 0x019c }
            int r4 = Oo.b.f84838x8     // Catch:{ all -> 0x019c }
            IC.e r4 = IC.C13026h.a(r4)     // Catch:{ all -> 0x019c }
            hg.t r6 = new hg.t     // Catch:{ all -> 0x019c }
            r6.<init>(r3, r5, r13, r10)     // Catch:{ all -> 0x019c }
            r2.<init>(r4, r6)     // Catch:{ all -> 0x019c }
            O0.J0 r4 = O0.J0.Long     // Catch:{ all -> 0x019c }
            r3.r0(r0, r4, r2)     // Catch:{ all -> 0x019c }
            Lf.b r11 = r3.f73891v
            java.lang.String r12 = r5.j()
            double r14 = r5.e()
            Il.a r0 = r3.f73888s
            kp.d r0 = r0.s()
            java.lang.String r16 = r0.b()
            com.ingka.ikea.analytics.Interaction$Component r18 = com.ingka.ikea.analytics.Interaction$Component.CART_DETAILS
            r11.e(r12, r13, r14, r16, r17, r18, r19)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x019c:
            r0 = move-exception
            r4 = r13
            r8 = r17
            r10 = r19
            goto L_0x01b2
        L_0x01a3:
            r0 = move-exception
        L_0x01a4:
            r3 = r1
            r5 = r4
            r4 = r6
            r8 = r11
            r10 = r12
            goto L_0x01b2
        L_0x01aa:
            r0 = move-exception
        L_0x01ab:
            r12 = r25
            goto L_0x01a4
        L_0x01ae:
            r0 = move-exception
            r11 = r24
            goto L_0x01ab
        L_0x01b2:
            Lf.b r2 = r3.f73891v
            java.lang.String r6 = r5.j()
            double r11 = r5.e()
            Il.a r3 = r3.f73888s
            kp.d r3 = r3.s()
            java.lang.String r7 = r3.b()
            com.ingka.ikea.analytics.Interaction$Component r9 = com.ingka.ikea.analytics.Interaction$Component.CART_DETAILS
            r3 = r6
            r5 = r11
            r2.e(r3, r4, r5, r7, r8, r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.u0(java.lang.String, java.lang.String, hg.L, Ae.k, java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N v0(v vVar, d dVar, int i10, L l10) {
        String str;
        char c10;
        v vVar2 = vVar;
        int i11 = i10;
        qv.e eVar = qv.e.DEBUG;
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
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Undo delete item from cart, add item back again", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = vVar.getClass().getName();
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
        vVar2.e0(new Kf.y(dVar.j(), i11), (String) null, (C9805b) null);
        if (l10 != null) {
            qv.e eVar2 = qv.e.DEBUG;
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
                    String a11 = C11818a.a("Undo move item to list, delete item from list again", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = v.class.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                c10 = '$';
            }
            vVar2.n0(l10.b(), l10.a(), i11);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hg.q.d.a w0(hg.q.d.a r22, boolean r23) {
        /*
            r21 = this;
            r0 = r21
            r2 = 0
            if (r23 == 0) goto L_0x00d1
            if (r22 == 0) goto L_0x000c
            hg.E r3 = r22.c()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            boolean r4 = r3 instanceof hg.E.a
            java.lang.String r5 = "|"
            java.lang.String r6 = "b"
            java.lang.String r7 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            r11 = 36
            java.lang.Class<hg.v> r12 = hg.v.class
            r13 = 2
            if (r4 == 0) goto L_0x00d4
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0033:
            boolean r15 = r4.hasNext()
            r1 = 0
            if (r15 == 0) goto L_0x004b
            java.lang.Object r15 = r4.next()
            r10 = r15
            qv.b r10 = (qv.C11819b) r10
            boolean r1 = r10.b(r3, r1)
            if (r1 == 0) goto L_0x0033
            r14.add(r15)
            goto L_0x0033
        L_0x004b:
            java.util.Iterator r4 = r14.iterator()
            r10 = r2
            r14 = r10
        L_0x0051:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x00c3
            java.lang.Object r15 = r4.next()
            qv.b r15 = (qv.C11819b) r15
            r1 = 0
            if (r10 != 0) goto L_0x006d
            java.lang.String r10 = "Google Pay button clicked but not available, start normal checkout"
            java.lang.String r10 = qv.C11818a.a(r10, r1)
            if (r10 != 0) goto L_0x0069
            goto L_0x00c3
        L_0x0069:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x006d:
            if (r14 != 0) goto L_0x00af
            java.lang.String r14 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            java.lang.String r1 = HJ.C15854t.s1(r14, r11, r2, r13, r2)
            r11 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r11, r2, r13, r2)
            int r11 = r1.length()
            if (r11 != 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            java.lang.String r14 = HJ.C15854t.P0(r1, r9)
        L_0x008b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r11 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r11)
            if (r1 == 0) goto L_0x009c
            r1 = r7
            goto L_0x009d
        L_0x009c:
            r1 = r6
        L_0x009d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r5)
            r11.append(r14)
            java.lang.String r14 = r11.toString()
        L_0x00af:
            r1 = r14
            r14 = r15
            r15 = r3
            r16 = r1
            r11 = 0
            r17 = r11
            r18 = 0
            r19 = r10
            r14.a(r15, r16, r17, r18, r19)
            r14 = r1
            r1 = r11
            r11 = 36
            goto L_0x0051
        L_0x00c3:
            TJ.B<java.lang.Boolean> r1 = r0.f73858M0
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.setValue(r3)
            TJ.B<hg.q$f> r1 = r0.f73853K
            hg.q$f$b$d r3 = hg.q.f.b.d.f73816a
            r1.setValue(r3)
        L_0x00d1:
            r1 = 1
            goto L_0x01b0
        L_0x00d4:
            boolean r1 = r3 instanceof hg.E.c
            if (r1 == 0) goto L_0x019e
            qv.e r1 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00eb:
            boolean r11 = r4.hasNext()
            r15 = 0
            if (r11 == 0) goto L_0x0103
            java.lang.Object r11 = r4.next()
            r14 = r11
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r1, r15)
            if (r14 == 0) goto L_0x00eb
            r10.add(r11)
            goto L_0x00eb
        L_0x0103:
            java.util.Iterator r4 = r10.iterator()
            r10 = r2
            r11 = r10
        L_0x0109:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x0183
            java.lang.Object r14 = r4.next()
            qv.b r14 = (qv.C11819b) r14
            r2 = 0
            if (r10 != 0) goto L_0x0125
            java.lang.String r10 = "Google Pay button ready and clicked, start express checkout"
            java.lang.String r10 = qv.C11818a.a(r10, r2)
            if (r10 != 0) goto L_0x0121
            goto L_0x0183
        L_0x0121:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x0125:
            if (r11 != 0) goto L_0x016d
            java.lang.String r11 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r20 = r4
            r2 = 0
            r4 = 36
            java.lang.String r15 = HJ.C15854t.s1(r11, r4, r2, r13, r2)
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r2, r13, r2)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x0144
            goto L_0x0148
        L_0x0144:
            java.lang.String r11 = HJ.C15854t.P0(r15, r9)
        L_0x0148:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r2 = 1
            boolean r15 = HJ.C15854t.b0(r15, r8, r2)
            if (r15 == 0) goto L_0x0159
            r2 = r7
            goto L_0x015a
        L_0x0159:
            r2 = r6
        L_0x015a:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            r15.append(r5)
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            goto L_0x0171
        L_0x016d:
            r20 = r4
            r4 = 46
        L_0x0171:
            r2 = 0
            r15 = r1
            r16 = r11
            r17 = r2
            r18 = 0
            r19 = r10
            r14.a(r15, r16, r17, r18, r19)
            r15 = r2
            r4 = r20
            r2 = 0
            goto L_0x0109
        L_0x0183:
            TJ.B<java.lang.Boolean> r1 = r0.f73858M0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            r1 = 1
            r0.f73878X0 = r1
            TJ.B<hg.q$f> r2 = r0.f73853K
            hg.q$f$b$c r4 = new hg.q$f$b$c
            hg.E$c r3 = (hg.E.c) r3
            java.lang.String r3 = r3.a()
            r4.<init>(r3)
            r2.setValue(r4)
            goto L_0x01b0
        L_0x019e:
            r1 = 1
            hg.E$b r2 = hg.E.b.f73596a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r3, r2)
            if (r2 != 0) goto L_0x01b0
            if (r3 != 0) goto L_0x01aa
            goto L_0x01b0
        L_0x01aa:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x01b0:
            if (r22 == 0) goto L_0x01c9
            boolean r2 = r22.e()
            if (r2 == 0) goto L_0x01bc
            if (r23 == 0) goto L_0x01bc
        L_0x01ba:
            r4 = r1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r6 = 5
            r7 = 0
            r3 = 0
            r5 = 0
            r2 = r22
            hg.q$d$a r2 = hg.q.d.a.b(r2, r3, r4, r5, r6, r7)
            goto L_0x01ca
        L_0x01c9:
            r2 = 0
        L_0x01ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.w0(hg.q$d$a, boolean):hg.q$d$a");
    }

    /* access modifiers changed from: private */
    public final q.e z0(MComConfig.f fVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f73892w.m() + f73832b1 < currentTimeMillis || this.f73892w.u() + w.f74115a > currentTimeMillis || fVar == null) {
            return null;
        }
        String d10 = fVar.d();
        String a10 = fVar.a();
        if (a10 == null) {
            a10 = "";
        }
        String str = a10;
        String b10 = fVar.b();
        Iterable<MComConfig.f.a> c10 = fVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (MComConfig.f.a aVar : c10) {
            arrayList.add(new e.b(aVar.a(), aVar.d(), aVar.c(), aVar.b()));
        }
        return new q.e(new com.ingka.ikea.app.inappfeedback.e(d10, str, b10, (String) null, arrayList, Interaction$Component.CART_DETAILS, 8, (DefaultConstructorMarker) null));
    }

    public final Qf.a B0() {
        return this.f73894y.b(this.f73881Z.getValue(), this.f73877X.getValue(), this.f73862O0, this.f73863P);
    }

    public final d C0(String str) {
        Object obj;
        C17542s.j(str, "itemNo");
        Iterator it = this.f73881Z.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((d) obj).j(), str)) {
                break;
            }
        }
        return (d) obj;
    }

    public final C16519P<q> E0() {
        return this.f73875V0;
    }

    public final Mn.c F0(UserPostalCodeAddress userPostalCodeAddress) {
        String str;
        e.a b10;
        e.b c10;
        Double b11;
        String str2;
        C17542s.j(userPostalCodeAddress, "postalCodeAddress");
        Ln.g value = this.f73884o.m().getValue();
        if (value == null) {
            return null;
        }
        List<d> d10 = value.d();
        if (d10.isEmpty()) {
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("No items to proceed to checkout with", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = v.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, (Throwable) null, str3);
            }
            return null;
        }
        E e10 = this.f73862O0;
        if (e10 == null || (e10 instanceof E.a) || C17542s.e(e10, E.b.f73596a)) {
            str = null;
        } else if (e10 instanceof E.c) {
            str = ((E.c) e10).a();
        } else {
            throw new XH.t();
        }
        Iterable<d> iterable = d10;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (d dVar : iterable) {
            String j10 = dVar.j();
            int l10 = dVar.l();
            int i10 = C9813j.f74064a[dVar.i().j().ordinal()];
            if (i10 == 1) {
                str2 = "METER";
            } else if (i10 == 2) {
                str2 = "PIECE";
            } else {
                throw new XH.t();
            }
            arrayList2.add(new c.b(j10, l10, dVar.i().i(), dVar.i().h(), str2, dVar.i().g(), dVar.i().e()));
        }
        Ln.c a11 = value.a();
        String a12 = a11 != null ? a11.a() : null;
        kD.h value2 = this.f73886q.getProfile().getValue();
        String c11 = value2 != null ? value2.c() : null;
        boolean z10 = this.f73869S;
        String b12 = this.f73888s.s().b();
        Ln.e c12 = value.c();
        double doubleValue = (c12 == null || (b10 = c12.b()) == null || (c10 = b10.c()) == null || (b11 = c10.b()) == null) ? 0.0d : b11.doubleValue();
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            d dVar2 = (d) it.next();
            arrayList3.add(new Mn.a(dVar2.j(), dVar2.l(), dVar2.e()));
            UserPostalCodeAddress userPostalCodeAddress2 = userPostalCodeAddress;
        }
        c.a aVar = new c.a(b12, doubleValue, arrayList3);
        C9792a aVar2 = this.f73894y;
        List value3 = this.f73881Z.getValue();
        C12832d value4 = this.f73877X.getValue();
        return new Mn.c(str, userPostalCodeAddress, arrayList2, a12, c11, aVar, z10, aVar2.e(value3, value4 != null ? value4.e() : null));
    }

    public final MComConfig.e G0() {
        return this.f73867R;
    }

    public final C11410b<C9155a> H0() {
        return this.f73880Y0;
    }

    public final boolean I0() {
        return this.f73878X0;
    }

    public final C16505B<C10243d> J0() {
        return this.f73848H0;
    }

    public final List<d> K0() {
        List list = this.f73894y.a(this.f73881Z.getValue()).get(J.a.UNAVAILABLE);
        if (list == null) {
            return null;
        }
        Iterable<C9799h> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C9799h b10 : iterable) {
            arrayList.add(b10.b());
        }
        return arrayList;
    }

    public final boolean N0() {
        Collection K02 = K0();
        return !(K02 == null || K02.isEmpty());
    }

    public final void O0(String str, String str2, int i10, String str3) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "successSnackBarText");
        String str4 = str2;
        F0 unused = C16314k.d(g0.a(this), new J(QJ.N.f137593c0, this, str, str4, i10), (QJ.T) null, new K(this, str4, str3, str, (C17164e<? super K>) null), 2, (Object) null);
    }

    public final void P0(C9804a aVar) {
        C17542s.j(aVar, "action");
        if (C17542s.e(aVar, C9804a.C1308a.C1309a.f74012a)) {
            this.f73853K.setValue(new q.f.b.a(true));
        } else if (C17542s.e(aVar, C9804a.C1308a.b.f74013a)) {
            this.f73853K.setValue(new q.f.b.a(false));
        } else if (C17542s.e(aVar, C9804a.b.C1310a.f74014a)) {
            this.f73853K.setValue(null);
        } else if (C17542s.e(aVar, C9804a.c.b.f74016a)) {
            this.f73858M0.setValue(Boolean.TRUE);
        } else if (C17542s.e(aVar, C9804a.c.C1311a.f74015a)) {
            this.f73879Y.setValue(null);
        } else if (aVar instanceof C9804a.c.f) {
            this.f73891v.f();
            this.f73879Y.setValue(new q.b.C1292b(((C9804a.c.f) aVar).a()));
        } else if (aVar instanceof C9804a.c.e) {
            d C02 = C0(((C9804a.c.e) aVar).a());
            if (C02 != null) {
                this.f73879Y.setValue(new q.b.a(C15985a.h(C02.i().f())));
            }
        } else if (aVar instanceof C9804a.c.C1312c) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new M(this, aVar, (C17164e<? super M>) null), 3, (Object) null);
        } else if (C17542s.e(aVar, C9804a.c.d.f74018a)) {
            F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new N(this, (C17164e<? super N>) null), 3, (Object) null);
        } else {
            throw new XH.t();
        }
    }

    public final void Q0(String str) {
        String str2 = str;
        C17542s.j(str2, "listName");
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Items moved, clear cart", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = v.class.getName();
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
        F0 unused = C16314k.d(g0.a(this), new O(QJ.N.f137593c0, this), (QJ.T) null, new P(this, str2, (C17164e<? super P>) null), 2, (Object) null);
    }

    public final void R0(C10243d dVar) {
        C10243d value;
        C17542s.j(dVar, "option");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Preferred delivery option updated: " + dVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = v.class.getName();
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
        this.f73892w.k(dVar);
        C16505B<C10243d> b10 = this.f73848H0;
        do {
            value = b10.getValue();
            C10243d dVar2 = value;
        } while (!b10.e(value, dVar));
        int i10 = C9813j.f74065b[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                C12832d value2 = this.f73877X.getValue();
                if (value2 != null) {
                    str = value2.e();
                }
                if (str == null || str.length() == 0) {
                    this.f73880Y0.e(C9155a.STORE);
                }
            } else {
                throw new XH.t();
            }
        }
        C9792a aVar = this.f73894y;
        Iterable<d> value3 = this.f73881Z.getValue();
        ArrayList arrayList2 = new ArrayList(C16877v.y(value3, 10));
        for (d dVar3 : value3) {
            arrayList2.add(new Kf.y(dVar3.j(), dVar3.l()));
        }
        aVar.d(dVar, arrayList2);
    }

    public final void S0() {
        this.f73841E.setValue(null);
    }

    public final void U0(boolean z10) {
        this.f73878X0 = z10;
    }

    public final void V0(String str) {
        Boolean value;
        C17542s.j(str, "listName");
        C16505B<Boolean> b10 = this.f73845G;
        do {
            value = b10.getValue();
            Boolean bool = value;
        } while (!b10.e(value, Boolean.TRUE));
        F0 unused = C16314k.d(g0.a(this), new Q(QJ.N.f137593c0, this), (QJ.T) null, new R(this, str, (C17164e<? super R>) null), 2, (Object) null);
    }

    public final void W0(C9230z.a aVar) {
        C17542s.j(aVar, "event");
        if (aVar instanceof C9230z.a.C1062a) {
            C9230z.a.C1062a aVar2 = (C9230z.a.C1062a) aVar;
            this.f73896z.o(aVar2.b(), aVar2.a());
        } else if (aVar instanceof C9230z.a.b) {
            C9230z.a.b bVar = (C9230z.a.b) aVar;
            this.f73891v.g(bVar.b(), bVar.a(), Interaction$Component.UPSELL);
        } else {
            throw new XH.t();
        }
    }

    public final void X0(boolean z10) {
        e.c.b(this.f73896z, Interaction$Component.COWORKER_DISCOUNT_CHECKBOX, (String) null, YH.X.f(C16796C.a("component_value", z10 ? "on" : "off")), (e.b) null, 10, (Object) null);
    }

    public final void Y0() {
        this.f73891v.a();
    }

    public final void Z0() {
        e.c.b(this.f73896z, Interaction$Component.DUAL_BAG_TOGGLE, (String) null, YH.X.f(C16796C.a("component_value", PlaceTypes.STORE)), (e.b) null, 10, (Object) null);
    }

    public final void a1() {
        this.f73891v.c();
    }

    public final void d1(boolean z10) {
        F0 unused = C16314k.d(g0.a(this), new Z(QJ.N.f137593c0, this), (QJ.T) null, new a0(z10, this, (C17164e<? super a0>) null), 2, (Object) null);
    }

    public final void e0(Kf.y yVar, String str, C9805b bVar) {
        C17542s.j(yVar, "item");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar2 : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Add to cart itemNo: " + yVar.a(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = v.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar2.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        String str6 = str;
        F0 unused = C16314k.d(g0.a(this), new C9814k(QJ.N.f137593c0, this, str6), (QJ.T) null, new C9815l(this, yVar, str6, bVar, (C17164e<? super C9815l>) null), 2, (Object) null);
    }

    public final void f0(String str) {
        String value;
        C17542s.j(str, "rewardCode");
        C16505B<String> b10 = this.f73838C0;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
        F0 unused = C16314k.d(g0.a(this), new C9816m(QJ.N.f137593c0, this), (QJ.T) null, new C9817n(this, str, (C17164e<? super C9817n>) null), 2, (Object) null);
    }

    public final void f1(String str, int i10, k kVar, String str2) {
        String str3 = str;
        C17542s.j(str, "itemNo");
        C17542s.j(kVar, "actionType");
        C17542s.j(str2, "deleteItemSuccessText");
        F0 f02 = this.f73876W0.get(str);
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f73876W0.put(str, C16314k.d(g0.a(this), new b0(QJ.N.f137593c0, this), (QJ.T) null, new c0(this, i10, str, str2, kVar, (C17164e<? super c0>) null), 2, (Object) null));
    }

    public final void g0(long j10) {
        Integer value;
        this.f73892w.t(j10);
        C16505B<Integer> b10 = this.f73834A0;
        do {
            value = b10.getValue();
        } while (!b10.e(value, Integer.valueOf(value.intValue() + 1)));
    }

    public final void h0() {
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
                String a10 = C11818a.a("Clear cart", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = v.class.getName();
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
        F0 unused = C16314k.d(g0.a(this), new C9823t(QJ.N.f137593c0, this), (QJ.T) null, new C9824u(this, (C17164e<? super C9824u>) null), 2, (Object) null);
    }

    public final void i0(String str) {
        String value;
        C17542s.j(str, "rewardCode");
        C16505B<String> b10 = this.f73838C0;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
        F0 unused = C16314k.d(g0.a(this), new C1313v(QJ.N.f137593c0, this), (QJ.T) null, new C9825w(this, str, (C17164e<? super C9825w>) null), 2, (Object) null);
    }

    public final void j0() {
        K value;
        C16505B<K> b10 = this.f73851J;
        do {
            value = b10.getValue();
            K k10 = value;
        } while (!b10.e(value, null));
    }

    public final void m0(String str, String str2, k kVar, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "successSnackBarText");
        C17542s.j(kVar, "actionType");
        F0 unused = C16314k.d(g0.a(this), new C9827y(QJ.N.f137593c0, this), (QJ.T) null, new C9828z(this, str, str2, kVar, str3, (C17164e<? super C9828z>) null), 2, (Object) null);
    }

    public final void o0(long j10) {
        Integer value;
        this.f73892w.w(j10);
        C16505B<Integer> b10 = this.f73834A0;
        do {
            value = b10.getValue();
        } while (!b10.e(value, Integer.valueOf(value.intValue() + 1)));
    }

    public final void p0(C13023e eVar, C13023e eVar2, K.a.C1285a aVar, K.a.C1285a aVar2, androidx.compose.ui.window.h hVar) {
        K value;
        C17542s.j(eVar, "header");
        C17542s.j(eVar2, "body");
        C17542s.j(aVar, "primaryAction");
        C17542s.j(hVar, "dialogProperties");
        C16505B<K> b10 = this.f73851J;
        do {
            value = b10.getValue();
            K k10 = value;
        } while (!b10.e(value, new K.a(eVar, eVar2, aVar, aVar2, hVar)));
    }

    public final void r0(C13023e eVar, J0 j02, K.b.a aVar) {
        K value;
        C17542s.j(eVar, "snackBarText");
        C17542s.j(j02, "duration");
        C16505B<K> b10 = this.f73851J;
        do {
            value = b10.getValue();
            K k10 = value;
        } while (!b10.e(value, new K.b(eVar, j02, aVar)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9 A[SYNTHETIC, Splitter:B:31:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t0(Kf.y r9, java.lang.String r10, hg.v.C9805b r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof hg.v.B
            if (r0 == 0) goto L_0x0013
            r0 = r12
            hg.v$B r0 = (hg.v.B) r0
            int r1 = r0.f73912l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73912l = r1
            goto L_0x0018
        L_0x0013:
            hg.v$B r0 = new hg.v$B
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f73910j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f73912l
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0071
            if (r3 == r5) goto L_0x0054
            if (r3 != r4) goto L_0x004c
            java.lang.Object r9 = r0.f73909i
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.f73908h
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f73907g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f73906f
            hg.v$b r10 = (hg.v.C9805b) r10
            java.lang.Object r10 = r0.f73905e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f73904d
            Kf.y r11 = (Kf.y) r11
            java.lang.Object r11 = r0.f73903c
            hg.v r11 = (hg.v) r11
        L_0x0044:
            XH.y.b(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x00d7
        L_0x0049:
            r10 = move-exception
            goto L_0x00ff
        L_0x004c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0054:
            java.lang.Object r9 = r0.f73909i
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.f73908h
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f73907g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f73906f
            hg.v$b r10 = (hg.v.C9805b) r10
            java.lang.Object r10 = r0.f73905e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f73904d
            Kf.y r11 = (Kf.y) r11
            java.lang.Object r11 = r0.f73903c
            hg.v r11 = (hg.v) r11
            goto L_0x0044
        L_0x0071:
            XH.y.b(r1)
            java.lang.String r1 = r9.a()
            TJ.B<java.util.List<java.lang.String>> r3 = r8.f73859N
            java.lang.Object r6 = r3.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r6 = YH.C16877v.W0(r6, r1)
            r3.setValue(r6)
            Kf.y r3 = new Kf.y     // Catch:{ all -> 0x00b2 }
            int r6 = r9.b()     // Catch:{ all -> 0x00b2 }
            r3.<init>(r1, r6)     // Catch:{ all -> 0x00b2 }
            java.util.List r3 = YH.C16877v.e(r3)     // Catch:{ all -> 0x00b2 }
            if (r11 != 0) goto L_0x00b6
            Kf.x r4 = r8.f73833A     // Catch:{ all -> 0x00b2 }
            r0.f73903c = r8     // Catch:{ all -> 0x00b2 }
            r0.f73904d = r9     // Catch:{ all -> 0x00b2 }
            r0.f73905e = r10     // Catch:{ all -> 0x00b2 }
            r0.f73906f = r11     // Catch:{ all -> 0x00b2 }
            r0.f73907g = r12     // Catch:{ all -> 0x00b2 }
            r0.f73908h = r1     // Catch:{ all -> 0x00b2 }
            r0.f73909i = r3     // Catch:{ all -> 0x00b2 }
            r0.f73912l = r5     // Catch:{ all -> 0x00b2 }
            java.lang.Object r9 = r4.a(r3, r0)     // Catch:{ all -> 0x00b2 }
            if (r9 != r2) goto L_0x00af
            return r2
        L_0x00af:
            r11 = r8
            r9 = r1
            goto L_0x00d7
        L_0x00b2:
            r10 = move-exception
            r11 = r8
            r9 = r1
            goto L_0x00ff
        L_0x00b6:
            Kf.x r5 = r8.f73833A     // Catch:{ all -> 0x00b2 }
            com.ingka.ikea.analytics.Interaction$Component r6 = r11.a()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = r11.b()     // Catch:{ all -> 0x00b2 }
            r0.f73903c = r8     // Catch:{ all -> 0x00b2 }
            r0.f73904d = r9     // Catch:{ all -> 0x00b2 }
            r0.f73905e = r10     // Catch:{ all -> 0x00b2 }
            r0.f73906f = r11     // Catch:{ all -> 0x00b2 }
            r0.f73907g = r12     // Catch:{ all -> 0x00b2 }
            r0.f73908h = r1     // Catch:{ all -> 0x00b2 }
            r0.f73909i = r3     // Catch:{ all -> 0x00b2 }
            r0.f73912l = r4     // Catch:{ all -> 0x00b2 }
            java.lang.Object r9 = r5.b(r3, r6, r7, r0)     // Catch:{ all -> 0x00b2 }
            if (r9 != r2) goto L_0x00af
            return r2
        L_0x00d7:
            if (r10 == 0) goto L_0x00ed
            TJ.B<hg.r> r12 = r11.f73841E     // Catch:{ all -> 0x0049 }
            hg.r$b r0 = new hg.r$b     // Catch:{ all -> 0x0049 }
            int r1 = Oo.b.f84507T     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0049 }
            IC.e r10 = IC.C13026h.b(r1, r10)     // Catch:{ all -> 0x0049 }
            r0.<init>(r10)     // Catch:{ all -> 0x0049 }
            r12.setValue(r0)     // Catch:{ all -> 0x0049 }
        L_0x00ed:
            TJ.B<java.util.List<java.lang.String>> r10 = r11.f73859N
            java.lang.Object r11 = r10.getValue()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r9 = YH.C16877v.S0(r11, r9)
            r10.setValue(r9)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x00ff:
            TJ.B<java.util.List<java.lang.String>> r11 = r11.f73859N
            java.lang.Object r12 = r11.getValue()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r9 = YH.C16877v.S0(r12, r9)
            r11.setValue(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.t0(Kf.y, java.lang.String, hg.v$b, dI.e):java.lang.Object");
    }

    public final void x0() {
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
                String a10 = C11818a.a("Fetch cart, cancel any current request", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = v.class.getName();
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
        F0 f02 = this.f73895y0;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f73895y0 = C16314k.d(g0.a(this), new E(QJ.N.f137593c0, this), (QJ.T) null, new F(this, (C17164e<? super F>) null), 2, (Object) null);
    }

    public final C16519P<r> y() {
        return this.f73843F;
    }

    public final void y0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (QJ.T) null, new G(this, (C17164e<? super G>) null), 3, (Object) null);
    }
}
