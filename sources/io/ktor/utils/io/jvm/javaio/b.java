package io.ktor.utils.io.jvm.javaio;

import QJ.F0;
import XH.C16824o;
import XH.C16825p;
import io.ktor.utils.io.g;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/g;", "LQJ/F0;", "parent", "Ljava/io/InputStream;", "c", "(Lio/ktor/utils/io/g;LQJ/F0;)Ljava/io/InputStream;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "LXH/o;", "b", "()Lorg/slf4j/Logger;", "ADAPTER_LOGGER", "", "Ljava/lang/Object;", "CloseToken", "FlushToken", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f143800a = C16825p.b(a.f143803c);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f143801b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f143802c = new Object();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Logger> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f143803c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Logger invoke() {
            return LoggerFactory.getLogger((Class<?>) a.class);
        }
    }

    /* access modifiers changed from: private */
    public static final Logger b() {
        return (Logger) f143800a.getValue();
    }

    public static final InputStream c(g gVar, F0 f02) {
        C17542s.j(gVar, "<this>");
        return new d(f02, gVar);
    }

    public static /* synthetic */ InputStream d(g gVar, F0 f02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f02 = null;
        }
        return c(gVar, f02);
    }
}
