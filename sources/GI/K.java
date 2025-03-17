package gi;

import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import Kf.C9133b;
import Op.B0;
import Op.C10828d;
import Op.C10850o;
import Op.a1;
import Op.b1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qh.i;
import SC.L2;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4899r0;
import U0.o1;
import Wk.a;
import Wk.e;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails;
import com.ingka.ikea.app.stockinfo.local.b;
import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.Badge;
import com.ingka.ikea.core.model.product.Disclaimer;
import com.ingka.ikea.core.model.product.GuaranteeInfo;
import com.ingka.ikea.core.model.product.Measurements;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.Warning;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ei.B;
import ei.C9661b;
import ei.C9672m;
import ei.C9681w;
import ei.J;
import ei.c0;
import ei.j0;
import fI.C17221b;
import fi.a;
import gi.C9746a;
import gi.C9749d;
import gi.C9751f;
import gi.L;
import gi.M;
import gi.V;
import hi.a;
import hi.c;
import hi.g;
import hk.g;
import ip.C11410b;
import ip.k;
import ip.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import lm.C11550a;
import lm.b;
import op.C11697h;
import op.C11698i;
import op.C11700k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qx.C14956a;
import sf.C10242c;
import tf.C10253a;
import vr.C12206a;
import zr.C12550a;

@Metadata(d1 = {"\u0000Ð\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u0000 ®\u00022\u00020\u00012\u00020\u0002:\u0006ª\u0003«\u0003¬\u0003B½\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%\u0012\b\b\u0003\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u000201H\u0002¢\u0006\u0004\b5\u00103J\u001f\u0010:\u001a\u0002012\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u0002012\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u0002012\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u000201H\u0002¢\u0006\u0004\bD\u00103J\u0017\u0010F\u001a\u0002012\u0006\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u0002012\u0006\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u000201H\u0002¢\u0006\u0004\bI\u00103J\u000f\u0010J\u001a\u000201H\u0002¢\u0006\u0004\bJ\u00103J1\u0010R\u001a\u0002012\u0018\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L0K2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u000201H\u0002¢\u0006\u0004\bT\u00103J!\u0010Y\u001a\u0002012\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u001f\u0010[\u001a\u0002012\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\b[\u0010ZJ5\u0010a\u001a\u0002012\u0006\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020U2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u0002012\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bc\u0010dJ%\u0010e\u001a\u0002012\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\be\u0010dJ\u001d\u0010f\u001a\u0002012\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u0002012\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010l\u001a\u00020k2\u0006\u0010j\u001a\u00020'2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bl\u0010mJ\u0011\u0010o\u001a\u0004\u0018\u00010nH\u0002¢\u0006\u0004\bo\u0010pJ\u0011\u0010r\u001a\u0004\u0018\u00010qH\u0002¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bu\u0010vJ)\u0010y\u001a\u0004\u0018\u00010]2\u0006\u0010w\u001a\u00020'2\u0006\u0010@\u001a\u00020%2\u0006\u0010x\u001a\u00020%H\u0002¢\u0006\u0004\by\u0010zJ)\u0010{\u001a\u0004\u0018\u00010]2\u0006\u0010@\u001a\u00020%2\u0006\u0010x\u001a\u00020%2\u0006\u0010w\u001a\u00020'H\u0002¢\u0006\u0004\b{\u0010|J\u0011\u0010~\u001a\u0004\u0018\u00010}H\u0002¢\u0006\u0004\b~\u0010J#\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00012\u0007\u0010\u0001\u001a\u00020_H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00012\u0007\u0010\u0001\u001a\u00020_H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020_2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J!\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J9\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0019\u0010\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020_H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010¡\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010 \u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020_H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J7\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030£\u00012\u0007\u0010¥\u0001\u001a\u00020%H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J#\u0010«\u0001\u001a\u00030ª\u00012\u000e\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001f\u0010®\u0001\u001a\u0005\u0018\u00010­\u00012\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001d\u0010±\u0001\u001a\u0005\u0018\u00010°\u00012\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J+\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030µ\u00010\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030³\u00010\u0001H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J%\u0010¹\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020%0L0¸\u0001H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J)\u0010»\u0001\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010%0\u00010¸\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010º\u0001J\u001a\u0010¼\u0001\u001a\u0002012\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¾\u0001\u001a\u0002012\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0006\b¾\u0001\u0010½\u0001J\u0011\u0010¿\u0001\u001a\u000201H\u0002¢\u0006\u0005\b¿\u0001\u00103J\u0011\u0010À\u0001\u001a\u000201H\u0002¢\u0006\u0005\bÀ\u0001\u00103J&\u0010Â\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L0¸\u0001H\u0002¢\u0006\u0006\bÂ\u0001\u0010º\u0001J\u0011\u0010Ã\u0001\u001a\u000201H\u0002¢\u0006\u0005\bÃ\u0001\u00103J\u001a\u0010Ä\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0011\u0010Æ\u0001\u001a\u000201H\u0002¢\u0006\u0005\bÆ\u0001\u00103J\u000f\u0010Ç\u0001\u001a\u000201¢\u0006\u0005\bÇ\u0001\u00103J\u0011\u0010È\u0001\u001a\u000201H\u0000¢\u0006\u0005\bÈ\u0001\u00103J\u0018\u0010É\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%¢\u0006\u0006\bÉ\u0001\u0010Å\u0001J\u000f\u0010Ê\u0001\u001a\u000201¢\u0006\u0005\bÊ\u0001\u00103J\u0012\u0010Ë\u0001\u001a\u0004\u0018\u00010%¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001b\u0010Î\u0001\u001a\u0002012\u0007\u0010Í\u0001\u001a\u000208H\u0000¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J*\u0010Ò\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%2\u0006\u0010x\u001a\u00020%2\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\"\u0010Ô\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%2\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0011\u0010Ö\u0001\u001a\u000201H\u0014¢\u0006\u0005\bÖ\u0001\u00103J\u001a\u0010Ø\u0001\u001a\u0002012\b\u0010×\u0001\u001a\u00030\u0001¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J%\u0010Ý\u0001\u001a\u0002012\b\u0010Û\u0001\u001a\u00030Ú\u00012\u0007\u0010Ü\u0001\u001a\u00020'H\u0001¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J)\u0010â\u0001\u001a\u0002012\n\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00012\t\u0010á\u0001\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0012\u0010ä\u0001\u001a\u00020'H\u0000¢\u0006\u0006\bä\u0001\u0010å\u0001J\u001a\u0010è\u0001\u001a\u0002012\b\u0010ç\u0001\u001a\u00030æ\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J)\u0010ë\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%2\u0007\u0010ê\u0001\u001a\u00020%2\u0006\u00109\u001a\u000208¢\u0006\u0006\bë\u0001\u0010ì\u0001J,\u0010í\u0001\u001a\u0002012\u0006\u0010@\u001a\u00020%2\u0007\u0010ê\u0001\u001a\u00020%2\u0006\u00109\u001a\u000208H@¢\u0006\u0006\bí\u0001\u0010î\u0001J\u000f\u0010ï\u0001\u001a\u000201¢\u0006\u0005\bï\u0001\u00103J\u000f\u0010ð\u0001\u001a\u000201¢\u0006\u0005\bð\u0001\u00103J\u000f\u0010ñ\u0001\u001a\u000201¢\u0006\u0005\bñ\u0001\u00103R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0016\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R*\u0010 \u0002\u001a\u00020%2\u0007\u0010\u0002\u001a\u00020%8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010Ì\u0001R*\u0010¤\u0002\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010¡\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R+\u0010¦\u0002\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0007\u0012\u0005\u0018\u00010\u0001\u0018\u00010¡\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010£\u0002R&\u0010ª\u0002\u001a\u0011\u0012\r\u0012\u000b §\u0002*\u0004\u0018\u00010%0%0K8\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R#\u0010°\u0002\u001a\t\u0012\u0004\u0012\u00020%0«\u00028\u0006¢\u0006\u0010\n\u0006\b¬\u0002\u0010­\u0002\u001a\u0006\b®\u0002\u0010¯\u0002R\u001a\u0010²\u0002\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b±\u0002\u0010¢\u0002R(\u0010¶\u0002\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b³\u0002\u0010\u0002\u001a\u0006\b´\u0002\u0010å\u0001\"\u0005\bµ\u0002\u0010GR&\u0010¼\u0002\u001a\t\u0012\u0004\u0012\u00020'0·\u00028\u0006X\u0004¢\u0006\u0010\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002R&\u0010¿\u0002\u001a\t\u0012\u0004\u0012\u00020'0·\u00028\u0006X\u0004¢\u0006\u0010\n\u0006\b½\u0002\u0010¹\u0002\u001a\u0006\b¾\u0002\u0010»\u0002R(\u0010Ã\u0002\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\bÀ\u0002\u0010\u0002\u001a\u0006\bÁ\u0002\u0010å\u0001\"\u0005\bÂ\u0002\u0010GR(\u0010Ç\u0002\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\bÄ\u0002\u0010\u0002\u001a\u0006\bÅ\u0002\u0010å\u0001\"\u0005\bÆ\u0002\u0010GR\u001a\u0010Ë\u0002\u001a\u00030È\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R,\u0010Ï\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020]0\u00010K8\u0000X\u0004¢\u0006\u0010\n\u0006\bÌ\u0002\u0010©\u0002\u001a\u0006\bÍ\u0002\u0010Î\u0002R\u001b\u0010Ñ\u0002\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010\u0002R)\u0010Ó\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L0K8\u0002X\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010©\u0002R)\u0010Õ\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L0K8\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010©\u0002R%\u0010Ø\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030×\u00020Ö\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010©\u0002R%\u0010Ü\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ú\u00020\u00010Ù\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bc\u0010Û\u0002R\u001d\u0010Ý\u0002\u001a\t\u0012\u0004\u0012\u00020'0Ù\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\ba\u0010Û\u0002R%\u0010â\u0002\u001a\t\u0012\u0004\u0012\u00020'0Þ\u00028\u0000X\u0004¢\u0006\u000f\n\u0005\bf\u0010ß\u0002\u001a\u0006\bà\u0002\u0010á\u0002R#\u0010ä\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ã\u0002R\u001e\u0010æ\u0002\u001a\t\u0012\u0005\u0012\u00030å\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010©\u0002R \u0010è\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ç\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010©\u0002R!\u0010ì\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ê\u00020é\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010ë\u0002R \u0010î\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010í\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\b±\u0001\u0010©\u0002R \u0010ð\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ï\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010©\u0002R)\u0010ò\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020%0L0K8\u0002X\u0004¢\u0006\b\n\u0006\bñ\u0002\u0010©\u0002R.\u0010ó\u0002\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020%0L\u0018\u00010«\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010­\u0002R.\u0010õ\u0002\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020%0L\u0018\u00010¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bô\u0002\u0010ã\u0002R-\u0010ö\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010%0\u00010K8\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010©\u0002R2\u0010ø\u0002\u001a\u001b\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010%0\u0001\u0018\u00010«\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b÷\u0002\u0010­\u0002R2\u0010ù\u0002\u001a\u001b\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010%0\u0001\u0018\u00010¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ã\u0002R\u001e\u0010ü\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020K8\u0002X\u0004¢\u0006\b\n\u0006\bû\u0002\u0010©\u0002R\u001f\u0010þ\u0002\u001a\n\u0012\u0005\u0012\u00030ý\u00020Þ\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010ß\u0002R$\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030ý\u00020«\u00028\u0006¢\u0006\u0010\n\u0006\bÿ\u0002\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002R*\u0010\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L0K8\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010©\u0002R+\u0010\u0003\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L0Þ\u00028\u0002X\u0004¢\u0006\b\n\u0006\bË\u0001\u0010ß\u0002R/\u0010\u0003\u001a\u0018\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L\u0018\u00010«\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010­\u0002R/\u0010\u0003\u001a\u0018\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L\u0018\u00010¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010ã\u0002R)\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020N0L0K8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010©\u0002R/\u0010\u0003\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020N0L0Þ\u00028\u0006¢\u0006\u000f\n\u0005\bl\u0010ß\u0002\u001a\u0006\b\u0003\u0010á\u0002R*\u0010\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020N0L0K8\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010©\u0002R\u001d\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020'0\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b~\u0010\u0003R&\u0010\u0003\u001a\u0011\u0012\r\u0012\u000b §\u0002*\u0004\u0018\u00010'0'0K8\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010©\u0002R<\u0010\u0003\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020N0L0«\u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¾\u0002\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002\"\u0006\b\u0003\u0010\u0003R%\u0010\u0003\u001a\u0011\u0012\r\u0012\u000b §\u0002*\u0004\u0018\u00010%0%0K8\u0002X\u0004¢\u0006\u0007\n\u0005\bu\u0010©\u0002R&\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020'0«\u00028\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002R'\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030ú\u00020«\u00028\u0000X\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002R2\u0010\u0003\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020N0L0«\u00028\u0000X\u0004¢\u0006\u000f\n\u0005\bo\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002R-\u0010\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020]0\u00010«\u00028\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010­\u0002\u001a\u0006\b\u0003\u0010¯\u0002R\u001d\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020_0Þ\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b{\u0010ß\u0002R$\u0010\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020%0\u00010Ù\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\by\u0010Û\u0002R%\u0010\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020%0\u00010Ù\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010Û\u0002R!\u0010\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010«\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010­\u0002R\u0017\u0010¡\u0003\u001a\u00020'8BX\u0004¢\u0006\b\u001a\u0006\b \u0003\u0010å\u0001R\u0017\u0010£\u0003\u001a\u00020'8BX\u0004¢\u0006\b\u001a\u0006\b¢\u0003\u0010å\u0001R\u0014\u0010¥\u0003\u001a\u00020'8F¢\u0006\b\u001a\u0006\b¤\u0003\u0010å\u0001R\u001b\u0010§\u0003\u001a\t\u0012\u0004\u0012\u00020'0«\u00028F¢\u0006\b\u001a\u0006\b¦\u0003\u0010¯\u0002R\u001e\u0010¨\u0003\u001a\t\u0012\u0004\u0012\u00020%0«\u00028VX\u0004¢\u0006\b\u001a\u0006\bû\u0002\u0010¯\u0002R(\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020%0L0K8@X\u0004¢\u0006\b\u001a\u0006\b\u0003\u0010Î\u0002R\u001e\u0010©\u0003\u001a\t\u0012\u0004\u0012\u00020_0«\u00028@X\u0004¢\u0006\b\u001a\u0006\bÿ\u0002\u0010¯\u0002¨\u0006­\u0003"}, d2 = {"Lgi/K;", "Landroidx/lifecycle/f0;", "", "Lsf/c;", "appUserDataRepository", "Lbi/a;", "repository", "LKf/b;", "cartApi", "LFB/a;", "localStoreSelectionRepository", "Ltf/a;", "killSwitchRepository", "LQh/a;", "pipAnalytics", "LMg/b;", "localHistoryRepository", "LWk/b;", "availabilityRepository", "Lvr/a;", "inspireRepository", "Lcom/ingka/ikea/app/productinformationpage/network/b;", "financialServicesRemoteDataSource", "Llm/a;", "backInStockApi", "Llm/f;", "backInStockNotificationAnalytics", "LIl/a;", "appConfigApi", "Lhi/c;", "getInStoreNavigationTileUseCase", "Lhi/i;", "getStockStatusTextUseCase", "Lhi/a;", "getAssemblyServiceDetailsUseCase", "LNd/c;", "abTesting", "", "startProductNo", "", "isTouchExplorationEnabled", "Lhi/g;", "getRecommendationsUseCase", "Lhi/k;", "shareItemUseCase", "Lug/k;", "labsFeatures", "<init>", "(Lsf/c;Lbi/a;LKf/b;LFB/a;Ltf/a;LQh/a;LMg/b;LWk/b;Lvr/a;Lcom/ingka/ikea/app/productinformationpage/network/b;Llm/a;Llm/f;LIl/a;Lhi/c;Lhi/i;Lhi/a;LNd/c;Ljava/lang/String;ZLhi/g;Lhi/k;Lug/k;)V", "LXH/N;", "B1", "()V", "E1", "D1", "Lgi/d$d;", "onlineStatus", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "X1", "(Lgi/d$d;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "", "includingVat", "C1", "(D)V", "itemNo", "name", "A1", "(Ljava/lang/String;Ljava/lang/String;)V", "f2", "show", "S1", "(Z)V", "T1", "g2", "c2", "Landroidx/lifecycle/K;", "Lip/k;", "Lgi/V;", "", "receiver", "Lgi/O;", "type", "I1", "(Landroidx/lifecycle/K;Lgi/O;)V", "G1", "Lop/k;", "productAndFacets", "Lip/k$e;", "status", "h2", "(Lop/k;Lip/k$e;)V", "Z1", "", "Lfi/a;", "items", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "product", "z0", "(Lip/k$e;Lop/k;Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "y0", "(Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "x0", "A0", "(Ljava/util/List;)V", "Y1", "(Lip/k$e;)V", "fullscreen", "Lfi/a$k;", "V0", "(ZLip/k$e;)Lfi/a$k;", "Lfi/a$s;", "d1", "()Lfi/a$s;", "Lfi/a$x;", "k1", "()Lfi/a$x;", "Lfi/a$p;", "a1", "()Lfi/a$p;", "isSoldOnline", "itemType", "g1", "(ZLjava/lang/String;Ljava/lang/String;)Lfi/a;", "f1", "(Ljava/lang/String;Ljava/lang/String;Z)Lfi/a;", "Lfi/a$n;", "X0", "()Lfi/a$n;", "productLarge", "", "Lfi/a$m;", "O0", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)Ljava/util/List;", "Lfi/a$C;", "u1", "Lop/h;", "facets", "Lfi/a$e;", "T0", "(Ljava/util/List;)Lfi/a$e;", "", "rating", "", "reviewCount", "Lfi/a$y;", "l1", "(Lcom/ingka/ikea/core/model/product/ProductLarge;FI)Lfi/a$y;", "Lcom/ingka/ikea/core/model/product/Measurements;", "measurements", "Lgi/m;", "U0", "(Lcom/ingka/ikea/core/model/product/Measurements;)Lgi/m;", "Lip/l;", "Lcom/ingka/ikea/app/stockinfo/local/a;", "stockResource", "Lgi/N;", "S0", "(Lip/l;Lcom/ingka/ikea/core/model/product/ProductLarge;)Lgi/N;", "stockModel", "LEB/d;", "lastStore", "s1", "(Lcom/ingka/ikea/app/stockinfo/local/a;LEB/d;Lcom/ingka/ikea/core/model/product/ProductLarge;)Lgi/N;", "LWk/f;", "stockEntity", "fallbackTitle", "Ldi/u;", "Q0", "(Lcom/ingka/ikea/app/stockinfo/local/a;LWk/f;Ljava/lang/String;)Ljava/util/List;", "footerTexts", "Lfi/a$i;", "Y0", "(Ljava/util/List;)Lfi/a$i;", "Lgi/n;", "c1", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)Lgi/n;", "Lei/w;", "F0", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)Lei/w;", "Lgi/S;", "list", "LTh/a;", "W0", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/lifecycle/L;", "G0", "()Landroidx/lifecycle/L;", "K0", "j2", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "b2", "C0", "E0", "Lhk/g$a;", "I0", "D0", "a2", "(Ljava/lang/String;)V", "O1", "v1", "F1", "i2", "Q1", "R0", "()Ljava/lang/String;", "addedFrom", "J1", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Llm/a$c;", "fulfilmentOption", "U1", "(Ljava/lang/String;Ljava/lang/String;Llm/a$c;)V", "W1", "(Ljava/lang/String;Llm/a$c;)V", "onCleared", "position", "e2", "(I)V", "Landroid/content/Context;", "context", "includePrice", "R1", "(Landroid/content/Context;Z)V", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "componentValue", "d2", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/lang/String;)V", "z1", "()Z", "LQh/i;", "event", "V1", "(LQh/i;)V", "productName", "B0", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "M0", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;LdI/e;)Ljava/lang/Object;", "M1", "N1", "L1", "m", "Lbi/a;", "n", "LKf/b;", "o", "LFB/a;", "p", "Ltf/a;", "q", "LQh/a;", "r", "LMg/b;", "s", "LWk/b;", "t", "Lvr/a;", "u", "Lcom/ingka/ikea/app/productinformationpage/network/b;", "v", "Llm/a;", "w", "Llm/f;", "x", "LIl/a;", "y", "Lhi/c;", "z", "Lhi/i;", "A", "Lhi/a;", "B", "LNd/c;", "C", "Z", "D", "Lhi/g;", "E", "Lhi/k;", "F", "Lug/k;", "G", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "value", "H", "Ljava/lang/String;", "i1", "productNo", "LXH/v;", "I", "LXH/v;", "currentHomeAvailability", "J", "currentClickCollectAvailability", "kotlin.jvm.PlatformType", "K", "Landroidx/lifecycle/K;", "_productNoLiveData", "Landroidx/lifecycle/F;", "L", "Landroidx/lifecycle/F;", "j1", "()Landroidx/lifecycle/F;", "productNoLiveData", "M", "selectedImage", "N", "getDimensionsExpanded$productinformationpage_implementation_release", "setDimensionsExpanded$productinformationpage_implementation_release", "dimensionsExpanded", "LU0/r0;", "O", "LU0/r0;", "getStoreDetailsExpanded", "()LU0/r0;", "storeDetailsExpanded", "P", "Z0", "homeDeliveryExpanded", "Q", "getMoreInfoExpanded$productinformationpage_implementation_release", "setMoreInfoExpanded$productinformationpage_implementation_release", "moreInfoExpanded", "R", "getShowMoreInfo$productinformationpage_implementation_release", "setShowMoreInfo$productinformationpage_implementation_release", "showMoreInfo", "Lgi/K$c;", "S", "Lgi/K$c;", "productState", "T", "getSectionsList$productinformationpage_implementation_release", "()Landroidx/lifecycle/K;", "sectionsList", "U", "originalProductNo", "X", "moreLikeThis", "Y", "recommendations", "LKJ/c;", "LOp/a1;", "mustBeCompletedWith", "LTJ/B;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "LTJ/B;", "mustBeCompletedWithProducts", "showMustBeCompletedWith", "Lip/b;", "Lip/b;", "m1", "()Lip/b;", "scrollToMustCompleteWithSection", "Landroidx/lifecycle/L;", "selectedStoreObserver", "Lgi/M;", "updatedProductAvailabilityStatus", "Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails;", "_financialServicesDetails", "LTJ/P;", "Lgi/c;", "LTJ/P;", "assemblyServicesDetails", "Lzr/a;", "inspireImages", "Lhi/c$a;", "inStoreNavigationModel", "H0", "_productAndFacets", "productResponseObservable", "J0", "productResponseObserver", "productStockStatus", "L0", "stockResponseObservable", "stockResponseObserver", "Lgi/U;", "N0", "toolbarSection", "Lgi/a;", "_onCarouselAddToCart", "P0", "e1", "onCarouselAddToCart", "_shareItem", "shareAction", "shareItemObservable", "shareItemObserver", "_isAddingToCart", "r1", "signingUpBackInStockAction", "isSigningUpBackInStock", "Landroidx/lifecycle/I;", "Landroidx/lifecycle/I;", "_loading", "_showAddToCartButton", "w1", "setAddingToCart$productinformationpage_implementation_release", "(Landroidx/lifecycle/F;)V", "isAddingToCart", "_addToCartButtonText", "b1", "loading", "t1", "toolbarData", "o1", "shareItem", "n1", "sectionList", "_analyticsTrigger", "itemNosAddingToCartMustBeCompletedWith", "h1", "itemNosAddingToCart", "storeSelectionLiveData", "x1", "isCashAndCarryBackInStockEnabled", "y1", "isHomeDeliveryBackInStockEnabled", "p1", "shouldShowBackInStockExplanationDialog", "q1", "showAddToCartButton", "addToCartButtonText", "analyticsTrigger", "c", "b", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class K extends f0 {

    /* renamed from: j1  reason: collision with root package name */
    public static final a f73173j1 = new a((DefaultConstructorMarker) null);

    /* renamed from: k1  reason: collision with root package name */
    public static final int f73174k1 = 8;

    /* renamed from: A  reason: collision with root package name */
    private final hi.a f73175A;

    /* renamed from: A0  reason: collision with root package name */
    private final C11410b<Boolean> f73176A0;

    /* renamed from: B  reason: collision with root package name */
    private final Nd.c f73177B;

    /* renamed from: B0  reason: collision with root package name */
    private L<C12832d> f73178B0;

    /* renamed from: C  reason: collision with root package name */
    private final boolean f73179C;
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public final androidx.lifecycle.K<M> f73180C0;

    /* renamed from: D  reason: collision with root package name */
    private final hi.g f73181D;
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public final androidx.lifecycle.K<FinancialServicesDetails> f73182D0;

    /* renamed from: E  reason: collision with root package name */
    private final hi.k f73183E;

    /* renamed from: E0  reason: collision with root package name */
    private final C16519P<C9748c> f73184E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final ug.k f73185F;
    /* access modifiers changed from: private */

    /* renamed from: F0  reason: collision with root package name */
    public final androidx.lifecycle.K<C12550a> f73186F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public UserPostalCodeAddress f73187G;
    /* access modifiers changed from: private */

    /* renamed from: G0  reason: collision with root package name */
    public final androidx.lifecycle.K<c.a> f73188G0;

    /* renamed from: H  reason: collision with root package name */
    private String f73189H;

    /* renamed from: H0  reason: collision with root package name */
    private final androidx.lifecycle.K<ip.k<C11700k, String>> f73190H0;

    /* renamed from: I  reason: collision with root package name */
    private XH.v<? extends C9749d.C1283d, String> f73191I;

    /* renamed from: I0  reason: collision with root package name */
    private F<ip.k<C11700k, String>> f73192I0;

    /* renamed from: J  reason: collision with root package name */
    private XH.v<? extends C9749d.C1283d, C12832d> f73193J;

    /* renamed from: J0  reason: collision with root package name */
    private L<ip.k<C11700k, String>> f73194J0;

    /* renamed from: K  reason: collision with root package name */
    private final androidx.lifecycle.K<String> f73195K;

    /* renamed from: K0  reason: collision with root package name */
    private final androidx.lifecycle.K<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f73196K0;

    /* renamed from: L  reason: collision with root package name */
    private final F<String> f73197L;

    /* renamed from: L0  reason: collision with root package name */
    private F<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f73198L0;

    /* renamed from: M  reason: collision with root package name */
    private int f73199M;

    /* renamed from: M0  reason: collision with root package name */
    private L<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f73200M0;

    /* renamed from: N  reason: collision with root package name */
    private boolean f73201N;
    /* access modifiers changed from: private */

    /* renamed from: N0  reason: collision with root package name */
    public final androidx.lifecycle.K<U> f73202N0;

    /* renamed from: O  reason: collision with root package name */
    private final C4899r0<Boolean> f73203O;
    /* access modifiers changed from: private */

    /* renamed from: O0  reason: collision with root package name */
    public final C11410b<C9746a> f73204O0;

    /* renamed from: P  reason: collision with root package name */
    private final C4899r0<Boolean> f73205P;

    /* renamed from: P0  reason: collision with root package name */
    private final F<C9746a> f73206P0;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f73207Q;

    /* renamed from: Q0  reason: collision with root package name */
    private final androidx.lifecycle.K<ip.k<g.a, Throwable>> f73208Q0;

    /* renamed from: R  reason: collision with root package name */
    private boolean f73209R;

    /* renamed from: R0  reason: collision with root package name */
    private final C11410b<ip.k<g.a, Throwable>> f73210R0;

    /* renamed from: S  reason: collision with root package name */
    private c f73211S = c.INIT;

    /* renamed from: S0  reason: collision with root package name */
    private F<ip.k<g.a, Throwable>> f73212S0;

    /* renamed from: T  reason: collision with root package name */
    private final androidx.lifecycle.K<List<fi.a>> f73213T;

    /* renamed from: T0  reason: collision with root package name */
    private L<ip.k<g.a, Throwable>> f73214T0;

    /* renamed from: U  reason: collision with root package name */
    private String f73215U;
    /* access modifiers changed from: private */

    /* renamed from: U0  reason: collision with root package name */
    public final androidx.lifecycle.K<ip.k<Boolean, Throwable>> f73216U0;

    /* renamed from: V0  reason: collision with root package name */
    private final C11410b<ip.k<Integer, Throwable>> f73217V0;
    /* access modifiers changed from: private */

    /* renamed from: W0  reason: collision with root package name */
    public final androidx.lifecycle.K<ip.k<Integer, Throwable>> f73218W0;

    /* renamed from: X  reason: collision with root package name */
    private final androidx.lifecycle.K<ip.k<V, Throwable>> f73219X;

    /* renamed from: X0  reason: collision with root package name */
    private final I<Boolean> f73220X0;

    /* renamed from: Y  reason: collision with root package name */
    private final androidx.lifecycle.K<ip.k<V, Throwable>> f73221Y;

    /* renamed from: Y0  reason: collision with root package name */
    private final androidx.lifecycle.K<Boolean> f73222Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public final androidx.lifecycle.K<C15987c<a1>> f73223Z;

    /* renamed from: Z0  reason: collision with root package name */
    private F<ip.k<Boolean, Throwable>> f73224Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final androidx.lifecycle.K<String> f73225a1;

    /* renamed from: b1  reason: collision with root package name */
    private final F<Boolean> f73226b1;

    /* renamed from: c1  reason: collision with root package name */
    private final F<U> f73227c1;

    /* renamed from: d1  reason: collision with root package name */
    private final F<ip.k<g.a, Throwable>> f73228d1;

    /* renamed from: e1  reason: collision with root package name */
    private final F<List<fi.a>> f73229e1;

    /* renamed from: f1  reason: collision with root package name */
    private final C11410b<ProductLarge> f73230f1;

    /* renamed from: g1  reason: collision with root package name */
    private final C16505B<List<String>> f73231g1;

    /* renamed from: h1  reason: collision with root package name */
    private final C16505B<List<String>> f73232h1;
    /* access modifiers changed from: private */

    /* renamed from: i1  reason: collision with root package name */
    public final F<C12832d> f73233i1;

    /* renamed from: m  reason: collision with root package name */
    private final bi.a f73234m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C9133b f73235n;

    /* renamed from: o  reason: collision with root package name */
    private final C12860a f73236o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C10253a f73237p;

    /* renamed from: q  reason: collision with root package name */
    private final Qh.a f73238q;

    /* renamed from: r  reason: collision with root package name */
    private final Mg.b f73239r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Wk.b f73240s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C12206a f73241t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final com.ingka.ikea.app.productinformationpage.network.b f73242u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C11550a f73243v;

    /* renamed from: w  reason: collision with root package name */
    private final lm.f f73244w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final Il.a f73245x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final hi.c f73246y;

    /* renamed from: y0  reason: collision with root package name */
    private final C16505B<List<ProductItem>> f73247y0;

    /* renamed from: z  reason: collision with root package name */
    private final hi.i f73248z;

    /* renamed from: z0  reason: collision with root package name */
    private final C16505B<Boolean> f73249z0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgi/K$a;", "", "<init>", "()V", "Lgi/K$b;", "assistedFactory", "", "initialKey", "", "isTouchExplorationEnabled", "Landroidx/lifecycle/i0$d;", "a", "(Lgi/K$b;Ljava/lang/String;Z)Landroidx/lifecycle/i0$d;", "", "LOWEST_ALLOWED_RATING", "F", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"gi/K$a$a", "Landroidx/lifecycle/i0$d;", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gi.K$a$a  reason: collision with other inner class name */
        public static final class C1279a extends i0.d {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f73250e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f73251f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ boolean f73252g;

            C1279a(b bVar, String str, boolean z10) {
                this.f73250e = bVar;
                this.f73251f = str;
                this.f73252g = z10;
            }

            public <T extends f0> T create(Class<T> cls) {
                C17542s.j(cls, "modelClass");
                T a10 = this.f73250e.a(this.f73251f, this.f73252g);
                C17542s.h(a10, "null cannot be cast to non-null type T of com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel.Companion.provideFactory.<no name provided>.create");
                return a10;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i0.d a(b bVar, String str, boolean z10) {
            C17542s.j(bVar, "assistedFactory");
            C17542s.j(str, "initialKey");
            return new C1279a(bVar, str, z10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgi/K$b;", "", "", "initialKey", "", "isTouchExplorationEnabled", "Lgi/K;", "a", "(Ljava/lang/String;Z)Lgi/K;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        K a(String str, boolean z10);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgi/K$c;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "IDLE", "UPDATE_FACET", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum c {
        INIT,
        IDLE,
        UPDATE_FACET;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73253a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f73254b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f73255c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f73256d;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39|40|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39|40|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39|40|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|39|40|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a0 */
        static {
            /*
                ip.k$e[] r0 = ip.k.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ip.k$e r2 = ip.k.e.LOADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ip.k$e r3 = ip.k.e.ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ip.k$e r4 = ip.k.e.NO_NETWORK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ip.k$e r5 = ip.k.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f73253a = r0
                gi.d$d[] r0 = gi.C9749d.C1283d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gi.d$d r5 = gi.C9749d.C1283d.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                gi.d$d r5 = gi.C9749d.C1283d.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                gi.d$d r5 = gi.C9749d.C1283d.LIMITED     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                gi.d$d r5 = gi.C9749d.C1283d.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                gi.d$d r4 = gi.C9749d.C1283d.FEATURE_TURNED_OFF     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                gi.d$d r4 = gi.C9749d.C1283d.MISSING_INPUT     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f73254b = r0
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c[] r0 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c r4 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.WEEE     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c r4 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.ECO     // Catch:{ NoSuchFieldError -> 0x007f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag$Fee$c r4 = com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.c.NONE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                f73255c = r0
                com.ingka.ikea.analytics.Interaction$Component[] r0 = com.ingka.ikea.analytics.Interaction$Component.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.analytics.Interaction$Component r4 = com.ingka.ikea.analytics.Interaction$Component.YOU_MAY_ALSO_LIKE     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                com.ingka.ikea.analytics.Interaction$Component r1 = com.ingka.ikea.analytics.Interaction$Component.MORE_LIKE_THIS     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                com.ingka.ikea.analytics.Interaction$Component r1 = com.ingka.ikea.analytics.Interaction$Component.UPSELL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                f73256d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi.K.d.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f73258b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, K k10, String str) {
            super(aVar);
            this.f73257a = k10;
            this.f73258b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            K k10 = this.f73257a;
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
                    String name = k10.getClass().getName();
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
            this.f73257a.f73204O0.d(new C9746a.C1280a(this.f73258b, th2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$addToCartForRecommendation$3", f = "PipViewModel.kt", l = {1983}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f73260d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f73261e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73262f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Interaction$Component f73263g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(K k10, String str, String str2, Interaction$Component interaction$Component, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f73260d = k10;
            this.f73261e = str;
            this.f73262f = str2;
            this.f73263g = interaction$Component;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f73260d, this.f73261e, this.f73262f, this.f73263g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73259c;
            if (i10 == 0) {
                y.b(obj);
                K k10 = this.f73260d;
                String str = this.f73261e;
                String str2 = this.f73262f;
                Interaction$Component interaction$Component = this.f73263g;
                this.f73259c = 1;
                if (k10.M0(str, str2, interaction$Component, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel", f = "PipViewModel.kt", l = {2007}, m = "doAddToCart")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f73264c;

        /* renamed from: d  reason: collision with root package name */
        Object f73265d;

        /* renamed from: e  reason: collision with root package name */
        Object f73266e;

        /* renamed from: f  reason: collision with root package name */
        Object f73267f;

        /* renamed from: g  reason: collision with root package name */
        Object f73268g;

        /* renamed from: h  reason: collision with root package name */
        Object f73269h;

        /* renamed from: i  reason: collision with root package name */
        int f73270i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f73271j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ K f73272k;

        /* renamed from: l  reason: collision with root package name */
        int f73273l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(K k10, C17164e<? super g> eVar) {
            super(eVar);
            this.f73272k = k10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73271j = obj;
            this.f73273l |= Integer.MIN_VALUE;
            return this.f73272k.M0((String) null, (String) null, (Interaction$Component) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$h", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73274a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(N.a aVar, K k10) {
            super(aVar);
            this.f73274a = k10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch availability";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            ip.j.b(this.f73274a.f73180C0, new M.b(new Wk.a(a.C1886a.UNAVAILABLE)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$loadAvailability$2", f = "PipViewModel.kt", l = {485}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f73275c;

        /* renamed from: d  reason: collision with root package name */
        int f73276d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f73277e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(K k10, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f73277e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f73277e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            M m10;
            Object f10 = C17187b.f();
            int i10 = this.f73276d;
            e.b bVar = null;
            if (i10 == 0) {
                y.b(obj);
                ip.j.b(this.f73277e.f73180C0, M.c.f73328a);
                Wk.b d02 = this.f73277e.f73240s;
                String i12 = this.f73277e.i1();
                UserPostalCodeAddress o02 = this.f73277e.f73187G;
                String d10 = o02 != null ? o02.d() : null;
                UserPostalCodeAddress o03 = this.f73277e.f73187G;
                String c10 = o03 != null ? o03.c() : null;
                C12832d dVar = (C12832d) this.f73277e.f73233i1.getValue();
                String e10 = dVar != null ? dVar.e() : null;
                String str = e10 == null ? "" : e10;
                this.f73275c = e10;
                this.f73276d = 1;
                obj = d02.c(i12, d10, c10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str2 = (String) this.f73275c;
                try {
                    y.b(obj);
                } catch (Wk.a e11) {
                    m10 = new M.b(e11);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Wk.e eVar = (Wk.e) obj;
            e.b a10 = eVar.b().a();
            e.a.b d11 = eVar.d();
            if (d11 != null) {
                bVar = d11.a();
            }
            m10 = new M.a(a10, bVar, eVar.a());
            if (m10.b() == C9749d.C1283d.UNAVAILABLE) {
                this.f73277e.Z0().setValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            ip.j.b(this.f73277e.f73180C0, m10);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$j", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73278a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(N.a aVar, K k10) {
            super(aVar);
            this.f73278a = k10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch financial services";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$loadFinancialServices$3", f = "PipViewModel.kt", l = {584}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f73280d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ double f73281e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(K k10, double d10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f73280d = k10;
            this.f73281e = d10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f73280d, this.f73281e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73279c;
            if (i10 == 0) {
                y.b(obj);
                ip.j.b(this.f73280d.f73182D0, null);
                com.ingka.ikea.app.productinformationpage.network.b g02 = this.f73280d.f73242u;
                double d10 = this.f73281e;
                this.f73279c = 1;
                obj = g02.a(d10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ip.j.b(this.f73280d.f73182D0, (FinancialServicesDetails) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$l", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73282a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(N.a aVar, K k10) {
            super(aVar);
            this.f73282a = k10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch in store navigation details";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            ip.j.b(this.f73282a.f73188G0, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$loadInStoreNavigationDetails$2", f = "PipViewModel.kt", l = {539}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f73283c;

        /* renamed from: d  reason: collision with root package name */
        int f73284d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f73285e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(K k10, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f73285e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f73285e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73284d;
            if (i10 == 0) {
                y.b(obj);
                String str = null;
                ip.j.b(this.f73285e.f73188G0, null);
                hi.c h02 = this.f73285e.f73246y;
                C12832d dVar = (C12832d) this.f73285e.f73233i1.getValue();
                if (dVar != null) {
                    str = dVar.e();
                }
                String str2 = str == null ? "" : str;
                String i12 = this.f73285e.i1();
                this.f73283c = str;
                this.f73284d = 1;
                obj = h02.a(str2, i12, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str3 = (String) this.f73283c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ip.j.b(this.f73285e.f73188G0, (c.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$n", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73286a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(N.a aVar, K k10) {
            super(aVar);
            this.f73286a = k10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch inspire images";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            ip.j.b(this.f73286a.f73186F0, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$loadInspireImages$2", f = "PipViewModel.kt", l = {522}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73287c;

        /* renamed from: d  reason: collision with root package name */
        int f73288d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f73289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(K k10, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f73289e = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f73289e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73288d;
            if (i10 == 0) {
                y.b(obj);
                int i11 = this.f73289e.f73185F.n() ? 5 : 3;
                C12206a k02 = this.f73289e.f73241t;
                String i12 = this.f73289e.i1();
                this.f73287c = i11;
                this.f73288d = 1;
                obj = k02.b(i12, i11, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ip.j.b(this.f73289e.f73186F0, (C12550a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "itemNosAddingToCart", "Lcom/ingka/ikea/core/model/product/ProductItem;", "data", "", "showMustBeCompletedWith", "LXH/N;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$observeMustBeCompletedWith$1", f = "PipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.r<List<? extends String>, List<? extends ProductItem>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73290c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73291d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73292e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f73293f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f73294g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(K k10, C17164e<? super p> eVar) {
            super(4, eVar);
            this.f73294g = k10;
        }

        public final Object i(List<String> list, List<ProductItem> list2, boolean z10, C17164e<? super C16807N> eVar) {
            p pVar = new p(this.f73294g, eVar);
            pVar.f73291d = list;
            pVar.f73292e = list2;
            pVar.f73293f = z10;
            return pVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f73290c == 0) {
                y.b(obj);
                List list = (List) this.f73291d;
                List list2 = (List) this.f73292e;
                boolean z10 = this.f73293f;
                if (z10) {
                    Iterable<ProductItem> iterable = list2;
                    K k10 = this.f73294g;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (ProductItem productItem : iterable) {
                        a1.a aVar = null;
                        if (k10.f73237p.b() && productItem.j()) {
                            Iterable iterable2 = list;
                            boolean z11 = false;
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it = iterable2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (C17542s.e((String) it.next(), productItem.f())) {
                                            z11 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            aVar = new a1.a(C15985a.b(new C10850o.a(z11, (C10850o.d) null, 2, (DefaultConstructorMarker) null)));
                        }
                        arrayList.add(new a1(aVar, B0.h(productItem, k10.f73245x.s(), false, false, false, false, 28, (Object) null), k10.f73245x.s(), b1.a.f85084a, false, true, k10.f73245x.w()));
                    }
                    obj2 = C15985a.h(arrayList);
                } else {
                    obj2 = C15985a.a();
                }
                this.f73294g.f73223Z.setValue(obj2);
                if (z10) {
                    this.f73294g.m1().e(kotlin.coroutines.jvm.internal.b.a(true));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((List) obj, (List) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LXH/N;", "", "it", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$observeMustBeCompletedWith$2", f = "PipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C16807N>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73295c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f73296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(K k10, C17164e<? super q> eVar) {
            super(3, eVar);
            this.f73296d = k10;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            return new q(this.f73296d, eVar).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73295c == 0) {
                y.b(obj);
                this.f73296d.f73223Z.setValue(C15985a.a());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "itemsNumbersAddingToCart", "Lhi/g$a;", "data", "LXH/N;", "<anonymous>", "(Ljava/util/List;Lhi/g$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$observeRecommendation$1", f = "PipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.q<List<? extends String>, g.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73297c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73298d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73299e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.K<ip.k<V, Throwable>> f73300f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f73301g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(androidx.lifecycle.K<ip.k<V, Throwable>> k10, K k11, C17164e<? super r> eVar) {
            super(3, eVar);
            this.f73300f = k10;
            this.f73301g = k11;
        }

        /* renamed from: i */
        public final Object invoke(List<String> list, g.a aVar, C17164e<? super C16807N> eVar) {
            r rVar = new r(this.f73300f, this.f73301g, eVar);
            rVar.f73298d = list;
            rVar.f73299e = aVar;
            return rVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73297c == 0) {
                y.b(obj);
                List list = (List) this.f73298d;
                g.a aVar = (g.a) this.f73299e;
                Iterable<ProductItem> b10 = aVar.b();
                K k10 = this.f73301g;
                ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
                for (ProductItem o10 : b10) {
                    Set<String> a10 = aVar.a();
                    C11522d s10 = k10.f73245x.s();
                    boolean b11 = k10.f73237p.b();
                    List list2 = list;
                    List list3 = list;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(B0.o(o10, list2, a10, s10, k10.f73245x.w(), b11, true, false, false, false, 448, (Object) null));
                    arrayList = arrayList2;
                    list = list3;
                }
                this.f73300f.setValue(ip.k.f98528e.g(new V.a(C15985a.h(arrayList))));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LXH/N;", "", "throwable", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$observeRecommendation$2", f = "PipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class s extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C16807N>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73302c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f73303d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73304e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.K<ip.k<V, Throwable>> f73305f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(androidx.lifecycle.K<ip.k<V, Throwable>> k10, C17164e<? super s> eVar) {
            super(3, eVar);
            this.f73305f = k10;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            s sVar = new s(this.f73305f, eVar);
            sVar.f73303d = hVar;
            sVar.f73304e = th2;
            return sVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73302c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f73303d;
                Throwable th2 = (Throwable) this.f73304e;
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
                        String a10 = C11818a.a("Unable to fetch recommendations", th2);
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
                this.f73305f.setValue(k.a.b(ip.k.f98528e, (String) null, (Object) null, (Object) null, 7, (Object) null));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$t", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Interaction$Component f73307b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(N.a aVar, K k10, Interaction$Component interaction$Component) {
            super(aVar);
            this.f73306a = k10;
            this.f73307b = interaction$Component;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f73306a.f73216U0.setValue(k.a.b(ip.k.f98528e, (String) null, th2, (Object) null, 5, (Object) null));
            if (this.f73307b == Interaction$Component.PIP_ADD_TO_CART_BUTTON) {
                this.f73306a.T1(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$onAddToCart$2", f = "PipViewModel.kt", l = {682}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73308c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f73309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f73310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73311f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f73312g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Interaction$Component f73313h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(K k10, String str, int i10, Interaction$Component interaction$Component, C17164e<? super u> eVar) {
            super(2, eVar);
            this.f73310e = k10;
            this.f73311f = str;
            this.f73312g = i10;
            this.f73313h = interaction$Component;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            u uVar = new u(this.f73310e, this.f73311f, this.f73312g, this.f73313h, eVar);
            uVar.f73309d = obj;
            return uVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((u) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f73308c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f73309d;
                C9133b f02 = this.f73310e.f73235n;
                List e10 = C16877v.e(new Kf.y(this.f73311f, this.f73312g));
                Interaction$Component interaction$Component = this.f73313h;
                this.f73309d = q11;
                this.f73308c = 1;
                if (C9133b.C1020b.a(f02, e10, interaction$Component, (String) null, this, 4, (Object) null) == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f73309d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                    String a10 = C11818a.a("Add to cart successful", (Throwable) null);
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
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            this.f73310e.f73216U0.setValue(ip.k.f98528e.g(kotlin.coroutines.jvm.internal.b.a(true)));
            if (this.f73313h == Interaction$Component.PIP_ADD_TO_CART_BUTTON) {
                this.f73310e.T1(true);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gi/K$v", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f73314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11550a.c f73315b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(N.a aVar, K k10, C11550a.c cVar) {
            super(aVar);
            this.f73314a = k10;
            this.f73315b = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C9751f.a aVar;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to register back in stock push";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, th2, str4);
                str2 = str4;
                str3 = str5;
            }
            androidx.lifecycle.K v02 = this.f73314a.f73218W0;
            k.a aVar2 = ip.k.f98528e;
            lm.b bVar2 = th2 instanceof lm.b ? (lm.b) th2 : null;
            if (C17542s.e(bVar2, b.e.f99219a)) {
                th2 = C9751f.b.f73420a;
            } else if (C17542s.e(bVar2, b.f.f99220a) || C17542s.e(bVar2, b.d.f99218a) || C17542s.e(bVar2, b.c.f99217a) || C17542s.e(bVar2, b.C2260b.f99216a)) {
                lm.b bVar3 = (lm.b) th2;
                C11550a.c cVar = this.f73315b;
                U u10 = (U) this.f73314a.f73202N0.getValue();
                if (u10 != null) {
                    str = u10.d();
                }
                if (str != null) {
                    aVar = new C9751f.a(bVar3, cVar, str);
                    v02.setValue(k.a.b(aVar2, (String) null, aVar, (Object) null, 5, (Object) null));
                }
                throw new IllegalArgumentException("Required value was null.");
            } else if (!C17542s.e(bVar2, b.a.f99215a) && bVar2 != null) {
                throw new XH.t();
            }
            aVar = th2;
            v02.setValue(k.a.b(aVar2, (String) null, aVar, (Object) null, 5, (Object) null));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.PipViewModel$signupBackInStockPushNotification$3", f = "PipViewModel.kt", l = {739}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73316c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f73317d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11550a.c f73318e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73319f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f73320g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(K k10, C11550a.c cVar, String str, String str2, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f73317d = k10;
            this.f73318e = cVar;
            this.f73319f = str;
            this.f73320g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new w(this.f73317d, this.f73318e, this.f73319f, this.f73320g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((w) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73316c;
            if (i10 == 0) {
                y.b(obj);
                this.f73317d.f73218W0.setValue(k.a.d(ip.k.f98528e, (Object) null, 1, (Object) null));
                C11550a e02 = this.f73317d.f73243v;
                C11550a.c cVar = this.f73318e;
                String str = this.f73319f;
                String str2 = this.f73320g;
                this.f73316c = 1;
                obj = C11550a.b.a(e02, cVar, (C11550a.C2253a) null, str, str2, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f73317d.f73218W0.setValue(ip.k.f98528e.g(kotlin.coroutines.jvm.internal.b.e(((Number) obj).intValue())));
            return C16807N.f139792a;
        }
    }

    public K(C10242c cVar, bi.a aVar, C9133b bVar, C12860a aVar2, C10253a aVar3, Qh.a aVar4, Mg.b bVar2, Wk.b bVar3, C12206a aVar5, com.ingka.ikea.app.productinformationpage.network.b bVar4, C11550a aVar6, lm.f fVar, Il.a aVar7, hi.c cVar2, hi.i iVar, hi.a aVar8, Nd.c cVar3, String str, boolean z10, hi.g gVar, hi.k kVar, ug.k kVar2) {
        bi.a aVar9 = aVar;
        C9133b bVar5 = bVar;
        C12860a aVar10 = aVar2;
        C10253a aVar11 = aVar3;
        Qh.a aVar12 = aVar4;
        Mg.b bVar6 = bVar2;
        Wk.b bVar7 = bVar3;
        C12206a aVar13 = aVar5;
        com.ingka.ikea.app.productinformationpage.network.b bVar8 = bVar4;
        C11550a aVar14 = aVar6;
        lm.f fVar2 = fVar;
        Il.a aVar15 = aVar7;
        hi.c cVar4 = cVar2;
        hi.i iVar2 = iVar;
        hi.a aVar16 = aVar8;
        Nd.c cVar5 = cVar3;
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar9, "repository");
        C17542s.j(bVar5, "cartApi");
        C17542s.j(aVar10, "localStoreSelectionRepository");
        C17542s.j(aVar11, "killSwitchRepository");
        C17542s.j(aVar12, "pipAnalytics");
        C17542s.j(bVar6, "localHistoryRepository");
        C17542s.j(bVar7, "availabilityRepository");
        C17542s.j(aVar13, "inspireRepository");
        C17542s.j(bVar8, "financialServicesRemoteDataSource");
        C17542s.j(aVar14, "backInStockApi");
        C17542s.j(fVar2, "backInStockNotificationAnalytics");
        C17542s.j(aVar15, "appConfigApi");
        C17542s.j(cVar4, "getInStoreNavigationTileUseCase");
        C17542s.j(iVar2, "getStockStatusTextUseCase");
        C17542s.j(aVar8, "getAssemblyServiceDetailsUseCase");
        C17542s.j(cVar3, "abTesting");
        C17542s.j(str, "startProductNo");
        C17542s.j(gVar, "getRecommendationsUseCase");
        C17542s.j(kVar, "shareItemUseCase");
        C17542s.j(kVar2, "labsFeatures");
        this.f73234m = aVar9;
        this.f73235n = bVar5;
        this.f73236o = aVar10;
        this.f73237p = aVar11;
        this.f73238q = aVar12;
        this.f73239r = bVar6;
        this.f73240s = bVar7;
        this.f73241t = aVar13;
        this.f73242u = bVar8;
        this.f73243v = aVar14;
        this.f73244w = fVar2;
        this.f73245x = aVar15;
        this.f73246y = cVar4;
        this.f73248z = iVar2;
        this.f73175A = aVar8;
        this.f73177B = cVar3;
        this.f73179C = z10;
        this.f73181D = gVar;
        this.f73183E = kVar;
        this.f73185F = kVar2;
        this.f73187G = cVar.l();
        this.f73189H = str;
        androidx.lifecycle.K<String> k10 = new androidx.lifecycle.K<>(this.f73189H);
        this.f73195K = k10;
        this.f73197L = k10;
        Boolean bool = Boolean.FALSE;
        this.f73203O = u1.e(bool, (o1) null, 2, (Object) null);
        this.f73205P = u1.e(bool, (o1) null, 2, (Object) null);
        androidx.lifecycle.K<List<fi.a>> k11 = new androidx.lifecycle.K<>();
        this.f73213T = k11;
        k.a aVar17 = ip.k.f98528e;
        androidx.lifecycle.K<ip.k<V, Throwable>> k12 = new androidx.lifecycle.K<>(k.a.d(aVar17, (Object) null, 1, (Object) null));
        this.f73219X = k12;
        androidx.lifecycle.K<ip.k<V, Throwable>> k13 = new androidx.lifecycle.K<>(k.a.d(aVar17, (Object) null, 1, (Object) null));
        this.f73221Y = k13;
        androidx.lifecycle.K<C15987c<a1>> k14 = new androidx.lifecycle.K<>(C15985a.a());
        this.f73223Z = k14;
        this.f73247y0 = C16521S.a(C16877v.n());
        this.f73249z0 = C16521S.a(bool);
        this.f73176A0 = new C11410b<>();
        this.f73178B0 = new B(this);
        androidx.lifecycle.K<M> k15 = new androidx.lifecycle.K<>();
        this.f73180C0 = k15;
        androidx.lifecycle.K<FinancialServicesDetails> k16 = new androidx.lifecycle.K<>();
        this.f73182D0 = k16;
        C16519P<C9748c> c02 = C16534i.c0(aVar8.invoke(), g0.a(this), ip.f.a(), null);
        this.f73184E0 = c02;
        androidx.lifecycle.K<C12550a> k17 = new androidx.lifecycle.K<>();
        this.f73186F0 = k17;
        androidx.lifecycle.K<c.a> k18 = new androidx.lifecycle.K<>();
        this.f73188G0 = k18;
        androidx.lifecycle.K<ip.k<C11700k, String>> k19 = new androidx.lifecycle.K<>(k.a.d(aVar17, (Object) null, 1, (Object) null));
        this.f73190H0 = k19;
        androidx.lifecycle.K<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> k20 = new androidx.lifecycle.K<>(new l.b((Object) null, 1, (DefaultConstructorMarker) null));
        this.f73196K0 = k20;
        androidx.lifecycle.K<U> k21 = new androidx.lifecycle.K<>();
        this.f73202N0 = k21;
        C11410b<C9746a> bVar9 = new C11410b<>();
        this.f73204O0 = bVar9;
        this.f73206P0 = bVar9;
        androidx.lifecycle.K<ip.k<g.a, Throwable>> k22 = new androidx.lifecycle.K<>();
        this.f73208Q0 = k22;
        C11410b<ip.k<g.a, Throwable>> bVar10 = new C11410b<>();
        this.f73210R0 = bVar10;
        androidx.lifecycle.K<List<fi.a>> k23 = k11;
        androidx.lifecycle.K<ip.k<Boolean, Throwable>> k24 = new androidx.lifecycle.K<>();
        this.f73216U0 = k24;
        C11410b<ip.k<g.a, Throwable>> bVar11 = bVar10;
        this.f73217V0 = new C11410b<>();
        androidx.lifecycle.K<ip.k<Integer, Throwable>> k25 = new androidx.lifecycle.K<>();
        this.f73218W0 = k25;
        androidx.lifecycle.K<U> k26 = k21;
        I<Boolean> i10 = new I<>();
        Boolean bool2 = bool;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i10.b(k19, new L.b(new G(linkedHashSet, this, i10)));
        i10.b(k20, new L.b(new H(this, i10, linkedHashSet)));
        i10.b(k22, new L.b(new I(linkedHashSet, this, i10)));
        i10.b(k24, new L.b(new J(linkedHashSet, this, i10)));
        i10.b(k25, new L.b(new C9765u(linkedHashSet, i10, this)));
        i10.b(k13, new L.b(new C9766v(linkedHashSet, i10, this)));
        i10.b(k12, new L.b(new w(linkedHashSet, i10, this)));
        i10.b(k14, new L.b(new x(i10, this)));
        i10.b(k15, new L.b(new y(i10, this)));
        i10.b(k16, new L.b(new C(i10, this)));
        i10.b(k17, new L.b(new D(i10, this)));
        i10.b(k18, new L.b(new E(i10, this)));
        i10.b(C5210m.c(c02, (C17168i) null, 0, 3, (Object) null), new L.b(new F(i10, this)));
        this.f73220X0 = i10;
        this.f73222Y0 = new androidx.lifecycle.K<>(bool2);
        this.f73224Z0 = k24;
        this.f73225a1 = new androidx.lifecycle.K<>("");
        this.f73226b1 = i10;
        this.f73227c1 = k26;
        this.f73228d1 = bVar11;
        this.f73229e1 = k23;
        this.f73230f1 = new C11410b<>();
        this.f73231g1 = C16521S.a(C16877v.n());
        this.f73232h1 = C16521S.a(C16877v.n());
        this.f73233i1 = C5210m.c(aVar2.b(), (C17168i) null, 0, 3, (Object) null);
    }

    private final void A0(List<fi.a> list) {
        a.n X02 = X0();
        C9748c value = this.f73184E0.getValue();
        if (!(X02 == null && value == null)) {
            L.e(list, C9672m.c.f72893a);
        }
        if (value != null) {
            L.f(list, new a.C9718b(value), "divider_assembly_services");
        }
        if (X02 != null) {
            L.f(list, X02, "divider_financial_services");
        }
    }

    private final void A1(String str, String str2) {
        this.f73175A.a(new a.C1314a(str, str2));
    }

    private final void B1() {
        F0 unused = C16314k.d(g0.a(this), new h(N.f137593c0, this), (T) null, new i(this, (C17164e<? super i>) null), 2, (Object) null);
    }

    private final void C0() {
        androidx.lifecycle.L<ip.k<C11700k, String>> l10 = this.f73194J0;
        if (l10 != null) {
            F<ip.k<C11700k, String>> f10 = this.f73192I0;
            if (f10 != null) {
                f10.removeObserver(l10);
                this.f73192I0 = null;
            }
            this.f73194J0 = null;
        }
    }

    private final void C1(double d10) {
        double d11 = d10;
        if (this.f73237p.i()) {
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
                    String a10 = C11818a.a("Fetch financial services, value: " + d11, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = K.class.getName();
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
            F0 unused = C16314k.d(g0.a(this), new j(N.f137593c0, this), (T) null, new k(this, d11, (C17164e<? super k>) null), 2, (Object) null);
        }
    }

    private final void D0() {
        androidx.lifecycle.L<ip.k<g.a, Throwable>> l10 = this.f73214T0;
        if (l10 != null) {
            F<ip.k<g.a, Throwable>> f10 = this.f73212S0;
            if (f10 != null) {
                f10.removeObserver(l10);
                this.f73212S0 = null;
            }
            this.f73214T0 = null;
        }
    }

    private final void D1() {
        F0 unused = C16314k.d(g0.a(this), new l(N.f137593c0, this), (T) null, new m(this, (C17164e<? super m>) null), 2, (Object) null);
    }

    private final void E0() {
        androidx.lifecycle.L<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> l10 = this.f73200M0;
        if (l10 != null) {
            F<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f10 = this.f73198L0;
            if (f10 != null) {
                f10.removeObserver(l10);
                this.f73198L0 = null;
            }
            this.f73200M0 = null;
        }
    }

    private final void E1() {
        F0 unused = C16314k.d(g0.a(this), new n(N.f137593c0, this), (T) null, new o(this, (C17164e<? super o>) null), 2, (Object) null);
    }

    private final C9681w F0(ProductLarge productLarge) {
        Disclaimer q10 = productLarge.q();
        if (q10 == null) {
            return null;
        }
        return new C9681w(q10);
    }

    private final androidx.lifecycle.L<ip.k<C11700k, String>> G0() {
        return new z(this);
    }

    private final void G1() {
        C16534i.M(C16534i.g(C16534i.m(this.f73231g1, this.f73247y0, this.f73249z0, new p(this, (C17164e<? super p>) null)), new q(this, (C17164e<? super q>) null)), g0.a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: op.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: op.k} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H0(gi.K r21, ip.k r22) {
        /*
            r0 = r21
            r1 = r22
            java.lang.String r2 = "res"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            boolean r2 = r1 instanceof ip.k.f
            java.lang.String r3 = "|"
            java.lang.String r4 = "b"
            java.lang.String r5 = "m"
            java.lang.String r7 = "main"
            java.lang.String r8 = "Kt"
            r10 = 36
            r11 = 2
            r12 = 0
            if (r2 == 0) goto L_0x0142
            qv.e r2 = qv.e.DEBUG
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x002e:
            boolean r15 = r13.hasNext()
            r6 = 0
            if (r15 == 0) goto L_0x0046
            java.lang.Object r15 = r13.next()
            r9 = r15
            qv.b r9 = (qv.C11819b) r9
            boolean r6 = r9.b(r2, r6)
            if (r6 == 0) goto L_0x002e
            r14.add(r15)
            goto L_0x002e
        L_0x0046:
            java.util.Iterator r9 = r14.iterator()
            r13 = r12
            r14 = r13
        L_0x004c:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x00c8
            java.lang.Object r15 = r9.next()
            qv.b r15 = (qv.C11819b) r15
            r6 = 0
            if (r13 != 0) goto L_0x0069
            java.lang.String r13 = "Successfully loaded resource"
            java.lang.String r13 = qv.C11818a.a(r13, r6)
            if (r13 != 0) goto L_0x0065
            goto L_0x00c8
        L_0x0065:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x0069:
            r20 = r13
            if (r14 != 0) goto L_0x00b1
            java.lang.Class r13 = r21.getClass()
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            java.lang.String r14 = HJ.C15854t.s1(r13, r10, r12, r11, r12)
            r10 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r10, r12, r11, r12)
            int r10 = r14.length()
            if (r10 != 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            java.lang.String r13 = HJ.C15854t.P0(r14, r8)
        L_0x008d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r14 = 1
            boolean r10 = HJ.C15854t.b0(r10, r7, r14)
            if (r10 == 0) goto L_0x009e
            r10 = r5
            goto L_0x009f
        L_0x009e:
            r10 = r4
        L_0x009f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r3)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
        L_0x00b1:
            r10 = r14
            r13 = r15
            r14 = r2
            r15 = r10
            r19 = 0
            r16 = r19
            r17 = r6
            r18 = r20
            r13.a(r14, r15, r16, r17, r18)
            r14 = r10
            r6 = r19
            r13 = r20
            r10 = 36
            goto L_0x004c
        L_0x00c8:
            androidx.lifecycle.K<ip.k<op.k, java.lang.String>> r2 = r0.f73190H0
            r2.postValue(r1)
            ip.b<com.ingka.ikea.core.model.product.ProductLarge> r2 = r0.f73230f1
            ip.k$f r1 = (ip.k.f) r1
            java.lang.Object r3 = r1.d()
            op.k r3 = (op.C11700k) r3
            com.ingka.ikea.core.model.product.ProductLarge r3 = r3.c()
            r2.postValue(r3)
            TJ.B<java.util.List<com.ingka.ikea.core.model.product.ProductItem>> r2 = r0.f73247y0
            java.lang.Object r3 = r1.d()
            op.k r3 = (op.C11700k) r3
            java.util.List r3 = r3.b()
            r2.setValue(r3)
            Nd.c r4 = r0.f73177B
            r8 = 6
            r9 = 0
            java.lang.String r5 = "view_item"
            r6 = 0
            r7 = 0
            Nd.c.a.a(r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.a()
            op.k r1 = (op.C11700k) r1
            if (r1 == 0) goto L_0x013d
            com.ingka.ikea.core.model.product.ProductLarge r1 = r1.c()
            if (r1 == 0) goto L_0x013d
            r21.g2()
            r21.c2()
            r21.G1()
            r0.b2(r1)
            r21.f2()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r2 = r1.h()
            com.ingka.ikea.core.model.product.ProductItem$Price r2 = r2.g()
            com.ingka.ikea.core.model.product.ProductItem$Price$PriceTag r2 = r2.e()
            double r2 = r2.c()
            r0.C1(r2)
            java.lang.String r2 = r1.i()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r3 = r1.h()
            java.lang.String r3 = r3.i()
            r0.A1(r2, r3)
            r21.E1()
            r0.j2(r1)
        L_0x013d:
            r21.C0()
            goto L_0x0254
        L_0x0142:
            boolean r2 = r1 instanceof ip.k.d
            if (r2 == 0) goto L_0x016a
            r21.C0()
            androidx.lifecycle.K<ip.k<op.k, java.lang.String>> r0 = r0.f73190H0
            ip.k$d r1 = (ip.k.d) r1
            java.lang.Object r2 = r0.getValue()
            ip.k r2 = (ip.k) r2
            if (r2 == 0) goto L_0x015c
            java.lang.Object r2 = r2.a()
            r12 = r2
            op.k r12 = (op.C11700k) r12
        L_0x015c:
            r4 = r12
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            ip.k$d r1 = ip.k.d.e(r1, r2, r3, r4, r5, r6)
            r0.postValue(r1)
            goto L_0x0254
        L_0x016a:
            boolean r2 = r1 instanceof ip.k.b
            if (r2 == 0) goto L_0x0192
            r21.C0()
            androidx.lifecycle.K<ip.k<op.k, java.lang.String>> r0 = r0.f73190H0
            ip.k$b r1 = (ip.k.b) r1
            java.lang.Object r2 = r0.getValue()
            ip.k r2 = (ip.k) r2
            if (r2 == 0) goto L_0x0184
            java.lang.Object r2 = r2.a()
            r12 = r2
            op.k r12 = (op.C11700k) r12
        L_0x0184:
            r4 = r12
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            ip.k$b r1 = ip.k.b.e(r1, r2, r3, r4, r5, r6)
            r0.postValue(r1)
            goto L_0x0254
        L_0x0192:
            qv.e r2 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01a5:
            boolean r10 = r6.hasNext()
            r15 = 0
            if (r10 == 0) goto L_0x01bd
            java.lang.Object r10 = r6.next()
            r13 = r10
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r2, r15)
            if (r13 == 0) goto L_0x01a5
            r9.add(r10)
            goto L_0x01a5
        L_0x01bd:
            java.util.Iterator r6 = r9.iterator()
            r9 = r12
            r10 = r9
        L_0x01c3:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0254
            java.lang.Object r13 = r6.next()
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            if (r9 != 0) goto L_0x01f3
            ip.k$e r9 = r22.c()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "Other state: "
            r15.append(r11)
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r14)
            if (r9 != 0) goto L_0x01ef
            goto L_0x0254
        L_0x01ef:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x01f3:
            if (r10 != 0) goto L_0x023d
            java.lang.Class r10 = r21.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r11 = 36
            r15 = 2
            java.lang.String r14 = HJ.C15854t.s1(r10, r11, r12, r15, r12)
            r11 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r11, r12, r15, r12)
            int r18 = r14.length()
            if (r18 != 0) goto L_0x0214
            goto L_0x0218
        L_0x0214:
            java.lang.String r10 = HJ.C15854t.P0(r14, r8)
        L_0x0218:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r11 = 1
            boolean r14 = HJ.C15854t.b0(r14, r7, r11)
            if (r14 == 0) goto L_0x0229
            r14 = r5
            goto L_0x022a
        L_0x0229:
            r14 = r4
        L_0x022a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r11.append(r3)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            goto L_0x023e
        L_0x023d:
            r15 = 2
        L_0x023e:
            r11 = 0
            r14 = r2
            r19 = r15
            r20 = 0
            r15 = r10
            r16 = r20
            r17 = r11
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)
            r11 = r19
            r15 = r20
            goto L_0x01c3
        L_0x0254:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.H0(gi.K, ip.k):void");
    }

    private final androidx.lifecycle.L<ip.k<g.a, Throwable>> I0() {
        return new C9764t(this);
    }

    private final void I1(androidx.lifecycle.K<ip.k<V, Throwable>> k10, O o10) {
        k10.setValue(k.a.d(ip.k.f98528e, (Object) null, 1, (Object) null));
        C16534i.M(C16534i.g(C16534i.n(this.f73232h1, this.f73181D.a(this.f73189H, o10), new r(k10, this, (C17164e<? super r>) null)), new s(k10, (C17164e<? super s>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public static final void J0(K k10, ip.k kVar) {
        F<ip.k<g.a, Throwable>> f10;
        g.a aVar;
        C17542s.j(kVar, "res");
        int i10 = d.f73253a[kVar.c().ordinal()];
        if (i10 == 2 || i10 == 3) {
            k10.f73208Q0.postValue(k.a.b(ip.k.f98528e, (String) null, kVar.b(), (Object) null, 5, (Object) null));
            androidx.lifecycle.L<ip.k<g.a, Throwable>> l10 = k10.f73214T0;
            if (l10 != null && (f10 = k10.f73212S0) != null) {
                f10.removeObserver(l10);
            }
        } else if (i10 == 4 && (aVar = (g.a) kVar.a()) != null) {
            k10.f73208Q0.postValue(ip.k.f98528e.g(aVar));
            k10.D0();
        }
    }

    private final androidx.lifecycle.L<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> K0() {
        return new A(this);
    }

    /* access modifiers changed from: private */
    public static final void L0(K k10, ip.l lVar) {
        C17542s.j(lVar, "res");
        if (lVar instanceof l.c) {
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
                    String a10 = C11818a.a("Successfully loaded stock status: " + lVar, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = k10.getClass().getName();
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
            k10.f73196K0.postValue(lVar);
            k10.E0();
            com.ingka.ikea.app.stockinfo.local.b b10 = ((com.ingka.ikea.app.stockinfo.local.a) ((l.c) lVar).a()).b();
            String str5 = "unavailable";
            if (b10 instanceof b.c) {
                if (C16877v.q(com.ingka.ikea.app.stockinfo.network.d.HIGH_IN_STOCK, com.ingka.ikea.app.stockinfo.network.d.MEDIUM_IN_STOCK, com.ingka.ikea.app.stockinfo.network.d.LOW_IN_STOCK).contains(((b.c) b10).a().k())) {
                    str5 = "available";
                }
            } else if (!(b10 instanceof b.a) && !C17542s.e(b10, b.C2056b.f92553a) && b10 != null) {
                throw new XH.t();
            }
            k10.f73238q.o(str5);
        } else if (lVar instanceof l.a) {
            k10.f73196K0.postValue(lVar);
            k10.E0();
        } else if (!(lVar instanceof l.b)) {
            throw new XH.t();
        }
    }

    private final List<a.m> O0(ProductLarge productLarge) {
        ArrayList arrayList = new ArrayList();
        for (ProductItem.Price.PriceTag.Fee fee : productLarge.h().g().e().b()) {
            int i10 = d.f73255c[fee.e().ordinal()];
            if (i10 == 1 || i10 == 2) {
                arrayList.add(new a.m(new C9754i(fee)));
            } else if (i10 == 3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown fee type has been introduced");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList2) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = arrayList.getClass().getName();
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
        return arrayList;
    }

    private final void O1() {
        ip.k value = this.f73190H0.getValue();
        if (value != null) {
            h2((C11700k) value.a(), value.c());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P(Set set, I i10, K k10, ip.k kVar) {
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        kVar.c();
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void P1(K k10, C12832d dVar) {
        if (k10.f73211S == c.INIT) {
            k10.F1();
        } else {
            k10.f2();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(Set set, I i10, K k10, ip.k kVar) {
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        kVar.c();
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0145, code lost:
        if (r0 != null) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<di.u> Q0(com.ingka.ikea.app.stockinfo.local.a r17, Wk.f r18, java.lang.String r19) {
        /*
            r16 = this;
            java.util.List r0 = r17.a()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "substring(...)"
            r2 = 1
            java.lang.String r3 = "toUpperCase(...)"
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            r5 = 0
            if (r0 != 0) goto L_0x00dd
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r6 = r17.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x004d
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.ingka.ikea.app.stockinfo.local.b$a r9 = (com.ingka.ikea.app.stockinfo.local.b.a) r9
            java.lang.String r9 = r9.d()
            java.lang.Object r10 = r7.get(r9)
            if (r10 != 0) goto L_0x0047
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r7.put(r9, r10)
        L_0x0047:
            java.util.List r10 = (java.util.List) r10
            r10.add(r8)
            goto L_0x0028
        L_0x004d:
            java.util.Set r6 = r7.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0055:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d7
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0073:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0055
            java.lang.Object r9 = r7.next()
            com.ingka.ikea.app.stockinfo.local.b$a r9 = (com.ingka.ikea.app.stockinfo.local.b.a) r9
            java.lang.String r11 = r9.i()
            java.lang.String r10 = r9.c()
            int r12 = r10.length()
            if (r12 <= 0) goto L_0x00b7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            char r13 = r10.charAt(r5)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            kotlin.jvm.internal.C17542s.h(r13, r4)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toUpperCase(r14)
            kotlin.jvm.internal.C17542s.i(r13, r3)
            r12.append(r13)
            java.lang.String r10 = r10.substring(r2)
            kotlin.jvm.internal.C17542s.i(r10, r1)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
        L_0x00b7:
            r12 = r10
            il.g r10 = il.g.f98371a
            java.lang.String r13 = r9.e()
            java.lang.String r13 = r10.a(r13)
            java.lang.String r14 = r9.a()
            java.lang.String r15 = r9.b()
            di.u r10 = new di.u
            r9 = r10
            r2 = r10
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.add(r2)
            r2 = 1
            goto L_0x0073
        L_0x00d7:
            java.util.List r0 = YH.C16877v.t1(r0)
            goto L_0x014b
        L_0x00dd:
            java.lang.String r2 = r18.e()
            if (r2 == 0) goto L_0x0147
            java.lang.String r0 = r18.p()
            if (r0 != 0) goto L_0x00eb
            r0 = r19
        L_0x00eb:
            java.lang.String r6 = r18.d()
            if (r6 == 0) goto L_0x0126
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x0124
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            char r5 = r6.charAt(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            kotlin.jvm.internal.C17542s.h(r5, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r5.toUpperCase(r4)
            kotlin.jvm.internal.C17542s.i(r4, r3)
            r7.append(r4)
            r3 = 1
            java.lang.String r3 = r6.substring(r3)
            kotlin.jvm.internal.C17542s.i(r3, r1)
            r7.append(r3)
            java.lang.String r1 = r7.toString()
        L_0x0122:
            r4 = r1
            goto L_0x0128
        L_0x0124:
            r4 = r6
            goto L_0x0128
        L_0x0126:
            r1 = 0
            goto L_0x0122
        L_0x0128:
            il.g r1 = il.g.f98371a
            java.lang.String r3 = r18.f()
            java.lang.String r5 = r1.a(r3)
            java.lang.String r6 = r18.a()
            java.lang.String r7 = r18.b()
            di.u r8 = new di.u
            r1 = r8
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List r0 = YH.C16877v.e(r8)
            if (r0 != 0) goto L_0x014b
        L_0x0147:
            java.util.List r0 = YH.C16877v.n()
        L_0x014b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0156:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x018a
            java.lang.Object r2 = r0.next()
            r3 = r2
            di.u r3 = (di.u) r3
            java.lang.String r4 = r3.d()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x0186
            java.lang.String r4 = r3.a()
            if (r4 == 0) goto L_0x0179
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x0186
        L_0x0179:
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L_0x0156
            boolean r3 = HJ.C15854t.v0(r3)
            if (r3 == 0) goto L_0x0186
            goto L_0x0156
        L_0x0186:
            r1.add(r2)
            goto L_0x0156
        L_0x018a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.Q0(com.ingka.ikea.app.stockinfo.local.a, Wk.f, java.lang.String):java.util.List");
    }

    /* access modifiers changed from: private */
    public static final C16807N R(I i10, K k10, C15987c cVar) {
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
                String a10 = C11818a.a("Must be completed with updated", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(I i10, K k10, M m10) {
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
                String a10 = C11818a.a("Availability status updated: " + m10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    private final N S0(ip.l<com.ingka.ikea.app.stockinfo.local.a, String> lVar, ProductLarge productLarge) {
        ip.l<com.ingka.ikea.app.stockinfo.local.a, String> lVar2 = lVar;
        if (this.f73211S == c.INIT) {
            return null;
        }
        C12832d c10 = this.f73236o.c();
        if ((c10 != null ? c10.e() : null) == null) {
            return new C9749d.c(this.f73205P, (C12832d) null, productLarge.i(), productLarge.j(), x1(), C9749d.c.a.UNDEFINED, false, (L2) null, new C13023e.d(Ph.e.f62866r, (List) null, 2, (DefaultConstructorMarker) null), (C13023e) null, C16877v.n(), false, (C9757l) null);
        }
        if (lVar2 == null || (lVar2 instanceof l.a)) {
            return null;
        }
        if (lVar2 instanceof l.b) {
            return new T("loading_store_id");
        }
        if (lVar2 instanceof l.c) {
            return s1((com.ingka.ikea.app.stockinfo.local.a) ((l.c) lVar2).a(), c10, productLarge);
        }
        throw new XH.t();
    }

    private final void S1(boolean z10) {
        C11700k kVar;
        ProductLarge c10;
        ip.k value = this.f73190H0.getValue();
        if (value == null || (kVar = (C11700k) value.a()) == null || (c10 = kVar.c()) == null || !c10.t()) {
            this.f73222Y0.postValue(Boolean.FALSE);
        } else {
            this.f73222Y0.postValue(Boolean.valueOf(z10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N T(Set set, K k10, I i10, ip.k kVar) {
        ip.k value;
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        int i11 = d.f73253a[kVar.c().ordinal()];
        if (i11 == 1) {
            k10.S1(false);
        } else if (i11 == 2 || i11 == 3) {
            k10.f73211S = c.IDLE;
        } else if (i11 == 4) {
            k10.f73211S = c.IDLE;
            k10.S1(!k10.f73179C);
        } else {
            throw new XH.t();
        }
        if (!(k10.f73211S == c.UPDATE_FACET || (value = k10.f73190H0.getValue()) == null)) {
            k10.h2((C11700k) value.a(), value.c());
        }
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        return C16807N.f139792a;
    }

    private final a.e T0(List<C11697h> list) {
        ArrayList<C11697h> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C11697h) next).a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C11697h c10 : arrayList) {
            List<C11698i> c11 = c10.c();
            if (c11 == null) {
                c11 = C16877v.n();
            }
            C16877v.E(arrayList2, c11);
        }
        ArrayList<C11698i> arrayList3 = new ArrayList<>();
        for (Object next2 : arrayList2) {
            C11698i iVar = (C11698i) next2;
            if (iVar.b().length() > 0 && iVar.c().length() > 0) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (C11698i iVar2 : arrayList3) {
            arrayList4.add(new S(iVar2.c(), iVar2.b(), iVar2.e()));
        }
        if (arrayList4.size() > 1) {
            return new a.e(new C9752g(W0(arrayList4)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void T1(boolean z10) {
        this.f73249z0.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N U(I i10, K k10, FinancialServicesDetails financialServicesDetails) {
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
                String a10 = C11818a.a("Financial services status updated: " + financialServicesDetails, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    private final C9758m U0(Measurements measurements) {
        if (measurements != null) {
            return new C9758m(measurements, this.f73201N);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N V(I i10, K k10, C12550a aVar) {
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
                String a10 = C11818a.a("Inspire images updated", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    private final a.k V0(boolean z10, k.e eVar) {
        return d.f73253a[eVar.ordinal()] == 3 ? new a.k(new c0(Oo.b.f84526U8, z10)) : new a.k(new c0(Oo.b.f84626e4, z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N W(I i10, K k10, c.a aVar) {
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
                String a10 = C11818a.a("In-store navigation details updated: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: gi.S} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<Th.a> W0(java.util.List<gi.S> r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f73215U
            if (r0 != 0) goto L_0x0008
            java.lang.String r0 = r8.f73189H
            r8.f73215U = r0
        L_0x0008:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
        L_0x0014:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r9.next()
            r3 = r2
            gi.S r3 = (gi.S) r3
            java.lang.String r4 = r8.f73215U
            java.lang.String r5 = r3.c()
            boolean r4 = gi.L.g(r4, r5)
            if (r4 == 0) goto L_0x002e
            r1 = r3
        L_0x002e:
            if (r4 != 0) goto L_0x0014
            r0.add(r2)
            goto L_0x0014
        L_0x0034:
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r9.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r0.next()
            gi.S r2 = (gi.S) r2
            Th.a r3 = new Th.a
            java.lang.String r4 = r2.b()
            java.lang.String r5 = r2.c()
            java.lang.String r6 = r2.a()
            java.lang.String r7 = r8.f73189H
            java.lang.String r2 = r2.c()
            boolean r2 = gi.L.g(r7, r2)
            r3.<init>(r4, r5, r6, r2)
            r9.add(r3)
            goto L_0x0043
        L_0x006e:
            java.util.List r9 = YH.C16877v.w1(r9)
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009c
            if (r1 == 0) goto L_0x009c
            Th.a r0 = new Th.a
            java.lang.String r2 = r1.b()
            java.lang.String r3 = r1.c()
            java.lang.String r4 = r1.a()
            java.lang.String r5 = r8.f73189H
            java.lang.String r1 = r1.c()
            boolean r1 = gi.L.g(r5, r1)
            r0.<init>(r2, r3, r4, r1)
            r1 = 0
            r9.add(r1, r0)
        L_0x009c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.W0(java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    public static final C16807N X(I i10, K k10, C9748c cVar) {
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
                String a10 = C11818a.a("Assembly services details updated: " + cVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = i10.getClass().getName();
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
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        return C16807N.f139792a;
    }

    private final a.n X0() {
        FinancialServicesDetails value = this.f73182D0.getValue();
        if (value != null) {
            return new a.n(new C9755j(value.c(), value.b(), value.a()));
        }
        return null;
    }

    private final void X1(C9749d.C1283d dVar, Interaction$Component interaction$Component) {
        String str;
        switch (d.f73254b[dVar.ordinal()]) {
            case 1:
                str = "available";
                break;
            case 2:
                str = "unavailable";
                break;
            case 3:
                str = "order_size_dependency";
                break;
            case 4:
            case 5:
            case 6:
                str = "N/A";
                break;
            default:
                throw new XH.t();
        }
        this.f73238q.m(interaction$Component, str);
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(K k10, I i10, Set set, ip.l lVar) {
        ip.k value;
        if (!(k10.f73196K0.getValue() == null || (value = k10.f73190H0.getValue()) == null)) {
            k10.h2((C11700k) value.a(), value.c());
        }
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        return C16807N.f139792a;
    }

    private final a.i Y0(List<String> list) {
        return new a.i(new Th.b(C15985a.h(list), C17542s.e(this.f73222Y0.getValue(), Boolean.TRUE)));
    }

    private final void Y1(k.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (!(eVar == k.e.SUCCESS || eVar == k.e.LOADING)) {
            arrayList.add(V0(true, eVar));
        }
        if (!arrayList.isEmpty()) {
            this.f73213T.postValue(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(Set set, K k10, I i10, ip.k kVar) {
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        if (kVar.c() != k.e.LOADING) {
            k10.f73210R0.e(kVar);
        }
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        return C16807N.f139792a;
    }

    private final void Z1(C11700k kVar, k.e eVar) {
        Object obj;
        k.e eVar2 = eVar;
        ArrayList arrayList = new ArrayList();
        ProductLarge c10 = kVar.c();
        C9681w F02 = F0(c10);
        List<String> f10 = c10.f();
        if (f10 != null) {
            Iterator it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((String) obj).length() > 0) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                arrayList.add(new a.u(new C9760o(str)));
            }
        }
        Iterable<Media> g10 = c10.g();
        ArrayList arrayList2 = new ArrayList(C16877v.y(g10, 10));
        for (Media cVar : g10) {
            arrayList2.add(new Th.c(cVar));
        }
        arrayList.add(new a.w(new C9756k(C15985a.l(arrayList2), this.f73199M)));
        String b10 = c10.b();
        if (b10 != null) {
            arrayList.add(new a.B(new C9747b(b10)));
        }
        a.e T02 = T0(kVar.a());
        if (T02 != null) {
            arrayList.add(T02);
        }
        Badge o10 = c10.o();
        if (o10 != null) {
            arrayList.add(new a.f(B0.i(o10)));
        }
        String i10 = kVar.c().i();
        String j10 = kVar.c().j();
        C10828d.h g11 = B0.g(c10.h(), this.f73245x.s(), false, 2, (Object) null);
        Iterable<ProductItem.ProductDisclaimer> p10 = c10.p();
        ArrayList arrayList3 = new ArrayList(C16877v.y(p10, 10));
        for (ProductItem.ProductDisclaimer c11 : p10) {
            arrayList3.add(B0.c(c11));
        }
        arrayList.add(new a.A(new j0(i10, j10, g11, C15985a.h(arrayList3), this.f73245x.s(), this.f73245x.w())));
        arrayList.addAll(O0(c10));
        if (F02 != null) {
            arrayList.add(new a.l(F02));
        }
        if (eVar2 == k.e.SUCCESS) {
            arrayList.addAll(u1(c10));
        }
        KeyBenefits k10 = c10.k();
        if (k10 != null) {
            arrayList.add(new a.q(k10));
        }
        GuaranteeInfo e10 = c10.e();
        if (e10 != null) {
            arrayList.add(new a.o(e10));
        }
        z0(eVar2, kVar, arrayList, c10);
        a.s d12 = d1();
        if (d12 != null) {
            arrayList.add(d12);
        }
        a.p a12 = a1();
        if (a12 != null) {
            arrayList.add(a12);
        }
        a.x k12 = k1();
        if (k12 != null) {
            arrayList.add(k12);
        }
        List<String> d10 = c10.d();
        if (d10 != null) {
            arrayList.add(Y0(d10));
        }
        this.f73213T.postValue(arrayList);
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(Set set, K k10, I i10, ip.k kVar) {
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        kVar.c();
        ip.k value = k10.f73190H0.getValue();
        if (value != null) {
            k10.h2((C11700k) value.a(), value.c());
        }
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        return C16807N.f139792a;
    }

    private final a.p a1() {
        C12550a value = this.f73186F0.getValue();
        if (value != null) {
            return new a.p(new B(value, this.f73185F.n()));
        }
        return null;
    }

    private final void a2(String str) {
        this.f73189H = str;
        this.f73195K.postValue(str);
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(Set set, I i10, K k10, ip.k kVar) {
        C17542s.g(kVar);
        String name = kVar.getClass().getTypeParameters()[0].getName();
        if (L.a.f73322b[kVar.c().ordinal()] == 1) {
            C17542s.g(name);
            set.add(name);
        } else {
            set.remove(name);
        }
        if (kVar.c() != k.e.LOADING) {
            k10.f73217V0.e(kVar);
        }
        ip.j.b(i10, Boolean.valueOf(!set.isEmpty()));
        return C16807N.f139792a;
    }

    private final void b2(ProductLarge productLarge) {
        if (!productLarge.g().isEmpty()) {
            String url = productLarge.g().get(0).getUrl();
            if (productLarge.i().length() > 0 && !C15854t.v0(url)) {
                this.f73239r.e(productLarge.i(), url, productLarge.h().i());
            }
        }
    }

    private final C9759n c1(ProductLarge productLarge) {
        MoreInfo m10;
        if (this.f73211S == c.INIT || productLarge == null || (m10 = productLarge.m()) == null || m10.b() == null) {
            return null;
        }
        return new C9759n(productLarge, this.f73189H, this.f73207Q, this.f73209R);
    }

    private final void c2() {
        I1(this.f73219X, O.MORE_LIKE_THIS);
    }

    private final a.s d1() {
        V v10;
        ip.k value = this.f73219X.getValue();
        if (value == null) {
            return null;
        }
        int i10 = d.f73253a[value.c().ordinal()];
        if (i10 == 1) {
            return new a.s(new P(O.MORE_LIKE_THIS, Oo.b.f84354D6, C15985a.a(), true));
        }
        if (i10 != 4 || (v10 = (V) value.a()) == null || !(v10 instanceof V.a)) {
            return null;
        }
        V.a aVar = (V.a) v10;
        if (!aVar.a().isEmpty()) {
            return new a.s(new P(O.MORE_LIKE_THIS, Oo.b.f84354D6, aVar.a(), false));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (kotlin.jvm.internal.C17542s.e(r7, r2 != null ? r2.d() : null) == false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final fi.a f1(java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r12 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.lifecycle.K<gi.M> r15 = r12.f73180C0
            java.lang.Object r15 = r15.getValue()
            gi.M r15 = (gi.M) r15
            if (r15 != 0) goto L_0x000f
            return r0
        L_0x000f:
            qv.e r7 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r7, r8)
            if (r4 == 0) goto L_0x0022
            r2.add(r3)
            goto L_0x0022
        L_0x003a:
            java.util.Iterator r9 = r2.iterator()
            r1 = r0
            r2 = r1
        L_0x0040:
            boolean r3 = r9.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r9.next()
            qv.b r3 = (qv.C11819b) r3
            r5 = 0
            if (r1 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "OnlineAvailability status: "
            r1.append(r6)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = qv.C11818a.a(r1, r5)
            if (r1 != 0) goto L_0x0068
            goto L_0x00c8
        L_0x0068:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x006c:
            r10 = r1
            if (r2 != 0) goto L_0x00bb
            java.lang.Class<gi.K> r1 = gi.K.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            r6 = 2
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r0, r6, r0)
            r11 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r11, r0, r6, r0)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x0092:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = "main"
            boolean r2 = HJ.C15854t.b0(r2, r6, r4)
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = "m"
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r2 = "b"
        L_0x00a7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "|"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
        L_0x00bb:
            r11 = r2
            r1 = r3
            r2 = r7
            r3 = r11
            r4 = r8
            r6 = r10
            r1.a(r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r11
            goto L_0x0040
        L_0x00c8:
            gi.M$c r1 = gi.M.c.f73328a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r15, r1)
            if (r1 == 0) goto L_0x00d8
            fi.a$z r13 = new fi.a$z
            java.lang.String r14 = "loading_click_collect_availability_id"
            r13.<init>(r14)
            return r13
        L_0x00d8:
            FB.a r1 = r12.f73236o
            EB.d r7 = r1.c()
            if (r7 == 0) goto L_0x00e5
            java.lang.String r1 = r7.e()
            goto L_0x00e6
        L_0x00e5:
            r1 = r0
        L_0x00e6:
            if (r1 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            tf.a r1 = r12.f73237p
            boolean r1 = r1.K()
            if (r1 != 0) goto L_0x00f6
            gi.d$d r1 = gi.C9749d.C1283d.FEATURE_TURNED_OFF
        L_0x00f4:
            r6 = r1
            goto L_0x012c
        L_0x00f6:
            if (r4 != 0) goto L_0x00fb
            gi.d$d r1 = gi.C9749d.C1283d.MISSING_INPUT
            goto L_0x00f4
        L_0x00fb:
            gi.d$d r1 = r15.a()
            XH.v<? extends gi.d$d, EB.d> r2 = r12.f73193J
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r2.c()
            gi.d$d r2 = (gi.C9749d.C1283d) r2
            goto L_0x010b
        L_0x010a:
            r2 = r0
        L_0x010b:
            if (r1 != r2) goto L_0x011f
            XH.v<? extends gi.d$d, EB.d> r2 = r12.f73193J
            if (r2 == 0) goto L_0x0118
            java.lang.Object r2 = r2.d()
            EB.d r2 = (EB.C12832d) r2
            goto L_0x0119
        L_0x0118:
            r2 = r0
        L_0x0119:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r7, r2)
            if (r2 != 0) goto L_0x00f4
        L_0x011f:
            com.ingka.ikea.analytics.Interaction$Component r2 = com.ingka.ikea.analytics.Interaction$Component.PIP_CLICK_COLLECT_AVAILABILITY
            r12.X1(r1, r2)
            XH.v r2 = new XH.v
            r2.<init>(r1, r7)
            r12.f73193J = r2
            goto L_0x00f4
        L_0x012c:
            java.lang.Double r15 = r15.c()
            if (r15 == 0) goto L_0x0142
            double r0 = r15.doubleValue()
            qx.a r15 = qx.C14956a.f130484a
            Il.a r2 = r12.f73245x
            kp.d r2 = r2.s()
            java.lang.String r0 = r15.b(r0, r2)
        L_0x0142:
            r8 = r0
            gi.d$a r15 = new gi.d$a
            r5 = r15
            r9 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            fi.a$c r13 = new fi.a$c
            r13.<init>(r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.f1(java.lang.String, java.lang.String, boolean):fi.a");
    }

    private final void f2() {
        String str = null;
        if (this.f73200M0 != null || this.f73198L0 != null) {
            E0();
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
                    String a10 = C11818a.a("abandoning previous stock status request", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = K.class.getName();
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
        }
        bi.a aVar = this.f73234m;
        String str6 = this.f73189H;
        C12832d value = this.f73233i1.getValue();
        if (value != null) {
            str = value.e();
        }
        if (str == null) {
            str = "";
        }
        this.f73198L0 = aVar.c(str6, str);
        androidx.lifecycle.L<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> K02 = K0();
        F<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f10 = this.f73198L0;
        if (f10 != null) {
            f10.observeForever(K02);
        }
        this.f73200M0 = K02;
        D1();
        B1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4, r5 != null ? r5.d() : null) == false) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final fi.a g1(boolean r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            if (r18 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.lifecycle.K<gi.M> r2 = r0.f73180C0
            java.lang.Object r2 = r2.getValue()
            gi.M r2 = (gi.M) r2
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x0011:
            qv.e r9 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r5 = r3.hasNext()
            r10 = 0
            if (r5 == 0) goto L_0x003c
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r9, r10)
            if (r6 == 0) goto L_0x0024
            r4.add(r5)
            goto L_0x0024
        L_0x003c:
            java.util.Iterator r11 = r4.iterator()
            r3 = r1
            r4 = r3
        L_0x0042:
            boolean r5 = r11.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r11.next()
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            if (r3 != 0) goto L_0x006e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "OnlineAvailability status: "
            r3.append(r8)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = qv.C11818a.a(r3, r7)
            if (r3 != 0) goto L_0x006a
            goto L_0x00ca
        L_0x006a:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x006e:
            r12 = r3
            if (r4 != 0) goto L_0x00bd
            java.lang.Class<gi.K> r3 = gi.K.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r8 = 2
            java.lang.String r4 = HJ.C15854t.s1(r3, r4, r1, r8, r1)
            r13 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r13, r1, r8, r1)
            int r8 = r4.length()
            if (r8 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)
        L_0x0094:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r8 = "main"
            boolean r4 = HJ.C15854t.b0(r4, r8, r6)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = "m"
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r4 = "b"
        L_0x00a9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "|"
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
        L_0x00bd:
            r13 = r4
            r3 = r5
            r4 = r9
            r5 = r13
            r6 = r10
            r8 = r12
            r3.a(r4, r5, r6, r7, r8)
            r3 = r12
            r4 = r13
            goto L_0x0042
        L_0x00ca:
            gi.M$c r3 = gi.M.c.f73328a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r3 == 0) goto L_0x00da
            fi.a$z r1 = new fi.a$z
            java.lang.String r2 = "loading_home_availability_id"
            r1.<init>(r2)
            return r1
        L_0x00da:
            com.ingka.ikea.app.base.UserPostalCodeAddress r3 = r0.f73187G
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = r3.d()
            goto L_0x00e4
        L_0x00e3:
            r3 = r1
        L_0x00e4:
            if (r3 == 0) goto L_0x00ee
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r6 = 0
        L_0x00ee:
            tf.a r3 = r0.f73237p
            boolean r3 = r3.w()
            if (r3 != 0) goto L_0x00fa
            gi.d$d r3 = gi.C9749d.C1283d.FEATURE_TURNED_OFF
        L_0x00f8:
            r8 = r3
            goto L_0x0144
        L_0x00fa:
            if (r6 == 0) goto L_0x00ff
            gi.d$d r3 = gi.C9749d.C1283d.MISSING_INPUT
            goto L_0x00f8
        L_0x00ff:
            gi.d$d r3 = r2.b()
            XH.v<? extends gi.d$d, java.lang.String> r4 = r0.f73191I
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r4.c()
            gi.d$d r4 = (gi.C9749d.C1283d) r4
            goto L_0x010f
        L_0x010e:
            r4 = r1
        L_0x010f:
            if (r3 != r4) goto L_0x012d
            com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r0.f73187G
            if (r4 == 0) goto L_0x011a
            java.lang.String r4 = r4.d()
            goto L_0x011b
        L_0x011a:
            r4 = r1
        L_0x011b:
            XH.v<? extends gi.d$d, java.lang.String> r5 = r0.f73191I
            if (r5 == 0) goto L_0x0126
            java.lang.Object r5 = r5.d()
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0127
        L_0x0126:
            r5 = r1
        L_0x0127:
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x00f8
        L_0x012d:
            com.ingka.ikea.analytics.Interaction$Component r4 = com.ingka.ikea.analytics.Interaction$Component.PIP_ONLINE_AVAILABILITY
            r0.X1(r3, r4)
            XH.v r4 = new XH.v
            com.ingka.ikea.app.base.UserPostalCodeAddress r5 = r0.f73187G
            if (r5 == 0) goto L_0x013d
            java.lang.String r5 = r5.d()
            goto L_0x013e
        L_0x013d:
            r5 = r1
        L_0x013e:
            r4.<init>(r3, r5)
            r0.f73191I = r4
            goto L_0x00f8
        L_0x0144:
            XH.v r3 = r2.d()
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r13 = r3.booleanValue()
            U0.r0<java.lang.Boolean> r7 = r0.f73205P
            com.ingka.ikea.app.base.UserPostalCodeAddress r3 = r0.f73187G
            if (r3 == 0) goto L_0x0164
            java.lang.String r3 = r3.d()
            r9 = r3
            goto L_0x0165
        L_0x0164:
            r9 = r1
        L_0x0165:
            com.ingka.ikea.app.base.UserPostalCodeAddress r3 = r0.f73187G
            if (r3 == 0) goto L_0x016f
            java.lang.String r3 = r3.c()
            r10 = r3
            goto L_0x0170
        L_0x016f:
            r10 = r1
        L_0x0170:
            boolean r16 = r17.y1()
            if (r4 == 0) goto L_0x0188
            double r3 = r4.doubleValue()
            qx.a r5 = qx.C14956a.f130484a
            Il.a r6 = r0.f73245x
            kp.d r6 = r6.s()
            java.lang.String r3 = r5.b(r3, r6)
            r11 = r3
            goto L_0x0189
        L_0x0188:
            r11 = r1
        L_0x0189:
            Wk.e$b$a$b r2 = r2.e()
            if (r2 == 0) goto L_0x01a9
            int r1 = Ph.e.f62854f
            Wk.e$b$a$d r3 = r2.a()
            java.lang.String r3 = r3.a()
            Wk.e$b$a$d r2 = r2.a()
            java.lang.String r2 = r2.b()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            IC.e r1 = IC.C13026h.b(r1, r2)
        L_0x01a9:
            r12 = r1
            gi.d$b r1 = new gi.d$b
            r6 = r1
            r14 = r19
            r15 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            fi.a$c r2 = new fi.a$c
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.g1(boolean, java.lang.String, java.lang.String):fi.a");
    }

    private final void g2() {
        I1(this.f73221Y, O.RECOMMENDATION);
    }

    private final void h2(C11700k kVar, k.e eVar) {
        if (kVar == null) {
            Y1(eVar);
        } else {
            Z1(kVar, eVar);
        }
    }

    private final void j2(ProductLarge productLarge) {
        U u10;
        U u11;
        String i10 = productLarge.h().i();
        androidx.lifecycle.K<U> k10 = this.f73202N0;
        U value = k10.getValue();
        if (value == null || (u10 = U.b(value, i10, false, 2, (Object) null)) == null) {
            u10 = new U(i10, false, 2, (DefaultConstructorMarker) null);
        }
        k10.setValue(u10);
        U value2 = this.f73202N0.getValue();
        if (value2 != null && !value2.c()) {
            androidx.lifecycle.K<U> k11 = this.f73202N0;
            U value3 = k11.getValue();
            if (value3 == null || (u11 = U.b(value3, (String) null, true, 1, (Object) null)) == null) {
                u11 = new U("", true);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No title set");
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
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = K.class.getName();
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
            k11.setValue(u11);
        }
    }

    private final a.x k1() {
        V v10;
        ip.k value = this.f73221Y.getValue();
        if (value == null) {
            return null;
        }
        int i10 = d.f73253a[value.c().ordinal()];
        if (i10 == 1) {
            return new a.x(new P(O.RECOMMENDATION, Oo.b.f84394H6, C15985a.a(), true));
        }
        if (i10 != 4 || (v10 = (V) value.a()) == null || !(v10 instanceof V.a)) {
            return null;
        }
        V.a aVar = (V.a) v10;
        if (!aVar.a().isEmpty()) {
            return new a.x(new P(O.RECOMMENDATION, Oo.b.f84394H6, aVar.a(), false));
        }
        return null;
    }

    private final a.y l1(ProductLarge productLarge, float f10, int i10) {
        return new a.y(new Q(productLarge.i(), f10, i10));
    }

    private final N s1(com.ingka.ikea.app.stockinfo.local.a aVar, C12832d dVar, ProductLarge productLarge) {
        boolean z10;
        C9757l lVar;
        boolean z11;
        com.ingka.ikea.app.stockinfo.local.b b10 = aVar.b();
        if (b10 instanceof b.c) {
            M value = this.f73180C0.getValue();
            if (value instanceof M.a) {
                z10 = ((M.a) value).j();
            } else if (C17542s.e(value, M.c.f73328a) || (value instanceof M.b) || value == null) {
                z10 = false;
            } else {
                throw new XH.t();
            }
            Wk.f a10 = ((b.c) b10).a();
            boolean d10 = C9750e.d(a10.k());
            c.a value2 = this.f73188G0.getValue();
            String str = null;
            if (value2 != null) {
                String i10 = productLarge.h().i();
                Media media = (Media) C16877v.y0(productLarge.g());
                if (media != null) {
                    str = media.getUrl();
                }
                lVar = value2.a(d10, i10, str);
            } else {
                lVar = null;
            }
            if (!d10 || lVar != null) {
                this.f73203O.setValue(Boolean.TRUE);
            }
            List<di.u> Q02 = Q0(aVar, a10, productLarge.h().i());
            C4899r0<Boolean> r0Var = this.f73203O;
            String i11 = productLarge.i();
            String j10 = productLarge.j();
            boolean x12 = x1();
            C9749d.c.a c10 = C9750e.c(a10.k());
            L2 i12 = L.i(a10.k());
            C13023e a11 = this.f73248z.a(a10.n());
            String m10 = a10.m();
            if (m10.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf = String.valueOf(m10.charAt(0));
                C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                C17542s.i(upperCase, "toUpperCase(...)");
                sb2.append(upperCase);
                z11 = true;
                String substring = m10.substring(1);
                C17542s.i(substring, "substring(...)");
                sb2.append(substring);
                m10 = sb2.toString();
            } else {
                z11 = true;
            }
            return new C9749d.c(r0Var, dVar, i11, j10, x12, c10, z10, i12, a11, new C13023e.b(m10), Q02, a10.k() != com.ingka.ikea.app.stockinfo.network.d.EMPTY ? z11 : false, lVar);
        } else if ((b10 instanceof b.a) || C17542s.e(b10, b.C2056b.f92553a) || b10 == null) {
            return new T("loading_stock_id");
        } else {
            throw new XH.t();
        }
    }

    private final List<a.C> u1(ProductLarge productLarge) {
        ArrayList arrayList = new ArrayList();
        Iterable<Warning> s10 = productLarge.s();
        ArrayList arrayList2 = new ArrayList(C16877v.y(s10, 10));
        for (Warning dVar : s10) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new a.C(new Th.d(dVar)))));
        }
        return arrayList;
    }

    private final void x0(List<fi.a> list, ProductLarge productLarge) {
        fi.a g12 = g1(productLarge.t(), productLarge.i(), productLarge.j());
        fi.a f12 = f1(productLarge.i(), productLarge.j(), productLarge.t());
        N S02 = S0(this.f73196K0.getValue(), productLarge);
        if (!(g12 == null && f12 == null && S02 == null)) {
            L.e(list, C9672m.a.f72891a);
        }
        if (g12 != null) {
            L.f(list, g12, "online_availability");
        }
        if (f12 != null) {
            L.f(list, f12, "divider_click_collect_availability");
        }
        if (S02 != null) {
            L.f(list, new a.C9719c(S02), "availability");
        }
    }

    private final boolean x1() {
        return this.f73237p.d();
    }

    private final void y0(List<fi.a> list, ProductLarge productLarge) {
        Float c10 = productLarge.c();
        float floatValue = c10 != null ? c10.floatValue() : 0.0f;
        a.y l12 = floatValue > 0.0f ? l1(productLarge, floatValue, productLarge.r()) : null;
        C9758m U02 = U0(productLarge.l());
        C9759n c12 = c1(productLarge);
        if (!(l12 == null && U02 == null && c12 == null)) {
            L.e(list, C9672m.b.f72892a);
        }
        if (l12 != null) {
            L.f(list, l12, "ratings");
        }
        if (U02 != null) {
            L.f(list, new a.h(U02), "sizing");
        }
        if (c12 != null) {
            L.f(list, new a.r(c12), "moreInfo");
        }
    }

    private final boolean y1() {
        return this.f73237p.k();
    }

    private final void z0(k.e eVar, C11700k kVar, List<fi.a> list, ProductLarge productLarge) {
        int i10 = d.f73253a[eVar.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            return;
        }
        if (i10 == 2 || i10 == 3) {
            L.f(list, V0(false, eVar), UiComponentContainer.RESULT_ERROR);
        } else if (i10 == 4) {
            if (!productLarge.t()) {
                list.add(new a.v(ei.M.f72768a));
            }
            if (L.h(kVar.a())) {
                list.add(new a.g(new C9753h(new ProductKey(kVar.c().i(), kVar.c().j()))));
            }
            if (this.f73179C && kVar.c().t()) {
                ip.k value = this.f73216U0.getValue();
                if ((value != null ? value.c() : null) != k.e.LOADING) {
                    z10 = false;
                }
                list.add(new a.C1271a(new C9661b(z10)));
            }
            C15987c value2 = this.f73223Z.getValue();
            if (value2 != null && !value2.isEmpty()) {
                list.add(new a.t(new J(value2)));
            }
            y0(list, productLarge);
            x0(list, productLarge);
            A0(list);
        } else {
            throw new XH.t();
        }
    }

    public final void B0(String str, String str2, Interaction$Component interaction$Component) {
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "itemNo");
        C17542s.j(str4, "productName");
        C17542s.j(interaction$Component, "component");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar : arrayList) {
            if (str5 == null) {
                String a10 = C11818a.a("Add to cart itemNo: " + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            String str7 = str5;
            if (str6 == null) {
                String name = K.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str6;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
        }
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this, str4), (T) null, new f(this, str, str2, interaction$Component, (C17164e<? super f>) null), 2, (Object) null);
    }

    public final void F1() {
        C11700k kVar = null;
        if (this.f73194J0 != null || this.f73192I0 != null) {
            C0();
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
                    String a10 = C11818a.a("abandoning previous product request", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = K.class.getName();
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
        androidx.lifecycle.K<ip.k<C11700k, String>> k10 = this.f73190H0;
        k.a aVar = ip.k.f98528e;
        ip.k value = k10.getValue();
        if (value != null) {
            kVar = (C11700k) value.a();
        }
        k10.postValue(aVar.c(kVar));
        this.f73192I0 = this.f73234m.a(this.f73189H);
        androidx.lifecycle.L<ip.k<C11700k, String>> G02 = G0();
        F<ip.k<C11700k, String>> f10 = this.f73192I0;
        if (f10 != null) {
            f10.observeForever(G02);
        }
        this.f73194J0 = G02;
    }

    public final void J1(Interaction$Component interaction$Component) {
        C11700k kVar;
        ProductLarge c10;
        C17542s.j(interaction$Component, "addedFrom");
        ip.k value = this.f73216U0.getValue();
        String str = null;
        if ((value != null ? value.c() : null) != k.e.LOADING) {
            this.f73216U0.setValue(k.a.d(ip.k.f98528e, (Object) null, 1, (Object) null));
            ip.k value2 = this.f73190H0.getValue();
            if (!(value2 == null || (kVar = (C11700k) value2.a()) == null || (c10 = kVar.c()) == null)) {
                str = c10.i();
            }
            String str2 = str;
            if (str2 != null) {
                F0 unused = C16314k.d(g0.a(this), new t(N.f137593c0, this, interaction$Component), (T) null, new u(this, str2, 1, interaction$Component, (C17164e<? super u>) null), 2, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void L1() {
        this.f73201N = !this.f73201N;
        O1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.ingka.ikea.analytics.Interaction$Component} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M0(java.lang.String r17, java.lang.String r18, com.ingka.ikea.analytics.Interaction$Component r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r10 = r19
            r0 = r20
            boolean r3 = r0 instanceof gi.K.g
            if (r3 == 0) goto L_0x001c
            r3 = r0
            gi.K$g r3 = (gi.K.g) r3
            int r4 = r3.f73273l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f73273l = r4
        L_0x001a:
            r7 = r3
            goto L_0x0022
        L_0x001c:
            gi.K$g r3 = new gi.K$g
            r3.<init>(r1, r0)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r7.f73271j
            java.lang.Object r11 = eI.C17187b.f()
            int r4 = r7.f73273l
            r12 = 3
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L_0x005f
            if (r4 != r14) goto L_0x0057
            java.lang.Object r0 = r7.f73269h
            com.ingka.ikea.analytics.Interaction$Component r0 = (com.ingka.ikea.analytics.Interaction$Component) r0
            java.lang.Object r0 = r7.f73268g
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r7.f73267f
            r2 = r0
            com.ingka.ikea.analytics.Interaction$Component r2 = (com.ingka.ikea.analytics.Interaction$Component) r2
            java.lang.Object r0 = r7.f73266e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r7.f73265d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r7.f73264c
            gi.K r5 = (gi.K) r5
            XH.y.b(r3)     // Catch:{ all -> 0x0052 }
            r15 = r0
            r10 = r2
            r2 = r4
            goto L_0x00bc
        L_0x0052:
            r0 = move-exception
            r10 = r2
            r2 = r4
            goto L_0x00fb
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005f:
            XH.y.b(r3)
            int[] r3 = gi.K.d.f73256d
            int r4 = r19.ordinal()
            r3 = r3[r4]
            if (r3 == r14) goto L_0x0081
            if (r3 == r13) goto L_0x0081
            if (r3 == r12) goto L_0x0071
            goto L_0x0090
        L_0x0071:
            TJ.B<java.util.List<java.lang.String>> r4 = r1.f73231g1
            java.lang.Object r5 = r4.getValue()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = YH.C16877v.W0(r5, r2)
            r4.setValue(r5)
            goto L_0x0090
        L_0x0081:
            TJ.B<java.util.List<java.lang.String>> r4 = r1.f73232h1
            java.lang.Object r5 = r4.getValue()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = YH.C16877v.W0(r5, r2)
            r4.setValue(r5)
        L_0x0090:
            Kf.b r4 = r1.f73235n     // Catch:{ all -> 0x00f9 }
            Kf.y r5 = new Kf.y     // Catch:{ all -> 0x00f9 }
            r5.<init>(r2, r14)     // Catch:{ all -> 0x00f9 }
            java.util.List r5 = YH.C16877v.e(r5)     // Catch:{ all -> 0x00f9 }
            r7.f73264c = r1     // Catch:{ all -> 0x00f9 }
            r7.f73265d = r2     // Catch:{ all -> 0x00f9 }
            r15 = r18
            r7.f73266e = r15     // Catch:{ all -> 0x00f9 }
            r7.f73267f = r10     // Catch:{ all -> 0x00f9 }
            r7.f73268g = r0     // Catch:{ all -> 0x00f9 }
            r7.f73269h = r10     // Catch:{ all -> 0x00f9 }
            r7.f73270i = r3     // Catch:{ all -> 0x00f9 }
            r7.f73273l = r14     // Catch:{ all -> 0x00f9 }
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r4
            r4 = r5
            r5 = r19
            java.lang.Object r0 = Kf.C9133b.C1020b.a(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00f9 }
            if (r0 != r11) goto L_0x00bb
            return r11
        L_0x00bb:
            r5 = r1
        L_0x00bc:
            ip.b<gi.a> r0 = r5.f73204O0     // Catch:{ all -> 0x00f7 }
            gi.a$b r3 = new gi.a$b     // Catch:{ all -> 0x00f7 }
            r3.<init>(r15)     // Catch:{ all -> 0x00f7 }
            r0.d(r3)     // Catch:{ all -> 0x00f7 }
            int[] r0 = gi.K.d.f73256d
            int r3 = r10.ordinal()
            r0 = r0[r3]
            if (r0 == r14) goto L_0x00e5
            if (r0 == r13) goto L_0x00e5
            if (r0 == r12) goto L_0x00d5
            goto L_0x00f4
        L_0x00d5:
            TJ.B<java.util.List<java.lang.String>> r0 = r5.f73231g1
            java.lang.Object r3 = r0.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r2 = YH.C16877v.S0(r3, r2)
            r0.setValue(r2)
            goto L_0x00f4
        L_0x00e5:
            TJ.B<java.util.List<java.lang.String>> r0 = r5.f73232h1
            java.lang.Object r3 = r0.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r2 = YH.C16877v.S0(r3, r2)
            r0.setValue(r2)
        L_0x00f4:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f9:
            r0 = move-exception
            r5 = r1
        L_0x00fb:
            int[] r3 = gi.K.d.f73256d
            int r4 = r10.ordinal()
            r3 = r3[r4]
            if (r3 == r14) goto L_0x011a
            if (r3 == r13) goto L_0x011a
            if (r3 == r12) goto L_0x010a
            goto L_0x0129
        L_0x010a:
            TJ.B<java.util.List<java.lang.String>> r3 = r5.f73231g1
            java.lang.Object r4 = r3.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r2 = YH.C16877v.S0(r4, r2)
            r3.setValue(r2)
            goto L_0x0129
        L_0x011a:
            TJ.B<java.util.List<java.lang.String>> r3 = r5.f73232h1
            java.lang.Object r4 = r3.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r2 = YH.C16877v.S0(r4, r2)
            r3.setValue(r2)
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.K.M0(java.lang.String, java.lang.String, com.ingka.ikea.analytics.Interaction$Component, dI.e):java.lang.Object");
    }

    public final void M1() {
        this.f73207Q = !this.f73207Q;
        O1();
    }

    public F<String> N0() {
        return this.f73225a1;
    }

    public final void N1() {
        this.f73209R = !this.f73209R;
        O1();
    }

    public final F<ProductLarge> P0() {
        return this.f73230f1;
    }

    public final void Q1() {
        C11700k kVar;
        ProductLarge c10;
        char c11 = '$';
        Class<K> cls = K.class;
        if (this.f73212S0 != null || this.f73214T0 != null) {
            D0();
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
                    String a10 = C11818a.a("abandoning previous share request", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str2 = str4;
                str = str3;
                c11 = '$';
            }
        }
        ip.k value = this.f73190H0.getValue();
        if (value == null || (kVar = (C11700k) value.a()) == null || (c10 = kVar.c()) == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot share item, this requires productLarge info or more");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str5 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 != null) {
                        str5 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                String str7 = str6;
                bVar2.a(eVar2, str7, false, illegalArgumentException, str5);
                str6 = str7;
            }
            return;
        }
        this.f73208Q0.setValue(k.a.d(ip.k.f98528e, (Object) null, 1, (Object) null));
        this.f73212S0 = C5210m.c(this.f73183E.a(c10.i(), c10.j(), c10.h().i(), c10.h().c()), (C17168i) null, 0, 3, (Object) null);
        androidx.lifecycle.L<ip.k<g.a, Throwable>> I02 = I0();
        F<ip.k<g.a, Throwable>> f10 = this.f73212S0;
        if (f10 != null) {
            f10.observeForever(I02);
        }
        this.f73214T0 = I02;
    }

    public final String R0() {
        C11700k kVar;
        ProductLarge c10;
        ProductItem.ProductInfo h10;
        ip.k value = this.f73190H0.getValue();
        if (value == null || (kVar = (C11700k) value.a()) == null || (c10 = kVar.c()) == null || (h10 = c10.h()) == null) {
            return null;
        }
        return h10.b();
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void R1(Context context, boolean z10) {
        ip.k value;
        C11700k kVar;
        ProductLarge c10;
        C17542s.j(context, "context");
        String string = context.getString(Oo.b.f84487R);
        C17542s.i(string, "getString(...)");
        androidx.lifecycle.K<String> k10 = this.f73225a1;
        if (!((!z10 && !this.f73179C) || (value = this.f73190H0.getValue()) == null || (kVar = (C11700k) value.a()) == null || (c10 = kVar.c()) == null)) {
            string = String.format("%s %s", Arrays.copyOf(new Object[]{string, C14956a.f130484a.b(c10.h().g().e().c(), this.f73245x.s())}, 2));
            C17542s.i(string, "format(...)");
        }
        k10.setValue(string);
    }

    public final void U1(String str, String str2, C11550a.c cVar) {
        C11550a.c cVar2 = cVar;
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(cVar2, "fulfilmentOption");
        ip.k value = this.f73218W0.getValue();
        if ((value != null ? value.c() : null) != k.e.LOADING) {
            if (cVar.a().length() == 0) {
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
                        String a10 = C11818a.a("Trying to register for back in stock without a store set", (Throwable) null);
                        if (a10 != null) {
                            str3 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str4 == null) {
                        String name = K.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                }
                return;
            }
            F0 unused = C16314k.d(g0.a(this), new v(N.f137593c0, this, cVar2), (T) null, new w(this, cVar, str, str2, (C17164e<? super w>) null), 2, (Object) null);
        }
    }

    public final void V1(Qh.i iVar) {
        C17542s.j(iVar, "event");
        if (iVar instanceof i.q) {
            Qh.a aVar = this.f73238q;
            i.q qVar = (i.q) iVar;
            String i10 = qVar.b().i();
            De.a a10 = qVar.a();
            String b10 = qVar.b().b();
            aVar.i(i10, a10, !(b10 == null || b10.length() == 0));
        } else if (iVar instanceof i.h) {
            i.h hVar = (i.h) iVar;
            this.f73238q.e(hVar.b(), hVar.a());
        } else if (iVar instanceof i.o) {
            this.f73238q.q(((i.o) iVar).a());
        } else if (iVar instanceof i.e) {
            this.f73238q.b(((i.e) iVar).a());
        } else if (iVar instanceof i.l) {
            this.f73238q.s(((i.l) iVar).a());
        } else if (iVar instanceof i.a) {
            this.f73238q.d(((i.a) iVar).a());
        } else if (iVar instanceof i.f) {
            this.f73238q.g(((i.f) iVar).a());
        } else if (iVar instanceof i.g) {
            i.g gVar = (i.g) iVar;
            this.f73238q.c(gVar.b(), gVar.c(), gVar.a());
        } else if (iVar instanceof i.C1075i) {
            this.f73238q.k(((i.C1075i) iVar).a());
        } else if (C17542s.e(iVar, i.c.f63124a)) {
            this.f73238q.h();
        } else if (C17542s.e(iVar, i.b.f63123a)) {
            this.f73238q.p();
        } else if (C17542s.e(iVar, i.d.f63125a)) {
            this.f73238q.a();
        } else if (C17542s.e(iVar, i.p.f63140a)) {
            this.f73238q.l();
        } else if (C17542s.e(iVar, i.m.f63137a)) {
            this.f73238q.n();
        } else if (C17542s.e(iVar, i.j.f63134a)) {
            this.f73238q.f();
        } else if (C17542s.e(iVar, i.k.f63135a)) {
            this.f73238q.j();
        } else if (C17542s.e(iVar, i.n.f63138a)) {
            this.f73238q.r();
        } else {
            throw new XH.t();
        }
    }

    public final void W1(String str, C11550a.c cVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(cVar, "fulfilmentOption");
        this.f73244w.a(str, cVar, "PIP");
    }

    public final C4899r0<Boolean> Z0() {
        return this.f73205P;
    }

    public final F<Boolean> b1() {
        return this.f73226b1;
    }

    public final void d2(UserPostalCodeAddress userPostalCodeAddress, String str) {
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
                String a10 = C11818a.a("Update postal code address", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = K.class.getName();
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
        V1(new i.f(str));
        this.f73187G = userPostalCodeAddress;
        B1();
    }

    public final F<C9746a> e1() {
        return this.f73206P0;
    }

    public final void e2(int i10) {
        this.f73199M = i10;
        O1();
    }

    public final androidx.lifecycle.K<ip.k<C11700k, String>> h1() {
        return this.f73190H0;
    }

    public final String i1() {
        return this.f73189H;
    }

    public final void i2(String str) {
        C17542s.j(str, "itemNo");
        this.f73249z0.setValue(Boolean.FALSE);
        if (!C17542s.e(str, this.f73189H)) {
            this.f73211S = c.UPDATE_FACET;
            a2(str);
            F1();
        }
        this.f73238q.t(str);
    }

    public final F<String> j1() {
        return this.f73197L;
    }

    public final C11410b<Boolean> m1() {
        return this.f73176A0;
    }

    public final F<List<fi.a>> n1() {
        return this.f73229e1;
    }

    public final F<ip.k<g.a, Throwable>> o1() {
        return this.f73228d1;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f73233i1.removeObserver(this.f73178B0);
        C0();
        E0();
        D0();
        super.onCleared();
    }

    public final boolean p1() {
        return this.f73243v.d();
    }

    public final F<Boolean> q1() {
        return this.f73222Y0;
    }

    public final C11410b<ip.k<Integer, Throwable>> r1() {
        return this.f73217V0;
    }

    public final F<U> t1() {
        return this.f73227c1;
    }

    public final void v1() {
        if (this.f73202N0.getValue() == null) {
            this.f73202N0.setValue(new U(this.f73189H, false, 2, (DefaultConstructorMarker) null));
            this.f73233i1.observeForever(this.f73178B0);
        } else if (this.f73211S != c.IDLE && this.f73233i1.getValue() != null) {
            F1();
        }
    }

    public final F<ip.k<Boolean, Throwable>> w1() {
        return this.f73224Z0;
    }

    public final boolean z1() {
        return this.f73243v.b();
    }
}
