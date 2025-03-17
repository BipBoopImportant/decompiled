package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import g7.C7892a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;", "", "<init>", "(Ljava/lang/String;I)V", "PROD", "TEST", "Companion", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum LogType {
    PROD,
    TEST;
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) LogType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LogType> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        LogType[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C7892a());
    }

    public static C17220a<LogType> getEntries() {
        return $ENTRIES;
    }
}
