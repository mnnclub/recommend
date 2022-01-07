package com.ott.recommend;

import java.util.Map;

public class BestOTT {
    private Map<String, String> bestOTTData;

    public Map<String, String> getBestOTTData() {
        return bestOTTData;
    }

    public void setBestOTTData(Map<String, String> bestOTTData) {
        this.bestOTTData = bestOTTData;
    }

    public String getBestOTT(String id) {
        return bestOTTData.get(id);
    }
}
