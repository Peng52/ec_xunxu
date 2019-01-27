package com.peng.xunwu.util;

import com.peng.xunwu.enums.ErrorEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: xunwu
 * @description: API数据格式标准
 * @author: peng
 * @create: 2019-01-26 22:48
 **/
public class R extends HashMap<String, Object> {

    //为什么要定义一个Map,就是用来装最后的返回给前端的结果
    //结果都塞到这个map 集合中去，
    //其实你在想想 返回去的Json的数据格式，就能清楚知道这样设计返回的格式
    private Map<String, Object> result = new HashMap<>();
    //构造方法对对象初始化

    public R() {
        this.put("code", 200);
        this.put("timeStamp", System.currentTimeMillis());
    }
    //返回异常信息的格式
    public static R error(ErrorEnum errorEnum){
        R r = new R();
        r.put("code",500);
        r.put("errorCode",errorEnum.getCode());
        r.put("errorMessage",errorEnum.getMessage());
        return r;
    }
    //异常
    public static R error(int code ,String message){
        R r = new R();
        r.put("code",500);
        r.put("errorCode",code);
        r.put("errorMessage",message);
        return r;


    }

    //正常返回 没有result结果
    public static R ok() {
        return new R();
    }

    //自定义信息的正常返回  result : message
    public static R ok(String msg) {
        R r = new R();
        r.putMap("message",msg);
        return r;
    }
    // 接受Map()
    public R ok(Map<String,Object> map){
        R r = new R();
        r.result.putAll(map);//
        r.put("result",result);
        return r;
    }

    //最后返回的结果以  key ,  value 的形式传递个前端
    public R putMap(String key, Object value) {
        this.result.put(key, value);
        this.put("result", result);
        return this;
    }
}
