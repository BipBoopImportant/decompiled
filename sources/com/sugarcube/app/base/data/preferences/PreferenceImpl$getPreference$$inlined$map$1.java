package com.sugarcube.app.base.data.preferences;

import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import XH.C16807N;
import XH.v;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreferenceImpl$getPreference$$inlined$map$1 implements C16532g<v<? extends f.a<T>, ? extends T>> {
    final /* synthetic */ Object $defaultValue$inlined;
    final /* synthetic */ f.a $preferenceKey$inlined;
    final /* synthetic */ C16532g $this_unsafeTransform$inlined;

    public PreferenceImpl$getPreference$$inlined$map$1(C16532g gVar, f.a aVar, Object obj) {
        this.$this_unsafeTransform$inlined = gVar;
        this.$preferenceKey$inlined = aVar;
        this.$defaultValue$inlined = obj;
    }

    public Object collect(final C16533h hVar, C17164e eVar) {
        C16532g gVar = this.$this_unsafeTransform$inlined;
        final f.a aVar = this.$preferenceKey$inlined;
        final Object obj = this.$defaultValue$inlined;
        Object collect = gVar.collect(new C16533h() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1$2$1 r0 = (com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1$2$1 r0 = new com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0052
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5
                    W2.f r6 = (W2.f) r6
                    W2.f$a r2 = r2
                    java.lang.Object r6 = r6.b(r2)
                    if (r6 != 0) goto L_0x0042
                    java.lang.Object r6 = r3
                L_0x0042:
                    XH.v r2 = new XH.v
                    W2.f$a r4 = r2
                    r2.<init>(r4, r6)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
