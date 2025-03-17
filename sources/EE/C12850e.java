package EE;

import com.optimizely.ab.event.internal.payload.Attribute;
import com.optimizely.ab.event.internal.payload.Decision;
import com.optimizely.ab.event.internal.payload.Event;
import com.optimizely.ab.event.internal.payload.EventBatch;
import com.optimizely.ab.event.internal.payload.Snapshot;
import com.optimizely.ab.event.internal.payload.Visitor;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/* renamed from: EE.e  reason: case insensitive filesystem */
class C12850e implements C12852g {
    C12850e() {
    }

    private JSONObject b(Decision decision) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", decision.getCampaignId());
        if (decision.getExperimentId() != null) {
            jSONObject.put("experiment_id", decision.getExperimentId());
        }
        if (decision.getVariationId() != null) {
            jSONObject.put("variation_id", decision.getVariationId());
        }
        jSONObject.put("is_campaign_holdback", Boolean.valueOf(decision.getIsCampaignHoldback()));
        return jSONObject;
    }

    private JSONArray c(List<Decision> list) {
        JSONArray jSONArray = new JSONArray();
        for (Decision b10 : list) {
            jSONArray.add(b(b10));
        }
        return jSONArray;
    }

    private JSONObject d(Event event) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", Long.valueOf(event.getTimestamp()));
        jSONObject.put("uuid", event.getUuid());
        jSONObject.put("key", event.getKey());
        if (event.getEntityId() != null) {
            jSONObject.put("entity_id", event.getEntityId());
        }
        if (event.getQuantity() != null) {
            jSONObject.put("quantity", event.getQuantity());
        }
        if (event.getRevenue() != null) {
            jSONObject.put("revenue", event.getRevenue());
        }
        if (event.getTags() != null) {
            jSONObject.put("tags", k(event.getTags()));
        }
        if (event.getType() != null) {
            jSONObject.put("type", event.getType());
        }
        if (event.getValue() != null) {
            jSONObject.put("value", event.getValue());
        }
        return jSONObject;
    }

    private JSONObject e(EventBatch eventBatch) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("account_id", eventBatch.getAccountId());
        jSONObject.put("enrich_decisions", eventBatch.getEnrichDecisions());
        jSONObject.put("visitors", m(eventBatch.getVisitors()));
        if (eventBatch.getAnonymizeIp() != null) {
            jSONObject.put("anonymize_ip", eventBatch.getAnonymizeIp());
        }
        if (eventBatch.getClientName() != null) {
            jSONObject.put("client_name", eventBatch.getClientName());
        }
        if (eventBatch.getClientVersion() != null) {
            jSONObject.put("client_version", eventBatch.getClientVersion());
        }
        if (eventBatch.getProjectId() != null) {
            jSONObject.put("project_id", eventBatch.getProjectId());
        }
        if (eventBatch.getRevision() != null) {
            jSONObject.put("revision", eventBatch.getRevision());
        }
        return jSONObject;
    }

    private JSONArray f(List<Event> list) {
        JSONArray jSONArray = new JSONArray();
        for (Event d10 : list) {
            jSONArray.add(d(d10));
        }
        return jSONArray;
    }

    private JSONObject g(Attribute attribute) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", attribute.getType());
        jSONObject.put("value", attribute.getValue());
        if (attribute.getEntityId() != null) {
            jSONObject.put("entity_id", attribute.getEntityId());
        }
        if (attribute.getKey() != null) {
            jSONObject.put("key", attribute.getKey());
        }
        return jSONObject;
    }

    private JSONArray h(List<Attribute> list) {
        JSONArray jSONArray = new JSONArray();
        for (Attribute g10 : list) {
            jSONArray.add(g(g10));
        }
        return jSONArray;
    }

    private JSONObject i(Snapshot snapshot) {
        JSONObject jSONObject = new JSONObject();
        if (snapshot.getDecisions() != null) {
            jSONObject.put("decisions", c(snapshot.getDecisions()));
        }
        jSONObject.put("events", f(snapshot.getEvents()));
        return jSONObject;
    }

    private JSONArray j(List<Snapshot> list) {
        JSONArray jSONArray = new JSONArray();
        for (Snapshot i10 : list) {
            jSONArray.add(i(i10));
        }
        return jSONArray;
    }

    private JSONArray k(Map<String, ?> map) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                new JSONObject().put(next.getKey(), next.getValue());
            }
        }
        return jSONArray;
    }

    private JSONObject l(Visitor visitor) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("visitor_id", visitor.getVisitorId());
        if (visitor.getSessionId() != null) {
            jSONObject.put("session_id", visitor.getSessionId());
        }
        if (visitor.getAttributes() != null) {
            jSONObject.put("attributes", h(visitor.getAttributes()));
        }
        jSONObject.put("snapshots", j(visitor.getSnapshots()));
        return jSONObject;
    }

    private JSONArray m(List<Visitor> list) {
        JSONArray jSONArray = new JSONArray();
        for (Visitor l10 : list) {
            jSONArray.add(l(l10));
        }
        return jSONArray;
    }

    public <T> String a(T t10) {
        return e((EventBatch) t10).toJSONString();
    }
}
