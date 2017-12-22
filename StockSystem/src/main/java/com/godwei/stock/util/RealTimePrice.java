package com.godwei.stock.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class RealTimePrice {
    public Map<String,Object> getPriceList(String json) throws Exception{
        Map<String,Object> map = new HashMap<>();
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONArray result = jsonObject.getJSONArray("result");
        JSONObject data = result.getJSONObject(0);
        JSONObject priceData = data.getJSONObject("data");
        BigDecimal[] buyPrice = new BigDecimal[6];
        Integer[] buy = new Integer[6];
        BigDecimal[] sellPrice = new BigDecimal[6];
        Integer[] sell = new Integer[6];
        buyPrice[1] =new BigDecimal((String) priceData.get("buyOnePri"));
        buyPrice[2] =new BigDecimal((String) priceData.get("buyTwoPri"));
        buyPrice[3] =new BigDecimal((String) priceData.get("buyThreePri"));
        buyPrice[4] =new BigDecimal((String) priceData.get("buyFourPri"));
        buyPrice[5] =new BigDecimal((String) priceData.get("buyFivePri"));
        buy[1] = new Integer((String) priceData.get("buyOne"));
        buy[2] = new Integer((String) priceData.get("buyTwo"));
        buy[3] = new Integer((String) priceData.get("buyThree"));
        buy[4] = new Integer((String) priceData.get("buyFour"));
        buy[5] = new Integer((String) priceData.get("buyFive"));
        sellPrice[1] = new BigDecimal((String) priceData.get("sellOnePri"));
        sellPrice[2] = new BigDecimal((String) priceData.get("sellTwoPri"));
        sellPrice[3] = new BigDecimal((String) priceData.get("sellThreePri"));
        sellPrice[4] = new BigDecimal((String) priceData.get("sellFourPri"));
        sellPrice[5] = new BigDecimal((String) priceData.get("sellFivePri"));
        sell[1] = new Integer((String)priceData.get("sellOne"));
        sell[2] = new Integer((String)priceData.get("sellTwo"));
        sell[3] = new Integer((String)priceData.get("sellThree"));
        sell[4] = new Integer((String)priceData.get("sellFour"));
        sell[5] = new Integer((String)priceData.get("sellFive"));
        map.put("buyPrice",buyPrice);
        map.put("sellPrice",sellPrice);
        map.put("buy",buy);
        map.put("sell",sell);
        return map;
    }

    public static void main(String[] args) {
        HttpUtil httpUtil = new HttpUtil();
        RealTimePrice realTimePrice = new RealTimePrice();
        String url = "http://web.juhe.cn:8080/finance/stock/hs";
        String para = "gid=sz002651&type=&key=6ca6871bfb17a418d7e3fc54912d6b1d";

        String sr=httpUtil.sendGet(url,para);
        try {
            realTimePrice.getPriceList(sr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
