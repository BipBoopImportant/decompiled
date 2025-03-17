package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import GK.C15803v;
import f7.C7859b;
import f7.C7861d;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\"\b\b\u0018\u0000 [2\u00020\u0001:\u0002\\[Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b4\u00105J\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b9\u0010)J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010)R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010I\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010+R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010L\u0012\u0004\bN\u0010A\u001a\u0004\bM\u0010-R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010O\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010/R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010R\u0012\u0004\bT\u0010A\u001a\u0004\bS\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010U\u0012\u0004\bW\u0010A\u001a\u0004\bV\u00103R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010X\u0012\u0004\bZ\u0010A\u001a\u0004\bY\u00105¨\u0006]"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;", "", "", "description", "key", "logId", "", "maximumMergeDelay", "", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator;", "listOfPreviousOperators", "LGK/v;", "url", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;", "dns", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "temporalInterval", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;", "logType", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;LGK/v;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;LGK/v;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Ljava/util/List;", "component6", "()LGK/v;", "component7", "()Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;", "component8", "()Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "component9", "()Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;", "component10", "()Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;LGK/v;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getDescription$annotations", "()V", "getKey", "getKey$annotations", "getLogId", "getLogId$annotations", "I", "getMaximumMergeDelay", "getMaximumMergeDelay$annotations", "Ljava/util/List;", "getListOfPreviousOperators", "getListOfPreviousOperators$annotations", "LGK/v;", "getUrl", "getUrl$annotations", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;", "getDns", "getDns$annotations", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "getTemporalInterval", "getTemporalInterval$annotations", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogType;", "getLogType", "getLogType$annotations", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "getState", "getState$annotations", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Log {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {0, 0, 0, 0, new C17451f(PreviousOperator$$serializer.INSTANCE), new C7859b(), Hostname.Companion.serializer(), 0, LogType.Companion.serializer(), new C7861d()};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String description;
    private final Hostname dns;
    private final String key;
    private final List<PreviousOperator> listOfPreviousOperators;
    private final String logId;
    private final LogType logType;
    private final int maximumMergeDelay;
    private final State state;
    private final TemporalInterval temporalInterval;
    private final C15803v url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Log> serializer() {
            return Log$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Log(int i10, String str, String str2, String str3, int i11, List list, C15803v vVar, Hostname hostname, TemporalInterval temporalInterval2, LogType logType2, State state2, T0 t02) {
        if (46 != (i10 & 46)) {
            E0.b(i10, 46, Log$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        this.key = str2;
        this.logId = str3;
        this.maximumMergeDelay = i11;
        if ((i10 & 16) == 0) {
            this.listOfPreviousOperators = null;
        } else {
            this.listOfPreviousOperators = list;
        }
        this.url = vVar;
        if ((i10 & 64) == 0) {
            this.dns = null;
        } else {
            this.dns = hostname;
        }
        if ((i10 & 128) == 0) {
            this.temporalInterval = null;
        } else {
            this.temporalInterval = temporalInterval2;
        }
        if ((i10 & 256) == 0) {
            this.logType = null;
        } else {
            this.logType = logType2;
        }
        if ((i10 & 512) == 0) {
            this.state = null;
        } else {
            this.state = state2;
        }
        String str4 = this.description;
        if (str4 != null && str4.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (str3.length() != 44) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i11 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static /* synthetic */ Log copy$default(Log log, String str, String str2, String str3, int i10, List list, C15803v vVar, Hostname hostname, TemporalInterval temporalInterval2, LogType logType2, State state2, int i11, Object obj) {
        Log log2 = log;
        int i12 = i11;
        return log.copy((i12 & 1) != 0 ? log2.description : str, (i12 & 2) != 0 ? log2.key : str2, (i12 & 4) != 0 ? log2.logId : str3, (i12 & 8) != 0 ? log2.maximumMergeDelay : i10, (i12 & 16) != 0 ? log2.listOfPreviousOperators : list, (i12 & 32) != 0 ? log2.url : vVar, (i12 & 64) != 0 ? log2.dns : hostname, (i12 & 128) != 0 ? log2.temporalInterval : temporalInterval2, (i12 & 256) != 0 ? log2.logType : logType2, (i12 & 512) != 0 ? log2.state : state2);
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getDns$annotations() {
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getListOfPreviousOperators$annotations() {
    }

    public static /* synthetic */ void getLogId$annotations() {
    }

    public static /* synthetic */ void getLogType$annotations() {
    }

    public static /* synthetic */ void getMaximumMergeDelay$annotations() {
    }

    @p(with = C7861d.class)
    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getTemporalInterval$annotations() {
    }

    @p(with = C7859b.class)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$certificatetransparency(Log log, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || log.description != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, log.description);
        }
        dVar.y(serialDescriptor, 1, log.key);
        dVar.y(serialDescriptor, 2, log.logId);
        dVar.w(serialDescriptor, 3, log.maximumMergeDelay);
        if (dVar.z(serialDescriptor, 4) || log.listOfPreviousOperators != null) {
            dVar.B(serialDescriptor, 4, kSerializerArr[4], log.listOfPreviousOperators);
        }
        dVar.i(serialDescriptor, 5, kSerializerArr[5], log.url);
        if (dVar.z(serialDescriptor, 6) || log.dns != null) {
            dVar.B(serialDescriptor, 6, kSerializerArr[6], log.dns);
        }
        if (dVar.z(serialDescriptor, 7) || log.temporalInterval != null) {
            dVar.B(serialDescriptor, 7, TemporalInterval$$serializer.INSTANCE, log.temporalInterval);
        }
        if (dVar.z(serialDescriptor, 8) || log.logType != null) {
            dVar.B(serialDescriptor, 8, kSerializerArr[8], log.logType);
        }
        if (dVar.z(serialDescriptor, 9) || log.state != null) {
            dVar.B(serialDescriptor, 9, kSerializerArr[9], log.state);
        }
    }

    public final String component1() {
        return this.description;
    }

    public final State component10() {
        return this.state;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.logId;
    }

    public final int component4() {
        return this.maximumMergeDelay;
    }

    public final List<PreviousOperator> component5() {
        return this.listOfPreviousOperators;
    }

    public final C15803v component6() {
        return this.url;
    }

    public final Hostname component7() {
        return this.dns;
    }

    public final TemporalInterval component8() {
        return this.temporalInterval;
    }

    public final LogType component9() {
        return this.logType;
    }

    public final Log copy(String str, String str2, String str3, int i10, List<PreviousOperator> list, C15803v vVar, Hostname hostname, TemporalInterval temporalInterval2, LogType logType2, State state2) {
        C17542s.j(str2, "key");
        C17542s.j(str3, "logId");
        C15803v vVar2 = vVar;
        C17542s.j(vVar2, "url");
        return new Log(str, str2, str3, i10, list, vVar2, hostname, temporalInterval2, logType2, state2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Log)) {
            return false;
        }
        Log log = (Log) obj;
        return C17542s.e(this.description, log.description) && C17542s.e(this.key, log.key) && C17542s.e(this.logId, log.logId) && this.maximumMergeDelay == log.maximumMergeDelay && C17542s.e(this.listOfPreviousOperators, log.listOfPreviousOperators) && C17542s.e(this.url, log.url) && C17542s.e(this.dns, log.dns) && C17542s.e(this.temporalInterval, log.temporalInterval) && this.logType == log.logType && C17542s.e(this.state, log.state);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Hostname getDns() {
        return this.dns;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<PreviousOperator> getListOfPreviousOperators() {
        return this.listOfPreviousOperators;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final LogType getLogType() {
        return this.logType;
    }

    public final int getMaximumMergeDelay() {
        return this.maximumMergeDelay;
    }

    public final State getState() {
        return this.state;
    }

    public final TemporalInterval getTemporalInterval() {
        return this.temporalInterval;
    }

    public final C15803v getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.description;
        int i10 = 0;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.key.hashCode()) * 31) + this.logId.hashCode()) * 31) + Integer.hashCode(this.maximumMergeDelay)) * 31;
        List<PreviousOperator> list = this.listOfPreviousOperators;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.url.hashCode()) * 31;
        Hostname hostname = this.dns;
        int hashCode3 = (hashCode2 + (hostname == null ? 0 : hostname.hashCode())) * 31;
        TemporalInterval temporalInterval2 = this.temporalInterval;
        int hashCode4 = (hashCode3 + (temporalInterval2 == null ? 0 : temporalInterval2.hashCode())) * 31;
        LogType logType2 = this.logType;
        int hashCode5 = (hashCode4 + (logType2 == null ? 0 : logType2.hashCode())) * 31;
        State state2 = this.state;
        if (state2 != null) {
            i10 = state2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "Log(description=" + this.description + ", key=" + this.key + ", logId=" + this.logId + ", maximumMergeDelay=" + this.maximumMergeDelay + ", listOfPreviousOperators=" + this.listOfPreviousOperators + ", url=" + this.url + ", dns=" + this.dns + ", temporalInterval=" + this.temporalInterval + ", logType=" + this.logType + ", state=" + this.state + ')';
    }

    public Log(String str, String str2, String str3, int i10, List<PreviousOperator> list, C15803v vVar, Hostname hostname, TemporalInterval temporalInterval2, LogType logType2, State state2) {
        C17542s.j(str2, "key");
        C17542s.j(str3, "logId");
        C17542s.j(vVar, "url");
        this.description = str;
        this.key = str2;
        this.logId = str3;
        this.maximumMergeDelay = i10;
        this.listOfPreviousOperators = list;
        this.url = vVar;
        this.dns = hostname;
        this.temporalInterval = temporalInterval2;
        this.logType = logType2;
        this.state = state2;
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (str3.length() != 44) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i10 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Log(java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.util.List r19, GK.C15803v r20, com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname r21, com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval r22, com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType r23, com.appmattus.certificatetransparency.internal.loglist.model.v3.State r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0010
            r8 = r2
            goto L_0x0012
        L_0x0010:
            r8 = r19
        L_0x0012:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0018
            r10 = r2
            goto L_0x001a
        L_0x0018:
            r10 = r21
        L_0x001a:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0020
            r11 = r2
            goto L_0x0022
        L_0x0020:
            r11 = r22
        L_0x0022:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0028
            r12 = r2
            goto L_0x002a
        L_0x0028:
            r12 = r23
        L_0x002a:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0030
            r13 = r2
            goto L_0x0032
        L_0x0030:
            r13 = r24
        L_0x0032:
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.internal.loglist.model.v3.Log.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.util.List, GK.v, com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname, com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval, com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType, com.appmattus.certificatetransparency.internal.loglist.model.v3.State, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
