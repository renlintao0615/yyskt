package com.yyskt.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 任林涛
 * @since 2020-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
   
    private String userName;
   
    private String password;
   
    private Boolean isValid;
   
    private LocalDateTime createTime;


}
