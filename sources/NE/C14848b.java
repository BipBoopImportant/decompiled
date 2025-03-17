package nE;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.location.Location;
import android.os.Build;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.zipselector.impl.network.StateLookupApiError;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gE.C14514a;
import hE.C14535a;
import ip.C11410b;
import ip.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lE.C14764a;
import lE.C14766c;
import lg.C10027d;
import nE.C14847a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import uK.C18146a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0016J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0017¢\u0006\u0004\b2\u0010\u001aJ\u0015\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u0010;\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u00102R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020F0J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR#\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0Q0J8\u0006¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170P8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170J8\u0006¢\u0006\f\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010NR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020]0E8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010HR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020]0J8\u0006¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\ba\u0010NR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020c0E8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010HR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020c0J8\u0006¢\u0006\f\n\u0004\bf\u0010L\u001a\u0004\bg\u0010NR\u0019\u0010m\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\"\u0010v\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u000f0\u000f0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010SR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0J8\u0006¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010NR\u001c\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010SR\u001f\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0J8\u0006¢\u0006\f\n\u0004\b|\u0010L\u001a\u0004\b}\u0010NR\u001a\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0P8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010SR\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0J8\u0006¢\u0006\r\n\u0004\b\"\u0010L\u001a\u0005\b\u0001\u0010NR\u0015\u0010\u0001\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R#\u0010\u0001\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u00170\u00170P8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010SR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170J8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010L\u001a\u0005\b\u0001\u0010NR#\u0010\u0001\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010y0y0P8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010SR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020y0J8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010L\u001a\u0005\b\u0001\u0010NR\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b}\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u00102R\u0017\u0010\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u00102R\u001d\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0001R\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010oR\u001b\u0010\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010oR\u0017\u0010\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0015\u0010\u0001\u001a\u00020y8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010\"R#\u0010\u0001\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010y0y0P8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010SR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020y0J8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010L\u001a\u0005\b\u0001\u0010N¨\u0006\u0001"}, d2 = {"LnE/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lsf/c;", "appUserDataRepository", "LgE/a;", "zipSelectorAnalytics", "LlE/c;", "stateLookupRemoteDataSource", "<init>", "(Landroidx/lifecycle/U;Lsf/c;LgE/a;LlE/c;)V", "LXH/N;", "f0", "()V", "", "postalCodeToSave", "errorText", "e0", "(Ljava/lang/String;Ljava/lang/String;)V", "postalCodeKeyboardType", "d0", "(Ljava/lang/String;)V", "", "locationServiceEnabled", "b0", "(Z)V", "stateRequired", "c0", "postalCode", "J", "g0", "X", "()Z", "I", "text", "a0", "", "i0", "(Ljava/lang/CharSequence;)V", "LlE/a;", "selectedPostalCodeState", "j0", "(LlE/a;)V", "H", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "h0", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;)V", "isBlocked", "Z", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "area", "Y", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;)V", "Landroid/location/Location;", "location", "Landroid/location/Geocoder;", "geocoder", "K", "(Landroid/location/Location;Landroid/location/Geocoder;)V", "m", "Lsf/c;", "n", "LgE/a;", "o", "LlE/c;", "p", "allowSamePostalCode", "Lip/b;", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "q", "Lip/b;", "_onSaveZipCodeComplete", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "U", "()Landroidx/lifecycle/F;", "onSaveZipCodeComplete", "Landroidx/lifecycle/K;", "", "s", "Landroidx/lifecycle/K;", "_sections", "t", "W", "sections", "u", "_buttonLoading", "v", "M", "buttonLoading", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "w", "_error", "x", "P", "error", "LnE/a;", "y", "_findAddressResult", "z", "R", "findAddressResult", "A", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "V", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "preSelectedPostalCodeAddress", "B", "Ljava/lang/String;", "preSelectedPostalCode", "C", "Ljava/lang/CharSequence;", "postalCodeInput", "kotlin.jvm.PlatformType", "D", "_errorText", "E", "Q", "", "F", "_drawableEndRes", "G", "O", "drawableEndRes", "_helperText", "S", "helperText", "initialButtonEnabledState", "_buttonEnabled", "L", "buttonEnabled", "_keyboardType", "N", "T", "keyboardType", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "postalCodePattern", "isLocationServiceEnabled", "isStateRequired", "", "Ljava/util/List;", "states", "preSelectedStateCode", "LlE/a;", "selectedState", "selectedAreaCode", "isContinueEnabled", "initialButtonRes", "_buttonStringRes", "y0", "buttonStringRes", "z0", "a", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nE.b  reason: case insensitive filesystem */
public final class C14848b extends f0 {

    /* renamed from: z0  reason: collision with root package name */
    public static final a f129753z0 = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private final UserPostalCodeAddress f129754A;

    /* renamed from: B  reason: collision with root package name */
    private String f129755B;

    /* renamed from: C  reason: collision with root package name */
    private CharSequence f129756C;

    /* renamed from: D  reason: collision with root package name */
    private final K<String> f129757D;

    /* renamed from: E  reason: collision with root package name */
    private final F<String> f129758E;

    /* renamed from: F  reason: collision with root package name */
    private final K<Integer> f129759F;

    /* renamed from: G  reason: collision with root package name */
    private final F<Integer> f129760G;

    /* renamed from: H  reason: collision with root package name */
    private final K<String> f129761H;

    /* renamed from: I  reason: collision with root package name */
    private final F<String> f129762I;

    /* renamed from: J  reason: collision with root package name */
    private final boolean f129763J;

    /* renamed from: K  reason: collision with root package name */
    private final K<Boolean> f129764K;

    /* renamed from: L  reason: collision with root package name */
    private final F<Boolean> f129765L;

    /* renamed from: M  reason: collision with root package name */
    private final K<Integer> f129766M;

    /* renamed from: N  reason: collision with root package name */
    private final F<Integer> f129767N;

    /* renamed from: O  reason: collision with root package name */
    private Pattern f129768O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f129769P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f129770Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public final List<C14764a> f129771R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public final String f129772S;

    /* renamed from: T  reason: collision with root package name */
    private C14764a f129773T;

    /* renamed from: U  reason: collision with root package name */
    private String f129774U;

    /* renamed from: X  reason: collision with root package name */
    private boolean f129775X;

    /* renamed from: Y  reason: collision with root package name */
    private final int f129776Y;

    /* renamed from: Z  reason: collision with root package name */
    private final K<Integer> f129777Z;

    /* renamed from: m  reason: collision with root package name */
    private final C10242c f129778m;

    /* renamed from: n  reason: collision with root package name */
    private final C14514a f129779n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C14766c f129780o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f129781p;

    /* renamed from: q  reason: collision with root package name */
    private final C11410b<UserPostalCodeAddress> f129782q;

    /* renamed from: r  reason: collision with root package name */
    private final F<UserPostalCodeAddress> f129783r;

    /* renamed from: s  reason: collision with root package name */
    private final K<List<C14764a>> f129784s;

    /* renamed from: t  reason: collision with root package name */
    private final F<List<C14764a>> f129785t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final K<Boolean> f129786u;

    /* renamed from: v  reason: collision with root package name */
    private final F<Boolean> f129787v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C11410b<StateLookupApiError> f129788w;

    /* renamed from: x  reason: collision with root package name */
    private final F<StateLookupApiError> f129789x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C11410b<C14847a> f129790y;

    /* renamed from: y0  reason: collision with root package name */
    private final F<Integer> f129791y0;

    /* renamed from: z  reason: collision with root package name */
    private final F<C14847a> f129792z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LnE/b$a;", "", "<init>", "()V", "", "ALPHANUMERIC", "Ljava/lang/String;", "NUMERIC", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nE.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"nE/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nE.b$b  reason: collision with other inner class name */
    public static final class C3192b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14848b f129793a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3192b(N.a aVar, C14848b bVar) {
            super(aVar);
            this.f129793a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C14848b bVar = this.f129793a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            StateLookupApiError stateLookupApiError = null;
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to fetch states", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f129793a.f129786u.setValue(Boolean.FALSE);
            C11410b D10 = this.f129793a.f129788w;
            if (th2 instanceof StateLookupApiError) {
                stateLookupApiError = (StateLookupApiError) th2;
            }
            if (stateLookupApiError == null) {
                stateLookupApiError = StateLookupApiError.b.f120747a;
            }
            D10.setValue(stateLookupApiError);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.zipselector.impl.viewmodel.PostalCodeViewModel$fetchStates$2", f = "PostalCodeViewModel.kt", l = {316}, m = "invokeSuspend")
    /* renamed from: nE.b$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129794c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f129795d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14848b f129796e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f129797f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f129798g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14848b bVar, String str, String str2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f129796e = bVar;
            this.f129797f = str;
            this.f129798g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f129796e, this.f129797f, this.f129798g, eVar);
            cVar.f129795d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f129794c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f129795d;
                this.f129796e.f129786u.setValue(b.a(true));
                this.f129796e.I();
                C14766c j10 = this.f129796e.f129780o;
                String str = this.f129797f;
                this.f129795d = q11;
                this.f129794c = 1;
                Object a10 = j10.a(str, this);
                if (a10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj = a10;
            } else if (i10 == 1) {
                q10 = (Q) this.f129795d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            this.f129796e.f129771R.addAll(list);
            C14848b bVar = this.f129796e;
            Iterator it = this.f129796e.f129771R.iterator();
            if (!it.hasNext()) {
                obj2 = null;
            } else {
                obj2 = it.next();
                if (it.hasNext()) {
                    char e10 = C17542s.e(((C14764a) obj2).b(), bVar.f129772S);
                    do {
                        Object next = it.next();
                        char e11 = C17542s.e(((C14764a) next).b(), bVar.f129772S);
                        if (e10 < e11) {
                            obj2 = next;
                            e10 = e11;
                        }
                    } while (it.hasNext());
                }
            }
            C14764a aVar = (C14764a) obj2;
            if (aVar != null) {
                this.f129796e.j0(aVar);
            }
            Iterable<C14764a> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C14764a b10 : iterable) {
                arrayList.add(b10.b());
            }
            if (C16877v.y1(arrayList).size() == 1) {
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str2 == null) {
                        String a11 = C11818a.a("All available states have the same code, no need to show picker", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str2 = C11820c.a(a11);
                    }
                    if (str3 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str3;
                    bVar2.a(eVar, str4, false, (Throwable) null, str2);
                    str3 = str4;
                }
                this.f129796e.e0(this.f129797f, this.f129798g);
            }
            this.f129796e.f0();
            this.f129796e.f129786u.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"nE/b$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nE.b$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14848b f129799a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C14848b bVar) {
            super(aVar);
            this.f129799a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f129799a.f129790y.d(C14847a.C3191a.f129751a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.zipselector.impl.viewmodel.PostalCodeViewModel$findAddressesFromLocation$2", f = "PostalCodeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nE.b$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Geocoder f129801d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Location f129802e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14848b f129803f;

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"nE/b$e$a", "Landroid/location/Geocoder$GeocodeListener;", "", "Landroid/location/Address;", "addresses", "LXH/N;", "onGeocode", "(Ljava/util/List;)V", "", "errorMessage", "onError", "(Ljava/lang/String;)V", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nE.b$e$a */
        public static final class a implements Geocoder$GeocodeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C14848b f129804a;

            a(C14848b bVar) {
                this.f129804a = bVar;
            }

            public void onError(String str) {
                this.f129804a.f129790y.d(C14847a.C3191a.f129751a);
            }

            public void onGeocode(List<Address> list) {
                C17542s.j(list, "addresses");
                this.f129804a.f129790y.d(new C14847a.b(list));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Geocoder geocoder, Location location, C14848b bVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f129801d = geocoder;
            this.f129802e = location;
            this.f129803f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f129801d, this.f129802e, this.f129803f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129800c == 0) {
                y.b(obj);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.f129801d.getFromLocation(this.f129802e.getLatitude(), this.f129802e.getLongitude(), 5, C14849c.a(new a(this.f129803f)));
                } else {
                    List<Address> fromLocation = this.f129801d.getFromLocation(this.f129802e.getLatitude(), this.f129802e.getLongitude(), 5);
                    if (fromLocation == null) {
                        fromLocation = C16877v.n();
                    }
                    this.f129803f.f129790y.d(new C14847a.b(fromLocation));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0064, code lost:
        r6 = r4.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14848b(androidx.lifecycle.U r3, sf.C10242c r4, gE.C14514a r5, lE.C14766c r6) {
        /*
            r2 = this;
            java.lang.String r0 = "savedStateHandle"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "appUserDataRepository"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "zipSelectorAnalytics"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "stateLookupRemoteDataSource"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r2.<init>()
            r2.f129778m = r4
            r2.f129779n = r5
            r2.f129780o = r6
            java.lang.String r5 = "allowSamePostalCode"
            java.lang.Object r3 = r3.f(r5)
            if (r3 == 0) goto L_0x0103
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.f129781p = r3
            ip.b r5 = new ip.b
            r5.<init>()
            r2.f129782q = r5
            r2.f129783r = r5
            androidx.lifecycle.K r5 = new androidx.lifecycle.K
            r5.<init>()
            r2.f129784s = r5
            r2.f129785t = r5
            androidx.lifecycle.K r5 = new androidx.lifecycle.K
            r5.<init>()
            r2.f129786u = r5
            r2.f129787v = r5
            ip.b r5 = new ip.b
            r5.<init>()
            r2.f129788w = r5
            r2.f129789x = r5
            ip.b r5 = new ip.b
            r5.<init>()
            r2.f129790y = r5
            r2.f129792z = r5
            com.ingka.ikea.app.base.UserPostalCodeAddress r4 = r4.l()
            r2.f129754A = r4
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x006a
            java.lang.String r6 = r4.d()
            if (r6 != 0) goto L_0x006b
        L_0x006a:
            r6 = r5
        L_0x006b:
            r2.f129755B = r6
            r6 = 0
            if (r4 == 0) goto L_0x0075
            java.lang.String r0 = r4.d()
            goto L_0x0076
        L_0x0075:
            r0 = r6
        L_0x0076:
            r2.f129756C = r0
            androidx.lifecycle.K r0 = new androidx.lifecycle.K
            r0.<init>(r5)
            r2.f129757D = r0
            r2.f129758E = r0
            androidx.lifecycle.K r0 = new androidx.lifecycle.K
            r0.<init>(r6)
            r2.f129759F = r0
            r2.f129760G = r0
            androidx.lifecycle.K r0 = new androidx.lifecycle.K
            r0.<init>()
            r2.f129761H = r0
            r2.f129762I = r0
            java.lang.String r0 = r2.f129755B
            int r0 = r0.length()
            r1 = 1
            if (r0 <= 0) goto L_0x00a0
            if (r3 == 0) goto L_0x00a0
            r3 = r1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r2.f129763J = r3
            androidx.lifecycle.K r0 = new androidx.lifecycle.K
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.<init>(r3)
            r2.f129764K = r0
            r2.f129765L = r0
            androidx.lifecycle.K r3 = new androidx.lifecycle.K
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0)
            r2.f129766M = r3
            r2.f129767N = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f129771R = r3
            if (r4 == 0) goto L_0x00cd
            java.lang.String r3 = r4.c()
            goto L_0x00ce
        L_0x00cd:
            r3 = r6
        L_0x00ce:
            r2.f129772S = r3
            if (r4 == 0) goto L_0x00d7
            java.lang.String r3 = r4.c()
            goto L_0x00d8
        L_0x00d7:
            r3 = r6
        L_0x00d8:
            r2.f129774U = r3
            r2.f129775X = r1
            if (r4 == 0) goto L_0x00e2
            java.lang.String r6 = r4.d()
        L_0x00e2:
            if (r6 == 0) goto L_0x00ee
            int r3 = r6.length()
            if (r3 != 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            int r3 = Oo.b.f84616d5
            goto L_0x00f0
        L_0x00ee:
            int r3 = hE.C14538d.f127494a
        L_0x00f0:
            r2.f129776Y = r3
            androidx.lifecycle.K r4 = new androidx.lifecycle.K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r3)
            r2.f129777Z = r4
            r2.f129791y0 = r4
            r2.a0(r5)
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Required value was null."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nE.C14848b.<init>(androidx.lifecycle.U, sf.c, gE.a, lE.c):void");
    }

    /* access modifiers changed from: private */
    public final void I() {
        this.f129771R.clear();
        j0((C14764a) null);
    }

    private final void J(String str, String str2) {
        F0 unused = C16314k.d(g0.a(this), new C3192b(N.f137593c0, this), (T) null, new c(this, str, str2, (C17164e<? super c>) null), 2, (Object) null);
    }

    private final boolean X() {
        if (this.f129770Q) {
            C14764a aVar = this.f129773T;
            String b10 = aVar != null ? aVar.b() : null;
            if (b10 == null || b10.length() == 0) {
                return false;
            }
        }
        return true;
    }

    private final void b0(boolean z10) {
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
                String a10 = C11818a.a("locationServiceEnabled: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14848b.class.getName();
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
        this.f129769P = z10;
        if (!C17542s.e(this.f129764K.getValue(), Boolean.TRUE)) {
            if (z10) {
                this.f129759F.postValue(Integer.valueOf(C18146a.f148086I6));
            } else {
                this.f129759F.postValue(null);
            }
        }
    }

    private final void c0(boolean z10) {
        this.f129770Q = z10;
        if (z10) {
            f0();
        }
    }

    private final void d0(String str) {
        String str2;
        Class<C14848b> cls;
        String str3 = str;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str2 = DslKt.INDICATOR_BACKGROUND;
            cls = C14848b.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str4 == null) {
                String a10 = C11818a.a("Updating keyboard type: " + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str2 = DslKt.INDICATOR_MAIN;
                }
                str5 = str2 + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str7 = str5;
            bVar.a(eVar, str7, false, (Throwable) null, str6);
            str4 = str6;
            str5 = str7;
        }
        if (C17542s.e(str3, "NUMERIC")) {
            this.f129766M.postValue(2);
        } else if (C17542s.e(str3, "ALPHANUMERIC")) {
            this.f129766M.postValue(4097);
        } else {
            qv.e eVar2 = qv.e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a("Unknown keyboard type: " + str3, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str8 = C11820c.a(a11);
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str9, false, (Throwable) null, str8);
            }
            this.f129766M.postValue(Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT));
        }
    }

    /* access modifiers changed from: private */
    public final void e0(String str, String str2) {
        String str3 = this.f129755B;
        int length = str3.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = C17542s.l(str3.charAt(!z10 ? i10 : length), 32) <= 0;
            if (!z10) {
                if (!z11) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        this.f129755B = str3.subSequence(i10, length + 1).toString();
        UserPostalCodeAddress userPostalCodeAddress = new UserPostalCodeAddress(str, this.f129774U, (ArrayList) null, 4, (DefaultConstructorMarker) null);
        if (!C14535a.b(this.f129755B, userPostalCodeAddress, this.f129778m, this.f129779n, this.f129768O)) {
            a0(str2);
            return;
        }
        this.f129755B = str;
        this.f129782q.e(userPostalCodeAddress);
    }

    /* access modifiers changed from: private */
    public final void f0() {
        CharSequence charSequence = this.f129756C;
        boolean z10 = true;
        boolean z11 = charSequence == null || C15854t.v0(charSequence);
        K<Boolean> k10 = this.f129764K;
        if (z11 || !this.f129775X) {
            z10 = false;
        }
        k10.postValue(Boolean.valueOf(z10));
        g0();
    }

    private final void g0() {
        if (X()) {
            this.f129777Z.postValue(Integer.valueOf(this.f129776Y));
        } else {
            this.f129777Z.postValue(Integer.valueOf(Oo.b.f84458O0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(java.lang.String r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "errorText"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x001c:
            boolean r5 = r3.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r2, r9)
            if (r6 == 0) goto L_0x001c
            r4.add(r5)
            goto L_0x001c
        L_0x0034:
            java.util.Iterator r10 = r4.iterator()
            r11 = 0
            r3 = r11
            r4 = r3
        L_0x003b:
            boolean r5 = r10.hasNext()
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r12 = "main"
            java.lang.String r13 = "Kt"
            r15 = 36
            java.lang.Class<nE.b> r16 = nE.C14848b.class
            r9 = 2
            if (r5 == 0) goto L_0x00bd
            java.lang.Object r5 = r10.next()
            qv.b r5 = (qv.C11819b) r5
            r14 = 0
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = "changePostalCode"
            java.lang.String r3 = qv.C11818a.a(r3, r14)
            if (r3 != 0) goto L_0x0062
            goto L_0x00bd
        L_0x0062:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x0066:
            r19 = r3
            if (r4 != 0) goto L_0x00a8
            java.lang.String r3 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.String r4 = HJ.C15854t.s1(r3, r15, r11, r9, r11)
            r15 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r15, r11, r9, r11)
            int r9 = r4.length()
            if (r9 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            java.lang.String r3 = HJ.C15854t.P0(r4, r13)
        L_0x0086:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r9 = 1
            boolean r4 = HJ.C15854t.b0(r4, r12, r9)
            if (r4 == 0) goto L_0x0096
            r7 = r8
        L_0x0096:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L_0x00a8:
            r9 = r4
            r3 = r5
            r4 = r2
            r5 = r9
            r17 = 0
            r6 = r17
            r7 = r14
            r8 = r19
            r3.a(r4, r5, r6, r7, r8)
            r4 = r9
            r9 = r17
            r3 = r19
            goto L_0x003b
        L_0x00bd:
            java.lang.String r2 = ""
            r0.a0(r2)
            java.lang.CharSequence r2 = r0.f129756C
            if (r2 == 0) goto L_0x0100
            int r3 = r2.length()
            r4 = 1
            int r3 = r3 - r4
            r5 = 0
            r10 = 0
        L_0x00ce:
            if (r10 > r3) goto L_0x00ef
            if (r5 != 0) goto L_0x00d4
            r14 = r10
            goto L_0x00d5
        L_0x00d4:
            r14 = r3
        L_0x00d5:
            char r14 = r2.charAt(r14)
            r4 = 32
            int r4 = kotlin.jvm.internal.C17542s.l(r14, r4)
            if (r4 > 0) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r5 != 0) goto L_0x00ed
            if (r4 != 0) goto L_0x00ea
            r5 = 1
            goto L_0x00ce
        L_0x00ea:
            int r10 = r10 + 1
            goto L_0x00ce
        L_0x00ed:
            if (r4 != 0) goto L_0x00f1
        L_0x00ef:
            r4 = 1
            goto L_0x00f4
        L_0x00f1:
            int r3 = r3 + -1
            goto L_0x00ce
        L_0x00f4:
            int r3 = r3 + r4
            java.lang.CharSequence r2 = r2.subSequence(r10, r3)
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = r2.toString()
            goto L_0x0101
        L_0x0100:
            r2 = r11
        L_0x0101:
            if (r2 == 0) goto L_0x01cd
            int r3 = r2.length()
            if (r3 != 0) goto L_0x010b
            goto L_0x01cd
        L_0x010b:
            java.util.regex.Pattern r3 = r0.f129768O
            boolean r3 = hE.C14535a.a(r3, r2)
            if (r3 != 0) goto L_0x0117
            r25.a0(r26)
            return
        L_0x0117:
            boolean r3 = r25.X()
            if (r3 != 0) goto L_0x01ca
            qv.e r3 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0130:
            boolean r10 = r4.hasNext()
            r14 = 0
            if (r10 == 0) goto L_0x0149
            java.lang.Object r10 = r4.next()
            r9 = r10
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r3, r14)
            if (r9 == 0) goto L_0x0147
            r5.add(r10)
        L_0x0147:
            r9 = 2
            goto L_0x0130
        L_0x0149:
            java.util.Iterator r4 = r5.iterator()
            r5 = r11
            r9 = r5
        L_0x014f:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x01c6
            java.lang.Object r10 = r4.next()
            r19 = r10
            qv.b r19 = (qv.C11819b) r19
            r10 = 0
            if (r5 != 0) goto L_0x016d
            java.lang.String r5 = "No valid state, fetch states"
            java.lang.String r5 = qv.C11818a.a(r5, r10)
            if (r5 != 0) goto L_0x0169
            goto L_0x01c6
        L_0x0169:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x016d:
            if (r9 != 0) goto L_0x01b1
            java.lang.String r9 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 2
            java.lang.String r14 = HJ.C15854t.s1(r9, r15, r11, r10, r11)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r11, r10, r11)
            int r18 = r14.length()
            if (r18 != 0) goto L_0x0188
            goto L_0x018c
        L_0x0188:
            java.lang.String r9 = HJ.C15854t.P0(r14, r13)
        L_0x018c:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r10 = 1
            boolean r14 = HJ.C15854t.b0(r14, r12, r10)
            if (r14 == 0) goto L_0x019d
            r14 = r8
            goto L_0x019e
        L_0x019d:
            r14 = r7
        L_0x019e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            r10.append(r6)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x01b3
        L_0x01b1:
            r15 = 46
        L_0x01b3:
            r20 = r3
            r21 = r9
            r10 = 0
            r22 = r10
            r14 = 0
            r23 = r14
            r24 = r5
            r19.a(r20, r21, r22, r23, r24)
            r14 = r10
            r15 = 36
            goto L_0x014f
        L_0x01c6:
            r0.J(r2, r1)
            return
        L_0x01ca:
            r0.e0(r2, r1)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nE.C14848b.H(java.lang.String):void");
    }

    public final void K(Location location, Geocoder geocoder) {
        C17542s.j(location, "location");
        C17542s.j(geocoder, "geocoder");
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(geocoder, location, this, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final F<Boolean> L() {
        return this.f129765L;
    }

    public final F<Boolean> M() {
        return this.f129787v;
    }

    public final F<Integer> N() {
        return this.f129791y0;
    }

    public final F<Integer> O() {
        return this.f129760G;
    }

    public final F<StateLookupApiError> P() {
        return this.f129789x;
    }

    public final F<String> Q() {
        return this.f129758E;
    }

    public final F<C14847a> R() {
        return this.f129792z;
    }

    public final F<String> S() {
        return this.f129762I;
    }

    public final F<Integer> T() {
        return this.f129767N;
    }

    public final F<UserPostalCodeAddress> U() {
        return this.f129783r;
    }

    public final UserPostalCodeAddress V() {
        return this.f129754A;
    }

    public final F<List<C14764a>> W() {
        return this.f129785t;
    }

    public final void Y(PostalCodePickerConfig.AmbiguousArea ambiguousArea) {
        C17542s.j(ambiguousArea, "area");
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
                String a10 = C11818a.a("Area selected: " + ambiguousArea.a() + ", isEnabled: " + ambiguousArea.d(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14848b.class.getName();
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
        Z(!ambiguousArea.d());
        this.f129774U = ambiguousArea.a();
    }

    public final void Z(boolean z10) {
        this.f129775X = !z10;
        f0();
    }

    public final void a0(String str) {
        C17542s.j(str, "text");
        this.f129757D.postValue(str);
    }

    public final void h0(PostalCodePickerConfig postalCodePickerConfig) {
        if (postalCodePickerConfig != null) {
            this.f129768O = postalCodePickerConfig.g();
            this.f129761H.postValue(postalCodePickerConfig.e());
            b0(postalCodePickerConfig.l());
            d0(postalCodePickerConfig.f());
            c0(postalCodePickerConfig.m());
            CharSequence charSequence = this.f129756C;
            if (charSequence != null) {
                i0(charSequence);
            }
        }
    }

    public final void i0(CharSequence charSequence) {
        C17542s.j(charSequence, "postalCode");
        a0("");
        this.f129756C = charSequence;
        if (this.f129770Q) {
            I();
        }
        f0();
        if (charSequence.length() > 0) {
            this.f129759F.postValue(Integer.valueOf(C10027d.f75278i));
        } else if (this.f129769P) {
            this.f129759F.postValue(Integer.valueOf(C18146a.f148086I6));
        } else {
            this.f129759F.postValue(null);
        }
    }

    public final void j0(C14764a aVar) {
        boolean z10;
        this.f129773T = aVar;
        this.f129774U = aVar != null ? aVar.b() : null;
        K<List<C14764a>> k10 = this.f129784s;
        Iterable<C14764a> iterable = this.f129771R;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C14764a aVar2 : iterable) {
            String a10 = aVar2.a();
            String b10 = aVar2.b();
            C14764a aVar3 = this.f129773T;
            if (C17542s.e(aVar3 != null ? aVar3.b() : null, aVar2.b())) {
                C14764a aVar4 = this.f129773T;
                if (C17542s.e(aVar4 != null ? aVar4.a() : null, aVar2.a())) {
                    z10 = true;
                    arrayList.add(new C14764a(a10, b10, z10));
                }
            }
            z10 = false;
            arrayList.add(new C14764a(a10, b10, z10));
        }
        j.b(k10, arrayList);
        f0();
    }
}
