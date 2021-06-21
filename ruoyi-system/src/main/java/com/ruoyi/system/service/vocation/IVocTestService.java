package com.ruoyi.system.service.vocation;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.vocation.VocTest;

/**
 * Created by Administrator on 2021-6-21.
 */
public interface IVocTestService extends IService<VocTest>
{
    AjaxResult call();
}
