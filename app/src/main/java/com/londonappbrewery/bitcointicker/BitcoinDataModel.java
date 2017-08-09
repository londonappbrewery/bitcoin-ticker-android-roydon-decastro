package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Roydon on 8/9/2017.
 */

public class BitcoinDataModel {

    private String mAsk;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try {

            BitcoinDataModel bitCoinData = new BitcoinDataModel();
            bitCoinData.mAsk = jsonObject.getString("ask");
            return  bitCoinData;

        } catch (JSONException e){
            e.printStackTrace();
            return null;

        }
    }

    public String getAsk() {
        return mAsk;
    }
}
