package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import fK.p;
import jK.J;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C17544u;
import kotlinx.serialization.KSerializer;
import nI.C17631a;

@p
public enum a {
    WARN,
    ERROR,
    CRITICAL;
    
    public static final b Companion = null;

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o<KSerializer<Object>> f46806a = null;

    /* renamed from: com.contentsquare.android.internal.core.logmonitor.processing.a$a  reason: collision with other inner class name */
    public static final class C0815a extends C17544u implements C17631a<KSerializer<Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0815a f46811c = null;

        static {
            f46811c = new C0815a();
        }

        public C0815a() {
            super(0);
        }

        public final Object invoke() {
            return J.a("com.contentsquare.android.internal.core.logmonitor.processing.LogLevel", a.values(), new String[]{"warn", UiComponentContainer.RESULT_ERROR, "critical"}, new Annotation[][]{null, null, null}, (Annotation[]) null);
        }
    }

    public static final class b {
        public final KSerializer<a> serializer() {
            return a.f46806a.getValue();
        }
    }

    static {
        Companion = new b();
        f46806a = C16825p.a(s.PUBLICATION, C0815a.f46811c);
    }
}
