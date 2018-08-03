package com.example.demo.Service.Impl;

import com.example.demo.Dao.ProxyReferrerAwardMapper;
import com.example.demo.Entity.ProxyReferrerAward;
import com.example.demo.Service.IProxyReferrerAwardService;
import com.example.demo.Util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "ProxyReferrerAwardService")
public class ProxyReferrerAwardServiceImpl implements IProxyReferrerAwardService {

    @Autowired
    private ProxyReferrerAwardMapper proxyMapper;

    /**
     *  设置代理商推荐奖励接口
     *
     * @param direct
     * @param doubleindirect
     * @param indirect
     * @param doubleindirect
     * @return tripleindirect
     */
    @Override
    public ResponseResult setProxy(double direct, double doubleindirect, double indirect, double tripleindirect) {
        if ("".equals(direct) || "".equals(doubleindirect) || "".equals(indirect) || "".equals(tripleindirect)) {
            return ResponseResult.createByErrorMessage("推荐参数不能够为空");
        }

        ProxyReferrerAward record = new ProxyReferrerAward(direct,doubleindirect,indirect,tripleindirect);
        int proxyId = proxyMapper.insert(record);
        if (proxyId == 0) {
            return ResponseResult.createByErrorMessage("插入数据失败");
        }
        System.out.println("----");
        return ResponseResult.createBySuccessMsgData("设置成功",null);
    }
}
