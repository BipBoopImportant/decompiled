package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/KreativEntry;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Open", "Intro", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum KreativEntry implements Event {
    Open;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/KreativEntry$Intro;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "View", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Intro implements Event {
        View;

        static {
            Intro[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Intro> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    static {
        KreativEntry[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<KreativEntry> getEntries() {
        return $ENTRIES;
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
