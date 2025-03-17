package com.sugarcube.app.base.data.preferences;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreferenceImpl$getPreference$$inlined$map$2 implements C16532g<T> {
    final /* synthetic */ C16532g $this_unsafeTransform$inlined;

    public PreferenceImpl$getPreference$$inlined$map$2(C16532g gVar) {
        this.$this_unsafeTransform$inlined = gVar;
    }

    public Object collect(final C16533h hVar, C17164e eVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C16533h() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2$2$1 r0 = (com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2$2$1 r0 = new com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.label
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
                    TJ.h r6 = r3
                    XH.v r5 = (XH.v) r5
                    java.lang.Object r5 = r5.d()
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
