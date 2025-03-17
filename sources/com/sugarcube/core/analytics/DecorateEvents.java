package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/DecorateEvents;", "Lcom/sugarcube/core/analytics/Event;", "<init>", "()V", "Scene", "Model", "Composition", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorateEvents implements Event {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/DecorateEvents$Composition;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "UnpackTime", "SaveTime", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Composition implements Event {
        UnpackTime,
        SaveTime;

        static {
            Composition[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Composition> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/DecorateEvents$Model;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "UnpackTime", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Model implements Event {
        UnpackTime;

        static {
            Model[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Model> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/DecorateEvents$Scene;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "UnpackTime", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Scene implements Event {
        UnpackTime;

        static {
            Scene[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Scene> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
