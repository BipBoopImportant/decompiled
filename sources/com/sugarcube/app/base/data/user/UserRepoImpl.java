package com.sugarcube.app.base.data.user;

import HJ.C15854t;
import OE.C13309a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import WE.C13796a;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import android.util.Log;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.TokenStoreV2;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.AuthType;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.core.network.models.MobileDevice;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0011H@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fH@¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140!8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/sugarcube/app/base/data/user/UserRepoImpl;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "tokenStore", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "accountInteractions", "<init>", "(LOE/a;Lcom/sugarcube/app/base/network/TokenStoreV2;Lcom/sugarcube/app/base/network/NetworkClient;Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "", "hasAcknowledged", "LXH/N;", "updateHasAcknowledgedPrivacyPolicy", "(ZLdI/e;)Ljava/lang/Object;", "", "updatedPostalCode", "updatedPreferredStore", "Lcom/sugarcube/core/network/models/LoggedInUser;", "fetchUserAndTokenFromApi", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "getPartyUid", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/MobileDevice;", "mobileDevice", "updateMobileDevice", "(Lcom/sugarcube/core/network/models/MobileDevice;LdI/e;)Ljava/lang/Object;", "acknowledgePrivacyPolicy", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "Lcom/sugarcube/app/base/network/NetworkClient;", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "LTJ/B;", "isLoggedIn", "LTJ/B;", "()LTJ/B;", "user", "getUser", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserRepoImpl implements UserRepo {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final AccountInteractions accountInteractions;
    private final C16505B<Boolean> isLoggedIn = C16521S.a(Boolean.FALSE);
    /* access modifiers changed from: private */
    public final NetworkClient networkClient;
    /* access modifiers changed from: private */
    public final TokenStoreV2 tokenStore;
    private final C16505B<LoggedInUser> user = C16521S.a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.data.user.UserRepoImpl$1", f = "UserRepo.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.data.user.UserRepoImpl$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
        int label;
        final /* synthetic */ UserRepoImpl this$0;

        {
            this.this$0 = r1;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((AnonymousClass1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.label;
            if (i10 == 0) {
                y.b(obj);
                C16532g<R> s10 = C16534i.s(C16534i.n(this.this$0.tokenStore.getTokenFlow(), this.this$0.accountInteractions.getUserData(), new q<String, C13796a, C17164e<? super v<? extends String, ? extends C13796a>>, Object>((C17164e<? super AnonymousClass1>) null) {
                    /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public final Object invokeSuspend(Object obj) {
                        C17187b.f();
                        if (this.label == 0) {
                            y.b(obj);
                            return new v((String) this.L$0, (C13796a) this.L$1);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Object invoke(String str, C13796a aVar, C17164e<? super v<String, C13796a>> eVar) {
                        AnonymousClass1 r02 = 

                        public UserRepoImpl(C13309a aVar, TokenStoreV2 tokenStoreV2, NetworkClient networkClient2, AccountInteractions accountInteractions2) {
                            C17542s.j(aVar, "appEnvironment");
                            C17542s.j(tokenStoreV2, "tokenStore");
                            C17542s.j(networkClient2, "networkClient");
                            C17542s.j(accountInteractions2, "accountInteractions");
                            this.tokenStore = tokenStoreV2;
                            this.networkClient = networkClient2;
                            this.accountInteractions = accountInteractions2;
                            F0 unused = C16314k.d(aVar.b(), aVar.e(), (T) null, new AnonymousClass1(this, (C17164e<? super AnonymousClass1>) null), 2, (Object) null);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: com.sugarcube.app.base.data.user.UserRepoImpl} */
                        /* access modifiers changed from: private */
                        /* JADX WARNING: Multi-variable type inference failed */
                        /* JADX WARNING: Removed duplicated region for block: B:108:0x0397 A[SYNTHETIC, Splitter:B:108:0x0397] */
                        /* JADX WARNING: Removed duplicated region for block: B:116:0x03ca A[Catch:{ Exception -> 0x040f }] */
                        /* JADX WARNING: Removed duplicated region for block: B:119:0x03d2 A[Catch:{ Exception -> 0x040f }] */
                        /* JADX WARNING: Removed duplicated region for block: B:123:0x03e1  */
                        /* JADX WARNING: Removed duplicated region for block: B:146:0x045b A[Catch:{ Exception -> 0x040b }] */
                        /* JADX WARNING: Removed duplicated region for block: B:152:0x04a2  */
                        /* JADX WARNING: Removed duplicated region for block: B:178:0x05ae  */
                        /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ee  */
                        /* JADX WARNING: Removed duplicated region for block: B:84:0x0309  */
                        /* JADX WARNING: Removed duplicated region for block: B:85:0x030c  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
                        /* JADX WARNING: Removed duplicated region for block: B:92:0x033e A[Catch:{ Exception -> 0x0357 }] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object fetchUserAndTokenFromApi(java.lang.String r55, java.lang.String r56, dI.C17164e<? super com.sugarcube.core.network.models.LoggedInUser> r57) {
                            /*
                                r54 = this;
                                r1 = r54
                                r0 = r57
                                boolean r2 = r0 instanceof com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r0
                                com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$1 r2 = (com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$1 r2 = new com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$1
                                r2.<init>(r1, r0)
                            L_0x001c:
                                java.lang.Object r3 = r2.result
                                java.lang.Object r4 = eI.C17187b.f()
                                int r5 = r2.label
                                java.lang.String r9 = ""
                                r10 = 1
                                java.lang.String r12 = "Kt"
                                java.lang.String r15 = " "
                                r11 = 2
                                if (r5 == 0) goto L_0x00ee
                                if (r5 == r10) goto L_0x008b
                                if (r5 != r11) goto L_0x0083
                                int r0 = r2.I$6
                                int r4 = r2.I$5
                                java.lang.Object r5 = r2.L$11
                                com.sugarcube.core.network.models.LoggedInUser r5 = (com.sugarcube.core.network.models.LoggedInUser) r5
                                java.lang.Object r13 = r2.L$10
                                java.lang.String r13 = (java.lang.String) r13
                                java.lang.Object r13 = r2.L$9
                                java.lang.String r13 = (java.lang.String) r13
                                java.lang.Object r13 = r2.L$8
                                com.sugarcube.core.logger.Priority r13 = (com.sugarcube.core.logger.Priority) r13
                                java.lang.Object r13 = r2.L$7
                                com.sugarcube.app.base.data.user.UserRepoImpl r13 = (com.sugarcube.app.base.data.user.UserRepoImpl) r13
                                java.lang.Object r13 = r2.L$6
                                com.sugarcube.core.network.models.LoggedInUser r13 = (com.sugarcube.core.network.models.LoggedInUser) r13
                                java.lang.Object r13 = r2.L$5
                                com.sugarcube.core.network.models.UserResponse r13 = (com.sugarcube.core.network.models.UserResponse) r13
                                java.lang.Object r13 = r2.L$4
                                QL.x r13 = (QL.x) r13
                                java.lang.Object r13 = r2.L$3
                                dI.e r13 = (dI.C17164e) r13
                                java.lang.Object r13 = r2.L$2
                                java.lang.String r13 = (java.lang.String) r13
                                java.lang.Object r14 = r2.L$1
                                java.lang.String r14 = (java.lang.String) r14
                                java.lang.Object r2 = r2.L$0
                                com.sugarcube.app.base.data.user.UserRepoImpl r2 = (com.sugarcube.app.base.data.user.UserRepoImpl) r2
                                XH.y.b(r3)     // Catch:{ Exception -> 0x007b }
                                r1 = r0
                                r20 = r4
                                r19 = r5
                                r16 = r9
                                r17 = r12
                                r29 = r13
                                r28 = r14
                                r18 = r15
                                r0 = 0
                                goto L_0x0307
                            L_0x007b:
                                r0 = move-exception
                            L_0x007c:
                                r16 = r9
                                r17 = r12
                                r5 = r15
                                goto L_0x047b
                            L_0x0083:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r2)
                                throw r0
                            L_0x008b:
                                int r0 = r2.I$4
                                int r5 = r2.I$3
                                int r13 = r2.I$2
                                int r14 = r2.I$1
                                int r6 = r2.I$0
                                java.lang.Object r7 = r2.L$8
                                java.lang.String r7 = (java.lang.String) r7
                                java.lang.Object r8 = r2.L$7
                                java.lang.String r8 = (java.lang.String) r8
                                java.lang.Object r11 = r2.L$6
                                com.sugarcube.core.logger.Priority r11 = (com.sugarcube.core.logger.Priority) r11
                                java.lang.Object r10 = r2.L$5
                                com.sugarcube.app.base.data.user.UserRepoImpl r10 = (com.sugarcube.app.base.data.user.UserRepoImpl) r10
                                r55 = r0
                                java.lang.Object r0 = r2.L$4
                                com.sugarcube.app.base.data.user.UserRepoImpl r0 = (com.sugarcube.app.base.data.user.UserRepoImpl) r0
                                java.lang.Object r0 = r2.L$3
                                dI.e r0 = (dI.C17164e) r0
                                r56 = r0
                                java.lang.Object r0 = r2.L$2
                                java.lang.String r0 = (java.lang.String) r0
                                r57 = r0
                                java.lang.Object r0 = r2.L$1
                                java.lang.String r0 = (java.lang.String) r0
                                r16 = r0
                                java.lang.Object r0 = r2.L$0
                                r17 = r0
                                com.sugarcube.app.base.data.user.UserRepoImpl r17 = (com.sugarcube.app.base.data.user.UserRepoImpl) r17
                                XH.y.b(r3)     // Catch:{ Exception -> 0x00e4 }
                                r0 = r56
                                r1 = r10
                                r18 = r15
                                r10 = r5
                                r15 = r14
                                r5 = r16
                                r14 = r8
                                r16 = r9
                                r9 = r11
                                r8 = r3
                                r11 = r6
                                r3 = r55
                                r6 = r57
                                r53 = r13
                                r13 = r7
                                r7 = r17
                                r17 = r12
                                r12 = r53
                                goto L_0x0267
                            L_0x00e4:
                                r0 = move-exception
                                r16 = r9
                                r5 = r15
                                r2 = r17
                                r17 = r12
                                goto L_0x047b
                            L_0x00ee:
                                XH.y.b(r3)
                                com.sugarcube.core.logger.Priority r11 = com.sugarcube.core.logger.Priority.DEBUG     // Catch:{ Exception -> 0x0473 }
                                java.lang.String r8 = "making API call with provider"
                                int[] r3 = com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$$inlined$logDebug$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x0473 }
                                int r5 = r11.ordinal()     // Catch:{ Exception -> 0x0473 }
                                r3 = r3[r5]     // Catch:{ Exception -> 0x0473 }
                                java.lang.Class<com.sugarcube.app.base.data.user.UserRepoImpl> r5 = com.sugarcube.app.base.data.user.UserRepoImpl.class
                                r6 = 1
                                if (r3 == r6) goto L_0x01f1
                                r6 = 2
                                if (r3 == r6) goto L_0x01bb
                                r7 = 3
                                if (r3 == r7) goto L_0x0185
                                r7 = 4
                                if (r3 == r7) goto L_0x014e
                                r7 = 5
                                if (r3 != r7) goto L_0x0148
                                java.lang.String r3 = r5.getName()     // Catch:{ Exception -> 0x0144 }
                                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ Exception -> 0x0144 }
                                r5 = 36
                                r7 = 0
                                java.lang.String r10 = HJ.C15854t.s1(r3, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                r5 = 46
                                java.lang.String r10 = HJ.C15854t.o1(r10, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                int r5 = r10.length()     // Catch:{ Exception -> 0x0144 }
                                if (r5 != 0) goto L_0x0129
                                goto L_0x012d
                            L_0x0129:
                                java.lang.String r3 = HJ.C15854t.P0(r10, r12)     // Catch:{ Exception -> 0x0144 }
                            L_0x012d:
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
                                r5.<init>()     // Catch:{ Exception -> 0x0144 }
                                r5.append(r8)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r15)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r9)     // Catch:{ Exception -> 0x0144 }
                                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0144 }
                                android.util.Log.e(r3, r5)     // Catch:{ Exception -> 0x0144 }
                                goto L_0x0226
                            L_0x0144:
                                r0 = move-exception
                                r2 = r1
                                goto L_0x007c
                            L_0x0148:
                                XH.t r0 = new XH.t     // Catch:{ Exception -> 0x0144 }
                                r0.<init>()     // Catch:{ Exception -> 0x0144 }
                                throw r0     // Catch:{ Exception -> 0x0144 }
                            L_0x014e:
                                java.lang.String r3 = r5.getName()     // Catch:{ Exception -> 0x0144 }
                                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ Exception -> 0x0144 }
                                r5 = 36
                                r6 = 2
                                r7 = 0
                                java.lang.String r10 = HJ.C15854t.s1(r3, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                r5 = 46
                                java.lang.String r10 = HJ.C15854t.o1(r10, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                int r5 = r10.length()     // Catch:{ Exception -> 0x0144 }
                                if (r5 != 0) goto L_0x016a
                                goto L_0x016e
                            L_0x016a:
                                java.lang.String r3 = HJ.C15854t.P0(r10, r12)     // Catch:{ Exception -> 0x0144 }
                            L_0x016e:
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
                                r5.<init>()     // Catch:{ Exception -> 0x0144 }
                                r5.append(r8)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r15)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r9)     // Catch:{ Exception -> 0x0144 }
                                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0144 }
                                android.util.Log.w(r3, r5)     // Catch:{ Exception -> 0x0144 }
                                goto L_0x0226
                            L_0x0185:
                                java.lang.String r3 = r5.getName()     // Catch:{ Exception -> 0x0144 }
                                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ Exception -> 0x0144 }
                                r5 = 36
                                r6 = 2
                                r7 = 0
                                java.lang.String r10 = HJ.C15854t.s1(r3, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                r5 = 46
                                java.lang.String r10 = HJ.C15854t.o1(r10, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                int r5 = r10.length()     // Catch:{ Exception -> 0x0144 }
                                if (r5 != 0) goto L_0x01a1
                                goto L_0x01a5
                            L_0x01a1:
                                java.lang.String r3 = HJ.C15854t.P0(r10, r12)     // Catch:{ Exception -> 0x0144 }
                            L_0x01a5:
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
                                r5.<init>()     // Catch:{ Exception -> 0x0144 }
                                r5.append(r8)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r15)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r9)     // Catch:{ Exception -> 0x0144 }
                                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0144 }
                                android.util.Log.i(r3, r5)     // Catch:{ Exception -> 0x0144 }
                                goto L_0x0226
                            L_0x01bb:
                                java.lang.String r3 = r5.getName()     // Catch:{ Exception -> 0x0144 }
                                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ Exception -> 0x0144 }
                                r5 = 36
                                r6 = 2
                                r7 = 0
                                java.lang.String r10 = HJ.C15854t.s1(r3, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                r5 = 46
                                java.lang.String r10 = HJ.C15854t.o1(r10, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0144 }
                                int r5 = r10.length()     // Catch:{ Exception -> 0x0144 }
                                if (r5 != 0) goto L_0x01d7
                                goto L_0x01db
                            L_0x01d7:
                                java.lang.String r3 = HJ.C15854t.P0(r10, r12)     // Catch:{ Exception -> 0x0144 }
                            L_0x01db:
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
                                r5.<init>()     // Catch:{ Exception -> 0x0144 }
                                r5.append(r8)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r15)     // Catch:{ Exception -> 0x0144 }
                                r5.append(r9)     // Catch:{ Exception -> 0x0144 }
                                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0144 }
                                android.util.Log.d(r3, r5)     // Catch:{ Exception -> 0x0144 }
                                goto L_0x0226
                            L_0x01f1:
                                java.lang.String r3 = r5.getName()     // Catch:{ Exception -> 0x0473 }
                                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ Exception -> 0x0473 }
                                r5 = 36
                                r6 = 2
                                r7 = 0
                                java.lang.String r10 = HJ.C15854t.s1(r3, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0473 }
                                r5 = 46
                                java.lang.String r10 = HJ.C15854t.o1(r10, r5, r7, r6, r7)     // Catch:{ Exception -> 0x0473 }
                                int r5 = r10.length()     // Catch:{ Exception -> 0x0473 }
                                if (r5 != 0) goto L_0x020d
                                goto L_0x0211
                            L_0x020d:
                                java.lang.String r3 = HJ.C15854t.P0(r10, r12)     // Catch:{ Exception -> 0x0473 }
                            L_0x0211:
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0473 }
                                r5.<init>()     // Catch:{ Exception -> 0x0473 }
                                r5.append(r8)     // Catch:{ Exception -> 0x0473 }
                                r5.append(r15)     // Catch:{ Exception -> 0x0473 }
                                r5.append(r9)     // Catch:{ Exception -> 0x0473 }
                                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0473 }
                                android.util.Log.v(r3, r5)     // Catch:{ Exception -> 0x0473 }
                            L_0x0226:
                                com.sugarcube.app.base.network.NetworkClient r3 = r1.networkClient     // Catch:{ Exception -> 0x0473 }
                                com.sugarcube.core.network.api.NetworkAPIs r3 = r3.api()     // Catch:{ Exception -> 0x0473 }
                                r2.L$0 = r1     // Catch:{ Exception -> 0x0473 }
                                r5 = r55
                                r2.L$1 = r5     // Catch:{ Exception -> 0x0473 }
                                r6 = r56
                                r2.L$2 = r6     // Catch:{ Exception -> 0x0473 }
                                r2.L$3 = r0     // Catch:{ Exception -> 0x0473 }
                                r2.L$4 = r1     // Catch:{ Exception -> 0x0473 }
                                r2.L$5 = r1     // Catch:{ Exception -> 0x0473 }
                                r2.L$6 = r11     // Catch:{ Exception -> 0x0473 }
                                r2.L$7 = r8     // Catch:{ Exception -> 0x0473 }
                                r2.L$8 = r9     // Catch:{ Exception -> 0x0473 }
                                r7 = 0
                                r2.I$0 = r7     // Catch:{ Exception -> 0x0473 }
                                r2.I$1 = r7     // Catch:{ Exception -> 0x0473 }
                                r2.I$2 = r7     // Catch:{ Exception -> 0x0473 }
                                r2.I$3 = r7     // Catch:{ Exception -> 0x0473 }
                                r2.I$4 = r7     // Catch:{ Exception -> 0x0473 }
                                r7 = 1
                                r2.label = r7     // Catch:{ Exception -> 0x0473 }
                                java.lang.Object r3 = r3.getUser(r2)     // Catch:{ Exception -> 0x0473 }
                                if (r3 != r4) goto L_0x0257
                                return r4
                            L_0x0257:
                                r7 = r1
                                r14 = r8
                                r13 = r9
                                r16 = r13
                                r9 = r11
                                r17 = r12
                                r18 = r15
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r15 = 0
                                r8 = r3
                                r3 = 0
                            L_0x0267:
                                QL.x r8 = (QL.x) r8     // Catch:{ Exception -> 0x040f }
                                java.lang.Object r19 = r8.a()     // Catch:{ Exception -> 0x040f }
                                r20 = r4
                                r4 = r19
                                com.sugarcube.core.network.models.UserResponse r4 = (com.sugarcube.core.network.models.UserResponse) r4     // Catch:{ Exception -> 0x040f }
                                boolean r19 = r8.e()     // Catch:{ Exception -> 0x040f }
                                if (r19 == 0) goto L_0x038b
                                if (r4 == 0) goto L_0x038b
                                r19 = r3
                                YE.b r3 = YE.C13868b.f118106a     // Catch:{ Exception -> 0x0388 }
                                r55 = r10
                                java.lang.Integer r10 = r4.getWid()     // Catch:{ Exception -> 0x0388 }
                                r56 = r12
                                boolean r12 = r4.isLoggedIn()     // Catch:{ Exception -> 0x0388 }
                                r57 = r15
                                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0388 }
                                r15.<init>()     // Catch:{ Exception -> 0x0388 }
                                r21 = r11
                                java.lang.String r11 = "user fetched ("
                                r15.append(r11)     // Catch:{ Exception -> 0x0388 }
                                r15.append(r10)     // Catch:{ Exception -> 0x0388 }
                                java.lang.String r10 = ","
                                r15.append(r10)     // Catch:{ Exception -> 0x0388 }
                                r15.append(r12)     // Catch:{ Exception -> 0x0388 }
                                java.lang.String r10 = ")"
                                r15.append(r10)     // Catch:{ Exception -> 0x0388 }
                                java.lang.String r10 = r15.toString()     // Catch:{ Exception -> 0x0388 }
                                YE.e r11 = YE.e.Meta     // Catch:{ Exception -> 0x0388 }
                                r3.b(r10, r11)     // Catch:{ Exception -> 0x0388 }
                                com.sugarcube.app.base.network.NetworkClient r3 = r7.networkClient     // Catch:{ Exception -> 0x0388 }
                                java.lang.String r3 = r3.latestBaseURL()     // Catch:{ Exception -> 0x0388 }
                                com.sugarcube.core.network.models.AuthType r10 = com.sugarcube.core.network.models.AuthType.LOGIN     // Catch:{ Exception -> 0x0388 }
                                com.sugarcube.core.network.models.LoggedInUser r3 = com.sugarcube.core.network.models.UserResponseKt.asLoggedInUser(r4, r3, r10)     // Catch:{ Exception -> 0x0388 }
                                r2.L$0 = r7     // Catch:{ Exception -> 0x0388 }
                                r2.L$1 = r5     // Catch:{ Exception -> 0x0388 }
                                r2.L$2 = r6     // Catch:{ Exception -> 0x0388 }
                                r2.L$3 = r0     // Catch:{ Exception -> 0x0388 }
                                r2.L$4 = r8     // Catch:{ Exception -> 0x0388 }
                                r2.L$5 = r4     // Catch:{ Exception -> 0x0388 }
                                r2.L$6 = r3     // Catch:{ Exception -> 0x0388 }
                                r2.L$7 = r1     // Catch:{ Exception -> 0x0388 }
                                r2.L$8 = r9     // Catch:{ Exception -> 0x0388 }
                                r2.L$9 = r14     // Catch:{ Exception -> 0x0388 }
                                r2.L$10 = r13     // Catch:{ Exception -> 0x0388 }
                                r2.L$11 = r3     // Catch:{ Exception -> 0x0388 }
                                r0 = r21
                                r2.I$0 = r0     // Catch:{ Exception -> 0x0388 }
                                r14 = r57
                                r2.I$1 = r14     // Catch:{ Exception -> 0x0388 }
                                r13 = r56
                                r2.I$2 = r13     // Catch:{ Exception -> 0x0388 }
                                r0 = r55
                                r2.I$3 = r0     // Catch:{ Exception -> 0x0388 }
                                r0 = r19
                                r2.I$4 = r0     // Catch:{ Exception -> 0x0388 }
                                r0 = 0
                                r2.I$5 = r0     // Catch:{ Exception -> 0x0388 }
                                r2.I$6 = r0     // Catch:{ Exception -> 0x0388 }
                                r1 = 2
                                r2.label = r1     // Catch:{ Exception -> 0x0388 }
                                java.lang.Object r1 = r7.getPartyUid(r2)     // Catch:{ Exception -> 0x0388 }
                                r2 = r20
                                if (r1 != r2) goto L_0x02fb
                                return r2
                            L_0x02fb:
                                r20 = r0
                                r19 = r3
                                r28 = r5
                                r29 = r6
                                r2 = r7
                                r3 = r1
                                r1 = r20
                            L_0x0307:
                                if (r1 == 0) goto L_0x030c
                                r24 = 1
                                goto L_0x030e
                            L_0x030c:
                                r24 = r0
                            L_0x030e:
                                r27 = r3
                                java.lang.String r27 = (java.lang.String) r27     // Catch:{ Exception -> 0x0357 }
                                r34 = 15487(0x3c7f, float:2.1702E-41)
                                r35 = 0
                                r25 = 0
                                r26 = 0
                                r23 = 0
                                r22 = 0
                                r21 = 0
                                r30 = 0
                                r31 = 0
                                r32 = 0
                                r33 = 0
                                com.sugarcube.core.network.models.LoggedInUser r0 = com.sugarcube.core.network.models.LoggedInUser.copy$default(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x0357 }
                                TJ.B r1 = r2.getUser()     // Catch:{ Exception -> 0x0357 }
                                java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0357 }
                                com.sugarcube.core.network.models.LoggedInUser r1 = (com.sugarcube.core.network.models.LoggedInUser) r1     // Catch:{ Exception -> 0x0357 }
                                if (r1 == 0) goto L_0x0387
                                boolean r3 = com.sugarcube.app.base.data.user.UserRepoKt.isSameUserAs(r0, r1)     // Catch:{ Exception -> 0x0357 }
                                if (r3 == 0) goto L_0x0387
                                boolean r48 = r1.getHasDesigns()     // Catch:{ Exception -> 0x0357 }
                                boolean r47 = r1.getHasScenes()     // Catch:{ Exception -> 0x0357 }
                                com.sugarcube.core.network.models.MobileDevice r43 = r1.getMobileDevice()     // Catch:{ Exception -> 0x0357 }
                                java.lang.String r3 = r0.getPostalCode()     // Catch:{ Exception -> 0x0357 }
                                if (r3 != 0) goto L_0x0354
                                java.lang.String r3 = r1.getPostalCode()     // Catch:{ Exception -> 0x0357 }
                            L_0x0354:
                                r45 = r3
                                goto L_0x035c
                            L_0x0357:
                                r0 = move-exception
                            L_0x0358:
                                r5 = r18
                                goto L_0x047b
                            L_0x035c:
                                java.lang.String r3 = r0.getPreferredStore()     // Catch:{ Exception -> 0x0357 }
                                if (r3 != 0) goto L_0x0369
                                java.lang.String r1 = r1.getPreferredStore()     // Catch:{ Exception -> 0x0357 }
                                r46 = r1
                                goto L_0x036b
                            L_0x0369:
                                r46 = r3
                            L_0x036b:
                                r51 = 12479(0x30bf, float:1.7487E-41)
                                r52 = 0
                                r37 = 0
                                r38 = 0
                                r39 = 0
                                r40 = 0
                                r41 = 0
                                r42 = 0
                                r44 = 0
                                r49 = 0
                                r50 = 0
                                r36 = r0
                                com.sugarcube.core.network.models.LoggedInUser r0 = com.sugarcube.core.network.models.LoggedInUser.copy$default(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ Exception -> 0x0357 }
                            L_0x0387:
                                return r0
                            L_0x0388:
                                r0 = move-exception
                                r2 = r7
                                goto L_0x0358
                            L_0x038b:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x040f }
                                int r1 = r8.b()     // Catch:{ Exception -> 0x040f }
                                GK.E r2 = r8.d()     // Catch:{ Exception -> 0x040f }
                                if (r2 == 0) goto L_0x03a5
                                byte[] r2 = r2.d()     // Catch:{ Exception -> 0x0388 }
                                if (r2 == 0) goto L_0x03a5
                                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0388 }
                                java.nio.charset.Charset r4 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x0388 }
                                r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0388 }
                                goto L_0x03a6
                            L_0x03a5:
                                r3 = 0
                            L_0x03a6:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040f }
                                r2.<init>()     // Catch:{ Exception -> 0x040f }
                                java.lang.String r4 = "Failed to fetch user information, code "
                                r2.append(r4)     // Catch:{ Exception -> 0x040f }
                                r2.append(r1)     // Catch:{ Exception -> 0x040f }
                                java.lang.String r1 = ": "
                                r2.append(r1)     // Catch:{ Exception -> 0x040f }
                                r2.append(r3)     // Catch:{ Exception -> 0x040f }
                                java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x040f }
                                r0.<init>(r1)     // Catch:{ Exception -> 0x040f }
                                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.ERROR     // Catch:{ Exception -> 0x040f }
                                java.lang.String r2 = r0.getMessage()     // Catch:{ Exception -> 0x040f }
                                if (r2 != 0) goto L_0x03cc
                                r2 = r16
                            L_0x03cc:
                                java.lang.String r3 = XH.C16816g.b(r0)     // Catch:{ Exception -> 0x040f }
                                if (r3 != 0) goto L_0x03d4
                                r3 = r16
                            L_0x03d4:
                                int[] r4 = com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$$inlined$logError$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x040f }
                                int r1 = r1.ordinal()     // Catch:{ Exception -> 0x040f }
                                r1 = r4[r1]     // Catch:{ Exception -> 0x040f }
                                java.lang.String r4 = "Sugarcube"
                                r5 = 1
                                if (r1 == r5) goto L_0x045b
                                r5 = 2
                                if (r1 == r5) goto L_0x0443
                                r5 = 3
                                if (r1 == r5) goto L_0x042b
                                r5 = 4
                                if (r1 == r5) goto L_0x0413
                                r5 = 5
                                if (r1 == r5) goto L_0x03f3
                                XH.t r0 = new XH.t     // Catch:{ Exception -> 0x0388 }
                                r0.<init>()     // Catch:{ Exception -> 0x0388 }
                                throw r0     // Catch:{ Exception -> 0x0388 }
                            L_0x03f3:
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040f }
                                r1.<init>()     // Catch:{ Exception -> 0x040f }
                                r1.append(r2)     // Catch:{ Exception -> 0x040f }
                                r5 = r18
                                r1.append(r5)     // Catch:{ Exception -> 0x040b }
                                r1.append(r3)     // Catch:{ Exception -> 0x040b }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040b }
                                android.util.Log.e(r4, r1)     // Catch:{ Exception -> 0x040b }
                                goto L_0x0472
                            L_0x040b:
                                r0 = move-exception
                            L_0x040c:
                                r2 = r7
                                goto L_0x047b
                            L_0x040f:
                                r0 = move-exception
                                r5 = r18
                                goto L_0x040c
                            L_0x0413:
                                r5 = r18
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040b }
                                r1.<init>()     // Catch:{ Exception -> 0x040b }
                                r1.append(r2)     // Catch:{ Exception -> 0x040b }
                                r1.append(r5)     // Catch:{ Exception -> 0x040b }
                                r1.append(r3)     // Catch:{ Exception -> 0x040b }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040b }
                                android.util.Log.w(r4, r1)     // Catch:{ Exception -> 0x040b }
                                goto L_0x0472
                            L_0x042b:
                                r5 = r18
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040b }
                                r1.<init>()     // Catch:{ Exception -> 0x040b }
                                r1.append(r2)     // Catch:{ Exception -> 0x040b }
                                r1.append(r5)     // Catch:{ Exception -> 0x040b }
                                r1.append(r3)     // Catch:{ Exception -> 0x040b }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040b }
                                android.util.Log.i(r4, r1)     // Catch:{ Exception -> 0x040b }
                                goto L_0x0472
                            L_0x0443:
                                r5 = r18
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040b }
                                r1.<init>()     // Catch:{ Exception -> 0x040b }
                                r1.append(r2)     // Catch:{ Exception -> 0x040b }
                                r1.append(r5)     // Catch:{ Exception -> 0x040b }
                                r1.append(r3)     // Catch:{ Exception -> 0x040b }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040b }
                                android.util.Log.d(r4, r1)     // Catch:{ Exception -> 0x040b }
                                goto L_0x0472
                            L_0x045b:
                                r5 = r18
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040b }
                                r1.<init>()     // Catch:{ Exception -> 0x040b }
                                r1.append(r2)     // Catch:{ Exception -> 0x040b }
                                r1.append(r5)     // Catch:{ Exception -> 0x040b }
                                r1.append(r3)     // Catch:{ Exception -> 0x040b }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040b }
                                android.util.Log.v(r4, r1)     // Catch:{ Exception -> 0x040b }
                            L_0x0472:
                                throw r0     // Catch:{ Exception -> 0x040b }
                            L_0x0473:
                                r0 = move-exception
                                r16 = r9
                                r17 = r12
                                r5 = r15
                                r2 = r54
                            L_0x047b:
                                YE.b r1 = YE.C13868b.f118106a
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                java.lang.String r4 = "user api exception "
                                r3.append(r4)
                                r3.append(r0)
                                java.lang.String r0 = r3.toString()
                                YE.e r3 = YE.e.Network
                                r1.b(r0, r3)
                                com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.DEBUG
                                int[] r3 = com.sugarcube.app.base.data.user.UserRepoImpl$fetchUserAndTokenFromApi$$inlined$logDebug$default$2$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
                                int r0 = r0.ordinal()
                                r0 = r3[r0]
                                java.lang.String r3 = "user not updated"
                                r4 = 1
                                if (r0 == r4) goto L_0x05ae
                                r4 = 2
                                if (r0 == r4) goto L_0x0570
                                r6 = 3
                                if (r0 == r6) goto L_0x0531
                                r6 = 4
                                if (r0 == r6) goto L_0x04f2
                                r6 = 5
                                if (r0 != r6) goto L_0x04ec
                                java.lang.Class r0 = r2.getClass()
                                java.lang.String r0 = r0.getName()
                                kotlin.jvm.internal.C17542s.g(r0)
                                r2 = 36
                                r6 = 0
                                java.lang.String r2 = HJ.C15854t.s1(r0, r2, r6, r4, r6)
                                r7 = 46
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r6, r4, r6)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x04cd
                                goto L_0x04d3
                            L_0x04cd:
                                r4 = r17
                                java.lang.String r0 = HJ.C15854t.P0(r2, r4)
                            L_0x04d3:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r5)
                                r6 = r16
                                r2.append(r6)
                                java.lang.String r2 = r2.toString()
                                android.util.Log.e(r0, r2)
                                goto L_0x05eb
                            L_0x04ec:
                                XH.t r0 = new XH.t
                                r0.<init>()
                                throw r0
                            L_0x04f2:
                                r6 = r16
                                r4 = r17
                                java.lang.Class r0 = r2.getClass()
                                java.lang.String r0 = r0.getName()
                                kotlin.jvm.internal.C17542s.g(r0)
                                r2 = 36
                                r7 = 2
                                r8 = 0
                                java.lang.String r2 = HJ.C15854t.s1(r0, r2, r8, r7, r8)
                                r9 = 46
                                java.lang.String r2 = HJ.C15854t.o1(r2, r9, r8, r7, r8)
                                int r7 = r2.length()
                                if (r7 != 0) goto L_0x0516
                                goto L_0x051a
                            L_0x0516:
                                java.lang.String r0 = HJ.C15854t.P0(r2, r4)
                            L_0x051a:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r5)
                                r2.append(r6)
                                java.lang.String r2 = r2.toString()
                                android.util.Log.w(r0, r2)
                                goto L_0x05eb
                            L_0x0531:
                                r6 = r16
                                r4 = r17
                                java.lang.Class r0 = r2.getClass()
                                java.lang.String r0 = r0.getName()
                                kotlin.jvm.internal.C17542s.g(r0)
                                r2 = 36
                                r7 = 2
                                r8 = 0
                                java.lang.String r2 = HJ.C15854t.s1(r0, r2, r8, r7, r8)
                                r9 = 46
                                java.lang.String r2 = HJ.C15854t.o1(r2, r9, r8, r7, r8)
                                int r7 = r2.length()
                                if (r7 != 0) goto L_0x0555
                                goto L_0x0559
                            L_0x0555:
                                java.lang.String r0 = HJ.C15854t.P0(r2, r4)
                            L_0x0559:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r5)
                                r2.append(r6)
                                java.lang.String r2 = r2.toString()
                                android.util.Log.i(r0, r2)
                                goto L_0x05eb
                            L_0x0570:
                                r6 = r16
                                r4 = r17
                                java.lang.Class r0 = r2.getClass()
                                java.lang.String r0 = r0.getName()
                                kotlin.jvm.internal.C17542s.g(r0)
                                r2 = 36
                                r7 = 2
                                r8 = 0
                                java.lang.String r2 = HJ.C15854t.s1(r0, r2, r8, r7, r8)
                                r9 = 46
                                java.lang.String r2 = HJ.C15854t.o1(r2, r9, r8, r7, r8)
                                int r7 = r2.length()
                                if (r7 != 0) goto L_0x0594
                                goto L_0x0598
                            L_0x0594:
                                java.lang.String r0 = HJ.C15854t.P0(r2, r4)
                            L_0x0598:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r5)
                                r2.append(r6)
                                java.lang.String r2 = r2.toString()
                                android.util.Log.d(r0, r2)
                                goto L_0x05eb
                            L_0x05ae:
                                r6 = r16
                                r4 = r17
                                java.lang.Class r0 = r2.getClass()
                                java.lang.String r0 = r0.getName()
                                kotlin.jvm.internal.C17542s.g(r0)
                                r2 = 36
                                r7 = 2
                                r8 = 0
                                java.lang.String r2 = HJ.C15854t.s1(r0, r2, r8, r7, r8)
                                r9 = 46
                                java.lang.String r2 = HJ.C15854t.o1(r2, r9, r8, r7, r8)
                                int r7 = r2.length()
                                if (r7 != 0) goto L_0x05d2
                                goto L_0x05d6
                            L_0x05d2:
                                java.lang.String r0 = HJ.C15854t.P0(r2, r4)
                            L_0x05d6:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r5)
                                r2.append(r6)
                                java.lang.String r2 = r2.toString()
                                android.util.Log.v(r0, r2)
                            L_0x05eb:
                                java.lang.String r0 = "user was not updated"
                                YE.e r2 = YE.e.Meta
                                r1.b(r0, r2)
                                r1 = 0
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.UserRepoImpl.fetchUserAndTokenFromApi(java.lang.String, java.lang.String, dI.e):java.lang.Object");
                        }

                        /* access modifiers changed from: private */
                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC, Splitter:B:18:0x0051] */
                        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object getPartyUid(dI.C17164e<? super java.lang.String> r11) {
                            /*
                                r10 = this;
                                boolean r0 = r11 instanceof com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r11
                                com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$1 r0 = (com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$1 r0 = new com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$1
                                r0.<init>(r10, r11)
                            L_0x0018:
                                java.lang.Object r1 = r0.result
                                java.lang.Object r2 = eI.C17187b.f()
                                int r3 = r0.label
                                r4 = 1
                                if (r3 == 0) goto L_0x0039
                                if (r3 != r4) goto L_0x0031
                                java.lang.Object r11 = r0.L$1
                                dI.e r11 = (dI.C17164e) r11
                                java.lang.Object r11 = r0.L$0
                                com.sugarcube.app.base.data.user.UserRepoImpl r11 = (com.sugarcube.app.base.data.user.UserRepoImpl) r11
                                XH.y.b(r1)
                                goto L_0x004c
                            L_0x0031:
                                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r11.<init>(r0)
                                throw r11
                            L_0x0039:
                                XH.y.b(r1)
                                com.sugarcube.app.base.network.TokenStoreV2 r1 = r10.tokenStore
                                r0.L$0 = r10
                                r0.L$1 = r11
                                r0.label = r4
                                java.lang.Object r1 = r1.getToken(r0)
                                if (r1 != r2) goto L_0x004b
                                return r2
                            L_0x004b:
                                r11 = r10
                            L_0x004c:
                                java.lang.String r1 = (java.lang.String) r1
                                r0 = 0
                                if (r1 == 0) goto L_0x01a8
                                com.auth0.android.jwt.JWT r2 = new com.auth0.android.jwt.JWT     // Catch:{ all -> 0x0062 }
                                r2.<init>(r1)     // Catch:{ all -> 0x0062 }
                                java.lang.String r1 = "https://accounts.ikea.com/partyUId"
                                com.auth0.android.jwt.b r1 = r2.c(r1)     // Catch:{ all -> 0x0062 }
                                java.lang.String r0 = r1.a()     // Catch:{ all -> 0x0062 }
                                goto L_0x01a8
                            L_0x0062:
                                r1 = move-exception
                                com.sugarcube.core.logger.Priority r2 = com.sugarcube.core.logger.Priority.DEBUG
                                java.lang.String r1 = r1.getLocalizedMessage()
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                java.lang.String r5 = "Can not parse partyUid - "
                                r3.append(r5)
                                r3.append(r1)
                                java.lang.String r1 = r3.toString()
                                java.lang.String r3 = ""
                                if (r1 != 0) goto L_0x007f
                                r1 = r3
                            L_0x007f:
                                int[] r5 = com.sugarcube.app.base.data.user.UserRepoImpl$getPartyUid$lambda$5$$inlined$logDebug$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
                                int r2 = r2.ordinal()
                                r2 = r5[r2]
                                java.lang.String r5 = " "
                                java.lang.String r6 = "Kt"
                                r7 = 46
                                r8 = 36
                                r9 = 2
                                if (r2 == r4) goto L_0x0175
                                if (r2 == r9) goto L_0x0141
                                r4 = 3
                                if (r2 == r4) goto L_0x010d
                                r4 = 4
                                if (r2 == r4) goto L_0x00d8
                                r4 = 5
                                if (r2 != r4) goto L_0x00d2
                                java.lang.Class r11 = r11.getClass()
                                java.lang.String r11 = r11.getName()
                                kotlin.jvm.internal.C17542s.g(r11)
                                java.lang.String r2 = HJ.C15854t.s1(r11, r8, r0, r9, r0)
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r0, r9, r0)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x00b7
                                goto L_0x00bb
                            L_0x00b7:
                                java.lang.String r11 = HJ.C15854t.P0(r2, r6)
                            L_0x00bb:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r1)
                                r2.append(r5)
                                r2.append(r3)
                                java.lang.String r1 = r2.toString()
                                android.util.Log.e(r11, r1)
                                goto L_0x01a8
                            L_0x00d2:
                                XH.t r11 = new XH.t
                                r11.<init>()
                                throw r11
                            L_0x00d8:
                                java.lang.Class r11 = r11.getClass()
                                java.lang.String r11 = r11.getName()
                                kotlin.jvm.internal.C17542s.g(r11)
                                java.lang.String r2 = HJ.C15854t.s1(r11, r8, r0, r9, r0)
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r0, r9, r0)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x00f2
                                goto L_0x00f6
                            L_0x00f2:
                                java.lang.String r11 = HJ.C15854t.P0(r2, r6)
                            L_0x00f6:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r1)
                                r2.append(r5)
                                r2.append(r3)
                                java.lang.String r1 = r2.toString()
                                android.util.Log.w(r11, r1)
                                goto L_0x01a8
                            L_0x010d:
                                java.lang.Class r11 = r11.getClass()
                                java.lang.String r11 = r11.getName()
                                kotlin.jvm.internal.C17542s.g(r11)
                                java.lang.String r2 = HJ.C15854t.s1(r11, r8, r0, r9, r0)
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r0, r9, r0)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x0127
                                goto L_0x012b
                            L_0x0127:
                                java.lang.String r11 = HJ.C15854t.P0(r2, r6)
                            L_0x012b:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r1)
                                r2.append(r5)
                                r2.append(r3)
                                java.lang.String r1 = r2.toString()
                                android.util.Log.i(r11, r1)
                                goto L_0x01a8
                            L_0x0141:
                                java.lang.Class r11 = r11.getClass()
                                java.lang.String r11 = r11.getName()
                                kotlin.jvm.internal.C17542s.g(r11)
                                java.lang.String r2 = HJ.C15854t.s1(r11, r8, r0, r9, r0)
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r0, r9, r0)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x015b
                                goto L_0x015f
                            L_0x015b:
                                java.lang.String r11 = HJ.C15854t.P0(r2, r6)
                            L_0x015f:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r1)
                                r2.append(r5)
                                r2.append(r3)
                                java.lang.String r1 = r2.toString()
                                android.util.Log.d(r11, r1)
                                goto L_0x01a8
                            L_0x0175:
                                java.lang.Class r11 = r11.getClass()
                                java.lang.String r11 = r11.getName()
                                kotlin.jvm.internal.C17542s.g(r11)
                                java.lang.String r2 = HJ.C15854t.s1(r11, r8, r0, r9, r0)
                                java.lang.String r2 = HJ.C15854t.o1(r2, r7, r0, r9, r0)
                                int r4 = r2.length()
                                if (r4 != 0) goto L_0x018f
                                goto L_0x0193
                            L_0x018f:
                                java.lang.String r11 = HJ.C15854t.P0(r2, r6)
                            L_0x0193:
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r1)
                                r2.append(r5)
                                r2.append(r3)
                                java.lang.String r1 = r2.toString()
                                android.util.Log.v(r11, r1)
                            L_0x01a8:
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.UserRepoImpl.getPartyUid(dI.e):java.lang.Object");
                        }

                        /* access modifiers changed from: private */
                        public final Object updateHasAcknowledgedPrivacyPolicy(boolean z10, C17164e<? super C16807N> eVar) {
                            LoggedInUser value = getUser().getValue();
                            if (value == null) {
                                return C16807N.f139792a;
                            }
                            Object emit = getUser().emit(LoggedInUser.copy$default(value, 0, (String) null, (String) null, (AuthType) null, false, (Map) null, (MobileDevice) null, (String) null, (String) null, (String) null, false, false, b.a(z10), (String) null, 12287, (Object) null), eVar);
                            return emit == C17187b.f() ? emit : C16807N.f139792a;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb A[Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }, RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc A[Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Object acknowledgePrivacyPolicy(dI.C17164e<? super java.lang.Boolean> r13) {
                            /*
                                r12 = this;
                                boolean r0 = r13 instanceof com.sugarcube.app.base.data.user.UserRepoImpl$acknowledgePrivacyPolicy$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r13
                                com.sugarcube.app.base.data.user.UserRepoImpl$acknowledgePrivacyPolicy$1 r0 = (com.sugarcube.app.base.data.user.UserRepoImpl$acknowledgePrivacyPolicy$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.sugarcube.app.base.data.user.UserRepoImpl$acknowledgePrivacyPolicy$1 r0 = new com.sugarcube.app.base.data.user.UserRepoImpl$acknowledgePrivacyPolicy$1
                                r0.<init>(r12, r13)
                            L_0x0018:
                                java.lang.Object r1 = r0.result
                                java.lang.Object r2 = eI.C17187b.f()
                                int r3 = r0.label
                                r4 = 0
                                r5 = 2
                                r6 = 1
                                if (r3 == 0) goto L_0x0078
                                if (r3 == r6) goto L_0x0057
                                if (r3 != r5) goto L_0x004f
                                java.lang.Object r13 = r0.L$5
                                QL.x r13 = (QL.x) r13
                                java.lang.Object r2 = r0.L$4
                                com.sugarcube.core.network.models.LoggedInUser r2 = (com.sugarcube.core.network.models.LoggedInUser) r2
                                java.lang.Object r2 = r0.L$3
                                com.sugarcube.core.network.models.LoggedInUser r2 = (com.sugarcube.core.network.models.LoggedInUser) r2
                                java.lang.Object r2 = r0.L$2
                                com.sugarcube.core.network.models.LoggedInUser r2 = (com.sugarcube.core.network.models.LoggedInUser) r2
                                java.lang.Object r2 = r0.L$1
                                dI.e r2 = (dI.C17164e) r2
                                java.lang.Object r0 = r0.L$0
                                com.sugarcube.app.base.data.user.UserRepoImpl r0 = (com.sugarcube.app.base.data.user.UserRepoImpl) r0
                                XH.y.b(r1)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                goto L_0x00cd
                            L_0x0046:
                                r13 = move-exception
                                goto L_0x00d6
                            L_0x0049:
                                r13 = move-exception
                                goto L_0x00ef
                            L_0x004c:
                                r13 = move-exception
                                goto L_0x0108
                            L_0x004f:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r0)
                                throw r13
                            L_0x0057:
                                int r13 = r0.I$0
                                java.lang.Object r3 = r0.L$4
                                com.sugarcube.core.network.models.LoggedInUser r3 = (com.sugarcube.core.network.models.LoggedInUser) r3
                                java.lang.Object r6 = r0.L$3
                                com.sugarcube.core.network.models.LoggedInUser r6 = (com.sugarcube.core.network.models.LoggedInUser) r6
                                java.lang.Object r7 = r0.L$2
                                com.sugarcube.core.network.models.LoggedInUser r7 = (com.sugarcube.core.network.models.LoggedInUser) r7
                                java.lang.Object r8 = r0.L$1
                                dI.e r8 = (dI.C17164e) r8
                                java.lang.Object r9 = r0.L$0
                                com.sugarcube.app.base.data.user.UserRepoImpl r9 = (com.sugarcube.app.base.data.user.UserRepoImpl) r9
                                XH.y.b(r1)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r11 = r1
                                r1 = r13
                                r13 = r8
                                r8 = r7
                                r7 = r6
                                r6 = r3
                                r3 = r11
                                goto L_0x00af
                            L_0x0078:
                                XH.y.b(r1)
                                TJ.B r1 = r12.getUser()
                                java.lang.Object r1 = r1.getValue()
                                r3 = r1
                                com.sugarcube.core.network.models.LoggedInUser r3 = (com.sugarcube.core.network.models.LoggedInUser) r3
                                if (r3 == 0) goto L_0x0120
                                com.sugarcube.app.base.network.NetworkClient r1 = r12.networkClient     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                com.sugarcube.core.network.api.NetworkAPIs r1 = r1.api()     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                com.sugarcube.core.network.models.PrivacyPolicyAcknowledgeRequest r7 = new com.sugarcube.core.network.models.PrivacyPolicyAcknowledgeRequest     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r8 = 0
                                r7.<init>(r8, r6, r8)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$0 = r12     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$1 = r13     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$2 = r3     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$3 = r3     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$4 = r3     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.I$0 = r4     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.label = r6     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                java.lang.Object r1 = r1.acknowledgePrivacyPolicy(r7, r0)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                if (r1 != r2) goto L_0x00a9
                                return r2
                            L_0x00a9:
                                r9 = r12
                                r6 = r3
                                r7 = r6
                                r8 = r7
                                r3 = r1
                                r1 = r4
                            L_0x00af:
                                QL.x r3 = (QL.x) r3     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                boolean r10 = r3.e()     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$0 = r9     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$1 = r13     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$2 = r8     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$3 = r7     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$4 = r6     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.L$5 = r3     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.I$0 = r1     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                r0.label = r5     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                java.lang.Object r13 = r9.updateHasAcknowledgedPrivacyPolicy(r10, r0)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                if (r13 != r2) goto L_0x00cc
                                return r2
                            L_0x00cc:
                                r13 = r3
                            L_0x00cd:
                                boolean r13 = r13.e()     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r13)     // Catch:{ IOException -> 0x004c, m -> 0x0049, Exception -> 0x0046 }
                                return r13
                            L_0x00d6:
                                YE.b r0 = YE.C13868b.f118106a
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Unexpected exception found while calling acknowledgePrivacyPolicy: "
                                r1.append(r2)
                                r1.append(r13)
                                java.lang.String r13 = r1.toString()
                                YE.e r1 = YE.e.Network
                                r0.b(r13, r1)
                                goto L_0x0120
                            L_0x00ef:
                                YE.b r0 = YE.C13868b.f118106a
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "HttpException occurred while calling acknowledgePrivacyPolicy: "
                                r1.append(r2)
                                r1.append(r13)
                                java.lang.String r13 = r1.toString()
                                YE.e r1 = YE.e.Network
                                r0.b(r13, r1)
                                goto L_0x0120
                            L_0x0108:
                                YE.b r0 = YE.C13868b.f118106a
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "IOException occurred while calling acknowledgePrivacyPolicy: "
                                r1.append(r2)
                                r1.append(r13)
                                java.lang.String r13 = r1.toString()
                                YE.e r1 = YE.e.Network
                                r0.b(r13, r1)
                            L_0x0120:
                                java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
                                return r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.UserRepoImpl.acknowledgePrivacyPolicy(dI.e):java.lang.Object");
                        }

                        public Object updateMobileDevice(MobileDevice mobileDevice, C17164e<? super C16807N> eVar) {
                            LoggedInUser value = getUser().getValue();
                            if (value == null) {
                                int i10 = UserRepoImpl$updateMobileDevice$$inlined$logVerbose$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0[Priority.VERBOSE.ordinal()];
                                Class<UserRepoImpl> cls = UserRepoImpl.class;
                                if (i10 == 1) {
                                    String name = cls.getName();
                                    C17542s.g(name);
                                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o12.length() != 0) {
                                        name = C15854t.P0(o12, "Kt");
                                    }
                                    Log.v(name, "updateMobileDevice - User not logged in" + " " + "");
                                } else if (i10 == 2) {
                                    String name2 = cls.getName();
                                    C17542s.g(name2);
                                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o13.length() != 0) {
                                        name2 = C15854t.P0(o13, "Kt");
                                    }
                                    Log.d(name2, "updateMobileDevice - User not logged in" + " " + "");
                                } else if (i10 == 3) {
                                    String name3 = cls.getName();
                                    C17542s.g(name3);
                                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o14.length() != 0) {
                                        name3 = C15854t.P0(o14, "Kt");
                                    }
                                    Log.i(name3, "updateMobileDevice - User not logged in" + " " + "");
                                } else if (i10 == 4) {
                                    String name4 = cls.getName();
                                    C17542s.g(name4);
                                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o15.length() != 0) {
                                        name4 = C15854t.P0(o15, "Kt");
                                    }
                                    Log.w(name4, "updateMobileDevice - User not logged in" + " " + "");
                                } else if (i10 == 5) {
                                    String name5 = cls.getName();
                                    C17542s.g(name5);
                                    String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o16.length() != 0) {
                                        name5 = C15854t.P0(o16, "Kt");
                                    }
                                    Log.e(name5, "updateMobileDevice - User not logged in" + " " + "");
                                } else {
                                    throw new t();
                                }
                            } else if (!C17542s.e(value.getMobileDevice(), mobileDevice)) {
                                Object emit = getUser().emit(LoggedInUser.copy$default(value, 0, (String) null, (String) null, (AuthType) null, false, (Map) null, mobileDevice, (String) null, (String) null, (String) null, false, false, (Boolean) null, (String) null, 16319, (Object) null), eVar);
                                return emit == C17187b.f() ? emit : C16807N.f139792a;
                            }
                            return C16807N.f139792a;
                        }

                        public C16505B<LoggedInUser> getUser() {
                            return this.user;
                        }

                        public C16505B<Boolean> isLoggedIn() {
                            return this.isLoggedIn;
                        }
                    }
