package com.ruoyi.system.service.vocation.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.system.domain.vocation.VocTest;
import com.ruoyi.system.mapper.vocation.VocTestMapper;
import com.ruoyi.system.service.vocation.IVocTestService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2021-6-21.
 */
@Service
public class VocTestServiceImpl extends ServiceImpl<VocTestMapper,VocTest> implements IVocTestService
{
    @Override
    public AjaxResult call()
    {
        VocTest vocTest = new VocTest();
        vocTest.setId(IdUtils.fastSimpleUUID());
        vocTest.setTestKey("test_key");
        vocTest.setTestValue("test_value");
        super.save(vocTest);
        return AjaxResult.success();
    }
}
