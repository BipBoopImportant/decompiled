package eD;

import Ae.h;
import HJ.C15854t;
import QL.C16361d;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.x;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import cD.C14029a;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.useraccount.impl.network.RemoteProfile;
import com.ingka.ikea.useraccount.impl.network.ResponseError;
import com.ingka.ikea.useraccount.model.Address;
import com.sugarcube.core.logger.DslKt;
import dD.C14339a;
import dD.C14340b;
import dI.C17164e;
import eI.C17187b;
import ip.C11410b;
import ip.k;
import jD.C14621c;
import jD.C14626h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kD.C14674a;
import kD.h;
import kD.i;
import kD.l;
import kD.m;
import kD.n;
import kD.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\"\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0002¢\u0006\u0004\b\"\u0010#JS\u0010&\u001a\u00020\u00122\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0002¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00102J\u001b\u00105\u001a\u0004\u0018\u00010*2\b\b\u0002\u00104\u001a\u00020*H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u0004\u0018\u00010;*\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070>H\u0016¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020*2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\u00020\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bD\u0010\u0016J7\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0006\u0010E\u001a\u00020\u00172\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bF\u0010GJ/\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bH\u0010IJ/\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bJ\u0010IJ'\u0010K\u001a\u00020\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bK\u0010\u0016J'\u0010L\u001a\u00020\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bL\u0010\u0016J;\u0010N\u001a\u00020\u00122\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170M2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bN\u0010OJ!\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0PH\u0016¢\u0006\u0004\bR\u0010SJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170TH@¢\u0006\u0004\bU\u0010VJ\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170TH@¢\u0006\u0004\bW\u0010VJ!\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0PH\u0016¢\u0006\u0004\bX\u0010SJ!\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0PH\u0016¢\u0006\u0004\bY\u0010SJ!\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0PH\u0016¢\u0006\u0004\bZ\u0010SJ;\u0010[\u001a\u00020\u00122\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170M2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\b[\u0010OJ/\u0010\\\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\b\\\u0010]JC\u0010^\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170M2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\b^\u0010_J/\u0010a\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00172\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\ba\u0010]J;\u0010b\u001a\u00020\u00122\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170M2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\bb\u0010OJ\u000f\u0010c\u001a\u00020\u0012H\u0016¢\u0006\u0004\bc\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010gR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010hR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010iR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070$8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010jR\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070$8\u0016X\u0004¢\u0006\f\n\u0004\bZ\u0010j\u001a\u0004\bl\u0010mR&\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR&\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010oR&\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010oR&\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010oR\u001c\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010jR\"\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0016X\u0004¢\u0006\f\n\u0004\bu\u0010j\u001a\u0004\bv\u0010mR\u001c\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010jR\"\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0016X\u0004¢\u0006\f\n\u0004\by\u0010j\u001a\u0004\bz\u0010mR\u001c\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010jR\"\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0$8\u0016X\u0004¢\u0006\f\n\u0004\bY\u0010j\u001a\u0004\b}\u0010mR\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010R\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010¨\u0006\u0001"}, d2 = {"LeD/s;", "LcD/a;", "LeD/b;", "profileEndpoint", "LjD/c;", "rateLimiter", "LaA/a;", "sessionManager", "Lsf/c;", "appUserDataRepository", "LIl/a;", "appConfigApi", "LdD/a;", "analytics", "<init>", "(LeD/b;LjD/c;LaA/a;Lsf/c;LIl/a;LdD/a;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "d0", "(LnI/l;)V", "", "tag", "Lkotlin/Function0;", "LQL/d;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "apiCall", "Landroidx/lifecycle/F;", "X", "(LnI/l;Ljava/lang/String;LnI/a;)Landroidx/lifecycle/F;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "request", "l0", "(LQL/d;LnI/l;)V", "Landroidx/lifecycle/K;", "receiver", "S", "(LnI/a;Landroidx/lifecycle/K;Ljava/lang/String;LnI/l;)V", "", "data", "", "k0", "(Ljava/lang/String;Ljava/lang/Object;)Z", "configTag", "Q", "(Ljava/lang/String;)V", "P", "R", "()V", "O", "throwException", "M", "(Z)Ljava/lang/Boolean;", "LkD/h;", "profile", "q0", "(LkD/h;)V", "LkD/d;", "p0", "(LkD/d;)LkD/d;", "LTJ/g;", "l", "()LTJ/g;", "forceFetch", "b", "(ZLnI/l;)V", "q", "id", "s", "(Ljava/lang/String;LnI/l;)Landroidx/lifecycle/F;", "k", "(LnI/l;)Landroidx/lifecycle/F;", "g", "c", "d", "", "t", "(Ljava/util/Map;LnI/l;)V", "Lip/b;", "Lip/k;", "v", "()Lip/b;", "LXH/x;", "o", "(LdI/e;)Ljava/lang/Object;", "j", "e", "r", "h", "u", "w", "(Ljava/lang/String;LnI/l;)V", "f", "(Ljava/lang/String;Ljava/util/Map;LnI/l;)V", "storeId", "a", "m", "clear", "LeD/b;", "LjD/c;", "LaA/a;", "Lsf/c;", "LIl/a;", "LdD/a;", "Landroidx/lifecycle/K;", "_profile", "c0", "()Landroidx/lifecycle/K;", "i", "Lip/b;", "hspDeleteProfileUrl", "hspChangePasswordUrl", "hspChangePhoneUrl", "hspChangeEmailUrl", "_editProfileConfiguration", "n", "b0", "editProfileConfiguration", "_upgradeProfileConfiguration", "p", "j0", "upgradeProfileConfiguration", "_consentConfiguration", "a0", "consentConfiguration", "Ljava/lang/String;", "lastUsedProfileTag", "lastUsedConfigurationTag", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements C14029a {

    /* renamed from: a  reason: collision with root package name */
    private final C14381b f126564a;

    /* renamed from: b  reason: collision with root package name */
    private final C14621c f126565b;

    /* renamed from: c  reason: collision with root package name */
    private final C13909a f126566c;

    /* renamed from: d  reason: collision with root package name */
    private final C10242c f126567d;

    /* renamed from: e  reason: collision with root package name */
    private final Il.a f126568e;

    /* renamed from: f  reason: collision with root package name */
    private final C14339a f126569f;

    /* renamed from: g  reason: collision with root package name */
    private final K<h> f126570g;

    /* renamed from: h  reason: collision with root package name */
    private final K<h> f126571h;

    /* renamed from: i  reason: collision with root package name */
    private final C11410b<k<String, l>> f126572i = new C11410b<>();

    /* renamed from: j  reason: collision with root package name */
    private final C11410b<k<String, l>> f126573j = new C11410b<>();

    /* renamed from: k  reason: collision with root package name */
    private final C11410b<k<String, l>> f126574k = new C11410b<>();

    /* renamed from: l  reason: collision with root package name */
    private final C11410b<k<String, l>> f126575l = new C11410b<>();

    /* renamed from: m  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126576m;

    /* renamed from: n  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126577n;

    /* renamed from: o  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126578o;

    /* renamed from: p  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126579p;

    /* renamed from: q  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126580q;

    /* renamed from: r  reason: collision with root package name */
    private final K<DynamicFields$Configuration> f126581r;

    /* renamed from: s  reason: collision with root package name */
    private String f126582s;

    /* renamed from: t  reason: collision with root package name */
    private String f126583t;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16361d<DynamicFields$Configuration>> {
        a(Object obj) {
            super(0, obj, C14382c.class, "getConsentConfiguration", "getConsentConfiguration(Lcom/ingka/ikea/useraccount/impl/ProfileEndpoint;)Lretrofit2/Call;", 1);
        }

        /* renamed from: t */
        public final C16361d<DynamicFields$Configuration> invoke() {
            return C14382c.c((C14381b) this.receiver);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16361d<DynamicFields$Configuration>> {
        b(Object obj) {
            super(0, obj, C14382c.class, "getAddressDeliveryConfiguration", "getAddressDeliveryConfiguration(Lcom/ingka/ikea/useraccount/impl/ProfileEndpoint;)Lretrofit2/Call;", 1);
        }

        /* renamed from: t */
        public final C16361d<DynamicFields$Configuration> invoke() {
            return C14382c.a((C14381b) this.receiver);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16361d<DynamicFields$Configuration>> {
        c(Object obj) {
            super(0, obj, C14382c.class, "getAddressInvoiceConfiguration", "getAddressInvoiceConfiguration(Lcom/ingka/ikea/useraccount/impl/ProfileEndpoint;)Lretrofit2/Call;", 1);
        }

        /* renamed from: t */
        public final C16361d<DynamicFields$Configuration> invoke() {
            return C14382c.b((C14381b) this.receiver);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16361d<DynamicFields$Configuration>> {
        d(Object obj) {
            super(0, obj, C14382c.class, "getEditProfileConfiguration", "getEditProfileConfiguration(Lcom/ingka/ikea/useraccount/impl/ProfileEndpoint;)Lretrofit2/Call;", 1);
        }

        /* renamed from: t */
        public final C16361d<DynamicFields$Configuration> invoke() {
            return C14382c.e((C14381b) this.receiver);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16361d<DynamicFields$Configuration>> {
        e(Object obj) {
            super(0, obj, C14382c.class, "getUpgradeProfileConfiguration", "getUpgradeProfileConfiguration(Lcom/ingka/ikea/useraccount/impl/ProfileEndpoint;)Lretrofit2/Call;", 1);
        }

        /* renamed from: t */
        public final C16361d<DynamicFields$Configuration> invoke() {
            return C14382c.f((C14381b) this.receiver);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.useraccount.impl.ProfileRepositoryImpl", f = "ProfileRepositoryImpl.kt", l = {306}, m = "getChangePasswordUrlSuspended-IoAF18A")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126584c;

        /* renamed from: d  reason: collision with root package name */
        Object f126585d;

        /* renamed from: e  reason: collision with root package name */
        Object f126586e;

        /* renamed from: f  reason: collision with root package name */
        Object f126587f;

        /* renamed from: g  reason: collision with root package name */
        int f126588g;

        /* renamed from: h  reason: collision with root package name */
        int f126589h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f126590i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s f126591j;

        /* renamed from: k  reason: collision with root package name */
        int f126592k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(s sVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f126591j = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126590i = obj;
            this.f126592k |= Integer.MIN_VALUE;
            Object j10 = this.f126591j.j(this);
            return j10 == C17187b.f() ? j10 : x.a(j10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.useraccount.impl.ProfileRepositoryImpl", f = "ProfileRepositoryImpl.kt", l = {295}, m = "getDeleteProfileUrlSuspended-IoAF18A")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126593c;

        /* renamed from: d  reason: collision with root package name */
        Object f126594d;

        /* renamed from: e  reason: collision with root package name */
        Object f126595e;

        /* renamed from: f  reason: collision with root package name */
        Object f126596f;

        /* renamed from: g  reason: collision with root package name */
        int f126597g;

        /* renamed from: h  reason: collision with root package name */
        int f126598h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f126599i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s f126600j;

        /* renamed from: k  reason: collision with root package name */
        int f126601k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(s sVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f126600j = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126599i = obj;
            this.f126601k |= Integer.MIN_VALUE;
            Object o10 = this.f126600j.o(this);
            return o10 == C17187b.f() ? o10 : x.a(o10);
        }
    }

    public s(C14381b bVar, C14621c cVar, C13909a aVar, C10242c cVar2, Il.a aVar2, C14339a aVar3) {
        C17542s.j(bVar, "profileEndpoint");
        C17542s.j(cVar, "rateLimiter");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(cVar2, "appUserDataRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "analytics");
        this.f126564a = bVar;
        this.f126565b = cVar;
        this.f126566c = aVar;
        this.f126567d = cVar2;
        this.f126568e = aVar2;
        this.f126569f = aVar3;
        K<h> k10 = new K<>();
        this.f126570g = k10;
        this.f126571h = k10;
        K<DynamicFields$Configuration> k11 = new K<>();
        this.f126576m = k11;
        this.f126577n = k11;
        K<DynamicFields$Configuration> k12 = new K<>();
        this.f126578o = k12;
        this.f126579p = k12;
        K<DynamicFields$Configuration> k13 = new K<>();
        this.f126580q = k13;
        this.f126581r = k13;
    }

    private final Boolean M(boolean z10) {
        if (this.f126566c.isLoggedIn()) {
            return Boolean.TRUE;
        }
        if (!z10) {
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
                    String a10 = C11818a.a("Ignoring call, user not logged in", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = s.class.getName();
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
            return null;
        }
        throw new IllegalStateException("User not logged in");
    }

    static /* synthetic */ Boolean N(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sVar.M(z10);
    }

    private final void O() {
        this.f126565b.b("ProfileRepository/Configuration", true);
        this.f126576m.postValue(null);
        this.f126583t = null;
    }

    private final void P(String str) {
        String str2 = this.f126583t;
        if (str2 == null) {
            this.f126583t = str;
        } else if (!C17542s.e(str2, str)) {
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
                    String a10 = C11818a.a("Region, language or user changed, clearing configuration caches", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = s.class.getName();
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
            O();
            this.f126583t = str;
        }
    }

    private final void Q(String str) {
        String str2 = this.f126582s;
        if (str2 == null) {
            this.f126582s = str;
        } else if (!C17542s.e(str2, str)) {
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
                    String a10 = C11818a.a("Region, language or user changed, clearing profile cache", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = s.class.getName();
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
            R();
            this.f126582s = str;
        }
    }

    private final void R() {
        this.f126565b.b("ProfileRepository/Profile", true);
        this.f126582s = null;
    }

    private final void S(C17631a<? extends C16361d<DynamicFields$Configuration>> aVar, K<DynamicFields$Configuration> k10, String str, C17642l<? super l, C16807N> lVar) {
        t tVar = t.f126602a;
        String a10 = tVar.a(this.f126568e.i(), this.f126568e.a(), String.valueOf(this.f126566c.a()));
        P(a10);
        String c10 = tVar.c(a10, str);
        if (!k0(c10, k10.getValue()) || C17542s.e(str, "consent-profile")) {
            lVar.invoke(kD.e.f128625a);
            ((C16361d) aVar.invoke()).E0(new C14626h(lVar, new C14389j(this, k10, c10)));
            return;
        }
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
                String a11 = C11818a.a("Request blocked by rate limiter", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str2 = C11820c.a(a11);
            }
            if (str3 == null) {
                String name = s.class.getName();
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
        lVar.invoke(m.f128647a);
    }

    /* access modifiers changed from: private */
    public static final C16807N T(s sVar, K k10, String str, C14626h hVar) {
        C17542s.j(hVar, "$this$StateListenerCallback");
        hVar.p(new C14392m(sVar, k10));
        hVar.n(new C14393n(sVar, str));
        hVar.o(new C14394o(sVar, str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final l U(s sVar, K k10, DynamicFields$Configuration dynamicFields$Configuration, l lVar) {
        C17542s.j(lVar, "<unused var>");
        if (!sVar.f126566c.isLoggedIn()) {
            return p.f128655a;
        }
        k10.setValue(dynamicFields$Configuration);
        return m.f128647a;
    }

    /* access modifiers changed from: private */
    public static final kD.d V(s sVar, String str, kD.d dVar) {
        C17542s.j(dVar, "failure");
        C14621c.a.a(sVar.f126565b, str, false, 2, (Object) null);
        return dVar;
    }

    /* access modifiers changed from: private */
    public static final n W(s sVar, String str, Throwable th2, n nVar) {
        C17542s.j(th2, "<unused var>");
        C17542s.j(nVar, "failure");
        C14621c.a.a(sVar.f126565b, str, false, 2, (Object) null);
        return nVar;
    }

    private final F<DynamicFields$Configuration> X(C17642l<? super l, C16807N> lVar, String str, C17631a<? extends C16361d<DynamicFields$Configuration>> aVar) {
        K k10 = new K();
        if (N(this, false, 1, (Object) null) != null) {
            S(aVar, k10, str, lVar);
            return k10;
        }
        lVar.invoke(p.f128655a);
        return k10;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(s sVar, K k10, C14626h hVar) {
        C17542s.j(hVar, "$this$StateListenerCallback");
        hVar.p(new C14396q(sVar, k10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final l Z(s sVar, K k10, DynamicFields$Configuration dynamicFields$Configuration, l lVar) {
        C17542s.j(lVar, "<unused var>");
        if (!sVar.f126566c.isLoggedIn()) {
            return p.f128655a;
        }
        k10.setValue(dynamicFields$Configuration);
        return m.f128647a;
    }

    private final void d0(C17642l<? super l, C16807N> lVar) {
        this.f126564a.getProfile().E0(new C14626h(lVar, new r(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(s sVar, C14626h hVar) {
        C17542s.j(hVar, "$this$StateListenerCallback");
        hVar.p(new C14384e(sVar, hVar));
        hVar.n(new C14385f(sVar));
        hVar.o(new C14386g(sVar));
        hVar.m(new C14387h(sVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C14674a f0(s sVar, C14674a aVar) {
        C17542s.j(aVar, "it");
        K<h> k10 = sVar.f126570g;
        k10.setValue(k10.getValue());
        C14674a aVar2 = C14674a.f128619a;
        C14621c.a.a(sVar.f126565b, "ProfileRepository/Profile", false, 2, (Object) null);
        return aVar2;
    }

    /* access modifiers changed from: private */
    public static final l g0(s sVar, C14626h hVar, RemoteProfile remoteProfile, l lVar) {
        C17542s.j(lVar, "<unused var>");
        h b10 = remoteProfile.b();
        if (b10 == null) {
            return i.f128642a;
        }
        if (!sVar.f126566c.isLoggedIn()) {
            return p.f128655a;
        }
        sVar.q0(b10);
        sVar.f126570g.setValue(b10);
        if (sVar.f126566c.i() && b10.g().isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Mismatch between id token and profile.");
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
                    String name = hVar.getClass().getName();
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
        return m.f128647a;
    }

    /* access modifiers changed from: private */
    public static final kD.d h0(s sVar, kD.d dVar) {
        C17542s.j(dVar, "httpFailure");
        K<h> k10 = sVar.f126570g;
        k10.setValue(k10.getValue());
        C14621c.a.a(sVar.f126565b, "ProfileRepository/Profile", false, 2, (Object) null);
        return dVar;
    }

    /* access modifiers changed from: private */
    public static final n i0(s sVar, Throwable th2, n nVar) {
        C17542s.j(th2, "<unused var>");
        C17542s.j(nVar, "unspecifiedFailure");
        K<h> k10 = sVar.f126570g;
        k10.setValue(k10.getValue());
        C14621c.a.a(sVar.f126565b, "ProfileRepository/Profile", false, 2, (Object) null);
        return nVar;
    }

    private final boolean k0(String str, Object obj) {
        return !this.f126565b.a(str) && obj != null;
    }

    private final void l0(C16361d<RemoteProfile> dVar, C17642l<? super l, C16807N> lVar) {
        lVar.invoke(kD.e.f128625a);
        dVar.E0(new C14626h(lVar, new C14383d(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N m0(s sVar, C14626h hVar) {
        C17542s.j(hVar, "$this$StateListenerCallback");
        hVar.p(new C14390k(sVar));
        hVar.n(new C14391l(sVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final l n0(s sVar, RemoteProfile remoteProfile, l lVar) {
        C17542s.j(lVar, "<unused var>");
        sVar.O();
        h b10 = remoteProfile.b();
        if (b10 == null) {
            return i.f128642a;
        }
        if (!sVar.f126566c.isLoggedIn()) {
            return p.f128655a;
        }
        sVar.f126570g.setValue(b10);
        sVar.q0(b10);
        return m.f128647a;
    }

    /* access modifiers changed from: private */
    public static final l o0(s sVar, kD.d dVar) {
        C17542s.j(dVar, "httpFailure");
        kD.d p02 = sVar.p0(dVar);
        return p02 != null ? p02 : dVar;
    }

    private final kD.d p0(kD.d dVar) {
        try {
            ResponseError responseError = (ResponseError) Yz.b.f118278a.b().c(ResponseError.Companion.serializer(), dVar.a());
            String b10 = responseError.b();
            if (b10 == null) {
                b10 = dVar.a();
            }
            String a10 = responseError.a();
            if (a10 == null) {
                a10 = dVar.b();
            }
            return new kD.d(b10, a10);
        } catch (Exception e10) {
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
                    String a11 = C11818a.a("Exception parsing message: " + dVar.a(), e10);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = dVar.getClass().getName();
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
            return null;
        }
    }

    private final void q0(h hVar) {
        Object obj;
        if (this.f126567d.l() == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hVar.a().iterator();
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Address address = (Address) next;
                String c10 = address.c();
                if (!(c10 == null || c10.length() == 0)) {
                    z10 = C15854t.H(this.f126567d.c(), address.c(), true);
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                obj = it2.next();
                if (it2.hasNext()) {
                    char h10 = ((Address) obj).h();
                    do {
                        Object next2 = it2.next();
                        char h11 = ((Address) next2).h();
                        if (h10 > h11) {
                            obj = next2;
                            h10 = h11;
                        }
                    } while (it2.hasNext());
                }
            }
            Address address2 = (Address) obj;
            String g10 = address2 != null ? address2.g() : null;
            if (g10 != null) {
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar, false)) {
                        arrayList2.add(next3);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList2) {
                    if (str == null) {
                        String a10 = C11818a.a("Update postal code from downloaded profile address", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = s.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (!(o12.length() == 0)) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str3 = str2;
                    bVar.a(eVar, str3, false, (Throwable) null, str);
                    str2 = str3;
                }
                this.f126567d.j(new UserPostalCodeAddress(g10, (String) null, (ArrayList) null, 6, (DefaultConstructorMarker) null));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r0(s sVar, C17642l lVar, l lVar2) {
        C17542s.j(lVar2, "state");
        if (lVar2 instanceof m) {
            h.a.a(sVar.f126569f, C14340b.UPGRADE_SUCCESS, (Map) null, 2, (Object) null);
            sVar.f126566c.l();
        } else if (lVar2 instanceof kD.d) {
            sVar.f126569f.e(C14340b.UPGRADE_FAILED, ((kD.d) lVar2).b());
        }
        lVar.invoke(lVar2);
        return C16807N.f139792a;
    }

    public synchronized void a(String str, C17642l<? super l, C16807N> lVar) {
        C17542s.j(str, "storeId");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.h(X.f(C16796C.a("preferredStore", str))), lVar);
            return;
        }
        lVar.invoke(p.f128655a);
    }

    /* renamed from: a0 */
    public K<DynamicFields$Configuration> i() {
        return this.f126581r;
    }

    public synchronized void b(boolean z10, C17642l<? super l, C16807N> lVar) {
        boolean z11 = z10;
        C17642l<? super l, C16807N> lVar2 = lVar;
        synchronized (this) {
            try {
                C17542s.j(lVar2, "stateListener");
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
                        break;
                    }
                    C11819b bVar = (C11819b) it.next();
                    if (str == null) {
                        String a10 = C11818a.a("Loading profile, force: " + z11, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = s.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str2 = str4;
                    str = str3;
                }
                if (M(false) != null) {
                    String b10 = t.f126602a.b(this.f126568e.i(), this.f126568e.a(), String.valueOf(this.f126566c.a()));
                    Q(b10);
                    if (z11 || !k0(b10, this.f126570g.getValue())) {
                        lVar2.invoke(kD.e.f128625a);
                        d0(lVar2);
                        return;
                    }
                    qv.e eVar2 = qv.e.DEBUG;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    String str5 = null;
                    String str6 = null;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C11819b bVar2 = (C11819b) it2.next();
                        if (str5 == null) {
                            String a11 = C11818a.a("Request blocked by rate limiter", (Throwable) null);
                            if (a11 == null) {
                                break;
                            }
                            str5 = C11820c.a(a11);
                        }
                        if (str6 == null) {
                            String name2 = s.class.getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str6, false, (Throwable) null, str5);
                    }
                    lVar2.invoke(m.f128647a);
                    return;
                }
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList arrayList3 = new ArrayList();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                String str7 = null;
                String str8 = null;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C11819b bVar3 = (C11819b) it3.next();
                    if (str7 == null) {
                        String a12 = C11818a.a("User not logged in, set empty profile", (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str7 = C11820c.a(a12);
                    }
                    if (str8 == null) {
                        String name3 = s.class.getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    bVar3.a(eVar3, str8, false, (Throwable) null, str7);
                }
                lVar2.invoke(p.f128655a);
                C16807N n10 = C16807N.f139792a;
                this.f126570g.postValue(null);
            } finally {
                while (true) {
                }
            }
        }
    }

    /* renamed from: b0 */
    public K<DynamicFields$Configuration> p() {
        return this.f126577n;
    }

    public synchronized void c(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            S(new e(this.f126564a), this.f126578o, "upgrade-profile", lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    /* renamed from: c0 */
    public K<kD.h> getProfile() {
        return this.f126571h;
    }

    public synchronized void clear() {
        try {
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
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Clear profile data", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = s.class.getName();
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
            this.f126570g.postValue(null);
            this.f126580q.postValue(null);
            C11410b<k<String, l>> bVar2 = this.f126573j;
            k.a aVar = k.f98528e;
            p pVar = p.f128655a;
            bVar2.postValue(k.a.b(aVar, (String) null, pVar, (Object) null, 5, (Object) null));
            this.f126572i.postValue(k.a.b(aVar, (String) null, pVar, (Object) null, 5, (Object) null));
            O();
            R();
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void d(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            S(new a(this.f126564a), this.f126580q, "consent-profile", lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    public C11410b<k<String, l>> e() {
        this.f126573j.setValue(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        this.f126564a.m().E0(new w(this.f126573j));
        return this.f126573j;
    }

    public synchronized void f(String str, Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(str, "id");
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.c(str, map), lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    public synchronized F<DynamicFields$Configuration> g(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        return X(lVar, "address-invoice-configuration", new c(this.f126564a));
    }

    public C11410b<k<String, l>> h() {
        this.f126575l.setValue(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        this.f126564a.f().E0(new w(this.f126575l));
        return this.f126575l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[SYNTHETIC, Splitter:B:24:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[Catch:{ CancellationException -> 0x003b, all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(dI.C17164e<? super XH.x<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eD.s.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            eD.s$f r0 = (eD.s.f) r0
            int r1 = r0.f126592k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126592k = r1
            goto L_0x0018
        L_0x0013:
            eD.s$f r0 = new eD.s$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f126590i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126592k
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f126587f
            eD.s r6 = (eD.s) r6
            java.lang.Object r6 = r0.f126586e
            eD.s r6 = (eD.s) r6
            java.lang.Object r6 = r0.f126585d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126584c
            eD.s r6 = (eD.s) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0062
        L_0x0039:
            r6 = move-exception
            goto L_0x008d
        L_0x003b:
            r6 = move-exception
            goto L_0x0098
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            eD.b r1 = r5.f126564a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126584c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126585d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126586e = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126587f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f126588g = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126589h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126592k = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r1.d(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            boolean r6 = r1.e()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "No message"
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r1.a()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl r6 = (com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl) r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = r6.a()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0097
        L_0x0081:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6.<init>(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            throw r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
        L_0x0087:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6.<init>(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            throw r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
        L_0x008d:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0097:
            return r6
        L_0x0098:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eD.s.j(dI.e):java.lang.Object");
    }

    /* renamed from: j0 */
    public K<DynamicFields$Configuration> n() {
        return this.f126579p;
    }

    public synchronized F<DynamicFields$Configuration> k(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        return X(lVar, "address-delivery-configuration", new b(this.f126564a));
    }

    public C16532g<kD.h> l() {
        return C16534i.s(C5210m.a(this.f126570g));
    }

    public synchronized void m(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.h(map), new C14388i(this, lVar));
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[SYNTHETIC, Splitter:B:24:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[Catch:{ CancellationException -> 0x003b, all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(dI.C17164e<? super XH.x<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eD.s.g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            eD.s$g r0 = (eD.s.g) r0
            int r1 = r0.f126601k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126601k = r1
            goto L_0x0018
        L_0x0013:
            eD.s$g r0 = new eD.s$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f126599i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126601k
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f126596f
            eD.s r6 = (eD.s) r6
            java.lang.Object r6 = r0.f126595e
            eD.s r6 = (eD.s) r6
            java.lang.Object r6 = r0.f126594d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126593c
            eD.s r6 = (eD.s) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0062
        L_0x0039:
            r6 = move-exception
            goto L_0x008d
        L_0x003b:
            r6 = move-exception
            goto L_0x0098
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            eD.b r1 = r5.f126564a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126593c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126594d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126595e = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126596f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f126597g = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126598h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f126601k = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r1.g(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            boolean r6 = r1.e()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "No message"
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r1.a()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl r6 = (com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl) r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = r6.a()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0097
        L_0x0081:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6.<init>(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            throw r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
        L_0x0087:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6.<init>(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            throw r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
        L_0x008d:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0097:
            return r6
        L_0x0098:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eD.s.o(dI.e):java.lang.Object");
    }

    public synchronized void q(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            S(new d(this.f126564a), this.f126576m, "edit-profile", lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    public C11410b<k<String, l>> r() {
        this.f126574k.setValue(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        this.f126564a.o().E0(new w(this.f126574k));
        return this.f126574k;
    }

    public synchronized F<DynamicFields$Configuration> s(String str, C17642l<? super l, C16807N> lVar) {
        C17542s.j(str, "id");
        C17542s.j(lVar, "stateListener");
        K k10 = new K();
        if (N(this, false, 1, (Object) null) != null) {
            lVar.invoke(kD.e.f128625a);
            C14382c.d(this.f126564a, str).E0(new C14626h(lVar, new C14395p(this, k10)));
            return k10;
        }
        lVar.invoke(p.f128655a);
        return k10;
    }

    public synchronized void t(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.h(map), lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    public synchronized void u(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.e(map), lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }

    public C11410b<k<String, l>> v() {
        this.f126572i.setValue(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        this.f126564a.n().E0(new w(this.f126572i));
        return this.f126572i;
    }

    public synchronized void w(String str, C17642l<? super l, C16807N> lVar) {
        C17542s.j(str, "id");
        C17542s.j(lVar, "stateListener");
        if (N(this, false, 1, (Object) null) != null) {
            l0(this.f126564a.b(str), lVar);
        } else {
            lVar.invoke(p.f128655a);
        }
    }
}
