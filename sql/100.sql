use `cjfl`;

DROP TABLE  IF EXISTS material;

create table material(
    `id`      int(4)        not null      auto_increment        comment 'id',
    `name`    varchar(30)   not null                            comment '名称',
    `price`   decimal(5,2)  null          default 0             comment '当日单价/kg',
    primary key (id),
    unique key 'name_key' ('name')
) engine=innodb comment = '基础原材料配置管理';