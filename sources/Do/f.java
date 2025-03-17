package Do;

import Do.a;
import Do.b;
import Do.g;
import Do.l;
import Do.m;
import HJ.C15854t;
import IC.C13026h;
import Mn.c;
import Nn.C10800c;
import Nn.C10802e;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10806i;
import Nn.C10807j;
import Nn.C10808k;
import Nn.C10811n;
import Nn.C10812o;
import Nn.C10813p;
import Nn.G;
import Nn.K;
import Nn.x;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import RC.n;
import Rg.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Un.a;
import Ur.a;
import Vn.b;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import Yn.P;
import Yn.b0;
import Yn.o0;
import aA.C13909a;
import android.os.Bundle;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ho.b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.C11435a;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14762d;
import lo.j;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qx.C14957b;
import rv.C11849b;
import sv.C11892a;
import tf.C10253a;
import wo.C12290a;
import wo.C12292c;
import wo.C12294e;

@Metadata(d1 = {"\u0000â\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002ã\u0002By\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H@¢\u0006\u0004\b'\u0010(J*\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\"2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H@¢\u0006\u0004\b/\u00100J0\u00105\u001a\u00020.2\u0006\u0010)\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00104\u001a\u000203H@¢\u0006\u0004\b5\u00106J\u001c\u00108\u001a\u0004\u0018\u00010\"2\b\u00107\u001a\u0004\u0018\u00010\"H@¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020.2\u0006\u0010>\u001a\u00020:H\u0002¢\u0006\u0004\b?\u0010=J\u001d\u0010C\u001a\u00020.2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002¢\u0006\u0004\bC\u0010DJ \u0010G\u001a\u00020.2\u0006\u0010)\u001a\u00020\"2\u0006\u0010F\u001a\u00020EH@¢\u0006\u0004\bG\u0010HJ4\u0010M\u001a\u00020.2\u0006\u0010)\u001a\u00020\"2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0@2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0@H@¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ+\u0010R\u001a\u00020.2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0@2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0@H\u0002¢\u0006\u0004\bR\u0010SJ9\u0010U\u001a\u0004\u0018\u00010T2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0@2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0@2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\bU\u0010VJ\u0011\u0010W\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bW\u0010QJ\u001b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\bY\u0010ZJ!\u0010^\u001a\b\u0012\u0004\u0012\u00020]0@*\u00020[2\u0006\u0010\\\u001a\u00020 H\u0002¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u0004\u0018\u00010a*\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020.2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ/\u0010h\u001a\u00020.2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\u00020.2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020.2\b\u0010n\u001a\u0004\u0018\u00010&¢\u0006\u0004\bo\u0010pJ\u0015\u0010q\u001a\u00020.2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\bq\u0010rJ/\u0010w\u001a\u00020.2\u0006\u0010s\u001a\u00020 2\u0006\u0010t\u001a\u00020 2\u0006\u0010u\u001a\u00020 2\b\u0010v\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bw\u0010xJ\u001d\u0010|\u001a\u00020{2\u0006\u0010y\u001a\u00020j2\u0006\u0010z\u001a\u00020O¢\u0006\u0004\b|\u0010}J\u0018\u0010\u001a\u0004\u0018\u00010~2\u0006\u0010z\u001a\u00020O¢\u0006\u0005\b\u0010\u0001J\u0011\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010~¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020 ¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\"¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020 ¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020 ¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0001\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J9\u0010\u0001\u001a\u00020.2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0@2\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010@2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u0004\u0018\u00010\"2\u0006\u00101\u001a\u00020\"2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010 \u0001J\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00012\u0006\u00101\u001a\u00020\"¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0013\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0019\u0010¨\u0001\u001a\u00020.2\u0007\u0010§\u0001\u001a\u00020O¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0010\u0010ª\u0001\u001a\u00020.¢\u0006\u0006\bª\u0001\u0010\u0001J1\u0010®\u0001\u001a\u00020.2\u0006\u00102\u001a\u00020\"2\u0007\u0010«\u0001\u001a\u00020\"2\u000e\u0010­\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010@¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001a\u0010²\u0001\u001a\u00020.2\b\u0010±\u0001\u001a\u00030°\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010µ\u0001\u001a\u00020.2\b\u0010´\u0001\u001a\u00030°\u0001¢\u0006\u0006\bµ\u0001\u0010³\u0001J\u0010\u0010¶\u0001\u001a\u00020.¢\u0006\u0006\b¶\u0001\u0010\u0001J\u001c\u0010·\u0001\u001a\u0004\u0018\u00010*2\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0006\b·\u0001\u0010¸\u0001J!\u0010º\u0001\u001a\u00020.2\u0006\u0010)\u001a\u00020\"2\u0007\u0010¹\u0001\u001a\u00020 ¢\u0006\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R,\u0010Ü\u0001\u001a\u00030Ö\u00012\b\u0010×\u0001\u001a\u00030Ö\u00018\u0002@BX\u000e¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u001d\u0010â\u0001\u001a\u00030Ý\u00018\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001e\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020A0ã\u00018\u0002X\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\"\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010å\u0001\u001a\u0006\bè\u0001\u0010é\u0001R \u0010î\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0ë\u00018\u0002X\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R%\u0010ô\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0ï\u00018\u0006¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R%\u0010ú\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0õ\u00018\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R&\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ü\u00010û\u00018\u0006¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020 0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R#\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020 0õ\u00018\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010÷\u0001\u001a\u0006\b\u0002\u0010ù\u0001R\u001f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R$\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020õ\u00018\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010÷\u0001\u001a\u0006\b\u0002\u0010ù\u0001R\u001f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R$\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020õ\u00018\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010÷\u0001\u001a\u0006\b\u0002\u0010ù\u0001R4\u0010y\u001a\u0004\u0018\u00010j2\t\u0010×\u0001\u001a\u0004\u0018\u00010j8\u0006@FX\u000e¢\u0006\u0017\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0005\b\u0002\u0010mR)\u0010\u0002\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0001\"\u0006\b\u0002\u0010\u0001R\u001e\u0010 \u0002\u001a\t\u0012\u0004\u0012\u00020j0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R#\u0010£\u0002\u001a\t\u0012\u0004\u0012\u00020j0õ\u00018\u0006¢\u0006\u0010\n\u0006\b¡\u0002\u0010÷\u0001\u001a\u0006\b¢\u0002\u0010ù\u0001R\u001e\u0010¥\u0002\u001a\t\u0012\u0004\u0012\u00020:0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010\u0002R#\u0010¨\u0002\u001a\t\u0012\u0004\u0012\u00020:0õ\u00018\u0006¢\u0006\u0010\n\u0006\b¦\u0002\u0010÷\u0001\u001a\u0006\b§\u0002\u0010ù\u0001R\u001e\u0010ª\u0002\u001a\t\u0012\u0004\u0012\u00020:0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b©\u0002\u0010\u0002R#\u0010­\u0002\u001a\t\u0012\u0004\u0012\u00020:0õ\u00018\u0006¢\u0006\u0010\n\u0006\b«\u0002\u0010÷\u0001\u001a\u0006\b¬\u0002\u0010ù\u0001R\u001e\u0010¯\u0002\u001a\t\u0012\u0004\u0012\u00020 0ë\u00018\u0002X\u0004¢\u0006\b\n\u0006\b®\u0002\u0010í\u0001R#\u0010²\u0002\u001a\t\u0012\u0004\u0012\u00020 0ï\u00018\u0006¢\u0006\u0010\n\u0006\b°\u0002\u0010ñ\u0001\u001a\u0006\b±\u0002\u0010ó\u0001R\u001f\u0010¶\u0002\u001a\n\u0012\u0005\u0012\u00030´\u00020³\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010µ\u0002R)\u0010t\u001a\u00020 2\u0007\u0010×\u0001\u001a\u00020 8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b·\u0002\u0010\u0002\u001a\u0006\b¸\u0002\u0010\u0001R)\u0010s\u001a\u00020 2\u0007\u0010×\u0001\u001a\u00020 8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u0002\u001a\u0006\b¹\u0002\u0010\u0001R)\u0010u\u001a\u00020 2\u0007\u0010×\u0001\u001a\u00020 8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bè\u0001\u0010\u0002\u001a\u0006\bº\u0002\u0010\u0001R\u0018\u0010v\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b»\u0002\u0010\u0002R\u001f\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030¼\u00020³\u00028\u0002X\u0004¢\u0006\b\n\u0006\b½\u0002\u0010µ\u0002R$\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030¼\u00020õ\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010÷\u0001\u001a\u0006\b·\u0002\u0010ù\u0001R!\u0010Â\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010À\u00020ë\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010í\u0001R\u001a\u0010Å\u0002\u001a\u00030Ã\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Ä\u0002R\u001e\u0010Æ\u0002\u001a\t\u0012\u0004\u0012\u00020O0³\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010µ\u0002R$\u0010È\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020ï\u00018\u0006¢\u0006\u0010\n\u0006\bò\u0001\u0010ñ\u0001\u001a\u0006\b¼\u0001\u0010ó\u0001R$\u0010Í\u0002\u001a\n\u0012\u0005\u0012\u00030Ê\u00020É\u00028\u0006¢\u0006\u0010\n\u0006\bø\u0001\u0010Ë\u0002\u001a\u0006\b»\u0002\u0010Ì\u0002R8\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010@2\u000f\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010@8\u0006@BX\u000e¢\u0006\u000f\n\u0005\b^\u0010å\u0001\u001a\u0006\bÎ\u0002\u0010é\u0001R8\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010@2\u000f\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010@8\u0006@BX\u000e¢\u0006\u000f\n\u0005\bb\u0010å\u0001\u001a\u0006\bÁ\u0002\u0010é\u0001R.\u0010Ó\u0002\u001a\u0004\u0018\u00010[2\t\u0010×\u0001\u001a\u0004\u0018\u00010[8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÏ\u0002\u0010Ð\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002R\u001e\u0010Ô\u0002\u001a\t\u0012\u0004\u0012\u00020 0ë\u00018\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010í\u0001R#\u0010Ö\u0002\u001a\t\u0012\u0004\u0012\u00020 0û\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0002\u0010þ\u0001\u001a\u0006\bÕ\u0002\u0010\u0002R(\u0010Ø\u0002\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bP\u0010\u0002\u001a\u0006\bÏ\u0002\u0010\u0001\"\u0006\b×\u0002\u0010\u0001R*\u0010Ú\u0002\u001a\u00020 2\u0007\u0010×\u0001\u001a\u00020 8\u0002@BX\u000e¢\u0006\u0010\n\u0006\bÎ\u0002\u0010\u0002\"\u0006\bÙ\u0002\u0010\u0001R\u0019\u0010Ü\u0002\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010\u0002R\u0019\u0010Ý\u0002\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010\u0002R\u0019\u0010Þ\u0002\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bà\u0001\u0010\u0002R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bY\u0010ß\u0002R\u0012\u0010z\u001a\u00020O8F¢\u0006\u0007\u001a\u0005\b½\u0002\u0010QR\u0015\u0010â\u0002\u001a\u00030à\u00028F¢\u0006\b\u001a\u0006\bÛ\u0002\u0010á\u0002¨\u0006ä\u0002"}, d2 = {"LDo/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LNn/x;", "checkoutRepository", "LWn/b;", "analytics", "LaA/a;", "sessionManager", "LIl/a;", "appConfigApi", "LlD/d;", "getProfile", "Lsv/a;", "mCommerceConfigRepository", "Ltf/a;", "killSwitch", "LUr/a;", "googlePayUseCase", "Lko/g;", "saveTimeSlotUseCase", "Lwo/a;", "getCheckoutPriceUiStateUseCase", "LVn/b;", "selectEarliestTimeWindowUseCase", "Lwo/e;", "trackOnlinePurchaseUseCase", "Lwo/c;", "getDeliveryMethodUiStateUseCase", "<init>", "(Landroidx/lifecycle/U;LNn/x;LWn/b;LaA/a;LIl/a;LlD/d;Lsv/a;Ltf/a;LUr/a;Lko/g;Lwo/a;LVn/b;Lwo/e;Lwo/c;)V", "", "isFirstZipIn", "", "stateCode", "LDo/m;", "preselectDeliveryOption", "LNn/f;", "L1", "(ZLjava/lang/String;LDo/m;LdI/e;)Ljava/lang/Object;", "checkoutId", "Lho/b;", "deliveryOption", "LDo/l$a;", "autoSelectPickupPoint", "LXH/N;", "s0", "(Ljava/lang/String;Lho/b;LDo/l$a;LdI/e;)Ljava/lang/Object;", "deliveryServiceId", "deliveryId", "LNn/G;", "pickupPoint", "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/G;LdI/e;)Ljava/lang/Object;", "familyCardNumber", "t0", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "e", "p1", "(Ljava/lang/Throwable;)V", "throwable", "q1", "", "LNn/g;", "items", "F1", "(Ljava/util/List;)V", "LVn/b$b;", "selectDeliveryService", "v1", "(Ljava/lang/String;LVn/b$b;LdI/e;)Ljava/lang/Object;", "Lho/b$b;", "homeDeliveryOptions", "Lho/b$a;", "collectDeliveryOptions", "D1", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LDo/a;", "O0", "()LDo/a;", "j0", "(Ljava/util/List;Ljava/util/List;)V", "LDo/l;", "v0", "(Ljava/util/List;Ljava/util/List;LDo/m;)LDo/l;", "h1", "LUn/a;", "T0", "(LDo/m;)LUn/a;", "LNn/K;", "isCollapsed", "Llo/j;", "J0", "(LNn/K;Z)Ljava/util/List;", "LNn/n;", "LRC/n;", "K0", "(LNn/n;)LRC/n;", "LDo/f$b;", "action", "g1", "(LDo/f$b;)V", "I1", "(Ljava/lang/String;LDo/m;Z)V", "LYn/P;", "deliveryMethod", "m1", "(LYn/P;)V", "checkoutHolder", "j1", "(LNn/f;)V", "u1", "(Lho/b;)V", "showTotalExclTaxInCartAndCheckout", "pickupDisabled", "showPaymentInformationSection", "showOrderSummaryInCheckoutExpanded", "E1", "(ZZZLjava/lang/Boolean;)V", "selectedDeliveryMethod", "checkoutStep", "Lho/c;", "q0", "(LYn/P;LDo/a;)Lho/c;", "Ljo/b;", "p0", "(LDo/a;)Ljo/b;", "LYn/o0;", "r0", "()LYn/o0;", "o0", "D0", "()Ljo/b;", "f1", "()Z", "deliverServiceId", "LNn/k;", "F0", "(Ljava/lang/String;)LNn/k;", "x0", "()V", "isSubmitting", "G1", "(Z)V", "m0", "n0", "i1", "n1", "l1", "o1", "itemsToDelete", "LNn/y;", "itemsToUpdate", "g0", "(Ljava/util/List;Ljava/util/List;LDo/m;)V", "", "deliveryOrder", "w0", "(Ljava/lang/String;I)Ljava/lang/String;", "LNn/o;", "u0", "(Ljava/lang/String;)LNn/o;", "LWn/b$a;", "z0", "()LWn/b$a;", "step", "C1", "(LDo/a;)V", "k1", "selectedTimeSlotId", "LNn/c;", "updatedCapabilities", "t1", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Bundle;", "bundle", "s1", "(Landroid/os/Bundle;)V", "savedInstanceState", "r1", "i0", "M0", "(LYn/P;)Lho/b;", "isExpressFlow", "B1", "(Ljava/lang/String;Z)V", "m", "Landroidx/lifecycle/U;", "n", "LNn/x;", "o", "LWn/b;", "p", "LaA/a;", "q", "LIl/a;", "r", "LlD/d;", "s", "Ltf/a;", "t", "LUr/a;", "u", "Lko/g;", "v", "Lwo/a;", "w", "LVn/b;", "x", "Lwo/e;", "y", "Lwo/c;", "LMn/c;", "value", "z", "LMn/c;", "w1", "(LMn/c;)V", "checkoutData", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "A", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "S0", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "", "B", "Ljava/util/List;", "_checkoutItems", "C", "A0", "()Ljava/util/List;", "checkoutItems", "LTJ/B;", "D", "LTJ/B;", "_currentCheckoutIdFlow", "LTJ/P;", "E", "LTJ/P;", "H0", "()LTJ/P;", "currentCheckoutIdFlow", "Landroidx/lifecycle/F;", "F", "Landroidx/lifecycle/F;", "I0", "()Landroidx/lifecycle/F;", "currentCheckoutLiveData", "LTJ/g;", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "G", "LTJ/g;", "G0", "()LTJ/g;", "configFlow", "Lip/b;", "H", "Lip/b;", "_showAvailabilityDiscrepancy", "I", "Y0", "showAvailabilityDiscrepancy", "LDo/n;", "J", "_showChangePickupPoint", "K", "Z0", "showChangePickupPoint", "LNn/o$d;", "L", "_showUnavailableHomeDeliveryService", "M", "d1", "showUnavailableHomeDeliveryService", "N", "LYn/P;", "V0", "()LYn/P;", "z1", "O", "Z", "e1", "A1", "skipSelectDeliveryOptionStep", "P", "_selectedDeliveryMethodLiveData", "Q", "W0", "selectedDeliveryMethodLiveData", "R", "_fatalError", "S", "N0", "fatalError", "T", "_recoverableError", "U", "U0", "recoverableError", "X", "_showProgressLoading", "Y", "c1", "showProgressLoading", "Landroidx/lifecycle/K;", "LDo/k;", "Landroidx/lifecycle/K;", "showFullscreenLoading", "y0", "R0", "getShowTotalExclTaxInCartAndCheckout", "b1", "B0", "LNn/e$a;", "C0", "_ambiguousDeliveryArea", "ambiguousDeliveryArea", "LUr/a$a;", "E0", "deliveryServiceType", "LUr/a$b;", "LUr/a$b;", "googlePayUiState", "_checkoutStep", "LDo/c;", "uiState", "Landroidx/lifecycle/I;", "LDo/b;", "Landroidx/lifecycle/I;", "()Landroidx/lifecycle/I;", "checkoutStage", "P0", "L0", "LNn/K;", "X0", "()LNn/K;", "selectedDeliveryServiceHolder", "hasShownCouponWarning", "a1", "showCouponRemovedWarning", "x1", "deliverySectionExpanded", "y1", "forceDeliverySectionExpanded", "Q0", "allowBackToCollapsedDelivery", "hasSelectedDeliveryOptionPickupPoints", "isRestored", "Ljava/lang/String;", "Leo/c;", "()Leo/c;", "orderSummaryData", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {

    /* renamed from: A  reason: collision with root package name */
    private final UserPostalCodeAddress f79854A;

    /* renamed from: A0  reason: collision with root package name */
    private boolean f79855A0;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final List<C10804g> f79856B;

    /* renamed from: B0  reason: collision with root package name */
    private boolean f79857B0;

    /* renamed from: C  reason: collision with root package name */
    private final List<C10804g> f79858C;

    /* renamed from: C0  reason: collision with root package name */
    private final K<C10802e.a> f79859C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C16505B<String> f79860D;

    /* renamed from: D0  reason: collision with root package name */
    private final F<C10802e.a> f79861D0;

    /* renamed from: E  reason: collision with root package name */
    private final C16519P<String> f79862E;
    /* access modifiers changed from: private */

    /* renamed from: E0  reason: collision with root package name */
    public final C16505B<a.C1858a> f79863E0;

    /* renamed from: F  reason: collision with root package name */
    private final F<C10803f> f79864F;
    /* access modifiers changed from: private */

    /* renamed from: F0  reason: collision with root package name */
    public a.b f79865F0;

    /* renamed from: G  reason: collision with root package name */
    private final C16532g<MComConfig> f79866G;
    /* access modifiers changed from: private */

    /* renamed from: G0  reason: collision with root package name */
    public final K<a> f79867G0;

    /* renamed from: H  reason: collision with root package name */
    private final C11410b<Boolean> f79868H;

    /* renamed from: H0  reason: collision with root package name */
    private final C16519P<c> f79869H0;

    /* renamed from: I  reason: collision with root package name */
    private final F<Boolean> f79870I;

    /* renamed from: I0  reason: collision with root package name */
    private final I<b> f79871I0;

    /* renamed from: J  reason: collision with root package name */
    private final C11410b<n> f79872J;

    /* renamed from: J0  reason: collision with root package name */
    private List<b.C2205b> f79873J0;

    /* renamed from: K  reason: collision with root package name */
    private final F<n> f79874K;

    /* renamed from: K0  reason: collision with root package name */
    private List<b.a> f79875K0;

    /* renamed from: L  reason: collision with root package name */
    private final C11410b<C10812o.d> f79876L;

    /* renamed from: L0  reason: collision with root package name */
    private Nn.K f79877L0;

    /* renamed from: M  reason: collision with root package name */
    private final F<C10812o.d> f79878M;

    /* renamed from: M0  reason: collision with root package name */
    private final C16505B<Boolean> f79879M0;

    /* renamed from: N  reason: collision with root package name */
    private P f79880N;

    /* renamed from: N0  reason: collision with root package name */
    private final C16532g<Boolean> f79881N0;

    /* renamed from: O  reason: collision with root package name */
    private boolean f79882O;

    /* renamed from: O0  reason: collision with root package name */
    private boolean f79883O0;

    /* renamed from: P  reason: collision with root package name */
    private final C11410b<P> f79884P;
    /* access modifiers changed from: private */

    /* renamed from: P0  reason: collision with root package name */
    public boolean f79885P0;

    /* renamed from: Q  reason: collision with root package name */
    private final F<P> f79886Q;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f79887Q0;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public final C11410b<Throwable> f79888R;
    /* access modifiers changed from: private */

    /* renamed from: R0  reason: collision with root package name */
    public boolean f79889R0;

    /* renamed from: S  reason: collision with root package name */
    private final F<Throwable> f79890S;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f79891S0;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public final C11410b<Throwable> f79892T;
    /* access modifiers changed from: private */

    /* renamed from: T0  reason: collision with root package name */
    public String f79893T0;

    /* renamed from: U  reason: collision with root package name */
    private final F<Throwable> f79894U;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public final C16505B<Boolean> f79895X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16519P<Boolean> f79896Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public final K<k> f79897Z;

    /* renamed from: m  reason: collision with root package name */
    private final U f79898m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final x f79899n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Wn.b f79900o;

    /* renamed from: p  reason: collision with root package name */
    private final C13909a f79901p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Il.a f79902q;

    /* renamed from: r  reason: collision with root package name */
    private final C14762d f79903r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C10253a f79904s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final Ur.a f79905t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final ko.g f79906u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C12290a f79907v;

    /* renamed from: w  reason: collision with root package name */
    private final Vn.b f79908w;

    /* renamed from: x  reason: collision with root package name */
    private final C12294e f79909x;

    /* renamed from: y  reason: collision with root package name */
    private final C12292c f79910y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f79911y0;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public Mn.c f79912z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f79913z0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$2", f = "CheckoutViewModel.kt", l = {350}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79914c;

        /* renamed from: d  reason: collision with root package name */
        Object f79915d;

        /* renamed from: e  reason: collision with root package name */
        int f79916e;

        /* renamed from: f  reason: collision with root package name */
        int f79917f;

        /* renamed from: g  reason: collision with root package name */
        int f79918g;

        /* renamed from: h  reason: collision with root package name */
        int f79919h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f79920i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Do.f$a$a  reason: collision with other inner class name */
        static final class C1502a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f79921a;

            C1502a(f fVar) {
                this.f79921a = fVar;
            }

            /* renamed from: c */
            public final Object emit(a.b bVar, C17164e<? super C16807N> eVar) {
                this.f79921a.f79865F0 = bVar;
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f79922a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Do.f$a$b$a  reason: collision with other inner class name */
            public static final class C1503a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f79923a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$2$invokeSuspend$$inlined$map$1$2", f = "CheckoutViewModel.kt", l = {50}, m = "emit")
                /* renamed from: Do.f$a$b$a$a  reason: collision with other inner class name */
                public static final class C1504a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f79924c;

                    /* renamed from: d  reason: collision with root package name */
                    int f79925d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C1503a f79926e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1504a(C1503a aVar, C17164e eVar) {
                        super(eVar);
                        this.f79926e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f79924c = obj;
                        this.f79925d |= Integer.MIN_VALUE;
                        return this.f79926e.emit((Object) null, this);
                    }
                }

                public C1503a(C16533h hVar) {
                    this.f79923a = hVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                    r5 = r5.q();
                 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Do.f.a.b.C1503a.C1504a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Do.f$a$b$a$a r0 = (Do.f.a.b.C1503a.C1504a) r0
                        int r1 = r0.f79925d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f79925d = r1
                        goto L_0x0018
                    L_0x0013:
                        Do.f$a$b$a$a r0 = new Do.f$a$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f79924c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f79925d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f79923a
                        com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                        if (r5 == 0) goto L_0x0045
                        java.lang.Boolean r5 = r5.q()
                        if (r5 == 0) goto L_0x0045
                        boolean r5 = r5.booleanValue()
                        goto L_0x0046
                    L_0x0045:
                        r5 = 0
                    L_0x0046:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f79925d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Do.f.a.b.C1503a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar) {
                this.f79922a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f79922a.collect(new C1503a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f79920i = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f79920i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f79919h;
            if (i10 == 0) {
                y.b(obj);
                Ur.a L10 = this.f79920i.f79905t;
                C16519P<KillSwitchConfig> I10 = this.f79920i.f79904s.I();
                C16532g<a.b> a10 = L10.a(new b(I10), this.f79920i.f79863E0);
                C1502a aVar = new C1502a(this.f79920i);
                this.f79914c = I10;
                this.f79915d = I10;
                this.f79916e = 0;
                this.f79917f = 0;
                this.f79918g = 0;
                this.f79919h = 1;
                if (a10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16532g gVar = (C16532g) this.f79915d;
                C16532g gVar2 = (C16532g) this.f79914c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LDo/f$b;", "", "<init>", "()V", "a", "LDo/f$b$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDo/f$b$a;", "LDo/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f79927a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1650196085;
            }

            public String toString() {
                return "GooglePayExpressSkip";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79928a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Yn.P[] r0 = Yn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yn.P r1 = Yn.P.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Yn.P r1 = Yn.P.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f79928a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Do.f.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {778}, m = "autoSelectPickupPoint")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79929c;

        /* renamed from: d  reason: collision with root package name */
        Object f79930d;

        /* renamed from: e  reason: collision with root package name */
        Object f79931e;

        /* renamed from: f  reason: collision with root package name */
        Object f79932f;

        /* renamed from: g  reason: collision with root package name */
        Object f79933g;

        /* renamed from: h  reason: collision with root package name */
        Object f79934h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f79935i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f79936j;

        /* renamed from: k  reason: collision with root package name */
        int f79937k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f79936j = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79935i = obj;
            this.f79937k |= Integer.MIN_VALUE;
            return this.f79936j.h0((String) null, (String) null, (String) null, (G) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Do/f$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f79938a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, f fVar) {
            super(aVar);
            this.f79938a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f79938a;
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
                    String a10 = C11818a.a("Error clearing payment session", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$clearPaymentSession$2", f = "CheckoutViewModel.kt", l = {833}, m = "invokeSuspend")
    /* renamed from: Do.f$f  reason: collision with other inner class name */
    static final class C1505f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79939c;

        /* renamed from: d  reason: collision with root package name */
        Object f79940d;

        /* renamed from: e  reason: collision with root package name */
        Object f79941e;

        /* renamed from: f  reason: collision with root package name */
        Object f79942f;

        /* renamed from: g  reason: collision with root package name */
        int f79943g;

        /* renamed from: h  reason: collision with root package name */
        int f79944h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f79945i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f79946j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1505f(f fVar, C17164e<? super C1505f> eVar) {
            super(2, eVar);
            this.f79946j = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1505f fVar = new C1505f(this.f79946j, eVar);
            fVar.f79945i = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1505f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f79944h
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 != r3) goto L_0x0024
                java.lang.Object r0 = r12.f79942f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.f79941e
                Do.f r0 = (Do.f) r0
                java.lang.Object r0 = r12.f79940d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.f79939c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.f79945i
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r13)
                goto L_0x005d
            L_0x0024:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x002c:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f79945i
                QJ.Q r13 = (QJ.Q) r13
                Do.f r1 = r12.f79946j
                TJ.P r1 = r1.H0()
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x005e
                Do.f r4 = r12.f79946j
                Nn.x r5 = r4.f79899n
                r12.f79945i = r13
                r12.f79939c = r1
                r12.f79940d = r1
                r12.f79941e = r4
                r12.f79942f = r1
                r12.f79943g = r2
                r12.f79944h = r3
                java.lang.Object r1 = r5.b(r1, r12)
                if (r1 != r0) goto L_0x005c
                return r0
            L_0x005c:
                r0 = r13
            L_0x005d:
                r13 = r0
            L_0x005e:
                qv.e r0 = qv.e.DEBUG
                qv.d r1 = qv.d.f102012a
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0071:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0088
                java.lang.Object r5 = r1.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r0, r2)
                if (r6 == 0) goto L_0x0071
                r4.add(r5)
                goto L_0x0071
            L_0x0088:
                java.util.Iterator r1 = r4.iterator()
                r2 = 0
                r4 = r2
                r5 = r4
            L_0x008f:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0108
                java.lang.Object r6 = r1.next()
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                if (r4 != 0) goto L_0x00ab
                java.lang.String r4 = "Payment session cleared"
                java.lang.String r4 = qv.C11818a.a(r4, r8)
                if (r4 != 0) goto L_0x00a7
                goto L_0x0108
            L_0x00a7:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00ab:
                r10 = r4
                if (r5 != 0) goto L_0x00fc
                java.lang.Class r4 = r13.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r2, r7, r2)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r2, r7, r2)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00cd
                goto L_0x00d3
            L_0x00cd:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00d3:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00e6
                java.lang.String r5 = "m"
                goto L_0x00e8
            L_0x00e6:
                java.lang.String r5 = "b"
            L_0x00e8:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00fc:
                r11 = r5
                r7 = 0
                r4 = r6
                r5 = r0
                r6 = r11
                r9 = r10
                r4.a(r5, r6, r7, r8, r9)
                r4 = r10
                r5 = r11
                goto L_0x008f
            L_0x0108:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: Do.f.C1505f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {727, 746}, m = "doSelectDeliveryOption")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79947c;

        /* renamed from: d  reason: collision with root package name */
        Object f79948d;

        /* renamed from: e  reason: collision with root package name */
        Object f79949e;

        /* renamed from: f  reason: collision with root package name */
        Object f79950f;

        /* renamed from: g  reason: collision with root package name */
        Object f79951g;

        /* renamed from: h  reason: collision with root package name */
        Object f79952h;

        /* renamed from: i  reason: collision with root package name */
        Object f79953i;

        /* renamed from: j  reason: collision with root package name */
        Object f79954j;

        /* renamed from: k  reason: collision with root package name */
        Object f79955k;

        /* renamed from: l  reason: collision with root package name */
        Object f79956l;

        /* renamed from: m  reason: collision with root package name */
        Object f79957m;

        /* renamed from: n  reason: collision with root package name */
        Object f79958n;

        /* renamed from: o  reason: collision with root package name */
        Object f79959o;

        /* renamed from: p  reason: collision with root package name */
        Object f79960p;

        /* renamed from: q  reason: collision with root package name */
        Object f79961q;

        /* renamed from: r  reason: collision with root package name */
        Object f79962r;

        /* renamed from: s  reason: collision with root package name */
        int f79963s;

        /* renamed from: t  reason: collision with root package name */
        int f79964t;

        /* renamed from: u  reason: collision with root package name */
        int f79965u;

        /* renamed from: v  reason: collision with root package name */
        int f79966v;

        /* renamed from: w  reason: collision with root package name */
        int f79967w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f79968x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ f f79969y;

        /* renamed from: z  reason: collision with root package name */
        int f79970z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f79969y = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79968x = obj;
            this.f79970z |= Integer.MIN_VALUE;
            return this.f79969y.s0((String) null, (ho.b) null, (l.a) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {848}, m = "fetchFamilyCard")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79971c;

        /* renamed from: d  reason: collision with root package name */
        Object f79972d;

        /* renamed from: e  reason: collision with root package name */
        Object f79973e;

        /* renamed from: f  reason: collision with root package name */
        Object f79974f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f79975g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f79976h;

        /* renamed from: i  reason: collision with root package name */
        int f79977i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f79976h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79975g = obj;
            this.f79977i |= Integer.MIN_VALUE;
            return this.f79976h.t0((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Do/f$i", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f79978a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(N.a aVar, f fVar) {
            super(aVar);
            this.f79978a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f79978a;
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
                    String a10 = C11818a.a("Error restoring checkout state", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                } else {
                    Throwable th3 = th2;
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
            f.J1(this.f79978a, (String) null, (m) null, false, 7, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$restoreInstance$2", f = "CheckoutViewModel.kt", l = {1244}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79979c;

        /* renamed from: d  reason: collision with root package name */
        Object f79980d;

        /* renamed from: e  reason: collision with root package name */
        Object f79981e;

        /* renamed from: f  reason: collision with root package name */
        int f79982f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f79983g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f79984h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Bundle f79985i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar, Bundle bundle, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f79984h = fVar;
            this.f79985i = bundle;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f79984h, this.f79985i, eVar);
            jVar.f79983g = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List, java.util.Collection, java.lang.Object, java.util.ArrayList] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r1 = r23
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f79982f
                r3 = 1
                if (r2 == 0) goto L_0x0025
                if (r2 != r3) goto L_0x001d
                java.lang.Object r0 = r1.f79979c
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.lang.Object r0 = r1.f79983g
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r24)     // Catch:{ all -> 0x001a }
                goto L_0x00a3
            L_0x001a:
                r0 = move-exception
                goto L_0x02b2
            L_0x001d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0025:
                XH.y.b(r24)
                java.lang.Object r2 = r1.f79983g
                QJ.Q r2 = (QJ.Q) r2
                Do.f r4 = r1.f79984h     // Catch:{ all -> 0x001a }
                androidx.lifecycle.K r4 = r4.f79897Z     // Catch:{ all -> 0x001a }
                Do.k r5 = Do.k.RESTORE     // Catch:{ all -> 0x001a }
                r4.postValue(r5)     // Catch:{ all -> 0x001a }
                Do.f r4 = r1.f79984h     // Catch:{ all -> 0x001a }
                TJ.B r4 = r4.f79860D     // Catch:{ all -> 0x001a }
                android.os.Bundle r5 = r1.f79985i     // Catch:{ all -> 0x001a }
            L_0x003f:
                java.lang.Object r6 = r4.getValue()     // Catch:{ all -> 0x001a }
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x001a }
                java.lang.String r8 = "CHECKOUT_ID_KEY"
                if (r7 != 0) goto L_0x004e
                java.lang.String r7 = r5.getString(r8)     // Catch:{ all -> 0x001a }
            L_0x004e:
                boolean r7 = r4.e(r6, r7)     // Catch:{ all -> 0x001a }
                if (r7 == 0) goto L_0x003f
                android.os.Bundle r4 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r7 = "PRODUCT_LIST_KEY"
                java.util.ArrayList r4 = r4.getParcelableArrayList(r7)     // Catch:{ all -> 0x001a }
                if (r4 == 0) goto L_0x006c
                Do.f r5 = r1.f79984h     // Catch:{ all -> 0x001a }
                java.util.List r5 = r5.f79856B     // Catch:{ all -> 0x001a }
                r5.clear()     // Catch:{ all -> 0x001a }
                r5.addAll(r4)     // Catch:{ all -> 0x001a }
                r5 = r4
                r6 = r5
            L_0x006c:
                Do.f r7 = r1.f79984h     // Catch:{ all -> 0x001a }
                Nn.x r7 = r7.f79899n     // Catch:{ all -> 0x001a }
                Nn.j r9 = new Nn.j     // Catch:{ all -> 0x001a }
                android.os.Bundle r10 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r8 = r10.getString(r8)     // Catch:{ all -> 0x001a }
                android.os.Bundle r10 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r11 = "PAYMENT_HOLDER_KEY"
                android.os.Parcelable r10 = r10.getParcelable(r11)     // Catch:{ all -> 0x001a }
                Nn.C r10 = (Nn.C) r10     // Catch:{ all -> 0x001a }
                android.os.Bundle r11 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r12 = "PSP_SESSION_KEY"
                android.os.Parcelable r11 = r11.getParcelable(r12)     // Catch:{ all -> 0x001a }
                Nn.H r11 = (Nn.H) r11     // Catch:{ all -> 0x001a }
                r9.<init>(r8, r10, r11, r4)     // Catch:{ all -> 0x001a }
                r1.f79983g = r2     // Catch:{ all -> 0x001a }
                r1.f79979c = r4     // Catch:{ all -> 0x001a }
                r1.f79980d = r5     // Catch:{ all -> 0x001a }
                r1.f79981e = r6     // Catch:{ all -> 0x001a }
                r1.f79982f = r3     // Catch:{ all -> 0x001a }
                java.lang.Object r4 = r7.u(r9, r1)     // Catch:{ all -> 0x001a }
                if (r4 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                r0 = r2
            L_0x00a3:
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r4 = "CHECKOUT_STEP_KEY"
                android.os.Parcelable r2 = r2.getParcelable(r4)     // Catch:{ all -> 0x001a }
                Do.a r2 = (Do.a) r2     // Catch:{ all -> 0x001a }
                java.lang.String r4 = "|"
                java.lang.String r5 = "b"
                java.lang.String r6 = "m"
                java.lang.String r7 = "main"
                java.lang.String r8 = "Kt"
                r11 = 0
                r13 = 0
                if (r2 == 0) goto L_0x0185
                Do.f r14 = r1.f79984h     // Catch:{ all -> 0x001a }
                qv.e r15 = qv.e.DEBUG     // Catch:{ all -> 0x001a }
                qv.d r16 = qv.d.f102012a     // Catch:{ all -> 0x001a }
                java.util.List r16 = r16.a()     // Catch:{ all -> 0x001a }
                java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x001a }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x001a }
                r3.<init>()     // Catch:{ all -> 0x001a }
                java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x001a }
            L_0x00d0:
                boolean r17 = r16.hasNext()     // Catch:{ all -> 0x001a }
                if (r17 == 0) goto L_0x00e7
                java.lang.Object r9 = r16.next()     // Catch:{ all -> 0x001a }
                r10 = r9
                qv.b r10 = (qv.C11819b) r10     // Catch:{ all -> 0x001a }
                boolean r10 = r10.b(r15, r11)     // Catch:{ all -> 0x001a }
                if (r10 == 0) goto L_0x00d0
                r3.add(r9)     // Catch:{ all -> 0x001a }
                goto L_0x00d0
            L_0x00e7:
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x001a }
                r9 = r13
                r10 = r9
            L_0x00ed:
                boolean r16 = r3.hasNext()     // Catch:{ all -> 0x001a }
                if (r16 == 0) goto L_0x017e
                java.lang.Object r16 = r3.next()     // Catch:{ all -> 0x001a }
                qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x001a }
                r11 = 0
                if (r9 != 0) goto L_0x0119
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
                r9.<init>()     // Catch:{ all -> 0x001a }
                java.lang.String r12 = "Restore checkoutStep: "
                r9.append(r12)     // Catch:{ all -> 0x001a }
                r9.append(r2)     // Catch:{ all -> 0x001a }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x001a }
                java.lang.String r9 = qv.C11818a.a(r9, r11)     // Catch:{ all -> 0x001a }
                if (r9 != 0) goto L_0x0115
                goto L_0x017e
            L_0x0115:
                java.lang.String r9 = qv.C11820c.a(r9)     // Catch:{ all -> 0x001a }
            L_0x0119:
                if (r10 != 0) goto L_0x0165
                java.lang.Class r10 = r0.getClass()     // Catch:{ all -> 0x001a }
                java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x001a }
                kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ all -> 0x001a }
                r22 = r3
                r11 = 2
                r12 = 36
                java.lang.String r3 = HJ.C15854t.s1(r10, r12, r13, r11, r13)     // Catch:{ all -> 0x001a }
                r12 = 46
                java.lang.String r3 = HJ.C15854t.o1(r3, r12, r13, r11, r13)     // Catch:{ all -> 0x001a }
                int r11 = r3.length()     // Catch:{ all -> 0x001a }
                if (r11 != 0) goto L_0x013c
                goto L_0x0140
            L_0x013c:
                java.lang.String r10 = HJ.C15854t.P0(r3, r8)     // Catch:{ all -> 0x001a }
            L_0x0140:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001a }
                java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x001a }
                r11 = 1
                boolean r3 = HJ.C15854t.b0(r3, r7, r11)     // Catch:{ all -> 0x001a }
                if (r3 == 0) goto L_0x0151
                r3 = r6
                goto L_0x0152
            L_0x0151:
                r3 = r5
            L_0x0152:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
                r11.<init>()     // Catch:{ all -> 0x001a }
                r11.append(r3)     // Catch:{ all -> 0x001a }
                r11.append(r4)     // Catch:{ all -> 0x001a }
                r11.append(r10)     // Catch:{ all -> 0x001a }
                java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x001a }
                goto L_0x0167
            L_0x0165:
                r22 = r3
            L_0x0167:
                r18 = 0
                r3 = r15
                r15 = r16
                r16 = r3
                r17 = r10
                r11 = 0
                r19 = r11
                r20 = r9
                r15.a(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x001a }
                r15 = r3
                r3 = r22
                r11 = 0
                goto L_0x00ed
            L_0x017e:
                androidx.lifecycle.K r3 = r14.f79867G0     // Catch:{ all -> 0x001a }
                r3.postValue(r2)     // Catch:{ all -> 0x001a }
            L_0x0185:
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "SELECTED_DELIVERY_METHOD_KEY"
                java.io.Serializable r2 = r2.getSerializable(r3)     // Catch:{ all -> 0x001a }
                boolean r3 = r2 instanceof Yn.P     // Catch:{ all -> 0x001a }
                if (r3 != 0) goto L_0x0192
                r2 = r13
            L_0x0192:
                Yn.P r2 = (Yn.P) r2     // Catch:{ all -> 0x001a }
                if (r2 == 0) goto L_0x0263
                Do.f r3 = r1.f79984h     // Catch:{ all -> 0x001a }
                qv.e r9 = qv.e.DEBUG     // Catch:{ all -> 0x001a }
                qv.d r10 = qv.d.f102012a     // Catch:{ all -> 0x001a }
                java.util.List r10 = r10.a()     // Catch:{ all -> 0x001a }
                java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ all -> 0x001a }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x001a }
                r11.<init>()     // Catch:{ all -> 0x001a }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x001a }
            L_0x01ab:
                boolean r12 = r10.hasNext()     // Catch:{ all -> 0x001a }
                if (r12 == 0) goto L_0x01c3
                java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x001a }
                r14 = r12
                qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x001a }
                r15 = 0
                boolean r14 = r14.b(r9, r15)     // Catch:{ all -> 0x001a }
                if (r14 == 0) goto L_0x01ab
                r11.add(r12)     // Catch:{ all -> 0x001a }
                goto L_0x01ab
            L_0x01c3:
                java.util.Iterator r10 = r11.iterator()     // Catch:{ all -> 0x001a }
                r11 = r13
                r12 = r11
            L_0x01c9:
                boolean r14 = r10.hasNext()     // Catch:{ all -> 0x001a }
                if (r14 == 0) goto L_0x0260
                java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x001a }
                qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x001a }
                r15 = 0
                if (r11 != 0) goto L_0x01f5
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
                r11.<init>()     // Catch:{ all -> 0x001a }
                java.lang.String r13 = "Restore selectedDeliveryMethod: "
                r11.append(r13)     // Catch:{ all -> 0x001a }
                r11.append(r2)     // Catch:{ all -> 0x001a }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x001a }
                java.lang.String r11 = qv.C11818a.a(r11, r15)     // Catch:{ all -> 0x001a }
                if (r11 != 0) goto L_0x01f1
                goto L_0x0260
            L_0x01f1:
                java.lang.String r11 = qv.C11820c.a(r11)     // Catch:{ all -> 0x001a }
            L_0x01f5:
                if (r12 != 0) goto L_0x0245
                java.lang.Class r12 = r0.getClass()     // Catch:{ all -> 0x001a }
                java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x001a }
                kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ all -> 0x001a }
                r20 = r0
                r21 = r5
                r0 = 2
                r5 = 0
                r13 = 36
                java.lang.String r15 = HJ.C15854t.s1(r12, r13, r5, r0, r5)     // Catch:{ all -> 0x001a }
                r13 = 46
                java.lang.String r15 = HJ.C15854t.o1(r15, r13, r5, r0, r5)     // Catch:{ all -> 0x001a }
                int r17 = r15.length()     // Catch:{ all -> 0x001a }
                if (r17 != 0) goto L_0x021b
                goto L_0x021f
            L_0x021b:
                java.lang.String r12 = HJ.C15854t.P0(r15, r8)     // Catch:{ all -> 0x001a }
            L_0x021f:
                java.lang.Thread r15 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001a }
                java.lang.String r15 = r15.getName()     // Catch:{ all -> 0x001a }
                r0 = 1
                boolean r15 = HJ.C15854t.b0(r15, r7, r0)     // Catch:{ all -> 0x001a }
                if (r15 == 0) goto L_0x0230
                r15 = r6
                goto L_0x0232
            L_0x0230:
                r15 = r21
            L_0x0232:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
                r0.<init>()     // Catch:{ all -> 0x001a }
                r0.append(r15)     // Catch:{ all -> 0x001a }
                r0.append(r4)     // Catch:{ all -> 0x001a }
                r0.append(r12)     // Catch:{ all -> 0x001a }
                java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x001a }
                goto L_0x024c
            L_0x0245:
                r20 = r0
                r21 = r5
                r5 = 0
                r13 = 46
            L_0x024c:
                r17 = 0
                r0 = 0
                r15 = r9
                r16 = r12
                r18 = r0
                r19 = r11
                r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x001a }
                r13 = r5
                r0 = r20
                r5 = r21
                goto L_0x01c9
            L_0x0260:
                r3.z1(r2)     // Catch:{ all -> 0x001a }
            L_0x0263:
                Do.f r0 = r1.f79984h     // Catch:{ all -> 0x001a }
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "DELIVERY_EXPANDED_KEY"
                boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x001a }
                r0.x1(r2)     // Catch:{ all -> 0x001a }
                Do.f r0 = r1.f79984h     // Catch:{ all -> 0x001a }
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "FORCE_DELIVERY_EXPANDED_KEY"
                boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x001a }
                r0.y1(r2)     // Catch:{ all -> 0x001a }
                Do.f r0 = r1.f79984h     // Catch:{ all -> 0x001a }
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "SKIP_SELECT_DELIVERY_OPTION_KEY"
                boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x001a }
                r0.A1(r2)     // Catch:{ all -> 0x001a }
                Do.f r0 = r1.f79984h     // Catch:{ all -> 0x001a }
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "HAS_SELECTED_DELIVERY_OPTION_PUP_KEY"
                boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x001a }
                r0.f79889R0 = r2     // Catch:{ all -> 0x001a }
                Do.f r0 = r1.f79984h     // Catch:{ all -> 0x001a }
                android.os.Bundle r2 = r1.f79985i     // Catch:{ all -> 0x001a }
                java.lang.String r3 = "AREA_CODE_KEY"
                java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x001a }
                r0.f79893T0 = r2     // Catch:{ all -> 0x001a }
                Do.f r0 = r1.f79984h
                androidx.lifecycle.K r0 = r0.f79897Z
                Do.k r2 = Do.k.NONE
                r0.postValue(r2)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x02b2:
                Do.f r2 = r1.f79984h
                androidx.lifecycle.K r2 = r2.f79897Z
                Do.k r3 = Do.k.NONE
                r2.postValue(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Do.f.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Do/f$k", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f79986a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(N.a aVar, f fVar) {
            super(aVar);
            this.f79986a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f79986a;
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
                    String a10 = C11818a.a("Error saving time slot", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
            this.f79986a.f79892T.d(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$saveTimeSlot$2", f = "CheckoutViewModel.kt", l = {1175}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79987c;

        /* renamed from: d  reason: collision with root package name */
        Object f79988d;

        /* renamed from: e  reason: collision with root package name */
        Object f79989e;

        /* renamed from: f  reason: collision with root package name */
        Object f79990f;

        /* renamed from: g  reason: collision with root package name */
        int f79991g;

        /* renamed from: h  reason: collision with root package name */
        int f79992h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f79993i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f79994j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f79995k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f79996l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<C10800c> f79997m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar, String str, String str2, List<C10800c> list, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f79994j = fVar;
            this.f79995k = str;
            this.f79996l = str2;
            this.f79997m = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f79994j, this.f79995k, this.f79996l, this.f79997m, eVar);
            lVar.f79993i = obj;
            return lVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object f10 = C17187b.f();
            int i10 = this.f79992h;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f79993i;
                C16505B V10 = this.f79994j.f79895X;
                do {
                    value2 = V10.getValue();
                    ((Boolean) value2).booleanValue();
                } while (!V10.e(value2, kotlin.coroutines.jvm.internal.b.a(true)));
                Nn.K X02 = this.f79994j.X0();
                if (X02 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("SelectedDeliveryService should not be null here");
                    qv.e eVar = qv.e.ERROR;
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
                    this.f79994j.f79888R.d(new C10802e.c.b("SelectedDeliveryService should not be null here"));
                } else {
                    ko.g O10 = this.f79994j.f79906u;
                    String value4 = this.f79994j.H0().getValue();
                    if (value4 != null) {
                        String str5 = value4;
                        Map<String, String> b10 = this.f79994j.S0().b();
                        String str6 = this.f79995k;
                        String str7 = this.f79996l;
                        List<C10800c> list = this.f79997m;
                        this.f79993i = q10;
                        this.f79987c = X02;
                        this.f79988d = O10;
                        this.f79989e = str5;
                        this.f79990f = b10;
                        this.f79991g = 0;
                        this.f79992h = 1;
                        if (O10.a(str5, str6, str7, X02, b10, list, this) == f10) {
                            return f10;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else if (i10 == 1) {
                Map map = (Map) this.f79990f;
                String str8 = (String) this.f79989e;
                ko.g gVar = (ko.g) this.f79988d;
                Nn.K k10 = (Nn.K) this.f79987c;
                Q q11 = (Q) this.f79993i;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B V11 = this.f79994j.f79895X;
                    do {
                        value3 = V11.getValue();
                        ((Boolean) value3).booleanValue();
                    } while (!V11.e(value3, kotlin.coroutines.jvm.internal.b.a(false)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B V12 = this.f79994j.f79895X;
            do {
                value = V12.getValue();
                ((Boolean) value).booleanValue();
            } while (!V12.e(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Do/f$m", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f79998a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(N.a aVar, f fVar) {
            super(aVar);
            this.f79998a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f79998a;
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
                    String a10 = C11818a.a("Error selecting delivery option", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
            this.f79998a.f79897Z.postValue(k.NONE);
            this.f79998a.f79888R.e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$selectDeliveryOption$2", f = "CheckoutViewModel.kt", l = {590}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79999c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f80000d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ho.b f80001e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar, ho.b bVar, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f80000d = fVar;
            this.f80001e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f80000d, this.f80001e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f79999c;
            if (i10 == 0) {
                y.b(obj);
                this.f80000d.f79897Z.postValue(k.UPDATE_DELIVERY_OPTION);
                f fVar = this.f80000d;
                Object value = fVar.f79860D.getValue();
                if (value != null) {
                    ho.b bVar = this.f80001e;
                    this.f79999c = 1;
                    if (fVar.s0((String) value, bVar, (l.a) null, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f80000d.f79897Z.postValue(k.NONE);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {1304}, m = "selectEarliestTimeWindow")
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80002c;

        /* renamed from: d  reason: collision with root package name */
        Object f80003d;

        /* renamed from: e  reason: collision with root package name */
        Object f80004e;

        /* renamed from: f  reason: collision with root package name */
        Object f80005f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f80006g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f80007h;

        /* renamed from: i  reason: collision with root package name */
        int f80008i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(f fVar, C17164e<? super o> eVar) {
            super(eVar);
            this.f80007h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80006g = obj;
            this.f80008i |= Integer.MIN_VALUE;
            return this.f80007h.v1((String) null, (b.C1881b) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LNn/f;", "checkoutHolder", "LDo/a;", "kotlin.jvm.PlatformType", "step", "", "isShown", "<anonymous>", "(LNn/f;LDo/a;Z)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$showCouponRemovedWarning$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.r<C10803f, a, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80009c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80010d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80011e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f80012f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f80013g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(f fVar, C17164e<? super p> eVar) {
            super(4, eVar);
            this.f80013g = fVar;
        }

        public final Object i(C10803f fVar, a aVar, boolean z10, C17164e<? super Boolean> eVar) {
            p pVar = new p(this.f80013g, eVar);
            pVar.f80010d = fVar;
            pVar.f80011e = aVar;
            pVar.f80012f = z10;
            return pVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C10806i h10;
            C17187b.f();
            if (this.f80009c == 0) {
                y.b(obj);
                C10803f fVar = (C10803f) this.f80010d;
                a aVar = (a) this.f80011e;
                boolean z10 = false;
                if (this.f80012f) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                Double d10 = null;
                if (aVar.a() < 6) {
                    return null;
                }
                String f10 = this.f80013g.f79912z.f();
                boolean z11 = f10 == null || f10.length() == 0;
                if (!(fVar == null || (h10 = fVar.h()) == null)) {
                    d10 = h10.c();
                }
                boolean a10 = ip.g.a(d10, 0.0d);
                if (!z11 && !a10) {
                    z10 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((C10803f) obj, (a) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$special$$inlined$flatMapLatest$1", f = "CheckoutViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class q extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C10803f>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80014c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f80015d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80016e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f80017f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f80017f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C10803f> hVar, String str, C17164e<? super C16807N> eVar) {
            q qVar = new q(eVar, this.f80017f);
            qVar.f80015d = hVar;
            qVar.f80016e = str;
            return qVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80014c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f80015d;
                String str = (String) this.f80016e;
                C16532g a10 = (str == null || str.length() == 0) ? C16521S.a(null) : this.f80017f.f79899n.q(str);
                this.f80014c = 1;
                if (C16534i.x(hVar, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$special$$inlined$flatMapLatest$2", f = "CheckoutViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class r extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super RC.m>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80018c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f80019d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80020e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f80021f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f80021f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super RC.m> hVar, String str, C17164e<? super C16807N> eVar) {
            r rVar = new r(eVar, this.f80021f);
            rVar.f80019d = hVar;
            rVar.f80020e = str;
            return rVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80018c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f80019d;
                String str = (String) this.f80020e;
                C16532g a10 = (str == null || str.length() == 0) ? C16521S.a(null) : this.f80021f.f79907v.a(str);
                this.f80018c = 1;
                if (C16534i.x(hVar, a10, this) == f10) {
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
    public static final class s implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80022a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80023a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$special$$inlined$map$1$2", f = "CheckoutViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Do.f$s$a$a  reason: collision with other inner class name */
            public static final class C1506a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80024c;

                /* renamed from: d  reason: collision with root package name */
                int f80025d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f80026e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1506a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80026e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80024c = obj;
                    this.f80025d |= Integer.MIN_VALUE;
                    return this.f80026e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f80023a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Do.f.s.a.C1506a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Do.f$s$a$a r0 = (Do.f.s.a.C1506a) r0
                    int r1 = r0.f80025d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f80025d = r1
                    goto L_0x0018
                L_0x0013:
                    Do.f$s$a$a r0 = new Do.f$s$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f80024c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f80025d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0046
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f80023a
                    RC.m r5 = (RC.m) r5
                    Do.c r2 = new Do.c
                    r2.<init>(r5)
                    r0.f80025d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0046
                    return r1
                L_0x0046:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Do.f.s.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public s(C16532g gVar) {
            this.f80022a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80022a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {1361}, m = "trySelectPreferredDelivery")
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80027c;

        /* renamed from: d  reason: collision with root package name */
        Object f80028d;

        /* renamed from: e  reason: collision with root package name */
        Object f80029e;

        /* renamed from: f  reason: collision with root package name */
        Object f80030f;

        /* renamed from: g  reason: collision with root package name */
        Object f80031g;

        /* renamed from: h  reason: collision with root package name */
        Object f80032h;

        /* renamed from: i  reason: collision with root package name */
        Object f80033i;

        /* renamed from: j  reason: collision with root package name */
        Object f80034j;

        /* renamed from: k  reason: collision with root package name */
        Object f80035k;

        /* renamed from: l  reason: collision with root package name */
        Object f80036l;

        /* renamed from: m  reason: collision with root package name */
        Object f80037m;

        /* renamed from: n  reason: collision with root package name */
        Object f80038n;

        /* renamed from: o  reason: collision with root package name */
        Object f80039o;

        /* renamed from: p  reason: collision with root package name */
        Object f80040p;

        /* renamed from: q  reason: collision with root package name */
        Object f80041q;

        /* renamed from: r  reason: collision with root package name */
        Object f80042r;

        /* renamed from: s  reason: collision with root package name */
        int f80043s;

        /* renamed from: t  reason: collision with root package name */
        int f80044t;

        /* renamed from: u  reason: collision with root package name */
        int f80045u;

        /* renamed from: v  reason: collision with root package name */
        int f80046v;

        /* renamed from: w  reason: collision with root package name */
        int f80047w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f80048x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ f f80049y;

        /* renamed from: z  reason: collision with root package name */
        int f80050z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(f fVar, C17164e<? super t> eVar) {
            super(eVar);
            this.f80049y = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80048x = obj;
            this.f80050z |= Integer.MIN_VALUE;
            return this.f80049y.D1((String) null, (List<b.C2205b>) null, (List<b.a>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Do/f$u", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80051a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(N.a aVar, f fVar) {
            super(aVar);
            this.f80051a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f80051a;
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
                    String a10 = C11818a.a("Unable to zip in", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
            this.f80051a.p1(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel$zipInAndGetDelivery$3", f = "CheckoutViewModel.kt", l = {392, 406, 440, 450, 458}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80052c;

        /* renamed from: d  reason: collision with root package name */
        Object f80053d;

        /* renamed from: e  reason: collision with root package name */
        Object f80054e;

        /* renamed from: f  reason: collision with root package name */
        Object f80055f;

        /* renamed from: g  reason: collision with root package name */
        Object f80056g;

        /* renamed from: h  reason: collision with root package name */
        Object f80057h;

        /* renamed from: i  reason: collision with root package name */
        int f80058i;

        /* renamed from: j  reason: collision with root package name */
        int f80059j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ f f80060k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f80061l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f80062m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ m f80063n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(f fVar, boolean z10, String str, m mVar, C17164e<? super v> eVar) {
            super(2, eVar);
            this.f80060k = fVar;
            this.f80061l = z10;
            this.f80062m = str;
            this.f80063n = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new v(this.f80060k, this.f80061l, this.f80062m, this.f80063n, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((v) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0149  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f80059j
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L_0x0050
                if (r2 == r7) goto L_0x004a
                if (r2 == r6) goto L_0x003f
                if (r2 == r5) goto L_0x0022
                if (r2 == r4) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                goto L_0x0022
            L_0x001a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0022:
                java.lang.Object r1 = r0.f80057h
                Do.l r1 = (Do.l) r1
                java.lang.Object r1 = r0.f80056g
                Do.l r1 = (Do.l) r1
                java.lang.Object r1 = r0.f80055f
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f80054e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f80053d
                Nn.f r1 = (Nn.C10803f) r1
                java.lang.Object r1 = r0.f80052c
                java.lang.String r1 = (java.lang.String) r1
                XH.y.b(r20)
                goto L_0x01a7
            L_0x003f:
                java.lang.Object r2 = r0.f80052c
                java.lang.String r2 = (java.lang.String) r2
                XH.y.b(r20)
                r3 = r20
                goto L_0x00cf
            L_0x004a:
                XH.y.b(r20)
                r2 = r20
                goto L_0x0066
            L_0x0050:
                XH.y.b(r20)
                Do.f r2 = r0.f80060k
                Mn.c r8 = r2.f79912z
                java.lang.String r8 = r8.g()
                r0.f80059j = r7
                java.lang.Object r2 = r2.t0(r8, r0)
                if (r2 != r1) goto L_0x0066
                return r1
            L_0x0066:
                java.lang.String r2 = (java.lang.String) r2
                Do.f r15 = r0.f80060k
                Mn.c r7 = r15.f79912z
                r16 = 239(0xef, float:3.35E-43)
                r17 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r14 = 0
                r18 = 0
                r12 = r2
                r3 = r15
                r15 = r18
                Mn.c r7 = Mn.c.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r3.w1(r7)
                boolean r3 = r0.f80061l
                if (r3 == 0) goto L_0x00bc
                Do.f r3 = r0.f80060k
                Wn.b r3 = r3.f79900o
                Do.f r7 = r0.f80060k
                Il.a r7 = r7.f79902q
                kp.d r7 = r7.s()
                java.lang.String r7 = r7.b()
                Do.f r8 = r0.f80060k
                Mn.c r8 = r8.f79912z
                Mn.c$a r8 = r8.c()
                double r8 = r8.b()
                Do.f r10 = r0.f80060k
                Mn.c r10 = r10.f79912z
                Mn.c$a r10 = r10.c()
                java.util.List r10 = r10.a()
                r3.A(r7, r10, r8)
            L_0x00bc:
                Do.f r3 = r0.f80060k
                boolean r7 = r0.f80061l
                java.lang.String r8 = r0.f80062m
                Do.m r9 = r0.f80063n
                r0.f80052c = r2
                r0.f80059j = r6
                java.lang.Object r3 = r3.L1(r7, r8, r9, r0)
                if (r3 != r1) goto L_0x00cf
                return r1
            L_0x00cf:
                Nn.f r3 = (Nn.C10803f) r3
                Do.f r6 = r0.f80060k
                TJ.B r6 = r6.f79860D
            L_0x00d7:
                java.lang.Object r7 = r6.getValue()
                r8 = r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = r3.c()
                boolean r7 = r6.e(r7, r8)
                if (r7 == 0) goto L_0x00d7
                Do.f r6 = r0.f80060k
                java.util.List r7 = r3.g()
                r6.F1(r7)
                java.util.List r6 = r3.f()
                r7 = 0
                java.util.List r6 = Co.c.r(r6, r7)
                java.util.List r8 = r3.d()
                java.util.List r8 = Co.c.p(r8, r7)
                Do.f r9 = r0.f80060k
                Do.m r10 = r0.f80063n
                Do.l r9 = r9.v0(r6, r8, r10)
                boolean r10 = r9 instanceof Do.l.a
                r11 = 0
                if (r10 == 0) goto L_0x0149
                Do.f r4 = r0.f80060k
                androidx.lifecycle.K r4 = r4.f79897Z
                Do.k r7 = Do.k.UPDATE_DELIVERY_OPTION
                r4.postValue(r7)
                Do.f r4 = r0.f80060k
                androidx.lifecycle.K r4 = r4.f79867G0
                Do.a$g r7 = Do.a.g.f79841a
                r4.postValue(r7)
                Do.f r4 = r0.f80060k
                java.lang.String r7 = r3.c()
                r10 = r9
                Do.l$a r10 = (Do.l.a) r10
                ho.b r12 = r10.a()
                r0.f80052c = r2
                r0.f80053d = r3
                r0.f80054e = r6
                r0.f80055f = r8
                r0.f80056g = r9
                r0.f80057h = r9
                r0.f80058i = r11
                r0.f80059j = r5
                java.lang.Object r2 = r4.s0(r7, r12, r10, r0)
                if (r2 != r1) goto L_0x01a7
                return r1
            L_0x0149:
                boolean r5 = r9 instanceof Do.l.b
                if (r5 == 0) goto L_0x0187
                Do.f r5 = r0.f80060k
                androidx.lifecycle.K r5 = r5.f79897Z
                Do.k r10 = Do.k.UPDATE_DELIVERY_OPTION
                r5.postValue(r10)
                Do.f r5 = r0.f80060k
                androidx.lifecycle.K r5 = r5.f79867G0
                Do.a$g r10 = Do.a.g.f79841a
                r5.postValue(r10)
                Do.f r5 = r0.f80060k
                java.lang.String r10 = r3.c()
                r12 = r9
                Do.l$b r12 = (Do.l.b) r12
                ho.b r12 = r12.a()
                r0.f80052c = r2
                r0.f80053d = r3
                r0.f80054e = r6
                r0.f80055f = r8
                r0.f80056g = r9
                r0.f80057h = r9
                r0.f80058i = r11
                r0.f80059j = r4
                java.lang.Object r2 = r5.s0(r10, r12, r7, r0)
                if (r2 != r1) goto L_0x01a7
                return r1
            L_0x0187:
                if (r9 != 0) goto L_0x01b5
                Do.f r4 = r0.f80060k
                java.lang.String r5 = r3.c()
                r0.f80052c = r2
                r0.f80053d = r3
                r0.f80054e = r6
                r0.f80055f = r8
                r0.f80056g = r9
                r0.f80057h = r9
                r0.f80058i = r11
                r7 = 5
                r0.f80059j = r7
                java.lang.Object r2 = r4.D1(r5, r6, r8, r0)
                if (r2 != r1) goto L_0x01a7
                return r1
            L_0x01a7:
                Do.f r1 = r0.f80060k
                androidx.lifecycle.K r1 = r1.f79897Z
                Do.k r2 = Do.k.NONE
                r1.postValue(r2)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x01b5:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Do.f.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {496}, m = "zipInOrResumeCheckout")
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        int f80064A;

        /* renamed from: B  reason: collision with root package name */
        int f80065B;

        /* renamed from: C  reason: collision with root package name */
        /* synthetic */ Object f80066C;

        /* renamed from: D  reason: collision with root package name */
        final /* synthetic */ f f80067D;

        /* renamed from: E  reason: collision with root package name */
        int f80068E;

        /* renamed from: c  reason: collision with root package name */
        Object f80069c;

        /* renamed from: d  reason: collision with root package name */
        Object f80070d;

        /* renamed from: e  reason: collision with root package name */
        Object f80071e;

        /* renamed from: f  reason: collision with root package name */
        Object f80072f;

        /* renamed from: g  reason: collision with root package name */
        Object f80073g;

        /* renamed from: h  reason: collision with root package name */
        Object f80074h;

        /* renamed from: i  reason: collision with root package name */
        Object f80075i;

        /* renamed from: j  reason: collision with root package name */
        Object f80076j;

        /* renamed from: k  reason: collision with root package name */
        Object f80077k;

        /* renamed from: l  reason: collision with root package name */
        Object f80078l;

        /* renamed from: m  reason: collision with root package name */
        Object f80079m;

        /* renamed from: n  reason: collision with root package name */
        Object f80080n;

        /* renamed from: o  reason: collision with root package name */
        Object f80081o;

        /* renamed from: p  reason: collision with root package name */
        Object f80082p;

        /* renamed from: q  reason: collision with root package name */
        Object f80083q;

        /* renamed from: r  reason: collision with root package name */
        Object f80084r;

        /* renamed from: s  reason: collision with root package name */
        Object f80085s;

        /* renamed from: t  reason: collision with root package name */
        Object f80086t;

        /* renamed from: u  reason: collision with root package name */
        Object f80087u;

        /* renamed from: v  reason: collision with root package name */
        Object f80088v;

        /* renamed from: w  reason: collision with root package name */
        Object f80089w;

        /* renamed from: x  reason: collision with root package name */
        boolean f80090x;

        /* renamed from: y  reason: collision with root package name */
        boolean f80091y;

        /* renamed from: z  reason: collision with root package name */
        int f80092z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(f fVar, C17164e<? super w> eVar) {
            super(eVar);
            this.f80067D = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80066C = obj;
            this.f80068E |= Integer.MIN_VALUE;
            return this.f80067D.L1(false, (String) null, (m) null, this);
        }
    }

    public f(U u10, x xVar, Wn.b bVar, C13909a aVar, Il.a aVar2, C14762d dVar, C11892a aVar3, C10253a aVar4, Ur.a aVar5, ko.g gVar, C12290a aVar6, Vn.b bVar2, C12294e eVar, C12292c cVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(bVar, "analytics");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(dVar, "getProfile");
        C17542s.j(aVar3, "mCommerceConfigRepository");
        C17542s.j(aVar4, "killSwitch");
        C17542s.j(aVar5, "googlePayUseCase");
        C17542s.j(gVar, "saveTimeSlotUseCase");
        C17542s.j(aVar6, "getCheckoutPriceUiStateUseCase");
        C17542s.j(bVar2, "selectEarliestTimeWindowUseCase");
        C17542s.j(eVar, "trackOnlinePurchaseUseCase");
        C17542s.j(cVar, "getDeliveryMethodUiStateUseCase");
        this.f79898m = u10;
        this.f79899n = xVar;
        this.f79900o = bVar;
        this.f79901p = aVar;
        this.f79902q = aVar2;
        this.f79903r = dVar;
        this.f79904s = aVar4;
        this.f79905t = aVar5;
        this.f79906u = gVar;
        this.f79907v = aVar6;
        this.f79908w = bVar2;
        this.f79909x = eVar;
        this.f79910y = cVar;
        Object f10 = u10.f("INITIAL_CHECKOUT_DATA_KEY");
        if (f10 != null) {
            Mn.c cVar2 = (Mn.c) f10;
            this.f79912z = cVar2;
            this.f79854A = cVar2.i();
            ArrayList arrayList = new ArrayList();
            this.f79856B = arrayList;
            this.f79858C = arrayList;
            C16505B<String> a10 = C16521S.a(null);
            this.f79860D = a10;
            this.f79862E = a10;
            F<C10803f> c10 = C5210m.c(C16534i.g0(a10, new q((C17164e) null, this)), (C17168i) null, 0, 3, (Object) null);
            this.f79864F = c10;
            this.f79866G = C11892a.C2450a.a(aVar3, false, 1, (Object) null);
            C11410b<Boolean> bVar3 = new C11410b<>();
            this.f79868H = bVar3;
            this.f79870I = bVar3;
            C11410b<n> bVar4 = new C11410b<>();
            this.f79872J = bVar4;
            this.f79874K = bVar4;
            C11410b<C10812o.d> bVar5 = new C11410b<>();
            this.f79876L = bVar5;
            this.f79878M = bVar5;
            C11410b<P> bVar6 = new C11410b<>();
            this.f79884P = bVar6;
            this.f79886Q = bVar6;
            C11410b<Throwable> bVar7 = new C11410b<>();
            this.f79888R = bVar7;
            this.f79890S = bVar7;
            C11410b<Throwable> bVar8 = new C11410b<>();
            this.f79892T = bVar8;
            this.f79894U = bVar8;
            Boolean bool = Boolean.FALSE;
            C16505B<Boolean> a11 = C16521S.a(bool);
            this.f79895X = a11;
            this.f79896Y = a11;
            K<k> k10 = new K<>();
            this.f79897Z = k10;
            K<C10802e.a> k11 = new K<>();
            this.f79859C0 = k11;
            this.f79861D0 = k11;
            this.f79863E0 = C16521S.a(null);
            this.f79865F0 = a.b.C1863b.f88440a;
            K<a> k12 = new K<>();
            this.f79867G0 = k12;
            this.f79869H0 = C16534i.c0(new s(C16534i.g0(a10, new r((C17164e) null, this))), g0.a(this), ip.f.a(), new c((RC.m) null));
            I<b> i10 = new I<>();
            i10.b(k12, new g.a(new d(i10)));
            i10.b(k10, new g.a(new e(this, i10)));
            this.f79871I0 = i10;
            C16505B<Boolean> a12 = C16521S.a(bool);
            this.f79879M0 = a12;
            this.f79881N0 = C16534i.s(C16534i.A(C16534i.m(C5210m.a(c10), C5210m.a(k12), a12, new p(this, (C17164e<? super p>) null))));
            this.f79883O0 = true;
            Mn.c cVar3 = (Mn.c) u10.f("KEY_CHECKOUT_DATA");
            w1(cVar3 == null ? this.f79912z : cVar3);
            List list = (List) u10.f("KEY_CHECKOUT_PRODUCT_DATA");
            if (list != null) {
                arrayList.clear();
                arrayList.addAll(list);
            }
            F1(arrayList);
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x027d A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x030d A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0313 A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x030b A[EDGE_INSN: B:207:0x030b->B:123:0x030b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022e A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237 A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023e A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025f A[Catch:{ Exception -> 0x0234 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D1(java.lang.String r36, java.util.List<ho.b.C2205b> r37, java.util.List<ho.b.a> r38, dI.C17164e<? super XH.C16807N> r39) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r6 = 1
            boolean r8 = r4 instanceof Do.f.t
            if (r8 == 0) goto L_0x001e
            r8 = r4
            Do.f$t r8 = (Do.f.t) r8
            int r9 = r8.f80050z
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L_0x001e
            int r9 = r9 - r10
            r8.f80050z = r9
            goto L_0x0023
        L_0x001e:
            Do.f$t r8 = new Do.f$t
            r8.<init>(r1, r4)
        L_0x0023:
            java.lang.Object r9 = r8.f80048x
            java.lang.Object r10 = eI.C17187b.f()
            int r11 = r8.f80050z
            java.lang.String r12 = "|"
            java.lang.String r13 = "b"
            java.lang.String r14 = "m"
            java.lang.String r15 = "main"
            java.lang.String r5 = "Kt"
            java.lang.Class<Do.f> r19 = Do.f.class
            if (r11 == 0) goto L_0x0092
            if (r11 != r6) goto L_0x008a
            java.lang.Object r0 = r8.f80041q
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r8.f80040p
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r8.f80039o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r8.f80038n
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r8.f80037m
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r8.f80036l
            Do.f r0 = (Do.f) r0
            java.lang.Object r0 = r8.f80035k
            Do.l r0 = (Do.l) r0
            java.lang.Object r0 = r8.f80034j
            Yn.P r0 = (Yn.P) r0
            java.lang.Object r2 = r8.f80033i
            Do.l r2 = (Do.l) r2
            java.lang.Object r2 = r8.f80032h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r8.f80031g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r8.f80030f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r8.f80029e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r8.f80028d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r8.f80027c
            Do.f r3 = (Do.f) r3
            XH.y.b(r9)     // Catch:{ Exception -> 0x0083 }
            r30 = r0
            r0 = r2
            r26 = r13
            r27 = r14
            goto L_0x0226
        L_0x0083:
            r0 = move-exception
            r26 = r13
            r27 = r14
            goto L_0x0419
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0092:
            XH.y.b(r9)
            r9 = 2
            java.util.List[] r11 = new java.util.List[r9]
            r9 = 0
            r11[r9] = r2
            r11[r6] = r3
            java.util.List r9 = YH.C16877v.q(r11)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = YH.C16877v.A(r9)
            Do.l r11 = Do.g.e(r9)     // Catch:{ Exception -> 0x0414 }
            qv.e r6 = qv.e.DEBUG     // Catch:{ Exception -> 0x0414 }
            qv.d r20 = qv.d.f102012a     // Catch:{ Exception -> 0x0414 }
            java.util.List r20 = r20.a()     // Catch:{ Exception -> 0x0414 }
            java.lang.Iterable r20 = (java.lang.Iterable) r20     // Catch:{ Exception -> 0x0414 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0414 }
            r7.<init>()     // Catch:{ Exception -> 0x0414 }
            java.util.Iterator r20 = r20.iterator()     // Catch:{ Exception -> 0x0414 }
        L_0x00be:
            boolean r21 = r20.hasNext()     // Catch:{ Exception -> 0x0414 }
            if (r21 == 0) goto L_0x00ea
            r26 = r13
            java.lang.Object r13 = r20.next()     // Catch:{ Exception -> 0x00e6 }
            r27 = r14
            r14 = r13
            qv.b r14 = (qv.C11819b) r14     // Catch:{ Exception -> 0x00e2 }
            r28 = r10
            r10 = 0
            boolean r14 = r14.b(r6, r10)     // Catch:{ Exception -> 0x00e2 }
            if (r14 == 0) goto L_0x00db
            r7.add(r13)     // Catch:{ Exception -> 0x00e2 }
        L_0x00db:
            r13 = r26
            r14 = r27
            r10 = r28
            goto L_0x00be
        L_0x00e2:
            r0 = move-exception
        L_0x00e3:
            r3 = r1
            goto L_0x0419
        L_0x00e6:
            r0 = move-exception
        L_0x00e7:
            r27 = r14
            goto L_0x00e3
        L_0x00ea:
            r28 = r10
            r26 = r13
            r27 = r14
            java.util.Iterator r10 = r7.iterator()     // Catch:{ Exception -> 0x00e2 }
            r20 = r7
            r13 = 0
            r14 = 0
        L_0x00f8:
            boolean r21 = r10.hasNext()     // Catch:{ Exception -> 0x00e2 }
            if (r21 == 0) goto L_0x01a1
            java.lang.Object r29 = r10.next()     // Catch:{ Exception -> 0x00e2 }
            r20 = r29
            qv.b r20 = (qv.C11819b) r20     // Catch:{ Exception -> 0x00e2 }
            r30 = r10
            r31 = r7
            if (r13 != 0) goto L_0x0137
            if (r11 == 0) goto L_0x0110
            r10 = 1
            goto L_0x0111
        L_0x0110:
            r10 = 0
        L_0x0111:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r7.<init>()     // Catch:{ Exception -> 0x00e2 }
            r21 = r13
            java.lang.String r13 = "Try select preferred delivery, has delivery: "
            r7.append(r13)     // Catch:{ Exception -> 0x00e2 }
            r7.append(r10)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00e2 }
            r10 = 0
            java.lang.String r7 = qv.C11818a.a(r7, r10)     // Catch:{ Exception -> 0x00e2 }
            if (r7 != 0) goto L_0x0131
            r32 = r9
            r4 = r29
            goto L_0x01ab
        L_0x0131:
            java.lang.String r7 = qv.C11820c.a(r7)     // Catch:{ Exception -> 0x00e2 }
            r13 = r7
            goto L_0x0139
        L_0x0137:
            r21 = r13
        L_0x0139:
            if (r14 != 0) goto L_0x0185
            java.lang.String r7 = r19.getName()     // Catch:{ Exception -> 0x00e2 }
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ Exception -> 0x00e2 }
            r32 = r9
            r9 = 2
            r10 = 36
            r14 = 0
            java.lang.String r4 = HJ.C15854t.s1(r7, r10, r14, r9, r14)     // Catch:{ Exception -> 0x00e2 }
            r10 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r10, r14, r9, r14)     // Catch:{ Exception -> 0x00e2 }
            int r9 = r4.length()     // Catch:{ Exception -> 0x00e2 }
            if (r9 != 0) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            java.lang.String r7 = HJ.C15854t.P0(r4, r5)     // Catch:{ Exception -> 0x00e2 }
        L_0x015d:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x00e2 }
            r9 = 1
            boolean r4 = HJ.C15854t.b0(r4, r15, r9)     // Catch:{ Exception -> 0x00e2 }
            if (r4 == 0) goto L_0x016f
            r4 = r27
            goto L_0x0171
        L_0x016f:
            r4 = r26
        L_0x0171:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r9.<init>()     // Catch:{ Exception -> 0x00e2 }
            r9.append(r4)     // Catch:{ Exception -> 0x00e2 }
            r9.append(r12)     // Catch:{ Exception -> 0x00e2 }
            r9.append(r7)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x00e2 }
            r14 = r4
            goto L_0x0187
        L_0x0185:
            r32 = r9
        L_0x0187:
            r23 = 0
            r21 = r6
            r22 = r14
            r4 = 0
            r24 = r4
            r25 = r13
            r20.a(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00e2 }
            r4 = r39
            r20 = r29
            r10 = r30
            r7 = r31
            r9 = r32
            goto L_0x00f8
        L_0x01a1:
            r31 = r7
            r32 = r9
            r30 = r10
            r21 = r13
            r4 = r20
        L_0x01ab:
            if (r11 != 0) goto L_0x01ba
            androidx.lifecycle.K<Do.a> r0 = r1.f79867G0     // Catch:{ Exception -> 0x00e2 }
            Do.a$f r4 = Do.a.f.f79839a     // Catch:{ Exception -> 0x00e2 }
            r0.postValue(r4)     // Catch:{ Exception -> 0x00e2 }
            r1.j0(r2, r3)     // Catch:{ Exception -> 0x00e2 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x00e2 }
            return r0
        L_0x01ba:
            boolean r7 = r11 instanceof Do.l.a     // Catch:{ Exception -> 0x00e2 }
            if (r7 == 0) goto L_0x01c1
            Yn.P r7 = Yn.P.COLLECT     // Catch:{ Exception -> 0x00e2 }
            goto L_0x01c7
        L_0x01c1:
            boolean r7 = r11 instanceof Do.l.b     // Catch:{ Exception -> 0x00e2 }
            if (r7 == 0) goto L_0x040e
            Yn.P r7 = Yn.P.HOME_DELIVERY     // Catch:{ Exception -> 0x00e2 }
        L_0x01c7:
            r1.z1(r7)     // Catch:{ Exception -> 0x00e2 }
            androidx.lifecycle.K<Do.a> r9 = r1.f79867G0     // Catch:{ Exception -> 0x00e2 }
            Do.a$g r10 = Do.a.g.f79841a     // Catch:{ Exception -> 0x00e2 }
            r9.postValue(r10)     // Catch:{ Exception -> 0x00e2 }
            ho.b r9 = r11.a()     // Catch:{ Exception -> 0x00e2 }
            boolean r10 = r11 instanceof Do.l.a     // Catch:{ Exception -> 0x00e2 }
            if (r10 == 0) goto L_0x01dd
            r10 = r11
            Do.l$a r10 = (Do.l.a) r10     // Catch:{ Exception -> 0x00e2 }
            goto L_0x01e2
        L_0x01dd:
            boolean r10 = r11 instanceof Do.l.b     // Catch:{ Exception -> 0x00e2 }
            if (r10 == 0) goto L_0x0408
            r10 = 0
        L_0x01e2:
            r8.f80027c = r1     // Catch:{ Exception -> 0x00e2 }
            r8.f80028d = r0     // Catch:{ Exception -> 0x00e2 }
            r8.f80029e = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80030f = r3     // Catch:{ Exception -> 0x00e2 }
            r2 = r39
            r8.f80031g = r2     // Catch:{ Exception -> 0x00e2 }
            r2 = r32
            r8.f80032h = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80033i = r11     // Catch:{ Exception -> 0x00e2 }
            r8.f80034j = r7     // Catch:{ Exception -> 0x00e2 }
            r8.f80035k = r11     // Catch:{ Exception -> 0x00e2 }
            r8.f80036l = r1     // Catch:{ Exception -> 0x00e2 }
            r8.f80037m = r6     // Catch:{ Exception -> 0x00e2 }
            r13 = r21
            r8.f80038n = r13     // Catch:{ Exception -> 0x00e2 }
            r8.f80039o = r14     // Catch:{ Exception -> 0x00e2 }
            r2 = r31
            r8.f80040p = r2     // Catch:{ Exception -> 0x00e2 }
            r2 = r30
            r8.f80041q = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80042r = r4     // Catch:{ Exception -> 0x00e2 }
            r2 = 0
            r8.f80043s = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80044t = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80045u = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80046v = r2     // Catch:{ Exception -> 0x00e2 }
            r8.f80047w = r2     // Catch:{ Exception -> 0x00e2 }
            r2 = 1
            r8.f80050z = r2     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object r2 = r1.s0(r0, r9, r10, r8)     // Catch:{ Exception -> 0x00e2 }
            r3 = r28
            if (r2 != r3) goto L_0x0223
            return r3
        L_0x0223:
            r3 = r1
            r30 = r7
        L_0x0226:
            Nn.x r2 = r3.f79899n     // Catch:{ Exception -> 0x0234 }
            Nn.f r0 = r2.s(r0)     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x0237
            Nn.K r0 = r0.i()     // Catch:{ Exception -> 0x0234 }
            r14 = r0
            goto L_0x0238
        L_0x0234:
            r0 = move-exception
            goto L_0x0419
        L_0x0237:
            r14 = 0
        L_0x0238:
            boolean r0 = Co.c.l(r14)     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x0245
            boolean r0 = r3.f79885P0     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r0 = 0
            goto L_0x0246
        L_0x0245:
            r0 = 1
        L_0x0246:
            qv.e r2 = qv.e.DEBUG     // Catch:{ Exception -> 0x0234 }
            qv.d r4 = qv.d.f102012a     // Catch:{ Exception -> 0x0234 }
            java.util.List r4 = r4.a()     // Catch:{ Exception -> 0x0234 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x0234 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234 }
            r6.<init>()     // Catch:{ Exception -> 0x0234 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0234 }
        L_0x0259:
            boolean r7 = r4.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r7 == 0) goto L_0x0271
            java.lang.Object r7 = r4.next()     // Catch:{ Exception -> 0x0234 }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ Exception -> 0x0234 }
            r9 = 0
            boolean r8 = r8.b(r2, r9)     // Catch:{ Exception -> 0x0234 }
            if (r8 == 0) goto L_0x0259
            r6.add(r7)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0259
        L_0x0271:
            java.util.Iterator r4 = r6.iterator()     // Catch:{ Exception -> 0x0234 }
            r6 = 0
            r7 = 0
        L_0x0277:
            boolean r8 = r4.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r8 == 0) goto L_0x030b
            java.lang.Object r8 = r4.next()     // Catch:{ Exception -> 0x0234 }
            qv.b r8 = (qv.C11819b) r8     // Catch:{ Exception -> 0x0234 }
            r10 = 0
            if (r6 != 0) goto L_0x02ae
            boolean r6 = r3.f79885P0     // Catch:{ Exception -> 0x0234 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r9.<init>()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r11 = "Collapsed: prevented: "
            r9.append(r11)     // Catch:{ Exception -> 0x0234 }
            r9.append(r0)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r11 = ", forceExpand: "
            r9.append(r11)     // Catch:{ Exception -> 0x0234 }
            r9.append(r6)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r6 = qv.C11818a.a(r6, r10)     // Catch:{ Exception -> 0x0234 }
            if (r6 != 0) goto L_0x02aa
            goto L_0x030b
        L_0x02aa:
            java.lang.String r6 = qv.C11820c.a(r6)     // Catch:{ Exception -> 0x0234 }
        L_0x02ae:
            r13 = r6
            if (r7 != 0) goto L_0x02fa
            java.lang.String r6 = r19.getName()     // Catch:{ Exception -> 0x0234 }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ Exception -> 0x0234 }
            r7 = 36
            r9 = 0
            r11 = 2
            java.lang.String r10 = HJ.C15854t.s1(r6, r7, r9, r11, r9)     // Catch:{ Exception -> 0x0234 }
            r7 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r7, r9, r11, r9)     // Catch:{ Exception -> 0x0234 }
            int r7 = r10.length()     // Catch:{ Exception -> 0x0234 }
            if (r7 != 0) goto L_0x02cd
            goto L_0x02d1
        L_0x02cd:
            java.lang.String r6 = HJ.C15854t.P0(r10, r5)     // Catch:{ Exception -> 0x0234 }
        L_0x02d1:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x0234 }
            r9 = 1
            boolean r7 = HJ.C15854t.b0(r7, r15, r9)     // Catch:{ Exception -> 0x0234 }
            if (r7 == 0) goto L_0x02e3
            r7 = r27
            goto L_0x02e5
        L_0x02e3:
            r7 = r26
        L_0x02e5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r9.<init>()     // Catch:{ Exception -> 0x0234 }
            r9.append(r7)     // Catch:{ Exception -> 0x0234 }
            r9.append(r12)     // Catch:{ Exception -> 0x0234 }
            r9.append(r6)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x0234 }
            r20 = r6
            goto L_0x02fc
        L_0x02fa:
            r20 = r7
        L_0x02fc:
            r9 = 0
            r6 = r8
            r7 = r2
            r8 = r20
            r10 = 0
            r11 = r13
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0234 }
            r6 = r13
            r7 = r20
            goto L_0x0277
        L_0x030b:
            if (r0 == 0) goto L_0x0313
            r2 = 1
            r3.y1(r2)     // Catch:{ Exception -> 0x0234 }
            goto L_0x04d9
        L_0x0313:
            r2 = 0
            r3.f79883O0 = r2     // Catch:{ Exception -> 0x0234 }
            qv.e r0 = qv.e.DEBUG     // Catch:{ Exception -> 0x0234 }
            qv.d r2 = qv.d.f102012a     // Catch:{ Exception -> 0x0234 }
            java.util.List r2 = r2.a()     // Catch:{ Exception -> 0x0234 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x0234 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234 }
            r4.<init>()     // Catch:{ Exception -> 0x0234 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0234 }
        L_0x0329:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r6 == 0) goto L_0x0341
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0234 }
            r7 = r6
            qv.b r7 = (qv.C11819b) r7     // Catch:{ Exception -> 0x0234 }
            r8 = 0
            boolean r7 = r7.b(r0, r8)     // Catch:{ Exception -> 0x0234 }
            if (r7 == 0) goto L_0x0329
            r4.add(r6)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0329
        L_0x0341:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ Exception -> 0x0234 }
            r4 = 0
            r6 = 0
        L_0x0347:
            boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r7 == 0) goto L_0x03b6
            java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x0234 }
            qv.b r7 = (qv.C11819b) r7     // Catch:{ Exception -> 0x0234 }
            r10 = 0
            if (r6 != 0) goto L_0x0363
            java.lang.String r6 = "Collapsed delivery, skip to next step"
            java.lang.String r6 = qv.C11818a.a(r6, r10)     // Catch:{ Exception -> 0x0234 }
            if (r6 != 0) goto L_0x035f
            goto L_0x03b6
        L_0x035f:
            java.lang.String r6 = qv.C11820c.a(r6)     // Catch:{ Exception -> 0x0234 }
        L_0x0363:
            r13 = r6
            if (r4 != 0) goto L_0x03ac
            java.lang.String r4 = r19.getName()     // Catch:{ Exception -> 0x0234 }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ Exception -> 0x0234 }
            r6 = 36
            r8 = 0
            r9 = 2
            java.lang.String r11 = HJ.C15854t.s1(r4, r6, r8, r9, r8)     // Catch:{ Exception -> 0x0234 }
            r6 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r6, r8, r9, r8)     // Catch:{ Exception -> 0x0234 }
            int r6 = r11.length()     // Catch:{ Exception -> 0x0234 }
            if (r6 != 0) goto L_0x0382
            goto L_0x0386
        L_0x0382:
            java.lang.String r4 = HJ.C15854t.P0(r11, r5)     // Catch:{ Exception -> 0x0234 }
        L_0x0386:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x0234 }
            r8 = 1
            boolean r6 = HJ.C15854t.b0(r6, r15, r8)     // Catch:{ Exception -> 0x0234 }
            if (r6 == 0) goto L_0x0398
            r6 = r27
            goto L_0x039a
        L_0x0398:
            r6 = r26
        L_0x039a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r8.<init>()     // Catch:{ Exception -> 0x0234 }
            r8.append(r6)     // Catch:{ Exception -> 0x0234 }
            r8.append(r12)     // Catch:{ Exception -> 0x0234 }
            r8.append(r4)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0234 }
        L_0x03ac:
            r9 = 0
            r6 = r7
            r7 = r0
            r8 = r4
            r11 = r13
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0234 }
            r6 = r13
            goto L_0x0347
        L_0x03b6:
            androidx.lifecycle.K<Do.a> r0 = r3.f79867G0     // Catch:{ Exception -> 0x0234 }
            Do.a r2 = r3.O0()     // Catch:{ Exception -> 0x0234 }
            r0.postValue(r2)     // Catch:{ Exception -> 0x0234 }
            Wn.b r0 = r3.f79900o     // Catch:{ Exception -> 0x0234 }
            Il.a r2 = r3.f79902q     // Catch:{ Exception -> 0x0234 }
            kp.d r2 = r2.s()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r29 = r2.b()     // Catch:{ Exception -> 0x0234 }
            kotlin.jvm.internal.C17542s.g(r14)     // Catch:{ Exception -> 0x0234 }
            Nn.n r2 = r14.b()     // Catch:{ Exception -> 0x0234 }
            boolean r4 = r3.f79913z0     // Catch:{ Exception -> 0x0234 }
            r6 = 1
            r4 = r4 ^ r6
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ Exception -> 0x0234 }
            java.lang.Double r33 = r2.c(r4)     // Catch:{ Exception -> 0x0234 }
            Nn.u r31 = r14.e()     // Catch:{ Exception -> 0x0234 }
            Nn.p r32 = r14.c()     // Catch:{ Exception -> 0x0234 }
            java.util.List r2 = r14.a()     // Catch:{ Exception -> 0x0234 }
            java.lang.Object r2 = YH.C16877v.y0(r2)     // Catch:{ Exception -> 0x0234 }
            Nn.K$b r2 = (Nn.K.b) r2     // Catch:{ Exception -> 0x0234 }
            if (r2 == 0) goto L_0x03ff
            Nn.K$b$b r2 = r2.c()     // Catch:{ Exception -> 0x0234 }
            if (r2 == 0) goto L_0x03ff
            java.lang.String r14 = r2.c()     // Catch:{ Exception -> 0x0234 }
            r34 = r14
            goto L_0x0401
        L_0x03ff:
            r34 = 0
        L_0x0401:
            r28 = r0
            r28.p(r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x0234 }
            goto L_0x04d9
        L_0x0408:
            XH.t r0 = new XH.t     // Catch:{ Exception -> 0x00e2 }
            r0.<init>()     // Catch:{ Exception -> 0x00e2 }
            throw r0     // Catch:{ Exception -> 0x00e2 }
        L_0x040e:
            XH.t r0 = new XH.t     // Catch:{ Exception -> 0x00e2 }
            r0.<init>()     // Catch:{ Exception -> 0x00e2 }
            throw r0     // Catch:{ Exception -> 0x00e2 }
        L_0x0414:
            r0 = move-exception
            r26 = r13
            goto L_0x00e7
        L_0x0419:
            androidx.lifecycle.K<Do.a> r2 = r3.f79867G0
            Do.a$f r4 = Do.a.f.f79839a
            r2.postValue(r4)
            qv.e r2 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0433:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x044b
            java.lang.Object r7 = r4.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r9 = 0
            boolean r8 = r8.b(r2, r9)
            if (r8 == 0) goto L_0x0433
            r6.add(r7)
            goto L_0x0433
        L_0x044b:
            java.util.Iterator r4 = r6.iterator()
            r6 = 0
            r14 = 0
        L_0x0451:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x04d0
            java.lang.Object r7 = r4.next()
            qv.b r7 = (qv.C11819b) r7
            if (r14 != 0) goto L_0x046e
            java.lang.String r8 = "Error when trying to select a preferred delivery"
            java.lang.String r8 = qv.C11818a.a(r8, r0)
            if (r8 != 0) goto L_0x0469
            goto L_0x04d0
        L_0x0469:
            java.lang.String r8 = qv.C11820c.a(r8)
            r14 = r8
        L_0x046e:
            if (r6 != 0) goto L_0x04b9
            java.lang.String r6 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r10 = 2
            r11 = 0
            r13 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r13, r11, r10, r11)
            r9 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r9, r11, r10, r11)
            int r16 = r8.length()
            if (r16 != 0) goto L_0x048c
            goto L_0x0490
        L_0x048c:
            java.lang.String r6 = HJ.C15854t.P0(r8, r5)
        L_0x0490:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r13 = 1
            boolean r8 = HJ.C15854t.b0(r8, r15, r13)
            if (r8 == 0) goto L_0x04a2
            r8 = r27
            goto L_0x04a4
        L_0x04a2:
            r8 = r26
        L_0x04a4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x04b6:
            r16 = r6
            goto L_0x04bd
        L_0x04b9:
            r10 = 2
            r11 = 0
            r13 = 1
            goto L_0x04b6
        L_0x04bd:
            r9 = 0
            r6 = r7
            r7 = r2
            r8 = r16
            r17 = 46
            r18 = r10
            r10 = r0
            r20 = r11
            r11 = r14
            r6.a(r7, r8, r9, r10, r11)
            r6 = r16
            goto L_0x0451
        L_0x04d0:
            Wn.b r2 = r3.f79900o
            java.lang.String r0 = r0.getMessage()
            r2.G(r0)
        L_0x04d9:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.D1(java.lang.String, java.util.List, java.util.List, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void F1(List<C10804g> list) {
        List<C10804g> list2 = this.f79856B;
        list2.clear();
        list2.addAll(list);
        this.f79898m.m("KEY_CHECKOUT_PRODUCT_DATA", this.f79858C);
    }

    private final List<lo.j> J0(Nn.K k10, boolean z10) {
        ArrayList arrayList;
        String f10 = k10.f();
        C10813p c10 = k10.c();
        Nn.u e10 = k10.e();
        Iterable<K.b> a10 = k10.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a10, 10));
        for (K.b bVar : a10) {
            C11435a.C2228a aVar = C11435a.f98597j;
            C10813p c11 = k10.c();
            List<b.C2205b> list = this.f79873J0;
            ArrayList arrayList3 = null;
            if (list != null) {
                Iterable<b.C2205b> iterable = list;
                arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (b.C2205b i10 : iterable) {
                    arrayList.add(i10.i());
                }
            } else {
                arrayList = null;
            }
            List<b.a> list2 = this.f79875K0;
            if (list2 != null) {
                Iterable<b.a> iterable2 = list2;
                arrayList3 = new ArrayList(C16877v.y(iterable2, 10));
                for (b.a i11 : iterable2) {
                    arrayList3.add(i11.i());
                }
            }
            arrayList2.add(aVar.a(bVar, c11, arrayList, arrayList3, k10.d(), new C11435a.b(this.f79913z0, this.f79902q.s())));
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList2, 10));
        int i12 = 0;
        for (Object next : arrayList2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C16877v.x();
            }
            C11435a aVar2 = (C11435a) next;
            lo.j jVar = r1;
            lo.j jVar2 = new lo.j(f10, c10, e10, aVar2, arrayList2.size(), i13, z10, true, j.a.f99401d.a(c10, aVar2.h(), true));
            arrayList4.add(jVar);
            i12 = i13;
        }
        return arrayList4;
    }

    public static /* synthetic */ void J1(f fVar, String str, m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.I1(str, mVar, z10);
    }

    private final RC.n K0(C10811n nVar) {
        Double a10 = this.f79913z0 ? nVar.a() : nVar.b();
        if (a10 == null) {
            return null;
        }
        return C17542s.a(a10, 0.0d) ? new n.b(C13026h.a(C11849b.f102312k0)) : new n.a(C14957b.a(a10.doubleValue(), this.f79902q.s()), this.f79902q.s());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: Mn.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L1(boolean r32, java.lang.String r33, Do.m r34, dI.C17164e<? super Nn.C10803f> r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r34
            r3 = r35
            boolean r4 = r3 instanceof Do.f.w
            if (r4 == 0) goto L_0x001c
            r4 = r3
            Do.f$w r4 = (Do.f.w) r4
            int r5 = r4.f80068E
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.f80068E = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            Do.f$w r4 = new Do.f$w
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r4 = r11.f80066C
            java.lang.Object r12 = eI.C17187b.f()
            int r5 = r11.f80068E
            r6 = 1
            if (r5 == 0) goto L_0x0084
            if (r5 != r6) goto L_0x007c
            java.lang.Object r1 = r11.f80089w
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f80088v
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f80087u
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f80086t
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f80084r
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f80081o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r11.f80080n
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r11.f80079m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r11.f80078l
            Un.a r1 = (Un.a) r1
            java.lang.Object r1 = r11.f80077k
            Nn.d r1 = (Nn.C10801d) r1
            java.lang.Object r1 = r11.f80076j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f80075i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f80074h
            Nn.x r1 = (Nn.x) r1
            java.lang.Object r1 = r11.f80073g
            Nn.f r1 = (Nn.C10803f) r1
            java.lang.Object r1 = r11.f80072f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f80071e
            Do.m r1 = (Do.m) r1
            java.lang.Object r1 = r11.f80070d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f80069c
            Do.f r1 = (Do.f) r1
            XH.y.b(r4)
            goto L_0x0411
        L_0x007c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0084:
            XH.y.b(r4)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r7 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            java.lang.Class<Do.f> r14 = Do.f.class
            r6 = 0
            if (r1 == 0) goto L_0x0231
            Mn.c r10 = r0.f79912z
            java.lang.String r10 = r10.e()
            if (r10 == 0) goto L_0x0231
            int r18 = r10.length()
            if (r18 != 0) goto L_0x00a6
            goto L_0x0231
        L_0x00a6:
            qv.e r13 = qv.e.DEBUG
            qv.d r19 = qv.d.f102012a
            java.util.List r19 = r19.a()
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r19 = r19.iterator()
        L_0x00b9:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L_0x00d8
            r26 = r5
            java.lang.Object r5 = r19.next()
            r27 = r7
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r13, r6)
            if (r7 == 0) goto L_0x00d3
            r15.add(r5)
        L_0x00d3:
            r5 = r26
            r7 = r27
            goto L_0x00b9
        L_0x00d8:
            r26 = r5
            r27 = r7
            java.util.Iterator r5 = r15.iterator()
            r7 = 0
            r15 = 0
        L_0x00e2:
            boolean r19 = r5.hasNext()
            if (r19 == 0) goto L_0x00f9
            java.lang.Object r19 = r5.next()
            qv.b r19 = (qv.C11819b) r19
            r6 = 0
            if (r7 != 0) goto L_0x0101
            java.lang.String r7 = "Resuming checkout with provided id"
            java.lang.String r7 = qv.C11818a.a(r7, r6)
            if (r7 != 0) goto L_0x00fd
        L_0x00f9:
            r29 = r12
            goto L_0x016a
        L_0x00fd:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x0101:
            if (r15 != 0) goto L_0x014f
            java.lang.String r15 = r14.getName()
            kotlin.jvm.internal.C17542s.g(r15)
            r28 = r5
            r29 = r12
            r5 = 2
            r6 = 36
            r12 = 0
            java.lang.String r1 = HJ.C15854t.s1(r15, r6, r12, r5, r12)
            r6 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r6, r12, r5, r12)
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0123
            goto L_0x0127
        L_0x0123:
            java.lang.String r15 = HJ.C15854t.P0(r1, r9)
        L_0x0127:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r5 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r5)
            if (r1 == 0) goto L_0x0139
            r1 = r27
            goto L_0x013b
        L_0x0139:
            r1 = r26
        L_0x013b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            r15 = r1
            goto L_0x0153
        L_0x014f:
            r28 = r5
            r29 = r12
        L_0x0153:
            r22 = 0
            r20 = r13
            r21 = r15
            r1 = 0
            r23 = r1
            r24 = r7
            r19.a(r20, r21, r22, r23, r24)
            r1 = r32
            r5 = r28
            r12 = r29
            r6 = 0
            goto L_0x00e2
        L_0x016a:
            Nn.x r1 = r0.f79899n
            Nn.f r12 = r1.s(r10)
            if (r12 != 0) goto L_0x022a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r5 = "Checkout not found when id was provided"
            r1.<init>(r5)
            qv.e r5 = qv.e.ERROR
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x018c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01a4
            java.lang.Object r10 = r6.next()
            r13 = r10
            qv.b r13 = (qv.C11819b) r13
            r15 = 0
            boolean r13 = r13.b(r5, r15)
            if (r13 == 0) goto L_0x018c
            r7.add(r10)
            goto L_0x018c
        L_0x01a4:
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r10 = 0
        L_0x01aa:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x022a
            java.lang.Object r13 = r6.next()
            r19 = r13
            qv.b r19 = (qv.C11819b) r19
            r13 = 0
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = qv.C11818a.a(r13, r1)
            if (r10 != 0) goto L_0x01c3
            goto L_0x022a
        L_0x01c3:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x01c7:
            if (r7 != 0) goto L_0x0214
            java.lang.String r7 = r14.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r28 = r6
            r30 = r12
            r6 = 2
            r15 = 36
            java.lang.String r12 = HJ.C15854t.s1(r7, r15, r13, r6, r13)
            r15 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r15, r13, r6, r13)
            int r6 = r12.length()
            if (r6 != 0) goto L_0x01e8
            goto L_0x01ec
        L_0x01e8:
            java.lang.String r7 = HJ.C15854t.P0(r12, r9)
        L_0x01ec:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r12 = 1
            boolean r6 = HJ.C15854t.b0(r6, r8, r12)
            if (r6 == 0) goto L_0x01fe
            r6 = r27
            goto L_0x0200
        L_0x01fe:
            r6 = r26
        L_0x0200:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            r12.append(r4)
            r12.append(r7)
            java.lang.String r6 = r12.toString()
            r7 = r6
            goto L_0x0218
        L_0x0214:
            r28 = r6
            r30 = r12
        L_0x0218:
            r22 = 0
            r20 = r5
            r21 = r7
            r23 = r1
            r24 = r10
            r19.a(r20, r21, r22, r23, r24)
            r6 = r28
            r12 = r30
            goto L_0x01aa
        L_0x022a:
            r30 = r12
            r12 = r30
            goto L_0x0238
        L_0x022f:
            r12 = 0
            goto L_0x0238
        L_0x0231:
            r26 = r5
            r27 = r7
            r29 = r12
            goto L_0x022f
        L_0x0238:
            if (r12 != 0) goto L_0x0414
            qv.e r1 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x024d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0265
            java.lang.Object r7 = r5.next()
            r10 = r7
            qv.b r10 = (qv.C11819b) r10
            r13 = 0
            boolean r10 = r10.b(r1, r13)
            if (r10 == 0) goto L_0x024d
            r6.add(r7)
            goto L_0x024d
        L_0x0265:
            java.util.Iterator r5 = r6.iterator()
            r13 = r6
            r7 = 0
            r10 = 0
        L_0x026c:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x02fc
            java.lang.Object r13 = r5.next()
            r19 = r13
            qv.b r19 = (qv.C11819b) r19
            r15 = 0
            if (r7 != 0) goto L_0x028d
            java.lang.String r7 = "Perform zip-in"
            java.lang.String r7 = qv.C11818a.a(r7, r15)
            if (r7 != 0) goto L_0x0289
            r17 = r6
            goto L_0x0300
        L_0x0289:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x028d:
            if (r10 != 0) goto L_0x02dd
            java.lang.String r10 = r14.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r17 = r6
            r18 = r13
            r25 = r14
            r6 = 2
            r13 = 0
            r15 = 36
            java.lang.String r14 = HJ.C15854t.s1(r10, r15, r13, r6, r13)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r13, r6, r13)
            int r16 = r14.length()
            if (r16 != 0) goto L_0x02b1
            goto L_0x02b5
        L_0x02b1:
            java.lang.String r10 = HJ.C15854t.P0(r14, r9)
        L_0x02b5:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r6 = 1
            boolean r14 = HJ.C15854t.b0(r14, r8, r6)
            if (r14 == 0) goto L_0x02c7
            r6 = r27
            goto L_0x02c9
        L_0x02c7:
            r6 = r26
        L_0x02c9:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r4)
            r14.append(r10)
            java.lang.String r6 = r14.toString()
            r10 = r6
            goto L_0x02e6
        L_0x02dd:
            r17 = r6
            r18 = r13
            r25 = r14
            r13 = 0
            r15 = 46
        L_0x02e6:
            r22 = 0
            r20 = r1
            r21 = r10
            r6 = 0
            r23 = r6
            r24 = r7
            r19.a(r20, r21, r22, r23, r24)
            r6 = r17
            r13 = r18
            r14 = r25
            goto L_0x026c
        L_0x02fc:
            r17 = r6
            r18 = r13
        L_0x0300:
            Nn.x r1 = r0.f79899n
            Mn.c r4 = r0.f79912z
            com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r4.i()
            java.lang.String r6 = r4.d()
            Mn.c r4 = r0.f79912z
            com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r4.i()
            java.lang.String r8 = r4.c()
            Mn.c r4 = r0.f79912z
            java.util.List r4 = r4.h()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = YH.C16877v.y(r4, r9)
            r7.<init>(r9)
            java.util.Iterator r9 = r4.iterator()
            r14 = r10
            r10 = r17
        L_0x0330:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x038f
            java.lang.Object r14 = r9.next()
            r10 = r14
            Mn.c$b r10 = (Mn.c.b) r10
            Nn.d$a r15 = new Nn.d$a
            r16 = r14
            java.lang.String r14 = r10.g()
            r17 = r13
            int r13 = r10.h()
            r18 = r5
            java.lang.String r5 = r10.i()
            r19 = r9
            Nn.d$a$b r9 = new Nn.d$a$b
            java.lang.String r20 = r10.f()
            if (r20 != 0) goto L_0x035f
            java.lang.String r20 = r10.g()
        L_0x035f:
            r21 = r4
            r4 = r20
            r20 = r8
            java.lang.String r8 = r10.e()
            r22 = r6
            java.lang.String r6 = r10.d()
            r23 = r1
            java.lang.String r1 = r10.c()
            r9.<init>(r4, r8, r6, r1)
            r15.<init>(r14, r13, r5, r9)
            r7.add(r15)
            r14 = r16
            r13 = r17
            r5 = r18
            r9 = r19
            r8 = r20
            r4 = r21
            r6 = r22
            r1 = r23
            goto L_0x0330
        L_0x038f:
            r23 = r1
            r21 = r4
            r18 = r5
            r22 = r6
            r20 = r8
            r19 = r9
            r17 = r13
            Mn.c r1 = r0.f79912z
            java.lang.String r1 = r1.f()
            Mn.c r4 = r0.f79912z
            java.lang.String r4 = r4.g()
            Mn.c r5 = r0.f79912z
            boolean r5 = r5.d()
            Nn.d r9 = new Nn.d
            r9.<init>(r7, r1, r4, r5)
            Un.a r13 = r0.T0(r2)
            r11.f80069c = r0
            r8 = r33
            r11.f80070d = r8
            r11.f80071e = r2
            r11.f80072f = r3
            r11.f80073g = r12
            r2 = r23
            r11.f80074h = r2
            r3 = r22
            r11.f80075i = r3
            r12 = r20
            r11.f80076j = r12
            r11.f80077k = r9
            r11.f80078l = r13
            r6 = r21
            r11.f80079m = r6
            r11.f80080n = r7
            r6 = r19
            r11.f80081o = r6
            r11.f80082p = r14
            r11.f80083q = r10
            r6 = r18
            r11.f80084r = r6
            r6 = r17
            r11.f80085s = r6
            r11.f80086t = r7
            r11.f80087u = r4
            r11.f80088v = r1
            r11.f80089w = r7
            r1 = r32
            r11.f80090x = r1
            r1 = 0
            r11.f80092z = r1
            r11.f80064A = r1
            r11.f80065B = r1
            r11.f80091y = r5
            r1 = 1
            r11.f80068E = r1
            r5 = r2
            r6 = r3
            r7 = r33
            r8 = r12
            r10 = r13
            java.lang.Object r4 = r5.e(r6, r7, r8, r9, r10, r11)
            r1 = r29
            if (r4 != r1) goto L_0x0411
            return r1
        L_0x0411:
            r12 = r4
            Nn.f r12 = (Nn.C10803f) r12
        L_0x0414:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.L1(boolean, java.lang.String, Do.m, dI.e):java.lang.Object");
    }

    private final a O0() {
        a.b bVar = this.f79865F0;
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
                String a10 = C11818a.a("check google pay express step: " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        if (bVar instanceof a.b.C1860a) {
            return new a.c(new b0(((a.b.C1860a) bVar).c()));
        }
        if (C17542s.e(bVar, a.b.c.f88441a) || C17542s.e(bVar, a.b.C1863b.f88440a)) {
            return new a.b(true);
        }
        throw new XH.t();
    }

    private final Un.a T0(m mVar) {
        if (mVar != null) {
            return null;
        }
        c.d j10 = this.f79912z.j();
        if (j10 instanceof c.d.a) {
            c.d.a aVar = (c.d.a) j10;
            return new a.C1852a(aVar.a(), aVar.b());
        } else if (j10 instanceof c.d.b) {
            return new a.b(((c.d.b) j10).a());
        } else {
            if (j10 == null) {
                return null;
            }
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h0(java.lang.String r22, java.lang.String r23, java.lang.String r24, Nn.G r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            boolean r6 = r5 instanceof Do.f.d
            if (r6 == 0) goto L_0x001f
            r6 = r5
            Do.f$d r6 = (Do.f.d) r6
            int r7 = r6.f79937k
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f79937k = r7
            goto L_0x0024
        L_0x001f:
            Do.f$d r6 = new Do.f$d
            r6.<init>(r0, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f79935i
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f79937k
            r10 = 1
            if (r9 == 0) goto L_0x0055
            if (r9 != r10) goto L_0x004d
            java.lang.Object r1 = r6.f79934h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r6.f79933g
            Nn.G r1 = (Nn.G) r1
            java.lang.Object r1 = r6.f79932f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f79931e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f79930d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f79929c
            Do.f r1 = (Do.f) r1
            XH.y.b(r7)
            goto L_0x0086
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            XH.y.b(r7)
            androidx.lifecycle.K<Do.k> r7 = r0.f79897Z
            Do.k r9 = Do.k.AUTO_SELECT_PICKUP_POINT
            r7.postValue(r9)
            Vn.b r7 = r0.f79908w
            Vn.b$b$a r9 = new Vn.b$b$a
            r9.<init>(r2, r4, r3)
            Mn.c r11 = r0.f79912z
            com.ingka.ikea.app.base.UserPostalCodeAddress r11 = r11.i()
            java.util.Map r11 = r11.b()
            r6.f79929c = r0
            r6.f79930d = r1
            r6.f79931e = r2
            r6.f79932f = r3
            r6.f79933g = r4
            r6.f79934h = r5
            r6.f79937k = r10
            java.lang.Object r7 = r7.a(r1, r9, r11, r6)
            if (r7 != r8) goto L_0x0085
            return r8
        L_0x0085:
            r1 = r0
        L_0x0086:
            Vn.b$a r7 = (Vn.b.a) r7
            boolean r2 = r7 instanceof Vn.b.a.C1879a
            java.lang.String r3 = "|"
            java.lang.String r4 = "b"
            java.lang.String r5 = "m"
            java.lang.String r6 = "main"
            java.lang.String r8 = "Kt"
            r12 = 0
            r13 = 2
            r14 = 0
            if (r2 == 0) goto L_0x0151
            Vn.b$a$a r7 = (Vn.b.a.C1879a) r7
            java.lang.Throwable r2 = r7.a()
            qv.e r15 = qv.e.WARN
            qv.d r16 = qv.d.f102012a
            java.util.List r16 = r16.a()
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r16 = r16.iterator()
        L_0x00b2:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x00c9
            java.lang.Object r9 = r16.next()
            r11 = r9
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r15, r12)
            if (r11 == 0) goto L_0x00b2
            r10.add(r9)
            goto L_0x00b2
        L_0x00c9:
            java.util.Iterator r9 = r10.iterator()
            r10 = r14
            r11 = r10
        L_0x00cf:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x014c
            java.lang.Object r12 = r9.next()
            qv.b r12 = (qv.C11819b) r12
            if (r10 != 0) goto L_0x00e9
            java.lang.String r10 = "Error selecting earliest time window"
            java.lang.String r10 = qv.C11818a.a(r10, r2)
            if (r10 == 0) goto L_0x014c
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x00e9:
            if (r11 != 0) goto L_0x0135
            java.lang.Class r11 = r1.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r24 = r4
            r0 = 36
            java.lang.String r4 = HJ.C15854t.s1(r11, r0, r14, r13, r14)
            r0 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r0, r14, r13, r14)
            int r0 = r4.length()
            if (r0 != 0) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            java.lang.String r11 = HJ.C15854t.P0(r4, r8)
        L_0x010f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4 = 1
            boolean r0 = HJ.C15854t.b0(r0, r6, r4)
            if (r0 == 0) goto L_0x0120
            r0 = r5
            goto L_0x0122
        L_0x0120:
            r0 = r24
        L_0x0122:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            goto L_0x0137
        L_0x0135:
            r24 = r4
        L_0x0137:
            r18 = 0
            r0 = r15
            r15 = r12
            r16 = r0
            r17 = r11
            r19 = r2
            r20 = r10
            r15.a(r16, r17, r18, r19, r20)
            r4 = r24
            r15 = r0
            r0 = r21
            goto L_0x00cf
        L_0x014c:
            java.lang.Throwable r0 = r7.a()
            throw r0
        L_0x0151:
            r24 = r4
            Vn.b$a$b r0 = Vn.b.a.C1880b.f88721a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r7, r0)
            if (r0 == 0) goto L_0x0213
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x016e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0185
            java.lang.Object r7 = r2.next()
            r9 = r7
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r0, r12)
            if (r9 == 0) goto L_0x016e
            r4.add(r7)
            goto L_0x016e
        L_0x0185:
            java.util.Iterator r2 = r4.iterator()
            r4 = r14
            r7 = r4
        L_0x018b:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0202
            java.lang.Object r9 = r2.next()
            r15 = r9
            qv.b r15 = (qv.C11819b) r15
            r9 = 0
            if (r4 != 0) goto L_0x01a8
            java.lang.String r4 = "Auto select pickup point successful"
            java.lang.String r4 = qv.C11818a.a(r4, r9)
            if (r4 != 0) goto L_0x01a4
            goto L_0x0202
        L_0x01a4:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x01a8:
            if (r7 != 0) goto L_0x01f2
            java.lang.Class r7 = r1.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r10 = 36
            java.lang.String r11 = HJ.C15854t.s1(r7, r10, r14, r13, r14)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r14, r13, r14)
            int r16 = r11.length()
            if (r16 != 0) goto L_0x01c8
            goto L_0x01cc
        L_0x01c8:
            java.lang.String r7 = HJ.C15854t.P0(r11, r8)
        L_0x01cc:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r10 = 1
            boolean r11 = HJ.C15854t.b0(r11, r6, r10)
            if (r11 == 0) goto L_0x01dd
            r11 = r5
            goto L_0x01df
        L_0x01dd:
            r11 = r24
        L_0x01df:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r3)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            goto L_0x01f4
        L_0x01f2:
            r12 = 46
        L_0x01f4:
            r18 = 0
            r16 = r0
            r17 = r7
            r19 = r9
            r20 = r4
            r15.a(r16, r17, r18, r19, r20)
            goto L_0x018b
        L_0x0202:
            androidx.lifecycle.K<Do.a> r0 = r1.f79867G0
            Do.a$a r2 = Do.a.C1490a.f79829a
            r0.postValue(r2)
            androidx.lifecycle.K<Do.k> r0 = r1.f79897Z
            Do.k r1 = Do.k.NONE
            r0.postValue(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0213:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.h0(java.lang.String, java.lang.String, java.lang.String, Nn.G, dI.e):java.lang.Object");
    }

    private final a h1() {
        if (!this.f79887Q0 || !this.f79885P0) {
            return null;
        }
        this.f79887Q0 = false;
        this.f79883O0 = false;
        return new a.b(false);
    }

    private final void j0(List<b.C2205b> list, List<b.a> list2) {
        String str;
        char c10;
        Class<f> cls;
        List list3;
        List<C10812o> list4;
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
        String str4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = f.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("Nothing to preselect, preferred delivery: " + this.f79912z.j(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = cls.getName();
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
            str3 = str5;
            str4 = str6;
        }
        c.d j10 = this.f79912z.j();
        Boolean valueOf = j10 != null ? Boolean.valueOf(j10.a()) : null;
        if (C17542s.e(valueOf, Boolean.TRUE)) {
            if (j10 instanceof c.d.a) {
                ArrayList arrayList2 = new ArrayList();
                for (b.a i10 : list2) {
                    C10808k i11 = i10.i();
                    if ((i11 instanceof C10808k.d) || (i11 instanceof C10808k.a)) {
                        list4 = i11.a();
                    } else if ((i11 instanceof C10808k.b) || (i11 instanceof C10808k.c)) {
                        list4 = null;
                    } else {
                        throw new XH.t();
                    }
                    if (list4 != null) {
                        arrayList2.add(list4);
                    }
                }
                list3 = C16877v.A(arrayList2);
            } else if (j10 instanceof c.d.b) {
                Iterable<b.C2205b> iterable = list;
                ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
                for (b.C2205b i12 : iterable) {
                    arrayList3.add(i12.i());
                }
                list3 = arrayList3;
            } else {
                throw new XH.t();
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object next2 : list3) {
                if (next2 instanceof C10812o.a) {
                    arrayList4.add(next2);
                }
            }
            if (arrayList4.isEmpty()) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList5 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar2, false)) {
                        arrayList5.add(next3);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar2 : arrayList5) {
                    if (str7 == null) {
                        String a11 = C11818a.a("Availability discrepancy found", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str8 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, str2, 2, str2), '.', str2, 2, str2);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                    str2 = null;
                    c10 = '$';
                }
                this.f79868H.postValue(Boolean.TRUE);
            }
        } else if (!C17542s.e(valueOf, Boolean.FALSE) && valueOf != null) {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(I i10, a aVar) {
        b bVar = (b) i10.getValue();
        if (!(bVar instanceof b.a)) {
            if ((bVar instanceof b.C1501b) || bVar == null) {
                C17542s.g(aVar);
                i10.setValue(new b.C1501b(aVar));
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l0(f fVar, I i10, k kVar) {
        Object obj;
        if (kVar == k.NONE) {
            obj = new b.C1501b(fVar.C0());
        } else {
            C17542s.g(kVar);
            obj = new b.a(kVar);
        }
        ip.j.b(i10, obj);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void p1(Throwable th2) {
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
                String a10 = C11818a.a("Unable to zip in, get delivery or get configuration", th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        this.f79897Z.postValue(k.NONE);
        if (th2 instanceof o) {
            this.f79900o.k();
            q1(th2);
        } else if (th2 instanceof C10802e) {
            C10802e eVar2 = (C10802e) th2;
            if (eVar2 instanceof C10802e.a) {
                this.f79859C0.postValue(th2);
                this.f79900o.u();
            } else if ((eVar2 instanceof C10802e.c.b) || (eVar2 instanceof C10802e.b) || (eVar2 instanceof C10802e.c.a) || C17542s.e(eVar2, C10802e.d.f84046a) || (eVar2 instanceof C10802e.C1702e)) {
                q1(th2);
            } else {
                throw new XH.t();
            }
        } else {
            q1(th2);
        }
    }

    private final void q1(Throwable th2) {
        this.f79888R.postValue(th2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s0(java.lang.String r21, ho.b r22, Do.l.a r23, dI.C17164e<? super XH.C16807N> r24) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r7 = r22
            r0 = r23
            r2 = r24
            boolean r3 = r2 instanceof Do.f.g
            if (r3 == 0) goto L_0x001e
            r3 = r2
            Do.f$g r3 = (Do.f.g) r3
            int r4 = r3.f79970z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r4 & r5
            if (r8 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.f79970z = r4
        L_0x001c:
            r5 = r3
            goto L_0x0024
        L_0x001e:
            Do.f$g r3 = new Do.f$g
            r3.<init>(r6, r2)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r3 = r5.f79968x
            java.lang.Object r8 = eI.C17187b.f()
            int r4 = r5.f79970z
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L_0x009a
            if (r4 == r10) goto L_0x0059
            if (r4 != r9) goto L_0x0051
            java.lang.Object r0 = r5.f79959o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r5.f79958n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r5.f79957m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.f79956l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.f79955k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r5.f79954j
            Do.f r0 = (Do.f) r0
            java.lang.Object r0 = r5.f79953i
            Nn.o r0 = (Nn.C10812o) r0
            goto L_0x007d
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            java.lang.Object r0 = r5.f79961q
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r5.f79960p
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r5.f79959o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.f79958n
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.f79957m
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r5.f79956l
            Do.f r0 = (Do.f) r0
            java.lang.Object r0 = r5.f79955k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.f79954j
            Nn.G r0 = (Nn.G) r0
            java.lang.Object r0 = r5.f79953i
            java.lang.String r0 = (java.lang.String) r0
        L_0x007d:
            java.lang.Object r0 = r5.f79952h
            ho.b r0 = (ho.b) r0
            java.lang.Object r0 = r5.f79951g
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r5.f79950f
            Do.l$a r0 = (Do.l.a) r0
            java.lang.Object r0 = r5.f79949e
            ho.b r0 = (ho.b) r0
            java.lang.Object r1 = r5.f79948d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f79947c
            Do.f r1 = (Do.f) r1
            XH.y.b(r3)
            goto L_0x0238
        L_0x009a:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b0:
            boolean r11 = r4.hasNext()
            r14 = 0
            if (r11 == 0) goto L_0x00c8
            java.lang.Object r11 = r4.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r14)
            if (r12 == 0) goto L_0x00b0
            r15.add(r11)
            goto L_0x00b0
        L_0x00c8:
            java.util.Iterator r4 = r15.iterator()
            r16 = r15
            r11 = 0
            r12 = 0
        L_0x00d0:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x0179
            java.lang.Object r17 = r4.next()
            r16 = r17
            qv.b r16 = (qv.C11819b) r16
            r14 = 0
            if (r11 != 0) goto L_0x0105
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r10 = 0
        L_0x00e5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "selectDeliveryOption, should auto select pup: "
            r9.append(r13)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r14)
            if (r9 != 0) goto L_0x0101
            r10 = r15
            r9 = r17
            goto L_0x017c
        L_0x0101:
            java.lang.String r11 = qv.C11820c.a(r9)
        L_0x0105:
            r9 = r11
            if (r12 != 0) goto L_0x0158
            java.lang.Class<Do.f> r10 = Do.f.class
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r11 = 36
            r12 = 2
            r13 = 0
            java.lang.String r11 = HJ.C15854t.s1(r10, r11, r13, r12, r13)
            r14 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r14, r13, r12, r13)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            java.lang.String r10 = "Kt"
            java.lang.String r10 = HJ.C15854t.P0(r11, r10)
        L_0x012c:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "main"
            r14 = 1
            boolean r11 = HJ.C15854t.b0(r11, r12, r14)
            if (r11 == 0) goto L_0x0140
            java.lang.String r11 = "m"
            goto L_0x0142
        L_0x0140:
            java.lang.String r11 = "b"
        L_0x0142:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "|"
            r12.append(r11)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
        L_0x0156:
            r10 = r12
            goto L_0x015a
        L_0x0158:
            r13 = 0
            goto L_0x0156
        L_0x015a:
            r14 = 0
            r11 = r16
            r12 = r3
            r18 = r13
            r13 = r10
            r19 = r10
            r10 = 0
            r16 = 0
            r10 = r15
            r15 = r16
            r16 = r9
            r11.a(r12, r13, r14, r15, r16)
            r11 = r9
            r15 = r10
            r16 = r17
            r12 = r19
            r9 = 2
            r10 = 1
            r14 = 0
            goto L_0x00d0
        L_0x0179:
            r10 = r15
            r9 = r16
        L_0x017c:
            boolean r13 = r7 instanceof ho.b.a
            if (r13 == 0) goto L_0x01de
            androidx.lifecycle.K<Do.a> r13 = r6.f79867G0
            Do.a$e r14 = Do.a.e.f79837a
            r13.postValue(r14)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r13 = r23.c()
            Nn.G r14 = r23.d()
            java.lang.String r15 = r23.b()
            r5.f79947c = r6
            r5.f79948d = r1
            r5.f79949e = r7
            r5.f79950f = r0
            r5.f79951g = r2
            r5.f79952h = r7
            r5.f79953i = r13
            r5.f79954j = r14
            r5.f79955k = r15
            r5.f79956l = r6
            r5.f79957m = r3
            r5.f79958n = r11
            r5.f79959o = r12
            r5.f79960p = r10
            r5.f79961q = r4
            r5.f79962r = r9
            r0 = 0
            r5.f79963s = r0
            r5.f79964t = r0
            r5.f79965u = r0
            r5.f79966v = r0
            r0 = 1
            r5.f79970z = r0
            r0 = r20
            r1 = r21
            r2 = r13
            r3 = r15
            r4 = r14
            java.lang.Object r0 = r0.h0(r1, r2, r3, r4, r5)
            if (r0 != r8) goto L_0x0236
            return r8
        L_0x01cf:
            ip.b<Do.n> r0 = r6.f79872J
            Do.n r1 = new Do.n
            r2 = r7
            ho.b$a r2 = (ho.b.a) r2
            r3 = 0
            r1.<init>(r3, r2)
            r0.postValue(r1)
            goto L_0x0236
        L_0x01de:
            boolean r13 = r7 instanceof ho.b.C2205b
            if (r13 == 0) goto L_0x0256
            r13 = r7
            ho.b$b r13 = (ho.b.C2205b) r13
            Nn.o r14 = r13.i()
            boolean r15 = r14 instanceof Nn.C10812o.a
            if (r15 == 0) goto L_0x0229
            Vn.b$b$b r15 = new Vn.b$b$b
            Nn.o r13 = r13.i()
            Nn.o$a r13 = (Nn.C10812o.a) r13
            r15.<init>(r13)
            r5.f79947c = r6
            r5.f79948d = r1
            r5.f79949e = r7
            r5.f79950f = r0
            r5.f79951g = r2
            r5.f79952h = r7
            r5.f79953i = r14
            r5.f79954j = r6
            r5.f79955k = r3
            r5.f79956l = r11
            r5.f79957m = r12
            r5.f79958n = r10
            r5.f79959o = r4
            r5.f79960p = r9
            r0 = 0
            r5.f79963s = r0
            r5.f79964t = r0
            r5.f79965u = r0
            r5.f79966v = r0
            r5.f79967w = r0
            r0 = 2
            r5.f79970z = r0
            java.lang.Object r0 = r6.v1(r1, r15, r5)
            if (r0 != r8) goto L_0x0236
            return r8
        L_0x0229:
            boolean r0 = r14 instanceof Nn.C10812o.d
            if (r0 == 0) goto L_0x0250
            ip.b<Nn.o$d> r0 = r6.f79876L
            Nn.o r1 = r13.i()
            r0.postValue(r1)
        L_0x0236:
            r1 = r6
            r0 = r7
        L_0x0238:
            Wn.b r2 = r1.f79900o
            Il.a r3 = r1.f79902q
            kp.d r3 = r3.s()
            java.lang.String r3 = r3.b()
            boolean r1 = r1.f79913z0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
            r2.j(r3, r1, r0)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0250:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0256:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.s0(java.lang.String, ho.b, Do.l$a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t0(java.lang.String r6, dI.C17164e<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Do.f.h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Do.f$h r0 = (Do.f.h) r0
            int r1 = r0.f79977i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79977i = r1
            goto L_0x0018
        L_0x0013:
            Do.f$h r0 = new Do.f$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f79975g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79977i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f79974f
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.Object r6 = r0.f79973e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f79972d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f79971c
            Do.f r6 = (Do.f) r6
            XH.y.b(r1)
            goto L_0x006b
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            if (r6 == 0) goto L_0x004e
            int r1 = r6.length()
            if (r1 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            return r6
        L_0x004e:
            aA.a r1 = r5.f79901p
            boolean r1 = r1.isLoggedIn()
            r3 = 0
            if (r1 == 0) goto L_0x0077
            lD.d r1 = r5.f79903r
            r0.f79971c = r5
            r0.f79972d = r6
            r0.f79973e = r7
            r0.f79974f = r6
            r0.f79977i = r4
            r6 = 0
            java.lang.Object r1 = lD.C14762d.a.a(r1, r6, r0, r4, r3)
            if (r1 != r2) goto L_0x006b
            return r2
        L_0x006b:
            kD.h r1 = (kD.h) r1
            if (r1 == 0) goto L_0x0074
            java.lang.String r6 = r1.c()
            return r6
        L_0x0074:
            Do.o r6 = Do.o.f80110a
            throw r6
        L_0x0077:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.t0(java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final l v0(List<b.C2205b> list, List<b.a> list2, m mVar) {
        String str;
        l.a aVar;
        char c10;
        String str2;
        G g10;
        Object obj;
        Object obj2;
        m mVar2 = mVar;
        if (mVar2 == null) {
            return null;
        }
        boolean z10 = mVar2 instanceof m.b;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<f> cls = f.class;
        if (z10) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((b.C2205b) obj2).i().k() == ((m.b) mVar2).a()) {
                    break;
                }
            }
            b.C2205b bVar = (b.C2205b) obj2;
            aVar = bVar != null ? new l.b(bVar) : null;
            str = str3;
        } else if (mVar2 instanceof m.c) {
            l.a aVar2 = null;
            for (b.a aVar3 : list2) {
                Iterator it2 = aVar3.i().a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C10812o oVar = (C10812o) it2.next();
                    Iterator it3 = oVar.b().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C10812o.b bVar2 = (C10812o.b) it3.next();
                            List<G> a10 = bVar2.a();
                            if (a10 != null) {
                                Iterator it4 = a10.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it4.next();
                                    if (C17542s.e(((G) obj).d(), ((m.c) mVar2).a())) {
                                        break;
                                    }
                                }
                                g10 = (G) obj;
                                continue;
                            } else {
                                g10 = null;
                                continue;
                            }
                            if (g10 != null) {
                                aVar2 = new l.a(aVar3, oVar.h(), g10, bVar2.c());
                                break;
                            }
                        }
                    }
                }
            }
            str = str3;
            aVar = aVar2;
        } else if (C17542s.e(mVar2, m.a.f80102a)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected preselection");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar3 : arrayList) {
                if (str4 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str2 = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str2 = str3;
                }
                String str6 = str5;
                bVar3.a(eVar, str6, false, illegalStateException, str4);
                str5 = str6;
                str3 = str2;
            }
            str = str3;
            aVar = null;
        } else {
            throw new XH.t();
        }
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str7 = null;
        String str8 = null;
        for (C11819b bVar4 : arrayList2) {
            if (str7 == null) {
                String a12 = C11818a.a("Find preselected delivery option: preselectDeliveryOption: " + mVar2 + ", found: " + aVar, (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str7 = C11820c.a(a12);
            }
            if (str8 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c10 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = '$';
            }
            char c11 = c10;
            bVar4.a(eVar2, str8, false, (Throwable) null, str7);
            mVar2 = mVar;
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v1(java.lang.String r13, Vn.b.C1881b r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof Do.f.o
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Do.f$o r0 = (Do.f.o) r0
            int r1 = r0.f80008i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80008i = r1
            goto L_0x0018
        L_0x0013:
            Do.f$o r0 = new Do.f$o
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f80006g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80008i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r13 = r0.f80005f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f80004e
            Vn.b$b r13 = (Vn.b.C1881b) r13
            java.lang.Object r13 = r0.f80003d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f80002c
            Do.f r13 = (Do.f) r13
            XH.y.b(r1)
            goto L_0x0062
        L_0x0039:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0041:
            XH.y.b(r1)
            Vn.b r1 = r12.f79908w
            Mn.c r3 = r12.f79912z
            com.ingka.ikea.app.base.UserPostalCodeAddress r3 = r3.i()
            java.util.Map r3 = r3.b()
            r0.f80002c = r12
            r0.f80003d = r13
            r0.f80004e = r14
            r0.f80005f = r15
            r0.f80008i = r4
            java.lang.Object r1 = r1.a(r13, r14, r3, r0)
            if (r1 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r13 = r12
        L_0x0062:
            Vn.b$a r1 = (Vn.b.a) r1
            boolean r14 = r1 instanceof Vn.b.a.C1880b
            r15 = 0
            if (r14 == 0) goto L_0x0079
            boolean r14 = r13.f79887Q0
            if (r14 == 0) goto L_0x006f
            r13.f79887Q0 = r15
        L_0x006f:
            androidx.lifecycle.K<Do.a> r13 = r13.f79867G0
            Do.a$a r14 = Do.a.C1490a.f79829a
            r13.postValue(r14)
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x0079:
            boolean r14 = r1 instanceof Vn.b.a.C1879a
            if (r14 == 0) goto L_0x012f
            Vn.b$a$a r1 = (Vn.b.a.C1879a) r1
            java.lang.Throwable r14 = r1.a()
            qv.e r0 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0096:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r2.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r0, r15)
            if (r6 == 0) goto L_0x0096
            r3.add(r5)
            goto L_0x0096
        L_0x00ad:
            java.util.Iterator r15 = r3.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x00b4:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x012a
            java.lang.Object r6 = r15.next()
            qv.b r6 = (qv.C11819b) r6
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = "Error selecting earliest time window"
            java.lang.String r3 = qv.C11818a.a(r3, r14)
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00ce:
            if (r5 != 0) goto L_0x011e
            java.lang.Class r5 = r13.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00f5:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x0108
            java.lang.String r7 = "m"
            goto L_0x010a
        L_0x0108:
            java.lang.String r7 = "b"
        L_0x010a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x011e:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r11
            r9 = r14
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x00b4
        L_0x012a:
            java.lang.Throwable r13 = r1.a()
            throw r13
        L_0x012f:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.v1(java.lang.String, Vn.b$b, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void w1(Mn.c cVar) {
        this.f79912z = cVar;
        this.f79898m.m("KEY_CHECKOUT_DATA", cVar);
    }

    /* access modifiers changed from: private */
    public final void y1(boolean z10) {
        if (z10) {
            this.f79883O0 = true;
        }
        this.f79885P0 = z10;
    }

    public final List<C10804g> A0() {
        return this.f79858C;
    }

    public final void A1(boolean z10) {
        this.f79882O = z10;
    }

    public final I<b> B0() {
        return this.f79871I0;
    }

    public final void B1(String str, boolean z10) {
        C17542s.j(str, "checkoutId");
        this.f79909x.a(str, z10 ? a.C1085a.b.f63200a : a.b.f63202a, this.f79858C, Boolean.valueOf(this.f79913z0));
    }

    public final a C0() {
        a value = this.f79867G0.getValue();
        return value == null ? g.f80093a : value;
    }

    public final void C1(a aVar) {
        ArrayList arrayList;
        C17542s.j(aVar, "step");
        if (C17542s.e(aVar, a.f.f79839a)) {
            List<b.C2205b> list = this.f79873J0;
            boolean z10 = false;
            boolean b10 = list != null ? ho.g.b(list) : false;
            List<b.a> list2 = this.f79875K0;
            if (list2 != null) {
                z10 = ho.g.b(list2);
            }
            if (b10) {
                this.f79900o.o(P.HOME_DELIVERY);
            }
            if (z10) {
                this.f79900o.o(P.COLLECT);
            }
        } else if (C17542s.e(aVar, a.g.f79841a)) {
            P p10 = this.f79880N;
            int i10 = p10 == null ? -1 : c.f79928a[p10.ordinal()];
            if (i10 == -1) {
                return;
            }
            if (i10 == 1) {
                Wn.b bVar = this.f79900o;
                List<b.C2205b> list3 = this.f79873J0;
                if (list3 != null) {
                    Iterable<b.C2205b> iterable = list3;
                    arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (b.C2205b i11 : iterable) {
                        arrayList.add(i11.i());
                    }
                } else {
                    arrayList = null;
                }
                Wn.c.d(p10, bVar, arrayList);
            } else if (i10 == 2) {
                Wn.c.c(this.f79900o, this.f79875K0);
            } else {
                throw new XH.t();
            }
        }
    }

    public final C11436b D0() {
        Nn.K k10 = this.f79877L0;
        if (k10 == null || Co.c.l(k10)) {
            return null;
        }
        boolean z10 = true;
        if (k10.a().isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("No deliveryArrangement, should have been checked before");
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
                    String name = f.class.getName();
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
            return null;
        }
        RC.n K02 = K0(k10.b());
        List<lo.j> J02 = J0(k10, true);
        List b10 = g.f(this.f79858C);
        if (C0().a() != a.C1490a.f79829a.a()) {
            z10 = false;
        }
        return new C11436b(K02, J02, z10, b10, true);
    }

    public final List<b.a> E0() {
        return this.f79875K0;
    }

    public final void E1(boolean z10, boolean z11, boolean z12, Boolean bool) {
        this.f79913z0 = z10;
        this.f79911y0 = z11;
        this.f79855A0 = z12;
        this.f79857B0 = bool != null ? bool.booleanValue() : false;
    }

    public final C10808k F0(String str) {
        Object obj;
        C17542s.j(str, "deliverServiceId");
        List<b.a> list = this.f79875K0;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Iterable<C10812o> a10 = ((b.a) obj).i().a();
            if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
                for (C10812o h10 : a10) {
                    if (C17542s.e(h10.h(), str)) {
                        break loop0;
                    }
                }
                continue;
            }
        }
        b.a aVar = (b.a) obj;
        if (aVar != null) {
            return aVar.i();
        }
        return null;
    }

    public final C16532g<MComConfig> G0() {
        return this.f79866G;
    }

    public final void G1(boolean z10) {
        this.f79897Z.postValue(z10 ? k.SUBMIT : k.NONE);
    }

    public final C16519P<String> H0() {
        return this.f79862E;
    }

    public final F<C10803f> I0() {
        return this.f79864F;
    }

    public final void I1(String str, m mVar, boolean z10) {
        Boolean value;
        this.f79893T0 = str;
        this.f79897Z.postValue(k.ZIP_IN);
        this.f79867G0.postValue(a.i.f79845a);
        C16505B<Boolean> b10 = this.f79879M0;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
        F0 unused = C16314k.d(g0.a(this), new u(N.f137593c0, this), (T) null, new v(this, z10, str, mVar, (C17164e<? super v>) null), 2, (Object) null);
    }

    public final boolean L0() {
        return this.f79883O0;
    }

    public final ho.b M0(P p10) {
        C17542s.j(p10, "deliveryMethod");
        if (p10 == P.COLLECT) {
            return null;
        }
        List<b.C2205b> list = this.f79873J0;
        if (this.f79911y0 || list == null || list.size() != 1) {
            return null;
        }
        C10812o i10 = list.get(0).i();
        if (i10 instanceof C10812o.a) {
            return list.get(0);
        }
        if (i10 instanceof C10812o.d) {
            return null;
        }
        throw new XH.t();
    }

    public final F<Throwable> N0() {
        return this.f79890S;
    }

    public final List<b.C2205b> P0() {
        return this.f79873J0;
    }

    public final eo.c Q0() {
        List c10 = g.g(this.f79858C, this.f79902q.s(), this.f79902q.w(), this.f79913z0);
        boolean z10 = this.f79857B0;
        int i10 = 0;
        for (C10804g c11 : this.f79858C) {
            i10 += c11.c();
        }
        return new eo.c(c10, i10, z10);
    }

    public final boolean R0() {
        return this.f79911y0;
    }

    public final UserPostalCodeAddress S0() {
        return this.f79854A;
    }

    public final F<Throwable> U0() {
        return this.f79894U;
    }

    public final P V0() {
        return this.f79880N;
    }

    public final F<P> W0() {
        return this.f79886Q;
    }

    public final Nn.K X0() {
        return this.f79877L0;
    }

    public final F<Boolean> Y0() {
        return this.f79870I;
    }

    public final F<n> Z0() {
        return this.f79874K;
    }

    public final C16532g<Boolean> a1() {
        return this.f79881N0;
    }

    public final boolean b1() {
        return this.f79855A0;
    }

    public final C16519P<Boolean> c1() {
        return this.f79896Y;
    }

    public final F<C10812o.d> d1() {
        return this.f79878M;
    }

    public final boolean e1() {
        return this.f79882O;
    }

    public final boolean f1() {
        return (this.f79873J0 == null && this.f79875K0 == null) ? false : true;
    }

    public final void g0(List<String> list, List<Nn.y> list2, m mVar) {
        Object obj;
        List<String> list3 = list;
        List<Nn.y> list4 = list2;
        C17542s.j(list3, "itemsToDelete");
        C17542s.j(list4, "itemsToUpdate");
        qv.e eVar = qv.e.DEBUG;
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
                m mVar2 = mVar;
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str == null) {
                String a10 = C11818a.a("adjustCheckoutAndRedoZipIn, preselectDeliveryOption: " + mVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            } else {
                m mVar3 = mVar;
            }
            if (str2 == null) {
                String name = f.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str3 = str2;
            bVar.a(eVar, str3, false, (Throwable) null, str);
            str2 = str3;
        }
        Mn.c cVar = this.f79912z;
        ArrayList<c.b> arrayList2 = new ArrayList<>();
        for (Object next2 : cVar.h()) {
            if (!list3.contains(((c.b) next2).g())) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
        for (c.b bVar2 : arrayList2) {
            Iterator it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C17542s.e(bVar2.g(), ((Nn.y) obj).a())) {
                    break;
                }
            }
            Nn.y yVar = (Nn.y) obj;
            arrayList3.add(c.b.b(bVar2, (String) null, yVar != null ? yVar.b() : bVar2.h(), (String) null, (String) null, (String) null, (String) null, (String) null, 125, (Object) null));
        }
        w1(Mn.c.b(cVar, (String) null, (UserPostalCodeAddress) null, arrayList3, (String) null, (String) null, (c.a) null, false, (c.d) null, 251, (Object) null));
        y1(true);
        J1(this, this.f79893T0, mVar, false, 4, (Object) null);
    }

    public final void g1(b bVar) {
        C17542s.j(bVar, "action");
        if (bVar instanceof b.a) {
            this.f79867G0.postValue(new a.b(true));
            return;
        }
        throw new XH.t();
    }

    public final void i0() {
        this.f79900o.n(Interaction$Component.CHECKOUT_REGULAR);
        x0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r14.f79883O0 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r14.f79883O0 != false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i1() {
        /*
            r14 = this;
            Do.a r0 = r14.C0()
            Do.a$i r1 = Do.a.i.f79845a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000d:
            r1 = r2
            goto L_0x006f
        L_0x0010:
            Do.a$f r1 = Do.a.f.f79839a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r3 == 0) goto L_0x001d
            Do.a r1 = r14.h1()
            goto L_0x006f
        L_0x001d:
            Do.a$g r3 = Do.a.g.f79841a
            boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r4 == 0) goto L_0x0026
            goto L_0x006f
        L_0x0026:
            Do.a$e r4 = Do.a.e.f79837a
            boolean r5 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r5 == 0) goto L_0x002f
            goto L_0x006f
        L_0x002f:
            Do.a$a r5 = Do.a.C1490a.f79829a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r0, r5)
            if (r6 == 0) goto L_0x0044
            boolean r5 = r14.f79889R0
            if (r5 == 0) goto L_0x003d
            r1 = r4
            goto L_0x006f
        L_0x003d:
            boolean r4 = r14.f79882O
            if (r4 == 0) goto L_0x0042
            goto L_0x006f
        L_0x0042:
            r1 = r3
            goto L_0x006f
        L_0x0044:
            boolean r1 = r0 instanceof Do.a.c
            if (r1 != 0) goto L_0x006a
            boolean r1 = r0 instanceof Do.a.b
            if (r1 == 0) goto L_0x004d
            goto L_0x006a
        L_0x004d:
            Do.a$h r1 = Do.a.h.f79843a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x005b
            boolean r1 = r14.f79883O0
            if (r1 == 0) goto L_0x000d
        L_0x0059:
            r1 = r5
            goto L_0x006f
        L_0x005b:
            Do.a$d r1 = Do.a.d.f79835a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0064
            goto L_0x000d
        L_0x0064:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x006a:
            boolean r1 = r14.f79883O0
            if (r1 == 0) goto L_0x000d
            goto L_0x0059
        L_0x006f:
            qv.e r9 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0082:
            boolean r5 = r3.hasNext()
            r10 = 0
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r9, r10)
            if (r6 == 0) goto L_0x0082
            r4.add(r5)
            goto L_0x0082
        L_0x009a:
            java.util.Iterator r11 = r4.iterator()
            r3 = r2
            r4 = r3
        L_0x00a0:
            boolean r5 = r11.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r11.next()
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            if (r3 != 0) goto L_0x00d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "onBackPressed, step: "
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = " -> "
            r3.append(r8)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = qv.C11818a.a(r3, r7)
            if (r3 != 0) goto L_0x00d0
            goto L_0x0130
        L_0x00d0:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00d4:
            r12 = r3
            if (r4 != 0) goto L_0x0123
            java.lang.Class<Do.f> r3 = Do.f.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r8 = 2
            java.lang.String r4 = HJ.C15854t.s1(r3, r4, r2, r8, r2)
            r13 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r13, r2, r8, r2)
            int r8 = r4.length()
            if (r8 != 0) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)
        L_0x00fa:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r8 = "main"
            boolean r4 = HJ.C15854t.b0(r4, r8, r6)
            if (r4 == 0) goto L_0x010d
            java.lang.String r4 = "m"
            goto L_0x010f
        L_0x010d:
            java.lang.String r4 = "b"
        L_0x010f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "|"
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
        L_0x0123:
            r13 = r4
            r3 = r5
            r4 = r9
            r5 = r13
            r6 = r10
            r8 = r12
            r3.a(r4, r5, r6, r7, r8)
            r3 = r12
            r4 = r13
            goto L_0x00a0
        L_0x0130:
            if (r1 == 0) goto L_0x0137
            androidx.lifecycle.K<Do.a> r0 = r14.f79867G0
            r0.postValue(r1)
        L_0x0137:
            if (r1 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r6 = 0
        L_0x013b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.i1():boolean");
    }

    public final void j1(C10803f fVar) {
        a.C1858a value;
        Sg.a aVar;
        Nn.K k10;
        this.f79889R0 = g.d(fVar);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Nn.K k11 = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("onCheckoutHolderUpdated, selected delivery option has pickup points: " + this.f79889R0, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        if (fVar != null) {
            this.f79877L0 = fVar.i();
            C16505B<a.C1858a> b10 = this.f79863E0;
            do {
                value = b10.getValue();
                a.C1858a aVar2 = value;
                aVar = Sg.a.f63419a;
                k10 = this.f79877L0;
            } while (!b10.e(value, aVar.b(k10 != null ? k10.c() : null)));
            this.f79873J0 = Co.c.t(Co.c.r(fVar.f(), this.f79877L0), this.f79913z0);
            this.f79875K0 = Co.c.s(Co.c.p(fVar.d(), this.f79877L0), this.f79913z0);
        }
        if (C17542s.e(C0(), a.e.f79837a)) {
            if (fVar != null) {
                k11 = fVar.i();
            }
            if (k11 != null && !this.f79889R0 && this.f79883O0) {
                if (!this.f79891S0) {
                    this.f79867G0.postValue(a.C1490a.f79829a);
                }
                this.f79891S0 = false;
            }
        }
    }

    public final void k1() {
        Boolean value;
        C16505B<Boolean> b10 = this.f79879M0;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    public final void l1() {
        this.f79867G0.postValue(O0());
    }

    public final C16519P<c> m() {
        return this.f79869H0;
    }

    public final void m0() {
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
                String a10 = C11818a.a("Clear checkout", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        this.f79867G0.postValue(g.f80093a);
        this.f79899n.h();
    }

    public final void m1(P p10) {
        boolean z10;
        C17542s.j(p10, "deliveryMethod");
        ho.b M02 = M0(p10);
        qv.e eVar = qv.e.DEBUG;
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
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str == null) {
                String a10 = C11818a.a("onDeliveryMethodSelected: " + p10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        z1(p10);
        if (M02 == null) {
            z10 = false;
        }
        this.f79882O = z10;
        if (M02 != null) {
            u1(M02);
        } else {
            this.f79867G0.postValue(a.g.f79841a);
        }
    }

    public final void n0() {
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new C1505f(this, (C17164e<? super C1505f>) null), 2, (Object) null);
    }

    public final void n1() {
        if (this.f79883O0) {
            if (this.f79887Q0) {
                this.f79887Q0 = false;
            }
            this.f79867G0.postValue(a.C1490a.f79829a);
        }
    }

    public final o0 o0() {
        return this.f79910y.a(P.COLLECT, this.f79875K0, this.f79913z0, C0(), this.f79880N, (String) null);
    }

    public final void o1() {
        this.f79867G0.postValue(a.h.f79843a);
    }

    public final C11436b p0(a aVar) {
        C17542s.j(aVar, "checkoutStep");
        Nn.K k10 = this.f79877L0;
        if (k10 == null) {
            return null;
        }
        return new C11436b(K0(k10.b()), J0(k10, false), aVar.a() == a.C1490a.f79829a.a(), g.f(this.f79858C), false);
    }

    public final ho.c q0(P p10, a aVar) {
        List list;
        C17542s.j(p10, "selectedDeliveryMethod");
        C17542s.j(aVar, "checkoutStep");
        int i10 = c.f79928a[p10.ordinal()];
        if (i10 == 1) {
            list = this.f79873J0;
        } else if (i10 == 2) {
            list = this.f79875K0;
        } else {
            throw new XH.t();
        }
        return new ho.c(list, this.f79913z0, aVar);
    }

    public final o0 r0() {
        P p10 = P.HOME_DELIVERY;
        ho.b M02 = M0(p10);
        return this.f79910y.a(p10, this.f79873J0, this.f79913z0, C0(), this.f79880N, M02 != null ? M02.c() : null);
    }

    public final void r1(Bundle bundle) {
        C17542s.j(bundle, "savedInstanceState");
        this.f79891S0 = true;
        F0 unused = C16314k.d(g0.a(this), new i(N.f137593c0, this), (T) null, new j(this, bundle, (C17164e<? super j>) null), 2, (Object) null);
    }

    public final void s1(Bundle bundle) {
        C17542s.j(bundle, "bundle");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Save deliverySectionExpanded: " + L0(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
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
        C10807j x10 = this.f79899n.x(this.f79860D.getValue());
        bundle.putParcelable("CHECKOUT_STEP_KEY", C0());
        bundle.putBoolean("DELIVERY_EXPANDED_KEY", this.f79883O0);
        bundle.putBoolean("FORCE_DELIVERY_EXPANDED_KEY", this.f79885P0);
        bundle.putSerializable("SELECTED_DELIVERY_METHOD_KEY", this.f79880N);
        bundle.putBoolean("SKIP_SELECT_DELIVERY_OPTION_KEY", this.f79882O);
        bundle.putBoolean("HAS_SELECTED_DELIVERY_OPTION_PUP_KEY", this.f79889R0);
        bundle.putString("AREA_CODE_KEY", this.f79893T0);
        bundle.putString("CHECKOUT_ID_KEY", x10.a());
        bundle.putParcelable("PAYMENT_HOLDER_KEY", x10.c());
        bundle.putParcelable("PSP_SESSION_KEY", x10.d());
        List<C10804g> b10 = x10.b();
        if (b10 != null) {
            arrayList2 = new ArrayList(b10);
        }
        bundle.putParcelableArrayList("PRODUCT_LIST_KEY", arrayList2);
    }

    public final void t1(String str, String str2, List<C10800c> list) {
        C17542s.j(str, "deliveryId");
        C17542s.j(str2, "selectedTimeSlotId");
        C17542s.j(list, "updatedCapabilities");
        F0 unused = C16314k.d(g0.a(this), new k(N.f137593c0, this), (T) null, new l(this, str, str2, list, (C17164e<? super l>) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: Nn.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Nn.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: Nn.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: Nn.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Nn.C10812o u0(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "deliveryServiceId"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            Nn.x r0 = r4.f79899n
            TJ.B<java.lang.String> r1 = r4.f79860D
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = (java.lang.String) r1
            Nn.f r0 = r0.s(r1)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.List r0 = r0.d()
            if (r0 == 0) goto L_0x005d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r0.next()
            Nn.k r3 = (Nn.C10808k) r3
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            YH.C16877v.E(r2, r3)
            goto L_0x0029
        L_0x003f:
            java.util.Iterator r0 = r2.iterator()
        L_0x0043:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r0.next()
            r3 = r2
            Nn.o r3 = (Nn.C10812o) r3
            java.lang.String r3 = r3.h()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x0043
            r1 = r2
        L_0x005b:
            Nn.o r1 = (Nn.C10812o) r1
        L_0x005d:
            return r1
        L_0x005e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.u0(java.lang.String):Nn.o");
    }

    public final void u1(ho.b bVar) {
        C17542s.j(bVar, "deliveryOption");
        F0 unused = C16314k.d(g0.a(this), new m(N.f137593c0, this), (T) null, new n(this, bVar, (C17164e<? super n>) null), 2, (Object) null);
    }

    public final String w0(String str, int i10) {
        C10812o oVar;
        List<C10812o.b> b10;
        C10812o.b bVar;
        List<C10808k> d10;
        Object obj;
        C17542s.j(str, "deliveryServiceId");
        if (i10 <= 1) {
            return null;
        }
        x xVar = this.f79899n;
        String value = this.f79860D.getValue();
        if (value != null) {
            C10803f s10 = xVar.s(value);
            if (s10 == null || (d10 = s10.d()) == null) {
                oVar = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (C10808k a10 : d10) {
                    C16877v.E(arrayList, a10.a());
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((C10812o) obj).h(), str)) {
                        break;
                    }
                }
                oVar = (C10812o) obj;
            }
            if (oVar == null || (b10 = oVar.b()) == null || (bVar = (C10812o.b) C16877v.z0(b10, i10 - 1)) == null) {
                return null;
            }
            return bVar.c();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void x0() {
        this.f79887Q0 = true;
        y1(true);
        this.f79867G0.postValue(a.f.f79839a);
    }

    public final void x1(boolean z10) {
        this.f79883O0 = z10;
    }

    public final F<C10802e.a> y0() {
        return this.f79861D0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: Wn.b$a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: Wn.b$a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: Wn.b$a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: Nn.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: Wn.b$a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: Wn.b$a$b} */
    /* JADX WARNING: type inference failed for: r2v9, types: [Nn.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Wn.b.a z0() {
        /*
            r18 = this;
            r0 = r18
            Nn.x r1 = r0.f79899n
            TJ.B<java.lang.String> r2 = r0.f79860D
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = (java.lang.String) r2
            Nn.f r1 = r1.s(r2)
            r2 = 0
            if (r1 == 0) goto L_0x00c0
            Nn.K r3 = r1.i()
            r4 = 10
            if (r3 == 0) goto L_0x0083
            Nn.K r5 = r1.i()
            if (r5 == 0) goto L_0x0027
            Nn.p r2 = r5.c()
        L_0x0027:
            java.util.List r12 = r1.f()
            java.util.List r13 = r1.d()
            Nn.p r14 = r3.c()
            Nn.u r15 = r3.e()
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r11 = new java.util.ArrayList
            int r5 = YH.C16877v.y(r3, r4)
            r11.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x004a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r3.next()
            r6 = r5
            Nn.K$b r6 = (Nn.K.b) r6
            jo.a$a r5 = jo.C11435a.f98597j
            jo.a$b r10 = new jo.a$b
            boolean r7 = r0.f79913z0
            Il.a r8 = r0.f79902q
            kp.d r8 = r8.s()
            r10.<init>(r7, r8)
            r16 = 0
            r7 = r2
            r8 = r12
            r9 = r13
            r17 = r10
            r10 = r16
            r4 = r11
            r11 = r17
            jo.a r5 = r5.a(r6, r7, r8, r9, r10, r11)
            r4.add(r5)
            r11 = r4
            r4 = 10
            goto L_0x004a
        L_0x007d:
            r4 = r11
            Wn.b$a$b r2 = new Wn.b$a$b
            r2.<init>(r14, r15, r4)
        L_0x0083:
            java.lang.String r3 = r1.c()
            Wn.b$a$a$a r4 = Wn.b.a.C1894a.f89076e
            Nn.i r1 = r1.h()
            Wn.b$a$a r1 = r4.a(r1)
            java.util.List<Nn.g> r4 = r0.f79858C
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r6 = r4.next()
            Nn.g r6 = (Nn.C10804g) r6
            boolean r7 = r0.f79913z0
            Mn.a r6 = Co.c.c(r6, r7)
            r5.add(r6)
            goto L_0x00a4
        L_0x00ba:
            Wn.b$a r4 = new Wn.b$a
            r4.<init>(r3, r1, r5, r2)
            r2 = r4
        L_0x00c0:
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Do.f.z0():Wn.b$a");
    }

    public final void z1(P p10) {
        this.f79880N = p10;
        if (p10 != null) {
            this.f79884P.postValue(p10);
        }
    }
}
