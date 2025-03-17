package com.sugarcube.app.base.data.user.privacypolicy;

import OE.q;
import QJ.C16311i0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.net.Uri;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import eI.C17187b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\fH@¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\fH@¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\fH@¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fH@¢\u0006\u0004\b\u001b\u0010\u0010J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\fH@¢\u0006\u0004\b!\u0010\u0010J\u0010\u0010\"\u001a\u00020\u0011H@¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyExperimentHelper;", "experimentHelper", "<init>", "(LOE/q;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyExperimentHelper;)V", "", "isPrivacyPolicyAcknowledged", "()Z", "consentPrivacyPolicy", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "cleanUp", "()V", "invoke", "shouldDisplayPrivacyPolicyDialog", "shouldDisplayPrivacyPolicyBanner", "allowCapturesToUpload", "Landroid/net/Uri;", "generatePrivacyPolicyLink", "()Landroid/net/Uri;", "galleryPositiveAction", "galleryNegativeAction", "isChecked", "galleryUpdateCheckBoxState", "(Z)V", "galleryLinkClicked", "capturePositiveAction", "captureNegativeAction", "captureUpdateCheckBoxState", "captureLinkClicked", "LOE/q;", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyExperimentHelper;", "privacyPolicyAcknowledged", "Z", "LTJ/B;", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "_privacyPolicyState", "LTJ/B;", "LTJ/P;", "privacyPolicyState", "LTJ/P;", "getPrivacyPolicyState", "()LTJ/P;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrivacyPolicyConsentUseCase {
    public static final int $stable = 8;
    private final C16505B<PrivacyPolicyFeatureState> _privacyPolicyState;
    private final PrivacyPolicyExperimentHelper experimentHelper;
    private final FirebaseInteractions firebaseInteractions;
    private boolean privacyPolicyAcknowledged;
    private final C16519P<PrivacyPolicyFeatureState> privacyPolicyState;
    private final q sugarcube;
    /* access modifiers changed from: private */
    public final UserRepo userRepo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$1", f = "PrivacyPolicyConsentUseCase.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
        int label;
        final /* synthetic */ PrivacyPolicyConsentUseCase this$0;

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
                C16519P<Boolean> isLoggedIn = this.this$0.userRepo.isLoggedIn();
                final PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase = this.this$0;
                AnonymousClass1 r12 = new C16533h() {
                    public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                        return emit(((Boolean) obj).booleanValue(), (C17164e<? super C16807N>) eVar);
                    }

                    public final Object emit(boolean z10, C17164e<? super C16807N> eVar) {
                        if (!z10) {
                            return C16807N.f139792a;
                        }
                        privacyPolicyConsentUseCase.cleanUp();
                        Object invoke = privacyPolicyConsentUseCase.invoke(eVar);
                        return invoke == C17187b.f() ? invoke : C16807N.f139792a;
                    }
                };
                this.label = 1;
                if (isLoggedIn.collect(r12, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public PrivacyPolicyConsentUseCase(q qVar, FirebaseInteractions firebaseInteractions2, UserRepo userRepo2, PrivacyPolicyExperimentHelper privacyPolicyExperimentHelper) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(firebaseInteractions2, "firebaseInteractions");
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(privacyPolicyExperimentHelper, "experimentHelper");
        this.sugarcube = qVar;
        this.firebaseInteractions = firebaseInteractions2;
        this.userRepo = userRepo2;
        this.experimentHelper = privacyPolicyExperimentHelper;
        C16505B<PrivacyPolicyFeatureState> a10 = C16521S.a(new PrivacyPolicyFeatureState((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 15, (DefaultConstructorMarker) null));
        this._privacyPolicyState = a10;
        this.privacyPolicyState = C16534i.c(a10);
        F0 unused = C16314k.d(S.a(C16311i0.a()), new PrivacyPolicyConsentUseCase$special$$inlined$CoroutineExceptionHandler$1(N.f137593c0), (T) null, new AnonymousClass1(this, (C17164e<? super AnonymousClass1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void cleanUp() {
        PrivacyPolicyFeatureState value;
        Boolean bool;
        this.privacyPolicyAcknowledged = false;
        C16505B<PrivacyPolicyFeatureState> b10 = this._privacyPolicyState;
        do {
            value = b10.getValue();
            bool = Boolean.FALSE;
        } while (!b10.e(value, value.copy(bool, bool, bool, bool)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object consentPrivacyPolicy(dI.C17164e<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$consentPrivacyPolicy$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$consentPrivacyPolicy$1 r0 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$consentPrivacyPolicy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$consentPrivacyPolicy$1 r0 = new com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$consentPrivacyPolicy$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r13 = r0.L$1
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r13 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r13
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            XH.y.b(r1)
            com.sugarcube.app.base.data.user.UserRepo r1 = r12.userRepo
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r1 = r1.acknowledgePrivacyPolicy(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r13 = r12
        L_0x004c:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r0 = r13._privacyPolicyState
        L_0x0057:
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r1)
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r3 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x0057
            r13.privacyPolicyAcknowledged = r4
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        L_0x0078:
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r0 = r13._privacyPolicyState
        L_0x007a:
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r4)
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r3 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x007a
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r13 = r13.firebaseInteractions
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r2 = "Privacy policy acknowledge Failed"
            r0.<init>(r2)
            r13.recordException(r0)
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase.consentPrivacyPolicy(dI.e):java.lang.Object");
    }

    private final boolean isPrivacyPolicyAcknowledged() {
        LoggedInUser value = this.userRepo.getUser().getValue();
        if (this.privacyPolicyAcknowledged) {
            return true;
        }
        if (value != null) {
            return C17542s.e(value.getAcceptedKreativPrivacyPolicy(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object allowCapturesToUpload(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$allowCapturesToUpload$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$allowCapturesToUpload$1 r0 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$allowCapturesToUpload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$allowCapturesToUpload$1 r0 = new com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$allowCapturesToUpload$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r7 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r7
            XH.y.b(r1)
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r3 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r3
            XH.y.b(r1)
            goto L_0x0059
        L_0x0048:
            XH.y.b(r1)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r1 = r6.shouldDisplayPrivacyPolicyBanner(r0)
            if (r1 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r3 = r6
        L_0x0059:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0079
            r0.L$0 = r3
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r1 = r3.shouldDisplayPrivacyPolicyDialog(r0)
            if (r1 != r2) goto L_0x006e
            return r2
        L_0x006e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            if (r7 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r7 = 0
            goto L_0x007a
        L_0x0079:
            r7 = r5
        L_0x007a:
            r7 = r7 ^ r5
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase.allowCapturesToUpload(dI.e):java.lang.Object");
    }

    public final void captureLinkClicked() {
        this.sugarcube.b().capturePrivacyPolicyPrivacyLink();
    }

    public final Object captureNegativeAction(C17164e<? super C16807N> eVar) {
        this.sugarcube.b().capturePrivacyPolicyMaybeLater();
        return C16807N.f139792a;
    }

    public final Object capturePositiveAction(C17164e<? super Boolean> eVar) {
        this.sugarcube.b().capturePrivacyPolicyAgree();
        return consentPrivacyPolicy(eVar);
    }

    public final void captureUpdateCheckBoxState(boolean z10) {
        if (z10) {
            this.sugarcube.b().capturePrivacyPolicyCheck();
        } else {
            this.sugarcube.b().capturePrivacyPolicyUnCheck();
        }
    }

    public final void galleryLinkClicked() {
        this.sugarcube.b().galleryPrivacyPolicyPrivacyLink();
    }

    public final void galleryNegativeAction() {
        this.sugarcube.b().galleryPrivacyPolicyMaybeLater();
    }

    public final Object galleryPositiveAction(C17164e<? super Boolean> eVar) {
        this.sugarcube.b().galleryPrivacyPolicyAgree();
        return consentPrivacyPolicy(eVar);
    }

    public final void galleryUpdateCheckBoxState(boolean z10) {
        if (z10) {
            this.sugarcube.b().galleryPrivacyPolicyCheck();
        } else {
            this.sugarcube.b().galleryPrivacyPolicyUnCheck();
        }
    }

    public final Uri generatePrivacyPolicyLink() {
        String language = this.sugarcube.getLocale().getLanguage();
        C17542s.i(language, "getLanguage(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        C17542s.i(lowerCase, "toLowerCase(...)");
        String country = this.sugarcube.getLocale().getCountry();
        C17542s.i(country, "getCountry(...)");
        String lowerCase2 = country.toLowerCase(locale);
        C17542s.i(lowerCase2, "toLowerCase(...)");
        return Uri.parse("https://www.ikea.com/" + lowerCase2 + "/" + lowerCase + "/customer-service/privacy-policy/#IKEAKreativ");
    }

    public final C16519P<PrivacyPolicyFeatureState> getPrivacyPolicyState() {
        return this.privacyPolicyState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$invoke$1 r0 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$invoke$1 r0 = new com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r7 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r7
            XH.y.b(r1)
            goto L_0x0066
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r3 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r3
            XH.y.b(r1)
            goto L_0x0059
        L_0x0048:
            XH.y.b(r1)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r1 = r6.shouldDisplayPrivacyPolicyBanner(r0)
            if (r1 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r3 = r6
        L_0x0059:
            r0.L$0 = r3
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r7 = r3.shouldDisplayPrivacyPolicyDialog(r0)
            if (r7 != r2) goto L_0x0066
            return r2
        L_0x0066:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase.invoke(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object shouldDisplayPrivacyPolicyBanner(dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyBanner$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyBanner$1 r0 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyBanner$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyBanner$1 r0 = new com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyBanner$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r5) goto L_0x0032
            java.lang.Object r14 = r0.L$1
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r14 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r14
            XH.y.b(r1)
            goto L_0x0075
        L_0x0032:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003a:
            XH.y.b(r1)
            boolean r1 = r13.isPrivacyPolicyAcknowledged()
            if (r1 == 0) goto L_0x0065
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r1 = r13._privacyPolicyState
        L_0x0045:
            java.lang.Object r14 = r1.getValue()
            r5 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r0 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r14 = r1.e(r14, r0)
            if (r14 == 0) goto L_0x0045
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        L_0x0065:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyExperimentHelper r1 = r13.experimentHelper
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r5
            java.lang.Object r1 = r1.isUserEnrolledInExperiment(r0)
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r14 = r13
        L_0x0075:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x009f
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r0 = r14._privacyPolicyState
        L_0x007f:
            java.lang.Object r14 = r0.getValue()
            r6 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r6 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r6
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r5)
            r11 = 14
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r1 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r0.e(r14, r1)
            if (r14 == 0) goto L_0x007f
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r14
        L_0x009f:
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r14 = r14._privacyPolicyState
        L_0x00a1:
            java.lang.Object r0 = r14.getValue()
            r5 = r0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r1 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r14.e(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase.shouldDisplayPrivacyPolicyBanner(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object shouldDisplayPrivacyPolicyDialog(dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyDialog$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyDialog$1 r0 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyDialog$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyDialog$1 r0 = new com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase$shouldDisplayPrivacyPolicyDialog$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r5) goto L_0x0032
            java.lang.Object r14 = r0.L$1
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.L$0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r14 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase) r14
            XH.y.b(r1)
            goto L_0x0075
        L_0x0032:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003a:
            XH.y.b(r1)
            boolean r1 = r13.isPrivacyPolicyAcknowledged()
            if (r1 == 0) goto L_0x0065
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r1 = r13._privacyPolicyState
        L_0x0045:
            java.lang.Object r14 = r1.getValue()
            r5 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            r10 = 13
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r0 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r14 = r1.e(r14, r0)
            if (r14 == 0) goto L_0x0045
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        L_0x0065:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyExperimentHelper r1 = r13.experimentHelper
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r5
            java.lang.Object r1 = r1.isUserEnrolledInExperiment(r0)
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r14 = r13
        L_0x0075:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x009f
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r0 = r14._privacyPolicyState
        L_0x007f:
            java.lang.Object r14 = r0.getValue()
            r6 = r14
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r6 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r6
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)
            r11 = 13
            r12 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r1 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r0.e(r14, r1)
            if (r14 == 0) goto L_0x007f
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r14
        L_0x009f:
            TJ.B<com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState> r14 = r14._privacyPolicyState
        L_0x00a1:
            java.lang.Object r0 = r14.getValue()
            r5 = r0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r5 = (com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState) r5
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            r10 = 13
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState r1 = com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState.copy$default(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r14.e(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase.shouldDisplayPrivacyPolicyDialog(dI.e):java.lang.Object");
    }
}
