package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import Ar.j;
import Bx.a;
import Ej.C10707b;
import Ej.C10708c;
import Ej.C10709d;
import Ej.C10710e;
import Ej.C10711f;
import Ej.C10712g;
import Ej.G;
import Ej.r;
import Ej.v;
import Ej.w;
import Ej.z;
import Fz.u;
import Fz.x;
import HJ.C15854t;
import IC.C13023e;
import Iz.C13047m;
import Iz.C13049o;
import Iz.Y;
import Lj.p;
import Lj.q;
import Lj.t;
import Ni.C10796b;
import Sy.a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Uj.j;
import Vi.C10961a;
import Vi.C10962b;
import Vi.C10973m;
import Vi.C10974n;
import Vi.Q;
import Vi.S;
import Vi.T;
import Vi.f0;
import Vi.g0;
import Vi.n0;
import Vi.s0;
import Vi.u0;
import Vi.v0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import android.animation.Animator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.app.scanandgoonlineprovider.dialog.ConnectToWifiDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.ChildItemInfoWarningDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.ConfirmCollectQuantityDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.b;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.k;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.l;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dl.C11205j;
import dl.C11210o;
import dl.C11211p;
import eI.C17187b;
import el.C11248a;
import iq.C11411a;
import iq.C11412b;
import jC.C14617d;
import java.util.ArrayList;
import java.util.List;
import jj.C11420c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10026c;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15011d;
import rz.C15015h;
import rz.C15028v;
import rz.C15031y;
import rz.I;
import tK.C18010a;
import u2.C6012a;
import uK.C18146a;
import vz.C15150b;
import wj.C12274b;
import x4.C8951o;

@Metadata(d1 = {"\u0000û\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0011*\ty|¥\u0002©\u0002®\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002½\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0004J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0004J\u001f\u00100\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020*H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\u0004J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\u0004J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020*H\u0002¢\u0006\u0004\b?\u0010-J\u001f\u0010B\u001a\u00020\u00072\u0006\u0010>\u001a\u00020*2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020*H\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020\u00072\u0006\u0010L\u001a\u00020E2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010O\u001a\u00020EH\u0002¢\u0006\u0004\bP\u0010QJ'\u0010W\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010^\u001a\u00020\u00072\b\b\u0002\u0010]\u001a\u00020*H\u0002¢\u0006\u0004\b^\u0010-J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bc\u0010bJ\u001f\u0010d\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010R\u001a\u00020\u001fH\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bf\u0010\u0004J\u000f\u0010g\u001a\u00020\u0007H\u0002¢\u0006\u0004\bg\u0010\u0004J\u000f\u0010h\u001a\u00020\u0007H\u0002¢\u0006\u0004\bh\u0010\u0004J\u000f\u0010i\u001a\u00020\u0007H\u0002¢\u0006\u0004\bi\u0010\u0004J\u000f\u0010j\u001a\u00020\u0007H\u0002¢\u0006\u0004\bj\u0010\u0004J\u000f\u0010k\u001a\u00020\u0007H\u0002¢\u0006\u0004\bk\u0010\u0004J\u0017\u0010n\u001a\u00020\u00072\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u001f\u0010r\u001a\u00020\u00072\u000e\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010pH\u0002¢\u0006\u0004\br\u0010sJ'\u0010w\u001a\u00020\u00072\u0006\u0010t\u001a\u00020E2\u0006\u0010u\u001a\u00020E2\u0006\u0010v\u001a\u00020EH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010}\u001a\u00020|H\u0002¢\u0006\u0004\b}\u0010~J\u0012\u0010\u0001\u001a\u00020H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u0001\u00101J5\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0001\u0010\u0004R\u001f\u0010\u0001\u001a\u00020\u001f8\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010£\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b­\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010»\u0001\u001a\u00030´\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R*\u0010Ó\u0001\u001a\u00030Ì\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Û\u0001\u001a\u00030Ô\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010ã\u0001\u001a\u00030Ü\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R*\u0010ó\u0001\u001a\u00030ì\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R*\u0010û\u0001\u001a\u00030ô\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R*\u0010\u0002\u001a\u00030ü\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\u00030\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R#\u0010\u0002\u001a\f\u0012\u0005\u0012\u00030\u0002\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010¢\u0002\u001a\u00020E8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0019\u0010¤\u0002\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0002\u0010½\u0001R\u0018\u0010¨\u0002\u001a\u00030¥\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R!\u0010­\u0002\u001a\u00030©\u00028BX\u0002¢\u0006\u0010\n\u0006\bª\u0002\u0010\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R\u0018\u0010±\u0002\u001a\u00030®\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u0017\u0010´\u0002\u001a\u00020:8BX\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010³\u0002R\u001f\u0010·\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028BX\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0018\u0010º\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0018\u0010¼\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¹\u0002¨\u0006¾\u0002"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "addToFavouritesState", "LXH/N;", "X1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;)V", "O2", "X2", "y2", "H2", "LVi/Y;", "I1", "()LVi/Y;", "LVi/n0;", "O1", "()LVi/n0;", "j2", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/b$a;", "addButtonState", "W1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/b$a;)V", "V1", "c2", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;", "navigateTo", "d2", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f;)V", "", "productName", "itemNo", "Z2", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;", "sideEffect", "Y1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$c;)V", "A2", "w2", "", "closeOnDismiss", "Z1", "(Z)V", "k2", "manualInput", "g2", "(Ljava/lang/String;Z)V", "b2", "t2", "LEj/G;", "state", "i2", "(LEj/G;)V", "LUj/j;", "quantityPicker", "LFz/x;", "W2", "(LUj/j;)LFz/x;", "q1", "isVisible", "M2", "Lrz/I;", "product", "L2", "(ZLrz/I;)V", "useCashAndCarryUi", "", "N2", "(Z)I", "selected", "maxAvailable", "f3", "(II)V", "expectedQuantity", "d3", "(ILrz/I;)V", "quantity", "f2", "(Ljava/lang/String;I)V", "barcode", "Lrz/y;", "type", "Lrz/v;", "extras", "e2", "(Ljava/lang/String;Lrz/y;Lrz/v;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "entryPoint", "h2", "(Lrz/I;Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;)V", "shouldAnimate", "t1", "Landroid/view/View;", "view", "r1", "(Landroid/view/View;)V", "s2", "b3", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;Ljava/lang/String;)V", "D2", "C2", "u2", "F2", "o1", "e3", "LIC/e;", "message", "a3", "(LIC/e;)V", "", "newItems", "h3", "(Ljava/util/List;)V", "selectedQuantity", "minQuantity", "maxQuantity", "S2", "(III)V", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$j", "q2", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$j;", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$h", "m2", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$h;", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$i", "p2", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$i;", "productNo", "isCombination", "o2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "n2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "R", "Ljava/lang/String;", "D1", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "S", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LBx/a;", "T", "LBx/a;", "v1", "()LBx/a;", "setAccountApi", "(LBx/a;)V", "accountApi", "Llm/e;", "U", "Llm/e;", "y1", "()Llm/e;", "setBackInStockNavigation", "(Llm/e;)V", "backInStockNavigation", "LAe/e;", "X", "LAe/e;", "x1", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LAr/j;", "Y", "LAr/j;", "F1", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LIz/Y;", "Z", "LIz/Y;", "S1", "()LIz/Y;", "setScanAndGoNavigation$scanandgo_implementation_release", "(LIz/Y;)V", "scanAndGoNavigation", "Liq/a;", "y0", "Liq/a;", "E1", "()Liq/a;", "setEnergyLabelNavigation$scanandgo_implementation_release", "(Liq/a;)V", "energyLabelNavigation", "LIz/m;", "z0", "LIz/m;", "L1", "()LIz/m;", "setProductDetailsNavigation$scanandgo_implementation_release", "(LIz/m;)V", "productDetailsNavigation", "Lwj/b;", "A0", "Lwj/b;", "w1", "()Lwj/b;", "setAddToFavouritesInteractor$scanandgo_implementation_release", "(Lwj/b;)V", "addToFavouritesInteractor", "LSy/a;", "B0", "LSy/a;", "R1", "()LSy/a;", "setScanAndGoAnalytics$scanandgo_implementation_release", "(LSy/a;)V", "scanAndGoAnalytics", "LNi/b;", "C0", "LNi/b;", "Q1", "()LNi/b;", "setReviewsNavigation$scanandgo_implementation_release", "(LNi/b;)V", "reviewsNavigation", "Lrj/j;", "D0", "Lrj/j;", "T1", "()Lrj/j;", "setUnavailableChildItemsNavigation$scanandgo_implementation_release", "(Lrj/j;)V", "unavailableChildItemsNavigation", "LFj/k;", "E0", "LFj/k;", "M1", "()LFj/k;", "setProductInfoListBuilder$scanandgo_implementation_release", "(LFj/k;)V", "productInfoListBuilder", "LFj/b;", "F0", "LFj/b;", "z1", "()LFj/b;", "setBackgroundImageUiMapper$scanandgo_implementation_release", "(LFj/b;)V", "backgroundImageUiMapper", "LEo/a;", "G0", "LEo/a;", "C1", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "H0", "LFz/x;", "_binding", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h;", "I0", "LXH/o;", "U1", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/h;", "viewModel", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "J0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "_bottomSheetBehaviour", "LLg/d;", "K0", "LLg/d;", "_imageAdapter", "L0", "_productInfoPageAdapter", "M0", "I", "expansionState", "N0", "quantityPickerEnabled", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$b", "O0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$b;", "animationCancelListener", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$g", "P0", "H1", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$g;", "inAndOutOfStockConfig", "com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$c", "Q0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$c;", "bottomSheetCallback", "A1", "()LFz/x;", "binding", "B1", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehaviour", "G1", "()LLg/d;", "imageAdapter", "N1", "productInfoPageAdapter", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductInfoPageFragment extends d {

    /* renamed from: A0  reason: collision with root package name */
    public C12274b f91696A0;

    /* renamed from: B0  reason: collision with root package name */
    public Sy.a f91697B0;

    /* renamed from: C0  reason: collision with root package name */
    public C10796b f91698C0;

    /* renamed from: D0  reason: collision with root package name */
    public rj.j f91699D0;

    /* renamed from: E0  reason: collision with root package name */
    public Fj.k f91700E0;

    /* renamed from: F0  reason: collision with root package name */
    public Fj.b f91701F0;

    /* renamed from: G0  reason: collision with root package name */
    public Eo.a f91702G0;

    /* renamed from: H0  reason: collision with root package name */
    private x f91703H0;

    /* renamed from: I0  reason: collision with root package name */
    private final C16824o f91704I0;

    /* renamed from: J0  reason: collision with root package name */
    private BottomSheetBehavior<LinearLayout> f91705J0;

    /* renamed from: K0  reason: collision with root package name */
    private Lg.d f91706K0;

    /* renamed from: L0  reason: collision with root package name */
    private Lg.d f91707L0;

    /* renamed from: M0  reason: collision with root package name */
    private int f91708M0;
    /* access modifiers changed from: private */

    /* renamed from: N0  reason: collision with root package name */
    public boolean f91709N0;

    /* renamed from: O0  reason: collision with root package name */
    private final b f91710O0;

    /* renamed from: P0  reason: collision with root package name */
    private final C16824o f91711P0;

    /* renamed from: Q0  reason: collision with root package name */
    private final c f91712Q0;

    /* renamed from: R  reason: collision with root package name */
    private final String f91713R = "scanandgo/productInfoPage?rawValue={rawValue}&format={format}";

    /* renamed from: S  reason: collision with root package name */
    private final C17631a<C16807N> f91714S = new Ej.m();

    /* renamed from: T  reason: collision with root package name */
    public Bx.a f91715T;

    /* renamed from: U  reason: collision with root package name */
    public lm.e f91716U;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f91717X;

    /* renamed from: Y  reason: collision with root package name */
    public Ar.j f91718Y;

    /* renamed from: Z  reason: collision with root package name */
    public Y f91719Z;

    /* renamed from: y0  reason: collision with root package name */
    public C11411a f91720y0;

    /* renamed from: z0  reason: collision with root package name */
    public C13047m f91721z0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$a;", "LVi/s0;", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment;)V", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "LXH/N;", "a", "(Lcom/ingka/ikea/app/base/ProductKey;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements s0 {
        public a() {
        }

        public void a(ProductKey productKey) {
            C17542s.j(productKey, "productKey");
            ProductInfoPageFragment.this.R1().A(productKey.getProductNo());
            ProductInfoPageFragment productInfoPageFragment = ProductInfoPageFragment.this;
            C8951o f10 = rw.f.f(productInfoPageFragment, productInfoPageFragment.D1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                ProductInfoPageFragment.this.Q1().b(f10, productKey.getProductNo());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$b", "LLj/p;", "Landroid/animation/Animator;", "p0", "LXH/N;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91723a;

        b(ProductInfoPageFragment productInfoPageFragment) {
            this.f91723a = productInfoPageFragment;
        }

        public void onAnimationCancel(Animator animator) {
            C17542s.j(animator, "p0");
            u uVar = this.f91723a.A1().f110223i;
            ProductInfoPageFragment productInfoPageFragment = this.f91723a;
            MaterialButton materialButton = uVar.f110206h;
            C17542s.i(materialButton, "btnNotifyBackInStock");
            productInfoPageFragment.s2(materialButton);
            MaterialButton materialButton2 = uVar.f110200b;
            C17542s.i(materialButton2, "addToCart");
            productInfoPageFragment.s2(materialButton2);
            TextView textView = uVar.f110209k;
            C17542s.i(textView, "quantity");
            productInfoPageFragment.s2(textView);
            ConstraintLayout constraintLayout = uVar.f110210l;
            C17542s.i(constraintLayout, "quantityPickerSelector");
            productInfoPageFragment.s2(constraintLayout);
            MaterialButton materialButton3 = uVar.f110201c;
            C17542s.i(materialButton3, "addToOnlineCartButton");
            productInfoPageFragment.s2(materialButton3);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "LXH/N;", "b", "(Landroid/view/View;F)V", "", "newState", "c", "(Landroid/view/View;I)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91724a;

        c(ProductInfoPageFragment productInfoPageFragment) {
            this.f91724a = productInfoPageFragment;
        }

        public void b(View view, float f10) {
            C17542s.j(view, "bottomSheet");
            this.f91724a.A1().f110219e.setAlpha(f10 <= 0.35f ? f10 / 0.35f : 1.0f);
        }

        public void c(View view, int i10) {
            C17542s.j(view, "bottomSheet");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$handleNavigateTo$$inlined$collectOnStarted$1", f = "ProductInfoPageFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91725c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91726d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91727e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, ProductInfoPageFragment productInfoPageFragment) {
            super(2, eVar);
            this.f91727e = productInfoPageFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(eVar, this.f91727e);
            dVar.f91726d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(f fVar, C17164e<? super C16807N> eVar) {
            return ((d) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91725c == 0) {
                y.b(obj);
                f fVar = (f) this.f91726d;
                if (fVar != null) {
                    this.f91727e.U1().N0(l.c.f92035a);
                    this.f91727e.d2(fVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91728a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91729a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$handleNavigateTo$$inlined$map$1$2", f = "ProductInfoPageFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$e$a$a  reason: collision with other inner class name */
            public static final class C2021a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91730c;

                /* renamed from: d  reason: collision with root package name */
                int f91731d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91732e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2021a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91732e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91730c = obj;
                    this.f91731d |= Integer.MIN_VALUE;
                    return this.f91732e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91729a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment.e.a.C2021a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$e$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment.e.a.C2021a) r0
                    int r1 = r0.f91731d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91731d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$e$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91730c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91731d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91729a
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.j r5 = (com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.j) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f r5 = r5.e()
                    r0.f91731d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f91728a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91728a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment$handleState$$inlined$collectOnStarted$1", f = "ProductInfoPageFragment.kt", l = {}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<j, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91733c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91734d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91735e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17164e eVar, ProductInfoPageFragment productInfoPageFragment) {
            super(2, eVar);
            this.f91735e = productInfoPageFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(eVar, this.f91735e);
            fVar.f91734d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C17164e<? super C16807N> eVar) {
            return ((f) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91733c == 0) {
                y.b(obj);
                j jVar = (j) this.f91734d;
                G f10 = jVar.f();
                if (f10 != null) {
                    this.f91735e.i2(f10);
                    ProductInfoPageFragment productInfoPageFragment = this.f91735e;
                    b b10 = jVar.b();
                    boolean z10 = false;
                    if (b10 != null && b10.c()) {
                        z10 = true;
                    }
                    productInfoPageFragment.f91709N0 = z10;
                    b b11 = jVar.b();
                    if (b11 != null) {
                        this.f91735e.W1(b11.a());
                        this.f91735e.V1(b11.b());
                    }
                }
                if (jVar.d() instanceof e.C2024e) {
                    this.f91735e.b2();
                }
                this.f91735e.X1(jVar.a());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$g", "LFj/c;", "LXH/N;", "b", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "bannerTitle", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements Fj.c {

        /* renamed from: a  reason: collision with root package name */
        private final String f91736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91737b;

        g(ProductInfoPageFragment productInfoPageFragment) {
            this.f91737b = productInfoPageFragment;
            String string = productInfoPageFragment.getString(Ez.f.f109682V);
            C17542s.i(string, "getString(...)");
            this.f91736a = string;
        }

        public String a() {
            return this.f91736a;
        }

        public void b() {
            this.f91737b.U1().N0(new l.j(f.l.a.UNAVAILABLE_IN_STORE));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$h", "LVi/n;", "Lrz/h;", "childItem", "LXH/N;", "a", "(Lrz/h;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C10974n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91738a;

        h(ProductInfoPageFragment productInfoPageFragment) {
            this.f91738a = productInfoPageFragment;
        }

        public void a(C15015h hVar) {
            C17542s.j(hVar, "childItem");
            this.f91738a.R1().u(hVar.e().d());
            this.f91738a.o2(hVar.e().d(), false);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$i", "LVi/S;", "LVi/T;", "model", "LXH/N;", "a", "(LVi/T;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements S {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91739a;

        i(ProductInfoPageFragment productInfoPageFragment) {
            this.f91739a = productInfoPageFragment;
        }

        public void a(T t10) {
            C17542s.j(t10, "model");
            if (t10 instanceof T.b) {
                this.f91739a.e3();
            } else if (t10 instanceof T.c) {
                this.f91739a.U1().N0(new l.j(f.l.a.AVAILABILITY_NOTICE));
            } else if (!(t10 instanceof T.a)) {
                throw new t();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/ProductInfoPageFragment$j", "LVi/g0;", "", "productNo", "", "isCombination", "LXH/N;", "a", "(Ljava/lang/String;Z)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements g0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductInfoPageFragment f91740a;

        j(ProductInfoPageFragment productInfoPageFragment) {
            this.f91740a = productInfoPageFragment;
        }

        public void a(String str, boolean z10) {
            C17542s.j(str, "productNo");
            this.f91740a.U1().N0(l.h.f92041a);
            this.f91740a.o2(str, z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91741c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C5187o oVar) {
            super(0);
            this.f91741c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91741c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91742c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C17631a aVar) {
            super(0);
            this.f91742c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91742c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91743c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C16824o oVar) {
            super(0);
            this.f91743c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91743c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91744c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91744c = aVar;
            this.f91745d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91744c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91745d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91746c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91746c = oVar;
            this.f91747d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91747d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91746c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductInfoPageFragment() {
        C16824o a10 = C16825p.a(s.NONE, new l(new k(this)));
        this.f91704I0 = W.b(this, P.b(h.class), new m(a10), new n((C17631a) null, a10), new o(this, a10));
        this.f91708M0 = 3;
        this.f91709N0 = true;
        this.f91710O0 = new b(this);
        this.f91711P0 = C16825p.b(new Ej.s(this));
        this.f91712Q0 = new c(this);
    }

    /* access modifiers changed from: private */
    public final x A1() {
        x xVar = this.f91703H0;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void A2() {
        A1().f110223i.f110206h.setOnClickListener(new Ej.n(this));
    }

    private final BottomSheetBehavior<LinearLayout> B1() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.f91705J0;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final void B2(ProductInfoPageFragment productInfoPageFragment, View view) {
        productInfoPageFragment.U1().N0(l.g.f92040a);
    }

    private final void C2() {
        rw.d.a(this, C13049o.a.b.f111064b, "product_detail_request_key");
        C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    private final void D2() {
        A1().f110220f.setOnClickListener(new Ej.i(this));
    }

    /* access modifiers changed from: private */
    public static final void E2(ProductInfoPageFragment productInfoPageFragment, View view) {
        productInfoPageFragment.C2();
    }

    private final void F2() {
        A1().f110223i.f110209k.setOnClickListener(new C10712g(this));
    }

    private final Lg.d G1() {
        Lg.d dVar = this.f91706K0;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final void G2(ProductInfoPageFragment productInfoPageFragment, View view) {
        productInfoPageFragment.U1().N0(l.k.f92044a);
    }

    private final g H1() {
        return (g) this.f91711P0.getValue();
    }

    private final void H2() {
        this.f91707L0 = new Lg.d((Lg.a<?>[]) new Lg.a[]{I1(), O1(), new C10962b(), new Vi.k0(), new Q(p2()), new C10973m(a.e.SHOP_GO_PIP, R1(), C10961a.C1870a.f88541a, m2()), new C11205j(new Ej.k(this)), new C11248a(), new C15150b(), new Vi.i0(), new u0(new a()), new f0(q2())});
        RecyclerView recyclerView = A1().f110219e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(N1());
        recyclerView.j(new q((C17642l<? super q.a, C16807N>) new Ej.l(recyclerView)));
    }

    private final Vi.Y I1() {
        return new Vi.Y(new Ej.o(this), new Ej.p(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N I2(ProductInfoPageFragment productInfoPageFragment) {
        productInfoPageFragment.C2();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J1(ProductInfoPageFragment productInfoPageFragment, String str) {
        C17542s.j(str, "itemNo");
        C11411a.C2225a.a(productInfoPageFragment.E1(), androidx.navigation.fragment.a.a(productInfoPageFragment), str, (C11412b) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J2(RecyclerView recyclerView, q.a aVar) {
        C17542s.j(aVar, "$this$DividerLookupDecoration");
        aVar.g(C6012a.c(recyclerView.getContext(), C18010a.f147421e));
        aVar.h(new Ej.q(C16877v.q(P.b(v0.class), P.b(T.class))));
        aVar.i(recyclerView.getResources().getDimensionPixelOffset(C10026c.f75268b));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K1(ProductInfoPageFragment productInfoPageFragment, Link link) {
        C17542s.j(link, "link");
        if (link instanceof Link.External) {
            productInfoPageFragment.C1().a(productInfoPageFragment.getContext(), ((Link.External) link).e());
        } else if (link instanceof Link.Deeplink) {
            try {
                C8951o f10 = rw.f.f(productInfoPageFragment, productInfoPageFragment.D1(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    Uri parse = Uri.parse(((Link.Deeplink) link).e());
                    C17542s.i(parse, "parse(...)");
                    f10.X(parse);
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (ActivityNotFoundException e10) {
                IllegalStateException illegalStateException = new IllegalStateException("No Activity found to handle Intent with url: " + ((Link.Deeplink) link).e(), e10);
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
                        String name = productInfoPageFragment.getClass().getName();
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
                C16807N n11 = C16807N.f139792a;
            }
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean K2(List list, q.b bVar) {
        C17542s.j(bVar, "<this>");
        Iterable iterable = list;
        boolean l02 = C16877v.l0(iterable, P.b(bVar.a().getClass()));
        Object b10 = bVar.b();
        return l02 || (b10 != null ? C16877v.l0(iterable, P.b(b10.getClass())) : false);
    }

    private final void L2(boolean z10, I i10) {
        MaterialButton materialButton = A1().f110223i.f110201c;
        C17542s.i(materialButton, "addToOnlineCartButton");
        materialButton.setVisibility(z10 ? 0 : 8);
        if (z10) {
            q1();
            R1().o(i10.l().getProductNo(), a.e.SHOP_GO_PIP);
        }
    }

    private final void M2(boolean z10) {
        MaterialButton materialButton = A1().f110223i.f110206h;
        C17542s.i(materialButton, "btnNotifyBackInStock");
        materialButton.setVisibility(z10 ? 0 : 8);
        if (z10) {
            q1();
        }
    }

    private final Lg.d N1() {
        Lg.d dVar = this.f91707L0;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final int N2(boolean z10) {
        if (!z10) {
            B1().O0(0.7f);
            B1().M0(false);
            this.f91708M0 = 6;
        }
        return z10 ? 200 : 150;
    }

    private final n0 O1() {
        return new n0(new r(this));
    }

    private final void O2() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.R1("fr_res_key_wifi", this, new w(this));
        Y S12 = S1();
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
        S12.j(parentFragmentManager2, this, new Ej.x(this));
        parentFragmentManager.R1("CCQD_REQUEST_CODE", this, new Ej.y(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N P1(ProductInfoPageFragment productInfoPageFragment, String str, String str2) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        productInfoPageFragment.U1().N0(new l.d(str, str2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void P2(ProductInfoPageFragment productInfoPageFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        if (!bundle.getBoolean("fr_open_settings_bundle_key")) {
            productInfoPageFragment.C2();
        } else {
            productInfoPageFragment.U1().N0(l.i.f92042a);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q2(ProductInfoPageFragment productInfoPageFragment) {
        productInfoPageFragment.C2();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void R2(ProductInfoPageFragment productInfoPageFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        if (ConfirmCollectQuantityDialog.f91316U.b(bundle)) {
            productInfoPageFragment.U1().N0(l.f.f92039a);
        }
    }

    private final void S2(int i10, int i11, int i12) {
        ImageButton imageButton = A1().f110223i.f110207i;
        boolean z10 = false;
        imageButton.setEnabled(i10 > i11);
        imageButton.setOnClickListener(new z(this, i10, imageButton, i11));
        ImageButton imageButton2 = A1().f110223i.f110208j;
        if (i10 < i12) {
            z10 = true;
        }
        imageButton2.setEnabled(z10);
        imageButton2.setOnClickListener(new C10708c(this, i10, imageButton2, i12));
    }

    /* access modifiers changed from: private */
    public static final void T2(ProductInfoPageFragment productInfoPageFragment, int i10, ImageButton imageButton, int i11, View view) {
        if (productInfoPageFragment.f91709N0) {
            V2(productInfoPageFragment, i10, i10 - 1);
            imageButton.setEnabled(i10 > i11);
        }
    }

    /* access modifiers changed from: private */
    public final h U1() {
        return (h) this.f91704I0.getValue();
    }

    /* access modifiers changed from: private */
    public static final void U2(ProductInfoPageFragment productInfoPageFragment, int i10, ImageButton imageButton, int i11, View view) {
        if (productInfoPageFragment.f91709N0) {
            V2(productInfoPageFragment, i10, i10 + 1);
            imageButton.setEnabled(i10 < i11);
        }
    }

    /* access modifiers changed from: private */
    public final void V1(b.a aVar) {
        u uVar = A1().f110223i;
        MaterialButton materialButton = uVar.f110201c;
        materialButton.setEnabled(aVar.b());
        C13023e d10 = aVar.d();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        String b10 = d10.b(requireContext);
        if (aVar.c()) {
            b10 = null;
        }
        materialButton.setText(b10);
        LottieAnimationView lottieAnimationView = uVar.f110204f;
        C17542s.i(lottieAnimationView, "ballOnline");
        lottieAnimationView.setVisibility(aVar.c() ? 0 : 8);
    }

    private static final void V2(ProductInfoPageFragment productInfoPageFragment, int i10, int i11) {
        productInfoPageFragment.U1().N0(new l.n(i11));
        productInfoPageFragment.A1().f110223i.f110202d.setText(String.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public final void W1(b.a aVar) {
        u uVar = A1().f110223i;
        MaterialButton materialButton = uVar.f110200b;
        materialButton.setEnabled(aVar.b());
        C13023e d10 = aVar.d();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        String b10 = d10.b(requireContext);
        if (aVar.c()) {
            b10 = null;
        }
        materialButton.setText(b10);
        LottieAnimationView lottieAnimationView = uVar.f110203e;
        C17542s.i(lottieAnimationView, "ball");
        lottieAnimationView.setVisibility(aVar.c() ? 0 : 8);
    }

    private final x W2(Uj.j jVar) {
        x A12 = A1();
        int i10 = 8;
        if (jVar instanceof j.a) {
            TextView textView = A12.f110223i.f110209k;
            C17542s.i(textView, "quantity");
            textView.setVisibility(8);
            ConstraintLayout constraintLayout = A12.f110223i.f110210l;
            C17542s.i(constraintLayout, "quantityPickerSelector");
            constraintLayout.setVisibility(8);
        } else if (jVar instanceof j.c) {
            TextView textView2 = A12.f110223i.f110209k;
            C17542s.i(textView2, "quantity");
            textView2.setVisibility(0);
            A12.f110223i.f110209k.setText(((j.c) jVar).b());
        } else if (jVar instanceof j.b) {
            ConstraintLayout constraintLayout2 = A12.f110223i.f110210l;
            C17542s.i(constraintLayout2, "quantityPickerSelector");
            j.b bVar = (j.b) jVar;
            if (bVar.a()) {
                i10 = 0;
            }
            constraintLayout2.setVisibility(i10);
            S2(bVar.f(), bVar.e(), bVar.d());
            A12.f110223i.f110202d.setText(bVar.g());
            A12.f110223i.f110209k.setText(bVar.g());
            q1();
        } else {
            throw new t();
        }
        return A12;
    }

    /* access modifiers changed from: private */
    public final void X1(a aVar) {
        ImageButton imageButton = A1().f110216b;
        if (aVar instanceof a.C2022a) {
            C17542s.g(imageButton);
            imageButton.setVisibility(0);
            if (((a.C2022a) aVar).a()) {
                imageButton.setImageResource(Ez.b.f109497d);
            } else {
                imageButton.setImageResource(Ez.b.f109498e);
            }
        } else if (C17542s.e(aVar, a.b.f91749a)) {
            C17542s.g(imageButton);
            imageButton.setVisibility(8);
        } else {
            throw new t();
        }
    }

    private final void X2() {
        this.f91705J0 = BottomSheetBehavior.q0(A1().f110217c);
        B1().c0(this.f91712Q0);
        b(new Ej.t(this));
        D2();
        u2();
        F2();
        y2();
        H2();
        A2();
        o1();
        w2();
    }

    private final void Y1(f.c cVar) {
        if (cVar instanceof f.c.C2025c) {
            v1().a(a.C2584a.BACK_IN_STOCK_NOTIFICATIONS).show(getParentFragmentManager(), "login_signup_promotion_bottom_sheet");
        } else if (cVar instanceof f.c.a) {
            C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f.c.a aVar = (f.c.a) cVar;
                y1().a(f10, aVar.a(), aVar.b().l().getProductNo(), aVar.b().l().getProductType());
            }
        } else if (cVar instanceof f.c.b) {
            f.c.b bVar = (f.c.b) cVar;
            y1().b(androidx.navigation.fragment.a.a(this), bVar.a(), bVar.b().k().e().i(), bVar.b().l().getProductNo(), bVar.b().l().getProductType());
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Y2(ProductInfoPageFragment productInfoPageFragment, jC.q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        x A12 = productInfoPageFragment.A1();
        FloatingActionButton floatingActionButton = A12.f110220f;
        C17542s.i(floatingActionButton, "closeFab");
        qVar.e(floatingActionButton, C14617d.Margin);
        RecyclerView recyclerView = A12.f110222h;
        C17542s.i(recyclerView, "imageRecycler");
        qVar.e(recyclerView, C14617d.Padding);
        return C16807N.f139792a;
    }

    private final void Z1(boolean z10) {
        MaterialButton materialButton = null;
        if (!z10) {
            u1(this, false, 1, (Object) null);
            materialButton = A1().f110223i.f110200b;
        }
        MaterialButton materialButton2 = materialButton;
        Ar.j F12 = F1();
        ConstraintLayout b10 = A1().getRoot();
        C17542s.i(b10, "getRoot(...)");
        String string = getString(Oo.b.f84526U8);
        C17542s.i(string, "getString(...)");
        j.a.s(F12, b10, string, getString(Ez.f.f109674N), -1, materialButton2, (C17631a) null, new C10709d(z10, this), 32, (Object) null);
    }

    private final void Z2(String str, String str2) {
        C12274b w12 = w1();
        w12.b(androidx.navigation.fragment.a.a(this), new ListPickerNavigation.Operation.AddOrRemove(str, str2, 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.SHOP_AND_GO_PIP_ADD_TO_WISHLIST, Ae.k.BUTTON), 4, (DefaultConstructorMarker) null));
        C12274b.a.b(w12, this, U1().getState().getValue().c(), (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(boolean z10, ProductInfoPageFragment productInfoPageFragment, j.b bVar) {
        C8951o f10;
        C17542s.j(bVar, "it");
        if (z10 && (f10 = rw.f.f(productInfoPageFragment, productInfoPageFragment.D1(), (C17642l) null, 2, (Object) null)) != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    private final void a3(C13023e eVar) {
        ChildItemInfoWarningDialog.a aVar = ChildItemInfoWarningDialog.f91313M;
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        aVar.a(eVar.b(requireContext)).show(getParentFragmentManager(), "ChildItemAvailabilityInfoDialog");
    }

    /* access modifiers changed from: private */
    public final void b2() {
        t2();
        t.b bVar = t.b.f83281a;
        h3(C16877v.q(bVar, bVar, bVar, new C11210o("", 56)));
        B1().S0(0);
        B1().X0(4);
    }

    private final void b3(f.l.a aVar, String str) {
        T1().b(androidx.navigation.fragment.a.a(this), aVar.name(), str);
        T1().a(this, D1(), new Ej.u(this));
    }

    private final void c2() {
        C16532g R10 = C16534i.R(C5208k.b(C16534i.s(new e(U1().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new d((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public static final C16807N c3(ProductInfoPageFragment productInfoPageFragment, boolean z10) {
        productInfoPageFragment.U1().N0(new l.C2030l(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void d2(f fVar) {
        if (fVar instanceof f.a) {
            ScanAndGoBottomSheetFragment.a aVar = ScanAndGoBottomSheetFragment.f91342T;
            String string = getString(Oo.b.f84497S, ((f.a) fVar).a());
            C17542s.i(string, "getString(...)");
            ScanAndGoBottomSheetFragment.a.g(aVar, this, string, (String) null, C18146a.f148220R5, 2, (Object) null);
        } else if (fVar instanceof f.b) {
            f.b bVar = (f.b) fVar;
            e2(bVar.b().c(), bVar.b().p(), bVar.a());
        } else if (fVar instanceof f.c) {
            Y1((f.c) fVar);
        } else if (fVar instanceof f.d) {
            f.d dVar = (f.d) fVar;
            f3(dVar.b(), dVar.a());
        } else if (fVar instanceof f.e) {
            f.e eVar = (f.e) fVar;
            f2(eVar.a().k().e().i(), eVar.b());
        } else if (fVar instanceof f.C2026f) {
            f.C2026f fVar2 = (f.C2026f) fVar;
            d3(fVar2.a(), fVar2.b());
        } else if (fVar instanceof f.g) {
            Z1(((f.g) fVar).a());
        } else if (fVar instanceof f.h) {
            f.h hVar = (f.h) fVar;
            g2(hVar.a(), hVar.b());
        } else if (fVar instanceof f.j) {
            f.j jVar = (f.j) fVar;
            b3(jVar.a(), jVar.b().c());
        } else if (fVar instanceof f.k) {
            f.k kVar = (f.k) fVar;
            h2(kVar.b(), kVar.a());
        } else if (fVar instanceof f.m) {
            f.m mVar = (f.m) fVar;
            Z2(mVar.b(), mVar.a());
        } else if (fVar instanceof f.n) {
            Ar.j F12 = F1();
            ConstraintLayout b10 = A1().getRoot();
            C17542s.i(b10, "getRoot(...)");
            C13023e a10 = ((f.n) fVar).a();
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            j.a.s(F12, b10, a10.b(requireContext), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
        } else if (C17542s.e(fVar, f.o.f91799a)) {
            k2();
        } else if (C17542s.e(fVar, f.p.f91800a)) {
            new ConnectToWifiDialog().show(getParentFragmentManager(), (String) null);
        } else if (C17542s.e(fVar, f.q.f91801a)) {
            Y S12 = S1();
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            S12.i(parentFragmentManager);
        } else if (fVar instanceof f.i) {
            a3(((f.i) fVar).a());
        } else {
            throw new XH.t();
        }
    }

    private final void d3(int i10, I i11) {
        ConfirmCollectQuantityDialog.f91316U.a(i11.k().e().i(), i11.k().e().c(), i11.k().d().getUrl(), i10).show(getParentFragmentManager(), (String) null);
    }

    private final void e2(String str, C15031y yVar, C15028v vVar) {
        rw.d.a(this, new C13049o.a.C2686a(str, yVar, vVar.b(), vVar.a().size()), "product_detail_request_key");
        C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: private */
    public final void e3() {
        FullscreenDialogFragment.a aVar = FullscreenDialogFragment.f94870N;
        String string = getString(Ez.f.f109671K);
        String string2 = getString(Ez.f.f109670J);
        C17542s.i(string2, "getString(...)");
        FullscreenDialogFragment.a.b(aVar, (String) null, string, string2, Ez.f.f109674N, (FullscreenDialogFragment.b) null, 17, (Object) null).show(getParentFragmentManager(), "fullscreenReminderTag");
    }

    private final void f2(String str, int i10) {
        rw.d.a(this, new C13049o.a.c(str, i10), "product_detail_request_key");
        C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    private final void f3(int i10, int i11) {
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        fl.c.d(requireContext, i10, i11, 0, new v(this), 8, (Object) null).show();
    }

    private final void g2(String str, boolean z10) {
        rw.d.a(this, new C13049o.a.e(str, z10), "product_detail_request_key");
        C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g3(ProductInfoPageFragment productInfoPageFragment, int i10) {
        productInfoPageFragment.U1().N0(new l.m(i10));
        return C16807N.f139792a;
    }

    private final void h2(I i10, f.l.a aVar) {
        C15011d a10 = i10.h().a();
        if (a10 instanceof C15011d.b) {
            b3(aVar, i10.c());
        } else if (a10 instanceof C15011d.a) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("This state should not be reachable if there is no availability card");
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
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ProductInfoPageFragment.class.getName();
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
            U1().N0(new l.C2030l(false));
        } else {
            throw new XH.t();
        }
    }

    private final void h3(List<? extends Object> list) {
        Lg.d.q(G1(), list, false, (C17642l) null, 6, (Object) null);
        A1().f110222h.w1(0);
    }

    /* access modifiers changed from: private */
    public final void i2(G g10) {
        t1(true);
        B1().S0((int) Xo.e.a(100));
        LinearLayout linearLayout = A1().f110217c;
        C17542s.i(linearLayout, "bottomSheet");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) Xo.e.a(72));
        h3(z1().a(g10.c(), N2(U1().c1(g10.c()))));
        W2(g10.d());
        M2(C11420c.b(g10.c()));
        L2(C11420c.a(g10.c()), g10.c());
        U1().Y0(k.a.f92032a);
        Lg.d.q(N1(), M1().a(g10.c(), g10.e(), g10.f(), H1()), false, (C17642l) null, 6, (Object) null);
        if (g10.g()) {
            B1().X0(this.f91708M0);
        }
    }

    private final void j2() {
        C16532g R10 = C16534i.R(C5208k.b(U1().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new f((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void k2() {
        rw.d.a(this, C13049o.a.f.f111069b, "product_detail_request_key");
        C8951o f10 = rw.f.f(this, D1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: private */
    public static final g l2(ProductInfoPageFragment productInfoPageFragment) {
        return new g(productInfoPageFragment);
    }

    private final h m2() {
        return new h(this);
    }

    private final void o1() {
        A1().f110216b.setOnClickListener(new C10710e(this));
    }

    /* access modifiers changed from: private */
    public final void o2(String str, boolean z10) {
        L1().b(androidx.navigation.fragment.a.a(this), str, z10);
    }

    /* access modifiers changed from: private */
    public static final void p1(ProductInfoPageFragment productInfoPageFragment, View view) {
        productInfoPageFragment.U1().N0(l.a.f92033a);
    }

    private final i p2() {
        return new i(this);
    }

    private final void q1() {
        LinearLayout linearLayout = A1().f110217c;
        C17542s.i(linearLayout, "bottomSheet");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), A1().f110217c.getPaddingBottom() + ((int) Xo.e.a(72)));
        BottomSheetBehavior<LinearLayout> B12 = B1();
        B12.S0(B12.u0() + (isVisible() ? (int) Xo.e.a(72) : 0));
    }

    private final j q2() {
        return new j(this);
    }

    private final void r1(View view) {
        view.animate().setListener(this.f91710O0).translationY(0.0f).start();
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(ProductInfoPageFragment productInfoPageFragment, jC.q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        x A12 = productInfoPageFragment.A1();
        FloatingActionButton floatingActionButton = A12.f110220f;
        C17542s.i(floatingActionButton, "closeFab");
        qVar.e(floatingActionButton, C14617d.Margin);
        RecyclerView recyclerView = A12.f110222h;
        C17542s.i(recyclerView, "imageRecycler");
        qVar.e(recyclerView, C14617d.Padding);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s1() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void s2(View view) {
        view.setTranslationY(0.0f);
    }

    private final void t1(boolean z10) {
        if (z10) {
            u uVar = A1().f110223i;
            MaterialButton materialButton = uVar.f110206h;
            C17542s.i(materialButton, "btnNotifyBackInStock");
            r1(materialButton);
            MaterialButton materialButton2 = uVar.f110200b;
            C17542s.i(materialButton2, "addToCart");
            r1(materialButton2);
            TextView textView = uVar.f110209k;
            C17542s.i(textView, "quantity");
            r1(textView);
            ConstraintLayout constraintLayout = uVar.f110210l;
            C17542s.i(constraintLayout, "quantityPickerSelector");
            r1(constraintLayout);
            MaterialButton materialButton3 = uVar.f110201c;
            C17542s.i(materialButton3, "addToOnlineCartButton");
            r1(materialButton3);
            return;
        }
        u uVar2 = A1().f110223i;
        MaterialButton materialButton4 = uVar2.f110206h;
        C17542s.i(materialButton4, "btnNotifyBackInStock");
        s2(materialButton4);
        MaterialButton materialButton5 = uVar2.f110200b;
        C17542s.i(materialButton5, "addToCart");
        s2(materialButton5);
        TextView textView2 = uVar2.f110209k;
        C17542s.i(textView2, "quantity");
        s2(textView2);
        ConstraintLayout constraintLayout2 = uVar2.f110210l;
        C17542s.i(constraintLayout2, "quantityPickerSelector");
        s2(constraintLayout2);
        MaterialButton materialButton6 = uVar2.f110201c;
        C17542s.i(materialButton6, "addToOnlineCartButton");
        s2(materialButton6);
    }

    private final void t2() {
        u uVar = A1().f110223i;
        uVar.f110206h.setTranslationY(Xo.e.a(150));
        uVar.f110200b.setTranslationY(Xo.e.a(150));
        uVar.f110209k.setTranslationY(Xo.e.a(150));
        uVar.f110210l.setTranslationY(Xo.e.a(150));
        uVar.f110201c.setTranslationY(Xo.e.a(150));
    }

    static /* synthetic */ void u1(ProductInfoPageFragment productInfoPageFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        productInfoPageFragment.t1(z10);
    }

    private final void u2() {
        A1().f110223i.f110200b.setOnClickListener(new C10711f(this));
    }

    /* access modifiers changed from: private */
    public static final void v2(ProductInfoPageFragment productInfoPageFragment, View view) {
        b.a a10;
        b b10 = productInfoPageFragment.U1().getState().getValue().b();
        if (b10 != null && (a10 = b10.a()) != null && a10.a()) {
            productInfoPageFragment.U1().N0(l.e.f92038a);
        }
    }

    private final void w2() {
        A1().f110223i.f110201c.setOnClickListener(new Ej.j(this));
    }

    /* access modifiers changed from: private */
    public static final void x2(ProductInfoPageFragment productInfoPageFragment, View view) {
        productInfoPageFragment.U1().N0(l.b.f92034a);
    }

    private final void y2() {
        this.f91706K0 = new Lg.d((Lg.a<?>[]) new Lg.a[]{new Lj.s(0, 0, 0, 0, 0, (int) Xo.e.a(12), 31, (DefaultConstructorMarker) null), new C11211p()});
        RecyclerView recyclerView = A1().f110222h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(G1());
        recyclerView.setOnScrollChangeListener(new Ej.h(this));
    }

    /* access modifiers changed from: private */
    public static final void z2(ProductInfoPageFragment productInfoPageFragment, View view, int i10, int i11, int i12, int i13) {
        if (productInfoPageFragment.G1().e().size() > 2) {
            if (i13 > 0) {
                productInfoPageFragment.B1().X0(productInfoPageFragment.f91708M0);
            } else {
                productInfoPageFragment.B1().X0(4);
            }
        }
    }

    public final Eo.a C1() {
        Eo.a aVar = this.f91702G0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public String D1() {
        return this.f91713R;
    }

    public final C11411a E1() {
        C11411a aVar = this.f91720y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final Ar.j F1() {
        Ar.j jVar = this.f91718Y;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C13047m L1() {
        C13047m mVar = this.f91721z0;
        if (mVar != null) {
            return mVar;
        }
        C17542s.z("productDetailsNavigation");
        return null;
    }

    public final Fj.k M1() {
        Fj.k kVar = this.f91700E0;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("productInfoListBuilder");
        return null;
    }

    public final C10796b Q1() {
        C10796b bVar = this.f91698C0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("reviewsNavigation");
        return null;
    }

    public final Sy.a R1() {
        Sy.a aVar = this.f91697B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("scanAndGoAnalytics");
        return null;
    }

    public final Y S1() {
        Y y10 = this.f91719Z;
        if (y10 != null) {
            return y10;
        }
        C17542s.z("scanAndGoNavigation");
        return null;
    }

    public final rj.j T1() {
        rj.j jVar = this.f91699D0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("unavailableChildItemsNavigation");
        return null;
    }

    /* renamed from: n2 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        x c10 = x.c(layoutInflater);
        this.f91703H0 = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        B1().F0(this.f91712Q0);
        requireActivity().setRequestedOrientation(-1);
        this.f91703H0 = null;
        this.f91706K0 = null;
        this.f91707L0 = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().setRequestedOrientation(1);
        b(new C10707b(this));
        O2();
        X2();
        j2();
        c2();
        x1().p(Ae.p.SHOP_AND_GO_ONLINE);
    }

    public final Bx.a v1() {
        Bx.a aVar = this.f91715T;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountApi");
        return null;
    }

    public final C12274b w1() {
        C12274b bVar = this.f91696A0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("addToFavouritesInteractor");
        return null;
    }

    public final Ae.e x1() {
        Ae.e eVar = this.f91717X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final lm.e y1() {
        lm.e eVar = this.f91716U;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("backInStockNavigation");
        return null;
    }

    public final Fj.b z1() {
        Fj.b bVar = this.f91701F0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("backgroundImageUiMapper");
        return null;
    }
}
