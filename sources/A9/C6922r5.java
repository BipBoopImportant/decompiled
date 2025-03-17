package a9;

import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.internal.core.telemetry.processing.TelemetryReportProcessor", f = "TelemetryReportProcessor.kt", l = {27, 28, 29, 30, 31, 32}, m = "collectEventsFromAgents")
/* renamed from: a9.r5  reason: case insensitive filesystem */
public final class C6922r5 extends d {

    /* renamed from: c  reason: collision with root package name */
    public B5 f42831c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f42832d;

    /* renamed from: e  reason: collision with root package name */
    public Object f42833e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f42834f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ B5 f42835g;

    /* renamed from: h  reason: collision with root package name */
    public int f42836h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6922r5(B5 b52, C17164e<? super C6922r5> eVar) {
        super(eVar);
        this.f42835g = b52;
    }

    public final Object invokeSuspend(Object obj) {
        this.f42834f = obj;
        this.f42836h |= Integer.MIN_VALUE;
        return this.f42835g.a((ArrayList) null, this);
    }
}
