use `cjfl`;

DROP TABLE  IF EXISTS material;
DROP TABLE  IF EXISTS product;
DROP TABLE  IF EXISTS project_material;

create table material(
    `id`      int(4)        not null      auto_increment        comment 'id',
    `name`    varchar(30)   not null                            comment '名称',
    `price`   decimal(5,2)  null          default 0             comment '当日单价/kg',
    `status`  int(1)        not null      default 1             comment '状态',
    `create_time`       datetime    default        CURRENT_TIMESTAMP     comment '创建时间',
    `update_by`         varchar(64)     default ''                 comment '更新者',
    `update_time`       datetime     default      CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP      comment '更新时间',
    primary key (id),
    unique key 'name_key' ('name')
) engine=innodb comment = '基础原材料配置管理';


create table product(
     `id`      int(4)        not null      auto_increment        comment 'id',
     `name`    varchar(30)   not null                            comment '产品名称',
     `status`  int(1)        not null      default 1             comment '状态',
     `create_time`       datetime    default        CURRENT_TIMESTAMP     comment '创建时间',
     `update_by`         varchar(64)     default ''                 comment '更新者',
     `update_time`       datetime     default      CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP      comment '更新时间',
     primary key (id),
     unique key 'name_key' ('name')
) engine=innodb comment = '产品配置管理';


create table project_material(
         `project_id`    varchar(30)   not null                            comment '产品id',
         `material_id`   decimal(5,2)  null          default 0             comment '物料id',
) engine=innodb comment = '产品和物料关系中间表';