package com.ruoyi.web.controller.vocation;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.service.vocation.IVocTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021-6-21.
 */
@RestController
@RequestMapping("/test")
public class VocTestController
{
    @Autowired
    private IVocTestService vocTestService;

    @GetMapping("/call")
    public AjaxResult call()
    {
        return vocTestService.call();
    }
}
