package com.ingka.ikea.boka.impl.sandbox;

import HJ.C15854t;
import MD.C13204a;
import PD.C13336a;
import PD.C13337b;
import PD.C13338c;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YC.C13857b;
import YC.C13860e;
import aA.C13909a;
import android.net.Uri;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fK.p;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 <2\u00020\u0001:\u0003=>?BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000202068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LYC/b;", "uiMode", "LPD/d;", "getWebViewUrlUseCaseImpl", "LQm/a;", "bokaAnalytics", "LPD/b;", "createWebViewCookieUseCase", "LPD/e;", "setWebViewCookieUseCase", "LPD/c;", "getWebViewCookieUseCase", "LPD/a;", "clearWebViewCookieUseCase", "LaA/a;", "sessionManager", "<init>", "(Landroidx/lifecycle/U;LYC/b;LPD/d;LQm/a;LPD/b;LPD/e;LPD/c;LPD/a;LaA/a;)V", "LXH/N;", "H", "()V", "E", "D", "G", "F", "", "url", "", "I", "(Ljava/lang/String;)Z", "m", "LQm/a;", "n", "LPD/b;", "o", "LPD/e;", "p", "LPD/c;", "q", "LPD/a;", "r", "LaA/a;", "s", "Ljava/lang/String;", "preparedUrl", "LTJ/B;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$a;", "t", "LTJ/B;", "_state", "LTJ/P;", "u", "LTJ/P;", "getState", "()LTJ/P;", "state", "v", "a", "b", "Companion", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BokaSandboxViewModel extends f0 {

    /* renamed from: v  reason: collision with root package name */
    public static final Companion f93304v = new Companion((DefaultConstructorMarker) null);

    /* renamed from: w  reason: collision with root package name */
    public static final int f93305w = 8;

    /* renamed from: m  reason: collision with root package name */
    private final Qm.a f93306m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C13337b f93307n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final PD.e f93308o;

    /* renamed from: p  reason: collision with root package name */
    private final C13338c f93309p;

    /* renamed from: q  reason: collision with root package name */
    private final C13336a f93310q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C13909a f93311r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final String f93312s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<a> f93313t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<a> f93314u;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion;", "", "<init>", "()V", "REDIRECT_URL", "", "QUERY_PARAM_STATUS", "QUERY_PARAM_STATUS_SUCCESS", "QUERY_PARAM_STATUS_CANCELLED", "BokaCookie", "ResultCookieData", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$BokaCookie;", "", "", "accessToken", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$BokaCookie;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "Companion", "$serializer", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BokaCookie {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f93318a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$BokaCookie$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$BokaCookie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<BokaCookie> serializer() {
                    return BokaSandboxViewModel$Companion$BokaCookie$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ BokaCookie(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, BokaSandboxViewModel$Companion$BokaCookie$$serializer.INSTANCE.getDescriptor());
                }
                this.f93318a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BokaCookie) && C17542s.e(this.f93318a, ((BokaCookie) obj).f93318a);
            }

            public int hashCode() {
                return this.f93318a.hashCode();
            }

            public String toString() {
                String str = this.f93318a;
                return "BokaCookie(accessToken=" + str + ")";
            }

            public BokaCookie(String str) {
                C17542s.j(str, "accessToken");
                this.f93318a = str;
            }
        }

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData;", "", "", "orderNumber", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Companion", "Remote", "$serializer", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ResultCookieData {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f93319a;

            @p
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$\u001eB%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0016¨\u0006%"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData$Remote;", "LMD/a;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData;", "", "seen0", "", "orderNumber", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrderNumber", "getOrderNumber$annotations", "()V", "Companion", "$serializer", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Remote implements C13204a<ResultCookieData> {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: a  reason: collision with root package name */
                private final String f93320a;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<Remote> serializer() {
                        return BokaSandboxViewModel$Companion$ResultCookieData$Remote$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Remote(int i10, String str, T0 t02) {
                    if (1 != (i10 & 1)) {
                        E0.b(i10, 1, BokaSandboxViewModel$Companion$ResultCookieData$Remote$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f93320a = str;
                }

                /* renamed from: b */
                public ResultCookieData a() {
                    String str = this.f93320a;
                    if (str != null) {
                        return new ResultCookieData(str);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Remote) && C17542s.e(this.f93320a, ((Remote) obj).f93320a);
                }

                public int hashCode() {
                    String str = this.f93320a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    String str = this.f93320a;
                    return "Remote(orderNumber=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$Companion$ResultCookieData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<ResultCookieData> serializer() {
                    return BokaSandboxViewModel$Companion$ResultCookieData$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ ResultCookieData(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, BokaSandboxViewModel$Companion$ResultCookieData$$serializer.INSTANCE.getDescriptor());
                }
                this.f93319a = str;
            }

            public final String a() {
                return this.f93319a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResultCookieData) && C17542s.e(this.f93319a, ((ResultCookieData) obj).f93319a);
            }

            public int hashCode() {
                return this.f93319a.hashCode();
            }

            public String toString() {
                String str = this.f93319a;
                return "ResultCookieData(orderNumber=" + str + ")";
            }

            public ResultCookieData(String str) {
                C17542s.j(str, "orderNumber");
                this.f93319a = str;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "", "d", "e", "f", "b", "a", "c", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$a;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$b;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$c;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$d;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$e;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$f;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$a;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f93324a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 932541993;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$b;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.boka.impl.sandbox.BokaSandboxViewModel$b$b  reason: collision with other inner class name */
        public static final class C2080b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2080b f93325a = new C2080b();

            private C2080b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2080b);
            }

            public int hashCode() {
                return -946978013;
            }

            public String toString() {
                return "Completed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$c;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f93326a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1686784736;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$d;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f93327a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -2067224459;
            }

            public String toString() {
                return "Initializing";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$e;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f93328a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -681868268;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b$f;", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final f f93329a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1698386555;
            }

            public String toString() {
                return "Ready";
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BokaSandboxViewModel f93330a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, BokaSandboxViewModel bokaSandboxViewModel) {
            super(aVar);
            this.f93330a = bokaSandboxViewModel;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            BokaSandboxViewModel bokaSandboxViewModel = this.f93330a;
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
                    String a10 = C11818a.a("Boka sandbox preparation failed", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bokaSandboxViewModel.getClass().getName();
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
            C16505B C10 = this.f93330a.f93313t;
            do {
                value = C10.getValue();
            } while (!C10.e(value, a.b((a) value, b.c.f93326a, (String) null, (String) null, 6, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.boka.impl.sandbox.BokaSandboxViewModel$onPageLoadComplete$2", f = "BokaSandboxViewModel.kt", l = {113}, m = "invokeSuspend")
    static final class d extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BokaSandboxViewModel f93332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BokaSandboxViewModel bokaSandboxViewModel, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f93332d = bokaSandboxViewModel;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f93332d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f93331c;
            if (i10 == 0) {
                y.b(obj);
                this.f93331c = 1;
                if (C16297b0.b(500, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B C10 = this.f93332d.f93313t;
            do {
                value = C10.getValue();
            } while (!C10.e(value, a.b((a) value, b.f.f93329a, (String) null, (String) null, 6, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BokaSandboxViewModel f93333a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, BokaSandboxViewModel bokaSandboxViewModel) {
            super(aVar);
            this.f93333a = bokaSandboxViewModel;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            BokaSandboxViewModel bokaSandboxViewModel = this.f93333a;
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
                    String a10 = C11818a.a("Boka sandbox preparation failed", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bokaSandboxViewModel.getClass().getName();
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
            C16505B C10 = this.f93333a.f93313t;
            do {
                value = C10.getValue();
            } while (!C10.e(value, a.b((a) value, b.c.f93326a, (String) null, (String) null, 6, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.boka.impl.sandbox.BokaSandboxViewModel$prepareSandbox$2", f = "BokaSandboxViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93334c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f93335d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ BokaSandboxViewModel f93336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BokaSandboxViewModel bokaSandboxViewModel, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f93336e = bokaSandboxViewModel;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(Q q10, boolean z10) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, true)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Boka Sandbox cookie set: " + z10, (Throwable) null);
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
                bVar.a(eVar, str4, true, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f93336e, eVar);
            fVar.f93335d = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93334c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f93335d;
                String invoke = this.f93336e.f93307n.invoke(new Companion.BokaCookie(this.f93336e.f93311r.h()));
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Boka Sandbox cookie prepared: " + invoke, (Throwable) null);
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
                    bVar.a(eVar, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                this.f93336e.f93308o.a(this.f93336e.f93312s, invoke, new a(q10));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public BokaSandboxViewModel(U u10, C13857b bVar, PD.d dVar, Qm.a aVar, C13337b bVar2, PD.e eVar, C13338c cVar, C13336a aVar2, C13909a aVar3) {
        U u11 = u10;
        C13857b bVar3 = bVar;
        PD.d dVar2 = dVar;
        Qm.a aVar4 = aVar;
        C13337b bVar4 = bVar2;
        PD.e eVar2 = eVar;
        C13338c cVar2 = cVar;
        C13336a aVar5 = aVar2;
        C13909a aVar6 = aVar3;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar3, "uiMode");
        C17542s.j(dVar2, "getWebViewUrlUseCaseImpl");
        C17542s.j(aVar4, "bokaAnalytics");
        C17542s.j(bVar4, "createWebViewCookieUseCase");
        C17542s.j(eVar2, "setWebViewCookieUseCase");
        C17542s.j(cVar2, "getWebViewCookieUseCase");
        C17542s.j(aVar5, "clearWebViewCookieUseCase");
        C17542s.j(aVar6, "sessionManager");
        this.f93306m = aVar4;
        this.f93307n = bVar4;
        this.f93308o = eVar2;
        this.f93309p = cVar2;
        this.f93310q = aVar5;
        this.f93311r = aVar6;
        Object f10 = u10.f("sandboxUrl");
        if (f10 != null) {
            String a10 = dVar2.a((String) f10, "http://back2app", C13857b.a.b(bVar3, (C13860e) null, 1, (Object) null));
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar3, true)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar5 : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a("Boka Sandbox url prepared: " + a10, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                if (str2 == null) {
                    String name = BokaSandboxViewModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar5.a(eVar3, str2, true, (Throwable) null, str);
            }
            this.f93312s = a10;
            C16505B<a> a12 = C16521S.a(new a((b) null, a10, (String) null, 5, (DefaultConstructorMarker) null));
            this.f93313t = a12;
            this.f93314u = C16534i.c0(a12, g0.a(this), ip.f.a(), a12.getValue());
            H();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void D() {
        a value;
        this.f93306m.b(false);
        this.f93310q.invoke();
        C16505B<a> b10 = this.f93313t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, b.a.f93324a, (String) null, (String) null, 6, (Object) null)));
    }

    private final void E() {
        a value;
        this.f93306m.b(true);
        Companion.ResultCookieData resultCookieData = (Companion.ResultCookieData) this.f93309p.a(this.f93312s, Companion.ResultCookieData.Remote.class);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Boka Sandbox: Order number: " + resultCookieData, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = BokaSandboxViewModel.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        this.f93310q.invoke();
        C16505B<a> b10 = this.f93313t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, b.C2080b.f93325a, (String) null, resultCookieData != null ? resultCookieData.a() : null, 2, (Object) null)));
    }

    private final void H() {
        a value;
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, (C17164e<? super f>) null), 2, (Object) null);
        C16505B<a> b10 = this.f93313t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, b.e.f93328a, (String) null, (String) null, 6, (Object) null)));
    }

    public final void F() {
        D();
    }

    public final void G() {
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final boolean I(String str) {
        if (str == null || !C15854t.U(str, "http://back2app", true)) {
            return false;
        }
        if (C17542s.e(Uri.parse(str).getQueryParameter("status"), "success")) {
            E();
            return true;
        }
        D();
        return true;
    }

    public final C16519P<a> getState() {
        return this.f93314u;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$a;", "", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "uiState", "", "url", "orderNumber", "<init>", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "d", "()Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$b;", "b", "Ljava/lang/String;", "e", "c", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f93321a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93322b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93323c;

        public a(b bVar, String str, String str2) {
            C17542s.j(bVar, "uiState");
            C17542s.j(str, "url");
            this.f93321a = bVar;
            this.f93322b = str;
            this.f93323c = str2;
        }

        public static /* synthetic */ a b(a aVar, b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f93321a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f93322b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f93323c;
            }
            return aVar.a(bVar, str, str2);
        }

        public final a a(b bVar, String str, String str2) {
            C17542s.j(bVar, "uiState");
            C17542s.j(str, "url");
            return new a(bVar, str, str2);
        }

        public final String c() {
            return this.f93323c;
        }

        public final b d() {
            return this.f93321a;
        }

        public final String e() {
            return this.f93322b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f93321a, aVar.f93321a) && C17542s.e(this.f93322b, aVar.f93322b) && C17542s.e(this.f93323c, aVar.f93323c);
        }

        public int hashCode() {
            int hashCode = ((this.f93321a.hashCode() * 31) + this.f93322b.hashCode()) * 31;
            String str = this.f93323c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            b bVar = this.f93321a;
            String str = this.f93322b;
            String str2 = this.f93323c;
            return "State(uiState=" + bVar + ", url=" + str + ", orderNumber=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(b bVar, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? b.d.f93327a : bVar, str, (i10 & 4) != 0 ? null : str2);
        }
    }
}
