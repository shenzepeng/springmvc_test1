# springmvc_test1
数据清洗，防止mybatis更新出现将基本变量跟新为0

实体类的成员变量用对象，不能基本类型，要不mybatis会出现，update将值更新为零

返回json的时候，要将对象中的null去掉，在转为json

