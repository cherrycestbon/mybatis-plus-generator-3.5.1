package com.bettem.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author lenovo
 * @since 2023-02-22
 */
@Getter
@Setter
@TableName("sys_role_dept")
@ApiModel(value = "RoleDept对象", description = "")
public class RoleDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("role_id")
    private String roleId;

    @TableField("dept_id")
    private String deptId;


}
