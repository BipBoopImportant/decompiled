package com.ingka.ikea.app.productinformationpage.v2.ui;

import Ar.j;
import Bx.a;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Kf.C9133b;
import Lg.d;
import MB.C13194a;
import Ni.C10796b;
import Op.Z0;
import Op.c1;
import Op.h1;
import PA.C13331a;
import QA.C13352d;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import Qh.i;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import SC.K2;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import am.c;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.ZipInValidation;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ei.A;
import ei.C9660a;
import ei.C9663d;
import ei.C9664e;
import ei.C9670k;
import ei.C9671l;
import ei.C9673n;
import ei.C9678t;
import ei.C9679u;
import ei.C9680v;
import ei.C9683y;
import ei.C9684z;
import ei.D;
import ei.F;
import ei.N;
import ei.a0;
import ei.b0;
import ei.f0;
import ei.l0;
import ei.r;
import fC.C14445a;
import gE.C14515b;
import gE.C14516c;
import gi.C9746a;
import gi.C9748c;
import gi.C9755j;
import gi.C9756k;
import gi.K;
import hk.C11366a;
import hk.g;
import i1.C5437c;
import ii.B;
import ii.C9854a0;
import ii.C9855b;
import ii.C9856b0;
import ii.C9857c;
import ii.C9858c0;
import ii.C9859d;
import ii.C9860d0;
import ii.C9861e;
import ii.C9862e0;
import ii.C9863f;
import ii.C9864f0;
import ii.C9865g;
import ii.C9866g0;
import ii.C9867h;
import ii.C9868h0;
import ii.C9869i;
import ii.C9870i0;
import ii.C9872j0;
import ii.C9874k0;
import ii.C9876l0;
import ii.C9877m;
import ii.C9880p;
import ii.C9881q;
import ii.C9882s;
import ii.C9883t;
import ii.C9884u;
import ii.C9885v;
import ii.C9886w;
import ii.C9887x;
import ii.C9888y;
import ii.C9889z;
import ii.E;
import ii.G;
import ii.H;
import ii.I;
import ii.J;
import ii.M;
import ii.O;
import ii.S;
import ii.T;
import ii.U;
import ii.V;
import ii.X;
import ii.Y;
import ii.Z;
import ii.m0;
import ii.n0;
import ii.o0;
import ii.p0;
import ii.q0;
import ii.r0;
import ii.t0;
import ii.y0;
import ii.z0;
import ip.C11410b;
import iq.C11411a;
import iq.C11412b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10027d;
import lm.C11550a;
import lm.c;
import lm.d;
import me.C10038a;
import me.b;
import mp.C11588a;
import nI.C17631a;
import nI.C17642l;
import op.C11700k;
import p1.C5747v0;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rq.C11841a;
import ru.e;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import sf.C10242c;
import tK.C18010a;
import tf.C10253a;
import tw.f;
import u2.C6012a;
import uK.C18146a;
import vl.n;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000´\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0004Ù\u0003Ý\u0003\b\u0001\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0002\u0004B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J#\u0010#\u001a\u00020\n2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u0004J\u001d\u0010-\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\u0004J%\u00105\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bK\u0010\u0013J\u000f\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010\u0004J)\u0010N\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bT\u0010\u0013J\u001f\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u0019H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\n2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\n2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\nH\u0002¢\u0006\u0004\bb\u0010\u0004J/\u0010d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0007H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\n2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ#\u0010m\u001a\u00020\n2\b\u0010k\u001a\u0004\u0018\u00010j2\b\u0010l\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020\n2\u0006\u0010o\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u0007H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020sH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\nH\u0002¢\u0006\u0004\bv\u0010\u0004JB\u0010\u001a\u00020\n2\b\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010z\u001a\u00020y2\b\u0010|\u001a\u0004\u0018\u00010{2\u0014\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010}H\u0003¢\u0006\u0005\b\u0010\u0001JB\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010M\u001a\u0004\u0018\u00010\u00072\u0007\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020 2\u0007\u0010\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J4\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u00020\n2\u0006\u0010x\u001a\u00020w2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0001\u0010\u0004J\u001c\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0001\u0010\u0004J\u0011\u0010\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0001\u0010\u0004J\u0011\u0010\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0001\u0010\u0004J&\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010¡\u0001\u001a\u00020{2\b\u0010 \u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¬\u0001\u0010­\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R*\u0010Â\u0001\u001a\u00030»\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ò\u0001\u001a\u00030Ë\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010â\u0001\u001a\u00030Û\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R*\u0010ê\u0001\u001a\u00030ã\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R*\u0010ò\u0001\u001a\u00030ë\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R*\u0010ú\u0001\u001a\u00030ó\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R*\u0010\u0002\u001a\u00030û\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010¢\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b \u0002\u0010¡\u0002R*\u0010ª\u0002\u001a\u00030£\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¤\u0002\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R*\u0010²\u0002\u001a\u00030«\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¬\u0002\u0010­\u0002\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R*\u0010º\u0002\u001a\u00030³\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R*\u0010Â\u0002\u001a\u00030»\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¼\u0002\u0010½\u0002\u001a\u0006\b¾\u0002\u0010¿\u0002\"\u0006\bÀ\u0002\u0010Á\u0002R*\u0010Ê\u0002\u001a\u00030Ã\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÄ\u0002\u0010Å\u0002\u001a\u0006\bÆ\u0002\u0010Ç\u0002\"\u0006\bÈ\u0002\u0010É\u0002R*\u0010Ò\u0002\u001a\u00030Ë\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÌ\u0002\u0010Í\u0002\u001a\u0006\bÎ\u0002\u0010Ï\u0002\"\u0006\bÐ\u0002\u0010Ñ\u0002R*\u0010Ú\u0002\u001a\u00030Ó\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002\"\u0006\bØ\u0002\u0010Ù\u0002R*\u0010â\u0002\u001a\u00030Û\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÜ\u0002\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0006\bà\u0002\u0010á\u0002R*\u0010ê\u0002\u001a\u00030ã\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002\"\u0006\bè\u0002\u0010é\u0002R*\u0010ò\u0002\u001a\u00030ë\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bì\u0002\u0010í\u0002\u001a\u0006\bî\u0002\u0010ï\u0002\"\u0006\bð\u0002\u0010ñ\u0002R*\u0010ú\u0002\u001a\u00030ó\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bô\u0002\u0010õ\u0002\u001a\u0006\bö\u0002\u0010÷\u0002\"\u0006\bø\u0002\u0010ù\u0002R*\u0010\u0003\u001a\u00030û\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bü\u0002\u0010ý\u0002\u001a\u0006\bþ\u0002\u0010ÿ\u0002\"\u0006\b\u0003\u0010\u0003R*\u0010\u0003\u001a\u00030\u00038\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003\"\u0006\b\u0003\u0010\u0003R*\u0010\u0003\u001a\u00030\u00038\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003\"\u0006\b\u0003\u0010\u0003R*\u0010\u0003\u001a\u00030\u00038\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003\"\u0006\b\u0003\u0010\u0003R*\u0010¢\u0003\u001a\u00030\u00038\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003\"\u0006\b \u0003\u0010¡\u0003R*\u0010ª\u0003\u001a\u00030£\u00038\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¤\u0003\u0010¥\u0003\u001a\u0006\b¦\u0003\u0010§\u0003\"\u0006\b¨\u0003\u0010©\u0003R\u001f\u0010¯\u0003\u001a\u00020\u00078\u0016XD¢\u0006\u0010\n\u0006\b«\u0003\u0010¬\u0003\u001a\u0006\b­\u0003\u0010®\u0003R&\u0010µ\u0003\u001a\t\u0012\u0004\u0012\u00020\n0°\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b±\u0003\u0010²\u0003\u001a\u0006\b³\u0003\u0010´\u0003R\u001c\u0010¹\u0003\u001a\u0005\u0018\u00010¶\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b·\u0003\u0010¸\u0003R\u001b\u0010¼\u0003\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0003\u0010»\u0003R \u0010À\u0003\u001a\u00020\u00078BX\u0002¢\u0006\u0010\n\u0006\b½\u0003\u0010¾\u0003\u001a\u0006\b¿\u0003\u0010®\u0003R\"\u0010Ã\u0003\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\u0010\n\u0006\bÁ\u0003\u0010¾\u0003\u001a\u0006\bÂ\u0003\u0010®\u0003R\u001f\u0010\u0016\u001a\u00020\u00158BX\u0002¢\u0006\u0010\n\u0006\bÄ\u0003\u0010¾\u0003\u001a\u0006\bÅ\u0003\u0010Æ\u0003R\u001c\u0010Ê\u0003\u001a\u0005\u0018\u00010Ç\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÈ\u0003\u0010É\u0003R\u001a\u0010Î\u0003\u001a\u00030Ë\u00038\u0002@\u0002X.¢\u0006\b\n\u0006\bÌ\u0003\u0010Í\u0003R\"\u0010Ò\u0003\u001a\u000b\u0012\u0004\u0012\u00020{\u0018\u00010Ï\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÐ\u0003\u0010Ñ\u0003R*\u0010Ô\u0003\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020!0\u001f0Ï\u00038\u0002X\u0004¢\u0006\b\n\u0006\bÓ\u0003\u0010Ñ\u0003R$\u0010Ø\u0003\u001a\u000f\u0012\u0005\u0012\u00030Õ\u0003\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0003\u0010×\u0003R\u0018\u0010Ü\u0003\u001a\u00030Ù\u00038\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0003\u0010Û\u0003R\u0018\u0010à\u0003\u001a\u00030Ý\u00038\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0003\u0010ß\u0003R\u0019\u0010â\u0003\u001a\u00020{8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bá\u0003\u0010Ô\u0001R\u001c\u0010æ\u0003\u001a\u0005\u0018\u00010ã\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bä\u0003\u0010å\u0003R#\u0010è\u0003\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\bç\u0003\u0010×\u0003R*\u0010ì\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0é\u00038\u0002X\u0004¢\u0006\b\n\u0006\bê\u0003\u0010ë\u0003R0\u0010ð\u0003\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0í\u00038\u0002X\u0004¢\u0006\b\n\u0006\bî\u0003\u0010ï\u0003R$\u0010ó\u0003\u001a\u000f\u0012\u0005\u0012\u00030ñ\u0003\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\bò\u0003\u0010×\u0003R0\u0010õ\u0003\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0í\u00038\u0002X\u0004¢\u0006\b\n\u0006\bô\u0003\u0010ï\u0003R$\u0010ø\u0003\u001a\u000f\u0012\u0005\u0012\u00030ö\u0003\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\b÷\u0003\u0010×\u0003R$\u0010û\u0003\u001a\u000f\u0012\u0005\u0012\u00030ù\u0003\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\bú\u0003\u0010×\u0003R>\u0010\u0004\u001a)\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030ý\u00030ü\u0003j\n\u0012\u0005\u0012\u00030ý\u0003`þ\u0003\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0é\u00038\u0002X\u0004¢\u0006\b\n\u0006\bÿ\u0003\u0010ë\u0003R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\b\u0004\u0010×\u0003R+\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0004\u0012\u0004\u0012\u00020\n0é\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0004\u0010ë\u0003R$\u0010\u0004\u001a\u000f\u0012\u0005\u0012\u00030\u0004\u0012\u0004\u0012\u00020\n0}8\u0002X\u0004¢\u0006\b\n\u0006\b\u0004\u0010×\u0003R\u0018\u0010\u0004\u001a\u00030¶\u00038BX\u0004¢\u0006\b\u001a\u0006\b\u0004\u0010\u0004R\u0016\u0010\u0004\u001a\u00020/8BX\u0004¢\u0006\u0007\u001a\u0005\b\u0004\u00101¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/PipFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "LXH/N;", "h4", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "o4", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "imageUrl", "i4", "(Ljava/lang/String;)V", "J3", "Lgi/K;", "viewModel", "s3", "(Lgi/K;)V", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "product", "u4", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "text", "w4", "Lip/k;", "", "", "action", "N3", "(Lip/k;)V", "errorData", "n3", "(Ljava/lang/Throwable;)Ljava/lang/String;", "p4", "v4", "", "Lfi/a;", "items", "x4", "(Ljava/util/List;)V", "LLg/d;", "i2", "()LLg/d;", "z2", "old", "new", "p3", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lei/b0;", "u2", "()Lei/b0;", "Lei/N;", "t2", "()Lei/N;", "Lei/n;", "f2", "()Lei/n;", "Lei/r;", "h2", "()Lei/r;", "Lei/e0;", "w2", "()Lei/e0;", "Lcom/ingka/ikea/core/model/Link;", "link", "k4", "(Lcom/ingka/ikea/core/model/Link;)V", "interactionValue", "m4", "K3", "productName", "l4", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "e2", "(Lcom/ingka/ikea/app/base/ProductKey;)V", "P3", "LOp/h1;", "sectionTypes", "productLarge", "n4", "(LOp/h1;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "fee", "Q3", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;)V", "Lgi/U;", "toolbarData", "D4", "(Lgi/U;)V", "G3", "productTitle", "j4", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Llm/d;", "result", "o3", "(Llm/d;)V", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "componentValue", "V3", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/lang/String;)V", "fragmentDetails", "actionUrl", "R3", "(Ljava/lang/String;Ljava/lang/String;)V", "Lgi/c$a;", "M3", "(Lgi/c$a;)V", "O3", "Landroid/view/View;", "view", "LsB/a;", "modifyListAction", "", "showOpenAction", "Lkotlin/Function1;", "onOpenListClicked", "s4", "(Landroid/view/View;LsB/a;Ljava/lang/Boolean;LnI/l;)V", "Landroid/content/Context;", "context", "listName", "textResId", "fallbackTextResId", "Landroid/text/SpannableString;", "g3", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onStop", "onPause", "onResume", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LZw/a;", "R", "LZw/a;", "Y2", "()LZw/a;", "setPipNavigation", "(LZw/a;)V", "pipNavigation", "LEo/a;", "S", "LEo/a;", "L2", "()LEo/a;", "setChromeCustomTabsApi", "(LEo/a;)V", "chromeCustomTabsApi", "LjB/b;", "T", "LjB/b;", "e3", "()LjB/b;", "setShoppingListRepository", "(LjB/b;)V", "shoppingListRepository", "LQA/d;", "U", "LQA/d;", "d3", "()LQA/d;", "setShoppingListNavigation", "(LQA/d;)V", "shoppingListNavigation", "LAe/e;", "X", "LAe/e;", "C2", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lsf/c;", "Y", "Lsf/c;", "E2", "()Lsf/c;", "setAppUserDataRepository", "(Lsf/c;)V", "appUserDataRepository", "LIl/a;", "Z", "LIl/a;", "D2", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LKf/b;", "y0", "LKf/b;", "K2", "()LKf/b;", "setCartApi", "(LKf/b;)V", "cartApi", "LFB/a;", "z0", "LFB/a;", "V2", "()LFB/a;", "setLocalStoreSelectionRepository", "(LFB/a;)V", "localStoreSelectionRepository", "Ltf/a;", "A0", "Ltf/a;", "S2", "()Ltf/a;", "setKillSwitchRepository", "(Ltf/a;)V", "killSwitchRepository", "LAr/j;", "B0", "LAr/j;", "Q2", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LBx/a;", "C0", "LBx/a;", "A2", "()LBx/a;", "setAccountApi", "(LBx/a;)V", "accountApi", "Lme/a;", "D0", "Lme/a;", "B2", "()Lme/a;", "setAddressPickerNavigation", "(Lme/a;)V", "addressPickerNavigation", "Lii/z0;", "E0", "Lii/z0;", "j3", "()Lii/z0;", "setViewIn3dUseCase", "(Lii/z0;)V", "viewIn3dUseCase", "LaA/a;", "F0", "LaA/a;", "b3", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "Liq/a;", "G0", "Liq/a;", "O2", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "LTu/a;", "H0", "LTu/a;", "R2", "()LTu/a;", "setItemAvailabilityNavigation", "(LTu/a;)V", "itemAvailabilityNavigation", "Llm/a;", "I0", "Llm/a;", "I2", "()Llm/a;", "setBackInStockApi", "(Llm/a;)V", "backInStockApi", "Llm/e;", "J0", "Llm/e;", "J2", "()Llm/e;", "setBackInStockNavigation", "(Llm/e;)V", "backInStockNavigation", "Lrq/a;", "K0", "Lrq/a;", "P2", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "LUs/a;", "L0", "LUs/a;", "getInspireNavigation", "()LUs/a;", "setInspireNavigation", "(LUs/a;)V", "inspireNavigation", "LPA/a;", "M0", "LPA/a;", "c3", "()LPA/a;", "setShoppableImageNavigation", "(LPA/a;)V", "shoppableImageNavigation", "LgE/c;", "N0", "LgE/c;", "m3", "()LgE/c;", "setZipSelectorNavigation", "(LgE/c;)V", "zipSelectorNavigation", "Lgi/K$b;", "O0", "Lgi/K$b;", "H2", "()Lgi/K$b;", "setAssistedFactory", "(Lgi/K$b;)V", "assistedFactory", "LMB/a;", "P0", "LMB/a;", "i3", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "LfC/a;", "Q0", "LfC/a;", "h3", "()LfC/a;", "setStoreDetailsNavigation", "(LfC/a;)V", "storeDetailsNavigation", "Lru/e;", "R0", "Lru/e;", "l3", "()Lru/e;", "setWayfindingNavigation", "(Lru/e;)V", "wayfindingNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "S0", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "U2", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LNi/b;", "T0", "LNi/b;", "a3", "()LNi/b;", "setReviewsNavigation", "(LNi/b;)V", "reviewsNavigation", "Lrx/b;", "U0", "Lrx/b;", "Z2", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "Lam/c;", "V0", "Lam/c;", "M2", "()Lam/c;", "setClipboardHandler", "(Lam/c;)V", "clipboardHandler", "LUh/r;", "W0", "LUh/r;", "W2", "()LUh/r;", "setPipInternalNavigation", "(LUh/r;)V", "pipInternalNavigation", "Lx3/r;", "X0", "Lx3/r;", "f3", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "Y0", "Ljava/lang/String;", "N2", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Z0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LRh/c;", "a1", "LRh/c;", "_pipLayoutBinding", "b1", "LLg/d;", "_listAdapter", "c1", "LXH/o;", "F2", "argProductNo", "d1", "G2", "argSourceComponent", "e1", "k3", "()Lgi/K;", "Lii/y0;", "f1", "Lii/y0;", "pricePackageHandler", "LDe/a;", "g1", "LDe/a;", "analyticsComponent", "Landroidx/lifecycle/L;", "h1", "Landroidx/lifecycle/L;", "noNetworkListener", "i1", "addToCartObserver", "Lmp/a;", "j1", "LnI/l;", "onInspirationImageClicked", "com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$c", "k1", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$c;", "availabilityActions", "com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$j", "l1", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$j;", "extraDisclaimersActions", "m1", "itemExistInAnyShoppingList", "LQJ/F0;", "n1", "LQJ/F0;", "titleJob", "o1", "scrollToTopAction", "Lkotlin/Function2;", "p1", "LnI/p;", "onRecommendationClicked", "Lkotlin/Function3;", "q1", "LnI/q;", "onRecommendationFavouritesClicked", "LQh/i$g;", "r1", "onProductCarouselViewed", "s1", "onMustBeCompletedWithAddToCart", "LOp/Z0;", "t1", "handleMustBeCompletedWithEvents", "LOp/c1;", "u1", "handleItemEvents", "Ljava/util/ArrayList;", "Lcom/ingka/ikea/core/model/Media;", "Lkotlin/collections/ArrayList;", "v1", "onProductImageClicked", "w1", "onProductImageIndex", "Liq/b;", "x1", "displayEnergyLabel", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "y1", "onWarningClicked", "X2", "()LRh/c;", "pipLayoutBinding", "T2", "listAdapter", "z1", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PipFragment extends a {

    /* renamed from: A1  reason: collision with root package name */
    public static final int f72162A1 = 8;

    /* renamed from: z1  reason: collision with root package name */
    public static final a f72163z1 = new a((DefaultConstructorMarker) null);

    /* renamed from: A0  reason: collision with root package name */
    public C10253a f72164A0;

    /* renamed from: B0  reason: collision with root package name */
    public Ar.j f72165B0;

    /* renamed from: C0  reason: collision with root package name */
    public Bx.a f72166C0;

    /* renamed from: D0  reason: collision with root package name */
    public C10038a f72167D0;

    /* renamed from: E0  reason: collision with root package name */
    public z0 f72168E0;

    /* renamed from: F0  reason: collision with root package name */
    public C13909a f72169F0;

    /* renamed from: G0  reason: collision with root package name */
    public C11411a f72170G0;

    /* renamed from: H0  reason: collision with root package name */
    public Tu.a f72171H0;

    /* renamed from: I0  reason: collision with root package name */
    public C11550a f72172I0;

    /* renamed from: J0  reason: collision with root package name */
    public lm.e f72173J0;

    /* renamed from: K0  reason: collision with root package name */
    public C11841a f72174K0;

    /* renamed from: L0  reason: collision with root package name */
    public Us.a f72175L0;

    /* renamed from: M0  reason: collision with root package name */
    public C13331a f72176M0;

    /* renamed from: N0  reason: collision with root package name */
    public C14516c f72177N0;

    /* renamed from: O0  reason: collision with root package name */
    public K.b f72178O0;

    /* renamed from: P0  reason: collision with root package name */
    public C13194a f72179P0;

    /* renamed from: Q0  reason: collision with root package name */
    public C14445a f72180Q0;

    /* renamed from: R  reason: collision with root package name */
    public Zw.a f72181R;

    /* renamed from: R0  reason: collision with root package name */
    public ru.e f72182R0;

    /* renamed from: S  reason: collision with root package name */
    public Eo.a f72183S;

    /* renamed from: S0  reason: collision with root package name */
    public ListPickerNavigation f72184S0;

    /* renamed from: T  reason: collision with root package name */
    public C14613b f72185T;

    /* renamed from: T0  reason: collision with root package name */
    public C10796b f72186T0;

    /* renamed from: U  reason: collision with root package name */
    public C13352d f72187U;

    /* renamed from: U0  reason: collision with root package name */
    public C15005b f72188U0;

    /* renamed from: V0  reason: collision with root package name */
    public am.c f72189V0;

    /* renamed from: W0  reason: collision with root package name */
    public Uh.r f72190W0;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f72191X;

    /* renamed from: X0  reason: collision with root package name */
    public x3.r f72192X0;

    /* renamed from: Y  reason: collision with root package name */
    public C10242c f72193Y;

    /* renamed from: Y0  reason: collision with root package name */
    private final String f72194Y0 = "pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}";

    /* renamed from: Z  reason: collision with root package name */
    public Il.a f72195Z;

    /* renamed from: Z0  reason: collision with root package name */
    private final C17631a<C16807N> f72196Z0 = new C9855b(this);
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public Rh.c f72197a1;

    /* renamed from: b1  reason: collision with root package name */
    private Lg.d f72198b1;

    /* renamed from: c1  reason: collision with root package name */
    private final C16824o f72199c1 = C16825p.b(new C9868h0(this));

    /* renamed from: d1  reason: collision with root package name */
    private final C16824o f72200d1 = C16825p.b(new C9870i0(this));

    /* renamed from: e1  reason: collision with root package name */
    private final C16824o f72201e1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public y0 f72202f1;

    /* renamed from: g1  reason: collision with root package name */
    private De.a f72203g1;

    /* renamed from: h1  reason: collision with root package name */
    private L<Boolean> f72204h1;

    /* renamed from: i1  reason: collision with root package name */
    private final L<ip.k<Boolean, Throwable>> f72205i1;

    /* renamed from: j1  reason: collision with root package name */
    private final C17642l<C11588a, C16807N> f72206j1;

    /* renamed from: k1  reason: collision with root package name */
    private final c f72207k1;

    /* renamed from: l1  reason: collision with root package name */
    private final j f72208l1;

    /* renamed from: m1  reason: collision with root package name */
    private boolean f72209m1;

    /* renamed from: n1  reason: collision with root package name */
    private F0 f72210n1;

    /* renamed from: o1  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f72211o1;

    /* renamed from: p1  reason: collision with root package name */
    private final nI.p<String, Interaction$Component, C16807N> f72212p1;

    /* renamed from: q1  reason: collision with root package name */
    private final nI.q<String, String, Interaction$Component, C16807N> f72213q1;

    /* renamed from: r1  reason: collision with root package name */
    private final C17642l<i.g, C16807N> f72214r1;

    /* renamed from: s1  reason: collision with root package name */
    private final nI.q<String, String, Interaction$Component, C16807N> f72215s1;

    /* renamed from: t1  reason: collision with root package name */
    private final C17642l<Z0, C16807N> f72216t1;

    /* renamed from: u1  reason: collision with root package name */
    private final C17642l<c1, C16807N> f72217u1;
    /* access modifiers changed from: private */

    /* renamed from: v1  reason: collision with root package name */
    public final nI.p<ArrayList<Media>, Integer, C16807N> f72218v1;
    /* access modifiers changed from: private */

    /* renamed from: w1  reason: collision with root package name */
    public final C17642l<Integer, C16807N> f72219w1;

    /* renamed from: x1  reason: collision with root package name */
    private final nI.p<String, C11412b, C16807N> f72220x1;

    /* renamed from: y0  reason: collision with root package name */
    public C9133b f72221y0;

    /* renamed from: y1  reason: collision with root package name */
    private final C17642l<WarningMoreInfo, C16807N> f72222y1;

    /* renamed from: z0  reason: collision with root package name */
    public C12860a f72223z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$a;", "", "<init>", "()V", "", "KEY_PRODUCT_NUMBER", "Ljava/lang/String;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72224a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f72225b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f72226c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f72227d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f72228e;

        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|49) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0076 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
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
                ip.k$e r3 = ip.k.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ip.k$e r4 = ip.k.e.NO_NETWORK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ip.k$e r5 = ip.k.e.ERROR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f72224a = r0
                com.ingka.ikea.appconfig.model.ZipInValidation$b[] r0 = com.ingka.ikea.appconfig.model.ZipInValidation.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.appconfig.model.ZipInValidation$b r5 = com.ingka.ikea.appconfig.model.ZipInValidation.b.START     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.ingka.ikea.appconfig.model.ZipInValidation$b r5 = com.ingka.ikea.appconfig.model.ZipInValidation.b.END     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f72225b = r0
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b[] r0 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r5 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.MANUAL     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r5 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.ADDRESS_LOOKUP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r5 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.NATIVE_GOOGLE     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                f72226c = r0
                Op.h1[] r0 = Op.h1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Op.h1 r5 = Op.h1.ASSEMBLY_AND_DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                Op.h1 r5 = Op.h1.MATERIALS_AND_CARE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                Op.h1 r5 = Op.h1.GOOD_TO_KNOW     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                Op.h1 r3 = Op.h1.SAFETY_AND_COMPLIANCE     // Catch:{ NoSuchFieldError -> 0x008e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                Op.h1 r3 = Op.h1.TECHNICAL_INFORMATION     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                f72227d = r0
                sB.a$a[] r0 = sB.C15035a.C3239a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sB.a$a r3 = sB.C15035a.C3239a.ADD     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                sB.a$a r1 = sB.C15035a.C3239a.REMOVE     // Catch:{ NoSuchFieldError -> 0x00b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b0 }
            L_0x00b0:
                f72228e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0004\u0010\fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\fR2\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\f¨\u0006\u0019"}, d2 = {"com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$c", "Lei/e$a;", "Lkotlin/Function0;", "LXH/N;", "a", "LnI/a;", "b", "()LnI/a;", "openPostalCodePicker", "Lkotlin/Function1;", "", "LnI/l;", "()LnI/l;", "openStoreDetails", "Lcom/ingka/ikea/analytics/Interaction$Component;", "c", "openStorePicker", "Lkotlin/Function3;", "Llm/a$c;", "d", "LnI/q;", "e", "()LnI/q;", "openBackInStockNotifications", "openInStoreNavigation", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C9664e.a {

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C16807N> f72229a;

        /* renamed from: b  reason: collision with root package name */
        private final C17642l<String, C16807N> f72230b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<Interaction$Component, C16807N> f72231c;

        /* renamed from: d  reason: collision with root package name */
        private final nI.q<C11550a.c, String, String, C16807N> f72232d;

        /* renamed from: e  reason: collision with root package name */
        private final C17642l<String, C16807N> f72233e;

        c(PipFragment pipFragment) {
            this.f72229a = new C9872j0(pipFragment);
            this.f72230b = new C9874k0(pipFragment);
            this.f72231c = new C9876l0(pipFragment);
            this.f72232d = new m0(pipFragment);
            this.f72233e = new n0(pipFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N k(PipFragment pipFragment, C11550a.c cVar, String str, String str2) {
            C17542s.j(cVar, "fulfilmentOption");
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            pipFragment.h4(cVar, str, str2);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N l(PipFragment pipFragment, String str) {
            C17542s.j(str, "division");
            String str2 = null;
            C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                ru.e l32 = pipFragment.l3();
                String L12 = pipFragment.F2();
                C12832d c10 = pipFragment.V2().c();
                if (c10 != null) {
                    str2 = c10.e();
                }
                if (str2 == null) {
                    str2 = "";
                }
                l32.a(f10, L12, new e.a(str, str2, e.a.C2437a.PIP));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(PipFragment pipFragment) {
            pipFragment.m4("home_delivery");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(PipFragment pipFragment, String str) {
            C17542s.j(str, "storeId");
            pipFragment.k3().V1(i.k.f63135a);
            C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C14445a.C3107a.a(pipFragment.h3(), f10, str, (C) null, 4, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N o(PipFragment pipFragment, Interaction$Component interaction$Component) {
            C17542s.j(interaction$Component, "component");
            pipFragment.o4(interaction$Component);
            return C16807N.f139792a;
        }

        public C17642l<String, C16807N> a() {
            return this.f72230b;
        }

        public C17631a<C16807N> b() {
            return this.f72229a;
        }

        public C17642l<Interaction$Component, C16807N> c() {
            return this.f72231c;
        }

        public C17642l<String, C16807N> d() {
            return this.f72233e;
        }

        public nI.q<C11550a.c, String, String, C16807N> e() {
            return this.f72232d;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$d", "Lei/r$a;", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/base/ProductKey;", "LXH/N;", "a", "LnI/l;", "()LnI/l;", "onCustomizeViewAction", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements r.a {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<ProductKey, C16807N> f72234a;

        d(PipFragment pipFragment) {
            this.f72234a = new o0(pipFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N c(PipFragment pipFragment, ProductKey productKey) {
            C17542s.j(productKey, "productKey");
            pipFragment.e2(productKey);
            return C16807N.f139792a;
        }

        public C17642l<ProductKey, C16807N> a() {
            return this.f72234a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, K.class, "onMoreInformationClicked", "onMoreInformationClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((K) this.receiver).M1();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, K.class, "onShowMoreInfoClicked", "onShowMoreInfoClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((K) this.receiver).N1();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements C17631a<C16807N> {
        g(Object obj) {
            super(0, obj, K.class, "onDimensionAndSizingClicked", "onDimensionAndSizingClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((K) this.receiver).L1();
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R<\u0010\u000b\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$h", "Lei/N$b;", "Lkotlin/Function2;", "Ljava/util/ArrayList;", "Lcom/ingka/ikea/core/model/Media;", "Lkotlin/collections/ArrayList;", "", "LXH/N;", "a", "LnI/p;", "()LnI/p;", "onItemClicked", "Lkotlin/Function1;", "b", "LnI/l;", "()LnI/l;", "onScrollToIndex", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements N.b {

        /* renamed from: a  reason: collision with root package name */
        private final nI.p<ArrayList<Media>, Integer, C16807N> f72235a;

        /* renamed from: b  reason: collision with root package name */
        private final C17642l<Integer, C16807N> f72236b;

        h(PipFragment pipFragment) {
            this.f72235a = new p0(pipFragment);
            this.f72236b = new q0(pipFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N e(PipFragment pipFragment, ArrayList arrayList, int i10) {
            C17542s.j(arrayList, "list");
            pipFragment.f72218v1.invoke(arrayList, Integer.valueOf(i10));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(PipFragment pipFragment, int i10) {
            pipFragment.f72219w1.invoke(Integer.valueOf(i10));
            return C16807N.f139792a;
        }

        public nI.p<ArrayList<Media>, Integer, C16807N> a() {
            return this.f72235a;
        }

        public C17642l<Integer, C16807N> b() {
            return this.f72236b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment$enableTitle$1", f = "PipFragment.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72237c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f72238d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PipFragment f72239e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PipFragment pipFragment, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f72239e = pipFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f72239e, eVar);
            iVar.f72238d = obj;
            return iVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72237c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f72238d;
                boolean z10 = false;
                if (this.f72239e.getContext() == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Context should not be null.");
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
                            String name = q10.getClass().getName();
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
                    C16807N n10 = C16807N.f139792a;
                }
                Context context = this.f72239e.getContext();
                if (context == null || !Xo.c.b(context)) {
                    y0 P12 = this.f72239e.f72202f1;
                    int h10 = P12 != null ? P12.h() : Integer.MAX_VALUE;
                    Rh.c R12 = this.f72239e.f72197a1;
                    if (R12 != null) {
                        PipFragment pipFragment = this.f72239e;
                        RecyclerView.q layoutManager = R12.f63227c.getLayoutManager();
                        C17542s.h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        androidx.appcompat.app.a b10 = t0.e(pipFragment);
                        if (b10 != null) {
                            if (linearLayoutManager.y2() > h10) {
                                z10 = true;
                            }
                            b10.v(z10);
                        }
                    }
                } else {
                    androidx.appcompat.app.a b11 = t0.e(this.f72239e);
                    if (b11 != null) {
                        b11.v(true);
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"com/ingka/ikea/app/productinformationpage/v2/ui/PipFragment$j", "Lei/u;", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/Link;", "LXH/N;", "a", "LnI/l;", "()LnI/l;", "onLinkClicked", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements C9679u {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<Link, C16807N> f72240a;

        j(PipFragment pipFragment) {
            this.f72240a = new r0(pipFragment);
        }

        /* access modifiers changed from: private */
        public static final C16807N c(PipFragment pipFragment, Link link) {
            C17542s.j(link, "link");
            pipFragment.k4(link);
            return C16807N.f139792a;
        }

        public C17642l<Link, C16807N> a() {
            return this.f72240a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment$observeNavigationResults$$inlined$consumeResult$1", f = "PipFragment.kt", l = {}, m = "invokeSuspend")
    public static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<lm.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72241c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72242d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f72243e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f72244f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PipFragment f72245g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C8948l lVar, String str, C17164e eVar, PipFragment pipFragment) {
            super(2, eVar);
            this.f72243e = lVar;
            this.f72244f = str;
            this.f72245g = pipFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f72243e, this.f72244f, eVar, this.f72245g);
            kVar.f72242d = obj;
            return kVar;
        }

        /* renamed from: i */
        public final Object invoke(lm.d dVar, C17164e<? super C16807N> eVar) {
            return ((k) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72241c == 0) {
                y.b(obj);
                Object obj2 = this.f72242d;
                if (obj2 != null) {
                    this.f72245g.o3((lm.d) obj2);
                    this.f72243e.h().m(this.f72244f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment$observeNavigationResults$$inlined$consumeResult$2", f = "PipFragment.kt", l = {}, m = "invokeSuspend")
    public static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<lm.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72246c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f72248e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f72249f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PipFragment f72250g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C8948l lVar, String str, C17164e eVar, PipFragment pipFragment) {
            super(2, eVar);
            this.f72248e = lVar;
            this.f72249f = str;
            this.f72250g = pipFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f72248e, this.f72249f, eVar, this.f72250g);
            lVar.f72247d = obj;
            return lVar;
        }

        /* renamed from: i */
        public final Object invoke(lm.c cVar, C17164e<? super C16807N> eVar) {
            return ((l) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72246c == 0) {
                y.b(obj);
                Object obj2 = this.f72247d;
                if (obj2 != null) {
                    lm.c cVar = (lm.c) obj2;
                    if (cVar instanceof c.a) {
                        c.a aVar = (c.a) cVar;
                        this.f72250g.h4(aVar.a(), aVar.b(), aVar.c());
                        this.f72248e.h().m(this.f72249f, null);
                    } else {
                        throw new XH.t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment$observeNavigationResults$$inlined$consumeResult$3", f = "PipFragment.kt", l = {}, m = "invokeSuspend")
    public static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<C14515b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72251c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f72253e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f72254f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PipFragment f72255g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C8948l lVar, String str, C17164e eVar, PipFragment pipFragment) {
            super(2, eVar);
            this.f72253e = lVar;
            this.f72254f = str;
            this.f72255g = pipFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f72253e, this.f72254f, eVar, this.f72255g);
            mVar.f72252d = obj;
            return mVar;
        }

        /* renamed from: i */
        public final Object invoke(C14515b bVar, C17164e<? super C16807N> eVar) {
            return ((m) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72251c == 0) {
                y.b(obj);
                Object obj2 = this.f72252d;
                if (obj2 != null) {
                    C14515b bVar = (C14515b) obj2;
                    if (!C17542s.e(bVar, C14515b.a.f127306a)) {
                        if (bVar instanceof C14515b.C3121b) {
                            C14515b.C3121b bVar2 = (C14515b.C3121b) bVar;
                            this.f72255g.V3(bVar2.b(), bVar2.a());
                        } else {
                            throw new XH.t();
                        }
                    }
                    this.f72253e.h().m(this.f72254f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment$observeNavigationResults$$inlined$consumeResult$4", f = "PipFragment.kt", l = {}, m = "invokeSuspend")
    public static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<ListPickerNavigation.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72256c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72257d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f72258e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f72259f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PipFragment f72260g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C8948l lVar, String str, C17164e eVar, PipFragment pipFragment) {
            super(2, eVar);
            this.f72258e = lVar;
            this.f72259f = str;
            this.f72260g = pipFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            n nVar = new n(this.f72258e, this.f72259f, eVar, this.f72260g);
            nVar.f72257d = obj;
            return nVar;
        }

        /* renamed from: i */
        public final Object invoke(ListPickerNavigation.b bVar, C17164e<? super C16807N> eVar) {
            return ((n) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72256c == 0) {
                y.b(obj);
                Object obj2 = this.f72257d;
                if (obj2 != null) {
                    ListPickerNavigation.b bVar = (ListPickerNavigation.b) obj2;
                    PipFragment pipFragment = this.f72260g;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Choose list fragment result: " + bVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = pipFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar2.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    if (bVar instanceof ListPickerNavigation.b.d) {
                        ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
                        C15035a.C3239a a11 = dVar.a();
                        String c10 = dVar.c();
                        ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                        String b10 = cVar != null ? cVar.b() : null;
                        if (b10 == null) {
                            b10 = "";
                        }
                        this.f72260g.s4(this.f72260g.X2().f63229e, new C15035a(a11, dVar.b(), c10, b10), kotlin.coroutines.jvm.internal.b.a(true), new o(this.f72260g, bVar));
                    } else if (!(bVar instanceof ListPickerNavigation.b.a)) {
                        throw new XH.t();
                    }
                    this.f72258e.h().m(this.f72259f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements C17642l<String, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PipFragment f72261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListPickerNavigation.b f72262b;

        o(PipFragment pipFragment, ListPickerNavigation.b bVar) {
            this.f72261a = pipFragment;
            this.f72262b = bVar;
        }

        public final void a(String str) {
            C17542s.j(str, "it");
            C13352d.a.a(this.f72261a.d3(), androidx.navigation.fragment.a.a(this.f72261a), ((ListPickerNavigation.b.d) this.f72262b).b(), true, (C) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72263c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C5187o oVar) {
            super(0);
            this.f72263c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f72263c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72264c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(C17631a aVar) {
            super(0);
            this.f72264c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f72264c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class r extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f72265c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C16824o oVar) {
            super(0);
            this.f72265c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f72265c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class s extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72266c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(C17631a aVar, C16824o oVar) {
            super(0);
            this.f72266c = aVar;
            this.f72267d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f72266c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f72267d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f72268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PipFragment f72269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72270c;

        public t(View view, PipFragment pipFragment, String str) {
            this.f72268a = view;
            this.f72269b = pipFragment;
            this.f72270c = str;
        }

        public final void run() {
            this.f72269b.X2().f63226b.setText(this.f72270c);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class u extends C17540p implements nI.p<Object, Object, Object> {
        u(Object obj) {
            super(2, obj, PipFragment.class, "handleChangePayload", "handleChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((PipFragment) this.receiver).p3(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class v implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f72271a;

        v(Object obj) {
            this.f72271a = obj;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1466721239, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.updatePipContent.<anonymous>.<anonymous> (PipFragment.kt:924)");
                }
                K2.d(((C9748c) this.f72271a).b().b().a(mVar, C13023e.f110931a), ((C9748c) this.f72271a).b().c(), (androidx.compose.ui.d) null, true, mVar, 3072, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public PipFragment() {
        C9857c cVar = new C9857c(this);
        C16824o a10 = C16825p.a(XH.s.NONE, new q(new p(this)));
        this.f72201e1 = W.b(this, P.b(K.class), new r(a10), new s((C17631a) null, a10), cVar);
        this.f72205i1 = new C9859d(this);
        this.f72206j1 = new C9861e(this);
        this.f72207k1 = new c(this);
        this.f72208l1 = new j(this);
        this.f72211o1 = new C9863f(this);
        this.f72212p1 = new C9865g(this);
        this.f72213q1 = new C9867h(this);
        this.f72214r1 = new C9869i(this);
        this.f72215s1 = new C9877m(this);
        this.f72216t1 = new C9887x(this);
        this.f72217u1 = new I(this);
        this.f72218v1 = new U(this);
        this.f72219w1 = new C9862e0(this);
        this.f72220x1 = new C9864f0(this);
        this.f72222y1 = new C9866g0(this);
    }

    /* access modifiers changed from: private */
    public static final C16807N A3(K k10, PipFragment pipFragment, ip.k kVar) {
        C17542s.j(kVar, "shareItem");
        if (b.f72224a[kVar.c().ordinal()] == 2) {
            g.a aVar = (g.a) kVar.a();
            if (aVar != null) {
                C11366a aVar2 = C11366a.f98057a;
                Context requireContext = pipFragment.requireContext();
                C17542s.i(requireContext, "requireContext(...)");
                pipFragment.startActivity(aVar2.a(requireContext, aVar));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("The shared item was not retrieved");
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
                        String name = k10.getClass().getName();
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
            }
        } else {
            PipFragment pipFragment2 = pipFragment;
            j.a.r(pipFragment.Q2(), pipFragment.X2().f63229e, Oo.b.f84812v3, 0, 0, (View) null, (C17631a) null, 60, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N A4(PipFragment pipFragment, C9748c.a aVar) {
        pipFragment.M3(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B3(PipFragment pipFragment, ip.k kVar) {
        C17542s.j(kVar, "it");
        pipFragment.N3(kVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B4(PipFragment pipFragment, Object obj) {
        pipFragment.k3().V1(new i.a(((C9748c) obj).b().a()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C3(PipFragment pipFragment, boolean z10) {
        pipFragment.X2().f63228d.setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C4(PipFragment pipFragment, d.a aVar) {
        C17542s.j(aVar, "$this$replaceAll");
        aVar.h(new u(pipFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D3(PipFragment pipFragment, ProductLarge productLarge) {
        C17542s.j(productLarge, "product");
        pipFragment.u4(productLarge);
        return C16807N.f139792a;
    }

    private final void D4(gi.U u10) {
        TextView textView;
        int i10;
        androidx.appcompat.app.a b10 = t0.e(this);
        if (b10 != null) {
            b10.A(u10.d());
            C5191t activity = getActivity();
            if (!(activity == null || (textView = (TextView) activity.findViewById(Uo.a.f88328i)) == null)) {
                if (C15854t.v0(u10.d())) {
                    i10 = 2;
                } else {
                    textView.setContentDescription(u10.d());
                    i10 = 1;
                }
                textView.setImportantForAccessibility(i10);
            }
        }
        z2();
        C5191t activity2 = getActivity();
        if (activity2 != null) {
            activity2.invalidateOptionsMenu();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E3(PipFragment pipFragment, String str) {
        C17542s.j(str, "text");
        pipFragment.w4(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final i0.c E4(PipFragment pipFragment) {
        K.a aVar = K.f73173j1;
        K.b H22 = pipFragment.H2();
        String F22 = pipFragment.F2();
        Object systemService = pipFragment.requireContext().getSystemService("accessibility");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return aVar.a(H22, F22, ((AccessibilityManager) systemService).isTouchExplorationEnabled());
    }

    /* access modifiers changed from: private */
    public final String F2() {
        return (String) this.f72199c1.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N F3(PipFragment pipFragment, boolean z10) {
        LoadingMaterialButton loadingMaterialButton = pipFragment.X2().f63226b;
        C17542s.i(loadingMaterialButton, "addToCartButton");
        loadingMaterialButton.setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    private final String G2() {
        return (String) this.f72200d1.getValue();
    }

    private final void G3() {
        C5197z.d(this, "AddressLookupPicker_RequestKey", new C9881q(this));
        C5197z.d(this, "ProductConfiguratorResultRequestKey", new ii.r(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N H3(PipFragment pipFragment, String str, Bundle bundle) {
        ArrayList arrayList;
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        me.b bVar = (me.b) bundle.getParcelable("AddressLookupPicker_BundleKey");
        if (!C17542s.e(bVar, b.a.f75354a)) {
            if (bVar instanceof b.C1380b) {
                b.C1380b bVar2 = (b.C1380b) bVar;
                String c10 = bVar2.a().c();
                Map<String, String> a10 = bVar2.a().a();
                if (a10 != null) {
                    ArrayList arrayList2 = new ArrayList(a10.size());
                    for (Map.Entry next : a10.entrySet()) {
                        arrayList2.add(new UserPostalCodeAddress.AdditionalValue((String) next.getKey(), (String) next.getValue()));
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = null;
                }
                UserPostalCodeAddress userPostalCodeAddress = new UserPostalCodeAddress(c10, (String) null, arrayList, 2, (DefaultConstructorMarker) null);
                UserPostalCodeAddress.f70222e.b(userPostalCodeAddress, pipFragment.E2(), (Pattern) null);
                pipFragment.V3(userPostalCodeAddress, bVar2.b());
            } else if (bVar == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown result");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList3.add(next2);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str2 == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str2 = C11820c.a(a11);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = pipFragment.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar3.a(eVar, str5, false, illegalArgumentException, str4);
                    str2 = str4;
                    str3 = str5;
                }
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I3(PipFragment pipFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        String string = bundle.getString("ProductConfiguratorResultItemNo");
        if (string != null) {
            pipFragment.f72203g1 = Interaction$Component.CUSTOMISATION;
            pipFragment.k3().i2(string);
            pipFragment.f72211o1.invoke(Boolean.TRUE);
        }
        return C16807N.f139792a;
    }

    private final void J3() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(N2());
            C16519P i10 = E10.h().i("BackInStockNotificationsRequestKey", null);
            androidx.lifecycle.r lifecycle = E10.getLifecycle();
            r.b bVar = r.b.RESUMED;
            C16532g R10 = C16534i.R(C5208k.a(i10, lifecycle, bVar), new k(E10, "BackInStockNotificationsRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
            C8948l E11 = androidx.navigation.fragment.a.a(this).E(N2());
            C16532g R11 = C16534i.R(C5208k.a(E11.h().i("BackInStockExplanationFragmentRequestKey", null), E11.getLifecycle(), bVar), new l(E11, "BackInStockExplanationFragmentRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
            C8948l E12 = androidx.navigation.fragment.a.a(this).E(N2());
            C16532g R12 = C16534i.R(C5208k.a(E12.h().i("ManualPostalCodeBottomSheetRequestKey", null), E12.getLifecycle(), bVar), new m(E12, "ManualPostalCodeBottomSheetRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C16534i.M(R12, C5222z.a(viewLifecycleOwner3));
            C8948l E13 = androidx.navigation.fragment.a.a(this).E(N2());
            C16532g R13 = C16534i.R(C5208k.a(E13.h().i("ChooseListBottomSheet.RequestKey", null), E13.getLifecycle(), bVar), new n(E13, "ChooseListBottomSheet.RequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            C16534i.M(R13, C5222z.a(viewLifecycleOwner4));
        }
    }

    private final void K3() {
        String R02 = k3().R0();
        C9133b K22 = K2();
        String string = getString(Oo.b.f84487R);
        C17542s.i(string, "getString(...)");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        K22.addToCartWithDisclaimer(R02, string, parentFragmentManager, new S(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N L3(PipFragment pipFragment) {
        pipFragment.k3().J1(Interaction$Component.PIP_ADD_TO_CART_BUTTON);
        return C16807N.f139792a;
    }

    private final void M3(C9748c.a aVar) {
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
                String a10 = C11818a.a("Assembly services clicked, action: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PipFragment.class.getName();
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
        if (aVar instanceof C9748c.a.C1281a) {
            C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                W2().b(f10, k3().i1());
                k3().V1(i.b.f63123a);
                return;
            }
            return;
        }
        throw new XH.t();
    }

    private final void N3(ip.k<Integer, Throwable> kVar) {
        int i10 = b.f72224a[kVar.c().ordinal()];
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            Integer a10 = kVar.a();
            if (a10 != null) {
                j.a.r(Q2(), X2().f63229e, a10.intValue(), 0, -2, (View) null, (C17631a) null, 52, (Object) null);
            }
        } else if (i10 == 3 || i10 == 4) {
            String n32 = n3(kVar.b());
            if (n32 != null) {
                Ar.j Q22 = Q2();
                CoordinatorLayout coordinatorLayout = X2().f63229e;
                C17542s.i(coordinatorLayout, "snackbarParent");
                j.a.s(Q22, coordinatorLayout, n32, getString(Oo.b.f84330B2), -2, (View) null, (C17631a) null, (C17642l) null, 112, (Object) null);
            }
        } else {
            throw new XH.t();
        }
    }

    private final void O3() {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            R2().a(f10);
        }
        k3().V1(i.c.f63124a);
    }

    private final void P3(String str) {
        this.f72203g1 = Interaction$Component.COLOR_PICKER;
        k3().i2(str);
    }

    private final void Q3(ProductItem.Price.PriceTag.Fee fee) {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            W2().c(f10, fee);
        }
    }

    private final void R3(String str, String str2) {
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
                String a10 = C11818a.a("Financial services clicked", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = PipFragment.class.getName();
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
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uh.r W22 = W2();
            String string = getString(Oo.b.f84735o3);
            C17542s.i(string, "getString(...)");
            WebViewDialogFragment.Content.Button button = new WebViewDialogFragment.Content.Button(string, (WebViewDialogFragment.Content.Action) WebViewDialogFragment.Content.Action.b.INSTANCE, (Integer) null, (Interaction$Component) null, 12, (DefaultConstructorMarker) null);
            String string2 = getString(Oo.b.f84746p3);
            C17542s.i(string2, "getString(...)");
            W22.h(f10, new WebViewDialogFragment.Content(str, button, new WebViewDialogFragment.Content.Button(string2, new WebViewDialogFragment.Content.Action.Url(str2), Integer.valueOf(C10027d.f75280k), Interaction$Component.FINANCIAL_SERVICES_APPLY)));
        }
        k3().V1(i.m.f63137a);
    }

    /* access modifiers changed from: private */
    public static final C16807N S3(PipFragment pipFragment, C11588a aVar) {
        C17542s.j(aVar, "inspirationFeedItem");
        pipFragment.k3().V1(new i.e(aVar));
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.c3().j(f10, aVar.f(), C13331a.b.INSPIRATION);
        }
        return C16807N.f139792a;
    }

    private final Lg.d T2() {
        Lg.d dVar = this.f72198b1;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N T3(PipFragment pipFragment, String str, String str2, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productName");
        C17542s.j(interaction$Component, "component");
        C9133b K22 = pipFragment.K2();
        String R02 = pipFragment.k3().R0();
        String string = pipFragment.getString(Oo.b.f84487R);
        C17542s.i(string, "getString(...)");
        FragmentManager parentFragmentManager = pipFragment.getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        K22.addToCartWithDisclaimer(R02, string, parentFragmentManager, new C9880p(pipFragment, str, str2, interaction$Component));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U3(PipFragment pipFragment, String str, String str2, Interaction$Component interaction$Component) {
        pipFragment.k3().B0(str, str2, interaction$Component);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void V3(UserPostalCodeAddress userPostalCodeAddress, String str) {
        k3().d2(userPostalCodeAddress, str);
    }

    /* access modifiers changed from: private */
    public static final C16807N W3(PipFragment pipFragment, i.g gVar) {
        C17542s.j(gVar, "it");
        pipFragment.k3().V1(gVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Rh.c X2() {
        Rh.c cVar = this.f72197a1;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N X3(PipFragment pipFragment, ArrayList arrayList, int i10) {
        C17542s.j(arrayList, "list");
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.P2().e(f10, (Media[]) arrayList.toArray(new Media[0]), i10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y3(PipFragment pipFragment, int i10) {
        pipFragment.k3().e2(i10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z3(PipFragment pipFragment, String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "component");
        pipFragment.k3().V1(new i.h(str, interaction$Component));
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.Y2().a(f10, str, interaction$Component);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void a2(PipFragment pipFragment, ip.k kVar) {
        C17542s.j(kVar, "addToCart");
        int i10 = b.f72224a[kVar.c().ordinal()];
        if (i10 == 1) {
            pipFragment.X2().f63226b.o();
        } else if (i10 == 2) {
            pipFragment.X2().f63226b.p(true);
        } else if (i10 == 3 || i10 == 4) {
            pipFragment.X2().f63226b.p(false);
            Context context = pipFragment.getContext();
            if (context != null) {
                C9133b K22 = pipFragment.K2();
                CoordinatorLayout coordinatorLayout = pipFragment.X2().f63229e;
                C17542s.i(coordinatorLayout, "snackbarParent");
                Throwable th2 = (Throwable) kVar.b();
                if (th2 == null) {
                    th2 = new Exception();
                }
                K22.showAddToCartException(context, coordinatorLayout, th2, (String) null);
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N a4(PipFragment pipFragment, String str, String str2, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productName");
        C17542s.j(interaction$Component, "component");
        pipFragment.l4(str, str2, interaction$Component);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String b2(PipFragment pipFragment) {
        String string = pipFragment.requireArguments().getString("itemNo");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final void b4(PipFragment pipFragment, View view) {
        androidx.navigation.fragment.a.a(pipFragment).k0();
    }

    /* access modifiers changed from: private */
    public static final String c2(PipFragment pipFragment) {
        return pipFragment.requireArguments().getString("sourceComponent");
    }

    /* access modifiers changed from: private */
    public static final void c4(PipFragment pipFragment, View view) {
        pipFragment.f72211o1.invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(PipFragment pipFragment) {
        pipFragment.J3();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final K d4(PipFragment pipFragment) {
        return pipFragment.k3();
    }

    /* access modifiers changed from: private */
    public final void e2(ProductKey productKey) {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Z2().h(f10, productKey.getProductNo(), C15004a.MODIFY_ITEM_WITH_RESULT);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.appcompat.app.a e4(PipFragment pipFragment) {
        return t0.e(pipFragment);
    }

    private final C9673n f2() {
        return new C9673n(new V(this));
    }

    /* access modifiers changed from: private */
    public static final void f4(PipFragment pipFragment, View view) {
        pipFragment.K3();
    }

    /* access modifiers changed from: private */
    public static final C16807N g2(PipFragment pipFragment, String str) {
        C17542s.j(str, "itemNo");
        pipFragment.P3(str);
        return C16807N.f139792a;
    }

    private final SpannableString g3(Context context, String str, String str2, int i10, int i11) {
        if (str == null || str.length() == 0 || str2.length() == 0) {
            return new SpannableString(context.getString(i11));
        }
        SpannableString spannableString = new SpannableString(context.getString(i10, new Object[]{str, "\"" + str2 + "\""}));
        int s02 = C15854t.s0(spannableString, str, 0, false, 6, (Object) null);
        if (s02 >= 0) {
            spannableString.setSpan(new StyleSpan(1), s02, str.length() + s02, 33);
        }
        return spannableString;
    }

    /* access modifiers changed from: private */
    public static final C16807N g4(PipFragment pipFragment, WarningMoreInfo warningMoreInfo) {
        C17542s.j(warningMoreInfo, "moreInfo");
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.W2().g(f10, warningMoreInfo);
        }
        return C16807N.f139792a;
    }

    private final ei.r h2() {
        return new ei.r(new d(this));
    }

    /* access modifiers changed from: private */
    public final void h4(C11550a.c cVar, String str, String str2) {
        String d10;
        if (!b3().isLoggedIn()) {
            A2().a(a.C2584a.BACK_IN_STOCK_NOTIFICATIONS).show(getParentFragmentManager(), "login_signup_promotion_bottom_sheet");
            return;
        }
        k3().W1(str, cVar);
        if (!k3().z1()) {
            gi.U value = k3().t1().getValue();
            if (value != null && (d10 = value.d()) != null) {
                j4(cVar, str, str2, d10);
            }
        } else if (k3().p1()) {
            C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                J2().a(f10, cVar, str, str2);
            }
        } else {
            k3().U1(str, str2, cVar);
        }
    }

    private final Lg.d i2() {
        b0 u22 = u2();
        el.c cVar = new el.c();
        ei.K k10 = new ei.K();
        N t22 = t2();
        C9663d dVar = new C9663d(new G(this));
        C9673n f22 = f2();
        C9670k kVar = new C9670k();
        ei.i0 i0Var = new ei.i0(new H(this), new J(this));
        C9680v vVar = new C9680v(this.f72208l1);
        C9683y yVar = new C9683y(new ii.K(this));
        l0 l0Var = new l0(new ii.L(this));
        ei.L l10 = new ei.L();
        ei.r h22 = h2();
        C9660a aVar = new C9660a(new M(this));
        ei.G g10 = new ei.G(this.f72216t1);
        ei.G g11 = g10;
        ei.r rVar = h22;
        C9664e eVar = new C9664e(this.f72207k1, C2());
        ei.L l11 = l10;
        l0 l0Var2 = l0Var;
        F f10 = new F(new O(this), new e(k3()), new f(k3()), new ii.P(this));
        f0 f0Var = new f0();
        f0 f0Var2 = f0Var;
        F f11 = f10;
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{u22, cVar, k10, t22, dVar, f22, kVar, i0Var, vVar, yVar, l0Var2, l11, rVar, aVar, g11, w2(), new D(new g(k3()), new ii.N(this)), eVar, f11, f0Var2, new A(this.f72206j1), new a0(this.f72217u1, this.f72212p1, this.f72213q1, this.f72214r1), new C9678t(), new vl.m(), new C9671l(new ii.Q(this)), new C9684z(), new ei.C()});
    }

    private final void i4(String str) {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C11841a P22 = P2();
            String string = getResources().getString(Oo.b.f84709m);
            C17542s.i(string, "getString(...)");
            P22.e(f10, (Media[]) C16877v.h(new Media.Image(str, string)).toArray(new Media[0]), 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = (r0 = (op.C11700k) r0.a()).c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N j2(com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "urlFor3dModel"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            gi.K r0 = r3.k3()
            androidx.lifecycle.K r0 = r0.h1()
            java.lang.Object r0 = r0.getValue()
            ip.k r0 = (ip.k) r0
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.a()
            op.k r0 = (op.C11700k) r0
            if (r0 == 0) goto L_0x0028
            com.ingka.ikea.core.model.product.ProductLarge r0 = r0.c()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.i()
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0040
            ii.z0 r1 = r3.j3()
            int r2 = Ph.e.f62851c
            java.lang.String r3 = r3.getString(r2)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.C17542s.i(r3, r2)
            r1.a(r4, r0, r3)
            XH.N r3 = XH.C16807N.f139792a
            return r3
        L_0x0040:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Required value was null."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.j2(com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment, java.lang.String):XH.N");
    }

    private final void j4(C11550a.c cVar, String str, String str2, String str3) {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            J2().b(f10, cVar, str3, str, str2);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(PipFragment pipFragment, String str) {
        C17542s.j(str, "itemNo");
        pipFragment.f72220x1.invoke(str, C11412b.ENERGY_LABEL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final K k3() {
        return (K) this.f72201e1.getValue();
    }

    /* access modifiers changed from: private */
    public final void k4(Link link) {
        if (link instanceof Link.External) {
            L2().a(requireActivity(), ((Link.External) link).e());
        } else if (link instanceof Link.Deeplink) {
            try {
                C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    Uri parse = Uri.parse(((Link.Deeplink) link).e());
                    C17542s.i(parse, "parse(...)");
                    f10.X(parse);
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (ActivityNotFoundException e10) {
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
                        String a10 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) link).e(), e10);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = PipFragment.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                C16807N n11 = C16807N.f139792a;
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(PipFragment pipFragment, Link link) {
        C17542s.j(link, "link");
        pipFragment.k4(link);
        return C16807N.f139792a;
    }

    private final void l4(String str, String str2, Interaction$Component interaction$Component) {
        ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(str2, str, 0, new ListPickerNavigation.Operation.Analytics(interaction$Component, Ae.k.BUTTON), 4, (DefaultConstructorMarker) null);
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            ListPickerNavigation.a.a(U2(), f10, addOrRemove, (String) null, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(PipFragment pipFragment, ProductItem.Price.PriceTag.Fee fee) {
        C17542s.j(fee, "fee");
        pipFragment.Q3(fee);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void m4(String str) {
        String str2 = str;
        PostalCodePickerConfig v10 = D2().v();
        int i10 = b.f72226c[v10.i().ordinal()];
        C10038a.C1374a.b bVar = null;
        if (i10 == 1) {
            C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C14516c m32 = m3();
                if (str2 == null) {
                    str2 = "";
                }
                m32.a(f10, false, str2);
            }
        } else if (i10 == 2) {
            C10038a B22 = B2();
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            boolean n10 = v10.n();
            boolean k10 = v10.k();
            ZipInValidation j10 = v10.j();
            ZipInValidation.b a10 = j10 != null ? j10.a() : null;
            int i11 = a10 == null ? -1 : b.f72225b[a10.ordinal()];
            if (i11 != -1) {
                if (i11 == 1) {
                    bVar = C10038a.C1374a.b.START;
                } else if (i11 == 2) {
                    bVar = C10038a.C1374a.b.END;
                } else {
                    throw new XH.t();
                }
            }
            C10038a.C1374a.b bVar2 = bVar;
            String country = D2().A().getCountry();
            C17542s.i(country, "getCountry(...)");
            B22.b(parentFragmentManager, new C10038a.C1374a.C1375a(country, (String) null, k10, bVar2, n10, 2, (DefaultConstructorMarker) null), str2, "pip_postal_code");
        } else if (i10 == 3) {
            IllegalStateException illegalStateException = new IllegalStateException("Not supported yet, defaulting to Manual");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar3 : arrayList) {
                if (str3 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = PipFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar3.a(eVar, str6, false, illegalStateException, str5);
                str3 = str5;
                str4 = str6;
            }
            C8951o f11 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                C14516c m33 = m3();
                if (str2 == null) {
                    str2 = "";
                }
                m33.a(f11, false, str2);
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(PipFragment pipFragment, WarningMoreInfo warningMoreInfo) {
        C17542s.j(warningMoreInfo, "moreInfo");
        pipFragment.f72222y1.invoke(warningMoreInfo);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r0 = (r0 = (op.C11700k) r0.a()).c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String n3(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gi.C9751f.b
            if (r0 == 0) goto L_0x009f
            FB.a r7 = r6.V2()
            EB.d r7 = r7.c()
            gi.K r0 = r6.k3()
            androidx.lifecycle.K r0 = r0.h1()
            java.lang.Object r0 = r0.getValue()
            ip.k r0 = (ip.k) r0
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r0.a()
            op.k r0 = (op.C11700k) r0
            if (r0 == 0) goto L_0x0030
            com.ingka.ikea.core.model.product.ProductLarge r0 = r0.c()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.i()
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0099
            gi.K r3 = r6.k3()
            androidx.lifecycle.K r3 = r3.h1()
            java.lang.Object r3 = r3.getValue()
            ip.k r3 = (ip.k) r3
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r3.a()
            op.k r3 = (op.C11700k) r3
            if (r3 == 0) goto L_0x0058
            com.ingka.ikea.core.model.product.ProductLarge r3 = r3.c()
            if (r3 == 0) goto L_0x0058
            java.lang.String r3 = r3.j()
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            if (r3 == 0) goto L_0x0093
            lm.a$c$a r2 = new lm.a$c$a
            if (r7 == 0) goto L_0x0064
            java.lang.String r4 = r7.e()
            goto L_0x0065
        L_0x0064:
            r4 = r1
        L_0x0065:
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x006a
            r4 = r5
        L_0x006a:
            if (r7 == 0) goto L_0x0071
            java.lang.String r7 = r7.getName()
            goto L_0x0072
        L_0x0071:
            r7 = r1
        L_0x0072:
            if (r7 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r5 = r7
        L_0x0076:
            r2.<init>(r4, r5)
            gi.K r7 = r6.k3()
            androidx.lifecycle.F r7 = r7.t1()
            java.lang.Object r7 = r7.getValue()
            gi.U r7 = (gi.U) r7
            if (r7 == 0) goto L_0x00cd
            java.lang.String r7 = r7.d()
            if (r7 == 0) goto L_0x00cd
            r6.j4(r2, r0, r3, r7)
            goto L_0x00cd
        L_0x0093:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            throw r7
        L_0x0099:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            throw r7
        L_0x009f:
            boolean r0 = r7 instanceof gi.C9751f.a
            if (r0 == 0) goto L_0x00c7
            lm.a r0 = r6.I2()
            gi.f$a r7 = (gi.C9751f.a) r7
            lm.b r1 = r7.a()
            lm.a$c r2 = r7.b()
            java.lang.String r7 = r7.c()
            IC.e r7 = r0.a(r1, r2, r7)
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = r7.b(r0)
            goto L_0x00cd
        L_0x00c7:
            int r7 = Oo.b.f84398I0
            java.lang.String r1 = r6.getString(r7)
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.n3(java.lang.Throwable):java.lang.String");
    }

    private final void n4(h1 h1Var, ProductLarge productLarge) {
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            int i10 = b.f72227d[h1Var.ordinal()];
            if (i10 == 1) {
                W2().a(f10, productLarge);
            } else if (i10 == 2) {
                W2().e(f10, productLarge);
            } else if (i10 == 3) {
                W2().d(f10, productLarge);
            } else if (i10 == 4) {
                k3().V1(i.j.f63134a);
                W2().f(f10, productLarge);
            } else if (i10 != 5) {
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
                        String a10 = C11818a.a("Pip 2 does not support any other SectionTypes at the moment", (Throwable) null);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str2 == null) {
                        String name = PipFragment.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                }
            } else {
                O2().a(f10, productLarge.i());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(PipFragment pipFragment) {
        pipFragment.K3();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void o3(lm.d dVar) {
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
                String a10 = C11818a.a("Back in stock notifications fragment result: " + dVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PipFragment.class.getName();
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
        if (dVar instanceof d.a) {
            o4(Interaction$Component.PIP_BACK_IN_STOCK_NOTIFICATIONS);
        } else if (dVar instanceof d.b) {
            Ar.j Q22 = Q2();
            CoordinatorLayout coordinatorLayout = X2().f63229e;
            C17542s.i(coordinatorLayout, "snackbarParent");
            String string = getString(((d.b) dVar).a());
            C17542s.i(string, "getString(...)");
            j.a.s(Q22, coordinatorLayout, string, (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void o4(Interaction$Component interaction$Component) {
        C11700k kVar;
        ProductLarge c10;
        k3().V1(new i.l(interaction$Component));
        String str = null;
        C8951o f10 = rw.f.f(this, N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a i32 = i3();
            StorageType storageType = StorageType.LOCAL;
            ip.k value = k3().h1().getValue();
            if (!(value == null || (kVar = (C11700k) value.a()) == null || (c10 = kVar.c()) == null)) {
                str = c10.i();
            }
            String str2 = str;
            if (str2 != null) {
                C13194a.C2742a.a(i32, f10, storageType, str2, false, (String) null, (C) null, 56, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p2(PipFragment pipFragment, String str) {
        C17542s.j(str, "imageUrl");
        pipFragment.i4(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object p3(Object obj, Object obj2) {
        C9756k kVar = obj instanceof C9756k ? (C9756k) obj : null;
        if (kVar == null) {
            return null;
        }
        C9756k kVar2 = obj2 instanceof C9756k ? (C9756k) obj2 : null;
        return (kVar2 == null || !C17542s.e(kVar.h(), kVar2.h()) || kVar.g() == kVar2.g()) ? null : 0;
    }

    private final void p4() {
        ii.W w10 = new ii.W(this);
        f.a aVar = tw.f.f56772d;
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        aVar.b(requireActivity).observe(getViewLifecycleOwner(), w10);
        this.f72204h1 = w10;
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(PipFragment pipFragment, h1 h1Var, ProductLarge productLarge) {
        C17542s.j(h1Var, "sectionType");
        C17542s.j(productLarge, "productLarge");
        pipFragment.n4(h1Var, productLarge);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q3(PipFragment pipFragment, c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (c1Var instanceof c1.c) {
            C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11411a.C2225a.a(pipFragment.O2(), f10, ((c1.c) c1Var).a(), (C11412b) null, 4, (Object) null);
            }
        } else if ((c1Var instanceof c1.a) || (c1Var instanceof c1.d) || (c1Var instanceof c1.e)) {
            IllegalStateException illegalStateException = new IllegalStateException("Should not end up here");
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
                    String name = pipFragment.getClass().getName();
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
        } else if (c1Var instanceof c1.b) {
            C8951o f11 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                pipFragment.Z2().h(f11, ((c1.b) c1Var).a(), C15004a.LIST_CART_ACTIONS);
            }
            pipFragment.k3().V1(i.d.f63125a);
        } else if (c1Var instanceof c1.f) {
            pipFragment.k4(((c1.f) c1Var).a());
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void q4(PipFragment pipFragment, boolean z10) {
        if (z10) {
            pipFragment.k3().F1();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(PipFragment pipFragment, String str) {
        C17542s.j(str, "itemNo");
        c.a.a(pipFragment.M2(), str, (String) null, 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r3(PipFragment pipFragment, Z0 z02) {
        C17542s.j(z02, "event");
        if (z02 instanceof Z0.a) {
            C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                pipFragment.Z2().h(f10, ((Z0.a) z02).a(), C15004a.LIST_CART_ACTIONS);
            }
            pipFragment.k3().V1(i.d.f63125a);
        } else if (z02 instanceof Z0.b) {
            C8951o f11 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                C11411a.C2225a.a(pipFragment.O2(), f11, ((Z0.b) z02).a(), (C11412b) null, 4, (Object) null);
            }
        } else if (z02 instanceof Z0.c) {
            Z0.c cVar = (Z0.c) z02;
            pipFragment.f72215s1.invoke(cVar.a(), cVar.b(), Interaction$Component.UPSELL);
        } else if (z02 instanceof Z0.d) {
            Z0.d dVar = (Z0.d) z02;
            pipFragment.k3().V1(new i.o(dVar.a()));
            C8951o f12 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                pipFragment.Y2().a(f12, dVar.a(), Interaction$Component.UPSELL);
            }
        } else if (z02 instanceof Z0.e) {
            pipFragment.k4(((Z0.e) z02).b());
        } else if ((z02 instanceof Z0.g) || (z02 instanceof Z0.f)) {
            IllegalStateException illegalStateException = new IllegalStateException("Should not end up here");
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
                    String name = pipFragment.getClass().getName();
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
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r4(PipFragment pipFragment, boolean z10) {
        RecyclerView recyclerView;
        Rh.c cVar = pipFragment.f72197a1;
        if (!(cVar == null || (recyclerView = cVar.f63227c) == null)) {
            recyclerView.F1(0);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s2(PipFragment pipFragment) {
        pipFragment.O3();
        return C16807N.f139792a;
    }

    private final void s3(K k10) {
        androidx.lifecycle.F<Y> c10 = e0.c(k10.j1(), new C9882s(this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(c10, viewLifecycleOwner, new C9886w(k10, this));
        androidx.lifecycle.K<ip.k<C11700k, String>> h12 = k10.h1();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(h12, viewLifecycleOwner2, new C9888y(this));
        C11410b<Boolean> m12 = k10.m1();
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ip.j.a(m12, viewLifecycleOwner3, new C9889z(this));
        androidx.lifecycle.F<gi.U> t12 = k10.t1();
        C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        ip.j.a(t12, viewLifecycleOwner4, new ii.A(this));
        androidx.lifecycle.F<List<fi.a>> n12 = k10.n1();
        C5221y viewLifecycleOwner5 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        ip.j.a(n12, viewLifecycleOwner5, new B(this));
        androidx.lifecycle.F<C9746a> e12 = k10.e1();
        C5221y viewLifecycleOwner6 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        ip.j.a(e12, viewLifecycleOwner6, new ii.C(this));
        androidx.lifecycle.F<ip.k<g.a, Throwable>> o12 = k10.o1();
        C5221y viewLifecycleOwner7 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        ip.j.a(o12, viewLifecycleOwner7, new ii.D(k10, this));
        C11410b<ip.k<Integer, Throwable>> r12 = k10.r1();
        C5221y viewLifecycleOwner8 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        ip.j.a(r12, viewLifecycleOwner8, new E(this));
        k10.w1().observe(getViewLifecycleOwner(), this.f72205i1);
        androidx.lifecycle.F<Boolean> b12 = k10.b1();
        C5221y viewLifecycleOwner9 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        ip.j.a(b12, viewLifecycleOwner9, new ii.F(this));
        androidx.lifecycle.F<ProductLarge> P02 = k10.P0();
        C5221y viewLifecycleOwner10 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
        ip.j.a(P02, viewLifecycleOwner10, new C9883t(this));
        androidx.lifecycle.F<String> N02 = k10.N0();
        C5221y viewLifecycleOwner11 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner11, "getViewLifecycleOwner(...)");
        ip.j.a(N02, viewLifecycleOwner11, new C9884u(this));
        androidx.lifecycle.F<Boolean> q12 = k10.q1();
        C5221y viewLifecycleOwner12 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner12, "getViewLifecycleOwner(...)");
        ip.j.a(q12, viewLifecycleOwner12, new C9885v(this));
    }

    /* access modifiers changed from: private */
    @C16814e
    public final void s4(View view, C15035a aVar, Boolean bool, C17642l<? super String, C16807N> lVar) {
        Context context;
        XH.v vVar;
        if (view != null && (context = view.getContext()) != null) {
            int i10 = b.f72228e[aVar.a().ordinal()];
            if (i10 == 1) {
                vVar = new XH.v(Integer.valueOf(Oo.b.f84517U), Integer.valueOf(Oo.b.f84324A6));
            } else if (i10 == 2) {
                vVar = new XH.v(Integer.valueOf(Oo.b.f84848y8), Integer.valueOf(Oo.b.f84858z8));
            } else {
                throw new XH.t();
            }
            int intValue = ((Number) vVar.a()).intValue();
            int intValue2 = ((Number) vVar.b()).intValue();
            SpannableString g32 = g3(context, aVar.d(), aVar.c(), intValue, intValue2);
            Ar.j Q22 = Q2();
            String string = context.getString(Oo.b.f84527V);
            if (!C17542s.e(bool, Boolean.TRUE)) {
                string = null;
            }
            View view2 = view;
            j.a.s(Q22, view2, g32, string, 0, (View) null, new X(lVar, aVar), (C17642l) null, 88, (Object) null);
        }
    }

    private final N t2() {
        return new N(new h(this), f3());
    }

    /* access modifiers changed from: private */
    public static final androidx.lifecycle.F t3(PipFragment pipFragment, String str) {
        C17542s.j(str, "it");
        return C5210m.c(pipFragment.e3().k(str), (C17168i) null, 0, 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N t4(C17642l lVar, C15035a aVar) {
        if (lVar != null) {
            lVar.invoke(aVar.b());
        }
        return C16807N.f139792a;
    }

    private final b0 u2() {
        return new b0(new C9860d0(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N u3(K k10, PipFragment pipFragment, boolean z10) {
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
                String a10 = C11818a.a("Item exists in any shopping list: " + z10, (Throwable) null);
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
        pipFragment.f72209m1 = z10;
        C5191t activity = pipFragment.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        return C16807N.f139792a;
    }

    private final void u4(ProductLarge productLarge) {
        K k32 = k3();
        De.a aVar = this.f72203g1;
        if (aVar == null) {
            C17542s.z("analyticsComponent");
            aVar = null;
        }
        k32.V1(new i.q(productLarge, aVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N v2(PipFragment pipFragment) {
        pipFragment.k3().F1();
        pipFragment.X2().f63227c.F1(0);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v3(PipFragment pipFragment, ip.k kVar) {
        C17542s.j(kVar, "it");
        if (b.f72224a[kVar.c().ordinal()] == 3) {
            pipFragment.p4();
        } else {
            pipFragment.v4();
        }
        return C16807N.f139792a;
    }

    private final void v4() {
        L<Boolean> l10 = this.f72204h1;
        if (l10 != null) {
            f.a aVar = tw.f.f56772d;
            C5191t requireActivity = requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            aVar.b(requireActivity).removeObserver(l10);
            this.f72204h1 = null;
        }
    }

    private final ei.e0 w2() {
        return new ei.e0(new T(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N w3(PipFragment pipFragment, boolean z10) {
        y0 y0Var;
        if (z10 && (y0Var = pipFragment.f72202f1) != null) {
            y0Var.k();
        }
        return C16807N.f139792a;
    }

    private final void w4(String str) {
        LoadingMaterialButton loadingMaterialButton = X2().f63226b;
        C17542s.i(loadingMaterialButton, "addToCartButton");
        I2.L.a(loadingMaterialButton, new t(loadingMaterialButton, this, str));
    }

    /* access modifiers changed from: private */
    public static final C16807N x2(PipFragment pipFragment, String str) {
        C17542s.j(str, "itemNo");
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.k3().V1(new i.C1075i(str));
            pipFragment.a3().b(f10, str);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x3(PipFragment pipFragment, gi.U u10) {
        C17542s.j(u10, "toolbarData");
        pipFragment.D4(u10);
        return C16807N.f139792a;
    }

    private final void x4(List<? extends fi.a> list) {
        C9854a0 a0Var;
        n.b bVar;
        RecyclerView.q layoutManager = X2().f63227c.getLayoutManager();
        ArrayList arrayList = null;
        Parcelable C12 = layoutManager != null ? layoutManager.C1() : null;
        y0 y0Var = this.f72202f1;
        List<Object> m10 = y0Var != null ? y0Var.m(list) : null;
        if (m10 != null) {
            Iterable iterable = m10;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (Object next : iterable) {
                if (next instanceof C9755j) {
                    bVar = new n.b("FINANCIAL_SERVICES_MODEL_ID", "PipFragmentTestTags_FINANCIAL_SERVICES", C13589g1.Large, false, new Y(this, next), new Z(this), C13026h.c(((C9755j) next).c()), (C13023e) null, new C13573c1.a(C18146a.f148498j4, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null), C13569b1.d.f116148b, false, (nI.p) null, 3208, (DefaultConstructorMarker) null);
                } else if (next instanceof C9748c) {
                    C9748c cVar = (C9748c) next;
                    C9748c.a a10 = cVar.a();
                    if (a10 instanceof C9748c.a.C1281a) {
                        a0Var = new C9854a0(this, a10);
                    } else if (a10 == null) {
                        a0Var = null;
                    } else {
                        throw new XH.t();
                    }
                    bVar = new n.b("ASSEMBLY_MODEL_ID", "PipFragmentTestTags_ASSEMBLY_SERVICE", C13589g1.Large, false, a0Var, new C9856b0(this, next), cVar.c(), (C13023e) null, new C13573c1.a(C18146a.f148738z3, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null), a0Var != null ? C13569b1.d.f116148b : C13569b1.g.f116154b, true, c1.c.c(1466721239, true, new v(next)), ModuleDescriptor.MODULE_VERSION, (DefaultConstructorMarker) null);
                } else {
                    continue;
                    arrayList2.add(next);
                }
                next = bVar;
                arrayList2.add(next);
            }
            arrayList = arrayList2;
        }
        T2().p(arrayList, true, new C9858c0(this));
        if (C12 != null) {
            layoutManager.B1(C12);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y2(PipFragment pipFragment, String str, C11412b bVar) {
        C17542s.j(str, "productNo");
        C17542s.j(bVar, "viewFilter");
        C8951o f10 = rw.f.f(pipFragment, pipFragment.N2(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            pipFragment.O2().b(f10, str, bVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y3(PipFragment pipFragment, List list) {
        C17542s.j(list, "items");
        pipFragment.x4(list);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y4(PipFragment pipFragment, Object obj) {
        C9755j jVar = (C9755j) obj;
        pipFragment.R3(jVar.b(), jVar.a());
        return C16807N.f139792a;
    }

    private final void z2() {
        F0 f02 = this.f72210n1;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f72210n1 = C16314k.d(C5222z.a(viewLifecycleOwner), C16311i0.c(), (QJ.T) null, new i(this, (C17164e<? super i>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N z3(PipFragment pipFragment, C9746a aVar) {
        C17542s.j(aVar, "result");
        if (aVar instanceof C9746a.C1280a) {
            Context context = pipFragment.getContext();
            if (context != null) {
                C9133b K22 = pipFragment.K2();
                C9746a.C1280a aVar2 = (C9746a.C1280a) aVar;
                Throwable b10 = aVar2.b();
                String a10 = aVar2.a();
                CoordinatorLayout coordinatorLayout = pipFragment.X2().f63229e;
                C17542s.i(coordinatorLayout, "snackbarParent");
                K22.showAddToCartException(context, coordinatorLayout, b10, a10);
            }
        } else if (aVar instanceof C9746a.b) {
            pipFragment.X2().getRoot().announceForAccessibility(pipFragment.getString(Oo.b.f84507T, ((C9746a.b) aVar).a()));
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z4(PipFragment pipFragment) {
        pipFragment.k3().V1(i.p.f63140a);
        return C16807N.f139792a;
    }

    public final Bx.a A2() {
        Bx.a aVar = this.f72166C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountApi");
        return null;
    }

    public final C10038a B2() {
        C10038a aVar = this.f72167D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("addressPickerNavigation");
        return null;
    }

    public final Ae.e C2() {
        Ae.e eVar = this.f72191X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Il.a D2() {
        Il.a aVar = this.f72195Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final C10242c E2() {
        C10242c cVar = this.f72193Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("appUserDataRepository");
        return null;
    }

    public final K.b H2() {
        K.b bVar = this.f72178O0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("assistedFactory");
        return null;
    }

    public final C11550a I2() {
        C11550a aVar = this.f72172I0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("backInStockApi");
        return null;
    }

    public final lm.e J2() {
        lm.e eVar = this.f72173J0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("backInStockNavigation");
        return null;
    }

    public final C9133b K2() {
        C9133b bVar = this.f72221y0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartApi");
        return null;
    }

    public final Eo.a L2() {
        Eo.a aVar = this.f72183S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeCustomTabsApi");
        return null;
    }

    public final am.c M2() {
        am.c cVar = this.f72189V0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("clipboardHandler");
        return null;
    }

    public String N2() {
        return this.f72194Y0;
    }

    public final C11411a O2() {
        C11411a aVar = this.f72170G0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final C11841a P2() {
        C11841a aVar = this.f72174K0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final Ar.j Q2() {
        Ar.j jVar = this.f72165B0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Tu.a R2() {
        Tu.a aVar = this.f72171H0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("itemAvailabilityNavigation");
        return null;
    }

    public final C10253a S2() {
        C10253a aVar = this.f72164A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killSwitchRepository");
        return null;
    }

    public final ListPickerNavigation U2() {
        ListPickerNavigation listPickerNavigation = this.f72184S0;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final C12860a V2() {
        C12860a aVar = this.f72223z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("localStoreSelectionRepository");
        return null;
    }

    public final Uh.r W2() {
        Uh.r rVar = this.f72190W0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("pipInternalNavigation");
        return null;
    }

    public final Zw.a Y2() {
        Zw.a aVar = this.f72181R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C15005b Z2() {
        C15005b bVar = this.f72188U0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C10796b a3() {
        C10796b bVar = this.f72186T0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("reviewsNavigation");
        return null;
    }

    public final C13909a b3() {
        C13909a aVar = this.f72169F0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public final C13331a c3() {
        C13331a aVar = this.f72176M0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppableImageNavigation");
        return null;
    }

    public final C13352d d3() {
        C13352d dVar = this.f72187U;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    public final C14613b e3() {
        C14613b bVar = this.f72185T;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("shoppingListRepository");
        return null;
    }

    public final x3.r f3() {
        x3.r rVar = this.f72192X0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    public final C14445a h3() {
        C14445a aVar = this.f72180Q0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storeDetailsNavigation");
        return null;
    }

    public final C13194a i3() {
        C13194a aVar = this.f72179P0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    public final z0 j3() {
        z0 z0Var = this.f72168E0;
        if (z0Var != null) {
            return z0Var;
        }
        C17542s.z("viewIn3dUseCase");
        return null;
    }

    public final ru.e l3() {
        ru.e eVar = this.f72182R0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("wayfindingNavigation");
        return null;
    }

    public final C14516c m3() {
        C14516c cVar = this.f72177N0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("zipSelectorNavigation");
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Drawable mutate;
        C17542s.j(menu, "menu");
        C17542s.j(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        gi.U value = k3().t1().getValue();
        if (value != null && value.c()) {
            menuInflater.inflate(Ph.d.f62842a, menu);
            if (S2().J()) {
                menu.removeItem(Ph.b.f62828v);
            }
            if (this.f72209m1) {
                menu.findItem(Ph.b.f62808b).setIcon(C18146a.f147965A5);
                Drawable icon = menu.findItem(Ph.b.f62808b).getIcon();
                if (icon != null && (mutate = icon.mutate()) != null) {
                    mutate.setTint(C6012a.c(requireContext(), C18010a.f147419c));
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f72197a1 = Rh.c.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = X2().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        F0 f02 = this.f72210n1;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f72210n1 = null;
        this.f72202f1 = null;
        if (this.f72197a1 != null) {
            this.f72197a1 = null;
        }
        this.f72198b1 = null;
        super.onDestroyView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5 = (r5 = (op.C11700k) r5.a()).c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            int r0 = r5.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x002c
            java.lang.String r5 = r4.N2()
            r0 = 2
            x4.o r5 = rw.f.f(r4, r5, r3, r0, r3)
            if (r5 == 0) goto L_0x009c
            boolean r5 = r5.k0()
            if (r5 != 0) goto L_0x009c
            androidx.fragment.app.t r5 = r4.getActivity()
            if (r5 == 0) goto L_0x009c
            r5.onBackPressed()
            goto L_0x009c
        L_0x002c:
            int r1 = Ph.b.f62808b
            if (r0 != r1) goto L_0x008c
            gi.K r5 = r4.k3()
            androidx.lifecycle.K r5 = r5.h1()
            java.lang.Object r5 = r5.getValue()
            ip.k r5 = (ip.k) r5
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r5.a()
            op.k r5 = (op.C11700k) r5
            if (r5 == 0) goto L_0x0053
            com.ingka.ikea.core.model.product.ProductLarge r5 = r5.c()
            if (r5 == 0) goto L_0x0053
            java.lang.String r5 = r5.i()
            goto L_0x0054
        L_0x0053:
            r5 = r3
        L_0x0054:
            if (r5 == 0) goto L_0x0084
            gi.K r0 = r4.k3()
            androidx.lifecycle.K r0 = r0.h1()
            java.lang.Object r0 = r0.getValue()
            ip.k r0 = (ip.k) r0
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r0.a()
            op.k r0 = (op.C11700k) r0
            if (r0 == 0) goto L_0x007e
            com.ingka.ikea.core.model.product.ProductLarge r0 = r0.c()
            if (r0 == 0) goto L_0x007e
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r0 = r0.h()
            if (r0 == 0) goto L_0x007e
            java.lang.String r3 = r0.i()
        L_0x007e:
            com.ingka.ikea.analytics.Interaction$Component r0 = com.ingka.ikea.analytics.Interaction$Component.PIP_WISHLIST_BUTTON
            r4.l4(r5, r3, r0)
            goto L_0x009c
        L_0x0084:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        L_0x008c:
            int r1 = Ph.b.f62828v
            if (r0 != r1) goto L_0x0098
            gi.K r5 = r4.k3()
            r5.Q1()
            goto L_0x009c
        L_0x0098:
            boolean r2 = super.onOptionsItemSelected(r5)
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onPause() {
        y0 y0Var = this.f72202f1;
        if (y0Var != null) {
            X2().f63227c.n1(y0Var);
            X2().f63227c.l1(y0Var);
        }
        super.onPause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r1 == com.ingka.ikea.analytics.Interaction$Component.DYNAMIC_LINK) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r4 = this;
            De.a r0 = r4.f72203g1
            r1 = 0
            java.lang.String r2 = "analyticsComponent"
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C17542s.z(r2)
            r0 = r1
        L_0x000b:
            com.ingka.ikea.analytics.Interaction$Component r3 = com.ingka.ikea.analytics.Interaction$Component.WEB_LINK
            if (r0 == r3) goto L_0x001c
            De.a r0 = r4.f72203g1
            if (r0 != 0) goto L_0x0017
            kotlin.jvm.internal.C17542s.z(r2)
            goto L_0x0018
        L_0x0017:
            r1 = r0
        L_0x0018:
            com.ingka.ikea.analytics.Interaction$Component r0 = com.ingka.ikea.analytics.Interaction$Component.DYNAMIC_LINK
            if (r1 != r0) goto L_0x0025
        L_0x001c:
            gi.K r0 = r4.k3()
            Qh.i$n r1 = Qh.i.n.f63138a
            r0.V1(r1)
        L_0x0025:
            super.onResume()
            androidx.appcompat.app.a r0 = ii.t0.e(r4)
            if (r0 == 0) goto L_0x003e
            android.content.Context r1 = r4.requireContext()
            java.lang.String r2 = "requireContext(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            boolean r1 = Xo.c.b(r1)
            r0.v(r1)
        L_0x003e:
            gi.K r0 = r4.k3()
            androidx.lifecycle.F r0 = r0.t1()
            java.lang.Object r0 = r0.getValue()
            gi.U r0 = (gi.U) r0
            if (r0 == 0) goto L_0x0051
            r4.D4(r0)
        L_0x0051:
            ii.y0 r0 = r4.f72202f1
            if (r0 == 0) goto L_0x0067
            Rh.c r1 = r4.X2()
            androidx.recyclerview.widget.RecyclerView r1 = r1.f63227c
            r1.n(r0)
            Rh.c r1 = r4.X2()
            androidx.recyclerview.widget.RecyclerView r1 = r1.f63227c
            r1.l(r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("productNo", k3().i1());
    }

    public void onStop() {
        y0 y0Var = this.f72202f1;
        if (y0Var != null) {
            y0Var.g();
        }
        super.onStop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c2, code lost:
        if (r0 == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            super.onViewCreated(r4, r5)
            Rh.c r4 = r3.X2()
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.getRoot()
            int r5 = Uo.a.f88327h
            android.view.View r4 = r4.findViewById(r5)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            kotlin.jvm.internal.C17542s.g(r4)
            ii.j r5 = new ii.j
            r5.<init>(r3)
            ii.k r0 = new ii.k
            r0.<init>(r3)
            ii.t0.h(r3, r4, r5, r0)
            ii.l r4 = new ii.l
            r4.<init>(r3)
            ii.n r5 = new ii.n
            r5.<init>(r3)
            gi.K r0 = r3.k3()
            r0.v1()
            ii.y0 r0 = new ii.y0
            android.content.Context r1 = r3.requireContext()
            java.lang.String r2 = "requireContext(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            Rh.c r2 = r3.X2()
            r0.<init>(r1, r2, r4, r5)
            r3.f72202f1 = r0
            Lg.d r4 = r3.i2()
            r3.f72198b1 = r4
            r3.G3()
            r3.J3()
            r4 = 1
            r3.setHasOptionsMenu(r4)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r3.getContext()
            r1 = 0
            r5.<init>(r0, r4, r1)
            Rh.c r4 = r3.X2()
            com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton r4 = r4.f63226b
            ii.o r0 = new ii.o
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            Rh.c r4 = r3.X2()
            androidx.recyclerview.widget.RecyclerView r4 = r4.f63227c
            r4.setLayoutManager(r5)
            Lg.d r5 = r3.f72198b1
            r4.setAdapter(r5)
            il.a r5 = new il.a
            r5.<init>()
            r4.setItemAnimator(r5)
            gi.K r4 = r3.k3()
            r3.s3(r4)
            java.lang.String r4 = r3.G2()
            if (r4 == 0) goto L_0x00c4
            fI.a r5 = com.ingka.ikea.analytics.Interaction$Component.getEntries()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.ingka.ikea.analytics.Interaction$Component r1 = (com.ingka.ikea.analytics.Interaction$Component) r1
            java.lang.String r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r4)
            if (r1 == 0) goto L_0x00a0
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            com.ingka.ikea.analytics.Interaction$Component r0 = (com.ingka.ikea.analytics.Interaction$Component) r0
            if (r0 == 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            De.a r0 = De.c.a(r4)
        L_0x00c2:
            if (r0 != 0) goto L_0x00c6
        L_0x00c4:
            com.ingka.ikea.analytics.Interaction$Component r0 = com.ingka.ikea.analytics.Interaction$Component.WEB_LINK
        L_0x00c6:
            r3.f72203g1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
