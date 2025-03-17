package com.ingka.ikea.scanandgo.cart.impl;

import Ar.j;
import Bx.a;
import By.C;
import By.C12670i;
import By.C12671j;
import By.C12673l;
import By.C12674m;
import By.C12676o;
import By.C12677p;
import By.C12678q;
import By.C12679s;
import By.C12680t;
import By.C12681u;
import By.D;
import By.E;
import By.H;
import By.I;
import By.J;
import By.K;
import By.L;
import By.M;
import By.N;
import By.O;
import By.Q;
import By.v;
import By.w;
import By.x;
import By.z;
import Dy.A;
import Dy.C12811k;
import Dy.C12815o;
import Dy.C12816p;
import Dy.F;
import Dy.G;
import FB.C12860a;
import FC.C12865a;
import FC.C12866b;
import FC.C12867c;
import HJ.C15854t;
import I2.B;
import IC.C13023e;
import Iy.b;
import Iz.C13035a;
import Iz.C13043i;
import Iz.C13049o;
import Iz.Y;
import JC.C13068a;
import Jy.j;
import Jy.n;
import Jy.o;
import My.a;
import My.b;
import My.e;
import My.f;
import Py.a;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.U;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ingka.coworker.discount.CoWorkerDiscountReadMoreDialog;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import com.ingka.ikea.core.android.view.BackButton;
import com.ingka.ikea.scanandgo.cart.impl.CartSortByCartDialogFragment;
import com.ingka.ikea.scanandgo.cart.impl.d;
import com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dl.C11212q;
import dl.r;
import eI.C17187b;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tl.C11923c;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u00178\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J%\u00100\u001a\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0005J\u0017\u00106\u001a\u00020\u00062\u0006\u0010&\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010\u0005J+\u0010E\u001a\u00020D2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bE\u0010FJ!\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020G2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\u0005J\u000f\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bM\u0010\u0005J\u000f\u0010N\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\u0005J\u001f\u0010S\u001a\u00020\u00062\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bX\u0010YR\"\u0010a\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0001\u001a\u00020z8\u0006@\u0006X.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¡\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R*\u0010É\u0001\u001a\u00030Â\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ñ\u0001\u001a\u00030Ê\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R*\u0010Ù\u0001\u001a\u00030Ò\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R*\u0010á\u0001\u001a\u00030Ú\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R*\u0010é\u0001\u001a\u00030â\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R*\u0010ñ\u0001\u001a\u00030ê\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R*\u0010ù\u0001\u001a\u00030ò\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R \u0010ÿ\u0001\u001a\u00030ú\u00018\u0016XD¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R&\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u00030\u00028\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R!\u0010\u0002\u001a\u00030\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010¡\u0002\u001a\u0005\u0018\u00010\u00028BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010 \u0002¨\u0006¢\u0002"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "LI2/B;", "<init>", "()V", "LXH/N;", "R2", "T1", "C2", "b2", "LMy/f;", "navigateTo", "U1", "(LMy/f;)V", "LMy/f$e;", "a2", "(LMy/f$e;)V", "LMy/f$s;", "f2", "(LMy/f$s;)V", "P2", "x2", "com/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$f", "d2", "()Lcom/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$f;", "LDy/F;", "event", "h2", "(LDy/F;)V", "Q2", "O2", "t2", "y2", "n2", "j2", "R1", "LMy/e;", "state", "S1", "(LMy/e;)V", "LMy/f$r;", "T2", "(LMy/f$r;)V", "", "LJy/j$a;", "values", "selected", "i2", "(Ljava/util/List;LJy/j$a;)V", "l2", "v2", "U2", "LMy/d;", "W2", "(LMy/d;)V", "com/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$e", "c2", "()Lcom/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$e;", "p2", "r2", "A2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onDestroyView", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "menuInflater", "o", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "menuItem", "", "k", "(Landroid/view/MenuItem;)Z", "Liq/a;", "R", "Liq/a;", "C1", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "LBx/a;", "S", "LBx/a;", "s1", "()LBx/a;", "setAccountApi", "(LBx/a;)V", "accountApi", "LFB/a;", "T", "LFB/a;", "G1", "()LFB/a;", "setLocalStoreSelectionRepository", "(LFB/a;)V", "localStoreSelectionRepository", "LIy/b;", "U", "LIy/b;", "w1", "()LIy/b;", "setCartDialogInteractor$cart_implementation_release", "(LIy/b;)V", "cartDialogInteractor", "LAr/j;", "X", "LAr/j;", "D1", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LAy/c;", "Y", "LAy/c;", "L1", "()LAy/c;", "setScanAndGoCartNavigation", "(LAy/c;)V", "scanAndGoCartNavigation", "LIz/Y;", "Z", "LIz/Y;", "N1", "()LIz/Y;", "setScanAndGoNavigation", "(LIz/Y;)V", "scanAndGoNavigation", "LRd/a;", "y0", "LRd/a;", "t1", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LJz/a;", "z0", "LJz/a;", "J1", "()LJz/a;", "setRequestUserEmailNavigation", "(LJz/a;)V", "requestUserEmailNavigation", "LMz/a;", "A0", "LMz/a;", "O1", "()LMz/a;", "setTermsAndConditionsNavigation", "(LMz/a;)V", "termsAndConditionsNavigation", "Lcom/ingka/ikea/app/cart/b;", "B0", "Lcom/ingka/ikea/app/cart/b;", "H1", "()Lcom/ingka/ikea/app/cart/b;", "setOnlineCartNavigation", "(Lcom/ingka/ikea/app/cart/b;)V", "onlineCartNavigation", "LQy/a;", "C0", "LQy/a;", "z1", "()LQy/a;", "setCheckoutConfirmationNavigation", "(LQy/a;)V", "checkoutConfirmationNavigation", "LPy/a;", "D0", "LPy/a;", "M1", "()LPy/a;", "setScanAndGoCheckoutNavigation", "(LPy/a;)V", "scanAndGoCheckoutNavigation", "LKy/a;", "E0", "LKy/a;", "y1", "()LKy/a;", "setCartSectionInfoDialogNavigation", "(LKy/a;)V", "cartSectionInfoDialogNavigation", "LIz/a;", "F0", "LIz/a;", "A1", "()LIz/a;", "setCollectProductNavigation", "(LIz/a;)V", "collectProductNavigation", "LFC/c;", "G0", "LFC/c;", "P1", "()LFC/c;", "setTimeslotPickerNavigation", "(LFC/c;)V", "timeslotPickerNavigation", "LIz/o;", "H0", "LIz/o;", "I1", "()LIz/o;", "setProductInfoPageNavigation", "(LIz/o;)V", "productInfoPageNavigation", "LIl/a;", "I0", "LIl/a;", "u1", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LJy/h;", "J0", "LJy/h;", "x1", "()LJy/h;", "setCartListItemUiMapper$cart_implementation_release", "(LJy/h;)V", "cartListItemUiMapper", "LSu/a;", "K0", "LSu/a;", "E1", "()LSu/a;", "setInStorePurchaseNavigation", "(LSu/a;)V", "inStorePurchaseNavigation", "", "L0", "Ljava/lang/String;", "B1", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "M0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "Landroidx/recyclerview/widget/LinearLayoutManager;", "N0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "LLg/d;", "O0", "LLg/d;", "_listAdapter", "LOy/j;", "P0", "LXH/o;", "Q1", "()LOy/j;", "viewModel", "LEy/c;", "Q0", "LEy/c;", "_binding", "F1", "()LLg/d;", "listAdapter", "v1", "()LEy/c;", "binding", "Landroidx/lifecycle/U;", "K1", "()Landroidx/lifecycle/U;", "saveStateHandle", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCartFragment extends a implements B {

    /* renamed from: A0  reason: collision with root package name */
    public Mz.a f119784A0;

    /* renamed from: B0  reason: collision with root package name */
    public com.ingka.ikea.app.cart.b f119785B0;

    /* renamed from: C0  reason: collision with root package name */
    public Qy.a f119786C0;

    /* renamed from: D0  reason: collision with root package name */
    public Py.a f119787D0;

    /* renamed from: E0  reason: collision with root package name */
    public Ky.a f119788E0;

    /* renamed from: F0  reason: collision with root package name */
    public C13035a f119789F0;

    /* renamed from: G0  reason: collision with root package name */
    public C12867c f119790G0;

    /* renamed from: H0  reason: collision with root package name */
    public C13049o f119791H0;

    /* renamed from: I0  reason: collision with root package name */
    public Il.a f119792I0;

    /* renamed from: J0  reason: collision with root package name */
    public Jy.h f119793J0;

    /* renamed from: K0  reason: collision with root package name */
    public Su.a f119794K0;

    /* renamed from: L0  reason: collision with root package name */
    private final String f119795L0 = "cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}";

    /* renamed from: M0  reason: collision with root package name */
    private final C17631a<C16807N> f119796M0 = new z();

    /* renamed from: N0  reason: collision with root package name */
    private LinearLayoutManager f119797N0;

    /* renamed from: O0  reason: collision with root package name */
    private Lg.d f119798O0;

    /* renamed from: P0  reason: collision with root package name */
    private final C16824o f119799P0;

    /* renamed from: Q0  reason: collision with root package name */
    private Ey.c f119800Q0;

    /* renamed from: R  reason: collision with root package name */
    public C11411a f119801R;

    /* renamed from: S  reason: collision with root package name */
    public Bx.a f119802S;

    /* renamed from: T  reason: collision with root package name */
    public C12860a f119803T;

    /* renamed from: U  reason: collision with root package name */
    public Iy.b f119804U;

    /* renamed from: X  reason: collision with root package name */
    public Ar.j f119805X;

    /* renamed from: Y  reason: collision with root package name */
    public Ay.c f119806Y;

    /* renamed from: Z  reason: collision with root package name */
    public Y f119807Z;

    /* renamed from: y0  reason: collision with root package name */
    public Rd.a f119808y0;

    /* renamed from: z0  reason: collision with root package name */
    public Jz.a f119809z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119810a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Jy.n$a[] r0 = Jy.n.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Jy.n$a r1 = Jy.n.a.SIGNUP_LOGIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Jy.n$a r1 = Jy.n.a.UPGRADE_TO_FAMILY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f119810a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119811a;

        public b(ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119811a = scanAndGoCartFragment;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            RecyclerView recyclerView = this.f119811a.v1().f109489d;
            C17542s.g(recyclerView);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), view.getHeight(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ My.e f119812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119813b;

        c(My.e eVar, ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119812a = eVar;
            this.f119813b = scanAndGoCartFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(ScanAndGoCartFragment scanAndGoCartFragment) {
            scanAndGoCartFragment.T1();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1245670079, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.handleInlineMessage.<anonymous>.<anonymous> (ScanAndGoCartFragment.kt:866)");
                }
                My.e eVar = this.f119812a;
                mVar.W(-1861868561);
                boolean F10 = mVar.F(this.f119813b);
                ScanAndGoCartFragment scanAndGoCartFragment = this.f119813b;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new b(scanAndGoCartFragment);
                    mVar.u(D10);
                }
                mVar.P();
                A.e(eVar, (C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment$observeState$$inlined$collectOnStarted$1", f = "ScanAndGoCartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.l implements p<My.j, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119814c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f119815d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119816e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, ScanAndGoCartFragment scanAndGoCartFragment) {
            super(2, eVar);
            this.f119816e = scanAndGoCartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(eVar, this.f119816e);
            dVar.f119815d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(My.j jVar, C17164e<? super C16807N> eVar) {
            return ((d) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f119814c == 0) {
                y.b(obj);
                My.j jVar = (My.j) this.f119815d;
                boolean isEmpty = jVar.a().a().isEmpty();
                SwipeRefreshLayout swipeRefreshLayout = this.f119816e.v1().f109491f;
                swipeRefreshLayout.setEnabled(!isEmpty);
                swipeRefreshLayout.setRefreshing(false);
                if (!isEmpty) {
                    Lg.d.q(this.f119816e.F1(), jVar.a().b(), false, (C17642l) null, 6, (Object) null);
                } else {
                    this.f119816e.R1();
                }
                My.f c10 = jVar.c();
                if (c10 != null) {
                    this.f119816e.U1(c10);
                }
                this.f119816e.W2(jVar.b());
                this.f119816e.S1(jVar.a().c());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$e", "LDy/k;", "LDy/G;", "checkoutButtonUiState", "LXH/N;", "b", "(LDy/G;)V", "a", "()V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C12811k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119817a;

        e(ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119817a = scanAndGoCartFragment;
        }

        public void a() {
            this.f119817a.Q1().h0(a.c.k.f112090a);
        }

        public void b(G g10) {
            C17542s.j(g10, "checkoutButtonUiState");
            this.f119817a.Q1().h0(new a.c.g(b.C2756b.f112098a));
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"com/ingka/ikea/scanandgo/cart/impl/ScanAndGoCartFragment$f", "LDy/p;", "LXH/N;", "b", "()V", "LDy/F;", "event", "a", "(LDy/F;)V", "c", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C12816p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119818a;

        f(ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119818a = scanAndGoCartFragment;
        }

        public void a(F f10) {
            C17542s.j(f10, "event");
            this.f119818a.h2(f10);
        }

        public void b() {
            Ky.a y12 = this.f119818a.y1();
            Context requireContext = this.f119818a.requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            FragmentManager parentFragmentManager = this.f119818a.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            y12.a(requireContext, parentFragmentManager, androidx.navigation.fragment.a.a(this.f119818a), f.x.b.f112155e);
        }

        public void c() {
            this.f119818a.Q1().h0(new a.c.g(b.a.f112097a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements p<List<? extends j.a>, j.a, C16807N> {
        g(Object obj) {
            super(2, obj, ScanAndGoCartFragment.class, "onSortByCartClicked", "onSortByCartClicked(Ljava/util/List;Lcom/ingka/ikea/scanandgo/cart/impl/model/CartSortByModel$SortByEnum;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((List) obj, (j.a) obj2);
            return C16807N.f139792a;
        }

        public final void t(List<? extends j.a> list, j.a aVar) {
            C17542s.j(list, "p0");
            C17542s.j(aVar, "p1");
            ((ScanAndGoCartFragment) this.receiver).i2(list, aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119819a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f119820a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    tl.c[] r0 = tl.C11923c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tl.c r1 = tl.C11923c.ONLINE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tl.c r1 = tl.C11923c.STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f119820a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.h.a.<clinit>():void");
            }
        }

        h(ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119819a = scanAndGoCartFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(ScanAndGoCartFragment scanAndGoCartFragment, C11923c cVar) {
            C17542s.j(cVar, "it");
            Oy.j i12 = scanAndGoCartFragment.Q1();
            int i10 = a.f119820a[cVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new t();
            }
            i12.h0(new a.c.n(i11));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r10, int r11) {
            /*
                r9 = this;
                r0 = r11 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r10.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r10.L()
                goto L_0x005b
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.setupSegmentedController.<anonymous>.<anonymous> (ScanAndGoCartFragment.kt:707)"
                r2 = 1169103345(0x45af19f1, float:5603.2427)
                U0.C4895p.S(r2, r11, r0, r1)
            L_0x001f:
                tl.c r3 = tl.C11923c.STORE
                r11 = -359215376(0xffffffffea96cef0, float:-9.115805E25)
                r10.W(r11)
                com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment r11 = r9.f119819a
                boolean r11 = r10.F(r11)
                com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment r0 = r9.f119819a
                java.lang.Object r1 = r10.D()
                if (r11 != 0) goto L_0x003d
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r1 != r11) goto L_0x0045
            L_0x003d:
                com.ingka.ikea.scanandgo.cart.impl.c r1 = new com.ingka.ikea.scanandgo.cart.impl.c
                r1.<init>(r0)
                r10.u(r1)
            L_0x0045:
                r4 = r1
                nI.l r4 = (nI.C17642l) r4
                r10.P()
                r7 = 6
                r8 = 4
                r5 = 0
                r6 = r10
                tl.C11922b.b(r3, r4, r5, r6, r7, r8)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x005b
                U0.C4895p.R()
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.h.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119821c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar) {
            super(0);
            this.f119821c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119821c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119822c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17631a aVar) {
            super(0);
            this.f119822c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119822c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119823c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C16824o oVar) {
            super(0);
            this.f119823c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119823c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119824c = aVar;
            this.f119825d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119824c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119825d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119826c = oVar;
            this.f119827d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119827d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119826c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ My.d f119828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCartFragment f119829b;

        n(My.d dVar, ScanAndGoCartFragment scanAndGoCartFragment) {
            this.f119828a = dVar;
            this.f119829b = scanAndGoCartFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-603521123, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment.updateCartFooterButton.<anonymous>.<anonymous> (ScanAndGoCartFragment.kt:953)");
                }
                C12815o.d(this.f119828a, this.f119829b.c2(), mVar, C13023e.f110931a);
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

    public ScanAndGoCartFragment() {
        C16824o a10 = C16825p.a(s.NONE, new j(new i(this)));
        this.f119799P0 = W.b(this, P.b(Oy.j.class), new k(a10), new l((C17631a) null, a10), new m(this, a10));
    }

    private final void A2() {
        U K12 = K1();
        if (K12 != null) {
            P1().b(K12, this, new C12681u(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B2(ScanAndGoCartFragment scanAndGoCartFragment, C12866b bVar) {
        C17542s.j(bVar, "result");
        scanAndGoCartFragment.Q1().h0(new a.C2748a.j(bVar.a(), bVar instanceof C12866b.C2622b));
        return C16807N.f139792a;
    }

    private final void C2() {
        Fy.i iVar = new Fy.i(u1().s(), new w(this), new By.y(this));
        Fy.g gVar = new Fy.g();
        Fy.c cVar = new Fy.c(u1().s(), d2(), x1(), new By.A(this));
        Fy.g gVar2 = new Fy.g();
        Ly.b bVar = new Ly.b(new By.B(this));
        Fy.e eVar = new Fy.e(new g(this));
        Fy.b bVar2 = new Fy.b(new C(this), x1());
        Md.a aVar = new Md.a(new D(this), new E(this), new By.F(this));
        this.f119798O0 = new Lg.d((Lg.a<?>[]) new Lg.a[]{iVar, gVar, cVar, gVar2, bVar, eVar, bVar2, aVar, new Fy.h(G1().c() != null), new C11212q(), new Fy.a(new By.G(this)), new Fy.l(u1()), new Fy.f(new H(this)), new vl.m(), new Fy.k(), new Fy.j(new x(this))});
    }

    /* access modifiers changed from: private */
    public static final C16807N D2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.b.d.f112076a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E2(ScanAndGoCartFragment scanAndGoCartFragment, o.b.a aVar) {
        C17542s.j(aVar, "it");
        scanAndGoCartFragment.Q1().h0(new a.c.j(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Lg.d F1() {
        Lg.d dVar = this.f119798O0;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N F2(ScanAndGoCartFragment scanAndGoCartFragment, F f10) {
        C17542s.j(f10, "it");
        scanAndGoCartFragment.h2(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.c.C2753c.C2755c.f112081a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H2(ScanAndGoCartFragment scanAndGoCartFragment, boolean z10) {
        scanAndGoCartFragment.Q1().h0(new a.c.C2753c.C2754a(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I2(ScanAndGoCartFragment scanAndGoCartFragment, boolean z10) {
        scanAndGoCartFragment.Q1().h0(new a.c.C2753c.b(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.c.C2752a.f112077a);
        return C16807N.f139792a;
    }

    private final U K1() {
        C8948l H10 = androidx.navigation.fragment.a.a(this).H();
        if (H10 != null) {
            return H10.h();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N K2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.c.e.f112083a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L2(ScanAndGoCartFragment scanAndGoCartFragment, String str) {
        C17542s.j(str, "salesOrderId");
        scanAndGoCartFragment.Q1().h0(new a.c.i(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M2(ScanAndGoCartFragment scanAndGoCartFragment, n.a aVar) {
        C17542s.j(aVar, "it");
        int i10 = a.f119810a[aVar.ordinal()];
        if (i10 == 1) {
            scanAndGoCartFragment.Q1().h0(new a.b.C2751b(Interaction$Component.SIGN_UP_BUTTON));
            Rd.a t12 = scanAndGoCartFragment.t1();
            C5191t requireActivity = scanAndGoCartFragment.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            t12.d(requireActivity);
        } else if (i10 == 2) {
            scanAndGoCartFragment.Q1().h0(new a.b.C2751b(Interaction$Component.UPGRADE_FAMILY));
            C8951o f10 = rw.f.f(scanAndGoCartFragment, scanAndGoCartFragment.B1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                scanAndGoCartFragment.t1().f(f10);
            }
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.b.c.f112075a);
        return C16807N.f139792a;
    }

    private final void O2() {
        if (Q1().b0()) {
            C5191t requireActivity = requireActivity();
            C17542s.h(requireActivity, "null cannot be cast to non-null type androidx.core.view.MenuHost");
            requireActivity.addMenuProvider(this, getViewLifecycleOwner(), r.b.CREATED);
        }
    }

    private final void P2() {
        ComposeView composeView = v1().f109490e;
        C17542s.g(composeView);
        composeView.setVisibility(Q1().b0() ? 0 : 8);
        if (Q1().b0()) {
            Group group = v1().f109492g;
            C17542s.i(group, "toolbarSegmentedControllerGroup");
            group.setVisibility(0);
            ComposeView composeView2 = v1().f109490e;
            composeView2.setViewCompositionStrategy(s1.d.f19581b);
            C17542s.g(composeView2);
            TC.e.l(composeView2, false, c1.c.c(1169103345, true, new h(this)), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Oy.j Q1() {
        return (Oy.j) this.f119799P0.getValue();
    }

    private final void Q2() {
        if (Q1().b0()) {
            View findViewById = v1().getRoot().findViewById(Uo.a.f88327h);
            C17542s.i(findViewById, "findViewById(...)");
            BaseFragment.C0(this, (Toolbar) findViewById, getString(C12674m.f108248H), (BackButton) null, BaseFragment.a.REGULAR, (View.OnClickListener) null, (View.OnClickListener) null, 52, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void R1() {
        List t10 = C16877v.t(new Jy.m());
        String f10 = Q1().getState().getValue().d().f();
        if (!(G1().c() == null || f10 == null)) {
            t10.add(0, new r.d(f10, (String) null, (Integer) null, (Integer) null, r.c.H2, 0, 28, (Integer) null, 28, 0, (Integer) null, 1198, (DefaultConstructorMarker) null));
        }
        Lg.d.q(F1(), t10, false, (C17642l) null, 6, (Object) null);
    }

    private final void R2() {
        C2();
        Ey.c v12 = v1();
        v12.f109491f.setOnRefreshListener(new C12678q(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        this.f119797N0 = linearLayoutManager;
        RecyclerView recyclerView = v12.f109489d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(F1());
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        gVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(gVar);
    }

    /* access modifiers changed from: private */
    public final void S1(My.e eVar) {
        ComposeView composeView = v1().f109488c;
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        C17542s.g(composeView);
        int i10 = 0;
        TC.e.l(composeView, false, c1.c.c(-1245670079, true, new c(eVar, this)), 1, (Object) null);
        if (eVar instanceof e.b) {
            i10 = 8;
        }
        composeView.setVisibility(i10);
        C17542s.i(composeView, "apply(...)");
        if (!composeView.isLaidOut() || composeView.isLayoutRequested()) {
            composeView.addOnLayoutChangeListener(new b(this));
            return;
        }
        RecyclerView recyclerView = v1().f109489d;
        C17542s.g(recyclerView);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), composeView.getHeight(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    public static final void S2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(new a.c.p(true));
    }

    /* access modifiers changed from: private */
    public final void T1() {
        LinearLayoutManager linearLayoutManager;
        int i10 = 0;
        for (Object next : F1().e()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            if (next instanceof o.a) {
                o.a aVar = (o.a) next;
                if (aVar.j() && !aVar.g().b() && !aVar.g().j()) {
                    LinearLayoutManager linearLayoutManager2 = this.f119797N0;
                    if (linearLayoutManager2 == null) {
                        C17542s.z("linearLayoutManager");
                        linearLayoutManager = null;
                    } else {
                        linearLayoutManager = linearLayoutManager2;
                    }
                    Context requireContext = requireContext();
                    C17542s.i(requireContext, "requireContext(...)");
                    d.b(linearLayoutManager, requireContext, Math.max(i10 - 1, 0), 0.0f, 4, (Object) null);
                    return;
                }
            }
            i10 = i11;
        }
        FullscreenDialogFragment.a aVar2 = FullscreenDialogFragment.f94870N;
        String string = getString(C12674m.f108250J);
        String string2 = getString(C12674m.f108249I);
        C17542s.i(string2, "getString(...)");
        FullscreenDialogFragment.a.b(aVar2, (String) null, string, string2, C12674m.f108290l0, new FullscreenDialogFragment.b(C12670i.f108225b, FullscreenDialogFragment.b.C2117b.CENTER), 1, (Object) null).show(getParentFragmentManager(), (String) null);
    }

    private final void T2(f.r rVar) {
        w1().b(rVar.c(), this, rVar.b(), rVar.a());
    }

    /* access modifiers changed from: private */
    public final void U1(My.f fVar) {
        My.f fVar2 = fVar;
        Q1().h0(a.c.b.f112078a);
        if (fVar2 instanceof f.o) {
            s1().a(((f.o) fVar2).a()).show(getParentFragmentManager(), "login_signup_promotion_bottom_sheet");
        } else if (fVar2 instanceof f.r) {
            T2((f.r) fVar2);
        } else if (fVar2 instanceof f.h) {
            Iy.b w12 = w1();
            C13023e a10 = ((f.h) fVar2).a();
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            b.a.a(w12, this, (String) null, a10.b(requireContext), 2, (Object) null);
        } else if (C17542s.e(fVar2, f.i.f112129a)) {
            Ar.j D12 = D1();
            View findViewById = requireActivity().findViewById(16908290);
            C17542s.i(findViewById, "findViewById(...)");
            String string = getString(Oo.b.f84590b1);
            C17542s.i(string, "getString(...)");
            j.a.s(D12, findViewById, string, getString(Oo.b.f84616d5), -1, (View) null, (C17631a) null, (C17642l) null, 112, (Object) null);
        } else if (C17542s.e(fVar2, f.j.f112130a)) {
            C8951o f10 = rw.f.f(this, B1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                N1().g(f10);
            }
        } else if (C17542s.e(fVar2, f.k.f112131a)) {
            DeleteCouponBottomSheet.Companion companion = DeleteCouponBottomSheet.f119861T;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            companion.d(parentFragmentManager);
        } else if (fVar2 instanceof f.A) {
            Y N12 = N1();
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
            N12.i(parentFragmentManager2);
        } else if (fVar2 instanceof f.B) {
            Y N13 = N1();
            FragmentManager parentFragmentManager3 = getParentFragmentManager();
            C17542s.i(parentFragmentManager3, "getParentFragmentManager(...)");
            N13.c(parentFragmentManager3);
        } else if (C17542s.e(fVar2, f.z.f112159a)) {
            U2();
        } else if (C17542s.e(fVar2, f.v.f112148a)) {
            j.a.r(D1(), getView(), C12674m.f108268a0, Oo.b.f84750p7, 0, v1().getRoot(), new K(this), 8, (Object) null);
        } else if (C17542s.e(fVar2, f.C13216b.f112117a)) {
            Qy.a z12 = z1();
            FragmentManager parentFragmentManager4 = getParentFragmentManager();
            C17542s.i(parentFragmentManager4, "getParentFragmentManager(...)");
            z12.b(parentFragmentManager4);
        } else if (fVar2 instanceof f.c) {
            f.c cVar = (f.c) fVar2;
            if (cVar.a()) {
                Jz.a J12 = J1();
                FragmentManager parentFragmentManager5 = getParentFragmentManager();
                C17542s.i(parentFragmentManager5, "getParentFragmentManager(...)");
                J12.b(parentFragmentManager5, cVar.b());
                Jz.a J13 = J1();
                FragmentManager parentFragmentManager6 = getParentFragmentManager();
                C17542s.i(parentFragmentManager6, "getParentFragmentManager(...)");
                J13.a(parentFragmentManager6, this, new L(this));
            } else if (cVar.b()) {
                Mz.a O12 = O1();
                FragmentManager parentFragmentManager7 = getParentFragmentManager();
                C17542s.i(parentFragmentManager7, "getParentFragmentManager(...)");
                O12.b(parentFragmentManager7);
                Mz.a O13 = O1();
                FragmentManager parentFragmentManager8 = getParentFragmentManager();
                C17542s.i(parentFragmentManager8, "getParentFragmentManager(...)");
                O13.a(parentFragmentManager8, this, new M(this));
            }
        } else if (C17542s.e(fVar2, f.w.f112149a)) {
            if (Q1().b0()) {
                N1().h(androidx.navigation.fragment.a.a(this), Ae.l.CART);
            } else {
                androidx.navigation.fragment.a.a(this).k0();
            }
        } else if (C17542s.e(fVar2, f.g.f112126a)) {
            C8951o f11 = rw.f.f(this, B1(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                L1().a(f11);
            }
        } else if (fVar2 instanceof f.q) {
            C.a l10 = C.a.l(new C.a(), "cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}", true, false, 4, (Object) null);
            f.q qVar = (f.q) fVar2;
            if (qVar.a() != null) {
                l10.d(qVar.a().booleanValue());
            }
            rw.f.d(this, B1(), new N(this, l10.a()));
        } else if (fVar2 instanceof f.u) {
            rw.f.d(this, B1(), new O(this, fVar2));
        } else if (C17542s.e(fVar2, f.n.f112136a)) {
            C8951o f12 = rw.f.f(this, B1(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                C13043i.a(f12);
            }
        } else if (fVar2 instanceof f.m) {
            Ar.j D13 = D1();
            View findViewById2 = requireActivity().findViewById(16908290);
            C17542s.i(findViewById2, "findViewById(...)");
            f.m mVar = (f.m) fVar2;
            C13023e b10 = mVar.b();
            Context requireContext2 = requireContext();
            C17542s.i(requireContext2, "requireContext(...)");
            String b11 = b10.b(requireContext2);
            C13023e a11 = mVar.a();
            Context requireContext3 = requireContext();
            C17542s.i(requireContext3, "requireContext(...)");
            j.a.s(D13, findViewById2, b11, a11.b(requireContext3), -2, (View) null, (C17631a) null, (C17642l) null, 112, (Object) null);
        } else if (C17542s.e(fVar2, f.y.f112158a)) {
            Iy.b w13 = w1();
            String string2 = getString(C12674m.f108245E);
            String string3 = getString(C12674m.f108244D);
            C17542s.i(string3, "getString(...)");
            w13.a(this, string2, string3);
        } else if (C17542s.e(fVar2, f.C13215a.f112116a)) {
            C8951o f13 = rw.f.f(this, B1(), (C17642l) null, 2, (Object) null);
            if (f13 != null) {
                a.b.a(M1(), f13, (String) null, (Boolean) null, 6, (Object) null);
            }
        } else if (fVar2 instanceof f.C2758f) {
            C8951o f14 = rw.f.f(this, B1(), (C17642l) null, 2, (Object) null);
            if (f14 != null) {
                N1().d(f14, ((f.C2758f) fVar2).a());
            }
        } else if (fVar2 instanceof f.e) {
            a2((f.e) fVar2);
        } else if (fVar2 instanceof f.l) {
            C11411a.C2225a.a(C1(), androidx.navigation.fragment.a.a(this), ((f.l) fVar2).a(), (C11412b) null, 4, (Object) null);
        } else if (fVar2 instanceof f.x) {
            Ky.a y12 = y1();
            Context requireContext4 = requireContext();
            C17542s.i(requireContext4, "requireContext(...)");
            FragmentManager parentFragmentManager9 = getParentFragmentManager();
            C17542s.i(parentFragmentManager9, "getParentFragmentManager(...)");
            y12.a(requireContext4, parentFragmentManager9, androidx.navigation.fragment.a.a(this), (f.x) fVar2);
        } else if (fVar2 instanceof f.d) {
            f.d dVar = (f.d) fVar2;
            M1().a(androidx.navigation.fragment.a.a(this), dVar.a(), Boolean.valueOf(dVar.b()));
        } else if (C17542s.e(fVar2, My.g.f112160a)) {
            P1().a(androidx.navigation.fragment.a.a(this), C12865a.FULL_CART);
        } else if (C17542s.e(fVar2, My.h.f112161a)) {
            P1().a(androidx.navigation.fragment.a.a(this), C12865a.PAY_AHEAD);
        } else if (fVar2 instanceof f.t) {
            I1().b(androidx.navigation.fragment.a.a(this), ((f.t) fVar2).a());
        } else if (fVar2 instanceof f.p) {
            E1().a(androidx.navigation.fragment.a.a(this), ((f.p) fVar2).a());
        } else if (fVar2 instanceof f.s) {
            f2((f.s) fVar2);
        } else {
            throw new t();
        }
    }

    private final void U2() {
        Ar.j D12 = D1();
        Context requireContext = requireContext();
        String string = getString(C12674m.f108293n);
        C17542s.i(string, "getString(...)");
        j.a.k(D12, requireContext, string, getString(C12674m.f108291m), false, 0, new I(this), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N V1(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.c.k.f112090a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V2(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(new a.C2748a.i(scanAndGoCartFragment.Q1().b0()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.C2748a.d.f112065a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void W2(My.d dVar) {
        ComposeView composeView = v1().f109487b;
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        C17542s.g(composeView);
        TC.e.l(composeView, false, c1.c.c(-603521123, true, new n(dVar, this)), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N X1(ScanAndGoCartFragment scanAndGoCartFragment) {
        scanAndGoCartFragment.Q1().h0(a.C2748a.d.f112065a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y1(ScanAndGoCartFragment scanAndGoCartFragment, x4.C c10, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        scanAndGoCartFragment.H1().h(oVar, false, c10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z1(ScanAndGoCartFragment scanAndGoCartFragment, My.f fVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        scanAndGoCartFragment.L1().b(oVar, C.a.l(new C.a(), "cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}", true, false, 4, (Object) null).a(), ((f.u) fVar).a());
        return C16807N.f139792a;
    }

    private final void a2(f.e eVar) {
        if (C17542s.e(eVar, f.e.a.f112122a)) {
            Ar.j D12 = D1();
            View findViewById = requireActivity().findViewById(16908290);
            C17542s.i(findViewById, "findViewById(...)");
            String string = getString(C13068a.f111204a);
            C17542s.i(string, "getString(...)");
            j.a.s(D12, findViewById, string, getString(Oo.b.f84734o2), 0, (View) null, (C17631a) null, (C17642l) null, 120, (Object) null);
        } else if (C17542s.e(eVar, f.e.c.f112124a)) {
            Ar.j D13 = D1();
            View findViewById2 = requireActivity().findViewById(16908290);
            C17542s.i(findViewById2, "findViewById(...)");
            String string2 = getString(C13068a.f111206c);
            C17542s.i(string2, "getString(...)");
            j.a.s(D13, findViewById2, string2, getString(Oo.b.f84734o2), 0, (View) null, (C17631a) null, (C17642l) null, 120, (Object) null);
        } else if (C17542s.e(eVar, f.e.b.f112123a)) {
            Y N12 = N1();
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            String string3 = getString(C13068a.f111213j);
            C17542s.i(string3, "getString(...)");
            String string4 = getString(C13068a.f111207d);
            C17542s.i(string4, "getString(...)");
            String string5 = getString(C13068a.f111212i);
            C17542s.i(string5, "getString(...)");
            String string6 = getString(Oo.b.f84788t1);
            C17542s.i(string6, "getString(...)");
            String string7 = getString(C13068a.f111210g);
            C17542s.i(string7, "getString(...)");
            N12.b(a10, string3, string5, string4, string6, string7, (String) null);
            C16807N n10 = C16807N.f139792a;
        } else {
            throw new t();
        }
    }

    private final void b2() {
        C16532g R10 = C16534i.R(C5208k.b(Q1().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new d((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public final e c2() {
        return new e(this);
    }

    private final f d2() {
        return new f(this);
    }

    private final void f2(f.s sVar) {
        A1().a(androidx.navigation.fragment.a.a(this), sVar.b(), sVar.a());
        A1().b(this, B1(), new v(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N g2(ScanAndGoCartFragment scanAndGoCartFragment) {
        C8951o f10 = rw.f.f(scanAndGoCartFragment, scanAndGoCartFragment.B1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void h2(F f10) {
        Q1().h0(new a.c.f(f10));
    }

    /* access modifiers changed from: private */
    public final void i2(List<? extends j.a> list, j.a aVar) {
        CartSortByCartDialogFragment.f119778F.a(list, aVar).show(getParentFragmentManager(), "CartSortByCartDialogFragment");
    }

    private final void j2() {
        getParentFragmentManager().R1("CartOverflowMenuBottomSheetRequestKey", this, new C12676o(this));
    }

    /* access modifiers changed from: private */
    public static final void k2(ScanAndGoCartFragment scanAndGoCartFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        scanAndGoCartFragment.Q1().h0(new a.C2748a.C2749a((com.ingka.ikea.scanandgo.cart.impl.dialog.a) bundle.getParcelable("CartOverflowMenuBottomSheetBundleKey")));
    }

    private final void l2() {
        getParentFragmentManager().R1("CartSortByCartDialogFragment.ResultKeyItemSelected", this, new J(this));
    }

    /* access modifiers changed from: private */
    public static final void m2(ScanAndGoCartFragment scanAndGoCartFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        CartSortByCartDialogFragment.b bVar = (CartSortByCartDialogFragment.b) bundle.getParcelable("CartSortByCartDialogFragment.ResultValueItemSelected");
        if (bVar instanceof CartSortByCartDialogFragment.b.a) {
            scanAndGoCartFragment.Q1().h0(new a.c.o(((CartSortByCartDialogFragment.b.a) bVar).a()));
        } else if (bVar != null) {
            throw new t();
        }
    }

    private final void n2() {
        Qy.a z12 = z1();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        z12.a(parentFragmentManager, this, new By.P(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(ScanAndGoCartFragment scanAndGoCartFragment, boolean z10) {
        scanAndGoCartFragment.Q1().h0(new a.C2748a.c(z10));
        return C16807N.f139792a;
    }

    private final void p2() {
        U K12 = K1();
        if (K12 != null) {
            M1().b(K12, this, new Q(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(ScanAndGoCartFragment scanAndGoCartFragment, a.C2810a aVar) {
        C17542s.j(aVar, "checkoutResult");
        scanAndGoCartFragment.Q1().h0(new a.C2748a.b(aVar, scanAndGoCartFragment.Q1().b0()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r1() {
        return C16807N.f139792a;
    }

    private final void r2() {
        androidx.lifecycle.K g10;
        U K12 = K1();
        if (K12 != null && (g10 = K12.g("CoWorkerDiscountReadMoreDialog.Request.Key")) != null) {
            g10.observe(getViewLifecycleOwner(), new d.a(new C12679s(this)));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s2(ScanAndGoCartFragment scanAndGoCartFragment, CoWorkerDiscountReadMoreDialog.c cVar) {
        U K12 = scanAndGoCartFragment.K1();
        if (K12 != null) {
            CoWorkerDiscountReadMoreDialog.c cVar2 = (CoWorkerDiscountReadMoreDialog.c) K12.j("CoWorkerDiscountReadMoreDialog.Request.Key");
        }
        Oy.j Q12 = scanAndGoCartFragment.Q1();
        C17542s.g(cVar);
        Q12.h0(new a.C2748a.e(cVar));
        return C16807N.f139792a;
    }

    private final void t2() {
        androidx.lifecycle.K g10;
        U K12 = K1();
        if (K12 != null && (g10 = K12.g("ScanAndGoScannerCouponNavigation.RequestKey")) != null) {
            g10.observe(getViewLifecycleOwner(), new d.a(new C12680t(this)));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u2(ScanAndGoCartFragment scanAndGoCartFragment, Y.a aVar) {
        U K12 = scanAndGoCartFragment.K1();
        if (K12 != null) {
            Y.a aVar2 = (Y.a) K12.j("ScanAndGoScannerCouponNavigation.RequestKey");
        }
        Oy.j Q12 = scanAndGoCartFragment.Q1();
        C17542s.g(aVar);
        Q12.h0(new a.C2748a.f(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Ey.c v1() {
        Ey.c cVar = this.f119800Q0;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void v2() {
        DeleteCouponBottomSheet.Companion companion = DeleteCouponBottomSheet.f119861T;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        companion.b(parentFragmentManager, this, new C12677p(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N w2(ScanAndGoCartFragment scanAndGoCartFragment, DeleteCouponBottomSheet.Companion.FragmentResult fragmentResult) {
        C17542s.j(fragmentResult, "result");
        scanAndGoCartFragment.Q1().h0(new a.C2748a.g(fragmentResult));
        return C16807N.f139792a;
    }

    private final void x2() {
        t2();
        y2();
        n2();
        j2();
        l2();
        p2();
        r2();
        A2();
    }

    private final void y2() {
        getParentFragmentManager().R1("login_signup_promotion_signup", this, new By.r(this));
    }

    /* access modifiers changed from: private */
    public static final void z2(ScanAndGoCartFragment scanAndGoCartFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        a.b bVar = (a.b) D2.c.a(bundle, "selectedPromotion", a.b.class);
        if (bVar != null) {
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
                    String a10 = C11818a.a("Login/Signup result callback: " + bVar, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = scanAndGoCartFragment.getClass().getName();
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
            scanAndGoCartFragment.Q1().h0(new a.C2748a.h(bVar));
        }
    }

    public final C13035a A1() {
        C13035a aVar = this.f119789F0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("collectProductNavigation");
        return null;
    }

    public String B1() {
        return this.f119795L0;
    }

    public final C11411a C1() {
        C11411a aVar = this.f119801R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final Ar.j D1() {
        Ar.j jVar = this.f119805X;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Su.a E1() {
        Su.a aVar = this.f119794K0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inStorePurchaseNavigation");
        return null;
    }

    public final C12860a G1() {
        C12860a aVar = this.f119803T;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("localStoreSelectionRepository");
        return null;
    }

    public final com.ingka.ikea.app.cart.b H1() {
        com.ingka.ikea.app.cart.b bVar = this.f119785B0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("onlineCartNavigation");
        return null;
    }

    public final C13049o I1() {
        C13049o oVar = this.f119791H0;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("productInfoPageNavigation");
        return null;
    }

    public final Jz.a J1() {
        Jz.a aVar = this.f119809z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("requestUserEmailNavigation");
        return null;
    }

    public final Ay.c L1() {
        Ay.c cVar = this.f119806Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("scanAndGoCartNavigation");
        return null;
    }

    public final Py.a M1() {
        Py.a aVar = this.f119787D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("scanAndGoCheckoutNavigation");
        return null;
    }

    public final Y N1() {
        Y y10 = this.f119807Z;
        if (y10 != null) {
            return y10;
        }
        C17542s.z("scanAndGoNavigation");
        return null;
    }

    public final Mz.a O1() {
        Mz.a aVar = this.f119784A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("termsAndConditionsNavigation");
        return null;
    }

    public final C12867c P1() {
        C12867c cVar = this.f119790G0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("timeslotPickerNavigation");
        return null;
    }

    /* renamed from: e2 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Ey.c c10 = Ey.c.c(layoutInflater);
        this.f119800Q0 = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public boolean k(MenuItem menuItem) {
        C17542s.j(menuItem, "menuItem");
        if (menuItem.getItemId() != C12671j.f108230d) {
            return false;
        }
        Q1().h0(a.c.d.f112082a);
        return true;
    }

    public void o(Menu menu, MenuInflater menuInflater) {
        C17542s.j(menu, "menu");
        C17542s.j(menuInflater, "menuInflater");
        menuInflater.inflate(C12673l.f108240a, menu);
    }

    public void onDestroyView() {
        this.f119800Q0 = null;
        requireActivity().setRequestedOrientation(-1);
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        Q1().h0(a.c.l.f112091a);
    }

    public void onResume() {
        super.onResume();
        Q1().h0(new a.c.p(true));
    }

    public void onStart() {
        super.onStart();
        Q1().h0(a.b.C2750a.f112073a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        R2();
        b2();
        P2();
        x2();
        Q2();
        O2();
        v2();
        requireActivity().setRequestedOrientation(1);
    }

    public final Bx.a s1() {
        Bx.a aVar = this.f119802S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountApi");
        return null;
    }

    public final Rd.a t1() {
        Rd.a aVar = this.f119808y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final Il.a u1() {
        Il.a aVar = this.f119792I0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final Iy.b w1() {
        Iy.b bVar = this.f119804U;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartDialogInteractor");
        return null;
    }

    public final Jy.h x1() {
        Jy.h hVar = this.f119793J0;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("cartListItemUiMapper");
        return null;
    }

    public final Ky.a y1() {
        Ky.a aVar = this.f119788E0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("cartSectionInfoDialogNavigation");
        return null;
    }

    public final Qy.a z1() {
        Qy.a aVar = this.f119786C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("checkoutConfirmationNavigation");
        return null;
    }
}
