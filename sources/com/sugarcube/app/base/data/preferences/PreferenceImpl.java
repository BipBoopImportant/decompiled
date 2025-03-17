package com.sugarcube.app.base.data.preferences;

import TJ.C16532g;
import TJ.C16534i;
import W2.f;
import W2.h;
import W2.i;
import XH.C16807N;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\r\u001a\u00028\u0000H@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H@¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u000eH@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/preferences/PreferenceImpl;", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "T", "LW2/f$a;", "preferenceKey", "defaultValue", "LTJ/g;", "getPreference", "(LW2/f$a;Ljava/lang/Object;)LTJ/g;", "value", "LXH/N;", "setPreference", "(LW2/f$a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "clearPreference", "(LW2/f$a;LdI/e;)Ljava/lang/Object;", "", "incrementPreference", "clearPreferences", "(LdI/e;)Ljava/lang/Object;", "LR2/h;", "LW2/f;", "dataStore", "LR2/h;", "PreferencesKeys", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreferenceImpl implements PreferenceStorage {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public static final f.a<String> CAPTURES_IN_PROGRESS_KEY = h.g("capture_in_progress");
    /* access modifiers changed from: private */
    public static final f.a<Integer> FIRST_CAPTURE_RATING_KEY = h.e("first_capture_rating");
    /* access modifiers changed from: private */
    public static final f.a<Integer> NEW_READY_TO_DECORATE_COUNT_KEY = h.e("ready_to_decorate_count");
    public static final PreferencesKeys PreferencesKeys = new PreferencesKeys((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final f.a<Boolean> SHOW_DESIGN_FEEDBACK_KEY = h.a("show_design_feedback");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> SHOW_DESIGN_OPTIONS_KEY = h.a("show_design_options_interstitial");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> SHOW_SMILE_FEEDBACK_KEY = h.a("show_smile_feedback_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_ADD_ITEM_SHOWN_KEY = h.a("tooltip_add_item_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_FLIP_ITEM_SHOWN_KEY = h.a("tooltip_flip_item_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_FOCUS_MODE_SHOWN_KEY = h.a("tooltip_focus_mode_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY = h.a("tooltip_magic_eraser_item_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_MIRROR_ITEM_SHOWN_KEY = h.a("tooltip_mirror_item_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_MULTIVIEW_SHOWN_KEY = h.a("tooltip_multiview_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_ORBIT_SHOWN_KEY = h.a("tooltip_orbit_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY = h.a("tooltip_room_view_mode_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<Boolean> TOOLTIP_SWAP_ITEM_SHOWN_KEY = h.a("tooltip_swap_item_shown_key");
    /* access modifiers changed from: private */
    public static final f.a<String> TUTORIAL_HYBRID_AR_CHECKPOINT_KEY = h.g("tutorial_hybrid_ar_checkpoint_key");
    /* access modifiers changed from: private */
    public static final f.a<String> TUTORIAL_HYBRID_CHECKPOINT_KEY = h.g("tutorial_hybrid_checkpoint_key");
    /* access modifiers changed from: private */
    public static final f.a<String> TUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY = h.g("tutorial_ultrawide_ar_checkpoint_key");
    /* access modifiers changed from: private */
    public static final f.a<String> TUTORIAL_ULTRAWIDE_CHECKPOINT_KEY = h.g("tutorial_ultrawide_checkpoint_key");
    private final R2.h<f> dataStore;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\tR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\tR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\tR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0007\u001a\u0004\b+\u0010\tR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\tR\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b/\u0010\t¨\u00060"}, d2 = {"Lcom/sugarcube/app/base/data/preferences/PreferenceImpl$PreferencesKeys;", "", "<init>", "()V", "LW2/f$a;", "", "SHOW_DESIGN_OPTIONS_KEY", "LW2/f$a;", "getSHOW_DESIGN_OPTIONS_KEY", "()LW2/f$a;", "SHOW_SMILE_FEEDBACK_KEY", "getSHOW_SMILE_FEEDBACK_KEY", "", "CAPTURES_IN_PROGRESS_KEY", "getCAPTURES_IN_PROGRESS_KEY", "", "FIRST_CAPTURE_RATING_KEY", "getFIRST_CAPTURE_RATING_KEY", "SHOW_DESIGN_FEEDBACK_KEY", "getSHOW_DESIGN_FEEDBACK_KEY", "NEW_READY_TO_DECORATE_COUNT_KEY", "getNEW_READY_TO_DECORATE_COUNT_KEY", "TOOLTIP_ADD_ITEM_SHOWN_KEY", "getTOOLTIP_ADD_ITEM_SHOWN_KEY", "TOOLTIP_SWAP_ITEM_SHOWN_KEY", "getTOOLTIP_SWAP_ITEM_SHOWN_KEY", "TOOLTIP_FLIP_ITEM_SHOWN_KEY", "getTOOLTIP_FLIP_ITEM_SHOWN_KEY", "TOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY", "getTOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY", "TOOLTIP_FOCUS_MODE_SHOWN_KEY", "getTOOLTIP_FOCUS_MODE_SHOWN_KEY", "TOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY", "getTOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY", "TOOLTIP_MIRROR_ITEM_SHOWN_KEY", "getTOOLTIP_MIRROR_ITEM_SHOWN_KEY", "TOOLTIP_ORBIT_SHOWN_KEY", "getTOOLTIP_ORBIT_SHOWN_KEY", "TOOLTIP_MULTIVIEW_SHOWN_KEY", "getTOOLTIP_MULTIVIEW_SHOWN_KEY", "TUTORIAL_HYBRID_CHECKPOINT_KEY", "getTUTORIAL_HYBRID_CHECKPOINT_KEY", "TUTORIAL_ULTRAWIDE_CHECKPOINT_KEY", "getTUTORIAL_ULTRAWIDE_CHECKPOINT_KEY", "TUTORIAL_HYBRID_AR_CHECKPOINT_KEY", "getTUTORIAL_HYBRID_AR_CHECKPOINT_KEY", "TUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY", "getTUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferencesKeys {
        public /* synthetic */ PreferencesKeys(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f.a<String> getCAPTURES_IN_PROGRESS_KEY() {
            return PreferenceImpl.CAPTURES_IN_PROGRESS_KEY;
        }

        public final f.a<Integer> getFIRST_CAPTURE_RATING_KEY() {
            return PreferenceImpl.FIRST_CAPTURE_RATING_KEY;
        }

        public final f.a<Integer> getNEW_READY_TO_DECORATE_COUNT_KEY() {
            return PreferenceImpl.NEW_READY_TO_DECORATE_COUNT_KEY;
        }

        public final f.a<Boolean> getSHOW_DESIGN_FEEDBACK_KEY() {
            return PreferenceImpl.SHOW_DESIGN_FEEDBACK_KEY;
        }

        public final f.a<Boolean> getSHOW_DESIGN_OPTIONS_KEY() {
            return PreferenceImpl.SHOW_DESIGN_OPTIONS_KEY;
        }

        public final f.a<Boolean> getSHOW_SMILE_FEEDBACK_KEY() {
            return PreferenceImpl.SHOW_SMILE_FEEDBACK_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_ADD_ITEM_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_ADD_ITEM_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_FLIP_ITEM_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_FLIP_ITEM_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_FOCUS_MODE_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_FOCUS_MODE_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_MAGIC_ERASER_ITEM_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_MIRROR_ITEM_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_MIRROR_ITEM_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_MULTIVIEW_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_MULTIVIEW_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_ORBIT_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_ORBIT_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_ROOM_VIEW_MODE_SHOWN_KEY;
        }

        public final f.a<Boolean> getTOOLTIP_SWAP_ITEM_SHOWN_KEY() {
            return PreferenceImpl.TOOLTIP_SWAP_ITEM_SHOWN_KEY;
        }

        public final f.a<String> getTUTORIAL_HYBRID_AR_CHECKPOINT_KEY() {
            return PreferenceImpl.TUTORIAL_HYBRID_AR_CHECKPOINT_KEY;
        }

        public final f.a<String> getTUTORIAL_HYBRID_CHECKPOINT_KEY() {
            return PreferenceImpl.TUTORIAL_HYBRID_CHECKPOINT_KEY;
        }

        public final f.a<String> getTUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY() {
            return PreferenceImpl.TUTORIAL_ULTRAWIDE_AR_CHECKPOINT_KEY;
        }

        public final f.a<String> getTUTORIAL_ULTRAWIDE_CHECKPOINT_KEY() {
            return PreferenceImpl.TUTORIAL_ULTRAWIDE_CHECKPOINT_KEY;
        }

        private PreferencesKeys() {
        }
    }

    public PreferenceImpl(Context context) {
        C17542s.j(context, "context");
        this.dataStore = PreferenceImplKt.getDataStore(context);
    }

    public <T> Object clearPreference(f.a<T> aVar, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.dataStore, new PreferenceImpl$clearPreference$2(aVar, (C17164e<? super PreferenceImpl$clearPreference$2>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object clearPreferences(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.dataStore, new PreferenceImpl$clearPreferences$2((C17164e<? super PreferenceImpl$clearPreferences$2>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public <T> C16532g<T> getPreference(f.a<T> aVar, T t10) {
        C17542s.j(aVar, "preferenceKey");
        return new PreferenceImpl$getPreference$$inlined$map$2(C16534i.s(new PreferenceImpl$getPreference$$inlined$map$1(C16534i.g(this.dataStore.getData(), new PreferenceImpl$getPreference$1((C17164e<? super PreferenceImpl$getPreference$1>) null)), aVar, t10)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object incrementPreference(W2.f.a<java.lang.Integer> r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$1 r0 = (com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$1 r0 = new com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x006e
            if (r3 == r6) goto L_0x004e
            if (r3 != r5) goto L_0x0046
            java.lang.Object r13 = r0.L$5
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r13 = r0.L$4
            R2.h r13 = (R2.h) r13
            java.lang.Object r13 = r0.L$3
            R2.h r13 = (R2.h) r13
            java.lang.Object r13 = r0.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.L$1
            W2.f$a r13 = (W2.f.a) r13
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.preferences.PreferenceImpl r13 = (com.sugarcube.app.base.data.preferences.PreferenceImpl) r13
            XH.y.b(r1)
            goto L_0x00bd
        L_0x0046:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x004e:
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$4
            R2.h r14 = (R2.h) r14
            java.lang.Object r3 = r0.L$3
            R2.h r3 = (R2.h) r3
            java.lang.Object r6 = r0.L$2
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.L$1
            W2.f$a r7 = (W2.f.a) r7
            java.lang.Object r8 = r0.L$0
            com.sugarcube.app.base.data.preferences.PreferenceImpl r8 = (com.sugarcube.app.base.data.preferences.PreferenceImpl) r8
            XH.y.b(r1)
            r11 = r14
            r14 = r13
            r13 = r7
            r7 = r3
            r3 = r1
            r1 = r11
            goto L_0x0090
        L_0x006e:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r12.dataStore
            TJ.g r3 = r1.getData()
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r14
            r0.L$3 = r1
            r0.L$4 = r1
            r0.I$0 = r4
            r0.label = r6
            java.lang.Object r3 = TJ.C16534i.B(r3, r0)
            if (r3 != r2) goto L_0x008c
            return r2
        L_0x008c:
            r8 = r12
            r6 = r14
            r7 = r1
            r14 = r4
        L_0x0090:
            W2.f r3 = (W2.f) r3
            java.lang.Object r3 = r3.b(r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x009e
            int r4 = r3.intValue()
        L_0x009e:
            com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$2$1 r9 = new com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$2$1
            r10 = 0
            r9.<init>(r13, r4, r10)
            r0.L$0 = r8
            r0.L$1 = r13
            r0.L$2 = r6
            r0.L$3 = r7
            r0.L$4 = r1
            r0.L$5 = r3
            r0.I$0 = r14
            r0.I$1 = r4
            r0.label = r5
            java.lang.Object r13 = W2.i.a(r1, r9, r0)
            if (r13 != r2) goto L_0x00bd
            return r2
        L_0x00bd:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.preferences.PreferenceImpl.incrementPreference(W2.f$a, dI.e):java.lang.Object");
    }

    public <T> Object setPreference(f.a<T> aVar, T t10, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.dataStore, new PreferenceImpl$setPreference$2(aVar, t10, (C17164e<? super PreferenceImpl$setPreference$2>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
