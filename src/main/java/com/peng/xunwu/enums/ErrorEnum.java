package com.peng.xunwu.enums;

import lombok.Getter;

/**
 * @program: xunwu
 * @description: 错误类型枚举
 * @author: peng
 * @create: 2019-01-26 22:50
 **/

@Getter
public enum ErrorEnum {
    SERVER_ERROR(10001, "服务器忙，请稍后再试"),
    PARAM_ERROR(10002, "非法请求"),
    SIGN_ERROR(10003, "非法参数签名"),
    USER_NOT_EXIST(10004, "用户不存在"),
    USER_BAN(10005, "由于您违反洞规，账号已被禁用"),
    TIME_ERROR(10006, "请核对系统时间"),
    AUTH_ERROR(10007, "鉴权失败"),
    VERSION_ERROR(10007, "请升级新版本"),
    OPERATE_FAST(10008, "操作过快，请稍后重试"),
    OPERATE_TIMEOUT(10009, "操作超时"),
    OPERATE_GUEST_NOT_ALLOW(10010, "请登录后再操作"),
    USER_NICKNAME_EXIST(10011, "昵称重复，请重新输入"),
    USER_SEX_FAIL(10012, "性别不支持修改"),
    USER_NICKNAME_FAIL(10013, "昵称违规, 请重新输入"),
    DATA_ERROR(10014, "数据错误"),
    PHONENUM_FAIL(10015, "该手机号未注册"),
    MYSIGN_FAIL(10016, "个性签名包含敏感内容"),
    USER_NOT_VIP(10017, "您还不是VIP哦~"),
    USER_SHAKE_FAIL(10018, "摇一摇次数用完，请明天再来"),
    BAD_REQUEST(10019, "功能暂时不可用"),
    USER_DISABLE(10020, "该用户被关小黑屋~"),
    MY_SIGN_RISK_FAIL(10021, "个性签名违规, 请重新输入"),
    EMAIL_FAIL(10022, "该邮箱未注册"),
    PHONENUM_EXITS(10023, "手机号已被使用，请更换其他手机号"),
    HEAD_RISK_FAIL(10024,"头像违规，上传失败"),
    FUNCTION_NOT_SUPPORT(10025, "功能暂不开放"),
    PERMISSION_ERROR(10026, "权限错误");

    private Integer code;
    private String message;
    ErrorEnum(Integer code ,String msg){
        this.code = code ;
        this.message = msg;
    }


}
