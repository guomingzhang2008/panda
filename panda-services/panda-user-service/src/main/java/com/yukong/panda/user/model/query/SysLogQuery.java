package com.yukong.panda.user.model.query;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yukong.panda.user.model.entity.SysLog;
import com.yukong.panda.user.model.entity.SysRole;
import lombok.Data;

/**
 * @author: yukong
 * @date: 2018/11/1 17:20
 */
@Data
public class SysLogQuery extends Page<SysLog> {


    /**
     * 主键
     */
    private Long id;

    /**
     * 日志类型
     */
    private String type;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 操作状态 1 失败  0 成功
     */
    private String status;

    /**
     * 创建者
     */
    private String createBy;

}
