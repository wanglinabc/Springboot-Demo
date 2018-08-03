package com.example.demo.Service;


import com.example.demo.Util.ResponseResult;

public interface IProxyReferrerAwardService {

    /**
     *  设置代理商推荐奖励接口
     *
     * @param direct
     * @param doubleindirect
     * @param indirect
     * @param doubleindirect
     * @return tripleindirect
     */
    public ResponseResult setProxy(double direct, double doubleindirect, double indirect, double tripleindirect);

}
