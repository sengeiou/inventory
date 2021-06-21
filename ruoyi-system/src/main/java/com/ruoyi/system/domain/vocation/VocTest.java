package com.ruoyi.system.domain.vocation;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by Administrator on 2021-6-21.
 */
@TableName("voc_test")
@Data
public class VocTest
{
    private String id;

    private String testKey;

    private String testValue;
}
